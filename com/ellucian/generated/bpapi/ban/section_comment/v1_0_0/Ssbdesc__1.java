
package com.ellucian.generated.bpapi.ban.section_comment.v1_0_0;

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
    "textNarrative"
})
@Generated("jsonschema2pojo")
public class Ssbdesc__1 {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBDESC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSBDESC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    @JsonPropertyDescription("Lineage reference object : SSBDESC_TEXT_NARRATIVE")
    private Object textNarrative;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBDESC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBDESC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssbdesc__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    public Object getTextNarrative() {
        return textNarrative;
    }

    /**
     * Section Long Text
     * <p>
     * Lineage reference object : SSBDESC_TEXT_NARRATIVE
     * 
     */
    @JsonProperty("textNarrative")
    public void setTextNarrative(Object textNarrative) {
        this.textNarrative = textNarrative;
    }

    public Ssbdesc__1 withTextNarrative(Object textNarrative) {
        this.textNarrative = textNarrative;
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

    public Ssbdesc__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssbdesc__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("textNarrative");
        sb.append('=');
        sb.append(((this.textNarrative == null)?"<null>":this.textNarrative));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.textNarrative == null)? 0 :this.textNarrative.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssbdesc__1) == false) {
            return false;
        }
        Ssbdesc__1 rhs = ((Ssbdesc__1) other);
        return ((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.textNarrative == rhs.textNarrative)||((this.textNarrative!= null)&&this.textNarrative.equals(rhs.textNarrative))));
    }

}
