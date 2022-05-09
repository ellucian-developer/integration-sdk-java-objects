
package com.ellucian.generated.eedm.constituent_contact_preferences.v1_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Contact Preferences
 * <p>
 * The contact preferences specified by constituents.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "constituent",
    "type",
    "status",
    "method",
    "source",
    "college",
    "department",
    "usage",
    "comment"
})
@Generated("jsonschema2pojo")
public class ConstituentContactPreferences {

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
     * The global identifier of the constituent contact preference.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent contact preference.")
    private String id;
    /**
     * Constituent
     * <p>
     * The constituent for whom the contact preference is specified.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The constituent for whom the contact preference is specified.")
    private Object constituent;
    /**
     * Type
     * <p>
     * The contact preference type (e.g. solicitations, events, fundraising).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The contact preference type (e.g. solicitations, events, fundraising).")
    private Type type;
    /**
     * Status
     * <p>
     * The status of the contact preference.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the contact preference.")
    private Status status;
    /**
     * Method
     * <p>
     * The preferred method of contact.
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("The preferred method of contact.")
    private Object method;
    /**
     * Source
     * <p>
     * The source of the constituent contact preference.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the constituent contact preference.")
    private Object source;
    /**
     * College
     * <p>
     * The college associated with the contact preference.
     * 
     */
    @JsonProperty("college")
    @JsonPropertyDescription("The college associated with the contact preference.")
    private Object college;
    /**
     * Department
     * <p>
     * The department associated with the contact preference.
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("The department associated with the contact preference.")
    private Object department;
    /**
     * Usage
     * <p>
     * The usage details associated with the contact preferences.
     * 
     */
    @JsonProperty("usage")
    @JsonPropertyDescription("The usage details associated with the contact preferences.")
    private Object usage;
    /**
     * Comment
     * <p>
     * The comment associated with the constituent contact preference.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the constituent contact preference.")
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

    public ConstituentContactPreferences withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent contact preference.
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
     * The global identifier of the constituent contact preference.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentContactPreferences withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Constituent
     * <p>
     * The constituent for whom the contact preference is specified.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public Object getConstituent() {
        return constituent;
    }

    /**
     * Constituent
     * <p>
     * The constituent for whom the contact preference is specified.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public ConstituentContactPreferences withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    /**
     * Type
     * <p>
     * The contact preference type (e.g. solicitations, events, fundraising).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The contact preference type (e.g. solicitations, events, fundraising).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public ConstituentContactPreferences withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the contact preference.
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
     * The status of the contact preference.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public ConstituentContactPreferences withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Method
     * <p>
     * The preferred method of contact.
     * 
     */
    @JsonProperty("method")
    public Object getMethod() {
        return method;
    }

    /**
     * Method
     * <p>
     * The preferred method of contact.
     * 
     */
    @JsonProperty("method")
    public void setMethod(Object method) {
        this.method = method;
    }

    public ConstituentContactPreferences withMethod(Object method) {
        this.method = method;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the constituent contact preference.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the constituent contact preference.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentContactPreferences withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * College
     * <p>
     * The college associated with the contact preference.
     * 
     */
    @JsonProperty("college")
    public Object getCollege() {
        return college;
    }

    /**
     * College
     * <p>
     * The college associated with the contact preference.
     * 
     */
    @JsonProperty("college")
    public void setCollege(Object college) {
        this.college = college;
    }

    public ConstituentContactPreferences withCollege(Object college) {
        this.college = college;
        return this;
    }

    /**
     * Department
     * <p>
     * The department associated with the contact preference.
     * 
     */
    @JsonProperty("department")
    public Object getDepartment() {
        return department;
    }

    /**
     * Department
     * <p>
     * The department associated with the contact preference.
     * 
     */
    @JsonProperty("department")
    public void setDepartment(Object department) {
        this.department = department;
    }

    public ConstituentContactPreferences withDepartment(Object department) {
        this.department = department;
        return this;
    }

    /**
     * Usage
     * <p>
     * The usage details associated with the contact preferences.
     * 
     */
    @JsonProperty("usage")
    public Object getUsage() {
        return usage;
    }

    /**
     * Usage
     * <p>
     * The usage details associated with the contact preferences.
     * 
     */
    @JsonProperty("usage")
    public void setUsage(Object usage) {
        this.usage = usage;
    }

    public ConstituentContactPreferences withUsage(Object usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the constituent contact preference.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the constituent contact preference.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ConstituentContactPreferences withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentContactPreferences.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("college");
        sb.append('=');
        sb.append(((this.college == null)?"<null>":this.college));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
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
        result = ((result* 31)+((this.college == null)? 0 :this.college.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentContactPreferences) == false) {
            return false;
        }
        ConstituentContactPreferences rhs = ((ConstituentContactPreferences) other);
        return ((((((((((((this.college == rhs.college)||((this.college!= null)&&this.college.equals(rhs.college)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))))&&((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent))))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
