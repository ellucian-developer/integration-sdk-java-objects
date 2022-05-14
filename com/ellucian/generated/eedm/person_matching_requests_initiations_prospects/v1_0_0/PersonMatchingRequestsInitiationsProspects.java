
package com.ellucian.generated.eedm.person_matching_requests_initiations_prospects.v1_0_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Matching Requests Initiations Prospects
 * <p>
 * Information that may be used for new prospective student person requests that will be processed by duplicate prevention matching rules.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "names",
    "gender",
    "matchingCriteria"
})
@Generated("jsonschema2pojo")
public class PersonMatchingRequestsInitiationsProspects {

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
     * Names
     * <p>
     * The names associated with a prospect.
     * (Required)
     * 
     */
    @JsonProperty("names")
    @JsonPropertyDescription("The names associated with a prospect.")
    private Names names;
    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the prospect.
     * 
     */
    @JsonProperty("gender")
    @JsonPropertyDescription("The biological masculinity or femininity of the prospect.")
    private Object gender;
    /**
     * Matching Criteria
     * <p>
     * Additional matching criteria - minimum of one is required.
     * (Required)
     * 
     */
    @JsonProperty("matchingCriteria")
    @JsonPropertyDescription("Additional matching criteria - minimum of one is required.")
    private MatchingCriteria matchingCriteria;

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

    public PersonMatchingRequestsInitiationsProspects withMetadata(Metadata metadata) {
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

    public PersonMatchingRequestsInitiationsProspects withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Names
     * <p>
     * The names associated with a prospect.
     * (Required)
     * 
     */
    @JsonProperty("names")
    public Names getNames() {
        return names;
    }

    /**
     * Names
     * <p>
     * The names associated with a prospect.
     * (Required)
     * 
     */
    @JsonProperty("names")
    public void setNames(Names names) {
        this.names = names;
    }

    public PersonMatchingRequestsInitiationsProspects withNames(Names names) {
        this.names = names;
        return this;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the prospect.
     * 
     */
    @JsonProperty("gender")
    public Object getGender() {
        return gender;
    }

    /**
     * Gender
     * <p>
     * The biological masculinity or femininity of the prospect.
     * 
     */
    @JsonProperty("gender")
    public void setGender(Object gender) {
        this.gender = gender;
    }

    public PersonMatchingRequestsInitiationsProspects withGender(Object gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Matching Criteria
     * <p>
     * Additional matching criteria - minimum of one is required.
     * (Required)
     * 
     */
    @JsonProperty("matchingCriteria")
    public MatchingCriteria getMatchingCriteria() {
        return matchingCriteria;
    }

    /**
     * Matching Criteria
     * <p>
     * Additional matching criteria - minimum of one is required.
     * (Required)
     * 
     */
    @JsonProperty("matchingCriteria")
    public void setMatchingCriteria(MatchingCriteria matchingCriteria) {
        this.matchingCriteria = matchingCriteria;
    }

    public PersonMatchingRequestsInitiationsProspects withMatchingCriteria(MatchingCriteria matchingCriteria) {
        this.matchingCriteria = matchingCriteria;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonMatchingRequestsInitiationsProspects.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("matchingCriteria");
        sb.append('=');
        sb.append(((this.matchingCriteria == null)?"<null>":this.matchingCriteria));
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
        result = ((result* 31)+((this.matchingCriteria == null)? 0 :this.matchingCriteria.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.names == null)? 0 :this.names.hashCode()));
        result = ((result* 31)+((this.gender == null)? 0 :this.gender.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonMatchingRequestsInitiationsProspects) == false) {
            return false;
        }
        PersonMatchingRequestsInitiationsProspects rhs = ((PersonMatchingRequestsInitiationsProspects) other);
        return ((((((this.matchingCriteria == rhs.matchingCriteria)||((this.matchingCriteria!= null)&&this.matchingCriteria.equals(rhs.matchingCriteria)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.names == rhs.names)||((this.names!= null)&&this.names.equals(rhs.names))))&&((this.gender == rhs.gender)||((this.gender!= null)&&this.gender.equals(rhs.gender))));
    }

}
