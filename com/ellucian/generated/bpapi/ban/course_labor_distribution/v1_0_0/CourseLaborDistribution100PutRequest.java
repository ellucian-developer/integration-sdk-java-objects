
package com.ellucian.generated.bpapi.ban.course_labor_distribution.v1_0_0;

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
    "projCode",
    "scacrseCrseNumb",
    "scacrseSubjCode",
    "coasCode",
    "criteria.progCode",
    "criteria.acctExternalCde",
    "locnCode",
    "criteria.ctypCode",
    "orgnCode",
    "percent",
    "criteria.acciCode",
    "fundCode",
    "criteria.percent",
    "progCode",
    "criteria.coasCode",
    "actvCode",
    "criteria.projCode",
    "criteria.fundCode",
    "criteria.acctCode",
    "criteria.locnCode",
    "acciCode",
    "criteria.actvCode",
    "acctCode",
    "ctypCode",
    "scacrseTermCodeEff",
    "criteria.orgnCode"
})
@Generated("jsonschema2pojo")
public class CourseLaborDistribution100PutRequest {

    /**
     * Project
     * <p>
     * Lineage reference object : SCRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_PROJ_CODE")
    private String projCode;
    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    @JsonPropertyDescription("Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky")
    private String scacrseCrseNumb;
    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    @JsonPropertyDescription("Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj")
    private String scacrseSubjCode;
    /**
     * COA
     * <p>
     * Lineage reference object : SCRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_COAS_CODE")
    private String coasCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SCRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_PROG_CODE")
    private String criteriaProgCode;
    /**
     * External Account Code
     * <p>
     * Lineage reference object : SCRCLBD_ACCT_EXTERNAL_CDE
     * 
     */
    @JsonProperty("criteria.acctExternalCde")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_ACCT_EXTERNAL_CDE")
    private String criteriaAcctExternalCde;
    /**
     * Location
     * <p>
     * Lineage reference object : SCRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_LOCN_CODE")
    private String locnCode;
    /**
     * Cost
     * <p>
     * Lineage reference object : SCRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_CTYP_CODE")
    private String criteriaCtypCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : SCRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_ORGN_CODE")
    private String orgnCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : SCRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_PERCENT")
    private Double percent;
    /**
     * Index
     * <p>
     * Lineage reference object : SCRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_ACCI_CODE")
    private String criteriaAcciCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : SCRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_FUND_CODE")
    private String fundCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : SCRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.percent")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_PERCENT")
    private Double criteriaPercent;
    /**
     * Program
     * <p>
     * Lineage reference object : SCRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_PROG_CODE")
    private String progCode;
    /**
     * COA
     * <p>
     * Lineage reference object : SCRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_COAS_CODE")
    private String criteriaCoasCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : SCRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_ACTV_CODE")
    private String actvCode;
    /**
     * Project
     * <p>
     * Lineage reference object : SCRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_PROJ_CODE")
    private String criteriaProjCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : SCRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_FUND_CODE")
    private String criteriaFundCode;
    /**
     * Account
     * <p>
     * Lineage reference object : SCRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_ACCT_CODE")
    private String criteriaAcctCode;
    /**
     * Location
     * <p>
     * Lineage reference object : SCRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_LOCN_CODE")
    private String criteriaLocnCode;
    /**
     * Index
     * <p>
     * Lineage reference object : SCRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_ACCI_CODE")
    private String acciCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : SCRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_ACTV_CODE")
    private String criteriaActvCode;
    /**
     * Account
     * <p>
     * Lineage reference object : SCRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_ACCT_CODE")
    private String acctCode;
    /**
     * Cost
     * <p>
     * Lineage reference object : SCRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_CTYP_CODE")
    private String ctypCode;
    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky")
    private String scacrseTermCodeEff;
    /**
     * Organization
     * <p>
     * Lineage reference object : SCRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : SCRCLBD_ORGN_CODE")
    private String criteriaOrgnCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Project
     * <p>
     * Lineage reference object : SCRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public String getProjCode() {
        return projCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : SCRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public void setProjCode(String projCode) {
        this.projCode = projCode;
    }

    public CourseLaborDistribution100PutRequest withProjCode(String projCode) {
        this.projCode = projCode;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public String getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : scacrseCrseNumb, Lookup lineage reference object : scbcrse,scbcrky
     * 
     */
    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public CourseLaborDistribution100PutRequest withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public String getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : scacrseSubjCode, Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public CourseLaborDistribution100PutRequest withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : SCRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : SCRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public CourseLaborDistribution100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public String getCriteriaProgCode() {
        return criteriaProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public void setCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
        return this;
    }

    /**
     * External Account Code
     * <p>
     * Lineage reference object : SCRCLBD_ACCT_EXTERNAL_CDE
     * 
     */
    @JsonProperty("criteria.acctExternalCde")
    public String getCriteriaAcctExternalCde() {
        return criteriaAcctExternalCde;
    }

    /**
     * External Account Code
     * <p>
     * Lineage reference object : SCRCLBD_ACCT_EXTERNAL_CDE
     * 
     */
    @JsonProperty("criteria.acctExternalCde")
    public void setCriteriaAcctExternalCde(String criteriaAcctExternalCde) {
        this.criteriaAcctExternalCde = criteriaAcctExternalCde;
    }

    public CourseLaborDistribution100PutRequest withCriteriaAcctExternalCde(String criteriaAcctExternalCde) {
        this.criteriaAcctExternalCde = criteriaAcctExternalCde;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SCRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SCRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public CourseLaborDistribution100PutRequest withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SCRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public String getCriteriaCtypCode() {
        return criteriaCtypCode;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SCRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public void setCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SCRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SCRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public CourseLaborDistribution100PutRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SCRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SCRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public CourseLaborDistribution100PutRequest withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SCRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    public String getCriteriaAcciCode() {
        return criteriaAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SCRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    public void setCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : SCRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : SCRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public CourseLaborDistribution100PutRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SCRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.percent")
    public Double getCriteriaPercent() {
        return criteriaPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SCRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.percent")
    public void setCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
    }

    public CourseLaborDistribution100PutRequest withCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public CourseLaborDistribution100PutRequest withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : SCRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : SCRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SCRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SCRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public CourseLaborDistribution100PutRequest withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : SCRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    public String getCriteriaProjCode() {
        return criteriaProjCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : SCRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    public void setCriteriaProjCode(String criteriaProjCode) {
        this.criteriaProjCode = criteriaProjCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaProjCode(String criteriaProjCode) {
        this.criteriaProjCode = criteriaProjCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : SCRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : SCRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SCRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public String getCriteriaAcctCode() {
        return criteriaAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SCRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public void setCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SCRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SCRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SCRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SCRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public CourseLaborDistribution100PutRequest withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SCRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public String getCriteriaActvCode() {
        return criteriaActvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SCRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public void setCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SCRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SCRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public CourseLaborDistribution100PutRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SCRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SCRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public CourseLaborDistribution100PutRequest withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public String getScacrseTermCodeEff() {
        return scacrseTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : scacrseTermCodeEff, Lookup lineage reference object : stvterm,scbcrky,scbcrky
     * 
     */
    @JsonProperty("scacrseTermCodeEff")
    public void setScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
    }

    public CourseLaborDistribution100PutRequest withScacrseTermCodeEff(String scacrseTermCodeEff) {
        this.scacrseTermCodeEff = scacrseTermCodeEff;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SCRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SCRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public CourseLaborDistribution100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
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

    public CourseLaborDistribution100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseLaborDistribution100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projCode");
        sb.append('=');
        sb.append(((this.projCode == null)?"<null>":this.projCode));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("criteriaProgCode");
        sb.append('=');
        sb.append(((this.criteriaProgCode == null)?"<null>":this.criteriaProgCode));
        sb.append(',');
        sb.append("criteriaAcctExternalCde");
        sb.append('=');
        sb.append(((this.criteriaAcctExternalCde == null)?"<null>":this.criteriaAcctExternalCde));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("criteriaCtypCode");
        sb.append('=');
        sb.append(((this.criteriaCtypCode == null)?"<null>":this.criteriaCtypCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("criteriaAcciCode");
        sb.append('=');
        sb.append(((this.criteriaAcciCode == null)?"<null>":this.criteriaAcciCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("criteriaPercent");
        sb.append('=');
        sb.append(((this.criteriaPercent == null)?"<null>":this.criteriaPercent));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("criteriaProjCode");
        sb.append('=');
        sb.append(((this.criteriaProjCode == null)?"<null>":this.criteriaProjCode));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("criteriaAcctCode");
        sb.append('=');
        sb.append(((this.criteriaAcctCode == null)?"<null>":this.criteriaAcctCode));
        sb.append(',');
        sb.append("criteriaLocnCode");
        sb.append('=');
        sb.append(((this.criteriaLocnCode == null)?"<null>":this.criteriaLocnCode));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("criteriaActvCode");
        sb.append('=');
        sb.append(((this.criteriaActvCode == null)?"<null>":this.criteriaActvCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("scacrseTermCodeEff");
        sb.append('=');
        sb.append(((this.scacrseTermCodeEff == null)?"<null>":this.scacrseTermCodeEff));
        sb.append(',');
        sb.append("criteriaOrgnCode");
        sb.append('=');
        sb.append(((this.criteriaOrgnCode == null)?"<null>":this.criteriaOrgnCode));
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
        result = ((result* 31)+((this.criteriaFundCode == null)? 0 :this.criteriaFundCode.hashCode()));
        result = ((result* 31)+((this.criteriaLocnCode == null)? 0 :this.criteriaLocnCode.hashCode()));
        result = ((result* 31)+((this.projCode == null)? 0 :this.projCode.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaActvCode == null)? 0 :this.criteriaActvCode.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCode == null)? 0 :this.criteriaAcctCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.criteriaPercent == null)? 0 :this.criteriaPercent.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.criteriaProjCode == null)? 0 :this.criteriaProjCode.hashCode()));
        result = ((result* 31)+((this.criteriaCtypCode == null)? 0 :this.criteriaCtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctExternalCde == null)? 0 :this.criteriaAcctExternalCde.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcciCode == null)? 0 :this.criteriaAcciCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.criteriaProgCode == null)? 0 :this.criteriaProgCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCode == null)? 0 :this.criteriaOrgnCode.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseTermCodeEff == null)? 0 :this.scacrseTermCodeEff.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseLaborDistribution100PutRequest) == false) {
            return false;
        }
        CourseLaborDistribution100PutRequest rhs = ((CourseLaborDistribution100PutRequest) other);
        return ((((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode))))&&((this.projCode == rhs.projCode)||((this.projCode!= null)&&this.projCode.equals(rhs.projCode))))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.criteriaActvCode == rhs.criteriaActvCode)||((this.criteriaActvCode!= null)&&this.criteriaActvCode.equals(rhs.criteriaActvCode))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaAcctCode == rhs.criteriaAcctCode)||((this.criteriaAcctCode!= null)&&this.criteriaAcctCode.equals(rhs.criteriaAcctCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.criteriaPercent == rhs.criteriaPercent)||((this.criteriaPercent!= null)&&this.criteriaPercent.equals(rhs.criteriaPercent))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.criteriaProjCode == rhs.criteriaProjCode)||((this.criteriaProjCode!= null)&&this.criteriaProjCode.equals(rhs.criteriaProjCode))))&&((this.criteriaCtypCode == rhs.criteriaCtypCode)||((this.criteriaCtypCode!= null)&&this.criteriaCtypCode.equals(rhs.criteriaCtypCode))))&&((this.criteriaAcctExternalCde == rhs.criteriaAcctExternalCde)||((this.criteriaAcctExternalCde!= null)&&this.criteriaAcctExternalCde.equals(rhs.criteriaAcctExternalCde))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.criteriaAcciCode == rhs.criteriaAcciCode)||((this.criteriaAcciCode!= null)&&this.criteriaAcciCode.equals(rhs.criteriaAcciCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.criteriaProgCode == rhs.criteriaProgCode)||((this.criteriaProgCode!= null)&&this.criteriaProgCode.equals(rhs.criteriaProgCode))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseTermCodeEff == rhs.scacrseTermCodeEff)||((this.scacrseTermCodeEff!= null)&&this.scacrseTermCodeEff.equals(rhs.scacrseTermCodeEff))));
    }

}
