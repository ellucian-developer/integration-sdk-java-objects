
package com.ellucian.generated.eedm.student_academic_programs.v6_0;

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
 * Enrollment Status
 * <p>
 * The current state of a student's academic program enrollment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "detail"
})
@Generated("jsonschema2pojo")
public class EnrollmentStatus {

    /**
     * Enrollment Status
     * <p>
     * The status of the academic program enrollment.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the academic program enrollment.")
    private EnrollmentStatus.Status status;
    /**
     * Detail
     * <p>
     * Details related to the academic enrollment.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("Details related to the academic enrollment.")
    private Object detail;

    /**
     * Enrollment Status
     * <p>
     * The status of the academic program enrollment.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public EnrollmentStatus.Status getStatus() {
        return status;
    }

    /**
     * Enrollment Status
     * <p>
     * The status of the academic program enrollment.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(EnrollmentStatus.Status status) {
        this.status = status;
    }

    public EnrollmentStatus withStatus(EnrollmentStatus.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Detail
     * <p>
     * Details related to the academic enrollment.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * Details related to the academic enrollment.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public EnrollmentStatus withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollmentStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollmentStatus) == false) {
            return false;
        }
        EnrollmentStatus rhs = ((EnrollmentStatus) other);
        return (((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Enrollment Status
     * <p>
     * The status of the academic program enrollment.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive"),
        COMPLETE("complete");
        private final String value;
        private final static Map<String, EnrollmentStatus.Status> CONSTANTS = new HashMap<String, EnrollmentStatus.Status>();

        static {
            for (EnrollmentStatus.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static EnrollmentStatus.Status fromValue(String value) {
            EnrollmentStatus.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
