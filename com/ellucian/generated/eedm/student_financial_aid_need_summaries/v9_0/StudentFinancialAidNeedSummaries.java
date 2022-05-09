
package com.ellucian.generated.eedm.student_financial_aid_need_summaries.v9_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Student Financial Aid Need Summaries
 * <p>
 * The information needed to determine applicants' financial aid need.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "applicant",
    "aidYear",
    "needsByMethodology",
    "outsideResources"
})
@Generated("jsonschema2pojo")
public class StudentFinancialAidNeedSummaries {

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
     * The global identifier of the student financial aid need summary.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the student financial aid need summary.")
    private String id;
    /**
     * Applicant
     * <p>
     * The person who applied for financial aid.
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    @JsonPropertyDescription("The person who applied for financial aid.")
    private Applicant applicant;
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
     * Needs By Methodology
     * <p>
     * The need summary determined by the need analysis methodology.
     * (Required)
     * 
     */
    @JsonProperty("needsByMethodology")
    @JsonPropertyDescription("The need summary determined by the need analysis methodology.")
    private List<NeedsByMethodology> needsByMethodology = new ArrayList<NeedsByMethodology>();
    /**
     * Outside Resources
     * <p>
     * The additional financial resources available to the applicant which are not managed by the financial aid office.
     * 
     */
    @JsonProperty("outsideResources")
    @JsonPropertyDescription("The additional financial resources available to the applicant which are not managed by the financial aid office.")
    private Object outsideResources;

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

    public StudentFinancialAidNeedSummaries withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the student financial aid need summary.
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
     * The global identifier of the student financial aid need summary.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentFinancialAidNeedSummaries withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Applicant
     * <p>
     * The person who applied for financial aid.
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
     * The person who applied for financial aid.
     * (Required)
     * 
     */
    @JsonProperty("applicant")
    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public StudentFinancialAidNeedSummaries withApplicant(Applicant applicant) {
        this.applicant = applicant;
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

    public StudentFinancialAidNeedSummaries withAidYear(AidYear aidYear) {
        this.aidYear = aidYear;
        return this;
    }

    /**
     * Needs By Methodology
     * <p>
     * The need summary determined by the need analysis methodology.
     * (Required)
     * 
     */
    @JsonProperty("needsByMethodology")
    public List<NeedsByMethodology> getNeedsByMethodology() {
        return needsByMethodology;
    }

    /**
     * Needs By Methodology
     * <p>
     * The need summary determined by the need analysis methodology.
     * (Required)
     * 
     */
    @JsonProperty("needsByMethodology")
    public void setNeedsByMethodology(List<NeedsByMethodology> needsByMethodology) {
        this.needsByMethodology = needsByMethodology;
    }

    public StudentFinancialAidNeedSummaries withNeedsByMethodology(List<NeedsByMethodology> needsByMethodology) {
        this.needsByMethodology = needsByMethodology;
        return this;
    }

    /**
     * Outside Resources
     * <p>
     * The additional financial resources available to the applicant which are not managed by the financial aid office.
     * 
     */
    @JsonProperty("outsideResources")
    public Object getOutsideResources() {
        return outsideResources;
    }

    /**
     * Outside Resources
     * <p>
     * The additional financial resources available to the applicant which are not managed by the financial aid office.
     * 
     */
    @JsonProperty("outsideResources")
    public void setOutsideResources(Object outsideResources) {
        this.outsideResources = outsideResources;
    }

    public StudentFinancialAidNeedSummaries withOutsideResources(Object outsideResources) {
        this.outsideResources = outsideResources;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentFinancialAidNeedSummaries.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("aidYear");
        sb.append('=');
        sb.append(((this.aidYear == null)?"<null>":this.aidYear));
        sb.append(',');
        sb.append("needsByMethodology");
        sb.append('=');
        sb.append(((this.needsByMethodology == null)?"<null>":this.needsByMethodology));
        sb.append(',');
        sb.append("outsideResources");
        sb.append('=');
        sb.append(((this.outsideResources == null)?"<null>":this.outsideResources));
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
        result = ((result* 31)+((this.needsByMethodology == null)? 0 :this.needsByMethodology.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.aidYear == null)? 0 :this.aidYear.hashCode()));
        result = ((result* 31)+((this.outsideResources == null)? 0 :this.outsideResources.hashCode()));
        result = ((result* 31)+((this.applicant == null)? 0 :this.applicant.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentFinancialAidNeedSummaries) == false) {
            return false;
        }
        StudentFinancialAidNeedSummaries rhs = ((StudentFinancialAidNeedSummaries) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.needsByMethodology == rhs.needsByMethodology)||((this.needsByMethodology!= null)&&this.needsByMethodology.equals(rhs.needsByMethodology))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.aidYear == rhs.aidYear)||((this.aidYear!= null)&&this.aidYear.equals(rhs.aidYear))))&&((this.outsideResources == rhs.outsideResources)||((this.outsideResources!= null)&&this.outsideResources.equals(rhs.outsideResources))))&&((this.applicant == rhs.applicant)||((this.applicant!= null)&&this.applicant.equals(rhs.applicant))));
    }

}
