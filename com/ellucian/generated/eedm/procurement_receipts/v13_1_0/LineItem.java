
package com.ellucian.generated.eedm.procurement_receipts.v13_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineItemNumber",
    "received",
    "rejected",
    "comment"
})
@Generated("jsonschema2pojo")
public class LineItem {

    /**
     * Line Item Number
     * <p>
     * The line item number referenced from the purchase order.
     * (Required)
     * 
     */
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("The line item number referenced from the purchase order.")
    private String lineItemNumber;
    /**
     * Received
     * <p>
     * The received quantity or amount for the line item including the rejected quantity or amount.
     * (Required)
     * 
     */
    @JsonProperty("received")
    @JsonPropertyDescription("The received quantity or amount for the line item including the rejected quantity or amount.")
    private Object received;
    /**
     * Rejected
     * <p>
     * The rejected quantity or amount for line item.
     * 
     */
    @JsonProperty("rejected")
    @JsonPropertyDescription("The rejected quantity or amount for line item.")
    private Object rejected;
    /**
     * Comment
     * <p>
     * The comment associated with the line item.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the line item.")
    private String comment;

    /**
     * Line Item Number
     * <p>
     * The line item number referenced from the purchase order.
     * (Required)
     * 
     */
    @JsonProperty("lineItemNumber")
    public String getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Line Item Number
     * <p>
     * The line item number referenced from the purchase order.
     * (Required)
     * 
     */
    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(String lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    public LineItem withLineItemNumber(String lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
        return this;
    }

    /**
     * Received
     * <p>
     * The received quantity or amount for the line item including the rejected quantity or amount.
     * (Required)
     * 
     */
    @JsonProperty("received")
    public Object getReceived() {
        return received;
    }

    /**
     * Received
     * <p>
     * The received quantity or amount for the line item including the rejected quantity or amount.
     * (Required)
     * 
     */
    @JsonProperty("received")
    public void setReceived(Object received) {
        this.received = received;
    }

    public LineItem withReceived(Object received) {
        this.received = received;
        return this;
    }

    /**
     * Rejected
     * <p>
     * The rejected quantity or amount for line item.
     * 
     */
    @JsonProperty("rejected")
    public Object getRejected() {
        return rejected;
    }

    /**
     * Rejected
     * <p>
     * The rejected quantity or amount for line item.
     * 
     */
    @JsonProperty("rejected")
    public void setRejected(Object rejected) {
        this.rejected = rejected;
    }

    public LineItem withRejected(Object rejected) {
        this.rejected = rejected;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the line item.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the line item.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public LineItem withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lineItemNumber");
        sb.append('=');
        sb.append(((this.lineItemNumber == null)?"<null>":this.lineItemNumber));
        sb.append(',');
        sb.append("received");
        sb.append('=');
        sb.append(((this.received == null)?"<null>":this.received));
        sb.append(',');
        sb.append("rejected");
        sb.append('=');
        sb.append(((this.rejected == null)?"<null>":this.rejected));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.received == null)? 0 :this.received.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.lineItemNumber == null)? 0 :this.lineItemNumber.hashCode()));
        result = ((result* 31)+((this.rejected == null)? 0 :this.rejected.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineItem) == false) {
            return false;
        }
        LineItem rhs = ((LineItem) other);
        return (((((this.received == rhs.received)||((this.received!= null)&&this.received.equals(rhs.received)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.lineItemNumber == rhs.lineItemNumber)||((this.lineItemNumber!= null)&&this.lineItemNumber.equals(rhs.lineItemNumber))))&&((this.rejected == rhs.rejected)||((this.rejected!= null)&&this.rejected.equals(rhs.rejected))));
    }

}
