
package com.ellucian.generated.eedm.pay_scales.v11_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grade",
    "step",
    "amount"
})
@Generated("jsonschema2pojo")
public class Scale {

    /**
     * Grade
     * <p>
     * The grouping of salary or wage steps within a pay structure.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grouping of salary or wage steps within a pay structure.")
    private String grade;
    /**
     * Step
     * <p>
     * The different level of compensation for a position within the salary grade.
     * (Required)
     * 
     */
    @JsonProperty("step")
    @JsonPropertyDescription("The different level of compensation for a position within the salary grade.")
    private String step;
    /**
     * Amount
     * <p>
     * The amount associated with the specific pay scale.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount associated with the specific pay scale.")
    private Object amount;

    /**
     * Grade
     * <p>
     * The grouping of salary or wage steps within a pay structure.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The grouping of salary or wage steps within a pay structure.
     * (Required)
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Scale withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Step
     * <p>
     * The different level of compensation for a position within the salary grade.
     * (Required)
     * 
     */
    @JsonProperty("step")
    public String getStep() {
        return step;
    }

    /**
     * Step
     * <p>
     * The different level of compensation for a position within the salary grade.
     * (Required)
     * 
     */
    @JsonProperty("step")
    public void setStep(String step) {
        this.step = step;
    }

    public Scale withStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount associated with the specific pay scale.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount associated with the specific pay scale.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public Scale withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scale.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("step");
        sb.append('=');
        sb.append(((this.step == null)?"<null>":this.step));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        result = ((result* 31)+((this.step == null)? 0 :this.step.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scale) == false) {
            return false;
        }
        Scale rhs = ((Scale) other);
        return ((((this.step == rhs.step)||((this.step!= null)&&this.step.equals(rhs.step)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))));
    }

}
