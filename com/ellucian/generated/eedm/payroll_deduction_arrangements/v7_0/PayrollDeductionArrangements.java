
package com.ellucian.generated.eedm.payroll_deduction_arrangements.v7_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Payroll Deduction Arrangements
 * <p>
 * A request to establish a payroll deduction.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "paymentTarget",
    "status",
    "amountPerPayment",
    "totalAmount",
    "startOn",
    "endOn",
    "payPeriodOccurence",
    "changeReason"
})
@Generated("jsonschema2pojo")
public class PayrollDeductionArrangements {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of a payroll deduction request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of a payroll deduction request.")
    private String id;
    /**
     * Person
     * <p>
     * The employee for whom the payroll deduction is requested.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The employee for whom the payroll deduction is requested.")
    private Person person;
    /**
     * Payment Target
     * <p>
     * The target towards which payroll deductions are requested.
     * (Required)
     * 
     */
    @JsonProperty("paymentTarget")
    @JsonPropertyDescription("The target towards which payroll deductions are requested.")
    private Object paymentTarget;
    /**
     * Status
     * <p>
     * The status of a payroll deduction request.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of a payroll deduction request.")
    private PayrollDeductionArrangements.Status status;
    /**
     * Amount per Payment
     * <p>
     * The amount to be deducted per instance.
     * (Required)
     * 
     */
    @JsonProperty("amountPerPayment")
    @JsonPropertyDescription("The amount to be deducted per instance.")
    private AmountPerPayment amountPerPayment;
    /**
     * Total Amount
     * <p>
     * The total amount to be deducted.
     * 
     */
    @JsonProperty("totalAmount")
    @JsonPropertyDescription("The total amount to be deducted.")
    private Object totalAmount;
    /**
     * Start On
     * <p>
     * The date when the payroll deductions should begin.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the payroll deductions should begin.")
    private String startOn;
    /**
     * End On
     * <p>
     * The date when the payroll deductions should end.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the payroll deductions should end.")
    private Object endOn;
    /**
     * Pay Period Occurence
     * <p>
     * The pay periods for which the payroll deductions are applicable.
     * (Required)
     * 
     */
    @JsonProperty("payPeriodOccurence")
    @JsonPropertyDescription("The pay periods for which the payroll deductions are applicable.")
    private Object payPeriodOccurence;
    /**
     * Change Reason
     * <p>
     * The reason why a property was changed (example: status change)
     * 
     */
    @JsonProperty("changeReason")
    @JsonPropertyDescription("The reason why a property was changed (example: status change)")
    private Object changeReason;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public PayrollDeductionArrangements withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of a payroll deduction request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of a payroll deduction request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PayrollDeductionArrangements withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The employee for whom the payroll deduction is requested.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The employee for whom the payroll deduction is requested.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public PayrollDeductionArrangements withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Payment Target
     * <p>
     * The target towards which payroll deductions are requested.
     * (Required)
     * 
     */
    @JsonProperty("paymentTarget")
    public Object getPaymentTarget() {
        return paymentTarget;
    }

    /**
     * Payment Target
     * <p>
     * The target towards which payroll deductions are requested.
     * (Required)
     * 
     */
    @JsonProperty("paymentTarget")
    public void setPaymentTarget(Object paymentTarget) {
        this.paymentTarget = paymentTarget;
    }

    public PayrollDeductionArrangements withPaymentTarget(Object paymentTarget) {
        this.paymentTarget = paymentTarget;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of a payroll deduction request.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public PayrollDeductionArrangements.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of a payroll deduction request.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(PayrollDeductionArrangements.Status status) {
        this.status = status;
    }

    public PayrollDeductionArrangements withStatus(PayrollDeductionArrangements.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Amount per Payment
     * <p>
     * The amount to be deducted per instance.
     * (Required)
     * 
     */
    @JsonProperty("amountPerPayment")
    public AmountPerPayment getAmountPerPayment() {
        return amountPerPayment;
    }

    /**
     * Amount per Payment
     * <p>
     * The amount to be deducted per instance.
     * (Required)
     * 
     */
    @JsonProperty("amountPerPayment")
    public void setAmountPerPayment(AmountPerPayment amountPerPayment) {
        this.amountPerPayment = amountPerPayment;
    }

    public PayrollDeductionArrangements withAmountPerPayment(AmountPerPayment amountPerPayment) {
        this.amountPerPayment = amountPerPayment;
        return this;
    }

    /**
     * Total Amount
     * <p>
     * The total amount to be deducted.
     * 
     */
    @JsonProperty("totalAmount")
    public Object getTotalAmount() {
        return totalAmount;
    }

    /**
     * Total Amount
     * <p>
     * The total amount to be deducted.
     * 
     */
    @JsonProperty("totalAmount")
    public void setTotalAmount(Object totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PayrollDeductionArrangements withTotalAmount(Object totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when the payroll deductions should begin.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the payroll deductions should begin.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public PayrollDeductionArrangements withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date when the payroll deductions should end.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when the payroll deductions should end.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public PayrollDeductionArrangements withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Pay Period Occurence
     * <p>
     * The pay periods for which the payroll deductions are applicable.
     * (Required)
     * 
     */
    @JsonProperty("payPeriodOccurence")
    public Object getPayPeriodOccurence() {
        return payPeriodOccurence;
    }

    /**
     * Pay Period Occurence
     * <p>
     * The pay periods for which the payroll deductions are applicable.
     * (Required)
     * 
     */
    @JsonProperty("payPeriodOccurence")
    public void setPayPeriodOccurence(Object payPeriodOccurence) {
        this.payPeriodOccurence = payPeriodOccurence;
    }

    public PayrollDeductionArrangements withPayPeriodOccurence(Object payPeriodOccurence) {
        this.payPeriodOccurence = payPeriodOccurence;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * The reason why a property was changed (example: status change)
     * 
     */
    @JsonProperty("changeReason")
    public Object getChangeReason() {
        return changeReason;
    }

    /**
     * Change Reason
     * <p>
     * The reason why a property was changed (example: status change)
     * 
     */
    @JsonProperty("changeReason")
    public void setChangeReason(Object changeReason) {
        this.changeReason = changeReason;
    }

    public PayrollDeductionArrangements withChangeReason(Object changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayrollDeductionArrangements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("paymentTarget");
        sb.append('=');
        sb.append(((this.paymentTarget == null)?"<null>":this.paymentTarget));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("amountPerPayment");
        sb.append('=');
        sb.append(((this.amountPerPayment == null)?"<null>":this.amountPerPayment));
        sb.append(',');
        sb.append("totalAmount");
        sb.append('=');
        sb.append(((this.totalAmount == null)?"<null>":this.totalAmount));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("payPeriodOccurence");
        sb.append('=');
        sb.append(((this.payPeriodOccurence == null)?"<null>":this.payPeriodOccurence));
        sb.append(',');
        sb.append("changeReason");
        sb.append('=');
        sb.append(((this.changeReason == null)?"<null>":this.changeReason));
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
        result = ((result* 31)+((this.paymentTarget == null)? 0 :this.paymentTarget.hashCode()));
        result = ((result* 31)+((this.amountPerPayment == null)? 0 :this.amountPerPayment.hashCode()));
        result = ((result* 31)+((this.totalAmount == null)? 0 :this.totalAmount.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.changeReason == null)? 0 :this.changeReason.hashCode()));
        result = ((result* 31)+((this.payPeriodOccurence == null)? 0 :this.payPeriodOccurence.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayrollDeductionArrangements) == false) {
            return false;
        }
        PayrollDeductionArrangements rhs = ((PayrollDeductionArrangements) other);
        return ((((((((((((this.paymentTarget == rhs.paymentTarget)||((this.paymentTarget!= null)&&this.paymentTarget.equals(rhs.paymentTarget)))&&((this.amountPerPayment == rhs.amountPerPayment)||((this.amountPerPayment!= null)&&this.amountPerPayment.equals(rhs.amountPerPayment))))&&((this.totalAmount == rhs.totalAmount)||((this.totalAmount!= null)&&this.totalAmount.equals(rhs.totalAmount))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.changeReason == rhs.changeReason)||((this.changeReason!= null)&&this.changeReason.equals(rhs.changeReason))))&&((this.payPeriodOccurence == rhs.payPeriodOccurence)||((this.payPeriodOccurence!= null)&&this.payPeriodOccurence.equals(rhs.payPeriodOccurence))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of a payroll deduction request.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        SUSPENDED("suspended"),
        REJECTED("rejected"),
        CANCELLED("cancelled"),
        WITHDRAWN("withdrawn"),
        TERMINATED("terminated");
        private final String value;
        private final static Map<String, PayrollDeductionArrangements.Status> CONSTANTS = new HashMap<String, PayrollDeductionArrangements.Status>();

        static {
            for (PayrollDeductionArrangements.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static PayrollDeductionArrangements.Status fromValue(String value) {
            PayrollDeductionArrangements.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
