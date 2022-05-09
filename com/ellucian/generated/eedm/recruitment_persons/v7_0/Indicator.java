
package com.ellucian.generated.eedm.recruitment_persons.v7_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum Indicator {

    VETERAN("veteran"),
    FIRST_GENERATION("firstGeneration");
    private final String value;
    private final static Map<String, Indicator> CONSTANTS = new HashMap<String, Indicator>();

    static {
        for (Indicator c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Indicator(String value) {
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
    public static Indicator fromValue(String value) {
        Indicator constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
