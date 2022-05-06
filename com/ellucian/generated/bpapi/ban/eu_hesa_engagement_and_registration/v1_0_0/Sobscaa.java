
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
    "ssdtCodeAccredId",
    "ssdtCodeAccredIdSt",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sobscaa {

    /**
     * Lineage reference object : SOBSCAA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSCAA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Accreditation Identifier
     * <p>
     * Lineage reference object : SOBSCAA_SSDT_CODE_ACCRED_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeAccredId")
    @JsonPropertyDescription("Lineage reference object : SOBSCAA_SSDT_CODE_ACCRED_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeAccredId;
    /**
     * Accreditation Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAccredIdSt")
    private String ssdtCodeAccredIdSt;
    /**
     * Lineage reference object : SOBSCAA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSCAA_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBSCAA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSCAA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobscaa withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Accreditation Identifier
     * <p>
     * Lineage reference object : SOBSCAA_SSDT_CODE_ACCRED_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeAccredId")
    public String getSsdtCodeAccredId() {
        return ssdtCodeAccredId;
    }

    /**
     * Accreditation Identifier
     * <p>
     * Lineage reference object : SOBSCAA_SSDT_CODE_ACCRED_ID, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeAccredId")
    public void setSsdtCodeAccredId(String ssdtCodeAccredId) {
        this.ssdtCodeAccredId = ssdtCodeAccredId;
    }

    public Sobscaa withSsdtCodeAccredId(String ssdtCodeAccredId) {
        this.ssdtCodeAccredId = ssdtCodeAccredId;
        return this;
    }

    /**
     * Accreditation Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAccredIdSt")
    public String getSsdtCodeAccredIdSt() {
        return ssdtCodeAccredIdSt;
    }

    /**
     * Accreditation Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAccredIdSt")
    public void setSsdtCodeAccredIdSt(String ssdtCodeAccredIdSt) {
        this.ssdtCodeAccredIdSt = ssdtCodeAccredIdSt;
    }

    public Sobscaa withSsdtCodeAccredIdSt(String ssdtCodeAccredIdSt) {
        this.ssdtCodeAccredIdSt = ssdtCodeAccredIdSt;
        return this;
    }

    /**
     * Lineage reference object : SOBSCAA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSCAA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobscaa withUserId(String userId) {
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

    public Sobscaa withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobscaa.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeAccredId");
        sb.append('=');
        sb.append(((this.ssdtCodeAccredId == null)?"<null>":this.ssdtCodeAccredId));
        sb.append(',');
        sb.append("ssdtCodeAccredIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeAccredIdSt == null)?"<null>":this.ssdtCodeAccredIdSt));
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
        result = ((result* 31)+((this.ssdtCodeAccredId == null)? 0 :this.ssdtCodeAccredId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAccredIdSt == null)? 0 :this.ssdtCodeAccredIdSt.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobscaa) == false) {
            return false;
        }
        Sobscaa rhs = ((Sobscaa) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.ssdtCodeAccredId == rhs.ssdtCodeAccredId)||((this.ssdtCodeAccredId!= null)&&this.ssdtCodeAccredId.equals(rhs.ssdtCodeAccredId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeAccredIdSt == rhs.ssdtCodeAccredIdSt)||((this.ssdtCodeAccredIdSt!= null)&&this.ssdtCodeAccredIdSt.equals(rhs.ssdtCodeAccredIdSt))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
