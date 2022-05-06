
package com.ellucian.generated.bpapi.ban.benefit_or_deduction_chain_rule.v1_0_0;

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
    "activityDate",
    "seqNo",
    "dednCode",
    "dednCodeChain"
})
@Generated("jsonschema2pojo")
public class BenefitOrDeductionChainRule100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRDCHN_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRDCHN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PTRDCHN_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : PTRDCHN_SEQ_NO")
    private Double seqNo;
    /**
     * Benefit or Deduction Code
     * <p>
     * Lineage reference object : dednCode
     * (Required)
     * 
     */
    @JsonProperty("dednCode")
    @JsonPropertyDescription("Lineage reference object : dednCode")
    private Object dednCode;
    /**
     * Deduction Chain Code
     * <p>
     * Lineage reference object : PTRDCHN_DEDN_CODE_CHAIN, Lookup lineage reference object : ptrbdca,ptrdchn
     * (Required)
     * 
     */
    @JsonProperty("dednCodeChain")
    @JsonPropertyDescription("Lineage reference object : PTRDCHN_DEDN_CODE_CHAIN, Lookup lineage reference object : ptrbdca,ptrdchn")
    private String dednCodeChain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRDCHN_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRDCHN_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BenefitOrDeductionChainRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : PTRDCHN_SEQ_NO
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
     * Lineage reference object : PTRDCHN_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public BenefitOrDeductionChainRule100GetRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Benefit or Deduction Code
     * <p>
     * Lineage reference object : dednCode
     * (Required)
     * 
     */
    @JsonProperty("dednCode")
    public Object getDednCode() {
        return dednCode;
    }

    /**
     * Benefit or Deduction Code
     * <p>
     * Lineage reference object : dednCode
     * (Required)
     * 
     */
    @JsonProperty("dednCode")
    public void setDednCode(Object dednCode) {
        this.dednCode = dednCode;
    }

    public BenefitOrDeductionChainRule100GetRequest withDednCode(Object dednCode) {
        this.dednCode = dednCode;
        return this;
    }

    /**
     * Deduction Chain Code
     * <p>
     * Lineage reference object : PTRDCHN_DEDN_CODE_CHAIN, Lookup lineage reference object : ptrbdca,ptrdchn
     * (Required)
     * 
     */
    @JsonProperty("dednCodeChain")
    public String getDednCodeChain() {
        return dednCodeChain;
    }

    /**
     * Deduction Chain Code
     * <p>
     * Lineage reference object : PTRDCHN_DEDN_CODE_CHAIN, Lookup lineage reference object : ptrbdca,ptrdchn
     * (Required)
     * 
     */
    @JsonProperty("dednCodeChain")
    public void setDednCodeChain(String dednCodeChain) {
        this.dednCodeChain = dednCodeChain;
    }

    public BenefitOrDeductionChainRule100GetRequest withDednCodeChain(String dednCodeChain) {
        this.dednCodeChain = dednCodeChain;
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

    public BenefitOrDeductionChainRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitOrDeductionChainRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("dednCode");
        sb.append('=');
        sb.append(((this.dednCode == null)?"<null>":this.dednCode));
        sb.append(',');
        sb.append("dednCodeChain");
        sb.append('=');
        sb.append(((this.dednCodeChain == null)?"<null>":this.dednCodeChain));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.dednCode == null)? 0 :this.dednCode.hashCode()));
        result = ((result* 31)+((this.dednCodeChain == null)? 0 :this.dednCodeChain.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitOrDeductionChainRule100GetRequest) == false) {
            return false;
        }
        BenefitOrDeductionChainRule100GetRequest rhs = ((BenefitOrDeductionChainRule100GetRequest) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.dednCode == rhs.dednCode)||((this.dednCode!= null)&&this.dednCode.equals(rhs.dednCode))))&&((this.dednCodeChain == rhs.dednCodeChain)||((this.dednCodeChain!= null)&&this.dednCodeChain.equals(rhs.dednCodeChain))));
    }

}