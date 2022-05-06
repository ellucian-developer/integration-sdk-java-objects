
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
    "code",
    "levlCode",
    "abbrev",
    "termCodeEffective",
    "grdeStatusInd",
    "qualityPoints",
    "attemptedInd",
    "passedInd",
    "completedInd",
    "gpaInd",
    "traditionalInd",
    "impcmpInd",
    "grdeCodeIncmpFinal",
    "webEntryInd",
    "numericValue",
    "repeatIncludeInd",
    "lastDateAttendInd",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class GradeCodeMaintenance100QapiPost {

    /**
     * Grade Code
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_CODE")
    private String code;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
     * 
     */
    @JsonProperty("abbrev")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_ABBREV")
    private String abbrev;
    /**
     * Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEffective")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm")
    private String termCodeEffective;
    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
     * 
     */
    @JsonProperty("grdeStatusInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_GRDE_STATUS_IND")
    private String grdeStatusInd;
    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRGRDE_QUALITY_POINTS
     * 
     */
    @JsonProperty("qualityPoints")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_QUALITY_POINTS")
    private Double qualityPoints;
    /**
     * Lineage reference object : SHRGRDE_ATTEMPTED_IND
     * 
     */
    @JsonProperty("attemptedInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_ATTEMPTED_IND")
    private String attemptedInd;
    /**
     * Lineage reference object : SHRGRDE_PASSED_IND
     * 
     */
    @JsonProperty("passedInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_PASSED_IND")
    private String passedInd;
    /**
     * Lineage reference object : SHRGRDE_COMPLETED_IND
     * 
     */
    @JsonProperty("completedInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_COMPLETED_IND")
    private String completedInd;
    /**
     * Lineage reference object : SHRGRDE_GPA_IND
     * 
     */
    @JsonProperty("gpaInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_GPA_IND")
    private String gpaInd;
    /**
     * Lineage reference object : SHRGRDE_TRADITIONAL_IND
     * 
     */
    @JsonProperty("traditionalInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_TRADITIONAL_IND")
    private String traditionalInd;
    /**
     * Lineage reference object : SHRGRDE_IMPCMP_IND
     * 
     */
    @JsonProperty("impcmpInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_IMPCMP_IND")
    private String impcmpInd;
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
     * Lineage reference object : SHRGRDE_WEB_ENTRY_IND
     * 
     */
    @JsonProperty("webEntryInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_WEB_ENTRY_IND")
    private String webEntryInd;
    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRGRDE_NUMERIC_VALUE
     * 
     */
    @JsonProperty("numericValue")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_NUMERIC_VALUE")
    private Double numericValue;
    /**
     * Lineage reference object : SHRGRDE_REPEAT_INCLUDE_IND
     * 
     */
    @JsonProperty("repeatIncludeInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_REPEAT_INCLUDE_IND")
    private String repeatIncludeInd;
    /**
     * Lineage reference object : SHRGRDE_LAST_DATE_ATTEND_IND
     * 
     */
    @JsonProperty("lastDateAttendInd")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_LAST_DATE_ATTEND_IND")
    private String lastDateAttendInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SHRGRDE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SHRGRDE_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Grade Code
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Grade Code
     * <p>
     * Lineage reference object : SHRGRDE_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public GradeCodeMaintenance100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRGRDE_LEVL_CODE, Lookup lineage reference object : stvlevl
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
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public GradeCodeMaintenance100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRGRDE_ABBREV
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
     * 
     */
    @JsonProperty("abbrev")
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public GradeCodeMaintenance100QapiPost withAbbrev(String abbrev) {
        this.abbrev = abbrev;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHRGRDE_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
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
     * 
     */
    @JsonProperty("termCodeEffective")
    public void setTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
    }

    public GradeCodeMaintenance100QapiPost withTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
        return this;
    }

    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRGRDE_GRDE_STATUS_IND
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
     * 
     */
    @JsonProperty("grdeStatusInd")
    public void setGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
    }

    public GradeCodeMaintenance100QapiPost withGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
        return this;
    }

    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRGRDE_QUALITY_POINTS
     * 
     */
    @JsonProperty("qualityPoints")
    public Double getQualityPoints() {
        return qualityPoints;
    }

    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRGRDE_QUALITY_POINTS
     * 
     */
    @JsonProperty("qualityPoints")
    public void setQualityPoints(Double qualityPoints) {
        this.qualityPoints = qualityPoints;
    }

    public GradeCodeMaintenance100QapiPost withQualityPoints(Double qualityPoints) {
        this.qualityPoints = qualityPoints;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_ATTEMPTED_IND
     * 
     */
    @JsonProperty("attemptedInd")
    public String getAttemptedInd() {
        return attemptedInd;
    }

    /**
     * Lineage reference object : SHRGRDE_ATTEMPTED_IND
     * 
     */
    @JsonProperty("attemptedInd")
    public void setAttemptedInd(String attemptedInd) {
        this.attemptedInd = attemptedInd;
    }

    public GradeCodeMaintenance100QapiPost withAttemptedInd(String attemptedInd) {
        this.attemptedInd = attemptedInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_PASSED_IND
     * 
     */
    @JsonProperty("passedInd")
    public String getPassedInd() {
        return passedInd;
    }

    /**
     * Lineage reference object : SHRGRDE_PASSED_IND
     * 
     */
    @JsonProperty("passedInd")
    public void setPassedInd(String passedInd) {
        this.passedInd = passedInd;
    }

    public GradeCodeMaintenance100QapiPost withPassedInd(String passedInd) {
        this.passedInd = passedInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_COMPLETED_IND
     * 
     */
    @JsonProperty("completedInd")
    public String getCompletedInd() {
        return completedInd;
    }

    /**
     * Lineage reference object : SHRGRDE_COMPLETED_IND
     * 
     */
    @JsonProperty("completedInd")
    public void setCompletedInd(String completedInd) {
        this.completedInd = completedInd;
    }

    public GradeCodeMaintenance100QapiPost withCompletedInd(String completedInd) {
        this.completedInd = completedInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_GPA_IND
     * 
     */
    @JsonProperty("gpaInd")
    public String getGpaInd() {
        return gpaInd;
    }

    /**
     * Lineage reference object : SHRGRDE_GPA_IND
     * 
     */
    @JsonProperty("gpaInd")
    public void setGpaInd(String gpaInd) {
        this.gpaInd = gpaInd;
    }

    public GradeCodeMaintenance100QapiPost withGpaInd(String gpaInd) {
        this.gpaInd = gpaInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_TRADITIONAL_IND
     * 
     */
    @JsonProperty("traditionalInd")
    public String getTraditionalInd() {
        return traditionalInd;
    }

    /**
     * Lineage reference object : SHRGRDE_TRADITIONAL_IND
     * 
     */
    @JsonProperty("traditionalInd")
    public void setTraditionalInd(String traditionalInd) {
        this.traditionalInd = traditionalInd;
    }

    public GradeCodeMaintenance100QapiPost withTraditionalInd(String traditionalInd) {
        this.traditionalInd = traditionalInd;
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

    public GradeCodeMaintenance100QapiPost withImpcmpInd(String impcmpInd) {
        this.impcmpInd = impcmpInd;
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

    public GradeCodeMaintenance100QapiPost withGrdeCodeIncmpFinal(String grdeCodeIncmpFinal) {
        this.grdeCodeIncmpFinal = grdeCodeIncmpFinal;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_WEB_ENTRY_IND
     * 
     */
    @JsonProperty("webEntryInd")
    public String getWebEntryInd() {
        return webEntryInd;
    }

    /**
     * Lineage reference object : SHRGRDE_WEB_ENTRY_IND
     * 
     */
    @JsonProperty("webEntryInd")
    public void setWebEntryInd(String webEntryInd) {
        this.webEntryInd = webEntryInd;
    }

    public GradeCodeMaintenance100QapiPost withWebEntryInd(String webEntryInd) {
        this.webEntryInd = webEntryInd;
        return this;
    }

    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRGRDE_NUMERIC_VALUE
     * 
     */
    @JsonProperty("numericValue")
    public Double getNumericValue() {
        return numericValue;
    }

    /**
     * Numeric Value
     * <p>
     * Lineage reference object : SHRGRDE_NUMERIC_VALUE
     * 
     */
    @JsonProperty("numericValue")
    public void setNumericValue(Double numericValue) {
        this.numericValue = numericValue;
    }

    public GradeCodeMaintenance100QapiPost withNumericValue(Double numericValue) {
        this.numericValue = numericValue;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_REPEAT_INCLUDE_IND
     * 
     */
    @JsonProperty("repeatIncludeInd")
    public String getRepeatIncludeInd() {
        return repeatIncludeInd;
    }

    /**
     * Lineage reference object : SHRGRDE_REPEAT_INCLUDE_IND
     * 
     */
    @JsonProperty("repeatIncludeInd")
    public void setRepeatIncludeInd(String repeatIncludeInd) {
        this.repeatIncludeInd = repeatIncludeInd;
    }

    public GradeCodeMaintenance100QapiPost withRepeatIncludeInd(String repeatIncludeInd) {
        this.repeatIncludeInd = repeatIncludeInd;
        return this;
    }

    /**
     * Lineage reference object : SHRGRDE_LAST_DATE_ATTEND_IND
     * 
     */
    @JsonProperty("lastDateAttendInd")
    public String getLastDateAttendInd() {
        return lastDateAttendInd;
    }

    /**
     * Lineage reference object : SHRGRDE_LAST_DATE_ATTEND_IND
     * 
     */
    @JsonProperty("lastDateAttendInd")
    public void setLastDateAttendInd(String lastDateAttendInd) {
        this.lastDateAttendInd = lastDateAttendInd;
    }

    public GradeCodeMaintenance100QapiPost withLastDateAttendInd(String lastDateAttendInd) {
        this.lastDateAttendInd = lastDateAttendInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SHRGRDE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SHRGRDE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public GradeCodeMaintenance100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public GradeCodeMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeCodeMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("abbrev");
        sb.append('=');
        sb.append(((this.abbrev == null)?"<null>":this.abbrev));
        sb.append(',');
        sb.append("termCodeEffective");
        sb.append('=');
        sb.append(((this.termCodeEffective == null)?"<null>":this.termCodeEffective));
        sb.append(',');
        sb.append("grdeStatusInd");
        sb.append('=');
        sb.append(((this.grdeStatusInd == null)?"<null>":this.grdeStatusInd));
        sb.append(',');
        sb.append("qualityPoints");
        sb.append('=');
        sb.append(((this.qualityPoints == null)?"<null>":this.qualityPoints));
        sb.append(',');
        sb.append("attemptedInd");
        sb.append('=');
        sb.append(((this.attemptedInd == null)?"<null>":this.attemptedInd));
        sb.append(',');
        sb.append("passedInd");
        sb.append('=');
        sb.append(((this.passedInd == null)?"<null>":this.passedInd));
        sb.append(',');
        sb.append("completedInd");
        sb.append('=');
        sb.append(((this.completedInd == null)?"<null>":this.completedInd));
        sb.append(',');
        sb.append("gpaInd");
        sb.append('=');
        sb.append(((this.gpaInd == null)?"<null>":this.gpaInd));
        sb.append(',');
        sb.append("traditionalInd");
        sb.append('=');
        sb.append(((this.traditionalInd == null)?"<null>":this.traditionalInd));
        sb.append(',');
        sb.append("impcmpInd");
        sb.append('=');
        sb.append(((this.impcmpInd == null)?"<null>":this.impcmpInd));
        sb.append(',');
        sb.append("grdeCodeIncmpFinal");
        sb.append('=');
        sb.append(((this.grdeCodeIncmpFinal == null)?"<null>":this.grdeCodeIncmpFinal));
        sb.append(',');
        sb.append("webEntryInd");
        sb.append('=');
        sb.append(((this.webEntryInd == null)?"<null>":this.webEntryInd));
        sb.append(',');
        sb.append("numericValue");
        sb.append('=');
        sb.append(((this.numericValue == null)?"<null>":this.numericValue));
        sb.append(',');
        sb.append("repeatIncludeInd");
        sb.append('=');
        sb.append(((this.repeatIncludeInd == null)?"<null>":this.repeatIncludeInd));
        sb.append(',');
        sb.append("lastDateAttendInd");
        sb.append('=');
        sb.append(((this.lastDateAttendInd == null)?"<null>":this.lastDateAttendInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.completedInd == null)? 0 :this.completedInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.qualityPoints == null)? 0 :this.qualityPoints.hashCode()));
        result = ((result* 31)+((this.passedInd == null)? 0 :this.passedInd.hashCode()));
        result = ((result* 31)+((this.repeatIncludeInd == null)? 0 :this.repeatIncludeInd.hashCode()));
        result = ((result* 31)+((this.numericValue == null)? 0 :this.numericValue.hashCode()));
        result = ((result* 31)+((this.lastDateAttendInd == null)? 0 :this.lastDateAttendInd.hashCode()));
        result = ((result* 31)+((this.impcmpInd == null)? 0 :this.impcmpInd.hashCode()));
        result = ((result* 31)+((this.webEntryInd == null)? 0 :this.webEntryInd.hashCode()));
        result = ((result* 31)+((this.grdeStatusInd == null)? 0 :this.grdeStatusInd.hashCode()));
        result = ((result* 31)+((this.attemptedInd == null)? 0 :this.attemptedInd.hashCode()));
        result = ((result* 31)+((this.grdeCodeIncmpFinal == null)? 0 :this.grdeCodeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.traditionalInd == null)? 0 :this.traditionalInd.hashCode()));
        result = ((result* 31)+((this.abbrev == null)? 0 :this.abbrev.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCodeEffective == null)? 0 :this.termCodeEffective.hashCode()));
        result = ((result* 31)+((this.gpaInd == null)? 0 :this.gpaInd.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeCodeMaintenance100QapiPost) == false) {
            return false;
        }
        GradeCodeMaintenance100QapiPost rhs = ((GradeCodeMaintenance100QapiPost) other);
        return ((((((((((((((((((((this.completedInd == rhs.completedInd)||((this.completedInd!= null)&&this.completedInd.equals(rhs.completedInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.qualityPoints == rhs.qualityPoints)||((this.qualityPoints!= null)&&this.qualityPoints.equals(rhs.qualityPoints))))&&((this.passedInd == rhs.passedInd)||((this.passedInd!= null)&&this.passedInd.equals(rhs.passedInd))))&&((this.repeatIncludeInd == rhs.repeatIncludeInd)||((this.repeatIncludeInd!= null)&&this.repeatIncludeInd.equals(rhs.repeatIncludeInd))))&&((this.numericValue == rhs.numericValue)||((this.numericValue!= null)&&this.numericValue.equals(rhs.numericValue))))&&((this.lastDateAttendInd == rhs.lastDateAttendInd)||((this.lastDateAttendInd!= null)&&this.lastDateAttendInd.equals(rhs.lastDateAttendInd))))&&((this.impcmpInd == rhs.impcmpInd)||((this.impcmpInd!= null)&&this.impcmpInd.equals(rhs.impcmpInd))))&&((this.webEntryInd == rhs.webEntryInd)||((this.webEntryInd!= null)&&this.webEntryInd.equals(rhs.webEntryInd))))&&((this.grdeStatusInd == rhs.grdeStatusInd)||((this.grdeStatusInd!= null)&&this.grdeStatusInd.equals(rhs.grdeStatusInd))))&&((this.attemptedInd == rhs.attemptedInd)||((this.attemptedInd!= null)&&this.attemptedInd.equals(rhs.attemptedInd))))&&((this.grdeCodeIncmpFinal == rhs.grdeCodeIncmpFinal)||((this.grdeCodeIncmpFinal!= null)&&this.grdeCodeIncmpFinal.equals(rhs.grdeCodeIncmpFinal))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.traditionalInd == rhs.traditionalInd)||((this.traditionalInd!= null)&&this.traditionalInd.equals(rhs.traditionalInd))))&&((this.abbrev == rhs.abbrev)||((this.abbrev!= null)&&this.abbrev.equals(rhs.abbrev))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeEffective == rhs.termCodeEffective)||((this.termCodeEffective!= null)&&this.termCodeEffective.equals(rhs.termCodeEffective))))&&((this.gpaInd == rhs.gpaInd)||((this.gpaInd!= null)&&this.gpaInd.equals(rhs.gpaInd))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
