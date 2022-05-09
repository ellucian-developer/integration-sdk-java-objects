
package com.ellucian.generated.eedm.contribution_calculation_rules.v10_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ContributionType {

    GIFT("gift"),
    PLEDGE("pledge"),
    PLEDGE_PAYMENT("pledgePayment"),
    RECURRING_GIFT("recurringGift"),
    MATCHING_GIFT("matchingGift"),
    EXPECTED_BEQUEST("expectedBequest"),
    BEQUEST_PAYMENT("bequestPayment"),
    DUES("dues");
    private final String value;
    private final static Map<String, ContributionType> CONSTANTS = new HashMap<String, ContributionType>();

    static {
        for (ContributionType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ContributionType(String value) {
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
    public static ContributionType fromValue(String value) {
        ContributionType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
