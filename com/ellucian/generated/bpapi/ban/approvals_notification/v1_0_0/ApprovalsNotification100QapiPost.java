
package com.ellucian.generated.bpapi.ban.approvals_notification.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fovanp2DocCount"
})
@Generated("jsonschema2pojo")
public class ApprovalsNotification100QapiPost {

    /**
     * Number of Documents
     * <p>
     * Lineage reference object : FOVANP2_DOC_COUNT
     * 
     */
    @JsonProperty("fovanp2DocCount")
    @JsonPropertyDescription("Lineage reference object : FOVANP2_DOC_COUNT")
    private Double fovanp2DocCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Number of Documents
     * <p>
     * Lineage reference object : FOVANP2_DOC_COUNT
     * 
     */
    @JsonProperty("fovanp2DocCount")
    public Double getFovanp2DocCount() {
        return fovanp2DocCount;
    }

    /**
     * Number of Documents
     * <p>
     * Lineage reference object : FOVANP2_DOC_COUNT
     * 
     */
    @JsonProperty("fovanp2DocCount")
    public void setFovanp2DocCount(Double fovanp2DocCount) {
        this.fovanp2DocCount = fovanp2DocCount;
    }

    public ApprovalsNotification100QapiPost withFovanp2DocCount(Double fovanp2DocCount) {
        this.fovanp2DocCount = fovanp2DocCount;
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

    public ApprovalsNotification100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovalsNotification100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fovanp2DocCount");
        sb.append('=');
        sb.append(((this.fovanp2DocCount == null)?"<null>":this.fovanp2DocCount));
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
        result = ((result* 31)+((this.fovanp2DocCount == null)? 0 :this.fovanp2DocCount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApprovalsNotification100QapiPost) == false) {
            return false;
        }
        ApprovalsNotification100QapiPost rhs = ((ApprovalsNotification100QapiPost) other);
        return (((this.fovanp2DocCount == rhs.fovanp2DocCount)||((this.fovanp2DocCount!= null)&&this.fovanp2DocCount.equals(rhs.fovanp2DocCount)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
