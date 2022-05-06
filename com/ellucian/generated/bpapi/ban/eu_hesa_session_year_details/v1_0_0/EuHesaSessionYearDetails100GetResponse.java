
package com.ellucian.generated.bpapi.ban.eu_hesa_session_year_details.v1_0_0;

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
    "endDate",
    "ownSessionYrId",
    "id",
    "userId",
    "startDate"
})
@Generated("jsonschema2pojo")
public class EuHesaSessionYearDetails100GetResponse {

    /**
     * Lineage reference object : SORSSYR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORSSYR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Session Year End Date
     * <p>
     * Lineage reference object : SORSSYR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SORSSYR_END_DATE")
    private Date endDate;
    /**
     * Own Session Year Identifier
     * <p>
     * Lineage reference object : SORSSYR_OWN_SESSION_YR_ID
     * 
     */
    @JsonProperty("ownSessionYrId")
    @JsonPropertyDescription("Lineage reference object : SORSSYR_OWN_SESSION_YR_ID")
    private String ownSessionYrId;
    /**
     * Session Year Identifier
     * <p>
     * Lineage reference object : SORSSYR_ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : SORSSYR_ID")
    private String id;
    /**
     * Lineage reference object : SORSSYR_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORSSYR_USER_ID")
    private String userId;
    /**
     * Session Year Start Date
     * <p>
     * Lineage reference object : SORSSYR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SORSSYR_START_DATE")
    private Date startDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORSSYR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORSSYR_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EuHesaSessionYearDetails100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Session Year End Date
     * <p>
     * Lineage reference object : SORSSYR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Session Year End Date
     * <p>
     * Lineage reference object : SORSSYR_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public EuHesaSessionYearDetails100GetResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Own Session Year Identifier
     * <p>
     * Lineage reference object : SORSSYR_OWN_SESSION_YR_ID
     * 
     */
    @JsonProperty("ownSessionYrId")
    public String getOwnSessionYrId() {
        return ownSessionYrId;
    }

    /**
     * Own Session Year Identifier
     * <p>
     * Lineage reference object : SORSSYR_OWN_SESSION_YR_ID
     * 
     */
    @JsonProperty("ownSessionYrId")
    public void setOwnSessionYrId(String ownSessionYrId) {
        this.ownSessionYrId = ownSessionYrId;
    }

    public EuHesaSessionYearDetails100GetResponse withOwnSessionYrId(String ownSessionYrId) {
        this.ownSessionYrId = ownSessionYrId;
        return this;
    }

    /**
     * Session Year Identifier
     * <p>
     * Lineage reference object : SORSSYR_ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Session Year Identifier
     * <p>
     * Lineage reference object : SORSSYR_ID
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EuHesaSessionYearDetails100GetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Lineage reference object : SORSSYR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORSSYR_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EuHesaSessionYearDetails100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Session Year Start Date
     * <p>
     * Lineage reference object : SORSSYR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Session Year Start Date
     * <p>
     * Lineage reference object : SORSSYR_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public EuHesaSessionYearDetails100GetResponse withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public EuHesaSessionYearDetails100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaSessionYearDetails100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("ownSessionYrId");
        sb.append('=');
        sb.append(((this.ownSessionYrId == null)?"<null>":this.ownSessionYrId));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.ownSessionYrId == null)? 0 :this.ownSessionYrId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaSessionYearDetails100GetResponse) == false) {
            return false;
        }
        EuHesaSessionYearDetails100GetResponse rhs = ((EuHesaSessionYearDetails100GetResponse) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.ownSessionYrId == rhs.ownSessionYrId)||((this.ownSessionYrId!= null)&&this.ownSessionYrId.equals(rhs.ownSessionYrId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
