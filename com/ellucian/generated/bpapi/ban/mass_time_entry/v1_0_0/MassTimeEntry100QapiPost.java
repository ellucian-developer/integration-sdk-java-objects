
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
    "year",
    "pictCode",
    "payno",
    "id",
    "posn",
    "suff",
    "effectiveDate",
    "earnCode",
    "shift",
    "hrs",
    "deemedHrs",
    "beginDate",
    "endDate",
    "specialRate",
    "coasCode",
    "acciCode",
    "fundCode",
    "orgnCode",
    "acctCode",
    "progCode",
    "actvCode",
    "locnCode",
    "projCode",
    "ctypCode",
    "percent",
    "acctCodeExternal"
})
@Generated("jsonschema2pojo")
public class MassTimeEntry100QapiPost {

    @JsonProperty("year")
    private String year;
    @JsonProperty("pictCode")
    private String pictCode;
    @JsonProperty("payno")
    private String payno;
    /**
     * ID
     * <p>
     * Lineage reference object : PHRMTIM_ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ID")
    private String id;
    /**
     * Position
     * <p>
     * Lineage reference object : PHRMTIM_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_POSN")
    private String posn;
    /**
     * Suffix
     * <p>
     * Lineage reference object : PHRMTIM_SUFF
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_SUFF")
    private String suff;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : PHRMTIM_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_EFFECTIVE_DATE")
    private Date effectiveDate;
    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PHRMTIM_EARN_CODE
     * 
     */
    @JsonProperty("earnCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_EARN_CODE")
    private String earnCode;
    /**
     * Shift
     * <p>
     * Lineage reference object : PHRMTIM_SHIFT
     * 
     */
    @JsonProperty("shift")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_SHIFT")
    private String shift;
    /**
     * Hours or Units
     * <p>
     * Lineage reference object : PHRMTIM_HRS
     * 
     */
    @JsonProperty("hrs")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_HRS")
    private Double hrs;
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
     * Begin Date
     * <p>
     * Lineage reference object : PHRMTIM_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_BEGIN_DATE")
    private Date beginDate;
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
     * Special Rate
     * <p>
     * Lineage reference object : PHRMTIM_SPECIAL_RATE
     * 
     */
    @JsonProperty("specialRate")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_SPECIAL_RATE")
    private Double specialRate;
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
     * Index
     * <p>
     * Lineage reference object : PHRMTIM_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACCI_CODE")
    private String acciCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : PHRMTIM_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_FUND_CODE")
    private String fundCode;
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
     * Account
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACCT_CODE")
    private String acctCode;
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
     * Activity
     * <p>
     * Lineage reference object : PHRMTIM_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACTV_CODE")
    private String actvCode;
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
     * Project
     * <p>
     * Lineage reference object : PHRMTIM_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_PROJ_CODE")
    private String projCode;
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
     * Percent
     * <p>
     * Lineage reference object : PHRMTIM_PERCENT
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_PERCENT")
    private Double percent;
    /**
     * External Account Number
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("acctCodeExternal")
    @JsonPropertyDescription("Lineage reference object : PHRMTIM_ACCT_CODE_EXTERNAL")
    private String acctCodeExternal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    public MassTimeEntry100QapiPost withYear(String year) {
        this.year = year;
        return this;
    }

    @JsonProperty("pictCode")
    public String getPictCode() {
        return pictCode;
    }

    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public MassTimeEntry100QapiPost withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    @JsonProperty("payno")
    public String getPayno() {
        return payno;
    }

    @JsonProperty("payno")
    public void setPayno(String payno) {
        this.payno = payno;
    }

    public MassTimeEntry100QapiPost withPayno(String payno) {
        this.payno = payno;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : PHRMTIM_ID
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : PHRMTIM_ID
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MassTimeEntry100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PHRMTIM_POSN
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PHRMTIM_POSN
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public MassTimeEntry100QapiPost withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PHRMTIM_SUFF
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
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public MassTimeEntry100QapiPost withSuff(String suff) {
        this.suff = suff;
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

    public MassTimeEntry100QapiPost withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Earnings Code
     * <p>
     * Lineage reference object : PHRMTIM_EARN_CODE
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
     * 
     */
    @JsonProperty("earnCode")
    public void setEarnCode(String earnCode) {
        this.earnCode = earnCode;
    }

    public MassTimeEntry100QapiPost withEarnCode(String earnCode) {
        this.earnCode = earnCode;
        return this;
    }

    /**
     * Shift
     * <p>
     * Lineage reference object : PHRMTIM_SHIFT
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
     * 
     */
    @JsonProperty("shift")
    public void setShift(String shift) {
        this.shift = shift;
    }

    public MassTimeEntry100QapiPost withShift(String shift) {
        this.shift = shift;
        return this;
    }

    /**
     * Hours or Units
     * <p>
     * Lineage reference object : PHRMTIM_HRS
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
     * 
     */
    @JsonProperty("hrs")
    public void setHrs(Double hrs) {
        this.hrs = hrs;
    }

    public MassTimeEntry100QapiPost withHrs(Double hrs) {
        this.hrs = hrs;
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

    public MassTimeEntry100QapiPost withDeemedHrs(Double deemedHrs) {
        this.deemedHrs = deemedHrs;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : PHRMTIM_BEGIN_DATE
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
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public MassTimeEntry100QapiPost withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
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

    public MassTimeEntry100QapiPost withEndDate(Date endDate) {
        this.endDate = endDate;
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

    public MassTimeEntry100QapiPost withSpecialRate(Double specialRate) {
        this.specialRate = specialRate;
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

    public MassTimeEntry100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public MassTimeEntry100QapiPost withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : PHRMTIM_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : PHRMTIM_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public MassTimeEntry100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
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

    public MassTimeEntry100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
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

    public MassTimeEntry100QapiPost withAcctCode(String acctCode) {
        this.acctCode = acctCode;
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

    public MassTimeEntry100QapiPost withProgCode(String progCode) {
        this.progCode = progCode;
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

    public MassTimeEntry100QapiPost withActvCode(String actvCode) {
        this.actvCode = actvCode;
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

    public MassTimeEntry100QapiPost withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

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

    public MassTimeEntry100QapiPost withProjCode(String projCode) {
        this.projCode = projCode;
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

    public MassTimeEntry100QapiPost withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : PHRMTIM_PERCENT
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : PHRMTIM_PERCENT
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public MassTimeEntry100QapiPost withPercent(Double percent) {
        this.percent = percent;
        return this;
    }

    /**
     * External Account Number
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("acctCodeExternal")
    public String getAcctCodeExternal() {
        return acctCodeExternal;
    }

    /**
     * External Account Number
     * <p>
     * Lineage reference object : PHRMTIM_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("acctCodeExternal")
    public void setAcctCodeExternal(String acctCodeExternal) {
        this.acctCodeExternal = acctCodeExternal;
    }

    public MassTimeEntry100QapiPost withAcctCodeExternal(String acctCodeExternal) {
        this.acctCodeExternal = acctCodeExternal;
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

    public MassTimeEntry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MassTimeEntry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("year");
        sb.append('=');
        sb.append(((this.year == null)?"<null>":this.year));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("payno");
        sb.append('=');
        sb.append(((this.payno == null)?"<null>":this.payno));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("earnCode");
        sb.append('=');
        sb.append(((this.earnCode == null)?"<null>":this.earnCode));
        sb.append(',');
        sb.append("shift");
        sb.append('=');
        sb.append(((this.shift == null)?"<null>":this.shift));
        sb.append(',');
        sb.append("hrs");
        sb.append('=');
        sb.append(((this.hrs == null)?"<null>":this.hrs));
        sb.append(',');
        sb.append("deemedHrs");
        sb.append('=');
        sb.append(((this.deemedHrs == null)?"<null>":this.deemedHrs));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("specialRate");
        sb.append('=');
        sb.append(((this.specialRate == null)?"<null>":this.specialRate));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("projCode");
        sb.append('=');
        sb.append(((this.projCode == null)?"<null>":this.projCode));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("acctCodeExternal");
        sb.append('=');
        sb.append(((this.acctCodeExternal == null)?"<null>":this.acctCodeExternal));
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
        result = ((result* 31)+((this.projCode == null)? 0 :this.projCode.hashCode()));
        result = ((result* 31)+((this.year == null)? 0 :this.year.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.shift == null)? 0 :this.shift.hashCode()));
        result = ((result* 31)+((this.specialRate == null)? 0 :this.specialRate.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.deemedHrs == null)? 0 :this.deemedHrs.hashCode()));
        result = ((result* 31)+((this.acctCodeExternal == null)? 0 :this.acctCodeExternal.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.hrs == null)? 0 :this.hrs.hashCode()));
        result = ((result* 31)+((this.earnCode == null)? 0 :this.earnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.payno == null)? 0 :this.payno.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MassTimeEntry100QapiPost) == false) {
            return false;
        }
        MassTimeEntry100QapiPost rhs = ((MassTimeEntry100QapiPost) other);
        return ((((((((((((((((((((((((((((this.projCode == rhs.projCode)||((this.projCode!= null)&&this.projCode.equals(rhs.projCode)))&&((this.year == rhs.year)||((this.year!= null)&&this.year.equals(rhs.year))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.shift == rhs.shift)||((this.shift!= null)&&this.shift.equals(rhs.shift))))&&((this.specialRate == rhs.specialRate)||((this.specialRate!= null)&&this.specialRate.equals(rhs.specialRate))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.deemedHrs == rhs.deemedHrs)||((this.deemedHrs!= null)&&this.deemedHrs.equals(rhs.deemedHrs))))&&((this.acctCodeExternal == rhs.acctCodeExternal)||((this.acctCodeExternal!= null)&&this.acctCodeExternal.equals(rhs.acctCodeExternal))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.hrs == rhs.hrs)||((this.hrs!= null)&&this.hrs.equals(rhs.hrs))))&&((this.earnCode == rhs.earnCode)||((this.earnCode!= null)&&this.earnCode.equals(rhs.earnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.payno == rhs.payno)||((this.payno!= null)&&this.payno.equals(rhs.payno))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
