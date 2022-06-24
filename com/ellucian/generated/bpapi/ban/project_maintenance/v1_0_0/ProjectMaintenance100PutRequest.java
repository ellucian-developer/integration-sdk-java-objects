
package com.ellucian.generated.bpapi.ban.project_maintenance.v1_0_0;

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
    "criteria.progCode",
    "locnCode",
    "criteria.memoInd",
    "criteria.termDate",
    "orgnCode",
    "memoInd",
    "effDate",
    "criteria.acciCode",
    "fundCode",
    "progCode",
    "criteria.coasCode",
    "actvCode",
    "criteria.effDate",
    "projDesc",
    "criteria.fundCode",
    "criteria.locnCode",
    "criteria.acctCode",
    "acciCode",
    "criteria.actvCode",
    "acctCode",
    "ftmprojProjCode",
    "criteria.orgnCodeProj",
    "orgnCodeProj",
    "termDate",
    "criteria.orgnCode"
})
@Generated("jsonschema2pojo")
public class ProjectMaintenance100PutRequest {

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROJ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROJ_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_PROG_CODE")
    private String criteriaProgCode;
    /**
     * Location
     * <p>
     * Lineage reference object : FTVPROJ_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_LOCN_CODE")
    private String locnCode;
    /**
     * Memo Project
     * <p>
     * Lineage reference object : FTVPROJ_MEMO_IND
     * 
     */
    @JsonProperty("criteria.memoInd")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_MEMO_IND")
    private String criteriaMemoInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROJ_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ORGN_CODE")
    private String orgnCode;
    /**
     * Memo Project
     * <p>
     * Lineage reference object : FTVPROJ_MEMO_IND
     * 
     */
    @JsonProperty("memoInd")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_MEMO_IND")
    private String memoInd;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVPROJ_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_EFF_DATE")
    private Date effDate;
    /**
     * Index
     * <p>
     * Lineage reference object : FTVPROJ_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("criteria.acciCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String criteriaAcciCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : FTVPROJ_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_FUND_CODE")
    private String fundCode;
    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROJ_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_PROG_CODE")
    private String progCode;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROJ_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : FTVPROJ_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ACTV_CODE")
    private String actvCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVPROJ_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Title
     * <p>
     * Lineage reference object : projDesc
     * 
     */
    @JsonProperty("projDesc")
    @JsonPropertyDescription("Lineage reference object : projDesc")
    private String projDesc;
    /**
     * Fund
     * <p>
     * Lineage reference object : FTVPROJ_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_FUND_CODE")
    private String criteriaFundCode;
    /**
     * Location
     * <p>
     * Lineage reference object : FTVPROJ_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_LOCN_CODE")
    private String criteriaLocnCode;
    /**
     * Account
     * <p>
     * Lineage reference object : FTVPROJ_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ACCT_CODE")
    private String criteriaAcctCode;
    /**
     * Index
     * <p>
     * Lineage reference object : FTVPROJ_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String acciCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : FTVPROJ_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ACTV_CODE")
    private String criteriaActvCode;
    /**
     * Account
     * <p>
     * Lineage reference object : FTVPROJ_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ACCT_CODE")
    private String acctCode;
    /**
     * Project Code
     * <p>
     * Lineage reference object : ftmprojProjCode, Lookup lineage reference object : ftvproj
     * 
     */
    @JsonProperty("ftmprojProjCode")
    @JsonPropertyDescription("Lineage reference object : ftmprojProjCode, Lookup lineage reference object : ftvproj")
    private String ftmprojProjCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE_PROJ
     * 
     */
    @JsonProperty("criteria.orgnCodeProj")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ORGN_CODE_PROJ")
    private String criteriaOrgnCodeProj;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE_PROJ
     * 
     */
    @JsonProperty("orgnCodeProj")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ORGN_CODE_PROJ")
    private String orgnCodeProj;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROJ_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_TERM_DATE")
    private Date termDate;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ORGN_CODE")
    private String criteriaOrgnCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROJ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROJ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public ProjectMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROJ_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public String getCriteriaProgCode() {
        return criteriaProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROJ_PROG_CODE
     * 
     */
    @JsonProperty("criteria.progCode")
    public void setCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
    }

    public ProjectMaintenance100PutRequest withCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVPROJ_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVPROJ_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public ProjectMaintenance100PutRequest withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Memo Project
     * <p>
     * Lineage reference object : FTVPROJ_MEMO_IND
     * 
     */
    @JsonProperty("criteria.memoInd")
    public String getCriteriaMemoInd() {
        return criteriaMemoInd;
    }

    /**
     * Memo Project
     * <p>
     * Lineage reference object : FTVPROJ_MEMO_IND
     * 
     */
    @JsonProperty("criteria.memoInd")
    public void setCriteriaMemoInd(String criteriaMemoInd) {
        this.criteriaMemoInd = criteriaMemoInd;
    }

    public ProjectMaintenance100PutRequest withCriteriaMemoInd(String criteriaMemoInd) {
        this.criteriaMemoInd = criteriaMemoInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROJ_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROJ_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public ProjectMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public ProjectMaintenance100PutRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Memo Project
     * <p>
     * Lineage reference object : FTVPROJ_MEMO_IND
     * 
     */
    @JsonProperty("memoInd")
    public String getMemoInd() {
        return memoInd;
    }

    /**
     * Memo Project
     * <p>
     * Lineage reference object : FTVPROJ_MEMO_IND
     * 
     */
    @JsonProperty("memoInd")
    public void setMemoInd(String memoInd) {
        this.memoInd = memoInd;
    }

    public ProjectMaintenance100PutRequest withMemoInd(String memoInd) {
        this.memoInd = memoInd;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVPROJ_EFF_DATE
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
     * Lineage reference object : FTVPROJ_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public ProjectMaintenance100PutRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FTVPROJ_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("criteria.acciCode")
    public String getCriteriaAcciCode() {
        return criteriaAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FTVPROJ_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("criteria.acciCode")
    public void setCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
    }

    public ProjectMaintenance100PutRequest withCriteriaAcciCode(String criteriaAcciCode) {
        this.criteriaAcciCode = criteriaAcciCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVPROJ_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVPROJ_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public ProjectMaintenance100PutRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROJ_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROJ_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public ProjectMaintenance100PutRequest withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROJ_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROJ_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public ProjectMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FTVPROJ_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FTVPROJ_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public ProjectMaintenance100PutRequest withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVPROJ_EFF_DATE
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
     * Lineage reference object : FTVPROJ_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public ProjectMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : projDesc
     * 
     */
    @JsonProperty("projDesc")
    public String getProjDesc() {
        return projDesc;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : projDesc
     * 
     */
    @JsonProperty("projDesc")
    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc;
    }

    public ProjectMaintenance100PutRequest withProjDesc(String projDesc) {
        this.projDesc = projDesc;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVPROJ_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public String getCriteriaFundCode() {
        return criteriaFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVPROJ_FUND_CODE
     * 
     */
    @JsonProperty("criteria.fundCode")
    public void setCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
    }

    public ProjectMaintenance100PutRequest withCriteriaFundCode(String criteriaFundCode) {
        this.criteriaFundCode = criteriaFundCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVPROJ_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public String getCriteriaLocnCode() {
        return criteriaLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVPROJ_LOCN_CODE
     * 
     */
    @JsonProperty("criteria.locnCode")
    public void setCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
    }

    public ProjectMaintenance100PutRequest withCriteriaLocnCode(String criteriaLocnCode) {
        this.criteriaLocnCode = criteriaLocnCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVPROJ_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public String getCriteriaAcctCode() {
        return criteriaAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVPROJ_ACCT_CODE
     * 
     */
    @JsonProperty("criteria.acctCode")
    public void setCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
    }

    public ProjectMaintenance100PutRequest withCriteriaAcctCode(String criteriaAcctCode) {
        this.criteriaAcctCode = criteriaAcctCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FTVPROJ_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FTVPROJ_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public ProjectMaintenance100PutRequest withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FTVPROJ_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public String getCriteriaActvCode() {
        return criteriaActvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FTVPROJ_ACTV_CODE
     * 
     */
    @JsonProperty("criteria.actvCode")
    public void setCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
    }

    public ProjectMaintenance100PutRequest withCriteriaActvCode(String criteriaActvCode) {
        this.criteriaActvCode = criteriaActvCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVPROJ_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVPROJ_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public ProjectMaintenance100PutRequest withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Project Code
     * <p>
     * Lineage reference object : ftmprojProjCode, Lookup lineage reference object : ftvproj
     * 
     */
    @JsonProperty("ftmprojProjCode")
    public String getFtmprojProjCode() {
        return ftmprojProjCode;
    }

    /**
     * Project Code
     * <p>
     * Lineage reference object : ftmprojProjCode, Lookup lineage reference object : ftvproj
     * 
     */
    @JsonProperty("ftmprojProjCode")
    public void setFtmprojProjCode(String ftmprojProjCode) {
        this.ftmprojProjCode = ftmprojProjCode;
    }

    public ProjectMaintenance100PutRequest withFtmprojProjCode(String ftmprojProjCode) {
        this.ftmprojProjCode = ftmprojProjCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE_PROJ
     * 
     */
    @JsonProperty("criteria.orgnCodeProj")
    public String getCriteriaOrgnCodeProj() {
        return criteriaOrgnCodeProj;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE_PROJ
     * 
     */
    @JsonProperty("criteria.orgnCodeProj")
    public void setCriteriaOrgnCodeProj(String criteriaOrgnCodeProj) {
        this.criteriaOrgnCodeProj = criteriaOrgnCodeProj;
    }

    public ProjectMaintenance100PutRequest withCriteriaOrgnCodeProj(String criteriaOrgnCodeProj) {
        this.criteriaOrgnCodeProj = criteriaOrgnCodeProj;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE_PROJ
     * 
     */
    @JsonProperty("orgnCodeProj")
    public String getOrgnCodeProj() {
        return orgnCodeProj;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE_PROJ
     * 
     */
    @JsonProperty("orgnCodeProj")
    public void setOrgnCodeProj(String orgnCodeProj) {
        this.orgnCodeProj = orgnCodeProj;
    }

    public ProjectMaintenance100PutRequest withOrgnCodeProj(String orgnCodeProj) {
        this.orgnCodeProj = orgnCodeProj;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROJ_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROJ_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public ProjectMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public ProjectMaintenance100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
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

    public ProjectMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaProgCode");
        sb.append('=');
        sb.append(((this.criteriaProgCode == null)?"<null>":this.criteriaProgCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("criteriaMemoInd");
        sb.append('=');
        sb.append(((this.criteriaMemoInd == null)?"<null>":this.criteriaMemoInd));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("memoInd");
        sb.append('=');
        sb.append(((this.memoInd == null)?"<null>":this.memoInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("criteriaAcciCode");
        sb.append('=');
        sb.append(((this.criteriaAcciCode == null)?"<null>":this.criteriaAcciCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
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
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("projDesc");
        sb.append('=');
        sb.append(((this.projDesc == null)?"<null>":this.projDesc));
        sb.append(',');
        sb.append("criteriaFundCode");
        sb.append('=');
        sb.append(((this.criteriaFundCode == null)?"<null>":this.criteriaFundCode));
        sb.append(',');
        sb.append("criteriaLocnCode");
        sb.append('=');
        sb.append(((this.criteriaLocnCode == null)?"<null>":this.criteriaLocnCode));
        sb.append(',');
        sb.append("criteriaAcctCode");
        sb.append('=');
        sb.append(((this.criteriaAcctCode == null)?"<null>":this.criteriaAcctCode));
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
        sb.append("ftmprojProjCode");
        sb.append('=');
        sb.append(((this.ftmprojProjCode == null)?"<null>":this.ftmprojProjCode));
        sb.append(',');
        sb.append("criteriaOrgnCodeProj");
        sb.append('=');
        sb.append(((this.criteriaOrgnCodeProj == null)?"<null>":this.criteriaOrgnCodeProj));
        sb.append(',');
        sb.append("orgnCodeProj");
        sb.append('=');
        sb.append(((this.orgnCodeProj == null)?"<null>":this.orgnCodeProj));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.criteriaActvCode == null)? 0 :this.criteriaActvCode.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcctCode == null)? 0 :this.criteriaAcctCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCodeProj == null)? 0 :this.criteriaOrgnCodeProj.hashCode()));
        result = ((result* 31)+((this.memoInd == null)? 0 :this.memoInd.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.criteriaMemoInd == null)? 0 :this.criteriaMemoInd.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.projDesc == null)? 0 :this.projDesc.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaAcciCode == null)? 0 :this.criteriaAcciCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.criteriaProgCode == null)? 0 :this.criteriaProgCode.hashCode()));
        result = ((result* 31)+((this.ftmprojProjCode == null)? 0 :this.ftmprojProjCode.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCode == null)? 0 :this.criteriaOrgnCode.hashCode()));
        result = ((result* 31)+((this.orgnCodeProj == null)? 0 :this.orgnCodeProj.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectMaintenance100PutRequest) == false) {
            return false;
        }
        ProjectMaintenance100PutRequest rhs = ((ProjectMaintenance100PutRequest) other);
        return ((((((((((((((((((((((((((((this.criteriaFundCode == rhs.criteriaFundCode)||((this.criteriaFundCode!= null)&&this.criteriaFundCode.equals(rhs.criteriaFundCode)))&&((this.criteriaLocnCode == rhs.criteriaLocnCode)||((this.criteriaLocnCode!= null)&&this.criteriaLocnCode.equals(rhs.criteriaLocnCode))))&&((this.criteriaActvCode == rhs.criteriaActvCode)||((this.criteriaActvCode!= null)&&this.criteriaActvCode.equals(rhs.criteriaActvCode))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaAcctCode == rhs.criteriaAcctCode)||((this.criteriaAcctCode!= null)&&this.criteriaAcctCode.equals(rhs.criteriaAcctCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.criteriaOrgnCodeProj == rhs.criteriaOrgnCodeProj)||((this.criteriaOrgnCodeProj!= null)&&this.criteriaOrgnCodeProj.equals(rhs.criteriaOrgnCodeProj))))&&((this.memoInd == rhs.memoInd)||((this.memoInd!= null)&&this.memoInd.equals(rhs.memoInd))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.criteriaMemoInd == rhs.criteriaMemoInd)||((this.criteriaMemoInd!= null)&&this.criteriaMemoInd.equals(rhs.criteriaMemoInd))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.projDesc == rhs.projDesc)||((this.projDesc!= null)&&this.projDesc.equals(rhs.projDesc))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaAcciCode == rhs.criteriaAcciCode)||((this.criteriaAcciCode!= null)&&this.criteriaAcciCode.equals(rhs.criteriaAcciCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.criteriaProgCode == rhs.criteriaProgCode)||((this.criteriaProgCode!= null)&&this.criteriaProgCode.equals(rhs.criteriaProgCode))))&&((this.ftmprojProjCode == rhs.ftmprojProjCode)||((this.ftmprojProjCode!= null)&&this.ftmprojProjCode.equals(rhs.ftmprojProjCode))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.orgnCodeProj == rhs.orgnCodeProj)||((this.orgnCodeProj!= null)&&this.orgnCodeProj.equals(rhs.orgnCodeProj))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
