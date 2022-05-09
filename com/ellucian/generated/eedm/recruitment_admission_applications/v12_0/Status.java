
package com.ellucian.generated.eedm.recruitment_admission_applications.v12_0;

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
    "startOn"
})
@Generated("jsonschema2pojo")
public class Status {

    /**
     * Type
     * <p>
     * The type of application status.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of application status.")
    private Status.Type type;
    /**
     * Start On
     * <p>
     * The status date.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The status date.")
    private String startOn;

    /**
     * Type
     * <p>
     * The type of application status.
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
     * The type of application status.
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
     * Start On
     * <p>
     * The status date.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The status date.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public Status withStartOn(String startOn) {
        this.startOn = startOn;
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
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
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
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
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
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))));
    }


    /**
     * Type
     * <p>
     * The type of application status.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        STARTED("started"),
        SUBMITTED("submitted"),
        READY_FOR_REVIEW("readyForReview"),
        DECISION_MADE("decisionMade"),
        ENROLLMENT_COMPLETE("enrollmentComplete"),
        ADMITTED("admitted"),
        MOVED_TO_STUDENT_SYSTEM("movedToStudentSystem");
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
