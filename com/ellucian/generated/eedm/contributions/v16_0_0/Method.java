
package com.ellucian.generated.eedm.contributions.v16_0_0;

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
 * Method
 * <p>
 * The method by which the payment was received.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tenderType",
    "detail"
})
@Generated("jsonschema2pojo")
public class Method {

    /**
     * Tender Type
     * <p>
     * The type of payment (e.g. local currency, foreign currency, e-commerce) associated with the payment method.
     * (Required)
     * 
     */
    @JsonProperty("tenderType")
    @JsonPropertyDescription("The type of payment (e.g. local currency, foreign currency, e-commerce) associated with the payment method.")
    private Method.TenderType tenderType;
    /**
     * Detail
     * <p>
     * The user defined payment type associated with the payment method.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The user defined payment type associated with the payment method.")
    private Object detail;

    /**
     * Tender Type
     * <p>
     * The type of payment (e.g. local currency, foreign currency, e-commerce) associated with the payment method.
     * (Required)
     * 
     */
    @JsonProperty("tenderType")
    public Method.TenderType getTenderType() {
        return tenderType;
    }

    /**
     * Tender Type
     * <p>
     * The type of payment (e.g. local currency, foreign currency, e-commerce) associated with the payment method.
     * (Required)
     * 
     */
    @JsonProperty("tenderType")
    public void setTenderType(Method.TenderType tenderType) {
        this.tenderType = tenderType;
    }

    public Method withTenderType(Method.TenderType tenderType) {
        this.tenderType = tenderType;
        return this;
    }

    /**
     * Detail
     * <p>
     * The user defined payment type associated with the payment method.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The user defined payment type associated with the payment method.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Method withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Method.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tenderType");
        sb.append('=');
        sb.append(((this.tenderType == null)?"<null>":this.tenderType));
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
        result = ((result* 31)+((this.tenderType == null)? 0 :this.tenderType.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Method) == false) {
            return false;
        }
        Method rhs = ((Method) other);
        return (((this.tenderType == rhs.tenderType)||((this.tenderType!= null)&&this.tenderType.equals(rhs.tenderType)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Tender Type
     * <p>
     * The type of payment (e.g. local currency, foreign currency, e-commerce) associated with the payment method.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TenderType {

        LOCAL_CURRENCY("localCurrency"),
        E_COMMERCE("eCommerce"),
        FOREIGN_CURRENCY("foreignCurrency"),
        INSURANCE("insurance"),
        SECURITY("security"),
        GIFT_IN_KIND("giftInKind"),
        PAYROLL_DEDUCTION("payrollDeduction");
        private final String value;
        private final static Map<String, Method.TenderType> CONSTANTS = new HashMap<String, Method.TenderType>();

        static {
            for (Method.TenderType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TenderType(String value) {
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
        public static Method.TenderType fromValue(String value) {
            Method.TenderType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
