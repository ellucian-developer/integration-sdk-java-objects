
package com.ellucian.generated.bpapi.ban.electronic_grade_book_configuration.v1_0_0;

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
    "sobptrm",
    "sobterm",
    "ssbssec",
    "ssbsect",
    "shbgctl"
})
@Generated("jsonschema2pojo")
public class ElectronicGradeBookConfiguration100PutResponse {

    @JsonProperty("sobptrm")
    private List<Sobptrm__1> sobptrm = new ArrayList<Sobptrm__1>();
    @JsonProperty("sobterm")
    private List<Sobterm__1> sobterm = new ArrayList<Sobterm__1>();
    @JsonProperty("ssbssec")
    private List<Ssbssec__1> ssbssec = new ArrayList<Ssbssec__1>();
    @JsonProperty("ssbsect")
    private List<Ssbsect__1> ssbsect = new ArrayList<Ssbsect__1>();
    @JsonProperty("shbgctl")
    private List<Shbgctl__1> shbgctl = new ArrayList<Shbgctl__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobptrm")
    public List<Sobptrm__1> getSobptrm() {
        return sobptrm;
    }

    @JsonProperty("sobptrm")
    public void setSobptrm(List<Sobptrm__1> sobptrm) {
        this.sobptrm = sobptrm;
    }

    public ElectronicGradeBookConfiguration100PutResponse withSobptrm(List<Sobptrm__1> sobptrm) {
        this.sobptrm = sobptrm;
        return this;
    }

    @JsonProperty("sobterm")
    public List<Sobterm__1> getSobterm() {
        return sobterm;
    }

    @JsonProperty("sobterm")
    public void setSobterm(List<Sobterm__1> sobterm) {
        this.sobterm = sobterm;
    }

    public ElectronicGradeBookConfiguration100PutResponse withSobterm(List<Sobterm__1> sobterm) {
        this.sobterm = sobterm;
        return this;
    }

    @JsonProperty("ssbssec")
    public List<Ssbssec__1> getSsbssec() {
        return ssbssec;
    }

    @JsonProperty("ssbssec")
    public void setSsbssec(List<Ssbssec__1> ssbssec) {
        this.ssbssec = ssbssec;
    }

    public ElectronicGradeBookConfiguration100PutResponse withSsbssec(List<Ssbssec__1> ssbssec) {
        this.ssbssec = ssbssec;
        return this;
    }

    @JsonProperty("ssbsect")
    public List<Ssbsect__1> getSsbsect() {
        return ssbsect;
    }

    @JsonProperty("ssbsect")
    public void setSsbsect(List<Ssbsect__1> ssbsect) {
        this.ssbsect = ssbsect;
    }

    public ElectronicGradeBookConfiguration100PutResponse withSsbsect(List<Ssbsect__1> ssbsect) {
        this.ssbsect = ssbsect;
        return this;
    }

    @JsonProperty("shbgctl")
    public List<Shbgctl__1> getShbgctl() {
        return shbgctl;
    }

    @JsonProperty("shbgctl")
    public void setShbgctl(List<Shbgctl__1> shbgctl) {
        this.shbgctl = shbgctl;
    }

    public ElectronicGradeBookConfiguration100PutResponse withShbgctl(List<Shbgctl__1> shbgctl) {
        this.shbgctl = shbgctl;
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

    public ElectronicGradeBookConfiguration100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicGradeBookConfiguration100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobptrm");
        sb.append('=');
        sb.append(((this.sobptrm == null)?"<null>":this.sobptrm));
        sb.append(',');
        sb.append("sobterm");
        sb.append('=');
        sb.append(((this.sobterm == null)?"<null>":this.sobterm));
        sb.append(',');
        sb.append("ssbssec");
        sb.append('=');
        sb.append(((this.ssbssec == null)?"<null>":this.ssbssec));
        sb.append(',');
        sb.append("ssbsect");
        sb.append('=');
        sb.append(((this.ssbsect == null)?"<null>":this.ssbsect));
        sb.append(',');
        sb.append("shbgctl");
        sb.append('=');
        sb.append(((this.shbgctl == null)?"<null>":this.shbgctl));
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
        result = ((result* 31)+((this.ssbsect == null)? 0 :this.ssbsect.hashCode()));
        result = ((result* 31)+((this.sobterm == null)? 0 :this.sobterm.hashCode()));
        result = ((result* 31)+((this.ssbssec == null)? 0 :this.ssbssec.hashCode()));
        result = ((result* 31)+((this.sobptrm == null)? 0 :this.sobptrm.hashCode()));
        result = ((result* 31)+((this.shbgctl == null)? 0 :this.shbgctl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicGradeBookConfiguration100PutResponse) == false) {
            return false;
        }
        ElectronicGradeBookConfiguration100PutResponse rhs = ((ElectronicGradeBookConfiguration100PutResponse) other);
        return (((((((this.ssbsect == rhs.ssbsect)||((this.ssbsect!= null)&&this.ssbsect.equals(rhs.ssbsect)))&&((this.sobterm == rhs.sobterm)||((this.sobterm!= null)&&this.sobterm.equals(rhs.sobterm))))&&((this.ssbssec == rhs.ssbssec)||((this.ssbssec!= null)&&this.ssbssec.equals(rhs.ssbssec))))&&((this.sobptrm == rhs.sobptrm)||((this.sobptrm!= null)&&this.sobptrm.equals(rhs.sobptrm))))&&((this.shbgctl == rhs.shbgctl)||((this.shbgctl!= null)&&this.shbgctl.equals(rhs.shbgctl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
