
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
    "criteria.externalUser",
    "criteria.activityDate",
    "pinExpDate",
    "criteria.ldapUser",
    "usageAcceptInd",
    "criteria.pinDisabledInd",
    "criteria.insertSource",
    "criteria.pinExpDate",
    "criteria.user",
    "externalUser",
    "ldapUser",
    "id",
    "pinDisabledInd",
    "displayNewPinConfirm",
    "criteria.usageAcceptInd"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccessAuditPinHistory100PutRequest {

    /**
     * Third Party ID
     * <p>
     * Lineage reference object : GOBTPAC_EXTERNAL_USER
     * 
     */
    @JsonProperty("criteria.externalUser")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_EXTERNAL_USER")
    private String criteriaExternalUser;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBTPAC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_ACTIVITY_DATE")
    private Date criteriaActivityDate;
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
    @JsonProperty("criteria.ldapUser")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_LDAP_USER")
    private String criteriaLdapUser;
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
     * Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("criteria.pinDisabledInd")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN_DISABLED_IND")
    private String criteriaPinDisabledInd;
    /**
     * Activity Source
     * <p>
     * Lineage reference object : GOBTPAC_INSERT_SOURCE
     * 
     */
    @JsonProperty("criteria.insertSource")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_INSERT_SOURCE")
    private String criteriaInsertSource;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("criteria.pinExpDate")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN_EXP_DATE")
    private Date criteriaPinExpDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : GOBTPAC_USER
     * 
     */
    @JsonProperty("criteria.user")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_USER")
    private String criteriaUser;
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
     * Confirm New PIN
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNewPinConfirm")
    private String displayNewPinConfirm;
    /**
     * Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("criteria.usageAcceptInd")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND")
    private String criteriaUsageAcceptInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Third Party ID
     * <p>
     * Lineage reference object : GOBTPAC_EXTERNAL_USER
     * 
     */
    @JsonProperty("criteria.externalUser")
    public String getCriteriaExternalUser() {
        return criteriaExternalUser;
    }

    /**
     * Third Party ID
     * <p>
     * Lineage reference object : GOBTPAC_EXTERNAL_USER
     * 
     */
    @JsonProperty("criteria.externalUser")
    public void setCriteriaExternalUser(String criteriaExternalUser) {
        this.criteriaExternalUser = criteriaExternalUser;
    }

    public ThirdPartyAccessAuditPinHistory100PutRequest withCriteriaExternalUser(String criteriaExternalUser) {
        this.criteriaExternalUser = criteriaExternalUser;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBTPAC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GOBTPAC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public ThirdPartyAccessAuditPinHistory100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
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

    public ThirdPartyAccessAuditPinHistory100PutRequest withPinExpDate(Date pinExpDate) {
        this.pinExpDate = pinExpDate;
        return this;
    }

    /**
     * LDAP User  ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("criteria.ldapUser")
    public String getCriteriaLdapUser() {
        return criteriaLdapUser;
    }

    /**
     * LDAP User  ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("criteria.ldapUser")
    public void setCriteriaLdapUser(String criteriaLdapUser) {
        this.criteriaLdapUser = criteriaLdapUser;
    }

    public ThirdPartyAccessAuditPinHistory100PutRequest withCriteriaLdapUser(String criteriaLdapUser) {
        this.criteriaLdapUser = criteriaLdapUser;
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

    public ThirdPartyAccessAuditPinHistory100PutRequest withUsageAcceptInd(String usageAcceptInd) {
        this.usageAcceptInd = usageAcceptInd;
        return this;
    }

    /**
     * Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("criteria.pinDisabledInd")
    public String getCriteriaPinDisabledInd() {
        return criteriaPinDisabledInd;
    }

    /**
     * Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("criteria.pinDisabledInd")
    public void setCriteriaPinDisabledInd(String criteriaPinDisabledInd) {
        this.criteriaPinDisabledInd = criteriaPinDisabledInd;
    }

    public ThirdPartyAccessAuditPinHistory100PutRequest withCriteriaPinDisabledInd(String criteriaPinDisabledInd) {
        this.criteriaPinDisabledInd = criteriaPinDisabledInd;
        return this;
    }

    /**
     * Activity Source
     * <p>
     * Lineage reference object : GOBTPAC_INSERT_SOURCE
     * 
     */
    @JsonProperty("criteria.insertSource")
    public String getCriteriaInsertSource() {
        return criteriaInsertSource;
    }

    /**
     * Activity Source
     * <p>
     * Lineage reference object : GOBTPAC_INSERT_SOURCE
     * 
     */
    @JsonProperty("criteria.insertSource")
    public void setCriteriaInsertSource(String criteriaInsertSource) {
        this.criteriaInsertSource = criteriaInsertSource;
    }

    public ThirdPartyAccessAuditPinHistory100PutRequest withCriteriaInsertSource(String criteriaInsertSource) {
        this.criteriaInsertSource = criteriaInsertSource;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("criteria.pinExpDate")
    public Date getCriteriaPinExpDate() {
        return criteriaPinExpDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("criteria.pinExpDate")
    public void setCriteriaPinExpDate(Date criteriaPinExpDate) {
        this.criteriaPinExpDate = criteriaPinExpDate;
    }

    public ThirdPartyAccessAuditPinHistory100PutRequest withCriteriaPinExpDate(Date criteriaPinExpDate) {
        this.criteriaPinExpDate = criteriaPinExpDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GOBTPAC_USER
     * 
     */
    @JsonProperty("criteria.user")
    public String getCriteriaUser() {
        return criteriaUser;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : GOBTPAC_USER
     * 
     */
    @JsonProperty("criteria.user")
    public void setCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
    }

    public ThirdPartyAccessAuditPinHistory100PutRequest withCriteriaUser(String criteriaUser) {
        this.criteriaUser = criteriaUser;
        return this;
    }

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

    public ThirdPartyAccessAuditPinHistory100PutRequest withExternalUser(String externalUser) {
        this.externalUser = externalUser;
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

    public ThirdPartyAccessAuditPinHistory100PutRequest withLdapUser(String ldapUser) {
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

    public ThirdPartyAccessAuditPinHistory100PutRequest withId(String id) {
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

    public ThirdPartyAccessAuditPinHistory100PutRequest withPinDisabledInd(String pinDisabledInd) {
        this.pinDisabledInd = pinDisabledInd;
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

    public ThirdPartyAccessAuditPinHistory100PutRequest withDisplayNewPinConfirm(String displayNewPinConfirm) {
        this.displayNewPinConfirm = displayNewPinConfirm;
        return this;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("criteria.usageAcceptInd")
    public String getCriteriaUsageAcceptInd() {
        return criteriaUsageAcceptInd;
    }

    /**
     * Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("criteria.usageAcceptInd")
    public void setCriteriaUsageAcceptInd(String criteriaUsageAcceptInd) {
        this.criteriaUsageAcceptInd = criteriaUsageAcceptInd;
    }

    public ThirdPartyAccessAuditPinHistory100PutRequest withCriteriaUsageAcceptInd(String criteriaUsageAcceptInd) {
        this.criteriaUsageAcceptInd = criteriaUsageAcceptInd;
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

    public ThirdPartyAccessAuditPinHistory100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccessAuditPinHistory100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaExternalUser");
        sb.append('=');
        sb.append(((this.criteriaExternalUser == null)?"<null>":this.criteriaExternalUser));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("pinExpDate");
        sb.append('=');
        sb.append(((this.pinExpDate == null)?"<null>":this.pinExpDate));
        sb.append(',');
        sb.append("criteriaLdapUser");
        sb.append('=');
        sb.append(((this.criteriaLdapUser == null)?"<null>":this.criteriaLdapUser));
        sb.append(',');
        sb.append("usageAcceptInd");
        sb.append('=');
        sb.append(((this.usageAcceptInd == null)?"<null>":this.usageAcceptInd));
        sb.append(',');
        sb.append("criteriaPinDisabledInd");
        sb.append('=');
        sb.append(((this.criteriaPinDisabledInd == null)?"<null>":this.criteriaPinDisabledInd));
        sb.append(',');
        sb.append("criteriaInsertSource");
        sb.append('=');
        sb.append(((this.criteriaInsertSource == null)?"<null>":this.criteriaInsertSource));
        sb.append(',');
        sb.append("criteriaPinExpDate");
        sb.append('=');
        sb.append(((this.criteriaPinExpDate == null)?"<null>":this.criteriaPinExpDate));
        sb.append(',');
        sb.append("criteriaUser");
        sb.append('=');
        sb.append(((this.criteriaUser == null)?"<null>":this.criteriaUser));
        sb.append(',');
        sb.append("externalUser");
        sb.append('=');
        sb.append(((this.externalUser == null)?"<null>":this.externalUser));
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
        sb.append("displayNewPinConfirm");
        sb.append('=');
        sb.append(((this.displayNewPinConfirm == null)?"<null>":this.displayNewPinConfirm));
        sb.append(',');
        sb.append("criteriaUsageAcceptInd");
        sb.append('=');
        sb.append(((this.criteriaUsageAcceptInd == null)?"<null>":this.criteriaUsageAcceptInd));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaLdapUser == null)? 0 :this.criteriaLdapUser.hashCode()));
        result = ((result* 31)+((this.pinExpDate == null)? 0 :this.pinExpDate.hashCode()));
        result = ((result* 31)+((this.criteriaPinExpDate == null)? 0 :this.criteriaPinExpDate.hashCode()));
        result = ((result* 31)+((this.criteriaExternalUser == null)? 0 :this.criteriaExternalUser.hashCode()));
        result = ((result* 31)+((this.criteriaInsertSource == null)? 0 :this.criteriaInsertSource.hashCode()));
        result = ((result* 31)+((this.usageAcceptInd == null)? 0 :this.usageAcceptInd.hashCode()));
        result = ((result* 31)+((this.criteriaUsageAcceptInd == null)? 0 :this.criteriaUsageAcceptInd.hashCode()));
        result = ((result* 31)+((this.externalUser == null)? 0 :this.externalUser.hashCode()));
        result = ((result* 31)+((this.ldapUser == null)? 0 :this.ldapUser.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.pinDisabledInd == null)? 0 :this.pinDisabledInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayNewPinConfirm == null)? 0 :this.displayNewPinConfirm.hashCode()));
        result = ((result* 31)+((this.criteriaPinDisabledInd == null)? 0 :this.criteriaPinDisabledInd.hashCode()));
        result = ((result* 31)+((this.criteriaUser == null)? 0 :this.criteriaUser.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccessAuditPinHistory100PutRequest) == false) {
            return false;
        }
        ThirdPartyAccessAuditPinHistory100PutRequest rhs = ((ThirdPartyAccessAuditPinHistory100PutRequest) other);
        return (((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaLdapUser == rhs.criteriaLdapUser)||((this.criteriaLdapUser!= null)&&this.criteriaLdapUser.equals(rhs.criteriaLdapUser))))&&((this.pinExpDate == rhs.pinExpDate)||((this.pinExpDate!= null)&&this.pinExpDate.equals(rhs.pinExpDate))))&&((this.criteriaPinExpDate == rhs.criteriaPinExpDate)||((this.criteriaPinExpDate!= null)&&this.criteriaPinExpDate.equals(rhs.criteriaPinExpDate))))&&((this.criteriaExternalUser == rhs.criteriaExternalUser)||((this.criteriaExternalUser!= null)&&this.criteriaExternalUser.equals(rhs.criteriaExternalUser))))&&((this.criteriaInsertSource == rhs.criteriaInsertSource)||((this.criteriaInsertSource!= null)&&this.criteriaInsertSource.equals(rhs.criteriaInsertSource))))&&((this.usageAcceptInd == rhs.usageAcceptInd)||((this.usageAcceptInd!= null)&&this.usageAcceptInd.equals(rhs.usageAcceptInd))))&&((this.criteriaUsageAcceptInd == rhs.criteriaUsageAcceptInd)||((this.criteriaUsageAcceptInd!= null)&&this.criteriaUsageAcceptInd.equals(rhs.criteriaUsageAcceptInd))))&&((this.externalUser == rhs.externalUser)||((this.externalUser!= null)&&this.externalUser.equals(rhs.externalUser))))&&((this.ldapUser == rhs.ldapUser)||((this.ldapUser!= null)&&this.ldapUser.equals(rhs.ldapUser))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.pinDisabledInd == rhs.pinDisabledInd)||((this.pinDisabledInd!= null)&&this.pinDisabledInd.equals(rhs.pinDisabledInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayNewPinConfirm == rhs.displayNewPinConfirm)||((this.displayNewPinConfirm!= null)&&this.displayNewPinConfirm.equals(rhs.displayNewPinConfirm))))&&((this.criteriaPinDisabledInd == rhs.criteriaPinDisabledInd)||((this.criteriaPinDisabledInd!= null)&&this.criteriaPinDisabledInd.equals(rhs.criteriaPinDisabledInd))))&&((this.criteriaUser == rhs.criteriaUser)||((this.criteriaUser!= null)&&this.criteriaUser.equals(rhs.criteriaUser))));
    }

}
