
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
    "id",
    "contractNumber",
    "keyblocTermCode",
    "desc",
    "detailChgCode",
    "detailPayCode",
    "tprlCode",
    "termCodeExpiration",
    "studentContRollInd",
    "contractRollInd"
})
@Generated("jsonschema2pojo")
public class ContractAuthorizationContractBaseInformation100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("contractNumber")
    private String contractNumber;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    /**
     * Description
     * <p>
     * Lineage reference object : TBBCONT_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_DESC")
    private String desc;
    /**
     * Charge Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("detailChgCode")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc")
    private String detailChgCode;
    /**
     * Payment Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc
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
    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String termCodeExpiration;
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
     * Roll Contract
     * <p>
     * Lineage reference object : TBBCONT_CONTRACT_ROLL_IND
     * 
     */
    @JsonProperty("contractRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCONT_CONTRACT_ROLL_IND")
    private String contractRollInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ContractAuthorizationContractBaseInformation100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("contractNumber")
    public String getContractNumber() {
        return contractNumber;
    }

    @JsonProperty("contractNumber")
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ContractAuthorizationContractBaseInformation100QapiPost withContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ContractAuthorizationContractBaseInformation100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBCONT_DESC
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
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ContractAuthorizationContractBaseInformation100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Charge Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_CHG_CODE, Lookup lineage reference object : tbbdetc
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
     * 
     */
    @JsonProperty("detailChgCode")
    public void setDetailChgCode(String detailChgCode) {
        this.detailChgCode = detailChgCode;
    }

    public ContractAuthorizationContractBaseInformation100QapiPost withDetailChgCode(String detailChgCode) {
        this.detailChgCode = detailChgCode;
        return this;
    }

    /**
     * Payment Detail Code
     * <p>
     * Lineage reference object : TBBCONT_DETAIL_PAY_CODE, Lookup lineage reference object : tbbdetc
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
     * 
     */
    @JsonProperty("detailPayCode")
    public void setDetailPayCode(String detailPayCode) {
        this.detailPayCode = detailPayCode;
    }

    public ContractAuthorizationContractBaseInformation100QapiPost withDetailPayCode(String detailPayCode) {
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

    public ContractAuthorizationContractBaseInformation100QapiPost withTprlCode(String tprlCode) {
        this.tprlCode = tprlCode;
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

    public ContractAuthorizationContractBaseInformation100QapiPost withTermCodeExpiration(String termCodeExpiration) {
        this.termCodeExpiration = termCodeExpiration;
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

    public ContractAuthorizationContractBaseInformation100QapiPost withStudentContRollInd(String studentContRollInd) {
        this.studentContRollInd = studentContRollInd;
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

    public ContractAuthorizationContractBaseInformation100QapiPost withContractRollInd(String contractRollInd) {
        this.contractRollInd = contractRollInd;
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

    public ContractAuthorizationContractBaseInformation100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractAuthorizationContractBaseInformation100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("detailChgCode");
        sb.append('=');
        sb.append(((this.detailChgCode == null)?"<null>":this.detailChgCode));
        sb.append(',');
        sb.append("detailPayCode");
        sb.append('=');
        sb.append(((this.detailPayCode == null)?"<null>":this.detailPayCode));
        sb.append(',');
        sb.append("tprlCode");
        sb.append('=');
        sb.append(((this.tprlCode == null)?"<null>":this.tprlCode));
        sb.append(',');
        sb.append("termCodeExpiration");
        sb.append('=');
        sb.append(((this.termCodeExpiration == null)?"<null>":this.termCodeExpiration));
        sb.append(',');
        sb.append("studentContRollInd");
        sb.append('=');
        sb.append(((this.studentContRollInd == null)?"<null>":this.studentContRollInd));
        sb.append(',');
        sb.append("contractRollInd");
        sb.append('=');
        sb.append(((this.contractRollInd == null)?"<null>":this.contractRollInd));
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
        result = ((result* 31)+((this.detailChgCode == null)? 0 :this.detailChgCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.studentContRollInd == null)? 0 :this.studentContRollInd.hashCode()));
        result = ((result* 31)+((this.contractRollInd == null)? 0 :this.contractRollInd.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.termCodeExpiration == null)? 0 :this.termCodeExpiration.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.detailPayCode == null)? 0 :this.detailPayCode.hashCode()));
        result = ((result* 31)+((this.tprlCode == null)? 0 :this.tprlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractAuthorizationContractBaseInformation100QapiPost) == false) {
            return false;
        }
        ContractAuthorizationContractBaseInformation100QapiPost rhs = ((ContractAuthorizationContractBaseInformation100QapiPost) other);
        return ((((((((((((this.detailChgCode == rhs.detailChgCode)||((this.detailChgCode!= null)&&this.detailChgCode.equals(rhs.detailChgCode)))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.studentContRollInd == rhs.studentContRollInd)||((this.studentContRollInd!= null)&&this.studentContRollInd.equals(rhs.studentContRollInd))))&&((this.contractRollInd == rhs.contractRollInd)||((this.contractRollInd!= null)&&this.contractRollInd.equals(rhs.contractRollInd))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.termCodeExpiration == rhs.termCodeExpiration)||((this.termCodeExpiration!= null)&&this.termCodeExpiration.equals(rhs.termCodeExpiration))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.detailPayCode == rhs.detailPayCode)||((this.detailPayCode!= null)&&this.detailPayCode.equals(rhs.detailPayCode))))&&((this.tprlCode == rhs.tprlCode)||((this.tprlCode!= null)&&this.tprlCode.equals(rhs.tprlCode))));
    }

}
