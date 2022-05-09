
package com.ellucian.generated.eedm.external_admissions_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Military
 * <p>
 * Military service information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "militaryStatus",
    "serviceStartDate",
    "dateOfDischarge",
    "homeState",
    "veteranStatus",
    "veteranFileNumber"
})
@Generated("jsonschema2pojo")
public class Military {

    /**
     * Military Status
     * <p>
     * The applicant’s Military Status.
     * 
     */
    @JsonProperty("militaryStatus")
    @JsonPropertyDescription("The applicant\u2019s Military Status.")
    private String militaryStatus;
    /**
     * Service Start Date
     * <p>
     * The date the applicant's military service began.
     * 
     */
    @JsonProperty("serviceStartDate")
    @JsonPropertyDescription("The date the applicant's military service began.")
    private Object serviceStartDate;
    /**
     * Date Of Discharge
     * <p>
     * The date the applicant was discharged from the military.
     * 
     */
    @JsonProperty("dateOfDischarge")
    @JsonPropertyDescription("The date the applicant was discharged from the military.")
    private Object dateOfDischarge;
    /**
     * Home State
     * <p>
     * The applicant’s Home of Record
     * 
     */
    @JsonProperty("homeState")
    @JsonPropertyDescription("The applicant\u2019s Home of Record")
    private String homeState;
    /**
     * Veteran Status
     * <p>
     * The applicant's veteran status.
     * 
     */
    @JsonProperty("veteranStatus")
    @JsonPropertyDescription("The applicant's veteran status.")
    private String veteranStatus;
    /**
     * Veteran File Number
     * <p>
     * The applicant's veteran file number.
     * 
     */
    @JsonProperty("veteranFileNumber")
    @JsonPropertyDescription("The applicant's veteran file number.")
    private String veteranFileNumber;

    /**
     * Military Status
     * <p>
     * The applicant’s Military Status.
     * 
     */
    @JsonProperty("militaryStatus")
    public String getMilitaryStatus() {
        return militaryStatus;
    }

    /**
     * Military Status
     * <p>
     * The applicant’s Military Status.
     * 
     */
    @JsonProperty("militaryStatus")
    public void setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    public Military withMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
        return this;
    }

    /**
     * Service Start Date
     * <p>
     * The date the applicant's military service began.
     * 
     */
    @JsonProperty("serviceStartDate")
    public Object getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * Service Start Date
     * <p>
     * The date the applicant's military service began.
     * 
     */
    @JsonProperty("serviceStartDate")
    public void setServiceStartDate(Object serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public Military withServiceStartDate(Object serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
        return this;
    }

    /**
     * Date Of Discharge
     * <p>
     * The date the applicant was discharged from the military.
     * 
     */
    @JsonProperty("dateOfDischarge")
    public Object getDateOfDischarge() {
        return dateOfDischarge;
    }

    /**
     * Date Of Discharge
     * <p>
     * The date the applicant was discharged from the military.
     * 
     */
    @JsonProperty("dateOfDischarge")
    public void setDateOfDischarge(Object dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    public Military withDateOfDischarge(Object dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
        return this;
    }

    /**
     * Home State
     * <p>
     * The applicant’s Home of Record
     * 
     */
    @JsonProperty("homeState")
    public String getHomeState() {
        return homeState;
    }

    /**
     * Home State
     * <p>
     * The applicant’s Home of Record
     * 
     */
    @JsonProperty("homeState")
    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    public Military withHomeState(String homeState) {
        this.homeState = homeState;
        return this;
    }

    /**
     * Veteran Status
     * <p>
     * The applicant's veteran status.
     * 
     */
    @JsonProperty("veteranStatus")
    public String getVeteranStatus() {
        return veteranStatus;
    }

    /**
     * Veteran Status
     * <p>
     * The applicant's veteran status.
     * 
     */
    @JsonProperty("veteranStatus")
    public void setVeteranStatus(String veteranStatus) {
        this.veteranStatus = veteranStatus;
    }

    public Military withVeteranStatus(String veteranStatus) {
        this.veteranStatus = veteranStatus;
        return this;
    }

    /**
     * Veteran File Number
     * <p>
     * The applicant's veteran file number.
     * 
     */
    @JsonProperty("veteranFileNumber")
    public String getVeteranFileNumber() {
        return veteranFileNumber;
    }

    /**
     * Veteran File Number
     * <p>
     * The applicant's veteran file number.
     * 
     */
    @JsonProperty("veteranFileNumber")
    public void setVeteranFileNumber(String veteranFileNumber) {
        this.veteranFileNumber = veteranFileNumber;
    }

    public Military withVeteranFileNumber(String veteranFileNumber) {
        this.veteranFileNumber = veteranFileNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Military.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("militaryStatus");
        sb.append('=');
        sb.append(((this.militaryStatus == null)?"<null>":this.militaryStatus));
        sb.append(',');
        sb.append("serviceStartDate");
        sb.append('=');
        sb.append(((this.serviceStartDate == null)?"<null>":this.serviceStartDate));
        sb.append(',');
        sb.append("dateOfDischarge");
        sb.append('=');
        sb.append(((this.dateOfDischarge == null)?"<null>":this.dateOfDischarge));
        sb.append(',');
        sb.append("homeState");
        sb.append('=');
        sb.append(((this.homeState == null)?"<null>":this.homeState));
        sb.append(',');
        sb.append("veteranStatus");
        sb.append('=');
        sb.append(((this.veteranStatus == null)?"<null>":this.veteranStatus));
        sb.append(',');
        sb.append("veteranFileNumber");
        sb.append('=');
        sb.append(((this.veteranFileNumber == null)?"<null>":this.veteranFileNumber));
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
        result = ((result* 31)+((this.veteranStatus == null)? 0 :this.veteranStatus.hashCode()));
        result = ((result* 31)+((this.serviceStartDate == null)? 0 :this.serviceStartDate.hashCode()));
        result = ((result* 31)+((this.militaryStatus == null)? 0 :this.militaryStatus.hashCode()));
        result = ((result* 31)+((this.homeState == null)? 0 :this.homeState.hashCode()));
        result = ((result* 31)+((this.dateOfDischarge == null)? 0 :this.dateOfDischarge.hashCode()));
        result = ((result* 31)+((this.veteranFileNumber == null)? 0 :this.veteranFileNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Military) == false) {
            return false;
        }
        Military rhs = ((Military) other);
        return (((((((this.veteranStatus == rhs.veteranStatus)||((this.veteranStatus!= null)&&this.veteranStatus.equals(rhs.veteranStatus)))&&((this.serviceStartDate == rhs.serviceStartDate)||((this.serviceStartDate!= null)&&this.serviceStartDate.equals(rhs.serviceStartDate))))&&((this.militaryStatus == rhs.militaryStatus)||((this.militaryStatus!= null)&&this.militaryStatus.equals(rhs.militaryStatus))))&&((this.homeState == rhs.homeState)||((this.homeState!= null)&&this.homeState.equals(rhs.homeState))))&&((this.dateOfDischarge == rhs.dateOfDischarge)||((this.dateOfDischarge!= null)&&this.dateOfDischarge.equals(rhs.dateOfDischarge))))&&((this.veteranFileNumber == rhs.veteranFileNumber)||((this.veteranFileNumber!= null)&&this.veteranFileNumber.equals(rhs.veteranFileNumber))));
    }

}
