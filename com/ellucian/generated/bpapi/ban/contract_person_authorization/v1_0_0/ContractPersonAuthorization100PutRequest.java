
package com.ellucian.generated.bpapi.ban.contract_person_authorization.v1_0_0;

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
    "tbbcstuStudentContRollInd",
    "tbbcstuAuthInd",
    "criteria.studypathName",
    "keyblocTermCode",
    "criteria.tbbcstuDelInd",
    "criteria.tbbcstuStudentContRollInd",
    "criteria.tbbcstuSponsorRefNumber",
    "criteria.tbbcstuActivityDate",
    "contractNumber",
    "criteria.tbbcstuTermCodeExpiration",
    "criteria.tbbcstuAuthInd",
    "criteria.tbbcstuContractPriority",
    "criteria.stuId2",
    "criteria.stuName2",
    "stuId2",
    "criteria.tbbcstuMaxStudentAmount",
    "criteria.tbbcstuAuthNumber",
    "id",
    "criteria.tbbcstuStspKeySequence",
    "tbbcstuContractPriority",
    "criteria.additionalText2"
})
@Generated("jsonschema2pojo")
public class ContractPersonAuthorization100PutRequest {

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
    @JsonProperty("criteria.studypathName")
    private String criteriaStudypathName;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
    /**
     * Delete
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuDelInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_DEL_IND")
    private String criteriaTbbcstuDelInd;
    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuStudentContRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND")
    private String criteriaTbbcstuStudentContRollInd;
    /**
     * Sponsor Reference Number
     * <p>
     * Lineage reference object : TBBCSTU_SPONSOR_REF_NUMBER
     * 
     */
    @JsonProperty("criteria.tbbcstuSponsorRefNumber")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_SPONSOR_REF_NUMBER")
    private String criteriaTbbcstuSponsorRefNumber;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBCSTU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.tbbcstuActivityDate")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_ACTIVITY_DATE")
    private Date criteriaTbbcstuActivityDate;
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
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.tbbcstuTermCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String criteriaTbbcstuTermCodeExpiration;
    /**
     * Authorize
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuAuthInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_AUTH_IND")
    private String criteriaTbbcstuAuthInd;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbbcstuContractPriority")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_CONTRACT_PRIORITY")
    private Double criteriaTbbcstuContractPriority;
    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stuId2")
    private String criteriaStuId2;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stuName2")
    private String criteriaStuName2;
    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId2")
    private String stuId2;
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
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("criteria.tbbcstuAuthNumber")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_AUTH_NUMBER")
    private String criteriaTbbcstuAuthNumber;
    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.tbbcstuStspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE")
    private Double criteriaTbbcstuStspKeySequence;
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
    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.additionalText2")
    private String criteriaAdditionalText2;
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

    public ContractPersonAuthorization100PutRequest withTbbcstuStudentContRollInd(String tbbcstuStudentContRollInd) {
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

    public ContractPersonAuthorization100PutRequest withTbbcstuAuthInd(String tbbcstuAuthInd) {
        this.tbbcstuAuthInd = tbbcstuAuthInd;
        return this;
    }

    @JsonProperty("criteria.studypathName")
    public String getCriteriaStudypathName() {
        return criteriaStudypathName;
    }

    @JsonProperty("criteria.studypathName")
    public void setCriteriaStudypathName(String criteriaStudypathName) {
        this.criteriaStudypathName = criteriaStudypathName;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaStudypathName(String criteriaStudypathName) {
        this.criteriaStudypathName = criteriaStudypathName;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ContractPersonAuthorization100PutRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Delete
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuDelInd")
    public String getCriteriaTbbcstuDelInd() {
        return criteriaTbbcstuDelInd;
    }

    /**
     * Delete
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuDelInd")
    public void setCriteriaTbbcstuDelInd(String criteriaTbbcstuDelInd) {
        this.criteriaTbbcstuDelInd = criteriaTbbcstuDelInd;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuDelInd(String criteriaTbbcstuDelInd) {
        this.criteriaTbbcstuDelInd = criteriaTbbcstuDelInd;
        return this;
    }

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuStudentContRollInd")
    public String getCriteriaTbbcstuStudentContRollInd() {
        return criteriaTbbcstuStudentContRollInd;
    }

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuStudentContRollInd")
    public void setCriteriaTbbcstuStudentContRollInd(String criteriaTbbcstuStudentContRollInd) {
        this.criteriaTbbcstuStudentContRollInd = criteriaTbbcstuStudentContRollInd;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuStudentContRollInd(String criteriaTbbcstuStudentContRollInd) {
        this.criteriaTbbcstuStudentContRollInd = criteriaTbbcstuStudentContRollInd;
        return this;
    }

    /**
     * Sponsor Reference Number
     * <p>
     * Lineage reference object : TBBCSTU_SPONSOR_REF_NUMBER
     * 
     */
    @JsonProperty("criteria.tbbcstuSponsorRefNumber")
    public String getCriteriaTbbcstuSponsorRefNumber() {
        return criteriaTbbcstuSponsorRefNumber;
    }

    /**
     * Sponsor Reference Number
     * <p>
     * Lineage reference object : TBBCSTU_SPONSOR_REF_NUMBER
     * 
     */
    @JsonProperty("criteria.tbbcstuSponsorRefNumber")
    public void setCriteriaTbbcstuSponsorRefNumber(String criteriaTbbcstuSponsorRefNumber) {
        this.criteriaTbbcstuSponsorRefNumber = criteriaTbbcstuSponsorRefNumber;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuSponsorRefNumber(String criteriaTbbcstuSponsorRefNumber) {
        this.criteriaTbbcstuSponsorRefNumber = criteriaTbbcstuSponsorRefNumber;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBCSTU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.tbbcstuActivityDate")
    public Date getCriteriaTbbcstuActivityDate() {
        return criteriaTbbcstuActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBCSTU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.tbbcstuActivityDate")
    public void setCriteriaTbbcstuActivityDate(Date criteriaTbbcstuActivityDate) {
        this.criteriaTbbcstuActivityDate = criteriaTbbcstuActivityDate;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuActivityDate(Date criteriaTbbcstuActivityDate) {
        this.criteriaTbbcstuActivityDate = criteriaTbbcstuActivityDate;
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

    public ContractPersonAuthorization100PutRequest withContractNumber(Object contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.tbbcstuTermCodeExpiration")
    public String getCriteriaTbbcstuTermCodeExpiration() {
        return criteriaTbbcstuTermCodeExpiration;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.tbbcstuTermCodeExpiration")
    public void setCriteriaTbbcstuTermCodeExpiration(String criteriaTbbcstuTermCodeExpiration) {
        this.criteriaTbbcstuTermCodeExpiration = criteriaTbbcstuTermCodeExpiration;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuTermCodeExpiration(String criteriaTbbcstuTermCodeExpiration) {
        this.criteriaTbbcstuTermCodeExpiration = criteriaTbbcstuTermCodeExpiration;
        return this;
    }

    /**
     * Authorize
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuAuthInd")
    public String getCriteriaTbbcstuAuthInd() {
        return criteriaTbbcstuAuthInd;
    }

    /**
     * Authorize
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("criteria.tbbcstuAuthInd")
    public void setCriteriaTbbcstuAuthInd(String criteriaTbbcstuAuthInd) {
        this.criteriaTbbcstuAuthInd = criteriaTbbcstuAuthInd;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuAuthInd(String criteriaTbbcstuAuthInd) {
        this.criteriaTbbcstuAuthInd = criteriaTbbcstuAuthInd;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbbcstuContractPriority")
    public Double getCriteriaTbbcstuContractPriority() {
        return criteriaTbbcstuContractPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.tbbcstuContractPriority")
    public void setCriteriaTbbcstuContractPriority(Double criteriaTbbcstuContractPriority) {
        this.criteriaTbbcstuContractPriority = criteriaTbbcstuContractPriority;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuContractPriority(Double criteriaTbbcstuContractPriority) {
        this.criteriaTbbcstuContractPriority = criteriaTbbcstuContractPriority;
        return this;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stuId2")
    public String getCriteriaStuId2() {
        return criteriaStuId2;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stuId2")
    public void setCriteriaStuId2(String criteriaStuId2) {
        this.criteriaStuId2 = criteriaStuId2;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaStuId2(String criteriaStuId2) {
        this.criteriaStuId2 = criteriaStuId2;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stuName2")
    public String getCriteriaStuName2() {
        return criteriaStuName2;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stuName2")
    public void setCriteriaStuName2(String criteriaStuName2) {
        this.criteriaStuName2 = criteriaStuName2;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaStuName2(String criteriaStuName2) {
        this.criteriaStuName2 = criteriaStuName2;
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

    public ContractPersonAuthorization100PutRequest withStuId2(String stuId2) {
        this.stuId2 = stuId2;
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

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuMaxStudentAmount(Double criteriaTbbcstuMaxStudentAmount) {
        this.criteriaTbbcstuMaxStudentAmount = criteriaTbbcstuMaxStudentAmount;
        return this;
    }

    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("criteria.tbbcstuAuthNumber")
    public String getCriteriaTbbcstuAuthNumber() {
        return criteriaTbbcstuAuthNumber;
    }

    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("criteria.tbbcstuAuthNumber")
    public void setCriteriaTbbcstuAuthNumber(String criteriaTbbcstuAuthNumber) {
        this.criteriaTbbcstuAuthNumber = criteriaTbbcstuAuthNumber;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuAuthNumber(String criteriaTbbcstuAuthNumber) {
        this.criteriaTbbcstuAuthNumber = criteriaTbbcstuAuthNumber;
        return this;
    }

    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * Contract ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public ContractPersonAuthorization100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.tbbcstuStspKeySequence")
    public Double getCriteriaTbbcstuStspKeySequence() {
        return criteriaTbbcstuStspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("criteria.tbbcstuStspKeySequence")
    public void setCriteriaTbbcstuStspKeySequence(Double criteriaTbbcstuStspKeySequence) {
        this.criteriaTbbcstuStspKeySequence = criteriaTbbcstuStspKeySequence;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaTbbcstuStspKeySequence(Double criteriaTbbcstuStspKeySequence) {
        this.criteriaTbbcstuStspKeySequence = criteriaTbbcstuStspKeySequence;
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

    public ContractPersonAuthorization100PutRequest withTbbcstuContractPriority(Double tbbcstuContractPriority) {
        this.tbbcstuContractPriority = tbbcstuContractPriority;
        return this;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.additionalText2")
    public String getCriteriaAdditionalText2() {
        return criteriaAdditionalText2;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.additionalText2")
    public void setCriteriaAdditionalText2(String criteriaAdditionalText2) {
        this.criteriaAdditionalText2 = criteriaAdditionalText2;
    }

    public ContractPersonAuthorization100PutRequest withCriteriaAdditionalText2(String criteriaAdditionalText2) {
        this.criteriaAdditionalText2 = criteriaAdditionalText2;
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

    public ContractPersonAuthorization100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractPersonAuthorization100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbcstuStudentContRollInd");
        sb.append('=');
        sb.append(((this.tbbcstuStudentContRollInd == null)?"<null>":this.tbbcstuStudentContRollInd));
        sb.append(',');
        sb.append("tbbcstuAuthInd");
        sb.append('=');
        sb.append(((this.tbbcstuAuthInd == null)?"<null>":this.tbbcstuAuthInd));
        sb.append(',');
        sb.append("criteriaStudypathName");
        sb.append('=');
        sb.append(((this.criteriaStudypathName == null)?"<null>":this.criteriaStudypathName));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("criteriaTbbcstuDelInd");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuDelInd == null)?"<null>":this.criteriaTbbcstuDelInd));
        sb.append(',');
        sb.append("criteriaTbbcstuStudentContRollInd");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuStudentContRollInd == null)?"<null>":this.criteriaTbbcstuStudentContRollInd));
        sb.append(',');
        sb.append("criteriaTbbcstuSponsorRefNumber");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuSponsorRefNumber == null)?"<null>":this.criteriaTbbcstuSponsorRefNumber));
        sb.append(',');
        sb.append("criteriaTbbcstuActivityDate");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuActivityDate == null)?"<null>":this.criteriaTbbcstuActivityDate));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("criteriaTbbcstuTermCodeExpiration");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuTermCodeExpiration == null)?"<null>":this.criteriaTbbcstuTermCodeExpiration));
        sb.append(',');
        sb.append("criteriaTbbcstuAuthInd");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuAuthInd == null)?"<null>":this.criteriaTbbcstuAuthInd));
        sb.append(',');
        sb.append("criteriaTbbcstuContractPriority");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuContractPriority == null)?"<null>":this.criteriaTbbcstuContractPriority));
        sb.append(',');
        sb.append("criteriaStuId2");
        sb.append('=');
        sb.append(((this.criteriaStuId2 == null)?"<null>":this.criteriaStuId2));
        sb.append(',');
        sb.append("criteriaStuName2");
        sb.append('=');
        sb.append(((this.criteriaStuName2 == null)?"<null>":this.criteriaStuName2));
        sb.append(',');
        sb.append("stuId2");
        sb.append('=');
        sb.append(((this.stuId2 == null)?"<null>":this.stuId2));
        sb.append(',');
        sb.append("criteriaTbbcstuMaxStudentAmount");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuMaxStudentAmount == null)?"<null>":this.criteriaTbbcstuMaxStudentAmount));
        sb.append(',');
        sb.append("criteriaTbbcstuAuthNumber");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuAuthNumber == null)?"<null>":this.criteriaTbbcstuAuthNumber));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaTbbcstuStspKeySequence");
        sb.append('=');
        sb.append(((this.criteriaTbbcstuStspKeySequence == null)?"<null>":this.criteriaTbbcstuStspKeySequence));
        sb.append(',');
        sb.append("tbbcstuContractPriority");
        sb.append('=');
        sb.append(((this.tbbcstuContractPriority == null)?"<null>":this.tbbcstuContractPriority));
        sb.append(',');
        sb.append("criteriaAdditionalText2");
        sb.append('=');
        sb.append(((this.criteriaAdditionalText2 == null)?"<null>":this.criteriaAdditionalText2));
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
        result = ((result* 31)+((this.criteriaTbbcstuContractPriority == null)? 0 :this.criteriaTbbcstuContractPriority.hashCode()));
        result = ((result* 31)+((this.tbbcstuAuthInd == null)? 0 :this.tbbcstuAuthInd.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuAuthNumber == null)? 0 :this.criteriaTbbcstuAuthNumber.hashCode()));
        result = ((result* 31)+((this.criteriaStuId2 == null)? 0 :this.criteriaStuId2 .hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuTermCodeExpiration == null)? 0 :this.criteriaTbbcstuTermCodeExpiration.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuDelInd == null)? 0 :this.criteriaTbbcstuDelInd.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.criteriaAdditionalText2 == null)? 0 :this.criteriaAdditionalText2 .hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuActivityDate == null)? 0 :this.criteriaTbbcstuActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuSponsorRefNumber == null)? 0 :this.criteriaTbbcstuSponsorRefNumber.hashCode()));
        result = ((result* 31)+((this.criteriaStudypathName == null)? 0 :this.criteriaStudypathName.hashCode()));
        result = ((result* 31)+((this.stuId2 == null)? 0 :this.stuId2 .hashCode()));
        result = ((result* 31)+((this.criteriaStuName2 == null)? 0 :this.criteriaStuName2 .hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuMaxStudentAmount == null)? 0 :this.criteriaTbbcstuMaxStudentAmount.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuStspKeySequence == null)? 0 :this.criteriaTbbcstuStspKeySequence.hashCode()));
        result = ((result* 31)+((this.tbbcstuContractPriority == null)? 0 :this.tbbcstuContractPriority.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuAuthInd == null)? 0 :this.criteriaTbbcstuAuthInd.hashCode()));
        result = ((result* 31)+((this.criteriaTbbcstuStudentContRollInd == null)? 0 :this.criteriaTbbcstuStudentContRollInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractPersonAuthorization100PutRequest) == false) {
            return false;
        }
        ContractPersonAuthorization100PutRequest rhs = ((ContractPersonAuthorization100PutRequest) other);
        return (((((((((((((((((((((((this.tbbcstuStudentContRollInd == rhs.tbbcstuStudentContRollInd)||((this.tbbcstuStudentContRollInd!= null)&&this.tbbcstuStudentContRollInd.equals(rhs.tbbcstuStudentContRollInd)))&&((this.criteriaTbbcstuContractPriority == rhs.criteriaTbbcstuContractPriority)||((this.criteriaTbbcstuContractPriority!= null)&&this.criteriaTbbcstuContractPriority.equals(rhs.criteriaTbbcstuContractPriority))))&&((this.tbbcstuAuthInd == rhs.tbbcstuAuthInd)||((this.tbbcstuAuthInd!= null)&&this.tbbcstuAuthInd.equals(rhs.tbbcstuAuthInd))))&&((this.criteriaTbbcstuAuthNumber == rhs.criteriaTbbcstuAuthNumber)||((this.criteriaTbbcstuAuthNumber!= null)&&this.criteriaTbbcstuAuthNumber.equals(rhs.criteriaTbbcstuAuthNumber))))&&((this.criteriaStuId2 == rhs.criteriaStuId2)||((this.criteriaStuId2 != null)&&this.criteriaStuId2 .equals(rhs.criteriaStuId2))))&&((this.criteriaTbbcstuTermCodeExpiration == rhs.criteriaTbbcstuTermCodeExpiration)||((this.criteriaTbbcstuTermCodeExpiration!= null)&&this.criteriaTbbcstuTermCodeExpiration.equals(rhs.criteriaTbbcstuTermCodeExpiration))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.criteriaTbbcstuDelInd == rhs.criteriaTbbcstuDelInd)||((this.criteriaTbbcstuDelInd!= null)&&this.criteriaTbbcstuDelInd.equals(rhs.criteriaTbbcstuDelInd))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.criteriaAdditionalText2 == rhs.criteriaAdditionalText2)||((this.criteriaAdditionalText2 != null)&&this.criteriaAdditionalText2 .equals(rhs.criteriaAdditionalText2))))&&((this.criteriaTbbcstuActivityDate == rhs.criteriaTbbcstuActivityDate)||((this.criteriaTbbcstuActivityDate!= null)&&this.criteriaTbbcstuActivityDate.equals(rhs.criteriaTbbcstuActivityDate))))&&((this.criteriaTbbcstuSponsorRefNumber == rhs.criteriaTbbcstuSponsorRefNumber)||((this.criteriaTbbcstuSponsorRefNumber!= null)&&this.criteriaTbbcstuSponsorRefNumber.equals(rhs.criteriaTbbcstuSponsorRefNumber))))&&((this.criteriaStudypathName == rhs.criteriaStudypathName)||((this.criteriaStudypathName!= null)&&this.criteriaStudypathName.equals(rhs.criteriaStudypathName))))&&((this.stuId2 == rhs.stuId2)||((this.stuId2 != null)&&this.stuId2 .equals(rhs.stuId2))))&&((this.criteriaStuName2 == rhs.criteriaStuName2)||((this.criteriaStuName2 != null)&&this.criteriaStuName2 .equals(rhs.criteriaStuName2))))&&((this.criteriaTbbcstuMaxStudentAmount == rhs.criteriaTbbcstuMaxStudentAmount)||((this.criteriaTbbcstuMaxStudentAmount!= null)&&this.criteriaTbbcstuMaxStudentAmount.equals(rhs.criteriaTbbcstuMaxStudentAmount))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaTbbcstuStspKeySequence == rhs.criteriaTbbcstuStspKeySequence)||((this.criteriaTbbcstuStspKeySequence!= null)&&this.criteriaTbbcstuStspKeySequence.equals(rhs.criteriaTbbcstuStspKeySequence))))&&((this.tbbcstuContractPriority == rhs.tbbcstuContractPriority)||((this.tbbcstuContractPriority!= null)&&this.tbbcstuContractPriority.equals(rhs.tbbcstuContractPriority))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaTbbcstuAuthInd == rhs.criteriaTbbcstuAuthInd)||((this.criteriaTbbcstuAuthInd!= null)&&this.criteriaTbbcstuAuthInd.equals(rhs.criteriaTbbcstuAuthInd))))&&((this.criteriaTbbcstuStudentContRollInd == rhs.criteriaTbbcstuStudentContRollInd)||((this.criteriaTbbcstuStudentContRollInd!= null)&&this.criteriaTbbcstuStudentContRollInd.equals(rhs.criteriaTbbcstuStudentContRollInd))));
    }

}
