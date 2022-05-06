
package com.ellucian.generated.bpapi.ban.exemption_authorization_detail_code_level_authorization.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exemptionCode",
    "keyblocTermCode",
    "desc",
    "detailCode",
    "tbbdetcDesc",
    "detailPriority",
    "percent",
    "minAmount",
    "maxAmount",
    "iESourceInd"
})
@Generated("jsonschema2pojo")
public class ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost {

    @JsonProperty("exemptionCode")
    private String exemptionCode;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("detailCode")
    private String detailCode;
    @JsonProperty("tbbdetcDesc")
    private String tbbdetcDesc;
    @JsonProperty("detailPriority")
    private String detailPriority;
    @JsonProperty("percent")
    private String percent;
    @JsonProperty("minAmount")
    private String minAmount;
    @JsonProperty("maxAmount")
    private String maxAmount;
    @JsonProperty("iESourceInd")
    private String iESourceInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("exemptionCode")
    public String getExemptionCode() {
        return exemptionCode;
    }

    @JsonProperty("exemptionCode")
    public void setExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    @JsonProperty("tbbdetcDesc")
    public String getTbbdetcDesc() {
        return tbbdetcDesc;
    }

    @JsonProperty("tbbdetcDesc")
    public void setTbbdetcDesc(String tbbdetcDesc) {
        this.tbbdetcDesc = tbbdetcDesc;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withTbbdetcDesc(String tbbdetcDesc) {
        this.tbbdetcDesc = tbbdetcDesc;
        return this;
    }

    @JsonProperty("detailPriority")
    public String getDetailPriority() {
        return detailPriority;
    }

    @JsonProperty("detailPriority")
    public void setDetailPriority(String detailPriority) {
        this.detailPriority = detailPriority;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withDetailPriority(String detailPriority) {
        this.detailPriority = detailPriority;
        return this;
    }

    @JsonProperty("percent")
    public String getPercent() {
        return percent;
    }

    @JsonProperty("percent")
    public void setPercent(String percent) {
        this.percent = percent;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withPercent(String percent) {
        this.percent = percent;
        return this;
    }

    @JsonProperty("minAmount")
    public String getMinAmount() {
        return minAmount;
    }

    @JsonProperty("minAmount")
    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withMinAmount(String minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    @JsonProperty("maxAmount")
    public String getMaxAmount() {
        return maxAmount;
    }

    @JsonProperty("maxAmount")
    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }

    @JsonProperty("iESourceInd")
    public String getiESourceInd() {
        return iESourceInd;
    }

    @JsonProperty("iESourceInd")
    public void setiESourceInd(String iESourceInd) {
        this.iESourceInd = iESourceInd;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withiESourceInd(String iESourceInd) {
        this.iESourceInd = iESourceInd;
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

    public ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exemptionCode");
        sb.append('=');
        sb.append(((this.exemptionCode == null)?"<null>":this.exemptionCode));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("tbbdetcDesc");
        sb.append('=');
        sb.append(((this.tbbdetcDesc == null)?"<null>":this.tbbdetcDesc));
        sb.append(',');
        sb.append("detailPriority");
        sb.append('=');
        sb.append(((this.detailPriority == null)?"<null>":this.detailPriority));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("minAmount");
        sb.append('=');
        sb.append(((this.minAmount == null)?"<null>":this.minAmount));
        sb.append(',');
        sb.append("maxAmount");
        sb.append('=');
        sb.append(((this.maxAmount == null)?"<null>":this.maxAmount));
        sb.append(',');
        sb.append("iESourceInd");
        sb.append('=');
        sb.append(((this.iESourceInd == null)?"<null>":this.iESourceInd));
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
        result = ((result* 31)+((this.exemptionCode == null)? 0 :this.exemptionCode.hashCode()));
        result = ((result* 31)+((this.minAmount == null)? 0 :this.minAmount.hashCode()));
        result = ((result* 31)+((this.tbbdetcDesc == null)? 0 :this.tbbdetcDesc.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.iESourceInd == null)? 0 :this.iESourceInd.hashCode()));
        result = ((result* 31)+((this.detailPriority == null)? 0 :this.detailPriority.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maxAmount == null)? 0 :this.maxAmount.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost) == false) {
            return false;
        }
        ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost rhs = ((ExemptionAuthorizationDetailCodeLevelAuthorization100QapiPost) other);
        return ((((((((((((this.exemptionCode == rhs.exemptionCode)||((this.exemptionCode!= null)&&this.exemptionCode.equals(rhs.exemptionCode)))&&((this.minAmount == rhs.minAmount)||((this.minAmount!= null)&&this.minAmount.equals(rhs.minAmount))))&&((this.tbbdetcDesc == rhs.tbbdetcDesc)||((this.tbbdetcDesc!= null)&&this.tbbdetcDesc.equals(rhs.tbbdetcDesc))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.iESourceInd == rhs.iESourceInd)||((this.iESourceInd!= null)&&this.iESourceInd.equals(rhs.iESourceInd))))&&((this.detailPriority == rhs.detailPriority)||((this.detailPriority!= null)&&this.detailPriority.equals(rhs.detailPriority))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maxAmount == rhs.maxAmount)||((this.maxAmount!= null)&&this.maxAmount.equals(rhs.maxAmount))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
