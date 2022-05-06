
package com.ellucian.generated.bpapi.ban.enrollment_status_control.v1_0_0;

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
    "criteria.estsCode",
    "criteria.stvestsDesc",
    "criteria.activityDate",
    "endDate",
    "xxxxxxxTermCode",
    "toDate",
    "xxxxxxxTermCodeDef",
    "criteria.endDate",
    "criteria.startDate",
    "tuitRefund",
    "estsCode",
    "fromDate",
    "feesRefund",
    "startDate"
})
@Generated("jsonschema2pojo")
public class EnrollmentStatusControl100PutRequest {

    /**
     * Status
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("criteria.estsCode")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests")
    private String criteriaEstsCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvestsDesc")
    private String criteriaStvestsDesc;
    /**
     * Lineage reference object : SFBESTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_END_DATE")
    private Date endDate;
    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm")
    private Object xxxxxxxTermCode;
    /**
     * End  Date
     * <p>
     * Lineage reference object : SFBRFST_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("Lineage reference object : SFBRFST_TO_DATE")
    private Date toDate;
    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm")
    private Object xxxxxxxTermCodeDef;
    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_END_DATE")
    private Date criteriaEndDate;
    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_START_DATE")
    private Date criteriaStartDate;
    /**
     * Percentage Tuition Refund
     * <p>
     * Lineage reference object : SFBRFST_TUIT_REFUND
     * (Required)
     * 
     */
    @JsonProperty("tuitRefund")
    @JsonPropertyDescription("Lineage reference object : SFBRFST_TUIT_REFUND")
    private Double tuitRefund;
    /**
     * Status
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("estsCode")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests")
    private String estsCode;
    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBRFST_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : SFBRFST_FROM_DATE")
    private Date fromDate;
    /**
     * Percentage Fees Refund
     * <p>
     * Lineage reference object : SFBRFST_FEES_REFUND
     * (Required)
     * 
     */
    @JsonProperty("feesRefund")
    @JsonPropertyDescription("Lineage reference object : SFBRFST_FEES_REFUND")
    private Double feesRefund;
    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_START_DATE")
    private Date startDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("criteria.estsCode")
    public String getCriteriaEstsCode() {
        return criteriaEstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("criteria.estsCode")
    public void setCriteriaEstsCode(String criteriaEstsCode) {
        this.criteriaEstsCode = criteriaEstsCode;
    }

    public EnrollmentStatusControl100PutRequest withCriteriaEstsCode(String criteriaEstsCode) {
        this.criteriaEstsCode = criteriaEstsCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvestsDesc")
    public String getCriteriaStvestsDesc() {
        return criteriaStvestsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.stvestsDesc")
    public void setCriteriaStvestsDesc(String criteriaStvestsDesc) {
        this.criteriaStvestsDesc = criteriaStvestsDesc;
    }

    public EnrollmentStatusControl100PutRequest withCriteriaStvestsDesc(String criteriaStvestsDesc) {
        this.criteriaStvestsDesc = criteriaStvestsDesc;
        return this;
    }

    /**
     * Lineage reference object : SFBESTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : SFBESTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public EnrollmentStatusControl100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public EnrollmentStatusControl100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public Object getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public EnrollmentStatusControl100PutRequest withXxxxxxxTermCode(Object xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
        return this;
    }

    /**
     * End  Date
     * <p>
     * Lineage reference object : SFBRFST_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public Date getToDate() {
        return toDate;
    }

    /**
     * End  Date
     * <p>
     * Lineage reference object : SFBRFST_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public EnrollmentStatusControl100PutRequest withToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    public Object getXxxxxxxTermCodeDef() {
        return xxxxxxxTermCodeDef;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    public void setXxxxxxxTermCodeDef(Object xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
    }

    public EnrollmentStatusControl100PutRequest withXxxxxxxTermCodeDef(Object xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public EnrollmentStatusControl100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public Date getCriteriaStartDate() {
        return criteriaStartDate;
    }

    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.startDate")
    public void setCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
    }

    public EnrollmentStatusControl100PutRequest withCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
        return this;
    }

    /**
     * Percentage Tuition Refund
     * <p>
     * Lineage reference object : SFBRFST_TUIT_REFUND
     * (Required)
     * 
     */
    @JsonProperty("tuitRefund")
    public Double getTuitRefund() {
        return tuitRefund;
    }

    /**
     * Percentage Tuition Refund
     * <p>
     * Lineage reference object : SFBRFST_TUIT_REFUND
     * (Required)
     * 
     */
    @JsonProperty("tuitRefund")
    public void setTuitRefund(Double tuitRefund) {
        this.tuitRefund = tuitRefund;
    }

    public EnrollmentStatusControl100PutRequest withTuitRefund(Double tuitRefund) {
        this.tuitRefund = tuitRefund;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("estsCode")
    public String getEstsCode() {
        return estsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("estsCode")
    public void setEstsCode(String estsCode) {
        this.estsCode = estsCode;
    }

    public EnrollmentStatusControl100PutRequest withEstsCode(String estsCode) {
        this.estsCode = estsCode;
        return this;
    }

    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBRFST_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBRFST_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public EnrollmentStatusControl100PutRequest withFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Percentage Fees Refund
     * <p>
     * Lineage reference object : SFBRFST_FEES_REFUND
     * (Required)
     * 
     */
    @JsonProperty("feesRefund")
    public Double getFeesRefund() {
        return feesRefund;
    }

    /**
     * Percentage Fees Refund
     * <p>
     * Lineage reference object : SFBRFST_FEES_REFUND
     * (Required)
     * 
     */
    @JsonProperty("feesRefund")
    public void setFeesRefund(Double feesRefund) {
        this.feesRefund = feesRefund;
    }

    public EnrollmentStatusControl100PutRequest withFeesRefund(Double feesRefund) {
        this.feesRefund = feesRefund;
        return this;
    }

    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start  Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * (Required)
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public EnrollmentStatusControl100PutRequest withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public EnrollmentStatusControl100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollmentStatusControl100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaEstsCode");
        sb.append('=');
        sb.append(((this.criteriaEstsCode == null)?"<null>":this.criteriaEstsCode));
        sb.append(',');
        sb.append("criteriaStvestsDesc");
        sb.append('=');
        sb.append(((this.criteriaStvestsDesc == null)?"<null>":this.criteriaStvestsDesc));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("xxxxxxxTermCode");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCode == null)?"<null>":this.xxxxxxxTermCode));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("xxxxxxxTermCodeDef");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCodeDef == null)?"<null>":this.xxxxxxxTermCodeDef));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaStartDate");
        sb.append('=');
        sb.append(((this.criteriaStartDate == null)?"<null>":this.criteriaStartDate));
        sb.append(',');
        sb.append("tuitRefund");
        sb.append('=');
        sb.append(((this.tuitRefund == null)?"<null>":this.tuitRefund));
        sb.append(',');
        sb.append("estsCode");
        sb.append('=');
        sb.append(((this.estsCode == null)?"<null>":this.estsCode));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("feesRefund");
        sb.append('=');
        sb.append(((this.feesRefund == null)?"<null>":this.feesRefund));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCode == null)? 0 :this.xxxxxxxTermCode.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCodeDef == null)? 0 :this.xxxxxxxTermCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaEstsCode == null)? 0 :this.criteriaEstsCode.hashCode()));
        result = ((result* 31)+((this.tuitRefund == null)? 0 :this.tuitRefund.hashCode()));
        result = ((result* 31)+((this.estsCode == null)? 0 :this.estsCode.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.criteriaStvestsDesc == null)? 0 :this.criteriaStvestsDesc.hashCode()));
        result = ((result* 31)+((this.feesRefund == null)? 0 :this.feesRefund.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollmentStatusControl100PutRequest) == false) {
            return false;
        }
        EnrollmentStatusControl100PutRequest rhs = ((EnrollmentStatusControl100PutRequest) other);
        return ((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.xxxxxxxTermCodeDef == rhs.xxxxxxxTermCodeDef)||((this.xxxxxxxTermCodeDef!= null)&&this.xxxxxxxTermCodeDef.equals(rhs.xxxxxxxTermCodeDef))))&&((this.criteriaEstsCode == rhs.criteriaEstsCode)||((this.criteriaEstsCode!= null)&&this.criteriaEstsCode.equals(rhs.criteriaEstsCode))))&&((this.tuitRefund == rhs.tuitRefund)||((this.tuitRefund!= null)&&this.tuitRefund.equals(rhs.tuitRefund))))&&((this.estsCode == rhs.estsCode)||((this.estsCode!= null)&&this.estsCode.equals(rhs.estsCode))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.criteriaStvestsDesc == rhs.criteriaStvestsDesc)||((this.criteriaStvestsDesc!= null)&&this.criteriaStvestsDesc.equals(rhs.criteriaStvestsDesc))))&&((this.feesRefund == rhs.feesRefund)||((this.feesRefund!= null)&&this.feesRefund.equals(rhs.feesRefund))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
