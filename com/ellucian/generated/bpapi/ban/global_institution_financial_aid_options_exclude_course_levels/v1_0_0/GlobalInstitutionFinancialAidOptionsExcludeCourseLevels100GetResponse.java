
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
    "studentLevlDesc",
    "stuLevlCode",
    "crseLevlCode",
    "courseLevlDesc"
})
@Generated("jsonschema2pojo")
public class GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("studentLevlDesc")
    private String studentLevlDesc;
    /**
     * Student Level
     * <p>
     * Lineage reference object : RORCLVE_STU_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("stuLevlCode")
    @JsonPropertyDescription("Lineage reference object : RORCLVE_STU_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String stuLevlCode;
    /**
     * Course Level
     * <p>
     * Lineage reference object : RORCLVE_CRSE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("crseLevlCode")
    @JsonPropertyDescription("Lineage reference object : RORCLVE_CRSE_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String crseLevlCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("courseLevlDesc")
    private String courseLevlDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("studentLevlDesc")
    public String getStudentLevlDesc() {
        return studentLevlDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("studentLevlDesc")
    public void setStudentLevlDesc(String studentLevlDesc) {
        this.studentLevlDesc = studentLevlDesc;
    }

    public GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse withStudentLevlDesc(String studentLevlDesc) {
        this.studentLevlDesc = studentLevlDesc;
        return this;
    }

    /**
     * Student Level
     * <p>
     * Lineage reference object : RORCLVE_STU_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("stuLevlCode")
    public void setStuLevlCode(String stuLevlCode) {
        this.stuLevlCode = stuLevlCode;
    }

    public GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse withStuLevlCode(String stuLevlCode) {
        this.stuLevlCode = stuLevlCode;
        return this;
    }

    /**
     * Course Level
     * <p>
     * Lineage reference object : RORCLVE_CRSE_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("crseLevlCode")
    public void setCrseLevlCode(String crseLevlCode) {
        this.crseLevlCode = crseLevlCode;
    }

    public GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse withCrseLevlCode(String crseLevlCode) {
        this.crseLevlCode = crseLevlCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("courseLevlDesc")
    public String getCourseLevlDesc() {
        return courseLevlDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("courseLevlDesc")
    public void setCourseLevlDesc(String courseLevlDesc) {
        this.courseLevlDesc = courseLevlDesc;
    }

    public GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse withCourseLevlDesc(String courseLevlDesc) {
        this.courseLevlDesc = courseLevlDesc;
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

    public GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("studentLevlDesc");
        sb.append('=');
        sb.append(((this.studentLevlDesc == null)?"<null>":this.studentLevlDesc));
        sb.append(',');
        sb.append("stuLevlCode");
        sb.append('=');
        sb.append(((this.stuLevlCode == null)?"<null>":this.stuLevlCode));
        sb.append(',');
        sb.append("crseLevlCode");
        sb.append('=');
        sb.append(((this.crseLevlCode == null)?"<null>":this.crseLevlCode));
        sb.append(',');
        sb.append("courseLevlDesc");
        sb.append('=');
        sb.append(((this.courseLevlDesc == null)?"<null>":this.courseLevlDesc));
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
        result = ((result* 31)+((this.crseLevlCode == null)? 0 :this.crseLevlCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.studentLevlDesc == null)? 0 :this.studentLevlDesc.hashCode()));
        result = ((result* 31)+((this.courseLevlDesc == null)? 0 :this.courseLevlDesc.hashCode()));
        result = ((result* 31)+((this.stuLevlCode == null)? 0 :this.stuLevlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse) == false) {
            return false;
        }
        GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse rhs = ((GlobalInstitutionFinancialAidOptionsExcludeCourseLevels100GetResponse) other);
        return ((((((this.crseLevlCode == rhs.crseLevlCode)||((this.crseLevlCode!= null)&&this.crseLevlCode.equals(rhs.crseLevlCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.studentLevlDesc == rhs.studentLevlDesc)||((this.studentLevlDesc!= null)&&this.studentLevlDesc.equals(rhs.studentLevlDesc))))&&((this.courseLevlDesc == rhs.courseLevlDesc)||((this.courseLevlDesc!= null)&&this.courseLevlDesc.equals(rhs.courseLevlDesc))))&&((this.stuLevlCode == rhs.stuLevlCode)||((this.stuLevlCode!= null)&&this.stuLevlCode.equals(rhs.stuLevlCode))));
    }

}
