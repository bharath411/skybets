
package com.bharath.skybets.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "eventId", "name", "displayOrder", "sort", "linkedEventId", "classId", "className", "typeId",
		"typeName", "linkedEventTypeId", "linkedEventTypeName", "startTime", "scores", "competitors", "status",
		"boostCount", "superBoostCount", "markets" })
@Generated("jsonschema2pojo")
public class Event {

	@JsonProperty("eventId")
	private Integer eventId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("displayOrder")
	private Integer displayOrder;
	@JsonProperty("sort")
	private String sort;
	@JsonProperty("linkedEventId")
	private Integer linkedEventId;
	@JsonProperty("classId")
	private Integer classId;
	@JsonProperty("className")
	private String className;
	@JsonProperty("typeId")
	private Integer typeId;
	@JsonProperty("typeName")
	private String typeName;
	@JsonProperty("linkedEventTypeId")
	private Integer linkedEventTypeId;
	@JsonProperty("linkedEventTypeName")
	private String linkedEventTypeName;
	@JsonProperty("startTime")
	private String startTime;
	@JsonProperty("scores")
	private Scores scores;
	@JsonProperty("competitors")
	private List<Competitor> competitors = null;
	@JsonProperty("status")
	private Status status;
	@JsonProperty("boostCount")
	private Integer boostCount;
	@JsonProperty("superBoostCount")
	private Integer superBoostCount;
	@JsonProperty("markets")
	private List<Integer> markets = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("eventId")
	public Integer getEventId() {
		return eventId;
	}

	@JsonProperty("eventId")
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("displayOrder")
	public Integer getDisplayOrder() {
		return displayOrder;
	}

	@JsonProperty("displayOrder")
	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	@JsonProperty("sort")
	public String getSort() {
		return sort;
	}

	@JsonProperty("sort")
	public void setSort(String sort) {
		this.sort = sort;
	}

	@JsonProperty("linkedEventId")
	public Integer getLinkedEventId() {
		return linkedEventId;
	}

	@JsonProperty("linkedEventId")
	public void setLinkedEventId(Integer linkedEventId) {
		this.linkedEventId = linkedEventId;
	}

	@JsonProperty("classId")
	public Integer getClassId() {
		return classId;
	}

	@JsonProperty("classId")
	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@JsonProperty("className")
	public String getClassName() {
		return className;
	}

	@JsonProperty("className")
	public void setClassName(String className) {
		this.className = className;
	}

	@JsonProperty("typeId")
	public Integer getTypeId() {
		return typeId;
	}

	@JsonProperty("typeId")
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@JsonProperty("typeName")
	public String getTypeName() {
		return typeName;
	}

	@JsonProperty("typeName")
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@JsonProperty("linkedEventTypeId")
	public Integer getLinkedEventTypeId() {
		return linkedEventTypeId;
	}

	@JsonProperty("linkedEventTypeId")
	public void setLinkedEventTypeId(Integer linkedEventTypeId) {
		this.linkedEventTypeId = linkedEventTypeId;
	}

	@JsonProperty("linkedEventTypeName")
	public String getLinkedEventTypeName() {
		return linkedEventTypeName;
	}

	@JsonProperty("linkedEventTypeName")
	public void setLinkedEventTypeName(String linkedEventTypeName) {
		this.linkedEventTypeName = linkedEventTypeName;
	}

	@JsonProperty("startTime")
	public String getStartTime() {
		return startTime;
	}

	@JsonProperty("startTime")
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@JsonProperty("scores")
	public Scores getScores() {
		return scores;
	}

	@JsonProperty("scores")
	public void setScores(Scores scores) {
		this.scores = scores;
	}

	@JsonProperty("competitors")
	public List<Competitor> getCompetitors() {
		return competitors;
	}

	@JsonProperty("competitors")
	public void setCompetitors(List<Competitor> competitors) {
		this.competitors = competitors;
	}

	@JsonProperty("status")
	public Status getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Status status) {
		this.status = status;
	}

	@JsonProperty("boostCount")
	public Integer getBoostCount() {
		return boostCount;
	}

	@JsonProperty("boostCount")
	public void setBoostCount(Integer boostCount) {
		this.boostCount = boostCount;
	}

	@JsonProperty("superBoostCount")
	public Integer getSuperBoostCount() {
		return superBoostCount;
	}

	@JsonProperty("superBoostCount")
	public void setSuperBoostCount(Integer superBoostCount) {
		this.superBoostCount = superBoostCount;
	}

	@JsonProperty("markets")
	public List<Integer> getMarkets() {
		return markets;
	}

	@JsonProperty("markets")
	public void setMarkets(List<Integer> markets) {
		this.markets = markets;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
