
package com.ellucian.generated.eedm.buyers.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Buyers
 * <p>
 * Purchasing agents for an institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "code",
    "buyer",
    "startOn",
    "endOn",
    "phone",
    "purchasingLimit",
    "status"
})
@Generated("jsonschema2pojo")
public class Buyers {

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
     * The global identifier of the buyer.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the buyer.")
    private String id;
    /**
     * Code
     * <p>
     * A code that may be used to identify the buyer.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the buyer.")
    private String code;
    /**
     * Buyer
     * <p>
     * The name or detail information of the buyer.
     * (Required)
     * 
     */
    @JsonProperty("buyer")
    @JsonPropertyDescription("The name or detail information of the buyer.")
    private Object buyer;
    /**
     * Start On
     * <p>
     * The earliest date when the buyer is active.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The earliest date when the buyer is active.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date when the buyer was active.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when the buyer was active.")
    private Object endOn;
    /**
     * Phone
     * <p>
     * The phone number of the buyer.
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The phone number of the buyer.")
    private Object phone;
    /**
     * Purchasing Limit
     * <p>
     * The maximum amount of a purchase order to which a buyer may be assigned (i.e. LVPO - low value purchase order).
     * 
     */
    @JsonProperty("purchasingLimit")
    @JsonPropertyDescription("The maximum amount of a purchase order to which a buyer may be assigned (i.e. LVPO - low value purchase order).")
    private Object purchasingLimit;
    /**
     * Status
     * <p>
     * An indication of the buyer's status.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("An indication of the buyer's status.")
    private Object status;

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

    public Buyers withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the buyer.
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
     * The global identifier of the buyer.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Buyers withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the buyer.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the buyer.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Buyers withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Buyer
     * <p>
     * The name or detail information of the buyer.
     * (Required)
     * 
     */
    @JsonProperty("buyer")
    public Object getBuyer() {
        return buyer;
    }

    /**
     * Buyer
     * <p>
     * The name or detail information of the buyer.
     * (Required)
     * 
     */
    @JsonProperty("buyer")
    public void setBuyer(Object buyer) {
        this.buyer = buyer;
    }

    public Buyers withBuyer(Object buyer) {
        this.buyer = buyer;
        return this;
    }

    /**
     * Start On
     * <p>
     * The earliest date when the buyer is active.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The earliest date when the buyer is active.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Buyers withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when the buyer was active.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when the buyer was active.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Buyers withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phone number of the buyer.
     * 
     */
    @JsonProperty("phone")
    public Object getPhone() {
        return phone;
    }

    /**
     * Phone
     * <p>
     * The phone number of the buyer.
     * 
     */
    @JsonProperty("phone")
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Buyers withPhone(Object phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Purchasing Limit
     * <p>
     * The maximum amount of a purchase order to which a buyer may be assigned (i.e. LVPO - low value purchase order).
     * 
     */
    @JsonProperty("purchasingLimit")
    public Object getPurchasingLimit() {
        return purchasingLimit;
    }

    /**
     * Purchasing Limit
     * <p>
     * The maximum amount of a purchase order to which a buyer may be assigned (i.e. LVPO - low value purchase order).
     * 
     */
    @JsonProperty("purchasingLimit")
    public void setPurchasingLimit(Object purchasingLimit) {
        this.purchasingLimit = purchasingLimit;
    }

    public Buyers withPurchasingLimit(Object purchasingLimit) {
        this.purchasingLimit = purchasingLimit;
        return this;
    }

    /**
     * Status
     * <p>
     * An indication of the buyer's status.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * An indication of the buyer's status.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public Buyers withStatus(Object status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Buyers.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("buyer");
        sb.append('=');
        sb.append(((this.buyer == null)?"<null>":this.buyer));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("purchasingLimit");
        sb.append('=');
        sb.append(((this.purchasingLimit == null)?"<null>":this.purchasingLimit));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.purchasingLimit == null)? 0 :this.purchasingLimit.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.buyer == null)? 0 :this.buyer.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Buyers) == false) {
            return false;
        }
        Buyers rhs = ((Buyers) other);
        return ((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.purchasingLimit == rhs.purchasingLimit)||((this.purchasingLimit!= null)&&this.purchasingLimit.equals(rhs.purchasingLimit))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.buyer == rhs.buyer)||((this.buyer!= null)&&this.buyer.equals(rhs.buyer))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
