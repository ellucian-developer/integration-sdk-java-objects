
package com.ellucian.generated.eedm.contribution_calculation_rules.v8_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum CreditType {

    LEGAL("legal"),
    RECOGNITION("recognition"),
    MATCH("match"),
    SOFT("soft"),
    OTHER("other");
    private final String value;
    private final static Map<String, CreditType> CONSTANTS = new HashMap<String, CreditType>();

    static {
        for (CreditType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CreditType(String value) {
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
    public static CreditType fromValue(String value) {
        CreditType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
