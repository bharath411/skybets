
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
    "active",
    "started",
    "live",
    "resulted",
    "finished",
    "cashoutable",
    "displayable",
    "suspended",
    "requestabet"
})
@Generated("jsonschema2pojo")
public class Status {

    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("started")
    private Boolean started;
    @JsonProperty("live")
    private Boolean live;
    @JsonProperty("resulted")
    private Boolean resulted;
    @JsonProperty("finished")
    private Boolean finished;
    @JsonProperty("cashoutable")
    private Boolean cashoutable;
    @JsonProperty("displayable")
    private Boolean displayable;
    @JsonProperty("suspended")
    private Boolean suspended;
    @JsonProperty("requestabet")
    private Boolean requestabet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("started")
    public Boolean getStarted() {
        return started;
    }

    @JsonProperty("started")
    public void setStarted(Boolean started) {
        this.started = started;
    }

    @JsonProperty("live")
    public Boolean getLive() {
        return live;
    }

    @JsonProperty("live")
    public void setLive(Boolean live) {
        this.live = live;
    }

    @JsonProperty("resulted")
    public Boolean getResulted() {
        return resulted;
    }

    @JsonProperty("resulted")
    public void setResulted(Boolean resulted) {
        this.resulted = resulted;
    }

    @JsonProperty("finished")
    public Boolean getFinished() {
        return finished;
    }

    @JsonProperty("finished")
    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    @JsonProperty("cashoutable")
    public Boolean getCashoutable() {
        return cashoutable;
    }

    @JsonProperty("cashoutable")
    public void setCashoutable(Boolean cashoutable) {
        this.cashoutable = cashoutable;
    }

    @JsonProperty("displayable")
    public Boolean getDisplayable() {
        return displayable;
    }

    @JsonProperty("displayable")
    public void setDisplayable(Boolean displayable) {
        this.displayable = displayable;
    }

    @JsonProperty("suspended")
    public Boolean getSuspended() {
        return suspended;
    }

    @JsonProperty("suspended")
    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    @JsonProperty("requestabet")
    public Boolean getRequestabet() {
        return requestabet;
    }

    @JsonProperty("requestabet")
    public void setRequestabet(Boolean requestabet) {
        this.requestabet = requestabet;
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
