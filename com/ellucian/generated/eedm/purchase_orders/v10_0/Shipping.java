
package com.ellucian.generated.eedm.purchase_orders.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Shipping
 * <p>
 * The shipping information associated with the purchase order.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attention",
    "shipTo",
    "freeOnBoard"
})
@Generated("jsonschema2pojo")
public class Shipping {

    /**
     * Attention
     * <p>
     * The person or office to which the shipment is directed.
     * 
     */
    @JsonProperty("attention")
    @JsonPropertyDescription("The person or office to which the shipment is directed.")
    private String attention;
    /**
     * Ship To
     * <p>
     * The destination to which the items should be shipped.
     * 
     */
    @JsonProperty("shipTo")
    @JsonPropertyDescription("The destination to which the items should be shipped.")
    private Object shipTo;
    /**
     * Free On Board
     * <p>
     * The free on board (FOB) type specified for the purchase order.
     * 
     */
    @JsonProperty("freeOnBoard")
    @JsonPropertyDescription("The free on board (FOB) type specified for the purchase order.")
    private FreeOnBoard freeOnBoard;

    /**
     * Attention
     * <p>
     * The person or office to which the shipment is directed.
     * 
     */
    @JsonProperty("attention")
    public String getAttention() {
        return attention;
    }

    /**
     * Attention
     * <p>
     * The person or office to which the shipment is directed.
     * 
     */
    @JsonProperty("attention")
    public void setAttention(String attention) {
        this.attention = attention;
    }

    public Shipping withAttention(String attention) {
        this.attention = attention;
        return this;
    }

    /**
     * Ship To
     * <p>
     * The destination to which the items should be shipped.
     * 
     */
    @JsonProperty("shipTo")
    public Object getShipTo() {
        return shipTo;
    }

    /**
     * Ship To
     * <p>
     * The destination to which the items should be shipped.
     * 
     */
    @JsonProperty("shipTo")
    public void setShipTo(Object shipTo) {
        this.shipTo = shipTo;
    }

    public Shipping withShipTo(Object shipTo) {
        this.shipTo = shipTo;
        return this;
    }

    /**
     * Free On Board
     * <p>
     * The free on board (FOB) type specified for the purchase order.
     * 
     */
    @JsonProperty("freeOnBoard")
    public FreeOnBoard getFreeOnBoard() {
        return freeOnBoard;
    }

    /**
     * Free On Board
     * <p>
     * The free on board (FOB) type specified for the purchase order.
     * 
     */
    @JsonProperty("freeOnBoard")
    public void setFreeOnBoard(FreeOnBoard freeOnBoard) {
        this.freeOnBoard = freeOnBoard;
    }

    public Shipping withFreeOnBoard(FreeOnBoard freeOnBoard) {
        this.freeOnBoard = freeOnBoard;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shipping.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attention");
        sb.append('=');
        sb.append(((this.attention == null)?"<null>":this.attention));
        sb.append(',');
        sb.append("shipTo");
        sb.append('=');
        sb.append(((this.shipTo == null)?"<null>":this.shipTo));
        sb.append(',');
        sb.append("freeOnBoard");
        sb.append('=');
        sb.append(((this.freeOnBoard == null)?"<null>":this.freeOnBoard));
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
        result = ((result* 31)+((this.attention == null)? 0 :this.attention.hashCode()));
        result = ((result* 31)+((this.freeOnBoard == null)? 0 :this.freeOnBoard.hashCode()));
        result = ((result* 31)+((this.shipTo == null)? 0 :this.shipTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shipping) == false) {
            return false;
        }
        Shipping rhs = ((Shipping) other);
        return ((((this.attention == rhs.attention)||((this.attention!= null)&&this.attention.equals(rhs.attention)))&&((this.freeOnBoard == rhs.freeOnBoard)||((this.freeOnBoard!= null)&&this.freeOnBoard.equals(rhs.freeOnBoard))))&&((this.shipTo == rhs.shipTo)||((this.shipTo!= null)&&this.shipTo.equals(rhs.shipTo))));
    }

}
