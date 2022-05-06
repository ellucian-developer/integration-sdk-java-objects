
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
    "criteria.nextQueueId",
    "criteria.description",
    "description",
    "queueLevel",
    "userIdAppr",
    "criteria.queueLimit",
    "criteria.queueId",
    "criteria.queueLevel",
    "queueLimit",
    "criteria.userIdAppr",
    "effDate",
    "nextQueueId",
    "termDate",
    "foraqusQueueLimit",
    "criteria.foraqusQueueLimit"
})
@Generated("jsonschema2pojo")
public class ApprovalQueueMaintenance100PutRequest {

    /**
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("criteria.nextQueueId")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq")
    private String criteriaNextQueueId;
    /**
     * Queue Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("criteria.description")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_DESCRIPTION")
    private String criteriaDescription;
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
     * Queue Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("criteria.queueLimit")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_QUEUE_LIMIT")
    private Double criteriaQueueLimit;
    /**
     * Queue ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq
     * (Required)
     * 
     */
    @JsonProperty("criteria.queueId")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq")
    private String criteriaQueueId;
    /**
     * Level
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("criteria.queueLevel")
    @JsonPropertyDescription("Lineage reference object : FORAQUS_QUEUE_LEVEL")
    private Double criteriaQueueLevel;
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
     * User ID
     * <p>
     * Lineage reference object : FORAQUS_USER_ID_APPR
     * (Required)
     * 
     */
    @JsonProperty("criteria.userIdAppr")
    @JsonPropertyDescription("Lineage reference object : FORAQUS_USER_ID_APPR")
    private String criteriaUserIdAppr;
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
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("nextQueueId")
    @JsonPropertyDescription("Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq")
    private String nextQueueId;
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
    /**
     * Approval Limit
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LIMIT
     * 
     */
    @JsonProperty("criteria.foraqusQueueLimit")
    @JsonPropertyDescription("Lineage reference object : FORAQUS_QUEUE_LIMIT")
    private Double criteriaForaqusQueueLimit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("criteria.nextQueueId")
    public String getCriteriaNextQueueId() {
        return criteriaNextQueueId;
    }

    /**
     * Next Queue
     * <p>
     * Lineage reference object : FTVAPPQ_NEXT_QUEUE_ID, Lookup lineage reference object : ftvappq
     * 
     */
    @JsonProperty("criteria.nextQueueId")
    public void setCriteriaNextQueueId(String criteriaNextQueueId) {
        this.criteriaNextQueueId = criteriaNextQueueId;
    }

    public ApprovalQueueMaintenance100PutRequest withCriteriaNextQueueId(String criteriaNextQueueId) {
        this.criteriaNextQueueId = criteriaNextQueueId;
        return this;
    }

    /**
     * Queue Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("criteria.description")
    public String getCriteriaDescription() {
        return criteriaDescription;
    }

    /**
     * Queue Description
     * <p>
     * Lineage reference object : FTVAPPQ_DESCRIPTION
     * (Required)
     * 
     */
    @JsonProperty("criteria.description")
    public void setCriteriaDescription(String criteriaDescription) {
        this.criteriaDescription = criteriaDescription;
    }

    public ApprovalQueueMaintenance100PutRequest withCriteriaDescription(String criteriaDescription) {
        this.criteriaDescription = criteriaDescription;
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

    public ApprovalQueueMaintenance100PutRequest withDescription(String description) {
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

    public ApprovalQueueMaintenance100PutRequest withQueueLevel(Double queueLevel) {
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

    public ApprovalQueueMaintenance100PutRequest withUserIdAppr(String userIdAppr) {
        this.userIdAppr = userIdAppr;
        return this;
    }

    /**
     * Queue Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("criteria.queueLimit")
    public Double getCriteriaQueueLimit() {
        return criteriaQueueLimit;
    }

    /**
     * Queue Limit
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_LIMIT
     * 
     */
    @JsonProperty("criteria.queueLimit")
    public void setCriteriaQueueLimit(Double criteriaQueueLimit) {
        this.criteriaQueueLimit = criteriaQueueLimit;
    }

    public ApprovalQueueMaintenance100PutRequest withCriteriaQueueLimit(Double criteriaQueueLimit) {
        this.criteriaQueueLimit = criteriaQueueLimit;
        return this;
    }

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq
     * (Required)
     * 
     */
    @JsonProperty("criteria.queueId")
    public String getCriteriaQueueId() {
        return criteriaQueueId;
    }

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FTVAPPQ_QUEUE_ID, Lookup lineage reference object : ftvappq
     * (Required)
     * 
     */
    @JsonProperty("criteria.queueId")
    public void setCriteriaQueueId(String criteriaQueueId) {
        this.criteriaQueueId = criteriaQueueId;
    }

    public ApprovalQueueMaintenance100PutRequest withCriteriaQueueId(String criteriaQueueId) {
        this.criteriaQueueId = criteriaQueueId;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("criteria.queueLevel")
    public Double getCriteriaQueueLevel() {
        return criteriaQueueLevel;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("criteria.queueLevel")
    public void setCriteriaQueueLevel(Double criteriaQueueLevel) {
        this.criteriaQueueLevel = criteriaQueueLevel;
    }

    public ApprovalQueueMaintenance100PutRequest withCriteriaQueueLevel(Double criteriaQueueLevel) {
        this.criteriaQueueLevel = criteriaQueueLevel;
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

    public ApprovalQueueMaintenance100PutRequest withQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FORAQUS_USER_ID_APPR
     * (Required)
     * 
     */
    @JsonProperty("criteria.userIdAppr")
    public String getCriteriaUserIdAppr() {
        return criteriaUserIdAppr;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FORAQUS_USER_ID_APPR
     * (Required)
     * 
     */
    @JsonProperty("criteria.userIdAppr")
    public void setCriteriaUserIdAppr(String criteriaUserIdAppr) {
        this.criteriaUserIdAppr = criteriaUserIdAppr;
    }

    public ApprovalQueueMaintenance100PutRequest withCriteriaUserIdAppr(String criteriaUserIdAppr) {
        this.criteriaUserIdAppr = criteriaUserIdAppr;
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

    public ApprovalQueueMaintenance100PutRequest withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public ApprovalQueueMaintenance100PutRequest withNextQueueId(String nextQueueId) {
        this.nextQueueId = nextQueueId;
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

    public ApprovalQueueMaintenance100PutRequest withTermDate(Date termDate) {
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

    public ApprovalQueueMaintenance100PutRequest withForaqusQueueLimit(Double foraqusQueueLimit) {
        this.foraqusQueueLimit = foraqusQueueLimit;
        return this;
    }

    /**
     * Approval Limit
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LIMIT
     * 
     */
    @JsonProperty("criteria.foraqusQueueLimit")
    public Double getCriteriaForaqusQueueLimit() {
        return criteriaForaqusQueueLimit;
    }

    /**
     * Approval Limit
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LIMIT
     * 
     */
    @JsonProperty("criteria.foraqusQueueLimit")
    public void setCriteriaForaqusQueueLimit(Double criteriaForaqusQueueLimit) {
        this.criteriaForaqusQueueLimit = criteriaForaqusQueueLimit;
    }

    public ApprovalQueueMaintenance100PutRequest withCriteriaForaqusQueueLimit(Double criteriaForaqusQueueLimit) {
        this.criteriaForaqusQueueLimit = criteriaForaqusQueueLimit;
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

    public ApprovalQueueMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovalQueueMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaNextQueueId");
        sb.append('=');
        sb.append(((this.criteriaNextQueueId == null)?"<null>":this.criteriaNextQueueId));
        sb.append(',');
        sb.append("criteriaDescription");
        sb.append('=');
        sb.append(((this.criteriaDescription == null)?"<null>":this.criteriaDescription));
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
        sb.append("criteriaQueueLimit");
        sb.append('=');
        sb.append(((this.criteriaQueueLimit == null)?"<null>":this.criteriaQueueLimit));
        sb.append(',');
        sb.append("criteriaQueueId");
        sb.append('=');
        sb.append(((this.criteriaQueueId == null)?"<null>":this.criteriaQueueId));
        sb.append(',');
        sb.append("criteriaQueueLevel");
        sb.append('=');
        sb.append(((this.criteriaQueueLevel == null)?"<null>":this.criteriaQueueLevel));
        sb.append(',');
        sb.append("queueLimit");
        sb.append('=');
        sb.append(((this.queueLimit == null)?"<null>":this.queueLimit));
        sb.append(',');
        sb.append("criteriaUserIdAppr");
        sb.append('=');
        sb.append(((this.criteriaUserIdAppr == null)?"<null>":this.criteriaUserIdAppr));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("nextQueueId");
        sb.append('=');
        sb.append(((this.nextQueueId == null)?"<null>":this.nextQueueId));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("foraqusQueueLimit");
        sb.append('=');
        sb.append(((this.foraqusQueueLimit == null)?"<null>":this.foraqusQueueLimit));
        sb.append(',');
        sb.append("criteriaForaqusQueueLimit");
        sb.append('=');
        sb.append(((this.criteriaForaqusQueueLimit == null)?"<null>":this.criteriaForaqusQueueLimit));
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
        result = ((result* 31)+((this.criteriaForaqusQueueLimit == null)? 0 :this.criteriaForaqusQueueLimit.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.queueLevel == null)? 0 :this.queueLevel.hashCode()));
        result = ((result* 31)+((this.userIdAppr == null)? 0 :this.userIdAppr.hashCode()));
        result = ((result* 31)+((this.criteriaQueueLevel == null)? 0 :this.criteriaQueueLevel.hashCode()));
        result = ((result* 31)+((this.criteriaUserIdAppr == null)? 0 :this.criteriaUserIdAppr.hashCode()));
        result = ((result* 31)+((this.criteriaNextQueueId == null)? 0 :this.criteriaNextQueueId.hashCode()));
        result = ((result* 31)+((this.queueLimit == null)? 0 :this.queueLimit.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.criteriaQueueLimit == null)? 0 :this.criteriaQueueLimit.hashCode()));
        result = ((result* 31)+((this.nextQueueId == null)? 0 :this.nextQueueId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.criteriaDescription == null)? 0 :this.criteriaDescription.hashCode()));
        result = ((result* 31)+((this.foraqusQueueLimit == null)? 0 :this.foraqusQueueLimit.hashCode()));
        result = ((result* 31)+((this.criteriaQueueId == null)? 0 :this.criteriaQueueId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApprovalQueueMaintenance100PutRequest) == false) {
            return false;
        }
        ApprovalQueueMaintenance100PutRequest rhs = ((ApprovalQueueMaintenance100PutRequest) other);
        return (((((((((((((((((this.criteriaForaqusQueueLimit == rhs.criteriaForaqusQueueLimit)||((this.criteriaForaqusQueueLimit!= null)&&this.criteriaForaqusQueueLimit.equals(rhs.criteriaForaqusQueueLimit)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.queueLevel == rhs.queueLevel)||((this.queueLevel!= null)&&this.queueLevel.equals(rhs.queueLevel))))&&((this.userIdAppr == rhs.userIdAppr)||((this.userIdAppr!= null)&&this.userIdAppr.equals(rhs.userIdAppr))))&&((this.criteriaQueueLevel == rhs.criteriaQueueLevel)||((this.criteriaQueueLevel!= null)&&this.criteriaQueueLevel.equals(rhs.criteriaQueueLevel))))&&((this.criteriaUserIdAppr == rhs.criteriaUserIdAppr)||((this.criteriaUserIdAppr!= null)&&this.criteriaUserIdAppr.equals(rhs.criteriaUserIdAppr))))&&((this.criteriaNextQueueId == rhs.criteriaNextQueueId)||((this.criteriaNextQueueId!= null)&&this.criteriaNextQueueId.equals(rhs.criteriaNextQueueId))))&&((this.queueLimit == rhs.queueLimit)||((this.queueLimit!= null)&&this.queueLimit.equals(rhs.queueLimit))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.criteriaQueueLimit == rhs.criteriaQueueLimit)||((this.criteriaQueueLimit!= null)&&this.criteriaQueueLimit.equals(rhs.criteriaQueueLimit))))&&((this.nextQueueId == rhs.nextQueueId)||((this.nextQueueId!= null)&&this.nextQueueId.equals(rhs.nextQueueId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.criteriaDescription == rhs.criteriaDescription)||((this.criteriaDescription!= null)&&this.criteriaDescription.equals(rhs.criteriaDescription))))&&((this.foraqusQueueLimit == rhs.foraqusQueueLimit)||((this.foraqusQueueLimit!= null)&&this.foraqusQueueLimit.equals(rhs.foraqusQueueLimit))))&&((this.criteriaQueueId == rhs.criteriaQueueId)||((this.criteriaQueueId!= null)&&this.criteriaQueueId.equals(rhs.criteriaQueueId))));
    }

}
