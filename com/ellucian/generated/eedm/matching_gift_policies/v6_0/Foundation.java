
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Foundation
 * <p>
 * The foundation that the gifts donated will be matched by the company.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "name",
    "policyName"
})
@Generated("jsonschema2pojo")
public class Foundation {

    /**
     * Number
     * <p>
     * The identification number of the foundation that the gifts donated will be matched by the company.
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("The identification number of the foundation that the gifts donated will be matched by the company.")
    private String number;
    /**
     * Name
     * <p>
     * The name of the foundation that the gifts donated will be matched by the company.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the foundation that the gifts donated will be matched by the company.")
    private String name;
    /**
     * Policy Name
     * <p>
     * Name of the policy.
     * 
     */
    @JsonProperty("policyName")
    @JsonPropertyDescription("Name of the policy.")
    private String policyName;

    /**
     * Number
     * <p>
     * The identification number of the foundation that the gifts donated will be matched by the company.
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Number
     * <p>
     * The identification number of the foundation that the gifts donated will be matched by the company.
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Foundation withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Name
     * <p>
     * The name of the foundation that the gifts donated will be matched by the company.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the foundation that the gifts donated will be matched by the company.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Foundation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Policy Name
     * <p>
     * Name of the policy.
     * 
     */
    @JsonProperty("policyName")
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Policy Name
     * <p>
     * Name of the policy.
     * 
     */
    @JsonProperty("policyName")
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Foundation withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Foundation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("policyName");
        sb.append('=');
        sb.append(((this.policyName == null)?"<null>":this.policyName));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.policyName == null)? 0 :this.policyName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Foundation) == false) {
            return false;
        }
        Foundation rhs = ((Foundation) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.policyName == rhs.policyName)||((this.policyName!= null)&&this.policyName.equals(rhs.policyName))));
    }

}
