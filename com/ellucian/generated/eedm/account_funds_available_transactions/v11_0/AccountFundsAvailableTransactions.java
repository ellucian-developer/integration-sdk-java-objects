
package com.ellucian.generated.eedm.account_funds_available_transactions.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Account Funds Available Transactions
 * <p>
 * A check on the availability of funds for all accounts involved in transactions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactions"
})
@Generated("jsonschema2pojo")
public class AccountFundsAvailableTransactions {

    /**
     * Transactions
     * <p>
     * A list of associated general ledger transactions.
     * (Required)
     * 
     */
    @JsonProperty("transactions")
    @JsonPropertyDescription("A list of associated general ledger transactions.")
    private List<Transaction> transactions = new ArrayList<Transaction>();

    /**
     * Transactions
     * <p>
     * A list of associated general ledger transactions.
     * (Required)
     * 
     */
    @JsonProperty("transactions")
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Transactions
     * <p>
     * A list of associated general ledger transactions.
     * (Required)
     * 
     */
    @JsonProperty("transactions")
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public AccountFundsAvailableTransactions withTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountFundsAvailableTransactions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transactions");
        sb.append('=');
        sb.append(((this.transactions == null)?"<null>":this.transactions));
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
        result = ((result* 31)+((this.transactions == null)? 0 :this.transactions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountFundsAvailableTransactions) == false) {
            return false;
        }
        AccountFundsAvailableTransactions rhs = ((AccountFundsAvailableTransactions) other);
        return ((this.transactions == rhs.transactions)||((this.transactions!= null)&&this.transactions.equals(rhs.transactions)));
    }

}
