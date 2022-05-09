
package com.ellucian.generated.eedm.rooms.v10_0;

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
    "maxOccupancy"
})
@Generated("jsonschema2pojo")
public class Occupancy {

    /**
     * Room Layout
     * <p>
     * For rooms with multiple layouts, this can be used. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("For rooms with multiple layouts, this can be used. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, \"Default\" can be used.")
    private Occupancy.Type type;
    /**
     * Maximum Occupancy
     * <p>
     * The maximum number of persons who may occupy a room arranged in a given layout.
     * (Required)
     * 
     */
    @JsonProperty("maxOccupancy")
    @JsonPropertyDescription("The maximum number of persons who may occupy a room arranged in a given layout.")
    private Double maxOccupancy;

    /**
     * Room Layout
     * <p>
     * For rooms with multiple layouts, this can be used. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Occupancy.Type getType() {
        return type;
    }

    /**
     * Room Layout
     * <p>
     * For rooms with multiple layouts, this can be used. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Occupancy.Type type) {
        this.type = type;
    }

    public Occupancy withType(Occupancy.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Maximum Occupancy
     * <p>
     * The maximum number of persons who may occupy a room arranged in a given layout.
     * (Required)
     * 
     */
    @JsonProperty("maxOccupancy")
    public Double getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Maximum Occupancy
     * <p>
     * The maximum number of persons who may occupy a room arranged in a given layout.
     * (Required)
     * 
     */
    @JsonProperty("maxOccupancy")
    public void setMaxOccupancy(Double maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public Occupancy withMaxOccupancy(Double maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Occupancy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("maxOccupancy");
        sb.append('=');
        sb.append(((this.maxOccupancy == null)?"<null>":this.maxOccupancy));
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
        result = ((result* 31)+((this.maxOccupancy == null)? 0 :this.maxOccupancy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Occupancy) == false) {
            return false;
        }
        Occupancy rhs = ((Occupancy) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.maxOccupancy == rhs.maxOccupancy)||((this.maxOccupancy!= null)&&this.maxOccupancy.equals(rhs.maxOccupancy))));
    }


    /**
     * Room Layout
     * <p>
     * For rooms with multiple layouts, this can be used. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        BANQUET("banquet"),
        CONFERENCE("conference"),
        SPORTSEVENT("sportsevent"),
        GRADUATIONCEREMONY("graduationceremony"),
        SEMINAR("seminar"),
        BOARDMEETING("boardmeeting"),
        PERFORMANCE("performance"),
        CONVENTION("convention"),
        CONVOCATION("convocation"),
        PRESSMEET("pressmeet"),
        WORKSHOPS("workshops"),
        EXAM("exam"),
        CLASSROOM("classroom"),
        LABORATORY("laboratory"),
        DEFAULT("default");
        private final String value;
        private final static Map<String, Occupancy.Type> CONSTANTS = new HashMap<String, Occupancy.Type>();

        static {
            for (Occupancy.Type c: values()) {
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
        public static Occupancy.Type fromValue(String value) {
            Occupancy.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
