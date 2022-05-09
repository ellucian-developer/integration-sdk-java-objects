
package com.ellucian.generated.eedm.general_ledger_transactions.v12_2_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Encumbrance
 * <p>
 * The encumbrance associated with this transaction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "lineItemNumber",
    "sequenceNumber",
    "adjustmentType",
    "commitmentType"
})
@Generated("jsonschema2pojo")
public class Encumbrance {

    /**
     * Number
     * <p>
     * The encumbrance number.
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("The encumbrance number.")
    private String number;
    /**
     * Line Item Number
     * <p>
     * The line item number.
     * 
     */
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("The line item number.")
    private Object lineItemNumber;
    /**
     * Sequence Number
     * <p>
     * The sequence number of the accounting string.
     * 
     */
    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("The sequence number of the accounting string.")
    private Object sequenceNumber;
    /**
     * Adjustment Type
     * <p>
     * The adjustment type for the encumbrance.
     * 
     */
    @JsonProperty("adjustmentType")
    @JsonPropertyDescription("The adjustment type for the encumbrance.")
    private Object adjustmentType;
    /**
     * Commitment Type
     * <p>
     * The type of commitment (committed or uncommitted)
     * 
     */
    @JsonProperty("commitmentType")
    @JsonPropertyDescription("The type of commitment (committed or uncommitted)")
    private Object commitmentType;

    /**
     * Number
     * <p>
     * The encumbrance number.
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Number
     * <p>
     * The encumbrance number.
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Encumbrance withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Line Item Number
     * <p>
     * The line item number.
     * 
     */
    @JsonProperty("lineItemNumber")
    public Object getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Line Item Number
     * <p>
     * The line item number.
     * 
     */
    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(Object lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    public Encumbrance withLineItemNumber(Object lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * The sequence number of the accounting string.
     * 
     */
    @JsonProperty("sequenceNumber")
    public Object getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sequence Number
     * <p>
     * The sequence number of the accounting string.
     * 
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Object sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Encumbrance withSequenceNumber(Object sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Adjustment Type
     * <p>
     * The adjustment type for the encumbrance.
     * 
     */
    @JsonProperty("adjustmentType")
    public Object getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Adjustment Type
     * <p>
     * The adjustment type for the encumbrance.
     * 
     */
    @JsonProperty("adjustmentType")
    public void setAdjustmentType(Object adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public Encumbrance withAdjustmentType(Object adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * Commitment Type
     * <p>
     * The type of commitment (committed or uncommitted)
     * 
     */
    @JsonProperty("commitmentType")
    public Object getCommitmentType() {
        return commitmentType;
    }

    /**
     * Commitment Type
     * <p>
     * The type of commitment (committed or uncommitted)
     * 
     */
    @JsonProperty("commitmentType")
    public void setCommitmentType(Object commitmentType) {
        this.commitmentType = commitmentType;
    }

    public Encumbrance withCommitmentType(Object commitmentType) {
        this.commitmentType = commitmentType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Encumbrance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("lineItemNumber");
        sb.append('=');
        sb.append(((this.lineItemNumber == null)?"<null>":this.lineItemNumber));
        sb.append(',');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
        sb.append(',');
        sb.append("adjustmentType");
        sb.append('=');
        sb.append(((this.adjustmentType == null)?"<null>":this.adjustmentType));
        sb.append(',');
        sb.append("commitmentType");
        sb.append('=');
        sb.append(((this.commitmentType == null)?"<null>":this.commitmentType));
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
        result = ((result* 31)+((this.commitmentType == null)? 0 :this.commitmentType.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.lineItemNumber == null)? 0 :this.lineItemNumber.hashCode()));
        result = ((result* 31)+((this.adjustmentType == null)? 0 :this.adjustmentType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Encumbrance) == false) {
            return false;
        }
        Encumbrance rhs = ((Encumbrance) other);
        return ((((((this.commitmentType == rhs.commitmentType)||((this.commitmentType!= null)&&this.commitmentType.equals(rhs.commitmentType)))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber))))&&((this.lineItemNumber == rhs.lineItemNumber)||((this.lineItemNumber!= null)&&this.lineItemNumber.equals(rhs.lineItemNumber))))&&((this.adjustmentType == rhs.adjustmentType)||((this.adjustmentType!= null)&&this.adjustmentType.equals(rhs.adjustmentType))));
    }

}
