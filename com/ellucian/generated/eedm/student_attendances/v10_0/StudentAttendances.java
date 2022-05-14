
package com.ellucian.generated.eedm.student_attendances.v10_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Attendances
 * <p>
 * The detailed information of students' attendances at instructional events.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "instructionalEvent",
    "instructionalEventInstance",
    "attendanceTaken",
    "attendance",
    "percentAttended",
    "comment"
})
@Generated("jsonschema2pojo")
public class StudentAttendances {

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
     * The global identifier of the student attendance.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student attendance.")
    private String id;
    /**
     * Student
     * <p>
     * The student for whom attendance was taken.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student for whom attendance was taken.")
    private Student student;
    /**
     * Instructional Event
     * <p>
     * The instructional event for which the student’s attendance applies.
     * (Required)
     * 
     */
    @JsonProperty("instructionalEvent")
    @JsonPropertyDescription("The instructional event for which the student\u2019s attendance applies.")
    private InstructionalEvent instructionalEvent;
    /**
     * Instructional Event Instance
     * <p>
     * The instance of the instructional event for which attendance was taken.
     * 
     */
    @JsonProperty("instructionalEventInstance")
    @JsonPropertyDescription("The instance of the instructional event for which attendance was taken.")
    private Object instructionalEventInstance;
    /**
     * Attendance Taken
     * <p>
     * The date and time for which the attendance applies.
     * (Required)
     * 
     */
    @JsonProperty("attendanceTaken")
    @JsonPropertyDescription("The date and time for which the attendance applies.")
    private Date attendanceTaken;
    /**
     * Attendance
     * <p>
     * The categorization of the student's attendance.
     * (Required)
     * 
     */
    @JsonProperty("attendance")
    @JsonPropertyDescription("The categorization of the student's attendance.")
    private Attendance attendance;
    /**
     * Percent Attended
     * <p>
     * The percentage of the total session time the student was in attendance.
     * 
     */
    @JsonProperty("percentAttended")
    @JsonPropertyDescription("The percentage of the total session time the student was in attendance.")
    private Object percentAttended;
    /**
     * Comment
     * <p>
     * Comments regarding the student’s attendance.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Comments regarding the student\u2019s attendance.")
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

    public StudentAttendances withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student attendance.
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
     * The global identifier of the student attendance.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAttendances withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student for whom attendance was taken.
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
     * The student for whom attendance was taken.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentAttendances withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Instructional Event
     * <p>
     * The instructional event for which the student’s attendance applies.
     * (Required)
     * 
     */
    @JsonProperty("instructionalEvent")
    public InstructionalEvent getInstructionalEvent() {
        return instructionalEvent;
    }

    /**
     * Instructional Event
     * <p>
     * The instructional event for which the student’s attendance applies.
     * (Required)
     * 
     */
    @JsonProperty("instructionalEvent")
    public void setInstructionalEvent(InstructionalEvent instructionalEvent) {
        this.instructionalEvent = instructionalEvent;
    }

    public StudentAttendances withInstructionalEvent(InstructionalEvent instructionalEvent) {
        this.instructionalEvent = instructionalEvent;
        return this;
    }

    /**
     * Instructional Event Instance
     * <p>
     * The instance of the instructional event for which attendance was taken.
     * 
     */
    @JsonProperty("instructionalEventInstance")
    public Object getInstructionalEventInstance() {
        return instructionalEventInstance;
    }

    /**
     * Instructional Event Instance
     * <p>
     * The instance of the instructional event for which attendance was taken.
     * 
     */
    @JsonProperty("instructionalEventInstance")
    public void setInstructionalEventInstance(Object instructionalEventInstance) {
        this.instructionalEventInstance = instructionalEventInstance;
    }

    public StudentAttendances withInstructionalEventInstance(Object instructionalEventInstance) {
        this.instructionalEventInstance = instructionalEventInstance;
        return this;
    }

    /**
     * Attendance Taken
     * <p>
     * The date and time for which the attendance applies.
     * (Required)
     * 
     */
    @JsonProperty("attendanceTaken")
    public Date getAttendanceTaken() {
        return attendanceTaken;
    }

    /**
     * Attendance Taken
     * <p>
     * The date and time for which the attendance applies.
     * (Required)
     * 
     */
    @JsonProperty("attendanceTaken")
    public void setAttendanceTaken(Date attendanceTaken) {
        this.attendanceTaken = attendanceTaken;
    }

    public StudentAttendances withAttendanceTaken(Date attendanceTaken) {
        this.attendanceTaken = attendanceTaken;
        return this;
    }

    /**
     * Attendance
     * <p>
     * The categorization of the student's attendance.
     * (Required)
     * 
     */
    @JsonProperty("attendance")
    public Attendance getAttendance() {
        return attendance;
    }

    /**
     * Attendance
     * <p>
     * The categorization of the student's attendance.
     * (Required)
     * 
     */
    @JsonProperty("attendance")
    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public StudentAttendances withAttendance(Attendance attendance) {
        this.attendance = attendance;
        return this;
    }

    /**
     * Percent Attended
     * <p>
     * The percentage of the total session time the student was in attendance.
     * 
     */
    @JsonProperty("percentAttended")
    public Object getPercentAttended() {
        return percentAttended;
    }

    /**
     * Percent Attended
     * <p>
     * The percentage of the total session time the student was in attendance.
     * 
     */
    @JsonProperty("percentAttended")
    public void setPercentAttended(Object percentAttended) {
        this.percentAttended = percentAttended;
    }

    public StudentAttendances withPercentAttended(Object percentAttended) {
        this.percentAttended = percentAttended;
        return this;
    }

    /**
     * Comment
     * <p>
     * Comments regarding the student’s attendance.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Comments regarding the student’s attendance.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public StudentAttendances withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAttendances.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("instructionalEvent");
        sb.append('=');
        sb.append(((this.instructionalEvent == null)?"<null>":this.instructionalEvent));
        sb.append(',');
        sb.append("instructionalEventInstance");
        sb.append('=');
        sb.append(((this.instructionalEventInstance == null)?"<null>":this.instructionalEventInstance));
        sb.append(',');
        sb.append("attendanceTaken");
        sb.append('=');
        sb.append(((this.attendanceTaken == null)?"<null>":this.attendanceTaken));
        sb.append(',');
        sb.append("attendance");
        sb.append('=');
        sb.append(((this.attendance == null)?"<null>":this.attendance));
        sb.append(',');
        sb.append("percentAttended");
        sb.append('=');
        sb.append(((this.percentAttended == null)?"<null>":this.percentAttended));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.percentAttended == null)? 0 :this.percentAttended.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.attendanceTaken == null)? 0 :this.attendanceTaken.hashCode()));
        result = ((result* 31)+((this.instructionalEvent == null)? 0 :this.instructionalEvent.hashCode()));
        result = ((result* 31)+((this.instructionalEventInstance == null)? 0 :this.instructionalEventInstance.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.attendance == null)? 0 :this.attendance.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAttendances) == false) {
            return false;
        }
        StudentAttendances rhs = ((StudentAttendances) other);
        return ((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.percentAttended == rhs.percentAttended)||((this.percentAttended!= null)&&this.percentAttended.equals(rhs.percentAttended))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.attendanceTaken == rhs.attendanceTaken)||((this.attendanceTaken!= null)&&this.attendanceTaken.equals(rhs.attendanceTaken))))&&((this.instructionalEvent == rhs.instructionalEvent)||((this.instructionalEvent!= null)&&this.instructionalEvent.equals(rhs.instructionalEvent))))&&((this.instructionalEventInstance == rhs.instructionalEventInstance)||((this.instructionalEventInstance!= null)&&this.instructionalEventInstance.equals(rhs.instructionalEventInstance))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.attendance == rhs.attendance)||((this.attendance!= null)&&this.attendance.equals(rhs.attendance))));
    }

}
