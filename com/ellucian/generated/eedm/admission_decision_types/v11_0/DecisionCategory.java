
package com.ellucian.generated.eedm.admission_decision_types.v11_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum DecisionCategory {

    APPLIED("applied"),
    COMPLETE("complete"),
    ACCEPTED("accepted"),
    STUDENT_ACCEPTED("studentAccepted"),
    WAITLISTED("waitlisted"),
    REJECTED("rejected"),
    MOVED_TO_STUDENT("movedToStudent"),
    WITHDRAWN("withdrawn");
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
