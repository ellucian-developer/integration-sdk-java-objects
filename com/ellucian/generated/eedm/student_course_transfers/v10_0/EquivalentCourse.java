
package com.ellucian.generated.eedm.student_course_transfers.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Equivalent Course
 * <p>
 * The home institution course equivalent to the course at the external institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id"
})
@Generated("jsonschema2pojo")
public class EquivalentCourse {

    /**
     * ID
     * <p>
     * The global identifier for the Equivalent Course.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier for the Equivalent Course.")
    private String id;

    /**
     * ID
     * <p>
     * The global identifier for the Equivalent Course.
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
     * The global identifier for the Equivalent Course.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EquivalentCourse withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EquivalentCourse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof EquivalentCourse) == false) {
            return false;
        }
        EquivalentCourse rhs = ((EquivalentCourse) other);
        return ((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)));
    }

}
