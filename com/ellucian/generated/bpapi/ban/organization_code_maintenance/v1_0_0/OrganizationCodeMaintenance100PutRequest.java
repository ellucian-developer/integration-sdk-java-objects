
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
    "criteria.actvCodeDef",
    "criteria.hierarchyTableInd",
    "finanManager",
    "criteria.activityDate",
    "criteria.statusInd",
    "criteria.orgnCodeNsf",
    "predecessor",
    "title",
    "defActv",
    "criteria.termDate",
    "criteria.locnCodeDef",
    "defProgram",
    "criteria.dataEntryInd",
    "criteria.coasCode",
    "budget",
    "criteria.effDate",
    "defLocation",
    "defFund",
    "criteria.title",
    "coas",
    "criteria.fundCodeDef",
    "criteria.orgnCodePred",
    "termDate",
    "criteria.orgnCode",
    "criteria.progCodeDef"
})
@Generated("jsonschema2pojo")
public class OrganizationCodeMaintenance100PutRequest {

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("criteria.actvCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ACTV_CODE_DEF")
    private String criteriaActvCodeDef;
    /**
     * Combination Budget Control
     * <p>
     * Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND
     * 
     */
    @JsonProperty("criteria.hierarchyTableInd")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND")
    private String criteriaHierarchyTableInd;
    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("finanManager")
    @JsonPropertyDescription("Lookup lineage reference object : spriden,ftvfmgr")
    private String finanManager;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVORGN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVORGN_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("criteria.orgnCodeNsf")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE_NSF")
    private String criteriaOrgnCodeNsf;
    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("predecessor")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE_PRED")
    private String predecessor;
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
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("defActv")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ACTV_CODE_DEF")
    private String defActv;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.locnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_LOCN_CODE_DEF")
    private String criteriaLocnCodeDef;
    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("defProgram")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_PROG_CODE_DEF")
    private String defProgram;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVORGN_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_DATA_ENTRY_IND")
    private String criteriaDataEntryInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE_NSF")
    private String budget;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("defLocation")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_LOCN_CODE_DEF")
    private String defLocation;
    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("defFund")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_FUND_CODE_DEF")
    private String defFund;
    /**
     * Organization Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_TITLE")
    private String criteriaTitle;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coas;
    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("criteria.fundCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_FUND_CODE_DEF")
    private String criteriaFundCodeDef;
    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("criteria.orgnCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE_PRED")
    private String criteriaOrgnCodePred;
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
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE")
    private String criteriaOrgnCode;
    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("criteria.progCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_PROG_CODE_DEF")
    private String criteriaProgCodeDef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("criteria.actvCodeDef")
    public String getCriteriaActvCodeDef() {
        return criteriaActvCodeDef;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("criteria.actvCodeDef")
    public void setCriteriaActvCodeDef(String criteriaActvCodeDef) {
        this.criteriaActvCodeDef = criteriaActvCodeDef;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaActvCodeDef(String criteriaActvCodeDef) {
        this.criteriaActvCodeDef = criteriaActvCodeDef;
        return this;
    }

    /**
     * Combination Budget Control
     * <p>
     * Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND
     * 
     */
    @JsonProperty("criteria.hierarchyTableInd")
    public String getCriteriaHierarchyTableInd() {
        return criteriaHierarchyTableInd;
    }

    /**
     * Combination Budget Control
     * <p>
     * Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND
     * 
     */
    @JsonProperty("criteria.hierarchyTableInd")
    public void setCriteriaHierarchyTableInd(String criteriaHierarchyTableInd) {
        this.criteriaHierarchyTableInd = criteriaHierarchyTableInd;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaHierarchyTableInd(String criteriaHierarchyTableInd) {
        this.criteriaHierarchyTableInd = criteriaHierarchyTableInd;
        return this;
    }

    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("finanManager")
    public String getFinanManager() {
        return finanManager;
    }

    /**
     * Financial Manager
     * <p>
     * Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("finanManager")
    public void setFinanManager(String finanManager) {
        this.finanManager = finanManager;
    }

    public OrganizationCodeMaintenance100PutRequest withFinanManager(String finanManager) {
        this.finanManager = finanManager;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVORGN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVORGN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVORGN_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVORGN_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("criteria.orgnCodeNsf")
    public String getCriteriaOrgnCodeNsf() {
        return criteriaOrgnCodeNsf;
    }

    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("criteria.orgnCodeNsf")
    public void setCriteriaOrgnCodeNsf(String criteriaOrgnCodeNsf) {
        this.criteriaOrgnCodeNsf = criteriaOrgnCodeNsf;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaOrgnCodeNsf(String criteriaOrgnCodeNsf) {
        this.criteriaOrgnCodeNsf = criteriaOrgnCodeNsf;
        return this;
    }

    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("predecessor")
    public String getPredecessor() {
        return predecessor;
    }

    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("predecessor")
    public void setPredecessor(String predecessor) {
        this.predecessor = predecessor;
    }

    public OrganizationCodeMaintenance100PutRequest withPredecessor(String predecessor) {
        this.predecessor = predecessor;
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

    public OrganizationCodeMaintenance100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("defActv")
    public String getDefActv() {
        return defActv;
    }

    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("defActv")
    public void setDefActv(String defActv) {
        this.defActv = defActv;
    }

    public OrganizationCodeMaintenance100PutRequest withDefActv(String defActv) {
        this.defActv = defActv;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.locnCodeDef")
    public String getCriteriaLocnCodeDef() {
        return criteriaLocnCodeDef;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("criteria.locnCodeDef")
    public void setCriteriaLocnCodeDef(String criteriaLocnCodeDef) {
        this.criteriaLocnCodeDef = criteriaLocnCodeDef;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaLocnCodeDef(String criteriaLocnCodeDef) {
        this.criteriaLocnCodeDef = criteriaLocnCodeDef;
        return this;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("defProgram")
    public String getDefProgram() {
        return defProgram;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("defProgram")
    public void setDefProgram(String defProgram) {
        this.defProgram = defProgram;
    }

    public OrganizationCodeMaintenance100PutRequest withDefProgram(String defProgram) {
        this.defProgram = defProgram;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVORGN_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public String getCriteriaDataEntryInd() {
        return criteriaDataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVORGN_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public void setCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("budget")
    public String getBudget() {
        return budget;
    }

    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("budget")
    public void setBudget(String budget) {
        this.budget = budget;
    }

    public OrganizationCodeMaintenance100PutRequest withBudget(String budget) {
        this.budget = budget;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("defLocation")
    public String getDefLocation() {
        return defLocation;
    }

    /**
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("defLocation")
    public void setDefLocation(String defLocation) {
        this.defLocation = defLocation;
    }

    public OrganizationCodeMaintenance100PutRequest withDefLocation(String defLocation) {
        this.defLocation = defLocation;
        return this;
    }

    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("defFund")
    public String getDefFund() {
        return defFund;
    }

    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("defFund")
    public void setDefFund(String defFund) {
        this.defFund = defFund;
    }

    public OrganizationCodeMaintenance100PutRequest withDefFund(String defFund) {
        this.defFund = defFund;
        return this;
    }

    /**
     * Organization Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Organization Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public String getCoas() {
        return coas;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public void setCoas(String coas) {
        this.coas = coas;
    }

    public OrganizationCodeMaintenance100PutRequest withCoas(String coas) {
        this.coas = coas;
        return this;
    }

    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("criteria.fundCodeDef")
    public String getCriteriaFundCodeDef() {
        return criteriaFundCodeDef;
    }

    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("criteria.fundCodeDef")
    public void setCriteriaFundCodeDef(String criteriaFundCodeDef) {
        this.criteriaFundCodeDef = criteriaFundCodeDef;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaFundCodeDef(String criteriaFundCodeDef) {
        this.criteriaFundCodeDef = criteriaFundCodeDef;
        return this;
    }

    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("criteria.orgnCodePred")
    public String getCriteriaOrgnCodePred() {
        return criteriaOrgnCodePred;
    }

    /**
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("criteria.orgnCodePred")
    public void setCriteriaOrgnCodePred(String criteriaOrgnCodePred) {
        this.criteriaOrgnCodePred = criteriaOrgnCodePred;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaOrgnCodePred(String criteriaOrgnCodePred) {
        this.criteriaOrgnCodePred = criteriaOrgnCodePred;
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

    public OrganizationCodeMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public String getCriteriaOrgnCode() {
        return criteriaOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.orgnCode")
    public void setCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaOrgnCode(String criteriaOrgnCode) {
        this.criteriaOrgnCode = criteriaOrgnCode;
        return this;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("criteria.progCodeDef")
    public String getCriteriaProgCodeDef() {
        return criteriaProgCodeDef;
    }

    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("criteria.progCodeDef")
    public void setCriteriaProgCodeDef(String criteriaProgCodeDef) {
        this.criteriaProgCodeDef = criteriaProgCodeDef;
    }

    public OrganizationCodeMaintenance100PutRequest withCriteriaProgCodeDef(String criteriaProgCodeDef) {
        this.criteriaProgCodeDef = criteriaProgCodeDef;
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

    public OrganizationCodeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationCodeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaActvCodeDef");
        sb.append('=');
        sb.append(((this.criteriaActvCodeDef == null)?"<null>":this.criteriaActvCodeDef));
        sb.append(',');
        sb.append("criteriaHierarchyTableInd");
        sb.append('=');
        sb.append(((this.criteriaHierarchyTableInd == null)?"<null>":this.criteriaHierarchyTableInd));
        sb.append(',');
        sb.append("finanManager");
        sb.append('=');
        sb.append(((this.finanManager == null)?"<null>":this.finanManager));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("criteriaOrgnCodeNsf");
        sb.append('=');
        sb.append(((this.criteriaOrgnCodeNsf == null)?"<null>":this.criteriaOrgnCodeNsf));
        sb.append(',');
        sb.append("predecessor");
        sb.append('=');
        sb.append(((this.predecessor == null)?"<null>":this.predecessor));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("defActv");
        sb.append('=');
        sb.append(((this.defActv == null)?"<null>":this.defActv));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaLocnCodeDef");
        sb.append('=');
        sb.append(((this.criteriaLocnCodeDef == null)?"<null>":this.criteriaLocnCodeDef));
        sb.append(',');
        sb.append("defProgram");
        sb.append('=');
        sb.append(((this.defProgram == null)?"<null>":this.defProgram));
        sb.append(',');
        sb.append("criteriaDataEntryInd");
        sb.append('=');
        sb.append(((this.criteriaDataEntryInd == null)?"<null>":this.criteriaDataEntryInd));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("budget");
        sb.append('=');
        sb.append(((this.budget == null)?"<null>":this.budget));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("defLocation");
        sb.append('=');
        sb.append(((this.defLocation == null)?"<null>":this.defLocation));
        sb.append(',');
        sb.append("defFund");
        sb.append('=');
        sb.append(((this.defFund == null)?"<null>":this.defFund));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("criteriaFundCodeDef");
        sb.append('=');
        sb.append(((this.criteriaFundCodeDef == null)?"<null>":this.criteriaFundCodeDef));
        sb.append(',');
        sb.append("criteriaOrgnCodePred");
        sb.append('=');
        sb.append(((this.criteriaOrgnCodePred == null)?"<null>":this.criteriaOrgnCodePred));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("criteriaOrgnCode");
        sb.append('=');
        sb.append(((this.criteriaOrgnCode == null)?"<null>":this.criteriaOrgnCode));
        sb.append(',');
        sb.append("criteriaProgCodeDef");
        sb.append('=');
        sb.append(((this.criteriaProgCodeDef == null)?"<null>":this.criteriaProgCodeDef));
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
        result = ((result* 31)+((this.finanManager == null)? 0 :this.finanManager.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaHierarchyTableInd == null)? 0 :this.criteriaHierarchyTableInd.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCodePred == null)? 0 :this.criteriaOrgnCodePred.hashCode()));
        result = ((result* 31)+((this.predecessor == null)? 0 :this.predecessor.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.defActv == null)? 0 :this.defActv.hashCode()));
        result = ((result* 31)+((this.defProgram == null)? 0 :this.defProgram.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaActvCodeDef == null)? 0 :this.criteriaActvCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCodeNsf == null)? 0 :this.criteriaOrgnCodeNsf.hashCode()));
        result = ((result* 31)+((this.defLocation == null)? 0 :this.defLocation.hashCode()));
        result = ((result* 31)+((this.criteriaFundCodeDef == null)? 0 :this.criteriaFundCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.criteriaDataEntryInd == null)? 0 :this.criteriaDataEntryInd.hashCode()));
        result = ((result* 31)+((this.defFund == null)? 0 :this.defFund.hashCode()));
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaProgCodeDef == null)? 0 :this.criteriaProgCodeDef.hashCode()));
        result = ((result* 31)+((this.criteriaOrgnCode == null)? 0 :this.criteriaOrgnCode.hashCode()));
        result = ((result* 31)+((this.criteriaLocnCodeDef == null)? 0 :this.criteriaLocnCodeDef.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationCodeMaintenance100PutRequest) == false) {
            return false;
        }
        OrganizationCodeMaintenance100PutRequest rhs = ((OrganizationCodeMaintenance100PutRequest) other);
        return (((((((((((((((((((((((((((this.finanManager == rhs.finanManager)||((this.finanManager!= null)&&this.finanManager.equals(rhs.finanManager)))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaHierarchyTableInd == rhs.criteriaHierarchyTableInd)||((this.criteriaHierarchyTableInd!= null)&&this.criteriaHierarchyTableInd.equals(rhs.criteriaHierarchyTableInd))))&&((this.criteriaOrgnCodePred == rhs.criteriaOrgnCodePred)||((this.criteriaOrgnCodePred!= null)&&this.criteriaOrgnCodePred.equals(rhs.criteriaOrgnCodePred))))&&((this.predecessor == rhs.predecessor)||((this.predecessor!= null)&&this.predecessor.equals(rhs.predecessor))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.defActv == rhs.defActv)||((this.defActv!= null)&&this.defActv.equals(rhs.defActv))))&&((this.defProgram == rhs.defProgram)||((this.defProgram!= null)&&this.defProgram.equals(rhs.defProgram))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.criteriaActvCodeDef == rhs.criteriaActvCodeDef)||((this.criteriaActvCodeDef!= null)&&this.criteriaActvCodeDef.equals(rhs.criteriaActvCodeDef))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaOrgnCodeNsf == rhs.criteriaOrgnCodeNsf)||((this.criteriaOrgnCodeNsf!= null)&&this.criteriaOrgnCodeNsf.equals(rhs.criteriaOrgnCodeNsf))))&&((this.defLocation == rhs.defLocation)||((this.defLocation!= null)&&this.defLocation.equals(rhs.defLocation))))&&((this.criteriaFundCodeDef == rhs.criteriaFundCodeDef)||((this.criteriaFundCodeDef!= null)&&this.criteriaFundCodeDef.equals(rhs.criteriaFundCodeDef))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.criteriaDataEntryInd == rhs.criteriaDataEntryInd)||((this.criteriaDataEntryInd!= null)&&this.criteriaDataEntryInd.equals(rhs.criteriaDataEntryInd))))&&((this.defFund == rhs.defFund)||((this.defFund!= null)&&this.defFund.equals(rhs.defFund))))&&((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaProgCodeDef == rhs.criteriaProgCodeDef)||((this.criteriaProgCodeDef!= null)&&this.criteriaProgCodeDef.equals(rhs.criteriaProgCodeDef))))&&((this.criteriaOrgnCode == rhs.criteriaOrgnCode)||((this.criteriaOrgnCode!= null)&&this.criteriaOrgnCode.equals(rhs.criteriaOrgnCode))))&&((this.criteriaLocnCodeDef == rhs.criteriaLocnCodeDef)||((this.criteriaLocnCodeDef!= null)&&this.criteriaLocnCodeDef.equals(rhs.criteriaLocnCodeDef))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
