
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
    "shatgrdSbgiCode",
    "code",
    "termCodeEffective",
    "levlCode",
    "abbrev",
    "grdeStatusInd",
    "qualityPoints",
    "attemptedInd",
    "passedInd",
    "completedInd",
    "gpaInd",
    "numericValue",
    "grdeCode",
    "gmodCode"
})
@Generated("jsonschema2pojo")
public class TransferGradeCodeMaintenance100QapiPost {

    @JsonProperty("shatgrdSbgiCode")
    private String shatgrdSbgiCode;
    /**
     * Transfer Grade
     * <p>
     * Lineage reference object : SHRTGRD_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_CODE")
    private String code;
    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEffective")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm")
    private String termCodeEffective;
    /**
     * Level
     * <p>
     * Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal")
    private String levlCode;
    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRTGRD_ABBREV
     * 
     */
    @JsonProperty("abbrev")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_ABBREV")
    private String abbrev;
    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_STATUS_IND
     * 
     */
    @JsonProperty("grdeStatusInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GRDE_STATUS_IND")
    private String grdeStatusInd;
    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRTGRD_QUALITY_POINTS
     * 
     */
    @JsonProperty("qualityPoints")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_QUALITY_POINTS")
    private Double qualityPoints;
    /**
     * Count in Attempted
     * <p>
     * Lineage reference object : SHRTGRD_ATTEMPTED_IND
     * 
     */
    @JsonProperty("attemptedInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_ATTEMPTED_IND")
    private String attemptedInd;
    /**
     * Count in Passed
     * <p>
     * Lineage reference object : SHRTGRD_PASSED_IND
     * 
     */
    @JsonProperty("passedInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_PASSED_IND")
    private String passedInd;
    /**
     * Count in Earned
     * <p>
     * Lineage reference object : SHRTGRD_COMPLETED_IND
     * 
     */
    @JsonProperty("completedInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_COMPLETED_IND")
    private String completedInd;
    /**
     * Count in GPA
     * <p>
     * Lineage reference object : SHRTGRD_GPA_IND
     * 
     */
    @JsonProperty("gpaInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GPA_IND")
    private String gpaInd;
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
     * Institution Grade
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GRDE_CODE")
    private String grdeCode;
    /**
     * Mode
     * <p>
     * Lineage reference object : SHRTGRD_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_GMOD_CODE")
    private String gmodCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shatgrdSbgiCode")
    public String getShatgrdSbgiCode() {
        return shatgrdSbgiCode;
    }

    @JsonProperty("shatgrdSbgiCode")
    public void setShatgrdSbgiCode(String shatgrdSbgiCode) {
        this.shatgrdSbgiCode = shatgrdSbgiCode;
    }

    public TransferGradeCodeMaintenance100QapiPost withShatgrdSbgiCode(String shatgrdSbgiCode) {
        this.shatgrdSbgiCode = shatgrdSbgiCode;
        return this;
    }

    /**
     * Transfer Grade
     * <p>
     * Lineage reference object : SHRTGRD_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Transfer Grade
     * <p>
     * Lineage reference object : SHRTGRD_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public TransferGradeCodeMaintenance100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Effective Term
     * <p>
     * Lineage reference object : SHRTGRD_TERM_CODE_EFFECTIVE, Lookup lineage reference object : stvterm
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
     * 
     */
    @JsonProperty("termCodeEffective")
    public void setTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
    }

    public TransferGradeCodeMaintenance100QapiPost withTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHRTGRD_LEVL_CODE, Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
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
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public TransferGradeCodeMaintenance100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRTGRD_ABBREV
     * 
     */
    @JsonProperty("abbrev")
    public String getAbbrev() {
        return abbrev;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRTGRD_ABBREV
     * 
     */
    @JsonProperty("abbrev")
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public TransferGradeCodeMaintenance100QapiPost withAbbrev(String abbrev) {
        this.abbrev = abbrev;
        return this;
    }

    /**
     * Status Ind
     * <p>
     * Lineage reference object : SHRTGRD_GRDE_STATUS_IND
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
     * 
     */
    @JsonProperty("grdeStatusInd")
    public void setGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
    }

    public TransferGradeCodeMaintenance100QapiPost withGrdeStatusInd(String grdeStatusInd) {
        this.grdeStatusInd = grdeStatusInd;
        return this;
    }

    /**
     * Quality Points
     * <p>
     * Lineage reference object : SHRTGRD_QUALITY_POINTS
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
     * 
     */
    @JsonProperty("qualityPoints")
    public void setQualityPoints(Double qualityPoints) {
        this.qualityPoints = qualityPoints;
    }

    public TransferGradeCodeMaintenance100QapiPost withQualityPoints(Double qualityPoints) {
        this.qualityPoints = qualityPoints;
        return this;
    }

    /**
     * Count in Attempted
     * <p>
     * Lineage reference object : SHRTGRD_ATTEMPTED_IND
     * 
     */
    @JsonProperty("attemptedInd")
    public String getAttemptedInd() {
        return attemptedInd;
    }

    /**
     * Count in Attempted
     * <p>
     * Lineage reference object : SHRTGRD_ATTEMPTED_IND
     * 
     */
    @JsonProperty("attemptedInd")
    public void setAttemptedInd(String attemptedInd) {
        this.attemptedInd = attemptedInd;
    }

    public TransferGradeCodeMaintenance100QapiPost withAttemptedInd(String attemptedInd) {
        this.attemptedInd = attemptedInd;
        return this;
    }

    /**
     * Count in Passed
     * <p>
     * Lineage reference object : SHRTGRD_PASSED_IND
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
     * 
     */
    @JsonProperty("passedInd")
    public void setPassedInd(String passedInd) {
        this.passedInd = passedInd;
    }

    public TransferGradeCodeMaintenance100QapiPost withPassedInd(String passedInd) {
        this.passedInd = passedInd;
        return this;
    }

    /**
     * Count in Earned
     * <p>
     * Lineage reference object : SHRTGRD_COMPLETED_IND
     * 
     */
    @JsonProperty("completedInd")
    public String getCompletedInd() {
        return completedInd;
    }

    /**
     * Count in Earned
     * <p>
     * Lineage reference object : SHRTGRD_COMPLETED_IND
     * 
     */
    @JsonProperty("completedInd")
    public void setCompletedInd(String completedInd) {
        this.completedInd = completedInd;
    }

    public TransferGradeCodeMaintenance100QapiPost withCompletedInd(String completedInd) {
        this.completedInd = completedInd;
        return this;
    }

    /**
     * Count in GPA
     * <p>
     * Lineage reference object : SHRTGRD_GPA_IND
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
     * 
     */
    @JsonProperty("gpaInd")
    public void setGpaInd(String gpaInd) {
        this.gpaInd = gpaInd;
    }

    public TransferGradeCodeMaintenance100QapiPost withGpaInd(String gpaInd) {
        this.gpaInd = gpaInd;
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

    public TransferGradeCodeMaintenance100QapiPost withNumericValue(Double numericValue) {
        this.numericValue = numericValue;
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

    public TransferGradeCodeMaintenance100QapiPost withGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
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

    public TransferGradeCodeMaintenance100QapiPost withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
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

    public TransferGradeCodeMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferGradeCodeMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shatgrdSbgiCode");
        sb.append('=');
        sb.append(((this.shatgrdSbgiCode == null)?"<null>":this.shatgrdSbgiCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("termCodeEffective");
        sb.append('=');
        sb.append(((this.termCodeEffective == null)?"<null>":this.termCodeEffective));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("abbrev");
        sb.append('=');
        sb.append(((this.abbrev == null)?"<null>":this.abbrev));
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
        sb.append("numericValue");
        sb.append('=');
        sb.append(((this.numericValue == null)?"<null>":this.numericValue));
        sb.append(',');
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
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
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.qualityPoints == null)? 0 :this.qualityPoints.hashCode()));
        result = ((result* 31)+((this.passedInd == null)? 0 :this.passedInd.hashCode()));
        result = ((result* 31)+((this.numericValue == null)? 0 :this.numericValue.hashCode()));
        result = ((result* 31)+((this.grdeCode == null)? 0 :this.grdeCode.hashCode()));
        result = ((result* 31)+((this.grdeStatusInd == null)? 0 :this.grdeStatusInd.hashCode()));
        result = ((result* 31)+((this.attemptedInd == null)? 0 :this.attemptedInd.hashCode()));
        result = ((result* 31)+((this.abbrev == null)? 0 :this.abbrev.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCodeEffective == null)? 0 :this.termCodeEffective.hashCode()));
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
        if ((other instanceof TransferGradeCodeMaintenance100QapiPost) == false) {
            return false;
        }
        TransferGradeCodeMaintenance100QapiPost rhs = ((TransferGradeCodeMaintenance100QapiPost) other);
        return ((((((((((((((((this.completedInd == rhs.completedInd)||((this.completedInd!= null)&&this.completedInd.equals(rhs.completedInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.qualityPoints == rhs.qualityPoints)||((this.qualityPoints!= null)&&this.qualityPoints.equals(rhs.qualityPoints))))&&((this.passedInd == rhs.passedInd)||((this.passedInd!= null)&&this.passedInd.equals(rhs.passedInd))))&&((this.numericValue == rhs.numericValue)||((this.numericValue!= null)&&this.numericValue.equals(rhs.numericValue))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.grdeStatusInd == rhs.grdeStatusInd)||((this.grdeStatusInd!= null)&&this.grdeStatusInd.equals(rhs.grdeStatusInd))))&&((this.attemptedInd == rhs.attemptedInd)||((this.attemptedInd!= null)&&this.attemptedInd.equals(rhs.attemptedInd))))&&((this.abbrev == rhs.abbrev)||((this.abbrev!= null)&&this.abbrev.equals(rhs.abbrev))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeEffective == rhs.termCodeEffective)||((this.termCodeEffective!= null)&&this.termCodeEffective.equals(rhs.termCodeEffective))))&&((this.gpaInd == rhs.gpaInd)||((this.gpaInd!= null)&&this.gpaInd.equals(rhs.gpaInd))))&&((this.shatgrdSbgiCode == rhs.shatgrdSbgiCode)||((this.shatgrdSbgiCode!= null)&&this.shatgrdSbgiCode.equals(rhs.shatgrdSbgiCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
