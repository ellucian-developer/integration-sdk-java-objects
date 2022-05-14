
package com.ellucian.generated.eedm.financial_aid_application_outcomes.v9_0;

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
 * Financial Aid Application Outcomes
 * <p>
 * The analysis results of applicants' financial aid applications.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "applicant",
    "aidYear",
    "methodology",
    "application",
    "rejectionStatus",
    "studentAidReportResolution",
    "dependency",
    "dependencyOverride",
    "expectedFamilyContribution",
    "expectedStudentContribution",
    "expectedTotalParentContribution",
    "expectedNoncustodialParentContribution",
    "applicantHomeEquity",
    "custodialParentHomeEquity",
    "nonCustodialParentHomeEquity",
    "totalIncome",
    "pellEligibility",
    "automaticZeroContribution",
    "simplifiedNeedsTest",
    "professionalJudgement",
    "verificationStatus",
    "verificationCategory"
})
@Generated("jsonschema2pojo")
public class FinancialAidApplicationOutcomes {

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
     * The global identifier of the financial aid application outcome.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the financial aid application outcome.")
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
     * Methodology
     * <p>
     * The methodology used to analyze the application.
     * (Required)
     * 
     */
    @JsonProperty("methodology")
    @JsonPropertyDescription("The methodology used to analyze the application.")
    private FinancialAidApplicationOutcomes.Methodology methodology;
    /**
     * Application
     * <p>
     * The application analyzed to generate the outcome.
     * (Required)
     * 
     */
    @JsonProperty("application")
    @JsonPropertyDescription("The application analyzed to generate the outcome.")
    private Application application;
    /**
     * Rejection Status
     * <p>
     * An indication if the financial aid application has been rejected.
     * 
     */
    @JsonProperty("rejectionStatus")
    @JsonPropertyDescription("An indication if the financial aid application has been rejected.")
    private Object rejectionStatus;
    /**
     * Student Aid Report Resolution
     * <p>
     * An indication that the SAR C flag has been set and requires resolution.
     * 
     */
    @JsonProperty("studentAidReportResolution")
    @JsonPropertyDescription("An indication that the SAR C flag has been set and requires resolution.")
    private Object studentAidReportResolution;
    /**
     * Dependency
     * <p>
     * An indication of the applicant's dependency status.
     * 
     */
    @JsonProperty("dependency")
    @JsonPropertyDescription("An indication of the applicant's dependency status.")
    private Object dependency;
    /**
     * Dependency Override
     * <p>
     * An indication that the applicant's dependency status has been overridden.
     * 
     */
    @JsonProperty("dependencyOverride")
    @JsonPropertyDescription("An indication that the applicant's dependency status has been overridden.")
    private Object dependencyOverride;
    /**
     * Expected Family Contribution
     * <p>
     * The expected contribution from the family.
     * 
     */
    @JsonProperty("expectedFamilyContribution")
    @JsonPropertyDescription("The expected contribution from the family.")
    private Object expectedFamilyContribution;
    /**
     * Expected Student Contribution
     * <p>
     * The expected contribution from the student.
     * 
     */
    @JsonProperty("expectedStudentContribution")
    @JsonPropertyDescription("The expected contribution from the student.")
    private Object expectedStudentContribution;
    /**
     * Expected Total Parent Contribution
     * <p>
     * The expected total contribution from the parent(s).
     * 
     */
    @JsonProperty("expectedTotalParentContribution")
    @JsonPropertyDescription("The expected total contribution from the parent(s).")
    private Object expectedTotalParentContribution;
    /**
     * Expected Noncustodial Parent Contribution
     * <p>
     * The subset of the total parental contribution provided by a noncustodial parent.
     * 
     */
    @JsonProperty("expectedNoncustodialParentContribution")
    @JsonPropertyDescription("The subset of the total parental contribution provided by a noncustodial parent.")
    private Object expectedNoncustodialParentContribution;
    /**
     * Applicant Home Equity
     * <p>
     * The derived equity of the applicant's home.
     * 
     */
    @JsonProperty("applicantHomeEquity")
    @JsonPropertyDescription("The derived equity of the applicant's home.")
    private Object applicantHomeEquity;
    /**
     * Custodial Parent Home Equity
     * <p>
     * The derived equity of the custodial parent's home.
     * 
     */
    @JsonProperty("custodialParentHomeEquity")
    @JsonPropertyDescription("The derived equity of the custodial parent's home.")
    private Object custodialParentHomeEquity;
    /**
     * Non Custodial Parent Home Equity
     * <p>
     * The derived equity of the non custodial parent's home.
     * 
     */
    @JsonProperty("nonCustodialParentHomeEquity")
    @JsonPropertyDescription("The derived equity of the non custodial parent's home.")
    private Object nonCustodialParentHomeEquity;
    /**
     * Total Income
     * <p>
     * The FISAP total income.
     * 
     */
    @JsonProperty("totalIncome")
    @JsonPropertyDescription("The FISAP total income.")
    private Object totalIncome;
    /**
     * Pell Eligibility
     * <p>
     * An indication that the applicant may be eligible to receive a Pell grant.
     * 
     */
    @JsonProperty("pellEligibility")
    @JsonPropertyDescription("An indication that the applicant may be eligible to receive a Pell grant.")
    private Object pellEligibility;
    /**
     * Automatic Zero Contribution
     * <p>
     * An indication that automatic zero contribution has been applied.
     * 
     */
    @JsonProperty("automaticZeroContribution")
    @JsonPropertyDescription("An indication that automatic zero contribution has been applied.")
    private Object automaticZeroContribution;
    /**
     * Simplified Needs Test
     * <p>
     * An indication that the requirements for the simplified needs test have been met.
     * 
     */
    @JsonProperty("simplifiedNeedsTest")
    @JsonPropertyDescription("An indication that the requirements for the simplified needs test have been met.")
    private Object simplifiedNeedsTest;
    /**
     * Professional Judgement
     * <p>
     * The response to a professional judgement request for the application.
     * 
     */
    @JsonProperty("professionalJudgement")
    @JsonPropertyDescription("The response to a professional judgement request for the application.")
    private Object professionalJudgement;
    /**
     * Verification Status
     * <p>
     * An indication if the application has been federally selected for information verification.
     * 
     */
    @JsonProperty("verificationStatus")
    @JsonPropertyDescription("An indication if the application has been federally selected for information verification.")
    private Object verificationStatus;
    /**
     * Verification Category
     * <p>
     * The verification category applied to the application.
     * 
     */
    @JsonProperty("verificationCategory")
    @JsonPropertyDescription("The verification category applied to the application.")
    private String verificationCategory;

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

    public FinancialAidApplicationOutcomes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the financial aid application outcome.
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
     * The global identifier of the financial aid application outcome.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FinancialAidApplicationOutcomes withId(String id) {
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

    public FinancialAidApplicationOutcomes withApplicant(Applicant applicant) {
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

    public FinancialAidApplicationOutcomes withAidYear(AidYear aidYear) {
        this.aidYear = aidYear;
        return this;
    }

    /**
     * Methodology
     * <p>
     * The methodology used to analyze the application.
     * (Required)
     * 
     */
    @JsonProperty("methodology")
    public FinancialAidApplicationOutcomes.Methodology getMethodology() {
        return methodology;
    }

    /**
     * Methodology
     * <p>
     * The methodology used to analyze the application.
     * (Required)
     * 
     */
    @JsonProperty("methodology")
    public void setMethodology(FinancialAidApplicationOutcomes.Methodology methodology) {
        this.methodology = methodology;
    }

    public FinancialAidApplicationOutcomes withMethodology(FinancialAidApplicationOutcomes.Methodology methodology) {
        this.methodology = methodology;
        return this;
    }

    /**
     * Application
     * <p>
     * The application analyzed to generate the outcome.
     * (Required)
     * 
     */
    @JsonProperty("application")
    public Application getApplication() {
        return application;
    }

    /**
     * Application
     * <p>
     * The application analyzed to generate the outcome.
     * (Required)
     * 
     */
    @JsonProperty("application")
    public void setApplication(Application application) {
        this.application = application;
    }

    public FinancialAidApplicationOutcomes withApplication(Application application) {
        this.application = application;
        return this;
    }

    /**
     * Rejection Status
     * <p>
     * An indication if the financial aid application has been rejected.
     * 
     */
    @JsonProperty("rejectionStatus")
    public Object getRejectionStatus() {
        return rejectionStatus;
    }

    /**
     * Rejection Status
     * <p>
     * An indication if the financial aid application has been rejected.
     * 
     */
    @JsonProperty("rejectionStatus")
    public void setRejectionStatus(Object rejectionStatus) {
        this.rejectionStatus = rejectionStatus;
    }

    public FinancialAidApplicationOutcomes withRejectionStatus(Object rejectionStatus) {
        this.rejectionStatus = rejectionStatus;
        return this;
    }

    /**
     * Student Aid Report Resolution
     * <p>
     * An indication that the SAR C flag has been set and requires resolution.
     * 
     */
    @JsonProperty("studentAidReportResolution")
    public Object getStudentAidReportResolution() {
        return studentAidReportResolution;
    }

    /**
     * Student Aid Report Resolution
     * <p>
     * An indication that the SAR C flag has been set and requires resolution.
     * 
     */
    @JsonProperty("studentAidReportResolution")
    public void setStudentAidReportResolution(Object studentAidReportResolution) {
        this.studentAidReportResolution = studentAidReportResolution;
    }

    public FinancialAidApplicationOutcomes withStudentAidReportResolution(Object studentAidReportResolution) {
        this.studentAidReportResolution = studentAidReportResolution;
        return this;
    }

    /**
     * Dependency
     * <p>
     * An indication of the applicant's dependency status.
     * 
     */
    @JsonProperty("dependency")
    public Object getDependency() {
        return dependency;
    }

    /**
     * Dependency
     * <p>
     * An indication of the applicant's dependency status.
     * 
     */
    @JsonProperty("dependency")
    public void setDependency(Object dependency) {
        this.dependency = dependency;
    }

    public FinancialAidApplicationOutcomes withDependency(Object dependency) {
        this.dependency = dependency;
        return this;
    }

    /**
     * Dependency Override
     * <p>
     * An indication that the applicant's dependency status has been overridden.
     * 
     */
    @JsonProperty("dependencyOverride")
    public Object getDependencyOverride() {
        return dependencyOverride;
    }

    /**
     * Dependency Override
     * <p>
     * An indication that the applicant's dependency status has been overridden.
     * 
     */
    @JsonProperty("dependencyOverride")
    public void setDependencyOverride(Object dependencyOverride) {
        this.dependencyOverride = dependencyOverride;
    }

    public FinancialAidApplicationOutcomes withDependencyOverride(Object dependencyOverride) {
        this.dependencyOverride = dependencyOverride;
        return this;
    }

    /**
     * Expected Family Contribution
     * <p>
     * The expected contribution from the family.
     * 
     */
    @JsonProperty("expectedFamilyContribution")
    public Object getExpectedFamilyContribution() {
        return expectedFamilyContribution;
    }

    /**
     * Expected Family Contribution
     * <p>
     * The expected contribution from the family.
     * 
     */
    @JsonProperty("expectedFamilyContribution")
    public void setExpectedFamilyContribution(Object expectedFamilyContribution) {
        this.expectedFamilyContribution = expectedFamilyContribution;
    }

    public FinancialAidApplicationOutcomes withExpectedFamilyContribution(Object expectedFamilyContribution) {
        this.expectedFamilyContribution = expectedFamilyContribution;
        return this;
    }

    /**
     * Expected Student Contribution
     * <p>
     * The expected contribution from the student.
     * 
     */
    @JsonProperty("expectedStudentContribution")
    public Object getExpectedStudentContribution() {
        return expectedStudentContribution;
    }

    /**
     * Expected Student Contribution
     * <p>
     * The expected contribution from the student.
     * 
     */
    @JsonProperty("expectedStudentContribution")
    public void setExpectedStudentContribution(Object expectedStudentContribution) {
        this.expectedStudentContribution = expectedStudentContribution;
    }

    public FinancialAidApplicationOutcomes withExpectedStudentContribution(Object expectedStudentContribution) {
        this.expectedStudentContribution = expectedStudentContribution;
        return this;
    }

    /**
     * Expected Total Parent Contribution
     * <p>
     * The expected total contribution from the parent(s).
     * 
     */
    @JsonProperty("expectedTotalParentContribution")
    public Object getExpectedTotalParentContribution() {
        return expectedTotalParentContribution;
    }

    /**
     * Expected Total Parent Contribution
     * <p>
     * The expected total contribution from the parent(s).
     * 
     */
    @JsonProperty("expectedTotalParentContribution")
    public void setExpectedTotalParentContribution(Object expectedTotalParentContribution) {
        this.expectedTotalParentContribution = expectedTotalParentContribution;
    }

    public FinancialAidApplicationOutcomes withExpectedTotalParentContribution(Object expectedTotalParentContribution) {
        this.expectedTotalParentContribution = expectedTotalParentContribution;
        return this;
    }

    /**
     * Expected Noncustodial Parent Contribution
     * <p>
     * The subset of the total parental contribution provided by a noncustodial parent.
     * 
     */
    @JsonProperty("expectedNoncustodialParentContribution")
    public Object getExpectedNoncustodialParentContribution() {
        return expectedNoncustodialParentContribution;
    }

    /**
     * Expected Noncustodial Parent Contribution
     * <p>
     * The subset of the total parental contribution provided by a noncustodial parent.
     * 
     */
    @JsonProperty("expectedNoncustodialParentContribution")
    public void setExpectedNoncustodialParentContribution(Object expectedNoncustodialParentContribution) {
        this.expectedNoncustodialParentContribution = expectedNoncustodialParentContribution;
    }

    public FinancialAidApplicationOutcomes withExpectedNoncustodialParentContribution(Object expectedNoncustodialParentContribution) {
        this.expectedNoncustodialParentContribution = expectedNoncustodialParentContribution;
        return this;
    }

    /**
     * Applicant Home Equity
     * <p>
     * The derived equity of the applicant's home.
     * 
     */
    @JsonProperty("applicantHomeEquity")
    public Object getApplicantHomeEquity() {
        return applicantHomeEquity;
    }

    /**
     * Applicant Home Equity
     * <p>
     * The derived equity of the applicant's home.
     * 
     */
    @JsonProperty("applicantHomeEquity")
    public void setApplicantHomeEquity(Object applicantHomeEquity) {
        this.applicantHomeEquity = applicantHomeEquity;
    }

    public FinancialAidApplicationOutcomes withApplicantHomeEquity(Object applicantHomeEquity) {
        this.applicantHomeEquity = applicantHomeEquity;
        return this;
    }

    /**
     * Custodial Parent Home Equity
     * <p>
     * The derived equity of the custodial parent's home.
     * 
     */
    @JsonProperty("custodialParentHomeEquity")
    public Object getCustodialParentHomeEquity() {
        return custodialParentHomeEquity;
    }

    /**
     * Custodial Parent Home Equity
     * <p>
     * The derived equity of the custodial parent's home.
     * 
     */
    @JsonProperty("custodialParentHomeEquity")
    public void setCustodialParentHomeEquity(Object custodialParentHomeEquity) {
        this.custodialParentHomeEquity = custodialParentHomeEquity;
    }

    public FinancialAidApplicationOutcomes withCustodialParentHomeEquity(Object custodialParentHomeEquity) {
        this.custodialParentHomeEquity = custodialParentHomeEquity;
        return this;
    }

    /**
     * Non Custodial Parent Home Equity
     * <p>
     * The derived equity of the non custodial parent's home.
     * 
     */
    @JsonProperty("nonCustodialParentHomeEquity")
    public Object getNonCustodialParentHomeEquity() {
        return nonCustodialParentHomeEquity;
    }

    /**
     * Non Custodial Parent Home Equity
     * <p>
     * The derived equity of the non custodial parent's home.
     * 
     */
    @JsonProperty("nonCustodialParentHomeEquity")
    public void setNonCustodialParentHomeEquity(Object nonCustodialParentHomeEquity) {
        this.nonCustodialParentHomeEquity = nonCustodialParentHomeEquity;
    }

    public FinancialAidApplicationOutcomes withNonCustodialParentHomeEquity(Object nonCustodialParentHomeEquity) {
        this.nonCustodialParentHomeEquity = nonCustodialParentHomeEquity;
        return this;
    }

    /**
     * Total Income
     * <p>
     * The FISAP total income.
     * 
     */
    @JsonProperty("totalIncome")
    public Object getTotalIncome() {
        return totalIncome;
    }

    /**
     * Total Income
     * <p>
     * The FISAP total income.
     * 
     */
    @JsonProperty("totalIncome")
    public void setTotalIncome(Object totalIncome) {
        this.totalIncome = totalIncome;
    }

    public FinancialAidApplicationOutcomes withTotalIncome(Object totalIncome) {
        this.totalIncome = totalIncome;
        return this;
    }

    /**
     * Pell Eligibility
     * <p>
     * An indication that the applicant may be eligible to receive a Pell grant.
     * 
     */
    @JsonProperty("pellEligibility")
    public Object getPellEligibility() {
        return pellEligibility;
    }

    /**
     * Pell Eligibility
     * <p>
     * An indication that the applicant may be eligible to receive a Pell grant.
     * 
     */
    @JsonProperty("pellEligibility")
    public void setPellEligibility(Object pellEligibility) {
        this.pellEligibility = pellEligibility;
    }

    public FinancialAidApplicationOutcomes withPellEligibility(Object pellEligibility) {
        this.pellEligibility = pellEligibility;
        return this;
    }

    /**
     * Automatic Zero Contribution
     * <p>
     * An indication that automatic zero contribution has been applied.
     * 
     */
    @JsonProperty("automaticZeroContribution")
    public Object getAutomaticZeroContribution() {
        return automaticZeroContribution;
    }

    /**
     * Automatic Zero Contribution
     * <p>
     * An indication that automatic zero contribution has been applied.
     * 
     */
    @JsonProperty("automaticZeroContribution")
    public void setAutomaticZeroContribution(Object automaticZeroContribution) {
        this.automaticZeroContribution = automaticZeroContribution;
    }

    public FinancialAidApplicationOutcomes withAutomaticZeroContribution(Object automaticZeroContribution) {
        this.automaticZeroContribution = automaticZeroContribution;
        return this;
    }

    /**
     * Simplified Needs Test
     * <p>
     * An indication that the requirements for the simplified needs test have been met.
     * 
     */
    @JsonProperty("simplifiedNeedsTest")
    public Object getSimplifiedNeedsTest() {
        return simplifiedNeedsTest;
    }

    /**
     * Simplified Needs Test
     * <p>
     * An indication that the requirements for the simplified needs test have been met.
     * 
     */
    @JsonProperty("simplifiedNeedsTest")
    public void setSimplifiedNeedsTest(Object simplifiedNeedsTest) {
        this.simplifiedNeedsTest = simplifiedNeedsTest;
    }

    public FinancialAidApplicationOutcomes withSimplifiedNeedsTest(Object simplifiedNeedsTest) {
        this.simplifiedNeedsTest = simplifiedNeedsTest;
        return this;
    }

    /**
     * Professional Judgement
     * <p>
     * The response to a professional judgement request for the application.
     * 
     */
    @JsonProperty("professionalJudgement")
    public Object getProfessionalJudgement() {
        return professionalJudgement;
    }

    /**
     * Professional Judgement
     * <p>
     * The response to a professional judgement request for the application.
     * 
     */
    @JsonProperty("professionalJudgement")
    public void setProfessionalJudgement(Object professionalJudgement) {
        this.professionalJudgement = professionalJudgement;
    }

    public FinancialAidApplicationOutcomes withProfessionalJudgement(Object professionalJudgement) {
        this.professionalJudgement = professionalJudgement;
        return this;
    }

    /**
     * Verification Status
     * <p>
     * An indication if the application has been federally selected for information verification.
     * 
     */
    @JsonProperty("verificationStatus")
    public Object getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Verification Status
     * <p>
     * An indication if the application has been federally selected for information verification.
     * 
     */
    @JsonProperty("verificationStatus")
    public void setVerificationStatus(Object verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public FinancialAidApplicationOutcomes withVerificationStatus(Object verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * Verification Category
     * <p>
     * The verification category applied to the application.
     * 
     */
    @JsonProperty("verificationCategory")
    public String getVerificationCategory() {
        return verificationCategory;
    }

    /**
     * Verification Category
     * <p>
     * The verification category applied to the application.
     * 
     */
    @JsonProperty("verificationCategory")
    public void setVerificationCategory(String verificationCategory) {
        this.verificationCategory = verificationCategory;
    }

    public FinancialAidApplicationOutcomes withVerificationCategory(String verificationCategory) {
        this.verificationCategory = verificationCategory;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialAidApplicationOutcomes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("methodology");
        sb.append('=');
        sb.append(((this.methodology == null)?"<null>":this.methodology));
        sb.append(',');
        sb.append("application");
        sb.append('=');
        sb.append(((this.application == null)?"<null>":this.application));
        sb.append(',');
        sb.append("rejectionStatus");
        sb.append('=');
        sb.append(((this.rejectionStatus == null)?"<null>":this.rejectionStatus));
        sb.append(',');
        sb.append("studentAidReportResolution");
        sb.append('=');
        sb.append(((this.studentAidReportResolution == null)?"<null>":this.studentAidReportResolution));
        sb.append(',');
        sb.append("dependency");
        sb.append('=');
        sb.append(((this.dependency == null)?"<null>":this.dependency));
        sb.append(',');
        sb.append("dependencyOverride");
        sb.append('=');
        sb.append(((this.dependencyOverride == null)?"<null>":this.dependencyOverride));
        sb.append(',');
        sb.append("expectedFamilyContribution");
        sb.append('=');
        sb.append(((this.expectedFamilyContribution == null)?"<null>":this.expectedFamilyContribution));
        sb.append(',');
        sb.append("expectedStudentContribution");
        sb.append('=');
        sb.append(((this.expectedStudentContribution == null)?"<null>":this.expectedStudentContribution));
        sb.append(',');
        sb.append("expectedTotalParentContribution");
        sb.append('=');
        sb.append(((this.expectedTotalParentContribution == null)?"<null>":this.expectedTotalParentContribution));
        sb.append(',');
        sb.append("expectedNoncustodialParentContribution");
        sb.append('=');
        sb.append(((this.expectedNoncustodialParentContribution == null)?"<null>":this.expectedNoncustodialParentContribution));
        sb.append(',');
        sb.append("applicantHomeEquity");
        sb.append('=');
        sb.append(((this.applicantHomeEquity == null)?"<null>":this.applicantHomeEquity));
        sb.append(',');
        sb.append("custodialParentHomeEquity");
        sb.append('=');
        sb.append(((this.custodialParentHomeEquity == null)?"<null>":this.custodialParentHomeEquity));
        sb.append(',');
        sb.append("nonCustodialParentHomeEquity");
        sb.append('=');
        sb.append(((this.nonCustodialParentHomeEquity == null)?"<null>":this.nonCustodialParentHomeEquity));
        sb.append(',');
        sb.append("totalIncome");
        sb.append('=');
        sb.append(((this.totalIncome == null)?"<null>":this.totalIncome));
        sb.append(',');
        sb.append("pellEligibility");
        sb.append('=');
        sb.append(((this.pellEligibility == null)?"<null>":this.pellEligibility));
        sb.append(',');
        sb.append("automaticZeroContribution");
        sb.append('=');
        sb.append(((this.automaticZeroContribution == null)?"<null>":this.automaticZeroContribution));
        sb.append(',');
        sb.append("simplifiedNeedsTest");
        sb.append('=');
        sb.append(((this.simplifiedNeedsTest == null)?"<null>":this.simplifiedNeedsTest));
        sb.append(',');
        sb.append("professionalJudgement");
        sb.append('=');
        sb.append(((this.professionalJudgement == null)?"<null>":this.professionalJudgement));
        sb.append(',');
        sb.append("verificationStatus");
        sb.append('=');
        sb.append(((this.verificationStatus == null)?"<null>":this.verificationStatus));
        sb.append(',');
        sb.append("verificationCategory");
        sb.append('=');
        sb.append(((this.verificationCategory == null)?"<null>":this.verificationCategory));
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
        result = ((result* 31)+((this.rejectionStatus == null)? 0 :this.rejectionStatus.hashCode()));
        result = ((result* 31)+((this.automaticZeroContribution == null)? 0 :this.automaticZeroContribution.hashCode()));
        result = ((result* 31)+((this.nonCustodialParentHomeEquity == null)? 0 :this.nonCustodialParentHomeEquity.hashCode()));
        result = ((result* 31)+((this.aidYear == null)? 0 :this.aidYear.hashCode()));
        result = ((result* 31)+((this.studentAidReportResolution == null)? 0 :this.studentAidReportResolution.hashCode()));
        result = ((result* 31)+((this.expectedTotalParentContribution == null)? 0 :this.expectedTotalParentContribution.hashCode()));
        result = ((result* 31)+((this.expectedFamilyContribution == null)? 0 :this.expectedFamilyContribution.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.verificationCategory == null)? 0 :this.verificationCategory.hashCode()));
        result = ((result* 31)+((this.dependencyOverride == null)? 0 :this.dependencyOverride.hashCode()));
        result = ((result* 31)+((this.expectedStudentContribution == null)? 0 :this.expectedStudentContribution.hashCode()));
        result = ((result* 31)+((this.dependency == null)? 0 :this.dependency.hashCode()));
        result = ((result* 31)+((this.verificationStatus == null)? 0 :this.verificationStatus.hashCode()));
        result = ((result* 31)+((this.custodialParentHomeEquity == null)? 0 :this.custodialParentHomeEquity.hashCode()));
        result = ((result* 31)+((this.expectedNoncustodialParentContribution == null)? 0 :this.expectedNoncustodialParentContribution.hashCode()));
        result = ((result* 31)+((this.applicant == null)? 0 :this.applicant.hashCode()));
        result = ((result* 31)+((this.totalIncome == null)? 0 :this.totalIncome.hashCode()));
        result = ((result* 31)+((this.professionalJudgement == null)? 0 :this.professionalJudgement.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.applicantHomeEquity == null)? 0 :this.applicantHomeEquity.hashCode()));
        result = ((result* 31)+((this.simplifiedNeedsTest == null)? 0 :this.simplifiedNeedsTest.hashCode()));
        result = ((result* 31)+((this.pellEligibility == null)? 0 :this.pellEligibility.hashCode()));
        result = ((result* 31)+((this.methodology == null)? 0 :this.methodology.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialAidApplicationOutcomes) == false) {
            return false;
        }
        FinancialAidApplicationOutcomes rhs = ((FinancialAidApplicationOutcomes) other);
        return (((((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.rejectionStatus == rhs.rejectionStatus)||((this.rejectionStatus!= null)&&this.rejectionStatus.equals(rhs.rejectionStatus))))&&((this.automaticZeroContribution == rhs.automaticZeroContribution)||((this.automaticZeroContribution!= null)&&this.automaticZeroContribution.equals(rhs.automaticZeroContribution))))&&((this.nonCustodialParentHomeEquity == rhs.nonCustodialParentHomeEquity)||((this.nonCustodialParentHomeEquity!= null)&&this.nonCustodialParentHomeEquity.equals(rhs.nonCustodialParentHomeEquity))))&&((this.aidYear == rhs.aidYear)||((this.aidYear!= null)&&this.aidYear.equals(rhs.aidYear))))&&((this.studentAidReportResolution == rhs.studentAidReportResolution)||((this.studentAidReportResolution!= null)&&this.studentAidReportResolution.equals(rhs.studentAidReportResolution))))&&((this.expectedTotalParentContribution == rhs.expectedTotalParentContribution)||((this.expectedTotalParentContribution!= null)&&this.expectedTotalParentContribution.equals(rhs.expectedTotalParentContribution))))&&((this.expectedFamilyContribution == rhs.expectedFamilyContribution)||((this.expectedFamilyContribution!= null)&&this.expectedFamilyContribution.equals(rhs.expectedFamilyContribution))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.verificationCategory == rhs.verificationCategory)||((this.verificationCategory!= null)&&this.verificationCategory.equals(rhs.verificationCategory))))&&((this.dependencyOverride == rhs.dependencyOverride)||((this.dependencyOverride!= null)&&this.dependencyOverride.equals(rhs.dependencyOverride))))&&((this.expectedStudentContribution == rhs.expectedStudentContribution)||((this.expectedStudentContribution!= null)&&this.expectedStudentContribution.equals(rhs.expectedStudentContribution))))&&((this.dependency == rhs.dependency)||((this.dependency!= null)&&this.dependency.equals(rhs.dependency))))&&((this.verificationStatus == rhs.verificationStatus)||((this.verificationStatus!= null)&&this.verificationStatus.equals(rhs.verificationStatus))))&&((this.custodialParentHomeEquity == rhs.custodialParentHomeEquity)||((this.custodialParentHomeEquity!= null)&&this.custodialParentHomeEquity.equals(rhs.custodialParentHomeEquity))))&&((this.expectedNoncustodialParentContribution == rhs.expectedNoncustodialParentContribution)||((this.expectedNoncustodialParentContribution!= null)&&this.expectedNoncustodialParentContribution.equals(rhs.expectedNoncustodialParentContribution))))&&((this.applicant == rhs.applicant)||((this.applicant!= null)&&this.applicant.equals(rhs.applicant))))&&((this.totalIncome == rhs.totalIncome)||((this.totalIncome!= null)&&this.totalIncome.equals(rhs.totalIncome))))&&((this.professionalJudgement == rhs.professionalJudgement)||((this.professionalJudgement!= null)&&this.professionalJudgement.equals(rhs.professionalJudgement))))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.applicantHomeEquity == rhs.applicantHomeEquity)||((this.applicantHomeEquity!= null)&&this.applicantHomeEquity.equals(rhs.applicantHomeEquity))))&&((this.simplifiedNeedsTest == rhs.simplifiedNeedsTest)||((this.simplifiedNeedsTest!= null)&&this.simplifiedNeedsTest.equals(rhs.simplifiedNeedsTest))))&&((this.pellEligibility == rhs.pellEligibility)||((this.pellEligibility!= null)&&this.pellEligibility.equals(rhs.pellEligibility))))&&((this.methodology == rhs.methodology)||((this.methodology!= null)&&this.methodology.equals(rhs.methodology))));
    }


    /**
     * Methodology
     * <p>
     * The methodology used to analyze the application.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Methodology {

        INSTITUTIONAL("institutional"),
        FEDERAL("federal"),
        INSTITUTIONAL_FEDERAL("institutionalFederal");
        private final String value;
        private final static Map<String, FinancialAidApplicationOutcomes.Methodology> CONSTANTS = new HashMap<String, FinancialAidApplicationOutcomes.Methodology>();

        static {
            for (FinancialAidApplicationOutcomes.Methodology c: values()) {
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
        public static FinancialAidApplicationOutcomes.Methodology fromValue(String value) {
            FinancialAidApplicationOutcomes.Methodology constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
