
package com.ellucian.generated.eedm.advancement_prospects.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Primary Contact
 * <p>
 * The primary contact for the prospect.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "constituent"
})
@Generated("jsonschema2pojo")
public class PrimaryContact {

    /**
     * Constituent
     * <p>
     * The primary constituent (person or organization) associated with the prospect.
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The primary constituent (person or organization) associated with the prospect.")
    private Object constituent;

    /**
     * Constituent
     * <p>
     * The primary constituent (person or organization) associated with the prospect.
     * 
     */
    @JsonProperty("constituent")
    public Object getConstituent() {
        return constituent;
    }

    /**
     * Constituent
     * <p>
     * The primary constituent (person or organization) associated with the prospect.
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public PrimaryContact withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PrimaryContact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
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
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrimaryContact) == false) {
            return false;
        }
        PrimaryContact rhs = ((PrimaryContact) other);
        return ((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent)));
    }

}
