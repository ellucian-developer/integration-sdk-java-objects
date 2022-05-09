
package com.ellucian.generated.eedm.requisitions.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Phone
 * <p>
 * The phone number of the initiator.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "extension"
})
@Generated("jsonschema2pojo")
public class Phone {

    /**
     * Number
     * <p>
     * The number assigned to the phone.
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("The number assigned to the phone.")
    private String number;
    /**
     * Extension
     * <p>
     * The extension used to connect to the phone when multiple phones share the same primary number.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("The extension used to connect to the phone when multiple phones share the same primary number.")
    private String extension;

    /**
     * Number
     * <p>
     * The number assigned to the phone.
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Number
     * <p>
     * The number assigned to the phone.
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Phone withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Extension
     * <p>
     * The extension used to connect to the phone when multiple phones share the same primary number.
     * 
     */
    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    /**
     * Extension
     * <p>
     * The extension used to connect to the phone when multiple phones share the same primary number.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Phone withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Phone.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Phone) == false) {
            return false;
        }
        Phone rhs = ((Phone) other);
        return (((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))));
    }

}
