
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum EducationalInstitution {

    PRIVATE_FOUR_YEAR("privateFourYear"),
    PUBLIC_FOUR_YEAR("publicFourYear"),
    PRIVATE_GRADUATE("privateGraduate"),
    PUBLIC_GRADUATE("publicGraduate"),
    PRIVATE_COMMUNITY("privateCommunity"),
    PUBLIC_COMMUNITY("publicCommunity"),
    SEMINARIES("seminaries"),
    PRIVATE_SECONDARY("privateSecondary"),
    PUBLIC_SECONDARY("publicSecondary"),
    PRIVATE_ELEMENTARY("privateElementary"),
    PUBLIC_ELEMENTARY("publicElementary"),
    PRIVATE_TECHNICAL("privateTechnical"),
    PUBLIC_TECHNICAL("publicTechnical"),
    PRIVATE_LAW("privateLaw"),
    PUBLIC_LAW("publicLaw"),
    PRIVATE_MIDDLE("privateMiddle"),
    PUBLIC_MIDDLE("publicMiddle"),
    PRIVATE_PRE("privatePre"),
    PUBLIC_PRE("publicPre"),
    SERVICES("services"),
    FUNDS("funds"),
    RADIO("radio"),
    FOUNDATION("foundation"),
    WALKS_RUNS_BIKES("walksRunsBikes"),
    ALUMNI_ASSOCIATIONS("alumniAssociations"),
    SPECIAL_NEEDS("specialNeeds");
    private final String value;
    private final static Map<String, EducationalInstitution> CONSTANTS = new HashMap<String, EducationalInstitution>();

    static {
        for (EducationalInstitution c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    EducationalInstitution(String value) {
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
    public static EducationalInstitution fromValue(String value) {
        EducationalInstitution constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
