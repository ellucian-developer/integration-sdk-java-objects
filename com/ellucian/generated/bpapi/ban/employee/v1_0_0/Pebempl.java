
package com.ellucian.generated.bpapi.ban.employee.v1_0_0;

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
    "lreaDesc",
    "bcatCode",
    "internalFtPtInd",
    "ipedsSoftMoneyInd",
    "wkprCode",
    "lcatDesc",
    "ssnLastName",
    "distTitle",
    "etaxConsentUserId",
    "treaDesc",
    "campCode",
    "lastWorkDate",
    "1095txConsentUserId",
    "newHireInd",
    "homeTitle",
    "ssnFirstName",
    "stgrDesc",
    "jblnCode",
    "bcatDesc",
    "dicdDesc",
    "flsaInd",
    "1042RecipientCd",
    "egrpCode",
    "etaxConsentDate",
    "campDesc",
    "currentHireDate",
    "coasCodeHome",
    "eclsCode",
    "i9ExpireDate",
    "jblnDesc",
    "ew2ConsentUserId",
    "orgnCodeDist",
    "etaxConsentInd",
    "stgrCode",
    "collCode",
    "termDate",
    "ipedsMedDentalInd",
    "seniorityDate",
    "1095txConsentDate",
    "califPensionInd",
    "ssnMi",
    "emplStatus",
    "dicdCode",
    "daysInCanada",
    "nrsiCode",
    "i9Date",
    "loaBegDate",
    "activityDate",
    "loaEndDate",
    "collDesc",
    "revcodeDesc",
    "egrpDesc",
    "firstWorkDate",
    "i9FormInd",
    "ew2ConsentDate",
    "ipedsPrimaryFunction",
    "ew2ConsentInd",
    "lcatCode",
    "ssnSuffix",
    "adjServiceDate",
    "wkprDesc",
    "userId",
    "1095txConsentInd",
    "coasCodeDist",
    "eclsDesc",
    "firstHireDate",
    "treaCode",
    "lreaCode",
    "orgnCodeHome"
})
@Generated("jsonschema2pojo")
public class Pebempl {

    @JsonProperty("lreaDesc")
    private String lreaDesc;
    /**
     * Benefit Category
     * <p>
     * Lineage reference object : PEBEMPL_BCAT_CODE, Lookup lineage reference object : ptrecbc,ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("bcatCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_BCAT_CODE, Lookup lineage reference object : ptrecbc,ptrbcat")
    private String bcatCode;
    /**
     * Part or Full Time Status
     * <p>
     * Lineage reference object : PEBEMPL_INTERNAL_FT_PT_IND
     * (Required)
     * 
     */
    @JsonProperty("internalFtPtInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_INTERNAL_FT_PT_IND")
    private String internalFtPtInd;
    /**
     * IPEDS reporting - employee paid with Soft Money
     * <p>
     * Lineage reference object : PEBEMPL_IPEDS_SOFT_MONEY_IND
     * 
     */
    @JsonProperty("ipedsSoftMoneyInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_IPEDS_SOFT_MONEY_IND")
    private String ipedsSoftMoneyInd;
    /**
     * Work Period
     * <p>
     * Lineage reference object : PEBEMPL_WKPR_CODE, Lookup lineage reference object : ptrwkpr
     * 
     */
    @JsonProperty("wkprCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_WKPR_CODE, Lookup lineage reference object : ptrwkpr")
    private String wkprCode;
    @JsonProperty("lcatDesc")
    private String lcatDesc;
    /**
     * Last
     * <p>
     * Lineage reference object : PEBEMPL_SSN_LAST_NAME
     * 
     */
    @JsonProperty("ssnLastName")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_SSN_LAST_NAME")
    private String ssnLastName;
    @JsonProperty("distTitle")
    private String distTitle;
    /**
     * Updated By
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_USER_ID
     * 
     */
    @JsonProperty("etaxConsentUserId")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ETAX_CONSENT_USER_ID")
    private String etaxConsentUserId;
    @JsonProperty("treaDesc")
    private String treaDesc;
    /**
     * Campus
     * <p>
     * Lineage reference object : PEBEMPL_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String campCode;
    /**
     * Last Work Date
     * <p>
     * Lineage reference object : PEBEMPL_LAST_WORK_DATE
     * 
     */
    @JsonProperty("lastWorkDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LAST_WORK_DATE")
    private Date lastWorkDate;
    /**
     * Updated By
     * <p>
     * Lineage reference object : PEBEMPL_1095TX_CONSENT_USER_ID
     * 
     */
    @JsonProperty("1095txConsentUserId")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_1095TX_CONSENT_USER_ID")
    private String _1095txConsentUserId;
    /**
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : PEBEMPL_NEW_HIRE_IND
     * 
     */
    @JsonProperty("newHireInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_NEW_HIRE_IND")
    private String newHireInd;
    @JsonProperty("homeTitle")
    private String homeTitle;
    /**
     * First
     * <p>
     * Lineage reference object : PEBEMPL_SSN_FIRST_NAME
     * 
     */
    @JsonProperty("ssnFirstName")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_SSN_FIRST_NAME")
    private String ssnFirstName;
    @JsonProperty("stgrDesc")
    private String stgrDesc;
    /**
     * Location
     * <p>
     * Lineage reference object : PEBEMPL_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_JBLN_CODE")
    private String jblnCode;
    @JsonProperty("bcatDesc")
    private String bcatDesc;
    @JsonProperty("dicdDesc")
    private String dicdDesc;
    /**
     * FLSA Indicator
     * <p>
     * Lineage reference object : PEBEMPL_FLSA_IND
     * (Required)
     * 
     */
    @JsonProperty("flsaInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_FLSA_IND")
    private String flsaInd;
    /**
     *  1042S Recipient
     * <p>
     * Lineage reference object : PEBEMPL_1042_RECIPIENT_CD
     * 
     */
    @JsonProperty("1042RecipientCd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_1042_RECIPIENT_CD")
    private String _1042RecipientCd;
    /**
     * Employee Group
     * <p>
     * Lineage reference object : PEBEMPL_EGRP_CODE, Lookup lineage reference object : ptvegrp
     * 
     */
    @JsonProperty("egrpCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_EGRP_CODE, Lookup lineage reference object : ptvegrp")
    private String egrpCode;
    /**
     * Capture Date
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_DATE
     * 
     */
    @JsonProperty("etaxConsentDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ETAX_CONSENT_DATE")
    private Date etaxConsentDate;
    @JsonProperty("campDesc")
    private String campDesc;
    /**
     * Current Hire
     * <p>
     * Lineage reference object : PEBEMPL_CURRENT_HIRE_DATE
     * (Required)
     * 
     */
    @JsonProperty("currentHireDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_CURRENT_HIRE_DATE")
    private Date currentHireDate;
    /**
     * Home Department
     * <p>
     * Lineage reference object : PEBEMPL_COAS_CODE_HOME
     * (Required)
     * 
     */
    @JsonProperty("coasCodeHome")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_COAS_CODE_HOME")
    private String coasCodeHome;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : PEBEMPL_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ECLS_CODE")
    private String eclsCode;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PEBEMPL_I9_EXPIRE_DATE
     * 
     */
    @JsonProperty("i9ExpireDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_I9_EXPIRE_DATE")
    private Date i9ExpireDate;
    @JsonProperty("jblnDesc")
    private String jblnDesc;
    /**
     * Updated By
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_USER_ID
     * 
     */
    @JsonProperty("ew2ConsentUserId")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_EW2_CONSENT_USER_ID")
    private String ew2ConsentUserId;
    /**
     * Lineage reference object : PEBEMPL_ORGN_CODE_DIST
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeDist")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ORGN_CODE_DIST")
    private String orgnCodeDist;
    /**
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_IND
     * 
     */
    @JsonProperty("etaxConsentInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ETAX_CONSENT_IND")
    private String etaxConsentInd;
    /**
     * Grouping
     * <p>
     * Lineage reference object : PEBEMPL_STGR_CODE, Lookup lineage reference object : ptvstgr
     * 
     */
    @JsonProperty("stgrCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_STGR_CODE, Lookup lineage reference object : ptvstgr")
    private String stgrCode;
    /**
     * College
     * <p>
     * Lineage reference object : PEBEMPL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : PEBEMPL_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_TERM_DATE")
    private Date termDate;
    /**
     * IPEDS Medical or Dental Reporting
     * <p>
     * Lineage reference object : PEBEMPL_IPEDS_MED_DENTAL_IND
     * 
     */
    @JsonProperty("ipedsMedDentalInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_IPEDS_MED_DENTAL_IND")
    private String ipedsMedDentalInd;
    /**
     * Seniority
     * <p>
     * Lineage reference object : PEBEMPL_SENIORITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("seniorityDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_SENIORITY_DATE")
    private Date seniorityDate;
    /**
     * Capture Date
     * <p>
     * Lineage reference object : PEBEMPL_1095TX_CONSENT_DATE
     * 
     */
    @JsonProperty("1095txConsentDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_1095TX_CONSENT_DATE")
    private Date _1095txConsentDate;
    /**
     * Current Membership Status
     * <p>
     * Lineage reference object : PEBEMPL_CALIF_PENSION_IND
     * 
     */
    @JsonProperty("califPensionInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_CALIF_PENSION_IND")
    private String califPensionInd;
    /**
     * Middle
     * <p>
     * Lineage reference object : PEBEMPL_SSN_MI
     * 
     */
    @JsonProperty("ssnMi")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_SSN_MI")
    private String ssnMi;
    /**
     * Employee Status
     * <p>
     * Lineage reference object : PEBEMPL_EMPL_STATUS
     * (Required)
     * 
     */
    @JsonProperty("emplStatus")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_EMPL_STATUS")
    private String emplStatus;
    /**
     * District or Division
     * <p>
     * Lineage reference object : PEBEMPL_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_DICD_CODE, Lookup lineage reference object : gtvdicd")
    private String dicdCode;
    /**
     * Days in Canada
     * <p>
     * Lineage reference object : PEBEMPL_DAYS_IN_CANADA
     * 
     */
    @JsonProperty("daysInCanada")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_DAYS_IN_CANADA")
    private Double daysInCanada;
    /**
     * Service Industry
     * <p>
     * Lineage reference object : PEBEMPL_NRSI_CODE, Lookup lineage reference object : ptvnrsi
     * 
     */
    @JsonProperty("nrsiCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_NRSI_CODE, Lookup lineage reference object : ptvnrsi")
    private String nrsiCode;
    /**
     * Date
     * <p>
     * Lineage reference object : PEBEMPL_I9_DATE
     * 
     */
    @JsonProperty("i9Date")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_I9_DATE")
    private Date i9Date;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LOA_BEG_DATE")
    private Date loaBegDate;
    /**
     * Lineage reference object : PEBEMPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_END_DATE
     * 
     */
    @JsonProperty("loaEndDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LOA_END_DATE")
    private Date loaEndDate;
    @JsonProperty("collDesc")
    private String collDesc;
    @JsonProperty("revcodeDesc")
    private String revcodeDesc;
    @JsonProperty("egrpDesc")
    private String egrpDesc;
    /**
     * First Work Date
     * <p>
     * Lineage reference object : PEBEMPL_FIRST_WORK_DATE
     * 
     */
    @JsonProperty("firstWorkDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_FIRST_WORK_DATE")
    private Date firstWorkDate;
    /**
     * Form Indicator
     * <p>
     * Lineage reference object : PEBEMPL_I9_FORM_IND
     * 
     */
    @JsonProperty("i9FormInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_I9_FORM_IND")
    private String i9FormInd;
    /**
     * Capture Date
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_DATE
     * 
     */
    @JsonProperty("ew2ConsentDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_EW2_CONSENT_DATE")
    private Date ew2ConsentDate;
    /**
     * IPEDS Primary Function
     * <p>
     * Lineage reference object : PEBEMPL_IPEDS_PRIMARY_FUNCTION
     * (Required)
     * 
     */
    @JsonProperty("ipedsPrimaryFunction")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_IPEDS_PRIMARY_FUNCTION")
    private String ipedsPrimaryFunction;
    /**
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_IND
     * 
     */
    @JsonProperty("ew2ConsentInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_EW2_CONSENT_IND")
    private String ew2ConsentInd;
    /**
     * Leave Category
     * <p>
     * Lineage reference object : PEBEMPL_LCAT_CODE, Lookup lineage reference object : ptreclc,ptvlcat
     * (Required)
     * 
     */
    @JsonProperty("lcatCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LCAT_CODE, Lookup lineage reference object : ptreclc,ptvlcat")
    private String lcatCode;
    /**
     * Suffix
     * <p>
     * Lineage reference object : PEBEMPL_SSN_SUFFIX
     * 
     */
    @JsonProperty("ssnSuffix")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_SSN_SUFFIX")
    private String ssnSuffix;
    /**
     * Adjusted Service
     * <p>
     * Lineage reference object : PEBEMPL_ADJ_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("adjServiceDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ADJ_SERVICE_DATE")
    private Date adjServiceDate;
    @JsonProperty("wkprDesc")
    private String wkprDesc;
    /**
     * Lineage reference object : PEBEMPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_USER_ID")
    private String userId;
    /**
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_1095TX_CONSENT_IND
     * 
     */
    @JsonProperty("1095txConsentInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_1095TX_CONSENT_IND")
    private String _1095txConsentInd;
    /**
     * Check Distribution
     * <p>
     * Lineage reference object : PEBEMPL_COAS_CODE_DIST
     * (Required)
     * 
     */
    @JsonProperty("coasCodeDist")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_COAS_CODE_DIST")
    private String coasCodeDist;
    @JsonProperty("eclsDesc")
    private String eclsDesc;
    /**
     * Original Hire
     * <p>
     * Lineage reference object : PEBEMPL_FIRST_HIRE_DATE
     * (Required)
     * 
     */
    @JsonProperty("firstHireDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_FIRST_HIRE_DATE")
    private Date firstHireDate;
    /**
     * Reason
     * <p>
     * Lineage reference object : PEBEMPL_TREA_CODE
     * 
     */
    @JsonProperty("treaCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_TREA_CODE")
    private String treaCode;
    /**
     * Reason
     * <p>
     * Lineage reference object : PEBEMPL_LREA_CODE
     * 
     */
    @JsonProperty("lreaCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LREA_CODE")
    private String lreaCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : PEBEMPL_ORGN_CODE_HOME
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeHome")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ORGN_CODE_HOME")
    private String orgnCodeHome;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lreaDesc")
    public String getLreaDesc() {
        return lreaDesc;
    }

    @JsonProperty("lreaDesc")
    public void setLreaDesc(String lreaDesc) {
        this.lreaDesc = lreaDesc;
    }

    public Pebempl withLreaDesc(String lreaDesc) {
        this.lreaDesc = lreaDesc;
        return this;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : PEBEMPL_BCAT_CODE, Lookup lineage reference object : ptrecbc,ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("bcatCode")
    public String getBcatCode() {
        return bcatCode;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : PEBEMPL_BCAT_CODE, Lookup lineage reference object : ptrecbc,ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("bcatCode")
    public void setBcatCode(String bcatCode) {
        this.bcatCode = bcatCode;
    }

    public Pebempl withBcatCode(String bcatCode) {
        this.bcatCode = bcatCode;
        return this;
    }

    /**
     * Part or Full Time Status
     * <p>
     * Lineage reference object : PEBEMPL_INTERNAL_FT_PT_IND
     * (Required)
     * 
     */
    @JsonProperty("internalFtPtInd")
    public String getInternalFtPtInd() {
        return internalFtPtInd;
    }

    /**
     * Part or Full Time Status
     * <p>
     * Lineage reference object : PEBEMPL_INTERNAL_FT_PT_IND
     * (Required)
     * 
     */
    @JsonProperty("internalFtPtInd")
    public void setInternalFtPtInd(String internalFtPtInd) {
        this.internalFtPtInd = internalFtPtInd;
    }

    public Pebempl withInternalFtPtInd(String internalFtPtInd) {
        this.internalFtPtInd = internalFtPtInd;
        return this;
    }

    /**
     * IPEDS reporting - employee paid with Soft Money
     * <p>
     * Lineage reference object : PEBEMPL_IPEDS_SOFT_MONEY_IND
     * 
     */
    @JsonProperty("ipedsSoftMoneyInd")
    public String getIpedsSoftMoneyInd() {
        return ipedsSoftMoneyInd;
    }

    /**
     * IPEDS reporting - employee paid with Soft Money
     * <p>
     * Lineage reference object : PEBEMPL_IPEDS_SOFT_MONEY_IND
     * 
     */
    @JsonProperty("ipedsSoftMoneyInd")
    public void setIpedsSoftMoneyInd(String ipedsSoftMoneyInd) {
        this.ipedsSoftMoneyInd = ipedsSoftMoneyInd;
    }

    public Pebempl withIpedsSoftMoneyInd(String ipedsSoftMoneyInd) {
        this.ipedsSoftMoneyInd = ipedsSoftMoneyInd;
        return this;
    }

    /**
     * Work Period
     * <p>
     * Lineage reference object : PEBEMPL_WKPR_CODE, Lookup lineage reference object : ptrwkpr
     * 
     */
    @JsonProperty("wkprCode")
    public String getWkprCode() {
        return wkprCode;
    }

    /**
     * Work Period
     * <p>
     * Lineage reference object : PEBEMPL_WKPR_CODE, Lookup lineage reference object : ptrwkpr
     * 
     */
    @JsonProperty("wkprCode")
    public void setWkprCode(String wkprCode) {
        this.wkprCode = wkprCode;
    }

    public Pebempl withWkprCode(String wkprCode) {
        this.wkprCode = wkprCode;
        return this;
    }

    @JsonProperty("lcatDesc")
    public String getLcatDesc() {
        return lcatDesc;
    }

    @JsonProperty("lcatDesc")
    public void setLcatDesc(String lcatDesc) {
        this.lcatDesc = lcatDesc;
    }

    public Pebempl withLcatDesc(String lcatDesc) {
        this.lcatDesc = lcatDesc;
        return this;
    }

    /**
     * Last
     * <p>
     * Lineage reference object : PEBEMPL_SSN_LAST_NAME
     * 
     */
    @JsonProperty("ssnLastName")
    public String getSsnLastName() {
        return ssnLastName;
    }

    /**
     * Last
     * <p>
     * Lineage reference object : PEBEMPL_SSN_LAST_NAME
     * 
     */
    @JsonProperty("ssnLastName")
    public void setSsnLastName(String ssnLastName) {
        this.ssnLastName = ssnLastName;
    }

    public Pebempl withSsnLastName(String ssnLastName) {
        this.ssnLastName = ssnLastName;
        return this;
    }

    @JsonProperty("distTitle")
    public String getDistTitle() {
        return distTitle;
    }

    @JsonProperty("distTitle")
    public void setDistTitle(String distTitle) {
        this.distTitle = distTitle;
    }

    public Pebempl withDistTitle(String distTitle) {
        this.distTitle = distTitle;
        return this;
    }

    /**
     * Updated By
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_USER_ID
     * 
     */
    @JsonProperty("etaxConsentUserId")
    public String getEtaxConsentUserId() {
        return etaxConsentUserId;
    }

    /**
     * Updated By
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_USER_ID
     * 
     */
    @JsonProperty("etaxConsentUserId")
    public void setEtaxConsentUserId(String etaxConsentUserId) {
        this.etaxConsentUserId = etaxConsentUserId;
    }

    public Pebempl withEtaxConsentUserId(String etaxConsentUserId) {
        this.etaxConsentUserId = etaxConsentUserId;
        return this;
    }

    @JsonProperty("treaDesc")
    public String getTreaDesc() {
        return treaDesc;
    }

    @JsonProperty("treaDesc")
    public void setTreaDesc(String treaDesc) {
        this.treaDesc = treaDesc;
    }

    public Pebempl withTreaDesc(String treaDesc) {
        this.treaDesc = treaDesc;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : PEBEMPL_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : PEBEMPL_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public Pebempl withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * Last Work Date
     * <p>
     * Lineage reference object : PEBEMPL_LAST_WORK_DATE
     * 
     */
    @JsonProperty("lastWorkDate")
    public Date getLastWorkDate() {
        return lastWorkDate;
    }

    /**
     * Last Work Date
     * <p>
     * Lineage reference object : PEBEMPL_LAST_WORK_DATE
     * 
     */
    @JsonProperty("lastWorkDate")
    public void setLastWorkDate(Date lastWorkDate) {
        this.lastWorkDate = lastWorkDate;
    }

    public Pebempl withLastWorkDate(Date lastWorkDate) {
        this.lastWorkDate = lastWorkDate;
        return this;
    }

    /**
     * Updated By
     * <p>
     * Lineage reference object : PEBEMPL_1095TX_CONSENT_USER_ID
     * 
     */
    @JsonProperty("1095txConsentUserId")
    public String get1095txConsentUserId() {
        return _1095txConsentUserId;
    }

    /**
     * Updated By
     * <p>
     * Lineage reference object : PEBEMPL_1095TX_CONSENT_USER_ID
     * 
     */
    @JsonProperty("1095txConsentUserId")
    public void set1095txConsentUserId(String _1095txConsentUserId) {
        this._1095txConsentUserId = _1095txConsentUserId;
    }

    public Pebempl with1095txConsentUserId(String _1095txConsentUserId) {
        this._1095txConsentUserId = _1095txConsentUserId;
        return this;
    }

    /**
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : PEBEMPL_NEW_HIRE_IND
     * 
     */
    @JsonProperty("newHireInd")
    public String getNewHireInd() {
        return newHireInd;
    }

    /**
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : PEBEMPL_NEW_HIRE_IND
     * 
     */
    @JsonProperty("newHireInd")
    public void setNewHireInd(String newHireInd) {
        this.newHireInd = newHireInd;
    }

    public Pebempl withNewHireInd(String newHireInd) {
        this.newHireInd = newHireInd;
        return this;
    }

    @JsonProperty("homeTitle")
    public String getHomeTitle() {
        return homeTitle;
    }

    @JsonProperty("homeTitle")
    public void setHomeTitle(String homeTitle) {
        this.homeTitle = homeTitle;
    }

    public Pebempl withHomeTitle(String homeTitle) {
        this.homeTitle = homeTitle;
        return this;
    }

    /**
     * First
     * <p>
     * Lineage reference object : PEBEMPL_SSN_FIRST_NAME
     * 
     */
    @JsonProperty("ssnFirstName")
    public String getSsnFirstName() {
        return ssnFirstName;
    }

    /**
     * First
     * <p>
     * Lineage reference object : PEBEMPL_SSN_FIRST_NAME
     * 
     */
    @JsonProperty("ssnFirstName")
    public void setSsnFirstName(String ssnFirstName) {
        this.ssnFirstName = ssnFirstName;
    }

    public Pebempl withSsnFirstName(String ssnFirstName) {
        this.ssnFirstName = ssnFirstName;
        return this;
    }

    @JsonProperty("stgrDesc")
    public String getStgrDesc() {
        return stgrDesc;
    }

    @JsonProperty("stgrDesc")
    public void setStgrDesc(String stgrDesc) {
        this.stgrDesc = stgrDesc;
    }

    public Pebempl withStgrDesc(String stgrDesc) {
        this.stgrDesc = stgrDesc;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : PEBEMPL_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public String getJblnCode() {
        return jblnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : PEBEMPL_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public void setJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
    }

    public Pebempl withJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
        return this;
    }

    @JsonProperty("bcatDesc")
    public String getBcatDesc() {
        return bcatDesc;
    }

    @JsonProperty("bcatDesc")
    public void setBcatDesc(String bcatDesc) {
        this.bcatDesc = bcatDesc;
    }

    public Pebempl withBcatDesc(String bcatDesc) {
        this.bcatDesc = bcatDesc;
        return this;
    }

    @JsonProperty("dicdDesc")
    public String getDicdDesc() {
        return dicdDesc;
    }

    @JsonProperty("dicdDesc")
    public void setDicdDesc(String dicdDesc) {
        this.dicdDesc = dicdDesc;
    }

    public Pebempl withDicdDesc(String dicdDesc) {
        this.dicdDesc = dicdDesc;
        return this;
    }

    /**
     * FLSA Indicator
     * <p>
     * Lineage reference object : PEBEMPL_FLSA_IND
     * (Required)
     * 
     */
    @JsonProperty("flsaInd")
    public String getFlsaInd() {
        return flsaInd;
    }

    /**
     * FLSA Indicator
     * <p>
     * Lineage reference object : PEBEMPL_FLSA_IND
     * (Required)
     * 
     */
    @JsonProperty("flsaInd")
    public void setFlsaInd(String flsaInd) {
        this.flsaInd = flsaInd;
    }

    public Pebempl withFlsaInd(String flsaInd) {
        this.flsaInd = flsaInd;
        return this;
    }

    /**
     *  1042S Recipient
     * <p>
     * Lineage reference object : PEBEMPL_1042_RECIPIENT_CD
     * 
     */
    @JsonProperty("1042RecipientCd")
    public String get1042RecipientCd() {
        return _1042RecipientCd;
    }

    /**
     *  1042S Recipient
     * <p>
     * Lineage reference object : PEBEMPL_1042_RECIPIENT_CD
     * 
     */
    @JsonProperty("1042RecipientCd")
    public void set1042RecipientCd(String _1042RecipientCd) {
        this._1042RecipientCd = _1042RecipientCd;
    }

    public Pebempl with1042RecipientCd(String _1042RecipientCd) {
        this._1042RecipientCd = _1042RecipientCd;
        return this;
    }

    /**
     * Employee Group
     * <p>
     * Lineage reference object : PEBEMPL_EGRP_CODE, Lookup lineage reference object : ptvegrp
     * 
     */
    @JsonProperty("egrpCode")
    public String getEgrpCode() {
        return egrpCode;
    }

    /**
     * Employee Group
     * <p>
     * Lineage reference object : PEBEMPL_EGRP_CODE, Lookup lineage reference object : ptvegrp
     * 
     */
    @JsonProperty("egrpCode")
    public void setEgrpCode(String egrpCode) {
        this.egrpCode = egrpCode;
    }

    public Pebempl withEgrpCode(String egrpCode) {
        this.egrpCode = egrpCode;
        return this;
    }

    /**
     * Capture Date
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_DATE
     * 
     */
    @JsonProperty("etaxConsentDate")
    public Date getEtaxConsentDate() {
        return etaxConsentDate;
    }

    /**
     * Capture Date
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_DATE
     * 
     */
    @JsonProperty("etaxConsentDate")
    public void setEtaxConsentDate(Date etaxConsentDate) {
        this.etaxConsentDate = etaxConsentDate;
    }

    public Pebempl withEtaxConsentDate(Date etaxConsentDate) {
        this.etaxConsentDate = etaxConsentDate;
        return this;
    }

    @JsonProperty("campDesc")
    public String getCampDesc() {
        return campDesc;
    }

    @JsonProperty("campDesc")
    public void setCampDesc(String campDesc) {
        this.campDesc = campDesc;
    }

    public Pebempl withCampDesc(String campDesc) {
        this.campDesc = campDesc;
        return this;
    }

    /**
     * Current Hire
     * <p>
     * Lineage reference object : PEBEMPL_CURRENT_HIRE_DATE
     * (Required)
     * 
     */
    @JsonProperty("currentHireDate")
    public Date getCurrentHireDate() {
        return currentHireDate;
    }

    /**
     * Current Hire
     * <p>
     * Lineage reference object : PEBEMPL_CURRENT_HIRE_DATE
     * (Required)
     * 
     */
    @JsonProperty("currentHireDate")
    public void setCurrentHireDate(Date currentHireDate) {
        this.currentHireDate = currentHireDate;
    }

    public Pebempl withCurrentHireDate(Date currentHireDate) {
        this.currentHireDate = currentHireDate;
        return this;
    }

    /**
     * Home Department
     * <p>
     * Lineage reference object : PEBEMPL_COAS_CODE_HOME
     * (Required)
     * 
     */
    @JsonProperty("coasCodeHome")
    public String getCoasCodeHome() {
        return coasCodeHome;
    }

    /**
     * Home Department
     * <p>
     * Lineage reference object : PEBEMPL_COAS_CODE_HOME
     * (Required)
     * 
     */
    @JsonProperty("coasCodeHome")
    public void setCoasCodeHome(String coasCodeHome) {
        this.coasCodeHome = coasCodeHome;
    }

    public Pebempl withCoasCodeHome(String coasCodeHome) {
        this.coasCodeHome = coasCodeHome;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : PEBEMPL_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    public String getEclsCode() {
        return eclsCode;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : PEBEMPL_ECLS_CODE
     * (Required)
     * 
     */
    @JsonProperty("eclsCode")
    public void setEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
    }

    public Pebempl withEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PEBEMPL_I9_EXPIRE_DATE
     * 
     */
    @JsonProperty("i9ExpireDate")
    public Date getI9ExpireDate() {
        return i9ExpireDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PEBEMPL_I9_EXPIRE_DATE
     * 
     */
    @JsonProperty("i9ExpireDate")
    public void setI9ExpireDate(Date i9ExpireDate) {
        this.i9ExpireDate = i9ExpireDate;
    }

    public Pebempl withI9ExpireDate(Date i9ExpireDate) {
        this.i9ExpireDate = i9ExpireDate;
        return this;
    }

    @JsonProperty("jblnDesc")
    public String getJblnDesc() {
        return jblnDesc;
    }

    @JsonProperty("jblnDesc")
    public void setJblnDesc(String jblnDesc) {
        this.jblnDesc = jblnDesc;
    }

    public Pebempl withJblnDesc(String jblnDesc) {
        this.jblnDesc = jblnDesc;
        return this;
    }

    /**
     * Updated By
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_USER_ID
     * 
     */
    @JsonProperty("ew2ConsentUserId")
    public String getEw2ConsentUserId() {
        return ew2ConsentUserId;
    }

    /**
     * Updated By
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_USER_ID
     * 
     */
    @JsonProperty("ew2ConsentUserId")
    public void setEw2ConsentUserId(String ew2ConsentUserId) {
        this.ew2ConsentUserId = ew2ConsentUserId;
    }

    public Pebempl withEw2ConsentUserId(String ew2ConsentUserId) {
        this.ew2ConsentUserId = ew2ConsentUserId;
        return this;
    }

    /**
     * Lineage reference object : PEBEMPL_ORGN_CODE_DIST
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeDist")
    public String getOrgnCodeDist() {
        return orgnCodeDist;
    }

    /**
     * Lineage reference object : PEBEMPL_ORGN_CODE_DIST
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeDist")
    public void setOrgnCodeDist(String orgnCodeDist) {
        this.orgnCodeDist = orgnCodeDist;
    }

    public Pebempl withOrgnCodeDist(String orgnCodeDist) {
        this.orgnCodeDist = orgnCodeDist;
        return this;
    }

    /**
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_IND
     * 
     */
    @JsonProperty("etaxConsentInd")
    public String getEtaxConsentInd() {
        return etaxConsentInd;
    }

    /**
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_IND
     * 
     */
    @JsonProperty("etaxConsentInd")
    public void setEtaxConsentInd(String etaxConsentInd) {
        this.etaxConsentInd = etaxConsentInd;
    }

    public Pebempl withEtaxConsentInd(String etaxConsentInd) {
        this.etaxConsentInd = etaxConsentInd;
        return this;
    }

    /**
     * Grouping
     * <p>
     * Lineage reference object : PEBEMPL_STGR_CODE, Lookup lineage reference object : ptvstgr
     * 
     */
    @JsonProperty("stgrCode")
    public String getStgrCode() {
        return stgrCode;
    }

    /**
     * Grouping
     * <p>
     * Lineage reference object : PEBEMPL_STGR_CODE, Lookup lineage reference object : ptvstgr
     * 
     */
    @JsonProperty("stgrCode")
    public void setStgrCode(String stgrCode) {
        this.stgrCode = stgrCode;
    }

    public Pebempl withStgrCode(String stgrCode) {
        this.stgrCode = stgrCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : PEBEMPL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : PEBEMPL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public Pebempl withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : PEBEMPL_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : PEBEMPL_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public Pebempl withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * IPEDS Medical or Dental Reporting
     * <p>
     * Lineage reference object : PEBEMPL_IPEDS_MED_DENTAL_IND
     * 
     */
    @JsonProperty("ipedsMedDentalInd")
    public String getIpedsMedDentalInd() {
        return ipedsMedDentalInd;
    }

    /**
     * IPEDS Medical or Dental Reporting
     * <p>
     * Lineage reference object : PEBEMPL_IPEDS_MED_DENTAL_IND
     * 
     */
    @JsonProperty("ipedsMedDentalInd")
    public void setIpedsMedDentalInd(String ipedsMedDentalInd) {
        this.ipedsMedDentalInd = ipedsMedDentalInd;
    }

    public Pebempl withIpedsMedDentalInd(String ipedsMedDentalInd) {
        this.ipedsMedDentalInd = ipedsMedDentalInd;
        return this;
    }

    /**
     * Seniority
     * <p>
     * Lineage reference object : PEBEMPL_SENIORITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("seniorityDate")
    public Date getSeniorityDate() {
        return seniorityDate;
    }

    /**
     * Seniority
     * <p>
     * Lineage reference object : PEBEMPL_SENIORITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("seniorityDate")
    public void setSeniorityDate(Date seniorityDate) {
        this.seniorityDate = seniorityDate;
    }

    public Pebempl withSeniorityDate(Date seniorityDate) {
        this.seniorityDate = seniorityDate;
        return this;
    }

    /**
     * Capture Date
     * <p>
     * Lineage reference object : PEBEMPL_1095TX_CONSENT_DATE
     * 
     */
    @JsonProperty("1095txConsentDate")
    public Date get1095txConsentDate() {
        return _1095txConsentDate;
    }

    /**
     * Capture Date
     * <p>
     * Lineage reference object : PEBEMPL_1095TX_CONSENT_DATE
     * 
     */
    @JsonProperty("1095txConsentDate")
    public void set1095txConsentDate(Date _1095txConsentDate) {
        this._1095txConsentDate = _1095txConsentDate;
    }

    public Pebempl with1095txConsentDate(Date _1095txConsentDate) {
        this._1095txConsentDate = _1095txConsentDate;
        return this;
    }

    /**
     * Current Membership Status
     * <p>
     * Lineage reference object : PEBEMPL_CALIF_PENSION_IND
     * 
     */
    @JsonProperty("califPensionInd")
    public String getCalifPensionInd() {
        return califPensionInd;
    }

    /**
     * Current Membership Status
     * <p>
     * Lineage reference object : PEBEMPL_CALIF_PENSION_IND
     * 
     */
    @JsonProperty("califPensionInd")
    public void setCalifPensionInd(String califPensionInd) {
        this.califPensionInd = califPensionInd;
    }

    public Pebempl withCalifPensionInd(String califPensionInd) {
        this.califPensionInd = califPensionInd;
        return this;
    }

    /**
     * Middle
     * <p>
     * Lineage reference object : PEBEMPL_SSN_MI
     * 
     */
    @JsonProperty("ssnMi")
    public String getSsnMi() {
        return ssnMi;
    }

    /**
     * Middle
     * <p>
     * Lineage reference object : PEBEMPL_SSN_MI
     * 
     */
    @JsonProperty("ssnMi")
    public void setSsnMi(String ssnMi) {
        this.ssnMi = ssnMi;
    }

    public Pebempl withSsnMi(String ssnMi) {
        this.ssnMi = ssnMi;
        return this;
    }

    /**
     * Employee Status
     * <p>
     * Lineage reference object : PEBEMPL_EMPL_STATUS
     * (Required)
     * 
     */
    @JsonProperty("emplStatus")
    public String getEmplStatus() {
        return emplStatus;
    }

    /**
     * Employee Status
     * <p>
     * Lineage reference object : PEBEMPL_EMPL_STATUS
     * (Required)
     * 
     */
    @JsonProperty("emplStatus")
    public void setEmplStatus(String emplStatus) {
        this.emplStatus = emplStatus;
    }

    public Pebempl withEmplStatus(String emplStatus) {
        this.emplStatus = emplStatus;
        return this;
    }

    /**
     * District or Division
     * <p>
     * Lineage reference object : PEBEMPL_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public String getDicdCode() {
        return dicdCode;
    }

    /**
     * District or Division
     * <p>
     * Lineage reference object : PEBEMPL_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    public void setDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
    }

    public Pebempl withDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
        return this;
    }

    /**
     * Days in Canada
     * <p>
     * Lineage reference object : PEBEMPL_DAYS_IN_CANADA
     * 
     */
    @JsonProperty("daysInCanada")
    public Double getDaysInCanada() {
        return daysInCanada;
    }

    /**
     * Days in Canada
     * <p>
     * Lineage reference object : PEBEMPL_DAYS_IN_CANADA
     * 
     */
    @JsonProperty("daysInCanada")
    public void setDaysInCanada(Double daysInCanada) {
        this.daysInCanada = daysInCanada;
    }

    public Pebempl withDaysInCanada(Double daysInCanada) {
        this.daysInCanada = daysInCanada;
        return this;
    }

    /**
     * Service Industry
     * <p>
     * Lineage reference object : PEBEMPL_NRSI_CODE, Lookup lineage reference object : ptvnrsi
     * 
     */
    @JsonProperty("nrsiCode")
    public String getNrsiCode() {
        return nrsiCode;
    }

    /**
     * Service Industry
     * <p>
     * Lineage reference object : PEBEMPL_NRSI_CODE, Lookup lineage reference object : ptvnrsi
     * 
     */
    @JsonProperty("nrsiCode")
    public void setNrsiCode(String nrsiCode) {
        this.nrsiCode = nrsiCode;
    }

    public Pebempl withNrsiCode(String nrsiCode) {
        this.nrsiCode = nrsiCode;
        return this;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : PEBEMPL_I9_DATE
     * 
     */
    @JsonProperty("i9Date")
    public Date getI9Date() {
        return i9Date;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : PEBEMPL_I9_DATE
     * 
     */
    @JsonProperty("i9Date")
    public void setI9Date(Date i9Date) {
        this.i9Date = i9Date;
    }

    public Pebempl withI9Date(Date i9Date) {
        this.i9Date = i9Date;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    public Date getLoaBegDate() {
        return loaBegDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    public void setLoaBegDate(Date loaBegDate) {
        this.loaBegDate = loaBegDate;
    }

    public Pebempl withLoaBegDate(Date loaBegDate) {
        this.loaBegDate = loaBegDate;
        return this;
    }

    /**
     * Lineage reference object : PEBEMPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PEBEMPL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Pebempl withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_END_DATE
     * 
     */
    @JsonProperty("loaEndDate")
    public Date getLoaEndDate() {
        return loaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_END_DATE
     * 
     */
    @JsonProperty("loaEndDate")
    public void setLoaEndDate(Date loaEndDate) {
        this.loaEndDate = loaEndDate;
    }

    public Pebempl withLoaEndDate(Date loaEndDate) {
        this.loaEndDate = loaEndDate;
        return this;
    }

    @JsonProperty("collDesc")
    public String getCollDesc() {
        return collDesc;
    }

    @JsonProperty("collDesc")
    public void setCollDesc(String collDesc) {
        this.collDesc = collDesc;
    }

    public Pebempl withCollDesc(String collDesc) {
        this.collDesc = collDesc;
        return this;
    }

    @JsonProperty("revcodeDesc")
    public String getRevcodeDesc() {
        return revcodeDesc;
    }

    @JsonProperty("revcodeDesc")
    public void setRevcodeDesc(String revcodeDesc) {
        this.revcodeDesc = revcodeDesc;
    }

    public Pebempl withRevcodeDesc(String revcodeDesc) {
        this.revcodeDesc = revcodeDesc;
        return this;
    }

    @JsonProperty("egrpDesc")
    public String getEgrpDesc() {
        return egrpDesc;
    }

    @JsonProperty("egrpDesc")
    public void setEgrpDesc(String egrpDesc) {
        this.egrpDesc = egrpDesc;
    }

    public Pebempl withEgrpDesc(String egrpDesc) {
        this.egrpDesc = egrpDesc;
        return this;
    }

    /**
     * First Work Date
     * <p>
     * Lineage reference object : PEBEMPL_FIRST_WORK_DATE
     * 
     */
    @JsonProperty("firstWorkDate")
    public Date getFirstWorkDate() {
        return firstWorkDate;
    }

    /**
     * First Work Date
     * <p>
     * Lineage reference object : PEBEMPL_FIRST_WORK_DATE
     * 
     */
    @JsonProperty("firstWorkDate")
    public void setFirstWorkDate(Date firstWorkDate) {
        this.firstWorkDate = firstWorkDate;
    }

    public Pebempl withFirstWorkDate(Date firstWorkDate) {
        this.firstWorkDate = firstWorkDate;
        return this;
    }

    /**
     * Form Indicator
     * <p>
     * Lineage reference object : PEBEMPL_I9_FORM_IND
     * 
     */
    @JsonProperty("i9FormInd")
    public String getI9FormInd() {
        return i9FormInd;
    }

    /**
     * Form Indicator
     * <p>
     * Lineage reference object : PEBEMPL_I9_FORM_IND
     * 
     */
    @JsonProperty("i9FormInd")
    public void setI9FormInd(String i9FormInd) {
        this.i9FormInd = i9FormInd;
    }

    public Pebempl withI9FormInd(String i9FormInd) {
        this.i9FormInd = i9FormInd;
        return this;
    }

    /**
     * Capture Date
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_DATE
     * 
     */
    @JsonProperty("ew2ConsentDate")
    public Date getEw2ConsentDate() {
        return ew2ConsentDate;
    }

    /**
     * Capture Date
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_DATE
     * 
     */
    @JsonProperty("ew2ConsentDate")
    public void setEw2ConsentDate(Date ew2ConsentDate) {
        this.ew2ConsentDate = ew2ConsentDate;
    }

    public Pebempl withEw2ConsentDate(Date ew2ConsentDate) {
        this.ew2ConsentDate = ew2ConsentDate;
        return this;
    }

    /**
     * IPEDS Primary Function
     * <p>
     * Lineage reference object : PEBEMPL_IPEDS_PRIMARY_FUNCTION
     * (Required)
     * 
     */
    @JsonProperty("ipedsPrimaryFunction")
    public String getIpedsPrimaryFunction() {
        return ipedsPrimaryFunction;
    }

    /**
     * IPEDS Primary Function
     * <p>
     * Lineage reference object : PEBEMPL_IPEDS_PRIMARY_FUNCTION
     * (Required)
     * 
     */
    @JsonProperty("ipedsPrimaryFunction")
    public void setIpedsPrimaryFunction(String ipedsPrimaryFunction) {
        this.ipedsPrimaryFunction = ipedsPrimaryFunction;
    }

    public Pebempl withIpedsPrimaryFunction(String ipedsPrimaryFunction) {
        this.ipedsPrimaryFunction = ipedsPrimaryFunction;
        return this;
    }

    /**
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_IND
     * 
     */
    @JsonProperty("ew2ConsentInd")
    public String getEw2ConsentInd() {
        return ew2ConsentInd;
    }

    /**
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_IND
     * 
     */
    @JsonProperty("ew2ConsentInd")
    public void setEw2ConsentInd(String ew2ConsentInd) {
        this.ew2ConsentInd = ew2ConsentInd;
    }

    public Pebempl withEw2ConsentInd(String ew2ConsentInd) {
        this.ew2ConsentInd = ew2ConsentInd;
        return this;
    }

    /**
     * Leave Category
     * <p>
     * Lineage reference object : PEBEMPL_LCAT_CODE, Lookup lineage reference object : ptreclc,ptvlcat
     * (Required)
     * 
     */
    @JsonProperty("lcatCode")
    public String getLcatCode() {
        return lcatCode;
    }

    /**
     * Leave Category
     * <p>
     * Lineage reference object : PEBEMPL_LCAT_CODE, Lookup lineage reference object : ptreclc,ptvlcat
     * (Required)
     * 
     */
    @JsonProperty("lcatCode")
    public void setLcatCode(String lcatCode) {
        this.lcatCode = lcatCode;
    }

    public Pebempl withLcatCode(String lcatCode) {
        this.lcatCode = lcatCode;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PEBEMPL_SSN_SUFFIX
     * 
     */
    @JsonProperty("ssnSuffix")
    public String getSsnSuffix() {
        return ssnSuffix;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PEBEMPL_SSN_SUFFIX
     * 
     */
    @JsonProperty("ssnSuffix")
    public void setSsnSuffix(String ssnSuffix) {
        this.ssnSuffix = ssnSuffix;
    }

    public Pebempl withSsnSuffix(String ssnSuffix) {
        this.ssnSuffix = ssnSuffix;
        return this;
    }

    /**
     * Adjusted Service
     * <p>
     * Lineage reference object : PEBEMPL_ADJ_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("adjServiceDate")
    public Date getAdjServiceDate() {
        return adjServiceDate;
    }

    /**
     * Adjusted Service
     * <p>
     * Lineage reference object : PEBEMPL_ADJ_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("adjServiceDate")
    public void setAdjServiceDate(Date adjServiceDate) {
        this.adjServiceDate = adjServiceDate;
    }

    public Pebempl withAdjServiceDate(Date adjServiceDate) {
        this.adjServiceDate = adjServiceDate;
        return this;
    }

    @JsonProperty("wkprDesc")
    public String getWkprDesc() {
        return wkprDesc;
    }

    @JsonProperty("wkprDesc")
    public void setWkprDesc(String wkprDesc) {
        this.wkprDesc = wkprDesc;
    }

    public Pebempl withWkprDesc(String wkprDesc) {
        this.wkprDesc = wkprDesc;
        return this;
    }

    /**
     * Lineage reference object : PEBEMPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PEBEMPL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Pebempl withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_1095TX_CONSENT_IND
     * 
     */
    @JsonProperty("1095txConsentInd")
    public String get1095txConsentInd() {
        return _1095txConsentInd;
    }

    /**
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_1095TX_CONSENT_IND
     * 
     */
    @JsonProperty("1095txConsentInd")
    public void set1095txConsentInd(String _1095txConsentInd) {
        this._1095txConsentInd = _1095txConsentInd;
    }

    public Pebempl with1095txConsentInd(String _1095txConsentInd) {
        this._1095txConsentInd = _1095txConsentInd;
        return this;
    }

    /**
     * Check Distribution
     * <p>
     * Lineage reference object : PEBEMPL_COAS_CODE_DIST
     * (Required)
     * 
     */
    @JsonProperty("coasCodeDist")
    public String getCoasCodeDist() {
        return coasCodeDist;
    }

    /**
     * Check Distribution
     * <p>
     * Lineage reference object : PEBEMPL_COAS_CODE_DIST
     * (Required)
     * 
     */
    @JsonProperty("coasCodeDist")
    public void setCoasCodeDist(String coasCodeDist) {
        this.coasCodeDist = coasCodeDist;
    }

    public Pebempl withCoasCodeDist(String coasCodeDist) {
        this.coasCodeDist = coasCodeDist;
        return this;
    }

    @JsonProperty("eclsDesc")
    public String getEclsDesc() {
        return eclsDesc;
    }

    @JsonProperty("eclsDesc")
    public void setEclsDesc(String eclsDesc) {
        this.eclsDesc = eclsDesc;
    }

    public Pebempl withEclsDesc(String eclsDesc) {
        this.eclsDesc = eclsDesc;
        return this;
    }

    /**
     * Original Hire
     * <p>
     * Lineage reference object : PEBEMPL_FIRST_HIRE_DATE
     * (Required)
     * 
     */
    @JsonProperty("firstHireDate")
    public Date getFirstHireDate() {
        return firstHireDate;
    }

    /**
     * Original Hire
     * <p>
     * Lineage reference object : PEBEMPL_FIRST_HIRE_DATE
     * (Required)
     * 
     */
    @JsonProperty("firstHireDate")
    public void setFirstHireDate(Date firstHireDate) {
        this.firstHireDate = firstHireDate;
    }

    public Pebempl withFirstHireDate(Date firstHireDate) {
        this.firstHireDate = firstHireDate;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : PEBEMPL_TREA_CODE
     * 
     */
    @JsonProperty("treaCode")
    public String getTreaCode() {
        return treaCode;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : PEBEMPL_TREA_CODE
     * 
     */
    @JsonProperty("treaCode")
    public void setTreaCode(String treaCode) {
        this.treaCode = treaCode;
    }

    public Pebempl withTreaCode(String treaCode) {
        this.treaCode = treaCode;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : PEBEMPL_LREA_CODE
     * 
     */
    @JsonProperty("lreaCode")
    public String getLreaCode() {
        return lreaCode;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : PEBEMPL_LREA_CODE
     * 
     */
    @JsonProperty("lreaCode")
    public void setLreaCode(String lreaCode) {
        this.lreaCode = lreaCode;
    }

    public Pebempl withLreaCode(String lreaCode) {
        this.lreaCode = lreaCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : PEBEMPL_ORGN_CODE_HOME
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeHome")
    public String getOrgnCodeHome() {
        return orgnCodeHome;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : PEBEMPL_ORGN_CODE_HOME
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeHome")
    public void setOrgnCodeHome(String orgnCodeHome) {
        this.orgnCodeHome = orgnCodeHome;
    }

    public Pebempl withOrgnCodeHome(String orgnCodeHome) {
        this.orgnCodeHome = orgnCodeHome;
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

    public Pebempl withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pebempl.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lreaDesc");
        sb.append('=');
        sb.append(((this.lreaDesc == null)?"<null>":this.lreaDesc));
        sb.append(',');
        sb.append("bcatCode");
        sb.append('=');
        sb.append(((this.bcatCode == null)?"<null>":this.bcatCode));
        sb.append(',');
        sb.append("internalFtPtInd");
        sb.append('=');
        sb.append(((this.internalFtPtInd == null)?"<null>":this.internalFtPtInd));
        sb.append(',');
        sb.append("ipedsSoftMoneyInd");
        sb.append('=');
        sb.append(((this.ipedsSoftMoneyInd == null)?"<null>":this.ipedsSoftMoneyInd));
        sb.append(',');
        sb.append("wkprCode");
        sb.append('=');
        sb.append(((this.wkprCode == null)?"<null>":this.wkprCode));
        sb.append(',');
        sb.append("lcatDesc");
        sb.append('=');
        sb.append(((this.lcatDesc == null)?"<null>":this.lcatDesc));
        sb.append(',');
        sb.append("ssnLastName");
        sb.append('=');
        sb.append(((this.ssnLastName == null)?"<null>":this.ssnLastName));
        sb.append(',');
        sb.append("distTitle");
        sb.append('=');
        sb.append(((this.distTitle == null)?"<null>":this.distTitle));
        sb.append(',');
        sb.append("etaxConsentUserId");
        sb.append('=');
        sb.append(((this.etaxConsentUserId == null)?"<null>":this.etaxConsentUserId));
        sb.append(',');
        sb.append("treaDesc");
        sb.append('=');
        sb.append(((this.treaDesc == null)?"<null>":this.treaDesc));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("lastWorkDate");
        sb.append('=');
        sb.append(((this.lastWorkDate == null)?"<null>":this.lastWorkDate));
        sb.append(',');
        sb.append("_1095txConsentUserId");
        sb.append('=');
        sb.append(((this._1095txConsentUserId == null)?"<null>":this._1095txConsentUserId));
        sb.append(',');
        sb.append("newHireInd");
        sb.append('=');
        sb.append(((this.newHireInd == null)?"<null>":this.newHireInd));
        sb.append(',');
        sb.append("homeTitle");
        sb.append('=');
        sb.append(((this.homeTitle == null)?"<null>":this.homeTitle));
        sb.append(',');
        sb.append("ssnFirstName");
        sb.append('=');
        sb.append(((this.ssnFirstName == null)?"<null>":this.ssnFirstName));
        sb.append(',');
        sb.append("stgrDesc");
        sb.append('=');
        sb.append(((this.stgrDesc == null)?"<null>":this.stgrDesc));
        sb.append(',');
        sb.append("jblnCode");
        sb.append('=');
        sb.append(((this.jblnCode == null)?"<null>":this.jblnCode));
        sb.append(',');
        sb.append("bcatDesc");
        sb.append('=');
        sb.append(((this.bcatDesc == null)?"<null>":this.bcatDesc));
        sb.append(',');
        sb.append("dicdDesc");
        sb.append('=');
        sb.append(((this.dicdDesc == null)?"<null>":this.dicdDesc));
        sb.append(',');
        sb.append("flsaInd");
        sb.append('=');
        sb.append(((this.flsaInd == null)?"<null>":this.flsaInd));
        sb.append(',');
        sb.append("_1042RecipientCd");
        sb.append('=');
        sb.append(((this._1042RecipientCd == null)?"<null>":this._1042RecipientCd));
        sb.append(',');
        sb.append("egrpCode");
        sb.append('=');
        sb.append(((this.egrpCode == null)?"<null>":this.egrpCode));
        sb.append(',');
        sb.append("etaxConsentDate");
        sb.append('=');
        sb.append(((this.etaxConsentDate == null)?"<null>":this.etaxConsentDate));
        sb.append(',');
        sb.append("campDesc");
        sb.append('=');
        sb.append(((this.campDesc == null)?"<null>":this.campDesc));
        sb.append(',');
        sb.append("currentHireDate");
        sb.append('=');
        sb.append(((this.currentHireDate == null)?"<null>":this.currentHireDate));
        sb.append(',');
        sb.append("coasCodeHome");
        sb.append('=');
        sb.append(((this.coasCodeHome == null)?"<null>":this.coasCodeHome));
        sb.append(',');
        sb.append("eclsCode");
        sb.append('=');
        sb.append(((this.eclsCode == null)?"<null>":this.eclsCode));
        sb.append(',');
        sb.append("i9ExpireDate");
        sb.append('=');
        sb.append(((this.i9ExpireDate == null)?"<null>":this.i9ExpireDate));
        sb.append(',');
        sb.append("jblnDesc");
        sb.append('=');
        sb.append(((this.jblnDesc == null)?"<null>":this.jblnDesc));
        sb.append(',');
        sb.append("ew2ConsentUserId");
        sb.append('=');
        sb.append(((this.ew2ConsentUserId == null)?"<null>":this.ew2ConsentUserId));
        sb.append(',');
        sb.append("orgnCodeDist");
        sb.append('=');
        sb.append(((this.orgnCodeDist == null)?"<null>":this.orgnCodeDist));
        sb.append(',');
        sb.append("etaxConsentInd");
        sb.append('=');
        sb.append(((this.etaxConsentInd == null)?"<null>":this.etaxConsentInd));
        sb.append(',');
        sb.append("stgrCode");
        sb.append('=');
        sb.append(((this.stgrCode == null)?"<null>":this.stgrCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("ipedsMedDentalInd");
        sb.append('=');
        sb.append(((this.ipedsMedDentalInd == null)?"<null>":this.ipedsMedDentalInd));
        sb.append(',');
        sb.append("seniorityDate");
        sb.append('=');
        sb.append(((this.seniorityDate == null)?"<null>":this.seniorityDate));
        sb.append(',');
        sb.append("_1095txConsentDate");
        sb.append('=');
        sb.append(((this._1095txConsentDate == null)?"<null>":this._1095txConsentDate));
        sb.append(',');
        sb.append("califPensionInd");
        sb.append('=');
        sb.append(((this.califPensionInd == null)?"<null>":this.califPensionInd));
        sb.append(',');
        sb.append("ssnMi");
        sb.append('=');
        sb.append(((this.ssnMi == null)?"<null>":this.ssnMi));
        sb.append(',');
        sb.append("emplStatus");
        sb.append('=');
        sb.append(((this.emplStatus == null)?"<null>":this.emplStatus));
        sb.append(',');
        sb.append("dicdCode");
        sb.append('=');
        sb.append(((this.dicdCode == null)?"<null>":this.dicdCode));
        sb.append(',');
        sb.append("daysInCanada");
        sb.append('=');
        sb.append(((this.daysInCanada == null)?"<null>":this.daysInCanada));
        sb.append(',');
        sb.append("nrsiCode");
        sb.append('=');
        sb.append(((this.nrsiCode == null)?"<null>":this.nrsiCode));
        sb.append(',');
        sb.append("i9Date");
        sb.append('=');
        sb.append(((this.i9Date == null)?"<null>":this.i9Date));
        sb.append(',');
        sb.append("loaBegDate");
        sb.append('=');
        sb.append(((this.loaBegDate == null)?"<null>":this.loaBegDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("loaEndDate");
        sb.append('=');
        sb.append(((this.loaEndDate == null)?"<null>":this.loaEndDate));
        sb.append(',');
        sb.append("collDesc");
        sb.append('=');
        sb.append(((this.collDesc == null)?"<null>":this.collDesc));
        sb.append(',');
        sb.append("revcodeDesc");
        sb.append('=');
        sb.append(((this.revcodeDesc == null)?"<null>":this.revcodeDesc));
        sb.append(',');
        sb.append("egrpDesc");
        sb.append('=');
        sb.append(((this.egrpDesc == null)?"<null>":this.egrpDesc));
        sb.append(',');
        sb.append("firstWorkDate");
        sb.append('=');
        sb.append(((this.firstWorkDate == null)?"<null>":this.firstWorkDate));
        sb.append(',');
        sb.append("i9FormInd");
        sb.append('=');
        sb.append(((this.i9FormInd == null)?"<null>":this.i9FormInd));
        sb.append(',');
        sb.append("ew2ConsentDate");
        sb.append('=');
        sb.append(((this.ew2ConsentDate == null)?"<null>":this.ew2ConsentDate));
        sb.append(',');
        sb.append("ipedsPrimaryFunction");
        sb.append('=');
        sb.append(((this.ipedsPrimaryFunction == null)?"<null>":this.ipedsPrimaryFunction));
        sb.append(',');
        sb.append("ew2ConsentInd");
        sb.append('=');
        sb.append(((this.ew2ConsentInd == null)?"<null>":this.ew2ConsentInd));
        sb.append(',');
        sb.append("lcatCode");
        sb.append('=');
        sb.append(((this.lcatCode == null)?"<null>":this.lcatCode));
        sb.append(',');
        sb.append("ssnSuffix");
        sb.append('=');
        sb.append(((this.ssnSuffix == null)?"<null>":this.ssnSuffix));
        sb.append(',');
        sb.append("adjServiceDate");
        sb.append('=');
        sb.append(((this.adjServiceDate == null)?"<null>":this.adjServiceDate));
        sb.append(',');
        sb.append("wkprDesc");
        sb.append('=');
        sb.append(((this.wkprDesc == null)?"<null>":this.wkprDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("_1095txConsentInd");
        sb.append('=');
        sb.append(((this._1095txConsentInd == null)?"<null>":this._1095txConsentInd));
        sb.append(',');
        sb.append("coasCodeDist");
        sb.append('=');
        sb.append(((this.coasCodeDist == null)?"<null>":this.coasCodeDist));
        sb.append(',');
        sb.append("eclsDesc");
        sb.append('=');
        sb.append(((this.eclsDesc == null)?"<null>":this.eclsDesc));
        sb.append(',');
        sb.append("firstHireDate");
        sb.append('=');
        sb.append(((this.firstHireDate == null)?"<null>":this.firstHireDate));
        sb.append(',');
        sb.append("treaCode");
        sb.append('=');
        sb.append(((this.treaCode == null)?"<null>":this.treaCode));
        sb.append(',');
        sb.append("lreaCode");
        sb.append('=');
        sb.append(((this.lreaCode == null)?"<null>":this.lreaCode));
        sb.append(',');
        sb.append("orgnCodeHome");
        sb.append('=');
        sb.append(((this.orgnCodeHome == null)?"<null>":this.orgnCodeHome));
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
        result = ((result* 31)+((this.lreaDesc == null)? 0 :this.lreaDesc.hashCode()));
        result = ((result* 31)+((this.bcatCode == null)? 0 :this.bcatCode.hashCode()));
        result = ((result* 31)+((this.internalFtPtInd == null)? 0 :this.internalFtPtInd.hashCode()));
        result = ((result* 31)+((this.ipedsSoftMoneyInd == null)? 0 :this.ipedsSoftMoneyInd.hashCode()));
        result = ((result* 31)+((this.wkprCode == null)? 0 :this.wkprCode.hashCode()));
        result = ((result* 31)+((this.lcatDesc == null)? 0 :this.lcatDesc.hashCode()));
        result = ((result* 31)+((this.ssnLastName == null)? 0 :this.ssnLastName.hashCode()));
        result = ((result* 31)+((this._1095txConsentDate == null)? 0 :this._1095txConsentDate.hashCode()));
        result = ((result* 31)+((this.distTitle == null)? 0 :this.distTitle.hashCode()));
        result = ((result* 31)+((this.etaxConsentUserId == null)? 0 :this.etaxConsentUserId.hashCode()));
        result = ((result* 31)+((this.treaDesc == null)? 0 :this.treaDesc.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.lastWorkDate == null)? 0 :this.lastWorkDate.hashCode()));
        result = ((result* 31)+((this.newHireInd == null)? 0 :this.newHireInd.hashCode()));
        result = ((result* 31)+((this.homeTitle == null)? 0 :this.homeTitle.hashCode()));
        result = ((result* 31)+((this.ssnFirstName == null)? 0 :this.ssnFirstName.hashCode()));
        result = ((result* 31)+((this.stgrDesc == null)? 0 :this.stgrDesc.hashCode()));
        result = ((result* 31)+((this._1095txConsentInd == null)? 0 :this._1095txConsentInd.hashCode()));
        result = ((result* 31)+((this.jblnCode == null)? 0 :this.jblnCode.hashCode()));
        result = ((result* 31)+((this.bcatDesc == null)? 0 :this.bcatDesc.hashCode()));
        result = ((result* 31)+((this.dicdDesc == null)? 0 :this.dicdDesc.hashCode()));
        result = ((result* 31)+((this.flsaInd == null)? 0 :this.flsaInd.hashCode()));
        result = ((result* 31)+((this.egrpCode == null)? 0 :this.egrpCode.hashCode()));
        result = ((result* 31)+((this.etaxConsentDate == null)? 0 :this.etaxConsentDate.hashCode()));
        result = ((result* 31)+((this.campDesc == null)? 0 :this.campDesc.hashCode()));
        result = ((result* 31)+((this.currentHireDate == null)? 0 :this.currentHireDate.hashCode()));
        result = ((result* 31)+((this.coasCodeHome == null)? 0 :this.coasCodeHome.hashCode()));
        result = ((result* 31)+((this.eclsCode == null)? 0 :this.eclsCode.hashCode()));
        result = ((result* 31)+((this.i9ExpireDate == null)? 0 :this.i9ExpireDate.hashCode()));
        result = ((result* 31)+((this.jblnDesc == null)? 0 :this.jblnDesc.hashCode()));
        result = ((result* 31)+((this.ew2ConsentUserId == null)? 0 :this.ew2ConsentUserId.hashCode()));
        result = ((result* 31)+((this.orgnCodeDist == null)? 0 :this.orgnCodeDist.hashCode()));
        result = ((result* 31)+((this.etaxConsentInd == null)? 0 :this.etaxConsentInd.hashCode()));
        result = ((result* 31)+((this.stgrCode == null)? 0 :this.stgrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.ipedsMedDentalInd == null)? 0 :this.ipedsMedDentalInd.hashCode()));
        result = ((result* 31)+((this.seniorityDate == null)? 0 :this.seniorityDate.hashCode()));
        result = ((result* 31)+((this.califPensionInd == null)? 0 :this.califPensionInd.hashCode()));
        result = ((result* 31)+((this.ssnMi == null)? 0 :this.ssnMi.hashCode()));
        result = ((result* 31)+((this.emplStatus == null)? 0 :this.emplStatus.hashCode()));
        result = ((result* 31)+((this._1042RecipientCd == null)? 0 :this._1042RecipientCd.hashCode()));
        result = ((result* 31)+((this.dicdCode == null)? 0 :this.dicdCode.hashCode()));
        result = ((result* 31)+((this.daysInCanada == null)? 0 :this.daysInCanada.hashCode()));
        result = ((result* 31)+((this.nrsiCode == null)? 0 :this.nrsiCode.hashCode()));
        result = ((result* 31)+((this.i9Date == null)? 0 :this.i9Date.hashCode()));
        result = ((result* 31)+((this.loaBegDate == null)? 0 :this.loaBegDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.loaEndDate == null)? 0 :this.loaEndDate.hashCode()));
        result = ((result* 31)+((this.collDesc == null)? 0 :this.collDesc.hashCode()));
        result = ((result* 31)+((this.revcodeDesc == null)? 0 :this.revcodeDesc.hashCode()));
        result = ((result* 31)+((this.egrpDesc == null)? 0 :this.egrpDesc.hashCode()));
        result = ((result* 31)+((this.firstWorkDate == null)? 0 :this.firstWorkDate.hashCode()));
        result = ((result* 31)+((this.i9FormInd == null)? 0 :this.i9FormInd.hashCode()));
        result = ((result* 31)+((this.ew2ConsentDate == null)? 0 :this.ew2ConsentDate.hashCode()));
        result = ((result* 31)+((this.ipedsPrimaryFunction == null)? 0 :this.ipedsPrimaryFunction.hashCode()));
        result = ((result* 31)+((this.ew2ConsentInd == null)? 0 :this.ew2ConsentInd.hashCode()));
        result = ((result* 31)+((this._1095txConsentUserId == null)? 0 :this._1095txConsentUserId.hashCode()));
        result = ((result* 31)+((this.lcatCode == null)? 0 :this.lcatCode.hashCode()));
        result = ((result* 31)+((this.ssnSuffix == null)? 0 :this.ssnSuffix.hashCode()));
        result = ((result* 31)+((this.adjServiceDate == null)? 0 :this.adjServiceDate.hashCode()));
        result = ((result* 31)+((this.wkprDesc == null)? 0 :this.wkprDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.coasCodeDist == null)? 0 :this.coasCodeDist.hashCode()));
        result = ((result* 31)+((this.eclsDesc == null)? 0 :this.eclsDesc.hashCode()));
        result = ((result* 31)+((this.firstHireDate == null)? 0 :this.firstHireDate.hashCode()));
        result = ((result* 31)+((this.treaCode == null)? 0 :this.treaCode.hashCode()));
        result = ((result* 31)+((this.lreaCode == null)? 0 :this.lreaCode.hashCode()));
        result = ((result* 31)+((this.orgnCodeHome == null)? 0 :this.orgnCodeHome.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pebempl) == false) {
            return false;
        }
        Pebempl rhs = ((Pebempl) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.lreaDesc == rhs.lreaDesc)||((this.lreaDesc!= null)&&this.lreaDesc.equals(rhs.lreaDesc)))&&((this.bcatCode == rhs.bcatCode)||((this.bcatCode!= null)&&this.bcatCode.equals(rhs.bcatCode))))&&((this.internalFtPtInd == rhs.internalFtPtInd)||((this.internalFtPtInd!= null)&&this.internalFtPtInd.equals(rhs.internalFtPtInd))))&&((this.ipedsSoftMoneyInd == rhs.ipedsSoftMoneyInd)||((this.ipedsSoftMoneyInd!= null)&&this.ipedsSoftMoneyInd.equals(rhs.ipedsSoftMoneyInd))))&&((this.wkprCode == rhs.wkprCode)||((this.wkprCode!= null)&&this.wkprCode.equals(rhs.wkprCode))))&&((this.lcatDesc == rhs.lcatDesc)||((this.lcatDesc!= null)&&this.lcatDesc.equals(rhs.lcatDesc))))&&((this.ssnLastName == rhs.ssnLastName)||((this.ssnLastName!= null)&&this.ssnLastName.equals(rhs.ssnLastName))))&&((this._1095txConsentDate == rhs._1095txConsentDate)||((this._1095txConsentDate!= null)&&this._1095txConsentDate.equals(rhs._1095txConsentDate))))&&((this.distTitle == rhs.distTitle)||((this.distTitle!= null)&&this.distTitle.equals(rhs.distTitle))))&&((this.etaxConsentUserId == rhs.etaxConsentUserId)||((this.etaxConsentUserId!= null)&&this.etaxConsentUserId.equals(rhs.etaxConsentUserId))))&&((this.treaDesc == rhs.treaDesc)||((this.treaDesc!= null)&&this.treaDesc.equals(rhs.treaDesc))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.lastWorkDate == rhs.lastWorkDate)||((this.lastWorkDate!= null)&&this.lastWorkDate.equals(rhs.lastWorkDate))))&&((this.newHireInd == rhs.newHireInd)||((this.newHireInd!= null)&&this.newHireInd.equals(rhs.newHireInd))))&&((this.homeTitle == rhs.homeTitle)||((this.homeTitle!= null)&&this.homeTitle.equals(rhs.homeTitle))))&&((this.ssnFirstName == rhs.ssnFirstName)||((this.ssnFirstName!= null)&&this.ssnFirstName.equals(rhs.ssnFirstName))))&&((this.stgrDesc == rhs.stgrDesc)||((this.stgrDesc!= null)&&this.stgrDesc.equals(rhs.stgrDesc))))&&((this._1095txConsentInd == rhs._1095txConsentInd)||((this._1095txConsentInd!= null)&&this._1095txConsentInd.equals(rhs._1095txConsentInd))))&&((this.jblnCode == rhs.jblnCode)||((this.jblnCode!= null)&&this.jblnCode.equals(rhs.jblnCode))))&&((this.bcatDesc == rhs.bcatDesc)||((this.bcatDesc!= null)&&this.bcatDesc.equals(rhs.bcatDesc))))&&((this.dicdDesc == rhs.dicdDesc)||((this.dicdDesc!= null)&&this.dicdDesc.equals(rhs.dicdDesc))))&&((this.flsaInd == rhs.flsaInd)||((this.flsaInd!= null)&&this.flsaInd.equals(rhs.flsaInd))))&&((this.egrpCode == rhs.egrpCode)||((this.egrpCode!= null)&&this.egrpCode.equals(rhs.egrpCode))))&&((this.etaxConsentDate == rhs.etaxConsentDate)||((this.etaxConsentDate!= null)&&this.etaxConsentDate.equals(rhs.etaxConsentDate))))&&((this.campDesc == rhs.campDesc)||((this.campDesc!= null)&&this.campDesc.equals(rhs.campDesc))))&&((this.currentHireDate == rhs.currentHireDate)||((this.currentHireDate!= null)&&this.currentHireDate.equals(rhs.currentHireDate))))&&((this.coasCodeHome == rhs.coasCodeHome)||((this.coasCodeHome!= null)&&this.coasCodeHome.equals(rhs.coasCodeHome))))&&((this.eclsCode == rhs.eclsCode)||((this.eclsCode!= null)&&this.eclsCode.equals(rhs.eclsCode))))&&((this.i9ExpireDate == rhs.i9ExpireDate)||((this.i9ExpireDate!= null)&&this.i9ExpireDate.equals(rhs.i9ExpireDate))))&&((this.jblnDesc == rhs.jblnDesc)||((this.jblnDesc!= null)&&this.jblnDesc.equals(rhs.jblnDesc))))&&((this.ew2ConsentUserId == rhs.ew2ConsentUserId)||((this.ew2ConsentUserId!= null)&&this.ew2ConsentUserId.equals(rhs.ew2ConsentUserId))))&&((this.orgnCodeDist == rhs.orgnCodeDist)||((this.orgnCodeDist!= null)&&this.orgnCodeDist.equals(rhs.orgnCodeDist))))&&((this.etaxConsentInd == rhs.etaxConsentInd)||((this.etaxConsentInd!= null)&&this.etaxConsentInd.equals(rhs.etaxConsentInd))))&&((this.stgrCode == rhs.stgrCode)||((this.stgrCode!= null)&&this.stgrCode.equals(rhs.stgrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.ipedsMedDentalInd == rhs.ipedsMedDentalInd)||((this.ipedsMedDentalInd!= null)&&this.ipedsMedDentalInd.equals(rhs.ipedsMedDentalInd))))&&((this.seniorityDate == rhs.seniorityDate)||((this.seniorityDate!= null)&&this.seniorityDate.equals(rhs.seniorityDate))))&&((this.califPensionInd == rhs.califPensionInd)||((this.califPensionInd!= null)&&this.califPensionInd.equals(rhs.califPensionInd))))&&((this.ssnMi == rhs.ssnMi)||((this.ssnMi!= null)&&this.ssnMi.equals(rhs.ssnMi))))&&((this.emplStatus == rhs.emplStatus)||((this.emplStatus!= null)&&this.emplStatus.equals(rhs.emplStatus))))&&((this._1042RecipientCd == rhs._1042RecipientCd)||((this._1042RecipientCd!= null)&&this._1042RecipientCd.equals(rhs._1042RecipientCd))))&&((this.dicdCode == rhs.dicdCode)||((this.dicdCode!= null)&&this.dicdCode.equals(rhs.dicdCode))))&&((this.daysInCanada == rhs.daysInCanada)||((this.daysInCanada!= null)&&this.daysInCanada.equals(rhs.daysInCanada))))&&((this.nrsiCode == rhs.nrsiCode)||((this.nrsiCode!= null)&&this.nrsiCode.equals(rhs.nrsiCode))))&&((this.i9Date == rhs.i9Date)||((this.i9Date!= null)&&this.i9Date.equals(rhs.i9Date))))&&((this.loaBegDate == rhs.loaBegDate)||((this.loaBegDate!= null)&&this.loaBegDate.equals(rhs.loaBegDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.loaEndDate == rhs.loaEndDate)||((this.loaEndDate!= null)&&this.loaEndDate.equals(rhs.loaEndDate))))&&((this.collDesc == rhs.collDesc)||((this.collDesc!= null)&&this.collDesc.equals(rhs.collDesc))))&&((this.revcodeDesc == rhs.revcodeDesc)||((this.revcodeDesc!= null)&&this.revcodeDesc.equals(rhs.revcodeDesc))))&&((this.egrpDesc == rhs.egrpDesc)||((this.egrpDesc!= null)&&this.egrpDesc.equals(rhs.egrpDesc))))&&((this.firstWorkDate == rhs.firstWorkDate)||((this.firstWorkDate!= null)&&this.firstWorkDate.equals(rhs.firstWorkDate))))&&((this.i9FormInd == rhs.i9FormInd)||((this.i9FormInd!= null)&&this.i9FormInd.equals(rhs.i9FormInd))))&&((this.ew2ConsentDate == rhs.ew2ConsentDate)||((this.ew2ConsentDate!= null)&&this.ew2ConsentDate.equals(rhs.ew2ConsentDate))))&&((this.ipedsPrimaryFunction == rhs.ipedsPrimaryFunction)||((this.ipedsPrimaryFunction!= null)&&this.ipedsPrimaryFunction.equals(rhs.ipedsPrimaryFunction))))&&((this.ew2ConsentInd == rhs.ew2ConsentInd)||((this.ew2ConsentInd!= null)&&this.ew2ConsentInd.equals(rhs.ew2ConsentInd))))&&((this._1095txConsentUserId == rhs._1095txConsentUserId)||((this._1095txConsentUserId!= null)&&this._1095txConsentUserId.equals(rhs._1095txConsentUserId))))&&((this.lcatCode == rhs.lcatCode)||((this.lcatCode!= null)&&this.lcatCode.equals(rhs.lcatCode))))&&((this.ssnSuffix == rhs.ssnSuffix)||((this.ssnSuffix!= null)&&this.ssnSuffix.equals(rhs.ssnSuffix))))&&((this.adjServiceDate == rhs.adjServiceDate)||((this.adjServiceDate!= null)&&this.adjServiceDate.equals(rhs.adjServiceDate))))&&((this.wkprDesc == rhs.wkprDesc)||((this.wkprDesc!= null)&&this.wkprDesc.equals(rhs.wkprDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.coasCodeDist == rhs.coasCodeDist)||((this.coasCodeDist!= null)&&this.coasCodeDist.equals(rhs.coasCodeDist))))&&((this.eclsDesc == rhs.eclsDesc)||((this.eclsDesc!= null)&&this.eclsDesc.equals(rhs.eclsDesc))))&&((this.firstHireDate == rhs.firstHireDate)||((this.firstHireDate!= null)&&this.firstHireDate.equals(rhs.firstHireDate))))&&((this.treaCode == rhs.treaCode)||((this.treaCode!= null)&&this.treaCode.equals(rhs.treaCode))))&&((this.lreaCode == rhs.lreaCode)||((this.lreaCode!= null)&&this.lreaCode.equals(rhs.lreaCode))))&&((this.orgnCodeHome == rhs.orgnCodeHome)||((this.orgnCodeHome!= null)&&this.orgnCodeHome.equals(rhs.orgnCodeHome))));
    }

}
