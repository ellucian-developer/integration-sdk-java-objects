
package com.ellucian.generated.eedm.constituent_education.v1_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Minors
 * <p>
 * The minor(s) associated with the person's education at the institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id"
})
@Generated("jsonschema2pojo")
public class Minor {

    /**
     * ID
     * <p>
     * The global identifier for the Minors.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier for the Minors.")
    private String id;

    /**
     * ID
     * <p>
     * The global identifier for the Minors.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier for the Minors.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Minor withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Minor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Minor) == false) {
            return false;
        }
        Minor rhs = ((Minor) other);
        return ((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)));
    }

}