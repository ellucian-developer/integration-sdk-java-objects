
package com.ellucian.generated.eedm.instructors.v8_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "school",
    "division",
    "department",
    "percentage"
})
@Generated("jsonschema2pojo")
public class InstitutionalUnit {

    /**
     * School
     * <p>
     * The school to which the instructor is assigned.
     * 
     */
    @JsonProperty("school")
    @JsonPropertyDescription("The school to which the instructor is assigned.")
    private Object school;
    /**
     * Division
     * <p>
     * The division to which the instructor is assigned.
     * 
     */
    @JsonProperty("division")
    @JsonPropertyDescription("The division to which the instructor is assigned.")
    private Object division;
    /**
     * Department
     * <p>
     * The department to which the instructor is assigned.
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("The department to which the instructor is assigned.")
    private Object department;
    /**
     * Percentage
     * <p>
     * The percentage of the instructor's workload allocated to the institutional unit.
     * 
     */
    @JsonProperty("percentage")
    @JsonPropertyDescription("The percentage of the instructor's workload allocated to the institutional unit.")
    private Object percentage;

    /**
     * School
     * <p>
     * The school to which the instructor is assigned.
     * 
     */
    @JsonProperty("school")
    public Object getSchool() {
        return school;
    }

    /**
     * School
     * <p>
     * The school to which the instructor is assigned.
     * 
     */
    @JsonProperty("school")
    public void setSchool(Object school) {
        this.school = school;
    }

    public InstitutionalUnit withSchool(Object school) {
        this.school = school;
        return this;
    }

    /**
     * Division
     * <p>
     * The division to which the instructor is assigned.
     * 
     */
    @JsonProperty("division")
    public Object getDivision() {
        return division;
    }

    /**
     * Division
     * <p>
     * The division to which the instructor is assigned.
     * 
     */
    @JsonProperty("division")
    public void setDivision(Object division) {
        this.division = division;
    }

    public InstitutionalUnit withDivision(Object division) {
        this.division = division;
        return this;
    }

    /**
     * Department
     * <p>
     * The department to which the instructor is assigned.
     * 
     */
    @JsonProperty("department")
    public Object getDepartment() {
        return department;
    }

    /**
     * Department
     * <p>
     * The department to which the instructor is assigned.
     * 
     */
    @JsonProperty("department")
    public void setDepartment(Object department) {
        this.department = department;
    }

    public InstitutionalUnit withDepartment(Object department) {
        this.department = department;
        return this;
    }

    /**
     * Percentage
     * <p>
     * The percentage of the instructor's workload allocated to the institutional unit.
     * 
     */
    @JsonProperty("percentage")
    public Object getPercentage() {
        return percentage;
    }

    /**
     * Percentage
     * <p>
     * The percentage of the instructor's workload allocated to the institutional unit.
     * 
     */
    @JsonProperty("percentage")
    public void setPercentage(Object percentage) {
        this.percentage = percentage;
    }

    public InstitutionalUnit withPercentage(Object percentage) {
        this.percentage = percentage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstitutionalUnit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("school");
        sb.append('=');
        sb.append(((this.school == null)?"<null>":this.school));
        sb.append(',');
        sb.append("division");
        sb.append('=');
        sb.append(((this.division == null)?"<null>":this.division));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("percentage");
        sb.append('=');
        sb.append(((this.percentage == null)?"<null>":this.percentage));
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
        result = ((result* 31)+((this.division == null)? 0 :this.division.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.school == null)? 0 :this.school.hashCode()));
        result = ((result* 31)+((this.percentage == null)? 0 :this.percentage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstitutionalUnit) == false) {
            return false;
        }
        InstitutionalUnit rhs = ((InstitutionalUnit) other);
        return (((((this.division == rhs.division)||((this.division!= null)&&this.division.equals(rhs.division)))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.school == rhs.school)||((this.school!= null)&&this.school.equals(rhs.school))))&&((this.percentage == rhs.percentage)||((this.percentage!= null)&&this.percentage.equals(rhs.percentage))));
    }

}
