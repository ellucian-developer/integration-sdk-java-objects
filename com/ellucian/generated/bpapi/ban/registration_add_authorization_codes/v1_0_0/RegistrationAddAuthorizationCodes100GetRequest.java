
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
    "keyTermCode",
    "spridenId",
    "assignDate",
    "activeInd",
    "authCde",
    "keyCrn"
})
@Generated("jsonschema2pojo")
public class RegistrationAddAuthorizationCodes100GetRequest {

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
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    private String spridenId;
    /**
     * First Assigned Date
     * <p>
     * Lineage reference object : SFBAUTH_ASSIGN_DATE
     * 
     */
    @JsonProperty("assignDate")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_ASSIGN_DATE")
    private Date assignDate;
    /**
     * Lineage reference object : SFBAUTH_ACTIVE_IND
     * (Required)
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_ACTIVE_IND")
    private String activeInd;
    /**
     * Authorization Code
     * <p>
     * Lineage reference object : SFBAUTH_AUTH_CDE
     * (Required)
     * 
     */
    @JsonProperty("authCde")
    @JsonPropertyDescription("Lineage reference object : SFBAUTH_AUTH_CDE")
    private String authCde;
    /**
     * CRN
     * <p>
     * Lineage reference object : keyCrn
     * 
     */
    @JsonProperty("keyCrn")
    @JsonPropertyDescription("Lineage reference object : keyCrn")
    private Object keyCrn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public RegistrationAddAuthorizationCodes100GetRequest withKeyTermCode(Object keyTermCode) {
        this.keyTermCode = keyTermCode;
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

    public RegistrationAddAuthorizationCodes100GetRequest withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * First Assigned Date
     * <p>
     * Lineage reference object : SFBAUTH_ASSIGN_DATE
     * 
     */
    @JsonProperty("assignDate")
    public Date getAssignDate() {
        return assignDate;
    }

    /**
     * First Assigned Date
     * <p>
     * Lineage reference object : SFBAUTH_ASSIGN_DATE
     * 
     */
    @JsonProperty("assignDate")
    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public RegistrationAddAuthorizationCodes100GetRequest withAssignDate(Date assignDate) {
        this.assignDate = assignDate;
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

    public RegistrationAddAuthorizationCodes100GetRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Authorization Code
     * <p>
     * Lineage reference object : SFBAUTH_AUTH_CDE
     * (Required)
     * 
     */
    @JsonProperty("authCde")
    public String getAuthCde() {
        return authCde;
    }

    /**
     * Authorization Code
     * <p>
     * Lineage reference object : SFBAUTH_AUTH_CDE
     * (Required)
     * 
     */
    @JsonProperty("authCde")
    public void setAuthCde(String authCde) {
        this.authCde = authCde;
    }

    public RegistrationAddAuthorizationCodes100GetRequest withAuthCde(String authCde) {
        this.authCde = authCde;
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

    public RegistrationAddAuthorizationCodes100GetRequest withKeyCrn(Object keyCrn) {
        this.keyCrn = keyCrn;
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

    public RegistrationAddAuthorizationCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationAddAuthorizationCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyTermCode");
        sb.append('=');
        sb.append(((this.keyTermCode == null)?"<null>":this.keyTermCode));
        sb.append(',');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("assignDate");
        sb.append('=');
        sb.append(((this.assignDate == null)?"<null>":this.assignDate));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("authCde");
        sb.append('=');
        sb.append(((this.authCde == null)?"<null>":this.authCde));
        sb.append(',');
        sb.append("keyCrn");
        sb.append('=');
        sb.append(((this.keyCrn == null)?"<null>":this.keyCrn));
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
        result = ((result* 31)+((this.assignDate == null)? 0 :this.assignDate.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.authCde == null)? 0 :this.authCde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyCrn == null)? 0 :this.keyCrn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationAddAuthorizationCodes100GetRequest) == false) {
            return false;
        }
        RegistrationAddAuthorizationCodes100GetRequest rhs = ((RegistrationAddAuthorizationCodes100GetRequest) other);
        return ((((((((this.keyTermCode == rhs.keyTermCode)||((this.keyTermCode!= null)&&this.keyTermCode.equals(rhs.keyTermCode)))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.assignDate == rhs.assignDate)||((this.assignDate!= null)&&this.assignDate.equals(rhs.assignDate))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.authCde == rhs.authCde)||((this.authCde!= null)&&this.authCde.equals(rhs.authCde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyCrn == rhs.keyCrn)||((this.keyCrn!= null)&&this.keyCrn.equals(rhs.keyCrn))));
    }

}
