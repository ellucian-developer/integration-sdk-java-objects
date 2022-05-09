
package com.ellucian.generated.eedm.sections.v16_0_0;

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
 * Credit Category
 * <p>
 * The academic credit category associated with the section.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "creditType",
    "detail"
})
@Generated("jsonschema2pojo")
public class CreditCategory {

    /**
     * Credit Type
     * <p>
     * The higher-level category of academic credit.
     * (Required)
     * 
     */
    @JsonProperty("creditType")
    @JsonPropertyDescription("The higher-level category of academic credit.")
    private CreditCategory.CreditType creditType;
    /**
     * Detail
     * <p>
     * The academic credit category associated with the section.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The academic credit category associated with the section.")
    private Object detail;

    /**
     * Credit Type
     * <p>
     * The higher-level category of academic credit.
     * (Required)
     * 
     */
    @JsonProperty("creditType")
    public CreditCategory.CreditType getCreditType() {
        return creditType;
    }

    /**
     * Credit Type
     * <p>
     * The higher-level category of academic credit.
     * (Required)
     * 
     */
    @JsonProperty("creditType")
    public void setCreditType(CreditCategory.CreditType creditType) {
        this.creditType = creditType;
    }

    public CreditCategory withCreditType(CreditCategory.CreditType creditType) {
        this.creditType = creditType;
        return this;
    }

    /**
     * Detail
     * <p>
     * The academic credit category associated with the section.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The academic credit category associated with the section.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public CreditCategory withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreditCategory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("creditType");
        sb.append('=');
        sb.append(((this.creditType == null)?"<null>":this.creditType));
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
        result = ((result* 31)+((this.creditType == null)? 0 :this.creditType.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreditCategory) == false) {
            return false;
        }
        CreditCategory rhs = ((CreditCategory) other);
        return (((this.creditType == rhs.creditType)||((this.creditType!= null)&&this.creditType.equals(rhs.creditType)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Credit Type
     * <p>
     * The higher-level category of academic credit.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum CreditType {

        CE("ce"),
        INSTITUTION("institution"),
        TRANSFER("transfer"),
        EXCHANGE("exchange"),
        EXAM("exam"),
        WORK_LIFE_EXPERIENCE("workLifeExperience"),
        OTHER("other"),
        NO_CREDIT("noCredit");
        private final String value;
        private final static Map<String, CreditCategory.CreditType> CONSTANTS = new HashMap<String, CreditCategory.CreditType>();

        static {
            for (CreditCategory.CreditType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CreditType(String value) {
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
        public static CreditCategory.CreditType fromValue(String value) {
            CreditCategory.CreditType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
