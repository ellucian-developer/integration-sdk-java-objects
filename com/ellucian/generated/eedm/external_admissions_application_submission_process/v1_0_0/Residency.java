
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Residency
 * <p>
 * The applicant's residency.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "residencyStatus",
    "eligibleForAB540Waiver",
    "homelessYouth",
    "seasonalAgriculturalWorker",
    "fosterYouthStatus",
    "fosterYouthMis",
    "finAidRef"
})
@Generated("jsonschema2pojo")
public class Residency {

    /**
     * Residency Status
     * <p>
     * Applicant’s residency status.
     * 
     */
    @JsonProperty("residencyStatus")
    @JsonPropertyDescription("Applicant\u2019s residency status.")
    private String residencyStatus;
    /**
     * Eligible for AB540 Waiver
     * <p>
     * Applicant’s eligibility for admission as calculated by the Submission Calculation Service
     * 
     */
    @JsonProperty("eligibleForAB540Waiver")
    @JsonPropertyDescription("Applicant\u2019s eligibility for admission as calculated by the Submission Calculation Service")
    private Boolean eligibleForAB540Waiver;
    /**
     * Homeless Youth
     * <p>
     * Indicates if the applicant has been determined to be a homeless youth at any time within the last 24 months.
     * 
     */
    @JsonProperty("homelessYouth")
    @JsonPropertyDescription("Indicates if the applicant has been determined to be a homeless youth at any time within the last 24 months.")
    private Boolean homelessYouth;
    /**
     * Seasonal Agricultural Worker
     * <p>
     * Indicates if the applicant has been employed as a seasonal agricultural worker for at least a total of two months of each of the past two years.
     * 
     */
    @JsonProperty("seasonalAgriculturalWorker")
    @JsonPropertyDescription("Indicates if the applicant has been employed as a seasonal agricultural worker for at least a total of two months of each of the past two years.")
    private Boolean seasonalAgriculturalWorker;
    /**
     * Foster Youth Status
     * <p>
     * Indicates the Foster Youth status of the applicant based on their screen input.
     * 
     */
    @JsonProperty("fosterYouthStatus")
    @JsonPropertyDescription("Indicates the Foster Youth status of the applicant based on their screen input.")
    private String fosterYouthStatus;
    /**
     * Foster Youth MIS
     * <p>
     * Derived field based on foster fosterYouthStatus.
     * 
     */
    @JsonProperty("fosterYouthMis")
    @JsonPropertyDescription("Derived field based on foster fosterYouthStatus.")
    private Boolean fosterYouthMis;
    /**
     * Financial Aid Referral Flag
     * <p>
     * Indicates if the applicant has shown any interest in or need for financial aid, as determined by the Submission Calculation Service.
     * 
     */
    @JsonProperty("finAidRef")
    @JsonPropertyDescription("Indicates if the applicant has shown any interest in or need for financial aid, as determined by the Submission Calculation Service.")
    private String finAidRef;

    /**
     * Residency Status
     * <p>
     * Applicant’s residency status.
     * 
     */
    @JsonProperty("residencyStatus")
    public String getResidencyStatus() {
        return residencyStatus;
    }

    /**
     * Residency Status
     * <p>
     * Applicant’s residency status.
     * 
     */
    @JsonProperty("residencyStatus")
    public void setResidencyStatus(String residencyStatus) {
        this.residencyStatus = residencyStatus;
    }

    public Residency withResidencyStatus(String residencyStatus) {
        this.residencyStatus = residencyStatus;
        return this;
    }

    /**
     * Eligible for AB540 Waiver
     * <p>
     * Applicant’s eligibility for admission as calculated by the Submission Calculation Service
     * 
     */
    @JsonProperty("eligibleForAB540Waiver")
    public Boolean getEligibleForAB540Waiver() {
        return eligibleForAB540Waiver;
    }

    /**
     * Eligible for AB540 Waiver
     * <p>
     * Applicant’s eligibility for admission as calculated by the Submission Calculation Service
     * 
     */
    @JsonProperty("eligibleForAB540Waiver")
    public void setEligibleForAB540Waiver(Boolean eligibleForAB540Waiver) {
        this.eligibleForAB540Waiver = eligibleForAB540Waiver;
    }

    public Residency withEligibleForAB540Waiver(Boolean eligibleForAB540Waiver) {
        this.eligibleForAB540Waiver = eligibleForAB540Waiver;
        return this;
    }

    /**
     * Homeless Youth
     * <p>
     * Indicates if the applicant has been determined to be a homeless youth at any time within the last 24 months.
     * 
     */
    @JsonProperty("homelessYouth")
    public Boolean getHomelessYouth() {
        return homelessYouth;
    }

    /**
     * Homeless Youth
     * <p>
     * Indicates if the applicant has been determined to be a homeless youth at any time within the last 24 months.
     * 
     */
    @JsonProperty("homelessYouth")
    public void setHomelessYouth(Boolean homelessYouth) {
        this.homelessYouth = homelessYouth;
    }

    public Residency withHomelessYouth(Boolean homelessYouth) {
        this.homelessYouth = homelessYouth;
        return this;
    }

    /**
     * Seasonal Agricultural Worker
     * <p>
     * Indicates if the applicant has been employed as a seasonal agricultural worker for at least a total of two months of each of the past two years.
     * 
     */
    @JsonProperty("seasonalAgriculturalWorker")
    public Boolean getSeasonalAgriculturalWorker() {
        return seasonalAgriculturalWorker;
    }

    /**
     * Seasonal Agricultural Worker
     * <p>
     * Indicates if the applicant has been employed as a seasonal agricultural worker for at least a total of two months of each of the past two years.
     * 
     */
    @JsonProperty("seasonalAgriculturalWorker")
    public void setSeasonalAgriculturalWorker(Boolean seasonalAgriculturalWorker) {
        this.seasonalAgriculturalWorker = seasonalAgriculturalWorker;
    }

    public Residency withSeasonalAgriculturalWorker(Boolean seasonalAgriculturalWorker) {
        this.seasonalAgriculturalWorker = seasonalAgriculturalWorker;
        return this;
    }

    /**
     * Foster Youth Status
     * <p>
     * Indicates the Foster Youth status of the applicant based on their screen input.
     * 
     */
    @JsonProperty("fosterYouthStatus")
    public String getFosterYouthStatus() {
        return fosterYouthStatus;
    }

    /**
     * Foster Youth Status
     * <p>
     * Indicates the Foster Youth status of the applicant based on their screen input.
     * 
     */
    @JsonProperty("fosterYouthStatus")
    public void setFosterYouthStatus(String fosterYouthStatus) {
        this.fosterYouthStatus = fosterYouthStatus;
    }

    public Residency withFosterYouthStatus(String fosterYouthStatus) {
        this.fosterYouthStatus = fosterYouthStatus;
        return this;
    }

    /**
     * Foster Youth MIS
     * <p>
     * Derived field based on foster fosterYouthStatus.
     * 
     */
    @JsonProperty("fosterYouthMis")
    public Boolean getFosterYouthMis() {
        return fosterYouthMis;
    }

    /**
     * Foster Youth MIS
     * <p>
     * Derived field based on foster fosterYouthStatus.
     * 
     */
    @JsonProperty("fosterYouthMis")
    public void setFosterYouthMis(Boolean fosterYouthMis) {
        this.fosterYouthMis = fosterYouthMis;
    }

    public Residency withFosterYouthMis(Boolean fosterYouthMis) {
        this.fosterYouthMis = fosterYouthMis;
        return this;
    }

    /**
     * Financial Aid Referral Flag
     * <p>
     * Indicates if the applicant has shown any interest in or need for financial aid, as determined by the Submission Calculation Service.
     * 
     */
    @JsonProperty("finAidRef")
    public String getFinAidRef() {
        return finAidRef;
    }

    /**
     * Financial Aid Referral Flag
     * <p>
     * Indicates if the applicant has shown any interest in or need for financial aid, as determined by the Submission Calculation Service.
     * 
     */
    @JsonProperty("finAidRef")
    public void setFinAidRef(String finAidRef) {
        this.finAidRef = finAidRef;
    }

    public Residency withFinAidRef(String finAidRef) {
        this.finAidRef = finAidRef;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Residency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("residencyStatus");
        sb.append('=');
        sb.append(((this.residencyStatus == null)?"<null>":this.residencyStatus));
        sb.append(',');
        sb.append("eligibleForAB540Waiver");
        sb.append('=');
        sb.append(((this.eligibleForAB540Waiver == null)?"<null>":this.eligibleForAB540Waiver));
        sb.append(',');
        sb.append("homelessYouth");
        sb.append('=');
        sb.append(((this.homelessYouth == null)?"<null>":this.homelessYouth));
        sb.append(',');
        sb.append("seasonalAgriculturalWorker");
        sb.append('=');
        sb.append(((this.seasonalAgriculturalWorker == null)?"<null>":this.seasonalAgriculturalWorker));
        sb.append(',');
        sb.append("fosterYouthStatus");
        sb.append('=');
        sb.append(((this.fosterYouthStatus == null)?"<null>":this.fosterYouthStatus));
        sb.append(',');
        sb.append("fosterYouthMis");
        sb.append('=');
        sb.append(((this.fosterYouthMis == null)?"<null>":this.fosterYouthMis));
        sb.append(',');
        sb.append("finAidRef");
        sb.append('=');
        sb.append(((this.finAidRef == null)?"<null>":this.finAidRef));
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
        result = ((result* 31)+((this.eligibleForAB540Waiver == null)? 0 :this.eligibleForAB540Waiver.hashCode()));
        result = ((result* 31)+((this.seasonalAgriculturalWorker == null)? 0 :this.seasonalAgriculturalWorker.hashCode()));
        result = ((result* 31)+((this.fosterYouthStatus == null)? 0 :this.fosterYouthStatus.hashCode()));
        result = ((result* 31)+((this.residencyStatus == null)? 0 :this.residencyStatus.hashCode()));
        result = ((result* 31)+((this.finAidRef == null)? 0 :this.finAidRef.hashCode()));
        result = ((result* 31)+((this.fosterYouthMis == null)? 0 :this.fosterYouthMis.hashCode()));
        result = ((result* 31)+((this.homelessYouth == null)? 0 :this.homelessYouth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Residency) == false) {
            return false;
        }
        Residency rhs = ((Residency) other);
        return ((((((((this.eligibleForAB540Waiver == rhs.eligibleForAB540Waiver)||((this.eligibleForAB540Waiver!= null)&&this.eligibleForAB540Waiver.equals(rhs.eligibleForAB540Waiver)))&&((this.seasonalAgriculturalWorker == rhs.seasonalAgriculturalWorker)||((this.seasonalAgriculturalWorker!= null)&&this.seasonalAgriculturalWorker.equals(rhs.seasonalAgriculturalWorker))))&&((this.fosterYouthStatus == rhs.fosterYouthStatus)||((this.fosterYouthStatus!= null)&&this.fosterYouthStatus.equals(rhs.fosterYouthStatus))))&&((this.residencyStatus == rhs.residencyStatus)||((this.residencyStatus!= null)&&this.residencyStatus.equals(rhs.residencyStatus))))&&((this.finAidRef == rhs.finAidRef)||((this.finAidRef!= null)&&this.finAidRef.equals(rhs.finAidRef))))&&((this.fosterYouthMis == rhs.fosterYouthMis)||((this.fosterYouthMis!= null)&&this.fosterYouthMis.equals(rhs.fosterYouthMis))))&&((this.homelessYouth == rhs.homelessYouth)||((this.homelessYouth!= null)&&this.homelessYouth.equals(rhs.homelessYouth))));
    }

}
