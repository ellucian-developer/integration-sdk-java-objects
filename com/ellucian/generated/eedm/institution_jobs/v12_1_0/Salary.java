
package com.ellucian.generated.eedm.institution_jobs.v12_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grade",
    "step",
    "amount",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class Salary {

    /**
     * Grade
     * <p>
     * The grade of salary for the job.
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The grade of salary for the job.")
    private String grade;
    /**
     * Step
     * <p>
     * The step of salary for the job.
     * 
     */
    @JsonProperty("step")
    @JsonPropertyDescription("The step of salary for the job.")
    private String step;
    /**
     * Amount
     * <p>
     * The amount of salary for the job.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount of salary for the job.")
    private Amount amount;
    /**
     * Start On
     * <p>
     * The start date associated with the salary.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The start date associated with the salary.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The end date associated with the salary.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The end date associated with the salary.")
    private Object endOn;

    /**
     * Grade
     * <p>
     * The grade of salary for the job.
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The grade of salary for the job.
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Salary withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Step
     * <p>
     * The step of salary for the job.
     * 
     */
    @JsonProperty("step")
    public String getStep() {
        return step;
    }

    /**
     * Step
     * <p>
     * The step of salary for the job.
     * 
     */
    @JsonProperty("step")
    public void setStep(String step) {
        this.step = step;
    }

    public Salary withStep(String step) {
        this.step = step;
        return this;
    }

    /**
     * Amount
     * <p>
     * The amount of salary for the job.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The amount of salary for the job.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Salary withAmount(Amount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Start On
     * <p>
     * The start date associated with the salary.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The start date associated with the salary.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Salary withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The end date associated with the salary.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The end date associated with the salary.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Salary withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Salary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.step == null)? 0 :this.step.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Salary) == false) {
            return false;
        }
        Salary rhs = ((Salary) other);
        return ((((((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn)))&&((this.step == rhs.step)||((this.step!= null)&&this.step.equals(rhs.step))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))));
    }

}
