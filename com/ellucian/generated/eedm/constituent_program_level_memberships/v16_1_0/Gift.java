
package com.ellucian.generated.eedm.constituent_program_level_memberships.v16_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Gift
 * <p>
 * Information associated with a gift membership.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grantor",
    "message"
})
@Generated("jsonschema2pojo")
public class Gift {

    /**
     * Grantor
     * <p>
     * The person or organization who gave the membership as a gift.
     * 
     */
    @JsonProperty("grantor")
    @JsonPropertyDescription("The person or organization who gave the membership as a gift.")
    private Object grantor;
    /**
     * Message
     * <p>
     * The message associated with the gift.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("The message associated with the gift.")
    private String message;

    /**
     * Grantor
     * <p>
     * The person or organization who gave the membership as a gift.
     * 
     */
    @JsonProperty("grantor")
    public Object getGrantor() {
        return grantor;
    }

    /**
     * Grantor
     * <p>
     * The person or organization who gave the membership as a gift.
     * 
     */
    @JsonProperty("grantor")
    public void setGrantor(Object grantor) {
        this.grantor = grantor;
    }

    public Gift withGrantor(Object grantor) {
        this.grantor = grantor;
        return this;
    }

    /**
     * Message
     * <p>
     * The message associated with the gift.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * The message associated with the gift.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Gift withMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gift.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grantor");
        sb.append('=');
        sb.append(((this.grantor == null)?"<null>":this.grantor));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.grantor == null)? 0 :this.grantor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gift) == false) {
            return false;
        }
        Gift rhs = ((Gift) other);
        return (((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.grantor == rhs.grantor)||((this.grantor!= null)&&this.grantor.equals(rhs.grantor))));
    }

}
