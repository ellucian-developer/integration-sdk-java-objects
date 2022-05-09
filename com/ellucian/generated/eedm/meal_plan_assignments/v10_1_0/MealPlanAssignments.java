
package com.ellucian.generated.eedm.meal_plan_assignments.v10_1_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Meal Plan Assignments
 * <p>
 * Assignments of meal plans to a person.
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
    "status",
    "statusDate",
    "assignedRate",
    "rateOverride",
    "numberOfPeriods",
    "mealCard",
    "consumption",
    "comment"
})
@Generated("jsonschema2pojo")
public class MealPlanAssignments {

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
     * The global identifier of the meal plan assignment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the meal plan assignment.")
    private String id;
    /**
     * Person
     * <p>
     * The person to whom a meal plan is assigned.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person to whom a meal plan is assigned.")
    private Person person;
    /**
     * Meal Plan
     * <p>
     * The meal plan assigned to the person.
     * (Required)
     * 
     */
    @JsonProperty("mealPlan")
    @JsonPropertyDescription("The meal plan assigned to the person.")
    private MealPlan mealPlan;
    /**
     * Academic Period
     * <p>
     * The academic period for the meal plan assignment.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period for the meal plan assignment.")
    private Object academicPeriod;
    /**
     * Start On
     * <p>
     * The start date when the meal plan assignments become effective.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date when the meal plan assignments become effective.")
    private Date startOn;
    /**
     * End On
     * <p>
     * The end date of the meal plan assignment.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date of the meal plan assignment.")
    private Object endOn;
    /**
     * Status
     * <p>
     * The status of the meal plan assignment.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the meal plan assignment.")
    private MealPlanAssignments.Status status;
    /**
     * Status Date
     * <p>
     * The date when the meal plan assignment status was set or modified.
     * (Required)
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("The date when the meal plan assignment status was set or modified.")
    private Date statusDate;
    /**
     * Assigned Rate
     * <p>
     * The effective regular rate for the meal plan assignment.
     * 
     */
    @JsonProperty("assignedRate")
    @JsonPropertyDescription("The effective regular rate for the meal plan assignment.")
    private Object assignedRate;
    /**
     * Rate Override
     * <p>
     * The override rate for the meal plan assignment.
     * 
     */
    @JsonProperty("rateOverride")
    @JsonPropertyDescription("The override rate for the meal plan assignment.")
    private Object rateOverride;
    /**
     * Number Of Periods
     * <p>
     * The number of time periods in the meal plan assignment.
     * 
     */
    @JsonProperty("numberOfPeriods")
    @JsonPropertyDescription("The number of time periods in the meal plan assignment.")
    private Object numberOfPeriods;
    /**
     * Meal Card
     * <p>
     * The meal card associated with the meal plan assignment.
     * 
     */
    @JsonProperty("mealCard")
    @JsonPropertyDescription("The meal card associated with the meal plan assignment.")
    private String mealCard;
    /**
     * Consumption
     * <p>
     * The number or percentage of units consumed by the person on the plan.
     * 
     */
    @JsonProperty("consumption")
    @JsonPropertyDescription("The number or percentage of units consumed by the person on the plan.")
    private Object consumption;
    /**
     * Comment
     * <p>
     * Any comment that may have been generated for the meal plan.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Any comment that may have been generated for the meal plan.")
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

    public MealPlanAssignments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the meal plan assignment.
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
     * The global identifier of the meal plan assignment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MealPlanAssignments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person to whom a meal plan is assigned.
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
     * The person to whom a meal plan is assigned.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public MealPlanAssignments withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Meal Plan
     * <p>
     * The meal plan assigned to the person.
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
     * The meal plan assigned to the person.
     * (Required)
     * 
     */
    @JsonProperty("mealPlan")
    public void setMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    public MealPlanAssignments withMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for the meal plan assignment.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for the meal plan assignment.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public MealPlanAssignments withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date when the meal plan assignments become effective.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date when the meal plan assignments become effective.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public MealPlanAssignments withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date of the meal plan assignment.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date of the meal plan assignment.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public MealPlanAssignments withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the meal plan assignment.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public MealPlanAssignments.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the meal plan assignment.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(MealPlanAssignments.Status status) {
        this.status = status;
    }

    public MealPlanAssignments withStatus(MealPlanAssignments.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Status Date
     * <p>
     * The date when the meal plan assignment status was set or modified.
     * (Required)
     * 
     */
    @JsonProperty("statusDate")
    public Date getStatusDate() {
        return statusDate;
    }

    /**
     * Status Date
     * <p>
     * The date when the meal plan assignment status was set or modified.
     * (Required)
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public MealPlanAssignments withStatusDate(Date statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Assigned Rate
     * <p>
     * The effective regular rate for the meal plan assignment.
     * 
     */
    @JsonProperty("assignedRate")
    public Object getAssignedRate() {
        return assignedRate;
    }

    /**
     * Assigned Rate
     * <p>
     * The effective regular rate for the meal plan assignment.
     * 
     */
    @JsonProperty("assignedRate")
    public void setAssignedRate(Object assignedRate) {
        this.assignedRate = assignedRate;
    }

    public MealPlanAssignments withAssignedRate(Object assignedRate) {
        this.assignedRate = assignedRate;
        return this;
    }

    /**
     * Rate Override
     * <p>
     * The override rate for the meal plan assignment.
     * 
     */
    @JsonProperty("rateOverride")
    public Object getRateOverride() {
        return rateOverride;
    }

    /**
     * Rate Override
     * <p>
     * The override rate for the meal plan assignment.
     * 
     */
    @JsonProperty("rateOverride")
    public void setRateOverride(Object rateOverride) {
        this.rateOverride = rateOverride;
    }

    public MealPlanAssignments withRateOverride(Object rateOverride) {
        this.rateOverride = rateOverride;
        return this;
    }

    /**
     * Number Of Periods
     * <p>
     * The number of time periods in the meal plan assignment.
     * 
     */
    @JsonProperty("numberOfPeriods")
    public Object getNumberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * Number Of Periods
     * <p>
     * The number of time periods in the meal plan assignment.
     * 
     */
    @JsonProperty("numberOfPeriods")
    public void setNumberOfPeriods(Object numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }

    public MealPlanAssignments withNumberOfPeriods(Object numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
        return this;
    }

    /**
     * Meal Card
     * <p>
     * The meal card associated with the meal plan assignment.
     * 
     */
    @JsonProperty("mealCard")
    public String getMealCard() {
        return mealCard;
    }

    /**
     * Meal Card
     * <p>
     * The meal card associated with the meal plan assignment.
     * 
     */
    @JsonProperty("mealCard")
    public void setMealCard(String mealCard) {
        this.mealCard = mealCard;
    }

    public MealPlanAssignments withMealCard(String mealCard) {
        this.mealCard = mealCard;
        return this;
    }

    /**
     * Consumption
     * <p>
     * The number or percentage of units consumed by the person on the plan.
     * 
     */
    @JsonProperty("consumption")
    public Object getConsumption() {
        return consumption;
    }

    /**
     * Consumption
     * <p>
     * The number or percentage of units consumed by the person on the plan.
     * 
     */
    @JsonProperty("consumption")
    public void setConsumption(Object consumption) {
        this.consumption = consumption;
    }

    public MealPlanAssignments withConsumption(Object consumption) {
        this.consumption = consumption;
        return this;
    }

    /**
     * Comment
     * <p>
     * Any comment that may have been generated for the meal plan.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Any comment that may have been generated for the meal plan.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public MealPlanAssignments withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MealPlanAssignments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("assignedRate");
        sb.append('=');
        sb.append(((this.assignedRate == null)?"<null>":this.assignedRate));
        sb.append(',');
        sb.append("rateOverride");
        sb.append('=');
        sb.append(((this.rateOverride == null)?"<null>":this.rateOverride));
        sb.append(',');
        sb.append("numberOfPeriods");
        sb.append('=');
        sb.append(((this.numberOfPeriods == null)?"<null>":this.numberOfPeriods));
        sb.append(',');
        sb.append("mealCard");
        sb.append('=');
        sb.append(((this.mealCard == null)?"<null>":this.mealCard));
        sb.append(',');
        sb.append("consumption");
        sb.append('=');
        sb.append(((this.consumption == null)?"<null>":this.consumption));
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
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.numberOfPeriods == null)? 0 :this.numberOfPeriods.hashCode()));
        result = ((result* 31)+((this.consumption == null)? 0 :this.consumption.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.assignedRate == null)? 0 :this.assignedRate.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.rateOverride == null)? 0 :this.rateOverride.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.mealCard == null)? 0 :this.mealCard.hashCode()));
        result = ((result* 31)+((this.mealPlan == null)? 0 :this.mealPlan.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MealPlanAssignments) == false) {
            return false;
        }
        MealPlanAssignments rhs = ((MealPlanAssignments) other);
        return ((((((((((((((((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.numberOfPeriods == rhs.numberOfPeriods)||((this.numberOfPeriods!= null)&&this.numberOfPeriods.equals(rhs.numberOfPeriods))))&&((this.consumption == rhs.consumption)||((this.consumption!= null)&&this.consumption.equals(rhs.consumption))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.assignedRate == rhs.assignedRate)||((this.assignedRate!= null)&&this.assignedRate.equals(rhs.assignedRate))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.rateOverride == rhs.rateOverride)||((this.rateOverride!= null)&&this.rateOverride.equals(rhs.rateOverride))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.mealCard == rhs.mealCard)||((this.mealCard!= null)&&this.mealCard.equals(rhs.mealCard))))&&((this.mealPlan == rhs.mealPlan)||((this.mealPlan!= null)&&this.mealPlan.equals(rhs.mealPlan))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the meal plan assignment.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ASSIGNED("assigned"),
        CANCELLED("cancelled"),
        TERMINATED("terminated"),
        PRORATED("prorated");
        private final String value;
        private final static Map<String, MealPlanAssignments.Status> CONSTANTS = new HashMap<String, MealPlanAssignments.Status>();

        static {
            for (MealPlanAssignments.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static MealPlanAssignments.Status fromValue(String value) {
            MealPlanAssignments.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
