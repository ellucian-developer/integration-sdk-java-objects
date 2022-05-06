
package com.ellucian.generated.bpapi.ban.organization_code_maintenance.v1_0_0;

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
    "hierarchyTableInd",
    "ttlLocn",
    "actvCodeDef",
    "ttlActv",
    "dataEntryInd",
    "coasCode",
    "orgnCodeNsf",
    "ttlFund",
    "title",
    "displayFmgrCode",
    "locnCodeDef",
    "orgnCode",
    "formFmgrName",
    "effDate",
    "activityDate",
    "displayNchgDate",
    "orgnCodePred",
    "predTitle",
    "statusInd",
    "fundCodeDef",
    "ttlProg",
    "termDate",
    "progCodeDef",
    "ttlBudOrgn"
})
@Generated("jsonschema2pojo")
public class OrganizationCodeMaintenance100PostResponse {

    /**
     * Combination Budget Control
     * <p>
     * Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND
     * 
     */
    @JsonProperty("hierarchyTableInd")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND")
    private String hierarchyTableInd;
    @JsonProperty("ttlLocn")
    private String ttlLocn;
    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ACTV_CODE_DEF")
    private String actvCodeDef;
    @JsonProperty("ttlActv")
    private String ttlActv;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVORGN_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_DATA_ENTRY_IND")
    private String dataEntryInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("orgnCodeNsf")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE_NSF")
    private String orgnCodeNsf;
    @JsonProperty("ttlFund")
    private String ttlFund;
    /**
     * Organization Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_TITLE")
    private String title;
    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("displayFmgrCode")
    @JsonPropertyDescription("Lookup lineage reference object : spriden,ftvfmgr")
    private String displayFmgrCode;
    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_LOCN_CODE_DEF")
    private String locnCodeDef;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE")
    private String orgnCode;
    @JsonProperty("formFmgrName")
    private String formFmgrName;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_EFF_DATE")
    private Date effDate;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVORGN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("orgnCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE_PRED")
    private String orgnCodePred;
    @JsonProperty("predTitle")
    private String predTitle;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVORGN_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_STATUS_IND")
    private String statusInd;
    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_FUND_CODE_DEF")
    private String fundCodeDef;
    @JsonProperty("ttlProg")
    private String ttlProg;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_TERM_DATE")
    private Date termDate;
    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_PROG_CODE_DEF")
    private String progCodeDef;
    @JsonProperty("ttlBudOrgn")
    private String ttlBudOrgn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Combination Budget Control
     * <p>
     * Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND
     * 
     */
    @JsonProperty("hierarchyTableInd")
    public String getHierarchyTableInd() {
        return hierarchyTableInd;
    }

    /**
     * Combination Budget Control
     * <p>
     * Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND
     * 
     */
    @JsonProperty("hierarchyTableInd")
    public void setHierarchyTableInd(String hierarchyTableInd) {
        this.hierarchyTableInd = hierarchyTableInd;
    }

    public OrganizationCodeMaintenance100PostResponse withHierarchyTableInd(String hierarchyTableInd) {
        this.hierarchyTableInd = hierarchyTableInd;
        return this;
    }

    @JsonProperty("ttlLocn")
    public String getTtlLocn() {
        return ttlLocn;
    }

    @JsonProperty("ttlLocn")
    public void setTtlLocn(String ttlLocn) {
        this.ttlLocn = ttlLocn;
    }

    public OrganizationCodeMaintenance100PostResponse withTtlLocn(String ttlLocn) {
        this.ttlLocn = ttlLocn;
        return this;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    public String getActvCodeDef() {
        return actvCodeDef;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    public void setActvCodeDef(String actvCodeDef) {
        this.actvCodeDef = actvCodeDef;
    }

    public OrganizationCodeMaintenance100PostResponse withActvCodeDef(String actvCodeDef) {
        this.actvCodeDef = actvCodeDef;
        return this;
    }

    @JsonProperty("ttlActv")
    public String getTtlActv() {
        return ttlActv;
    }

    @JsonProperty("ttlActv")
    public void setTtlActv(String ttlActv) {
        this.ttlActv = ttlActv;
    }

    public OrganizationCodeMaintenance100PostResponse withTtlActv(String ttlActv) {
        this.ttlActv = ttlActv;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVORGN_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public String getDataEntryInd() {
        return dataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVORGN_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public void setDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
    }

    public OrganizationCodeMaintenance100PostResponse withDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public OrganizationCodeMaintenance100PostResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("orgnCodeNsf")
    public String getOrgnCodeNsf() {
        return orgnCodeNsf;
    }

    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("orgnCodeNsf")
    public void setOrgnCodeNsf(String orgnCodeNsf) {
        this.orgnCodeNsf = orgnCodeNsf;
    }

    public OrganizationCodeMaintenance100PostResponse withOrgnCodeNsf(String orgnCodeNsf) {
        this.orgnCodeNsf = orgnCodeNsf;
        return this;
    }

    @JsonProperty("ttlFund")
    public String getTtlFund() {
        return ttlFund;
    }

    @JsonProperty("ttlFund")
    public void setTtlFund(String ttlFund) {
        this.ttlFund = ttlFund;
    }

    public OrganizationCodeMaintenance100PostResponse withTtlFund(String ttlFund) {
        this.ttlFund = ttlFund;
        return this;
    }

    /**
     * Organization Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Organization Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public OrganizationCodeMaintenance100PostResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("displayFmgrCode")
    public String getDisplayFmgrCode() {
        return displayFmgrCode;
    }

    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("displayFmgrCode")
    public void setDisplayFmgrCode(String displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
    }

    public OrganizationCodeMaintenance100PostResponse withDisplayFmgrCode(String displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
        return this;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    public String getLocnCodeDef() {
        return locnCodeDef;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    public void setLocnCodeDef(String locnCodeDef) {
        this.locnCodeDef = locnCodeDef;
    }

    public OrganizationCodeMaintenance100PostResponse withLocnCodeDef(String locnCodeDef) {
        this.locnCodeDef = locnCodeDef;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public OrganizationCodeMaintenance100PostResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    @JsonProperty("formFmgrName")
    public String getFormFmgrName() {
        return formFmgrName;
    }

    @JsonProperty("formFmgrName")
    public void setFormFmgrName(String formFmgrName) {
        this.formFmgrName = formFmgrName;
    }

    public OrganizationCodeMaintenance100PostResponse withFormFmgrName(String formFmgrName) {
        this.formFmgrName = formFmgrName;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
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
     * Lineage reference object : FTVORGN_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public OrganizationCodeMaintenance100PostResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVORGN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVORGN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public OrganizationCodeMaintenance100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public OrganizationCodeMaintenance100PostResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("orgnCodePred")
    public String getOrgnCodePred() {
        return orgnCodePred;
    }

    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("orgnCodePred")
    public void setOrgnCodePred(String orgnCodePred) {
        this.orgnCodePred = orgnCodePred;
    }

    public OrganizationCodeMaintenance100PostResponse withOrgnCodePred(String orgnCodePred) {
        this.orgnCodePred = orgnCodePred;
        return this;
    }

    @JsonProperty("predTitle")
    public String getPredTitle() {
        return predTitle;
    }

    @JsonProperty("predTitle")
    public void setPredTitle(String predTitle) {
        this.predTitle = predTitle;
    }

    public OrganizationCodeMaintenance100PostResponse withPredTitle(String predTitle) {
        this.predTitle = predTitle;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVORGN_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVORGN_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public OrganizationCodeMaintenance100PostResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    public String getFundCodeDef() {
        return fundCodeDef;
    }

    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    public void setFundCodeDef(String fundCodeDef) {
        this.fundCodeDef = fundCodeDef;
    }

    public OrganizationCodeMaintenance100PostResponse withFundCodeDef(String fundCodeDef) {
        this.fundCodeDef = fundCodeDef;
        return this;
    }

    @JsonProperty("ttlProg")
    public String getTtlProg() {
        return ttlProg;
    }

    @JsonProperty("ttlProg")
    public void setTtlProg(String ttlProg) {
        this.ttlProg = ttlProg;
    }

    public OrganizationCodeMaintenance100PostResponse withTtlProg(String ttlProg) {
        this.ttlProg = ttlProg;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public OrganizationCodeMaintenance100PostResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    public String getProgCodeDef() {
        return progCodeDef;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    public void setProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
    }

    public OrganizationCodeMaintenance100PostResponse withProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
        return this;
    }

    @JsonProperty("ttlBudOrgn")
    public String getTtlBudOrgn() {
        return ttlBudOrgn;
    }

    @JsonProperty("ttlBudOrgn")
    public void setTtlBudOrgn(String ttlBudOrgn) {
        this.ttlBudOrgn = ttlBudOrgn;
    }

    public OrganizationCodeMaintenance100PostResponse withTtlBudOrgn(String ttlBudOrgn) {
        this.ttlBudOrgn = ttlBudOrgn;
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

    public OrganizationCodeMaintenance100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationCodeMaintenance100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hierarchyTableInd");
        sb.append('=');
        sb.append(((this.hierarchyTableInd == null)?"<null>":this.hierarchyTableInd));
        sb.append(',');
        sb.append("ttlLocn");
        sb.append('=');
        sb.append(((this.ttlLocn == null)?"<null>":this.ttlLocn));
        sb.append(',');
        sb.append("actvCodeDef");
        sb.append('=');
        sb.append(((this.actvCodeDef == null)?"<null>":this.actvCodeDef));
        sb.append(',');
        sb.append("ttlActv");
        sb.append('=');
        sb.append(((this.ttlActv == null)?"<null>":this.ttlActv));
        sb.append(',');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("orgnCodeNsf");
        sb.append('=');
        sb.append(((this.orgnCodeNsf == null)?"<null>":this.orgnCodeNsf));
        sb.append(',');
        sb.append("ttlFund");
        sb.append('=');
        sb.append(((this.ttlFund == null)?"<null>":this.ttlFund));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("displayFmgrCode");
        sb.append('=');
        sb.append(((this.displayFmgrCode == null)?"<null>":this.displayFmgrCode));
        sb.append(',');
        sb.append("locnCodeDef");
        sb.append('=');
        sb.append(((this.locnCodeDef == null)?"<null>":this.locnCodeDef));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("formFmgrName");
        sb.append('=');
        sb.append(((this.formFmgrName == null)?"<null>":this.formFmgrName));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("orgnCodePred");
        sb.append('=');
        sb.append(((this.orgnCodePred == null)?"<null>":this.orgnCodePred));
        sb.append(',');
        sb.append("predTitle");
        sb.append('=');
        sb.append(((this.predTitle == null)?"<null>":this.predTitle));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("fundCodeDef");
        sb.append('=');
        sb.append(((this.fundCodeDef == null)?"<null>":this.fundCodeDef));
        sb.append(',');
        sb.append("ttlProg");
        sb.append('=');
        sb.append(((this.ttlProg == null)?"<null>":this.ttlProg));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("progCodeDef");
        sb.append('=');
        sb.append(((this.progCodeDef == null)?"<null>":this.progCodeDef));
        sb.append(',');
        sb.append("ttlBudOrgn");
        sb.append('=');
        sb.append(((this.ttlBudOrgn == null)?"<null>":this.ttlBudOrgn));
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
        result = ((result* 31)+((this.hierarchyTableInd == null)? 0 :this.hierarchyTableInd.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.ttlFund == null)? 0 :this.ttlFund.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.displayFmgrCode == null)? 0 :this.displayFmgrCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.formFmgrName == null)? 0 :this.formFmgrName.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.ttlLocn == null)? 0 :this.ttlLocn.hashCode()));
        result = ((result* 31)+((this.actvCodeDef == null)? 0 :this.actvCodeDef.hashCode()));
        result = ((result* 31)+((this.ttlActv == null)? 0 :this.ttlActv.hashCode()));
        result = ((result* 31)+((this.orgnCodeNsf == null)? 0 :this.orgnCodeNsf.hashCode()));
        result = ((result* 31)+((this.locnCodeDef == null)? 0 :this.locnCodeDef.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.orgnCodePred == null)? 0 :this.orgnCodePred.hashCode()));
        result = ((result* 31)+((this.predTitle == null)? 0 :this.predTitle.hashCode()));
        result = ((result* 31)+((this.fundCodeDef == null)? 0 :this.fundCodeDef.hashCode()));
        result = ((result* 31)+((this.ttlProg == null)? 0 :this.ttlProg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.progCodeDef == null)? 0 :this.progCodeDef.hashCode()));
        result = ((result* 31)+((this.ttlBudOrgn == null)? 0 :this.ttlBudOrgn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationCodeMaintenance100PostResponse) == false) {
            return false;
        }
        OrganizationCodeMaintenance100PostResponse rhs = ((OrganizationCodeMaintenance100PostResponse) other);
        return ((((((((((((((((((((((((((this.hierarchyTableInd == rhs.hierarchyTableInd)||((this.hierarchyTableInd!= null)&&this.hierarchyTableInd.equals(rhs.hierarchyTableInd)))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.ttlFund == rhs.ttlFund)||((this.ttlFund!= null)&&this.ttlFund.equals(rhs.ttlFund))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.displayFmgrCode == rhs.displayFmgrCode)||((this.displayFmgrCode!= null)&&this.displayFmgrCode.equals(rhs.displayFmgrCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.formFmgrName == rhs.formFmgrName)||((this.formFmgrName!= null)&&this.formFmgrName.equals(rhs.formFmgrName))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.ttlLocn == rhs.ttlLocn)||((this.ttlLocn!= null)&&this.ttlLocn.equals(rhs.ttlLocn))))&&((this.actvCodeDef == rhs.actvCodeDef)||((this.actvCodeDef!= null)&&this.actvCodeDef.equals(rhs.actvCodeDef))))&&((this.ttlActv == rhs.ttlActv)||((this.ttlActv!= null)&&this.ttlActv.equals(rhs.ttlActv))))&&((this.orgnCodeNsf == rhs.orgnCodeNsf)||((this.orgnCodeNsf!= null)&&this.orgnCodeNsf.equals(rhs.orgnCodeNsf))))&&((this.locnCodeDef == rhs.locnCodeDef)||((this.locnCodeDef!= null)&&this.locnCodeDef.equals(rhs.locnCodeDef))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.orgnCodePred == rhs.orgnCodePred)||((this.orgnCodePred!= null)&&this.orgnCodePred.equals(rhs.orgnCodePred))))&&((this.predTitle == rhs.predTitle)||((this.predTitle!= null)&&this.predTitle.equals(rhs.predTitle))))&&((this.fundCodeDef == rhs.fundCodeDef)||((this.fundCodeDef!= null)&&this.fundCodeDef.equals(rhs.fundCodeDef))))&&((this.ttlProg == rhs.ttlProg)||((this.ttlProg!= null)&&this.ttlProg.equals(rhs.ttlProg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.progCodeDef == rhs.progCodeDef)||((this.progCodeDef!= null)&&this.progCodeDef.equals(rhs.progCodeDef))))&&((this.ttlBudOrgn == rhs.ttlBudOrgn)||((this.ttlBudOrgn!= null)&&this.ttlBudOrgn.equals(rhs.ttlBudOrgn))));
    }

}
