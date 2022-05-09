
package com.ellucian.generated.eedm.sections_maximum.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Instructor
 * <p>
 * A person assigned to teach an instruction method of a section.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "names",
    "credentials",
    "detail"
})
@Generated("jsonschema2pojo")
public class Instructor {

    /**
     * Names
     * <p>
     * The names associated with a person, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    @JsonPropertyDescription("The names associated with a person, specified by type (for example, \"legal\" or \"birth\").")
    private List<Name> names = new ArrayList<Name>();
    /**
     * Credential
     * <p>
     * The unique information that identifies a user to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("The unique information that identifies a user to a system such as a network or computer.")
    private List<Credential> credentials = new ArrayList<Credential>();
    /**
     * Instructor
     * <p>
     * The instructor teaching this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The instructor teaching this section.")
    private Detail__7 detail;

    /**
     * Names
     * <p>
     * The names associated with a person, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    public List<Name> getNames() {
        return names;
    }

    /**
     * Names
     * <p>
     * The names associated with a person, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    public void setNames(List<Name> names) {
        this.names = names;
    }

    public Instructor withNames(List<Name> names) {
        this.names = names;
        return this;
    }

    /**
     * Credential
     * <p>
     * The unique information that identifies a user to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credential
     * <p>
     * The unique information that identifies a user to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public Instructor withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Instructor
     * <p>
     * The instructor teaching this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail__7 getDetail() {
        return detail;
    }

    /**
     * Instructor
     * <p>
     * The instructor teaching this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__7 detail) {
        this.detail = detail;
    }

    public Instructor withDetail(Detail__7 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Instructor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.names == null)? 0 :this.names.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Instructor) == false) {
            return false;
        }
        Instructor rhs = ((Instructor) other);
        return ((((this.names == rhs.names)||((this.names!= null)&&this.names.equals(rhs.names)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))));
    }

}
