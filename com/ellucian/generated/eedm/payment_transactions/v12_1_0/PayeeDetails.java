
package com.ellucian.generated.eedm.payment_transactions.v12_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Payee Details
 * <p>
 * The details associated with the payee.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "payee",
    "name",
    "addressLines",
    "place"
})
@Generated("jsonschema2pojo")
public class PayeeDetails {

    /**
     * Payee
     * <p>
     * The payee associated with the transaction.
     * 
     */
    @JsonProperty("payee")
    @JsonPropertyDescription("The payee associated with the transaction.")
    private Object payee;
    /**
     * Name
     * <p>
     * The full name of the payee.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The full name of the payee.")
    private String name;
    /**
     * Address Lines
     * <p>
     * The address lines of the person's location, such as a street address, post office box number, or city, region, and postal code.
     * 
     */
    @JsonProperty("addressLines")
    @JsonPropertyDescription("The address lines of the person's location, such as a street address, post office box number, or city, region, and postal code.")
    private List<String> addressLines = new ArrayList<String>();
    /**
     * Place
     * <p>
     * A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.
     * 
     */
    @JsonProperty("place")
    @JsonPropertyDescription("A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.")
    private Object place;

    /**
     * Payee
     * <p>
     * The payee associated with the transaction.
     * 
     */
    @JsonProperty("payee")
    public Object getPayee() {
        return payee;
    }

    /**
     * Payee
     * <p>
     * The payee associated with the transaction.
     * 
     */
    @JsonProperty("payee")
    public void setPayee(Object payee) {
        this.payee = payee;
    }

    public PayeeDetails withPayee(Object payee) {
        this.payee = payee;
        return this;
    }

    /**
     * Name
     * <p>
     * The full name of the payee.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The full name of the payee.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public PayeeDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the person's location, such as a street address, post office box number, or city, region, and postal code.
     * 
     */
    @JsonProperty("addressLines")
    public List<String> getAddressLines() {
        return addressLines;
    }

    /**
     * Address Lines
     * <p>
     * The address lines of the person's location, such as a street address, post office box number, or city, region, and postal code.
     * 
     */
    @JsonProperty("addressLines")
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    public PayeeDetails withAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
        return this;
    }

    /**
     * Place
     * <p>
     * A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.
     * 
     */
    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    /**
     * Place
     * <p>
     * A country specific postal region. Postal regions are expressed as a hierarchy of country, region, and sub-region, and as a locality with postal automation codes.
     * 
     */
    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    public PayeeDetails withPlace(Object place) {
        this.place = place;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayeeDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("payee");
        sb.append('=');
        sb.append(((this.payee == null)?"<null>":this.payee));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("addressLines");
        sb.append('=');
        sb.append(((this.addressLines == null)?"<null>":this.addressLines));
        sb.append(',');
        sb.append("place");
        sb.append('=');
        sb.append(((this.place == null)?"<null>":this.place));
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
        result = ((result* 31)+((this.payee == null)? 0 :this.payee.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.addressLines == null)? 0 :this.addressLines.hashCode()));
        result = ((result* 31)+((this.place == null)? 0 :this.place.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayeeDetails) == false) {
            return false;
        }
        PayeeDetails rhs = ((PayeeDetails) other);
        return (((((this.payee == rhs.payee)||((this.payee!= null)&&this.payee.equals(rhs.payee)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.addressLines == rhs.addressLines)||((this.addressLines!= null)&&this.addressLines.equals(rhs.addressLines))))&&((this.place == rhs.place)||((this.place!= null)&&this.place.equals(rhs.place))));
    }

}
