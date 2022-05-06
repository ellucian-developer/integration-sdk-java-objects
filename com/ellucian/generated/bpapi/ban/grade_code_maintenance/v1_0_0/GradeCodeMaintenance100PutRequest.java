
package com.ellucian.generated.bpapi.ban.grade_code_maintenance.v1_0_0;

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
    "criteria.traditionalInd",
    "criteria.attemptedInd",
    "criteria.activityDate",
    "criteria.passedInd",
    "impcmpInd",
    "criteria.levlCode",
    "criteria.code",
    "criteria.grdeCodeIncmpFinal",
    "criteria.completedInd",
    "criteria.impcmpInd",
    "termCodeEffective",
    "gmodCode",
    "criteria.qualityPoints",
    "criteria.webEntryInd",
    "criteria.lastDateAttendInd",
    "criteria.grdeStatusInd",
    "grdeStatusInd",
    "criteria.gpaInd",
    "grdeCodeIncmpFinal",
    "criteria.abbrev",
    "abbrev",
    "criteria.termCodeEffective",
    "criteria.numericValue",
    "levlCode",
    "criteria.repeatIncludeInd"
})
@Generated("jsonschema2pojo")
public class GradeCodeMaintenance100PutRequest {

    /**
     * Lineage reference object : SHRGRDE_TRADITIONAL_IND
     * 
     */
    @JsonProperty("criteria.traditionalInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_TRADITIONAL_IND")
    private String criteriaTraditionalInd;
    /**
     * Lineage reference object : SHRGRDE_ATTEMPTED_IND
     * 
     */
    @JsonProperty("criteria.attemptedInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_ATTEMPTED_IND")
    private String criteriaAttemptedInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SHRGRDE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Lineage reference object : SHRGRDE_PASSED_IND
     * 
     */
    @JsonProperty("criteria.passedInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_PASSED_IND")
    private String criteriaPassedInd;
    /**
     * Lineage reference object : SHRGRDE_IMPCMP_IND
     * 
     */
    @JsonProperty("impcmpInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_IMPCMP_IND")
    private String impcmpInd;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String criteriaLevlCode;
    /**
     * Grade Code
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_CODE")
    private String criteriaCode;
    /**
     * Incomplete Grade Default
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeCodeIncmpFinal")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde")
    private String criteriaGrdeCodeIncmpFinal;
    /**
     * Lineage reference object : SHRGRDE_COMPLETED_IND
     * 
     */
    @JsonProperty("criteria.completedInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_COMPLETED_IND")
    private String criteriaCompletedInd;
    /**
     * Lineage reference object : SHRGRDE_IMPCMP_IND
     * 
     */
    @JsonProperty("criteria.impcmpInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_IMPCMP_IND")
    private String criteriaImpcmpInd;
    /**
     * Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEffective")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm")
    private String termCodeEffective;
    /**
     * Mode
     * <p>
     * Lineage reference object : SHRGRDO_GMOD_CODE, Lookup lineage reference object : stvgmod
     * (Required)
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRGRDO_GMOD_CODE, Lookup lineage reference object : stvgmod")
    private String gmodCode;
    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRGRDE_QUALITY_POINTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.qualityPoints")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_QUALITY_POINTS")
    private Double criteriaQualityPoints;
    /**
     * Lineage reference object : SHRGRDE_WEB_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.webEntryInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_WEB_ENTRY_IND")
    private String criteriaWebEntryInd;
    /**
     * Lineage reference object : SHRGRDE_LAST_DATE_ATTEND_IND
     * 
     */
    @JsonProperty("criteria.lastDateAttendInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_LAST_DATE_ATTEND_IND")
    private String criteriaLastDateAttendInd;
    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeStatusInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_GRDE_STATUS_IND")
    private String criteriaGrdeStatusInd;
    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("grdeStatusInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_GRDE_STATUS_IND")
    private String grdeStatusInd;
    /**
     * Lineage reference object : SHRGRDE_GPA_IND
     * 
     */
    @JsonProperty("criteria.gpaInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_GPA_IND")
    private String criteriaGpaInd;
    /**
     * Incomplete Grade Default
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeCodeIncmpFinal")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde")
    private String grdeCodeIncmpFinal;
    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("criteria.abbrev")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_ABBREV")
    private String criteriaAbbrev;
    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("abbrev")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_ABBREV")
    private String abbrev;
    /**
     * Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeEffective")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeEffective;
    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRGRDE_NUMERIC_VALUE
     * 
     */
    @JsonProperty("criteria.numericValue")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_NUMERIC_VALUE")
    private Double criteriaNumericValue;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Lineage reference object : SHRGRDE_REPEAT_INCLUDE_IND
     * 
     */
    @JsonProperty("criteria.repeatIncludeInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_REPEAT_INCLUDE_IND")
    private String criteriaRepeatIncludeInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SHRGRDE_TRADITIONAL_IND
     * 
     */
    @JsonProperty("criteria.traditionalInd")
    public String getCriteriaTraditionalInd() {
        return criteriaTraditionalInd;
    }

    /**
     * Lineage reference object : SHRGRDE_TRADITIONAL_IND
     * 
     */
    @JsonProperty("criteria.traditionalInd")
    public void setCriteriaTraditionalInd(String criteriaTraditionalInd) {
        this.criteriaTraditionalInd = criteriaTraditionalInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaTraditionalInd(String criteriaTraditionalInd) {
        this.criteriaTraditionalInd = criteriaTraditionalInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_ATTEMPTED_IND
     * 
     */
    @JsonProperty("criteria.attemptedInd")
    public String getCriteriaAttemptedInd() {
        return criteriaAttemptedInd;
    }

    /**
     * Lineage reference object : SHRGRDE_ATTEMPTED_IND
     * 
     */
    @JsonProperty("criteria.attemptedInd")
    public void setCriteriaAttemptedInd(String criteriaAttemptedInd) {
        this.criteriaAttemptedInd = criteriaAttemptedInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaAttemptedInd(String criteriaAttemptedInd) {
        this.criteriaAttemptedInd = criteriaAttemptedInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SHRGRDE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SHRGRDE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_PASSED_IND
     * 
     */
    @JsonProperty("criteria.passedInd")
    public String getCriteriaPassedInd() {
        return criteriaPassedInd;
    }

    /**
     * Lineage reference object : SHRGRDE_PASSED_IND
     * 
     */
    @JsonProperty("criteria.passedInd")
    public void setCriteriaPassedInd(String criteriaPassedInd) {
        this.criteriaPassedInd = criteriaPassedInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaPassedInd(String criteriaPassedInd) {
        this.criteriaPassedInd = criteriaPassedInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_IMPCMP_IND
     * 
     */
    @JsonProperty("impcmpInd")
    public String getImpcmpInd() {
        return impcmpInd;
    }

    /**
     * Lineage reference object : SHRGRDE_IMPCMP_IND
     * 
     */
    @JsonProperty("impcmpInd")
    public void setImpcmpInd(String impcmpInd) {
        this.impcmpInd = impcmpInd;
    }

    public GradeCodeMaintenance100PutRequest withImpcmpInd(String impcmpInd) {
        this.impcmpInd = impcmpInd;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
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
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("criteria.levlCode")
    public void setCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaLevlCode(String criteriaLevlCode) {
        this.criteriaLevlCode = criteriaLevlCode;
        return this;
    }

    /**
     * Grade Code
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Grade Code
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.code")
    public void setCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaCode(String criteriaCode) {
        this.criteriaCode = criteriaCode;
        return this;
    }

    /**
     * Incomplete Grade Default
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeCodeIncmpFinal")
    public String getCriteriaGrdeCodeIncmpFinal() {
        return criteriaGrdeCodeIncmpFinal;
    }

    /**
     * Incomplete Grade Default
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeCodeIncmpFinal")
    public void setCriteriaGrdeCodeIncmpFinal(String criteriaGrdeCodeIncmpFinal) {
        this.criteriaGrdeCodeIncmpFinal = criteriaGrdeCodeIncmpFinal;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaGrdeCodeIncmpFinal(String criteriaGrdeCodeIncmpFinal) {
        this.criteriaGrdeCodeIncmpFinal = criteriaGrdeCodeIncmpFinal;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_COMPLETED_IND
     * 
     */
    @JsonProperty("criteria.completedInd")
    public String getCriteriaCompletedInd() {
        return criteriaCompletedInd;
    }

    /**
     * Lineage reference object : SHRGRDE_COMPLETED_IND
     * 
     */
    @JsonProperty("criteria.completedInd")
    public void setCriteriaCompletedInd(String criteriaCompletedInd) {
        this.criteriaCompletedInd = criteriaCompletedInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaCompletedInd(String criteriaCompletedInd) {
        this.criteriaCompletedInd = criteriaCompletedInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_IMPCMP_IND
     * 
     */
    @JsonProperty("criteria.impcmpInd")
    public String getCriteriaImpcmpInd() {
        return criteriaImpcmpInd;
    }

    /**
     * Lineage reference object : SHRGRDE_IMPCMP_IND
     * 
     */
    @JsonProperty("criteria.impcmpInd")
    public void setCriteriaImpcmpInd(String criteriaImpcmpInd) {
        this.criteriaImpcmpInd = criteriaImpcmpInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaImpcmpInd(String criteriaImpcmpInd) {
        this.criteriaImpcmpInd = criteriaImpcmpInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEffective")
    public String getTermCodeEffective() {
        return termCodeEffective;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEffective")
    public void setTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
    }

    public GradeCodeMaintenance100PutRequest withTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
        return this;
    }

    /**
     * Mode
     * <p>
     * Lineage reference object : SHRGRDO_GMOD_CODE, Lookup lineage reference object : stvgmod
     * (Required)
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Mode
     * <p>
     * Lineage reference object : SHRGRDO_GMOD_CODE, Lookup lineage reference object : stvgmod
     * (Required)
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public GradeCodeMaintenance100PutRequest withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRGRDE_QUALITY_POINTS
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
     * Lineage reference object : SHRGRDE_QUALITY_POINTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.qualityPoints")
    public void setCriteriaQualityPoints(Double criteriaQualityPoints) {
        this.criteriaQualityPoints = criteriaQualityPoints;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaQualityPoints(Double criteriaQualityPoints) {
        this.criteriaQualityPoints = criteriaQualityPoints;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_WEB_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.webEntryInd")
    public String getCriteriaWebEntryInd() {
        return criteriaWebEntryInd;
    }

    /**
     * Lineage reference object : SHRGRDE_WEB_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.webEntryInd")
    public void setCriteriaWebEntryInd(String criteriaWebEntryInd) {
        this.criteriaWebEntryInd = criteriaWebEntryInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaWebEntryInd(String criteriaWebEntryInd) {
        this.criteriaWebEntryInd = criteriaWebEntryInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_LAST_DATE_ATTEND_IND
     * 
     */
    @JsonProperty("criteria.lastDateAttendInd")
    public String getCriteriaLastDateAttendInd() {
        return criteriaLastDateAttendInd;
    }

    /**
     * Lineage reference object : SHRGRDE_LAST_DATE_ATTEND_IND
     * 
     */
    @JsonProperty("criteria.lastDateAttendInd")
    public void setCriteriaLastDateAttendInd(String criteriaLastDateAttendInd) {
        this.criteriaLastDateAttendInd = criteriaLastDateAttendInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaLastDateAttendInd(String criteriaLastDateAttendInd) {
        this.criteriaLastDateAttendInd = criteriaLastDateAttendInd;
        return this;
    }

    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
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
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.grdeStatusInd")
    public void setCriteriaGrdeStatusInd(String criteriaGrdeStatusInd) {
        this.criteriaGrdeStatusInd = criteriaGrdeStatusInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaGrdeStatusInd(String criteriaGrdeStatusInd) {
        this.criteriaGrdeStatusInd = criteriaGrdeStatusInd;
        return this;
    }

    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
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
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("grdeStatusInd")
    public void setGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
    }

    public GradeCodeMaintenance100PutRequest withGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_GPA_IND
     * 
     */
    @JsonProperty("criteria.gpaInd")
    public String getCriteriaGpaInd() {
        return criteriaGpaInd;
    }

    /**
     * Lineage reference object : SHRGRDE_GPA_IND
     * 
     */
    @JsonProperty("criteria.gpaInd")
    public void setCriteriaGpaInd(String criteriaGpaInd) {
        this.criteriaGpaInd = criteriaGpaInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaGpaInd(String criteriaGpaInd) {
        this.criteriaGpaInd = criteriaGpaInd;
        return this;
    }

    /**
     * Incomplete Grade Default
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeCodeIncmpFinal")
    public String getGrdeCodeIncmpFinal() {
        return grdeCodeIncmpFinal;
    }

    /**
     * Incomplete Grade Default
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeCodeIncmpFinal")
    public void setGrdeCodeIncmpFinal(String grdeCodeIncmpFinal) {
        this.grdeCodeIncmpFinal = grdeCodeIncmpFinal;
    }

    public GradeCodeMaintenance100PutRequest withGrdeCodeIncmpFinal(String grdeCodeIncmpFinal) {
        this.grdeCodeIncmpFinal = grdeCodeIncmpFinal;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
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
     * Lineage reference object : SHRGRDE_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("criteria.abbrev")
    public void setCriteriaAbbrev(String criteriaAbbrev) {
        this.criteriaAbbrev = criteriaAbbrev;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaAbbrev(String criteriaAbbrev) {
        this.criteriaAbbrev = criteriaAbbrev;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("abbrev")
    public String getAbbrev() {
        return abbrev;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("abbrev")
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public GradeCodeMaintenance100PutRequest withAbbrev(String abbrev) {
        this.abbrev = abbrev;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeEffective")
    public String getCriteriaTermCodeEffective() {
        return criteriaTermCodeEffective;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeEffective")
    public void setCriteriaTermCodeEffective(String criteriaTermCodeEffective) {
        this.criteriaTermCodeEffective = criteriaTermCodeEffective;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaTermCodeEffective(String criteriaTermCodeEffective) {
        this.criteriaTermCodeEffective = criteriaTermCodeEffective;
        return this;
    }

    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRGRDE_NUMERIC_VALUE
     * 
     */
    @JsonProperty("criteria.numericValue")
    public Double getCriteriaNumericValue() {
        return criteriaNumericValue;
    }

    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRGRDE_NUMERIC_VALUE
     * 
     */
    @JsonProperty("criteria.numericValue")
    public void setCriteriaNumericValue(Double criteriaNumericValue) {
        this.criteriaNumericValue = criteriaNumericValue;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaNumericValue(Double criteriaNumericValue) {
        this.criteriaNumericValue = criteriaNumericValue;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
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
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public GradeCodeMaintenance100PutRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_REPEAT_INCLUDE_IND
     * 
     */
    @JsonProperty("criteria.repeatIncludeInd")
    public String getCriteriaRepeatIncludeInd() {
        return criteriaRepeatIncludeInd;
    }

    /**
     * Lineage reference object : SHRGRDE_REPEAT_INCLUDE_IND
     * 
     */
    @JsonProperty("criteria.repeatIncludeInd")
    public void setCriteriaRepeatIncludeInd(String criteriaRepeatIncludeInd) {
        this.criteriaRepeatIncludeInd = criteriaRepeatIncludeInd;
    }

    public GradeCodeMaintenance100PutRequest withCriteriaRepeatIncludeInd(String criteriaRepeatIncludeInd) {
        this.criteriaRepeatIncludeInd = criteriaRepeatIncludeInd;
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

    public GradeCodeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeCodeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaTraditionalInd");
        sb.append('=');
        sb.append(((this.criteriaTraditionalInd == null)?"<null>":this.criteriaTraditionalInd));
        sb.append(',');
        sb.append("criteriaAttemptedInd");
        sb.append('=');
        sb.append(((this.criteriaAttemptedInd == null)?"<null>":this.criteriaAttemptedInd));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaPassedInd");
        sb.append('=');
        sb.append(((this.criteriaPassedInd == null)?"<null>":this.criteriaPassedInd));
        sb.append(',');
        sb.append("impcmpInd");
        sb.append('=');
        sb.append(((this.impcmpInd == null)?"<null>":this.impcmpInd));
        sb.append(',');
        sb.append("criteriaLevlCode");
        sb.append('=');
        sb.append(((this.criteriaLevlCode == null)?"<null>":this.criteriaLevlCode));
        sb.append(',');
        sb.append("criteriaCode");
        sb.append('=');
        sb.append(((this.criteriaCode == null)?"<null>":this.criteriaCode));
        sb.append(',');
        sb.append("criteriaGrdeCodeIncmpFinal");
        sb.append('=');
        sb.append(((this.criteriaGrdeCodeIncmpFinal == null)?"<null>":this.criteriaGrdeCodeIncmpFinal));
        sb.append(',');
        sb.append("criteriaCompletedInd");
        sb.append('=');
        sb.append(((this.criteriaCompletedInd == null)?"<null>":this.criteriaCompletedInd));
        sb.append(',');
        sb.append("criteriaImpcmpInd");
        sb.append('=');
        sb.append(((this.criteriaImpcmpInd == null)?"<null>":this.criteriaImpcmpInd));
        sb.append(',');
        sb.append("termCodeEffective");
        sb.append('=');
        sb.append(((this.termCodeEffective == null)?"<null>":this.termCodeEffective));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("criteriaQualityPoints");
        sb.append('=');
        sb.append(((this.criteriaQualityPoints == null)?"<null>":this.criteriaQualityPoints));
        sb.append(',');
        sb.append("criteriaWebEntryInd");
        sb.append('=');
        sb.append(((this.criteriaWebEntryInd == null)?"<null>":this.criteriaWebEntryInd));
        sb.append(',');
        sb.append("criteriaLastDateAttendInd");
        sb.append('=');
        sb.append(((this.criteriaLastDateAttendInd == null)?"<null>":this.criteriaLastDateAttendInd));
        sb.append(',');
        sb.append("criteriaGrdeStatusInd");
        sb.append('=');
        sb.append(((this.criteriaGrdeStatusInd == null)?"<null>":this.criteriaGrdeStatusInd));
        sb.append(',');
        sb.append("grdeStatusInd");
        sb.append('=');
        sb.append(((this.grdeStatusInd == null)?"<null>":this.grdeStatusInd));
        sb.append(',');
        sb.append("criteriaGpaInd");
        sb.append('=');
        sb.append(((this.criteriaGpaInd == null)?"<null>":this.criteriaGpaInd));
        sb.append(',');
        sb.append("grdeCodeIncmpFinal");
        sb.append('=');
        sb.append(((this.grdeCodeIncmpFinal == null)?"<null>":this.grdeCodeIncmpFinal));
        sb.append(',');
        sb.append("criteriaAbbrev");
        sb.append('=');
        sb.append(((this.criteriaAbbrev == null)?"<null>":this.criteriaAbbrev));
        sb.append(',');
        sb.append("abbrev");
        sb.append('=');
        sb.append(((this.abbrev == null)?"<null>":this.abbrev));
        sb.append(',');
        sb.append("criteriaTermCodeEffective");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEffective == null)?"<null>":this.criteriaTermCodeEffective));
        sb.append(',');
        sb.append("criteriaNumericValue");
        sb.append('=');
        sb.append(((this.criteriaNumericValue == null)?"<null>":this.criteriaNumericValue));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("criteriaRepeatIncludeInd");
        sb.append('=');
        sb.append(((this.criteriaRepeatIncludeInd == null)?"<null>":this.criteriaRepeatIncludeInd));
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
        result = ((result* 31)+((this.impcmpInd == null)? 0 :this.impcmpInd.hashCode()));
        result = ((result* 31)+((this.criteriaRepeatIncludeInd == null)? 0 :this.criteriaRepeatIncludeInd.hashCode()));
        result = ((result* 31)+((this.criteriaTraditionalInd == null)? 0 :this.criteriaTraditionalInd.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEffective == null)? 0 :this.criteriaTermCodeEffective.hashCode()));
        result = ((result* 31)+((this.criteriaCompletedInd == null)? 0 :this.criteriaCompletedInd.hashCode()));
        result = ((result* 31)+((this.criteriaWebEntryInd == null)? 0 :this.criteriaWebEntryInd.hashCode()));
        result = ((result* 31)+((this.termCodeEffective == null)? 0 :this.termCodeEffective.hashCode()));
        result = ((result* 31)+((this.criteriaPassedInd == null)? 0 :this.criteriaPassedInd.hashCode()));
        result = ((result* 31)+((this.criteriaQualityPoints == null)? 0 :this.criteriaQualityPoints.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeStatusInd == null)? 0 :this.criteriaGrdeStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaLastDateAttendInd == null)? 0 :this.criteriaLastDateAttendInd.hashCode()));
        result = ((result* 31)+((this.grdeStatusInd == null)? 0 :this.grdeStatusInd.hashCode()));
        result = ((result* 31)+((this.grdeCodeIncmpFinal == null)? 0 :this.grdeCodeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.criteriaImpcmpInd == null)? 0 :this.criteriaImpcmpInd.hashCode()));
        result = ((result* 31)+((this.criteriaLevlCode == null)? 0 :this.criteriaLevlCode.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCodeIncmpFinal == null)? 0 :this.criteriaGrdeCodeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.criteriaNumericValue == null)? 0 :this.criteriaNumericValue.hashCode()));
        result = ((result* 31)+((this.abbrev == null)? 0 :this.abbrev.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaAttemptedInd == null)? 0 :this.criteriaAttemptedInd.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeCodeMaintenance100PutRequest) == false) {
            return false;
        }
        GradeCodeMaintenance100PutRequest rhs = ((GradeCodeMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((((this.criteriaGpaInd == rhs.criteriaGpaInd)||((this.criteriaGpaInd!= null)&&this.criteriaGpaInd.equals(rhs.criteriaGpaInd)))&&((this.criteriaCode == rhs.criteriaCode)||((this.criteriaCode!= null)&&this.criteriaCode.equals(rhs.criteriaCode))))&&((this.criteriaAbbrev == rhs.criteriaAbbrev)||((this.criteriaAbbrev!= null)&&this.criteriaAbbrev.equals(rhs.criteriaAbbrev))))&&((this.impcmpInd == rhs.impcmpInd)||((this.impcmpInd!= null)&&this.impcmpInd.equals(rhs.impcmpInd))))&&((this.criteriaRepeatIncludeInd == rhs.criteriaRepeatIncludeInd)||((this.criteriaRepeatIncludeInd!= null)&&this.criteriaRepeatIncludeInd.equals(rhs.criteriaRepeatIncludeInd))))&&((this.criteriaTraditionalInd == rhs.criteriaTraditionalInd)||((this.criteriaTraditionalInd!= null)&&this.criteriaTraditionalInd.equals(rhs.criteriaTraditionalInd))))&&((this.criteriaTermCodeEffective == rhs.criteriaTermCodeEffective)||((this.criteriaTermCodeEffective!= null)&&this.criteriaTermCodeEffective.equals(rhs.criteriaTermCodeEffective))))&&((this.criteriaCompletedInd == rhs.criteriaCompletedInd)||((this.criteriaCompletedInd!= null)&&this.criteriaCompletedInd.equals(rhs.criteriaCompletedInd))))&&((this.criteriaWebEntryInd == rhs.criteriaWebEntryInd)||((this.criteriaWebEntryInd!= null)&&this.criteriaWebEntryInd.equals(rhs.criteriaWebEntryInd))))&&((this.termCodeEffective == rhs.termCodeEffective)||((this.termCodeEffective!= null)&&this.termCodeEffective.equals(rhs.termCodeEffective))))&&((this.criteriaPassedInd == rhs.criteriaPassedInd)||((this.criteriaPassedInd!= null)&&this.criteriaPassedInd.equals(rhs.criteriaPassedInd))))&&((this.criteriaQualityPoints == rhs.criteriaQualityPoints)||((this.criteriaQualityPoints!= null)&&this.criteriaQualityPoints.equals(rhs.criteriaQualityPoints))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.criteriaGrdeStatusInd == rhs.criteriaGrdeStatusInd)||((this.criteriaGrdeStatusInd!= null)&&this.criteriaGrdeStatusInd.equals(rhs.criteriaGrdeStatusInd))))&&((this.criteriaLastDateAttendInd == rhs.criteriaLastDateAttendInd)||((this.criteriaLastDateAttendInd!= null)&&this.criteriaLastDateAttendInd.equals(rhs.criteriaLastDateAttendInd))))&&((this.grdeStatusInd == rhs.grdeStatusInd)||((this.grdeStatusInd!= null)&&this.grdeStatusInd.equals(rhs.grdeStatusInd))))&&((this.grdeCodeIncmpFinal == rhs.grdeCodeIncmpFinal)||((this.grdeCodeIncmpFinal!= null)&&this.grdeCodeIncmpFinal.equals(rhs.grdeCodeIncmpFinal))))&&((this.criteriaImpcmpInd == rhs.criteriaImpcmpInd)||((this.criteriaImpcmpInd!= null)&&this.criteriaImpcmpInd.equals(rhs.criteriaImpcmpInd))))&&((this.criteriaLevlCode == rhs.criteriaLevlCode)||((this.criteriaLevlCode!= null)&&this.criteriaLevlCode.equals(rhs.criteriaLevlCode))))&&((this.criteriaGrdeCodeIncmpFinal == rhs.criteriaGrdeCodeIncmpFinal)||((this.criteriaGrdeCodeIncmpFinal!= null)&&this.criteriaGrdeCodeIncmpFinal.equals(rhs.criteriaGrdeCodeIncmpFinal))))&&((this.criteriaNumericValue == rhs.criteriaNumericValue)||((this.criteriaNumericValue!= null)&&this.criteriaNumericValue.equals(rhs.criteriaNumericValue))))&&((this.abbrev == rhs.abbrev)||((this.abbrev!= null)&&this.abbrev.equals(rhs.abbrev))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaAttemptedInd == rhs.criteriaAttemptedInd)||((this.criteriaAttemptedInd!= null)&&this.criteriaAttemptedInd.equals(rhs.criteriaAttemptedInd))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
