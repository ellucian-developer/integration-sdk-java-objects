
package com.ellucian.generated.bpapi.ban.taxable_life_insurance_premium_rule.v1_0_0;

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
    "toAge",
    "activityDate",
    "fromAge",
    "per1000PremiumAmt"
})
@Generated("jsonschema2pojo")
public class TaxableLifeInsurancePremiumRule100GetRequest {

    /**
     * Age To
     * <p>
     * Lineage reference object : PTRGTAX_TO_AGE
     * (Required)
     * 
     */
    @JsonProperty("toAge")
    @JsonPropertyDescription("Lineage reference object : PTRGTAX_TO_AGE")
    private Double toAge;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRGTAX_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRGTAX_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Age From
     * <p>
     * Lineage reference object : PTRGTAX_FROM_AGE
     * (Required)
     * 
     */
    @JsonProperty("fromAge")
    @JsonPropertyDescription("Lineage reference object : PTRGTAX_FROM_AGE")
    private Double fromAge;
    /**
     * Rate Per 1000
     * <p>
     * Lineage reference object : PTRGTAX_PER_1000_PREMIUM_AMT
     * (Required)
     * 
     */
    @JsonProperty("per1000PremiumAmt")
    @JsonPropertyDescription("Lineage reference object : PTRGTAX_PER_1000_PREMIUM_AMT")
    private Double per1000PremiumAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Age To
     * <p>
     * Lineage reference object : PTRGTAX_TO_AGE
     * (Required)
     * 
     */
    @JsonProperty("toAge")
    public Double getToAge() {
        return toAge;
    }

    /**
     * Age To
     * <p>
     * Lineage reference object : PTRGTAX_TO_AGE
     * (Required)
     * 
     */
    @JsonProperty("toAge")
    public void setToAge(Double toAge) {
        this.toAge = toAge;
    }

    public TaxableLifeInsurancePremiumRule100GetRequest withToAge(Double toAge) {
        this.toAge = toAge;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRGTAX_ACTIVITY_DATE
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
     * Lineage reference object : PTRGTAX_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TaxableLifeInsurancePremiumRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Age From
     * <p>
     * Lineage reference object : PTRGTAX_FROM_AGE
     * (Required)
     * 
     */
    @JsonProperty("fromAge")
    public Double getFromAge() {
        return fromAge;
    }

    /**
     * Age From
     * <p>
     * Lineage reference object : PTRGTAX_FROM_AGE
     * (Required)
     * 
     */
    @JsonProperty("fromAge")
    public void setFromAge(Double fromAge) {
        this.fromAge = fromAge;
    }

    public TaxableLifeInsurancePremiumRule100GetRequest withFromAge(Double fromAge) {
        this.fromAge = fromAge;
        return this;
    }

    /**
     * Rate Per 1000
     * <p>
     * Lineage reference object : PTRGTAX_PER_1000_PREMIUM_AMT
     * (Required)
     * 
     */
    @JsonProperty("per1000PremiumAmt")
    public Double getPer1000PremiumAmt() {
        return per1000PremiumAmt;
    }

    /**
     * Rate Per 1000
     * <p>
     * Lineage reference object : PTRGTAX_PER_1000_PREMIUM_AMT
     * (Required)
     * 
     */
    @JsonProperty("per1000PremiumAmt")
    public void setPer1000PremiumAmt(Double per1000PremiumAmt) {
        this.per1000PremiumAmt = per1000PremiumAmt;
    }

    public TaxableLifeInsurancePremiumRule100GetRequest withPer1000PremiumAmt(Double per1000PremiumAmt) {
        this.per1000PremiumAmt = per1000PremiumAmt;
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

    public TaxableLifeInsurancePremiumRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaxableLifeInsurancePremiumRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("toAge");
        sb.append('=');
        sb.append(((this.toAge == null)?"<null>":this.toAge));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("fromAge");
        sb.append('=');
        sb.append(((this.fromAge == null)?"<null>":this.fromAge));
        sb.append(',');
        sb.append("per1000PremiumAmt");
        sb.append('=');
        sb.append(((this.per1000PremiumAmt == null)?"<null>":this.per1000PremiumAmt));
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
        result = ((result* 31)+((this.toAge == null)? 0 :this.toAge.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.per1000PremiumAmt == null)? 0 :this.per1000PremiumAmt.hashCode()));
        result = ((result* 31)+((this.fromAge == null)? 0 :this.fromAge.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxableLifeInsurancePremiumRule100GetRequest) == false) {
            return false;
        }
        TaxableLifeInsurancePremiumRule100GetRequest rhs = ((TaxableLifeInsurancePremiumRule100GetRequest) other);
        return ((((((this.toAge == rhs.toAge)||((this.toAge!= null)&&this.toAge.equals(rhs.toAge)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.per1000PremiumAmt == rhs.per1000PremiumAmt)||((this.per1000PremiumAmt!= null)&&this.per1000PremiumAmt.equals(rhs.per1000PremiumAmt))))&&((this.fromAge == rhs.fromAge)||((this.fromAge!= null)&&this.fromAge.equals(rhs.fromAge))));
    }

}
