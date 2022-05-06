
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
    "ssdtCodeInitId",
    "userId",
    "ssdtCodeInitIdSt"
})
@Generated("jsonschema2pojo")
public class Sobresi {

    /**
     * Lineage reference object : SOBRESI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBRESI_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Initiative Identifier
     * <p>
     * Lineage reference object : SOBRESI_SSDT_CODE_INIT_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeInitId")
    @JsonPropertyDescription("Lineage reference object : SOBRESI_SSDT_CODE_INIT_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeInitId;
    /**
     * Lineage reference object : SOBRESI_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBRESI_USER_ID")
    private String userId;
    /**
     * Initiative Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeInitIdSt")
    private String ssdtCodeInitIdSt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBRESI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBRESI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobresi withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Initiative Identifier
     * <p>
     * Lineage reference object : SOBRESI_SSDT_CODE_INIT_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeInitId")
    public String getSsdtCodeInitId() {
        return ssdtCodeInitId;
    }

    /**
     * Initiative Identifier
     * <p>
     * Lineage reference object : SOBRESI_SSDT_CODE_INIT_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeInitId")
    public void setSsdtCodeInitId(String ssdtCodeInitId) {
        this.ssdtCodeInitId = ssdtCodeInitId;
    }

    public Sobresi withSsdtCodeInitId(String ssdtCodeInitId) {
        this.ssdtCodeInitId = ssdtCodeInitId;
        return this;
    }

    /**
     * Lineage reference object : SOBRESI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBRESI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobresi withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Initiative Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeInitIdSt")
    public String getSsdtCodeInitIdSt() {
        return ssdtCodeInitIdSt;
    }

    /**
     * Initiative Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeInitIdSt")
    public void setSsdtCodeInitIdSt(String ssdtCodeInitIdSt) {
        this.ssdtCodeInitIdSt = ssdtCodeInitIdSt;
    }

    public Sobresi withSsdtCodeInitIdSt(String ssdtCodeInitIdSt) {
        this.ssdtCodeInitIdSt = ssdtCodeInitIdSt;
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

    public Sobresi withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobresi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeInitId");
        sb.append('=');
        sb.append(((this.ssdtCodeInitId == null)?"<null>":this.ssdtCodeInitId));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeInitIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeInitIdSt == null)?"<null>":this.ssdtCodeInitIdSt));
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
        result = ((result* 31)+((this.ssdtCodeInitId == null)? 0 :this.ssdtCodeInitId.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeInitIdSt == null)? 0 :this.ssdtCodeInitIdSt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobresi) == false) {
            return false;
        }
        Sobresi rhs = ((Sobresi) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeInitId == rhs.ssdtCodeInitId)||((this.ssdtCodeInitId!= null)&&this.ssdtCodeInitId.equals(rhs.ssdtCodeInitId))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeInitIdSt == rhs.ssdtCodeInitIdSt)||((this.ssdtCodeInitIdSt!= null)&&this.ssdtCodeInitIdSt.equals(rhs.ssdtCodeInitIdSt))));
    }

}
