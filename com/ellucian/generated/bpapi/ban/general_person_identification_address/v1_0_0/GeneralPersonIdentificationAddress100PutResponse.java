
package com.ellucian.generated.bpapi.ban.general_person_identification_address.v1_0_0;

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
    "spraddr"
})
@Generated("jsonschema2pojo")
public class GeneralPersonIdentificationAddress100PutResponse {

    @JsonProperty("spriden_current")
    private List<SpridenCurrent__1> spridenCurrent = new ArrayList<SpridenCurrent__1>();
    @JsonProperty("spraddr")
    private List<Spraddr__1> spraddr = new ArrayList<Spraddr__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("spriden_current")
    public List<SpridenCurrent__1> getSpridenCurrent() {
        return spridenCurrent;
    }

    @JsonProperty("spriden_current")
    public void setSpridenCurrent(List<SpridenCurrent__1> spridenCurrent) {
        this.spridenCurrent = spridenCurrent;
    }

    public GeneralPersonIdentificationAddress100PutResponse withSpridenCurrent(List<SpridenCurrent__1> spridenCurrent) {
        this.spridenCurrent = spridenCurrent;
        return this;
    }

    @JsonProperty("spraddr")
    public List<Spraddr__1> getSpraddr() {
        return spraddr;
    }

    @JsonProperty("spraddr")
    public void setSpraddr(List<Spraddr__1> spraddr) {
        this.spraddr = spraddr;
    }

    public GeneralPersonIdentificationAddress100PutResponse withSpraddr(List<Spraddr__1> spraddr) {
        this.spraddr = spraddr;
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

    public GeneralPersonIdentificationAddress100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPersonIdentificationAddress100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spridenCurrent");
        sb.append('=');
        sb.append(((this.spridenCurrent == null)?"<null>":this.spridenCurrent));
        sb.append(',');
        sb.append("spraddr");
        sb.append('=');
        sb.append(((this.spraddr == null)?"<null>":this.spraddr));
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
        result = ((result* 31)+((this.spraddr == null)? 0 :this.spraddr.hashCode()));
        result = ((result* 31)+((this.spridenCurrent == null)? 0 :this.spridenCurrent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPersonIdentificationAddress100PutResponse) == false) {
            return false;
        }
        GeneralPersonIdentificationAddress100PutResponse rhs = ((GeneralPersonIdentificationAddress100PutResponse) other);
        return ((((this.spraddr == rhs.spraddr)||((this.spraddr!= null)&&this.spraddr.equals(rhs.spraddr)))&&((this.spridenCurrent == rhs.spridenCurrent)||((this.spridenCurrent!= null)&&this.spridenCurrent.equals(rhs.spridenCurrent))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
