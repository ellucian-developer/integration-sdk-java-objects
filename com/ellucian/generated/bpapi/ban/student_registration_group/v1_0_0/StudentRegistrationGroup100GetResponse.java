
package com.ellucian.generated.bpapi.ban.student_registration_group.v1_0_0;

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
    "sfrwctl",
    "sfbrgrp"
})
@Generated("jsonschema2pojo")
public class StudentRegistrationGroup100GetResponse {

    @JsonProperty("sfrwctl")
    private List<Sfrwctl> sfrwctl = new ArrayList<Sfrwctl>();
    @JsonProperty("sfbrgrp")
    private List<Sfbrgrp> sfbrgrp = new ArrayList<Sfbrgrp>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sfrwctl")
    public List<Sfrwctl> getSfrwctl() {
        return sfrwctl;
    }

    @JsonProperty("sfrwctl")
    public void setSfrwctl(List<Sfrwctl> sfrwctl) {
        this.sfrwctl = sfrwctl;
    }

    public StudentRegistrationGroup100GetResponse withSfrwctl(List<Sfrwctl> sfrwctl) {
        this.sfrwctl = sfrwctl;
        return this;
    }

    @JsonProperty("sfbrgrp")
    public List<Sfbrgrp> getSfbrgrp() {
        return sfbrgrp;
    }

    @JsonProperty("sfbrgrp")
    public void setSfbrgrp(List<Sfbrgrp> sfbrgrp) {
        this.sfbrgrp = sfbrgrp;
    }

    public StudentRegistrationGroup100GetResponse withSfbrgrp(List<Sfbrgrp> sfbrgrp) {
        this.sfbrgrp = sfbrgrp;
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

    public StudentRegistrationGroup100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentRegistrationGroup100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sfrwctl");
        sb.append('=');
        sb.append(((this.sfrwctl == null)?"<null>":this.sfrwctl));
        sb.append(',');
        sb.append("sfbrgrp");
        sb.append('=');
        sb.append(((this.sfbrgrp == null)?"<null>":this.sfbrgrp));
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
        result = ((result* 31)+((this.sfrwctl == null)? 0 :this.sfrwctl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sfbrgrp == null)? 0 :this.sfbrgrp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentRegistrationGroup100GetResponse) == false) {
            return false;
        }
        StudentRegistrationGroup100GetResponse rhs = ((StudentRegistrationGroup100GetResponse) other);
        return ((((this.sfrwctl == rhs.sfrwctl)||((this.sfrwctl!= null)&&this.sfrwctl.equals(rhs.sfrwctl)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sfbrgrp == rhs.sfbrgrp)||((this.sfbrgrp!= null)&&this.sfbrgrp.equals(rhs.sfbrgrp))));
    }

}
