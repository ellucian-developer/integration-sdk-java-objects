
package com.ellucian.generated.bpapi.ban.beneficiary.v1_0_0;

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
    "addedDate",
    "seqNo",
    "criteria.sexInd",
    "criteria.beneIdNo",
    "criteria.memberType",
    "criteria.addedDate",
    "criteria.disabilityInd",
    "criteria.acaChildReportInd",
    "activeInd",
    "criteria.collegeBeginDate",
    "criteria.seqNo",
    "id",
    "criteria.collegeEndDate",
    "brelCode",
    "criteria.beneMrtlCode",
    "criteria.activeInd",
    "criteria.spouseEmployedInd",
    "collegeInd",
    "criteria.persAge",
    "criteria.brelCode",
    "disabilityInd",
    "acaChildReportInd",
    "criteria.collegeInd",
    "beneIdNo",
    "criteria.beneSsn",
    "memberType",
    "criteria.birthDate"
})
@Generated("jsonschema2pojo")
public class Beneficiary100PutRequest {

    /**
     * Date Added
     * <p>
     * Lineage reference object : PDRBENE_ADDED_DATE
     * 
     */
    @JsonProperty("addedDate")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_ADDED_DATE")
    private Date addedDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_SEQ_NO")
    private Double seqNo;
    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sexInd")
    private String criteriaSexInd;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.beneIdNo")
    private String criteriaBeneIdNo;
    /**
     * Member Type
     * <p>
     * Lineage reference object : PDRBENE_MEMBER_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.memberType")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_MEMBER_TYPE")
    private String criteriaMemberType;
    /**
     * Date Added
     * <p>
     * Lineage reference object : PDRBENE_ADDED_DATE
     * 
     */
    @JsonProperty("criteria.addedDate")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_ADDED_DATE")
    private Date criteriaAddedDate;
    /**
     * Disabled
     * <p>
     * Lineage reference object : PDRBENE_DISABILITY_IND
     * 
     */
    @JsonProperty("criteria.disabilityInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_DISABILITY_IND")
    private String criteriaDisabilityInd;
    /**
     * ACA Reportable Child
     * <p>
     * Lineage reference object : PDRBENE_ACA_CHILD_REPORT_IND
     * 
     */
    @JsonProperty("criteria.acaChildReportInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_ACA_CHILD_REPORT_IND")
    private String criteriaAcaChildReportInd;
    /**
     * Active
     * <p>
     * Lineage reference object : PDRBENE_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_ACTIVE_IND")
    private String activeInd;
    /**
     * From
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_BEGIN_DATE
     * 
     */
    @JsonProperty("criteria.collegeBeginDate")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_COLLEGE_BEGIN_DATE")
    private Date criteriaCollegeBeginDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNo")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_SEQ_NO")
    private Double criteriaSeqNo;
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
     * To
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_END_DATE
     * 
     */
    @JsonProperty("criteria.collegeEndDate")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_COLLEGE_END_DATE")
    private Date criteriaCollegeEndDate;
    /**
     * Relationship to Employee
     * <p>
     * Lineage reference object : PDRBENE_BREL_CODE
     * (Required)
     * 
     */
    @JsonProperty("brelCode")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_BREL_CODE")
    private String brelCode;
    /**
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("criteria.beneMrtlCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvmrtl")
    private String criteriaBeneMrtlCode;
    /**
     * Active
     * <p>
     * Lineage reference object : PDRBENE_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.activeInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_ACTIVE_IND")
    private String criteriaActiveInd;
    /**
     * Spouse Employed
     * <p>
     * Lineage reference object : PDRBENE_SPOUSE_EMPLOYED_IND
     * 
     */
    @JsonProperty("criteria.spouseEmployedInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_SPOUSE_EMPLOYED_IND")
    private String criteriaSpouseEmployedInd;
    /**
     * Attending College
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_IND
     * 
     */
    @JsonProperty("collegeInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_COLLEGE_IND")
    private String collegeInd;
    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.persAge")
    private Double criteriaPersAge;
    /**
     * Relationship to Employee
     * <p>
     * Lineage reference object : PDRBENE_BREL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.brelCode")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_BREL_CODE")
    private String criteriaBrelCode;
    /**
     * Disabled
     * <p>
     * Lineage reference object : PDRBENE_DISABILITY_IND
     * 
     */
    @JsonProperty("disabilityInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_DISABILITY_IND")
    private String disabilityInd;
    /**
     * ACA Reportable Child
     * <p>
     * Lineage reference object : PDRBENE_ACA_CHILD_REPORT_IND
     * 
     */
    @JsonProperty("acaChildReportInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_ACA_CHILD_REPORT_IND")
    private String acaChildReportInd;
    /**
     * Attending College
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_IND
     * 
     */
    @JsonProperty("criteria.collegeInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_COLLEGE_IND")
    private String criteriaCollegeInd;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("beneIdNo")
    private String beneIdNo;
    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.beneSsn")
    private String criteriaBeneSsn;
    /**
     * Member Type
     * <p>
     * Lineage reference object : PDRBENE_MEMBER_TYPE
     * (Required)
     * 
     */
    @JsonProperty("memberType")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_MEMBER_TYPE")
    private String memberType;
    /**
     * Birth Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.birthDate")
    private Date criteriaBirthDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Date Added
     * <p>
     * Lineage reference object : PDRBENE_ADDED_DATE
     * 
     */
    @JsonProperty("addedDate")
    public Date getAddedDate() {
        return addedDate;
    }

    /**
     * Date Added
     * <p>
     * Lineage reference object : PDRBENE_ADDED_DATE
     * 
     */
    @JsonProperty("addedDate")
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Beneficiary100PutRequest withAddedDate(Date addedDate) {
        this.addedDate = addedDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public Beneficiary100PutRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sexInd")
    public String getCriteriaSexInd() {
        return criteriaSexInd;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sexInd")
    public void setCriteriaSexInd(String criteriaSexInd) {
        this.criteriaSexInd = criteriaSexInd;
    }

    public Beneficiary100PutRequest withCriteriaSexInd(String criteriaSexInd) {
        this.criteriaSexInd = criteriaSexInd;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.beneIdNo")
    public String getCriteriaBeneIdNo() {
        return criteriaBeneIdNo;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.beneIdNo")
    public void setCriteriaBeneIdNo(String criteriaBeneIdNo) {
        this.criteriaBeneIdNo = criteriaBeneIdNo;
    }

    public Beneficiary100PutRequest withCriteriaBeneIdNo(String criteriaBeneIdNo) {
        this.criteriaBeneIdNo = criteriaBeneIdNo;
        return this;
    }

    /**
     * Member Type
     * <p>
     * Lineage reference object : PDRBENE_MEMBER_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.memberType")
    public String getCriteriaMemberType() {
        return criteriaMemberType;
    }

    /**
     * Member Type
     * <p>
     * Lineage reference object : PDRBENE_MEMBER_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.memberType")
    public void setCriteriaMemberType(String criteriaMemberType) {
        this.criteriaMemberType = criteriaMemberType;
    }

    public Beneficiary100PutRequest withCriteriaMemberType(String criteriaMemberType) {
        this.criteriaMemberType = criteriaMemberType;
        return this;
    }

    /**
     * Date Added
     * <p>
     * Lineage reference object : PDRBENE_ADDED_DATE
     * 
     */
    @JsonProperty("criteria.addedDate")
    public Date getCriteriaAddedDate() {
        return criteriaAddedDate;
    }

    /**
     * Date Added
     * <p>
     * Lineage reference object : PDRBENE_ADDED_DATE
     * 
     */
    @JsonProperty("criteria.addedDate")
    public void setCriteriaAddedDate(Date criteriaAddedDate) {
        this.criteriaAddedDate = criteriaAddedDate;
    }

    public Beneficiary100PutRequest withCriteriaAddedDate(Date criteriaAddedDate) {
        this.criteriaAddedDate = criteriaAddedDate;
        return this;
    }

    /**
     * Disabled
     * <p>
     * Lineage reference object : PDRBENE_DISABILITY_IND
     * 
     */
    @JsonProperty("criteria.disabilityInd")
    public String getCriteriaDisabilityInd() {
        return criteriaDisabilityInd;
    }

    /**
     * Disabled
     * <p>
     * Lineage reference object : PDRBENE_DISABILITY_IND
     * 
     */
    @JsonProperty("criteria.disabilityInd")
    public void setCriteriaDisabilityInd(String criteriaDisabilityInd) {
        this.criteriaDisabilityInd = criteriaDisabilityInd;
    }

    public Beneficiary100PutRequest withCriteriaDisabilityInd(String criteriaDisabilityInd) {
        this.criteriaDisabilityInd = criteriaDisabilityInd;
        return this;
    }

    /**
     * ACA Reportable Child
     * <p>
     * Lineage reference object : PDRBENE_ACA_CHILD_REPORT_IND
     * 
     */
    @JsonProperty("criteria.acaChildReportInd")
    public String getCriteriaAcaChildReportInd() {
        return criteriaAcaChildReportInd;
    }

    /**
     * ACA Reportable Child
     * <p>
     * Lineage reference object : PDRBENE_ACA_CHILD_REPORT_IND
     * 
     */
    @JsonProperty("criteria.acaChildReportInd")
    public void setCriteriaAcaChildReportInd(String criteriaAcaChildReportInd) {
        this.criteriaAcaChildReportInd = criteriaAcaChildReportInd;
    }

    public Beneficiary100PutRequest withCriteriaAcaChildReportInd(String criteriaAcaChildReportInd) {
        this.criteriaAcaChildReportInd = criteriaAcaChildReportInd;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : PDRBENE_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : PDRBENE_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public Beneficiary100PutRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * From
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_BEGIN_DATE
     * 
     */
    @JsonProperty("criteria.collegeBeginDate")
    public Date getCriteriaCollegeBeginDate() {
        return criteriaCollegeBeginDate;
    }

    /**
     * From
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_BEGIN_DATE
     * 
     */
    @JsonProperty("criteria.collegeBeginDate")
    public void setCriteriaCollegeBeginDate(Date criteriaCollegeBeginDate) {
        this.criteriaCollegeBeginDate = criteriaCollegeBeginDate;
    }

    public Beneficiary100PutRequest withCriteriaCollegeBeginDate(Date criteriaCollegeBeginDate) {
        this.criteriaCollegeBeginDate = criteriaCollegeBeginDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNo")
    public Double getCriteriaSeqNo() {
        return criteriaSeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNo")
    public void setCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
    }

    public Beneficiary100PutRequest withCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
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

    public Beneficiary100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * To
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_END_DATE
     * 
     */
    @JsonProperty("criteria.collegeEndDate")
    public Date getCriteriaCollegeEndDate() {
        return criteriaCollegeEndDate;
    }

    /**
     * To
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_END_DATE
     * 
     */
    @JsonProperty("criteria.collegeEndDate")
    public void setCriteriaCollegeEndDate(Date criteriaCollegeEndDate) {
        this.criteriaCollegeEndDate = criteriaCollegeEndDate;
    }

    public Beneficiary100PutRequest withCriteriaCollegeEndDate(Date criteriaCollegeEndDate) {
        this.criteriaCollegeEndDate = criteriaCollegeEndDate;
        return this;
    }

    /**
     * Relationship to Employee
     * <p>
     * Lineage reference object : PDRBENE_BREL_CODE
     * (Required)
     * 
     */
    @JsonProperty("brelCode")
    public String getBrelCode() {
        return brelCode;
    }

    /**
     * Relationship to Employee
     * <p>
     * Lineage reference object : PDRBENE_BREL_CODE
     * (Required)
     * 
     */
    @JsonProperty("brelCode")
    public void setBrelCode(String brelCode) {
        this.brelCode = brelCode;
    }

    public Beneficiary100PutRequest withBrelCode(String brelCode) {
        this.brelCode = brelCode;
        return this;
    }

    /**
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("criteria.beneMrtlCode")
    public String getCriteriaBeneMrtlCode() {
        return criteriaBeneMrtlCode;
    }

    /**
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("criteria.beneMrtlCode")
    public void setCriteriaBeneMrtlCode(String criteriaBeneMrtlCode) {
        this.criteriaBeneMrtlCode = criteriaBeneMrtlCode;
    }

    public Beneficiary100PutRequest withCriteriaBeneMrtlCode(String criteriaBeneMrtlCode) {
        this.criteriaBeneMrtlCode = criteriaBeneMrtlCode;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : PDRBENE_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.activeInd")
    public String getCriteriaActiveInd() {
        return criteriaActiveInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : PDRBENE_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.activeInd")
    public void setCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
    }

    public Beneficiary100PutRequest withCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
        return this;
    }

    /**
     * Spouse Employed
     * <p>
     * Lineage reference object : PDRBENE_SPOUSE_EMPLOYED_IND
     * 
     */
    @JsonProperty("criteria.spouseEmployedInd")
    public String getCriteriaSpouseEmployedInd() {
        return criteriaSpouseEmployedInd;
    }

    /**
     * Spouse Employed
     * <p>
     * Lineage reference object : PDRBENE_SPOUSE_EMPLOYED_IND
     * 
     */
    @JsonProperty("criteria.spouseEmployedInd")
    public void setCriteriaSpouseEmployedInd(String criteriaSpouseEmployedInd) {
        this.criteriaSpouseEmployedInd = criteriaSpouseEmployedInd;
    }

    public Beneficiary100PutRequest withCriteriaSpouseEmployedInd(String criteriaSpouseEmployedInd) {
        this.criteriaSpouseEmployedInd = criteriaSpouseEmployedInd;
        return this;
    }

    /**
     * Attending College
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_IND
     * 
     */
    @JsonProperty("collegeInd")
    public String getCollegeInd() {
        return collegeInd;
    }

    /**
     * Attending College
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_IND
     * 
     */
    @JsonProperty("collegeInd")
    public void setCollegeInd(String collegeInd) {
        this.collegeInd = collegeInd;
    }

    public Beneficiary100PutRequest withCollegeInd(String collegeInd) {
        this.collegeInd = collegeInd;
        return this;
    }

    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.persAge")
    public Double getCriteriaPersAge() {
        return criteriaPersAge;
    }

    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.persAge")
    public void setCriteriaPersAge(Double criteriaPersAge) {
        this.criteriaPersAge = criteriaPersAge;
    }

    public Beneficiary100PutRequest withCriteriaPersAge(Double criteriaPersAge) {
        this.criteriaPersAge = criteriaPersAge;
        return this;
    }

    /**
     * Relationship to Employee
     * <p>
     * Lineage reference object : PDRBENE_BREL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.brelCode")
    public String getCriteriaBrelCode() {
        return criteriaBrelCode;
    }

    /**
     * Relationship to Employee
     * <p>
     * Lineage reference object : PDRBENE_BREL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.brelCode")
    public void setCriteriaBrelCode(String criteriaBrelCode) {
        this.criteriaBrelCode = criteriaBrelCode;
    }

    public Beneficiary100PutRequest withCriteriaBrelCode(String criteriaBrelCode) {
        this.criteriaBrelCode = criteriaBrelCode;
        return this;
    }

    /**
     * Disabled
     * <p>
     * Lineage reference object : PDRBENE_DISABILITY_IND
     * 
     */
    @JsonProperty("disabilityInd")
    public String getDisabilityInd() {
        return disabilityInd;
    }

    /**
     * Disabled
     * <p>
     * Lineage reference object : PDRBENE_DISABILITY_IND
     * 
     */
    @JsonProperty("disabilityInd")
    public void setDisabilityInd(String disabilityInd) {
        this.disabilityInd = disabilityInd;
    }

    public Beneficiary100PutRequest withDisabilityInd(String disabilityInd) {
        this.disabilityInd = disabilityInd;
        return this;
    }

    /**
     * ACA Reportable Child
     * <p>
     * Lineage reference object : PDRBENE_ACA_CHILD_REPORT_IND
     * 
     */
    @JsonProperty("acaChildReportInd")
    public String getAcaChildReportInd() {
        return acaChildReportInd;
    }

    /**
     * ACA Reportable Child
     * <p>
     * Lineage reference object : PDRBENE_ACA_CHILD_REPORT_IND
     * 
     */
    @JsonProperty("acaChildReportInd")
    public void setAcaChildReportInd(String acaChildReportInd) {
        this.acaChildReportInd = acaChildReportInd;
    }

    public Beneficiary100PutRequest withAcaChildReportInd(String acaChildReportInd) {
        this.acaChildReportInd = acaChildReportInd;
        return this;
    }

    /**
     * Attending College
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_IND
     * 
     */
    @JsonProperty("criteria.collegeInd")
    public String getCriteriaCollegeInd() {
        return criteriaCollegeInd;
    }

    /**
     * Attending College
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_IND
     * 
     */
    @JsonProperty("criteria.collegeInd")
    public void setCriteriaCollegeInd(String criteriaCollegeInd) {
        this.criteriaCollegeInd = criteriaCollegeInd;
    }

    public Beneficiary100PutRequest withCriteriaCollegeInd(String criteriaCollegeInd) {
        this.criteriaCollegeInd = criteriaCollegeInd;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("beneIdNo")
    public String getBeneIdNo() {
        return beneIdNo;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("beneIdNo")
    public void setBeneIdNo(String beneIdNo) {
        this.beneIdNo = beneIdNo;
    }

    public Beneficiary100PutRequest withBeneIdNo(String beneIdNo) {
        this.beneIdNo = beneIdNo;
        return this;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.beneSsn")
    public String getCriteriaBeneSsn() {
        return criteriaBeneSsn;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.beneSsn")
    public void setCriteriaBeneSsn(String criteriaBeneSsn) {
        this.criteriaBeneSsn = criteriaBeneSsn;
    }

    public Beneficiary100PutRequest withCriteriaBeneSsn(String criteriaBeneSsn) {
        this.criteriaBeneSsn = criteriaBeneSsn;
        return this;
    }

    /**
     * Member Type
     * <p>
     * Lineage reference object : PDRBENE_MEMBER_TYPE
     * (Required)
     * 
     */
    @JsonProperty("memberType")
    public String getMemberType() {
        return memberType;
    }

    /**
     * Member Type
     * <p>
     * Lineage reference object : PDRBENE_MEMBER_TYPE
     * (Required)
     * 
     */
    @JsonProperty("memberType")
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public Beneficiary100PutRequest withMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * Birth Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.birthDate")
    public Date getCriteriaBirthDate() {
        return criteriaBirthDate;
    }

    /**
     * Birth Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.birthDate")
    public void setCriteriaBirthDate(Date criteriaBirthDate) {
        this.criteriaBirthDate = criteriaBirthDate;
    }

    public Beneficiary100PutRequest withCriteriaBirthDate(Date criteriaBirthDate) {
        this.criteriaBirthDate = criteriaBirthDate;
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

    public Beneficiary100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Beneficiary100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addedDate");
        sb.append('=');
        sb.append(((this.addedDate == null)?"<null>":this.addedDate));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("criteriaSexInd");
        sb.append('=');
        sb.append(((this.criteriaSexInd == null)?"<null>":this.criteriaSexInd));
        sb.append(',');
        sb.append("criteriaBeneIdNo");
        sb.append('=');
        sb.append(((this.criteriaBeneIdNo == null)?"<null>":this.criteriaBeneIdNo));
        sb.append(',');
        sb.append("criteriaMemberType");
        sb.append('=');
        sb.append(((this.criteriaMemberType == null)?"<null>":this.criteriaMemberType));
        sb.append(',');
        sb.append("criteriaAddedDate");
        sb.append('=');
        sb.append(((this.criteriaAddedDate == null)?"<null>":this.criteriaAddedDate));
        sb.append(',');
        sb.append("criteriaDisabilityInd");
        sb.append('=');
        sb.append(((this.criteriaDisabilityInd == null)?"<null>":this.criteriaDisabilityInd));
        sb.append(',');
        sb.append("criteriaAcaChildReportInd");
        sb.append('=');
        sb.append(((this.criteriaAcaChildReportInd == null)?"<null>":this.criteriaAcaChildReportInd));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("criteriaCollegeBeginDate");
        sb.append('=');
        sb.append(((this.criteriaCollegeBeginDate == null)?"<null>":this.criteriaCollegeBeginDate));
        sb.append(',');
        sb.append("criteriaSeqNo");
        sb.append('=');
        sb.append(((this.criteriaSeqNo == null)?"<null>":this.criteriaSeqNo));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaCollegeEndDate");
        sb.append('=');
        sb.append(((this.criteriaCollegeEndDate == null)?"<null>":this.criteriaCollegeEndDate));
        sb.append(',');
        sb.append("brelCode");
        sb.append('=');
        sb.append(((this.brelCode == null)?"<null>":this.brelCode));
        sb.append(',');
        sb.append("criteriaBeneMrtlCode");
        sb.append('=');
        sb.append(((this.criteriaBeneMrtlCode == null)?"<null>":this.criteriaBeneMrtlCode));
        sb.append(',');
        sb.append("criteriaActiveInd");
        sb.append('=');
        sb.append(((this.criteriaActiveInd == null)?"<null>":this.criteriaActiveInd));
        sb.append(',');
        sb.append("criteriaSpouseEmployedInd");
        sb.append('=');
        sb.append(((this.criteriaSpouseEmployedInd == null)?"<null>":this.criteriaSpouseEmployedInd));
        sb.append(',');
        sb.append("collegeInd");
        sb.append('=');
        sb.append(((this.collegeInd == null)?"<null>":this.collegeInd));
        sb.append(',');
        sb.append("criteriaPersAge");
        sb.append('=');
        sb.append(((this.criteriaPersAge == null)?"<null>":this.criteriaPersAge));
        sb.append(',');
        sb.append("criteriaBrelCode");
        sb.append('=');
        sb.append(((this.criteriaBrelCode == null)?"<null>":this.criteriaBrelCode));
        sb.append(',');
        sb.append("disabilityInd");
        sb.append('=');
        sb.append(((this.disabilityInd == null)?"<null>":this.disabilityInd));
        sb.append(',');
        sb.append("acaChildReportInd");
        sb.append('=');
        sb.append(((this.acaChildReportInd == null)?"<null>":this.acaChildReportInd));
        sb.append(',');
        sb.append("criteriaCollegeInd");
        sb.append('=');
        sb.append(((this.criteriaCollegeInd == null)?"<null>":this.criteriaCollegeInd));
        sb.append(',');
        sb.append("beneIdNo");
        sb.append('=');
        sb.append(((this.beneIdNo == null)?"<null>":this.beneIdNo));
        sb.append(',');
        sb.append("criteriaBeneSsn");
        sb.append('=');
        sb.append(((this.criteriaBeneSsn == null)?"<null>":this.criteriaBeneSsn));
        sb.append(',');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
        sb.append(',');
        sb.append("criteriaBirthDate");
        sb.append('=');
        sb.append(((this.criteriaBirthDate == null)?"<null>":this.criteriaBirthDate));
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
        result = ((result* 31)+((this.addedDate == null)? 0 :this.addedDate.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.criteriaBirthDate == null)? 0 :this.criteriaBirthDate.hashCode()));
        result = ((result* 31)+((this.criteriaCollegeEndDate == null)? 0 :this.criteriaCollegeEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaBeneSsn == null)? 0 :this.criteriaBeneSsn.hashCode()));
        result = ((result* 31)+((this.criteriaAcaChildReportInd == null)? 0 :this.criteriaAcaChildReportInd.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.criteriaSexInd == null)? 0 :this.criteriaSexInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaSpouseEmployedInd == null)? 0 :this.criteriaSpouseEmployedInd.hashCode()));
        result = ((result* 31)+((this.brelCode == null)? 0 :this.brelCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollegeInd == null)? 0 :this.criteriaCollegeInd.hashCode()));
        result = ((result* 31)+((this.criteriaDisabilityInd == null)? 0 :this.criteriaDisabilityInd.hashCode()));
        result = ((result* 31)+((this.criteriaCollegeBeginDate == null)? 0 :this.criteriaCollegeBeginDate.hashCode()));
        result = ((result* 31)+((this.criteriaBrelCode == null)? 0 :this.criteriaBrelCode.hashCode()));
        result = ((result* 31)+((this.criteriaActiveInd == null)? 0 :this.criteriaActiveInd.hashCode()));
        result = ((result* 31)+((this.collegeInd == null)? 0 :this.collegeInd.hashCode()));
        result = ((result* 31)+((this.criteriaBeneIdNo == null)? 0 :this.criteriaBeneIdNo.hashCode()));
        result = ((result* 31)+((this.disabilityInd == null)? 0 :this.disabilityInd.hashCode()));
        result = ((result* 31)+((this.acaChildReportInd == null)? 0 :this.acaChildReportInd.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNo == null)? 0 :this.criteriaSeqNo.hashCode()));
        result = ((result* 31)+((this.beneIdNo == null)? 0 :this.beneIdNo.hashCode()));
        result = ((result* 31)+((this.memberType == null)? 0 :this.memberType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaMemberType == null)? 0 :this.criteriaMemberType.hashCode()));
        result = ((result* 31)+((this.criteriaAddedDate == null)? 0 :this.criteriaAddedDate.hashCode()));
        result = ((result* 31)+((this.criteriaBeneMrtlCode == null)? 0 :this.criteriaBeneMrtlCode.hashCode()));
        result = ((result* 31)+((this.criteriaPersAge == null)? 0 :this.criteriaPersAge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Beneficiary100PutRequest) == false) {
            return false;
        }
        Beneficiary100PutRequest rhs = ((Beneficiary100PutRequest) other);
        return (((((((((((((((((((((((((((((this.addedDate == rhs.addedDate)||((this.addedDate!= null)&&this.addedDate.equals(rhs.addedDate)))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.criteriaBirthDate == rhs.criteriaBirthDate)||((this.criteriaBirthDate!= null)&&this.criteriaBirthDate.equals(rhs.criteriaBirthDate))))&&((this.criteriaCollegeEndDate == rhs.criteriaCollegeEndDate)||((this.criteriaCollegeEndDate!= null)&&this.criteriaCollegeEndDate.equals(rhs.criteriaCollegeEndDate))))&&((this.criteriaBeneSsn == rhs.criteriaBeneSsn)||((this.criteriaBeneSsn!= null)&&this.criteriaBeneSsn.equals(rhs.criteriaBeneSsn))))&&((this.criteriaAcaChildReportInd == rhs.criteriaAcaChildReportInd)||((this.criteriaAcaChildReportInd!= null)&&this.criteriaAcaChildReportInd.equals(rhs.criteriaAcaChildReportInd))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.criteriaSexInd == rhs.criteriaSexInd)||((this.criteriaSexInd!= null)&&this.criteriaSexInd.equals(rhs.criteriaSexInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaSpouseEmployedInd == rhs.criteriaSpouseEmployedInd)||((this.criteriaSpouseEmployedInd!= null)&&this.criteriaSpouseEmployedInd.equals(rhs.criteriaSpouseEmployedInd))))&&((this.brelCode == rhs.brelCode)||((this.brelCode!= null)&&this.brelCode.equals(rhs.brelCode))))&&((this.criteriaCollegeInd == rhs.criteriaCollegeInd)||((this.criteriaCollegeInd!= null)&&this.criteriaCollegeInd.equals(rhs.criteriaCollegeInd))))&&((this.criteriaDisabilityInd == rhs.criteriaDisabilityInd)||((this.criteriaDisabilityInd!= null)&&this.criteriaDisabilityInd.equals(rhs.criteriaDisabilityInd))))&&((this.criteriaCollegeBeginDate == rhs.criteriaCollegeBeginDate)||((this.criteriaCollegeBeginDate!= null)&&this.criteriaCollegeBeginDate.equals(rhs.criteriaCollegeBeginDate))))&&((this.criteriaBrelCode == rhs.criteriaBrelCode)||((this.criteriaBrelCode!= null)&&this.criteriaBrelCode.equals(rhs.criteriaBrelCode))))&&((this.criteriaActiveInd == rhs.criteriaActiveInd)||((this.criteriaActiveInd!= null)&&this.criteriaActiveInd.equals(rhs.criteriaActiveInd))))&&((this.collegeInd == rhs.collegeInd)||((this.collegeInd!= null)&&this.collegeInd.equals(rhs.collegeInd))))&&((this.criteriaBeneIdNo == rhs.criteriaBeneIdNo)||((this.criteriaBeneIdNo!= null)&&this.criteriaBeneIdNo.equals(rhs.criteriaBeneIdNo))))&&((this.disabilityInd == rhs.disabilityInd)||((this.disabilityInd!= null)&&this.disabilityInd.equals(rhs.disabilityInd))))&&((this.acaChildReportInd == rhs.acaChildReportInd)||((this.acaChildReportInd!= null)&&this.acaChildReportInd.equals(rhs.acaChildReportInd))))&&((this.criteriaSeqNo == rhs.criteriaSeqNo)||((this.criteriaSeqNo!= null)&&this.criteriaSeqNo.equals(rhs.criteriaSeqNo))))&&((this.beneIdNo == rhs.beneIdNo)||((this.beneIdNo!= null)&&this.beneIdNo.equals(rhs.beneIdNo))))&&((this.memberType == rhs.memberType)||((this.memberType!= null)&&this.memberType.equals(rhs.memberType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaMemberType == rhs.criteriaMemberType)||((this.criteriaMemberType!= null)&&this.criteriaMemberType.equals(rhs.criteriaMemberType))))&&((this.criteriaAddedDate == rhs.criteriaAddedDate)||((this.criteriaAddedDate!= null)&&this.criteriaAddedDate.equals(rhs.criteriaAddedDate))))&&((this.criteriaBeneMrtlCode == rhs.criteriaBeneMrtlCode)||((this.criteriaBeneMrtlCode!= null)&&this.criteriaBeneMrtlCode.equals(rhs.criteriaBeneMrtlCode))))&&((this.criteriaPersAge == rhs.criteriaPersAge)||((this.criteriaPersAge!= null)&&this.criteriaPersAge.equals(rhs.criteriaPersAge))));
    }

}
