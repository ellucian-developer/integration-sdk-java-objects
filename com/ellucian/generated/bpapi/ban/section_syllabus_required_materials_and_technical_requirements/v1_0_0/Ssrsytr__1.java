
package com.ellucian.generated.bpapi.ban.section_syllabus_required_materials_and_technical_requirements.v1_0_0;

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
    "technicalRequirement",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class Ssrsytr__1 {

    /**
     * Lineage reference object : SSRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    @JsonPropertyDescription("Lineage reference object : SSRSYTR_TECHNICAL_REQUIREMENT")
    private Object technicalRequirement;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRSYTR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSRSYTR_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SSRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    public Object getTechnicalRequirement() {
        return technicalRequirement;
    }

    /**
     * Lineage reference object : SSRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    public void setTechnicalRequirement(Object technicalRequirement) {
        this.technicalRequirement = technicalRequirement;
    }

    public Ssrsytr__1 withTechnicalRequirement(Object technicalRequirement) {
        this.technicalRequirement = technicalRequirement;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRSYTR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSRSYTR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssrsytr__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public Ssrsytr__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrsytr__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("technicalRequirement");
        sb.append('=');
        sb.append(((this.technicalRequirement == null)?"<null>":this.technicalRequirement));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.technicalRequirement == null)? 0 :this.technicalRequirement.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrsytr__1) == false) {
            return false;
        }
        Ssrsytr__1 rhs = ((Ssrsytr__1) other);
        return ((((this.technicalRequirement == rhs.technicalRequirement)||((this.technicalRequirement!= null)&&this.technicalRequirement.equals(rhs.technicalRequirement)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
