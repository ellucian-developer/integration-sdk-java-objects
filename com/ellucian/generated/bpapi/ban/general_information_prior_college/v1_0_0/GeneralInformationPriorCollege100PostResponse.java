
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
public class GeneralInformationPriorCollege100PostResponse {

    @JsonProperty("sormajr")
    private List<Sormajr__1> sormajr = new ArrayList<Sormajr__1>();
    @JsonProperty("sorminr")
    private List<Sorminr> sorminr = new ArrayList<Sorminr>();
    @JsonProperty("sordegr")
    private List<Sordegr__1> sordegr = new ArrayList<Sordegr__1>();
    @JsonProperty("sorconc")
    private List<Sorconc__1> sorconc = new ArrayList<Sorconc__1>();
    @JsonProperty("sorpcol")
    private List<Sorpcol__1> sorpcol = new ArrayList<Sorpcol__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sormajr")
    public List<Sormajr__1> getSormajr() {
        return sormajr;
    }

    @JsonProperty("sormajr")
    public void setSormajr(List<Sormajr__1> sormajr) {
        this.sormajr = sormajr;
    }

    public GeneralInformationPriorCollege100PostResponse withSormajr(List<Sormajr__1> sormajr) {
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

    public GeneralInformationPriorCollege100PostResponse withSorminr(List<Sorminr> sorminr) {
        this.sorminr = sorminr;
        return this;
    }

    @JsonProperty("sordegr")
    public List<Sordegr__1> getSordegr() {
        return sordegr;
    }

    @JsonProperty("sordegr")
    public void setSordegr(List<Sordegr__1> sordegr) {
        this.sordegr = sordegr;
    }

    public GeneralInformationPriorCollege100PostResponse withSordegr(List<Sordegr__1> sordegr) {
        this.sordegr = sordegr;
        return this;
    }

    @JsonProperty("sorconc")
    public List<Sorconc__1> getSorconc() {
        return sorconc;
    }

    @JsonProperty("sorconc")
    public void setSorconc(List<Sorconc__1> sorconc) {
        this.sorconc = sorconc;
    }

    public GeneralInformationPriorCollege100PostResponse withSorconc(List<Sorconc__1> sorconc) {
        this.sorconc = sorconc;
        return this;
    }

    @JsonProperty("sorpcol")
    public List<Sorpcol__1> getSorpcol() {
        return sorpcol;
    }

    @JsonProperty("sorpcol")
    public void setSorpcol(List<Sorpcol__1> sorpcol) {
        this.sorpcol = sorpcol;
    }

    public GeneralInformationPriorCollege100PostResponse withSorpcol(List<Sorpcol__1> sorpcol) {
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

    public GeneralInformationPriorCollege100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralInformationPriorCollege100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof GeneralInformationPriorCollege100PostResponse) == false) {
            return false;
        }
        GeneralInformationPriorCollege100PostResponse rhs = ((GeneralInformationPriorCollege100PostResponse) other);
        return (((((((this.sormajr == rhs.sormajr)||((this.sormajr!= null)&&this.sormajr.equals(rhs.sormajr)))&&((this.sorminr == rhs.sorminr)||((this.sorminr!= null)&&this.sorminr.equals(rhs.sorminr))))&&((this.sorpcol == rhs.sorpcol)||((this.sorpcol!= null)&&this.sorpcol.equals(rhs.sorpcol))))&&((this.sordegr == rhs.sordegr)||((this.sordegr!= null)&&this.sordegr.equals(rhs.sordegr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorconc == rhs.sorconc)||((this.sorconc!= null)&&this.sorconc.equals(rhs.sorconc))));
    }

}
