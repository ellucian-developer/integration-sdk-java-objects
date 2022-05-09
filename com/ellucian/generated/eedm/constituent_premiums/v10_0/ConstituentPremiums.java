
package com.ellucian.generated.eedm.constituent_premiums.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Premiums
 * <p>
 * The information associated with premiums assigned to constituents.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "constituent",
    "premium",
    "assignedOn",
    "assignmentReason",
    "quantity",
    "fairMarketValue",
    "acceptanceStatus"
})
@Generated("jsonschema2pojo")
public class ConstituentPremiums {

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
     * The global identifier of the constituent premium.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent premium.")
    private String id;
    /**
     * Constituent
     * <p>
     * The constituent who has been assigned the premium.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The constituent who has been assigned the premium.")
    private Object constituent;
    /**
     * Premium
     * <p>
     * The goods or services offered as the premium.
     * (Required)
     * 
     */
    @JsonProperty("premium")
    @JsonPropertyDescription("The goods or services offered as the premium.")
    private Premium premium;
    /**
     * Assigned On
     * <p>
     * The date on which the premium was assigned to the constituent.
     * (Required)
     * 
     */
    @JsonProperty("assignedOn")
    @JsonPropertyDescription("The date on which the premium was assigned to the constituent.")
    private String assignedOn;
    /**
     * Assignment Reason
     * <p>
     * The reason for assigning the premium to the constituent.
     * 
     */
    @JsonProperty("assignmentReason")
    @JsonPropertyDescription("The reason for assigning the premium to the constituent.")
    private Object assignmentReason;
    /**
     * Quantity
     * <p>
     * The quantity of the premium assigned to the constituent.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("The quantity of the premium assigned to the constituent.")
    private Integer quantity;
    /**
     * Fair Market Value
     * <p>
     * The fair market value per premium.
     * 
     */
    @JsonProperty("fairMarketValue")
    @JsonPropertyDescription("The fair market value per premium.")
    private Object fairMarketValue;
    /**
     * Acceptance Status
     * <p>
     * The status of constituent's acceptance of the assignment of the premium.
     * 
     */
    @JsonProperty("acceptanceStatus")
    @JsonPropertyDescription("The status of constituent's acceptance of the assignment of the premium.")
    private Object acceptanceStatus;

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

    public ConstituentPremiums withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent premium.
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
     * The global identifier of the constituent premium.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentPremiums withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Constituent
     * <p>
     * The constituent who has been assigned the premium.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public Object getConstituent() {
        return constituent;
    }

    /**
     * Constituent
     * <p>
     * The constituent who has been assigned the premium.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public ConstituentPremiums withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    /**
     * Premium
     * <p>
     * The goods or services offered as the premium.
     * (Required)
     * 
     */
    @JsonProperty("premium")
    public Premium getPremium() {
        return premium;
    }

    /**
     * Premium
     * <p>
     * The goods or services offered as the premium.
     * (Required)
     * 
     */
    @JsonProperty("premium")
    public void setPremium(Premium premium) {
        this.premium = premium;
    }

    public ConstituentPremiums withPremium(Premium premium) {
        this.premium = premium;
        return this;
    }

    /**
     * Assigned On
     * <p>
     * The date on which the premium was assigned to the constituent.
     * (Required)
     * 
     */
    @JsonProperty("assignedOn")
    public String getAssignedOn() {
        return assignedOn;
    }

    /**
     * Assigned On
     * <p>
     * The date on which the premium was assigned to the constituent.
     * (Required)
     * 
     */
    @JsonProperty("assignedOn")
    public void setAssignedOn(String assignedOn) {
        this.assignedOn = assignedOn;
    }

    public ConstituentPremiums withAssignedOn(String assignedOn) {
        this.assignedOn = assignedOn;
        return this;
    }

    /**
     * Assignment Reason
     * <p>
     * The reason for assigning the premium to the constituent.
     * 
     */
    @JsonProperty("assignmentReason")
    public Object getAssignmentReason() {
        return assignmentReason;
    }

    /**
     * Assignment Reason
     * <p>
     * The reason for assigning the premium to the constituent.
     * 
     */
    @JsonProperty("assignmentReason")
    public void setAssignmentReason(Object assignmentReason) {
        this.assignmentReason = assignmentReason;
    }

    public ConstituentPremiums withAssignmentReason(Object assignmentReason) {
        this.assignmentReason = assignmentReason;
        return this;
    }

    /**
     * Quantity
     * <p>
     * The quantity of the premium assigned to the constituent.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Quantity
     * <p>
     * The quantity of the premium assigned to the constituent.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ConstituentPremiums withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Fair Market Value
     * <p>
     * The fair market value per premium.
     * 
     */
    @JsonProperty("fairMarketValue")
    public Object getFairMarketValue() {
        return fairMarketValue;
    }

    /**
     * Fair Market Value
     * <p>
     * The fair market value per premium.
     * 
     */
    @JsonProperty("fairMarketValue")
    public void setFairMarketValue(Object fairMarketValue) {
        this.fairMarketValue = fairMarketValue;
    }

    public ConstituentPremiums withFairMarketValue(Object fairMarketValue) {
        this.fairMarketValue = fairMarketValue;
        return this;
    }

    /**
     * Acceptance Status
     * <p>
     * The status of constituent's acceptance of the assignment of the premium.
     * 
     */
    @JsonProperty("acceptanceStatus")
    public Object getAcceptanceStatus() {
        return acceptanceStatus;
    }

    /**
     * Acceptance Status
     * <p>
     * The status of constituent's acceptance of the assignment of the premium.
     * 
     */
    @JsonProperty("acceptanceStatus")
    public void setAcceptanceStatus(Object acceptanceStatus) {
        this.acceptanceStatus = acceptanceStatus;
    }

    public ConstituentPremiums withAcceptanceStatus(Object acceptanceStatus) {
        this.acceptanceStatus = acceptanceStatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentPremiums.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
        sb.append(',');
        sb.append("premium");
        sb.append('=');
        sb.append(((this.premium == null)?"<null>":this.premium));
        sb.append(',');
        sb.append("assignedOn");
        sb.append('=');
        sb.append(((this.assignedOn == null)?"<null>":this.assignedOn));
        sb.append(',');
        sb.append("assignmentReason");
        sb.append('=');
        sb.append(((this.assignmentReason == null)?"<null>":this.assignmentReason));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("fairMarketValue");
        sb.append('=');
        sb.append(((this.fairMarketValue == null)?"<null>":this.fairMarketValue));
        sb.append(',');
        sb.append("acceptanceStatus");
        sb.append('=');
        sb.append(((this.acceptanceStatus == null)?"<null>":this.acceptanceStatus));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.premium == null)? 0 :this.premium.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.fairMarketValue == null)? 0 :this.fairMarketValue.hashCode()));
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        result = ((result* 31)+((this.assignmentReason == null)? 0 :this.assignmentReason.hashCode()));
        result = ((result* 31)+((this.assignedOn == null)? 0 :this.assignedOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.acceptanceStatus == null)? 0 :this.acceptanceStatus.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentPremiums) == false) {
            return false;
        }
        ConstituentPremiums rhs = ((ConstituentPremiums) other);
        return ((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.premium == rhs.premium)||((this.premium!= null)&&this.premium.equals(rhs.premium))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.fairMarketValue == rhs.fairMarketValue)||((this.fairMarketValue!= null)&&this.fairMarketValue.equals(rhs.fairMarketValue))))&&((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent))))&&((this.assignmentReason == rhs.assignmentReason)||((this.assignmentReason!= null)&&this.assignmentReason.equals(rhs.assignmentReason))))&&((this.assignedOn == rhs.assignedOn)||((this.assignedOn!= null)&&this.assignedOn.equals(rhs.assignedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.acceptanceStatus == rhs.acceptanceStatus)||((this.acceptanceStatus!= null)&&this.acceptanceStatus.equals(rhs.acceptanceStatus))));
    }

}
