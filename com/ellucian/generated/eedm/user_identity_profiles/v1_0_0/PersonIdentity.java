
package com.ellucian.generated.eedm.user_identity_profiles.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Identity
 * <p>
 * person details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "personName"
})
@Generated("jsonschema2pojo")
public class PersonIdentity {

    /**
     * Person Name
     * <p>
     * Person name details
     * (Required)
     * 
     */
    @JsonProperty("personName")
    @JsonPropertyDescription("Person name details")
    private PersonName personName;

    /**
     * Person Name
     * <p>
     * Person name details
     * (Required)
     * 
     */
    @JsonProperty("personName")
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Person Name
     * <p>
     * Person name details
     * (Required)
     * 
     */
    @JsonProperty("personName")
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public PersonIdentity withPersonName(PersonName personName) {
        this.personName = personName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonIdentity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("personName");
        sb.append('=');
        sb.append(((this.personName == null)?"<null>":this.personName));
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
        result = ((result* 31)+((this.personName == null)? 0 :this.personName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonIdentity) == false) {
            return false;
        }
        PersonIdentity rhs = ((PersonIdentity) other);
        return ((this.personName == rhs.personName)||((this.personName!= null)&&this.personName.equals(rhs.personName)));
    }

}
