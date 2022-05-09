
package com.ellucian.generated.eedm.student_academic_periods.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Academic Load
 * <p>
 * The student calculated academic load for the period.
 * 
 */
@Generated("jsonschema2pojo")
public enum AcademicLoadEnum {

    PART_TIME("partTime"),
    OVERLOAD("overload"),
    FULL_TIME("fullTime");
    private final String value;
    private final static Map<String, AcademicLoadEnum> CONSTANTS = new HashMap<String, AcademicLoadEnum>();

    static {
        for (AcademicLoadEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AcademicLoadEnum(String value) {
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
    public static AcademicLoadEnum fromValue(String value) {
        AcademicLoadEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
