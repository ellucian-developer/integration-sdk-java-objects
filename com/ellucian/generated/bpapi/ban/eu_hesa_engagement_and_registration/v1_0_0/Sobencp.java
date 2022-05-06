
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
    "partnerSid",
    "partnerUkprn",
    "partnerNumhus",
    "ssdtCodeColprotypIdSt",
    "userId",
    "ssdtCodeColprotypId"
})
@Generated("jsonschema2pojo")
public class Sobencp {

    /**
     * Lineage reference object : SOBENCP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBENCP_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Partner SID
     * <p>
     * Lineage reference object : SOBENCP_PARTNER_SID
     * 
     */
    @JsonProperty("partnerSid")
    @JsonPropertyDescription("Lineage reference object : SOBENCP_PARTNER_SID")
    private String partnerSid;
    /**
     * Partner UKPRN
     * <p>
     * Lineage reference object : SOBENCP_PARTNER_UKPRN
     * 
     */
    @JsonProperty("partnerUkprn")
    @JsonPropertyDescription("Lineage reference object : SOBENCP_PARTNER_UKPRN")
    private String partnerUkprn;
    /**
     * Partner NUMHUS
     * <p>
     * Lineage reference object : SOBENCP_PARTNER_NUMHUS
     * 
     */
    @JsonProperty("partnerNumhus")
    @JsonPropertyDescription("Lineage reference object : SOBENCP_PARTNER_NUMHUS")
    private String partnerNumhus;
    @JsonProperty("ssdtCodeColprotypIdSt")
    private String ssdtCodeColprotypIdSt;
    /**
     * Lineage reference object : SOBENCP_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBENCP_USER_ID")
    private String userId;
    /**
     * Collaborative Provision Type
     * <p>
     * Lineage reference object : SOBENCP_SSDT_CODE_COLPROTYP_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeColprotypId")
    @JsonPropertyDescription("Lineage reference object : SOBENCP_SSDT_CODE_COLPROTYP_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeColprotypId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBENCP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBENCP_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobencp withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Partner SID
     * <p>
     * Lineage reference object : SOBENCP_PARTNER_SID
     * 
     */
    @JsonProperty("partnerSid")
    public String getPartnerSid() {
        return partnerSid;
    }

    /**
     * Partner SID
     * <p>
     * Lineage reference object : SOBENCP_PARTNER_SID
     * 
     */
    @JsonProperty("partnerSid")
    public void setPartnerSid(String partnerSid) {
        this.partnerSid = partnerSid;
    }

    public Sobencp withPartnerSid(String partnerSid) {
        this.partnerSid = partnerSid;
        return this;
    }

    /**
     * Partner UKPRN
     * <p>
     * Lineage reference object : SOBENCP_PARTNER_UKPRN
     * 
     */
    @JsonProperty("partnerUkprn")
    public String getPartnerUkprn() {
        return partnerUkprn;
    }

    /**
     * Partner UKPRN
     * <p>
     * Lineage reference object : SOBENCP_PARTNER_UKPRN
     * 
     */
    @JsonProperty("partnerUkprn")
    public void setPartnerUkprn(String partnerUkprn) {
        this.partnerUkprn = partnerUkprn;
    }

    public Sobencp withPartnerUkprn(String partnerUkprn) {
        this.partnerUkprn = partnerUkprn;
        return this;
    }

    /**
     * Partner NUMHUS
     * <p>
     * Lineage reference object : SOBENCP_PARTNER_NUMHUS
     * 
     */
    @JsonProperty("partnerNumhus")
    public String getPartnerNumhus() {
        return partnerNumhus;
    }

    /**
     * Partner NUMHUS
     * <p>
     * Lineage reference object : SOBENCP_PARTNER_NUMHUS
     * 
     */
    @JsonProperty("partnerNumhus")
    public void setPartnerNumhus(String partnerNumhus) {
        this.partnerNumhus = partnerNumhus;
    }

    public Sobencp withPartnerNumhus(String partnerNumhus) {
        this.partnerNumhus = partnerNumhus;
        return this;
    }

    @JsonProperty("ssdtCodeColprotypIdSt")
    public String getSsdtCodeColprotypIdSt() {
        return ssdtCodeColprotypIdSt;
    }

    @JsonProperty("ssdtCodeColprotypIdSt")
    public void setSsdtCodeColprotypIdSt(String ssdtCodeColprotypIdSt) {
        this.ssdtCodeColprotypIdSt = ssdtCodeColprotypIdSt;
    }

    public Sobencp withSsdtCodeColprotypIdSt(String ssdtCodeColprotypIdSt) {
        this.ssdtCodeColprotypIdSt = ssdtCodeColprotypIdSt;
        return this;
    }

    /**
     * Lineage reference object : SOBENCP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBENCP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobencp withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Collaborative Provision Type
     * <p>
     * Lineage reference object : SOBENCP_SSDT_CODE_COLPROTYP_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeColprotypId")
    public String getSsdtCodeColprotypId() {
        return ssdtCodeColprotypId;
    }

    /**
     * Collaborative Provision Type
     * <p>
     * Lineage reference object : SOBENCP_SSDT_CODE_COLPROTYP_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeColprotypId")
    public void setSsdtCodeColprotypId(String ssdtCodeColprotypId) {
        this.ssdtCodeColprotypId = ssdtCodeColprotypId;
    }

    public Sobencp withSsdtCodeColprotypId(String ssdtCodeColprotypId) {
        this.ssdtCodeColprotypId = ssdtCodeColprotypId;
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

    public Sobencp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobencp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("partnerSid");
        sb.append('=');
        sb.append(((this.partnerSid == null)?"<null>":this.partnerSid));
        sb.append(',');
        sb.append("partnerUkprn");
        sb.append('=');
        sb.append(((this.partnerUkprn == null)?"<null>":this.partnerUkprn));
        sb.append(',');
        sb.append("partnerNumhus");
        sb.append('=');
        sb.append(((this.partnerNumhus == null)?"<null>":this.partnerNumhus));
        sb.append(',');
        sb.append("ssdtCodeColprotypIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeColprotypIdSt == null)?"<null>":this.ssdtCodeColprotypIdSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeColprotypId");
        sb.append('=');
        sb.append(((this.ssdtCodeColprotypId == null)?"<null>":this.ssdtCodeColprotypId));
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
        result = ((result* 31)+((this.partnerSid == null)? 0 :this.partnerSid.hashCode()));
        result = ((result* 31)+((this.partnerUkprn == null)? 0 :this.partnerUkprn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.partnerNumhus == null)? 0 :this.partnerNumhus.hashCode()));
        result = ((result* 31)+((this.ssdtCodeColprotypIdSt == null)? 0 :this.ssdtCodeColprotypIdSt.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeColprotypId == null)? 0 :this.ssdtCodeColprotypId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobencp) == false) {
            return false;
        }
        Sobencp rhs = ((Sobencp) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.partnerSid == rhs.partnerSid)||((this.partnerSid!= null)&&this.partnerSid.equals(rhs.partnerSid))))&&((this.partnerUkprn == rhs.partnerUkprn)||((this.partnerUkprn!= null)&&this.partnerUkprn.equals(rhs.partnerUkprn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.partnerNumhus == rhs.partnerNumhus)||((this.partnerNumhus!= null)&&this.partnerNumhus.equals(rhs.partnerNumhus))))&&((this.ssdtCodeColprotypIdSt == rhs.ssdtCodeColprotypIdSt)||((this.ssdtCodeColprotypIdSt!= null)&&this.ssdtCodeColprotypIdSt.equals(rhs.ssdtCodeColprotypIdSt))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeColprotypId == rhs.ssdtCodeColprotypId)||((this.ssdtCodeColprotypId!= null)&&this.ssdtCodeColprotypId.equals(rhs.ssdtCodeColprotypId))));
    }

}
