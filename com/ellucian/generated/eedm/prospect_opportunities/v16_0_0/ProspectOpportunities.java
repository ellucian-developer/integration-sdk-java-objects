
package com.ellucian.generated.eedm.prospect_opportunities.v16_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Prospect Opportunities
 * <p>
 * The opportunities for a prospective student at an institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "prospect",
    "recruitAcademicPrograms",
    "entryAcademicPeriod",
    "admissionPopulation",
    "site",
    "opportunitySource",
    "educationalGoal",
    "careerGoals"
})
@Generated("jsonschema2pojo")
public class ProspectOpportunities {

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
     * The global identifier of the prospect opportunity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the prospect opportunity.")
    private String id;
    /**
     * Prospect
     * <p>
     * The person who is interested in attending the institution.
     * (Required)
     * 
     */
    @JsonProperty("prospect")
    @JsonPropertyDescription("The person who is interested in attending the institution.")
    private Prospect prospect;
    /**
     * Recruit Academic Programs
     * <p>
     * The person who is interested in attending the institution and the academic program(s) they are considering at the institution.
     * (Required)
     * 
     */
    @JsonProperty("recruitAcademicPrograms")
    @JsonPropertyDescription("The person who is interested in attending the institution and the academic program(s) they are considering at the institution.")
    private List<RecruitAcademicProgram> recruitAcademicPrograms = new ArrayList<RecruitAcademicProgram>();
    /**
     * Entry Academic Period
     * <p>
     * The academic period the prospect is interested in beginning attendance at the institution.
     * 
     */
    @JsonProperty("entryAcademicPeriod")
    @JsonPropertyDescription("The academic period the prospect is interested in beginning attendance at the institution.")
    private Object entryAcademicPeriod;
    /**
     * Admission Population
     * <p>
     * The admission population the prospect would be included within at the institution if they attend the institution.
     * 
     */
    @JsonProperty("admissionPopulation")
    @JsonPropertyDescription("The admission population the prospect would be included within at the institution if they attend the institution.")
    private Object admissionPopulation;
    /**
     * Site
     * <p>
     * The institution site (campus) the prospect is considering.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The institution site (campus) the prospect is considering.")
    private Object site;
    /**
     * Opportunity Source
     * <p>
     * The source associated with the prospect opportunity.
     * 
     */
    @JsonProperty("opportunitySource")
    @JsonPropertyDescription("The source associated with the prospect opportunity.")
    private Object opportunitySource;
    /**
     * Educational Goal
     * <p>
     * The educational goal associated with the prospect opportunity.
     * 
     */
    @JsonProperty("educationalGoal")
    @JsonPropertyDescription("The educational goal associated with the prospect opportunity.")
    private Object educationalGoal;
    /**
     * Career Goals
     * <p>
     * The career goals associated with the prospect opportunity.
     * 
     */
    @JsonProperty("careerGoals")
    @JsonPropertyDescription("The career goals associated with the prospect opportunity.")
    private List<CareerGoal> careerGoals = new ArrayList<CareerGoal>();

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

    public ProspectOpportunities withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the prospect opportunity.
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
     * The global identifier of the prospect opportunity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ProspectOpportunities withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Prospect
     * <p>
     * The person who is interested in attending the institution.
     * (Required)
     * 
     */
    @JsonProperty("prospect")
    public Prospect getProspect() {
        return prospect;
    }

    /**
     * Prospect
     * <p>
     * The person who is interested in attending the institution.
     * (Required)
     * 
     */
    @JsonProperty("prospect")
    public void setProspect(Prospect prospect) {
        this.prospect = prospect;
    }

    public ProspectOpportunities withProspect(Prospect prospect) {
        this.prospect = prospect;
        return this;
    }

    /**
     * Recruit Academic Programs
     * <p>
     * The person who is interested in attending the institution and the academic program(s) they are considering at the institution.
     * (Required)
     * 
     */
    @JsonProperty("recruitAcademicPrograms")
    public List<RecruitAcademicProgram> getRecruitAcademicPrograms() {
        return recruitAcademicPrograms;
    }

    /**
     * Recruit Academic Programs
     * <p>
     * The person who is interested in attending the institution and the academic program(s) they are considering at the institution.
     * (Required)
     * 
     */
    @JsonProperty("recruitAcademicPrograms")
    public void setRecruitAcademicPrograms(List<RecruitAcademicProgram> recruitAcademicPrograms) {
        this.recruitAcademicPrograms = recruitAcademicPrograms;
    }

    public ProspectOpportunities withRecruitAcademicPrograms(List<RecruitAcademicProgram> recruitAcademicPrograms) {
        this.recruitAcademicPrograms = recruitAcademicPrograms;
        return this;
    }

    /**
     * Entry Academic Period
     * <p>
     * The academic period the prospect is interested in beginning attendance at the institution.
     * 
     */
    @JsonProperty("entryAcademicPeriod")
    public Object getEntryAcademicPeriod() {
        return entryAcademicPeriod;
    }

    /**
     * Entry Academic Period
     * <p>
     * The academic period the prospect is interested in beginning attendance at the institution.
     * 
     */
    @JsonProperty("entryAcademicPeriod")
    public void setEntryAcademicPeriod(Object entryAcademicPeriod) {
        this.entryAcademicPeriod = entryAcademicPeriod;
    }

    public ProspectOpportunities withEntryAcademicPeriod(Object entryAcademicPeriod) {
        this.entryAcademicPeriod = entryAcademicPeriod;
        return this;
    }

    /**
     * Admission Population
     * <p>
     * The admission population the prospect would be included within at the institution if they attend the institution.
     * 
     */
    @JsonProperty("admissionPopulation")
    public Object getAdmissionPopulation() {
        return admissionPopulation;
    }

    /**
     * Admission Population
     * <p>
     * The admission population the prospect would be included within at the institution if they attend the institution.
     * 
     */
    @JsonProperty("admissionPopulation")
    public void setAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
    }

    public ProspectOpportunities withAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
        return this;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) the prospect is considering.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) the prospect is considering.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public ProspectOpportunities withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Opportunity Source
     * <p>
     * The source associated with the prospect opportunity.
     * 
     */
    @JsonProperty("opportunitySource")
    public Object getOpportunitySource() {
        return opportunitySource;
    }

    /**
     * Opportunity Source
     * <p>
     * The source associated with the prospect opportunity.
     * 
     */
    @JsonProperty("opportunitySource")
    public void setOpportunitySource(Object opportunitySource) {
        this.opportunitySource = opportunitySource;
    }

    public ProspectOpportunities withOpportunitySource(Object opportunitySource) {
        this.opportunitySource = opportunitySource;
        return this;
    }

    /**
     * Educational Goal
     * <p>
     * The educational goal associated with the prospect opportunity.
     * 
     */
    @JsonProperty("educationalGoal")
    public Object getEducationalGoal() {
        return educationalGoal;
    }

    /**
     * Educational Goal
     * <p>
     * The educational goal associated with the prospect opportunity.
     * 
     */
    @JsonProperty("educationalGoal")
    public void setEducationalGoal(Object educationalGoal) {
        this.educationalGoal = educationalGoal;
    }

    public ProspectOpportunities withEducationalGoal(Object educationalGoal) {
        this.educationalGoal = educationalGoal;
        return this;
    }

    /**
     * Career Goals
     * <p>
     * The career goals associated with the prospect opportunity.
     * 
     */
    @JsonProperty("careerGoals")
    public List<CareerGoal> getCareerGoals() {
        return careerGoals;
    }

    /**
     * Career Goals
     * <p>
     * The career goals associated with the prospect opportunity.
     * 
     */
    @JsonProperty("careerGoals")
    public void setCareerGoals(List<CareerGoal> careerGoals) {
        this.careerGoals = careerGoals;
    }

    public ProspectOpportunities withCareerGoals(List<CareerGoal> careerGoals) {
        this.careerGoals = careerGoals;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProspectOpportunities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("prospect");
        sb.append('=');
        sb.append(((this.prospect == null)?"<null>":this.prospect));
        sb.append(',');
        sb.append("recruitAcademicPrograms");
        sb.append('=');
        sb.append(((this.recruitAcademicPrograms == null)?"<null>":this.recruitAcademicPrograms));
        sb.append(',');
        sb.append("entryAcademicPeriod");
        sb.append('=');
        sb.append(((this.entryAcademicPeriod == null)?"<null>":this.entryAcademicPeriod));
        sb.append(',');
        sb.append("admissionPopulation");
        sb.append('=');
        sb.append(((this.admissionPopulation == null)?"<null>":this.admissionPopulation));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("opportunitySource");
        sb.append('=');
        sb.append(((this.opportunitySource == null)?"<null>":this.opportunitySource));
        sb.append(',');
        sb.append("educationalGoal");
        sb.append('=');
        sb.append(((this.educationalGoal == null)?"<null>":this.educationalGoal));
        sb.append(',');
        sb.append("careerGoals");
        sb.append('=');
        sb.append(((this.careerGoals == null)?"<null>":this.careerGoals));
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
        result = ((result* 31)+((this.prospect == null)? 0 :this.prospect.hashCode()));
        result = ((result* 31)+((this.opportunitySource == null)? 0 :this.opportunitySource.hashCode()));
        result = ((result* 31)+((this.recruitAcademicPrograms == null)? 0 :this.recruitAcademicPrograms.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.educationalGoal == null)? 0 :this.educationalGoal.hashCode()));
        result = ((result* 31)+((this.admissionPopulation == null)? 0 :this.admissionPopulation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.careerGoals == null)? 0 :this.careerGoals.hashCode()));
        result = ((result* 31)+((this.entryAcademicPeriod == null)? 0 :this.entryAcademicPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProspectOpportunities) == false) {
            return false;
        }
        ProspectOpportunities rhs = ((ProspectOpportunities) other);
        return (((((((((((this.prospect == rhs.prospect)||((this.prospect!= null)&&this.prospect.equals(rhs.prospect)))&&((this.opportunitySource == rhs.opportunitySource)||((this.opportunitySource!= null)&&this.opportunitySource.equals(rhs.opportunitySource))))&&((this.recruitAcademicPrograms == rhs.recruitAcademicPrograms)||((this.recruitAcademicPrograms!= null)&&this.recruitAcademicPrograms.equals(rhs.recruitAcademicPrograms))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.educationalGoal == rhs.educationalGoal)||((this.educationalGoal!= null)&&this.educationalGoal.equals(rhs.educationalGoal))))&&((this.admissionPopulation == rhs.admissionPopulation)||((this.admissionPopulation!= null)&&this.admissionPopulation.equals(rhs.admissionPopulation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.careerGoals == rhs.careerGoals)||((this.careerGoals!= null)&&this.careerGoals.equals(rhs.careerGoals))))&&((this.entryAcademicPeriod == rhs.entryAcademicPeriod)||((this.entryAcademicPeriod!= null)&&this.entryAcademicPeriod.equals(rhs.entryAcademicPeriod))));
    }

}
