
package com.ellucian.generated.bpapi.ban.general_person_identification_telephone.v1_0_0;

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
    "spriden_current",
    "sprtele"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationTelephone100PostResponse {

    @JsonProperty("spriden_current")
    private List<SpridenCurrent> spridenCurrent = new ArrayList<SpridenCurrent>();
    @JsonProperty("sprtele")
    private List<Sprtele> sprtele = new ArrayList<Sprtele>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("spriden_current")
    public List<SpridenCurrent> getSpridenCurrent() {
        return spridenCurrent;
    }

    @JsonProperty("spriden_current")
    public void setSpridenCurrent(List<SpridenCurrent> spridenCurrent) {
        this.spridenCurrent = spridenCurrent;
    }

    public GeneralPersonIdentificationTelephone100PostResponse withSpridenCurrent(List<SpridenCurrent> spridenCurrent) {
        this.spridenCurrent = spridenCurrent;
        return this;
    }

    @JsonProperty("sprtele")
    public List<Sprtele> getSprtele() {
        return sprtele;
    }

    @JsonProperty("sprtele")
    public void setSprtele(List<Sprtele> sprtele) {
        this.sprtele = sprtele;
    }

    public GeneralPersonIdentificationTelephone100PostResponse withSprtele(List<Sprtele> sprtele) {
        this.sprtele = sprtele;
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

    public GeneralPersonIdentificationTelephone100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationTelephone100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spridenCurrent");
        sb.append('=');
        sb.append(((this.spridenCurrent == null)?"<null>":this.spridenCurrent));
        sb.append(',');
        sb.append("sprtele");
        sb.append('=');
        sb.append(((this.sprtele == null)?"<null>":this.sprtele));
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
        result = ((result* 31)+((this.spridenCurrent == null)? 0 :this.spridenCurrent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sprtele == null)? 0 :this.sprtele.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentificationTelephone100PostResponse) == false) {
            return false;
        }
        GeneralPersonIdentificationTelephone100PostResponse rhs = ((GeneralPersonIdentificationTelephone100PostResponse) other);
        return ((((this.spridenCurrent == rhs.spridenCurrent)||((this.spridenCurrent!= null)&&this.spridenCurrent.equals(rhs.spridenCurrent)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sprtele == rhs.sprtele)||((this.sprtele!= null)&&this.sprtele.equals(rhs.sprtele))));
    }

}
