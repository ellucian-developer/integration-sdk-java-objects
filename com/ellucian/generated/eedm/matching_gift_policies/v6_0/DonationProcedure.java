
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum DonationProcedure {

    SENDS_CHECK("sendsCheck"),
    INSTITUTION_FILES_FORM("institutionFilesForm"),
    OVER_THE_PHONE("overThePhone"),
    PRESENTS_RECEIPT("presentsReceipt"),
    SUBMITS_ONLINE("submitsOnline"),
    FORM_BY_MAIL("formByMail"),
    SENDS_FORM("sendsForm"),
    CONFIRM_ONLINE("confirmOnline"),
    DESIGNATE_ENDOWMENT("designateEndowment"),
    THROUGH_BENEVITY("throughBenevity");
    private final String value;
    private final static Map<String, DonationProcedure> CONSTANTS = new HashMap<String, DonationProcedure>();

    static {
        for (DonationProcedure c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DonationProcedure(String value) {
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
    public static DonationProcedure fromValue(String value) {
        DonationProcedure constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
