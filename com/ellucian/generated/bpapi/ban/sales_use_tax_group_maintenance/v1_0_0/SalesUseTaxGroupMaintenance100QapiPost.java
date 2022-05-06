
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
    "tgrpCode",
    "nonTaxable",
    "statusInd",
    "effDate",
    "title",
    "termDate",
    "coasCodeValid",
    "nchgDate",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class SalesUseTaxGroupMaintenance100QapiPost {

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCode;
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
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_STATUS_IND")
    private String statusInd;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVTGRP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_EFF_DATE")
    private Date effDate;
    /**
     * Tax Group Title
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
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
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TERM_DATE")
    private Date termDate;
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
     * Next Change Date
     * <p>
     * Lineage reference object : FTVTGRP_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_NCHG_DATE")
    private Date nchgDate;
    @JsonProperty("userId")
    private String userId;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVTGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public SalesUseTaxGroupMaintenance100QapiPost withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
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

    public SalesUseTaxGroupMaintenance100QapiPost withNonTaxable(String nonTaxable) {
        this.nonTaxable = nonTaxable;
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

    public SalesUseTaxGroupMaintenance100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVTGRP_EFF_DATE
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
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public SalesUseTaxGroupMaintenance100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Tax Group Title
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
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
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public SalesUseTaxGroupMaintenance100QapiPost withTitle(String title) {
        this.title = title;
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

    public SalesUseTaxGroupMaintenance100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public SalesUseTaxGroupMaintenance100QapiPost withCoasCodeValid(String coasCodeValid) {
        this.coasCodeValid = coasCodeValid;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FTVTGRP_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    public Date getNchgDate() {
        return nchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FTVTGRP_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    public void setNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
    }

    public SalesUseTaxGroupMaintenance100QapiPost withNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SalesUseTaxGroupMaintenance100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVTGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVTGRP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SalesUseTaxGroupMaintenance100QapiPost withActivityDate(Date activityDate) {
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

    public SalesUseTaxGroupMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesUseTaxGroupMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("nonTaxable");
        sb.append('=');
        sb.append(((this.nonTaxable == null)?"<null>":this.nonTaxable));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("coasCodeValid");
        sb.append('=');
        sb.append(((this.coasCodeValid == null)?"<null>":this.coasCodeValid));
        sb.append(',');
        sb.append("nchgDate");
        sb.append('=');
        sb.append(((this.nchgDate == null)?"<null>":this.nchgDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.coasCodeValid == null)? 0 :this.coasCodeValid.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.nchgDate == null)? 0 :this.nchgDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.nonTaxable == null)? 0 :this.nonTaxable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SalesUseTaxGroupMaintenance100QapiPost) == false) {
            return false;
        }
        SalesUseTaxGroupMaintenance100QapiPost rhs = ((SalesUseTaxGroupMaintenance100QapiPost) other);
        return ((((((((((((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate)))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.coasCodeValid == rhs.coasCodeValid)||((this.coasCodeValid!= null)&&this.coasCodeValid.equals(rhs.coasCodeValid))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.nchgDate == rhs.nchgDate)||((this.nchgDate!= null)&&this.nchgDate.equals(rhs.nchgDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.nonTaxable == rhs.nonTaxable)||((this.nonTaxable!= null)&&this.nonTaxable.equals(rhs.nonTaxable))));
    }

}
