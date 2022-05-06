
package com.ellucian.generated.bpapi.ban.section_restriction_department_and_field_of_study.v1_0_0;

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
    "ssasectTermCode",
    "ssasectCrn",
    "fosAll",
    "ssrrmajMajorIndVit",
    "ssrrmajLfstCode",
    "ssrrdepDeptIeCde",
    "majrCode",
    "deptCode"
})
@Generated("jsonschema2pojo")
public class SectionRestrictionDepartmentAndFieldOfStudy100PostRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private Object ssasectTermCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private Object ssasectCrn;
    @JsonProperty("fosAll")
    private String fosAll;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssrrmajMajorIndVit")
    private String ssrrmajMajorIndVit;
    /**
     * Type
     * <p>
     * Lineage reference object : SSRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("ssrrmajLfstCode")
    @JsonPropertyDescription("Lineage reference object : SSRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String ssrrmajLfstCode;
    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrdepDeptIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrdepDeptIeCde")
    @JsonPropertyDescription("Lineage reference object : ssrrdepDeptIeCde")
    private Object ssrrdepDeptIeCde;
    /**
     * Code
     * <p>
     * Lineage reference object : SSRRMAJ_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SSRRMAJ_MAJR_CODE, Lookup lineage reference object : stvmajr")
    private String majrCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SSRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SSRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public Object getSsasectTermCode() {
        return ssasectTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public void setSsasectTermCode(Object ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostRequest withSsasectTermCode(Object ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public Object getSsasectCrn() {
        return ssasectCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public void setSsasectCrn(Object ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostRequest withSsasectCrn(Object ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
        return this;
    }

    @JsonProperty("fosAll")
    public String getFosAll() {
        return fosAll;
    }

    @JsonProperty("fosAll")
    public void setFosAll(String fosAll) {
        this.fosAll = fosAll;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostRequest withFosAll(String fosAll) {
        this.fosAll = fosAll;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssrrmajMajorIndVit")
    public String getSsrrmajMajorIndVit() {
        return ssrrmajMajorIndVit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssrrmajMajorIndVit")
    public void setSsrrmajMajorIndVit(String ssrrmajMajorIndVit) {
        this.ssrrmajMajorIndVit = ssrrmajMajorIndVit;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostRequest withSsrrmajMajorIndVit(String ssrrmajMajorIndVit) {
        this.ssrrmajMajorIndVit = ssrrmajMajorIndVit;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SSRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("ssrrmajLfstCode")
    public String getSsrrmajLfstCode() {
        return ssrrmajLfstCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SSRRMAJ_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("ssrrmajLfstCode")
    public void setSsrrmajLfstCode(String ssrrmajLfstCode) {
        this.ssrrmajLfstCode = ssrrmajLfstCode;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostRequest withSsrrmajLfstCode(String ssrrmajLfstCode) {
        this.ssrrmajLfstCode = ssrrmajLfstCode;
        return this;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrdepDeptIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrdepDeptIeCde")
    public Object getSsrrdepDeptIeCde() {
        return ssrrdepDeptIeCde;
    }

    /**
     * Include/Exclude (I/E):
     * <p>
     * Lineage reference object : ssrrdepDeptIeCde
     * (Required)
     * 
     */
    @JsonProperty("ssrrdepDeptIeCde")
    public void setSsrrdepDeptIeCde(Object ssrrdepDeptIeCde) {
        this.ssrrdepDeptIeCde = ssrrdepDeptIeCde;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostRequest withSsrrdepDeptIeCde(Object ssrrdepDeptIeCde) {
        this.ssrrdepDeptIeCde = ssrrdepDeptIeCde;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRRMAJ_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRRMAJ_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostRequest withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public SectionRestrictionDepartmentAndFieldOfStudy100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRestrictionDepartmentAndFieldOfStudy100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
        sb.append(',');
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
        sb.append(',');
        sb.append("fosAll");
        sb.append('=');
        sb.append(((this.fosAll == null)?"<null>":this.fosAll));
        sb.append(',');
        sb.append("ssrrmajMajorIndVit");
        sb.append('=');
        sb.append(((this.ssrrmajMajorIndVit == null)?"<null>":this.ssrrmajMajorIndVit));
        sb.append(',');
        sb.append("ssrrmajLfstCode");
        sb.append('=');
        sb.append(((this.ssrrmajLfstCode == null)?"<null>":this.ssrrmajLfstCode));
        sb.append(',');
        sb.append("ssrrdepDeptIeCde");
        sb.append('=');
        sb.append(((this.ssrrdepDeptIeCde == null)?"<null>":this.ssrrdepDeptIeCde));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
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
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
        result = ((result* 31)+((this.fosAll == null)? 0 :this.fosAll.hashCode()));
        result = ((result* 31)+((this.ssrrmajMajorIndVit == null)? 0 :this.ssrrmajMajorIndVit.hashCode()));
        result = ((result* 31)+((this.ssrrmajLfstCode == null)? 0 :this.ssrrmajLfstCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrrdepDeptIeCde == null)? 0 :this.ssrrdepDeptIeCde.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRestrictionDepartmentAndFieldOfStudy100PostRequest) == false) {
            return false;
        }
        SectionRestrictionDepartmentAndFieldOfStudy100PostRequest rhs = ((SectionRestrictionDepartmentAndFieldOfStudy100PostRequest) other);
        return ((((((((((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode)))&&((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn))))&&((this.fosAll == rhs.fosAll)||((this.fosAll!= null)&&this.fosAll.equals(rhs.fosAll))))&&((this.ssrrmajMajorIndVit == rhs.ssrrmajMajorIndVit)||((this.ssrrmajMajorIndVit!= null)&&this.ssrrmajMajorIndVit.equals(rhs.ssrrmajMajorIndVit))))&&((this.ssrrmajLfstCode == rhs.ssrrmajLfstCode)||((this.ssrrmajLfstCode!= null)&&this.ssrrmajLfstCode.equals(rhs.ssrrmajLfstCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrrdepDeptIeCde == rhs.ssrrdepDeptIeCde)||((this.ssrrdepDeptIeCde!= null)&&this.ssrrdepDeptIeCde.equals(rhs.ssrrdepDeptIeCde))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
