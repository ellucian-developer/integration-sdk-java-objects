
package com.ellucian.generated.eedm.external_contributions.v17_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "givingCode",
    "amount",
    "designation"
})
@Generated("jsonschema2pojo")
public class GivingCodeDetail {

    /**
     * Giving Code
     * <p>
     * The giving code associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("givingCode")
    @JsonPropertyDescription("The giving code associated with the contribution.")
    private GivingCode givingCode;
    /**
     * Amount
     * <p>
     * The amount associated with the giving code.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount associated with the giving code.")
    private Object amount;
    /**
     * Designation
     * <p>
     * The designation associated with the giving code.
     * 
     */
    @JsonProperty("designation")
    @JsonPropertyDescription("The designation associated with the giving code.")
    private Object designation;

    /**
     * Giving Code
     * <p>
     * The giving code associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("givingCode")
    public GivingCode getGivingCode() {
        return givingCode;
    }

    /**
     * Giving Code
     * <p>
     * The giving code associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("givingCode")
    public void setGivingCode(GivingCode givingCode) {
        this.givingCode = givingCode;
    }

    public GivingCodeDetail withGivingCode(GivingCode givingCode) {
        this.givingCode = givingCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount associated with the giving code.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount associated with the giving code.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public GivingCodeDetail withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Designation
     * <p>
     * The designation associated with the giving code.
     * 
     */
    @JsonProperty("designation")
    public Object getDesignation() {
        return designation;
    }

    /**
     * Designation
     * <p>
     * The designation associated with the giving code.
     * 
     */
    @JsonProperty("designation")
    public void setDesignation(Object designation) {
        this.designation = designation;
    }

    public GivingCodeDetail withDesignation(Object designation) {
        this.designation = designation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GivingCodeDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("givingCode");
        sb.append('=');
        sb.append(((this.givingCode == null)?"<null>":this.givingCode));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("designation");
        sb.append('=');
        sb.append(((this.designation == null)?"<null>":this.designation));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.designation == null)? 0 :this.designation.hashCode()));
        result = ((result* 31)+((this.givingCode == null)? 0 :this.givingCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GivingCodeDetail) == false) {
            return false;
        }
        GivingCodeDetail rhs = ((GivingCodeDetail) other);
        return ((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.designation == rhs.designation)||((this.designation!= null)&&this.designation.equals(rhs.designation))))&&((this.givingCode == rhs.givingCode)||((this.givingCode!= null)&&this.givingCode.equals(rhs.givingCode))));
    }

}
