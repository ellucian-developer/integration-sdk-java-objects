
package com.ellucian.generated.eedm.vendors_maximum.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Vendors Maximum
 * <p>
 * A person or organization that offers products or services to an institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "types",
    "vendorDetail",
    "taxId",
    "statuses",
    "startOn",
    "endOn",
    "addresses",
    "phones",
    "defaultAddresses",
    "defaultTaxFormComponent",
    "defaultCurrency",
    "contacts"
})
@Generated("jsonschema2pojo")
public class VendorsMaximum {

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
     * The global identifier of the vendors maximum.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the vendors maximum.")
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
     * The person, organization or educational institution acting as the vendor.
     * (Required)
     * 
     */
    @JsonProperty("vendorDetail")
    @JsonPropertyDescription("The person, organization or educational institution acting as the vendor.")
    private Object vendorDetail;
    /**
     * Tax Id
     * <p>
     * The federal tax identification number for the vendor.
     * 
     */
    @JsonProperty("taxId")
    @JsonPropertyDescription("The federal tax identification number for the vendor.")
    private String taxId;
    /**
     * Statuses
     * <p>
     * The statuses (active, approved, hold payment) that apply to the vendor.
     * 
     */
    @JsonProperty("statuses")
    @JsonPropertyDescription("The statuses (active, approved, hold payment) that apply to the vendor.")
    private List<Status> statuses = new ArrayList<Status>();
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
     * Addresses
     * <p>
     * The address(es) associated with the vendor.
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The address(es) associated with the vendor.")
    private List<Address> addresses = new ArrayList<Address>();
    /**
     * Phones
     * <p>
     * The phones and phone-connected devices at which a vendor can be contacted.
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phones and phone-connected devices at which a vendor can be contacted.")
    private List<Phone__1> phones = new ArrayList<Phone__1>();
    /**
     * Default Addresses
     * <p>
     * The default address(es) associated with the vendor.
     * 
     */
    @JsonProperty("defaultAddresses")
    @JsonPropertyDescription("The default address(es) associated with the vendor.")
    private List<DefaultAddress> defaultAddresses = new ArrayList<DefaultAddress>();
    /**
     * Default Tax Form Component
     * <p>
     * The default tax form component associated with the vendor.
     * 
     */
    @JsonProperty("defaultTaxFormComponent")
    @JsonPropertyDescription("The default tax form component associated with the vendor.")
    private Object defaultTaxFormComponent;
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
     * Contacts
     * <p>
     * The contacts associated with a vendor.
     * 
     */
    @JsonProperty("contacts")
    @JsonPropertyDescription("The contacts associated with a vendor.")
    private List<Contact> contacts = new ArrayList<Contact>();

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

    public VendorsMaximum withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the vendors maximum.
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
     * The global identifier of the vendors maximum.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public VendorsMaximum withId(String id) {
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

    public VendorsMaximum withTypes(List<Type> types) {
        this.types = types;
        return this;
    }

    /**
     * Vendor Detail
     * <p>
     * The person, organization or educational institution acting as the vendor.
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
     * The person, organization or educational institution acting as the vendor.
     * (Required)
     * 
     */
    @JsonProperty("vendorDetail")
    public void setVendorDetail(Object vendorDetail) {
        this.vendorDetail = vendorDetail;
    }

    public VendorsMaximum withVendorDetail(Object vendorDetail) {
        this.vendorDetail = vendorDetail;
        return this;
    }

    /**
     * Tax Id
     * <p>
     * The federal tax identification number for the vendor.
     * 
     */
    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }

    /**
     * Tax Id
     * <p>
     * The federal tax identification number for the vendor.
     * 
     */
    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public VendorsMaximum withTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Statuses
     * <p>
     * The statuses (active, approved, hold payment) that apply to the vendor.
     * 
     */
    @JsonProperty("statuses")
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     * Statuses
     * <p>
     * The statuses (active, approved, hold payment) that apply to the vendor.
     * 
     */
    @JsonProperty("statuses")
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public VendorsMaximum withStatuses(List<Status> statuses) {
        this.statuses = statuses;
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

    public VendorsMaximum withStartOn(Object startOn) {
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

    public VendorsMaximum withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Addresses
     * <p>
     * The address(es) associated with the vendor.
     * 
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Addresses
     * <p>
     * The address(es) associated with the vendor.
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public VendorsMaximum withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Phones
     * <p>
     * The phones and phone-connected devices at which a vendor can be contacted.
     * 
     */
    @JsonProperty("phones")
    public List<Phone__1> getPhones() {
        return phones;
    }

    /**
     * Phones
     * <p>
     * The phones and phone-connected devices at which a vendor can be contacted.
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone__1> phones) {
        this.phones = phones;
    }

    public VendorsMaximum withPhones(List<Phone__1> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Default Addresses
     * <p>
     * The default address(es) associated with the vendor.
     * 
     */
    @JsonProperty("defaultAddresses")
    public List<DefaultAddress> getDefaultAddresses() {
        return defaultAddresses;
    }

    /**
     * Default Addresses
     * <p>
     * The default address(es) associated with the vendor.
     * 
     */
    @JsonProperty("defaultAddresses")
    public void setDefaultAddresses(List<DefaultAddress> defaultAddresses) {
        this.defaultAddresses = defaultAddresses;
    }

    public VendorsMaximum withDefaultAddresses(List<DefaultAddress> defaultAddresses) {
        this.defaultAddresses = defaultAddresses;
        return this;
    }

    /**
     * Default Tax Form Component
     * <p>
     * The default tax form component associated with the vendor.
     * 
     */
    @JsonProperty("defaultTaxFormComponent")
    public Object getDefaultTaxFormComponent() {
        return defaultTaxFormComponent;
    }

    /**
     * Default Tax Form Component
     * <p>
     * The default tax form component associated with the vendor.
     * 
     */
    @JsonProperty("defaultTaxFormComponent")
    public void setDefaultTaxFormComponent(Object defaultTaxFormComponent) {
        this.defaultTaxFormComponent = defaultTaxFormComponent;
    }

    public VendorsMaximum withDefaultTaxFormComponent(Object defaultTaxFormComponent) {
        this.defaultTaxFormComponent = defaultTaxFormComponent;
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

    public VendorsMaximum withDefaultCurrency(Object defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    /**
     * Contacts
     * <p>
     * The contacts associated with a vendor.
     * 
     */
    @JsonProperty("contacts")
    public List<Contact> getContacts() {
        return contacts;
    }

    /**
     * Contacts
     * <p>
     * The contacts associated with a vendor.
     * 
     */
    @JsonProperty("contacts")
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public VendorsMaximum withContacts(List<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorsMaximum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("taxId");
        sb.append('=');
        sb.append(((this.taxId == null)?"<null>":this.taxId));
        sb.append(',');
        sb.append("statuses");
        sb.append('=');
        sb.append(((this.statuses == null)?"<null>":this.statuses));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("addresses");
        sb.append('=');
        sb.append(((this.addresses == null)?"<null>":this.addresses));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("defaultAddresses");
        sb.append('=');
        sb.append(((this.defaultAddresses == null)?"<null>":this.defaultAddresses));
        sb.append(',');
        sb.append("defaultTaxFormComponent");
        sb.append('=');
        sb.append(((this.defaultTaxFormComponent == null)?"<null>":this.defaultTaxFormComponent));
        sb.append(',');
        sb.append("defaultCurrency");
        sb.append('=');
        sb.append(((this.defaultCurrency == null)?"<null>":this.defaultCurrency));
        sb.append(',');
        sb.append("contacts");
        sb.append('=');
        sb.append(((this.contacts == null)?"<null>":this.contacts));
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
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.vendorDetail == null)? 0 :this.vendorDetail.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.defaultAddresses == null)? 0 :this.defaultAddresses.hashCode()));
        result = ((result* 31)+((this.taxId == null)? 0 :this.taxId.hashCode()));
        result = ((result* 31)+((this.defaultCurrency == null)? 0 :this.defaultCurrency.hashCode()));
        result = ((result* 31)+((this.defaultTaxFormComponent == null)? 0 :this.defaultTaxFormComponent.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.statuses == null)? 0 :this.statuses.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.contacts == null)? 0 :this.contacts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorsMaximum) == false) {
            return false;
        }
        VendorsMaximum rhs = ((VendorsMaximum) other);
        return (((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.types == rhs.types)||((this.types!= null)&&this.types.equals(rhs.types))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.vendorDetail == rhs.vendorDetail)||((this.vendorDetail!= null)&&this.vendorDetail.equals(rhs.vendorDetail))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.defaultAddresses == rhs.defaultAddresses)||((this.defaultAddresses!= null)&&this.defaultAddresses.equals(rhs.defaultAddresses))))&&((this.taxId == rhs.taxId)||((this.taxId!= null)&&this.taxId.equals(rhs.taxId))))&&((this.defaultCurrency == rhs.defaultCurrency)||((this.defaultCurrency!= null)&&this.defaultCurrency.equals(rhs.defaultCurrency))))&&((this.defaultTaxFormComponent == rhs.defaultTaxFormComponent)||((this.defaultTaxFormComponent!= null)&&this.defaultTaxFormComponent.equals(rhs.defaultTaxFormComponent))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.statuses == rhs.statuses)||((this.statuses!= null)&&this.statuses.equals(rhs.statuses))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.contacts == rhs.contacts)||((this.contacts!= null)&&this.contacts.equals(rhs.contacts))));
    }

}
