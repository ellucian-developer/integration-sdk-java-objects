
package com.ellucian.generated.eedm.admission_applications.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Withdrawal
 * <p>
 * Application withdrawal related information
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reason",
    "institutionAttended"
})
@Generated("jsonschema2pojo")
public class Withdrawal {

    /**
     * Reason
     * <p>
     * The application withdrawal reason
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("The application withdrawal reason")
    private Object reason;
    /**
     * Institution Attended
     * <p>
     * The institution attended by the applicant
     * 
     */
    @JsonProperty("institutionAttended")
    @JsonPropertyDescription("The institution attended by the applicant")
    private Object institutionAttended;

    /**
     * Reason
     * <p>
     * The application withdrawal reason
     * 
     */
    @JsonProperty("reason")
    public Object getReason() {
        return reason;
    }

    /**
     * Reason
     * <p>
     * The application withdrawal reason
     * 
     */
    @JsonProperty("reason")
    public void setReason(Object reason) {
        this.reason = reason;
    }

    public Withdrawal withReason(Object reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Institution Attended
     * <p>
     * The institution attended by the applicant
     * 
     */
    @JsonProperty("institutionAttended")
    public Object getInstitutionAttended() {
        return institutionAttended;
    }

    /**
     * Institution Attended
     * <p>
     * The institution attended by the applicant
     * 
     */
    @JsonProperty("institutionAttended")
    public void setInstitutionAttended(Object institutionAttended) {
        this.institutionAttended = institutionAttended;
    }

    public Withdrawal withInstitutionAttended(Object institutionAttended) {
        this.institutionAttended = institutionAttended;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Withdrawal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("institutionAttended");
        sb.append('=');
        sb.append(((this.institutionAttended == null)?"<null>":this.institutionAttended));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.institutionAttended == null)? 0 :this.institutionAttended.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Withdrawal) == false) {
            return false;
        }
        Withdrawal rhs = ((Withdrawal) other);
        return (((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.institutionAttended == rhs.institutionAttended)||((this.institutionAttended!= null)&&this.institutionAttended.equals(rhs.institutionAttended))));
    }

}
