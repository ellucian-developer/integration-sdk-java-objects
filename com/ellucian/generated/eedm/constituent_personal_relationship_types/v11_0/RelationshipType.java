
package com.ellucian.generated.eedm.constituent_personal_relationship_types.v11_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("jsonschema2pojo")
public enum RelationshipType {

    SPOUSAL("spousal"),
    PARENTAL("parental"),
    RECIPROCAL("reciprocal"),
    INFLUENCER("influencer");
    private final String value;
    private final static Map<String, RelationshipType> CONSTANTS = new HashMap<String, RelationshipType>();

    static {
        for (RelationshipType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    RelationshipType(String value) {
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
    public static RelationshipType fromValue(String value) {
        RelationshipType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
