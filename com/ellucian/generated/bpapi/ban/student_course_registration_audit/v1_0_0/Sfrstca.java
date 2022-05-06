
package com.ellucian.generated.bpapi.ban.student_course_registration_audit.v1_0_0;

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
    "attemptHr",
    "gmodCode",
    "stspKeySequence",
    "billHr",
    "courseNumber",
    "creditHr",
    "sectionNumber",
    "errorFlag",
    "sourceCde",
    "message",
    "addDate",
    "activityDate",
    "rstsCode",
    "campCode",
    "rstsDate",
    "blckCode",
    "seqNumber",
    "user",
    "subjectCode",
    "crn",
    "levlCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Sfrstca {

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SFRSTCA_ATTEMPT_HR
     * 
     */
    @JsonProperty("attemptHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_ATTEMPT_HR")
    private Double attemptHr;
    /**
     * Grading Mode
     * <p>
     * Lineage reference object : SFRSTCA_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_GMOD_CODE")
    private String gmodCode;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SFRSTCA_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Bill Hours
     * <p>
     * Lineage reference object : SFRSTCA_BILL_HR
     * 
     */
    @JsonProperty("billHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_BILL_HR")
    private Double billHr;
    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("courseNumber")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CRSE_NUMB")
    private String courseNumber;
    /**
     * Credit  Hours
     * <p>
     * Lineage reference object : SFRSTCA_CREDIT_HR
     * 
     */
    @JsonProperty("creditHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_CREDIT_HR")
    private Double creditHr;
    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * 
     */
    @JsonProperty("sectionNumber")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SEQ_NUMB")
    private String sectionNumber;
    /**
     * Error Flag
     * <p>
     * Lineage reference object : SFRSTCA_ERROR_FLAG
     * 
     */
    @JsonProperty("errorFlag")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_ERROR_FLAG")
    private String errorFlag;
    /**
     * Source
     * <p>
     * Lineage reference object : SFRSTCA_SOURCE_CDE
     * 
     */
    @JsonProperty("sourceCde")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_SOURCE_CDE")
    private String sourceCde;
    /**
     * Message
     * <p>
     * Lineage reference object : SFRSTCA_MESSAGE
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_MESSAGE")
    private String message;
    /**
     * Add Date
     * <p>
     * Lineage reference object : SFRSTCA_ADD_DATE
     * 
     */
    @JsonProperty("addDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_ADD_DATE")
    private Date addDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRSTCA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Course Status
     * <p>
     * Lineage reference object : SFRSTCA_RSTS_CODE
     * 
     */
    @JsonProperty("rstsCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_RSTS_CODE")
    private String rstsCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : SFRSTCA_CAMP_CODE
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_CAMP_CODE")
    private String campCode;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCA_RSTS_DATE
     * 
     */
    @JsonProperty("rstsDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_RSTS_DATE")
    private Date rstsDate;
    /**
     * Block
     * <p>
     * Lineage reference object : SFRSTCA_BLCK_CODE
     * 
     */
    @JsonProperty("blckCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_BLCK_CODE")
    private String blckCode;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRSTCA_SEQ_NUMBER
     * 
     */
    @JsonProperty("seqNumber")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_SEQ_NUMBER")
    private Double seqNumber;
    /**
     * User
     * <p>
     * Lineage reference object : SFRSTCA_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_USER")
    private String user;
    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjectCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBJ_CODE")
    private String subjectCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSTCA_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_CRN")
    private String crn;
    /**
     * Level
     * <p>
     * Lineage reference object : SFRSTCA_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_LEVL_CODE")
    private String levlCode;
    /**
     * Term
     * <p>
     * Lineage reference object : SFRSTCA_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCA_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SFRSTCA_ATTEMPT_HR
     * 
     */
    @JsonProperty("attemptHr")
    public Double getAttemptHr() {
        return attemptHr;
    }

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SFRSTCA_ATTEMPT_HR
     * 
     */
    @JsonProperty("attemptHr")
    public void setAttemptHr(Double attemptHr) {
        this.attemptHr = attemptHr;
    }

    public Sfrstca withAttemptHr(Double attemptHr) {
        this.attemptHr = attemptHr;
        return this;
    }

    /**
     * Grading Mode
     * <p>
     * Lineage reference object : SFRSTCA_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grading Mode
     * <p>
     * Lineage reference object : SFRSTCA_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public Sfrstca withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SFRSTCA_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SFRSTCA_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Sfrstca withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Bill Hours
     * <p>
     * Lineage reference object : SFRSTCA_BILL_HR
     * 
     */
    @JsonProperty("billHr")
    public Double getBillHr() {
        return billHr;
    }

    /**
     * Bill Hours
     * <p>
     * Lineage reference object : SFRSTCA_BILL_HR
     * 
     */
    @JsonProperty("billHr")
    public void setBillHr(Double billHr) {
        this.billHr = billHr;
    }

    public Sfrstca withBillHr(Double billHr) {
        this.billHr = billHr;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("courseNumber")
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SSBSECT_CRSE_NUMB
     * 
     */
    @JsonProperty("courseNumber")
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Sfrstca withCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
        return this;
    }

    /**
     * Credit  Hours
     * <p>
     * Lineage reference object : SFRSTCA_CREDIT_HR
     * 
     */
    @JsonProperty("creditHr")
    public Double getCreditHr() {
        return creditHr;
    }

    /**
     * Credit  Hours
     * <p>
     * Lineage reference object : SFRSTCA_CREDIT_HR
     * 
     */
    @JsonProperty("creditHr")
    public void setCreditHr(Double creditHr) {
        this.creditHr = creditHr;
    }

    public Sfrstca withCreditHr(Double creditHr) {
        this.creditHr = creditHr;
        return this;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * 
     */
    @JsonProperty("sectionNumber")
    public String getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Section
     * <p>
     * Lineage reference object : SSBSECT_SEQ_NUMB
     * 
     */
    @JsonProperty("sectionNumber")
    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public Sfrstca withSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
        return this;
    }

    /**
     * Error Flag
     * <p>
     * Lineage reference object : SFRSTCA_ERROR_FLAG
     * 
     */
    @JsonProperty("errorFlag")
    public String getErrorFlag() {
        return errorFlag;
    }

    /**
     * Error Flag
     * <p>
     * Lineage reference object : SFRSTCA_ERROR_FLAG
     * 
     */
    @JsonProperty("errorFlag")
    public void setErrorFlag(String errorFlag) {
        this.errorFlag = errorFlag;
    }

    public Sfrstca withErrorFlag(String errorFlag) {
        this.errorFlag = errorFlag;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SFRSTCA_SOURCE_CDE
     * 
     */
    @JsonProperty("sourceCde")
    public String getSourceCde() {
        return sourceCde;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SFRSTCA_SOURCE_CDE
     * 
     */
    @JsonProperty("sourceCde")
    public void setSourceCde(String sourceCde) {
        this.sourceCde = sourceCde;
    }

    public Sfrstca withSourceCde(String sourceCde) {
        this.sourceCde = sourceCde;
        return this;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : SFRSTCA_MESSAGE
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : SFRSTCA_MESSAGE
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Sfrstca withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Add Date
     * <p>
     * Lineage reference object : SFRSTCA_ADD_DATE
     * 
     */
    @JsonProperty("addDate")
    public Date getAddDate() {
        return addDate;
    }

    /**
     * Add Date
     * <p>
     * Lineage reference object : SFRSTCA_ADD_DATE
     * 
     */
    @JsonProperty("addDate")
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Sfrstca withAddDate(Date addDate) {
        this.addDate = addDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRSTCA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SFRSTCA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sfrstca withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Course Status
     * <p>
     * Lineage reference object : SFRSTCA_RSTS_CODE
     * 
     */
    @JsonProperty("rstsCode")
    public String getRstsCode() {
        return rstsCode;
    }

    /**
     * Course Status
     * <p>
     * Lineage reference object : SFRSTCA_RSTS_CODE
     * 
     */
    @JsonProperty("rstsCode")
    public void setRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
    }

    public Sfrstca withRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRSTCA_CAMP_CODE
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRSTCA_CAMP_CODE
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public Sfrstca withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCA_RSTS_DATE
     * 
     */
    @JsonProperty("rstsDate")
    public Date getRstsDate() {
        return rstsDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCA_RSTS_DATE
     * 
     */
    @JsonProperty("rstsDate")
    public void setRstsDate(Date rstsDate) {
        this.rstsDate = rstsDate;
    }

    public Sfrstca withRstsDate(Date rstsDate) {
        this.rstsDate = rstsDate;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SFRSTCA_BLCK_CODE
     * 
     */
    @JsonProperty("blckCode")
    public String getBlckCode() {
        return blckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SFRSTCA_BLCK_CODE
     * 
     */
    @JsonProperty("blckCode")
    public void setBlckCode(String blckCode) {
        this.blckCode = blckCode;
    }

    public Sfrstca withBlckCode(String blckCode) {
        this.blckCode = blckCode;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRSTCA_SEQ_NUMBER
     * 
     */
    @JsonProperty("seqNumber")
    public Double getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SFRSTCA_SEQ_NUMBER
     * 
     */
    @JsonProperty("seqNumber")
    public void setSeqNumber(Double seqNumber) {
        this.seqNumber = seqNumber;
    }

    public Sfrstca withSeqNumber(Double seqNumber) {
        this.seqNumber = seqNumber;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SFRSTCA_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SFRSTCA_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Sfrstca withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjectCode")
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SSBSECT_SUBJ_CODE
     * 
     */
    @JsonProperty("subjectCode")
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public Sfrstca withSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSTCA_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SFRSTCA_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Sfrstca withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRSTCA_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRSTCA_LEVL_CODE
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public Sfrstca withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SFRSTCA_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SFRSTCA_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Sfrstca withTermCode(String termCode) {
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

    public Sfrstca withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfrstca.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attemptHr");
        sb.append('=');
        sb.append(((this.attemptHr == null)?"<null>":this.attemptHr));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("billHr");
        sb.append('=');
        sb.append(((this.billHr == null)?"<null>":this.billHr));
        sb.append(',');
        sb.append("courseNumber");
        sb.append('=');
        sb.append(((this.courseNumber == null)?"<null>":this.courseNumber));
        sb.append(',');
        sb.append("creditHr");
        sb.append('=');
        sb.append(((this.creditHr == null)?"<null>":this.creditHr));
        sb.append(',');
        sb.append("sectionNumber");
        sb.append('=');
        sb.append(((this.sectionNumber == null)?"<null>":this.sectionNumber));
        sb.append(',');
        sb.append("errorFlag");
        sb.append('=');
        sb.append(((this.errorFlag == null)?"<null>":this.errorFlag));
        sb.append(',');
        sb.append("sourceCde");
        sb.append('=');
        sb.append(((this.sourceCde == null)?"<null>":this.sourceCde));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("addDate");
        sb.append('=');
        sb.append(((this.addDate == null)?"<null>":this.addDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("rstsCode");
        sb.append('=');
        sb.append(((this.rstsCode == null)?"<null>":this.rstsCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("rstsDate");
        sb.append('=');
        sb.append(((this.rstsDate == null)?"<null>":this.rstsDate));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("seqNumber");
        sb.append('=');
        sb.append(((this.seqNumber == null)?"<null>":this.seqNumber));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("subjectCode");
        sb.append('=');
        sb.append(((this.subjectCode == null)?"<null>":this.subjectCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.attemptHr == null)? 0 :this.attemptHr.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.billHr == null)? 0 :this.billHr.hashCode()));
        result = ((result* 31)+((this.courseNumber == null)? 0 :this.courseNumber.hashCode()));
        result = ((result* 31)+((this.creditHr == null)? 0 :this.creditHr.hashCode()));
        result = ((result* 31)+((this.sectionNumber == null)? 0 :this.sectionNumber.hashCode()));
        result = ((result* 31)+((this.errorFlag == null)? 0 :this.errorFlag.hashCode()));
        result = ((result* 31)+((this.sourceCde == null)? 0 :this.sourceCde.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.addDate == null)? 0 :this.addDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.rstsCode == null)? 0 :this.rstsCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.rstsDate == null)? 0 :this.rstsDate.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.seqNumber == null)? 0 :this.seqNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.subjectCode == null)? 0 :this.subjectCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfrstca) == false) {
            return false;
        }
        Sfrstca rhs = ((Sfrstca) other);
        return ((((((((((((((((((((((((this.attemptHr == rhs.attemptHr)||((this.attemptHr!= null)&&this.attemptHr.equals(rhs.attemptHr)))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.billHr == rhs.billHr)||((this.billHr!= null)&&this.billHr.equals(rhs.billHr))))&&((this.courseNumber == rhs.courseNumber)||((this.courseNumber!= null)&&this.courseNumber.equals(rhs.courseNumber))))&&((this.creditHr == rhs.creditHr)||((this.creditHr!= null)&&this.creditHr.equals(rhs.creditHr))))&&((this.sectionNumber == rhs.sectionNumber)||((this.sectionNumber!= null)&&this.sectionNumber.equals(rhs.sectionNumber))))&&((this.errorFlag == rhs.errorFlag)||((this.errorFlag!= null)&&this.errorFlag.equals(rhs.errorFlag))))&&((this.sourceCde == rhs.sourceCde)||((this.sourceCde!= null)&&this.sourceCde.equals(rhs.sourceCde))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.addDate == rhs.addDate)||((this.addDate!= null)&&this.addDate.equals(rhs.addDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.rstsCode == rhs.rstsCode)||((this.rstsCode!= null)&&this.rstsCode.equals(rhs.rstsCode))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.rstsDate == rhs.rstsDate)||((this.rstsDate!= null)&&this.rstsDate.equals(rhs.rstsDate))))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.seqNumber == rhs.seqNumber)||((this.seqNumber!= null)&&this.seqNumber.equals(rhs.seqNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.subjectCode == rhs.subjectCode)||((this.subjectCode!= null)&&this.subjectCode.equals(rhs.subjectCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
