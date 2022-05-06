
package com.ellucian.generated.bpapi.ban.employee_jobs_job_labor_distribution.v1_0_0;

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
    "criteria.fundCode",
    "criteria.acctCode",
    "criteria.locnCode",
    "criteria.actvCode",
    "off.percent",
    "criteria.progCode",
    "criteria.ctypCode",
    "criteria.acctCodeExternal",
    "orgnCode",
    "acctCode",
    "posn",
    "queryDate",
    "suff",
    "criteria.acciCode",
    "fundCode",
    "criteria.percent",
    "criteria.coasCode",
    "id",
    "new.percent",
    "criteria.encOverrideEndDate",
    "criteria.orgnCode",
    "criteria.projCode"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsJobLaborDistribution100PostRequest {

    /**
     * Fund
     * <p>
     * Lineage reference object : NBRJLBD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_FUND_CODE")
    private String criteriaFundCode;
    /**
     * Account
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ACCT_CODE")
    private String criteriaAcctCode;
    /**
     * Location
     * <p>
     * Lineage reference object : NBRJLBD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_LOCN_CODE")
    private String criteriaLocnCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : NBRJLBD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ACTV_CODE")
    private String criteriaActvCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("off.percent")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_PERCENT")
    private Double offPercent;
    /**
     * Program
     * <p>
     * Lineage reference object : NBRJLBD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_PROG_CODE")
    private String criteriaProgCode;
    /**
     * Cost
     * <p>
     * Lineage reference object : NBRJLBD_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_CTYP_CODE")
    private String criteriaCtypCode;
    /**
     * External Account Code
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("criteria.acctCodeExternal")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ACCT_CODE_EXTERNAL")
    private String criteriaAcctCodeExternal;
    /**
     * Orgn
     * <p>
     * Lineage reference object : NBRJLBD_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ORGN_CODE")
    private String orgnCode;
    /**
     * Account
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ACCT_CODE")
    private String acctCode;
    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private Object posn;
    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Lineage reference object : queryDate")
    private Object queryDate;
    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : suff")
    private Object suff;
    /**
     * Index
     * <p>
     * Lineage reference object : NBRJLBD_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ACCI_CODE")
    private String criteriaAcciCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : NBRJLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_FUND_CODE")
    private String fundCode;
    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("criteria.percent")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_PERCENT")
    private Double criteriaPercent;
    /**
     * COA
     * <p>
     * Lineage reference object : NBRJLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_COAS_CODE")
    private String criteriaCoasCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("new.percent")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_PERCENT")
    private Double newPercent;
    /**
     * Encumbrance Override End Date
     * <p>
     * Lineage reference object : NBRJLBD_ENC_OVERRIDE_END_DATE
     * 
     */
    @JsonProperty("criteria.encOverrideEndDate")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ENC_OVERRIDE_END_DATE")
    private Date criteriaEncOverrideEndDate;
    /**
     * Orgn
     * <p>
     * Lineage reference object : NBRJLBD_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ORGN_CODE")
    private String criteriaOrgnCode;
    /**
     * Project
     * <p>
     * Lineage reference object : NBRJLBD_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_PROJ_CODE")
    private String criteriaProjCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fund
     * <p>
     * Lineage reference object : NBRJLBD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : NBRJLBD_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public String getCriteriaAcctCode() {
        return criteriaAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public void setCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : NBRJLBD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : NBRJLBD_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : NBRJLBD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public String getCriteriaActvCode() {
        return criteriaActvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : NBRJLBD_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public void setCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("off.percent")
    public Double getOffPercent() {
        return offPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("off.percent")
    public void setOffPercent(Double offPercent) {
        this.offPercent = offPercent;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withOffPercent(Double offPercent) {
        this.offPercent = offPercent;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : NBRJLBD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public String getCriteriaProgCode() {
        return criteriaProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : NBRJLBD_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public void setCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
        return this;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : NBRJLBD_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public String getCriteriaCtypCode() {
        return criteriaCtypCode;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : NBRJLBD_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public void setCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
        return this;
    }

    /**
     * External Account Code
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("criteria.acctCodeExternal")
    public String getCriteriaAcctCodeExternal() {
        return criteriaAcctCodeExternal;
    }

    /**
     * External Account Code
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("criteria.acctCodeExternal")
    public void setCriteriaAcctCodeExternal(String criteriaAcctCodeExternal) {
        this.criteriaAcctCodeExternal = criteriaAcctCodeExternal;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaAcctCodeExternal(String criteriaAcctCodeExternal) {
        this.criteriaAcctCodeExternal = criteriaAcctCodeExternal;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : NBRJLBD_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : NBRJLBD_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public Object getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public void setPosn(Object posn) {
        this.posn = posn;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withPosn(Object posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public Object getQueryDate() {
        return queryDate;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(Object queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withQueryDate(Object queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public Object getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public void setSuff(Object suff) {
        this.suff = suff;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withSuff(Object suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : NBRJLBD_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    public String getCriteriaAcciCode() {
        return criteriaAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : NBRJLBD_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    public void setCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : NBRJLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : NBRJLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("criteria.percent")
    public Double getCriteriaPercent() {
        return criteriaPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("criteria.percent")
    public void setCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBRJLBD_COAS_CODE
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
     * Lineage reference object : NBRJLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("new.percent")
    public Double getNewPercent() {
        return newPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("new.percent")
    public void setNewPercent(Double newPercent) {
        this.newPercent = newPercent;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withNewPercent(Double newPercent) {
        this.newPercent = newPercent;
        return this;
    }

    /**
     * Encumbrance Override End Date
     * <p>
     * Lineage reference object : NBRJLBD_ENC_OVERRIDE_END_DATE
     * 
     */
    @JsonProperty("criteria.encOverrideEndDate")
    public Date getCriteriaEncOverrideEndDate() {
        return criteriaEncOverrideEndDate;
    }

    /**
     * Encumbrance Override End Date
     * <p>
     * Lineage reference object : NBRJLBD_ENC_OVERRIDE_END_DATE
     * 
     */
    @JsonProperty("criteria.encOverrideEndDate")
    public void setCriteriaEncOverrideEndDate(Date criteriaEncOverrideEndDate) {
        this.criteriaEncOverrideEndDate = criteriaEncOverrideEndDate;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaEncOverrideEndDate(Date criteriaEncOverrideEndDate) {
        this.criteriaEncOverrideEndDate = criteriaEncOverrideEndDate;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : NBRJLBD_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : NBRJLBD_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
        return this;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : NBRJLBD_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    public String getCriteriaProjCode() {
        return criteriaProjCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : NBRJLBD_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    public void setCriteriaProjCode(String criteriaProjCode) {
        this.criteriaProjCode = criteriaProjCode;
    }

    public EmployeeJobsJobLaborDistribution100PostRequest withCriteriaProjCode(String criteriaProjCode) {
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

    public EmployeeJobsJobLaborDistribution100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsJobLaborDistribution100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("criteriaActvCode");
        sb.append('=');
        sb.append(((this.criteriaActvCode == null)?"<null>":this.criteriaActvCode));
        sb.append(',');
        sb.append("offPercent");
        sb.append('=');
        sb.append(((this.offPercent == null)?"<null>":this.offPercent));
        sb.append(',');
        sb.append("criteriaProgCode");
        sb.append('=');
        sb.append(((this.criteriaProgCode == null)?"<null>":this.criteriaProgCode));
        sb.append(',');
        sb.append("criteriaCtypCode");
        sb.append('=');
        sb.append(((this.criteriaCtypCode == null)?"<null>":this.criteriaCtypCode));
        sb.append(',');
        sb.append("criteriaAcctCodeExternal");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeExternal == null)?"<null>":this.criteriaAcctCodeExternal));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
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
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("newPercent");
        sb.append('=');
        sb.append(((this.newPercent == null)?"<null>":this.newPercent));
        sb.append(',');
        sb.append("criteriaEncOverrideEndDate");
        sb.append('=');
        sb.append(((this.criteriaEncOverrideEndDate == null)?"<null>":this.criteriaEncOverrideEndDate));
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
        result = ((result* 31)+((this.criteriaCtypCode == null)? 0 :this.criteriaCtypCode.hashCode()));
        result = ((result* 31)+((this.offPercent == null)? 0 :this.offPercent.hashCode()));
        result = ((result* 31)+((this.criteriaActvCode == null)? 0 :this.criteriaActvCode.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCode == null)? 0 :this.criteriaAcctCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcciCode == null)? 0 :this.criteriaAcciCode.hashCode()));
        result = ((result* 31)+((this.criteriaPercent == null)? 0 :this.criteriaPercent.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.criteriaProgCode == null)? 0 :this.criteriaProgCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeExternal == null)? 0 :this.criteriaAcctCodeExternal.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCode == null)? 0 :this.criteriaOrgnCode.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaEncOverrideEndDate == null)? 0 :this.criteriaEncOverrideEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaProjCode == null)? 0 :this.criteriaProjCode.hashCode()));
        result = ((result* 31)+((this.newPercent == null)? 0 :this.newPercent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeJobsJobLaborDistribution100PostRequest) == false) {
            return false;
        }
        EmployeeJobsJobLaborDistribution100PostRequest rhs = ((EmployeeJobsJobLaborDistribution100PostRequest) other);
        return ((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode))))&&((this.criteriaCtypCode == rhs.criteriaCtypCode)||((this.criteriaCtypCode!= null)&&this.criteriaCtypCode.equals(rhs.criteriaCtypCode))))&&((this.offPercent == rhs.offPercent)||((this.offPercent!= null)&&this.offPercent.equals(rhs.offPercent))))&&((this.criteriaActvCode == rhs.criteriaActvCode)||((this.criteriaActvCode!= null)&&this.criteriaActvCode.equals(rhs.criteriaActvCode))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaAcctCode == rhs.criteriaAcctCode)||((this.criteriaAcctCode!= null)&&this.criteriaAcctCode.equals(rhs.criteriaAcctCode))))&&((this.criteriaAcciCode == rhs.criteriaAcciCode)||((this.criteriaAcciCode!= null)&&this.criteriaAcciCode.equals(rhs.criteriaAcciCode))))&&((this.criteriaPercent == rhs.criteriaPercent)||((this.criteriaPercent!= null)&&this.criteriaPercent.equals(rhs.criteriaPercent))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.criteriaProgCode == rhs.criteriaProgCode)||((this.criteriaProgCode!= null)&&this.criteriaProgCode.equals(rhs.criteriaProgCode))))&&((this.criteriaAcctCodeExternal == rhs.criteriaAcctCodeExternal)||((this.criteriaAcctCodeExternal!= null)&&this.criteriaAcctCodeExternal.equals(rhs.criteriaAcctCodeExternal))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaEncOverrideEndDate == rhs.criteriaEncOverrideEndDate)||((this.criteriaEncOverrideEndDate!= null)&&this.criteriaEncOverrideEndDate.equals(rhs.criteriaEncOverrideEndDate))))&&((this.criteriaProjCode == rhs.criteriaProjCode)||((this.criteriaProjCode!= null)&&this.criteriaProjCode.equals(rhs.criteriaProjCode))))&&((this.newPercent == rhs.newPercent)||((this.newPercent!= null)&&this.newPercent.equals(rhs.newPercent))));
    }

}
