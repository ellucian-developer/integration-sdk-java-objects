
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Acknowledgment
 * <p>
 * Kind of documentation required for acknowledgment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "firstName",
    "middleName",
    "lastName",
    "title",
    "addressLines",
    "city",
    "state",
    "country",
    "zipCode",
    "phoneNumber",
    "extension",
    "faxNumber",
    "emailAddress"
})
@Generated("jsonschema2pojo")
public class Acknowledgment {

    /**
     * Type
     * <p>
     * Type of documents required for acknowledgment
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of documents required for acknowledgment")
    private List<Type> type = new ArrayList<Type>();
    /**
     * First Name
     * <p>
     * First name of the person who must be acknowledged
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("First name of the person who must be acknowledged")
    private String firstName;
    /**
     * Middle Name
     * <p>
     * Middle name of the person who must be acknowledged
     * 
     */
    @JsonProperty("middleName")
    @JsonPropertyDescription("Middle name of the person who must be acknowledged")
    private String middleName;
    /**
     * Last Name
     * <p>
     * Last name of the person who must be acknowledged
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Last name of the person who must be acknowledged")
    private String lastName;
    /**
     * Title
     * <p>
     * Title of the person who must be acknowledged
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Title of the person who must be acknowledged")
    private String title;
    /**
     * Address Lines
     * <p>
     * Address lines of the person who must be acknowledged
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("Address lines of the person who must be acknowledged")
    private List<String> addressLines = new ArrayList<String>();
    /**
     * City
     * <p>
     * City of the person who must be acknowledged
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City of the person who must be acknowledged")
    private String city;
    /**
     * State
     * <p>
     * State of the person who must be acknowledged
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("State of the person who must be acknowledged")
    private String state;
    /**
     * Country
     * <p>
     * Zip code of the person who must be acknowledged
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("Zip code of the person who must be acknowledged")
    private String country;
    /**
     * Zip Code
     * <p>
     * Zip code of the person who must be acknowledged
     * 
     */
    @JsonProperty("zipCode")
    @JsonPropertyDescription("Zip code of the person who must be acknowledged")
    private String zipCode;
    /**
     * Phone Number
     * <p>
     * Telephone number of the person who should be acknowledged
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Telephone number of the person who should be acknowledged")
    private String phoneNumber;
    /**
     * Extension
     * <p>
     * Telephone extension of the person who should be acknowledged
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Telephone extension of the person who should be acknowledged")
    private String extension;
    /**
     * Fax Number
     * <p>
     * Fax Number of the person who should be acknowledged
     * 
     */
    @JsonProperty("faxNumber")
    @JsonPropertyDescription("Fax Number of the person who should be acknowledged")
    private String faxNumber;
    /**
     * Email Address
     * <p>
     * Email address of the person who should be acknowledged.
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("Email address of the person who should be acknowledged.")
    private Object emailAddress;

    /**
     * Type
     * <p>
     * Type of documents required for acknowledgment
     * 
     */
    @JsonProperty("type")
    public List<Type> getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Type of documents required for acknowledgment
     * 
     */
    @JsonProperty("type")
    public void setType(List<Type> type) {
        this.type = type;
    }

    public Acknowledgment withType(List<Type> type) {
        this.type = type;
        return this;
    }

    /**
     * First Name
     * <p>
     * First name of the person who must be acknowledged
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * First name of the person who must be acknowledged
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Acknowledgment withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Middle name of the person who must be acknowledged
     * 
     */
    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Middle Name
     * <p>
     * Middle name of the person who must be acknowledged
     * 
     */
    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Acknowledgment withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Last name of the person who must be acknowledged
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Last name of the person who must be acknowledged
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Acknowledgment withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Title
     * <p>
     * Title of the person who must be acknowledged
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Title of the person who must be acknowledged
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Acknowledgment withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Address Lines
     * <p>
     * Address lines of the person who must be acknowledged
     * 
     */
    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * Address Lines
     * <p>
     * Address lines of the person who must be acknowledged
     * 
     */
    @JsonProperty("addressLines")
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public Acknowledgment withAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
        return this;
    }

    /**
     * City
     * <p>
     * City of the person who must be acknowledged
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * City of the person who must be acknowledged
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Acknowledgment withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * State
     * <p>
     * State of the person who must be acknowledged
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * <p>
     * State of the person who must be acknowledged
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Acknowledgment withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Country
     * <p>
     * Zip code of the person who must be acknowledged
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * Zip code of the person who must be acknowledged
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Acknowledgment withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Zip Code
     * <p>
     * Zip code of the person who must be acknowledged
     * 
     */
    @JsonProperty("zipCode")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Zip Code
     * <p>
     * Zip code of the person who must be acknowledged
     * 
     */
    @JsonProperty("zipCode")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Acknowledgment withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Telephone number of the person who should be acknowledged
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Telephone number of the person who should be acknowledged
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Acknowledgment withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Extension
     * <p>
     * Telephone extension of the person who should be acknowledged
     * 
     */
    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    /**
     * Extension
     * <p>
     * Telephone extension of the person who should be acknowledged
     * 
     */
    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Acknowledgment withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Fax Number
     * <p>
     * Fax Number of the person who should be acknowledged
     * 
     */
    @JsonProperty("faxNumber")
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Fax Number
     * <p>
     * Fax Number of the person who should be acknowledged
     * 
     */
    @JsonProperty("faxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Acknowledgment withFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }

    /**
     * Email Address
     * <p>
     * Email address of the person who should be acknowledged.
     * 
     */
    @JsonProperty("emailAddress")
    public Object getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * Email address of the person who should be acknowledged.
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Acknowledgment withEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Acknowledgment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("middleName");
        sb.append('=');
        sb.append(((this.middleName == null)?"<null>":this.middleName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("addressLines");
        sb.append('=');
        sb.append(((this.addressLines == null)?"<null>":this.addressLines));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("faxNumber");
        sb.append('=');
        sb.append(((this.faxNumber == null)?"<null>":this.faxNumber));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.zipCode == null)? 0 :this.zipCode.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.faxNumber == null)? 0 :this.faxNumber.hashCode()));
        result = ((result* 31)+((this.middleName == null)? 0 :this.middleName.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Acknowledgment) == false) {
            return false;
        }
        Acknowledgment rhs = ((Acknowledgment) other);
        return (((((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.zipCode == rhs.zipCode)||((this.zipCode!= null)&&this.zipCode.equals(rhs.zipCode))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.faxNumber == rhs.faxNumber)||((this.faxNumber!= null)&&this.faxNumber.equals(rhs.faxNumber))))&&((this.middleName == rhs.middleName)||((this.middleName!= null)&&this.middleName.equals(rhs.middleName))))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))));
    }

}
