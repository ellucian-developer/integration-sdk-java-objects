
package com.ellucian.generated.eedm.person_matching_requests.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Matching Requests
 * <p>
 * Information about new person requests that are processed through duplicate prevention matching rules.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "outcomes",
    "originator"
})
@Generated("jsonschema2pojo")
public class PersonMatchingRequests {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the person matching request.")
    private String id;
    /**
     * Person
     * <p>
     * The new or matched person record.
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The new or matched person record.")
    private Object person;
    /**
     * Outcomes
     * <p>
     * The outcome of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("outcomes")
    @JsonPropertyDescription("The outcome of the person matching request.")
    private List<Outcome> outcomes = new ArrayList<Outcome>();
    /**
     * Originator
     * <p>
     * The originator (user or system) of the person matching request.
     * 
     */
    @JsonProperty("originator")
    @JsonPropertyDescription("The originator (user or system) of the person matching request.")
    private String originator;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public PersonMatchingRequests withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person matching request.
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
     * The global identifier of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonMatchingRequests withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The new or matched person record.
     * 
     */
    @JsonProperty("person")
    public Object getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The new or matched person record.
     * 
     */
    @JsonProperty("person")
    public void setPerson(Object person) {
        this.person = person;
    }

    public PersonMatchingRequests withPerson(Object person) {
        this.person = person;
        return this;
    }

    /**
     * Outcomes
     * <p>
     * The outcome of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("outcomes")
    public List<Outcome> getOutcomes() {
        return outcomes;
    }

    /**
     * Outcomes
     * <p>
     * The outcome of the person matching request.
     * (Required)
     * 
     */
    @JsonProperty("outcomes")
    public void setOutcomes(List<Outcome> outcomes) {
        this.outcomes = outcomes;
    }

    public PersonMatchingRequests withOutcomes(List<Outcome> outcomes) {
        this.outcomes = outcomes;
        return this;
    }

    /**
     * Originator
     * <p>
     * The originator (user or system) of the person matching request.
     * 
     */
    @JsonProperty("originator")
    public String getOriginator() {
        return originator;
    }

    /**
     * Originator
     * <p>
     * The originator (user or system) of the person matching request.
     * 
     */
    @JsonProperty("originator")
    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public PersonMatchingRequests withOriginator(String originator) {
        this.originator = originator;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonMatchingRequests.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("outcomes");
        sb.append('=');
        sb.append(((this.outcomes == null)?"<null>":this.outcomes));
        sb.append(',');
        sb.append("originator");
        sb.append('=');
        sb.append(((this.originator == null)?"<null>":this.originator));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.originator == null)? 0 :this.originator.hashCode()));
        result = ((result* 31)+((this.outcomes == null)? 0 :this.outcomes.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonMatchingRequests) == false) {
            return false;
        }
        PersonMatchingRequests rhs = ((PersonMatchingRequests) other);
        return ((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.originator == rhs.originator)||((this.originator!= null)&&this.originator.equals(rhs.originator))))&&((this.outcomes == rhs.outcomes)||((this.outcomes!= null)&&this.outcomes.equals(rhs.outcomes))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))));
    }

}
