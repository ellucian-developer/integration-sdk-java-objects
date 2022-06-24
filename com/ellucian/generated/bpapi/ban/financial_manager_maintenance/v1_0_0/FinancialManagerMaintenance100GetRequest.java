
package com.ellucian.generated.bpapi.ban.financial_manager_maintenance.v1_0_0;

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
    "lastName",
    "lastNamePrefix",
    "firstName",
    "middleName",
    "displayFmgrCode"
})
@Generated("jsonschema2pojo")
public class FinancialManagerMaintenance100GetRequest {

    /**
     * Last Name
     * <p>
     * Lineage reference object : finMgrName
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : finMgrName")
    private String lastName;
    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : finMgrSurnamePrefix
     * 
     */
    @JsonProperty("lastNamePrefix")
    @JsonPropertyDescription("Lineage reference object : finMgrSurnamePrefix")
    private String lastNamePrefix;
    /**
     * First Name
     * <p>
     * Lineage reference object : finMgrFirstName
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : finMgrFirstName")
    private String firstName;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : finMgrMi
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("Lineage reference object : finMgrMi")
    private String middleName;
    /**
     * Financial Manager
     * <p>
     * Lineage reference object : displayFmgrCode, Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("displayFmgrCode")
    @JsonPropertyDescription("Lineage reference object : displayFmgrCode, Lookup lineage reference object : spriden,ftvfmgr")
    private String displayFmgrCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Last Name
     * <p>
     * Lineage reference object : finMgrName
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : finMgrName
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public FinancialManagerMaintenance100GetRequest withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : finMgrSurnamePrefix
     * 
     */
    @JsonProperty("lastNamePrefix")
    public String getLastNamePrefix() {
        return lastNamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : finMgrSurnamePrefix
     * 
     */
    @JsonProperty("lastNamePrefix")
    public void setLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
    }

    public FinancialManagerMaintenance100GetRequest withLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : finMgrFirstName
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : finMgrFirstName
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public FinancialManagerMaintenance100GetRequest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : finMgrMi
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : finMgrMi
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public FinancialManagerMaintenance100GetRequest withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Financial Manager
     * <p>
     * Lineage reference object : displayFmgrCode, Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("displayFmgrCode")
    public String getDisplayFmgrCode() {
        return displayFmgrCode;
    }

    /**
     * Financial Manager
     * <p>
     * Lineage reference object : displayFmgrCode, Lookup lineage reference object : spriden,ftvfmgr
     * 
     */
    @JsonProperty("displayFmgrCode")
    public void setDisplayFmgrCode(String displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
    }

    public FinancialManagerMaintenance100GetRequest withDisplayFmgrCode(String displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
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

    public FinancialManagerMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialManagerMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("lastNamePrefix");
        sb.append('=');
        sb.append(((this.lastNamePrefix == null)?"<null>":this.lastNamePrefix));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("displayFmgrCode");
        sb.append('=');
        sb.append(((this.displayFmgrCode == null)?"<null>":this.displayFmgrCode));
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
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.lastNamePrefix == null)? 0 :this.lastNamePrefix.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayFmgrCode == null)? 0 :this.displayFmgrCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialManagerMaintenance100GetRequest) == false) {
            return false;
        }
        FinancialManagerMaintenance100GetRequest rhs = ((FinancialManagerMaintenance100GetRequest) other);
        return (((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.lastNamePrefix == rhs.lastNamePrefix)||((this.lastNamePrefix!= null)&&this.lastNamePrefix.equals(rhs.lastNamePrefix))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayFmgrCode == rhs.displayFmgrCode)||((this.displayFmgrCode!= null)&&this.displayFmgrCode.equals(rhs.displayFmgrCode))));
    }

}
