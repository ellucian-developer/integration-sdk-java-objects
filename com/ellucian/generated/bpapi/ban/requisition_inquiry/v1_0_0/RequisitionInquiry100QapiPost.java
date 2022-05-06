
package com.ellucian.generated.bpapi.ban.requisition_inquiry.v1_0_0;

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
    "displayRqstCode"
})
@Generated("jsonschema2pojo")
public class RequisitionInquiry100QapiPost {

    @JsonProperty("displayRqstCode")
    private String displayRqstCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayRqstCode")
    public String getDisplayRqstCode() {
        return displayRqstCode;
    }

    @JsonProperty("displayRqstCode")
    public void setDisplayRqstCode(String displayRqstCode) {
        this.displayRqstCode = displayRqstCode;
    }

    public RequisitionInquiry100QapiPost withDisplayRqstCode(String displayRqstCode) {
        this.displayRqstCode = displayRqstCode;
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

    public RequisitionInquiry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RequisitionInquiry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayRqstCode");
        sb.append('=');
        sb.append(((this.displayRqstCode == null)?"<null>":this.displayRqstCode));
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
        result = ((result* 31)+((this.displayRqstCode == null)? 0 :this.displayRqstCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequisitionInquiry100QapiPost) == false) {
            return false;
        }
        RequisitionInquiry100QapiPost rhs = ((RequisitionInquiry100QapiPost) other);
        return (((this.displayRqstCode == rhs.displayRqstCode)||((this.displayRqstCode!= null)&&this.displayRqstCode.equals(rhs.displayRqstCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
