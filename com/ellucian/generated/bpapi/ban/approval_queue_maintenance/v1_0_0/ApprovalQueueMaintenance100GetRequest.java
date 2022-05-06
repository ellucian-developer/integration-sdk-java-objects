
package com.ellucian.generated.bpapi.ban.approval_queue_maintenance.v1_0_0;

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
    "description",
    "nextQueueId",
    "queueLevel",
    "userIdAppr",
    "foraqusQueueLimit"
})
@Generated("jsonschema2pojo")
public class ApprovalQueueMaintenance100GetRequest {

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq
     * (Required)
     * 
     */
    @JsonProperty("queueId")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq")
    private String queueId;
    /**
     * Queue Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_QUEUE_LIMIT")
    private Double queueLimit;
    /**
     * Queue Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_DESCRIPTION")
    private String description;
    /**
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("nextQueueId")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq")
    private String nextQueueId;
    /**
     * Level
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("queueLevel")
    @JsonPropertyDescription("Lineage reference object : FORAQUS_QUEUE_LEVEL")
    private Double queueLevel;
    /**
     * User ID
     * <p>
     * Lineage reference object : FORAQUS_USER_ID_APPR
     * (Required)
     * 
     */
    @JsonProperty("userIdAppr")
    @JsonPropertyDescription("Lineage reference object : FORAQUS_USER_ID_APPR")
    private String userIdAppr;
    /**
     * Approval Limit
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LIMIT
     * 
     */
    @JsonProperty("foraqusQueueLimit")
    @JsonPropertyDescription("Lineage reference object : FORAQUS_QUEUE_LIMIT")
    private Double foraqusQueueLimit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq
     * (Required)
     * 
     */
    @JsonProperty("queueId")
    public String getQueueId() {
        return queueId;
    }

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq
     * (Required)
     * 
     */
    @JsonProperty("queueId")
    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public ApprovalQueueMaintenance100GetRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Queue Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    public Double getQueueLimit() {
        return queueLimit;
    }

    /**
     * Queue Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    public void setQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
    }

    public ApprovalQueueMaintenance100GetRequest withQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
        return this;
    }

    /**
     * Queue Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Queue Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ApprovalQueueMaintenance100GetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("nextQueueId")
    public String getNextQueueId() {
        return nextQueueId;
    }

    /**
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("nextQueueId")
    public void setNextQueueId(String nextQueueId) {
        this.nextQueueId = nextQueueId;
    }

    public ApprovalQueueMaintenance100GetRequest withNextQueueId(String nextQueueId) {
        this.nextQueueId = nextQueueId;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("queueLevel")
    public Double getQueueLevel() {
        return queueLevel;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("queueLevel")
    public void setQueueLevel(Double queueLevel) {
        this.queueLevel = queueLevel;
    }

    public ApprovalQueueMaintenance100GetRequest withQueueLevel(Double queueLevel) {
        this.queueLevel = queueLevel;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FORAQUS_USER_ID_APPR
     * (Required)
     * 
     */
    @JsonProperty("userIdAppr")
    public String getUserIdAppr() {
        return userIdAppr;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FORAQUS_USER_ID_APPR
     * (Required)
     * 
     */
    @JsonProperty("userIdAppr")
    public void setUserIdAppr(String userIdAppr) {
        this.userIdAppr = userIdAppr;
    }

    public ApprovalQueueMaintenance100GetRequest withUserIdAppr(String userIdAppr) {
        this.userIdAppr = userIdAppr;
        return this;
    }

    /**
     * Approval Limit
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LIMIT
     * 
     */
    @JsonProperty("foraqusQueueLimit")
    public Double getForaqusQueueLimit() {
        return foraqusQueueLimit;
    }

    /**
     * Approval Limit
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LIMIT
     * 
     */
    @JsonProperty("foraqusQueueLimit")
    public void setForaqusQueueLimit(Double foraqusQueueLimit) {
        this.foraqusQueueLimit = foraqusQueueLimit;
    }

    public ApprovalQueueMaintenance100GetRequest withForaqusQueueLimit(Double foraqusQueueLimit) {
        this.foraqusQueueLimit = foraqusQueueLimit;
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

    public ApprovalQueueMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovalQueueMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queueId");
        sb.append('=');
        sb.append(((this.queueId == null)?"<null>":this.queueId));
        sb.append(',');
        sb.append("queueLimit");
        sb.append('=');
        sb.append(((this.queueLimit == null)?"<null>":this.queueLimit));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("nextQueueId");
        sb.append('=');
        sb.append(((this.nextQueueId == null)?"<null>":this.nextQueueId));
        sb.append(',');
        sb.append("queueLevel");
        sb.append('=');
        sb.append(((this.queueLevel == null)?"<null>":this.queueLevel));
        sb.append(',');
        sb.append("userIdAppr");
        sb.append('=');
        sb.append(((this.userIdAppr == null)?"<null>":this.userIdAppr));
        sb.append(',');
        sb.append("foraqusQueueLimit");
        sb.append('=');
        sb.append(((this.foraqusQueueLimit == null)?"<null>":this.foraqusQueueLimit));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.nextQueueId == null)? 0 :this.nextQueueId.hashCode()));
        result = ((result* 31)+((this.queueLevel == null)? 0 :this.queueLevel.hashCode()));
        result = ((result* 31)+((this.userIdAppr == null)? 0 :this.userIdAppr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.foraqusQueueLimit == null)? 0 :this.foraqusQueueLimit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApprovalQueueMaintenance100GetRequest) == false) {
            return false;
        }
        ApprovalQueueMaintenance100GetRequest rhs = ((ApprovalQueueMaintenance100GetRequest) other);
        return (((((((((this.queueId == rhs.queueId)||((this.queueId!= null)&&this.queueId.equals(rhs.queueId)))&&((this.queueLimit == rhs.queueLimit)||((this.queueLimit!= null)&&this.queueLimit.equals(rhs.queueLimit))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.nextQueueId == rhs.nextQueueId)||((this.nextQueueId!= null)&&this.nextQueueId.equals(rhs.nextQueueId))))&&((this.queueLevel == rhs.queueLevel)||((this.queueLevel!= null)&&this.queueLevel.equals(rhs.queueLevel))))&&((this.userIdAppr == rhs.userIdAppr)||((this.userIdAppr!= null)&&this.userIdAppr.equals(rhs.userIdAppr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.foraqusQueueLimit == rhs.foraqusQueueLimit)||((this.foraqusQueueLimit!= null)&&this.foraqusQueueLimit.equals(rhs.foraqusQueueLimit))));
    }

}
