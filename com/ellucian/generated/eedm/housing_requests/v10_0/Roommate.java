
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
 * Roommate
 * <p>
 * The person's preferred roommate.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "preferred",
    "required"
})
@Generated("jsonschema2pojo")
public class Roommate {

    /**
     * Preferred
     * <p>
     * The person's preferred roommate.
     * (Required)
     * 
     */
    @JsonProperty("preferred")
    @JsonPropertyDescription("The person's preferred roommate.")
    private Preferred__1 preferred;
    /**
     * Required
     * <p>
     * An indication if the preference is required or optional.
     * (Required)
     * 
     */
    @JsonProperty("required")
    @JsonPropertyDescription("An indication if the preference is required or optional.")
    private Roommate.Required required;

    /**
     * Preferred
     * <p>
     * The person's preferred roommate.
     * (Required)
     * 
     */
    @JsonProperty("preferred")
    public Preferred__1 getPreferred() {
        return preferred;
    }

    /**
     * Preferred
     * <p>
     * The person's preferred roommate.
     * (Required)
     * 
     */
    @JsonProperty("preferred")
    public void setPreferred(Preferred__1 preferred) {
        this.preferred = preferred;
    }

    public Roommate withPreferred(Preferred__1 preferred) {
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
    public Roommate.Required getRequired() {
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
    public void setRequired(Roommate.Required required) {
        this.required = required;
    }

    public Roommate withRequired(Roommate.Required required) {
        this.required = required;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Roommate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Roommate) == false) {
            return false;
        }
        Roommate rhs = ((Roommate) other);
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
        private final static Map<String, Roommate.Required> CONSTANTS = new HashMap<String, Roommate.Required>();

        static {
            for (Roommate.Required c: values()) {
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
        public static Roommate.Required fromValue(String value) {
            Roommate.Required constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
