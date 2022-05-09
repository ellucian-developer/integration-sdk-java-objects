
package com.ellucian.generated.eedm.contribution_payment_types.v10_0;

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
 * Contribution Payment Types
 * <p>
 * A list of valid contribution payment types.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "tenderType",
    "amountRequired",
    "accountingString"
})
@Generated("jsonschema2pojo")
public class ContributionPaymentTypes {

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
     * The global identifier of the contribution payment type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the contribution payment type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the contribution payment type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the contribution payment type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the contribution payment type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the contribution payment type.")
    private String description;
    /**
     * Tender Type
     * <p>
     * The type of tender being used for the contribution.
     * (Required)
     * 
     */
    @JsonProperty("tenderType")
    @JsonPropertyDescription("The type of tender being used for the contribution.")
    private ContributionPaymentTypes.TenderType tenderType;
    /**
     * Amount Required
     * <p>
     * An indication if an amount must be specified for the contribution payment type.
     * (Required)
     * 
     */
    @JsonProperty("amountRequired")
    @JsonPropertyDescription("An indication if an amount must be specified for the contribution payment type.")
    private ContributionPaymentTypes.AmountRequired amountRequired;
    /**
     * Accounting String
     * <p>
     * The accounting string associated with the contribution payment type.
     * 
     */
    @JsonProperty("accountingString")
    @JsonPropertyDescription("The accounting string associated with the contribution payment type.")
    private String accountingString;

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

    public ContributionPaymentTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the contribution payment type.
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
     * The global identifier of the contribution payment type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ContributionPaymentTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the contribution payment type.
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
     * The full name of the contribution payment type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ContributionPaymentTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the contribution payment type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the contribution payment type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ContributionPaymentTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Tender Type
     * <p>
     * The type of tender being used for the contribution.
     * (Required)
     * 
     */
    @JsonProperty("tenderType")
    public ContributionPaymentTypes.TenderType getTenderType() {
        return tenderType;
    }

    /**
     * Tender Type
     * <p>
     * The type of tender being used for the contribution.
     * (Required)
     * 
     */
    @JsonProperty("tenderType")
    public void setTenderType(ContributionPaymentTypes.TenderType tenderType) {
        this.tenderType = tenderType;
    }

    public ContributionPaymentTypes withTenderType(ContributionPaymentTypes.TenderType tenderType) {
        this.tenderType = tenderType;
        return this;
    }

    /**
     * Amount Required
     * <p>
     * An indication if an amount must be specified for the contribution payment type.
     * (Required)
     * 
     */
    @JsonProperty("amountRequired")
    public ContributionPaymentTypes.AmountRequired getAmountRequired() {
        return amountRequired;
    }

    /**
     * Amount Required
     * <p>
     * An indication if an amount must be specified for the contribution payment type.
     * (Required)
     * 
     */
    @JsonProperty("amountRequired")
    public void setAmountRequired(ContributionPaymentTypes.AmountRequired amountRequired) {
        this.amountRequired = amountRequired;
    }

    public ContributionPaymentTypes withAmountRequired(ContributionPaymentTypes.AmountRequired amountRequired) {
        this.amountRequired = amountRequired;
        return this;
    }

    /**
     * Accounting String
     * <p>
     * The accounting string associated with the contribution payment type.
     * 
     */
    @JsonProperty("accountingString")
    public String getAccountingString() {
        return accountingString;
    }

    /**
     * Accounting String
     * <p>
     * The accounting string associated with the contribution payment type.
     * 
     */
    @JsonProperty("accountingString")
    public void setAccountingString(String accountingString) {
        this.accountingString = accountingString;
    }

    public ContributionPaymentTypes withAccountingString(String accountingString) {
        this.accountingString = accountingString;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContributionPaymentTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("tenderType");
        sb.append('=');
        sb.append(((this.tenderType == null)?"<null>":this.tenderType));
        sb.append(',');
        sb.append("amountRequired");
        sb.append('=');
        sb.append(((this.amountRequired == null)?"<null>":this.amountRequired));
        sb.append(',');
        sb.append("accountingString");
        sb.append('=');
        sb.append(((this.accountingString == null)?"<null>":this.accountingString));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.amountRequired == null)? 0 :this.amountRequired.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContributionPaymentTypes) == false) {
            return false;
        }
        ContributionPaymentTypes rhs = ((ContributionPaymentTypes) other);
        return ((((((((this.tenderType == rhs.tenderType)||((this.tenderType!= null)&&this.tenderType.equals(rhs.tenderType)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.amountRequired == rhs.amountRequired)||((this.amountRequired!= null)&&this.amountRequired.equals(rhs.amountRequired))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }


    /**
     * Amount Required
     * <p>
     * An indication if an amount must be specified for the contribution payment type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AmountRequired {

        REQUIRED("required"),
        NOT_REQUIRED("notRequired");
        private final String value;
        private final static Map<String, ContributionPaymentTypes.AmountRequired> CONSTANTS = new HashMap<String, ContributionPaymentTypes.AmountRequired>();

        static {
            for (ContributionPaymentTypes.AmountRequired c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AmountRequired(String value) {
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
        public static ContributionPaymentTypes.AmountRequired fromValue(String value) {
            ContributionPaymentTypes.AmountRequired constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Tender Type
     * <p>
     * The type of tender being used for the contribution.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TenderType {

        LOCAL_CURRENCY("localCurrency"),
        E_COMMERCE("eCommerce"),
        FOREIGN_CURRENCY("foreignCurrency"),
        INSURANCE("insurance"),
        SECURITIES("securities"),
        GIFT_IN_KIND("giftInKind"),
        PAYROLL_DEDUCTION("payrollDeduction");
        private final String value;
        private final static Map<String, ContributionPaymentTypes.TenderType> CONSTANTS = new HashMap<String, ContributionPaymentTypes.TenderType>();

        static {
            for (ContributionPaymentTypes.TenderType c: values()) {
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
        public static ContributionPaymentTypes.TenderType fromValue(String value) {
            ContributionPaymentTypes.TenderType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
