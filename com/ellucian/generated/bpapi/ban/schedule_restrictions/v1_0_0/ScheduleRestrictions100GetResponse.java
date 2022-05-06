
package com.ellucian.generated.bpapi.ban.schedule_restrictions.v1_0_0;

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
    "scrrcmp",
    "scrrtrm"
})
@Generated("jsonschema2pojo")
public class ScheduleRestrictions100GetResponse {

    @JsonProperty("scrrcmp")
    private List<Scrrcmp> scrrcmp = new ArrayList<Scrrcmp>();
    @JsonProperty("scrrtrm")
    private List<Scrrtrm> scrrtrm = new ArrayList<Scrrtrm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrrcmp")
    public List<Scrrcmp> getScrrcmp() {
        return scrrcmp;
    }

    @JsonProperty("scrrcmp")
    public void setScrrcmp(List<Scrrcmp> scrrcmp) {
        this.scrrcmp = scrrcmp;
    }

    public ScheduleRestrictions100GetResponse withScrrcmp(List<Scrrcmp> scrrcmp) {
        this.scrrcmp = scrrcmp;
        return this;
    }

    @JsonProperty("scrrtrm")
    public List<Scrrtrm> getScrrtrm() {
        return scrrtrm;
    }

    @JsonProperty("scrrtrm")
    public void setScrrtrm(List<Scrrtrm> scrrtrm) {
        this.scrrtrm = scrrtrm;
    }

    public ScheduleRestrictions100GetResponse withScrrtrm(List<Scrrtrm> scrrtrm) {
        this.scrrtrm = scrrtrm;
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

    public ScheduleRestrictions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleRestrictions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrcmp");
        sb.append('=');
        sb.append(((this.scrrcmp == null)?"<null>":this.scrrcmp));
        sb.append(',');
        sb.append("scrrtrm");
        sb.append('=');
        sb.append(((this.scrrtrm == null)?"<null>":this.scrrtrm));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrcmp == null)? 0 :this.scrrcmp.hashCode()));
        result = ((result* 31)+((this.scrrtrm == null)? 0 :this.scrrtrm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleRestrictions100GetResponse) == false) {
            return false;
        }
        ScheduleRestrictions100GetResponse rhs = ((ScheduleRestrictions100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.scrrcmp == rhs.scrrcmp)||((this.scrrcmp!= null)&&this.scrrcmp.equals(rhs.scrrcmp))))&&((this.scrrtrm == rhs.scrrtrm)||((this.scrrtrm!= null)&&this.scrrtrm.equals(rhs.scrrtrm))));
    }

}
