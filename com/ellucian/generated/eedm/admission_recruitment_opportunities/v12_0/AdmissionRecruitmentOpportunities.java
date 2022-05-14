
package com.ellucian.generated.eedm.admission_recruitment_opportunities.v12_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Admission Recruitment Opportunities
 * <p>
 * Prospective student admission recruitment opportunities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "description",
    "prospectiveStudent",
    "academicPeriod",
    "academicLevel",
    "academicProgram",
    "site",
    "sources",
    "territory",
    "recruiter",
    "ratings",
    "admissionPopulation",
    "academicLoad",
    "decisionPlan",
    "campusPlans",
    "opportunityStatus",
    "opportunityStates",
    "processFlowStep"
})
@Generated("jsonschema2pojo")
public class AdmissionRecruitmentOpportunities {

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
     * The global identifier of the admission recruitment opportunity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the admission recruitment opportunity.")
    private String id;
    /**
     * Description
     * <p>
     * The description of the admission recruitment opportunity.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the admission recruitment opportunity.")
    private String description;
    /**
     * Prospective Student
     * <p>
     * The prospective student associated with the recruitment opportunity.
     * (Required)
     * 
     */
    @JsonProperty("prospectiveStudent")
    @JsonPropertyDescription("The prospective student associated with the recruitment opportunity.")
    private ProspectiveStudent prospectiveStudent;
    /**
     * Academic Period
     * <p>
     * The academic period for which the prospect is considered.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period for which the prospect is considered.")
    private AcademicPeriod academicPeriod;
    /**
     * Academic Level
     * <p>
     * The academic level the prospect is considered for recruitment.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level the prospect is considered for recruitment.")
    private Object academicLevel;
    /**
     * Academic Program
     * <p>
     * The academic program for which the prospect is considered.
     * 
     */
    @JsonProperty("academicProgram")
    @JsonPropertyDescription("The academic program for which the prospect is considered.")
    private Object academicProgram;
    /**
     * Site
     * <p>
     * The institution site (campus) the prospective student is considered for recruitment.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The institution site (campus) the prospective student is considered for recruitment.")
    private Object site;
    /**
     * Sources
     * <p>
     * The sources for the opportunity.
     * 
     */
    @JsonProperty("sources")
    @JsonPropertyDescription("The sources for the opportunity.")
    private List<Source> sources = new ArrayList<Source>();
    /**
     * Territory
     * <p>
     * The recruitment territory for the opportunity.
     * 
     */
    @JsonProperty("territory")
    @JsonPropertyDescription("The recruitment territory for the opportunity.")
    private Object territory;
    /**
     * Recruiter
     * <p>
     * The recruiter (an individual or a team) assigned to the opportunity.
     * 
     */
    @JsonProperty("recruiter")
    @JsonPropertyDescription("The recruiter (an individual or a team) assigned to the opportunity.")
    private Object recruiter;
    /**
     * Ratings
     * <p>
     * Ratings for the opportunity.
     * 
     */
    @JsonProperty("ratings")
    @JsonPropertyDescription("Ratings for the opportunity.")
    private List<Rating> ratings = new ArrayList<Rating>();
    /**
     * Admission Population
     * <p>
     * The admission population for the opportunity.
     * 
     */
    @JsonProperty("admissionPopulation")
    @JsonPropertyDescription("The admission population for the opportunity.")
    private Object admissionPopulation;
    /**
     * Academic Load
     * <p>
     * The academic load for the opportunity.
     * 
     */
    @JsonProperty("academicLoad")
    @JsonPropertyDescription("The academic load for the opportunity.")
    private Object academicLoad;
    /**
     * Decision Plan
     * <p>
     * The admission decision plan for the opportunity.
     * 
     */
    @JsonProperty("decisionPlan")
    @JsonPropertyDescription("The admission decision plan for the opportunity.")
    private Object decisionPlan;
    /**
     * Campus Plans
     * <p>
     * The campus plan(s) for the opportunity.
     * 
     */
    @JsonProperty("campusPlans")
    @JsonPropertyDescription("The campus plan(s) for the opportunity.")
    private List<CampusPlan> campusPlans = new ArrayList<CampusPlan>();
    /**
     * Opportunity Status
     * <p>
     * The status of the recruitment opportunity.
     * (Required)
     * 
     */
    @JsonProperty("opportunityStatus")
    @JsonPropertyDescription("The status of the recruitment opportunity.")
    private OpportunityStatus opportunityStatus;
    /**
     * Opportunity States
     * <p>
     * The funnel states the opportunity goes through.
     * 
     */
    @JsonProperty("opportunityStates")
    @JsonPropertyDescription("The funnel states the opportunity goes through.")
    private List<OpportunityState> opportunityStates = new ArrayList<OpportunityState>();
    /**
     * Process Flow Step
     * <p>
     * The current business process flow step for the opportunity.
     * 
     */
    @JsonProperty("processFlowStep")
    @JsonPropertyDescription("The current business process flow step for the opportunity.")
    private Object processFlowStep;

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

    public AdmissionRecruitmentOpportunities withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the admission recruitment opportunity.
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
     * The global identifier of the admission recruitment opportunity.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionRecruitmentOpportunities withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the admission recruitment opportunity.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the admission recruitment opportunity.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdmissionRecruitmentOpportunities withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Prospective Student
     * <p>
     * The prospective student associated with the recruitment opportunity.
     * (Required)
     * 
     */
    @JsonProperty("prospectiveStudent")
    public ProspectiveStudent getProspectiveStudent() {
        return prospectiveStudent;
    }

    /**
     * Prospective Student
     * <p>
     * The prospective student associated with the recruitment opportunity.
     * (Required)
     * 
     */
    @JsonProperty("prospectiveStudent")
    public void setProspectiveStudent(ProspectiveStudent prospectiveStudent) {
        this.prospectiveStudent = prospectiveStudent;
    }

    public AdmissionRecruitmentOpportunities withProspectiveStudent(ProspectiveStudent prospectiveStudent) {
        this.prospectiveStudent = prospectiveStudent;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for which the prospect is considered.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    public AcademicPeriod getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for which the prospect is considered.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public AdmissionRecruitmentOpportunities withAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level the prospect is considered for recruitment.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level the prospect is considered for recruitment.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public AdmissionRecruitmentOpportunities withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Academic Program
     * <p>
     * The academic program for which the prospect is considered.
     * 
     */
    @JsonProperty("academicProgram")
    public Object getAcademicProgram() {
        return academicProgram;
    }

    /**
     * Academic Program
     * <p>
     * The academic program for which the prospect is considered.
     * 
     */
    @JsonProperty("academicProgram")
    public void setAcademicProgram(Object academicProgram) {
        this.academicProgram = academicProgram;
    }

    public AdmissionRecruitmentOpportunities withAcademicProgram(Object academicProgram) {
        this.academicProgram = academicProgram;
        return this;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) the prospective student is considered for recruitment.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) the prospective student is considered for recruitment.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public AdmissionRecruitmentOpportunities withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Sources
     * <p>
     * The sources for the opportunity.
     * 
     */
    @JsonProperty("sources")
    public List<Source> getSources() {
        return sources;
    }

    /**
     * Sources
     * <p>
     * The sources for the opportunity.
     * 
     */
    @JsonProperty("sources")
    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public AdmissionRecruitmentOpportunities withSources(List<Source> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Territory
     * <p>
     * The recruitment territory for the opportunity.
     * 
     */
    @JsonProperty("territory")
    public Object getTerritory() {
        return territory;
    }

    /**
     * Territory
     * <p>
     * The recruitment territory for the opportunity.
     * 
     */
    @JsonProperty("territory")
    public void setTerritory(Object territory) {
        this.territory = territory;
    }

    public AdmissionRecruitmentOpportunities withTerritory(Object territory) {
        this.territory = territory;
        return this;
    }

    /**
     * Recruiter
     * <p>
     * The recruiter (an individual or a team) assigned to the opportunity.
     * 
     */
    @JsonProperty("recruiter")
    public Object getRecruiter() {
        return recruiter;
    }

    /**
     * Recruiter
     * <p>
     * The recruiter (an individual or a team) assigned to the opportunity.
     * 
     */
    @JsonProperty("recruiter")
    public void setRecruiter(Object recruiter) {
        this.recruiter = recruiter;
    }

    public AdmissionRecruitmentOpportunities withRecruiter(Object recruiter) {
        this.recruiter = recruiter;
        return this;
    }

    /**
     * Ratings
     * <p>
     * Ratings for the opportunity.
     * 
     */
    @JsonProperty("ratings")
    public List<Rating> getRatings() {
        return ratings;
    }

    /**
     * Ratings
     * <p>
     * Ratings for the opportunity.
     * 
     */
    @JsonProperty("ratings")
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public AdmissionRecruitmentOpportunities withRatings(List<Rating> ratings) {
        this.ratings = ratings;
        return this;
    }

    /**
     * Admission Population
     * <p>
     * The admission population for the opportunity.
     * 
     */
    @JsonProperty("admissionPopulation")
    public Object getAdmissionPopulation() {
        return admissionPopulation;
    }

    /**
     * Admission Population
     * <p>
     * The admission population for the opportunity.
     * 
     */
    @JsonProperty("admissionPopulation")
    public void setAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
    }

    public AdmissionRecruitmentOpportunities withAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
        return this;
    }

    /**
     * Academic Load
     * <p>
     * The academic load for the opportunity.
     * 
     */
    @JsonProperty("academicLoad")
    public Object getAcademicLoad() {
        return academicLoad;
    }

    /**
     * Academic Load
     * <p>
     * The academic load for the opportunity.
     * 
     */
    @JsonProperty("academicLoad")
    public void setAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
    }

    public AdmissionRecruitmentOpportunities withAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
        return this;
    }

    /**
     * Decision Plan
     * <p>
     * The admission decision plan for the opportunity.
     * 
     */
    @JsonProperty("decisionPlan")
    public Object getDecisionPlan() {
        return decisionPlan;
    }

    /**
     * Decision Plan
     * <p>
     * The admission decision plan for the opportunity.
     * 
     */
    @JsonProperty("decisionPlan")
    public void setDecisionPlan(Object decisionPlan) {
        this.decisionPlan = decisionPlan;
    }

    public AdmissionRecruitmentOpportunities withDecisionPlan(Object decisionPlan) {
        this.decisionPlan = decisionPlan;
        return this;
    }

    /**
     * Campus Plans
     * <p>
     * The campus plan(s) for the opportunity.
     * 
     */
    @JsonProperty("campusPlans")
    public List<CampusPlan> getCampusPlans() {
        return campusPlans;
    }

    /**
     * Campus Plans
     * <p>
     * The campus plan(s) for the opportunity.
     * 
     */
    @JsonProperty("campusPlans")
    public void setCampusPlans(List<CampusPlan> campusPlans) {
        this.campusPlans = campusPlans;
    }

    public AdmissionRecruitmentOpportunities withCampusPlans(List<CampusPlan> campusPlans) {
        this.campusPlans = campusPlans;
        return this;
    }

    /**
     * Opportunity Status
     * <p>
     * The status of the recruitment opportunity.
     * (Required)
     * 
     */
    @JsonProperty("opportunityStatus")
    public OpportunityStatus getOpportunityStatus() {
        return opportunityStatus;
    }

    /**
     * Opportunity Status
     * <p>
     * The status of the recruitment opportunity.
     * (Required)
     * 
     */
    @JsonProperty("opportunityStatus")
    public void setOpportunityStatus(OpportunityStatus opportunityStatus) {
        this.opportunityStatus = opportunityStatus;
    }

    public AdmissionRecruitmentOpportunities withOpportunityStatus(OpportunityStatus opportunityStatus) {
        this.opportunityStatus = opportunityStatus;
        return this;
    }

    /**
     * Opportunity States
     * <p>
     * The funnel states the opportunity goes through.
     * 
     */
    @JsonProperty("opportunityStates")
    public List<OpportunityState> getOpportunityStates() {
        return opportunityStates;
    }

    /**
     * Opportunity States
     * <p>
     * The funnel states the opportunity goes through.
     * 
     */
    @JsonProperty("opportunityStates")
    public void setOpportunityStates(List<OpportunityState> opportunityStates) {
        this.opportunityStates = opportunityStates;
    }

    public AdmissionRecruitmentOpportunities withOpportunityStates(List<OpportunityState> opportunityStates) {
        this.opportunityStates = opportunityStates;
        return this;
    }

    /**
     * Process Flow Step
     * <p>
     * The current business process flow step for the opportunity.
     * 
     */
    @JsonProperty("processFlowStep")
    public Object getProcessFlowStep() {
        return processFlowStep;
    }

    /**
     * Process Flow Step
     * <p>
     * The current business process flow step for the opportunity.
     * 
     */
    @JsonProperty("processFlowStep")
    public void setProcessFlowStep(Object processFlowStep) {
        this.processFlowStep = processFlowStep;
    }

    public AdmissionRecruitmentOpportunities withProcessFlowStep(Object processFlowStep) {
        this.processFlowStep = processFlowStep;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionRecruitmentOpportunities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("prospectiveStudent");
        sb.append('=');
        sb.append(((this.prospectiveStudent == null)?"<null>":this.prospectiveStudent));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("academicProgram");
        sb.append('=');
        sb.append(((this.academicProgram == null)?"<null>":this.academicProgram));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("sources");
        sb.append('=');
        sb.append(((this.sources == null)?"<null>":this.sources));
        sb.append(',');
        sb.append("territory");
        sb.append('=');
        sb.append(((this.territory == null)?"<null>":this.territory));
        sb.append(',');
        sb.append("recruiter");
        sb.append('=');
        sb.append(((this.recruiter == null)?"<null>":this.recruiter));
        sb.append(',');
        sb.append("ratings");
        sb.append('=');
        sb.append(((this.ratings == null)?"<null>":this.ratings));
        sb.append(',');
        sb.append("admissionPopulation");
        sb.append('=');
        sb.append(((this.admissionPopulation == null)?"<null>":this.admissionPopulation));
        sb.append(',');
        sb.append("academicLoad");
        sb.append('=');
        sb.append(((this.academicLoad == null)?"<null>":this.academicLoad));
        sb.append(',');
        sb.append("decisionPlan");
        sb.append('=');
        sb.append(((this.decisionPlan == null)?"<null>":this.decisionPlan));
        sb.append(',');
        sb.append("campusPlans");
        sb.append('=');
        sb.append(((this.campusPlans == null)?"<null>":this.campusPlans));
        sb.append(',');
        sb.append("opportunityStatus");
        sb.append('=');
        sb.append(((this.opportunityStatus == null)?"<null>":this.opportunityStatus));
        sb.append(',');
        sb.append("opportunityStates");
        sb.append('=');
        sb.append(((this.opportunityStates == null)?"<null>":this.opportunityStates));
        sb.append(',');
        sb.append("processFlowStep");
        sb.append('=');
        sb.append(((this.processFlowStep == null)?"<null>":this.processFlowStep));
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
        result = ((result* 31)+((this.prospectiveStudent == null)? 0 :this.prospectiveStudent.hashCode()));
        result = ((result* 31)+((this.academicProgram == null)? 0 :this.academicProgram.hashCode()));
        result = ((result* 31)+((this.sources == null)? 0 :this.sources.hashCode()));
        result = ((result* 31)+((this.processFlowStep == null)? 0 :this.processFlowStep.hashCode()));
        result = ((result* 31)+((this.recruiter == null)? 0 :this.recruiter.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.opportunityStatus == null)? 0 :this.opportunityStatus.hashCode()));
        result = ((result* 31)+((this.decisionPlan == null)? 0 :this.decisionPlan.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.admissionPopulation == null)? 0 :this.admissionPopulation.hashCode()));
        result = ((result* 31)+((this.ratings == null)? 0 :this.ratings.hashCode()));
        result = ((result* 31)+((this.campusPlans == null)? 0 :this.campusPlans.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.opportunityStates == null)? 0 :this.opportunityStates.hashCode()));
        result = ((result* 31)+((this.territory == null)? 0 :this.territory.hashCode()));
        result = ((result* 31)+((this.academicLoad == null)? 0 :this.academicLoad.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionRecruitmentOpportunities) == false) {
            return false;
        }
        AdmissionRecruitmentOpportunities rhs = ((AdmissionRecruitmentOpportunities) other);
        return ((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.prospectiveStudent == rhs.prospectiveStudent)||((this.prospectiveStudent!= null)&&this.prospectiveStudent.equals(rhs.prospectiveStudent))))&&((this.academicProgram == rhs.academicProgram)||((this.academicProgram!= null)&&this.academicProgram.equals(rhs.academicProgram))))&&((this.sources == rhs.sources)||((this.sources!= null)&&this.sources.equals(rhs.sources))))&&((this.processFlowStep == rhs.processFlowStep)||((this.processFlowStep!= null)&&this.processFlowStep.equals(rhs.processFlowStep))))&&((this.recruiter == rhs.recruiter)||((this.recruiter!= null)&&this.recruiter.equals(rhs.recruiter))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.opportunityStatus == rhs.opportunityStatus)||((this.opportunityStatus!= null)&&this.opportunityStatus.equals(rhs.opportunityStatus))))&&((this.decisionPlan == rhs.decisionPlan)||((this.decisionPlan!= null)&&this.decisionPlan.equals(rhs.decisionPlan))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.admissionPopulation == rhs.admissionPopulation)||((this.admissionPopulation!= null)&&this.admissionPopulation.equals(rhs.admissionPopulation))))&&((this.ratings == rhs.ratings)||((this.ratings!= null)&&this.ratings.equals(rhs.ratings))))&&((this.campusPlans == rhs.campusPlans)||((this.campusPlans!= null)&&this.campusPlans.equals(rhs.campusPlans))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.opportunityStates == rhs.opportunityStates)||((this.opportunityStates!= null)&&this.opportunityStates.equals(rhs.opportunityStates))))&&((this.territory == rhs.territory)||((this.territory!= null)&&this.territory.equals(rhs.territory))))&&((this.academicLoad == rhs.academicLoad)||((this.academicLoad!= null)&&this.academicLoad.equals(rhs.academicLoad))));
    }

}
