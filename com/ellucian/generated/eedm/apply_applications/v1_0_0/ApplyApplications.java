
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Apply Applications
 * <p>
 * An application for admission to an institute of higher learning.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "name",
    "demographics",
    "emails",
    "phones",
    "addresses",
    "enrollment",
    "citizenship",
    "military",
    "secondarySchools",
    "previousInstitutions",
    "parentsAndLegalGuardians",
    "residencyType",
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
    "withdrawReason",
    "withdrawDate",
    "careerGoals",
    "decisionFactors",
    "source",
    "additionalData",
    "possibleFraud",
    "person",
    "submittedOn"
})
@Generated("jsonschema2pojo")
public class ApplyApplications {

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
     * The global identifier of the Apply application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Apply application.")
    private String id;
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
     * The applicant's demographic information
     * 
     */
    @JsonProperty("demographics")
    @JsonPropertyDescription("The applicant's demographic information")
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
     * The applicant's enrollment information
     * 
     */
    @JsonProperty("enrollment")
    @JsonPropertyDescription("The applicant's enrollment information")
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
     * Secondary Schools
     * <p>
     * The secondary schools attended by the applicant
     * 
     */
    @JsonProperty("secondarySchools")
    @JsonPropertyDescription("The secondary schools attended by the applicant")
    private List<SecondarySchool> secondarySchools = new ArrayList<SecondarySchool>();
    /**
     * Previous Post-secondary Institutions
     * <p>
     * Post-secondary institutions that the applicant previously attended.
     * 
     */
    @JsonProperty("previousInstitutions")
    @JsonPropertyDescription("Post-secondary institutions that the applicant previously attended.")
    private List<PreviousInstitution> previousInstitutions = new ArrayList<PreviousInstitution>();
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
     * Residency Type
     * <p>
     * The applicant's residency type.
     * 
     */
    @JsonProperty("residencyType")
    @JsonPropertyDescription("The applicant's residency type.")
    private Object residencyType;
    /**
     * Legacy Status
     * <p>
     * The applicant's legacy status
     * 
     */
    @JsonProperty("legacyStatus")
    @JsonPropertyDescription("The applicant's legacy status")
    private Object legacyStatus;
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
    private List<Interest> interests = new ArrayList<Interest>();
    /**
     * Disability Types
     * <p>
     * Disability types or medical information
     * 
     */
    @JsonProperty("disabilityTypes")
    @JsonPropertyDescription("Disability types or medical information")
    private List<DisabilityType> disabilityTypes = new ArrayList<DisabilityType>();
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
     * Withdraw Reason
     * <p>
     * The reason the applicant previously withdrew their application.
     * 
     */
    @JsonProperty("withdrawReason")
    @JsonPropertyDescription("The reason the applicant previously withdrew their application.")
    private String withdrawReason;
    /**
     * Withdraw Date
     * <p>
     * The date that the applicant withdrew their application.
     * 
     */
    @JsonProperty("withdrawDate")
    @JsonPropertyDescription("The date that the applicant withdrew their application.")
    private String withdrawDate;
    /**
     * Career Goals
     * <p>
     * The applicant's career goals
     * 
     */
    @JsonProperty("careerGoals")
    @JsonPropertyDescription("The applicant's career goals")
    private List<CareerGoal> careerGoals = new ArrayList<CareerGoal>();
    /**
     * Decision Factors
     * <p>
     * The factors influencing the applicant's decision.
     * 
     */
    @JsonProperty("decisionFactors")
    @JsonPropertyDescription("The factors influencing the applicant's decision.")
    private List<DecisionFactor> decisionFactors = new ArrayList<DecisionFactor>();
    /**
     * Source
     * <p>
     * The source of the application.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the application.")
    private Object source;
    /**
     * Additional Data
     * <p>
     * Additional data (i.e. custom questions)
     * 
     */
    @JsonProperty("additionalData")
    @JsonPropertyDescription("Additional data (i.e. custom questions)")
    private List<AdditionalDatum> additionalData = new ArrayList<AdditionalDatum>();
    /**
     * Possible Fraud
     * <p>
     * Flag indicating that application may be fraudulent.
     * 
     */
    @JsonProperty("possibleFraud")
    @JsonPropertyDescription("Flag indicating that application may be fraudulent.")
    private Object possibleFraud;
    /**
     * Person
     * <p>
     * The associated Ethos Person
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The associated Ethos Person")
    private Object person;
    /**
     * Submitted On
     * <p>
     * The date on which the prospective student submitted the application.
     * 
     */
    @JsonProperty("submittedOn")
    @JsonPropertyDescription("The date on which the prospective student submitted the application.")
    private Object submittedOn;

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

    public ApplyApplications withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Apply application.
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
     * The global identifier of the Apply application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApplyApplications withId(String id) {
        this.id = id;
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

    public ApplyApplications withName(Name name) {
        this.name = name;
        return this;
    }

    /**
     * Demographics
     * <p>
     * The applicant's demographic information
     * 
     */
    @JsonProperty("demographics")
    public Demographics getDemographics() {
        return demographics;
    }

    /**
     * Demographics
     * <p>
     * The applicant's demographic information
     * 
     */
    @JsonProperty("demographics")
    public void setDemographics(Demographics demographics) {
        this.demographics = demographics;
    }

    public ApplyApplications withDemographics(Demographics demographics) {
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

    public ApplyApplications withEmails(List<Email> emails) {
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

    public ApplyApplications withPhones(List<Phone> phones) {
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

    public ApplyApplications withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Enrollment
     * <p>
     * The applicant's enrollment information
     * 
     */
    @JsonProperty("enrollment")
    public Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     * Enrollment
     * <p>
     * The applicant's enrollment information
     * 
     */
    @JsonProperty("enrollment")
    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public ApplyApplications withEnrollment(Enrollment enrollment) {
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

    public ApplyApplications withCitizenship(Citizenship citizenship) {
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

    public ApplyApplications withMilitary(Military military) {
        this.military = military;
        return this;
    }

    /**
     * Secondary Schools
     * <p>
     * The secondary schools attended by the applicant
     * 
     */
    @JsonProperty("secondarySchools")
    public List<SecondarySchool> getSecondarySchools() {
        return secondarySchools;
    }

    /**
     * Secondary Schools
     * <p>
     * The secondary schools attended by the applicant
     * 
     */
    @JsonProperty("secondarySchools")
    public void setSecondarySchools(List<SecondarySchool> secondarySchools) {
        this.secondarySchools = secondarySchools;
    }

    public ApplyApplications withSecondarySchools(List<SecondarySchool> secondarySchools) {
        this.secondarySchools = secondarySchools;
        return this;
    }

    /**
     * Previous Post-secondary Institutions
     * <p>
     * Post-secondary institutions that the applicant previously attended.
     * 
     */
    @JsonProperty("previousInstitutions")
    public List<PreviousInstitution> getPreviousInstitutions() {
        return previousInstitutions;
    }

    /**
     * Previous Post-secondary Institutions
     * <p>
     * Post-secondary institutions that the applicant previously attended.
     * 
     */
    @JsonProperty("previousInstitutions")
    public void setPreviousInstitutions(List<PreviousInstitution> previousInstitutions) {
        this.previousInstitutions = previousInstitutions;
    }

    public ApplyApplications withPreviousInstitutions(List<PreviousInstitution> previousInstitutions) {
        this.previousInstitutions = previousInstitutions;
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

    public ApplyApplications withParentsAndLegalGuardians(List<ParentsAndLegalGuardian> parentsAndLegalGuardians) {
        this.parentsAndLegalGuardians = parentsAndLegalGuardians;
        return this;
    }

    /**
     * Residency Type
     * <p>
     * The applicant's residency type.
     * 
     */
    @JsonProperty("residencyType")
    public Object getResidencyType() {
        return residencyType;
    }

    /**
     * Residency Type
     * <p>
     * The applicant's residency type.
     * 
     */
    @JsonProperty("residencyType")
    public void setResidencyType(Object residencyType) {
        this.residencyType = residencyType;
    }

    public ApplyApplications withResidencyType(Object residencyType) {
        this.residencyType = residencyType;
        return this;
    }

    /**
     * Legacy Status
     * <p>
     * The applicant's legacy status
     * 
     */
    @JsonProperty("legacyStatus")
    public Object getLegacyStatus() {
        return legacyStatus;
    }

    /**
     * Legacy Status
     * <p>
     * The applicant's legacy status
     * 
     */
    @JsonProperty("legacyStatus")
    public void setLegacyStatus(Object legacyStatus) {
        this.legacyStatus = legacyStatus;
    }

    public ApplyApplications withLegacyStatus(Object legacyStatus) {
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

    public ApplyApplications withCredentials(List<Credential> credentials) {
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

    public ApplyApplications withFinancialAid(Boolean financialAid) {
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

    public ApplyApplications withCampusHousing(Boolean campusHousing) {
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

    public ApplyApplications withFirstGenerationApplicant(Boolean firstGenerationApplicant) {
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

    public ApplyApplications withPreviouslyAttended(Boolean previouslyAttended) {
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
    public List<Interest> getInterests() {
        return interests;
    }

    /**
     * Interests
     * <p>
     * An applicant's interests.
     * 
     */
    @JsonProperty("interests")
    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    public ApplyApplications withInterests(List<Interest> interests) {
        this.interests = interests;
        return this;
    }

    /**
     * Disability Types
     * <p>
     * Disability types or medical information
     * 
     */
    @JsonProperty("disabilityTypes")
    public List<DisabilityType> getDisabilityTypes() {
        return disabilityTypes;
    }

    /**
     * Disability Types
     * <p>
     * Disability types or medical information
     * 
     */
    @JsonProperty("disabilityTypes")
    public void setDisabilityTypes(List<DisabilityType> disabilityTypes) {
        this.disabilityTypes = disabilityTypes;
    }

    public ApplyApplications withDisabilityTypes(List<DisabilityType> disabilityTypes) {
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

    public ApplyApplications withFelony(Boolean felony) {
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

    public ApplyApplications withDisciplinaryAction(Boolean disciplinaryAction) {
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

    public ApplyApplications withEmergencyContacts(List<EmergencyContact> emergencyContacts) {
        this.emergencyContacts = emergencyContacts;
        return this;
    }

    /**
     * Withdraw Reason
     * <p>
     * The reason the applicant previously withdrew their application.
     * 
     */
    @JsonProperty("withdrawReason")
    public String getWithdrawReason() {
        return withdrawReason;
    }

    /**
     * Withdraw Reason
     * <p>
     * The reason the applicant previously withdrew their application.
     * 
     */
    @JsonProperty("withdrawReason")
    public void setWithdrawReason(String withdrawReason) {
        this.withdrawReason = withdrawReason;
    }

    public ApplyApplications withWithdrawReason(String withdrawReason) {
        this.withdrawReason = withdrawReason;
        return this;
    }

    /**
     * Withdraw Date
     * <p>
     * The date that the applicant withdrew their application.
     * 
     */
    @JsonProperty("withdrawDate")
    public String getWithdrawDate() {
        return withdrawDate;
    }

    /**
     * Withdraw Date
     * <p>
     * The date that the applicant withdrew their application.
     * 
     */
    @JsonProperty("withdrawDate")
    public void setWithdrawDate(String withdrawDate) {
        this.withdrawDate = withdrawDate;
    }

    public ApplyApplications withWithdrawDate(String withdrawDate) {
        this.withdrawDate = withdrawDate;
        return this;
    }

    /**
     * Career Goals
     * <p>
     * The applicant's career goals
     * 
     */
    @JsonProperty("careerGoals")
    public List<CareerGoal> getCareerGoals() {
        return careerGoals;
    }

    /**
     * Career Goals
     * <p>
     * The applicant's career goals
     * 
     */
    @JsonProperty("careerGoals")
    public void setCareerGoals(List<CareerGoal> careerGoals) {
        this.careerGoals = careerGoals;
    }

    public ApplyApplications withCareerGoals(List<CareerGoal> careerGoals) {
        this.careerGoals = careerGoals;
        return this;
    }

    /**
     * Decision Factors
     * <p>
     * The factors influencing the applicant's decision.
     * 
     */
    @JsonProperty("decisionFactors")
    public List<DecisionFactor> getDecisionFactors() {
        return decisionFactors;
    }

    /**
     * Decision Factors
     * <p>
     * The factors influencing the applicant's decision.
     * 
     */
    @JsonProperty("decisionFactors")
    public void setDecisionFactors(List<DecisionFactor> decisionFactors) {
        this.decisionFactors = decisionFactors;
    }

    public ApplyApplications withDecisionFactors(List<DecisionFactor> decisionFactors) {
        this.decisionFactors = decisionFactors;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the application.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the application.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ApplyApplications withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Additional Data
     * <p>
     * Additional data (i.e. custom questions)
     * 
     */
    @JsonProperty("additionalData")
    public List<AdditionalDatum> getAdditionalData() {
        return additionalData;
    }

    /**
     * Additional Data
     * <p>
     * Additional data (i.e. custom questions)
     * 
     */
    @JsonProperty("additionalData")
    public void setAdditionalData(List<AdditionalDatum> additionalData) {
        this.additionalData = additionalData;
    }

    public ApplyApplications withAdditionalData(List<AdditionalDatum> additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    /**
     * Possible Fraud
     * <p>
     * Flag indicating that application may be fraudulent.
     * 
     */
    @JsonProperty("possibleFraud")
    public Object getPossibleFraud() {
        return possibleFraud;
    }

    /**
     * Possible Fraud
     * <p>
     * Flag indicating that application may be fraudulent.
     * 
     */
    @JsonProperty("possibleFraud")
    public void setPossibleFraud(Object possibleFraud) {
        this.possibleFraud = possibleFraud;
    }

    public ApplyApplications withPossibleFraud(Object possibleFraud) {
        this.possibleFraud = possibleFraud;
        return this;
    }

    /**
     * Person
     * <p>
     * The associated Ethos Person
     * 
     */
    @JsonProperty("person")
    public Object getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The associated Ethos Person
     * 
     */
    @JsonProperty("person")
    public void setPerson(Object person) {
        this.person = person;
    }

    public ApplyApplications withPerson(Object person) {
        this.person = person;
        return this;
    }

    /**
     * Submitted On
     * <p>
     * The date on which the prospective student submitted the application.
     * 
     */
    @JsonProperty("submittedOn")
    public Object getSubmittedOn() {
        return submittedOn;
    }

    /**
     * Submitted On
     * <p>
     * The date on which the prospective student submitted the application.
     * 
     */
    @JsonProperty("submittedOn")
    public void setSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
    }

    public ApplyApplications withSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplyApplications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        sb.append("secondarySchools");
        sb.append('=');
        sb.append(((this.secondarySchools == null)?"<null>":this.secondarySchools));
        sb.append(',');
        sb.append("previousInstitutions");
        sb.append('=');
        sb.append(((this.previousInstitutions == null)?"<null>":this.previousInstitutions));
        sb.append(',');
        sb.append("parentsAndLegalGuardians");
        sb.append('=');
        sb.append(((this.parentsAndLegalGuardians == null)?"<null>":this.parentsAndLegalGuardians));
        sb.append(',');
        sb.append("residencyType");
        sb.append('=');
        sb.append(((this.residencyType == null)?"<null>":this.residencyType));
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
        sb.append("withdrawReason");
        sb.append('=');
        sb.append(((this.withdrawReason == null)?"<null>":this.withdrawReason));
        sb.append(',');
        sb.append("withdrawDate");
        sb.append('=');
        sb.append(((this.withdrawDate == null)?"<null>":this.withdrawDate));
        sb.append(',');
        sb.append("careerGoals");
        sb.append('=');
        sb.append(((this.careerGoals == null)?"<null>":this.careerGoals));
        sb.append(',');
        sb.append("decisionFactors");
        sb.append('=');
        sb.append(((this.decisionFactors == null)?"<null>":this.decisionFactors));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("additionalData");
        sb.append('=');
        sb.append(((this.additionalData == null)?"<null>":this.additionalData));
        sb.append(',');
        sb.append("possibleFraud");
        sb.append('=');
        sb.append(((this.possibleFraud == null)?"<null>":this.possibleFraud));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("submittedOn");
        sb.append('=');
        sb.append(((this.submittedOn == null)?"<null>":this.submittedOn));
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
        result = ((result* 31)+((this.firstGenerationApplicant == null)? 0 :this.firstGenerationApplicant.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.campusHousing == null)? 0 :this.campusHousing.hashCode()));
        result = ((result* 31)+((this.withdrawReason == null)? 0 :this.withdrawReason.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.emergencyContacts == null)? 0 :this.emergencyContacts.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.emails == null)? 0 :this.emails.hashCode()));
        result = ((result* 31)+((this.possibleFraud == null)? 0 :this.possibleFraud.hashCode()));
        result = ((result* 31)+((this.disabilityTypes == null)? 0 :this.disabilityTypes.hashCode()));
        result = ((result* 31)+((this.military == null)? 0 :this.military.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.parentsAndLegalGuardians == null)? 0 :this.parentsAndLegalGuardians.hashCode()));
        result = ((result* 31)+((this.additionalData == null)? 0 :this.additionalData.hashCode()));
        result = ((result* 31)+((this.previousInstitutions == null)? 0 :this.previousInstitutions.hashCode()));
        result = ((result* 31)+((this.felony == null)? 0 :this.felony.hashCode()));
        result = ((result* 31)+((this.financialAid == null)? 0 :this.financialAid.hashCode()));
        result = ((result* 31)+((this.decisionFactors == null)? 0 :this.decisionFactors.hashCode()));
        result = ((result* 31)+((this.legacyStatus == null)? 0 :this.legacyStatus.hashCode()));
        result = ((result* 31)+((this.citizenship == null)? 0 :this.citizenship.hashCode()));
        result = ((result* 31)+((this.submittedOn == null)? 0 :this.submittedOn.hashCode()));
        result = ((result* 31)+((this.careerGoals == null)? 0 :this.careerGoals.hashCode()));
        result = ((result* 31)+((this.enrollment == null)? 0 :this.enrollment.hashCode()));
        result = ((result* 31)+((this.disciplinaryAction == null)? 0 :this.disciplinaryAction.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.previouslyAttended == null)? 0 :this.previouslyAttended.hashCode()));
        result = ((result* 31)+((this.interests == null)? 0 :this.interests.hashCode()));
        result = ((result* 31)+((this.withdrawDate == null)? 0 :this.withdrawDate.hashCode()));
        result = ((result* 31)+((this.secondarySchools == null)? 0 :this.secondarySchools.hashCode()));
        result = ((result* 31)+((this.demographics == null)? 0 :this.demographics.hashCode()));
        result = ((result* 31)+((this.residencyType == null)? 0 :this.residencyType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplyApplications) == false) {
            return false;
        }
        ApplyApplications rhs = ((ApplyApplications) other);
        return (((((((((((((((((((((((((((((((((((this.firstGenerationApplicant == rhs.firstGenerationApplicant)||((this.firstGenerationApplicant!= null)&&this.firstGenerationApplicant.equals(rhs.firstGenerationApplicant)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.campusHousing == rhs.campusHousing)||((this.campusHousing!= null)&&this.campusHousing.equals(rhs.campusHousing))))&&((this.withdrawReason == rhs.withdrawReason)||((this.withdrawReason!= null)&&this.withdrawReason.equals(rhs.withdrawReason))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.emergencyContacts == rhs.emergencyContacts)||((this.emergencyContacts!= null)&&this.emergencyContacts.equals(rhs.emergencyContacts))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails))))&&((this.possibleFraud == rhs.possibleFraud)||((this.possibleFraud!= null)&&this.possibleFraud.equals(rhs.possibleFraud))))&&((this.disabilityTypes == rhs.disabilityTypes)||((this.disabilityTypes!= null)&&this.disabilityTypes.equals(rhs.disabilityTypes))))&&((this.military == rhs.military)||((this.military!= null)&&this.military.equals(rhs.military))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.parentsAndLegalGuardians == rhs.parentsAndLegalGuardians)||((this.parentsAndLegalGuardians!= null)&&this.parentsAndLegalGuardians.equals(rhs.parentsAndLegalGuardians))))&&((this.additionalData == rhs.additionalData)||((this.additionalData!= null)&&this.additionalData.equals(rhs.additionalData))))&&((this.previousInstitutions == rhs.previousInstitutions)||((this.previousInstitutions!= null)&&this.previousInstitutions.equals(rhs.previousInstitutions))))&&((this.felony == rhs.felony)||((this.felony!= null)&&this.felony.equals(rhs.felony))))&&((this.financialAid == rhs.financialAid)||((this.financialAid!= null)&&this.financialAid.equals(rhs.financialAid))))&&((this.decisionFactors == rhs.decisionFactors)||((this.decisionFactors!= null)&&this.decisionFactors.equals(rhs.decisionFactors))))&&((this.legacyStatus == rhs.legacyStatus)||((this.legacyStatus!= null)&&this.legacyStatus.equals(rhs.legacyStatus))))&&((this.citizenship == rhs.citizenship)||((this.citizenship!= null)&&this.citizenship.equals(rhs.citizenship))))&&((this.submittedOn == rhs.submittedOn)||((this.submittedOn!= null)&&this.submittedOn.equals(rhs.submittedOn))))&&((this.careerGoals == rhs.careerGoals)||((this.careerGoals!= null)&&this.careerGoals.equals(rhs.careerGoals))))&&((this.enrollment == rhs.enrollment)||((this.enrollment!= null)&&this.enrollment.equals(rhs.enrollment))))&&((this.disciplinaryAction == rhs.disciplinaryAction)||((this.disciplinaryAction!= null)&&this.disciplinaryAction.equals(rhs.disciplinaryAction))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.previouslyAttended == rhs.previouslyAttended)||((this.previouslyAttended!= null)&&this.previouslyAttended.equals(rhs.previouslyAttended))))&&((this.interests == rhs.interests)||((this.interests!= null)&&this.interests.equals(rhs.interests))))&&((this.withdrawDate == rhs.withdrawDate)||((this.withdrawDate!= null)&&this.withdrawDate.equals(rhs.withdrawDate))))&&((this.secondarySchools == rhs.secondarySchools)||((this.secondarySchools!= null)&&this.secondarySchools.equals(rhs.secondarySchools))))&&((this.demographics == rhs.demographics)||((this.demographics!= null)&&this.demographics.equals(rhs.demographics))))&&((this.residencyType == rhs.residencyType)||((this.residencyType!= null)&&this.residencyType.equals(rhs.residencyType))));
    }

}
