
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
    "persAge",
    "spouseEmployedInd",
    "beneMrtlCode",
    "beneSsn",
    "birthDate",
    "collegeEndDate",
    "collegeInd",
    "collegeBeginDate",
    "disabilityInd",
    "acaChildReportInd",
    "activeInd",
    "beneIdNo",
    "beneSurnamePrefix",
    "id",
    "memberType",
    "sexInd"
})
@Generated("jsonschema2pojo")
public class Beneficiary100GetRequest {

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
    /**
     * Age
     * <p>
     * 
     * 
     */
    @JsonProperty("persAge")
    private Double persAge;
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
     * Marital Status
     * <p>
     * Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("beneMrtlCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvmrtl")
    private String beneMrtlCode;
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
     * Last Name Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("beneSurnamePrefix")
    private String beneSurnamePrefix;
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

    public Beneficiary100GetRequest withBrelCode(String brelCode) {
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

    public Beneficiary100GetRequest withAddedDate(Date addedDate) {
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

    public Beneficiary100GetRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
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

    public Beneficiary100GetRequest withPersAge(Double persAge) {
        this.persAge = persAge;
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

    public Beneficiary100GetRequest withSpouseEmployedInd(String spouseEmployedInd) {
        this.spouseEmployedInd = spouseEmployedInd;
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

    public Beneficiary100GetRequest withBeneMrtlCode(String beneMrtlCode) {
        this.beneMrtlCode = beneMrtlCode;
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

    public Beneficiary100GetRequest withBeneSsn(String beneSsn) {
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

    public Beneficiary100GetRequest withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public Beneficiary100GetRequest withCollegeEndDate(Date collegeEndDate) {
        this.collegeEndDate = collegeEndDate;
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

    public Beneficiary100GetRequest withCollegeInd(String collegeInd) {
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

    public Beneficiary100GetRequest withCollegeBeginDate(Date collegeBeginDate) {
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

    public Beneficiary100GetRequest withDisabilityInd(String disabilityInd) {
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

    public Beneficiary100GetRequest withAcaChildReportInd(String acaChildReportInd) {
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

    public Beneficiary100GetRequest withActiveInd(String activeInd) {
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

    public Beneficiary100GetRequest withBeneIdNo(String beneIdNo) {
        this.beneIdNo = beneIdNo;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("beneSurnamePrefix")
    public String getBeneSurnamePrefix() {
        return beneSurnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * 
     * 
     */
    @JsonProperty("beneSurnamePrefix")
    public void setBeneSurnamePrefix(String beneSurnamePrefix) {
        this.beneSurnamePrefix = beneSurnamePrefix;
    }

    public Beneficiary100GetRequest withBeneSurnamePrefix(String beneSurnamePrefix) {
        this.beneSurnamePrefix = beneSurnamePrefix;
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

    public Beneficiary100GetRequest withId(String id) {
        this.id = id;
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

    public Beneficiary100GetRequest withMemberType(String memberType) {
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

    public Beneficiary100GetRequest withSexInd(String sexInd) {
        this.sexInd = sexInd;
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

    public Beneficiary100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Beneficiary100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("persAge");
        sb.append('=');
        sb.append(((this.persAge == null)?"<null>":this.persAge));
        sb.append(',');
        sb.append("spouseEmployedInd");
        sb.append('=');
        sb.append(((this.spouseEmployedInd == null)?"<null>":this.spouseEmployedInd));
        sb.append(',');
        sb.append("beneMrtlCode");
        sb.append('=');
        sb.append(((this.beneMrtlCode == null)?"<null>":this.beneMrtlCode));
        sb.append(',');
        sb.append("beneSsn");
        sb.append('=');
        sb.append(((this.beneSsn == null)?"<null>":this.beneSsn));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("collegeEndDate");
        sb.append('=');
        sb.append(((this.collegeEndDate == null)?"<null>":this.collegeEndDate));
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
        sb.append("beneSurnamePrefix");
        sb.append('=');
        sb.append(((this.beneSurnamePrefix == null)?"<null>":this.beneSurnamePrefix));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
        sb.append(',');
        sb.append("sexInd");
        sb.append('=');
        sb.append(((this.sexInd == null)?"<null>":this.sexInd));
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
        result = ((result* 31)+((this.brelCode == null)? 0 :this.brelCode.hashCode()));
        result = ((result* 31)+((this.addedDate == null)? 0 :this.addedDate.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.persAge == null)? 0 :this.persAge.hashCode()));
        result = ((result* 31)+((this.spouseEmployedInd == null)? 0 :this.spouseEmployedInd.hashCode()));
        result = ((result* 31)+((this.beneMrtlCode == null)? 0 :this.beneMrtlCode.hashCode()));
        result = ((result* 31)+((this.beneSsn == null)? 0 :this.beneSsn.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.collegeEndDate == null)? 0 :this.collegeEndDate.hashCode()));
        result = ((result* 31)+((this.collegeInd == null)? 0 :this.collegeInd.hashCode()));
        result = ((result* 31)+((this.collegeBeginDate == null)? 0 :this.collegeBeginDate.hashCode()));
        result = ((result* 31)+((this.disabilityInd == null)? 0 :this.disabilityInd.hashCode()));
        result = ((result* 31)+((this.acaChildReportInd == null)? 0 :this.acaChildReportInd.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.beneIdNo == null)? 0 :this.beneIdNo.hashCode()));
        result = ((result* 31)+((this.beneSurnamePrefix == null)? 0 :this.beneSurnamePrefix.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.memberType == null)? 0 :this.memberType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sexInd == null)? 0 :this.sexInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Beneficiary100GetRequest) == false) {
            return false;
        }
        Beneficiary100GetRequest rhs = ((Beneficiary100GetRequest) other);
        return (((((((((((((((((((((this.brelCode == rhs.brelCode)||((this.brelCode!= null)&&this.brelCode.equals(rhs.brelCode)))&&((this.addedDate == rhs.addedDate)||((this.addedDate!= null)&&this.addedDate.equals(rhs.addedDate))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.persAge == rhs.persAge)||((this.persAge!= null)&&this.persAge.equals(rhs.persAge))))&&((this.spouseEmployedInd == rhs.spouseEmployedInd)||((this.spouseEmployedInd!= null)&&this.spouseEmployedInd.equals(rhs.spouseEmployedInd))))&&((this.beneMrtlCode == rhs.beneMrtlCode)||((this.beneMrtlCode!= null)&&this.beneMrtlCode.equals(rhs.beneMrtlCode))))&&((this.beneSsn == rhs.beneSsn)||((this.beneSsn!= null)&&this.beneSsn.equals(rhs.beneSsn))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.collegeEndDate == rhs.collegeEndDate)||((this.collegeEndDate!= null)&&this.collegeEndDate.equals(rhs.collegeEndDate))))&&((this.collegeInd == rhs.collegeInd)||((this.collegeInd!= null)&&this.collegeInd.equals(rhs.collegeInd))))&&((this.collegeBeginDate == rhs.collegeBeginDate)||((this.collegeBeginDate!= null)&&this.collegeBeginDate.equals(rhs.collegeBeginDate))))&&((this.disabilityInd == rhs.disabilityInd)||((this.disabilityInd!= null)&&this.disabilityInd.equals(rhs.disabilityInd))))&&((this.acaChildReportInd == rhs.acaChildReportInd)||((this.acaChildReportInd!= null)&&this.acaChildReportInd.equals(rhs.acaChildReportInd))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.beneIdNo == rhs.beneIdNo)||((this.beneIdNo!= null)&&this.beneIdNo.equals(rhs.beneIdNo))))&&((this.beneSurnamePrefix == rhs.beneSurnamePrefix)||((this.beneSurnamePrefix!= null)&&this.beneSurnamePrefix.equals(rhs.beneSurnamePrefix))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.memberType == rhs.memberType)||((this.memberType!= null)&&this.memberType.equals(rhs.memberType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sexInd == rhs.sexInd)||((this.sexInd!= null)&&this.sexInd.equals(rhs.sexInd))));
    }

}
