
package com.ellucian.generated.eedm.person_matching_requests.v1_0_0;

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
    "status",
    "date"
})
@Generated("jsonschema2pojo")
public class Outcome {

    /**
     * Type
     * <p>
     * The type of outcome (initial or final).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of outcome (initial or final).")
    private Outcome.Type type;
    /**
     * Status
     * <p>
     * The outcome status of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The outcome status of the person matching request.")
    private Outcome.Status status;
    /**
     * Date
     * <p>
     * The date and time associated with the status of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("The date and time associated with the status of the person matching request.")
    private Date date;

    /**
     * Type
     * <p>
     * The type of outcome (initial or final).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Outcome.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of outcome (initial or final).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Outcome.Type type) {
        this.type = type;
    }

    public Outcome withType(Outcome.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * The outcome status of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Outcome.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The outcome status of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Outcome.Status status) {
        this.status = status;
    }

    public Outcome withStatus(Outcome.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Date
     * <p>
     * The date and time associated with the status of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * Date
     * <p>
     * The date and time associated with the status of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public Outcome withDate(Date date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Outcome.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Outcome) == false) {
            return false;
        }
        Outcome rhs = ((Outcome) other);
        return ((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The outcome status of the person matching request.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        NEW_PERSON("newPerson"),
        EXISTING_PERSON("existingPerson"),
        REVIEW_REQUIRED("reviewRequired"),
        REJECTED_REQUEST("rejectedRequest");
        private final String value;
        private final static Map<String, Outcome.Status> CONSTANTS = new HashMap<String, Outcome.Status>();

        static {
            for (Outcome.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static Outcome.Status fromValue(String value) {
            Outcome.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Type
     * <p>
     * The type of outcome (initial or final).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        INITIAL("initial"),
        FINAL("final");
        private final String value;
        private final static Map<String, Outcome.Type> CONSTANTS = new HashMap<String, Outcome.Type>();

        static {
            for (Outcome.Type c: values()) {
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
        public static Outcome.Type fromValue(String value) {
            Outcome.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
