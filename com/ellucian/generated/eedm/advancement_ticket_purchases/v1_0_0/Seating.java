
package com.ellucian.generated.eedm.advancement_ticket_purchases.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Seating
 * <p>
 * The seating details associated with the ticket.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "section",
    "rowDetail",
    "seatDetail"
})
@Generated("jsonschema2pojo")
public class Seating {

    /**
     * Section
     * <p>
     * The seating section associated with the ticket.
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("The seating section associated with the ticket.")
    private String section;
    /**
     * Row Detail
     * <p>
     * The seating row(s) associated with the ticket.
     * 
     */
    @JsonProperty("rowDetail")
    @JsonPropertyDescription("The seating row(s) associated with the ticket.")
    private String rowDetail;
    /**
     * Seat Detail
     * <p>
     * The seat(s) associated with the ticket.
     * 
     */
    @JsonProperty("seatDetail")
    @JsonPropertyDescription("The seat(s) associated with the ticket.")
    private String seatDetail;

    /**
     * Section
     * <p>
     * The seating section associated with the ticket.
     * 
     */
    @JsonProperty("section")
    public String getSection() {
        return section;
    }

    /**
     * Section
     * <p>
     * The seating section associated with the ticket.
     * 
     */
    @JsonProperty("section")
    public void setSection(String section) {
        this.section = section;
    }

    public Seating withSection(String section) {
        this.section = section;
        return this;
    }

    /**
     * Row Detail
     * <p>
     * The seating row(s) associated with the ticket.
     * 
     */
    @JsonProperty("rowDetail")
    public String getRowDetail() {
        return rowDetail;
    }

    /**
     * Row Detail
     * <p>
     * The seating row(s) associated with the ticket.
     * 
     */
    @JsonProperty("rowDetail")
    public void setRowDetail(String rowDetail) {
        this.rowDetail = rowDetail;
    }

    public Seating withRowDetail(String rowDetail) {
        this.rowDetail = rowDetail;
        return this;
    }

    /**
     * Seat Detail
     * <p>
     * The seat(s) associated with the ticket.
     * 
     */
    @JsonProperty("seatDetail")
    public String getSeatDetail() {
        return seatDetail;
    }

    /**
     * Seat Detail
     * <p>
     * The seat(s) associated with the ticket.
     * 
     */
    @JsonProperty("seatDetail")
    public void setSeatDetail(String seatDetail) {
        this.seatDetail = seatDetail;
    }

    public Seating withSeatDetail(String seatDetail) {
        this.seatDetail = seatDetail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Seating.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
        sb.append(',');
        sb.append("rowDetail");
        sb.append('=');
        sb.append(((this.rowDetail == null)?"<null>":this.rowDetail));
        sb.append(',');
        sb.append("seatDetail");
        sb.append('=');
        sb.append(((this.seatDetail == null)?"<null>":this.seatDetail));
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
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.rowDetail == null)? 0 :this.rowDetail.hashCode()));
        result = ((result* 31)+((this.seatDetail == null)? 0 :this.seatDetail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Seating) == false) {
            return false;
        }
        Seating rhs = ((Seating) other);
        return ((((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section)))&&((this.rowDetail == rhs.rowDetail)||((this.rowDetail!= null)&&this.rowDetail.equals(rhs.rowDetail))))&&((this.seatDetail == rhs.seatDetail)||((this.seatDetail!= null)&&this.seatDetail.equals(rhs.seatDetail))));
    }

}
