
package com.ellucian.generated.eedm.campaigns.v9_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "institutionalUnit"
})
@Generated("jsonschema2pojo")
public class InstitutionalUnit {

    /**
     * Type
     * <p>
     * The type of institutional unit (e.g. division, college, department).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of institutional unit (e.g. division, college, department).")
    private InstitutionalUnit.Type type;
    /**
     * Institutional Unit
     * <p>
     * An institutional unit associated with the campaign.
     * (Required)
     * 
     */
    @JsonProperty("institutionalUnit")
    @JsonPropertyDescription("An institutional unit associated with the campaign.")
    private InstitutionalUnit__1 institutionalUnit;

    /**
     * Type
     * <p>
     * The type of institutional unit (e.g. division, college, department).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public InstitutionalUnit.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of institutional unit (e.g. division, college, department).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(InstitutionalUnit.Type type) {
        this.type = type;
    }

    public InstitutionalUnit withType(InstitutionalUnit.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Institutional Unit
     * <p>
     * An institutional unit associated with the campaign.
     * (Required)
     * 
     */
    @JsonProperty("institutionalUnit")
    public InstitutionalUnit__1 getInstitutionalUnit() {
        return institutionalUnit;
    }

    /**
     * Institutional Unit
     * <p>
     * An institutional unit associated with the campaign.
     * (Required)
     * 
     */
    @JsonProperty("institutionalUnit")
    public void setInstitutionalUnit(InstitutionalUnit__1 institutionalUnit) {
        this.institutionalUnit = institutionalUnit;
    }

    public InstitutionalUnit withInstitutionalUnit(InstitutionalUnit__1 institutionalUnit) {
        this.institutionalUnit = institutionalUnit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstitutionalUnit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("institutionalUnit");
        sb.append('=');
        sb.append(((this.institutionalUnit == null)?"<null>":this.institutionalUnit));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.institutionalUnit == null)? 0 :this.institutionalUnit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstitutionalUnit) == false) {
            return false;
        }
        InstitutionalUnit rhs = ((InstitutionalUnit) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.institutionalUnit == rhs.institutionalUnit)||((this.institutionalUnit!= null)&&this.institutionalUnit.equals(rhs.institutionalUnit))));
    }


    /**
     * Type
     * <p>
     * The type of institutional unit (e.g. division, college, department).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        DIVISION("division"),
        COLLEGE("college"),
        DEPARTMENT("department");
        private final String value;
        private final static Map<String, InstitutionalUnit.Type> CONSTANTS = new HashMap<String, InstitutionalUnit.Type>();

        static {
            for (InstitutionalUnit.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
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
        public static InstitutionalUnit.Type fromValue(String value) {
            InstitutionalUnit.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
