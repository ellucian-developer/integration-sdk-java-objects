
package com.ellucian.generated.eedm.constituent_persons.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Death
 * <p>
 * Information about the constituent's death.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "diedOn",
    "location"
})
@Generated("jsonschema2pojo")
public class Death {

    /**
     * Date of Death
     * <p>
     * The date when the constituent died.
     * 
     */
    @JsonProperty("diedOn")
    @JsonPropertyDescription("The date when the constituent died.")
    private Object diedOn;
    /**
     * Location
     * <p>
     * The location where the constituent died.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("The location where the constituent died.")
    private String location;

    /**
     * Date of Death
     * <p>
     * The date when the constituent died.
     * 
     */
    @JsonProperty("diedOn")
    public Object getDiedOn() {
        return diedOn;
    }

    /**
     * Date of Death
     * <p>
     * The date when the constituent died.
     * 
     */
    @JsonProperty("diedOn")
    public void setDiedOn(Object diedOn) {
        this.diedOn = diedOn;
    }

    public Death withDiedOn(Object diedOn) {
        this.diedOn = diedOn;
        return this;
    }

    /**
     * Location
     * <p>
     * The location where the constituent died.
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * The location where the constituent died.
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public Death withLocation(String location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Death.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("diedOn");
        sb.append('=');
        sb.append(((this.diedOn == null)?"<null>":this.diedOn));
        sb.append(',');
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
        result = ((result* 31)+((this.diedOn == null)? 0 :this.diedOn.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Death) == false) {
            return false;
        }
        Death rhs = ((Death) other);
        return (((this.diedOn == rhs.diedOn)||((this.diedOn!= null)&&this.diedOn.equals(rhs.diedOn)))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))));
    }

}
