
package com.ellucian.generated.eedm.requisitions.v11_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Initiator
 * <p>
 * The initiator of the requisition.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "detail",
    "email",
    "phone",
    "fax"
})
@Generated("jsonschema2pojo")
public class Initiator {

    /**
     * Name
     * <p>
     * The name of the initiator.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the initiator.")
    private String name;
    /**
     * Detail
     * <p>
     * The details of the person who initiated the requisition.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The details of the person who initiated the requisition.")
    private Object detail;
    /**
     * Email
     * <p>
     * The email address of the initiator.
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The email address of the initiator.")
    private String email;
    /**
     * Phone
     * <p>
     * The phone number of the initiator.
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The phone number of the initiator.")
    private Phone phone;
    /**
     * Fax
     * <p>
     * The fax number of the initiator.
     * 
     */
    @JsonProperty("fax")
    @JsonPropertyDescription("The fax number of the initiator.")
    private Fax fax;

    /**
     * Name
     * <p>
     * The name of the initiator.
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
     * The name of the initiator.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Initiator withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Detail
     * <p>
     * The details of the person who initiated the requisition.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The details of the person who initiated the requisition.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Initiator withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Email
     * <p>
     * The email address of the initiator.
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email
     * <p>
     * The email address of the initiator.
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Initiator withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phone number of the initiator.
     * 
     */
    @JsonProperty("phone")
    public Phone getPhone() {
        return phone;
    }

    /**
     * Phone
     * <p>
     * The phone number of the initiator.
     * 
     */
    @JsonProperty("phone")
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Initiator withPhone(Phone phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Fax
     * <p>
     * The fax number of the initiator.
     * 
     */
    @JsonProperty("fax")
    public Fax getFax() {
        return fax;
    }

    /**
     * Fax
     * <p>
     * The fax number of the initiator.
     * 
     */
    @JsonProperty("fax")
    public void setFax(Fax fax) {
        this.fax = fax;
    }

    public Initiator withFax(Fax fax) {
        this.fax = fax;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Initiator.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("fax");
        sb.append('=');
        sb.append(((this.fax == null)?"<null>":this.fax));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.fax == null)? 0 :this.fax.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Initiator) == false) {
            return false;
        }
        Initiator rhs = ((Initiator) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.fax == rhs.fax)||((this.fax!= null)&&this.fax.equals(rhs.fax))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
