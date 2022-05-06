
package com.ellucian.generated.bpapi.ban.global_institution_financial_aid_options_exclude_course_levels.v1_0_0;

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
    "keyblckAidyCode",
    "stuLevlCode",
    "crseLevlCode"
})
@Generated("jsonschema2pojo")
public class GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100QapiPost {

    @JsonProperty("keyblckAidyCode")
    private String keyblckAidyCode;
    /**
     * Student Level
     * <p>
     * Lineage reference object : RORCLVE_STU_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("stuLevlCode")
    @JsonPropertyDescription("Lineage reference object : RORCLVE_STU_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String stuLevlCode;
    /**
     * Course Level
     * <p>
     * Lineage reference object : RORCLVE_CRSE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("crseLevlCode")
    @JsonPropertyDescription("Lineage reference object : RORCLVE_CRSE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String crseLevlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100QapiPost withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Student Level
     * <p>
     * Lineage reference object : RORCLVE_STU_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("stuLevlCode")
    public String getStuLevlCode() {
        return stuLevlCode;
    }

    /**
     * Student Level
     * <p>
     * Lineage reference object : RORCLVE_STU_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("stuLevlCode")
    public void setStuLevlCode(String stuLevlCode) {
        this.stuLevlCode = stuLevlCode;
    }

    public GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100QapiPost withStuLevlCode(String stuLevlCode) {
        this.stuLevlCode = stuLevlCode;
        return this;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : RORCLVE_CRSE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("crseLevlCode")
    public String getCrseLevlCode() {
        return crseLevlCode;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : RORCLVE_CRSE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("crseLevlCode")
    public void setCrseLevlCode(String crseLevlCode) {
        this.crseLevlCode = crseLevlCode;
    }

    public GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100QapiPost withCrseLevlCode(String crseLevlCode) {
        this.crseLevlCode = crseLevlCode;
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

    public GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("stuLevlCode");
        sb.append('=');
        sb.append(((this.stuLevlCode == null)?"<null>":this.stuLevlCode));
        sb.append(',');
        sb.append("crseLevlCode");
        sb.append('=');
        sb.append(((this.crseLevlCode == null)?"<null>":this.crseLevlCode));
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
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.crseLevlCode == null)? 0 :this.crseLevlCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stuLevlCode == null)? 0 :this.stuLevlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100QapiPost) == false) {
            return false;
        }
        GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100QapiPost rhs = ((GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100QapiPost) other);
        return (((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.crseLevlCode == rhs.crseLevlCode)||((this.crseLevlCode!= null)&&this.crseLevlCode.equals(rhs.crseLevlCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stuLevlCode == rhs.stuLevlCode)||((this.stuLevlCode!= null)&&this.stuLevlCode.equals(rhs.stuLevlCode))));
    }

}
