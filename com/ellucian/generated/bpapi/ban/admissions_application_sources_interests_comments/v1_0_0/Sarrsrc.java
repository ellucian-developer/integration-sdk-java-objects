
package com.ellucian.generated.bpapi.ban.admissions_application_sources_interests_comments.v1_0_0;

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
    "stvsbgiDesc",
    "primarySrceInd",
    "sbgiCode"
})
@Generated("jsonschema2pojo")
public class Sarrsrc {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARRSRC_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SARRSRC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvsbgiDesc")
    private String stvsbgiDesc;
    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("primarySrceInd")
    @JsonPropertyDescription("Lineage reference object : SARRSRC_PRIMARY_SRCE_IND")
    private String primarySrceInd;
    /**
     * Background Institution
     * <p>
     * Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String sbgiCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARRSRC_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SARRSRC_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sarrsrc withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvsbgiDesc")
    public String getStvsbgiDesc() {
        return stvsbgiDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvsbgiDesc")
    public void setStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
    }

    public Sarrsrc withStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
        return this;
    }

    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("primarySrceInd")
    public String getPrimarySrceInd() {
        return primarySrceInd;
    }

    /**
     * Lineage reference object : SARRSRC_PRIMARY_SRCE_IND
     * 
     */
    @JsonProperty("primarySrceInd")
    public void setPrimarySrceInd(String primarySrceInd) {
        this.primarySrceInd = primarySrceInd;
    }

    public Sarrsrc withPrimarySrceInd(String primarySrceInd) {
        this.primarySrceInd = primarySrceInd;
        return this;
    }

    /**
     * Background Institution
     * <p>
     * Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Background Institution
     * <p>
     * Lineage reference object : SARRSRC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public Sarrsrc withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
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

    public Sarrsrc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sarrsrc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("stvsbgiDesc");
        sb.append('=');
        sb.append(((this.stvsbgiDesc == null)?"<null>":this.stvsbgiDesc));
        sb.append(',');
        sb.append("primarySrceInd");
        sb.append('=');
        sb.append(((this.primarySrceInd == null)?"<null>":this.primarySrceInd));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
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
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvsbgiDesc == null)? 0 :this.stvsbgiDesc.hashCode()));
        result = ((result* 31)+((this.primarySrceInd == null)? 0 :this.primarySrceInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sarrsrc) == false) {
            return false;
        }
        Sarrsrc rhs = ((Sarrsrc) other);
        return ((((((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvsbgiDesc == rhs.stvsbgiDesc)||((this.stvsbgiDesc!= null)&&this.stvsbgiDesc.equals(rhs.stvsbgiDesc))))&&((this.primarySrceInd == rhs.primarySrceInd)||((this.primarySrceInd!= null)&&this.primarySrceInd.equals(rhs.primarySrceInd))));
    }

}
