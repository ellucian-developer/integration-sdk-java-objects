
package com.ellucian.generated.bpapi.ban.transfer_institution_catalog_entry.v1_0_0;

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
    "termCodeEffTrns",
    "protectInd",
    "trnsHighHrs",
    "crseNumbTrns",
    "trnsCatalog",
    "trnsLowHrs",
    "tlvlCode",
    "trnsTitle",
    "groupPrimaryInd",
    "crseDesc",
    "trnsReviewInd",
    "tgrdCodeMin",
    "subjCodeTrns",
    "group",
    "tastCode"
})
@Generated("jsonschema2pojo")
public class Shbtatc {

    /**
     * Term
     * <p>
     * Lineage reference object : SHBTATC_TERM_CODE_EFF_TRNS, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEffTrns")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_TERM_CODE_EFF_TRNS, Lookup lineage reference object : stvterm")
    private String termCodeEffTrns;
    /**
     * Lineage reference object : SHBTATC_PROTECT_IND
     * 
     */
    @JsonProperty("protectInd")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_PROTECT_IND")
    private String protectInd;
    /**
     * Credits High
     * <p>
     * Lineage reference object : SHBTATC_TRNS_HIGH_HRS
     * 
     */
    @JsonProperty("trnsHighHrs")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_TRNS_HIGH_HRS")
    private Double trnsHighHrs;
    /**
     * Course
     * <p>
     * Lineage reference object : SHBTATC_CRSE_NUMB_TRNS
     * 
     */
    @JsonProperty("crseNumbTrns")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_CRSE_NUMB_TRNS")
    private String crseNumbTrns;
    /**
     * Catalog
     * <p>
     * Lineage reference object : SHBTATC_TRNS_CATALOG
     * 
     */
    @JsonProperty("trnsCatalog")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_TRNS_CATALOG")
    private String trnsCatalog;
    /**
     * Credits Low
     * <p>
     * Lineage reference object : SHBTATC_TRNS_LOW_HRS
     * 
     */
    @JsonProperty("trnsLowHrs")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_TRNS_LOW_HRS")
    private Double trnsLowHrs;
    /**
     * Level
     * <p>
     * Lineage reference object : SHBTATC_TLVL_CODE, Lookup lineage reference object : stvtlvl,sorbtal,sorbtal
     * 
     */
    @JsonProperty("tlvlCode")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_TLVL_CODE, Lookup lineage reference object : stvtlvl,sorbtal,sorbtal")
    private String tlvlCode;
    /**
     * Title
     * <p>
     * Lineage reference object : SHBTATC_TRNS_TITLE
     * 
     */
    @JsonProperty("trnsTitle")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_TRNS_TITLE")
    private String trnsTitle;
    /**
     * Lineage reference object : SHBTATC_GROUP_PRIMARY_IND
     * 
     */
    @JsonProperty("groupPrimaryInd")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_GROUP_PRIMARY_IND")
    private String groupPrimaryInd;
    /**
     * Course Description
     * <p>
     * Lineage reference object : SHBTATC_CRSE_DESC
     * 
     */
    @JsonProperty("crseDesc")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_CRSE_DESC")
    private String crseDesc;
    /**
     * Lineage reference object : SHBTATC_TRNS_REVIEW_IND
     * 
     */
    @JsonProperty("trnsReviewInd")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_TRNS_REVIEW_IND")
    private String trnsReviewInd;
    /**
     * Minimum Grade
     * <p>
     * Lineage reference object : SHBTATC_TGRD_CODE_MIN, Lookup lineage reference object : shrtgrd,shrtgrd,shrtgrd
     * 
     */
    @JsonProperty("tgrdCodeMin")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_TGRD_CODE_MIN, Lookup lineage reference object : shrtgrd,shrtgrd,shrtgrd")
    private String tgrdCodeMin;
    /**
     * Subject
     * <p>
     * Lineage reference object : SHBTATC_SUBJ_CODE_TRNS
     * 
     */
    @JsonProperty("subjCodeTrns")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_SUBJ_CODE_TRNS")
    private String subjCodeTrns;
    /**
     * Group
     * <p>
     * Lineage reference object : SHBTATC_GROUP
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_GROUP")
    private String group;
    /**
     * Status
     * <p>
     * Lineage reference object : SHBTATC_TAST_CODE, Lookup lineage reference object : stvtast
     * 
     */
    @JsonProperty("tastCode")
    @JsonPropertyDescription("Lineage reference object : SHBTATC_TAST_CODE, Lookup lineage reference object : stvtast")
    private String tastCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : SHBTATC_TERM_CODE_EFF_TRNS, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEffTrns")
    public String getTermCodeEffTrns() {
        return termCodeEffTrns;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SHBTATC_TERM_CODE_EFF_TRNS, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEffTrns")
    public void setTermCodeEffTrns(String termCodeEffTrns) {
        this.termCodeEffTrns = termCodeEffTrns;
    }

    public Shbtatc withTermCodeEffTrns(String termCodeEffTrns) {
        this.termCodeEffTrns = termCodeEffTrns;
        return this;
    }

    /**
     * Lineage reference object : SHBTATC_PROTECT_IND
     * 
     */
    @JsonProperty("protectInd")
    public String getProtectInd() {
        return protectInd;
    }

    /**
     * Lineage reference object : SHBTATC_PROTECT_IND
     * 
     */
    @JsonProperty("protectInd")
    public void setProtectInd(String protectInd) {
        this.protectInd = protectInd;
    }

    public Shbtatc withProtectInd(String protectInd) {
        this.protectInd = protectInd;
        return this;
    }

    /**
     * Credits High
     * <p>
     * Lineage reference object : SHBTATC_TRNS_HIGH_HRS
     * 
     */
    @JsonProperty("trnsHighHrs")
    public Double getTrnsHighHrs() {
        return trnsHighHrs;
    }

    /**
     * Credits High
     * <p>
     * Lineage reference object : SHBTATC_TRNS_HIGH_HRS
     * 
     */
    @JsonProperty("trnsHighHrs")
    public void setTrnsHighHrs(Double trnsHighHrs) {
        this.trnsHighHrs = trnsHighHrs;
    }

    public Shbtatc withTrnsHighHrs(Double trnsHighHrs) {
        this.trnsHighHrs = trnsHighHrs;
        return this;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHBTATC_CRSE_NUMB_TRNS
     * 
     */
    @JsonProperty("crseNumbTrns")
    public String getCrseNumbTrns() {
        return crseNumbTrns;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SHBTATC_CRSE_NUMB_TRNS
     * 
     */
    @JsonProperty("crseNumbTrns")
    public void setCrseNumbTrns(String crseNumbTrns) {
        this.crseNumbTrns = crseNumbTrns;
    }

    public Shbtatc withCrseNumbTrns(String crseNumbTrns) {
        this.crseNumbTrns = crseNumbTrns;
        return this;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SHBTATC_TRNS_CATALOG
     * 
     */
    @JsonProperty("trnsCatalog")
    public String getTrnsCatalog() {
        return trnsCatalog;
    }

    /**
     * Catalog
     * <p>
     * Lineage reference object : SHBTATC_TRNS_CATALOG
     * 
     */
    @JsonProperty("trnsCatalog")
    public void setTrnsCatalog(String trnsCatalog) {
        this.trnsCatalog = trnsCatalog;
    }

    public Shbtatc withTrnsCatalog(String trnsCatalog) {
        this.trnsCatalog = trnsCatalog;
        return this;
    }

    /**
     * Credits Low
     * <p>
     * Lineage reference object : SHBTATC_TRNS_LOW_HRS
     * 
     */
    @JsonProperty("trnsLowHrs")
    public Double getTrnsLowHrs() {
        return trnsLowHrs;
    }

    /**
     * Credits Low
     * <p>
     * Lineage reference object : SHBTATC_TRNS_LOW_HRS
     * 
     */
    @JsonProperty("trnsLowHrs")
    public void setTrnsLowHrs(Double trnsLowHrs) {
        this.trnsLowHrs = trnsLowHrs;
    }

    public Shbtatc withTrnsLowHrs(Double trnsLowHrs) {
        this.trnsLowHrs = trnsLowHrs;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHBTATC_TLVL_CODE, Lookup lineage reference object : stvtlvl,sorbtal,sorbtal
     * 
     */
    @JsonProperty("tlvlCode")
    public String getTlvlCode() {
        return tlvlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SHBTATC_TLVL_CODE, Lookup lineage reference object : stvtlvl,sorbtal,sorbtal
     * 
     */
    @JsonProperty("tlvlCode")
    public void setTlvlCode(String tlvlCode) {
        this.tlvlCode = tlvlCode;
    }

    public Shbtatc withTlvlCode(String tlvlCode) {
        this.tlvlCode = tlvlCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SHBTATC_TRNS_TITLE
     * 
     */
    @JsonProperty("trnsTitle")
    public String getTrnsTitle() {
        return trnsTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : SHBTATC_TRNS_TITLE
     * 
     */
    @JsonProperty("trnsTitle")
    public void setTrnsTitle(String trnsTitle) {
        this.trnsTitle = trnsTitle;
    }

    public Shbtatc withTrnsTitle(String trnsTitle) {
        this.trnsTitle = trnsTitle;
        return this;
    }

    /**
     * Lineage reference object : SHBTATC_GROUP_PRIMARY_IND
     * 
     */
    @JsonProperty("groupPrimaryInd")
    public String getGroupPrimaryInd() {
        return groupPrimaryInd;
    }

    /**
     * Lineage reference object : SHBTATC_GROUP_PRIMARY_IND
     * 
     */
    @JsonProperty("groupPrimaryInd")
    public void setGroupPrimaryInd(String groupPrimaryInd) {
        this.groupPrimaryInd = groupPrimaryInd;
    }

    public Shbtatc withGroupPrimaryInd(String groupPrimaryInd) {
        this.groupPrimaryInd = groupPrimaryInd;
        return this;
    }

    /**
     * Course Description
     * <p>
     * Lineage reference object : SHBTATC_CRSE_DESC
     * 
     */
    @JsonProperty("crseDesc")
    public String getCrseDesc() {
        return crseDesc;
    }

    /**
     * Course Description
     * <p>
     * Lineage reference object : SHBTATC_CRSE_DESC
     * 
     */
    @JsonProperty("crseDesc")
    public void setCrseDesc(String crseDesc) {
        this.crseDesc = crseDesc;
    }

    public Shbtatc withCrseDesc(String crseDesc) {
        this.crseDesc = crseDesc;
        return this;
    }

    /**
     * Lineage reference object : SHBTATC_TRNS_REVIEW_IND
     * 
     */
    @JsonProperty("trnsReviewInd")
    public String getTrnsReviewInd() {
        return trnsReviewInd;
    }

    /**
     * Lineage reference object : SHBTATC_TRNS_REVIEW_IND
     * 
     */
    @JsonProperty("trnsReviewInd")
    public void setTrnsReviewInd(String trnsReviewInd) {
        this.trnsReviewInd = trnsReviewInd;
    }

    public Shbtatc withTrnsReviewInd(String trnsReviewInd) {
        this.trnsReviewInd = trnsReviewInd;
        return this;
    }

    /**
     * Minimum Grade
     * <p>
     * Lineage reference object : SHBTATC_TGRD_CODE_MIN, Lookup lineage reference object : shrtgrd,shrtgrd,shrtgrd
     * 
     */
    @JsonProperty("tgrdCodeMin")
    public String getTgrdCodeMin() {
        return tgrdCodeMin;
    }

    /**
     * Minimum Grade
     * <p>
     * Lineage reference object : SHBTATC_TGRD_CODE_MIN, Lookup lineage reference object : shrtgrd,shrtgrd,shrtgrd
     * 
     */
    @JsonProperty("tgrdCodeMin")
    public void setTgrdCodeMin(String tgrdCodeMin) {
        this.tgrdCodeMin = tgrdCodeMin;
    }

    public Shbtatc withTgrdCodeMin(String tgrdCodeMin) {
        this.tgrdCodeMin = tgrdCodeMin;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHBTATC_SUBJ_CODE_TRNS
     * 
     */
    @JsonProperty("subjCodeTrns")
    public String getSubjCodeTrns() {
        return subjCodeTrns;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SHBTATC_SUBJ_CODE_TRNS
     * 
     */
    @JsonProperty("subjCodeTrns")
    public void setSubjCodeTrns(String subjCodeTrns) {
        this.subjCodeTrns = subjCodeTrns;
    }

    public Shbtatc withSubjCodeTrns(String subjCodeTrns) {
        this.subjCodeTrns = subjCodeTrns;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SHBTATC_GROUP
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SHBTATC_GROUP
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public Shbtatc withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHBTATC_TAST_CODE, Lookup lineage reference object : stvtast
     * 
     */
    @JsonProperty("tastCode")
    public String getTastCode() {
        return tastCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SHBTATC_TAST_CODE, Lookup lineage reference object : stvtast
     * 
     */
    @JsonProperty("tastCode")
    public void setTastCode(String tastCode) {
        this.tastCode = tastCode;
    }

    public Shbtatc withTastCode(String tastCode) {
        this.tastCode = tastCode;
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

    public Shbtatc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shbtatc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCodeEffTrns");
        sb.append('=');
        sb.append(((this.termCodeEffTrns == null)?"<null>":this.termCodeEffTrns));
        sb.append(',');
        sb.append("protectInd");
        sb.append('=');
        sb.append(((this.protectInd == null)?"<null>":this.protectInd));
        sb.append(',');
        sb.append("trnsHighHrs");
        sb.append('=');
        sb.append(((this.trnsHighHrs == null)?"<null>":this.trnsHighHrs));
        sb.append(',');
        sb.append("crseNumbTrns");
        sb.append('=');
        sb.append(((this.crseNumbTrns == null)?"<null>":this.crseNumbTrns));
        sb.append(',');
        sb.append("trnsCatalog");
        sb.append('=');
        sb.append(((this.trnsCatalog == null)?"<null>":this.trnsCatalog));
        sb.append(',');
        sb.append("trnsLowHrs");
        sb.append('=');
        sb.append(((this.trnsLowHrs == null)?"<null>":this.trnsLowHrs));
        sb.append(',');
        sb.append("tlvlCode");
        sb.append('=');
        sb.append(((this.tlvlCode == null)?"<null>":this.tlvlCode));
        sb.append(',');
        sb.append("trnsTitle");
        sb.append('=');
        sb.append(((this.trnsTitle == null)?"<null>":this.trnsTitle));
        sb.append(',');
        sb.append("groupPrimaryInd");
        sb.append('=');
        sb.append(((this.groupPrimaryInd == null)?"<null>":this.groupPrimaryInd));
        sb.append(',');
        sb.append("crseDesc");
        sb.append('=');
        sb.append(((this.crseDesc == null)?"<null>":this.crseDesc));
        sb.append(',');
        sb.append("trnsReviewInd");
        sb.append('=');
        sb.append(((this.trnsReviewInd == null)?"<null>":this.trnsReviewInd));
        sb.append(',');
        sb.append("tgrdCodeMin");
        sb.append('=');
        sb.append(((this.tgrdCodeMin == null)?"<null>":this.tgrdCodeMin));
        sb.append(',');
        sb.append("subjCodeTrns");
        sb.append('=');
        sb.append(((this.subjCodeTrns == null)?"<null>":this.subjCodeTrns));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("tastCode");
        sb.append('=');
        sb.append(((this.tastCode == null)?"<null>":this.tastCode));
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
        result = ((result* 31)+((this.termCodeEffTrns == null)? 0 :this.termCodeEffTrns.hashCode()));
        result = ((result* 31)+((this.protectInd == null)? 0 :this.protectInd.hashCode()));
        result = ((result* 31)+((this.trnsHighHrs == null)? 0 :this.trnsHighHrs.hashCode()));
        result = ((result* 31)+((this.crseNumbTrns == null)? 0 :this.crseNumbTrns.hashCode()));
        result = ((result* 31)+((this.trnsCatalog == null)? 0 :this.trnsCatalog.hashCode()));
        result = ((result* 31)+((this.trnsLowHrs == null)? 0 :this.trnsLowHrs.hashCode()));
        result = ((result* 31)+((this.tlvlCode == null)? 0 :this.tlvlCode.hashCode()));
        result = ((result* 31)+((this.trnsTitle == null)? 0 :this.trnsTitle.hashCode()));
        result = ((result* 31)+((this.groupPrimaryInd == null)? 0 :this.groupPrimaryInd.hashCode()));
        result = ((result* 31)+((this.crseDesc == null)? 0 :this.crseDesc.hashCode()));
        result = ((result* 31)+((this.trnsReviewInd == null)? 0 :this.trnsReviewInd.hashCode()));
        result = ((result* 31)+((this.tgrdCodeMin == null)? 0 :this.tgrdCodeMin.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subjCodeTrns == null)? 0 :this.subjCodeTrns.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        result = ((result* 31)+((this.tastCode == null)? 0 :this.tastCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shbtatc) == false) {
            return false;
        }
        Shbtatc rhs = ((Shbtatc) other);
        return (((((((((((((((((this.termCodeEffTrns == rhs.termCodeEffTrns)||((this.termCodeEffTrns!= null)&&this.termCodeEffTrns.equals(rhs.termCodeEffTrns)))&&((this.protectInd == rhs.protectInd)||((this.protectInd!= null)&&this.protectInd.equals(rhs.protectInd))))&&((this.trnsHighHrs == rhs.trnsHighHrs)||((this.trnsHighHrs!= null)&&this.trnsHighHrs.equals(rhs.trnsHighHrs))))&&((this.crseNumbTrns == rhs.crseNumbTrns)||((this.crseNumbTrns!= null)&&this.crseNumbTrns.equals(rhs.crseNumbTrns))))&&((this.trnsCatalog == rhs.trnsCatalog)||((this.trnsCatalog!= null)&&this.trnsCatalog.equals(rhs.trnsCatalog))))&&((this.trnsLowHrs == rhs.trnsLowHrs)||((this.trnsLowHrs!= null)&&this.trnsLowHrs.equals(rhs.trnsLowHrs))))&&((this.tlvlCode == rhs.tlvlCode)||((this.tlvlCode!= null)&&this.tlvlCode.equals(rhs.tlvlCode))))&&((this.trnsTitle == rhs.trnsTitle)||((this.trnsTitle!= null)&&this.trnsTitle.equals(rhs.trnsTitle))))&&((this.groupPrimaryInd == rhs.groupPrimaryInd)||((this.groupPrimaryInd!= null)&&this.groupPrimaryInd.equals(rhs.groupPrimaryInd))))&&((this.crseDesc == rhs.crseDesc)||((this.crseDesc!= null)&&this.crseDesc.equals(rhs.crseDesc))))&&((this.trnsReviewInd == rhs.trnsReviewInd)||((this.trnsReviewInd!= null)&&this.trnsReviewInd.equals(rhs.trnsReviewInd))))&&((this.tgrdCodeMin == rhs.tgrdCodeMin)||((this.tgrdCodeMin!= null)&&this.tgrdCodeMin.equals(rhs.tgrdCodeMin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subjCodeTrns == rhs.subjCodeTrns)||((this.subjCodeTrns!= null)&&this.subjCodeTrns.equals(rhs.subjCodeTrns))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))))&&((this.tastCode == rhs.tastCode)||((this.tastCode!= null)&&this.tastCode.equals(rhs.tastCode))));
    }

}
