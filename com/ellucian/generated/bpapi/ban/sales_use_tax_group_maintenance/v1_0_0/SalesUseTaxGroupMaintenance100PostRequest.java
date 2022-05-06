
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
    "ftvtgrpStatusInd",
    "effDate",
    "tgrpCode",
    "coasCodeValid",
    "statusInd",
    "ftvtgrpTgrpCode",
    "tratCode",
    "title",
    "termDate",
    "nonTaxable"
})
@Generated("jsonschema2pojo")
public class SalesUseTaxGroupMaintenance100PostRequest {

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("ftvtgrpStatusInd")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_STATUS_IND")
    private String ftvtgrpStatusInd;
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
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCode;
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
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_STATUS_IND")
    private String statusInd;
    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * (Required)
     * 
     */
    @JsonProperty("ftvtgrpTgrpCode")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String ftvtgrpTgrpCode;
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
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TERM_DATE")
    private Date termDate;
    /**
     * Non Taxable
     * <p>
     * Lineage reference object : FTVTGRP_NON_TAXABLE
     * 
     */
    @JsonProperty("nonTaxable")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_NON_TAXABLE")
    private String nonTaxable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("ftvtgrpStatusInd")
    public String getFtvtgrpStatusInd() {
        return ftvtgrpStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVTGRP_STATUS_IND
     * 
     */
    @JsonProperty("ftvtgrpStatusInd")
    public void setFtvtgrpStatusInd(String ftvtgrpStatusInd) {
        this.ftvtgrpStatusInd = ftvtgrpStatusInd;
    }

    public SalesUseTaxGroupMaintenance100PostRequest withFtvtgrpStatusInd(String ftvtgrpStatusInd) {
        this.ftvtgrpStatusInd = ftvtgrpStatusInd;
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

    public SalesUseTaxGroupMaintenance100PostRequest withEffDate(Date effDate) {
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
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * (Required)
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public SalesUseTaxGroupMaintenance100PostRequest withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
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

    public SalesUseTaxGroupMaintenance100PostRequest withCoasCodeValid(String coasCodeValid) {
        this.coasCodeValid = coasCodeValid;
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

    public SalesUseTaxGroupMaintenance100PostRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * (Required)
     * 
     */
    @JsonProperty("ftvtgrpTgrpCode")
    public String getFtvtgrpTgrpCode() {
        return ftvtgrpTgrpCode;
    }

    /**
     * Tax Group Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * (Required)
     * 
     */
    @JsonProperty("ftvtgrpTgrpCode")
    public void setFtvtgrpTgrpCode(String ftvtgrpTgrpCode) {
        this.ftvtgrpTgrpCode = ftvtgrpTgrpCode;
    }

    public SalesUseTaxGroupMaintenance100PostRequest withFtvtgrpTgrpCode(String ftvtgrpTgrpCode) {
        this.ftvtgrpTgrpCode = ftvtgrpTgrpCode;
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

    public SalesUseTaxGroupMaintenance100PostRequest withTratCode(String tratCode) {
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

    public SalesUseTaxGroupMaintenance100PostRequest withTitle(String title) {
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

    public SalesUseTaxGroupMaintenance100PostRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public SalesUseTaxGroupMaintenance100PostRequest withNonTaxable(String nonTaxable) {
        this.nonTaxable = nonTaxable;
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

    public SalesUseTaxGroupMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesUseTaxGroupMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvtgrpStatusInd");
        sb.append('=');
        sb.append(((this.ftvtgrpStatusInd == null)?"<null>":this.ftvtgrpStatusInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("coasCodeValid");
        sb.append('=');
        sb.append(((this.coasCodeValid == null)?"<null>":this.coasCodeValid));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("ftvtgrpTgrpCode");
        sb.append('=');
        sb.append(((this.ftvtgrpTgrpCode == null)?"<null>":this.ftvtgrpTgrpCode));
        sb.append(',');
        sb.append("tratCode");
        sb.append('=');
        sb.append(((this.tratCode == null)?"<null>":this.tratCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("nonTaxable");
        sb.append('=');
        sb.append(((this.nonTaxable == null)?"<null>":this.nonTaxable));
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
        result = ((result* 31)+((this.ftvtgrpStatusInd == null)? 0 :this.ftvtgrpStatusInd.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.coasCodeValid == null)? 0 :this.coasCodeValid.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.ftvtgrpTgrpCode == null)? 0 :this.ftvtgrpTgrpCode.hashCode()));
        result = ((result* 31)+((this.tratCode == null)? 0 :this.tratCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.nonTaxable == null)? 0 :this.nonTaxable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SalesUseTaxGroupMaintenance100PostRequest) == false) {
            return false;
        }
        SalesUseTaxGroupMaintenance100PostRequest rhs = ((SalesUseTaxGroupMaintenance100PostRequest) other);
        return ((((((((((((this.ftvtgrpStatusInd == rhs.ftvtgrpStatusInd)||((this.ftvtgrpStatusInd!= null)&&this.ftvtgrpStatusInd.equals(rhs.ftvtgrpStatusInd)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.coasCodeValid == rhs.coasCodeValid)||((this.coasCodeValid!= null)&&this.coasCodeValid.equals(rhs.coasCodeValid))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.ftvtgrpTgrpCode == rhs.ftvtgrpTgrpCode)||((this.ftvtgrpTgrpCode!= null)&&this.ftvtgrpTgrpCode.equals(rhs.ftvtgrpTgrpCode))))&&((this.tratCode == rhs.tratCode)||((this.tratCode!= null)&&this.tratCode.equals(rhs.tratCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.nonTaxable == rhs.nonTaxable)||((this.nonTaxable!= null)&&this.nonTaxable.equals(rhs.nonTaxable))));
    }

}
