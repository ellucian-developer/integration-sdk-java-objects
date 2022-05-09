
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Visa
 * <p>
 * The Visa details of the applicant.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "visaType",
    "visaNumber",
    "issuedOn",
    "startDate",
    "expiresOn",
    "alienRegistrationNumber",
    "alienRegistrationIssueDate",
    "alienRegistrationExpirationDate",
    "issuingAuthority",
    "visaNationOfIssue",
    "portOfEntry",
    "employmentType"
})
@Generated("jsonschema2pojo")
public class Visa {

    /**
     * Visa Type
     * <p>
     * Applicant’s Visa Type
     * 
     */
    @JsonProperty("visaType")
    @JsonPropertyDescription("Applicant\u2019s Visa Type")
    private String visaType;
    /**
     * Visa Number
     * <p>
     * The identifier number of the visa.
     * 
     */
    @JsonProperty("visaNumber")
    @JsonPropertyDescription("The identifier number of the visa.")
    private String visaNumber;
    /**
     * Issued On
     * <p>
     * The date when the visa was issued.
     * 
     */
    @JsonProperty("issuedOn")
    @JsonPropertyDescription("The date when the visa was issued.")
    private Object issuedOn;
    /**
     * Start Date
     * <p>
     * The visa start date.
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("The visa start date.")
    private Object startDate;
    /**
     * Expires On
     * <p>
     * The date when the visa will expire.
     * 
     */
    @JsonProperty("expiresOn")
    @JsonPropertyDescription("The date when the visa will expire.")
    private Object expiresOn;
    /**
     * Alien Registration Number
     * <p>
     * The applicant's alien registration number if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationNumber")
    @JsonPropertyDescription("The applicant's alien registration number if non-citizen.")
    private String alienRegistrationNumber;
    /**
     * Alien Registration Issue Date
     * <p>
     * The applicant's alien registration issue date if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationIssueDate")
    @JsonPropertyDescription("The applicant's alien registration issue date if non-citizen.")
    private Object alienRegistrationIssueDate;
    /**
     * Alien Registration Expiration Date
     * <p>
     * The applicant's alien registration expiration date if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationExpirationDate")
    @JsonPropertyDescription("The applicant's alien registration expiration date if non-citizen.")
    private Object alienRegistrationExpirationDate;
    /**
     * Issuing Authority
     * <p>
     * The authority that issued the visa.
     * 
     */
    @JsonProperty("issuingAuthority")
    @JsonPropertyDescription("The authority that issued the visa.")
    private String issuingAuthority;
    /**
     * Visa nation of issue
     * <p>
     * The nation that issued the visa.
     * 
     */
    @JsonProperty("visaNationOfIssue")
    @JsonPropertyDescription("The nation that issued the visa.")
    private String visaNationOfIssue;
    /**
     * Port Of Entry
     * <p>
     * The port of entry
     * 
     */
    @JsonProperty("portOfEntry")
    @JsonPropertyDescription("The port of entry")
    private String portOfEntry;
    /**
     * Employment Type
     * <p>
     * The type of employment for which a visa was issued.
     * 
     */
    @JsonProperty("employmentType")
    @JsonPropertyDescription("The type of employment for which a visa was issued.")
    private String employmentType;

    /**
     * Visa Type
     * <p>
     * Applicant’s Visa Type
     * 
     */
    @JsonProperty("visaType")
    public String getVisaType() {
        return visaType;
    }

    /**
     * Visa Type
     * <p>
     * Applicant’s Visa Type
     * 
     */
    @JsonProperty("visaType")
    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public Visa withVisaType(String visaType) {
        this.visaType = visaType;
        return this;
    }

    /**
     * Visa Number
     * <p>
     * The identifier number of the visa.
     * 
     */
    @JsonProperty("visaNumber")
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Visa Number
     * <p>
     * The identifier number of the visa.
     * 
     */
    @JsonProperty("visaNumber")
    public void setVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
    }

    public Visa withVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
        return this;
    }

    /**
     * Issued On
     * <p>
     * The date when the visa was issued.
     * 
     */
    @JsonProperty("issuedOn")
    public Object getIssuedOn() {
        return issuedOn;
    }

    /**
     * Issued On
     * <p>
     * The date when the visa was issued.
     * 
     */
    @JsonProperty("issuedOn")
    public void setIssuedOn(Object issuedOn) {
        this.issuedOn = issuedOn;
    }

    public Visa withIssuedOn(Object issuedOn) {
        this.issuedOn = issuedOn;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The visa start date.
     * 
     */
    @JsonProperty("startDate")
    public Object getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * The visa start date.
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Visa withStartDate(Object startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Expires On
     * <p>
     * The date when the visa will expire.
     * 
     */
    @JsonProperty("expiresOn")
    public Object getExpiresOn() {
        return expiresOn;
    }

    /**
     * Expires On
     * <p>
     * The date when the visa will expire.
     * 
     */
    @JsonProperty("expiresOn")
    public void setExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
    }

    public Visa withExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Alien Registration Number
     * <p>
     * The applicant's alien registration number if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationNumber")
    public String getAlienRegistrationNumber() {
        return alienRegistrationNumber;
    }

    /**
     * Alien Registration Number
     * <p>
     * The applicant's alien registration number if non-citizen.
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
     * Alien Registration Issue Date
     * <p>
     * The applicant's alien registration issue date if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationIssueDate")
    public Object getAlienRegistrationIssueDate() {
        return alienRegistrationIssueDate;
    }

    /**
     * Alien Registration Issue Date
     * <p>
     * The applicant's alien registration issue date if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationIssueDate")
    public void setAlienRegistrationIssueDate(Object alienRegistrationIssueDate) {
        this.alienRegistrationIssueDate = alienRegistrationIssueDate;
    }

    public Visa withAlienRegistrationIssueDate(Object alienRegistrationIssueDate) {
        this.alienRegistrationIssueDate = alienRegistrationIssueDate;
        return this;
    }

    /**
     * Alien Registration Expiration Date
     * <p>
     * The applicant's alien registration expiration date if non-citizen.
     * 
     */
    @JsonProperty("alienRegistrationExpirationDate")
    public Object getAlienRegistrationExpirationDate() {
        return alienRegistrationExpirationDate;
    }

    /**
     * Alien Registration Expiration Date
     * <p>
     * The applicant's alien registration expiration date if non-citizen.
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

    /**
     * Issuing Authority
     * <p>
     * The authority that issued the visa.
     * 
     */
    @JsonProperty("issuingAuthority")
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Issuing Authority
     * <p>
     * The authority that issued the visa.
     * 
     */
    @JsonProperty("issuingAuthority")
    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public Visa withIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * Visa nation of issue
     * <p>
     * The nation that issued the visa.
     * 
     */
    @JsonProperty("visaNationOfIssue")
    public String getVisaNationOfIssue() {
        return visaNationOfIssue;
    }

    /**
     * Visa nation of issue
     * <p>
     * The nation that issued the visa.
     * 
     */
    @JsonProperty("visaNationOfIssue")
    public void setVisaNationOfIssue(String visaNationOfIssue) {
        this.visaNationOfIssue = visaNationOfIssue;
    }

    public Visa withVisaNationOfIssue(String visaNationOfIssue) {
        this.visaNationOfIssue = visaNationOfIssue;
        return this;
    }

    /**
     * Port Of Entry
     * <p>
     * The port of entry
     * 
     */
    @JsonProperty("portOfEntry")
    public String getPortOfEntry() {
        return portOfEntry;
    }

    /**
     * Port Of Entry
     * <p>
     * The port of entry
     * 
     */
    @JsonProperty("portOfEntry")
    public void setPortOfEntry(String portOfEntry) {
        this.portOfEntry = portOfEntry;
    }

    public Visa withPortOfEntry(String portOfEntry) {
        this.portOfEntry = portOfEntry;
        return this;
    }

    /**
     * Employment Type
     * <p>
     * The type of employment for which a visa was issued.
     * 
     */
    @JsonProperty("employmentType")
    public String getEmploymentType() {
        return employmentType;
    }

    /**
     * Employment Type
     * <p>
     * The type of employment for which a visa was issued.
     * 
     */
    @JsonProperty("employmentType")
    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public Visa withEmploymentType(String employmentType) {
        this.employmentType = employmentType;
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
        sb.append("visaNumber");
        sb.append('=');
        sb.append(((this.visaNumber == null)?"<null>":this.visaNumber));
        sb.append(',');
        sb.append("issuedOn");
        sb.append('=');
        sb.append(((this.issuedOn == null)?"<null>":this.issuedOn));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("expiresOn");
        sb.append('=');
        sb.append(((this.expiresOn == null)?"<null>":this.expiresOn));
        sb.append(',');
        sb.append("alienRegistrationNumber");
        sb.append('=');
        sb.append(((this.alienRegistrationNumber == null)?"<null>":this.alienRegistrationNumber));
        sb.append(',');
        sb.append("alienRegistrationIssueDate");
        sb.append('=');
        sb.append(((this.alienRegistrationIssueDate == null)?"<null>":this.alienRegistrationIssueDate));
        sb.append(',');
        sb.append("alienRegistrationExpirationDate");
        sb.append('=');
        sb.append(((this.alienRegistrationExpirationDate == null)?"<null>":this.alienRegistrationExpirationDate));
        sb.append(',');
        sb.append("issuingAuthority");
        sb.append('=');
        sb.append(((this.issuingAuthority == null)?"<null>":this.issuingAuthority));
        sb.append(',');
        sb.append("visaNationOfIssue");
        sb.append('=');
        sb.append(((this.visaNationOfIssue == null)?"<null>":this.visaNationOfIssue));
        sb.append(',');
        sb.append("portOfEntry");
        sb.append('=');
        sb.append(((this.portOfEntry == null)?"<null>":this.portOfEntry));
        sb.append(',');
        sb.append("employmentType");
        sb.append('=');
        sb.append(((this.employmentType == null)?"<null>":this.employmentType));
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
        result = ((result* 31)+((this.alienRegistrationIssueDate == null)? 0 :this.alienRegistrationIssueDate.hashCode()));
        result = ((result* 31)+((this.visaNationOfIssue == null)? 0 :this.visaNationOfIssue.hashCode()));
        result = ((result* 31)+((this.employmentType == null)? 0 :this.employmentType.hashCode()));
        result = ((result* 31)+((this.visaNumber == null)? 0 :this.visaNumber.hashCode()));
        result = ((result* 31)+((this.alienRegistrationExpirationDate == null)? 0 :this.alienRegistrationExpirationDate.hashCode()));
        result = ((result* 31)+((this.visaType == null)? 0 :this.visaType.hashCode()));
        result = ((result* 31)+((this.issuedOn == null)? 0 :this.issuedOn.hashCode()));
        result = ((result* 31)+((this.issuingAuthority == null)? 0 :this.issuingAuthority.hashCode()));
        result = ((result* 31)+((this.alienRegistrationNumber == null)? 0 :this.alienRegistrationNumber.hashCode()));
        result = ((result* 31)+((this.portOfEntry == null)? 0 :this.portOfEntry.hashCode()));
        result = ((result* 31)+((this.expiresOn == null)? 0 :this.expiresOn.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
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
        return (((((((((((((this.alienRegistrationIssueDate == rhs.alienRegistrationIssueDate)||((this.alienRegistrationIssueDate!= null)&&this.alienRegistrationIssueDate.equals(rhs.alienRegistrationIssueDate)))&&((this.visaNationOfIssue == rhs.visaNationOfIssue)||((this.visaNationOfIssue!= null)&&this.visaNationOfIssue.equals(rhs.visaNationOfIssue))))&&((this.employmentType == rhs.employmentType)||((this.employmentType!= null)&&this.employmentType.equals(rhs.employmentType))))&&((this.visaNumber == rhs.visaNumber)||((this.visaNumber!= null)&&this.visaNumber.equals(rhs.visaNumber))))&&((this.alienRegistrationExpirationDate == rhs.alienRegistrationExpirationDate)||((this.alienRegistrationExpirationDate!= null)&&this.alienRegistrationExpirationDate.equals(rhs.alienRegistrationExpirationDate))))&&((this.visaType == rhs.visaType)||((this.visaType!= null)&&this.visaType.equals(rhs.visaType))))&&((this.issuedOn == rhs.issuedOn)||((this.issuedOn!= null)&&this.issuedOn.equals(rhs.issuedOn))))&&((this.issuingAuthority == rhs.issuingAuthority)||((this.issuingAuthority!= null)&&this.issuingAuthority.equals(rhs.issuingAuthority))))&&((this.alienRegistrationNumber == rhs.alienRegistrationNumber)||((this.alienRegistrationNumber!= null)&&this.alienRegistrationNumber.equals(rhs.alienRegistrationNumber))))&&((this.portOfEntry == rhs.portOfEntry)||((this.portOfEntry!= null)&&this.portOfEntry.equals(rhs.portOfEntry))))&&((this.expiresOn == rhs.expiresOn)||((this.expiresOn!= null)&&this.expiresOn.equals(rhs.expiresOn))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
