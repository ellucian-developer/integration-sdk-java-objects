
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Procedure
 * <p>
 * Procedures that follow the gift matching
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "donationProcedures",
    "originalSignature",
    "donationPhoneNumber",
    "donationWebsite"
})
@Generated("jsonschema2pojo")
public class Procedure {

    /**
     * Donation Procedures
     * <p>
     * Donation procedures followed for the gift matching program
     * 
     */
    @JsonProperty("donationProcedures")
    @JsonPropertyDescription("Donation procedures followed for the gift matching program")
    private List<DonationProcedure> donationProcedures = new ArrayList<DonationProcedure>();
    /**
     * Original Signature
     * <p>
     * Donors original signature.
     * 
     */
    @JsonProperty("originalSignature")
    @JsonPropertyDescription("Donors original signature.")
    private Procedure.OriginalSignature originalSignature;
    /**
     * Donation Telephone Number
     * <p>
     * Telephone number for donor to contact to initiate a gift.
     * 
     */
    @JsonProperty("donationPhoneNumber")
    @JsonPropertyDescription("Telephone number for donor to contact to initiate a gift.")
    private String donationPhoneNumber;
    /**
     * Donation Website URL
     * <p>
     * URL for on-line matching gift registration.
     * 
     */
    @JsonProperty("donationWebsite")
    @JsonPropertyDescription("URL for on-line matching gift registration.")
    private URI donationWebsite;

    /**
     * Donation Procedures
     * <p>
     * Donation procedures followed for the gift matching program
     * 
     */
    @JsonProperty("donationProcedures")
    public List<DonationProcedure> getDonationProcedures() {
        return donationProcedures;
    }

    /**
     * Donation Procedures
     * <p>
     * Donation procedures followed for the gift matching program
     * 
     */
    @JsonProperty("donationProcedures")
    public void setDonationProcedures(List<DonationProcedure> donationProcedures) {
        this.donationProcedures = donationProcedures;
    }

    public Procedure withDonationProcedures(List<DonationProcedure> donationProcedures) {
        this.donationProcedures = donationProcedures;
        return this;
    }

    /**
     * Original Signature
     * <p>
     * Donors original signature.
     * 
     */
    @JsonProperty("originalSignature")
    public Procedure.OriginalSignature getOriginalSignature() {
        return originalSignature;
    }

    /**
     * Original Signature
     * <p>
     * Donors original signature.
     * 
     */
    @JsonProperty("originalSignature")
    public void setOriginalSignature(Procedure.OriginalSignature originalSignature) {
        this.originalSignature = originalSignature;
    }

    public Procedure withOriginalSignature(Procedure.OriginalSignature originalSignature) {
        this.originalSignature = originalSignature;
        return this;
    }

    /**
     * Donation Telephone Number
     * <p>
     * Telephone number for donor to contact to initiate a gift.
     * 
     */
    @JsonProperty("donationPhoneNumber")
    public String getDonationPhoneNumber() {
        return donationPhoneNumber;
    }

    /**
     * Donation Telephone Number
     * <p>
     * Telephone number for donor to contact to initiate a gift.
     * 
     */
    @JsonProperty("donationPhoneNumber")
    public void setDonationPhoneNumber(String donationPhoneNumber) {
        this.donationPhoneNumber = donationPhoneNumber;
    }

    public Procedure withDonationPhoneNumber(String donationPhoneNumber) {
        this.donationPhoneNumber = donationPhoneNumber;
        return this;
    }

    /**
     * Donation Website URL
     * <p>
     * URL for on-line matching gift registration.
     * 
     */
    @JsonProperty("donationWebsite")
    public URI getDonationWebsite() {
        return donationWebsite;
    }

    /**
     * Donation Website URL
     * <p>
     * URL for on-line matching gift registration.
     * 
     */
    @JsonProperty("donationWebsite")
    public void setDonationWebsite(URI donationWebsite) {
        this.donationWebsite = donationWebsite;
    }

    public Procedure withDonationWebsite(URI donationWebsite) {
        this.donationWebsite = donationWebsite;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Procedure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("donationProcedures");
        sb.append('=');
        sb.append(((this.donationProcedures == null)?"<null>":this.donationProcedures));
        sb.append(',');
        sb.append("originalSignature");
        sb.append('=');
        sb.append(((this.originalSignature == null)?"<null>":this.originalSignature));
        sb.append(',');
        sb.append("donationPhoneNumber");
        sb.append('=');
        sb.append(((this.donationPhoneNumber == null)?"<null>":this.donationPhoneNumber));
        sb.append(',');
        sb.append("donationWebsite");
        sb.append('=');
        sb.append(((this.donationWebsite == null)?"<null>":this.donationWebsite));
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
        result = ((result* 31)+((this.originalSignature == null)? 0 :this.originalSignature.hashCode()));
        result = ((result* 31)+((this.donationProcedures == null)? 0 :this.donationProcedures.hashCode()));
        result = ((result* 31)+((this.donationPhoneNumber == null)? 0 :this.donationPhoneNumber.hashCode()));
        result = ((result* 31)+((this.donationWebsite == null)? 0 :this.donationWebsite.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Procedure) == false) {
            return false;
        }
        Procedure rhs = ((Procedure) other);
        return (((((this.originalSignature == rhs.originalSignature)||((this.originalSignature!= null)&&this.originalSignature.equals(rhs.originalSignature)))&&((this.donationProcedures == rhs.donationProcedures)||((this.donationProcedures!= null)&&this.donationProcedures.equals(rhs.donationProcedures))))&&((this.donationPhoneNumber == rhs.donationPhoneNumber)||((this.donationPhoneNumber!= null)&&this.donationPhoneNumber.equals(rhs.donationPhoneNumber))))&&((this.donationWebsite == rhs.donationWebsite)||((this.donationWebsite!= null)&&this.donationWebsite.equals(rhs.donationWebsite))));
    }


    /**
     * Original Signature
     * <p>
     * Donors original signature.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OriginalSignature {

        REQUIRED("required"),
        NOT_REQUIRED("notRequired");
        private final String value;
        private final static Map<String, Procedure.OriginalSignature> CONSTANTS = new HashMap<String, Procedure.OriginalSignature>();

        static {
            for (Procedure.OriginalSignature c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OriginalSignature(String value) {
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
        public static Procedure.OriginalSignature fromValue(String value) {
            Procedure.OriginalSignature constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
