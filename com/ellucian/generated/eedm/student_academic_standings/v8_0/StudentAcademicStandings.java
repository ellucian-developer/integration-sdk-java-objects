
package com.ellucian.generated.eedm.student_academic_standings.v8_0;

import java.util.HashMap;
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
 * Student Academic Standings
 * <p>
 * The calculated academic standings of students.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "student",
    "type",
    "level",
    "program",
    "academicPeriod",
    "standing",
    "overrideStanding",
    "overrideReason"
})
@Generated("jsonschema2pojo")
public class StudentAcademicStandings {

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
     * The global identifier of the student academic standing.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student academic standing.")
    private String id;
    /**
     * Student
     * <p>
     * The student associated with the academic standing.
     * (Required)
     * 
     */
    @JsonProperty("student")
    @JsonPropertyDescription("The student associated with the academic standing.")
    private Student student;
    /**
     * Type
     * <p>
     * The type of academic standing calculation used to determine the student academic standing (e.g. level, program, academicPeriod).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of academic standing calculation used to determine the student academic standing (e.g. level, program, academicPeriod).")
    private StudentAcademicStandings.Type type;
    /**
     * Level
     * <p>
     * The academic level associated with the student academic standing.
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("The academic level associated with the student academic standing.")
    private Object level;
    /**
     * Program
     * <p>
     * The academic program associated with the student academic standing.
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("The academic program associated with the student academic standing.")
    private Object program;
    /**
     * Academic Period
     * <p>
     * The academic period associated with the student academic standing.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period associated with the student academic standing.")
    private Object academicPeriod;
    /**
     * Standing
     * <p>
     * The academic standing calculated for the student.
     * (Required)
     * 
     */
    @JsonProperty("standing")
    @JsonPropertyDescription("The academic standing calculated for the student.")
    private Standing standing;
    /**
     * Override Standing
     * <p>
     * A manually entered override of the calculated academic standing.
     * 
     */
    @JsonProperty("overrideStanding")
    @JsonPropertyDescription("A manually entered override of the calculated academic standing.")
    private Object overrideStanding;
    /**
     * Override Reason
     * <p>
     * The reason the calculated academic standing was overridden.
     * 
     */
    @JsonProperty("overrideReason")
    @JsonPropertyDescription("The reason the calculated academic standing was overridden.")
    private String overrideReason;

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

    public StudentAcademicStandings withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student academic standing.
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
     * The global identifier of the student academic standing.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAcademicStandings withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Student
     * <p>
     * The student associated with the academic standing.
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
     * The student associated with the academic standing.
     * (Required)
     * 
     */
    @JsonProperty("student")
    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentAcademicStandings withStudent(Student student) {
        this.student = student;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of academic standing calculation used to determine the student academic standing (e.g. level, program, academicPeriod).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public StudentAcademicStandings.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of academic standing calculation used to determine the student academic standing (e.g. level, program, academicPeriod).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(StudentAcademicStandings.Type type) {
        this.type = type;
    }

    public StudentAcademicStandings withType(StudentAcademicStandings.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Level
     * <p>
     * The academic level associated with the student academic standing.
     * 
     */
    @JsonProperty("level")
    public Object getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * The academic level associated with the student academic standing.
     * 
     */
    @JsonProperty("level")
    public void setLevel(Object level) {
        this.level = level;
    }

    public StudentAcademicStandings withLevel(Object level) {
        this.level = level;
        return this;
    }

    /**
     * Program
     * <p>
     * The academic program associated with the student academic standing.
     * 
     */
    @JsonProperty("program")
    public Object getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * The academic program associated with the student academic standing.
     * 
     */
    @JsonProperty("program")
    public void setProgram(Object program) {
        this.program = program;
    }

    public StudentAcademicStandings withProgram(Object program) {
        this.program = program;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period associated with the student academic standing.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period associated with the student academic standing.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public StudentAcademicStandings withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Standing
     * <p>
     * The academic standing calculated for the student.
     * (Required)
     * 
     */
    @JsonProperty("standing")
    public Standing getStanding() {
        return standing;
    }

    /**
     * Standing
     * <p>
     * The academic standing calculated for the student.
     * (Required)
     * 
     */
    @JsonProperty("standing")
    public void setStanding(Standing standing) {
        this.standing = standing;
    }

    public StudentAcademicStandings withStanding(Standing standing) {
        this.standing = standing;
        return this;
    }

    /**
     * Override Standing
     * <p>
     * A manually entered override of the calculated academic standing.
     * 
     */
    @JsonProperty("overrideStanding")
    public Object getOverrideStanding() {
        return overrideStanding;
    }

    /**
     * Override Standing
     * <p>
     * A manually entered override of the calculated academic standing.
     * 
     */
    @JsonProperty("overrideStanding")
    public void setOverrideStanding(Object overrideStanding) {
        this.overrideStanding = overrideStanding;
    }

    public StudentAcademicStandings withOverrideStanding(Object overrideStanding) {
        this.overrideStanding = overrideStanding;
        return this;
    }

    /**
     * Override Reason
     * <p>
     * The reason the calculated academic standing was overridden.
     * 
     */
    @JsonProperty("overrideReason")
    public String getOverrideReason() {
        return overrideReason;
    }

    /**
     * Override Reason
     * <p>
     * The reason the calculated academic standing was overridden.
     * 
     */
    @JsonProperty("overrideReason")
    public void setOverrideReason(String overrideReason) {
        this.overrideReason = overrideReason;
    }

    public StudentAcademicStandings withOverrideReason(String overrideReason) {
        this.overrideReason = overrideReason;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAcademicStandings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("standing");
        sb.append('=');
        sb.append(((this.standing == null)?"<null>":this.standing));
        sb.append(',');
        sb.append("overrideStanding");
        sb.append('=');
        sb.append(((this.overrideStanding == null)?"<null>":this.overrideStanding));
        sb.append(',');
        sb.append("overrideReason");
        sb.append('=');
        sb.append(((this.overrideReason == null)?"<null>":this.overrideReason));
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
        result = ((result* 31)+((this.standing == null)? 0 :this.standing.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.overrideStanding == null)? 0 :this.overrideStanding.hashCode()));
        result = ((result* 31)+((this.student == null)? 0 :this.student.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.overrideReason == null)? 0 :this.overrideReason.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAcademicStandings) == false) {
            return false;
        }
        StudentAcademicStandings rhs = ((StudentAcademicStandings) other);
        return (((((((((((this.standing == rhs.standing)||((this.standing!= null)&&this.standing.equals(rhs.standing)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.overrideStanding == rhs.overrideStanding)||((this.overrideStanding!= null)&&this.overrideStanding.equals(rhs.overrideStanding))))&&((this.student == rhs.student)||((this.student!= null)&&this.student.equals(rhs.student))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.overrideReason == rhs.overrideReason)||((this.overrideReason!= null)&&this.overrideReason.equals(rhs.overrideReason))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Type
     * <p>
     * The type of academic standing calculation used to determine the student academic standing (e.g. level, program, academicPeriod).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        LEVEL("level"),
        PROGRAM("program"),
        ACADEMIC_PERIOD("academicPeriod");
        private final String value;
        private final static Map<String, StudentAcademicStandings.Type> CONSTANTS = new HashMap<String, StudentAcademicStandings.Type>();

        static {
            for (StudentAcademicStandings.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static StudentAcademicStandings.Type fromValue(String value) {
            StudentAcademicStandings.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
