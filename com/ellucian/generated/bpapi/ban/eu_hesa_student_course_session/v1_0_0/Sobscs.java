
package com.ellucian.generated.bpapi.ban.eu_hesa_student_course_session.v1_0_0;

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
    "ssdtCodeStatuschngto",
    "activityDate",
    "statusValidFrom",
    "ssdtCodeStatuschngtoSt",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sobscs {

    /**
     * Status Changed To
     * <p>
     * Lineage reference object : SOBSCSS_SSDT_CODE_STATUSCHNGTO, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeStatuschngto")
    @JsonPropertyDescription("Lineage reference object : SOBSCSS_SSDT_CODE_STATUSCHNGTO, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeStatuschngto;
    /**
     * Lineage reference object : SOBSCSS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBSCSS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SOBSCSS_STATUS_VALID_FROM
     * (Required)
     * 
     */
    @JsonProperty("statusValidFrom")
    @JsonPropertyDescription("Lineage reference object : SOBSCSS_STATUS_VALID_FROM")
    private Date statusValidFrom;
    /**
     * Status Changed To Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeStatuschngtoSt")
    private String ssdtCodeStatuschngtoSt;
    /**
     * Lineage reference object : SOBSCSS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBSCSS_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status Changed To
     * <p>
     * Lineage reference object : SOBSCSS_SSDT_CODE_STATUSCHNGTO, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeStatuschngto")
    public String getSsdtCodeStatuschngto() {
        return ssdtCodeStatuschngto;
    }

    /**
     * Status Changed To
     * <p>
     * Lineage reference object : SOBSCSS_SSDT_CODE_STATUSCHNGTO, Lookup lineage reference object : skvssdt,skvssdt
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeStatuschngto")
    public void setSsdtCodeStatuschngto(String ssdtCodeStatuschngto) {
        this.ssdtCodeStatuschngto = ssdtCodeStatuschngto;
    }

    public Sobscs withSsdtCodeStatuschngto(String ssdtCodeStatuschngto) {
        this.ssdtCodeStatuschngto = ssdtCodeStatuschngto;
        return this;
    }

    /**
     * Lineage reference object : SOBSCSS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBSCSS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobscs withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SOBSCSS_STATUS_VALID_FROM
     * (Required)
     * 
     */
    @JsonProperty("statusValidFrom")
    public Date getStatusValidFrom() {
        return statusValidFrom;
    }

    /**
     * Lineage reference object : SOBSCSS_STATUS_VALID_FROM
     * (Required)
     * 
     */
    @JsonProperty("statusValidFrom")
    public void setStatusValidFrom(Date statusValidFrom) {
        this.statusValidFrom = statusValidFrom;
    }

    public Sobscs withStatusValidFrom(Date statusValidFrom) {
        this.statusValidFrom = statusValidFrom;
        return this;
    }

    /**
     * Status Changed To Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeStatuschngtoSt")
    public String getSsdtCodeStatuschngtoSt() {
        return ssdtCodeStatuschngtoSt;
    }

    /**
     * Status Changed To Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeStatuschngtoSt")
    public void setSsdtCodeStatuschngtoSt(String ssdtCodeStatuschngtoSt) {
        this.ssdtCodeStatuschngtoSt = ssdtCodeStatuschngtoSt;
    }

    public Sobscs withSsdtCodeStatuschngtoSt(String ssdtCodeStatuschngtoSt) {
        this.ssdtCodeStatuschngtoSt = ssdtCodeStatuschngtoSt;
        return this;
    }

    /**
     * Lineage reference object : SOBSCSS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBSCSS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobscs withUserId(String userId) {
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

    public Sobscs withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobscs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssdtCodeStatuschngto");
        sb.append('=');
        sb.append(((this.ssdtCodeStatuschngto == null)?"<null>":this.ssdtCodeStatuschngto));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("statusValidFrom");
        sb.append('=');
        sb.append(((this.statusValidFrom == null)?"<null>":this.statusValidFrom));
        sb.append(',');
        sb.append("ssdtCodeStatuschngtoSt");
        sb.append('=');
        sb.append(((this.ssdtCodeStatuschngtoSt == null)?"<null>":this.ssdtCodeStatuschngtoSt));
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
        result = ((result* 31)+((this.ssdtCodeStatuschngto == null)? 0 :this.ssdtCodeStatuschngto.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.statusValidFrom == null)? 0 :this.statusValidFrom.hashCode()));
        result = ((result* 31)+((this.ssdtCodeStatuschngtoSt == null)? 0 :this.ssdtCodeStatuschngtoSt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobscs) == false) {
            return false;
        }
        Sobscs rhs = ((Sobscs) other);
        return (((((((this.ssdtCodeStatuschngto == rhs.ssdtCodeStatuschngto)||((this.ssdtCodeStatuschngto!= null)&&this.ssdtCodeStatuschngto.equals(rhs.ssdtCodeStatuschngto)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.statusValidFrom == rhs.statusValidFrom)||((this.statusValidFrom!= null)&&this.statusValidFrom.equals(rhs.statusValidFrom))))&&((this.ssdtCodeStatuschngtoSt == rhs.ssdtCodeStatuschngtoSt)||((this.ssdtCodeStatuschngtoSt!= null)&&this.ssdtCodeStatuschngtoSt.equals(rhs.ssdtCodeStatuschngtoSt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
