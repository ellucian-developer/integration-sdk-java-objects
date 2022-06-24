
package com.ellucian.generated.bpapi.ban.employee_status_change_emcumbrance.v1_0_0;

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
    "salaryEncumbrance",
    "detailEncumbranceHrs",
    "dataSeparatorLine1",
    "contractBeginDate",
    "totalSalaryEnc",
    "dataSeparatorLine0",
    "contractEndDate",
    "totalContractHrs",
    "futureSalaryEnc",
    "totalEncumbranceHrs"
})
@Generated("jsonschema2pojo")
public class FormHeader {

    /**
     * Current Fiscal Year
     * <p>
     * Lineage reference object : salaryEncumbrance
     * 
     */
    @JsonProperty("salaryEncumbrance")
    @JsonPropertyDescription("Lineage reference object : salaryEncumbrance")
    private Double salaryEncumbrance;
    /**
     * Encumbrance Hours
     * <p>
     * Lineage reference object : detailEncumbranceHrs
     * 
     */
    @JsonProperty("detailEncumbranceHrs")
    @JsonPropertyDescription("Lineage reference object : detailEncumbranceHrs")
    private Double detailEncumbranceHrs;
    /**
     * Lineage reference object : dataSeparatorLine1
     * 
     */
    @JsonProperty("dataSeparatorLine1")
    @JsonPropertyDescription("Lineage reference object : dataSeparatorLine1")
    private String dataSeparatorLine1;
    /**
     * Start Date
     * <p>
     * Lineage reference object : contractBeginDate
     * 
     */
    @JsonProperty("contractBeginDate")
    @JsonPropertyDescription("Lineage reference object : contractBeginDate")
    private Date contractBeginDate;
    /**
     * Total Encumbrance
     * <p>
     * Lineage reference object : totalSalaryEnc
     * 
     */
    @JsonProperty("totalSalaryEnc")
    @JsonPropertyDescription("Lineage reference object : totalSalaryEnc")
    private Double totalSalaryEnc;
    /**
     * Lineage reference object : dataSeparatorLine0
     * 
     */
    @JsonProperty("dataSeparatorLine0")
    @JsonPropertyDescription("Lineage reference object : dataSeparatorLine0")
    private String dataSeparatorLine0;
    /**
     * End Date
     * <p>
     * Lineage reference object : contractEndDate
     * 
     */
    @JsonProperty("contractEndDate")
    @JsonPropertyDescription("Lineage reference object : contractEndDate")
    private Date contractEndDate;
    /**
     * Total Contract Hours
     * <p>
     * Lineage reference object : totalContractHrs
     * 
     */
    @JsonProperty("totalContractHrs")
    @JsonPropertyDescription("Lineage reference object : totalContractHrs")
    private Double totalContractHrs;
    /**
     * Future Years
     * <p>
     * Lineage reference object : futureSalaryEnc
     * 
     */
    @JsonProperty("futureSalaryEnc")
    @JsonPropertyDescription("Lineage reference object : futureSalaryEnc")
    private Double futureSalaryEnc;
    /**
     * Total Encumbrance Hours
     * <p>
     * Lineage reference object : totalEncumbranceHrs
     * 
     */
    @JsonProperty("totalEncumbranceHrs")
    @JsonPropertyDescription("Lineage reference object : totalEncumbranceHrs")
    private Double totalEncumbranceHrs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Current Fiscal Year
     * <p>
     * Lineage reference object : salaryEncumbrance
     * 
     */
    @JsonProperty("salaryEncumbrance")
    public Double getSalaryEncumbrance() {
        return salaryEncumbrance;
    }

    /**
     * Current Fiscal Year
     * <p>
     * Lineage reference object : salaryEncumbrance
     * 
     */
    @JsonProperty("salaryEncumbrance")
    public void setSalaryEncumbrance(Double salaryEncumbrance) {
        this.salaryEncumbrance = salaryEncumbrance;
    }

    public FormHeader withSalaryEncumbrance(Double salaryEncumbrance) {
        this.salaryEncumbrance = salaryEncumbrance;
        return this;
    }

    /**
     * Encumbrance Hours
     * <p>
     * Lineage reference object : detailEncumbranceHrs
     * 
     */
    @JsonProperty("detailEncumbranceHrs")
    public Double getDetailEncumbranceHrs() {
        return detailEncumbranceHrs;
    }

    /**
     * Encumbrance Hours
     * <p>
     * Lineage reference object : detailEncumbranceHrs
     * 
     */
    @JsonProperty("detailEncumbranceHrs")
    public void setDetailEncumbranceHrs(Double detailEncumbranceHrs) {
        this.detailEncumbranceHrs = detailEncumbranceHrs;
    }

    public FormHeader withDetailEncumbranceHrs(Double detailEncumbranceHrs) {
        this.detailEncumbranceHrs = detailEncumbranceHrs;
        return this;
    }

    /**
     * Lineage reference object : dataSeparatorLine1
     * 
     */
    @JsonProperty("dataSeparatorLine1")
    public String getDataSeparatorLine1() {
        return dataSeparatorLine1;
    }

    /**
     * Lineage reference object : dataSeparatorLine1
     * 
     */
    @JsonProperty("dataSeparatorLine1")
    public void setDataSeparatorLine1(String dataSeparatorLine1) {
        this.dataSeparatorLine1 = dataSeparatorLine1;
    }

    public FormHeader withDataSeparatorLine1(String dataSeparatorLine1) {
        this.dataSeparatorLine1 = dataSeparatorLine1;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : contractBeginDate
     * 
     */
    @JsonProperty("contractBeginDate")
    public Date getContractBeginDate() {
        return contractBeginDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : contractBeginDate
     * 
     */
    @JsonProperty("contractBeginDate")
    public void setContractBeginDate(Date contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
    }

    public FormHeader withContractBeginDate(Date contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
        return this;
    }

    /**
     * Total Encumbrance
     * <p>
     * Lineage reference object : totalSalaryEnc
     * 
     */
    @JsonProperty("totalSalaryEnc")
    public Double getTotalSalaryEnc() {
        return totalSalaryEnc;
    }

    /**
     * Total Encumbrance
     * <p>
     * Lineage reference object : totalSalaryEnc
     * 
     */
    @JsonProperty("totalSalaryEnc")
    public void setTotalSalaryEnc(Double totalSalaryEnc) {
        this.totalSalaryEnc = totalSalaryEnc;
    }

    public FormHeader withTotalSalaryEnc(Double totalSalaryEnc) {
        this.totalSalaryEnc = totalSalaryEnc;
        return this;
    }

    /**
     * Lineage reference object : dataSeparatorLine0
     * 
     */
    @JsonProperty("dataSeparatorLine0")
    public String getDataSeparatorLine0() {
        return dataSeparatorLine0;
    }

    /**
     * Lineage reference object : dataSeparatorLine0
     * 
     */
    @JsonProperty("dataSeparatorLine0")
    public void setDataSeparatorLine0(String dataSeparatorLine0) {
        this.dataSeparatorLine0 = dataSeparatorLine0;
    }

    public FormHeader withDataSeparatorLine0(String dataSeparatorLine0) {
        this.dataSeparatorLine0 = dataSeparatorLine0;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : contractEndDate
     * 
     */
    @JsonProperty("contractEndDate")
    public Date getContractEndDate() {
        return contractEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : contractEndDate
     * 
     */
    @JsonProperty("contractEndDate")
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public FormHeader withContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
        return this;
    }

    /**
     * Total Contract Hours
     * <p>
     * Lineage reference object : totalContractHrs
     * 
     */
    @JsonProperty("totalContractHrs")
    public Double getTotalContractHrs() {
        return totalContractHrs;
    }

    /**
     * Total Contract Hours
     * <p>
     * Lineage reference object : totalContractHrs
     * 
     */
    @JsonProperty("totalContractHrs")
    public void setTotalContractHrs(Double totalContractHrs) {
        this.totalContractHrs = totalContractHrs;
    }

    public FormHeader withTotalContractHrs(Double totalContractHrs) {
        this.totalContractHrs = totalContractHrs;
        return this;
    }

    /**
     * Future Years
     * <p>
     * Lineage reference object : futureSalaryEnc
     * 
     */
    @JsonProperty("futureSalaryEnc")
    public Double getFutureSalaryEnc() {
        return futureSalaryEnc;
    }

    /**
     * Future Years
     * <p>
     * Lineage reference object : futureSalaryEnc
     * 
     */
    @JsonProperty("futureSalaryEnc")
    public void setFutureSalaryEnc(Double futureSalaryEnc) {
        this.futureSalaryEnc = futureSalaryEnc;
    }

    public FormHeader withFutureSalaryEnc(Double futureSalaryEnc) {
        this.futureSalaryEnc = futureSalaryEnc;
        return this;
    }

    /**
     * Total Encumbrance Hours
     * <p>
     * Lineage reference object : totalEncumbranceHrs
     * 
     */
    @JsonProperty("totalEncumbranceHrs")
    public Double getTotalEncumbranceHrs() {
        return totalEncumbranceHrs;
    }

    /**
     * Total Encumbrance Hours
     * <p>
     * Lineage reference object : totalEncumbranceHrs
     * 
     */
    @JsonProperty("totalEncumbranceHrs")
    public void setTotalEncumbranceHrs(Double totalEncumbranceHrs) {
        this.totalEncumbranceHrs = totalEncumbranceHrs;
    }

    public FormHeader withTotalEncumbranceHrs(Double totalEncumbranceHrs) {
        this.totalEncumbranceHrs = totalEncumbranceHrs;
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

    public FormHeader withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FormHeader.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("salaryEncumbrance");
        sb.append('=');
        sb.append(((this.salaryEncumbrance == null)?"<null>":this.salaryEncumbrance));
        sb.append(',');
        sb.append("detailEncumbranceHrs");
        sb.append('=');
        sb.append(((this.detailEncumbranceHrs == null)?"<null>":this.detailEncumbranceHrs));
        sb.append(',');
        sb.append("dataSeparatorLine1");
        sb.append('=');
        sb.append(((this.dataSeparatorLine1 == null)?"<null>":this.dataSeparatorLine1));
        sb.append(',');
        sb.append("contractBeginDate");
        sb.append('=');
        sb.append(((this.contractBeginDate == null)?"<null>":this.contractBeginDate));
        sb.append(',');
        sb.append("totalSalaryEnc");
        sb.append('=');
        sb.append(((this.totalSalaryEnc == null)?"<null>":this.totalSalaryEnc));
        sb.append(',');
        sb.append("dataSeparatorLine0");
        sb.append('=');
        sb.append(((this.dataSeparatorLine0 == null)?"<null>":this.dataSeparatorLine0));
        sb.append(',');
        sb.append("contractEndDate");
        sb.append('=');
        sb.append(((this.contractEndDate == null)?"<null>":this.contractEndDate));
        sb.append(',');
        sb.append("totalContractHrs");
        sb.append('=');
        sb.append(((this.totalContractHrs == null)?"<null>":this.totalContractHrs));
        sb.append(',');
        sb.append("futureSalaryEnc");
        sb.append('=');
        sb.append(((this.futureSalaryEnc == null)?"<null>":this.futureSalaryEnc));
        sb.append(',');
        sb.append("totalEncumbranceHrs");
        sb.append('=');
        sb.append(((this.totalEncumbranceHrs == null)?"<null>":this.totalEncumbranceHrs));
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
        result = ((result* 31)+((this.salaryEncumbrance == null)? 0 :this.salaryEncumbrance.hashCode()));
        result = ((result* 31)+((this.detailEncumbranceHrs == null)? 0 :this.detailEncumbranceHrs.hashCode()));
        result = ((result* 31)+((this.dataSeparatorLine1 == null)? 0 :this.dataSeparatorLine1 .hashCode()));
        result = ((result* 31)+((this.contractBeginDate == null)? 0 :this.contractBeginDate.hashCode()));
        result = ((result* 31)+((this.totalSalaryEnc == null)? 0 :this.totalSalaryEnc.hashCode()));
        result = ((result* 31)+((this.dataSeparatorLine0 == null)? 0 :this.dataSeparatorLine0 .hashCode()));
        result = ((result* 31)+((this.contractEndDate == null)? 0 :this.contractEndDate.hashCode()));
        result = ((result* 31)+((this.totalContractHrs == null)? 0 :this.totalContractHrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.futureSalaryEnc == null)? 0 :this.futureSalaryEnc.hashCode()));
        result = ((result* 31)+((this.totalEncumbranceHrs == null)? 0 :this.totalEncumbranceHrs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FormHeader) == false) {
            return false;
        }
        FormHeader rhs = ((FormHeader) other);
        return ((((((((((((this.salaryEncumbrance == rhs.salaryEncumbrance)||((this.salaryEncumbrance!= null)&&this.salaryEncumbrance.equals(rhs.salaryEncumbrance)))&&((this.detailEncumbranceHrs == rhs.detailEncumbranceHrs)||((this.detailEncumbranceHrs!= null)&&this.detailEncumbranceHrs.equals(rhs.detailEncumbranceHrs))))&&((this.dataSeparatorLine1 == rhs.dataSeparatorLine1)||((this.dataSeparatorLine1 != null)&&this.dataSeparatorLine1 .equals(rhs.dataSeparatorLine1))))&&((this.contractBeginDate == rhs.contractBeginDate)||((this.contractBeginDate!= null)&&this.contractBeginDate.equals(rhs.contractBeginDate))))&&((this.totalSalaryEnc == rhs.totalSalaryEnc)||((this.totalSalaryEnc!= null)&&this.totalSalaryEnc.equals(rhs.totalSalaryEnc))))&&((this.dataSeparatorLine0 == rhs.dataSeparatorLine0)||((this.dataSeparatorLine0 != null)&&this.dataSeparatorLine0 .equals(rhs.dataSeparatorLine0))))&&((this.contractEndDate == rhs.contractEndDate)||((this.contractEndDate!= null)&&this.contractEndDate.equals(rhs.contractEndDate))))&&((this.totalContractHrs == rhs.totalContractHrs)||((this.totalContractHrs!= null)&&this.totalContractHrs.equals(rhs.totalContractHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.futureSalaryEnc == rhs.futureSalaryEnc)||((this.futureSalaryEnc!= null)&&this.futureSalaryEnc.equals(rhs.futureSalaryEnc))))&&((this.totalEncumbranceHrs == rhs.totalEncumbranceHrs)||((this.totalEncumbranceHrs!= null)&&this.totalEncumbranceHrs.equals(rhs.totalEncumbranceHrs))));
    }

}
