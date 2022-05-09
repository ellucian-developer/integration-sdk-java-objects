
package com.ellucian.generated.eedm.admission_applications_submissions.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Admission Applications Submissions
 * <p>
 * Higher education institution admission applications submissions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "referenceId",
    "applicant",
    "type",
    "academicPeriod",
    "owner",
    "admissionPopulation",
    "site",
    "residencyType",
    "academicLoad",
    "appliedOn",
    "applicationAcademicPrograms",
    "withdrawal",
    "applicationSource",
    "personSource",
    "comment"
})
@Generated("jsonschema2pojo")
public class AdmissionApplicationsSubmissions {

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
     * The global identifier of the admission application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the admission application.")
    private String id;
    /**
     * Reference Id
     * <p>
     * The identifier of the application at its origin.
     * 
     */
    @JsonProperty("referenceId")
    @JsonPropertyDescription("The identifier of the application at its origin.")
    private String referenceId;
    /**
     * Applicant
     * <p>
     * The person applying for admission.
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    @JsonPropertyDescription("The person applying for admission.")
    private Applicant applicant;
    /**
     * Type
     * <p>
     * The type of application.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of application.")
    private Object type;
    /**
     * Academic Period
     * <p>
     * The starting academic period for admission.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The starting academic period for admission.")
    private Object academicPeriod;
    /**
     * Owner
     * <p>
     * The institution representative assigned to manage the application.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("The institution representative assigned to manage the application.")
    private Object owner;
    /**
     * Admission Population
     * <p>
     * The type of admission population the applicant belongs to.
     * 
     */
    @JsonProperty("admissionPopulation")
    @JsonPropertyDescription("The type of admission population the applicant belongs to.")
    private Object admissionPopulation;
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
     * The residency type of the applicant (e.g. international).
     * 
     */
    @JsonProperty("residencyType")
    @JsonPropertyDescription("The residency type of the applicant (e.g. international).")
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
     * Applied On
     * <p>
     * The date the application was submitted.
     * 
     */
    @JsonProperty("appliedOn")
    @JsonPropertyDescription("The date the application was submitted.")
    private Object appliedOn;
    /**
     * Application Academic Programs
     * <p>
     * The academic programs for which the applicant has applied.
     * (Required)
     * 
     */
    @JsonProperty("applicationAcademicPrograms")
    @JsonPropertyDescription("The academic programs for which the applicant has applied.")
    private List<ApplicationAcademicProgram> applicationAcademicPrograms = new ArrayList<ApplicationAcademicProgram>();
    /**
     * Withdrawal
     * <p>
     * Application withdrawal related information.
     * 
     */
    @JsonProperty("withdrawal")
    @JsonPropertyDescription("Application withdrawal related information.")
    private Withdrawal withdrawal;
    /**
     * Application Source
     * <p>
     * The source associated with the application.
     * 
     */
    @JsonProperty("applicationSource")
    @JsonPropertyDescription("The source associated with the application.")
    private Object applicationSource;
    /**
     * Person Source
     * <p>
     * The source associated with the applicant.
     * 
     */
    @JsonProperty("personSource")
    @JsonPropertyDescription("The source associated with the applicant.")
    private Object personSource;
    /**
     * Comment
     * <p>
     * The comment associated with the application.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the application.")
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

    public AdmissionApplicationsSubmissions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the admission application.
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
     * The global identifier of the admission application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionApplicationsSubmissions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Reference Id
     * <p>
     * The identifier of the application at its origin.
     * 
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Reference Id
     * <p>
     * The identifier of the application at its origin.
     * 
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public AdmissionApplicationsSubmissions withReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Applicant
     * <p>
     * The person applying for admission.
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
     * The person applying for admission.
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public AdmissionApplicationsSubmissions withApplicant(Applicant applicant) {
        this.applicant = applicant;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of application.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of application.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public AdmissionApplicationsSubmissions withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The starting academic period for admission.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The starting academic period for admission.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public AdmissionApplicationsSubmissions withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Owner
     * <p>
     * The institution representative assigned to manage the application.
     * 
     */
    @JsonProperty("owner")
    public Object getOwner() {
        return owner;
    }

    /**
     * Owner
     * <p>
     * The institution representative assigned to manage the application.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(Object owner) {
        this.owner = owner;
    }

    public AdmissionApplicationsSubmissions withOwner(Object owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Admission Population
     * <p>
     * The type of admission population the applicant belongs to.
     * 
     */
    @JsonProperty("admissionPopulation")
    public Object getAdmissionPopulation() {
        return admissionPopulation;
    }

    /**
     * Admission Population
     * <p>
     * The type of admission population the applicant belongs to.
     * 
     */
    @JsonProperty("admissionPopulation")
    public void setAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
    }

    public AdmissionApplicationsSubmissions withAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
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

    public AdmissionApplicationsSubmissions withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Residency Type
     * <p>
     * The residency type of the applicant (e.g. international).
     * 
     */
    @JsonProperty("residencyType")
    public Object getResidencyType() {
        return residencyType;
    }

    /**
     * Residency Type
     * <p>
     * The residency type of the applicant (e.g. international).
     * 
     */
    @JsonProperty("residencyType")
    public void setResidencyType(Object residencyType) {
        this.residencyType = residencyType;
    }

    public AdmissionApplicationsSubmissions withResidencyType(Object residencyType) {
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

    public AdmissionApplicationsSubmissions withAcademicLoad(Object academicLoad) {
        this.academicLoad = academicLoad;
        return this;
    }

    /**
     * Applied On
     * <p>
     * The date the application was submitted.
     * 
     */
    @JsonProperty("appliedOn")
    public Object getAppliedOn() {
        return appliedOn;
    }

    /**
     * Applied On
     * <p>
     * The date the application was submitted.
     * 
     */
    @JsonProperty("appliedOn")
    public void setAppliedOn(Object appliedOn) {
        this.appliedOn = appliedOn;
    }

    public AdmissionApplicationsSubmissions withAppliedOn(Object appliedOn) {
        this.appliedOn = appliedOn;
        return this;
    }

    /**
     * Application Academic Programs
     * <p>
     * The academic programs for which the applicant has applied.
     * (Required)
     * 
     */
    @JsonProperty("applicationAcademicPrograms")
    public List<ApplicationAcademicProgram> getApplicationAcademicPrograms() {
        return applicationAcademicPrograms;
    }

    /**
     * Application Academic Programs
     * <p>
     * The academic programs for which the applicant has applied.
     * (Required)
     * 
     */
    @JsonProperty("applicationAcademicPrograms")
    public void setApplicationAcademicPrograms(List<ApplicationAcademicProgram> applicationAcademicPrograms) {
        this.applicationAcademicPrograms = applicationAcademicPrograms;
    }

    public AdmissionApplicationsSubmissions withApplicationAcademicPrograms(List<ApplicationAcademicProgram> applicationAcademicPrograms) {
        this.applicationAcademicPrograms = applicationAcademicPrograms;
        return this;
    }

    /**
     * Withdrawal
     * <p>
     * Application withdrawal related information.
     * 
     */
    @JsonProperty("withdrawal")
    public Withdrawal getWithdrawal() {
        return withdrawal;
    }

    /**
     * Withdrawal
     * <p>
     * Application withdrawal related information.
     * 
     */
    @JsonProperty("withdrawal")
    public void setWithdrawal(Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public AdmissionApplicationsSubmissions withWithdrawal(Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
        return this;
    }

    /**
     * Application Source
     * <p>
     * The source associated with the application.
     * 
     */
    @JsonProperty("applicationSource")
    public Object getApplicationSource() {
        return applicationSource;
    }

    /**
     * Application Source
     * <p>
     * The source associated with the application.
     * 
     */
    @JsonProperty("applicationSource")
    public void setApplicationSource(Object applicationSource) {
        this.applicationSource = applicationSource;
    }

    public AdmissionApplicationsSubmissions withApplicationSource(Object applicationSource) {
        this.applicationSource = applicationSource;
        return this;
    }

    /**
     * Person Source
     * <p>
     * The source associated with the applicant.
     * 
     */
    @JsonProperty("personSource")
    public Object getPersonSource() {
        return personSource;
    }

    /**
     * Person Source
     * <p>
     * The source associated with the applicant.
     * 
     */
    @JsonProperty("personSource")
    public void setPersonSource(Object personSource) {
        this.personSource = personSource;
    }

    public AdmissionApplicationsSubmissions withPersonSource(Object personSource) {
        this.personSource = personSource;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the application.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the application.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public AdmissionApplicationsSubmissions withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionApplicationsSubmissions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("admissionPopulation");
        sb.append('=');
        sb.append(((this.admissionPopulation == null)?"<null>":this.admissionPopulation));
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
        sb.append("appliedOn");
        sb.append('=');
        sb.append(((this.appliedOn == null)?"<null>":this.appliedOn));
        sb.append(',');
        sb.append("applicationAcademicPrograms");
        sb.append('=');
        sb.append(((this.applicationAcademicPrograms == null)?"<null>":this.applicationAcademicPrograms));
        sb.append(',');
        sb.append("withdrawal");
        sb.append('=');
        sb.append(((this.withdrawal == null)?"<null>":this.withdrawal));
        sb.append(',');
        sb.append("applicationSource");
        sb.append('=');
        sb.append(((this.applicationSource == null)?"<null>":this.applicationSource));
        sb.append(',');
        sb.append("personSource");
        sb.append('=');
        sb.append(((this.personSource == null)?"<null>":this.personSource));
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
        result = ((result* 31)+((this.applicationAcademicPrograms == null)? 0 :this.applicationAcademicPrograms.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.withdrawal == null)? 0 :this.withdrawal.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.referenceId == null)? 0 :this.referenceId.hashCode()));
        result = ((result* 31)+((this.applicant == null)? 0 :this.applicant.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.appliedOn == null)? 0 :this.appliedOn.hashCode()));
        result = ((result* 31)+((this.admissionPopulation == null)? 0 :this.admissionPopulation.hashCode()));
        result = ((result* 31)+((this.personSource == null)? 0 :this.personSource.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.residencyType == null)? 0 :this.residencyType.hashCode()));
        result = ((result* 31)+((this.academicLoad == null)? 0 :this.academicLoad.hashCode()));
        result = ((result* 31)+((this.applicationSource == null)? 0 :this.applicationSource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionApplicationsSubmissions) == false) {
            return false;
        }
        AdmissionApplicationsSubmissions rhs = ((AdmissionApplicationsSubmissions) other);
        return ((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.applicationAcademicPrograms == rhs.applicationAcademicPrograms)||((this.applicationAcademicPrograms!= null)&&this.applicationAcademicPrograms.equals(rhs.applicationAcademicPrograms))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.withdrawal == rhs.withdrawal)||((this.withdrawal!= null)&&this.withdrawal.equals(rhs.withdrawal))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.referenceId == rhs.referenceId)||((this.referenceId!= null)&&this.referenceId.equals(rhs.referenceId))))&&((this.applicant == rhs.applicant)||((this.applicant!= null)&&this.applicant.equals(rhs.applicant))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.appliedOn == rhs.appliedOn)||((this.appliedOn!= null)&&this.appliedOn.equals(rhs.appliedOn))))&&((this.admissionPopulation == rhs.admissionPopulation)||((this.admissionPopulation!= null)&&this.admissionPopulation.equals(rhs.admissionPopulation))))&&((this.personSource == rhs.personSource)||((this.personSource!= null)&&this.personSource.equals(rhs.personSource))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.residencyType == rhs.residencyType)||((this.residencyType!= null)&&this.residencyType.equals(rhs.residencyType))))&&((this.academicLoad == rhs.academicLoad)||((this.academicLoad!= null)&&this.academicLoad.equals(rhs.academicLoad))))&&((this.applicationSource == rhs.applicationSource)||((this.applicationSource!= null)&&this.applicationSource.equals(rhs.applicationSource))));
    }

}
