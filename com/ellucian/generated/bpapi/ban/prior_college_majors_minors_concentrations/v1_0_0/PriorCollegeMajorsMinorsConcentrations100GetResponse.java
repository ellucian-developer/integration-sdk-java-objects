
package com.ellucian.generated.bpapi.ban.prior_college_majors_minors_concentrations.v1_0_0;

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
    "sorconc",
    "sormajr",
    "sorminr"
})
@Generated("jsonschema2pojo")
public class PriorCollegeMajorsMinorsConcentrations100GetResponse {

    @JsonProperty("sorconc")
    private List<Sorconc> sorconc = new ArrayList<Sorconc>();
    @JsonProperty("sormajr")
    private List<Sormajr> sormajr = new ArrayList<Sormajr>();
    @JsonProperty("sorminr")
    private List<Sorminr> sorminr = new ArrayList<Sorminr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorconc")
    public List<Sorconc> getSorconc() {
        return sorconc;
    }

    @JsonProperty("sorconc")
    public void setSorconc(List<Sorconc> sorconc) {
        this.sorconc = sorconc;
    }

    public PriorCollegeMajorsMinorsConcentrations100GetResponse withSorconc(List<Sorconc> sorconc) {
        this.sorconc = sorconc;
        return this;
    }

    @JsonProperty("sormajr")
    public List<Sormajr> getSormajr() {
        return sormajr;
    }

    @JsonProperty("sormajr")
    public void setSormajr(List<Sormajr> sormajr) {
        this.sormajr = sormajr;
    }

    public PriorCollegeMajorsMinorsConcentrations100GetResponse withSormajr(List<Sormajr> sormajr) {
        this.sormajr = sormajr;
        return this;
    }

    @JsonProperty("sorminr")
    public List<Sorminr> getSorminr() {
        return sorminr;
    }

    @JsonProperty("sorminr")
    public void setSorminr(List<Sorminr> sorminr) {
        this.sorminr = sorminr;
    }

    public PriorCollegeMajorsMinorsConcentrations100GetResponse withSorminr(List<Sorminr> sorminr) {
        this.sorminr = sorminr;
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

    public PriorCollegeMajorsMinorsConcentrations100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriorCollegeMajorsMinorsConcentrations100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorconc");
        sb.append('=');
        sb.append(((this.sorconc == null)?"<null>":this.sorconc));
        sb.append(',');
        sb.append("sormajr");
        sb.append('=');
        sb.append(((this.sormajr == null)?"<null>":this.sormajr));
        sb.append(',');
        sb.append("sorminr");
        sb.append('=');
        sb.append(((this.sorminr == null)?"<null>":this.sorminr));
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
        result = ((result* 31)+((this.sormajr == null)? 0 :this.sormajr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorconc == null)? 0 :this.sorconc.hashCode()));
        result = ((result* 31)+((this.sorminr == null)? 0 :this.sorminr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriorCollegeMajorsMinorsConcentrations100GetResponse) == false) {
            return false;
        }
        PriorCollegeMajorsMinorsConcentrations100GetResponse rhs = ((PriorCollegeMajorsMinorsConcentrations100GetResponse) other);
        return (((((this.sormajr == rhs.sormajr)||((this.sormajr!= null)&&this.sormajr.equals(rhs.sormajr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorconc == rhs.sorconc)||((this.sorconc!= null)&&this.sorconc.equals(rhs.sorconc))))&&((this.sorminr == rhs.sorminr)||((this.sorminr!= null)&&this.sorminr.equals(rhs.sorminr))));
    }

}
