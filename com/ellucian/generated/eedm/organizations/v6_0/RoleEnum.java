
package com.ellucian.generated.eedm.organizations.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Role
 * <p>
 * The role of the organization
 * 
 */
@Generated("jsonschema2pojo")
public enum RoleEnum {

    VENDOR("vendor"),
    PARTNER("partner"),
    AFFILIATE("affiliate"),
    CONSTITUENT("constituent");
    private final String value;
    private final static Map<String, RoleEnum> CONSTANTS = new HashMap<String, RoleEnum>();

    static {
        for (RoleEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
        RoleEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
