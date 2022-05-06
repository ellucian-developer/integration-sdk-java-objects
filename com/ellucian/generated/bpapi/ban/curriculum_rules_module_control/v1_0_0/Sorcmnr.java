
package com.ellucian.generated.bpapi.ban.curriculum_rules_module_control.v1_0_0;

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
    "majrCodeMinr",
    "recInd",
    "admInd",
    "activityDate",
    "cmnrRule",
    "dauInd",
    "dispWebInd",
    "hisInd",
    "ediQlfr",
    "minrDesc",
    "ediValue",
    "stuInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class Sorcmnr {

    /**
     * Minors
     * <p>
     * Lineage reference object : SORCMNR_MAJR_CODE_MINR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinr")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_MAJR_CODE_MINR, Lookup lineage reference object : stvmajr")
    private String majrCodeMinr;
    /**
     * Lineage reference object : SORCMNR_REC_IND
     * 
     */
    @JsonProperty("recInd")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_REC_IND")
    private String recInd;
    /**
     * Lineage reference object : SORCMNR_ADM_IND
     * 
     */
    @JsonProperty("admInd")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_ADM_IND")
    private String admInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORCMNR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Minor Rule
     * <p>
     * Lineage reference object : SORCMNR_CMNR_RULE
     * 
     */
    @JsonProperty("cmnrRule")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_CMNR_RULE")
    private Double cmnrRule;
    /**
     * Lineage reference object : SORCMNR_DAU_IND
     * 
     */
    @JsonProperty("dauInd")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_DAU_IND")
    private String dauInd;
    /**
     * Lineage reference object : SORCMNR_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_DISP_WEB_IND")
    private String dispWebInd;
    /**
     * Lineage reference object : SORCMNR_HIS_IND
     * 
     */
    @JsonProperty("hisInd")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_HIS_IND")
    private String hisInd;
    /**
     * EDI Level
     * <p>
     * Lineage reference object : SORCMNR_EDI_QLFR, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediQlfr")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_EDI_QLFR, Lookup lineage reference object : sorxref")
    private String ediQlfr;
    @JsonProperty("minrDesc")
    private String minrDesc;
    /**
     * EDI Identification
     * <p>
     * Lineage reference object : SORCMNR_EDI_VALUE, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediValue")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_EDI_VALUE, Lookup lineage reference object : sorxref")
    private String ediValue;
    /**
     * Lineage reference object : SORCMNR_STU_IND
     * 
     */
    @JsonProperty("stuInd")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_STU_IND")
    private String stuInd;
    /**
     * Self Service Description
     * <p>
     * Lineage reference object : SORCMNR_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SORCMNR_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Minors
     * <p>
     * Lineage reference object : SORCMNR_MAJR_CODE_MINR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinr")
    public String getMajrCodeMinr() {
        return majrCodeMinr;
    }

    /**
     * Minors
     * <p>
     * Lineage reference object : SORCMNR_MAJR_CODE_MINR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinr")
    public void setMajrCodeMinr(String majrCodeMinr) {
        this.majrCodeMinr = majrCodeMinr;
    }

    public Sorcmnr withMajrCodeMinr(String majrCodeMinr) {
        this.majrCodeMinr = majrCodeMinr;
        return this;
    }

    /**
     * Lineage reference object : SORCMNR_REC_IND
     * 
     */
    @JsonProperty("recInd")
    public String getRecInd() {
        return recInd;
    }

    /**
     * Lineage reference object : SORCMNR_REC_IND
     * 
     */
    @JsonProperty("recInd")
    public void setRecInd(String recInd) {
        this.recInd = recInd;
    }

    public Sorcmnr withRecInd(String recInd) {
        this.recInd = recInd;
        return this;
    }

    /**
     * Lineage reference object : SORCMNR_ADM_IND
     * 
     */
    @JsonProperty("admInd")
    public String getAdmInd() {
        return admInd;
    }

    /**
     * Lineage reference object : SORCMNR_ADM_IND
     * 
     */
    @JsonProperty("admInd")
    public void setAdmInd(String admInd) {
        this.admInd = admInd;
    }

    public Sorcmnr withAdmInd(String admInd) {
        this.admInd = admInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORCMNR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORCMNR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorcmnr withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Minor Rule
     * <p>
     * Lineage reference object : SORCMNR_CMNR_RULE
     * 
     */
    @JsonProperty("cmnrRule")
    public Double getCmnrRule() {
        return cmnrRule;
    }

    /**
     * Minor Rule
     * <p>
     * Lineage reference object : SORCMNR_CMNR_RULE
     * 
     */
    @JsonProperty("cmnrRule")
    public void setCmnrRule(Double cmnrRule) {
        this.cmnrRule = cmnrRule;
    }

    public Sorcmnr withCmnrRule(Double cmnrRule) {
        this.cmnrRule = cmnrRule;
        return this;
    }

    /**
     * Lineage reference object : SORCMNR_DAU_IND
     * 
     */
    @JsonProperty("dauInd")
    public String getDauInd() {
        return dauInd;
    }

    /**
     * Lineage reference object : SORCMNR_DAU_IND
     * 
     */
    @JsonProperty("dauInd")
    public void setDauInd(String dauInd) {
        this.dauInd = dauInd;
    }

    public Sorcmnr withDauInd(String dauInd) {
        this.dauInd = dauInd;
        return this;
    }

    /**
     * Lineage reference object : SORCMNR_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public String getDispWebInd() {
        return dispWebInd;
    }

    /**
     * Lineage reference object : SORCMNR_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public void setDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
    }

    public Sorcmnr withDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
        return this;
    }

    /**
     * Lineage reference object : SORCMNR_HIS_IND
     * 
     */
    @JsonProperty("hisInd")
    public String getHisInd() {
        return hisInd;
    }

    /**
     * Lineage reference object : SORCMNR_HIS_IND
     * 
     */
    @JsonProperty("hisInd")
    public void setHisInd(String hisInd) {
        this.hisInd = hisInd;
    }

    public Sorcmnr withHisInd(String hisInd) {
        this.hisInd = hisInd;
        return this;
    }

    /**
     * EDI Level
     * <p>
     * Lineage reference object : SORCMNR_EDI_QLFR, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediQlfr")
    public String getEdiQlfr() {
        return ediQlfr;
    }

    /**
     * EDI Level
     * <p>
     * Lineage reference object : SORCMNR_EDI_QLFR, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediQlfr")
    public void setEdiQlfr(String ediQlfr) {
        this.ediQlfr = ediQlfr;
    }

    public Sorcmnr withEdiQlfr(String ediQlfr) {
        this.ediQlfr = ediQlfr;
        return this;
    }

    @JsonProperty("minrDesc")
    public String getMinrDesc() {
        return minrDesc;
    }

    @JsonProperty("minrDesc")
    public void setMinrDesc(String minrDesc) {
        this.minrDesc = minrDesc;
    }

    public Sorcmnr withMinrDesc(String minrDesc) {
        this.minrDesc = minrDesc;
        return this;
    }

    /**
     * EDI Identification
     * <p>
     * Lineage reference object : SORCMNR_EDI_VALUE, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediValue")
    public String getEdiValue() {
        return ediValue;
    }

    /**
     * EDI Identification
     * <p>
     * Lineage reference object : SORCMNR_EDI_VALUE, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediValue")
    public void setEdiValue(String ediValue) {
        this.ediValue = ediValue;
    }

    public Sorcmnr withEdiValue(String ediValue) {
        this.ediValue = ediValue;
        return this;
    }

    /**
     * Lineage reference object : SORCMNR_STU_IND
     * 
     */
    @JsonProperty("stuInd")
    public String getStuInd() {
        return stuInd;
    }

    /**
     * Lineage reference object : SORCMNR_STU_IND
     * 
     */
    @JsonProperty("stuInd")
    public void setStuInd(String stuInd) {
        this.stuInd = stuInd;
    }

    public Sorcmnr withStuInd(String stuInd) {
        this.stuInd = stuInd;
        return this;
    }

    /**
     * Self Service Description
     * <p>
     * Lineage reference object : SORCMNR_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Self Service Description
     * <p>
     * Lineage reference object : SORCMNR_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Sorcmnr withDesc(String desc) {
        this.desc = desc;
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

    public Sorcmnr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorcmnr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("majrCodeMinr");
        sb.append('=');
        sb.append(((this.majrCodeMinr == null)?"<null>":this.majrCodeMinr));
        sb.append(',');
        sb.append("recInd");
        sb.append('=');
        sb.append(((this.recInd == null)?"<null>":this.recInd));
        sb.append(',');
        sb.append("admInd");
        sb.append('=');
        sb.append(((this.admInd == null)?"<null>":this.admInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("cmnrRule");
        sb.append('=');
        sb.append(((this.cmnrRule == null)?"<null>":this.cmnrRule));
        sb.append(',');
        sb.append("dauInd");
        sb.append('=');
        sb.append(((this.dauInd == null)?"<null>":this.dauInd));
        sb.append(',');
        sb.append("dispWebInd");
        sb.append('=');
        sb.append(((this.dispWebInd == null)?"<null>":this.dispWebInd));
        sb.append(',');
        sb.append("hisInd");
        sb.append('=');
        sb.append(((this.hisInd == null)?"<null>":this.hisInd));
        sb.append(',');
        sb.append("ediQlfr");
        sb.append('=');
        sb.append(((this.ediQlfr == null)?"<null>":this.ediQlfr));
        sb.append(',');
        sb.append("minrDesc");
        sb.append('=');
        sb.append(((this.minrDesc == null)?"<null>":this.minrDesc));
        sb.append(',');
        sb.append("ediValue");
        sb.append('=');
        sb.append(((this.ediValue == null)?"<null>":this.ediValue));
        sb.append(',');
        sb.append("stuInd");
        sb.append('=');
        sb.append(((this.stuInd == null)?"<null>":this.stuInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.majrCodeMinr == null)? 0 :this.majrCodeMinr.hashCode()));
        result = ((result* 31)+((this.recInd == null)? 0 :this.recInd.hashCode()));
        result = ((result* 31)+((this.admInd == null)? 0 :this.admInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.cmnrRule == null)? 0 :this.cmnrRule.hashCode()));
        result = ((result* 31)+((this.dauInd == null)? 0 :this.dauInd.hashCode()));
        result = ((result* 31)+((this.dispWebInd == null)? 0 :this.dispWebInd.hashCode()));
        result = ((result* 31)+((this.hisInd == null)? 0 :this.hisInd.hashCode()));
        result = ((result* 31)+((this.ediQlfr == null)? 0 :this.ediQlfr.hashCode()));
        result = ((result* 31)+((this.minrDesc == null)? 0 :this.minrDesc.hashCode()));
        result = ((result* 31)+((this.ediValue == null)? 0 :this.ediValue.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stuInd == null)? 0 :this.stuInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorcmnr) == false) {
            return false;
        }
        Sorcmnr rhs = ((Sorcmnr) other);
        return (((((((((((((((this.majrCodeMinr == rhs.majrCodeMinr)||((this.majrCodeMinr!= null)&&this.majrCodeMinr.equals(rhs.majrCodeMinr)))&&((this.recInd == rhs.recInd)||((this.recInd!= null)&&this.recInd.equals(rhs.recInd))))&&((this.admInd == rhs.admInd)||((this.admInd!= null)&&this.admInd.equals(rhs.admInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.cmnrRule == rhs.cmnrRule)||((this.cmnrRule!= null)&&this.cmnrRule.equals(rhs.cmnrRule))))&&((this.dauInd == rhs.dauInd)||((this.dauInd!= null)&&this.dauInd.equals(rhs.dauInd))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.hisInd == rhs.hisInd)||((this.hisInd!= null)&&this.hisInd.equals(rhs.hisInd))))&&((this.ediQlfr == rhs.ediQlfr)||((this.ediQlfr!= null)&&this.ediQlfr.equals(rhs.ediQlfr))))&&((this.minrDesc == rhs.minrDesc)||((this.minrDesc!= null)&&this.minrDesc.equals(rhs.minrDesc))))&&((this.ediValue == rhs.ediValue)||((this.ediValue!= null)&&this.ediValue.equals(rhs.ediValue))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stuInd == rhs.stuInd)||((this.stuInd!= null)&&this.stuInd.equals(rhs.stuInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
