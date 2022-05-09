
package com.ellucian.generated.eedm.employees.v12_0;

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
 * Contract
 * <p>
 * The detail associated with the contract.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "detail"
})
@Generated("jsonschema2pojo")
public class Contract {

    /**
     * Type
     * <p>
     * The type of employment (e.g. full-time, part-time or contractual).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of employment (e.g. full-time, part-time or contractual).")
    private Contract.Type type;
    /**
     * Detail
     * <p>
     * The user defined contract of the employee.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The user defined contract of the employee.")
    private Object detail;

    /**
     * Type
     * <p>
     * The type of employment (e.g. full-time, part-time or contractual).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Contract.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of employment (e.g. full-time, part-time or contractual).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Contract.Type type) {
        this.type = type;
    }

    public Contract withType(Contract.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Detail
     * <p>
     * The user defined contract of the employee.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The user defined contract of the employee.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Contract withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contract.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Contract) == false) {
            return false;
        }
        Contract rhs = ((Contract) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Type
     * <p>
     * The type of employment (e.g. full-time, part-time or contractual).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        FULL_TIME("fullTime"),
        PART_TIME("partTime"),
        CONTRACTUAL("contractual");
        private final String value;
        private final static Map<String, Contract.Type> CONSTANTS = new HashMap<String, Contract.Type>();

        static {
            for (Contract.Type c: values()) {
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
        public static Contract.Type fromValue(String value) {
            Contract.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
