
package com.ellucian.generated.eedm.credit_categories.v6_0;

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
 * Credit Categories
 * <p>
 * A category of academic credit.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "code",
    "title",
    "description",
    "creditType"
})
@Generated("jsonschema2pojo")
public class CreditCategories {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * A global identifier of a credit category.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a credit category.")
    private String id;
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
     * Description
     * <p>
     * A description of the substance and nature of a credit category.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of the substance and nature of a credit category.")
    private String description;
    /**
     * Credit Type
     * <p>
     * The higher level category of academic credits.
     * (Required)
     * 
     */
    @JsonProperty("creditType")
    @JsonPropertyDescription("The higher level category of academic credits.")
    private CreditCategories.CreditType creditType;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public CreditCategories withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a credit category.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * A global identifier of a credit category.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CreditCategories withId(String id) {
        this.id = id;
        return this;
    }

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

    public CreditCategories withCode(String code) {
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

    public CreditCategories withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A description of the substance and nature of a credit category.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of the substance and nature of a credit category.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CreditCategories withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Credit Type
     * <p>
     * The higher level category of academic credits.
     * (Required)
     * 
     */
    @JsonProperty("creditType")
    public CreditCategories.CreditType getCreditType() {
        return creditType;
    }

    /**
     * Credit Type
     * <p>
     * The higher level category of academic credits.
     * (Required)
     * 
     */
    @JsonProperty("creditType")
    public void setCreditType(CreditCategories.CreditType creditType) {
        this.creditType = creditType;
    }

    public CreditCategories withCreditType(CreditCategories.CreditType creditType) {
        this.creditType = creditType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreditCategories.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("creditType");
        sb.append('=');
        sb.append(((this.creditType == null)?"<null>":this.creditType));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.creditType == null)? 0 :this.creditType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreditCategories) == false) {
            return false;
        }
        CreditCategories rhs = ((CreditCategories) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.creditType == rhs.creditType)||((this.creditType!= null)&&this.creditType.equals(rhs.creditType))));
    }


    /**
     * Credit Type
     * <p>
     * The higher level category of academic credits.
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
        private final static Map<String, CreditCategories.CreditType> CONSTANTS = new HashMap<String, CreditCategories.CreditType>();

        static {
            for (CreditCategories.CreditType c: values()) {
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
        public static CreditCategories.CreditType fromValue(String value) {
            CreditCategories.CreditType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
