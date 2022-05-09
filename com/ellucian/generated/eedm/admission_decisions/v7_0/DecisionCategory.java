
package com.ellucian.generated.eedm.admission_decisions.v7_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum DecisionCategory {

    INSTITUTION_ACCEPTED("institutionAccepted"),
    APPLICANT_ACCEPTED("applicantAccepted"),
    APPLICANT_DECLINED("applicantDeclined"),
    INSTITUTION_DENIED("institutionDenied");
    private final String value;
    private final static Map<String, DecisionCategory> CONSTANTS = new HashMap<String, DecisionCategory>();

    static {
        for (DecisionCategory c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DecisionCategory(String value) {
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
    public static DecisionCategory fromValue(String value) {
        DecisionCategory constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
