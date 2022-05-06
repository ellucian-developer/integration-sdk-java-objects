
package com.ellucian.generated.bpapi.ban.approval_queue_maintenance.v1_0_0;

import java.util.Date;
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
    "effDate",
    "description",
    "queueLevel",
    "userIdAppr",
    "termDate",
    "foraqusQueueLimit"
})
@Generated("jsonschema2pojo")
public class ApprovalQueueMaintenance100PostRequest {

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
     * Effective Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    private Date effDate;
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
     * Termination Date
     * <p>
     * 
     * 
     */
    @JsonProperty("termDate")
    private Date termDate;
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

    public ApprovalQueueMaintenance100PostRequest withQueueId(String queueId) {
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

    public ApprovalQueueMaintenance100PostRequest withQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public ApprovalQueueMaintenance100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public ApprovalQueueMaintenance100PostRequest withDescription(String description) {
        this.description = description;
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

    public ApprovalQueueMaintenance100PostRequest withQueueLevel(Double queueLevel) {
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

    public ApprovalQueueMaintenance100PostRequest withUserIdAppr(String userIdAppr) {
        this.userIdAppr = userIdAppr;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * 
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * 
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public ApprovalQueueMaintenance100PostRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public ApprovalQueueMaintenance100PostRequest withForaqusQueueLimit(Double foraqusQueueLimit) {
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

    public ApprovalQueueMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovalQueueMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queueId");
        sb.append('=');
        sb.append(((this.queueId == null)?"<null>":this.queueId));
        sb.append(',');
        sb.append("queueLimit");
        sb.append('=');
        sb.append(((this.queueLimit == null)?"<null>":this.queueLimit));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("queueLevel");
        sb.append('=');
        sb.append(((this.queueLevel == null)?"<null>":this.queueLevel));
        sb.append(',');
        sb.append("userIdAppr");
        sb.append('=');
        sb.append(((this.userIdAppr == null)?"<null>":this.userIdAppr));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.queueLevel == null)? 0 :this.queueLevel.hashCode()));
        result = ((result* 31)+((this.userIdAppr == null)? 0 :this.userIdAppr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.foraqusQueueLimit == null)? 0 :this.foraqusQueueLimit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApprovalQueueMaintenance100PostRequest) == false) {
            return false;
        }
        ApprovalQueueMaintenance100PostRequest rhs = ((ApprovalQueueMaintenance100PostRequest) other);
        return ((((((((((this.queueId == rhs.queueId)||((this.queueId!= null)&&this.queueId.equals(rhs.queueId)))&&((this.queueLimit == rhs.queueLimit)||((this.queueLimit!= null)&&this.queueLimit.equals(rhs.queueLimit))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.queueLevel == rhs.queueLevel)||((this.queueLevel!= null)&&this.queueLevel.equals(rhs.queueLevel))))&&((this.userIdAppr == rhs.userIdAppr)||((this.userIdAppr!= null)&&this.userIdAppr.equals(rhs.userIdAppr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.foraqusQueueLimit == rhs.foraqusQueueLimit)||((this.foraqusQueueLimit!= null)&&this.foraqusQueueLimit.equals(rhs.foraqusQueueLimit))));
    }

}
