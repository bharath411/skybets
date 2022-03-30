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
"livePriceLimit"
})
@Generated("jsonschema2pojo")
public class Liabilities {

@JsonProperty("livePriceLimit")
private Integer livePriceLimit;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("livePriceLimit")
public Integer getLivePriceLimit() {
return livePriceLimit;
}

@JsonProperty("livePriceLimit")
public void setLivePriceLimit(Integer livePriceLimit) {
this.livePriceLimit = livePriceLimit;
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