
package com.ellucian.generated.bpapi.ban.complementary_activities_submission_rules.v1_0_0;

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
    "actcDesc",
    "activityDate",
    "accgCode",
    "maxHrs",
    "minHrs",
    "userId",
    "actcCode"
})
@Generated("jsonschema2pojo")
public class Sobcasr__2 {

    @JsonProperty("actcDesc")
    private String actcDesc;
    /**
     * Lineage reference object : SOBCASR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("accgCode")
    private String accgCode;
    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_MAX_HRS")
    private Double maxHrs;
    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_MIN_HRS")
    private Double minHrs;
    /**
     * Lineage reference object : SOBCASR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_USER_ID")
    private String userId;
    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    @JsonPropertyDescription("Lineage reference object : SOBCASR_ACTC_CODE")
    private String actcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("actcDesc")
    public String getActcDesc() {
        return actcDesc;
    }

    @JsonProperty("actcDesc")
    public void setActcDesc(String actcDesc) {
        this.actcDesc = actcDesc;
    }

    public Sobcasr__2 withActcDesc(String actcDesc) {
        this.actcDesc = actcDesc;
        return this;
    }

    /**
     * Lineage reference object : SOBCASR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBCASR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobcasr__2 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("accgCode")
    public String getAccgCode() {
        return accgCode;
    }

    @JsonProperty("accgCode")
    public void setAccgCode(String accgCode) {
        this.accgCode = accgCode;
    }

    public Sobcasr__2 withAccgCode(String accgCode) {
        this.accgCode = accgCode;
        return this;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    public Double getMaxHrs() {
        return maxHrs;
    }

    /**
     * Maximum Hours
     * <p>
     * Lineage reference object : SOBCASR_MAX_HRS
     * (Required)
     * 
     */
    @JsonProperty("maxHrs")
    public void setMaxHrs(Double maxHrs) {
        this.maxHrs = maxHrs;
    }

    public Sobcasr__2 withMaxHrs(Double maxHrs) {
        this.maxHrs = maxHrs;
        return this;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public Double getMinHrs() {
        return minHrs;
    }

    /**
     * Minimum Hours
     * <p>
     * Lineage reference object : SOBCASR_MIN_HRS
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public void setMinHrs(Double minHrs) {
        this.minHrs = minHrs;
    }

    public Sobcasr__2 withMinHrs(Double minHrs) {
        this.minHrs = minHrs;
        return this;
    }

    /**
     * Lineage reference object : SOBCASR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBCASR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobcasr__2 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    /**
     * Activity Code
     * <p>
     * Lineage reference object : SOBCASR_ACTC_CODE
     * (Required)
     * 
     */
    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public Sobcasr__2 withActcCode(String actcCode) {
        this.actcCode = actcCode;
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

    public Sobcasr__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobcasr__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actcDesc");
        sb.append('=');
        sb.append(((this.actcDesc == null)?"<null>":this.actcDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("accgCode");
        sb.append('=');
        sb.append(((this.accgCode == null)?"<null>":this.accgCode));
        sb.append(',');
        sb.append("maxHrs");
        sb.append('=');
        sb.append(((this.maxHrs == null)?"<null>":this.maxHrs));
        sb.append(',');
        sb.append("minHrs");
        sb.append('=');
        sb.append(((this.minHrs == null)?"<null>":this.minHrs));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
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
        result = ((result* 31)+((this.actcDesc == null)? 0 :this.actcDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.accgCode == null)? 0 :this.accgCode.hashCode()));
        result = ((result* 31)+((this.maxHrs == null)? 0 :this.maxHrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.minHrs == null)? 0 :this.minHrs.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobcasr__2) == false) {
            return false;
        }
        Sobcasr__2 rhs = ((Sobcasr__2) other);
        return (((((((((this.actcDesc == rhs.actcDesc)||((this.actcDesc!= null)&&this.actcDesc.equals(rhs.actcDesc)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.accgCode == rhs.accgCode)||((this.accgCode!= null)&&this.accgCode.equals(rhs.accgCode))))&&((this.maxHrs == rhs.maxHrs)||((this.maxHrs!= null)&&this.maxHrs.equals(rhs.maxHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.minHrs == rhs.minHrs)||((this.minHrs!= null)&&this.minHrs.equals(rhs.minHrs))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))));
    }

}
