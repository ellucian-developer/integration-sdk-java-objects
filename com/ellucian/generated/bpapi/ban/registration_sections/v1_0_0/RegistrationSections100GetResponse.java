
package com.ellucian.generated.bpapi.ban.registration_sections.v1_0_0;

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
    "sfvsttm",
    "sfvstum",
    "sfvsecm"
})
@Generated("jsonschema2pojo")
public class RegistrationSections100GetResponse {

    @JsonProperty("sfvsttm")
    private List<Sfvsttm> sfvsttm = new ArrayList<Sfvsttm>();
    @JsonProperty("sfvstum")
    private List<Sfvstum> sfvstum = new ArrayList<Sfvstum>();
    @JsonProperty("sfvsecm")
    private List<Sfvsecm> sfvsecm = new ArrayList<Sfvsecm>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sfvsttm")
    public List<Sfvsttm> getSfvsttm() {
        return sfvsttm;
    }

    @JsonProperty("sfvsttm")
    public void setSfvsttm(List<Sfvsttm> sfvsttm) {
        this.sfvsttm = sfvsttm;
    }

    public RegistrationSections100GetResponse withSfvsttm(List<Sfvsttm> sfvsttm) {
        this.sfvsttm = sfvsttm;
        return this;
    }

    @JsonProperty("sfvstum")
    public List<Sfvstum> getSfvstum() {
        return sfvstum;
    }

    @JsonProperty("sfvstum")
    public void setSfvstum(List<Sfvstum> sfvstum) {
        this.sfvstum = sfvstum;
    }

    public RegistrationSections100GetResponse withSfvstum(List<Sfvstum> sfvstum) {
        this.sfvstum = sfvstum;
        return this;
    }

    @JsonProperty("sfvsecm")
    public List<Sfvsecm> getSfvsecm() {
        return sfvsecm;
    }

    @JsonProperty("sfvsecm")
    public void setSfvsecm(List<Sfvsecm> sfvsecm) {
        this.sfvsecm = sfvsecm;
    }

    public RegistrationSections100GetResponse withSfvsecm(List<Sfvsecm> sfvsecm) {
        this.sfvsecm = sfvsecm;
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

    public RegistrationSections100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationSections100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sfvsttm");
        sb.append('=');
        sb.append(((this.sfvsttm == null)?"<null>":this.sfvsttm));
        sb.append(',');
        sb.append("sfvstum");
        sb.append('=');
        sb.append(((this.sfvstum == null)?"<null>":this.sfvstum));
        sb.append(',');
        sb.append("sfvsecm");
        sb.append('=');
        sb.append(((this.sfvsecm == null)?"<null>":this.sfvsecm));
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
        result = ((result* 31)+((this.sfvsecm == null)? 0 :this.sfvsecm.hashCode()));
        result = ((result* 31)+((this.sfvsttm == null)? 0 :this.sfvsttm.hashCode()));
        result = ((result* 31)+((this.sfvstum == null)? 0 :this.sfvstum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationSections100GetResponse) == false) {
            return false;
        }
        RegistrationSections100GetResponse rhs = ((RegistrationSections100GetResponse) other);
        return (((((this.sfvsecm == rhs.sfvsecm)||((this.sfvsecm!= null)&&this.sfvsecm.equals(rhs.sfvsecm)))&&((this.sfvsttm == rhs.sfvsttm)||((this.sfvsttm!= null)&&this.sfvsttm.equals(rhs.sfvsttm))))&&((this.sfvstum == rhs.sfvstum)||((this.sfvstum!= null)&&this.sfvstum.equals(rhs.sfvstum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
