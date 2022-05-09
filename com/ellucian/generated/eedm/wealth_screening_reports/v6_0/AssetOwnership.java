
package com.ellucian.generated.eedm.wealth_screening_reports.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum AssetOwnership {

    AIRCRAFT("aircraft"),
    BOAT("boat");
    private final String value;
    private final static Map<String, AssetOwnership> CONSTANTS = new HashMap<String, AssetOwnership>();

    static {
        for (AssetOwnership c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AssetOwnership(String value) {
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
    public static AssetOwnership fromValue(String value) {
        AssetOwnership constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
