
package com.ellucian.generated.bpapi.ban.transfer_grade_code_maintenance.v1_0_0;

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
    "criteria.attemptedInd",
    "gmodCode",
    "qualityPoints",
    "passedInd",
    "criteria.qualityPoints",
    "numericValue",
    "criteria.passedInd",
    "grdeCode",
    "criteria.levlCode",
    "criteria.grdeStatusInd",
    "grdeStatusInd",
    "criteria.code",
    "criteria.gpaInd",
    "criteria.completedInd",
    "criteria.abbrev",
    "criteria.grdeCode",
    "criteria.termCodeEffective",
    "termCodeEffective",
    "criteria.numericValue",
    "gpaInd",
    "shatgrdSbgiCode",
    "criteria.gmodCode",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class TransferGradeCodeMaintenance100PutRequest {

    /**
     * Count in Attempted
     * <p>
     * Lineage reference object : SHRTGRD_ATTEMPTED_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.attemptedInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_ATTEMPTED_IND")
    private String criteriaAttemptedInd;
    /**
     * Mode
     * <p>
     * Lineage reference object : SHRTGRD_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GMOD_CODE")
    private String gmodCode;
    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRTGRD_QUALITY_POINTS
     * (Required)
     * 
     */
    @JsonProperty("qualityPoints")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_QUALITY_POINTS")
    private Double qualityPoints;
    /**
     * Count in Passed
     * <p>
     * Lineage reference object : SHRTGRD_PASSED_IND
     * (Required)
     * 
     */
    @JsonProperty("passedInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_PASSED_IND")
    private String passedInd;
    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRTGRD_QUALITY_POINTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.qualityPoints")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_QUALITY_POINTS")
    private Double criteriaQualityPoints;
    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRTGRD_NUMERIC_VALUE
     * 
     */
    @JsonProperty("numericValue")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_NUMERIC_VALUE")
    private Double numericValue;
    /**
     * Count in Passed
     * <p>
     * Lineage reference object : SHRTGRD_PASSED_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.passedInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_PASSED_IND")
    private String criteriaPassedInd;
    /**
     * Institution Grade
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GRDE_CODE")
    private String grdeCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal")
    private String criteriaLevlCode;
    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeStatusInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GRDE_STATUS_IND")
    private String criteriaGrdeStatusInd;
    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("grdeStatusInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GRDE_STATUS_IND")
    private String grdeStatusInd;
    /**
     * Transfer Grade
     * <p>
     * Lineage reference object : SHRTGRD_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_CODE")
    private String criteriaCode;
    /**
     * Count in GPA
     * <p>
     * Lineage reference object : SHRTGRD_GPA_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.gpaInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GPA_IND")
    private String criteriaGpaInd;
    /**
     * Count in Earned
     * <p>
     * Lineage reference object : SHRTGRD_COMPLETED_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.completedInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_COMPLETED_IND")
    private String criteriaCompletedInd;
    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRTGRD_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("criteria.abbrev")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_ABBREV")
    private String criteriaAbbrev;
    /**
     * Institution Grade
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_CODE
     * 
     */
    @JsonProperty("criteria.grdeCode")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GRDE_CODE")
    private String criteriaGrdeCode;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeEffective")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeEffective;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEffective")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm")
    private String termCodeEffective;
    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRTGRD_NUMERIC_VALUE
     * 
     */
    @JsonProperty("criteria.numericValue")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_NUMERIC_VALUE")
    private Double criteriaNumericValue;
    /**
     * Count in GPA
     * <p>
     * Lineage reference object : SHRTGRD_GPA_IND
     * (Required)
     * 
     */
    @JsonProperty("gpaInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GPA_IND")
    private String gpaInd;
    /**
     * Institution
     * <p>
     * Lineage reference object : shatgrdSbgiCode
     * 
     */
    @JsonProperty("shatgrdSbgiCode")
    @JsonPropertyDescription("Lineage reference object : shatgrdSbgiCode")
    private String shatgrdSbgiCode;
    /**
     * Mode
     * <p>
     * Lineage reference object : SHRTGRD_GMOD_CODE
     * 
     */
    @JsonProperty("criteria.gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GMOD_CODE")
    private String criteriaGmodCode;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal")
    private String levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Count in Attempted
     * <p>
     * Lineage reference object : SHRTGRD_ATTEMPTED_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.attemptedInd")
    public String getCriteriaAttemptedInd() {
        return criteriaAttemptedInd;
    }

    /**
     * Count in Attempted
     * <p>
     * Lineage reference object : SHRTGRD_ATTEMPTED_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.attemptedInd")
    public void setCriteriaAttemptedInd(String criteriaAttemptedInd) {
        this.criteriaAttemptedInd = criteriaAttemptedInd;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaAttemptedInd(String criteriaAttemptedInd) {
        this.criteriaAttemptedInd = criteriaAttemptedInd;
        return this;
    }

    /**
     * Mode
     * <p>
     * Lineage reference object : SHRTGRD_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Mode
     * <p>
     * Lineage reference object : SHRTGRD_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public TransferGradeCodeMaintenance100PutRequest withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRTGRD_QUALITY_POINTS
     * (Required)
     * 
     */
    @JsonProperty("qualityPoints")
    public Double getQualityPoints() {
        return qualityPoints;
    }

    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRTGRD_QUALITY_POINTS
     * (Required)
     * 
     */
    @JsonProperty("qualityPoints")
    public void setQualityPoints(Double qualityPoints) {
        this.qualityPoints = qualityPoints;
    }

    public TransferGradeCodeMaintenance100PutRequest withQualityPoints(Double qualityPoints) {
        this.qualityPoints = qualityPoints;
        return this;
    }

    /**
     * Count in Passed
     * <p>
     * Lineage reference object : SHRTGRD_PASSED_IND
     * (Required)
     * 
     */
    @JsonProperty("passedInd")
    public String getPassedInd() {
        return passedInd;
    }

    /**
     * Count in Passed
     * <p>
     * Lineage reference object : SHRTGRD_PASSED_IND
     * (Required)
     * 
     */
    @JsonProperty("passedInd")
    public void setPassedInd(String passedInd) {
        this.passedInd = passedInd;
    }

    public TransferGradeCodeMaintenance100PutRequest withPassedInd(String passedInd) {
        this.passedInd = passedInd;
        return this;
    }

    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRTGRD_QUALITY_POINTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.qualityPoints")
    public Double getCriteriaQualityPoints() {
        return criteriaQualityPoints;
    }

    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRTGRD_QUALITY_POINTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.qualityPoints")
    public void setCriteriaQualityPoints(Double criteriaQualityPoints) {
        this.criteriaQualityPoints = criteriaQualityPoints;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaQualityPoints(Double criteriaQualityPoints) {
        this.criteriaQualityPoints = criteriaQualityPoints;
        return this;
    }

    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRTGRD_NUMERIC_VALUE
     * 
     */
    @JsonProperty("numericValue")
    public Double getNumericValue() {
        return numericValue;
    }

    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRTGRD_NUMERIC_VALUE
     * 
     */
    @JsonProperty("numericValue")
    public void setNumericValue(Double numericValue) {
        this.numericValue = numericValue;
    }

    public TransferGradeCodeMaintenance100PutRequest withNumericValue(Double numericValue) {
        this.numericValue = numericValue;
        return this;
    }

    /**
     * Count in Passed
     * <p>
     * Lineage reference object : SHRTGRD_PASSED_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.passedInd")
    public String getCriteriaPassedInd() {
        return criteriaPassedInd;
    }

    /**
     * Count in Passed
     * <p>
     * Lineage reference object : SHRTGRD_PASSED_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.passedInd")
    public void setCriteriaPassedInd(String criteriaPassedInd) {
        this.criteriaPassedInd = criteriaPassedInd;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaPassedInd(String criteriaPassedInd) {
        this.criteriaPassedInd = criteriaPassedInd;
        return this;
    }

    /**
     * Institution Grade
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    public String getGrdeCode() {
        return grdeCode;
    }

    /**
     * Institution Grade
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    public void setGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
    }

    public TransferGradeCodeMaintenance100PutRequest withGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    public String getCriteriaLevlCode() {
        return criteriaLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeStatusInd")
    public String getCriteriaGrdeStatusInd() {
        return criteriaGrdeStatusInd;
    }

    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeStatusInd")
    public void setCriteriaGrdeStatusInd(String criteriaGrdeStatusInd) {
        this.criteriaGrdeStatusInd = criteriaGrdeStatusInd;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaGrdeStatusInd(String criteriaGrdeStatusInd) {
        this.criteriaGrdeStatusInd = criteriaGrdeStatusInd;
        return this;
    }

    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("grdeStatusInd")
    public String getGrdeStatusInd() {
        return grdeStatusInd;
    }

    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("grdeStatusInd")
    public void setGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
    }

    public TransferGradeCodeMaintenance100PutRequest withGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
        return this;
    }

    /**
     * Transfer Grade
     * <p>
     * Lineage reference object : SHRTGRD_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Transfer Grade
     * <p>
     * Lineage reference object : SHRTGRD_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Count in GPA
     * <p>
     * Lineage reference object : SHRTGRD_GPA_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.gpaInd")
    public String getCriteriaGpaInd() {
        return criteriaGpaInd;
    }

    /**
     * Count in GPA
     * <p>
     * Lineage reference object : SHRTGRD_GPA_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.gpaInd")
    public void setCriteriaGpaInd(String criteriaGpaInd) {
        this.criteriaGpaInd = criteriaGpaInd;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaGpaInd(String criteriaGpaInd) {
        this.criteriaGpaInd = criteriaGpaInd;
        return this;
    }

    /**
     * Count in Earned
     * <p>
     * Lineage reference object : SHRTGRD_COMPLETED_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.completedInd")
    public String getCriteriaCompletedInd() {
        return criteriaCompletedInd;
    }

    /**
     * Count in Earned
     * <p>
     * Lineage reference object : SHRTGRD_COMPLETED_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.completedInd")
    public void setCriteriaCompletedInd(String criteriaCompletedInd) {
        this.criteriaCompletedInd = criteriaCompletedInd;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaCompletedInd(String criteriaCompletedInd) {
        this.criteriaCompletedInd = criteriaCompletedInd;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRTGRD_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("criteria.abbrev")
    public String getCriteriaAbbrev() {
        return criteriaAbbrev;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRTGRD_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("criteria.abbrev")
    public void setCriteriaAbbrev(String criteriaAbbrev) {
        this.criteriaAbbrev = criteriaAbbrev;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaAbbrev(String criteriaAbbrev) {
        this.criteriaAbbrev = criteriaAbbrev;
        return this;
    }

    /**
     * Institution Grade
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_CODE
     * 
     */
    @JsonProperty("criteria.grdeCode")
    public String getCriteriaGrdeCode() {
        return criteriaGrdeCode;
    }

    /**
     * Institution Grade
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_CODE
     * 
     */
    @JsonProperty("criteria.grdeCode")
    public void setCriteriaGrdeCode(String criteriaGrdeCode) {
        this.criteriaGrdeCode = criteriaGrdeCode;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaGrdeCode(String criteriaGrdeCode) {
        this.criteriaGrdeCode = criteriaGrdeCode;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeEffective")
    public String getCriteriaTermCodeEffective() {
        return criteriaTermCodeEffective;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeEffective")
    public void setCriteriaTermCodeEffective(String criteriaTermCodeEffective) {
        this.criteriaTermCodeEffective = criteriaTermCodeEffective;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaTermCodeEffective(String criteriaTermCodeEffective) {
        this.criteriaTermCodeEffective = criteriaTermCodeEffective;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEffective")
    public String getTermCodeEffective() {
        return termCodeEffective;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEffective")
    public void setTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
    }

    public TransferGradeCodeMaintenance100PutRequest withTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
        return this;
    }

    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRTGRD_NUMERIC_VALUE
     * 
     */
    @JsonProperty("criteria.numericValue")
    public Double getCriteriaNumericValue() {
        return criteriaNumericValue;
    }

    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRTGRD_NUMERIC_VALUE
     * 
     */
    @JsonProperty("criteria.numericValue")
    public void setCriteriaNumericValue(Double criteriaNumericValue) {
        this.criteriaNumericValue = criteriaNumericValue;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaNumericValue(Double criteriaNumericValue) {
        this.criteriaNumericValue = criteriaNumericValue;
        return this;
    }

    /**
     * Count in GPA
     * <p>
     * Lineage reference object : SHRTGRD_GPA_IND
     * (Required)
     * 
     */
    @JsonProperty("gpaInd")
    public String getGpaInd() {
        return gpaInd;
    }

    /**
     * Count in GPA
     * <p>
     * Lineage reference object : SHRTGRD_GPA_IND
     * (Required)
     * 
     */
    @JsonProperty("gpaInd")
    public void setGpaInd(String gpaInd) {
        this.gpaInd = gpaInd;
    }

    public TransferGradeCodeMaintenance100PutRequest withGpaInd(String gpaInd) {
        this.gpaInd = gpaInd;
        return this;
    }

    /**
     * Institution
     * <p>
     * Lineage reference object : shatgrdSbgiCode
     * 
     */
    @JsonProperty("shatgrdSbgiCode")
    public String getShatgrdSbgiCode() {
        return shatgrdSbgiCode;
    }

    /**
     * Institution
     * <p>
     * Lineage reference object : shatgrdSbgiCode
     * 
     */
    @JsonProperty("shatgrdSbgiCode")
    public void setShatgrdSbgiCode(String shatgrdSbgiCode) {
        this.shatgrdSbgiCode = shatgrdSbgiCode;
    }

    public TransferGradeCodeMaintenance100PutRequest withShatgrdSbgiCode(String shatgrdSbgiCode) {
        this.shatgrdSbgiCode = shatgrdSbgiCode;
        return this;
    }

    /**
     * Mode
     * <p>
     * Lineage reference object : SHRTGRD_GMOD_CODE
     * 
     */
    @JsonProperty("criteria.gmodCode")
    public String getCriteriaGmodCode() {
        return criteriaGmodCode;
    }

    /**
     * Mode
     * <p>
     * Lineage reference object : SHRTGRD_GMOD_CODE
     * 
     */
    @JsonProperty("criteria.gmodCode")
    public void setCriteriaGmodCode(String criteriaGmodCode) {
        this.criteriaGmodCode = criteriaGmodCode;
    }

    public TransferGradeCodeMaintenance100PutRequest withCriteriaGmodCode(String criteriaGmodCode) {
        this.criteriaGmodCode = criteriaGmodCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public TransferGradeCodeMaintenance100PutRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public TransferGradeCodeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferGradeCodeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaAttemptedInd");
        sb.append('=');
        sb.append(((this.criteriaAttemptedInd == null)?"<null>":this.criteriaAttemptedInd));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("qualityPoints");
        sb.append('=');
        sb.append(((this.qualityPoints == null)?"<null>":this.qualityPoints));
        sb.append(',');
        sb.append("passedInd");
        sb.append('=');
        sb.append(((this.passedInd == null)?"<null>":this.passedInd));
        sb.append(',');
        sb.append("criteriaQualityPoints");
        sb.append('=');
        sb.append(((this.criteriaQualityPoints == null)?"<null>":this.criteriaQualityPoints));
        sb.append(',');
        sb.append("numericValue");
        sb.append('=');
        sb.append(((this.numericValue == null)?"<null>":this.numericValue));
        sb.append(',');
        sb.append("criteriaPassedInd");
        sb.append('=');
        sb.append(((this.criteriaPassedInd == null)?"<null>":this.criteriaPassedInd));
        sb.append(',');
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("criteriaGrdeStatusInd");
        sb.append('=');
        sb.append(((this.criteriaGrdeStatusInd == null)?"<null>":this.criteriaGrdeStatusInd));
        sb.append(',');
        sb.append("grdeStatusInd");
        sb.append('=');
        sb.append(((this.grdeStatusInd == null)?"<null>":this.grdeStatusInd));
        sb.append(',');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaGpaInd");
        sb.append('=');
        sb.append(((this.criteriaGpaInd == null)?"<null>":this.criteriaGpaInd));
        sb.append(',');
        sb.append("criteriaCompletedInd");
        sb.append('=');
        sb.append(((this.criteriaCompletedInd == null)?"<null>":this.criteriaCompletedInd));
        sb.append(',');
        sb.append("criteriaAbbrev");
        sb.append('=');
        sb.append(((this.criteriaAbbrev == null)?"<null>":this.criteriaAbbrev));
        sb.append(',');
        sb.append("criteriaGrdeCode");
        sb.append('=');
        sb.append(((this.criteriaGrdeCode == null)?"<null>":this.criteriaGrdeCode));
        sb.append(',');
        sb.append("criteriaTermCodeEffective");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEffective == null)?"<null>":this.criteriaTermCodeEffective));
        sb.append(',');
        sb.append("termCodeEffective");
        sb.append('=');
        sb.append(((this.termCodeEffective == null)?"<null>":this.termCodeEffective));
        sb.append(',');
        sb.append("criteriaNumericValue");
        sb.append('=');
        sb.append(((this.criteriaNumericValue == null)?"<null>":this.criteriaNumericValue));
        sb.append(',');
        sb.append("gpaInd");
        sb.append('=');
        sb.append(((this.gpaInd == null)?"<null>":this.gpaInd));
        sb.append(',');
        sb.append("shatgrdSbgiCode");
        sb.append('=');
        sb.append(((this.shatgrdSbgiCode == null)?"<null>":this.shatgrdSbgiCode));
        sb.append(',');
        sb.append("criteriaGmodCode");
        sb.append('=');
        sb.append(((this.criteriaGmodCode == null)?"<null>":this.criteriaGmodCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.criteriaGpaInd == null)? 0 :this.criteriaGpaInd.hashCode()));
        result = ((result* 31)+((this.criteriaCode == null)? 0 :this.criteriaCode.hashCode()));
        result = ((result* 31)+((this.criteriaAbbrev == null)? 0 :this.criteriaAbbrev.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCode == null)? 0 :this.criteriaGrdeCode.hashCode()));
        result = ((result* 31)+((this.numericValue == null)? 0 :this.numericValue.hashCode()));
        result = ((result* 31)+((this.grdeCode == null)? 0 :this.grdeCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEffective == null)? 0 :this.criteriaTermCodeEffective.hashCode()));
        result = ((result* 31)+((this.criteriaCompletedInd == null)? 0 :this.criteriaCompletedInd.hashCode()));
        result = ((result* 31)+((this.termCodeEffective == null)? 0 :this.termCodeEffective.hashCode()));
        result = ((result* 31)+((this.criteriaPassedInd == null)? 0 :this.criteriaPassedInd.hashCode()));
        result = ((result* 31)+((this.criteriaQualityPoints == null)? 0 :this.criteriaQualityPoints.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.qualityPoints == null)? 0 :this.qualityPoints.hashCode()));
        result = ((result* 31)+((this.passedInd == null)? 0 :this.passedInd.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeStatusInd == null)? 0 :this.criteriaGrdeStatusInd.hashCode()));
        result = ((result* 31)+((this.grdeStatusInd == null)? 0 :this.grdeStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaGmodCode == null)? 0 :this.criteriaGmodCode.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.criteriaNumericValue == null)? 0 :this.criteriaNumericValue.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaAttemptedInd == null)? 0 :this.criteriaAttemptedInd.hashCode()));
        result = ((result* 31)+((this.gpaInd == null)? 0 :this.gpaInd.hashCode()));
        result = ((result* 31)+((this.shatgrdSbgiCode == null)? 0 :this.shatgrdSbgiCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransferGradeCodeMaintenance100PutRequest) == false) {
            return false;
        }
        TransferGradeCodeMaintenance100PutRequest rhs = ((TransferGradeCodeMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((this.criteriaGpaInd == rhs.criteriaGpaInd)||((this.criteriaGpaInd!= null)&&this.criteriaGpaInd.equals(rhs.criteriaGpaInd)))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.criteriaAbbrev == rhs.criteriaAbbrev)||((this.criteriaAbbrev!= null)&&this.criteriaAbbrev.equals(rhs.criteriaAbbrev))))&&((this.criteriaGrdeCode == rhs.criteriaGrdeCode)||((this.criteriaGrdeCode!= null)&&this.criteriaGrdeCode.equals(rhs.criteriaGrdeCode))))&&((this.numericValue == rhs.numericValue)||((this.numericValue!= null)&&this.numericValue.equals(rhs.numericValue))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.criteriaTermCodeEffective == rhs.criteriaTermCodeEffective)||((this.criteriaTermCodeEffective!= null)&&this.criteriaTermCodeEffective.equals(rhs.criteriaTermCodeEffective))))&&((this.criteriaCompletedInd == rhs.criteriaCompletedInd)||((this.criteriaCompletedInd!= null)&&this.criteriaCompletedInd.equals(rhs.criteriaCompletedInd))))&&((this.termCodeEffective == rhs.termCodeEffective)||((this.termCodeEffective!= null)&&this.termCodeEffective.equals(rhs.termCodeEffective))))&&((this.criteriaPassedInd == rhs.criteriaPassedInd)||((this.criteriaPassedInd!= null)&&this.criteriaPassedInd.equals(rhs.criteriaPassedInd))))&&((this.criteriaQualityPoints == rhs.criteriaQualityPoints)||((this.criteriaQualityPoints!= null)&&this.criteriaQualityPoints.equals(rhs.criteriaQualityPoints))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.qualityPoints == rhs.qualityPoints)||((this.qualityPoints!= null)&&this.qualityPoints.equals(rhs.qualityPoints))))&&((this.passedInd == rhs.passedInd)||((this.passedInd!= null)&&this.passedInd.equals(rhs.passedInd))))&&((this.criteriaGrdeStatusInd == rhs.criteriaGrdeStatusInd)||((this.criteriaGrdeStatusInd!= null)&&this.criteriaGrdeStatusInd.equals(rhs.criteriaGrdeStatusInd))))&&((this.grdeStatusInd == rhs.grdeStatusInd)||((this.grdeStatusInd!= null)&&this.grdeStatusInd.equals(rhs.grdeStatusInd))))&&((this.criteriaGmodCode == rhs.criteriaGmodCode)||((this.criteriaGmodCode!= null)&&this.criteriaGmodCode.equals(rhs.criteriaGmodCode))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.criteriaNumericValue == rhs.criteriaNumericValue)||((this.criteriaNumericValue!= null)&&this.criteriaNumericValue.equals(rhs.criteriaNumericValue))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaAttemptedInd == rhs.criteriaAttemptedInd)||((this.criteriaAttemptedInd!= null)&&this.criteriaAttemptedInd.equals(rhs.criteriaAttemptedInd))))&&((this.gpaInd == rhs.gpaInd)||((this.gpaInd!= null)&&this.gpaInd.equals(rhs.gpaInd))))&&((this.shatgrdSbgiCode == rhs.shatgrdSbgiCode)||((this.shatgrdSbgiCode!= null)&&this.shatgrdSbgiCode.equals(rhs.shatgrdSbgiCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
