
package com.ellucian.generated.bpapi.ban.course_detail_information_supplemental_data.v1_0_0;

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
    "scacrseSubjCode",
    "scacrseCrseNumb",
    "scacrseTermCodeEff",
    "topsCode",
    "occsCode",
    "ccslCode",
    "coopEdInd",
    "permDistInd",
    "creditCategoryInd",
    "cudaCode",
    "cudbCode",
    "cudcCode",
    "cuddCode",
    "cudeCode",
    "cudfCode"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationSupplementalData100QapiPost {

    @JsonProperty("scacrseSubjCode")
    private String scacrseSubjCode;
    @JsonProperty("scacrseCrseNumb")
    private String scacrseCrseNumb;
    @JsonProperty("scacrseTermCodeEff")
    private String scacrseTermCodeEff;
    /**
     * Taxonomy of Program
     * <p>
     * Lineage reference object : SCBSUPP_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_TOPS_CODE, Lookup lineage reference object : stvtops")
    private String topsCode;
    /**
     * Occupational Course
     * <p>
     * Lineage reference object : SCBSUPP_OCCS_CODE, Lookup lineage reference object : stvoccs
     * 
     */
    @JsonProperty("occsCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_OCCS_CODE, Lookup lineage reference object : stvoccs")
    private String occsCode;
    /**
     * Classification
     * <p>
     * Lineage reference object : SCBSUPP_CCSL_CODE, Lookup lineage reference object : stvccsl
     * 
     */
    @JsonProperty("ccslCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CCSL_CODE, Lookup lineage reference object : stvccsl")
    private String ccslCode;
    /**
     * Cooperative Education
     * <p>
     * Lineage reference object : SCBSUPP_COOP_ED_IND
     * 
     */
    @JsonProperty("coopEdInd")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_COOP_ED_IND")
    private String coopEdInd;
    /**
     * Course Identifier
     * <p>
     * Lineage reference object : SCBSUPP_PERM_DIST_IND
     * 
     */
    @JsonProperty("permDistInd")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_PERM_DIST_IND")
    private String permDistInd;
    /**
     * Credit Category
     * <p>
     * Lineage reference object : SCBSUPP_CREDIT_CATEGORY_IND
     * 
     */
    @JsonProperty("creditCategoryInd")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CREDIT_CATEGORY_IND")
    private String creditCategoryInd;
    /**
     * Element 1
     * <p>
     * Lineage reference object : SCBSUPP_CUDA_CODE, Lookup lineage reference object : stvcuda
     * 
     */
    @JsonProperty("cudaCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDA_CODE, Lookup lineage reference object : stvcuda")
    private String cudaCode;
    /**
     * Element 2
     * <p>
     * Lineage reference object : SCBSUPP_CUDB_CODE, Lookup lineage reference object : stvcudb
     * 
     */
    @JsonProperty("cudbCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDB_CODE, Lookup lineage reference object : stvcudb")
    private String cudbCode;
    /**
     * Element 3
     * <p>
     * Lineage reference object : SCBSUPP_CUDC_CODE, Lookup lineage reference object : stvcudc
     * 
     */
    @JsonProperty("cudcCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDC_CODE, Lookup lineage reference object : stvcudc")
    private String cudcCode;
    /**
     * Element 4
     * <p>
     * Lineage reference object : SCBSUPP_CUDD_CODE, Lookup lineage reference object : stvcudd
     * 
     */
    @JsonProperty("cuddCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDD_CODE, Lookup lineage reference object : stvcudd")
    private String cuddCode;
    /**
     * Element 5
     * <p>
     * Lineage reference object : SCBSUPP_CUDE_CODE, Lookup lineage reference object : stvcude
     * 
     */
    @JsonProperty("cudeCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDE_CODE, Lookup lineage reference object : stvcude")
    private String cudeCode;
    /**
     * Element 6
     * <p>
     * Lineage reference object : SCBSUPP_CUDF_CODE, Lookup lineage reference object : STVCUDF
     * 
     */
    @JsonProperty("cudfCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDF_CODE, Lookup lineage reference object : STVCUDF")
    private String cudfCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scacrseSubjCode")
    public String getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    @JsonProperty("scacrseCrseNumb")
    public String getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public CourseDetailInformationSupplementalData100QapiPost withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    @JsonProperty("scacrseTermCodeEff")
    public String getScacrseTermCodeEff() {
        return scacrseTermCodeEff;
    }

    @JsonProperty("scacrseTermCodeEff")
    public void setScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
    }

    public CourseDetailInformationSupplementalData100QapiPost withScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
        return this;
    }

    /**
     * Taxonomy of Program
     * <p>
     * Lineage reference object : SCBSUPP_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public String getTopsCode() {
        return topsCode;
    }

    /**
     * Taxonomy of Program
     * <p>
     * Lineage reference object : SCBSUPP_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public void setTopsCode(String topsCode) {
        this.topsCode = topsCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withTopsCode(String topsCode) {
        this.topsCode = topsCode;
        return this;
    }

    /**
     * Occupational Course
     * <p>
     * Lineage reference object : SCBSUPP_OCCS_CODE, Lookup lineage reference object : stvoccs
     * 
     */
    @JsonProperty("occsCode")
    public String getOccsCode() {
        return occsCode;
    }

    /**
     * Occupational Course
     * <p>
     * Lineage reference object : SCBSUPP_OCCS_CODE, Lookup lineage reference object : stvoccs
     * 
     */
    @JsonProperty("occsCode")
    public void setOccsCode(String occsCode) {
        this.occsCode = occsCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withOccsCode(String occsCode) {
        this.occsCode = occsCode;
        return this;
    }

    /**
     * Classification
     * <p>
     * Lineage reference object : SCBSUPP_CCSL_CODE, Lookup lineage reference object : stvccsl
     * 
     */
    @JsonProperty("ccslCode")
    public String getCcslCode() {
        return ccslCode;
    }

    /**
     * Classification
     * <p>
     * Lineage reference object : SCBSUPP_CCSL_CODE, Lookup lineage reference object : stvccsl
     * 
     */
    @JsonProperty("ccslCode")
    public void setCcslCode(String ccslCode) {
        this.ccslCode = ccslCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withCcslCode(String ccslCode) {
        this.ccslCode = ccslCode;
        return this;
    }

    /**
     * Cooperative Education
     * <p>
     * Lineage reference object : SCBSUPP_COOP_ED_IND
     * 
     */
    @JsonProperty("coopEdInd")
    public String getCoopEdInd() {
        return coopEdInd;
    }

    /**
     * Cooperative Education
     * <p>
     * Lineage reference object : SCBSUPP_COOP_ED_IND
     * 
     */
    @JsonProperty("coopEdInd")
    public void setCoopEdInd(String coopEdInd) {
        this.coopEdInd = coopEdInd;
    }

    public CourseDetailInformationSupplementalData100QapiPost withCoopEdInd(String coopEdInd) {
        this.coopEdInd = coopEdInd;
        return this;
    }

    /**
     * Course Identifier
     * <p>
     * Lineage reference object : SCBSUPP_PERM_DIST_IND
     * 
     */
    @JsonProperty("permDistInd")
    public String getPermDistInd() {
        return permDistInd;
    }

    /**
     * Course Identifier
     * <p>
     * Lineage reference object : SCBSUPP_PERM_DIST_IND
     * 
     */
    @JsonProperty("permDistInd")
    public void setPermDistInd(String permDistInd) {
        this.permDistInd = permDistInd;
    }

    public CourseDetailInformationSupplementalData100QapiPost withPermDistInd(String permDistInd) {
        this.permDistInd = permDistInd;
        return this;
    }

    /**
     * Credit Category
     * <p>
     * Lineage reference object : SCBSUPP_CREDIT_CATEGORY_IND
     * 
     */
    @JsonProperty("creditCategoryInd")
    public String getCreditCategoryInd() {
        return creditCategoryInd;
    }

    /**
     * Credit Category
     * <p>
     * Lineage reference object : SCBSUPP_CREDIT_CATEGORY_IND
     * 
     */
    @JsonProperty("creditCategoryInd")
    public void setCreditCategoryInd(String creditCategoryInd) {
        this.creditCategoryInd = creditCategoryInd;
    }

    public CourseDetailInformationSupplementalData100QapiPost withCreditCategoryInd(String creditCategoryInd) {
        this.creditCategoryInd = creditCategoryInd;
        return this;
    }

    /**
     * Element 1
     * <p>
     * Lineage reference object : SCBSUPP_CUDA_CODE, Lookup lineage reference object : stvcuda
     * 
     */
    @JsonProperty("cudaCode")
    public String getCudaCode() {
        return cudaCode;
    }

    /**
     * Element 1
     * <p>
     * Lineage reference object : SCBSUPP_CUDA_CODE, Lookup lineage reference object : stvcuda
     * 
     */
    @JsonProperty("cudaCode")
    public void setCudaCode(String cudaCode) {
        this.cudaCode = cudaCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withCudaCode(String cudaCode) {
        this.cudaCode = cudaCode;
        return this;
    }

    /**
     * Element 2
     * <p>
     * Lineage reference object : SCBSUPP_CUDB_CODE, Lookup lineage reference object : stvcudb
     * 
     */
    @JsonProperty("cudbCode")
    public String getCudbCode() {
        return cudbCode;
    }

    /**
     * Element 2
     * <p>
     * Lineage reference object : SCBSUPP_CUDB_CODE, Lookup lineage reference object : stvcudb
     * 
     */
    @JsonProperty("cudbCode")
    public void setCudbCode(String cudbCode) {
        this.cudbCode = cudbCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withCudbCode(String cudbCode) {
        this.cudbCode = cudbCode;
        return this;
    }

    /**
     * Element 3
     * <p>
     * Lineage reference object : SCBSUPP_CUDC_CODE, Lookup lineage reference object : stvcudc
     * 
     */
    @JsonProperty("cudcCode")
    public String getCudcCode() {
        return cudcCode;
    }

    /**
     * Element 3
     * <p>
     * Lineage reference object : SCBSUPP_CUDC_CODE, Lookup lineage reference object : stvcudc
     * 
     */
    @JsonProperty("cudcCode")
    public void setCudcCode(String cudcCode) {
        this.cudcCode = cudcCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withCudcCode(String cudcCode) {
        this.cudcCode = cudcCode;
        return this;
    }

    /**
     * Element 4
     * <p>
     * Lineage reference object : SCBSUPP_CUDD_CODE, Lookup lineage reference object : stvcudd
     * 
     */
    @JsonProperty("cuddCode")
    public String getCuddCode() {
        return cuddCode;
    }

    /**
     * Element 4
     * <p>
     * Lineage reference object : SCBSUPP_CUDD_CODE, Lookup lineage reference object : stvcudd
     * 
     */
    @JsonProperty("cuddCode")
    public void setCuddCode(String cuddCode) {
        this.cuddCode = cuddCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withCuddCode(String cuddCode) {
        this.cuddCode = cuddCode;
        return this;
    }

    /**
     * Element 5
     * <p>
     * Lineage reference object : SCBSUPP_CUDE_CODE, Lookup lineage reference object : stvcude
     * 
     */
    @JsonProperty("cudeCode")
    public String getCudeCode() {
        return cudeCode;
    }

    /**
     * Element 5
     * <p>
     * Lineage reference object : SCBSUPP_CUDE_CODE, Lookup lineage reference object : stvcude
     * 
     */
    @JsonProperty("cudeCode")
    public void setCudeCode(String cudeCode) {
        this.cudeCode = cudeCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withCudeCode(String cudeCode) {
        this.cudeCode = cudeCode;
        return this;
    }

    /**
     * Element 6
     * <p>
     * Lineage reference object : SCBSUPP_CUDF_CODE, Lookup lineage reference object : STVCUDF
     * 
     */
    @JsonProperty("cudfCode")
    public String getCudfCode() {
        return cudfCode;
    }

    /**
     * Element 6
     * <p>
     * Lineage reference object : SCBSUPP_CUDF_CODE, Lookup lineage reference object : STVCUDF
     * 
     */
    @JsonProperty("cudfCode")
    public void setCudfCode(String cudfCode) {
        this.cudfCode = cudfCode;
    }

    public CourseDetailInformationSupplementalData100QapiPost withCudfCode(String cudfCode) {
        this.cudfCode = cudfCode;
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

    public CourseDetailInformationSupplementalData100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationSupplementalData100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
        sb.append(',');
        sb.append("topsCode");
        sb.append('=');
        sb.append(((this.topsCode == null)?"<null>":this.topsCode));
        sb.append(',');
        sb.append("occsCode");
        sb.append('=');
        sb.append(((this.occsCode == null)?"<null>":this.occsCode));
        sb.append(',');
        sb.append("ccslCode");
        sb.append('=');
        sb.append(((this.ccslCode == null)?"<null>":this.ccslCode));
        sb.append(',');
        sb.append("coopEdInd");
        sb.append('=');
        sb.append(((this.coopEdInd == null)?"<null>":this.coopEdInd));
        sb.append(',');
        sb.append("permDistInd");
        sb.append('=');
        sb.append(((this.permDistInd == null)?"<null>":this.permDistInd));
        sb.append(',');
        sb.append("creditCategoryInd");
        sb.append('=');
        sb.append(((this.creditCategoryInd == null)?"<null>":this.creditCategoryInd));
        sb.append(',');
        sb.append("cudaCode");
        sb.append('=');
        sb.append(((this.cudaCode == null)?"<null>":this.cudaCode));
        sb.append(',');
        sb.append("cudbCode");
        sb.append('=');
        sb.append(((this.cudbCode == null)?"<null>":this.cudbCode));
        sb.append(',');
        sb.append("cudcCode");
        sb.append('=');
        sb.append(((this.cudcCode == null)?"<null>":this.cudcCode));
        sb.append(',');
        sb.append("cuddCode");
        sb.append('=');
        sb.append(((this.cuddCode == null)?"<null>":this.cuddCode));
        sb.append(',');
        sb.append("cudeCode");
        sb.append('=');
        sb.append(((this.cudeCode == null)?"<null>":this.cudeCode));
        sb.append(',');
        sb.append("cudfCode");
        sb.append('=');
        sb.append(((this.cudfCode == null)?"<null>":this.cudfCode));
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
        result = ((result* 31)+((this.cudeCode == null)? 0 :this.cudeCode.hashCode()));
        result = ((result* 31)+((this.topsCode == null)? 0 :this.topsCode.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.permDistInd == null)? 0 :this.permDistInd.hashCode()));
        result = ((result* 31)+((this.ccslCode == null)? 0 :this.ccslCode.hashCode()));
        result = ((result* 31)+((this.cudbCode == null)? 0 :this.cudbCode.hashCode()));
        result = ((result* 31)+((this.cuddCode == null)? 0 :this.cuddCode.hashCode()));
        result = ((result* 31)+((this.cudfCode == null)? 0 :this.cudfCode.hashCode()));
        result = ((result* 31)+((this.creditCategoryInd == null)? 0 :this.creditCategoryInd.hashCode()));
        result = ((result* 31)+((this.coopEdInd == null)? 0 :this.coopEdInd.hashCode()));
        result = ((result* 31)+((this.cudaCode == null)? 0 :this.cudaCode.hashCode()));
        result = ((result* 31)+((this.cudcCode == null)? 0 :this.cudcCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseTermCodeEff == null)? 0 :this.scacrseTermCodeEff.hashCode()));
        result = ((result* 31)+((this.occsCode == null)? 0 :this.occsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationSupplementalData100QapiPost) == false) {
            return false;
        }
        CourseDetailInformationSupplementalData100QapiPost rhs = ((CourseDetailInformationSupplementalData100QapiPost) other);
        return (((((((((((((((((this.cudeCode == rhs.cudeCode)||((this.cudeCode!= null)&&this.cudeCode.equals(rhs.cudeCode)))&&((this.topsCode == rhs.topsCode)||((this.topsCode!= null)&&this.topsCode.equals(rhs.topsCode))))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.permDistInd == rhs.permDistInd)||((this.permDistInd!= null)&&this.permDistInd.equals(rhs.permDistInd))))&&((this.ccslCode == rhs.ccslCode)||((this.ccslCode!= null)&&this.ccslCode.equals(rhs.ccslCode))))&&((this.cudbCode == rhs.cudbCode)||((this.cudbCode!= null)&&this.cudbCode.equals(rhs.cudbCode))))&&((this.cuddCode == rhs.cuddCode)||((this.cuddCode!= null)&&this.cuddCode.equals(rhs.cuddCode))))&&((this.cudfCode == rhs.cudfCode)||((this.cudfCode!= null)&&this.cudfCode.equals(rhs.cudfCode))))&&((this.creditCategoryInd == rhs.creditCategoryInd)||((this.creditCategoryInd!= null)&&this.creditCategoryInd.equals(rhs.creditCategoryInd))))&&((this.coopEdInd == rhs.coopEdInd)||((this.coopEdInd!= null)&&this.coopEdInd.equals(rhs.coopEdInd))))&&((this.cudaCode == rhs.cudaCode)||((this.cudaCode!= null)&&this.cudaCode.equals(rhs.cudaCode))))&&((this.cudcCode == rhs.cudcCode)||((this.cudcCode!= null)&&this.cudcCode.equals(rhs.cudcCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))))&&((this.occsCode == rhs.occsCode)||((this.occsCode!= null)&&this.occsCode.equals(rhs.occsCode))));
    }

}
