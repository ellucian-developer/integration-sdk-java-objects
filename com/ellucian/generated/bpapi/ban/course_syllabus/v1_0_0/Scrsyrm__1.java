
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
    "activityDate",
    "endcopy",
    "requiredMaterials"
})
@Generated("jsonschema2pojo")
public class Scrsyrm__1 {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRSYRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SCRSYRM_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("endcopy")
    private String endcopy;
    /**
     * Lineage reference object : SCRSYRM_REQUIRED_MATERIALS
     * 
     */
    @JsonProperty("requiredMaterials")
    @JsonPropertyDescription("Lineage reference object : SCRSYRM_REQUIRED_MATERIALS")
    private Object requiredMaterials;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRSYRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRSYRM_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Scrsyrm__1 withActivityDate(Date activityDate) {
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

    public Scrsyrm__1 withEndcopy(String endcopy) {
        this.endcopy = endcopy;
        return this;
    }

    /**
     * Lineage reference object : SCRSYRM_REQUIRED_MATERIALS
     * 
     */
    @JsonProperty("requiredMaterials")
    public Object getRequiredMaterials() {
        return requiredMaterials;
    }

    /**
     * Lineage reference object : SCRSYRM_REQUIRED_MATERIALS
     * 
     */
    @JsonProperty("requiredMaterials")
    public void setRequiredMaterials(Object requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
    }

    public Scrsyrm__1 withRequiredMaterials(Object requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
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

    public Scrsyrm__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrsyrm__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("endcopy");
        sb.append('=');
        sb.append(((this.endcopy == null)?"<null>":this.endcopy));
        sb.append(',');
        sb.append("requiredMaterials");
        sb.append('=');
        sb.append(((this.requiredMaterials == null)?"<null>":this.requiredMaterials));
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
        result = ((result* 31)+((this.endcopy == null)? 0 :this.endcopy.hashCode()));
        result = ((result* 31)+((this.requiredMaterials == null)? 0 :this.requiredMaterials.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrsyrm__1) == false) {
            return false;
        }
        Scrsyrm__1 rhs = ((Scrsyrm__1) other);
        return (((((this.endcopy == rhs.endcopy)||((this.endcopy!= null)&&this.endcopy.equals(rhs.endcopy)))&&((this.requiredMaterials == rhs.requiredMaterials)||((this.requiredMaterials!= null)&&this.requiredMaterials.equals(rhs.requiredMaterials))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
