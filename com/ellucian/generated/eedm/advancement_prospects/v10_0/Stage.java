
package com.ellucian.generated.eedm.advancement_prospects.v10_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "enteredOn"
})
@Generated("jsonschema2pojo")
public class Stage {

    /**
     * Name
     * <p>
     * The name of the stage.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the stage.")
    private String name;
    /**
     * Entered On
     * <p>
     * The date when the prospect entered the stage.
     * (Required)
     * 
     */
    @JsonProperty("enteredOn")
    @JsonPropertyDescription("The date when the prospect entered the stage.")
    private Date enteredOn;

    /**
     * Name
     * <p>
     * The name of the stage.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the stage.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Stage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Entered On
     * <p>
     * The date when the prospect entered the stage.
     * (Required)
     * 
     */
    @JsonProperty("enteredOn")
    public Date getEnteredOn() {
        return enteredOn;
    }

    /**
     * Entered On
     * <p>
     * The date when the prospect entered the stage.
     * (Required)
     * 
     */
    @JsonProperty("enteredOn")
    public void setEnteredOn(Date enteredOn) {
        this.enteredOn = enteredOn;
    }

    public Stage withEnteredOn(Date enteredOn) {
        this.enteredOn = enteredOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.enteredOn == null)? 0 :this.enteredOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stage) == false) {
            return false;
        }
        Stage rhs = ((Stage) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.enteredOn == rhs.enteredOn)||((this.enteredOn!= null)&&this.enteredOn.equals(rhs.enteredOn))));
    }

}
