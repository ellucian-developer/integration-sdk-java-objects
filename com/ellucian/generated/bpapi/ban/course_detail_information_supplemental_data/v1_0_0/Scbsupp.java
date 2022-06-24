
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
    "topsDesc",
    "cudeCode",
    "cuddDescription",
    "cudfDescription",
    "topsCode",
    "occsDesc",
    "ccslDesc",
    "permDistInd",
    "cudbDescription",
    "ccslCode",
    "cudbCode",
    "cuddCode",
    "cudfCode",
    "creditCategoryInd",
    "cudeDescription",
    "coopEdInd",
    "cudaCode",
    "cudaDescription",
    "cudcCode",
    "cudcDescription",
    "occsCode"
})
@Generated("jsonschema2pojo")
public class Scbsupp {

    @JsonProperty("topsDesc")
    private String topsDesc;
    /**
     * Element 5
     * <p>
     * Lineage reference object : SCBSUPP_CUDE_CODE, Lookup lineage reference object : stvcude
     * 
     */
    @JsonProperty("cudeCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDE_CODE, Lookup lineage reference object : stvcude")
    private String cudeCode;
    @JsonProperty("cuddDescription")
    private String cuddDescription;
    @JsonProperty("cudfDescription")
    private String cudfDescription;
    /**
     * Taxonomy of Program
     * <p>
     * Lineage reference object : SCBSUPP_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_TOPS_CODE, Lookup lineage reference object : stvtops")
    private String topsCode;
    @JsonProperty("occsDesc")
    private String occsDesc;
    @JsonProperty("ccslDesc")
    private String ccslDesc;
    /**
     * Course Identifier
     * <p>
     * Lineage reference object : SCBSUPP_PERM_DIST_IND
     * 
     */
    @JsonProperty("permDistInd")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_PERM_DIST_IND")
    private String permDistInd;
    @JsonProperty("cudbDescription")
    private String cudbDescription;
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
     * Element 2
     * <p>
     * Lineage reference object : SCBSUPP_CUDB_CODE, Lookup lineage reference object : stvcudb
     * 
     */
    @JsonProperty("cudbCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDB_CODE, Lookup lineage reference object : stvcudb")
    private String cudbCode;
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
     * Element 6
     * <p>
     * Lineage reference object : SCBSUPP_CUDF_CODE, Lookup lineage reference object : STVCUDF
     * 
     */
    @JsonProperty("cudfCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDF_CODE, Lookup lineage reference object : STVCUDF")
    private String cudfCode;
    /**
     * Credit Category
     * <p>
     * Lineage reference object : SCBSUPP_CREDIT_CATEGORY_IND
     * 
     */
    @JsonProperty("creditCategoryInd")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CREDIT_CATEGORY_IND")
    private String creditCategoryInd;
    @JsonProperty("cudeDescription")
    private String cudeDescription;
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
     * Element 1
     * <p>
     * Lineage reference object : SCBSUPP_CUDA_CODE, Lookup lineage reference object : stvcuda
     * 
     */
    @JsonProperty("cudaCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDA_CODE, Lookup lineage reference object : stvcuda")
    private String cudaCode;
    @JsonProperty("cudaDescription")
    private String cudaDescription;
    /**
     * Element 3
     * <p>
     * Lineage reference object : SCBSUPP_CUDC_CODE, Lookup lineage reference object : stvcudc
     * 
     */
    @JsonProperty("cudcCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_CUDC_CODE, Lookup lineage reference object : stvcudc")
    private String cudcCode;
    @JsonProperty("cudcDescription")
    private String cudcDescription;
    /**
     * Occupational Course
     * <p>
     * Lineage reference object : SCBSUPP_OCCS_CODE, Lookup lineage reference object : stvoccs
     * 
     */
    @JsonProperty("occsCode")
    @JsonPropertyDescription("Lineage reference object : SCBSUPP_OCCS_CODE, Lookup lineage reference object : stvoccs")
    private String occsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("topsDesc")
    public String getTopsDesc() {
        return topsDesc;
    }

    @JsonProperty("topsDesc")
    public void setTopsDesc(String topsDesc) {
        this.topsDesc = topsDesc;
    }

    public Scbsupp withTopsDesc(String topsDesc) {
        this.topsDesc = topsDesc;
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

    public Scbsupp withCudeCode(String cudeCode) {
        this.cudeCode = cudeCode;
        return this;
    }

    @JsonProperty("cuddDescription")
    public String getCuddDescription() {
        return cuddDescription;
    }

    @JsonProperty("cuddDescription")
    public void setCuddDescription(String cuddDescription) {
        this.cuddDescription = cuddDescription;
    }

    public Scbsupp withCuddDescription(String cuddDescription) {
        this.cuddDescription = cuddDescription;
        return this;
    }

    @JsonProperty("cudfDescription")
    public String getCudfDescription() {
        return cudfDescription;
    }

    @JsonProperty("cudfDescription")
    public void setCudfDescription(String cudfDescription) {
        this.cudfDescription = cudfDescription;
    }

    public Scbsupp withCudfDescription(String cudfDescription) {
        this.cudfDescription = cudfDescription;
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

    public Scbsupp withTopsCode(String topsCode) {
        this.topsCode = topsCode;
        return this;
    }

    @JsonProperty("occsDesc")
    public String getOccsDesc() {
        return occsDesc;
    }

    @JsonProperty("occsDesc")
    public void setOccsDesc(String occsDesc) {
        this.occsDesc = occsDesc;
    }

    public Scbsupp withOccsDesc(String occsDesc) {
        this.occsDesc = occsDesc;
        return this;
    }

    @JsonProperty("ccslDesc")
    public String getCcslDesc() {
        return ccslDesc;
    }

    @JsonProperty("ccslDesc")
    public void setCcslDesc(String ccslDesc) {
        this.ccslDesc = ccslDesc;
    }

    public Scbsupp withCcslDesc(String ccslDesc) {
        this.ccslDesc = ccslDesc;
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

    public Scbsupp withPermDistInd(String permDistInd) {
        this.permDistInd = permDistInd;
        return this;
    }

    @JsonProperty("cudbDescription")
    public String getCudbDescription() {
        return cudbDescription;
    }

    @JsonProperty("cudbDescription")
    public void setCudbDescription(String cudbDescription) {
        this.cudbDescription = cudbDescription;
    }

    public Scbsupp withCudbDescription(String cudbDescription) {
        this.cudbDescription = cudbDescription;
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

    public Scbsupp withCcslCode(String ccslCode) {
        this.ccslCode = ccslCode;
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

    public Scbsupp withCudbCode(String cudbCode) {
        this.cudbCode = cudbCode;
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

    public Scbsupp withCuddCode(String cuddCode) {
        this.cuddCode = cuddCode;
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

    public Scbsupp withCudfCode(String cudfCode) {
        this.cudfCode = cudfCode;
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

    public Scbsupp withCreditCategoryInd(String creditCategoryInd) {
        this.creditCategoryInd = creditCategoryInd;
        return this;
    }

    @JsonProperty("cudeDescription")
    public String getCudeDescription() {
        return cudeDescription;
    }

    @JsonProperty("cudeDescription")
    public void setCudeDescription(String cudeDescription) {
        this.cudeDescription = cudeDescription;
    }

    public Scbsupp withCudeDescription(String cudeDescription) {
        this.cudeDescription = cudeDescription;
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

    public Scbsupp withCoopEdInd(String coopEdInd) {
        this.coopEdInd = coopEdInd;
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

    public Scbsupp withCudaCode(String cudaCode) {
        this.cudaCode = cudaCode;
        return this;
    }

    @JsonProperty("cudaDescription")
    public String getCudaDescription() {
        return cudaDescription;
    }

    @JsonProperty("cudaDescription")
    public void setCudaDescription(String cudaDescription) {
        this.cudaDescription = cudaDescription;
    }

    public Scbsupp withCudaDescription(String cudaDescription) {
        this.cudaDescription = cudaDescription;
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

    public Scbsupp withCudcCode(String cudcCode) {
        this.cudcCode = cudcCode;
        return this;
    }

    @JsonProperty("cudcDescription")
    public String getCudcDescription() {
        return cudcDescription;
    }

    @JsonProperty("cudcDescription")
    public void setCudcDescription(String cudcDescription) {
        this.cudcDescription = cudcDescription;
    }

    public Scbsupp withCudcDescription(String cudcDescription) {
        this.cudcDescription = cudcDescription;
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

    public Scbsupp withOccsCode(String occsCode) {
        this.occsCode = occsCode;
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

    public Scbsupp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scbsupp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("topsDesc");
        sb.append('=');
        sb.append(((this.topsDesc == null)?"<null>":this.topsDesc));
        sb.append(',');
        sb.append("cudeCode");
        sb.append('=');
        sb.append(((this.cudeCode == null)?"<null>":this.cudeCode));
        sb.append(',');
        sb.append("cuddDescription");
        sb.append('=');
        sb.append(((this.cuddDescription == null)?"<null>":this.cuddDescription));
        sb.append(',');
        sb.append("cudfDescription");
        sb.append('=');
        sb.append(((this.cudfDescription == null)?"<null>":this.cudfDescription));
        sb.append(',');
        sb.append("topsCode");
        sb.append('=');
        sb.append(((this.topsCode == null)?"<null>":this.topsCode));
        sb.append(',');
        sb.append("occsDesc");
        sb.append('=');
        sb.append(((this.occsDesc == null)?"<null>":this.occsDesc));
        sb.append(',');
        sb.append("ccslDesc");
        sb.append('=');
        sb.append(((this.ccslDesc == null)?"<null>":this.ccslDesc));
        sb.append(',');
        sb.append("permDistInd");
        sb.append('=');
        sb.append(((this.permDistInd == null)?"<null>":this.permDistInd));
        sb.append(',');
        sb.append("cudbDescription");
        sb.append('=');
        sb.append(((this.cudbDescription == null)?"<null>":this.cudbDescription));
        sb.append(',');
        sb.append("ccslCode");
        sb.append('=');
        sb.append(((this.ccslCode == null)?"<null>":this.ccslCode));
        sb.append(',');
        sb.append("cudbCode");
        sb.append('=');
        sb.append(((this.cudbCode == null)?"<null>":this.cudbCode));
        sb.append(',');
        sb.append("cuddCode");
        sb.append('=');
        sb.append(((this.cuddCode == null)?"<null>":this.cuddCode));
        sb.append(',');
        sb.append("cudfCode");
        sb.append('=');
        sb.append(((this.cudfCode == null)?"<null>":this.cudfCode));
        sb.append(',');
        sb.append("creditCategoryInd");
        sb.append('=');
        sb.append(((this.creditCategoryInd == null)?"<null>":this.creditCategoryInd));
        sb.append(',');
        sb.append("cudeDescription");
        sb.append('=');
        sb.append(((this.cudeDescription == null)?"<null>":this.cudeDescription));
        sb.append(',');
        sb.append("coopEdInd");
        sb.append('=');
        sb.append(((this.coopEdInd == null)?"<null>":this.coopEdInd));
        sb.append(',');
        sb.append("cudaCode");
        sb.append('=');
        sb.append(((this.cudaCode == null)?"<null>":this.cudaCode));
        sb.append(',');
        sb.append("cudaDescription");
        sb.append('=');
        sb.append(((this.cudaDescription == null)?"<null>":this.cudaDescription));
        sb.append(',');
        sb.append("cudcCode");
        sb.append('=');
        sb.append(((this.cudcCode == null)?"<null>":this.cudcCode));
        sb.append(',');
        sb.append("cudcDescription");
        sb.append('=');
        sb.append(((this.cudcDescription == null)?"<null>":this.cudcDescription));
        sb.append(',');
        sb.append("occsCode");
        sb.append('=');
        sb.append(((this.occsCode == null)?"<null>":this.occsCode));
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
        result = ((result* 31)+((this.topsDesc == null)? 0 :this.topsDesc.hashCode()));
        result = ((result* 31)+((this.cudeCode == null)? 0 :this.cudeCode.hashCode()));
        result = ((result* 31)+((this.cuddDescription == null)? 0 :this.cuddDescription.hashCode()));
        result = ((result* 31)+((this.cudfDescription == null)? 0 :this.cudfDescription.hashCode()));
        result = ((result* 31)+((this.topsCode == null)? 0 :this.topsCode.hashCode()));
        result = ((result* 31)+((this.occsDesc == null)? 0 :this.occsDesc.hashCode()));
        result = ((result* 31)+((this.ccslDesc == null)? 0 :this.ccslDesc.hashCode()));
        result = ((result* 31)+((this.permDistInd == null)? 0 :this.permDistInd.hashCode()));
        result = ((result* 31)+((this.cudbDescription == null)? 0 :this.cudbDescription.hashCode()));
        result = ((result* 31)+((this.ccslCode == null)? 0 :this.ccslCode.hashCode()));
        result = ((result* 31)+((this.cudbCode == null)? 0 :this.cudbCode.hashCode()));
        result = ((result* 31)+((this.cuddCode == null)? 0 :this.cuddCode.hashCode()));
        result = ((result* 31)+((this.cudfCode == null)? 0 :this.cudfCode.hashCode()));
        result = ((result* 31)+((this.creditCategoryInd == null)? 0 :this.creditCategoryInd.hashCode()));
        result = ((result* 31)+((this.cudeDescription == null)? 0 :this.cudeDescription.hashCode()));
        result = ((result* 31)+((this.coopEdInd == null)? 0 :this.coopEdInd.hashCode()));
        result = ((result* 31)+((this.cudaCode == null)? 0 :this.cudaCode.hashCode()));
        result = ((result* 31)+((this.cudaDescription == null)? 0 :this.cudaDescription.hashCode()));
        result = ((result* 31)+((this.cudcCode == null)? 0 :this.cudcCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cudcDescription == null)? 0 :this.cudcDescription.hashCode()));
        result = ((result* 31)+((this.occsCode == null)? 0 :this.occsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scbsupp) == false) {
            return false;
        }
        Scbsupp rhs = ((Scbsupp) other);
        return (((((((((((((((((((((((this.topsDesc == rhs.topsDesc)||((this.topsDesc!= null)&&this.topsDesc.equals(rhs.topsDesc)))&&((this.cudeCode == rhs.cudeCode)||((this.cudeCode!= null)&&this.cudeCode.equals(rhs.cudeCode))))&&((this.cuddDescription == rhs.cuddDescription)||((this.cuddDescription!= null)&&this.cuddDescription.equals(rhs.cuddDescription))))&&((this.cudfDescription == rhs.cudfDescription)||((this.cudfDescription!= null)&&this.cudfDescription.equals(rhs.cudfDescription))))&&((this.topsCode == rhs.topsCode)||((this.topsCode!= null)&&this.topsCode.equals(rhs.topsCode))))&&((this.occsDesc == rhs.occsDesc)||((this.occsDesc!= null)&&this.occsDesc.equals(rhs.occsDesc))))&&((this.ccslDesc == rhs.ccslDesc)||((this.ccslDesc!= null)&&this.ccslDesc.equals(rhs.ccslDesc))))&&((this.permDistInd == rhs.permDistInd)||((this.permDistInd!= null)&&this.permDistInd.equals(rhs.permDistInd))))&&((this.cudbDescription == rhs.cudbDescription)||((this.cudbDescription!= null)&&this.cudbDescription.equals(rhs.cudbDescription))))&&((this.ccslCode == rhs.ccslCode)||((this.ccslCode!= null)&&this.ccslCode.equals(rhs.ccslCode))))&&((this.cudbCode == rhs.cudbCode)||((this.cudbCode!= null)&&this.cudbCode.equals(rhs.cudbCode))))&&((this.cuddCode == rhs.cuddCode)||((this.cuddCode!= null)&&this.cuddCode.equals(rhs.cuddCode))))&&((this.cudfCode == rhs.cudfCode)||((this.cudfCode!= null)&&this.cudfCode.equals(rhs.cudfCode))))&&((this.creditCategoryInd == rhs.creditCategoryInd)||((this.creditCategoryInd!= null)&&this.creditCategoryInd.equals(rhs.creditCategoryInd))))&&((this.cudeDescription == rhs.cudeDescription)||((this.cudeDescription!= null)&&this.cudeDescription.equals(rhs.cudeDescription))))&&((this.coopEdInd == rhs.coopEdInd)||((this.coopEdInd!= null)&&this.coopEdInd.equals(rhs.coopEdInd))))&&((this.cudaCode == rhs.cudaCode)||((this.cudaCode!= null)&&this.cudaCode.equals(rhs.cudaCode))))&&((this.cudaDescription == rhs.cudaDescription)||((this.cudaDescription!= null)&&this.cudaDescription.equals(rhs.cudaDescription))))&&((this.cudcCode == rhs.cudcCode)||((this.cudcCode!= null)&&this.cudcCode.equals(rhs.cudcCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cudcDescription == rhs.cudcDescription)||((this.cudcDescription!= null)&&this.cudcDescription.equals(rhs.cudcDescription))))&&((this.occsCode == rhs.occsCode)||((this.occsCode!= null)&&this.occsCode.equals(rhs.occsCode))));
    }

}
