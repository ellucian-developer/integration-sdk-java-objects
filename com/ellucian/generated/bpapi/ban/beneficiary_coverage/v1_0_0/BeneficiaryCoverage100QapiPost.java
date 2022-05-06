
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
    "id",
    "bdcaCode",
    "queryDate",
    "beneSeqNo",
    "beginDate",
    "endDate",
    "dreaCode",
    "preExistingInd",
    "requestedDate",
    "otherCovInd",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class BeneficiaryCoverage100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    private String bdcaCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    private String queryDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBCOV_BENE_SEQ_NO
     * 
     */
    @JsonProperty("beneSeqNo")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_BENE_SEQ_NO")
    private Double beneSeqNo;
    /**
     * Coverage Begin Date
     * <p>
     * Lineage reference object : PDRBCOV_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_BEGIN_DATE")
    private Date beginDate;
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
     * Termination Reason
     * <p>
     * Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA
     * 
     */
    @JsonProperty("dreaCode")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA")
    private String dreaCode;
    /**
     * Lineage reference object : PDRBCOV_PRE_EXISTING_IND
     * 
     */
    @JsonProperty("preExistingInd")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_PRE_EXISTING_IND")
    private String preExistingInd;
    /**
     * Requested Date
     * <p>
     * Lineage reference object : PDRBCOV_REQUESTED_DATE
     * 
     */
    @JsonProperty("requestedDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_REQUESTED_DATE")
    private Date requestedDate;
    /**
     * Lineage reference object : PDRBCOV_OTHER_COV_IND
     * 
     */
    @JsonProperty("otherCovInd")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_OTHER_COV_IND")
    private String otherCovInd;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public BeneficiaryCoverage100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public BeneficiaryCoverage100QapiPost withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public String getQueryDate() {
        return queryDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public BeneficiaryCoverage100QapiPost withQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PDRBCOV_BENE_SEQ_NO
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
     * 
     */
    @JsonProperty("beneSeqNo")
    public void setBeneSeqNo(Double beneSeqNo) {
        this.beneSeqNo = beneSeqNo;
    }

    public BeneficiaryCoverage100QapiPost withBeneSeqNo(Double beneSeqNo) {
        this.beneSeqNo = beneSeqNo;
        return this;
    }

    /**
     * Coverage Begin Date
     * <p>
     * Lineage reference object : PDRBCOV_BEGIN_DATE
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
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public BeneficiaryCoverage100QapiPost withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
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

    public BeneficiaryCoverage100QapiPost withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Termination Reason
     * <p>
     * Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA
     * 
     */
    @JsonProperty("dreaCode")
    public String getDreaCode() {
        return dreaCode;
    }

    /**
     * Termination Reason
     * <p>
     * Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA
     * 
     */
    @JsonProperty("dreaCode")
    public void setDreaCode(String dreaCode) {
        this.dreaCode = dreaCode;
    }

    public BeneficiaryCoverage100QapiPost withDreaCode(String dreaCode) {
        this.dreaCode = dreaCode;
        return this;
    }

    /**
     * Lineage reference object : PDRBCOV_PRE_EXISTING_IND
     * 
     */
    @JsonProperty("preExistingInd")
    public String getPreExistingInd() {
        return preExistingInd;
    }

    /**
     * Lineage reference object : PDRBCOV_PRE_EXISTING_IND
     * 
     */
    @JsonProperty("preExistingInd")
    public void setPreExistingInd(String preExistingInd) {
        this.preExistingInd = preExistingInd;
    }

    public BeneficiaryCoverage100QapiPost withPreExistingInd(String preExistingInd) {
        this.preExistingInd = preExistingInd;
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

    public BeneficiaryCoverage100QapiPost withRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
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

    public BeneficiaryCoverage100QapiPost withOtherCovInd(String otherCovInd) {
        this.otherCovInd = otherCovInd;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BeneficiaryCoverage100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public BeneficiaryCoverage100QapiPost withActivityDate(String activityDate) {
        this.activityDate = activityDate;
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

    public BeneficiaryCoverage100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BeneficiaryCoverage100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("beneSeqNo");
        sb.append('=');
        sb.append(((this.beneSeqNo == null)?"<null>":this.beneSeqNo));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("dreaCode");
        sb.append('=');
        sb.append(((this.dreaCode == null)?"<null>":this.dreaCode));
        sb.append(',');
        sb.append("preExistingInd");
        sb.append('=');
        sb.append(((this.preExistingInd == null)?"<null>":this.preExistingInd));
        sb.append(',');
        sb.append("requestedDate");
        sb.append('=');
        sb.append(((this.requestedDate == null)?"<null>":this.requestedDate));
        sb.append(',');
        sb.append("otherCovInd");
        sb.append('=');
        sb.append(((this.otherCovInd == null)?"<null>":this.otherCovInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.otherCovInd == null)? 0 :this.otherCovInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.preExistingInd == null)? 0 :this.preExistingInd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.beneSeqNo == null)? 0 :this.beneSeqNo.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.dreaCode == null)? 0 :this.dreaCode.hashCode()));
        result = ((result* 31)+((this.requestedDate == null)? 0 :this.requestedDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BeneficiaryCoverage100QapiPost) == false) {
            return false;
        }
        BeneficiaryCoverage100QapiPost rhs = ((BeneficiaryCoverage100QapiPost) other);
        return ((((((((((((((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.otherCovInd == rhs.otherCovInd)||((this.otherCovInd!= null)&&this.otherCovInd.equals(rhs.otherCovInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.preExistingInd == rhs.preExistingInd)||((this.preExistingInd!= null)&&this.preExistingInd.equals(rhs.preExistingInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.beneSeqNo == rhs.beneSeqNo)||((this.beneSeqNo!= null)&&this.beneSeqNo.equals(rhs.beneSeqNo))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.dreaCode == rhs.dreaCode)||((this.dreaCode!= null)&&this.dreaCode.equals(rhs.dreaCode))))&&((this.requestedDate == rhs.requestedDate)||((this.requestedDate!= null)&&this.requestedDate.equals(rhs.requestedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
