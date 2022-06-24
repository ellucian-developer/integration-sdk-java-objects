
package com.ellucian.generated.bpapi.ban.cross_reference_rules.v1_0_0;

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
    "criteria.xlblCode",
    "pescXmlInd",
    "criteria.bannerValue",
    "criteria.ediStandardInd",
    "ediStandardInd",
    "keyblckXlblCode",
    "criteria.ediQlfr",
    "criteria.ediValue",
    "criteria.desc",
    "xlblCode",
    "criteria.dispWebInd",
    "bannerValue",
    "dispWebInd",
    "ediQlfr",
    "criteria.pescXmlInd",
    "ediValue",
    "desc"
})
@Generated("jsonschema2pojo")
public class CrossReferenceRules100PutRequest {

    /**
     * Electronic Label
     * <p>
     * Lineage reference object : SORXREF_XLBL_CODE, Lookup lineage reference object : stvxlbl
     * (Required)
     * 
     */
    @JsonProperty("criteria.xlblCode")
    @JsonPropertyDescription("Lineage reference object : SORXREF_XLBL_CODE, Lookup lineage reference object : stvxlbl")
    private String criteriaXlblCode;
    /**
     * Lineage reference object : SORXREF_PESC_XML_IND
     * 
     */
    @JsonProperty("pescXmlInd")
    @JsonPropertyDescription("Lineage reference object : SORXREF_PESC_XML_IND")
    private String pescXmlInd;
    /**
     * Banner Value
     * <p>
     * Lineage reference object : SORXREF_BANNER_VALUE
     * 
     */
    @JsonProperty("criteria.bannerValue")
    @JsonPropertyDescription("Lineage reference object : SORXREF_BANNER_VALUE")
    private String criteriaBannerValue;
    /**
     * Lineage reference object : SORXREF_EDI_STANDARD_IND
     * 
     */
    @JsonProperty("criteria.ediStandardInd")
    @JsonPropertyDescription("Lineage reference object : SORXREF_EDI_STANDARD_IND")
    private String criteriaEdiStandardInd;
    /**
     * Lineage reference object : SORXREF_EDI_STANDARD_IND
     * 
     */
    @JsonProperty("ediStandardInd")
    @JsonPropertyDescription("Lineage reference object : SORXREF_EDI_STANDARD_IND")
    private String ediStandardInd;
    /**
     * Cross-Reference Label
     * <p>
     * Lineage reference object : keyblckXlblCode, Lookup lineage reference object : stvxlbl
     * 
     */
    @JsonProperty("keyblckXlblCode")
    @JsonPropertyDescription("Lineage reference object : keyblckXlblCode, Lookup lineage reference object : stvxlbl")
    private String keyblckXlblCode;
    /**
     * Electronic Qualifier
     * <p>
     * Lineage reference object : SORXREF_EDI_QLFR
     * 
     */
    @JsonProperty("criteria.ediQlfr")
    @JsonPropertyDescription("Lineage reference object : SORXREF_EDI_QLFR")
    private String criteriaEdiQlfr;
    /**
     * Electronic Value
     * <p>
     * Lineage reference object : SORXREF_EDI_VALUE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ediValue")
    @JsonPropertyDescription("Lineage reference object : SORXREF_EDI_VALUE")
    private String criteriaEdiValue;
    /**
     * Description
     * <p>
     * Lineage reference object : SORXREF_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : SORXREF_DESC")
    private String criteriaDesc;
    /**
     * Electronic Label
     * <p>
     * Lineage reference object : SORXREF_XLBL_CODE, Lookup lineage reference object : stvxlbl
     * (Required)
     * 
     */
    @JsonProperty("xlblCode")
    @JsonPropertyDescription("Lineage reference object : SORXREF_XLBL_CODE, Lookup lineage reference object : stvxlbl")
    private String xlblCode;
    /**
     * Lineage reference object : SORXREF_DISP_WEB_IND
     * 
     */
    @JsonProperty("criteria.dispWebInd")
    @JsonPropertyDescription("Lineage reference object : SORXREF_DISP_WEB_IND")
    private String criteriaDispWebInd;
    /**
     * Banner Value
     * <p>
     * Lineage reference object : SORXREF_BANNER_VALUE
     * 
     */
    @JsonProperty("bannerValue")
    @JsonPropertyDescription("Lineage reference object : SORXREF_BANNER_VALUE")
    private String bannerValue;
    /**
     * Lineage reference object : SORXREF_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    @JsonPropertyDescription("Lineage reference object : SORXREF_DISP_WEB_IND")
    private String dispWebInd;
    /**
     * Electronic Qualifier
     * <p>
     * Lineage reference object : SORXREF_EDI_QLFR
     * 
     */
    @JsonProperty("ediQlfr")
    @JsonPropertyDescription("Lineage reference object : SORXREF_EDI_QLFR")
    private String ediQlfr;
    /**
     * Lineage reference object : SORXREF_PESC_XML_IND
     * 
     */
    @JsonProperty("criteria.pescXmlInd")
    @JsonPropertyDescription("Lineage reference object : SORXREF_PESC_XML_IND")
    private String criteriaPescXmlInd;
    /**
     * Electronic Value
     * <p>
     * Lineage reference object : SORXREF_EDI_VALUE
     * (Required)
     * 
     */
    @JsonProperty("ediValue")
    @JsonPropertyDescription("Lineage reference object : SORXREF_EDI_VALUE")
    private String ediValue;
    /**
     * Description
     * <p>
     * Lineage reference object : SORXREF_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SORXREF_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Electronic Label
     * <p>
     * Lineage reference object : SORXREF_XLBL_CODE, Lookup lineage reference object : stvxlbl
     * (Required)
     * 
     */
    @JsonProperty("criteria.xlblCode")
    public String getCriteriaXlblCode() {
        return criteriaXlblCode;
    }

    /**
     * Electronic Label
     * <p>
     * Lineage reference object : SORXREF_XLBL_CODE, Lookup lineage reference object : stvxlbl
     * (Required)
     * 
     */
    @JsonProperty("criteria.xlblCode")
    public void setCriteriaXlblCode(String criteriaXlblCode) {
        this.criteriaXlblCode = criteriaXlblCode;
    }

    public CrossReferenceRules100PutRequest withCriteriaXlblCode(String criteriaXlblCode) {
        this.criteriaXlblCode = criteriaXlblCode;
        return this;
    }

    /**
     * Lineage reference object : SORXREF_PESC_XML_IND
     * 
     */
    @JsonProperty("pescXmlInd")
    public String getPescXmlInd() {
        return pescXmlInd;
    }

    /**
     * Lineage reference object : SORXREF_PESC_XML_IND
     * 
     */
    @JsonProperty("pescXmlInd")
    public void setPescXmlInd(String pescXmlInd) {
        this.pescXmlInd = pescXmlInd;
    }

    public CrossReferenceRules100PutRequest withPescXmlInd(String pescXmlInd) {
        this.pescXmlInd = pescXmlInd;
        return this;
    }

    /**
     * Banner Value
     * <p>
     * Lineage reference object : SORXREF_BANNER_VALUE
     * 
     */
    @JsonProperty("criteria.bannerValue")
    public String getCriteriaBannerValue() {
        return criteriaBannerValue;
    }

    /**
     * Banner Value
     * <p>
     * Lineage reference object : SORXREF_BANNER_VALUE
     * 
     */
    @JsonProperty("criteria.bannerValue")
    public void setCriteriaBannerValue(String criteriaBannerValue) {
        this.criteriaBannerValue = criteriaBannerValue;
    }

    public CrossReferenceRules100PutRequest withCriteriaBannerValue(String criteriaBannerValue) {
        this.criteriaBannerValue = criteriaBannerValue;
        return this;
    }

    /**
     * Lineage reference object : SORXREF_EDI_STANDARD_IND
     * 
     */
    @JsonProperty("criteria.ediStandardInd")
    public String getCriteriaEdiStandardInd() {
        return criteriaEdiStandardInd;
    }

    /**
     * Lineage reference object : SORXREF_EDI_STANDARD_IND
     * 
     */
    @JsonProperty("criteria.ediStandardInd")
    public void setCriteriaEdiStandardInd(String criteriaEdiStandardInd) {
        this.criteriaEdiStandardInd = criteriaEdiStandardInd;
    }

    public CrossReferenceRules100PutRequest withCriteriaEdiStandardInd(String criteriaEdiStandardInd) {
        this.criteriaEdiStandardInd = criteriaEdiStandardInd;
        return this;
    }

    /**
     * Lineage reference object : SORXREF_EDI_STANDARD_IND
     * 
     */
    @JsonProperty("ediStandardInd")
    public String getEdiStandardInd() {
        return ediStandardInd;
    }

    /**
     * Lineage reference object : SORXREF_EDI_STANDARD_IND
     * 
     */
    @JsonProperty("ediStandardInd")
    public void setEdiStandardInd(String ediStandardInd) {
        this.ediStandardInd = ediStandardInd;
    }

    public CrossReferenceRules100PutRequest withEdiStandardInd(String ediStandardInd) {
        this.ediStandardInd = ediStandardInd;
        return this;
    }

    /**
     * Cross-Reference Label
     * <p>
     * Lineage reference object : keyblckXlblCode, Lookup lineage reference object : stvxlbl
     * 
     */
    @JsonProperty("keyblckXlblCode")
    public String getKeyblckXlblCode() {
        return keyblckXlblCode;
    }

    /**
     * Cross-Reference Label
     * <p>
     * Lineage reference object : keyblckXlblCode, Lookup lineage reference object : stvxlbl
     * 
     */
    @JsonProperty("keyblckXlblCode")
    public void setKeyblckXlblCode(String keyblckXlblCode) {
        this.keyblckXlblCode = keyblckXlblCode;
    }

    public CrossReferenceRules100PutRequest withKeyblckXlblCode(String keyblckXlblCode) {
        this.keyblckXlblCode = keyblckXlblCode;
        return this;
    }

    /**
     * Electronic Qualifier
     * <p>
     * Lineage reference object : SORXREF_EDI_QLFR
     * 
     */
    @JsonProperty("criteria.ediQlfr")
    public String getCriteriaEdiQlfr() {
        return criteriaEdiQlfr;
    }

    /**
     * Electronic Qualifier
     * <p>
     * Lineage reference object : SORXREF_EDI_QLFR
     * 
     */
    @JsonProperty("criteria.ediQlfr")
    public void setCriteriaEdiQlfr(String criteriaEdiQlfr) {
        this.criteriaEdiQlfr = criteriaEdiQlfr;
    }

    public CrossReferenceRules100PutRequest withCriteriaEdiQlfr(String criteriaEdiQlfr) {
        this.criteriaEdiQlfr = criteriaEdiQlfr;
        return this;
    }

    /**
     * Electronic Value
     * <p>
     * Lineage reference object : SORXREF_EDI_VALUE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ediValue")
    public String getCriteriaEdiValue() {
        return criteriaEdiValue;
    }

    /**
     * Electronic Value
     * <p>
     * Lineage reference object : SORXREF_EDI_VALUE
     * (Required)
     * 
     */
    @JsonProperty("criteria.ediValue")
    public void setCriteriaEdiValue(String criteriaEdiValue) {
        this.criteriaEdiValue = criteriaEdiValue;
    }

    public CrossReferenceRules100PutRequest withCriteriaEdiValue(String criteriaEdiValue) {
        this.criteriaEdiValue = criteriaEdiValue;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SORXREF_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SORXREF_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public CrossReferenceRules100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Electronic Label
     * <p>
     * Lineage reference object : SORXREF_XLBL_CODE, Lookup lineage reference object : stvxlbl
     * (Required)
     * 
     */
    @JsonProperty("xlblCode")
    public String getXlblCode() {
        return xlblCode;
    }

    /**
     * Electronic Label
     * <p>
     * Lineage reference object : SORXREF_XLBL_CODE, Lookup lineage reference object : stvxlbl
     * (Required)
     * 
     */
    @JsonProperty("xlblCode")
    public void setXlblCode(String xlblCode) {
        this.xlblCode = xlblCode;
    }

    public CrossReferenceRules100PutRequest withXlblCode(String xlblCode) {
        this.xlblCode = xlblCode;
        return this;
    }

    /**
     * Lineage reference object : SORXREF_DISP_WEB_IND
     * 
     */
    @JsonProperty("criteria.dispWebInd")
    public String getCriteriaDispWebInd() {
        return criteriaDispWebInd;
    }

    /**
     * Lineage reference object : SORXREF_DISP_WEB_IND
     * 
     */
    @JsonProperty("criteria.dispWebInd")
    public void setCriteriaDispWebInd(String criteriaDispWebInd) {
        this.criteriaDispWebInd = criteriaDispWebInd;
    }

    public CrossReferenceRules100PutRequest withCriteriaDispWebInd(String criteriaDispWebInd) {
        this.criteriaDispWebInd = criteriaDispWebInd;
        return this;
    }

    /**
     * Banner Value
     * <p>
     * Lineage reference object : SORXREF_BANNER_VALUE
     * 
     */
    @JsonProperty("bannerValue")
    public String getBannerValue() {
        return bannerValue;
    }

    /**
     * Banner Value
     * <p>
     * Lineage reference object : SORXREF_BANNER_VALUE
     * 
     */
    @JsonProperty("bannerValue")
    public void setBannerValue(String bannerValue) {
        this.bannerValue = bannerValue;
    }

    public CrossReferenceRules100PutRequest withBannerValue(String bannerValue) {
        this.bannerValue = bannerValue;
        return this;
    }

    /**
     * Lineage reference object : SORXREF_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public String getDispWebInd() {
        return dispWebInd;
    }

    /**
     * Lineage reference object : SORXREF_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public void setDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
    }

    public CrossReferenceRules100PutRequest withDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
        return this;
    }

    /**
     * Electronic Qualifier
     * <p>
     * Lineage reference object : SORXREF_EDI_QLFR
     * 
     */
    @JsonProperty("ediQlfr")
    public String getEdiQlfr() {
        return ediQlfr;
    }

    /**
     * Electronic Qualifier
     * <p>
     * Lineage reference object : SORXREF_EDI_QLFR
     * 
     */
    @JsonProperty("ediQlfr")
    public void setEdiQlfr(String ediQlfr) {
        this.ediQlfr = ediQlfr;
    }

    public CrossReferenceRules100PutRequest withEdiQlfr(String ediQlfr) {
        this.ediQlfr = ediQlfr;
        return this;
    }

    /**
     * Lineage reference object : SORXREF_PESC_XML_IND
     * 
     */
    @JsonProperty("criteria.pescXmlInd")
    public String getCriteriaPescXmlInd() {
        return criteriaPescXmlInd;
    }

    /**
     * Lineage reference object : SORXREF_PESC_XML_IND
     * 
     */
    @JsonProperty("criteria.pescXmlInd")
    public void setCriteriaPescXmlInd(String criteriaPescXmlInd) {
        this.criteriaPescXmlInd = criteriaPescXmlInd;
    }

    public CrossReferenceRules100PutRequest withCriteriaPescXmlInd(String criteriaPescXmlInd) {
        this.criteriaPescXmlInd = criteriaPescXmlInd;
        return this;
    }

    /**
     * Electronic Value
     * <p>
     * Lineage reference object : SORXREF_EDI_VALUE
     * (Required)
     * 
     */
    @JsonProperty("ediValue")
    public String getEdiValue() {
        return ediValue;
    }

    /**
     * Electronic Value
     * <p>
     * Lineage reference object : SORXREF_EDI_VALUE
     * (Required)
     * 
     */
    @JsonProperty("ediValue")
    public void setEdiValue(String ediValue) {
        this.ediValue = ediValue;
    }

    public CrossReferenceRules100PutRequest withEdiValue(String ediValue) {
        this.ediValue = ediValue;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SORXREF_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SORXREF_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CrossReferenceRules100PutRequest withDesc(String desc) {
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

    public CrossReferenceRules100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CrossReferenceRules100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaXlblCode");
        sb.append('=');
        sb.append(((this.criteriaXlblCode == null)?"<null>":this.criteriaXlblCode));
        sb.append(',');
        sb.append("pescXmlInd");
        sb.append('=');
        sb.append(((this.pescXmlInd == null)?"<null>":this.pescXmlInd));
        sb.append(',');
        sb.append("criteriaBannerValue");
        sb.append('=');
        sb.append(((this.criteriaBannerValue == null)?"<null>":this.criteriaBannerValue));
        sb.append(',');
        sb.append("criteriaEdiStandardInd");
        sb.append('=');
        sb.append(((this.criteriaEdiStandardInd == null)?"<null>":this.criteriaEdiStandardInd));
        sb.append(',');
        sb.append("ediStandardInd");
        sb.append('=');
        sb.append(((this.ediStandardInd == null)?"<null>":this.ediStandardInd));
        sb.append(',');
        sb.append("keyblckXlblCode");
        sb.append('=');
        sb.append(((this.keyblckXlblCode == null)?"<null>":this.keyblckXlblCode));
        sb.append(',');
        sb.append("criteriaEdiQlfr");
        sb.append('=');
        sb.append(((this.criteriaEdiQlfr == null)?"<null>":this.criteriaEdiQlfr));
        sb.append(',');
        sb.append("criteriaEdiValue");
        sb.append('=');
        sb.append(((this.criteriaEdiValue == null)?"<null>":this.criteriaEdiValue));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("xlblCode");
        sb.append('=');
        sb.append(((this.xlblCode == null)?"<null>":this.xlblCode));
        sb.append(',');
        sb.append("criteriaDispWebInd");
        sb.append('=');
        sb.append(((this.criteriaDispWebInd == null)?"<null>":this.criteriaDispWebInd));
        sb.append(',');
        sb.append("bannerValue");
        sb.append('=');
        sb.append(((this.bannerValue == null)?"<null>":this.bannerValue));
        sb.append(',');
        sb.append("dispWebInd");
        sb.append('=');
        sb.append(((this.dispWebInd == null)?"<null>":this.dispWebInd));
        sb.append(',');
        sb.append("ediQlfr");
        sb.append('=');
        sb.append(((this.ediQlfr == null)?"<null>":this.ediQlfr));
        sb.append(',');
        sb.append("criteriaPescXmlInd");
        sb.append('=');
        sb.append(((this.criteriaPescXmlInd == null)?"<null>":this.criteriaPescXmlInd));
        sb.append(',');
        sb.append("ediValue");
        sb.append('=');
        sb.append(((this.ediValue == null)?"<null>":this.ediValue));
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
        result = ((result* 31)+((this.criteriaEdiValue == null)? 0 :this.criteriaEdiValue.hashCode()));
        result = ((result* 31)+((this.criteriaPescXmlInd == null)? 0 :this.criteriaPescXmlInd.hashCode()));
        result = ((result* 31)+((this.pescXmlInd == null)? 0 :this.pescXmlInd.hashCode()));
        result = ((result* 31)+((this.ediStandardInd == null)? 0 :this.ediStandardInd.hashCode()));
        result = ((result* 31)+((this.keyblckXlblCode == null)? 0 :this.keyblckXlblCode.hashCode()));
        result = ((result* 31)+((this.criteriaXlblCode == null)? 0 :this.criteriaXlblCode.hashCode()));
        result = ((result* 31)+((this.xlblCode == null)? 0 :this.xlblCode.hashCode()));
        result = ((result* 31)+((this.bannerValue == null)? 0 :this.bannerValue.hashCode()));
        result = ((result* 31)+((this.criteriaDispWebInd == null)? 0 :this.criteriaDispWebInd.hashCode()));
        result = ((result* 31)+((this.dispWebInd == null)? 0 :this.dispWebInd.hashCode()));
        result = ((result* 31)+((this.ediQlfr == null)? 0 :this.ediQlfr.hashCode()));
        result = ((result* 31)+((this.criteriaEdiStandardInd == null)? 0 :this.criteriaEdiStandardInd.hashCode()));
        result = ((result* 31)+((this.ediValue == null)? 0 :this.ediValue.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaBannerValue == null)? 0 :this.criteriaBannerValue.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.criteriaEdiQlfr == null)? 0 :this.criteriaEdiQlfr.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrossReferenceRules100PutRequest) == false) {
            return false;
        }
        CrossReferenceRules100PutRequest rhs = ((CrossReferenceRules100PutRequest) other);
        return (((((((((((((((((((this.criteriaEdiValue == rhs.criteriaEdiValue)||((this.criteriaEdiValue!= null)&&this.criteriaEdiValue.equals(rhs.criteriaEdiValue)))&&((this.criteriaPescXmlInd == rhs.criteriaPescXmlInd)||((this.criteriaPescXmlInd!= null)&&this.criteriaPescXmlInd.equals(rhs.criteriaPescXmlInd))))&&((this.pescXmlInd == rhs.pescXmlInd)||((this.pescXmlInd!= null)&&this.pescXmlInd.equals(rhs.pescXmlInd))))&&((this.ediStandardInd == rhs.ediStandardInd)||((this.ediStandardInd!= null)&&this.ediStandardInd.equals(rhs.ediStandardInd))))&&((this.keyblckXlblCode == rhs.keyblckXlblCode)||((this.keyblckXlblCode!= null)&&this.keyblckXlblCode.equals(rhs.keyblckXlblCode))))&&((this.criteriaXlblCode == rhs.criteriaXlblCode)||((this.criteriaXlblCode!= null)&&this.criteriaXlblCode.equals(rhs.criteriaXlblCode))))&&((this.xlblCode == rhs.xlblCode)||((this.xlblCode!= null)&&this.xlblCode.equals(rhs.xlblCode))))&&((this.bannerValue == rhs.bannerValue)||((this.bannerValue!= null)&&this.bannerValue.equals(rhs.bannerValue))))&&((this.criteriaDispWebInd == rhs.criteriaDispWebInd)||((this.criteriaDispWebInd!= null)&&this.criteriaDispWebInd.equals(rhs.criteriaDispWebInd))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.ediQlfr == rhs.ediQlfr)||((this.ediQlfr!= null)&&this.ediQlfr.equals(rhs.ediQlfr))))&&((this.criteriaEdiStandardInd == rhs.criteriaEdiStandardInd)||((this.criteriaEdiStandardInd!= null)&&this.criteriaEdiStandardInd.equals(rhs.criteriaEdiStandardInd))))&&((this.ediValue == rhs.ediValue)||((this.ediValue!= null)&&this.ediValue.equals(rhs.ediValue))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaBannerValue == rhs.criteriaBannerValue)||((this.criteriaBannerValue!= null)&&this.criteriaBannerValue.equals(rhs.criteriaBannerValue))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.criteriaEdiQlfr == rhs.criteriaEdiQlfr)||((this.criteriaEdiQlfr!= null)&&this.criteriaEdiQlfr.equals(rhs.criteriaEdiQlfr))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
