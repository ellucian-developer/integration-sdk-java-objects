
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
    "coasCode",
    "termDate",
    "statusInd",
    "atypCode",
    "internalAtypCode",
    "title",
    "atypCodePred",
    "effDate",
    "normalBal",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class AccountTypeCodeMaintenance100QapiPost {

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
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
     * Active Status
     * <p>
     * Lineage reference object : FTVATYP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_STATUS_IND")
    private String statusInd;
    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp")
    private String atypCode;
    /**
     * Internal Account Type
     * <p>
     * Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE
     * 
     */
    @JsonProperty("internalAtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE")
    private String internalAtypCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVATYP_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_TITLE")
    private String title;
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
     * Effective Date
     * <p>
     * Lineage reference object : FTVATYP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_EFF_DATE")
    private Date effDate;
    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVATYP_NORMAL_BAL
     * 
     */
    @JsonProperty("normalBal")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_NORMAL_BAL")
    private String normalBal;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public AccountTypeCodeMaintenance100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public AccountTypeCodeMaintenance100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public AccountTypeCodeMaintenance100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp
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
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public AccountTypeCodeMaintenance100QapiPost withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Internal Account Type
     * <p>
     * Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE
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
     * 
     */
    @JsonProperty("internalAtypCode")
    public void setInternalAtypCode(String internalAtypCode) {
        this.internalAtypCode = internalAtypCode;
    }

    public AccountTypeCodeMaintenance100QapiPost withInternalAtypCode(String internalAtypCode) {
        this.internalAtypCode = internalAtypCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVATYP_TITLE
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
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AccountTypeCodeMaintenance100QapiPost withTitle(String title) {
        this.title = title;
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

    public AccountTypeCodeMaintenance100QapiPost withAtypCodePred(String atypCodePred) {
        this.atypCodePred = atypCodePred;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVATYP_EFF_DATE
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
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public AccountTypeCodeMaintenance100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVATYP_NORMAL_BAL
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
     * 
     */
    @JsonProperty("normalBal")
    public void setNormalBal(String normalBal) {
        this.normalBal = normalBal;
    }

    public AccountTypeCodeMaintenance100QapiPost withNormalBal(String normalBal) {
        this.normalBal = normalBal;
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

    public AccountTypeCodeMaintenance100QapiPost withActivityDate(Date activityDate) {
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

    public AccountTypeCodeMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountTypeCodeMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("internalAtypCode");
        sb.append('=');
        sb.append(((this.internalAtypCode == null)?"<null>":this.internalAtypCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("atypCodePred");
        sb.append('=');
        sb.append(((this.atypCodePred == null)?"<null>":this.atypCodePred));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("normalBal");
        sb.append('=');
        sb.append(((this.normalBal == null)?"<null>":this.normalBal));
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
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.internalAtypCode == null)? 0 :this.internalAtypCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.atypCodePred == null)? 0 :this.atypCodePred.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.normalBal == null)? 0 :this.normalBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountTypeCodeMaintenance100QapiPost) == false) {
            return false;
        }
        AccountTypeCodeMaintenance100QapiPost rhs = ((AccountTypeCodeMaintenance100QapiPost) other);
        return ((((((((((((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.internalAtypCode == rhs.internalAtypCode)||((this.internalAtypCode!= null)&&this.internalAtypCode.equals(rhs.internalAtypCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.atypCodePred == rhs.atypCodePred)||((this.atypCodePred!= null)&&this.atypCodePred.equals(rhs.atypCodePred))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.normalBal == rhs.normalBal)||((this.normalBal!= null)&&this.normalBal.equals(rhs.normalBal))));
    }

}
