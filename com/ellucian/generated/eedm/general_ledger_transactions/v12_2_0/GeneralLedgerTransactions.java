
package com.ellucian.generated.eedm.general_ledger_transactions.v12_2_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * General Ledger Transactions
 * <p>
 * The details of transactions to be entered into the general ledger.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "processMode",
    "submittedBy",
    "comment",
    "transactions"
})
@Generated("jsonschema2pojo")
public class GeneralLedgerTransactions {

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
     * The global identifier of the general ledger transaction.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the general ledger transaction.")
    private String id;
    /**
     * Process Mode
     * <p>
     * An indicator that specifies if the authoritative source should just validate the accounting string or if it should post/update a general ledger transaction.
     * (Required)
     * 
     */
    @JsonProperty("processMode")
    @JsonPropertyDescription("An indicator that specifies if the authoritative source should just validate the accounting string or if it should post/update a general ledger transaction.")
    private GeneralLedgerTransactions.ProcessMode processMode;
    /**
     * Submitted By
     * <p>
     * The person submitting the general ledger transactions.
     * 
     */
    @JsonProperty("submittedBy")
    @JsonPropertyDescription("The person submitting the general ledger transactions.")
    private Object submittedBy;
    /**
     * Comment
     * <p>
     * The comment associated with the transaction.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the transaction.")
    private String comment;
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

    public GeneralLedgerTransactions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the general ledger transaction.
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
     * The global identifier of the general ledger transaction.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GeneralLedgerTransactions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Process Mode
     * <p>
     * An indicator that specifies if the authoritative source should just validate the accounting string or if it should post/update a general ledger transaction.
     * (Required)
     * 
     */
    @JsonProperty("processMode")
    public GeneralLedgerTransactions.ProcessMode getProcessMode() {
        return processMode;
    }

    /**
     * Process Mode
     * <p>
     * An indicator that specifies if the authoritative source should just validate the accounting string or if it should post/update a general ledger transaction.
     * (Required)
     * 
     */
    @JsonProperty("processMode")
    public void setProcessMode(GeneralLedgerTransactions.ProcessMode processMode) {
        this.processMode = processMode;
    }

    public GeneralLedgerTransactions withProcessMode(GeneralLedgerTransactions.ProcessMode processMode) {
        this.processMode = processMode;
        return this;
    }

    /**
     * Submitted By
     * <p>
     * The person submitting the general ledger transactions.
     * 
     */
    @JsonProperty("submittedBy")
    public Object getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Submitted By
     * <p>
     * The person submitting the general ledger transactions.
     * 
     */
    @JsonProperty("submittedBy")
    public void setSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
    }

    public GeneralLedgerTransactions withSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the transaction.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the transaction.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public GeneralLedgerTransactions withComment(String comment) {
        this.comment = comment;
        return this;
    }

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

    public GeneralLedgerTransactions withTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralLedgerTransactions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("processMode");
        sb.append('=');
        sb.append(((this.processMode == null)?"<null>":this.processMode));
        sb.append(',');
        sb.append("submittedBy");
        sb.append('=');
        sb.append(((this.submittedBy == null)?"<null>":this.submittedBy));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
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
        result = ((result* 31)+((this.submittedBy == null)? 0 :this.submittedBy.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.processMode == null)? 0 :this.processMode.hashCode()));
        result = ((result* 31)+((this.transactions == null)? 0 :this.transactions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralLedgerTransactions) == false) {
            return false;
        }
        GeneralLedgerTransactions rhs = ((GeneralLedgerTransactions) other);
        return (((((((this.submittedBy == rhs.submittedBy)||((this.submittedBy!= null)&&this.submittedBy.equals(rhs.submittedBy)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.processMode == rhs.processMode)||((this.processMode!= null)&&this.processMode.equals(rhs.processMode))))&&((this.transactions == rhs.transactions)||((this.transactions!= null)&&this.transactions.equals(rhs.transactions))));
    }


    /**
     * Process Mode
     * <p>
     * An indicator that specifies if the authoritative source should just validate the accounting string or if it should post/update a general ledger transaction.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ProcessMode {

        UPDATE_IMMEDIATE("updateImmediate"),
        VALIDATE("validate"),
        UPDATE_BATCH("updateBatch");
        private final String value;
        private final static Map<String, GeneralLedgerTransactions.ProcessMode> CONSTANTS = new HashMap<String, GeneralLedgerTransactions.ProcessMode>();

        static {
            for (GeneralLedgerTransactions.ProcessMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ProcessMode(String value) {
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
        public static GeneralLedgerTransactions.ProcessMode fromValue(String value) {
            GeneralLedgerTransactions.ProcessMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
