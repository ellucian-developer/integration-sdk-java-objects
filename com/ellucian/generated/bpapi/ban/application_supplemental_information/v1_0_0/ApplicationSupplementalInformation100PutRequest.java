
package com.ellucian.generated.bpapi.ban.application_supplemental_information.v1_0_0;

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
    "applType",
    "prevApp1",
    "flag9",
    "flag8",
    "prevApp3",
    "flag7",
    "prevApp2",
    "flag6",
    "flag5",
    "prevApp4",
    "flag4",
    "flag3",
    "flag2",
    "flag1",
    "keyblockApplNo",
    "statCodeAdmit",
    "natnCodeBirth",
    "natnCodeAdmit",
    "agencyFeeWaived",
    "id",
    "instData18",
    "instData17",
    "instData16",
    "instData15",
    "instData14",
    "instData13",
    "flag10",
    "instData12",
    "instData11",
    "cycleAdded",
    "keyblockTerm",
    "statCodeBirth",
    "instData19",
    "appYearAgency",
    "instData9",
    "numberDeps",
    "instData8",
    "instData5",
    "instData10",
    "instData4",
    "instData7",
    "instData6",
    "instData1",
    "race10",
    "cntyBirthRural",
    "instData3",
    "instData2",
    "cycleChanged",
    "agencyFileNo",
    "eselCode",
    "ethnic10",
    "instData20",
    "hispInd",
    "sbgiCodeAdmit",
    "nextMcatDate",
    "cityBirth",
    "agencyReportDate",
    "bioNumber",
    "urmInd",
    "cntyAdmitRural",
    "race5",
    "ethnic3",
    "effecDate",
    "race6",
    "ethnic4",
    "race7",
    "ethnic5",
    "race8",
    "ethnic6",
    "race1",
    "race2",
    "race3",
    "ethnic1",
    "cntyCodeAdmit",
    "race4",
    "ethnic2",
    "amcasId",
    "ethnCodeSelf",
    "race9",
    "ethnic7",
    "cntyCodeBirth",
    "ethnic8",
    "ethnic9"
})
@Generated("jsonschema2pojo")
public class ApplicationSupplementalInformation100PutRequest {

    /**
     * Sabsupl Number Deps
     * <p>
     * Lineage reference object : SABSUPL_APPL_TYPE
     * 
     */
    @JsonProperty("applType")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_APPL_TYPE")
    private String applType;
    /**
     * Sabsupl Prev App 1
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_1
     * 
     */
    @JsonProperty("prevApp1")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_PREV_APP_1")
    private Double prevApp1;
    /**
     *  9
     * <p>
     * Lineage reference object : SABSUPL_FLAG9
     * 
     */
    @JsonProperty("flag9")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG9")
    private String flag9;
    /**
     *  8
     * <p>
     * Lineage reference object : SABSUPL_FLAG8
     * 
     */
    @JsonProperty("flag8")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG8")
    private String flag8;
    /**
     * Sabsupl Prev App 3
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_3
     * 
     */
    @JsonProperty("prevApp3")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_PREV_APP_3")
    private Double prevApp3;
    /**
     *  7
     * <p>
     * Lineage reference object : SABSUPL_FLAG7
     * 
     */
    @JsonProperty("flag7")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG7")
    private String flag7;
    /**
     * Sabsupl Prev App 2
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_2
     * 
     */
    @JsonProperty("prevApp2")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_PREV_APP_2")
    private Double prevApp2;
    /**
     *  6
     * <p>
     * Lineage reference object : SABSUPL_FLAG6
     * 
     */
    @JsonProperty("flag6")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG6")
    private String flag6;
    /**
     *  5
     * <p>
     * Lineage reference object : SABSUPL_FLAG5
     * 
     */
    @JsonProperty("flag5")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG5")
    private String flag5;
    /**
     * Sabsupl Prev App 4
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_4
     * 
     */
    @JsonProperty("prevApp4")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_PREV_APP_4")
    private Double prevApp4;
    /**
     *  4
     * <p>
     * Lineage reference object : SABSUPL_FLAG4
     * 
     */
    @JsonProperty("flag4")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG4")
    private String flag4;
    /**
     *  3
     * <p>
     * Lineage reference object : SABSUPL_FLAG3
     * 
     */
    @JsonProperty("flag3")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG3")
    private String flag3;
    /**
     *  2
     * <p>
     * Lineage reference object : SABSUPL_FLAG2
     * 
     */
    @JsonProperty("flag2")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG2")
    private String flag2;
    /**
     *  1
     * <p>
     * Lineage reference object : SABSUPL_FLAG1
     * 
     */
    @JsonProperty("flag1")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG1")
    private String flag1;
    /**
     * Sabsupl Appl No
     * <p>
     * Lineage reference object : keyblockApplNo, Lookup lineage reference object : sabsupl
     * 
     */
    @JsonProperty("keyblockApplNo")
    @JsonPropertyDescription("Lineage reference object : keyblockApplNo, Lookup lineage reference object : sabsupl")
    private Object keyblockApplNo;
    /**
     * Sabsupl Stat Code Admit
     * <p>
     * Lineage reference object : SABSUPL_STAT_CODE_ADMIT, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_STAT_CODE_ADMIT, Lookup lineage reference object : stvstat")
    private String statCodeAdmit;
    /**
     * Sabsupl Natn Code Birth
     * <p>
     * Lineage reference object : SABSUPL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeBirth")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn")
    private String natnCodeBirth;
    /**
     * Sabsupl Natn Code Admit
     * <p>
     * Lineage reference object : SABSUPL_NATN_CODE_ADMIT, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_NATN_CODE_ADMIT, Lookup lineage reference object : stvnatn")
    private String natnCodeAdmit;
    /**
     * Agency Fee Waived
     * <p>
     * Lineage reference object : SABSUPL_AGENCY_FEE_WAIVED
     * 
     */
    @JsonProperty("agencyFeeWaived")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_AGENCY_FEE_WAIVED")
    private String agencyFeeWaived;
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
     * Sabsupl Inst Data18
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA18
     * 
     */
    @JsonProperty("instData18")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA18")
    private String instData18;
    /**
     * Sabsupl Inst Data17
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA17
     * 
     */
    @JsonProperty("instData17")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA17")
    private String instData17;
    /**
     * Sabsupl Inst Data16
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA16
     * 
     */
    @JsonProperty("instData16")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA16")
    private String instData16;
    /**
     * Sabsupl Inst Data15
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA15
     * 
     */
    @JsonProperty("instData15")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA15")
    private String instData15;
    /**
     * Sabsupl Inst Data14
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA14
     * 
     */
    @JsonProperty("instData14")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA14")
    private String instData14;
    /**
     * Sabsupl Inst Data13
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA13
     * 
     */
    @JsonProperty("instData13")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA13")
    private String instData13;
    /**
     *  10
     * <p>
     * Lineage reference object : SABSUPL_FLAG10
     * 
     */
    @JsonProperty("flag10")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_FLAG10")
    private String flag10;
    /**
     * Sabsupl Inst Data12
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA12
     * 
     */
    @JsonProperty("instData12")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA12")
    private String instData12;
    /**
     * Sabsupl Inst Data11
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA11
     * 
     */
    @JsonProperty("instData11")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA11")
    private String instData11;
    /**
     * Sabsupl Cycle Added
     * <p>
     * Lineage reference object : SABSUPL_CYCLE_ADDED
     * 
     */
    @JsonProperty("cycleAdded")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_CYCLE_ADDED")
    private Double cycleAdded;
    /**
     * Sabsupl Term Code Entry
     * <p>
     * Lineage reference object : keyblockTerm, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblockTerm")
    @JsonPropertyDescription("Lineage reference object : keyblockTerm, Lookup lineage reference object : stvterm")
    private Object keyblockTerm;
    /**
     * Sabsupl Stat Code Birth
     * <p>
     * Lineage reference object : SABSUPL_STAT_CODE_BIRTH, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeBirth")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_STAT_CODE_BIRTH, Lookup lineage reference object : stvstat")
    private String statCodeBirth;
    /**
     * Sabsupl Inst Data19
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA19
     * 
     */
    @JsonProperty("instData19")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA19")
    private String instData19;
    /**
     * Sabsupl App Year Agency
     * <p>
     * Lineage reference object : SABSUPL_APP_YEAR_AGENCY
     * 
     */
    @JsonProperty("appYearAgency")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_APP_YEAR_AGENCY")
    private Double appYearAgency;
    /**
     * Lineage reference object : SABSUPL_INST_DATA9
     * 
     */
    @JsonProperty("instData9")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA9")
    private String instData9;
    /**
     * Sabsupl Number Deps
     * <p>
     * Lineage reference object : SABSUPL_NUMBER_DEPS
     * 
     */
    @JsonProperty("numberDeps")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_NUMBER_DEPS")
    private Double numberDeps;
    /**
     * Sabsupl Inst Data8
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA8
     * 
     */
    @JsonProperty("instData8")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA8")
    private String instData8;
    /**
     * Sabsupl Inst Data5
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA5
     * 
     */
    @JsonProperty("instData5")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA5")
    private String instData5;
    /**
     * Sabsupl Inst Data10
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA10
     * 
     */
    @JsonProperty("instData10")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA10")
    private String instData10;
    /**
     * Sabsupl Inst Data4
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA4
     * 
     */
    @JsonProperty("instData4")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA4")
    private String instData4;
    /**
     * Sabsupl Inst Data7
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA7
     * 
     */
    @JsonProperty("instData7")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA7")
    private String instData7;
    /**
     * Sabsupl Inst Data6
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA6
     * 
     */
    @JsonProperty("instData6")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA6")
    private String instData6;
    /**
     * Sabsupl Inst Data1
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA1
     * 
     */
    @JsonProperty("instData1")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA1")
    private String instData1;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE10, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race10")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE10, Lookup lineage reference object : gorrace")
    private String race10;
    /**
     * Rural County Indicator
     * <p>
     * Lineage reference object : SABSUPL_CNTY_BIRTH_RURAL
     * 
     */
    @JsonProperty("cntyBirthRural")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_CNTY_BIRTH_RURAL")
    private String cntyBirthRural;
    /**
     * Sabsupl Inst Data3
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA3
     * 
     */
    @JsonProperty("instData3")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA3")
    private String instData3;
    /**
     * Sabsupl Inst Data2
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA2
     * 
     */
    @JsonProperty("instData2")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA2")
    private String instData2;
    /**
     * Sabsupl Cycle Changed
     * <p>
     * Lineage reference object : SABSUPL_CYCLE_CHANGED
     * 
     */
    @JsonProperty("cycleChanged")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_CYCLE_CHANGED")
    private Double cycleChanged;
    /**
     * Sabsupl Agency File No
     * <p>
     * Lineage reference object : SABSUPL_AGENCY_FILE_NO
     * 
     */
    @JsonProperty("agencyFileNo")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_AGENCY_FILE_NO")
    private String agencyFileNo;
    /**
     * Sabsupl Esel Code
     * <p>
     * Lineage reference object : SABSUPL_ESEL_CODE, Lookup lineage reference object : stvesel
     * 
     */
    @JsonProperty("eselCode")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ESEL_CODE, Lookup lineage reference object : stvesel")
    private String eselCode;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC10, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic10")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC10, Lookup lineage reference object : stvethn")
    private String ethnic10;
    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA20
     * 
     */
    @JsonProperty("instData20")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA20")
    private String instData20;
    /**
     * Hispanic Indicator
     * <p>
     * Lineage reference object : SABSUPL_HISP_IND
     * 
     */
    @JsonProperty("hispInd")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_HISP_IND")
    private String hispInd;
    /**
     * Sabsupl Sbgi Code Admit
     * <p>
     * Lineage reference object : SABSUPL_SBGI_CODE_ADMIT, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_SBGI_CODE_ADMIT, Lookup lineage reference object : stvsbgi")
    private String sbgiCodeAdmit;
    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_NEXT_MCAT_DATE
     * 
     */
    @JsonProperty("nextMcatDate")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_NEXT_MCAT_DATE")
    private Date nextMcatDate;
    /**
     * Sabsupl City Birth
     * <p>
     * Lineage reference object : SABSUPL_CITY_BIRTH
     * 
     */
    @JsonProperty("cityBirth")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_CITY_BIRTH")
    private String cityBirth;
    /**
     * Sabsupl Agency Report Date
     * <p>
     * Lineage reference object : SABSUPL_AGENCY_REPORT_DATE
     * 
     */
    @JsonProperty("agencyReportDate")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_AGENCY_REPORT_DATE")
    private Date agencyReportDate;
    /**
     * Sabsupl City Birth
     * <p>
     * Lineage reference object : SABSUPL_BIO_NUMBER
     * 
     */
    @JsonProperty("bioNumber")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_BIO_NUMBER")
    private String bioNumber;
    /**
     * Under-represented Minority Indicator
     * <p>
     * Lineage reference object : SABSUPL_URM_IND
     * 
     */
    @JsonProperty("urmInd")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_URM_IND")
    private String urmInd;
    /**
     * Rural County Indicator
     * <p>
     * Lineage reference object : SABSUPL_CNTY_ADMIT_RURAL
     * 
     */
    @JsonProperty("cntyAdmitRural")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_CNTY_ADMIT_RURAL")
    private String cntyAdmitRural;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE5, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race5")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE5, Lookup lineage reference object : gorrace")
    private String race5;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC3, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic3")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC3, Lookup lineage reference object : stvethn")
    private String ethnic3;
    /**
     * Sabsupl Agency Report Date
     * <p>
     * Lineage reference object : SABSUPL_EFFEC_DATE
     * 
     */
    @JsonProperty("effecDate")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_EFFEC_DATE")
    private Date effecDate;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE6, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race6")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE6, Lookup lineage reference object : gorrace")
    private String race6;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC4, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic4")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC4, Lookup lineage reference object : stvethn")
    private String ethnic4;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE7, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race7")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE7, Lookup lineage reference object : gorrace")
    private String race7;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC5, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic5")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC5, Lookup lineage reference object : stvethn")
    private String ethnic5;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE8, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race8")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE8, Lookup lineage reference object : gorrace")
    private String race8;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC6, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic6")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC6, Lookup lineage reference object : stvethn")
    private String ethnic6;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE1, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race1")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE1, Lookup lineage reference object : gorrace")
    private String race1;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE2, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race2")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE2, Lookup lineage reference object : gorrace")
    private String race2;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE3, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race3")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE3, Lookup lineage reference object : gorrace")
    private String race3;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC1, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic1")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC1, Lookup lineage reference object : stvethn")
    private String ethnic1;
    /**
     * Sabsupl Cnty Code Admit
     * <p>
     * Lineage reference object : SABSUPL_CNTY_CODE_ADMIT, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCodeAdmit")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_CNTY_CODE_ADMIT, Lookup lineage reference object : stvcnty")
    private String cntyCodeAdmit;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE4, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race4")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE4, Lookup lineage reference object : gorrace")
    private String race4;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC2, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic2")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC2, Lookup lineage reference object : stvethn")
    private String ethnic2;
    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_AMCAS_ID
     * 
     */
    @JsonProperty("amcasId")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_AMCAS_ID")
    private String amcasId;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHN_CODE_SELF, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCodeSelf")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHN_CODE_SELF, Lookup lineage reference object : stvethn")
    private String ethnCodeSelf;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE9, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race9")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE9, Lookup lineage reference object : gorrace")
    private String race9;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC7, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic7")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC7, Lookup lineage reference object : stvethn")
    private String ethnic7;
    /**
     * Sabsupl Cnty Code Birth
     * <p>
     * Lineage reference object : SABSUPL_CNTY_CODE_BIRTH, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCodeBirth")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_CNTY_CODE_BIRTH, Lookup lineage reference object : stvcnty")
    private String cntyCodeBirth;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC8, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic8")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC8, Lookup lineage reference object : stvethn")
    private String ethnic8;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC9, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic9")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC9, Lookup lineage reference object : stvethn")
    private String ethnic9;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Sabsupl Number Deps
     * <p>
     * Lineage reference object : SABSUPL_APPL_TYPE
     * 
     */
    @JsonProperty("applType")
    public String getApplType() {
        return applType;
    }

    /**
     * Sabsupl Number Deps
     * <p>
     * Lineage reference object : SABSUPL_APPL_TYPE
     * 
     */
    @JsonProperty("applType")
    public void setApplType(String applType) {
        this.applType = applType;
    }

    public ApplicationSupplementalInformation100PutRequest withApplType(String applType) {
        this.applType = applType;
        return this;
    }

    /**
     * Sabsupl Prev App 1
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_1
     * 
     */
    @JsonProperty("prevApp1")
    public Double getPrevApp1() {
        return prevApp1;
    }

    /**
     * Sabsupl Prev App 1
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_1
     * 
     */
    @JsonProperty("prevApp1")
    public void setPrevApp1(Double prevApp1) {
        this.prevApp1 = prevApp1;
    }

    public ApplicationSupplementalInformation100PutRequest withPrevApp1(Double prevApp1) {
        this.prevApp1 = prevApp1;
        return this;
    }

    /**
     *  9
     * <p>
     * Lineage reference object : SABSUPL_FLAG9
     * 
     */
    @JsonProperty("flag9")
    public String getFlag9() {
        return flag9;
    }

    /**
     *  9
     * <p>
     * Lineage reference object : SABSUPL_FLAG9
     * 
     */
    @JsonProperty("flag9")
    public void setFlag9(String flag9) {
        this.flag9 = flag9;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag9(String flag9) {
        this.flag9 = flag9;
        return this;
    }

    /**
     *  8
     * <p>
     * Lineage reference object : SABSUPL_FLAG8
     * 
     */
    @JsonProperty("flag8")
    public String getFlag8() {
        return flag8;
    }

    /**
     *  8
     * <p>
     * Lineage reference object : SABSUPL_FLAG8
     * 
     */
    @JsonProperty("flag8")
    public void setFlag8(String flag8) {
        this.flag8 = flag8;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag8(String flag8) {
        this.flag8 = flag8;
        return this;
    }

    /**
     * Sabsupl Prev App 3
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_3
     * 
     */
    @JsonProperty("prevApp3")
    public Double getPrevApp3() {
        return prevApp3;
    }

    /**
     * Sabsupl Prev App 3
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_3
     * 
     */
    @JsonProperty("prevApp3")
    public void setPrevApp3(Double prevApp3) {
        this.prevApp3 = prevApp3;
    }

    public ApplicationSupplementalInformation100PutRequest withPrevApp3(Double prevApp3) {
        this.prevApp3 = prevApp3;
        return this;
    }

    /**
     *  7
     * <p>
     * Lineage reference object : SABSUPL_FLAG7
     * 
     */
    @JsonProperty("flag7")
    public String getFlag7() {
        return flag7;
    }

    /**
     *  7
     * <p>
     * Lineage reference object : SABSUPL_FLAG7
     * 
     */
    @JsonProperty("flag7")
    public void setFlag7(String flag7) {
        this.flag7 = flag7;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag7(String flag7) {
        this.flag7 = flag7;
        return this;
    }

    /**
     * Sabsupl Prev App 2
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_2
     * 
     */
    @JsonProperty("prevApp2")
    public Double getPrevApp2() {
        return prevApp2;
    }

    /**
     * Sabsupl Prev App 2
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_2
     * 
     */
    @JsonProperty("prevApp2")
    public void setPrevApp2(Double prevApp2) {
        this.prevApp2 = prevApp2;
    }

    public ApplicationSupplementalInformation100PutRequest withPrevApp2(Double prevApp2) {
        this.prevApp2 = prevApp2;
        return this;
    }

    /**
     *  6
     * <p>
     * Lineage reference object : SABSUPL_FLAG6
     * 
     */
    @JsonProperty("flag6")
    public String getFlag6() {
        return flag6;
    }

    /**
     *  6
     * <p>
     * Lineage reference object : SABSUPL_FLAG6
     * 
     */
    @JsonProperty("flag6")
    public void setFlag6(String flag6) {
        this.flag6 = flag6;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag6(String flag6) {
        this.flag6 = flag6;
        return this;
    }

    /**
     *  5
     * <p>
     * Lineage reference object : SABSUPL_FLAG5
     * 
     */
    @JsonProperty("flag5")
    public String getFlag5() {
        return flag5;
    }

    /**
     *  5
     * <p>
     * Lineage reference object : SABSUPL_FLAG5
     * 
     */
    @JsonProperty("flag5")
    public void setFlag5(String flag5) {
        this.flag5 = flag5;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag5(String flag5) {
        this.flag5 = flag5;
        return this;
    }

    /**
     * Sabsupl Prev App 4
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_4
     * 
     */
    @JsonProperty("prevApp4")
    public Double getPrevApp4() {
        return prevApp4;
    }

    /**
     * Sabsupl Prev App 4
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_4
     * 
     */
    @JsonProperty("prevApp4")
    public void setPrevApp4(Double prevApp4) {
        this.prevApp4 = prevApp4;
    }

    public ApplicationSupplementalInformation100PutRequest withPrevApp4(Double prevApp4) {
        this.prevApp4 = prevApp4;
        return this;
    }

    /**
     *  4
     * <p>
     * Lineage reference object : SABSUPL_FLAG4
     * 
     */
    @JsonProperty("flag4")
    public String getFlag4() {
        return flag4;
    }

    /**
     *  4
     * <p>
     * Lineage reference object : SABSUPL_FLAG4
     * 
     */
    @JsonProperty("flag4")
    public void setFlag4(String flag4) {
        this.flag4 = flag4;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag4(String flag4) {
        this.flag4 = flag4;
        return this;
    }

    /**
     *  3
     * <p>
     * Lineage reference object : SABSUPL_FLAG3
     * 
     */
    @JsonProperty("flag3")
    public String getFlag3() {
        return flag3;
    }

    /**
     *  3
     * <p>
     * Lineage reference object : SABSUPL_FLAG3
     * 
     */
    @JsonProperty("flag3")
    public void setFlag3(String flag3) {
        this.flag3 = flag3;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag3(String flag3) {
        this.flag3 = flag3;
        return this;
    }

    /**
     *  2
     * <p>
     * Lineage reference object : SABSUPL_FLAG2
     * 
     */
    @JsonProperty("flag2")
    public String getFlag2() {
        return flag2;
    }

    /**
     *  2
     * <p>
     * Lineage reference object : SABSUPL_FLAG2
     * 
     */
    @JsonProperty("flag2")
    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag2(String flag2) {
        this.flag2 = flag2;
        return this;
    }

    /**
     *  1
     * <p>
     * Lineage reference object : SABSUPL_FLAG1
     * 
     */
    @JsonProperty("flag1")
    public String getFlag1() {
        return flag1;
    }

    /**
     *  1
     * <p>
     * Lineage reference object : SABSUPL_FLAG1
     * 
     */
    @JsonProperty("flag1")
    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag1(String flag1) {
        this.flag1 = flag1;
        return this;
    }

    /**
     * Sabsupl Appl No
     * <p>
     * Lineage reference object : keyblockApplNo, Lookup lineage reference object : sabsupl
     * 
     */
    @JsonProperty("keyblockApplNo")
    public Object getKeyblockApplNo() {
        return keyblockApplNo;
    }

    /**
     * Sabsupl Appl No
     * <p>
     * Lineage reference object : keyblockApplNo, Lookup lineage reference object : sabsupl
     * 
     */
    @JsonProperty("keyblockApplNo")
    public void setKeyblockApplNo(Object keyblockApplNo) {
        this.keyblockApplNo = keyblockApplNo;
    }

    public ApplicationSupplementalInformation100PutRequest withKeyblockApplNo(Object keyblockApplNo) {
        this.keyblockApplNo = keyblockApplNo;
        return this;
    }

    /**
     * Sabsupl Stat Code Admit
     * <p>
     * Lineage reference object : SABSUPL_STAT_CODE_ADMIT, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeAdmit")
    public String getStatCodeAdmit() {
        return statCodeAdmit;
    }

    /**
     * Sabsupl Stat Code Admit
     * <p>
     * Lineage reference object : SABSUPL_STAT_CODE_ADMIT, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeAdmit")
    public void setStatCodeAdmit(String statCodeAdmit) {
        this.statCodeAdmit = statCodeAdmit;
    }

    public ApplicationSupplementalInformation100PutRequest withStatCodeAdmit(String statCodeAdmit) {
        this.statCodeAdmit = statCodeAdmit;
        return this;
    }

    /**
     * Sabsupl Natn Code Birth
     * <p>
     * Lineage reference object : SABSUPL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeBirth")
    public String getNatnCodeBirth() {
        return natnCodeBirth;
    }

    /**
     * Sabsupl Natn Code Birth
     * <p>
     * Lineage reference object : SABSUPL_NATN_CODE_BIRTH, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeBirth")
    public void setNatnCodeBirth(String natnCodeBirth) {
        this.natnCodeBirth = natnCodeBirth;
    }

    public ApplicationSupplementalInformation100PutRequest withNatnCodeBirth(String natnCodeBirth) {
        this.natnCodeBirth = natnCodeBirth;
        return this;
    }

    /**
     * Sabsupl Natn Code Admit
     * <p>
     * Lineage reference object : SABSUPL_NATN_CODE_ADMIT, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeAdmit")
    public String getNatnCodeAdmit() {
        return natnCodeAdmit;
    }

    /**
     * Sabsupl Natn Code Admit
     * <p>
     * Lineage reference object : SABSUPL_NATN_CODE_ADMIT, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCodeAdmit")
    public void setNatnCodeAdmit(String natnCodeAdmit) {
        this.natnCodeAdmit = natnCodeAdmit;
    }

    public ApplicationSupplementalInformation100PutRequest withNatnCodeAdmit(String natnCodeAdmit) {
        this.natnCodeAdmit = natnCodeAdmit;
        return this;
    }

    /**
     * Agency Fee Waived
     * <p>
     * Lineage reference object : SABSUPL_AGENCY_FEE_WAIVED
     * 
     */
    @JsonProperty("agencyFeeWaived")
    public String getAgencyFeeWaived() {
        return agencyFeeWaived;
    }

    /**
     * Agency Fee Waived
     * <p>
     * Lineage reference object : SABSUPL_AGENCY_FEE_WAIVED
     * 
     */
    @JsonProperty("agencyFeeWaived")
    public void setAgencyFeeWaived(String agencyFeeWaived) {
        this.agencyFeeWaived = agencyFeeWaived;
    }

    public ApplicationSupplementalInformation100PutRequest withAgencyFeeWaived(String agencyFeeWaived) {
        this.agencyFeeWaived = agencyFeeWaived;
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

    public ApplicationSupplementalInformation100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Sabsupl Inst Data18
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA18
     * 
     */
    @JsonProperty("instData18")
    public String getInstData18() {
        return instData18;
    }

    /**
     * Sabsupl Inst Data18
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA18
     * 
     */
    @JsonProperty("instData18")
    public void setInstData18(String instData18) {
        this.instData18 = instData18;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData18(String instData18) {
        this.instData18 = instData18;
        return this;
    }

    /**
     * Sabsupl Inst Data17
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA17
     * 
     */
    @JsonProperty("instData17")
    public String getInstData17() {
        return instData17;
    }

    /**
     * Sabsupl Inst Data17
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA17
     * 
     */
    @JsonProperty("instData17")
    public void setInstData17(String instData17) {
        this.instData17 = instData17;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData17(String instData17) {
        this.instData17 = instData17;
        return this;
    }

    /**
     * Sabsupl Inst Data16
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA16
     * 
     */
    @JsonProperty("instData16")
    public String getInstData16() {
        return instData16;
    }

    /**
     * Sabsupl Inst Data16
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA16
     * 
     */
    @JsonProperty("instData16")
    public void setInstData16(String instData16) {
        this.instData16 = instData16;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData16(String instData16) {
        this.instData16 = instData16;
        return this;
    }

    /**
     * Sabsupl Inst Data15
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA15
     * 
     */
    @JsonProperty("instData15")
    public String getInstData15() {
        return instData15;
    }

    /**
     * Sabsupl Inst Data15
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA15
     * 
     */
    @JsonProperty("instData15")
    public void setInstData15(String instData15) {
        this.instData15 = instData15;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData15(String instData15) {
        this.instData15 = instData15;
        return this;
    }

    /**
     * Sabsupl Inst Data14
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA14
     * 
     */
    @JsonProperty("instData14")
    public String getInstData14() {
        return instData14;
    }

    /**
     * Sabsupl Inst Data14
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA14
     * 
     */
    @JsonProperty("instData14")
    public void setInstData14(String instData14) {
        this.instData14 = instData14;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData14(String instData14) {
        this.instData14 = instData14;
        return this;
    }

    /**
     * Sabsupl Inst Data13
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA13
     * 
     */
    @JsonProperty("instData13")
    public String getInstData13() {
        return instData13;
    }

    /**
     * Sabsupl Inst Data13
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA13
     * 
     */
    @JsonProperty("instData13")
    public void setInstData13(String instData13) {
        this.instData13 = instData13;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData13(String instData13) {
        this.instData13 = instData13;
        return this;
    }

    /**
     *  10
     * <p>
     * Lineage reference object : SABSUPL_FLAG10
     * 
     */
    @JsonProperty("flag10")
    public String getFlag10() {
        return flag10;
    }

    /**
     *  10
     * <p>
     * Lineage reference object : SABSUPL_FLAG10
     * 
     */
    @JsonProperty("flag10")
    public void setFlag10(String flag10) {
        this.flag10 = flag10;
    }

    public ApplicationSupplementalInformation100PutRequest withFlag10(String flag10) {
        this.flag10 = flag10;
        return this;
    }

    /**
     * Sabsupl Inst Data12
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA12
     * 
     */
    @JsonProperty("instData12")
    public String getInstData12() {
        return instData12;
    }

    /**
     * Sabsupl Inst Data12
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA12
     * 
     */
    @JsonProperty("instData12")
    public void setInstData12(String instData12) {
        this.instData12 = instData12;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData12(String instData12) {
        this.instData12 = instData12;
        return this;
    }

    /**
     * Sabsupl Inst Data11
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA11
     * 
     */
    @JsonProperty("instData11")
    public String getInstData11() {
        return instData11;
    }

    /**
     * Sabsupl Inst Data11
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA11
     * 
     */
    @JsonProperty("instData11")
    public void setInstData11(String instData11) {
        this.instData11 = instData11;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData11(String instData11) {
        this.instData11 = instData11;
        return this;
    }

    /**
     * Sabsupl Cycle Added
     * <p>
     * Lineage reference object : SABSUPL_CYCLE_ADDED
     * 
     */
    @JsonProperty("cycleAdded")
    public Double getCycleAdded() {
        return cycleAdded;
    }

    /**
     * Sabsupl Cycle Added
     * <p>
     * Lineage reference object : SABSUPL_CYCLE_ADDED
     * 
     */
    @JsonProperty("cycleAdded")
    public void setCycleAdded(Double cycleAdded) {
        this.cycleAdded = cycleAdded;
    }

    public ApplicationSupplementalInformation100PutRequest withCycleAdded(Double cycleAdded) {
        this.cycleAdded = cycleAdded;
        return this;
    }

    /**
     * Sabsupl Term Code Entry
     * <p>
     * Lineage reference object : keyblockTerm, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblockTerm")
    public Object getKeyblockTerm() {
        return keyblockTerm;
    }

    /**
     * Sabsupl Term Code Entry
     * <p>
     * Lineage reference object : keyblockTerm, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblockTerm")
    public void setKeyblockTerm(Object keyblockTerm) {
        this.keyblockTerm = keyblockTerm;
    }

    public ApplicationSupplementalInformation100PutRequest withKeyblockTerm(Object keyblockTerm) {
        this.keyblockTerm = keyblockTerm;
        return this;
    }

    /**
     * Sabsupl Stat Code Birth
     * <p>
     * Lineage reference object : SABSUPL_STAT_CODE_BIRTH, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeBirth")
    public String getStatCodeBirth() {
        return statCodeBirth;
    }

    /**
     * Sabsupl Stat Code Birth
     * <p>
     * Lineage reference object : SABSUPL_STAT_CODE_BIRTH, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeBirth")
    public void setStatCodeBirth(String statCodeBirth) {
        this.statCodeBirth = statCodeBirth;
    }

    public ApplicationSupplementalInformation100PutRequest withStatCodeBirth(String statCodeBirth) {
        this.statCodeBirth = statCodeBirth;
        return this;
    }

    /**
     * Sabsupl Inst Data19
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA19
     * 
     */
    @JsonProperty("instData19")
    public String getInstData19() {
        return instData19;
    }

    /**
     * Sabsupl Inst Data19
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA19
     * 
     */
    @JsonProperty("instData19")
    public void setInstData19(String instData19) {
        this.instData19 = instData19;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData19(String instData19) {
        this.instData19 = instData19;
        return this;
    }

    /**
     * Sabsupl App Year Agency
     * <p>
     * Lineage reference object : SABSUPL_APP_YEAR_AGENCY
     * 
     */
    @JsonProperty("appYearAgency")
    public Double getAppYearAgency() {
        return appYearAgency;
    }

    /**
     * Sabsupl App Year Agency
     * <p>
     * Lineage reference object : SABSUPL_APP_YEAR_AGENCY
     * 
     */
    @JsonProperty("appYearAgency")
    public void setAppYearAgency(Double appYearAgency) {
        this.appYearAgency = appYearAgency;
    }

    public ApplicationSupplementalInformation100PutRequest withAppYearAgency(Double appYearAgency) {
        this.appYearAgency = appYearAgency;
        return this;
    }

    /**
     * Lineage reference object : SABSUPL_INST_DATA9
     * 
     */
    @JsonProperty("instData9")
    public String getInstData9() {
        return instData9;
    }

    /**
     * Lineage reference object : SABSUPL_INST_DATA9
     * 
     */
    @JsonProperty("instData9")
    public void setInstData9(String instData9) {
        this.instData9 = instData9;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData9(String instData9) {
        this.instData9 = instData9;
        return this;
    }

    /**
     * Sabsupl Number Deps
     * <p>
     * Lineage reference object : SABSUPL_NUMBER_DEPS
     * 
     */
    @JsonProperty("numberDeps")
    public Double getNumberDeps() {
        return numberDeps;
    }

    /**
     * Sabsupl Number Deps
     * <p>
     * Lineage reference object : SABSUPL_NUMBER_DEPS
     * 
     */
    @JsonProperty("numberDeps")
    public void setNumberDeps(Double numberDeps) {
        this.numberDeps = numberDeps;
    }

    public ApplicationSupplementalInformation100PutRequest withNumberDeps(Double numberDeps) {
        this.numberDeps = numberDeps;
        return this;
    }

    /**
     * Sabsupl Inst Data8
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA8
     * 
     */
    @JsonProperty("instData8")
    public String getInstData8() {
        return instData8;
    }

    /**
     * Sabsupl Inst Data8
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA8
     * 
     */
    @JsonProperty("instData8")
    public void setInstData8(String instData8) {
        this.instData8 = instData8;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData8(String instData8) {
        this.instData8 = instData8;
        return this;
    }

    /**
     * Sabsupl Inst Data5
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA5
     * 
     */
    @JsonProperty("instData5")
    public String getInstData5() {
        return instData5;
    }

    /**
     * Sabsupl Inst Data5
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA5
     * 
     */
    @JsonProperty("instData5")
    public void setInstData5(String instData5) {
        this.instData5 = instData5;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData5(String instData5) {
        this.instData5 = instData5;
        return this;
    }

    /**
     * Sabsupl Inst Data10
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA10
     * 
     */
    @JsonProperty("instData10")
    public String getInstData10() {
        return instData10;
    }

    /**
     * Sabsupl Inst Data10
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA10
     * 
     */
    @JsonProperty("instData10")
    public void setInstData10(String instData10) {
        this.instData10 = instData10;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData10(String instData10) {
        this.instData10 = instData10;
        return this;
    }

    /**
     * Sabsupl Inst Data4
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA4
     * 
     */
    @JsonProperty("instData4")
    public String getInstData4() {
        return instData4;
    }

    /**
     * Sabsupl Inst Data4
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA4
     * 
     */
    @JsonProperty("instData4")
    public void setInstData4(String instData4) {
        this.instData4 = instData4;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData4(String instData4) {
        this.instData4 = instData4;
        return this;
    }

    /**
     * Sabsupl Inst Data7
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA7
     * 
     */
    @JsonProperty("instData7")
    public String getInstData7() {
        return instData7;
    }

    /**
     * Sabsupl Inst Data7
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA7
     * 
     */
    @JsonProperty("instData7")
    public void setInstData7(String instData7) {
        this.instData7 = instData7;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData7(String instData7) {
        this.instData7 = instData7;
        return this;
    }

    /**
     * Sabsupl Inst Data6
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA6
     * 
     */
    @JsonProperty("instData6")
    public String getInstData6() {
        return instData6;
    }

    /**
     * Sabsupl Inst Data6
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA6
     * 
     */
    @JsonProperty("instData6")
    public void setInstData6(String instData6) {
        this.instData6 = instData6;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData6(String instData6) {
        this.instData6 = instData6;
        return this;
    }

    /**
     * Sabsupl Inst Data1
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA1
     * 
     */
    @JsonProperty("instData1")
    public String getInstData1() {
        return instData1;
    }

    /**
     * Sabsupl Inst Data1
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA1
     * 
     */
    @JsonProperty("instData1")
    public void setInstData1(String instData1) {
        this.instData1 = instData1;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData1(String instData1) {
        this.instData1 = instData1;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE10, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race10")
    public String getRace10() {
        return race10;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE10, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race10")
    public void setRace10(String race10) {
        this.race10 = race10;
    }

    public ApplicationSupplementalInformation100PutRequest withRace10(String race10) {
        this.race10 = race10;
        return this;
    }

    /**
     * Rural County Indicator
     * <p>
     * Lineage reference object : SABSUPL_CNTY_BIRTH_RURAL
     * 
     */
    @JsonProperty("cntyBirthRural")
    public String getCntyBirthRural() {
        return cntyBirthRural;
    }

    /**
     * Rural County Indicator
     * <p>
     * Lineage reference object : SABSUPL_CNTY_BIRTH_RURAL
     * 
     */
    @JsonProperty("cntyBirthRural")
    public void setCntyBirthRural(String cntyBirthRural) {
        this.cntyBirthRural = cntyBirthRural;
    }

    public ApplicationSupplementalInformation100PutRequest withCntyBirthRural(String cntyBirthRural) {
        this.cntyBirthRural = cntyBirthRural;
        return this;
    }

    /**
     * Sabsupl Inst Data3
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA3
     * 
     */
    @JsonProperty("instData3")
    public String getInstData3() {
        return instData3;
    }

    /**
     * Sabsupl Inst Data3
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA3
     * 
     */
    @JsonProperty("instData3")
    public void setInstData3(String instData3) {
        this.instData3 = instData3;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData3(String instData3) {
        this.instData3 = instData3;
        return this;
    }

    /**
     * Sabsupl Inst Data2
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA2
     * 
     */
    @JsonProperty("instData2")
    public String getInstData2() {
        return instData2;
    }

    /**
     * Sabsupl Inst Data2
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA2
     * 
     */
    @JsonProperty("instData2")
    public void setInstData2(String instData2) {
        this.instData2 = instData2;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData2(String instData2) {
        this.instData2 = instData2;
        return this;
    }

    /**
     * Sabsupl Cycle Changed
     * <p>
     * Lineage reference object : SABSUPL_CYCLE_CHANGED
     * 
     */
    @JsonProperty("cycleChanged")
    public Double getCycleChanged() {
        return cycleChanged;
    }

    /**
     * Sabsupl Cycle Changed
     * <p>
     * Lineage reference object : SABSUPL_CYCLE_CHANGED
     * 
     */
    @JsonProperty("cycleChanged")
    public void setCycleChanged(Double cycleChanged) {
        this.cycleChanged = cycleChanged;
    }

    public ApplicationSupplementalInformation100PutRequest withCycleChanged(Double cycleChanged) {
        this.cycleChanged = cycleChanged;
        return this;
    }

    /**
     * Sabsupl Agency File No
     * <p>
     * Lineage reference object : SABSUPL_AGENCY_FILE_NO
     * 
     */
    @JsonProperty("agencyFileNo")
    public String getAgencyFileNo() {
        return agencyFileNo;
    }

    /**
     * Sabsupl Agency File No
     * <p>
     * Lineage reference object : SABSUPL_AGENCY_FILE_NO
     * 
     */
    @JsonProperty("agencyFileNo")
    public void setAgencyFileNo(String agencyFileNo) {
        this.agencyFileNo = agencyFileNo;
    }

    public ApplicationSupplementalInformation100PutRequest withAgencyFileNo(String agencyFileNo) {
        this.agencyFileNo = agencyFileNo;
        return this;
    }

    /**
     * Sabsupl Esel Code
     * <p>
     * Lineage reference object : SABSUPL_ESEL_CODE, Lookup lineage reference object : stvesel
     * 
     */
    @JsonProperty("eselCode")
    public String getEselCode() {
        return eselCode;
    }

    /**
     * Sabsupl Esel Code
     * <p>
     * Lineage reference object : SABSUPL_ESEL_CODE, Lookup lineage reference object : stvesel
     * 
     */
    @JsonProperty("eselCode")
    public void setEselCode(String eselCode) {
        this.eselCode = eselCode;
    }

    public ApplicationSupplementalInformation100PutRequest withEselCode(String eselCode) {
        this.eselCode = eselCode;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC10, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic10")
    public String getEthnic10() {
        return ethnic10;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC10, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic10")
    public void setEthnic10(String ethnic10) {
        this.ethnic10 = ethnic10;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic10(String ethnic10) {
        this.ethnic10 = ethnic10;
        return this;
    }

    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA20
     * 
     */
    @JsonProperty("instData20")
    public String getInstData20() {
        return instData20;
    }

    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA20
     * 
     */
    @JsonProperty("instData20")
    public void setInstData20(String instData20) {
        this.instData20 = instData20;
    }

    public ApplicationSupplementalInformation100PutRequest withInstData20(String instData20) {
        this.instData20 = instData20;
        return this;
    }

    /**
     * Hispanic Indicator
     * <p>
     * Lineage reference object : SABSUPL_HISP_IND
     * 
     */
    @JsonProperty("hispInd")
    public String getHispInd() {
        return hispInd;
    }

    /**
     * Hispanic Indicator
     * <p>
     * Lineage reference object : SABSUPL_HISP_IND
     * 
     */
    @JsonProperty("hispInd")
    public void setHispInd(String hispInd) {
        this.hispInd = hispInd;
    }

    public ApplicationSupplementalInformation100PutRequest withHispInd(String hispInd) {
        this.hispInd = hispInd;
        return this;
    }

    /**
     * Sabsupl Sbgi Code Admit
     * <p>
     * Lineage reference object : SABSUPL_SBGI_CODE_ADMIT, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCodeAdmit")
    public String getSbgiCodeAdmit() {
        return sbgiCodeAdmit;
    }

    /**
     * Sabsupl Sbgi Code Admit
     * <p>
     * Lineage reference object : SABSUPL_SBGI_CODE_ADMIT, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCodeAdmit")
    public void setSbgiCodeAdmit(String sbgiCodeAdmit) {
        this.sbgiCodeAdmit = sbgiCodeAdmit;
    }

    public ApplicationSupplementalInformation100PutRequest withSbgiCodeAdmit(String sbgiCodeAdmit) {
        this.sbgiCodeAdmit = sbgiCodeAdmit;
        return this;
    }

    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_NEXT_MCAT_DATE
     * 
     */
    @JsonProperty("nextMcatDate")
    public Date getNextMcatDate() {
        return nextMcatDate;
    }

    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_NEXT_MCAT_DATE
     * 
     */
    @JsonProperty("nextMcatDate")
    public void setNextMcatDate(Date nextMcatDate) {
        this.nextMcatDate = nextMcatDate;
    }

    public ApplicationSupplementalInformation100PutRequest withNextMcatDate(Date nextMcatDate) {
        this.nextMcatDate = nextMcatDate;
        return this;
    }

    /**
     * Sabsupl City Birth
     * <p>
     * Lineage reference object : SABSUPL_CITY_BIRTH
     * 
     */
    @JsonProperty("cityBirth")
    public String getCityBirth() {
        return cityBirth;
    }

    /**
     * Sabsupl City Birth
     * <p>
     * Lineage reference object : SABSUPL_CITY_BIRTH
     * 
     */
    @JsonProperty("cityBirth")
    public void setCityBirth(String cityBirth) {
        this.cityBirth = cityBirth;
    }

    public ApplicationSupplementalInformation100PutRequest withCityBirth(String cityBirth) {
        this.cityBirth = cityBirth;
        return this;
    }

    /**
     * Sabsupl Agency Report Date
     * <p>
     * Lineage reference object : SABSUPL_AGENCY_REPORT_DATE
     * 
     */
    @JsonProperty("agencyReportDate")
    public Date getAgencyReportDate() {
        return agencyReportDate;
    }

    /**
     * Sabsupl Agency Report Date
     * <p>
     * Lineage reference object : SABSUPL_AGENCY_REPORT_DATE
     * 
     */
    @JsonProperty("agencyReportDate")
    public void setAgencyReportDate(Date agencyReportDate) {
        this.agencyReportDate = agencyReportDate;
    }

    public ApplicationSupplementalInformation100PutRequest withAgencyReportDate(Date agencyReportDate) {
        this.agencyReportDate = agencyReportDate;
        return this;
    }

    /**
     * Sabsupl City Birth
     * <p>
     * Lineage reference object : SABSUPL_BIO_NUMBER
     * 
     */
    @JsonProperty("bioNumber")
    public String getBioNumber() {
        return bioNumber;
    }

    /**
     * Sabsupl City Birth
     * <p>
     * Lineage reference object : SABSUPL_BIO_NUMBER
     * 
     */
    @JsonProperty("bioNumber")
    public void setBioNumber(String bioNumber) {
        this.bioNumber = bioNumber;
    }

    public ApplicationSupplementalInformation100PutRequest withBioNumber(String bioNumber) {
        this.bioNumber = bioNumber;
        return this;
    }

    /**
     * Under-represented Minority Indicator
     * <p>
     * Lineage reference object : SABSUPL_URM_IND
     * 
     */
    @JsonProperty("urmInd")
    public String getUrmInd() {
        return urmInd;
    }

    /**
     * Under-represented Minority Indicator
     * <p>
     * Lineage reference object : SABSUPL_URM_IND
     * 
     */
    @JsonProperty("urmInd")
    public void setUrmInd(String urmInd) {
        this.urmInd = urmInd;
    }

    public ApplicationSupplementalInformation100PutRequest withUrmInd(String urmInd) {
        this.urmInd = urmInd;
        return this;
    }

    /**
     * Rural County Indicator
     * <p>
     * Lineage reference object : SABSUPL_CNTY_ADMIT_RURAL
     * 
     */
    @JsonProperty("cntyAdmitRural")
    public String getCntyAdmitRural() {
        return cntyAdmitRural;
    }

    /**
     * Rural County Indicator
     * <p>
     * Lineage reference object : SABSUPL_CNTY_ADMIT_RURAL
     * 
     */
    @JsonProperty("cntyAdmitRural")
    public void setCntyAdmitRural(String cntyAdmitRural) {
        this.cntyAdmitRural = cntyAdmitRural;
    }

    public ApplicationSupplementalInformation100PutRequest withCntyAdmitRural(String cntyAdmitRural) {
        this.cntyAdmitRural = cntyAdmitRural;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE5, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race5")
    public String getRace5() {
        return race5;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE5, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race5")
    public void setRace5(String race5) {
        this.race5 = race5;
    }

    public ApplicationSupplementalInformation100PutRequest withRace5(String race5) {
        this.race5 = race5;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC3, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic3")
    public String getEthnic3() {
        return ethnic3;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC3, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic3")
    public void setEthnic3(String ethnic3) {
        this.ethnic3 = ethnic3;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic3(String ethnic3) {
        this.ethnic3 = ethnic3;
        return this;
    }

    /**
     * Sabsupl Agency Report Date
     * <p>
     * Lineage reference object : SABSUPL_EFFEC_DATE
     * 
     */
    @JsonProperty("effecDate")
    public Date getEffecDate() {
        return effecDate;
    }

    /**
     * Sabsupl Agency Report Date
     * <p>
     * Lineage reference object : SABSUPL_EFFEC_DATE
     * 
     */
    @JsonProperty("effecDate")
    public void setEffecDate(Date effecDate) {
        this.effecDate = effecDate;
    }

    public ApplicationSupplementalInformation100PutRequest withEffecDate(Date effecDate) {
        this.effecDate = effecDate;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE6, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race6")
    public String getRace6() {
        return race6;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE6, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race6")
    public void setRace6(String race6) {
        this.race6 = race6;
    }

    public ApplicationSupplementalInformation100PutRequest withRace6(String race6) {
        this.race6 = race6;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC4, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic4")
    public String getEthnic4() {
        return ethnic4;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC4, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic4")
    public void setEthnic4(String ethnic4) {
        this.ethnic4 = ethnic4;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic4(String ethnic4) {
        this.ethnic4 = ethnic4;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE7, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race7")
    public String getRace7() {
        return race7;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE7, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race7")
    public void setRace7(String race7) {
        this.race7 = race7;
    }

    public ApplicationSupplementalInformation100PutRequest withRace7(String race7) {
        this.race7 = race7;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC5, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic5")
    public String getEthnic5() {
        return ethnic5;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC5, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic5")
    public void setEthnic5(String ethnic5) {
        this.ethnic5 = ethnic5;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic5(String ethnic5) {
        this.ethnic5 = ethnic5;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE8, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race8")
    public String getRace8() {
        return race8;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE8, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race8")
    public void setRace8(String race8) {
        this.race8 = race8;
    }

    public ApplicationSupplementalInformation100PutRequest withRace8(String race8) {
        this.race8 = race8;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC6, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic6")
    public String getEthnic6() {
        return ethnic6;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC6, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic6")
    public void setEthnic6(String ethnic6) {
        this.ethnic6 = ethnic6;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic6(String ethnic6) {
        this.ethnic6 = ethnic6;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE1, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race1")
    public String getRace1() {
        return race1;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE1, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race1")
    public void setRace1(String race1) {
        this.race1 = race1;
    }

    public ApplicationSupplementalInformation100PutRequest withRace1(String race1) {
        this.race1 = race1;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE2, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race2")
    public String getRace2() {
        return race2;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE2, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race2")
    public void setRace2(String race2) {
        this.race2 = race2;
    }

    public ApplicationSupplementalInformation100PutRequest withRace2(String race2) {
        this.race2 = race2;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE3, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race3")
    public String getRace3() {
        return race3;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE3, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race3")
    public void setRace3(String race3) {
        this.race3 = race3;
    }

    public ApplicationSupplementalInformation100PutRequest withRace3(String race3) {
        this.race3 = race3;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC1, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic1")
    public String getEthnic1() {
        return ethnic1;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC1, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic1")
    public void setEthnic1(String ethnic1) {
        this.ethnic1 = ethnic1;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic1(String ethnic1) {
        this.ethnic1 = ethnic1;
        return this;
    }

    /**
     * Sabsupl Cnty Code Admit
     * <p>
     * Lineage reference object : SABSUPL_CNTY_CODE_ADMIT, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCodeAdmit")
    public String getCntyCodeAdmit() {
        return cntyCodeAdmit;
    }

    /**
     * Sabsupl Cnty Code Admit
     * <p>
     * Lineage reference object : SABSUPL_CNTY_CODE_ADMIT, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCodeAdmit")
    public void setCntyCodeAdmit(String cntyCodeAdmit) {
        this.cntyCodeAdmit = cntyCodeAdmit;
    }

    public ApplicationSupplementalInformation100PutRequest withCntyCodeAdmit(String cntyCodeAdmit) {
        this.cntyCodeAdmit = cntyCodeAdmit;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE4, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race4")
    public String getRace4() {
        return race4;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE4, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race4")
    public void setRace4(String race4) {
        this.race4 = race4;
    }

    public ApplicationSupplementalInformation100PutRequest withRace4(String race4) {
        this.race4 = race4;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC2, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic2")
    public String getEthnic2() {
        return ethnic2;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC2, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic2")
    public void setEthnic2(String ethnic2) {
        this.ethnic2 = ethnic2;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic2(String ethnic2) {
        this.ethnic2 = ethnic2;
        return this;
    }

    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_AMCAS_ID
     * 
     */
    @JsonProperty("amcasId")
    public String getAmcasId() {
        return amcasId;
    }

    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_AMCAS_ID
     * 
     */
    @JsonProperty("amcasId")
    public void setAmcasId(String amcasId) {
        this.amcasId = amcasId;
    }

    public ApplicationSupplementalInformation100PutRequest withAmcasId(String amcasId) {
        this.amcasId = amcasId;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHN_CODE_SELF, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCodeSelf")
    public String getEthnCodeSelf() {
        return ethnCodeSelf;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHN_CODE_SELF, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCodeSelf")
    public void setEthnCodeSelf(String ethnCodeSelf) {
        this.ethnCodeSelf = ethnCodeSelf;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnCodeSelf(String ethnCodeSelf) {
        this.ethnCodeSelf = ethnCodeSelf;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE9, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race9")
    public String getRace9() {
        return race9;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE9, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race9")
    public void setRace9(String race9) {
        this.race9 = race9;
    }

    public ApplicationSupplementalInformation100PutRequest withRace9(String race9) {
        this.race9 = race9;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC7, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic7")
    public String getEthnic7() {
        return ethnic7;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC7, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic7")
    public void setEthnic7(String ethnic7) {
        this.ethnic7 = ethnic7;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic7(String ethnic7) {
        this.ethnic7 = ethnic7;
        return this;
    }

    /**
     * Sabsupl Cnty Code Birth
     * <p>
     * Lineage reference object : SABSUPL_CNTY_CODE_BIRTH, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCodeBirth")
    public String getCntyCodeBirth() {
        return cntyCodeBirth;
    }

    /**
     * Sabsupl Cnty Code Birth
     * <p>
     * Lineage reference object : SABSUPL_CNTY_CODE_BIRTH, Lookup lineage reference object : stvcnty
     * 
     */
    @JsonProperty("cntyCodeBirth")
    public void setCntyCodeBirth(String cntyCodeBirth) {
        this.cntyCodeBirth = cntyCodeBirth;
    }

    public ApplicationSupplementalInformation100PutRequest withCntyCodeBirth(String cntyCodeBirth) {
        this.cntyCodeBirth = cntyCodeBirth;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC8, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic8")
    public String getEthnic8() {
        return ethnic8;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC8, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic8")
    public void setEthnic8(String ethnic8) {
        this.ethnic8 = ethnic8;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic8(String ethnic8) {
        this.ethnic8 = ethnic8;
        return this;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC9, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic9")
    public String getEthnic9() {
        return ethnic9;
    }

    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC9, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic9")
    public void setEthnic9(String ethnic9) {
        this.ethnic9 = ethnic9;
    }

    public ApplicationSupplementalInformation100PutRequest withEthnic9(String ethnic9) {
        this.ethnic9 = ethnic9;
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

    public ApplicationSupplementalInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationSupplementalInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("applType");
        sb.append('=');
        sb.append(((this.applType == null)?"<null>":this.applType));
        sb.append(',');
        sb.append("prevApp1");
        sb.append('=');
        sb.append(((this.prevApp1 == null)?"<null>":this.prevApp1));
        sb.append(',');
        sb.append("flag9");
        sb.append('=');
        sb.append(((this.flag9 == null)?"<null>":this.flag9));
        sb.append(',');
        sb.append("flag8");
        sb.append('=');
        sb.append(((this.flag8 == null)?"<null>":this.flag8));
        sb.append(',');
        sb.append("prevApp3");
        sb.append('=');
        sb.append(((this.prevApp3 == null)?"<null>":this.prevApp3));
        sb.append(',');
        sb.append("flag7");
        sb.append('=');
        sb.append(((this.flag7 == null)?"<null>":this.flag7));
        sb.append(',');
        sb.append("prevApp2");
        sb.append('=');
        sb.append(((this.prevApp2 == null)?"<null>":this.prevApp2));
        sb.append(',');
        sb.append("flag6");
        sb.append('=');
        sb.append(((this.flag6 == null)?"<null>":this.flag6));
        sb.append(',');
        sb.append("flag5");
        sb.append('=');
        sb.append(((this.flag5 == null)?"<null>":this.flag5));
        sb.append(',');
        sb.append("prevApp4");
        sb.append('=');
        sb.append(((this.prevApp4 == null)?"<null>":this.prevApp4));
        sb.append(',');
        sb.append("flag4");
        sb.append('=');
        sb.append(((this.flag4 == null)?"<null>":this.flag4));
        sb.append(',');
        sb.append("flag3");
        sb.append('=');
        sb.append(((this.flag3 == null)?"<null>":this.flag3));
        sb.append(',');
        sb.append("flag2");
        sb.append('=');
        sb.append(((this.flag2 == null)?"<null>":this.flag2));
        sb.append(',');
        sb.append("flag1");
        sb.append('=');
        sb.append(((this.flag1 == null)?"<null>":this.flag1));
        sb.append(',');
        sb.append("keyblockApplNo");
        sb.append('=');
        sb.append(((this.keyblockApplNo == null)?"<null>":this.keyblockApplNo));
        sb.append(',');
        sb.append("statCodeAdmit");
        sb.append('=');
        sb.append(((this.statCodeAdmit == null)?"<null>":this.statCodeAdmit));
        sb.append(',');
        sb.append("natnCodeBirth");
        sb.append('=');
        sb.append(((this.natnCodeBirth == null)?"<null>":this.natnCodeBirth));
        sb.append(',');
        sb.append("natnCodeAdmit");
        sb.append('=');
        sb.append(((this.natnCodeAdmit == null)?"<null>":this.natnCodeAdmit));
        sb.append(',');
        sb.append("agencyFeeWaived");
        sb.append('=');
        sb.append(((this.agencyFeeWaived == null)?"<null>":this.agencyFeeWaived));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("instData18");
        sb.append('=');
        sb.append(((this.instData18 == null)?"<null>":this.instData18));
        sb.append(',');
        sb.append("instData17");
        sb.append('=');
        sb.append(((this.instData17 == null)?"<null>":this.instData17));
        sb.append(',');
        sb.append("instData16");
        sb.append('=');
        sb.append(((this.instData16 == null)?"<null>":this.instData16));
        sb.append(',');
        sb.append("instData15");
        sb.append('=');
        sb.append(((this.instData15 == null)?"<null>":this.instData15));
        sb.append(',');
        sb.append("instData14");
        sb.append('=');
        sb.append(((this.instData14 == null)?"<null>":this.instData14));
        sb.append(',');
        sb.append("instData13");
        sb.append('=');
        sb.append(((this.instData13 == null)?"<null>":this.instData13));
        sb.append(',');
        sb.append("flag10");
        sb.append('=');
        sb.append(((this.flag10 == null)?"<null>":this.flag10));
        sb.append(',');
        sb.append("instData12");
        sb.append('=');
        sb.append(((this.instData12 == null)?"<null>":this.instData12));
        sb.append(',');
        sb.append("instData11");
        sb.append('=');
        sb.append(((this.instData11 == null)?"<null>":this.instData11));
        sb.append(',');
        sb.append("cycleAdded");
        sb.append('=');
        sb.append(((this.cycleAdded == null)?"<null>":this.cycleAdded));
        sb.append(',');
        sb.append("keyblockTerm");
        sb.append('=');
        sb.append(((this.keyblockTerm == null)?"<null>":this.keyblockTerm));
        sb.append(',');
        sb.append("statCodeBirth");
        sb.append('=');
        sb.append(((this.statCodeBirth == null)?"<null>":this.statCodeBirth));
        sb.append(',');
        sb.append("instData19");
        sb.append('=');
        sb.append(((this.instData19 == null)?"<null>":this.instData19));
        sb.append(',');
        sb.append("appYearAgency");
        sb.append('=');
        sb.append(((this.appYearAgency == null)?"<null>":this.appYearAgency));
        sb.append(',');
        sb.append("instData9");
        sb.append('=');
        sb.append(((this.instData9 == null)?"<null>":this.instData9));
        sb.append(',');
        sb.append("numberDeps");
        sb.append('=');
        sb.append(((this.numberDeps == null)?"<null>":this.numberDeps));
        sb.append(',');
        sb.append("instData8");
        sb.append('=');
        sb.append(((this.instData8 == null)?"<null>":this.instData8));
        sb.append(',');
        sb.append("instData5");
        sb.append('=');
        sb.append(((this.instData5 == null)?"<null>":this.instData5));
        sb.append(',');
        sb.append("instData10");
        sb.append('=');
        sb.append(((this.instData10 == null)?"<null>":this.instData10));
        sb.append(',');
        sb.append("instData4");
        sb.append('=');
        sb.append(((this.instData4 == null)?"<null>":this.instData4));
        sb.append(',');
        sb.append("instData7");
        sb.append('=');
        sb.append(((this.instData7 == null)?"<null>":this.instData7));
        sb.append(',');
        sb.append("instData6");
        sb.append('=');
        sb.append(((this.instData6 == null)?"<null>":this.instData6));
        sb.append(',');
        sb.append("instData1");
        sb.append('=');
        sb.append(((this.instData1 == null)?"<null>":this.instData1));
        sb.append(',');
        sb.append("race10");
        sb.append('=');
        sb.append(((this.race10 == null)?"<null>":this.race10));
        sb.append(',');
        sb.append("cntyBirthRural");
        sb.append('=');
        sb.append(((this.cntyBirthRural == null)?"<null>":this.cntyBirthRural));
        sb.append(',');
        sb.append("instData3");
        sb.append('=');
        sb.append(((this.instData3 == null)?"<null>":this.instData3));
        sb.append(',');
        sb.append("instData2");
        sb.append('=');
        sb.append(((this.instData2 == null)?"<null>":this.instData2));
        sb.append(',');
        sb.append("cycleChanged");
        sb.append('=');
        sb.append(((this.cycleChanged == null)?"<null>":this.cycleChanged));
        sb.append(',');
        sb.append("agencyFileNo");
        sb.append('=');
        sb.append(((this.agencyFileNo == null)?"<null>":this.agencyFileNo));
        sb.append(',');
        sb.append("eselCode");
        sb.append('=');
        sb.append(((this.eselCode == null)?"<null>":this.eselCode));
        sb.append(',');
        sb.append("ethnic10");
        sb.append('=');
        sb.append(((this.ethnic10 == null)?"<null>":this.ethnic10));
        sb.append(',');
        sb.append("instData20");
        sb.append('=');
        sb.append(((this.instData20 == null)?"<null>":this.instData20));
        sb.append(',');
        sb.append("hispInd");
        sb.append('=');
        sb.append(((this.hispInd == null)?"<null>":this.hispInd));
        sb.append(',');
        sb.append("sbgiCodeAdmit");
        sb.append('=');
        sb.append(((this.sbgiCodeAdmit == null)?"<null>":this.sbgiCodeAdmit));
        sb.append(',');
        sb.append("nextMcatDate");
        sb.append('=');
        sb.append(((this.nextMcatDate == null)?"<null>":this.nextMcatDate));
        sb.append(',');
        sb.append("cityBirth");
        sb.append('=');
        sb.append(((this.cityBirth == null)?"<null>":this.cityBirth));
        sb.append(',');
        sb.append("agencyReportDate");
        sb.append('=');
        sb.append(((this.agencyReportDate == null)?"<null>":this.agencyReportDate));
        sb.append(',');
        sb.append("bioNumber");
        sb.append('=');
        sb.append(((this.bioNumber == null)?"<null>":this.bioNumber));
        sb.append(',');
        sb.append("urmInd");
        sb.append('=');
        sb.append(((this.urmInd == null)?"<null>":this.urmInd));
        sb.append(',');
        sb.append("cntyAdmitRural");
        sb.append('=');
        sb.append(((this.cntyAdmitRural == null)?"<null>":this.cntyAdmitRural));
        sb.append(',');
        sb.append("race5");
        sb.append('=');
        sb.append(((this.race5 == null)?"<null>":this.race5));
        sb.append(',');
        sb.append("ethnic3");
        sb.append('=');
        sb.append(((this.ethnic3 == null)?"<null>":this.ethnic3));
        sb.append(',');
        sb.append("effecDate");
        sb.append('=');
        sb.append(((this.effecDate == null)?"<null>":this.effecDate));
        sb.append(',');
        sb.append("race6");
        sb.append('=');
        sb.append(((this.race6 == null)?"<null>":this.race6));
        sb.append(',');
        sb.append("ethnic4");
        sb.append('=');
        sb.append(((this.ethnic4 == null)?"<null>":this.ethnic4));
        sb.append(',');
        sb.append("race7");
        sb.append('=');
        sb.append(((this.race7 == null)?"<null>":this.race7));
        sb.append(',');
        sb.append("ethnic5");
        sb.append('=');
        sb.append(((this.ethnic5 == null)?"<null>":this.ethnic5));
        sb.append(',');
        sb.append("race8");
        sb.append('=');
        sb.append(((this.race8 == null)?"<null>":this.race8));
        sb.append(',');
        sb.append("ethnic6");
        sb.append('=');
        sb.append(((this.ethnic6 == null)?"<null>":this.ethnic6));
        sb.append(',');
        sb.append("race1");
        sb.append('=');
        sb.append(((this.race1 == null)?"<null>":this.race1));
        sb.append(',');
        sb.append("race2");
        sb.append('=');
        sb.append(((this.race2 == null)?"<null>":this.race2));
        sb.append(',');
        sb.append("race3");
        sb.append('=');
        sb.append(((this.race3 == null)?"<null>":this.race3));
        sb.append(',');
        sb.append("ethnic1");
        sb.append('=');
        sb.append(((this.ethnic1 == null)?"<null>":this.ethnic1));
        sb.append(',');
        sb.append("cntyCodeAdmit");
        sb.append('=');
        sb.append(((this.cntyCodeAdmit == null)?"<null>":this.cntyCodeAdmit));
        sb.append(',');
        sb.append("race4");
        sb.append('=');
        sb.append(((this.race4 == null)?"<null>":this.race4));
        sb.append(',');
        sb.append("ethnic2");
        sb.append('=');
        sb.append(((this.ethnic2 == null)?"<null>":this.ethnic2));
        sb.append(',');
        sb.append("amcasId");
        sb.append('=');
        sb.append(((this.amcasId == null)?"<null>":this.amcasId));
        sb.append(',');
        sb.append("ethnCodeSelf");
        sb.append('=');
        sb.append(((this.ethnCodeSelf == null)?"<null>":this.ethnCodeSelf));
        sb.append(',');
        sb.append("race9");
        sb.append('=');
        sb.append(((this.race9 == null)?"<null>":this.race9));
        sb.append(',');
        sb.append("ethnic7");
        sb.append('=');
        sb.append(((this.ethnic7 == null)?"<null>":this.ethnic7));
        sb.append(',');
        sb.append("cntyCodeBirth");
        sb.append('=');
        sb.append(((this.cntyCodeBirth == null)?"<null>":this.cntyCodeBirth));
        sb.append(',');
        sb.append("ethnic8");
        sb.append('=');
        sb.append(((this.ethnic8 == null)?"<null>":this.ethnic8));
        sb.append(',');
        sb.append("ethnic9");
        sb.append('=');
        sb.append(((this.ethnic9 == null)?"<null>":this.ethnic9));
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
        result = ((result* 31)+((this.applType == null)? 0 :this.applType.hashCode()));
        result = ((result* 31)+((this.prevApp1 == null)? 0 :this.prevApp1 .hashCode()));
        result = ((result* 31)+((this.flag9 == null)? 0 :this.flag9 .hashCode()));
        result = ((result* 31)+((this.flag8 == null)? 0 :this.flag8 .hashCode()));
        result = ((result* 31)+((this.prevApp3 == null)? 0 :this.prevApp3 .hashCode()));
        result = ((result* 31)+((this.flag7 == null)? 0 :this.flag7 .hashCode()));
        result = ((result* 31)+((this.prevApp2 == null)? 0 :this.prevApp2 .hashCode()));
        result = ((result* 31)+((this.flag6 == null)? 0 :this.flag6 .hashCode()));
        result = ((result* 31)+((this.flag5 == null)? 0 :this.flag5 .hashCode()));
        result = ((result* 31)+((this.prevApp4 == null)? 0 :this.prevApp4 .hashCode()));
        result = ((result* 31)+((this.flag4 == null)? 0 :this.flag4 .hashCode()));
        result = ((result* 31)+((this.flag3 == null)? 0 :this.flag3 .hashCode()));
        result = ((result* 31)+((this.flag2 == null)? 0 :this.flag2 .hashCode()));
        result = ((result* 31)+((this.flag1 == null)? 0 :this.flag1 .hashCode()));
        result = ((result* 31)+((this.keyblockApplNo == null)? 0 :this.keyblockApplNo.hashCode()));
        result = ((result* 31)+((this.statCodeAdmit == null)? 0 :this.statCodeAdmit.hashCode()));
        result = ((result* 31)+((this.natnCodeBirth == null)? 0 :this.natnCodeBirth.hashCode()));
        result = ((result* 31)+((this.natnCodeAdmit == null)? 0 :this.natnCodeAdmit.hashCode()));
        result = ((result* 31)+((this.agencyFeeWaived == null)? 0 :this.agencyFeeWaived.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.instData18 == null)? 0 :this.instData18 .hashCode()));
        result = ((result* 31)+((this.instData17 == null)? 0 :this.instData17 .hashCode()));
        result = ((result* 31)+((this.instData16 == null)? 0 :this.instData16 .hashCode()));
        result = ((result* 31)+((this.instData15 == null)? 0 :this.instData15 .hashCode()));
        result = ((result* 31)+((this.instData14 == null)? 0 :this.instData14 .hashCode()));
        result = ((result* 31)+((this.instData13 == null)? 0 :this.instData13 .hashCode()));
        result = ((result* 31)+((this.flag10 == null)? 0 :this.flag10 .hashCode()));
        result = ((result* 31)+((this.instData12 == null)? 0 :this.instData12 .hashCode()));
        result = ((result* 31)+((this.instData11 == null)? 0 :this.instData11 .hashCode()));
        result = ((result* 31)+((this.cycleAdded == null)? 0 :this.cycleAdded.hashCode()));
        result = ((result* 31)+((this.keyblockTerm == null)? 0 :this.keyblockTerm.hashCode()));
        result = ((result* 31)+((this.statCodeBirth == null)? 0 :this.statCodeBirth.hashCode()));
        result = ((result* 31)+((this.instData19 == null)? 0 :this.instData19 .hashCode()));
        result = ((result* 31)+((this.appYearAgency == null)? 0 :this.appYearAgency.hashCode()));
        result = ((result* 31)+((this.instData9 == null)? 0 :this.instData9 .hashCode()));
        result = ((result* 31)+((this.numberDeps == null)? 0 :this.numberDeps.hashCode()));
        result = ((result* 31)+((this.instData8 == null)? 0 :this.instData8 .hashCode()));
        result = ((result* 31)+((this.instData5 == null)? 0 :this.instData5 .hashCode()));
        result = ((result* 31)+((this.instData10 == null)? 0 :this.instData10 .hashCode()));
        result = ((result* 31)+((this.instData4 == null)? 0 :this.instData4 .hashCode()));
        result = ((result* 31)+((this.instData7 == null)? 0 :this.instData7 .hashCode()));
        result = ((result* 31)+((this.instData6 == null)? 0 :this.instData6 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.instData1 == null)? 0 :this.instData1 .hashCode()));
        result = ((result* 31)+((this.race10 == null)? 0 :this.race10 .hashCode()));
        result = ((result* 31)+((this.cntyBirthRural == null)? 0 :this.cntyBirthRural.hashCode()));
        result = ((result* 31)+((this.instData3 == null)? 0 :this.instData3 .hashCode()));
        result = ((result* 31)+((this.instData2 == null)? 0 :this.instData2 .hashCode()));
        result = ((result* 31)+((this.cycleChanged == null)? 0 :this.cycleChanged.hashCode()));
        result = ((result* 31)+((this.agencyFileNo == null)? 0 :this.agencyFileNo.hashCode()));
        result = ((result* 31)+((this.eselCode == null)? 0 :this.eselCode.hashCode()));
        result = ((result* 31)+((this.ethnic10 == null)? 0 :this.ethnic10 .hashCode()));
        result = ((result* 31)+((this.instData20 == null)? 0 :this.instData20 .hashCode()));
        result = ((result* 31)+((this.hispInd == null)? 0 :this.hispInd.hashCode()));
        result = ((result* 31)+((this.sbgiCodeAdmit == null)? 0 :this.sbgiCodeAdmit.hashCode()));
        result = ((result* 31)+((this.nextMcatDate == null)? 0 :this.nextMcatDate.hashCode()));
        result = ((result* 31)+((this.cityBirth == null)? 0 :this.cityBirth.hashCode()));
        result = ((result* 31)+((this.agencyReportDate == null)? 0 :this.agencyReportDate.hashCode()));
        result = ((result* 31)+((this.bioNumber == null)? 0 :this.bioNumber.hashCode()));
        result = ((result* 31)+((this.urmInd == null)? 0 :this.urmInd.hashCode()));
        result = ((result* 31)+((this.cntyAdmitRural == null)? 0 :this.cntyAdmitRural.hashCode()));
        result = ((result* 31)+((this.race5 == null)? 0 :this.race5 .hashCode()));
        result = ((result* 31)+((this.ethnic3 == null)? 0 :this.ethnic3 .hashCode()));
        result = ((result* 31)+((this.effecDate == null)? 0 :this.effecDate.hashCode()));
        result = ((result* 31)+((this.race6 == null)? 0 :this.race6 .hashCode()));
        result = ((result* 31)+((this.ethnic4 == null)? 0 :this.ethnic4 .hashCode()));
        result = ((result* 31)+((this.race7 == null)? 0 :this.race7 .hashCode()));
        result = ((result* 31)+((this.ethnic5 == null)? 0 :this.ethnic5 .hashCode()));
        result = ((result* 31)+((this.race8 == null)? 0 :this.race8 .hashCode()));
        result = ((result* 31)+((this.ethnic6 == null)? 0 :this.ethnic6 .hashCode()));
        result = ((result* 31)+((this.race1 == null)? 0 :this.race1 .hashCode()));
        result = ((result* 31)+((this.race2 == null)? 0 :this.race2 .hashCode()));
        result = ((result* 31)+((this.race3 == null)? 0 :this.race3 .hashCode()));
        result = ((result* 31)+((this.ethnic1 == null)? 0 :this.ethnic1 .hashCode()));
        result = ((result* 31)+((this.cntyCodeAdmit == null)? 0 :this.cntyCodeAdmit.hashCode()));
        result = ((result* 31)+((this.race4 == null)? 0 :this.race4 .hashCode()));
        result = ((result* 31)+((this.ethnic2 == null)? 0 :this.ethnic2 .hashCode()));
        result = ((result* 31)+((this.amcasId == null)? 0 :this.amcasId.hashCode()));
        result = ((result* 31)+((this.ethnCodeSelf == null)? 0 :this.ethnCodeSelf.hashCode()));
        result = ((result* 31)+((this.race9 == null)? 0 :this.race9 .hashCode()));
        result = ((result* 31)+((this.ethnic7 == null)? 0 :this.ethnic7 .hashCode()));
        result = ((result* 31)+((this.cntyCodeBirth == null)? 0 :this.cntyCodeBirth.hashCode()));
        result = ((result* 31)+((this.ethnic8 == null)? 0 :this.ethnic8 .hashCode()));
        result = ((result* 31)+((this.ethnic9 == null)? 0 :this.ethnic9 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationSupplementalInformation100PutRequest) == false) {
            return false;
        }
        ApplicationSupplementalInformation100PutRequest rhs = ((ApplicationSupplementalInformation100PutRequest) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.applType == rhs.applType)||((this.applType!= null)&&this.applType.equals(rhs.applType)))&&((this.prevApp1 == rhs.prevApp1)||((this.prevApp1 != null)&&this.prevApp1 .equals(rhs.prevApp1))))&&((this.flag9 == rhs.flag9)||((this.flag9 != null)&&this.flag9 .equals(rhs.flag9))))&&((this.flag8 == rhs.flag8)||((this.flag8 != null)&&this.flag8 .equals(rhs.flag8))))&&((this.prevApp3 == rhs.prevApp3)||((this.prevApp3 != null)&&this.prevApp3 .equals(rhs.prevApp3))))&&((this.flag7 == rhs.flag7)||((this.flag7 != null)&&this.flag7 .equals(rhs.flag7))))&&((this.prevApp2 == rhs.prevApp2)||((this.prevApp2 != null)&&this.prevApp2 .equals(rhs.prevApp2))))&&((this.flag6 == rhs.flag6)||((this.flag6 != null)&&this.flag6 .equals(rhs.flag6))))&&((this.flag5 == rhs.flag5)||((this.flag5 != null)&&this.flag5 .equals(rhs.flag5))))&&((this.prevApp4 == rhs.prevApp4)||((this.prevApp4 != null)&&this.prevApp4 .equals(rhs.prevApp4))))&&((this.flag4 == rhs.flag4)||((this.flag4 != null)&&this.flag4 .equals(rhs.flag4))))&&((this.flag3 == rhs.flag3)||((this.flag3 != null)&&this.flag3 .equals(rhs.flag3))))&&((this.flag2 == rhs.flag2)||((this.flag2 != null)&&this.flag2 .equals(rhs.flag2))))&&((this.flag1 == rhs.flag1)||((this.flag1 != null)&&this.flag1 .equals(rhs.flag1))))&&((this.keyblockApplNo == rhs.keyblockApplNo)||((this.keyblockApplNo!= null)&&this.keyblockApplNo.equals(rhs.keyblockApplNo))))&&((this.statCodeAdmit == rhs.statCodeAdmit)||((this.statCodeAdmit!= null)&&this.statCodeAdmit.equals(rhs.statCodeAdmit))))&&((this.natnCodeBirth == rhs.natnCodeBirth)||((this.natnCodeBirth!= null)&&this.natnCodeBirth.equals(rhs.natnCodeBirth))))&&((this.natnCodeAdmit == rhs.natnCodeAdmit)||((this.natnCodeAdmit!= null)&&this.natnCodeAdmit.equals(rhs.natnCodeAdmit))))&&((this.agencyFeeWaived == rhs.agencyFeeWaived)||((this.agencyFeeWaived!= null)&&this.agencyFeeWaived.equals(rhs.agencyFeeWaived))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.instData18 == rhs.instData18)||((this.instData18 != null)&&this.instData18 .equals(rhs.instData18))))&&((this.instData17 == rhs.instData17)||((this.instData17 != null)&&this.instData17 .equals(rhs.instData17))))&&((this.instData16 == rhs.instData16)||((this.instData16 != null)&&this.instData16 .equals(rhs.instData16))))&&((this.instData15 == rhs.instData15)||((this.instData15 != null)&&this.instData15 .equals(rhs.instData15))))&&((this.instData14 == rhs.instData14)||((this.instData14 != null)&&this.instData14 .equals(rhs.instData14))))&&((this.instData13 == rhs.instData13)||((this.instData13 != null)&&this.instData13 .equals(rhs.instData13))))&&((this.flag10 == rhs.flag10)||((this.flag10 != null)&&this.flag10 .equals(rhs.flag10))))&&((this.instData12 == rhs.instData12)||((this.instData12 != null)&&this.instData12 .equals(rhs.instData12))))&&((this.instData11 == rhs.instData11)||((this.instData11 != null)&&this.instData11 .equals(rhs.instData11))))&&((this.cycleAdded == rhs.cycleAdded)||((this.cycleAdded!= null)&&this.cycleAdded.equals(rhs.cycleAdded))))&&((this.keyblockTerm == rhs.keyblockTerm)||((this.keyblockTerm!= null)&&this.keyblockTerm.equals(rhs.keyblockTerm))))&&((this.statCodeBirth == rhs.statCodeBirth)||((this.statCodeBirth!= null)&&this.statCodeBirth.equals(rhs.statCodeBirth))))&&((this.instData19 == rhs.instData19)||((this.instData19 != null)&&this.instData19 .equals(rhs.instData19))))&&((this.appYearAgency == rhs.appYearAgency)||((this.appYearAgency!= null)&&this.appYearAgency.equals(rhs.appYearAgency))))&&((this.instData9 == rhs.instData9)||((this.instData9 != null)&&this.instData9 .equals(rhs.instData9))))&&((this.numberDeps == rhs.numberDeps)||((this.numberDeps!= null)&&this.numberDeps.equals(rhs.numberDeps))))&&((this.instData8 == rhs.instData8)||((this.instData8 != null)&&this.instData8 .equals(rhs.instData8))))&&((this.instData5 == rhs.instData5)||((this.instData5 != null)&&this.instData5 .equals(rhs.instData5))))&&((this.instData10 == rhs.instData10)||((this.instData10 != null)&&this.instData10 .equals(rhs.instData10))))&&((this.instData4 == rhs.instData4)||((this.instData4 != null)&&this.instData4 .equals(rhs.instData4))))&&((this.instData7 == rhs.instData7)||((this.instData7 != null)&&this.instData7 .equals(rhs.instData7))))&&((this.instData6 == rhs.instData6)||((this.instData6 != null)&&this.instData6 .equals(rhs.instData6))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.instData1 == rhs.instData1)||((this.instData1 != null)&&this.instData1 .equals(rhs.instData1))))&&((this.race10 == rhs.race10)||((this.race10 != null)&&this.race10 .equals(rhs.race10))))&&((this.cntyBirthRural == rhs.cntyBirthRural)||((this.cntyBirthRural!= null)&&this.cntyBirthRural.equals(rhs.cntyBirthRural))))&&((this.instData3 == rhs.instData3)||((this.instData3 != null)&&this.instData3 .equals(rhs.instData3))))&&((this.instData2 == rhs.instData2)||((this.instData2 != null)&&this.instData2 .equals(rhs.instData2))))&&((this.cycleChanged == rhs.cycleChanged)||((this.cycleChanged!= null)&&this.cycleChanged.equals(rhs.cycleChanged))))&&((this.agencyFileNo == rhs.agencyFileNo)||((this.agencyFileNo!= null)&&this.agencyFileNo.equals(rhs.agencyFileNo))))&&((this.eselCode == rhs.eselCode)||((this.eselCode!= null)&&this.eselCode.equals(rhs.eselCode))))&&((this.ethnic10 == rhs.ethnic10)||((this.ethnic10 != null)&&this.ethnic10 .equals(rhs.ethnic10))))&&((this.instData20 == rhs.instData20)||((this.instData20 != null)&&this.instData20 .equals(rhs.instData20))))&&((this.hispInd == rhs.hispInd)||((this.hispInd!= null)&&this.hispInd.equals(rhs.hispInd))))&&((this.sbgiCodeAdmit == rhs.sbgiCodeAdmit)||((this.sbgiCodeAdmit!= null)&&this.sbgiCodeAdmit.equals(rhs.sbgiCodeAdmit))))&&((this.nextMcatDate == rhs.nextMcatDate)||((this.nextMcatDate!= null)&&this.nextMcatDate.equals(rhs.nextMcatDate))))&&((this.cityBirth == rhs.cityBirth)||((this.cityBirth!= null)&&this.cityBirth.equals(rhs.cityBirth))))&&((this.agencyReportDate == rhs.agencyReportDate)||((this.agencyReportDate!= null)&&this.agencyReportDate.equals(rhs.agencyReportDate))))&&((this.bioNumber == rhs.bioNumber)||((this.bioNumber!= null)&&this.bioNumber.equals(rhs.bioNumber))))&&((this.urmInd == rhs.urmInd)||((this.urmInd!= null)&&this.urmInd.equals(rhs.urmInd))))&&((this.cntyAdmitRural == rhs.cntyAdmitRural)||((this.cntyAdmitRural!= null)&&this.cntyAdmitRural.equals(rhs.cntyAdmitRural))))&&((this.race5 == rhs.race5)||((this.race5 != null)&&this.race5 .equals(rhs.race5))))&&((this.ethnic3 == rhs.ethnic3)||((this.ethnic3 != null)&&this.ethnic3 .equals(rhs.ethnic3))))&&((this.effecDate == rhs.effecDate)||((this.effecDate!= null)&&this.effecDate.equals(rhs.effecDate))))&&((this.race6 == rhs.race6)||((this.race6 != null)&&this.race6 .equals(rhs.race6))))&&((this.ethnic4 == rhs.ethnic4)||((this.ethnic4 != null)&&this.ethnic4 .equals(rhs.ethnic4))))&&((this.race7 == rhs.race7)||((this.race7 != null)&&this.race7 .equals(rhs.race7))))&&((this.ethnic5 == rhs.ethnic5)||((this.ethnic5 != null)&&this.ethnic5 .equals(rhs.ethnic5))))&&((this.race8 == rhs.race8)||((this.race8 != null)&&this.race8 .equals(rhs.race8))))&&((this.ethnic6 == rhs.ethnic6)||((this.ethnic6 != null)&&this.ethnic6 .equals(rhs.ethnic6))))&&((this.race1 == rhs.race1)||((this.race1 != null)&&this.race1 .equals(rhs.race1))))&&((this.race2 == rhs.race2)||((this.race2 != null)&&this.race2 .equals(rhs.race2))))&&((this.race3 == rhs.race3)||((this.race3 != null)&&this.race3 .equals(rhs.race3))))&&((this.ethnic1 == rhs.ethnic1)||((this.ethnic1 != null)&&this.ethnic1 .equals(rhs.ethnic1))))&&((this.cntyCodeAdmit == rhs.cntyCodeAdmit)||((this.cntyCodeAdmit!= null)&&this.cntyCodeAdmit.equals(rhs.cntyCodeAdmit))))&&((this.race4 == rhs.race4)||((this.race4 != null)&&this.race4 .equals(rhs.race4))))&&((this.ethnic2 == rhs.ethnic2)||((this.ethnic2 != null)&&this.ethnic2 .equals(rhs.ethnic2))))&&((this.amcasId == rhs.amcasId)||((this.amcasId!= null)&&this.amcasId.equals(rhs.amcasId))))&&((this.ethnCodeSelf == rhs.ethnCodeSelf)||((this.ethnCodeSelf!= null)&&this.ethnCodeSelf.equals(rhs.ethnCodeSelf))))&&((this.race9 == rhs.race9)||((this.race9 != null)&&this.race9 .equals(rhs.race9))))&&((this.ethnic7 == rhs.ethnic7)||((this.ethnic7 != null)&&this.ethnic7 .equals(rhs.ethnic7))))&&((this.cntyCodeBirth == rhs.cntyCodeBirth)||((this.cntyCodeBirth!= null)&&this.cntyCodeBirth.equals(rhs.cntyCodeBirth))))&&((this.ethnic8 == rhs.ethnic8)||((this.ethnic8 != null)&&this.ethnic8 .equals(rhs.ethnic8))))&&((this.ethnic9 == rhs.ethnic9)||((this.ethnic9 != null)&&this.ethnic9 .equals(rhs.ethnic9))));
    }

}
