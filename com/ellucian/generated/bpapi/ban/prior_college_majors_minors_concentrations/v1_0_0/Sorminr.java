
package com.ellucian.generated.bpapi.ban.prior_college_majors_minors_concentrations.v1_0_0;

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
    "minorDesc",
    "userId",
    "majrCodeMinor"
})
@Generated("jsonschema2pojo")
public class Sorminr {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORMINR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORMINR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("minorDesc")
    private String minorDesc;
    /**
     * User ID
     * <p>
     * Lineage reference object : SORMINR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORMINR_USER_ID")
    private String userId;
    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinor")
    @JsonPropertyDescription("Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr")
    private String majrCodeMinor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORMINR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORMINR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorminr withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("minorDesc")
    public String getMinorDesc() {
        return minorDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("minorDesc")
    public void setMinorDesc(String minorDesc) {
        this.minorDesc = minorDesc;
    }

    public Sorminr withMinorDesc(String minorDesc) {
        this.minorDesc = minorDesc;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SORMINR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SORMINR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorminr withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinor")
    public String getMajrCodeMinor() {
        return majrCodeMinor;
    }

    /**
     * Minors
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCodeMinor")
    public void setMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
    }

    public Sorminr withMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
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

    public Sorminr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorminr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("minorDesc");
        sb.append('=');
        sb.append(((this.minorDesc == null)?"<null>":this.minorDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("majrCodeMinor");
        sb.append('=');
        sb.append(((this.majrCodeMinor == null)?"<null>":this.majrCodeMinor));
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
        result = ((result* 31)+((this.minorDesc == null)? 0 :this.minorDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.majrCodeMinor == null)? 0 :this.majrCodeMinor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorminr) == false) {
            return false;
        }
        Sorminr rhs = ((Sorminr) other);
        return ((((((this.minorDesc == rhs.minorDesc)||((this.minorDesc!= null)&&this.minorDesc.equals(rhs.minorDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.majrCodeMinor == rhs.majrCodeMinor)||((this.majrCodeMinor!= null)&&this.majrCodeMinor.equals(rhs.majrCodeMinor))));
    }

}
