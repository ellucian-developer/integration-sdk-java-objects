
package com.ellucian.generated.eedm.person_holds.v6_0;

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
 * Type
 * <p>
 * The type of the hold.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "detail"
})
@Generated("jsonschema2pojo")
public class Type {

    /**
     * Category
     * <p>
     * A global category for person hold.
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A global category for person hold.")
    private Type.Category category;
    /**
     * Detail
     * <p>
     * A custom category for the person hold.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("A custom category for the person hold.")
    private Object detail;

    /**
     * Category
     * <p>
     * A global category for person hold.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public Type.Category getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * A global category for person hold.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(Type.Category category) {
        this.category = category;
    }

    public Type withCategory(Type.Category category) {
        this.category = category;
        return this;
    }

    /**
     * Detail
     * <p>
     * A custom category for the person hold.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * A custom category for the person hold.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Type withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Type.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
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
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type) == false) {
            return false;
        }
        Type rhs = ((Type) other);
        return (((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Category
     * <p>
     * A global category for person hold.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Category {

        ACADEMIC("academic"),
        ADMINISTRATIVE("administrative"),
        DISCIPLINARY("disciplinary"),
        FINANCIAL("financial"),
        HEALTH("health");
        private final String value;
        private final static Map<String, Type.Category> CONSTANTS = new HashMap<String, Type.Category>();

        static {
            for (Type.Category c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Category(String value) {
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
        public static Type.Category fromValue(String value) {
            Type.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
