
package com.ellucian.generated.eedm.vendors.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Vendors
 * <p>
 * A person or organization who offers products or services to an institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "types",
    "vendorDetail",
    "relatedVendors",
    "classifications",
    "paymentTerms",
    "paymentSources",
    "statuses",
    "vendorHoldReasons",
    "startOn",
    "endOn",
    "defaultCurrency",
    "comment"
})
@Generated("jsonschema2pojo")
public class Vendors {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the vendor.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the vendor.")
    private String id;
    /**
     * Types
     * <p>
     * The type(s) of vendor, i.e. Procurement, eProcurement, or Travel.
     * 
     */
    @JsonProperty("types")
    @JsonPropertyDescription("The type(s) of vendor, i.e. Procurement, eProcurement, or Travel.")
    private List<Type> types = new ArrayList<Type>();
    /**
     * Vendor Detail
     * <p>
     * The person or organization acting as the vendor.
     * (Required)
     * 
     */
    @JsonProperty("vendorDetail")
    @JsonPropertyDescription("The person or organization acting as the vendor.")
    private Object vendorDetail;
    /**
     * Related Vendors
     * <p>
     * The vendor(s) assigned to receive payment for this vendor or the parent vendor.
     * 
     */
    @JsonProperty("relatedVendors")
    @JsonPropertyDescription("The vendor(s) assigned to receive payment for this vendor or the parent vendor.")
    private List<RelatedVendor> relatedVendors = new ArrayList<RelatedVendor>();
    /**
     * Classifications
     * <p>
     * The vendor's classification (E.g. federal contract, small business, etc. )
     * 
     */
    @JsonProperty("classifications")
    @JsonPropertyDescription("The vendor's classification (E.g. federal contract, small business, etc. )")
    private List<Classification> classifications = new ArrayList<Classification>();
    /**
     * Payment Terms
     * <p>
     * The payment terms and conditions that may be applied to the vendor.
     * 
     */
    @JsonProperty("paymentTerms")
    @JsonPropertyDescription("The payment terms and conditions that may be applied to the vendor.")
    private List<PaymentTerm> paymentTerms = new ArrayList<PaymentTerm>();
    /**
     * Payment Sources
     * <p>
     * The accounts payable sources associated with the vendor.
     * 
     */
    @JsonProperty("paymentSources")
    @JsonPropertyDescription("The accounts payable sources associated with the vendor.")
    private List<PaymentSource> paymentSources = new ArrayList<PaymentSource>();
    /**
     * Statuses
     * <p>
     * The statuses (active, approved, stop payment) that apply to the vendor.
     * 
     */
    @JsonProperty("statuses")
    @JsonPropertyDescription("The statuses (active, approved, stop payment) that apply to the vendor.")
    private List<Status> statuses = new ArrayList<Status>();
    /**
     * Vendor Hold Reasons
     * <p>
     * The reasons the vendor has been placed on hold.
     * 
     */
    @JsonProperty("vendorHoldReasons")
    @JsonPropertyDescription("The reasons the vendor has been placed on hold.")
    private List<VendorHoldReason> vendorHoldReasons = new ArrayList<VendorHoldReason>();
    /**
     * Start On
     * <p>
     * The first date when the vendor was active/registered.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date when the vendor was active/registered.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date when the vendor was active.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when the vendor was active.")
    private Object endOn;
    /**
     * Default Currency
     * <p>
     * The default currency for the vendor.
     * 
     */
    @JsonProperty("defaultCurrency")
    @JsonPropertyDescription("The default currency for the vendor.")
    private Object defaultCurrency;
    /**
     * Comment
     * <p>
     * Comment generated regarding the vendor.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Comment generated regarding the vendor.")
    private String comment;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Vendors withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the vendor.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the vendor.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Vendors withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Types
     * <p>
     * The type(s) of vendor, i.e. Procurement, eProcurement, or Travel.
     * 
     */
    @JsonProperty("types")
    public List<Type> getTypes() {
        return types;
    }

    /**
     * Types
     * <p>
     * The type(s) of vendor, i.e. Procurement, eProcurement, or Travel.
     * 
     */
    @JsonProperty("types")
    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Vendors withTypes(List<Type> types) {
        this.types = types;
        return this;
    }

    /**
     * Vendor Detail
     * <p>
     * The person or organization acting as the vendor.
     * (Required)
     * 
     */
    @JsonProperty("vendorDetail")
    public Object getVendorDetail() {
        return vendorDetail;
    }

    /**
     * Vendor Detail
     * <p>
     * The person or organization acting as the vendor.
     * (Required)
     * 
     */
    @JsonProperty("vendorDetail")
    public void setVendorDetail(Object vendorDetail) {
        this.vendorDetail = vendorDetail;
    }

    public Vendors withVendorDetail(Object vendorDetail) {
        this.vendorDetail = vendorDetail;
        return this;
    }

    /**
     * Related Vendors
     * <p>
     * The vendor(s) assigned to receive payment for this vendor or the parent vendor.
     * 
     */
    @JsonProperty("relatedVendors")
    public List<RelatedVendor> getRelatedVendors() {
        return relatedVendors;
    }

    /**
     * Related Vendors
     * <p>
     * The vendor(s) assigned to receive payment for this vendor or the parent vendor.
     * 
     */
    @JsonProperty("relatedVendors")
    public void setRelatedVendors(List<RelatedVendor> relatedVendors) {
        this.relatedVendors = relatedVendors;
    }

    public Vendors withRelatedVendors(List<RelatedVendor> relatedVendors) {
        this.relatedVendors = relatedVendors;
        return this;
    }

    /**
     * Classifications
     * <p>
     * The vendor's classification (E.g. federal contract, small business, etc. )
     * 
     */
    @JsonProperty("classifications")
    public List<Classification> getClassifications() {
        return classifications;
    }

    /**
     * Classifications
     * <p>
     * The vendor's classification (E.g. federal contract, small business, etc. )
     * 
     */
    @JsonProperty("classifications")
    public void setClassifications(List<Classification> classifications) {
        this.classifications = classifications;
    }

    public Vendors withClassifications(List<Classification> classifications) {
        this.classifications = classifications;
        return this;
    }

    /**
     * Payment Terms
     * <p>
     * The payment terms and conditions that may be applied to the vendor.
     * 
     */
    @JsonProperty("paymentTerms")
    public List<PaymentTerm> getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Payment Terms
     * <p>
     * The payment terms and conditions that may be applied to the vendor.
     * 
     */
    @JsonProperty("paymentTerms")
    public void setPaymentTerms(List<PaymentTerm> paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public Vendors withPaymentTerms(List<PaymentTerm> paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }

    /**
     * Payment Sources
     * <p>
     * The accounts payable sources associated with the vendor.
     * 
     */
    @JsonProperty("paymentSources")
    public List<PaymentSource> getPaymentSources() {
        return paymentSources;
    }

    /**
     * Payment Sources
     * <p>
     * The accounts payable sources associated with the vendor.
     * 
     */
    @JsonProperty("paymentSources")
    public void setPaymentSources(List<PaymentSource> paymentSources) {
        this.paymentSources = paymentSources;
    }

    public Vendors withPaymentSources(List<PaymentSource> paymentSources) {
        this.paymentSources = paymentSources;
        return this;
    }

    /**
     * Statuses
     * <p>
     * The statuses (active, approved, stop payment) that apply to the vendor.
     * 
     */
    @JsonProperty("statuses")
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     * Statuses
     * <p>
     * The statuses (active, approved, stop payment) that apply to the vendor.
     * 
     */
    @JsonProperty("statuses")
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public Vendors withStatuses(List<Status> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Vendor Hold Reasons
     * <p>
     * The reasons the vendor has been placed on hold.
     * 
     */
    @JsonProperty("vendorHoldReasons")
    public List<VendorHoldReason> getVendorHoldReasons() {
        return vendorHoldReasons;
    }

    /**
     * Vendor Hold Reasons
     * <p>
     * The reasons the vendor has been placed on hold.
     * 
     */
    @JsonProperty("vendorHoldReasons")
    public void setVendorHoldReasons(List<VendorHoldReason> vendorHoldReasons) {
        this.vendorHoldReasons = vendorHoldReasons;
    }

    public Vendors withVendorHoldReasons(List<VendorHoldReason> vendorHoldReasons) {
        this.vendorHoldReasons = vendorHoldReasons;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date when the vendor was active/registered.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date when the vendor was active/registered.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Vendors withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when the vendor was active.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when the vendor was active.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Vendors withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Default Currency
     * <p>
     * The default currency for the vendor.
     * 
     */
    @JsonProperty("defaultCurrency")
    public Object getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Default Currency
     * <p>
     * The default currency for the vendor.
     * 
     */
    @JsonProperty("defaultCurrency")
    public void setDefaultCurrency(Object defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public Vendors withDefaultCurrency(Object defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
     * Comment
     * <p>
     * Comment generated regarding the vendor.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Comment generated regarding the vendor.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Vendors withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Vendors.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("types");
        sb.append('=');
        sb.append(((this.types == null)?"<null>":this.types));
        sb.append(',');
        sb.append("vendorDetail");
        sb.append('=');
        sb.append(((this.vendorDetail == null)?"<null>":this.vendorDetail));
        sb.append(',');
        sb.append("relatedVendors");
        sb.append('=');
        sb.append(((this.relatedVendors == null)?"<null>":this.relatedVendors));
        sb.append(',');
        sb.append("classifications");
        sb.append('=');
        sb.append(((this.classifications == null)?"<null>":this.classifications));
        sb.append(',');
        sb.append("paymentTerms");
        sb.append('=');
        sb.append(((this.paymentTerms == null)?"<null>":this.paymentTerms));
        sb.append(',');
        sb.append("paymentSources");
        sb.append('=');
        sb.append(((this.paymentSources == null)?"<null>":this.paymentSources));
        sb.append(',');
        sb.append("statuses");
        sb.append('=');
        sb.append(((this.statuses == null)?"<null>":this.statuses));
        sb.append(',');
        sb.append("vendorHoldReasons");
        sb.append('=');
        sb.append(((this.vendorHoldReasons == null)?"<null>":this.vendorHoldReasons));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("defaultCurrency");
        sb.append('=');
        sb.append(((this.defaultCurrency == null)?"<null>":this.defaultCurrency));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.types == null)? 0 :this.types.hashCode()));
        result = ((result* 31)+((this.vendorDetail == null)? 0 :this.vendorDetail.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.classifications == null)? 0 :this.classifications.hashCode()));
        result = ((result* 31)+((this.paymentSources == null)? 0 :this.paymentSources.hashCode()));
        result = ((result* 31)+((this.defaultCurrency == null)? 0 :this.defaultCurrency.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.statuses == null)? 0 :this.statuses.hashCode()));
        result = ((result* 31)+((this.relatedVendors == null)? 0 :this.relatedVendors.hashCode()));
        result = ((result* 31)+((this.vendorHoldReasons == null)? 0 :this.vendorHoldReasons.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.paymentTerms == null)? 0 :this.paymentTerms.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Vendors) == false) {
            return false;
        }
        Vendors rhs = ((Vendors) other);
        return (((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.types == rhs.types)||((this.types!= null)&&this.types.equals(rhs.types))))&&((this.vendorDetail == rhs.vendorDetail)||((this.vendorDetail!= null)&&this.vendorDetail.equals(rhs.vendorDetail))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.classifications == rhs.classifications)||((this.classifications!= null)&&this.classifications.equals(rhs.classifications))))&&((this.paymentSources == rhs.paymentSources)||((this.paymentSources!= null)&&this.paymentSources.equals(rhs.paymentSources))))&&((this.defaultCurrency == rhs.defaultCurrency)||((this.defaultCurrency!= null)&&this.defaultCurrency.equals(rhs.defaultCurrency))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.statuses == rhs.statuses)||((this.statuses!= null)&&this.statuses.equals(rhs.statuses))))&&((this.relatedVendors == rhs.relatedVendors)||((this.relatedVendors!= null)&&this.relatedVendors.equals(rhs.relatedVendors))))&&((this.vendorHoldReasons == rhs.vendorHoldReasons)||((this.vendorHoldReasons!= null)&&this.vendorHoldReasons.equals(rhs.vendorHoldReasons))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.paymentTerms == rhs.paymentTerms)||((this.paymentTerms!= null)&&this.paymentTerms.equals(rhs.paymentTerms))));
    }

}
