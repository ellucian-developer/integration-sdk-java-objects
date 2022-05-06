
package com.ellucian.generated.bpapi.ban.section_details_read_only.v1_0_0;

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
    "totCurrStudent",
    "totCreditHrs",
    "crseTitle",
    "subjCode",
    "campDesc",
    "subjDesc",
    "userId",
    "ptrmDesc",
    "schdCode",
    "totStudent",
    "activeRule",
    "crseNumb",
    "activityDate",
    "ptrmCode",
    "schdDesc",
    "campCode"
})
@Generated("jsonschema2pojo")
public class Ssbsect {

    /**
     * Total Current Students
     * <p>
     * 
     * 
     */
    @JsonProperty("totCurrStudent")
    private String totCurrStudent;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_TOT_CREDIT_HRS
     * 
     */
    @JsonProperty("totCreditHrs")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_TOT_CREDIT_HRS")
    private Double totCreditHrs;
    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("crseTitle")
    private String crseTitle;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE")
    private String subjCode;
    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("campDesc")
    private String campDesc;
    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("subjDesc")
    private String subjDesc;
    /**
     * Lineage reference object : SSBSECT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_USER_ID")
    private String userId;
    /**
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmDesc")
    private String ptrmDesc;
    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * 
     */
    @JsonProperty("schdCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SCHD_CODE")
    private String schdCode;
    /**
     * Total Students
     * <p>
     * 
     * 
     */
    @JsonProperty("totStudent")
    private String totStudent;
    @JsonProperty("activeRule")
    private String activeRule;
    /**
     * Course Number
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRSE_NUMB")
    private String crseNumb;
    /**
     * Lineage reference object : SSBSECT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_CODE")
    private String ptrmCode;
    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdDesc")
    private String schdDesc;
    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CAMP_CODE")
    private String campCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Total Current Students
     * <p>
     * 
     * 
     */
    @JsonProperty("totCurrStudent")
    public String getTotCurrStudent() {
        return totCurrStudent;
    }

    /**
     * Total Current Students
     * <p>
     * 
     * 
     */
    @JsonProperty("totCurrStudent")
    public void setTotCurrStudent(String totCurrStudent) {
        this.totCurrStudent = totCurrStudent;
    }

    public Ssbsect withTotCurrStudent(String totCurrStudent) {
        this.totCurrStudent = totCurrStudent;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_TOT_CREDIT_HRS
     * 
     */
    @JsonProperty("totCreditHrs")
    public Double getTotCreditHrs() {
        return totCreditHrs;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SSBSECT_TOT_CREDIT_HRS
     * 
     */
    @JsonProperty("totCreditHrs")
    public void setTotCreditHrs(Double totCreditHrs) {
        this.totCreditHrs = totCreditHrs;
    }

    public Ssbsect withTotCreditHrs(Double totCreditHrs) {
        this.totCreditHrs = totCreditHrs;
        return this;
    }

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("crseTitle")
    public String getCrseTitle() {
        return crseTitle;
    }

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("crseTitle")
    public void setCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
    }

    public Ssbsect withCrseTitle(String crseTitle) {
        this.crseTitle = crseTitle;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public Ssbsect withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("campDesc")
    public String getCampDesc() {
        return campDesc;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("campDesc")
    public void setCampDesc(String campDesc) {
        this.campDesc = campDesc;
    }

    public Ssbsect withCampDesc(String campDesc) {
        this.campDesc = campDesc;
        return this;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("subjDesc")
    public String getSubjDesc() {
        return subjDesc;
    }

    /**
     * Subject Description
     * <p>
     * 
     * 
     */
    @JsonProperty("subjDesc")
    public void setSubjDesc(String subjDesc) {
        this.subjDesc = subjDesc;
    }

    public Ssbsect withSubjDesc(String subjDesc) {
        this.subjDesc = subjDesc;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SSBSECT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ssbsect withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmDesc")
    public String getPtrmDesc() {
        return ptrmDesc;
    }

    /**
     * Part of Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmDesc")
    public void setPtrmDesc(String ptrmDesc) {
        this.ptrmDesc = ptrmDesc;
    }

    public Ssbsect withPtrmDesc(String ptrmDesc) {
        this.ptrmDesc = ptrmDesc;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * 
     */
    @JsonProperty("schdCode")
    public String getSchdCode() {
        return schdCode;
    }

    /**
     * Schedule Type
     * <p>
     * Lineage reference object : SSBSECT_SCHD_CODE
     * 
     */
    @JsonProperty("schdCode")
    public void setSchdCode(String schdCode) {
        this.schdCode = schdCode;
    }

    public Ssbsect withSchdCode(String schdCode) {
        this.schdCode = schdCode;
        return this;
    }

    /**
     * Total Students
     * <p>
     * 
     * 
     */
    @JsonProperty("totStudent")
    public String getTotStudent() {
        return totStudent;
    }

    /**
     * Total Students
     * <p>
     * 
     * 
     */
    @JsonProperty("totStudent")
    public void setTotStudent(String totStudent) {
        this.totStudent = totStudent;
    }

    public Ssbsect withTotStudent(String totStudent) {
        this.totStudent = totStudent;
        return this;
    }

    @JsonProperty("activeRule")
    public String getActiveRule() {
        return activeRule;
    }

    @JsonProperty("activeRule")
    public void setActiveRule(String activeRule) {
        this.activeRule = activeRule;
    }

    public Ssbsect withActiveRule(String activeRule) {
        this.activeRule = activeRule;
        return this;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public Ssbsect withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Lineage reference object : SSBSECT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SSBSECT_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssbsect withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public Ssbsect withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdDesc")
    public String getSchdDesc() {
        return schdDesc;
    }

    /**
     * Schedule Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("schdDesc")
    public void setSchdDesc(String schdDesc) {
        this.schdDesc = schdDesc;
    }

    public Ssbsect withSchdDesc(String schdDesc) {
        this.schdDesc = schdDesc;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SSBSECT_CAMP_CODE
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public Ssbsect withCampCode(String campCode) {
        this.campCode = campCode;
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

    public Ssbsect withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssbsect.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totCurrStudent");
        sb.append('=');
        sb.append(((this.totCurrStudent == null)?"<null>":this.totCurrStudent));
        sb.append(',');
        sb.append("totCreditHrs");
        sb.append('=');
        sb.append(((this.totCreditHrs == null)?"<null>":this.totCreditHrs));
        sb.append(',');
        sb.append("crseTitle");
        sb.append('=');
        sb.append(((this.crseTitle == null)?"<null>":this.crseTitle));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("campDesc");
        sb.append('=');
        sb.append(((this.campDesc == null)?"<null>":this.campDesc));
        sb.append(',');
        sb.append("subjDesc");
        sb.append('=');
        sb.append(((this.subjDesc == null)?"<null>":this.subjDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ptrmDesc");
        sb.append('=');
        sb.append(((this.ptrmDesc == null)?"<null>":this.ptrmDesc));
        sb.append(',');
        sb.append("schdCode");
        sb.append('=');
        sb.append(((this.schdCode == null)?"<null>":this.schdCode));
        sb.append(',');
        sb.append("totStudent");
        sb.append('=');
        sb.append(((this.totStudent == null)?"<null>":this.totStudent));
        sb.append(',');
        sb.append("activeRule");
        sb.append('=');
        sb.append(((this.activeRule == null)?"<null>":this.activeRule));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("schdDesc");
        sb.append('=');
        sb.append(((this.schdDesc == null)?"<null>":this.schdDesc));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
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
        result = ((result* 31)+((this.totCurrStudent == null)? 0 :this.totCurrStudent.hashCode()));
        result = ((result* 31)+((this.totCreditHrs == null)? 0 :this.totCreditHrs.hashCode()));
        result = ((result* 31)+((this.crseTitle == null)? 0 :this.crseTitle.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.campDesc == null)? 0 :this.campDesc.hashCode()));
        result = ((result* 31)+((this.subjDesc == null)? 0 :this.subjDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ptrmDesc == null)? 0 :this.ptrmDesc.hashCode()));
        result = ((result* 31)+((this.schdCode == null)? 0 :this.schdCode.hashCode()));
        result = ((result* 31)+((this.totStudent == null)? 0 :this.totStudent.hashCode()));
        result = ((result* 31)+((this.activeRule == null)? 0 :this.activeRule.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.schdDesc == null)? 0 :this.schdDesc.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssbsect) == false) {
            return false;
        }
        Ssbsect rhs = ((Ssbsect) other);
        return ((((((((((((((((((this.totCurrStudent == rhs.totCurrStudent)||((this.totCurrStudent!= null)&&this.totCurrStudent.equals(rhs.totCurrStudent)))&&((this.totCreditHrs == rhs.totCreditHrs)||((this.totCreditHrs!= null)&&this.totCreditHrs.equals(rhs.totCreditHrs))))&&((this.crseTitle == rhs.crseTitle)||((this.crseTitle!= null)&&this.crseTitle.equals(rhs.crseTitle))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.campDesc == rhs.campDesc)||((this.campDesc!= null)&&this.campDesc.equals(rhs.campDesc))))&&((this.subjDesc == rhs.subjDesc)||((this.subjDesc!= null)&&this.subjDesc.equals(rhs.subjDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ptrmDesc == rhs.ptrmDesc)||((this.ptrmDesc!= null)&&this.ptrmDesc.equals(rhs.ptrmDesc))))&&((this.schdCode == rhs.schdCode)||((this.schdCode!= null)&&this.schdCode.equals(rhs.schdCode))))&&((this.totStudent == rhs.totStudent)||((this.totStudent!= null)&&this.totStudent.equals(rhs.totStudent))))&&((this.activeRule == rhs.activeRule)||((this.activeRule!= null)&&this.activeRule.equals(rhs.activeRule))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.schdDesc == rhs.schdDesc)||((this.schdDesc!= null)&&this.schdDesc.equals(rhs.schdDesc))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
