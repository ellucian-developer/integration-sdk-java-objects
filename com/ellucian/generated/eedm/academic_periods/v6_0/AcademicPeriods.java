
package com.ellucian.generated.eedm.academic_periods.v6_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Academic Periods
 * <p>
 * A specified interval of time used by higher education institutions (for example, Academic Year or Term).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "code",
    "title",
    "description",
    "startOn",
    "endOn",
    "category"
})
@Generated("jsonschema2pojo")
public class AcademicPeriods {

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
     * A global identifier of an academic period.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of an academic period.")
    private String id;
    /**
     * Code
     * <p>
     * A code that identifies an academic period.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that identifies an academic period.")
    private String code;
    /**
     * Title
     * <p>
     * The full name of an academic period (for example, 'Fall 2014').
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an academic period (for example, 'Fall 2014').")
    private String title;
    /**
     * Description
     * <p>
     * A description of an academic period.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of an academic period.")
    private String description;
    /**
     * Period Start Date
     * <p>
     * The date on which an academic period begins.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date on which an academic period begins.")
    private Date startOn;
    /**
     * Period End Date
     * <p>
     * The date on which an academic period ends.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date on which an academic period ends.")
    private Date endOn;
    /**
     * Category
     * <p>
     * A category for the academic period.
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A category for the academic period.")
    private Object category;

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

    public AcademicPeriods withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of an academic period.
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
     * A global identifier of an academic period.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AcademicPeriods withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that identifies an academic period.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that identifies an academic period.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AcademicPeriods withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an academic period (for example, 'Fall 2014').
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
     * The full name of an academic period (for example, 'Fall 2014').
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AcademicPeriods withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A description of an academic period.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of an academic period.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AcademicPeriods withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Period Start Date
     * <p>
     * The date on which an academic period begins.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Period Start Date
     * <p>
     * The date on which an academic period begins.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public AcademicPeriods withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * Period End Date
     * <p>
     * The date on which an academic period ends.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public Date getEndOn() {
        return endOn;
    }

    /**
     * Period End Date
     * <p>
     * The date on which an academic period ends.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Date endOn) {
        this.endOn = endOn;
    }

    public AcademicPeriods withEndOn(Date endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Category
     * <p>
     * A category for the academic period.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * A category for the academic period.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    public AcademicPeriods withCategory(Object category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicPeriods.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicPeriods) == false) {
            return false;
        }
        AcademicPeriods rhs = ((AcademicPeriods) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))));
    }

}
