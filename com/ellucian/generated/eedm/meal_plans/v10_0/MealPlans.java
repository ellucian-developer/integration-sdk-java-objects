
package com.ellucian.generated.eedm.meal_plans.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Meal Plans
 * <p>
 * The meal plans offered by the institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "studentResidentialCategories",
    "components",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class MealPlans {

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
     * The global identifier of the meal plan.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the meal plan.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the meal plan.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the meal plan.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the meal plan.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the meal plan.")
    private String description;
    /**
     * Code
     * <p>
     * The code of the meal plan.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code of the meal plan.")
    private String code;
    /**
     * Student Residential Categories
     * <p>
     * The residential categories of students to which the plan applies.
     * 
     */
    @JsonProperty("studentResidentialCategories")
    @JsonPropertyDescription("The residential categories of students to which the plan applies.")
    private List<StudentResidentialCategory> studentResidentialCategories = new ArrayList<StudentResidentialCategory>();
    /**
     * Components
     * <p>
     * The meal plan components.
     * 
     */
    @JsonProperty("components")
    @JsonPropertyDescription("The meal plan components.")
    private List<Component> components = new ArrayList<Component>();
    /**
     * Start On
     * <p>
     * The start date of the meal plan.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date of the meal plan.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The end date of the meal plan.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the meal plan.")
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

    public MealPlans withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the meal plan.
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
     * The global identifier of the meal plan.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MealPlans withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the meal plan.
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
     * The full name of the meal plan.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public MealPlans withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the meal plan.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the meal plan.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public MealPlans withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code of the meal plan.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code of the meal plan.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public MealPlans withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Student Residential Categories
     * <p>
     * The residential categories of students to which the plan applies.
     * 
     */
    @JsonProperty("studentResidentialCategories")
    public List<StudentResidentialCategory> getStudentResidentialCategories() {
        return studentResidentialCategories;
    }

    /**
     * Student Residential Categories
     * <p>
     * The residential categories of students to which the plan applies.
     * 
     */
    @JsonProperty("studentResidentialCategories")
    public void setStudentResidentialCategories(List<StudentResidentialCategory> studentResidentialCategories) {
        this.studentResidentialCategories = studentResidentialCategories;
    }

    public MealPlans withStudentResidentialCategories(List<StudentResidentialCategory> studentResidentialCategories) {
        this.studentResidentialCategories = studentResidentialCategories;
        return this;
    }

    /**
     * Components
     * <p>
     * The meal plan components.
     * 
     */
    @JsonProperty("components")
    public List<Component> getComponents() {
        return components;
    }

    /**
     * Components
     * <p>
     * The meal plan components.
     * 
     */
    @JsonProperty("components")
    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public MealPlans withComponents(List<Component> components) {
        this.components = components;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date of the meal plan.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date of the meal plan.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public MealPlans withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the meal plan.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the meal plan.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public MealPlans withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MealPlans.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("studentResidentialCategories");
        sb.append('=');
        sb.append(((this.studentResidentialCategories == null)?"<null>":this.studentResidentialCategories));
        sb.append(',');
        sb.append("components");
        sb.append('=');
        sb.append(((this.components == null)?"<null>":this.components));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.components == null)? 0 :this.components.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.studentResidentialCategories == null)? 0 :this.studentResidentialCategories.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
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
        if ((other instanceof MealPlans) == false) {
            return false;
        }
        MealPlans rhs = ((MealPlans) other);
        return ((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.components == rhs.components)||((this.components!= null)&&this.components.equals(rhs.components))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.studentResidentialCategories == rhs.studentResidentialCategories)||((this.studentResidentialCategories!= null)&&this.studentResidentialCategories.equals(rhs.studentResidentialCategories))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
