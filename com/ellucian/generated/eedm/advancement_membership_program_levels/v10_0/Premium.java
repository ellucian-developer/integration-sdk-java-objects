
package com.ellucian.generated.eedm.advancement_membership_program_levels.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "premium",
    "quantity",
    "selection"
})
@Generated("jsonschema2pojo")
public class Premium {

    /**
     * Premium
     * <p>
     * The goods or services offered as a premium for the membership level.
     * (Required)
     * 
     */
    @JsonProperty("premium")
    @JsonPropertyDescription("The goods or services offered as a premium for the membership level.")
    private Premium__1 premium;
    /**
     * Quantity
     * <p>
     * The quantity of the premium.
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("The quantity of the premium.")
    private Object quantity;
    /**
     * Selection
     * <p>
     * An indication that the premium is part of a set of premiums from which the member chooses.
     * 
     */
    @JsonProperty("selection")
    @JsonPropertyDescription("An indication that the premium is part of a set of premiums from which the member chooses.")
    private Object selection;

    /**
     * Premium
     * <p>
     * The goods or services offered as a premium for the membership level.
     * (Required)
     * 
     */
    @JsonProperty("premium")
    public Premium__1 getPremium() {
        return premium;
    }

    /**
     * Premium
     * <p>
     * The goods or services offered as a premium for the membership level.
     * (Required)
     * 
     */
    @JsonProperty("premium")
    public void setPremium(Premium__1 premium) {
        this.premium = premium;
    }

    public Premium withPremium(Premium__1 premium) {
        this.premium = premium;
        return this;
    }

    /**
     * Quantity
     * <p>
     * The quantity of the premium.
     * 
     */
    @JsonProperty("quantity")
    public Object getQuantity() {
        return quantity;
    }

    /**
     * Quantity
     * <p>
     * The quantity of the premium.
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Object quantity) {
        this.quantity = quantity;
    }

    public Premium withQuantity(Object quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Selection
     * <p>
     * An indication that the premium is part of a set of premiums from which the member chooses.
     * 
     */
    @JsonProperty("selection")
    public Object getSelection() {
        return selection;
    }

    /**
     * Selection
     * <p>
     * An indication that the premium is part of a set of premiums from which the member chooses.
     * 
     */
    @JsonProperty("selection")
    public void setSelection(Object selection) {
        this.selection = selection;
    }

    public Premium withSelection(Object selection) {
        this.selection = selection;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Premium.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("premium");
        sb.append('=');
        sb.append(((this.premium == null)?"<null>":this.premium));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("selection");
        sb.append('=');
        sb.append(((this.selection == null)?"<null>":this.selection));
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
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.selection == null)? 0 :this.selection.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Premium) == false) {
            return false;
        }
        Premium rhs = ((Premium) other);
        return ((((this.premium == rhs.premium)||((this.premium!= null)&&this.premium.equals(rhs.premium)))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.selection == rhs.selection)||((this.selection!= null)&&this.selection.equals(rhs.selection))));
    }

}
