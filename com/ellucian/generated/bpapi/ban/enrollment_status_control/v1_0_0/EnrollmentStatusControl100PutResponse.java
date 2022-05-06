
package com.ellucian.generated.bpapi.ban.enrollment_status_control.v1_0_0;

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
    "sfbests",
    "sfbrfst"
})
@Generated("jsonschema2pojo")
public class EnrollmentStatusControl100PutResponse {

    @JsonProperty("sfbests")
    private List<Sfbest__2> sfbests = new ArrayList<Sfbest__2>();
    @JsonProperty("sfbrfst")
    private List<Sfbrfst__2> sfbrfst = new ArrayList<Sfbrfst__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sfbests")
    public List<Sfbest__2> getSfbests() {
        return sfbests;
    }

    @JsonProperty("sfbests")
    public void setSfbests(List<Sfbest__2> sfbests) {
        this.sfbests = sfbests;
    }

    public EnrollmentStatusControl100PutResponse withSfbests(List<Sfbest__2> sfbests) {
        this.sfbests = sfbests;
        return this;
    }

    @JsonProperty("sfbrfst")
    public List<Sfbrfst__2> getSfbrfst() {
        return sfbrfst;
    }

    @JsonProperty("sfbrfst")
    public void setSfbrfst(List<Sfbrfst__2> sfbrfst) {
        this.sfbrfst = sfbrfst;
    }

    public EnrollmentStatusControl100PutResponse withSfbrfst(List<Sfbrfst__2> sfbrfst) {
        this.sfbrfst = sfbrfst;
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

    public EnrollmentStatusControl100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollmentStatusControl100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sfbests");
        sb.append('=');
        sb.append(((this.sfbests == null)?"<null>":this.sfbests));
        sb.append(',');
        sb.append("sfbrfst");
        sb.append('=');
        sb.append(((this.sfbrfst == null)?"<null>":this.sfbrfst));
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
        result = ((result* 31)+((this.sfbrfst == null)? 0 :this.sfbrfst.hashCode()));
        result = ((result* 31)+((this.sfbests == null)? 0 :this.sfbests.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollmentStatusControl100PutResponse) == false) {
            return false;
        }
        EnrollmentStatusControl100PutResponse rhs = ((EnrollmentStatusControl100PutResponse) other);
        return ((((this.sfbrfst == rhs.sfbrfst)||((this.sfbrfst!= null)&&this.sfbrfst.equals(rhs.sfbrfst)))&&((this.sfbests == rhs.sfbests)||((this.sfbests!= null)&&this.sfbests.equals(rhs.sfbests))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
