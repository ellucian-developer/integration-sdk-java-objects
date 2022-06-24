
package com.ellucian.generated.bpapi.ban.student_sport_compliance.v1_0_0;

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
    "academicElig",
    "criteria.activityDate",
    "criteria.userId",
    "eligible",
    "id",
    "criteria.sport",
    "criteria.term",
    "status"
})
@Generated("jsonschema2pojo")
public class StudentSportCompliance100PutRequest {

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("academicElig")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael")
    private String academicElig;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRSPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SGRSPRT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_USER_ID")
    private String criteriaUserId;
    /**
     * Eligible
     * <p>
     * Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligible")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig")
    private String eligible;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Sport
     * <p>
     * Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc
     * (Required)
     * 
     */
    @JsonProperty("criteria.sport")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc")
    private String criteriaSport;
    /**
     * Term
     * <p>
     * Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.term")
    @JsonPropertyDescription("Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTerm;
    /**
     * Status
     * <p>
     * Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("academicElig")
    public String getAcademicElig() {
        return academicElig;
    }

    /**
     * Academic Eligibility
     * <p>
     * Lineage reference object : SGRSPRT_SAEL_CODE, Lookup lineage reference object : stvsael
     * 
     */
    @JsonProperty("academicElig")
    public void setAcademicElig(String academicElig) {
        this.academicElig = academicElig;
    }

    public StudentSportCompliance100PutRequest withAcademicElig(String academicElig) {
        this.academicElig = academicElig;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRSPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRSPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public StudentSportCompliance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRSPRT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRSPRT_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public StudentSportCompliance100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Eligible
     * <p>
     * Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligible")
    public String getEligible() {
        return eligible;
    }

    /**
     * Eligible
     * <p>
     * Lineage reference object : SGRSPRT_ELIG_CODE, Lookup lineage reference object : stvelig
     * 
     */
    @JsonProperty("eligible")
    public void setEligible(String eligible) {
        this.eligible = eligible;
    }

    public StudentSportCompliance100PutRequest withEligible(String eligible) {
        this.eligible = eligible;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentSportCompliance100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc
     * (Required)
     * 
     */
    @JsonProperty("criteria.sport")
    public String getCriteriaSport() {
        return criteriaSport;
    }

    /**
     * Sport
     * <p>
     * Lineage reference object : SGRSPRT_ACTC_CODE, Lookup lineage reference object : stvactc
     * (Required)
     * 
     */
    @JsonProperty("criteria.sport")
    public void setCriteriaSport(String criteriaSport) {
        this.criteriaSport = criteriaSport;
    }

    public StudentSportCompliance100PutRequest withCriteriaSport(String criteriaSport) {
        this.criteriaSport = criteriaSport;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.term")
    public String getCriteriaTerm() {
        return criteriaTerm;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.term")
    public void setCriteriaTerm(String criteriaTerm) {
        this.criteriaTerm = criteriaTerm;
    }

    public StudentSportCompliance100PutRequest withCriteriaTerm(String criteriaTerm) {
        this.criteriaTerm = criteriaTerm;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SGRSPRT_SPST_CODE, Lookup lineage reference object : stvspst
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public StudentSportCompliance100PutRequest withStatus(String status) {
        this.status = status;
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

    public StudentSportCompliance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportCompliance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("academicElig");
        sb.append('=');
        sb.append(((this.academicElig == null)?"<null>":this.academicElig));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("eligible");
        sb.append('=');
        sb.append(((this.eligible == null)?"<null>":this.eligible));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaSport");
        sb.append('=');
        sb.append(((this.criteriaSport == null)?"<null>":this.criteriaSport));
        sb.append(',');
        sb.append("criteriaTerm");
        sb.append('=');
        sb.append(((this.criteriaTerm == null)?"<null>":this.criteriaTerm));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.academicElig == null)? 0 :this.academicElig.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.eligible == null)? 0 :this.eligible.hashCode()));
        result = ((result* 31)+((this.criteriaSport == null)? 0 :this.criteriaSport.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaTerm == null)? 0 :this.criteriaTerm.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportCompliance100PutRequest) == false) {
            return false;
        }
        StudentSportCompliance100PutRequest rhs = ((StudentSportCompliance100PutRequest) other);
        return ((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.academicElig == rhs.academicElig)||((this.academicElig!= null)&&this.academicElig.equals(rhs.academicElig))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.eligible == rhs.eligible)||((this.eligible!= null)&&this.eligible.equals(rhs.eligible))))&&((this.criteriaSport == rhs.criteriaSport)||((this.criteriaSport!= null)&&this.criteriaSport.equals(rhs.criteriaSport))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaTerm == rhs.criteriaTerm)||((this.criteriaTerm!= null)&&this.criteriaTerm.equals(rhs.criteriaTerm))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
