
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
    "coasCode",
    "statusInd",
    "orgnCodePred",
    "orgnCode",
    "fundCodeDef",
    "title",
    "progCodeDef",
    "effDate",
    "actvCodeDef",
    "termDate",
    "locnCodeDef",
    "orgnCodeNsf",
    "dataEntryInd",
    "hierarchyTableInd",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class OrganizationCodeMaintenance100QapiPost {

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
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
     * Predecessor Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_PRED
     * 
     */
    @JsonProperty("orgnCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE_PRED")
    private String orgnCodePred;
    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE")
    private String orgnCode;
    /**
     * Default Fund
     * <p>
     * Lineage reference object : FTVORGN_FUND_CODE_DEF
     * 
     */
    @JsonProperty("fundCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_FUND_CODE_DEF")
    private String fundCodeDef;
    /**
     * Organization Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_TITLE")
    private String title;
    /**
     * Default Program
     * <p>
     * Lineage reference object : FTVORGN_PROG_CODE_DEF
     * 
     */
    @JsonProperty("progCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_PROG_CODE_DEF")
    private String progCodeDef;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_EFF_DATE")
    private Date effDate;
    /**
     * Default Activity
     * <p>
     * Lineage reference object : FTVORGN_ACTV_CODE_DEF
     * 
     */
    @JsonProperty("actvCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ACTV_CODE_DEF")
    private String actvCodeDef;
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
     * Default Location
     * <p>
     * Lineage reference object : FTVORGN_LOCN_CODE_DEF
     * 
     */
    @JsonProperty("locnCodeDef")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_LOCN_CODE_DEF")
    private String locnCodeDef;
    /**
     * Budget Control Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE_NSF
     * 
     */
    @JsonProperty("orgnCodeNsf")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ORGN_CODE_NSF")
    private String orgnCodeNsf;
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
     * Combination Budget Control
     * <p>
     * Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND
     * 
     */
    @JsonProperty("hierarchyTableInd")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_HIERARCHY_TABLE_IND")
    private String hierarchyTableInd;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVORGN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVORGN_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVORGN_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public OrganizationCodeMaintenance100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public OrganizationCodeMaintenance100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
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

    public OrganizationCodeMaintenance100QapiPost withOrgnCodePred(String orgnCodePred) {
        this.orgnCodePred = orgnCodePred;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FTVORGN_ORGN_CODE
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
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public OrganizationCodeMaintenance100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
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

    public OrganizationCodeMaintenance100QapiPost withFundCodeDef(String fundCodeDef) {
        this.fundCodeDef = fundCodeDef;
        return this;
    }

    /**
     * Organization Title
     * <p>
     * Lineage reference object : FTVORGN_TITLE
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
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public OrganizationCodeMaintenance100QapiPost withTitle(String title) {
        this.title = title;
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

    public OrganizationCodeMaintenance100QapiPost withProgCodeDef(String progCodeDef) {
        this.progCodeDef = progCodeDef;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVORGN_EFF_DATE
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
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public OrganizationCodeMaintenance100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
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

    public OrganizationCodeMaintenance100QapiPost withActvCodeDef(String actvCodeDef) {
        this.actvCodeDef = actvCodeDef;
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

    public OrganizationCodeMaintenance100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public OrganizationCodeMaintenance100QapiPost withLocnCodeDef(String locnCodeDef) {
        this.locnCodeDef = locnCodeDef;
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

    public OrganizationCodeMaintenance100QapiPost withOrgnCodeNsf(String orgnCodeNsf) {
        this.orgnCodeNsf = orgnCodeNsf;
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

    public OrganizationCodeMaintenance100QapiPost withDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
        return this;
    }

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

    public OrganizationCodeMaintenance100QapiPost withHierarchyTableInd(String hierarchyTableInd) {
        this.hierarchyTableInd = hierarchyTableInd;
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

    public OrganizationCodeMaintenance100QapiPost withActivityDate(Date activityDate) {
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

    public OrganizationCodeMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationCodeMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("orgnCodePred");
        sb.append('=');
        sb.append(((this.orgnCodePred == null)?"<null>":this.orgnCodePred));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("fundCodeDef");
        sb.append('=');
        sb.append(((this.fundCodeDef == null)?"<null>":this.fundCodeDef));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("progCodeDef");
        sb.append('=');
        sb.append(((this.progCodeDef == null)?"<null>":this.progCodeDef));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("actvCodeDef");
        sb.append('=');
        sb.append(((this.actvCodeDef == null)?"<null>":this.actvCodeDef));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("locnCodeDef");
        sb.append('=');
        sb.append(((this.locnCodeDef == null)?"<null>":this.locnCodeDef));
        sb.append(',');
        sb.append("orgnCodeNsf");
        sb.append('=');
        sb.append(((this.orgnCodeNsf == null)?"<null>":this.orgnCodeNsf));
        sb.append(',');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("hierarchyTableInd");
        sb.append('=');
        sb.append(((this.hierarchyTableInd == null)?"<null>":this.hierarchyTableInd));
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
        result = ((result* 31)+((this.hierarchyTableInd == null)? 0 :this.hierarchyTableInd.hashCode()));
        result = ((result* 31)+((this.actvCodeDef == null)? 0 :this.actvCodeDef.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.orgnCodeNsf == null)? 0 :this.orgnCodeNsf.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.locnCodeDef == null)? 0 :this.locnCodeDef.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.orgnCodePred == null)? 0 :this.orgnCodePred.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.fundCodeDef == null)? 0 :this.fundCodeDef.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.progCodeDef == null)? 0 :this.progCodeDef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationCodeMaintenance100QapiPost) == false) {
            return false;
        }
        OrganizationCodeMaintenance100QapiPost rhs = ((OrganizationCodeMaintenance100QapiPost) other);
        return (((((((((((((((((this.hierarchyTableInd == rhs.hierarchyTableInd)||((this.hierarchyTableInd!= null)&&this.hierarchyTableInd.equals(rhs.hierarchyTableInd)))&&((this.actvCodeDef == rhs.actvCodeDef)||((this.actvCodeDef!= null)&&this.actvCodeDef.equals(rhs.actvCodeDef))))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.orgnCodeNsf == rhs.orgnCodeNsf)||((this.orgnCodeNsf!= null)&&this.orgnCodeNsf.equals(rhs.orgnCodeNsf))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.locnCodeDef == rhs.locnCodeDef)||((this.locnCodeDef!= null)&&this.locnCodeDef.equals(rhs.locnCodeDef))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.orgnCodePred == rhs.orgnCodePred)||((this.orgnCodePred!= null)&&this.orgnCodePred.equals(rhs.orgnCodePred))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.fundCodeDef == rhs.fundCodeDef)||((this.fundCodeDef!= null)&&this.fundCodeDef.equals(rhs.fundCodeDef))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.progCodeDef == rhs.progCodeDef)||((this.progCodeDef!= null)&&this.progCodeDef.equals(rhs.progCodeDef))));
    }

}
