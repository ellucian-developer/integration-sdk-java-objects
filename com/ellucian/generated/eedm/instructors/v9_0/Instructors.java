
package com.ellucian.generated.eedm.instructors.v9_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Instructors
 * <p>
 * Information about individuals who provide instruction at an educational institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "instructor",
    "institutionalUnits",
    "primaryLocation",
    "category",
    "staffType",
    "tenure"
})
@Generated("jsonschema2pojo")
public class Instructors {

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
     * The global identifier of the instructor.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the instructor.")
    private String id;
    /**
     * Instructor
     * <p>
     * A link to the person filling the instructor role.
     * (Required)
     * 
     */
    @JsonProperty("instructor")
    @JsonPropertyDescription("A link to the person filling the instructor role.")
    private Instructor instructor;
    /**
     * Institutional Units
     * <p>
     * Information about the institutional units to which the instructor is assigned.
     * 
     */
    @JsonProperty("institutionalUnits")
    @JsonPropertyDescription("Information about the institutional units to which the instructor is assigned.")
    private List<InstitutionalUnit> institutionalUnits = new ArrayList<InstitutionalUnit>();
    /**
     * Primary Location
     * <p>
     * The location where the instructor typically performs his/her duties.
     * 
     */
    @JsonProperty("primaryLocation")
    @JsonPropertyDescription("The location where the instructor typically performs his/her duties.")
    private Object primaryLocation;
    /**
     * Category
     * <p>
     * The category to which the instructor belongs (e.g. professor, associate professor, adjunct professor, auxiliary, etc.)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The category to which the instructor belongs (e.g. professor, associate professor, adjunct professor, auxiliary, etc.)")
    private Object category;
    /**
     * Staff Type
     * <p>
     * The staff type of the instructor (e.g. full time, part time, continuing education).
     * 
     */
    @JsonProperty("staffType")
    @JsonPropertyDescription("The staff type of the instructor (e.g. full time, part time, continuing education).")
    private Object staffType;
    /**
     * Tenure
     * <p>
     * The tenure of the instructor.
     * 
     */
    @JsonProperty("tenure")
    @JsonPropertyDescription("The tenure of the instructor.")
    private Tenure tenure;

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

    public Instructors withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the instructor.
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
     * The global identifier of the instructor.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Instructors withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Instructor
     * <p>
     * A link to the person filling the instructor role.
     * (Required)
     * 
     */
    @JsonProperty("instructor")
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Instructor
     * <p>
     * A link to the person filling the instructor role.
     * (Required)
     * 
     */
    @JsonProperty("instructor")
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructors withInstructor(Instructor instructor) {
        this.instructor = instructor;
        return this;
    }

    /**
     * Institutional Units
     * <p>
     * Information about the institutional units to which the instructor is assigned.
     * 
     */
    @JsonProperty("institutionalUnits")
    public List<InstitutionalUnit> getInstitutionalUnits() {
        return institutionalUnits;
    }

    /**
     * Institutional Units
     * <p>
     * Information about the institutional units to which the instructor is assigned.
     * 
     */
    @JsonProperty("institutionalUnits")
    public void setInstitutionalUnits(List<InstitutionalUnit> institutionalUnits) {
        this.institutionalUnits = institutionalUnits;
    }

    public Instructors withInstitutionalUnits(List<InstitutionalUnit> institutionalUnits) {
        this.institutionalUnits = institutionalUnits;
        return this;
    }

    /**
     * Primary Location
     * <p>
     * The location where the instructor typically performs his/her duties.
     * 
     */
    @JsonProperty("primaryLocation")
    public Object getPrimaryLocation() {
        return primaryLocation;
    }

    /**
     * Primary Location
     * <p>
     * The location where the instructor typically performs his/her duties.
     * 
     */
    @JsonProperty("primaryLocation")
    public void setPrimaryLocation(Object primaryLocation) {
        this.primaryLocation = primaryLocation;
    }

    public Instructors withPrimaryLocation(Object primaryLocation) {
        this.primaryLocation = primaryLocation;
        return this;
    }

    /**
     * Category
     * <p>
     * The category to which the instructor belongs (e.g. professor, associate professor, adjunct professor, auxiliary, etc.)
     * 
     */
    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * The category to which the instructor belongs (e.g. professor, associate professor, adjunct professor, auxiliary, etc.)
     * 
     */
    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    public Instructors withCategory(Object category) {
        this.category = category;
        return this;
    }

    /**
     * Staff Type
     * <p>
     * The staff type of the instructor (e.g. full time, part time, continuing education).
     * 
     */
    @JsonProperty("staffType")
    public Object getStaffType() {
        return staffType;
    }

    /**
     * Staff Type
     * <p>
     * The staff type of the instructor (e.g. full time, part time, continuing education).
     * 
     */
    @JsonProperty("staffType")
    public void setStaffType(Object staffType) {
        this.staffType = staffType;
    }

    public Instructors withStaffType(Object staffType) {
        this.staffType = staffType;
        return this;
    }

    /**
     * Tenure
     * <p>
     * The tenure of the instructor.
     * 
     */
    @JsonProperty("tenure")
    public Tenure getTenure() {
        return tenure;
    }

    /**
     * Tenure
     * <p>
     * The tenure of the instructor.
     * 
     */
    @JsonProperty("tenure")
    public void setTenure(Tenure tenure) {
        this.tenure = tenure;
    }

    public Instructors withTenure(Tenure tenure) {
        this.tenure = tenure;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Instructors.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("instructor");
        sb.append('=');
        sb.append(((this.instructor == null)?"<null>":this.instructor));
        sb.append(',');
        sb.append("institutionalUnits");
        sb.append('=');
        sb.append(((this.institutionalUnits == null)?"<null>":this.institutionalUnits));
        sb.append(',');
        sb.append("primaryLocation");
        sb.append('=');
        sb.append(((this.primaryLocation == null)?"<null>":this.primaryLocation));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("staffType");
        sb.append('=');
        sb.append(((this.staffType == null)?"<null>":this.staffType));
        sb.append(',');
        sb.append("tenure");
        sb.append('=');
        sb.append(((this.tenure == null)?"<null>":this.tenure));
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
        result = ((result* 31)+((this.instructor == null)? 0 :this.instructor.hashCode()));
        result = ((result* 31)+((this.primaryLocation == null)? 0 :this.primaryLocation.hashCode()));
        result = ((result* 31)+((this.institutionalUnits == null)? 0 :this.institutionalUnits.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.staffType == null)? 0 :this.staffType.hashCode()));
        result = ((result* 31)+((this.tenure == null)? 0 :this.tenure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Instructors) == false) {
            return false;
        }
        Instructors rhs = ((Instructors) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.instructor == rhs.instructor)||((this.instructor!= null)&&this.instructor.equals(rhs.instructor))))&&((this.primaryLocation == rhs.primaryLocation)||((this.primaryLocation!= null)&&this.primaryLocation.equals(rhs.primaryLocation))))&&((this.institutionalUnits == rhs.institutionalUnits)||((this.institutionalUnits!= null)&&this.institutionalUnits.equals(rhs.institutionalUnits))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.staffType == rhs.staffType)||((this.staffType!= null)&&this.staffType.equals(rhs.staffType))))&&((this.tenure == rhs.tenure)||((this.tenure!= null)&&this.tenure.equals(rhs.tenure))));
    }

}
