
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
    "estsCode",
    "fromDate",
    "endDate",
    "xxxxxxxTermCode",
    "toDate",
    "feesRefund",
    "xxxxxxxTermCodeDef",
    "tuitRefund",
    "startDate"
})
@Generated("jsonschema2pojo")
public class EnrollmentStatusControl100PostRequest {

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
    private String xxxxxxxTermCode;
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
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm")
    private String xxxxxxxTermCodeDef;
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

    public EnrollmentStatusControl100PostRequest withEstsCode(String estsCode) {
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

    public EnrollmentStatusControl100PostRequest withFromDate(Date fromDate) {
        this.fromDate = fromDate;
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

    public EnrollmentStatusControl100PostRequest withEndDate(Date endDate) {
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
    public String getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(String xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public EnrollmentStatusControl100PostRequest withXxxxxxxTermCode(String xxxxxxxTermCode) {
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

    public EnrollmentStatusControl100PostRequest withToDate(Date toDate) {
        this.toDate = toDate;
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

    public EnrollmentStatusControl100PostRequest withFeesRefund(Double feesRefund) {
        this.feesRefund = feesRefund;
        return this;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    public String getXxxxxxxTermCodeDef() {
        return xxxxxxxTermCodeDef;
    }

    /**
     * Copy From Term
     * <p>
     * Lineage reference object : xxxxxxxTermCodeDef, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("xxxxxxxTermCodeDef")
    public void setXxxxxxxTermCodeDef(String xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
    }

    public EnrollmentStatusControl100PostRequest withXxxxxxxTermCodeDef(String xxxxxxxTermCodeDef) {
        this.xxxxxxxTermCodeDef = xxxxxxxTermCodeDef;
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

    public EnrollmentStatusControl100PostRequest withTuitRefund(Double tuitRefund) {
        this.tuitRefund = tuitRefund;
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

    public EnrollmentStatusControl100PostRequest withStartDate(Date startDate) {
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

    public EnrollmentStatusControl100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollmentStatusControl100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("estsCode");
        sb.append('=');
        sb.append(((this.estsCode == null)?"<null>":this.estsCode));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
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
        sb.append("feesRefund");
        sb.append('=');
        sb.append(((this.feesRefund == null)?"<null>":this.feesRefund));
        sb.append(',');
        sb.append("xxxxxxxTermCodeDef");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCodeDef == null)?"<null>":this.xxxxxxxTermCodeDef));
        sb.append(',');
        sb.append("tuitRefund");
        sb.append('=');
        sb.append(((this.tuitRefund == null)?"<null>":this.tuitRefund));
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
        result = ((result* 31)+((this.estsCode == null)? 0 :this.estsCode.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCode == null)? 0 :this.xxxxxxxTermCode.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.feesRefund == null)? 0 :this.feesRefund.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCodeDef == null)? 0 :this.xxxxxxxTermCodeDef.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tuitRefund == null)? 0 :this.tuitRefund.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollmentStatusControl100PostRequest) == false) {
            return false;
        }
        EnrollmentStatusControl100PostRequest rhs = ((EnrollmentStatusControl100PostRequest) other);
        return (((((((((((this.estsCode == rhs.estsCode)||((this.estsCode!= null)&&this.estsCode.equals(rhs.estsCode)))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.feesRefund == rhs.feesRefund)||((this.feesRefund!= null)&&this.feesRefund.equals(rhs.feesRefund))))&&((this.xxxxxxxTermCodeDef == rhs.xxxxxxxTermCodeDef)||((this.xxxxxxxTermCodeDef!= null)&&this.xxxxxxxTermCodeDef.equals(rhs.xxxxxxxTermCodeDef))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tuitRefund == rhs.tuitRefund)||((this.tuitRefund!= null)&&this.tuitRefund.equals(rhs.tuitRefund))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
