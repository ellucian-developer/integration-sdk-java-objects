
package com.ellucian.generated.eedm.student_financial_aid_academic_progress_statuses.v15_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Financial Aid Academic Progress Statuses
 * <p>
 * The financial aid satisfactory academic progress (SAP) status of a person.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "status",
    "effectiveOn",
    "assignedOn",
    "type"
})
@Generated("jsonschema2pojo")
public class StudentFinancialAidAcademicProgressStatuses {

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
     * The global identifier of the student financial aid academic progress status.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student financial aid academic progress status.")
    private String id;
    /**
     * Person
     * <p>
     * The person associated with the financial aid satisfactory academic progress status.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person associated with the financial aid satisfactory academic progress status.")
    private Person person;
    /**
     * Status
     * <p>
     * The financial aid satisfactory academic progress status of the person.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The financial aid satisfactory academic progress status of the person.")
    private Status status;
    /**
     * Effective On
     * <p>
     * The date the financial aid satisfactory academic progress status is effective.
     * 
     */
    @JsonProperty("effectiveOn")
    @JsonPropertyDescription("The date the financial aid satisfactory academic progress status is effective.")
    private Object effectiveOn;
    /**
     * Assigned On
     * <p>
     * The date the financial aid satisfactory academic progress status was assigned.
     * 
     */
    @JsonProperty("assignedOn")
    @JsonPropertyDescription("The date the financial aid satisfactory academic progress status was assigned.")
    private Object assignedOn;
    /**
     * Type
     * <p>
     * The categorization of the financial aid satisfactory academic progress (SAP) status.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The categorization of the financial aid satisfactory academic progress (SAP) status.")
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

    public StudentFinancialAidAcademicProgressStatuses withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student financial aid academic progress status.
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
     * The global identifier of the student financial aid academic progress status.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentFinancialAidAcademicProgressStatuses withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person associated with the financial aid satisfactory academic progress status.
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
     * The person associated with the financial aid satisfactory academic progress status.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public StudentFinancialAidAcademicProgressStatuses withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Status
     * <p>
     * The financial aid satisfactory academic progress status of the person.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The financial aid satisfactory academic progress status of the person.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public StudentFinancialAidAcademicProgressStatuses withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Effective On
     * <p>
     * The date the financial aid satisfactory academic progress status is effective.
     * 
     */
    @JsonProperty("effectiveOn")
    public Object getEffectiveOn() {
        return effectiveOn;
    }

    /**
     * Effective On
     * <p>
     * The date the financial aid satisfactory academic progress status is effective.
     * 
     */
    @JsonProperty("effectiveOn")
    public void setEffectiveOn(Object effectiveOn) {
        this.effectiveOn = effectiveOn;
    }

    public StudentFinancialAidAcademicProgressStatuses withEffectiveOn(Object effectiveOn) {
        this.effectiveOn = effectiveOn;
        return this;
    }

    /**
     * Assigned On
     * <p>
     * The date the financial aid satisfactory academic progress status was assigned.
     * 
     */
    @JsonProperty("assignedOn")
    public Object getAssignedOn() {
        return assignedOn;
    }

    /**
     * Assigned On
     * <p>
     * The date the financial aid satisfactory academic progress status was assigned.
     * 
     */
    @JsonProperty("assignedOn")
    public void setAssignedOn(Object assignedOn) {
        this.assignedOn = assignedOn;
    }

    public StudentFinancialAidAcademicProgressStatuses withAssignedOn(Object assignedOn) {
        this.assignedOn = assignedOn;
        return this;
    }

    /**
     * Type
     * <p>
     * The categorization of the financial aid satisfactory academic progress (SAP) status.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The categorization of the financial aid satisfactory academic progress (SAP) status.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public StudentFinancialAidAcademicProgressStatuses withType(Object type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentFinancialAidAcademicProgressStatuses.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("effectiveOn");
        sb.append('=');
        sb.append(((this.effectiveOn == null)?"<null>":this.effectiveOn));
        sb.append(',');
        sb.append("assignedOn");
        sb.append('=');
        sb.append(((this.assignedOn == null)?"<null>":this.assignedOn));
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
        result = ((result* 31)+((this.effectiveOn == null)? 0 :this.effectiveOn.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.assignedOn == null)? 0 :this.assignedOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentFinancialAidAcademicProgressStatuses) == false) {
            return false;
        }
        StudentFinancialAidAcademicProgressStatuses rhs = ((StudentFinancialAidAcademicProgressStatuses) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.effectiveOn == rhs.effectiveOn)||((this.effectiveOn!= null)&&this.effectiveOn.equals(rhs.effectiveOn))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.assignedOn == rhs.assignedOn)||((this.assignedOn!= null)&&this.assignedOn.equals(rhs.assignedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
