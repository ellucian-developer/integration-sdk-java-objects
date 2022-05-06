
package com.ellucian.generated.bpapi.ban.registration_add_authorization_codes.v1_0_0;

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
    "criteria.spridenId",
    "keyTermCode",
    "criteria.authCde",
    "spridenId",
    "criteria.activeInd",
    "activeInd",
    "keyCrn",
    "criteria.assignDate"
})
@Generated("jsonschema2pojo")
public class RegistrationAddAuthorizationCodes100PutRequest {

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spridenId")
    private String criteriaSpridenId;
    /**
     * Term
     * <p>
     * Lineage reference object : keyTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyTermCode")
    @JsonPropertyDescription("Lineage reference object : keyTermCode, Lookup lineage reference object : stvterm")
    private Object keyTermCode;
    /**
     * Authorization Code
     * <p>
     * Lineage reference object : SFBAUTH_AUTH_CDE
     * (Required)
     * 
     */
    @JsonProperty("criteria.authCde")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_AUTH_CDE")
    private String criteriaAuthCde;
    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    private String spridenId;
    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.activeInd")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_ACTIVE_IND")
    private String criteriaActiveInd;
    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_ACTIVE_IND")
    private String activeInd;
    /**
     * CRN
     * <p>
     * Lineage reference object : keyCrn
     * 
     */
    @JsonProperty("keyCrn")
    @JsonPropertyDescription("Lineage reference object : keyCrn")
    private Object keyCrn;
    /**
     * First Assigned Date
     * <p>
     * Lineage reference object : SFBAUTH_ASSIGN_DATE
     * 
     */
    @JsonProperty("criteria.assignDate")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_ASSIGN_DATE")
    private Date criteriaAssignDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spridenId")
    public String getCriteriaSpridenId() {
        return criteriaSpridenId;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spridenId")
    public void setCriteriaSpridenId(String criteriaSpridenId) {
        this.criteriaSpridenId = criteriaSpridenId;
    }

    public RegistrationAddAuthorizationCodes100PutRequest withCriteriaSpridenId(String criteriaSpridenId) {
        this.criteriaSpridenId = criteriaSpridenId;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyTermCode")
    public Object getKeyTermCode() {
        return keyTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyTermCode")
    public void setKeyTermCode(Object keyTermCode) {
        this.keyTermCode = keyTermCode;
    }

    public RegistrationAddAuthorizationCodes100PutRequest withKeyTermCode(Object keyTermCode) {
        this.keyTermCode = keyTermCode;
        return this;
    }

    /**
     * Authorization Code
     * <p>
     * Lineage reference object : SFBAUTH_AUTH_CDE
     * (Required)
     * 
     */
    @JsonProperty("criteria.authCde")
    public String getCriteriaAuthCde() {
        return criteriaAuthCde;
    }

    /**
     * Authorization Code
     * <p>
     * Lineage reference object : SFBAUTH_AUTH_CDE
     * (Required)
     * 
     */
    @JsonProperty("criteria.authCde")
    public void setCriteriaAuthCde(String criteriaAuthCde) {
        this.criteriaAuthCde = criteriaAuthCde;
    }

    public RegistrationAddAuthorizationCodes100PutRequest withCriteriaAuthCde(String criteriaAuthCde) {
        this.criteriaAuthCde = criteriaAuthCde;
        return this;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public String getSpridenId() {
        return spridenId;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public void setSpridenId(String spridenId) {
        this.spridenId = spridenId;
    }

    public RegistrationAddAuthorizationCodes100PutRequest withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.activeInd")
    public String getCriteriaActiveInd() {
        return criteriaActiveInd;
    }

    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.activeInd")
    public void setCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
    }

    public RegistrationAddAuthorizationCodes100PutRequest withCriteriaActiveInd(String criteriaActiveInd) {
        this.criteriaActiveInd = criteriaActiveInd;
        return this;
    }

    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public RegistrationAddAuthorizationCodes100PutRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : keyCrn
     * 
     */
    @JsonProperty("keyCrn")
    public Object getKeyCrn() {
        return keyCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : keyCrn
     * 
     */
    @JsonProperty("keyCrn")
    public void setKeyCrn(Object keyCrn) {
        this.keyCrn = keyCrn;
    }

    public RegistrationAddAuthorizationCodes100PutRequest withKeyCrn(Object keyCrn) {
        this.keyCrn = keyCrn;
        return this;
    }

    /**
     * First Assigned Date
     * <p>
     * Lineage reference object : SFBAUTH_ASSIGN_DATE
     * 
     */
    @JsonProperty("criteria.assignDate")
    public Date getCriteriaAssignDate() {
        return criteriaAssignDate;
    }

    /**
     * First Assigned Date
     * <p>
     * Lineage reference object : SFBAUTH_ASSIGN_DATE
     * 
     */
    @JsonProperty("criteria.assignDate")
    public void setCriteriaAssignDate(Date criteriaAssignDate) {
        this.criteriaAssignDate = criteriaAssignDate;
    }

    public RegistrationAddAuthorizationCodes100PutRequest withCriteriaAssignDate(Date criteriaAssignDate) {
        this.criteriaAssignDate = criteriaAssignDate;
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

    public RegistrationAddAuthorizationCodes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationAddAuthorizationCodes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSpridenId");
        sb.append('=');
        sb.append(((this.criteriaSpridenId == null)?"<null>":this.criteriaSpridenId));
        sb.append(',');
        sb.append("keyTermCode");
        sb.append('=');
        sb.append(((this.keyTermCode == null)?"<null>":this.keyTermCode));
        sb.append(',');
        sb.append("criteriaAuthCde");
        sb.append('=');
        sb.append(((this.criteriaAuthCde == null)?"<null>":this.criteriaAuthCde));
        sb.append(',');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("criteriaActiveInd");
        sb.append('=');
        sb.append(((this.criteriaActiveInd == null)?"<null>":this.criteriaActiveInd));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("keyCrn");
        sb.append('=');
        sb.append(((this.keyCrn == null)?"<null>":this.keyCrn));
        sb.append(',');
        sb.append("criteriaAssignDate");
        sb.append('=');
        sb.append(((this.criteriaAssignDate == null)?"<null>":this.criteriaAssignDate));
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
        result = ((result* 31)+((this.keyTermCode == null)? 0 :this.keyTermCode.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.criteriaAssignDate == null)? 0 :this.criteriaAssignDate.hashCode()));
        result = ((result* 31)+((this.criteriaAuthCde == null)? 0 :this.criteriaAuthCde.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenId == null)? 0 :this.criteriaSpridenId.hashCode()));
        result = ((result* 31)+((this.keyCrn == null)? 0 :this.keyCrn.hashCode()));
        result = ((result* 31)+((this.criteriaActiveInd == null)? 0 :this.criteriaActiveInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationAddAuthorizationCodes100PutRequest) == false) {
            return false;
        }
        RegistrationAddAuthorizationCodes100PutRequest rhs = ((RegistrationAddAuthorizationCodes100PutRequest) other);
        return ((((((((((this.keyTermCode == rhs.keyTermCode)||((this.keyTermCode!= null)&&this.keyTermCode.equals(rhs.keyTermCode)))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.criteriaAssignDate == rhs.criteriaAssignDate)||((this.criteriaAssignDate!= null)&&this.criteriaAssignDate.equals(rhs.criteriaAssignDate))))&&((this.criteriaAuthCde == rhs.criteriaAuthCde)||((this.criteriaAuthCde!= null)&&this.criteriaAuthCde.equals(rhs.criteriaAuthCde))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSpridenId == rhs.criteriaSpridenId)||((this.criteriaSpridenId!= null)&&this.criteriaSpridenId.equals(rhs.criteriaSpridenId))))&&((this.keyCrn == rhs.keyCrn)||((this.keyCrn!= null)&&this.keyCrn.equals(rhs.keyCrn))))&&((this.criteriaActiveInd == rhs.criteriaActiveInd)||((this.criteriaActiveInd!= null)&&this.criteriaActiveInd.equals(rhs.criteriaActiveInd))));
    }

}
