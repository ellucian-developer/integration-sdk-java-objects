
package com.ellucian.generated.bpapi.ban.entreprise_access_control.v1_0_0;

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
    "wacsId",
    "activityDate",
    "userId",
    "username"
})
@Generated("jsonschema2pojo")
public class EntrepriseAccessControl100GetRequest {

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("wacsId")
    private String wacsId;
    /**
     * Gobwacs Activity Date
     * <p>
     * Lineage reference object : GOBEACC_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GOBEACC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : GOBEACC_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GOBEACC_USER_ID")
    private String userId;
    /**
     * Gobwacs User Id
     * <p>
     * Lineage reference object : GOBEACC_USERNAME, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Lineage reference object : GOBEACC_USERNAME, Lookup lineage reference object : all_users")
    private String username;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("wacsId")
    public String getWacsId() {
        return wacsId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("wacsId")
    public void setWacsId(String wacsId) {
        this.wacsId = wacsId;
    }

    public EntrepriseAccessControl100GetRequest withWacsId(String wacsId) {
        this.wacsId = wacsId;
        return this;
    }

    /**
     * Gobwacs Activity Date
     * <p>
     * Lineage reference object : GOBEACC_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Gobwacs Activity Date
     * <p>
     * Lineage reference object : GOBEACC_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EntrepriseAccessControl100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : GOBEACC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : GOBEACC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EntrepriseAccessControl100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Gobwacs User Id
     * <p>
     * Lineage reference object : GOBEACC_USERNAME, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Gobwacs User Id
     * <p>
     * Lineage reference object : GOBEACC_USERNAME, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public EntrepriseAccessControl100GetRequest withUsername(String username) {
        this.username = username;
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

    public EntrepriseAccessControl100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntrepriseAccessControl100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wacsId");
        sb.append('=');
        sb.append(((this.wacsId == null)?"<null>":this.wacsId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
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
        result = ((result* 31)+((this.wacsId == null)? 0 :this.wacsId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntrepriseAccessControl100GetRequest) == false) {
            return false;
        }
        EntrepriseAccessControl100GetRequest rhs = ((EntrepriseAccessControl100GetRequest) other);
        return ((((((this.wacsId == rhs.wacsId)||((this.wacsId!= null)&&this.wacsId.equals(rhs.wacsId)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
