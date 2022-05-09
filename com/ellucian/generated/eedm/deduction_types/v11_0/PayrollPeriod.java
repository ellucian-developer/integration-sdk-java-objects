
package com.ellucian.generated.eedm.deduction_types.v11_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum PayrollPeriod {

    PERIOD_ONE("periodOne"),
    PERIOD_TWO("periodTwo"),
    PERIOD_THREE("periodThree"),
    PERIOD_FOUR("periodFour"),
    PERIOD_FIVE("periodFive");
    private final String value;
    private final static Map<String, PayrollPeriod> CONSTANTS = new HashMap<String, PayrollPeriod>();

    static {
        for (PayrollPeriod c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PayrollPeriod(String value) {
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
    public static PayrollPeriod fromValue(String value) {
        PayrollPeriod constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
