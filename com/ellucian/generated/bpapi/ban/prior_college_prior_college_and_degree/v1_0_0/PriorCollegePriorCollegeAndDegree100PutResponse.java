
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
public class PriorCollegePriorCollegeAndDegree100PutResponse {

    @JsonProperty("sordegr")
    private List<Sordegr__2> sordegr = new ArrayList<Sordegr__2>();
    @JsonProperty("sorpcol")
    private List<Sorpcol__2> sorpcol = new ArrayList<Sorpcol__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sordegr")
    public List<Sordegr__2> getSordegr() {
        return sordegr;
    }

    @JsonProperty("sordegr")
    public void setSordegr(List<Sordegr__2> sordegr) {
        this.sordegr = sordegr;
    }

    public PriorCollegePriorCollegeAndDegree100PutResponse withSordegr(List<Sordegr__2> sordegr) {
        this.sordegr = sordegr;
        return this;
    }

    @JsonProperty("sorpcol")
    public List<Sorpcol__2> getSorpcol() {
        return sorpcol;
    }

    @JsonProperty("sorpcol")
    public void setSorpcol(List<Sorpcol__2> sorpcol) {
        this.sorpcol = sorpcol;
    }

    public PriorCollegePriorCollegeAndDegree100PutResponse withSorpcol(List<Sorpcol__2> sorpcol) {
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

    public PriorCollegePriorCollegeAndDegree100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriorCollegePriorCollegeAndDegree100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof PriorCollegePriorCollegeAndDegree100PutResponse) == false) {
            return false;
        }
        PriorCollegePriorCollegeAndDegree100PutResponse rhs = ((PriorCollegePriorCollegeAndDegree100PutResponse) other);
        return ((((this.sordegr == rhs.sordegr)||((this.sordegr!= null)&&this.sordegr.equals(rhs.sordegr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorpcol == rhs.sorpcol)||((this.sorpcol!= null)&&this.sorpcol.equals(rhs.sorpcol))));
    }

}
