
package com.ellucian.generated.eedm.accounts_payable_invoices.v11_2_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "taxCode",
    "vendorAmount"
})
@Generated("jsonschema2pojo")
public class Tax {

    /**
     * Tax Code
     * <p>
     * A tax code applicable to the invoice.
     * (Required)
     * 
     */
    @JsonProperty("taxCode")
    @JsonPropertyDescription("A tax code applicable to the invoice.")
    private TaxCode taxCode;
    /**
     * Vendor Amount
     * <p>
     * The amount of taxes for the tax code as specified by the vendor.
     * 
     */
    @JsonProperty("vendorAmount")
    @JsonPropertyDescription("The amount of taxes for the tax code as specified by the vendor.")
    private Object vendorAmount;

    /**
     * Tax Code
     * <p>
     * A tax code applicable to the invoice.
     * (Required)
     * 
     */
    @JsonProperty("taxCode")
    public TaxCode getTaxCode() {
        return taxCode;
    }

    /**
     * Tax Code
     * <p>
     * A tax code applicable to the invoice.
     * (Required)
     * 
     */
    @JsonProperty("taxCode")
    public void setTaxCode(TaxCode taxCode) {
        this.taxCode = taxCode;
    }

    public Tax withTaxCode(TaxCode taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    /**
     * Vendor Amount
     * <p>
     * The amount of taxes for the tax code as specified by the vendor.
     * 
     */
    @JsonProperty("vendorAmount")
    public Object getVendorAmount() {
        return vendorAmount;
    }

    /**
     * Vendor Amount
     * <p>
     * The amount of taxes for the tax code as specified by the vendor.
     * 
     */
    @JsonProperty("vendorAmount")
    public void setVendorAmount(Object vendorAmount) {
        this.vendorAmount = vendorAmount;
    }

    public Tax withVendorAmount(Object vendorAmount) {
        this.vendorAmount = vendorAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tax.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("taxCode");
        sb.append('=');
        sb.append(((this.taxCode == null)?"<null>":this.taxCode));
        sb.append(',');
        sb.append("vendorAmount");
        sb.append('=');
        sb.append(((this.vendorAmount == null)?"<null>":this.vendorAmount));
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
        result = ((result* 31)+((this.taxCode == null)? 0 :this.taxCode.hashCode()));
        result = ((result* 31)+((this.vendorAmount == null)? 0 :this.vendorAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tax) == false) {
            return false;
        }
        Tax rhs = ((Tax) other);
        return (((this.taxCode == rhs.taxCode)||((this.taxCode!= null)&&this.taxCode.equals(rhs.taxCode)))&&((this.vendorAmount == rhs.vendorAmount)||((this.vendorAmount!= null)&&this.vendorAmount.equals(rhs.vendorAmount))));
    }

}
