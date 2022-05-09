
package com.ellucian.generated.eedm.contributions.v9_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Amounts
 * <p>
 * The monetary amounts associated with the contribution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primary",
    "initialValue",
    "futureValue",
    "remainderValue",
    "campaignValue",
    "faceValue",
    "marketValue",
    "deductible",
    "premium"
})
@Generated("jsonschema2pojo")
public class Amounts {

    /**
     * Primary
     * <p>
     * The primary amount of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("primary")
    @JsonPropertyDescription("The primary amount of the contribution.")
    private Primary primary;
    /**
     * Initial Value
     * <p>
     * The initial value specified for the contribution.
     * 
     */
    @JsonProperty("initialValue")
    @JsonPropertyDescription("The initial value specified for the contribution.")
    private Object initialValue;
    /**
     * Future Value
     * <p>
     * The future value specified for the contribution.
     * 
     */
    @JsonProperty("futureValue")
    @JsonPropertyDescription("The future value specified for the contribution.")
    private Object futureValue;
    /**
     * Remainder Value
     * <p>
     * The remainder value specified for the contribution.
     * 
     */
    @JsonProperty("remainderValue")
    @JsonPropertyDescription("The remainder value specified for the contribution.")
    private Object remainderValue;
    /**
     * Campaign Value
     * <p>
     * The value of the contribution applied to a campaign.
     * 
     */
    @JsonProperty("campaignValue")
    @JsonPropertyDescription("The value of the contribution applied to a campaign.")
    private Object campaignValue;
    /**
     * Face Value
     * <p>
     * The face value of the contribution.
     * 
     */
    @JsonProperty("faceValue")
    @JsonPropertyDescription("The face value of the contribution.")
    private Object faceValue;
    /**
     * Market Value
     * <p>
     * The market value of the contribution.
     * 
     */
    @JsonProperty("marketValue")
    @JsonPropertyDescription("The market value of the contribution.")
    private Object marketValue;
    /**
     * Deductible
     * <p>
     * The deductible amount of the contribution.
     * 
     */
    @JsonProperty("deductible")
    @JsonPropertyDescription("The deductible amount of the contribution.")
    private Object deductible;
    /**
     * Premium
     * <p>
     * The value of the premium given in response to the contribution.
     * 
     */
    @JsonProperty("premium")
    @JsonPropertyDescription("The value of the premium given in response to the contribution.")
    private Object premium;

    /**
     * Primary
     * <p>
     * The primary amount of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("primary")
    public Primary getPrimary() {
        return primary;
    }

    /**
     * Primary
     * <p>
     * The primary amount of the contribution.
     * (Required)
     * 
     */
    @JsonProperty("primary")
    public void setPrimary(Primary primary) {
        this.primary = primary;
    }

    public Amounts withPrimary(Primary primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Initial Value
     * <p>
     * The initial value specified for the contribution.
     * 
     */
    @JsonProperty("initialValue")
    public Object getInitialValue() {
        return initialValue;
    }

    /**
     * Initial Value
     * <p>
     * The initial value specified for the contribution.
     * 
     */
    @JsonProperty("initialValue")
    public void setInitialValue(Object initialValue) {
        this.initialValue = initialValue;
    }

    public Amounts withInitialValue(Object initialValue) {
        this.initialValue = initialValue;
        return this;
    }

    /**
     * Future Value
     * <p>
     * The future value specified for the contribution.
     * 
     */
    @JsonProperty("futureValue")
    public Object getFutureValue() {
        return futureValue;
    }

    /**
     * Future Value
     * <p>
     * The future value specified for the contribution.
     * 
     */
    @JsonProperty("futureValue")
    public void setFutureValue(Object futureValue) {
        this.futureValue = futureValue;
    }

    public Amounts withFutureValue(Object futureValue) {
        this.futureValue = futureValue;
        return this;
    }

    /**
     * Remainder Value
     * <p>
     * The remainder value specified for the contribution.
     * 
     */
    @JsonProperty("remainderValue")
    public Object getRemainderValue() {
        return remainderValue;
    }

    /**
     * Remainder Value
     * <p>
     * The remainder value specified for the contribution.
     * 
     */
    @JsonProperty("remainderValue")
    public void setRemainderValue(Object remainderValue) {
        this.remainderValue = remainderValue;
    }

    public Amounts withRemainderValue(Object remainderValue) {
        this.remainderValue = remainderValue;
        return this;
    }

    /**
     * Campaign Value
     * <p>
     * The value of the contribution applied to a campaign.
     * 
     */
    @JsonProperty("campaignValue")
    public Object getCampaignValue() {
        return campaignValue;
    }

    /**
     * Campaign Value
     * <p>
     * The value of the contribution applied to a campaign.
     * 
     */
    @JsonProperty("campaignValue")
    public void setCampaignValue(Object campaignValue) {
        this.campaignValue = campaignValue;
    }

    public Amounts withCampaignValue(Object campaignValue) {
        this.campaignValue = campaignValue;
        return this;
    }

    /**
     * Face Value
     * <p>
     * The face value of the contribution.
     * 
     */
    @JsonProperty("faceValue")
    public Object getFaceValue() {
        return faceValue;
    }

    /**
     * Face Value
     * <p>
     * The face value of the contribution.
     * 
     */
    @JsonProperty("faceValue")
    public void setFaceValue(Object faceValue) {
        this.faceValue = faceValue;
    }

    public Amounts withFaceValue(Object faceValue) {
        this.faceValue = faceValue;
        return this;
    }

    /**
     * Market Value
     * <p>
     * The market value of the contribution.
     * 
     */
    @JsonProperty("marketValue")
    public Object getMarketValue() {
        return marketValue;
    }

    /**
     * Market Value
     * <p>
     * The market value of the contribution.
     * 
     */
    @JsonProperty("marketValue")
    public void setMarketValue(Object marketValue) {
        this.marketValue = marketValue;
    }

    public Amounts withMarketValue(Object marketValue) {
        this.marketValue = marketValue;
        return this;
    }

    /**
     * Deductible
     * <p>
     * The deductible amount of the contribution.
     * 
     */
    @JsonProperty("deductible")
    public Object getDeductible() {
        return deductible;
    }

    /**
     * Deductible
     * <p>
     * The deductible amount of the contribution.
     * 
     */
    @JsonProperty("deductible")
    public void setDeductible(Object deductible) {
        this.deductible = deductible;
    }

    public Amounts withDeductible(Object deductible) {
        this.deductible = deductible;
        return this;
    }

    /**
     * Premium
     * <p>
     * The value of the premium given in response to the contribution.
     * 
     */
    @JsonProperty("premium")
    public Object getPremium() {
        return premium;
    }

    /**
     * Premium
     * <p>
     * The value of the premium given in response to the contribution.
     * 
     */
    @JsonProperty("premium")
    public void setPremium(Object premium) {
        this.premium = premium;
    }

    public Amounts withPremium(Object premium) {
        this.premium = premium;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Amounts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primary");
        sb.append('=');
        sb.append(((this.primary == null)?"<null>":this.primary));
        sb.append(',');
        sb.append("initialValue");
        sb.append('=');
        sb.append(((this.initialValue == null)?"<null>":this.initialValue));
        sb.append(',');
        sb.append("futureValue");
        sb.append('=');
        sb.append(((this.futureValue == null)?"<null>":this.futureValue));
        sb.append(',');
        sb.append("remainderValue");
        sb.append('=');
        sb.append(((this.remainderValue == null)?"<null>":this.remainderValue));
        sb.append(',');
        sb.append("campaignValue");
        sb.append('=');
        sb.append(((this.campaignValue == null)?"<null>":this.campaignValue));
        sb.append(',');
        sb.append("faceValue");
        sb.append('=');
        sb.append(((this.faceValue == null)?"<null>":this.faceValue));
        sb.append(',');
        sb.append("marketValue");
        sb.append('=');
        sb.append(((this.marketValue == null)?"<null>":this.marketValue));
        sb.append(',');
        sb.append("deductible");
        sb.append('=');
        sb.append(((this.deductible == null)?"<null>":this.deductible));
        sb.append(',');
        sb.append("premium");
        sb.append('=');
        sb.append(((this.premium == null)?"<null>":this.premium));
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
        result = ((result* 31)+((this.premium == null)? 0 :this.premium.hashCode()));
        result = ((result* 31)+((this.faceValue == null)? 0 :this.faceValue.hashCode()));
        result = ((result* 31)+((this.campaignValue == null)? 0 :this.campaignValue.hashCode()));
        result = ((result* 31)+((this.deductible == null)? 0 :this.deductible.hashCode()));
        result = ((result* 31)+((this.remainderValue == null)? 0 :this.remainderValue.hashCode()));
        result = ((result* 31)+((this.marketValue == null)? 0 :this.marketValue.hashCode()));
        result = ((result* 31)+((this.futureValue == null)? 0 :this.futureValue.hashCode()));
        result = ((result* 31)+((this.initialValue == null)? 0 :this.initialValue.hashCode()));
        result = ((result* 31)+((this.primary == null)? 0 :this.primary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Amounts) == false) {
            return false;
        }
        Amounts rhs = ((Amounts) other);
        return ((((((((((this.premium == rhs.premium)||((this.premium!= null)&&this.premium.equals(rhs.premium)))&&((this.faceValue == rhs.faceValue)||((this.faceValue!= null)&&this.faceValue.equals(rhs.faceValue))))&&((this.campaignValue == rhs.campaignValue)||((this.campaignValue!= null)&&this.campaignValue.equals(rhs.campaignValue))))&&((this.deductible == rhs.deductible)||((this.deductible!= null)&&this.deductible.equals(rhs.deductible))))&&((this.remainderValue == rhs.remainderValue)||((this.remainderValue!= null)&&this.remainderValue.equals(rhs.remainderValue))))&&((this.marketValue == rhs.marketValue)||((this.marketValue!= null)&&this.marketValue.equals(rhs.marketValue))))&&((this.futureValue == rhs.futureValue)||((this.futureValue!= null)&&this.futureValue.equals(rhs.futureValue))))&&((this.initialValue == rhs.initialValue)||((this.initialValue!= null)&&this.initialValue.equals(rhs.initialValue))))&&((this.primary == rhs.primary)||((this.primary!= null)&&this.primary.equals(rhs.primary))));
    }

}
