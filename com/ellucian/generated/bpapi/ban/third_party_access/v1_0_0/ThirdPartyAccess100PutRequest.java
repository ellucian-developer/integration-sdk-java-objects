
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
    "criteria.externalUser",
    "pinExpDate",
    "criteria.ldapUser",
    "id",
    "pinDisabledInd",
    "usageAcceptInd",
    "criteria.pinDisabledInd",
    "criteria.usageAcceptInd",
    "criteria.pinExpDate",
    "criteria.lastAccessDate"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccess100PutRequest {

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
     * PIN Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("pinExpDate")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN_EXP_DATE")
    private Date pinExpDate;
    /**
     * LDAP User ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("criteria.ldapUser")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_LDAP_USER")
    private String criteriaLdapUser;
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
    /**
     * PIN Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("criteria.pinDisabledInd")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN_DISABLED_IND")
    private String criteriaPinDisabledInd;
    /**
     * Web Access Terms Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("criteria.usageAcceptInd")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND")
    private String criteriaUsageAcceptInd;
    /**
     * PIN Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("criteria.pinExpDate")
    @JsonPropertyDescription("Lineage reference object : GOBTPAC_PIN_EXP_DATE")
    private Date criteriaPinExpDate;
    /**
     * Last Web Access Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.lastAccessDate")
    private Date criteriaLastAccessDate;
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

    public ThirdPartyAccess100PutRequest withCriteriaExternalUser(String criteriaExternalUser) {
        this.criteriaExternalUser = criteriaExternalUser;
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

    public ThirdPartyAccess100PutRequest withPinExpDate(Date pinExpDate) {
        this.pinExpDate = pinExpDate;
        return this;
    }

    /**
     * LDAP User ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("criteria.ldapUser")
    public String getCriteriaLdapUser() {
        return criteriaLdapUser;
    }

    /**
     * LDAP User ID
     * <p>
     * Lineage reference object : GOBTPAC_LDAP_USER
     * 
     */
    @JsonProperty("criteria.ldapUser")
    public void setCriteriaLdapUser(String criteriaLdapUser) {
        this.criteriaLdapUser = criteriaLdapUser;
    }

    public ThirdPartyAccess100PutRequest withCriteriaLdapUser(String criteriaLdapUser) {
        this.criteriaLdapUser = criteriaLdapUser;
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

    public ThirdPartyAccess100PutRequest withId(String id) {
        this.id = id;
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

    public ThirdPartyAccess100PutRequest withPinDisabledInd(String pinDisabledInd) {
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

    public ThirdPartyAccess100PutRequest withUsageAcceptInd(String usageAcceptInd) {
        this.usageAcceptInd = usageAcceptInd;
        return this;
    }

    /**
     * PIN Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("criteria.pinDisabledInd")
    public String getCriteriaPinDisabledInd() {
        return criteriaPinDisabledInd;
    }

    /**
     * PIN Disabled
     * <p>
     * Lineage reference object : GOBTPAC_PIN_DISABLED_IND
     * 
     */
    @JsonProperty("criteria.pinDisabledInd")
    public void setCriteriaPinDisabledInd(String criteriaPinDisabledInd) {
        this.criteriaPinDisabledInd = criteriaPinDisabledInd;
    }

    public ThirdPartyAccess100PutRequest withCriteriaPinDisabledInd(String criteriaPinDisabledInd) {
        this.criteriaPinDisabledInd = criteriaPinDisabledInd;
        return this;
    }

    /**
     * Web Access Terms Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("criteria.usageAcceptInd")
    public String getCriteriaUsageAcceptInd() {
        return criteriaUsageAcceptInd;
    }

    /**
     * Web Access Terms Accepted
     * <p>
     * Lineage reference object : GOBTPAC_USAGE_ACCEPT_IND
     * 
     */
    @JsonProperty("criteria.usageAcceptInd")
    public void setCriteriaUsageAcceptInd(String criteriaUsageAcceptInd) {
        this.criteriaUsageAcceptInd = criteriaUsageAcceptInd;
    }

    public ThirdPartyAccess100PutRequest withCriteriaUsageAcceptInd(String criteriaUsageAcceptInd) {
        this.criteriaUsageAcceptInd = criteriaUsageAcceptInd;
        return this;
    }

    /**
     * PIN Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("criteria.pinExpDate")
    public Date getCriteriaPinExpDate() {
        return criteriaPinExpDate;
    }

    /**
     * PIN Expiration Date
     * <p>
     * Lineage reference object : GOBTPAC_PIN_EXP_DATE
     * 
     */
    @JsonProperty("criteria.pinExpDate")
    public void setCriteriaPinExpDate(Date criteriaPinExpDate) {
        this.criteriaPinExpDate = criteriaPinExpDate;
    }

    public ThirdPartyAccess100PutRequest withCriteriaPinExpDate(Date criteriaPinExpDate) {
        this.criteriaPinExpDate = criteriaPinExpDate;
        return this;
    }

    /**
     * Last Web Access Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.lastAccessDate")
    public Date getCriteriaLastAccessDate() {
        return criteriaLastAccessDate;
    }

    /**
     * Last Web Access Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.lastAccessDate")
    public void setCriteriaLastAccessDate(Date criteriaLastAccessDate) {
        this.criteriaLastAccessDate = criteriaLastAccessDate;
    }

    public ThirdPartyAccess100PutRequest withCriteriaLastAccessDate(Date criteriaLastAccessDate) {
        this.criteriaLastAccessDate = criteriaLastAccessDate;
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

    public ThirdPartyAccess100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccess100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaExternalUser");
        sb.append('=');
        sb.append(((this.criteriaExternalUser == null)?"<null>":this.criteriaExternalUser));
        sb.append(',');
        sb.append("pinExpDate");
        sb.append('=');
        sb.append(((this.pinExpDate == null)?"<null>":this.pinExpDate));
        sb.append(',');
        sb.append("criteriaLdapUser");
        sb.append('=');
        sb.append(((this.criteriaLdapUser == null)?"<null>":this.criteriaLdapUser));
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
        sb.append("criteriaPinDisabledInd");
        sb.append('=');
        sb.append(((this.criteriaPinDisabledInd == null)?"<null>":this.criteriaPinDisabledInd));
        sb.append(',');
        sb.append("criteriaUsageAcceptInd");
        sb.append('=');
        sb.append(((this.criteriaUsageAcceptInd == null)?"<null>":this.criteriaUsageAcceptInd));
        sb.append(',');
        sb.append("criteriaPinExpDate");
        sb.append('=');
        sb.append(((this.criteriaPinExpDate == null)?"<null>":this.criteriaPinExpDate));
        sb.append(',');
        sb.append("criteriaLastAccessDate");
        sb.append('=');
        sb.append(((this.criteriaLastAccessDate == null)?"<null>":this.criteriaLastAccessDate));
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
        result = ((result* 31)+((this.criteriaLdapUser == null)? 0 :this.criteriaLdapUser.hashCode()));
        result = ((result* 31)+((this.pinExpDate == null)? 0 :this.pinExpDate.hashCode()));
        result = ((result* 31)+((this.criteriaPinExpDate == null)? 0 :this.criteriaPinExpDate.hashCode()));
        result = ((result* 31)+((this.criteriaExternalUser == null)? 0 :this.criteriaExternalUser.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.pinDisabledInd == null)? 0 :this.pinDisabledInd.hashCode()));
        result = ((result* 31)+((this.usageAcceptInd == null)? 0 :this.usageAcceptInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaPinDisabledInd == null)? 0 :this.criteriaPinDisabledInd.hashCode()));
        result = ((result* 31)+((this.criteriaUsageAcceptInd == null)? 0 :this.criteriaUsageAcceptInd.hashCode()));
        result = ((result* 31)+((this.criteriaLastAccessDate == null)? 0 :this.criteriaLastAccessDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccess100PutRequest) == false) {
            return false;
        }
        ThirdPartyAccess100PutRequest rhs = ((ThirdPartyAccess100PutRequest) other);
        return ((((((((((((this.criteriaLdapUser == rhs.criteriaLdapUser)||((this.criteriaLdapUser!= null)&&this.criteriaLdapUser.equals(rhs.criteriaLdapUser)))&&((this.pinExpDate == rhs.pinExpDate)||((this.pinExpDate!= null)&&this.pinExpDate.equals(rhs.pinExpDate))))&&((this.criteriaPinExpDate == rhs.criteriaPinExpDate)||((this.criteriaPinExpDate!= null)&&this.criteriaPinExpDate.equals(rhs.criteriaPinExpDate))))&&((this.criteriaExternalUser == rhs.criteriaExternalUser)||((this.criteriaExternalUser!= null)&&this.criteriaExternalUser.equals(rhs.criteriaExternalUser))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.pinDisabledInd == rhs.pinDisabledInd)||((this.pinDisabledInd!= null)&&this.pinDisabledInd.equals(rhs.pinDisabledInd))))&&((this.usageAcceptInd == rhs.usageAcceptInd)||((this.usageAcceptInd!= null)&&this.usageAcceptInd.equals(rhs.usageAcceptInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaPinDisabledInd == rhs.criteriaPinDisabledInd)||((this.criteriaPinDisabledInd!= null)&&this.criteriaPinDisabledInd.equals(rhs.criteriaPinDisabledInd))))&&((this.criteriaUsageAcceptInd == rhs.criteriaUsageAcceptInd)||((this.criteriaUsageAcceptInd!= null)&&this.criteriaUsageAcceptInd.equals(rhs.criteriaUsageAcceptInd))))&&((this.criteriaLastAccessDate == rhs.criteriaLastAccessDate)||((this.criteriaLastAccessDate!= null)&&this.criteriaLastAccessDate.equals(rhs.criteriaLastAccessDate))));
    }

}
