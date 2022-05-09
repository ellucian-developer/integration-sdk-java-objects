
package com.ellucian.generated.eedm.purchase_orders.v11_0;

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
    "manualVendorDetails"
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
     * Manual Vendor Details
     * <p>
     * The details associated with an undefined vendor or an override to an existing vendor's information.
     * 
     */
    @JsonProperty("manualVendorDetails")
    @JsonPropertyDescription("The details associated with an undefined vendor or an override to an existing vendor's information.")
    private ManualVendorDetails manualVendorDetails;

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
     * Manual Vendor Details
     * <p>
     * The details associated with an undefined vendor or an override to an existing vendor's information.
     * 
     */
    @JsonProperty("manualVendorDetails")
    public ManualVendorDetails getManualVendorDetails() {
        return manualVendorDetails;
    }

    /**
     * Manual Vendor Details
     * <p>
     * The details associated with an undefined vendor or an override to an existing vendor's information.
     * 
     */
    @JsonProperty("manualVendorDetails")
    public void setManualVendorDetails(ManualVendorDetails manualVendorDetails) {
        this.manualVendorDetails = manualVendorDetails;
    }

    public Vendor withManualVendorDetails(ManualVendorDetails manualVendorDetails) {
        this.manualVendorDetails = manualVendorDetails;
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
        sb.append("manualVendorDetails");
        sb.append('=');
        sb.append(((this.manualVendorDetails == null)?"<null>":this.manualVendorDetails));
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
        result = ((result* 31)+((this.manualVendorDetails == null)? 0 :this.manualVendorDetails.hashCode()));
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
        return (((this.manualVendorDetails == rhs.manualVendorDetails)||((this.manualVendorDetails!= null)&&this.manualVendorDetails.equals(rhs.manualVendorDetails)))&&((this.existingVendor == rhs.existingVendor)||((this.existingVendor!= null)&&this.existingVendor.equals(rhs.existingVendor))));
    }

}
