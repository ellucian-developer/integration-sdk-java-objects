
package com.ellucian.generated.eedm.wealth_screening_reports.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Metrics
 * <p>
 * Wealth screening metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "propensityToGiveScore1",
    "propensityToGiveScore2",
    "propensityToGiveRating",
    "assetRange",
    "assetRating",
    "netWorthRange",
    "netWorthRating",
    "liquidityRange",
    "liquidityRating",
    "estimatedAnnualDonationsRange",
    "estimatedAnnualDonationsRating",
    "inclinationGiving",
    "inclinationAffiliation",
    "givingCapacityRange",
    "givingCapacityRating",
    "bequestRating",
    "annuityRating",
    "trustRating",
    "influenceRating",
    "incomeRange",
    "incomeRating",
    "realEstateValueRange",
    "realEstateValueRating",
    "realEstateCount",
    "directStockRange",
    "directStockRating",
    "totalStockRange",
    "totalStockRating",
    "totalDonationsRange",
    "totalDonationsRating",
    "charitableDonationsRange",
    "charitableDonationsRating",
    "politicalDonationsRange",
    "politicalDonationsRating",
    "assetOwnership",
    "boardMembership",
    "companyValueRange",
    "companyValueRating",
    "salesVolumeRange",
    "salesVolumeRating",
    "pensionsRange",
    "pensionsRating",
    "givingCapacityIncomeRange",
    "givingCapacityIncomeRating",
    "givingCapacityRealEstateRange",
    "givingCapacityRealEstateRating",
    "givingCapacityStocksRange",
    "givingCapacityStocksRating",
    "givingCapacityPensionsRange",
    "givingCapacityPensionsRating",
    "givingCapacityGivingRange",
    "givingCapacityGivingRating",
    "givingCapacityAge",
    "qualityOfMatch"
})
@Generated("jsonschema2pojo")
public class Metrics {

    /**
     * Propensity To Give Score 1
     * <p>
     * The first component of the propensity to give score
     * 
     */
    @JsonProperty("propensityToGiveScore1")
    @JsonPropertyDescription("The first component of the propensity to give score")
    private Object propensityToGiveScore1;
    /**
     * Propensity To Give Score 2
     * <p>
     * The second component of the propensity to give score
     * 
     */
    @JsonProperty("propensityToGiveScore2")
    @JsonPropertyDescription("The second component of the propensity to give score")
    private Object propensityToGiveScore2;
    /**
     * Propensity To Give Rating
     * <p>
     * The rating associated with the propensity to give score
     * 
     */
    @JsonProperty("propensityToGiveRating")
    @JsonPropertyDescription("The rating associated with the propensity to give score")
    private String propensityToGiveRating;
    /**
     * Asset Range
     * <p>
     * The total value of all assets held by a household
     * 
     */
    @JsonProperty("assetRange")
    @JsonPropertyDescription("The total value of all assets held by a household")
    private String assetRange;
    /**
     * Asset Rating
     * <p>
     * The corresponding rating for the total assets range
     * 
     */
    @JsonProperty("assetRating")
    @JsonPropertyDescription("The corresponding rating for the total assets range")
    private String assetRating;
    /**
     * Net Worth Range
     * <p>
     * The difference between total assets and total debt for a household
     * 
     */
    @JsonProperty("netWorthRange")
    @JsonPropertyDescription("The difference between total assets and total debt for a household")
    private String netWorthRange;
    /**
     * Net Worth Rating
     * <p>
     * Corresponding rating for the net worth range
     * 
     */
    @JsonProperty("netWorthRating")
    @JsonPropertyDescription("Corresponding rating for the net worth range")
    private String netWorthRating;
    /**
     * Liquidity Range
     * <p>
     * The measure of financial assets readily available
     * 
     */
    @JsonProperty("liquidityRange")
    @JsonPropertyDescription("The measure of financial assets readily available")
    private String liquidityRange;
    /**
     * Liquidity Rating
     * <p>
     * The corresponding rating for the liquidity range
     * 
     */
    @JsonProperty("liquidityRating")
    @JsonPropertyDescription("The corresponding rating for the liquidity range")
    private String liquidityRating;
    /**
     * Estimated Annual Donations Range
     * <p>
     * The measure of money the person gives annually to all nonprofits
     * 
     */
    @JsonProperty("estimatedAnnualDonationsRange")
    @JsonPropertyDescription("The measure of money the person gives annually to all nonprofits")
    private String estimatedAnnualDonationsRange;
    /**
     * Estimated Annual Donations Rating
     * <p>
     * The corresponding rating for estimated annual donations range
     * 
     */
    @JsonProperty("estimatedAnnualDonationsRating")
    @JsonPropertyDescription("The corresponding rating for estimated annual donations range")
    private String estimatedAnnualDonationsRating;
    /**
     * Inclination Giving
     * <p>
     * The measure of philanthropic intent based on client supplied giving information
     * 
     */
    @JsonProperty("inclinationGiving")
    @JsonPropertyDescription("The measure of philanthropic intent based on client supplied giving information")
    private String inclinationGiving;
    /**
     * Inclination Affiliation
     * <p>
     * The measure of philanthropic intent based on affiliations and political giving
     * 
     */
    @JsonProperty("inclinationAffiliation")
    @JsonPropertyDescription("The measure of philanthropic intent based on affiliations and political giving")
    private String inclinationAffiliation;
    /**
     * Giving Capacity Range
     * <p>
     * The amount the prospect can afford to give to all nonprofits over a 5-year period
     * 
     */
    @JsonProperty("givingCapacityRange")
    @JsonPropertyDescription("The amount the prospect can afford to give to all nonprofits over a 5-year period")
    private String givingCapacityRange;
    /**
     * Giving Capacity Rating
     * <p>
     * The corresponding rating for the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityRating")
    @JsonPropertyDescription("The corresponding rating for the giving capacity range")
    private String givingCapacityRating;
    /**
     * Bequest Rating
     * <p>
     * The rating indicating is the person is a good candidate for bequest giving
     * 
     */
    @JsonProperty("bequestRating")
    @JsonPropertyDescription("The rating indicating is the person is a good candidate for bequest giving")
    private String bequestRating;
    /**
     * Annuity Rating
     * <p>
     * The rating indicating is the person is a good candidate for annuity giving
     * 
     */
    @JsonProperty("annuityRating")
    @JsonPropertyDescription("The rating indicating is the person is a good candidate for annuity giving")
    private String annuityRating;
    /**
     * Trust Rating
     * <p>
     * The rating indicating is the person is a good candidate for trust giving
     * 
     */
    @JsonProperty("trustRating")
    @JsonPropertyDescription("The rating indicating is the person is a good candidate for trust giving")
    private String trustRating;
    /**
     * Influence Rating
     * <p>
     * Prospect's influence in their community based upon current board membership
     * 
     */
    @JsonProperty("influenceRating")
    @JsonPropertyDescription("Prospect's influence in their community based upon current board membership")
    private String influenceRating;
    /**
     * Income Range
     * <p>
     * The total income range
     * 
     */
    @JsonProperty("incomeRange")
    @JsonPropertyDescription("The total income range")
    private String incomeRange;
    /**
     * Income Rating
     * <p>
     * The corresponding rating for the income range
     * 
     */
    @JsonProperty("incomeRating")
    @JsonPropertyDescription("The corresponding rating for the income range")
    private String incomeRating;
    /**
     * Real Estate Value Range
     * <p>
     * The total real estate value range
     * 
     */
    @JsonProperty("realEstateValueRange")
    @JsonPropertyDescription("The total real estate value range")
    private String realEstateValueRange;
    /**
     * Real Estate Value Rating
     * <p>
     * The corresponding rating for the real estate value range
     * 
     */
    @JsonProperty("realEstateValueRating")
    @JsonPropertyDescription("The corresponding rating for the real estate value range")
    private String realEstateValueRating;
    /**
     * Real Estate Count
     * <p>
     * The total real estate property count
     * 
     */
    @JsonProperty("realEstateCount")
    @JsonPropertyDescription("The total real estate property count")
    private Object realEstateCount;
    /**
     * Direct Stock Range
     * <p>
     * The total direct stock holdings range
     * 
     */
    @JsonProperty("directStockRange")
    @JsonPropertyDescription("The total direct stock holdings range")
    private String directStockRange;
    /**
     * Direct Stock Rating
     * <p>
     * The corresponding rating for the direct stock range
     * 
     */
    @JsonProperty("directStockRating")
    @JsonPropertyDescription("The corresponding rating for the direct stock range")
    private String directStockRating;
    /**
     * Total Stock Range
     * <p>
     * The total stock value range
     * 
     */
    @JsonProperty("totalStockRange")
    @JsonPropertyDescription("The total stock value range")
    private String totalStockRange;
    /**
     * Total Stock Rating
     * <p>
     * The corresponding rating for total stock value range
     * 
     */
    @JsonProperty("totalStockRating")
    @JsonPropertyDescription("The corresponding rating for total stock value range")
    private String totalStockRating;
    /**
     * Total Donations Range
     * <p>
     * The total donations range
     * 
     */
    @JsonProperty("totalDonationsRange")
    @JsonPropertyDescription("The total donations range")
    private String totalDonationsRange;
    /**
     * Total Donations Rating
     * <p>
     * The corresponding rating for the total donations range
     * 
     */
    @JsonProperty("totalDonationsRating")
    @JsonPropertyDescription("The corresponding rating for the total donations range")
    private String totalDonationsRating;
    /**
     * Charitable Donations Range
     * <p>
     * The range of the total charitable donations amount
     * 
     */
    @JsonProperty("charitableDonationsRange")
    @JsonPropertyDescription("The range of the total charitable donations amount")
    private String charitableDonationsRange;
    /**
     * Charitable Donations Rating
     * <p>
     * The corresponding rating for the charitable donations range
     * 
     */
    @JsonProperty("charitableDonationsRating")
    @JsonPropertyDescription("The corresponding rating for the charitable donations range")
    private String charitableDonationsRating;
    /**
     * Political Donations Range
     * <p>
     * The total political donations amount range
     * 
     */
    @JsonProperty("politicalDonationsRange")
    @JsonPropertyDescription("The total political donations amount range")
    private String politicalDonationsRange;
    /**
     * Political Donations Rating
     * <p>
     * The corresponding rating for the political donations range
     * 
     */
    @JsonProperty("politicalDonationsRating")
    @JsonPropertyDescription("The corresponding rating for the political donations range")
    private String politicalDonationsRating;
    /**
     * Asset Ownership
     * <p>
     * Ownership of specific assets
     * 
     */
    @JsonProperty("assetOwnership")
    @JsonPropertyDescription("Ownership of specific assets")
    private List<AssetOwnership> assetOwnership = new ArrayList<AssetOwnership>();
    /**
     * Board Membership
     * <p>
     * Board membership
     * 
     */
    @JsonProperty("boardMembership")
    @JsonPropertyDescription("Board membership")
    private Object boardMembership;
    /**
     * Company Value Range
     * <p>
     * The D&B company value range
     * 
     */
    @JsonProperty("companyValueRange")
    @JsonPropertyDescription("The D&B company value range")
    private String companyValueRange;
    /**
     * Company Value Rating
     * <p>
     * The corresponding rating for the D&B company range value
     * 
     */
    @JsonProperty("companyValueRating")
    @JsonPropertyDescription("The corresponding rating for the D&B company range value")
    private String companyValueRating;
    /**
     * Sales Volume Range
     * <p>
     * The business sales volume range
     * 
     */
    @JsonProperty("salesVolumeRange")
    @JsonPropertyDescription("The business sales volume range")
    private String salesVolumeRange;
    /**
     * Sales Volume Rating
     * <p>
     * The corresponding rating for the business sales volume range
     * 
     */
    @JsonProperty("salesVolumeRating")
    @JsonPropertyDescription("The corresponding rating for the business sales volume range")
    private String salesVolumeRating;
    /**
     * Pensions Range
     * <p>
     * The held pensions range
     * 
     */
    @JsonProperty("pensionsRange")
    @JsonPropertyDescription("The held pensions range")
    private String pensionsRange;
    /**
     * Pensions Rating
     * <p>
     * The orresponding rating for the pensions range
     * 
     */
    @JsonProperty("pensionsRating")
    @JsonPropertyDescription("The orresponding rating for the pensions range")
    private String pensionsRating;
    /**
     * Giving Capacity Income Range
     * <p>
     * The portion of income used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityIncomeRange")
    @JsonPropertyDescription("The portion of income used in calculating the giving capacity range")
    private String givingCapacityIncomeRange;
    /**
     * Giving Capacity Income Rating
     * <p>
     * The corresponding rating for giving capacity income range
     * 
     */
    @JsonProperty("givingCapacityIncomeRating")
    @JsonPropertyDescription("The corresponding rating for giving capacity income range")
    private String givingCapacityIncomeRating;
    /**
     * Giving Capacity Real Estate Range
     * <p>
     * The portion of real estate used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityRealEstateRange")
    @JsonPropertyDescription("The portion of real estate used in calculating the giving capacity range")
    private String givingCapacityRealEstateRange;
    /**
     * Giving Capacity Real Estate Rating
     * <p>
     * The corresponding rating for the giving capacity real estate range
     * 
     */
    @JsonProperty("givingCapacityRealEstateRating")
    @JsonPropertyDescription("The corresponding rating for the giving capacity real estate range")
    private String givingCapacityRealEstateRating;
    /**
     * Giving Capacity Stocks Range
     * <p>
     * The portion of stock value used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityStocksRange")
    @JsonPropertyDescription("The portion of stock value used in calculating the giving capacity range")
    private String givingCapacityStocksRange;
    /**
     * Giving Capacity Stocks Rating
     * <p>
     * The corresponding rating for the giving capacity stocks range
     * 
     */
    @JsonProperty("givingCapacityStocksRating")
    @JsonPropertyDescription("The corresponding rating for the giving capacity stocks range")
    private String givingCapacityStocksRating;
    /**
     * Giving Capacity Pensions Range
     * <p>
     * The portion of the pensions used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityPensionsRange")
    @JsonPropertyDescription("The portion of the pensions used in calculating the giving capacity range")
    private String givingCapacityPensionsRange;
    /**
     * Giving Capacity Pensions Rating
     * <p>
     * The corresponding rating for giving capacity pensions range
     * 
     */
    @JsonProperty("givingCapacityPensionsRating")
    @JsonPropertyDescription("The corresponding rating for giving capacity pensions range")
    private String givingCapacityPensionsRating;
    /**
     * Giving Capacity Giving Range
     * <p>
     * The portion of donations used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityGivingRange")
    @JsonPropertyDescription("The portion of donations used in calculating the giving capacity range")
    private String givingCapacityGivingRange;
    /**
     * Giving Capacity Giving Rating
     * <p>
     * The corresponding rating for the giving capacity giving range
     * 
     */
    @JsonProperty("givingCapacityGivingRating")
    @JsonPropertyDescription("The corresponding rating for the giving capacity giving range")
    private String givingCapacityGivingRating;
    /**
     * Giving Capacity Age
     * <p>
     * The age used as the input for the giving capacity rating
     * 
     */
    @JsonProperty("givingCapacityAge")
    @JsonPropertyDescription("The age used as the input for the giving capacity rating")
    private Object givingCapacityAge;
    /**
     * Quality Of Match
     * <p>
     * Quality of match metrics
     * 
     */
    @JsonProperty("qualityOfMatch")
    @JsonPropertyDescription("Quality of match metrics")
    private QualityOfMatch qualityOfMatch;

    /**
     * Propensity To Give Score 1
     * <p>
     * The first component of the propensity to give score
     * 
     */
    @JsonProperty("propensityToGiveScore1")
    public Object getPropensityToGiveScore1() {
        return propensityToGiveScore1;
    }

    /**
     * Propensity To Give Score 1
     * <p>
     * The first component of the propensity to give score
     * 
     */
    @JsonProperty("propensityToGiveScore1")
    public void setPropensityToGiveScore1(Object propensityToGiveScore1) {
        this.propensityToGiveScore1 = propensityToGiveScore1;
    }

    public Metrics withPropensityToGiveScore1(Object propensityToGiveScore1) {
        this.propensityToGiveScore1 = propensityToGiveScore1;
        return this;
    }

    /**
     * Propensity To Give Score 2
     * <p>
     * The second component of the propensity to give score
     * 
     */
    @JsonProperty("propensityToGiveScore2")
    public Object getPropensityToGiveScore2() {
        return propensityToGiveScore2;
    }

    /**
     * Propensity To Give Score 2
     * <p>
     * The second component of the propensity to give score
     * 
     */
    @JsonProperty("propensityToGiveScore2")
    public void setPropensityToGiveScore2(Object propensityToGiveScore2) {
        this.propensityToGiveScore2 = propensityToGiveScore2;
    }

    public Metrics withPropensityToGiveScore2(Object propensityToGiveScore2) {
        this.propensityToGiveScore2 = propensityToGiveScore2;
        return this;
    }

    /**
     * Propensity To Give Rating
     * <p>
     * The rating associated with the propensity to give score
     * 
     */
    @JsonProperty("propensityToGiveRating")
    public String getPropensityToGiveRating() {
        return propensityToGiveRating;
    }

    /**
     * Propensity To Give Rating
     * <p>
     * The rating associated with the propensity to give score
     * 
     */
    @JsonProperty("propensityToGiveRating")
    public void setPropensityToGiveRating(String propensityToGiveRating) {
        this.propensityToGiveRating = propensityToGiveRating;
    }

    public Metrics withPropensityToGiveRating(String propensityToGiveRating) {
        this.propensityToGiveRating = propensityToGiveRating;
        return this;
    }

    /**
     * Asset Range
     * <p>
     * The total value of all assets held by a household
     * 
     */
    @JsonProperty("assetRange")
    public String getAssetRange() {
        return assetRange;
    }

    /**
     * Asset Range
     * <p>
     * The total value of all assets held by a household
     * 
     */
    @JsonProperty("assetRange")
    public void setAssetRange(String assetRange) {
        this.assetRange = assetRange;
    }

    public Metrics withAssetRange(String assetRange) {
        this.assetRange = assetRange;
        return this;
    }

    /**
     * Asset Rating
     * <p>
     * The corresponding rating for the total assets range
     * 
     */
    @JsonProperty("assetRating")
    public String getAssetRating() {
        return assetRating;
    }

    /**
     * Asset Rating
     * <p>
     * The corresponding rating for the total assets range
     * 
     */
    @JsonProperty("assetRating")
    public void setAssetRating(String assetRating) {
        this.assetRating = assetRating;
    }

    public Metrics withAssetRating(String assetRating) {
        this.assetRating = assetRating;
        return this;
    }

    /**
     * Net Worth Range
     * <p>
     * The difference between total assets and total debt for a household
     * 
     */
    @JsonProperty("netWorthRange")
    public String getNetWorthRange() {
        return netWorthRange;
    }

    /**
     * Net Worth Range
     * <p>
     * The difference between total assets and total debt for a household
     * 
     */
    @JsonProperty("netWorthRange")
    public void setNetWorthRange(String netWorthRange) {
        this.netWorthRange = netWorthRange;
    }

    public Metrics withNetWorthRange(String netWorthRange) {
        this.netWorthRange = netWorthRange;
        return this;
    }

    /**
     * Net Worth Rating
     * <p>
     * Corresponding rating for the net worth range
     * 
     */
    @JsonProperty("netWorthRating")
    public String getNetWorthRating() {
        return netWorthRating;
    }

    /**
     * Net Worth Rating
     * <p>
     * Corresponding rating for the net worth range
     * 
     */
    @JsonProperty("netWorthRating")
    public void setNetWorthRating(String netWorthRating) {
        this.netWorthRating = netWorthRating;
    }

    public Metrics withNetWorthRating(String netWorthRating) {
        this.netWorthRating = netWorthRating;
        return this;
    }

    /**
     * Liquidity Range
     * <p>
     * The measure of financial assets readily available
     * 
     */
    @JsonProperty("liquidityRange")
    public String getLiquidityRange() {
        return liquidityRange;
    }

    /**
     * Liquidity Range
     * <p>
     * The measure of financial assets readily available
     * 
     */
    @JsonProperty("liquidityRange")
    public void setLiquidityRange(String liquidityRange) {
        this.liquidityRange = liquidityRange;
    }

    public Metrics withLiquidityRange(String liquidityRange) {
        this.liquidityRange = liquidityRange;
        return this;
    }

    /**
     * Liquidity Rating
     * <p>
     * The corresponding rating for the liquidity range
     * 
     */
    @JsonProperty("liquidityRating")
    public String getLiquidityRating() {
        return liquidityRating;
    }

    /**
     * Liquidity Rating
     * <p>
     * The corresponding rating for the liquidity range
     * 
     */
    @JsonProperty("liquidityRating")
    public void setLiquidityRating(String liquidityRating) {
        this.liquidityRating = liquidityRating;
    }

    public Metrics withLiquidityRating(String liquidityRating) {
        this.liquidityRating = liquidityRating;
        return this;
    }

    /**
     * Estimated Annual Donations Range
     * <p>
     * The measure of money the person gives annually to all nonprofits
     * 
     */
    @JsonProperty("estimatedAnnualDonationsRange")
    public String getEstimatedAnnualDonationsRange() {
        return estimatedAnnualDonationsRange;
    }

    /**
     * Estimated Annual Donations Range
     * <p>
     * The measure of money the person gives annually to all nonprofits
     * 
     */
    @JsonProperty("estimatedAnnualDonationsRange")
    public void setEstimatedAnnualDonationsRange(String estimatedAnnualDonationsRange) {
        this.estimatedAnnualDonationsRange = estimatedAnnualDonationsRange;
    }

    public Metrics withEstimatedAnnualDonationsRange(String estimatedAnnualDonationsRange) {
        this.estimatedAnnualDonationsRange = estimatedAnnualDonationsRange;
        return this;
    }

    /**
     * Estimated Annual Donations Rating
     * <p>
     * The corresponding rating for estimated annual donations range
     * 
     */
    @JsonProperty("estimatedAnnualDonationsRating")
    public String getEstimatedAnnualDonationsRating() {
        return estimatedAnnualDonationsRating;
    }

    /**
     * Estimated Annual Donations Rating
     * <p>
     * The corresponding rating for estimated annual donations range
     * 
     */
    @JsonProperty("estimatedAnnualDonationsRating")
    public void setEstimatedAnnualDonationsRating(String estimatedAnnualDonationsRating) {
        this.estimatedAnnualDonationsRating = estimatedAnnualDonationsRating;
    }

    public Metrics withEstimatedAnnualDonationsRating(String estimatedAnnualDonationsRating) {
        this.estimatedAnnualDonationsRating = estimatedAnnualDonationsRating;
        return this;
    }

    /**
     * Inclination Giving
     * <p>
     * The measure of philanthropic intent based on client supplied giving information
     * 
     */
    @JsonProperty("inclinationGiving")
    public String getInclinationGiving() {
        return inclinationGiving;
    }

    /**
     * Inclination Giving
     * <p>
     * The measure of philanthropic intent based on client supplied giving information
     * 
     */
    @JsonProperty("inclinationGiving")
    public void setInclinationGiving(String inclinationGiving) {
        this.inclinationGiving = inclinationGiving;
    }

    public Metrics withInclinationGiving(String inclinationGiving) {
        this.inclinationGiving = inclinationGiving;
        return this;
    }

    /**
     * Inclination Affiliation
     * <p>
     * The measure of philanthropic intent based on affiliations and political giving
     * 
     */
    @JsonProperty("inclinationAffiliation")
    public String getInclinationAffiliation() {
        return inclinationAffiliation;
    }

    /**
     * Inclination Affiliation
     * <p>
     * The measure of philanthropic intent based on affiliations and political giving
     * 
     */
    @JsonProperty("inclinationAffiliation")
    public void setInclinationAffiliation(String inclinationAffiliation) {
        this.inclinationAffiliation = inclinationAffiliation;
    }

    public Metrics withInclinationAffiliation(String inclinationAffiliation) {
        this.inclinationAffiliation = inclinationAffiliation;
        return this;
    }

    /**
     * Giving Capacity Range
     * <p>
     * The amount the prospect can afford to give to all nonprofits over a 5-year period
     * 
     */
    @JsonProperty("givingCapacityRange")
    public String getGivingCapacityRange() {
        return givingCapacityRange;
    }

    /**
     * Giving Capacity Range
     * <p>
     * The amount the prospect can afford to give to all nonprofits over a 5-year period
     * 
     */
    @JsonProperty("givingCapacityRange")
    public void setGivingCapacityRange(String givingCapacityRange) {
        this.givingCapacityRange = givingCapacityRange;
    }

    public Metrics withGivingCapacityRange(String givingCapacityRange) {
        this.givingCapacityRange = givingCapacityRange;
        return this;
    }

    /**
     * Giving Capacity Rating
     * <p>
     * The corresponding rating for the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityRating")
    public String getGivingCapacityRating() {
        return givingCapacityRating;
    }

    /**
     * Giving Capacity Rating
     * <p>
     * The corresponding rating for the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityRating")
    public void setGivingCapacityRating(String givingCapacityRating) {
        this.givingCapacityRating = givingCapacityRating;
    }

    public Metrics withGivingCapacityRating(String givingCapacityRating) {
        this.givingCapacityRating = givingCapacityRating;
        return this;
    }

    /**
     * Bequest Rating
     * <p>
     * The rating indicating is the person is a good candidate for bequest giving
     * 
     */
    @JsonProperty("bequestRating")
    public String getBequestRating() {
        return bequestRating;
    }

    /**
     * Bequest Rating
     * <p>
     * The rating indicating is the person is a good candidate for bequest giving
     * 
     */
    @JsonProperty("bequestRating")
    public void setBequestRating(String bequestRating) {
        this.bequestRating = bequestRating;
    }

    public Metrics withBequestRating(String bequestRating) {
        this.bequestRating = bequestRating;
        return this;
    }

    /**
     * Annuity Rating
     * <p>
     * The rating indicating is the person is a good candidate for annuity giving
     * 
     */
    @JsonProperty("annuityRating")
    public String getAnnuityRating() {
        return annuityRating;
    }

    /**
     * Annuity Rating
     * <p>
     * The rating indicating is the person is a good candidate for annuity giving
     * 
     */
    @JsonProperty("annuityRating")
    public void setAnnuityRating(String annuityRating) {
        this.annuityRating = annuityRating;
    }

    public Metrics withAnnuityRating(String annuityRating) {
        this.annuityRating = annuityRating;
        return this;
    }

    /**
     * Trust Rating
     * <p>
     * The rating indicating is the person is a good candidate for trust giving
     * 
     */
    @JsonProperty("trustRating")
    public String getTrustRating() {
        return trustRating;
    }

    /**
     * Trust Rating
     * <p>
     * The rating indicating is the person is a good candidate for trust giving
     * 
     */
    @JsonProperty("trustRating")
    public void setTrustRating(String trustRating) {
        this.trustRating = trustRating;
    }

    public Metrics withTrustRating(String trustRating) {
        this.trustRating = trustRating;
        return this;
    }

    /**
     * Influence Rating
     * <p>
     * Prospect's influence in their community based upon current board membership
     * 
     */
    @JsonProperty("influenceRating")
    public String getInfluenceRating() {
        return influenceRating;
    }

    /**
     * Influence Rating
     * <p>
     * Prospect's influence in their community based upon current board membership
     * 
     */
    @JsonProperty("influenceRating")
    public void setInfluenceRating(String influenceRating) {
        this.influenceRating = influenceRating;
    }

    public Metrics withInfluenceRating(String influenceRating) {
        this.influenceRating = influenceRating;
        return this;
    }

    /**
     * Income Range
     * <p>
     * The total income range
     * 
     */
    @JsonProperty("incomeRange")
    public String getIncomeRange() {
        return incomeRange;
    }

    /**
     * Income Range
     * <p>
     * The total income range
     * 
     */
    @JsonProperty("incomeRange")
    public void setIncomeRange(String incomeRange) {
        this.incomeRange = incomeRange;
    }

    public Metrics withIncomeRange(String incomeRange) {
        this.incomeRange = incomeRange;
        return this;
    }

    /**
     * Income Rating
     * <p>
     * The corresponding rating for the income range
     * 
     */
    @JsonProperty("incomeRating")
    public String getIncomeRating() {
        return incomeRating;
    }

    /**
     * Income Rating
     * <p>
     * The corresponding rating for the income range
     * 
     */
    @JsonProperty("incomeRating")
    public void setIncomeRating(String incomeRating) {
        this.incomeRating = incomeRating;
    }

    public Metrics withIncomeRating(String incomeRating) {
        this.incomeRating = incomeRating;
        return this;
    }

    /**
     * Real Estate Value Range
     * <p>
     * The total real estate value range
     * 
     */
    @JsonProperty("realEstateValueRange")
    public String getRealEstateValueRange() {
        return realEstateValueRange;
    }

    /**
     * Real Estate Value Range
     * <p>
     * The total real estate value range
     * 
     */
    @JsonProperty("realEstateValueRange")
    public void setRealEstateValueRange(String realEstateValueRange) {
        this.realEstateValueRange = realEstateValueRange;
    }

    public Metrics withRealEstateValueRange(String realEstateValueRange) {
        this.realEstateValueRange = realEstateValueRange;
        return this;
    }

    /**
     * Real Estate Value Rating
     * <p>
     * The corresponding rating for the real estate value range
     * 
     */
    @JsonProperty("realEstateValueRating")
    public String getRealEstateValueRating() {
        return realEstateValueRating;
    }

    /**
     * Real Estate Value Rating
     * <p>
     * The corresponding rating for the real estate value range
     * 
     */
    @JsonProperty("realEstateValueRating")
    public void setRealEstateValueRating(String realEstateValueRating) {
        this.realEstateValueRating = realEstateValueRating;
    }

    public Metrics withRealEstateValueRating(String realEstateValueRating) {
        this.realEstateValueRating = realEstateValueRating;
        return this;
    }

    /**
     * Real Estate Count
     * <p>
     * The total real estate property count
     * 
     */
    @JsonProperty("realEstateCount")
    public Object getRealEstateCount() {
        return realEstateCount;
    }

    /**
     * Real Estate Count
     * <p>
     * The total real estate property count
     * 
     */
    @JsonProperty("realEstateCount")
    public void setRealEstateCount(Object realEstateCount) {
        this.realEstateCount = realEstateCount;
    }

    public Metrics withRealEstateCount(Object realEstateCount) {
        this.realEstateCount = realEstateCount;
        return this;
    }

    /**
     * Direct Stock Range
     * <p>
     * The total direct stock holdings range
     * 
     */
    @JsonProperty("directStockRange")
    public String getDirectStockRange() {
        return directStockRange;
    }

    /**
     * Direct Stock Range
     * <p>
     * The total direct stock holdings range
     * 
     */
    @JsonProperty("directStockRange")
    public void setDirectStockRange(String directStockRange) {
        this.directStockRange = directStockRange;
    }

    public Metrics withDirectStockRange(String directStockRange) {
        this.directStockRange = directStockRange;
        return this;
    }

    /**
     * Direct Stock Rating
     * <p>
     * The corresponding rating for the direct stock range
     * 
     */
    @JsonProperty("directStockRating")
    public String getDirectStockRating() {
        return directStockRating;
    }

    /**
     * Direct Stock Rating
     * <p>
     * The corresponding rating for the direct stock range
     * 
     */
    @JsonProperty("directStockRating")
    public void setDirectStockRating(String directStockRating) {
        this.directStockRating = directStockRating;
    }

    public Metrics withDirectStockRating(String directStockRating) {
        this.directStockRating = directStockRating;
        return this;
    }

    /**
     * Total Stock Range
     * <p>
     * The total stock value range
     * 
     */
    @JsonProperty("totalStockRange")
    public String getTotalStockRange() {
        return totalStockRange;
    }

    /**
     * Total Stock Range
     * <p>
     * The total stock value range
     * 
     */
    @JsonProperty("totalStockRange")
    public void setTotalStockRange(String totalStockRange) {
        this.totalStockRange = totalStockRange;
    }

    public Metrics withTotalStockRange(String totalStockRange) {
        this.totalStockRange = totalStockRange;
        return this;
    }

    /**
     * Total Stock Rating
     * <p>
     * The corresponding rating for total stock value range
     * 
     */
    @JsonProperty("totalStockRating")
    public String getTotalStockRating() {
        return totalStockRating;
    }

    /**
     * Total Stock Rating
     * <p>
     * The corresponding rating for total stock value range
     * 
     */
    @JsonProperty("totalStockRating")
    public void setTotalStockRating(String totalStockRating) {
        this.totalStockRating = totalStockRating;
    }

    public Metrics withTotalStockRating(String totalStockRating) {
        this.totalStockRating = totalStockRating;
        return this;
    }

    /**
     * Total Donations Range
     * <p>
     * The total donations range
     * 
     */
    @JsonProperty("totalDonationsRange")
    public String getTotalDonationsRange() {
        return totalDonationsRange;
    }

    /**
     * Total Donations Range
     * <p>
     * The total donations range
     * 
     */
    @JsonProperty("totalDonationsRange")
    public void setTotalDonationsRange(String totalDonationsRange) {
        this.totalDonationsRange = totalDonationsRange;
    }

    public Metrics withTotalDonationsRange(String totalDonationsRange) {
        this.totalDonationsRange = totalDonationsRange;
        return this;
    }

    /**
     * Total Donations Rating
     * <p>
     * The corresponding rating for the total donations range
     * 
     */
    @JsonProperty("totalDonationsRating")
    public String getTotalDonationsRating() {
        return totalDonationsRating;
    }

    /**
     * Total Donations Rating
     * <p>
     * The corresponding rating for the total donations range
     * 
     */
    @JsonProperty("totalDonationsRating")
    public void setTotalDonationsRating(String totalDonationsRating) {
        this.totalDonationsRating = totalDonationsRating;
    }

    public Metrics withTotalDonationsRating(String totalDonationsRating) {
        this.totalDonationsRating = totalDonationsRating;
        return this;
    }

    /**
     * Charitable Donations Range
     * <p>
     * The range of the total charitable donations amount
     * 
     */
    @JsonProperty("charitableDonationsRange")
    public String getCharitableDonationsRange() {
        return charitableDonationsRange;
    }

    /**
     * Charitable Donations Range
     * <p>
     * The range of the total charitable donations amount
     * 
     */
    @JsonProperty("charitableDonationsRange")
    public void setCharitableDonationsRange(String charitableDonationsRange) {
        this.charitableDonationsRange = charitableDonationsRange;
    }

    public Metrics withCharitableDonationsRange(String charitableDonationsRange) {
        this.charitableDonationsRange = charitableDonationsRange;
        return this;
    }

    /**
     * Charitable Donations Rating
     * <p>
     * The corresponding rating for the charitable donations range
     * 
     */
    @JsonProperty("charitableDonationsRating")
    public String getCharitableDonationsRating() {
        return charitableDonationsRating;
    }

    /**
     * Charitable Donations Rating
     * <p>
     * The corresponding rating for the charitable donations range
     * 
     */
    @JsonProperty("charitableDonationsRating")
    public void setCharitableDonationsRating(String charitableDonationsRating) {
        this.charitableDonationsRating = charitableDonationsRating;
    }

    public Metrics withCharitableDonationsRating(String charitableDonationsRating) {
        this.charitableDonationsRating = charitableDonationsRating;
        return this;
    }

    /**
     * Political Donations Range
     * <p>
     * The total political donations amount range
     * 
     */
    @JsonProperty("politicalDonationsRange")
    public String getPoliticalDonationsRange() {
        return politicalDonationsRange;
    }

    /**
     * Political Donations Range
     * <p>
     * The total political donations amount range
     * 
     */
    @JsonProperty("politicalDonationsRange")
    public void setPoliticalDonationsRange(String politicalDonationsRange) {
        this.politicalDonationsRange = politicalDonationsRange;
    }

    public Metrics withPoliticalDonationsRange(String politicalDonationsRange) {
        this.politicalDonationsRange = politicalDonationsRange;
        return this;
    }

    /**
     * Political Donations Rating
     * <p>
     * The corresponding rating for the political donations range
     * 
     */
    @JsonProperty("politicalDonationsRating")
    public String getPoliticalDonationsRating() {
        return politicalDonationsRating;
    }

    /**
     * Political Donations Rating
     * <p>
     * The corresponding rating for the political donations range
     * 
     */
    @JsonProperty("politicalDonationsRating")
    public void setPoliticalDonationsRating(String politicalDonationsRating) {
        this.politicalDonationsRating = politicalDonationsRating;
    }

    public Metrics withPoliticalDonationsRating(String politicalDonationsRating) {
        this.politicalDonationsRating = politicalDonationsRating;
        return this;
    }

    /**
     * Asset Ownership
     * <p>
     * Ownership of specific assets
     * 
     */
    @JsonProperty("assetOwnership")
    public List<AssetOwnership> getAssetOwnership() {
        return assetOwnership;
    }

    /**
     * Asset Ownership
     * <p>
     * Ownership of specific assets
     * 
     */
    @JsonProperty("assetOwnership")
    public void setAssetOwnership(List<AssetOwnership> assetOwnership) {
        this.assetOwnership = assetOwnership;
    }

    public Metrics withAssetOwnership(List<AssetOwnership> assetOwnership) {
        this.assetOwnership = assetOwnership;
        return this;
    }

    /**
     * Board Membership
     * <p>
     * Board membership
     * 
     */
    @JsonProperty("boardMembership")
    public Object getBoardMembership() {
        return boardMembership;
    }

    /**
     * Board Membership
     * <p>
     * Board membership
     * 
     */
    @JsonProperty("boardMembership")
    public void setBoardMembership(Object boardMembership) {
        this.boardMembership = boardMembership;
    }

    public Metrics withBoardMembership(Object boardMembership) {
        this.boardMembership = boardMembership;
        return this;
    }

    /**
     * Company Value Range
     * <p>
     * The D&B company value range
     * 
     */
    @JsonProperty("companyValueRange")
    public String getCompanyValueRange() {
        return companyValueRange;
    }

    /**
     * Company Value Range
     * <p>
     * The D&B company value range
     * 
     */
    @JsonProperty("companyValueRange")
    public void setCompanyValueRange(String companyValueRange) {
        this.companyValueRange = companyValueRange;
    }

    public Metrics withCompanyValueRange(String companyValueRange) {
        this.companyValueRange = companyValueRange;
        return this;
    }

    /**
     * Company Value Rating
     * <p>
     * The corresponding rating for the D&B company range value
     * 
     */
    @JsonProperty("companyValueRating")
    public String getCompanyValueRating() {
        return companyValueRating;
    }

    /**
     * Company Value Rating
     * <p>
     * The corresponding rating for the D&B company range value
     * 
     */
    @JsonProperty("companyValueRating")
    public void setCompanyValueRating(String companyValueRating) {
        this.companyValueRating = companyValueRating;
    }

    public Metrics withCompanyValueRating(String companyValueRating) {
        this.companyValueRating = companyValueRating;
        return this;
    }

    /**
     * Sales Volume Range
     * <p>
     * The business sales volume range
     * 
     */
    @JsonProperty("salesVolumeRange")
    public String getSalesVolumeRange() {
        return salesVolumeRange;
    }

    /**
     * Sales Volume Range
     * <p>
     * The business sales volume range
     * 
     */
    @JsonProperty("salesVolumeRange")
    public void setSalesVolumeRange(String salesVolumeRange) {
        this.salesVolumeRange = salesVolumeRange;
    }

    public Metrics withSalesVolumeRange(String salesVolumeRange) {
        this.salesVolumeRange = salesVolumeRange;
        return this;
    }

    /**
     * Sales Volume Rating
     * <p>
     * The corresponding rating for the business sales volume range
     * 
     */
    @JsonProperty("salesVolumeRating")
    public String getSalesVolumeRating() {
        return salesVolumeRating;
    }

    /**
     * Sales Volume Rating
     * <p>
     * The corresponding rating for the business sales volume range
     * 
     */
    @JsonProperty("salesVolumeRating")
    public void setSalesVolumeRating(String salesVolumeRating) {
        this.salesVolumeRating = salesVolumeRating;
    }

    public Metrics withSalesVolumeRating(String salesVolumeRating) {
        this.salesVolumeRating = salesVolumeRating;
        return this;
    }

    /**
     * Pensions Range
     * <p>
     * The held pensions range
     * 
     */
    @JsonProperty("pensionsRange")
    public String getPensionsRange() {
        return pensionsRange;
    }

    /**
     * Pensions Range
     * <p>
     * The held pensions range
     * 
     */
    @JsonProperty("pensionsRange")
    public void setPensionsRange(String pensionsRange) {
        this.pensionsRange = pensionsRange;
    }

    public Metrics withPensionsRange(String pensionsRange) {
        this.pensionsRange = pensionsRange;
        return this;
    }

    /**
     * Pensions Rating
     * <p>
     * The orresponding rating for the pensions range
     * 
     */
    @JsonProperty("pensionsRating")
    public String getPensionsRating() {
        return pensionsRating;
    }

    /**
     * Pensions Rating
     * <p>
     * The orresponding rating for the pensions range
     * 
     */
    @JsonProperty("pensionsRating")
    public void setPensionsRating(String pensionsRating) {
        this.pensionsRating = pensionsRating;
    }

    public Metrics withPensionsRating(String pensionsRating) {
        this.pensionsRating = pensionsRating;
        return this;
    }

    /**
     * Giving Capacity Income Range
     * <p>
     * The portion of income used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityIncomeRange")
    public String getGivingCapacityIncomeRange() {
        return givingCapacityIncomeRange;
    }

    /**
     * Giving Capacity Income Range
     * <p>
     * The portion of income used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityIncomeRange")
    public void setGivingCapacityIncomeRange(String givingCapacityIncomeRange) {
        this.givingCapacityIncomeRange = givingCapacityIncomeRange;
    }

    public Metrics withGivingCapacityIncomeRange(String givingCapacityIncomeRange) {
        this.givingCapacityIncomeRange = givingCapacityIncomeRange;
        return this;
    }

    /**
     * Giving Capacity Income Rating
     * <p>
     * The corresponding rating for giving capacity income range
     * 
     */
    @JsonProperty("givingCapacityIncomeRating")
    public String getGivingCapacityIncomeRating() {
        return givingCapacityIncomeRating;
    }

    /**
     * Giving Capacity Income Rating
     * <p>
     * The corresponding rating for giving capacity income range
     * 
     */
    @JsonProperty("givingCapacityIncomeRating")
    public void setGivingCapacityIncomeRating(String givingCapacityIncomeRating) {
        this.givingCapacityIncomeRating = givingCapacityIncomeRating;
    }

    public Metrics withGivingCapacityIncomeRating(String givingCapacityIncomeRating) {
        this.givingCapacityIncomeRating = givingCapacityIncomeRating;
        return this;
    }

    /**
     * Giving Capacity Real Estate Range
     * <p>
     * The portion of real estate used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityRealEstateRange")
    public String getGivingCapacityRealEstateRange() {
        return givingCapacityRealEstateRange;
    }

    /**
     * Giving Capacity Real Estate Range
     * <p>
     * The portion of real estate used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityRealEstateRange")
    public void setGivingCapacityRealEstateRange(String givingCapacityRealEstateRange) {
        this.givingCapacityRealEstateRange = givingCapacityRealEstateRange;
    }

    public Metrics withGivingCapacityRealEstateRange(String givingCapacityRealEstateRange) {
        this.givingCapacityRealEstateRange = givingCapacityRealEstateRange;
        return this;
    }

    /**
     * Giving Capacity Real Estate Rating
     * <p>
     * The corresponding rating for the giving capacity real estate range
     * 
     */
    @JsonProperty("givingCapacityRealEstateRating")
    public String getGivingCapacityRealEstateRating() {
        return givingCapacityRealEstateRating;
    }

    /**
     * Giving Capacity Real Estate Rating
     * <p>
     * The corresponding rating for the giving capacity real estate range
     * 
     */
    @JsonProperty("givingCapacityRealEstateRating")
    public void setGivingCapacityRealEstateRating(String givingCapacityRealEstateRating) {
        this.givingCapacityRealEstateRating = givingCapacityRealEstateRating;
    }

    public Metrics withGivingCapacityRealEstateRating(String givingCapacityRealEstateRating) {
        this.givingCapacityRealEstateRating = givingCapacityRealEstateRating;
        return this;
    }

    /**
     * Giving Capacity Stocks Range
     * <p>
     * The portion of stock value used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityStocksRange")
    public String getGivingCapacityStocksRange() {
        return givingCapacityStocksRange;
    }

    /**
     * Giving Capacity Stocks Range
     * <p>
     * The portion of stock value used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityStocksRange")
    public void setGivingCapacityStocksRange(String givingCapacityStocksRange) {
        this.givingCapacityStocksRange = givingCapacityStocksRange;
    }

    public Metrics withGivingCapacityStocksRange(String givingCapacityStocksRange) {
        this.givingCapacityStocksRange = givingCapacityStocksRange;
        return this;
    }

    /**
     * Giving Capacity Stocks Rating
     * <p>
     * The corresponding rating for the giving capacity stocks range
     * 
     */
    @JsonProperty("givingCapacityStocksRating")
    public String getGivingCapacityStocksRating() {
        return givingCapacityStocksRating;
    }

    /**
     * Giving Capacity Stocks Rating
     * <p>
     * The corresponding rating for the giving capacity stocks range
     * 
     */
    @JsonProperty("givingCapacityStocksRating")
    public void setGivingCapacityStocksRating(String givingCapacityStocksRating) {
        this.givingCapacityStocksRating = givingCapacityStocksRating;
    }

    public Metrics withGivingCapacityStocksRating(String givingCapacityStocksRating) {
        this.givingCapacityStocksRating = givingCapacityStocksRating;
        return this;
    }

    /**
     * Giving Capacity Pensions Range
     * <p>
     * The portion of the pensions used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityPensionsRange")
    public String getGivingCapacityPensionsRange() {
        return givingCapacityPensionsRange;
    }

    /**
     * Giving Capacity Pensions Range
     * <p>
     * The portion of the pensions used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityPensionsRange")
    public void setGivingCapacityPensionsRange(String givingCapacityPensionsRange) {
        this.givingCapacityPensionsRange = givingCapacityPensionsRange;
    }

    public Metrics withGivingCapacityPensionsRange(String givingCapacityPensionsRange) {
        this.givingCapacityPensionsRange = givingCapacityPensionsRange;
        return this;
    }

    /**
     * Giving Capacity Pensions Rating
     * <p>
     * The corresponding rating for giving capacity pensions range
     * 
     */
    @JsonProperty("givingCapacityPensionsRating")
    public String getGivingCapacityPensionsRating() {
        return givingCapacityPensionsRating;
    }

    /**
     * Giving Capacity Pensions Rating
     * <p>
     * The corresponding rating for giving capacity pensions range
     * 
     */
    @JsonProperty("givingCapacityPensionsRating")
    public void setGivingCapacityPensionsRating(String givingCapacityPensionsRating) {
        this.givingCapacityPensionsRating = givingCapacityPensionsRating;
    }

    public Metrics withGivingCapacityPensionsRating(String givingCapacityPensionsRating) {
        this.givingCapacityPensionsRating = givingCapacityPensionsRating;
        return this;
    }

    /**
     * Giving Capacity Giving Range
     * <p>
     * The portion of donations used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityGivingRange")
    public String getGivingCapacityGivingRange() {
        return givingCapacityGivingRange;
    }

    /**
     * Giving Capacity Giving Range
     * <p>
     * The portion of donations used in calculating the giving capacity range
     * 
     */
    @JsonProperty("givingCapacityGivingRange")
    public void setGivingCapacityGivingRange(String givingCapacityGivingRange) {
        this.givingCapacityGivingRange = givingCapacityGivingRange;
    }

    public Metrics withGivingCapacityGivingRange(String givingCapacityGivingRange) {
        this.givingCapacityGivingRange = givingCapacityGivingRange;
        return this;
    }

    /**
     * Giving Capacity Giving Rating
     * <p>
     * The corresponding rating for the giving capacity giving range
     * 
     */
    @JsonProperty("givingCapacityGivingRating")
    public String getGivingCapacityGivingRating() {
        return givingCapacityGivingRating;
    }

    /**
     * Giving Capacity Giving Rating
     * <p>
     * The corresponding rating for the giving capacity giving range
     * 
     */
    @JsonProperty("givingCapacityGivingRating")
    public void setGivingCapacityGivingRating(String givingCapacityGivingRating) {
        this.givingCapacityGivingRating = givingCapacityGivingRating;
    }

    public Metrics withGivingCapacityGivingRating(String givingCapacityGivingRating) {
        this.givingCapacityGivingRating = givingCapacityGivingRating;
        return this;
    }

    /**
     * Giving Capacity Age
     * <p>
     * The age used as the input for the giving capacity rating
     * 
     */
    @JsonProperty("givingCapacityAge")
    public Object getGivingCapacityAge() {
        return givingCapacityAge;
    }

    /**
     * Giving Capacity Age
     * <p>
     * The age used as the input for the giving capacity rating
     * 
     */
    @JsonProperty("givingCapacityAge")
    public void setGivingCapacityAge(Object givingCapacityAge) {
        this.givingCapacityAge = givingCapacityAge;
    }

    public Metrics withGivingCapacityAge(Object givingCapacityAge) {
        this.givingCapacityAge = givingCapacityAge;
        return this;
    }

    /**
     * Quality Of Match
     * <p>
     * Quality of match metrics
     * 
     */
    @JsonProperty("qualityOfMatch")
    public QualityOfMatch getQualityOfMatch() {
        return qualityOfMatch;
    }

    /**
     * Quality Of Match
     * <p>
     * Quality of match metrics
     * 
     */
    @JsonProperty("qualityOfMatch")
    public void setQualityOfMatch(QualityOfMatch qualityOfMatch) {
        this.qualityOfMatch = qualityOfMatch;
    }

    public Metrics withQualityOfMatch(QualityOfMatch qualityOfMatch) {
        this.qualityOfMatch = qualityOfMatch;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metrics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("propensityToGiveScore1");
        sb.append('=');
        sb.append(((this.propensityToGiveScore1 == null)?"<null>":this.propensityToGiveScore1));
        sb.append(',');
        sb.append("propensityToGiveScore2");
        sb.append('=');
        sb.append(((this.propensityToGiveScore2 == null)?"<null>":this.propensityToGiveScore2));
        sb.append(',');
        sb.append("propensityToGiveRating");
        sb.append('=');
        sb.append(((this.propensityToGiveRating == null)?"<null>":this.propensityToGiveRating));
        sb.append(',');
        sb.append("assetRange");
        sb.append('=');
        sb.append(((this.assetRange == null)?"<null>":this.assetRange));
        sb.append(',');
        sb.append("assetRating");
        sb.append('=');
        sb.append(((this.assetRating == null)?"<null>":this.assetRating));
        sb.append(',');
        sb.append("netWorthRange");
        sb.append('=');
        sb.append(((this.netWorthRange == null)?"<null>":this.netWorthRange));
        sb.append(',');
        sb.append("netWorthRating");
        sb.append('=');
        sb.append(((this.netWorthRating == null)?"<null>":this.netWorthRating));
        sb.append(',');
        sb.append("liquidityRange");
        sb.append('=');
        sb.append(((this.liquidityRange == null)?"<null>":this.liquidityRange));
        sb.append(',');
        sb.append("liquidityRating");
        sb.append('=');
        sb.append(((this.liquidityRating == null)?"<null>":this.liquidityRating));
        sb.append(',');
        sb.append("estimatedAnnualDonationsRange");
        sb.append('=');
        sb.append(((this.estimatedAnnualDonationsRange == null)?"<null>":this.estimatedAnnualDonationsRange));
        sb.append(',');
        sb.append("estimatedAnnualDonationsRating");
        sb.append('=');
        sb.append(((this.estimatedAnnualDonationsRating == null)?"<null>":this.estimatedAnnualDonationsRating));
        sb.append(',');
        sb.append("inclinationGiving");
        sb.append('=');
        sb.append(((this.inclinationGiving == null)?"<null>":this.inclinationGiving));
        sb.append(',');
        sb.append("inclinationAffiliation");
        sb.append('=');
        sb.append(((this.inclinationAffiliation == null)?"<null>":this.inclinationAffiliation));
        sb.append(',');
        sb.append("givingCapacityRange");
        sb.append('=');
        sb.append(((this.givingCapacityRange == null)?"<null>":this.givingCapacityRange));
        sb.append(',');
        sb.append("givingCapacityRating");
        sb.append('=');
        sb.append(((this.givingCapacityRating == null)?"<null>":this.givingCapacityRating));
        sb.append(',');
        sb.append("bequestRating");
        sb.append('=');
        sb.append(((this.bequestRating == null)?"<null>":this.bequestRating));
        sb.append(',');
        sb.append("annuityRating");
        sb.append('=');
        sb.append(((this.annuityRating == null)?"<null>":this.annuityRating));
        sb.append(',');
        sb.append("trustRating");
        sb.append('=');
        sb.append(((this.trustRating == null)?"<null>":this.trustRating));
        sb.append(',');
        sb.append("influenceRating");
        sb.append('=');
        sb.append(((this.influenceRating == null)?"<null>":this.influenceRating));
        sb.append(',');
        sb.append("incomeRange");
        sb.append('=');
        sb.append(((this.incomeRange == null)?"<null>":this.incomeRange));
        sb.append(',');
        sb.append("incomeRating");
        sb.append('=');
        sb.append(((this.incomeRating == null)?"<null>":this.incomeRating));
        sb.append(',');
        sb.append("realEstateValueRange");
        sb.append('=');
        sb.append(((this.realEstateValueRange == null)?"<null>":this.realEstateValueRange));
        sb.append(',');
        sb.append("realEstateValueRating");
        sb.append('=');
        sb.append(((this.realEstateValueRating == null)?"<null>":this.realEstateValueRating));
        sb.append(',');
        sb.append("realEstateCount");
        sb.append('=');
        sb.append(((this.realEstateCount == null)?"<null>":this.realEstateCount));
        sb.append(',');
        sb.append("directStockRange");
        sb.append('=');
        sb.append(((this.directStockRange == null)?"<null>":this.directStockRange));
        sb.append(',');
        sb.append("directStockRating");
        sb.append('=');
        sb.append(((this.directStockRating == null)?"<null>":this.directStockRating));
        sb.append(',');
        sb.append("totalStockRange");
        sb.append('=');
        sb.append(((this.totalStockRange == null)?"<null>":this.totalStockRange));
        sb.append(',');
        sb.append("totalStockRating");
        sb.append('=');
        sb.append(((this.totalStockRating == null)?"<null>":this.totalStockRating));
        sb.append(',');
        sb.append("totalDonationsRange");
        sb.append('=');
        sb.append(((this.totalDonationsRange == null)?"<null>":this.totalDonationsRange));
        sb.append(',');
        sb.append("totalDonationsRating");
        sb.append('=');
        sb.append(((this.totalDonationsRating == null)?"<null>":this.totalDonationsRating));
        sb.append(',');
        sb.append("charitableDonationsRange");
        sb.append('=');
        sb.append(((this.charitableDonationsRange == null)?"<null>":this.charitableDonationsRange));
        sb.append(',');
        sb.append("charitableDonationsRating");
        sb.append('=');
        sb.append(((this.charitableDonationsRating == null)?"<null>":this.charitableDonationsRating));
        sb.append(',');
        sb.append("politicalDonationsRange");
        sb.append('=');
        sb.append(((this.politicalDonationsRange == null)?"<null>":this.politicalDonationsRange));
        sb.append(',');
        sb.append("politicalDonationsRating");
        sb.append('=');
        sb.append(((this.politicalDonationsRating == null)?"<null>":this.politicalDonationsRating));
        sb.append(',');
        sb.append("assetOwnership");
        sb.append('=');
        sb.append(((this.assetOwnership == null)?"<null>":this.assetOwnership));
        sb.append(',');
        sb.append("boardMembership");
        sb.append('=');
        sb.append(((this.boardMembership == null)?"<null>":this.boardMembership));
        sb.append(',');
        sb.append("companyValueRange");
        sb.append('=');
        sb.append(((this.companyValueRange == null)?"<null>":this.companyValueRange));
        sb.append(',');
        sb.append("companyValueRating");
        sb.append('=');
        sb.append(((this.companyValueRating == null)?"<null>":this.companyValueRating));
        sb.append(',');
        sb.append("salesVolumeRange");
        sb.append('=');
        sb.append(((this.salesVolumeRange == null)?"<null>":this.salesVolumeRange));
        sb.append(',');
        sb.append("salesVolumeRating");
        sb.append('=');
        sb.append(((this.salesVolumeRating == null)?"<null>":this.salesVolumeRating));
        sb.append(',');
        sb.append("pensionsRange");
        sb.append('=');
        sb.append(((this.pensionsRange == null)?"<null>":this.pensionsRange));
        sb.append(',');
        sb.append("pensionsRating");
        sb.append('=');
        sb.append(((this.pensionsRating == null)?"<null>":this.pensionsRating));
        sb.append(',');
        sb.append("givingCapacityIncomeRange");
        sb.append('=');
        sb.append(((this.givingCapacityIncomeRange == null)?"<null>":this.givingCapacityIncomeRange));
        sb.append(',');
        sb.append("givingCapacityIncomeRating");
        sb.append('=');
        sb.append(((this.givingCapacityIncomeRating == null)?"<null>":this.givingCapacityIncomeRating));
        sb.append(',');
        sb.append("givingCapacityRealEstateRange");
        sb.append('=');
        sb.append(((this.givingCapacityRealEstateRange == null)?"<null>":this.givingCapacityRealEstateRange));
        sb.append(',');
        sb.append("givingCapacityRealEstateRating");
        sb.append('=');
        sb.append(((this.givingCapacityRealEstateRating == null)?"<null>":this.givingCapacityRealEstateRating));
        sb.append(',');
        sb.append("givingCapacityStocksRange");
        sb.append('=');
        sb.append(((this.givingCapacityStocksRange == null)?"<null>":this.givingCapacityStocksRange));
        sb.append(',');
        sb.append("givingCapacityStocksRating");
        sb.append('=');
        sb.append(((this.givingCapacityStocksRating == null)?"<null>":this.givingCapacityStocksRating));
        sb.append(',');
        sb.append("givingCapacityPensionsRange");
        sb.append('=');
        sb.append(((this.givingCapacityPensionsRange == null)?"<null>":this.givingCapacityPensionsRange));
        sb.append(',');
        sb.append("givingCapacityPensionsRating");
        sb.append('=');
        sb.append(((this.givingCapacityPensionsRating == null)?"<null>":this.givingCapacityPensionsRating));
        sb.append(',');
        sb.append("givingCapacityGivingRange");
        sb.append('=');
        sb.append(((this.givingCapacityGivingRange == null)?"<null>":this.givingCapacityGivingRange));
        sb.append(',');
        sb.append("givingCapacityGivingRating");
        sb.append('=');
        sb.append(((this.givingCapacityGivingRating == null)?"<null>":this.givingCapacityGivingRating));
        sb.append(',');
        sb.append("givingCapacityAge");
        sb.append('=');
        sb.append(((this.givingCapacityAge == null)?"<null>":this.givingCapacityAge));
        sb.append(',');
        sb.append("qualityOfMatch");
        sb.append('=');
        sb.append(((this.qualityOfMatch == null)?"<null>":this.qualityOfMatch));
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
        result = ((result* 31)+((this.annuityRating == null)? 0 :this.annuityRating.hashCode()));
        result = ((result* 31)+((this.trustRating == null)? 0 :this.trustRating.hashCode()));
        result = ((result* 31)+((this.qualityOfMatch == null)? 0 :this.qualityOfMatch.hashCode()));
        result = ((result* 31)+((this.companyValueRating == null)? 0 :this.companyValueRating.hashCode()));
        result = ((result* 31)+((this.givingCapacityStocksRange == null)? 0 :this.givingCapacityStocksRange.hashCode()));
        result = ((result* 31)+((this.realEstateValueRating == null)? 0 :this.realEstateValueRating.hashCode()));
        result = ((result* 31)+((this.incomeRange == null)? 0 :this.incomeRange.hashCode()));
        result = ((result* 31)+((this.directStockRange == null)? 0 :this.directStockRange.hashCode()));
        result = ((result* 31)+((this.liquidityRange == null)? 0 :this.liquidityRange.hashCode()));
        result = ((result* 31)+((this.givingCapacityRating == null)? 0 :this.givingCapacityRating.hashCode()));
        result = ((result* 31)+((this.assetRange == null)? 0 :this.assetRange.hashCode()));
        result = ((result* 31)+((this.inclinationGiving == null)? 0 :this.inclinationGiving.hashCode()));
        result = ((result* 31)+((this.assetOwnership == null)? 0 :this.assetOwnership.hashCode()));
        result = ((result* 31)+((this.givingCapacityIncomeRange == null)? 0 :this.givingCapacityIncomeRange.hashCode()));
        result = ((result* 31)+((this.realEstateValueRange == null)? 0 :this.realEstateValueRange.hashCode()));
        result = ((result* 31)+((this.assetRating == null)? 0 :this.assetRating.hashCode()));
        result = ((result* 31)+((this.netWorthRange == null)? 0 :this.netWorthRange.hashCode()));
        result = ((result* 31)+((this.totalStockRange == null)? 0 :this.totalStockRange.hashCode()));
        result = ((result* 31)+((this.givingCapacityRealEstateRange == null)? 0 :this.givingCapacityRealEstateRange.hashCode()));
        result = ((result* 31)+((this.charitableDonationsRating == null)? 0 :this.charitableDonationsRating.hashCode()));
        result = ((result* 31)+((this.givingCapacityAge == null)? 0 :this.givingCapacityAge.hashCode()));
        result = ((result* 31)+((this.givingCapacityRealEstateRating == null)? 0 :this.givingCapacityRealEstateRating.hashCode()));
        result = ((result* 31)+((this.givingCapacityIncomeRating == null)? 0 :this.givingCapacityIncomeRating.hashCode()));
        result = ((result* 31)+((this.incomeRating == null)? 0 :this.incomeRating.hashCode()));
        result = ((result* 31)+((this.givingCapacityPensionsRange == null)? 0 :this.givingCapacityPensionsRange.hashCode()));
        result = ((result* 31)+((this.estimatedAnnualDonationsRating == null)? 0 :this.estimatedAnnualDonationsRating.hashCode()));
        result = ((result* 31)+((this.charitableDonationsRange == null)? 0 :this.charitableDonationsRange.hashCode()));
        result = ((result* 31)+((this.estimatedAnnualDonationsRange == null)? 0 :this.estimatedAnnualDonationsRange.hashCode()));
        result = ((result* 31)+((this.givingCapacityGivingRating == null)? 0 :this.givingCapacityGivingRating.hashCode()));
        result = ((result* 31)+((this.salesVolumeRating == null)? 0 :this.salesVolumeRating.hashCode()));
        result = ((result* 31)+((this.bequestRating == null)? 0 :this.bequestRating.hashCode()));
        result = ((result* 31)+((this.politicalDonationsRange == null)? 0 :this.politicalDonationsRange.hashCode()));
        result = ((result* 31)+((this.influenceRating == null)? 0 :this.influenceRating.hashCode()));
        result = ((result* 31)+((this.totalDonationsRange == null)? 0 :this.totalDonationsRange.hashCode()));
        result = ((result* 31)+((this.propensityToGiveScore2 == null)? 0 :this.propensityToGiveScore2 .hashCode()));
        result = ((result* 31)+((this.propensityToGiveScore1 == null)? 0 :this.propensityToGiveScore1 .hashCode()));
        result = ((result* 31)+((this.inclinationAffiliation == null)? 0 :this.inclinationAffiliation.hashCode()));
        result = ((result* 31)+((this.givingCapacityGivingRange == null)? 0 :this.givingCapacityGivingRange.hashCode()));
        result = ((result* 31)+((this.salesVolumeRange == null)? 0 :this.salesVolumeRange.hashCode()));
        result = ((result* 31)+((this.directStockRating == null)? 0 :this.directStockRating.hashCode()));
        result = ((result* 31)+((this.totalStockRating == null)? 0 :this.totalStockRating.hashCode()));
        result = ((result* 31)+((this.givingCapacityPensionsRating == null)? 0 :this.givingCapacityPensionsRating.hashCode()));
        result = ((result* 31)+((this.liquidityRating == null)? 0 :this.liquidityRating.hashCode()));
        result = ((result* 31)+((this.pensionsRating == null)? 0 :this.pensionsRating.hashCode()));
        result = ((result* 31)+((this.totalDonationsRating == null)? 0 :this.totalDonationsRating.hashCode()));
        result = ((result* 31)+((this.givingCapacityRange == null)? 0 :this.givingCapacityRange.hashCode()));
        result = ((result* 31)+((this.propensityToGiveRating == null)? 0 :this.propensityToGiveRating.hashCode()));
        result = ((result* 31)+((this.politicalDonationsRating == null)? 0 :this.politicalDonationsRating.hashCode()));
        result = ((result* 31)+((this.pensionsRange == null)? 0 :this.pensionsRange.hashCode()));
        result = ((result* 31)+((this.givingCapacityStocksRating == null)? 0 :this.givingCapacityStocksRating.hashCode()));
        result = ((result* 31)+((this.realEstateCount == null)? 0 :this.realEstateCount.hashCode()));
        result = ((result* 31)+((this.boardMembership == null)? 0 :this.boardMembership.hashCode()));
        result = ((result* 31)+((this.netWorthRating == null)? 0 :this.netWorthRating.hashCode()));
        result = ((result* 31)+((this.companyValueRange == null)? 0 :this.companyValueRange.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metrics) == false) {
            return false;
        }
        Metrics rhs = ((Metrics) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((this.annuityRating == rhs.annuityRating)||((this.annuityRating!= null)&&this.annuityRating.equals(rhs.annuityRating)))&&((this.trustRating == rhs.trustRating)||((this.trustRating!= null)&&this.trustRating.equals(rhs.trustRating))))&&((this.qualityOfMatch == rhs.qualityOfMatch)||((this.qualityOfMatch!= null)&&this.qualityOfMatch.equals(rhs.qualityOfMatch))))&&((this.companyValueRating == rhs.companyValueRating)||((this.companyValueRating!= null)&&this.companyValueRating.equals(rhs.companyValueRating))))&&((this.givingCapacityStocksRange == rhs.givingCapacityStocksRange)||((this.givingCapacityStocksRange!= null)&&this.givingCapacityStocksRange.equals(rhs.givingCapacityStocksRange))))&&((this.realEstateValueRating == rhs.realEstateValueRating)||((this.realEstateValueRating!= null)&&this.realEstateValueRating.equals(rhs.realEstateValueRating))))&&((this.incomeRange == rhs.incomeRange)||((this.incomeRange!= null)&&this.incomeRange.equals(rhs.incomeRange))))&&((this.directStockRange == rhs.directStockRange)||((this.directStockRange!= null)&&this.directStockRange.equals(rhs.directStockRange))))&&((this.liquidityRange == rhs.liquidityRange)||((this.liquidityRange!= null)&&this.liquidityRange.equals(rhs.liquidityRange))))&&((this.givingCapacityRating == rhs.givingCapacityRating)||((this.givingCapacityRating!= null)&&this.givingCapacityRating.equals(rhs.givingCapacityRating))))&&((this.assetRange == rhs.assetRange)||((this.assetRange!= null)&&this.assetRange.equals(rhs.assetRange))))&&((this.inclinationGiving == rhs.inclinationGiving)||((this.inclinationGiving!= null)&&this.inclinationGiving.equals(rhs.inclinationGiving))))&&((this.assetOwnership == rhs.assetOwnership)||((this.assetOwnership!= null)&&this.assetOwnership.equals(rhs.assetOwnership))))&&((this.givingCapacityIncomeRange == rhs.givingCapacityIncomeRange)||((this.givingCapacityIncomeRange!= null)&&this.givingCapacityIncomeRange.equals(rhs.givingCapacityIncomeRange))))&&((this.realEstateValueRange == rhs.realEstateValueRange)||((this.realEstateValueRange!= null)&&this.realEstateValueRange.equals(rhs.realEstateValueRange))))&&((this.assetRating == rhs.assetRating)||((this.assetRating!= null)&&this.assetRating.equals(rhs.assetRating))))&&((this.netWorthRange == rhs.netWorthRange)||((this.netWorthRange!= null)&&this.netWorthRange.equals(rhs.netWorthRange))))&&((this.totalStockRange == rhs.totalStockRange)||((this.totalStockRange!= null)&&this.totalStockRange.equals(rhs.totalStockRange))))&&((this.givingCapacityRealEstateRange == rhs.givingCapacityRealEstateRange)||((this.givingCapacityRealEstateRange!= null)&&this.givingCapacityRealEstateRange.equals(rhs.givingCapacityRealEstateRange))))&&((this.charitableDonationsRating == rhs.charitableDonationsRating)||((this.charitableDonationsRating!= null)&&this.charitableDonationsRating.equals(rhs.charitableDonationsRating))))&&((this.givingCapacityAge == rhs.givingCapacityAge)||((this.givingCapacityAge!= null)&&this.givingCapacityAge.equals(rhs.givingCapacityAge))))&&((this.givingCapacityRealEstateRating == rhs.givingCapacityRealEstateRating)||((this.givingCapacityRealEstateRating!= null)&&this.givingCapacityRealEstateRating.equals(rhs.givingCapacityRealEstateRating))))&&((this.givingCapacityIncomeRating == rhs.givingCapacityIncomeRating)||((this.givingCapacityIncomeRating!= null)&&this.givingCapacityIncomeRating.equals(rhs.givingCapacityIncomeRating))))&&((this.incomeRating == rhs.incomeRating)||((this.incomeRating!= null)&&this.incomeRating.equals(rhs.incomeRating))))&&((this.givingCapacityPensionsRange == rhs.givingCapacityPensionsRange)||((this.givingCapacityPensionsRange!= null)&&this.givingCapacityPensionsRange.equals(rhs.givingCapacityPensionsRange))))&&((this.estimatedAnnualDonationsRating == rhs.estimatedAnnualDonationsRating)||((this.estimatedAnnualDonationsRating!= null)&&this.estimatedAnnualDonationsRating.equals(rhs.estimatedAnnualDonationsRating))))&&((this.charitableDonationsRange == rhs.charitableDonationsRange)||((this.charitableDonationsRange!= null)&&this.charitableDonationsRange.equals(rhs.charitableDonationsRange))))&&((this.estimatedAnnualDonationsRange == rhs.estimatedAnnualDonationsRange)||((this.estimatedAnnualDonationsRange!= null)&&this.estimatedAnnualDonationsRange.equals(rhs.estimatedAnnualDonationsRange))))&&((this.givingCapacityGivingRating == rhs.givingCapacityGivingRating)||((this.givingCapacityGivingRating!= null)&&this.givingCapacityGivingRating.equals(rhs.givingCapacityGivingRating))))&&((this.salesVolumeRating == rhs.salesVolumeRating)||((this.salesVolumeRating!= null)&&this.salesVolumeRating.equals(rhs.salesVolumeRating))))&&((this.bequestRating == rhs.bequestRating)||((this.bequestRating!= null)&&this.bequestRating.equals(rhs.bequestRating))))&&((this.politicalDonationsRange == rhs.politicalDonationsRange)||((this.politicalDonationsRange!= null)&&this.politicalDonationsRange.equals(rhs.politicalDonationsRange))))&&((this.influenceRating == rhs.influenceRating)||((this.influenceRating!= null)&&this.influenceRating.equals(rhs.influenceRating))))&&((this.totalDonationsRange == rhs.totalDonationsRange)||((this.totalDonationsRange!= null)&&this.totalDonationsRange.equals(rhs.totalDonationsRange))))&&((this.propensityToGiveScore2 == rhs.propensityToGiveScore2)||((this.propensityToGiveScore2 != null)&&this.propensityToGiveScore2 .equals(rhs.propensityToGiveScore2))))&&((this.propensityToGiveScore1 == rhs.propensityToGiveScore1)||((this.propensityToGiveScore1 != null)&&this.propensityToGiveScore1 .equals(rhs.propensityToGiveScore1))))&&((this.inclinationAffiliation == rhs.inclinationAffiliation)||((this.inclinationAffiliation!= null)&&this.inclinationAffiliation.equals(rhs.inclinationAffiliation))))&&((this.givingCapacityGivingRange == rhs.givingCapacityGivingRange)||((this.givingCapacityGivingRange!= null)&&this.givingCapacityGivingRange.equals(rhs.givingCapacityGivingRange))))&&((this.salesVolumeRange == rhs.salesVolumeRange)||((this.salesVolumeRange!= null)&&this.salesVolumeRange.equals(rhs.salesVolumeRange))))&&((this.directStockRating == rhs.directStockRating)||((this.directStockRating!= null)&&this.directStockRating.equals(rhs.directStockRating))))&&((this.totalStockRating == rhs.totalStockRating)||((this.totalStockRating!= null)&&this.totalStockRating.equals(rhs.totalStockRating))))&&((this.givingCapacityPensionsRating == rhs.givingCapacityPensionsRating)||((this.givingCapacityPensionsRating!= null)&&this.givingCapacityPensionsRating.equals(rhs.givingCapacityPensionsRating))))&&((this.liquidityRating == rhs.liquidityRating)||((this.liquidityRating!= null)&&this.liquidityRating.equals(rhs.liquidityRating))))&&((this.pensionsRating == rhs.pensionsRating)||((this.pensionsRating!= null)&&this.pensionsRating.equals(rhs.pensionsRating))))&&((this.totalDonationsRating == rhs.totalDonationsRating)||((this.totalDonationsRating!= null)&&this.totalDonationsRating.equals(rhs.totalDonationsRating))))&&((this.givingCapacityRange == rhs.givingCapacityRange)||((this.givingCapacityRange!= null)&&this.givingCapacityRange.equals(rhs.givingCapacityRange))))&&((this.propensityToGiveRating == rhs.propensityToGiveRating)||((this.propensityToGiveRating!= null)&&this.propensityToGiveRating.equals(rhs.propensityToGiveRating))))&&((this.politicalDonationsRating == rhs.politicalDonationsRating)||((this.politicalDonationsRating!= null)&&this.politicalDonationsRating.equals(rhs.politicalDonationsRating))))&&((this.pensionsRange == rhs.pensionsRange)||((this.pensionsRange!= null)&&this.pensionsRange.equals(rhs.pensionsRange))))&&((this.givingCapacityStocksRating == rhs.givingCapacityStocksRating)||((this.givingCapacityStocksRating!= null)&&this.givingCapacityStocksRating.equals(rhs.givingCapacityStocksRating))))&&((this.realEstateCount == rhs.realEstateCount)||((this.realEstateCount!= null)&&this.realEstateCount.equals(rhs.realEstateCount))))&&((this.boardMembership == rhs.boardMembership)||((this.boardMembership!= null)&&this.boardMembership.equals(rhs.boardMembership))))&&((this.netWorthRating == rhs.netWorthRating)||((this.netWorthRating!= null)&&this.netWorthRating.equals(rhs.netWorthRating))))&&((this.companyValueRange == rhs.companyValueRange)||((this.companyValueRange!= null)&&this.companyValueRange.equals(rhs.companyValueRange))));
    }

}
