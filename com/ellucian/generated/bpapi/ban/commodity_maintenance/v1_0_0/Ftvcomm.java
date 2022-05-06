
package com.ellucian.generated.bpapi.ban.commodity_maintenance.v1_0_0;

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
    "stockInd",
    "tgrpCode",
    "displayTgrpTitle",
    "estLifeYears",
    "displayUomsDesc",
    "taxOverrideInd",
    "effDate",
    "displayCommDesc",
    "activityDate",
    "textNote",
    "amstInd",
    "commCodePred",
    "termDate",
    "desc",
    "uomsCode"
})
@Generated("jsonschema2pojo")
public class Ftvcomm {

    /**
     * Stock Item
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("stockInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_STOCK_IND")
    private String stockInd;
    /**
     * Tax Group
     * <p>
     * Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp")
    private String tgrpCode;
    @JsonProperty("displayTgrpTitle")
    private String displayTgrpTitle;
    /**
     * Useful Life
     * <p>
     * Lineage reference object : FTVCOMM_EST_LIFE_YEARS
     * 
     */
    @JsonProperty("estLifeYears")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_EST_LIFE_YEARS")
    private Double estLifeYears;
    @JsonProperty("displayUomsDesc")
    private String displayUomsDesc;
    /**
     * Override Taxes
     * <p>
     * Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND
     * 
     */
    @JsonProperty("taxOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND")
    private String taxOverrideInd;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_EFF_DATE")
    private Date effDate;
    @JsonProperty("displayCommDesc")
    private String displayCommDesc;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOMM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textNote")
    private String textNote;
    /**
     * Fixed Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("amstInd")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_AMST_IND")
    private String amstInd;
    /**
     * Predecessor Commodity
     * <p>
     * Lineage reference object : FTVCOMM_COMM_CODE_PRED
     * 
     */
    @JsonProperty("commCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_COMM_CODE_PRED")
    private String commCodePred;
    /**
     * End Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_TERM_DATE")
    private Date termDate;
    /**
     * Commodity Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_DESC")
    private String desc;
    /**
     * Unit of Measure Code
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * (Required)
     * 
     */
    @JsonProperty("uomsCode")
    @JsonPropertyDescription("Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms")
    private String uomsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Stock Item
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("stockInd")
    public String getStockInd() {
        return stockInd;
    }

    /**
     * Stock Item
     * <p>
     * Lineage reference object : FTVCOMM_STOCK_IND
     * 
     */
    @JsonProperty("stockInd")
    public void setStockInd(String stockInd) {
        this.stockInd = stockInd;
    }

    public Ftvcomm withStockInd(String stockInd) {
        this.stockInd = stockInd;
        return this;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tax Group
     * <p>
     * Lineage reference object : FTVCOMM_TGRP_CODE, Lookup lineage reference object : ftvtrat,ftvtgrp,ftrtgtr,ftvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public Ftvcomm withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    @JsonProperty("displayTgrpTitle")
    public String getDisplayTgrpTitle() {
        return displayTgrpTitle;
    }

    @JsonProperty("displayTgrpTitle")
    public void setDisplayTgrpTitle(String displayTgrpTitle) {
        this.displayTgrpTitle = displayTgrpTitle;
    }

    public Ftvcomm withDisplayTgrpTitle(String displayTgrpTitle) {
        this.displayTgrpTitle = displayTgrpTitle;
        return this;
    }

    /**
     * Useful Life
     * <p>
     * Lineage reference object : FTVCOMM_EST_LIFE_YEARS
     * 
     */
    @JsonProperty("estLifeYears")
    public Double getEstLifeYears() {
        return estLifeYears;
    }

    /**
     * Useful Life
     * <p>
     * Lineage reference object : FTVCOMM_EST_LIFE_YEARS
     * 
     */
    @JsonProperty("estLifeYears")
    public void setEstLifeYears(Double estLifeYears) {
        this.estLifeYears = estLifeYears;
    }

    public Ftvcomm withEstLifeYears(Double estLifeYears) {
        this.estLifeYears = estLifeYears;
        return this;
    }

    @JsonProperty("displayUomsDesc")
    public String getDisplayUomsDesc() {
        return displayUomsDesc;
    }

    @JsonProperty("displayUomsDesc")
    public void setDisplayUomsDesc(String displayUomsDesc) {
        this.displayUomsDesc = displayUomsDesc;
    }

    public Ftvcomm withDisplayUomsDesc(String displayUomsDesc) {
        this.displayUomsDesc = displayUomsDesc;
        return this;
    }

    /**
     * Override Taxes
     * <p>
     * Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND
     * 
     */
    @JsonProperty("taxOverrideInd")
    public String getTaxOverrideInd() {
        return taxOverrideInd;
    }

    /**
     * Override Taxes
     * <p>
     * Lineage reference object : FTVCOMM_TAX_OVERRIDE_IND
     * 
     */
    @JsonProperty("taxOverrideInd")
    public void setTaxOverrideInd(String taxOverrideInd) {
        this.taxOverrideInd = taxOverrideInd;
    }

    public Ftvcomm withTaxOverrideInd(String taxOverrideInd) {
        this.taxOverrideInd = taxOverrideInd;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVCOMM_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Ftvcomm withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    @JsonProperty("displayCommDesc")
    public String getDisplayCommDesc() {
        return displayCommDesc;
    }

    @JsonProperty("displayCommDesc")
    public void setDisplayCommDesc(String displayCommDesc) {
        this.displayCommDesc = displayCommDesc;
    }

    public Ftvcomm withDisplayCommDesc(String displayCommDesc) {
        this.displayCommDesc = displayCommDesc;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOMM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVCOMM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ftvcomm withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textNote")
    public String getTextNote() {
        return textNote;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textNote")
    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }

    public Ftvcomm withTextNote(String textNote) {
        this.textNote = textNote;
        return this;
    }

    /**
     * Fixed Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("amstInd")
    public String getAmstInd() {
        return amstInd;
    }

    /**
     * Fixed Asset
     * <p>
     * Lineage reference object : FTVCOMM_AMST_IND
     * 
     */
    @JsonProperty("amstInd")
    public void setAmstInd(String amstInd) {
        this.amstInd = amstInd;
    }

    public Ftvcomm withAmstInd(String amstInd) {
        this.amstInd = amstInd;
        return this;
    }

    /**
     * Predecessor Commodity
     * <p>
     * Lineage reference object : FTVCOMM_COMM_CODE_PRED
     * 
     */
    @JsonProperty("commCodePred")
    public String getCommCodePred() {
        return commCodePred;
    }

    /**
     * Predecessor Commodity
     * <p>
     * Lineage reference object : FTVCOMM_COMM_CODE_PRED
     * 
     */
    @JsonProperty("commCodePred")
    public void setCommCodePred(String commCodePred) {
        this.commCodePred = commCodePred;
    }

    public Ftvcomm withCommCodePred(String commCodePred) {
        this.commCodePred = commCodePred;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVCOMM_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public Ftvcomm withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Commodity Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Commodity Description
     * <p>
     * Lineage reference object : FTVCOMM_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Ftvcomm withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Unit of Measure Code
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * (Required)
     * 
     */
    @JsonProperty("uomsCode")
    public String getUomsCode() {
        return uomsCode;
    }

    /**
     * Unit of Measure Code
     * <p>
     * Lineage reference object : FTVCOMM_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * (Required)
     * 
     */
    @JsonProperty("uomsCode")
    public void setUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
    }

    public Ftvcomm withUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
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

    public Ftvcomm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ftvcomm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stockInd");
        sb.append('=');
        sb.append(((this.stockInd == null)?"<null>":this.stockInd));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("displayTgrpTitle");
        sb.append('=');
        sb.append(((this.displayTgrpTitle == null)?"<null>":this.displayTgrpTitle));
        sb.append(',');
        sb.append("estLifeYears");
        sb.append('=');
        sb.append(((this.estLifeYears == null)?"<null>":this.estLifeYears));
        sb.append(',');
        sb.append("displayUomsDesc");
        sb.append('=');
        sb.append(((this.displayUomsDesc == null)?"<null>":this.displayUomsDesc));
        sb.append(',');
        sb.append("taxOverrideInd");
        sb.append('=');
        sb.append(((this.taxOverrideInd == null)?"<null>":this.taxOverrideInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("displayCommDesc");
        sb.append('=');
        sb.append(((this.displayCommDesc == null)?"<null>":this.displayCommDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("textNote");
        sb.append('=');
        sb.append(((this.textNote == null)?"<null>":this.textNote));
        sb.append(',');
        sb.append("amstInd");
        sb.append('=');
        sb.append(((this.amstInd == null)?"<null>":this.amstInd));
        sb.append(',');
        sb.append("commCodePred");
        sb.append('=');
        sb.append(((this.commCodePred == null)?"<null>":this.commCodePred));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("uomsCode");
        sb.append('=');
        sb.append(((this.uomsCode == null)?"<null>":this.uomsCode));
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
        result = ((result* 31)+((this.stockInd == null)? 0 :this.stockInd.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.displayTgrpTitle == null)? 0 :this.displayTgrpTitle.hashCode()));
        result = ((result* 31)+((this.estLifeYears == null)? 0 :this.estLifeYears.hashCode()));
        result = ((result* 31)+((this.displayUomsDesc == null)? 0 :this.displayUomsDesc.hashCode()));
        result = ((result* 31)+((this.taxOverrideInd == null)? 0 :this.taxOverrideInd.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.displayCommDesc == null)? 0 :this.displayCommDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.textNote == null)? 0 :this.textNote.hashCode()));
        result = ((result* 31)+((this.amstInd == null)? 0 :this.amstInd.hashCode()));
        result = ((result* 31)+((this.commCodePred == null)? 0 :this.commCodePred.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.uomsCode == null)? 0 :this.uomsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ftvcomm) == false) {
            return false;
        }
        Ftvcomm rhs = ((Ftvcomm) other);
        return (((((((((((((((((this.stockInd == rhs.stockInd)||((this.stockInd!= null)&&this.stockInd.equals(rhs.stockInd)))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.displayTgrpTitle == rhs.displayTgrpTitle)||((this.displayTgrpTitle!= null)&&this.displayTgrpTitle.equals(rhs.displayTgrpTitle))))&&((this.estLifeYears == rhs.estLifeYears)||((this.estLifeYears!= null)&&this.estLifeYears.equals(rhs.estLifeYears))))&&((this.displayUomsDesc == rhs.displayUomsDesc)||((this.displayUomsDesc!= null)&&this.displayUomsDesc.equals(rhs.displayUomsDesc))))&&((this.taxOverrideInd == rhs.taxOverrideInd)||((this.taxOverrideInd!= null)&&this.taxOverrideInd.equals(rhs.taxOverrideInd))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.displayCommDesc == rhs.displayCommDesc)||((this.displayCommDesc!= null)&&this.displayCommDesc.equals(rhs.displayCommDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.textNote == rhs.textNote)||((this.textNote!= null)&&this.textNote.equals(rhs.textNote))))&&((this.amstInd == rhs.amstInd)||((this.amstInd!= null)&&this.amstInd.equals(rhs.amstInd))))&&((this.commCodePred == rhs.commCodePred)||((this.commCodePred!= null)&&this.commCodePred.equals(rhs.commCodePred))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.uomsCode == rhs.uomsCode)||((this.uomsCode!= null)&&this.uomsCode.equals(rhs.uomsCode))));
    }

}
