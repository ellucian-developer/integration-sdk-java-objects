
package com.ellucian.generated.eedm.wealth_screening_requests.v6_0;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Wealth Screening Requests
 * <p>
 * Request for wealth screening information (integration model)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "requestedOn",
    "personName",
    "yearOfBirth",
    "yearOfGraduation",
    "contactDetails",
    "donationsSummary"
})
@Generated("jsonschema2pojo")
public class WealthScreeningRequests {

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
     * Id
     * <p>
     * The global identifier of the wealth screening request
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the wealth screening request")
    private String id;
    /**
     * Requested On
     * <p>
     * The date of the wealth screening request
     * (Required)
     * 
     */
    @JsonProperty("requestedOn")
    @JsonPropertyDescription("The date of the wealth screening request")
    private Date requestedOn;
    /**
     * Person Name
     * <p>
     * The person name
     * (Required)
     * 
     */
    @JsonProperty("personName")
    @JsonPropertyDescription("The person name")
    private PersonName personName;
    /**
     * Year Of Birth
     * <p>
     * Person's year of birth
     * 
     */
    @JsonProperty("yearOfBirth")
    @JsonPropertyDescription("Person's year of birth")
    private Object yearOfBirth;
    /**
     * Year Of Graduation
     * <p>
     * The person's graduation year
     * 
     */
    @JsonProperty("yearOfGraduation")
    @JsonPropertyDescription("The person's graduation year")
    private Object yearOfGraduation;
    /**
     * Contact Details
     * <p>
     * Contact information of the person
     * 
     */
    @JsonProperty("contactDetails")
    @JsonPropertyDescription("Contact information of the person")
    private ContactDetails contactDetails;
    /**
     * Donations Summary
     * <p>
     * The summary of the donations made by the person
     * 
     */
    @JsonProperty("donationsSummary")
    @JsonPropertyDescription("The summary of the donations made by the person")
    private DonationsSummary donationsSummary;

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

    public WealthScreeningRequests withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Id
     * <p>
     * The global identifier of the wealth screening request
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Id
     * <p>
     * The global identifier of the wealth screening request
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public WealthScreeningRequests withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Requested On
     * <p>
     * The date of the wealth screening request
     * (Required)
     * 
     */
    @JsonProperty("requestedOn")
    public Date getRequestedOn() {
        return requestedOn;
    }

    /**
     * Requested On
     * <p>
     * The date of the wealth screening request
     * (Required)
     * 
     */
    @JsonProperty("requestedOn")
    public void setRequestedOn(Date requestedOn) {
        this.requestedOn = requestedOn;
    }

    public WealthScreeningRequests withRequestedOn(Date requestedOn) {
        this.requestedOn = requestedOn;
        return this;
    }

    /**
     * Person Name
     * <p>
     * The person name
     * (Required)
     * 
     */
    @JsonProperty("personName")
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Person Name
     * <p>
     * The person name
     * (Required)
     * 
     */
    @JsonProperty("personName")
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public WealthScreeningRequests withPersonName(PersonName personName) {
        this.personName = personName;
        return this;
    }

    /**
     * Year Of Birth
     * <p>
     * Person's year of birth
     * 
     */
    @JsonProperty("yearOfBirth")
    public Object getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Year Of Birth
     * <p>
     * Person's year of birth
     * 
     */
    @JsonProperty("yearOfBirth")
    public void setYearOfBirth(Object yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public WealthScreeningRequests withYearOfBirth(Object yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        return this;
    }

    /**
     * Year Of Graduation
     * <p>
     * The person's graduation year
     * 
     */
    @JsonProperty("yearOfGraduation")
    public Object getYearOfGraduation() {
        return yearOfGraduation;
    }

    /**
     * Year Of Graduation
     * <p>
     * The person's graduation year
     * 
     */
    @JsonProperty("yearOfGraduation")
    public void setYearOfGraduation(Object yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public WealthScreeningRequests withYearOfGraduation(Object yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
        return this;
    }

    /**
     * Contact Details
     * <p>
     * Contact information of the person
     * 
     */
    @JsonProperty("contactDetails")
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Contact Details
     * <p>
     * Contact information of the person
     * 
     */
    @JsonProperty("contactDetails")
    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public WealthScreeningRequests withContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Donations Summary
     * <p>
     * The summary of the donations made by the person
     * 
     */
    @JsonProperty("donationsSummary")
    public DonationsSummary getDonationsSummary() {
        return donationsSummary;
    }

    /**
     * Donations Summary
     * <p>
     * The summary of the donations made by the person
     * 
     */
    @JsonProperty("donationsSummary")
    public void setDonationsSummary(DonationsSummary donationsSummary) {
        this.donationsSummary = donationsSummary;
    }

    public WealthScreeningRequests withDonationsSummary(DonationsSummary donationsSummary) {
        this.donationsSummary = donationsSummary;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WealthScreeningRequests.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requestedOn");
        sb.append('=');
        sb.append(((this.requestedOn == null)?"<null>":this.requestedOn));
        sb.append(',');
        sb.append("personName");
        sb.append('=');
        sb.append(((this.personName == null)?"<null>":this.personName));
        sb.append(',');
        sb.append("yearOfBirth");
        sb.append('=');
        sb.append(((this.yearOfBirth == null)?"<null>":this.yearOfBirth));
        sb.append(',');
        sb.append("yearOfGraduation");
        sb.append('=');
        sb.append(((this.yearOfGraduation == null)?"<null>":this.yearOfGraduation));
        sb.append(',');
        sb.append("contactDetails");
        sb.append('=');
        sb.append(((this.contactDetails == null)?"<null>":this.contactDetails));
        sb.append(',');
        sb.append("donationsSummary");
        sb.append('=');
        sb.append(((this.donationsSummary == null)?"<null>":this.donationsSummary));
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
        result = ((result* 31)+((this.personName == null)? 0 :this.personName.hashCode()));
        result = ((result* 31)+((this.yearOfGraduation == null)? 0 :this.yearOfGraduation.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.donationsSummary == null)? 0 :this.donationsSummary.hashCode()));
        result = ((result* 31)+((this.requestedOn == null)? 0 :this.requestedOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.contactDetails == null)? 0 :this.contactDetails.hashCode()));
        result = ((result* 31)+((this.yearOfBirth == null)? 0 :this.yearOfBirth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WealthScreeningRequests) == false) {
            return false;
        }
        WealthScreeningRequests rhs = ((WealthScreeningRequests) other);
        return (((((((((this.personName == rhs.personName)||((this.personName!= null)&&this.personName.equals(rhs.personName)))&&((this.yearOfGraduation == rhs.yearOfGraduation)||((this.yearOfGraduation!= null)&&this.yearOfGraduation.equals(rhs.yearOfGraduation))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.donationsSummary == rhs.donationsSummary)||((this.donationsSummary!= null)&&this.donationsSummary.equals(rhs.donationsSummary))))&&((this.requestedOn == rhs.requestedOn)||((this.requestedOn!= null)&&this.requestedOn.equals(rhs.requestedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.contactDetails == rhs.contactDetails)||((this.contactDetails!= null)&&this.contactDetails.equals(rhs.contactDetails))))&&((this.yearOfBirth == rhs.yearOfBirth)||((this.yearOfBirth!= null)&&this.yearOfBirth.equals(rhs.yearOfBirth))));
    }

}
