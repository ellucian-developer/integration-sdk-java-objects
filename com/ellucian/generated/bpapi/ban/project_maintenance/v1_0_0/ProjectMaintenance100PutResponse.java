
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
    "ftvacciTitle",
    "acciCode",
    "ftvactvTitle",
    "coasCode",
    "orgTitle",
    "locnCode",
    "ftvacctTitle",
    "acctCode",
    "orgnCode",
    "ftvlocnTitle",
    "memoInd",
    "effDate",
    "activityDate",
    "fundCode",
    "ftvprogTitle",
    "progCode",
    "displayTextInd",
    "orgnCodeProj",
    "ftvorgnTitle",
    "termDate",
    "actvCode",
    "ftvfundTitle"
})
@Generated("jsonschema2pojo")
public class ProjectMaintenance100PutResponse {

    /**
     * Index Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvacciTitle")
    private String ftvacciTitle;
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
     * Activity Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvactvTitle")
    private String ftvactvTitle;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROJ_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Organization Title
     * <p>
     * 
     * 
     */
    @JsonProperty("orgTitle")
    private String orgTitle;
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
     * Account Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvacctTitle")
    private String ftvacctTitle;
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
     * Organization
     * <p>
     * Lineage reference object : FTVPROJ_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ORGN_CODE")
    private String orgnCode;
    /**
     * Location Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvlocnTitle")
    private String ftvlocnTitle;
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
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROJ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ACTIVITY_DATE")
    private Date activityDate;
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
     * Program Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvprogTitle")
    private String ftvprogTitle;
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
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTextInd")
    private String displayTextInd;
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
     * Organization Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvorgnTitle")
    private String ftvorgnTitle;
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
     * Activity
     * <p>
     * Lineage reference object : FTVPROJ_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROJ_ACTV_CODE")
    private String actvCode;
    /**
     * Fund Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvfundTitle")
    private String ftvfundTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Index Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvacciTitle")
    public String getFtvacciTitle() {
        return ftvacciTitle;
    }

    /**
     * Index Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvacciTitle")
    public void setFtvacciTitle(String ftvacciTitle) {
        this.ftvacciTitle = ftvacciTitle;
    }

    public ProjectMaintenance100PutResponse withFtvacciTitle(String ftvacciTitle) {
        this.ftvacciTitle = ftvacciTitle;
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

    public ProjectMaintenance100PutResponse withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Activity Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvactvTitle")
    public String getFtvactvTitle() {
        return ftvactvTitle;
    }

    /**
     * Activity Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvactvTitle")
    public void setFtvactvTitle(String ftvactvTitle) {
        this.ftvactvTitle = ftvactvTitle;
    }

    public ProjectMaintenance100PutResponse withFtvactvTitle(String ftvactvTitle) {
        this.ftvactvTitle = ftvactvTitle;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROJ_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FTVPROJ_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ProjectMaintenance100PutResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Organization Title
     * <p>
     * 
     * 
     */
    @JsonProperty("orgTitle")
    public String getOrgTitle() {
        return orgTitle;
    }

    /**
     * Organization Title
     * <p>
     * 
     * 
     */
    @JsonProperty("orgTitle")
    public void setOrgTitle(String orgTitle) {
        this.orgTitle = orgTitle;
    }

    public ProjectMaintenance100PutResponse withOrgTitle(String orgTitle) {
        this.orgTitle = orgTitle;
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

    public ProjectMaintenance100PutResponse withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Account Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvacctTitle")
    public String getFtvacctTitle() {
        return ftvacctTitle;
    }

    /**
     * Account Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvacctTitle")
    public void setFtvacctTitle(String ftvacctTitle) {
        this.ftvacctTitle = ftvacctTitle;
    }

    public ProjectMaintenance100PutResponse withFtvacctTitle(String ftvacctTitle) {
        this.ftvacctTitle = ftvacctTitle;
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

    public ProjectMaintenance100PutResponse withAcctCode(String acctCode) {
        this.acctCode = acctCode;
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

    public ProjectMaintenance100PutResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Location Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvlocnTitle")
    public String getFtvlocnTitle() {
        return ftvlocnTitle;
    }

    /**
     * Location Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvlocnTitle")
    public void setFtvlocnTitle(String ftvlocnTitle) {
        this.ftvlocnTitle = ftvlocnTitle;
    }

    public ProjectMaintenance100PutResponse withFtvlocnTitle(String ftvlocnTitle) {
        this.ftvlocnTitle = ftvlocnTitle;
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

    public ProjectMaintenance100PutResponse withMemoInd(String memoInd) {
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

    public ProjectMaintenance100PutResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROJ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROJ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ProjectMaintenance100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public ProjectMaintenance100PutResponse withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Program Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvprogTitle")
    public String getFtvprogTitle() {
        return ftvprogTitle;
    }

    /**
     * Program Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvprogTitle")
    public void setFtvprogTitle(String ftvprogTitle) {
        this.ftvprogTitle = ftvprogTitle;
    }

    public ProjectMaintenance100PutResponse withFtvprogTitle(String ftvprogTitle) {
        this.ftvprogTitle = ftvprogTitle;
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

    public ProjectMaintenance100PutResponse withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTextInd")
    public String getDisplayTextInd() {
        return displayTextInd;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("displayTextInd")
    public void setDisplayTextInd(String displayTextInd) {
        this.displayTextInd = displayTextInd;
    }

    public ProjectMaintenance100PutResponse withDisplayTextInd(String displayTextInd) {
        this.displayTextInd = displayTextInd;
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

    public ProjectMaintenance100PutResponse withOrgnCodeProj(String orgnCodeProj) {
        this.orgnCodeProj = orgnCodeProj;
        return this;
    }

    /**
     * Organization Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvorgnTitle")
    public String getFtvorgnTitle() {
        return ftvorgnTitle;
    }

    /**
     * Organization Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvorgnTitle")
    public void setFtvorgnTitle(String ftvorgnTitle) {
        this.ftvorgnTitle = ftvorgnTitle;
    }

    public ProjectMaintenance100PutResponse withFtvorgnTitle(String ftvorgnTitle) {
        this.ftvorgnTitle = ftvorgnTitle;
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

    public ProjectMaintenance100PutResponse withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public ProjectMaintenance100PutResponse withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Fund Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvfundTitle")
    public String getFtvfundTitle() {
        return ftvfundTitle;
    }

    /**
     * Fund Title
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvfundTitle")
    public void setFtvfundTitle(String ftvfundTitle) {
        this.ftvfundTitle = ftvfundTitle;
    }

    public ProjectMaintenance100PutResponse withFtvfundTitle(String ftvfundTitle) {
        this.ftvfundTitle = ftvfundTitle;
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

    public ProjectMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvacciTitle");
        sb.append('=');
        sb.append(((this.ftvacciTitle == null)?"<null>":this.ftvacciTitle));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("ftvactvTitle");
        sb.append('=');
        sb.append(((this.ftvactvTitle == null)?"<null>":this.ftvactvTitle));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("orgTitle");
        sb.append('=');
        sb.append(((this.orgTitle == null)?"<null>":this.orgTitle));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("ftvacctTitle");
        sb.append('=');
        sb.append(((this.ftvacctTitle == null)?"<null>":this.ftvacctTitle));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("ftvlocnTitle");
        sb.append('=');
        sb.append(((this.ftvlocnTitle == null)?"<null>":this.ftvlocnTitle));
        sb.append(',');
        sb.append("memoInd");
        sb.append('=');
        sb.append(((this.memoInd == null)?"<null>":this.memoInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("ftvprogTitle");
        sb.append('=');
        sb.append(((this.ftvprogTitle == null)?"<null>":this.ftvprogTitle));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("displayTextInd");
        sb.append('=');
        sb.append(((this.displayTextInd == null)?"<null>":this.displayTextInd));
        sb.append(',');
        sb.append("orgnCodeProj");
        sb.append('=');
        sb.append(((this.orgnCodeProj == null)?"<null>":this.orgnCodeProj));
        sb.append(',');
        sb.append("ftvorgnTitle");
        sb.append('=');
        sb.append(((this.ftvorgnTitle == null)?"<null>":this.ftvorgnTitle));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("ftvfundTitle");
        sb.append('=');
        sb.append(((this.ftvfundTitle == null)?"<null>":this.ftvfundTitle));
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
        result = ((result* 31)+((this.ftvacciTitle == null)? 0 :this.ftvacciTitle.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.ftvactvTitle == null)? 0 :this.ftvactvTitle.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.orgTitle == null)? 0 :this.orgTitle.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.ftvacctTitle == null)? 0 :this.ftvacctTitle.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.ftvlocnTitle == null)? 0 :this.ftvlocnTitle.hashCode()));
        result = ((result* 31)+((this.memoInd == null)? 0 :this.memoInd.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.ftvprogTitle == null)? 0 :this.ftvprogTitle.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.displayTextInd == null)? 0 :this.displayTextInd.hashCode()));
        result = ((result* 31)+((this.orgnCodeProj == null)? 0 :this.orgnCodeProj.hashCode()));
        result = ((result* 31)+((this.ftvorgnTitle == null)? 0 :this.ftvorgnTitle.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.ftvfundTitle == null)? 0 :this.ftvfundTitle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectMaintenance100PutResponse) == false) {
            return false;
        }
        ProjectMaintenance100PutResponse rhs = ((ProjectMaintenance100PutResponse) other);
        return ((((((((((((((((((((((((this.ftvacciTitle == rhs.ftvacciTitle)||((this.ftvacciTitle!= null)&&this.ftvacciTitle.equals(rhs.ftvacciTitle)))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.ftvactvTitle == rhs.ftvactvTitle)||((this.ftvactvTitle!= null)&&this.ftvactvTitle.equals(rhs.ftvactvTitle))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.orgTitle == rhs.orgTitle)||((this.orgTitle!= null)&&this.orgTitle.equals(rhs.orgTitle))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.ftvacctTitle == rhs.ftvacctTitle)||((this.ftvacctTitle!= null)&&this.ftvacctTitle.equals(rhs.ftvacctTitle))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.ftvlocnTitle == rhs.ftvlocnTitle)||((this.ftvlocnTitle!= null)&&this.ftvlocnTitle.equals(rhs.ftvlocnTitle))))&&((this.memoInd == rhs.memoInd)||((this.memoInd!= null)&&this.memoInd.equals(rhs.memoInd))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.ftvprogTitle == rhs.ftvprogTitle)||((this.ftvprogTitle!= null)&&this.ftvprogTitle.equals(rhs.ftvprogTitle))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.displayTextInd == rhs.displayTextInd)||((this.displayTextInd!= null)&&this.displayTextInd.equals(rhs.displayTextInd))))&&((this.orgnCodeProj == rhs.orgnCodeProj)||((this.orgnCodeProj!= null)&&this.orgnCodeProj.equals(rhs.orgnCodeProj))))&&((this.ftvorgnTitle == rhs.ftvorgnTitle)||((this.ftvorgnTitle!= null)&&this.ftvorgnTitle.equals(rhs.ftvorgnTitle))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.ftvfundTitle == rhs.ftvfundTitle)||((this.ftvfundTitle!= null)&&this.ftvfundTitle.equals(rhs.ftvfundTitle))));
    }

}
