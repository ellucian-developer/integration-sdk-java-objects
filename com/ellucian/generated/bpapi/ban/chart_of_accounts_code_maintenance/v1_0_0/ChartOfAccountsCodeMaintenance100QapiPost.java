
package com.ellucian.generated.bpapi.ban.chart_of_accounts_code_maintenance.v1_0_0;

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
    "coasCode",
    "termDate",
    "statusInd",
    "title",
    "methOfAcctg",
    "effDate",
    "calStartMonth",
    "calStartDay",
    "calEndMonth",
    "calEndDay",
    "acctCodeFundDueTo",
    "acctCodeFundDueFrm",
    "bavlSeverity",
    "bavlPeriod",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class ChartOfAccountsCodeMaintenance100QapiPost {

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVCOAS_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVCOAS_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_TERM_DATE")
    private Date termDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVCOAS_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_STATUS_IND")
    private String statusInd;
    /**
     * Chart of Accounts Title
     * <p>
     * Lineage reference object : FTVCOAS_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_TITLE")
    private String title;
    /**
     * Method of Accounting
     * <p>
     * Lineage reference object : FTVCOAS_METH_OF_ACCTG
     * 
     */
    @JsonProperty("methOfAcctg")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_METH_OF_ACCTG")
    private String methOfAcctg;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVCOAS_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_EFF_DATE")
    private Date effDate;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_MONTH
     * 
     */
    @JsonProperty("calStartMonth")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_CAL_START_MONTH")
    private String calStartMonth;
    /**
     * Start Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_DAY
     * 
     */
    @JsonProperty("calStartDay")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_CAL_START_DAY")
    private String calStartDay;
    /**
     * End Month
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_MONTH
     * 
     */
    @JsonProperty("calEndMonth")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_CAL_END_MONTH")
    private String calEndMonth;
    /**
     * End Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_DAY
     * 
     */
    @JsonProperty("calEndDay")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_CAL_END_DAY")
    private String calEndDay;
    /**
     * Interfund Due To Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_TO
     * 
     */
    @JsonProperty("acctCodeFundDueTo")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_TO")
    private String acctCodeFundDueTo;
    /**
     * Interfund Due From Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_FRM
     * 
     */
    @JsonProperty("acctCodeFundDueFrm")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_FRM")
    private String acctCodeFundDueFrm;
    /**
     * Control Severity
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BAVL_SEVERITY")
    private String bavlSeverity;
    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_BAVL_PERIOD")
    private String bavlPeriod;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOAS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOAS_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVCOAS_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVCOAS_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVCOAS_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVCOAS_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVCOAS_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVCOAS_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Chart of Accounts Title
     * <p>
     * Lineage reference object : FTVCOAS_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Chart of Accounts Title
     * <p>
     * Lineage reference object : FTVCOAS_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Method of Accounting
     * <p>
     * Lineage reference object : FTVCOAS_METH_OF_ACCTG
     * 
     */
    @JsonProperty("methOfAcctg")
    public String getMethOfAcctg() {
        return methOfAcctg;
    }

    /**
     * Method of Accounting
     * <p>
     * Lineage reference object : FTVCOAS_METH_OF_ACCTG
     * 
     */
    @JsonProperty("methOfAcctg")
    public void setMethOfAcctg(String methOfAcctg) {
        this.methOfAcctg = methOfAcctg;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withMethOfAcctg(String methOfAcctg) {
        this.methOfAcctg = methOfAcctg;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVCOAS_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVCOAS_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_MONTH
     * 
     */
    @JsonProperty("calStartMonth")
    public String getCalStartMonth() {
        return calStartMonth;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_MONTH
     * 
     */
    @JsonProperty("calStartMonth")
    public void setCalStartMonth(String calStartMonth) {
        this.calStartMonth = calStartMonth;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withCalStartMonth(String calStartMonth) {
        this.calStartMonth = calStartMonth;
        return this;
    }

    /**
     * Start Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_DAY
     * 
     */
    @JsonProperty("calStartDay")
    public String getCalStartDay() {
        return calStartDay;
    }

    /**
     * Start Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_START_DAY
     * 
     */
    @JsonProperty("calStartDay")
    public void setCalStartDay(String calStartDay) {
        this.calStartDay = calStartDay;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withCalStartDay(String calStartDay) {
        this.calStartDay = calStartDay;
        return this;
    }

    /**
     * End Month
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_MONTH
     * 
     */
    @JsonProperty("calEndMonth")
    public String getCalEndMonth() {
        return calEndMonth;
    }

    /**
     * End Month
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_MONTH
     * 
     */
    @JsonProperty("calEndMonth")
    public void setCalEndMonth(String calEndMonth) {
        this.calEndMonth = calEndMonth;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withCalEndMonth(String calEndMonth) {
        this.calEndMonth = calEndMonth;
        return this;
    }

    /**
     * End Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_DAY
     * 
     */
    @JsonProperty("calEndDay")
    public String getCalEndDay() {
        return calEndDay;
    }

    /**
     * End Day
     * <p>
     * Lineage reference object : FTVCOAS_CAL_END_DAY
     * 
     */
    @JsonProperty("calEndDay")
    public void setCalEndDay(String calEndDay) {
        this.calEndDay = calEndDay;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withCalEndDay(String calEndDay) {
        this.calEndDay = calEndDay;
        return this;
    }

    /**
     * Interfund Due To Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_TO
     * 
     */
    @JsonProperty("acctCodeFundDueTo")
    public String getAcctCodeFundDueTo() {
        return acctCodeFundDueTo;
    }

    /**
     * Interfund Due To Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_TO
     * 
     */
    @JsonProperty("acctCodeFundDueTo")
    public void setAcctCodeFundDueTo(String acctCodeFundDueTo) {
        this.acctCodeFundDueTo = acctCodeFundDueTo;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withAcctCodeFundDueTo(String acctCodeFundDueTo) {
        this.acctCodeFundDueTo = acctCodeFundDueTo;
        return this;
    }

    /**
     * Interfund Due From Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_FRM
     * 
     */
    @JsonProperty("acctCodeFundDueFrm")
    public String getAcctCodeFundDueFrm() {
        return acctCodeFundDueFrm;
    }

    /**
     * Interfund Due From Account
     * <p>
     * Lineage reference object : FTVCOAS_ACCT_CODE_FUND_DUE_FRM
     * 
     */
    @JsonProperty("acctCodeFundDueFrm")
    public void setAcctCodeFundDueFrm(String acctCodeFundDueFrm) {
        this.acctCodeFundDueFrm = acctCodeFundDueFrm;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withAcctCodeFundDueFrm(String acctCodeFundDueFrm) {
        this.acctCodeFundDueFrm = acctCodeFundDueFrm;
        return this;
    }

    /**
     * Control Severity
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    public String getBavlSeverity() {
        return bavlSeverity;
    }

    /**
     * Control Severity
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_SEVERITY
     * 
     */
    @JsonProperty("bavlSeverity")
    public void setBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withBavlSeverity(String bavlSeverity) {
        this.bavlSeverity = bavlSeverity;
        return this;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    public String getBavlPeriod() {
        return bavlPeriod;
    }

    /**
     * Control Period
     * <p>
     * Lineage reference object : FTVCOAS_BAVL_PERIOD
     * 
     */
    @JsonProperty("bavlPeriod")
    public void setBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withBavlPeriod(String bavlPeriod) {
        this.bavlPeriod = bavlPeriod;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOAS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOAS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ChartOfAccountsCodeMaintenance100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public ChartOfAccountsCodeMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChartOfAccountsCodeMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("methOfAcctg");
        sb.append('=');
        sb.append(((this.methOfAcctg == null)?"<null>":this.methOfAcctg));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("calStartMonth");
        sb.append('=');
        sb.append(((this.calStartMonth == null)?"<null>":this.calStartMonth));
        sb.append(',');
        sb.append("calStartDay");
        sb.append('=');
        sb.append(((this.calStartDay == null)?"<null>":this.calStartDay));
        sb.append(',');
        sb.append("calEndMonth");
        sb.append('=');
        sb.append(((this.calEndMonth == null)?"<null>":this.calEndMonth));
        sb.append(',');
        sb.append("calEndDay");
        sb.append('=');
        sb.append(((this.calEndDay == null)?"<null>":this.calEndDay));
        sb.append(',');
        sb.append("acctCodeFundDueTo");
        sb.append('=');
        sb.append(((this.acctCodeFundDueTo == null)?"<null>":this.acctCodeFundDueTo));
        sb.append(',');
        sb.append("acctCodeFundDueFrm");
        sb.append('=');
        sb.append(((this.acctCodeFundDueFrm == null)?"<null>":this.acctCodeFundDueFrm));
        sb.append(',');
        sb.append("bavlSeverity");
        sb.append('=');
        sb.append(((this.bavlSeverity == null)?"<null>":this.bavlSeverity));
        sb.append(',');
        sb.append("bavlPeriod");
        sb.append('=');
        sb.append(((this.bavlPeriod == null)?"<null>":this.bavlPeriod));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.methOfAcctg == null)? 0 :this.methOfAcctg.hashCode()));
        result = ((result* 31)+((this.calStartMonth == null)? 0 :this.calStartMonth.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.bavlPeriod == null)? 0 :this.bavlPeriod.hashCode()));
        result = ((result* 31)+((this.calEndMonth == null)? 0 :this.calEndMonth.hashCode()));
        result = ((result* 31)+((this.calEndDay == null)? 0 :this.calEndDay.hashCode()));
        result = ((result* 31)+((this.bavlSeverity == null)? 0 :this.bavlSeverity.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.acctCodeFundDueTo == null)? 0 :this.acctCodeFundDueTo.hashCode()));
        result = ((result* 31)+((this.acctCodeFundDueFrm == null)? 0 :this.acctCodeFundDueFrm.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.calStartDay == null)? 0 :this.calStartDay.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChartOfAccountsCodeMaintenance100QapiPost) == false) {
            return false;
        }
        ChartOfAccountsCodeMaintenance100QapiPost rhs = ((ChartOfAccountsCodeMaintenance100QapiPost) other);
        return (((((((((((((((((this.methOfAcctg == rhs.methOfAcctg)||((this.methOfAcctg!= null)&&this.methOfAcctg.equals(rhs.methOfAcctg)))&&((this.calStartMonth == rhs.calStartMonth)||((this.calStartMonth!= null)&&this.calStartMonth.equals(rhs.calStartMonth))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.bavlPeriod == rhs.bavlPeriod)||((this.bavlPeriod!= null)&&this.bavlPeriod.equals(rhs.bavlPeriod))))&&((this.calEndMonth == rhs.calEndMonth)||((this.calEndMonth!= null)&&this.calEndMonth.equals(rhs.calEndMonth))))&&((this.calEndDay == rhs.calEndDay)||((this.calEndDay!= null)&&this.calEndDay.equals(rhs.calEndDay))))&&((this.bavlSeverity == rhs.bavlSeverity)||((this.bavlSeverity!= null)&&this.bavlSeverity.equals(rhs.bavlSeverity))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.acctCodeFundDueTo == rhs.acctCodeFundDueTo)||((this.acctCodeFundDueTo!= null)&&this.acctCodeFundDueTo.equals(rhs.acctCodeFundDueTo))))&&((this.acctCodeFundDueFrm == rhs.acctCodeFundDueFrm)||((this.acctCodeFundDueFrm!= null)&&this.acctCodeFundDueFrm.equals(rhs.acctCodeFundDueFrm))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.calStartDay == rhs.calStartDay)||((this.calStartDay!= null)&&this.calStartDay.equals(rhs.calStartDay))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
