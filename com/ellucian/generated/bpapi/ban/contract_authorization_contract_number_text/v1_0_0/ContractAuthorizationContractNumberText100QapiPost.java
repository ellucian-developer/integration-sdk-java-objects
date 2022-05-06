
package com.ellucian.generated.bpapi.ban.contract_authorization_contract_number_text.v1_0_0;

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
    "text",
    "printInd"
})
@Generated("jsonschema2pojo")
public class ContractAuthorizationContractNumberText100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("contractNumber")
    private String contractNumber;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    /**
     * Additional Text
     * <p>
     * Lineage reference object : TBBCCTX_TEXT
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Lineage reference object : TBBCCTX_TEXT")
    private String text;
    /**
     * Lineage reference object : TBBCCTX_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    @JsonPropertyDescription("Lineage reference object : TBBCCTX_PRINT_IND")
    private String printInd;
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

    public ContractAuthorizationContractNumberText100QapiPost withId(String id) {
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

    public ContractAuthorizationContractNumberText100QapiPost withContractNumber(String contractNumber) {
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

    public ContractAuthorizationContractNumberText100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Additional Text
     * <p>
     * Lineage reference object : TBBCCTX_TEXT
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Additional Text
     * <p>
     * Lineage reference object : TBBCCTX_TEXT
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public ContractAuthorizationContractNumberText100QapiPost withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Lineage reference object : TBBCCTX_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    public String getPrintInd() {
        return printInd;
    }

    /**
     * Lineage reference object : TBBCCTX_PRINT_IND
     * 
     */
    @JsonProperty("printInd")
    public void setPrintInd(String printInd) {
        this.printInd = printInd;
    }

    public ContractAuthorizationContractNumberText100QapiPost withPrintInd(String printInd) {
        this.printInd = printInd;
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

    public ContractAuthorizationContractNumberText100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractAuthorizationContractNumberText100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("printInd");
        sb.append('=');
        sb.append(((this.printInd == null)?"<null>":this.printInd));
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
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.printInd == null)? 0 :this.printInd.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractAuthorizationContractNumberText100QapiPost) == false) {
            return false;
        }
        ContractAuthorizationContractNumberText100QapiPost rhs = ((ContractAuthorizationContractNumberText100QapiPost) other);
        return (((((((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode)))&&((this.printInd == rhs.printInd)||((this.printInd!= null)&&this.printInd.equals(rhs.printInd))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
