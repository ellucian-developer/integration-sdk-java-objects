
package com.ellucian.generated.eedm.constituent_education.v1_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Education
 * <p>
 * A record of a constituent's education.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "preferences",
    "institution",
    "campus",
    "institutionalUnits",
    "academicProgram",
    "academicLevel",
    "credential",
    "disciplines",
    "startOn",
    "endOn",
    "recognitions",
    "conferralType",
    "thesisTitle",
    "degreeYear",
    "reunionYear",
    "preferredClassYear",
    "graduationStatus",
    "graduatedOn",
    "admissionStatus",
    "admissionType",
    "notes",
    "source"
})
@Generated("jsonschema2pojo")
public class ConstituentEducation {

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
     * The global identifier of the constituent education.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent education.")
    private String id;
    /**
     * Person
     * <p>
     * The person associated with the education record.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person associated with the education record.")
    private Person person;
    /**
     * Preferences
     * <p>
     * Indicates the preferences of the education over all other education for the person.
     * 
     */
    @JsonProperty("preferences")
    @JsonPropertyDescription("Indicates the preferences of the education over all other education for the person.")
    private Preferences preferences;
    /**
     * Institution
     * <p>
     * The educational institution where the person's education occurred.
     * (Required)
     * 
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("The educational institution where the person's education occurred.")
    private Institution institution;
    /**
     * Campus
     * <p>
     * The campus where the education occurred.
     * 
     */
    @JsonProperty("campus")
    @JsonPropertyDescription("The campus where the education occurred.")
    private Object campus;
    /**
     * Institutional Units
     * <p>
     * The institutional units associated with the education.
     * 
     */
    @JsonProperty("institutionalUnits")
    @JsonPropertyDescription("The institutional units associated with the education.")
    private List<InstitutionalUnit> institutionalUnits = new ArrayList<InstitutionalUnit>();
    /**
     * Academic Program
     * <p>
     * The academic program associated with the education.
     * 
     */
    @JsonProperty("academicProgram")
    @JsonPropertyDescription("The academic program associated with the education.")
    private Object academicProgram;
    /**
     * Academic Level
     * <p>
     * The academic level of the education (e.g. graduate, undergraduate).
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level of the education (e.g. graduate, undergraduate).")
    private Object academicLevel;
    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) the person was awarded at the institution.
     * 
     */
    @JsonProperty("credential")
    @JsonPropertyDescription("The academic credential (degree, diploma, etc.) the person was awarded at the institution.")
    private Object credential;
    /**
     * Disciplines
     * <p>
     * The academic disciplines associated with the person's education at the institution.
     * 
     */
    @JsonProperty("disciplines")
    @JsonPropertyDescription("The academic disciplines associated with the person's education at the institution.")
    private Disciplines disciplines;
    /**
     * Start On
     * <p>
     * The date when the person's education at the institution started.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the person's education at the institution started.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The date when the person's education at the institution ended.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the person's education at the institution ended.")
    private Object endOn;
    /**
     * Recognitions
     * <p>
     * The academic recognitions received in conjunction with the person's education at the institution.
     * 
     */
    @JsonProperty("recognitions")
    @JsonPropertyDescription("The academic recognitions received in conjunction with the person's education at the institution.")
    private List<Recognition> recognitions = new ArrayList<Recognition>();
    /**
     * Conferral Type
     * <p>
     * The conferral type associated with the degree (e.g. honorary degree).
     * 
     */
    @JsonProperty("conferralType")
    @JsonPropertyDescription("The conferral type associated with the degree (e.g. honorary degree).")
    private Object conferralType;
    /**
     * Thesis Title
     * <p>
     * The title of the thesis (dissertation) created as part of the person's education at the institution.
     * 
     */
    @JsonProperty("thesisTitle")
    @JsonPropertyDescription("The title of the thesis (dissertation) created as part of the person's education at the institution.")
    private String thesisTitle;
    /**
     * Degree Year
     * <p>
     * The academic year in which the degree was awarded.
     * 
     */
    @JsonProperty("degreeYear")
    @JsonPropertyDescription("The academic year in which the degree was awarded.")
    private Object degreeYear;
    /**
     * Reunion Year
     * <p>
     * The reunion year associated with the education.
     * 
     */
    @JsonProperty("reunionYear")
    @JsonPropertyDescription("The reunion year associated with the education.")
    private Object reunionYear;
    /**
     * Preferred Class Year
     * <p>
     * The class year to which the person prefers to associate the education.
     * 
     */
    @JsonProperty("preferredClassYear")
    @JsonPropertyDescription("The class year to which the person prefers to associate the education.")
    private Object preferredClassYear;
    /**
     * Graduation Status
     * <p>
     * The graduation status for the education.
     * 
     */
    @JsonProperty("graduationStatus")
    @JsonPropertyDescription("The graduation status for the education.")
    private Object graduationStatus;
    /**
     * Graduation Date
     * <p>
     * The date when the person graduated from the institution.
     * 
     */
    @JsonProperty("graduatedOn")
    @JsonPropertyDescription("The date when the person graduated from the institution.")
    private Object graduatedOn;
    /**
     * Admission Status
     * <p>
     * The admission status associated with the education.
     * 
     */
    @JsonProperty("admissionStatus")
    @JsonPropertyDescription("The admission status associated with the education.")
    private Object admissionStatus;
    /**
     * Admission Type
     * <p>
     * The admission type associated with the education.
     * 
     */
    @JsonProperty("admissionType")
    @JsonPropertyDescription("The admission type associated with the education.")
    private Object admissionType;
    /**
     * Notes
     * <p>
     * Notes concerning the education for the person.
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Notes concerning the education for the person.")
    private List<Note> notes = new ArrayList<Note>();
    /**
     * Source
     * <p>
     * The source of the education information.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the education information.")
    private Object source;

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

    public ConstituentEducation withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent education.
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
     * The global identifier of the constituent education.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentEducation withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person associated with the education record.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The person associated with the education record.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public ConstituentEducation withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Preferences
     * <p>
     * Indicates the preferences of the education over all other education for the person.
     * 
     */
    @JsonProperty("preferences")
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * Preferences
     * <p>
     * Indicates the preferences of the education over all other education for the person.
     * 
     */
    @JsonProperty("preferences")
    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public ConstituentEducation withPreferences(Preferences preferences) {
        this.preferences = preferences;
        return this;
    }

    /**
     * Institution
     * <p>
     * The educational institution where the person's education occurred.
     * (Required)
     * 
     */
    @JsonProperty("institution")
    public Institution getInstitution() {
        return institution;
    }

    /**
     * Institution
     * <p>
     * The educational institution where the person's education occurred.
     * (Required)
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public ConstituentEducation withInstitution(Institution institution) {
        this.institution = institution;
        return this;
    }

    /**
     * Campus
     * <p>
     * The campus where the education occurred.
     * 
     */
    @JsonProperty("campus")
    public Object getCampus() {
        return campus;
    }

    /**
     * Campus
     * <p>
     * The campus where the education occurred.
     * 
     */
    @JsonProperty("campus")
    public void setCampus(Object campus) {
        this.campus = campus;
    }

    public ConstituentEducation withCampus(Object campus) {
        this.campus = campus;
        return this;
    }

    /**
     * Institutional Units
     * <p>
     * The institutional units associated with the education.
     * 
     */
    @JsonProperty("institutionalUnits")
    public List<InstitutionalUnit> getInstitutionalUnits() {
        return institutionalUnits;
    }

    /**
     * Institutional Units
     * <p>
     * The institutional units associated with the education.
     * 
     */
    @JsonProperty("institutionalUnits")
    public void setInstitutionalUnits(List<InstitutionalUnit> institutionalUnits) {
        this.institutionalUnits = institutionalUnits;
    }

    public ConstituentEducation withInstitutionalUnits(List<InstitutionalUnit> institutionalUnits) {
        this.institutionalUnits = institutionalUnits;
        return this;
    }

    /**
     * Academic Program
     * <p>
     * The academic program associated with the education.
     * 
     */
    @JsonProperty("academicProgram")
    public Object getAcademicProgram() {
        return academicProgram;
    }

    /**
     * Academic Program
     * <p>
     * The academic program associated with the education.
     * 
     */
    @JsonProperty("academicProgram")
    public void setAcademicProgram(Object academicProgram) {
        this.academicProgram = academicProgram;
    }

    public ConstituentEducation withAcademicProgram(Object academicProgram) {
        this.academicProgram = academicProgram;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level of the education (e.g. graduate, undergraduate).
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level of the education (e.g. graduate, undergraduate).
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public ConstituentEducation withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) the person was awarded at the institution.
     * 
     */
    @JsonProperty("credential")
    public Object getCredential() {
        return credential;
    }

    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) the person was awarded at the institution.
     * 
     */
    @JsonProperty("credential")
    public void setCredential(Object credential) {
        this.credential = credential;
    }

    public ConstituentEducation withCredential(Object credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Disciplines
     * <p>
     * The academic disciplines associated with the person's education at the institution.
     * 
     */
    @JsonProperty("disciplines")
    public Disciplines getDisciplines() {
        return disciplines;
    }

    /**
     * Disciplines
     * <p>
     * The academic disciplines associated with the person's education at the institution.
     * 
     */
    @JsonProperty("disciplines")
    public void setDisciplines(Disciplines disciplines) {
        this.disciplines = disciplines;
    }

    public ConstituentEducation withDisciplines(Disciplines disciplines) {
        this.disciplines = disciplines;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when the person's education at the institution started.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the person's education at the institution started.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public ConstituentEducation withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date when the person's education at the institution ended.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when the person's education at the institution ended.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public ConstituentEducation withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Recognitions
     * <p>
     * The academic recognitions received in conjunction with the person's education at the institution.
     * 
     */
    @JsonProperty("recognitions")
    public List<Recognition> getRecognitions() {
        return recognitions;
    }

    /**
     * Recognitions
     * <p>
     * The academic recognitions received in conjunction with the person's education at the institution.
     * 
     */
    @JsonProperty("recognitions")
    public void setRecognitions(List<Recognition> recognitions) {
        this.recognitions = recognitions;
    }

    public ConstituentEducation withRecognitions(List<Recognition> recognitions) {
        this.recognitions = recognitions;
        return this;
    }

    /**
     * Conferral Type
     * <p>
     * The conferral type associated with the degree (e.g. honorary degree).
     * 
     */
    @JsonProperty("conferralType")
    public Object getConferralType() {
        return conferralType;
    }

    /**
     * Conferral Type
     * <p>
     * The conferral type associated with the degree (e.g. honorary degree).
     * 
     */
    @JsonProperty("conferralType")
    public void setConferralType(Object conferralType) {
        this.conferralType = conferralType;
    }

    public ConstituentEducation withConferralType(Object conferralType) {
        this.conferralType = conferralType;
        return this;
    }

    /**
     * Thesis Title
     * <p>
     * The title of the thesis (dissertation) created as part of the person's education at the institution.
     * 
     */
    @JsonProperty("thesisTitle")
    public String getThesisTitle() {
        return thesisTitle;
    }

    /**
     * Thesis Title
     * <p>
     * The title of the thesis (dissertation) created as part of the person's education at the institution.
     * 
     */
    @JsonProperty("thesisTitle")
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public ConstituentEducation withThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
        return this;
    }

    /**
     * Degree Year
     * <p>
     * The academic year in which the degree was awarded.
     * 
     */
    @JsonProperty("degreeYear")
    public Object getDegreeYear() {
        return degreeYear;
    }

    /**
     * Degree Year
     * <p>
     * The academic year in which the degree was awarded.
     * 
     */
    @JsonProperty("degreeYear")
    public void setDegreeYear(Object degreeYear) {
        this.degreeYear = degreeYear;
    }

    public ConstituentEducation withDegreeYear(Object degreeYear) {
        this.degreeYear = degreeYear;
        return this;
    }

    /**
     * Reunion Year
     * <p>
     * The reunion year associated with the education.
     * 
     */
    @JsonProperty("reunionYear")
    public Object getReunionYear() {
        return reunionYear;
    }

    /**
     * Reunion Year
     * <p>
     * The reunion year associated with the education.
     * 
     */
    @JsonProperty("reunionYear")
    public void setReunionYear(Object reunionYear) {
        this.reunionYear = reunionYear;
    }

    public ConstituentEducation withReunionYear(Object reunionYear) {
        this.reunionYear = reunionYear;
        return this;
    }

    /**
     * Preferred Class Year
     * <p>
     * The class year to which the person prefers to associate the education.
     * 
     */
    @JsonProperty("preferredClassYear")
    public Object getPreferredClassYear() {
        return preferredClassYear;
    }

    /**
     * Preferred Class Year
     * <p>
     * The class year to which the person prefers to associate the education.
     * 
     */
    @JsonProperty("preferredClassYear")
    public void setPreferredClassYear(Object preferredClassYear) {
        this.preferredClassYear = preferredClassYear;
    }

    public ConstituentEducation withPreferredClassYear(Object preferredClassYear) {
        this.preferredClassYear = preferredClassYear;
        return this;
    }

    /**
     * Graduation Status
     * <p>
     * The graduation status for the education.
     * 
     */
    @JsonProperty("graduationStatus")
    public Object getGraduationStatus() {
        return graduationStatus;
    }

    /**
     * Graduation Status
     * <p>
     * The graduation status for the education.
     * 
     */
    @JsonProperty("graduationStatus")
    public void setGraduationStatus(Object graduationStatus) {
        this.graduationStatus = graduationStatus;
    }

    public ConstituentEducation withGraduationStatus(Object graduationStatus) {
        this.graduationStatus = graduationStatus;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * The date when the person graduated from the institution.
     * 
     */
    @JsonProperty("graduatedOn")
    public Object getGraduatedOn() {
        return graduatedOn;
    }

    /**
     * Graduation Date
     * <p>
     * The date when the person graduated from the institution.
     * 
     */
    @JsonProperty("graduatedOn")
    public void setGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
    }

    public ConstituentEducation withGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
        return this;
    }

    /**
     * Admission Status
     * <p>
     * The admission status associated with the education.
     * 
     */
    @JsonProperty("admissionStatus")
    public Object getAdmissionStatus() {
        return admissionStatus;
    }

    /**
     * Admission Status
     * <p>
     * The admission status associated with the education.
     * 
     */
    @JsonProperty("admissionStatus")
    public void setAdmissionStatus(Object admissionStatus) {
        this.admissionStatus = admissionStatus;
    }

    public ConstituentEducation withAdmissionStatus(Object admissionStatus) {
        this.admissionStatus = admissionStatus;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * The admission type associated with the education.
     * 
     */
    @JsonProperty("admissionType")
    public Object getAdmissionType() {
        return admissionType;
    }

    /**
     * Admission Type
     * <p>
     * The admission type associated with the education.
     * 
     */
    @JsonProperty("admissionType")
    public void setAdmissionType(Object admissionType) {
        this.admissionType = admissionType;
    }

    public ConstituentEducation withAdmissionType(Object admissionType) {
        this.admissionType = admissionType;
        return this;
    }

    /**
     * Notes
     * <p>
     * Notes concerning the education for the person.
     * 
     */
    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * Notes concerning the education for the person.
     * 
     */
    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public ConstituentEducation withNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the education information.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the education information.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentEducation withSource(Object source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentEducation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("preferences");
        sb.append('=');
        sb.append(((this.preferences == null)?"<null>":this.preferences));
        sb.append(',');
        sb.append("institution");
        sb.append('=');
        sb.append(((this.institution == null)?"<null>":this.institution));
        sb.append(',');
        sb.append("campus");
        sb.append('=');
        sb.append(((this.campus == null)?"<null>":this.campus));
        sb.append(',');
        sb.append("institutionalUnits");
        sb.append('=');
        sb.append(((this.institutionalUnits == null)?"<null>":this.institutionalUnits));
        sb.append(',');
        sb.append("academicProgram");
        sb.append('=');
        sb.append(((this.academicProgram == null)?"<null>":this.academicProgram));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("credential");
        sb.append('=');
        sb.append(((this.credential == null)?"<null>":this.credential));
        sb.append(',');
        sb.append("disciplines");
        sb.append('=');
        sb.append(((this.disciplines == null)?"<null>":this.disciplines));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("recognitions");
        sb.append('=');
        sb.append(((this.recognitions == null)?"<null>":this.recognitions));
        sb.append(',');
        sb.append("conferralType");
        sb.append('=');
        sb.append(((this.conferralType == null)?"<null>":this.conferralType));
        sb.append(',');
        sb.append("thesisTitle");
        sb.append('=');
        sb.append(((this.thesisTitle == null)?"<null>":this.thesisTitle));
        sb.append(',');
        sb.append("degreeYear");
        sb.append('=');
        sb.append(((this.degreeYear == null)?"<null>":this.degreeYear));
        sb.append(',');
        sb.append("reunionYear");
        sb.append('=');
        sb.append(((this.reunionYear == null)?"<null>":this.reunionYear));
        sb.append(',');
        sb.append("preferredClassYear");
        sb.append('=');
        sb.append(((this.preferredClassYear == null)?"<null>":this.preferredClassYear));
        sb.append(',');
        sb.append("graduationStatus");
        sb.append('=');
        sb.append(((this.graduationStatus == null)?"<null>":this.graduationStatus));
        sb.append(',');
        sb.append("graduatedOn");
        sb.append('=');
        sb.append(((this.graduatedOn == null)?"<null>":this.graduatedOn));
        sb.append(',');
        sb.append("admissionStatus");
        sb.append('=');
        sb.append(((this.admissionStatus == null)?"<null>":this.admissionStatus));
        sb.append(',');
        sb.append("admissionType");
        sb.append('=');
        sb.append(((this.admissionType == null)?"<null>":this.admissionType));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.degreeYear == null)? 0 :this.degreeYear.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.institution == null)? 0 :this.institution.hashCode()));
        result = ((result* 31)+((this.graduationStatus == null)? 0 :this.graduationStatus.hashCode()));
        result = ((result* 31)+((this.credential == null)? 0 :this.credential.hashCode()));
        result = ((result* 31)+((this.graduatedOn == null)? 0 :this.graduatedOn.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.admissionType == null)? 0 :this.admissionType.hashCode()));
        result = ((result* 31)+((this.conferralType == null)? 0 :this.conferralType.hashCode()));
        result = ((result* 31)+((this.admissionStatus == null)? 0 :this.admissionStatus.hashCode()));
        result = ((result* 31)+((this.preferences == null)? 0 :this.preferences.hashCode()));
        result = ((result* 31)+((this.academicProgram == null)? 0 :this.academicProgram.hashCode()));
        result = ((result* 31)+((this.preferredClassYear == null)? 0 :this.preferredClassYear.hashCode()));
        result = ((result* 31)+((this.campus == null)? 0 :this.campus.hashCode()));
        result = ((result* 31)+((this.institutionalUnits == null)? 0 :this.institutionalUnits.hashCode()));
        result = ((result* 31)+((this.recognitions == null)? 0 :this.recognitions.hashCode()));
        result = ((result* 31)+((this.reunionYear == null)? 0 :this.reunionYear.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.thesisTitle == null)? 0 :this.thesisTitle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentEducation) == false) {
            return false;
        }
        ConstituentEducation rhs = ((ConstituentEducation) other);
        return ((((((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.degreeYear == rhs.degreeYear)||((this.degreeYear!= null)&&this.degreeYear.equals(rhs.degreeYear))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution))))&&((this.graduationStatus == rhs.graduationStatus)||((this.graduationStatus!= null)&&this.graduationStatus.equals(rhs.graduationStatus))))&&((this.credential == rhs.credential)||((this.credential!= null)&&this.credential.equals(rhs.credential))))&&((this.graduatedOn == rhs.graduatedOn)||((this.graduatedOn!= null)&&this.graduatedOn.equals(rhs.graduatedOn))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.admissionType == rhs.admissionType)||((this.admissionType!= null)&&this.admissionType.equals(rhs.admissionType))))&&((this.conferralType == rhs.conferralType)||((this.conferralType!= null)&&this.conferralType.equals(rhs.conferralType))))&&((this.admissionStatus == rhs.admissionStatus)||((this.admissionStatus!= null)&&this.admissionStatus.equals(rhs.admissionStatus))))&&((this.preferences == rhs.preferences)||((this.preferences!= null)&&this.preferences.equals(rhs.preferences))))&&((this.academicProgram == rhs.academicProgram)||((this.academicProgram!= null)&&this.academicProgram.equals(rhs.academicProgram))))&&((this.preferredClassYear == rhs.preferredClassYear)||((this.preferredClassYear!= null)&&this.preferredClassYear.equals(rhs.preferredClassYear))))&&((this.campus == rhs.campus)||((this.campus!= null)&&this.campus.equals(rhs.campus))))&&((this.institutionalUnits == rhs.institutionalUnits)||((this.institutionalUnits!= null)&&this.institutionalUnits.equals(rhs.institutionalUnits))))&&((this.recognitions == rhs.recognitions)||((this.recognitions!= null)&&this.recognitions.equals(rhs.recognitions))))&&((this.reunionYear == rhs.reunionYear)||((this.reunionYear!= null)&&this.reunionYear.equals(rhs.reunionYear))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.thesisTitle == rhs.thesisTitle)||((this.thesisTitle!= null)&&this.thesisTitle.equals(rhs.thesisTitle))));
    }

}
