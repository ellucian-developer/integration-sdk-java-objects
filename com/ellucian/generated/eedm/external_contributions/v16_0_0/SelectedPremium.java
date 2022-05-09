
package com.ellucian.generated.eedm.external_contributions.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "quantity",
    "premium"
})
@Generated("jsonschema2pojo")
public class SelectedPremium {

    /**
     * Quantity
     * <p>
     * The quantity of the selected premium.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("The quantity of the selected premium.")
    private Integer quantity;
    /**
     * Premium
     * <p>
     * The premium associated with the external contribution.
     * (Required)
     * 
     */
    @JsonProperty("premium")
    @JsonPropertyDescription("The premium associated with the external contribution.")
    private Premium premium;

    /**
     * Quantity
     * <p>
     * The quantity of the selected premium.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Quantity
     * <p>
     * The quantity of the selected premium.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public SelectedPremium withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Premium
     * <p>
     * The premium associated with the external contribution.
     * (Required)
     * 
     */
    @JsonProperty("premium")
    public Premium getPremium() {
        return premium;
    }

    /**
     * Premium
     * <p>
     * The premium associated with the external contribution.
     * (Required)
     * 
     */
    @JsonProperty("premium")
    public void setPremium(Premium premium) {
        this.premium = premium;
    }

    public SelectedPremium withPremium(Premium premium) {
        this.premium = premium;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SelectedPremium.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
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
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.premium == null)? 0 :this.premium.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SelectedPremium) == false) {
            return false;
        }
        SelectedPremium rhs = ((SelectedPremium) other);
        return (((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity)))&&((this.premium == rhs.premium)||((this.premium!= null)&&this.premium.equals(rhs.premium))));
    }

}
