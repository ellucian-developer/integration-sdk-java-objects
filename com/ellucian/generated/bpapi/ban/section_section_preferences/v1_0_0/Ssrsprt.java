
package com.ellucian.generated.bpapi.ban.section_section_preferences.v1_0_0;

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
    "parsCode",
    "activityDate",
    "sprtParsDesc",
    "parsPrefNumber"
})
@Generated("jsonschema2pojo")
public class Ssrsprt {

    /**
     * Code
     * <p>
     * Lineage reference object : SSRSPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    @JsonPropertyDescription("Lineage reference object : SSRSPRT_PARS_CODE, Lookup lineage reference object : gtvpars")
    private String parsCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRSPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRSPRT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sprtParsDesc")
    private String sprtParsDesc;
    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRSPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    @JsonPropertyDescription("Lineage reference object : SSRSPRT_PARS_PREF_NUMBER")
    private Double parsPrefNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : SSRSPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    public String getParsCode() {
        return parsCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRSPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    public void setParsCode(String parsCode) {
        this.parsCode = parsCode;
    }

    public Ssrsprt withParsCode(String parsCode) {
        this.parsCode = parsCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRSPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRSPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssrsprt withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sprtParsDesc")
    public String getSprtParsDesc() {
        return sprtParsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sprtParsDesc")
    public void setSprtParsDesc(String sprtParsDesc) {
        this.sprtParsDesc = sprtParsDesc;
    }

    public Ssrsprt withSprtParsDesc(String sprtParsDesc) {
        this.sprtParsDesc = sprtParsDesc;
        return this;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRSPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    public Double getParsPrefNumber() {
        return parsPrefNumber;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRSPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    public void setParsPrefNumber(Double parsPrefNumber) {
        this.parsPrefNumber = parsPrefNumber;
    }

    public Ssrsprt withParsPrefNumber(Double parsPrefNumber) {
        this.parsPrefNumber = parsPrefNumber;
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

    public Ssrsprt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrsprt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parsCode");
        sb.append('=');
        sb.append(((this.parsCode == null)?"<null>":this.parsCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("sprtParsDesc");
        sb.append('=');
        sb.append(((this.sprtParsDesc == null)?"<null>":this.sprtParsDesc));
        sb.append(',');
        sb.append("parsPrefNumber");
        sb.append('=');
        sb.append(((this.parsPrefNumber == null)?"<null>":this.parsPrefNumber));
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
        result = ((result* 31)+((this.sprtParsDesc == null)? 0 :this.sprtParsDesc.hashCode()));
        result = ((result* 31)+((this.parsCode == null)? 0 :this.parsCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.parsPrefNumber == null)? 0 :this.parsPrefNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrsprt) == false) {
            return false;
        }
        Ssrsprt rhs = ((Ssrsprt) other);
        return ((((((this.sprtParsDesc == rhs.sprtParsDesc)||((this.sprtParsDesc!= null)&&this.sprtParsDesc.equals(rhs.sprtParsDesc)))&&((this.parsCode == rhs.parsCode)||((this.parsCode!= null)&&this.parsCode.equals(rhs.parsCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.parsPrefNumber == rhs.parsPrefNumber)||((this.parsPrefNumber!= null)&&this.parsPrefNumber.equals(rhs.parsPrefNumber))));
    }

}
