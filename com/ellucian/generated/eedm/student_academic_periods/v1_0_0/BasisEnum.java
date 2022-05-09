
package com.ellucian.generated.eedm.student_academic_periods.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Basis
 * <p>
 * An indicator as to whether the academic status is established for the student overall or specific to a student's academic level.
 * 
 */
@Generated("jsonschema2pojo")
public enum BasisEnum {

    BY_LEVEL("byLevel"),
    OVERALL("overall");
    private final String value;
    private final static Map<String, BasisEnum> CONSTANTS = new HashMap<String, BasisEnum>();

    static {
        for (BasisEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BasisEnum(String value) {
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
    public static BasisEnum fromValue(String value) {
        BasisEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
