
package com.ellucian.generated.eedm.recruitment_external_education.v7_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Recruitment External Education
 * <p>
 * A record of a person's education outside the home institution for recruitment systems.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "institution",
    "credential",
    "disciplines",
    "startOn",
    "endOn",
    "performanceMeasure",
    "recognition",
    "graduatedOn",
    "credentialsDate",
    "transcriptReceivedOn",
    "thesisTitle",
    "creditsEarned",
    "classSize",
    "classPercentile",
    "classRank"
})
@Generated("jsonschema2pojo")
public class RecruitmentExternalEducation {

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
     * The global identifier of the recruitment external education.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the recruitment external education.")
    private String id;
    /**
     * Person
     * <p>
     * The person who was educated at the institution.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person who was educated at the institution.")
    private Person person;
    /**
     * Institution
     * <p>
     * The educational institution associated with the person.
     * (Required)
     * 
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("The educational institution associated with the person.")
    private Institution institution;
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
     * The academic disciplines associated with the person's course of study at the institution.
     * 
     */
    @JsonProperty("disciplines")
    @JsonPropertyDescription("The academic disciplines associated with the person's course of study at the institution.")
    private List<Discipline> disciplines = new ArrayList<Discipline>();
    /**
     * Start On
     * <p>
     * The date when the person's education at the institution began.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the person's education at the institution began.")
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
     * Performance Measure
     * <p>
     * A measurement of the student's educational performance at the institution (e.g. GPA).
     * 
     */
    @JsonProperty("performanceMeasure")
    @JsonPropertyDescription("A measurement of the student's educational performance at the institution (e.g. GPA).")
    private String performanceMeasure;
    /**
     * Recognition
     * <p>
     * The academic recognition received by the person at the institution.
     * 
     */
    @JsonProperty("recognition")
    @JsonPropertyDescription("The academic recognition received by the person at the institution.")
    private Object recognition;
    /**
     * Graduated On
     * <p>
     * The date the student graduated from the institution.
     * 
     */
    @JsonProperty("graduatedOn")
    @JsonPropertyDescription("The date the student graduated from the institution.")
    private Object graduatedOn;
    /**
     * Credentials Date
     * <p>
     * The date when the institution awarded a credential (e.g. degree) to the person.
     * 
     */
    @JsonProperty("credentialsDate")
    @JsonPropertyDescription("The date when the institution awarded a credential (e.g. degree) to the person.")
    private Object credentialsDate;
    /**
     * Transcript Received On
     * <p>
     * The date that the transcript for the student's education was received.
     * 
     */
    @JsonProperty("transcriptReceivedOn")
    @JsonPropertyDescription("The date that the transcript for the student's education was received.")
    private Object transcriptReceivedOn;
    /**
     * Thesis Title
     * <p>
     * The title of the thesis (dissertation).
     * 
     */
    @JsonProperty("thesisTitle")
    @JsonPropertyDescription("The title of the thesis (dissertation).")
    private String thesisTitle;
    /**
     * Credits Earned
     * <p>
     * The number of credits earned during the person's course of study at the institution.
     * 
     */
    @JsonProperty("creditsEarned")
    @JsonPropertyDescription("The number of credits earned during the person's course of study at the institution.")
    private Object creditsEarned;
    /**
     * Class Size
     * <p>
     * The size of the class associated with the person's course of study.
     * 
     */
    @JsonProperty("classSize")
    @JsonPropertyDescription("The size of the class associated with the person's course of study.")
    private Object classSize;
    /**
     * Class Percentile
     * <p>
     * The person's class percentile.
     * 
     */
    @JsonProperty("classPercentile")
    @JsonPropertyDescription("The person's class percentile.")
    private Object classPercentile;
    /**
     * Class Rank
     * <p>
     * The person's class rank.
     * 
     */
    @JsonProperty("classRank")
    @JsonPropertyDescription("The person's class rank.")
    private Object classRank;

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

    public RecruitmentExternalEducation withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the recruitment external education.
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
     * The global identifier of the recruitment external education.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RecruitmentExternalEducation withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person who was educated at the institution.
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
     * The person who was educated at the institution.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public RecruitmentExternalEducation withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Institution
     * <p>
     * The educational institution associated with the person.
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
     * The educational institution associated with the person.
     * (Required)
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public RecruitmentExternalEducation withInstitution(Institution institution) {
        this.institution = institution;
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

    public RecruitmentExternalEducation withCredential(Object credential) {
        this.credential = credential;
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

    public RecruitmentExternalEducation withDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when the person's education at the institution began.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the person's education at the institution began.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public RecruitmentExternalEducation withStartOn(Object startOn) {
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

    public RecruitmentExternalEducation withEndOn(Object endOn) {
        this.endOn = endOn;
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

    public RecruitmentExternalEducation withPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
        return this;
    }

    /**
     * Recognition
     * <p>
     * The academic recognition received by the person at the institution.
     * 
     */
    @JsonProperty("recognition")
    public Object getRecognition() {
        return recognition;
    }

    /**
     * Recognition
     * <p>
     * The academic recognition received by the person at the institution.
     * 
     */
    @JsonProperty("recognition")
    public void setRecognition(Object recognition) {
        this.recognition = recognition;
    }

    public RecruitmentExternalEducation withRecognition(Object recognition) {
        this.recognition = recognition;
        return this;
    }

    /**
     * Graduated On
     * <p>
     * The date the student graduated from the institution.
     * 
     */
    @JsonProperty("graduatedOn")
    public Object getGraduatedOn() {
        return graduatedOn;
    }

    /**
     * Graduated On
     * <p>
     * The date the student graduated from the institution.
     * 
     */
    @JsonProperty("graduatedOn")
    public void setGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
    }

    public RecruitmentExternalEducation withGraduatedOn(Object graduatedOn) {
        this.graduatedOn = graduatedOn;
        return this;
    }

    /**
     * Credentials Date
     * <p>
     * The date when the institution awarded a credential (e.g. degree) to the person.
     * 
     */
    @JsonProperty("credentialsDate")
    public Object getCredentialsDate() {
        return credentialsDate;
    }

    /**
     * Credentials Date
     * <p>
     * The date when the institution awarded a credential (e.g. degree) to the person.
     * 
     */
    @JsonProperty("credentialsDate")
    public void setCredentialsDate(Object credentialsDate) {
        this.credentialsDate = credentialsDate;
    }

    public RecruitmentExternalEducation withCredentialsDate(Object credentialsDate) {
        this.credentialsDate = credentialsDate;
        return this;
    }

    /**
     * Transcript Received On
     * <p>
     * The date that the transcript for the student's education was received.
     * 
     */
    @JsonProperty("transcriptReceivedOn")
    public Object getTranscriptReceivedOn() {
        return transcriptReceivedOn;
    }

    /**
     * Transcript Received On
     * <p>
     * The date that the transcript for the student's education was received.
     * 
     */
    @JsonProperty("transcriptReceivedOn")
    public void setTranscriptReceivedOn(Object transcriptReceivedOn) {
        this.transcriptReceivedOn = transcriptReceivedOn;
    }

    public RecruitmentExternalEducation withTranscriptReceivedOn(Object transcriptReceivedOn) {
        this.transcriptReceivedOn = transcriptReceivedOn;
        return this;
    }

    /**
     * Thesis Title
     * <p>
     * The title of the thesis (dissertation).
     * 
     */
    @JsonProperty("thesisTitle")
    public String getThesisTitle() {
        return thesisTitle;
    }

    /**
     * Thesis Title
     * <p>
     * The title of the thesis (dissertation).
     * 
     */
    @JsonProperty("thesisTitle")
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public RecruitmentExternalEducation withThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
        return this;
    }

    /**
     * Credits Earned
     * <p>
     * The number of credits earned during the person's course of study at the institution.
     * 
     */
    @JsonProperty("creditsEarned")
    public Object getCreditsEarned() {
        return creditsEarned;
    }

    /**
     * Credits Earned
     * <p>
     * The number of credits earned during the person's course of study at the institution.
     * 
     */
    @JsonProperty("creditsEarned")
    public void setCreditsEarned(Object creditsEarned) {
        this.creditsEarned = creditsEarned;
    }

    public RecruitmentExternalEducation withCreditsEarned(Object creditsEarned) {
        this.creditsEarned = creditsEarned;
        return this;
    }

    /**
     * Class Size
     * <p>
     * The size of the class associated with the person's course of study.
     * 
     */
    @JsonProperty("classSize")
    public Object getClassSize() {
        return classSize;
    }

    /**
     * Class Size
     * <p>
     * The size of the class associated with the person's course of study.
     * 
     */
    @JsonProperty("classSize")
    public void setClassSize(Object classSize) {
        this.classSize = classSize;
    }

    public RecruitmentExternalEducation withClassSize(Object classSize) {
        this.classSize = classSize;
        return this;
    }

    /**
     * Class Percentile
     * <p>
     * The person's class percentile.
     * 
     */
    @JsonProperty("classPercentile")
    public Object getClassPercentile() {
        return classPercentile;
    }

    /**
     * Class Percentile
     * <p>
     * The person's class percentile.
     * 
     */
    @JsonProperty("classPercentile")
    public void setClassPercentile(Object classPercentile) {
        this.classPercentile = classPercentile;
    }

    public RecruitmentExternalEducation withClassPercentile(Object classPercentile) {
        this.classPercentile = classPercentile;
        return this;
    }

    /**
     * Class Rank
     * <p>
     * The person's class rank.
     * 
     */
    @JsonProperty("classRank")
    public Object getClassRank() {
        return classRank;
    }

    /**
     * Class Rank
     * <p>
     * The person's class rank.
     * 
     */
    @JsonProperty("classRank")
    public void setClassRank(Object classRank) {
        this.classRank = classRank;
    }

    public RecruitmentExternalEducation withClassRank(Object classRank) {
        this.classRank = classRank;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecruitmentExternalEducation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("institution");
        sb.append('=');
        sb.append(((this.institution == null)?"<null>":this.institution));
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
        sb.append("performanceMeasure");
        sb.append('=');
        sb.append(((this.performanceMeasure == null)?"<null>":this.performanceMeasure));
        sb.append(',');
        sb.append("recognition");
        sb.append('=');
        sb.append(((this.recognition == null)?"<null>":this.recognition));
        sb.append(',');
        sb.append("graduatedOn");
        sb.append('=');
        sb.append(((this.graduatedOn == null)?"<null>":this.graduatedOn));
        sb.append(',');
        sb.append("credentialsDate");
        sb.append('=');
        sb.append(((this.credentialsDate == null)?"<null>":this.credentialsDate));
        sb.append(',');
        sb.append("transcriptReceivedOn");
        sb.append('=');
        sb.append(((this.transcriptReceivedOn == null)?"<null>":this.transcriptReceivedOn));
        sb.append(',');
        sb.append("thesisTitle");
        sb.append('=');
        sb.append(((this.thesisTitle == null)?"<null>":this.thesisTitle));
        sb.append(',');
        sb.append("creditsEarned");
        sb.append('=');
        sb.append(((this.creditsEarned == null)?"<null>":this.creditsEarned));
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
        result = ((result* 31)+((this.recognition == null)? 0 :this.recognition.hashCode()));
        result = ((result* 31)+((this.transcriptReceivedOn == null)? 0 :this.transcriptReceivedOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.classRank == null)? 0 :this.classRank.hashCode()));
        result = ((result* 31)+((this.classPercentile == null)? 0 :this.classPercentile.hashCode()));
        result = ((result* 31)+((this.institution == null)? 0 :this.institution.hashCode()));
        result = ((result* 31)+((this.creditsEarned == null)? 0 :this.creditsEarned.hashCode()));
        result = ((result* 31)+((this.classSize == null)? 0 :this.classSize.hashCode()));
        result = ((result* 31)+((this.credential == null)? 0 :this.credential.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.graduatedOn == null)? 0 :this.graduatedOn.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.thesisTitle == null)? 0 :this.thesisTitle.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.credentialsDate == null)? 0 :this.credentialsDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecruitmentExternalEducation) == false) {
            return false;
        }
        RecruitmentExternalEducation rhs = ((RecruitmentExternalEducation) other);
        return (((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.performanceMeasure == rhs.performanceMeasure)||((this.performanceMeasure!= null)&&this.performanceMeasure.equals(rhs.performanceMeasure))))&&((this.recognition == rhs.recognition)||((this.recognition!= null)&&this.recognition.equals(rhs.recognition))))&&((this.transcriptReceivedOn == rhs.transcriptReceivedOn)||((this.transcriptReceivedOn!= null)&&this.transcriptReceivedOn.equals(rhs.transcriptReceivedOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.classRank == rhs.classRank)||((this.classRank!= null)&&this.classRank.equals(rhs.classRank))))&&((this.classPercentile == rhs.classPercentile)||((this.classPercentile!= null)&&this.classPercentile.equals(rhs.classPercentile))))&&((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution))))&&((this.creditsEarned == rhs.creditsEarned)||((this.creditsEarned!= null)&&this.creditsEarned.equals(rhs.creditsEarned))))&&((this.classSize == rhs.classSize)||((this.classSize!= null)&&this.classSize.equals(rhs.classSize))))&&((this.credential == rhs.credential)||((this.credential!= null)&&this.credential.equals(rhs.credential))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.graduatedOn == rhs.graduatedOn)||((this.graduatedOn!= null)&&this.graduatedOn.equals(rhs.graduatedOn))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.thesisTitle == rhs.thesisTitle)||((this.thesisTitle!= null)&&this.thesisTitle.equals(rhs.thesisTitle))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.credentialsDate == rhs.credentialsDate)||((this.credentialsDate!= null)&&this.credentialsDate.equals(rhs.credentialsDate))));
    }

}
