
package com.ellucian.generated.eedm.student_course_transfers.v13_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Credit
 * <p>
 * The unit specification that was awarded to the articulated/equivalent course.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "creditCategory",
    "measure",
    "awardedCredit"
})
@Generated("jsonschema2pojo")
public class Credit {

    /**
     * Credit Category
     * <p>
     * The category of credit associated with the articulated/equivalent course.
     * (Required)
     * 
     */
    @JsonProperty("creditCategory")
    @JsonPropertyDescription("The category of credit associated with the articulated/equivalent course.")
    private CreditCategory creditCategory;
    /**
     * Measure
     * <p>
     * A unit or standard of measurement for the credit.
     * 
     */
    @JsonProperty("measure")
    @JsonPropertyDescription("A unit or standard of measurement for the credit.")
    private Object measure;
    /**
     * Awarded Credit
     * <p>
     * The credit awarded for the articulated/equivalent course.
     * 
     */
    @JsonProperty("awardedCredit")
    @JsonPropertyDescription("The credit awarded for the articulated/equivalent course.")
    private Object awardedCredit;

    /**
     * Credit Category
     * <p>
     * The category of credit associated with the articulated/equivalent course.
     * (Required)
     * 
     */
    @JsonProperty("creditCategory")
    public CreditCategory getCreditCategory() {
        return creditCategory;
    }

    /**
     * Credit Category
     * <p>
     * The category of credit associated with the articulated/equivalent course.
     * (Required)
     * 
     */
    @JsonProperty("creditCategory")
    public void setCreditCategory(CreditCategory creditCategory) {
        this.creditCategory = creditCategory;
    }

    public Credit withCreditCategory(CreditCategory creditCategory) {
        this.creditCategory = creditCategory;
        return this;
    }

    /**
     * Measure
     * <p>
     * A unit or standard of measurement for the credit.
     * 
     */
    @JsonProperty("measure")
    public Object getMeasure() {
        return measure;
    }

    /**
     * Measure
     * <p>
     * A unit or standard of measurement for the credit.
     * 
     */
    @JsonProperty("measure")
    public void setMeasure(Object measure) {
        this.measure = measure;
    }

    public Credit withMeasure(Object measure) {
        this.measure = measure;
        return this;
    }

    /**
     * Awarded Credit
     * <p>
     * The credit awarded for the articulated/equivalent course.
     * 
     */
    @JsonProperty("awardedCredit")
    public Object getAwardedCredit() {
        return awardedCredit;
    }

    /**
     * Awarded Credit
     * <p>
     * The credit awarded for the articulated/equivalent course.
     * 
     */
    @JsonProperty("awardedCredit")
    public void setAwardedCredit(Object awardedCredit) {
        this.awardedCredit = awardedCredit;
    }

    public Credit withAwardedCredit(Object awardedCredit) {
        this.awardedCredit = awardedCredit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Credit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("creditCategory");
        sb.append('=');
        sb.append(((this.creditCategory == null)?"<null>":this.creditCategory));
        sb.append(',');
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
        sb.append(',');
        sb.append("awardedCredit");
        sb.append('=');
        sb.append(((this.awardedCredit == null)?"<null>":this.awardedCredit));
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
        result = ((result* 31)+((this.measure == null)? 0 :this.measure.hashCode()));
        result = ((result* 31)+((this.awardedCredit == null)? 0 :this.awardedCredit.hashCode()));
        result = ((result* 31)+((this.creditCategory == null)? 0 :this.creditCategory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Credit) == false) {
            return false;
        }
        Credit rhs = ((Credit) other);
        return ((((this.measure == rhs.measure)||((this.measure!= null)&&this.measure.equals(rhs.measure)))&&((this.awardedCredit == rhs.awardedCredit)||((this.awardedCredit!= null)&&this.awardedCredit.equals(rhs.awardedCredit))))&&((this.creditCategory == rhs.creditCategory)||((this.creditCategory!= null)&&this.creditCategory.equals(rhs.creditCategory))));
    }

}
