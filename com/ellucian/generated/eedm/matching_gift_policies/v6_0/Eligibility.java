
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Eligibility
 * <p>
 * Eligibility criteria to match the donations.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "participants",
    "educationalInstitutions",
    "athletic",
    "affiliationRequirements",
    "nonProfitOrganizations"
})
@Generated("jsonschema2pojo")
public class Eligibility {

    /**
     * Participants
     * <p>
     * The kind of participants contributions will be matched by the company.
     * 
     */
    @JsonProperty("participants")
    @JsonPropertyDescription("The kind of participants contributions will be matched by the company.")
    private List<Participant> participants = new ArrayList<Participant>();
    /**
     * Educational Institutions
     * <p>
     * The kind of educational institutions contributions will be matched by the company.
     * 
     */
    @JsonProperty("educationalInstitutions")
    @JsonPropertyDescription("The kind of educational institutions contributions will be matched by the company.")
    private List<EducationalInstitution> educationalInstitutions = new ArrayList<EducationalInstitution>();
    /**
     * Athletic
     * <p>
     * Match gifts to athletic programs
     * 
     */
    @JsonProperty("athletic")
    @JsonPropertyDescription("Match gifts to athletic programs")
    private List<Athletic> athletic = new ArrayList<Athletic>();
    /**
     * Affiliation Requirements
     * <p>
     * Employee Affiliation Requirements
     * 
     */
    @JsonProperty("affiliationRequirements")
    @JsonPropertyDescription("Employee Affiliation Requirements")
    private List<AffiliationRequirement> affiliationRequirements = new ArrayList<AffiliationRequirement>();
    /**
     * Non Profit Organizations
     * <p>
     * Nonprofit 501(c)3 Organizations
     * 
     */
    @JsonProperty("nonProfitOrganizations")
    @JsonPropertyDescription("Nonprofit 501(c)3 Organizations")
    private List<NonProfitOrganization> nonProfitOrganizations = new ArrayList<NonProfitOrganization>();

    /**
     * Participants
     * <p>
     * The kind of participants contributions will be matched by the company.
     * 
     */
    @JsonProperty("participants")
    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     * Participants
     * <p>
     * The kind of participants contributions will be matched by the company.
     * 
     */
    @JsonProperty("participants")
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Eligibility withParticipants(List<Participant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Educational Institutions
     * <p>
     * The kind of educational institutions contributions will be matched by the company.
     * 
     */
    @JsonProperty("educationalInstitutions")
    public List<EducationalInstitution> getEducationalInstitutions() {
        return educationalInstitutions;
    }

    /**
     * Educational Institutions
     * <p>
     * The kind of educational institutions contributions will be matched by the company.
     * 
     */
    @JsonProperty("educationalInstitutions")
    public void setEducationalInstitutions(List<EducationalInstitution> educationalInstitutions) {
        this.educationalInstitutions = educationalInstitutions;
    }

    public Eligibility withEducationalInstitutions(List<EducationalInstitution> educationalInstitutions) {
        this.educationalInstitutions = educationalInstitutions;
        return this;
    }

    /**
     * Athletic
     * <p>
     * Match gifts to athletic programs
     * 
     */
    @JsonProperty("athletic")
    public List<Athletic> getAthletic() {
        return athletic;
    }

    /**
     * Athletic
     * <p>
     * Match gifts to athletic programs
     * 
     */
    @JsonProperty("athletic")
    public void setAthletic(List<Athletic> athletic) {
        this.athletic = athletic;
    }

    public Eligibility withAthletic(List<Athletic> athletic) {
        this.athletic = athletic;
        return this;
    }

    /**
     * Affiliation Requirements
     * <p>
     * Employee Affiliation Requirements
     * 
     */
    @JsonProperty("affiliationRequirements")
    public List<AffiliationRequirement> getAffiliationRequirements() {
        return affiliationRequirements;
    }

    /**
     * Affiliation Requirements
     * <p>
     * Employee Affiliation Requirements
     * 
     */
    @JsonProperty("affiliationRequirements")
    public void setAffiliationRequirements(List<AffiliationRequirement> affiliationRequirements) {
        this.affiliationRequirements = affiliationRequirements;
    }

    public Eligibility withAffiliationRequirements(List<AffiliationRequirement> affiliationRequirements) {
        this.affiliationRequirements = affiliationRequirements;
        return this;
    }

    /**
     * Non Profit Organizations
     * <p>
     * Nonprofit 501(c)3 Organizations
     * 
     */
    @JsonProperty("nonProfitOrganizations")
    public List<NonProfitOrganization> getNonProfitOrganizations() {
        return nonProfitOrganizations;
    }

    /**
     * Non Profit Organizations
     * <p>
     * Nonprofit 501(c)3 Organizations
     * 
     */
    @JsonProperty("nonProfitOrganizations")
    public void setNonProfitOrganizations(List<NonProfitOrganization> nonProfitOrganizations) {
        this.nonProfitOrganizations = nonProfitOrganizations;
    }

    public Eligibility withNonProfitOrganizations(List<NonProfitOrganization> nonProfitOrganizations) {
        this.nonProfitOrganizations = nonProfitOrganizations;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Eligibility.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("participants");
        sb.append('=');
        sb.append(((this.participants == null)?"<null>":this.participants));
        sb.append(',');
        sb.append("educationalInstitutions");
        sb.append('=');
        sb.append(((this.educationalInstitutions == null)?"<null>":this.educationalInstitutions));
        sb.append(',');
        sb.append("athletic");
        sb.append('=');
        sb.append(((this.athletic == null)?"<null>":this.athletic));
        sb.append(',');
        sb.append("affiliationRequirements");
        sb.append('=');
        sb.append(((this.affiliationRequirements == null)?"<null>":this.affiliationRequirements));
        sb.append(',');
        sb.append("nonProfitOrganizations");
        sb.append('=');
        sb.append(((this.nonProfitOrganizations == null)?"<null>":this.nonProfitOrganizations));
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
        result = ((result* 31)+((this.educationalInstitutions == null)? 0 :this.educationalInstitutions.hashCode()));
        result = ((result* 31)+((this.nonProfitOrganizations == null)? 0 :this.nonProfitOrganizations.hashCode()));
        result = ((result* 31)+((this.athletic == null)? 0 :this.athletic.hashCode()));
        result = ((result* 31)+((this.affiliationRequirements == null)? 0 :this.affiliationRequirements.hashCode()));
        result = ((result* 31)+((this.participants == null)? 0 :this.participants.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Eligibility) == false) {
            return false;
        }
        Eligibility rhs = ((Eligibility) other);
        return ((((((this.educationalInstitutions == rhs.educationalInstitutions)||((this.educationalInstitutions!= null)&&this.educationalInstitutions.equals(rhs.educationalInstitutions)))&&((this.nonProfitOrganizations == rhs.nonProfitOrganizations)||((this.nonProfitOrganizations!= null)&&this.nonProfitOrganizations.equals(rhs.nonProfitOrganizations))))&&((this.athletic == rhs.athletic)||((this.athletic!= null)&&this.athletic.equals(rhs.athletic))))&&((this.affiliationRequirements == rhs.affiliationRequirements)||((this.affiliationRequirements!= null)&&this.affiliationRequirements.equals(rhs.affiliationRequirements))))&&((this.participants == rhs.participants)||((this.participants!= null)&&this.participants.equals(rhs.participants))));
    }

}
