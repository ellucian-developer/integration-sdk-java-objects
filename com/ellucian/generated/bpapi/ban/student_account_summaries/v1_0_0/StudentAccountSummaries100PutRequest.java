
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
    "criteria.deliDesc",
    "criteria.authNumber",
    "tbbcstuStspKeySequence",
    "tbbcstuDelInd",
    "criteria.contractNumber",
    "criteria.tbbcstuDelInd",
    "tbbcstuMaxStudentAmount",
    "criteria.colcId",
    "studentContRollInd",
    "criteria.studentContRollInd",
    "criteria.termCode",
    "contractPriority",
    "contId",
    "criteria.authInd",
    "criteria.contId",
    "id",
    "criteria.tbbcstuStspKeySequence",
    "criteria.billCode",
    "criteria.maxStudentAmount",
    "exemptionCode",
    "colcId",
    "criteria.deliCode",
    "authInd",
    "criteria.exemptionCode",
    "stspKeySequence",
    "tbbcstuTermCode",
    "refundInd",
    "criteria.exemptionPriority",
    "contractNumber",
    "billCode",
    "criteria.contractPriority",
    "criteria.studentExptRollInd",
    "exemptionPriority",
    "criteria.stspKeySequence",
    "criteria.delInd",
    "delInd",
    "studentExptRollInd",
    "criteria.billCodeDesc",
    "deliCode",
    "criteria.tbbcstuMaxStudentAmount",
    "criteria.refundInd",
    "maxStudentAmount",
    "authNumber",
    "criteria.tbbcstuTermCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class StudentAccountSummaries100PutRequest {

    @JsonProperty("criteria.deliDesc")
    private String criteriaDeliDesc;
    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("criteria.authNumber")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_AUTH_NUMBER")
    private String criteriaAuthNumber;
    /**
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("tbbcstuStspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE")
    private Double tbbcstuStspKeySequence;
    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("tbbcstuDelInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_DEL_IND")
    private String tbbcstuDelInd;
    /**
     * Number
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("criteria.contractNumber")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_CONTRACT_NUMBER")
    private Double criteriaContractNumber;
    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuDelInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_DEL_IND")
    private String criteriaTbbcstuDelInd;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("tbbcstuMaxStudentAmount")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT")
    private Double tbbcstuMaxStudentAmount;
    /**
     * Agency ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.colcId")
    private String criteriaColcId;
    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("studentContRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND")
    private String studentContRollInd;
    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentContRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND")
    private String criteriaStudentContRollInd;
    /**
     * Term
     * <p>
     * Lineage reference object : TBBESTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTermCode;
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
     * ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("contId")
    private String contId;
    /**
     * Authorization
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("criteria.authInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_AUTH_IND")
    private String criteriaAuthInd;
    /**
     * ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.contId")
    private String criteriaContId;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.tbbcstuStspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE")
    private Double criteriaTbbcstuStspKeySequence;
    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("criteria.billCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill")
    private String criteriaBillCode;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("criteria.maxStudentAmount")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT")
    private Double criteriaMaxStudentAmount;
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
     * Agency ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("colcId")
    private String colcId;
    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("criteria.deliCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli")
    private String criteriaDeliCode;
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
     * Code
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.exemptionCode")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_EXEMPTION_CODE")
    private String criteriaExemptionCode;
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
     * Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("tbbcstuTermCode")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm")
    private String tbbcstuTermCode;
    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_REFUND_IND")
    private String refundInd;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.exemptionPriority")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_EXEMPTION_PRIORITY")
    private Double criteriaExemptionPriority;
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
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill")
    private String billCode;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.contractPriority")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_CONTRACT_PRIORITY")
    private Double criteriaContractPriority;
    /**
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentExptRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND")
    private String criteriaStudentExptRollInd;
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
     * Study Path
     * <p>
     * Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE")
    private Double criteriaStspKeySequence;
    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBESTU_DEL_IND
     * 
     */
    @JsonProperty("criteria.delInd")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_DEL_IND")
    private String criteriaDelInd;
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
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND")
    private String studentExptRollInd;
    @JsonProperty("criteria.billCodeDesc")
    private String criteriaBillCodeDesc;
    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("deliCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli")
    private String deliCode;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("criteria.tbbcstuMaxStudentAmount")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT")
    private Double criteriaTbbcstuMaxStudentAmount;
    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("criteria.refundInd")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_REFUND_IND")
    private String criteriaRefundInd;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT")
    private Double maxStudentAmount;
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
     * Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbbcstuTermCode")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTbbcstuTermCode;
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

    @JsonProperty("criteria.deliDesc")
    public String getCriteriaDeliDesc() {
        return criteriaDeliDesc;
    }

    @JsonProperty("criteria.deliDesc")
    public void setCriteriaDeliDesc(String criteriaDeliDesc) {
        this.criteriaDeliDesc = criteriaDeliDesc;
    }

    public StudentAccountSummaries100PutRequest withCriteriaDeliDesc(String criteriaDeliDesc) {
        this.criteriaDeliDesc = criteriaDeliDesc;
        return this;
    }

    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("criteria.authNumber")
    public String getCriteriaAuthNumber() {
        return criteriaAuthNumber;
    }

    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("criteria.authNumber")
    public void setCriteriaAuthNumber(String criteriaAuthNumber) {
        this.criteriaAuthNumber = criteriaAuthNumber;
    }

    public StudentAccountSummaries100PutRequest withCriteriaAuthNumber(String criteriaAuthNumber) {
        this.criteriaAuthNumber = criteriaAuthNumber;
        return this;
    }

    /**
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("tbbcstuStspKeySequence")
    public Double getTbbcstuStspKeySequence() {
        return tbbcstuStspKeySequence;
    }

    /**
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("tbbcstuStspKeySequence")
    public void setTbbcstuStspKeySequence(Double tbbcstuStspKeySequence) {
        this.tbbcstuStspKeySequence = tbbcstuStspKeySequence;
    }

    public StudentAccountSummaries100PutRequest withTbbcstuStspKeySequence(Double tbbcstuStspKeySequence) {
        this.tbbcstuStspKeySequence = tbbcstuStspKeySequence;
        return this;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("tbbcstuDelInd")
    public String getTbbcstuDelInd() {
        return tbbcstuDelInd;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("tbbcstuDelInd")
    public void setTbbcstuDelInd(String tbbcstuDelInd) {
        this.tbbcstuDelInd = tbbcstuDelInd;
    }

    public StudentAccountSummaries100PutRequest withTbbcstuDelInd(String tbbcstuDelInd) {
        this.tbbcstuDelInd = tbbcstuDelInd;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("criteria.contractNumber")
    public Double getCriteriaContractNumber() {
        return criteriaContractNumber;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("criteria.contractNumber")
    public void setCriteriaContractNumber(Double criteriaContractNumber) {
        this.criteriaContractNumber = criteriaContractNumber;
    }

    public StudentAccountSummaries100PutRequest withCriteriaContractNumber(Double criteriaContractNumber) {
        this.criteriaContractNumber = criteriaContractNumber;
        return this;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuDelInd")
    public String getCriteriaTbbcstuDelInd() {
        return criteriaTbbcstuDelInd;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuDelInd")
    public void setCriteriaTbbcstuDelInd(String criteriaTbbcstuDelInd) {
        this.criteriaTbbcstuDelInd = criteriaTbbcstuDelInd;
    }

    public StudentAccountSummaries100PutRequest withCriteriaTbbcstuDelInd(String criteriaTbbcstuDelInd) {
        this.criteriaTbbcstuDelInd = criteriaTbbcstuDelInd;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("tbbcstuMaxStudentAmount")
    public Double getTbbcstuMaxStudentAmount() {
        return tbbcstuMaxStudentAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("tbbcstuMaxStudentAmount")
    public void setTbbcstuMaxStudentAmount(Double tbbcstuMaxStudentAmount) {
        this.tbbcstuMaxStudentAmount = tbbcstuMaxStudentAmount;
    }

    public StudentAccountSummaries100PutRequest withTbbcstuMaxStudentAmount(Double tbbcstuMaxStudentAmount) {
        this.tbbcstuMaxStudentAmount = tbbcstuMaxStudentAmount;
        return this;
    }

    /**
     * Agency ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.colcId")
    public String getCriteriaColcId() {
        return criteriaColcId;
    }

    /**
     * Agency ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.colcId")
    public void setCriteriaColcId(String criteriaColcId) {
        this.criteriaColcId = criteriaColcId;
    }

    public StudentAccountSummaries100PutRequest withCriteriaColcId(String criteriaColcId) {
        this.criteriaColcId = criteriaColcId;
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

    public StudentAccountSummaries100PutRequest withStudentContRollInd(String studentContRollInd) {
        this.studentContRollInd = studentContRollInd;
        return this;
    }

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentContRollInd")
    public String getCriteriaStudentContRollInd() {
        return criteriaStudentContRollInd;
    }

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentContRollInd")
    public void setCriteriaStudentContRollInd(String criteriaStudentContRollInd) {
        this.criteriaStudentContRollInd = criteriaStudentContRollInd;
    }

    public StudentAccountSummaries100PutRequest withCriteriaStudentContRollInd(String criteriaStudentContRollInd) {
        this.criteriaStudentContRollInd = criteriaStudentContRollInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBESTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBESTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public StudentAccountSummaries100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

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

    public StudentAccountSummaries100PutRequest withContractPriority(Double contractPriority) {
        this.contractPriority = contractPriority;
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

    public StudentAccountSummaries100PutRequest withContId(String contId) {
        this.contId = contId;
        return this;
    }

    /**
     * Authorization
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("criteria.authInd")
    public String getCriteriaAuthInd() {
        return criteriaAuthInd;
    }

    /**
     * Authorization
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("criteria.authInd")
    public void setCriteriaAuthInd(String criteriaAuthInd) {
        this.criteriaAuthInd = criteriaAuthInd;
    }

    public StudentAccountSummaries100PutRequest withCriteriaAuthInd(String criteriaAuthInd) {
        this.criteriaAuthInd = criteriaAuthInd;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.contId")
    public String getCriteriaContId() {
        return criteriaContId;
    }

    /**
     * ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("criteria.contId")
    public void setCriteriaContId(String criteriaContId) {
        this.criteriaContId = criteriaContId;
    }

    public StudentAccountSummaries100PutRequest withCriteriaContId(String criteriaContId) {
        this.criteriaContId = criteriaContId;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public StudentAccountSummaries100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.tbbcstuStspKeySequence")
    public Double getCriteriaTbbcstuStspKeySequence() {
        return criteriaTbbcstuStspKeySequence;
    }

    /**
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.tbbcstuStspKeySequence")
    public void setCriteriaTbbcstuStspKeySequence(Double criteriaTbbcstuStspKeySequence) {
        this.criteriaTbbcstuStspKeySequence = criteriaTbbcstuStspKeySequence;
    }

    public StudentAccountSummaries100PutRequest withCriteriaTbbcstuStspKeySequence(Double criteriaTbbcstuStspKeySequence) {
        this.criteriaTbbcstuStspKeySequence = criteriaTbbcstuStspKeySequence;
        return this;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("criteria.billCode")
    public String getCriteriaBillCode() {
        return criteriaBillCode;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("criteria.billCode")
    public void setCriteriaBillCode(String criteriaBillCode) {
        this.criteriaBillCode = criteriaBillCode;
    }

    public StudentAccountSummaries100PutRequest withCriteriaBillCode(String criteriaBillCode) {
        this.criteriaBillCode = criteriaBillCode;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("criteria.maxStudentAmount")
    public Double getCriteriaMaxStudentAmount() {
        return criteriaMaxStudentAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("criteria.maxStudentAmount")
    public void setCriteriaMaxStudentAmount(Double criteriaMaxStudentAmount) {
        this.criteriaMaxStudentAmount = criteriaMaxStudentAmount;
    }

    public StudentAccountSummaries100PutRequest withCriteriaMaxStudentAmount(Double criteriaMaxStudentAmount) {
        this.criteriaMaxStudentAmount = criteriaMaxStudentAmount;
        return this;
    }

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

    public StudentAccountSummaries100PutRequest withExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
        return this;
    }

    /**
     * Agency ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("colcId")
    public String getColcId() {
        return colcId;
    }

    /**
     * Agency ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("colcId")
    public void setColcId(String colcId) {
        this.colcId = colcId;
    }

    public StudentAccountSummaries100PutRequest withColcId(String colcId) {
        this.colcId = colcId;
        return this;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("criteria.deliCode")
    public String getCriteriaDeliCode() {
        return criteriaDeliCode;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("criteria.deliCode")
    public void setCriteriaDeliCode(String criteriaDeliCode) {
        this.criteriaDeliCode = criteriaDeliCode;
    }

    public StudentAccountSummaries100PutRequest withCriteriaDeliCode(String criteriaDeliCode) {
        this.criteriaDeliCode = criteriaDeliCode;
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

    public StudentAccountSummaries100PutRequest withAuthInd(String authInd) {
        this.authInd = authInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.exemptionCode")
    public String getCriteriaExemptionCode() {
        return criteriaExemptionCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.exemptionCode")
    public void setCriteriaExemptionCode(String criteriaExemptionCode) {
        this.criteriaExemptionCode = criteriaExemptionCode;
    }

    public StudentAccountSummaries100PutRequest withCriteriaExemptionCode(String criteriaExemptionCode) {
        this.criteriaExemptionCode = criteriaExemptionCode;
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

    public StudentAccountSummaries100PutRequest withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("tbbcstuTermCode")
    public String getTbbcstuTermCode() {
        return tbbcstuTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("tbbcstuTermCode")
    public void setTbbcstuTermCode(String tbbcstuTermCode) {
        this.tbbcstuTermCode = tbbcstuTermCode;
    }

    public StudentAccountSummaries100PutRequest withTbbcstuTermCode(String tbbcstuTermCode) {
        this.tbbcstuTermCode = tbbcstuTermCode;
        return this;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public StudentAccountSummaries100PutRequest withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.exemptionPriority")
    public Double getCriteriaExemptionPriority() {
        return criteriaExemptionPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.exemptionPriority")
    public void setCriteriaExemptionPriority(Double criteriaExemptionPriority) {
        this.criteriaExemptionPriority = criteriaExemptionPriority;
    }

    public StudentAccountSummaries100PutRequest withCriteriaExemptionPriority(Double criteriaExemptionPriority) {
        this.criteriaExemptionPriority = criteriaExemptionPriority;
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

    public StudentAccountSummaries100PutRequest withContractNumber(Double contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    public String getBillCode() {
        return billCode;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public StudentAccountSummaries100PutRequest withBillCode(String billCode) {
        this.billCode = billCode;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.contractPriority")
    public Double getCriteriaContractPriority() {
        return criteriaContractPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.contractPriority")
    public void setCriteriaContractPriority(Double criteriaContractPriority) {
        this.criteriaContractPriority = criteriaContractPriority;
    }

    public StudentAccountSummaries100PutRequest withCriteriaContractPriority(Double criteriaContractPriority) {
        this.criteriaContractPriority = criteriaContractPriority;
        return this;
    }

    /**
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentExptRollInd")
    public String getCriteriaStudentExptRollInd() {
        return criteriaStudentExptRollInd;
    }

    /**
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentExptRollInd")
    public void setCriteriaStudentExptRollInd(String criteriaStudentExptRollInd) {
        this.criteriaStudentExptRollInd = criteriaStudentExptRollInd;
    }

    public StudentAccountSummaries100PutRequest withCriteriaStudentExptRollInd(String criteriaStudentExptRollInd) {
        this.criteriaStudentExptRollInd = criteriaStudentExptRollInd;
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

    public StudentAccountSummaries100PutRequest withExemptionPriority(Double exemptionPriority) {
        this.exemptionPriority = exemptionPriority;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public Double getCriteriaStspKeySequence() {
        return criteriaStspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.stspKeySequence")
    public void setCriteriaStspKeySequence(Double criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
    }

    public StudentAccountSummaries100PutRequest withCriteriaStspKeySequence(Double criteriaStspKeySequence) {
        this.criteriaStspKeySequence = criteriaStspKeySequence;
        return this;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBESTU_DEL_IND
     * 
     */
    @JsonProperty("criteria.delInd")
    public String getCriteriaDelInd() {
        return criteriaDelInd;
    }

    /**
     * Delete Indicator
     * <p>
     * Lineage reference object : TBBESTU_DEL_IND
     * 
     */
    @JsonProperty("criteria.delInd")
    public void setCriteriaDelInd(String criteriaDelInd) {
        this.criteriaDelInd = criteriaDelInd;
    }

    public StudentAccountSummaries100PutRequest withCriteriaDelInd(String criteriaDelInd) {
        this.criteriaDelInd = criteriaDelInd;
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

    public StudentAccountSummaries100PutRequest withDelInd(String delInd) {
        this.delInd = delInd;
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

    public StudentAccountSummaries100PutRequest withStudentExptRollInd(String studentExptRollInd) {
        this.studentExptRollInd = studentExptRollInd;
        return this;
    }

    @JsonProperty("criteria.billCodeDesc")
    public String getCriteriaBillCodeDesc() {
        return criteriaBillCodeDesc;
    }

    @JsonProperty("criteria.billCodeDesc")
    public void setCriteriaBillCodeDesc(String criteriaBillCodeDesc) {
        this.criteriaBillCodeDesc = criteriaBillCodeDesc;
    }

    public StudentAccountSummaries100PutRequest withCriteriaBillCodeDesc(String criteriaBillCodeDesc) {
        this.criteriaBillCodeDesc = criteriaBillCodeDesc;
        return this;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("deliCode")
    public String getDeliCode() {
        return deliCode;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("deliCode")
    public void setDeliCode(String deliCode) {
        this.deliCode = deliCode;
    }

    public StudentAccountSummaries100PutRequest withDeliCode(String deliCode) {
        this.deliCode = deliCode;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("criteria.tbbcstuMaxStudentAmount")
    public Double getCriteriaTbbcstuMaxStudentAmount() {
        return criteriaTbbcstuMaxStudentAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("criteria.tbbcstuMaxStudentAmount")
    public void setCriteriaTbbcstuMaxStudentAmount(Double criteriaTbbcstuMaxStudentAmount) {
        this.criteriaTbbcstuMaxStudentAmount = criteriaTbbcstuMaxStudentAmount;
    }

    public StudentAccountSummaries100PutRequest withCriteriaTbbcstuMaxStudentAmount(Double criteriaTbbcstuMaxStudentAmount) {
        this.criteriaTbbcstuMaxStudentAmount = criteriaTbbcstuMaxStudentAmount;
        return this;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("criteria.refundInd")
    public String getCriteriaRefundInd() {
        return criteriaRefundInd;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("criteria.refundInd")
    public void setCriteriaRefundInd(String criteriaRefundInd) {
        this.criteriaRefundInd = criteriaRefundInd;
    }

    public StudentAccountSummaries100PutRequest withCriteriaRefundInd(String criteriaRefundInd) {
        this.criteriaRefundInd = criteriaRefundInd;
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

    public StudentAccountSummaries100PutRequest withMaxStudentAmount(Double maxStudentAmount) {
        this.maxStudentAmount = maxStudentAmount;
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

    public StudentAccountSummaries100PutRequest withAuthNumber(String authNumber) {
        this.authNumber = authNumber;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbbcstuTermCode")
    public String getCriteriaTbbcstuTermCode() {
        return criteriaTbbcstuTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbbcstuTermCode")
    public void setCriteriaTbbcstuTermCode(String criteriaTbbcstuTermCode) {
        this.criteriaTbbcstuTermCode = criteriaTbbcstuTermCode;
    }

    public StudentAccountSummaries100PutRequest withCriteriaTbbcstuTermCode(String criteriaTbbcstuTermCode) {
        this.criteriaTbbcstuTermCode = criteriaTbbcstuTermCode;
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

    public StudentAccountSummaries100PutRequest withTermCode(String termCode) {
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

    public StudentAccountSummaries100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountSummaries100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaDeliDesc");
        sb.append('=');
        sb.append(((this.criteriaDeliDesc == null)?"<null>":this.criteriaDeliDesc));
        sb.append(',');
        sb.append("criteriaAuthNumber");
        sb.append('=');
        sb.append(((this.criteriaAuthNumber == null)?"<null>":this.criteriaAuthNumber));
        sb.append(',');
        sb.append("tbbcstuStspKeySequence");
        sb.append('=');
        sb.append(((this.tbbcstuStspKeySequence == null)?"<null>":this.tbbcstuStspKeySequence));
        sb.append(',');
        sb.append("tbbcstuDelInd");
        sb.append('=');
        sb.append(((this.tbbcstuDelInd == null)?"<null>":this.tbbcstuDelInd));
        sb.append(',');
        sb.append("criteriaContractNumber");
        sb.append('=');
        sb.append(((this.criteriaContractNumber == null)?"<null>":this.criteriaContractNumber));
        sb.append(',');
        sb.append("criteriaTbbcstuDelInd");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuDelInd == null)?"<null>":this.criteriaTbbcstuDelInd));
        sb.append(',');
        sb.append("tbbcstuMaxStudentAmount");
        sb.append('=');
        sb.append(((this.tbbcstuMaxStudentAmount == null)?"<null>":this.tbbcstuMaxStudentAmount));
        sb.append(',');
        sb.append("criteriaColcId");
        sb.append('=');
        sb.append(((this.criteriaColcId == null)?"<null>":this.criteriaColcId));
        sb.append(',');
        sb.append("studentContRollInd");
        sb.append('=');
        sb.append(((this.studentContRollInd == null)?"<null>":this.studentContRollInd));
        sb.append(',');
        sb.append("criteriaStudentContRollInd");
        sb.append('=');
        sb.append(((this.criteriaStudentContRollInd == null)?"<null>":this.criteriaStudentContRollInd));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("contractPriority");
        sb.append('=');
        sb.append(((this.contractPriority == null)?"<null>":this.contractPriority));
        sb.append(',');
        sb.append("contId");
        sb.append('=');
        sb.append(((this.contId == null)?"<null>":this.contId));
        sb.append(',');
        sb.append("criteriaAuthInd");
        sb.append('=');
        sb.append(((this.criteriaAuthInd == null)?"<null>":this.criteriaAuthInd));
        sb.append(',');
        sb.append("criteriaContId");
        sb.append('=');
        sb.append(((this.criteriaContId == null)?"<null>":this.criteriaContId));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaTbbcstuStspKeySequence");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuStspKeySequence == null)?"<null>":this.criteriaTbbcstuStspKeySequence));
        sb.append(',');
        sb.append("criteriaBillCode");
        sb.append('=');
        sb.append(((this.criteriaBillCode == null)?"<null>":this.criteriaBillCode));
        sb.append(',');
        sb.append("criteriaMaxStudentAmount");
        sb.append('=');
        sb.append(((this.criteriaMaxStudentAmount == null)?"<null>":this.criteriaMaxStudentAmount));
        sb.append(',');
        sb.append("exemptionCode");
        sb.append('=');
        sb.append(((this.exemptionCode == null)?"<null>":this.exemptionCode));
        sb.append(',');
        sb.append("colcId");
        sb.append('=');
        sb.append(((this.colcId == null)?"<null>":this.colcId));
        sb.append(',');
        sb.append("criteriaDeliCode");
        sb.append('=');
        sb.append(((this.criteriaDeliCode == null)?"<null>":this.criteriaDeliCode));
        sb.append(',');
        sb.append("authInd");
        sb.append('=');
        sb.append(((this.authInd == null)?"<null>":this.authInd));
        sb.append(',');
        sb.append("criteriaExemptionCode");
        sb.append('=');
        sb.append(((this.criteriaExemptionCode == null)?"<null>":this.criteriaExemptionCode));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("tbbcstuTermCode");
        sb.append('=');
        sb.append(((this.tbbcstuTermCode == null)?"<null>":this.tbbcstuTermCode));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("criteriaExemptionPriority");
        sb.append('=');
        sb.append(((this.criteriaExemptionPriority == null)?"<null>":this.criteriaExemptionPriority));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("billCode");
        sb.append('=');
        sb.append(((this.billCode == null)?"<null>":this.billCode));
        sb.append(',');
        sb.append("criteriaContractPriority");
        sb.append('=');
        sb.append(((this.criteriaContractPriority == null)?"<null>":this.criteriaContractPriority));
        sb.append(',');
        sb.append("criteriaStudentExptRollInd");
        sb.append('=');
        sb.append(((this.criteriaStudentExptRollInd == null)?"<null>":this.criteriaStudentExptRollInd));
        sb.append(',');
        sb.append("exemptionPriority");
        sb.append('=');
        sb.append(((this.exemptionPriority == null)?"<null>":this.exemptionPriority));
        sb.append(',');
        sb.append("criteriaStspKeySequence");
        sb.append('=');
        sb.append(((this.criteriaStspKeySequence == null)?"<null>":this.criteriaStspKeySequence));
        sb.append(',');
        sb.append("criteriaDelInd");
        sb.append('=');
        sb.append(((this.criteriaDelInd == null)?"<null>":this.criteriaDelInd));
        sb.append(',');
        sb.append("delInd");
        sb.append('=');
        sb.append(((this.delInd == null)?"<null>":this.delInd));
        sb.append(',');
        sb.append("studentExptRollInd");
        sb.append('=');
        sb.append(((this.studentExptRollInd == null)?"<null>":this.studentExptRollInd));
        sb.append(',');
        sb.append("criteriaBillCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaBillCodeDesc == null)?"<null>":this.criteriaBillCodeDesc));
        sb.append(',');
        sb.append("deliCode");
        sb.append('=');
        sb.append(((this.deliCode == null)?"<null>":this.deliCode));
        sb.append(',');
        sb.append("criteriaTbbcstuMaxStudentAmount");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuMaxStudentAmount == null)?"<null>":this.criteriaTbbcstuMaxStudentAmount));
        sb.append(',');
        sb.append("criteriaRefundInd");
        sb.append('=');
        sb.append(((this.criteriaRefundInd == null)?"<null>":this.criteriaRefundInd));
        sb.append(',');
        sb.append("maxStudentAmount");
        sb.append('=');
        sb.append(((this.maxStudentAmount == null)?"<null>":this.maxStudentAmount));
        sb.append(',');
        sb.append("authNumber");
        sb.append('=');
        sb.append(((this.authNumber == null)?"<null>":this.authNumber));
        sb.append(',');
        sb.append("criteriaTbbcstuTermCode");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuTermCode == null)?"<null>":this.criteriaTbbcstuTermCode));
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
        result = ((result* 31)+((this.criteriaDeliCode == null)? 0 :this.criteriaDeliCode.hashCode()));
        result = ((result* 31)+((this.criteriaStspKeySequence == null)? 0 :this.criteriaStspKeySequence.hashCode()));
        result = ((result* 31)+((this.tbbcstuStspKeySequence == null)? 0 :this.tbbcstuStspKeySequence.hashCode()));
        result = ((result* 31)+((this.tbbcstuDelInd == null)? 0 :this.tbbcstuDelInd.hashCode()));
        result = ((result* 31)+((this.criteriaContractPriority == null)? 0 :this.criteriaContractPriority.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuTermCode == null)? 0 :this.criteriaTbbcstuTermCode.hashCode()));
        result = ((result* 31)+((this.tbbcstuMaxStudentAmount == null)? 0 :this.tbbcstuMaxStudentAmount.hashCode()));
        result = ((result* 31)+((this.studentContRollInd == null)? 0 :this.studentContRollInd.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuDelInd == null)? 0 :this.criteriaTbbcstuDelInd.hashCode()));
        result = ((result* 31)+((this.criteriaStudentContRollInd == null)? 0 :this.criteriaStudentContRollInd.hashCode()));
        result = ((result* 31)+((this.criteriaMaxStudentAmount == null)? 0 :this.criteriaMaxStudentAmount.hashCode()));
        result = ((result* 31)+((this.contractPriority == null)? 0 :this.contractPriority.hashCode()));
        result = ((result* 31)+((this.contId == null)? 0 :this.contId.hashCode()));
        result = ((result* 31)+((this.criteriaContractNumber == null)? 0 :this.criteriaContractNumber.hashCode()));
        result = ((result* 31)+((this.criteriaColcId == null)? 0 :this.criteriaColcId.hashCode()));
        result = ((result* 31)+((this.criteriaBillCode == null)? 0 :this.criteriaBillCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuMaxStudentAmount == null)? 0 :this.criteriaTbbcstuMaxStudentAmount.hashCode()));
        result = ((result* 31)+((this.criteriaRefundInd == null)? 0 :this.criteriaRefundInd.hashCode()));
        result = ((result* 31)+((this.exemptionCode == null)? 0 :this.exemptionCode.hashCode()));
        result = ((result* 31)+((this.colcId == null)? 0 :this.colcId.hashCode()));
        result = ((result* 31)+((this.authInd == null)? 0 :this.authInd.hashCode()));
        result = ((result* 31)+((this.criteriaDelInd == null)? 0 :this.criteriaDelInd.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.criteriaExemptionPriority == null)? 0 :this.criteriaExemptionPriority.hashCode()));
        result = ((result* 31)+((this.criteriaAuthInd == null)? 0 :this.criteriaAuthInd.hashCode()));
        result = ((result* 31)+((this.criteriaDeliDesc == null)? 0 :this.criteriaDeliDesc.hashCode()));
        result = ((result* 31)+((this.criteriaContId == null)? 0 :this.criteriaContId.hashCode()));
        result = ((result* 31)+((this.tbbcstuTermCode == null)? 0 :this.tbbcstuTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.billCode == null)? 0 :this.billCode.hashCode()));
        result = ((result* 31)+((this.criteriaBillCodeDesc == null)? 0 :this.criteriaBillCodeDesc.hashCode()));
        result = ((result* 31)+((this.exemptionPriority == null)? 0 :this.exemptionPriority.hashCode()));
        result = ((result* 31)+((this.criteriaStudentExptRollInd == null)? 0 :this.criteriaStudentExptRollInd.hashCode()));
        result = ((result* 31)+((this.delInd == null)? 0 :this.delInd.hashCode()));
        result = ((result* 31)+((this.studentExptRollInd == null)? 0 :this.studentExptRollInd.hashCode()));
        result = ((result* 31)+((this.deliCode == null)? 0 :this.deliCode.hashCode()));
        result = ((result* 31)+((this.maxStudentAmount == null)? 0 :this.maxStudentAmount.hashCode()));
        result = ((result* 31)+((this.criteriaAuthNumber == null)? 0 :this.criteriaAuthNumber.hashCode()));
        result = ((result* 31)+((this.authNumber == null)? 0 :this.authNumber.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuStspKeySequence == null)? 0 :this.criteriaTbbcstuStspKeySequence.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaExemptionCode == null)? 0 :this.criteriaExemptionCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountSummaries100PutRequest) == false) {
            return false;
        }
        StudentAccountSummaries100PutRequest rhs = ((StudentAccountSummaries100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((this.criteriaDeliCode == rhs.criteriaDeliCode)||((this.criteriaDeliCode!= null)&&this.criteriaDeliCode.equals(rhs.criteriaDeliCode)))&&((this.criteriaStspKeySequence == rhs.criteriaStspKeySequence)||((this.criteriaStspKeySequence!= null)&&this.criteriaStspKeySequence.equals(rhs.criteriaStspKeySequence))))&&((this.tbbcstuStspKeySequence == rhs.tbbcstuStspKeySequence)||((this.tbbcstuStspKeySequence!= null)&&this.tbbcstuStspKeySequence.equals(rhs.tbbcstuStspKeySequence))))&&((this.tbbcstuDelInd == rhs.tbbcstuDelInd)||((this.tbbcstuDelInd!= null)&&this.tbbcstuDelInd.equals(rhs.tbbcstuDelInd))))&&((this.criteriaContractPriority == rhs.criteriaContractPriority)||((this.criteriaContractPriority!= null)&&this.criteriaContractPriority.equals(rhs.criteriaContractPriority))))&&((this.criteriaTbbcstuTermCode == rhs.criteriaTbbcstuTermCode)||((this.criteriaTbbcstuTermCode!= null)&&this.criteriaTbbcstuTermCode.equals(rhs.criteriaTbbcstuTermCode))))&&((this.tbbcstuMaxStudentAmount == rhs.tbbcstuMaxStudentAmount)||((this.tbbcstuMaxStudentAmount!= null)&&this.tbbcstuMaxStudentAmount.equals(rhs.tbbcstuMaxStudentAmount))))&&((this.studentContRollInd == rhs.studentContRollInd)||((this.studentContRollInd!= null)&&this.studentContRollInd.equals(rhs.studentContRollInd))))&&((this.criteriaTbbcstuDelInd == rhs.criteriaTbbcstuDelInd)||((this.criteriaTbbcstuDelInd!= null)&&this.criteriaTbbcstuDelInd.equals(rhs.criteriaTbbcstuDelInd))))&&((this.criteriaStudentContRollInd == rhs.criteriaStudentContRollInd)||((this.criteriaStudentContRollInd!= null)&&this.criteriaStudentContRollInd.equals(rhs.criteriaStudentContRollInd))))&&((this.criteriaMaxStudentAmount == rhs.criteriaMaxStudentAmount)||((this.criteriaMaxStudentAmount!= null)&&this.criteriaMaxStudentAmount.equals(rhs.criteriaMaxStudentAmount))))&&((this.contractPriority == rhs.contractPriority)||((this.contractPriority!= null)&&this.contractPriority.equals(rhs.contractPriority))))&&((this.contId == rhs.contId)||((this.contId!= null)&&this.contId.equals(rhs.contId))))&&((this.criteriaContractNumber == rhs.criteriaContractNumber)||((this.criteriaContractNumber!= null)&&this.criteriaContractNumber.equals(rhs.criteriaContractNumber))))&&((this.criteriaColcId == rhs.criteriaColcId)||((this.criteriaColcId!= null)&&this.criteriaColcId.equals(rhs.criteriaColcId))))&&((this.criteriaBillCode == rhs.criteriaBillCode)||((this.criteriaBillCode!= null)&&this.criteriaBillCode.equals(rhs.criteriaBillCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaTbbcstuMaxStudentAmount == rhs.criteriaTbbcstuMaxStudentAmount)||((this.criteriaTbbcstuMaxStudentAmount!= null)&&this.criteriaTbbcstuMaxStudentAmount.equals(rhs.criteriaTbbcstuMaxStudentAmount))))&&((this.criteriaRefundInd == rhs.criteriaRefundInd)||((this.criteriaRefundInd!= null)&&this.criteriaRefundInd.equals(rhs.criteriaRefundInd))))&&((this.exemptionCode == rhs.exemptionCode)||((this.exemptionCode!= null)&&this.exemptionCode.equals(rhs.exemptionCode))))&&((this.colcId == rhs.colcId)||((this.colcId!= null)&&this.colcId.equals(rhs.colcId))))&&((this.authInd == rhs.authInd)||((this.authInd!= null)&&this.authInd.equals(rhs.authInd))))&&((this.criteriaDelInd == rhs.criteriaDelInd)||((this.criteriaDelInd!= null)&&this.criteriaDelInd.equals(rhs.criteriaDelInd))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.criteriaExemptionPriority == rhs.criteriaExemptionPriority)||((this.criteriaExemptionPriority!= null)&&this.criteriaExemptionPriority.equals(rhs.criteriaExemptionPriority))))&&((this.criteriaAuthInd == rhs.criteriaAuthInd)||((this.criteriaAuthInd!= null)&&this.criteriaAuthInd.equals(rhs.criteriaAuthInd))))&&((this.criteriaDeliDesc == rhs.criteriaDeliDesc)||((this.criteriaDeliDesc!= null)&&this.criteriaDeliDesc.equals(rhs.criteriaDeliDesc))))&&((this.criteriaContId == rhs.criteriaContId)||((this.criteriaContId!= null)&&this.criteriaContId.equals(rhs.criteriaContId))))&&((this.tbbcstuTermCode == rhs.tbbcstuTermCode)||((this.tbbcstuTermCode!= null)&&this.tbbcstuTermCode.equals(rhs.tbbcstuTermCode))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.billCode == rhs.billCode)||((this.billCode!= null)&&this.billCode.equals(rhs.billCode))))&&((this.criteriaBillCodeDesc == rhs.criteriaBillCodeDesc)||((this.criteriaBillCodeDesc!= null)&&this.criteriaBillCodeDesc.equals(rhs.criteriaBillCodeDesc))))&&((this.exemptionPriority == rhs.exemptionPriority)||((this.exemptionPriority!= null)&&this.exemptionPriority.equals(rhs.exemptionPriority))))&&((this.criteriaStudentExptRollInd == rhs.criteriaStudentExptRollInd)||((this.criteriaStudentExptRollInd!= null)&&this.criteriaStudentExptRollInd.equals(rhs.criteriaStudentExptRollInd))))&&((this.delInd == rhs.delInd)||((this.delInd!= null)&&this.delInd.equals(rhs.delInd))))&&((this.studentExptRollInd == rhs.studentExptRollInd)||((this.studentExptRollInd!= null)&&this.studentExptRollInd.equals(rhs.studentExptRollInd))))&&((this.deliCode == rhs.deliCode)||((this.deliCode!= null)&&this.deliCode.equals(rhs.deliCode))))&&((this.maxStudentAmount == rhs.maxStudentAmount)||((this.maxStudentAmount!= null)&&this.maxStudentAmount.equals(rhs.maxStudentAmount))))&&((this.criteriaAuthNumber == rhs.criteriaAuthNumber)||((this.criteriaAuthNumber!= null)&&this.criteriaAuthNumber.equals(rhs.criteriaAuthNumber))))&&((this.authNumber == rhs.authNumber)||((this.authNumber!= null)&&this.authNumber.equals(rhs.authNumber))))&&((this.criteriaTbbcstuStspKeySequence == rhs.criteriaTbbcstuStspKeySequence)||((this.criteriaTbbcstuStspKeySequence!= null)&&this.criteriaTbbcstuStspKeySequence.equals(rhs.criteriaTbbcstuStspKeySequence))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaExemptionCode == rhs.criteriaExemptionCode)||((this.criteriaExemptionCode!= null)&&this.criteriaExemptionCode.equals(rhs.criteriaExemptionCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
