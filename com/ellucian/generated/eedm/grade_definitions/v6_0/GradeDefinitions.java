
package com.ellucian.generated.eedm.grade_definitions.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Grade Definitions
 * <p>
 * A unit of measurement of how well a student completed a course.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "scheme",
    "grade",
    "credit",
    "equivalentTo"
})
@Generated("jsonschema2pojo")
public class GradeDefinitions {

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
     * Id
     * <p>
     * The global identifier of the grade.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the grade.")
    private String id;
    /**
     * Grade Scheme
     * <p>
     * The grade scheme that defines the context of the grade scheme item.
     * (Required)
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("The grade scheme that defines the context of the grade scheme item.")
    private Scheme scheme;
    /**
     * Grade
     * <p>
     * The literal value or numeric range of the grade.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The literal value or numeric range of the grade.")
    private Object grade;
    /**
     * Credit
     * <p>
     * What degree of credit this grade qualifies for.
     * 
     */
    @JsonProperty("credit")
    @JsonPropertyDescription("What degree of credit this grade qualifies for.")
    private Object credit;
    /**
     * Equivalent Grades
     * <p>
     * A list of mappings to equivalent grades from other grade schemes.
     * 
     */
    @JsonProperty("equivalentTo")
    @JsonPropertyDescription("A list of mappings to equivalent grades from other grade schemes.")
    private List<EquivalentTo> equivalentTo = new ArrayList<EquivalentTo>();

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

    public GradeDefinitions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Id
     * <p>
     * The global identifier of the grade.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * The global identifier of the grade.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GradeDefinitions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Grade Scheme
     * <p>
     * The grade scheme that defines the context of the grade scheme item.
     * (Required)
     * 
     */
    @JsonProperty("scheme")
    public Scheme getScheme() {
        return scheme;
    }

    /**
     * Grade Scheme
     * <p>
     * The grade scheme that defines the context of the grade scheme item.
     * (Required)
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(Scheme scheme) {
        this.scheme = scheme;
    }

    public GradeDefinitions withScheme(Scheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Grade
     * <p>
     * The literal value or numeric range of the grade.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public Object getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The literal value or numeric range of the grade.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public void setGrade(Object grade) {
        this.grade = grade;
    }

    public GradeDefinitions withGrade(Object grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Credit
     * <p>
     * What degree of credit this grade qualifies for.
     * 
     */
    @JsonProperty("credit")
    public Object getCredit() {
        return credit;
    }

    /**
     * Credit
     * <p>
     * What degree of credit this grade qualifies for.
     * 
     */
    @JsonProperty("credit")
    public void setCredit(Object credit) {
        this.credit = credit;
    }

    public GradeDefinitions withCredit(Object credit) {
        this.credit = credit;
        return this;
    }

    /**
     * Equivalent Grades
     * <p>
     * A list of mappings to equivalent grades from other grade schemes.
     * 
     */
    @JsonProperty("equivalentTo")
    public List<EquivalentTo> getEquivalentTo() {
        return equivalentTo;
    }

    /**
     * Equivalent Grades
     * <p>
     * A list of mappings to equivalent grades from other grade schemes.
     * 
     */
    @JsonProperty("equivalentTo")
    public void setEquivalentTo(List<EquivalentTo> equivalentTo) {
        this.equivalentTo = equivalentTo;
    }

    public GradeDefinitions withEquivalentTo(List<EquivalentTo> equivalentTo) {
        this.equivalentTo = equivalentTo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeDefinitions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("credit");
        sb.append('=');
        sb.append(((this.credit == null)?"<null>":this.credit));
        sb.append(',');
        sb.append("equivalentTo");
        sb.append('=');
        sb.append(((this.equivalentTo == null)?"<null>":this.equivalentTo));
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
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.equivalentTo == null)? 0 :this.equivalentTo.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.credit == null)? 0 :this.credit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeDefinitions) == false) {
            return false;
        }
        GradeDefinitions rhs = ((GradeDefinitions) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.equivalentTo == rhs.equivalentTo)||((this.equivalentTo!= null)&&this.equivalentTo.equals(rhs.equivalentTo))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.credit == rhs.credit)||((this.credit!= null)&&this.credit.equals(rhs.credit))));
    }

}
