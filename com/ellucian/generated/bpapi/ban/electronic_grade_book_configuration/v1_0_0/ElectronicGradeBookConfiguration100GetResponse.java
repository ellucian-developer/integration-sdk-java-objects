
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
public class ElectronicGradeBookConfiguration100GetResponse {

    @JsonProperty("sobptrm")
    private List<Sobptrm> sobptrm = new ArrayList<Sobptrm>();
    @JsonProperty("sobterm")
    private List<Sobterm> sobterm = new ArrayList<Sobterm>();
    @JsonProperty("ssbssec")
    private List<Ssbssec> ssbssec = new ArrayList<Ssbssec>();
    @JsonProperty("ssbsect")
    private List<Ssbsect> ssbsect = new ArrayList<Ssbsect>();
    @JsonProperty("shbgctl")
    private List<Shbgctl> shbgctl = new ArrayList<Shbgctl>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobptrm")
    public List<Sobptrm> getSobptrm() {
        return sobptrm;
    }

    @JsonProperty("sobptrm")
    public void setSobptrm(List<Sobptrm> sobptrm) {
        this.sobptrm = sobptrm;
    }

    public ElectronicGradeBookConfiguration100GetResponse withSobptrm(List<Sobptrm> sobptrm) {
        this.sobptrm = sobptrm;
        return this;
    }

    @JsonProperty("sobterm")
    public List<Sobterm> getSobterm() {
        return sobterm;
    }

    @JsonProperty("sobterm")
    public void setSobterm(List<Sobterm> sobterm) {
        this.sobterm = sobterm;
    }

    public ElectronicGradeBookConfiguration100GetResponse withSobterm(List<Sobterm> sobterm) {
        this.sobterm = sobterm;
        return this;
    }

    @JsonProperty("ssbssec")
    public List<Ssbssec> getSsbssec() {
        return ssbssec;
    }

    @JsonProperty("ssbssec")
    public void setSsbssec(List<Ssbssec> ssbssec) {
        this.ssbssec = ssbssec;
    }

    public ElectronicGradeBookConfiguration100GetResponse withSsbssec(List<Ssbssec> ssbssec) {
        this.ssbssec = ssbssec;
        return this;
    }

    @JsonProperty("ssbsect")
    public List<Ssbsect> getSsbsect() {
        return ssbsect;
    }

    @JsonProperty("ssbsect")
    public void setSsbsect(List<Ssbsect> ssbsect) {
        this.ssbsect = ssbsect;
    }

    public ElectronicGradeBookConfiguration100GetResponse withSsbsect(List<Ssbsect> ssbsect) {
        this.ssbsect = ssbsect;
        return this;
    }

    @JsonProperty("shbgctl")
    public List<Shbgctl> getShbgctl() {
        return shbgctl;
    }

    @JsonProperty("shbgctl")
    public void setShbgctl(List<Shbgctl> shbgctl) {
        this.shbgctl = shbgctl;
    }

    public ElectronicGradeBookConfiguration100GetResponse withShbgctl(List<Shbgctl> shbgctl) {
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

    public ElectronicGradeBookConfiguration100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicGradeBookConfiguration100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof ElectronicGradeBookConfiguration100GetResponse) == false) {
            return false;
        }
        ElectronicGradeBookConfiguration100GetResponse rhs = ((ElectronicGradeBookConfiguration100GetResponse) other);
        return (((((((this.ssbsect == rhs.ssbsect)||((this.ssbsect!= null)&&this.ssbsect.equals(rhs.ssbsect)))&&((this.sobterm == rhs.sobterm)||((this.sobterm!= null)&&this.sobterm.equals(rhs.sobterm))))&&((this.ssbssec == rhs.ssbssec)||((this.ssbssec!= null)&&this.ssbssec.equals(rhs.ssbssec))))&&((this.sobptrm == rhs.sobptrm)||((this.sobptrm!= null)&&this.sobptrm.equals(rhs.sobptrm))))&&((this.shbgctl == rhs.shbgctl)||((this.shbgctl!= null)&&this.shbgctl.equals(rhs.shbgctl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
