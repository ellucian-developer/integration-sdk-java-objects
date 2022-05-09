
package com.ellucian.generated.eedm.relationship_types.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "detail"
})
@Generated("jsonschema2pojo")
public class ValidReciprocalRelationship {

    /**
     * Detail
     * <p>
     * The extension to the type of the reciprocal relationship.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The extension to the type of the reciprocal relationship.")
    private Object detail;

    /**
     * Detail
     * <p>
     * The extension to the type of the reciprocal relationship.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The extension to the type of the reciprocal relationship.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public ValidReciprocalRelationship withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValidReciprocalRelationship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValidReciprocalRelationship) == false) {
            return false;
        }
        ValidReciprocalRelationship rhs = ((ValidReciprocalRelationship) other);
        return ((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail)));
    }

}
