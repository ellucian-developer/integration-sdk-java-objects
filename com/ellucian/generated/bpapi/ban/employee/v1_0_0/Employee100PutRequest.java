
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
    "ssnMi",
    "emplStatus",
    "bcatCode",
    "internalFtPtInd",
    "dicdCode",
    "wkprCode",
    "ipedsSoftMoneyInd",
    "daysInCanada",
    "nrsiCode",
    "loaBegDate",
    "i9Date",
    "ssnLastName",
    "lastWorkDate",
    "loaEndDate",
    "campCode",
    "newHireInd",
    "ssnFirstName",
    "id",
    "jblnCode",
    "firstWorkDate",
    "i9FormInd",
    "ipedsPrimaryFunction",
    "flsaInd",
    "ew2ConsentInd",
    "egrpCode",
    "1042RecipientCd",
    "lcatCode",
    "currentHireDate",
    "ssnSuffix",
    "adjServiceDate",
    "eclsCode",
    "i9ExpireDate",
    "1095txConsentInd",
    "orgnCodeDist",
    "firstHireDate",
    "treaCode",
    "etaxConsentInd",
    "lreaCode",
    "stgrCode",
    "termDate",
    "collCode",
    "orgnCodeHome",
    "ipedsMedDentalInd",
    "seniorityDate",
    "califPensionInd"
})
@Generated("jsonschema2pojo")
public class Employee100PutRequest {

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
     * District or Division
     * <p>
     * Lineage reference object : PEBEMPL_DICD_CODE, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("dicdCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_DICD_CODE, Lookup lineage reference object : gtvdicd")
    private String dicdCode;
    /**
     * Work Period
     * <p>
     * Lineage reference object : PEBEMPL_WKPR_CODE, Lookup lineage reference object : ptrwkpr
     * 
     */
    @JsonProperty("wkprCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_WKPR_CODE, Lookup lineage reference object : ptrwkpr")
    private String wkprCode;
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
     * Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LOA_BEG_DATE")
    private Date loaBegDate;
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
     * Last
     * <p>
     * Lineage reference object : PEBEMPL_SSN_LAST_NAME
     * 
     */
    @JsonProperty("ssnLastName")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_SSN_LAST_NAME")
    private String ssnLastName;
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
     * End Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_END_DATE
     * 
     */
    @JsonProperty("loaEndDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LOA_END_DATE")
    private Date loaEndDate;
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
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : PEBEMPL_NEW_HIRE_IND
     * 
     */
    @JsonProperty("newHireInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_NEW_HIRE_IND")
    private String newHireInd;
    /**
     * First
     * <p>
     * Lineage reference object : PEBEMPL_SSN_FIRST_NAME
     * 
     */
    @JsonProperty("ssnFirstName")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_SSN_FIRST_NAME")
    private String ssnFirstName;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Location
     * <p>
     * Lineage reference object : PEBEMPL_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_JBLN_CODE")
    private String jblnCode;
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
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_EW2_CONSENT_IND
     * 
     */
    @JsonProperty("ew2ConsentInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_EW2_CONSENT_IND")
    private String ew2ConsentInd;
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
     *  1042S Recipient
     * <p>
     * Lineage reference object : PEBEMPL_1042_RECIPIENT_CD
     * 
     */
    @JsonProperty("1042RecipientCd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_1042_RECIPIENT_CD")
    private String _1042RecipientCd;
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
     * Lineage reference object : PEBEMPL_ORGN_CODE_DIST
     * (Required)
     * 
     */
    @JsonProperty("orgnCodeDist")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ORGN_CODE_DIST")
    private String orgnCodeDist;
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
     * Employee Consent
     * <p>
     * Lineage reference object : PEBEMPL_ETAX_CONSENT_IND
     * 
     */
    @JsonProperty("etaxConsentInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_ETAX_CONSENT_IND")
    private String etaxConsentInd;
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
     * Grouping
     * <p>
     * Lineage reference object : PEBEMPL_STGR_CODE, Lookup lineage reference object : ptvstgr
     * 
     */
    @JsonProperty("stgrCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_STGR_CODE, Lookup lineage reference object : ptvstgr")
    private String stgrCode;
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
     * College
     * <p>
     * Lineage reference object : PEBEMPL_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
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
     * Current Membership Status
     * <p>
     * Lineage reference object : PEBEMPL_CALIF_PENSION_IND
     * 
     */
    @JsonProperty("califPensionInd")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_CALIF_PENSION_IND")
    private String califPensionInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Employee100PutRequest withSsnMi(String ssnMi) {
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

    public Employee100PutRequest withEmplStatus(String emplStatus) {
        this.emplStatus = emplStatus;
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

    public Employee100PutRequest withBcatCode(String bcatCode) {
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

    public Employee100PutRequest withInternalFtPtInd(String internalFtPtInd) {
        this.internalFtPtInd = internalFtPtInd;
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

    public Employee100PutRequest withDicdCode(String dicdCode) {
        this.dicdCode = dicdCode;
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

    public Employee100PutRequest withWkprCode(String wkprCode) {
        this.wkprCode = wkprCode;
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

    public Employee100PutRequest withIpedsSoftMoneyInd(String ipedsSoftMoneyInd) {
        this.ipedsSoftMoneyInd = ipedsSoftMoneyInd;
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

    public Employee100PutRequest withDaysInCanada(Double daysInCanada) {
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

    public Employee100PutRequest withNrsiCode(String nrsiCode) {
        this.nrsiCode = nrsiCode;
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

    public Employee100PutRequest withLoaBegDate(Date loaBegDate) {
        this.loaBegDate = loaBegDate;
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

    public Employee100PutRequest withI9Date(Date i9Date) {
        this.i9Date = i9Date;
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

    public Employee100PutRequest withSsnLastName(String ssnLastName) {
        this.ssnLastName = ssnLastName;
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

    public Employee100PutRequest withLastWorkDate(Date lastWorkDate) {
        this.lastWorkDate = lastWorkDate;
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

    public Employee100PutRequest withLoaEndDate(Date loaEndDate) {
        this.loaEndDate = loaEndDate;
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

    public Employee100PutRequest withCampCode(String campCode) {
        this.campCode = campCode;
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

    public Employee100PutRequest withNewHireInd(String newHireInd) {
        this.newHireInd = newHireInd;
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

    public Employee100PutRequest withSsnFirstName(String ssnFirstName) {
        this.ssnFirstName = ssnFirstName;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public Employee100PutRequest withId(Object id) {
        this.id = id;
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

    public Employee100PutRequest withJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
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

    public Employee100PutRequest withFirstWorkDate(Date firstWorkDate) {
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

    public Employee100PutRequest withI9FormInd(String i9FormInd) {
        this.i9FormInd = i9FormInd;
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

    public Employee100PutRequest withIpedsPrimaryFunction(String ipedsPrimaryFunction) {
        this.ipedsPrimaryFunction = ipedsPrimaryFunction;
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

    public Employee100PutRequest withFlsaInd(String flsaInd) {
        this.flsaInd = flsaInd;
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

    public Employee100PutRequest withEw2ConsentInd(String ew2ConsentInd) {
        this.ew2ConsentInd = ew2ConsentInd;
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

    public Employee100PutRequest withEgrpCode(String egrpCode) {
        this.egrpCode = egrpCode;
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

    public Employee100PutRequest with1042RecipientCd(String _1042RecipientCd) {
        this._1042RecipientCd = _1042RecipientCd;
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

    public Employee100PutRequest withLcatCode(String lcatCode) {
        this.lcatCode = lcatCode;
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

    public Employee100PutRequest withCurrentHireDate(Date currentHireDate) {
        this.currentHireDate = currentHireDate;
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

    public Employee100PutRequest withSsnSuffix(String ssnSuffix) {
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

    public Employee100PutRequest withAdjServiceDate(Date adjServiceDate) {
        this.adjServiceDate = adjServiceDate;
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

    public Employee100PutRequest withEclsCode(String eclsCode) {
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

    public Employee100PutRequest withI9ExpireDate(Date i9ExpireDate) {
        this.i9ExpireDate = i9ExpireDate;
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

    public Employee100PutRequest with1095txConsentInd(String _1095txConsentInd) {
        this._1095txConsentInd = _1095txConsentInd;
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

    public Employee100PutRequest withOrgnCodeDist(String orgnCodeDist) {
        this.orgnCodeDist = orgnCodeDist;
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

    public Employee100PutRequest withFirstHireDate(Date firstHireDate) {
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

    public Employee100PutRequest withTreaCode(String treaCode) {
        this.treaCode = treaCode;
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

    public Employee100PutRequest withEtaxConsentInd(String etaxConsentInd) {
        this.etaxConsentInd = etaxConsentInd;
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

    public Employee100PutRequest withLreaCode(String lreaCode) {
        this.lreaCode = lreaCode;
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

    public Employee100PutRequest withStgrCode(String stgrCode) {
        this.stgrCode = stgrCode;
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

    public Employee100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public Employee100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
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

    public Employee100PutRequest withOrgnCodeHome(String orgnCodeHome) {
        this.orgnCodeHome = orgnCodeHome;
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

    public Employee100PutRequest withIpedsMedDentalInd(String ipedsMedDentalInd) {
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

    public Employee100PutRequest withSeniorityDate(Date seniorityDate) {
        this.seniorityDate = seniorityDate;
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

    public Employee100PutRequest withCalifPensionInd(String califPensionInd) {
        this.califPensionInd = califPensionInd;
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

    public Employee100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Employee100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssnMi");
        sb.append('=');
        sb.append(((this.ssnMi == null)?"<null>":this.ssnMi));
        sb.append(',');
        sb.append("emplStatus");
        sb.append('=');
        sb.append(((this.emplStatus == null)?"<null>":this.emplStatus));
        sb.append(',');
        sb.append("bcatCode");
        sb.append('=');
        sb.append(((this.bcatCode == null)?"<null>":this.bcatCode));
        sb.append(',');
        sb.append("internalFtPtInd");
        sb.append('=');
        sb.append(((this.internalFtPtInd == null)?"<null>":this.internalFtPtInd));
        sb.append(',');
        sb.append("dicdCode");
        sb.append('=');
        sb.append(((this.dicdCode == null)?"<null>":this.dicdCode));
        sb.append(',');
        sb.append("wkprCode");
        sb.append('=');
        sb.append(((this.wkprCode == null)?"<null>":this.wkprCode));
        sb.append(',');
        sb.append("ipedsSoftMoneyInd");
        sb.append('=');
        sb.append(((this.ipedsSoftMoneyInd == null)?"<null>":this.ipedsSoftMoneyInd));
        sb.append(',');
        sb.append("daysInCanada");
        sb.append('=');
        sb.append(((this.daysInCanada == null)?"<null>":this.daysInCanada));
        sb.append(',');
        sb.append("nrsiCode");
        sb.append('=');
        sb.append(((this.nrsiCode == null)?"<null>":this.nrsiCode));
        sb.append(',');
        sb.append("loaBegDate");
        sb.append('=');
        sb.append(((this.loaBegDate == null)?"<null>":this.loaBegDate));
        sb.append(',');
        sb.append("i9Date");
        sb.append('=');
        sb.append(((this.i9Date == null)?"<null>":this.i9Date));
        sb.append(',');
        sb.append("ssnLastName");
        sb.append('=');
        sb.append(((this.ssnLastName == null)?"<null>":this.ssnLastName));
        sb.append(',');
        sb.append("lastWorkDate");
        sb.append('=');
        sb.append(((this.lastWorkDate == null)?"<null>":this.lastWorkDate));
        sb.append(',');
        sb.append("loaEndDate");
        sb.append('=');
        sb.append(((this.loaEndDate == null)?"<null>":this.loaEndDate));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("newHireInd");
        sb.append('=');
        sb.append(((this.newHireInd == null)?"<null>":this.newHireInd));
        sb.append(',');
        sb.append("ssnFirstName");
        sb.append('=');
        sb.append(((this.ssnFirstName == null)?"<null>":this.ssnFirstName));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("jblnCode");
        sb.append('=');
        sb.append(((this.jblnCode == null)?"<null>":this.jblnCode));
        sb.append(',');
        sb.append("firstWorkDate");
        sb.append('=');
        sb.append(((this.firstWorkDate == null)?"<null>":this.firstWorkDate));
        sb.append(',');
        sb.append("i9FormInd");
        sb.append('=');
        sb.append(((this.i9FormInd == null)?"<null>":this.i9FormInd));
        sb.append(',');
        sb.append("ipedsPrimaryFunction");
        sb.append('=');
        sb.append(((this.ipedsPrimaryFunction == null)?"<null>":this.ipedsPrimaryFunction));
        sb.append(',');
        sb.append("flsaInd");
        sb.append('=');
        sb.append(((this.flsaInd == null)?"<null>":this.flsaInd));
        sb.append(',');
        sb.append("ew2ConsentInd");
        sb.append('=');
        sb.append(((this.ew2ConsentInd == null)?"<null>":this.ew2ConsentInd));
        sb.append(',');
        sb.append("egrpCode");
        sb.append('=');
        sb.append(((this.egrpCode == null)?"<null>":this.egrpCode));
        sb.append(',');
        sb.append("_1042RecipientCd");
        sb.append('=');
        sb.append(((this._1042RecipientCd == null)?"<null>":this._1042RecipientCd));
        sb.append(',');
        sb.append("lcatCode");
        sb.append('=');
        sb.append(((this.lcatCode == null)?"<null>":this.lcatCode));
        sb.append(',');
        sb.append("currentHireDate");
        sb.append('=');
        sb.append(((this.currentHireDate == null)?"<null>":this.currentHireDate));
        sb.append(',');
        sb.append("ssnSuffix");
        sb.append('=');
        sb.append(((this.ssnSuffix == null)?"<null>":this.ssnSuffix));
        sb.append(',');
        sb.append("adjServiceDate");
        sb.append('=');
        sb.append(((this.adjServiceDate == null)?"<null>":this.adjServiceDate));
        sb.append(',');
        sb.append("eclsCode");
        sb.append('=');
        sb.append(((this.eclsCode == null)?"<null>":this.eclsCode));
        sb.append(',');
        sb.append("i9ExpireDate");
        sb.append('=');
        sb.append(((this.i9ExpireDate == null)?"<null>":this.i9ExpireDate));
        sb.append(',');
        sb.append("_1095txConsentInd");
        sb.append('=');
        sb.append(((this._1095txConsentInd == null)?"<null>":this._1095txConsentInd));
        sb.append(',');
        sb.append("orgnCodeDist");
        sb.append('=');
        sb.append(((this.orgnCodeDist == null)?"<null>":this.orgnCodeDist));
        sb.append(',');
        sb.append("firstHireDate");
        sb.append('=');
        sb.append(((this.firstHireDate == null)?"<null>":this.firstHireDate));
        sb.append(',');
        sb.append("treaCode");
        sb.append('=');
        sb.append(((this.treaCode == null)?"<null>":this.treaCode));
        sb.append(',');
        sb.append("etaxConsentInd");
        sb.append('=');
        sb.append(((this.etaxConsentInd == null)?"<null>":this.etaxConsentInd));
        sb.append(',');
        sb.append("lreaCode");
        sb.append('=');
        sb.append(((this.lreaCode == null)?"<null>":this.lreaCode));
        sb.append(',');
        sb.append("stgrCode");
        sb.append('=');
        sb.append(((this.stgrCode == null)?"<null>":this.stgrCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("orgnCodeHome");
        sb.append('=');
        sb.append(((this.orgnCodeHome == null)?"<null>":this.orgnCodeHome));
        sb.append(',');
        sb.append("ipedsMedDentalInd");
        sb.append('=');
        sb.append(((this.ipedsMedDentalInd == null)?"<null>":this.ipedsMedDentalInd));
        sb.append(',');
        sb.append("seniorityDate");
        sb.append('=');
        sb.append(((this.seniorityDate == null)?"<null>":this.seniorityDate));
        sb.append(',');
        sb.append("califPensionInd");
        sb.append('=');
        sb.append(((this.califPensionInd == null)?"<null>":this.califPensionInd));
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
        result = ((result* 31)+((this.ssnMi == null)? 0 :this.ssnMi.hashCode()));
        result = ((result* 31)+((this.emplStatus == null)? 0 :this.emplStatus.hashCode()));
        result = ((result* 31)+((this._1042RecipientCd == null)? 0 :this._1042RecipientCd.hashCode()));
        result = ((result* 31)+((this.bcatCode == null)? 0 :this.bcatCode.hashCode()));
        result = ((result* 31)+((this.internalFtPtInd == null)? 0 :this.internalFtPtInd.hashCode()));
        result = ((result* 31)+((this.dicdCode == null)? 0 :this.dicdCode.hashCode()));
        result = ((result* 31)+((this.wkprCode == null)? 0 :this.wkprCode.hashCode()));
        result = ((result* 31)+((this.ipedsSoftMoneyInd == null)? 0 :this.ipedsSoftMoneyInd.hashCode()));
        result = ((result* 31)+((this.daysInCanada == null)? 0 :this.daysInCanada.hashCode()));
        result = ((result* 31)+((this.nrsiCode == null)? 0 :this.nrsiCode.hashCode()));
        result = ((result* 31)+((this.loaBegDate == null)? 0 :this.loaBegDate.hashCode()));
        result = ((result* 31)+((this.i9Date == null)? 0 :this.i9Date.hashCode()));
        result = ((result* 31)+((this.ssnLastName == null)? 0 :this.ssnLastName.hashCode()));
        result = ((result* 31)+((this.lastWorkDate == null)? 0 :this.lastWorkDate.hashCode()));
        result = ((result* 31)+((this.loaEndDate == null)? 0 :this.loaEndDate.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.newHireInd == null)? 0 :this.newHireInd.hashCode()));
        result = ((result* 31)+((this.ssnFirstName == null)? 0 :this.ssnFirstName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this._1095txConsentInd == null)? 0 :this._1095txConsentInd.hashCode()));
        result = ((result* 31)+((this.jblnCode == null)? 0 :this.jblnCode.hashCode()));
        result = ((result* 31)+((this.firstWorkDate == null)? 0 :this.firstWorkDate.hashCode()));
        result = ((result* 31)+((this.i9FormInd == null)? 0 :this.i9FormInd.hashCode()));
        result = ((result* 31)+((this.ipedsPrimaryFunction == null)? 0 :this.ipedsPrimaryFunction.hashCode()));
        result = ((result* 31)+((this.flsaInd == null)? 0 :this.flsaInd.hashCode()));
        result = ((result* 31)+((this.ew2ConsentInd == null)? 0 :this.ew2ConsentInd.hashCode()));
        result = ((result* 31)+((this.egrpCode == null)? 0 :this.egrpCode.hashCode()));
        result = ((result* 31)+((this.lcatCode == null)? 0 :this.lcatCode.hashCode()));
        result = ((result* 31)+((this.currentHireDate == null)? 0 :this.currentHireDate.hashCode()));
        result = ((result* 31)+((this.ssnSuffix == null)? 0 :this.ssnSuffix.hashCode()));
        result = ((result* 31)+((this.adjServiceDate == null)? 0 :this.adjServiceDate.hashCode()));
        result = ((result* 31)+((this.eclsCode == null)? 0 :this.eclsCode.hashCode()));
        result = ((result* 31)+((this.i9ExpireDate == null)? 0 :this.i9ExpireDate.hashCode()));
        result = ((result* 31)+((this.orgnCodeDist == null)? 0 :this.orgnCodeDist.hashCode()));
        result = ((result* 31)+((this.firstHireDate == null)? 0 :this.firstHireDate.hashCode()));
        result = ((result* 31)+((this.treaCode == null)? 0 :this.treaCode.hashCode()));
        result = ((result* 31)+((this.etaxConsentInd == null)? 0 :this.etaxConsentInd.hashCode()));
        result = ((result* 31)+((this.lreaCode == null)? 0 :this.lreaCode.hashCode()));
        result = ((result* 31)+((this.stgrCode == null)? 0 :this.stgrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.orgnCodeHome == null)? 0 :this.orgnCodeHome.hashCode()));
        result = ((result* 31)+((this.ipedsMedDentalInd == null)? 0 :this.ipedsMedDentalInd.hashCode()));
        result = ((result* 31)+((this.seniorityDate == null)? 0 :this.seniorityDate.hashCode()));
        result = ((result* 31)+((this.califPensionInd == null)? 0 :this.califPensionInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employee100PutRequest) == false) {
            return false;
        }
        Employee100PutRequest rhs = ((Employee100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((this.ssnMi == rhs.ssnMi)||((this.ssnMi!= null)&&this.ssnMi.equals(rhs.ssnMi)))&&((this.emplStatus == rhs.emplStatus)||((this.emplStatus!= null)&&this.emplStatus.equals(rhs.emplStatus))))&&((this._1042RecipientCd == rhs._1042RecipientCd)||((this._1042RecipientCd!= null)&&this._1042RecipientCd.equals(rhs._1042RecipientCd))))&&((this.bcatCode == rhs.bcatCode)||((this.bcatCode!= null)&&this.bcatCode.equals(rhs.bcatCode))))&&((this.internalFtPtInd == rhs.internalFtPtInd)||((this.internalFtPtInd!= null)&&this.internalFtPtInd.equals(rhs.internalFtPtInd))))&&((this.dicdCode == rhs.dicdCode)||((this.dicdCode!= null)&&this.dicdCode.equals(rhs.dicdCode))))&&((this.wkprCode == rhs.wkprCode)||((this.wkprCode!= null)&&this.wkprCode.equals(rhs.wkprCode))))&&((this.ipedsSoftMoneyInd == rhs.ipedsSoftMoneyInd)||((this.ipedsSoftMoneyInd!= null)&&this.ipedsSoftMoneyInd.equals(rhs.ipedsSoftMoneyInd))))&&((this.daysInCanada == rhs.daysInCanada)||((this.daysInCanada!= null)&&this.daysInCanada.equals(rhs.daysInCanada))))&&((this.nrsiCode == rhs.nrsiCode)||((this.nrsiCode!= null)&&this.nrsiCode.equals(rhs.nrsiCode))))&&((this.loaBegDate == rhs.loaBegDate)||((this.loaBegDate!= null)&&this.loaBegDate.equals(rhs.loaBegDate))))&&((this.i9Date == rhs.i9Date)||((this.i9Date!= null)&&this.i9Date.equals(rhs.i9Date))))&&((this.ssnLastName == rhs.ssnLastName)||((this.ssnLastName!= null)&&this.ssnLastName.equals(rhs.ssnLastName))))&&((this.lastWorkDate == rhs.lastWorkDate)||((this.lastWorkDate!= null)&&this.lastWorkDate.equals(rhs.lastWorkDate))))&&((this.loaEndDate == rhs.loaEndDate)||((this.loaEndDate!= null)&&this.loaEndDate.equals(rhs.loaEndDate))))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.newHireInd == rhs.newHireInd)||((this.newHireInd!= null)&&this.newHireInd.equals(rhs.newHireInd))))&&((this.ssnFirstName == rhs.ssnFirstName)||((this.ssnFirstName!= null)&&this.ssnFirstName.equals(rhs.ssnFirstName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this._1095txConsentInd == rhs._1095txConsentInd)||((this._1095txConsentInd!= null)&&this._1095txConsentInd.equals(rhs._1095txConsentInd))))&&((this.jblnCode == rhs.jblnCode)||((this.jblnCode!= null)&&this.jblnCode.equals(rhs.jblnCode))))&&((this.firstWorkDate == rhs.firstWorkDate)||((this.firstWorkDate!= null)&&this.firstWorkDate.equals(rhs.firstWorkDate))))&&((this.i9FormInd == rhs.i9FormInd)||((this.i9FormInd!= null)&&this.i9FormInd.equals(rhs.i9FormInd))))&&((this.ipedsPrimaryFunction == rhs.ipedsPrimaryFunction)||((this.ipedsPrimaryFunction!= null)&&this.ipedsPrimaryFunction.equals(rhs.ipedsPrimaryFunction))))&&((this.flsaInd == rhs.flsaInd)||((this.flsaInd!= null)&&this.flsaInd.equals(rhs.flsaInd))))&&((this.ew2ConsentInd == rhs.ew2ConsentInd)||((this.ew2ConsentInd!= null)&&this.ew2ConsentInd.equals(rhs.ew2ConsentInd))))&&((this.egrpCode == rhs.egrpCode)||((this.egrpCode!= null)&&this.egrpCode.equals(rhs.egrpCode))))&&((this.lcatCode == rhs.lcatCode)||((this.lcatCode!= null)&&this.lcatCode.equals(rhs.lcatCode))))&&((this.currentHireDate == rhs.currentHireDate)||((this.currentHireDate!= null)&&this.currentHireDate.equals(rhs.currentHireDate))))&&((this.ssnSuffix == rhs.ssnSuffix)||((this.ssnSuffix!= null)&&this.ssnSuffix.equals(rhs.ssnSuffix))))&&((this.adjServiceDate == rhs.adjServiceDate)||((this.adjServiceDate!= null)&&this.adjServiceDate.equals(rhs.adjServiceDate))))&&((this.eclsCode == rhs.eclsCode)||((this.eclsCode!= null)&&this.eclsCode.equals(rhs.eclsCode))))&&((this.i9ExpireDate == rhs.i9ExpireDate)||((this.i9ExpireDate!= null)&&this.i9ExpireDate.equals(rhs.i9ExpireDate))))&&((this.orgnCodeDist == rhs.orgnCodeDist)||((this.orgnCodeDist!= null)&&this.orgnCodeDist.equals(rhs.orgnCodeDist))))&&((this.firstHireDate == rhs.firstHireDate)||((this.firstHireDate!= null)&&this.firstHireDate.equals(rhs.firstHireDate))))&&((this.treaCode == rhs.treaCode)||((this.treaCode!= null)&&this.treaCode.equals(rhs.treaCode))))&&((this.etaxConsentInd == rhs.etaxConsentInd)||((this.etaxConsentInd!= null)&&this.etaxConsentInd.equals(rhs.etaxConsentInd))))&&((this.lreaCode == rhs.lreaCode)||((this.lreaCode!= null)&&this.lreaCode.equals(rhs.lreaCode))))&&((this.stgrCode == rhs.stgrCode)||((this.stgrCode!= null)&&this.stgrCode.equals(rhs.stgrCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.orgnCodeHome == rhs.orgnCodeHome)||((this.orgnCodeHome!= null)&&this.orgnCodeHome.equals(rhs.orgnCodeHome))))&&((this.ipedsMedDentalInd == rhs.ipedsMedDentalInd)||((this.ipedsMedDentalInd!= null)&&this.ipedsMedDentalInd.equals(rhs.ipedsMedDentalInd))))&&((this.seniorityDate == rhs.seniorityDate)||((this.seniorityDate!= null)&&this.seniorityDate.equals(rhs.seniorityDate))))&&((this.califPensionInd == rhs.califPensionInd)||((this.califPensionInd!= null)&&this.califPensionInd.equals(rhs.califPensionInd))));
    }

}
