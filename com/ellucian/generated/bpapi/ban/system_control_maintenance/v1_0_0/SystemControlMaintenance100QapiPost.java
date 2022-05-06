
package com.ellucian.generated.bpapi.ban.system_control_maintenance.v1_0_0;

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
    "effDate",
    "multipleFbAcctInd",
    "termDate",
    "ruclSecurityInd",
    "nchgDate",
    "fundOrgSecurityInd",
    "activityDate",
    "consolPostInd",
    "statusInd",
    "editDeferInd",
    "acctCodeCoasDueTo",
    "wbudInd",
    "acctCodeCoasDueFrm",
    "wbudTrackInd",
    "federalEmployerId"
})
@Generated("jsonschema2pojo")
public class SystemControlMaintenance100QapiPost {

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_EFF_DATE")
    private Date effDate;
    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("multipleFbAcctInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND")
    private String multipleFbAcctInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_TERM_DATE")
    private Date termDate;
    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("ruclSecurityInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_RUCL_SECURITY_IND")
    private String ruclSecurityInd;
    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FOBSYSC_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_NCHG_DATE")
    private Date nchgDate;
    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("fundOrgSecurityInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND")
    private String fundOrgSecurityInd;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FOBSYSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("consolPostInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_CONSOL_POST_IND")
    private String consolPostInd;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_STATUS_IND")
    private String statusInd;
    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_EDIT_DEFER_IND")
    private String editDeferInd;
    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * 
     */
    @JsonProperty("acctCodeCoasDueTo")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO")
    private String acctCodeCoasDueTo;
    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("wbudInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_WBUD_IND")
    private String wbudInd;
    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * 
     */
    @JsonProperty("acctCodeCoasDueFrm")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM")
    private String acctCodeCoasDueFrm;
    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("wbudTrackInd")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_WBUD_TRACK_IND")
    private String wbudTrackInd;
    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("federalEmployerId")
    @JsonPropertyDescription("Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID")
    private String federalEmployerId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FOBSYSC_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public SystemControlMaintenance100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("multipleFbAcctInd")
    public String getMultipleFbAcctInd() {
        return multipleFbAcctInd;
    }

    /**
     * Multiple Fund Balance
     * <p>
     * Lineage reference object : FOBSYSC_MULTIPLE_FB_ACCT_IND
     * 
     */
    @JsonProperty("multipleFbAcctInd")
    public void setMultipleFbAcctInd(String multipleFbAcctInd) {
        this.multipleFbAcctInd = multipleFbAcctInd;
    }

    public SystemControlMaintenance100QapiPost withMultipleFbAcctInd(String multipleFbAcctInd) {
        this.multipleFbAcctInd = multipleFbAcctInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FOBSYSC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public SystemControlMaintenance100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("ruclSecurityInd")
    public String getRuclSecurityInd() {
        return ruclSecurityInd;
    }

    /**
     * Rule Class Security
     * <p>
     * Lineage reference object : FOBSYSC_RUCL_SECURITY_IND
     * 
     */
    @JsonProperty("ruclSecurityInd")
    public void setRuclSecurityInd(String ruclSecurityInd) {
        this.ruclSecurityInd = ruclSecurityInd;
    }

    public SystemControlMaintenance100QapiPost withRuclSecurityInd(String ruclSecurityInd) {
        this.ruclSecurityInd = ruclSecurityInd;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FOBSYSC_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    public Date getNchgDate() {
        return nchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FOBSYSC_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    public void setNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
    }

    public SystemControlMaintenance100QapiPost withNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
        return this;
    }

    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("fundOrgSecurityInd")
    public String getFundOrgSecurityInd() {
        return fundOrgSecurityInd;
    }

    /**
     * Fund and Organization Security
     * <p>
     * Lineage reference object : FOBSYSC_FUND_ORG_SECURITY_IND
     * 
     */
    @JsonProperty("fundOrgSecurityInd")
    public void setFundOrgSecurityInd(String fundOrgSecurityInd) {
        this.fundOrgSecurityInd = fundOrgSecurityInd;
    }

    public SystemControlMaintenance100QapiPost withFundOrgSecurityInd(String fundOrgSecurityInd) {
        this.fundOrgSecurityInd = fundOrgSecurityInd;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FOBSYSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FOBSYSC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SystemControlMaintenance100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("consolPostInd")
    public String getConsolPostInd() {
        return consolPostInd;
    }

    /**
     * Consolidated Posting
     * <p>
     * Lineage reference object : FOBSYSC_CONSOL_POST_IND
     * 
     */
    @JsonProperty("consolPostInd")
    public void setConsolPostInd(String consolPostInd) {
        this.consolPostInd = consolPostInd;
    }

    public SystemControlMaintenance100QapiPost withConsolPostInd(String consolPostInd) {
        this.consolPostInd = consolPostInd;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FOBSYSC_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public SystemControlMaintenance100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public String getEditDeferInd() {
        return editDeferInd;
    }

    /**
     * Deferred Edit
     * <p>
     * Lineage reference object : FOBSYSC_EDIT_DEFER_IND
     * 
     */
    @JsonProperty("editDeferInd")
    public void setEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
    }

    public SystemControlMaintenance100QapiPost withEditDeferInd(String editDeferInd) {
        this.editDeferInd = editDeferInd;
        return this;
    }

    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * 
     */
    @JsonProperty("acctCodeCoasDueTo")
    public String getAcctCodeCoasDueTo() {
        return acctCodeCoasDueTo;
    }

    /**
     * Interchart Due To Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_TO
     * 
     */
    @JsonProperty("acctCodeCoasDueTo")
    public void setAcctCodeCoasDueTo(String acctCodeCoasDueTo) {
        this.acctCodeCoasDueTo = acctCodeCoasDueTo;
    }

    public SystemControlMaintenance100QapiPost withAcctCodeCoasDueTo(String acctCodeCoasDueTo) {
        this.acctCodeCoasDueTo = acctCodeCoasDueTo;
        return this;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("wbudInd")
    public String getWbudInd() {
        return wbudInd;
    }

    /**
     * Self Service Budget Development
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_IND
     * 
     */
    @JsonProperty("wbudInd")
    public void setWbudInd(String wbudInd) {
        this.wbudInd = wbudInd;
    }

    public SystemControlMaintenance100QapiPost withWbudInd(String wbudInd) {
        this.wbudInd = wbudInd;
        return this;
    }

    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * 
     */
    @JsonProperty("acctCodeCoasDueFrm")
    public String getAcctCodeCoasDueFrm() {
        return acctCodeCoasDueFrm;
    }

    /**
     * Interchart Due From Account
     * <p>
     * Lineage reference object : FOBSYSC_ACCT_CODE_COAS_DUE_FRM
     * 
     */
    @JsonProperty("acctCodeCoasDueFrm")
    public void setAcctCodeCoasDueFrm(String acctCodeCoasDueFrm) {
        this.acctCodeCoasDueFrm = acctCodeCoasDueFrm;
    }

    public SystemControlMaintenance100QapiPost withAcctCodeCoasDueFrm(String acctCodeCoasDueFrm) {
        this.acctCodeCoasDueFrm = acctCodeCoasDueFrm;
        return this;
    }

    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("wbudTrackInd")
    public String getWbudTrackInd() {
        return wbudTrackInd;
    }

    /**
     * Self Service Budget Development History
     * <p>
     * Lineage reference object : FOBSYSC_WBUD_TRACK_IND
     * 
     */
    @JsonProperty("wbudTrackInd")
    public void setWbudTrackInd(String wbudTrackInd) {
        this.wbudTrackInd = wbudTrackInd;
    }

    public SystemControlMaintenance100QapiPost withWbudTrackInd(String wbudTrackInd) {
        this.wbudTrackInd = wbudTrackInd;
        return this;
    }

    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("federalEmployerId")
    public String getFederalEmployerId() {
        return federalEmployerId;
    }

    /**
     * Federal Employer ID
     * <p>
     * Lineage reference object : FOBSYSC_FEDERAL_EMPLOYER_ID
     * 
     */
    @JsonProperty("federalEmployerId")
    public void setFederalEmployerId(String federalEmployerId) {
        this.federalEmployerId = federalEmployerId;
    }

    public SystemControlMaintenance100QapiPost withFederalEmployerId(String federalEmployerId) {
        this.federalEmployerId = federalEmployerId;
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

    public SystemControlMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SystemControlMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("multipleFbAcctInd");
        sb.append('=');
        sb.append(((this.multipleFbAcctInd == null)?"<null>":this.multipleFbAcctInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("ruclSecurityInd");
        sb.append('=');
        sb.append(((this.ruclSecurityInd == null)?"<null>":this.ruclSecurityInd));
        sb.append(',');
        sb.append("nchgDate");
        sb.append('=');
        sb.append(((this.nchgDate == null)?"<null>":this.nchgDate));
        sb.append(',');
        sb.append("fundOrgSecurityInd");
        sb.append('=');
        sb.append(((this.fundOrgSecurityInd == null)?"<null>":this.fundOrgSecurityInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("consolPostInd");
        sb.append('=');
        sb.append(((this.consolPostInd == null)?"<null>":this.consolPostInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("editDeferInd");
        sb.append('=');
        sb.append(((this.editDeferInd == null)?"<null>":this.editDeferInd));
        sb.append(',');
        sb.append("acctCodeCoasDueTo");
        sb.append('=');
        sb.append(((this.acctCodeCoasDueTo == null)?"<null>":this.acctCodeCoasDueTo));
        sb.append(',');
        sb.append("wbudInd");
        sb.append('=');
        sb.append(((this.wbudInd == null)?"<null>":this.wbudInd));
        sb.append(',');
        sb.append("acctCodeCoasDueFrm");
        sb.append('=');
        sb.append(((this.acctCodeCoasDueFrm == null)?"<null>":this.acctCodeCoasDueFrm));
        sb.append(',');
        sb.append("wbudTrackInd");
        sb.append('=');
        sb.append(((this.wbudTrackInd == null)?"<null>":this.wbudTrackInd));
        sb.append(',');
        sb.append("federalEmployerId");
        sb.append('=');
        sb.append(((this.federalEmployerId == null)?"<null>":this.federalEmployerId));
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
        result = ((result* 31)+((this.acctCodeCoasDueTo == null)? 0 :this.acctCodeCoasDueTo.hashCode()));
        result = ((result* 31)+((this.nchgDate == null)? 0 :this.nchgDate.hashCode()));
        result = ((result* 31)+((this.ruclSecurityInd == null)? 0 :this.ruclSecurityInd.hashCode()));
        result = ((result* 31)+((this.wbudTrackInd == null)? 0 :this.wbudTrackInd.hashCode()));
        result = ((result* 31)+((this.multipleFbAcctInd == null)? 0 :this.multipleFbAcctInd.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.editDeferInd == null)? 0 :this.editDeferInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.fundOrgSecurityInd == null)? 0 :this.fundOrgSecurityInd.hashCode()));
        result = ((result* 31)+((this.consolPostInd == null)? 0 :this.consolPostInd.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.acctCodeCoasDueFrm == null)? 0 :this.acctCodeCoasDueFrm.hashCode()));
        result = ((result* 31)+((this.federalEmployerId == null)? 0 :this.federalEmployerId.hashCode()));
        result = ((result* 31)+((this.wbudInd == null)? 0 :this.wbudInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SystemControlMaintenance100QapiPost) == false) {
            return false;
        }
        SystemControlMaintenance100QapiPost rhs = ((SystemControlMaintenance100QapiPost) other);
        return (((((((((((((((((this.acctCodeCoasDueTo == rhs.acctCodeCoasDueTo)||((this.acctCodeCoasDueTo!= null)&&this.acctCodeCoasDueTo.equals(rhs.acctCodeCoasDueTo)))&&((this.nchgDate == rhs.nchgDate)||((this.nchgDate!= null)&&this.nchgDate.equals(rhs.nchgDate))))&&((this.ruclSecurityInd == rhs.ruclSecurityInd)||((this.ruclSecurityInd!= null)&&this.ruclSecurityInd.equals(rhs.ruclSecurityInd))))&&((this.wbudTrackInd == rhs.wbudTrackInd)||((this.wbudTrackInd!= null)&&this.wbudTrackInd.equals(rhs.wbudTrackInd))))&&((this.multipleFbAcctInd == rhs.multipleFbAcctInd)||((this.multipleFbAcctInd!= null)&&this.multipleFbAcctInd.equals(rhs.multipleFbAcctInd))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.editDeferInd == rhs.editDeferInd)||((this.editDeferInd!= null)&&this.editDeferInd.equals(rhs.editDeferInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.fundOrgSecurityInd == rhs.fundOrgSecurityInd)||((this.fundOrgSecurityInd!= null)&&this.fundOrgSecurityInd.equals(rhs.fundOrgSecurityInd))))&&((this.consolPostInd == rhs.consolPostInd)||((this.consolPostInd!= null)&&this.consolPostInd.equals(rhs.consolPostInd))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.acctCodeCoasDueFrm == rhs.acctCodeCoasDueFrm)||((this.acctCodeCoasDueFrm!= null)&&this.acctCodeCoasDueFrm.equals(rhs.acctCodeCoasDueFrm))))&&((this.federalEmployerId == rhs.federalEmployerId)||((this.federalEmployerId!= null)&&this.federalEmployerId.equals(rhs.federalEmployerId))))&&((this.wbudInd == rhs.wbudInd)||((this.wbudInd!= null)&&this.wbudInd.equals(rhs.wbudInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
