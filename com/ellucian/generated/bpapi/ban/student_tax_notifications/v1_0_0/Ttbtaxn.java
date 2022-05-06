
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
    "natnDesc",
    "futureInd",
    "lastName",
    "city",
    "removeNotifInd",
    "irsReportStatus",
    "ssn",
    "amount6",
    "amount5",
    "activityDate",
    "amount4",
    "amount1",
    "studNotifStatus",
    "mi",
    "zip",
    "statCode",
    "natnCode",
    "studNotifDate",
    "halfTimeEnrlInd",
    "userId",
    "methodChanged",
    "firstName",
    "irsReportDate",
    "gradStudInd",
    "addrLine3",
    "addrLine2",
    "addrLine1",
    "ssnCertInd",
    "removeNotifDate"
})
@Generated("jsonschema2pojo")
public class Ttbtaxn {

    @JsonProperty("natnDesc")
    private String natnDesc;
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
     * City
     * <p>
     * Lineage reference object : TTBTAXN_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_CITY")
    private String city;
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
     * Box 4
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_6
     * (Required)
     * 
     */
    @JsonProperty("amount6")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_6")
    private Double amount6;
    /**
     * Box 6
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_5
     * (Required)
     * 
     */
    @JsonProperty("amount5")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_5")
    private Double amount5;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTBTAXN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Box 5
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_4
     * (Required)
     * 
     */
    @JsonProperty("amount4")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_4")
    private Double amount4;
    /**
     * Box 1
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_1
     * (Required)
     * 
     */
    @JsonProperty("amount1")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_AMOUNT_1")
    private Double amount1;
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
     * State/Province
     * <p>
     * Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
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
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_DATE
     * 
     */
    @JsonProperty("studNotifDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_STUD_NOTIF_DATE")
    private Date studNotifDate;
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
     * User ID
     * <p>
     * Lineage reference object : TTBTAXN_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_USER_ID")
    private String userId;
    /**
     * Method Changed
     * <p>
     * 
     * 
     */
    @JsonProperty("methodChanged")
    private String methodChanged;
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
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_DATE
     * 
     */
    @JsonProperty("irsReportDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_IRS_REPORT_DATE")
    private Date irsReportDate;
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
     * SSN Certification
     * <p>
     * Lineage reference object : TTBTAXN_SSN_CERT_IND
     * 
     */
    @JsonProperty("ssnCertInd")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_SSN_CERT_IND")
    private String ssnCertInd;
    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_DATE
     * 
     */
    @JsonProperty("removeNotifDate")
    @JsonPropertyDescription("Lineage reference object : TTBTAXN_REMOVE_NOTIF_DATE")
    private Date removeNotifDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("natnDesc")
    public String getNatnDesc() {
        return natnDesc;
    }

    @JsonProperty("natnDesc")
    public void setNatnDesc(String natnDesc) {
        this.natnDesc = natnDesc;
    }

    public Ttbtaxn withNatnDesc(String natnDesc) {
        this.natnDesc = natnDesc;
        return this;
    }

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

    public Ttbtaxn withFutureInd(String futureInd) {
        this.futureInd = futureInd;
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

    public Ttbtaxn withLastName(String lastName) {
        this.lastName = lastName;
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

    public Ttbtaxn withCity(String city) {
        this.city = city;
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

    public Ttbtaxn withRemoveNotifInd(String removeNotifInd) {
        this.removeNotifInd = removeNotifInd;
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

    public Ttbtaxn withIrsReportStatus(String irsReportStatus) {
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

    public Ttbtaxn withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    /**
     * Box 4
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_6
     * (Required)
     * 
     */
    @JsonProperty("amount6")
    public Double getAmount6() {
        return amount6;
    }

    /**
     * Box 4
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_6
     * (Required)
     * 
     */
    @JsonProperty("amount6")
    public void setAmount6(Double amount6) {
        this.amount6 = amount6;
    }

    public Ttbtaxn withAmount6(Double amount6) {
        this.amount6 = amount6;
        return this;
    }

    /**
     * Box 6
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_5
     * (Required)
     * 
     */
    @JsonProperty("amount5")
    public Double getAmount5() {
        return amount5;
    }

    /**
     * Box 6
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_5
     * (Required)
     * 
     */
    @JsonProperty("amount5")
    public void setAmount5(Double amount5) {
        this.amount5 = amount5;
    }

    public Ttbtaxn withAmount5(Double amount5) {
        this.amount5 = amount5;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTBTAXN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TTBTAXN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ttbtaxn withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Box 5
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_4
     * (Required)
     * 
     */
    @JsonProperty("amount4")
    public Double getAmount4() {
        return amount4;
    }

    /**
     * Box 5
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_4
     * (Required)
     * 
     */
    @JsonProperty("amount4")
    public void setAmount4(Double amount4) {
        this.amount4 = amount4;
    }

    public Ttbtaxn withAmount4(Double amount4) {
        this.amount4 = amount4;
        return this;
    }

    /**
     * Box 1
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_1
     * (Required)
     * 
     */
    @JsonProperty("amount1")
    public Double getAmount1() {
        return amount1;
    }

    /**
     * Box 1
     * <p>
     * Lineage reference object : TTBTAXN_AMOUNT_1
     * (Required)
     * 
     */
    @JsonProperty("amount1")
    public void setAmount1(Double amount1) {
        this.amount1 = amount1;
    }

    public Ttbtaxn withAmount1(Double amount1) {
        this.amount1 = amount1;
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

    public Ttbtaxn withStudNotifStatus(String studNotifStatus) {
        this.studNotifStatus = studNotifStatus;
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

    public Ttbtaxn withMi(String mi) {
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

    public Ttbtaxn withZip(String zip) {
        this.zip = zip;
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

    public Ttbtaxn withStatCode(String statCode) {
        this.statCode = statCode;
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

    public Ttbtaxn withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_DATE
     * 
     */
    @JsonProperty("studNotifDate")
    public Date getStudNotifDate() {
        return studNotifDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_STUD_NOTIF_DATE
     * 
     */
    @JsonProperty("studNotifDate")
    public void setStudNotifDate(Date studNotifDate) {
        this.studNotifDate = studNotifDate;
    }

    public Ttbtaxn withStudNotifDate(Date studNotifDate) {
        this.studNotifDate = studNotifDate;
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

    public Ttbtaxn withHalfTimeEnrlInd(String halfTimeEnrlInd) {
        this.halfTimeEnrlInd = halfTimeEnrlInd;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TTBTAXN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : TTBTAXN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ttbtaxn withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Method Changed
     * <p>
     * 
     * 
     */
    @JsonProperty("methodChanged")
    public String getMethodChanged() {
        return methodChanged;
    }

    /**
     * Method Changed
     * <p>
     * 
     * 
     */
    @JsonProperty("methodChanged")
    public void setMethodChanged(String methodChanged) {
        this.methodChanged = methodChanged;
    }

    public Ttbtaxn withMethodChanged(String methodChanged) {
        this.methodChanged = methodChanged;
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

    public Ttbtaxn withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_DATE
     * 
     */
    @JsonProperty("irsReportDate")
    public Date getIrsReportDate() {
        return irsReportDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_IRS_REPORT_DATE
     * 
     */
    @JsonProperty("irsReportDate")
    public void setIrsReportDate(Date irsReportDate) {
        this.irsReportDate = irsReportDate;
    }

    public Ttbtaxn withIrsReportDate(Date irsReportDate) {
        this.irsReportDate = irsReportDate;
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

    public Ttbtaxn withGradStudInd(String gradStudInd) {
        this.gradStudInd = gradStudInd;
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

    public Ttbtaxn withAddrLine3(String addrLine3) {
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

    public Ttbtaxn withAddrLine2(String addrLine2) {
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

    public Ttbtaxn withAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
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

    public Ttbtaxn withSsnCertInd(String ssnCertInd) {
        this.ssnCertInd = ssnCertInd;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_DATE
     * 
     */
    @JsonProperty("removeNotifDate")
    public Date getRemoveNotifDate() {
        return removeNotifDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : TTBTAXN_REMOVE_NOTIF_DATE
     * 
     */
    @JsonProperty("removeNotifDate")
    public void setRemoveNotifDate(Date removeNotifDate) {
        this.removeNotifDate = removeNotifDate;
    }

    public Ttbtaxn withRemoveNotifDate(Date removeNotifDate) {
        this.removeNotifDate = removeNotifDate;
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

    public Ttbtaxn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ttbtaxn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("natnDesc");
        sb.append('=');
        sb.append(((this.natnDesc == null)?"<null>":this.natnDesc));
        sb.append(',');
        sb.append("futureInd");
        sb.append('=');
        sb.append(((this.futureInd == null)?"<null>":this.futureInd));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("removeNotifInd");
        sb.append('=');
        sb.append(((this.removeNotifInd == null)?"<null>":this.removeNotifInd));
        sb.append(',');
        sb.append("irsReportStatus");
        sb.append('=');
        sb.append(((this.irsReportStatus == null)?"<null>":this.irsReportStatus));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("amount6");
        sb.append('=');
        sb.append(((this.amount6 == null)?"<null>":this.amount6));
        sb.append(',');
        sb.append("amount5");
        sb.append('=');
        sb.append(((this.amount5 == null)?"<null>":this.amount5));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("amount4");
        sb.append('=');
        sb.append(((this.amount4 == null)?"<null>":this.amount4));
        sb.append(',');
        sb.append("amount1");
        sb.append('=');
        sb.append(((this.amount1 == null)?"<null>":this.amount1));
        sb.append(',');
        sb.append("studNotifStatus");
        sb.append('=');
        sb.append(((this.studNotifStatus == null)?"<null>":this.studNotifStatus));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("studNotifDate");
        sb.append('=');
        sb.append(((this.studNotifDate == null)?"<null>":this.studNotifDate));
        sb.append(',');
        sb.append("halfTimeEnrlInd");
        sb.append('=');
        sb.append(((this.halfTimeEnrlInd == null)?"<null>":this.halfTimeEnrlInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("methodChanged");
        sb.append('=');
        sb.append(((this.methodChanged == null)?"<null>":this.methodChanged));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("irsReportDate");
        sb.append('=');
        sb.append(((this.irsReportDate == null)?"<null>":this.irsReportDate));
        sb.append(',');
        sb.append("gradStudInd");
        sb.append('=');
        sb.append(((this.gradStudInd == null)?"<null>":this.gradStudInd));
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
        sb.append("ssnCertInd");
        sb.append('=');
        sb.append(((this.ssnCertInd == null)?"<null>":this.ssnCertInd));
        sb.append(',');
        sb.append("removeNotifDate");
        sb.append('=');
        sb.append(((this.removeNotifDate == null)?"<null>":this.removeNotifDate));
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
        result = ((result* 31)+((this.natnDesc == null)? 0 :this.natnDesc.hashCode()));
        result = ((result* 31)+((this.futureInd == null)? 0 :this.futureInd.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.removeNotifInd == null)? 0 :this.removeNotifInd.hashCode()));
        result = ((result* 31)+((this.irsReportStatus == null)? 0 :this.irsReportStatus.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.amount6 == null)? 0 :this.amount6 .hashCode()));
        result = ((result* 31)+((this.amount5 == null)? 0 :this.amount5 .hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.amount4 == null)? 0 :this.amount4 .hashCode()));
        result = ((result* 31)+((this.amount1 == null)? 0 :this.amount1 .hashCode()));
        result = ((result* 31)+((this.studNotifStatus == null)? 0 :this.studNotifStatus.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.studNotifDate == null)? 0 :this.studNotifDate.hashCode()));
        result = ((result* 31)+((this.halfTimeEnrlInd == null)? 0 :this.halfTimeEnrlInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.methodChanged == null)? 0 :this.methodChanged.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.irsReportDate == null)? 0 :this.irsReportDate.hashCode()));
        result = ((result* 31)+((this.gradStudInd == null)? 0 :this.gradStudInd.hashCode()));
        result = ((result* 31)+((this.addrLine3 == null)? 0 :this.addrLine3 .hashCode()));
        result = ((result* 31)+((this.addrLine2 == null)? 0 :this.addrLine2 .hashCode()));
        result = ((result* 31)+((this.addrLine1 == null)? 0 :this.addrLine1 .hashCode()));
        result = ((result* 31)+((this.ssnCertInd == null)? 0 :this.ssnCertInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.removeNotifDate == null)? 0 :this.removeNotifDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ttbtaxn) == false) {
            return false;
        }
        Ttbtaxn rhs = ((Ttbtaxn) other);
        return (((((((((((((((((((((((((((((((this.natnDesc == rhs.natnDesc)||((this.natnDesc!= null)&&this.natnDesc.equals(rhs.natnDesc)))&&((this.futureInd == rhs.futureInd)||((this.futureInd!= null)&&this.futureInd.equals(rhs.futureInd))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.removeNotifInd == rhs.removeNotifInd)||((this.removeNotifInd!= null)&&this.removeNotifInd.equals(rhs.removeNotifInd))))&&((this.irsReportStatus == rhs.irsReportStatus)||((this.irsReportStatus!= null)&&this.irsReportStatus.equals(rhs.irsReportStatus))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.amount6 == rhs.amount6)||((this.amount6 != null)&&this.amount6 .equals(rhs.amount6))))&&((this.amount5 == rhs.amount5)||((this.amount5 != null)&&this.amount5 .equals(rhs.amount5))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.amount4 == rhs.amount4)||((this.amount4 != null)&&this.amount4 .equals(rhs.amount4))))&&((this.amount1 == rhs.amount1)||((this.amount1 != null)&&this.amount1 .equals(rhs.amount1))))&&((this.studNotifStatus == rhs.studNotifStatus)||((this.studNotifStatus!= null)&&this.studNotifStatus.equals(rhs.studNotifStatus))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.studNotifDate == rhs.studNotifDate)||((this.studNotifDate!= null)&&this.studNotifDate.equals(rhs.studNotifDate))))&&((this.halfTimeEnrlInd == rhs.halfTimeEnrlInd)||((this.halfTimeEnrlInd!= null)&&this.halfTimeEnrlInd.equals(rhs.halfTimeEnrlInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.methodChanged == rhs.methodChanged)||((this.methodChanged!= null)&&this.methodChanged.equals(rhs.methodChanged))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.irsReportDate == rhs.irsReportDate)||((this.irsReportDate!= null)&&this.irsReportDate.equals(rhs.irsReportDate))))&&((this.gradStudInd == rhs.gradStudInd)||((this.gradStudInd!= null)&&this.gradStudInd.equals(rhs.gradStudInd))))&&((this.addrLine3 == rhs.addrLine3)||((this.addrLine3 != null)&&this.addrLine3 .equals(rhs.addrLine3))))&&((this.addrLine2 == rhs.addrLine2)||((this.addrLine2 != null)&&this.addrLine2 .equals(rhs.addrLine2))))&&((this.addrLine1 == rhs.addrLine1)||((this.addrLine1 != null)&&this.addrLine1 .equals(rhs.addrLine1))))&&((this.ssnCertInd == rhs.ssnCertInd)||((this.ssnCertInd!= null)&&this.ssnCertInd.equals(rhs.ssnCertInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.removeNotifDate == rhs.removeNotifDate)||((this.removeNotifDate!= null)&&this.removeNotifDate.equals(rhs.removeNotifDate))));
    }

}
