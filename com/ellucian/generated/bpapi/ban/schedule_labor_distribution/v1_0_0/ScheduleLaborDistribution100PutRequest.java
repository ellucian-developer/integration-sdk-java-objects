
package com.ellucian.generated.bpapi.ban.schedule_labor_distribution.v1_0_0;

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
    "criteria.fundCode",
    "criteria.acctCode",
    "criteria.locnCode",
    "ssasectCrn",
    "acciCode",
    "criteria.actvCode",
    "coasCode",
    "criteria.progCode",
    "criteria.acctExternalCde",
    "locnCode",
    "criteria.ctypCode",
    "orgnCode",
    "acctCode",
    "percent",
    "ssasectTermCode",
    "criteria.acciCode",
    "fundCode",
    "criteria.percent",
    "progCode",
    "ctypCode",
    "criteria.coasCode",
    "actvCode",
    "criteria.orgnCode",
    "criteria.projCode"
})
@Generated("jsonschema2pojo")
public class ScheduleLaborDistribution100PutRequest {

    /**
     * Fund
     * <p>
     * Lineage reference object : SSRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_FUND_CODE")
    private String criteriaFundCode;
    /**
     * Account
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACCT_CODE")
    private String criteriaAcctCode;
    /**
     * Location
     * <p>
     * Lineage reference object : SSRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_LOCN_CODE")
    private String criteriaLocnCode;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    @JsonPropertyDescription("Lineage reference object : ssasectCrn")
    private String ssasectCrn;
    /**
     * Index
     * <p>
     * Lineage reference object : SSRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACCI_CODE")
    private String acciCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : SSRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACTV_CODE")
    private String criteriaActvCode;
    /**
     * COA
     * <p>
     * Lineage reference object : SSRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_COAS_CODE")
    private String coasCode;
    /**
     * Program
     * <p>
     * Lineage reference object : SSRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_PROG_CODE")
    private String criteriaProgCode;
    /**
     * External Account Code
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_EXTERNAL_CDE
     * 
     */
    @JsonProperty("criteria.acctExternalCde")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACCT_EXTERNAL_CDE")
    private String criteriaAcctExternalCde;
    /**
     * Location
     * <p>
     * Lineage reference object : SSRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_LOCN_CODE")
    private String locnCode;
    /**
     * Cost
     * <p>
     * Lineage reference object : SSRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_CTYP_CODE")
    private String criteriaCtypCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : SSRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ORGN_CODE")
    private String orgnCode;
    /**
     * Account
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACCT_CODE")
    private String acctCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : SSRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_PERCENT")
    private Double percent;
    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    @JsonPropertyDescription("Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm")
    private String ssasectTermCode;
    /**
     * Index
     * <p>
     * Lineage reference object : SSRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACCI_CODE")
    private String criteriaAcciCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : SSRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_FUND_CODE")
    private String fundCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : SSRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.percent")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_PERCENT")
    private Double criteriaPercent;
    /**
     * Program
     * <p>
     * Lineage reference object : SSRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_PROG_CODE")
    private String progCode;
    /**
     * Cost
     * <p>
     * Lineage reference object : SSRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_CTYP_CODE")
    private String ctypCode;
    /**
     * COA
     * <p>
     * Lineage reference object : SSRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_COAS_CODE")
    private String criteriaCoasCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : SSRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ACTV_CODE")
    private String actvCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : SSRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_ORGN_CODE")
    private String criteriaOrgnCode;
    /**
     * Project
     * <p>
     * Lineage reference object : SSRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    @JsonPropertyDescription("Lineage reference object : SSRCLBD_PROJ_CODE")
    private String criteriaProjCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fund
     * <p>
     * Lineage reference object : SSRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : SSRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public String getCriteriaAcctCode() {
        return criteriaAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public void setCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SSRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SSRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public String getSsasectCrn() {
        return ssasectCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssasectCrn
     * 
     */
    @JsonProperty("ssasectCrn")
    public void setSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
    }

    public ScheduleLaborDistribution100PutRequest withSsasectCrn(String ssasectCrn) {
        this.ssasectCrn = ssasectCrn;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SSRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SSRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public ScheduleLaborDistribution100PutRequest withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SSRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public String getCriteriaActvCode() {
        return criteriaActvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SSRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public void setCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : SSRCLBD_COAS_CODE
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
     * Lineage reference object : SSRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ScheduleLaborDistribution100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public String getCriteriaProgCode() {
        return criteriaProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public void setCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
        return this;
    }

    /**
     * External Account Code
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_EXTERNAL_CDE
     * 
     */
    @JsonProperty("criteria.acctExternalCde")
    public String getCriteriaAcctExternalCde() {
        return criteriaAcctExternalCde;
    }

    /**
     * External Account Code
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_EXTERNAL_CDE
     * 
     */
    @JsonProperty("criteria.acctExternalCde")
    public void setCriteriaAcctExternalCde(String criteriaAcctExternalCde) {
        this.criteriaAcctExternalCde = criteriaAcctExternalCde;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaAcctExternalCde(String criteriaAcctExternalCde) {
        this.criteriaAcctExternalCde = criteriaAcctExternalCde;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SSRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : SSRCLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public ScheduleLaborDistribution100PutRequest withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SSRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public String getCriteriaCtypCode() {
        return criteriaCtypCode;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SSRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public void setCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SSRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SSRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public ScheduleLaborDistribution100PutRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : SSRCLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public ScheduleLaborDistribution100PutRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SSRCLBD_PERCENT
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
     * Lineage reference object : SSRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public ScheduleLaborDistribution100PutRequest withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public String getSsasectTermCode() {
        return ssasectTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssasectTermCode, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("ssasectTermCode")
    public void setSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
    }

    public ScheduleLaborDistribution100PutRequest withSsasectTermCode(String ssasectTermCode) {
        this.ssasectTermCode = ssasectTermCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SSRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    public String getCriteriaAcciCode() {
        return criteriaAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : SSRCLBD_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    public void setCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : SSRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : SSRCLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public ScheduleLaborDistribution100PutRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SSRCLBD_PERCENT
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
     * Lineage reference object : SSRCLBD_PERCENT
     * (Required)
     * 
     */
    @JsonProperty("criteria.percent")
    public void setCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SSRCLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public ScheduleLaborDistribution100PutRequest withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SSRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : SSRCLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public ScheduleLaborDistribution100PutRequest withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : SSRCLBD_COAS_CODE
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
     * Lineage reference object : SSRCLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SSRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : SSRCLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public ScheduleLaborDistribution100PutRequest withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SSRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : SSRCLBD_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
        return this;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : SSRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    public String getCriteriaProjCode() {
        return criteriaProjCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : SSRCLBD_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    public void setCriteriaProjCode(String criteriaProjCode) {
        this.criteriaProjCode = criteriaProjCode;
    }

    public ScheduleLaborDistribution100PutRequest withCriteriaProjCode(String criteriaProjCode) {
        this.criteriaProjCode = criteriaProjCode;
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

    public ScheduleLaborDistribution100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleLaborDistribution100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("ssasectCrn");
        sb.append('=');
        sb.append(((this.ssasectCrn == null)?"<null>":this.ssasectCrn));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("criteriaActvCode");
        sb.append('=');
        sb.append(((this.criteriaActvCode == null)?"<null>":this.criteriaActvCode));
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
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("ssasectTermCode");
        sb.append('=');
        sb.append(((this.ssasectTermCode == null)?"<null>":this.ssasectTermCode));
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
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("criteriaOrgnCode");
        sb.append('=');
        sb.append(((this.criteriaOrgnCode == null)?"<null>":this.criteriaOrgnCode));
        sb.append(',');
        sb.append("criteriaProjCode");
        sb.append('=');
        sb.append(((this.criteriaProjCode == null)?"<null>":this.criteriaProjCode));
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
        result = ((result* 31)+((this.criteriaActvCode == null)? 0 :this.criteriaActvCode.hashCode()));
        result = ((result* 31)+((this.ssasectCrn == null)? 0 :this.ssasectCrn.hashCode()));
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
        result = ((result* 31)+((this.ssasectTermCode == null)? 0 :this.ssasectTermCode.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleLaborDistribution100PutRequest) == false) {
            return false;
        }
        ScheduleLaborDistribution100PutRequest rhs = ((ScheduleLaborDistribution100PutRequest) other);
        return ((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode))))&&((this.criteriaActvCode == rhs.criteriaActvCode)||((this.criteriaActvCode!= null)&&this.criteriaActvCode.equals(rhs.criteriaActvCode))))&&((this.ssasectCrn == rhs.ssasectCrn)||((this.ssasectCrn!= null)&&this.ssasectCrn.equals(rhs.ssasectCrn))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaAcctCode == rhs.criteriaAcctCode)||((this.criteriaAcctCode!= null)&&this.criteriaAcctCode.equals(rhs.criteriaAcctCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.criteriaPercent == rhs.criteriaPercent)||((this.criteriaPercent!= null)&&this.criteriaPercent.equals(rhs.criteriaPercent))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.criteriaProjCode == rhs.criteriaProjCode)||((this.criteriaProjCode!= null)&&this.criteriaProjCode.equals(rhs.criteriaProjCode))))&&((this.criteriaCtypCode == rhs.criteriaCtypCode)||((this.criteriaCtypCode!= null)&&this.criteriaCtypCode.equals(rhs.criteriaCtypCode))))&&((this.criteriaAcctExternalCde == rhs.criteriaAcctExternalCde)||((this.criteriaAcctExternalCde!= null)&&this.criteriaAcctExternalCde.equals(rhs.criteriaAcctExternalCde))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.criteriaAcciCode == rhs.criteriaAcciCode)||((this.criteriaAcciCode!= null)&&this.criteriaAcciCode.equals(rhs.criteriaAcciCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.criteriaProgCode == rhs.criteriaProgCode)||((this.criteriaProgCode!= null)&&this.criteriaProgCode.equals(rhs.criteriaProgCode))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.ssasectTermCode == rhs.ssasectTermCode)||((this.ssasectTermCode!= null)&&this.ssasectTermCode.equals(rhs.ssasectTermCode))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
