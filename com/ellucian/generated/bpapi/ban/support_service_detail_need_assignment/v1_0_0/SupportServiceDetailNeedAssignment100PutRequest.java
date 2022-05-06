
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
    "criteria.ndrfCode",
    "needCode",
    "selfInd",
    "seadetlTermCodeEff",
    "ssgpCode",
    "seadetlId",
    "seadetlSsgpCode",
    "criteria.selfInd",
    "criteria.ssgpCode",
    "criteria.needCode"
})
@Generated("jsonschema2pojo")
public class SupportServiceDetailNeedAssignment100PutRequest {

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
     * Need Referral Code
     * <p>
     * Lineage reference object : SERDTND_NDRF_CODE, Lookup lineage reference object : stvndrf
     * 
     */
    @JsonProperty("criteria.ndrfCode")
    @JsonPropertyDescription("Lineage reference object : SERDTND_NDRF_CODE, Lookup lineage reference object : stvndrf")
    private String criteriaNdrfCode;
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
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("seadetlTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm")
    private Object seadetlTermCodeEff;
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
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("seadetlId")
    @JsonPropertyDescription("Lineage reference object : seadetlId")
    private Object seadetlId;
    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("seadetlSsgpCode")
    @JsonPropertyDescription("Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp")
    private Object seadetlSsgpCode;
    /**
     * Lineage reference object : SERDTND_SELF_IND
     * 
     */
    @JsonProperty("criteria.selfInd")
    @JsonPropertyDescription("Lineage reference object : SERDTND_SELF_IND")
    private String criteriaSelfInd;
    /**
     * Group
     * <p>
     * Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String criteriaSsgpCode;
    /**
     * Need
     * <p>
     * Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed
     * (Required)
     * 
     */
    @JsonProperty("criteria.needCode")
    @JsonPropertyDescription("Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed")
    private String criteriaNeedCode;
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

    public SupportServiceDetailNeedAssignment100PutRequest withNdrfCode(String ndrfCode) {
        this.ndrfCode = ndrfCode;
        return this;
    }

    /**
     * Need Referral Code
     * <p>
     * Lineage reference object : SERDTND_NDRF_CODE, Lookup lineage reference object : stvndrf
     * 
     */
    @JsonProperty("criteria.ndrfCode")
    public String getCriteriaNdrfCode() {
        return criteriaNdrfCode;
    }

    /**
     * Need Referral Code
     * <p>
     * Lineage reference object : SERDTND_NDRF_CODE, Lookup lineage reference object : stvndrf
     * 
     */
    @JsonProperty("criteria.ndrfCode")
    public void setCriteriaNdrfCode(String criteriaNdrfCode) {
        this.criteriaNdrfCode = criteriaNdrfCode;
    }

    public SupportServiceDetailNeedAssignment100PutRequest withCriteriaNdrfCode(String criteriaNdrfCode) {
        this.criteriaNdrfCode = criteriaNdrfCode;
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

    public SupportServiceDetailNeedAssignment100PutRequest withNeedCode(String needCode) {
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

    public SupportServiceDetailNeedAssignment100PutRequest withSelfInd(String selfInd) {
        this.selfInd = selfInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("seadetlTermCodeEff")
    public Object getSeadetlTermCodeEff() {
        return seadetlTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("seadetlTermCodeEff")
    public void setSeadetlTermCodeEff(Object seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
    }

    public SupportServiceDetailNeedAssignment100PutRequest withSeadetlTermCodeEff(Object seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
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

    public SupportServiceDetailNeedAssignment100PutRequest withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("seadetlId")
    public Object getSeadetlId() {
        return seadetlId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("seadetlId")
    public void setSeadetlId(Object seadetlId) {
        this.seadetlId = seadetlId;
    }

    public SupportServiceDetailNeedAssignment100PutRequest withSeadetlId(Object seadetlId) {
        this.seadetlId = seadetlId;
        return this;
    }

    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("seadetlSsgpCode")
    public Object getSeadetlSsgpCode() {
        return seadetlSsgpCode;
    }

    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("seadetlSsgpCode")
    public void setSeadetlSsgpCode(Object seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
    }

    public SupportServiceDetailNeedAssignment100PutRequest withSeadetlSsgpCode(Object seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
        return this;
    }

    /**
     * Lineage reference object : SERDTND_SELF_IND
     * 
     */
    @JsonProperty("criteria.selfInd")
    public String getCriteriaSelfInd() {
        return criteriaSelfInd;
    }

    /**
     * Lineage reference object : SERDTND_SELF_IND
     * 
     */
    @JsonProperty("criteria.selfInd")
    public void setCriteriaSelfInd(String criteriaSelfInd) {
        this.criteriaSelfInd = criteriaSelfInd;
    }

    public SupportServiceDetailNeedAssignment100PutRequest withCriteriaSelfInd(String criteriaSelfInd) {
        this.criteriaSelfInd = criteriaSelfInd;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public String getCriteriaSsgpCode() {
        return criteriaSsgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTND_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("criteria.ssgpCode")
    public void setCriteriaSsgpCode(String criteriaSsgpCode) {
        this.criteriaSsgpCode = criteriaSsgpCode;
    }

    public SupportServiceDetailNeedAssignment100PutRequest withCriteriaSsgpCode(String criteriaSsgpCode) {
        this.criteriaSsgpCode = criteriaSsgpCode;
        return this;
    }

    /**
     * Need
     * <p>
     * Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed
     * (Required)
     * 
     */
    @JsonProperty("criteria.needCode")
    public String getCriteriaNeedCode() {
        return criteriaNeedCode;
    }

    /**
     * Need
     * <p>
     * Lineage reference object : SERDTND_NEED_CODE, Lookup lineage reference object : stvneed
     * (Required)
     * 
     */
    @JsonProperty("criteria.needCode")
    public void setCriteriaNeedCode(String criteriaNeedCode) {
        this.criteriaNeedCode = criteriaNeedCode;
    }

    public SupportServiceDetailNeedAssignment100PutRequest withCriteriaNeedCode(String criteriaNeedCode) {
        this.criteriaNeedCode = criteriaNeedCode;
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

    public SupportServiceDetailNeedAssignment100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupportServiceDetailNeedAssignment100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ndrfCode");
        sb.append('=');
        sb.append(((this.ndrfCode == null)?"<null>":this.ndrfCode));
        sb.append(',');
        sb.append("criteriaNdrfCode");
        sb.append('=');
        sb.append(((this.criteriaNdrfCode == null)?"<null>":this.criteriaNdrfCode));
        sb.append(',');
        sb.append("needCode");
        sb.append('=');
        sb.append(((this.needCode == null)?"<null>":this.needCode));
        sb.append(',');
        sb.append("selfInd");
        sb.append('=');
        sb.append(((this.selfInd == null)?"<null>":this.selfInd));
        sb.append(',');
        sb.append("seadetlTermCodeEff");
        sb.append('=');
        sb.append(((this.seadetlTermCodeEff == null)?"<null>":this.seadetlTermCodeEff));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("seadetlId");
        sb.append('=');
        sb.append(((this.seadetlId == null)?"<null>":this.seadetlId));
        sb.append(',');
        sb.append("seadetlSsgpCode");
        sb.append('=');
        sb.append(((this.seadetlSsgpCode == null)?"<null>":this.seadetlSsgpCode));
        sb.append(',');
        sb.append("criteriaSelfInd");
        sb.append('=');
        sb.append(((this.criteriaSelfInd == null)?"<null>":this.criteriaSelfInd));
        sb.append(',');
        sb.append("criteriaSsgpCode");
        sb.append('=');
        sb.append(((this.criteriaSsgpCode == null)?"<null>":this.criteriaSsgpCode));
        sb.append(',');
        sb.append("criteriaNeedCode");
        sb.append('=');
        sb.append(((this.criteriaNeedCode == null)?"<null>":this.criteriaNeedCode));
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
        result = ((result* 31)+((this.seadetlSsgpCode == null)? 0 :this.seadetlSsgpCode.hashCode()));
        result = ((result* 31)+((this.needCode == null)? 0 :this.needCode.hashCode()));
        result = ((result* 31)+((this.selfInd == null)? 0 :this.selfInd.hashCode()));
        result = ((result* 31)+((this.criteriaNdrfCode == null)? 0 :this.criteriaNdrfCode.hashCode()));
        result = ((result* 31)+((this.seadetlTermCodeEff == null)? 0 :this.seadetlTermCodeEff.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.seadetlId == null)? 0 :this.seadetlId.hashCode()));
        result = ((result* 31)+((this.criteriaSelfInd == null)? 0 :this.criteriaSelfInd.hashCode()));
        result = ((result* 31)+((this.criteriaNeedCode == null)? 0 :this.criteriaNeedCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSsgpCode == null)? 0 :this.criteriaSsgpCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupportServiceDetailNeedAssignment100PutRequest) == false) {
            return false;
        }
        SupportServiceDetailNeedAssignment100PutRequest rhs = ((SupportServiceDetailNeedAssignment100PutRequest) other);
        return (((((((((((((this.ndrfCode == rhs.ndrfCode)||((this.ndrfCode!= null)&&this.ndrfCode.equals(rhs.ndrfCode)))&&((this.seadetlSsgpCode == rhs.seadetlSsgpCode)||((this.seadetlSsgpCode!= null)&&this.seadetlSsgpCode.equals(rhs.seadetlSsgpCode))))&&((this.needCode == rhs.needCode)||((this.needCode!= null)&&this.needCode.equals(rhs.needCode))))&&((this.selfInd == rhs.selfInd)||((this.selfInd!= null)&&this.selfInd.equals(rhs.selfInd))))&&((this.criteriaNdrfCode == rhs.criteriaNdrfCode)||((this.criteriaNdrfCode!= null)&&this.criteriaNdrfCode.equals(rhs.criteriaNdrfCode))))&&((this.seadetlTermCodeEff == rhs.seadetlTermCodeEff)||((this.seadetlTermCodeEff!= null)&&this.seadetlTermCodeEff.equals(rhs.seadetlTermCodeEff))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.seadetlId == rhs.seadetlId)||((this.seadetlId!= null)&&this.seadetlId.equals(rhs.seadetlId))))&&((this.criteriaSelfInd == rhs.criteriaSelfInd)||((this.criteriaSelfInd!= null)&&this.criteriaSelfInd.equals(rhs.criteriaSelfInd))))&&((this.criteriaNeedCode == rhs.criteriaNeedCode)||((this.criteriaNeedCode!= null)&&this.criteriaNeedCode.equals(rhs.criteriaNeedCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSsgpCode == rhs.criteriaSsgpCode)||((this.criteriaSsgpCode!= null)&&this.criteriaSsgpCode.equals(rhs.criteriaSsgpCode))));
    }

}
