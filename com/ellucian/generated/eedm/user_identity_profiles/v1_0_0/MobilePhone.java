
package com.ellucian.generated.eedm.user_identity_profiles.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Mobile Phone
 * <p>
 * Contact number of the person
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "areaCityCode",
    "subscriberNumber"
})
@Generated("jsonschema2pojo")
public class MobilePhone {

    /**
     * Area City Code
     * <p>
     * Telephone area code.
     * 
     */
    @JsonProperty("areaCityCode")
    @JsonPropertyDescription("Telephone area code.")
    private String areaCityCode;
    /**
     * Subscriber Number
     * <p>
     * "Local” phone number.
     * 
     */
    @JsonProperty("subscriberNumber")
    @JsonPropertyDescription("\"Local\u201d phone number.")
    private String subscriberNumber;

    /**
     * Area City Code
     * <p>
     * Telephone area code.
     * 
     */
    @JsonProperty("areaCityCode")
    public String getAreaCityCode() {
        return areaCityCode;
    }

    /**
     * Area City Code
     * <p>
     * Telephone area code.
     * 
     */
    @JsonProperty("areaCityCode")
    public void setAreaCityCode(String areaCityCode) {
        this.areaCityCode = areaCityCode;
    }

    public MobilePhone withAreaCityCode(String areaCityCode) {
        this.areaCityCode = areaCityCode;
        return this;
    }

    /**
     * Subscriber Number
     * <p>
     * "Local” phone number.
     * 
     */
    @JsonProperty("subscriberNumber")
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    /**
     * Subscriber Number
     * <p>
     * "Local” phone number.
     * 
     */
    @JsonProperty("subscriberNumber")
    public void setSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }

    public MobilePhone withSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MobilePhone.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("areaCityCode");
        sb.append('=');
        sb.append(((this.areaCityCode == null)?"<null>":this.areaCityCode));
        sb.append(',');
        sb.append("subscriberNumber");
        sb.append('=');
        sb.append(((this.subscriberNumber == null)?"<null>":this.subscriberNumber));
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
        result = ((result* 31)+((this.subscriberNumber == null)? 0 :this.subscriberNumber.hashCode()));
        result = ((result* 31)+((this.areaCityCode == null)? 0 :this.areaCityCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MobilePhone) == false) {
            return false;
        }
        MobilePhone rhs = ((MobilePhone) other);
        return (((this.subscriberNumber == rhs.subscriberNumber)||((this.subscriberNumber!= null)&&this.subscriberNumber.equals(rhs.subscriberNumber)))&&((this.areaCityCode == rhs.areaCityCode)||((this.areaCityCode!= null)&&this.areaCityCode.equals(rhs.areaCityCode))));
    }

}
