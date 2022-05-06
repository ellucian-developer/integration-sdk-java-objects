
package com.ellucian.generated.bpapi.ban.eu_hesa_qualification_details.v1_0_0;

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
    "ssdtCodeRelationship",
    "ssdtCodeRelationshipSt",
    "userId",
    "ssdtCodeAwrdBdyId",
    "ssdtCodeAwrdBdyIdSt"
})
@Generated("jsonschema2pojo")
public class Sorawbr {

    /**
     * Lineage reference object : SORAWBR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORAWBR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Relationship
     * <p>
     * Lineage reference object : SORAWBR_SSDT_CODE_RELATIONSHIP
     * 
     */
    @JsonProperty("ssdtCodeRelationship")
    @JsonPropertyDescription("Lineage reference object : SORAWBR_SSDT_CODE_RELATIONSHIP")
    private String ssdtCodeRelationship;
    /**
     * Relationship Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeRelationshipSt")
    private String ssdtCodeRelationshipSt;
    /**
     * Lineage reference object : SORAWBR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORAWBR_USER_ID")
    private String userId;
    /**
     * Awarding Body Identifier
     * <p>
     * Lineage reference object : SORAWBR_SSDT_CODE_AWRD_BDY_ID
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeAwrdBdyId")
    @JsonPropertyDescription("Lineage reference object : SORAWBR_SSDT_CODE_AWRD_BDY_ID")
    private String ssdtCodeAwrdBdyId;
    /**
     * Awarding Body Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAwrdBdyIdSt")
    private String ssdtCodeAwrdBdyIdSt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORAWBR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORAWBR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorawbr withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SORAWBR_SSDT_CODE_RELATIONSHIP
     * 
     */
    @JsonProperty("ssdtCodeRelationship")
    public String getSsdtCodeRelationship() {
        return ssdtCodeRelationship;
    }

    /**
     * Relationship
     * <p>
     * Lineage reference object : SORAWBR_SSDT_CODE_RELATIONSHIP
     * 
     */
    @JsonProperty("ssdtCodeRelationship")
    public void setSsdtCodeRelationship(String ssdtCodeRelationship) {
        this.ssdtCodeRelationship = ssdtCodeRelationship;
    }

    public Sorawbr withSsdtCodeRelationship(String ssdtCodeRelationship) {
        this.ssdtCodeRelationship = ssdtCodeRelationship;
        return this;
    }

    /**
     * Relationship Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeRelationshipSt")
    public String getSsdtCodeRelationshipSt() {
        return ssdtCodeRelationshipSt;
    }

    /**
     * Relationship Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeRelationshipSt")
    public void setSsdtCodeRelationshipSt(String ssdtCodeRelationshipSt) {
        this.ssdtCodeRelationshipSt = ssdtCodeRelationshipSt;
    }

    public Sorawbr withSsdtCodeRelationshipSt(String ssdtCodeRelationshipSt) {
        this.ssdtCodeRelationshipSt = ssdtCodeRelationshipSt;
        return this;
    }

    /**
     * Lineage reference object : SORAWBR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORAWBR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorawbr withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Awarding Body Identifier
     * <p>
     * Lineage reference object : SORAWBR_SSDT_CODE_AWRD_BDY_ID
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeAwrdBdyId")
    public String getSsdtCodeAwrdBdyId() {
        return ssdtCodeAwrdBdyId;
    }

    /**
     * Awarding Body Identifier
     * <p>
     * Lineage reference object : SORAWBR_SSDT_CODE_AWRD_BDY_ID
     * (Required)
     * 
     */
    @JsonProperty("ssdtCodeAwrdBdyId")
    public void setSsdtCodeAwrdBdyId(String ssdtCodeAwrdBdyId) {
        this.ssdtCodeAwrdBdyId = ssdtCodeAwrdBdyId;
    }

    public Sorawbr withSsdtCodeAwrdBdyId(String ssdtCodeAwrdBdyId) {
        this.ssdtCodeAwrdBdyId = ssdtCodeAwrdBdyId;
        return this;
    }

    /**
     * Awarding Body Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAwrdBdyIdSt")
    public String getSsdtCodeAwrdBdyIdSt() {
        return ssdtCodeAwrdBdyIdSt;
    }

    /**
     * Awarding Body Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeAwrdBdyIdSt")
    public void setSsdtCodeAwrdBdyIdSt(String ssdtCodeAwrdBdyIdSt) {
        this.ssdtCodeAwrdBdyIdSt = ssdtCodeAwrdBdyIdSt;
    }

    public Sorawbr withSsdtCodeAwrdBdyIdSt(String ssdtCodeAwrdBdyIdSt) {
        this.ssdtCodeAwrdBdyIdSt = ssdtCodeAwrdBdyIdSt;
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

    public Sorawbr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorawbr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ssdtCodeRelationship");
        sb.append('=');
        sb.append(((this.ssdtCodeRelationship == null)?"<null>":this.ssdtCodeRelationship));
        sb.append(',');
        sb.append("ssdtCodeRelationshipSt");
        sb.append('=');
        sb.append(((this.ssdtCodeRelationshipSt == null)?"<null>":this.ssdtCodeRelationshipSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeAwrdBdyId");
        sb.append('=');
        sb.append(((this.ssdtCodeAwrdBdyId == null)?"<null>":this.ssdtCodeAwrdBdyId));
        sb.append(',');
        sb.append("ssdtCodeAwrdBdyIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeAwrdBdyIdSt == null)?"<null>":this.ssdtCodeAwrdBdyIdSt));
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
        result = ((result* 31)+((this.ssdtCodeRelationship == null)? 0 :this.ssdtCodeRelationship.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRelationshipSt == null)? 0 :this.ssdtCodeRelationshipSt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAwrdBdyId == null)? 0 :this.ssdtCodeAwrdBdyId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeAwrdBdyIdSt == null)? 0 :this.ssdtCodeAwrdBdyIdSt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorawbr) == false) {
            return false;
        }
        Sorawbr rhs = ((Sorawbr) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.ssdtCodeRelationship == rhs.ssdtCodeRelationship)||((this.ssdtCodeRelationship!= null)&&this.ssdtCodeRelationship.equals(rhs.ssdtCodeRelationship))))&&((this.ssdtCodeRelationshipSt == rhs.ssdtCodeRelationshipSt)||((this.ssdtCodeRelationshipSt!= null)&&this.ssdtCodeRelationshipSt.equals(rhs.ssdtCodeRelationshipSt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeAwrdBdyId == rhs.ssdtCodeAwrdBdyId)||((this.ssdtCodeAwrdBdyId!= null)&&this.ssdtCodeAwrdBdyId.equals(rhs.ssdtCodeAwrdBdyId))))&&((this.ssdtCodeAwrdBdyIdSt == rhs.ssdtCodeAwrdBdyIdSt)||((this.ssdtCodeAwrdBdyIdSt!= null)&&this.ssdtCodeAwrdBdyIdSt.equals(rhs.ssdtCodeAwrdBdyIdSt))));
    }

}
