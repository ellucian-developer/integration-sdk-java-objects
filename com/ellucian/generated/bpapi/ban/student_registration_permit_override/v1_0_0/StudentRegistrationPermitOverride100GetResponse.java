
package com.ellucian.generated.bpapi.ban.student_registration_permit_override.v1_0_0;

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
    "sfrsrpo",
    "sfvstum"
})
@Generated("jsonschema2pojo")
public class StudentRegistrationPermitOverride100GetResponse {

    @JsonProperty("sfrsrpo")
    private List<Sfrsrpo> sfrsrpo = new ArrayList<Sfrsrpo>();
    @JsonProperty("sfvstum")
    private List<Sfvstum> sfvstum = new ArrayList<Sfvstum>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sfrsrpo")
    public List<Sfrsrpo> getSfrsrpo() {
        return sfrsrpo;
    }

    @JsonProperty("sfrsrpo")
    public void setSfrsrpo(List<Sfrsrpo> sfrsrpo) {
        this.sfrsrpo = sfrsrpo;
    }

    public StudentRegistrationPermitOverride100GetResponse withSfrsrpo(List<Sfrsrpo> sfrsrpo) {
        this.sfrsrpo = sfrsrpo;
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

    public StudentRegistrationPermitOverride100GetResponse withSfvstum(List<Sfvstum> sfvstum) {
        this.sfvstum = sfvstum;
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

    public StudentRegistrationPermitOverride100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentRegistrationPermitOverride100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sfrsrpo");
        sb.append('=');
        sb.append(((this.sfrsrpo == null)?"<null>":this.sfrsrpo));
        sb.append(',');
        sb.append("sfvstum");
        sb.append('=');
        sb.append(((this.sfvstum == null)?"<null>":this.sfvstum));
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
        result = ((result* 31)+((this.sfrsrpo == null)? 0 :this.sfrsrpo.hashCode()));
        result = ((result* 31)+((this.sfvstum == null)? 0 :this.sfvstum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentRegistrationPermitOverride100GetResponse) == false) {
            return false;
        }
        StudentRegistrationPermitOverride100GetResponse rhs = ((StudentRegistrationPermitOverride100GetResponse) other);
        return ((((this.sfrsrpo == rhs.sfrsrpo)||((this.sfrsrpo!= null)&&this.sfrsrpo.equals(rhs.sfrsrpo)))&&((this.sfvstum == rhs.sfvstum)||((this.sfvstum!= null)&&this.sfvstum.equals(rhs.sfvstum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
