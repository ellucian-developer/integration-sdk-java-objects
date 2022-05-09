
package com.ellucian.generated.eedm.sections.v16_1_0;

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
public class Description {

    /**
     * Type
     * <p>
     * The type of course description (e.g. short description, long description).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of course description (e.g. short description, long description).")
    private Type__1 type;
    /**
     * Value
     * <p>
     * The description for the section associated with the type.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The description for the section associated with the type.")
    private String value;

    /**
     * Type
     * <p>
     * The type of course description (e.g. short description, long description).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__1 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of course description (e.g. short description, long description).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__1 type) {
        this.type = type;
    }

    public Description withType(Type__1 type) {
        this.type = type;
        return this;
    }

    /**
     * Value
     * <p>
     * The description for the section associated with the type.
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
     * The description for the section associated with the type.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Description withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Description.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Description) == false) {
            return false;
        }
        Description rhs = ((Description) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
