
package com.ellucian.generated.bpapi.ban.financial_manager_maintenance.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "displayFmgrCode",
    "lastName",
    "middleName",
    "lastNamePrefix",
    "firstName"
})
@Generated("jsonschema2pojo")
public class FinancialManagerMaintenance100QapiPost {

    @JsonProperty("displayFmgrCode")
    private String displayFmgrCode;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("lastNamePrefix")
    private String lastNamePrefix;
    @JsonProperty("firstName")
    private String firstName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayFmgrCode")
    public String getDisplayFmgrCode() {
        return displayFmgrCode;
    }

    @JsonProperty("displayFmgrCode")
    public void setDisplayFmgrCode(String displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
    }

    public FinancialManagerMaintenance100QapiPost withDisplayFmgrCode(String displayFmgrCode) {
        this.displayFmgrCode = displayFmgrCode;
        return this;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public FinancialManagerMaintenance100QapiPost withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public FinancialManagerMaintenance100QapiPost withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    @JsonProperty("lastNamePrefix")
    public String getLastNamePrefix() {
        return lastNamePrefix;
    }

    @JsonProperty("lastNamePrefix")
    public void setLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
    }

    public FinancialManagerMaintenance100QapiPost withLastNamePrefix(String lastNamePrefix) {
        this.lastNamePrefix = lastNamePrefix;
        return this;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public FinancialManagerMaintenance100QapiPost withFirstName(String firstName) {
        this.firstName = firstName;
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

    public FinancialManagerMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialManagerMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayFmgrCode");
        sb.append('=');
        sb.append(((this.displayFmgrCode == null)?"<null>":this.displayFmgrCode));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastNamePrefix");
        sb.append('=');
        sb.append(((this.lastNamePrefix == null)?"<null>":this.lastNamePrefix));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
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
        if ((other instanceof FinancialManagerMaintenance100QapiPost) == false) {
            return false;
        }
        FinancialManagerMaintenance100QapiPost rhs = ((FinancialManagerMaintenance100QapiPost) other);
        return (((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.lastNamePrefix == rhs.lastNamePrefix)||((this.lastNamePrefix!= null)&&this.lastNamePrefix.equals(rhs.lastNamePrefix))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayFmgrCode == rhs.displayFmgrCode)||((this.displayFmgrCode!= null)&&this.displayFmgrCode.equals(rhs.displayFmgrCode))));
    }

}
