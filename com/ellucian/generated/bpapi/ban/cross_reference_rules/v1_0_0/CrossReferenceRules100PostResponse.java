
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
    "xlblCode",
    "pescXmlInd",
    "bannerValue",
    "dispWebInd",
    "ediQlfr",
    "ediStandardInd",
    "ediValue",
    "desc"
})
@Generated("jsonschema2pojo")
public class CrossReferenceRules100PostResponse {

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
     * Lineage reference object : SORXREF_EDI_STANDARD_IND
     * 
     */
    @JsonProperty("ediStandardInd")
    @JsonPropertyDescription("Lineage reference object : SORXREF_EDI_STANDARD_IND")
    private String ediStandardInd;
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

    public CrossReferenceRules100PostResponse withXlblCode(String xlblCode) {
        this.xlblCode = xlblCode;
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

    public CrossReferenceRules100PostResponse withPescXmlInd(String pescXmlInd) {
        this.pescXmlInd = pescXmlInd;
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

    public CrossReferenceRules100PostResponse withBannerValue(String bannerValue) {
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

    public CrossReferenceRules100PostResponse withDispWebInd(String dispWebInd) {
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

    public CrossReferenceRules100PostResponse withEdiQlfr(String ediQlfr) {
        this.ediQlfr = ediQlfr;
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

    public CrossReferenceRules100PostResponse withEdiStandardInd(String ediStandardInd) {
        this.ediStandardInd = ediStandardInd;
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

    public CrossReferenceRules100PostResponse withEdiValue(String ediValue) {
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

    public CrossReferenceRules100PostResponse withDesc(String desc) {
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

    public CrossReferenceRules100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CrossReferenceRules100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xlblCode");
        sb.append('=');
        sb.append(((this.xlblCode == null)?"<null>":this.xlblCode));
        sb.append(',');
        sb.append("pescXmlInd");
        sb.append('=');
        sb.append(((this.pescXmlInd == null)?"<null>":this.pescXmlInd));
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
        sb.append("ediStandardInd");
        sb.append('=');
        sb.append(((this.ediStandardInd == null)?"<null>":this.ediStandardInd));
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
        result = ((result* 31)+((this.xlblCode == null)? 0 :this.xlblCode.hashCode()));
        result = ((result* 31)+((this.pescXmlInd == null)? 0 :this.pescXmlInd.hashCode()));
        result = ((result* 31)+((this.bannerValue == null)? 0 :this.bannerValue.hashCode()));
        result = ((result* 31)+((this.dispWebInd == null)? 0 :this.dispWebInd.hashCode()));
        result = ((result* 31)+((this.ediQlfr == null)? 0 :this.ediQlfr.hashCode()));
        result = ((result* 31)+((this.ediStandardInd == null)? 0 :this.ediStandardInd.hashCode()));
        result = ((result* 31)+((this.ediValue == null)? 0 :this.ediValue.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CrossReferenceRules100PostResponse) == false) {
            return false;
        }
        CrossReferenceRules100PostResponse rhs = ((CrossReferenceRules100PostResponse) other);
        return ((((((((((this.xlblCode == rhs.xlblCode)||((this.xlblCode!= null)&&this.xlblCode.equals(rhs.xlblCode)))&&((this.pescXmlInd == rhs.pescXmlInd)||((this.pescXmlInd!= null)&&this.pescXmlInd.equals(rhs.pescXmlInd))))&&((this.bannerValue == rhs.bannerValue)||((this.bannerValue!= null)&&this.bannerValue.equals(rhs.bannerValue))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.ediQlfr == rhs.ediQlfr)||((this.ediQlfr!= null)&&this.ediQlfr.equals(rhs.ediQlfr))))&&((this.ediStandardInd == rhs.ediStandardInd)||((this.ediStandardInd!= null)&&this.ediStandardInd.equals(rhs.ediStandardInd))))&&((this.ediValue == rhs.ediValue)||((this.ediValue!= null)&&this.ediValue.equals(rhs.ediValue))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
