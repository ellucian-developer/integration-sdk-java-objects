
package com.ellucian.generated.eedm.institution_positions.v11_0;

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
    "position",
    "type"
})
@Generated("jsonschema2pojo")
public class ReportsTo {

    /**
     * Position
     * <p>
     * The position to which this position reports.
     * (Required)
     * 
     */
    @JsonProperty("position")
    @JsonPropertyDescription("The position to which this position reports.")
    private Position position;
    /**
     * Type
     * <p>
     * The type of reporting position (e.g. primary, alternate, etc).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of reporting position (e.g. primary, alternate, etc).")
    private ReportsTo.Type type;

    /**
     * Position
     * <p>
     * The position to which this position reports.
     * (Required)
     * 
     */
    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    /**
     * Position
     * <p>
     * The position to which this position reports.
     * (Required)
     * 
     */
    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    public ReportsTo withPosition(Position position) {
        this.position = position;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of reporting position (e.g. primary, alternate, etc).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public ReportsTo.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of reporting position (e.g. primary, alternate, etc).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(ReportsTo.Type type) {
        this.type = type;
    }

    public ReportsTo withType(ReportsTo.Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReportsTo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReportsTo) == false) {
            return false;
        }
        ReportsTo rhs = ((ReportsTo) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))));
    }


    /**
     * Type
     * <p>
     * The type of reporting position (e.g. primary, alternate, etc).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        PRIMARY("primary"),
        ALTERNATE("alternate");
        private final String value;
        private final static Map<String, ReportsTo.Type> CONSTANTS = new HashMap<String, ReportsTo.Type>();

        static {
            for (ReportsTo.Type c: values()) {
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
        public static ReportsTo.Type fromValue(String value) {
            ReportsTo.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
