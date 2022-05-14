
package com.ellucian.generated.eedm.meal_plan_rates.v10_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Meal Plan Rates
 * <p>
 * The billing rates for meal plans.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "mealPlan",
    "rate",
    "ratePeriod",
    "academicPeriod",
    "startOn",
    "endOn",
    "accountingCode"
})
@Generated("jsonschema2pojo")
public class MealPlanRates {

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
     * The global identifier of the meal plan rate.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the meal plan rate.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the meal plan rate.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the meal plan rate.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the meal plan rate.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the meal plan rate.")
    private String description;
    /**
     * Code
     * <p>
     * The code of the meal plan rate.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code of the meal plan rate.")
    private String code;
    /**
     * Meal Plan
     * <p>
     * The meal plan to which the rate applies.
     * (Required)
     * 
     */
    @JsonProperty("mealPlan")
    @JsonPropertyDescription("The meal plan to which the rate applies.")
    private MealPlan mealPlan;
    /**
     * Rate
     * <p>
     * The meal plan rate.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    @JsonPropertyDescription("The meal plan rate.")
    private Rate rate;
    /**
     * Rate Period
     * <p>
     * The time period for the rate.
     * (Required)
     * 
     */
    @JsonProperty("ratePeriod")
    @JsonPropertyDescription("The time period for the rate.")
    private MealPlanRates.RatePeriod ratePeriod;
    /**
     * Academic Period
     * <p>
     * A term within an academic year for which the rate is defined.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("A term within an academic year for which the rate is defined.")
    private Object academicPeriod;
    /**
     * Start On
     * <p>
     * The start date for the rate.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date for the rate.")
    private Date startOn;
    /**
     * End On
     * <p>
     * The end date for the rate.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date for the rate.")
    private Object endOn;
    /**
     * Accounting Code
     * <p>
     * The accounting code associated with the rate.
     * 
     */
    @JsonProperty("accountingCode")
    @JsonPropertyDescription("The accounting code associated with the rate.")
    private Object accountingCode;

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

    public MealPlanRates withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the meal plan rate.
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
     * The global identifier of the meal plan rate.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MealPlanRates withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the meal plan rate.
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
     * The full name of the meal plan rate.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public MealPlanRates withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the meal plan rate.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the meal plan rate.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public MealPlanRates withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code of the meal plan rate.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code of the meal plan rate.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public MealPlanRates withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Meal Plan
     * <p>
     * The meal plan to which the rate applies.
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
     * The meal plan to which the rate applies.
     * (Required)
     * 
     */
    @JsonProperty("mealPlan")
    public void setMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    public MealPlanRates withMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
        return this;
    }

    /**
     * Rate
     * <p>
     * The meal plan rate.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public Rate getRate() {
        return rate;
    }

    /**
     * Rate
     * <p>
     * The meal plan rate.
     * (Required)
     * 
     */
    @JsonProperty("rate")
    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public MealPlanRates withRate(Rate rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Rate Period
     * <p>
     * The time period for the rate.
     * (Required)
     * 
     */
    @JsonProperty("ratePeriod")
    public MealPlanRates.RatePeriod getRatePeriod() {
        return ratePeriod;
    }

    /**
     * Rate Period
     * <p>
     * The time period for the rate.
     * (Required)
     * 
     */
    @JsonProperty("ratePeriod")
    public void setRatePeriod(MealPlanRates.RatePeriod ratePeriod) {
        this.ratePeriod = ratePeriod;
    }

    public MealPlanRates withRatePeriod(MealPlanRates.RatePeriod ratePeriod) {
        this.ratePeriod = ratePeriod;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * A term within an academic year for which the rate is defined.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * A term within an academic year for which the rate is defined.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public MealPlanRates withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date for the rate.
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
     * The start date for the rate.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public MealPlanRates withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date for the rate.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date for the rate.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public MealPlanRates withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Accounting Code
     * <p>
     * The accounting code associated with the rate.
     * 
     */
    @JsonProperty("accountingCode")
    public Object getAccountingCode() {
        return accountingCode;
    }

    /**
     * Accounting Code
     * <p>
     * The accounting code associated with the rate.
     * 
     */
    @JsonProperty("accountingCode")
    public void setAccountingCode(Object accountingCode) {
        this.accountingCode = accountingCode;
    }

    public MealPlanRates withAccountingCode(Object accountingCode) {
        this.accountingCode = accountingCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MealPlanRates.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("mealPlan");
        sb.append('=');
        sb.append(((this.mealPlan == null)?"<null>":this.mealPlan));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("ratePeriod");
        sb.append('=');
        sb.append(((this.ratePeriod == null)?"<null>":this.ratePeriod));
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
        sb.append("accountingCode");
        sb.append('=');
        sb.append(((this.accountingCode == null)?"<null>":this.accountingCode));
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
        result = ((result* 31)+((this.accountingCode == null)? 0 :this.accountingCode.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.ratePeriod == null)? 0 :this.ratePeriod.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.mealPlan == null)? 0 :this.mealPlan.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MealPlanRates) == false) {
            return false;
        }
        MealPlanRates rhs = ((MealPlanRates) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.accountingCode == rhs.accountingCode)||((this.accountingCode!= null)&&this.accountingCode.equals(rhs.accountingCode))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.ratePeriod == rhs.ratePeriod)||((this.ratePeriod!= null)&&this.ratePeriod.equals(rhs.ratePeriod))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.mealPlan == rhs.mealPlan)||((this.mealPlan!= null)&&this.mealPlan.equals(rhs.mealPlan))));
    }


    /**
     * Rate Period
     * <p>
     * The time period for the rate.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RatePeriod {

        DAY("day"),
        WEEK("week"),
        TERM("term"),
        MEAL("meal"),
        MONTH("month"),
        YEAR("year");
        private final String value;
        private final static Map<String, MealPlanRates.RatePeriod> CONSTANTS = new HashMap<String, MealPlanRates.RatePeriod>();

        static {
            for (MealPlanRates.RatePeriod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RatePeriod(String value) {
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
        public static MealPlanRates.RatePeriod fromValue(String value) {
            MealPlanRates.RatePeriod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
