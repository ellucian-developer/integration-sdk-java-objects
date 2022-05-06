
package com.ellucian.generated.bpapi.ban.registration_minimum_maximum_hours.v1_0_0;

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
    "xxxxxxxTermCode"
})
@Generated("jsonschema2pojo")
public class RegistrationMinimumMaximumHours100QapiPost {

    @JsonProperty("xxxxxxxTermCode")
    private String xxxxxxxTermCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("xxxxxxxTermCode")
    public String getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(String xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public RegistrationMinimumMaximumHours100QapiPost withXxxxxxxTermCode(String xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
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

    public RegistrationMinimumMaximumHours100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationMinimumMaximumHours100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xxxxxxxTermCode");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCode == null)?"<null>":this.xxxxxxxTermCode));
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
        result = ((result* 31)+((this.xxxxxxxTermCode == null)? 0 :this.xxxxxxxTermCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationMinimumMaximumHours100QapiPost) == false) {
            return false;
        }
        RegistrationMinimumMaximumHours100QapiPost rhs = ((RegistrationMinimumMaximumHours100QapiPost) other);
        return (((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
