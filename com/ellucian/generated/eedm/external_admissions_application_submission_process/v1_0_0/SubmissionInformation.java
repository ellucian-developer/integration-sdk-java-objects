
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Submission Information
 * <p>
 * Application submission information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consentIndicator",
    "confirmation",
    "nonCredit",
    "certificationQuestions",
    "eSignature",
    "languageFlag"
})
@Generated("jsonschema2pojo")
public class SubmissionInformation {

    /**
     * Consent
     * <p>
     * Indicates applicant's consent to Release Information question.
     * 
     */
    @JsonProperty("consentIndicator")
    @JsonPropertyDescription("Indicates applicant's consent to Release Information question.")
    private Boolean consentIndicator;
    /**
     * Application Confirmation Number
     * <p>
     * Confirmation Number assigned by the system when the application is submitted.
     * 
     */
    @JsonProperty("confirmation")
    @JsonPropertyDescription("Confirmation Number assigned by the system when the application is submitted.")
    private String confirmation;
    /**
     * Non-Credit Status
     * <p>
     * Identifies status of the Non-Credit Application path.
     * 
     */
    @JsonProperty("nonCredit")
    @JsonPropertyDescription("Identifies status of the Non-Credit Application path.")
    private Boolean nonCredit;
    /**
     * Certification Questions
     * <p>
     * Questions certified by the applicant during application submission
     * 
     */
    @JsonProperty("certificationQuestions")
    @JsonPropertyDescription("Questions certified by the applicant during application submission")
    private List<String> certificationQuestions = new ArrayList<String>();
    /**
     * Electronic Signature
     * <p>
     * Confirmation that applicant has provided the required electronic signature for submission of the application.
     * 
     */
    @JsonProperty("eSignature")
    @JsonPropertyDescription("Confirmation that applicant has provided the required electronic signature for submission of the application.")
    private String eSignature;
    /**
     * Language Flag
     * <p>
     * The state of the language toggle.
     * 
     */
    @JsonProperty("languageFlag")
    @JsonPropertyDescription("The state of the language toggle.")
    private String languageFlag;

    /**
     * Consent
     * <p>
     * Indicates applicant's consent to Release Information question.
     * 
     */
    @JsonProperty("consentIndicator")
    public Boolean getConsentIndicator() {
        return consentIndicator;
    }

    /**
     * Consent
     * <p>
     * Indicates applicant's consent to Release Information question.
     * 
     */
    @JsonProperty("consentIndicator")
    public void setConsentIndicator(Boolean consentIndicator) {
        this.consentIndicator = consentIndicator;
    }

    public SubmissionInformation withConsentIndicator(Boolean consentIndicator) {
        this.consentIndicator = consentIndicator;
        return this;
    }

    /**
     * Application Confirmation Number
     * <p>
     * Confirmation Number assigned by the system when the application is submitted.
     * 
     */
    @JsonProperty("confirmation")
    public String getConfirmation() {
        return confirmation;
    }

    /**
     * Application Confirmation Number
     * <p>
     * Confirmation Number assigned by the system when the application is submitted.
     * 
     */
    @JsonProperty("confirmation")
    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public SubmissionInformation withConfirmation(String confirmation) {
        this.confirmation = confirmation;
        return this;
    }

    /**
     * Non-Credit Status
     * <p>
     * Identifies status of the Non-Credit Application path.
     * 
     */
    @JsonProperty("nonCredit")
    public Boolean getNonCredit() {
        return nonCredit;
    }

    /**
     * Non-Credit Status
     * <p>
     * Identifies status of the Non-Credit Application path.
     * 
     */
    @JsonProperty("nonCredit")
    public void setNonCredit(Boolean nonCredit) {
        this.nonCredit = nonCredit;
    }

    public SubmissionInformation withNonCredit(Boolean nonCredit) {
        this.nonCredit = nonCredit;
        return this;
    }

    /**
     * Certification Questions
     * <p>
     * Questions certified by the applicant during application submission
     * 
     */
    @JsonProperty("certificationQuestions")
    public List<String> getCertificationQuestions() {
        return certificationQuestions;
    }

    /**
     * Certification Questions
     * <p>
     * Questions certified by the applicant during application submission
     * 
     */
    @JsonProperty("certificationQuestions")
    public void setCertificationQuestions(List<String> certificationQuestions) {
        this.certificationQuestions = certificationQuestions;
    }

    public SubmissionInformation withCertificationQuestions(List<String> certificationQuestions) {
        this.certificationQuestions = certificationQuestions;
        return this;
    }

    /**
     * Electronic Signature
     * <p>
     * Confirmation that applicant has provided the required electronic signature for submission of the application.
     * 
     */
    @JsonProperty("eSignature")
    public String geteSignature() {
        return eSignature;
    }

    /**
     * Electronic Signature
     * <p>
     * Confirmation that applicant has provided the required electronic signature for submission of the application.
     * 
     */
    @JsonProperty("eSignature")
    public void seteSignature(String eSignature) {
        this.eSignature = eSignature;
    }

    public SubmissionInformation witheSignature(String eSignature) {
        this.eSignature = eSignature;
        return this;
    }

    /**
     * Language Flag
     * <p>
     * The state of the language toggle.
     * 
     */
    @JsonProperty("languageFlag")
    public String getLanguageFlag() {
        return languageFlag;
    }

    /**
     * Language Flag
     * <p>
     * The state of the language toggle.
     * 
     */
    @JsonProperty("languageFlag")
    public void setLanguageFlag(String languageFlag) {
        this.languageFlag = languageFlag;
    }

    public SubmissionInformation withLanguageFlag(String languageFlag) {
        this.languageFlag = languageFlag;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubmissionInformation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("consentIndicator");
        sb.append('=');
        sb.append(((this.consentIndicator == null)?"<null>":this.consentIndicator));
        sb.append(',');
        sb.append("confirmation");
        sb.append('=');
        sb.append(((this.confirmation == null)?"<null>":this.confirmation));
        sb.append(',');
        sb.append("nonCredit");
        sb.append('=');
        sb.append(((this.nonCredit == null)?"<null>":this.nonCredit));
        sb.append(',');
        sb.append("certificationQuestions");
        sb.append('=');
        sb.append(((this.certificationQuestions == null)?"<null>":this.certificationQuestions));
        sb.append(',');
        sb.append("eSignature");
        sb.append('=');
        sb.append(((this.eSignature == null)?"<null>":this.eSignature));
        sb.append(',');
        sb.append("languageFlag");
        sb.append('=');
        sb.append(((this.languageFlag == null)?"<null>":this.languageFlag));
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
        result = ((result* 31)+((this.nonCredit == null)? 0 :this.nonCredit.hashCode()));
        result = ((result* 31)+((this.eSignature == null)? 0 :this.eSignature.hashCode()));
        result = ((result* 31)+((this.confirmation == null)? 0 :this.confirmation.hashCode()));
        result = ((result* 31)+((this.consentIndicator == null)? 0 :this.consentIndicator.hashCode()));
        result = ((result* 31)+((this.languageFlag == null)? 0 :this.languageFlag.hashCode()));
        result = ((result* 31)+((this.certificationQuestions == null)? 0 :this.certificationQuestions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubmissionInformation) == false) {
            return false;
        }
        SubmissionInformation rhs = ((SubmissionInformation) other);
        return (((((((this.nonCredit == rhs.nonCredit)||((this.nonCredit!= null)&&this.nonCredit.equals(rhs.nonCredit)))&&((this.eSignature == rhs.eSignature)||((this.eSignature!= null)&&this.eSignature.equals(rhs.eSignature))))&&((this.confirmation == rhs.confirmation)||((this.confirmation!= null)&&this.confirmation.equals(rhs.confirmation))))&&((this.consentIndicator == rhs.consentIndicator)||((this.consentIndicator!= null)&&this.consentIndicator.equals(rhs.consentIndicator))))&&((this.languageFlag == rhs.languageFlag)||((this.languageFlag!= null)&&this.languageFlag.equals(rhs.languageFlag))))&&((this.certificationQuestions == rhs.certificationQuestions)||((this.certificationQuestions!= null)&&this.certificationQuestions.equals(rhs.certificationQuestions))));
    }

}
