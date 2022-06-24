
package com.ellucian.generated.bpapi.ban.commodity_maintenance.v1_0_0;

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
    "criteria.activityDate",
    "tgrpCode",
    "taxOverrideInd",
    "coasCode",
    "criteria.desc",
    "criteria.termDate",
    "effDate",
    "amstInd",
    "criteria.coasCode",
    "stockInd",
    "criteria.effDate",
    "estLifeYears",
    "criteria.acctCode",
    "criteria.commCodePred",
    "criteria.uomsCode",
    "criteria.taxOverrideInd",
    "acctCode",
    "criteria.amstInd",
    "criteria.estLifeYears",
    "displayCommCode",
    "criteria.tgrpCode",
    "commCodePred",
    "termDate",
    "criteria.stockInd",
    "desc",
    "uomsCode"
})
@Generated("jsonschema2pojo")
public class CommodityMaintenance100PutRequest {

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOMM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Tax Group
     * <p>
     * Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCode;
    /**
     * Override Taxes
     * <p>
     * Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND
     * 
     */
    @JsonProperty("taxOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND")
    private String taxOverrideInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Commodity Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_DESC")
    private String criteriaDesc;
    /**
     * End Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_EFF_DATE")
    private Date effDate;
    /**
     * Fixed Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("amstInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_AMST_IND")
    private String amstInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Stock Item
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("stockInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_STOCK_IND")
    private String stockInd;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Useful Life
     * <p>
     * Lineage reference object : FTVCOMM_EST_LIFE_YEARS
     * 
     */
    @JsonProperty("estLifeYears")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_EST_LIFE_YEARS")
    private Double estLifeYears;
    /**
     * Accounts
     * <p>
     * Lineage reference object : FTRCOMM_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCode")
    @JsonPropertyDescription("Lineage reference object : FTRCOMM_ACCT_CODE")
    private String criteriaAcctCode;
    /**
     * Predecessor Commodity
     * <p>
     * Lineage reference object : FTVCOMM_COMM_CODE_PRED
     * 
     */
    @JsonProperty("criteria.commCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_COMM_CODE_PRED")
    private String criteriaCommCodePred;
    /**
     * Unit of Measure Code
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * (Required)
     * 
     */
    @JsonProperty("criteria.uomsCode")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms")
    private String criteriaUomsCode;
    /**
     * Override Taxes
     * <p>
     * Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.taxOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND")
    private String criteriaTaxOverrideInd;
    /**
     * Accounts
     * <p>
     * Lineage reference object : FTRCOMM_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FTRCOMM_ACCT_CODE")
    private String acctCode;
    /**
     * Fixed Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("criteria.amstInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_AMST_IND")
    private String criteriaAmstInd;
    /**
     * Useful Life
     * <p>
     * Lineage reference object : FTVCOMM_EST_LIFE_YEARS
     * 
     */
    @JsonProperty("criteria.estLifeYears")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_EST_LIFE_YEARS")
    private Double criteriaEstLifeYears;
    /**
     * Commodity Code
     * <p>
     * Lineage reference object : displayCommCode
     * 
     */
    @JsonProperty("displayCommCode")
    @JsonPropertyDescription("Lineage reference object : displayCommCode")
    private String displayCommCode;
    /**
     * Tax Group
     * <p>
     * Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("criteria.tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String criteriaTgrpCode;
    /**
     * Predecessor Commodity
     * <p>
     * Lineage reference object : FTVCOMM_COMM_CODE_PRED
     * 
     */
    @JsonProperty("commCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_COMM_CODE_PRED")
    private String commCodePred;
    /**
     * End Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TERM_DATE")
    private Date termDate;
    /**
     * Stock Item
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("criteria.stockInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_STOCK_IND")
    private String criteriaStockInd;
    /**
     * Commodity Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_DESC")
    private String desc;
    /**
     * Unit of Measure Code
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * (Required)
     * 
     */
    @JsonProperty("uomsCode")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms")
    private String uomsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOMM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOMM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public CommodityMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public CommodityMaintenance100PutRequest withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * Override Taxes
     * <p>
     * Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND
     * 
     */
    @JsonProperty("taxOverrideInd")
    public String getTaxOverrideInd() {
        return taxOverrideInd;
    }

    /**
     * Override Taxes
     * <p>
     * Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND
     * 
     */
    @JsonProperty("taxOverrideInd")
    public void setTaxOverrideInd(String taxOverrideInd) {
        this.taxOverrideInd = taxOverrideInd;
    }

    public CommodityMaintenance100PutRequest withTaxOverrideInd(String taxOverrideInd) {
        this.taxOverrideInd = taxOverrideInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public CommodityMaintenance100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Commodity Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Commodity Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public CommodityMaintenance100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public CommodityMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public CommodityMaintenance100PutRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Fixed Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("amstInd")
    public String getAmstInd() {
        return amstInd;
    }

    /**
     * Fixed Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("amstInd")
    public void setAmstInd(String amstInd) {
        this.amstInd = amstInd;
    }

    public CommodityMaintenance100PutRequest withAmstInd(String amstInd) {
        this.amstInd = amstInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTRCOMM_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public CommodityMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Stock Item
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("stockInd")
    public String getStockInd() {
        return stockInd;
    }

    /**
     * Stock Item
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("stockInd")
    public void setStockInd(String stockInd) {
        this.stockInd = stockInd;
    }

    public CommodityMaintenance100PutRequest withStockInd(String stockInd) {
        this.stockInd = stockInd;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public CommodityMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Useful Life
     * <p>
     * Lineage reference object : FTVCOMM_EST_LIFE_YEARS
     * 
     */
    @JsonProperty("estLifeYears")
    public Double getEstLifeYears() {
        return estLifeYears;
    }

    /**
     * Useful Life
     * <p>
     * Lineage reference object : FTVCOMM_EST_LIFE_YEARS
     * 
     */
    @JsonProperty("estLifeYears")
    public void setEstLifeYears(Double estLifeYears) {
        this.estLifeYears = estLifeYears;
    }

    public CommodityMaintenance100PutRequest withEstLifeYears(Double estLifeYears) {
        this.estLifeYears = estLifeYears;
        return this;
    }

    /**
     * Accounts
     * <p>
     * Lineage reference object : FTRCOMM_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCode")
    public String getCriteriaAcctCode() {
        return criteriaAcctCode;
    }

    /**
     * Accounts
     * <p>
     * Lineage reference object : FTRCOMM_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.acctCode")
    public void setCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
    }

    public CommodityMaintenance100PutRequest withCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
        return this;
    }

    /**
     * Predecessor Commodity
     * <p>
     * Lineage reference object : FTVCOMM_COMM_CODE_PRED
     * 
     */
    @JsonProperty("criteria.commCodePred")
    public String getCriteriaCommCodePred() {
        return criteriaCommCodePred;
    }

    /**
     * Predecessor Commodity
     * <p>
     * Lineage reference object : FTVCOMM_COMM_CODE_PRED
     * 
     */
    @JsonProperty("criteria.commCodePred")
    public void setCriteriaCommCodePred(String criteriaCommCodePred) {
        this.criteriaCommCodePred = criteriaCommCodePred;
    }

    public CommodityMaintenance100PutRequest withCriteriaCommCodePred(String criteriaCommCodePred) {
        this.criteriaCommCodePred = criteriaCommCodePred;
        return this;
    }

    /**
     * Unit of Measure Code
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * (Required)
     * 
     */
    @JsonProperty("criteria.uomsCode")
    public String getCriteriaUomsCode() {
        return criteriaUomsCode;
    }

    /**
     * Unit of Measure Code
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * (Required)
     * 
     */
    @JsonProperty("criteria.uomsCode")
    public void setCriteriaUomsCode(String criteriaUomsCode) {
        this.criteriaUomsCode = criteriaUomsCode;
    }

    public CommodityMaintenance100PutRequest withCriteriaUomsCode(String criteriaUomsCode) {
        this.criteriaUomsCode = criteriaUomsCode;
        return this;
    }

    /**
     * Override Taxes
     * <p>
     * Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.taxOverrideInd")
    public String getCriteriaTaxOverrideInd() {
        return criteriaTaxOverrideInd;
    }

    /**
     * Override Taxes
     * <p>
     * Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND
     * 
     */
    @JsonProperty("criteria.taxOverrideInd")
    public void setCriteriaTaxOverrideInd(String criteriaTaxOverrideInd) {
        this.criteriaTaxOverrideInd = criteriaTaxOverrideInd;
    }

    public CommodityMaintenance100PutRequest withCriteriaTaxOverrideInd(String criteriaTaxOverrideInd) {
        this.criteriaTaxOverrideInd = criteriaTaxOverrideInd;
        return this;
    }

    /**
     * Accounts
     * <p>
     * Lineage reference object : FTRCOMM_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Accounts
     * <p>
     * Lineage reference object : FTRCOMM_ACCT_CODE
     * (Required)
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public CommodityMaintenance100PutRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Fixed Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("criteria.amstInd")
    public String getCriteriaAmstInd() {
        return criteriaAmstInd;
    }

    /**
     * Fixed Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("criteria.amstInd")
    public void setCriteriaAmstInd(String criteriaAmstInd) {
        this.criteriaAmstInd = criteriaAmstInd;
    }

    public CommodityMaintenance100PutRequest withCriteriaAmstInd(String criteriaAmstInd) {
        this.criteriaAmstInd = criteriaAmstInd;
        return this;
    }

    /**
     * Useful Life
     * <p>
     * Lineage reference object : FTVCOMM_EST_LIFE_YEARS
     * 
     */
    @JsonProperty("criteria.estLifeYears")
    public Double getCriteriaEstLifeYears() {
        return criteriaEstLifeYears;
    }

    /**
     * Useful Life
     * <p>
     * Lineage reference object : FTVCOMM_EST_LIFE_YEARS
     * 
     */
    @JsonProperty("criteria.estLifeYears")
    public void setCriteriaEstLifeYears(Double criteriaEstLifeYears) {
        this.criteriaEstLifeYears = criteriaEstLifeYears;
    }

    public CommodityMaintenance100PutRequest withCriteriaEstLifeYears(Double criteriaEstLifeYears) {
        this.criteriaEstLifeYears = criteriaEstLifeYears;
        return this;
    }

    /**
     * Commodity Code
     * <p>
     * Lineage reference object : displayCommCode
     * 
     */
    @JsonProperty("displayCommCode")
    public String getDisplayCommCode() {
        return displayCommCode;
    }

    /**
     * Commodity Code
     * <p>
     * Lineage reference object : displayCommCode
     * 
     */
    @JsonProperty("displayCommCode")
    public void setDisplayCommCode(String displayCommCode) {
        this.displayCommCode = displayCommCode;
    }

    public CommodityMaintenance100PutRequest withDisplayCommCode(String displayCommCode) {
        this.displayCommCode = displayCommCode;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("criteria.tgrpCode")
    public String getCriteriaTgrpCode() {
        return criteriaTgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("criteria.tgrpCode")
    public void setCriteriaTgrpCode(String criteriaTgrpCode) {
        this.criteriaTgrpCode = criteriaTgrpCode;
    }

    public CommodityMaintenance100PutRequest withCriteriaTgrpCode(String criteriaTgrpCode) {
        this.criteriaTgrpCode = criteriaTgrpCode;
        return this;
    }

    /**
     * Predecessor Commodity
     * <p>
     * Lineage reference object : FTVCOMM_COMM_CODE_PRED
     * 
     */
    @JsonProperty("commCodePred")
    public String getCommCodePred() {
        return commCodePred;
    }

    /**
     * Predecessor Commodity
     * <p>
     * Lineage reference object : FTVCOMM_COMM_CODE_PRED
     * 
     */
    @JsonProperty("commCodePred")
    public void setCommCodePred(String commCodePred) {
        this.commCodePred = commCodePred;
    }

    public CommodityMaintenance100PutRequest withCommCodePred(String commCodePred) {
        this.commCodePred = commCodePred;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public CommodityMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Stock Item
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("criteria.stockInd")
    public String getCriteriaStockInd() {
        return criteriaStockInd;
    }

    /**
     * Stock Item
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("criteria.stockInd")
    public void setCriteriaStockInd(String criteriaStockInd) {
        this.criteriaStockInd = criteriaStockInd;
    }

    public CommodityMaintenance100PutRequest withCriteriaStockInd(String criteriaStockInd) {
        this.criteriaStockInd = criteriaStockInd;
        return this;
    }

    /**
     * Commodity Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Commodity Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CommodityMaintenance100PutRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Unit of Measure Code
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * (Required)
     * 
     */
    @JsonProperty("uomsCode")
    public String getUomsCode() {
        return uomsCode;
    }

    /**
     * Unit of Measure Code
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * (Required)
     * 
     */
    @JsonProperty("uomsCode")
    public void setUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
    }

    public CommodityMaintenance100PutRequest withUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
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

    public CommodityMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommodityMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("taxOverrideInd");
        sb.append('=');
        sb.append(((this.taxOverrideInd == null)?"<null>":this.taxOverrideInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("amstInd");
        sb.append('=');
        sb.append(((this.amstInd == null)?"<null>":this.amstInd));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("stockInd");
        sb.append('=');
        sb.append(((this.stockInd == null)?"<null>":this.stockInd));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("estLifeYears");
        sb.append('=');
        sb.append(((this.estLifeYears == null)?"<null>":this.estLifeYears));
        sb.append(',');
        sb.append("criteriaAcctCode");
        sb.append('=');
        sb.append(((this.criteriaAcctCode == null)?"<null>":this.criteriaAcctCode));
        sb.append(',');
        sb.append("criteriaCommCodePred");
        sb.append('=');
        sb.append(((this.criteriaCommCodePred == null)?"<null>":this.criteriaCommCodePred));
        sb.append(',');
        sb.append("criteriaUomsCode");
        sb.append('=');
        sb.append(((this.criteriaUomsCode == null)?"<null>":this.criteriaUomsCode));
        sb.append(',');
        sb.append("criteriaTaxOverrideInd");
        sb.append('=');
        sb.append(((this.criteriaTaxOverrideInd == null)?"<null>":this.criteriaTaxOverrideInd));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("criteriaAmstInd");
        sb.append('=');
        sb.append(((this.criteriaAmstInd == null)?"<null>":this.criteriaAmstInd));
        sb.append(',');
        sb.append("criteriaEstLifeYears");
        sb.append('=');
        sb.append(((this.criteriaEstLifeYears == null)?"<null>":this.criteriaEstLifeYears));
        sb.append(',');
        sb.append("displayCommCode");
        sb.append('=');
        sb.append(((this.displayCommCode == null)?"<null>":this.displayCommCode));
        sb.append(',');
        sb.append("criteriaTgrpCode");
        sb.append('=');
        sb.append(((this.criteriaTgrpCode == null)?"<null>":this.criteriaTgrpCode));
        sb.append(',');
        sb.append("commCodePred");
        sb.append('=');
        sb.append(((this.commCodePred == null)?"<null>":this.commCodePred));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("criteriaStockInd");
        sb.append('=');
        sb.append(((this.criteriaStockInd == null)?"<null>":this.criteriaStockInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("uomsCode");
        sb.append('=');
        sb.append(((this.uomsCode == null)?"<null>":this.uomsCode));
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
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.taxOverrideInd == null)? 0 :this.taxOverrideInd.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCode == null)? 0 :this.criteriaAcctCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.criteriaEstLifeYears == null)? 0 :this.criteriaEstLifeYears.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.amstInd == null)? 0 :this.amstInd.hashCode()));
        result = ((result* 31)+((this.criteriaCommCodePred == null)? 0 :this.criteriaCommCodePred.hashCode()));
        result = ((result* 31)+((this.criteriaTaxOverrideInd == null)? 0 :this.criteriaTaxOverrideInd.hashCode()));
        result = ((result* 31)+((this.criteriaAmstInd == null)? 0 :this.criteriaAmstInd.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.stockInd == null)? 0 :this.stockInd.hashCode()));
        result = ((result* 31)+((this.estLifeYears == null)? 0 :this.estLifeYears.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.criteriaUomsCode == null)? 0 :this.criteriaUomsCode.hashCode()));
        result = ((result* 31)+((this.displayCommCode == null)? 0 :this.displayCommCode.hashCode()));
        result = ((result* 31)+((this.criteriaTgrpCode == null)? 0 :this.criteriaTgrpCode.hashCode()));
        result = ((result* 31)+((this.commCodePred == null)? 0 :this.commCodePred.hashCode()));
        result = ((result* 31)+((this.criteriaStockInd == null)? 0 :this.criteriaStockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.uomsCode == null)? 0 :this.uomsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommodityMaintenance100PutRequest) == false) {
            return false;
        }
        CommodityMaintenance100PutRequest rhs = ((CommodityMaintenance100PutRequest) other);
        return ((((((((((((((((((((((((((((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode)))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.taxOverrideInd == rhs.taxOverrideInd)||((this.taxOverrideInd!= null)&&this.taxOverrideInd.equals(rhs.taxOverrideInd))))&&((this.criteriaAcctCode == rhs.criteriaAcctCode)||((this.criteriaAcctCode!= null)&&this.criteriaAcctCode.equals(rhs.criteriaAcctCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.criteriaEstLifeYears == rhs.criteriaEstLifeYears)||((this.criteriaEstLifeYears!= null)&&this.criteriaEstLifeYears.equals(rhs.criteriaEstLifeYears))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.amstInd == rhs.amstInd)||((this.amstInd!= null)&&this.amstInd.equals(rhs.amstInd))))&&((this.criteriaCommCodePred == rhs.criteriaCommCodePred)||((this.criteriaCommCodePred!= null)&&this.criteriaCommCodePred.equals(rhs.criteriaCommCodePred))))&&((this.criteriaTaxOverrideInd == rhs.criteriaTaxOverrideInd)||((this.criteriaTaxOverrideInd!= null)&&this.criteriaTaxOverrideInd.equals(rhs.criteriaTaxOverrideInd))))&&((this.criteriaAmstInd == rhs.criteriaAmstInd)||((this.criteriaAmstInd!= null)&&this.criteriaAmstInd.equals(rhs.criteriaAmstInd))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.stockInd == rhs.stockInd)||((this.stockInd!= null)&&this.stockInd.equals(rhs.stockInd))))&&((this.estLifeYears == rhs.estLifeYears)||((this.estLifeYears!= null)&&this.estLifeYears.equals(rhs.estLifeYears))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.criteriaUomsCode == rhs.criteriaUomsCode)||((this.criteriaUomsCode!= null)&&this.criteriaUomsCode.equals(rhs.criteriaUomsCode))))&&((this.displayCommCode == rhs.displayCommCode)||((this.displayCommCode!= null)&&this.displayCommCode.equals(rhs.displayCommCode))))&&((this.criteriaTgrpCode == rhs.criteriaTgrpCode)||((this.criteriaTgrpCode!= null)&&this.criteriaTgrpCode.equals(rhs.criteriaTgrpCode))))&&((this.commCodePred == rhs.commCodePred)||((this.commCodePred!= null)&&this.commCodePred.equals(rhs.commCodePred))))&&((this.criteriaStockInd == rhs.criteriaStockInd)||((this.criteriaStockInd!= null)&&this.criteriaStockInd.equals(rhs.criteriaStockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.uomsCode == rhs.uomsCode)||((this.uomsCode!= null)&&this.uomsCode.equals(rhs.uomsCode))));
    }

}
