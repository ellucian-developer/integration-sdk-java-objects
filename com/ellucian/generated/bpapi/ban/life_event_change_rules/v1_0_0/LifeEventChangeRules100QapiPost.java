
package com.ellucian.generated.bpapi.ban.life_event_change_rules.v1_0_0;

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
    "breaCode",
    "bdocCode"
})
@Generated("jsonschema2pojo")
public class LifeEventChangeRules100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("breaCode")
    private String breaCode;
    @JsonProperty("bdocCode")
    private String bdocCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("breaCode")
    public String getBreaCode() {
        return breaCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("breaCode")
    public void setBreaCode(String breaCode) {
        this.breaCode = breaCode;
    }

    public LifeEventChangeRules100QapiPost withBreaCode(String breaCode) {
        this.breaCode = breaCode;
        return this;
    }

    @JsonProperty("bdocCode")
    public String getBdocCode() {
        return bdocCode;
    }

    @JsonProperty("bdocCode")
    public void setBdocCode(String bdocCode) {
        this.bdocCode = bdocCode;
    }

    public LifeEventChangeRules100QapiPost withBdocCode(String bdocCode) {
        this.bdocCode = bdocCode;
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

    public LifeEventChangeRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LifeEventChangeRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("breaCode");
        sb.append('=');
        sb.append(((this.breaCode == null)?"<null>":this.breaCode));
        sb.append(',');
        sb.append("bdocCode");
        sb.append('=');
        sb.append(((this.bdocCode == null)?"<null>":this.bdocCode));
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
        result = ((result* 31)+((this.breaCode == null)? 0 :this.breaCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bdocCode == null)? 0 :this.bdocCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifeEventChangeRules100QapiPost) == false) {
            return false;
        }
        LifeEventChangeRules100QapiPost rhs = ((LifeEventChangeRules100QapiPost) other);
        return ((((this.breaCode == rhs.breaCode)||((this.breaCode!= null)&&this.breaCode.equals(rhs.breaCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bdocCode == rhs.bdocCode)||((this.bdocCode!= null)&&this.bdocCode.equals(rhs.bdocCode))));
    }

}
