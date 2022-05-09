
package com.ellucian.generated.eedm.contributions.v16_0_0;

import java.util.Date;
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
    "occurredOn"
})
@Generated("jsonschema2pojo")
public class ActivityDate {

    /**
     * Type
     * <p>
     * The type of the activity associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the activity associated with the contribution.")
    private ActivityDate.Type type;
    /**
     * Occurred On
     * <p>
     * The date on which the activity associated with the contribution occurred.
     * (Required)
     * 
     */
    @JsonProperty("occurredOn")
    @JsonPropertyDescription("The date on which the activity associated with the contribution occurred.")
    private Date occurredOn;

    /**
     * Type
     * <p>
     * The type of the activity associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public ActivityDate.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the activity associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(ActivityDate.Type type) {
        this.type = type;
    }

    public ActivityDate withType(ActivityDate.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Occurred On
     * <p>
     * The date on which the activity associated with the contribution occurred.
     * (Required)
     * 
     */
    @JsonProperty("occurredOn")
    public Date getOccurredOn() {
        return occurredOn;
    }

    /**
     * Occurred On
     * <p>
     * The date on which the activity associated with the contribution occurred.
     * (Required)
     * 
     */
    @JsonProperty("occurredOn")
    public void setOccurredOn(Date occurredOn) {
        this.occurredOn = occurredOn;
    }

    public ActivityDate withOccurredOn(Date occurredOn) {
        this.occurredOn = occurredOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActivityDate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("occurredOn");
        sb.append('=');
        sb.append(((this.occurredOn == null)?"<null>":this.occurredOn));
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
        result = ((result* 31)+((this.occurredOn == null)? 0 :this.occurredOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActivityDate) == false) {
            return false;
        }
        ActivityDate rhs = ((ActivityDate) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.occurredOn == rhs.occurredOn)||((this.occurredOn!= null)&&this.occurredOn.equals(rhs.occurredOn))));
    }


    /**
     * Type
     * <p>
     * The type of the activity associated with the contribution.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        ENTERED("entered"),
        CONTRIBUTED("contributed"),
        TRANSMITTED_TO_GL("transmittedToGL"),
        RECEIPTED("receipted"),
        CANCELED("canceled"),
        DEPOSITED("deposited"),
        ADJUSTED("adjusted"),
        ACKNOWLEDGED("acknowledged"),
        POSTED("posted");
        private final String value;
        private final static Map<String, ActivityDate.Type> CONSTANTS = new HashMap<String, ActivityDate.Type>();

        static {
            for (ActivityDate.Type c: values()) {
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
        public static ActivityDate.Type fromValue(String value) {
            ActivityDate.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
