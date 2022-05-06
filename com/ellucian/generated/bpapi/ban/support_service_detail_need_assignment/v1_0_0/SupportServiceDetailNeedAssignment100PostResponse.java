
package com.ellucian.generated.bpapi.ban.support_service_detail_need_assignment.v1_0_0;

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
    "ndrfCode",
    "needCode",
    "selfInd",
    "ssgpCode",
    "endcopy",
    "needDescription"
})
@Generated("jsonschema2pojo")
public class SupportServiceDetailNeedAssignment100PostResponse {

    /**
     * Need Referral Code
     * <p>
     * Lineage reference object : SERDTND_NDRF_CODE, Lookup lineage reference object : stvndrf
     * 
     */
    @JsonProperty("ndrfCode")
    @JsonPropertyDescription("Lineage reference object : SERDTND_NDRF_CODE, Lookup lineage reference object : stvndrf")
    private String ndrfCode;
    /**
     * Need
     * <p>
     * Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed
     * (Required)
     * 
     */
    @JsonProperty("needCode")
    @JsonPropertyDescription("Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed")
    private String needCode;
    /**
     * Lineage reference object : SERDTND_SELF_IND
     * 
     */
    @JsonProperty("selfInd")
    @JsonPropertyDescription("Lineage reference object : SERDTND_SELF_IND")
    private String selfInd;
    /**
     * Group
     * <p>
     * Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    @JsonProperty("endcopy")
    private String endcopy;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("needDescription")
    private String needDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Need Referral Code
     * <p>
     * Lineage reference object : SERDTND_NDRF_CODE, Lookup lineage reference object : stvndrf
     * 
     */
    @JsonProperty("ndrfCode")
    public String getNdrfCode() {
        return ndrfCode;
    }

    /**
     * Need Referral Code
     * <p>
     * Lineage reference object : SERDTND_NDRF_CODE, Lookup lineage reference object : stvndrf
     * 
     */
    @JsonProperty("ndrfCode")
    public void setNdrfCode(String ndrfCode) {
        this.ndrfCode = ndrfCode;
    }

    public SupportServiceDetailNeedAssignment100PostResponse withNdrfCode(String ndrfCode) {
        this.ndrfCode = ndrfCode;
        return this;
    }

    /**
     * Need
     * <p>
     * Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed
     * (Required)
     * 
     */
    @JsonProperty("needCode")
    public String getNeedCode() {
        return needCode;
    }

    /**
     * Need
     * <p>
     * Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed
     * (Required)
     * 
     */
    @JsonProperty("needCode")
    public void setNeedCode(String needCode) {
        this.needCode = needCode;
    }

    public SupportServiceDetailNeedAssignment100PostResponse withNeedCode(String needCode) {
        this.needCode = needCode;
        return this;
    }

    /**
     * Lineage reference object : SERDTND_SELF_IND
     * 
     */
    @JsonProperty("selfInd")
    public String getSelfInd() {
        return selfInd;
    }

    /**
     * Lineage reference object : SERDTND_SELF_IND
     * 
     */
    @JsonProperty("selfInd")
    public void setSelfInd(String selfInd) {
        this.selfInd = selfInd;
    }

    public SupportServiceDetailNeedAssignment100PostResponse withSelfInd(String selfInd) {
        this.selfInd = selfInd;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public SupportServiceDetailNeedAssignment100PostResponse withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    @JsonProperty("endcopy")
    public String getEndcopy() {
        return endcopy;
    }

    @JsonProperty("endcopy")
    public void setEndcopy(String endcopy) {
        this.endcopy = endcopy;
    }

    public SupportServiceDetailNeedAssignment100PostResponse withEndcopy(String endcopy) {
        this.endcopy = endcopy;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("needDescription")
    public String getNeedDescription() {
        return needDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("needDescription")
    public void setNeedDescription(String needDescription) {
        this.needDescription = needDescription;
    }

    public SupportServiceDetailNeedAssignment100PostResponse withNeedDescription(String needDescription) {
        this.needDescription = needDescription;
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

    public SupportServiceDetailNeedAssignment100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupportServiceDetailNeedAssignment100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ndrfCode");
        sb.append('=');
        sb.append(((this.ndrfCode == null)?"<null>":this.ndrfCode));
        sb.append(',');
        sb.append("needCode");
        sb.append('=');
        sb.append(((this.needCode == null)?"<null>":this.needCode));
        sb.append(',');
        sb.append("selfInd");
        sb.append('=');
        sb.append(((this.selfInd == null)?"<null>":this.selfInd));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("endcopy");
        sb.append('=');
        sb.append(((this.endcopy == null)?"<null>":this.endcopy));
        sb.append(',');
        sb.append("needDescription");
        sb.append('=');
        sb.append(((this.needDescription == null)?"<null>":this.needDescription));
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
        result = ((result* 31)+((this.ndrfCode == null)? 0 :this.ndrfCode.hashCode()));
        result = ((result* 31)+((this.needCode == null)? 0 :this.needCode.hashCode()));
        result = ((result* 31)+((this.selfInd == null)? 0 :this.selfInd.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.endcopy == null)? 0 :this.endcopy.hashCode()));
        result = ((result* 31)+((this.needDescription == null)? 0 :this.needDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupportServiceDetailNeedAssignment100PostResponse) == false) {
            return false;
        }
        SupportServiceDetailNeedAssignment100PostResponse rhs = ((SupportServiceDetailNeedAssignment100PostResponse) other);
        return ((((((((this.ndrfCode == rhs.ndrfCode)||((this.ndrfCode!= null)&&this.ndrfCode.equals(rhs.ndrfCode)))&&((this.needCode == rhs.needCode)||((this.needCode!= null)&&this.needCode.equals(rhs.needCode))))&&((this.selfInd == rhs.selfInd)||((this.selfInd!= null)&&this.selfInd.equals(rhs.selfInd))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.endcopy == rhs.endcopy)||((this.endcopy!= null)&&this.endcopy.equals(rhs.endcopy))))&&((this.needDescription == rhs.needDescription)||((this.needDescription!= null)&&this.needDescription.equals(rhs.needDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
