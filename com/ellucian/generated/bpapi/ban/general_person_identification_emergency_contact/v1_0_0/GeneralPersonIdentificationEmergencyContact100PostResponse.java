
package com.ellucian.generated.bpapi.ban.general_person_identification_emergency_contact.v1_0_0;

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
    "spbpers",
    "spremrg"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationEmergencyContact100PostResponse {

    @JsonProperty("spriden_current")
    private List<SpridenCurrent> spridenCurrent = new ArrayList<SpridenCurrent>();
    @JsonProperty("spbpers")
    private List<Spbper> spbpers = new ArrayList<Spbper>();
    @JsonProperty("spremrg")
    private List<Spremrg> spremrg = new ArrayList<Spremrg>();
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

    public GeneralPersonIdentificationEmergencyContact100PostResponse withSpridenCurrent(List<SpridenCurrent> spridenCurrent) {
        this.spridenCurrent = spridenCurrent;
        return this;
    }

    @JsonProperty("spbpers")
    public List<Spbper> getSpbpers() {
        return spbpers;
    }

    @JsonProperty("spbpers")
    public void setSpbpers(List<Spbper> spbpers) {
        this.spbpers = spbpers;
    }

    public GeneralPersonIdentificationEmergencyContact100PostResponse withSpbpers(List<Spbper> spbpers) {
        this.spbpers = spbpers;
        return this;
    }

    @JsonProperty("spremrg")
    public List<Spremrg> getSpremrg() {
        return spremrg;
    }

    @JsonProperty("spremrg")
    public void setSpremrg(List<Spremrg> spremrg) {
        this.spremrg = spremrg;
    }

    public GeneralPersonIdentificationEmergencyContact100PostResponse withSpremrg(List<Spremrg> spremrg) {
        this.spremrg = spremrg;
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

    public GeneralPersonIdentificationEmergencyContact100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationEmergencyContact100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spridenCurrent");
        sb.append('=');
        sb.append(((this.spridenCurrent == null)?"<null>":this.spridenCurrent));
        sb.append(',');
        sb.append("spbpers");
        sb.append('=');
        sb.append(((this.spbpers == null)?"<null>":this.spbpers));
        sb.append(',');
        sb.append("spremrg");
        sb.append('=');
        sb.append(((this.spremrg == null)?"<null>":this.spremrg));
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
        result = ((result* 31)+((this.spremrg == null)? 0 :this.spremrg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.spbpers == null)? 0 :this.spbpers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentificationEmergencyContact100PostResponse) == false) {
            return false;
        }
        GeneralPersonIdentificationEmergencyContact100PostResponse rhs = ((GeneralPersonIdentificationEmergencyContact100PostResponse) other);
        return (((((this.spridenCurrent == rhs.spridenCurrent)||((this.spridenCurrent!= null)&&this.spridenCurrent.equals(rhs.spridenCurrent)))&&((this.spremrg == rhs.spremrg)||((this.spremrg!= null)&&this.spremrg.equals(rhs.spremrg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.spbpers == rhs.spbpers)||((this.spbpers!= null)&&this.spbpers.equals(rhs.spbpers))));
    }

}
