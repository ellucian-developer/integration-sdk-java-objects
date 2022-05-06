
package com.ellucian.generated.bpapi.ban.term_control_registration.v1_0_0;

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
    "sobterm",
    "sobauth"
})
@Generated("jsonschema2pojo")
public class TermControlRegistration100GetResponse {

    @JsonProperty("sobterm")
    private List<Sobterm> sobterm = new ArrayList<Sobterm>();
    @JsonProperty("sobauth")
    private List<Sobauth> sobauth = new ArrayList<Sobauth>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobterm")
    public List<Sobterm> getSobterm() {
        return sobterm;
    }

    @JsonProperty("sobterm")
    public void setSobterm(List<Sobterm> sobterm) {
        this.sobterm = sobterm;
    }

    public TermControlRegistration100GetResponse withSobterm(List<Sobterm> sobterm) {
        this.sobterm = sobterm;
        return this;
    }

    @JsonProperty("sobauth")
    public List<Sobauth> getSobauth() {
        return sobauth;
    }

    @JsonProperty("sobauth")
    public void setSobauth(List<Sobauth> sobauth) {
        this.sobauth = sobauth;
    }

    public TermControlRegistration100GetResponse withSobauth(List<Sobauth> sobauth) {
        this.sobauth = sobauth;
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

    public TermControlRegistration100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermControlRegistration100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobterm");
        sb.append('=');
        sb.append(((this.sobterm == null)?"<null>":this.sobterm));
        sb.append(',');
        sb.append("sobauth");
        sb.append('=');
        sb.append(((this.sobauth == null)?"<null>":this.sobauth));
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
        result = ((result* 31)+((this.sobterm == null)? 0 :this.sobterm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sobauth == null)? 0 :this.sobauth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermControlRegistration100GetResponse) == false) {
            return false;
        }
        TermControlRegistration100GetResponse rhs = ((TermControlRegistration100GetResponse) other);
        return ((((this.sobterm == rhs.sobterm)||((this.sobterm!= null)&&this.sobterm.equals(rhs.sobterm)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sobauth == rhs.sobauth)||((this.sobauth!= null)&&this.sobauth.equals(rhs.sobauth))));
    }

}
