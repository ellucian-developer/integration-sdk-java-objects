
package com.ellucian.generated.bpapi.ban.complementary_activities_submission_administration.v1_0_0;

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
    "docSubmitInd",
    "sequenceNumber",
    "casvCode",
    "stuComment",
    "activityCde",
    "submitDate",
    "program",
    "userId",
    "categoryCde",
    "approvedDate",
    "activityDate",
    "approvalComment",
    "pidm",
    "submitHrs",
    "name",
    "id",
    "approvedHrs",
    "termCode"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesSubmissionAdministration100GetResponse {

    /**
     * Document Submitted Indicator
     * <p>
     * Lineage reference object : SORCASA_DOC_SUBMIT_IND
     * 
     */
    @JsonProperty("docSubmitInd")
    @JsonPropertyDescription("Lineage reference object : SORCASA_DOC_SUBMIT_IND")
    private String docSubmitInd;
    /**
     * CA Request ID
     * <p>
     * Lineage reference object : SORCASA_SEQUENCE_NUMBER
     * 
     */
    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("Lineage reference object : SORCASA_SEQUENCE_NUMBER")
    private Double sequenceNumber;
    /**
     * Status
     * <p>
     * Lineage reference object : SORCASA_CASV_CODE
     * (Required)
     * 
     */
    @JsonProperty("casvCode")
    @JsonPropertyDescription("Lineage reference object : SORCASA_CASV_CODE")
    private String casvCode;
    /**
     * Student Comments
     * <p>
     * Lineage reference object : SORCASA_STU_COMMENT
     * 
     */
    @JsonProperty("stuComment")
    @JsonPropertyDescription("Lineage reference object : SORCASA_STU_COMMENT")
    private String stuComment;
    /**
     * Activity Code
     * <p>
     * Lineage reference object : SORCASA_ACTIVITY_CDE
     * 
     */
    @JsonProperty("activityCde")
    @JsonPropertyDescription("Lineage reference object : SORCASA_ACTIVITY_CDE")
    private String activityCde;
    /**
     * Submission Date
     * <p>
     * Lineage reference object : SORCASA_SUBMIT_DATE
     * 
     */
    @JsonProperty("submitDate")
    @JsonPropertyDescription("Lineage reference object : SORCASA_SUBMIT_DATE")
    private Date submitDate;
    /**
     * Lineage reference object : SORCASA_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SORCASA_PROGRAM")
    private String program;
    /**
     * Lineage reference object : SORCASA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORCASA_USER_ID")
    private String userId;
    /**
     * Category Code
     * <p>
     * Lineage reference object : SORCASA_CATEGORY_CDE
     * 
     */
    @JsonProperty("categoryCde")
    @JsonPropertyDescription("Lineage reference object : SORCASA_CATEGORY_CDE")
    private String categoryCde;
    /**
     * Approval/Rejection Date
     * <p>
     * Lineage reference object : SORCASA_APPROVED_DATE
     * 
     */
    @JsonProperty("approvedDate")
    @JsonPropertyDescription("Lineage reference object : SORCASA_APPROVED_DATE")
    private Date approvedDate;
    /**
     * Lineage reference object : SORCASA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORCASA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Approval/Rejection Comment
     * <p>
     * Lineage reference object : SORCASA_APPROVAL_COMMENT
     * 
     */
    @JsonProperty("approvalComment")
    @JsonPropertyDescription("Lineage reference object : SORCASA_APPROVAL_COMMENT")
    private String approvalComment;
    /**
     * Lineage reference object : SORCASA_PIDM
     * 
     */
    @JsonProperty("pidm")
    @JsonPropertyDescription("Lineage reference object : SORCASA_PIDM")
    private Double pidm;
    /**
     * Submitted Hours
     * <p>
     * Lineage reference object : SORCASA_SUBMIT_HRS
     * 
     */
    @JsonProperty("submitHrs")
    @JsonPropertyDescription("Lineage reference object : SORCASA_SUBMIT_HRS")
    private Double submitHrs;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Approved Hours
     * <p>
     * Lineage reference object : SORCASA_APPROVED_HRS
     * 
     */
    @JsonProperty("approvedHrs")
    @JsonPropertyDescription("Lineage reference object : SORCASA_APPROVED_HRS")
    private Double approvedHrs;
    /**
     * Lineage reference object : SORCASA_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SORCASA_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Document Submitted Indicator
     * <p>
     * Lineage reference object : SORCASA_DOC_SUBMIT_IND
     * 
     */
    @JsonProperty("docSubmitInd")
    public String getDocSubmitInd() {
        return docSubmitInd;
    }

    /**
     * Document Submitted Indicator
     * <p>
     * Lineage reference object : SORCASA_DOC_SUBMIT_IND
     * 
     */
    @JsonProperty("docSubmitInd")
    public void setDocSubmitInd(String docSubmitInd) {
        this.docSubmitInd = docSubmitInd;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withDocSubmitInd(String docSubmitInd) {
        this.docSubmitInd = docSubmitInd;
        return this;
    }

    /**
     * CA Request ID
     * <p>
     * Lineage reference object : SORCASA_SEQUENCE_NUMBER
     * 
     */
    @JsonProperty("sequenceNumber")
    public Double getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * CA Request ID
     * <p>
     * Lineage reference object : SORCASA_SEQUENCE_NUMBER
     * 
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Double sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withSequenceNumber(Double sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SORCASA_CASV_CODE
     * (Required)
     * 
     */
    @JsonProperty("casvCode")
    public String getCasvCode() {
        return casvCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SORCASA_CASV_CODE
     * (Required)
     * 
     */
    @JsonProperty("casvCode")
    public void setCasvCode(String casvCode) {
        this.casvCode = casvCode;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withCasvCode(String casvCode) {
        this.casvCode = casvCode;
        return this;
    }

    /**
     * Student Comments
     * <p>
     * Lineage reference object : SORCASA_STU_COMMENT
     * 
     */
    @JsonProperty("stuComment")
    public String getStuComment() {
        return stuComment;
    }

    /**
     * Student Comments
     * <p>
     * Lineage reference object : SORCASA_STU_COMMENT
     * 
     */
    @JsonProperty("stuComment")
    public void setStuComment(String stuComment) {
        this.stuComment = stuComment;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withStuComment(String stuComment) {
        this.stuComment = stuComment;
        return this;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SORCASA_ACTIVITY_CDE
     * 
     */
    @JsonProperty("activityCde")
    public String getActivityCde() {
        return activityCde;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SORCASA_ACTIVITY_CDE
     * 
     */
    @JsonProperty("activityCde")
    public void setActivityCde(String activityCde) {
        this.activityCde = activityCde;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withActivityCde(String activityCde) {
        this.activityCde = activityCde;
        return this;
    }

    /**
     * Submission Date
     * <p>
     * Lineage reference object : SORCASA_SUBMIT_DATE
     * 
     */
    @JsonProperty("submitDate")
    public Date getSubmitDate() {
        return submitDate;
    }

    /**
     * Submission Date
     * <p>
     * Lineage reference object : SORCASA_SUBMIT_DATE
     * 
     */
    @JsonProperty("submitDate")
    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
        return this;
    }

    /**
     * Lineage reference object : SORCASA_PROGRAM
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Lineage reference object : SORCASA_PROGRAM
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Lineage reference object : SORCASA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORCASA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Category Code
     * <p>
     * Lineage reference object : SORCASA_CATEGORY_CDE
     * 
     */
    @JsonProperty("categoryCde")
    public String getCategoryCde() {
        return categoryCde;
    }

    /**
     * Category Code
     * <p>
     * Lineage reference object : SORCASA_CATEGORY_CDE
     * 
     */
    @JsonProperty("categoryCde")
    public void setCategoryCde(String categoryCde) {
        this.categoryCde = categoryCde;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withCategoryCde(String categoryCde) {
        this.categoryCde = categoryCde;
        return this;
    }

    /**
     * Approval/Rejection Date
     * <p>
     * Lineage reference object : SORCASA_APPROVED_DATE
     * 
     */
    @JsonProperty("approvedDate")
    public Date getApprovedDate() {
        return approvedDate;
    }

    /**
     * Approval/Rejection Date
     * <p>
     * Lineage reference object : SORCASA_APPROVED_DATE
     * 
     */
    @JsonProperty("approvedDate")
    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
        return this;
    }

    /**
     * Lineage reference object : SORCASA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORCASA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Approval/Rejection Comment
     * <p>
     * Lineage reference object : SORCASA_APPROVAL_COMMENT
     * 
     */
    @JsonProperty("approvalComment")
    public String getApprovalComment() {
        return approvalComment;
    }

    /**
     * Approval/Rejection Comment
     * <p>
     * Lineage reference object : SORCASA_APPROVAL_COMMENT
     * 
     */
    @JsonProperty("approvalComment")
    public void setApprovalComment(String approvalComment) {
        this.approvalComment = approvalComment;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withApprovalComment(String approvalComment) {
        this.approvalComment = approvalComment;
        return this;
    }

    /**
     * Lineage reference object : SORCASA_PIDM
     * 
     */
    @JsonProperty("pidm")
    public Double getPidm() {
        return pidm;
    }

    /**
     * Lineage reference object : SORCASA_PIDM
     * 
     */
    @JsonProperty("pidm")
    public void setPidm(Double pidm) {
        this.pidm = pidm;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withPidm(Double pidm) {
        this.pidm = pidm;
        return this;
    }

    /**
     * Submitted Hours
     * <p>
     * Lineage reference object : SORCASA_SUBMIT_HRS
     * 
     */
    @JsonProperty("submitHrs")
    public Double getSubmitHrs() {
        return submitHrs;
    }

    /**
     * Submitted Hours
     * <p>
     * Lineage reference object : SORCASA_SUBMIT_HRS
     * 
     */
    @JsonProperty("submitHrs")
    public void setSubmitHrs(Double submitHrs) {
        this.submitHrs = submitHrs;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withSubmitHrs(Double submitHrs) {
        this.submitHrs = submitHrs;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Approved Hours
     * <p>
     * Lineage reference object : SORCASA_APPROVED_HRS
     * 
     */
    @JsonProperty("approvedHrs")
    public Double getApprovedHrs() {
        return approvedHrs;
    }

    /**
     * Approved Hours
     * <p>
     * Lineage reference object : SORCASA_APPROVED_HRS
     * 
     */
    @JsonProperty("approvedHrs")
    public void setApprovedHrs(Double approvedHrs) {
        this.approvedHrs = approvedHrs;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withApprovedHrs(Double approvedHrs) {
        this.approvedHrs = approvedHrs;
        return this;
    }

    /**
     * Lineage reference object : SORCASA_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Lineage reference object : SORCASA_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withTermCode(String termCode) {
        this.termCode = termCode;
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

    public ComplementaryActivitiesSubmissionAdministration100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesSubmissionAdministration100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("docSubmitInd");
        sb.append('=');
        sb.append(((this.docSubmitInd == null)?"<null>":this.docSubmitInd));
        sb.append(',');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
        sb.append(',');
        sb.append("casvCode");
        sb.append('=');
        sb.append(((this.casvCode == null)?"<null>":this.casvCode));
        sb.append(',');
        sb.append("stuComment");
        sb.append('=');
        sb.append(((this.stuComment == null)?"<null>":this.stuComment));
        sb.append(',');
        sb.append("activityCde");
        sb.append('=');
        sb.append(((this.activityCde == null)?"<null>":this.activityCde));
        sb.append(',');
        sb.append("submitDate");
        sb.append('=');
        sb.append(((this.submitDate == null)?"<null>":this.submitDate));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("categoryCde");
        sb.append('=');
        sb.append(((this.categoryCde == null)?"<null>":this.categoryCde));
        sb.append(',');
        sb.append("approvedDate");
        sb.append('=');
        sb.append(((this.approvedDate == null)?"<null>":this.approvedDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("approvalComment");
        sb.append('=');
        sb.append(((this.approvalComment == null)?"<null>":this.approvalComment));
        sb.append(',');
        sb.append("pidm");
        sb.append('=');
        sb.append(((this.pidm == null)?"<null>":this.pidm));
        sb.append(',');
        sb.append("submitHrs");
        sb.append('=');
        sb.append(((this.submitHrs == null)?"<null>":this.submitHrs));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("approvedHrs");
        sb.append('=');
        sb.append(((this.approvedHrs == null)?"<null>":this.approvedHrs));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.docSubmitInd == null)? 0 :this.docSubmitInd.hashCode()));
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.casvCode == null)? 0 :this.casvCode.hashCode()));
        result = ((result* 31)+((this.stuComment == null)? 0 :this.stuComment.hashCode()));
        result = ((result* 31)+((this.activityCde == null)? 0 :this.activityCde.hashCode()));
        result = ((result* 31)+((this.submitDate == null)? 0 :this.submitDate.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.categoryCde == null)? 0 :this.categoryCde.hashCode()));
        result = ((result* 31)+((this.approvedDate == null)? 0 :this.approvedDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.approvalComment == null)? 0 :this.approvalComment.hashCode()));
        result = ((result* 31)+((this.pidm == null)? 0 :this.pidm.hashCode()));
        result = ((result* 31)+((this.submitHrs == null)? 0 :this.submitHrs.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.approvedHrs == null)? 0 :this.approvedHrs.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesSubmissionAdministration100GetResponse) == false) {
            return false;
        }
        ComplementaryActivitiesSubmissionAdministration100GetResponse rhs = ((ComplementaryActivitiesSubmissionAdministration100GetResponse) other);
        return ((((((((((((((((((((this.docSubmitInd == rhs.docSubmitInd)||((this.docSubmitInd!= null)&&this.docSubmitInd.equals(rhs.docSubmitInd)))&&((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber))))&&((this.casvCode == rhs.casvCode)||((this.casvCode!= null)&&this.casvCode.equals(rhs.casvCode))))&&((this.stuComment == rhs.stuComment)||((this.stuComment!= null)&&this.stuComment.equals(rhs.stuComment))))&&((this.activityCde == rhs.activityCde)||((this.activityCde!= null)&&this.activityCde.equals(rhs.activityCde))))&&((this.submitDate == rhs.submitDate)||((this.submitDate!= null)&&this.submitDate.equals(rhs.submitDate))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.categoryCde == rhs.categoryCde)||((this.categoryCde!= null)&&this.categoryCde.equals(rhs.categoryCde))))&&((this.approvedDate == rhs.approvedDate)||((this.approvedDate!= null)&&this.approvedDate.equals(rhs.approvedDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.approvalComment == rhs.approvalComment)||((this.approvalComment!= null)&&this.approvalComment.equals(rhs.approvalComment))))&&((this.pidm == rhs.pidm)||((this.pidm!= null)&&this.pidm.equals(rhs.pidm))))&&((this.submitHrs == rhs.submitHrs)||((this.submitHrs!= null)&&this.submitHrs.equals(rhs.submitHrs))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.approvedHrs == rhs.approvedHrs)||((this.approvedHrs!= null)&&this.approvedHrs.equals(rhs.approvedHrs))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
