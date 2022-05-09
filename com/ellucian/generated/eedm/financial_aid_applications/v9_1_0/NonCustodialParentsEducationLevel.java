
package com.ellucian.generated.eedm.financial_aid_applications.v9_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Non Custodial Parents Education Level
 * <p>
 * The highest grade level completed by the applicant's noncustodial parents.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstParent",
    "secondParent"
})
@Generated("jsonschema2pojo")
public class NonCustodialParentsEducationLevel {

    /**
     * First Parent
     * <p>
     * The highest education level completed by the applicant's first noncustodial parent.
     * 
     */
    @JsonProperty("firstParent")
    @JsonPropertyDescription("The highest education level completed by the applicant's first noncustodial parent.")
    private Object firstParent;
    /**
     * Second Parent
     * <p>
     * The highest education level completed by the applicant's second noncustodial parent.
     * 
     */
    @JsonProperty("secondParent")
    @JsonPropertyDescription("The highest education level completed by the applicant's second noncustodial parent.")
    private Object secondParent;

    /**
     * First Parent
     * <p>
     * The highest education level completed by the applicant's first noncustodial parent.
     * 
     */
    @JsonProperty("firstParent")
    public Object getFirstParent() {
        return firstParent;
    }

    /**
     * First Parent
     * <p>
     * The highest education level completed by the applicant's first noncustodial parent.
     * 
     */
    @JsonProperty("firstParent")
    public void setFirstParent(Object firstParent) {
        this.firstParent = firstParent;
    }

    public NonCustodialParentsEducationLevel withFirstParent(Object firstParent) {
        this.firstParent = firstParent;
        return this;
    }

    /**
     * Second Parent
     * <p>
     * The highest education level completed by the applicant's second noncustodial parent.
     * 
     */
    @JsonProperty("secondParent")
    public Object getSecondParent() {
        return secondParent;
    }

    /**
     * Second Parent
     * <p>
     * The highest education level completed by the applicant's second noncustodial parent.
     * 
     */
    @JsonProperty("secondParent")
    public void setSecondParent(Object secondParent) {
        this.secondParent = secondParent;
    }

    public NonCustodialParentsEducationLevel withSecondParent(Object secondParent) {
        this.secondParent = secondParent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NonCustodialParentsEducationLevel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstParent");
        sb.append('=');
        sb.append(((this.firstParent == null)?"<null>":this.firstParent));
        sb.append(',');
        sb.append("secondParent");
        sb.append('=');
        sb.append(((this.secondParent == null)?"<null>":this.secondParent));
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
        result = ((result* 31)+((this.firstParent == null)? 0 :this.firstParent.hashCode()));
        result = ((result* 31)+((this.secondParent == null)? 0 :this.secondParent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NonCustodialParentsEducationLevel) == false) {
            return false;
        }
        NonCustodialParentsEducationLevel rhs = ((NonCustodialParentsEducationLevel) other);
        return (((this.firstParent == rhs.firstParent)||((this.firstParent!= null)&&this.firstParent.equals(rhs.firstParent)))&&((this.secondParent == rhs.secondParent)||((this.secondParent!= null)&&this.secondParent.equals(rhs.secondParent))));
    }

}
