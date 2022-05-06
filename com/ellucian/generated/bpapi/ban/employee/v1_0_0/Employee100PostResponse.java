
package com.ellucian.generated.bpapi.ban.employee.v1_0_0;

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
    "pebempl"
})
@Generated("jsonschema2pojo")
public class Employee100PostResponse {

    @JsonProperty("key_block")
    private List<KeyBlock__1> keyBlock = new ArrayList<KeyBlock__1>();
    @JsonProperty("pebempl")
    private List<Pebempl__1> pebempl = new ArrayList<Pebempl__1>();
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

    public Employee100PostResponse withKeyBlock(List<KeyBlock__1> keyBlock) {
        this.keyBlock = keyBlock;
        return this;
    }

    @JsonProperty("pebempl")
    public List<Pebempl__1> getPebempl() {
        return pebempl;
    }

    @JsonProperty("pebempl")
    public void setPebempl(List<Pebempl__1> pebempl) {
        this.pebempl = pebempl;
    }

    public Employee100PostResponse withPebempl(List<Pebempl__1> pebempl) {
        this.pebempl = pebempl;
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

    public Employee100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employee100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyBlock");
        sb.append('=');
        sb.append(((this.keyBlock == null)?"<null>":this.keyBlock));
        sb.append(',');
        sb.append("pebempl");
        sb.append('=');
        sb.append(((this.pebempl == null)?"<null>":this.pebempl));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyBlock == null)? 0 :this.keyBlock.hashCode()));
        result = ((result* 31)+((this.pebempl == null)? 0 :this.pebempl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employee100PostResponse) == false) {
            return false;
        }
        Employee100PostResponse rhs = ((Employee100PostResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.keyBlock == rhs.keyBlock)||((this.keyBlock!= null)&&this.keyBlock.equals(rhs.keyBlock))))&&((this.pebempl == rhs.pebempl)||((this.pebempl!= null)&&this.pebempl.equals(rhs.pebempl))));
    }

}
