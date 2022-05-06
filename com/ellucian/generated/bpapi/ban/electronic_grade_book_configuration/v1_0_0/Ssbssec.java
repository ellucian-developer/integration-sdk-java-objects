
package com.ellucian.generated.bpapi.ban.electronic_grade_book_configuration.v1_0_0;

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
    "reasGrdePubDate",
    "activityDate",
    "detGrdePubDate",
    "finalGrdePubDate",
    "userId",
    "reasDetGrdePubDate"
})
@Generated("jsonschema2pojo")
public class Ssbssec {

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_REAS_GRDE_PUB_DATE")
    private Date reasGrdePubDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBSSEC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("detGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_DET_GRDE_PUB_DATE")
    private Date detGrdePubDate;
    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("finalGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_FINAL_GRDE_PUB_DATE")
    private Date finalGrdePubDate;
    /**
     * Activity User
     * <p>
     * Lineage reference object : SSBSSEC_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_USER_ID")
    private String userId;
    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasDetGrdePubDate")
    @JsonPropertyDescription("Lineage reference object : SSBSSEC_REAS_DET_GRDE_PUB_DATE")
    private Date reasDetGrdePubDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasGrdePubDate")
    public Date getReasGrdePubDate() {
        return reasGrdePubDate;
    }

    /**
     * Reassessment Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasGrdePubDate")
    public void setReasGrdePubDate(Date reasGrdePubDate) {
        this.reasGrdePubDate = reasGrdePubDate;
    }

    public Ssbssec withReasGrdePubDate(Date reasGrdePubDate) {
        this.reasGrdePubDate = reasGrdePubDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBSSEC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SSBSSEC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ssbssec withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("detGrdePubDate")
    public Date getDetGrdePubDate() {
        return detGrdePubDate;
    }

    /**
     * Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("detGrdePubDate")
    public void setDetGrdePubDate(Date detGrdePubDate) {
        this.detGrdePubDate = detGrdePubDate;
    }

    public Ssbssec withDetGrdePubDate(Date detGrdePubDate) {
        this.detGrdePubDate = detGrdePubDate;
        return this;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("finalGrdePubDate")
    public Date getFinalGrdePubDate() {
        return finalGrdePubDate;
    }

    /**
     * Final Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_FINAL_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("finalGrdePubDate")
    public void setFinalGrdePubDate(Date finalGrdePubDate) {
        this.finalGrdePubDate = finalGrdePubDate;
    }

    public Ssbssec withFinalGrdePubDate(Date finalGrdePubDate) {
        this.finalGrdePubDate = finalGrdePubDate;
        return this;
    }

    /**
     * Activity User
     * <p>
     * Lineage reference object : SSBSSEC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Activity User
     * <p>
     * Lineage reference object : SSBSSEC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ssbssec withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasDetGrdePubDate")
    public Date getReasDetGrdePubDate() {
        return reasDetGrdePubDate;
    }

    /**
     * Reassessment Detail Grade Publication Date
     * <p>
     * Lineage reference object : SSBSSEC_REAS_DET_GRDE_PUB_DATE
     * 
     */
    @JsonProperty("reasDetGrdePubDate")
    public void setReasDetGrdePubDate(Date reasDetGrdePubDate) {
        this.reasDetGrdePubDate = reasDetGrdePubDate;
    }

    public Ssbssec withReasDetGrdePubDate(Date reasDetGrdePubDate) {
        this.reasDetGrdePubDate = reasDetGrdePubDate;
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

    public Ssbssec withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssbssec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reasGrdePubDate");
        sb.append('=');
        sb.append(((this.reasGrdePubDate == null)?"<null>":this.reasGrdePubDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("detGrdePubDate");
        sb.append('=');
        sb.append(((this.detGrdePubDate == null)?"<null>":this.detGrdePubDate));
        sb.append(',');
        sb.append("finalGrdePubDate");
        sb.append('=');
        sb.append(((this.finalGrdePubDate == null)?"<null>":this.finalGrdePubDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("reasDetGrdePubDate");
        sb.append('=');
        sb.append(((this.reasDetGrdePubDate == null)?"<null>":this.reasDetGrdePubDate));
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
        result = ((result* 31)+((this.reasGrdePubDate == null)? 0 :this.reasGrdePubDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.detGrdePubDate == null)? 0 :this.detGrdePubDate.hashCode()));
        result = ((result* 31)+((this.finalGrdePubDate == null)? 0 :this.finalGrdePubDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.reasDetGrdePubDate == null)? 0 :this.reasDetGrdePubDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssbssec) == false) {
            return false;
        }
        Ssbssec rhs = ((Ssbssec) other);
        return ((((((((this.reasGrdePubDate == rhs.reasGrdePubDate)||((this.reasGrdePubDate!= null)&&this.reasGrdePubDate.equals(rhs.reasGrdePubDate)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.detGrdePubDate == rhs.detGrdePubDate)||((this.detGrdePubDate!= null)&&this.detGrdePubDate.equals(rhs.detGrdePubDate))))&&((this.finalGrdePubDate == rhs.finalGrdePubDate)||((this.finalGrdePubDate!= null)&&this.finalGrdePubDate.equals(rhs.finalGrdePubDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.reasDetGrdePubDate == rhs.reasDetGrdePubDate)||((this.reasDetGrdePubDate!= null)&&this.reasDetGrdePubDate.equals(rhs.reasDetGrdePubDate))));
    }

}
