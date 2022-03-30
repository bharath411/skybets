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
@JsonPropertyOrder({
"marketId",
"eventId",
"name",
"displayOrder",
"type",
"status",
"liabilities",
"spAvail",
"outcomes"
})
@Generated("jsonschema2pojo")
public class Market__1 {

@JsonProperty("marketId")
private Integer marketId;
@JsonProperty("eventId")
private Integer eventId;
@JsonProperty("name")
private String name;
@JsonProperty("displayOrder")
private Integer displayOrder;
@JsonProperty("type")
private String type;
@JsonProperty("status")
private Status status;
@JsonProperty("liabilities")
private Liabilities liabilities;
@JsonProperty("spAvail")
private Boolean spAvail;
@JsonProperty("outcomes")
private List<Integer> outcomes = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("marketId")
public Integer getMarketId() {
return marketId;
}

@JsonProperty("marketId")
public void setMarketId(Integer marketId) {
this.marketId = marketId;
}

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

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("status")
public Status getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(Status status) {
this.status = status;
}

@JsonProperty("liabilities")
public Liabilities getLiabilities() {
return liabilities;
}

@JsonProperty("liabilities")
public void setLiabilities(Liabilities liabilities) {
this.liabilities = liabilities;
}

@JsonProperty("spAvail")
public Boolean getSpAvail() {
return spAvail;
}

@JsonProperty("spAvail")
public void setSpAvail(Boolean spAvail) {
this.spAvail = spAvail;
}

@JsonProperty("outcomes")
public List<Integer> getOutcomes() {
return outcomes;
}

@JsonProperty("outcomes")
public void setOutcomes(List<Integer> outcomes) {
this.outcomes = outcomes;
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
