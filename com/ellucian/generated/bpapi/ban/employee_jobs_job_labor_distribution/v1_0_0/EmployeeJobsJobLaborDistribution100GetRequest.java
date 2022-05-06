
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
    "projCode",
    "encOverrideEndDate",
    "acctCodeExternal",
    "acciCode",
    "coasCode",
    "locnCode",
    "orgnCode",
    "acctCode",
    "percent",
    "posn",
    "queryDate",
    "suff",
    "fundCode",
    "progCode",
    "ctypCode",
    "id",
    "actvCode"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsJobLaborDistribution100GetRequest {

    /**
     * Project
     * <p>
     * Lineage reference object : NBRJLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_PROJ_CODE")
    private String projCode;
    /**
     * Encumbrance Override End Date
     * <p>
     * Lineage reference object : NBRJLBD_ENC_OVERRIDE_END_DATE
     * 
     */
    @JsonProperty("encOverrideEndDate")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ENC_OVERRIDE_END_DATE")
    private Date encOverrideEndDate;
    /**
     * External Account Code
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("acctCodeExternal")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ACCT_CODE_EXTERNAL")
    private String acctCodeExternal;
    /**
     * Index
     * <p>
     * Lineage reference object : NBRJLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ACCI_CODE")
    private String acciCode;
    /**
     * COA
     * <p>
     * Lineage reference object : NBRJLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_COAS_CODE")
    private String coasCode;
    /**
     * Location
     * <p>
     * Lineage reference object : NBRJLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_LOCN_CODE")
    private String locnCode;
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
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("percent")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_PERCENT")
    private Double percent;
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
     * Fund
     * <p>
     * Lineage reference object : NBRJLBD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_FUND_CODE")
    private String fundCode;
    /**
     * Program
     * <p>
     * Lineage reference object : NBRJLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_PROG_CODE")
    private String progCode;
    /**
     * Cost
     * <p>
     * Lineage reference object : NBRJLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_CTYP_CODE")
    private String ctypCode;
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
     * Activity
     * <p>
     * Lineage reference object : NBRJLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : NBRJLBD_ACTV_CODE")
    private String actvCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Project
     * <p>
     * Lineage reference object : NBRJLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public String getProjCode() {
        return projCode;
    }

    /**
     * Project
     * <p>
     * Lineage reference object : NBRJLBD_PROJ_CODE
     * 
     */
    @JsonProperty("projCode")
    public void setProjCode(String projCode) {
        this.projCode = projCode;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withProjCode(String projCode) {
        this.projCode = projCode;
        return this;
    }

    /**
     * Encumbrance Override End Date
     * <p>
     * Lineage reference object : NBRJLBD_ENC_OVERRIDE_END_DATE
     * 
     */
    @JsonProperty("encOverrideEndDate")
    public Date getEncOverrideEndDate() {
        return encOverrideEndDate;
    }

    /**
     * Encumbrance Override End Date
     * <p>
     * Lineage reference object : NBRJLBD_ENC_OVERRIDE_END_DATE
     * 
     */
    @JsonProperty("encOverrideEndDate")
    public void setEncOverrideEndDate(Date encOverrideEndDate) {
        this.encOverrideEndDate = encOverrideEndDate;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withEncOverrideEndDate(Date encOverrideEndDate) {
        this.encOverrideEndDate = encOverrideEndDate;
        return this;
    }

    /**
     * External Account Code
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("acctCodeExternal")
    public String getAcctCodeExternal() {
        return acctCodeExternal;
    }

    /**
     * External Account Code
     * <p>
     * Lineage reference object : NBRJLBD_ACCT_CODE_EXTERNAL
     * 
     */
    @JsonProperty("acctCodeExternal")
    public void setAcctCodeExternal(String acctCodeExternal) {
        this.acctCodeExternal = acctCodeExternal;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withAcctCodeExternal(String acctCodeExternal) {
        this.acctCodeExternal = acctCodeExternal;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : NBRJLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : NBRJLBD_ACCI_CODE
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBRJLBD_COAS_CODE
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
     * Lineage reference object : NBRJLBD_COAS_CODE
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : NBRJLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : NBRJLBD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withLocnCode(String locnCode) {
        this.locnCode = locnCode;
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

    public EmployeeJobsJobLaborDistribution100GetRequest withOrgnCode(String orgnCode) {
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

    public EmployeeJobsJobLaborDistribution100GetRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("percent")
    public Double getPercent() {
        return percent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : NBRJLBD_PERCENT
     * 
     */
    @JsonProperty("percent")
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withPercent(Double percent) {
        this.percent = percent;
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

    public EmployeeJobsJobLaborDistribution100GetRequest withPosn(Object posn) {
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

    public EmployeeJobsJobLaborDistribution100GetRequest withQueryDate(Object queryDate) {
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

    public EmployeeJobsJobLaborDistribution100GetRequest withSuff(Object suff) {
        this.suff = suff;
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

    public EmployeeJobsJobLaborDistribution100GetRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : NBRJLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : NBRJLBD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : NBRJLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Cost
     * <p>
     * Lineage reference object : NBRJLBD_CTYP_CODE
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
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

    public EmployeeJobsJobLaborDistribution100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : NBRJLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : NBRJLBD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public EmployeeJobsJobLaborDistribution100GetRequest withActvCode(String actvCode) {
        this.actvCode = actvCode;
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

    public EmployeeJobsJobLaborDistribution100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsJobLaborDistribution100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projCode");
        sb.append('=');
        sb.append(((this.projCode == null)?"<null>":this.projCode));
        sb.append(',');
        sb.append("encOverrideEndDate");
        sb.append('=');
        sb.append(((this.encOverrideEndDate == null)?"<null>":this.encOverrideEndDate));
        sb.append(',');
        sb.append("acctCodeExternal");
        sb.append('=');
        sb.append(((this.acctCodeExternal == null)?"<null>":this.acctCodeExternal));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
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
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
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
        result = ((result* 31)+((this.encOverrideEndDate == null)? 0 :this.encOverrideEndDate.hashCode()));
        result = ((result* 31)+((this.acctCodeExternal == null)? 0 :this.acctCodeExternal.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeJobsJobLaborDistribution100GetRequest) == false) {
            return false;
        }
        EmployeeJobsJobLaborDistribution100GetRequest rhs = ((EmployeeJobsJobLaborDistribution100GetRequest) other);
        return (((((((((((((((((((this.projCode == rhs.projCode)||((this.projCode!= null)&&this.projCode.equals(rhs.projCode)))&&((this.encOverrideEndDate == rhs.encOverrideEndDate)||((this.encOverrideEndDate!= null)&&this.encOverrideEndDate.equals(rhs.encOverrideEndDate))))&&((this.acctCodeExternal == rhs.acctCodeExternal)||((this.acctCodeExternal!= null)&&this.acctCodeExternal.equals(rhs.acctCodeExternal))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))));
    }

}
