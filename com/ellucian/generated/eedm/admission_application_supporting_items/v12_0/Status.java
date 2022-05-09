
package com.ellucian.generated.eedm.admission_application_supporting_items.v12_0;

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
 * The status of the supplementary item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "detail"
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
     * Detail
     * <p>
     * Custom status type of the supplementary item.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Custom status type of the supplementary item.")
    private Object detail;

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
     * Detail
     * <p>
     * Custom status type of the supplementary item.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * Custom status type of the supplementary item.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Status withDetail(Object detail) {
        this.detail = detail;
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
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
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
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
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
        WAIVED("waived"),
        NOT_RECEIVED("notReceived");
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
