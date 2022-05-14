
package com.ellucian.generated.eedm.financial_aid_offices.v9_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Financial Aid Offices
 * <p>
 * The offices responsible for financial aid.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "name",
    "code",
    "addressLines",
    "city",
    "state",
    "postalCode",
    "aidAdministrator",
    "phone",
    "fax",
    "emailAddress"
})
@Generated("jsonschema2pojo")
public class FinancialAidOffices {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the financial aid office.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the financial aid office.")
    private String id;
    /**
     * Name
     * <p>
     * The name of the financial aid office.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the financial aid office.")
    private String name;
    /**
     * Code
     * <p>
     * A code that may be used to identify the financial aid office.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the financial aid office.")
    private String code;
    /**
     * Address Lines
     * <p>
     * The address lines of the financial aid office location.
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("The address lines of the financial aid office location.")
    private List<String> addressLines = new ArrayList<String>();
    /**
     * City
     * <p>
     * The city of the financial aid office location.
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city of the financial aid office location.")
    private String city;
    /**
     * State
     * <p>
     * The state of the financial aid office location.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The state of the financial aid office location.")
    private String state;
    /**
     * Postal Code
     * <p>
     * The postal code of the financial aid office location.
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("The postal code of the financial aid office location.")
    private String postalCode;
    /**
     * Aid Administrator
     * <p>
     * The name of the financial aid administrator for the office.
     * 
     */
    @JsonProperty("aidAdministrator")
    @JsonPropertyDescription("The name of the financial aid administrator for the office.")
    private String aidAdministrator;
    /**
     * Phone
     * <p>
     * The phone number of the financial aid office.
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The phone number of the financial aid office.")
    private Object phone;
    /**
     * Fax
     * <p>
     * The fax number of the financial aid office.
     * 
     */
    @JsonProperty("fax")
    @JsonPropertyDescription("The fax number of the financial aid office.")
    private Object fax;
    /**
     * Email Address
     * <p>
     * The e-mail address of the financial aid office.
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("The e-mail address of the financial aid office.")
    private Object emailAddress;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public FinancialAidOffices withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the financial aid office.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the financial aid office.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FinancialAidOffices withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Name
     * <p>
     * The name of the financial aid office.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the financial aid office.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public FinancialAidOffices withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the financial aid office.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the financial aid office.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public FinancialAidOffices withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the financial aid office location.
     * 
     */
    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the financial aid office location.
     * 
     */
    @JsonProperty("addressLines")
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public FinancialAidOffices withAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
        return this;
    }

    /**
     * City
     * <p>
     * The city of the financial aid office location.
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * The city of the financial aid office location.
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public FinancialAidOffices withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * State
     * <p>
     * The state of the financial aid office location.
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * <p>
     * The state of the financial aid office location.
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public FinancialAidOffices withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The postal code of the financial aid office location.
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * The postal code of the financial aid office location.
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public FinancialAidOffices withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Aid Administrator
     * <p>
     * The name of the financial aid administrator for the office.
     * 
     */
    @JsonProperty("aidAdministrator")
    public String getAidAdministrator() {
        return aidAdministrator;
    }

    /**
     * Aid Administrator
     * <p>
     * The name of the financial aid administrator for the office.
     * 
     */
    @JsonProperty("aidAdministrator")
    public void setAidAdministrator(String aidAdministrator) {
        this.aidAdministrator = aidAdministrator;
    }

    public FinancialAidOffices withAidAdministrator(String aidAdministrator) {
        this.aidAdministrator = aidAdministrator;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phone number of the financial aid office.
     * 
     */
    @JsonProperty("phone")
    public Object getPhone() {
        return phone;
    }

    /**
     * Phone
     * <p>
     * The phone number of the financial aid office.
     * 
     */
    @JsonProperty("phone")
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public FinancialAidOffices withPhone(Object phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Fax
     * <p>
     * The fax number of the financial aid office.
     * 
     */
    @JsonProperty("fax")
    public Object getFax() {
        return fax;
    }

    /**
     * Fax
     * <p>
     * The fax number of the financial aid office.
     * 
     */
    @JsonProperty("fax")
    public void setFax(Object fax) {
        this.fax = fax;
    }

    public FinancialAidOffices withFax(Object fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Email Address
     * <p>
     * The e-mail address of the financial aid office.
     * 
     */
    @JsonProperty("emailAddress")
    public Object getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * The e-mail address of the financial aid office.
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
    }

    public FinancialAidOffices withEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialAidOffices.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("aidAdministrator");
        sb.append('=');
        sb.append(((this.aidAdministrator == null)?"<null>":this.aidAdministrator));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("fax");
        sb.append('=');
        sb.append(((this.fax == null)?"<null>":this.fax));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.aidAdministrator == null)? 0 :this.aidAdministrator.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.fax == null)? 0 :this.fax.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialAidOffices) == false) {
            return false;
        }
        FinancialAidOffices rhs = ((FinancialAidOffices) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.aidAdministrator == rhs.aidAdministrator)||((this.aidAdministrator!= null)&&this.aidAdministrator.equals(rhs.aidAdministrator))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.fax == rhs.fax)||((this.fax!= null)&&this.fax.equals(rhs.fax))));
    }

}
