
package com.ellucian.generated.eedm.pay_classifications.v12_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CompensationType {

    WAGES("wages"),
    SALARY("salary");
    private final String value;
    private final static Map<String, CompensationType> CONSTANTS = new HashMap<String, CompensationType>();

    static {
        for (CompensationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CompensationType(String value) {
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
    public static CompensationType fromValue(String value) {
        CompensationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
