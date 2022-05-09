
package com.ellucian.generated.eedm.admission_applications.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Admission Applications
 * <p>
 * Higher education institution admission applications
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "referenceId",
    "applicant",
    "recruitmentOpportunity",
    "type",
    "academicPeriod",
    "statuses",
    "source",
    "owner",
    "admissionPopulation",
    "decisionPlan",
    "site",
    "residencyType",
    "academicLoad",
    "program",
    "level",
    "disciplines",
    "credential",
    "school",
    "withdrawal",
    "comment"
})
@Generated("jsonschema2pojo")
public class AdmissionApplications {

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
     * The global identifier of the admission application
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the admission application")
    private String id;
    /**
     * Reference ID
     * <p>
     * The identifier of the application at its origin
     * 
     */
    @JsonProperty("referenceId")
    @JsonPropertyDescription("The identifier of the application at its origin")
    private String referenceId;
    /**
     * Applicant
     * <p>
     * The person applying for the admission
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    @JsonPropertyDescription("The person applying for the admission")
    private Applicant applicant;
    /**
     * Recruitment Opportunity
     * <p>
     * Admission recruitment opportunity associated with the application
     * 
     */
    @JsonProperty("recruitmentOpportunity")
    @JsonPropertyDescription("Admission recruitment opportunity associated with the application")
    private Object recruitmentOpportunity;
    /**
     * Type
     * <p>
     * The type of the application
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the application")
    private Object type;
    /**
     * Academic Period
     * <p>
     * The starting academic period for the admission
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The starting academic period for the admission")
    private Object academicPeriod;
    /**
     * Statuses
     * <p>
     * The statuses of the application through the admission process stages
     * (Required)
     * 
     */
    @JsonProperty("statuses")
    @JsonPropertyDescription("The statuses of the application through the admission process stages")
    private List<Status> statuses = new ArrayList<Status>();
    /**
     * Source
     * <p>
     * The source of information associated with the application
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of information associated with the application")
    private Object source;
    /**
     * Owner
     * <p>
     * The institution representative assigned to manage the application
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("The institution representative assigned to manage the application")
    private Object owner;
    /**
     * Admission Population
     * <p>
     * The type of admission populations the applicant belongs to
     * 
     */
    @JsonProperty("admissionPopulation")
    @JsonPropertyDescription("The type of admission populations the applicant belongs to")
    private Object admissionPopulation;
    /**
     * Decision Plan
     * <p>
     * The decision plan associated with the application
     * 
     */
    @JsonProperty("decisionPlan")
    @JsonPropertyDescription("The decision plan associated with the application")
    private Object decisionPlan;
    /**
     * Site
     * <p>
     * The institution site (campus) selected by the applicant
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The institution site (campus) selected by the applicant")
    private Object site;
    /**
     * Residency Type
     * <p>
     * The residency type of the applicant, e.g., "international"
     * 
     */
    @JsonProperty("residencyType")
    @JsonPropertyDescription("The residency type of the applicant, e.g., \"international\"")
    private Object residencyType;
    /**
     * Academic Load
     * <p>
     * The academic load selection, e.g., full- or part-time
     * 
     */
    @JsonProperty("academicLoad")
    @JsonPropertyDescription("The academic load selection, e.g., full- or part-time")
    private Object academicLoad;
    /**
     * Program
     * <p>
     * The academic program applied for
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("The academic program applied for")
    private Object program;
    /**
     * Level
     * <p>
     * Academic level
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("Academic level")
    private Object level;
    /**
     * Disciplines
     * <p>
     * The list of academic disciplines the applicant chose
     * 
     */
    @JsonProperty("disciplines")
    @JsonPropertyDescription("The list of academic disciplines the applicant chose")
    private List<Discipline> disciplines = new ArrayList<Discipline>();
    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) to be earned on completion of the study
     * 
     */
    @JsonProperty("credential")
    @JsonPropertyDescription("The academic credential (degree, diploma, etc.) to be earned on completion of the study")
    private Object credential;
    /**
     * School
     * <p>
     * The school or college of the institution the application is associated with
     * 
     */
    @JsonProperty("school")
    @JsonPropertyDescription("The school or college of the institution the application is associated with")
    private Object school;
    /**
     * Withdrawal
     * <p>
     * Application withdrawal related information
     * 
     */
    @JsonProperty("withdrawal")
    @JsonPropertyDescription("Application withdrawal related information")
    private Withdrawal withdrawal;
    /**
     * Comment
     * <p>
     * The comment associated with the application
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the application")
    private String comment;

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

    public AdmissionApplications withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the admission application
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
     * The global identifier of the admission application
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionApplications withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Reference ID
     * <p>
     * The identifier of the application at its origin
     * 
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Reference ID
     * <p>
     * The identifier of the application at its origin
     * 
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public AdmissionApplications withReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Applicant
     * <p>
     * The person applying for the admission
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    public Applicant getApplicant() {
        return applicant;
    }

    /**
     * Applicant
     * <p>
     * The person applying for the admission
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public AdmissionApplications withApplicant(Applicant applicant) {
        this.applicant = applicant;
        return this;
    }

    /**
     * Recruitment Opportunity
     * <p>
     * Admission recruitment opportunity associated with the application
     * 
     */
    @JsonProperty("recruitmentOpportunity")
    public Object getRecruitmentOpportunity() {
        return recruitmentOpportunity;
    }

    /**
     * Recruitment Opportunity
     * <p>
     * Admission recruitment opportunity associated with the application
     * 
     */
    @JsonProperty("recruitmentOpportunity")
    public void setRecruitmentOpportunity(Object recruitmentOpportunity) {
        this.recruitmentOpportunity = recruitmentOpportunity;
    }

    public AdmissionApplications withRecruitmentOpportunity(Object recruitmentOpportunity) {
        this.recruitmentOpportunity = recruitmentOpportunity;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the application
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the application
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public AdmissionApplications withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The starting academic period for the admission
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The starting academic period for the admission
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public AdmissionApplications withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Statuses
     * <p>
     * The statuses of the application through the admission process stages
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
     * The statuses of the application through the admission process stages
     * (Required)
     * 
     */
    @JsonProperty("statuses")
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public AdmissionApplications withStatuses(List<Status> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of information associated with the application
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of information associated with the application
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public AdmissionApplications withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Owner
     * <p>
     * The institution representative assigned to manage the application
     * 
     */
    @JsonProperty("owner")
    public Object getOwner() {
        return owner;
    }

    /**
     * Owner
     * <p>
     * The institution representative assigned to manage the application
     * 
     */
    @JsonProperty("owner")
    public void setOwner(Object owner) {
        this.owner = owner;
    }

    public AdmissionApplications withOwner(Object owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Admission Population
     * <p>
     * The type of admission populations the applicant belongs to
     * 
     */
    @JsonProperty("admissionPopulation")
    public Object getAdmissionPopulation() {
        return admissionPopulation;
    }

    /**
     * Admission Population
     * <p>
     * The type of admission populations the applicant belongs to
     * 
     */
    @JsonProperty("admissionPopulation")
    public void setAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
    }

    public AdmissionApplications withAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
        return this;
    }

    /**
     * Decision Plan
     * <p>
     * The decision plan associated with the application
     * 
     */
    @JsonProperty("decisionPlan")
    public Object getDecisionPlan() {
        return decisionPlan;
    }

    /**
     * Decision Plan
     * <p>
     * The decision plan associated with the application
     * 
     */
    @JsonProperty("decisionPlan")
    public void setDecisionPlan(Object decisionPlan) {
        this.decisionPlan = decisionPlan;
    }

    public AdmissionApplications withDecisionPlan(Object decisionPlan) {
        this.decisionPlan = decisionPlan;
        return this;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) selected by the applicant
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) selected by the applicant
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public AdmissionApplications withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Residency Type
     * <p>
     * The residency type of the applicant, e.g., "international"
     * 
     */
    @JsonProperty("residencyType")
    public Object getResidencyType() {
        return residencyType;
    }

    /**
     * Residency Type
     * <p>
     * The residency type of the applicant, e.g., "international"
     * 
     */
    @JsonProperty("residencyType")
    public void setResidencyType(Object residencyType) {
        this.residencyType = residencyType;
    }

    public AdmissionApplications withResidencyType(Object residencyType) {
        this.residencyType = residencyType;
        return this;
    }

    /**
     * Academic Load
     * <p>
     * The academic load selection, e.g., full- or part-time
     * 
     */
    @JsonProperty("academicLoad")
    public Object getAcademicLoad() {
        return academicLoad;
    }

    /**
     * Academic Load
     * <p>
     * The academic load selection, e.g., full- or part-time
     * 
     */
    @JsonProperty("academicLoad")
    public void setAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
    }

    public AdmissionApplications withAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
        return this;
    }

    /**
     * Program
     * <p>
     * The academic program applied for
     * 
     */
    @JsonProperty("program")
    public Object getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * The academic program applied for
     * 
     */
    @JsonProperty("program")
    public void setProgram(Object program) {
        this.program = program;
    }

    public AdmissionApplications withProgram(Object program) {
        this.program = program;
        return this;
    }

    /**
     * Level
     * <p>
     * Academic level
     * 
     */
    @JsonProperty("level")
    public Object getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * Academic level
     * 
     */
    @JsonProperty("level")
    public void setLevel(Object level) {
        this.level = level;
    }

    public AdmissionApplications withLevel(Object level) {
        this.level = level;
        return this;
    }

    /**
     * Disciplines
     * <p>
     * The list of academic disciplines the applicant chose
     * 
     */
    @JsonProperty("disciplines")
    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    /**
     * Disciplines
     * <p>
     * The list of academic disciplines the applicant chose
     * 
     */
    @JsonProperty("disciplines")
    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public AdmissionApplications withDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
        return this;
    }

    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) to be earned on completion of the study
     * 
     */
    @JsonProperty("credential")
    public Object getCredential() {
        return credential;
    }

    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) to be earned on completion of the study
     * 
     */
    @JsonProperty("credential")
    public void setCredential(Object credential) {
        this.credential = credential;
    }

    public AdmissionApplications withCredential(Object credential) {
        this.credential = credential;
        return this;
    }

    /**
     * School
     * <p>
     * The school or college of the institution the application is associated with
     * 
     */
    @JsonProperty("school")
    public Object getSchool() {
        return school;
    }

    /**
     * School
     * <p>
     * The school or college of the institution the application is associated with
     * 
     */
    @JsonProperty("school")
    public void setSchool(Object school) {
        this.school = school;
    }

    public AdmissionApplications withSchool(Object school) {
        this.school = school;
        return this;
    }

    /**
     * Withdrawal
     * <p>
     * Application withdrawal related information
     * 
     */
    @JsonProperty("withdrawal")
    public Withdrawal getWithdrawal() {
        return withdrawal;
    }

    /**
     * Withdrawal
     * <p>
     * Application withdrawal related information
     * 
     */
    @JsonProperty("withdrawal")
    public void setWithdrawal(Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public AdmissionApplications withWithdrawal(Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the application
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the application
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public AdmissionApplications withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionApplications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("disciplines");
        sb.append('=');
        sb.append(((this.disciplines == null)?"<null>":this.disciplines));
        sb.append(',');
        sb.append("credential");
        sb.append('=');
        sb.append(((this.credential == null)?"<null>":this.credential));
        sb.append(',');
        sb.append("school");
        sb.append('=');
        sb.append(((this.school == null)?"<null>":this.school));
        sb.append(',');
        sb.append("withdrawal");
        sb.append('=');
        sb.append(((this.withdrawal == null)?"<null>":this.withdrawal));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.withdrawal == null)? 0 :this.withdrawal.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.referenceId == null)? 0 :this.referenceId.hashCode()));
        result = ((result* 31)+((this.applicant == null)? 0 :this.applicant.hashCode()));
        result = ((result* 31)+((this.decisionPlan == null)? 0 :this.decisionPlan.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.credential == null)? 0 :this.credential.hashCode()));
        result = ((result* 31)+((this.admissionPopulation == null)? 0 :this.admissionPopulation.hashCode()));
        result = ((result* 31)+((this.school == null)? 0 :this.school.hashCode()));
        result = ((result* 31)+((this.statuses == null)? 0 :this.statuses.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
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
        if ((other instanceof AdmissionApplications) == false) {
            return false;
        }
        AdmissionApplications rhs = ((AdmissionApplications) other);
        return (((((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.withdrawal == rhs.withdrawal)||((this.withdrawal!= null)&&this.withdrawal.equals(rhs.withdrawal))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.referenceId == rhs.referenceId)||((this.referenceId!= null)&&this.referenceId.equals(rhs.referenceId))))&&((this.applicant == rhs.applicant)||((this.applicant!= null)&&this.applicant.equals(rhs.applicant))))&&((this.decisionPlan == rhs.decisionPlan)||((this.decisionPlan!= null)&&this.decisionPlan.equals(rhs.decisionPlan))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.credential == rhs.credential)||((this.credential!= null)&&this.credential.equals(rhs.credential))))&&((this.admissionPopulation == rhs.admissionPopulation)||((this.admissionPopulation!= null)&&this.admissionPopulation.equals(rhs.admissionPopulation))))&&((this.school == rhs.school)||((this.school!= null)&&this.school.equals(rhs.school))))&&((this.statuses == rhs.statuses)||((this.statuses!= null)&&this.statuses.equals(rhs.statuses))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.recruitmentOpportunity == rhs.recruitmentOpportunity)||((this.recruitmentOpportunity!= null)&&this.recruitmentOpportunity.equals(rhs.recruitmentOpportunity))))&&((this.residencyType == rhs.residencyType)||((this.residencyType!= null)&&this.residencyType.equals(rhs.residencyType))))&&((this.academicLoad == rhs.academicLoad)||((this.academicLoad!= null)&&this.academicLoad.equals(rhs.academicLoad))));
    }

}
