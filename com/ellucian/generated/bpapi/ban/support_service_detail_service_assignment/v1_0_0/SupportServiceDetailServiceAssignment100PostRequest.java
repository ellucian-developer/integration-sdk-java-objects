
package com.ellucian.generated.bpapi.ban.support_service_detail_service_assignment.v1_0_0;

import java.util.Date;
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
    "seprCode",
    "termCodeEff",
    "endDate",
    "sprvCode",
    "serdtsrSsgpCode",
    "sserCode",
    "ssepCode",
    "origCode",
    "beginDate",
    "ssgpCode",
    "id",
    "ssstCode",
    "ssrsCode"
})
@Generated("jsonschema2pojo")
public class SupportServiceDetailServiceAssignment100PostRequest {

    /**
     * Service Provided
     * <p>
     * Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr
     * 
     */
    @JsonProperty("seprCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr")
    private String seprCode;
    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm")
    private String termCodeEff;
    /**
     * End Date
     * <p>
     * Lineage reference object : SERDTSR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_END_DATE")
    private Date endDate;
    /**
     * Service Provider
     * <p>
     * Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv
     * 
     */
    @JsonProperty("sprvCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv")
    private String sprvCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("serdtsrSsgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String serdtsrSsgpCode;
    /**
     * Service
     * <p>
     * Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser
     * (Required)
     * 
     */
    @JsonProperty("sserCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser")
    private String sserCode;
    /**
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("ssepCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep")
    private String ssepCode;
    /**
     * Review
     * <p>
     * Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_BEGIN_DATE")
    private Date beginDate;
    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : seadetlId")
    private String id;
    /**
     * Status
     * <p>
     * Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst")
    private String ssstCode;
    /**
     * Result
     * <p>
     * Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs")
    private String ssrsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Service Provided
     * <p>
     * Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr
     * 
     */
    @JsonProperty("seprCode")
    public String getSeprCode() {
        return seprCode;
    }

    /**
     * Service Provided
     * <p>
     * Lineage reference object : SERDTSR_SEPR_CODE, Lookup lineage reference object : stvsepr
     * 
     */
    @JsonProperty("seprCode")
    public void setSeprCode(String seprCode) {
        this.seprCode = seprCode;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withSeprCode(String seprCode) {
        this.seprCode = seprCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : seadetlTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SERDTSR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SERDTSR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Service Provider
     * <p>
     * Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv
     * 
     */
    @JsonProperty("sprvCode")
    public String getSprvCode() {
        return sprvCode;
    }

    /**
     * Service Provider
     * <p>
     * Lineage reference object : SERDTSR_SPRV_CODE, Lookup lineage reference object : stvsprv
     * 
     */
    @JsonProperty("sprvCode")
    public void setSprvCode(String sprvCode) {
        this.sprvCode = sprvCode;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withSprvCode(String sprvCode) {
        this.sprvCode = sprvCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("serdtsrSsgpCode")
    public String getSerdtsrSsgpCode() {
        return serdtsrSsgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("serdtsrSsgpCode")
    public void setSerdtsrSsgpCode(String serdtsrSsgpCode) {
        this.serdtsrSsgpCode = serdtsrSsgpCode;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withSerdtsrSsgpCode(String serdtsrSsgpCode) {
        this.serdtsrSsgpCode = serdtsrSsgpCode;
        return this;
    }

    /**
     * Service
     * <p>
     * Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser
     * (Required)
     * 
     */
    @JsonProperty("sserCode")
    public String getSserCode() {
        return sserCode;
    }

    /**
     * Service
     * <p>
     * Lineage reference object : SERDTSR_SSER_CODE, Lookup lineage reference object : stvsser
     * (Required)
     * 
     */
    @JsonProperty("sserCode")
    public void setSserCode(String sserCode) {
        this.sserCode = sserCode;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withSserCode(String sserCode) {
        this.sserCode = sserCode;
        return this;
    }

    /**
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("ssepCode")
    public String getSsepCode() {
        return ssepCode;
    }

    /**
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("ssepCode")
    public void setSsepCode(String ssepCode) {
        this.ssepCode = ssepCode;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withSsepCode(String ssepCode) {
        this.ssepCode = ssepCode;
        return this;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTSR_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withOrigCode(String origCode) {
        this.origCode = origCode;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Service Group
     * <p>
     * Lineage reference object : seadetlSsgpCode, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : seadetlId
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public String getSsstCode() {
        return ssstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SERDTSR_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public void setSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
        return this;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    public String getSsrsCode() {
        return ssrsCode;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTSR_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    public void setSsrsCode(String ssrsCode) {
        this.ssrsCode = ssrsCode;
    }

    public SupportServiceDetailServiceAssignment100PostRequest withSsrsCode(String ssrsCode) {
        this.ssrsCode = ssrsCode;
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

    public SupportServiceDetailServiceAssignment100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupportServiceDetailServiceAssignment100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seprCode");
        sb.append('=');
        sb.append(((this.seprCode == null)?"<null>":this.seprCode));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("sprvCode");
        sb.append('=');
        sb.append(((this.sprvCode == null)?"<null>":this.sprvCode));
        sb.append(',');
        sb.append("serdtsrSsgpCode");
        sb.append('=');
        sb.append(((this.serdtsrSsgpCode == null)?"<null>":this.serdtsrSsgpCode));
        sb.append(',');
        sb.append("sserCode");
        sb.append('=');
        sb.append(((this.sserCode == null)?"<null>":this.sserCode));
        sb.append(',');
        sb.append("ssepCode");
        sb.append('=');
        sb.append(((this.ssepCode == null)?"<null>":this.ssepCode));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ssstCode");
        sb.append('=');
        sb.append(((this.ssstCode == null)?"<null>":this.ssstCode));
        sb.append(',');
        sb.append("ssrsCode");
        sb.append('=');
        sb.append(((this.ssrsCode == null)?"<null>":this.ssrsCode));
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
        result = ((result* 31)+((this.seprCode == null)? 0 :this.seprCode.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.sprvCode == null)? 0 :this.sprvCode.hashCode()));
        result = ((result* 31)+((this.serdtsrSsgpCode == null)? 0 :this.serdtsrSsgpCode.hashCode()));
        result = ((result* 31)+((this.sserCode == null)? 0 :this.sserCode.hashCode()));
        result = ((result* 31)+((this.ssepCode == null)? 0 :this.ssepCode.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssstCode == null)? 0 :this.ssstCode.hashCode()));
        result = ((result* 31)+((this.ssrsCode == null)? 0 :this.ssrsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupportServiceDetailServiceAssignment100PostRequest) == false) {
            return false;
        }
        SupportServiceDetailServiceAssignment100PostRequest rhs = ((SupportServiceDetailServiceAssignment100PostRequest) other);
        return (((((((((((((((this.seprCode == rhs.seprCode)||((this.seprCode!= null)&&this.seprCode.equals(rhs.seprCode)))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.sprvCode == rhs.sprvCode)||((this.sprvCode!= null)&&this.sprvCode.equals(rhs.sprvCode))))&&((this.serdtsrSsgpCode == rhs.serdtsrSsgpCode)||((this.serdtsrSsgpCode!= null)&&this.serdtsrSsgpCode.equals(rhs.serdtsrSsgpCode))))&&((this.sserCode == rhs.sserCode)||((this.sserCode!= null)&&this.sserCode.equals(rhs.sserCode))))&&((this.ssepCode == rhs.ssepCode)||((this.ssepCode!= null)&&this.ssepCode.equals(rhs.ssepCode))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))))&&((this.ssrsCode == rhs.ssrsCode)||((this.ssrsCode!= null)&&this.ssrsCode.equals(rhs.ssrsCode))));
    }

}
