
package com.ellucian.generated.eedm.student_cohorts.v7_2_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Cohorts
 * <p>
 * The list of valid student cohorts.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "startOn",
    "endOn",
    "initialAcademicPeriod",
    "finalAcademicPeriod",
    "type"
})
@Generated("jsonschema2pojo")
public class StudentCohorts {

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
     * The global identifier of the student cohort.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student cohort.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the student cohort.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the student cohort.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the student cohort.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the student cohort.")
    private String description;
    /**
     * Code
     * <p>
     * The code that identifies the student cohort.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code that identifies the student cohort.")
    private String code;
    /**
     * Start On
     * <p>
     * The first date when when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date when when students may be assigned to the cohort.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date when when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when when students may be assigned to the cohort.")
    private Object endOn;
    /**
     * Initial Academic Period
     * <p>
     * The first academic period when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("initialAcademicPeriod")
    @JsonPropertyDescription("The first academic period when students may be assigned to the cohort.")
    private Object initialAcademicPeriod;
    /**
     * Final Academic Period
     * <p>
     * The last academic period when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("finalAcademicPeriod")
    @JsonPropertyDescription("The last academic period when students may be assigned to the cohort.")
    private Object finalAcademicPeriod;
    /**
     * Type
     * <p>
     * The type of cohort (e.g. federal).
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of cohort (e.g. federal).")
    private Object type;

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

    public StudentCohorts withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student cohort.
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
     * The global identifier of the student cohort.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentCohorts withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the student cohort.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the student cohort.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public StudentCohorts withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the student cohort.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the student cohort.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public StudentCohorts withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code that identifies the student cohort.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code that identifies the student cohort.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public StudentCohorts withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date when when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date when when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public StudentCohorts withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public StudentCohorts withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Initial Academic Period
     * <p>
     * The first academic period when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("initialAcademicPeriod")
    public Object getInitialAcademicPeriod() {
        return initialAcademicPeriod;
    }

    /**
     * Initial Academic Period
     * <p>
     * The first academic period when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("initialAcademicPeriod")
    public void setInitialAcademicPeriod(Object initialAcademicPeriod) {
        this.initialAcademicPeriod = initialAcademicPeriod;
    }

    public StudentCohorts withInitialAcademicPeriod(Object initialAcademicPeriod) {
        this.initialAcademicPeriod = initialAcademicPeriod;
        return this;
    }

    /**
     * Final Academic Period
     * <p>
     * The last academic period when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("finalAcademicPeriod")
    public Object getFinalAcademicPeriod() {
        return finalAcademicPeriod;
    }

    /**
     * Final Academic Period
     * <p>
     * The last academic period when students may be assigned to the cohort.
     * 
     */
    @JsonProperty("finalAcademicPeriod")
    public void setFinalAcademicPeriod(Object finalAcademicPeriod) {
        this.finalAcademicPeriod = finalAcademicPeriod;
    }

    public StudentCohorts withFinalAcademicPeriod(Object finalAcademicPeriod) {
        this.finalAcademicPeriod = finalAcademicPeriod;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of cohort (e.g. federal).
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of cohort (e.g. federal).
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public StudentCohorts withType(Object type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCohorts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("initialAcademicPeriod");
        sb.append('=');
        sb.append(((this.initialAcademicPeriod == null)?"<null>":this.initialAcademicPeriod));
        sb.append(',');
        sb.append("finalAcademicPeriod");
        sb.append('=');
        sb.append(((this.finalAcademicPeriod == null)?"<null>":this.finalAcademicPeriod));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.finalAcademicPeriod == null)? 0 :this.finalAcademicPeriod.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.initialAcademicPeriod == null)? 0 :this.initialAcademicPeriod.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCohorts) == false) {
            return false;
        }
        StudentCohorts rhs = ((StudentCohorts) other);
        return (((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.finalAcademicPeriod == rhs.finalAcademicPeriod)||((this.finalAcademicPeriod!= null)&&this.finalAcademicPeriod.equals(rhs.finalAcademicPeriod))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.initialAcademicPeriod == rhs.initialAcademicPeriod)||((this.initialAcademicPeriod!= null)&&this.initialAcademicPeriod.equals(rhs.initialAcademicPeriod))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
