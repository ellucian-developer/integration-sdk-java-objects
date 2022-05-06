
package com.ellucian.generated.bpapi.ban.approval_queue_codes.v1_0_0;

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
    "queueId",
    "queueLimit",
    "approvalReq",
    "description",
    "nextQueueId"
})
@Generated("jsonschema2pojo")
public class ApprovalQueueCodes100GetRequest {

    /**
     * Queue
     * ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID
     * 
     */
    @JsonProperty("queueId")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_QUEUE_ID")
    private String queueId;
    /**
     * Queue
     * Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_QUEUE_LIMIT")
    private Double queueLimit;
    /**
     * Lineage reference object : FTVAPPQ_APPROVAL_REQ
     * 
     */
    @JsonProperty("approvalReq")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_APPROVAL_REQ")
    private String approvalReq;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_DESCRIPTION")
    private String description;
    /**
     * Next
     * Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID
     * 
     */
    @JsonProperty("nextQueueId")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID")
    private String nextQueueId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Queue
     * ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID
     * 
     */
    @JsonProperty("queueId")
    public String getQueueId() {
        return queueId;
    }

    /**
     * Queue
     * ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID
     * 
     */
    @JsonProperty("queueId")
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public ApprovalQueueCodes100GetRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Queue
     * Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    public Double getQueueLimit() {
        return queueLimit;
    }

    /**
     * Queue
     * Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    public void setQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
    }

    public ApprovalQueueCodes100GetRequest withQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
        return this;
    }

    /**
     * Lineage reference object : FTVAPPQ_APPROVAL_REQ
     * 
     */
    @JsonProperty("approvalReq")
    public String getApprovalReq() {
        return approvalReq;
    }

    /**
     * Lineage reference object : FTVAPPQ_APPROVAL_REQ
     * 
     */
    @JsonProperty("approvalReq")
    public void setApprovalReq(String approvalReq) {
        this.approvalReq = approvalReq;
    }

    public ApprovalQueueCodes100GetRequest withApprovalReq(String approvalReq) {
        this.approvalReq = approvalReq;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ApprovalQueueCodes100GetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Next
     * Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID
     * 
     */
    @JsonProperty("nextQueueId")
    public String getNextQueueId() {
        return nextQueueId;
    }

    /**
     * Next
     * Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID
     * 
     */
    @JsonProperty("nextQueueId")
    public void setNextQueueId(String nextQueueId) {
        this.nextQueueId = nextQueueId;
    }

    public ApprovalQueueCodes100GetRequest withNextQueueId(String nextQueueId) {
        this.nextQueueId = nextQueueId;
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

    public ApprovalQueueCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovalQueueCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queueId");
        sb.append('=');
        sb.append(((this.queueId == null)?"<null>":this.queueId));
        sb.append(',');
        sb.append("queueLimit");
        sb.append('=');
        sb.append(((this.queueLimit == null)?"<null>":this.queueLimit));
        sb.append(',');
        sb.append("approvalReq");
        sb.append('=');
        sb.append(((this.approvalReq == null)?"<null>":this.approvalReq));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("nextQueueId");
        sb.append('=');
        sb.append(((this.nextQueueId == null)?"<null>":this.nextQueueId));
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
        result = ((result* 31)+((this.queueId == null)? 0 :this.queueId.hashCode()));
        result = ((result* 31)+((this.queueLimit == null)? 0 :this.queueLimit.hashCode()));
        result = ((result* 31)+((this.approvalReq == null)? 0 :this.approvalReq.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.nextQueueId == null)? 0 :this.nextQueueId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApprovalQueueCodes100GetRequest) == false) {
            return false;
        }
        ApprovalQueueCodes100GetRequest rhs = ((ApprovalQueueCodes100GetRequest) other);
        return (((((((this.queueId == rhs.queueId)||((this.queueId!= null)&&this.queueId.equals(rhs.queueId)))&&((this.queueLimit == rhs.queueLimit)||((this.queueLimit!= null)&&this.queueLimit.equals(rhs.queueLimit))))&&((this.approvalReq == rhs.approvalReq)||((this.approvalReq!= null)&&this.approvalReq.equals(rhs.approvalReq))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.nextQueueId == rhs.nextQueueId)||((this.nextQueueId!= null)&&this.nextQueueId.equals(rhs.nextQueueId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
