
package com.ellucian.generated.bpapi.ban.tax_id_search.v1_0_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "lastName",
    "irsReportDate",
    "studNotifDate",
    "taxYear",
    "irsReportStatus",
    "studNotifStatus",
    "ssn"
})
@Generated("jsonschema2pojo")
public class TaxIdSearch100GetResponse {

    /**
     * First Name
     * <p>
     * Lineage reference object : TTBTAXN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_FIRST_NAME")
    private String firstName;
    /**
     * Last Name
     * <p>
     * Lineage reference object : TTBTAXN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_LAST_NAME")
    private String lastName;
    /**
     * Report Date
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_DATE
     * 
     */
    @JsonProperty("irsReportDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_IRS_REPORT_DATE")
    private Date irsReportDate;
    /**
     * Notification Date
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_DATE
     * 
     */
    @JsonProperty("studNotifDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_STUD_NOTIF_DATE")
    private Date studNotifDate;
    /**
     * Tax Year
     * <p>
     * Lineage reference object : TTBTAXN_TAX_YEAR
     * 
     */
    @JsonProperty("taxYear")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_TAX_YEAR")
    private Double taxYear;
    /**
     * IRS Report Status
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_STATUS
     * 
     */
    @JsonProperty("irsReportStatus")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_IRS_REPORT_STATUS")
    private String irsReportStatus;
    /**
     * Student Notification Status
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS
     * 
     */
    @JsonProperty("studNotifStatus")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS")
    private String studNotifStatus;
    /**
     * SSN
     * <p>
     * Lineage reference object : TTBTAXN_SSN
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_SSN")
    private String ssn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * First Name
     * <p>
     * Lineage reference object : TTBTAXN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : TTBTAXN_FIRST_NAME
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public TaxIdSearch100GetResponse withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : TTBTAXN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : TTBTAXN_LAST_NAME
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public TaxIdSearch100GetResponse withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Report Date
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_DATE
     * 
     */
    @JsonProperty("irsReportDate")
    public Date getIrsReportDate() {
        return irsReportDate;
    }

    /**
     * Report Date
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_DATE
     * 
     */
    @JsonProperty("irsReportDate")
    public void setIrsReportDate(Date irsReportDate) {
        this.irsReportDate = irsReportDate;
    }

    public TaxIdSearch100GetResponse withIrsReportDate(Date irsReportDate) {
        this.irsReportDate = irsReportDate;
        return this;
    }

    /**
     * Notification Date
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_DATE
     * 
     */
    @JsonProperty("studNotifDate")
    public Date getStudNotifDate() {
        return studNotifDate;
    }

    /**
     * Notification Date
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_DATE
     * 
     */
    @JsonProperty("studNotifDate")
    public void setStudNotifDate(Date studNotifDate) {
        this.studNotifDate = studNotifDate;
    }

    public TaxIdSearch100GetResponse withStudNotifDate(Date studNotifDate) {
        this.studNotifDate = studNotifDate;
        return this;
    }

    /**
     * Tax Year
     * <p>
     * Lineage reference object : TTBTAXN_TAX_YEAR
     * 
     */
    @JsonProperty("taxYear")
    public Double getTaxYear() {
        return taxYear;
    }

    /**
     * Tax Year
     * <p>
     * Lineage reference object : TTBTAXN_TAX_YEAR
     * 
     */
    @JsonProperty("taxYear")
    public void setTaxYear(Double taxYear) {
        this.taxYear = taxYear;
    }

    public TaxIdSearch100GetResponse withTaxYear(Double taxYear) {
        this.taxYear = taxYear;
        return this;
    }

    /**
     * IRS Report Status
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_STATUS
     * 
     */
    @JsonProperty("irsReportStatus")
    public String getIrsReportStatus() {
        return irsReportStatus;
    }

    /**
     * IRS Report Status
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_STATUS
     * 
     */
    @JsonProperty("irsReportStatus")
    public void setIrsReportStatus(String irsReportStatus) {
        this.irsReportStatus = irsReportStatus;
    }

    public TaxIdSearch100GetResponse withIrsReportStatus(String irsReportStatus) {
        this.irsReportStatus = irsReportStatus;
        return this;
    }

    /**
     * Student Notification Status
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS
     * 
     */
    @JsonProperty("studNotifStatus")
    public String getStudNotifStatus() {
        return studNotifStatus;
    }

    /**
     * Student Notification Status
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS
     * 
     */
    @JsonProperty("studNotifStatus")
    public void setStudNotifStatus(String studNotifStatus) {
        this.studNotifStatus = studNotifStatus;
    }

    public TaxIdSearch100GetResponse withStudNotifStatus(String studNotifStatus) {
        this.studNotifStatus = studNotifStatus;
        return this;
    }

    /**
     * SSN
     * <p>
     * Lineage reference object : TTBTAXN_SSN
     * 
     */
    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    /**
     * SSN
     * <p>
     * Lineage reference object : TTBTAXN_SSN
     * 
     */
    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public TaxIdSearch100GetResponse withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TaxIdSearch100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaxIdSearch100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("irsReportDate");
        sb.append('=');
        sb.append(((this.irsReportDate == null)?"<null>":this.irsReportDate));
        sb.append(',');
        sb.append("studNotifDate");
        sb.append('=');
        sb.append(((this.studNotifDate == null)?"<null>":this.studNotifDate));
        sb.append(',');
        sb.append("taxYear");
        sb.append('=');
        sb.append(((this.taxYear == null)?"<null>":this.taxYear));
        sb.append(',');
        sb.append("irsReportStatus");
        sb.append('=');
        sb.append(((this.irsReportStatus == null)?"<null>":this.irsReportStatus));
        sb.append(',');
        sb.append("studNotifStatus");
        sb.append('=');
        sb.append(((this.studNotifStatus == null)?"<null>":this.studNotifStatus));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.irsReportDate == null)? 0 :this.irsReportDate.hashCode()));
        result = ((result* 31)+((this.studNotifDate == null)? 0 :this.studNotifDate.hashCode()));
        result = ((result* 31)+((this.taxYear == null)? 0 :this.taxYear.hashCode()));
        result = ((result* 31)+((this.irsReportStatus == null)? 0 :this.irsReportStatus.hashCode()));
        result = ((result* 31)+((this.studNotifStatus == null)? 0 :this.studNotifStatus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxIdSearch100GetResponse) == false) {
            return false;
        }
        TaxIdSearch100GetResponse rhs = ((TaxIdSearch100GetResponse) other);
        return ((((((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.irsReportDate == rhs.irsReportDate)||((this.irsReportDate!= null)&&this.irsReportDate.equals(rhs.irsReportDate))))&&((this.studNotifDate == rhs.studNotifDate)||((this.studNotifDate!= null)&&this.studNotifDate.equals(rhs.studNotifDate))))&&((this.taxYear == rhs.taxYear)||((this.taxYear!= null)&&this.taxYear.equals(rhs.taxYear))))&&((this.irsReportStatus == rhs.irsReportStatus)||((this.irsReportStatus!= null)&&this.irsReportStatus.equals(rhs.irsReportStatus))))&&((this.studNotifStatus == rhs.studNotifStatus)||((this.studNotifStatus!= null)&&this.studNotifStatus.equals(rhs.studNotifStatus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))));
    }

}
