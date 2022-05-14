
package com.ellucian.generated.eedm.accounting_strings.v7_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Accounting Strings
 * <p>
 * Accounting strings that are valid for use with the finance system.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "accountingString",
    "description"
})
@Generated("jsonschema2pojo")
public class AccountingStrings {

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
    @JsonPropertyDescription("The full representation of the accounting string in the format specified by the authoritative system.")
    private String accountingString;
    /**
     * Description
     * <p>
     * The description of the accounting-string.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the accounting-string.")
    private String description;

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

    public AccountingStrings withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

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

    public AccountingStrings withAccountingString(String accountingString) {
        this.accountingString = accountingString;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the accounting-string.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the accounting-string.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AccountingStrings withDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountingStrings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("accountingString");
        sb.append('=');
        sb.append(((this.accountingString == null)?"<null>":this.accountingString));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountingStrings) == false) {
            return false;
        }
        AccountingStrings rhs = ((AccountingStrings) other);
        return ((((this.accountingString == rhs.accountingString)||((this.accountingString!= null)&&this.accountingString.equals(rhs.accountingString)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))));
    }

}
