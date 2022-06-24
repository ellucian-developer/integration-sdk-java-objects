
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
    "completedInd",
    "code",
    "gmodCode",
    "qualityPoints",
    "passedInd",
    "numericValue",
    "grdeCode",
    "abbrev",
    "termCodeEffective",
    "gpaInd",
    "shatgrdSbgiCode",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class TransferGradeCodeMaintenance100PostRequest {

    /**
     * Count in Earned
     * <p>
     * Lineage reference object : SHRTGRD_COMPLETED_IND
     * (Required)
     * 
     */
    @JsonProperty("completedInd")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_COMPLETED_IND")
    private String completedInd;
    /**
     * Transfer Grade
     * <p>
     * Lineage reference object : SHRTGRD_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_CODE")
    private String code;
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
     * Abbreviation
     * <p>
     * Lineage reference object : SHRTGRD_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("abbrev")
    @JsonPropertyDescription("Lineage reference object : SHRTGRD_ABBREV")
    private String abbrev;
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
     * Count in Earned
     * <p>
     * Lineage reference object : SHRTGRD_COMPLETED_IND
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("completedInd")
    public void setCompletedInd(String completedInd) {
        this.completedInd = completedInd;
    }

    public TransferGradeCodeMaintenance100PostRequest withCompletedInd(String completedInd) {
        this.completedInd = completedInd;
        return this;
    }

    /**
     * Transfer Grade
     * <p>
     * Lineage reference object : SHRTGRD_CODE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public TransferGradeCodeMaintenance100PostRequest withCode(String code) {
        this.code = code;
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

    public TransferGradeCodeMaintenance100PostRequest withGmodCode(String gmodCode) {
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

    public TransferGradeCodeMaintenance100PostRequest withQualityPoints(Double qualityPoints) {
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

    public TransferGradeCodeMaintenance100PostRequest withPassedInd(String passedInd) {
        this.passedInd = passedInd;
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

    public TransferGradeCodeMaintenance100PostRequest withNumericValue(Double numericValue) {
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

    public TransferGradeCodeMaintenance100PostRequest withGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * Lineage reference object : SHRTGRD_ABBREV
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
     * Lineage reference object : SHRTGRD_ABBREV
     * (Required)
     * 
     */
    @JsonProperty("abbrev")
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public TransferGradeCodeMaintenance100PostRequest withAbbrev(String abbrev) {
        this.abbrev = abbrev;
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

    public TransferGradeCodeMaintenance100PostRequest withTermCodeEffective(String termCodeEffective) {
        this.termCodeEffective = termCodeEffective;
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

    public TransferGradeCodeMaintenance100PostRequest withGpaInd(String gpaInd) {
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

    public TransferGradeCodeMaintenance100PostRequest withShatgrdSbgiCode(String shatgrdSbgiCode) {
        this.shatgrdSbgiCode = shatgrdSbgiCode;
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

    public TransferGradeCodeMaintenance100PostRequest withLevlCode(String levlCode) {
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

    public TransferGradeCodeMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferGradeCodeMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("completedInd");
        sb.append('=');
        sb.append(((this.completedInd == null)?"<null>":this.completedInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        sb.append("numericValue");
        sb.append('=');
        sb.append(((this.numericValue == null)?"<null>":this.numericValue));
        sb.append(',');
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
        sb.append(',');
        sb.append("abbrev");
        sb.append('=');
        sb.append(((this.abbrev == null)?"<null>":this.abbrev));
        sb.append(',');
        sb.append("termCodeEffective");
        sb.append('=');
        sb.append(((this.termCodeEffective == null)?"<null>":this.termCodeEffective));
        sb.append(',');
        sb.append("gpaInd");
        sb.append('=');
        sb.append(((this.gpaInd == null)?"<null>":this.gpaInd));
        sb.append(',');
        sb.append("shatgrdSbgiCode");
        sb.append('=');
        sb.append(((this.shatgrdSbgiCode == null)?"<null>":this.shatgrdSbgiCode));
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
        result = ((result* 31)+((this.completedInd == null)? 0 :this.completedInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.qualityPoints == null)? 0 :this.qualityPoints.hashCode()));
        result = ((result* 31)+((this.passedInd == null)? 0 :this.passedInd.hashCode()));
        result = ((result* 31)+((this.numericValue == null)? 0 :this.numericValue.hashCode()));
        result = ((result* 31)+((this.grdeCode == null)? 0 :this.grdeCode.hashCode()));
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
        if ((other instanceof TransferGradeCodeMaintenance100PostRequest) == false) {
            return false;
        }
        TransferGradeCodeMaintenance100PostRequest rhs = ((TransferGradeCodeMaintenance100PostRequest) other);
        return ((((((((((((((this.completedInd == rhs.completedInd)||((this.completedInd!= null)&&this.completedInd.equals(rhs.completedInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.qualityPoints == rhs.qualityPoints)||((this.qualityPoints!= null)&&this.qualityPoints.equals(rhs.qualityPoints))))&&((this.passedInd == rhs.passedInd)||((this.passedInd!= null)&&this.passedInd.equals(rhs.passedInd))))&&((this.numericValue == rhs.numericValue)||((this.numericValue!= null)&&this.numericValue.equals(rhs.numericValue))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.abbrev == rhs.abbrev)||((this.abbrev!= null)&&this.abbrev.equals(rhs.abbrev))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeEffective == rhs.termCodeEffective)||((this.termCodeEffective!= null)&&this.termCodeEffective.equals(rhs.termCodeEffective))))&&((this.gpaInd == rhs.gpaInd)||((this.gpaInd!= null)&&this.gpaInd.equals(rhs.gpaInd))))&&((this.shatgrdSbgiCode == rhs.shatgrdSbgiCode)||((this.shatgrdSbgiCode!= null)&&this.shatgrdSbgiCode.equals(rhs.shatgrdSbgiCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
