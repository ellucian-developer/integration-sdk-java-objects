
package com.ellucian.generated.eedm.purchase_orders.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Vendor
 * <p>
 * The vendor associated with the purchase order.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "existingVendor",
    "manualVendorDetail"
})
@Generated("jsonschema2pojo")
public class Vendor {

    /**
     * Existing Vendor
     * <p>
     * The details associated with an existing vendor.
     * 
     */
    @JsonProperty("existingVendor")
    @JsonPropertyDescription("The details associated with an existing vendor.")
    private Object existingVendor;
    /**
     * Manual Vendor Detail
     * <p>
     * The detail associated with an undefined vendor or an override to an existing vendor's information.
     * 
     */
    @JsonProperty("manualVendorDetail")
    @JsonPropertyDescription("The detail associated with an undefined vendor or an override to an existing vendor's information.")
    private ManualVendorDetail manualVendorDetail;

    /**
     * Existing Vendor
     * <p>
     * The details associated with an existing vendor.
     * 
     */
    @JsonProperty("existingVendor")
    public Object getExistingVendor() {
        return existingVendor;
    }

    /**
     * Existing Vendor
     * <p>
     * The details associated with an existing vendor.
     * 
     */
    @JsonProperty("existingVendor")
    public void setExistingVendor(Object existingVendor) {
        this.existingVendor = existingVendor;
    }

    public Vendor withExistingVendor(Object existingVendor) {
        this.existingVendor = existingVendor;
        return this;
    }

    /**
     * Manual Vendor Detail
     * <p>
     * The detail associated with an undefined vendor or an override to an existing vendor's information.
     * 
     */
    @JsonProperty("manualVendorDetail")
    public ManualVendorDetail getManualVendorDetail() {
        return manualVendorDetail;
    }

    /**
     * Manual Vendor Detail
     * <p>
     * The detail associated with an undefined vendor or an override to an existing vendor's information.
     * 
     */
    @JsonProperty("manualVendorDetail")
    public void setManualVendorDetail(ManualVendorDetail manualVendorDetail) {
        this.manualVendorDetail = manualVendorDetail;
    }

    public Vendor withManualVendorDetail(ManualVendorDetail manualVendorDetail) {
        this.manualVendorDetail = manualVendorDetail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Vendor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("existingVendor");
        sb.append('=');
        sb.append(((this.existingVendor == null)?"<null>":this.existingVendor));
        sb.append(',');
        sb.append("manualVendorDetail");
        sb.append('=');
        sb.append(((this.manualVendorDetail == null)?"<null>":this.manualVendorDetail));
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
        result = ((result* 31)+((this.manualVendorDetail == null)? 0 :this.manualVendorDetail.hashCode()));
        result = ((result* 31)+((this.existingVendor == null)? 0 :this.existingVendor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Vendor) == false) {
            return false;
        }
        Vendor rhs = ((Vendor) other);
        return (((this.manualVendorDetail == rhs.manualVendorDetail)||((this.manualVendorDetail!= null)&&this.manualVendorDetail.equals(rhs.manualVendorDetail)))&&((this.existingVendor == rhs.existingVendor)||((this.existingVendor!= null)&&this.existingVendor.equals(rhs.existingVendor))));
    }

}
