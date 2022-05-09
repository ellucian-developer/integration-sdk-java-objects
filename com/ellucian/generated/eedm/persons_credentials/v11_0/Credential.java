
package com.ellucian.generated.eedm.persons_credentials.v11_0;

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
    "value",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class Credential {

    /**
     * Type
     * <p>
     * The type of credential, such as "Person ID" or "System ID".
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of credential, such as \"Person ID\" or \"System ID\".")
    private Credential.Type type;
    /**
     * Value
     * <p>
     * The current value of the credential.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The current value of the credential.")
    private String value;
    /**
     * Start Date
     * <p>
     * The date when the credential starts being valid.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the credential starts being valid.")
    private Object startOn;
    /**
     * End Date
     * <p>
     * The date when the credential stops being valid.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the credential stops being valid.")
    private Object endOn;

    /**
     * Type
     * <p>
     * The type of credential, such as "Person ID" or "System ID".
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
     * The type of credential, such as "Person ID" or "System ID".
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
     * Value
     * <p>
     * The current value of the credential.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The current value of the credential.
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

    /**
     * Start Date
     * <p>
     * The date when the credential starts being valid.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date when the credential starts being valid.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Credential withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date when the credential stops being valid.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The date when the credential stops being valid.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Credential withEndOn(Object endOn) {
        this.endOn = endOn;
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
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
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
        return (((((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }


    /**
     * Type
     * <p>
     * The type of credential, such as "Person ID" or "System ID".
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        SSN("ssn"),
        SIN("sin"),
        BANNER_ID("bannerId"),
        COLLEAGUE_PERSON_ID("colleaguePersonId"),
        ELEVATE_ID("elevateId"),
        BANNER_SOURCED_ID("bannerSourcedId"),
        BANNER_USER_NAME("bannerUserName"),
        BANNER_UDC_ID("bannerUdcId"),
        COLLEAGUE_USER_NAME("colleagueUserName");
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
