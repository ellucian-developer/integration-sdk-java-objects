
package com.ellucian.generated.eedm.wealth_screening_requests.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Donations Summary
 * <p>
 * The summary of the donations made by the person
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstDonation",
    "latestDonation",
    "largestDonation",
    "totalDonations"
})
@Generated("jsonschema2pojo")
public class DonationsSummary {

    /**
     * First Donation
     * <p>
     * The first donation details.
     * 
     */
    @JsonProperty("firstDonation")
    @JsonPropertyDescription("The first donation details.")
    private Object firstDonation;
    /**
     * Latest Donation
     * <p>
     * Details of most recent donation.
     * 
     */
    @JsonProperty("latestDonation")
    @JsonPropertyDescription("Details of most recent donation.")
    private Object latestDonation;
    /**
     * Largest Donation
     * <p>
     * Details of the largest donation amount.
     * 
     */
    @JsonProperty("largestDonation")
    @JsonPropertyDescription("Details of the largest donation amount.")
    private Object largestDonation;
    /**
     * Total Donations
     * <p>
     * The details of all donations.
     * 
     */
    @JsonProperty("totalDonations")
    @JsonPropertyDescription("The details of all donations.")
    private Object totalDonations;

    /**
     * First Donation
     * <p>
     * The first donation details.
     * 
     */
    @JsonProperty("firstDonation")
    public Object getFirstDonation() {
        return firstDonation;
    }

    /**
     * First Donation
     * <p>
     * The first donation details.
     * 
     */
    @JsonProperty("firstDonation")
    public void setFirstDonation(Object firstDonation) {
        this.firstDonation = firstDonation;
    }

    public DonationsSummary withFirstDonation(Object firstDonation) {
        this.firstDonation = firstDonation;
        return this;
    }

    /**
     * Latest Donation
     * <p>
     * Details of most recent donation.
     * 
     */
    @JsonProperty("latestDonation")
    public Object getLatestDonation() {
        return latestDonation;
    }

    /**
     * Latest Donation
     * <p>
     * Details of most recent donation.
     * 
     */
    @JsonProperty("latestDonation")
    public void setLatestDonation(Object latestDonation) {
        this.latestDonation = latestDonation;
    }

    public DonationsSummary withLatestDonation(Object latestDonation) {
        this.latestDonation = latestDonation;
        return this;
    }

    /**
     * Largest Donation
     * <p>
     * Details of the largest donation amount.
     * 
     */
    @JsonProperty("largestDonation")
    public Object getLargestDonation() {
        return largestDonation;
    }

    /**
     * Largest Donation
     * <p>
     * Details of the largest donation amount.
     * 
     */
    @JsonProperty("largestDonation")
    public void setLargestDonation(Object largestDonation) {
        this.largestDonation = largestDonation;
    }

    public DonationsSummary withLargestDonation(Object largestDonation) {
        this.largestDonation = largestDonation;
        return this;
    }

    /**
     * Total Donations
     * <p>
     * The details of all donations.
     * 
     */
    @JsonProperty("totalDonations")
    public Object getTotalDonations() {
        return totalDonations;
    }

    /**
     * Total Donations
     * <p>
     * The details of all donations.
     * 
     */
    @JsonProperty("totalDonations")
    public void setTotalDonations(Object totalDonations) {
        this.totalDonations = totalDonations;
    }

    public DonationsSummary withTotalDonations(Object totalDonations) {
        this.totalDonations = totalDonations;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DonationsSummary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstDonation");
        sb.append('=');
        sb.append(((this.firstDonation == null)?"<null>":this.firstDonation));
        sb.append(',');
        sb.append("latestDonation");
        sb.append('=');
        sb.append(((this.latestDonation == null)?"<null>":this.latestDonation));
        sb.append(',');
        sb.append("largestDonation");
        sb.append('=');
        sb.append(((this.largestDonation == null)?"<null>":this.largestDonation));
        sb.append(',');
        sb.append("totalDonations");
        sb.append('=');
        sb.append(((this.totalDonations == null)?"<null>":this.totalDonations));
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
        result = ((result* 31)+((this.largestDonation == null)? 0 :this.largestDonation.hashCode()));
        result = ((result* 31)+((this.totalDonations == null)? 0 :this.totalDonations.hashCode()));
        result = ((result* 31)+((this.firstDonation == null)? 0 :this.firstDonation.hashCode()));
        result = ((result* 31)+((this.latestDonation == null)? 0 :this.latestDonation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DonationsSummary) == false) {
            return false;
        }
        DonationsSummary rhs = ((DonationsSummary) other);
        return (((((this.largestDonation == rhs.largestDonation)||((this.largestDonation!= null)&&this.largestDonation.equals(rhs.largestDonation)))&&((this.totalDonations == rhs.totalDonations)||((this.totalDonations!= null)&&this.totalDonations.equals(rhs.totalDonations))))&&((this.firstDonation == rhs.firstDonation)||((this.firstDonation!= null)&&this.firstDonation.equals(rhs.firstDonation))))&&((this.latestDonation == rhs.latestDonation)||((this.latestDonation!= null)&&this.latestDonation.equals(rhs.latestDonation))));
    }

}
