
package com.ellucian.generated.eedm.account_funds_available.v8_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Account Funds Available
 * <p>
 * Communicates information about the availability of funds for a specified accounting string.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountingString",
    "fundsAvailable",
    "balanceOn",
    "metadata"
})
@Generated("jsonschema2pojo")
public class AccountFundsAvailable {

    /**
     * Accounting String
     * <p>
     * The full representation of the accounting string in the format specified by the authoritative system.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    @JsonPropertyDescription("The full representation of the accounting string in the format specified by the authoritative system.")
    private String accountingString;
    /**
     * Funds Available
     * <p>
     * Status of the availability of funds.
     * (Required)
     * 
     */
    @JsonProperty("fundsAvailable")
    @JsonPropertyDescription("Status of the availability of funds.")
    private AccountFundsAvailable.FundsAvailable fundsAvailable;
    /**
     * Balance On
     * <p>
     * The date for which the availability of funds was evaluated.
     * 
     */
    @JsonProperty("balanceOn")
    @JsonPropertyDescription("The date for which the availability of funds was evaluated.")
    private Object balanceOn;
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
     * Accounting String
     * <p>
     * The full representation of the accounting string in the format specified by the authoritative system.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    public String getAccountingString() {
        return accountingString;
    }

    /**
     * Accounting String
     * <p>
     * The full representation of the accounting string in the format specified by the authoritative system.
     * (Required)
     * 
     */
    @JsonProperty("accountingString")
    public void setAccountingString(String accountingString) {
        this.accountingString = accountingString;
    }

    public AccountFundsAvailable withAccountingString(String accountingString) {
        this.accountingString = accountingString;
        return this;
    }

    /**
     * Funds Available
     * <p>
     * Status of the availability of funds.
     * (Required)
     * 
     */
    @JsonProperty("fundsAvailable")
    public AccountFundsAvailable.FundsAvailable getFundsAvailable() {
        return fundsAvailable;
    }

    /**
     * Funds Available
     * <p>
     * Status of the availability of funds.
     * (Required)
     * 
     */
    @JsonProperty("fundsAvailable")
    public void setFundsAvailable(AccountFundsAvailable.FundsAvailable fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    public AccountFundsAvailable withFundsAvailable(AccountFundsAvailable.FundsAvailable fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
        return this;
    }

    /**
     * Balance On
     * <p>
     * The date for which the availability of funds was evaluated.
     * 
     */
    @JsonProperty("balanceOn")
    public Object getBalanceOn() {
        return balanceOn;
    }

    /**
     * Balance On
     * <p>
     * The date for which the availability of funds was evaluated.
     * 
     */
    @JsonProperty("balanceOn")
    public void setBalanceOn(Object balanceOn) {
        this.balanceOn = balanceOn;
    }

    public AccountFundsAvailable withBalanceOn(Object balanceOn) {
        this.balanceOn = balanceOn;
        return this;
    }

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

    public AccountFundsAvailable withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountFundsAvailable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountingString");
        sb.append('=');
        sb.append(((this.accountingString == null)?"<null>":this.accountingString));
        sb.append(',');
        sb.append("fundsAvailable");
        sb.append('=');
        sb.append(((this.fundsAvailable == null)?"<null>":this.fundsAvailable));
        sb.append(',');
        sb.append("balanceOn");
        sb.append('=');
        sb.append(((this.balanceOn == null)?"<null>":this.balanceOn));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
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
        result = ((result* 31)+((this.accountingString == null)? 0 :this.accountingString.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.balanceOn == null)? 0 :this.balanceOn.hashCode()));
        result = ((result* 31)+((this.fundsAvailable == null)? 0 :this.fundsAvailable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountFundsAvailable) == false) {
            return false;
        }
        AccountFundsAvailable rhs = ((AccountFundsAvailable) other);
        return (((((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.balanceOn == rhs.balanceOn)||((this.balanceOn!= null)&&this.balanceOn.equals(rhs.balanceOn))))&&((this.fundsAvailable == rhs.fundsAvailable)||((this.fundsAvailable!= null)&&this.fundsAvailable.equals(rhs.fundsAvailable))));
    }


    /**
     * Funds Available
     * <p>
     * Status of the availability of funds.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum FundsAvailable {

        AVAILABLE("available"),
        NOT_AVAILABLE("notAvailable"),
        OVERRIDE_AVAILABLE("overrideAvailable"),
        INVALID_ACCOUNTING_STRING("invalidAccountingString"),
        NOT_APPLICABLE("notApplicable"),
        WARNING("warning");
        private final String value;
        private final static Map<String, AccountFundsAvailable.FundsAvailable> CONSTANTS = new HashMap<String, AccountFundsAvailable.FundsAvailable>();

        static {
            for (AccountFundsAvailable.FundsAvailable c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FundsAvailable(String value) {
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
        public static AccountFundsAvailable.FundsAvailable fromValue(String value) {
            AccountFundsAvailable.FundsAvailable constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
