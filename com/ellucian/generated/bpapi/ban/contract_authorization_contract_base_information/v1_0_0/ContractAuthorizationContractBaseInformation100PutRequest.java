
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
    "criteria.contractRollInd",
    "criteria.ruleDesc",
    "keyblocTermCode",
    "criteria.termCodeExpiration",
    "criteria.tbbdetcPayDesc",
    "criteria.tprlCode",
    "contractNumber",
    "criteria.studentContRollInd",
    "termCodeExpiration",
    "criteria.expTermDesc",
    "criteria.desc",
    "criteria.detailPayCode",
    "detailPayCode",
    "criteria.tbbdetcChgDesc",
    "detailChgCode",
    "criteria.detailChgCode",
    "id",
    "desc",
    "tprlCode"
})
@Generated("jsonschema2pojo")
public class ContractAuthorizationContractBaseInformation100PutRequest {

    /**
     * Roll Contract
     * <p>
     * Lineage reference object : TBBCONT_CONTRACT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.contractRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_CONTRACT_ROLL_IND")
    private String criteriaContractRollInd;
    @JsonProperty("criteria.ruleDesc")
    private String criteriaRuleDesc;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeExpiration;
    @JsonProperty("criteria.tbbdetcPayDesc")
    private String criteriaTbbdetcPayDesc;
    /**
     * Print Rule Code
     * <p>
     * Lineage reference object : TBBCONT_TPRL_CODE, Lookup lineage reference object : ttvtprc
     * 
     */
    @JsonProperty("criteria.tprlCode")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_TPRL_CODE, Lookup lineage reference object : ttvtprc")
    private String criteriaTprlCode;
    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    @JsonPropertyDescription("Lineage reference object : contractNumber")
    private Double contractNumber;
    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBCONT_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentContRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_STUDENT_CONT_ROLL_IND")
    private String criteriaStudentContRollInd;
    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String termCodeExpiration;
    @JsonProperty("criteria.expTermDesc")
    private String criteriaExpTermDesc;
    /**
     * Description
     * <p>
     * Lineage reference object : TBBCONT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_DESC")
    private String criteriaDesc;
    /**
     * Payment Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailPayCode")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaDetailPayCode;
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
    @JsonProperty("criteria.tbbdetcChgDesc")
    private String criteriaTbbdetcChgDesc;
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
    /**
     * Charge Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailChgCode")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaDetailChgCode;
    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
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
     * Roll Contract
     * <p>
     * Lineage reference object : TBBCONT_CONTRACT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.contractRollInd")
    public String getCriteriaContractRollInd() {
        return criteriaContractRollInd;
    }

    /**
     * Roll Contract
     * <p>
     * Lineage reference object : TBBCONT_CONTRACT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.contractRollInd")
    public void setCriteriaContractRollInd(String criteriaContractRollInd) {
        this.criteriaContractRollInd = criteriaContractRollInd;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaContractRollInd(String criteriaContractRollInd) {
        this.criteriaContractRollInd = criteriaContractRollInd;
        return this;
    }

    @JsonProperty("criteria.ruleDesc")
    public String getCriteriaRuleDesc() {
        return criteriaRuleDesc;
    }

    @JsonProperty("criteria.ruleDesc")
    public void setCriteriaRuleDesc(String criteriaRuleDesc) {
        this.criteriaRuleDesc = criteriaRuleDesc;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaRuleDesc(String criteriaRuleDesc) {
        this.criteriaRuleDesc = criteriaRuleDesc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeExpiration")
    public String getCriteriaTermCodeExpiration() {
        return criteriaTermCodeExpiration;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeExpiration")
    public void setCriteriaTermCodeExpiration(String criteriaTermCodeExpiration) {
        this.criteriaTermCodeExpiration = criteriaTermCodeExpiration;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaTermCodeExpiration(String criteriaTermCodeExpiration) {
        this.criteriaTermCodeExpiration = criteriaTermCodeExpiration;
        return this;
    }

    @JsonProperty("criteria.tbbdetcPayDesc")
    public String getCriteriaTbbdetcPayDesc() {
        return criteriaTbbdetcPayDesc;
    }

    @JsonProperty("criteria.tbbdetcPayDesc")
    public void setCriteriaTbbdetcPayDesc(String criteriaTbbdetcPayDesc) {
        this.criteriaTbbdetcPayDesc = criteriaTbbdetcPayDesc;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaTbbdetcPayDesc(String criteriaTbbdetcPayDesc) {
        this.criteriaTbbdetcPayDesc = criteriaTbbdetcPayDesc;
        return this;
    }

    /**
     * Print Rule Code
     * <p>
     * Lineage reference object : TBBCONT_TPRL_CODE, Lookup lineage reference object : ttvtprc
     * 
     */
    @JsonProperty("criteria.tprlCode")
    public String getCriteriaTprlCode() {
        return criteriaTprlCode;
    }

    /**
     * Print Rule Code
     * <p>
     * Lineage reference object : TBBCONT_TPRL_CODE, Lookup lineage reference object : ttvtprc
     * 
     */
    @JsonProperty("criteria.tprlCode")
    public void setCriteriaTprlCode(String criteriaTprlCode) {
        this.criteriaTprlCode = criteriaTprlCode;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaTprlCode(String criteriaTprlCode) {
        this.criteriaTprlCode = criteriaTprlCode;
        return this;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    public Double getContractNumber() {
        return contractNumber;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    public void setContractNumber(Double contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withContractNumber(Double contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBCONT_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentContRollInd")
    public String getCriteriaStudentContRollInd() {
        return criteriaStudentContRollInd;
    }

    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBCONT_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentContRollInd")
    public void setCriteriaStudentContRollInd(String criteriaStudentContRollInd) {
        this.criteriaStudentContRollInd = criteriaStudentContRollInd;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaStudentContRollInd(String criteriaStudentContRollInd) {
        this.criteriaStudentContRollInd = criteriaStudentContRollInd;
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

    public ContractAuthorizationContractBaseInformation100PutRequest withTermCodeExpiration(String termCodeExpiration) {
        this.termCodeExpiration = termCodeExpiration;
        return this;
    }

    @JsonProperty("criteria.expTermDesc")
    public String getCriteriaExpTermDesc() {
        return criteriaExpTermDesc;
    }

    @JsonProperty("criteria.expTermDesc")
    public void setCriteriaExpTermDesc(String criteriaExpTermDesc) {
        this.criteriaExpTermDesc = criteriaExpTermDesc;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaExpTermDesc(String criteriaExpTermDesc) {
        this.criteriaExpTermDesc = criteriaExpTermDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBCONT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBCONT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Payment Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailPayCode")
    public String getCriteriaDetailPayCode() {
        return criteriaDetailPayCode;
    }

    /**
     * Payment Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailPayCode")
    public void setCriteriaDetailPayCode(String criteriaDetailPayCode) {
        this.criteriaDetailPayCode = criteriaDetailPayCode;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaDetailPayCode(String criteriaDetailPayCode) {
        this.criteriaDetailPayCode = criteriaDetailPayCode;
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

    public ContractAuthorizationContractBaseInformation100PutRequest withDetailPayCode(String detailPayCode) {
        this.detailPayCode = detailPayCode;
        return this;
    }

    @JsonProperty("criteria.tbbdetcChgDesc")
    public String getCriteriaTbbdetcChgDesc() {
        return criteriaTbbdetcChgDesc;
    }

    @JsonProperty("criteria.tbbdetcChgDesc")
    public void setCriteriaTbbdetcChgDesc(String criteriaTbbdetcChgDesc) {
        this.criteriaTbbdetcChgDesc = criteriaTbbdetcChgDesc;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaTbbdetcChgDesc(String criteriaTbbdetcChgDesc) {
        this.criteriaTbbdetcChgDesc = criteriaTbbdetcChgDesc;
        return this;
    }

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

    public ContractAuthorizationContractBaseInformation100PutRequest withDetailChgCode(String detailChgCode) {
        this.detailChgCode = detailChgCode;
        return this;
    }

    /**
     * Charge Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailChgCode")
    public String getCriteriaDetailChgCode() {
        return criteriaDetailChgCode;
    }

    /**
     * Charge Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailChgCode")
    public void setCriteriaDetailChgCode(String criteriaDetailChgCode) {
        this.criteriaDetailChgCode = criteriaDetailChgCode;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withCriteriaDetailChgCode(String criteriaDetailChgCode) {
        this.criteriaDetailChgCode = criteriaDetailChgCode;
        return this;
    }

    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ContractAuthorizationContractBaseInformation100PutRequest withId(String id) {
        this.id = id;
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

    public ContractAuthorizationContractBaseInformation100PutRequest withDesc(String desc) {
        this.desc = desc;
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

    public ContractAuthorizationContractBaseInformation100PutRequest withTprlCode(String tprlCode) {
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

    public ContractAuthorizationContractBaseInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractAuthorizationContractBaseInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaContractRollInd");
        sb.append('=');
        sb.append(((this.criteriaContractRollInd == null)?"<null>":this.criteriaContractRollInd));
        sb.append(',');
        sb.append("criteriaRuleDesc");
        sb.append('=');
        sb.append(((this.criteriaRuleDesc == null)?"<null>":this.criteriaRuleDesc));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("criteriaTermCodeExpiration");
        sb.append('=');
        sb.append(((this.criteriaTermCodeExpiration == null)?"<null>":this.criteriaTermCodeExpiration));
        sb.append(',');
        sb.append("criteriaTbbdetcPayDesc");
        sb.append('=');
        sb.append(((this.criteriaTbbdetcPayDesc == null)?"<null>":this.criteriaTbbdetcPayDesc));
        sb.append(',');
        sb.append("criteriaTprlCode");
        sb.append('=');
        sb.append(((this.criteriaTprlCode == null)?"<null>":this.criteriaTprlCode));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("criteriaStudentContRollInd");
        sb.append('=');
        sb.append(((this.criteriaStudentContRollInd == null)?"<null>":this.criteriaStudentContRollInd));
        sb.append(',');
        sb.append("termCodeExpiration");
        sb.append('=');
        sb.append(((this.termCodeExpiration == null)?"<null>":this.termCodeExpiration));
        sb.append(',');
        sb.append("criteriaExpTermDesc");
        sb.append('=');
        sb.append(((this.criteriaExpTermDesc == null)?"<null>":this.criteriaExpTermDesc));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaDetailPayCode");
        sb.append('=');
        sb.append(((this.criteriaDetailPayCode == null)?"<null>":this.criteriaDetailPayCode));
        sb.append(',');
        sb.append("detailPayCode");
        sb.append('=');
        sb.append(((this.detailPayCode == null)?"<null>":this.detailPayCode));
        sb.append(',');
        sb.append("criteriaTbbdetcChgDesc");
        sb.append('=');
        sb.append(((this.criteriaTbbdetcChgDesc == null)?"<null>":this.criteriaTbbdetcChgDesc));
        sb.append(',');
        sb.append("detailChgCode");
        sb.append('=');
        sb.append(((this.detailChgCode == null)?"<null>":this.detailChgCode));
        sb.append(',');
        sb.append("criteriaDetailChgCode");
        sb.append('=');
        sb.append(((this.criteriaDetailChgCode == null)?"<null>":this.criteriaDetailChgCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.criteriaTbbdetcChgDesc == null)? 0 :this.criteriaTbbdetcChgDesc.hashCode()));
        result = ((result* 31)+((this.criteriaDetailPayCode == null)? 0 :this.criteriaDetailPayCode.hashCode()));
        result = ((result* 31)+((this.criteriaTprlCode == null)? 0 :this.criteriaTprlCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeExpiration == null)? 0 :this.criteriaTermCodeExpiration.hashCode()));
        result = ((result* 31)+((this.criteriaRuleDesc == null)? 0 :this.criteriaRuleDesc.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.termCodeExpiration == null)? 0 :this.termCodeExpiration.hashCode()));
        result = ((result* 31)+((this.criteriaStudentContRollInd == null)? 0 :this.criteriaStudentContRollInd.hashCode()));
        result = ((result* 31)+((this.detailPayCode == null)? 0 :this.detailPayCode.hashCode()));
        result = ((result* 31)+((this.detailChgCode == null)? 0 :this.detailChgCode.hashCode()));
        result = ((result* 31)+((this.criteriaTbbdetcPayDesc == null)? 0 :this.criteriaTbbdetcPayDesc.hashCode()));
        result = ((result* 31)+((this.criteriaExpTermDesc == null)? 0 :this.criteriaExpTermDesc.hashCode()));
        result = ((result* 31)+((this.criteriaContractRollInd == null)? 0 :this.criteriaContractRollInd.hashCode()));
        result = ((result* 31)+((this.criteriaDetailChgCode == null)? 0 :this.criteriaDetailChgCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.tprlCode == null)? 0 :this.tprlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractAuthorizationContractBaseInformation100PutRequest) == false) {
            return false;
        }
        ContractAuthorizationContractBaseInformation100PutRequest rhs = ((ContractAuthorizationContractBaseInformation100PutRequest) other);
        return (((((((((((((((((((((this.criteriaTbbdetcChgDesc == rhs.criteriaTbbdetcChgDesc)||((this.criteriaTbbdetcChgDesc!= null)&&this.criteriaTbbdetcChgDesc.equals(rhs.criteriaTbbdetcChgDesc)))&&((this.criteriaDetailPayCode == rhs.criteriaDetailPayCode)||((this.criteriaDetailPayCode!= null)&&this.criteriaDetailPayCode.equals(rhs.criteriaDetailPayCode))))&&((this.criteriaTprlCode == rhs.criteriaTprlCode)||((this.criteriaTprlCode!= null)&&this.criteriaTprlCode.equals(rhs.criteriaTprlCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.criteriaTermCodeExpiration == rhs.criteriaTermCodeExpiration)||((this.criteriaTermCodeExpiration!= null)&&this.criteriaTermCodeExpiration.equals(rhs.criteriaTermCodeExpiration))))&&((this.criteriaRuleDesc == rhs.criteriaRuleDesc)||((this.criteriaRuleDesc!= null)&&this.criteriaRuleDesc.equals(rhs.criteriaRuleDesc))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.termCodeExpiration == rhs.termCodeExpiration)||((this.termCodeExpiration!= null)&&this.termCodeExpiration.equals(rhs.termCodeExpiration))))&&((this.criteriaStudentContRollInd == rhs.criteriaStudentContRollInd)||((this.criteriaStudentContRollInd!= null)&&this.criteriaStudentContRollInd.equals(rhs.criteriaStudentContRollInd))))&&((this.detailPayCode == rhs.detailPayCode)||((this.detailPayCode!= null)&&this.detailPayCode.equals(rhs.detailPayCode))))&&((this.detailChgCode == rhs.detailChgCode)||((this.detailChgCode!= null)&&this.detailChgCode.equals(rhs.detailChgCode))))&&((this.criteriaTbbdetcPayDesc == rhs.criteriaTbbdetcPayDesc)||((this.criteriaTbbdetcPayDesc!= null)&&this.criteriaTbbdetcPayDesc.equals(rhs.criteriaTbbdetcPayDesc))))&&((this.criteriaExpTermDesc == rhs.criteriaExpTermDesc)||((this.criteriaExpTermDesc!= null)&&this.criteriaExpTermDesc.equals(rhs.criteriaExpTermDesc))))&&((this.criteriaContractRollInd == rhs.criteriaContractRollInd)||((this.criteriaContractRollInd!= null)&&this.criteriaContractRollInd.equals(rhs.criteriaContractRollInd))))&&((this.criteriaDetailChgCode == rhs.criteriaDetailChgCode)||((this.criteriaDetailChgCode!= null)&&this.criteriaDetailChgCode.equals(rhs.criteriaDetailChgCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.tprlCode == rhs.tprlCode)||((this.tprlCode!= null)&&this.tprlCode.equals(rhs.tprlCode))));
    }

}
