
package com.ellucian.generated.bpapi.ban.applicant_requirements_direct_loan_mpns.v1_0_0;

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
    "instructions",
    "fundTitle",
    "reqStatus",
    "satInd",
    "loanNo",
    "rlrdlorFundCode",
    "infoAccessInd",
    "trkLtrInd",
    "mpnType",
    "reqStatusDate"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirementsDirectLoanMpns100GetResponse {

    /**
     * Instructions
     * <p>
     * Lineage reference object : RLRDMPR_INSTRUCTIONS
     * 
     */
    @JsonProperty("instructions")
    @JsonPropertyDescription("Lineage reference object : RLRDMPR_INSTRUCTIONS")
    private String instructions;
    @JsonProperty("fundTitle")
    private String fundTitle;
    /**
     * Status
     * <p>
     * Lineage reference object : RLRDMPR_REQ_STATUS
     * 
     */
    @JsonProperty("reqStatus")
    @JsonPropertyDescription("Lineage reference object : RLRDMPR_REQ_STATUS")
    private String reqStatus;
    /**
     * Satisfied
     * <p>
     * Lineage reference object : RLRDMPR_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPR_SAT_IND")
    private String satInd;
    /**
     * Loan Number
     * <p>
     * Lineage reference object : RLRDMPR_LOAN_NO
     * (Required)
     * 
     */
    @JsonProperty("loanNo")
    @JsonPropertyDescription("Lineage reference object : RLRDMPR_LOAN_NO")
    private Double loanNo;
    /**
     * Fund Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorFundCode")
    private String rlrdlorFundCode;
    /**
     * Information Access
     * <p>
     * Lineage reference object : RLRDMPR_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPR_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * Letter
     * <p>
     * Lineage reference object : RLRDMPR_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPR_TRK_LTR_IND")
    private String trkLtrInd;
    /**
     * MPN Type
     * <p>
     * Lineage reference object : RLRDMPR_MPN_TYPE
     * 
     */
    @JsonProperty("mpnType")
    @JsonPropertyDescription("Lineage reference object : RLRDMPR_MPN_TYPE")
    private String mpnType;
    /**
     * Status Date
     * <p>
     * Lineage reference object : RLRDMPR_REQ_STATUS_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqStatusDate")
    @JsonPropertyDescription("Lineage reference object : RLRDMPR_REQ_STATUS_DATE")
    private Date reqStatusDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Instructions
     * <p>
     * Lineage reference object : RLRDMPR_INSTRUCTIONS
     * 
     */
    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    /**
     * Instructions
     * <p>
     * Lineage reference object : RLRDMPR_INSTRUCTIONS
     * 
     */
    @JsonProperty("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    @JsonProperty("fundTitle")
    public String getFundTitle() {
        return fundTitle;
    }

    @JsonProperty("fundTitle")
    public void setFundTitle(String fundTitle) {
        this.fundTitle = fundTitle;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withFundTitle(String fundTitle) {
        this.fundTitle = fundTitle;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RLRDMPR_REQ_STATUS
     * 
     */
    @JsonProperty("reqStatus")
    public String getReqStatus() {
        return reqStatus;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RLRDMPR_REQ_STATUS
     * 
     */
    @JsonProperty("reqStatus")
    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
        return this;
    }

    /**
     * Satisfied
     * <p>
     * Lineage reference object : RLRDMPR_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    public String getSatInd() {
        return satInd;
    }

    /**
     * Satisfied
     * <p>
     * Lineage reference object : RLRDMPR_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    public void setSatInd(String satInd) {
        this.satInd = satInd;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withSatInd(String satInd) {
        this.satInd = satInd;
        return this;
    }

    /**
     * Loan Number
     * <p>
     * Lineage reference object : RLRDMPR_LOAN_NO
     * (Required)
     * 
     */
    @JsonProperty("loanNo")
    public Double getLoanNo() {
        return loanNo;
    }

    /**
     * Loan Number
     * <p>
     * Lineage reference object : RLRDMPR_LOAN_NO
     * (Required)
     * 
     */
    @JsonProperty("loanNo")
    public void setLoanNo(Double loanNo) {
        this.loanNo = loanNo;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withLoanNo(Double loanNo) {
        this.loanNo = loanNo;
        return this;
    }

    /**
     * Fund Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorFundCode")
    public String getRlrdlorFundCode() {
        return rlrdlorFundCode;
    }

    /**
     * Fund Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rlrdlorFundCode")
    public void setRlrdlorFundCode(String rlrdlorFundCode) {
        this.rlrdlorFundCode = rlrdlorFundCode;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withRlrdlorFundCode(String rlrdlorFundCode) {
        this.rlrdlorFundCode = rlrdlorFundCode;
        return this;
    }

    /**
     * Information Access
     * <p>
     * Lineage reference object : RLRDMPR_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Information Access
     * <p>
     * Lineage reference object : RLRDMPR_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : RLRDMPR_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    public String getTrkLtrInd() {
        return trkLtrInd;
    }

    /**
     * Letter
     * <p>
     * Lineage reference object : RLRDMPR_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    public void setTrkLtrInd(String trkLtrInd) {
        this.trkLtrInd = trkLtrInd;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withTrkLtrInd(String trkLtrInd) {
        this.trkLtrInd = trkLtrInd;
        return this;
    }

    /**
     * MPN Type
     * <p>
     * Lineage reference object : RLRDMPR_MPN_TYPE
     * 
     */
    @JsonProperty("mpnType")
    public String getMpnType() {
        return mpnType;
    }

    /**
     * MPN Type
     * <p>
     * Lineage reference object : RLRDMPR_MPN_TYPE
     * 
     */
    @JsonProperty("mpnType")
    public void setMpnType(String mpnType) {
        this.mpnType = mpnType;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withMpnType(String mpnType) {
        this.mpnType = mpnType;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : RLRDMPR_REQ_STATUS_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqStatusDate")
    public Date getReqStatusDate() {
        return reqStatusDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : RLRDMPR_REQ_STATUS_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqStatusDate")
    public void setReqStatusDate(Date reqStatusDate) {
        this.reqStatusDate = reqStatusDate;
    }

    public ApplicantRequirementsDirectLoanMpns100GetResponse withReqStatusDate(Date reqStatusDate) {
        this.reqStatusDate = reqStatusDate;
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

    public ApplicantRequirementsDirectLoanMpns100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirementsDirectLoanMpns100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instructions");
        sb.append('=');
        sb.append(((this.instructions == null)?"<null>":this.instructions));
        sb.append(',');
        sb.append("fundTitle");
        sb.append('=');
        sb.append(((this.fundTitle == null)?"<null>":this.fundTitle));
        sb.append(',');
        sb.append("reqStatus");
        sb.append('=');
        sb.append(((this.reqStatus == null)?"<null>":this.reqStatus));
        sb.append(',');
        sb.append("satInd");
        sb.append('=');
        sb.append(((this.satInd == null)?"<null>":this.satInd));
        sb.append(',');
        sb.append("loanNo");
        sb.append('=');
        sb.append(((this.loanNo == null)?"<null>":this.loanNo));
        sb.append(',');
        sb.append("rlrdlorFundCode");
        sb.append('=');
        sb.append(((this.rlrdlorFundCode == null)?"<null>":this.rlrdlorFundCode));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("trkLtrInd");
        sb.append('=');
        sb.append(((this.trkLtrInd == null)?"<null>":this.trkLtrInd));
        sb.append(',');
        sb.append("mpnType");
        sb.append('=');
        sb.append(((this.mpnType == null)?"<null>":this.mpnType));
        sb.append(',');
        sb.append("reqStatusDate");
        sb.append('=');
        sb.append(((this.reqStatusDate == null)?"<null>":this.reqStatusDate));
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
        result = ((result* 31)+((this.instructions == null)? 0 :this.instructions.hashCode()));
        result = ((result* 31)+((this.fundTitle == null)? 0 :this.fundTitle.hashCode()));
        result = ((result* 31)+((this.reqStatus == null)? 0 :this.reqStatus.hashCode()));
        result = ((result* 31)+((this.satInd == null)? 0 :this.satInd.hashCode()));
        result = ((result* 31)+((this.loanNo == null)? 0 :this.loanNo.hashCode()));
        result = ((result* 31)+((this.rlrdlorFundCode == null)? 0 :this.rlrdlorFundCode.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.trkLtrInd == null)? 0 :this.trkLtrInd.hashCode()));
        result = ((result* 31)+((this.mpnType == null)? 0 :this.mpnType.hashCode()));
        result = ((result* 31)+((this.reqStatusDate == null)? 0 :this.reqStatusDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirementsDirectLoanMpns100GetResponse) == false) {
            return false;
        }
        ApplicantRequirementsDirectLoanMpns100GetResponse rhs = ((ApplicantRequirementsDirectLoanMpns100GetResponse) other);
        return ((((((((((((this.instructions == rhs.instructions)||((this.instructions!= null)&&this.instructions.equals(rhs.instructions)))&&((this.fundTitle == rhs.fundTitle)||((this.fundTitle!= null)&&this.fundTitle.equals(rhs.fundTitle))))&&((this.reqStatus == rhs.reqStatus)||((this.reqStatus!= null)&&this.reqStatus.equals(rhs.reqStatus))))&&((this.satInd == rhs.satInd)||((this.satInd!= null)&&this.satInd.equals(rhs.satInd))))&&((this.loanNo == rhs.loanNo)||((this.loanNo!= null)&&this.loanNo.equals(rhs.loanNo))))&&((this.rlrdlorFundCode == rhs.rlrdlorFundCode)||((this.rlrdlorFundCode!= null)&&this.rlrdlorFundCode.equals(rhs.rlrdlorFundCode))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.trkLtrInd == rhs.trkLtrInd)||((this.trkLtrInd!= null)&&this.trkLtrInd.equals(rhs.trkLtrInd))))&&((this.mpnType == rhs.mpnType)||((this.mpnType!= null)&&this.mpnType.equals(rhs.mpnType))))&&((this.reqStatusDate == rhs.reqStatusDate)||((this.reqStatusDate!= null)&&this.reqStatusDate.equals(rhs.reqStatusDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
