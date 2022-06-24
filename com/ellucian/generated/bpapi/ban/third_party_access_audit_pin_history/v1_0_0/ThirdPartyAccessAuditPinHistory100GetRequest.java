
package com.ellucian.generated.bpapi.ban.third_party_access_audit_pin_history.v1_0_0;

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
    "externalUser",
    "activityDate",
    "gorpaudUser",
    "ldapUser",
    "pinExpDate",
    "insertSource",
    "id",
    "pinDisabledInd",
    "usageAcceptInd",
    "gorpaudActivityDate",
    "user"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccessAuditPinHistory100GetRequest {

    /**
     * Third Party ID
     * <p>
     * Lineage reference object : GOBTPAC_EXTERNAL_USER
     * 
     */
    @JsonProperty("externalUser")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_EXTERNAL_USER")
    private String externalUser;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBTPAC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_ACTIVITY_DATE")
    private Date activityDate;
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
     * LDAP User  ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("ldapUser")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_LDAP_USER")
    private String ldapUser;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("pinExpDate")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN_EXP_DATE")
    private Date pinExpDate;
    /**
     * Activity Source
     * <p>
     * Lineage reference object : GOBTPAC_INSERT_SOURCE
     * 
     */
    @JsonProperty("insertSource")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_INSERT_SOURCE")
    private String insertSource;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("pinDisabledInd")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN_DISABLED_IND")
    private String pinDisabledInd;
    /**
     * Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("usageAcceptInd")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND")
    private String usageAcceptInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORPAUD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("gorpaudActivityDate")
    @JsonPropertyDescription("Lineage reference object : GORPAUD_ACTIVITY_DATE")
    private Date gorpaudActivityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : GOBTPAC_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_USER")
    private String user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Third Party ID
     * <p>
     * Lineage reference object : GOBTPAC_EXTERNAL_USER
     * 
     */
    @JsonProperty("externalUser")
    public String getExternalUser() {
        return externalUser;
    }

    /**
     * Third Party ID
     * <p>
     * Lineage reference object : GOBTPAC_EXTERNAL_USER
     * 
     */
    @JsonProperty("externalUser")
    public void setExternalUser(String externalUser) {
        this.externalUser = externalUser;
    }

    public ThirdPartyAccessAuditPinHistory100GetRequest withExternalUser(String externalUser) {
        this.externalUser = externalUser;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBTPAC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBTPAC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ThirdPartyAccessAuditPinHistory100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public ThirdPartyAccessAuditPinHistory100GetRequest withGorpaudUser(String gorpaudUser) {
        this.gorpaudUser = gorpaudUser;
        return this;
    }

    /**
     * LDAP User  ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("ldapUser")
    public String getLdapUser() {
        return ldapUser;
    }

    /**
     * LDAP User  ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("ldapUser")
    public void setLdapUser(String ldapUser) {
        this.ldapUser = ldapUser;
    }

    public ThirdPartyAccessAuditPinHistory100GetRequest withLdapUser(String ldapUser) {
        this.ldapUser = ldapUser;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("pinExpDate")
    public Date getPinExpDate() {
        return pinExpDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("pinExpDate")
    public void setPinExpDate(Date pinExpDate) {
        this.pinExpDate = pinExpDate;
    }

    public ThirdPartyAccessAuditPinHistory100GetRequest withPinExpDate(Date pinExpDate) {
        this.pinExpDate = pinExpDate;
        return this;
    }

    /**
     * Activity Source
     * <p>
     * Lineage reference object : GOBTPAC_INSERT_SOURCE
     * 
     */
    @JsonProperty("insertSource")
    public String getInsertSource() {
        return insertSource;
    }

    /**
     * Activity Source
     * <p>
     * Lineage reference object : GOBTPAC_INSERT_SOURCE
     * 
     */
    @JsonProperty("insertSource")
    public void setInsertSource(String insertSource) {
        this.insertSource = insertSource;
    }

    public ThirdPartyAccessAuditPinHistory100GetRequest withInsertSource(String insertSource) {
        this.insertSource = insertSource;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ThirdPartyAccessAuditPinHistory100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("pinDisabledInd")
    public String getPinDisabledInd() {
        return pinDisabledInd;
    }

    /**
     * Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("pinDisabledInd")
    public void setPinDisabledInd(String pinDisabledInd) {
        this.pinDisabledInd = pinDisabledInd;
    }

    public ThirdPartyAccessAuditPinHistory100GetRequest withPinDisabledInd(String pinDisabledInd) {
        this.pinDisabledInd = pinDisabledInd;
        return this;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("usageAcceptInd")
    public String getUsageAcceptInd() {
        return usageAcceptInd;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("usageAcceptInd")
    public void setUsageAcceptInd(String usageAcceptInd) {
        this.usageAcceptInd = usageAcceptInd;
    }

    public ThirdPartyAccessAuditPinHistory100GetRequest withUsageAcceptInd(String usageAcceptInd) {
        this.usageAcceptInd = usageAcceptInd;
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

    public ThirdPartyAccessAuditPinHistory100GetRequest withGorpaudActivityDate(Date gorpaudActivityDate) {
        this.gorpaudActivityDate = gorpaudActivityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GOBTPAC_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GOBTPAC_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public ThirdPartyAccessAuditPinHistory100GetRequest withUser(String user) {
        this.user = user;
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

    public ThirdPartyAccessAuditPinHistory100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccessAuditPinHistory100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("externalUser");
        sb.append('=');
        sb.append(((this.externalUser == null)?"<null>":this.externalUser));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("gorpaudUser");
        sb.append('=');
        sb.append(((this.gorpaudUser == null)?"<null>":this.gorpaudUser));
        sb.append(',');
        sb.append("ldapUser");
        sb.append('=');
        sb.append(((this.ldapUser == null)?"<null>":this.ldapUser));
        sb.append(',');
        sb.append("pinExpDate");
        sb.append('=');
        sb.append(((this.pinExpDate == null)?"<null>":this.pinExpDate));
        sb.append(',');
        sb.append("insertSource");
        sb.append('=');
        sb.append(((this.insertSource == null)?"<null>":this.insertSource));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("pinDisabledInd");
        sb.append('=');
        sb.append(((this.pinDisabledInd == null)?"<null>":this.pinDisabledInd));
        sb.append(',');
        sb.append("usageAcceptInd");
        sb.append('=');
        sb.append(((this.usageAcceptInd == null)?"<null>":this.usageAcceptInd));
        sb.append(',');
        sb.append("gorpaudActivityDate");
        sb.append('=');
        sb.append(((this.gorpaudActivityDate == null)?"<null>":this.gorpaudActivityDate));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.pinExpDate == null)? 0 :this.pinExpDate.hashCode()));
        result = ((result* 31)+((this.usageAcceptInd == null)? 0 :this.usageAcceptInd.hashCode()));
        result = ((result* 31)+((this.gorpaudActivityDate == null)? 0 :this.gorpaudActivityDate.hashCode()));
        result = ((result* 31)+((this.externalUser == null)? 0 :this.externalUser.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.gorpaudUser == null)? 0 :this.gorpaudUser.hashCode()));
        result = ((result* 31)+((this.ldapUser == null)? 0 :this.ldapUser.hashCode()));
        result = ((result* 31)+((this.insertSource == null)? 0 :this.insertSource.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.pinDisabledInd == null)? 0 :this.pinDisabledInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccessAuditPinHistory100GetRequest) == false) {
            return false;
        }
        ThirdPartyAccessAuditPinHistory100GetRequest rhs = ((ThirdPartyAccessAuditPinHistory100GetRequest) other);
        return (((((((((((((this.pinExpDate == rhs.pinExpDate)||((this.pinExpDate!= null)&&this.pinExpDate.equals(rhs.pinExpDate)))&&((this.usageAcceptInd == rhs.usageAcceptInd)||((this.usageAcceptInd!= null)&&this.usageAcceptInd.equals(rhs.usageAcceptInd))))&&((this.gorpaudActivityDate == rhs.gorpaudActivityDate)||((this.gorpaudActivityDate!= null)&&this.gorpaudActivityDate.equals(rhs.gorpaudActivityDate))))&&((this.externalUser == rhs.externalUser)||((this.externalUser!= null)&&this.externalUser.equals(rhs.externalUser))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.gorpaudUser == rhs.gorpaudUser)||((this.gorpaudUser!= null)&&this.gorpaudUser.equals(rhs.gorpaudUser))))&&((this.ldapUser == rhs.ldapUser)||((this.ldapUser!= null)&&this.ldapUser.equals(rhs.ldapUser))))&&((this.insertSource == rhs.insertSource)||((this.insertSource!= null)&&this.insertSource.equals(rhs.insertSource))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.pinDisabledInd == rhs.pinDisabledInd)||((this.pinDisabledInd!= null)&&this.pinDisabledInd.equals(rhs.pinDisabledInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
