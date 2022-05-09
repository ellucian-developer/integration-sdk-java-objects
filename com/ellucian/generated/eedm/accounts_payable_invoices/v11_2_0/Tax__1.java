
package com.ellucian.generated.eedm.accounts_payable_invoices.v11_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "taxCode",
    "vendorAmount",
    "taxCodeRates"
})
@Generated("jsonschema2pojo")
public class Tax__1 {

    /**
     * Tax Code
     * <p>
     * A tax code that applies to the line item.
     * (Required)
     * 
     */
    @JsonProperty("taxCode")
    @JsonPropertyDescription("A tax code that applies to the line item.")
    private TaxCode__1 taxCode;
    /**
     * Vendor Amount
     * <p>
     * The amount of taxes for the line item based on the tax code as specified by the vendor.
     * 
     */
    @JsonProperty("vendorAmount")
    @JsonPropertyDescription("The amount of taxes for the line item based on the tax code as specified by the vendor.")
    private Object vendorAmount;
    /**
     * Tax Code Rates
     * <p>
     * The tax code rate(s) that apply to the line item.
     * 
     */
    @JsonProperty("taxCodeRates")
    @JsonPropertyDescription("The tax code rate(s) that apply to the line item.")
    private List<TaxCodeRate> taxCodeRates = new ArrayList<TaxCodeRate>();

    /**
     * Tax Code
     * <p>
     * A tax code that applies to the line item.
     * (Required)
     * 
     */
    @JsonProperty("taxCode")
    public TaxCode__1 getTaxCode() {
        return taxCode;
    }

    /**
     * Tax Code
     * <p>
     * A tax code that applies to the line item.
     * (Required)
     * 
     */
    @JsonProperty("taxCode")
    public void setTaxCode(TaxCode__1 taxCode) {
        this.taxCode = taxCode;
    }

    public Tax__1 withTaxCode(TaxCode__1 taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    /**
     * Vendor Amount
     * <p>
     * The amount of taxes for the line item based on the tax code as specified by the vendor.
     * 
     */
    @JsonProperty("vendorAmount")
    public Object getVendorAmount() {
        return vendorAmount;
    }

    /**
     * Vendor Amount
     * <p>
     * The amount of taxes for the line item based on the tax code as specified by the vendor.
     * 
     */
    @JsonProperty("vendorAmount")
    public void setVendorAmount(Object vendorAmount) {
        this.vendorAmount = vendorAmount;
    }

    public Tax__1 withVendorAmount(Object vendorAmount) {
        this.vendorAmount = vendorAmount;
        return this;
    }

    /**
     * Tax Code Rates
     * <p>
     * The tax code rate(s) that apply to the line item.
     * 
     */
    @JsonProperty("taxCodeRates")
    public List<TaxCodeRate> getTaxCodeRates() {
        return taxCodeRates;
    }

    /**
     * Tax Code Rates
     * <p>
     * The tax code rate(s) that apply to the line item.
     * 
     */
    @JsonProperty("taxCodeRates")
    public void setTaxCodeRates(List<TaxCodeRate> taxCodeRates) {
        this.taxCodeRates = taxCodeRates;
    }

    public Tax__1 withTaxCodeRates(List<TaxCodeRate> taxCodeRates) {
        this.taxCodeRates = taxCodeRates;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tax__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("taxCode");
        sb.append('=');
        sb.append(((this.taxCode == null)?"<null>":this.taxCode));
        sb.append(',');
        sb.append("vendorAmount");
        sb.append('=');
        sb.append(((this.vendorAmount == null)?"<null>":this.vendorAmount));
        sb.append(',');
        sb.append("taxCodeRates");
        sb.append('=');
        sb.append(((this.taxCodeRates == null)?"<null>":this.taxCodeRates));
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
        result = ((result* 31)+((this.taxCodeRates == null)? 0 :this.taxCodeRates.hashCode()));
        result = ((result* 31)+((this.taxCode == null)? 0 :this.taxCode.hashCode()));
        result = ((result* 31)+((this.vendorAmount == null)? 0 :this.vendorAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tax__1) == false) {
            return false;
        }
        Tax__1 rhs = ((Tax__1) other);
        return ((((this.taxCodeRates == rhs.taxCodeRates)||((this.taxCodeRates!= null)&&this.taxCodeRates.equals(rhs.taxCodeRates)))&&((this.taxCode == rhs.taxCode)||((this.taxCode!= null)&&this.taxCode.equals(rhs.taxCode))))&&((this.vendorAmount == rhs.vendorAmount)||((this.vendorAmount!= null)&&this.vendorAmount.equals(rhs.vendorAmount))));
    }

}
