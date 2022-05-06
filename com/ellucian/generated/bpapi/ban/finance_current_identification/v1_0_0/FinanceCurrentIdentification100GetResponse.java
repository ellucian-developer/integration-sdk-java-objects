
package com.ellucian.generated.bpapi.ban.finance_current_identification.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "spriden_current",
    "spriden_previous"
})
@Generated("jsonschema2pojo")
public class FinanceCurrentIdentification100GetResponse {

    @JsonProperty("spriden_current")
    private List<SpridenCurrent> spridenCurrent = new ArrayList<SpridenCurrent>();
    @JsonProperty("spriden_previous")
    private List<SpridenPreviou> spridenPrevious = new ArrayList<SpridenPreviou>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("spriden_current")
    public List<SpridenCurrent> getSpridenCurrent() {
        return spridenCurrent;
    }

    @JsonProperty("spriden_current")
    public void setSpridenCurrent(List<SpridenCurrent> spridenCurrent) {
        this.spridenCurrent = spridenCurrent;
    }

    public FinanceCurrentIdentification100GetResponse withSpridenCurrent(List<SpridenCurrent> spridenCurrent) {
        this.spridenCurrent = spridenCurrent;
        return this;
    }

    @JsonProperty("spriden_previous")
    public List<SpridenPreviou> getSpridenPrevious() {
        return spridenPrevious;
    }

    @JsonProperty("spriden_previous")
    public void setSpridenPrevious(List<SpridenPreviou> spridenPrevious) {
        this.spridenPrevious = spridenPrevious;
    }

    public FinanceCurrentIdentification100GetResponse withSpridenPrevious(List<SpridenPreviou> spridenPrevious) {
        this.spridenPrevious = spridenPrevious;
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

    public FinanceCurrentIdentification100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceCurrentIdentification100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spridenCurrent");
        sb.append('=');
        sb.append(((this.spridenCurrent == null)?"<null>":this.spridenCurrent));
        sb.append(',');
        sb.append("spridenPrevious");
        sb.append('=');
        sb.append(((this.spridenPrevious == null)?"<null>":this.spridenPrevious));
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
        result = ((result* 31)+((this.spridenCurrent == null)? 0 :this.spridenCurrent.hashCode()));
        result = ((result* 31)+((this.spridenPrevious == null)? 0 :this.spridenPrevious.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceCurrentIdentification100GetResponse) == false) {
            return false;
        }
        FinanceCurrentIdentification100GetResponse rhs = ((FinanceCurrentIdentification100GetResponse) other);
        return ((((this.spridenCurrent == rhs.spridenCurrent)||((this.spridenCurrent!= null)&&this.spridenCurrent.equals(rhs.spridenCurrent)))&&((this.spridenPrevious == rhs.spridenPrevious)||((this.spridenPrevious!= null)&&this.spridenPrevious.equals(rhs.spridenPrevious))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
