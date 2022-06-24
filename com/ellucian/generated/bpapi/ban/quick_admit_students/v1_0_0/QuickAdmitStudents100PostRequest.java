
package com.ellucian.generated.bpapi.ban.quick_admit_students.v1_0_0;

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
    "streetLine2",
    "cntyCode",
    "mrtlCode",
    "streetLine1",
    "spraddrCorrectionDigit",
    "sorlcurKeyNo",
    "sorlfosMajrCode",
    "streetLine3",
    "veraInd",
    "ssn",
    "activeDutySeprDate",
    "deadInd",
    "statusInd",
    "id",
    "sorlcurLevlCode",
    "persSex",
    "zip",
    "deliveryPoint",
    "sorlcurCollCode",
    "sorlcurPriorityNo",
    "addAdmInd",
    "resdCode",
    "asrcCode",
    "stdadapAdmtCode",
    "confidInd",
    "fromDate",
    "phoneNumber",
    "ststCode",
    "citzCode",
    "stdappdApdcCode",
    "phoneArea",
    "sorlcurTerCodeCtlg",
    "sdvetInd",
    "raceCde",
    "levlCode",
    "deadDate",
    "city",
    "edlvCode",
    "sorlcurDegcCode",
    "carrierRoute",
    "relgCode",
    "ethnCode",
    "rateCode",
    "ethnCde",
    "fullPartInd",
    "phoneExt",
    "confirmedReDate",
    "statCode",
    "natnCode",
    "stdrecrSbgiCode",
    "sorlfosDeptCode",
    "toDate",
    "lgcyCode",
    "armedServMedVetInd",
    "sorlfosCstsCode",
    "birthDate",
    "sorlcurCampCode",
    "teleCode",
    "sorlfosLfstCode",
    "vetcFileNumber",
    "sorlfosPriorityNo",
    "egolCode",
    "addRecrInd",
    "sorlcurProgram",
    "stypCode",
    "stdadapApstCode",
    "confirmedReCde",
    "atypCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class QuickAdmitStudents100PostRequest {

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE2")
    private String streetLine2;
    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty")
    private String cntyCode;
    /**
     * Marital Status
     * <p>
     * Lineage reference object : SPBPERS_MRTL_CODE, Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("mrtlCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_MRTL_CODE, Lookup lineage reference object : stvmrtl")
    private String mrtlCode;
    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE1")
    private String streetLine1;
    /**
     * Correction Digit
     * <p>
     * Lineage reference object : SPRADDR_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("spraddrCorrectionDigit")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CORRECTION_DIGIT")
    private Double spraddrCorrectionDigit;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("sorlcurKeyNo")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp")
    private Double sorlcurKeyNo;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("sorlfosMajrCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos")
    private String sorlfosMajrCode;
    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STREET_LINE3")
    private String streetLine3;
    /**
     * Veteran Classification
     * <p>
     * Lineage reference object : SPBPERS_VERA_IND
     * 
     */
    @JsonProperty("veraInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_VERA_IND")
    private String veraInd;
    /**
     * SSN ...
     * <p>
     * Lineage reference object : SPBPERS_SSN
     * 
     */
    @JsonProperty("ssn")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_SSN")
    private String ssn;
    /**
     * Date of Discharge
     * <p>
     * Lineage reference object : SPBPERS_ACTIVE_DUTY_SEPR_DATE
     * 
     */
    @JsonProperty("activeDutySeprDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ACTIVE_DUTY_SEPR_DATE")
    private Date activeDutySeprDate;
    /**
     * Deceased
     * <p>
     * Lineage reference object : SPBPERS_DEAD_IND
     * 
     */
    @JsonProperty("deadInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_DEAD_IND")
    private String deadInd;
    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STATUS_IND")
    private String statusInd;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("sorlcurLevlCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String sorlcurLevlCode;
    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("persSex")
    private String persSex;
    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ZIP")
    private String zip;
    /**
     * Delivery Point
     * <p>
     * Lineage reference object : SPRADDR_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_DELIVERY_POINT")
    private Double deliveryPoint;
    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sorlcurCollCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String sorlcurCollCode;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlcurPriorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_PRIORITY_NO")
    private Double sorlcurPriorityNo;
    /**
     * Create Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addAdmInd")
    private String addAdmInd;
    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd")
    private String resdCode;
    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("asrcCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc")
    private String asrcCode;
    /**
     * Admission Type
     * <p>
     * Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("stdadapAdmtCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvadmt")
    private String stdadapAdmtCode;
    /**
     * Confidential
     * <p>
     * Lineage reference object : SPBPERS_CONFID_IND
     * 
     */
    @JsonProperty("confidInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_CONFID_IND")
    private String confidInd;
    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_FROM_DATE")
    private Date fromDate;
    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst")
    private String ststCode;
    /**
     * Citizenship
     * <p>
     * Lineage reference object : SPBPERS_CITZ_CODE, Lookup lineage reference object : stvcitz
     * 
     */
    @JsonProperty("citzCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_CITZ_CODE, Lookup lineage reference object : stvcitz")
    private String citzCode;
    /**
     * Admission Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("stdappdApdcCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapdc")
    private String stdappdApdcCode;
    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneArea")
    private String phoneArea;
    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlcurTerCodeCtlg")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm")
    private String sorlcurTerCodeCtlg;
    /**
     * Disabled Veteran
     * <p>
     * Lineage reference object : SPBPERS_SDVET_IND
     * 
     */
    @JsonProperty("sdvetInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_SDVET_IND")
    private String sdvetInd;
    /**
     * Race
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    @JsonPropertyDescription("Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace")
    private String raceCde;
    /**
     * Level
     * <p>
     * Lineage reference object : keyblocLevlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : keyblocLevlCode, Lookup lineage reference object : stvlevl")
    private String levlCode;
    /**
     * Deceased Date
     * <p>
     * Lineage reference object : SPBPERS_DEAD_DATE
     * 
     */
    @JsonProperty("deadDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_DEAD_DATE")
    private Date deadDate;
    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CITY")
    private String city;
    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv")
    private String edlvCode;
    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sorlcurDegcCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String sorlcurDegcCode;
    /**
     * Carrier Route
     * <p>
     * Lineage reference object : SPRADDR_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_CARRIER_ROUTE")
    private String carrierRoute;
    /**
     * Religion
     * <p>
     * Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg
     * 
     */
    @JsonProperty("relgCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg")
    private String relgCode;
    /**
     * Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CODE, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ETHN_CODE, Lookup lineage reference object : stvethn")
    private String ethnCode;
    /**
     * Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate")
    private String rateCode;
    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CDE
     * 
     */
    @JsonProperty("ethnCde")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ETHN_CDE")
    private String ethnCde;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_FULL_PART_IND")
    private String fullPartInd;
    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExt")
    private String phoneExt;
    /**
     * Ethnicity and Race Confirmed Date
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_DATE
     * 
     */
    @JsonProperty("confirmedReDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_CONFIRMED_RE_DATE")
    private Date confirmedReDate;
    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Primary Source
     * <p>
     * Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("stdrecrSbgiCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvsbgi")
    private String stdrecrSbgiCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sorlfosDeptCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String sorlfosDeptCode;
    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("toDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_TO_DATE")
    private Date toDate;
    /**
     * Legacy
     * <p>
     * Lineage reference object : SPBPERS_LGCY_CODE, Lookup lineage reference object : stvlgcy
     * 
     */
    @JsonProperty("lgcyCode")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_LGCY_CODE, Lookup lineage reference object : stvlgcy")
    private String lgcyCode;
    /**
     * Armed Forces Service Medal Indicator
     * <p>
     * Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND
     * 
     */
    @JsonProperty("armedServMedVetInd")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND")
    private String armedServMedVetInd;
    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("sorlfosCstsCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts")
    private String sorlfosCstsCode;
    /**
     * Birth Date
     * <p>
     * Lineage reference object : SPBPERS_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_BIRTH_DATE")
    private Date birthDate;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("sorlcurCampCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String sorlcurCampCode;
    /**
     * Telephone Type
     * <p>
     * Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvtele")
    private String teleCode;
    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("sorlfosLfstCode")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst")
    private String sorlfosLfstCode;
    /**
     * Veteran File Number
     * <p>
     * Lineage reference object : SPBPERS_VETC_FILE_NUMBER
     * 
     */
    @JsonProperty("vetcFileNumber")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_VETC_FILE_NUMBER")
    private String vetcFileNumber;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_PRIORITY_NO")
    private Double sorlfosPriorityNo;
    /**
     * Education Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String egolCode;
    /**
     * Create Recruit Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addRecrInd")
    private String addRecrInd;
    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("sorlcurProgram")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle")
    private String sorlcurProgram;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String stypCode;
    /**
     * Application Status
     * <p>
     * Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("stdadapApstCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvapst")
    private String stdadapApstCode;
    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_CDE
     * 
     */
    @JsonProperty("confirmedReCde")
    @JsonPropertyDescription("Lineage reference object : SPBPERS_CONFIRMED_RE_CDE")
    private String confirmedReCde;
    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp")
    private String atypCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Street Line 2
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE2
     * 
     */
    @JsonProperty("streetLine2")
    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public QuickAdmitStudents100PostRequest withStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public String getCntyCode() {
        return cntyCode;
    }

    /**
     * County
     * <p>
     * Lineage reference object : SPRADDR_CNTY_CODE, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCode")
    public void setCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
    }

    public QuickAdmitStudents100PostRequest withCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
        return this;
    }

    /**
     * Marital Status
     * <p>
     * Lineage reference object : SPBPERS_MRTL_CODE, Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("mrtlCode")
    public String getMrtlCode() {
        return mrtlCode;
    }

    /**
     * Marital Status
     * <p>
     * Lineage reference object : SPBPERS_MRTL_CODE, Lookup lineage reference object : stvmrtl
     * 
     */
    @JsonProperty("mrtlCode")
    public void setMrtlCode(String mrtlCode) {
        this.mrtlCode = mrtlCode;
    }

    public QuickAdmitStudents100PostRequest withMrtlCode(String mrtlCode) {
        this.mrtlCode = mrtlCode;
        return this;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Street Line 1
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE1
     * 
     */
    @JsonProperty("streetLine1")
    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public QuickAdmitStudents100PostRequest withStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : SPRADDR_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("spraddrCorrectionDigit")
    public Double getSpraddrCorrectionDigit() {
        return spraddrCorrectionDigit;
    }

    /**
     * Correction Digit
     * <p>
     * Lineage reference object : SPRADDR_CORRECTION_DIGIT
     * 
     */
    @JsonProperty("spraddrCorrectionDigit")
    public void setSpraddrCorrectionDigit(Double spraddrCorrectionDigit) {
        this.spraddrCorrectionDigit = spraddrCorrectionDigit;
    }

    public QuickAdmitStudents100PostRequest withSpraddrCorrectionDigit(Double spraddrCorrectionDigit) {
        this.spraddrCorrectionDigit = spraddrCorrectionDigit;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("sorlcurKeyNo")
    public Double getSorlcurKeyNo() {
        return sorlcurKeyNo;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("sorlcurKeyNo")
    public void setSorlcurKeyNo(Double sorlcurKeyNo) {
        this.sorlcurKeyNo = sorlcurKeyNo;
    }

    public QuickAdmitStudents100PostRequest withSorlcurKeyNo(Double sorlcurKeyNo) {
        this.sorlcurKeyNo = sorlcurKeyNo;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("sorlfosMajrCode")
    public String getSorlfosMajrCode() {
        return sorlfosMajrCode;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SOVLFOS_MAJR_CODE, Lookup lineage reference object : stvmajr,sovlfos
     * 
     */
    @JsonProperty("sorlfosMajrCode")
    public void setSorlfosMajrCode(String sorlfosMajrCode) {
        this.sorlfosMajrCode = sorlfosMajrCode;
    }

    public QuickAdmitStudents100PostRequest withSorlfosMajrCode(String sorlfosMajrCode) {
        this.sorlfosMajrCode = sorlfosMajrCode;
        return this;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public String getStreetLine3() {
        return streetLine3;
    }

    /**
     * Street Line 3
     * <p>
     * Lineage reference object : SPRADDR_STREET_LINE3
     * 
     */
    @JsonProperty("streetLine3")
    public void setStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
    }

    public QuickAdmitStudents100PostRequest withStreetLine3(String streetLine3) {
        this.streetLine3 = streetLine3;
        return this;
    }

    /**
     * Veteran Classification
     * <p>
     * Lineage reference object : SPBPERS_VERA_IND
     * 
     */
    @JsonProperty("veraInd")
    public String getVeraInd() {
        return veraInd;
    }

    /**
     * Veteran Classification
     * <p>
     * Lineage reference object : SPBPERS_VERA_IND
     * 
     */
    @JsonProperty("veraInd")
    public void setVeraInd(String veraInd) {
        this.veraInd = veraInd;
    }

    public QuickAdmitStudents100PostRequest withVeraInd(String veraInd) {
        this.veraInd = veraInd;
        return this;
    }

    /**
     * SSN ...
     * <p>
     * Lineage reference object : SPBPERS_SSN
     * 
     */
    @JsonProperty("ssn")
    public String getSsn() {
        return ssn;
    }

    /**
     * SSN ...
     * <p>
     * Lineage reference object : SPBPERS_SSN
     * 
     */
    @JsonProperty("ssn")
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public QuickAdmitStudents100PostRequest withSsn(String ssn) {
        this.ssn = ssn;
        return this;
    }

    /**
     * Date of Discharge
     * <p>
     * Lineage reference object : SPBPERS_ACTIVE_DUTY_SEPR_DATE
     * 
     */
    @JsonProperty("activeDutySeprDate")
    public Date getActiveDutySeprDate() {
        return activeDutySeprDate;
    }

    /**
     * Date of Discharge
     * <p>
     * Lineage reference object : SPBPERS_ACTIVE_DUTY_SEPR_DATE
     * 
     */
    @JsonProperty("activeDutySeprDate")
    public void setActiveDutySeprDate(Date activeDutySeprDate) {
        this.activeDutySeprDate = activeDutySeprDate;
    }

    public QuickAdmitStudents100PostRequest withActiveDutySeprDate(Date activeDutySeprDate) {
        this.activeDutySeprDate = activeDutySeprDate;
        return this;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SPBPERS_DEAD_IND
     * 
     */
    @JsonProperty("deadInd")
    public String getDeadInd() {
        return deadInd;
    }

    /**
     * Deceased
     * <p>
     * Lineage reference object : SPBPERS_DEAD_IND
     * 
     */
    @JsonProperty("deadInd")
    public void setDeadInd(String deadInd) {
        this.deadInd = deadInd;
    }

    public QuickAdmitStudents100PostRequest withDeadInd(String deadInd) {
        this.deadInd = deadInd;
        return this;
    }

    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Inactivate Address
     * <p>
     * Lineage reference object : SPRADDR_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public QuickAdmitStudents100PostRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public QuickAdmitStudents100PostRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("sorlcurLevlCode")
    public String getSorlcurLevlCode() {
        return sorlcurLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("sorlcurLevlCode")
    public void setSorlcurLevlCode(String sorlcurLevlCode) {
        this.sorlcurLevlCode = sorlcurLevlCode;
    }

    public QuickAdmitStudents100PostRequest withSorlcurLevlCode(String sorlcurLevlCode) {
        this.sorlcurLevlCode = sorlcurLevlCode;
        return this;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("persSex")
    public String getPersSex() {
        return persSex;
    }

    /**
     * Gender
     * <p>
     * 
     * 
     */
    @JsonProperty("persSex")
    public void setPersSex(String persSex) {
        this.persSex = persSex;
    }

    public QuickAdmitStudents100PostRequest withPersSex(String persSex) {
        this.persSex = persSex;
        return this;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * ZIP or Postal Code
     * <p>
     * Lineage reference object : SPRADDR_ZIP
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public QuickAdmitStudents100PostRequest withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : SPRADDR_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public Double getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Delivery Point
     * <p>
     * Lineage reference object : SPRADDR_DELIVERY_POINT
     * 
     */
    @JsonProperty("deliveryPoint")
    public void setDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public QuickAdmitStudents100PostRequest withDeliveryPoint(Double deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sorlcurCollCode")
    public String getSorlcurCollCode() {
        return sorlcurCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sorlcurCollCode")
    public void setSorlcurCollCode(String sorlcurCollCode) {
        this.sorlcurCollCode = sorlcurCollCode;
    }

    public QuickAdmitStudents100PostRequest withSorlcurCollCode(String sorlcurCollCode) {
        this.sorlcurCollCode = sorlcurCollCode;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlcurPriorityNo")
    public Double getSorlcurPriorityNo() {
        return sorlcurPriorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlcurPriorityNo")
    public void setSorlcurPriorityNo(Double sorlcurPriorityNo) {
        this.sorlcurPriorityNo = sorlcurPriorityNo;
    }

    public QuickAdmitStudents100PostRequest withSorlcurPriorityNo(Double sorlcurPriorityNo) {
        this.sorlcurPriorityNo = sorlcurPriorityNo;
        return this;
    }

    /**
     * Create Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addAdmInd")
    public String getAddAdmInd() {
        return addAdmInd;
    }

    /**
     * Create Application Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addAdmInd")
    public void setAddAdmInd(String addAdmInd) {
        this.addAdmInd = addAdmInd;
    }

    public QuickAdmitStudents100PostRequest withAddAdmInd(String addAdmInd) {
        this.addAdmInd = addAdmInd;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public QuickAdmitStudents100PostRequest withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("asrcCode")
    public String getAsrcCode() {
        return asrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SPRADDR_ASRC_CODE, Lookup lineage reference object : stvasrc
     * 
     */
    @JsonProperty("asrcCode")
    public void setAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
    }

    public QuickAdmitStudents100PostRequest withAsrcCode(String asrcCode) {
        this.asrcCode = asrcCode;
        return this;
    }

    /**
     * Admission Type
     * <p>
     * Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("stdadapAdmtCode")
    public String getStdadapAdmtCode() {
        return stdadapAdmtCode;
    }

    /**
     * Admission Type
     * <p>
     * Lookup lineage reference object : stvadmt
     * 
     */
    @JsonProperty("stdadapAdmtCode")
    public void setStdadapAdmtCode(String stdadapAdmtCode) {
        this.stdadapAdmtCode = stdadapAdmtCode;
    }

    public QuickAdmitStudents100PostRequest withStdadapAdmtCode(String stdadapAdmtCode) {
        this.stdadapAdmtCode = stdadapAdmtCode;
        return this;
    }

    /**
     * Confidential
     * <p>
     * Lineage reference object : SPBPERS_CONFID_IND
     * 
     */
    @JsonProperty("confidInd")
    public String getConfidInd() {
        return confidInd;
    }

    /**
     * Confidential
     * <p>
     * Lineage reference object : SPBPERS_CONFID_IND
     * 
     */
    @JsonProperty("confidInd")
    public void setConfidInd(String confidInd) {
        this.confidInd = confidInd;
    }

    public QuickAdmitStudents100PostRequest withConfidInd(String confidInd) {
        this.confidInd = confidInd;
        return this;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * From Date
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public QuickAdmitStudents100PostRequest withFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public QuickAdmitStudents100PostRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    public String getStstCode() {
        return ststCode;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("ststCode")
    public void setStstCode(String ststCode) {
        this.ststCode = ststCode;
    }

    public QuickAdmitStudents100PostRequest withStstCode(String ststCode) {
        this.ststCode = ststCode;
        return this;
    }

    /**
     * Citizenship
     * <p>
     * Lineage reference object : SPBPERS_CITZ_CODE, Lookup lineage reference object : stvcitz
     * 
     */
    @JsonProperty("citzCode")
    public String getCitzCode() {
        return citzCode;
    }

    /**
     * Citizenship
     * <p>
     * Lineage reference object : SPBPERS_CITZ_CODE, Lookup lineage reference object : stvcitz
     * 
     */
    @JsonProperty("citzCode")
    public void setCitzCode(String citzCode) {
        this.citzCode = citzCode;
    }

    public QuickAdmitStudents100PostRequest withCitzCode(String citzCode) {
        this.citzCode = citzCode;
        return this;
    }

    /**
     * Admission Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("stdappdApdcCode")
    public String getStdappdApdcCode() {
        return stdappdApdcCode;
    }

    /**
     * Admission Decision
     * <p>
     * Lookup lineage reference object : stvapdc
     * 
     */
    @JsonProperty("stdappdApdcCode")
    public void setStdappdApdcCode(String stdappdApdcCode) {
        this.stdappdApdcCode = stdappdApdcCode;
    }

    public QuickAdmitStudents100PostRequest withStdappdApdcCode(String stdappdApdcCode) {
        this.stdappdApdcCode = stdappdApdcCode;
        return this;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public QuickAdmitStudents100PostRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlcurTerCodeCtlg")
    public String getSorlcurTerCodeCtlg() {
        return sorlcurTerCodeCtlg;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlcurTerCodeCtlg")
    public void setSorlcurTerCodeCtlg(String sorlcurTerCodeCtlg) {
        this.sorlcurTerCodeCtlg = sorlcurTerCodeCtlg;
    }

    public QuickAdmitStudents100PostRequest withSorlcurTerCodeCtlg(String sorlcurTerCodeCtlg) {
        this.sorlcurTerCodeCtlg = sorlcurTerCodeCtlg;
        return this;
    }

    /**
     * Disabled Veteran
     * <p>
     * Lineage reference object : SPBPERS_SDVET_IND
     * 
     */
    @JsonProperty("sdvetInd")
    public String getSdvetInd() {
        return sdvetInd;
    }

    /**
     * Disabled Veteran
     * <p>
     * Lineage reference object : SPBPERS_SDVET_IND
     * 
     */
    @JsonProperty("sdvetInd")
    public void setSdvetInd(String sdvetInd) {
        this.sdvetInd = sdvetInd;
    }

    public QuickAdmitStudents100PostRequest withSdvetInd(String sdvetInd) {
        this.sdvetInd = sdvetInd;
        return this;
    }

    /**
     * Race
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    public String getRaceCde() {
        return raceCde;
    }

    /**
     * Race
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    public void setRaceCde(String raceCde) {
        this.raceCde = raceCde;
    }

    public QuickAdmitStudents100PostRequest withRaceCde(String raceCde) {
        this.raceCde = raceCde;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : keyblocLevlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : keyblocLevlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public QuickAdmitStudents100PostRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Deceased Date
     * <p>
     * Lineage reference object : SPBPERS_DEAD_DATE
     * 
     */
    @JsonProperty("deadDate")
    public Date getDeadDate() {
        return deadDate;
    }

    /**
     * Deceased Date
     * <p>
     * Lineage reference object : SPBPERS_DEAD_DATE
     * 
     */
    @JsonProperty("deadDate")
    public void setDeadDate(Date deadDate) {
        this.deadDate = deadDate;
    }

    public QuickAdmitStudents100PostRequest withDeadDate(Date deadDate) {
        this.deadDate = deadDate;
        return this;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * Lineage reference object : SPRADDR_CITY
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public QuickAdmitStudents100PostRequest withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public String getEdlvCode() {
        return edlvCode;
    }

    /**
     * Education Level
     * <p>
     * Lineage reference object : SGBSTDN_EDLV_CODE, Lookup lineage reference object : stvedlv
     * 
     */
    @JsonProperty("edlvCode")
    public void setEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
    }

    public QuickAdmitStudents100PostRequest withEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sorlcurDegcCode")
    public String getSorlcurDegcCode() {
        return sorlcurDegcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sorlcurDegcCode")
    public void setSorlcurDegcCode(String sorlcurDegcCode) {
        this.sorlcurDegcCode = sorlcurDegcCode;
    }

    public QuickAdmitStudents100PostRequest withSorlcurDegcCode(String sorlcurDegcCode) {
        this.sorlcurDegcCode = sorlcurDegcCode;
        return this;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : SPRADDR_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public String getCarrierRoute() {
        return carrierRoute;
    }

    /**
     * Carrier Route
     * <p>
     * Lineage reference object : SPRADDR_CARRIER_ROUTE
     * 
     */
    @JsonProperty("carrierRoute")
    public void setCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    public QuickAdmitStudents100PostRequest withCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
        return this;
    }

    /**
     * Religion
     * <p>
     * Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg
     * 
     */
    @JsonProperty("relgCode")
    public String getRelgCode() {
        return relgCode;
    }

    /**
     * Religion
     * <p>
     * Lineage reference object : SPBPERS_RELG_CODE, Lookup lineage reference object : stvrelg
     * 
     */
    @JsonProperty("relgCode")
    public void setRelgCode(String relgCode) {
        this.relgCode = relgCode;
    }

    public QuickAdmitStudents100PostRequest withRelgCode(String relgCode) {
        this.relgCode = relgCode;
        return this;
    }

    /**
     * Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CODE, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    public String getEthnCode() {
        return ethnCode;
    }

    /**
     * Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CODE, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    public void setEthnCode(String ethnCode) {
        this.ethnCode = ethnCode;
    }

    public QuickAdmitStudents100PostRequest withEthnCode(String ethnCode) {
        this.ethnCode = ethnCode;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public QuickAdmitStudents100PostRequest withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CDE
     * 
     */
    @JsonProperty("ethnCde")
    public String getEthnCde() {
        return ethnCde;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : SPBPERS_ETHN_CDE
     * 
     */
    @JsonProperty("ethnCde")
    public void setEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
    }

    public QuickAdmitStudents100PostRequest withEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public QuickAdmitStudents100PostRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExt")
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Extension
     * <p>
     * 
     * 
     */
    @JsonProperty("phoneExt")
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public QuickAdmitStudents100PostRequest withPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
        return this;
    }

    /**
     * Ethnicity and Race Confirmed Date
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_DATE
     * 
     */
    @JsonProperty("confirmedReDate")
    public Date getConfirmedReDate() {
        return confirmedReDate;
    }

    /**
     * Ethnicity and Race Confirmed Date
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_DATE
     * 
     */
    @JsonProperty("confirmedReDate")
    public void setConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
    }

    public QuickAdmitStudents100PostRequest withConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : SPRADDR_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public QuickAdmitStudents100PostRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation
     * <p>
     * Lineage reference object : SPRADDR_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public QuickAdmitStudents100PostRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Primary Source
     * <p>
     * Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("stdrecrSbgiCode")
    public String getStdrecrSbgiCode() {
        return stdrecrSbgiCode;
    }

    /**
     * Primary Source
     * <p>
     * Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("stdrecrSbgiCode")
    public void setStdrecrSbgiCode(String stdrecrSbgiCode) {
        this.stdrecrSbgiCode = stdrecrSbgiCode;
    }

    public QuickAdmitStudents100PostRequest withStdrecrSbgiCode(String stdrecrSbgiCode) {
        this.stdrecrSbgiCode = stdrecrSbgiCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sorlfosDeptCode")
    public String getSorlfosDeptCode() {
        return sorlfosDeptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SOVLFOS_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("sorlfosDeptCode")
    public void setSorlfosDeptCode(String sorlfosDeptCode) {
        this.sorlfosDeptCode = sorlfosDeptCode;
    }

    public QuickAdmitStudents100PostRequest withSorlfosDeptCode(String sorlfosDeptCode) {
        this.sorlfosDeptCode = sorlfosDeptCode;
        return this;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("toDate")
    public Date getToDate() {
        return toDate;
    }

    /**
     * To Date
     * <p>
     * Lineage reference object : SPRADDR_TO_DATE
     * 
     */
    @JsonProperty("toDate")
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public QuickAdmitStudents100PostRequest withToDate(Date toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Legacy
     * <p>
     * Lineage reference object : SPBPERS_LGCY_CODE, Lookup lineage reference object : stvlgcy
     * 
     */
    @JsonProperty("lgcyCode")
    public String getLgcyCode() {
        return lgcyCode;
    }

    /**
     * Legacy
     * <p>
     * Lineage reference object : SPBPERS_LGCY_CODE, Lookup lineage reference object : stvlgcy
     * 
     */
    @JsonProperty("lgcyCode")
    public void setLgcyCode(String lgcyCode) {
        this.lgcyCode = lgcyCode;
    }

    public QuickAdmitStudents100PostRequest withLgcyCode(String lgcyCode) {
        this.lgcyCode = lgcyCode;
        return this;
    }

    /**
     * Armed Forces Service Medal Indicator
     * <p>
     * Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND
     * 
     */
    @JsonProperty("armedServMedVetInd")
    public String getArmedServMedVetInd() {
        return armedServMedVetInd;
    }

    /**
     * Armed Forces Service Medal Indicator
     * <p>
     * Lineage reference object : SPBPERS_ARMED_SERV_MED_VET_IND
     * 
     */
    @JsonProperty("armedServMedVetInd")
    public void setArmedServMedVetInd(String armedServMedVetInd) {
        this.armedServMedVetInd = armedServMedVetInd;
    }

    public QuickAdmitStudents100PostRequest withArmedServMedVetInd(String armedServMedVetInd) {
        this.armedServMedVetInd = armedServMedVetInd;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("sorlfosCstsCode")
    public String getSorlfosCstsCode() {
        return sorlfosCstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SOVLFOS_CSTS_CODE, Lookup lineage reference object : stvcsts
     * 
     */
    @JsonProperty("sorlfosCstsCode")
    public void setSorlfosCstsCode(String sorlfosCstsCode) {
        this.sorlfosCstsCode = sorlfosCstsCode;
    }

    public QuickAdmitStudents100PostRequest withSorlfosCstsCode(String sorlfosCstsCode) {
        this.sorlfosCstsCode = sorlfosCstsCode;
        return this;
    }

    /**
     * Birth Date
     * <p>
     * Lineage reference object : SPBPERS_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Birth Date
     * <p>
     * Lineage reference object : SPBPERS_BIRTH_DATE
     * 
     */
    @JsonProperty("birthDate")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public QuickAdmitStudents100PostRequest withBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("sorlcurCampCode")
    public String getSorlcurCampCode() {
        return sorlcurCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("sorlcurCampCode")
    public void setSorlcurCampCode(String sorlcurCampCode) {
        this.sorlcurCampCode = sorlcurCampCode;
    }

    public QuickAdmitStudents100PostRequest withSorlcurCampCode(String sorlcurCampCode) {
        this.sorlcurCampCode = sorlcurCampCode;
        return this;
    }

    /**
     * Telephone Type
     * <p>
     * Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    public String getTeleCode() {
        return teleCode;
    }

    /**
     * Telephone Type
     * <p>
     * Lookup lineage reference object : stvtele
     * 
     */
    @JsonProperty("teleCode")
    public void setTeleCode(String teleCode) {
        this.teleCode = teleCode;
    }

    public QuickAdmitStudents100PostRequest withTeleCode(String teleCode) {
        this.teleCode = teleCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("sorlfosLfstCode")
    public String getSorlfosLfstCode() {
        return sorlfosLfstCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SOVLFOS_LFST_CODE, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("sorlfosLfstCode")
    public void setSorlfosLfstCode(String sorlfosLfstCode) {
        this.sorlfosLfstCode = sorlfosLfstCode;
    }

    public QuickAdmitStudents100PostRequest withSorlfosLfstCode(String sorlfosLfstCode) {
        this.sorlfosLfstCode = sorlfosLfstCode;
        return this;
    }

    /**
     * Veteran File Number
     * <p>
     * Lineage reference object : SPBPERS_VETC_FILE_NUMBER
     * 
     */
    @JsonProperty("vetcFileNumber")
    public String getVetcFileNumber() {
        return vetcFileNumber;
    }

    /**
     * Veteran File Number
     * <p>
     * Lineage reference object : SPBPERS_VETC_FILE_NUMBER
     * 
     */
    @JsonProperty("vetcFileNumber")
    public void setVetcFileNumber(String vetcFileNumber) {
        this.vetcFileNumber = vetcFileNumber;
    }

    public QuickAdmitStudents100PostRequest withVetcFileNumber(String vetcFileNumber) {
        this.vetcFileNumber = vetcFileNumber;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    public Double getSorlfosPriorityNo() {
        return sorlfosPriorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLFOS_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlfosPriorityNo")
    public void setSorlfosPriorityNo(Double sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
    }

    public QuickAdmitStudents100PostRequest withSorlfosPriorityNo(Double sorlfosPriorityNo) {
        this.sorlfosPriorityNo = sorlfosPriorityNo;
        return this;
    }

    /**
     * Education Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public String getEgolCode() {
        return egolCode;
    }

    /**
     * Education Goal
     * <p>
     * Lineage reference object : SGBSTDN_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public void setEgolCode(String egolCode) {
        this.egolCode = egolCode;
    }

    public QuickAdmitStudents100PostRequest withEgolCode(String egolCode) {
        this.egolCode = egolCode;
        return this;
    }

    /**
     * Create Recruit Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addRecrInd")
    public String getAddRecrInd() {
        return addRecrInd;
    }

    /**
     * Create Recruit Record
     * <p>
     * 
     * 
     */
    @JsonProperty("addRecrInd")
    public void setAddRecrInd(String addRecrInd) {
        this.addRecrInd = addRecrInd;
    }

    public QuickAdmitStudents100PostRequest withAddRecrInd(String addRecrInd) {
        this.addRecrInd = addRecrInd;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("sorlcurProgram")
    public String getSorlcurProgram() {
        return sorlcurProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("sorlcurProgram")
    public void setSorlcurProgram(String sorlcurProgram) {
        this.sorlcurProgram = sorlcurProgram;
    }

    public QuickAdmitStudents100PostRequest withSorlcurProgram(String sorlcurProgram) {
        this.sorlcurProgram = sorlcurProgram;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public QuickAdmitStudents100PostRequest withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    /**
     * Application Status
     * <p>
     * Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("stdadapApstCode")
    public String getStdadapApstCode() {
        return stdadapApstCode;
    }

    /**
     * Application Status
     * <p>
     * Lookup lineage reference object : stvapst
     * 
     */
    @JsonProperty("stdadapApstCode")
    public void setStdadapApstCode(String stdadapApstCode) {
        this.stdadapApstCode = stdadapApstCode;
    }

    public QuickAdmitStudents100PostRequest withStdadapApstCode(String stdadapApstCode) {
        this.stdadapApstCode = stdadapApstCode;
        return this;
    }

    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_CDE
     * 
     */
    @JsonProperty("confirmedReCde")
    public String getConfirmedReCde() {
        return confirmedReCde;
    }

    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : SPBPERS_CONFIRMED_RE_CDE
     * 
     */
    @JsonProperty("confirmedReCde")
    public void setConfirmedReCde(String confirmedReCde) {
        this.confirmedReCde = confirmedReCde;
    }

    public QuickAdmitStudents100PostRequest withConfirmedReCde(String confirmedReCde) {
        this.confirmedReCde = confirmedReCde;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : SPRADDR_ATYP_CODE, Lookup lineage reference object : stvatyp
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public QuickAdmitStudents100PostRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public QuickAdmitStudents100PostRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public QuickAdmitStudents100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuickAdmitStudents100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streetLine2");
        sb.append('=');
        sb.append(((this.streetLine2 == null)?"<null>":this.streetLine2));
        sb.append(',');
        sb.append("cntyCode");
        sb.append('=');
        sb.append(((this.cntyCode == null)?"<null>":this.cntyCode));
        sb.append(',');
        sb.append("mrtlCode");
        sb.append('=');
        sb.append(((this.mrtlCode == null)?"<null>":this.mrtlCode));
        sb.append(',');
        sb.append("streetLine1");
        sb.append('=');
        sb.append(((this.streetLine1 == null)?"<null>":this.streetLine1));
        sb.append(',');
        sb.append("spraddrCorrectionDigit");
        sb.append('=');
        sb.append(((this.spraddrCorrectionDigit == null)?"<null>":this.spraddrCorrectionDigit));
        sb.append(',');
        sb.append("sorlcurKeyNo");
        sb.append('=');
        sb.append(((this.sorlcurKeyNo == null)?"<null>":this.sorlcurKeyNo));
        sb.append(',');
        sb.append("sorlfosMajrCode");
        sb.append('=');
        sb.append(((this.sorlfosMajrCode == null)?"<null>":this.sorlfosMajrCode));
        sb.append(',');
        sb.append("streetLine3");
        sb.append('=');
        sb.append(((this.streetLine3 == null)?"<null>":this.streetLine3));
        sb.append(',');
        sb.append("veraInd");
        sb.append('=');
        sb.append(((this.veraInd == null)?"<null>":this.veraInd));
        sb.append(',');
        sb.append("ssn");
        sb.append('=');
        sb.append(((this.ssn == null)?"<null>":this.ssn));
        sb.append(',');
        sb.append("activeDutySeprDate");
        sb.append('=');
        sb.append(((this.activeDutySeprDate == null)?"<null>":this.activeDutySeprDate));
        sb.append(',');
        sb.append("deadInd");
        sb.append('=');
        sb.append(((this.deadInd == null)?"<null>":this.deadInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sorlcurLevlCode");
        sb.append('=');
        sb.append(((this.sorlcurLevlCode == null)?"<null>":this.sorlcurLevlCode));
        sb.append(',');
        sb.append("persSex");
        sb.append('=');
        sb.append(((this.persSex == null)?"<null>":this.persSex));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("deliveryPoint");
        sb.append('=');
        sb.append(((this.deliveryPoint == null)?"<null>":this.deliveryPoint));
        sb.append(',');
        sb.append("sorlcurCollCode");
        sb.append('=');
        sb.append(((this.sorlcurCollCode == null)?"<null>":this.sorlcurCollCode));
        sb.append(',');
        sb.append("sorlcurPriorityNo");
        sb.append('=');
        sb.append(((this.sorlcurPriorityNo == null)?"<null>":this.sorlcurPriorityNo));
        sb.append(',');
        sb.append("addAdmInd");
        sb.append('=');
        sb.append(((this.addAdmInd == null)?"<null>":this.addAdmInd));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("asrcCode");
        sb.append('=');
        sb.append(((this.asrcCode == null)?"<null>":this.asrcCode));
        sb.append(',');
        sb.append("stdadapAdmtCode");
        sb.append('=');
        sb.append(((this.stdadapAdmtCode == null)?"<null>":this.stdadapAdmtCode));
        sb.append(',');
        sb.append("confidInd");
        sb.append('=');
        sb.append(((this.confidInd == null)?"<null>":this.confidInd));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("citzCode");
        sb.append('=');
        sb.append(((this.citzCode == null)?"<null>":this.citzCode));
        sb.append(',');
        sb.append("stdappdApdcCode");
        sb.append('=');
        sb.append(((this.stdappdApdcCode == null)?"<null>":this.stdappdApdcCode));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("sorlcurTerCodeCtlg");
        sb.append('=');
        sb.append(((this.sorlcurTerCodeCtlg == null)?"<null>":this.sorlcurTerCodeCtlg));
        sb.append(',');
        sb.append("sdvetInd");
        sb.append('=');
        sb.append(((this.sdvetInd == null)?"<null>":this.sdvetInd));
        sb.append(',');
        sb.append("raceCde");
        sb.append('=');
        sb.append(((this.raceCde == null)?"<null>":this.raceCde));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("deadDate");
        sb.append('=');
        sb.append(((this.deadDate == null)?"<null>":this.deadDate));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("edlvCode");
        sb.append('=');
        sb.append(((this.edlvCode == null)?"<null>":this.edlvCode));
        sb.append(',');
        sb.append("sorlcurDegcCode");
        sb.append('=');
        sb.append(((this.sorlcurDegcCode == null)?"<null>":this.sorlcurDegcCode));
        sb.append(',');
        sb.append("carrierRoute");
        sb.append('=');
        sb.append(((this.carrierRoute == null)?"<null>":this.carrierRoute));
        sb.append(',');
        sb.append("relgCode");
        sb.append('=');
        sb.append(((this.relgCode == null)?"<null>":this.relgCode));
        sb.append(',');
        sb.append("ethnCode");
        sb.append('=');
        sb.append(((this.ethnCode == null)?"<null>":this.ethnCode));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("ethnCde");
        sb.append('=');
        sb.append(((this.ethnCde == null)?"<null>":this.ethnCde));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("phoneExt");
        sb.append('=');
        sb.append(((this.phoneExt == null)?"<null>":this.phoneExt));
        sb.append(',');
        sb.append("confirmedReDate");
        sb.append('=');
        sb.append(((this.confirmedReDate == null)?"<null>":this.confirmedReDate));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("stdrecrSbgiCode");
        sb.append('=');
        sb.append(((this.stdrecrSbgiCode == null)?"<null>":this.stdrecrSbgiCode));
        sb.append(',');
        sb.append("sorlfosDeptCode");
        sb.append('=');
        sb.append(((this.sorlfosDeptCode == null)?"<null>":this.sorlfosDeptCode));
        sb.append(',');
        sb.append("toDate");
        sb.append('=');
        sb.append(((this.toDate == null)?"<null>":this.toDate));
        sb.append(',');
        sb.append("lgcyCode");
        sb.append('=');
        sb.append(((this.lgcyCode == null)?"<null>":this.lgcyCode));
        sb.append(',');
        sb.append("armedServMedVetInd");
        sb.append('=');
        sb.append(((this.armedServMedVetInd == null)?"<null>":this.armedServMedVetInd));
        sb.append(',');
        sb.append("sorlfosCstsCode");
        sb.append('=');
        sb.append(((this.sorlfosCstsCode == null)?"<null>":this.sorlfosCstsCode));
        sb.append(',');
        sb.append("birthDate");
        sb.append('=');
        sb.append(((this.birthDate == null)?"<null>":this.birthDate));
        sb.append(',');
        sb.append("sorlcurCampCode");
        sb.append('=');
        sb.append(((this.sorlcurCampCode == null)?"<null>":this.sorlcurCampCode));
        sb.append(',');
        sb.append("teleCode");
        sb.append('=');
        sb.append(((this.teleCode == null)?"<null>":this.teleCode));
        sb.append(',');
        sb.append("sorlfosLfstCode");
        sb.append('=');
        sb.append(((this.sorlfosLfstCode == null)?"<null>":this.sorlfosLfstCode));
        sb.append(',');
        sb.append("vetcFileNumber");
        sb.append('=');
        sb.append(((this.vetcFileNumber == null)?"<null>":this.vetcFileNumber));
        sb.append(',');
        sb.append("sorlfosPriorityNo");
        sb.append('=');
        sb.append(((this.sorlfosPriorityNo == null)?"<null>":this.sorlfosPriorityNo));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("addRecrInd");
        sb.append('=');
        sb.append(((this.addRecrInd == null)?"<null>":this.addRecrInd));
        sb.append(',');
        sb.append("sorlcurProgram");
        sb.append('=');
        sb.append(((this.sorlcurProgram == null)?"<null>":this.sorlcurProgram));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("stdadapApstCode");
        sb.append('=');
        sb.append(((this.stdadapApstCode == null)?"<null>":this.stdadapApstCode));
        sb.append(',');
        sb.append("confirmedReCde");
        sb.append('=');
        sb.append(((this.confirmedReCde == null)?"<null>":this.confirmedReCde));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.streetLine2 == null)? 0 :this.streetLine2 .hashCode()));
        result = ((result* 31)+((this.cntyCode == null)? 0 :this.cntyCode.hashCode()));
        result = ((result* 31)+((this.mrtlCode == null)? 0 :this.mrtlCode.hashCode()));
        result = ((result* 31)+((this.streetLine1 == null)? 0 :this.streetLine1 .hashCode()));
        result = ((result* 31)+((this.spraddrCorrectionDigit == null)? 0 :this.spraddrCorrectionDigit.hashCode()));
        result = ((result* 31)+((this.sorlcurKeyNo == null)? 0 :this.sorlcurKeyNo.hashCode()));
        result = ((result* 31)+((this.sorlfosMajrCode == null)? 0 :this.sorlfosMajrCode.hashCode()));
        result = ((result* 31)+((this.streetLine3 == null)? 0 :this.streetLine3 .hashCode()));
        result = ((result* 31)+((this.veraInd == null)? 0 :this.veraInd.hashCode()));
        result = ((result* 31)+((this.ssn == null)? 0 :this.ssn.hashCode()));
        result = ((result* 31)+((this.activeDutySeprDate == null)? 0 :this.activeDutySeprDate.hashCode()));
        result = ((result* 31)+((this.deadInd == null)? 0 :this.deadInd.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.sorlcurLevlCode == null)? 0 :this.sorlcurLevlCode.hashCode()));
        result = ((result* 31)+((this.persSex == null)? 0 :this.persSex.hashCode()));
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.deliveryPoint == null)? 0 :this.deliveryPoint.hashCode()));
        result = ((result* 31)+((this.sorlcurCollCode == null)? 0 :this.sorlcurCollCode.hashCode()));
        result = ((result* 31)+((this.sorlcurPriorityNo == null)? 0 :this.sorlcurPriorityNo.hashCode()));
        result = ((result* 31)+((this.addAdmInd == null)? 0 :this.addAdmInd.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.asrcCode == null)? 0 :this.asrcCode.hashCode()));
        result = ((result* 31)+((this.stdadapAdmtCode == null)? 0 :this.stdadapAdmtCode.hashCode()));
        result = ((result* 31)+((this.confidInd == null)? 0 :this.confidInd.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.citzCode == null)? 0 :this.citzCode.hashCode()));
        result = ((result* 31)+((this.stdappdApdcCode == null)? 0 :this.stdappdApdcCode.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorlcurTerCodeCtlg == null)? 0 :this.sorlcurTerCodeCtlg.hashCode()));
        result = ((result* 31)+((this.sdvetInd == null)? 0 :this.sdvetInd.hashCode()));
        result = ((result* 31)+((this.raceCde == null)? 0 :this.raceCde.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.deadDate == null)? 0 :this.deadDate.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.edlvCode == null)? 0 :this.edlvCode.hashCode()));
        result = ((result* 31)+((this.sorlcurDegcCode == null)? 0 :this.sorlcurDegcCode.hashCode()));
        result = ((result* 31)+((this.carrierRoute == null)? 0 :this.carrierRoute.hashCode()));
        result = ((result* 31)+((this.relgCode == null)? 0 :this.relgCode.hashCode()));
        result = ((result* 31)+((this.ethnCode == null)? 0 :this.ethnCode.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.ethnCde == null)? 0 :this.ethnCde.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.phoneExt == null)? 0 :this.phoneExt.hashCode()));
        result = ((result* 31)+((this.confirmedReDate == null)? 0 :this.confirmedReDate.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.stdrecrSbgiCode == null)? 0 :this.stdrecrSbgiCode.hashCode()));
        result = ((result* 31)+((this.sorlfosDeptCode == null)? 0 :this.sorlfosDeptCode.hashCode()));
        result = ((result* 31)+((this.toDate == null)? 0 :this.toDate.hashCode()));
        result = ((result* 31)+((this.lgcyCode == null)? 0 :this.lgcyCode.hashCode()));
        result = ((result* 31)+((this.armedServMedVetInd == null)? 0 :this.armedServMedVetInd.hashCode()));
        result = ((result* 31)+((this.sorlfosCstsCode == null)? 0 :this.sorlfosCstsCode.hashCode()));
        result = ((result* 31)+((this.birthDate == null)? 0 :this.birthDate.hashCode()));
        result = ((result* 31)+((this.sorlcurCampCode == null)? 0 :this.sorlcurCampCode.hashCode()));
        result = ((result* 31)+((this.teleCode == null)? 0 :this.teleCode.hashCode()));
        result = ((result* 31)+((this.sorlfosLfstCode == null)? 0 :this.sorlfosLfstCode.hashCode()));
        result = ((result* 31)+((this.vetcFileNumber == null)? 0 :this.vetcFileNumber.hashCode()));
        result = ((result* 31)+((this.sorlfosPriorityNo == null)? 0 :this.sorlfosPriorityNo.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.addRecrInd == null)? 0 :this.addRecrInd.hashCode()));
        result = ((result* 31)+((this.sorlcurProgram == null)? 0 :this.sorlcurProgram.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.stdadapApstCode == null)? 0 :this.stdadapApstCode.hashCode()));
        result = ((result* 31)+((this.confirmedReCde == null)? 0 :this.confirmedReCde.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuickAdmitStudents100PostRequest) == false) {
            return false;
        }
        QuickAdmitStudents100PostRequest rhs = ((QuickAdmitStudents100PostRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.streetLine2 == rhs.streetLine2)||((this.streetLine2 != null)&&this.streetLine2 .equals(rhs.streetLine2)))&&((this.cntyCode == rhs.cntyCode)||((this.cntyCode!= null)&&this.cntyCode.equals(rhs.cntyCode))))&&((this.mrtlCode == rhs.mrtlCode)||((this.mrtlCode!= null)&&this.mrtlCode.equals(rhs.mrtlCode))))&&((this.streetLine1 == rhs.streetLine1)||((this.streetLine1 != null)&&this.streetLine1 .equals(rhs.streetLine1))))&&((this.spraddrCorrectionDigit == rhs.spraddrCorrectionDigit)||((this.spraddrCorrectionDigit!= null)&&this.spraddrCorrectionDigit.equals(rhs.spraddrCorrectionDigit))))&&((this.sorlcurKeyNo == rhs.sorlcurKeyNo)||((this.sorlcurKeyNo!= null)&&this.sorlcurKeyNo.equals(rhs.sorlcurKeyNo))))&&((this.sorlfosMajrCode == rhs.sorlfosMajrCode)||((this.sorlfosMajrCode!= null)&&this.sorlfosMajrCode.equals(rhs.sorlfosMajrCode))))&&((this.streetLine3 == rhs.streetLine3)||((this.streetLine3 != null)&&this.streetLine3 .equals(rhs.streetLine3))))&&((this.veraInd == rhs.veraInd)||((this.veraInd!= null)&&this.veraInd.equals(rhs.veraInd))))&&((this.ssn == rhs.ssn)||((this.ssn!= null)&&this.ssn.equals(rhs.ssn))))&&((this.activeDutySeprDate == rhs.activeDutySeprDate)||((this.activeDutySeprDate!= null)&&this.activeDutySeprDate.equals(rhs.activeDutySeprDate))))&&((this.deadInd == rhs.deadInd)||((this.deadInd!= null)&&this.deadInd.equals(rhs.deadInd))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.sorlcurLevlCode == rhs.sorlcurLevlCode)||((this.sorlcurLevlCode!= null)&&this.sorlcurLevlCode.equals(rhs.sorlcurLevlCode))))&&((this.persSex == rhs.persSex)||((this.persSex!= null)&&this.persSex.equals(rhs.persSex))))&&((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip))))&&((this.deliveryPoint == rhs.deliveryPoint)||((this.deliveryPoint!= null)&&this.deliveryPoint.equals(rhs.deliveryPoint))))&&((this.sorlcurCollCode == rhs.sorlcurCollCode)||((this.sorlcurCollCode!= null)&&this.sorlcurCollCode.equals(rhs.sorlcurCollCode))))&&((this.sorlcurPriorityNo == rhs.sorlcurPriorityNo)||((this.sorlcurPriorityNo!= null)&&this.sorlcurPriorityNo.equals(rhs.sorlcurPriorityNo))))&&((this.addAdmInd == rhs.addAdmInd)||((this.addAdmInd!= null)&&this.addAdmInd.equals(rhs.addAdmInd))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.asrcCode == rhs.asrcCode)||((this.asrcCode!= null)&&this.asrcCode.equals(rhs.asrcCode))))&&((this.stdadapAdmtCode == rhs.stdadapAdmtCode)||((this.stdadapAdmtCode!= null)&&this.stdadapAdmtCode.equals(rhs.stdadapAdmtCode))))&&((this.confidInd == rhs.confidInd)||((this.confidInd!= null)&&this.confidInd.equals(rhs.confidInd))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.citzCode == rhs.citzCode)||((this.citzCode!= null)&&this.citzCode.equals(rhs.citzCode))))&&((this.stdappdApdcCode == rhs.stdappdApdcCode)||((this.stdappdApdcCode!= null)&&this.stdappdApdcCode.equals(rhs.stdappdApdcCode))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorlcurTerCodeCtlg == rhs.sorlcurTerCodeCtlg)||((this.sorlcurTerCodeCtlg!= null)&&this.sorlcurTerCodeCtlg.equals(rhs.sorlcurTerCodeCtlg))))&&((this.sdvetInd == rhs.sdvetInd)||((this.sdvetInd!= null)&&this.sdvetInd.equals(rhs.sdvetInd))))&&((this.raceCde == rhs.raceCde)||((this.raceCde!= null)&&this.raceCde.equals(rhs.raceCde))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.deadDate == rhs.deadDate)||((this.deadDate!= null)&&this.deadDate.equals(rhs.deadDate))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.edlvCode == rhs.edlvCode)||((this.edlvCode!= null)&&this.edlvCode.equals(rhs.edlvCode))))&&((this.sorlcurDegcCode == rhs.sorlcurDegcCode)||((this.sorlcurDegcCode!= null)&&this.sorlcurDegcCode.equals(rhs.sorlcurDegcCode))))&&((this.carrierRoute == rhs.carrierRoute)||((this.carrierRoute!= null)&&this.carrierRoute.equals(rhs.carrierRoute))))&&((this.relgCode == rhs.relgCode)||((this.relgCode!= null)&&this.relgCode.equals(rhs.relgCode))))&&((this.ethnCode == rhs.ethnCode)||((this.ethnCode!= null)&&this.ethnCode.equals(rhs.ethnCode))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.ethnCde == rhs.ethnCde)||((this.ethnCde!= null)&&this.ethnCde.equals(rhs.ethnCde))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.phoneExt == rhs.phoneExt)||((this.phoneExt!= null)&&this.phoneExt.equals(rhs.phoneExt))))&&((this.confirmedReDate == rhs.confirmedReDate)||((this.confirmedReDate!= null)&&this.confirmedReDate.equals(rhs.confirmedReDate))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.stdrecrSbgiCode == rhs.stdrecrSbgiCode)||((this.stdrecrSbgiCode!= null)&&this.stdrecrSbgiCode.equals(rhs.stdrecrSbgiCode))))&&((this.sorlfosDeptCode == rhs.sorlfosDeptCode)||((this.sorlfosDeptCode!= null)&&this.sorlfosDeptCode.equals(rhs.sorlfosDeptCode))))&&((this.toDate == rhs.toDate)||((this.toDate!= null)&&this.toDate.equals(rhs.toDate))))&&((this.lgcyCode == rhs.lgcyCode)||((this.lgcyCode!= null)&&this.lgcyCode.equals(rhs.lgcyCode))))&&((this.armedServMedVetInd == rhs.armedServMedVetInd)||((this.armedServMedVetInd!= null)&&this.armedServMedVetInd.equals(rhs.armedServMedVetInd))))&&((this.sorlfosCstsCode == rhs.sorlfosCstsCode)||((this.sorlfosCstsCode!= null)&&this.sorlfosCstsCode.equals(rhs.sorlfosCstsCode))))&&((this.birthDate == rhs.birthDate)||((this.birthDate!= null)&&this.birthDate.equals(rhs.birthDate))))&&((this.sorlcurCampCode == rhs.sorlcurCampCode)||((this.sorlcurCampCode!= null)&&this.sorlcurCampCode.equals(rhs.sorlcurCampCode))))&&((this.teleCode == rhs.teleCode)||((this.teleCode!= null)&&this.teleCode.equals(rhs.teleCode))))&&((this.sorlfosLfstCode == rhs.sorlfosLfstCode)||((this.sorlfosLfstCode!= null)&&this.sorlfosLfstCode.equals(rhs.sorlfosLfstCode))))&&((this.vetcFileNumber == rhs.vetcFileNumber)||((this.vetcFileNumber!= null)&&this.vetcFileNumber.equals(rhs.vetcFileNumber))))&&((this.sorlfosPriorityNo == rhs.sorlfosPriorityNo)||((this.sorlfosPriorityNo!= null)&&this.sorlfosPriorityNo.equals(rhs.sorlfosPriorityNo))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.addRecrInd == rhs.addRecrInd)||((this.addRecrInd!= null)&&this.addRecrInd.equals(rhs.addRecrInd))))&&((this.sorlcurProgram == rhs.sorlcurProgram)||((this.sorlcurProgram!= null)&&this.sorlcurProgram.equals(rhs.sorlcurProgram))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.stdadapApstCode == rhs.stdadapApstCode)||((this.stdadapApstCode!= null)&&this.stdadapApstCode.equals(rhs.stdadapApstCode))))&&((this.confirmedReCde == rhs.confirmedReCde)||((this.confirmedReCde!= null)&&this.confirmedReCde.equals(rhs.confirmedReCde))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
