
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * External Admissions Application Submission Process
 * <p>
 * The submission of external admissions applications.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "applicationId",
    "cccId",
    "collegeId",
    "name",
    "demographics",
    "emails",
    "phones",
    "addresses",
    "enrollment",
    "citizenship",
    "military",
    "highSchoolInformation",
    "collegeInformation",
    "parentsAndLegalGuardians",
    "residency",
    "legacyStatus",
    "credentials",
    "financialAid",
    "campusHousing",
    "firstGenerationApplicant",
    "previouslyAttended",
    "interests",
    "disabilityTypes",
    "felony",
    "disciplinaryAction",
    "emergencyContacts",
    "careerGoals",
    "decisionFactors",
    "needsAndInterests",
    "submissionInformation",
    "source",
    "type",
    "additionalData",
    "domainListing"
})
@Generated("jsonschema2pojo")
public class ExternalAdmissionsApplicationSubmissionProcess {

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
     * Application Id
     * <p>
     * The unique identifier for a single application.
     * 
     */
    @JsonProperty("applicationId")
    @JsonPropertyDescription("The unique identifier for a single application.")
    private String applicationId;
    /**
     * California Community College Id
     * <p>
     * The unique identifier for a single user’s account.
     * 
     */
    @JsonProperty("cccId")
    @JsonPropertyDescription("The unique identifier for a single user\u2019s account.")
    private String cccId;
    /**
     * College Id
     * <p>
     * The system’s identifier for a particular California Community College.
     * 
     */
    @JsonProperty("collegeId")
    @JsonPropertyDescription("The system\u2019s identifier for a particular California Community College.")
    private String collegeId;
    /**
     * Name
     * <p>
     * The applicant's name information
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The applicant's name information")
    private Name name;
    /**
     * Demographics
     * <p>
     * The applicant's demographic information.
     * 
     */
    @JsonProperty("demographics")
    @JsonPropertyDescription("The applicant's demographic information.")
    private Demographics demographics;
    /**
     * Email
     * <p>
     * The email addresses at which an applicant can be contacted.
     * (Required)
     * 
     */
    @JsonProperty("emails")
    @JsonPropertyDescription("The email addresses at which an applicant can be contacted.")
    private List<Email> emails = new ArrayList<Email>();
    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which an applicant can be contacted.
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phones and phone-connected devices at which an applicant can be contacted.")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Address
     * <p>
     * The physical addresses where an applicant resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The physical addresses where an applicant resides or may be contacted by mail.")
    private List<Address> addresses = new ArrayList<Address>();
    /**
     * Enrollment
     * <p>
     * The applicant's enrollment information.
     * 
     */
    @JsonProperty("enrollment")
    @JsonPropertyDescription("The applicant's enrollment information.")
    private Enrollment enrollment;
    /**
     * Citizenship
     * <p>
     * The applicant's citizenship information
     * 
     */
    @JsonProperty("citizenship")
    @JsonPropertyDescription("The applicant's citizenship information")
    private Citizenship citizenship;
    /**
     * Military
     * <p>
     * Military service information.
     * 
     */
    @JsonProperty("military")
    @JsonPropertyDescription("Military service information.")
    private Military military;
    /**
     * High School Information
     * <p>
     * Applicant's high school realted information.
     * 
     */
    @JsonProperty("highSchoolInformation")
    @JsonPropertyDescription("Applicant's high school realted information.")
    private HighSchoolInformation highSchoolInformation;
    /**
     * College Information
     * <p>
     * Applicant's college related information.
     * 
     */
    @JsonProperty("collegeInformation")
    @JsonPropertyDescription("Applicant's college related information.")
    private List<CollegeInformation> collegeInformation = new ArrayList<CollegeInformation>();
    /**
     * Parents and Legal Guardians
     * <p>
     * The applicant's parents or legal guardians.
     * 
     */
    @JsonProperty("parentsAndLegalGuardians")
    @JsonPropertyDescription("The applicant's parents or legal guardians.")
    private List<ParentsAndLegalGuardian> parentsAndLegalGuardians = new ArrayList<ParentsAndLegalGuardian>();
    /**
     * Residency
     * <p>
     * The applicant's residency.
     * 
     */
    @JsonProperty("residency")
    @JsonPropertyDescription("The applicant's residency.")
    private Residency residency;
    /**
     * Legacy Status
     * <p>
     * The applicant's legacy status.
     * 
     */
    @JsonProperty("legacyStatus")
    @JsonPropertyDescription("The applicant's legacy status.")
    private String legacyStatus;
    /**
     * Credentials
     * <p>
     * Personal identifiers
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("Personal identifiers")
    private List<Credential> credentials = new ArrayList<Credential>();
    /**
     * Financial Aid
     * <p>
     * Indicates whether applicant intends to apply for financial aid.
     * 
     */
    @JsonProperty("financialAid")
    @JsonPropertyDescription("Indicates whether applicant intends to apply for financial aid.")
    private Boolean financialAid;
    /**
     * Campus Housing
     * <p>
     * Indicates whether applicant is interested in campus housing.
     * 
     */
    @JsonProperty("campusHousing")
    @JsonPropertyDescription("Indicates whether applicant is interested in campus housing.")
    private Boolean campusHousing;
    /**
     * First Generation Applicant
     * <p>
     * Indicates whether applicant is a first generation applicant.
     * 
     */
    @JsonProperty("firstGenerationApplicant")
    @JsonPropertyDescription("Indicates whether applicant is a first generation applicant.")
    private Boolean firstGenerationApplicant;
    /**
     * Previously Attended
     * <p>
     * Indicates whether applicant has previously attended the institution
     * 
     */
    @JsonProperty("previouslyAttended")
    @JsonPropertyDescription("Indicates whether applicant has previously attended the institution")
    private Boolean previouslyAttended;
    /**
     * Interests
     * <p>
     * An applicant's interests.
     * 
     */
    @JsonProperty("interests")
    @JsonPropertyDescription("An applicant's interests.")
    private List<String> interests = new ArrayList<String>();
    /**
     * Disability Types
     * <p>
     * Disability types or medical information.’
     * 
     */
    @JsonProperty("disabilityTypes")
    @JsonPropertyDescription("Disability types or medical information.\u2019")
    private List<String> disabilityTypes = new ArrayList<String>();
    /**
     * Felony
     * <p>
     * Has applicant been convicted of a felony
     * 
     */
    @JsonProperty("felony")
    @JsonPropertyDescription("Has applicant been convicted of a felony")
    private Boolean felony;
    /**
     * Disciplinary Action
     * <p>
     * Indicates is applicant has been the subject of disciplinary action at a previous institution.
     * 
     */
    @JsonProperty("disciplinaryAction")
    @JsonPropertyDescription("Indicates is applicant has been the subject of disciplinary action at a previous institution.")
    private Boolean disciplinaryAction;
    /**
     * Emergency Contacts
     * <p>
     * The applicant's emergency contacts
     * 
     */
    @JsonProperty("emergencyContacts")
    @JsonPropertyDescription("The applicant's emergency contacts")
    private List<EmergencyContact> emergencyContacts = new ArrayList<EmergencyContact>();
    /**
     * Career Goals
     * <p>
     * The applicant's career goals.’
     * 
     */
    @JsonProperty("careerGoals")
    @JsonPropertyDescription("The applicant's career goals.\u2019")
    private List<String> careerGoals = new ArrayList<String>();
    /**
     * Decision Factors
     * <p>
     * The factors influencing the applicant's decision.’
     * 
     */
    @JsonProperty("decisionFactors")
    @JsonPropertyDescription("The factors influencing the applicant's decision.\u2019")
    private List<String> decisionFactors = new ArrayList<String>();
    /**
     * Needs and Interests
     * <p>
     * Applicant's needs and interests.
     * 
     */
    @JsonProperty("needsAndInterests")
    @JsonPropertyDescription("Applicant's needs and interests.")
    private NeedsAndInterests needsAndInterests;
    /**
     * Submission Information
     * <p>
     * Application submission information.
     * 
     */
    @JsonProperty("submissionInformation")
    @JsonPropertyDescription("Application submission information.")
    private SubmissionInformation submissionInformation;
    /**
     * Application Source
     * <p>
     * Indicates the origin of the application.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Indicates the origin of the application.")
    private String source;
    /**
     * Application Type
     * <p>
     * Indicates the type of application like CCCApply, Apply etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicates the type of application like CCCApply, Apply etc.")
    private String type;
    /**
     * Additional Data
     * <p>
     * Additional data that can be used for reporting, including custom fields.
     * 
     */
    @JsonProperty("additionalData")
    @JsonPropertyDescription("Additional data that can be used for reporting, including custom fields.")
    private String additionalData;
    /**
     * Domain Listing
     * <p>
     * Indicates if the application is suspected to be fraudulent
     * 
     */
    @JsonProperty("domainListing")
    @JsonPropertyDescription("Indicates if the application is suspected to be fraudulent")
    private ExternalAdmissionsApplicationSubmissionProcess.DomainListing domainListing;

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

    public ExternalAdmissionsApplicationSubmissionProcess withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Application Id
     * <p>
     * The unique identifier for a single application.
     * 
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Application Id
     * <p>
     * The unique identifier for a single application.
     * 
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * California Community College Id
     * <p>
     * The unique identifier for a single user’s account.
     * 
     */
    @JsonProperty("cccId")
    public String getCccId() {
        return cccId;
    }

    /**
     * California Community College Id
     * <p>
     * The unique identifier for a single user’s account.
     * 
     */
    @JsonProperty("cccId")
    public void setCccId(String cccId) {
        this.cccId = cccId;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withCccId(String cccId) {
        this.cccId = cccId;
        return this;
    }

    /**
     * College Id
     * <p>
     * The system’s identifier for a particular California Community College.
     * 
     */
    @JsonProperty("collegeId")
    public String getCollegeId() {
        return collegeId;
    }

    /**
     * College Id
     * <p>
     * The system’s identifier for a particular California Community College.
     * 
     */
    @JsonProperty("collegeId")
    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withCollegeId(String collegeId) {
        this.collegeId = collegeId;
        return this;
    }

    /**
     * Name
     * <p>
     * The applicant's name information
     * (Required)
     * 
     */
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The applicant's name information
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withName(Name name) {
        this.name = name;
        return this;
    }

    /**
     * Demographics
     * <p>
     * The applicant's demographic information.
     * 
     */
    @JsonProperty("demographics")
    public Demographics getDemographics() {
        return demographics;
    }

    /**
     * Demographics
     * <p>
     * The applicant's demographic information.
     * 
     */
    @JsonProperty("demographics")
    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withDemographics(Demographics demographics) {
        this.demographics = demographics;
        return this;
    }

    /**
     * Email
     * <p>
     * The email addresses at which an applicant can be contacted.
     * (Required)
     * 
     */
    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * Email
     * <p>
     * The email addresses at which an applicant can be contacted.
     * (Required)
     * 
     */
    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withEmails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which an applicant can be contacted.
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which an applicant can be contacted.
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Address
     * <p>
     * The physical addresses where an applicant resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Address
     * <p>
     * The physical addresses where an applicant resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Enrollment
     * <p>
     * The applicant's enrollment information.
     * 
     */
    @JsonProperty("enrollment")
    public Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     * Enrollment
     * <p>
     * The applicant's enrollment information.
     * 
     */
    @JsonProperty("enrollment")
    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
        return this;
    }

    /**
     * Citizenship
     * <p>
     * The applicant's citizenship information
     * 
     */
    @JsonProperty("citizenship")
    public Citizenship getCitizenship() {
        return citizenship;
    }

    /**
     * Citizenship
     * <p>
     * The applicant's citizenship information
     * 
     */
    @JsonProperty("citizenship")
    public void setCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
        return this;
    }

    /**
     * Military
     * <p>
     * Military service information.
     * 
     */
    @JsonProperty("military")
    public Military getMilitary() {
        return military;
    }

    /**
     * Military
     * <p>
     * Military service information.
     * 
     */
    @JsonProperty("military")
    public void setMilitary(Military military) {
        this.military = military;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withMilitary(Military military) {
        this.military = military;
        return this;
    }

    /**
     * High School Information
     * <p>
     * Applicant's high school realted information.
     * 
     */
    @JsonProperty("highSchoolInformation")
    public HighSchoolInformation getHighSchoolInformation() {
        return highSchoolInformation;
    }

    /**
     * High School Information
     * <p>
     * Applicant's high school realted information.
     * 
     */
    @JsonProperty("highSchoolInformation")
    public void setHighSchoolInformation(HighSchoolInformation highSchoolInformation) {
        this.highSchoolInformation = highSchoolInformation;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withHighSchoolInformation(HighSchoolInformation highSchoolInformation) {
        this.highSchoolInformation = highSchoolInformation;
        return this;
    }

    /**
     * College Information
     * <p>
     * Applicant's college related information.
     * 
     */
    @JsonProperty("collegeInformation")
    public List<CollegeInformation> getCollegeInformation() {
        return collegeInformation;
    }

    /**
     * College Information
     * <p>
     * Applicant's college related information.
     * 
     */
    @JsonProperty("collegeInformation")
    public void setCollegeInformation(List<CollegeInformation> collegeInformation) {
        this.collegeInformation = collegeInformation;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withCollegeInformation(List<CollegeInformation> collegeInformation) {
        this.collegeInformation = collegeInformation;
        return this;
    }

    /**
     * Parents and Legal Guardians
     * <p>
     * The applicant's parents or legal guardians.
     * 
     */
    @JsonProperty("parentsAndLegalGuardians")
    public List<ParentsAndLegalGuardian> getParentsAndLegalGuardians() {
        return parentsAndLegalGuardians;
    }

    /**
     * Parents and Legal Guardians
     * <p>
     * The applicant's parents or legal guardians.
     * 
     */
    @JsonProperty("parentsAndLegalGuardians")
    public void setParentsAndLegalGuardians(List<ParentsAndLegalGuardian> parentsAndLegalGuardians) {
        this.parentsAndLegalGuardians = parentsAndLegalGuardians;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withParentsAndLegalGuardians(List<ParentsAndLegalGuardian> parentsAndLegalGuardians) {
        this.parentsAndLegalGuardians = parentsAndLegalGuardians;
        return this;
    }

    /**
     * Residency
     * <p>
     * The applicant's residency.
     * 
     */
    @JsonProperty("residency")
    public Residency getResidency() {
        return residency;
    }

    /**
     * Residency
     * <p>
     * The applicant's residency.
     * 
     */
    @JsonProperty("residency")
    public void setResidency(Residency residency) {
        this.residency = residency;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withResidency(Residency residency) {
        this.residency = residency;
        return this;
    }

    /**
     * Legacy Status
     * <p>
     * The applicant's legacy status.
     * 
     */
    @JsonProperty("legacyStatus")
    public String getLegacyStatus() {
        return legacyStatus;
    }

    /**
     * Legacy Status
     * <p>
     * The applicant's legacy status.
     * 
     */
    @JsonProperty("legacyStatus")
    public void setLegacyStatus(String legacyStatus) {
        this.legacyStatus = legacyStatus;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withLegacyStatus(String legacyStatus) {
        this.legacyStatus = legacyStatus;
        return this;
    }

    /**
     * Credentials
     * <p>
     * Personal identifiers
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * Personal identifiers
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Financial Aid
     * <p>
     * Indicates whether applicant intends to apply for financial aid.
     * 
     */
    @JsonProperty("financialAid")
    public Boolean getFinancialAid() {
        return financialAid;
    }

    /**
     * Financial Aid
     * <p>
     * Indicates whether applicant intends to apply for financial aid.
     * 
     */
    @JsonProperty("financialAid")
    public void setFinancialAid(Boolean financialAid) {
        this.financialAid = financialAid;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withFinancialAid(Boolean financialAid) {
        this.financialAid = financialAid;
        return this;
    }

    /**
     * Campus Housing
     * <p>
     * Indicates whether applicant is interested in campus housing.
     * 
     */
    @JsonProperty("campusHousing")
    public Boolean getCampusHousing() {
        return campusHousing;
    }

    /**
     * Campus Housing
     * <p>
     * Indicates whether applicant is interested in campus housing.
     * 
     */
    @JsonProperty("campusHousing")
    public void setCampusHousing(Boolean campusHousing) {
        this.campusHousing = campusHousing;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withCampusHousing(Boolean campusHousing) {
        this.campusHousing = campusHousing;
        return this;
    }

    /**
     * First Generation Applicant
     * <p>
     * Indicates whether applicant is a first generation applicant.
     * 
     */
    @JsonProperty("firstGenerationApplicant")
    public Boolean getFirstGenerationApplicant() {
        return firstGenerationApplicant;
    }

    /**
     * First Generation Applicant
     * <p>
     * Indicates whether applicant is a first generation applicant.
     * 
     */
    @JsonProperty("firstGenerationApplicant")
    public void setFirstGenerationApplicant(Boolean firstGenerationApplicant) {
        this.firstGenerationApplicant = firstGenerationApplicant;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withFirstGenerationApplicant(Boolean firstGenerationApplicant) {
        this.firstGenerationApplicant = firstGenerationApplicant;
        return this;
    }

    /**
     * Previously Attended
     * <p>
     * Indicates whether applicant has previously attended the institution
     * 
     */
    @JsonProperty("previouslyAttended")
    public Boolean getPreviouslyAttended() {
        return previouslyAttended;
    }

    /**
     * Previously Attended
     * <p>
     * Indicates whether applicant has previously attended the institution
     * 
     */
    @JsonProperty("previouslyAttended")
    public void setPreviouslyAttended(Boolean previouslyAttended) {
        this.previouslyAttended = previouslyAttended;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withPreviouslyAttended(Boolean previouslyAttended) {
        this.previouslyAttended = previouslyAttended;
        return this;
    }

    /**
     * Interests
     * <p>
     * An applicant's interests.
     * 
     */
    @JsonProperty("interests")
    public List<String> getInterests() {
        return interests;
    }

    /**
     * Interests
     * <p>
     * An applicant's interests.
     * 
     */
    @JsonProperty("interests")
    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withInterests(List<String> interests) {
        this.interests = interests;
        return this;
    }

    /**
     * Disability Types
     * <p>
     * Disability types or medical information.’
     * 
     */
    @JsonProperty("disabilityTypes")
    public List<String> getDisabilityTypes() {
        return disabilityTypes;
    }

    /**
     * Disability Types
     * <p>
     * Disability types or medical information.’
     * 
     */
    @JsonProperty("disabilityTypes")
    public void setDisabilityTypes(List<String> disabilityTypes) {
        this.disabilityTypes = disabilityTypes;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withDisabilityTypes(List<String> disabilityTypes) {
        this.disabilityTypes = disabilityTypes;
        return this;
    }

    /**
     * Felony
     * <p>
     * Has applicant been convicted of a felony
     * 
     */
    @JsonProperty("felony")
    public Boolean getFelony() {
        return felony;
    }

    /**
     * Felony
     * <p>
     * Has applicant been convicted of a felony
     * 
     */
    @JsonProperty("felony")
    public void setFelony(Boolean felony) {
        this.felony = felony;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withFelony(Boolean felony) {
        this.felony = felony;
        return this;
    }

    /**
     * Disciplinary Action
     * <p>
     * Indicates is applicant has been the subject of disciplinary action at a previous institution.
     * 
     */
    @JsonProperty("disciplinaryAction")
    public Boolean getDisciplinaryAction() {
        return disciplinaryAction;
    }

    /**
     * Disciplinary Action
     * <p>
     * Indicates is applicant has been the subject of disciplinary action at a previous institution.
     * 
     */
    @JsonProperty("disciplinaryAction")
    public void setDisciplinaryAction(Boolean disciplinaryAction) {
        this.disciplinaryAction = disciplinaryAction;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withDisciplinaryAction(Boolean disciplinaryAction) {
        this.disciplinaryAction = disciplinaryAction;
        return this;
    }

    /**
     * Emergency Contacts
     * <p>
     * The applicant's emergency contacts
     * 
     */
    @JsonProperty("emergencyContacts")
    public List<EmergencyContact> getEmergencyContacts() {
        return emergencyContacts;
    }

    /**
     * Emergency Contacts
     * <p>
     * The applicant's emergency contacts
     * 
     */
    @JsonProperty("emergencyContacts")
    public void setEmergencyContacts(List<EmergencyContact> emergencyContacts) {
        this.emergencyContacts = emergencyContacts;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withEmergencyContacts(List<EmergencyContact> emergencyContacts) {
        this.emergencyContacts = emergencyContacts;
        return this;
    }

    /**
     * Career Goals
     * <p>
     * The applicant's career goals.’
     * 
     */
    @JsonProperty("careerGoals")
    public List<String> getCareerGoals() {
        return careerGoals;
    }

    /**
     * Career Goals
     * <p>
     * The applicant's career goals.’
     * 
     */
    @JsonProperty("careerGoals")
    public void setCareerGoals(List<String> careerGoals) {
        this.careerGoals = careerGoals;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withCareerGoals(List<String> careerGoals) {
        this.careerGoals = careerGoals;
        return this;
    }

    /**
     * Decision Factors
     * <p>
     * The factors influencing the applicant's decision.’
     * 
     */
    @JsonProperty("decisionFactors")
    public List<String> getDecisionFactors() {
        return decisionFactors;
    }

    /**
     * Decision Factors
     * <p>
     * The factors influencing the applicant's decision.’
     * 
     */
    @JsonProperty("decisionFactors")
    public void setDecisionFactors(List<String> decisionFactors) {
        this.decisionFactors = decisionFactors;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withDecisionFactors(List<String> decisionFactors) {
        this.decisionFactors = decisionFactors;
        return this;
    }

    /**
     * Needs and Interests
     * <p>
     * Applicant's needs and interests.
     * 
     */
    @JsonProperty("needsAndInterests")
    public NeedsAndInterests getNeedsAndInterests() {
        return needsAndInterests;
    }

    /**
     * Needs and Interests
     * <p>
     * Applicant's needs and interests.
     * 
     */
    @JsonProperty("needsAndInterests")
    public void setNeedsAndInterests(NeedsAndInterests needsAndInterests) {
        this.needsAndInterests = needsAndInterests;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withNeedsAndInterests(NeedsAndInterests needsAndInterests) {
        this.needsAndInterests = needsAndInterests;
        return this;
    }

    /**
     * Submission Information
     * <p>
     * Application submission information.
     * 
     */
    @JsonProperty("submissionInformation")
    public SubmissionInformation getSubmissionInformation() {
        return submissionInformation;
    }

    /**
     * Submission Information
     * <p>
     * Application submission information.
     * 
     */
    @JsonProperty("submissionInformation")
    public void setSubmissionInformation(SubmissionInformation submissionInformation) {
        this.submissionInformation = submissionInformation;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withSubmissionInformation(SubmissionInformation submissionInformation) {
        this.submissionInformation = submissionInformation;
        return this;
    }

    /**
     * Application Source
     * <p>
     * Indicates the origin of the application.
     * 
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * Application Source
     * <p>
     * Indicates the origin of the application.
     * 
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Application Type
     * <p>
     * Indicates the type of application like CCCApply, Apply etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Application Type
     * <p>
     * Indicates the type of application like CCCApply, Apply etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Additional Data
     * <p>
     * Additional data that can be used for reporting, including custom fields.
     * 
     */
    @JsonProperty("additionalData")
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Additional Data
     * <p>
     * Additional data that can be used for reporting, including custom fields.
     * 
     */
    @JsonProperty("additionalData")
    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withAdditionalData(String additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Domain Listing
     * <p>
     * Indicates if the application is suspected to be fraudulent
     * 
     */
    @JsonProperty("domainListing")
    public ExternalAdmissionsApplicationSubmissionProcess.DomainListing getDomainListing() {
        return domainListing;
    }

    /**
     * Domain Listing
     * <p>
     * Indicates if the application is suspected to be fraudulent
     * 
     */
    @JsonProperty("domainListing")
    public void setDomainListing(ExternalAdmissionsApplicationSubmissionProcess.DomainListing domainListing) {
        this.domainListing = domainListing;
    }

    public ExternalAdmissionsApplicationSubmissionProcess withDomainListing(ExternalAdmissionsApplicationSubmissionProcess.DomainListing domainListing) {
        this.domainListing = domainListing;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalAdmissionsApplicationSubmissionProcess.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("applicationId");
        sb.append('=');
        sb.append(((this.applicationId == null)?"<null>":this.applicationId));
        sb.append(',');
        sb.append("cccId");
        sb.append('=');
        sb.append(((this.cccId == null)?"<null>":this.cccId));
        sb.append(',');
        sb.append("collegeId");
        sb.append('=');
        sb.append(((this.collegeId == null)?"<null>":this.collegeId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("demographics");
        sb.append('=');
        sb.append(((this.demographics == null)?"<null>":this.demographics));
        sb.append(',');
        sb.append("emails");
        sb.append('=');
        sb.append(((this.emails == null)?"<null>":this.emails));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("addresses");
        sb.append('=');
        sb.append(((this.addresses == null)?"<null>":this.addresses));
        sb.append(',');
        sb.append("enrollment");
        sb.append('=');
        sb.append(((this.enrollment == null)?"<null>":this.enrollment));
        sb.append(',');
        sb.append("citizenship");
        sb.append('=');
        sb.append(((this.citizenship == null)?"<null>":this.citizenship));
        sb.append(',');
        sb.append("military");
        sb.append('=');
        sb.append(((this.military == null)?"<null>":this.military));
        sb.append(',');
        sb.append("highSchoolInformation");
        sb.append('=');
        sb.append(((this.highSchoolInformation == null)?"<null>":this.highSchoolInformation));
        sb.append(',');
        sb.append("collegeInformation");
        sb.append('=');
        sb.append(((this.collegeInformation == null)?"<null>":this.collegeInformation));
        sb.append(',');
        sb.append("parentsAndLegalGuardians");
        sb.append('=');
        sb.append(((this.parentsAndLegalGuardians == null)?"<null>":this.parentsAndLegalGuardians));
        sb.append(',');
        sb.append("residency");
        sb.append('=');
        sb.append(((this.residency == null)?"<null>":this.residency));
        sb.append(',');
        sb.append("legacyStatus");
        sb.append('=');
        sb.append(((this.legacyStatus == null)?"<null>":this.legacyStatus));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
        sb.append(',');
        sb.append("financialAid");
        sb.append('=');
        sb.append(((this.financialAid == null)?"<null>":this.financialAid));
        sb.append(',');
        sb.append("campusHousing");
        sb.append('=');
        sb.append(((this.campusHousing == null)?"<null>":this.campusHousing));
        sb.append(',');
        sb.append("firstGenerationApplicant");
        sb.append('=');
        sb.append(((this.firstGenerationApplicant == null)?"<null>":this.firstGenerationApplicant));
        sb.append(',');
        sb.append("previouslyAttended");
        sb.append('=');
        sb.append(((this.previouslyAttended == null)?"<null>":this.previouslyAttended));
        sb.append(',');
        sb.append("interests");
        sb.append('=');
        sb.append(((this.interests == null)?"<null>":this.interests));
        sb.append(',');
        sb.append("disabilityTypes");
        sb.append('=');
        sb.append(((this.disabilityTypes == null)?"<null>":this.disabilityTypes));
        sb.append(',');
        sb.append("felony");
        sb.append('=');
        sb.append(((this.felony == null)?"<null>":this.felony));
        sb.append(',');
        sb.append("disciplinaryAction");
        sb.append('=');
        sb.append(((this.disciplinaryAction == null)?"<null>":this.disciplinaryAction));
        sb.append(',');
        sb.append("emergencyContacts");
        sb.append('=');
        sb.append(((this.emergencyContacts == null)?"<null>":this.emergencyContacts));
        sb.append(',');
        sb.append("careerGoals");
        sb.append('=');
        sb.append(((this.careerGoals == null)?"<null>":this.careerGoals));
        sb.append(',');
        sb.append("decisionFactors");
        sb.append('=');
        sb.append(((this.decisionFactors == null)?"<null>":this.decisionFactors));
        sb.append(',');
        sb.append("needsAndInterests");
        sb.append('=');
        sb.append(((this.needsAndInterests == null)?"<null>":this.needsAndInterests));
        sb.append(',');
        sb.append("submissionInformation");
        sb.append('=');
        sb.append(((this.submissionInformation == null)?"<null>":this.submissionInformation));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("additionalData");
        sb.append('=');
        sb.append(((this.additionalData == null)?"<null>":this.additionalData));
        sb.append(',');
        sb.append("domainListing");
        sb.append('=');
        sb.append(((this.domainListing == null)?"<null>":this.domainListing));
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
        result = ((result* 31)+((this.residency == null)? 0 :this.residency.hashCode()));
        result = ((result* 31)+((this.firstGenerationApplicant == null)? 0 :this.firstGenerationApplicant.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.campusHousing == null)? 0 :this.campusHousing.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.emergencyContacts == null)? 0 :this.emergencyContacts.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.emails == null)? 0 :this.emails.hashCode()));
        result = ((result* 31)+((this.collegeId == null)? 0 :this.collegeId.hashCode()));
        result = ((result* 31)+((this.disabilityTypes == null)? 0 :this.disabilityTypes.hashCode()));
        result = ((result* 31)+((this.military == null)? 0 :this.military.hashCode()));
        result = ((result* 31)+((this.parentsAndLegalGuardians == null)? 0 :this.parentsAndLegalGuardians.hashCode()));
        result = ((result* 31)+((this.additionalData == null)? 0 :this.additionalData.hashCode()));
        result = ((result* 31)+((this.felony == null)? 0 :this.felony.hashCode()));
        result = ((result* 31)+((this.cccId == null)? 0 :this.cccId.hashCode()));
        result = ((result* 31)+((this.financialAid == null)? 0 :this.financialAid.hashCode()));
        result = ((result* 31)+((this.decisionFactors == null)? 0 :this.decisionFactors.hashCode()));
        result = ((result* 31)+((this.legacyStatus == null)? 0 :this.legacyStatus.hashCode()));
        result = ((result* 31)+((this.submissionInformation == null)? 0 :this.submissionInformation.hashCode()));
        result = ((result* 31)+((this.citizenship == null)? 0 :this.citizenship.hashCode()));
        result = ((result* 31)+((this.careerGoals == null)? 0 :this.careerGoals.hashCode()));
        result = ((result* 31)+((this.domainListing == null)? 0 :this.domainListing.hashCode()));
        result = ((result* 31)+((this.enrollment == null)? 0 :this.enrollment.hashCode()));
        result = ((result* 31)+((this.collegeInformation == null)? 0 :this.collegeInformation.hashCode()));
        result = ((result* 31)+((this.disciplinaryAction == null)? 0 :this.disciplinaryAction.hashCode()));
        result = ((result* 31)+((this.highSchoolInformation == null)? 0 :this.highSchoolInformation.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.previouslyAttended == null)? 0 :this.previouslyAttended.hashCode()));
        result = ((result* 31)+((this.applicationId == null)? 0 :this.applicationId.hashCode()));
        result = ((result* 31)+((this.interests == null)? 0 :this.interests.hashCode()));
        result = ((result* 31)+((this.demographics == null)? 0 :this.demographics.hashCode()));
        result = ((result* 31)+((this.needsAndInterests == null)? 0 :this.needsAndInterests.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalAdmissionsApplicationSubmissionProcess) == false) {
            return false;
        }
        ExternalAdmissionsApplicationSubmissionProcess rhs = ((ExternalAdmissionsApplicationSubmissionProcess) other);
        return ((((((((((((((((((((((((((((((((((((this.residency == rhs.residency)||((this.residency!= null)&&this.residency.equals(rhs.residency)))&&((this.firstGenerationApplicant == rhs.firstGenerationApplicant)||((this.firstGenerationApplicant!= null)&&this.firstGenerationApplicant.equals(rhs.firstGenerationApplicant))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.campusHousing == rhs.campusHousing)||((this.campusHousing!= null)&&this.campusHousing.equals(rhs.campusHousing))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.emergencyContacts == rhs.emergencyContacts)||((this.emergencyContacts!= null)&&this.emergencyContacts.equals(rhs.emergencyContacts))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails))))&&((this.collegeId == rhs.collegeId)||((this.collegeId!= null)&&this.collegeId.equals(rhs.collegeId))))&&((this.disabilityTypes == rhs.disabilityTypes)||((this.disabilityTypes!= null)&&this.disabilityTypes.equals(rhs.disabilityTypes))))&&((this.military == rhs.military)||((this.military!= null)&&this.military.equals(rhs.military))))&&((this.parentsAndLegalGuardians == rhs.parentsAndLegalGuardians)||((this.parentsAndLegalGuardians!= null)&&this.parentsAndLegalGuardians.equals(rhs.parentsAndLegalGuardians))))&&((this.additionalData == rhs.additionalData)||((this.additionalData!= null)&&this.additionalData.equals(rhs.additionalData))))&&((this.felony == rhs.felony)||((this.felony!= null)&&this.felony.equals(rhs.felony))))&&((this.cccId == rhs.cccId)||((this.cccId!= null)&&this.cccId.equals(rhs.cccId))))&&((this.financialAid == rhs.financialAid)||((this.financialAid!= null)&&this.financialAid.equals(rhs.financialAid))))&&((this.decisionFactors == rhs.decisionFactors)||((this.decisionFactors!= null)&&this.decisionFactors.equals(rhs.decisionFactors))))&&((this.legacyStatus == rhs.legacyStatus)||((this.legacyStatus!= null)&&this.legacyStatus.equals(rhs.legacyStatus))))&&((this.submissionInformation == rhs.submissionInformation)||((this.submissionInformation!= null)&&this.submissionInformation.equals(rhs.submissionInformation))))&&((this.citizenship == rhs.citizenship)||((this.citizenship!= null)&&this.citizenship.equals(rhs.citizenship))))&&((this.careerGoals == rhs.careerGoals)||((this.careerGoals!= null)&&this.careerGoals.equals(rhs.careerGoals))))&&((this.domainListing == rhs.domainListing)||((this.domainListing!= null)&&this.domainListing.equals(rhs.domainListing))))&&((this.enrollment == rhs.enrollment)||((this.enrollment!= null)&&this.enrollment.equals(rhs.enrollment))))&&((this.collegeInformation == rhs.collegeInformation)||((this.collegeInformation!= null)&&this.collegeInformation.equals(rhs.collegeInformation))))&&((this.disciplinaryAction == rhs.disciplinaryAction)||((this.disciplinaryAction!= null)&&this.disciplinaryAction.equals(rhs.disciplinaryAction))))&&((this.highSchoolInformation == rhs.highSchoolInformation)||((this.highSchoolInformation!= null)&&this.highSchoolInformation.equals(rhs.highSchoolInformation))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.previouslyAttended == rhs.previouslyAttended)||((this.previouslyAttended!= null)&&this.previouslyAttended.equals(rhs.previouslyAttended))))&&((this.applicationId == rhs.applicationId)||((this.applicationId!= null)&&this.applicationId.equals(rhs.applicationId))))&&((this.interests == rhs.interests)||((this.interests!= null)&&this.interests.equals(rhs.interests))))&&((this.demographics == rhs.demographics)||((this.demographics!= null)&&this.demographics.equals(rhs.demographics))))&&((this.needsAndInterests == rhs.needsAndInterests)||((this.needsAndInterests!= null)&&this.needsAndInterests.equals(rhs.needsAndInterests))));
    }


    /**
     * Domain Listing
     * <p>
     * Indicates if the application is suspected to be fraudulent
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DomainListing {

        APPROVED("approved"),
        DENIED("denied"),
        POTENTIAL("potential");
        private final String value;
        private final static Map<String, ExternalAdmissionsApplicationSubmissionProcess.DomainListing> CONSTANTS = new HashMap<String, ExternalAdmissionsApplicationSubmissionProcess.DomainListing>();

        static {
            for (ExternalAdmissionsApplicationSubmissionProcess.DomainListing c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DomainListing(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ExternalAdmissionsApplicationSubmissionProcess.DomainListing fromValue(String value) {
            ExternalAdmissionsApplicationSubmissionProcess.DomainListing constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
