package com.bharath.skybets.stepDef;

import java.util.List;

import org.testng.Assert;

import com.bharath.skybets.pojo.Competitor;
import com.bharath.skybets.pojo.Event;
import com.bharath.skybets.pojo.Event1;
import com.bharath.skybets.pojo.Events;
import com.bharath.skybets.pojo.Market;
import com.bharath.skybets.pojo.Market__1;
import com.bharath.skybets.pojo.Outcome;
import com.bharath.skybets.pojo.Outcome__1;
import com.bharath.skybets.utils.APIRequest;
import com.bharath.skybets.utils.Constants;
import com.bharath.skybets.utils.PropertyHandler;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class FootballEventStepDef {

	Response response;
	String footballLive;
	String baseUrl;

	@When("I get all football events information")
	public void i_get_all_football_events_information() {
		baseUrl = PropertyHandler.get("url");
		footballLive = baseUrl + Constants.FOOTBALL_LIVE;
		response = APIRequest.getRequest(footballLive);
	}

	@Then("Verify that all className property are {string}")
	public void verify_that_all_class_name_property_are(String className) {

		Events events = response.body().as(Events.class);

		List<Event> eventList = events.getEvents();

		for (Event event : eventList) {
			Assert.assertEquals(event.getClassName(), className, "Event Class name " + className + " doesn't match");
		}

	}

	@Then("Status code should be {int}")
	public void status_code_should_be(int expectedStatusCode) {
		Assert.assertEquals(expectedStatusCode, response.statusCode());
	}

	@Then("Verify that there is a ‘home’ and an ‘away’ competitor for each of the events")
	public void verify_that_there_is_a_home_and_an_away_competitor_for_each_of_the_events() {

		Events events = response.body().as(Events.class);
		List<Event> eventList = events.getEvents();

		for (Event event : eventList) {

			List<Competitor> competitors = event.getCompetitors();
			// Fetch position and validate with home and away
			Assert.assertEquals("home", competitors.get(0).getPosition());
			Assert.assertEquals("away", competitors.get(1).getPosition());
		}

		verifyTask2();
	}

	public void verifyTask2() {

		// Fetch all football events
		Events events = response.body().as(Events.class);
		List<Event> eventList = events.getEvents();

		// Get each event ID
		for (Event event : eventList) {
			String id = event.getEventId() + "";
			
			// Fetch event for markets
			Response response = APIRequest.getRequest(baseUrl + Constants.SPORTSBOOK_EVENT + id);
			Event1 event1 = response.body().as(Event1.class);
			Event eventSum = event1.getEvent();
			
			// Fetch all marketIds
			List<Integer> marketIdsList = eventSum.getMarkets();
			List<Integer> outcomesList = null;
			int bothTeamsToScoreMarketId = 0;
			
			// Iterate through all markets

			for (Integer marketId : marketIdsList) {
				
				// Fetch market details from market Id
				Response marketResponse = APIRequest.getRequest(baseUrl + Constants.SPORTSBOOK_MARKET + marketId);
				Market__1 market = marketResponse.body().as(Market.class).getMarket();
				String marketName = market.getName();

				// get market and outcomesList for the 'Both Teams To Score' market
			
				if (marketName.equals("Both Teams To Score")) {
					bothTeamsToScoreMarketId = marketId;
					outcomesList = market.getOutcomes();
					
					// Validate the visibility of market.
					
					Assert.assertTrue(market.getStatus().getDisplayable(), "Market is not visible.");
				}
			}

			if (bothTeamsToScoreMarketId == 0) {
				Assert.fail("No market found for - Both Teams To Score");
			}

			if (outcomesList == null) {
				Assert.fail("No outcomes defined for this market");
			}

			// Fetch the outcome response and validate 'Yes' & 'No' outcome.
			Response outcomeResponseYes = APIRequest
					.getRequest(baseUrl + Constants.SPORTSBOOK_OUTCOME + outcomesList.get(0));
			Outcome__1 outcome = outcomeResponseYes.body().as(Outcome.class).getOutcome();
			String outcomeYes = outcome.getName();

			Response outcomeResponseNo = APIRequest
					.getRequest(baseUrl + Constants.SPORTSBOOK_OUTCOME + outcomesList.get(1));
			outcome = outcomeResponseNo.body().as(Outcome.class).getOutcome();
			String outcomeNo = outcome.getName();

			Assert.assertEquals(outcomeYes, "Yes", "Outcome Yes is not available in the market");
			Assert.assertEquals(outcomeNo, "No", "Outcome Yes is not available in the market");
		}

	}

}
