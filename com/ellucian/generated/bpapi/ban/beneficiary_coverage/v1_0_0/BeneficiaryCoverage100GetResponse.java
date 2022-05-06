
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
    "beneName",
    "endDate",
    "dreaDesc",
    "beneSeqNo",
    "otherCovInd",
    "dreaCode",
    "requestedDate",
    "pdrbeneSexCode",
    "brelDesc",
    "preExistingInd",
    "pdrbeneBrelCode"
})
@Generated("jsonschema2pojo")
public class BeneficiaryCoverage100GetResponse {

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
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("beneName")
    private String beneName;
    /**
     * Coverage End Date
     * <p>
     * Lineage reference object : PDRBCOV_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_END_DATE")
    private Date endDate;
    @JsonProperty("dreaDesc")
    private String dreaDesc;
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
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("pdrbeneSexCode")
    private String pdrbeneSexCode;
    /**
     * Relationship to Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("brelDesc")
    private String brelDesc;
    /**
     * Lineage reference object : PDRBCOV_PRE_EXISTING_IND
     * 
     */
    @JsonProperty("preExistingInd")
    @JsonPropertyDescription("Lineage reference object : PDRBCOV_PRE_EXISTING_IND")
    private String preExistingInd;
    @JsonProperty("pdrbeneBrelCode")
    private String pdrbeneBrelCode;
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

    public BeneficiaryCoverage100GetResponse withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("beneName")
    public String getBeneName() {
        return beneName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("beneName")
    public void setBeneName(String beneName) {
        this.beneName = beneName;
    }

    public BeneficiaryCoverage100GetResponse withBeneName(String beneName) {
        this.beneName = beneName;
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

    public BeneficiaryCoverage100GetResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("dreaDesc")
    public String getDreaDesc() {
        return dreaDesc;
    }

    @JsonProperty("dreaDesc")
    public void setDreaDesc(String dreaDesc) {
        this.dreaDesc = dreaDesc;
    }

    public BeneficiaryCoverage100GetResponse withDreaDesc(String dreaDesc) {
        this.dreaDesc = dreaDesc;
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

    public BeneficiaryCoverage100GetResponse withBeneSeqNo(Double beneSeqNo) {
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

    public BeneficiaryCoverage100GetResponse withOtherCovInd(String otherCovInd) {
        this.otherCovInd = otherCovInd;
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

    public BeneficiaryCoverage100GetResponse withDreaCode(String dreaCode) {
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

    public BeneficiaryCoverage100GetResponse withRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
        return this;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("pdrbeneSexCode")
    public String getPdrbeneSexCode() {
        return pdrbeneSexCode;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("pdrbeneSexCode")
    public void setPdrbeneSexCode(String pdrbeneSexCode) {
        this.pdrbeneSexCode = pdrbeneSexCode;
    }

    public BeneficiaryCoverage100GetResponse withPdrbeneSexCode(String pdrbeneSexCode) {
        this.pdrbeneSexCode = pdrbeneSexCode;
        return this;
    }

    /**
     * Relationship to Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("brelDesc")
    public String getBrelDesc() {
        return brelDesc;
    }

    /**
     * Relationship to Employee
     * <p>
     * 
     * 
     */
    @JsonProperty("brelDesc")
    public void setBrelDesc(String brelDesc) {
        this.brelDesc = brelDesc;
    }

    public BeneficiaryCoverage100GetResponse withBrelDesc(String brelDesc) {
        this.brelDesc = brelDesc;
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

    public BeneficiaryCoverage100GetResponse withPreExistingInd(String preExistingInd) {
        this.preExistingInd = preExistingInd;
        return this;
    }

    @JsonProperty("pdrbeneBrelCode")
    public String getPdrbeneBrelCode() {
        return pdrbeneBrelCode;
    }

    @JsonProperty("pdrbeneBrelCode")
    public void setPdrbeneBrelCode(String pdrbeneBrelCode) {
        this.pdrbeneBrelCode = pdrbeneBrelCode;
    }

    public BeneficiaryCoverage100GetResponse withPdrbeneBrelCode(String pdrbeneBrelCode) {
        this.pdrbeneBrelCode = pdrbeneBrelCode;
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

    public BeneficiaryCoverage100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BeneficiaryCoverage100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("beneName");
        sb.append('=');
        sb.append(((this.beneName == null)?"<null>":this.beneName));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("dreaDesc");
        sb.append('=');
        sb.append(((this.dreaDesc == null)?"<null>":this.dreaDesc));
        sb.append(',');
        sb.append("beneSeqNo");
        sb.append('=');
        sb.append(((this.beneSeqNo == null)?"<null>":this.beneSeqNo));
        sb.append(',');
        sb.append("otherCovInd");
        sb.append('=');
        sb.append(((this.otherCovInd == null)?"<null>":this.otherCovInd));
        sb.append(',');
        sb.append("dreaCode");
        sb.append('=');
        sb.append(((this.dreaCode == null)?"<null>":this.dreaCode));
        sb.append(',');
        sb.append("requestedDate");
        sb.append('=');
        sb.append(((this.requestedDate == null)?"<null>":this.requestedDate));
        sb.append(',');
        sb.append("pdrbeneSexCode");
        sb.append('=');
        sb.append(((this.pdrbeneSexCode == null)?"<null>":this.pdrbeneSexCode));
        sb.append(',');
        sb.append("brelDesc");
        sb.append('=');
        sb.append(((this.brelDesc == null)?"<null>":this.brelDesc));
        sb.append(',');
        sb.append("preExistingInd");
        sb.append('=');
        sb.append(((this.preExistingInd == null)?"<null>":this.preExistingInd));
        sb.append(',');
        sb.append("pdrbeneBrelCode");
        sb.append('=');
        sb.append(((this.pdrbeneBrelCode == null)?"<null>":this.pdrbeneBrelCode));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.otherCovInd == null)? 0 :this.otherCovInd.hashCode()));
        result = ((result* 31)+((this.pdrbeneSexCode == null)? 0 :this.pdrbeneSexCode.hashCode()));
        result = ((result* 31)+((this.brelDesc == null)? 0 :this.brelDesc.hashCode()));
        result = ((result* 31)+((this.preExistingInd == null)? 0 :this.preExistingInd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.beneName == null)? 0 :this.beneName.hashCode()));
        result = ((result* 31)+((this.dreaDesc == null)? 0 :this.dreaDesc.hashCode()));
        result = ((result* 31)+((this.beneSeqNo == null)? 0 :this.beneSeqNo.hashCode()));
        result = ((result* 31)+((this.dreaCode == null)? 0 :this.dreaCode.hashCode()));
        result = ((result* 31)+((this.requestedDate == null)? 0 :this.requestedDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pdrbeneBrelCode == null)? 0 :this.pdrbeneBrelCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BeneficiaryCoverage100GetResponse) == false) {
            return false;
        }
        BeneficiaryCoverage100GetResponse rhs = ((BeneficiaryCoverage100GetResponse) other);
        return ((((((((((((((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate)))&&((this.otherCovInd == rhs.otherCovInd)||((this.otherCovInd!= null)&&this.otherCovInd.equals(rhs.otherCovInd))))&&((this.pdrbeneSexCode == rhs.pdrbeneSexCode)||((this.pdrbeneSexCode!= null)&&this.pdrbeneSexCode.equals(rhs.pdrbeneSexCode))))&&((this.brelDesc == rhs.brelDesc)||((this.brelDesc!= null)&&this.brelDesc.equals(rhs.brelDesc))))&&((this.preExistingInd == rhs.preExistingInd)||((this.preExistingInd!= null)&&this.preExistingInd.equals(rhs.preExistingInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.beneName == rhs.beneName)||((this.beneName!= null)&&this.beneName.equals(rhs.beneName))))&&((this.dreaDesc == rhs.dreaDesc)||((this.dreaDesc!= null)&&this.dreaDesc.equals(rhs.dreaDesc))))&&((this.beneSeqNo == rhs.beneSeqNo)||((this.beneSeqNo!= null)&&this.beneSeqNo.equals(rhs.beneSeqNo))))&&((this.dreaCode == rhs.dreaCode)||((this.dreaCode!= null)&&this.dreaCode.equals(rhs.dreaCode))))&&((this.requestedDate == rhs.requestedDate)||((this.requestedDate!= null)&&this.requestedDate.equals(rhs.requestedDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pdrbeneBrelCode == rhs.pdrbeneBrelCode)||((this.pdrbeneBrelCode!= null)&&this.pdrbeneBrelCode.equals(rhs.pdrbeneBrelCode))));
    }

}
