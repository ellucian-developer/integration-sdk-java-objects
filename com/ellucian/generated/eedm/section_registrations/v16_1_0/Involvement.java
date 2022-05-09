
package com.ellucian.generated.eedm.section_registrations.v16_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Involvement
 * <p>
 * The range of dates between which a student was involved with a section.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class Involvement {

    /**
     * Start On
     * <p>
     * The date when the section was first attended or accessed online.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the section was first attended or accessed online.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The date when the section was last attended or accessed online.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the section was last attended or accessed online.")
    private Object endOn;

    /**
     * Start On
     * <p>
     * The date when the section was first attended or accessed online.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the section was first attended or accessed online.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Involvement withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date when the section was last attended or accessed online.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when the section was last attended or accessed online.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Involvement withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    @java.lang.Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Involvement.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @java.lang.Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        return result;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Involvement) == false) {
            return false;
        }
        Involvement rhs = ((Involvement) other);
        return (((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn)))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))));
    }

}
