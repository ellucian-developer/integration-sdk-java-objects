
package com.ellucian.generated.eedm.apply_prospects.v1_0_0;

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
 * Visa Type
 * <p>
 * Visa type of the prospect.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "detail"
})
@Generated("jsonschema2pojo")
public class VisaType {

    /**
     * Category
     * <p>
     * A global category of visa types.
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("A global category of visa types.")
    private VisaType.Category category;
    /**
     * Detail
     * <p>
     * The Visa type details.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The Visa type details.")
    private Object detail;

    /**
     * Category
     * <p>
     * A global category of visa types.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public VisaType.Category getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * A global category of visa types.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(VisaType.Category category) {
        this.category = category;
    }

    public VisaType withCategory(VisaType.Category category) {
        this.category = category;
        return this;
    }

    /**
     * Detail
     * <p>
     * The Visa type details.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The Visa type details.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public VisaType withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VisaType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof VisaType) == false) {
            return false;
        }
        VisaType rhs = ((VisaType) other);
        return (((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Category
     * <p>
     * A global category of visa types.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Category {

        IMMIGRANT("immigrant"),
        NON_IMMIGRANT("nonImmigrant");
        private final String value;
        private final static Map<String, VisaType.Category> CONSTANTS = new HashMap<String, VisaType.Category>();

        static {
            for (VisaType.Category c: values()) {
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
        public static VisaType.Category fromValue(String value) {
            VisaType.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
