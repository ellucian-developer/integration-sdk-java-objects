
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
    "disabilityInd",
    "addedDate",
    "seqNo",
    "acaChildReportInd",
    "activeInd",
    "beneIdNo",
    "id",
    "memberType",
    "collegeInd"
})
@Generated("jsonschema2pojo")
public class Beneficiary100PostRequest {

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
     * Disabled
     * <p>
     * Lineage reference object : PDRBENE_DISABILITY_IND
     * 
     */
    @JsonProperty("disabilityInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_DISABILITY_IND")
    private String disabilityInd;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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
     * Attending College
     * <p>
     * Lineage reference object : PDRBENE_COLLEGE_IND
     * 
     */
    @JsonProperty("collegeInd")
    @JsonPropertyDescription("Lineage reference object : PDRBENE_COLLEGE_IND")
    private String collegeInd;
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

    public Beneficiary100PostRequest withBrelCode(String brelCode) {
        this.brelCode = brelCode;
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

    public Beneficiary100PostRequest withDisabilityInd(String disabilityInd) {
        this.disabilityInd = disabilityInd;
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

    public Beneficiary100PostRequest withAddedDate(Date addedDate) {
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

    public Beneficiary100PostRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
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

    public Beneficiary100PostRequest withAcaChildReportInd(String acaChildReportInd) {
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

    public Beneficiary100PostRequest withActiveInd(String activeInd) {
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

    public Beneficiary100PostRequest withBeneIdNo(String beneIdNo) {
        this.beneIdNo = beneIdNo;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public Beneficiary100PostRequest withId(Object id) {
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

    public Beneficiary100PostRequest withMemberType(String memberType) {
        this.memberType = memberType;
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

    public Beneficiary100PostRequest withCollegeInd(String collegeInd) {
        this.collegeInd = collegeInd;
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

    public Beneficiary100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Beneficiary100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("brelCode");
        sb.append('=');
        sb.append(((this.brelCode == null)?"<null>":this.brelCode));
        sb.append(',');
        sb.append("disabilityInd");
        sb.append('=');
        sb.append(((this.disabilityInd == null)?"<null>":this.disabilityInd));
        sb.append(',');
        sb.append("addedDate");
        sb.append('=');
        sb.append(((this.addedDate == null)?"<null>":this.addedDate));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
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
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
        sb.append(',');
        sb.append("collegeInd");
        sb.append('=');
        sb.append(((this.collegeInd == null)?"<null>":this.collegeInd));
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
        result = ((result* 31)+((this.disabilityInd == null)? 0 :this.disabilityInd.hashCode()));
        result = ((result* 31)+((this.addedDate == null)? 0 :this.addedDate.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.acaChildReportInd == null)? 0 :this.acaChildReportInd.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.beneIdNo == null)? 0 :this.beneIdNo.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.memberType == null)? 0 :this.memberType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collegeInd == null)? 0 :this.collegeInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Beneficiary100PostRequest) == false) {
            return false;
        }
        Beneficiary100PostRequest rhs = ((Beneficiary100PostRequest) other);
        return ((((((((((((this.brelCode == rhs.brelCode)||((this.brelCode!= null)&&this.brelCode.equals(rhs.brelCode)))&&((this.disabilityInd == rhs.disabilityInd)||((this.disabilityInd!= null)&&this.disabilityInd.equals(rhs.disabilityInd))))&&((this.addedDate == rhs.addedDate)||((this.addedDate!= null)&&this.addedDate.equals(rhs.addedDate))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.acaChildReportInd == rhs.acaChildReportInd)||((this.acaChildReportInd!= null)&&this.acaChildReportInd.equals(rhs.acaChildReportInd))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.beneIdNo == rhs.beneIdNo)||((this.beneIdNo!= null)&&this.beneIdNo.equals(rhs.beneIdNo))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.memberType == rhs.memberType)||((this.memberType!= null)&&this.memberType.equals(rhs.memberType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collegeInd == rhs.collegeInd)||((this.collegeInd!= null)&&this.collegeInd.equals(rhs.collegeInd))));
    }

}
