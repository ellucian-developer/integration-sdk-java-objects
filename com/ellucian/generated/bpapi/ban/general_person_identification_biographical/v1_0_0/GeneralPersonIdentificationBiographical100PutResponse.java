
package com.ellucian.generated.bpapi.ban.general_person_identification_biographical.v1_0_0;

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
    "spbpers",
    "gorprac"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationBiographical100PutResponse {

    @JsonProperty("spbpers")
    private List<Spbper__1> spbpers = new ArrayList<Spbper__1>();
    @JsonProperty("gorprac")
    private List<Gorprac__1> gorprac = new ArrayList<Gorprac__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("spbpers")
    public List<Spbper__1> getSpbpers() {
        return spbpers;
    }

    @JsonProperty("spbpers")
    public void setSpbpers(List<Spbper__1> spbpers) {
        this.spbpers = spbpers;
    }

    public GeneralPersonIdentificationBiographical100PutResponse withSpbpers(List<Spbper__1> spbpers) {
        this.spbpers = spbpers;
        return this;
    }

    @JsonProperty("gorprac")
    public List<Gorprac__1> getGorprac() {
        return gorprac;
    }

    @JsonProperty("gorprac")
    public void setGorprac(List<Gorprac__1> gorprac) {
        this.gorprac = gorprac;
    }

    public GeneralPersonIdentificationBiographical100PutResponse withGorprac(List<Gorprac__1> gorprac) {
        this.gorprac = gorprac;
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

    public GeneralPersonIdentificationBiographical100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationBiographical100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spbpers");
        sb.append('=');
        sb.append(((this.spbpers == null)?"<null>":this.spbpers));
        sb.append(',');
        sb.append("gorprac");
        sb.append('=');
        sb.append(((this.gorprac == null)?"<null>":this.gorprac));
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
        result = ((result* 31)+((this.gorprac == null)? 0 :this.gorprac.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.spbpers == null)? 0 :this.spbpers.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentificationBiographical100PutResponse) == false) {
            return false;
        }
        GeneralPersonIdentificationBiographical100PutResponse rhs = ((GeneralPersonIdentificationBiographical100PutResponse) other);
        return ((((this.gorprac == rhs.gorprac)||((this.gorprac!= null)&&this.gorprac.equals(rhs.gorprac)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.spbpers == rhs.spbpers)||((this.spbpers!= null)&&this.spbpers.equals(rhs.spbpers))));
    }

}
