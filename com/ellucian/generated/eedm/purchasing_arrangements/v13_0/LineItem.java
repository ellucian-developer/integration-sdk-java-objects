
package com.ellucian.generated.eedm.purchasing_arrangements.v13_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineItemNumber",
    "description",
    "commodityCode",
    "quantity",
    "unitOfMeasure",
    "unitPrice",
    "comments"
})
@Generated("jsonschema2pojo")
public class LineItem {

    /**
     * Line Item Number
     * <p>
     * A system generated number to identify the line item. User specified values will be overwritten.
     * 
     */
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("A system generated number to identify the line item. User specified values will be overwritten.")
    private String lineItemNumber;
    /**
     * Description
     * <p>
     * The description of the commodity specified by the line item.
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the commodity specified by the line item.")
    private String description;
    /**
     * Commodity Code
     * <p>
     * The commodity code associated with the line item.
     * 
     */
    @JsonProperty("commodityCode")
    @JsonPropertyDescription("The commodity code associated with the line item.")
    private Object commodityCode;
    /**
     * Quantity
     * <p>
     * The quantity of the line item.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("The quantity of the line item.")
    private Double quantity;
    /**
     * Unit Of Measure
     * <p>
     * The unit of measure type for the line item.
     * (Required)
     * 
     */
    @JsonProperty("unitOfMeasure")
    @JsonPropertyDescription("The unit of measure type for the line item.")
    private UnitOfMeasure unitOfMeasure;
    /**
     * Unit Price
     * <p>
     * The unit price of the line item.
     * (Required)
     * 
     */
    @JsonProperty("unitPrice")
    @JsonPropertyDescription("The unit price of the line item.")
    private UnitPrice unitPrice;
    /**
     * Comments
     * <p>
     * The comments associated with the line item.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments associated with the line item.")
    private List<Comment__1> comments = new ArrayList<Comment__1>();

    /**
     * Line Item Number
     * <p>
     * A system generated number to identify the line item. User specified values will be overwritten.
     * 
     */
    @JsonProperty("lineItemNumber")
    public String getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Line Item Number
     * <p>
     * A system generated number to identify the line item. User specified values will be overwritten.
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
     * Description
     * <p>
     * The description of the commodity specified by the line item.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the commodity specified by the line item.
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public LineItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Commodity Code
     * <p>
     * The commodity code associated with the line item.
     * 
     */
    @JsonProperty("commodityCode")
    public Object getCommodityCode() {
        return commodityCode;
    }

    /**
     * Commodity Code
     * <p>
     * The commodity code associated with the line item.
     * 
     */
    @JsonProperty("commodityCode")
    public void setCommodityCode(Object commodityCode) {
        this.commodityCode = commodityCode;
    }

    public LineItem withCommodityCode(Object commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    /**
     * Quantity
     * <p>
     * The quantity of the line item.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Quantity
     * <p>
     * The quantity of the line item.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public LineItem withQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Unit Of Measure
     * <p>
     * The unit of measure type for the line item.
     * (Required)
     * 
     */
    @JsonProperty("unitOfMeasure")
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Unit Of Measure
     * <p>
     * The unit of measure type for the line item.
     * (Required)
     * 
     */
    @JsonProperty("unitOfMeasure")
    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public LineItem withUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
        return this;
    }

    /**
     * Unit Price
     * <p>
     * The unit price of the line item.
     * (Required)
     * 
     */
    @JsonProperty("unitPrice")
    public UnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Unit Price
     * <p>
     * The unit price of the line item.
     * (Required)
     * 
     */
    @JsonProperty("unitPrice")
    public void setUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LineItem withUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the line item.
     * 
     */
    @JsonProperty("comments")
    public List<Comment__1> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the line item.
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<Comment__1> comments) {
        this.comments = comments;
    }

    public LineItem withComments(List<Comment__1> comments) {
        this.comments = comments;
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("commodityCode");
        sb.append('=');
        sb.append(((this.commodityCode == null)?"<null>":this.commodityCode));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("unitOfMeasure");
        sb.append('=');
        sb.append(((this.unitOfMeasure == null)?"<null>":this.unitOfMeasure));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
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
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.unitOfMeasure == null)? 0 :this.unitOfMeasure.hashCode()));
        result = ((result* 31)+((this.commodityCode == null)? 0 :this.commodityCode.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.lineItemNumber == null)? 0 :this.lineItemNumber.hashCode()));
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
        return ((((((((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice)))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.unitOfMeasure == rhs.unitOfMeasure)||((this.unitOfMeasure!= null)&&this.unitOfMeasure.equals(rhs.unitOfMeasure))))&&((this.commodityCode == rhs.commodityCode)||((this.commodityCode!= null)&&this.commodityCode.equals(rhs.commodityCode))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.lineItemNumber == rhs.lineItemNumber)||((this.lineItemNumber!= null)&&this.lineItemNumber.equals(rhs.lineItemNumber))));
    }

}
