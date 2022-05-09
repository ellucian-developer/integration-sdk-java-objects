
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Hesa Itt Data
 * <p>
 * Information required by HESA for the Initial Teacher Training data return. This information will only be returned once the application status is `enrolled`.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sex",
    "disability",
    "ethnicity",
    "otherDisabilityDetails",
    "otherEthnicityDetails"
})
@Generated("jsonschema2pojo")
public class HesaIttData {

    /**
     * Sex
     * <p>
     * The candidate’s sex as a [1-digit HESA code for Sex].
     * 
     */
    @JsonProperty("sex")
    @JsonPropertyDescription("The candidate\u2019s sex as a [1-digit HESA code for Sex].")
    private String sex;
    /**
     * Disability
     * <p>
     * The candidate’s disability as [a 2-digit HESA code for Disability].
     * 
     */
    @JsonProperty("disability")
    @JsonPropertyDescription("The candidate\u2019s disability as [a 2-digit HESA code for Disability].")
    private List<String> disability = new ArrayList<String>();
    /**
     * Ethnicity
     * <p>
     * The candidate’s ethnicity as [a 2-digit HESA code for Ethnicity].
     * 
     */
    @JsonProperty("ethnicity")
    @JsonPropertyDescription("The candidate\u2019s ethnicity as [a 2-digit HESA code for Ethnicity].")
    private String ethnicity;
    /**
     * Other Disability Details
     * <p>
     * The candidate’s description of their disability, if they selected “Other” and entered a value.
     * 
     */
    @JsonProperty("otherDisabilityDetails")
    @JsonPropertyDescription("The candidate\u2019s description of their disability, if they selected \u201cOther\u201d and entered a value.")
    private String otherDisabilityDetails;
    /**
     * Other Ethnicity Details
     * <p>
     * The candidate’s description of their ethnicity, if they selected “Other” and entered a value.
     * 
     */
    @JsonProperty("otherEthnicityDetails")
    @JsonPropertyDescription("The candidate\u2019s description of their ethnicity, if they selected \u201cOther\u201d and entered a value.")
    private String otherEthnicityDetails;

    /**
     * Sex
     * <p>
     * The candidate’s sex as a [1-digit HESA code for Sex].
     * 
     */
    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    /**
     * Sex
     * <p>
     * The candidate’s sex as a [1-digit HESA code for Sex].
     * 
     */
    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public HesaIttData withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * Disability
     * <p>
     * The candidate’s disability as [a 2-digit HESA code for Disability].
     * 
     */
    @JsonProperty("disability")
    public List<String> getDisability() {
        return disability;
    }

    /**
     * Disability
     * <p>
     * The candidate’s disability as [a 2-digit HESA code for Disability].
     * 
     */
    @JsonProperty("disability")
    public void setDisability(List<String> disability) {
        this.disability = disability;
    }

    public HesaIttData withDisability(List<String> disability) {
        this.disability = disability;
        return this;
    }

    /**
     * Ethnicity
     * <p>
     * The candidate’s ethnicity as [a 2-digit HESA code for Ethnicity].
     * 
     */
    @JsonProperty("ethnicity")
    public String getEthnicity() {
        return ethnicity;
    }

    /**
     * Ethnicity
     * <p>
     * The candidate’s ethnicity as [a 2-digit HESA code for Ethnicity].
     * 
     */
    @JsonProperty("ethnicity")
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public HesaIttData withEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    /**
     * Other Disability Details
     * <p>
     * The candidate’s description of their disability, if they selected “Other” and entered a value.
     * 
     */
    @JsonProperty("otherDisabilityDetails")
    public String getOtherDisabilityDetails() {
        return otherDisabilityDetails;
    }

    /**
     * Other Disability Details
     * <p>
     * The candidate’s description of their disability, if they selected “Other” and entered a value.
     * 
     */
    @JsonProperty("otherDisabilityDetails")
    public void setOtherDisabilityDetails(String otherDisabilityDetails) {
        this.otherDisabilityDetails = otherDisabilityDetails;
    }

    public HesaIttData withOtherDisabilityDetails(String otherDisabilityDetails) {
        this.otherDisabilityDetails = otherDisabilityDetails;
        return this;
    }

    /**
     * Other Ethnicity Details
     * <p>
     * The candidate’s description of their ethnicity, if they selected “Other” and entered a value.
     * 
     */
    @JsonProperty("otherEthnicityDetails")
    public String getOtherEthnicityDetails() {
        return otherEthnicityDetails;
    }

    /**
     * Other Ethnicity Details
     * <p>
     * The candidate’s description of their ethnicity, if they selected “Other” and entered a value.
     * 
     */
    @JsonProperty("otherEthnicityDetails")
    public void setOtherEthnicityDetails(String otherEthnicityDetails) {
        this.otherEthnicityDetails = otherEthnicityDetails;
    }

    public HesaIttData withOtherEthnicityDetails(String otherEthnicityDetails) {
        this.otherEthnicityDetails = otherEthnicityDetails;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HesaIttData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sex");
        sb.append('=');
        sb.append(((this.sex == null)?"<null>":this.sex));
        sb.append(',');
        sb.append("disability");
        sb.append('=');
        sb.append(((this.disability == null)?"<null>":this.disability));
        sb.append(',');
        sb.append("ethnicity");
        sb.append('=');
        sb.append(((this.ethnicity == null)?"<null>":this.ethnicity));
        sb.append(',');
        sb.append("otherDisabilityDetails");
        sb.append('=');
        sb.append(((this.otherDisabilityDetails == null)?"<null>":this.otherDisabilityDetails));
        sb.append(',');
        sb.append("otherEthnicityDetails");
        sb.append('=');
        sb.append(((this.otherEthnicityDetails == null)?"<null>":this.otherEthnicityDetails));
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
        result = ((result* 31)+((this.ethnicity == null)? 0 :this.ethnicity.hashCode()));
        result = ((result* 31)+((this.disability == null)? 0 :this.disability.hashCode()));
        result = ((result* 31)+((this.otherDisabilityDetails == null)? 0 :this.otherDisabilityDetails.hashCode()));
        result = ((result* 31)+((this.otherEthnicityDetails == null)? 0 :this.otherEthnicityDetails.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HesaIttData) == false) {
            return false;
        }
        HesaIttData rhs = ((HesaIttData) other);
        return ((((((this.ethnicity == rhs.ethnicity)||((this.ethnicity!= null)&&this.ethnicity.equals(rhs.ethnicity)))&&((this.disability == rhs.disability)||((this.disability!= null)&&this.disability.equals(rhs.disability))))&&((this.otherDisabilityDetails == rhs.otherDisabilityDetails)||((this.otherDisabilityDetails!= null)&&this.otherDisabilityDetails.equals(rhs.otherDisabilityDetails))))&&((this.otherEthnicityDetails == rhs.otherEthnicityDetails)||((this.otherEthnicityDetails!= null)&&this.otherEthnicityDetails.equals(rhs.otherEthnicityDetails))))&&((this.sex == rhs.sex)||((this.sex!= null)&&this.sex.equals(rhs.sex))));
    }

}
