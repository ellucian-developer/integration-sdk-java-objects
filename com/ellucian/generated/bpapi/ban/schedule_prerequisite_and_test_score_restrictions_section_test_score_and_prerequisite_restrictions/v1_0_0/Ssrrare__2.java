
package com.ellucian.generated.bpapi.ban.schedule_prerequisite_and_test_score_restrictions_section_test_score_and_prerequisite_restrictions.v1_0_0;

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
    "areaDescription"
})
@Generated("jsonschema2pojo")
public class Ssrrare__2 {

    /**
     * Ssrrare Area
     * <p>
     * Lineage reference object : SSRRARE_AREA
     * (Required)
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SSRRARE_AREA")
    private String area;
    /**
     * Ssrrare Activity Date
     * <p>
     * Lineage reference object : SSRRARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRRARE_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDescription")
    private String areaDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Ssrrare Area
     * <p>
     * Lineage reference object : SSRRARE_AREA
     * (Required)
     * 
     */
    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    /**
     * Ssrrare Area
     * <p>
     * Lineage reference object : SSRRARE_AREA
     * (Required)
     * 
     */
    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    public Ssrrare__2 withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * Ssrrare Activity Date
     * <p>
     * Lineage reference object : SSRRARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Ssrrare Activity Date
     * <p>
     * Lineage reference object : SSRRARE_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssrrare__2 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDescription")
    public String getAreaDescription() {
        return areaDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("areaDescription")
    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
    }

    public Ssrrare__2 withAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
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

    public Ssrrare__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrrare__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("areaDescription");
        sb.append('=');
        sb.append(((this.areaDescription == null)?"<null>":this.areaDescription));
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
        result = ((result* 31)+((this.areaDescription == null)? 0 :this.areaDescription.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrrare__2) == false) {
            return false;
        }
        Ssrrare__2 rhs = ((Ssrrare__2) other);
        return (((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.areaDescription == rhs.areaDescription)||((this.areaDescription!= null)&&this.areaDescription.equals(rhs.areaDescription))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
