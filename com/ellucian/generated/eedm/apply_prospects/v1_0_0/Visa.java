
package com.ellucian.generated.eedm.apply_prospects.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Visa
 * <p>
 * The Visa details of the prospect.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "visaType",
    "visaId",
    "visaIssuedOn",
    "visaExpiresOn",
    "alienRegistrationNumber",
    "alienRegistrationExpirationDate"
})
@Generated("jsonschema2pojo")
public class Visa {

    /**
     * Visa Type
     * <p>
     * Visa type of the prospect.
     * 
     */
    @JsonProperty("visaType")
    @JsonPropertyDescription("Visa type of the prospect.")
    private VisaType visaType;
    /**
     * Visa Id
     * <p>
     * The identifier number of the visa.
     * 
     */
    @JsonProperty("visaId")
    @JsonPropertyDescription("The identifier number of the visa.")
    private String visaId;
    /**
     * Visa Issued On
     * <p>
     * The date when the visa was issued.
     * 
     */
    @JsonProperty("visaIssuedOn")
    @JsonPropertyDescription("The date when the visa was issued.")
    private Object visaIssuedOn;
    /**
     * Visa Expires On
     * <p>
     * The date when the visa will expire.
     * 
     */
    @JsonProperty("visaExpiresOn")
    @JsonPropertyDescription("The date when the visa will expire.")
    private Object visaExpiresOn;
    /**
     * Alien Registration Number
     * <p>
     * The prospect's alien registration number if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationNumber")
    @JsonPropertyDescription("The prospect's alien registration number if non-citizen.")
    private String alienRegistrationNumber;
    /**
     * Alien Registration Expiration Date
     * <p>
     * The prospect's alien registration expiration date if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationExpirationDate")
    @JsonPropertyDescription("The prospect's alien registration expiration date if non-citizen.")
    private Object alienRegistrationExpirationDate;

    /**
     * Visa Type
     * <p>
     * Visa type of the prospect.
     * 
     */
    @JsonProperty("visaType")
    public VisaType getVisaType() {
        return visaType;
    }

    /**
     * Visa Type
     * <p>
     * Visa type of the prospect.
     * 
     */
    @JsonProperty("visaType")
    public void setVisaType(VisaType visaType) {
        this.visaType = visaType;
    }

    public Visa withVisaType(VisaType visaType) {
        this.visaType = visaType;
        return this;
    }

    /**
     * Visa Id
     * <p>
     * The identifier number of the visa.
     * 
     */
    @JsonProperty("visaId")
    public String getVisaId() {
        return visaId;
    }

    /**
     * Visa Id
     * <p>
     * The identifier number of the visa.
     * 
     */
    @JsonProperty("visaId")
    public void setVisaId(String visaId) {
        this.visaId = visaId;
    }

    public Visa withVisaId(String visaId) {
        this.visaId = visaId;
        return this;
    }

    /**
     * Visa Issued On
     * <p>
     * The date when the visa was issued.
     * 
     */
    @JsonProperty("visaIssuedOn")
    public Object getVisaIssuedOn() {
        return visaIssuedOn;
    }

    /**
     * Visa Issued On
     * <p>
     * The date when the visa was issued.
     * 
     */
    @JsonProperty("visaIssuedOn")
    public void setVisaIssuedOn(Object visaIssuedOn) {
        this.visaIssuedOn = visaIssuedOn;
    }

    public Visa withVisaIssuedOn(Object visaIssuedOn) {
        this.visaIssuedOn = visaIssuedOn;
        return this;
    }

    /**
     * Visa Expires On
     * <p>
     * The date when the visa will expire.
     * 
     */
    @JsonProperty("visaExpiresOn")
    public Object getVisaExpiresOn() {
        return visaExpiresOn;
    }

    /**
     * Visa Expires On
     * <p>
     * The date when the visa will expire.
     * 
     */
    @JsonProperty("visaExpiresOn")
    public void setVisaExpiresOn(Object visaExpiresOn) {
        this.visaExpiresOn = visaExpiresOn;
    }

    public Visa withVisaExpiresOn(Object visaExpiresOn) {
        this.visaExpiresOn = visaExpiresOn;
        return this;
    }

    /**
     * Alien Registration Number
     * <p>
     * The prospect's alien registration number if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationNumber")
    public String getAlienRegistrationNumber() {
        return alienRegistrationNumber;
    }

    /**
     * Alien Registration Number
     * <p>
     * The prospect's alien registration number if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationNumber")
    public void setAlienRegistrationNumber(String alienRegistrationNumber) {
        this.alienRegistrationNumber = alienRegistrationNumber;
    }

    public Visa withAlienRegistrationNumber(String alienRegistrationNumber) {
        this.alienRegistrationNumber = alienRegistrationNumber;
        return this;
    }

    /**
     * Alien Registration Expiration Date
     * <p>
     * The prospect's alien registration expiration date if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationExpirationDate")
    public Object getAlienRegistrationExpirationDate() {
        return alienRegistrationExpirationDate;
    }

    /**
     * Alien Registration Expiration Date
     * <p>
     * The prospect's alien registration expiration date if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationExpirationDate")
    public void setAlienRegistrationExpirationDate(Object alienRegistrationExpirationDate) {
        this.alienRegistrationExpirationDate = alienRegistrationExpirationDate;
    }

    public Visa withAlienRegistrationExpirationDate(Object alienRegistrationExpirationDate) {
        this.alienRegistrationExpirationDate = alienRegistrationExpirationDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Visa.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("visaType");
        sb.append('=');
        sb.append(((this.visaType == null)?"<null>":this.visaType));
        sb.append(',');
        sb.append("visaId");
        sb.append('=');
        sb.append(((this.visaId == null)?"<null>":this.visaId));
        sb.append(',');
        sb.append("visaIssuedOn");
        sb.append('=');
        sb.append(((this.visaIssuedOn == null)?"<null>":this.visaIssuedOn));
        sb.append(',');
        sb.append("visaExpiresOn");
        sb.append('=');
        sb.append(((this.visaExpiresOn == null)?"<null>":this.visaExpiresOn));
        sb.append(',');
        sb.append("alienRegistrationNumber");
        sb.append('=');
        sb.append(((this.alienRegistrationNumber == null)?"<null>":this.alienRegistrationNumber));
        sb.append(',');
        sb.append("alienRegistrationExpirationDate");
        sb.append('=');
        sb.append(((this.alienRegistrationExpirationDate == null)?"<null>":this.alienRegistrationExpirationDate));
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
        result = ((result* 31)+((this.visaIssuedOn == null)? 0 :this.visaIssuedOn.hashCode()));
        result = ((result* 31)+((this.alienRegistrationNumber == null)? 0 :this.alienRegistrationNumber.hashCode()));
        result = ((result* 31)+((this.visaId == null)? 0 :this.visaId.hashCode()));
        result = ((result* 31)+((this.alienRegistrationExpirationDate == null)? 0 :this.alienRegistrationExpirationDate.hashCode()));
        result = ((result* 31)+((this.visaType == null)? 0 :this.visaType.hashCode()));
        result = ((result* 31)+((this.visaExpiresOn == null)? 0 :this.visaExpiresOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Visa) == false) {
            return false;
        }
        Visa rhs = ((Visa) other);
        return (((((((this.visaIssuedOn == rhs.visaIssuedOn)||((this.visaIssuedOn!= null)&&this.visaIssuedOn.equals(rhs.visaIssuedOn)))&&((this.alienRegistrationNumber == rhs.alienRegistrationNumber)||((this.alienRegistrationNumber!= null)&&this.alienRegistrationNumber.equals(rhs.alienRegistrationNumber))))&&((this.visaId == rhs.visaId)||((this.visaId!= null)&&this.visaId.equals(rhs.visaId))))&&((this.alienRegistrationExpirationDate == rhs.alienRegistrationExpirationDate)||((this.alienRegistrationExpirationDate!= null)&&this.alienRegistrationExpirationDate.equals(rhs.alienRegistrationExpirationDate))))&&((this.visaType == rhs.visaType)||((this.visaType!= null)&&this.visaType.equals(rhs.visaType))))&&((this.visaExpiresOn == rhs.visaExpiresOn)||((this.visaExpiresOn!= null)&&this.visaExpiresOn.equals(rhs.visaExpiresOn))));
    }

}
