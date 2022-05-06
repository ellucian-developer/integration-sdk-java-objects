
package com.ellucian.generated.bpapi.ban.defer_pay_period_rule.v1_0_0;

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
    "deferInd",
    "payno",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class Ptrdfpn {

    /**
     * Defer Indicator
     * <p>
     * Lineage reference object : PTRDFPN_DEFER_IND
     * (Required)
     * 
     */
    @JsonProperty("deferInd")
    @JsonPropertyDescription("Lineage reference object : PTRDFPN_DEFER_IND")
    private String deferInd;
    /**
     * Payroll Number
     * <p>
     * Lineage reference object : PTRDFPN_PAYNO
     * 
     */
    @JsonProperty("payno")
    @JsonPropertyDescription("Lineage reference object : PTRDFPN_PAYNO")
    private Double payno;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRDFPN_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRDFPN_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Defer Indicator
     * <p>
     * Lineage reference object : PTRDFPN_DEFER_IND
     * (Required)
     * 
     */
    @JsonProperty("deferInd")
    public String getDeferInd() {
        return deferInd;
    }

    /**
     * Defer Indicator
     * <p>
     * Lineage reference object : PTRDFPN_DEFER_IND
     * (Required)
     * 
     */
    @JsonProperty("deferInd")
    public void setDeferInd(String deferInd) {
        this.deferInd = deferInd;
    }

    public Ptrdfpn withDeferInd(String deferInd) {
        this.deferInd = deferInd;
        return this;
    }

    /**
     * Payroll Number
     * <p>
     * Lineage reference object : PTRDFPN_PAYNO
     * 
     */
    @JsonProperty("payno")
    public Double getPayno() {
        return payno;
    }

    /**
     * Payroll Number
     * <p>
     * Lineage reference object : PTRDFPN_PAYNO
     * 
     */
    @JsonProperty("payno")
    public void setPayno(Double payno) {
        this.payno = payno;
    }

    public Ptrdfpn withPayno(Double payno) {
        this.payno = payno;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRDFPN_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRDFPN_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ptrdfpn withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public Ptrdfpn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrdfpn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deferInd");
        sb.append('=');
        sb.append(((this.deferInd == null)?"<null>":this.deferInd));
        sb.append(',');
        sb.append("payno");
        sb.append('=');
        sb.append(((this.payno == null)?"<null>":this.payno));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.deferInd == null)? 0 :this.deferInd.hashCode()));
        result = ((result* 31)+((this.payno == null)? 0 :this.payno.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrdfpn) == false) {
            return false;
        }
        Ptrdfpn rhs = ((Ptrdfpn) other);
        return (((((this.deferInd == rhs.deferInd)||((this.deferInd!= null)&&this.deferInd.equals(rhs.deferInd)))&&((this.payno == rhs.payno)||((this.payno!= null)&&this.payno.equals(rhs.payno))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
