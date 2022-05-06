
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
    "coas",
    "defProgram",
    "finanManager",
    "effDate",
    "defLocation",
    "predecessor",
    "title",
    "termDate",
    "defActv",
    "defFund",
    "orgn",
    "budget"
})
@Generated("jsonschema2pojo")
public class OrganizationCodeMaintenance100PostRequest {

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
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("defProgram")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_PROG_CODE_DEF")
    private String defProgram;
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
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("defLocation")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_LOCN_CODE_DEF")
    private String defLocation;
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
     * Termination Date
     * <p>
     * Lineage reference object : FTVORGN_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_TERM_DATE")
    private Date termDate;
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
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("defFund")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_FUND_CODE_DEF")
    private String defFund;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgn")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE")
    private String orgn;
    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("budget")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE_NSF")
    private String budget;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public OrganizationCodeMaintenance100PostRequest withCoas(String coas) {
        this.coas = coas;
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

    public OrganizationCodeMaintenance100PostRequest withDefProgram(String defProgram) {
        this.defProgram = defProgram;
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

    public OrganizationCodeMaintenance100PostRequest withFinanManager(String finanManager) {
        this.finanManager = finanManager;
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

    public OrganizationCodeMaintenance100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public OrganizationCodeMaintenance100PostRequest withDefLocation(String defLocation) {
        this.defLocation = defLocation;
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

    public OrganizationCodeMaintenance100PostRequest withPredecessor(String predecessor) {
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

    public OrganizationCodeMaintenance100PostRequest withTitle(String title) {
        this.title = title;
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

    public OrganizationCodeMaintenance100PostRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public OrganizationCodeMaintenance100PostRequest withDefActv(String defActv) {
        this.defActv = defActv;
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

    public OrganizationCodeMaintenance100PostRequest withDefFund(String defFund) {
        this.defFund = defFund;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgn")
    public String getOrgn() {
        return orgn;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * (Required)
     * 
     */
    @JsonProperty("orgn")
    public void setOrgn(String orgn) {
        this.orgn = orgn;
    }

    public OrganizationCodeMaintenance100PostRequest withOrgn(String orgn) {
        this.orgn = orgn;
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

    public OrganizationCodeMaintenance100PostRequest withBudget(String budget) {
        this.budget = budget;
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

    public OrganizationCodeMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationCodeMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("defProgram");
        sb.append('=');
        sb.append(((this.defProgram == null)?"<null>":this.defProgram));
        sb.append(',');
        sb.append("finanManager");
        sb.append('=');
        sb.append(((this.finanManager == null)?"<null>":this.finanManager));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("defLocation");
        sb.append('=');
        sb.append(((this.defLocation == null)?"<null>":this.defLocation));
        sb.append(',');
        sb.append("predecessor");
        sb.append('=');
        sb.append(((this.predecessor == null)?"<null>":this.predecessor));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("defActv");
        sb.append('=');
        sb.append(((this.defActv == null)?"<null>":this.defActv));
        sb.append(',');
        sb.append("defFund");
        sb.append('=');
        sb.append(((this.defFund == null)?"<null>":this.defFund));
        sb.append(',');
        sb.append("orgn");
        sb.append('=');
        sb.append(((this.orgn == null)?"<null>":this.orgn));
        sb.append(',');
        sb.append("budget");
        sb.append('=');
        sb.append(((this.budget == null)?"<null>":this.budget));
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
        result = ((result* 31)+((this.defLocation == null)? 0 :this.defLocation.hashCode()));
        result = ((result* 31)+((this.predecessor == null)? 0 :this.predecessor.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.defActv == null)? 0 :this.defActv.hashCode()));
        result = ((result* 31)+((this.defFund == null)? 0 :this.defFund.hashCode()));
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.defProgram == null)? 0 :this.defProgram.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.orgn == null)? 0 :this.orgn.hashCode()));
        result = ((result* 31)+((this.budget == null)? 0 :this.budget.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationCodeMaintenance100PostRequest) == false) {
            return false;
        }
        OrganizationCodeMaintenance100PostRequest rhs = ((OrganizationCodeMaintenance100PostRequest) other);
        return ((((((((((((((this.finanManager == rhs.finanManager)||((this.finanManager!= null)&&this.finanManager.equals(rhs.finanManager)))&&((this.defLocation == rhs.defLocation)||((this.defLocation!= null)&&this.defLocation.equals(rhs.defLocation))))&&((this.predecessor == rhs.predecessor)||((this.predecessor!= null)&&this.predecessor.equals(rhs.predecessor))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.defActv == rhs.defActv)||((this.defActv!= null)&&this.defActv.equals(rhs.defActv))))&&((this.defFund == rhs.defFund)||((this.defFund!= null)&&this.defFund.equals(rhs.defFund))))&&((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas))))&&((this.defProgram == rhs.defProgram)||((this.defProgram!= null)&&this.defProgram.equals(rhs.defProgram))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.orgn == rhs.orgn)||((this.orgn!= null)&&this.orgn.equals(rhs.orgn))))&&((this.budget == rhs.budget)||((this.budget!= null)&&this.budget.equals(rhs.budget))));
    }

}
