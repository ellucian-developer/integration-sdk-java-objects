
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
    "sorpcol",
    "sordegr",
    "sormajr",
    "sorconc"
})
@Generated("jsonschema2pojo")
public class GeneralInformationPriorCollege100GetResponse {

    @JsonProperty("sorpcol")
    private List<Sorpcol> sorpcol = new ArrayList<Sorpcol>();
    @JsonProperty("sordegr")
    private List<Sordegr> sordegr = new ArrayList<Sordegr>();
    @JsonProperty("sormajr")
    private List<Sormajr> sormajr = new ArrayList<Sormajr>();
    @JsonProperty("sorconc")
    private List<Sorconc> sorconc = new ArrayList<Sorconc>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorpcol")
    public List<Sorpcol> getSorpcol() {
        return sorpcol;
    }

    @JsonProperty("sorpcol")
    public void setSorpcol(List<Sorpcol> sorpcol) {
        this.sorpcol = sorpcol;
    }

    public GeneralInformationPriorCollege100GetResponse withSorpcol(List<Sorpcol> sorpcol) {
        this.sorpcol = sorpcol;
        return this;
    }

    @JsonProperty("sordegr")
    public List<Sordegr> getSordegr() {
        return sordegr;
    }

    @JsonProperty("sordegr")
    public void setSordegr(List<Sordegr> sordegr) {
        this.sordegr = sordegr;
    }

    public GeneralInformationPriorCollege100GetResponse withSordegr(List<Sordegr> sordegr) {
        this.sordegr = sordegr;
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

    public GeneralInformationPriorCollege100GetResponse withSormajr(List<Sormajr> sormajr) {
        this.sormajr = sormajr;
        return this;
    }

    @JsonProperty("sorconc")
    public List<Sorconc> getSorconc() {
        return sorconc;
    }

    @JsonProperty("sorconc")
    public void setSorconc(List<Sorconc> sorconc) {
        this.sorconc = sorconc;
    }

    public GeneralInformationPriorCollege100GetResponse withSorconc(List<Sorconc> sorconc) {
        this.sorconc = sorconc;
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

    public GeneralInformationPriorCollege100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralInformationPriorCollege100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorpcol");
        sb.append('=');
        sb.append(((this.sorpcol == null)?"<null>":this.sorpcol));
        sb.append(',');
        sb.append("sordegr");
        sb.append('=');
        sb.append(((this.sordegr == null)?"<null>":this.sordegr));
        sb.append(',');
        sb.append("sormajr");
        sb.append('=');
        sb.append(((this.sormajr == null)?"<null>":this.sormajr));
        sb.append(',');
        sb.append("sorconc");
        sb.append('=');
        sb.append(((this.sorconc == null)?"<null>":this.sorconc));
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
        result = ((result* 31)+((this.sormajr == null)? 0 :this.sormajr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorconc == null)? 0 :this.sorconc.hashCode()));
        result = ((result* 31)+((this.sorpcol == null)? 0 :this.sorpcol.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralInformationPriorCollege100GetResponse) == false) {
            return false;
        }
        GeneralInformationPriorCollege100GetResponse rhs = ((GeneralInformationPriorCollege100GetResponse) other);
        return ((((((this.sordegr == rhs.sordegr)||((this.sordegr!= null)&&this.sordegr.equals(rhs.sordegr)))&&((this.sormajr == rhs.sormajr)||((this.sormajr!= null)&&this.sormajr.equals(rhs.sormajr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorconc == rhs.sorconc)||((this.sorconc!= null)&&this.sorconc.equals(rhs.sorconc))))&&((this.sorpcol == rhs.sorpcol)||((this.sorpcol!= null)&&this.sorpcol.equals(rhs.sorpcol))));
    }

}
