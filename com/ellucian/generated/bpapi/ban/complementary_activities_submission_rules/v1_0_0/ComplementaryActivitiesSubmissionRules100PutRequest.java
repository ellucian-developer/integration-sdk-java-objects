
package com.ellucian.generated.bpapi.ban.complementary_activities_submission_rules.v1_0_0;

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
    "criteria.minHrs",
    "criteria.actcCode",
    "criteria.activityDate",
    "criteria.userId",
    "criteria.accgCode",
    "maxHrs",
    "minHrs",
    "criteria.maxHrs",
    "actcCode",
    "criteria.actcDesc"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesSubmissionRules100PutRequest {

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("criteria.minHrs")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_MIN_HRS")
    private Double criteriaMinHrs;
    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.actcCode")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_ACTC_CODE")
    private String criteriaActcCode;
    /**
     * Lineage reference object : SOBCASR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : SOBCASR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_USER_ID")
    private String criteriaUserId;
    @JsonProperty("criteria.accgCode")
    private String criteriaAccgCode;
    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_MAX_HRS")
    private Double maxHrs;
    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_MIN_HRS")
    private Double minHrs;
    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("criteria.maxHrs")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_MAX_HRS")
    private Double criteriaMaxHrs;
    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_ACTC_CODE")
    private String actcCode;
    @JsonProperty("criteria.actcDesc")
    private String criteriaActcDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("criteria.minHrs")
    public Double getCriteriaMinHrs() {
        return criteriaMinHrs;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("criteria.minHrs")
    public void setCriteriaMinHrs(Double criteriaMinHrs) {
        this.criteriaMinHrs = criteriaMinHrs;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withCriteriaMinHrs(Double criteriaMinHrs) {
        this.criteriaMinHrs = criteriaMinHrs;
        return this;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.actcCode")
    public String getCriteriaActcCode() {
        return criteriaActcCode;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.actcCode")
    public void setCriteriaActcCode(String criteriaActcCode) {
        this.criteriaActcCode = criteriaActcCode;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withCriteriaActcCode(String criteriaActcCode) {
        this.criteriaActcCode = criteriaActcCode;
        return this;
    }

    /**
     * Lineage reference object : SOBCASR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : SOBCASR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Lineage reference object : SOBCASR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : SOBCASR_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    @JsonProperty("criteria.accgCode")
    public String getCriteriaAccgCode() {
        return criteriaAccgCode;
    }

    @JsonProperty("criteria.accgCode")
    public void setCriteriaAccgCode(String criteriaAccgCode) {
        this.criteriaAccgCode = criteriaAccgCode;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withCriteriaAccgCode(String criteriaAccgCode) {
        this.criteriaAccgCode = criteriaAccgCode;
        return this;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    public Double getMaxHrs() {
        return maxHrs;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    public void setMaxHrs(Double maxHrs) {
        this.maxHrs = maxHrs;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withMaxHrs(Double maxHrs) {
        this.maxHrs = maxHrs;
        return this;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public Double getMinHrs() {
        return minHrs;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public void setMinHrs(Double minHrs) {
        this.minHrs = minHrs;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withMinHrs(Double minHrs) {
        this.minHrs = minHrs;
        return this;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("criteria.maxHrs")
    public Double getCriteriaMaxHrs() {
        return criteriaMaxHrs;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("criteria.maxHrs")
    public void setCriteriaMaxHrs(Double criteriaMaxHrs) {
        this.criteriaMaxHrs = criteriaMaxHrs;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withCriteriaMaxHrs(Double criteriaMaxHrs) {
        this.criteriaMaxHrs = criteriaMaxHrs;
        return this;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withActcCode(String actcCode) {
        this.actcCode = actcCode;
        return this;
    }

    @JsonProperty("criteria.actcDesc")
    public String getCriteriaActcDesc() {
        return criteriaActcDesc;
    }

    @JsonProperty("criteria.actcDesc")
    public void setCriteriaActcDesc(String criteriaActcDesc) {
        this.criteriaActcDesc = criteriaActcDesc;
    }

    public ComplementaryActivitiesSubmissionRules100PutRequest withCriteriaActcDesc(String criteriaActcDesc) {
        this.criteriaActcDesc = criteriaActcDesc;
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

    public ComplementaryActivitiesSubmissionRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesSubmissionRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaMinHrs");
        sb.append('=');
        sb.append(((this.criteriaMinHrs == null)?"<null>":this.criteriaMinHrs));
        sb.append(',');
        sb.append("criteriaActcCode");
        sb.append('=');
        sb.append(((this.criteriaActcCode == null)?"<null>":this.criteriaActcCode));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaAccgCode");
        sb.append('=');
        sb.append(((this.criteriaAccgCode == null)?"<null>":this.criteriaAccgCode));
        sb.append(',');
        sb.append("maxHrs");
        sb.append('=');
        sb.append(((this.maxHrs == null)?"<null>":this.maxHrs));
        sb.append(',');
        sb.append("minHrs");
        sb.append('=');
        sb.append(((this.minHrs == null)?"<null>":this.minHrs));
        sb.append(',');
        sb.append("criteriaMaxHrs");
        sb.append('=');
        sb.append(((this.criteriaMaxHrs == null)?"<null>":this.criteriaMaxHrs));
        sb.append(',');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
        sb.append(',');
        sb.append("criteriaActcDesc");
        sb.append('=');
        sb.append(((this.criteriaActcDesc == null)?"<null>":this.criteriaActcDesc));
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
        result = ((result* 31)+((this.criteriaMinHrs == null)? 0 :this.criteriaMinHrs.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaAccgCode == null)? 0 :this.criteriaAccgCode.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.criteriaActcCode == null)? 0 :this.criteriaActcCode.hashCode()));
        result = ((result* 31)+((this.criteriaActcDesc == null)? 0 :this.criteriaActcDesc.hashCode()));
        result = ((result* 31)+((this.maxHrs == null)? 0 :this.maxHrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.minHrs == null)? 0 :this.minHrs.hashCode()));
        result = ((result* 31)+((this.criteriaMaxHrs == null)? 0 :this.criteriaMaxHrs.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesSubmissionRules100PutRequest) == false) {
            return false;
        }
        ComplementaryActivitiesSubmissionRules100PutRequest rhs = ((ComplementaryActivitiesSubmissionRules100PutRequest) other);
        return ((((((((((((this.criteriaMinHrs == rhs.criteriaMinHrs)||((this.criteriaMinHrs!= null)&&this.criteriaMinHrs.equals(rhs.criteriaMinHrs)))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaAccgCode == rhs.criteriaAccgCode)||((this.criteriaAccgCode!= null)&&this.criteriaAccgCode.equals(rhs.criteriaAccgCode))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.criteriaActcCode == rhs.criteriaActcCode)||((this.criteriaActcCode!= null)&&this.criteriaActcCode.equals(rhs.criteriaActcCode))))&&((this.criteriaActcDesc == rhs.criteriaActcDesc)||((this.criteriaActcDesc!= null)&&this.criteriaActcDesc.equals(rhs.criteriaActcDesc))))&&((this.maxHrs == rhs.maxHrs)||((this.maxHrs!= null)&&this.maxHrs.equals(rhs.maxHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.minHrs == rhs.minHrs)||((this.minHrs!= null)&&this.minHrs.equals(rhs.minHrs))))&&((this.criteriaMaxHrs == rhs.criteriaMaxHrs)||((this.criteriaMaxHrs!= null)&&this.criteriaMaxHrs.equals(rhs.criteriaMaxHrs))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))));
    }

}
