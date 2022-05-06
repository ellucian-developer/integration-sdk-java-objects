
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
    "beginDate",
    "sserDescription",
    "endDate",
    "sprvCode",
    "ssgpCode",
    "sserCode",
    "endcopy",
    "ssstCode",
    "ssrsCode",
    "origCode",
    "ssepCode"
})
@Generated("jsonschema2pojo")
public class SupportServiceDetailServiceAssignment100PostResponse {

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
     * Begin Date
     * <p>
     * Lineage reference object : SERDTSR_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_BEGIN_DATE")
    private Date beginDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sserDescription")
    private String sserDescription;
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
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
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
    @JsonProperty("endcopy")
    private String endcopy;
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
     * Exempt
     * <p>
     * Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep
     * 
     */
    @JsonProperty("ssepCode")
    @JsonPropertyDescription("Lineage reference object : SERDTSR_SSEP_CODE, Lookup lineage reference object : stvssep")
    private String ssepCode;
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

    public SupportServiceDetailServiceAssignment100PostResponse withSeprCode(String seprCode) {
        this.seprCode = seprCode;
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

    public SupportServiceDetailServiceAssignment100PostResponse withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sserDescription")
    public String getSserDescription() {
        return sserDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sserDescription")
    public void setSserDescription(String sserDescription) {
        this.sserDescription = sserDescription;
    }

    public SupportServiceDetailServiceAssignment100PostResponse withSserDescription(String sserDescription) {
        this.sserDescription = sserDescription;
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

    public SupportServiceDetailServiceAssignment100PostResponse withEndDate(Date endDate) {
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

    public SupportServiceDetailServiceAssignment100PostResponse withSprvCode(String sprvCode) {
        this.sprvCode = sprvCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTSR_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public SupportServiceDetailServiceAssignment100PostResponse withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
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

    public SupportServiceDetailServiceAssignment100PostResponse withSserCode(String sserCode) {
        this.sserCode = sserCode;
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

    public SupportServiceDetailServiceAssignment100PostResponse withEndcopy(String endcopy) {
        this.endcopy = endcopy;
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

    public SupportServiceDetailServiceAssignment100PostResponse withSsstCode(String ssstCode) {
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

    public SupportServiceDetailServiceAssignment100PostResponse withSsrsCode(String ssrsCode) {
        this.ssrsCode = ssrsCode;
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

    public SupportServiceDetailServiceAssignment100PostResponse withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public SupportServiceDetailServiceAssignment100PostResponse withSsepCode(String ssepCode) {
        this.ssepCode = ssepCode;
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

    public SupportServiceDetailServiceAssignment100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupportServiceDetailServiceAssignment100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seprCode");
        sb.append('=');
        sb.append(((this.seprCode == null)?"<null>":this.seprCode));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("sserDescription");
        sb.append('=');
        sb.append(((this.sserDescription == null)?"<null>":this.sserDescription));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("sprvCode");
        sb.append('=');
        sb.append(((this.sprvCode == null)?"<null>":this.sprvCode));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("sserCode");
        sb.append('=');
        sb.append(((this.sserCode == null)?"<null>":this.sserCode));
        sb.append(',');
        sb.append("endcopy");
        sb.append('=');
        sb.append(((this.endcopy == null)?"<null>":this.endcopy));
        sb.append(',');
        sb.append("ssstCode");
        sb.append('=');
        sb.append(((this.ssstCode == null)?"<null>":this.ssstCode));
        sb.append(',');
        sb.append("ssrsCode");
        sb.append('=');
        sb.append(((this.ssrsCode == null)?"<null>":this.ssrsCode));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
        sb.append(',');
        sb.append("ssepCode");
        sb.append('=');
        sb.append(((this.ssepCode == null)?"<null>":this.ssepCode));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.sprvCode == null)? 0 :this.sprvCode.hashCode()));
        result = ((result* 31)+((this.sserCode == null)? 0 :this.sserCode.hashCode()));
        result = ((result* 31)+((this.endcopy == null)? 0 :this.endcopy.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.ssepCode == null)? 0 :this.ssepCode.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.sserDescription == null)? 0 :this.sserDescription.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
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
        if ((other instanceof SupportServiceDetailServiceAssignment100PostResponse) == false) {
            return false;
        }
        SupportServiceDetailServiceAssignment100PostResponse rhs = ((SupportServiceDetailServiceAssignment100PostResponse) other);
        return ((((((((((((((this.seprCode == rhs.seprCode)||((this.seprCode!= null)&&this.seprCode.equals(rhs.seprCode)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.sprvCode == rhs.sprvCode)||((this.sprvCode!= null)&&this.sprvCode.equals(rhs.sprvCode))))&&((this.sserCode == rhs.sserCode)||((this.sserCode!= null)&&this.sserCode.equals(rhs.sserCode))))&&((this.endcopy == rhs.endcopy)||((this.endcopy!= null)&&this.endcopy.equals(rhs.endcopy))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.ssepCode == rhs.ssepCode)||((this.ssepCode!= null)&&this.ssepCode.equals(rhs.ssepCode))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.sserDescription == rhs.sserDescription)||((this.sserDescription!= null)&&this.sserDescription.equals(rhs.sserDescription))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))))&&((this.ssrsCode == rhs.ssrsCode)||((this.ssrsCode!= null)&&this.ssrsCode.equals(rhs.ssrsCode))));
    }

}
