
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
    "parsCode",
    "activityDate",
    "mprtParsDesc",
    "parsPrefNumber"
})
@Generated("jsonschema2pojo")
public class Ssrmprt__1 {

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    @JsonPropertyDescription("Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars")
    private String parsCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRMPRT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("mprtParsDesc")
    private String mprtParsDesc;
    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    @JsonPropertyDescription("Lineage reference object : SSRMPRT_PARS_PREF_NUMBER")
    private Double parsPrefNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    public String getParsCode() {
        return parsCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SSRMPRT_PARS_CODE, Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("parsCode")
    public void setParsCode(String parsCode) {
        this.parsCode = parsCode;
    }

    public Ssrmprt__1 withParsCode(String parsCode) {
        this.parsCode = parsCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRMPRT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssrmprt__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("mprtParsDesc")
    public String getMprtParsDesc() {
        return mprtParsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("mprtParsDesc")
    public void setMprtParsDesc(String mprtParsDesc) {
        this.mprtParsDesc = mprtParsDesc;
    }

    public Ssrmprt__1 withMprtParsDesc(String mprtParsDesc) {
        this.mprtParsDesc = mprtParsDesc;
        return this;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    public Double getParsPrefNumber() {
        return parsPrefNumber;
    }

    /**
     * Preference Number
     * <p>
     * Lineage reference object : SSRMPRT_PARS_PREF_NUMBER
     * 
     */
    @JsonProperty("parsPrefNumber")
    public void setParsPrefNumber(Double parsPrefNumber) {
        this.parsPrefNumber = parsPrefNumber;
    }

    public Ssrmprt__1 withParsPrefNumber(Double parsPrefNumber) {
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

    public Ssrmprt__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrmprt__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parsCode");
        sb.append('=');
        sb.append(((this.parsCode == null)?"<null>":this.parsCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("mprtParsDesc");
        sb.append('=');
        sb.append(((this.mprtParsDesc == null)?"<null>":this.mprtParsDesc));
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
        result = ((result* 31)+((this.mprtParsDesc == null)? 0 :this.mprtParsDesc.hashCode()));
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
        if ((other instanceof Ssrmprt__1) == false) {
            return false;
        }
        Ssrmprt__1 rhs = ((Ssrmprt__1) other);
        return ((((((this.mprtParsDesc == rhs.mprtParsDesc)||((this.mprtParsDesc!= null)&&this.mprtParsDesc.equals(rhs.mprtParsDesc)))&&((this.parsCode == rhs.parsCode)||((this.parsCode!= null)&&this.parsCode.equals(rhs.parsCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.parsPrefNumber == rhs.parsPrefNumber)||((this.parsPrefNumber!= null)&&this.parsPrefNumber.equals(rhs.parsPrefNumber))));
    }

}
