
package com.ellucian.generated.bpapi.ban.contract_authorization_contract_base_information.v1_0_0;

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
    "detailChgCode",
    "expTermDesc",
    "tbbdetcPayDesc",
    "ruleDesc",
    "contractRollInd",
    "studentContRollInd",
    "termCodeExpiration",
    "tbbdetcChgDesc",
    "desc",
    "detailPayCode",
    "tprlCode"
})
@Generated("jsonschema2pojo")
public class ContractAuthorizationContractBaseInformation100PutResponse {

    /**
     * Charge Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailChgCode")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc")
    private String detailChgCode;
    @JsonProperty("expTermDesc")
    private String expTermDesc;
    @JsonProperty("tbbdetcPayDesc")
    private String tbbdetcPayDesc;
    @JsonProperty("ruleDesc")
    private String ruleDesc;
    /**
     * Roll Contract
     * <p>
     * Lineage reference object : TBBCONT_CONTRACT_ROLL_IND
     * 
     */
    @JsonProperty("contractRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_CONTRACT_ROLL_IND")
    private String contractRollInd;
    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBCONT_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("studentContRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_STUDENT_CONT_ROLL_IND")
    private String studentContRollInd;
    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String termCodeExpiration;
    @JsonProperty("tbbdetcChgDesc")
    private String tbbdetcChgDesc;
    /**
     * Description
     * <p>
     * Lineage reference object : TBBCONT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_DESC")
    private String desc;
    /**
     * Payment Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailPayCode")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc")
    private String detailPayCode;
    /**
     * Print Rule Code
     * <p>
     * Lineage reference object : TBBCONT_TPRL_CODE, Lookup lineage reference object : ttvtprc
     * 
     */
    @JsonProperty("tprlCode")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_TPRL_CODE, Lookup lineage reference object : ttvtprc")
    private String tprlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Charge Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailChgCode")
    public String getDetailChgCode() {
        return detailChgCode;
    }

    /**
     * Charge Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailChgCode")
    public void setDetailChgCode(String detailChgCode) {
        this.detailChgCode = detailChgCode;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withDetailChgCode(String detailChgCode) {
        this.detailChgCode = detailChgCode;
        return this;
    }

    @JsonProperty("expTermDesc")
    public String getExpTermDesc() {
        return expTermDesc;
    }

    @JsonProperty("expTermDesc")
    public void setExpTermDesc(String expTermDesc) {
        this.expTermDesc = expTermDesc;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withExpTermDesc(String expTermDesc) {
        this.expTermDesc = expTermDesc;
        return this;
    }

    @JsonProperty("tbbdetcPayDesc")
    public String getTbbdetcPayDesc() {
        return tbbdetcPayDesc;
    }

    @JsonProperty("tbbdetcPayDesc")
    public void setTbbdetcPayDesc(String tbbdetcPayDesc) {
        this.tbbdetcPayDesc = tbbdetcPayDesc;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withTbbdetcPayDesc(String tbbdetcPayDesc) {
        this.tbbdetcPayDesc = tbbdetcPayDesc;
        return this;
    }

    @JsonProperty("ruleDesc")
    public String getRuleDesc() {
        return ruleDesc;
    }

    @JsonProperty("ruleDesc")
    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }

    /**
     * Roll Contract
     * <p>
     * Lineage reference object : TBBCONT_CONTRACT_ROLL_IND
     * 
     */
    @JsonProperty("contractRollInd")
    public String getContractRollInd() {
        return contractRollInd;
    }

    /**
     * Roll Contract
     * <p>
     * Lineage reference object : TBBCONT_CONTRACT_ROLL_IND
     * 
     */
    @JsonProperty("contractRollInd")
    public void setContractRollInd(String contractRollInd) {
        this.contractRollInd = contractRollInd;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withContractRollInd(String contractRollInd) {
        this.contractRollInd = contractRollInd;
        return this;
    }

    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBCONT_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("studentContRollInd")
    public String getStudentContRollInd() {
        return studentContRollInd;
    }

    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBCONT_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("studentContRollInd")
    public void setStudentContRollInd(String studentContRollInd) {
        this.studentContRollInd = studentContRollInd;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withStudentContRollInd(String studentContRollInd) {
        this.studentContRollInd = studentContRollInd;
        return this;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    public String getTermCodeExpiration() {
        return termCodeExpiration;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    public void setTermCodeExpiration(String termCodeExpiration) {
        this.termCodeExpiration = termCodeExpiration;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withTermCodeExpiration(String termCodeExpiration) {
        this.termCodeExpiration = termCodeExpiration;
        return this;
    }

    @JsonProperty("tbbdetcChgDesc")
    public String getTbbdetcChgDesc() {
        return tbbdetcChgDesc;
    }

    @JsonProperty("tbbdetcChgDesc")
    public void setTbbdetcChgDesc(String tbbdetcChgDesc) {
        this.tbbdetcChgDesc = tbbdetcChgDesc;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withTbbdetcChgDesc(String tbbdetcChgDesc) {
        this.tbbdetcChgDesc = tbbdetcChgDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBCONT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBCONT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Payment Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailPayCode")
    public String getDetailPayCode() {
        return detailPayCode;
    }

    /**
     * Payment Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailPayCode")
    public void setDetailPayCode(String detailPayCode) {
        this.detailPayCode = detailPayCode;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withDetailPayCode(String detailPayCode) {
        this.detailPayCode = detailPayCode;
        return this;
    }

    /**
     * Print Rule Code
     * <p>
     * Lineage reference object : TBBCONT_TPRL_CODE, Lookup lineage reference object : ttvtprc
     * 
     */
    @JsonProperty("tprlCode")
    public String getTprlCode() {
        return tprlCode;
    }

    /**
     * Print Rule Code
     * <p>
     * Lineage reference object : TBBCONT_TPRL_CODE, Lookup lineage reference object : ttvtprc
     * 
     */
    @JsonProperty("tprlCode")
    public void setTprlCode(String tprlCode) {
        this.tprlCode = tprlCode;
    }

    public ContractAuthorizationContractBaseInformation100PutResponse withTprlCode(String tprlCode) {
        this.tprlCode = tprlCode;
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

    public ContractAuthorizationContractBaseInformation100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractAuthorizationContractBaseInformation100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailChgCode");
        sb.append('=');
        sb.append(((this.detailChgCode == null)?"<null>":this.detailChgCode));
        sb.append(',');
        sb.append("expTermDesc");
        sb.append('=');
        sb.append(((this.expTermDesc == null)?"<null>":this.expTermDesc));
        sb.append(',');
        sb.append("tbbdetcPayDesc");
        sb.append('=');
        sb.append(((this.tbbdetcPayDesc == null)?"<null>":this.tbbdetcPayDesc));
        sb.append(',');
        sb.append("ruleDesc");
        sb.append('=');
        sb.append(((this.ruleDesc == null)?"<null>":this.ruleDesc));
        sb.append(',');
        sb.append("contractRollInd");
        sb.append('=');
        sb.append(((this.contractRollInd == null)?"<null>":this.contractRollInd));
        sb.append(',');
        sb.append("studentContRollInd");
        sb.append('=');
        sb.append(((this.studentContRollInd == null)?"<null>":this.studentContRollInd));
        sb.append(',');
        sb.append("termCodeExpiration");
        sb.append('=');
        sb.append(((this.termCodeExpiration == null)?"<null>":this.termCodeExpiration));
        sb.append(',');
        sb.append("tbbdetcChgDesc");
        sb.append('=');
        sb.append(((this.tbbdetcChgDesc == null)?"<null>":this.tbbdetcChgDesc));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("detailPayCode");
        sb.append('=');
        sb.append(((this.detailPayCode == null)?"<null>":this.detailPayCode));
        sb.append(',');
        sb.append("tprlCode");
        sb.append('=');
        sb.append(((this.tprlCode == null)?"<null>":this.tprlCode));
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
        result = ((result* 31)+((this.expTermDesc == null)? 0 :this.expTermDesc.hashCode()));
        result = ((result* 31)+((this.tbbdetcPayDesc == null)? 0 :this.tbbdetcPayDesc.hashCode()));
        result = ((result* 31)+((this.studentContRollInd == null)? 0 :this.studentContRollInd.hashCode()));
        result = ((result* 31)+((this.termCodeExpiration == null)? 0 :this.termCodeExpiration.hashCode()));
        result = ((result* 31)+((this.detailPayCode == null)? 0 :this.detailPayCode.hashCode()));
        result = ((result* 31)+((this.detailChgCode == null)? 0 :this.detailChgCode.hashCode()));
        result = ((result* 31)+((this.ruleDesc == null)? 0 :this.ruleDesc.hashCode()));
        result = ((result* 31)+((this.contractRollInd == null)? 0 :this.contractRollInd.hashCode()));
        result = ((result* 31)+((this.tbbdetcChgDesc == null)? 0 :this.tbbdetcChgDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.tprlCode == null)? 0 :this.tprlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractAuthorizationContractBaseInformation100PutResponse) == false) {
            return false;
        }
        ContractAuthorizationContractBaseInformation100PutResponse rhs = ((ContractAuthorizationContractBaseInformation100PutResponse) other);
        return (((((((((((((this.expTermDesc == rhs.expTermDesc)||((this.expTermDesc!= null)&&this.expTermDesc.equals(rhs.expTermDesc)))&&((this.tbbdetcPayDesc == rhs.tbbdetcPayDesc)||((this.tbbdetcPayDesc!= null)&&this.tbbdetcPayDesc.equals(rhs.tbbdetcPayDesc))))&&((this.studentContRollInd == rhs.studentContRollInd)||((this.studentContRollInd!= null)&&this.studentContRollInd.equals(rhs.studentContRollInd))))&&((this.termCodeExpiration == rhs.termCodeExpiration)||((this.termCodeExpiration!= null)&&this.termCodeExpiration.equals(rhs.termCodeExpiration))))&&((this.detailPayCode == rhs.detailPayCode)||((this.detailPayCode!= null)&&this.detailPayCode.equals(rhs.detailPayCode))))&&((this.detailChgCode == rhs.detailChgCode)||((this.detailChgCode!= null)&&this.detailChgCode.equals(rhs.detailChgCode))))&&((this.ruleDesc == rhs.ruleDesc)||((this.ruleDesc!= null)&&this.ruleDesc.equals(rhs.ruleDesc))))&&((this.contractRollInd == rhs.contractRollInd)||((this.contractRollInd!= null)&&this.contractRollInd.equals(rhs.contractRollInd))))&&((this.tbbdetcChgDesc == rhs.tbbdetcChgDesc)||((this.tbbdetcChgDesc!= null)&&this.tbbdetcChgDesc.equals(rhs.tbbdetcChgDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.tprlCode == rhs.tprlCode)||((this.tprlCode!= null)&&this.tprlCode.equals(rhs.tprlCode))));
    }

}
