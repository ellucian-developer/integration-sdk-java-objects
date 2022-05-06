
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
    "bdcaCode",
    "endDate",
    "beneSeqNo",
    "otherCovInd",
    "id",
    "requestedDate"
})
@Generated("jsonschema2pojo")
public class BeneficiaryCoverage100PostRequest {

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

    public BeneficiaryCoverage100PostRequest withBeginDate(Date beginDate) {
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

    public BeneficiaryCoverage100PostRequest withQueryDate(Object queryDate) {
        this.queryDate = queryDate;
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

    public BeneficiaryCoverage100PostRequest withBdcaCode(Object bdcaCode) {
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

    public BeneficiaryCoverage100PostRequest withEndDate(Date endDate) {
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

    public BeneficiaryCoverage100PostRequest withBeneSeqNo(Double beneSeqNo) {
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

    public BeneficiaryCoverage100PostRequest withOtherCovInd(String otherCovInd) {
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

    public BeneficiaryCoverage100PostRequest withId(Object id) {
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

    public BeneficiaryCoverage100PostRequest withRequestedDate(Date requestedDate) {
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

    public BeneficiaryCoverage100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BeneficiaryCoverage100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
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
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.beneSeqNo == null)? 0 :this.beneSeqNo.hashCode()));
        result = ((result* 31)+((this.otherCovInd == null)? 0 :this.otherCovInd.hashCode()));
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
        if ((other instanceof BeneficiaryCoverage100PostRequest) == false) {
            return false;
        }
        BeneficiaryCoverage100PostRequest rhs = ((BeneficiaryCoverage100PostRequest) other);
        return ((((((((((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate)))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.beneSeqNo == rhs.beneSeqNo)||((this.beneSeqNo!= null)&&this.beneSeqNo.equals(rhs.beneSeqNo))))&&((this.otherCovInd == rhs.otherCovInd)||((this.otherCovInd!= null)&&this.otherCovInd.equals(rhs.otherCovInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.requestedDate == rhs.requestedDate)||((this.requestedDate!= null)&&this.requestedDate.equals(rhs.requestedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
