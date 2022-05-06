
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
    "webCvgUpdInd",
    "webCvgSelInd",
    "webEmprInd",
    "code",
    "webOpenInd",
    "webSelInd",
    "webCvgInsInd",
    "webUpdInd",
    "webCvgDelInd",
    "webInsInd",
    "webDelInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class Ptrbdsg {

    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_CVG_UPD_IND")
    private String webCvgUpdInd;
    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_CVG_SEL_IND")
    private String webCvgSelInd;
    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRBDSG_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_EMPR_IND")
    private String webEmprInd;
    /**
     * Secondary Group
     * <p>
     * Lineage reference object : PTRBDSG_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_CODE")
    private String code;
    /**
     * Include in Open and New Hire Enrollment
     * <p>
     * Lineage reference object : PTRBDSG_WEB_OPEN_IND
     * 
     */
    @JsonProperty("webOpenInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_OPEN_IND")
    private String webOpenInd;
    /**
     * Lineage reference object : PTRBDSG_WEB_SEL_IND
     * 
     */
    @JsonProperty("webSelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_SEL_IND")
    private String webSelInd;
    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_CVG_INS_IND")
    private String webCvgInsInd;
    /**
     * Lineage reference object : PTRBDSG_WEB_UPD_IND
     * 
     */
    @JsonProperty("webUpdInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_UPD_IND")
    private String webUpdInd;
    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_DEL_IND
     * 
     */
    @JsonProperty("webCvgDelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_CVG_DEL_IND")
    private String webCvgDelInd;
    /**
     * Lineage reference object : PTRBDSG_WEB_INS_IND
     * 
     */
    @JsonProperty("webInsInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_INS_IND")
    private String webInsInd;
    /**
     * Lineage reference object : PTRBDSG_WEB_DEL_IND
     * 
     */
    @JsonProperty("webDelInd")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_WEB_DEL_IND")
    private String webDelInd;
    /**
     * Lineage reference object : PTRBDSG_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTRBDSG_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    public String getWebCvgUpdInd() {
        return webCvgUpdInd;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_UPD_IND
     * 
     */
    @JsonProperty("webCvgUpdInd")
    public void setWebCvgUpdInd(String webCvgUpdInd) {
        this.webCvgUpdInd = webCvgUpdInd;
    }

    public Ptrbdsg withWebCvgUpdInd(String webCvgUpdInd) {
        this.webCvgUpdInd = webCvgUpdInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    public String getWebCvgSelInd() {
        return webCvgSelInd;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_SEL_IND
     * 
     */
    @JsonProperty("webCvgSelInd")
    public void setWebCvgSelInd(String webCvgSelInd) {
        this.webCvgSelInd = webCvgSelInd;
    }

    public Ptrbdsg withWebCvgSelInd(String webCvgSelInd) {
        this.webCvgSelInd = webCvgSelInd;
        return this;
    }

    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRBDSG_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    public String getWebEmprInd() {
        return webEmprInd;
    }

    /**
     * Display Employer Amounts
     * <p>
     * Lineage reference object : PTRBDSG_WEB_EMPR_IND
     * 
     */
    @JsonProperty("webEmprInd")
    public void setWebEmprInd(String webEmprInd) {
        this.webEmprInd = webEmprInd;
    }

    public Ptrbdsg withWebEmprInd(String webEmprInd) {
        this.webEmprInd = webEmprInd;
        return this;
    }

    /**
     * Secondary Group
     * <p>
     * Lineage reference object : PTRBDSG_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Secondary Group
     * <p>
     * Lineage reference object : PTRBDSG_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Ptrbdsg withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Include in Open and New Hire Enrollment
     * <p>
     * Lineage reference object : PTRBDSG_WEB_OPEN_IND
     * 
     */
    @JsonProperty("webOpenInd")
    public String getWebOpenInd() {
        return webOpenInd;
    }

    /**
     * Include in Open and New Hire Enrollment
     * <p>
     * Lineage reference object : PTRBDSG_WEB_OPEN_IND
     * 
     */
    @JsonProperty("webOpenInd")
    public void setWebOpenInd(String webOpenInd) {
        this.webOpenInd = webOpenInd;
    }

    public Ptrbdsg withWebOpenInd(String webOpenInd) {
        this.webOpenInd = webOpenInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_SEL_IND
     * 
     */
    @JsonProperty("webSelInd")
    public String getWebSelInd() {
        return webSelInd;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_SEL_IND
     * 
     */
    @JsonProperty("webSelInd")
    public void setWebSelInd(String webSelInd) {
        this.webSelInd = webSelInd;
    }

    public Ptrbdsg withWebSelInd(String webSelInd) {
        this.webSelInd = webSelInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    public String getWebCvgInsInd() {
        return webCvgInsInd;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_INS_IND
     * 
     */
    @JsonProperty("webCvgInsInd")
    public void setWebCvgInsInd(String webCvgInsInd) {
        this.webCvgInsInd = webCvgInsInd;
    }

    public Ptrbdsg withWebCvgInsInd(String webCvgInsInd) {
        this.webCvgInsInd = webCvgInsInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_UPD_IND
     * 
     */
    @JsonProperty("webUpdInd")
    public String getWebUpdInd() {
        return webUpdInd;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_UPD_IND
     * 
     */
    @JsonProperty("webUpdInd")
    public void setWebUpdInd(String webUpdInd) {
        this.webUpdInd = webUpdInd;
    }

    public Ptrbdsg withWebUpdInd(String webUpdInd) {
        this.webUpdInd = webUpdInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_DEL_IND
     * 
     */
    @JsonProperty("webCvgDelInd")
    public String getWebCvgDelInd() {
        return webCvgDelInd;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_CVG_DEL_IND
     * 
     */
    @JsonProperty("webCvgDelInd")
    public void setWebCvgDelInd(String webCvgDelInd) {
        this.webCvgDelInd = webCvgDelInd;
    }

    public Ptrbdsg withWebCvgDelInd(String webCvgDelInd) {
        this.webCvgDelInd = webCvgDelInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_INS_IND
     * 
     */
    @JsonProperty("webInsInd")
    public String getWebInsInd() {
        return webInsInd;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_INS_IND
     * 
     */
    @JsonProperty("webInsInd")
    public void setWebInsInd(String webInsInd) {
        this.webInsInd = webInsInd;
    }

    public Ptrbdsg withWebInsInd(String webInsInd) {
        this.webInsInd = webInsInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_DEL_IND
     * 
     */
    @JsonProperty("webDelInd")
    public String getWebDelInd() {
        return webDelInd;
    }

    /**
     * Lineage reference object : PTRBDSG_WEB_DEL_IND
     * 
     */
    @JsonProperty("webDelInd")
    public void setWebDelInd(String webDelInd) {
        this.webDelInd = webDelInd;
    }

    public Ptrbdsg withWebDelInd(String webDelInd) {
        this.webDelInd = webDelInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBDSG_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Lineage reference object : PTRBDSG_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Ptrbdsg withDesc(String desc) {
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

    public Ptrbdsg withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrbdsg.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("webOpenInd");
        sb.append('=');
        sb.append(((this.webOpenInd == null)?"<null>":this.webOpenInd));
        sb.append(',');
        sb.append("webSelInd");
        sb.append('=');
        sb.append(((this.webSelInd == null)?"<null>":this.webSelInd));
        sb.append(',');
        sb.append("webCvgInsInd");
        sb.append('=');
        sb.append(((this.webCvgInsInd == null)?"<null>":this.webCvgInsInd));
        sb.append(',');
        sb.append("webUpdInd");
        sb.append('=');
        sb.append(((this.webUpdInd == null)?"<null>":this.webUpdInd));
        sb.append(',');
        sb.append("webCvgDelInd");
        sb.append('=');
        sb.append(((this.webCvgDelInd == null)?"<null>":this.webCvgDelInd));
        sb.append(',');
        sb.append("webInsInd");
        sb.append('=');
        sb.append(((this.webInsInd == null)?"<null>":this.webInsInd));
        sb.append(',');
        sb.append("webDelInd");
        sb.append('=');
        sb.append(((this.webDelInd == null)?"<null>":this.webDelInd));
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
        result = ((result* 31)+((this.webCvgSelInd == null)? 0 :this.webCvgSelInd.hashCode()));
        result = ((result* 31)+((this.webEmprInd == null)? 0 :this.webEmprInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.webOpenInd == null)? 0 :this.webOpenInd.hashCode()));
        result = ((result* 31)+((this.webCvgInsInd == null)? 0 :this.webCvgInsInd.hashCode()));
        result = ((result* 31)+((this.webUpdInd == null)? 0 :this.webUpdInd.hashCode()));
        result = ((result* 31)+((this.webCvgUpdInd == null)? 0 :this.webCvgUpdInd.hashCode()));
        result = ((result* 31)+((this.webSelInd == null)? 0 :this.webSelInd.hashCode()));
        result = ((result* 31)+((this.webCvgDelInd == null)? 0 :this.webCvgDelInd.hashCode()));
        result = ((result* 31)+((this.webInsInd == null)? 0 :this.webInsInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.webDelInd == null)? 0 :this.webDelInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrbdsg) == false) {
            return false;
        }
        Ptrbdsg rhs = ((Ptrbdsg) other);
        return ((((((((((((((this.webCvgSelInd == rhs.webCvgSelInd)||((this.webCvgSelInd!= null)&&this.webCvgSelInd.equals(rhs.webCvgSelInd)))&&((this.webEmprInd == rhs.webEmprInd)||((this.webEmprInd!= null)&&this.webEmprInd.equals(rhs.webEmprInd))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.webOpenInd == rhs.webOpenInd)||((this.webOpenInd!= null)&&this.webOpenInd.equals(rhs.webOpenInd))))&&((this.webCvgInsInd == rhs.webCvgInsInd)||((this.webCvgInsInd!= null)&&this.webCvgInsInd.equals(rhs.webCvgInsInd))))&&((this.webUpdInd == rhs.webUpdInd)||((this.webUpdInd!= null)&&this.webUpdInd.equals(rhs.webUpdInd))))&&((this.webCvgUpdInd == rhs.webCvgUpdInd)||((this.webCvgUpdInd!= null)&&this.webCvgUpdInd.equals(rhs.webCvgUpdInd))))&&((this.webSelInd == rhs.webSelInd)||((this.webSelInd!= null)&&this.webSelInd.equals(rhs.webSelInd))))&&((this.webCvgDelInd == rhs.webCvgDelInd)||((this.webCvgDelInd!= null)&&this.webCvgDelInd.equals(rhs.webCvgDelInd))))&&((this.webInsInd == rhs.webInsInd)||((this.webInsInd!= null)&&this.webInsInd.equals(rhs.webInsInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.webDelInd == rhs.webDelInd)||((this.webDelInd!= null)&&this.webDelInd.equals(rhs.webDelInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
