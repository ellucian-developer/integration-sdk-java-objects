
package com.ellucian.generated.bpapi.ban.eu_hesa_course_delivery_details.v1_0_0;

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
    "ssdtCodeRefIdTypeSt",
    "ssdtCodeRefIdType",
    "userId",
    "referenceId"
})
@Generated("jsonschema2pojo")
public class Sorpcrus {

    /**
     * Lineage reference object : SORPCRI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORPCRI_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("ssdtCodeRefIdTypeSt")
    private String ssdtCodeRefIdTypeSt;
    /**
     * Lineage reference object : SORPCRI_SSDT_CODE_REFRNCIDTYPE, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRefIdType")
    @JsonPropertyDescription("Lineage reference object : SORPCRI_SSDT_CODE_REFRNCIDTYPE, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeRefIdType;
    /**
     * Lineage reference object : SORPCRI_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORPCRI_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORPCRI_REFERENCE_ID
     * (Required)
     * 
     */
    @JsonProperty("referenceId")
    @JsonPropertyDescription("Lineage reference object : SORPCRI_REFERENCE_ID")
    private String referenceId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORPCRI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORPCRI_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorpcrus withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("ssdtCodeRefIdTypeSt")
    public String getSsdtCodeRefIdTypeSt() {
        return ssdtCodeRefIdTypeSt;
    }

    @JsonProperty("ssdtCodeRefIdTypeSt")
    public void setSsdtCodeRefIdTypeSt(String ssdtCodeRefIdTypeSt) {
        this.ssdtCodeRefIdTypeSt = ssdtCodeRefIdTypeSt;
    }

    public Sorpcrus withSsdtCodeRefIdTypeSt(String ssdtCodeRefIdTypeSt) {
        this.ssdtCodeRefIdTypeSt = ssdtCodeRefIdTypeSt;
        return this;
    }

    /**
     * Lineage reference object : SORPCRI_SSDT_CODE_REFRNCIDTYPE, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRefIdType")
    public String getSsdtCodeRefIdType() {
        return ssdtCodeRefIdType;
    }

    /**
     * Lineage reference object : SORPCRI_SSDT_CODE_REFRNCIDTYPE, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeRefIdType")
    public void setSsdtCodeRefIdType(String ssdtCodeRefIdType) {
        this.ssdtCodeRefIdType = ssdtCodeRefIdType;
    }

    public Sorpcrus withSsdtCodeRefIdType(String ssdtCodeRefIdType) {
        this.ssdtCodeRefIdType = ssdtCodeRefIdType;
        return this;
    }

    /**
     * Lineage reference object : SORPCRI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORPCRI_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorpcrus withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SORPCRI_REFERENCE_ID
     * (Required)
     * 
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Lineage reference object : SORPCRI_REFERENCE_ID
     * (Required)
     * 
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Sorpcrus withReferenceId(String referenceId) {
        this.referenceId = referenceId;
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

    public Sorpcrus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorpcrus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeRefIdTypeSt");
        sb.append('=');
        sb.append(((this.ssdtCodeRefIdTypeSt == null)?"<null>":this.ssdtCodeRefIdTypeSt));
        sb.append(',');
        sb.append("ssdtCodeRefIdType");
        sb.append('=');
        sb.append(((this.ssdtCodeRefIdType == null)?"<null>":this.ssdtCodeRefIdType));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("referenceId");
        sb.append('=');
        sb.append(((this.referenceId == null)?"<null>":this.referenceId));
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
        result = ((result* 31)+((this.ssdtCodeRefIdTypeSt == null)? 0 :this.ssdtCodeRefIdTypeSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRefIdType == null)? 0 :this.ssdtCodeRefIdType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.referenceId == null)? 0 :this.referenceId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorpcrus) == false) {
            return false;
        }
        Sorpcrus rhs = ((Sorpcrus) other);
        return (((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.ssdtCodeRefIdTypeSt == rhs.ssdtCodeRefIdTypeSt)||((this.ssdtCodeRefIdTypeSt!= null)&&this.ssdtCodeRefIdTypeSt.equals(rhs.ssdtCodeRefIdTypeSt))))&&((this.ssdtCodeRefIdType == rhs.ssdtCodeRefIdType)||((this.ssdtCodeRefIdType!= null)&&this.ssdtCodeRefIdType.equals(rhs.ssdtCodeRefIdType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.referenceId == rhs.referenceId)||((this.referenceId!= null)&&this.referenceId.equals(rhs.referenceId))));
    }

}
