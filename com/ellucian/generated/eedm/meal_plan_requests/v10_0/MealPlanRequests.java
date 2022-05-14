
package com.ellucian.generated.eedm.meal_plan_requests.v10_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Meal Plan Requests
 * <p>
 * Requests for campus meal plans.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "mealPlan",
    "academicPeriod",
    "startOn",
    "endOn",
    "submittedOn",
    "status"
})
@Generated("jsonschema2pojo")
public class MealPlanRequests {

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
     * The global identifier of the meal plan request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the meal plan request.")
    private String id;
    /**
     * Person
     * <p>
     * The person applying for the meal plan.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person applying for the meal plan.")
    private Person person;
    /**
     * Meal Plan
     * <p>
     * The meal plan the person requested.
     * (Required)
     * 
     */
    @JsonProperty("mealPlan")
    @JsonPropertyDescription("The meal plan the person requested.")
    private MealPlan mealPlan;
    /**
     * Academic Period
     * <p>
     * The academic period for which the meal plan is requested.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period for which the meal plan is requested.")
    private Object academicPeriod;
    /**
     * Start On
     * <p>
     * The requested start date of the meal plan.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The requested start date of the meal plan.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The requested end date of the meal plan.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The requested end date of the meal plan.")
    private Object endOn;
    /**
     * Submitted On
     * <p>
     * The date when the request was submitted.
     * 
     */
    @JsonProperty("submittedOn")
    @JsonPropertyDescription("The date when the request was submitted.")
    private Object submittedOn;
    /**
     * Status
     * <p>
     * The status of the request.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the request.")
    private Object status;

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

    public MealPlanRequests withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the meal plan request.
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
     * The global identifier of the meal plan request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MealPlanRequests withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person applying for the meal plan.
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
     * The person applying for the meal plan.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public MealPlanRequests withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Meal Plan
     * <p>
     * The meal plan the person requested.
     * (Required)
     * 
     */
    @JsonProperty("mealPlan")
    public MealPlan getMealPlan() {
        return mealPlan;
    }

    /**
     * Meal Plan
     * <p>
     * The meal plan the person requested.
     * (Required)
     * 
     */
    @JsonProperty("mealPlan")
    public void setMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    public MealPlanRequests withMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for which the meal plan is requested.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for which the meal plan is requested.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public MealPlanRequests withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Start On
     * <p>
     * The requested start date of the meal plan.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The requested start date of the meal plan.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public MealPlanRequests withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The requested end date of the meal plan.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The requested end date of the meal plan.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public MealPlanRequests withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Submitted On
     * <p>
     * The date when the request was submitted.
     * 
     */
    @JsonProperty("submittedOn")
    public Object getSubmittedOn() {
        return submittedOn;
    }

    /**
     * Submitted On
     * <p>
     * The date when the request was submitted.
     * 
     */
    @JsonProperty("submittedOn")
    public void setSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
    }

    public MealPlanRequests withSubmittedOn(Object submittedOn) {
        this.submittedOn = submittedOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the request.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the request.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public MealPlanRequests withStatus(Object status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MealPlanRequests.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("mealPlan");
        sb.append('=');
        sb.append(((this.mealPlan == null)?"<null>":this.mealPlan));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("submittedOn");
        sb.append('=');
        sb.append(((this.submittedOn == null)?"<null>":this.submittedOn));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.submittedOn == null)? 0 :this.submittedOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.mealPlan == null)? 0 :this.mealPlan.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MealPlanRequests) == false) {
            return false;
        }
        MealPlanRequests rhs = ((MealPlanRequests) other);
        return ((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.submittedOn == rhs.submittedOn)||((this.submittedOn!= null)&&this.submittedOn.equals(rhs.submittedOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.mealPlan == rhs.mealPlan)||((this.mealPlan!= null)&&this.mealPlan.equals(rhs.mealPlan))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
