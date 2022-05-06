
package com.ellucian.generated.bpapi.ban.third_party_access_audit_third_party_history.v1_0_0;

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
    "gorpaudExternalUser",
    "gorpaudUser",
    "id",
    "gorpaudActivityDate"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccessAuditThirdPartyHistory100GetRequest {

    /**
     * Third Party ID
     * <p>
     * Lineage reference object : GORPAUD_EXTERNAL_USER
     * 
     */
    @JsonProperty("gorpaudExternalUser")
    @JsonPropertyDescription("Lineage reference object : GORPAUD_EXTERNAL_USER")
    private String gorpaudExternalUser;
    /**
     * User ID
     * <p>
     * Lineage reference object : GORPAUD_USER
     * 
     */
    @JsonProperty("gorpaudUser")
    @JsonPropertyDescription("Lineage reference object : GORPAUD_USER")
    private String gorpaudUser;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORPAUD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("gorpaudActivityDate")
    @JsonPropertyDescription("Lineage reference object : GORPAUD_ACTIVITY_DATE")
    private Date gorpaudActivityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Third Party ID
     * <p>
     * Lineage reference object : GORPAUD_EXTERNAL_USER
     * 
     */
    @JsonProperty("gorpaudExternalUser")
    public String getGorpaudExternalUser() {
        return gorpaudExternalUser;
    }

    /**
     * Third Party ID
     * <p>
     * Lineage reference object : GORPAUD_EXTERNAL_USER
     * 
     */
    @JsonProperty("gorpaudExternalUser")
    public void setGorpaudExternalUser(String gorpaudExternalUser) {
        this.gorpaudExternalUser = gorpaudExternalUser;
    }

    public ThirdPartyAccessAuditThirdPartyHistory100GetRequest withGorpaudExternalUser(String gorpaudExternalUser) {
        this.gorpaudExternalUser = gorpaudExternalUser;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GORPAUD_USER
     * 
     */
    @JsonProperty("gorpaudUser")
    public String getGorpaudUser() {
        return gorpaudUser;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GORPAUD_USER
     * 
     */
    @JsonProperty("gorpaudUser")
    public void setGorpaudUser(String gorpaudUser) {
        this.gorpaudUser = gorpaudUser;
    }

    public ThirdPartyAccessAuditThirdPartyHistory100GetRequest withGorpaudUser(String gorpaudUser) {
        this.gorpaudUser = gorpaudUser;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public ThirdPartyAccessAuditThirdPartyHistory100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORPAUD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("gorpaudActivityDate")
    public Date getGorpaudActivityDate() {
        return gorpaudActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORPAUD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("gorpaudActivityDate")
    public void setGorpaudActivityDate(Date gorpaudActivityDate) {
        this.gorpaudActivityDate = gorpaudActivityDate;
    }

    public ThirdPartyAccessAuditThirdPartyHistory100GetRequest withGorpaudActivityDate(Date gorpaudActivityDate) {
        this.gorpaudActivityDate = gorpaudActivityDate;
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

    public ThirdPartyAccessAuditThirdPartyHistory100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccessAuditThirdPartyHistory100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gorpaudExternalUser");
        sb.append('=');
        sb.append(((this.gorpaudExternalUser == null)?"<null>":this.gorpaudExternalUser));
        sb.append(',');
        sb.append("gorpaudUser");
        sb.append('=');
        sb.append(((this.gorpaudUser == null)?"<null>":this.gorpaudUser));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("gorpaudActivityDate");
        sb.append('=');
        sb.append(((this.gorpaudActivityDate == null)?"<null>":this.gorpaudActivityDate));
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
        result = ((result* 31)+((this.gorpaudExternalUser == null)? 0 :this.gorpaudExternalUser.hashCode()));
        result = ((result* 31)+((this.gorpaudUser == null)? 0 :this.gorpaudUser.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.gorpaudActivityDate == null)? 0 :this.gorpaudActivityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccessAuditThirdPartyHistory100GetRequest) == false) {
            return false;
        }
        ThirdPartyAccessAuditThirdPartyHistory100GetRequest rhs = ((ThirdPartyAccessAuditThirdPartyHistory100GetRequest) other);
        return ((((((this.gorpaudExternalUser == rhs.gorpaudExternalUser)||((this.gorpaudExternalUser!= null)&&this.gorpaudExternalUser.equals(rhs.gorpaudExternalUser)))&&((this.gorpaudUser == rhs.gorpaudUser)||((this.gorpaudUser!= null)&&this.gorpaudUser.equals(rhs.gorpaudUser))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.gorpaudActivityDate == rhs.gorpaudActivityDate)||((this.gorpaudActivityDate!= null)&&this.gorpaudActivityDate.equals(rhs.gorpaudActivityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
