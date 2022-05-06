
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
    "feesRefund",
    "toDate",
    "tuitRefund"
})
@Generated("jsonschema2pojo")
public class Sfbrfst__2 {

    /**
     * Status
     * <p>
     * Lineage reference object : SFBRFST_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    @JsonPropertyDescription("Lineage reference object : SFBRFST_ESTS_CODE, Lookup lineage reference object : stvests")
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
     * Percentage Tuition Refund
     * <p>
     * Lineage reference object : SFBRFST_TUIT_REFUND
     * (Required)
     * 
     */
    @JsonProperty("tuitRefund")
    @JsonPropertyDescription("Lineage reference object : SFBRFST_TUIT_REFUND")
    private Double tuitRefund;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : SFBRFST_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    public String getEstsCode() {
        return estsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFBRFST_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    public void setEstsCode(String estsCode) {
        this.estsCode = estsCode;
    }

    public Sfbrfst__2 withEstsCode(String estsCode) {
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

    public Sfbrfst__2 withFromDate(Date fromDate) {
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

    public Sfbrfst__2 withFeesRefund(Double feesRefund) {
        this.feesRefund = feesRefund;
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

    public Sfbrfst__2 withToDate(Date toDate) {
        this.toDate = toDate;
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

    public Sfbrfst__2 withTuitRefund(Double tuitRefund) {
        this.tuitRefund = tuitRefund;
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

    public Sfbrfst__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfbrfst__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("tuitRefund");
        sb.append('=');
        sb.append(((this.tuitRefund == null)?"<null>":this.tuitRefund));
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
        result = ((result* 31)+((this.feesRefund == null)? 0 :this.feesRefund.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tuitRefund == null)? 0 :this.tuitRefund.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfbrfst__2) == false) {
            return false;
        }
        Sfbrfst__2 rhs = ((Sfbrfst__2) other);
        return (((((((this.estsCode == rhs.estsCode)||((this.estsCode!= null)&&this.estsCode.equals(rhs.estsCode)))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.feesRefund == rhs.feesRefund)||((this.feesRefund!= null)&&this.feesRefund.equals(rhs.feesRefund))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tuitRefund == rhs.tuitRefund)||((this.tuitRefund!= null)&&this.tuitRefund.equals(rhs.tuitRefund))));
    }

}
