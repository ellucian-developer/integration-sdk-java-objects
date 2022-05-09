
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum Athletic {

    PROGRAMS("programs"),
    SCHOLARSHIP("scholarship"),
    BUILDING_FUND("buildingFund"),
    DIRECTED_TO_GENERAL_FUND("directedToGeneralFund");
    private final String value;
    private final static Map<String, Athletic> CONSTANTS = new HashMap<String, Athletic>();

    static {
        for (Athletic c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Athletic(String value) {
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
    public static Athletic fromValue(String value) {
        Athletic constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
