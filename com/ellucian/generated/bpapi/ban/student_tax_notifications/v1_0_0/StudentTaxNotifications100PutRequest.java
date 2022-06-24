
package com.ellucian.generated.bpapi.ban.student_tax_notifications.v1_0_0;

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
    "futureInd",
    "criteria.userId",
    "irsReportStatus",
    "ssn",
    "taxYear",
    "criteria.irsReportStatus",
    "criteria.mi",
    "mi",
    "zip",
    "criteria.lastName",
    "criteria.zip",
    "criteria.natnDesc",
    "criteria.ssnCertInd",
    "criteria.futureInd",
    "firstName",
    "criteria.gradStudInd",
    "gradStudInd",
    "criteria.amount4",
    "criteria.amount3",
    "ssnCertInd",
    "criteria.amount6",
    "criteria.amount5",
    "criteria.amount2",
    "criteria.amount1",
    "lastName",
    "criteria.activityDate",
    "city",
    "criteria.firstName",
    "criteria.studNotifStatus",
    "removeNotifInd",
    "criteria.irsReportDate",
    "criteria.removeNotifDate",
    "criteria.natnCode",
    "keyblckStudentId",
    "criteria.city",
    "studNotifStatus",
    "criteria.ssn",
    "statCode",
    "criteria.addrLine3",
    "natnCode",
    "criteria.addrLine2",
    "criteria.addrLine1",
    "halfTimeEnrlInd",
    "criteria.studNotifDate",
    "criteria.removeNotifInd",
    "criteria.methodChanged",
    "criteria.statCode",
    "addrLine3",
    "addrLine2",
    "addrLine1",
    "criteria.halfTimeEnrlInd"
})
@Generated("jsonschema2pojo")
public class StudentTaxNotifications100PutRequest {

    /**
     * Includes January-March
     * <p>
     * Lineage reference object : TTBTAXN_FUTURE_IND
     * 
     */
    @JsonProperty("futureInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_FUTURE_IND")
    private String futureInd;
    /**
     * User ID
     * <p>
     * Lineage reference object : TTBTAXN_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_USER_ID")
    private String criteriaUserId;
    /**
     * IRS Report
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_STATUS
     * 
     */
    @JsonProperty("irsReportStatus")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_IRS_REPORT_STATUS")
    private String irsReportStatus;
    /**
     * SSN
     * <p>
     * Lineage reference object : TTBTAXN_SSN
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_SSN")
    private String ssn;
    /**
     * Tax Year
     * <p>
     * Lineage reference object : taxYear
     * 
     */
    @JsonProperty("taxYear")
    @JsonPropertyDescription("Lineage reference object : taxYear")
    private Double taxYear;
    /**
     * IRS Report
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_STATUS
     * 
     */
    @JsonProperty("criteria.irsReportStatus")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_IRS_REPORT_STATUS")
    private String criteriaIrsReportStatus;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : TTBTAXN_MI
     * (Required)
     * 
     */
    @JsonProperty("criteria.mi")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_MI")
    private String criteriaMi;
    /**
     * Middle Name
     * <p>
     * Lineage reference object : TTBTAXN_MI
     * (Required)
     * 
     */
    @JsonProperty("mi")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_MI")
    private String mi;
    /**
     * Zip/Postal Code
     * <p>
     * Lineage reference object : TTBTAXN_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ZIP")
    private String zip;
    /**
     * Last Name
     * <p>
     * Lineage reference object : TTBTAXN_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.lastName")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_LAST_NAME")
    private String criteriaLastName;
    /**
     * Zip/Postal Code
     * <p>
     * Lineage reference object : TTBTAXN_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ZIP")
    private String criteriaZip;
    @JsonProperty("criteria.natnDesc")
    private String criteriaNatnDesc;
    /**
     * SSN Certification
     * <p>
     * Lineage reference object : TTBTAXN_SSN_CERT_IND
     * 
     */
    @JsonProperty("criteria.ssnCertInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_SSN_CERT_IND")
    private String criteriaSsnCertInd;
    /**
     * Includes January-March
     * <p>
     * Lineage reference object : TTBTAXN_FUTURE_IND
     * 
     */
    @JsonProperty("criteria.futureInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_FUTURE_IND")
    private String criteriaFutureInd;
    /**
     * First Name
     * <p>
     * Lineage reference object : TTBTAXN_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_FIRST_NAME")
    private String firstName;
    /**
     * Graduate Student
     * <p>
     * Lineage reference object : TTBTAXN_GRAD_STUD_IND
     * 
     */
    @JsonProperty("criteria.gradStudInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_GRAD_STUD_IND")
    private String criteriaGradStudInd;
    /**
     * Graduate Student
     * <p>
     * Lineage reference object : TTBTAXN_GRAD_STUD_IND
     * 
     */
    @JsonProperty("gradStudInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_GRAD_STUD_IND")
    private String gradStudInd;
    /**
     * Box 5
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_4
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount4")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_4")
    private Double criteriaAmount4;
    /**
     * Box 4
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_3
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount3")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_3")
    private Double criteriaAmount3;
    /**
     * SSN Certification
     * <p>
     * Lineage reference object : TTBTAXN_SSN_CERT_IND
     * 
     */
    @JsonProperty("ssnCertInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_SSN_CERT_IND")
    private String ssnCertInd;
    /**
     * Box 4
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_6
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount6")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_6")
    private Double criteriaAmount6;
    /**
     * Box 6
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_5
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount5")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_5")
    private Double criteriaAmount5;
    /**
     * Box 2
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_2
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount2")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_2")
    private Double criteriaAmount2;
    /**
     * Box 1
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_1
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount1")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_1")
    private Double criteriaAmount1;
    /**
     * Last Name
     * <p>
     * Lineage reference object : TTBTAXN_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_LAST_NAME")
    private String lastName;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTBTAXN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * City
     * <p>
     * Lineage reference object : TTBTAXN_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_CITY")
    private String city;
    /**
     * First Name
     * <p>
     * Lineage reference object : TTBTAXN_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.firstName")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_FIRST_NAME")
    private String criteriaFirstName;
    /**
     * Student Notification
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS
     * 
     */
    @JsonProperty("criteria.studNotifStatus")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS")
    private String criteriaStudNotifStatus;
    /**
     * Remove Notification
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_IND
     * 
     */
    @JsonProperty("removeNotifInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_REMOVE_NOTIF_IND")
    private String removeNotifInd;
    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_DATE
     * 
     */
    @JsonProperty("criteria.irsReportDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_IRS_REPORT_DATE")
    private Date criteriaIrsReportDate;
    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_DATE
     * 
     */
    @JsonProperty("criteria.removeNotifDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_REMOVE_NOTIF_DATE")
    private Date criteriaRemoveNotifDate;
    /**
     * Nation
     * <p>
     * Lineage reference object : TTBTAXN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String criteriaNatnCode;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    @JsonPropertyDescription("Lineage reference object : keyblckStudentId")
    private String keyblckStudentId;
    /**
     * City
     * <p>
     * Lineage reference object : TTBTAXN_CITY
     * 
     */
    @JsonProperty("criteria.city")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_CITY")
    private String criteriaCity;
    /**
     * Student Notification
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
    @JsonProperty("criteria.ssn")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_SSN")
    private String criteriaSsn;
    /**
     * State/Province
     * <p>
     * Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Address Line 3
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE3
     * 
     */
    @JsonProperty("criteria.addrLine3")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ADDR_LINE3")
    private String criteriaAddrLine3;
    /**
     * Nation
     * <p>
     * Lineage reference object : TTBTAXN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Address Line 2
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE2
     * 
     */
    @JsonProperty("criteria.addrLine2")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ADDR_LINE2")
    private String criteriaAddrLine2;
    /**
     * Address Line 1
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE1
     * 
     */
    @JsonProperty("criteria.addrLine1")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ADDR_LINE1")
    private String criteriaAddrLine1;
    /**
     * Half Time Enrollment
     * <p>
     * Lineage reference object : TTBTAXN_HALF_TIME_ENRL_IND
     * 
     */
    @JsonProperty("halfTimeEnrlInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_HALF_TIME_ENRL_IND")
    private String halfTimeEnrlInd;
    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_DATE
     * 
     */
    @JsonProperty("criteria.studNotifDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_STUD_NOTIF_DATE")
    private Date criteriaStudNotifDate;
    /**
     * Remove Notification
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_IND
     * 
     */
    @JsonProperty("criteria.removeNotifInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_REMOVE_NOTIF_IND")
    private String criteriaRemoveNotifInd;
    /**
     * Method Changed
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.methodChanged")
    private String criteriaMethodChanged;
    /**
     * State/Province
     * <p>
     * Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat")
    private String criteriaStatCode;
    /**
     * Address Line 3
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE3
     * 
     */
    @JsonProperty("addrLine3")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ADDR_LINE3")
    private String addrLine3;
    /**
     * Address Line 2
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE2
     * 
     */
    @JsonProperty("addrLine2")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ADDR_LINE2")
    private String addrLine2;
    /**
     * Address Line 1
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE1
     * 
     */
    @JsonProperty("addrLine1")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ADDR_LINE1")
    private String addrLine1;
    /**
     * Half Time Enrollment
     * <p>
     * Lineage reference object : TTBTAXN_HALF_TIME_ENRL_IND
     * 
     */
    @JsonProperty("criteria.halfTimeEnrlInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_HALF_TIME_ENRL_IND")
    private String criteriaHalfTimeEnrlInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Includes January-March
     * <p>
     * Lineage reference object : TTBTAXN_FUTURE_IND
     * 
     */
    @JsonProperty("futureInd")
    public String getFutureInd() {
        return futureInd;
    }

    /**
     * Includes January-March
     * <p>
     * Lineage reference object : TTBTAXN_FUTURE_IND
     * 
     */
    @JsonProperty("futureInd")
    public void setFutureInd(String futureInd) {
        this.futureInd = futureInd;
    }

    public StudentTaxNotifications100PutRequest withFutureInd(String futureInd) {
        this.futureInd = futureInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TTBTAXN_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TTBTAXN_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public StudentTaxNotifications100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * IRS Report
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_STATUS
     * 
     */
    @JsonProperty("irsReportStatus")
    public String getIrsReportStatus() {
        return irsReportStatus;
    }

    /**
     * IRS Report
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_STATUS
     * 
     */
    @JsonProperty("irsReportStatus")
    public void setIrsReportStatus(String irsReportStatus) {
        this.irsReportStatus = irsReportStatus;
    }

    public StudentTaxNotifications100PutRequest withIrsReportStatus(String irsReportStatus) {
        this.irsReportStatus = irsReportStatus;
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

    public StudentTaxNotifications100PutRequest withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    /**
     * Tax Year
     * <p>
     * Lineage reference object : taxYear
     * 
     */
    @JsonProperty("taxYear")
    public Double getTaxYear() {
        return taxYear;
    }

    /**
     * Tax Year
     * <p>
     * Lineage reference object : taxYear
     * 
     */
    @JsonProperty("taxYear")
    public void setTaxYear(Double taxYear) {
        this.taxYear = taxYear;
    }

    public StudentTaxNotifications100PutRequest withTaxYear(Double taxYear) {
        this.taxYear = taxYear;
        return this;
    }

    /**
     * IRS Report
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_STATUS
     * 
     */
    @JsonProperty("criteria.irsReportStatus")
    public String getCriteriaIrsReportStatus() {
        return criteriaIrsReportStatus;
    }

    /**
     * IRS Report
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_STATUS
     * 
     */
    @JsonProperty("criteria.irsReportStatus")
    public void setCriteriaIrsReportStatus(String criteriaIrsReportStatus) {
        this.criteriaIrsReportStatus = criteriaIrsReportStatus;
    }

    public StudentTaxNotifications100PutRequest withCriteriaIrsReportStatus(String criteriaIrsReportStatus) {
        this.criteriaIrsReportStatus = criteriaIrsReportStatus;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : TTBTAXN_MI
     * (Required)
     * 
     */
    @JsonProperty("criteria.mi")
    public String getCriteriaMi() {
        return criteriaMi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : TTBTAXN_MI
     * (Required)
     * 
     */
    @JsonProperty("criteria.mi")
    public void setCriteriaMi(String criteriaMi) {
        this.criteriaMi = criteriaMi;
    }

    public StudentTaxNotifications100PutRequest withCriteriaMi(String criteriaMi) {
        this.criteriaMi = criteriaMi;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : TTBTAXN_MI
     * (Required)
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Name
     * <p>
     * Lineage reference object : TTBTAXN_MI
     * (Required)
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public StudentTaxNotifications100PutRequest withMi(String mi) {
        this.mi = mi;
        return this;
    }

    /**
     * Zip/Postal Code
     * <p>
     * Lineage reference object : TTBTAXN_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * Zip/Postal Code
     * <p>
     * Lineage reference object : TTBTAXN_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public StudentTaxNotifications100PutRequest withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : TTBTAXN_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.lastName")
    public String getCriteriaLastName() {
        return criteriaLastName;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : TTBTAXN_LAST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.lastName")
    public void setCriteriaLastName(String criteriaLastName) {
        this.criteriaLastName = criteriaLastName;
    }

    public StudentTaxNotifications100PutRequest withCriteriaLastName(String criteriaLastName) {
        this.criteriaLastName = criteriaLastName;
        return this;
    }

    /**
     * Zip/Postal Code
     * <p>
     * Lineage reference object : TTBTAXN_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    public String getCriteriaZip() {
        return criteriaZip;
    }

    /**
     * Zip/Postal Code
     * <p>
     * Lineage reference object : TTBTAXN_ZIP
     * 
     */
    @JsonProperty("criteria.zip")
    public void setCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
    }

    public StudentTaxNotifications100PutRequest withCriteriaZip(String criteriaZip) {
        this.criteriaZip = criteriaZip;
        return this;
    }

    @JsonProperty("criteria.natnDesc")
    public String getCriteriaNatnDesc() {
        return criteriaNatnDesc;
    }

    @JsonProperty("criteria.natnDesc")
    public void setCriteriaNatnDesc(String criteriaNatnDesc) {
        this.criteriaNatnDesc = criteriaNatnDesc;
    }

    public StudentTaxNotifications100PutRequest withCriteriaNatnDesc(String criteriaNatnDesc) {
        this.criteriaNatnDesc = criteriaNatnDesc;
        return this;
    }

    /**
     * SSN Certification
     * <p>
     * Lineage reference object : TTBTAXN_SSN_CERT_IND
     * 
     */
    @JsonProperty("criteria.ssnCertInd")
    public String getCriteriaSsnCertInd() {
        return criteriaSsnCertInd;
    }

    /**
     * SSN Certification
     * <p>
     * Lineage reference object : TTBTAXN_SSN_CERT_IND
     * 
     */
    @JsonProperty("criteria.ssnCertInd")
    public void setCriteriaSsnCertInd(String criteriaSsnCertInd) {
        this.criteriaSsnCertInd = criteriaSsnCertInd;
    }

    public StudentTaxNotifications100PutRequest withCriteriaSsnCertInd(String criteriaSsnCertInd) {
        this.criteriaSsnCertInd = criteriaSsnCertInd;
        return this;
    }

    /**
     * Includes January-March
     * <p>
     * Lineage reference object : TTBTAXN_FUTURE_IND
     * 
     */
    @JsonProperty("criteria.futureInd")
    public String getCriteriaFutureInd() {
        return criteriaFutureInd;
    }

    /**
     * Includes January-March
     * <p>
     * Lineage reference object : TTBTAXN_FUTURE_IND
     * 
     */
    @JsonProperty("criteria.futureInd")
    public void setCriteriaFutureInd(String criteriaFutureInd) {
        this.criteriaFutureInd = criteriaFutureInd;
    }

    public StudentTaxNotifications100PutRequest withCriteriaFutureInd(String criteriaFutureInd) {
        this.criteriaFutureInd = criteriaFutureInd;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : TTBTAXN_FIRST_NAME
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public StudentTaxNotifications100PutRequest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Graduate Student
     * <p>
     * Lineage reference object : TTBTAXN_GRAD_STUD_IND
     * 
     */
    @JsonProperty("criteria.gradStudInd")
    public String getCriteriaGradStudInd() {
        return criteriaGradStudInd;
    }

    /**
     * Graduate Student
     * <p>
     * Lineage reference object : TTBTAXN_GRAD_STUD_IND
     * 
     */
    @JsonProperty("criteria.gradStudInd")
    public void setCriteriaGradStudInd(String criteriaGradStudInd) {
        this.criteriaGradStudInd = criteriaGradStudInd;
    }

    public StudentTaxNotifications100PutRequest withCriteriaGradStudInd(String criteriaGradStudInd) {
        this.criteriaGradStudInd = criteriaGradStudInd;
        return this;
    }

    /**
     * Graduate Student
     * <p>
     * Lineage reference object : TTBTAXN_GRAD_STUD_IND
     * 
     */
    @JsonProperty("gradStudInd")
    public String getGradStudInd() {
        return gradStudInd;
    }

    /**
     * Graduate Student
     * <p>
     * Lineage reference object : TTBTAXN_GRAD_STUD_IND
     * 
     */
    @JsonProperty("gradStudInd")
    public void setGradStudInd(String gradStudInd) {
        this.gradStudInd = gradStudInd;
    }

    public StudentTaxNotifications100PutRequest withGradStudInd(String gradStudInd) {
        this.gradStudInd = gradStudInd;
        return this;
    }

    /**
     * Box 5
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_4
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount4")
    public Double getCriteriaAmount4() {
        return criteriaAmount4;
    }

    /**
     * Box 5
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_4
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount4")
    public void setCriteriaAmount4(Double criteriaAmount4) {
        this.criteriaAmount4 = criteriaAmount4;
    }

    public StudentTaxNotifications100PutRequest withCriteriaAmount4(Double criteriaAmount4) {
        this.criteriaAmount4 = criteriaAmount4;
        return this;
    }

    /**
     * Box 4
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_3
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount3")
    public Double getCriteriaAmount3() {
        return criteriaAmount3;
    }

    /**
     * Box 4
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_3
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount3")
    public void setCriteriaAmount3(Double criteriaAmount3) {
        this.criteriaAmount3 = criteriaAmount3;
    }

    public StudentTaxNotifications100PutRequest withCriteriaAmount3(Double criteriaAmount3) {
        this.criteriaAmount3 = criteriaAmount3;
        return this;
    }

    /**
     * SSN Certification
     * <p>
     * Lineage reference object : TTBTAXN_SSN_CERT_IND
     * 
     */
    @JsonProperty("ssnCertInd")
    public String getSsnCertInd() {
        return ssnCertInd;
    }

    /**
     * SSN Certification
     * <p>
     * Lineage reference object : TTBTAXN_SSN_CERT_IND
     * 
     */
    @JsonProperty("ssnCertInd")
    public void setSsnCertInd(String ssnCertInd) {
        this.ssnCertInd = ssnCertInd;
    }

    public StudentTaxNotifications100PutRequest withSsnCertInd(String ssnCertInd) {
        this.ssnCertInd = ssnCertInd;
        return this;
    }

    /**
     * Box 4
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_6
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount6")
    public Double getCriteriaAmount6() {
        return criteriaAmount6;
    }

    /**
     * Box 4
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_6
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount6")
    public void setCriteriaAmount6(Double criteriaAmount6) {
        this.criteriaAmount6 = criteriaAmount6;
    }

    public StudentTaxNotifications100PutRequest withCriteriaAmount6(Double criteriaAmount6) {
        this.criteriaAmount6 = criteriaAmount6;
        return this;
    }

    /**
     * Box 6
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_5
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount5")
    public Double getCriteriaAmount5() {
        return criteriaAmount5;
    }

    /**
     * Box 6
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_5
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount5")
    public void setCriteriaAmount5(Double criteriaAmount5) {
        this.criteriaAmount5 = criteriaAmount5;
    }

    public StudentTaxNotifications100PutRequest withCriteriaAmount5(Double criteriaAmount5) {
        this.criteriaAmount5 = criteriaAmount5;
        return this;
    }

    /**
     * Box 2
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_2
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount2")
    public Double getCriteriaAmount2() {
        return criteriaAmount2;
    }

    /**
     * Box 2
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_2
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount2")
    public void setCriteriaAmount2(Double criteriaAmount2) {
        this.criteriaAmount2 = criteriaAmount2;
    }

    public StudentTaxNotifications100PutRequest withCriteriaAmount2(Double criteriaAmount2) {
        this.criteriaAmount2 = criteriaAmount2;
        return this;
    }

    /**
     * Box 1
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_1
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount1")
    public Double getCriteriaAmount1() {
        return criteriaAmount1;
    }

    /**
     * Box 1
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_1
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount1")
    public void setCriteriaAmount1(Double criteriaAmount1) {
        this.criteriaAmount1 = criteriaAmount1;
    }

    public StudentTaxNotifications100PutRequest withCriteriaAmount1(Double criteriaAmount1) {
        this.criteriaAmount1 = criteriaAmount1;
        return this;
    }

    /**
     * Last Name
     * <p>
     * Lineage reference object : TTBTAXN_LAST_NAME
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StudentTaxNotifications100PutRequest withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTBTAXN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTBTAXN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public StudentTaxNotifications100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTBTAXN_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTBTAXN_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public StudentTaxNotifications100PutRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : TTBTAXN_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.firstName")
    public String getCriteriaFirstName() {
        return criteriaFirstName;
    }

    /**
     * First Name
     * <p>
     * Lineage reference object : TTBTAXN_FIRST_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.firstName")
    public void setCriteriaFirstName(String criteriaFirstName) {
        this.criteriaFirstName = criteriaFirstName;
    }

    public StudentTaxNotifications100PutRequest withCriteriaFirstName(String criteriaFirstName) {
        this.criteriaFirstName = criteriaFirstName;
        return this;
    }

    /**
     * Student Notification
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS
     * 
     */
    @JsonProperty("criteria.studNotifStatus")
    public String getCriteriaStudNotifStatus() {
        return criteriaStudNotifStatus;
    }

    /**
     * Student Notification
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS
     * 
     */
    @JsonProperty("criteria.studNotifStatus")
    public void setCriteriaStudNotifStatus(String criteriaStudNotifStatus) {
        this.criteriaStudNotifStatus = criteriaStudNotifStatus;
    }

    public StudentTaxNotifications100PutRequest withCriteriaStudNotifStatus(String criteriaStudNotifStatus) {
        this.criteriaStudNotifStatus = criteriaStudNotifStatus;
        return this;
    }

    /**
     * Remove Notification
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_IND
     * 
     */
    @JsonProperty("removeNotifInd")
    public String getRemoveNotifInd() {
        return removeNotifInd;
    }

    /**
     * Remove Notification
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_IND
     * 
     */
    @JsonProperty("removeNotifInd")
    public void setRemoveNotifInd(String removeNotifInd) {
        this.removeNotifInd = removeNotifInd;
    }

    public StudentTaxNotifications100PutRequest withRemoveNotifInd(String removeNotifInd) {
        this.removeNotifInd = removeNotifInd;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_DATE
     * 
     */
    @JsonProperty("criteria.irsReportDate")
    public Date getCriteriaIrsReportDate() {
        return criteriaIrsReportDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_DATE
     * 
     */
    @JsonProperty("criteria.irsReportDate")
    public void setCriteriaIrsReportDate(Date criteriaIrsReportDate) {
        this.criteriaIrsReportDate = criteriaIrsReportDate;
    }

    public StudentTaxNotifications100PutRequest withCriteriaIrsReportDate(Date criteriaIrsReportDate) {
        this.criteriaIrsReportDate = criteriaIrsReportDate;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_DATE
     * 
     */
    @JsonProperty("criteria.removeNotifDate")
    public Date getCriteriaRemoveNotifDate() {
        return criteriaRemoveNotifDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_DATE
     * 
     */
    @JsonProperty("criteria.removeNotifDate")
    public void setCriteriaRemoveNotifDate(Date criteriaRemoveNotifDate) {
        this.criteriaRemoveNotifDate = criteriaRemoveNotifDate;
    }

    public StudentTaxNotifications100PutRequest withCriteriaRemoveNotifDate(Date criteriaRemoveNotifDate) {
        this.criteriaRemoveNotifDate = criteriaRemoveNotifDate;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTBTAXN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public String getCriteriaNatnCode() {
        return criteriaNatnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTBTAXN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public void setCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
    }

    public StudentTaxNotifications100PutRequest withCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public String getKeyblckStudentId() {
        return keyblckStudentId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public void setKeyblckStudentId(String keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
    }

    public StudentTaxNotifications100PutRequest withKeyblckStudentId(String keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTBTAXN_CITY
     * 
     */
    @JsonProperty("criteria.city")
    public String getCriteriaCity() {
        return criteriaCity;
    }

    /**
     * City
     * <p>
     * Lineage reference object : TTBTAXN_CITY
     * 
     */
    @JsonProperty("criteria.city")
    public void setCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
    }

    public StudentTaxNotifications100PutRequest withCriteriaCity(String criteriaCity) {
        this.criteriaCity = criteriaCity;
        return this;
    }

    /**
     * Student Notification
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS
     * 
     */
    @JsonProperty("studNotifStatus")
    public String getStudNotifStatus() {
        return studNotifStatus;
    }

    /**
     * Student Notification
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_STATUS
     * 
     */
    @JsonProperty("studNotifStatus")
    public void setStudNotifStatus(String studNotifStatus) {
        this.studNotifStatus = studNotifStatus;
    }

    public StudentTaxNotifications100PutRequest withStudNotifStatus(String studNotifStatus) {
        this.studNotifStatus = studNotifStatus;
        return this;
    }

    /**
     * SSN
     * <p>
     * Lineage reference object : TTBTAXN_SSN
     * 
     */
    @JsonProperty("criteria.ssn")
    public String getCriteriaSsn() {
        return criteriaSsn;
    }

    /**
     * SSN
     * <p>
     * Lineage reference object : TTBTAXN_SSN
     * 
     */
    @JsonProperty("criteria.ssn")
    public void setCriteriaSsn(String criteriaSsn) {
        this.criteriaSsn = criteriaSsn;
    }

    public StudentTaxNotifications100PutRequest withCriteriaSsn(String criteriaSsn) {
        this.criteriaSsn = criteriaSsn;
        return this;
    }

    /**
     * State/Province
     * <p>
     * Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State/Province
     * <p>
     * Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public StudentTaxNotifications100PutRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE3
     * 
     */
    @JsonProperty("criteria.addrLine3")
    public String getCriteriaAddrLine3() {
        return criteriaAddrLine3;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE3
     * 
     */
    @JsonProperty("criteria.addrLine3")
    public void setCriteriaAddrLine3(String criteriaAddrLine3) {
        this.criteriaAddrLine3 = criteriaAddrLine3;
    }

    public StudentTaxNotifications100PutRequest withCriteriaAddrLine3(String criteriaAddrLine3) {
        this.criteriaAddrLine3 = criteriaAddrLine3;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTBTAXN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : TTBTAXN_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public StudentTaxNotifications100PutRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE2
     * 
     */
    @JsonProperty("criteria.addrLine2")
    public String getCriteriaAddrLine2() {
        return criteriaAddrLine2;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE2
     * 
     */
    @JsonProperty("criteria.addrLine2")
    public void setCriteriaAddrLine2(String criteriaAddrLine2) {
        this.criteriaAddrLine2 = criteriaAddrLine2;
    }

    public StudentTaxNotifications100PutRequest withCriteriaAddrLine2(String criteriaAddrLine2) {
        this.criteriaAddrLine2 = criteriaAddrLine2;
        return this;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE1
     * 
     */
    @JsonProperty("criteria.addrLine1")
    public String getCriteriaAddrLine1() {
        return criteriaAddrLine1;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE1
     * 
     */
    @JsonProperty("criteria.addrLine1")
    public void setCriteriaAddrLine1(String criteriaAddrLine1) {
        this.criteriaAddrLine1 = criteriaAddrLine1;
    }

    public StudentTaxNotifications100PutRequest withCriteriaAddrLine1(String criteriaAddrLine1) {
        this.criteriaAddrLine1 = criteriaAddrLine1;
        return this;
    }

    /**
     * Half Time Enrollment
     * <p>
     * Lineage reference object : TTBTAXN_HALF_TIME_ENRL_IND
     * 
     */
    @JsonProperty("halfTimeEnrlInd")
    public String getHalfTimeEnrlInd() {
        return halfTimeEnrlInd;
    }

    /**
     * Half Time Enrollment
     * <p>
     * Lineage reference object : TTBTAXN_HALF_TIME_ENRL_IND
     * 
     */
    @JsonProperty("halfTimeEnrlInd")
    public void setHalfTimeEnrlInd(String halfTimeEnrlInd) {
        this.halfTimeEnrlInd = halfTimeEnrlInd;
    }

    public StudentTaxNotifications100PutRequest withHalfTimeEnrlInd(String halfTimeEnrlInd) {
        this.halfTimeEnrlInd = halfTimeEnrlInd;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_DATE
     * 
     */
    @JsonProperty("criteria.studNotifDate")
    public Date getCriteriaStudNotifDate() {
        return criteriaStudNotifDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_DATE
     * 
     */
    @JsonProperty("criteria.studNotifDate")
    public void setCriteriaStudNotifDate(Date criteriaStudNotifDate) {
        this.criteriaStudNotifDate = criteriaStudNotifDate;
    }

    public StudentTaxNotifications100PutRequest withCriteriaStudNotifDate(Date criteriaStudNotifDate) {
        this.criteriaStudNotifDate = criteriaStudNotifDate;
        return this;
    }

    /**
     * Remove Notification
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_IND
     * 
     */
    @JsonProperty("criteria.removeNotifInd")
    public String getCriteriaRemoveNotifInd() {
        return criteriaRemoveNotifInd;
    }

    /**
     * Remove Notification
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_IND
     * 
     */
    @JsonProperty("criteria.removeNotifInd")
    public void setCriteriaRemoveNotifInd(String criteriaRemoveNotifInd) {
        this.criteriaRemoveNotifInd = criteriaRemoveNotifInd;
    }

    public StudentTaxNotifications100PutRequest withCriteriaRemoveNotifInd(String criteriaRemoveNotifInd) {
        this.criteriaRemoveNotifInd = criteriaRemoveNotifInd;
        return this;
    }

    /**
     * Method Changed
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.methodChanged")
    public String getCriteriaMethodChanged() {
        return criteriaMethodChanged;
    }

    /**
     * Method Changed
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.methodChanged")
    public void setCriteriaMethodChanged(String criteriaMethodChanged) {
        this.criteriaMethodChanged = criteriaMethodChanged;
    }

    public StudentTaxNotifications100PutRequest withCriteriaMethodChanged(String criteriaMethodChanged) {
        this.criteriaMethodChanged = criteriaMethodChanged;
        return this;
    }

    /**
     * State/Province
     * <p>
     * Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public String getCriteriaStatCode() {
        return criteriaStatCode;
    }

    /**
     * State/Province
     * <p>
     * Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public void setCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
    }

    public StudentTaxNotifications100PutRequest withCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
        return this;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE3
     * 
     */
    @JsonProperty("addrLine3")
    public String getAddrLine3() {
        return addrLine3;
    }

    /**
     * Address Line 3
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE3
     * 
     */
    @JsonProperty("addrLine3")
    public void setAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
    }

    public StudentTaxNotifications100PutRequest withAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
        return this;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE2
     * 
     */
    @JsonProperty("addrLine2")
    public String getAddrLine2() {
        return addrLine2;
    }

    /**
     * Address Line 2
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE2
     * 
     */
    @JsonProperty("addrLine2")
    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public StudentTaxNotifications100PutRequest withAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
        return this;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE1
     * 
     */
    @JsonProperty("addrLine1")
    public String getAddrLine1() {
        return addrLine1;
    }

    /**
     * Address Line 1
     * <p>
     * Lineage reference object : TTBTAXN_ADDR_LINE1
     * 
     */
    @JsonProperty("addrLine1")
    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public StudentTaxNotifications100PutRequest withAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
        return this;
    }

    /**
     * Half Time Enrollment
     * <p>
     * Lineage reference object : TTBTAXN_HALF_TIME_ENRL_IND
     * 
     */
    @JsonProperty("criteria.halfTimeEnrlInd")
    public String getCriteriaHalfTimeEnrlInd() {
        return criteriaHalfTimeEnrlInd;
    }

    /**
     * Half Time Enrollment
     * <p>
     * Lineage reference object : TTBTAXN_HALF_TIME_ENRL_IND
     * 
     */
    @JsonProperty("criteria.halfTimeEnrlInd")
    public void setCriteriaHalfTimeEnrlInd(String criteriaHalfTimeEnrlInd) {
        this.criteriaHalfTimeEnrlInd = criteriaHalfTimeEnrlInd;
    }

    public StudentTaxNotifications100PutRequest withCriteriaHalfTimeEnrlInd(String criteriaHalfTimeEnrlInd) {
        this.criteriaHalfTimeEnrlInd = criteriaHalfTimeEnrlInd;
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

    public StudentTaxNotifications100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentTaxNotifications100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("futureInd");
        sb.append('=');
        sb.append(((this.futureInd == null)?"<null>":this.futureInd));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("irsReportStatus");
        sb.append('=');
        sb.append(((this.irsReportStatus == null)?"<null>":this.irsReportStatus));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("taxYear");
        sb.append('=');
        sb.append(((this.taxYear == null)?"<null>":this.taxYear));
        sb.append(',');
        sb.append("criteriaIrsReportStatus");
        sb.append('=');
        sb.append(((this.criteriaIrsReportStatus == null)?"<null>":this.criteriaIrsReportStatus));
        sb.append(',');
        sb.append("criteriaMi");
        sb.append('=');
        sb.append(((this.criteriaMi == null)?"<null>":this.criteriaMi));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("criteriaLastName");
        sb.append('=');
        sb.append(((this.criteriaLastName == null)?"<null>":this.criteriaLastName));
        sb.append(',');
        sb.append("criteriaZip");
        sb.append('=');
        sb.append(((this.criteriaZip == null)?"<null>":this.criteriaZip));
        sb.append(',');
        sb.append("criteriaNatnDesc");
        sb.append('=');
        sb.append(((this.criteriaNatnDesc == null)?"<null>":this.criteriaNatnDesc));
        sb.append(',');
        sb.append("criteriaSsnCertInd");
        sb.append('=');
        sb.append(((this.criteriaSsnCertInd == null)?"<null>":this.criteriaSsnCertInd));
        sb.append(',');
        sb.append("criteriaFutureInd");
        sb.append('=');
        sb.append(((this.criteriaFutureInd == null)?"<null>":this.criteriaFutureInd));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("criteriaGradStudInd");
        sb.append('=');
        sb.append(((this.criteriaGradStudInd == null)?"<null>":this.criteriaGradStudInd));
        sb.append(',');
        sb.append("gradStudInd");
        sb.append('=');
        sb.append(((this.gradStudInd == null)?"<null>":this.gradStudInd));
        sb.append(',');
        sb.append("criteriaAmount4");
        sb.append('=');
        sb.append(((this.criteriaAmount4 == null)?"<null>":this.criteriaAmount4));
        sb.append(',');
        sb.append("criteriaAmount3");
        sb.append('=');
        sb.append(((this.criteriaAmount3 == null)?"<null>":this.criteriaAmount3));
        sb.append(',');
        sb.append("ssnCertInd");
        sb.append('=');
        sb.append(((this.ssnCertInd == null)?"<null>":this.ssnCertInd));
        sb.append(',');
        sb.append("criteriaAmount6");
        sb.append('=');
        sb.append(((this.criteriaAmount6 == null)?"<null>":this.criteriaAmount6));
        sb.append(',');
        sb.append("criteriaAmount5");
        sb.append('=');
        sb.append(((this.criteriaAmount5 == null)?"<null>":this.criteriaAmount5));
        sb.append(',');
        sb.append("criteriaAmount2");
        sb.append('=');
        sb.append(((this.criteriaAmount2 == null)?"<null>":this.criteriaAmount2));
        sb.append(',');
        sb.append("criteriaAmount1");
        sb.append('=');
        sb.append(((this.criteriaAmount1 == null)?"<null>":this.criteriaAmount1));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("criteriaFirstName");
        sb.append('=');
        sb.append(((this.criteriaFirstName == null)?"<null>":this.criteriaFirstName));
        sb.append(',');
        sb.append("criteriaStudNotifStatus");
        sb.append('=');
        sb.append(((this.criteriaStudNotifStatus == null)?"<null>":this.criteriaStudNotifStatus));
        sb.append(',');
        sb.append("removeNotifInd");
        sb.append('=');
        sb.append(((this.removeNotifInd == null)?"<null>":this.removeNotifInd));
        sb.append(',');
        sb.append("criteriaIrsReportDate");
        sb.append('=');
        sb.append(((this.criteriaIrsReportDate == null)?"<null>":this.criteriaIrsReportDate));
        sb.append(',');
        sb.append("criteriaRemoveNotifDate");
        sb.append('=');
        sb.append(((this.criteriaRemoveNotifDate == null)?"<null>":this.criteriaRemoveNotifDate));
        sb.append(',');
        sb.append("criteriaNatnCode");
        sb.append('=');
        sb.append(((this.criteriaNatnCode == null)?"<null>":this.criteriaNatnCode));
        sb.append(',');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
        sb.append(',');
        sb.append("criteriaCity");
        sb.append('=');
        sb.append(((this.criteriaCity == null)?"<null>":this.criteriaCity));
        sb.append(',');
        sb.append("studNotifStatus");
        sb.append('=');
        sb.append(((this.studNotifStatus == null)?"<null>":this.studNotifStatus));
        sb.append(',');
        sb.append("criteriaSsn");
        sb.append('=');
        sb.append(((this.criteriaSsn == null)?"<null>":this.criteriaSsn));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("criteriaAddrLine3");
        sb.append('=');
        sb.append(((this.criteriaAddrLine3 == null)?"<null>":this.criteriaAddrLine3));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("criteriaAddrLine2");
        sb.append('=');
        sb.append(((this.criteriaAddrLine2 == null)?"<null>":this.criteriaAddrLine2));
        sb.append(',');
        sb.append("criteriaAddrLine1");
        sb.append('=');
        sb.append(((this.criteriaAddrLine1 == null)?"<null>":this.criteriaAddrLine1));
        sb.append(',');
        sb.append("halfTimeEnrlInd");
        sb.append('=');
        sb.append(((this.halfTimeEnrlInd == null)?"<null>":this.halfTimeEnrlInd));
        sb.append(',');
        sb.append("criteriaStudNotifDate");
        sb.append('=');
        sb.append(((this.criteriaStudNotifDate == null)?"<null>":this.criteriaStudNotifDate));
        sb.append(',');
        sb.append("criteriaRemoveNotifInd");
        sb.append('=');
        sb.append(((this.criteriaRemoveNotifInd == null)?"<null>":this.criteriaRemoveNotifInd));
        sb.append(',');
        sb.append("criteriaMethodChanged");
        sb.append('=');
        sb.append(((this.criteriaMethodChanged == null)?"<null>":this.criteriaMethodChanged));
        sb.append(',');
        sb.append("criteriaStatCode");
        sb.append('=');
        sb.append(((this.criteriaStatCode == null)?"<null>":this.criteriaStatCode));
        sb.append(',');
        sb.append("addrLine3");
        sb.append('=');
        sb.append(((this.addrLine3 == null)?"<null>":this.addrLine3));
        sb.append(',');
        sb.append("addrLine2");
        sb.append('=');
        sb.append(((this.addrLine2 == null)?"<null>":this.addrLine2));
        sb.append(',');
        sb.append("addrLine1");
        sb.append('=');
        sb.append(((this.addrLine1 == null)?"<null>":this.addrLine1));
        sb.append(',');
        sb.append("criteriaHalfTimeEnrlInd");
        sb.append('=');
        sb.append(((this.criteriaHalfTimeEnrlInd == null)?"<null>":this.criteriaHalfTimeEnrlInd));
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
        result = ((result* 31)+((this.futureInd == null)? 0 :this.futureInd.hashCode()));
        result = ((result* 31)+((this.criteriaMi == null)? 0 :this.criteriaMi.hashCode()));
        result = ((result* 31)+((this.criteriaHalfTimeEnrlInd == null)? 0 :this.criteriaHalfTimeEnrlInd.hashCode()));
        result = ((result* 31)+((this.irsReportStatus == null)? 0 :this.irsReportStatus.hashCode()));
        result = ((result* 31)+((this.criteriaAmount4 == null)? 0 :this.criteriaAmount4 .hashCode()));
        result = ((result* 31)+((this.criteriaAmount3 == null)? 0 :this.criteriaAmount3 .hashCode()));
        result = ((result* 31)+((this.criteriaLastName == null)? 0 :this.criteriaLastName.hashCode()));
        result = ((result* 31)+((this.criteriaAmount6 == null)? 0 :this.criteriaAmount6 .hashCode()));
        result = ((result* 31)+((this.criteriaAmount5 == null)? 0 :this.criteriaAmount5 .hashCode()));
        result = ((result* 31)+((this.criteriaAmount2 == null)? 0 :this.criteriaAmount2 .hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.criteriaAmount1 == null)? 0 :this.criteriaAmount1 .hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine3 == null)? 0 :this.criteriaAddrLine3 .hashCode()));
        result = ((result* 31)+((this.criteriaStudNotifDate == null)? 0 :this.criteriaStudNotifDate.hashCode()));
        result = ((result* 31)+((this.criteriaNatnCode == null)? 0 :this.criteriaNatnCode.hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine2 == null)? 0 :this.criteriaAddrLine2 .hashCode()));
        result = ((result* 31)+((this.criteriaAddrLine1 == null)? 0 :this.criteriaAddrLine1 .hashCode()));
        result = ((result* 31)+((this.taxYear == null)? 0 :this.taxYear.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaIrsReportStatus == null)? 0 :this.criteriaIrsReportStatus.hashCode()));
        result = ((result* 31)+((this.criteriaStatCode == null)? 0 :this.criteriaStatCode.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.gradStudInd == null)? 0 :this.gradStudInd.hashCode()));
        result = ((result* 31)+((this.ssnCertInd == null)? 0 :this.ssnCertInd.hashCode()));
        result = ((result* 31)+((this.criteriaStudNotifStatus == null)? 0 :this.criteriaStudNotifStatus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSsn == null)? 0 :this.criteriaSsn.hashCode()));
        result = ((result* 31)+((this.criteriaRemoveNotifInd == null)? 0 :this.criteriaRemoveNotifInd.hashCode()));
        result = ((result* 31)+((this.criteriaIrsReportDate == null)? 0 :this.criteriaIrsReportDate.hashCode()));
        result = ((result* 31)+((this.criteriaGradStudInd == null)? 0 :this.criteriaGradStudInd.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.removeNotifInd == null)? 0 :this.removeNotifInd.hashCode()));
        result = ((result* 31)+((this.criteriaCity == null)? 0 :this.criteriaCity.hashCode()));
        result = ((result* 31)+((this.criteriaZip == null)? 0 :this.criteriaZip.hashCode()));
        result = ((result* 31)+((this.criteriaFirstName == null)? 0 :this.criteriaFirstName.hashCode()));
        result = ((result* 31)+((this.keyblckStudentId == null)? 0 :this.keyblckStudentId.hashCode()));
        result = ((result* 31)+((this.studNotifStatus == null)? 0 :this.studNotifStatus.hashCode()));
        result = ((result* 31)+((this.criteriaFutureInd == null)? 0 :this.criteriaFutureInd.hashCode()));
        result = ((result* 31)+((this.criteriaRemoveNotifDate == null)? 0 :this.criteriaRemoveNotifDate.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.halfTimeEnrlInd == null)? 0 :this.halfTimeEnrlInd.hashCode()));
        result = ((result* 31)+((this.criteriaMethodChanged == null)? 0 :this.criteriaMethodChanged.hashCode()));
        result = ((result* 31)+((this.criteriaNatnDesc == null)? 0 :this.criteriaNatnDesc.hashCode()));
        result = ((result* 31)+((this.addrLine3 == null)? 0 :this.addrLine3 .hashCode()));
        result = ((result* 31)+((this.addrLine2 == null)? 0 :this.addrLine2 .hashCode()));
        result = ((result* 31)+((this.addrLine1 == null)? 0 :this.addrLine1 .hashCode()));
        result = ((result* 31)+((this.criteriaSsnCertInd == null)? 0 :this.criteriaSsnCertInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentTaxNotifications100PutRequest) == false) {
            return false;
        }
        StudentTaxNotifications100PutRequest rhs = ((StudentTaxNotifications100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((this.futureInd == rhs.futureInd)||((this.futureInd!= null)&&this.futureInd.equals(rhs.futureInd)))&&((this.criteriaMi == rhs.criteriaMi)||((this.criteriaMi!= null)&&this.criteriaMi.equals(rhs.criteriaMi))))&&((this.criteriaHalfTimeEnrlInd == rhs.criteriaHalfTimeEnrlInd)||((this.criteriaHalfTimeEnrlInd!= null)&&this.criteriaHalfTimeEnrlInd.equals(rhs.criteriaHalfTimeEnrlInd))))&&((this.irsReportStatus == rhs.irsReportStatus)||((this.irsReportStatus!= null)&&this.irsReportStatus.equals(rhs.irsReportStatus))))&&((this.criteriaAmount4 == rhs.criteriaAmount4)||((this.criteriaAmount4 != null)&&this.criteriaAmount4 .equals(rhs.criteriaAmount4))))&&((this.criteriaAmount3 == rhs.criteriaAmount3)||((this.criteriaAmount3 != null)&&this.criteriaAmount3 .equals(rhs.criteriaAmount3))))&&((this.criteriaLastName == rhs.criteriaLastName)||((this.criteriaLastName!= null)&&this.criteriaLastName.equals(rhs.criteriaLastName))))&&((this.criteriaAmount6 == rhs.criteriaAmount6)||((this.criteriaAmount6 != null)&&this.criteriaAmount6 .equals(rhs.criteriaAmount6))))&&((this.criteriaAmount5 == rhs.criteriaAmount5)||((this.criteriaAmount5 != null)&&this.criteriaAmount5 .equals(rhs.criteriaAmount5))))&&((this.criteriaAmount2 == rhs.criteriaAmount2)||((this.criteriaAmount2 != null)&&this.criteriaAmount2 .equals(rhs.criteriaAmount2))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.criteriaAmount1 == rhs.criteriaAmount1)||((this.criteriaAmount1 != null)&&this.criteriaAmount1 .equals(rhs.criteriaAmount1))))&&((this.criteriaAddrLine3 == rhs.criteriaAddrLine3)||((this.criteriaAddrLine3 != null)&&this.criteriaAddrLine3 .equals(rhs.criteriaAddrLine3))))&&((this.criteriaStudNotifDate == rhs.criteriaStudNotifDate)||((this.criteriaStudNotifDate!= null)&&this.criteriaStudNotifDate.equals(rhs.criteriaStudNotifDate))))&&((this.criteriaNatnCode == rhs.criteriaNatnCode)||((this.criteriaNatnCode!= null)&&this.criteriaNatnCode.equals(rhs.criteriaNatnCode))))&&((this.criteriaAddrLine2 == rhs.criteriaAddrLine2)||((this.criteriaAddrLine2 != null)&&this.criteriaAddrLine2 .equals(rhs.criteriaAddrLine2))))&&((this.criteriaAddrLine1 == rhs.criteriaAddrLine1)||((this.criteriaAddrLine1 != null)&&this.criteriaAddrLine1 .equals(rhs.criteriaAddrLine1))))&&((this.taxYear == rhs.taxYear)||((this.taxYear!= null)&&this.taxYear.equals(rhs.taxYear))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaIrsReportStatus == rhs.criteriaIrsReportStatus)||((this.criteriaIrsReportStatus!= null)&&this.criteriaIrsReportStatus.equals(rhs.criteriaIrsReportStatus))))&&((this.criteriaStatCode == rhs.criteriaStatCode)||((this.criteriaStatCode!= null)&&this.criteriaStatCode.equals(rhs.criteriaStatCode))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.gradStudInd == rhs.gradStudInd)||((this.gradStudInd!= null)&&this.gradStudInd.equals(rhs.gradStudInd))))&&((this.ssnCertInd == rhs.ssnCertInd)||((this.ssnCertInd!= null)&&this.ssnCertInd.equals(rhs.ssnCertInd))))&&((this.criteriaStudNotifStatus == rhs.criteriaStudNotifStatus)||((this.criteriaStudNotifStatus!= null)&&this.criteriaStudNotifStatus.equals(rhs.criteriaStudNotifStatus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSsn == rhs.criteriaSsn)||((this.criteriaSsn!= null)&&this.criteriaSsn.equals(rhs.criteriaSsn))))&&((this.criteriaRemoveNotifInd == rhs.criteriaRemoveNotifInd)||((this.criteriaRemoveNotifInd!= null)&&this.criteriaRemoveNotifInd.equals(rhs.criteriaRemoveNotifInd))))&&((this.criteriaIrsReportDate == rhs.criteriaIrsReportDate)||((this.criteriaIrsReportDate!= null)&&this.criteriaIrsReportDate.equals(rhs.criteriaIrsReportDate))))&&((this.criteriaGradStudInd == rhs.criteriaGradStudInd)||((this.criteriaGradStudInd!= null)&&this.criteriaGradStudInd.equals(rhs.criteriaGradStudInd))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.removeNotifInd == rhs.removeNotifInd)||((this.removeNotifInd!= null)&&this.removeNotifInd.equals(rhs.removeNotifInd))))&&((this.criteriaCity == rhs.criteriaCity)||((this.criteriaCity!= null)&&this.criteriaCity.equals(rhs.criteriaCity))))&&((this.criteriaZip == rhs.criteriaZip)||((this.criteriaZip!= null)&&this.criteriaZip.equals(rhs.criteriaZip))))&&((this.criteriaFirstName == rhs.criteriaFirstName)||((this.criteriaFirstName!= null)&&this.criteriaFirstName.equals(rhs.criteriaFirstName))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))))&&((this.studNotifStatus == rhs.studNotifStatus)||((this.studNotifStatus!= null)&&this.studNotifStatus.equals(rhs.studNotifStatus))))&&((this.criteriaFutureInd == rhs.criteriaFutureInd)||((this.criteriaFutureInd!= null)&&this.criteriaFutureInd.equals(rhs.criteriaFutureInd))))&&((this.criteriaRemoveNotifDate == rhs.criteriaRemoveNotifDate)||((this.criteriaRemoveNotifDate!= null)&&this.criteriaRemoveNotifDate.equals(rhs.criteriaRemoveNotifDate))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.halfTimeEnrlInd == rhs.halfTimeEnrlInd)||((this.halfTimeEnrlInd!= null)&&this.halfTimeEnrlInd.equals(rhs.halfTimeEnrlInd))))&&((this.criteriaMethodChanged == rhs.criteriaMethodChanged)||((this.criteriaMethodChanged!= null)&&this.criteriaMethodChanged.equals(rhs.criteriaMethodChanged))))&&((this.criteriaNatnDesc == rhs.criteriaNatnDesc)||((this.criteriaNatnDesc!= null)&&this.criteriaNatnDesc.equals(rhs.criteriaNatnDesc))))&&((this.addrLine3 == rhs.addrLine3)||((this.addrLine3 != null)&&this.addrLine3 .equals(rhs.addrLine3))))&&((this.addrLine2 == rhs.addrLine2)||((this.addrLine2 != null)&&this.addrLine2 .equals(rhs.addrLine2))))&&((this.addrLine1 == rhs.addrLine1)||((this.addrLine1 != null)&&this.addrLine1 .equals(rhs.addrLine1))))&&((this.criteriaSsnCertInd == rhs.criteriaSsnCertInd)||((this.criteriaSsnCertInd!= null)&&this.criteriaSsnCertInd.equals(rhs.criteriaSsnCertInd))));
    }

}
