
package com.ellucian.generated.bpapi.ban.sales_use_tax_group_maintenance.v1_0_0;

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
    "criteria.coasCodeValid",
    "criteria.effDate",
    "criteria.userId",
    "criteria.activityDate",
    "criteria.statusInd",
    "coasCodeValid",
    "criteria.nonTaxable",
    "tratCode",
    "title",
    "criteria.termDate",
    "nonTaxable",
    "criteria.title",
    "effDate",
    "criteria.tgrpCode",
    "statusInd",
    "criteria.nchgDate",
    "termDate"
})
@Generated("jsonschema2pojo")
public class SalesUseTaxGroupMaintenance100PutRequest {

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVTGRP_COAS_CODE_VALID, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCodeValid")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_COAS_CODE_VALID, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCodeValid;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVTGRP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Lineage reference object : FTVTGRP_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_USER_ID")
    private String criteriaUserId;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVTGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVTGRP_COAS_CODE_VALID, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeValid")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_COAS_CODE_VALID, Lookup lineage reference object : ftvcoas")
    private String coasCodeValid;
    /**
     * Non Taxable
     * <p>
     * Lineage reference object : FTVTGRP_NON_TAXABLE
     * 
     */
    @JsonProperty("criteria.nonTaxable")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_NON_TAXABLE")
    private String criteriaNonTaxable;
    /**
     * Tax Code
     * <p>
     * Lineage reference object : FTRTGTR_TRAT_CODE, Lookup lineage reference object : ftvtrat
     * (Required)
     * 
     */
    @JsonProperty("tratCode")
    @JsonPropertyDescription("Lineage reference object : FTRTGTR_TRAT_CODE, Lookup lineage reference object : ftvtrat")
    private String tratCode;
    /**
     * Tax Group Title
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TITLE")
    private String title;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVTGRP_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Non Taxable
     * <p>
     * Lineage reference object : FTVTGRP_NON_TAXABLE
     * 
     */
    @JsonProperty("nonTaxable")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_NON_TAXABLE")
    private String nonTaxable;
    /**
     * Tax Group Title
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TITLE")
    private String criteriaTitle;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVTGRP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_EFF_DATE")
    private Date effDate;
    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * (Required)
     * 
     */
    @JsonProperty("criteria.tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String criteriaTgrpCode;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_STATUS_IND")
    private String statusInd;
    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FTVTGRP_NCHG_DATE
     * 
     */
    @JsonProperty("criteria.nchgDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_NCHG_DATE")
    private Date criteriaNchgDate;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVTGRP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TERM_DATE")
    private Date termDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVTGRP_COAS_CODE_VALID, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCodeValid")
    public String getCriteriaCoasCodeValid() {
        return criteriaCoasCodeValid;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVTGRP_COAS_CODE_VALID, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("criteria.coasCodeValid")
    public void setCriteriaCoasCodeValid(String criteriaCoasCodeValid) {
        this.criteriaCoasCodeValid = criteriaCoasCodeValid;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaCoasCodeValid(String criteriaCoasCodeValid) {
        this.criteriaCoasCodeValid = criteriaCoasCodeValid;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVTGRP_EFF_DATE
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
     * Lineage reference object : FTVTGRP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Lineage reference object : FTVTGRP_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : FTVTGRP_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVTGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVTGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVTGRP_COAS_CODE_VALID, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeValid")
    public String getCoasCodeValid() {
        return coasCodeValid;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVTGRP_COAS_CODE_VALID, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCodeValid")
    public void setCoasCodeValid(String coasCodeValid) {
        this.coasCodeValid = coasCodeValid;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCoasCodeValid(String coasCodeValid) {
        this.coasCodeValid = coasCodeValid;
        return this;
    }

    /**
     * Non Taxable
     * <p>
     * Lineage reference object : FTVTGRP_NON_TAXABLE
     * 
     */
    @JsonProperty("criteria.nonTaxable")
    public String getCriteriaNonTaxable() {
        return criteriaNonTaxable;
    }

    /**
     * Non Taxable
     * <p>
     * Lineage reference object : FTVTGRP_NON_TAXABLE
     * 
     */
    @JsonProperty("criteria.nonTaxable")
    public void setCriteriaNonTaxable(String criteriaNonTaxable) {
        this.criteriaNonTaxable = criteriaNonTaxable;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaNonTaxable(String criteriaNonTaxable) {
        this.criteriaNonTaxable = criteriaNonTaxable;
        return this;
    }

    /**
     * Tax Code
     * <p>
     * Lineage reference object : FTRTGTR_TRAT_CODE, Lookup lineage reference object : ftvtrat
     * (Required)
     * 
     */
    @JsonProperty("tratCode")
    public String getTratCode() {
        return tratCode;
    }

    /**
     * Tax Code
     * <p>
     * Lineage reference object : FTRTGTR_TRAT_CODE, Lookup lineage reference object : ftvtrat
     * (Required)
     * 
     */
    @JsonProperty("tratCode")
    public void setTratCode(String tratCode) {
        this.tratCode = tratCode;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withTratCode(String tratCode) {
        this.tratCode = tratCode;
        return this;
    }

    /**
     * Tax Group Title
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Tax Group Title
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVTGRP_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVTGRP_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Non Taxable
     * <p>
     * Lineage reference object : FTVTGRP_NON_TAXABLE
     * 
     */
    @JsonProperty("nonTaxable")
    public String getNonTaxable() {
        return nonTaxable;
    }

    /**
     * Non Taxable
     * <p>
     * Lineage reference object : FTVTGRP_NON_TAXABLE
     * 
     */
    @JsonProperty("nonTaxable")
    public void setNonTaxable(String nonTaxable) {
        this.nonTaxable = nonTaxable;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withNonTaxable(String nonTaxable) {
        this.nonTaxable = nonTaxable;
        return this;
    }

    /**
     * Tax Group Title
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Tax Group Title
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVTGRP_EFF_DATE
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
     * Lineage reference object : FTVTGRP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * (Required)
     * 
     */
    @JsonProperty("criteria.tgrpCode")
    public String getCriteriaTgrpCode() {
        return criteriaTgrpCode;
    }

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * (Required)
     * 
     */
    @JsonProperty("criteria.tgrpCode")
    public void setCriteriaTgrpCode(String criteriaTgrpCode) {
        this.criteriaTgrpCode = criteriaTgrpCode;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaTgrpCode(String criteriaTgrpCode) {
        this.criteriaTgrpCode = criteriaTgrpCode;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FTVTGRP_NCHG_DATE
     * 
     */
    @JsonProperty("criteria.nchgDate")
    public Date getCriteriaNchgDate() {
        return criteriaNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FTVTGRP_NCHG_DATE
     * 
     */
    @JsonProperty("criteria.nchgDate")
    public void setCriteriaNchgDate(Date criteriaNchgDate) {
        this.criteriaNchgDate = criteriaNchgDate;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withCriteriaNchgDate(Date criteriaNchgDate) {
        this.criteriaNchgDate = criteriaNchgDate;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVTGRP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVTGRP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public SalesUseTaxGroupMaintenance100PutRequest withTermDate(Date termDate) {
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

    public SalesUseTaxGroupMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesUseTaxGroupMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCoasCodeValid");
        sb.append('=');
        sb.append(((this.criteriaCoasCodeValid == null)?"<null>":this.criteriaCoasCodeValid));
        sb.append(',');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("coasCodeValid");
        sb.append('=');
        sb.append(((this.coasCodeValid == null)?"<null>":this.coasCodeValid));
        sb.append(',');
        sb.append("criteriaNonTaxable");
        sb.append('=');
        sb.append(((this.criteriaNonTaxable == null)?"<null>":this.criteriaNonTaxable));
        sb.append(',');
        sb.append("tratCode");
        sb.append('=');
        sb.append(((this.tratCode == null)?"<null>":this.tratCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("nonTaxable");
        sb.append('=');
        sb.append(((this.nonTaxable == null)?"<null>":this.nonTaxable));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("criteriaTgrpCode");
        sb.append('=');
        sb.append(((this.criteriaTgrpCode == null)?"<null>":this.criteriaTgrpCode));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("criteriaNchgDate");
        sb.append('=');
        sb.append(((this.criteriaNchgDate == null)?"<null>":this.criteriaNchgDate));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaNonTaxable == null)? 0 :this.criteriaNonTaxable.hashCode()));
        result = ((result* 31)+((this.coasCodeValid == null)? 0 :this.coasCodeValid.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.tratCode == null)? 0 :this.tratCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.nonTaxable == null)? 0 :this.nonTaxable.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCodeValid == null)? 0 :this.criteriaCoasCodeValid.hashCode()));
        result = ((result* 31)+((this.criteriaNchgDate == null)? 0 :this.criteriaNchgDate.hashCode()));
        result = ((result* 31)+((this.criteriaTgrpCode == null)? 0 :this.criteriaTgrpCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SalesUseTaxGroupMaintenance100PutRequest) == false) {
            return false;
        }
        SalesUseTaxGroupMaintenance100PutRequest rhs = ((SalesUseTaxGroupMaintenance100PutRequest) other);
        return (((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaNonTaxable == rhs.criteriaNonTaxable)||((this.criteriaNonTaxable!= null)&&this.criteriaNonTaxable.equals(rhs.criteriaNonTaxable))))&&((this.coasCodeValid == rhs.coasCodeValid)||((this.coasCodeValid!= null)&&this.coasCodeValid.equals(rhs.coasCodeValid))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.tratCode == rhs.tratCode)||((this.tratCode!= null)&&this.tratCode.equals(rhs.tratCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.nonTaxable == rhs.nonTaxable)||((this.nonTaxable!= null)&&this.nonTaxable.equals(rhs.nonTaxable))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.criteriaCoasCodeValid == rhs.criteriaCoasCodeValid)||((this.criteriaCoasCodeValid!= null)&&this.criteriaCoasCodeValid.equals(rhs.criteriaCoasCodeValid))))&&((this.criteriaNchgDate == rhs.criteriaNchgDate)||((this.criteriaNchgDate!= null)&&this.criteriaNchgDate.equals(rhs.criteriaNchgDate))))&&((this.criteriaTgrpCode == rhs.criteriaTgrpCode)||((this.criteriaTgrpCode!= null)&&this.criteriaTgrpCode.equals(rhs.criteriaTgrpCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))));
    }

}
