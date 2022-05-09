
package com.ellucian.generated.eedm.institution_job_supervisors.v10_0;

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
    "supervisor",
    "type"
})
@Generated("jsonschema2pojo")
public class Supervisor {

    /**
     * Supervisor
     * <p>
     * The supervisor for the employee's job.
     * (Required)
     * 
     */
    @JsonProperty("supervisor")
    @JsonPropertyDescription("The supervisor for the employee's job.")
    private Supervisor__1 supervisor;
    /**
     * Type
     * <p>
     * The type of the supervisor for the employee's job (e.g. primary and alternate).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the supervisor for the employee's job (e.g. primary and alternate).")
    private Supervisor.Type type;

    /**
     * Supervisor
     * <p>
     * The supervisor for the employee's job.
     * (Required)
     * 
     */
    @JsonProperty("supervisor")
    public Supervisor__1 getSupervisor() {
        return supervisor;
    }

    /**
     * Supervisor
     * <p>
     * The supervisor for the employee's job.
     * (Required)
     * 
     */
    @JsonProperty("supervisor")
    public void setSupervisor(Supervisor__1 supervisor) {
        this.supervisor = supervisor;
    }

    public Supervisor withSupervisor(Supervisor__1 supervisor) {
        this.supervisor = supervisor;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the supervisor for the employee's job (e.g. primary and alternate).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Supervisor.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the supervisor for the employee's job (e.g. primary and alternate).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Supervisor.Type type) {
        this.type = type;
    }

    public Supervisor withType(Supervisor.Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Supervisor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("supervisor");
        sb.append('=');
        sb.append(((this.supervisor == null)?"<null>":this.supervisor));
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
        result = ((result* 31)+((this.supervisor == null)? 0 :this.supervisor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Supervisor) == false) {
            return false;
        }
        Supervisor rhs = ((Supervisor) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.supervisor == rhs.supervisor)||((this.supervisor!= null)&&this.supervisor.equals(rhs.supervisor))));
    }


    /**
     * Type
     * <p>
     * The type of the supervisor for the employee's job (e.g. primary and alternate).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        PRIMARY("primary"),
        ALTERNATE("alternate");
        private final String value;
        private final static Map<String, Supervisor.Type> CONSTANTS = new HashMap<String, Supervisor.Type>();

        static {
            for (Supervisor.Type c: values()) {
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
        public static Supervisor.Type fromValue(String value) {
            Supervisor.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
