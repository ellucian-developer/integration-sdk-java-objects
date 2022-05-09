
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alternateFirstName",
    "alternateLastName"
})
@Generated("jsonschema2pojo")
public class AlternateName {

    /**
     * Alternate First Name
     * <p>
     * The alternate first name of the applicant
     * (Required)
     * 
     */
    @JsonProperty("alternateFirstName")
    @JsonPropertyDescription("The alternate first name of the applicant")
    private String alternateFirstName;
    /**
     * Alternate Last Name
     * <p>
     * The applicant's alternate last name
     * (Required)
     * 
     */
    @JsonProperty("alternateLastName")
    @JsonPropertyDescription("The applicant's alternate last name")
    private String alternateLastName;

    /**
     * Alternate First Name
     * <p>
     * The alternate first name of the applicant
     * (Required)
     * 
     */
    @JsonProperty("alternateFirstName")
    public String getAlternateFirstName() {
        return alternateFirstName;
    }

    /**
     * Alternate First Name
     * <p>
     * The alternate first name of the applicant
     * (Required)
     * 
     */
    @JsonProperty("alternateFirstName")
    public void setAlternateFirstName(String alternateFirstName) {
        this.alternateFirstName = alternateFirstName;
    }

    public AlternateName withAlternateFirstName(String alternateFirstName) {
        this.alternateFirstName = alternateFirstName;
        return this;
    }

    /**
     * Alternate Last Name
     * <p>
     * The applicant's alternate last name
     * (Required)
     * 
     */
    @JsonProperty("alternateLastName")
    public String getAlternateLastName() {
        return alternateLastName;
    }

    /**
     * Alternate Last Name
     * <p>
     * The applicant's alternate last name
     * (Required)
     * 
     */
    @JsonProperty("alternateLastName")
    public void setAlternateLastName(String alternateLastName) {
        this.alternateLastName = alternateLastName;
    }

    public AlternateName withAlternateLastName(String alternateLastName) {
        this.alternateLastName = alternateLastName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlternateName.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("alternateFirstName");
        sb.append('=');
        sb.append(((this.alternateFirstName == null)?"<null>":this.alternateFirstName));
        sb.append(',');
        sb.append("alternateLastName");
        sb.append('=');
        sb.append(((this.alternateLastName == null)?"<null>":this.alternateLastName));
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
        result = ((result* 31)+((this.alternateFirstName == null)? 0 :this.alternateFirstName.hashCode()));
        result = ((result* 31)+((this.alternateLastName == null)? 0 :this.alternateLastName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlternateName) == false) {
            return false;
        }
        AlternateName rhs = ((AlternateName) other);
        return (((this.alternateFirstName == rhs.alternateFirstName)||((this.alternateFirstName!= null)&&this.alternateFirstName.equals(rhs.alternateFirstName)))&&((this.alternateLastName == rhs.alternateLastName)||((this.alternateLastName!= null)&&this.alternateLastName.equals(rhs.alternateLastName))));
    }

}
