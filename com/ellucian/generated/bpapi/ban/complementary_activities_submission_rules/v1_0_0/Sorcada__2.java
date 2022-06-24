
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
    "activityDate",
    "cadtCode",
    "cadtDesc",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sorcada__2 {

    /**
     * Lineage reference object : SORCADA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORCADA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORCADA_CADT_CODE
     * (Required)
     * 
     */
    @JsonProperty("cadtCode")
    @JsonPropertyDescription("Lineage reference object : SORCADA_CADT_CODE")
    private String cadtCode;
    /**
     * Document Code Description
     * <p>
     * Lineage reference object : SORCADA_CADT_DESC
     * 
     */
    @JsonProperty("cadtDesc")
    @JsonPropertyDescription("Lineage reference object : SORCADA_CADT_DESC")
    private String cadtDesc;
    /**
     * Lineage reference object : SORCADA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORCADA_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORCADA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORCADA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorcada__2 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORCADA_CADT_CODE
     * (Required)
     * 
     */
    @JsonProperty("cadtCode")
    public String getCadtCode() {
        return cadtCode;
    }

    /**
     * Lineage reference object : SORCADA_CADT_CODE
     * (Required)
     * 
     */
    @JsonProperty("cadtCode")
    public void setCadtCode(String cadtCode) {
        this.cadtCode = cadtCode;
    }

    public Sorcada__2 withCadtCode(String cadtCode) {
        this.cadtCode = cadtCode;
        return this;
    }

    /**
     * Document Code Description
     * <p>
     * Lineage reference object : SORCADA_CADT_DESC
     * 
     */
    @JsonProperty("cadtDesc")
    public String getCadtDesc() {
        return cadtDesc;
    }

    /**
     * Document Code Description
     * <p>
     * Lineage reference object : SORCADA_CADT_DESC
     * 
     */
    @JsonProperty("cadtDesc")
    public void setCadtDesc(String cadtDesc) {
        this.cadtDesc = cadtDesc;
    }

    public Sorcada__2 withCadtDesc(String cadtDesc) {
        this.cadtDesc = cadtDesc;
        return this;
    }

    /**
     * Lineage reference object : SORCADA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORCADA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorcada__2 withUserId(String userId) {
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

    public Sorcada__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorcada__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("cadtCode");
        sb.append('=');
        sb.append(((this.cadtCode == null)?"<null>":this.cadtCode));
        sb.append(',');
        sb.append("cadtDesc");
        sb.append('=');
        sb.append(((this.cadtDesc == null)?"<null>":this.cadtDesc));
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
        result = ((result* 31)+((this.cadtCode == null)? 0 :this.cadtCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.cadtDesc == null)? 0 :this.cadtDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorcada__2) == false) {
            return false;
        }
        Sorcada__2 rhs = ((Sorcada__2) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.cadtCode == rhs.cadtCode)||((this.cadtCode!= null)&&this.cadtCode.equals(rhs.cadtCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.cadtDesc == rhs.cadtDesc)||((this.cadtDesc!= null)&&this.cadtDesc.equals(rhs.cadtDesc))));
    }

}
