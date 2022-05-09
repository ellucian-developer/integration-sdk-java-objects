
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum AffiliationRequirement {

    ALUMNI("alumni"),
    GRADUATE("graduate"),
    FAMILY_ATTENDED("familyAttended"),
    MEMBER("member"),
    PATIENT("patient");
    private final String value;
    private final static Map<String, AffiliationRequirement> CONSTANTS = new HashMap<String, AffiliationRequirement>();

    static {
        for (AffiliationRequirement c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AffiliationRequirement(String value) {
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
    public static AffiliationRequirement fromValue(String value) {
        AffiliationRequirement constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
