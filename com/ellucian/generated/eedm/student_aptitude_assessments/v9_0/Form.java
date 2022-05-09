
package com.ellucian.generated.eedm.student_aptitude_assessments.v9_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Form
 * <p>
 * The name and number of the form used for the assessment for this result.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "name"
})
@Generated("jsonschema2pojo")
public class Form {

    /**
     * Number
     * <p>
     * The number of the form.
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("The number of the form.")
    private String number;
    /**
     * Name
     * <p>
     * The name of the form.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the form.")
    private String name;

    /**
     * Number
     * <p>
     * The number of the form.
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Number
     * <p>
     * The number of the form.
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Form withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Name
     * <p>
     * The name of the form.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the form.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Form withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Form.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Form) == false) {
            return false;
        }
        Form rhs = ((Form) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))));
    }

}
