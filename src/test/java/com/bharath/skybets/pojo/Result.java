
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
    "place",
    "result",
    "favourite"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("place")
    private Integer place;
    @JsonProperty("result")
    private String result;
    @JsonProperty("favourite")
    private Boolean favourite;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("place")
    public Integer getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Integer place) {
        this.place = place;
    }

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("favourite")
    public Boolean getFavourite() {
        return favourite;
    }

    @JsonProperty("favourite")
    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
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
