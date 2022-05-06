
package com.ellucian.generated.bpapi.ban.catalog_prerequisite_and_test_score_restrictions.v1_0_0;

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
    "area",
    "activityDate",
    "areaDesc"
})
@Generated("jsonschema2pojo")
public class Scrpare__1 {

    /**
     * Area
     * <p>
     * Lineage reference object : SCRPARE_AREA
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SCRPARE_AREA")
    private String area;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRPARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SCRPARE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDesc")
    private String areaDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Area
     * <p>
     * Lineage reference object : SCRPARE_AREA
     * 
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SCRPARE_AREA
     * 
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    public Scrpare__1 withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRPARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRPARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Scrpare__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDesc")
    public String getAreaDesc() {
        return areaDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDesc")
    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    public Scrpare__1 withAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
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

    public Scrpare__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrpare__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("areaDesc");
        sb.append('=');
        sb.append(((this.areaDesc == null)?"<null>":this.areaDesc));
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
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.areaDesc == null)? 0 :this.areaDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrpare__1) == false) {
            return false;
        }
        Scrpare__1 rhs = ((Scrpare__1) other);
        return (((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.areaDesc == rhs.areaDesc)||((this.areaDesc!= null)&&this.areaDesc.equals(rhs.areaDesc))));
    }

}
