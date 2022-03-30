
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
    "decimal",
    "num",
    "den"
})
@Generated("jsonschema2pojo")
public class Price {

    @JsonProperty("decimal")
    private String decimal;
    @JsonProperty("num")
    private String num;
    @JsonProperty("den")
    private String den;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("decimal")
    public String getDecimal() {
        return decimal;
    }

    @JsonProperty("decimal")
    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    @JsonProperty("num")
    public String getNum() {
        return num;
    }

    @JsonProperty("num")
    public void setNum(String num) {
        this.num = num;
    }

    @JsonProperty("den")
    public String getDen() {
        return den;
    }

    @JsonProperty("den")
    public void setDen(String den) {
        this.den = den;
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
