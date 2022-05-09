
package com.ellucian.generated.eedm.communication_activity_efforts.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Appeal Goals
 * <p>
 * The goals for efforts which are appeals.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fundRaising",
    "contributionCount",
    "donorCount"
})
@Generated("jsonschema2pojo")
public class AppealGoals {

    /**
     * Fund Raising
     * <p>
     * The desired amount of funds to be raised by the appeal.
     * 
     */
    @JsonProperty("fundRaising")
    @JsonPropertyDescription("The desired amount of funds to be raised by the appeal.")
    private Object fundRaising;
    /**
     * Contribution Count
     * <p>
     * The number of individual contributions that is desired for the appeal.
     * 
     */
    @JsonProperty("contributionCount")
    @JsonPropertyDescription("The number of individual contributions that is desired for the appeal.")
    private Object contributionCount;
    /**
     * Donor Count
     * <p>
     * The number of individual donors that is desired for the appeal.
     * 
     */
    @JsonProperty("donorCount")
    @JsonPropertyDescription("The number of individual donors that is desired for the appeal.")
    private Object donorCount;

    /**
     * Fund Raising
     * <p>
     * The desired amount of funds to be raised by the appeal.
     * 
     */
    @JsonProperty("fundRaising")
    public Object getFundRaising() {
        return fundRaising;
    }

    /**
     * Fund Raising
     * <p>
     * The desired amount of funds to be raised by the appeal.
     * 
     */
    @JsonProperty("fundRaising")
    public void setFundRaising(Object fundRaising) {
        this.fundRaising = fundRaising;
    }

    public AppealGoals withFundRaising(Object fundRaising) {
        this.fundRaising = fundRaising;
        return this;
    }

    /**
     * Contribution Count
     * <p>
     * The number of individual contributions that is desired for the appeal.
     * 
     */
    @JsonProperty("contributionCount")
    public Object getContributionCount() {
        return contributionCount;
    }

    /**
     * Contribution Count
     * <p>
     * The number of individual contributions that is desired for the appeal.
     * 
     */
    @JsonProperty("contributionCount")
    public void setContributionCount(Object contributionCount) {
        this.contributionCount = contributionCount;
    }

    public AppealGoals withContributionCount(Object contributionCount) {
        this.contributionCount = contributionCount;
        return this;
    }

    /**
     * Donor Count
     * <p>
     * The number of individual donors that is desired for the appeal.
     * 
     */
    @JsonProperty("donorCount")
    public Object getDonorCount() {
        return donorCount;
    }

    /**
     * Donor Count
     * <p>
     * The number of individual donors that is desired for the appeal.
     * 
     */
    @JsonProperty("donorCount")
    public void setDonorCount(Object donorCount) {
        this.donorCount = donorCount;
    }

    public AppealGoals withDonorCount(Object donorCount) {
        this.donorCount = donorCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppealGoals.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fundRaising");
        sb.append('=');
        sb.append(((this.fundRaising == null)?"<null>":this.fundRaising));
        sb.append(',');
        sb.append("contributionCount");
        sb.append('=');
        sb.append(((this.contributionCount == null)?"<null>":this.contributionCount));
        sb.append(',');
        sb.append("donorCount");
        sb.append('=');
        sb.append(((this.donorCount == null)?"<null>":this.donorCount));
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
        result = ((result* 31)+((this.fundRaising == null)? 0 :this.fundRaising.hashCode()));
        result = ((result* 31)+((this.contributionCount == null)? 0 :this.contributionCount.hashCode()));
        result = ((result* 31)+((this.donorCount == null)? 0 :this.donorCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppealGoals) == false) {
            return false;
        }
        AppealGoals rhs = ((AppealGoals) other);
        return ((((this.fundRaising == rhs.fundRaising)||((this.fundRaising!= null)&&this.fundRaising.equals(rhs.fundRaising)))&&((this.contributionCount == rhs.contributionCount)||((this.contributionCount!= null)&&this.contributionCount.equals(rhs.contributionCount))))&&((this.donorCount == rhs.donorCount)||((this.donorCount!= null)&&this.donorCount.equals(rhs.donorCount))));
    }

}
