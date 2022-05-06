
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
    "bdpgDesc",
    "webCvgInsInd",
    "bdpgCode",
    "priority"
})
@Generated("jsonschema2pojo")
public class Ptrlfch {

    /**
     * Lineage reference object : PTRLFCH_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFCH_WEB_CVG_UPD_IND")
    private String webCvgUpdInd;
    /**
     * Lineage reference object : PTRLFCH_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFCH_WEB_CVG_SEL_IND")
    private String webCvgSelInd;
    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRLFCH_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFCH_WEB_EMPR_IND")
    private String webEmprInd;
    @JsonProperty("bdpgDesc")
    private String bdpgDesc;
    /**
     * Lineage reference object : PTRLFCH_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    @JsonPropertyDescription("Lineage reference object : PTRLFCH_WEB_CVG_INS_IND")
    private String webCvgInsInd;
    /**
     * Primary Group
     * <p>
     * Lineage reference object : PTRLFCH_BDPG_CODE, Lookup lineage reference object : PTVBDPG
     * (Required)
     * 
     */
    @JsonProperty("bdpgCode")
    @JsonPropertyDescription("Lineage reference object : PTRLFCH_BDPG_CODE, Lookup lineage reference object : PTVBDPG")
    private String bdpgCode;
    /**
     * Benefit Enrollment Priority
     * <p>
     * Lineage reference object : PTRLFCH_PRIORITY
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : PTRLFCH_PRIORITY")
    private Double priority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PTRLFCH_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    public String getWebCvgUpdInd() {
        return webCvgUpdInd;
    }

    /**
     * Lineage reference object : PTRLFCH_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    public void setWebCvgUpdInd(String webCvgUpdInd) {
        this.webCvgUpdInd = webCvgUpdInd;
    }

    public Ptrlfch withWebCvgUpdInd(String webCvgUpdInd) {
        this.webCvgUpdInd = webCvgUpdInd;
        return this;
    }

    /**
     * Lineage reference object : PTRLFCH_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    public String getWebCvgSelInd() {
        return webCvgSelInd;
    }

    /**
     * Lineage reference object : PTRLFCH_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    public void setWebCvgSelInd(String webCvgSelInd) {
        this.webCvgSelInd = webCvgSelInd;
    }

    public Ptrlfch withWebCvgSelInd(String webCvgSelInd) {
        this.webCvgSelInd = webCvgSelInd;
        return this;
    }

    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRLFCH_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    public String getWebEmprInd() {
        return webEmprInd;
    }

    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRLFCH_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    public void setWebEmprInd(String webEmprInd) {
        this.webEmprInd = webEmprInd;
    }

    public Ptrlfch withWebEmprInd(String webEmprInd) {
        this.webEmprInd = webEmprInd;
        return this;
    }

    @JsonProperty("bdpgDesc")
    public String getBdpgDesc() {
        return bdpgDesc;
    }

    @JsonProperty("bdpgDesc")
    public void setBdpgDesc(String bdpgDesc) {
        this.bdpgDesc = bdpgDesc;
    }

    public Ptrlfch withBdpgDesc(String bdpgDesc) {
        this.bdpgDesc = bdpgDesc;
        return this;
    }

    /**
     * Lineage reference object : PTRLFCH_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    public String getWebCvgInsInd() {
        return webCvgInsInd;
    }

    /**
     * Lineage reference object : PTRLFCH_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    public void setWebCvgInsInd(String webCvgInsInd) {
        this.webCvgInsInd = webCvgInsInd;
    }

    public Ptrlfch withWebCvgInsInd(String webCvgInsInd) {
        this.webCvgInsInd = webCvgInsInd;
        return this;
    }

    /**
     * Primary Group
     * <p>
     * Lineage reference object : PTRLFCH_BDPG_CODE, Lookup lineage reference object : PTVBDPG
     * (Required)
     * 
     */
    @JsonProperty("bdpgCode")
    public String getBdpgCode() {
        return bdpgCode;
    }

    /**
     * Primary Group
     * <p>
     * Lineage reference object : PTRLFCH_BDPG_CODE, Lookup lineage reference object : PTVBDPG
     * (Required)
     * 
     */
    @JsonProperty("bdpgCode")
    public void setBdpgCode(String bdpgCode) {
        this.bdpgCode = bdpgCode;
    }

    public Ptrlfch withBdpgCode(String bdpgCode) {
        this.bdpgCode = bdpgCode;
        return this;
    }

    /**
     * Benefit Enrollment Priority
     * <p>
     * Lineage reference object : PTRLFCH_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public Double getPriority() {
        return priority;
    }

    /**
     * Benefit Enrollment Priority
     * <p>
     * Lineage reference object : PTRLFCH_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public Ptrlfch withPriority(Double priority) {
        this.priority = priority;
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

    public Ptrlfch withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrlfch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("bdpgDesc");
        sb.append('=');
        sb.append(((this.bdpgDesc == null)?"<null>":this.bdpgDesc));
        sb.append(',');
        sb.append("webCvgInsInd");
        sb.append('=');
        sb.append(((this.webCvgInsInd == null)?"<null>":this.webCvgInsInd));
        sb.append(',');
        sb.append("bdpgCode");
        sb.append('=');
        sb.append(((this.bdpgCode == null)?"<null>":this.bdpgCode));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
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
        result = ((result* 31)+((this.bdpgDesc == null)? 0 :this.bdpgDesc.hashCode()));
        result = ((result* 31)+((this.webCvgInsInd == null)? 0 :this.webCvgInsInd.hashCode()));
        result = ((result* 31)+((this.bdpgCode == null)? 0 :this.bdpgCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrlfch) == false) {
            return false;
        }
        Ptrlfch rhs = ((Ptrlfch) other);
        return (((((((((this.webCvgUpdInd == rhs.webCvgUpdInd)||((this.webCvgUpdInd!= null)&&this.webCvgUpdInd.equals(rhs.webCvgUpdInd)))&&((this.webCvgSelInd == rhs.webCvgSelInd)||((this.webCvgSelInd!= null)&&this.webCvgSelInd.equals(rhs.webCvgSelInd))))&&((this.webEmprInd == rhs.webEmprInd)||((this.webEmprInd!= null)&&this.webEmprInd.equals(rhs.webEmprInd))))&&((this.bdpgDesc == rhs.bdpgDesc)||((this.bdpgDesc!= null)&&this.bdpgDesc.equals(rhs.bdpgDesc))))&&((this.webCvgInsInd == rhs.webCvgInsInd)||((this.webCvgInsInd!= null)&&this.webCvgInsInd.equals(rhs.webCvgInsInd))))&&((this.bdpgCode == rhs.bdpgCode)||((this.bdpgCode!= null)&&this.bdpgCode.equals(rhs.bdpgCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))));
    }

}
