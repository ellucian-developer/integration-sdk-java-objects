
package com.ellucian.generated.eedm.contributions.v12_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "method",
    "externalReference",
    "tenderTypeDetail"
})
@Generated("jsonschema2pojo")
public class Payment {

    /**
     * Method
     * <p>
     * The method by which the payment was received.
     * (Required)
     * 
     */
    @JsonProperty("method")
    @JsonPropertyDescription("The method by which the payment was received.")
    private Method method;
    /**
     * External Reference
     * <p>
     * Reference information about a payment (as required based on payment method). This can be a confirmation number, credit card transaction code, or check number.
     * 
     */
    @JsonProperty("externalReference")
    @JsonPropertyDescription("Reference information about a payment (as required based on payment method). This can be a confirmation number, credit card transaction code, or check number.")
    private String externalReference;
    /**
     * Tender Type Detail
     * <p>
     * Details associated with the type of payment.
     * 
     */
    @JsonProperty("tenderTypeDetail")
    @JsonPropertyDescription("Details associated with the type of payment.")
    private Object tenderTypeDetail;

    /**
     * Method
     * <p>
     * The method by which the payment was received.
     * (Required)
     * 
     */
    @JsonProperty("method")
    public Method getMethod() {
        return method;
    }

    /**
     * Method
     * <p>
     * The method by which the payment was received.
     * (Required)
     * 
     */
    @JsonProperty("method")
    public void setMethod(Method method) {
        this.method = method;
    }

    public Payment withMethod(Method method) {
        this.method = method;
        return this;
    }

    /**
     * External Reference
     * <p>
     * Reference information about a payment (as required based on payment method). This can be a confirmation number, credit card transaction code, or check number.
     * 
     */
    @JsonProperty("externalReference")
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * External Reference
     * <p>
     * Reference information about a payment (as required based on payment method). This can be a confirmation number, credit card transaction code, or check number.
     * 
     */
    @JsonProperty("externalReference")
    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public Payment withExternalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    /**
     * Tender Type Detail
     * <p>
     * Details associated with the type of payment.
     * 
     */
    @JsonProperty("tenderTypeDetail")
    public Object getTenderTypeDetail() {
        return tenderTypeDetail;
    }

    /**
     * Tender Type Detail
     * <p>
     * Details associated with the type of payment.
     * 
     */
    @JsonProperty("tenderTypeDetail")
    public void setTenderTypeDetail(Object tenderTypeDetail) {
        this.tenderTypeDetail = tenderTypeDetail;
    }

    public Payment withTenderTypeDetail(Object tenderTypeDetail) {
        this.tenderTypeDetail = tenderTypeDetail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Payment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("externalReference");
        sb.append('=');
        sb.append(((this.externalReference == null)?"<null>":this.externalReference));
        sb.append(',');
        sb.append("tenderTypeDetail");
        sb.append('=');
        sb.append(((this.tenderTypeDetail == null)?"<null>":this.tenderTypeDetail));
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
        result = ((result* 31)+((this.externalReference == null)? 0 :this.externalReference.hashCode()));
        result = ((result* 31)+((this.tenderTypeDetail == null)? 0 :this.tenderTypeDetail.hashCode()));
        result = ((result* 31)+((this.method == null)? 0 :this.method.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payment) == false) {
            return false;
        }
        Payment rhs = ((Payment) other);
        return ((((this.externalReference == rhs.externalReference)||((this.externalReference!= null)&&this.externalReference.equals(rhs.externalReference)))&&((this.tenderTypeDetail == rhs.tenderTypeDetail)||((this.tenderTypeDetail!= null)&&this.tenderTypeDetail.equals(rhs.tenderTypeDetail))))&&((this.method == rhs.method)||((this.method!= null)&&this.method.equals(rhs.method))));
    }

}
