
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
    "pinExpDate",
    "ldapUser",
    "id",
    "pinDisabledInd",
    "usageAcceptInd",
    "displayNewPinConfirm"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccessAuditPinHistory100PostRequest {

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
     * Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("pinExpDate")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN_EXP_DATE")
    private Date pinExpDate;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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

    public ThirdPartyAccessAuditPinHistory100PostRequest withExternalUser(String externalUser) {
        this.externalUser = externalUser;
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

    public ThirdPartyAccessAuditPinHistory100PostRequest withPinExpDate(Date pinExpDate) {
        this.pinExpDate = pinExpDate;
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

    public ThirdPartyAccessAuditPinHistory100PostRequest withLdapUser(String ldapUser) {
        this.ldapUser = ldapUser;
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

    public ThirdPartyAccessAuditPinHistory100PostRequest withId(Object id) {
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

    public ThirdPartyAccessAuditPinHistory100PostRequest withPinDisabledInd(String pinDisabledInd) {
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

    public ThirdPartyAccessAuditPinHistory100PostRequest withUsageAcceptInd(String usageAcceptInd) {
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

    public ThirdPartyAccessAuditPinHistory100PostRequest withDisplayNewPinConfirm(String displayNewPinConfirm) {
        this.displayNewPinConfirm = displayNewPinConfirm;
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

    public ThirdPartyAccessAuditPinHistory100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccessAuditPinHistory100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("externalUser");
        sb.append('=');
        sb.append(((this.externalUser == null)?"<null>":this.externalUser));
        sb.append(',');
        sb.append("pinExpDate");
        sb.append('=');
        sb.append(((this.pinExpDate == null)?"<null>":this.pinExpDate));
        sb.append(',');
        sb.append("ldapUser");
        sb.append('=');
        sb.append(((this.ldapUser == null)?"<null>":this.ldapUser));
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
        sb.append("displayNewPinConfirm");
        sb.append('=');
        sb.append(((this.displayNewPinConfirm == null)?"<null>":this.displayNewPinConfirm));
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
        result = ((result* 31)+((this.pinExpDate == null)? 0 :this.pinExpDate.hashCode()));
        result = ((result* 31)+((this.ldapUser == null)? 0 :this.ldapUser.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.pinDisabledInd == null)? 0 :this.pinDisabledInd.hashCode()));
        result = ((result* 31)+((this.usageAcceptInd == null)? 0 :this.usageAcceptInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayNewPinConfirm == null)? 0 :this.displayNewPinConfirm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccessAuditPinHistory100PostRequest) == false) {
            return false;
        }
        ThirdPartyAccessAuditPinHistory100PostRequest rhs = ((ThirdPartyAccessAuditPinHistory100PostRequest) other);
        return (((((((((this.externalUser == rhs.externalUser)||((this.externalUser!= null)&&this.externalUser.equals(rhs.externalUser)))&&((this.pinExpDate == rhs.pinExpDate)||((this.pinExpDate!= null)&&this.pinExpDate.equals(rhs.pinExpDate))))&&((this.ldapUser == rhs.ldapUser)||((this.ldapUser!= null)&&this.ldapUser.equals(rhs.ldapUser))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.pinDisabledInd == rhs.pinDisabledInd)||((this.pinDisabledInd!= null)&&this.pinDisabledInd.equals(rhs.pinDisabledInd))))&&((this.usageAcceptInd == rhs.usageAcceptInd)||((this.usageAcceptInd!= null)&&this.usageAcceptInd.equals(rhs.usageAcceptInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayNewPinConfirm == rhs.displayNewPinConfirm)||((this.displayNewPinConfirm!= null)&&this.displayNewPinConfirm.equals(rhs.displayNewPinConfirm))));
    }

}
