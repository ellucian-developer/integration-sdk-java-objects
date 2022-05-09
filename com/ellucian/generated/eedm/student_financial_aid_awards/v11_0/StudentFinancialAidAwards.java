
package com.ellucian.generated.eedm.student_financial_aid_awards.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Financial Aid Awards
 * <p>
 * Financial aid awards made to students.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "awardFund",
    "aidYear",
    "originallyOfferedOn",
    "awardsByPeriod"
})
@Generated("jsonschema2pojo")
public class StudentFinancialAidAwards {

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
     * The global identifier of the student-financial-aid-awards.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student-financial-aid-awards.")
    private String id;
    /**
     * Student
     * <p>
     * Student who will be receiving the financial aid award
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("Student who will be receiving the financial aid award")
    private Student student;
    /**
     * Award Fund
     * <p>
     * The fund that is awarded to the student.
     * (Required)
     * 
     */
    @JsonProperty("awardFund")
    @JsonPropertyDescription("The fund that is awarded to the student.")
    private AwardFund awardFund;
    /**
     * Aid Year
     * <p>
     * The year that the award is assigned
     * (Required)
     * 
     */
    @JsonProperty("aidYear")
    @JsonPropertyDescription("The year that the award is assigned")
    private AidYear aidYear;
    /**
     * Originally Offered On
     * <p>
     * Date of the first offer
     * 
     */
    @JsonProperty("originallyOfferedOn")
    @JsonPropertyDescription("Date of the first offer")
    private Object originallyOfferedOn;
    /**
     * Awards By Period
     * <p>
     * Financial award details by period.
     * 
     */
    @JsonProperty("awardsByPeriod")
    @JsonPropertyDescription("Financial award details by period.")
    private List<AwardsByPeriod> awardsByPeriod = new ArrayList<AwardsByPeriod>();

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

    public StudentFinancialAidAwards withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student-financial-aid-awards.
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
     * The global identifier of the student-financial-aid-awards.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentFinancialAidAwards withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * Student who will be receiving the financial aid award
     * (Required)
     * 
     */
    @JsonProperty("student")
    public Student getStudent() {
        return student;
    }

    /**
     * Student
     * <p>
     * Student who will be receiving the financial aid award
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentFinancialAidAwards withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Award Fund
     * <p>
     * The fund that is awarded to the student.
     * (Required)
     * 
     */
    @JsonProperty("awardFund")
    public AwardFund getAwardFund() {
        return awardFund;
    }

    /**
     * Award Fund
     * <p>
     * The fund that is awarded to the student.
     * (Required)
     * 
     */
    @JsonProperty("awardFund")
    public void setAwardFund(AwardFund awardFund) {
        this.awardFund = awardFund;
    }

    public StudentFinancialAidAwards withAwardFund(AwardFund awardFund) {
        this.awardFund = awardFund;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * The year that the award is assigned
     * (Required)
     * 
     */
    @JsonProperty("aidYear")
    public AidYear getAidYear() {
        return aidYear;
    }

    /**
     * Aid Year
     * <p>
     * The year that the award is assigned
     * (Required)
     * 
     */
    @JsonProperty("aidYear")
    public void setAidYear(AidYear aidYear) {
        this.aidYear = aidYear;
    }

    public StudentFinancialAidAwards withAidYear(AidYear aidYear) {
        this.aidYear = aidYear;
        return this;
    }

    /**
     * Originally Offered On
     * <p>
     * Date of the first offer
     * 
     */
    @JsonProperty("originallyOfferedOn")
    public Object getOriginallyOfferedOn() {
        return originallyOfferedOn;
    }

    /**
     * Originally Offered On
     * <p>
     * Date of the first offer
     * 
     */
    @JsonProperty("originallyOfferedOn")
    public void setOriginallyOfferedOn(Object originallyOfferedOn) {
        this.originallyOfferedOn = originallyOfferedOn;
    }

    public StudentFinancialAidAwards withOriginallyOfferedOn(Object originallyOfferedOn) {
        this.originallyOfferedOn = originallyOfferedOn;
        return this;
    }

    /**
     * Awards By Period
     * <p>
     * Financial award details by period.
     * 
     */
    @JsonProperty("awardsByPeriod")
    public List<AwardsByPeriod> getAwardsByPeriod() {
        return awardsByPeriod;
    }

    /**
     * Awards By Period
     * <p>
     * Financial award details by period.
     * 
     */
    @JsonProperty("awardsByPeriod")
    public void setAwardsByPeriod(List<AwardsByPeriod> awardsByPeriod) {
        this.awardsByPeriod = awardsByPeriod;
    }

    public StudentFinancialAidAwards withAwardsByPeriod(List<AwardsByPeriod> awardsByPeriod) {
        this.awardsByPeriod = awardsByPeriod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentFinancialAidAwards.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("student");
        sb.append('=');
        sb.append(((this.student == null)?"<null>":this.student));
        sb.append(',');
        sb.append("awardFund");
        sb.append('=');
        sb.append(((this.awardFund == null)?"<null>":this.awardFund));
        sb.append(',');
        sb.append("aidYear");
        sb.append('=');
        sb.append(((this.aidYear == null)?"<null>":this.aidYear));
        sb.append(',');
        sb.append("originallyOfferedOn");
        sb.append('=');
        sb.append(((this.originallyOfferedOn == null)?"<null>":this.originallyOfferedOn));
        sb.append(',');
        sb.append("awardsByPeriod");
        sb.append('=');
        sb.append(((this.awardsByPeriod == null)?"<null>":this.awardsByPeriod));
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
        result = ((result* 31)+((this.awardsByPeriod == null)? 0 :this.awardsByPeriod.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.awardFund == null)? 0 :this.awardFund.hashCode()));
        result = ((result* 31)+((this.originallyOfferedOn == null)? 0 :this.originallyOfferedOn.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.aidYear == null)? 0 :this.aidYear.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentFinancialAidAwards) == false) {
            return false;
        }
        StudentFinancialAidAwards rhs = ((StudentFinancialAidAwards) other);
        return ((((((((this.awardsByPeriod == rhs.awardsByPeriod)||((this.awardsByPeriod!= null)&&this.awardsByPeriod.equals(rhs.awardsByPeriod)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.awardFund == rhs.awardFund)||((this.awardFund!= null)&&this.awardFund.equals(rhs.awardFund))))&&((this.originallyOfferedOn == rhs.originallyOfferedOn)||((this.originallyOfferedOn!= null)&&this.originallyOfferedOn.equals(rhs.originallyOfferedOn))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.aidYear == rhs.aidYear)||((this.aidYear!= null)&&this.aidYear.equals(rhs.aidYear))));
    }

}
