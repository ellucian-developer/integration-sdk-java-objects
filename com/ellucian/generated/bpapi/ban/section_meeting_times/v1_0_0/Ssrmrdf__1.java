
package com.ellucian.generated.bpapi.ban.section_meeting_times.v1_0_0;

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
    "activityDate",
    "rdefPrefNumber",
    "rdefCode",
    "mrdfRdefDesc"
})
@Generated("jsonschema2pojo")
public class Ssrmrdf__1 {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMRDF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRMRDF_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER
     * 
     */
    @JsonProperty("rdefPrefNumber")
    @JsonPropertyDescription("Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER")
    private Double rdefPrefNumber;
    /**
     * Code
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("rdefCode")
    @JsonPropertyDescription("Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef")
    private String rdefCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("mrdfRdefDesc")
    private String mrdfRdefDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMRDF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMRDF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssrmrdf__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER
     * 
     */
    @JsonProperty("rdefPrefNumber")
    public Double getRdefPrefNumber() {
        return rdefPrefNumber;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_PREF_NUMBER
     * 
     */
    @JsonProperty("rdefPrefNumber")
    public void setRdefPrefNumber(Double rdefPrefNumber) {
        this.rdefPrefNumber = rdefPrefNumber;
    }

    public Ssrmrdf__1 withRdefPrefNumber(Double rdefPrefNumber) {
        this.rdefPrefNumber = rdefPrefNumber;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("rdefCode")
    public String getRdefCode() {
        return rdefCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMRDF_RDEF_CODE, Lookup lineage reference object : stvrdef
     * 
     */
    @JsonProperty("rdefCode")
    public void setRdefCode(String rdefCode) {
        this.rdefCode = rdefCode;
    }

    public Ssrmrdf__1 withRdefCode(String rdefCode) {
        this.rdefCode = rdefCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("mrdfRdefDesc")
    public String getMrdfRdefDesc() {
        return mrdfRdefDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("mrdfRdefDesc")
    public void setMrdfRdefDesc(String mrdfRdefDesc) {
        this.mrdfRdefDesc = mrdfRdefDesc;
    }

    public Ssrmrdf__1 withMrdfRdefDesc(String mrdfRdefDesc) {
        this.mrdfRdefDesc = mrdfRdefDesc;
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

    public Ssrmrdf__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrmrdf__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("rdefPrefNumber");
        sb.append('=');
        sb.append(((this.rdefPrefNumber == null)?"<null>":this.rdefPrefNumber));
        sb.append(',');
        sb.append("rdefCode");
        sb.append('=');
        sb.append(((this.rdefCode == null)?"<null>":this.rdefCode));
        sb.append(',');
        sb.append("mrdfRdefDesc");
        sb.append('=');
        sb.append(((this.mrdfRdefDesc == null)?"<null>":this.mrdfRdefDesc));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.rdefPrefNumber == null)? 0 :this.rdefPrefNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rdefCode == null)? 0 :this.rdefCode.hashCode()));
        result = ((result* 31)+((this.mrdfRdefDesc == null)? 0 :this.mrdfRdefDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrmrdf__1) == false) {
            return false;
        }
        Ssrmrdf__1 rhs = ((Ssrmrdf__1) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.rdefPrefNumber == rhs.rdefPrefNumber)||((this.rdefPrefNumber!= null)&&this.rdefPrefNumber.equals(rhs.rdefPrefNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rdefCode == rhs.rdefCode)||((this.rdefCode!= null)&&this.rdefCode.equals(rhs.rdefCode))))&&((this.mrdfRdefDesc == rhs.mrdfRdefDesc)||((this.mrdfRdefDesc!= null)&&this.mrdfRdefDesc.equals(rhs.mrdfRdefDesc))));
    }

}
