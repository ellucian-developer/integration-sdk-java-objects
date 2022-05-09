
package com.ellucian.generated.eedm.vendors.v11_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "vendor"
})
@Generated("jsonschema2pojo")
public class RelatedVendor {

    /**
     * Type
     * <p>
     * The type of related vendor.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of related vendor.")
    private RelatedVendor.Type type;
    /**
     * Vendor
     * <p>
     * The related vendor.
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("The related vendor.")
    private Vendor vendor;

    /**
     * Type
     * <p>
     * The type of related vendor.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public RelatedVendor.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of related vendor.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(RelatedVendor.Type type) {
        this.type = type;
    }

    public RelatedVendor withType(RelatedVendor.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Vendor
     * <p>
     * The related vendor.
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Vendor
     * <p>
     * The related vendor.
     * (Required)
     * 
     */
    @JsonProperty("vendor")
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public RelatedVendor withVendor(Vendor vendor) {
        this.vendor = vendor;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RelatedVendor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null)?"<null>":this.vendor));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.vendor == null)? 0 :this.vendor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelatedVendor) == false) {
            return false;
        }
        RelatedVendor rhs = ((RelatedVendor) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.vendor == rhs.vendor)||((this.vendor!= null)&&this.vendor.equals(rhs.vendor))));
    }


    /**
     * Type
     * <p>
     * The type of related vendor.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        PAYMENT_VENDOR("paymentVendor"),
        PARENT_VENDOR("parentVendor");
        private final String value;
        private final static Map<String, RelatedVendor.Type> CONSTANTS = new HashMap<String, RelatedVendor.Type>();

        static {
            for (RelatedVendor.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static RelatedVendor.Type fromValue(String value) {
            RelatedVendor.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
