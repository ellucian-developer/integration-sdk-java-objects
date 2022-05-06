
package com.ellucian.generated.bpapi.ban.admissions_decision_high_school_review.v1_0_0;

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
    "saradap",
    "sorlfos",
    "sorlcur",
    "sorhsch",
    "sorhsbj"
})
@Generated("jsonschema2pojo")
public class AdmissionsDecisionHighSchoolReview100GetResponse {

    @JsonProperty("saradap")
    private List<Saradap> saradap = new ArrayList<Saradap>();
    @JsonProperty("sorlfos")
    private List<Sorlfo> sorlfos = new ArrayList<Sorlfo>();
    @JsonProperty("sorlcur")
    private List<Sorlcur> sorlcur = new ArrayList<Sorlcur>();
    @JsonProperty("sorhsch")
    private List<Sorhsch> sorhsch = new ArrayList<Sorhsch>();
    @JsonProperty("sorhsbj")
    private List<Sorhsbj> sorhsbj = new ArrayList<Sorhsbj>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("saradap")
    public List<Saradap> getSaradap() {
        return saradap;
    }

    @JsonProperty("saradap")
    public void setSaradap(List<Saradap> saradap) {
        this.saradap = saradap;
    }

    public AdmissionsDecisionHighSchoolReview100GetResponse withSaradap(List<Saradap> saradap) {
        this.saradap = saradap;
        return this;
    }

    @JsonProperty("sorlfos")
    public List<Sorlfo> getSorlfos() {
        return sorlfos;
    }

    @JsonProperty("sorlfos")
    public void setSorlfos(List<Sorlfo> sorlfos) {
        this.sorlfos = sorlfos;
    }

    public AdmissionsDecisionHighSchoolReview100GetResponse withSorlfos(List<Sorlfo> sorlfos) {
        this.sorlfos = sorlfos;
        return this;
    }

    @JsonProperty("sorlcur")
    public List<Sorlcur> getSorlcur() {
        return sorlcur;
    }

    @JsonProperty("sorlcur")
    public void setSorlcur(List<Sorlcur> sorlcur) {
        this.sorlcur = sorlcur;
    }

    public AdmissionsDecisionHighSchoolReview100GetResponse withSorlcur(List<Sorlcur> sorlcur) {
        this.sorlcur = sorlcur;
        return this;
    }

    @JsonProperty("sorhsch")
    public List<Sorhsch> getSorhsch() {
        return sorhsch;
    }

    @JsonProperty("sorhsch")
    public void setSorhsch(List<Sorhsch> sorhsch) {
        this.sorhsch = sorhsch;
    }

    public AdmissionsDecisionHighSchoolReview100GetResponse withSorhsch(List<Sorhsch> sorhsch) {
        this.sorhsch = sorhsch;
        return this;
    }

    @JsonProperty("sorhsbj")
    public List<Sorhsbj> getSorhsbj() {
        return sorhsbj;
    }

    @JsonProperty("sorhsbj")
    public void setSorhsbj(List<Sorhsbj> sorhsbj) {
        this.sorhsbj = sorhsbj;
    }

    public AdmissionsDecisionHighSchoolReview100GetResponse withSorhsbj(List<Sorhsbj> sorhsbj) {
        this.sorhsbj = sorhsbj;
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

    public AdmissionsDecisionHighSchoolReview100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsDecisionHighSchoolReview100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saradap");
        sb.append('=');
        sb.append(((this.saradap == null)?"<null>":this.saradap));
        sb.append(',');
        sb.append("sorlfos");
        sb.append('=');
        sb.append(((this.sorlfos == null)?"<null>":this.sorlfos));
        sb.append(',');
        sb.append("sorlcur");
        sb.append('=');
        sb.append(((this.sorlcur == null)?"<null>":this.sorlcur));
        sb.append(',');
        sb.append("sorhsch");
        sb.append('=');
        sb.append(((this.sorhsch == null)?"<null>":this.sorhsch));
        sb.append(',');
        sb.append("sorhsbj");
        sb.append('=');
        sb.append(((this.sorhsbj == null)?"<null>":this.sorhsbj));
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
        result = ((result* 31)+((this.saradap == null)? 0 :this.saradap.hashCode()));
        result = ((result* 31)+((this.sorlcur == null)? 0 :this.sorlcur.hashCode()));
        result = ((result* 31)+((this.sorhsbj == null)? 0 :this.sorhsbj.hashCode()));
        result = ((result* 31)+((this.sorhsch == null)? 0 :this.sorhsch.hashCode()));
        result = ((result* 31)+((this.sorlfos == null)? 0 :this.sorlfos.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsDecisionHighSchoolReview100GetResponse) == false) {
            return false;
        }
        AdmissionsDecisionHighSchoolReview100GetResponse rhs = ((AdmissionsDecisionHighSchoolReview100GetResponse) other);
        return (((((((this.saradap == rhs.saradap)||((this.saradap!= null)&&this.saradap.equals(rhs.saradap)))&&((this.sorlcur == rhs.sorlcur)||((this.sorlcur!= null)&&this.sorlcur.equals(rhs.sorlcur))))&&((this.sorhsbj == rhs.sorhsbj)||((this.sorhsbj!= null)&&this.sorhsbj.equals(rhs.sorhsbj))))&&((this.sorhsch == rhs.sorhsch)||((this.sorhsch!= null)&&this.sorhsch.equals(rhs.sorhsch))))&&((this.sorlfos == rhs.sorlfos)||((this.sorlfos!= null)&&this.sorlfos.equals(rhs.sorlfos))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
