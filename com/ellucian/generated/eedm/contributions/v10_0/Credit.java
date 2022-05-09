
package com.ellucian.generated.eedm.contributions.v10_0;

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
    "amount"
})
@Generated("jsonschema2pojo")
public class Credit {

    /**
     * Type
     * <p>
     * The type of credit given to the donor.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of credit given to the donor.")
    private Credit.Type type;
    /**
     * Amount
     * <p>
     * The amount of credit of the specified type given to the donor.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount of credit of the specified type given to the donor.")
    private Object amount;

    /**
     * Type
     * <p>
     * The type of credit given to the donor.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Credit.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of credit given to the donor.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Credit.Type type) {
        this.type = type;
    }

    public Credit withType(Credit.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount of credit of the specified type given to the donor.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount of credit of the specified type given to the donor.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public Credit withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Credit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Credit) == false) {
            return false;
        }
        Credit rhs = ((Credit) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))));
    }


    /**
     * Type
     * <p>
     * The type of credit given to the donor.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        LEGAL("legal"),
        RECOGNITION("recognition"),
        MATCH("match"),
        SOFT("soft"),
        OTHER("other"),
        CAMPAIGN("campaign");
        private final String value;
        private final static Map<String, Credit.Type> CONSTANTS = new HashMap<String, Credit.Type>();

        static {
            for (Credit.Type c: values()) {
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
        public static Credit.Type fromValue(String value) {
            Credit.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
