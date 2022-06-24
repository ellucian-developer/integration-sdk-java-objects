
package com.ellucian.generated.bpapi.ban.financial_aid_record_maintenance.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dispsumImBudgetAmt",
    "dispsumResourceAmt",
    "dispsumBudgetGroup",
    "dispsumCrossoverPellAward",
    "dispsumFmGrossNeed",
    "dispsumOfferAmt",
    "dispsumFmUnmetNeed",
    "dispsumCrossoverAidyCode",
    "dispsumImEfc",
    "dispsumPellBudgetAmt",
    "dispsumBudgetGroupInd",
    "dispsumFmBudgetAmt",
    "dispsumPellEfc",
    "dispsumBbayAwardedInd",
    "dispsumAprdCode",
    "dispsumImGrossNeed",
    "dispsumAprdCodePell",
    "dispsumFmEfc",
    "dispsumImUnmetNeed"
})
@Generated("jsonschema2pojo")
public class Summary {

    /**
     * IM
     * <p>
     * Lineage reference object : dispsumImBudgetAmt
     * 
     */
    @JsonProperty("dispsumImBudgetAmt")
    @JsonPropertyDescription("Lineage reference object : dispsumImBudgetAmt")
    private Double dispsumImBudgetAmt;
    /**
     * Resource
     * <p>
     * Lineage reference object : dispsumResourceAmt
     * 
     */
    @JsonProperty("dispsumResourceAmt")
    @JsonPropertyDescription("Lineage reference object : dispsumResourceAmt")
    private Double dispsumResourceAmt;
    /**
     * Budget Group
     * <p>
     * Lineage reference object : dispsumBudgetGroup
     * 
     */
    @JsonProperty("dispsumBudgetGroup")
    @JsonPropertyDescription("Lineage reference object : dispsumBudgetGroup")
    private String dispsumBudgetGroup;
    /**
     * Pell Award
     * <p>
     * Lineage reference object : dispsumCrossoverPellAward
     * 
     */
    @JsonProperty("dispsumCrossoverPellAward")
    @JsonPropertyDescription("Lineage reference object : dispsumCrossoverPellAward")
    private Double dispsumCrossoverPellAward;
    /**
     * Gross Need
     * <p>
     * Lineage reference object : dispsumFmGrossNeed
     * 
     */
    @JsonProperty("dispsumFmGrossNeed")
    @JsonPropertyDescription("Lineage reference object : dispsumFmGrossNeed")
    private Double dispsumFmGrossNeed;
    /**
     * Offered
     * <p>
     * Lineage reference object : dispsumOfferAmt
     * 
     */
    @JsonProperty("dispsumOfferAmt")
    @JsonPropertyDescription("Lineage reference object : dispsumOfferAmt")
    private Double dispsumOfferAmt;
    /**
     * Unmet Need
     * <p>
     * Lineage reference object : dispsumFmUnmetNeed
     * 
     */
    @JsonProperty("dispsumFmUnmetNeed")
    @JsonPropertyDescription("Lineage reference object : dispsumFmUnmetNeed")
    private Double dispsumFmUnmetNeed;
    /**
     * Crossover Aid Year
     * <p>
     * Lineage reference object : dispsumCrossoverAidyCode
     * 
     */
    @JsonProperty("dispsumCrossoverAidyCode")
    @JsonPropertyDescription("Lineage reference object : dispsumCrossoverAidyCode")
    private String dispsumCrossoverAidyCode;
    /**
     * EFC
     * <p>
     * Lineage reference object : dispsumImEfc
     * 
     */
    @JsonProperty("dispsumImEfc")
    @JsonPropertyDescription("Lineage reference object : dispsumImEfc")
    private Double dispsumImEfc;
    /**
     * Pell
     * <p>
     * Lineage reference object : dispsumPellBudgetAmt
     * 
     */
    @JsonProperty("dispsumPellBudgetAmt")
    @JsonPropertyDescription("Lineage reference object : dispsumPellBudgetAmt")
    private Double dispsumPellBudgetAmt;
    /**
     * Lineage reference object : dispsumBudgetGroupInd
     * 
     */
    @JsonProperty("dispsumBudgetGroupInd")
    @JsonPropertyDescription("Lineage reference object : dispsumBudgetGroupInd")
    private String dispsumBudgetGroupInd;
    /**
     * Budget
     * <p>
     * Lineage reference object : dispsumFmBudgetAmt
     * 
     */
    @JsonProperty("dispsumFmBudgetAmt")
    @JsonPropertyDescription("Lineage reference object : dispsumFmBudgetAmt")
    private Double dispsumFmBudgetAmt;
    /**
     * Lineage reference object : dispsumPellEfc
     * 
     */
    @JsonProperty("dispsumPellEfc")
    @JsonPropertyDescription("Lineage reference object : dispsumPellEfc")
    private Double dispsumPellEfc;
    /**
     * BBAYS Awarded
     * <p>
     * Lineage reference object : dispsumBbayAwardedInd
     * 
     */
    @JsonProperty("dispsumBbayAwardedInd")
    @JsonPropertyDescription("Lineage reference object : dispsumBbayAwardedInd")
    private String dispsumBbayAwardedInd;
    /**
     * Aid Period
     * <p>
     * Lineage reference object : dispsumAprdCode
     * 
     */
    @JsonProperty("dispsumAprdCode")
    @JsonPropertyDescription("Lineage reference object : dispsumAprdCode")
    private String dispsumAprdCode;
    /**
     * Lineage reference object : dispsumImGrossNeed
     * 
     */
    @JsonProperty("dispsumImGrossNeed")
    @JsonPropertyDescription("Lineage reference object : dispsumImGrossNeed")
    private Double dispsumImGrossNeed;
    /**
     * Pell Aid Period
     * <p>
     * Lineage reference object : dispsumAprdCodePell
     * 
     */
    @JsonProperty("dispsumAprdCodePell")
    @JsonPropertyDescription("Lineage reference object : dispsumAprdCodePell")
    private String dispsumAprdCodePell;
    /**
     * FM
     * <p>
     * Lineage reference object : dispsumFmEfc
     * 
     */
    @JsonProperty("dispsumFmEfc")
    @JsonPropertyDescription("Lineage reference object : dispsumFmEfc")
    private Double dispsumFmEfc;
    /**
     * Lineage reference object : dispsumImUnmetNeed
     * 
     */
    @JsonProperty("dispsumImUnmetNeed")
    @JsonPropertyDescription("Lineage reference object : dispsumImUnmetNeed")
    private Double dispsumImUnmetNeed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * IM
     * <p>
     * Lineage reference object : dispsumImBudgetAmt
     * 
     */
    @JsonProperty("dispsumImBudgetAmt")
    public Double getDispsumImBudgetAmt() {
        return dispsumImBudgetAmt;
    }

    /**
     * IM
     * <p>
     * Lineage reference object : dispsumImBudgetAmt
     * 
     */
    @JsonProperty("dispsumImBudgetAmt")
    public void setDispsumImBudgetAmt(Double dispsumImBudgetAmt) {
        this.dispsumImBudgetAmt = dispsumImBudgetAmt;
    }

    public Summary withDispsumImBudgetAmt(Double dispsumImBudgetAmt) {
        this.dispsumImBudgetAmt = dispsumImBudgetAmt;
        return this;
    }

    /**
     * Resource
     * <p>
     * Lineage reference object : dispsumResourceAmt
     * 
     */
    @JsonProperty("dispsumResourceAmt")
    public Double getDispsumResourceAmt() {
        return dispsumResourceAmt;
    }

    /**
     * Resource
     * <p>
     * Lineage reference object : dispsumResourceAmt
     * 
     */
    @JsonProperty("dispsumResourceAmt")
    public void setDispsumResourceAmt(Double dispsumResourceAmt) {
        this.dispsumResourceAmt = dispsumResourceAmt;
    }

    public Summary withDispsumResourceAmt(Double dispsumResourceAmt) {
        this.dispsumResourceAmt = dispsumResourceAmt;
        return this;
    }

    /**
     * Budget Group
     * <p>
     * Lineage reference object : dispsumBudgetGroup
     * 
     */
    @JsonProperty("dispsumBudgetGroup")
    public String getDispsumBudgetGroup() {
        return dispsumBudgetGroup;
    }

    /**
     * Budget Group
     * <p>
     * Lineage reference object : dispsumBudgetGroup
     * 
     */
    @JsonProperty("dispsumBudgetGroup")
    public void setDispsumBudgetGroup(String dispsumBudgetGroup) {
        this.dispsumBudgetGroup = dispsumBudgetGroup;
    }

    public Summary withDispsumBudgetGroup(String dispsumBudgetGroup) {
        this.dispsumBudgetGroup = dispsumBudgetGroup;
        return this;
    }

    /**
     * Pell Award
     * <p>
     * Lineage reference object : dispsumCrossoverPellAward
     * 
     */
    @JsonProperty("dispsumCrossoverPellAward")
    public Double getDispsumCrossoverPellAward() {
        return dispsumCrossoverPellAward;
    }

    /**
     * Pell Award
     * <p>
     * Lineage reference object : dispsumCrossoverPellAward
     * 
     */
    @JsonProperty("dispsumCrossoverPellAward")
    public void setDispsumCrossoverPellAward(Double dispsumCrossoverPellAward) {
        this.dispsumCrossoverPellAward = dispsumCrossoverPellAward;
    }

    public Summary withDispsumCrossoverPellAward(Double dispsumCrossoverPellAward) {
        this.dispsumCrossoverPellAward = dispsumCrossoverPellAward;
        return this;
    }

    /**
     * Gross Need
     * <p>
     * Lineage reference object : dispsumFmGrossNeed
     * 
     */
    @JsonProperty("dispsumFmGrossNeed")
    public Double getDispsumFmGrossNeed() {
        return dispsumFmGrossNeed;
    }

    /**
     * Gross Need
     * <p>
     * Lineage reference object : dispsumFmGrossNeed
     * 
     */
    @JsonProperty("dispsumFmGrossNeed")
    public void setDispsumFmGrossNeed(Double dispsumFmGrossNeed) {
        this.dispsumFmGrossNeed = dispsumFmGrossNeed;
    }

    public Summary withDispsumFmGrossNeed(Double dispsumFmGrossNeed) {
        this.dispsumFmGrossNeed = dispsumFmGrossNeed;
        return this;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : dispsumOfferAmt
     * 
     */
    @JsonProperty("dispsumOfferAmt")
    public Double getDispsumOfferAmt() {
        return dispsumOfferAmt;
    }

    /**
     * Offered
     * <p>
     * Lineage reference object : dispsumOfferAmt
     * 
     */
    @JsonProperty("dispsumOfferAmt")
    public void setDispsumOfferAmt(Double dispsumOfferAmt) {
        this.dispsumOfferAmt = dispsumOfferAmt;
    }

    public Summary withDispsumOfferAmt(Double dispsumOfferAmt) {
        this.dispsumOfferAmt = dispsumOfferAmt;
        return this;
    }

    /**
     * Unmet Need
     * <p>
     * Lineage reference object : dispsumFmUnmetNeed
     * 
     */
    @JsonProperty("dispsumFmUnmetNeed")
    public Double getDispsumFmUnmetNeed() {
        return dispsumFmUnmetNeed;
    }

    /**
     * Unmet Need
     * <p>
     * Lineage reference object : dispsumFmUnmetNeed
     * 
     */
    @JsonProperty("dispsumFmUnmetNeed")
    public void setDispsumFmUnmetNeed(Double dispsumFmUnmetNeed) {
        this.dispsumFmUnmetNeed = dispsumFmUnmetNeed;
    }

    public Summary withDispsumFmUnmetNeed(Double dispsumFmUnmetNeed) {
        this.dispsumFmUnmetNeed = dispsumFmUnmetNeed;
        return this;
    }

    /**
     * Crossover Aid Year
     * <p>
     * Lineage reference object : dispsumCrossoverAidyCode
     * 
     */
    @JsonProperty("dispsumCrossoverAidyCode")
    public String getDispsumCrossoverAidyCode() {
        return dispsumCrossoverAidyCode;
    }

    /**
     * Crossover Aid Year
     * <p>
     * Lineage reference object : dispsumCrossoverAidyCode
     * 
     */
    @JsonProperty("dispsumCrossoverAidyCode")
    public void setDispsumCrossoverAidyCode(String dispsumCrossoverAidyCode) {
        this.dispsumCrossoverAidyCode = dispsumCrossoverAidyCode;
    }

    public Summary withDispsumCrossoverAidyCode(String dispsumCrossoverAidyCode) {
        this.dispsumCrossoverAidyCode = dispsumCrossoverAidyCode;
        return this;
    }

    /**
     * EFC
     * <p>
     * Lineage reference object : dispsumImEfc
     * 
     */
    @JsonProperty("dispsumImEfc")
    public Double getDispsumImEfc() {
        return dispsumImEfc;
    }

    /**
     * EFC
     * <p>
     * Lineage reference object : dispsumImEfc
     * 
     */
    @JsonProperty("dispsumImEfc")
    public void setDispsumImEfc(Double dispsumImEfc) {
        this.dispsumImEfc = dispsumImEfc;
    }

    public Summary withDispsumImEfc(Double dispsumImEfc) {
        this.dispsumImEfc = dispsumImEfc;
        return this;
    }

    /**
     * Pell
     * <p>
     * Lineage reference object : dispsumPellBudgetAmt
     * 
     */
    @JsonProperty("dispsumPellBudgetAmt")
    public Double getDispsumPellBudgetAmt() {
        return dispsumPellBudgetAmt;
    }

    /**
     * Pell
     * <p>
     * Lineage reference object : dispsumPellBudgetAmt
     * 
     */
    @JsonProperty("dispsumPellBudgetAmt")
    public void setDispsumPellBudgetAmt(Double dispsumPellBudgetAmt) {
        this.dispsumPellBudgetAmt = dispsumPellBudgetAmt;
    }

    public Summary withDispsumPellBudgetAmt(Double dispsumPellBudgetAmt) {
        this.dispsumPellBudgetAmt = dispsumPellBudgetAmt;
        return this;
    }

    /**
     * Lineage reference object : dispsumBudgetGroupInd
     * 
     */
    @JsonProperty("dispsumBudgetGroupInd")
    public String getDispsumBudgetGroupInd() {
        return dispsumBudgetGroupInd;
    }

    /**
     * Lineage reference object : dispsumBudgetGroupInd
     * 
     */
    @JsonProperty("dispsumBudgetGroupInd")
    public void setDispsumBudgetGroupInd(String dispsumBudgetGroupInd) {
        this.dispsumBudgetGroupInd = dispsumBudgetGroupInd;
    }

    public Summary withDispsumBudgetGroupInd(String dispsumBudgetGroupInd) {
        this.dispsumBudgetGroupInd = dispsumBudgetGroupInd;
        return this;
    }

    /**
     * Budget
     * <p>
     * Lineage reference object : dispsumFmBudgetAmt
     * 
     */
    @JsonProperty("dispsumFmBudgetAmt")
    public Double getDispsumFmBudgetAmt() {
        return dispsumFmBudgetAmt;
    }

    /**
     * Budget
     * <p>
     * Lineage reference object : dispsumFmBudgetAmt
     * 
     */
    @JsonProperty("dispsumFmBudgetAmt")
    public void setDispsumFmBudgetAmt(Double dispsumFmBudgetAmt) {
        this.dispsumFmBudgetAmt = dispsumFmBudgetAmt;
    }

    public Summary withDispsumFmBudgetAmt(Double dispsumFmBudgetAmt) {
        this.dispsumFmBudgetAmt = dispsumFmBudgetAmt;
        return this;
    }

    /**
     * Lineage reference object : dispsumPellEfc
     * 
     */
    @JsonProperty("dispsumPellEfc")
    public Double getDispsumPellEfc() {
        return dispsumPellEfc;
    }

    /**
     * Lineage reference object : dispsumPellEfc
     * 
     */
    @JsonProperty("dispsumPellEfc")
    public void setDispsumPellEfc(Double dispsumPellEfc) {
        this.dispsumPellEfc = dispsumPellEfc;
    }

    public Summary withDispsumPellEfc(Double dispsumPellEfc) {
        this.dispsumPellEfc = dispsumPellEfc;
        return this;
    }

    /**
     * BBAYS Awarded
     * <p>
     * Lineage reference object : dispsumBbayAwardedInd
     * 
     */
    @JsonProperty("dispsumBbayAwardedInd")
    public String getDispsumBbayAwardedInd() {
        return dispsumBbayAwardedInd;
    }

    /**
     * BBAYS Awarded
     * <p>
     * Lineage reference object : dispsumBbayAwardedInd
     * 
     */
    @JsonProperty("dispsumBbayAwardedInd")
    public void setDispsumBbayAwardedInd(String dispsumBbayAwardedInd) {
        this.dispsumBbayAwardedInd = dispsumBbayAwardedInd;
    }

    public Summary withDispsumBbayAwardedInd(String dispsumBbayAwardedInd) {
        this.dispsumBbayAwardedInd = dispsumBbayAwardedInd;
        return this;
    }

    /**
     * Aid Period
     * <p>
     * Lineage reference object : dispsumAprdCode
     * 
     */
    @JsonProperty("dispsumAprdCode")
    public String getDispsumAprdCode() {
        return dispsumAprdCode;
    }

    /**
     * Aid Period
     * <p>
     * Lineage reference object : dispsumAprdCode
     * 
     */
    @JsonProperty("dispsumAprdCode")
    public void setDispsumAprdCode(String dispsumAprdCode) {
        this.dispsumAprdCode = dispsumAprdCode;
    }

    public Summary withDispsumAprdCode(String dispsumAprdCode) {
        this.dispsumAprdCode = dispsumAprdCode;
        return this;
    }

    /**
     * Lineage reference object : dispsumImGrossNeed
     * 
     */
    @JsonProperty("dispsumImGrossNeed")
    public Double getDispsumImGrossNeed() {
        return dispsumImGrossNeed;
    }

    /**
     * Lineage reference object : dispsumImGrossNeed
     * 
     */
    @JsonProperty("dispsumImGrossNeed")
    public void setDispsumImGrossNeed(Double dispsumImGrossNeed) {
        this.dispsumImGrossNeed = dispsumImGrossNeed;
    }

    public Summary withDispsumImGrossNeed(Double dispsumImGrossNeed) {
        this.dispsumImGrossNeed = dispsumImGrossNeed;
        return this;
    }

    /**
     * Pell Aid Period
     * <p>
     * Lineage reference object : dispsumAprdCodePell
     * 
     */
    @JsonProperty("dispsumAprdCodePell")
    public String getDispsumAprdCodePell() {
        return dispsumAprdCodePell;
    }

    /**
     * Pell Aid Period
     * <p>
     * Lineage reference object : dispsumAprdCodePell
     * 
     */
    @JsonProperty("dispsumAprdCodePell")
    public void setDispsumAprdCodePell(String dispsumAprdCodePell) {
        this.dispsumAprdCodePell = dispsumAprdCodePell;
    }

    public Summary withDispsumAprdCodePell(String dispsumAprdCodePell) {
        this.dispsumAprdCodePell = dispsumAprdCodePell;
        return this;
    }

    /**
     * FM
     * <p>
     * Lineage reference object : dispsumFmEfc
     * 
     */
    @JsonProperty("dispsumFmEfc")
    public Double getDispsumFmEfc() {
        return dispsumFmEfc;
    }

    /**
     * FM
     * <p>
     * Lineage reference object : dispsumFmEfc
     * 
     */
    @JsonProperty("dispsumFmEfc")
    public void setDispsumFmEfc(Double dispsumFmEfc) {
        this.dispsumFmEfc = dispsumFmEfc;
    }

    public Summary withDispsumFmEfc(Double dispsumFmEfc) {
        this.dispsumFmEfc = dispsumFmEfc;
        return this;
    }

    /**
     * Lineage reference object : dispsumImUnmetNeed
     * 
     */
    @JsonProperty("dispsumImUnmetNeed")
    public Double getDispsumImUnmetNeed() {
        return dispsumImUnmetNeed;
    }

    /**
     * Lineage reference object : dispsumImUnmetNeed
     * 
     */
    @JsonProperty("dispsumImUnmetNeed")
    public void setDispsumImUnmetNeed(Double dispsumImUnmetNeed) {
        this.dispsumImUnmetNeed = dispsumImUnmetNeed;
    }

    public Summary withDispsumImUnmetNeed(Double dispsumImUnmetNeed) {
        this.dispsumImUnmetNeed = dispsumImUnmetNeed;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Summary withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Summary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dispsumImBudgetAmt");
        sb.append('=');
        sb.append(((this.dispsumImBudgetAmt == null)?"<null>":this.dispsumImBudgetAmt));
        sb.append(',');
        sb.append("dispsumResourceAmt");
        sb.append('=');
        sb.append(((this.dispsumResourceAmt == null)?"<null>":this.dispsumResourceAmt));
        sb.append(',');
        sb.append("dispsumBudgetGroup");
        sb.append('=');
        sb.append(((this.dispsumBudgetGroup == null)?"<null>":this.dispsumBudgetGroup));
        sb.append(',');
        sb.append("dispsumCrossoverPellAward");
        sb.append('=');
        sb.append(((this.dispsumCrossoverPellAward == null)?"<null>":this.dispsumCrossoverPellAward));
        sb.append(',');
        sb.append("dispsumFmGrossNeed");
        sb.append('=');
        sb.append(((this.dispsumFmGrossNeed == null)?"<null>":this.dispsumFmGrossNeed));
        sb.append(',');
        sb.append("dispsumOfferAmt");
        sb.append('=');
        sb.append(((this.dispsumOfferAmt == null)?"<null>":this.dispsumOfferAmt));
        sb.append(',');
        sb.append("dispsumFmUnmetNeed");
        sb.append('=');
        sb.append(((this.dispsumFmUnmetNeed == null)?"<null>":this.dispsumFmUnmetNeed));
        sb.append(',');
        sb.append("dispsumCrossoverAidyCode");
        sb.append('=');
        sb.append(((this.dispsumCrossoverAidyCode == null)?"<null>":this.dispsumCrossoverAidyCode));
        sb.append(',');
        sb.append("dispsumImEfc");
        sb.append('=');
        sb.append(((this.dispsumImEfc == null)?"<null>":this.dispsumImEfc));
        sb.append(',');
        sb.append("dispsumPellBudgetAmt");
        sb.append('=');
        sb.append(((this.dispsumPellBudgetAmt == null)?"<null>":this.dispsumPellBudgetAmt));
        sb.append(',');
        sb.append("dispsumBudgetGroupInd");
        sb.append('=');
        sb.append(((this.dispsumBudgetGroupInd == null)?"<null>":this.dispsumBudgetGroupInd));
        sb.append(',');
        sb.append("dispsumFmBudgetAmt");
        sb.append('=');
        sb.append(((this.dispsumFmBudgetAmt == null)?"<null>":this.dispsumFmBudgetAmt));
        sb.append(',');
        sb.append("dispsumPellEfc");
        sb.append('=');
        sb.append(((this.dispsumPellEfc == null)?"<null>":this.dispsumPellEfc));
        sb.append(',');
        sb.append("dispsumBbayAwardedInd");
        sb.append('=');
        sb.append(((this.dispsumBbayAwardedInd == null)?"<null>":this.dispsumBbayAwardedInd));
        sb.append(',');
        sb.append("dispsumAprdCode");
        sb.append('=');
        sb.append(((this.dispsumAprdCode == null)?"<null>":this.dispsumAprdCode));
        sb.append(',');
        sb.append("dispsumImGrossNeed");
        sb.append('=');
        sb.append(((this.dispsumImGrossNeed == null)?"<null>":this.dispsumImGrossNeed));
        sb.append(',');
        sb.append("dispsumAprdCodePell");
        sb.append('=');
        sb.append(((this.dispsumAprdCodePell == null)?"<null>":this.dispsumAprdCodePell));
        sb.append(',');
        sb.append("dispsumFmEfc");
        sb.append('=');
        sb.append(((this.dispsumFmEfc == null)?"<null>":this.dispsumFmEfc));
        sb.append(',');
        sb.append("dispsumImUnmetNeed");
        sb.append('=');
        sb.append(((this.dispsumImUnmetNeed == null)?"<null>":this.dispsumImUnmetNeed));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.dispsumImBudgetAmt == null)? 0 :this.dispsumImBudgetAmt.hashCode()));
        result = ((result* 31)+((this.dispsumResourceAmt == null)? 0 :this.dispsumResourceAmt.hashCode()));
        result = ((result* 31)+((this.dispsumBudgetGroup == null)? 0 :this.dispsumBudgetGroup.hashCode()));
        result = ((result* 31)+((this.dispsumCrossoverPellAward == null)? 0 :this.dispsumCrossoverPellAward.hashCode()));
        result = ((result* 31)+((this.dispsumFmGrossNeed == null)? 0 :this.dispsumFmGrossNeed.hashCode()));
        result = ((result* 31)+((this.dispsumOfferAmt == null)? 0 :this.dispsumOfferAmt.hashCode()));
        result = ((result* 31)+((this.dispsumFmUnmetNeed == null)? 0 :this.dispsumFmUnmetNeed.hashCode()));
        result = ((result* 31)+((this.dispsumCrossoverAidyCode == null)? 0 :this.dispsumCrossoverAidyCode.hashCode()));
        result = ((result* 31)+((this.dispsumImEfc == null)? 0 :this.dispsumImEfc.hashCode()));
        result = ((result* 31)+((this.dispsumPellBudgetAmt == null)? 0 :this.dispsumPellBudgetAmt.hashCode()));
        result = ((result* 31)+((this.dispsumBudgetGroupInd == null)? 0 :this.dispsumBudgetGroupInd.hashCode()));
        result = ((result* 31)+((this.dispsumFmBudgetAmt == null)? 0 :this.dispsumFmBudgetAmt.hashCode()));
        result = ((result* 31)+((this.dispsumPellEfc == null)? 0 :this.dispsumPellEfc.hashCode()));
        result = ((result* 31)+((this.dispsumBbayAwardedInd == null)? 0 :this.dispsumBbayAwardedInd.hashCode()));
        result = ((result* 31)+((this.dispsumAprdCode == null)? 0 :this.dispsumAprdCode.hashCode()));
        result = ((result* 31)+((this.dispsumImGrossNeed == null)? 0 :this.dispsumImGrossNeed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dispsumAprdCodePell == null)? 0 :this.dispsumAprdCodePell.hashCode()));
        result = ((result* 31)+((this.dispsumFmEfc == null)? 0 :this.dispsumFmEfc.hashCode()));
        result = ((result* 31)+((this.dispsumImUnmetNeed == null)? 0 :this.dispsumImUnmetNeed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Summary) == false) {
            return false;
        }
        Summary rhs = ((Summary) other);
        return (((((((((((((((((((((this.dispsumImBudgetAmt == rhs.dispsumImBudgetAmt)||((this.dispsumImBudgetAmt!= null)&&this.dispsumImBudgetAmt.equals(rhs.dispsumImBudgetAmt)))&&((this.dispsumResourceAmt == rhs.dispsumResourceAmt)||((this.dispsumResourceAmt!= null)&&this.dispsumResourceAmt.equals(rhs.dispsumResourceAmt))))&&((this.dispsumBudgetGroup == rhs.dispsumBudgetGroup)||((this.dispsumBudgetGroup!= null)&&this.dispsumBudgetGroup.equals(rhs.dispsumBudgetGroup))))&&((this.dispsumCrossoverPellAward == rhs.dispsumCrossoverPellAward)||((this.dispsumCrossoverPellAward!= null)&&this.dispsumCrossoverPellAward.equals(rhs.dispsumCrossoverPellAward))))&&((this.dispsumFmGrossNeed == rhs.dispsumFmGrossNeed)||((this.dispsumFmGrossNeed!= null)&&this.dispsumFmGrossNeed.equals(rhs.dispsumFmGrossNeed))))&&((this.dispsumOfferAmt == rhs.dispsumOfferAmt)||((this.dispsumOfferAmt!= null)&&this.dispsumOfferAmt.equals(rhs.dispsumOfferAmt))))&&((this.dispsumFmUnmetNeed == rhs.dispsumFmUnmetNeed)||((this.dispsumFmUnmetNeed!= null)&&this.dispsumFmUnmetNeed.equals(rhs.dispsumFmUnmetNeed))))&&((this.dispsumCrossoverAidyCode == rhs.dispsumCrossoverAidyCode)||((this.dispsumCrossoverAidyCode!= null)&&this.dispsumCrossoverAidyCode.equals(rhs.dispsumCrossoverAidyCode))))&&((this.dispsumImEfc == rhs.dispsumImEfc)||((this.dispsumImEfc!= null)&&this.dispsumImEfc.equals(rhs.dispsumImEfc))))&&((this.dispsumPellBudgetAmt == rhs.dispsumPellBudgetAmt)||((this.dispsumPellBudgetAmt!= null)&&this.dispsumPellBudgetAmt.equals(rhs.dispsumPellBudgetAmt))))&&((this.dispsumBudgetGroupInd == rhs.dispsumBudgetGroupInd)||((this.dispsumBudgetGroupInd!= null)&&this.dispsumBudgetGroupInd.equals(rhs.dispsumBudgetGroupInd))))&&((this.dispsumFmBudgetAmt == rhs.dispsumFmBudgetAmt)||((this.dispsumFmBudgetAmt!= null)&&this.dispsumFmBudgetAmt.equals(rhs.dispsumFmBudgetAmt))))&&((this.dispsumPellEfc == rhs.dispsumPellEfc)||((this.dispsumPellEfc!= null)&&this.dispsumPellEfc.equals(rhs.dispsumPellEfc))))&&((this.dispsumBbayAwardedInd == rhs.dispsumBbayAwardedInd)||((this.dispsumBbayAwardedInd!= null)&&this.dispsumBbayAwardedInd.equals(rhs.dispsumBbayAwardedInd))))&&((this.dispsumAprdCode == rhs.dispsumAprdCode)||((this.dispsumAprdCode!= null)&&this.dispsumAprdCode.equals(rhs.dispsumAprdCode))))&&((this.dispsumImGrossNeed == rhs.dispsumImGrossNeed)||((this.dispsumImGrossNeed!= null)&&this.dispsumImGrossNeed.equals(rhs.dispsumImGrossNeed))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dispsumAprdCodePell == rhs.dispsumAprdCodePell)||((this.dispsumAprdCodePell!= null)&&this.dispsumAprdCodePell.equals(rhs.dispsumAprdCodePell))))&&((this.dispsumFmEfc == rhs.dispsumFmEfc)||((this.dispsumFmEfc!= null)&&this.dispsumFmEfc.equals(rhs.dispsumFmEfc))))&&((this.dispsumImUnmetNeed == rhs.dispsumImUnmetNeed)||((this.dispsumImUnmetNeed!= null)&&this.dispsumImUnmetNeed.equals(rhs.dispsumImUnmetNeed))));
    }

}
