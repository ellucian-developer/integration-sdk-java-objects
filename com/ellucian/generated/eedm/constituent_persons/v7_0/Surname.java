
package com.ellucian.generated.eedm.constituent_persons.v7_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "surname"
})
@Generated("jsonschema2pojo")
public class Surname {

    /**
     * Type
     * <p>
     * The type of the surname.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the surname.")
    private Type type;
    /**
     * Surname
     * <p>
     * The surname of the constituent.
     * (Required)
     * 
     */
    @JsonProperty("surname")
    @JsonPropertyDescription("The surname of the constituent.")
    private String surname;

    /**
     * Type
     * <p>
     * The type of the surname.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the surname.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public Surname withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Surname
     * <p>
     * The surname of the constituent.
     * (Required)
     * 
     */
    @JsonProperty("surname")
    public String getSurname() {
        return surname;
    }

    /**
     * Surname
     * <p>
     * The surname of the constituent.
     * (Required)
     * 
     */
    @JsonProperty("surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Surname withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Surname.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("surname");
        sb.append('=');
        sb.append(((this.surname == null)?"<null>":this.surname));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.surname == null)? 0 :this.surname.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Surname) == false) {
            return false;
        }
        Surname rhs = ((Surname) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.surname == rhs.surname)||((this.surname!= null)&&this.surname.equals(rhs.surname))));
    }

}
