
package com.ellucian.generated.eedm.student_attendances.v10_0;

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
 * Attendance
 * <p>
 * The categorization of the student's attendance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "detail"
})
@Generated("jsonschema2pojo")
public class Attendance {

    /**
     * Category
     * <p>
     * The student’s attendance category.
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The student\u2019s attendance category.")
    private Attendance.Category category;
    /**
     * Detail
     * <p>
     * A user defined category applied to the student's attendance.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("A user defined category applied to the student's attendance.")
    private Object detail;

    /**
     * Category
     * <p>
     * The student’s attendance category.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public Attendance.Category getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * The student’s attendance category.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(Attendance.Category category) {
        this.category = category;
    }

    public Attendance withCategory(Attendance.Category category) {
        this.category = category;
        return this;
    }

    /**
     * Detail
     * <p>
     * A user defined category applied to the student's attendance.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * A user defined category applied to the student's attendance.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Attendance withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attendance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Attendance) == false) {
            return false;
        }
        Attendance rhs = ((Attendance) other);
        return (((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Category
     * <p>
     * The student’s attendance category.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Category {

        PRESENT_FULL("presentFull"),
        PRESENT_PARTIAL("presentPartial"),
        ABSENT_EXCUSED("absentExcused"),
        ABSENT_NOT_EXCUSED("absentNotExcused");
        private final String value;
        private final static Map<String, Attendance.Category> CONSTANTS = new HashMap<String, Attendance.Category>();

        static {
            for (Attendance.Category c: values()) {
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
        public static Attendance.Category fromValue(String value) {
            Attendance.Category constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
