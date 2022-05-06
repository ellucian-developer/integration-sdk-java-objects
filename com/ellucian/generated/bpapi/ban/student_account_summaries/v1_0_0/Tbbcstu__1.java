
package com.ellucian.generated.bpapi.ban.student_account_summaries.v1_0_0;

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
    "contractPriority",
    "authInd",
    "contId",
    "delInd",
    "stspKeySequence",
    "contDescription",
    "maxStudentAmount",
    "studentContRollInd",
    "contName",
    "authNumber",
    "contractNumber",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbbcstu__1 {

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("contractPriority")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_CONTRACT_PRIORITY")
    private Double contractPriority;
    /**
     * Authorization
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("authInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_AUTH_IND")
    private String authInd;
    /**
     * ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("contId")
    private String contId;
    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("delInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_DEL_IND")
    private String delInd;
    /**
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("contDescription")
    private String contDescription;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT")
    private Double maxStudentAmount;
    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("studentContRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND")
    private String studentContRollInd;
    @JsonProperty("contName")
    private String contName;
    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("authNumber")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_AUTH_NUMBER")
    private String authNumber;
    /**
     * Number
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("contractNumber")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_CONTRACT_NUMBER")
    private Double contractNumber;
    /**
     * Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("contractPriority")
    public Double getContractPriority() {
        return contractPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("contractPriority")
    public void setContractPriority(Double contractPriority) {
        this.contractPriority = contractPriority;
    }

    public Tbbcstu__1 withContractPriority(Double contractPriority) {
        this.contractPriority = contractPriority;
        return this;
    }

    /**
     * Authorization
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("authInd")
    public String getAuthInd() {
        return authInd;
    }

    /**
     * Authorization
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("authInd")
    public void setAuthInd(String authInd) {
        this.authInd = authInd;
    }

    public Tbbcstu__1 withAuthInd(String authInd) {
        this.authInd = authInd;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("contId")
    public String getContId() {
        return contId;
    }

    /**
     * ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("contId")
    public void setContId(String contId) {
        this.contId = contId;
    }

    public Tbbcstu__1 withContId(String contId) {
        this.contId = contId;
        return this;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("delInd")
    public String getDelInd() {
        return delInd;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("delInd")
    public void setDelInd(String delInd) {
        this.delInd = delInd;
    }

    public Tbbcstu__1 withDelInd(String delInd) {
        this.delInd = delInd;
        return this;
    }

    /**
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Tbbcstu__1 withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("contDescription")
    public String getContDescription() {
        return contDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("contDescription")
    public void setContDescription(String contDescription) {
        this.contDescription = contDescription;
    }

    public Tbbcstu__1 withContDescription(String contDescription) {
        this.contDescription = contDescription;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    public Double getMaxStudentAmount() {
        return maxStudentAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    public void setMaxStudentAmount(Double maxStudentAmount) {
        this.maxStudentAmount = maxStudentAmount;
    }

    public Tbbcstu__1 withMaxStudentAmount(Double maxStudentAmount) {
        this.maxStudentAmount = maxStudentAmount;
        return this;
    }

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("studentContRollInd")
    public String getStudentContRollInd() {
        return studentContRollInd;
    }

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("studentContRollInd")
    public void setStudentContRollInd(String studentContRollInd) {
        this.studentContRollInd = studentContRollInd;
    }

    public Tbbcstu__1 withStudentContRollInd(String studentContRollInd) {
        this.studentContRollInd = studentContRollInd;
        return this;
    }

    @JsonProperty("contName")
    public String getContName() {
        return contName;
    }

    @JsonProperty("contName")
    public void setContName(String contName) {
        this.contName = contName;
    }

    public Tbbcstu__1 withContName(String contName) {
        this.contName = contName;
        return this;
    }

    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("authNumber")
    public String getAuthNumber() {
        return authNumber;
    }

    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("authNumber")
    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }

    public Tbbcstu__1 withAuthNumber(String authNumber) {
        this.authNumber = authNumber;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("contractNumber")
    public Double getContractNumber() {
        return contractNumber;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("contractNumber")
    public void setContractNumber(Double contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Tbbcstu__1 withContractNumber(Double contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Tbbcstu__1 withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Tbbcstu__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbcstu__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contractPriority");
        sb.append('=');
        sb.append(((this.contractPriority == null)?"<null>":this.contractPriority));
        sb.append(',');
        sb.append("authInd");
        sb.append('=');
        sb.append(((this.authInd == null)?"<null>":this.authInd));
        sb.append(',');
        sb.append("contId");
        sb.append('=');
        sb.append(((this.contId == null)?"<null>":this.contId));
        sb.append(',');
        sb.append("delInd");
        sb.append('=');
        sb.append(((this.delInd == null)?"<null>":this.delInd));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("contDescription");
        sb.append('=');
        sb.append(((this.contDescription == null)?"<null>":this.contDescription));
        sb.append(',');
        sb.append("maxStudentAmount");
        sb.append('=');
        sb.append(((this.maxStudentAmount == null)?"<null>":this.maxStudentAmount));
        sb.append(',');
        sb.append("studentContRollInd");
        sb.append('=');
        sb.append(((this.studentContRollInd == null)?"<null>":this.studentContRollInd));
        sb.append(',');
        sb.append("contName");
        sb.append('=');
        sb.append(((this.contName == null)?"<null>":this.contName));
        sb.append(',');
        sb.append("authNumber");
        sb.append('=');
        sb.append(((this.authNumber == null)?"<null>":this.authNumber));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.authInd == null)? 0 :this.authInd.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.contDescription == null)? 0 :this.contDescription.hashCode()));
        result = ((result* 31)+((this.studentContRollInd == null)? 0 :this.studentContRollInd.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.contractPriority == null)? 0 :this.contractPriority.hashCode()));
        result = ((result* 31)+((this.contId == null)? 0 :this.contId.hashCode()));
        result = ((result* 31)+((this.delInd == null)? 0 :this.delInd.hashCode()));
        result = ((result* 31)+((this.maxStudentAmount == null)? 0 :this.maxStudentAmount.hashCode()));
        result = ((result* 31)+((this.contName == null)? 0 :this.contName.hashCode()));
        result = ((result* 31)+((this.authNumber == null)? 0 :this.authNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbbcstu__1) == false) {
            return false;
        }
        Tbbcstu__1 rhs = ((Tbbcstu__1) other);
        return ((((((((((((((this.authInd == rhs.authInd)||((this.authInd!= null)&&this.authInd.equals(rhs.authInd)))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.contDescription == rhs.contDescription)||((this.contDescription!= null)&&this.contDescription.equals(rhs.contDescription))))&&((this.studentContRollInd == rhs.studentContRollInd)||((this.studentContRollInd!= null)&&this.studentContRollInd.equals(rhs.studentContRollInd))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.contractPriority == rhs.contractPriority)||((this.contractPriority!= null)&&this.contractPriority.equals(rhs.contractPriority))))&&((this.contId == rhs.contId)||((this.contId!= null)&&this.contId.equals(rhs.contId))))&&((this.delInd == rhs.delInd)||((this.delInd!= null)&&this.delInd.equals(rhs.delInd))))&&((this.maxStudentAmount == rhs.maxStudentAmount)||((this.maxStudentAmount!= null)&&this.maxStudentAmount.equals(rhs.maxStudentAmount))))&&((this.contName == rhs.contName)||((this.contName!= null)&&this.contName.equals(rhs.contName))))&&((this.authNumber == rhs.authNumber)||((this.authNumber!= null)&&this.authNumber.equals(rhs.authNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
