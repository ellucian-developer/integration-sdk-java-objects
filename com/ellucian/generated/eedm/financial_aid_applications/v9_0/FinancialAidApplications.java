
package com.ellucian.generated.eedm.financial_aid_applications.v9_0;

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
 * Financial Aid Applications
 * <p>
 * Detailed information concerning financial aid applications.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "applicant",
    "applicationCompletedOn",
    "aidYear",
    "methodology",
    "source",
    "stateOfLegalResidence",
    "independenceCriteria",
    "workStudy",
    "housingPreference",
    "applicantIncome",
    "custodialParentsIncome",
    "noncustodialParentsIncome"
})
@Generated("jsonschema2pojo")
public class FinancialAidApplications {

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
     * The global identifier of the financial aid application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the financial aid application.")
    private String id;
    /**
     * Applicant
     * <p>
     * The person associated with the financial aid application.
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    @JsonPropertyDescription("The person associated with the financial aid application.")
    private Applicant applicant;
    /**
     * Application Completed On
     * <p>
     * The date the application was completed.
     * 
     */
    @JsonProperty("applicationCompletedOn")
    @JsonPropertyDescription("The date the application was completed.")
    private Object applicationCompletedOn;
    /**
     * Aid Year
     * <p>
     * The financial aid year for which the applicant applied.
     * (Required)
     * 
     */
    @JsonProperty("aidYear")
    @JsonPropertyDescription("The financial aid year for which the applicant applied.")
    private AidYear aidYear;
    /**
     * Methodology
     * <p>
     * The methodology for which the application is applicable.
     * (Required)
     * 
     */
    @JsonProperty("methodology")
    @JsonPropertyDescription("The methodology for which the application is applicable.")
    private FinancialAidApplications.Methodology methodology;
    /**
     * Source
     * <p>
     * The source of the financial aid application.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the financial aid application.")
    private FinancialAidApplications.Source source;
    /**
     * State Of Legal Residence
     * <p>
     * The applicant's state of legal residence.
     * 
     */
    @JsonProperty("stateOfLegalResidence")
    @JsonPropertyDescription("The applicant's state of legal residence.")
    private String stateOfLegalResidence;
    /**
     * Independence Criteria
     * <p>
     * The criteria for determining the applicant's dependency status.
     * 
     */
    @JsonProperty("independenceCriteria")
    @JsonPropertyDescription("The criteria for determining the applicant's dependency status.")
    private List<IndependenceCriterium> independenceCriteria = new ArrayList<IndependenceCriterium>();
    /**
     * Work Study
     * <p>
     * An indication of the applicant's interest in a work study program.
     * 
     */
    @JsonProperty("workStudy")
    @JsonPropertyDescription("An indication of the applicant's interest in a work study program.")
    private Object workStudy;
    /**
     * Housing Preference
     * <p>
     * The applicant's housing preference.
     * 
     */
    @JsonProperty("housingPreference")
    @JsonPropertyDescription("The applicant's housing preference.")
    private Object housingPreference;
    /**
     * Applicant Income
     * <p>
     * The applicant's income information.
     * 
     */
    @JsonProperty("applicantIncome")
    @JsonPropertyDescription("The applicant's income information.")
    private Object applicantIncome;
    /**
     * Custodial Parents Income
     * <p>
     * The custodial parent(s) income information.
     * 
     */
    @JsonProperty("custodialParentsIncome")
    @JsonPropertyDescription("The custodial parent(s) income information.")
    private Object custodialParentsIncome;
    /**
     * Noncustodial Parents Income
     * <p>
     * The noncustodial parent(s) income information.
     * 
     */
    @JsonProperty("noncustodialParentsIncome")
    @JsonPropertyDescription("The noncustodial parent(s) income information.")
    private Object noncustodialParentsIncome;

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

    public FinancialAidApplications withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the financial aid application.
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
     * The global identifier of the financial aid application.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FinancialAidApplications withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Applicant
     * <p>
     * The person associated with the financial aid application.
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    public Applicant getApplicant() {
        return applicant;
    }

    /**
     * Applicant
     * <p>
     * The person associated with the financial aid application.
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public FinancialAidApplications withApplicant(Applicant applicant) {
        this.applicant = applicant;
        return this;
    }

    /**
     * Application Completed On
     * <p>
     * The date the application was completed.
     * 
     */
    @JsonProperty("applicationCompletedOn")
    public Object getApplicationCompletedOn() {
        return applicationCompletedOn;
    }

    /**
     * Application Completed On
     * <p>
     * The date the application was completed.
     * 
     */
    @JsonProperty("applicationCompletedOn")
    public void setApplicationCompletedOn(Object applicationCompletedOn) {
        this.applicationCompletedOn = applicationCompletedOn;
    }

    public FinancialAidApplications withApplicationCompletedOn(Object applicationCompletedOn) {
        this.applicationCompletedOn = applicationCompletedOn;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * The financial aid year for which the applicant applied.
     * (Required)
     * 
     */
    @JsonProperty("aidYear")
    public AidYear getAidYear() {
        return aidYear;
    }

    /**
     * Aid Year
     * <p>
     * The financial aid year for which the applicant applied.
     * (Required)
     * 
     */
    @JsonProperty("aidYear")
    public void setAidYear(AidYear aidYear) {
        this.aidYear = aidYear;
    }

    public FinancialAidApplications withAidYear(AidYear aidYear) {
        this.aidYear = aidYear;
        return this;
    }

    /**
     * Methodology
     * <p>
     * The methodology for which the application is applicable.
     * (Required)
     * 
     */
    @JsonProperty("methodology")
    public FinancialAidApplications.Methodology getMethodology() {
        return methodology;
    }

    /**
     * Methodology
     * <p>
     * The methodology for which the application is applicable.
     * (Required)
     * 
     */
    @JsonProperty("methodology")
    public void setMethodology(FinancialAidApplications.Methodology methodology) {
        this.methodology = methodology;
    }

    public FinancialAidApplications withMethodology(FinancialAidApplications.Methodology methodology) {
        this.methodology = methodology;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the financial aid application.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public FinancialAidApplications.Source getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the financial aid application.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(FinancialAidApplications.Source source) {
        this.source = source;
    }

    public FinancialAidApplications withSource(FinancialAidApplications.Source source) {
        this.source = source;
        return this;
    }

    /**
     * State Of Legal Residence
     * <p>
     * The applicant's state of legal residence.
     * 
     */
    @JsonProperty("stateOfLegalResidence")
    public String getStateOfLegalResidence() {
        return stateOfLegalResidence;
    }

    /**
     * State Of Legal Residence
     * <p>
     * The applicant's state of legal residence.
     * 
     */
    @JsonProperty("stateOfLegalResidence")
    public void setStateOfLegalResidence(String stateOfLegalResidence) {
        this.stateOfLegalResidence = stateOfLegalResidence;
    }

    public FinancialAidApplications withStateOfLegalResidence(String stateOfLegalResidence) {
        this.stateOfLegalResidence = stateOfLegalResidence;
        return this;
    }

    /**
     * Independence Criteria
     * <p>
     * The criteria for determining the applicant's dependency status.
     * 
     */
    @JsonProperty("independenceCriteria")
    public List<IndependenceCriterium> getIndependenceCriteria() {
        return independenceCriteria;
    }

    /**
     * Independence Criteria
     * <p>
     * The criteria for determining the applicant's dependency status.
     * 
     */
    @JsonProperty("independenceCriteria")
    public void setIndependenceCriteria(List<IndependenceCriterium> independenceCriteria) {
        this.independenceCriteria = independenceCriteria;
    }

    public FinancialAidApplications withIndependenceCriteria(List<IndependenceCriterium> independenceCriteria) {
        this.independenceCriteria = independenceCriteria;
        return this;
    }

    /**
     * Work Study
     * <p>
     * An indication of the applicant's interest in a work study program.
     * 
     */
    @JsonProperty("workStudy")
    public Object getWorkStudy() {
        return workStudy;
    }

    /**
     * Work Study
     * <p>
     * An indication of the applicant's interest in a work study program.
     * 
     */
    @JsonProperty("workStudy")
    public void setWorkStudy(Object workStudy) {
        this.workStudy = workStudy;
    }

    public FinancialAidApplications withWorkStudy(Object workStudy) {
        this.workStudy = workStudy;
        return this;
    }

    /**
     * Housing Preference
     * <p>
     * The applicant's housing preference.
     * 
     */
    @JsonProperty("housingPreference")
    public Object getHousingPreference() {
        return housingPreference;
    }

    /**
     * Housing Preference
     * <p>
     * The applicant's housing preference.
     * 
     */
    @JsonProperty("housingPreference")
    public void setHousingPreference(Object housingPreference) {
        this.housingPreference = housingPreference;
    }

    public FinancialAidApplications withHousingPreference(Object housingPreference) {
        this.housingPreference = housingPreference;
        return this;
    }

    /**
     * Applicant Income
     * <p>
     * The applicant's income information.
     * 
     */
    @JsonProperty("applicantIncome")
    public Object getApplicantIncome() {
        return applicantIncome;
    }

    /**
     * Applicant Income
     * <p>
     * The applicant's income information.
     * 
     */
    @JsonProperty("applicantIncome")
    public void setApplicantIncome(Object applicantIncome) {
        this.applicantIncome = applicantIncome;
    }

    public FinancialAidApplications withApplicantIncome(Object applicantIncome) {
        this.applicantIncome = applicantIncome;
        return this;
    }

    /**
     * Custodial Parents Income
     * <p>
     * The custodial parent(s) income information.
     * 
     */
    @JsonProperty("custodialParentsIncome")
    public Object getCustodialParentsIncome() {
        return custodialParentsIncome;
    }

    /**
     * Custodial Parents Income
     * <p>
     * The custodial parent(s) income information.
     * 
     */
    @JsonProperty("custodialParentsIncome")
    public void setCustodialParentsIncome(Object custodialParentsIncome) {
        this.custodialParentsIncome = custodialParentsIncome;
    }

    public FinancialAidApplications withCustodialParentsIncome(Object custodialParentsIncome) {
        this.custodialParentsIncome = custodialParentsIncome;
        return this;
    }

    /**
     * Noncustodial Parents Income
     * <p>
     * The noncustodial parent(s) income information.
     * 
     */
    @JsonProperty("noncustodialParentsIncome")
    public Object getNoncustodialParentsIncome() {
        return noncustodialParentsIncome;
    }

    /**
     * Noncustodial Parents Income
     * <p>
     * The noncustodial parent(s) income information.
     * 
     */
    @JsonProperty("noncustodialParentsIncome")
    public void setNoncustodialParentsIncome(Object noncustodialParentsIncome) {
        this.noncustodialParentsIncome = noncustodialParentsIncome;
    }

    public FinancialAidApplications withNoncustodialParentsIncome(Object noncustodialParentsIncome) {
        this.noncustodialParentsIncome = noncustodialParentsIncome;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialAidApplications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("applicant");
        sb.append('=');
        sb.append(((this.applicant == null)?"<null>":this.applicant));
        sb.append(',');
        sb.append("applicationCompletedOn");
        sb.append('=');
        sb.append(((this.applicationCompletedOn == null)?"<null>":this.applicationCompletedOn));
        sb.append(',');
        sb.append("aidYear");
        sb.append('=');
        sb.append(((this.aidYear == null)?"<null>":this.aidYear));
        sb.append(',');
        sb.append("methodology");
        sb.append('=');
        sb.append(((this.methodology == null)?"<null>":this.methodology));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("stateOfLegalResidence");
        sb.append('=');
        sb.append(((this.stateOfLegalResidence == null)?"<null>":this.stateOfLegalResidence));
        sb.append(',');
        sb.append("independenceCriteria");
        sb.append('=');
        sb.append(((this.independenceCriteria == null)?"<null>":this.independenceCriteria));
        sb.append(',');
        sb.append("workStudy");
        sb.append('=');
        sb.append(((this.workStudy == null)?"<null>":this.workStudy));
        sb.append(',');
        sb.append("housingPreference");
        sb.append('=');
        sb.append(((this.housingPreference == null)?"<null>":this.housingPreference));
        sb.append(',');
        sb.append("applicantIncome");
        sb.append('=');
        sb.append(((this.applicantIncome == null)?"<null>":this.applicantIncome));
        sb.append(',');
        sb.append("custodialParentsIncome");
        sb.append('=');
        sb.append(((this.custodialParentsIncome == null)?"<null>":this.custodialParentsIncome));
        sb.append(',');
        sb.append("noncustodialParentsIncome");
        sb.append('=');
        sb.append(((this.noncustodialParentsIncome == null)?"<null>":this.noncustodialParentsIncome));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.stateOfLegalResidence == null)? 0 :this.stateOfLegalResidence.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.aidYear == null)? 0 :this.aidYear.hashCode()));
        result = ((result* 31)+((this.applicant == null)? 0 :this.applicant.hashCode()));
        result = ((result* 31)+((this.workStudy == null)? 0 :this.workStudy.hashCode()));
        result = ((result* 31)+((this.custodialParentsIncome == null)? 0 :this.custodialParentsIncome.hashCode()));
        result = ((result* 31)+((this.independenceCriteria == null)? 0 :this.independenceCriteria.hashCode()));
        result = ((result* 31)+((this.noncustodialParentsIncome == null)? 0 :this.noncustodialParentsIncome.hashCode()));
        result = ((result* 31)+((this.housingPreference == null)? 0 :this.housingPreference.hashCode()));
        result = ((result* 31)+((this.applicationCompletedOn == null)? 0 :this.applicationCompletedOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.methodology == null)? 0 :this.methodology.hashCode()));
        result = ((result* 31)+((this.applicantIncome == null)? 0 :this.applicantIncome.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialAidApplications) == false) {
            return false;
        }
        FinancialAidApplications rhs = ((FinancialAidApplications) other);
        return (((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.stateOfLegalResidence == rhs.stateOfLegalResidence)||((this.stateOfLegalResidence!= null)&&this.stateOfLegalResidence.equals(rhs.stateOfLegalResidence))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.aidYear == rhs.aidYear)||((this.aidYear!= null)&&this.aidYear.equals(rhs.aidYear))))&&((this.applicant == rhs.applicant)||((this.applicant!= null)&&this.applicant.equals(rhs.applicant))))&&((this.workStudy == rhs.workStudy)||((this.workStudy!= null)&&this.workStudy.equals(rhs.workStudy))))&&((this.custodialParentsIncome == rhs.custodialParentsIncome)||((this.custodialParentsIncome!= null)&&this.custodialParentsIncome.equals(rhs.custodialParentsIncome))))&&((this.independenceCriteria == rhs.independenceCriteria)||((this.independenceCriteria!= null)&&this.independenceCriteria.equals(rhs.independenceCriteria))))&&((this.noncustodialParentsIncome == rhs.noncustodialParentsIncome)||((this.noncustodialParentsIncome!= null)&&this.noncustodialParentsIncome.equals(rhs.noncustodialParentsIncome))))&&((this.housingPreference == rhs.housingPreference)||((this.housingPreference!= null)&&this.housingPreference.equals(rhs.housingPreference))))&&((this.applicationCompletedOn == rhs.applicationCompletedOn)||((this.applicationCompletedOn!= null)&&this.applicationCompletedOn.equals(rhs.applicationCompletedOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.methodology == rhs.methodology)||((this.methodology!= null)&&this.methodology.equals(rhs.methodology))))&&((this.applicantIncome == rhs.applicantIncome)||((this.applicantIncome!= null)&&this.applicantIncome.equals(rhs.applicantIncome))));
    }


    /**
     * Methodology
     * <p>
     * The methodology for which the application is applicable.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Methodology {

        INSTITUTIONAL("institutional"),
        FEDERAL("federal"),
        INSTITUTIONAL_FEDERAL("institutionalFederal");
        private final String value;
        private final static Map<String, FinancialAidApplications.Methodology> CONSTANTS = new HashMap<String, FinancialAidApplications.Methodology>();

        static {
            for (FinancialAidApplications.Methodology c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Methodology(String value) {
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
        public static FinancialAidApplications.Methodology fromValue(String value) {
            FinancialAidApplications.Methodology constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Source
     * <p>
     * The source of the financial aid application.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Source {

        ISIR("isir"),
        PROFILE("profile"),
        MANUAL_FEDERAL("manualFederal"),
        MANUAL_INSTITUTION("manualInstitution");
        private final String value;
        private final static Map<String, FinancialAidApplications.Source> CONSTANTS = new HashMap<String, FinancialAidApplications.Source>();

        static {
            for (FinancialAidApplications.Source c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Source(String value) {
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
        public static FinancialAidApplications.Source fromValue(String value) {
            FinancialAidApplications.Source constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
