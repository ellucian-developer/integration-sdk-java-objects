
package com.ellucian.generated.eedm.sections_maximum.v6_0;

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
     * The type of credential, such as "Person ID", "System ID", etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of credential, such as \"Person ID\", \"System ID\", etc.")
    private Credential.Type type;
    /**
     * Credential
     * <p>
     * The credential used in this section.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The credential used in this section.")
    private String value;

    /**
     * Type
     * <p>
     * The type of credential, such as "Person ID", "System ID", etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Credential.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of credential, such as "Person ID", "System ID", etc.
     * (Required)
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
     * Credential
     * <p>
     * The credential used in this section.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Credential
     * <p>
     * The credential used in this section.
     * (Required)
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
     * The type of credential, such as "Person ID", "System ID", etc.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        SSN("ssn"),
        SIN("sin"),
        BANNER_ID("bannerId"),
        COLLEAGUE_PERSON_ID("colleaguePersonId"),
        ELEVATE_ID("elevateID"),
        BANNER_SOURCED_ID("bannerSourcedId"),
        BANNER_USER_NAME("bannerUserName"),
        BANNER_UDC_ID("bannerUdcId");
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
