
package com.ellucian.generated.bpapi.ban.benefit_or_deduction_grouping_rule.v1_0_0;

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
    "webCvgSelInd",
    "webEmprInd",
    "bdcaCode",
    "webBalcDelInd",
    "webOpenInd",
    "webCvgInsInd",
    "webUpdInd",
    "webCvgUpdInd",
    "webBalcUpdInd",
    "webSelInd",
    "bdcaDesc",
    "webCvgDelInd",
    "webInsInd",
    "webBalcSelInd",
    "webDelInd",
    "webBalcInsInd"
})
@Generated("jsonschema2pojo")
public class Ptrbdgm {

    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_CVG_SEL_IND")
    private String webCvgSelInd;
    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRBDGM_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_EMPR_IND")
    private String webEmprInd;
    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRBDGM_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_BDCA_CODE")
    private String bdcaCode;
    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_DEL_IND
     * 
     */
    @JsonProperty("webBalcDelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_BALC_DEL_IND")
    private String webBalcDelInd;
    /**
     * Include in Open and New Hire Enrollment
     * <p>
     * Lineage reference object : PTRBDGM_WEB_OPEN_IND
     * 
     */
    @JsonProperty("webOpenInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_OPEN_IND")
    private String webOpenInd;
    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_CVG_INS_IND")
    private String webCvgInsInd;
    /**
     * Lineage reference object : PTRBDGM_WEB_UPD_IND
     * 
     */
    @JsonProperty("webUpdInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_UPD_IND")
    private String webUpdInd;
    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_CVG_UPD_IND")
    private String webCvgUpdInd;
    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_UPD_IND
     * 
     */
    @JsonProperty("webBalcUpdInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_BALC_UPD_IND")
    private String webBalcUpdInd;
    /**
     * Lineage reference object : PTRBDGM_WEB_SEL_IND
     * 
     */
    @JsonProperty("webSelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_SEL_IND")
    private String webSelInd;
    @JsonProperty("bdcaDesc")
    private String bdcaDesc;
    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_DEL_IND
     * 
     */
    @JsonProperty("webCvgDelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_CVG_DEL_IND")
    private String webCvgDelInd;
    /**
     * Lineage reference object : PTRBDGM_WEB_INS_IND
     * 
     */
    @JsonProperty("webInsInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_INS_IND")
    private String webInsInd;
    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_SEL_IND
     * 
     */
    @JsonProperty("webBalcSelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_BALC_SEL_IND")
    private String webBalcSelInd;
    /**
     * Lineage reference object : PTRBDGM_WEB_DEL_IND
     * 
     */
    @JsonProperty("webDelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_DEL_IND")
    private String webDelInd;
    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_INS_IND
     * 
     */
    @JsonProperty("webBalcInsInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDGM_WEB_BALC_INS_IND")
    private String webBalcInsInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    public String getWebCvgSelInd() {
        return webCvgSelInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    public void setWebCvgSelInd(String webCvgSelInd) {
        this.webCvgSelInd = webCvgSelInd;
    }

    public Ptrbdgm withWebCvgSelInd(String webCvgSelInd) {
        this.webCvgSelInd = webCvgSelInd;
        return this;
    }

    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRBDGM_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    public String getWebEmprInd() {
        return webEmprInd;
    }

    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRBDGM_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    public void setWebEmprInd(String webEmprInd) {
        this.webEmprInd = webEmprInd;
    }

    public Ptrbdgm withWebEmprInd(String webEmprInd) {
        this.webEmprInd = webEmprInd;
        return this;
    }

    /**
     * Benefit or Deduction
     * <p>
     * Lineage reference object : PTRBDGM_BDCA_CODE
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
     * Lineage reference object : PTRBDGM_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public Ptrbdgm withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_DEL_IND
     * 
     */
    @JsonProperty("webBalcDelInd")
    public String getWebBalcDelInd() {
        return webBalcDelInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_DEL_IND
     * 
     */
    @JsonProperty("webBalcDelInd")
    public void setWebBalcDelInd(String webBalcDelInd) {
        this.webBalcDelInd = webBalcDelInd;
    }

    public Ptrbdgm withWebBalcDelInd(String webBalcDelInd) {
        this.webBalcDelInd = webBalcDelInd;
        return this;
    }

    /**
     * Include in Open and New Hire Enrollment
     * <p>
     * Lineage reference object : PTRBDGM_WEB_OPEN_IND
     * 
     */
    @JsonProperty("webOpenInd")
    public String getWebOpenInd() {
        return webOpenInd;
    }

    /**
     * Include in Open and New Hire Enrollment
     * <p>
     * Lineage reference object : PTRBDGM_WEB_OPEN_IND
     * 
     */
    @JsonProperty("webOpenInd")
    public void setWebOpenInd(String webOpenInd) {
        this.webOpenInd = webOpenInd;
    }

    public Ptrbdgm withWebOpenInd(String webOpenInd) {
        this.webOpenInd = webOpenInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    public String getWebCvgInsInd() {
        return webCvgInsInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    public void setWebCvgInsInd(String webCvgInsInd) {
        this.webCvgInsInd = webCvgInsInd;
    }

    public Ptrbdgm withWebCvgInsInd(String webCvgInsInd) {
        this.webCvgInsInd = webCvgInsInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_UPD_IND
     * 
     */
    @JsonProperty("webUpdInd")
    public String getWebUpdInd() {
        return webUpdInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_UPD_IND
     * 
     */
    @JsonProperty("webUpdInd")
    public void setWebUpdInd(String webUpdInd) {
        this.webUpdInd = webUpdInd;
    }

    public Ptrbdgm withWebUpdInd(String webUpdInd) {
        this.webUpdInd = webUpdInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    public String getWebCvgUpdInd() {
        return webCvgUpdInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    public void setWebCvgUpdInd(String webCvgUpdInd) {
        this.webCvgUpdInd = webCvgUpdInd;
    }

    public Ptrbdgm withWebCvgUpdInd(String webCvgUpdInd) {
        this.webCvgUpdInd = webCvgUpdInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_UPD_IND
     * 
     */
    @JsonProperty("webBalcUpdInd")
    public String getWebBalcUpdInd() {
        return webBalcUpdInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_UPD_IND
     * 
     */
    @JsonProperty("webBalcUpdInd")
    public void setWebBalcUpdInd(String webBalcUpdInd) {
        this.webBalcUpdInd = webBalcUpdInd;
    }

    public Ptrbdgm withWebBalcUpdInd(String webBalcUpdInd) {
        this.webBalcUpdInd = webBalcUpdInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_SEL_IND
     * 
     */
    @JsonProperty("webSelInd")
    public String getWebSelInd() {
        return webSelInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_SEL_IND
     * 
     */
    @JsonProperty("webSelInd")
    public void setWebSelInd(String webSelInd) {
        this.webSelInd = webSelInd;
    }

    public Ptrbdgm withWebSelInd(String webSelInd) {
        this.webSelInd = webSelInd;
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

    public Ptrbdgm withBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_DEL_IND
     * 
     */
    @JsonProperty("webCvgDelInd")
    public String getWebCvgDelInd() {
        return webCvgDelInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_CVG_DEL_IND
     * 
     */
    @JsonProperty("webCvgDelInd")
    public void setWebCvgDelInd(String webCvgDelInd) {
        this.webCvgDelInd = webCvgDelInd;
    }

    public Ptrbdgm withWebCvgDelInd(String webCvgDelInd) {
        this.webCvgDelInd = webCvgDelInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_INS_IND
     * 
     */
    @JsonProperty("webInsInd")
    public String getWebInsInd() {
        return webInsInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_INS_IND
     * 
     */
    @JsonProperty("webInsInd")
    public void setWebInsInd(String webInsInd) {
        this.webInsInd = webInsInd;
    }

    public Ptrbdgm withWebInsInd(String webInsInd) {
        this.webInsInd = webInsInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_SEL_IND
     * 
     */
    @JsonProperty("webBalcSelInd")
    public String getWebBalcSelInd() {
        return webBalcSelInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_SEL_IND
     * 
     */
    @JsonProperty("webBalcSelInd")
    public void setWebBalcSelInd(String webBalcSelInd) {
        this.webBalcSelInd = webBalcSelInd;
    }

    public Ptrbdgm withWebBalcSelInd(String webBalcSelInd) {
        this.webBalcSelInd = webBalcSelInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_DEL_IND
     * 
     */
    @JsonProperty("webDelInd")
    public String getWebDelInd() {
        return webDelInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_DEL_IND
     * 
     */
    @JsonProperty("webDelInd")
    public void setWebDelInd(String webDelInd) {
        this.webDelInd = webDelInd;
    }

    public Ptrbdgm withWebDelInd(String webDelInd) {
        this.webDelInd = webDelInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_INS_IND
     * 
     */
    @JsonProperty("webBalcInsInd")
    public String getWebBalcInsInd() {
        return webBalcInsInd;
    }

    /**
     * Lineage reference object : PTRBDGM_WEB_BALC_INS_IND
     * 
     */
    @JsonProperty("webBalcInsInd")
    public void setWebBalcInsInd(String webBalcInsInd) {
        this.webBalcInsInd = webBalcInsInd;
    }

    public Ptrbdgm withWebBalcInsInd(String webBalcInsInd) {
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

    public Ptrbdgm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrbdgm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("webBalcDelInd");
        sb.append('=');
        sb.append(((this.webBalcDelInd == null)?"<null>":this.webBalcDelInd));
        sb.append(',');
        sb.append("webOpenInd");
        sb.append('=');
        sb.append(((this.webOpenInd == null)?"<null>":this.webOpenInd));
        sb.append(',');
        sb.append("webCvgInsInd");
        sb.append('=');
        sb.append(((this.webCvgInsInd == null)?"<null>":this.webCvgInsInd));
        sb.append(',');
        sb.append("webUpdInd");
        sb.append('=');
        sb.append(((this.webUpdInd == null)?"<null>":this.webUpdInd));
        sb.append(',');
        sb.append("webCvgUpdInd");
        sb.append('=');
        sb.append(((this.webCvgUpdInd == null)?"<null>":this.webCvgUpdInd));
        sb.append(',');
        sb.append("webBalcUpdInd");
        sb.append('=');
        sb.append(((this.webBalcUpdInd == null)?"<null>":this.webBalcUpdInd));
        sb.append(',');
        sb.append("webSelInd");
        sb.append('=');
        sb.append(((this.webSelInd == null)?"<null>":this.webSelInd));
        sb.append(',');
        sb.append("bdcaDesc");
        sb.append('=');
        sb.append(((this.bdcaDesc == null)?"<null>":this.bdcaDesc));
        sb.append(',');
        sb.append("webCvgDelInd");
        sb.append('=');
        sb.append(((this.webCvgDelInd == null)?"<null>":this.webCvgDelInd));
        sb.append(',');
        sb.append("webInsInd");
        sb.append('=');
        sb.append(((this.webInsInd == null)?"<null>":this.webInsInd));
        sb.append(',');
        sb.append("webBalcSelInd");
        sb.append('=');
        sb.append(((this.webBalcSelInd == null)?"<null>":this.webBalcSelInd));
        sb.append(',');
        sb.append("webDelInd");
        sb.append('=');
        sb.append(((this.webDelInd == null)?"<null>":this.webDelInd));
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
        result = ((result* 31)+((this.webCvgSelInd == null)? 0 :this.webCvgSelInd.hashCode()));
        result = ((result* 31)+((this.webEmprInd == null)? 0 :this.webEmprInd.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.webBalcDelInd == null)? 0 :this.webBalcDelInd.hashCode()));
        result = ((result* 31)+((this.webOpenInd == null)? 0 :this.webOpenInd.hashCode()));
        result = ((result* 31)+((this.webCvgInsInd == null)? 0 :this.webCvgInsInd.hashCode()));
        result = ((result* 31)+((this.webUpdInd == null)? 0 :this.webUpdInd.hashCode()));
        result = ((result* 31)+((this.webCvgUpdInd == null)? 0 :this.webCvgUpdInd.hashCode()));
        result = ((result* 31)+((this.webBalcUpdInd == null)? 0 :this.webBalcUpdInd.hashCode()));
        result = ((result* 31)+((this.webSelInd == null)? 0 :this.webSelInd.hashCode()));
        result = ((result* 31)+((this.bdcaDesc == null)? 0 :this.bdcaDesc.hashCode()));
        result = ((result* 31)+((this.webCvgDelInd == null)? 0 :this.webCvgDelInd.hashCode()));
        result = ((result* 31)+((this.webInsInd == null)? 0 :this.webInsInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.webBalcSelInd == null)? 0 :this.webBalcSelInd.hashCode()));
        result = ((result* 31)+((this.webDelInd == null)? 0 :this.webDelInd.hashCode()));
        result = ((result* 31)+((this.webBalcInsInd == null)? 0 :this.webBalcInsInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrbdgm) == false) {
            return false;
        }
        Ptrbdgm rhs = ((Ptrbdgm) other);
        return ((((((((((((((((((this.webCvgSelInd == rhs.webCvgSelInd)||((this.webCvgSelInd!= null)&&this.webCvgSelInd.equals(rhs.webCvgSelInd)))&&((this.webEmprInd == rhs.webEmprInd)||((this.webEmprInd!= null)&&this.webEmprInd.equals(rhs.webEmprInd))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.webBalcDelInd == rhs.webBalcDelInd)||((this.webBalcDelInd!= null)&&this.webBalcDelInd.equals(rhs.webBalcDelInd))))&&((this.webOpenInd == rhs.webOpenInd)||((this.webOpenInd!= null)&&this.webOpenInd.equals(rhs.webOpenInd))))&&((this.webCvgInsInd == rhs.webCvgInsInd)||((this.webCvgInsInd!= null)&&this.webCvgInsInd.equals(rhs.webCvgInsInd))))&&((this.webUpdInd == rhs.webUpdInd)||((this.webUpdInd!= null)&&this.webUpdInd.equals(rhs.webUpdInd))))&&((this.webCvgUpdInd == rhs.webCvgUpdInd)||((this.webCvgUpdInd!= null)&&this.webCvgUpdInd.equals(rhs.webCvgUpdInd))))&&((this.webBalcUpdInd == rhs.webBalcUpdInd)||((this.webBalcUpdInd!= null)&&this.webBalcUpdInd.equals(rhs.webBalcUpdInd))))&&((this.webSelInd == rhs.webSelInd)||((this.webSelInd!= null)&&this.webSelInd.equals(rhs.webSelInd))))&&((this.bdcaDesc == rhs.bdcaDesc)||((this.bdcaDesc!= null)&&this.bdcaDesc.equals(rhs.bdcaDesc))))&&((this.webCvgDelInd == rhs.webCvgDelInd)||((this.webCvgDelInd!= null)&&this.webCvgDelInd.equals(rhs.webCvgDelInd))))&&((this.webInsInd == rhs.webInsInd)||((this.webInsInd!= null)&&this.webInsInd.equals(rhs.webInsInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.webBalcSelInd == rhs.webBalcSelInd)||((this.webBalcSelInd!= null)&&this.webBalcSelInd.equals(rhs.webBalcSelInd))))&&((this.webDelInd == rhs.webDelInd)||((this.webDelInd!= null)&&this.webDelInd.equals(rhs.webDelInd))))&&((this.webBalcInsInd == rhs.webBalcInsInd)||((this.webBalcInsInd!= null)&&this.webBalcInsInd.equals(rhs.webBalcInsInd))));
    }

}
