
package com.ellucian.generated.eedm.advancement_ticket_purchases.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Advancement Ticket Purchases
 * <p>
 * Information about ticket purchases relevant to advancement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "ticketReference",
    "ticketHolder",
    "ticketType",
    "season",
    "purchaseDate",
    "numberOfTickets",
    "amountPaidPerTicket",
    "totalAmountPaid",
    "discount",
    "seatingType",
    "venue",
    "seating",
    "source",
    "status",
    "comment"
})
@Generated("jsonschema2pojo")
public class AdvancementTicketPurchases {

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
     * The global identifier of the advancement ticket purchase.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the advancement ticket purchase.")
    private String id;
    /**
     * Ticket Reference
     * <p>
     * A reference number generated by the originating system.
     * 
     */
    @JsonProperty("ticketReference")
    @JsonPropertyDescription("A reference number generated by the originating system.")
    private String ticketReference;
    /**
     * Ticket Holder
     * <p>
     * The primary ticket holder associated with the ticket purchase.
     * (Required)
     * 
     */
    @JsonProperty("ticketHolder")
    @JsonPropertyDescription("The primary ticket holder associated with the ticket purchase.")
    private Object ticketHolder;
    /**
     * Ticket Type
     * <p>
     * The ticket type.
     * (Required)
     * 
     */
    @JsonProperty("ticketType")
    @JsonPropertyDescription("The ticket type.")
    private TicketType ticketType;
    /**
     * Season
     * <p>
     * The season associated with the ticket.
     * 
     */
    @JsonProperty("season")
    @JsonPropertyDescription("The season associated with the ticket.")
    private Object season;
    /**
     * Purchase Date
     * <p>
     * The date the ticket was purchased.
     * (Required)
     * 
     */
    @JsonProperty("purchaseDate")
    @JsonPropertyDescription("The date the ticket was purchased.")
    private String purchaseDate;
    /**
     * Number Of Tickets
     * <p>
     * The number of tickets purchased.
     * 
     */
    @JsonProperty("numberOfTickets")
    @JsonPropertyDescription("The number of tickets purchased.")
    private Object numberOfTickets;
    /**
     * Amount Paid Per Ticket
     * <p>
     * The amount paid per ticket.
     * 
     */
    @JsonProperty("amountPaidPerTicket")
    @JsonPropertyDescription("The amount paid per ticket.")
    private Object amountPaidPerTicket;
    /**
     * Total Amount Paid
     * <p>
     * The total amount paid, including any taxes or fees.
     * 
     */
    @JsonProperty("totalAmountPaid")
    @JsonPropertyDescription("The total amount paid, including any taxes or fees.")
    private Object totalAmountPaid;
    /**
     * Discount
     * <p>
     * The discount associated with the ticket purchase.
     * 
     */
    @JsonProperty("discount")
    @JsonPropertyDescription("The discount associated with the ticket purchase.")
    private String discount;
    /**
     * Seating Type
     * <p>
     * The seating type associated with the ticket.
     * 
     */
    @JsonProperty("seatingType")
    @JsonPropertyDescription("The seating type associated with the ticket.")
    private Object seatingType;
    /**
     * Venue
     * <p>
     * The venue associated with the ticket.
     * 
     */
    @JsonProperty("venue")
    @JsonPropertyDescription("The venue associated with the ticket.")
    private Object venue;
    /**
     * Seating
     * <p>
     * The seating details associated with the ticket.
     * 
     */
    @JsonProperty("seating")
    @JsonPropertyDescription("The seating details associated with the ticket.")
    private Seating seating;
    /**
     * Source
     * <p>
     * The source of the ticket purchase.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the ticket purchase.")
    private Object source;
    /**
     * Status
     * <p>
     * The status of the ticket purchase (i.e., canceled, refunded, etc).
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the ticket purchase (i.e., canceled, refunded, etc).")
    private Object status;
    /**
     * Comment
     * <p>
     * The comment associated with the ticket purchase.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the ticket purchase.")
    private String comment;

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

    public AdvancementTicketPurchases withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the advancement ticket purchase.
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
     * The global identifier of the advancement ticket purchase.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdvancementTicketPurchases withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Ticket Reference
     * <p>
     * A reference number generated by the originating system.
     * 
     */
    @JsonProperty("ticketReference")
    public String getTicketReference() {
        return ticketReference;
    }

    /**
     * Ticket Reference
     * <p>
     * A reference number generated by the originating system.
     * 
     */
    @JsonProperty("ticketReference")
    public void setTicketReference(String ticketReference) {
        this.ticketReference = ticketReference;
    }

    public AdvancementTicketPurchases withTicketReference(String ticketReference) {
        this.ticketReference = ticketReference;
        return this;
    }

    /**
     * Ticket Holder
     * <p>
     * The primary ticket holder associated with the ticket purchase.
     * (Required)
     * 
     */
    @JsonProperty("ticketHolder")
    public Object getTicketHolder() {
        return ticketHolder;
    }

    /**
     * Ticket Holder
     * <p>
     * The primary ticket holder associated with the ticket purchase.
     * (Required)
     * 
     */
    @JsonProperty("ticketHolder")
    public void setTicketHolder(Object ticketHolder) {
        this.ticketHolder = ticketHolder;
    }

    public AdvancementTicketPurchases withTicketHolder(Object ticketHolder) {
        this.ticketHolder = ticketHolder;
        return this;
    }

    /**
     * Ticket Type
     * <p>
     * The ticket type.
     * (Required)
     * 
     */
    @JsonProperty("ticketType")
    public TicketType getTicketType() {
        return ticketType;
    }

    /**
     * Ticket Type
     * <p>
     * The ticket type.
     * (Required)
     * 
     */
    @JsonProperty("ticketType")
    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public AdvancementTicketPurchases withTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * Season
     * <p>
     * The season associated with the ticket.
     * 
     */
    @JsonProperty("season")
    public Object getSeason() {
        return season;
    }

    /**
     * Season
     * <p>
     * The season associated with the ticket.
     * 
     */
    @JsonProperty("season")
    public void setSeason(Object season) {
        this.season = season;
    }

    public AdvancementTicketPurchases withSeason(Object season) {
        this.season = season;
        return this;
    }

    /**
     * Purchase Date
     * <p>
     * The date the ticket was purchased.
     * (Required)
     * 
     */
    @JsonProperty("purchaseDate")
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Purchase Date
     * <p>
     * The date the ticket was purchased.
     * (Required)
     * 
     */
    @JsonProperty("purchaseDate")
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public AdvancementTicketPurchases withPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    /**
     * Number Of Tickets
     * <p>
     * The number of tickets purchased.
     * 
     */
    @JsonProperty("numberOfTickets")
    public Object getNumberOfTickets() {
        return numberOfTickets;
    }

    /**
     * Number Of Tickets
     * <p>
     * The number of tickets purchased.
     * 
     */
    @JsonProperty("numberOfTickets")
    public void setNumberOfTickets(Object numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public AdvancementTicketPurchases withNumberOfTickets(Object numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
        return this;
    }

    /**
     * Amount Paid Per Ticket
     * <p>
     * The amount paid per ticket.
     * 
     */
    @JsonProperty("amountPaidPerTicket")
    public Object getAmountPaidPerTicket() {
        return amountPaidPerTicket;
    }

    /**
     * Amount Paid Per Ticket
     * <p>
     * The amount paid per ticket.
     * 
     */
    @JsonProperty("amountPaidPerTicket")
    public void setAmountPaidPerTicket(Object amountPaidPerTicket) {
        this.amountPaidPerTicket = amountPaidPerTicket;
    }

    public AdvancementTicketPurchases withAmountPaidPerTicket(Object amountPaidPerTicket) {
        this.amountPaidPerTicket = amountPaidPerTicket;
        return this;
    }

    /**
     * Total Amount Paid
     * <p>
     * The total amount paid, including any taxes or fees.
     * 
     */
    @JsonProperty("totalAmountPaid")
    public Object getTotalAmountPaid() {
        return totalAmountPaid;
    }

    /**
     * Total Amount Paid
     * <p>
     * The total amount paid, including any taxes or fees.
     * 
     */
    @JsonProperty("totalAmountPaid")
    public void setTotalAmountPaid(Object totalAmountPaid) {
        this.totalAmountPaid = totalAmountPaid;
    }

    public AdvancementTicketPurchases withTotalAmountPaid(Object totalAmountPaid) {
        this.totalAmountPaid = totalAmountPaid;
        return this;
    }

    /**
     * Discount
     * <p>
     * The discount associated with the ticket purchase.
     * 
     */
    @JsonProperty("discount")
    public String getDiscount() {
        return discount;
    }

    /**
     * Discount
     * <p>
     * The discount associated with the ticket purchase.
     * 
     */
    @JsonProperty("discount")
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public AdvancementTicketPurchases withDiscount(String discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Seating Type
     * <p>
     * The seating type associated with the ticket.
     * 
     */
    @JsonProperty("seatingType")
    public Object getSeatingType() {
        return seatingType;
    }

    /**
     * Seating Type
     * <p>
     * The seating type associated with the ticket.
     * 
     */
    @JsonProperty("seatingType")
    public void setSeatingType(Object seatingType) {
        this.seatingType = seatingType;
    }

    public AdvancementTicketPurchases withSeatingType(Object seatingType) {
        this.seatingType = seatingType;
        return this;
    }

    /**
     * Venue
     * <p>
     * The venue associated with the ticket.
     * 
     */
    @JsonProperty("venue")
    public Object getVenue() {
        return venue;
    }

    /**
     * Venue
     * <p>
     * The venue associated with the ticket.
     * 
     */
    @JsonProperty("venue")
    public void setVenue(Object venue) {
        this.venue = venue;
    }

    public AdvancementTicketPurchases withVenue(Object venue) {
        this.venue = venue;
        return this;
    }

    /**
     * Seating
     * <p>
     * The seating details associated with the ticket.
     * 
     */
    @JsonProperty("seating")
    public Seating getSeating() {
        return seating;
    }

    /**
     * Seating
     * <p>
     * The seating details associated with the ticket.
     * 
     */
    @JsonProperty("seating")
    public void setSeating(Seating seating) {
        this.seating = seating;
    }

    public AdvancementTicketPurchases withSeating(Seating seating) {
        this.seating = seating;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the ticket purchase.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the ticket purchase.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public AdvancementTicketPurchases withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the ticket purchase (i.e., canceled, refunded, etc).
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the ticket purchase (i.e., canceled, refunded, etc).
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public AdvancementTicketPurchases withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the ticket purchase.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the ticket purchase.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public AdvancementTicketPurchases withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdvancementTicketPurchases.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ticketReference");
        sb.append('=');
        sb.append(((this.ticketReference == null)?"<null>":this.ticketReference));
        sb.append(',');
        sb.append("ticketHolder");
        sb.append('=');
        sb.append(((this.ticketHolder == null)?"<null>":this.ticketHolder));
        sb.append(',');
        sb.append("ticketType");
        sb.append('=');
        sb.append(((this.ticketType == null)?"<null>":this.ticketType));
        sb.append(',');
        sb.append("season");
        sb.append('=');
        sb.append(((this.season == null)?"<null>":this.season));
        sb.append(',');
        sb.append("purchaseDate");
        sb.append('=');
        sb.append(((this.purchaseDate == null)?"<null>":this.purchaseDate));
        sb.append(',');
        sb.append("numberOfTickets");
        sb.append('=');
        sb.append(((this.numberOfTickets == null)?"<null>":this.numberOfTickets));
        sb.append(',');
        sb.append("amountPaidPerTicket");
        sb.append('=');
        sb.append(((this.amountPaidPerTicket == null)?"<null>":this.amountPaidPerTicket));
        sb.append(',');
        sb.append("totalAmountPaid");
        sb.append('=');
        sb.append(((this.totalAmountPaid == null)?"<null>":this.totalAmountPaid));
        sb.append(',');
        sb.append("discount");
        sb.append('=');
        sb.append(((this.discount == null)?"<null>":this.discount));
        sb.append(',');
        sb.append("seatingType");
        sb.append('=');
        sb.append(((this.seatingType == null)?"<null>":this.seatingType));
        sb.append(',');
        sb.append("venue");
        sb.append('=');
        sb.append(((this.venue == null)?"<null>":this.venue));
        sb.append(',');
        sb.append("seating");
        sb.append('=');
        sb.append(((this.seating == null)?"<null>":this.seating));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.ticketReference == null)? 0 :this.ticketReference.hashCode()));
        result = ((result* 31)+((this.venue == null)? 0 :this.venue.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.purchaseDate == null)? 0 :this.purchaseDate.hashCode()));
        result = ((result* 31)+((this.discount == null)? 0 :this.discount.hashCode()));
        result = ((result* 31)+((this.ticketType == null)? 0 :this.ticketType.hashCode()));
        result = ((result* 31)+((this.totalAmountPaid == null)? 0 :this.totalAmountPaid.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.seating == null)? 0 :this.seating.hashCode()));
        result = ((result* 31)+((this.amountPaidPerTicket == null)? 0 :this.amountPaidPerTicket.hashCode()));
        result = ((result* 31)+((this.seatingType == null)? 0 :this.seatingType.hashCode()));
        result = ((result* 31)+((this.numberOfTickets == null)? 0 :this.numberOfTickets.hashCode()));
        result = ((result* 31)+((this.season == null)? 0 :this.season.hashCode()));
        result = ((result* 31)+((this.ticketHolder == null)? 0 :this.ticketHolder.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvancementTicketPurchases) == false) {
            return false;
        }
        AdvancementTicketPurchases rhs = ((AdvancementTicketPurchases) other);
        return ((((((((((((((((((this.ticketReference == rhs.ticketReference)||((this.ticketReference!= null)&&this.ticketReference.equals(rhs.ticketReference)))&&((this.venue == rhs.venue)||((this.venue!= null)&&this.venue.equals(rhs.venue))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.purchaseDate == rhs.purchaseDate)||((this.purchaseDate!= null)&&this.purchaseDate.equals(rhs.purchaseDate))))&&((this.discount == rhs.discount)||((this.discount!= null)&&this.discount.equals(rhs.discount))))&&((this.ticketType == rhs.ticketType)||((this.ticketType!= null)&&this.ticketType.equals(rhs.ticketType))))&&((this.totalAmountPaid == rhs.totalAmountPaid)||((this.totalAmountPaid!= null)&&this.totalAmountPaid.equals(rhs.totalAmountPaid))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.seating == rhs.seating)||((this.seating!= null)&&this.seating.equals(rhs.seating))))&&((this.amountPaidPerTicket == rhs.amountPaidPerTicket)||((this.amountPaidPerTicket!= null)&&this.amountPaidPerTicket.equals(rhs.amountPaidPerTicket))))&&((this.seatingType == rhs.seatingType)||((this.seatingType!= null)&&this.seatingType.equals(rhs.seatingType))))&&((this.numberOfTickets == rhs.numberOfTickets)||((this.numberOfTickets!= null)&&this.numberOfTickets.equals(rhs.numberOfTickets))))&&((this.season == rhs.season)||((this.season!= null)&&this.season.equals(rhs.season))))&&((this.ticketHolder == rhs.ticketHolder)||((this.ticketHolder!= null)&&this.ticketHolder.equals(rhs.ticketHolder))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
