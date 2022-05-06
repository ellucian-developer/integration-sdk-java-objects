
package com.ellucian.generated.bpapi.ban.position_requisition.v1_0_0;

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
    "reqsCode",
    "hireDate",
    "relocInd",
    "applDate",
    "apprId",
    "reqNo",
    "coasCode",
    "orgnCode",
    "posn",
    "apprDate",
    "vacyDate",
    "closeDate",
    "postDate",
    "recrId",
    "openDate"
})
@Generated("jsonschema2pojo")
public class PositionRequisition100PutRequest {

    /**
     * Status
     * <p>
     * Lineage reference object : PABREQU_REQS_CODE
     * (Required)
     * 
     */
    @JsonProperty("reqsCode")
    @JsonPropertyDescription("Lineage reference object : PABREQU_REQS_CODE")
    private String reqsCode;
    /**
     * Expected Hire Date
     * <p>
     * Lineage reference object : PABREQU_HIRE_DATE
     * 
     */
    @JsonProperty("hireDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_HIRE_DATE")
    private Date hireDate;
    /**
     * Paid Relocation
     * <p>
     * Lineage reference object : PABREQU_RELOC_IND
     * 
     */
    @JsonProperty("relocInd")
    @JsonPropertyDescription("Lineage reference object : PABREQU_RELOC_IND")
    private String relocInd;
    /**
     * Status Date
     * <p>
     * Lineage reference object : PABREQU_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_APPL_DATE")
    private Date applDate;
    /**
     * Approver
     * <p>
     * 
     * 
     */
    @JsonProperty("apprId")
    private String apprId;
    /**
     * Requisition Number
     * <p>
     * Lineage reference object : reqNo
     * 
     */
    @JsonProperty("reqNo")
    @JsonPropertyDescription("Lineage reference object : reqNo")
    private Object reqNo;
    /**
     * COA
     * <p>
     * Lineage reference object : PABREQU_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : PABREQU_COAS_CODE")
    private String coasCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : PABREQU_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : PABREQU_ORGN_CODE")
    private String orgnCode;
    /**
     * Position
     * <p>
     * Lineage reference object : PABREQU_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PABREQU_POSN")
    private String posn;
    /**
     * Date
     * <p>
     * Lineage reference object : PABREQU_APPR_DATE
     * 
     */
    @JsonProperty("apprDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_APPR_DATE")
    private Date apprDate;
    /**
     * Vacancy Date
     * <p>
     * Lineage reference object : PABREQU_VACY_DATE
     * 
     */
    @JsonProperty("vacyDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_VACY_DATE")
    private Date vacyDate;
    /**
     * Close Application Date
     * <p>
     * Lineage reference object : PABREQU_CLOSE_DATE
     * 
     */
    @JsonProperty("closeDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_CLOSE_DATE")
    private Date closeDate;
    /**
     * Posting Date
     * <p>
     * Lineage reference object : PABREQU_POST_DATE
     * 
     */
    @JsonProperty("postDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_POST_DATE")
    private Date postDate;
    /**
     * Recruiter
     * <p>
     * 
     * 
     */
    @JsonProperty("recrId")
    private String recrId;
    /**
     * Open Application Date
     * <p>
     * Lineage reference object : PABREQU_OPEN_DATE
     * 
     */
    @JsonProperty("openDate")
    @JsonPropertyDescription("Lineage reference object : PABREQU_OPEN_DATE")
    private Date openDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : PABREQU_REQS_CODE
     * (Required)
     * 
     */
    @JsonProperty("reqsCode")
    public String getReqsCode() {
        return reqsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : PABREQU_REQS_CODE
     * (Required)
     * 
     */
    @JsonProperty("reqsCode")
    public void setReqsCode(String reqsCode) {
        this.reqsCode = reqsCode;
    }

    public PositionRequisition100PutRequest withReqsCode(String reqsCode) {
        this.reqsCode = reqsCode;
        return this;
    }

    /**
     * Expected Hire Date
     * <p>
     * Lineage reference object : PABREQU_HIRE_DATE
     * 
     */
    @JsonProperty("hireDate")
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * Expected Hire Date
     * <p>
     * Lineage reference object : PABREQU_HIRE_DATE
     * 
     */
    @JsonProperty("hireDate")
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public PositionRequisition100PutRequest withHireDate(Date hireDate) {
        this.hireDate = hireDate;
        return this;
    }

    /**
     * Paid Relocation
     * <p>
     * Lineage reference object : PABREQU_RELOC_IND
     * 
     */
    @JsonProperty("relocInd")
    public String getRelocInd() {
        return relocInd;
    }

    /**
     * Paid Relocation
     * <p>
     * Lineage reference object : PABREQU_RELOC_IND
     * 
     */
    @JsonProperty("relocInd")
    public void setRelocInd(String relocInd) {
        this.relocInd = relocInd;
    }

    public PositionRequisition100PutRequest withRelocInd(String relocInd) {
        this.relocInd = relocInd;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : PABREQU_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    public Date getApplDate() {
        return applDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : PABREQU_APPL_DATE
     * (Required)
     * 
     */
    @JsonProperty("applDate")
    public void setApplDate(Date applDate) {
        this.applDate = applDate;
    }

    public PositionRequisition100PutRequest withApplDate(Date applDate) {
        this.applDate = applDate;
        return this;
    }

    /**
     * Approver
     * <p>
     * 
     * 
     */
    @JsonProperty("apprId")
    public String getApprId() {
        return apprId;
    }

    /**
     * Approver
     * <p>
     * 
     * 
     */
    @JsonProperty("apprId")
    public void setApprId(String apprId) {
        this.apprId = apprId;
    }

    public PositionRequisition100PutRequest withApprId(String apprId) {
        this.apprId = apprId;
        return this;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : reqNo
     * 
     */
    @JsonProperty("reqNo")
    public Object getReqNo() {
        return reqNo;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : reqNo
     * 
     */
    @JsonProperty("reqNo")
    public void setReqNo(Object reqNo) {
        this.reqNo = reqNo;
    }

    public PositionRequisition100PutRequest withReqNo(Object reqNo) {
        this.reqNo = reqNo;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : PABREQU_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : PABREQU_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public PositionRequisition100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : PABREQU_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : PABREQU_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public PositionRequisition100PutRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PABREQU_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PABREQU_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public PositionRequisition100PutRequest withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : PABREQU_APPR_DATE
     * 
     */
    @JsonProperty("apprDate")
    public Date getApprDate() {
        return apprDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : PABREQU_APPR_DATE
     * 
     */
    @JsonProperty("apprDate")
    public void setApprDate(Date apprDate) {
        this.apprDate = apprDate;
    }

    public PositionRequisition100PutRequest withApprDate(Date apprDate) {
        this.apprDate = apprDate;
        return this;
    }

    /**
     * Vacancy Date
     * <p>
     * Lineage reference object : PABREQU_VACY_DATE
     * 
     */
    @JsonProperty("vacyDate")
    public Date getVacyDate() {
        return vacyDate;
    }

    /**
     * Vacancy Date
     * <p>
     * Lineage reference object : PABREQU_VACY_DATE
     * 
     */
    @JsonProperty("vacyDate")
    public void setVacyDate(Date vacyDate) {
        this.vacyDate = vacyDate;
    }

    public PositionRequisition100PutRequest withVacyDate(Date vacyDate) {
        this.vacyDate = vacyDate;
        return this;
    }

    /**
     * Close Application Date
     * <p>
     * Lineage reference object : PABREQU_CLOSE_DATE
     * 
     */
    @JsonProperty("closeDate")
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * Close Application Date
     * <p>
     * Lineage reference object : PABREQU_CLOSE_DATE
     * 
     */
    @JsonProperty("closeDate")
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public PositionRequisition100PutRequest withCloseDate(Date closeDate) {
        this.closeDate = closeDate;
        return this;
    }

    /**
     * Posting Date
     * <p>
     * Lineage reference object : PABREQU_POST_DATE
     * 
     */
    @JsonProperty("postDate")
    public Date getPostDate() {
        return postDate;
    }

    /**
     * Posting Date
     * <p>
     * Lineage reference object : PABREQU_POST_DATE
     * 
     */
    @JsonProperty("postDate")
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public PositionRequisition100PutRequest withPostDate(Date postDate) {
        this.postDate = postDate;
        return this;
    }

    /**
     * Recruiter
     * <p>
     * 
     * 
     */
    @JsonProperty("recrId")
    public String getRecrId() {
        return recrId;
    }

    /**
     * Recruiter
     * <p>
     * 
     * 
     */
    @JsonProperty("recrId")
    public void setRecrId(String recrId) {
        this.recrId = recrId;
    }

    public PositionRequisition100PutRequest withRecrId(String recrId) {
        this.recrId = recrId;
        return this;
    }

    /**
     * Open Application Date
     * <p>
     * Lineage reference object : PABREQU_OPEN_DATE
     * 
     */
    @JsonProperty("openDate")
    public Date getOpenDate() {
        return openDate;
    }

    /**
     * Open Application Date
     * <p>
     * Lineage reference object : PABREQU_OPEN_DATE
     * 
     */
    @JsonProperty("openDate")
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public PositionRequisition100PutRequest withOpenDate(Date openDate) {
        this.openDate = openDate;
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

    public PositionRequisition100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionRequisition100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqsCode");
        sb.append('=');
        sb.append(((this.reqsCode == null)?"<null>":this.reqsCode));
        sb.append(',');
        sb.append("hireDate");
        sb.append('=');
        sb.append(((this.hireDate == null)?"<null>":this.hireDate));
        sb.append(',');
        sb.append("relocInd");
        sb.append('=');
        sb.append(((this.relocInd == null)?"<null>":this.relocInd));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("apprId");
        sb.append('=');
        sb.append(((this.apprId == null)?"<null>":this.apprId));
        sb.append(',');
        sb.append("reqNo");
        sb.append('=');
        sb.append(((this.reqNo == null)?"<null>":this.reqNo));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("apprDate");
        sb.append('=');
        sb.append(((this.apprDate == null)?"<null>":this.apprDate));
        sb.append(',');
        sb.append("vacyDate");
        sb.append('=');
        sb.append(((this.vacyDate == null)?"<null>":this.vacyDate));
        sb.append(',');
        sb.append("closeDate");
        sb.append('=');
        sb.append(((this.closeDate == null)?"<null>":this.closeDate));
        sb.append(',');
        sb.append("postDate");
        sb.append('=');
        sb.append(((this.postDate == null)?"<null>":this.postDate));
        sb.append(',');
        sb.append("recrId");
        sb.append('=');
        sb.append(((this.recrId == null)?"<null>":this.recrId));
        sb.append(',');
        sb.append("openDate");
        sb.append('=');
        sb.append(((this.openDate == null)?"<null>":this.openDate));
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
        result = ((result* 31)+((this.reqsCode == null)? 0 :this.reqsCode.hashCode()));
        result = ((result* 31)+((this.hireDate == null)? 0 :this.hireDate.hashCode()));
        result = ((result* 31)+((this.relocInd == null)? 0 :this.relocInd.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.apprId == null)? 0 :this.apprId.hashCode()));
        result = ((result* 31)+((this.reqNo == null)? 0 :this.reqNo.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.apprDate == null)? 0 :this.apprDate.hashCode()));
        result = ((result* 31)+((this.vacyDate == null)? 0 :this.vacyDate.hashCode()));
        result = ((result* 31)+((this.closeDate == null)? 0 :this.closeDate.hashCode()));
        result = ((result* 31)+((this.postDate == null)? 0 :this.postDate.hashCode()));
        result = ((result* 31)+((this.recrId == null)? 0 :this.recrId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.openDate == null)? 0 :this.openDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionRequisition100PutRequest) == false) {
            return false;
        }
        PositionRequisition100PutRequest rhs = ((PositionRequisition100PutRequest) other);
        return (((((((((((((((((this.reqsCode == rhs.reqsCode)||((this.reqsCode!= null)&&this.reqsCode.equals(rhs.reqsCode)))&&((this.hireDate == rhs.hireDate)||((this.hireDate!= null)&&this.hireDate.equals(rhs.hireDate))))&&((this.relocInd == rhs.relocInd)||((this.relocInd!= null)&&this.relocInd.equals(rhs.relocInd))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.apprId == rhs.apprId)||((this.apprId!= null)&&this.apprId.equals(rhs.apprId))))&&((this.reqNo == rhs.reqNo)||((this.reqNo!= null)&&this.reqNo.equals(rhs.reqNo))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.apprDate == rhs.apprDate)||((this.apprDate!= null)&&this.apprDate.equals(rhs.apprDate))))&&((this.vacyDate == rhs.vacyDate)||((this.vacyDate!= null)&&this.vacyDate.equals(rhs.vacyDate))))&&((this.closeDate == rhs.closeDate)||((this.closeDate!= null)&&this.closeDate.equals(rhs.closeDate))))&&((this.postDate == rhs.postDate)||((this.postDate!= null)&&this.postDate.equals(rhs.postDate))))&&((this.recrId == rhs.recrId)||((this.recrId!= null)&&this.recrId.equals(rhs.recrId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.openDate == rhs.openDate)||((this.openDate!= null)&&this.openDate.equals(rhs.openDate))));
    }

}
