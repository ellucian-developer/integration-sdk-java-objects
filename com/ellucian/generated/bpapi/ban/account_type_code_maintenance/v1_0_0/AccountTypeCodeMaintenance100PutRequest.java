
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
    "criteria.atypCode",
    "criteria.effDate",
    "criteria.activityDate",
    "criteria.statusInd",
    "coasCode",
    "title",
    "codePred",
    "criteria.termDate",
    "criteria.normalBal",
    "criteria.internalAtypCode",
    "criteria.title",
    "criteria.atypCodePred",
    "internalAtypCode",
    "criteria.coasCode",
    "termDate",
    "normalBal"
})
@Generated("jsonschema2pojo")
public class AccountTypeCodeMaintenance100PutRequest {

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp")
    private String criteriaAtypCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVATYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVATYP_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_STATUS_IND")
    private String criteriaStatusInd;
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
     * Title
     * <p>
     * Lineage reference object : FTVATYP_TITLE
     * (Required)
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
    @JsonProperty("codePred")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp")
    private String codePred;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVATYP_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVATYP_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("criteria.normalBal")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_NORMAL_BAL")
    private String criteriaNormalBal;
    /**
     * Internal Account Type
     * <p>
     * Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.internalAtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE")
    private String criteriaInternalAtypCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVATYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_TITLE")
    private String criteriaTitle;
    /**
     * Predecessor Code
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("criteria.atypCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp")
    private String criteriaAtypCodePred;
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
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
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

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public String getCriteriaAtypCode() {
        return criteriaAtypCode;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE, Lookup lineage reference object : ftvatyp
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public void setCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVATYP_EFF_DATE
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
     * Lineage reference object : FTVATYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVATYP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVATYP_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVATYP_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
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

    public AccountTypeCodeMaintenance100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public AccountTypeCodeMaintenance100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Predecessor Code
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("codePred")
    public String getCodePred() {
        return codePred;
    }

    /**
     * Predecessor Code
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("codePred")
    public void setCodePred(String codePred) {
        this.codePred = codePred;
    }

    public AccountTypeCodeMaintenance100PutRequest withCodePred(String codePred) {
        this.codePred = codePred;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVATYP_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVATYP_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVATYP_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("criteria.normalBal")
    public String getCriteriaNormalBal() {
        return criteriaNormalBal;
    }

    /**
     * Normal Balance
     * <p>
     * Lineage reference object : FTVATYP_NORMAL_BAL
     * (Required)
     * 
     */
    @JsonProperty("criteria.normalBal")
    public void setCriteriaNormalBal(String criteriaNormalBal) {
        this.criteriaNormalBal = criteriaNormalBal;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaNormalBal(String criteriaNormalBal) {
        this.criteriaNormalBal = criteriaNormalBal;
        return this;
    }

    /**
     * Internal Account Type
     * <p>
     * Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.internalAtypCode")
    public String getCriteriaInternalAtypCode() {
        return criteriaInternalAtypCode;
    }

    /**
     * Internal Account Type
     * <p>
     * Lineage reference object : FTVATYP_INTERNAL_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.internalAtypCode")
    public void setCriteriaInternalAtypCode(String criteriaInternalAtypCode) {
        this.criteriaInternalAtypCode = criteriaInternalAtypCode;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaInternalAtypCode(String criteriaInternalAtypCode) {
        this.criteriaInternalAtypCode = criteriaInternalAtypCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVATYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVATYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Predecessor Code
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("criteria.atypCodePred")
    public String getCriteriaAtypCodePred() {
        return criteriaAtypCodePred;
    }

    /**
     * Predecessor Code
     * <p>
     * Lineage reference object : FTVATYP_ATYP_CODE_PRED, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("criteria.atypCodePred")
    public void setCriteriaAtypCodePred(String criteriaAtypCodePred) {
        this.criteriaAtypCodePred = criteriaAtypCodePred;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaAtypCodePred(String criteriaAtypCodePred) {
        this.criteriaAtypCodePred = criteriaAtypCodePred;
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

    public AccountTypeCodeMaintenance100PutRequest withInternalAtypCode(String internalAtypCode) {
        this.internalAtypCode = internalAtypCode;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas
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
     * Lineage reference object : FTVATYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public AccountTypeCodeMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
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

    public AccountTypeCodeMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public AccountTypeCodeMaintenance100PutRequest withNormalBal(String normalBal) {
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

    public AccountTypeCodeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountTypeCodeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaAtypCode");
        sb.append('=');
        sb.append(((this.criteriaAtypCode == null)?"<null>":this.criteriaAtypCode));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("codePred");
        sb.append('=');
        sb.append(((this.codePred == null)?"<null>":this.codePred));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaNormalBal");
        sb.append('=');
        sb.append(((this.criteriaNormalBal == null)?"<null>":this.criteriaNormalBal));
        sb.append(',');
        sb.append("criteriaInternalAtypCode");
        sb.append('=');
        sb.append(((this.criteriaInternalAtypCode == null)?"<null>":this.criteriaInternalAtypCode));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("criteriaAtypCodePred");
        sb.append('=');
        sb.append(((this.criteriaAtypCodePred == null)?"<null>":this.criteriaAtypCodePred));
        sb.append(',');
        sb.append("internalAtypCode");
        sb.append('=');
        sb.append(((this.internalAtypCode == null)?"<null>":this.internalAtypCode));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCode == null)? 0 :this.criteriaAtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.codePred == null)? 0 :this.codePred.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.criteriaAtypCodePred == null)? 0 :this.criteriaAtypCodePred.hashCode()));
        result = ((result* 31)+((this.internalAtypCode == null)? 0 :this.internalAtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaNormalBal == null)? 0 :this.criteriaNormalBal.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.criteriaInternalAtypCode == null)? 0 :this.criteriaInternalAtypCode.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        result = ((result* 31)+((this.normalBal == null)? 0 :this.normalBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountTypeCodeMaintenance100PutRequest) == false) {
            return false;
        }
        AccountTypeCodeMaintenance100PutRequest rhs = ((AccountTypeCodeMaintenance100PutRequest) other);
        return ((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaAtypCode == rhs.criteriaAtypCode)||((this.criteriaAtypCode!= null)&&this.criteriaAtypCode.equals(rhs.criteriaAtypCode))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.codePred == rhs.codePred)||((this.codePred!= null)&&this.codePred.equals(rhs.codePred))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.criteriaAtypCodePred == rhs.criteriaAtypCodePred)||((this.criteriaAtypCodePred!= null)&&this.criteriaAtypCodePred.equals(rhs.criteriaAtypCodePred))))&&((this.internalAtypCode == rhs.internalAtypCode)||((this.internalAtypCode!= null)&&this.internalAtypCode.equals(rhs.internalAtypCode))))&&((this.criteriaNormalBal == rhs.criteriaNormalBal)||((this.criteriaNormalBal!= null)&&this.criteriaNormalBal.equals(rhs.criteriaNormalBal))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.criteriaInternalAtypCode == rhs.criteriaInternalAtypCode)||((this.criteriaInternalAtypCode!= null)&&this.criteriaInternalAtypCode.equals(rhs.criteriaInternalAtypCode))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))))&&((this.normalBal == rhs.normalBal)||((this.normalBal!= null)&&this.normalBal.equals(rhs.normalBal))));
    }

}
