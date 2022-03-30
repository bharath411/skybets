
package com.bharath.skybets.pojo;

import java.util.HashMap;
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
    "outcomeId",
    "marketId",
    "eventId",
    "name",
    "displayOrder",
    "result",
    "price",
    "status"
})
@Generated("jsonschema2pojo")
public class Outcome__1 {

    @JsonProperty("outcomeId")
    private Integer outcomeId;
    @JsonProperty("marketId")
    private Integer marketId;
    @JsonProperty("eventId")
    private Integer eventId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("displayOrder")
    private Integer displayOrder;
    @JsonProperty("result")
    private Result result;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("status")
    private Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("outcomeId")
    public Integer getOutcomeId() {
        return outcomeId;
    }

    @JsonProperty("outcomeId")
    public void setOutcomeId(Integer outcomeId) {
        this.outcomeId = outcomeId;
    }

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

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
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
