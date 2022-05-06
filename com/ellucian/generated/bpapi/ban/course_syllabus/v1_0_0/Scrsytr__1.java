
package com.ellucian.generated.bpapi.ban.course_syllabus.v1_0_0;

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
    "activityDate",
    "endcopy"
})
@Generated("jsonschema2pojo")
public class Scrsytr__1 {

    /**
     * Lineage reference object : SCRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    @JsonPropertyDescription("Lineage reference object : SCRSYTR_TECHNICAL_REQUIREMENT")
    private Object technicalRequirement;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRSYTR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SCRSYTR_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("endcopy")
    private String endcopy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SCRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    public Object getTechnicalRequirement() {
        return technicalRequirement;
    }

    /**
     * Lineage reference object : SCRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    public void setTechnicalRequirement(Object technicalRequirement) {
        this.technicalRequirement = technicalRequirement;
    }

    public Scrsytr__1 withTechnicalRequirement(Object technicalRequirement) {
        this.technicalRequirement = technicalRequirement;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRSYTR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRSYTR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Scrsytr__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("endcopy")
    public String getEndcopy() {
        return endcopy;
    }

    @JsonProperty("endcopy")
    public void setEndcopy(String endcopy) {
        this.endcopy = endcopy;
    }

    public Scrsytr__1 withEndcopy(String endcopy) {
        this.endcopy = endcopy;
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

    public Scrsytr__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrsytr__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("technicalRequirement");
        sb.append('=');
        sb.append(((this.technicalRequirement == null)?"<null>":this.technicalRequirement));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("endcopy");
        sb.append('=');
        sb.append(((this.endcopy == null)?"<null>":this.endcopy));
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
        result = ((result* 31)+((this.endcopy == null)? 0 :this.endcopy.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrsytr__1) == false) {
            return false;
        }
        Scrsytr__1 rhs = ((Scrsytr__1) other);
        return (((((this.technicalRequirement == rhs.technicalRequirement)||((this.technicalRequirement!= null)&&this.technicalRequirement.equals(rhs.technicalRequirement)))&&((this.endcopy == rhs.endcopy)||((this.endcopy!= null)&&this.endcopy.equals(rhs.endcopy))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
