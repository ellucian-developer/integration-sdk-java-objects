
package com.ellucian.generated.bpapi.ban.contract_person_authorization.v1_0_0;

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
    "tbbcstuStudentContRollInd",
    "tbbcstuAuthInd",
    "stuId2",
    "keyblocTermCode",
    "contractNumber",
    "id",
    "tbbcstuContractPriority"
})
@Generated("jsonschema2pojo")
public class ContractPersonAuthorization100PostRequest {

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("tbbcstuStudentContRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND")
    private String tbbcstuStudentContRollInd;
    /**
     * Authorize
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("tbbcstuAuthInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_AUTH_IND")
    private String tbbcstuAuthInd;
    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId2")
    private String stuId2;
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
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    @JsonPropertyDescription("Lineage reference object : contractNumber")
    private Object contractNumber;
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
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("tbbcstuContractPriority")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_CONTRACT_PRIORITY")
    private Double tbbcstuContractPriority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("tbbcstuStudentContRollInd")
    public String getTbbcstuStudentContRollInd() {
        return tbbcstuStudentContRollInd;
    }

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("tbbcstuStudentContRollInd")
    public void setTbbcstuStudentContRollInd(String tbbcstuStudentContRollInd) {
        this.tbbcstuStudentContRollInd = tbbcstuStudentContRollInd;
    }

    public ContractPersonAuthorization100PostRequest withTbbcstuStudentContRollInd(String tbbcstuStudentContRollInd) {
        this.tbbcstuStudentContRollInd = tbbcstuStudentContRollInd;
        return this;
    }

    /**
     * Authorize
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("tbbcstuAuthInd")
    public String getTbbcstuAuthInd() {
        return tbbcstuAuthInd;
    }

    /**
     * Authorize
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("tbbcstuAuthInd")
    public void setTbbcstuAuthInd(String tbbcstuAuthInd) {
        this.tbbcstuAuthInd = tbbcstuAuthInd;
    }

    public ContractPersonAuthorization100PostRequest withTbbcstuAuthInd(String tbbcstuAuthInd) {
        this.tbbcstuAuthInd = tbbcstuAuthInd;
        return this;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId2")
    public String getStuId2() {
        return stuId2;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId2")
    public void setStuId2(String stuId2) {
        this.stuId2 = stuId2;
    }

    public ContractPersonAuthorization100PostRequest withStuId2(String stuId2) {
        this.stuId2 = stuId2;
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

    public ContractPersonAuthorization100PostRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    public Object getContractNumber() {
        return contractNumber;
    }

    /**
     * Contract Number
     * <p>
     * Lineage reference object : contractNumber
     * 
     */
    @JsonProperty("contractNumber")
    public void setContractNumber(Object contractNumber) {
        this.contractNumber = contractNumber;
    }

    public ContractPersonAuthorization100PostRequest withContractNumber(Object contractNumber) {
        this.contractNumber = contractNumber;
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

    public ContractPersonAuthorization100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("tbbcstuContractPriority")
    public Double getTbbcstuContractPriority() {
        return tbbcstuContractPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("tbbcstuContractPriority")
    public void setTbbcstuContractPriority(Double tbbcstuContractPriority) {
        this.tbbcstuContractPriority = tbbcstuContractPriority;
    }

    public ContractPersonAuthorization100PostRequest withTbbcstuContractPriority(Double tbbcstuContractPriority) {
        this.tbbcstuContractPriority = tbbcstuContractPriority;
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

    public ContractPersonAuthorization100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractPersonAuthorization100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbcstuStudentContRollInd");
        sb.append('=');
        sb.append(((this.tbbcstuStudentContRollInd == null)?"<null>":this.tbbcstuStudentContRollInd));
        sb.append(',');
        sb.append("tbbcstuAuthInd");
        sb.append('=');
        sb.append(((this.tbbcstuAuthInd == null)?"<null>":this.tbbcstuAuthInd));
        sb.append(',');
        sb.append("stuId2");
        sb.append('=');
        sb.append(((this.stuId2 == null)?"<null>":this.stuId2));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("tbbcstuContractPriority");
        sb.append('=');
        sb.append(((this.tbbcstuContractPriority == null)?"<null>":this.tbbcstuContractPriority));
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
        result = ((result* 31)+((this.tbbcstuStudentContRollInd == null)? 0 :this.tbbcstuStudentContRollInd.hashCode()));
        result = ((result* 31)+((this.tbbcstuAuthInd == null)? 0 :this.tbbcstuAuthInd.hashCode()));
        result = ((result* 31)+((this.stuId2 == null)? 0 :this.stuId2 .hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tbbcstuContractPriority == null)? 0 :this.tbbcstuContractPriority.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractPersonAuthorization100PostRequest) == false) {
            return false;
        }
        ContractPersonAuthorization100PostRequest rhs = ((ContractPersonAuthorization100PostRequest) other);
        return (((((((((this.tbbcstuStudentContRollInd == rhs.tbbcstuStudentContRollInd)||((this.tbbcstuStudentContRollInd!= null)&&this.tbbcstuStudentContRollInd.equals(rhs.tbbcstuStudentContRollInd)))&&((this.tbbcstuAuthInd == rhs.tbbcstuAuthInd)||((this.tbbcstuAuthInd!= null)&&this.tbbcstuAuthInd.equals(rhs.tbbcstuAuthInd))))&&((this.stuId2 == rhs.stuId2)||((this.stuId2 != null)&&this.stuId2 .equals(rhs.stuId2))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tbbcstuContractPriority == rhs.tbbcstuContractPriority)||((this.tbbcstuContractPriority!= null)&&this.tbbcstuContractPriority.equals(rhs.tbbcstuContractPriority))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
