
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
    "ldapUser",
    "pin",
    "pinExpDate",
    "lastAccessDate",
    "gobsridSourcedId",
    "insertSource",
    "pinDisabledInd",
    "usageAcceptInd",
    "displayNewPinConfirm",
    "user"
})
@Generated("jsonschema2pojo")
public class Gobtpac__2 {

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
     * LDAP User  ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("ldapUser")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_LDAP_USER")
    private String ldapUser;
    /**
     * PIN
     * <p>
     * Lineage reference object : GOBTPAC_PIN
     * 
     */
    @JsonProperty("pin")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN")
    private String pin;
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
     * Last Web Access Date
     * <p>
     * 
     * 
     */
    @JsonProperty("lastAccessDate")
    private Date lastAccessDate;
    /**
     * Sourced ID
     * <p>
     * 
     * 
     */
    @JsonProperty("gobsridSourcedId")
    private String gobsridSourcedId;
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
     * Confirm New PIN
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNewPinConfirm")
    private String displayNewPinConfirm;
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

    public Gobtpac__2 withExternalUser(String externalUser) {
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

    public Gobtpac__2 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public Gobtpac__2 withLdapUser(String ldapUser) {
        this.ldapUser = ldapUser;
        return this;
    }

    /**
     * PIN
     * <p>
     * Lineage reference object : GOBTPAC_PIN
     * 
     */
    @JsonProperty("pin")
    public String getPin() {
        return pin;
    }

    /**
     * PIN
     * <p>
     * Lineage reference object : GOBTPAC_PIN
     * 
     */
    @JsonProperty("pin")
    public void setPin(String pin) {
        this.pin = pin;
    }

    public Gobtpac__2 withPin(String pin) {
        this.pin = pin;
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

    public Gobtpac__2 withPinExpDate(Date pinExpDate) {
        this.pinExpDate = pinExpDate;
        return this;
    }

    /**
     * Last Web Access Date
     * <p>
     * 
     * 
     */
    @JsonProperty("lastAccessDate")
    public Date getLastAccessDate() {
        return lastAccessDate;
    }

    /**
     * Last Web Access Date
     * <p>
     * 
     * 
     */
    @JsonProperty("lastAccessDate")
    public void setLastAccessDate(Date lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
    }

    public Gobtpac__2 withLastAccessDate(Date lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
        return this;
    }

    /**
     * Sourced ID
     * <p>
     * 
     * 
     */
    @JsonProperty("gobsridSourcedId")
    public String getGobsridSourcedId() {
        return gobsridSourcedId;
    }

    /**
     * Sourced ID
     * <p>
     * 
     * 
     */
    @JsonProperty("gobsridSourcedId")
    public void setGobsridSourcedId(String gobsridSourcedId) {
        this.gobsridSourcedId = gobsridSourcedId;
    }

    public Gobtpac__2 withGobsridSourcedId(String gobsridSourcedId) {
        this.gobsridSourcedId = gobsridSourcedId;
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

    public Gobtpac__2 withInsertSource(String insertSource) {
        this.insertSource = insertSource;
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

    public Gobtpac__2 withPinDisabledInd(String pinDisabledInd) {
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

    public Gobtpac__2 withUsageAcceptInd(String usageAcceptInd) {
        this.usageAcceptInd = usageAcceptInd;
        return this;
    }

    /**
     * Confirm New PIN
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNewPinConfirm")
    public String getDisplayNewPinConfirm() {
        return displayNewPinConfirm;
    }

    /**
     * Confirm New PIN
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNewPinConfirm")
    public void setDisplayNewPinConfirm(String displayNewPinConfirm) {
        this.displayNewPinConfirm = displayNewPinConfirm;
    }

    public Gobtpac__2 withDisplayNewPinConfirm(String displayNewPinConfirm) {
        this.displayNewPinConfirm = displayNewPinConfirm;
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

    public Gobtpac__2 withUser(String user) {
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

    public Gobtpac__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gobtpac__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("externalUser");
        sb.append('=');
        sb.append(((this.externalUser == null)?"<null>":this.externalUser));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("ldapUser");
        sb.append('=');
        sb.append(((this.ldapUser == null)?"<null>":this.ldapUser));
        sb.append(',');
        sb.append("pin");
        sb.append('=');
        sb.append(((this.pin == null)?"<null>":this.pin));
        sb.append(',');
        sb.append("pinExpDate");
        sb.append('=');
        sb.append(((this.pinExpDate == null)?"<null>":this.pinExpDate));
        sb.append(',');
        sb.append("lastAccessDate");
        sb.append('=');
        sb.append(((this.lastAccessDate == null)?"<null>":this.lastAccessDate));
        sb.append(',');
        sb.append("gobsridSourcedId");
        sb.append('=');
        sb.append(((this.gobsridSourcedId == null)?"<null>":this.gobsridSourcedId));
        sb.append(',');
        sb.append("insertSource");
        sb.append('=');
        sb.append(((this.insertSource == null)?"<null>":this.insertSource));
        sb.append(',');
        sb.append("pinDisabledInd");
        sb.append('=');
        sb.append(((this.pinDisabledInd == null)?"<null>":this.pinDisabledInd));
        sb.append(',');
        sb.append("usageAcceptInd");
        sb.append('=');
        sb.append(((this.usageAcceptInd == null)?"<null>":this.usageAcceptInd));
        sb.append(',');
        sb.append("displayNewPinConfirm");
        sb.append('=');
        sb.append(((this.displayNewPinConfirm == null)?"<null>":this.displayNewPinConfirm));
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
        result = ((result* 31)+((this.externalUser == null)? 0 :this.externalUser.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ldapUser == null)? 0 :this.ldapUser.hashCode()));
        result = ((result* 31)+((this.pin == null)? 0 :this.pin.hashCode()));
        result = ((result* 31)+((this.lastAccessDate == null)? 0 :this.lastAccessDate.hashCode()));
        result = ((result* 31)+((this.gobsridSourcedId == null)? 0 :this.gobsridSourcedId.hashCode()));
        result = ((result* 31)+((this.insertSource == null)? 0 :this.insertSource.hashCode()));
        result = ((result* 31)+((this.pinDisabledInd == null)? 0 :this.pinDisabledInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayNewPinConfirm == null)? 0 :this.displayNewPinConfirm.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gobtpac__2) == false) {
            return false;
        }
        Gobtpac__2 rhs = ((Gobtpac__2) other);
        return ((((((((((((((this.pinExpDate == rhs.pinExpDate)||((this.pinExpDate!= null)&&this.pinExpDate.equals(rhs.pinExpDate)))&&((this.usageAcceptInd == rhs.usageAcceptInd)||((this.usageAcceptInd!= null)&&this.usageAcceptInd.equals(rhs.usageAcceptInd))))&&((this.externalUser == rhs.externalUser)||((this.externalUser!= null)&&this.externalUser.equals(rhs.externalUser))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ldapUser == rhs.ldapUser)||((this.ldapUser!= null)&&this.ldapUser.equals(rhs.ldapUser))))&&((this.pin == rhs.pin)||((this.pin!= null)&&this.pin.equals(rhs.pin))))&&((this.lastAccessDate == rhs.lastAccessDate)||((this.lastAccessDate!= null)&&this.lastAccessDate.equals(rhs.lastAccessDate))))&&((this.gobsridSourcedId == rhs.gobsridSourcedId)||((this.gobsridSourcedId!= null)&&this.gobsridSourcedId.equals(rhs.gobsridSourcedId))))&&((this.insertSource == rhs.insertSource)||((this.insertSource!= null)&&this.insertSource.equals(rhs.insertSource))))&&((this.pinDisabledInd == rhs.pinDisabledInd)||((this.pinDisabledInd!= null)&&this.pinDisabledInd.equals(rhs.pinDisabledInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayNewPinConfirm == rhs.displayNewPinConfirm)||((this.displayNewPinConfirm!= null)&&this.displayNewPinConfirm.equals(rhs.displayNewPinConfirm))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
