
package com.ellucian.generated.bpapi.ban.eu_hesa_venue_details.v1_0_0;

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
    "id",
    "name",
    "ssdtCodeVenuetype",
    "ssdtCodeVenuetypeSt",
    "ukprn",
    "postcode",
    "ownvenueid",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class EuHesaVenueDetails100QapiPost {

    /**
     * Venue Identifier
     * <p>
     * Lineage reference object : SORVENU_ID
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : SORVENU_ID")
    private String id;
    /**
     * Venue Name
     * <p>
     * Lineage reference object : SORVENU_NAME
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Lineage reference object : SORVENU_NAME")
    private String name;
    /**
     * Venue Type
     * <p>
     * Lineage reference object : SORVENU_SSDT_CODE_VENUETYPE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeVenuetype")
    @JsonPropertyDescription("Lineage reference object : SORVENU_SSDT_CODE_VENUETYPE, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeVenuetype;
    /**
     * Venue Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeVenuetypeSt")
    private String ssdtCodeVenuetypeSt;
    /**
     * Venue UKPRN
     * <p>
     * Lineage reference object : SORVENU_UKPRN
     * 
     */
    @JsonProperty("ukprn")
    @JsonPropertyDescription("Lineage reference object : SORVENU_UKPRN")
    private String ukprn;
    /**
     * Postcode
     * <p>
     * Lineage reference object : SORVENU_POSTCODE
     * 
     */
    @JsonProperty("postcode")
    @JsonPropertyDescription("Lineage reference object : SORVENU_POSTCODE")
    private String postcode;
    /**
     * Own Venue Identifier
     * <p>
     * Lineage reference object : SORVENU_OWNVENUEID
     * 
     */
    @JsonProperty("ownvenueid")
    @JsonPropertyDescription("Lineage reference object : SORVENU_OWNVENUEID")
    private String ownvenueid;
    /**
     * Lineage reference object : SORVENU_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORVENU_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SORVENU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORVENU_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Venue Identifier
     * <p>
     * Lineage reference object : SORVENU_ID
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Venue Identifier
     * <p>
     * Lineage reference object : SORVENU_ID
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EuHesaVenueDetails100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Venue Name
     * <p>
     * Lineage reference object : SORVENU_NAME
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Venue Name
     * <p>
     * Lineage reference object : SORVENU_NAME
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public EuHesaVenueDetails100QapiPost withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Venue Type
     * <p>
     * Lineage reference object : SORVENU_SSDT_CODE_VENUETYPE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeVenuetype")
    public String getSsdtCodeVenuetype() {
        return ssdtCodeVenuetype;
    }

    /**
     * Venue Type
     * <p>
     * Lineage reference object : SORVENU_SSDT_CODE_VENUETYPE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeVenuetype")
    public void setSsdtCodeVenuetype(String ssdtCodeVenuetype) {
        this.ssdtCodeVenuetype = ssdtCodeVenuetype;
    }

    public EuHesaVenueDetails100QapiPost withSsdtCodeVenuetype(String ssdtCodeVenuetype) {
        this.ssdtCodeVenuetype = ssdtCodeVenuetype;
        return this;
    }

    /**
     * Venue Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeVenuetypeSt")
    public String getSsdtCodeVenuetypeSt() {
        return ssdtCodeVenuetypeSt;
    }

    /**
     * Venue Type Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeVenuetypeSt")
    public void setSsdtCodeVenuetypeSt(String ssdtCodeVenuetypeSt) {
        this.ssdtCodeVenuetypeSt = ssdtCodeVenuetypeSt;
    }

    public EuHesaVenueDetails100QapiPost withSsdtCodeVenuetypeSt(String ssdtCodeVenuetypeSt) {
        this.ssdtCodeVenuetypeSt = ssdtCodeVenuetypeSt;
        return this;
    }

    /**
     * Venue UKPRN
     * <p>
     * Lineage reference object : SORVENU_UKPRN
     * 
     */
    @JsonProperty("ukprn")
    public String getUkprn() {
        return ukprn;
    }

    /**
     * Venue UKPRN
     * <p>
     * Lineage reference object : SORVENU_UKPRN
     * 
     */
    @JsonProperty("ukprn")
    public void setUkprn(String ukprn) {
        this.ukprn = ukprn;
    }

    public EuHesaVenueDetails100QapiPost withUkprn(String ukprn) {
        this.ukprn = ukprn;
        return this;
    }

    /**
     * Postcode
     * <p>
     * Lineage reference object : SORVENU_POSTCODE
     * 
     */
    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    /**
     * Postcode
     * <p>
     * Lineage reference object : SORVENU_POSTCODE
     * 
     */
    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public EuHesaVenueDetails100QapiPost withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    /**
     * Own Venue Identifier
     * <p>
     * Lineage reference object : SORVENU_OWNVENUEID
     * 
     */
    @JsonProperty("ownvenueid")
    public String getOwnvenueid() {
        return ownvenueid;
    }

    /**
     * Own Venue Identifier
     * <p>
     * Lineage reference object : SORVENU_OWNVENUEID
     * 
     */
    @JsonProperty("ownvenueid")
    public void setOwnvenueid(String ownvenueid) {
        this.ownvenueid = ownvenueid;
    }

    public EuHesaVenueDetails100QapiPost withOwnvenueid(String ownvenueid) {
        this.ownvenueid = ownvenueid;
        return this;
    }

    /**
     * Lineage reference object : SORVENU_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORVENU_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EuHesaVenueDetails100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Lineage reference object : SORVENU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORVENU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EuHesaVenueDetails100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public EuHesaVenueDetails100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaVenueDetails100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("ssdtCodeVenuetype");
        sb.append('=');
        sb.append(((this.ssdtCodeVenuetype == null)?"<null>":this.ssdtCodeVenuetype));
        sb.append(',');
        sb.append("ssdtCodeVenuetypeSt");
        sb.append('=');
        sb.append(((this.ssdtCodeVenuetypeSt == null)?"<null>":this.ssdtCodeVenuetypeSt));
        sb.append(',');
        sb.append("ukprn");
        sb.append('=');
        sb.append(((this.ukprn == null)?"<null>":this.ukprn));
        sb.append(',');
        sb.append("postcode");
        sb.append('=');
        sb.append(((this.postcode == null)?"<null>":this.postcode));
        sb.append(',');
        sb.append("ownvenueid");
        sb.append('=');
        sb.append(((this.ownvenueid == null)?"<null>":this.ownvenueid));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.ownvenueid == null)? 0 :this.ownvenueid.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeVenuetype == null)? 0 :this.ssdtCodeVenuetype.hashCode()));
        result = ((result* 31)+((this.ukprn == null)? 0 :this.ukprn.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.ssdtCodeVenuetypeSt == null)? 0 :this.ssdtCodeVenuetypeSt.hashCode()));
        result = ((result* 31)+((this.postcode == null)? 0 :this.postcode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaVenueDetails100QapiPost) == false) {
            return false;
        }
        EuHesaVenueDetails100QapiPost rhs = ((EuHesaVenueDetails100QapiPost) other);
        return (((((((((((this.ownvenueid == rhs.ownvenueid)||((this.ownvenueid!= null)&&this.ownvenueid.equals(rhs.ownvenueid)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeVenuetype == rhs.ssdtCodeVenuetype)||((this.ssdtCodeVenuetype!= null)&&this.ssdtCodeVenuetype.equals(rhs.ssdtCodeVenuetype))))&&((this.ukprn == rhs.ukprn)||((this.ukprn!= null)&&this.ukprn.equals(rhs.ukprn))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.ssdtCodeVenuetypeSt == rhs.ssdtCodeVenuetypeSt)||((this.ssdtCodeVenuetypeSt!= null)&&this.ssdtCodeVenuetypeSt.equals(rhs.ssdtCodeVenuetypeSt))))&&((this.postcode == rhs.postcode)||((this.postcode!= null)&&this.postcode.equals(rhs.postcode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
