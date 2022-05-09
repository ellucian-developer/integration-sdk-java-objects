
package com.ellucian.generated.eedm.restricted_student_financial_aid_awards.v11_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "awardPeriod",
    "academicPeriods",
    "status",
    "amounts"
})
@Generated("jsonschema2pojo")
public class AwardsByPeriod {

    /**
     * Award Period
     * <p>
     * The period in which the award was bestowed.
     * (Required)
     * 
     */
    @JsonProperty("awardPeriod")
    @JsonPropertyDescription("The period in which the award was bestowed.")
    private AwardPeriod awardPeriod;
    /**
     * Academic Periods
     * <p>
     * Academic periods for which the financial award was made.
     * 
     */
    @JsonProperty("academicPeriods")
    @JsonPropertyDescription("Academic periods for which the financial award was made.")
    private List<AcademicPeriod> academicPeriods = new ArrayList<AcademicPeriod>();
    /**
     * Status
     * <p>
     * The status of the financial aid award.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the financial aid award.")
    private Object status;
    /**
     * Amounts
     * <p>
     * Various amounts involved in a financial aid award.
     * 
     */
    @JsonProperty("amounts")
    @JsonPropertyDescription("Various amounts involved in a financial aid award.")
    private Amounts amounts;

    /**
     * Award Period
     * <p>
     * The period in which the award was bestowed.
     * (Required)
     * 
     */
    @JsonProperty("awardPeriod")
    public AwardPeriod getAwardPeriod() {
        return awardPeriod;
    }

    /**
     * Award Period
     * <p>
     * The period in which the award was bestowed.
     * (Required)
     * 
     */
    @JsonProperty("awardPeriod")
    public void setAwardPeriod(AwardPeriod awardPeriod) {
        this.awardPeriod = awardPeriod;
    }

    public AwardsByPeriod withAwardPeriod(AwardPeriod awardPeriod) {
        this.awardPeriod = awardPeriod;
        return this;
    }

    /**
     * Academic Periods
     * <p>
     * Academic periods for which the financial award was made.
     * 
     */
    @JsonProperty("academicPeriods")
    public List<AcademicPeriod> getAcademicPeriods() {
        return academicPeriods;
    }

    /**
     * Academic Periods
     * <p>
     * Academic periods for which the financial award was made.
     * 
     */
    @JsonProperty("academicPeriods")
    public void setAcademicPeriods(List<AcademicPeriod> academicPeriods) {
        this.academicPeriods = academicPeriods;
    }

    public AwardsByPeriod withAcademicPeriods(List<AcademicPeriod> academicPeriods) {
        this.academicPeriods = academicPeriods;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the financial aid award.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the financial aid award.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public AwardsByPeriod withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Amounts
     * <p>
     * Various amounts involved in a financial aid award.
     * 
     */
    @JsonProperty("amounts")
    public Amounts getAmounts() {
        return amounts;
    }

    /**
     * Amounts
     * <p>
     * Various amounts involved in a financial aid award.
     * 
     */
    @JsonProperty("amounts")
    public void setAmounts(Amounts amounts) {
        this.amounts = amounts;
    }

    public AwardsByPeriod withAmounts(Amounts amounts) {
        this.amounts = amounts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AwardsByPeriod.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("awardPeriod");
        sb.append('=');
        sb.append(((this.awardPeriod == null)?"<null>":this.awardPeriod));
        sb.append(',');
        sb.append("academicPeriods");
        sb.append('=');
        sb.append(((this.academicPeriods == null)?"<null>":this.academicPeriods));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("amounts");
        sb.append('=');
        sb.append(((this.amounts == null)?"<null>":this.amounts));
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
        result = ((result* 31)+((this.awardPeriod == null)? 0 :this.awardPeriod.hashCode()));
        result = ((result* 31)+((this.academicPeriods == null)? 0 :this.academicPeriods.hashCode()));
        result = ((result* 31)+((this.amounts == null)? 0 :this.amounts.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AwardsByPeriod) == false) {
            return false;
        }
        AwardsByPeriod rhs = ((AwardsByPeriod) other);
        return (((((this.awardPeriod == rhs.awardPeriod)||((this.awardPeriod!= null)&&this.awardPeriod.equals(rhs.awardPeriod)))&&((this.academicPeriods == rhs.academicPeriods)||((this.academicPeriods!= null)&&this.academicPeriods.equals(rhs.academicPeriods))))&&((this.amounts == rhs.amounts)||((this.amounts!= null)&&this.amounts.equals(rhs.amounts))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
