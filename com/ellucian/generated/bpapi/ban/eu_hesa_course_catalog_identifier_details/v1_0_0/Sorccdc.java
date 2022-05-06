
package com.ellucian.generated.bpapi.ban.eu_hesa_course_catalog_identifier_details.v1_0_0;

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
    "costCentreProportion",
    "ssdtCodeCostCentreSt",
    "ssdtCodeCostCentre",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sorccdc {

    /**
     * Lineage reference object : SORCCDC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORCCDC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORCCDC_COST_CENTRE_PROPORTION
     * 
     */
    @JsonProperty("costCentreProportion")
    @JsonPropertyDescription("Lineage reference object : SORCCDC_COST_CENTRE_PROPORTION")
    private Double costCentreProportion;
    @JsonProperty("ssdtCodeCostCentreSt")
    private String ssdtCodeCostCentreSt;
    /**
     * Lineage reference object : SORCCDC_SSDT_CODE_COST_CENTRE
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeCostCentre")
    @JsonPropertyDescription("Lineage reference object : SORCCDC_SSDT_CODE_COST_CENTRE")
    private String ssdtCodeCostCentre;
    /**
     * Lineage reference object : SORCCDC_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORCCDC_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORCCDC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORCCDC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorccdc withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORCCDC_COST_CENTRE_PROPORTION
     * 
     */
    @JsonProperty("costCentreProportion")
    public Double getCostCentreProportion() {
        return costCentreProportion;
    }

    /**
     * Lineage reference object : SORCCDC_COST_CENTRE_PROPORTION
     * 
     */
    @JsonProperty("costCentreProportion")
    public void setCostCentreProportion(Double costCentreProportion) {
        this.costCentreProportion = costCentreProportion;
    }

    public Sorccdc withCostCentreProportion(Double costCentreProportion) {
        this.costCentreProportion = costCentreProportion;
        return this;
    }

    @JsonProperty("ssdtCodeCostCentreSt")
    public String getSsdtCodeCostCentreSt() {
        return ssdtCodeCostCentreSt;
    }

    @JsonProperty("ssdtCodeCostCentreSt")
    public void setSsdtCodeCostCentreSt(String ssdtCodeCostCentreSt) {
        this.ssdtCodeCostCentreSt = ssdtCodeCostCentreSt;
    }

    public Sorccdc withSsdtCodeCostCentreSt(String ssdtCodeCostCentreSt) {
        this.ssdtCodeCostCentreSt = ssdtCodeCostCentreSt;
        return this;
    }

    /**
     * Lineage reference object : SORCCDC_SSDT_CODE_COST_CENTRE
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeCostCentre")
    public String getSsdtCodeCostCentre() {
        return ssdtCodeCostCentre;
    }

    /**
     * Lineage reference object : SORCCDC_SSDT_CODE_COST_CENTRE
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeCostCentre")
    public void setSsdtCodeCostCentre(String ssdtCodeCostCentre) {
        this.ssdtCodeCostCentre = ssdtCodeCostCentre;
    }

    public Sorccdc withSsdtCodeCostCentre(String ssdtCodeCostCentre) {
        this.ssdtCodeCostCentre = ssdtCodeCostCentre;
        return this;
    }

    /**
     * Lineage reference object : SORCCDC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORCCDC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorccdc withUserId(String userId) {
        this.userId = userId;
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

    public Sorccdc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorccdc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("costCentreProportion");
        sb.append('=');
        sb.append(((this.costCentreProportion == null)?"<null>":this.costCentreProportion));
        sb.append(',');
        sb.append("ssdtCodeCostCentreSt");
        sb.append('=');
        sb.append(((this.ssdtCodeCostCentreSt == null)?"<null>":this.ssdtCodeCostCentreSt));
        sb.append(',');
        sb.append("ssdtCodeCostCentre");
        sb.append('=');
        sb.append(((this.ssdtCodeCostCentre == null)?"<null>":this.ssdtCodeCostCentre));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.costCentreProportion == null)? 0 :this.costCentreProportion.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCostCentreSt == null)? 0 :this.ssdtCodeCostCentreSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeCostCentre == null)? 0 :this.ssdtCodeCostCentre.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorccdc) == false) {
            return false;
        }
        Sorccdc rhs = ((Sorccdc) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.costCentreProportion == rhs.costCentreProportion)||((this.costCentreProportion!= null)&&this.costCentreProportion.equals(rhs.costCentreProportion))))&&((this.ssdtCodeCostCentreSt == rhs.ssdtCodeCostCentreSt)||((this.ssdtCodeCostCentreSt!= null)&&this.ssdtCodeCostCentreSt.equals(rhs.ssdtCodeCostCentreSt))))&&((this.ssdtCodeCostCentre == rhs.ssdtCodeCostCentre)||((this.ssdtCodeCostCentre!= null)&&this.ssdtCodeCostCentre.equals(rhs.ssdtCodeCostCentre))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
