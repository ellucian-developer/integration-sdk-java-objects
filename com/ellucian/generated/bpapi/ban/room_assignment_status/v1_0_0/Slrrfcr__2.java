
package com.ellucian.generated.bpapi.ban.room_assignment_status.v1_0_0;

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
    "fromDate",
    "toDate",
    "ascdCode",
    "refund"
})
@Generated("jsonschema2pojo")
public class Slrrfcr__2 {

    /**
     * Start
     * <p>
     * Lineage reference object : SLRRFCR_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_FROM_DATE")
    private Date fromDate;
    /**
     * End
     * <p>
     * Lineage reference object : SLRRFCR_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_TO_DATE")
    private Date toDate;
    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRRFCR_ASCD_CODE
     * 
     */
    @JsonProperty("ascdCode")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_ASCD_CODE")
    private String ascdCode;
    /**
     * Refund
     * <p>
     * Lineage reference object : SLRRFCR_REFUND
     * (Required)
     * 
     */
    @JsonProperty("refund")
    @JsonPropertyDescription("Lineage reference object : SLRRFCR_REFUND")
    private Double refund;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Start
     * <p>
     * Lineage reference object : SLRRFCR_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Start
     * <p>
     * Lineage reference object : SLRRFCR_FROM_DATE
     * (Required)
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Slrrfcr__2 withFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRRFCR_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public Date getToDate() {
        return toDate;
    }

    /**
     * End
     * <p>
     * Lineage reference object : SLRRFCR_TO_DATE
     * (Required)
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Slrrfcr__2 withToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRRFCR_ASCD_CODE
     * 
     */
    @JsonProperty("ascdCode")
    public String getAscdCode() {
        return ascdCode;
    }

    /**
     * Assignment Status
     * <p>
     * Lineage reference object : SLRRFCR_ASCD_CODE
     * 
     */
    @JsonProperty("ascdCode")
    public void setAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
    }

    public Slrrfcr__2 withAscdCode(String ascdCode) {
        this.ascdCode = ascdCode;
        return this;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : SLRRFCR_REFUND
     * (Required)
     * 
     */
    @JsonProperty("refund")
    public Double getRefund() {
        return refund;
    }

    /**
     * Refund
     * <p>
     * Lineage reference object : SLRRFCR_REFUND
     * (Required)
     * 
     */
    @JsonProperty("refund")
    public void setRefund(Double refund) {
        this.refund = refund;
    }

    public Slrrfcr__2 withRefund(Double refund) {
        this.refund = refund;
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

    public Slrrfcr__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Slrrfcr__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("ascdCode");
        sb.append('=');
        sb.append(((this.ascdCode == null)?"<null>":this.ascdCode));
        sb.append(',');
        sb.append("refund");
        sb.append('=');
        sb.append(((this.refund == null)?"<null>":this.refund));
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
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.ascdCode == null)? 0 :this.ascdCode.hashCode()));
        result = ((result* 31)+((this.refund == null)? 0 :this.refund.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Slrrfcr__2) == false) {
            return false;
        }
        Slrrfcr__2 rhs = ((Slrrfcr__2) other);
        return ((((((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.ascdCode == rhs.ascdCode)||((this.ascdCode!= null)&&this.ascdCode.equals(rhs.ascdCode))))&&((this.refund == rhs.refund)||((this.refund!= null)&&this.refund.equals(rhs.refund))));
    }

}
