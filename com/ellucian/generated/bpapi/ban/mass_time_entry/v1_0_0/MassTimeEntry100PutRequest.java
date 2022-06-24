
package com.ellucian.generated.bpapi.ban.mass_time_entry.v1_0_0;

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
    "projCode",
    "year",
    "criteria.suff",
    "endDate",
    "shift",
    "specialRate",
    "criteria.endDate",
    "coasCode",
    "criteria.progCode",
    "locnCode",
    "criteria.ctypCode",
    "orgnCode",
    "criteria.beginDate",
    "pictCode",
    "criteria.acciCode",
    "suff",
    "criteria.percent",
    "progCode",
    "criteria.shift",
    "criteria.coasCode",
    "criteria.id",
    "criteria.posn",
    "actvCode",
    "criteria.projCode",
    "criteria.effectiveDate",
    "criteria.fundCode",
    "criteria.acctCode",
    "criteria.locnCode",
    "deemedHrs",
    "criteria.specialRate",
    "acciCode",
    "hrs",
    "criteria.actvCode",
    "deleteInd",
    "earnCode",
    "criteria.acctCodeExternal",
    "acctCode",
    "payno",
    "beginDate",
    "criteria.earnCode",
    "criteria.deemedHrs",
    "criteria.hrs",
    "ctypCode",
    "criteria.orgnCode",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class MassTimeEntry100PutRequest {

    /**
     * Project
     * <p>
     * Lineage reference object : PHRMTIM_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_PROJ_CODE")
    private String projCode;
    /**
     * Year
     * <p>
     * Lineage reference object : year
     * 
     */
    @JsonProperty("year")
    @JsonPropertyDescription("Lineage reference object : year")
    private String year;
    /**
     * Suffix
     * <p>
     * Lineage reference object : PHRMTIM_SUFF
     * (Required)
     * 
     */
    @JsonProperty("criteria.suff")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_SUFF")
    private String criteriaSuff;
    /**
     * End Date
     * <p>
     * Lineage reference object : PHRMTIM_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_END_DATE")
    private Date endDate;
    /**
     * Shift
     * <p>
     * Lineage reference object : PHRMTIM_SHIFT
     * (Required)
     * 
     */
    @JsonProperty("shift")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_SHIFT")
    private String shift;
    /**
     * Special Rate
     * <p>
     * Lineage reference object : PHRMTIM_SPECIAL_RATE
     * 
     */
    @JsonProperty("specialRate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_SPECIAL_RATE")
    private Double specialRate;
    /**
     * End Date
     * <p>
     * Lineage reference object : PHRMTIM_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_END_DATE")
    private Date criteriaEndDate;
    /**
     * COA
     * <p>
     * Lineage reference object : PHRMTIM_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_COAS_CODE")
    private String coasCode;
    /**
     * Program
     * <p>
     * Lineage reference object : PHRMTIM_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_PROG_CODE")
    private String criteriaProgCode;
    /**
     * Location
     * <p>
     * Lineage reference object : PHRMTIM_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_LOCN_CODE")
    private String locnCode;
    /**
     * Cost Type
     * <p>
     * Lineage reference object : PHRMTIM_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_CTYP_CODE")
    private String criteriaCtypCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : PHRMTIM_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ORGN_CODE")
    private String orgnCode;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : PHRMTIM_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_BEGIN_DATE")
    private Date criteriaBeginDate;
    /**
     * Payroll ID
     * <p>
     * Lineage reference object : pictCode
     * 
     */
    @JsonProperty("pictCode")
    @JsonPropertyDescription("Lineage reference object : pictCode")
    private String pictCode;
    /**
     * Index
     * <p>
     * Lineage reference object : PHRMTIM_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACCI_CODE")
    private String criteriaAcciCode;
    /**
     * Suffix
     * <p>
     * Lineage reference object : PHRMTIM_SUFF
     * (Required)
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_SUFF")
    private String suff;
    /**
     * Percent
     * <p>
     * Lineage reference object : PHRMTIM_PERCENT
     * 
     */
    @JsonProperty("criteria.percent")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_PERCENT")
    private Double criteriaPercent;
    /**
     * Program
     * <p>
     * Lineage reference object : PHRMTIM_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_PROG_CODE")
    private String progCode;
    /**
     * Shift
     * <p>
     * Lineage reference object : PHRMTIM_SHIFT
     * (Required)
     * 
     */
    @JsonProperty("criteria.shift")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_SHIFT")
    private String criteriaShift;
    /**
     * COA
     * <p>
     * Lineage reference object : PHRMTIM_COAS_CODE
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_COAS_CODE")
    private String criteriaCoasCode;
    /**
     * ID
     * <p>
     * Lineage reference object : PHRMTIM_ID
     * 
     */
    @JsonProperty("criteria.id")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ID")
    private String criteriaId;
    /**
     * Position
     * <p>
     * Lineage reference object : PHRMTIM_POSN
     * (Required)
     * 
     */
    @JsonProperty("criteria.posn")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_POSN")
    private String criteriaPosn;
    /**
     * Activity
     * <p>
     * Lineage reference object : PHRMTIM_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACTV_CODE")
    private String actvCode;
    /**
     * Project
     * <p>
     * Lineage reference object : PHRMTIM_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_PROJ_CODE")
    private String criteriaProjCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : PHRMTIM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_EFFECTIVE_DATE")
    private Date criteriaEffectiveDate;
    /**
     * Fund
     * <p>
     * Lineage reference object : PHRMTIM_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_FUND_CODE")
    private String criteriaFundCode;
    /**
     * Account
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACCT_CODE")
    private String criteriaAcctCode;
    /**
     * Location
     * <p>
     * Lineage reference object : PHRMTIM_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_LOCN_CODE")
    private String criteriaLocnCode;
    /**
     * Deemed
     * <p>
     * Lineage reference object : PHRMTIM_DEEMED_HRS
     * 
     */
    @JsonProperty("deemedHrs")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_DEEMED_HRS")
    private Double deemedHrs;
    /**
     * Special Rate
     * <p>
     * Lineage reference object : PHRMTIM_SPECIAL_RATE
     * 
     */
    @JsonProperty("criteria.specialRate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_SPECIAL_RATE")
    private Double criteriaSpecialRate;
    /**
     * Index
     * <p>
     * Lineage reference object : PHRMTIM_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACCI_CODE")
    private String acciCode;
    /**
     * Hours or Units
     * <p>
     * Lineage reference object : PHRMTIM_HRS
     * (Required)
     * 
     */
    @JsonProperty("hrs")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_HRS")
    private Double hrs;
    /**
     * Activity
     * <p>
     * Lineage reference object : PHRMTIM_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACTV_CODE")
    private String criteriaActvCode;
    @JsonProperty("deleteInd")
    private String deleteInd;
    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PHRMTIM_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_EARN_CODE")
    private String earnCode;
    /**
     * External Account Number
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("criteria.acctCodeExternal")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACCT_CODE_EXTERNAL")
    private String criteriaAcctCodeExternal;
    /**
     * Account
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACCT_CODE")
    private String acctCode;
    /**
     * Pay Number
     * <p>
     * Lineage reference object : payno
     * 
     */
    @JsonProperty("payno")
    @JsonPropertyDescription("Lineage reference object : payno")
    private Double payno;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : PHRMTIM_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_BEGIN_DATE")
    private Date beginDate;
    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PHRMTIM_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.earnCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_EARN_CODE")
    private String criteriaEarnCode;
    /**
     * Deemed
     * <p>
     * Lineage reference object : PHRMTIM_DEEMED_HRS
     * 
     */
    @JsonProperty("criteria.deemedHrs")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_DEEMED_HRS")
    private Double criteriaDeemedHrs;
    /**
     * Hours or Units
     * <p>
     * Lineage reference object : PHRMTIM_HRS
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrs")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_HRS")
    private Double criteriaHrs;
    /**
     * Cost Type
     * <p>
     * Lineage reference object : PHRMTIM_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_CTYP_CODE")
    private String ctypCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : PHRMTIM_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ORGN_CODE")
    private String criteriaOrgnCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : PHRMTIM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_EFFECTIVE_DATE")
    private Date effectiveDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Project
     * <p>
     * Lineage reference object : PHRMTIM_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public String getProjCode() {
        return projCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : PHRMTIM_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public void setProjCode(String projCode) {
        this.projCode = projCode;
    }

    public MassTimeEntry100PutRequest withProjCode(String projCode) {
        this.projCode = projCode;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : year
     * 
     */
    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : year
     * 
     */
    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    public MassTimeEntry100PutRequest withYear(String year) {
        this.year = year;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PHRMTIM_SUFF
     * (Required)
     * 
     */
    @JsonProperty("criteria.suff")
    public String getCriteriaSuff() {
        return criteriaSuff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PHRMTIM_SUFF
     * (Required)
     * 
     */
    @JsonProperty("criteria.suff")
    public void setCriteriaSuff(String criteriaSuff) {
        this.criteriaSuff = criteriaSuff;
    }

    public MassTimeEntry100PutRequest withCriteriaSuff(String criteriaSuff) {
        this.criteriaSuff = criteriaSuff;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PHRMTIM_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PHRMTIM_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public MassTimeEntry100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Shift
     * <p>
     * Lineage reference object : PHRMTIM_SHIFT
     * (Required)
     * 
     */
    @JsonProperty("shift")
    public String getShift() {
        return shift;
    }

    /**
     * Shift
     * <p>
     * Lineage reference object : PHRMTIM_SHIFT
     * (Required)
     * 
     */
    @JsonProperty("shift")
    public void setShift(String shift) {
        this.shift = shift;
    }

    public MassTimeEntry100PutRequest withShift(String shift) {
        this.shift = shift;
        return this;
    }

    /**
     * Special Rate
     * <p>
     * Lineage reference object : PHRMTIM_SPECIAL_RATE
     * 
     */
    @JsonProperty("specialRate")
    public Double getSpecialRate() {
        return specialRate;
    }

    /**
     * Special Rate
     * <p>
     * Lineage reference object : PHRMTIM_SPECIAL_RATE
     * 
     */
    @JsonProperty("specialRate")
    public void setSpecialRate(Double specialRate) {
        this.specialRate = specialRate;
    }

    public MassTimeEntry100PutRequest withSpecialRate(Double specialRate) {
        this.specialRate = specialRate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PHRMTIM_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PHRMTIM_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public MassTimeEntry100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : PHRMTIM_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : PHRMTIM_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public MassTimeEntry100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : PHRMTIM_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public String getCriteriaProgCode() {
        return criteriaProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : PHRMTIM_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public void setCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
    }

    public MassTimeEntry100PutRequest withCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : PHRMTIM_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : PHRMTIM_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public MassTimeEntry100PutRequest withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Cost Type
     * <p>
     * Lineage reference object : PHRMTIM_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public String getCriteriaCtypCode() {
        return criteriaCtypCode;
    }

    /**
     * Cost Type
     * <p>
     * Lineage reference object : PHRMTIM_CTYP_CODE
     * 
     */
    @JsonProperty("criteria.ctypCode")
    public void setCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
    }

    public MassTimeEntry100PutRequest withCriteriaCtypCode(String criteriaCtypCode) {
        this.criteriaCtypCode = criteriaCtypCode;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : PHRMTIM_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : PHRMTIM_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public MassTimeEntry100PutRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : PHRMTIM_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public Date getCriteriaBeginDate() {
        return criteriaBeginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : PHRMTIM_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.beginDate")
    public void setCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
    }

    public MassTimeEntry100PutRequest withCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
        return this;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : pictCode
     * 
     */
    @JsonProperty("pictCode")
    public String getPictCode() {
        return pictCode;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : pictCode
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public MassTimeEntry100PutRequest withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : PHRMTIM_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    public String getCriteriaAcciCode() {
        return criteriaAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : PHRMTIM_ACCI_CODE
     * 
     */
    @JsonProperty("criteria.acciCode")
    public void setCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
    }

    public MassTimeEntry100PutRequest withCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PHRMTIM_SUFF
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PHRMTIM_SUFF
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public MassTimeEntry100PutRequest withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : PHRMTIM_PERCENT
     * 
     */
    @JsonProperty("criteria.percent")
    public Double getCriteriaPercent() {
        return criteriaPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : PHRMTIM_PERCENT
     * 
     */
    @JsonProperty("criteria.percent")
    public void setCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
    }

    public MassTimeEntry100PutRequest withCriteriaPercent(Double criteriaPercent) {
        this.criteriaPercent = criteriaPercent;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : PHRMTIM_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : PHRMTIM_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public MassTimeEntry100PutRequest withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Shift
     * <p>
     * Lineage reference object : PHRMTIM_SHIFT
     * (Required)
     * 
     */
    @JsonProperty("criteria.shift")
    public String getCriteriaShift() {
        return criteriaShift;
    }

    /**
     * Shift
     * <p>
     * Lineage reference object : PHRMTIM_SHIFT
     * (Required)
     * 
     */
    @JsonProperty("criteria.shift")
    public void setCriteriaShift(String criteriaShift) {
        this.criteriaShift = criteriaShift;
    }

    public MassTimeEntry100PutRequest withCriteriaShift(String criteriaShift) {
        this.criteriaShift = criteriaShift;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : PHRMTIM_COAS_CODE
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : PHRMTIM_COAS_CODE
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public MassTimeEntry100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : PHRMTIM_ID
     * 
     */
    @JsonProperty("criteria.id")
    public String getCriteriaId() {
        return criteriaId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : PHRMTIM_ID
     * 
     */
    @JsonProperty("criteria.id")
    public void setCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
    }

    public MassTimeEntry100PutRequest withCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PHRMTIM_POSN
     * (Required)
     * 
     */
    @JsonProperty("criteria.posn")
    public String getCriteriaPosn() {
        return criteriaPosn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PHRMTIM_POSN
     * (Required)
     * 
     */
    @JsonProperty("criteria.posn")
    public void setCriteriaPosn(String criteriaPosn) {
        this.criteriaPosn = criteriaPosn;
    }

    public MassTimeEntry100PutRequest withCriteriaPosn(String criteriaPosn) {
        this.criteriaPosn = criteriaPosn;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : PHRMTIM_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : PHRMTIM_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public MassTimeEntry100PutRequest withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : PHRMTIM_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    public String getCriteriaProjCode() {
        return criteriaProjCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : PHRMTIM_PROJ_CODE
     * 
     */
    @JsonProperty("criteria.projCode")
    public void setCriteriaProjCode(String criteriaProjCode) {
        this.criteriaProjCode = criteriaProjCode;
    }

    public MassTimeEntry100PutRequest withCriteriaProjCode(String criteriaProjCode) {
        this.criteriaProjCode = criteriaProjCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : PHRMTIM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public Date getCriteriaEffectiveDate() {
        return criteriaEffectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : PHRMTIM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("criteria.effectiveDate")
    public void setCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
    }

    public MassTimeEntry100PutRequest withCriteriaEffectiveDate(Date criteriaEffectiveDate) {
        this.criteriaEffectiveDate = criteriaEffectiveDate;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : PHRMTIM_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : PHRMTIM_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public MassTimeEntry100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public String getCriteriaAcctCode() {
        return criteriaAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public void setCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
    }

    public MassTimeEntry100PutRequest withCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : PHRMTIM_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : PHRMTIM_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public MassTimeEntry100PutRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    /**
     * Deemed
     * <p>
     * Lineage reference object : PHRMTIM_DEEMED_HRS
     * 
     */
    @JsonProperty("deemedHrs")
    public Double getDeemedHrs() {
        return deemedHrs;
    }

    /**
     * Deemed
     * <p>
     * Lineage reference object : PHRMTIM_DEEMED_HRS
     * 
     */
    @JsonProperty("deemedHrs")
    public void setDeemedHrs(Double deemedHrs) {
        this.deemedHrs = deemedHrs;
    }

    public MassTimeEntry100PutRequest withDeemedHrs(Double deemedHrs) {
        this.deemedHrs = deemedHrs;
        return this;
    }

    /**
     * Special Rate
     * <p>
     * Lineage reference object : PHRMTIM_SPECIAL_RATE
     * 
     */
    @JsonProperty("criteria.specialRate")
    public Double getCriteriaSpecialRate() {
        return criteriaSpecialRate;
    }

    /**
     * Special Rate
     * <p>
     * Lineage reference object : PHRMTIM_SPECIAL_RATE
     * 
     */
    @JsonProperty("criteria.specialRate")
    public void setCriteriaSpecialRate(Double criteriaSpecialRate) {
        this.criteriaSpecialRate = criteriaSpecialRate;
    }

    public MassTimeEntry100PutRequest withCriteriaSpecialRate(Double criteriaSpecialRate) {
        this.criteriaSpecialRate = criteriaSpecialRate;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : PHRMTIM_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : PHRMTIM_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public MassTimeEntry100PutRequest withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Hours or Units
     * <p>
     * Lineage reference object : PHRMTIM_HRS
     * (Required)
     * 
     */
    @JsonProperty("hrs")
    public Double getHrs() {
        return hrs;
    }

    /**
     * Hours or Units
     * <p>
     * Lineage reference object : PHRMTIM_HRS
     * (Required)
     * 
     */
    @JsonProperty("hrs")
    public void setHrs(Double hrs) {
        this.hrs = hrs;
    }

    public MassTimeEntry100PutRequest withHrs(Double hrs) {
        this.hrs = hrs;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : PHRMTIM_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public String getCriteriaActvCode() {
        return criteriaActvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : PHRMTIM_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public void setCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
    }

    public MassTimeEntry100PutRequest withCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
        return this;
    }

    @JsonProperty("deleteInd")
    public String getDeleteInd() {
        return deleteInd;
    }

    @JsonProperty("deleteInd")
    public void setDeleteInd(String deleteInd) {
        this.deleteInd = deleteInd;
    }

    public MassTimeEntry100PutRequest withDeleteInd(String deleteInd) {
        this.deleteInd = deleteInd;
        return this;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PHRMTIM_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    public String getEarnCode() {
        return earnCode;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PHRMTIM_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("earnCode")
    public void setEarnCode(String earnCode) {
        this.earnCode = earnCode;
    }

    public MassTimeEntry100PutRequest withEarnCode(String earnCode) {
        this.earnCode = earnCode;
        return this;
    }

    /**
     * External Account Number
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("criteria.acctCodeExternal")
    public String getCriteriaAcctCodeExternal() {
        return criteriaAcctCodeExternal;
    }

    /**
     * External Account Number
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("criteria.acctCodeExternal")
    public void setCriteriaAcctCodeExternal(String criteriaAcctCodeExternal) {
        this.criteriaAcctCodeExternal = criteriaAcctCodeExternal;
    }

    public MassTimeEntry100PutRequest withCriteriaAcctCodeExternal(String criteriaAcctCodeExternal) {
        this.criteriaAcctCodeExternal = criteriaAcctCodeExternal;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public MassTimeEntry100PutRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Pay Number
     * <p>
     * Lineage reference object : payno
     * 
     */
    @JsonProperty("payno")
    public Double getPayno() {
        return payno;
    }

    /**
     * Pay Number
     * <p>
     * Lineage reference object : payno
     * 
     */
    @JsonProperty("payno")
    public void setPayno(Double payno) {
        this.payno = payno;
    }

    public MassTimeEntry100PutRequest withPayno(Double payno) {
        this.payno = payno;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : PHRMTIM_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : PHRMTIM_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public MassTimeEntry100PutRequest withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PHRMTIM_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.earnCode")
    public String getCriteriaEarnCode() {
        return criteriaEarnCode;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PHRMTIM_EARN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.earnCode")
    public void setCriteriaEarnCode(String criteriaEarnCode) {
        this.criteriaEarnCode = criteriaEarnCode;
    }

    public MassTimeEntry100PutRequest withCriteriaEarnCode(String criteriaEarnCode) {
        this.criteriaEarnCode = criteriaEarnCode;
        return this;
    }

    /**
     * Deemed
     * <p>
     * Lineage reference object : PHRMTIM_DEEMED_HRS
     * 
     */
    @JsonProperty("criteria.deemedHrs")
    public Double getCriteriaDeemedHrs() {
        return criteriaDeemedHrs;
    }

    /**
     * Deemed
     * <p>
     * Lineage reference object : PHRMTIM_DEEMED_HRS
     * 
     */
    @JsonProperty("criteria.deemedHrs")
    public void setCriteriaDeemedHrs(Double criteriaDeemedHrs) {
        this.criteriaDeemedHrs = criteriaDeemedHrs;
    }

    public MassTimeEntry100PutRequest withCriteriaDeemedHrs(Double criteriaDeemedHrs) {
        this.criteriaDeemedHrs = criteriaDeemedHrs;
        return this;
    }

    /**
     * Hours or Units
     * <p>
     * Lineage reference object : PHRMTIM_HRS
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrs")
    public Double getCriteriaHrs() {
        return criteriaHrs;
    }

    /**
     * Hours or Units
     * <p>
     * Lineage reference object : PHRMTIM_HRS
     * (Required)
     * 
     */
    @JsonProperty("criteria.hrs")
    public void setCriteriaHrs(Double criteriaHrs) {
        this.criteriaHrs = criteriaHrs;
    }

    public MassTimeEntry100PutRequest withCriteriaHrs(Double criteriaHrs) {
        this.criteriaHrs = criteriaHrs;
        return this;
    }

    /**
     * Cost Type
     * <p>
     * Lineage reference object : PHRMTIM_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Cost Type
     * <p>
     * Lineage reference object : PHRMTIM_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public MassTimeEntry100PutRequest withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : PHRMTIM_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : PHRMTIM_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public MassTimeEntry100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : PHRMTIM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : PHRMTIM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public MassTimeEntry100PutRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public MassTimeEntry100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MassTimeEntry100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projCode");
        sb.append('=');
        sb.append(((this.projCode == null)?"<null>":this.projCode));
        sb.append(',');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("criteriaSuff");
        sb.append('=');
        sb.append(((this.criteriaSuff == null)?"<null>":this.criteriaSuff));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("shift");
        sb.append('=');
        sb.append(((this.shift == null)?"<null>":this.shift));
        sb.append(',');
        sb.append("specialRate");
        sb.append('=');
        sb.append(((this.specialRate == null)?"<null>":this.specialRate));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("criteriaProgCode");
        sb.append('=');
        sb.append(((this.criteriaProgCode == null)?"<null>":this.criteriaProgCode));
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
        sb.append("criteriaBeginDate");
        sb.append('=');
        sb.append(((this.criteriaBeginDate == null)?"<null>":this.criteriaBeginDate));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("criteriaAcciCode");
        sb.append('=');
        sb.append(((this.criteriaAcciCode == null)?"<null>":this.criteriaAcciCode));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("criteriaPercent");
        sb.append('=');
        sb.append(((this.criteriaPercent == null)?"<null>":this.criteriaPercent));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("criteriaShift");
        sb.append('=');
        sb.append(((this.criteriaShift == null)?"<null>":this.criteriaShift));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("criteriaId");
        sb.append('=');
        sb.append(((this.criteriaId == null)?"<null>":this.criteriaId));
        sb.append(',');
        sb.append("criteriaPosn");
        sb.append('=');
        sb.append(((this.criteriaPosn == null)?"<null>":this.criteriaPosn));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("criteriaProjCode");
        sb.append('=');
        sb.append(((this.criteriaProjCode == null)?"<null>":this.criteriaProjCode));
        sb.append(',');
        sb.append("criteriaEffectiveDate");
        sb.append('=');
        sb.append(((this.criteriaEffectiveDate == null)?"<null>":this.criteriaEffectiveDate));
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
        sb.append("deemedHrs");
        sb.append('=');
        sb.append(((this.deemedHrs == null)?"<null>":this.deemedHrs));
        sb.append(',');
        sb.append("criteriaSpecialRate");
        sb.append('=');
        sb.append(((this.criteriaSpecialRate == null)?"<null>":this.criteriaSpecialRate));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("hrs");
        sb.append('=');
        sb.append(((this.hrs == null)?"<null>":this.hrs));
        sb.append(',');
        sb.append("criteriaActvCode");
        sb.append('=');
        sb.append(((this.criteriaActvCode == null)?"<null>":this.criteriaActvCode));
        sb.append(',');
        sb.append("deleteInd");
        sb.append('=');
        sb.append(((this.deleteInd == null)?"<null>":this.deleteInd));
        sb.append(',');
        sb.append("earnCode");
        sb.append('=');
        sb.append(((this.earnCode == null)?"<null>":this.earnCode));
        sb.append(',');
        sb.append("criteriaAcctCodeExternal");
        sb.append('=');
        sb.append(((this.criteriaAcctCodeExternal == null)?"<null>":this.criteriaAcctCodeExternal));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("payno");
        sb.append('=');
        sb.append(((this.payno == null)?"<null>":this.payno));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("criteriaEarnCode");
        sb.append('=');
        sb.append(((this.criteriaEarnCode == null)?"<null>":this.criteriaEarnCode));
        sb.append(',');
        sb.append("criteriaDeemedHrs");
        sb.append('=');
        sb.append(((this.criteriaDeemedHrs == null)?"<null>":this.criteriaDeemedHrs));
        sb.append(',');
        sb.append("criteriaHrs");
        sb.append('=');
        sb.append(((this.criteriaHrs == null)?"<null>":this.criteriaHrs));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("criteriaOrgnCode");
        sb.append('=');
        sb.append(((this.criteriaOrgnCode == null)?"<null>":this.criteriaOrgnCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.criteriaId == null)? 0 :this.criteriaId.hashCode()));
        result = ((result* 31)+((this.criteriaActvCode == null)? 0 :this.criteriaActvCode.hashCode()));
        result = ((result* 31)+((this.shift == null)? 0 :this.shift.hashCode()));
        result = ((result* 31)+((this.specialRate == null)? 0 :this.specialRate.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCode == null)? 0 :this.criteriaAcctCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.criteriaPercent == null)? 0 :this.criteriaPercent.hashCode()));
        result = ((result* 31)+((this.criteriaDeemedHrs == null)? 0 :this.criteriaDeemedHrs.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.criteriaBeginDate == null)? 0 :this.criteriaBeginDate.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.criteriaSuff == null)? 0 :this.criteriaSuff.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.criteriaHrs == null)? 0 :this.criteriaHrs.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.criteriaProjCode == null)? 0 :this.criteriaProjCode.hashCode()));
        result = ((result* 31)+((this.criteriaCtypCode == null)? 0 :this.criteriaCtypCode.hashCode()));
        result = ((result* 31)+((this.deemedHrs == null)? 0 :this.deemedHrs.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcciCode == null)? 0 :this.criteriaAcciCode.hashCode()));
        result = ((result* 31)+((this.hrs == null)? 0 :this.hrs.hashCode()));
        result = ((result* 31)+((this.criteriaPosn == null)? 0 :this.criteriaPosn.hashCode()));
        result = ((result* 31)+((this.deleteInd == null)? 0 :this.deleteInd.hashCode()));
        result = ((result* 31)+((this.earnCode == null)? 0 :this.earnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.criteriaProgCode == null)? 0 :this.criteriaProgCode.hashCode()));
        result = ((result* 31)+((this.criteriaEarnCode == null)? 0 :this.criteriaEarnCode.hashCode()));
        result = ((result* 31)+((this.payno == null)? 0 :this.payno.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCodeExternal == null)? 0 :this.criteriaAcctCodeExternal.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCode == null)? 0 :this.criteriaOrgnCode.hashCode()));
        result = ((result* 31)+((this.criteriaSpecialRate == null)? 0 :this.criteriaSpecialRate.hashCode()));
        result = ((result* 31)+((this.criteriaEffectiveDate == null)? 0 :this.criteriaEffectiveDate.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.criteriaShift == null)? 0 :this.criteriaShift.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MassTimeEntry100PutRequest) == false) {
            return false;
        }
        MassTimeEntry100PutRequest rhs = ((MassTimeEntry100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode))))&&((this.projCode == rhs.projCode)||((this.projCode!= null)&&this.projCode.equals(rhs.projCode))))&&((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.criteriaId == rhs.criteriaId)||((this.criteriaId!= null)&&this.criteriaId.equals(rhs.criteriaId))))&&((this.criteriaActvCode == rhs.criteriaActvCode)||((this.criteriaActvCode!= null)&&this.criteriaActvCode.equals(rhs.criteriaActvCode))))&&((this.shift == rhs.shift)||((this.shift!= null)&&this.shift.equals(rhs.shift))))&&((this.specialRate == rhs.specialRate)||((this.specialRate!= null)&&this.specialRate.equals(rhs.specialRate))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaAcctCode == rhs.criteriaAcctCode)||((this.criteriaAcctCode!= null)&&this.criteriaAcctCode.equals(rhs.criteriaAcctCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.criteriaPercent == rhs.criteriaPercent)||((this.criteriaPercent!= null)&&this.criteriaPercent.equals(rhs.criteriaPercent))))&&((this.criteriaDeemedHrs == rhs.criteriaDeemedHrs)||((this.criteriaDeemedHrs!= null)&&this.criteriaDeemedHrs.equals(rhs.criteriaDeemedHrs))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.criteriaBeginDate == rhs.criteriaBeginDate)||((this.criteriaBeginDate!= null)&&this.criteriaBeginDate.equals(rhs.criteriaBeginDate))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.criteriaSuff == rhs.criteriaSuff)||((this.criteriaSuff!= null)&&this.criteriaSuff.equals(rhs.criteriaSuff))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.criteriaHrs == rhs.criteriaHrs)||((this.criteriaHrs!= null)&&this.criteriaHrs.equals(rhs.criteriaHrs))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.criteriaProjCode == rhs.criteriaProjCode)||((this.criteriaProjCode!= null)&&this.criteriaProjCode.equals(rhs.criteriaProjCode))))&&((this.criteriaCtypCode == rhs.criteriaCtypCode)||((this.criteriaCtypCode!= null)&&this.criteriaCtypCode.equals(rhs.criteriaCtypCode))))&&((this.deemedHrs == rhs.deemedHrs)||((this.deemedHrs!= null)&&this.deemedHrs.equals(rhs.deemedHrs))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.criteriaAcciCode == rhs.criteriaAcciCode)||((this.criteriaAcciCode!= null)&&this.criteriaAcciCode.equals(rhs.criteriaAcciCode))))&&((this.hrs == rhs.hrs)||((this.hrs!= null)&&this.hrs.equals(rhs.hrs))))&&((this.criteriaPosn == rhs.criteriaPosn)||((this.criteriaPosn!= null)&&this.criteriaPosn.equals(rhs.criteriaPosn))))&&((this.deleteInd == rhs.deleteInd)||((this.deleteInd!= null)&&this.deleteInd.equals(rhs.deleteInd))))&&((this.earnCode == rhs.earnCode)||((this.earnCode!= null)&&this.earnCode.equals(rhs.earnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.criteriaProgCode == rhs.criteriaProgCode)||((this.criteriaProgCode!= null)&&this.criteriaProgCode.equals(rhs.criteriaProgCode))))&&((this.criteriaEarnCode == rhs.criteriaEarnCode)||((this.criteriaEarnCode!= null)&&this.criteriaEarnCode.equals(rhs.criteriaEarnCode))))&&((this.payno == rhs.payno)||((this.payno!= null)&&this.payno.equals(rhs.payno))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.criteriaAcctCodeExternal == rhs.criteriaAcctCodeExternal)||((this.criteriaAcctCodeExternal!= null)&&this.criteriaAcctCodeExternal.equals(rhs.criteriaAcctCodeExternal))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.criteriaSpecialRate == rhs.criteriaSpecialRate)||((this.criteriaSpecialRate!= null)&&this.criteriaSpecialRate.equals(rhs.criteriaSpecialRate))))&&((this.criteriaEffectiveDate == rhs.criteriaEffectiveDate)||((this.criteriaEffectiveDate!= null)&&this.criteriaEffectiveDate.equals(rhs.criteriaEffectiveDate))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.criteriaShift == rhs.criteriaShift)||((this.criteriaShift!= null)&&this.criteriaShift.equals(rhs.criteriaShift))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
