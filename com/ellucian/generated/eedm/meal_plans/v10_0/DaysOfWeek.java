
package com.ellucian.generated.eedm.meal_plans.v10_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum DaysOfWeek {

    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");
    private final String value;
    private final static Map<String, DaysOfWeek> CONSTANTS = new HashMap<String, DaysOfWeek>();

    static {
        for (DaysOfWeek c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DaysOfWeek(String value) {
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
    public static DaysOfWeek fromValue(String value) {
        DaysOfWeek constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
