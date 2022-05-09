
package com.ellucian.generated.eedm.admission_application_supporting_items.v6_0;

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
 * Status
 * <p>
 * Status of the supplementary item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "details"
})
@Generated("jsonschema2pojo")
public class Status {

    /**
     * Type
     * <p>
     * Status type of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Status type of the supplementary item.")
    private Status.Type type;
    /**
     * Details
     * <p>
     * Detail status type of the supplementary item.
     * 
     */
    @JsonProperty("details")
    @JsonPropertyDescription("Detail status type of the supplementary item.")
    private Details details;

    /**
     * Type
     * <p>
     * Status type of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Status.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Status type of the supplementary item.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Status.Type type) {
        this.type = type;
    }

    public Status withType(Status.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Details
     * <p>
     * Detail status type of the supplementary item.
     * 
     */
    @JsonProperty("details")
    public Details getDetails() {
        return details;
    }

    /**
     * Details
     * <p>
     * Detail status type of the supplementary item.
     * 
     */
    @JsonProperty("details")
    public void setDetails(Details details) {
        this.details = details;
    }

    public Status withDetails(Details details) {
        this.details = details;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("details");
        sb.append('=');
        sb.append(((this.details == null)?"<null>":this.details));
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
        result = ((result* 31)+((this.details == null)? 0 :this.details.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.details == rhs.details)||((this.details!= null)&&this.details.equals(rhs.details))));
    }


    /**
     * Type
     * <p>
     * Status type of the supplementary item.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        INCOMPLETE("incomplete"),
        RECEIVED("received"),
        WAIVED("waived");
        private final String value;
        private final static Map<String, Status.Type> CONSTANTS = new HashMap<String, Status.Type>();

        static {
            for (Status.Type c: values()) {
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
        public static Status.Type fromValue(String value) {
            Status.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
