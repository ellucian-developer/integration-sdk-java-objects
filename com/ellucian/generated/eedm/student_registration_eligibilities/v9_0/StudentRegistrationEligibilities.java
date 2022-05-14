
package com.ellucian.generated.eedm.student_registration_eligibilities.v9_0;

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
 * Student Registration Eligibilities
 * <p>
 * It provides information on the registration eligibility of the student.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "student",
    "academicPeriod",
    "startOn",
    "endOn",
    "alternatePin",
    "eligibilityStatus",
    "ineligibilityReasons",
    "priorityRegistrationTimeSlots",
    "metadata"
})
@Generated("jsonschema2pojo")
public class StudentRegistrationEligibilities {

    /**
     * Student
     * <p>
     * The student for which registration eligibility is provided.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student for which registration eligibility is provided.")
    private Student student;
    /**
     * Academic Period
     * <p>
     * The academic period for which registration eligibility is provided.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period for which registration eligibility is provided.")
    private AcademicPeriod academicPeriod;
    /**
     * Start On
     * <p>
     * The date when a student may first register for the academic period.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when a student may first register for the academic period.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date when a student may register for the academic period.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when a student may register for the academic period.")
    private Object endOn;
    /**
     * Alternate Pin
     * <p>
     * An indication if an alternate pin is required for the student to register.
     * 
     */
    @JsonProperty("alternatePin")
    @JsonPropertyDescription("An indication if an alternate pin is required for the student to register.")
    private Object alternatePin;
    /**
     * Eligibility Status
     * <p>
     * The indication if the student is eligible to register for the academic period.
     * (Required)
     * 
     */
    @JsonProperty("eligibilityStatus")
    @JsonPropertyDescription("The indication if the student is eligible to register for the academic period.")
    private StudentRegistrationEligibilities.EligibilityStatus eligibilityStatus;
    /**
     * Ineligibility Reasons
     * <p>
     * The reasons the student is not eligibile to register.
     * 
     */
    @JsonProperty("ineligibilityReasons")
    @JsonPropertyDescription("The reasons the student is not eligibile to register.")
    private List<String> ineligibilityReasons = new ArrayList<String>();
    /**
     * Priority Registration Time Slots
     * <p>
     * Time periods when the student is assigned priority registration.
     * 
     */
    @JsonProperty("priorityRegistrationTimeSlots")
    @JsonPropertyDescription("Time periods when the student is assigned priority registration.")
    private List<PriorityRegistrationTimeSlot> priorityRegistrationTimeSlots = new ArrayList<PriorityRegistrationTimeSlot>();
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
     * Student
     * <p>
     * The student for which registration eligibility is provided.
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
     * The student for which registration eligibility is provided.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentRegistrationEligibilities withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for which registration eligibility is provided.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    public AcademicPeriod getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for which registration eligibility is provided.
     * (Required)
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public StudentRegistrationEligibilities withAcademicPeriod(AcademicPeriod academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when a student may first register for the academic period.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when a student may first register for the academic period.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public StudentRegistrationEligibilities withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when a student may register for the academic period.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when a student may register for the academic period.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public StudentRegistrationEligibilities withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Alternate Pin
     * <p>
     * An indication if an alternate pin is required for the student to register.
     * 
     */
    @JsonProperty("alternatePin")
    public Object getAlternatePin() {
        return alternatePin;
    }

    /**
     * Alternate Pin
     * <p>
     * An indication if an alternate pin is required for the student to register.
     * 
     */
    @JsonProperty("alternatePin")
    public void setAlternatePin(Object alternatePin) {
        this.alternatePin = alternatePin;
    }

    public StudentRegistrationEligibilities withAlternatePin(Object alternatePin) {
        this.alternatePin = alternatePin;
        return this;
    }

    /**
     * Eligibility Status
     * <p>
     * The indication if the student is eligible to register for the academic period.
     * (Required)
     * 
     */
    @JsonProperty("eligibilityStatus")
    public StudentRegistrationEligibilities.EligibilityStatus getEligibilityStatus() {
        return eligibilityStatus;
    }

    /**
     * Eligibility Status
     * <p>
     * The indication if the student is eligible to register for the academic period.
     * (Required)
     * 
     */
    @JsonProperty("eligibilityStatus")
    public void setEligibilityStatus(StudentRegistrationEligibilities.EligibilityStatus eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }

    public StudentRegistrationEligibilities withEligibilityStatus(StudentRegistrationEligibilities.EligibilityStatus eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
        return this;
    }

    /**
     * Ineligibility Reasons
     * <p>
     * The reasons the student is not eligibile to register.
     * 
     */
    @JsonProperty("ineligibilityReasons")
    public List<String> getIneligibilityReasons() {
        return ineligibilityReasons;
    }

    /**
     * Ineligibility Reasons
     * <p>
     * The reasons the student is not eligibile to register.
     * 
     */
    @JsonProperty("ineligibilityReasons")
    public void setIneligibilityReasons(List<String> ineligibilityReasons) {
        this.ineligibilityReasons = ineligibilityReasons;
    }

    public StudentRegistrationEligibilities withIneligibilityReasons(List<String> ineligibilityReasons) {
        this.ineligibilityReasons = ineligibilityReasons;
        return this;
    }

    /**
     * Priority Registration Time Slots
     * <p>
     * Time periods when the student is assigned priority registration.
     * 
     */
    @JsonProperty("priorityRegistrationTimeSlots")
    public List<PriorityRegistrationTimeSlot> getPriorityRegistrationTimeSlots() {
        return priorityRegistrationTimeSlots;
    }

    /**
     * Priority Registration Time Slots
     * <p>
     * Time periods when the student is assigned priority registration.
     * 
     */
    @JsonProperty("priorityRegistrationTimeSlots")
    public void setPriorityRegistrationTimeSlots(List<PriorityRegistrationTimeSlot> priorityRegistrationTimeSlots) {
        this.priorityRegistrationTimeSlots = priorityRegistrationTimeSlots;
    }

    public StudentRegistrationEligibilities withPriorityRegistrationTimeSlots(List<PriorityRegistrationTimeSlot> priorityRegistrationTimeSlots) {
        this.priorityRegistrationTimeSlots = priorityRegistrationTimeSlots;
        return this;
    }

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

    public StudentRegistrationEligibilities withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentRegistrationEligibilities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("student");
        sb.append('=');
        sb.append(((this.student == null)?"<null>":this.student));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("alternatePin");
        sb.append('=');
        sb.append(((this.alternatePin == null)?"<null>":this.alternatePin));
        sb.append(',');
        sb.append("eligibilityStatus");
        sb.append('=');
        sb.append(((this.eligibilityStatus == null)?"<null>":this.eligibilityStatus));
        sb.append(',');
        sb.append("ineligibilityReasons");
        sb.append('=');
        sb.append(((this.ineligibilityReasons == null)?"<null>":this.ineligibilityReasons));
        sb.append(',');
        sb.append("priorityRegistrationTimeSlots");
        sb.append('=');
        sb.append(((this.priorityRegistrationTimeSlots == null)?"<null>":this.priorityRegistrationTimeSlots));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
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
        result = ((result* 31)+((this.eligibilityStatus == null)? 0 :this.eligibilityStatus.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.alternatePin == null)? 0 :this.alternatePin.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.priorityRegistrationTimeSlots == null)? 0 :this.priorityRegistrationTimeSlots.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.ineligibilityReasons == null)? 0 :this.ineligibilityReasons.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentRegistrationEligibilities) == false) {
            return false;
        }
        StudentRegistrationEligibilities rhs = ((StudentRegistrationEligibilities) other);
        return ((((((((((this.eligibilityStatus == rhs.eligibilityStatus)||((this.eligibilityStatus!= null)&&this.eligibilityStatus.equals(rhs.eligibilityStatus)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.alternatePin == rhs.alternatePin)||((this.alternatePin!= null)&&this.alternatePin.equals(rhs.alternatePin))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.priorityRegistrationTimeSlots == rhs.priorityRegistrationTimeSlots)||((this.priorityRegistrationTimeSlots!= null)&&this.priorityRegistrationTimeSlots.equals(rhs.priorityRegistrationTimeSlots))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.ineligibilityReasons == rhs.ineligibilityReasons)||((this.ineligibilityReasons!= null)&&this.ineligibilityReasons.equals(rhs.ineligibilityReasons))));
    }


    /**
     * Eligibility Status
     * <p>
     * The indication if the student is eligible to register for the academic period.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EligibilityStatus {

        ELIGIBLE("eligible"),
        INELIGIBLE("ineligible");
        private final String value;
        private final static Map<String, StudentRegistrationEligibilities.EligibilityStatus> CONSTANTS = new HashMap<String, StudentRegistrationEligibilities.EligibilityStatus>();

        static {
            for (StudentRegistrationEligibilities.EligibilityStatus c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EligibilityStatus(String value) {
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
        public static StudentRegistrationEligibilities.EligibilityStatus fromValue(String value) {
            StudentRegistrationEligibilities.EligibilityStatus constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
