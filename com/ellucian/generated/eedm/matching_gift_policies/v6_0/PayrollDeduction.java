
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Payroll Deduction
 * <p>
 * Payroll deduction offered and required details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offering",
    "requiredness"
})
@Generated("jsonschema2pojo")
public class PayrollDeduction {

    /**
     * Offering
     * <p>
     * Whether the employee contributions can be taken out of the payroll.
     * 
     */
    @JsonProperty("offering")
    @JsonPropertyDescription("Whether the employee contributions can be taken out of the payroll.")
    private PayrollDeduction.Offering offering;
    /**
     * Required
     * <p>
     * Whether the employee contributions have to be taken out of the payroll.
     * 
     */
    @JsonProperty("requiredness")
    @JsonPropertyDescription("Whether the employee contributions have to be taken out of the payroll.")
    private PayrollDeduction.Requiredness requiredness;

    /**
     * Offering
     * <p>
     * Whether the employee contributions can be taken out of the payroll.
     * 
     */
    @JsonProperty("offering")
    public PayrollDeduction.Offering getOffering() {
        return offering;
    }

    /**
     * Offering
     * <p>
     * Whether the employee contributions can be taken out of the payroll.
     * 
     */
    @JsonProperty("offering")
    public void setOffering(PayrollDeduction.Offering offering) {
        this.offering = offering;
    }

    public PayrollDeduction withOffering(PayrollDeduction.Offering offering) {
        this.offering = offering;
        return this;
    }

    /**
     * Required
     * <p>
     * Whether the employee contributions have to be taken out of the payroll.
     * 
     */
    @JsonProperty("requiredness")
    public PayrollDeduction.Requiredness getRequiredness() {
        return requiredness;
    }

    /**
     * Required
     * <p>
     * Whether the employee contributions have to be taken out of the payroll.
     * 
     */
    @JsonProperty("requiredness")
    public void setRequiredness(PayrollDeduction.Requiredness requiredness) {
        this.requiredness = requiredness;
    }

    public PayrollDeduction withRequiredness(PayrollDeduction.Requiredness requiredness) {
        this.requiredness = requiredness;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayrollDeduction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("offering");
        sb.append('=');
        sb.append(((this.offering == null)?"<null>":this.offering));
        sb.append(',');
        sb.append("requiredness");
        sb.append('=');
        sb.append(((this.requiredness == null)?"<null>":this.requiredness));
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
        result = ((result* 31)+((this.requiredness == null)? 0 :this.requiredness.hashCode()));
        result = ((result* 31)+((this.offering == null)? 0 :this.offering.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayrollDeduction) == false) {
            return false;
        }
        PayrollDeduction rhs = ((PayrollDeduction) other);
        return (((this.requiredness == rhs.requiredness)||((this.requiredness!= null)&&this.requiredness.equals(rhs.requiredness)))&&((this.offering == rhs.offering)||((this.offering!= null)&&this.offering.equals(rhs.offering))));
    }


    /**
     * Offering
     * <p>
     * Whether the employee contributions can be taken out of the payroll.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Offering {

        OFFERED("offered"),
        NOT_OFFERED("notOffered");
        private final String value;
        private final static Map<String, PayrollDeduction.Offering> CONSTANTS = new HashMap<String, PayrollDeduction.Offering>();

        static {
            for (PayrollDeduction.Offering c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Offering(String value) {
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
        public static PayrollDeduction.Offering fromValue(String value) {
            PayrollDeduction.Offering constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Required
     * <p>
     * Whether the employee contributions have to be taken out of the payroll.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Requiredness {

        REQUIRED("required"),
        NOT_REQUIRED("notRequired");
        private final String value;
        private final static Map<String, PayrollDeduction.Requiredness> CONSTANTS = new HashMap<String, PayrollDeduction.Requiredness>();

        static {
            for (PayrollDeduction.Requiredness c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Requiredness(String value) {
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
        public static PayrollDeduction.Requiredness fromValue(String value) {
            PayrollDeduction.Requiredness constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
