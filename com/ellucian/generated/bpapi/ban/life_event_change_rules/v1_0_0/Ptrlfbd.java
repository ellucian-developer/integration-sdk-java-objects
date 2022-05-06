
package com.ellucian.generated.bpapi.ban.life_event_change_rules.v1_0_0;

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
    "webCvgUpdInd",
    "webCvgSelInd",
    "webEmprInd",
    "bdcaCode",
    "webBalcUpdInd",
    "webCvgInsInd",
    "bdcaDesc",
    "enrlBeginDateMethod",
    "webBalcSelInd",
    "webBalcInsInd"
})
@Generated("jsonschema2pojo")
public class Ptrlfbd {

    /**
     * Lineage reference object : PTRLFBD_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFBD_WEB_CVG_UPD_IND")
    private String webCvgUpdInd;
    /**
     * Lineage reference object : PTRLFBD_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFBD_WEB_CVG_SEL_IND")
    private String webCvgSelInd;
    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRLFBD_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFBD_WEB_EMPR_IND")
    private String webEmprInd;
    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRLFBD_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRLFBD_BDCA_CODE")
    private String bdcaCode;
    /**
     * Lineage reference object : PTRLFBD_WEB_BALC_UPD_IND
     * 
     */
    @JsonProperty("webBalcUpdInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFBD_WEB_BALC_UPD_IND")
    private String webBalcUpdInd;
    /**
     * Lineage reference object : PTRLFBD_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFBD_WEB_CVG_INS_IND")
    private String webCvgInsInd;
    @JsonProperty("bdcaDesc")
    private String bdcaDesc;
    /**
     * Benefits Begin Date
     * <p>
     * Lineage reference object : PTRLFBD_ENRL_BEGIN_DATE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("enrlBeginDateMethod")
    @JsonPropertyDescription("Lineage reference object : PTRLFBD_ENRL_BEGIN_DATE_METHOD")
    private String enrlBeginDateMethod;
    /**
     * Lineage reference object : PTRLFBD_WEB_BALC_SEL_IND
     * 
     */
    @JsonProperty("webBalcSelInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFBD_WEB_BALC_SEL_IND")
    private String webBalcSelInd;
    /**
     * Lineage reference object : PTRLFBD_WEB_BALC_INS_IND
     * 
     */
    @JsonProperty("webBalcInsInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFBD_WEB_BALC_INS_IND")
    private String webBalcInsInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PTRLFBD_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    public String getWebCvgUpdInd() {
        return webCvgUpdInd;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    public void setWebCvgUpdInd(String webCvgUpdInd) {
        this.webCvgUpdInd = webCvgUpdInd;
    }

    public Ptrlfbd withWebCvgUpdInd(String webCvgUpdInd) {
        this.webCvgUpdInd = webCvgUpdInd;
        return this;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    public String getWebCvgSelInd() {
        return webCvgSelInd;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    public void setWebCvgSelInd(String webCvgSelInd) {
        this.webCvgSelInd = webCvgSelInd;
    }

    public Ptrlfbd withWebCvgSelInd(String webCvgSelInd) {
        this.webCvgSelInd = webCvgSelInd;
        return this;
    }

    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRLFBD_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    public String getWebEmprInd() {
        return webEmprInd;
    }

    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRLFBD_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    public void setWebEmprInd(String webEmprInd) {
        this.webEmprInd = webEmprInd;
    }

    public Ptrlfbd withWebEmprInd(String webEmprInd) {
        this.webEmprInd = webEmprInd;
        return this;
    }

    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRLFBD_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRLFBD_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public Ptrlfbd withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_BALC_UPD_IND
     * 
     */
    @JsonProperty("webBalcUpdInd")
    public String getWebBalcUpdInd() {
        return webBalcUpdInd;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_BALC_UPD_IND
     * 
     */
    @JsonProperty("webBalcUpdInd")
    public void setWebBalcUpdInd(String webBalcUpdInd) {
        this.webBalcUpdInd = webBalcUpdInd;
    }

    public Ptrlfbd withWebBalcUpdInd(String webBalcUpdInd) {
        this.webBalcUpdInd = webBalcUpdInd;
        return this;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    public String getWebCvgInsInd() {
        return webCvgInsInd;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    public void setWebCvgInsInd(String webCvgInsInd) {
        this.webCvgInsInd = webCvgInsInd;
    }

    public Ptrlfbd withWebCvgInsInd(String webCvgInsInd) {
        this.webCvgInsInd = webCvgInsInd;
        return this;
    }

    @JsonProperty("bdcaDesc")
    public String getBdcaDesc() {
        return bdcaDesc;
    }

    @JsonProperty("bdcaDesc")
    public void setBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
    }

    public Ptrlfbd withBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
        return this;
    }

    /**
     * Benefits Begin Date
     * <p>
     * Lineage reference object : PTRLFBD_ENRL_BEGIN_DATE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("enrlBeginDateMethod")
    public String getEnrlBeginDateMethod() {
        return enrlBeginDateMethod;
    }

    /**
     * Benefits Begin Date
     * <p>
     * Lineage reference object : PTRLFBD_ENRL_BEGIN_DATE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("enrlBeginDateMethod")
    public void setEnrlBeginDateMethod(String enrlBeginDateMethod) {
        this.enrlBeginDateMethod = enrlBeginDateMethod;
    }

    public Ptrlfbd withEnrlBeginDateMethod(String enrlBeginDateMethod) {
        this.enrlBeginDateMethod = enrlBeginDateMethod;
        return this;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_BALC_SEL_IND
     * 
     */
    @JsonProperty("webBalcSelInd")
    public String getWebBalcSelInd() {
        return webBalcSelInd;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_BALC_SEL_IND
     * 
     */
    @JsonProperty("webBalcSelInd")
    public void setWebBalcSelInd(String webBalcSelInd) {
        this.webBalcSelInd = webBalcSelInd;
    }

    public Ptrlfbd withWebBalcSelInd(String webBalcSelInd) {
        this.webBalcSelInd = webBalcSelInd;
        return this;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_BALC_INS_IND
     * 
     */
    @JsonProperty("webBalcInsInd")
    public String getWebBalcInsInd() {
        return webBalcInsInd;
    }

    /**
     * Lineage reference object : PTRLFBD_WEB_BALC_INS_IND
     * 
     */
    @JsonProperty("webBalcInsInd")
    public void setWebBalcInsInd(String webBalcInsInd) {
        this.webBalcInsInd = webBalcInsInd;
    }

    public Ptrlfbd withWebBalcInsInd(String webBalcInsInd) {
        this.webBalcInsInd = webBalcInsInd;
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

    public Ptrlfbd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrlfbd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("webCvgUpdInd");
        sb.append('=');
        sb.append(((this.webCvgUpdInd == null)?"<null>":this.webCvgUpdInd));
        sb.append(',');
        sb.append("webCvgSelInd");
        sb.append('=');
        sb.append(((this.webCvgSelInd == null)?"<null>":this.webCvgSelInd));
        sb.append(',');
        sb.append("webEmprInd");
        sb.append('=');
        sb.append(((this.webEmprInd == null)?"<null>":this.webEmprInd));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("webBalcUpdInd");
        sb.append('=');
        sb.append(((this.webBalcUpdInd == null)?"<null>":this.webBalcUpdInd));
        sb.append(',');
        sb.append("webCvgInsInd");
        sb.append('=');
        sb.append(((this.webCvgInsInd == null)?"<null>":this.webCvgInsInd));
        sb.append(',');
        sb.append("bdcaDesc");
        sb.append('=');
        sb.append(((this.bdcaDesc == null)?"<null>":this.bdcaDesc));
        sb.append(',');
        sb.append("enrlBeginDateMethod");
        sb.append('=');
        sb.append(((this.enrlBeginDateMethod == null)?"<null>":this.enrlBeginDateMethod));
        sb.append(',');
        sb.append("webBalcSelInd");
        sb.append('=');
        sb.append(((this.webBalcSelInd == null)?"<null>":this.webBalcSelInd));
        sb.append(',');
        sb.append("webBalcInsInd");
        sb.append('=');
        sb.append(((this.webBalcInsInd == null)?"<null>":this.webBalcInsInd));
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
        result = ((result* 31)+((this.webCvgUpdInd == null)? 0 :this.webCvgUpdInd.hashCode()));
        result = ((result* 31)+((this.webCvgSelInd == null)? 0 :this.webCvgSelInd.hashCode()));
        result = ((result* 31)+((this.webEmprInd == null)? 0 :this.webEmprInd.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.webBalcUpdInd == null)? 0 :this.webBalcUpdInd.hashCode()));
        result = ((result* 31)+((this.webCvgInsInd == null)? 0 :this.webCvgInsInd.hashCode()));
        result = ((result* 31)+((this.bdcaDesc == null)? 0 :this.bdcaDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.enrlBeginDateMethod == null)? 0 :this.enrlBeginDateMethod.hashCode()));
        result = ((result* 31)+((this.webBalcSelInd == null)? 0 :this.webBalcSelInd.hashCode()));
        result = ((result* 31)+((this.webBalcInsInd == null)? 0 :this.webBalcInsInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrlfbd) == false) {
            return false;
        }
        Ptrlfbd rhs = ((Ptrlfbd) other);
        return ((((((((((((this.webCvgUpdInd == rhs.webCvgUpdInd)||((this.webCvgUpdInd!= null)&&this.webCvgUpdInd.equals(rhs.webCvgUpdInd)))&&((this.webCvgSelInd == rhs.webCvgSelInd)||((this.webCvgSelInd!= null)&&this.webCvgSelInd.equals(rhs.webCvgSelInd))))&&((this.webEmprInd == rhs.webEmprInd)||((this.webEmprInd!= null)&&this.webEmprInd.equals(rhs.webEmprInd))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.webBalcUpdInd == rhs.webBalcUpdInd)||((this.webBalcUpdInd!= null)&&this.webBalcUpdInd.equals(rhs.webBalcUpdInd))))&&((this.webCvgInsInd == rhs.webCvgInsInd)||((this.webCvgInsInd!= null)&&this.webCvgInsInd.equals(rhs.webCvgInsInd))))&&((this.bdcaDesc == rhs.bdcaDesc)||((this.bdcaDesc!= null)&&this.bdcaDesc.equals(rhs.bdcaDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.enrlBeginDateMethod == rhs.enrlBeginDateMethod)||((this.enrlBeginDateMethod!= null)&&this.enrlBeginDateMethod.equals(rhs.enrlBeginDateMethod))))&&((this.webBalcSelInd == rhs.webBalcSelInd)||((this.webBalcSelInd!= null)&&this.webBalcSelInd.equals(rhs.webBalcSelInd))))&&((this.webBalcInsInd == rhs.webBalcInsInd)||((this.webBalcInsInd!= null)&&this.webBalcInsInd.equals(rhs.webBalcInsInd))));
    }

}
