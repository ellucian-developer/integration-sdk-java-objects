
package com.ellucian.generated.eedm.meal_plans.v10_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numberOfUnits",
    "unitType",
    "timePeriod",
    "restrictions"
})
@Generated("jsonschema2pojo")
public class Component {

    /**
     * Number Of Units
     * <p>
     * The number of units included into the component of the meal plan.
     * (Required)
     * 
     */
    @JsonProperty("numberOfUnits")
    @JsonPropertyDescription("The number of units included into the component of the meal plan.")
    private Double numberOfUnits;
    /**
     * Unit Type
     * <p>
     * The type of the meal plan units.
     * (Required)
     * 
     */
    @JsonProperty("unitType")
    @JsonPropertyDescription("The type of the meal plan units.")
    private Component.UnitType unitType;
    /**
     * Time Period
     * <p>
     * The period of time for which the number of units is specified.
     * (Required)
     * 
     */
    @JsonProperty("timePeriod")
    @JsonPropertyDescription("The period of time for which the number of units is specified.")
    private Component.TimePeriod timePeriod;
    /**
     * Restrictions
     * <p>
     * The restrictions for the component of the meal plan.
     * 
     */
    @JsonProperty("restrictions")
    @JsonPropertyDescription("The restrictions for the component of the meal plan.")
    private List<Restriction> restrictions = new ArrayList<Restriction>();

    /**
     * Number Of Units
     * <p>
     * The number of units included into the component of the meal plan.
     * (Required)
     * 
     */
    @JsonProperty("numberOfUnits")
    public Double getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Number Of Units
     * <p>
     * The number of units included into the component of the meal plan.
     * (Required)
     * 
     */
    @JsonProperty("numberOfUnits")
    public void setNumberOfUnits(Double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public Component withNumberOfUnits(Double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
        return this;
    }

    /**
     * Unit Type
     * <p>
     * The type of the meal plan units.
     * (Required)
     * 
     */
    @JsonProperty("unitType")
    public Component.UnitType getUnitType() {
        return unitType;
    }

    /**
     * Unit Type
     * <p>
     * The type of the meal plan units.
     * (Required)
     * 
     */
    @JsonProperty("unitType")
    public void setUnitType(Component.UnitType unitType) {
        this.unitType = unitType;
    }

    public Component withUnitType(Component.UnitType unitType) {
        this.unitType = unitType;
        return this;
    }

    /**
     * Time Period
     * <p>
     * The period of time for which the number of units is specified.
     * (Required)
     * 
     */
    @JsonProperty("timePeriod")
    public Component.TimePeriod getTimePeriod() {
        return timePeriod;
    }

    /**
     * Time Period
     * <p>
     * The period of time for which the number of units is specified.
     * (Required)
     * 
     */
    @JsonProperty("timePeriod")
    public void setTimePeriod(Component.TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Component withTimePeriod(Component.TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Restrictions
     * <p>
     * The restrictions for the component of the meal plan.
     * 
     */
    @JsonProperty("restrictions")
    public List<Restriction> getRestrictions() {
        return restrictions;
    }

    /**
     * Restrictions
     * <p>
     * The restrictions for the component of the meal plan.
     * 
     */
    @JsonProperty("restrictions")
    public void setRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
    }

    public Component withRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Component.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numberOfUnits");
        sb.append('=');
        sb.append(((this.numberOfUnits == null)?"<null>":this.numberOfUnits));
        sb.append(',');
        sb.append("unitType");
        sb.append('=');
        sb.append(((this.unitType == null)?"<null>":this.unitType));
        sb.append(',');
        sb.append("timePeriod");
        sb.append('=');
        sb.append(((this.timePeriod == null)?"<null>":this.timePeriod));
        sb.append(',');
        sb.append("restrictions");
        sb.append('=');
        sb.append(((this.restrictions == null)?"<null>":this.restrictions));
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
        result = ((result* 31)+((this.unitType == null)? 0 :this.unitType.hashCode()));
        result = ((result* 31)+((this.timePeriod == null)? 0 :this.timePeriod.hashCode()));
        result = ((result* 31)+((this.restrictions == null)? 0 :this.restrictions.hashCode()));
        result = ((result* 31)+((this.numberOfUnits == null)? 0 :this.numberOfUnits.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Component) == false) {
            return false;
        }
        Component rhs = ((Component) other);
        return (((((this.unitType == rhs.unitType)||((this.unitType!= null)&&this.unitType.equals(rhs.unitType)))&&((this.timePeriod == rhs.timePeriod)||((this.timePeriod!= null)&&this.timePeriod.equals(rhs.timePeriod))))&&((this.restrictions == rhs.restrictions)||((this.restrictions!= null)&&this.restrictions.equals(rhs.restrictions))))&&((this.numberOfUnits == rhs.numberOfUnits)||((this.numberOfUnits!= null)&&this.numberOfUnits.equals(rhs.numberOfUnits))));
    }


    /**
     * Time Period
     * <p>
     * The period of time for which the number of units is specified.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TimePeriod {

        DAY("day"),
        WEEK("week"),
        MONTH("month"),
        TERM("term"),
        YEAR("year");
        private final String value;
        private final static Map<String, Component.TimePeriod> CONSTANTS = new HashMap<String, Component.TimePeriod>();

        static {
            for (Component.TimePeriod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TimePeriod(String value) {
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
        public static Component.TimePeriod fromValue(String value) {
            Component.TimePeriod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Unit Type
     * <p>
     * The type of the meal plan units.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum UnitType {

        MEAL("meal"),
        SWIPE("swipe"),
        MEAL_POINT("mealPoint"),
        MONEY("money");
        private final String value;
        private final static Map<String, Component.UnitType> CONSTANTS = new HashMap<String, Component.UnitType>();

        static {
            for (Component.UnitType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        UnitType(String value) {
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
        public static Component.UnitType fromValue(String value) {
            Component.UnitType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
