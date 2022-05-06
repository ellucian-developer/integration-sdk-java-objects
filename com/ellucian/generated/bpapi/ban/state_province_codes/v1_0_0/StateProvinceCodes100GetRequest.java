
package com.ellucian.generated.bpapi.ban.state_province_codes.v1_0_0;

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
    "ipedsCde",
    "code",
    "scodCodeIso",
    "statscanCde",
    "activityDate",
    "ediEquiv",
    "desc"
})
@Generated("jsonschema2pojo")
public class StateProvinceCodes100GetRequest {

    /**
     * IPEDS State Code
     * <p>
     * Lineage reference object : STVSTAT_IPEDS_CDE
     * 
     */
    @JsonProperty("ipedsCde")
    @JsonPropertyDescription("Lineage reference object : STVSTAT_IPEDS_CDE")
    private String ipedsCde;
    /**
     * Code
     * <p>
     * Lineage reference object : STVSTAT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVSTAT_CODE")
    private String code;
    /**
     * ISO Code
     * <p>
     * Lineage reference object : STVSTAT_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    @JsonPropertyDescription("Lineage reference object : STVSTAT_SCOD_CODE_ISO")
    private String scodCodeIso;
    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVSTAT_STATSCAN_CDE
     * 
     */
    @JsonProperty("statscanCde")
    @JsonPropertyDescription("Lineage reference object : STVSTAT_STATSCAN_CDE")
    private String statscanCde;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSTAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVSTAT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVSTAT_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    @JsonPropertyDescription("Lineage reference object : STVSTAT_EDI_EQUIV")
    private String ediEquiv;
    /**
     * Code Description
     * <p>
     * Lineage reference object : STVSTAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVSTAT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * IPEDS State Code
     * <p>
     * Lineage reference object : STVSTAT_IPEDS_CDE
     * 
     */
    @JsonProperty("ipedsCde")
    public String getIpedsCde() {
        return ipedsCde;
    }

    /**
     * IPEDS State Code
     * <p>
     * Lineage reference object : STVSTAT_IPEDS_CDE
     * 
     */
    @JsonProperty("ipedsCde")
    public void setIpedsCde(String ipedsCde) {
        this.ipedsCde = ipedsCde;
    }

    public StateProvinceCodes100GetRequest withIpedsCde(String ipedsCde) {
        this.ipedsCde = ipedsCde;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVSTAT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVSTAT_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public StateProvinceCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * ISO Code
     * <p>
     * Lineage reference object : STVSTAT_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public String getScodCodeIso() {
        return scodCodeIso;
    }

    /**
     * ISO Code
     * <p>
     * Lineage reference object : STVSTAT_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public void setScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
    }

    public StateProvinceCodes100GetRequest withScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
        return this;
    }

    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVSTAT_STATSCAN_CDE
     * 
     */
    @JsonProperty("statscanCde")
    public String getStatscanCde() {
        return statscanCde;
    }

    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVSTAT_STATSCAN_CDE
     * 
     */
    @JsonProperty("statscanCde")
    public void setStatscanCde(String statscanCde) {
        this.statscanCde = statscanCde;
    }

    public StateProvinceCodes100GetRequest withStatscanCde(String statscanCde) {
        this.statscanCde = statscanCde;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSTAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVSTAT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public StateProvinceCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVSTAT_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public String getEdiEquiv() {
        return ediEquiv;
    }

    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVSTAT_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public void setEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
    }

    public StateProvinceCodes100GetRequest withEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
        return this;
    }

    /**
     * Code Description
     * <p>
     * Lineage reference object : STVSTAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Code Description
     * <p>
     * Lineage reference object : STVSTAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StateProvinceCodes100GetRequest withDesc(String desc) {
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

    public StateProvinceCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StateProvinceCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ipedsCde");
        sb.append('=');
        sb.append(((this.ipedsCde == null)?"<null>":this.ipedsCde));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("scodCodeIso");
        sb.append('=');
        sb.append(((this.scodCodeIso == null)?"<null>":this.scodCodeIso));
        sb.append(',');
        sb.append("statscanCde");
        sb.append('=');
        sb.append(((this.statscanCde == null)?"<null>":this.statscanCde));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ediEquiv");
        sb.append('=');
        sb.append(((this.ediEquiv == null)?"<null>":this.ediEquiv));
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
        result = ((result* 31)+((this.ipedsCde == null)? 0 :this.ipedsCde.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.scodCodeIso == null)? 0 :this.scodCodeIso.hashCode()));
        result = ((result* 31)+((this.statscanCde == null)? 0 :this.statscanCde.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ediEquiv == null)? 0 :this.ediEquiv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StateProvinceCodes100GetRequest) == false) {
            return false;
        }
        StateProvinceCodes100GetRequest rhs = ((StateProvinceCodes100GetRequest) other);
        return (((((((((this.ipedsCde == rhs.ipedsCde)||((this.ipedsCde!= null)&&this.ipedsCde.equals(rhs.ipedsCde)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.scodCodeIso == rhs.scodCodeIso)||((this.scodCodeIso!= null)&&this.scodCodeIso.equals(rhs.scodCodeIso))))&&((this.statscanCde == rhs.statscanCde)||((this.statscanCde!= null)&&this.statscanCde.equals(rhs.statscanCde))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ediEquiv == rhs.ediEquiv)||((this.ediEquiv!= null)&&this.ediEquiv.equals(rhs.ediEquiv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
