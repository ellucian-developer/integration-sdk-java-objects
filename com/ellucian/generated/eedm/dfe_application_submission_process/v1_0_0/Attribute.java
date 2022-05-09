
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Attribute
 * <p>
 * The attributes of the application and applicant.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "phase",
    "submittedOn",
    "updatedOn",
    "rejectByDefaultOn",
    "personalStatement",
    "interviewPreference",
    "furtherInformation",
    "candidate",
    "contactDetails",
    "course",
    "qualification",
    "workExperience",
    "references",
    "offer",
    "withdrawal",
    "rejection",
    "hesaIttData",
    "supportReference",
    "safeguardingIssuesStatus",
    "safeguardingIssuesDetailsUrl"
})
@Generated("jsonschema2pojo")
public class Attribute {

    /**
     * Status
     * <p>
     * The status of this application.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this application.")
    private String status;
    /**
     * Phase
     * <p>
     * The phase of this application. In the first phase, 'Apply 1', the candidate can choose up to 3 courses. If all of those choices are rejected, declined, or withdrawn, the user can go into 'Apply 2'. This means they can choose 1 course at a time.
     * 
     */
    @JsonProperty("phase")
    @JsonPropertyDescription("The phase of this application. In the first phase, 'Apply 1', the candidate can choose up to 3 courses. If all of those choices are rejected, declined, or withdrawn, the user can go into 'Apply 2'. This means they can choose 1 course at a time.")
    private String phase;
    /**
     * Submitted Date
     * <p>
     * Time of submission.
     * 
     */
    @JsonProperty("submittedOn")
    @JsonPropertyDescription("Time of submission.")
    private Object submittedOn;
    /**
     * Updated Date
     * <p>
     * Time of last change.
     * 
     */
    @JsonProperty("updatedOn")
    @JsonPropertyDescription("Time of last change.")
    private Object updatedOn;
    /**
     * Reject By Default Date
     * <p>
     * Time when the application is due to be rejected by default.
     * 
     */
    @JsonProperty("rejectByDefaultOn")
    @JsonPropertyDescription("Time when the application is due to be rejected by default.")
    private Object rejectByDefaultOn;
    /**
     * Personal Statement
     * <p>
     * The candidate’s personal statement, combined from the 'Becoming a Teacher' and 'Subject Knowledge' fields in the application form.
     * 
     */
    @JsonProperty("personalStatement")
    @JsonPropertyDescription("The candidate\u2019s personal statement, combined from the 'Becoming a Teacher' and 'Subject Knowledge' fields in the application form.")
    private String personalStatement;
    /**
     * Interview Preference
     * <p>
     * The candidate’s interview preferences.
     * 
     */
    @JsonProperty("interviewPreference")
    @JsonPropertyDescription("The candidate\u2019s interview preferences.")
    private String interviewPreference;
    /**
     * Further Information
     * <p>
     * Other personal or professional issues relevant to the application which are not covered in the form.
     * 
     */
    @JsonProperty("furtherInformation")
    @JsonPropertyDescription("Other personal or professional issues relevant to the application which are not covered in the form.")
    private String furtherInformation;
    /**
     * Candidate
     * <p>
     * Personal Details of an applicant.
     * (Required)
     * 
     */
    @JsonProperty("candidate")
    @JsonPropertyDescription("Personal Details of an applicant.")
    private Candidate candidate;
    /**
     * Contact Details
     * <p>
     * Phone, email and physical addresses where an applicant may be contacted.
     * (Required)
     * 
     */
    @JsonProperty("contactDetails")
    @JsonPropertyDescription("Phone, email and physical addresses where an applicant may be contacted.")
    private ContactDetails contactDetails;
    /**
     * Course
     * <p>
     * Identifies the subject requested by an applicant and all related information.
     * 
     */
    @JsonProperty("course")
    @JsonPropertyDescription("Identifies the subject requested by an applicant and all related information.")
    private Object course;
    /**
     * Qualification
     * <p>
     * Information about applicant’s qualification.
     * 
     */
    @JsonProperty("qualification")
    @JsonPropertyDescription("Information about applicant\u2019s qualification.")
    private Qualification qualification;
    /**
     * Work Experience
     * <p>
     * Information about an applicant’s current and previous employments.
     * 
     */
    @JsonProperty("workExperience")
    @JsonPropertyDescription("Information about an applicant\u2019s current and previous employments.")
    private WorkExperience workExperience;
    /**
     * References
     * <p>
     * Information about an applicant’s referee and the reference associated with the referee.
     * 
     */
    @JsonProperty("references")
    @JsonPropertyDescription("Information about an applicant\u2019s referee and the reference associated with the referee.")
    private List<Reference> references = new ArrayList<Reference>();
    /**
     * Offer
     * <p>
     * Decisions made on application.
     * 
     */
    @JsonProperty("offer")
    @JsonPropertyDescription("Decisions made on application.")
    private Object offer;
    /**
     * Withdrawal
     * <p>
     * Date and reason for withdrawal.
     * 
     */
    @JsonProperty("withdrawal")
    @JsonPropertyDescription("Date and reason for withdrawal.")
    private Object withdrawal;
    /**
     * Rejection
     * <p>
     * Reason for rejection.
     * 
     */
    @JsonProperty("rejection")
    @JsonPropertyDescription("Reason for rejection.")
    private Object rejection;
    /**
     * Hesa Itt Data
     * <p>
     * Information required by HESA for the Initial Teacher Training data return. This information will only be returned once the application status is `enrolled`.
     * 
     */
    @JsonProperty("hesaIttData")
    @JsonPropertyDescription("Information required by HESA for the Initial Teacher Training data return. This information will only be returned once the application status is `enrolled`.")
    private HesaIttData hesaIttData;
    /**
     * Support Reference
     * <p>
     * The candidate's reference number for their application in the Apply system.
     * 
     */
    @JsonProperty("supportReference")
    @JsonPropertyDescription("The candidate's reference number for their application in the Apply system.")
    private String supportReference;
    /**
     * Safeguarding Issues Status
     * <p>
     * Status of candidate's response to the safeguarding issues declaration.
     * 
     */
    @JsonProperty("safeguardingIssuesStatus")
    @JsonPropertyDescription("Status of candidate's response to the safeguarding issues declaration.")
    private String safeguardingIssuesStatus;
    /**
     * Safeguarding Issues Details Url
     * <p>
     * URL to Apply system where safeguarding issues disclosed by the candidate can be access by users with permissions to view safeguarding information.
     * 
     */
    @JsonProperty("safeguardingIssuesDetailsUrl")
    @JsonPropertyDescription("URL to Apply system where safeguarding issues disclosed by the candidate can be access by users with permissions to view safeguarding information.")
    private String safeguardingIssuesDetailsUrl;

    /**
     * Status
     * <p>
     * The status of this application.
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of this application.
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Attribute withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Phase
     * <p>
     * The phase of this application. In the first phase, 'Apply 1', the candidate can choose up to 3 courses. If all of those choices are rejected, declined, or withdrawn, the user can go into 'Apply 2'. This means they can choose 1 course at a time.
     * 
     */
    @JsonProperty("phase")
    public String getPhase() {
        return phase;
    }

    /**
     * Phase
     * <p>
     * The phase of this application. In the first phase, 'Apply 1', the candidate can choose up to 3 courses. If all of those choices are rejected, declined, or withdrawn, the user can go into 'Apply 2'. This means they can choose 1 course at a time.
     * 
     */
    @JsonProperty("phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Attribute withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Submitted Date
     * <p>
     * Time of submission.
     * 
     */
    @JsonProperty("submittedOn")
    public Object getSubmittedOn() {
        return submittedOn;
    }

    /**
     * Submitted Date
     * <p>
     * Time of submission.
     * 
     */
    @JsonProperty("submittedOn")
    public void setSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
    }

    public Attribute withSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
        return this;
    }

    /**
     * Updated Date
     * <p>
     * Time of last change.
     * 
     */
    @JsonProperty("updatedOn")
    public Object getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Updated Date
     * <p>
     * Time of last change.
     * 
     */
    @JsonProperty("updatedOn")
    public void setUpdatedOn(Object updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Attribute withUpdatedOn(Object updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * Reject By Default Date
     * <p>
     * Time when the application is due to be rejected by default.
     * 
     */
    @JsonProperty("rejectByDefaultOn")
    public Object getRejectByDefaultOn() {
        return rejectByDefaultOn;
    }

    /**
     * Reject By Default Date
     * <p>
     * Time when the application is due to be rejected by default.
     * 
     */
    @JsonProperty("rejectByDefaultOn")
    public void setRejectByDefaultOn(Object rejectByDefaultOn) {
        this.rejectByDefaultOn = rejectByDefaultOn;
    }

    public Attribute withRejectByDefaultOn(Object rejectByDefaultOn) {
        this.rejectByDefaultOn = rejectByDefaultOn;
        return this;
    }

    /**
     * Personal Statement
     * <p>
     * The candidate’s personal statement, combined from the 'Becoming a Teacher' and 'Subject Knowledge' fields in the application form.
     * 
     */
    @JsonProperty("personalStatement")
    public String getPersonalStatement() {
        return personalStatement;
    }

    /**
     * Personal Statement
     * <p>
     * The candidate’s personal statement, combined from the 'Becoming a Teacher' and 'Subject Knowledge' fields in the application form.
     * 
     */
    @JsonProperty("personalStatement")
    public void setPersonalStatement(String personalStatement) {
        this.personalStatement = personalStatement;
    }

    public Attribute withPersonalStatement(String personalStatement) {
        this.personalStatement = personalStatement;
        return this;
    }

    /**
     * Interview Preference
     * <p>
     * The candidate’s interview preferences.
     * 
     */
    @JsonProperty("interviewPreference")
    public String getInterviewPreference() {
        return interviewPreference;
    }

    /**
     * Interview Preference
     * <p>
     * The candidate’s interview preferences.
     * 
     */
    @JsonProperty("interviewPreference")
    public void setInterviewPreference(String interviewPreference) {
        this.interviewPreference = interviewPreference;
    }

    public Attribute withInterviewPreference(String interviewPreference) {
        this.interviewPreference = interviewPreference;
        return this;
    }

    /**
     * Further Information
     * <p>
     * Other personal or professional issues relevant to the application which are not covered in the form.
     * 
     */
    @JsonProperty("furtherInformation")
    public String getFurtherInformation() {
        return furtherInformation;
    }

    /**
     * Further Information
     * <p>
     * Other personal or professional issues relevant to the application which are not covered in the form.
     * 
     */
    @JsonProperty("furtherInformation")
    public void setFurtherInformation(String furtherInformation) {
        this.furtherInformation = furtherInformation;
    }

    public Attribute withFurtherInformation(String furtherInformation) {
        this.furtherInformation = furtherInformation;
        return this;
    }

    /**
     * Candidate
     * <p>
     * Personal Details of an applicant.
     * (Required)
     * 
     */
    @JsonProperty("candidate")
    public Candidate getCandidate() {
        return candidate;
    }

    /**
     * Candidate
     * <p>
     * Personal Details of an applicant.
     * (Required)
     * 
     */
    @JsonProperty("candidate")
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Attribute withCandidate(Candidate candidate) {
        this.candidate = candidate;
        return this;
    }

    /**
     * Contact Details
     * <p>
     * Phone, email and physical addresses where an applicant may be contacted.
     * (Required)
     * 
     */
    @JsonProperty("contactDetails")
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Contact Details
     * <p>
     * Phone, email and physical addresses where an applicant may be contacted.
     * (Required)
     * 
     */
    @JsonProperty("contactDetails")
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Attribute withContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Course
     * <p>
     * Identifies the subject requested by an applicant and all related information.
     * 
     */
    @JsonProperty("course")
    public Object getCourse() {
        return course;
    }

    /**
     * Course
     * <p>
     * Identifies the subject requested by an applicant and all related information.
     * 
     */
    @JsonProperty("course")
    public void setCourse(Object course) {
        this.course = course;
    }

    public Attribute withCourse(Object course) {
        this.course = course;
        return this;
    }

    /**
     * Qualification
     * <p>
     * Information about applicant’s qualification.
     * 
     */
    @JsonProperty("qualification")
    public Qualification getQualification() {
        return qualification;
    }

    /**
     * Qualification
     * <p>
     * Information about applicant’s qualification.
     * 
     */
    @JsonProperty("qualification")
    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Attribute withQualification(Qualification qualification) {
        this.qualification = qualification;
        return this;
    }

    /**
     * Work Experience
     * <p>
     * Information about an applicant’s current and previous employments.
     * 
     */
    @JsonProperty("workExperience")
    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    /**
     * Work Experience
     * <p>
     * Information about an applicant’s current and previous employments.
     * 
     */
    @JsonProperty("workExperience")
    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public Attribute withWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
        return this;
    }

    /**
     * References
     * <p>
     * Information about an applicant’s referee and the reference associated with the referee.
     * 
     */
    @JsonProperty("references")
    public List<Reference> getReferences() {
        return references;
    }

    /**
     * References
     * <p>
     * Information about an applicant’s referee and the reference associated with the referee.
     * 
     */
    @JsonProperty("references")
    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public Attribute withReferences(List<Reference> references) {
        this.references = references;
        return this;
    }

    /**
     * Offer
     * <p>
     * Decisions made on application.
     * 
     */
    @JsonProperty("offer")
    public Object getOffer() {
        return offer;
    }

    /**
     * Offer
     * <p>
     * Decisions made on application.
     * 
     */
    @JsonProperty("offer")
    public void setOffer(Object offer) {
        this.offer = offer;
    }

    public Attribute withOffer(Object offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Withdrawal
     * <p>
     * Date and reason for withdrawal.
     * 
     */
    @JsonProperty("withdrawal")
    public Object getWithdrawal() {
        return withdrawal;
    }

    /**
     * Withdrawal
     * <p>
     * Date and reason for withdrawal.
     * 
     */
    @JsonProperty("withdrawal")
    public void setWithdrawal(Object withdrawal) {
        this.withdrawal = withdrawal;
    }

    public Attribute withWithdrawal(Object withdrawal) {
        this.withdrawal = withdrawal;
        return this;
    }

    /**
     * Rejection
     * <p>
     * Reason for rejection.
     * 
     */
    @JsonProperty("rejection")
    public Object getRejection() {
        return rejection;
    }

    /**
     * Rejection
     * <p>
     * Reason for rejection.
     * 
     */
    @JsonProperty("rejection")
    public void setRejection(Object rejection) {
        this.rejection = rejection;
    }

    public Attribute withRejection(Object rejection) {
        this.rejection = rejection;
        return this;
    }

    /**
     * Hesa Itt Data
     * <p>
     * Information required by HESA for the Initial Teacher Training data return. This information will only be returned once the application status is `enrolled`.
     * 
     */
    @JsonProperty("hesaIttData")
    public HesaIttData getHesaIttData() {
        return hesaIttData;
    }

    /**
     * Hesa Itt Data
     * <p>
     * Information required by HESA for the Initial Teacher Training data return. This information will only be returned once the application status is `enrolled`.
     * 
     */
    @JsonProperty("hesaIttData")
    public void setHesaIttData(HesaIttData hesaIttData) {
        this.hesaIttData = hesaIttData;
    }

    public Attribute withHesaIttData(HesaIttData hesaIttData) {
        this.hesaIttData = hesaIttData;
        return this;
    }

    /**
     * Support Reference
     * <p>
     * The candidate's reference number for their application in the Apply system.
     * 
     */
    @JsonProperty("supportReference")
    public String getSupportReference() {
        return supportReference;
    }

    /**
     * Support Reference
     * <p>
     * The candidate's reference number for their application in the Apply system.
     * 
     */
    @JsonProperty("supportReference")
    public void setSupportReference(String supportReference) {
        this.supportReference = supportReference;
    }

    public Attribute withSupportReference(String supportReference) {
        this.supportReference = supportReference;
        return this;
    }

    /**
     * Safeguarding Issues Status
     * <p>
     * Status of candidate's response to the safeguarding issues declaration.
     * 
     */
    @JsonProperty("safeguardingIssuesStatus")
    public String getSafeguardingIssuesStatus() {
        return safeguardingIssuesStatus;
    }

    /**
     * Safeguarding Issues Status
     * <p>
     * Status of candidate's response to the safeguarding issues declaration.
     * 
     */
    @JsonProperty("safeguardingIssuesStatus")
    public void setSafeguardingIssuesStatus(String safeguardingIssuesStatus) {
        this.safeguardingIssuesStatus = safeguardingIssuesStatus;
    }

    public Attribute withSafeguardingIssuesStatus(String safeguardingIssuesStatus) {
        this.safeguardingIssuesStatus = safeguardingIssuesStatus;
        return this;
    }

    /**
     * Safeguarding Issues Details Url
     * <p>
     * URL to Apply system where safeguarding issues disclosed by the candidate can be access by users with permissions to view safeguarding information.
     * 
     */
    @JsonProperty("safeguardingIssuesDetailsUrl")
    public String getSafeguardingIssuesDetailsUrl() {
        return safeguardingIssuesDetailsUrl;
    }

    /**
     * Safeguarding Issues Details Url
     * <p>
     * URL to Apply system where safeguarding issues disclosed by the candidate can be access by users with permissions to view safeguarding information.
     * 
     */
    @JsonProperty("safeguardingIssuesDetailsUrl")
    public void setSafeguardingIssuesDetailsUrl(String safeguardingIssuesDetailsUrl) {
        this.safeguardingIssuesDetailsUrl = safeguardingIssuesDetailsUrl;
    }

    public Attribute withSafeguardingIssuesDetailsUrl(String safeguardingIssuesDetailsUrl) {
        this.safeguardingIssuesDetailsUrl = safeguardingIssuesDetailsUrl;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attribute.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("phase");
        sb.append('=');
        sb.append(((this.phase == null)?"<null>":this.phase));
        sb.append(',');
        sb.append("submittedOn");
        sb.append('=');
        sb.append(((this.submittedOn == null)?"<null>":this.submittedOn));
        sb.append(',');
        sb.append("updatedOn");
        sb.append('=');
        sb.append(((this.updatedOn == null)?"<null>":this.updatedOn));
        sb.append(',');
        sb.append("rejectByDefaultOn");
        sb.append('=');
        sb.append(((this.rejectByDefaultOn == null)?"<null>":this.rejectByDefaultOn));
        sb.append(',');
        sb.append("personalStatement");
        sb.append('=');
        sb.append(((this.personalStatement == null)?"<null>":this.personalStatement));
        sb.append(',');
        sb.append("interviewPreference");
        sb.append('=');
        sb.append(((this.interviewPreference == null)?"<null>":this.interviewPreference));
        sb.append(',');
        sb.append("furtherInformation");
        sb.append('=');
        sb.append(((this.furtherInformation == null)?"<null>":this.furtherInformation));
        sb.append(',');
        sb.append("candidate");
        sb.append('=');
        sb.append(((this.candidate == null)?"<null>":this.candidate));
        sb.append(',');
        sb.append("contactDetails");
        sb.append('=');
        sb.append(((this.contactDetails == null)?"<null>":this.contactDetails));
        sb.append(',');
        sb.append("course");
        sb.append('=');
        sb.append(((this.course == null)?"<null>":this.course));
        sb.append(',');
        sb.append("qualification");
        sb.append('=');
        sb.append(((this.qualification == null)?"<null>":this.qualification));
        sb.append(',');
        sb.append("workExperience");
        sb.append('=');
        sb.append(((this.workExperience == null)?"<null>":this.workExperience));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
        sb.append(',');
        sb.append("offer");
        sb.append('=');
        sb.append(((this.offer == null)?"<null>":this.offer));
        sb.append(',');
        sb.append("withdrawal");
        sb.append('=');
        sb.append(((this.withdrawal == null)?"<null>":this.withdrawal));
        sb.append(',');
        sb.append("rejection");
        sb.append('=');
        sb.append(((this.rejection == null)?"<null>":this.rejection));
        sb.append(',');
        sb.append("hesaIttData");
        sb.append('=');
        sb.append(((this.hesaIttData == null)?"<null>":this.hesaIttData));
        sb.append(',');
        sb.append("supportReference");
        sb.append('=');
        sb.append(((this.supportReference == null)?"<null>":this.supportReference));
        sb.append(',');
        sb.append("safeguardingIssuesStatus");
        sb.append('=');
        sb.append(((this.safeguardingIssuesStatus == null)?"<null>":this.safeguardingIssuesStatus));
        sb.append(',');
        sb.append("safeguardingIssuesDetailsUrl");
        sb.append('=');
        sb.append(((this.safeguardingIssuesDetailsUrl == null)?"<null>":this.safeguardingIssuesDetailsUrl));
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
        result = ((result* 31)+((this.phase == null)? 0 :this.phase.hashCode()));
        result = ((result* 31)+((this.supportReference == null)? 0 :this.supportReference.hashCode()));
        result = ((result* 31)+((this.furtherInformation == null)? 0 :this.furtherInformation.hashCode()));
        result = ((result* 31)+((this.safeguardingIssuesDetailsUrl == null)? 0 :this.safeguardingIssuesDetailsUrl.hashCode()));
        result = ((result* 31)+((this.interviewPreference == null)? 0 :this.interviewPreference.hashCode()));
        result = ((result* 31)+((this.references == null)? 0 :this.references.hashCode()));
        result = ((result* 31)+((this.rejectByDefaultOn == null)? 0 :this.rejectByDefaultOn.hashCode()));
        result = ((result* 31)+((this.hesaIttData == null)? 0 :this.hesaIttData.hashCode()));
        result = ((result* 31)+((this.submittedOn == null)? 0 :this.submittedOn.hashCode()));
        result = ((result* 31)+((this.workExperience == null)? 0 :this.workExperience.hashCode()));
        result = ((result* 31)+((this.personalStatement == null)? 0 :this.personalStatement.hashCode()));
        result = ((result* 31)+((this.updatedOn == null)? 0 :this.updatedOn.hashCode()));
        result = ((result* 31)+((this.withdrawal == null)? 0 :this.withdrawal.hashCode()));
        result = ((result* 31)+((this.contactDetails == null)? 0 :this.contactDetails.hashCode()));
        result = ((result* 31)+((this.rejection == null)? 0 :this.rejection.hashCode()));
        result = ((result* 31)+((this.offer == null)? 0 :this.offer.hashCode()));
        result = ((result* 31)+((this.qualification == null)? 0 :this.qualification.hashCode()));
        result = ((result* 31)+((this.candidate == null)? 0 :this.candidate.hashCode()));
        result = ((result* 31)+((this.safeguardingIssuesStatus == null)? 0 :this.safeguardingIssuesStatus.hashCode()));
        result = ((result* 31)+((this.course == null)? 0 :this.course.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attribute) == false) {
            return false;
        }
        Attribute rhs = ((Attribute) other);
        return ((((((((((((((((((((((this.phase == rhs.phase)||((this.phase!= null)&&this.phase.equals(rhs.phase)))&&((this.supportReference == rhs.supportReference)||((this.supportReference!= null)&&this.supportReference.equals(rhs.supportReference))))&&((this.furtherInformation == rhs.furtherInformation)||((this.furtherInformation!= null)&&this.furtherInformation.equals(rhs.furtherInformation))))&&((this.safeguardingIssuesDetailsUrl == rhs.safeguardingIssuesDetailsUrl)||((this.safeguardingIssuesDetailsUrl!= null)&&this.safeguardingIssuesDetailsUrl.equals(rhs.safeguardingIssuesDetailsUrl))))&&((this.interviewPreference == rhs.interviewPreference)||((this.interviewPreference!= null)&&this.interviewPreference.equals(rhs.interviewPreference))))&&((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references))))&&((this.rejectByDefaultOn == rhs.rejectByDefaultOn)||((this.rejectByDefaultOn!= null)&&this.rejectByDefaultOn.equals(rhs.rejectByDefaultOn))))&&((this.hesaIttData == rhs.hesaIttData)||((this.hesaIttData!= null)&&this.hesaIttData.equals(rhs.hesaIttData))))&&((this.submittedOn == rhs.submittedOn)||((this.submittedOn!= null)&&this.submittedOn.equals(rhs.submittedOn))))&&((this.workExperience == rhs.workExperience)||((this.workExperience!= null)&&this.workExperience.equals(rhs.workExperience))))&&((this.personalStatement == rhs.personalStatement)||((this.personalStatement!= null)&&this.personalStatement.equals(rhs.personalStatement))))&&((this.updatedOn == rhs.updatedOn)||((this.updatedOn!= null)&&this.updatedOn.equals(rhs.updatedOn))))&&((this.withdrawal == rhs.withdrawal)||((this.withdrawal!= null)&&this.withdrawal.equals(rhs.withdrawal))))&&((this.contactDetails == rhs.contactDetails)||((this.contactDetails!= null)&&this.contactDetails.equals(rhs.contactDetails))))&&((this.rejection == rhs.rejection)||((this.rejection!= null)&&this.rejection.equals(rhs.rejection))))&&((this.offer == rhs.offer)||((this.offer!= null)&&this.offer.equals(rhs.offer))))&&((this.qualification == rhs.qualification)||((this.qualification!= null)&&this.qualification.equals(rhs.qualification))))&&((this.candidate == rhs.candidate)||((this.candidate!= null)&&this.candidate.equals(rhs.candidate))))&&((this.safeguardingIssuesStatus == rhs.safeguardingIssuesStatus)||((this.safeguardingIssuesStatus!= null)&&this.safeguardingIssuesStatus.equals(rhs.safeguardingIssuesStatus))))&&((this.course == rhs.course)||((this.course!= null)&&this.course.equals(rhs.course))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
