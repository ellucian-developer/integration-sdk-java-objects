
package com.ellucian.generated.bpapi.ban.user_profile_maintenance.v1_0_0;

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
    "userId"
})
@Generated("jsonschema2pojo")
public class UserProfileMaintenance100GetRequest {

    /**
     * User ID
     * <p>
     * Lineage reference object : keyBlockUserId, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : keyBlockUserId, Lookup lineage reference object : all_users")
    private Object userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * User ID
     * <p>
     * Lineage reference object : keyBlockUserId, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public Object getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : keyBlockUserId, Lookup lineage reference object : all_users
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public UserProfileMaintenance100GetRequest withUserId(Object userId) {
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

    public UserProfileMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserProfileMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserProfileMaintenance100GetRequest) == false) {
            return false;
        }
        UserProfileMaintenance100GetRequest rhs = ((UserProfileMaintenance100GetRequest) other);
        return (((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
