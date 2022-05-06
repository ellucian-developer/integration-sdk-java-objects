
package com.ellucian.generated.bpapi.ban.sales_use_tax_groups.v1_0_0;

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
    "coasCodeValid",
    "effDate",
    "termDate",
    "tgrpCode",
    "title"
})
@Generated("jsonschema2pojo")
public class SalesUseTaxGroups100QapiPost {

    /**
     * COA
     * <p>
     * Lineage reference object : FTVTGRP_COAS_CODE_VALID
     * 
     */
    @JsonProperty("coasCodeValid")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_COAS_CODE_VALID")
    private String coasCodeValid;
    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVTGRP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_EFF_DATE")
    private Date effDate;
    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVTGRP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TERM_DATE")
    private Date termDate;
    /**
     * Tax Group
     * Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TGRP_CODE")
    private String tgrpCode;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVTGRP_TITLE")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * COA
     * <p>
     * Lineage reference object : FTVTGRP_COAS_CODE_VALID
     * 
     */
    @JsonProperty("coasCodeValid")
    public String getCoasCodeValid() {
        return coasCodeValid;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FTVTGRP_COAS_CODE_VALID
     * 
     */
    @JsonProperty("coasCodeValid")
    public void setCoasCodeValid(String coasCodeValid) {
        this.coasCodeValid = coasCodeValid;
    }

    public SalesUseTaxGroups100QapiPost withCoasCodeValid(String coasCodeValid) {
        this.coasCodeValid = coasCodeValid;
        return this;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVTGRP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVTGRP_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public SalesUseTaxGroups100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVTGRP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVTGRP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public SalesUseTaxGroups100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Tax Group
     * Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group
     * Code
     * <p>
     * Lineage reference object : FTVTGRP_TGRP_CODE
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public SalesUseTaxGroups100QapiPost withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVTGRP_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public SalesUseTaxGroups100QapiPost withTitle(String title) {
        this.title = title;
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

    public SalesUseTaxGroups100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SalesUseTaxGroups100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCodeValid");
        sb.append('=');
        sb.append(((this.coasCodeValid == null)?"<null>":this.coasCodeValid));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.coasCodeValid == null)? 0 :this.coasCodeValid.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SalesUseTaxGroups100QapiPost) == false) {
            return false;
        }
        SalesUseTaxGroups100QapiPost rhs = ((SalesUseTaxGroups100QapiPost) other);
        return (((((((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate)))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.coasCodeValid == rhs.coasCodeValid)||((this.coasCodeValid!= null)&&this.coasCodeValid.equals(rhs.coasCodeValid))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }

}
