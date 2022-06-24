
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
    "id",
    "termCodeEff",
    "ssgpCode",
    "needCode",
    "serdtndSsgpCode",
    "ndrfCode",
    "selfInd"
})
@Generated("jsonschema2pojo")
public class SupportServiceDetailNeedAssignment100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("termCodeEff")
    private String termCodeEff;
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
     * Need
     * <p>
     * Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed
     * 
     */
    @JsonProperty("needCode")
    @JsonPropertyDescription("Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed")
    private String needCode;
    @JsonProperty("serdtndSsgpCode")
    private String serdtndSsgpCode;
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SupportServiceDetailNeedAssignment100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public SupportServiceDetailNeedAssignment100QapiPost withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
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

    @JsonProperty("serdtndSsgpCode")
    public String getSerdtndSsgpCode() {
        return serdtndSsgpCode;
    }

    @JsonProperty("serdtndSsgpCode")
    public void setSerdtndSsgpCode(String serdtndSsgpCode) {
        this.serdtndSsgpCode = serdtndSsgpCode;
    }

    public SupportServiceDetailNeedAssignment100QapiPost withSerdtndSsgpCode(String serdtndSsgpCode) {
        this.serdtndSsgpCode = serdtndSsgpCode;
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
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("needCode");
        sb.append('=');
        sb.append(((this.needCode == null)?"<null>":this.needCode));
        sb.append(',');
        sb.append("serdtndSsgpCode");
        sb.append('=');
        sb.append(((this.serdtndSsgpCode == null)?"<null>":this.serdtndSsgpCode));
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
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.selfInd == null)? 0 :this.selfInd.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.serdtndSsgpCode == null)? 0 :this.serdtndSsgpCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
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
        return (((((((((this.ndrfCode == rhs.ndrfCode)||((this.ndrfCode!= null)&&this.ndrfCode.equals(rhs.ndrfCode)))&&((this.needCode == rhs.needCode)||((this.needCode!= null)&&this.needCode.equals(rhs.needCode))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.selfInd == rhs.selfInd)||((this.selfInd!= null)&&this.selfInd.equals(rhs.selfInd))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.serdtndSsgpCode == rhs.serdtndSsgpCode)||((this.serdtndSsgpCode!= null)&&this.serdtndSsgpCode.equals(rhs.serdtndSsgpCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
