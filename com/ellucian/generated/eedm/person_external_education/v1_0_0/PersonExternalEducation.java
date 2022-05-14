
package com.ellucian.generated.eedm.person_external_education.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person External Education
 * <p>
 * A record of person's education outside of the home institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "institution",
    "attendancePeriods",
    "performanceMeasure",
    "classSize",
    "classPercentile",
    "classRank",
    "totalCredits",
    "graduationDetails"
})
@Generated("jsonschema2pojo")
public class PersonExternalEducation {

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
     * The global identifier of the person external education.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the person external education.")
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
     * The educational institution where the person studied.
     * (Required)
     * 
     */
    @JsonProperty("institution")
    @JsonPropertyDescription("The educational institution where the person studied.")
    private Institution institution;
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
     * Class Size
     * <p>
     * The size of the person’s secondary school graduating class.
     * 
     */
    @JsonProperty("classSize")
    @JsonPropertyDescription("The size of the person\u2019s secondary school graduating class.")
    private Object classSize;
    /**
     * Class Percentile
     * <p>
     * The person's percentile within their secondary school graduating class.
     * 
     */
    @JsonProperty("classPercentile")
    @JsonPropertyDescription("The person's percentile within their secondary school graduating class.")
    private Object classPercentile;
    /**
     * Class Rank
     * <p>
     * The person's rank within their secondary school graduating class.
     * 
     */
    @JsonProperty("classRank")
    @JsonPropertyDescription("The person's rank within their secondary school graduating class.")
    private Object classRank;
    /**
     * Total Credits
     * <p>
     * The total number of credits completed during the person's entire attendance at the institution.
     * 
     */
    @JsonProperty("totalCredits")
    @JsonPropertyDescription("The total number of credits completed during the person's entire attendance at the institution.")
    private Object totalCredits;
    /**
     * Graduation Details
     * <p>
     * The details of the educational institution where the person graduated.
     * 
     */
    @JsonProperty("graduationDetails")
    @JsonPropertyDescription("The details of the educational institution where the person graduated.")
    private Object graduationDetails;

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

    public PersonExternalEducation withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person external education.
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
     * The global identifier of the person external education.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonExternalEducation withId(String id) {
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

    public PersonExternalEducation withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Institution
     * <p>
     * The educational institution where the person studied.
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
     * The educational institution where the person studied.
     * (Required)
     * 
     */
    @JsonProperty("institution")
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public PersonExternalEducation withInstitution(Institution institution) {
        this.institution = institution;
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

    public PersonExternalEducation withAttendancePeriods(List<AttendancePeriod> attendancePeriods) {
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

    public PersonExternalEducation withPerformanceMeasure(String performanceMeasure) {
        this.performanceMeasure = performanceMeasure;
        return this;
    }

    /**
     * Class Size
     * <p>
     * The size of the person’s secondary school graduating class.
     * 
     */
    @JsonProperty("classSize")
    public Object getClassSize() {
        return classSize;
    }

    /**
     * Class Size
     * <p>
     * The size of the person’s secondary school graduating class.
     * 
     */
    @JsonProperty("classSize")
    public void setClassSize(Object classSize) {
        this.classSize = classSize;
    }

    public PersonExternalEducation withClassSize(Object classSize) {
        this.classSize = classSize;
        return this;
    }

    /**
     * Class Percentile
     * <p>
     * The person's percentile within their secondary school graduating class.
     * 
     */
    @JsonProperty("classPercentile")
    public Object getClassPercentile() {
        return classPercentile;
    }

    /**
     * Class Percentile
     * <p>
     * The person's percentile within their secondary school graduating class.
     * 
     */
    @JsonProperty("classPercentile")
    public void setClassPercentile(Object classPercentile) {
        this.classPercentile = classPercentile;
    }

    public PersonExternalEducation withClassPercentile(Object classPercentile) {
        this.classPercentile = classPercentile;
        return this;
    }

    /**
     * Class Rank
     * <p>
     * The person's rank within their secondary school graduating class.
     * 
     */
    @JsonProperty("classRank")
    public Object getClassRank() {
        return classRank;
    }

    /**
     * Class Rank
     * <p>
     * The person's rank within their secondary school graduating class.
     * 
     */
    @JsonProperty("classRank")
    public void setClassRank(Object classRank) {
        this.classRank = classRank;
    }

    public PersonExternalEducation withClassRank(Object classRank) {
        this.classRank = classRank;
        return this;
    }

    /**
     * Total Credits
     * <p>
     * The total number of credits completed during the person's entire attendance at the institution.
     * 
     */
    @JsonProperty("totalCredits")
    public Object getTotalCredits() {
        return totalCredits;
    }

    /**
     * Total Credits
     * <p>
     * The total number of credits completed during the person's entire attendance at the institution.
     * 
     */
    @JsonProperty("totalCredits")
    public void setTotalCredits(Object totalCredits) {
        this.totalCredits = totalCredits;
    }

    public PersonExternalEducation withTotalCredits(Object totalCredits) {
        this.totalCredits = totalCredits;
        return this;
    }

    /**
     * Graduation Details
     * <p>
     * The details of the educational institution where the person graduated.
     * 
     */
    @JsonProperty("graduationDetails")
    public Object getGraduationDetails() {
        return graduationDetails;
    }

    /**
     * Graduation Details
     * <p>
     * The details of the educational institution where the person graduated.
     * 
     */
    @JsonProperty("graduationDetails")
    public void setGraduationDetails(Object graduationDetails) {
        this.graduationDetails = graduationDetails;
    }

    public PersonExternalEducation withGraduationDetails(Object graduationDetails) {
        this.graduationDetails = graduationDetails;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonExternalEducation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("attendancePeriods");
        sb.append('=');
        sb.append(((this.attendancePeriods == null)?"<null>":this.attendancePeriods));
        sb.append(',');
        sb.append("performanceMeasure");
        sb.append('=');
        sb.append(((this.performanceMeasure == null)?"<null>":this.performanceMeasure));
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
        sb.append("totalCredits");
        sb.append('=');
        sb.append(((this.totalCredits == null)?"<null>":this.totalCredits));
        sb.append(',');
        sb.append("graduationDetails");
        sb.append('=');
        sb.append(((this.graduationDetails == null)?"<null>":this.graduationDetails));
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
        result = ((result* 31)+((this.graduationDetails == null)? 0 :this.graduationDetails.hashCode()));
        result = ((result* 31)+((this.institution == null)? 0 :this.institution.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.attendancePeriods == null)? 0 :this.attendancePeriods.hashCode()));
        result = ((result* 31)+((this.classSize == null)? 0 :this.classSize.hashCode()));
        result = ((result* 31)+((this.totalCredits == null)? 0 :this.totalCredits.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.performanceMeasure == null)? 0 :this.performanceMeasure.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.classRank == null)? 0 :this.classRank.hashCode()));
        result = ((result* 31)+((this.classPercentile == null)? 0 :this.classPercentile.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonExternalEducation) == false) {
            return false;
        }
        PersonExternalEducation rhs = ((PersonExternalEducation) other);
        return ((((((((((((this.graduationDetails == rhs.graduationDetails)||((this.graduationDetails!= null)&&this.graduationDetails.equals(rhs.graduationDetails)))&&((this.institution == rhs.institution)||((this.institution!= null)&&this.institution.equals(rhs.institution))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.attendancePeriods == rhs.attendancePeriods)||((this.attendancePeriods!= null)&&this.attendancePeriods.equals(rhs.attendancePeriods))))&&((this.classSize == rhs.classSize)||((this.classSize!= null)&&this.classSize.equals(rhs.classSize))))&&((this.totalCredits == rhs.totalCredits)||((this.totalCredits!= null)&&this.totalCredits.equals(rhs.totalCredits))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.performanceMeasure == rhs.performanceMeasure)||((this.performanceMeasure!= null)&&this.performanceMeasure.equals(rhs.performanceMeasure))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.classRank == rhs.classRank)||((this.classRank!= null)&&this.classRank.equals(rhs.classRank))))&&((this.classPercentile == rhs.classPercentile)||((this.classPercentile!= null)&&this.classPercentile.equals(rhs.classPercentile))));
    }

}
