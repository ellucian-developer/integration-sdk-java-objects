
package com.ellucian.generated.eedm.person_employment_proficiencies.v10_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum ProficiencyLevelClassification {

    READ("read"),
    WRITE("write"),
    SPEAK("speak"),
    TRANSLATE("translate"),
    TEACH("teach"),
    NATIVE_LANGUAGE("nativeLanguage");
    private final String value;
    private final static Map<String, ProficiencyLevelClassification> CONSTANTS = new HashMap<String, ProficiencyLevelClassification>();

    static {
        for (ProficiencyLevelClassification c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ProficiencyLevelClassification(String value) {
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
    public static ProficiencyLevelClassification fromValue(String value) {
        ProficiencyLevelClassification constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
