
package com.ellucian.generated.bpapi.ban.grant_budget.v1_0_0;

import java.util.Date;
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
    "grntBudgDesc",
    "requestedAmt",
    "actvCodeDef",
    "coasCodeDef",
    "budgetCode",
    "endDate",
    "coasCode",
    "displayBudgetDurationMonths",
    "maxFundingAmt",
    "acciCodeDef",
    "displayPropBudgetTitle",
    "locnCodeDef",
    "orgnCodeDef",
    "propCode",
    "reversalInd",
    "typeCode",
    "begDate",
    "subDate",
    "transDate",
    "yr",
    "displayPropTitle",
    "fundCodeDef",
    "progCodeDef"
})
@Generated("jsonschema2pojo")
public class GrantBudget100GetResponse {

    /**
     * Budget Description
     * <p>
     * Lineage reference object : FRBBUDG_GRNT_BUDG_DESC
     * (Required)
     * 
     */
    @JsonProperty("grntBudgDesc")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_GRNT_BUDG_DESC")
    private String grntBudgDesc;
    /**
     * Total Requested Amount
     * <p>
     * Lineage reference object : FRBBUDG_REQUESTED_AMT
     * 
     */
    @JsonProperty("requestedAmt")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_REQUESTED_AMT")
    private Double requestedAmt;
    /**
     * Activity
     * <p>
     * Lineage reference object : FRBBUDG_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_ACTV_CODE_DEF")
    private String actvCodeDef;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE_DEF, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_COAS_CODE_DEF, Lookup lineage reference object : ftvcoas")
    private String coasCodeDef;
    /**
     * Budget Code
     * <p>
     * Lineage reference object : FRBBUDG_BUDGET_CODE
     * 
     */
    @JsonProperty("budgetCode")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_BUDGET_CODE")
    private String budgetCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : FRBBUDG_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_END_DATE")
    private Date endDate;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Duration
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBudgetDurationMonths")
    private Double displayBudgetDurationMonths;
    /**
     * Maximum Funded Amount
     * <p>
     * Lineage reference object : FRBBUDG_MAX_FUNDING_AMT
     * 
     */
    @JsonProperty("maxFundingAmt")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_MAX_FUNDING_AMT")
    private Double maxFundingAmt;
    /**
     * Index
     * <p>
     * Lineage reference object : FRBBUDG_ACCI_CODE_DEF, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_ACCI_CODE_DEF, Lookup lineage reference object : ftvacci")
    private String acciCodeDef;
    @JsonProperty("displayPropBudgetTitle")
    private String displayPropBudgetTitle;
    /**
     * Location
     * <p>
     * Lineage reference object : FRBBUDG_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_LOCN_CODE_DEF")
    private String locnCodeDef;
    /**
     * Organization
     * <p>
     * Lineage reference object : FRBBUDG_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("orgnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_ORGN_CODE_DEF")
    private String orgnCodeDef;
    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBBUDG_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_PROP_CODE")
    private String propCode;
    /**
     * Reversal
     * <p>
     * Lineage reference object : FRBBUDG_REVERSAL_IND
     * 
     */
    @JsonProperty("reversalInd")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_REVERSAL_IND")
    private String reversalInd;
    /**
     * Type
     * <p>
     * Lineage reference object : FRBBUDG_TYPE_CODE
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_TYPE_CODE")
    private String typeCode;
    /**
     * Budget Begin Date
     * <p>
     * Lineage reference object : FRBBUDG_BEG_DATE
     * (Required)
     * 
     */
    @JsonProperty("begDate")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_BEG_DATE")
    private Date begDate;
    /**
     * Submission Date
     * <p>
     * Lineage reference object : FRBBUDG_SUB_DATE
     * 
     */
    @JsonProperty("subDate")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_SUB_DATE")
    private Date subDate;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FRBBUDG_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_TRANS_DATE")
    private Date transDate;
    /**
     * Year
     * <p>
     * Lineage reference object : FRBBUDG_YR
     * 
     */
    @JsonProperty("yr")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_YR")
    private String yr;
    @JsonProperty("displayPropTitle")
    private String displayPropTitle;
    /**
     * Fund
     * <p>
     * Lineage reference object : FRBBUDG_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_FUND_CODE_DEF")
    private String fundCodeDef;
    /**
     * Program
     * <p>
     * Lineage reference object : FRBBUDG_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    @JsonPropertyDescription("Lineage reference object : FRBBUDG_PROG_CODE_DEF")
    private String progCodeDef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Budget Description
     * <p>
     * Lineage reference object : FRBBUDG_GRNT_BUDG_DESC
     * (Required)
     * 
     */
    @JsonProperty("grntBudgDesc")
    public String getGrntBudgDesc() {
        return grntBudgDesc;
    }

    /**
     * Budget Description
     * <p>
     * Lineage reference object : FRBBUDG_GRNT_BUDG_DESC
     * (Required)
     * 
     */
    @JsonProperty("grntBudgDesc")
    public void setGrntBudgDesc(String grntBudgDesc) {
        this.grntBudgDesc = grntBudgDesc;
    }

    public GrantBudget100GetResponse withGrntBudgDesc(String grntBudgDesc) {
        this.grntBudgDesc = grntBudgDesc;
        return this;
    }

    /**
     * Total Requested Amount
     * <p>
     * Lineage reference object : FRBBUDG_REQUESTED_AMT
     * 
     */
    @JsonProperty("requestedAmt")
    public Double getRequestedAmt() {
        return requestedAmt;
    }

    /**
     * Total Requested Amount
     * <p>
     * Lineage reference object : FRBBUDG_REQUESTED_AMT
     * 
     */
    @JsonProperty("requestedAmt")
    public void setRequestedAmt(Double requestedAmt) {
        this.requestedAmt = requestedAmt;
    }

    public GrantBudget100GetResponse withRequestedAmt(Double requestedAmt) {
        this.requestedAmt = requestedAmt;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FRBBUDG_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    public String getActvCodeDef() {
        return actvCodeDef;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FRBBUDG_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    public void setActvCodeDef(String actvCodeDef) {
        this.actvCodeDef = actvCodeDef;
    }

    public GrantBudget100GetResponse withActvCodeDef(String actvCodeDef) {
        this.actvCodeDef = actvCodeDef;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE_DEF, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeDef")
    public String getCoasCodeDef() {
        return coasCodeDef;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE_DEF, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeDef")
    public void setCoasCodeDef(String coasCodeDef) {
        this.coasCodeDef = coasCodeDef;
    }

    public GrantBudget100GetResponse withCoasCodeDef(String coasCodeDef) {
        this.coasCodeDef = coasCodeDef;
        return this;
    }

    /**
     * Budget Code
     * <p>
     * Lineage reference object : FRBBUDG_BUDGET_CODE
     * 
     */
    @JsonProperty("budgetCode")
    public String getBudgetCode() {
        return budgetCode;
    }

    /**
     * Budget Code
     * <p>
     * Lineage reference object : FRBBUDG_BUDGET_CODE
     * 
     */
    @JsonProperty("budgetCode")
    public void setBudgetCode(String budgetCode) {
        this.budgetCode = budgetCode;
    }

    public GrantBudget100GetResponse withBudgetCode(String budgetCode) {
        this.budgetCode = budgetCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FRBBUDG_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FRBBUDG_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public GrantBudget100GetResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FRBBUDG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public GrantBudget100GetResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Duration
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBudgetDurationMonths")
    public Double getDisplayBudgetDurationMonths() {
        return displayBudgetDurationMonths;
    }

    /**
     * Duration
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBudgetDurationMonths")
    public void setDisplayBudgetDurationMonths(Double displayBudgetDurationMonths) {
        this.displayBudgetDurationMonths = displayBudgetDurationMonths;
    }

    public GrantBudget100GetResponse withDisplayBudgetDurationMonths(Double displayBudgetDurationMonths) {
        this.displayBudgetDurationMonths = displayBudgetDurationMonths;
        return this;
    }

    /**
     * Maximum Funded Amount
     * <p>
     * Lineage reference object : FRBBUDG_MAX_FUNDING_AMT
     * 
     */
    @JsonProperty("maxFundingAmt")
    public Double getMaxFundingAmt() {
        return maxFundingAmt;
    }

    /**
     * Maximum Funded Amount
     * <p>
     * Lineage reference object : FRBBUDG_MAX_FUNDING_AMT
     * 
     */
    @JsonProperty("maxFundingAmt")
    public void setMaxFundingAmt(Double maxFundingAmt) {
        this.maxFundingAmt = maxFundingAmt;
    }

    public GrantBudget100GetResponse withMaxFundingAmt(Double maxFundingAmt) {
        this.maxFundingAmt = maxFundingAmt;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FRBBUDG_ACCI_CODE_DEF, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCodeDef")
    public String getAcciCodeDef() {
        return acciCodeDef;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FRBBUDG_ACCI_CODE_DEF, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCodeDef")
    public void setAcciCodeDef(String acciCodeDef) {
        this.acciCodeDef = acciCodeDef;
    }

    public GrantBudget100GetResponse withAcciCodeDef(String acciCodeDef) {
        this.acciCodeDef = acciCodeDef;
        return this;
    }

    @JsonProperty("displayPropBudgetTitle")
    public String getDisplayPropBudgetTitle() {
        return displayPropBudgetTitle;
    }

    @JsonProperty("displayPropBudgetTitle")
    public void setDisplayPropBudgetTitle(String displayPropBudgetTitle) {
        this.displayPropBudgetTitle = displayPropBudgetTitle;
    }

    public GrantBudget100GetResponse withDisplayPropBudgetTitle(String displayPropBudgetTitle) {
        this.displayPropBudgetTitle = displayPropBudgetTitle;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FRBBUDG_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    public String getLocnCodeDef() {
        return locnCodeDef;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FRBBUDG_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    public void setLocnCodeDef(String locnCodeDef) {
        this.locnCodeDef = locnCodeDef;
    }

    public GrantBudget100GetResponse withLocnCodeDef(String locnCodeDef) {
        this.locnCodeDef = locnCodeDef;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FRBBUDG_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("orgnCodeDef")
    public String getOrgnCodeDef() {
        return orgnCodeDef;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FRBBUDG_ORGN_CODE_DEF
     * 
     */
    @JsonProperty("orgnCodeDef")
    public void setOrgnCodeDef(String orgnCodeDef) {
        this.orgnCodeDef = orgnCodeDef;
    }

    public GrantBudget100GetResponse withOrgnCodeDef(String orgnCodeDef) {
        this.orgnCodeDef = orgnCodeDef;
        return this;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBBUDG_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    public String getPropCode() {
        return propCode;
    }

    /**
     * Proposal
     * <p>
     * Lineage reference object : FRBBUDG_PROP_CODE
     * 
     */
    @JsonProperty("propCode")
    public void setPropCode(String propCode) {
        this.propCode = propCode;
    }

    public GrantBudget100GetResponse withPropCode(String propCode) {
        this.propCode = propCode;
        return this;
    }

    /**
     * Reversal
     * <p>
     * Lineage reference object : FRBBUDG_REVERSAL_IND
     * 
     */
    @JsonProperty("reversalInd")
    public String getReversalInd() {
        return reversalInd;
    }

    /**
     * Reversal
     * <p>
     * Lineage reference object : FRBBUDG_REVERSAL_IND
     * 
     */
    @JsonProperty("reversalInd")
    public void setReversalInd(String reversalInd) {
        this.reversalInd = reversalInd;
    }

    public GrantBudget100GetResponse withReversalInd(String reversalInd) {
        this.reversalInd = reversalInd;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FRBBUDG_TYPE_CODE
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FRBBUDG_TYPE_CODE
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public GrantBudget100GetResponse withTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }

    /**
     * Budget Begin Date
     * <p>
     * Lineage reference object : FRBBUDG_BEG_DATE
     * (Required)
     * 
     */
    @JsonProperty("begDate")
    public Date getBegDate() {
        return begDate;
    }

    /**
     * Budget Begin Date
     * <p>
     * Lineage reference object : FRBBUDG_BEG_DATE
     * (Required)
     * 
     */
    @JsonProperty("begDate")
    public void setBegDate(Date begDate) {
        this.begDate = begDate;
    }

    public GrantBudget100GetResponse withBegDate(Date begDate) {
        this.begDate = begDate;
        return this;
    }

    /**
     * Submission Date
     * <p>
     * Lineage reference object : FRBBUDG_SUB_DATE
     * 
     */
    @JsonProperty("subDate")
    public Date getSubDate() {
        return subDate;
    }

    /**
     * Submission Date
     * <p>
     * Lineage reference object : FRBBUDG_SUB_DATE
     * 
     */
    @JsonProperty("subDate")
    public void setSubDate(Date subDate) {
        this.subDate = subDate;
    }

    public GrantBudget100GetResponse withSubDate(Date subDate) {
        this.subDate = subDate;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FRBBUDG_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FRBBUDG_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public GrantBudget100GetResponse withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : FRBBUDG_YR
     * 
     */
    @JsonProperty("yr")
    public String getYr() {
        return yr;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : FRBBUDG_YR
     * 
     */
    @JsonProperty("yr")
    public void setYr(String yr) {
        this.yr = yr;
    }

    public GrantBudget100GetResponse withYr(String yr) {
        this.yr = yr;
        return this;
    }

    @JsonProperty("displayPropTitle")
    public String getDisplayPropTitle() {
        return displayPropTitle;
    }

    @JsonProperty("displayPropTitle")
    public void setDisplayPropTitle(String displayPropTitle) {
        this.displayPropTitle = displayPropTitle;
    }

    public GrantBudget100GetResponse withDisplayPropTitle(String displayPropTitle) {
        this.displayPropTitle = displayPropTitle;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FRBBUDG_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    public String getFundCodeDef() {
        return fundCodeDef;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FRBBUDG_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    public void setFundCodeDef(String fundCodeDef) {
        this.fundCodeDef = fundCodeDef;
    }

    public GrantBudget100GetResponse withFundCodeDef(String fundCodeDef) {
        this.fundCodeDef = fundCodeDef;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FRBBUDG_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    public String getProgCodeDef() {
        return progCodeDef;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FRBBUDG_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    public void setProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
    }

    public GrantBudget100GetResponse withProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
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

    public GrantBudget100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantBudget100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grntBudgDesc");
        sb.append('=');
        sb.append(((this.grntBudgDesc == null)?"<null>":this.grntBudgDesc));
        sb.append(',');
        sb.append("requestedAmt");
        sb.append('=');
        sb.append(((this.requestedAmt == null)?"<null>":this.requestedAmt));
        sb.append(',');
        sb.append("actvCodeDef");
        sb.append('=');
        sb.append(((this.actvCodeDef == null)?"<null>":this.actvCodeDef));
        sb.append(',');
        sb.append("coasCodeDef");
        sb.append('=');
        sb.append(((this.coasCodeDef == null)?"<null>":this.coasCodeDef));
        sb.append(',');
        sb.append("budgetCode");
        sb.append('=');
        sb.append(((this.budgetCode == null)?"<null>":this.budgetCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("displayBudgetDurationMonths");
        sb.append('=');
        sb.append(((this.displayBudgetDurationMonths == null)?"<null>":this.displayBudgetDurationMonths));
        sb.append(',');
        sb.append("maxFundingAmt");
        sb.append('=');
        sb.append(((this.maxFundingAmt == null)?"<null>":this.maxFundingAmt));
        sb.append(',');
        sb.append("acciCodeDef");
        sb.append('=');
        sb.append(((this.acciCodeDef == null)?"<null>":this.acciCodeDef));
        sb.append(',');
        sb.append("displayPropBudgetTitle");
        sb.append('=');
        sb.append(((this.displayPropBudgetTitle == null)?"<null>":this.displayPropBudgetTitle));
        sb.append(',');
        sb.append("locnCodeDef");
        sb.append('=');
        sb.append(((this.locnCodeDef == null)?"<null>":this.locnCodeDef));
        sb.append(',');
        sb.append("orgnCodeDef");
        sb.append('=');
        sb.append(((this.orgnCodeDef == null)?"<null>":this.orgnCodeDef));
        sb.append(',');
        sb.append("propCode");
        sb.append('=');
        sb.append(((this.propCode == null)?"<null>":this.propCode));
        sb.append(',');
        sb.append("reversalInd");
        sb.append('=');
        sb.append(((this.reversalInd == null)?"<null>":this.reversalInd));
        sb.append(',');
        sb.append("typeCode");
        sb.append('=');
        sb.append(((this.typeCode == null)?"<null>":this.typeCode));
        sb.append(',');
        sb.append("begDate");
        sb.append('=');
        sb.append(((this.begDate == null)?"<null>":this.begDate));
        sb.append(',');
        sb.append("subDate");
        sb.append('=');
        sb.append(((this.subDate == null)?"<null>":this.subDate));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("yr");
        sb.append('=');
        sb.append(((this.yr == null)?"<null>":this.yr));
        sb.append(',');
        sb.append("displayPropTitle");
        sb.append('=');
        sb.append(((this.displayPropTitle == null)?"<null>":this.displayPropTitle));
        sb.append(',');
        sb.append("fundCodeDef");
        sb.append('=');
        sb.append(((this.fundCodeDef == null)?"<null>":this.fundCodeDef));
        sb.append(',');
        sb.append("progCodeDef");
        sb.append('=');
        sb.append(((this.progCodeDef == null)?"<null>":this.progCodeDef));
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
        result = ((result* 31)+((this.grntBudgDesc == null)? 0 :this.grntBudgDesc.hashCode()));
        result = ((result* 31)+((this.requestedAmt == null)? 0 :this.requestedAmt.hashCode()));
        result = ((result* 31)+((this.budgetCode == null)? 0 :this.budgetCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.displayBudgetDurationMonths == null)? 0 :this.displayBudgetDurationMonths.hashCode()));
        result = ((result* 31)+((this.maxFundingAmt == null)? 0 :this.maxFundingAmt.hashCode()));
        result = ((result* 31)+((this.acciCodeDef == null)? 0 :this.acciCodeDef.hashCode()));
        result = ((result* 31)+((this.propCode == null)? 0 :this.propCode.hashCode()));
        result = ((result* 31)+((this.reversalInd == null)? 0 :this.reversalInd.hashCode()));
        result = ((result* 31)+((this.begDate == null)? 0 :this.begDate.hashCode()));
        result = ((result* 31)+((this.subDate == null)? 0 :this.subDate.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.yr == null)? 0 :this.yr.hashCode()));
        result = ((result* 31)+((this.actvCodeDef == null)? 0 :this.actvCodeDef.hashCode()));
        result = ((result* 31)+((this.coasCodeDef == null)? 0 :this.coasCodeDef.hashCode()));
        result = ((result* 31)+((this.displayPropBudgetTitle == null)? 0 :this.displayPropBudgetTitle.hashCode()));
        result = ((result* 31)+((this.locnCodeDef == null)? 0 :this.locnCodeDef.hashCode()));
        result = ((result* 31)+((this.orgnCodeDef == null)? 0 :this.orgnCodeDef.hashCode()));
        result = ((result* 31)+((this.typeCode == null)? 0 :this.typeCode.hashCode()));
        result = ((result* 31)+((this.displayPropTitle == null)? 0 :this.displayPropTitle.hashCode()));
        result = ((result* 31)+((this.fundCodeDef == null)? 0 :this.fundCodeDef.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.progCodeDef == null)? 0 :this.progCodeDef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantBudget100GetResponse) == false) {
            return false;
        }
        GrantBudget100GetResponse rhs = ((GrantBudget100GetResponse) other);
        return (((((((((((((((((((((((((this.grntBudgDesc == rhs.grntBudgDesc)||((this.grntBudgDesc!= null)&&this.grntBudgDesc.equals(rhs.grntBudgDesc)))&&((this.requestedAmt == rhs.requestedAmt)||((this.requestedAmt!= null)&&this.requestedAmt.equals(rhs.requestedAmt))))&&((this.budgetCode == rhs.budgetCode)||((this.budgetCode!= null)&&this.budgetCode.equals(rhs.budgetCode))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.displayBudgetDurationMonths == rhs.displayBudgetDurationMonths)||((this.displayBudgetDurationMonths!= null)&&this.displayBudgetDurationMonths.equals(rhs.displayBudgetDurationMonths))))&&((this.maxFundingAmt == rhs.maxFundingAmt)||((this.maxFundingAmt!= null)&&this.maxFundingAmt.equals(rhs.maxFundingAmt))))&&((this.acciCodeDef == rhs.acciCodeDef)||((this.acciCodeDef!= null)&&this.acciCodeDef.equals(rhs.acciCodeDef))))&&((this.propCode == rhs.propCode)||((this.propCode!= null)&&this.propCode.equals(rhs.propCode))))&&((this.reversalInd == rhs.reversalInd)||((this.reversalInd!= null)&&this.reversalInd.equals(rhs.reversalInd))))&&((this.begDate == rhs.begDate)||((this.begDate!= null)&&this.begDate.equals(rhs.begDate))))&&((this.subDate == rhs.subDate)||((this.subDate!= null)&&this.subDate.equals(rhs.subDate))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.yr == rhs.yr)||((this.yr!= null)&&this.yr.equals(rhs.yr))))&&((this.actvCodeDef == rhs.actvCodeDef)||((this.actvCodeDef!= null)&&this.actvCodeDef.equals(rhs.actvCodeDef))))&&((this.coasCodeDef == rhs.coasCodeDef)||((this.coasCodeDef!= null)&&this.coasCodeDef.equals(rhs.coasCodeDef))))&&((this.displayPropBudgetTitle == rhs.displayPropBudgetTitle)||((this.displayPropBudgetTitle!= null)&&this.displayPropBudgetTitle.equals(rhs.displayPropBudgetTitle))))&&((this.locnCodeDef == rhs.locnCodeDef)||((this.locnCodeDef!= null)&&this.locnCodeDef.equals(rhs.locnCodeDef))))&&((this.orgnCodeDef == rhs.orgnCodeDef)||((this.orgnCodeDef!= null)&&this.orgnCodeDef.equals(rhs.orgnCodeDef))))&&((this.typeCode == rhs.typeCode)||((this.typeCode!= null)&&this.typeCode.equals(rhs.typeCode))))&&((this.displayPropTitle == rhs.displayPropTitle)||((this.displayPropTitle!= null)&&this.displayPropTitle.equals(rhs.displayPropTitle))))&&((this.fundCodeDef == rhs.fundCodeDef)||((this.fundCodeDef!= null)&&this.fundCodeDef.equals(rhs.fundCodeDef))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.progCodeDef == rhs.progCodeDef)||((this.progCodeDef!= null)&&this.progCodeDef.equals(rhs.progCodeDef))));
    }

}
