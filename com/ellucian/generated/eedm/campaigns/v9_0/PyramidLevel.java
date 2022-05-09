
package com.ellucian.generated.eedm.campaigns.v9_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minimumContribution",
    "maximumContribution",
    "fundRaisingTarget",
    "contributionsTarget",
    "donorsTarget"
})
@Generated("jsonschema2pojo")
public class PyramidLevel {

    /**
     * Minimum Contribution
     * <p>
     * The minimum contribution amount for the level.
     * (Required)
     * 
     */
    @JsonProperty("minimumContribution")
    @JsonPropertyDescription("The minimum contribution amount for the level.")
    private MinimumContribution minimumContribution;
    /**
     * Maximum Contribution
     * <p>
     * The maximum contribution amount for the level.
     * 
     */
    @JsonProperty("maximumContribution")
    @JsonPropertyDescription("The maximum contribution amount for the level.")
    private Object maximumContribution;
    /**
     * Fund Raising Target
     * <p>
     * The anticipated/desired total amount of contributions that fall within the range of the level.
     * 
     */
    @JsonProperty("fundRaisingTarget")
    @JsonPropertyDescription("The anticipated/desired total amount of contributions that fall within the range of the level.")
    private Object fundRaisingTarget;
    /**
     * Contributions Target
     * <p>
     * The anticipated/desired number of contributions that fall within the range of the level.
     * 
     */
    @JsonProperty("contributionsTarget")
    @JsonPropertyDescription("The anticipated/desired number of contributions that fall within the range of the level.")
    private Object contributionsTarget;
    /**
     * Donors Target
     * <p>
     * The anticipated/desired number of donors who make contributions that fall within the range of the level.
     * 
     */
    @JsonProperty("donorsTarget")
    @JsonPropertyDescription("The anticipated/desired number of donors who make contributions that fall within the range of the level.")
    private Object donorsTarget;

    /**
     * Minimum Contribution
     * <p>
     * The minimum contribution amount for the level.
     * (Required)
     * 
     */
    @JsonProperty("minimumContribution")
    public MinimumContribution getMinimumContribution() {
        return minimumContribution;
    }

    /**
     * Minimum Contribution
     * <p>
     * The minimum contribution amount for the level.
     * (Required)
     * 
     */
    @JsonProperty("minimumContribution")
    public void setMinimumContribution(MinimumContribution minimumContribution) {
        this.minimumContribution = minimumContribution;
    }

    public PyramidLevel withMinimumContribution(MinimumContribution minimumContribution) {
        this.minimumContribution = minimumContribution;
        return this;
    }

    /**
     * Maximum Contribution
     * <p>
     * The maximum contribution amount for the level.
     * 
     */
    @JsonProperty("maximumContribution")
    public Object getMaximumContribution() {
        return maximumContribution;
    }

    /**
     * Maximum Contribution
     * <p>
     * The maximum contribution amount for the level.
     * 
     */
    @JsonProperty("maximumContribution")
    public void setMaximumContribution(Object maximumContribution) {
        this.maximumContribution = maximumContribution;
    }

    public PyramidLevel withMaximumContribution(Object maximumContribution) {
        this.maximumContribution = maximumContribution;
        return this;
    }

    /**
     * Fund Raising Target
     * <p>
     * The anticipated/desired total amount of contributions that fall within the range of the level.
     * 
     */
    @JsonProperty("fundRaisingTarget")
    public Object getFundRaisingTarget() {
        return fundRaisingTarget;
    }

    /**
     * Fund Raising Target
     * <p>
     * The anticipated/desired total amount of contributions that fall within the range of the level.
     * 
     */
    @JsonProperty("fundRaisingTarget")
    public void setFundRaisingTarget(Object fundRaisingTarget) {
        this.fundRaisingTarget = fundRaisingTarget;
    }

    public PyramidLevel withFundRaisingTarget(Object fundRaisingTarget) {
        this.fundRaisingTarget = fundRaisingTarget;
        return this;
    }

    /**
     * Contributions Target
     * <p>
     * The anticipated/desired number of contributions that fall within the range of the level.
     * 
     */
    @JsonProperty("contributionsTarget")
    public Object getContributionsTarget() {
        return contributionsTarget;
    }

    /**
     * Contributions Target
     * <p>
     * The anticipated/desired number of contributions that fall within the range of the level.
     * 
     */
    @JsonProperty("contributionsTarget")
    public void setContributionsTarget(Object contributionsTarget) {
        this.contributionsTarget = contributionsTarget;
    }

    public PyramidLevel withContributionsTarget(Object contributionsTarget) {
        this.contributionsTarget = contributionsTarget;
        return this;
    }

    /**
     * Donors Target
     * <p>
     * The anticipated/desired number of donors who make contributions that fall within the range of the level.
     * 
     */
    @JsonProperty("donorsTarget")
    public Object getDonorsTarget() {
        return donorsTarget;
    }

    /**
     * Donors Target
     * <p>
     * The anticipated/desired number of donors who make contributions that fall within the range of the level.
     * 
     */
    @JsonProperty("donorsTarget")
    public void setDonorsTarget(Object donorsTarget) {
        this.donorsTarget = donorsTarget;
    }

    public PyramidLevel withDonorsTarget(Object donorsTarget) {
        this.donorsTarget = donorsTarget;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PyramidLevel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("minimumContribution");
        sb.append('=');
        sb.append(((this.minimumContribution == null)?"<null>":this.minimumContribution));
        sb.append(',');
        sb.append("maximumContribution");
        sb.append('=');
        sb.append(((this.maximumContribution == null)?"<null>":this.maximumContribution));
        sb.append(',');
        sb.append("fundRaisingTarget");
        sb.append('=');
        sb.append(((this.fundRaisingTarget == null)?"<null>":this.fundRaisingTarget));
        sb.append(',');
        sb.append("contributionsTarget");
        sb.append('=');
        sb.append(((this.contributionsTarget == null)?"<null>":this.contributionsTarget));
        sb.append(',');
        sb.append("donorsTarget");
        sb.append('=');
        sb.append(((this.donorsTarget == null)?"<null>":this.donorsTarget));
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
        result = ((result* 31)+((this.maximumContribution == null)? 0 :this.maximumContribution.hashCode()));
        result = ((result* 31)+((this.donorsTarget == null)? 0 :this.donorsTarget.hashCode()));
        result = ((result* 31)+((this.minimumContribution == null)? 0 :this.minimumContribution.hashCode()));
        result = ((result* 31)+((this.contributionsTarget == null)? 0 :this.contributionsTarget.hashCode()));
        result = ((result* 31)+((this.fundRaisingTarget == null)? 0 :this.fundRaisingTarget.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PyramidLevel) == false) {
            return false;
        }
        PyramidLevel rhs = ((PyramidLevel) other);
        return ((((((this.maximumContribution == rhs.maximumContribution)||((this.maximumContribution!= null)&&this.maximumContribution.equals(rhs.maximumContribution)))&&((this.donorsTarget == rhs.donorsTarget)||((this.donorsTarget!= null)&&this.donorsTarget.equals(rhs.donorsTarget))))&&((this.minimumContribution == rhs.minimumContribution)||((this.minimumContribution!= null)&&this.minimumContribution.equals(rhs.minimumContribution))))&&((this.contributionsTarget == rhs.contributionsTarget)||((this.contributionsTarget!= null)&&this.contributionsTarget.equals(rhs.contributionsTarget))))&&((this.fundRaisingTarget == rhs.fundRaisingTarget)||((this.fundRaisingTarget!= null)&&this.fundRaisingTarget.equals(rhs.fundRaisingTarget))));
    }

}
