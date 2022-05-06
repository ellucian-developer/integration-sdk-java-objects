
package com.ellucian.generated.bpapi.ban.account_type_code_maintenance.v1_0_0;

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
    "normalBalanceDescription",
    "predecessorTitle",
    "coasCode",
    "atypCodePred",
    "title",
    "internalAtypTitle",
    "effDate",
    "activityDate",
    "displayNchgDate",
    "internalAtypCode",
    "statusInd",
    "termDate",
    "atypCode",
    "normalBal"
})
@Generated("jsonschema2pojo")
public class AccountTypeCodeMaintenance100PostResponse {

    @JsonProperty("normalBalanceDescription")
    private String normalBalanceDescription;
    @JsonProperty("predecessorTitle")
    private String predecessorTitle;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Predecessor Code
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp")
    private String atypCodePred;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVATYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_TITLE")
    private String title;
    @JsonProperty("internalAtypTitle")
    private String internalAtypTitle;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVATYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_EFF_DATE")
    private Date effDate;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_ACTIVITY_DATE")
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
     * Internal Account Type
     * <p>
     * Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalAtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE")
    private String internalAtypCode;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVATYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_STATUS_IND")
    private String statusInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVATYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_TERM_DATE")
    private Date termDate;
    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp")
    private String atypCode;
    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVATYP_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("normalBal")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_NORMAL_BAL")
    private String normalBal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("normalBalanceDescription")
    public String getNormalBalanceDescription() {
        return normalBalanceDescription;
    }

    @JsonProperty("normalBalanceDescription")
    public void setNormalBalanceDescription(String normalBalanceDescription) {
        this.normalBalanceDescription = normalBalanceDescription;
    }

    public AccountTypeCodeMaintenance100PostResponse withNormalBalanceDescription(String normalBalanceDescription) {
        this.normalBalanceDescription = normalBalanceDescription;
        return this;
    }

    @JsonProperty("predecessorTitle")
    public String getPredecessorTitle() {
        return predecessorTitle;
    }

    @JsonProperty("predecessorTitle")
    public void setPredecessorTitle(String predecessorTitle) {
        this.predecessorTitle = predecessorTitle;
    }

    public AccountTypeCodeMaintenance100PostResponse withPredecessorTitle(String predecessorTitle) {
        this.predecessorTitle = predecessorTitle;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public AccountTypeCodeMaintenance100PostResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Predecessor Code
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCodePred")
    public String getAtypCodePred() {
        return atypCodePred;
    }

    /**
     * Predecessor Code
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCodePred")
    public void setAtypCodePred(String atypCodePred) {
        this.atypCodePred = atypCodePred;
    }

    public AccountTypeCodeMaintenance100PostResponse withAtypCodePred(String atypCodePred) {
        this.atypCodePred = atypCodePred;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVATYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVATYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AccountTypeCodeMaintenance100PostResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("internalAtypTitle")
    public String getInternalAtypTitle() {
        return internalAtypTitle;
    }

    @JsonProperty("internalAtypTitle")
    public void setInternalAtypTitle(String internalAtypTitle) {
        this.internalAtypTitle = internalAtypTitle;
    }

    public AccountTypeCodeMaintenance100PostResponse withInternalAtypTitle(String internalAtypTitle) {
        this.internalAtypTitle = internalAtypTitle;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVATYP_EFF_DATE
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
     * Lineage reference object : FTVATYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public AccountTypeCodeMaintenance100PostResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AccountTypeCodeMaintenance100PostResponse withActivityDate(Date activityDate) {
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

    public AccountTypeCodeMaintenance100PostResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
        return this;
    }

    /**
     * Internal Account Type
     * <p>
     * Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalAtypCode")
    public String getInternalAtypCode() {
        return internalAtypCode;
    }

    /**
     * Internal Account Type
     * <p>
     * Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalAtypCode")
    public void setInternalAtypCode(String internalAtypCode) {
        this.internalAtypCode = internalAtypCode;
    }

    public AccountTypeCodeMaintenance100PostResponse withInternalAtypCode(String internalAtypCode) {
        this.internalAtypCode = internalAtypCode;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVATYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVATYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public AccountTypeCodeMaintenance100PostResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVATYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVATYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public AccountTypeCodeMaintenance100PostResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public AccountTypeCodeMaintenance100PostResponse withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVATYP_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("normalBal")
    public String getNormalBal() {
        return normalBal;
    }

    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVATYP_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("normalBal")
    public void setNormalBal(String normalBal) {
        this.normalBal = normalBal;
    }

    public AccountTypeCodeMaintenance100PostResponse withNormalBal(String normalBal) {
        this.normalBal = normalBal;
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

    public AccountTypeCodeMaintenance100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountTypeCodeMaintenance100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("normalBalanceDescription");
        sb.append('=');
        sb.append(((this.normalBalanceDescription == null)?"<null>":this.normalBalanceDescription));
        sb.append(',');
        sb.append("predecessorTitle");
        sb.append('=');
        sb.append(((this.predecessorTitle == null)?"<null>":this.predecessorTitle));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("atypCodePred");
        sb.append('=');
        sb.append(((this.atypCodePred == null)?"<null>":this.atypCodePred));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("internalAtypTitle");
        sb.append('=');
        sb.append(((this.internalAtypTitle == null)?"<null>":this.internalAtypTitle));
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
        sb.append("internalAtypCode");
        sb.append('=');
        sb.append(((this.internalAtypCode == null)?"<null>":this.internalAtypCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("normalBal");
        sb.append('=');
        sb.append(((this.normalBal == null)?"<null>":this.normalBal));
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
        result = ((result* 31)+((this.normalBalanceDescription == null)? 0 :this.normalBalanceDescription.hashCode()));
        result = ((result* 31)+((this.predecessorTitle == null)? 0 :this.predecessorTitle.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.atypCodePred == null)? 0 :this.atypCodePred.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.internalAtypTitle == null)? 0 :this.internalAtypTitle.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.internalAtypCode == null)? 0 :this.internalAtypCode.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.normalBal == null)? 0 :this.normalBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountTypeCodeMaintenance100PostResponse) == false) {
            return false;
        }
        AccountTypeCodeMaintenance100PostResponse rhs = ((AccountTypeCodeMaintenance100PostResponse) other);
        return ((((((((((((((((this.normalBalanceDescription == rhs.normalBalanceDescription)||((this.normalBalanceDescription!= null)&&this.normalBalanceDescription.equals(rhs.normalBalanceDescription)))&&((this.predecessorTitle == rhs.predecessorTitle)||((this.predecessorTitle!= null)&&this.predecessorTitle.equals(rhs.predecessorTitle))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.atypCodePred == rhs.atypCodePred)||((this.atypCodePred!= null)&&this.atypCodePred.equals(rhs.atypCodePred))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.internalAtypTitle == rhs.internalAtypTitle)||((this.internalAtypTitle!= null)&&this.internalAtypTitle.equals(rhs.internalAtypTitle))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.internalAtypCode == rhs.internalAtypCode)||((this.internalAtypCode!= null)&&this.internalAtypCode.equals(rhs.internalAtypCode))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.normalBal == rhs.normalBal)||((this.normalBal!= null)&&this.normalBal.equals(rhs.normalBal))));
    }

}
