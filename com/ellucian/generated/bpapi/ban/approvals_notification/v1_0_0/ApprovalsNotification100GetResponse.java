
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
    "fovanp2DocCount",
    "ftvdtypDesc",
    "message1"
})
@Generated("jsonschema2pojo")
public class ApprovalsNotification100GetResponse {

    /**
     * Number of Documents
     * <p>
     * Lineage reference object : FOVANP2_DOC_COUNT
     * 
     */
    @JsonProperty("fovanp2DocCount")
    @JsonPropertyDescription("Lineage reference object : FOVANP2_DOC_COUNT")
    private Double fovanp2DocCount;
    /**
     * Document Type
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvdtypDesc")
    private String ftvdtypDesc;
    /**
     * Message
     * <p>
     * 
     * 
     */
    @JsonProperty("message1")
    private String message1;
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

    public ApprovalsNotification100GetResponse withFovanp2DocCount(Double fovanp2DocCount) {
        this.fovanp2DocCount = fovanp2DocCount;
        return this;
    }

    /**
     * Document Type
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvdtypDesc")
    public String getFtvdtypDesc() {
        return ftvdtypDesc;
    }

    /**
     * Document Type
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvdtypDesc")
    public void setFtvdtypDesc(String ftvdtypDesc) {
        this.ftvdtypDesc = ftvdtypDesc;
    }

    public ApprovalsNotification100GetResponse withFtvdtypDesc(String ftvdtypDesc) {
        this.ftvdtypDesc = ftvdtypDesc;
        return this;
    }

    /**
     * Message
     * <p>
     * 
     * 
     */
    @JsonProperty("message1")
    public String getMessage1() {
        return message1;
    }

    /**
     * Message
     * <p>
     * 
     * 
     */
    @JsonProperty("message1")
    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public ApprovalsNotification100GetResponse withMessage1(String message1) {
        this.message1 = message1;
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

    public ApprovalsNotification100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovalsNotification100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fovanp2DocCount");
        sb.append('=');
        sb.append(((this.fovanp2DocCount == null)?"<null>":this.fovanp2DocCount));
        sb.append(',');
        sb.append("ftvdtypDesc");
        sb.append('=');
        sb.append(((this.ftvdtypDesc == null)?"<null>":this.ftvdtypDesc));
        sb.append(',');
        sb.append("message1");
        sb.append('=');
        sb.append(((this.message1 == null)?"<null>":this.message1));
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
        result = ((result* 31)+((this.fovanp2DocCount == null)? 0 :this.fovanp2DocCount.hashCode()));
        result = ((result* 31)+((this.ftvdtypDesc == null)? 0 :this.ftvdtypDesc.hashCode()));
        result = ((result* 31)+((this.message1 == null)? 0 :this.message1 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApprovalsNotification100GetResponse) == false) {
            return false;
        }
        ApprovalsNotification100GetResponse rhs = ((ApprovalsNotification100GetResponse) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.fovanp2DocCount == rhs.fovanp2DocCount)||((this.fovanp2DocCount!= null)&&this.fovanp2DocCount.equals(rhs.fovanp2DocCount))))&&((this.ftvdtypDesc == rhs.ftvdtypDesc)||((this.ftvdtypDesc!= null)&&this.ftvdtypDesc.equals(rhs.ftvdtypDesc))))&&((this.message1 == rhs.message1)||((this.message1 != null)&&this.message1 .equals(rhs.message1))));
    }

}
