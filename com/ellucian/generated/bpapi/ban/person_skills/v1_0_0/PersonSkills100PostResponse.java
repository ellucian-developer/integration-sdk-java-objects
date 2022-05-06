
package com.ellucian.generated.bpapi.ban.person_skills.v1_0_0;

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
    "key_block",
    "pprskil"
})
@Generated("jsonschema2pojo")
public class PersonSkills100PostResponse {

    @JsonProperty("key_block")
    private List<KeyBlock__1> keyBlock = new ArrayList<KeyBlock__1>();
    @JsonProperty("pprskil")
    private List<Pprskil__1> pprskil = new ArrayList<Pprskil__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("key_block")
    public List<KeyBlock__1> getKeyBlock() {
        return keyBlock;
    }

    @JsonProperty("key_block")
    public void setKeyBlock(List<KeyBlock__1> keyBlock) {
        this.keyBlock = keyBlock;
    }

    public PersonSkills100PostResponse withKeyBlock(List<KeyBlock__1> keyBlock) {
        this.keyBlock = keyBlock;
        return this;
    }

    @JsonProperty("pprskil")
    public List<Pprskil__1> getPprskil() {
        return pprskil;
    }

    @JsonProperty("pprskil")
    public void setPprskil(List<Pprskil__1> pprskil) {
        this.pprskil = pprskil;
    }

    public PersonSkills100PostResponse withPprskil(List<Pprskil__1> pprskil) {
        this.pprskil = pprskil;
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

    public PersonSkills100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonSkills100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyBlock");
        sb.append('=');
        sb.append(((this.keyBlock == null)?"<null>":this.keyBlock));
        sb.append(',');
        sb.append("pprskil");
        sb.append('=');
        sb.append(((this.pprskil == null)?"<null>":this.pprskil));
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
        result = ((result* 31)+((this.pprskil == null)? 0 :this.pprskil.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyBlock == null)? 0 :this.keyBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonSkills100PostResponse) == false) {
            return false;
        }
        PersonSkills100PostResponse rhs = ((PersonSkills100PostResponse) other);
        return ((((this.pprskil == rhs.pprskil)||((this.pprskil!= null)&&this.pprskil.equals(rhs.pprskil)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyBlock == rhs.keyBlock)||((this.keyBlock!= null)&&this.keyBlock.equals(rhs.keyBlock))));
    }

}
