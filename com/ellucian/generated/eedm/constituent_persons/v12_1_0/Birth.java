
package com.ellucian.generated.eedm.constituent_persons.v12_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Birth
 * <p>
 * Information about the constituent's birth
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bornOn",
    "location"
})
@Generated("jsonschema2pojo")
public class Birth {

    /**
     * Date of Birth
     * <p>
     * The date when a person was born.
     * 
     */
    @JsonProperty("bornOn")
    @JsonPropertyDescription("The date when a person was born.")
    private Object bornOn;
    /**
     * Location
     * <p>
     * The location where the constituent was born.
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("The location where the constituent was born.")
    private String location;

    /**
     * Date of Birth
     * <p>
     * The date when a person was born.
     * 
     */
    @JsonProperty("bornOn")
    public Object getBornOn() {
        return bornOn;
    }

    /**
     * Date of Birth
     * <p>
     * The date when a person was born.
     * 
     */
    @JsonProperty("bornOn")
    public void setBornOn(Object bornOn) {
        this.bornOn = bornOn;
    }

    public Birth withBornOn(Object bornOn) {
        this.bornOn = bornOn;
        return this;
    }

    /**
     * Location
     * <p>
     * The location where the constituent was born.
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * The location where the constituent was born.
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public Birth withLocation(String location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Birth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bornOn");
        sb.append('=');
        sb.append(((this.bornOn == null)?"<null>":this.bornOn));
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
        result = ((result* 31)+((this.bornOn == null)? 0 :this.bornOn.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Birth) == false) {
            return false;
        }
        Birth rhs = ((Birth) other);
        return (((this.bornOn == rhs.bornOn)||((this.bornOn!= null)&&this.bornOn.equals(rhs.bornOn)))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))));
    }

}
