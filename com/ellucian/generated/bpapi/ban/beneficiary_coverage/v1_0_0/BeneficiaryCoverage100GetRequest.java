
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
    "beginDate",
    "queryDate",
    "activityDate",
    "bdcaCode",
    "endDate",
    "beneSeqNo",
    "otherCovInd",
    "id",
    "dreaCode",
    "requestedDate",
    "userId",
    "preExistingInd"
})
@Generated("jsonschema2pojo")
public class BeneficiaryCoverage100GetRequest {

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
    private Object queryDate;
    /**
     * Lineage reference object : PDRBCOV_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Benefit
     * <p>
     * Lineage reference object : bdcaCode
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : bdcaCode")
    private Object bdcaCode;
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
    @JsonProperty("beneSeqNo")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_BENE_SEQ_NO")
    private Double beneSeqNo;
    /**
     * Lineage reference object : PDRBCOV_OTHER_COV_IND
     * 
     */
    @JsonProperty("otherCovInd")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_OTHER_COV_IND")
    private String otherCovInd;
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
     * Termination Reason
     * <p>
     * Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA
     * 
     */
    @JsonProperty("dreaCode")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_DREA_CODE, Lookup lineage reference object : PTVDREA")
    private String dreaCode;
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
     * Lineage reference object : PDRBCOV_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_USER_ID")
    private String userId;
    /**
     * Lineage reference object : PDRBCOV_PRE_EXISTING_IND
     * 
     */
    @JsonProperty("preExistingInd")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_PRE_EXISTING_IND")
    private String preExistingInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public BeneficiaryCoverage100GetRequest withBeginDate(Date beginDate) {
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
    public Object getQueryDate() {
        return queryDate;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(Object queryDate) {
        this.queryDate = queryDate;
    }

    public BeneficiaryCoverage100GetRequest withQueryDate(Object queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Lineage reference object : PDRBCOV_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PDRBCOV_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BeneficiaryCoverage100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Benefit
     * <p>
     * Lineage reference object : bdcaCode
     * 
     */
    @JsonProperty("bdcaCode")
    public Object getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit
     * <p>
     * Lineage reference object : bdcaCode
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(Object bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public BeneficiaryCoverage100GetRequest withBdcaCode(Object bdcaCode) {
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

    public BeneficiaryCoverage100GetRequest withEndDate(Date endDate) {
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

    public BeneficiaryCoverage100GetRequest withBeneSeqNo(Double beneSeqNo) {
        this.beneSeqNo = beneSeqNo;
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

    public BeneficiaryCoverage100GetRequest withOtherCovInd(String otherCovInd) {
        this.otherCovInd = otherCovInd;
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

    public BeneficiaryCoverage100GetRequest withId(Object id) {
        this.id = id;
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

    public BeneficiaryCoverage100GetRequest withDreaCode(String dreaCode) {
        this.dreaCode = dreaCode;
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

    public BeneficiaryCoverage100GetRequest withRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
        return this;
    }

    /**
     * Lineage reference object : PDRBCOV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PDRBCOV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BeneficiaryCoverage100GetRequest withUserId(String userId) {
        this.userId = userId;
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

    public BeneficiaryCoverage100GetRequest withPreExistingInd(String preExistingInd) {
        this.preExistingInd = preExistingInd;
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

    public BeneficiaryCoverage100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BeneficiaryCoverage100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("beneSeqNo");
        sb.append('=');
        sb.append(((this.beneSeqNo == null)?"<null>":this.beneSeqNo));
        sb.append(',');
        sb.append("otherCovInd");
        sb.append('=');
        sb.append(((this.otherCovInd == null)?"<null>":this.otherCovInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("dreaCode");
        sb.append('=');
        sb.append(((this.dreaCode == null)?"<null>":this.dreaCode));
        sb.append(',');
        sb.append("requestedDate");
        sb.append('=');
        sb.append(((this.requestedDate == null)?"<null>":this.requestedDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("preExistingInd");
        sb.append('=');
        sb.append(((this.preExistingInd == null)?"<null>":this.preExistingInd));
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
        if ((other instanceof BeneficiaryCoverage100GetRequest) == false) {
            return false;
        }
        BeneficiaryCoverage100GetRequest rhs = ((BeneficiaryCoverage100GetRequest) other);
        return ((((((((((((((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.otherCovInd == rhs.otherCovInd)||((this.otherCovInd!= null)&&this.otherCovInd.equals(rhs.otherCovInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.preExistingInd == rhs.preExistingInd)||((this.preExistingInd!= null)&&this.preExistingInd.equals(rhs.preExistingInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.beneSeqNo == rhs.beneSeqNo)||((this.beneSeqNo!= null)&&this.beneSeqNo.equals(rhs.beneSeqNo))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.dreaCode == rhs.dreaCode)||((this.dreaCode!= null)&&this.dreaCode.equals(rhs.dreaCode))))&&((this.requestedDate == rhs.requestedDate)||((this.requestedDate!= null)&&this.requestedDate.equals(rhs.requestedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
