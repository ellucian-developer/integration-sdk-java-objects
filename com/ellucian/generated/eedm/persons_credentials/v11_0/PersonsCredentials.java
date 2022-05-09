
package com.ellucian.generated.eedm.persons_credentials.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Persons Credentials
 * <p>
 * A subset of person's data, including only their credentials.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "credentials"
})
@Generated("jsonschema2pojo")
public class PersonsCredentials {

    /**
     * ID
     * <p>
     * A global identifier of a person.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a person.")
    private String id;
    /**
     * Credential
     * <p>
     * Information that identifies a user to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("Information that identifies a user to a system such as a network or computer.")
    private List<Credential> credentials = new ArrayList<Credential>();

    /**
     * ID
     * <p>
     * A global identifier of a person.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * A global identifier of a person.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonsCredentials withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Credential
     * <p>
     * Information that identifies a user to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credential
     * <p>
     * Information that identifies a user to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public PersonsCredentials withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonsCredentials.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
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
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonsCredentials) == false) {
            return false;
        }
        PersonsCredentials rhs = ((PersonsCredentials) other);
        return (((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
