
package com.ellucian.generated.bpapi.ban.employee_jobs_excluded_deductions_benefits.v1_0_0;

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
    "queryDate",
    "suff",
    "bdcaCode",
    "criteria.bdcaDesc",
    "id",
    "criteria.bdcaCode",
    "posn"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsExcludedDeductionsBenefits100PutRequest {

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Lineage reference object : queryDate")
    private Date queryDate;
    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : suff")
    private String suff;
    /**
     * Code
     * <p>
     * Lineage reference object : NBRXDED_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : NBRXDED_BDCA_CODE")
    private String bdcaCode;
    @JsonProperty("criteria.bdcaDesc")
    private String criteriaBdcaDesc;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Code
     * <p>
     * Lineage reference object : NBRXDED_BDCA_CODE
     * 
     */
    @JsonProperty("criteria.bdcaCode")
    @JsonPropertyDescription("Lineage reference object : NBRXDED_BDCA_CODE")
    private String criteriaBdcaCode;
    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private String posn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public Date getQueryDate() {
        return queryDate;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(Date queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeJobsExcludedDeductionsBenefits100PutRequest withQueryDate(Date queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public EmployeeJobsExcludedDeductionsBenefits100PutRequest withSuff(String suff) {
        this.suff = suff;
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

    public EmployeeJobsExcludedDeductionsBenefits100PutRequest withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    @JsonProperty("criteria.bdcaDesc")
    public String getCriteriaBdcaDesc() {
        return criteriaBdcaDesc;
    }

    @JsonProperty("criteria.bdcaDesc")
    public void setCriteriaBdcaDesc(String criteriaBdcaDesc) {
        this.criteriaBdcaDesc = criteriaBdcaDesc;
    }

    public EmployeeJobsExcludedDeductionsBenefits100PutRequest withCriteriaBdcaDesc(String criteriaBdcaDesc) {
        this.criteriaBdcaDesc = criteriaBdcaDesc;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeJobsExcludedDeductionsBenefits100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : NBRXDED_BDCA_CODE
     * 
     */
    @JsonProperty("criteria.bdcaCode")
    public String getCriteriaBdcaCode() {
        return criteriaBdcaCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : NBRXDED_BDCA_CODE
     * 
     */
    @JsonProperty("criteria.bdcaCode")
    public void setCriteriaBdcaCode(String criteriaBdcaCode) {
        this.criteriaBdcaCode = criteriaBdcaCode;
    }

    public EmployeeJobsExcludedDeductionsBenefits100PutRequest withCriteriaBdcaCode(String criteriaBdcaCode) {
        this.criteriaBdcaCode = criteriaBdcaCode;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public EmployeeJobsExcludedDeductionsBenefits100PutRequest withPosn(String posn) {
        this.posn = posn;
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

    public EmployeeJobsExcludedDeductionsBenefits100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsExcludedDeductionsBenefits100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("criteriaBdcaDesc");
        sb.append('=');
        sb.append(((this.criteriaBdcaDesc == null)?"<null>":this.criteriaBdcaDesc));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaBdcaCode");
        sb.append('=');
        sb.append(((this.criteriaBdcaCode == null)?"<null>":this.criteriaBdcaCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
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
        result = ((result* 31)+((this.criteriaBdcaDesc == null)? 0 :this.criteriaBdcaDesc.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaBdcaCode == null)? 0 :this.criteriaBdcaCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeJobsExcludedDeductionsBenefits100PutRequest) == false) {
            return false;
        }
        EmployeeJobsExcludedDeductionsBenefits100PutRequest rhs = ((EmployeeJobsExcludedDeductionsBenefits100PutRequest) other);
        return (((((((((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate)))&&((this.criteriaBdcaDesc == rhs.criteriaBdcaDesc)||((this.criteriaBdcaDesc!= null)&&this.criteriaBdcaDesc.equals(rhs.criteriaBdcaDesc))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaBdcaCode == rhs.criteriaBdcaCode)||((this.criteriaBdcaCode!= null)&&this.criteriaBdcaCode.equals(rhs.criteriaBdcaCode))));
    }

}
