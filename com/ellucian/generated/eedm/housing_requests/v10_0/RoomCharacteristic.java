
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferred",
    "required"
})
@Generated("jsonschema2pojo")
public class RoomCharacteristic {

    /**
     * Preferred
     * <p>
     * A person's preferred room characteristic.
     * (Required)
     * 
     */
    @JsonProperty("preferred")
    @JsonPropertyDescription("A person's preferred room characteristic.")
    private Preferred preferred;
    /**
     * Required
     * <p>
     * An indication if the preference is required or optional.
     * (Required)
     * 
     */
    @JsonProperty("required")
    @JsonPropertyDescription("An indication if the preference is required or optional.")
    private RoomCharacteristic.Required required;

    /**
     * Preferred
     * <p>
     * A person's preferred room characteristic.
     * (Required)
     * 
     */
    @JsonProperty("preferred")
    public Preferred getPreferred() {
        return preferred;
    }

    /**
     * Preferred
     * <p>
     * A person's preferred room characteristic.
     * (Required)
     * 
     */
    @JsonProperty("preferred")
    public void setPreferred(Preferred preferred) {
        this.preferred = preferred;
    }

    public RoomCharacteristic withPreferred(Preferred preferred) {
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
    public RoomCharacteristic.Required getRequired() {
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
    public void setRequired(RoomCharacteristic.Required required) {
        this.required = required;
    }

    public RoomCharacteristic withRequired(RoomCharacteristic.Required required) {
        this.required = required;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomCharacteristic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof RoomCharacteristic) == false) {
            return false;
        }
        RoomCharacteristic rhs = ((RoomCharacteristic) other);
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
        private final static Map<String, RoomCharacteristic.Required> CONSTANTS = new HashMap<String, RoomCharacteristic.Required>();

        static {
            for (RoomCharacteristic.Required c: values()) {
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
        public static RoomCharacteristic.Required fromValue(String value) {
            RoomCharacteristic.Required constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
