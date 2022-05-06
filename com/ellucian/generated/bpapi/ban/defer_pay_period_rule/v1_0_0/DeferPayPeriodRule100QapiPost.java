
package com.ellucian.generated.bpapi.ban.defer_pay_period_rule.v1_0_0;

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
    "dfprCode"
})
@Generated("jsonschema2pojo")
public class DeferPayPeriodRule100QapiPost {

    @JsonProperty("dfprCode")
    private String dfprCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dfprCode")
    public String getDfprCode() {
        return dfprCode;
    }

    @JsonProperty("dfprCode")
    public void setDfprCode(String dfprCode) {
        this.dfprCode = dfprCode;
    }

    public DeferPayPeriodRule100QapiPost withDfprCode(String dfprCode) {
        this.dfprCode = dfprCode;
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

    public DeferPayPeriodRule100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeferPayPeriodRule100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dfprCode");
        sb.append('=');
        sb.append(((this.dfprCode == null)?"<null>":this.dfprCode));
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
        result = ((result* 31)+((this.dfprCode == null)? 0 :this.dfprCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeferPayPeriodRule100QapiPost) == false) {
            return false;
        }
        DeferPayPeriodRule100QapiPost rhs = ((DeferPayPeriodRule100QapiPost) other);
        return (((this.dfprCode == rhs.dfprCode)||((this.dfprCode!= null)&&this.dfprCode.equals(rhs.dfprCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
