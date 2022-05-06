
package com.ellucian.generated.bpapi.ban.employee_jobs_excluded_deductions_benefits.v1_0_0;

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
    "id",
    "posn",
    "suff",
    "queryDate",
    "bdcaCode"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsExcludedDeductionsBenefits100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("posn")
    private String posn;
    @JsonProperty("suff")
    private String suff;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    private String queryDate;
    /**
     * Code
     * <p>
     * Lineage reference object : NBRXDED_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : NBRXDED_BDCA_CODE")
    private String bdcaCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeJobsExcludedDeductionsBenefits100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public EmployeeJobsExcludedDeductionsBenefits100QapiPost withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public EmployeeJobsExcludedDeductionsBenefits100QapiPost withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public String getQueryDate() {
        return queryDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeJobsExcludedDeductionsBenefits100QapiPost withQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : NBRXDED_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : NBRXDED_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public EmployeeJobsExcludedDeductionsBenefits100QapiPost withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
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

    public EmployeeJobsExcludedDeductionsBenefits100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsExcludedDeductionsBenefits100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
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
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeJobsExcludedDeductionsBenefits100QapiPost) == false) {
            return false;
        }
        EmployeeJobsExcludedDeductionsBenefits100QapiPost rhs = ((EmployeeJobsExcludedDeductionsBenefits100QapiPost) other);
        return (((((((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate)))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))));
    }

}
