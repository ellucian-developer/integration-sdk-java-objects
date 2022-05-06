
package com.ellucian.generated.bpapi.ban.eu_hesa_engagement_and_registration.v1_0_0;

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
    "ssdtCodeRsnEngendSt",
    "engEndDate",
    "intendedDestination",
    "ssdtCodeRsnEngend",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sobrelv {

    /**
     * Lineage reference object : SOBRELV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBRELV_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("ssdtCodeRsnEngendSt")
    private String ssdtCodeRsnEngendSt;
    /**
     * Engagement End Date
     * <p>
     * Lineage reference object : SOBRELV_ENG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("engEndDate")
    @JsonPropertyDescription("Lineage reference object : SOBRELV_ENG_END_DATE")
    private Date engEndDate;
    /**
     * Intended Destination
     * <p>
     * Lineage reference object : SOBRELV_INTENDED_DESTINATION
     * 
     */
    @JsonProperty("intendedDestination")
    @JsonPropertyDescription("Lineage reference object : SOBRELV_INTENDED_DESTINATION")
    private String intendedDestination;
    /**
     * Reason for Engagement Ending
     * <p>
     * Lineage reference object : SOBRELV_SSDT_CODE_RSN_ENGEND, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRsnEngend")
    @JsonPropertyDescription("Lineage reference object : SOBRELV_SSDT_CODE_RSN_ENGEND, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeRsnEngend;
    /**
     * Lineage reference object : SOBRELV_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBRELV_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBRELV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBRELV_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobrelv withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("ssdtCodeRsnEngendSt")
    public String getSsdtCodeRsnEngendSt() {
        return ssdtCodeRsnEngendSt;
    }

    @JsonProperty("ssdtCodeRsnEngendSt")
    public void setSsdtCodeRsnEngendSt(String ssdtCodeRsnEngendSt) {
        this.ssdtCodeRsnEngendSt = ssdtCodeRsnEngendSt;
    }

    public Sobrelv withSsdtCodeRsnEngendSt(String ssdtCodeRsnEngendSt) {
        this.ssdtCodeRsnEngendSt = ssdtCodeRsnEngendSt;
        return this;
    }

    /**
     * Engagement End Date
     * <p>
     * Lineage reference object : SOBRELV_ENG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("engEndDate")
    public Date getEngEndDate() {
        return engEndDate;
    }

    /**
     * Engagement End Date
     * <p>
     * Lineage reference object : SOBRELV_ENG_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("engEndDate")
    public void setEngEndDate(Date engEndDate) {
        this.engEndDate = engEndDate;
    }

    public Sobrelv withEngEndDate(Date engEndDate) {
        this.engEndDate = engEndDate;
        return this;
    }

    /**
     * Intended Destination
     * <p>
     * Lineage reference object : SOBRELV_INTENDED_DESTINATION
     * 
     */
    @JsonProperty("intendedDestination")
    public String getIntendedDestination() {
        return intendedDestination;
    }

    /**
     * Intended Destination
     * <p>
     * Lineage reference object : SOBRELV_INTENDED_DESTINATION
     * 
     */
    @JsonProperty("intendedDestination")
    public void setIntendedDestination(String intendedDestination) {
        this.intendedDestination = intendedDestination;
    }

    public Sobrelv withIntendedDestination(String intendedDestination) {
        this.intendedDestination = intendedDestination;
        return this;
    }

    /**
     * Reason for Engagement Ending
     * <p>
     * Lineage reference object : SOBRELV_SSDT_CODE_RSN_ENGEND, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRsnEngend")
    public String getSsdtCodeRsnEngend() {
        return ssdtCodeRsnEngend;
    }

    /**
     * Reason for Engagement Ending
     * <p>
     * Lineage reference object : SOBRELV_SSDT_CODE_RSN_ENGEND, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRsnEngend")
    public void setSsdtCodeRsnEngend(String ssdtCodeRsnEngend) {
        this.ssdtCodeRsnEngend = ssdtCodeRsnEngend;
    }

    public Sobrelv withSsdtCodeRsnEngend(String ssdtCodeRsnEngend) {
        this.ssdtCodeRsnEngend = ssdtCodeRsnEngend;
        return this;
    }

    /**
     * Lineage reference object : SOBRELV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBRELV_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobrelv withUserId(String userId) {
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

    public Sobrelv withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobrelv.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeRsnEngendSt");
        sb.append('=');
        sb.append(((this.ssdtCodeRsnEngendSt == null)?"<null>":this.ssdtCodeRsnEngendSt));
        sb.append(',');
        sb.append("engEndDate");
        sb.append('=');
        sb.append(((this.engEndDate == null)?"<null>":this.engEndDate));
        sb.append(',');
        sb.append("intendedDestination");
        sb.append('=');
        sb.append(((this.intendedDestination == null)?"<null>":this.intendedDestination));
        sb.append(',');
        sb.append("ssdtCodeRsnEngend");
        sb.append('=');
        sb.append(((this.ssdtCodeRsnEngend == null)?"<null>":this.ssdtCodeRsnEngend));
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
        result = ((result* 31)+((this.ssdtCodeRsnEngendSt == null)? 0 :this.ssdtCodeRsnEngendSt.hashCode()));
        result = ((result* 31)+((this.engEndDate == null)? 0 :this.engEndDate.hashCode()));
        result = ((result* 31)+((this.intendedDestination == null)? 0 :this.intendedDestination.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRsnEngend == null)? 0 :this.ssdtCodeRsnEngend.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobrelv) == false) {
            return false;
        }
        Sobrelv rhs = ((Sobrelv) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.ssdtCodeRsnEngendSt == rhs.ssdtCodeRsnEngendSt)||((this.ssdtCodeRsnEngendSt!= null)&&this.ssdtCodeRsnEngendSt.equals(rhs.ssdtCodeRsnEngendSt))))&&((this.engEndDate == rhs.engEndDate)||((this.engEndDate!= null)&&this.engEndDate.equals(rhs.engEndDate))))&&((this.intendedDestination == rhs.intendedDestination)||((this.intendedDestination!= null)&&this.intendedDestination.equals(rhs.intendedDestination))))&&((this.ssdtCodeRsnEngend == rhs.ssdtCodeRsnEngend)||((this.ssdtCodeRsnEngend!= null)&&this.ssdtCodeRsnEngend.equals(rhs.ssdtCodeRsnEngend))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
