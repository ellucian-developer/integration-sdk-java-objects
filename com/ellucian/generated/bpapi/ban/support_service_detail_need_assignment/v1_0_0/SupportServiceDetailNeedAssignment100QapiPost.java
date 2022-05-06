
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
    "seadetlId",
    "seadetlTermCodeEff",
    "seadetlSsgpCode",
    "needCode",
    "ssgpCode",
    "ndrfCode",
    "selfInd"
})
@Generated("jsonschema2pojo")
public class SupportServiceDetailNeedAssignment100QapiPost {

    @JsonProperty("seadetlId")
    private String seadetlId;
    @JsonProperty("seadetlTermCodeEff")
    private String seadetlTermCodeEff;
    @JsonProperty("seadetlSsgpCode")
    private String seadetlSsgpCode;
    /**
     * Need
     * <p>
     * Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed
     * 
     */
    @JsonProperty("needCode")
    @JsonPropertyDescription("Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed")
    private String needCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
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
     * Lineage reference object : SERDTND_SELF_IND
     * 
     */
    @JsonProperty("selfInd")
    @JsonPropertyDescription("Lineage reference object : SERDTND_SELF_IND")
    private String selfInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("seadetlId")
    public String getSeadetlId() {
        return seadetlId;
    }

    @JsonProperty("seadetlId")
    public void setSeadetlId(String seadetlId) {
        this.seadetlId = seadetlId;
    }

    public SupportServiceDetailNeedAssignment100QapiPost withSeadetlId(String seadetlId) {
        this.seadetlId = seadetlId;
        return this;
    }

    @JsonProperty("seadetlTermCodeEff")
    public String getSeadetlTermCodeEff() {
        return seadetlTermCodeEff;
    }

    @JsonProperty("seadetlTermCodeEff")
    public void setSeadetlTermCodeEff(String seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
    }

    public SupportServiceDetailNeedAssignment100QapiPost withSeadetlTermCodeEff(String seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
        return this;
    }

    @JsonProperty("seadetlSsgpCode")
    public String getSeadetlSsgpCode() {
        return seadetlSsgpCode;
    }

    @JsonProperty("seadetlSsgpCode")
    public void setSeadetlSsgpCode(String seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
    }

    public SupportServiceDetailNeedAssignment100QapiPost withSeadetlSsgpCode(String seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
        return this;
    }

    /**
     * Need
     * <p>
     * Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed
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
     * 
     */
    @JsonProperty("needCode")
    public void setNeedCode(String needCode) {
        this.needCode = needCode;
    }

    public SupportServiceDetailNeedAssignment100QapiPost withNeedCode(String needCode) {
        this.needCode = needCode;
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

    public SupportServiceDetailNeedAssignment100QapiPost withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

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

    public SupportServiceDetailNeedAssignment100QapiPost withNdrfCode(String ndrfCode) {
        this.ndrfCode = ndrfCode;
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

    public SupportServiceDetailNeedAssignment100QapiPost withSelfInd(String selfInd) {
        this.selfInd = selfInd;
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

    public SupportServiceDetailNeedAssignment100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupportServiceDetailNeedAssignment100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seadetlId");
        sb.append('=');
        sb.append(((this.seadetlId == null)?"<null>":this.seadetlId));
        sb.append(',');
        sb.append("seadetlTermCodeEff");
        sb.append('=');
        sb.append(((this.seadetlTermCodeEff == null)?"<null>":this.seadetlTermCodeEff));
        sb.append(',');
        sb.append("seadetlSsgpCode");
        sb.append('=');
        sb.append(((this.seadetlSsgpCode == null)?"<null>":this.seadetlSsgpCode));
        sb.append(',');
        sb.append("needCode");
        sb.append('=');
        sb.append(((this.needCode == null)?"<null>":this.needCode));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("ndrfCode");
        sb.append('=');
        sb.append(((this.ndrfCode == null)?"<null>":this.ndrfCode));
        sb.append(',');
        sb.append("selfInd");
        sb.append('=');
        sb.append(((this.selfInd == null)?"<null>":this.selfInd));
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
        result = ((result* 31)+((this.seadetlTermCodeEff == null)? 0 :this.seadetlTermCodeEff.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.seadetlId == null)? 0 :this.seadetlId.hashCode()));
        result = ((result* 31)+((this.seadetlSsgpCode == null)? 0 :this.seadetlSsgpCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupportServiceDetailNeedAssignment100QapiPost) == false) {
            return false;
        }
        SupportServiceDetailNeedAssignment100QapiPost rhs = ((SupportServiceDetailNeedAssignment100QapiPost) other);
        return (((((((((this.ndrfCode == rhs.ndrfCode)||((this.ndrfCode!= null)&&this.ndrfCode.equals(rhs.ndrfCode)))&&((this.needCode == rhs.needCode)||((this.needCode!= null)&&this.needCode.equals(rhs.needCode))))&&((this.selfInd == rhs.selfInd)||((this.selfInd!= null)&&this.selfInd.equals(rhs.selfInd))))&&((this.seadetlTermCodeEff == rhs.seadetlTermCodeEff)||((this.seadetlTermCodeEff!= null)&&this.seadetlTermCodeEff.equals(rhs.seadetlTermCodeEff))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.seadetlId == rhs.seadetlId)||((this.seadetlId!= null)&&this.seadetlId.equals(rhs.seadetlId))))&&((this.seadetlSsgpCode == rhs.seadetlSsgpCode)||((this.seadetlSsgpCode!= null)&&this.seadetlSsgpCode.equals(rhs.seadetlSsgpCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
