
package com.ellucian.generated.bpapi.ban.ethnic_codes.v1_0_0;

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
    "etctCode",
    "activityDate",
    "code",
    "ediEquiv",
    "ethnCde",
    "raceCde",
    "desc"
})
@Generated("jsonschema2pojo")
public class EthnicCodes100GetRequest {

    /**
     * LMS Equivalent
     * <p>
     * Lineage reference object : STVETHN_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    @JsonPropertyDescription("Lineage reference object : STVETHN_LMS_EQUIV")
    private String lmsEquiv;
    /**
     * IPEDS Code
     * <p>
     * Lineage reference object : STVETHN_ETCT_CODE, Lookup lineage reference object : stvetct
     * 
     */
    @JsonProperty("etctCode")
    @JsonPropertyDescription("Lineage reference object : STVETHN_ETCT_CODE, Lookup lineage reference object : stvetct")
    private String etctCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVETHN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVETHN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Ethnic Code
     * <p>
     * Lineage reference object : STVETHN_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVETHN_CODE")
    private String code;
    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVETHN_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    @JsonPropertyDescription("Lineage reference object : STVETHN_EDI_EQUIV")
    private String ediEquiv;
    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : STVETHN_ETHN_CDE
     * 
     */
    @JsonProperty("ethnCde")
    @JsonPropertyDescription("Lineage reference object : STVETHN_ETHN_CDE")
    private String ethnCde;
    /**
     * Institution Race Code
     * <p>
     * Lineage reference object : STVETHN_RACE_CDE, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("raceCde")
    @JsonPropertyDescription("Lineage reference object : STVETHN_RACE_CDE, Lookup lineage reference object : gorrace")
    private String raceCde;
    /**
     * Description
     * <p>
     * Lineage reference object : STVETHN_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVETHN_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * LMS Equivalent
     * <p>
     * Lineage reference object : STVETHN_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    public String getLmsEquiv() {
        return lmsEquiv;
    }

    /**
     * LMS Equivalent
     * <p>
     * Lineage reference object : STVETHN_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    public void setLmsEquiv(String lmsEquiv) {
        this.lmsEquiv = lmsEquiv;
    }

    public EthnicCodes100GetRequest withLmsEquiv(String lmsEquiv) {
        this.lmsEquiv = lmsEquiv;
        return this;
    }

    /**
     * IPEDS Code
     * <p>
     * Lineage reference object : STVETHN_ETCT_CODE, Lookup lineage reference object : stvetct
     * 
     */
    @JsonProperty("etctCode")
    public String getEtctCode() {
        return etctCode;
    }

    /**
     * IPEDS Code
     * <p>
     * Lineage reference object : STVETHN_ETCT_CODE, Lookup lineage reference object : stvetct
     * 
     */
    @JsonProperty("etctCode")
    public void setEtctCode(String etctCode) {
        this.etctCode = etctCode;
    }

    public EthnicCodes100GetRequest withEtctCode(String etctCode) {
        this.etctCode = etctCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVETHN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVETHN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EthnicCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Ethnic Code
     * <p>
     * Lineage reference object : STVETHN_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Ethnic Code
     * <p>
     * Lineage reference object : STVETHN_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EthnicCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVETHN_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public String getEdiEquiv() {
        return ediEquiv;
    }

    /**
     * EDI Equivalent
     * <p>
     * Lineage reference object : STVETHN_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public void setEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
    }

    public EthnicCodes100GetRequest withEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
        return this;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : STVETHN_ETHN_CDE
     * 
     */
    @JsonProperty("ethnCde")
    public String getEthnCde() {
        return ethnCde;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : STVETHN_ETHN_CDE
     * 
     */
    @JsonProperty("ethnCde")
    public void setEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
    }

    public EthnicCodes100GetRequest withEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
        return this;
    }

    /**
     * Institution Race Code
     * <p>
     * Lineage reference object : STVETHN_RACE_CDE, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("raceCde")
    public String getRaceCde() {
        return raceCde;
    }

    /**
     * Institution Race Code
     * <p>
     * Lineage reference object : STVETHN_RACE_CDE, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("raceCde")
    public void setRaceCde(String raceCde) {
        this.raceCde = raceCde;
    }

    public EthnicCodes100GetRequest withRaceCde(String raceCde) {
        this.raceCde = raceCde;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVETHN_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVETHN_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EthnicCodes100GetRequest withDesc(String desc) {
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

    public EthnicCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EthnicCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lmsEquiv");
        sb.append('=');
        sb.append(((this.lmsEquiv == null)?"<null>":this.lmsEquiv));
        sb.append(',');
        sb.append("etctCode");
        sb.append('=');
        sb.append(((this.etctCode == null)?"<null>":this.etctCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("ediEquiv");
        sb.append('=');
        sb.append(((this.ediEquiv == null)?"<null>":this.ediEquiv));
        sb.append(',');
        sb.append("ethnCde");
        sb.append('=');
        sb.append(((this.ethnCde == null)?"<null>":this.ethnCde));
        sb.append(',');
        sb.append("raceCde");
        sb.append('=');
        sb.append(((this.raceCde == null)?"<null>":this.raceCde));
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
        result = ((result* 31)+((this.lmsEquiv == null)? 0 :this.lmsEquiv.hashCode()));
        result = ((result* 31)+((this.etctCode == null)? 0 :this.etctCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.ediEquiv == null)? 0 :this.ediEquiv.hashCode()));
        result = ((result* 31)+((this.ethnCde == null)? 0 :this.ethnCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.raceCde == null)? 0 :this.raceCde.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EthnicCodes100GetRequest) == false) {
            return false;
        }
        EthnicCodes100GetRequest rhs = ((EthnicCodes100GetRequest) other);
        return ((((((((((this.lmsEquiv == rhs.lmsEquiv)||((this.lmsEquiv!= null)&&this.lmsEquiv.equals(rhs.lmsEquiv)))&&((this.etctCode == rhs.etctCode)||((this.etctCode!= null)&&this.etctCode.equals(rhs.etctCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.ediEquiv == rhs.ediEquiv)||((this.ediEquiv!= null)&&this.ediEquiv.equals(rhs.ediEquiv))))&&((this.ethnCde == rhs.ethnCde)||((this.ethnCde!= null)&&this.ethnCde.equals(rhs.ethnCde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.raceCde == rhs.raceCde)||((this.raceCde!= null)&&this.raceCde.equals(rhs.raceCde))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
