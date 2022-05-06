
package com.ellucian.generated.bpapi.ban.detail_encumbrance_activity.v1_0_0;

import java.util.HashMap;
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
    "encumbranceNumber"
})
@Generated("jsonschema2pojo")
public class DetailEncumbranceActivity100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("encumbranceNumber")
    private String encumbranceNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("encumbranceNumber")
    public String getEncumbranceNumber() {
        return encumbranceNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("encumbranceNumber")
    public void setEncumbranceNumber(String encumbranceNumber) {
        this.encumbranceNumber = encumbranceNumber;
    }

    public DetailEncumbranceActivity100QapiPost withEncumbranceNumber(String encumbranceNumber) {
        this.encumbranceNumber = encumbranceNumber;
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

    public DetailEncumbranceActivity100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetailEncumbranceActivity100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("encumbranceNumber");
        sb.append('=');
        sb.append(((this.encumbranceNumber == null)?"<null>":this.encumbranceNumber));
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
        result = ((result* 31)+((this.encumbranceNumber == null)? 0 :this.encumbranceNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetailEncumbranceActivity100QapiPost) == false) {
            return false;
        }
        DetailEncumbranceActivity100QapiPost rhs = ((DetailEncumbranceActivity100QapiPost) other);
        return (((this.encumbranceNumber == rhs.encumbranceNumber)||((this.encumbranceNumber!= null)&&this.encumbranceNumber.equals(rhs.encumbranceNumber)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
