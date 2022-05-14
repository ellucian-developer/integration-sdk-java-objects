
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Matching Gift Policies
 * <p>
 * Employer matching of donations details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "foundation",
    "organization",
    "alternateOrganizationName",
    "contactPerson",
    "contactDetails",
    "programSpecifics",
    "eligibility",
    "procedure",
    "distribution",
    "online",
    "employmentRequirements",
    "volunteerism",
    "acknowledgment",
    "subsidiaries",
    "comments",
    "lastUpdatedOn"
})
@Generated("jsonschema2pojo")
public class MatchingGiftPolicies {

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
     * The global identifier of the donations-matching.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the donations-matching.")
    private String id;
    /**
     * Foundation
     * <p>
     * The foundation that the gifts donated will be matched by the company.
     * 
     */
    @JsonProperty("foundation")
    @JsonPropertyDescription("The foundation that the gifts donated will be matched by the company.")
    private Foundation foundation;
    /**
     * Organization
     * <p>
     * An organization that administers and matches the employee and others donations.
     * (Required)
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("An organization that administers and matches the employee and others donations.")
    private String organization;
    /**
     * Alternate Organization Name
     * <p>
     * Alternate organization name that administers the donation matching.
     * 
     */
    @JsonProperty("alternateOrganizationName")
    @JsonPropertyDescription("Alternate organization name that administers the donation matching.")
    private String alternateOrganizationName;
    /**
     * contact Person
     * <p>
     * Name of the person to be contacted with regard to this foundation.11
     * 
     */
    @JsonProperty("contactPerson")
    @JsonPropertyDescription("Name of the person to be contacted with regard to this foundation.11")
    private ContactPerson contactPerson;
    /**
     * Contact Details
     * <p>
     * Contact details of the foundation.
     * 
     */
    @JsonProperty("contactDetails")
    @JsonPropertyDescription("Contact details of the foundation.")
    private ContactDetails contactDetails;
    /**
     * Program Specifics
     * <p>
     * Foundation program specific details
     * 
     */
    @JsonProperty("programSpecifics")
    @JsonPropertyDescription("Foundation program specific details")
    private ProgramSpecifics programSpecifics;
    /**
     * Eligibility
     * <p>
     * Eligibility criteria to match the donations.
     * 
     */
    @JsonProperty("eligibility")
    @JsonPropertyDescription("Eligibility criteria to match the donations.")
    private Eligibility eligibility;
    /**
     * Procedure
     * <p>
     * Procedures that follow the gift matching
     * 
     */
    @JsonProperty("procedure")
    @JsonPropertyDescription("Procedures that follow the gift matching")
    private Procedure procedure;
    /**
     * Distribution
     * <p>
     * Gift distribution details
     * 
     */
    @JsonProperty("distribution")
    @JsonPropertyDescription("Gift distribution details")
    private Distribution distribution;
    /**
     * Online
     * <p>
     * Online Forms details
     * 
     */
    @JsonProperty("online")
    @JsonPropertyDescription("Online Forms details")
    private Online online;
    /**
     * EmploymentRequirements
     * <p>
     * Duration of service required in months of all employees for gift matching.
     * 
     */
    @JsonProperty("employmentRequirements")
    @JsonPropertyDescription("Duration of service required in months of all employees for gift matching.")
    private EmploymentRequirements employmentRequirements;
    /**
     * Volunteerism
     * <p>
     * Details about gift matching for volunteers.
     * 
     */
    @JsonProperty("volunteerism")
    @JsonPropertyDescription("Details about gift matching for volunteers.")
    private Volunteerism volunteerism;
    /**
     * Acknowledgment
     * <p>
     * Kind of documentation required for acknowledgment.
     * 
     */
    @JsonProperty("acknowledgment")
    @JsonPropertyDescription("Kind of documentation required for acknowledgment.")
    private Acknowledgment acknowledgment;
    /**
     * Subsidiaries
     * <p>
     * Subsidiary companies
     * 
     */
    @JsonProperty("subsidiaries")
    @JsonPropertyDescription("Subsidiary companies")
    private List<Subsidiary> subsidiaries = new ArrayList<Subsidiary>();
    /**
     * Comments
     * <p>
     * Comments related to matching gifts.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("Comments related to matching gifts.")
    private List<String> comments = new ArrayList<String>();
    /**
     * Last Updated On
     * <p>
     * The date and time when the entity instance was last updated.
     * 
     */
    @JsonProperty("lastUpdatedOn")
    @JsonPropertyDescription("The date and time when the entity instance was last updated.")
    private Object lastUpdatedOn;

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

    public MatchingGiftPolicies withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the donations-matching.
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
     * The global identifier of the donations-matching.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MatchingGiftPolicies withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Foundation
     * <p>
     * The foundation that the gifts donated will be matched by the company.
     * 
     */
    @JsonProperty("foundation")
    public Foundation getFoundation() {
        return foundation;
    }

    /**
     * Foundation
     * <p>
     * The foundation that the gifts donated will be matched by the company.
     * 
     */
    @JsonProperty("foundation")
    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public MatchingGiftPolicies withFoundation(Foundation foundation) {
        this.foundation = foundation;
        return this;
    }

    /**
     * Organization
     * <p>
     * An organization that administers and matches the employee and others donations.
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    /**
     * Organization
     * <p>
     * An organization that administers and matches the employee and others donations.
     * (Required)
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public MatchingGiftPolicies withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Alternate Organization Name
     * <p>
     * Alternate organization name that administers the donation matching.
     * 
     */
    @JsonProperty("alternateOrganizationName")
    public String getAlternateOrganizationName() {
        return alternateOrganizationName;
    }

    /**
     * Alternate Organization Name
     * <p>
     * Alternate organization name that administers the donation matching.
     * 
     */
    @JsonProperty("alternateOrganizationName")
    public void setAlternateOrganizationName(String alternateOrganizationName) {
        this.alternateOrganizationName = alternateOrganizationName;
    }

    public MatchingGiftPolicies withAlternateOrganizationName(String alternateOrganizationName) {
        this.alternateOrganizationName = alternateOrganizationName;
        return this;
    }

    /**
     * contact Person
     * <p>
     * Name of the person to be contacted with regard to this foundation.11
     * 
     */
    @JsonProperty("contactPerson")
    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    /**
     * contact Person
     * <p>
     * Name of the person to be contacted with regard to this foundation.11
     * 
     */
    @JsonProperty("contactPerson")
    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public MatchingGiftPolicies withContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }

    /**
     * Contact Details
     * <p>
     * Contact details of the foundation.
     * 
     */
    @JsonProperty("contactDetails")
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Contact Details
     * <p>
     * Contact details of the foundation.
     * 
     */
    @JsonProperty("contactDetails")
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public MatchingGiftPolicies withContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Program Specifics
     * <p>
     * Foundation program specific details
     * 
     */
    @JsonProperty("programSpecifics")
    public ProgramSpecifics getProgramSpecifics() {
        return programSpecifics;
    }

    /**
     * Program Specifics
     * <p>
     * Foundation program specific details
     * 
     */
    @JsonProperty("programSpecifics")
    public void setProgramSpecifics(ProgramSpecifics programSpecifics) {
        this.programSpecifics = programSpecifics;
    }

    public MatchingGiftPolicies withProgramSpecifics(ProgramSpecifics programSpecifics) {
        this.programSpecifics = programSpecifics;
        return this;
    }

    /**
     * Eligibility
     * <p>
     * Eligibility criteria to match the donations.
     * 
     */
    @JsonProperty("eligibility")
    public Eligibility getEligibility() {
        return eligibility;
    }

    /**
     * Eligibility
     * <p>
     * Eligibility criteria to match the donations.
     * 
     */
    @JsonProperty("eligibility")
    public void setEligibility(Eligibility eligibility) {
        this.eligibility = eligibility;
    }

    public MatchingGiftPolicies withEligibility(Eligibility eligibility) {
        this.eligibility = eligibility;
        return this;
    }

    /**
     * Procedure
     * <p>
     * Procedures that follow the gift matching
     * 
     */
    @JsonProperty("procedure")
    public Procedure getProcedure() {
        return procedure;
    }

    /**
     * Procedure
     * <p>
     * Procedures that follow the gift matching
     * 
     */
    @JsonProperty("procedure")
    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    public MatchingGiftPolicies withProcedure(Procedure procedure) {
        this.procedure = procedure;
        return this;
    }

    /**
     * Distribution
     * <p>
     * Gift distribution details
     * 
     */
    @JsonProperty("distribution")
    public Distribution getDistribution() {
        return distribution;
    }

    /**
     * Distribution
     * <p>
     * Gift distribution details
     * 
     */
    @JsonProperty("distribution")
    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    public MatchingGiftPolicies withDistribution(Distribution distribution) {
        this.distribution = distribution;
        return this;
    }

    /**
     * Online
     * <p>
     * Online Forms details
     * 
     */
    @JsonProperty("online")
    public Online getOnline() {
        return online;
    }

    /**
     * Online
     * <p>
     * Online Forms details
     * 
     */
    @JsonProperty("online")
    public void setOnline(Online online) {
        this.online = online;
    }

    public MatchingGiftPolicies withOnline(Online online) {
        this.online = online;
        return this;
    }

    /**
     * EmploymentRequirements
     * <p>
     * Duration of service required in months of all employees for gift matching.
     * 
     */
    @JsonProperty("employmentRequirements")
    public EmploymentRequirements getEmploymentRequirements() {
        return employmentRequirements;
    }

    /**
     * EmploymentRequirements
     * <p>
     * Duration of service required in months of all employees for gift matching.
     * 
     */
    @JsonProperty("employmentRequirements")
    public void setEmploymentRequirements(EmploymentRequirements employmentRequirements) {
        this.employmentRequirements = employmentRequirements;
    }

    public MatchingGiftPolicies withEmploymentRequirements(EmploymentRequirements employmentRequirements) {
        this.employmentRequirements = employmentRequirements;
        return this;
    }

    /**
     * Volunteerism
     * <p>
     * Details about gift matching for volunteers.
     * 
     */
    @JsonProperty("volunteerism")
    public Volunteerism getVolunteerism() {
        return volunteerism;
    }

    /**
     * Volunteerism
     * <p>
     * Details about gift matching for volunteers.
     * 
     */
    @JsonProperty("volunteerism")
    public void setVolunteerism(Volunteerism volunteerism) {
        this.volunteerism = volunteerism;
    }

    public MatchingGiftPolicies withVolunteerism(Volunteerism volunteerism) {
        this.volunteerism = volunteerism;
        return this;
    }

    /**
     * Acknowledgment
     * <p>
     * Kind of documentation required for acknowledgment.
     * 
     */
    @JsonProperty("acknowledgment")
    public Acknowledgment getAcknowledgment() {
        return acknowledgment;
    }

    /**
     * Acknowledgment
     * <p>
     * Kind of documentation required for acknowledgment.
     * 
     */
    @JsonProperty("acknowledgment")
    public void setAcknowledgment(Acknowledgment acknowledgment) {
        this.acknowledgment = acknowledgment;
    }

    public MatchingGiftPolicies withAcknowledgment(Acknowledgment acknowledgment) {
        this.acknowledgment = acknowledgment;
        return this;
    }

    /**
     * Subsidiaries
     * <p>
     * Subsidiary companies
     * 
     */
    @JsonProperty("subsidiaries")
    public List<Subsidiary> getSubsidiaries() {
        return subsidiaries;
    }

    /**
     * Subsidiaries
     * <p>
     * Subsidiary companies
     * 
     */
    @JsonProperty("subsidiaries")
    public void setSubsidiaries(List<Subsidiary> subsidiaries) {
        this.subsidiaries = subsidiaries;
    }

    public MatchingGiftPolicies withSubsidiaries(List<Subsidiary> subsidiaries) {
        this.subsidiaries = subsidiaries;
        return this;
    }

    /**
     * Comments
     * <p>
     * Comments related to matching gifts.
     * 
     */
    @JsonProperty("comments")
    public List<String> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * Comments related to matching gifts.
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public MatchingGiftPolicies withComments(List<String> comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Last Updated On
     * <p>
     * The date and time when the entity instance was last updated.
     * 
     */
    @JsonProperty("lastUpdatedOn")
    public Object getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    /**
     * Last Updated On
     * <p>
     * The date and time when the entity instance was last updated.
     * 
     */
    @JsonProperty("lastUpdatedOn")
    public void setLastUpdatedOn(Object lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public MatchingGiftPolicies withLastUpdatedOn(Object lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MatchingGiftPolicies.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("foundation");
        sb.append('=');
        sb.append(((this.foundation == null)?"<null>":this.foundation));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("alternateOrganizationName");
        sb.append('=');
        sb.append(((this.alternateOrganizationName == null)?"<null>":this.alternateOrganizationName));
        sb.append(',');
        sb.append("contactPerson");
        sb.append('=');
        sb.append(((this.contactPerson == null)?"<null>":this.contactPerson));
        sb.append(',');
        sb.append("contactDetails");
        sb.append('=');
        sb.append(((this.contactDetails == null)?"<null>":this.contactDetails));
        sb.append(',');
        sb.append("programSpecifics");
        sb.append('=');
        sb.append(((this.programSpecifics == null)?"<null>":this.programSpecifics));
        sb.append(',');
        sb.append("eligibility");
        sb.append('=');
        sb.append(((this.eligibility == null)?"<null>":this.eligibility));
        sb.append(',');
        sb.append("procedure");
        sb.append('=');
        sb.append(((this.procedure == null)?"<null>":this.procedure));
        sb.append(',');
        sb.append("distribution");
        sb.append('=');
        sb.append(((this.distribution == null)?"<null>":this.distribution));
        sb.append(',');
        sb.append("online");
        sb.append('=');
        sb.append(((this.online == null)?"<null>":this.online));
        sb.append(',');
        sb.append("employmentRequirements");
        sb.append('=');
        sb.append(((this.employmentRequirements == null)?"<null>":this.employmentRequirements));
        sb.append(',');
        sb.append("volunteerism");
        sb.append('=');
        sb.append(((this.volunteerism == null)?"<null>":this.volunteerism));
        sb.append(',');
        sb.append("acknowledgment");
        sb.append('=');
        sb.append(((this.acknowledgment == null)?"<null>":this.acknowledgment));
        sb.append(',');
        sb.append("subsidiaries");
        sb.append('=');
        sb.append(((this.subsidiaries == null)?"<null>":this.subsidiaries));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("lastUpdatedOn");
        sb.append('=');
        sb.append(((this.lastUpdatedOn == null)?"<null>":this.lastUpdatedOn));
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
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.contactPerson == null)? 0 :this.contactPerson.hashCode()));
        result = ((result* 31)+((this.eligibility == null)? 0 :this.eligibility.hashCode()));
        result = ((result* 31)+((this.foundation == null)? 0 :this.foundation.hashCode()));
        result = ((result* 31)+((this.procedure == null)? 0 :this.procedure.hashCode()));
        result = ((result* 31)+((this.distribution == null)? 0 :this.distribution.hashCode()));
        result = ((result* 31)+((this.contactDetails == null)? 0 :this.contactDetails.hashCode()));
        result = ((result* 31)+((this.employmentRequirements == null)? 0 :this.employmentRequirements.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.online == null)? 0 :this.online.hashCode()));
        result = ((result* 31)+((this.volunteerism == null)? 0 :this.volunteerism.hashCode()));
        result = ((result* 31)+((this.lastUpdatedOn == null)? 0 :this.lastUpdatedOn.hashCode()));
        result = ((result* 31)+((this.subsidiaries == null)? 0 :this.subsidiaries.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.programSpecifics == null)? 0 :this.programSpecifics.hashCode()));
        result = ((result* 31)+((this.alternateOrganizationName == null)? 0 :this.alternateOrganizationName.hashCode()));
        result = ((result* 31)+((this.acknowledgment == null)? 0 :this.acknowledgment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MatchingGiftPolicies) == false) {
            return false;
        }
        MatchingGiftPolicies rhs = ((MatchingGiftPolicies) other);
        return (((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.contactPerson == rhs.contactPerson)||((this.contactPerson!= null)&&this.contactPerson.equals(rhs.contactPerson))))&&((this.eligibility == rhs.eligibility)||((this.eligibility!= null)&&this.eligibility.equals(rhs.eligibility))))&&((this.foundation == rhs.foundation)||((this.foundation!= null)&&this.foundation.equals(rhs.foundation))))&&((this.procedure == rhs.procedure)||((this.procedure!= null)&&this.procedure.equals(rhs.procedure))))&&((this.distribution == rhs.distribution)||((this.distribution!= null)&&this.distribution.equals(rhs.distribution))))&&((this.contactDetails == rhs.contactDetails)||((this.contactDetails!= null)&&this.contactDetails.equals(rhs.contactDetails))))&&((this.employmentRequirements == rhs.employmentRequirements)||((this.employmentRequirements!= null)&&this.employmentRequirements.equals(rhs.employmentRequirements))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.online == rhs.online)||((this.online!= null)&&this.online.equals(rhs.online))))&&((this.volunteerism == rhs.volunteerism)||((this.volunteerism!= null)&&this.volunteerism.equals(rhs.volunteerism))))&&((this.lastUpdatedOn == rhs.lastUpdatedOn)||((this.lastUpdatedOn!= null)&&this.lastUpdatedOn.equals(rhs.lastUpdatedOn))))&&((this.subsidiaries == rhs.subsidiaries)||((this.subsidiaries!= null)&&this.subsidiaries.equals(rhs.subsidiaries))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.programSpecifics == rhs.programSpecifics)||((this.programSpecifics!= null)&&this.programSpecifics.equals(rhs.programSpecifics))))&&((this.alternateOrganizationName == rhs.alternateOrganizationName)||((this.alternateOrganizationName!= null)&&this.alternateOrganizationName.equals(rhs.alternateOrganizationName))))&&((this.acknowledgment == rhs.acknowledgment)||((this.acknowledgment!= null)&&this.acknowledgment.equals(rhs.acknowledgment))));
    }

}
