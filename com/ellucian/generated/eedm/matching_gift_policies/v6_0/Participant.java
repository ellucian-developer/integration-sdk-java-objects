
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum Participant {

    FULL_TIME("fullTime"),
    PART_TIME("partTime"),
    RETIRED("retired"),
    SPOUSES_OF_EMPLOYEES("spousesOfEmployees"),
    BOARD_OF_DIRECTORS("boardOfDirectors"),
    AGENTS("agents"),
    LAWYERS("lawyers"),
    EXECUTIVES("executives"),
    GLOBAL_PARTICIPANTS("globalParticipants"),
    TRUSTEES("trustees"),
    ASSOCIATES("associates"),
    CANADIAN_EMPLOYEES("canadianEmployees"),
    OFFICERS("officers"),
    MEMBERS("members");
    private final String value;
    private final static Map<String, Participant> CONSTANTS = new HashMap<String, Participant>();

    static {
        for (Participant c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Participant(String value) {
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
    public static Participant fromValue(String value) {
        Participant constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
