
package com.ellucian.generated.eedm.financial_aid_applications.v9_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum IndependenceCriterium {

    RISK_OF_HOMELESSNESS("riskOfHomelessness"),
    ADVANCED_DEGREE_STUDENT("advancedDegreeStudent"),
    SUPPORTING_CHILDREN("supportingChildren"),
    SUPPORTING_DEPENDENTS("supportingDependents"),
    ORPHAN_WARD_OF_COURT_FOSTER_CARE("orphanWardOfCourtFosterCare"),
    EMANCIPATED_MINOR("emancipatedMinor"),
    LEGAL_GUARDIANSHIP("legalGuardianship"),
    UNACCOMPANIED_YOUTH_BY_SCHOOL("unaccompaniedYouthBySchool"),
    UNACCOMPANIED_YOUTH_BY_HUD("unaccompaniedYouthByHUD"),
    INDEPENDENT_AGE("independentAge"),
    MARRIED("married"),
    VETERAN("veteran"),
    ACTIVE_DUTY("activeDuty");
    private final String value;
    private final static Map<String, IndependenceCriterium> CONSTANTS = new HashMap<String, IndependenceCriterium>();

    static {
        for (IndependenceCriterium c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    IndependenceCriterium(String value) {
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
    public static IndependenceCriterium fromValue(String value) {
        IndependenceCriterium constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
