
package com.ellucian.generated.bpapi.ban.student_registration_group.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rgrpCode",
    "user"
})
@Generated("jsonschema2pojo")
public class Sfbrgrp {

    /**
     * Group
     * <p>
     * Lineage reference object : SFBRGRP_RGRP_CODE, Lookup lineage reference object : sfbwctl,sfrwctl
     * (Required)
     * 
     */
    @JsonProperty("rgrpCode")
    @JsonPropertyDescription("Lineage reference object : SFBRGRP_RGRP_CODE, Lookup lineage reference object : sfbwctl,sfrwctl")
    private String rgrpCode;
    /**
     * User
     * <p>
     * Lineage reference object : SFBRGRP_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : SFBRGRP_USER")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Group
     * <p>
     * Lineage reference object : SFBRGRP_RGRP_CODE, Lookup lineage reference object : sfbwctl,sfrwctl
     * (Required)
     * 
     */
    @JsonProperty("rgrpCode")
    public String getRgrpCode() {
        return rgrpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SFBRGRP_RGRP_CODE, Lookup lineage reference object : sfbwctl,sfrwctl
     * (Required)
     * 
     */
    @JsonProperty("rgrpCode")
    public void setRgrpCode(String rgrpCode) {
        this.rgrpCode = rgrpCode;
    }

    public Sfbrgrp withRgrpCode(String rgrpCode) {
        this.rgrpCode = rgrpCode;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SFBRGRP_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SFBRGRP_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Sfbrgrp withUser(String user) {
        this.user = user;
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

    public Sfbrgrp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfbrgrp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rgrpCode");
        sb.append('=');
        sb.append(((this.rgrpCode == null)?"<null>":this.rgrpCode));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.rgrpCode == null)? 0 :this.rgrpCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfbrgrp) == false) {
            return false;
        }
        Sfbrgrp rhs = ((Sfbrgrp) other);
        return ((((this.rgrpCode == rhs.rgrpCode)||((this.rgrpCode!= null)&&this.rgrpCode.equals(rhs.rgrpCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
