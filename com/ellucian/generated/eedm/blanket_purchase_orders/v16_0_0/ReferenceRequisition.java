
package com.ellucian.generated.eedm.blanket_purchase_orders.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requisition",
    "lineItemNumber"
})
@Generated("jsonschema2pojo")
public class ReferenceRequisition {

    /**
     * Requisition
     * <p>
     * The requisition referenced for the item ordered.
     * (Required)
     * 
     */
    @JsonProperty("requisition")
    @JsonPropertyDescription("The requisition referenced for the item ordered.")
    private Requisition requisition;
    /**
     * Line Item Number
     * <p>
     * The requisition line item number referenced for the item ordered.
     * 
     */
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("The requisition line item number referenced for the item ordered.")
    private String lineItemNumber;

    /**
     * Requisition
     * <p>
     * The requisition referenced for the item ordered.
     * (Required)
     * 
     */
    @JsonProperty("requisition")
    public Requisition getRequisition() {
        return requisition;
    }

    /**
     * Requisition
     * <p>
     * The requisition referenced for the item ordered.
     * (Required)
     * 
     */
    @JsonProperty("requisition")
    public void setRequisition(Requisition requisition) {
        this.requisition = requisition;
    }

    public ReferenceRequisition withRequisition(Requisition requisition) {
        this.requisition = requisition;
        return this;
    }

    /**
     * Line Item Number
     * <p>
     * The requisition line item number referenced for the item ordered.
     * 
     */
    @JsonProperty("lineItemNumber")
    public String getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Line Item Number
     * <p>
     * The requisition line item number referenced for the item ordered.
     * 
     */
    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(String lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    public ReferenceRequisition withLineItemNumber(String lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReferenceRequisition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("requisition");
        sb.append('=');
        sb.append(((this.requisition == null)?"<null>":this.requisition));
        sb.append(',');
        sb.append("lineItemNumber");
        sb.append('=');
        sb.append(((this.lineItemNumber == null)?"<null>":this.lineItemNumber));
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
        result = ((result* 31)+((this.requisition == null)? 0 :this.requisition.hashCode()));
        result = ((result* 31)+((this.lineItemNumber == null)? 0 :this.lineItemNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReferenceRequisition) == false) {
            return false;
        }
        ReferenceRequisition rhs = ((ReferenceRequisition) other);
        return (((this.requisition == rhs.requisition)||((this.requisition!= null)&&this.requisition.equals(rhs.requisition)))&&((this.lineItemNumber == rhs.lineItemNumber)||((this.lineItemNumber!= null)&&this.lineItemNumber.equals(rhs.lineItemNumber))));
    }

}
