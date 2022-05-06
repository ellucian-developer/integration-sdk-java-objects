
package com.ellucian.generated.bpapi.ban.grant_summary_query.v1_0_0;

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
    "keyblckGrntCode"
})
@Generated("jsonschema2pojo")
public class GrantSummaryQuery100QapiPost {

    @JsonProperty("keyblckGrntCode")
    private String keyblckGrntCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckGrntCode")
    public String getKeyblckGrntCode() {
        return keyblckGrntCode;
    }

    @JsonProperty("keyblckGrntCode")
    public void setKeyblckGrntCode(String keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
    }

    public GrantSummaryQuery100QapiPost withKeyblckGrntCode(String keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
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

    public GrantSummaryQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantSummaryQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckGrntCode");
        sb.append('=');
        sb.append(((this.keyblckGrntCode == null)?"<null>":this.keyblckGrntCode));
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
        result = ((result* 31)+((this.keyblckGrntCode == null)? 0 :this.keyblckGrntCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantSummaryQuery100QapiPost) == false) {
            return false;
        }
        GrantSummaryQuery100QapiPost rhs = ((GrantSummaryQuery100QapiPost) other);
        return (((this.keyblckGrntCode == rhs.keyblckGrntCode)||((this.keyblckGrntCode!= null)&&this.keyblckGrntCode.equals(rhs.keyblckGrntCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
