
package com.ellucian.generated.eedm.external_employments.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "phone",
    "email"
})
@Generated("jsonschema2pojo")
public class Supervisor {

    /**
     * Name
     * <p>
     * The name of the supervisor.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the supervisor.")
    private String name;
    /**
     * Phone
     * <p>
     * The phone number of the supervisor.
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The phone number of the supervisor.")
    private String phone;
    /**
     * Email
     * <p>
     * The email address of the supervisor.
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The email address of the supervisor.")
    private String email;

    /**
     * Name
     * <p>
     * The name of the supervisor.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the supervisor.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Supervisor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phone number of the supervisor.
     * 
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Phone
     * <p>
     * The phone number of the supervisor.
     * 
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Supervisor withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Email
     * <p>
     * The email address of the supervisor.
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email
     * <p>
     * The email address of the supervisor.
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Supervisor withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Supervisor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
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
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Supervisor) == false) {
            return false;
        }
        Supervisor rhs = ((Supervisor) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
