
package com.ellucian.generated.bpapi.ban.account_index_code_maintenance.v1_0_0;

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
    "locnOverride",
    "coasCode",
    "locnCode",
    "title",
    "orgnCode",
    "effDate",
    "activityDate",
    "actvOverride",
    "fundCode",
    "statusInd",
    "progCode",
    "fundCodeTitle",
    "actvCode",
    "actvCodeTitle",
    "orgnCodeTitle",
    "acctOverride",
    "progOverride",
    "acciCode",
    "acctCode",
    "acctCodeTitle",
    "locnCodeTitle",
    "orgnOverride",
    "displayNchgDate",
    "fundOverride",
    "progCodeTitle",
    "termDate"
})
@Generated("jsonschema2pojo")
public class AccountIndexCodeMaintenance100PostResponse {

    /**
     * Lineage reference object : FTVACCI_LOCN_OVERRIDE
     * 
     */
    @JsonProperty("locnOverride")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_LOCN_OVERRIDE")
    private String locnOverride;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVACCI_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Location
     * <p>
     * Lineage reference object : FTVACCI_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_LOCN_CODE")
    private String locnCode;
    /**
     * Account Index Title
     * <p>
     * Lineage reference object : FTVACCI_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_TITLE")
    private String title;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVACCI_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_ORGN_CODE")
    private String orgnCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCI_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_EFF_DATE")
    private Date effDate;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVACCI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : FTVACCI_ACTV_OVERRIDE
     * 
     */
    @JsonProperty("actvOverride")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_ACTV_OVERRIDE")
    private String actvOverride;
    /**
     * Fund
     * <p>
     * Lineage reference object : FTVACCI_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_FUND_CODE")
    private String fundCode;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVACCI_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_STATUS_IND")
    private String statusInd;
    /**
     * Program
     * <p>
     * Lineage reference object : FTVACCI_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_PROG_CODE")
    private String progCode;
    @JsonProperty("fundCodeTitle")
    private String fundCodeTitle;
    /**
     * Activity
     * <p>
     * Lineage reference object : FTVACCI_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_ACTV_CODE")
    private String actvCode;
    @JsonProperty("actvCodeTitle")
    private String actvCodeTitle;
    @JsonProperty("orgnCodeTitle")
    private String orgnCodeTitle;
    /**
     * Lineage reference object : FTVACCI_ACCT_OVERRIDE
     * 
     */
    @JsonProperty("acctOverride")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_ACCT_OVERRIDE")
    private String acctOverride;
    /**
     * Lineage reference object : FTVACCI_PROG_OVERRIDE
     * 
     */
    @JsonProperty("progOverride")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_PROG_OVERRIDE")
    private String progOverride;
    /**
     * Account Index
     * <p>
     * Lineage reference object : FTVACCI_ACCI_CODE, Lookup lineage reference object : ftvacci
     * (Required)
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String acciCode;
    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCI_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_ACCT_CODE")
    private String acctCode;
    @JsonProperty("acctCodeTitle")
    private String acctCodeTitle;
    @JsonProperty("locnCodeTitle")
    private String locnCodeTitle;
    /**
     * Lineage reference object : FTVACCI_ORGN_OVERRIDE
     * 
     */
    @JsonProperty("orgnOverride")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_ORGN_OVERRIDE")
    private String orgnOverride;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    /**
     * Lineage reference object : FTVACCI_FUND_OVERRIDE
     * 
     */
    @JsonProperty("fundOverride")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_FUND_OVERRIDE")
    private String fundOverride;
    @JsonProperty("progCodeTitle")
    private String progCodeTitle;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCI_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCI_TERM_DATE")
    private Date termDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : FTVACCI_LOCN_OVERRIDE
     * 
     */
    @JsonProperty("locnOverride")
    public String getLocnOverride() {
        return locnOverride;
    }

    /**
     * Lineage reference object : FTVACCI_LOCN_OVERRIDE
     * 
     */
    @JsonProperty("locnOverride")
    public void setLocnOverride(String locnOverride) {
        this.locnOverride = locnOverride;
    }

    public AccountIndexCodeMaintenance100PostResponse withLocnOverride(String locnOverride) {
        this.locnOverride = locnOverride;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVACCI_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FTVACCI_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public AccountIndexCodeMaintenance100PostResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVACCI_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FTVACCI_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public AccountIndexCodeMaintenance100PostResponse withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Account Index Title
     * <p>
     * Lineage reference object : FTVACCI_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Account Index Title
     * <p>
     * Lineage reference object : FTVACCI_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AccountIndexCodeMaintenance100PostResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVACCI_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVACCI_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public AccountIndexCodeMaintenance100PostResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCI_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCI_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public AccountIndexCodeMaintenance100PostResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVACCI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVACCI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AccountIndexCodeMaintenance100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : FTVACCI_ACTV_OVERRIDE
     * 
     */
    @JsonProperty("actvOverride")
    public String getActvOverride() {
        return actvOverride;
    }

    /**
     * Lineage reference object : FTVACCI_ACTV_OVERRIDE
     * 
     */
    @JsonProperty("actvOverride")
    public void setActvOverride(String actvOverride) {
        this.actvOverride = actvOverride;
    }

    public AccountIndexCodeMaintenance100PostResponse withActvOverride(String actvOverride) {
        this.actvOverride = actvOverride;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVACCI_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FTVACCI_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public AccountIndexCodeMaintenance100PostResponse withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVACCI_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVACCI_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public AccountIndexCodeMaintenance100PostResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVACCI_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVACCI_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public AccountIndexCodeMaintenance100PostResponse withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    @JsonProperty("fundCodeTitle")
    public String getFundCodeTitle() {
        return fundCodeTitle;
    }

    @JsonProperty("fundCodeTitle")
    public void setFundCodeTitle(String fundCodeTitle) {
        this.fundCodeTitle = fundCodeTitle;
    }

    public AccountIndexCodeMaintenance100PostResponse withFundCodeTitle(String fundCodeTitle) {
        this.fundCodeTitle = fundCodeTitle;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FTVACCI_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FTVACCI_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public AccountIndexCodeMaintenance100PostResponse withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    @JsonProperty("actvCodeTitle")
    public String getActvCodeTitle() {
        return actvCodeTitle;
    }

    @JsonProperty("actvCodeTitle")
    public void setActvCodeTitle(String actvCodeTitle) {
        this.actvCodeTitle = actvCodeTitle;
    }

    public AccountIndexCodeMaintenance100PostResponse withActvCodeTitle(String actvCodeTitle) {
        this.actvCodeTitle = actvCodeTitle;
        return this;
    }

    @JsonProperty("orgnCodeTitle")
    public String getOrgnCodeTitle() {
        return orgnCodeTitle;
    }

    @JsonProperty("orgnCodeTitle")
    public void setOrgnCodeTitle(String orgnCodeTitle) {
        this.orgnCodeTitle = orgnCodeTitle;
    }

    public AccountIndexCodeMaintenance100PostResponse withOrgnCodeTitle(String orgnCodeTitle) {
        this.orgnCodeTitle = orgnCodeTitle;
        return this;
    }

    /**
     * Lineage reference object : FTVACCI_ACCT_OVERRIDE
     * 
     */
    @JsonProperty("acctOverride")
    public String getAcctOverride() {
        return acctOverride;
    }

    /**
     * Lineage reference object : FTVACCI_ACCT_OVERRIDE
     * 
     */
    @JsonProperty("acctOverride")
    public void setAcctOverride(String acctOverride) {
        this.acctOverride = acctOverride;
    }

    public AccountIndexCodeMaintenance100PostResponse withAcctOverride(String acctOverride) {
        this.acctOverride = acctOverride;
        return this;
    }

    /**
     * Lineage reference object : FTVACCI_PROG_OVERRIDE
     * 
     */
    @JsonProperty("progOverride")
    public String getProgOverride() {
        return progOverride;
    }

    /**
     * Lineage reference object : FTVACCI_PROG_OVERRIDE
     * 
     */
    @JsonProperty("progOverride")
    public void setProgOverride(String progOverride) {
        this.progOverride = progOverride;
    }

    public AccountIndexCodeMaintenance100PostResponse withProgOverride(String progOverride) {
        this.progOverride = progOverride;
        return this;
    }

    /**
     * Account Index
     * <p>
     * Lineage reference object : FTVACCI_ACCI_CODE, Lookup lineage reference object : ftvacci
     * (Required)
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Account Index
     * <p>
     * Lineage reference object : FTVACCI_ACCI_CODE, Lookup lineage reference object : ftvacci
     * (Required)
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public AccountIndexCodeMaintenance100PostResponse withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCI_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCI_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public AccountIndexCodeMaintenance100PostResponse withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    @JsonProperty("acctCodeTitle")
    public String getAcctCodeTitle() {
        return acctCodeTitle;
    }

    @JsonProperty("acctCodeTitle")
    public void setAcctCodeTitle(String acctCodeTitle) {
        this.acctCodeTitle = acctCodeTitle;
    }

    public AccountIndexCodeMaintenance100PostResponse withAcctCodeTitle(String acctCodeTitle) {
        this.acctCodeTitle = acctCodeTitle;
        return this;
    }

    @JsonProperty("locnCodeTitle")
    public String getLocnCodeTitle() {
        return locnCodeTitle;
    }

    @JsonProperty("locnCodeTitle")
    public void setLocnCodeTitle(String locnCodeTitle) {
        this.locnCodeTitle = locnCodeTitle;
    }

    public AccountIndexCodeMaintenance100PostResponse withLocnCodeTitle(String locnCodeTitle) {
        this.locnCodeTitle = locnCodeTitle;
        return this;
    }

    /**
     * Lineage reference object : FTVACCI_ORGN_OVERRIDE
     * 
     */
    @JsonProperty("orgnOverride")
    public String getOrgnOverride() {
        return orgnOverride;
    }

    /**
     * Lineage reference object : FTVACCI_ORGN_OVERRIDE
     * 
     */
    @JsonProperty("orgnOverride")
    public void setOrgnOverride(String orgnOverride) {
        this.orgnOverride = orgnOverride;
    }

    public AccountIndexCodeMaintenance100PostResponse withOrgnOverride(String orgnOverride) {
        this.orgnOverride = orgnOverride;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public Date getDisplayNchgDate() {
        return displayNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public void setDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
    }

    public AccountIndexCodeMaintenance100PostResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    /**
     * Lineage reference object : FTVACCI_FUND_OVERRIDE
     * 
     */
    @JsonProperty("fundOverride")
    public String getFundOverride() {
        return fundOverride;
    }

    /**
     * Lineage reference object : FTVACCI_FUND_OVERRIDE
     * 
     */
    @JsonProperty("fundOverride")
    public void setFundOverride(String fundOverride) {
        this.fundOverride = fundOverride;
    }

    public AccountIndexCodeMaintenance100PostResponse withFundOverride(String fundOverride) {
        this.fundOverride = fundOverride;
        return this;
    }

    @JsonProperty("progCodeTitle")
    public String getProgCodeTitle() {
        return progCodeTitle;
    }

    @JsonProperty("progCodeTitle")
    public void setProgCodeTitle(String progCodeTitle) {
        this.progCodeTitle = progCodeTitle;
    }

    public AccountIndexCodeMaintenance100PostResponse withProgCodeTitle(String progCodeTitle) {
        this.progCodeTitle = progCodeTitle;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCI_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCI_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public AccountIndexCodeMaintenance100PostResponse withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public AccountIndexCodeMaintenance100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountIndexCodeMaintenance100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("locnOverride");
        sb.append('=');
        sb.append(((this.locnOverride == null)?"<null>":this.locnOverride));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("actvOverride");
        sb.append('=');
        sb.append(((this.actvOverride == null)?"<null>":this.actvOverride));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("fundCodeTitle");
        sb.append('=');
        sb.append(((this.fundCodeTitle == null)?"<null>":this.fundCodeTitle));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("actvCodeTitle");
        sb.append('=');
        sb.append(((this.actvCodeTitle == null)?"<null>":this.actvCodeTitle));
        sb.append(',');
        sb.append("orgnCodeTitle");
        sb.append('=');
        sb.append(((this.orgnCodeTitle == null)?"<null>":this.orgnCodeTitle));
        sb.append(',');
        sb.append("acctOverride");
        sb.append('=');
        sb.append(((this.acctOverride == null)?"<null>":this.acctOverride));
        sb.append(',');
        sb.append("progOverride");
        sb.append('=');
        sb.append(((this.progOverride == null)?"<null>":this.progOverride));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("acctCodeTitle");
        sb.append('=');
        sb.append(((this.acctCodeTitle == null)?"<null>":this.acctCodeTitle));
        sb.append(',');
        sb.append("locnCodeTitle");
        sb.append('=');
        sb.append(((this.locnCodeTitle == null)?"<null>":this.locnCodeTitle));
        sb.append(',');
        sb.append("orgnOverride");
        sb.append('=');
        sb.append(((this.orgnOverride == null)?"<null>":this.orgnOverride));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("fundOverride");
        sb.append('=');
        sb.append(((this.fundOverride == null)?"<null>":this.fundOverride));
        sb.append(',');
        sb.append("progCodeTitle");
        sb.append('=');
        sb.append(((this.progCodeTitle == null)?"<null>":this.progCodeTitle));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.locnOverride == null)? 0 :this.locnOverride.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.actvOverride == null)? 0 :this.actvOverride.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.fundCodeTitle == null)? 0 :this.fundCodeTitle.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.actvCodeTitle == null)? 0 :this.actvCodeTitle.hashCode()));
        result = ((result* 31)+((this.orgnCodeTitle == null)? 0 :this.orgnCodeTitle.hashCode()));
        result = ((result* 31)+((this.acctOverride == null)? 0 :this.acctOverride.hashCode()));
        result = ((result* 31)+((this.progOverride == null)? 0 :this.progOverride.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.acctCodeTitle == null)? 0 :this.acctCodeTitle.hashCode()));
        result = ((result* 31)+((this.locnCodeTitle == null)? 0 :this.locnCodeTitle.hashCode()));
        result = ((result* 31)+((this.orgnOverride == null)? 0 :this.orgnOverride.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.fundOverride == null)? 0 :this.fundOverride.hashCode()));
        result = ((result* 31)+((this.progCodeTitle == null)? 0 :this.progCodeTitle.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountIndexCodeMaintenance100PostResponse) == false) {
            return false;
        }
        AccountIndexCodeMaintenance100PostResponse rhs = ((AccountIndexCodeMaintenance100PostResponse) other);
        return ((((((((((((((((((((((((((((this.locnOverride == rhs.locnOverride)||((this.locnOverride!= null)&&this.locnOverride.equals(rhs.locnOverride)))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.actvOverride == rhs.actvOverride)||((this.actvOverride!= null)&&this.actvOverride.equals(rhs.actvOverride))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.fundCodeTitle == rhs.fundCodeTitle)||((this.fundCodeTitle!= null)&&this.fundCodeTitle.equals(rhs.fundCodeTitle))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.actvCodeTitle == rhs.actvCodeTitle)||((this.actvCodeTitle!= null)&&this.actvCodeTitle.equals(rhs.actvCodeTitle))))&&((this.orgnCodeTitle == rhs.orgnCodeTitle)||((this.orgnCodeTitle!= null)&&this.orgnCodeTitle.equals(rhs.orgnCodeTitle))))&&((this.acctOverride == rhs.acctOverride)||((this.acctOverride!= null)&&this.acctOverride.equals(rhs.acctOverride))))&&((this.progOverride == rhs.progOverride)||((this.progOverride!= null)&&this.progOverride.equals(rhs.progOverride))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.acctCodeTitle == rhs.acctCodeTitle)||((this.acctCodeTitle!= null)&&this.acctCodeTitle.equals(rhs.acctCodeTitle))))&&((this.locnCodeTitle == rhs.locnCodeTitle)||((this.locnCodeTitle!= null)&&this.locnCodeTitle.equals(rhs.locnCodeTitle))))&&((this.orgnOverride == rhs.orgnOverride)||((this.orgnOverride!= null)&&this.orgnOverride.equals(rhs.orgnOverride))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.fundOverride == rhs.fundOverride)||((this.fundOverride!= null)&&this.fundOverride.equals(rhs.fundOverride))))&&((this.progCodeTitle == rhs.progCodeTitle)||((this.progCodeTitle!= null)&&this.progCodeTitle.equals(rhs.progCodeTitle))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
