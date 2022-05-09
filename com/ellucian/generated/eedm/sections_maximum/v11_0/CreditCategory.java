
package com.ellucian.generated.eedm.sections_maximum.v11_0;

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
 * A category of academic credit.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "title",
    "creditType",
    "detail"
})
@Generated("jsonschema2pojo")
public class CreditCategory {

    /**
     * Code
     * <p>
     * A human-readable reference code to identify a particular credit category.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A human-readable reference code to identify a particular credit category.")
    private String code;
    /**
     * Title
     * <p>
     * The full name of a credit category.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a credit category.")
    private String title;
    /**
     * Credit Type
     * <p>
     * The higher-level category of academic credits.
     * (Required)
     * 
     */
    @JsonProperty("creditType")
    @JsonPropertyDescription("The higher-level category of academic credits.")
    private CreditCategory.CreditType creditType;
    /**
     * Credit Category
     * <p>
     * The category of credit earned in this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The category of credit earned in this section.")
    private Detail__2 detail;

    /**
     * Code
     * <p>
     * A human-readable reference code to identify a particular credit category.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A human-readable reference code to identify a particular credit category.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public CreditCategory withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a credit category.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of a credit category.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public CreditCategory withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Credit Type
     * <p>
     * The higher-level category of academic credits.
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
     * The higher-level category of academic credits.
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
     * Credit Category
     * <p>
     * The category of credit earned in this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public Detail__2 getDetail() {
        return detail;
    }

    /**
     * Credit Category
     * <p>
     * The category of credit earned in this section.
     * (Required)
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__2 detail) {
        this.detail = detail;
    }

    public CreditCategory withDetail(Detail__2 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreditCategory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.creditType == null)? 0 :this.creditType.hashCode()));
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
        return (((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.creditType == rhs.creditType)||((this.creditType!= null)&&this.creditType.equals(rhs.creditType))));
    }


    /**
     * Credit Type
     * <p>
     * The higher-level category of academic credits.
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
