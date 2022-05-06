
package com.ellucian.generated.bpapi.ban.athletic_compliance_inquiry.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "current",
    "sport"
})
@Generated("jsonschema2pojo")
public class View {

    /**
     * View Current
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("current")
    private String current;
    /**
     * View Current
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sport")
    private String sport;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * View Current
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("current")
    public String getCurrent() {
        return current;
    }

    /**
     * View Current
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("current")
    public void setCurrent(String current) {
        this.current = current;
    }

    public View withCurrent(String current) {
        this.current = current;
        return this;
    }

    /**
     * View Current
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sport")
    public String getSport() {
        return sport;
    }

    /**
     * View Current
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("sport")
    public void setSport(String sport) {
        this.sport = sport;
    }

    public View withSport(String sport) {
        this.sport = sport;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public View withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(View.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("current");
        sb.append('=');
        sb.append(((this.current == null)?"<null>":this.current));
        sb.append(',');
        sb.append("sport");
        sb.append('=');
        sb.append(((this.sport == null)?"<null>":this.sport));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.current == null)? 0 :this.current.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sport == null)? 0 :this.sport.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof View) == false) {
            return false;
        }
        View rhs = ((View) other);
        return ((((this.current == rhs.current)||((this.current!= null)&&this.current.equals(rhs.current)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sport == rhs.sport)||((this.sport!= null)&&this.sport.equals(rhs.sport))));
    }

}
