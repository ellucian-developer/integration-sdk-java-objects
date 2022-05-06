
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
    "brelCode",
    "addedDate",
    "seqNo",
    "mrtlDesc",
    "persAge",
    "beneMi",
    "beneMrtlCode",
    "spouseEmployedInd",
    "beneSsn",
    "birthDate",
    "brelDesc",
    "collegeEndDate",
    "userId",
    "collegeInd",
    "collegeBeginDate",
    "disabilityInd",
    "activityDate",
    "acaChildReportInd",
    "activeInd",
    "beneIdNo",
    "beneFirstName",
    "memberType",
    "sexInd",
    "beneLastName"
})
@Generated("jsonschema2pojo")
public class Beneficiary100PutResponse {

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
    @JsonProperty("mrtlDesc")
    private String mrtlDesc;
    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("persAge")
    private Double persAge;
    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("beneMi")
    private String beneMi;
    /**
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("beneMrtlCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvmrtl")
    private String beneMrtlCode;
    /**
     * Spouse Employed
     * <p>
     * Lineage reference object : PDRBENE_SPOUSE_EMPLOYED_IND
     * 
     */
    @JsonProperty("spouseEmployedInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_SPOUSE_EMPLOYED_IND")
    private String spouseEmployedInd;
    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("beneSsn")
    private String beneSsn;
    /**
     * Birth Date
     * <p>
     * 
     * 
     */
    @JsonProperty("birthDate")
    private Date birthDate;
    @JsonProperty("brelDesc")
    private String brelDesc;
    /**
     * To
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_END_DATE
     * 
     */
    @JsonProperty("collegeEndDate")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_COLLEGE_END_DATE")
    private Date collegeEndDate;
    /**
     * Lineage reference object : PDRBENE_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_USER_ID")
    private String userId;
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
     * From
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_BEGIN_DATE
     * 
     */
    @JsonProperty("collegeBeginDate")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_COLLEGE_BEGIN_DATE")
    private Date collegeBeginDate;
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
     * Lineage reference object : PDRBENE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_ACTIVITY_DATE")
    private Date activityDate;
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
     * Active
     * <p>
     * Lineage reference object : PDRBENE_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_ACTIVE_IND")
    private String activeInd;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("beneIdNo")
    private String beneIdNo;
    /**
     * First Name
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("beneFirstName")
    private String beneFirstName;
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
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("sexInd")
    private String sexInd;
    /**
     * Last Name
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("beneLastName")
    private String beneLastName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Beneficiary100PutResponse withBrelCode(String brelCode) {
        this.brelCode = brelCode;
        return this;
    }

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

    public Beneficiary100PutResponse withAddedDate(Date addedDate) {
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

    public Beneficiary100PutResponse withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    @JsonProperty("mrtlDesc")
    public String getMrtlDesc() {
        return mrtlDesc;
    }

    @JsonProperty("mrtlDesc")
    public void setMrtlDesc(String mrtlDesc) {
        this.mrtlDesc = mrtlDesc;
    }

    public Beneficiary100PutResponse withMrtlDesc(String mrtlDesc) {
        this.mrtlDesc = mrtlDesc;
        return this;
    }

    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("persAge")
    public Double getPersAge() {
        return persAge;
    }

    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("persAge")
    public void setPersAge(Double persAge) {
        this.persAge = persAge;
    }

    public Beneficiary100PutResponse withPersAge(Double persAge) {
        this.persAge = persAge;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("beneMi")
    public String getBeneMi() {
        return beneMi;
    }

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("beneMi")
    public void setBeneMi(String beneMi) {
        this.beneMi = beneMi;
    }

    public Beneficiary100PutResponse withBeneMi(String beneMi) {
        this.beneMi = beneMi;
        return this;
    }

    /**
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("beneMrtlCode")
    public String getBeneMrtlCode() {
        return beneMrtlCode;
    }

    /**
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("beneMrtlCode")
    public void setBeneMrtlCode(String beneMrtlCode) {
        this.beneMrtlCode = beneMrtlCode;
    }

    public Beneficiary100PutResponse withBeneMrtlCode(String beneMrtlCode) {
        this.beneMrtlCode = beneMrtlCode;
        return this;
    }

    /**
     * Spouse Employed
     * <p>
     * Lineage reference object : PDRBENE_SPOUSE_EMPLOYED_IND
     * 
     */
    @JsonProperty("spouseEmployedInd")
    public String getSpouseEmployedInd() {
        return spouseEmployedInd;
    }

    /**
     * Spouse Employed
     * <p>
     * Lineage reference object : PDRBENE_SPOUSE_EMPLOYED_IND
     * 
     */
    @JsonProperty("spouseEmployedInd")
    public void setSpouseEmployedInd(String spouseEmployedInd) {
        this.spouseEmployedInd = spouseEmployedInd;
    }

    public Beneficiary100PutResponse withSpouseEmployedInd(String spouseEmployedInd) {
        this.spouseEmployedInd = spouseEmployedInd;
        return this;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("beneSsn")
    public String getBeneSsn() {
        return beneSsn;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("beneSsn")
    public void setBeneSsn(String beneSsn) {
        this.beneSsn = beneSsn;
    }

    public Beneficiary100PutResponse withBeneSsn(String beneSsn) {
        this.beneSsn = beneSsn;
        return this;
    }

    /**
     * Birth Date
     * <p>
     * 
     * 
     */
    @JsonProperty("birthDate")
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Birth Date
     * <p>
     * 
     * 
     */
    @JsonProperty("birthDate")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Beneficiary100PutResponse withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @JsonProperty("brelDesc")
    public String getBrelDesc() {
        return brelDesc;
    }

    @JsonProperty("brelDesc")
    public void setBrelDesc(String brelDesc) {
        this.brelDesc = brelDesc;
    }

    public Beneficiary100PutResponse withBrelDesc(String brelDesc) {
        this.brelDesc = brelDesc;
        return this;
    }

    /**
     * To
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_END_DATE
     * 
     */
    @JsonProperty("collegeEndDate")
    public Date getCollegeEndDate() {
        return collegeEndDate;
    }

    /**
     * To
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_END_DATE
     * 
     */
    @JsonProperty("collegeEndDate")
    public void setCollegeEndDate(Date collegeEndDate) {
        this.collegeEndDate = collegeEndDate;
    }

    public Beneficiary100PutResponse withCollegeEndDate(Date collegeEndDate) {
        this.collegeEndDate = collegeEndDate;
        return this;
    }

    /**
     * Lineage reference object : PDRBENE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PDRBENE_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Beneficiary100PutResponse withUserId(String userId) {
        this.userId = userId;
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

    public Beneficiary100PutResponse withCollegeInd(String collegeInd) {
        this.collegeInd = collegeInd;
        return this;
    }

    /**
     * From
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_BEGIN_DATE
     * 
     */
    @JsonProperty("collegeBeginDate")
    public Date getCollegeBeginDate() {
        return collegeBeginDate;
    }

    /**
     * From
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_BEGIN_DATE
     * 
     */
    @JsonProperty("collegeBeginDate")
    public void setCollegeBeginDate(Date collegeBeginDate) {
        this.collegeBeginDate = collegeBeginDate;
    }

    public Beneficiary100PutResponse withCollegeBeginDate(Date collegeBeginDate) {
        this.collegeBeginDate = collegeBeginDate;
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

    public Beneficiary100PutResponse withDisabilityInd(String disabilityInd) {
        this.disabilityInd = disabilityInd;
        return this;
    }

    /**
     * Lineage reference object : PDRBENE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PDRBENE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Beneficiary100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public Beneficiary100PutResponse withAcaChildReportInd(String acaChildReportInd) {
        this.acaChildReportInd = acaChildReportInd;
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

    public Beneficiary100PutResponse withActiveInd(String activeInd) {
        this.activeInd = activeInd;
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

    public Beneficiary100PutResponse withBeneIdNo(String beneIdNo) {
        this.beneIdNo = beneIdNo;
        return this;
    }

    /**
     * First Name
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("beneFirstName")
    public String getBeneFirstName() {
        return beneFirstName;
    }

    /**
     * First Name
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("beneFirstName")
    public void setBeneFirstName(String beneFirstName) {
        this.beneFirstName = beneFirstName;
    }

    public Beneficiary100PutResponse withBeneFirstName(String beneFirstName) {
        this.beneFirstName = beneFirstName;
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

    public Beneficiary100PutResponse withMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("sexInd")
    public String getSexInd() {
        return sexInd;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("sexInd")
    public void setSexInd(String sexInd) {
        this.sexInd = sexInd;
    }

    public Beneficiary100PutResponse withSexInd(String sexInd) {
        this.sexInd = sexInd;
        return this;
    }

    /**
     * Last Name
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("beneLastName")
    public String getBeneLastName() {
        return beneLastName;
    }

    /**
     * Last Name
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("beneLastName")
    public void setBeneLastName(String beneLastName) {
        this.beneLastName = beneLastName;
    }

    public Beneficiary100PutResponse withBeneLastName(String beneLastName) {
        this.beneLastName = beneLastName;
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

    public Beneficiary100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Beneficiary100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brelCode");
        sb.append('=');
        sb.append(((this.brelCode == null)?"<null>":this.brelCode));
        sb.append(',');
        sb.append("addedDate");
        sb.append('=');
        sb.append(((this.addedDate == null)?"<null>":this.addedDate));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("mrtlDesc");
        sb.append('=');
        sb.append(((this.mrtlDesc == null)?"<null>":this.mrtlDesc));
        sb.append(',');
        sb.append("persAge");
        sb.append('=');
        sb.append(((this.persAge == null)?"<null>":this.persAge));
        sb.append(',');
        sb.append("beneMi");
        sb.append('=');
        sb.append(((this.beneMi == null)?"<null>":this.beneMi));
        sb.append(',');
        sb.append("beneMrtlCode");
        sb.append('=');
        sb.append(((this.beneMrtlCode == null)?"<null>":this.beneMrtlCode));
        sb.append(',');
        sb.append("spouseEmployedInd");
        sb.append('=');
        sb.append(((this.spouseEmployedInd == null)?"<null>":this.spouseEmployedInd));
        sb.append(',');
        sb.append("beneSsn");
        sb.append('=');
        sb.append(((this.beneSsn == null)?"<null>":this.beneSsn));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("brelDesc");
        sb.append('=');
        sb.append(((this.brelDesc == null)?"<null>":this.brelDesc));
        sb.append(',');
        sb.append("collegeEndDate");
        sb.append('=');
        sb.append(((this.collegeEndDate == null)?"<null>":this.collegeEndDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("collegeInd");
        sb.append('=');
        sb.append(((this.collegeInd == null)?"<null>":this.collegeInd));
        sb.append(',');
        sb.append("collegeBeginDate");
        sb.append('=');
        sb.append(((this.collegeBeginDate == null)?"<null>":this.collegeBeginDate));
        sb.append(',');
        sb.append("disabilityInd");
        sb.append('=');
        sb.append(((this.disabilityInd == null)?"<null>":this.disabilityInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("acaChildReportInd");
        sb.append('=');
        sb.append(((this.acaChildReportInd == null)?"<null>":this.acaChildReportInd));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("beneIdNo");
        sb.append('=');
        sb.append(((this.beneIdNo == null)?"<null>":this.beneIdNo));
        sb.append(',');
        sb.append("beneFirstName");
        sb.append('=');
        sb.append(((this.beneFirstName == null)?"<null>":this.beneFirstName));
        sb.append(',');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
        sb.append(',');
        sb.append("sexInd");
        sb.append('=');
        sb.append(((this.sexInd == null)?"<null>":this.sexInd));
        sb.append(',');
        sb.append("beneLastName");
        sb.append('=');
        sb.append(((this.beneLastName == null)?"<null>":this.beneLastName));
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
        result = ((result* 31)+((this.beneMi == null)? 0 :this.beneMi.hashCode()));
        result = ((result* 31)+((this.beneMrtlCode == null)? 0 :this.beneMrtlCode.hashCode()));
        result = ((result* 31)+((this.beneSsn == null)? 0 :this.beneSsn.hashCode()));
        result = ((result* 31)+((this.brelDesc == null)? 0 :this.brelDesc.hashCode()));
        result = ((result* 31)+((this.collegeBeginDate == null)? 0 :this.collegeBeginDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.beneFirstName == null)? 0 :this.beneFirstName.hashCode()));
        result = ((result* 31)+((this.sexInd == null)? 0 :this.sexInd.hashCode()));
        result = ((result* 31)+((this.brelCode == null)? 0 :this.brelCode.hashCode()));
        result = ((result* 31)+((this.mrtlDesc == null)? 0 :this.mrtlDesc.hashCode()));
        result = ((result* 31)+((this.persAge == null)? 0 :this.persAge.hashCode()));
        result = ((result* 31)+((this.spouseEmployedInd == null)? 0 :this.spouseEmployedInd.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.collegeEndDate == null)? 0 :this.collegeEndDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.collegeInd == null)? 0 :this.collegeInd.hashCode()));
        result = ((result* 31)+((this.disabilityInd == null)? 0 :this.disabilityInd.hashCode()));
        result = ((result* 31)+((this.acaChildReportInd == null)? 0 :this.acaChildReportInd.hashCode()));
        result = ((result* 31)+((this.beneIdNo == null)? 0 :this.beneIdNo.hashCode()));
        result = ((result* 31)+((this.memberType == null)? 0 :this.memberType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.beneLastName == null)? 0 :this.beneLastName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Beneficiary100PutResponse) == false) {
            return false;
        }
        Beneficiary100PutResponse rhs = ((Beneficiary100PutResponse) other);
        return ((((((((((((((((((((((((((this.addedDate == rhs.addedDate)||((this.addedDate!= null)&&this.addedDate.equals(rhs.addedDate)))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.beneMi == rhs.beneMi)||((this.beneMi!= null)&&this.beneMi.equals(rhs.beneMi))))&&((this.beneMrtlCode == rhs.beneMrtlCode)||((this.beneMrtlCode!= null)&&this.beneMrtlCode.equals(rhs.beneMrtlCode))))&&((this.beneSsn == rhs.beneSsn)||((this.beneSsn!= null)&&this.beneSsn.equals(rhs.beneSsn))))&&((this.brelDesc == rhs.brelDesc)||((this.brelDesc!= null)&&this.brelDesc.equals(rhs.brelDesc))))&&((this.collegeBeginDate == rhs.collegeBeginDate)||((this.collegeBeginDate!= null)&&this.collegeBeginDate.equals(rhs.collegeBeginDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.beneFirstName == rhs.beneFirstName)||((this.beneFirstName!= null)&&this.beneFirstName.equals(rhs.beneFirstName))))&&((this.sexInd == rhs.sexInd)||((this.sexInd!= null)&&this.sexInd.equals(rhs.sexInd))))&&((this.brelCode == rhs.brelCode)||((this.brelCode!= null)&&this.brelCode.equals(rhs.brelCode))))&&((this.mrtlDesc == rhs.mrtlDesc)||((this.mrtlDesc!= null)&&this.mrtlDesc.equals(rhs.mrtlDesc))))&&((this.persAge == rhs.persAge)||((this.persAge!= null)&&this.persAge.equals(rhs.persAge))))&&((this.spouseEmployedInd == rhs.spouseEmployedInd)||((this.spouseEmployedInd!= null)&&this.spouseEmployedInd.equals(rhs.spouseEmployedInd))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.collegeEndDate == rhs.collegeEndDate)||((this.collegeEndDate!= null)&&this.collegeEndDate.equals(rhs.collegeEndDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.collegeInd == rhs.collegeInd)||((this.collegeInd!= null)&&this.collegeInd.equals(rhs.collegeInd))))&&((this.disabilityInd == rhs.disabilityInd)||((this.disabilityInd!= null)&&this.disabilityInd.equals(rhs.disabilityInd))))&&((this.acaChildReportInd == rhs.acaChildReportInd)||((this.acaChildReportInd!= null)&&this.acaChildReportInd.equals(rhs.acaChildReportInd))))&&((this.beneIdNo == rhs.beneIdNo)||((this.beneIdNo!= null)&&this.beneIdNo.equals(rhs.beneIdNo))))&&((this.memberType == rhs.memberType)||((this.memberType!= null)&&this.memberType.equals(rhs.memberType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.beneLastName == rhs.beneLastName)||((this.beneLastName!= null)&&this.beneLastName.equals(rhs.beneLastName))));
    }

}
