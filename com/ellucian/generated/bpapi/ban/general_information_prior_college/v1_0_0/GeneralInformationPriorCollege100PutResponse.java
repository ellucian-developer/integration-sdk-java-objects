
package com.ellucian.generated.bpapi.ban.general_information_prior_college.v1_0_0;

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
    "sormajr",
    "sorminr",
    "sordegr",
    "sorconc",
    "sorpcol"
})
@Generated("jsonschema2pojo")
public class GeneralInformationPriorCollege100PutResponse {

    @JsonProperty("sormajr")
    private List<Sormajr__2> sormajr = new ArrayList<Sormajr__2>();
    @JsonProperty("sorminr")
    private List<Sorminr__1> sorminr = new ArrayList<Sorminr__1>();
    @JsonProperty("sordegr")
    private List<Sordegr__2> sordegr = new ArrayList<Sordegr__2>();
    @JsonProperty("sorconc")
    private List<Sorconc__2> sorconc = new ArrayList<Sorconc__2>();
    @JsonProperty("sorpcol")
    private List<Sorpcol__2> sorpcol = new ArrayList<Sorpcol__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sormajr")
    public List<Sormajr__2> getSormajr() {
        return sormajr;
    }

    @JsonProperty("sormajr")
    public void setSormajr(List<Sormajr__2> sormajr) {
        this.sormajr = sormajr;
    }

    public GeneralInformationPriorCollege100PutResponse withSormajr(List<Sormajr__2> sormajr) {
        this.sormajr = sormajr;
        return this;
    }

    @JsonProperty("sorminr")
    public List<Sorminr__1> getSorminr() {
        return sorminr;
    }

    @JsonProperty("sorminr")
    public void setSorminr(List<Sorminr__1> sorminr) {
        this.sorminr = sorminr;
    }

    public GeneralInformationPriorCollege100PutResponse withSorminr(List<Sorminr__1> sorminr) {
        this.sorminr = sorminr;
        return this;
    }

    @JsonProperty("sordegr")
    public List<Sordegr__2> getSordegr() {
        return sordegr;
    }

    @JsonProperty("sordegr")
    public void setSordegr(List<Sordegr__2> sordegr) {
        this.sordegr = sordegr;
    }

    public GeneralInformationPriorCollege100PutResponse withSordegr(List<Sordegr__2> sordegr) {
        this.sordegr = sordegr;
        return this;
    }

    @JsonProperty("sorconc")
    public List<Sorconc__2> getSorconc() {
        return sorconc;
    }

    @JsonProperty("sorconc")
    public void setSorconc(List<Sorconc__2> sorconc) {
        this.sorconc = sorconc;
    }

    public GeneralInformationPriorCollege100PutResponse withSorconc(List<Sorconc__2> sorconc) {
        this.sorconc = sorconc;
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

    public GeneralInformationPriorCollege100PutResponse withSorpcol(List<Sorpcol__2> sorpcol) {
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

    public GeneralInformationPriorCollege100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralInformationPriorCollege100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sormajr");
        sb.append('=');
        sb.append(((this.sormajr == null)?"<null>":this.sormajr));
        sb.append(',');
        sb.append("sorminr");
        sb.append('=');
        sb.append(((this.sorminr == null)?"<null>":this.sorminr));
        sb.append(',');
        sb.append("sordegr");
        sb.append('=');
        sb.append(((this.sordegr == null)?"<null>":this.sordegr));
        sb.append(',');
        sb.append("sorconc");
        sb.append('=');
        sb.append(((this.sorconc == null)?"<null>":this.sorconc));
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
        result = ((result* 31)+((this.sormajr == null)? 0 :this.sormajr.hashCode()));
        result = ((result* 31)+((this.sorminr == null)? 0 :this.sorminr.hashCode()));
        result = ((result* 31)+((this.sorpcol == null)? 0 :this.sorpcol.hashCode()));
        result = ((result* 31)+((this.sordegr == null)? 0 :this.sordegr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorconc == null)? 0 :this.sorconc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralInformationPriorCollege100PutResponse) == false) {
            return false;
        }
        GeneralInformationPriorCollege100PutResponse rhs = ((GeneralInformationPriorCollege100PutResponse) other);
        return (((((((this.sormajr == rhs.sormajr)||((this.sormajr!= null)&&this.sormajr.equals(rhs.sormajr)))&&((this.sorminr == rhs.sorminr)||((this.sorminr!= null)&&this.sorminr.equals(rhs.sorminr))))&&((this.sorpcol == rhs.sorpcol)||((this.sorpcol!= null)&&this.sorpcol.equals(rhs.sorpcol))))&&((this.sordegr == rhs.sordegr)||((this.sordegr!= null)&&this.sordegr.equals(rhs.sordegr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorconc == rhs.sorconc)||((this.sorconc!= null)&&this.sorconc.equals(rhs.sorconc))));
    }

}
