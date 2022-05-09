
package com.ellucian.generated.eedm.constituent_persons.v12_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
     * A user defined list of credential types.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A user defined list of credential types.")
    private Type__4 type;
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
     * Type
     * <p>
     * A user defined list of credential types.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__4 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A user defined list of credential types.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__4 type) {
        this.type = type;
    }

    public Credential withType(Type__4 type) {
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

}
