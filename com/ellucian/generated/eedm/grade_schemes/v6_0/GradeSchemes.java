
package com.ellucian.generated.eedm.grade_schemes.v6_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Grade Schemes
 * <p>
 * A specification for how grades should be calculated and reported for a course.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "code",
    "description",
    "academicLevel",
    "gradeMode",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class GradeSchemes {

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
     * A global identifier of a grade scheme.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a grade scheme.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of a grade scheme.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a grade scheme.")
    private String title;
    /**
     * Code
     * <p>
     * The code for the grade scheme that may be used a reference or for reporting.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code for the grade scheme that may be used a reference or for reporting.")
    private String code;
    /**
     * Description
     * <p>
     * The description of a grade scheme.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of a grade scheme.")
    private String description;
    /**
     * Academic Level
     * <p>
     * A designation of the level of instruction of a course or a program of study.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("A designation of the level of instruction of a course or a program of study.")
    private Object academicLevel;
    /**
     * Grade Mode
     * <p>
     * The grade mode associated with the grade scheme.
     * 
     */
    @JsonProperty("gradeMode")
    @JsonPropertyDescription("The grade mode associated with the grade scheme.")
    private Object gradeMode;
    /**
     * Start Date
     * <p>
     * The date after which a grade scheme may be used.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date after which a grade scheme may be used.")
    private Object startOn;
    /**
     * End Date
     * <p>
     * The date after which a grade scheme may no longer be used.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date after which a grade scheme may no longer be used.")
    private Object endOn;

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

    public GradeSchemes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a grade scheme.
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
     * A global identifier of a grade scheme.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GradeSchemes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a grade scheme.
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
     * The full name of a grade scheme.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public GradeSchemes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Code
     * <p>
     * The code for the grade scheme that may be used a reference or for reporting.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code for the grade scheme that may be used a reference or for reporting.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public GradeSchemes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of a grade scheme.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of a grade scheme.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GradeSchemes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * A designation of the level of instruction of a course or a program of study.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * A designation of the level of instruction of a course or a program of study.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public GradeSchemes withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Grade Mode
     * <p>
     * The grade mode associated with the grade scheme.
     * 
     */
    @JsonProperty("gradeMode")
    public Object getGradeMode() {
        return gradeMode;
    }

    /**
     * Grade Mode
     * <p>
     * The grade mode associated with the grade scheme.
     * 
     */
    @JsonProperty("gradeMode")
    public void setGradeMode(Object gradeMode) {
        this.gradeMode = gradeMode;
    }

    public GradeSchemes withGradeMode(Object gradeMode) {
        this.gradeMode = gradeMode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date after which a grade scheme may be used.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date after which a grade scheme may be used.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public GradeSchemes withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date after which a grade scheme may no longer be used.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The date after which a grade scheme may no longer be used.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public GradeSchemes withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeSchemes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("gradeMode");
        sb.append('=');
        sb.append(((this.gradeMode == null)?"<null>":this.gradeMode));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.gradeMode == null)? 0 :this.gradeMode.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeSchemes) == false) {
            return false;
        }
        GradeSchemes rhs = ((GradeSchemes) other);
        return ((((((((((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.gradeMode == rhs.gradeMode)||((this.gradeMode!= null)&&this.gradeMode.equals(rhs.gradeMode))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
