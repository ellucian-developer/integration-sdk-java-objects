
package com.ellucian.generated.eedm.meal_plans.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mealTypes",
    "diningFacilities",
    "buildings",
    "sites",
    "daysOfWeek",
    "unitsPerPeriod"
})
@Generated("jsonschema2pojo")
public class Restriction {

    /**
     * Meal Types
     * <p>
     * The meal types to which the meal plan component is restricted.
     * 
     */
    @JsonProperty("mealTypes")
    @JsonPropertyDescription("The meal types to which the meal plan component is restricted.")
    private List<MealType> mealTypes = new ArrayList<MealType>();
    /**
     * Dining Facilities
     * <p>
     * The dining facilities permitted in the meal plan.
     * 
     */
    @JsonProperty("diningFacilities")
    @JsonPropertyDescription("The dining facilities permitted in the meal plan.")
    private List<DiningFacility> diningFacilities = new ArrayList<DiningFacility>();
    /**
     * Buildings
     * <p>
     * The buildings permitted in the meal plan.
     * 
     */
    @JsonProperty("buildings")
    @JsonPropertyDescription("The buildings permitted in the meal plan.")
    private List<Building> buildings = new ArrayList<Building>();
    /**
     * Sites
     * <p>
     * The sites permitted in the meal plan.
     * 
     */
    @JsonProperty("sites")
    @JsonPropertyDescription("The sites permitted in the meal plan.")
    private List<Site> sites = new ArrayList<Site>();
    /**
     * Days Of Week
     * <p>
     * The days of the week covered by the meal plan component.
     * 
     */
    @JsonProperty("daysOfWeek")
    @JsonPropertyDescription("The days of the week covered by the meal plan component.")
    private List<DaysOfWeek> daysOfWeek = new ArrayList<DaysOfWeek>();
    /**
     * Units Per Period
     * <p>
     * The maximum number of units within a time period allowed for the meal plan component.
     * 
     */
    @JsonProperty("unitsPerPeriod")
    @JsonPropertyDescription("The maximum number of units within a time period allowed for the meal plan component.")
    private UnitsPerPeriod unitsPerPeriod;

    /**
     * Meal Types
     * <p>
     * The meal types to which the meal plan component is restricted.
     * 
     */
    @JsonProperty("mealTypes")
    public List<MealType> getMealTypes() {
        return mealTypes;
    }

    /**
     * Meal Types
     * <p>
     * The meal types to which the meal plan component is restricted.
     * 
     */
    @JsonProperty("mealTypes")
    public void setMealTypes(List<MealType> mealTypes) {
        this.mealTypes = mealTypes;
    }

    public Restriction withMealTypes(List<MealType> mealTypes) {
        this.mealTypes = mealTypes;
        return this;
    }

    /**
     * Dining Facilities
     * <p>
     * The dining facilities permitted in the meal plan.
     * 
     */
    @JsonProperty("diningFacilities")
    public List<DiningFacility> getDiningFacilities() {
        return diningFacilities;
    }

    /**
     * Dining Facilities
     * <p>
     * The dining facilities permitted in the meal plan.
     * 
     */
    @JsonProperty("diningFacilities")
    public void setDiningFacilities(List<DiningFacility> diningFacilities) {
        this.diningFacilities = diningFacilities;
    }

    public Restriction withDiningFacilities(List<DiningFacility> diningFacilities) {
        this.diningFacilities = diningFacilities;
        return this;
    }

    /**
     * Buildings
     * <p>
     * The buildings permitted in the meal plan.
     * 
     */
    @JsonProperty("buildings")
    public List<Building> getBuildings() {
        return buildings;
    }

    /**
     * Buildings
     * <p>
     * The buildings permitted in the meal plan.
     * 
     */
    @JsonProperty("buildings")
    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public Restriction withBuildings(List<Building> buildings) {
        this.buildings = buildings;
        return this;
    }

    /**
     * Sites
     * <p>
     * The sites permitted in the meal plan.
     * 
     */
    @JsonProperty("sites")
    public List<Site> getSites() {
        return sites;
    }

    /**
     * Sites
     * <p>
     * The sites permitted in the meal plan.
     * 
     */
    @JsonProperty("sites")
    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public Restriction withSites(List<Site> sites) {
        this.sites = sites;
        return this;
    }

    /**
     * Days Of Week
     * <p>
     * The days of the week covered by the meal plan component.
     * 
     */
    @JsonProperty("daysOfWeek")
    public List<DaysOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Days Of Week
     * <p>
     * The days of the week covered by the meal plan component.
     * 
     */
    @JsonProperty("daysOfWeek")
    public void setDaysOfWeek(List<DaysOfWeek> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public Restriction withDaysOfWeek(List<DaysOfWeek> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    /**
     * Units Per Period
     * <p>
     * The maximum number of units within a time period allowed for the meal plan component.
     * 
     */
    @JsonProperty("unitsPerPeriod")
    public UnitsPerPeriod getUnitsPerPeriod() {
        return unitsPerPeriod;
    }

    /**
     * Units Per Period
     * <p>
     * The maximum number of units within a time period allowed for the meal plan component.
     * 
     */
    @JsonProperty("unitsPerPeriod")
    public void setUnitsPerPeriod(UnitsPerPeriod unitsPerPeriod) {
        this.unitsPerPeriod = unitsPerPeriod;
    }

    public Restriction withUnitsPerPeriod(UnitsPerPeriod unitsPerPeriod) {
        this.unitsPerPeriod = unitsPerPeriod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Restriction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mealTypes");
        sb.append('=');
        sb.append(((this.mealTypes == null)?"<null>":this.mealTypes));
        sb.append(',');
        sb.append("diningFacilities");
        sb.append('=');
        sb.append(((this.diningFacilities == null)?"<null>":this.diningFacilities));
        sb.append(',');
        sb.append("buildings");
        sb.append('=');
        sb.append(((this.buildings == null)?"<null>":this.buildings));
        sb.append(',');
        sb.append("sites");
        sb.append('=');
        sb.append(((this.sites == null)?"<null>":this.sites));
        sb.append(',');
        sb.append("daysOfWeek");
        sb.append('=');
        sb.append(((this.daysOfWeek == null)?"<null>":this.daysOfWeek));
        sb.append(',');
        sb.append("unitsPerPeriod");
        sb.append('=');
        sb.append(((this.unitsPerPeriod == null)?"<null>":this.unitsPerPeriod));
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
        result = ((result* 31)+((this.diningFacilities == null)? 0 :this.diningFacilities.hashCode()));
        result = ((result* 31)+((this.unitsPerPeriod == null)? 0 :this.unitsPerPeriod.hashCode()));
        result = ((result* 31)+((this.buildings == null)? 0 :this.buildings.hashCode()));
        result = ((result* 31)+((this.sites == null)? 0 :this.sites.hashCode()));
        result = ((result* 31)+((this.mealTypes == null)? 0 :this.mealTypes.hashCode()));
        result = ((result* 31)+((this.daysOfWeek == null)? 0 :this.daysOfWeek.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Restriction) == false) {
            return false;
        }
        Restriction rhs = ((Restriction) other);
        return (((((((this.diningFacilities == rhs.diningFacilities)||((this.diningFacilities!= null)&&this.diningFacilities.equals(rhs.diningFacilities)))&&((this.unitsPerPeriod == rhs.unitsPerPeriod)||((this.unitsPerPeriod!= null)&&this.unitsPerPeriod.equals(rhs.unitsPerPeriod))))&&((this.buildings == rhs.buildings)||((this.buildings!= null)&&this.buildings.equals(rhs.buildings))))&&((this.sites == rhs.sites)||((this.sites!= null)&&this.sites.equals(rhs.sites))))&&((this.mealTypes == rhs.mealTypes)||((this.mealTypes!= null)&&this.mealTypes.equals(rhs.mealTypes))))&&((this.daysOfWeek == rhs.daysOfWeek)||((this.daysOfWeek!= null)&&this.daysOfWeek.equals(rhs.daysOfWeek))));
    }

}
