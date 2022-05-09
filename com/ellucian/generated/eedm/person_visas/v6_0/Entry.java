
package com.ellucian.generated.eedm.person_visas.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enteredOn"
})
@Generated("jsonschema2pojo")
public class Entry {

    /**
     * Entered On
     * <p>
     * The date of entry
     * 
     */
    @JsonProperty("enteredOn")
    @JsonPropertyDescription("The date of entry")
    private Object enteredOn;

    /**
     * Entered On
     * <p>
     * The date of entry
     * 
     */
    @JsonProperty("enteredOn")
    public Object getEnteredOn() {
        return enteredOn;
    }

    /**
     * Entered On
     * <p>
     * The date of entry
     * 
     */
    @JsonProperty("enteredOn")
    public void setEnteredOn(Object enteredOn) {
        this.enteredOn = enteredOn;
    }

    public Entry withEnteredOn(Object enteredOn) {
        this.enteredOn = enteredOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Entry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enteredOn");
        sb.append('=');
        sb.append(((this.enteredOn == null)?"<null>":this.enteredOn));
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
        result = ((result* 31)+((this.enteredOn == null)? 0 :this.enteredOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entry) == false) {
            return false;
        }
        Entry rhs = ((Entry) other);
        return ((this.enteredOn == rhs.enteredOn)||((this.enteredOn!= null)&&this.enteredOn.equals(rhs.enteredOn)));
    }

}
