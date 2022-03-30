package com.bharath.skybets.stepDef;

import java.util.List;

import org.testng.Assert;

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

public class EventOutcomesStepDef {

	Response response;
	String footballLive;
	String baseUrl;
	
	Response eventResponse;
	Response marketResponse;
	Response outcomeResponseYes;
	Response outcomeResponseNo;
	
	List<Integer> marketIdsList = null;
	List<Integer> outcomesList = null;
	List<Event> eventList = null;
	int bothTeamsToScoreMarketId = 0;
	
	Market__1 marketWithBothTeamsToScore = null;
	@When("fetch marketids for all events")
	public void fetch_marketids_for_all_events() {
		baseUrl = PropertyHandler.get("url");
		footballLive = baseUrl + Constants.FOOTBALL_LIVE;
		response = APIRequest.getRequest(footballLive);
		// Fetch all football events
				Events events = response.body().as(Events.class);
				eventList = events.getEvents();
	}

	public void fetchAllEventstOutcomesWithMarketBothTeamsToScore() {
		
	}
	@Then("Verify each event has market {string}")
	public void verify_each_event_has_market(String bothTeamsToScore) {
		
		// Get each event ID
		for (Event event : eventList) {
			String id = event.getEventId() + "";
			
			// Fetch event for markets
			eventResponse = APIRequest.getRequest(baseUrl + Constants.SPORTSBOOK_EVENT + id);
			Event1 event1 = eventResponse.body().as(Event1.class);
			Event eventSum = event1.getEvent();
			
			// Fetch all marketIds
			 marketIdsList = eventSum.getMarkets();
			 outcomesList = null;
			 bothTeamsToScoreMarketId = 0;
			
			// Iterate through all markets

			for (Integer marketId : marketIdsList) {
				
				// Fetch market details from market Id
				marketResponse = APIRequest.getRequest(baseUrl + Constants.SPORTSBOOK_MARKET + marketId);
				Market__1 market = marketResponse.body().as(Market.class).getMarket();
				String marketName = market.getName();

				// get market and outcomesList for the 'Both Teams To Score' market
			
				if (marketName.equals(bothTeamsToScore)) {
					bothTeamsToScoreMarketId = marketId;
					outcomesList = market.getOutcomes();
					marketWithBothTeamsToScore = market;
					
				}
			}
			

			if (bothTeamsToScoreMarketId == 0) {
				Assert.fail("No market found for - Both Teams To Score");
			}

			if (outcomesList == null) {
				Assert.fail("No outcomes defined for this market");
			}
			

			
		}
		
	}

	@Then("Verify that market has visibility true")
	public void verify_that_market_has_visibility_true() {
	    
		// Validate the visibility of market.
		
		Assert.assertTrue(marketWithBothTeamsToScore.getStatus().getDisplayable(), "Market is not visible.");
	}

	@Then("Verify that market has outcomes {string} and {string}")
	public void verify_that_market_has_outcomes_and(String yes, String no) {
		// Fetch the outcome response and validate 'Yes' & 'No' outcome.
		outcomeResponseYes = APIRequest
				.getRequest(baseUrl + Constants.SPORTSBOOK_OUTCOME + outcomesList.get(0));
		Outcome__1 outcome = outcomeResponseYes.body().as(Outcome.class).getOutcome();
		String outcomeYes = outcome.getName();

		outcomeResponseNo = APIRequest
				.getRequest(baseUrl + Constants.SPORTSBOOK_OUTCOME + outcomesList.get(1));
		outcome = outcomeResponseNo.body().as(Outcome.class).getOutcome();
		String outcomeNo = outcome.getName();

		Assert.assertEquals(outcomeYes, yes, "Outcome Yes is not available in the market");
		Assert.assertEquals(outcomeNo, no, "Outcome Yes is not available in the market");

	}

	
	
}
