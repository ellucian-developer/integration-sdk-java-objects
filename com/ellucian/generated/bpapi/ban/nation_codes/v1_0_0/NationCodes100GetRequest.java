
package com.ellucian.generated.bpapi.ban.nation_codes.v1_0_0;

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
    "lmsEquiv",
    "code",
    "scodCodeIso",
    "ssaReportingEquiv",
    "statscanCde",
    "activityDate",
    "nation",
    "ediEquiv",
    "sevisEquiv"
})
@Generated("jsonschema2pojo")
public class NationCodes100GetRequest {

    /**
     * LMS Equivalent
     * <p>
     * Lineage reference object : STVNATN_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    @JsonPropertyDescription("Lineage reference object : STVNATN_LMS_EQUIV")
    private String lmsEquiv;
    /**
     * Nation Code
     * <p>
     * Lineage reference object : STVNATN_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVNATN_CODE")
    private String code;
    /**
     * ISO Code
     * <p>
     * Lineage reference object : STVNATN_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    @JsonPropertyDescription("Lineage reference object : STVNATN_SCOD_CODE_ISO")
    private String scodCodeIso;
    /**
     * MMREF Code
     * <p>
     * Lineage reference object : STVNATN_SSA_REPORTING_EQUIV
     * 
     */
    @JsonProperty("ssaReportingEquiv")
    @JsonPropertyDescription("Lineage reference object : STVNATN_SSA_REPORTING_EQUIV")
    private String ssaReportingEquiv;
    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVNATN_STATSCAN_CDE
     * 
     */
    @JsonProperty("statscanCde")
    @JsonPropertyDescription("Lineage reference object : STVNATN_STATSCAN_CDE")
    private String statscanCde;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVNATN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVNATN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVNATN_NATION
     * (Required)
     * 
     */
    @JsonProperty("nation")
    @JsonPropertyDescription("Lineage reference object : STVNATN_NATION")
    private String nation;
    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVNATN_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    @JsonPropertyDescription("Lineage reference object : STVNATN_EDI_EQUIV")
    private String ediEquiv;
    /**
     * SEVIS Equivalent
     * <p>
     * Lineage reference object : STVNATN_SEVIS_EQUIV
     * 
     */
    @JsonProperty("sevisEquiv")
    @JsonPropertyDescription("Lineage reference object : STVNATN_SEVIS_EQUIV")
    private String sevisEquiv;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * LMS Equivalent
     * <p>
     * Lineage reference object : STVNATN_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    public String getLmsEquiv() {
        return lmsEquiv;
    }

    /**
     * LMS Equivalent
     * <p>
     * Lineage reference object : STVNATN_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    public void setLmsEquiv(String lmsEquiv) {
        this.lmsEquiv = lmsEquiv;
    }

    public NationCodes100GetRequest withLmsEquiv(String lmsEquiv) {
        this.lmsEquiv = lmsEquiv;
        return this;
    }

    /**
     * Nation Code
     * <p>
     * Lineage reference object : STVNATN_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Nation Code
     * <p>
     * Lineage reference object : STVNATN_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public NationCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * ISO Code
     * <p>
     * Lineage reference object : STVNATN_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public String getScodCodeIso() {
        return scodCodeIso;
    }

    /**
     * ISO Code
     * <p>
     * Lineage reference object : STVNATN_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public void setScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
    }

    public NationCodes100GetRequest withScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
        return this;
    }

    /**
     * MMREF Code
     * <p>
     * Lineage reference object : STVNATN_SSA_REPORTING_EQUIV
     * 
     */
    @JsonProperty("ssaReportingEquiv")
    public String getSsaReportingEquiv() {
        return ssaReportingEquiv;
    }

    /**
     * MMREF Code
     * <p>
     * Lineage reference object : STVNATN_SSA_REPORTING_EQUIV
     * 
     */
    @JsonProperty("ssaReportingEquiv")
    public void setSsaReportingEquiv(String ssaReportingEquiv) {
        this.ssaReportingEquiv = ssaReportingEquiv;
    }

    public NationCodes100GetRequest withSsaReportingEquiv(String ssaReportingEquiv) {
        this.ssaReportingEquiv = ssaReportingEquiv;
        return this;
    }

    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVNATN_STATSCAN_CDE
     * 
     */
    @JsonProperty("statscanCde")
    public String getStatscanCde() {
        return statscanCde;
    }

    /**
     * Canadian Statistics Code
     * <p>
     * Lineage reference object : STVNATN_STATSCAN_CDE
     * 
     */
    @JsonProperty("statscanCde")
    public void setStatscanCde(String statscanCde) {
        this.statscanCde = statscanCde;
    }

    public NationCodes100GetRequest withStatscanCde(String statscanCde) {
        this.statscanCde = statscanCde;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVNATN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVNATN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public NationCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVNATN_NATION
     * (Required)
     * 
     */
    @JsonProperty("nation")
    public String getNation() {
        return nation;
    }

    /**
     * Lineage reference object : STVNATN_NATION
     * (Required)
     * 
     */
    @JsonProperty("nation")
    public void setNation(String nation) {
        this.nation = nation;
    }

    public NationCodes100GetRequest withNation(String nation) {
        this.nation = nation;
        return this;
    }

    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVNATN_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public String getEdiEquiv() {
        return ediEquiv;
    }

    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVNATN_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public void setEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
    }

    public NationCodes100GetRequest withEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
        return this;
    }

    /**
     * SEVIS Equivalent
     * <p>
     * Lineage reference object : STVNATN_SEVIS_EQUIV
     * 
     */
    @JsonProperty("sevisEquiv")
    public String getSevisEquiv() {
        return sevisEquiv;
    }

    /**
     * SEVIS Equivalent
     * <p>
     * Lineage reference object : STVNATN_SEVIS_EQUIV
     * 
     */
    @JsonProperty("sevisEquiv")
    public void setSevisEquiv(String sevisEquiv) {
        this.sevisEquiv = sevisEquiv;
    }

    public NationCodes100GetRequest withSevisEquiv(String sevisEquiv) {
        this.sevisEquiv = sevisEquiv;
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

    public NationCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NationCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lmsEquiv");
        sb.append('=');
        sb.append(((this.lmsEquiv == null)?"<null>":this.lmsEquiv));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("scodCodeIso");
        sb.append('=');
        sb.append(((this.scodCodeIso == null)?"<null>":this.scodCodeIso));
        sb.append(',');
        sb.append("ssaReportingEquiv");
        sb.append('=');
        sb.append(((this.ssaReportingEquiv == null)?"<null>":this.ssaReportingEquiv));
        sb.append(',');
        sb.append("statscanCde");
        sb.append('=');
        sb.append(((this.statscanCde == null)?"<null>":this.statscanCde));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("nation");
        sb.append('=');
        sb.append(((this.nation == null)?"<null>":this.nation));
        sb.append(',');
        sb.append("ediEquiv");
        sb.append('=');
        sb.append(((this.ediEquiv == null)?"<null>":this.ediEquiv));
        sb.append(',');
        sb.append("sevisEquiv");
        sb.append('=');
        sb.append(((this.sevisEquiv == null)?"<null>":this.sevisEquiv));
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
        result = ((result* 31)+((this.lmsEquiv == null)? 0 :this.lmsEquiv.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.scodCodeIso == null)? 0 :this.scodCodeIso.hashCode()));
        result = ((result* 31)+((this.ssaReportingEquiv == null)? 0 :this.ssaReportingEquiv.hashCode()));
        result = ((result* 31)+((this.statscanCde == null)? 0 :this.statscanCde.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.nation == null)? 0 :this.nation.hashCode()));
        result = ((result* 31)+((this.ediEquiv == null)? 0 :this.ediEquiv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sevisEquiv == null)? 0 :this.sevisEquiv.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NationCodes100GetRequest) == false) {
            return false;
        }
        NationCodes100GetRequest rhs = ((NationCodes100GetRequest) other);
        return (((((((((((this.lmsEquiv == rhs.lmsEquiv)||((this.lmsEquiv!= null)&&this.lmsEquiv.equals(rhs.lmsEquiv)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.scodCodeIso == rhs.scodCodeIso)||((this.scodCodeIso!= null)&&this.scodCodeIso.equals(rhs.scodCodeIso))))&&((this.ssaReportingEquiv == rhs.ssaReportingEquiv)||((this.ssaReportingEquiv!= null)&&this.ssaReportingEquiv.equals(rhs.ssaReportingEquiv))))&&((this.statscanCde == rhs.statscanCde)||((this.statscanCde!= null)&&this.statscanCde.equals(rhs.statscanCde))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.nation == rhs.nation)||((this.nation!= null)&&this.nation.equals(rhs.nation))))&&((this.ediEquiv == rhs.ediEquiv)||((this.ediEquiv!= null)&&this.ediEquiv.equals(rhs.ediEquiv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sevisEquiv == rhs.sevisEquiv)||((this.sevisEquiv!= null)&&this.sevisEquiv.equals(rhs.sevisEquiv))));
    }

}
