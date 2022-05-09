
package com.ellucian.generated.eedm.person_external_education_credentials.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person External Education Credentials
 * <p>
 * Credentials earned by persons outside of their home institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "externalEducation",
    "credential",
    "earnedOn",
    "disciplines",
    "supplementalCredentials",
    "attendancePeriods",
    "performanceMeasure",
    "recognitions",
    "classSize",
    "classPercentile",
    "classRank",
    "thesisTitle"
})
@Generated("jsonschema2pojo")
public class PersonExternalEducationCredentials {

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
     * The global identifier of the person external education credential.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the person external education credential.")
    private String id;
    /**
     * External Education
     * <p>
     * The details of the external education associated with the credential.
     * (Required)
     * 
     */
    @JsonProperty("externalEducation")
    @JsonPropertyDescription("The details of the external education associated with the credential.")
    private ExternalEducation externalEducation;
    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) the person earned at the institution.
     * (Required)
     * 
     */
    @JsonProperty("credential")
    @JsonPropertyDescription("The academic credential (degree, diploma, etc.) the person earned at the institution.")
    private Credential credential;
    /**
     * Earned On
     * <p>
     * The date when the person earned the credential.
     * 
     */
    @JsonProperty("earnedOn")
    @JsonPropertyDescription("The date when the person earned the credential.")
    private Object earnedOn;
    /**
     * Disciplines
     * <p>
     * The academic disciplines associated with the person's course of study at the institution.
     * 
     */
    @JsonProperty("disciplines")
    @JsonPropertyDescription("The academic disciplines associated with the person's course of study at the institution.")
    private List<Discipline> disciplines = new ArrayList<Discipline>();
    /**
     * Supplemental Credentials
     * <p>
     * The supplemental academic credential (degree, diploma, etc.) the person earned at the institution.
     * 
     */
    @JsonProperty("supplementalCredentials")
    @JsonPropertyDescription("The supplemental academic credential (degree, diploma, etc.) the person earned at the institution.")
    private List<SupplementalCredential> supplementalCredentials = new ArrayList<SupplementalCredential>();
    /**
     * Attendance Periods
     * <p>
     * The periods associated with the person's attendance at the institution.
     * 
     */
    @JsonProperty("attendancePeriods")
    @JsonPropertyDescription("The periods associated with the person's attendance at the institution.")
    private List<AttendancePeriod> attendancePeriods = new ArrayList<AttendancePeriod>();
    /**
     * Performance Measure
     * <p>
     * A measurement of the student's educational performance at the institution (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    @JsonPropertyDescription("A measurement of the student's educational performance at the institution (e.g. GPA).")
    private String performanceMeasure;
    /**
     * Recognitions
     * <p>
     * The academic recognitions received by the person at the institution.
     * 
     */
    @JsonProperty("recognitions")
    @JsonPropertyDescription("The academic recognitions received by the person at the institution.")
    private List<Recognition> recognitions = new ArrayList<Recognition>();
    /**
     * Class Size
     * <p>
     * The size of the person’s postsecondary school graduating class.
     * 
     */
    @JsonProperty("classSize")
    @JsonPropertyDescription("The size of the person\u2019s postsecondary school graduating class.")
    private Object classSize;
    /**
     * Class Percentile
     * <p>
     * The person's percentile within their postsecondary school graduating class.
     * 
     */
    @JsonProperty("classPercentile")
    @JsonPropertyDescription("The person's percentile within their postsecondary school graduating class.")
    private Object classPercentile;
    /**
     * Class Rank
     * <p>
     * The person's rank within their postsecondary school graduating class.
     * 
     */
    @JsonProperty("classRank")
    @JsonPropertyDescription("The person's rank within their postsecondary school graduating class.")
    private Object classRank;
    /**
     * Thesis Title
     * <p>
     * The person's thesis (dissertation) title.
     * 
     */
    @JsonProperty("thesisTitle")
    @JsonPropertyDescription("The person's thesis (dissertation) title.")
    private String thesisTitle;

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

    public PersonExternalEducationCredentials withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person external education credential.
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
     * The global identifier of the person external education credential.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonExternalEducationCredentials withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * External Education
     * <p>
     * The details of the external education associated with the credential.
     * (Required)
     * 
     */
    @JsonProperty("externalEducation")
    public ExternalEducation getExternalEducation() {
        return externalEducation;
    }

    /**
     * External Education
     * <p>
     * The details of the external education associated with the credential.
     * (Required)
     * 
     */
    @JsonProperty("externalEducation")
    public void setExternalEducation(ExternalEducation externalEducation) {
        this.externalEducation = externalEducation;
    }

    public PersonExternalEducationCredentials withExternalEducation(ExternalEducation externalEducation) {
        this.externalEducation = externalEducation;
        return this;
    }

    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) the person earned at the institution.
     * (Required)
     * 
     */
    @JsonProperty("credential")
    public Credential getCredential() {
        return credential;
    }

    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) the person earned at the institution.
     * (Required)
     * 
     */
    @JsonProperty("credential")
    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public PersonExternalEducationCredentials withCredential(Credential credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Earned On
     * <p>
     * The date when the person earned the credential.
     * 
     */
    @JsonProperty("earnedOn")
    public Object getEarnedOn() {
        return earnedOn;
    }

    /**
     * Earned On
     * <p>
     * The date when the person earned the credential.
     * 
     */
    @JsonProperty("earnedOn")
    public void setEarnedOn(Object earnedOn) {
        this.earnedOn = earnedOn;
    }

    public PersonExternalEducationCredentials withEarnedOn(Object earnedOn) {
        this.earnedOn = earnedOn;
        return this;
    }

    /**
     * Disciplines
     * <p>
     * The academic disciplines associated with the person's course of study at the institution.
     * 
     */
    @JsonProperty("disciplines")
    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    /**
     * Disciplines
     * <p>
     * The academic disciplines associated with the person's course of study at the institution.
     * 
     */
    @JsonProperty("disciplines")
    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public PersonExternalEducationCredentials withDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
        return this;
    }

    /**
     * Supplemental Credentials
     * <p>
     * The supplemental academic credential (degree, diploma, etc.) the person earned at the institution.
     * 
     */
    @JsonProperty("supplementalCredentials")
    public List<SupplementalCredential> getSupplementalCredentials() {
        return supplementalCredentials;
    }

    /**
     * Supplemental Credentials
     * <p>
     * The supplemental academic credential (degree, diploma, etc.) the person earned at the institution.
     * 
     */
    @JsonProperty("supplementalCredentials")
    public void setSupplementalCredentials(List<SupplementalCredential> supplementalCredentials) {
        this.supplementalCredentials = supplementalCredentials;
    }

    public PersonExternalEducationCredentials withSupplementalCredentials(List<SupplementalCredential> supplementalCredentials) {
        this.supplementalCredentials = supplementalCredentials;
        return this;
    }

    /**
     * Attendance Periods
     * <p>
     * The periods associated with the person's attendance at the institution.
     * 
     */
    @JsonProperty("attendancePeriods")
    public List<AttendancePeriod> getAttendancePeriods() {
        return attendancePeriods;
    }

    /**
     * Attendance Periods
     * <p>
     * The periods associated with the person's attendance at the institution.
     * 
     */
    @JsonProperty("attendancePeriods")
    public void setAttendancePeriods(List<AttendancePeriod> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
    }

    public PersonExternalEducationCredentials withAttendancePeriods(List<AttendancePeriod> attendancePeriods) {
        this.attendancePeriods = attendancePeriods;
        return this;
    }

    /**
     * Performance Measure
     * <p>
     * A measurement of the student's educational performance at the institution (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    public String getPerformanceMeasure() {
        return performanceMeasure;
    }

    /**
     * Performance Measure
     * <p>
     * A measurement of the student's educational performance at the institution (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    public void setPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
    }

    public PersonExternalEducationCredentials withPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
        return this;
    }

    /**
     * Recognitions
     * <p>
     * The academic recognitions received by the person at the institution.
     * 
     */
    @JsonProperty("recognitions")
    public List<Recognition> getRecognitions() {
        return recognitions;
    }

    /**
     * Recognitions
     * <p>
     * The academic recognitions received by the person at the institution.
     * 
     */
    @JsonProperty("recognitions")
    public void setRecognitions(List<Recognition> recognitions) {
        this.recognitions = recognitions;
    }

    public PersonExternalEducationCredentials withRecognitions(List<Recognition> recognitions) {
        this.recognitions = recognitions;
        return this;
    }

    /**
     * Class Size
     * <p>
     * The size of the person’s postsecondary school graduating class.
     * 
     */
    @JsonProperty("classSize")
    public Object getClassSize() {
        return classSize;
    }

    /**
     * Class Size
     * <p>
     * The size of the person’s postsecondary school graduating class.
     * 
     */
    @JsonProperty("classSize")
    public void setClassSize(Object classSize) {
        this.classSize = classSize;
    }

    public PersonExternalEducationCredentials withClassSize(Object classSize) {
        this.classSize = classSize;
        return this;
    }

    /**
     * Class Percentile
     * <p>
     * The person's percentile within their postsecondary school graduating class.
     * 
     */
    @JsonProperty("classPercentile")
    public Object getClassPercentile() {
        return classPercentile;
    }

    /**
     * Class Percentile
     * <p>
     * The person's percentile within their postsecondary school graduating class.
     * 
     */
    @JsonProperty("classPercentile")
    public void setClassPercentile(Object classPercentile) {
        this.classPercentile = classPercentile;
    }

    public PersonExternalEducationCredentials withClassPercentile(Object classPercentile) {
        this.classPercentile = classPercentile;
        return this;
    }

    /**
     * Class Rank
     * <p>
     * The person's rank within their postsecondary school graduating class.
     * 
     */
    @JsonProperty("classRank")
    public Object getClassRank() {
        return classRank;
    }

    /**
     * Class Rank
     * <p>
     * The person's rank within their postsecondary school graduating class.
     * 
     */
    @JsonProperty("classRank")
    public void setClassRank(Object classRank) {
        this.classRank = classRank;
    }

    public PersonExternalEducationCredentials withClassRank(Object classRank) {
        this.classRank = classRank;
        return this;
    }

    /**
     * Thesis Title
     * <p>
     * The person's thesis (dissertation) title.
     * 
     */
    @JsonProperty("thesisTitle")
    public String getThesisTitle() {
        return thesisTitle;
    }

    /**
     * Thesis Title
     * <p>
     * The person's thesis (dissertation) title.
     * 
     */
    @JsonProperty("thesisTitle")
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public PersonExternalEducationCredentials withThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonExternalEducationCredentials.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("externalEducation");
        sb.append('=');
        sb.append(((this.externalEducation == null)?"<null>":this.externalEducation));
        sb.append(',');
        sb.append("credential");
        sb.append('=');
        sb.append(((this.credential == null)?"<null>":this.credential));
        sb.append(',');
        sb.append("earnedOn");
        sb.append('=');
        sb.append(((this.earnedOn == null)?"<null>":this.earnedOn));
        sb.append(',');
        sb.append("disciplines");
        sb.append('=');
        sb.append(((this.disciplines == null)?"<null>":this.disciplines));
        sb.append(',');
        sb.append("supplementalCredentials");
        sb.append('=');
        sb.append(((this.supplementalCredentials == null)?"<null>":this.supplementalCredentials));
        sb.append(',');
        sb.append("attendancePeriods");
        sb.append('=');
        sb.append(((this.attendancePeriods == null)?"<null>":this.attendancePeriods));
        sb.append(',');
        sb.append("performanceMeasure");
        sb.append('=');
        sb.append(((this.performanceMeasure == null)?"<null>":this.performanceMeasure));
        sb.append(',');
        sb.append("recognitions");
        sb.append('=');
        sb.append(((this.recognitions == null)?"<null>":this.recognitions));
        sb.append(',');
        sb.append("classSize");
        sb.append('=');
        sb.append(((this.classSize == null)?"<null>":this.classSize));
        sb.append(',');
        sb.append("classPercentile");
        sb.append('=');
        sb.append(((this.classPercentile == null)?"<null>":this.classPercentile));
        sb.append(',');
        sb.append("classRank");
        sb.append('=');
        sb.append(((this.classRank == null)?"<null>":this.classRank));
        sb.append(',');
        sb.append("thesisTitle");
        sb.append('=');
        sb.append(((this.thesisTitle == null)?"<null>":this.thesisTitle));
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
        result = ((result* 31)+((this.performanceMeasure == null)? 0 :this.performanceMeasure.hashCode()));
        result = ((result* 31)+((this.recognitions == null)? 0 :this.recognitions.hashCode()));
        result = ((result* 31)+((this.classRank == null)? 0 :this.classRank.hashCode()));
        result = ((result* 31)+((this.earnedOn == null)? 0 :this.earnedOn.hashCode()));
        result = ((result* 31)+((this.classPercentile == null)? 0 :this.classPercentile.hashCode()));
        result = ((result* 31)+((this.attendancePeriods == null)? 0 :this.attendancePeriods.hashCode()));
        result = ((result* 31)+((this.classSize == null)? 0 :this.classSize.hashCode()));
        result = ((result* 31)+((this.credential == null)? 0 :this.credential.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.thesisTitle == null)? 0 :this.thesisTitle.hashCode()));
        result = ((result* 31)+((this.supplementalCredentials == null)? 0 :this.supplementalCredentials.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.externalEducation == null)? 0 :this.externalEducation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonExternalEducationCredentials) == false) {
            return false;
        }
        PersonExternalEducationCredentials rhs = ((PersonExternalEducationCredentials) other);
        return (((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.performanceMeasure == rhs.performanceMeasure)||((this.performanceMeasure!= null)&&this.performanceMeasure.equals(rhs.performanceMeasure))))&&((this.recognitions == rhs.recognitions)||((this.recognitions!= null)&&this.recognitions.equals(rhs.recognitions))))&&((this.classRank == rhs.classRank)||((this.classRank!= null)&&this.classRank.equals(rhs.classRank))))&&((this.earnedOn == rhs.earnedOn)||((this.earnedOn!= null)&&this.earnedOn.equals(rhs.earnedOn))))&&((this.classPercentile == rhs.classPercentile)||((this.classPercentile!= null)&&this.classPercentile.equals(rhs.classPercentile))))&&((this.attendancePeriods == rhs.attendancePeriods)||((this.attendancePeriods!= null)&&this.attendancePeriods.equals(rhs.attendancePeriods))))&&((this.classSize == rhs.classSize)||((this.classSize!= null)&&this.classSize.equals(rhs.classSize))))&&((this.credential == rhs.credential)||((this.credential!= null)&&this.credential.equals(rhs.credential))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.thesisTitle == rhs.thesisTitle)||((this.thesisTitle!= null)&&this.thesisTitle.equals(rhs.thesisTitle))))&&((this.supplementalCredentials == rhs.supplementalCredentials)||((this.supplementalCredentials!= null)&&this.supplementalCredentials.equals(rhs.supplementalCredentials))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.externalEducation == rhs.externalEducation)||((this.externalEducation!= null)&&this.externalEducation.equals(rhs.externalEducation))));
    }

}
