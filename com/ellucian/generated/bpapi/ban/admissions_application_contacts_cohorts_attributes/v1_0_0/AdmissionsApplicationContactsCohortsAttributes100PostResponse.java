
package com.ellucian.generated.bpapi.ban.admissions_application_contacts_cohorts_attributes.v1_0_0;

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
    "sorcont",
    "sarchrt",
    "saraatt"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationContactsCohortsAttributes100PostResponse {

    @JsonProperty("saradap")
    private List<Saradap__1> saradap = new ArrayList<Saradap__1>();
    @JsonProperty("sorcont")
    private List<Sorcont__1> sorcont = new ArrayList<Sorcont__1>();
    @JsonProperty("sarchrt")
    private List<Sarchrt__1> sarchrt = new ArrayList<Sarchrt__1>();
    @JsonProperty("saraatt")
    private List<Saraatt__1> saraatt = new ArrayList<Saraatt__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("saradap")
    public List<Saradap__1> getSaradap() {
        return saradap;
    }

    @JsonProperty("saradap")
    public void setSaradap(List<Saradap__1> saradap) {
        this.saradap = saradap;
    }

    public AdmissionsApplicationContactsCohortsAttributes100PostResponse withSaradap(List<Saradap__1> saradap) {
        this.saradap = saradap;
        return this;
    }

    @JsonProperty("sorcont")
    public List<Sorcont__1> getSorcont() {
        return sorcont;
    }

    @JsonProperty("sorcont")
    public void setSorcont(List<Sorcont__1> sorcont) {
        this.sorcont = sorcont;
    }

    public AdmissionsApplicationContactsCohortsAttributes100PostResponse withSorcont(List<Sorcont__1> sorcont) {
        this.sorcont = sorcont;
        return this;
    }

    @JsonProperty("sarchrt")
    public List<Sarchrt__1> getSarchrt() {
        return sarchrt;
    }

    @JsonProperty("sarchrt")
    public void setSarchrt(List<Sarchrt__1> sarchrt) {
        this.sarchrt = sarchrt;
    }

    public AdmissionsApplicationContactsCohortsAttributes100PostResponse withSarchrt(List<Sarchrt__1> sarchrt) {
        this.sarchrt = sarchrt;
        return this;
    }

    @JsonProperty("saraatt")
    public List<Saraatt__1> getSaraatt() {
        return saraatt;
    }

    @JsonProperty("saraatt")
    public void setSaraatt(List<Saraatt__1> saraatt) {
        this.saraatt = saraatt;
    }

    public AdmissionsApplicationContactsCohortsAttributes100PostResponse withSaraatt(List<Saraatt__1> saraatt) {
        this.saraatt = saraatt;
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

    public AdmissionsApplicationContactsCohortsAttributes100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationContactsCohortsAttributes100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saradap");
        sb.append('=');
        sb.append(((this.saradap == null)?"<null>":this.saradap));
        sb.append(',');
        sb.append("sorcont");
        sb.append('=');
        sb.append(((this.sorcont == null)?"<null>":this.sorcont));
        sb.append(',');
        sb.append("sarchrt");
        sb.append('=');
        sb.append(((this.sarchrt == null)?"<null>":this.sarchrt));
        sb.append(',');
        sb.append("saraatt");
        sb.append('=');
        sb.append(((this.saraatt == null)?"<null>":this.saraatt));
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
        result = ((result* 31)+((this.saraatt == null)? 0 :this.saraatt.hashCode()));
        result = ((result* 31)+((this.sorcont == null)? 0 :this.sorcont.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sarchrt == null)? 0 :this.sarchrt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationContactsCohortsAttributes100PostResponse) == false) {
            return false;
        }
        AdmissionsApplicationContactsCohortsAttributes100PostResponse rhs = ((AdmissionsApplicationContactsCohortsAttributes100PostResponse) other);
        return ((((((this.saradap == rhs.saradap)||((this.saradap!= null)&&this.saradap.equals(rhs.saradap)))&&((this.saraatt == rhs.saraatt)||((this.saraatt!= null)&&this.saraatt.equals(rhs.saraatt))))&&((this.sorcont == rhs.sorcont)||((this.sorcont!= null)&&this.sorcont.equals(rhs.sorcont))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sarchrt == rhs.sarchrt)||((this.sarchrt!= null)&&this.sarchrt.equals(rhs.sarchrt))));
    }

}
