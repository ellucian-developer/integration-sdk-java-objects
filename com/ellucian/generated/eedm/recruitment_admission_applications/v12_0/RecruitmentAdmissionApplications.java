
package com.ellucian.generated.eedm.recruitment_admission_applications.v12_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Recruitment Admission Applications
 * <p>
 * Information about recruitment admission applications.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "referenceId",
    "applicant",
    "admissionApplication",
    "recruitmentOpportunity",
    "type",
    "academicPeriod",
    "statuses",
    "latestDecision",
    "source",
    "owner",
    "admissionPopulation",
    "decisionPlan",
    "site",
    "residencyType",
    "academicLoad",
    "program",
    "level",
    "withdrawnOn"
})
@Generated("jsonschema2pojo")
public class RecruitmentAdmissionApplications {

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
     * The global identifier of the recruitment admission application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the recruitment admission application.")
    private String id;
    /**
     * Reference Id
     * <p>
     * The reference identifier associated with the recruitment admission application at its origin.
     * 
     */
    @JsonProperty("referenceId")
    @JsonPropertyDescription("The reference identifier associated with the recruitment admission application at its origin.")
    private String referenceId;
    /**
     * Applicant
     * <p>
     * The person applying for the admission.
     * 
     */
    @JsonProperty("applicant")
    @JsonPropertyDescription("The person applying for the admission.")
    private Object applicant;
    /**
     * Admission Application
     * <p>
     * The reference link to the common admission applications entity.
     * 
     */
    @JsonProperty("admissionApplication")
    @JsonPropertyDescription("The reference link to the common admission applications entity.")
    private Object admissionApplication;
    /**
     * Recruitment Opportunity
     * <p>
     * The recruitment opportunity that generated the application.
     * 
     */
    @JsonProperty("recruitmentOpportunity")
    @JsonPropertyDescription("The recruitment opportunity that generated the application.")
    private Object recruitmentOpportunity;
    /**
     * Type
     * <p>
     * The type of the application.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the application.")
    private Object type;
    /**
     * Academic Period
     * <p>
     * The intended starting academic period specified in the application.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The intended starting academic period specified in the application.")
    private Object academicPeriod;
    /**
     * Statuses
     * <p>
     * The application statuses.
     * (Required)
     * 
     */
    @JsonProperty("statuses")
    @JsonPropertyDescription("The application statuses.")
    private List<Status> statuses = new ArrayList<Status>();
    /**
     * Latest Decision
     * <p>
     * The latest decision regarding the application.
     * 
     */
    @JsonProperty("latestDecision")
    @JsonPropertyDescription("The latest decision regarding the application.")
    private Object latestDecision;
    /**
     * Source
     * <p>
     * The source of information associated with the application.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of information associated with the application.")
    private Object source;
    /**
     * Owner
     * <p>
     * The representative or team assigned to manage the application.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("The representative or team assigned to manage the application.")
    private Object owner;
    /**
     * Admission Population
     * <p>
     * The admission population to which the applicant belongs.
     * 
     */
    @JsonProperty("admissionPopulation")
    @JsonPropertyDescription("The admission population to which the applicant belongs.")
    private Object admissionPopulation;
    /**
     * Decision Plan
     * <p>
     * The decision plan associated with the admission application.
     * 
     */
    @JsonProperty("decisionPlan")
    @JsonPropertyDescription("The decision plan associated with the admission application.")
    private Object decisionPlan;
    /**
     * Site
     * <p>
     * The institution site (campus) selected by the applicant.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The institution site (campus) selected by the applicant.")
    private Object site;
    /**
     * Residency Type
     * <p>
     * The residency type of the applicant.
     * 
     */
    @JsonProperty("residencyType")
    @JsonPropertyDescription("The residency type of the applicant.")
    private Object residencyType;
    /**
     * Academic Load
     * <p>
     * The academic load selected on the application (full-time or part-time).
     * 
     */
    @JsonProperty("academicLoad")
    @JsonPropertyDescription("The academic load selected on the application (full-time or part-time).")
    private Object academicLoad;
    /**
     * Program
     * <p>
     * The academic program to which the application was made.
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("The academic program to which the application was made.")
    private Object program;
    /**
     * Level
     * <p>
     * The academic level associated with the application.
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("The academic level associated with the application.")
    private Object level;
    /**
     * Withdrawn On
     * <p>
     * The date when the application was withdrawn.
     * 
     */
    @JsonProperty("withdrawnOn")
    @JsonPropertyDescription("The date when the application was withdrawn.")
    private Object withdrawnOn;

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

    public RecruitmentAdmissionApplications withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the recruitment admission application.
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
     * The global identifier of the recruitment admission application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RecruitmentAdmissionApplications withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Reference Id
     * <p>
     * The reference identifier associated with the recruitment admission application at its origin.
     * 
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Reference Id
     * <p>
     * The reference identifier associated with the recruitment admission application at its origin.
     * 
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public RecruitmentAdmissionApplications withReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Applicant
     * <p>
     * The person applying for the admission.
     * 
     */
    @JsonProperty("applicant")
    public Object getApplicant() {
        return applicant;
    }

    /**
     * Applicant
     * <p>
     * The person applying for the admission.
     * 
     */
    @JsonProperty("applicant")
    public void setApplicant(Object applicant) {
        this.applicant = applicant;
    }

    public RecruitmentAdmissionApplications withApplicant(Object applicant) {
        this.applicant = applicant;
        return this;
    }

    /**
     * Admission Application
     * <p>
     * The reference link to the common admission applications entity.
     * 
     */
    @JsonProperty("admissionApplication")
    public Object getAdmissionApplication() {
        return admissionApplication;
    }

    /**
     * Admission Application
     * <p>
     * The reference link to the common admission applications entity.
     * 
     */
    @JsonProperty("admissionApplication")
    public void setAdmissionApplication(Object admissionApplication) {
        this.admissionApplication = admissionApplication;
    }

    public RecruitmentAdmissionApplications withAdmissionApplication(Object admissionApplication) {
        this.admissionApplication = admissionApplication;
        return this;
    }

    /**
     * Recruitment Opportunity
     * <p>
     * The recruitment opportunity that generated the application.
     * 
     */
    @JsonProperty("recruitmentOpportunity")
    public Object getRecruitmentOpportunity() {
        return recruitmentOpportunity;
    }

    /**
     * Recruitment Opportunity
     * <p>
     * The recruitment opportunity that generated the application.
     * 
     */
    @JsonProperty("recruitmentOpportunity")
    public void setRecruitmentOpportunity(Object recruitmentOpportunity) {
        this.recruitmentOpportunity = recruitmentOpportunity;
    }

    public RecruitmentAdmissionApplications withRecruitmentOpportunity(Object recruitmentOpportunity) {
        this.recruitmentOpportunity = recruitmentOpportunity;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the application.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the application.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public RecruitmentAdmissionApplications withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The intended starting academic period specified in the application.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The intended starting academic period specified in the application.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public RecruitmentAdmissionApplications withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Statuses
     * <p>
     * The application statuses.
     * (Required)
     * 
     */
    @JsonProperty("statuses")
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     * Statuses
     * <p>
     * The application statuses.
     * (Required)
     * 
     */
    @JsonProperty("statuses")
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public RecruitmentAdmissionApplications withStatuses(List<Status> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Latest Decision
     * <p>
     * The latest decision regarding the application.
     * 
     */
    @JsonProperty("latestDecision")
    public Object getLatestDecision() {
        return latestDecision;
    }

    /**
     * Latest Decision
     * <p>
     * The latest decision regarding the application.
     * 
     */
    @JsonProperty("latestDecision")
    public void setLatestDecision(Object latestDecision) {
        this.latestDecision = latestDecision;
    }

    public RecruitmentAdmissionApplications withLatestDecision(Object latestDecision) {
        this.latestDecision = latestDecision;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of information associated with the application.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of information associated with the application.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public RecruitmentAdmissionApplications withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Owner
     * <p>
     * The representative or team assigned to manage the application.
     * 
     */
    @JsonProperty("owner")
    public Object getOwner() {
        return owner;
    }

    /**
     * Owner
     * <p>
     * The representative or team assigned to manage the application.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(Object owner) {
        this.owner = owner;
    }

    public RecruitmentAdmissionApplications withOwner(Object owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Admission Population
     * <p>
     * The admission population to which the applicant belongs.
     * 
     */
    @JsonProperty("admissionPopulation")
    public Object getAdmissionPopulation() {
        return admissionPopulation;
    }

    /**
     * Admission Population
     * <p>
     * The admission population to which the applicant belongs.
     * 
     */
    @JsonProperty("admissionPopulation")
    public void setAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
    }

    public RecruitmentAdmissionApplications withAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
        return this;
    }

    /**
     * Decision Plan
     * <p>
     * The decision plan associated with the admission application.
     * 
     */
    @JsonProperty("decisionPlan")
    public Object getDecisionPlan() {
        return decisionPlan;
    }

    /**
     * Decision Plan
     * <p>
     * The decision plan associated with the admission application.
     * 
     */
    @JsonProperty("decisionPlan")
    public void setDecisionPlan(Object decisionPlan) {
        this.decisionPlan = decisionPlan;
    }

    public RecruitmentAdmissionApplications withDecisionPlan(Object decisionPlan) {
        this.decisionPlan = decisionPlan;
        return this;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) selected by the applicant.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) selected by the applicant.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public RecruitmentAdmissionApplications withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Residency Type
     * <p>
     * The residency type of the applicant.
     * 
     */
    @JsonProperty("residencyType")
    public Object getResidencyType() {
        return residencyType;
    }

    /**
     * Residency Type
     * <p>
     * The residency type of the applicant.
     * 
     */
    @JsonProperty("residencyType")
    public void setResidencyType(Object residencyType) {
        this.residencyType = residencyType;
    }

    public RecruitmentAdmissionApplications withResidencyType(Object residencyType) {
        this.residencyType = residencyType;
        return this;
    }

    /**
     * Academic Load
     * <p>
     * The academic load selected on the application (full-time or part-time).
     * 
     */
    @JsonProperty("academicLoad")
    public Object getAcademicLoad() {
        return academicLoad;
    }

    /**
     * Academic Load
     * <p>
     * The academic load selected on the application (full-time or part-time).
     * 
     */
    @JsonProperty("academicLoad")
    public void setAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
    }

    public RecruitmentAdmissionApplications withAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
        return this;
    }

    /**
     * Program
     * <p>
     * The academic program to which the application was made.
     * 
     */
    @JsonProperty("program")
    public Object getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * The academic program to which the application was made.
     * 
     */
    @JsonProperty("program")
    public void setProgram(Object program) {
        this.program = program;
    }

    public RecruitmentAdmissionApplications withProgram(Object program) {
        this.program = program;
        return this;
    }

    /**
     * Level
     * <p>
     * The academic level associated with the application.
     * 
     */
    @JsonProperty("level")
    public Object getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * The academic level associated with the application.
     * 
     */
    @JsonProperty("level")
    public void setLevel(Object level) {
        this.level = level;
    }

    public RecruitmentAdmissionApplications withLevel(Object level) {
        this.level = level;
        return this;
    }

    /**
     * Withdrawn On
     * <p>
     * The date when the application was withdrawn.
     * 
     */
    @JsonProperty("withdrawnOn")
    public Object getWithdrawnOn() {
        return withdrawnOn;
    }

    /**
     * Withdrawn On
     * <p>
     * The date when the application was withdrawn.
     * 
     */
    @JsonProperty("withdrawnOn")
    public void setWithdrawnOn(Object withdrawnOn) {
        this.withdrawnOn = withdrawnOn;
    }

    public RecruitmentAdmissionApplications withWithdrawnOn(Object withdrawnOn) {
        this.withdrawnOn = withdrawnOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecruitmentAdmissionApplications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("referenceId");
        sb.append('=');
        sb.append(((this.referenceId == null)?"<null>":this.referenceId));
        sb.append(',');
        sb.append("applicant");
        sb.append('=');
        sb.append(((this.applicant == null)?"<null>":this.applicant));
        sb.append(',');
        sb.append("admissionApplication");
        sb.append('=');
        sb.append(((this.admissionApplication == null)?"<null>":this.admissionApplication));
        sb.append(',');
        sb.append("recruitmentOpportunity");
        sb.append('=');
        sb.append(((this.recruitmentOpportunity == null)?"<null>":this.recruitmentOpportunity));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("statuses");
        sb.append('=');
        sb.append(((this.statuses == null)?"<null>":this.statuses));
        sb.append(',');
        sb.append("latestDecision");
        sb.append('=');
        sb.append(((this.latestDecision == null)?"<null>":this.latestDecision));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("admissionPopulation");
        sb.append('=');
        sb.append(((this.admissionPopulation == null)?"<null>":this.admissionPopulation));
        sb.append(',');
        sb.append("decisionPlan");
        sb.append('=');
        sb.append(((this.decisionPlan == null)?"<null>":this.decisionPlan));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("residencyType");
        sb.append('=');
        sb.append(((this.residencyType == null)?"<null>":this.residencyType));
        sb.append(',');
        sb.append("academicLoad");
        sb.append('=');
        sb.append(((this.academicLoad == null)?"<null>":this.academicLoad));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("withdrawnOn");
        sb.append('=');
        sb.append(((this.withdrawnOn == null)?"<null>":this.withdrawnOn));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.latestDecision == null)? 0 :this.latestDecision.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.admissionApplication == null)? 0 :this.admissionApplication.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.referenceId == null)? 0 :this.referenceId.hashCode()));
        result = ((result* 31)+((this.applicant == null)? 0 :this.applicant.hashCode()));
        result = ((result* 31)+((this.decisionPlan == null)? 0 :this.decisionPlan.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.withdrawnOn == null)? 0 :this.withdrawnOn.hashCode()));
        result = ((result* 31)+((this.admissionPopulation == null)? 0 :this.admissionPopulation.hashCode()));
        result = ((result* 31)+((this.statuses == null)? 0 :this.statuses.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.recruitmentOpportunity == null)? 0 :this.recruitmentOpportunity.hashCode()));
        result = ((result* 31)+((this.residencyType == null)? 0 :this.residencyType.hashCode()));
        result = ((result* 31)+((this.academicLoad == null)? 0 :this.academicLoad.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecruitmentAdmissionApplications) == false) {
            return false;
        }
        RecruitmentAdmissionApplications rhs = ((RecruitmentAdmissionApplications) other);
        return (((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.latestDecision == rhs.latestDecision)||((this.latestDecision!= null)&&this.latestDecision.equals(rhs.latestDecision))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.admissionApplication == rhs.admissionApplication)||((this.admissionApplication!= null)&&this.admissionApplication.equals(rhs.admissionApplication))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.referenceId == rhs.referenceId)||((this.referenceId!= null)&&this.referenceId.equals(rhs.referenceId))))&&((this.applicant == rhs.applicant)||((this.applicant!= null)&&this.applicant.equals(rhs.applicant))))&&((this.decisionPlan == rhs.decisionPlan)||((this.decisionPlan!= null)&&this.decisionPlan.equals(rhs.decisionPlan))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.withdrawnOn == rhs.withdrawnOn)||((this.withdrawnOn!= null)&&this.withdrawnOn.equals(rhs.withdrawnOn))))&&((this.admissionPopulation == rhs.admissionPopulation)||((this.admissionPopulation!= null)&&this.admissionPopulation.equals(rhs.admissionPopulation))))&&((this.statuses == rhs.statuses)||((this.statuses!= null)&&this.statuses.equals(rhs.statuses))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.recruitmentOpportunity == rhs.recruitmentOpportunity)||((this.recruitmentOpportunity!= null)&&this.recruitmentOpportunity.equals(rhs.recruitmentOpportunity))))&&((this.residencyType == rhs.residencyType)||((this.residencyType!= null)&&this.residencyType.equals(rhs.residencyType))))&&((this.academicLoad == rhs.academicLoad)||((this.academicLoad!= null)&&this.academicLoad.equals(rhs.academicLoad))));
    }

}
