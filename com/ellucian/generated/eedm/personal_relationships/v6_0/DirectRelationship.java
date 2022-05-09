
package com.ellucian.generated.eedm.personal_relationships.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Direct Relationship
 * <p>
 * The relationship between the subject and related person, going from the latter to the former
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "detail"
})
@Generated("jsonschema2pojo")
public class DirectRelationship {

    /**
     * Type
     * <p>
     * The type of the relationship
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the relationship")
    private DirectRelationship.Type type;
    /**
     * Detail
     * <p>
     * The extension to the type of the relationship
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The extension to the type of the relationship")
    private Object detail;

    /**
     * Type
     * <p>
     * The type of the relationship
     * (Required)
     * 
     */
    @JsonProperty("type")
    public DirectRelationship.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the relationship
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(DirectRelationship.Type type) {
        this.type = type;
    }

    public DirectRelationship withType(DirectRelationship.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Detail
     * <p>
     * The extension to the type of the relationship
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The extension to the type of the relationship
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public DirectRelationship withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DirectRelationship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectRelationship) == false) {
            return false;
        }
        DirectRelationship rhs = ((DirectRelationship) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Type
     * <p>
     * The type of the relationship
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        PARENT("parent"),
        STEP_PARENT("stepParent"),
        MOTHER("mother"),
        STEP_MOTHER("stepMother"),
        FATHER("father"),
        STEP_FATHER("stepFather"),
        CHILD("child"),
        STEP_CHILD("stepChild"),
        DAUGHTER("daughter"),
        STEP_DAUGHTER("stepDaughter"),
        SON("son"),
        STEP_SON("stepSon"),
        SIBLING("sibling"),
        STEP_SIBLING("stepSibling"),
        BROTHER("brother"),
        STEP_BROTHER("stepBrother"),
        SISTER("sister"),
        STEP_SISTER("stepSister"),
        SPOUSE("spouse"),
        WIFE("wife"),
        PARTNER("partner"),
        GRAND_PARENT("grandParent"),
        GRAND_MOTHER("grandMother"),
        GRAND_FATHER("grandFather"),
        GRAND_CHILD("grandChild"),
        GRAND_DAUGHTER("grandDaughter"),
        GRAND_SON("grandSon"),
        PARENT_IN_LAW("parentInLaw"),
        MOTHER_IN_LAW("motherInLaw"),
        FATHER_IN_LAW("fatherInLaw"),
        CHILD_IN_LAW("childInLaw"),
        DAUGHTER_IN_LAW("daughterInLaw"),
        SON_IN_LAW("sonInLaw"),
        SIBLING_IN_LAW("siblingInLaw"),
        SISTER_IN_LAW("sisterInLaw"),
        BROTHER_IN_LAW("brotherInLaw"),
        SIBLING_OF_PARENT("siblingOfParent"),
        AUNT("aunt"),
        UNCLE("uncle"),
        CHILD_OF_SIBLING("childOfSibling"),
        NIECE("niece"),
        NEPHEW("nephew"),
        COUSIN("cousin"),
        FRIEND("friend"),
        RELATIVE("relative"),
        COWORKER("coworker"),
        NEIGHBOR("neighbor"),
        CLASSMATE("classmate"),
        CAREGIVER("caregiver"),
        OTHER("other"),
        HUSBAND("husband");
        private final String value;
        private final static Map<String, DirectRelationship.Type> CONSTANTS = new HashMap<String, DirectRelationship.Type>();

        static {
            for (DirectRelationship.Type c: values()) {
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
        public static DirectRelationship.Type fromValue(String value) {
            DirectRelationship.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
