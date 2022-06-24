
package com.ellucian.generated.bpapi.ban.beneficiary_coverage.v1_0_0;

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
    "criteria.userId",
    "criteria.activityDate",
    "bdcaCode",
    "endDate",
    "criteria.beneSeqNo",
    "criteria.otherCovInd",
    "otherCovInd",
    "criteria.endDate",
    "criteria.dreaCode",
    "criteria.beginDate",
    "beginDate",
    "queryDate",
    "beneSeqNo",
    "criteria.requestedDate",
    "criteria.preExistingInd",
    "id",
    "requestedDate"
})
@Generated("jsonschema2pojo")
public class BeneficiaryCoverage100PutRequest {

    /**
     * Lineage reference object : PDRBCOV_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_USER_ID")
    private String criteriaUserId;
    /**
     * Lineage reference object : PDRBCOV_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Benefit
     * <p>
     * Lineage reference object : bdcaCode
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : bdcaCode")
    private String bdcaCode;
    /**
     * Coverage End Date
     * <p>
     * Lineage reference object : PDRBCOV_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_END_DATE")
    private Date endDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBCOV_BENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.beneSeqNo")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_BENE_SEQ_NO")
    private Double criteriaBeneSeqNo;
    /**
     * Lineage reference object : PDRBCOV_OTHER_COV_IND
     * 
     */
    @JsonProperty("criteria.otherCovInd")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_OTHER_COV_IND")
    private String criteriaOtherCovInd;
    /**
     * Lineage reference object : PDRBCOV_OTHER_COV_IND
     * 
     */
    @JsonProperty("otherCovInd")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_OTHER_COV_IND")
    private String otherCovInd;
    /**
     * Coverage End Date
     * <p>
     * Lineage reference object : PDRBCOV_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_END_DATE")
    private Date criteriaEndDate;
    /**
     * Termination Reason
     * <p>
     * Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA
     * 
     */
    @JsonProperty("criteria.dreaCode")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA")
    private String criteriaDreaCode;
    /**
     * Coverage Begin Date
     * <p>
     * Lineage reference object : PDRBCOV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_BEGIN_DATE")
    private Date criteriaBeginDate;
    /**
     * Coverage Begin Date
     * <p>
     * Lineage reference object : PDRBCOV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_BEGIN_DATE")
    private Date beginDate;
    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Lineage reference object : queryDate")
    private Date queryDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBCOV_BENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("beneSeqNo")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_BENE_SEQ_NO")
    private Double beneSeqNo;
    /**
     * Requested Date
     * <p>
     * Lineage reference object : PDRBCOV_REQUESTED_DATE
     * 
     */
    @JsonProperty("criteria.requestedDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_REQUESTED_DATE")
    private Date criteriaRequestedDate;
    /**
     * Lineage reference object : PDRBCOV_PRE_EXISTING_IND
     * 
     */
    @JsonProperty("criteria.preExistingInd")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_PRE_EXISTING_IND")
    private String criteriaPreExistingInd;
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
     * Requested Date
     * <p>
     * Lineage reference object : PDRBCOV_REQUESTED_DATE
     * 
     */
    @JsonProperty("requestedDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_REQUESTED_DATE")
    private Date requestedDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PDRBCOV_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : PDRBCOV_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public BeneficiaryCoverage100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Lineage reference object : PDRBCOV_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : PDRBCOV_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public BeneficiaryCoverage100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Benefit
     * <p>
     * Lineage reference object : bdcaCode
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit
     * <p>
     * Lineage reference object : bdcaCode
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public BeneficiaryCoverage100PutRequest withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Coverage End Date
     * <p>
     * Lineage reference object : PDRBCOV_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Coverage End Date
     * <p>
     * Lineage reference object : PDRBCOV_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BeneficiaryCoverage100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBCOV_BENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.beneSeqNo")
    public Double getCriteriaBeneSeqNo() {
        return criteriaBeneSeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBCOV_BENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.beneSeqNo")
    public void setCriteriaBeneSeqNo(Double criteriaBeneSeqNo) {
        this.criteriaBeneSeqNo = criteriaBeneSeqNo;
    }

    public BeneficiaryCoverage100PutRequest withCriteriaBeneSeqNo(Double criteriaBeneSeqNo) {
        this.criteriaBeneSeqNo = criteriaBeneSeqNo;
        return this;
    }

    /**
     * Lineage reference object : PDRBCOV_OTHER_COV_IND
     * 
     */
    @JsonProperty("criteria.otherCovInd")
    public String getCriteriaOtherCovInd() {
        return criteriaOtherCovInd;
    }

    /**
     * Lineage reference object : PDRBCOV_OTHER_COV_IND
     * 
     */
    @JsonProperty("criteria.otherCovInd")
    public void setCriteriaOtherCovInd(String criteriaOtherCovInd) {
        this.criteriaOtherCovInd = criteriaOtherCovInd;
    }

    public BeneficiaryCoverage100PutRequest withCriteriaOtherCovInd(String criteriaOtherCovInd) {
        this.criteriaOtherCovInd = criteriaOtherCovInd;
        return this;
    }

    /**
     * Lineage reference object : PDRBCOV_OTHER_COV_IND
     * 
     */
    @JsonProperty("otherCovInd")
    public String getOtherCovInd() {
        return otherCovInd;
    }

    /**
     * Lineage reference object : PDRBCOV_OTHER_COV_IND
     * 
     */
    @JsonProperty("otherCovInd")
    public void setOtherCovInd(String otherCovInd) {
        this.otherCovInd = otherCovInd;
    }

    public BeneficiaryCoverage100PutRequest withOtherCovInd(String otherCovInd) {
        this.otherCovInd = otherCovInd;
        return this;
    }

    /**
     * Coverage End Date
     * <p>
     * Lineage reference object : PDRBCOV_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * Coverage End Date
     * <p>
     * Lineage reference object : PDRBCOV_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public BeneficiaryCoverage100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Termination Reason
     * <p>
     * Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA
     * 
     */
    @JsonProperty("criteria.dreaCode")
    public String getCriteriaDreaCode() {
        return criteriaDreaCode;
    }

    /**
     * Termination Reason
     * <p>
     * Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA
     * 
     */
    @JsonProperty("criteria.dreaCode")
    public void setCriteriaDreaCode(String criteriaDreaCode) {
        this.criteriaDreaCode = criteriaDreaCode;
    }

    public BeneficiaryCoverage100PutRequest withCriteriaDreaCode(String criteriaDreaCode) {
        this.criteriaDreaCode = criteriaDreaCode;
        return this;
    }

    /**
     * Coverage Begin Date
     * <p>
     * Lineage reference object : PDRBCOV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public Date getCriteriaBeginDate() {
        return criteriaBeginDate;
    }

    /**
     * Coverage Begin Date
     * <p>
     * Lineage reference object : PDRBCOV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public void setCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
    }

    public BeneficiaryCoverage100PutRequest withCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
        return this;
    }

    /**
     * Coverage Begin Date
     * <p>
     * Lineage reference object : PDRBCOV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Coverage Begin Date
     * <p>
     * Lineage reference object : PDRBCOV_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public BeneficiaryCoverage100PutRequest withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * 
     */
    @JsonProperty("queryDate")
    public Date getQueryDate() {
        return queryDate;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(Date queryDate) {
        this.queryDate = queryDate;
    }

    public BeneficiaryCoverage100PutRequest withQueryDate(Date queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBCOV_BENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("beneSeqNo")
    public Double getBeneSeqNo() {
        return beneSeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBCOV_BENE_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("beneSeqNo")
    public void setBeneSeqNo(Double beneSeqNo) {
        this.beneSeqNo = beneSeqNo;
    }

    public BeneficiaryCoverage100PutRequest withBeneSeqNo(Double beneSeqNo) {
        this.beneSeqNo = beneSeqNo;
        return this;
    }

    /**
     * Requested Date
     * <p>
     * Lineage reference object : PDRBCOV_REQUESTED_DATE
     * 
     */
    @JsonProperty("criteria.requestedDate")
    public Date getCriteriaRequestedDate() {
        return criteriaRequestedDate;
    }

    /**
     * Requested Date
     * <p>
     * Lineage reference object : PDRBCOV_REQUESTED_DATE
     * 
     */
    @JsonProperty("criteria.requestedDate")
    public void setCriteriaRequestedDate(Date criteriaRequestedDate) {
        this.criteriaRequestedDate = criteriaRequestedDate;
    }

    public BeneficiaryCoverage100PutRequest withCriteriaRequestedDate(Date criteriaRequestedDate) {
        this.criteriaRequestedDate = criteriaRequestedDate;
        return this;
    }

    /**
     * Lineage reference object : PDRBCOV_PRE_EXISTING_IND
     * 
     */
    @JsonProperty("criteria.preExistingInd")
    public String getCriteriaPreExistingInd() {
        return criteriaPreExistingInd;
    }

    /**
     * Lineage reference object : PDRBCOV_PRE_EXISTING_IND
     * 
     */
    @JsonProperty("criteria.preExistingInd")
    public void setCriteriaPreExistingInd(String criteriaPreExistingInd) {
        this.criteriaPreExistingInd = criteriaPreExistingInd;
    }

    public BeneficiaryCoverage100PutRequest withCriteriaPreExistingInd(String criteriaPreExistingInd) {
        this.criteriaPreExistingInd = criteriaPreExistingInd;
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

    public BeneficiaryCoverage100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Requested Date
     * <p>
     * Lineage reference object : PDRBCOV_REQUESTED_DATE
     * 
     */
    @JsonProperty("requestedDate")
    public Date getRequestedDate() {
        return requestedDate;
    }

    /**
     * Requested Date
     * <p>
     * Lineage reference object : PDRBCOV_REQUESTED_DATE
     * 
     */
    @JsonProperty("requestedDate")
    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }

    public BeneficiaryCoverage100PutRequest withRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
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

    public BeneficiaryCoverage100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BeneficiaryCoverage100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("criteriaBeneSeqNo");
        sb.append('=');
        sb.append(((this.criteriaBeneSeqNo == null)?"<null>":this.criteriaBeneSeqNo));
        sb.append(',');
        sb.append("criteriaOtherCovInd");
        sb.append('=');
        sb.append(((this.criteriaOtherCovInd == null)?"<null>":this.criteriaOtherCovInd));
        sb.append(',');
        sb.append("otherCovInd");
        sb.append('=');
        sb.append(((this.otherCovInd == null)?"<null>":this.otherCovInd));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaDreaCode");
        sb.append('=');
        sb.append(((this.criteriaDreaCode == null)?"<null>":this.criteriaDreaCode));
        sb.append(',');
        sb.append("criteriaBeginDate");
        sb.append('=');
        sb.append(((this.criteriaBeginDate == null)?"<null>":this.criteriaBeginDate));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("beneSeqNo");
        sb.append('=');
        sb.append(((this.beneSeqNo == null)?"<null>":this.beneSeqNo));
        sb.append(',');
        sb.append("criteriaRequestedDate");
        sb.append('=');
        sb.append(((this.criteriaRequestedDate == null)?"<null>":this.criteriaRequestedDate));
        sb.append(',');
        sb.append("criteriaPreExistingInd");
        sb.append('=');
        sb.append(((this.criteriaPreExistingInd == null)?"<null>":this.criteriaPreExistingInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requestedDate");
        sb.append('=');
        sb.append(((this.requestedDate == null)?"<null>":this.requestedDate));
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
        result = ((result* 31)+((this.criteriaDreaCode == null)? 0 :this.criteriaDreaCode.hashCode()));
        result = ((result* 31)+((this.criteriaRequestedDate == null)? 0 :this.criteriaRequestedDate.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.otherCovInd == null)? 0 :this.otherCovInd.hashCode()));
        result = ((result* 31)+((this.criteriaPreExistingInd == null)? 0 :this.criteriaPreExistingInd.hashCode()));
        result = ((result* 31)+((this.criteriaOtherCovInd == null)? 0 :this.criteriaOtherCovInd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.criteriaBeneSeqNo == null)? 0 :this.criteriaBeneSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaBeginDate == null)? 0 :this.criteriaBeginDate.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.beneSeqNo == null)? 0 :this.beneSeqNo.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.requestedDate == null)? 0 :this.requestedDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BeneficiaryCoverage100PutRequest) == false) {
            return false;
        }
        BeneficiaryCoverage100PutRequest rhs = ((BeneficiaryCoverage100PutRequest) other);
        return (((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaDreaCode == rhs.criteriaDreaCode)||((this.criteriaDreaCode!= null)&&this.criteriaDreaCode.equals(rhs.criteriaDreaCode))))&&((this.criteriaRequestedDate == rhs.criteriaRequestedDate)||((this.criteriaRequestedDate!= null)&&this.criteriaRequestedDate.equals(rhs.criteriaRequestedDate))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.otherCovInd == rhs.otherCovInd)||((this.otherCovInd!= null)&&this.otherCovInd.equals(rhs.otherCovInd))))&&((this.criteriaPreExistingInd == rhs.criteriaPreExistingInd)||((this.criteriaPreExistingInd!= null)&&this.criteriaPreExistingInd.equals(rhs.criteriaPreExistingInd))))&&((this.criteriaOtherCovInd == rhs.criteriaOtherCovInd)||((this.criteriaOtherCovInd!= null)&&this.criteriaOtherCovInd.equals(rhs.criteriaOtherCovInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.criteriaBeneSeqNo == rhs.criteriaBeneSeqNo)||((this.criteriaBeneSeqNo!= null)&&this.criteriaBeneSeqNo.equals(rhs.criteriaBeneSeqNo))))&&((this.criteriaBeginDate == rhs.criteriaBeginDate)||((this.criteriaBeginDate!= null)&&this.criteriaBeginDate.equals(rhs.criteriaBeginDate))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.beneSeqNo == rhs.beneSeqNo)||((this.beneSeqNo!= null)&&this.beneSeqNo.equals(rhs.beneSeqNo))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.requestedDate == rhs.requestedDate)||((this.requestedDate!= null)&&this.requestedDate.equals(rhs.requestedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
