
package com.ellucian.generated.eedm.sections_maximum.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location"
})
@Generated("jsonschema2pojo")
public class Location {

    /**
     * Location
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("")
    private Object location;

    /**
     * Location
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public Object getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public void setLocation(Object location) {
        this.location = location;
    }

    public Location withLocation(Object location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Location.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return ((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location)));
    }

}
