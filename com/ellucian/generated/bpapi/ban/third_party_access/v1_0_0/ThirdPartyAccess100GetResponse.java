
package com.ellucian.generated.bpapi.ban.third_party_access.v1_0_0;

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
    "ldapUser",
    "pinExpDate",
    "lastAccessDate",
    "pinDisabledInd",
    "usageAcceptInd"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccess100GetResponse {

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
     * LDAP User ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("ldapUser")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_LDAP_USER")
    private String ldapUser;
    /**
     * PIN Expiration Date
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
     * PIN Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("pinDisabledInd")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN_DISABLED_IND")
    private String pinDisabledInd;
    /**
     * Web Access Terms Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("usageAcceptInd")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND")
    private String usageAcceptInd;
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

    public ThirdPartyAccess100GetResponse withExternalUser(String externalUser) {
        this.externalUser = externalUser;
        return this;
    }

    /**
     * LDAP User ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("ldapUser")
    public String getLdapUser() {
        return ldapUser;
    }

    /**
     * LDAP User ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("ldapUser")
    public void setLdapUser(String ldapUser) {
        this.ldapUser = ldapUser;
    }

    public ThirdPartyAccess100GetResponse withLdapUser(String ldapUser) {
        this.ldapUser = ldapUser;
        return this;
    }

    /**
     * PIN Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("pinExpDate")
    public Date getPinExpDate() {
        return pinExpDate;
    }

    /**
     * PIN Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("pinExpDate")
    public void setPinExpDate(Date pinExpDate) {
        this.pinExpDate = pinExpDate;
    }

    public ThirdPartyAccess100GetResponse withPinExpDate(Date pinExpDate) {
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

    public ThirdPartyAccess100GetResponse withLastAccessDate(Date lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
        return this;
    }

    /**
     * PIN Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("pinDisabledInd")
    public String getPinDisabledInd() {
        return pinDisabledInd;
    }

    /**
     * PIN Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("pinDisabledInd")
    public void setPinDisabledInd(String pinDisabledInd) {
        this.pinDisabledInd = pinDisabledInd;
    }

    public ThirdPartyAccess100GetResponse withPinDisabledInd(String pinDisabledInd) {
        this.pinDisabledInd = pinDisabledInd;
        return this;
    }

    /**
     * Web Access Terms Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("usageAcceptInd")
    public String getUsageAcceptInd() {
        return usageAcceptInd;
    }

    /**
     * Web Access Terms Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("usageAcceptInd")
    public void setUsageAcceptInd(String usageAcceptInd) {
        this.usageAcceptInd = usageAcceptInd;
    }

    public ThirdPartyAccess100GetResponse withUsageAcceptInd(String usageAcceptInd) {
        this.usageAcceptInd = usageAcceptInd;
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

    public ThirdPartyAccess100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccess100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("externalUser");
        sb.append('=');
        sb.append(((this.externalUser == null)?"<null>":this.externalUser));
        sb.append(',');
        sb.append("ldapUser");
        sb.append('=');
        sb.append(((this.ldapUser == null)?"<null>":this.ldapUser));
        sb.append(',');
        sb.append("pinExpDate");
        sb.append('=');
        sb.append(((this.pinExpDate == null)?"<null>":this.pinExpDate));
        sb.append(',');
        sb.append("lastAccessDate");
        sb.append('=');
        sb.append(((this.lastAccessDate == null)?"<null>":this.lastAccessDate));
        sb.append(',');
        sb.append("pinDisabledInd");
        sb.append('=');
        sb.append(((this.pinDisabledInd == null)?"<null>":this.pinDisabledInd));
        sb.append(',');
        sb.append("usageAcceptInd");
        sb.append('=');
        sb.append(((this.usageAcceptInd == null)?"<null>":this.usageAcceptInd));
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
        result = ((result* 31)+((this.externalUser == null)? 0 :this.externalUser.hashCode()));
        result = ((result* 31)+((this.ldapUser == null)? 0 :this.ldapUser.hashCode()));
        result = ((result* 31)+((this.pinExpDate == null)? 0 :this.pinExpDate.hashCode()));
        result = ((result* 31)+((this.lastAccessDate == null)? 0 :this.lastAccessDate.hashCode()));
        result = ((result* 31)+((this.pinDisabledInd == null)? 0 :this.pinDisabledInd.hashCode()));
        result = ((result* 31)+((this.usageAcceptInd == null)? 0 :this.usageAcceptInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccess100GetResponse) == false) {
            return false;
        }
        ThirdPartyAccess100GetResponse rhs = ((ThirdPartyAccess100GetResponse) other);
        return ((((((((this.externalUser == rhs.externalUser)||((this.externalUser!= null)&&this.externalUser.equals(rhs.externalUser)))&&((this.ldapUser == rhs.ldapUser)||((this.ldapUser!= null)&&this.ldapUser.equals(rhs.ldapUser))))&&((this.pinExpDate == rhs.pinExpDate)||((this.pinExpDate!= null)&&this.pinExpDate.equals(rhs.pinExpDate))))&&((this.lastAccessDate == rhs.lastAccessDate)||((this.lastAccessDate!= null)&&this.lastAccessDate.equals(rhs.lastAccessDate))))&&((this.pinDisabledInd == rhs.pinDisabledInd)||((this.pinDisabledInd!= null)&&this.pinDisabledInd.equals(rhs.pinDisabledInd))))&&((this.usageAcceptInd == rhs.usageAcceptInd)||((this.usageAcceptInd!= null)&&this.usageAcceptInd.equals(rhs.usageAcceptInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
