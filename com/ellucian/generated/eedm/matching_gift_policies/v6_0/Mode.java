
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum Mode {

    INTERNET("internet"),
    INTRANET("intranet");
    private final String value;
    private final static Map<String, Mode> CONSTANTS = new HashMap<String, Mode>();

    static {
        for (Mode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Mode(String value) {
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
    public static Mode fromValue(String value) {
        Mode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
