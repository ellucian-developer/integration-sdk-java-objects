
package com.ellucian.generated.bpapi.ban.prior_college_prior_college_and_degree.v1_0_0;

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
    "sordegr",
    "sorpcol"
})
@Generated("jsonschema2pojo")
public class PriorCollegePriorCollegeAndDegree100GetResponse {

    @JsonProperty("sordegr")
    private List<Sordegr> sordegr = new ArrayList<Sordegr>();
    @JsonProperty("sorpcol")
    private List<Sorpcol> sorpcol = new ArrayList<Sorpcol>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sordegr")
    public List<Sordegr> getSordegr() {
        return sordegr;
    }

    @JsonProperty("sordegr")
    public void setSordegr(List<Sordegr> sordegr) {
        this.sordegr = sordegr;
    }

    public PriorCollegePriorCollegeAndDegree100GetResponse withSordegr(List<Sordegr> sordegr) {
        this.sordegr = sordegr;
        return this;
    }

    @JsonProperty("sorpcol")
    public List<Sorpcol> getSorpcol() {
        return sorpcol;
    }

    @JsonProperty("sorpcol")
    public void setSorpcol(List<Sorpcol> sorpcol) {
        this.sorpcol = sorpcol;
    }

    public PriorCollegePriorCollegeAndDegree100GetResponse withSorpcol(List<Sorpcol> sorpcol) {
        this.sorpcol = sorpcol;
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

    public PriorCollegePriorCollegeAndDegree100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriorCollegePriorCollegeAndDegree100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sordegr");
        sb.append('=');
        sb.append(((this.sordegr == null)?"<null>":this.sordegr));
        sb.append(',');
        sb.append("sorpcol");
        sb.append('=');
        sb.append(((this.sorpcol == null)?"<null>":this.sorpcol));
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
        result = ((result* 31)+((this.sordegr == null)? 0 :this.sordegr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorpcol == null)? 0 :this.sorpcol.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriorCollegePriorCollegeAndDegree100GetResponse) == false) {
            return false;
        }
        PriorCollegePriorCollegeAndDegree100GetResponse rhs = ((PriorCollegePriorCollegeAndDegree100GetResponse) other);
        return ((((this.sordegr == rhs.sordegr)||((this.sordegr!= null)&&this.sordegr.equals(rhs.sordegr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorpcol == rhs.sorpcol)||((this.sorpcol!= null)&&this.sorpcol.equals(rhs.sorpcol))));
    }

}
