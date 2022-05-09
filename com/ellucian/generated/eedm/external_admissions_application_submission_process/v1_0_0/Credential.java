
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

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
    "value"
})
@Generated("jsonschema2pojo")
public class Credential {

    /**
     * Type
     * <p>
     * The type of credential
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of credential")
    private Credential.Type type;
    /**
     * Value
     * <p>
     * The credential value
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The credential value")
    private String value;

    /**
     * Type
     * <p>
     * The type of credential
     * 
     */
    @JsonProperty("type")
    public Credential.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of credential
     * 
     */
    @JsonProperty("type")
    public void setType(Credential.Type type) {
        this.type = type;
    }

    public Credential withType(Credential.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Value
     * <p>
     * The credential value
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The credential value
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Credential withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Credential.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Credential) == false) {
            return false;
        }
        Credential rhs = ((Credential) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }


    /**
     * Type
     * <p>
     * The type of credential
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        SSN("ssn"),
        SIN("sin"),
        TIN("tin");
        private final String value;
        private final static Map<String, Credential.Type> CONSTANTS = new HashMap<String, Credential.Type>();

        static {
            for (Credential.Type c: values()) {
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
        public static Credential.Type fromValue(String value) {
            Credential.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
