
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
    "exemptionCode",
    "delInd",
    "stspKeySequence",
    "studentExptRollInd",
    "maxStudentAmount",
    "tbbexptDesc",
    "exemptionPriority",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbbestu {

    /**
     * Code
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_CODE
     * (Required)
     * 
     */
    @JsonProperty("exemptionCode")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_EXEMPTION_CODE")
    private String exemptionCode;
    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBESTU_DEL_IND
     * 
     */
    @JsonProperty("delInd")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_DEL_IND")
    private String delInd;
    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    /**
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND")
    private String studentExptRollInd;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT")
    private Double maxStudentAmount;
    @JsonProperty("tbbexptDesc")
    private String tbbexptDesc;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("exemptionPriority")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_EXEMPTION_PRIORITY")
    private Double exemptionPriority;
    /**
     * Term
     * <p>
     * Lineage reference object : TBBESTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_CODE
     * (Required)
     * 
     */
    @JsonProperty("exemptionCode")
    public String getExemptionCode() {
        return exemptionCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_CODE
     * (Required)
     * 
     */
    @JsonProperty("exemptionCode")
    public void setExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
    }

    public Tbbestu withExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
        return this;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBESTU_DEL_IND
     * 
     */
    @JsonProperty("delInd")
    public String getDelInd() {
        return delInd;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBESTU_DEL_IND
     * 
     */
    @JsonProperty("delInd")
    public void setDelInd(String delInd) {
        this.delInd = delInd;
    }

    public Tbbestu withDelInd(String delInd) {
        this.delInd = delInd;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public Tbbestu withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    public String getStudentExptRollInd() {
        return studentExptRollInd;
    }

    /**
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    public void setStudentExptRollInd(String studentExptRollInd) {
        this.studentExptRollInd = studentExptRollInd;
    }

    public Tbbestu withStudentExptRollInd(String studentExptRollInd) {
        this.studentExptRollInd = studentExptRollInd;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    public Double getMaxStudentAmount() {
        return maxStudentAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    public void setMaxStudentAmount(Double maxStudentAmount) {
        this.maxStudentAmount = maxStudentAmount;
    }

    public Tbbestu withMaxStudentAmount(Double maxStudentAmount) {
        this.maxStudentAmount = maxStudentAmount;
        return this;
    }

    @JsonProperty("tbbexptDesc")
    public String getTbbexptDesc() {
        return tbbexptDesc;
    }

    @JsonProperty("tbbexptDesc")
    public void setTbbexptDesc(String tbbexptDesc) {
        this.tbbexptDesc = tbbexptDesc;
    }

    public Tbbestu withTbbexptDesc(String tbbexptDesc) {
        this.tbbexptDesc = tbbexptDesc;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("exemptionPriority")
    public Double getExemptionPriority() {
        return exemptionPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("exemptionPriority")
    public void setExemptionPriority(Double exemptionPriority) {
        this.exemptionPriority = exemptionPriority;
    }

    public Tbbestu withExemptionPriority(Double exemptionPriority) {
        this.exemptionPriority = exemptionPriority;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBESTU_TERM_CODE, Lookup lineage reference object : stvterm
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
     * Lineage reference object : TBBESTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Tbbestu withTermCode(String termCode) {
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

    public Tbbestu withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbestu.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exemptionCode");
        sb.append('=');
        sb.append(((this.exemptionCode == null)?"<null>":this.exemptionCode));
        sb.append(',');
        sb.append("delInd");
        sb.append('=');
        sb.append(((this.delInd == null)?"<null>":this.delInd));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("studentExptRollInd");
        sb.append('=');
        sb.append(((this.studentExptRollInd == null)?"<null>":this.studentExptRollInd));
        sb.append(',');
        sb.append("maxStudentAmount");
        sb.append('=');
        sb.append(((this.maxStudentAmount == null)?"<null>":this.maxStudentAmount));
        sb.append(',');
        sb.append("tbbexptDesc");
        sb.append('=');
        sb.append(((this.tbbexptDesc == null)?"<null>":this.tbbexptDesc));
        sb.append(',');
        sb.append("exemptionPriority");
        sb.append('=');
        sb.append(((this.exemptionPriority == null)?"<null>":this.exemptionPriority));
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
        result = ((result* 31)+((this.exemptionCode == null)? 0 :this.exemptionCode.hashCode()));
        result = ((result* 31)+((this.delInd == null)? 0 :this.delInd.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.studentExptRollInd == null)? 0 :this.studentExptRollInd.hashCode()));
        result = ((result* 31)+((this.maxStudentAmount == null)? 0 :this.maxStudentAmount.hashCode()));
        result = ((result* 31)+((this.tbbexptDesc == null)? 0 :this.tbbexptDesc.hashCode()));
        result = ((result* 31)+((this.exemptionPriority == null)? 0 :this.exemptionPriority.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbbestu) == false) {
            return false;
        }
        Tbbestu rhs = ((Tbbestu) other);
        return ((((((((((this.exemptionCode == rhs.exemptionCode)||((this.exemptionCode!= null)&&this.exemptionCode.equals(rhs.exemptionCode)))&&((this.delInd == rhs.delInd)||((this.delInd!= null)&&this.delInd.equals(rhs.delInd))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.studentExptRollInd == rhs.studentExptRollInd)||((this.studentExptRollInd!= null)&&this.studentExptRollInd.equals(rhs.studentExptRollInd))))&&((this.maxStudentAmount == rhs.maxStudentAmount)||((this.maxStudentAmount!= null)&&this.maxStudentAmount.equals(rhs.maxStudentAmount))))&&((this.tbbexptDesc == rhs.tbbexptDesc)||((this.tbbexptDesc!= null)&&this.tbbexptDesc.equals(rhs.tbbexptDesc))))&&((this.exemptionPriority == rhs.exemptionPriority)||((this.exemptionPriority!= null)&&this.exemptionPriority.equals(rhs.exemptionPriority))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
