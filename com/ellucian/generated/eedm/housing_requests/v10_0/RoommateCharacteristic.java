
package com.ellucian.generated.eedm.housing_requests.v10_0;

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
 * Roommate Characteristic
 * <p>
 * The person's preferred roommate characteristic.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferred",
    "required"
})
@Generated("jsonschema2pojo")
public class RoommateCharacteristic {

    /**
     * Preferred
     * <p>
     * The person's preferred roommate characteristic.
     * (Required)
     * 
     */
    @JsonProperty("preferred")
    @JsonPropertyDescription("The person's preferred roommate characteristic.")
    private Preferred__2 preferred;
    /**
     * Required
     * <p>
     * An indication if the preference is required or optional.
     * (Required)
     * 
     */
    @JsonProperty("required")
    @JsonPropertyDescription("An indication if the preference is required or optional.")
    private RoommateCharacteristic.Required required;

    /**
     * Preferred
     * <p>
     * The person's preferred roommate characteristic.
     * (Required)
     * 
     */
    @JsonProperty("preferred")
    public Preferred__2 getPreferred() {
        return preferred;
    }

    /**
     * Preferred
     * <p>
     * The person's preferred roommate characteristic.
     * (Required)
     * 
     */
    @JsonProperty("preferred")
    public void setPreferred(Preferred__2 preferred) {
        this.preferred = preferred;
    }

    public RoommateCharacteristic withPreferred(Preferred__2 preferred) {
        this.preferred = preferred;
        return this;
    }

    /**
     * Required
     * <p>
     * An indication if the preference is required or optional.
     * (Required)
     * 
     */
    @JsonProperty("required")
    public RoommateCharacteristic.Required getRequired() {
        return required;
    }

    /**
     * Required
     * <p>
     * An indication if the preference is required or optional.
     * (Required)
     * 
     */
    @JsonProperty("required")
    public void setRequired(RoommateCharacteristic.Required required) {
        this.required = required;
    }

    public RoommateCharacteristic withRequired(RoommateCharacteristic.Required required) {
        this.required = required;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoommateCharacteristic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preferred");
        sb.append('=');
        sb.append(((this.preferred == null)?"<null>":this.preferred));
        sb.append(',');
        sb.append("required");
        sb.append('=');
        sb.append(((this.required == null)?"<null>":this.required));
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
        result = ((result* 31)+((this.preferred == null)? 0 :this.preferred.hashCode()));
        result = ((result* 31)+((this.required == null)? 0 :this.required.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoommateCharacteristic) == false) {
            return false;
        }
        RoommateCharacteristic rhs = ((RoommateCharacteristic) other);
        return (((this.preferred == rhs.preferred)||((this.preferred!= null)&&this.preferred.equals(rhs.preferred)))&&((this.required == rhs.required)||((this.required!= null)&&this.required.equals(rhs.required))));
    }


    /**
     * Required
     * <p>
     * An indication if the preference is required or optional.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Required {

        MANDATORY("mandatory"),
        OPTIONAL("optional");
        private final String value;
        private final static Map<String, RoommateCharacteristic.Required> CONSTANTS = new HashMap<String, RoommateCharacteristic.Required>();

        static {
            for (RoommateCharacteristic.Required c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Required(String value) {
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
        public static RoommateCharacteristic.Required fromValue(String value) {
            RoommateCharacteristic.Required constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
