
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
    "prevApp3",
    "prevApp2",
    "prevApp4",
    "instData3Desc",
    "race5Desc",
    "instData1Desc",
    "instData13Desc",
    "natnCodeAdmit",
    "agencyFeeWaived",
    "ethnic4Desc",
    "instData5Desc",
    "admtNatnDesc",
    "race3Desc",
    "statCodeBirth",
    "race1Desc",
    "appYearAgency",
    "instData9",
    "instData8",
    "flagDesc",
    "instData5",
    "instData11Desc",
    "instData4",
    "instData7",
    "ethnic2Desc",
    "instData6",
    "instData1",
    "instData3",
    "instData2",
    "race9Desc",
    "birthCntyDesc",
    "ethnic9Desc",
    "admitSbgiDesc",
    "instData18Desc",
    "instData6Desc",
    "sbgiCodeAdmit",
    "nextMcatDate",
    "race7Desc",
    "ethnic10Desc",
    "admtStatDesc",
    "instData14Desc",
    "cityBirth",
    "ethnic7Desc",
    "admitEselDesc",
    "bioNumber",
    "urmInd",
    "instData16Desc",
    "instData8Desc",
    "cntyCodeBirth",
    "instData20Desc",
    "flag9",
    "flag8",
    "instData12Desc",
    "flag7",
    "flag6",
    "flag5",
    "flag4",
    "flag3",
    "flag2",
    "flag1",
    "ethnic5Desc",
    "admtCntyDesc",
    "race10Desc",
    "statCodeAdmit",
    "natnCodeBirth",
    "birthNatnDesc",
    "instData2Desc",
    "race4Desc",
    "instData18",
    "instData19Desc",
    "instData17",
    "instData16",
    "instData15",
    "instData14",
    "instData13",
    "flag10",
    "instData12",
    "instData11",
    "ethnic3Desc",
    "instData10Desc",
    "birthStatDesc",
    "cycleAdded",
    "admitEthnDesc",
    "instData19",
    "ethnic1Desc",
    "numberDeps",
    "instData10",
    "race2Desc",
    "race10",
    "instData4Desc",
    "cntyBirthRural",
    "cycleChanged",
    "agencyFileNo",
    "instData17Desc",
    "eselCode",
    "instData7Desc",
    "ethnic10",
    "ethnic8Desc",
    "instData20",
    "race8Desc",
    "hispInd",
    "instData9Desc",
    "agencyReportDate",
    "cntyAdmitRural",
    "ethnic3",
    "race5",
    "race6Desc",
    "effecDate",
    "ethnic4",
    "race6",
    "ethnic5",
    "race7",
    "ethnic6",
    "race8",
    "race1",
    "instData15Desc",
    "race2",
    "ethnic1",
    "race3",
    "cntyCodeAdmit",
    "ethnic2",
    "race4",
    "amcasId",
    "ethnic7",
    "ethnCodeSelf",
    "race9",
    "ethnic8",
    "ethnic9",
    "ethnic6Desc"
})
@Generated("jsonschema2pojo")
public class ApplicationSupplementalInformation100PutResponse {

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
     * Sabsupl Prev App 3
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_3
     * 
     */
    @JsonProperty("prevApp3")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_PREV_APP_3")
    private Double prevApp3;
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
     * Sabsupl Prev App 4
     * <p>
     * Lineage reference object : SABSUPL_PREV_APP_4
     * 
     */
    @JsonProperty("prevApp4")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_PREV_APP_4")
    private Double prevApp4;
    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("instData3Desc")
    private String instData3Desc;
    @JsonProperty("race5Desc")
    private String race5Desc;
    /**
     *  1
     * <p>
     * 
     * 
     */
    @JsonProperty("instData1Desc")
    private String instData1Desc;
    /**
     *  13
     * <p>
     * 
     * 
     */
    @JsonProperty("instData13Desc")
    private String instData13Desc;
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
    @JsonProperty("ethnic4Desc")
    private String ethnic4Desc;
    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("instData5Desc")
    private String instData5Desc;
    @JsonProperty("admtNatnDesc")
    private String admtNatnDesc;
    @JsonProperty("race3Desc")
    private String race3Desc;
    /**
     * Sabsupl Stat Code Birth
     * <p>
     * Lineage reference object : SABSUPL_STAT_CODE_BIRTH, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCodeBirth")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_STAT_CODE_BIRTH, Lookup lineage reference object : stvstat")
    private String statCodeBirth;
    @JsonProperty("race1Desc")
    private String race1Desc;
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
     * Sabsupl Inst Data8
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA8
     * 
     */
    @JsonProperty("instData8")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA8")
    private String instData8;
    /**
     * Flags Description
     * <p>
     * 
     * 
     */
    @JsonProperty("flagDesc")
    private String flagDesc;
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
     *  11
     * <p>
     * 
     * 
     */
    @JsonProperty("instData11Desc")
    private String instData11Desc;
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
    @JsonProperty("ethnic2Desc")
    private String ethnic2Desc;
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
    @JsonProperty("race9Desc")
    private String race9Desc;
    @JsonProperty("birthCntyDesc")
    private String birthCntyDesc;
    @JsonProperty("ethnic9Desc")
    private String ethnic9Desc;
    @JsonProperty("admitSbgiDesc")
    private String admitSbgiDesc;
    /**
     *  18
     * <p>
     * 
     * 
     */
    @JsonProperty("instData18Desc")
    private String instData18Desc;
    /**
     *  6
     * <p>
     * 
     * 
     */
    @JsonProperty("instData6Desc")
    private String instData6Desc;
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
    @JsonProperty("race7Desc")
    private String race7Desc;
    @JsonProperty("ethnic10Desc")
    private String ethnic10Desc;
    @JsonProperty("admtStatDesc")
    private String admtStatDesc;
    /**
     *  14
     * <p>
     * 
     * 
     */
    @JsonProperty("instData14Desc")
    private String instData14Desc;
    /**
     * Sabsupl City Birth
     * <p>
     * Lineage reference object : SABSUPL_CITY_BIRTH
     * 
     */
    @JsonProperty("cityBirth")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_CITY_BIRTH")
    private String cityBirth;
    @JsonProperty("ethnic7Desc")
    private String ethnic7Desc;
    @JsonProperty("admitEselDesc")
    private String admitEselDesc;
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
     *  16
     * <p>
     * 
     * 
     */
    @JsonProperty("instData16Desc")
    private String instData16Desc;
    /**
     *  8
     * <p>
     * 
     * 
     */
    @JsonProperty("instData8Desc")
    private String instData8Desc;
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
     *  20
     * <p>
     * 
     * 
     */
    @JsonProperty("instData20Desc")
    private String instData20Desc;
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
     *  12
     * <p>
     * 
     * 
     */
    @JsonProperty("instData12Desc")
    private String instData12Desc;
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
    @JsonProperty("ethnic5Desc")
    private String ethnic5Desc;
    @JsonProperty("admtCntyDesc")
    private String admtCntyDesc;
    @JsonProperty("race10Desc")
    private String race10Desc;
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
    @JsonProperty("birthNatnDesc")
    private String birthNatnDesc;
    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("instData2Desc")
    private String instData2Desc;
    @JsonProperty("race4Desc")
    private String race4Desc;
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
     *  19
     * <p>
     * 
     * 
     */
    @JsonProperty("instData19Desc")
    private String instData19Desc;
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
    @JsonProperty("ethnic3Desc")
    private String ethnic3Desc;
    /**
     *  10
     * <p>
     * 
     * 
     */
    @JsonProperty("instData10Desc")
    private String instData10Desc;
    @JsonProperty("birthStatDesc")
    private String birthStatDesc;
    /**
     * Sabsupl Cycle Added
     * <p>
     * Lineage reference object : SABSUPL_CYCLE_ADDED
     * 
     */
    @JsonProperty("cycleAdded")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_CYCLE_ADDED")
    private Double cycleAdded;
    @JsonProperty("admitEthnDesc")
    private String admitEthnDesc;
    /**
     * Sabsupl Inst Data19
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA19
     * 
     */
    @JsonProperty("instData19")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA19")
    private String instData19;
    @JsonProperty("ethnic1Desc")
    private String ethnic1Desc;
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
     * Sabsupl Inst Data10
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA10
     * 
     */
    @JsonProperty("instData10")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA10")
    private String instData10;
    @JsonProperty("race2Desc")
    private String race2Desc;
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
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("instData4Desc")
    private String instData4Desc;
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
     *  17
     * <p>
     * 
     * 
     */
    @JsonProperty("instData17Desc")
    private String instData17Desc;
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
     *  7
     * <p>
     * 
     * 
     */
    @JsonProperty("instData7Desc")
    private String instData7Desc;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_ETHNIC10, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic10")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC10, Lookup lineage reference object : stvethn")
    private String ethnic10;
    @JsonProperty("ethnic8Desc")
    private String ethnic8Desc;
    /**
     * Sabsupl Inst Data20
     * <p>
     * Lineage reference object : SABSUPL_INST_DATA20
     * 
     */
    @JsonProperty("instData20")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_INST_DATA20")
    private String instData20;
    @JsonProperty("race8Desc")
    private String race8Desc;
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
     *  9
     * <p>
     * 
     * 
     */
    @JsonProperty("instData9Desc")
    private String instData9Desc;
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
     * Lineage reference object : SABSUPL_ETHNIC3, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic3")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC3, Lookup lineage reference object : stvethn")
    private String ethnic3;
    /**
     * Sabsupl Ethn Code Self
     * <p>
     * Lineage reference object : SABSUPL_RACE5, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race5")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE5, Lookup lineage reference object : gorrace")
    private String race5;
    @JsonProperty("race6Desc")
    private String race6Desc;
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
     * Lineage reference object : SABSUPL_ETHNIC4, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic4")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC4, Lookup lineage reference object : stvethn")
    private String ethnic4;
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
     * Lineage reference object : SABSUPL_ETHNIC5, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic5")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC5, Lookup lineage reference object : stvethn")
    private String ethnic5;
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
     * Lineage reference object : SABSUPL_ETHNIC6, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic6")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC6, Lookup lineage reference object : stvethn")
    private String ethnic6;
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
     * Lineage reference object : SABSUPL_RACE1, Lookup lineage reference object : gorrace
     * 
     */
    @JsonProperty("race1")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_RACE1, Lookup lineage reference object : gorrace")
    private String race1;
    /**
     *  15
     * <p>
     * 
     * 
     */
    @JsonProperty("instData15Desc")
    private String instData15Desc;
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
     * Lineage reference object : SABSUPL_ETHNIC1, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic1")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC1, Lookup lineage reference object : stvethn")
    private String ethnic1;
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
     * Lineage reference object : SABSUPL_ETHNIC2, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic2")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC2, Lookup lineage reference object : stvethn")
    private String ethnic2;
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
     * Lineage reference object : SABSUPL_ETHNIC7, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnic7")
    @JsonPropertyDescription("Lineage reference object : SABSUPL_ETHNIC7, Lookup lineage reference object : stvethn")
    private String ethnic7;
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
    @JsonProperty("ethnic6Desc")
    private String ethnic6Desc;
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

    public ApplicationSupplementalInformation100PutResponse withApplType(String applType) {
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

    public ApplicationSupplementalInformation100PutResponse withPrevApp1(Double prevApp1) {
        this.prevApp1 = prevApp1;
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

    public ApplicationSupplementalInformation100PutResponse withPrevApp3(Double prevApp3) {
        this.prevApp3 = prevApp3;
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

    public ApplicationSupplementalInformation100PutResponse withPrevApp2(Double prevApp2) {
        this.prevApp2 = prevApp2;
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

    public ApplicationSupplementalInformation100PutResponse withPrevApp4(Double prevApp4) {
        this.prevApp4 = prevApp4;
        return this;
    }

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("instData3Desc")
    public String getInstData3Desc() {
        return instData3Desc;
    }

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("instData3Desc")
    public void setInstData3Desc(String instData3Desc) {
        this.instData3Desc = instData3Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData3Desc(String instData3Desc) {
        this.instData3Desc = instData3Desc;
        return this;
    }

    @JsonProperty("race5Desc")
    public String getRace5Desc() {
        return race5Desc;
    }

    @JsonProperty("race5Desc")
    public void setRace5Desc(String race5Desc) {
        this.race5Desc = race5Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace5Desc(String race5Desc) {
        this.race5Desc = race5Desc;
        return this;
    }

    /**
     *  1
     * <p>
     * 
     * 
     */
    @JsonProperty("instData1Desc")
    public String getInstData1Desc() {
        return instData1Desc;
    }

    /**
     *  1
     * <p>
     * 
     * 
     */
    @JsonProperty("instData1Desc")
    public void setInstData1Desc(String instData1Desc) {
        this.instData1Desc = instData1Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData1Desc(String instData1Desc) {
        this.instData1Desc = instData1Desc;
        return this;
    }

    /**
     *  13
     * <p>
     * 
     * 
     */
    @JsonProperty("instData13Desc")
    public String getInstData13Desc() {
        return instData13Desc;
    }

    /**
     *  13
     * <p>
     * 
     * 
     */
    @JsonProperty("instData13Desc")
    public void setInstData13Desc(String instData13Desc) {
        this.instData13Desc = instData13Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData13Desc(String instData13Desc) {
        this.instData13Desc = instData13Desc;
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

    public ApplicationSupplementalInformation100PutResponse withNatnCodeAdmit(String natnCodeAdmit) {
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

    public ApplicationSupplementalInformation100PutResponse withAgencyFeeWaived(String agencyFeeWaived) {
        this.agencyFeeWaived = agencyFeeWaived;
        return this;
    }

    @JsonProperty("ethnic4Desc")
    public String getEthnic4Desc() {
        return ethnic4Desc;
    }

    @JsonProperty("ethnic4Desc")
    public void setEthnic4Desc(String ethnic4Desc) {
        this.ethnic4Desc = ethnic4Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic4Desc(String ethnic4Desc) {
        this.ethnic4Desc = ethnic4Desc;
        return this;
    }

    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("instData5Desc")
    public String getInstData5Desc() {
        return instData5Desc;
    }

    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("instData5Desc")
    public void setInstData5Desc(String instData5Desc) {
        this.instData5Desc = instData5Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData5Desc(String instData5Desc) {
        this.instData5Desc = instData5Desc;
        return this;
    }

    @JsonProperty("admtNatnDesc")
    public String getAdmtNatnDesc() {
        return admtNatnDesc;
    }

    @JsonProperty("admtNatnDesc")
    public void setAdmtNatnDesc(String admtNatnDesc) {
        this.admtNatnDesc = admtNatnDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withAdmtNatnDesc(String admtNatnDesc) {
        this.admtNatnDesc = admtNatnDesc;
        return this;
    }

    @JsonProperty("race3Desc")
    public String getRace3Desc() {
        return race3Desc;
    }

    @JsonProperty("race3Desc")
    public void setRace3Desc(String race3Desc) {
        this.race3Desc = race3Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace3Desc(String race3Desc) {
        this.race3Desc = race3Desc;
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

    public ApplicationSupplementalInformation100PutResponse withStatCodeBirth(String statCodeBirth) {
        this.statCodeBirth = statCodeBirth;
        return this;
    }

    @JsonProperty("race1Desc")
    public String getRace1Desc() {
        return race1Desc;
    }

    @JsonProperty("race1Desc")
    public void setRace1Desc(String race1Desc) {
        this.race1Desc = race1Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace1Desc(String race1Desc) {
        this.race1Desc = race1Desc;
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

    public ApplicationSupplementalInformation100PutResponse withAppYearAgency(Double appYearAgency) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData9(String instData9) {
        this.instData9 = instData9;
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

    public ApplicationSupplementalInformation100PutResponse withInstData8(String instData8) {
        this.instData8 = instData8;
        return this;
    }

    /**
     * Flags Description
     * <p>
     * 
     * 
     */
    @JsonProperty("flagDesc")
    public String getFlagDesc() {
        return flagDesc;
    }

    /**
     * Flags Description
     * <p>
     * 
     * 
     */
    @JsonProperty("flagDesc")
    public void setFlagDesc(String flagDesc) {
        this.flagDesc = flagDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withFlagDesc(String flagDesc) {
        this.flagDesc = flagDesc;
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

    public ApplicationSupplementalInformation100PutResponse withInstData5(String instData5) {
        this.instData5 = instData5;
        return this;
    }

    /**
     *  11
     * <p>
     * 
     * 
     */
    @JsonProperty("instData11Desc")
    public String getInstData11Desc() {
        return instData11Desc;
    }

    /**
     *  11
     * <p>
     * 
     * 
     */
    @JsonProperty("instData11Desc")
    public void setInstData11Desc(String instData11Desc) {
        this.instData11Desc = instData11Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData11Desc(String instData11Desc) {
        this.instData11Desc = instData11Desc;
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

    public ApplicationSupplementalInformation100PutResponse withInstData4(String instData4) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData7(String instData7) {
        this.instData7 = instData7;
        return this;
    }

    @JsonProperty("ethnic2Desc")
    public String getEthnic2Desc() {
        return ethnic2Desc;
    }

    @JsonProperty("ethnic2Desc")
    public void setEthnic2Desc(String ethnic2Desc) {
        this.ethnic2Desc = ethnic2Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic2Desc(String ethnic2Desc) {
        this.ethnic2Desc = ethnic2Desc;
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

    public ApplicationSupplementalInformation100PutResponse withInstData6(String instData6) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData1(String instData1) {
        this.instData1 = instData1;
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

    public ApplicationSupplementalInformation100PutResponse withInstData3(String instData3) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData2(String instData2) {
        this.instData2 = instData2;
        return this;
    }

    @JsonProperty("race9Desc")
    public String getRace9Desc() {
        return race9Desc;
    }

    @JsonProperty("race9Desc")
    public void setRace9Desc(String race9Desc) {
        this.race9Desc = race9Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace9Desc(String race9Desc) {
        this.race9Desc = race9Desc;
        return this;
    }

    @JsonProperty("birthCntyDesc")
    public String getBirthCntyDesc() {
        return birthCntyDesc;
    }

    @JsonProperty("birthCntyDesc")
    public void setBirthCntyDesc(String birthCntyDesc) {
        this.birthCntyDesc = birthCntyDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withBirthCntyDesc(String birthCntyDesc) {
        this.birthCntyDesc = birthCntyDesc;
        return this;
    }

    @JsonProperty("ethnic9Desc")
    public String getEthnic9Desc() {
        return ethnic9Desc;
    }

    @JsonProperty("ethnic9Desc")
    public void setEthnic9Desc(String ethnic9Desc) {
        this.ethnic9Desc = ethnic9Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic9Desc(String ethnic9Desc) {
        this.ethnic9Desc = ethnic9Desc;
        return this;
    }

    @JsonProperty("admitSbgiDesc")
    public String getAdmitSbgiDesc() {
        return admitSbgiDesc;
    }

    @JsonProperty("admitSbgiDesc")
    public void setAdmitSbgiDesc(String admitSbgiDesc) {
        this.admitSbgiDesc = admitSbgiDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withAdmitSbgiDesc(String admitSbgiDesc) {
        this.admitSbgiDesc = admitSbgiDesc;
        return this;
    }

    /**
     *  18
     * <p>
     * 
     * 
     */
    @JsonProperty("instData18Desc")
    public String getInstData18Desc() {
        return instData18Desc;
    }

    /**
     *  18
     * <p>
     * 
     * 
     */
    @JsonProperty("instData18Desc")
    public void setInstData18Desc(String instData18Desc) {
        this.instData18Desc = instData18Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData18Desc(String instData18Desc) {
        this.instData18Desc = instData18Desc;
        return this;
    }

    /**
     *  6
     * <p>
     * 
     * 
     */
    @JsonProperty("instData6Desc")
    public String getInstData6Desc() {
        return instData6Desc;
    }

    /**
     *  6
     * <p>
     * 
     * 
     */
    @JsonProperty("instData6Desc")
    public void setInstData6Desc(String instData6Desc) {
        this.instData6Desc = instData6Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData6Desc(String instData6Desc) {
        this.instData6Desc = instData6Desc;
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

    public ApplicationSupplementalInformation100PutResponse withSbgiCodeAdmit(String sbgiCodeAdmit) {
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

    public ApplicationSupplementalInformation100PutResponse withNextMcatDate(Date nextMcatDate) {
        this.nextMcatDate = nextMcatDate;
        return this;
    }

    @JsonProperty("race7Desc")
    public String getRace7Desc() {
        return race7Desc;
    }

    @JsonProperty("race7Desc")
    public void setRace7Desc(String race7Desc) {
        this.race7Desc = race7Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace7Desc(String race7Desc) {
        this.race7Desc = race7Desc;
        return this;
    }

    @JsonProperty("ethnic10Desc")
    public String getEthnic10Desc() {
        return ethnic10Desc;
    }

    @JsonProperty("ethnic10Desc")
    public void setEthnic10Desc(String ethnic10Desc) {
        this.ethnic10Desc = ethnic10Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic10Desc(String ethnic10Desc) {
        this.ethnic10Desc = ethnic10Desc;
        return this;
    }

    @JsonProperty("admtStatDesc")
    public String getAdmtStatDesc() {
        return admtStatDesc;
    }

    @JsonProperty("admtStatDesc")
    public void setAdmtStatDesc(String admtStatDesc) {
        this.admtStatDesc = admtStatDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withAdmtStatDesc(String admtStatDesc) {
        this.admtStatDesc = admtStatDesc;
        return this;
    }

    /**
     *  14
     * <p>
     * 
     * 
     */
    @JsonProperty("instData14Desc")
    public String getInstData14Desc() {
        return instData14Desc;
    }

    /**
     *  14
     * <p>
     * 
     * 
     */
    @JsonProperty("instData14Desc")
    public void setInstData14Desc(String instData14Desc) {
        this.instData14Desc = instData14Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData14Desc(String instData14Desc) {
        this.instData14Desc = instData14Desc;
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

    public ApplicationSupplementalInformation100PutResponse withCityBirth(String cityBirth) {
        this.cityBirth = cityBirth;
        return this;
    }

    @JsonProperty("ethnic7Desc")
    public String getEthnic7Desc() {
        return ethnic7Desc;
    }

    @JsonProperty("ethnic7Desc")
    public void setEthnic7Desc(String ethnic7Desc) {
        this.ethnic7Desc = ethnic7Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic7Desc(String ethnic7Desc) {
        this.ethnic7Desc = ethnic7Desc;
        return this;
    }

    @JsonProperty("admitEselDesc")
    public String getAdmitEselDesc() {
        return admitEselDesc;
    }

    @JsonProperty("admitEselDesc")
    public void setAdmitEselDesc(String admitEselDesc) {
        this.admitEselDesc = admitEselDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withAdmitEselDesc(String admitEselDesc) {
        this.admitEselDesc = admitEselDesc;
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

    public ApplicationSupplementalInformation100PutResponse withBioNumber(String bioNumber) {
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

    public ApplicationSupplementalInformation100PutResponse withUrmInd(String urmInd) {
        this.urmInd = urmInd;
        return this;
    }

    /**
     *  16
     * <p>
     * 
     * 
     */
    @JsonProperty("instData16Desc")
    public String getInstData16Desc() {
        return instData16Desc;
    }

    /**
     *  16
     * <p>
     * 
     * 
     */
    @JsonProperty("instData16Desc")
    public void setInstData16Desc(String instData16Desc) {
        this.instData16Desc = instData16Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData16Desc(String instData16Desc) {
        this.instData16Desc = instData16Desc;
        return this;
    }

    /**
     *  8
     * <p>
     * 
     * 
     */
    @JsonProperty("instData8Desc")
    public String getInstData8Desc() {
        return instData8Desc;
    }

    /**
     *  8
     * <p>
     * 
     * 
     */
    @JsonProperty("instData8Desc")
    public void setInstData8Desc(String instData8Desc) {
        this.instData8Desc = instData8Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData8Desc(String instData8Desc) {
        this.instData8Desc = instData8Desc;
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

    public ApplicationSupplementalInformation100PutResponse withCntyCodeBirth(String cntyCodeBirth) {
        this.cntyCodeBirth = cntyCodeBirth;
        return this;
    }

    /**
     *  20
     * <p>
     * 
     * 
     */
    @JsonProperty("instData20Desc")
    public String getInstData20Desc() {
        return instData20Desc;
    }

    /**
     *  20
     * <p>
     * 
     * 
     */
    @JsonProperty("instData20Desc")
    public void setInstData20Desc(String instData20Desc) {
        this.instData20Desc = instData20Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData20Desc(String instData20Desc) {
        this.instData20Desc = instData20Desc;
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

    public ApplicationSupplementalInformation100PutResponse withFlag9(String flag9) {
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

    public ApplicationSupplementalInformation100PutResponse withFlag8(String flag8) {
        this.flag8 = flag8;
        return this;
    }

    /**
     *  12
     * <p>
     * 
     * 
     */
    @JsonProperty("instData12Desc")
    public String getInstData12Desc() {
        return instData12Desc;
    }

    /**
     *  12
     * <p>
     * 
     * 
     */
    @JsonProperty("instData12Desc")
    public void setInstData12Desc(String instData12Desc) {
        this.instData12Desc = instData12Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData12Desc(String instData12Desc) {
        this.instData12Desc = instData12Desc;
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

    public ApplicationSupplementalInformation100PutResponse withFlag7(String flag7) {
        this.flag7 = flag7;
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

    public ApplicationSupplementalInformation100PutResponse withFlag6(String flag6) {
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

    public ApplicationSupplementalInformation100PutResponse withFlag5(String flag5) {
        this.flag5 = flag5;
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

    public ApplicationSupplementalInformation100PutResponse withFlag4(String flag4) {
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

    public ApplicationSupplementalInformation100PutResponse withFlag3(String flag3) {
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

    public ApplicationSupplementalInformation100PutResponse withFlag2(String flag2) {
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

    public ApplicationSupplementalInformation100PutResponse withFlag1(String flag1) {
        this.flag1 = flag1;
        return this;
    }

    @JsonProperty("ethnic5Desc")
    public String getEthnic5Desc() {
        return ethnic5Desc;
    }

    @JsonProperty("ethnic5Desc")
    public void setEthnic5Desc(String ethnic5Desc) {
        this.ethnic5Desc = ethnic5Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic5Desc(String ethnic5Desc) {
        this.ethnic5Desc = ethnic5Desc;
        return this;
    }

    @JsonProperty("admtCntyDesc")
    public String getAdmtCntyDesc() {
        return admtCntyDesc;
    }

    @JsonProperty("admtCntyDesc")
    public void setAdmtCntyDesc(String admtCntyDesc) {
        this.admtCntyDesc = admtCntyDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withAdmtCntyDesc(String admtCntyDesc) {
        this.admtCntyDesc = admtCntyDesc;
        return this;
    }

    @JsonProperty("race10Desc")
    public String getRace10Desc() {
        return race10Desc;
    }

    @JsonProperty("race10Desc")
    public void setRace10Desc(String race10Desc) {
        this.race10Desc = race10Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace10Desc(String race10Desc) {
        this.race10Desc = race10Desc;
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

    public ApplicationSupplementalInformation100PutResponse withStatCodeAdmit(String statCodeAdmit) {
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

    public ApplicationSupplementalInformation100PutResponse withNatnCodeBirth(String natnCodeBirth) {
        this.natnCodeBirth = natnCodeBirth;
        return this;
    }

    @JsonProperty("birthNatnDesc")
    public String getBirthNatnDesc() {
        return birthNatnDesc;
    }

    @JsonProperty("birthNatnDesc")
    public void setBirthNatnDesc(String birthNatnDesc) {
        this.birthNatnDesc = birthNatnDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withBirthNatnDesc(String birthNatnDesc) {
        this.birthNatnDesc = birthNatnDesc;
        return this;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("instData2Desc")
    public String getInstData2Desc() {
        return instData2Desc;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("instData2Desc")
    public void setInstData2Desc(String instData2Desc) {
        this.instData2Desc = instData2Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData2Desc(String instData2Desc) {
        this.instData2Desc = instData2Desc;
        return this;
    }

    @JsonProperty("race4Desc")
    public String getRace4Desc() {
        return race4Desc;
    }

    @JsonProperty("race4Desc")
    public void setRace4Desc(String race4Desc) {
        this.race4Desc = race4Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace4Desc(String race4Desc) {
        this.race4Desc = race4Desc;
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

    public ApplicationSupplementalInformation100PutResponse withInstData18(String instData18) {
        this.instData18 = instData18;
        return this;
    }

    /**
     *  19
     * <p>
     * 
     * 
     */
    @JsonProperty("instData19Desc")
    public String getInstData19Desc() {
        return instData19Desc;
    }

    /**
     *  19
     * <p>
     * 
     * 
     */
    @JsonProperty("instData19Desc")
    public void setInstData19Desc(String instData19Desc) {
        this.instData19Desc = instData19Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData19Desc(String instData19Desc) {
        this.instData19Desc = instData19Desc;
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

    public ApplicationSupplementalInformation100PutResponse withInstData17(String instData17) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData16(String instData16) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData15(String instData15) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData14(String instData14) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData13(String instData13) {
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

    public ApplicationSupplementalInformation100PutResponse withFlag10(String flag10) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData12(String instData12) {
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

    public ApplicationSupplementalInformation100PutResponse withInstData11(String instData11) {
        this.instData11 = instData11;
        return this;
    }

    @JsonProperty("ethnic3Desc")
    public String getEthnic3Desc() {
        return ethnic3Desc;
    }

    @JsonProperty("ethnic3Desc")
    public void setEthnic3Desc(String ethnic3Desc) {
        this.ethnic3Desc = ethnic3Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic3Desc(String ethnic3Desc) {
        this.ethnic3Desc = ethnic3Desc;
        return this;
    }

    /**
     *  10
     * <p>
     * 
     * 
     */
    @JsonProperty("instData10Desc")
    public String getInstData10Desc() {
        return instData10Desc;
    }

    /**
     *  10
     * <p>
     * 
     * 
     */
    @JsonProperty("instData10Desc")
    public void setInstData10Desc(String instData10Desc) {
        this.instData10Desc = instData10Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData10Desc(String instData10Desc) {
        this.instData10Desc = instData10Desc;
        return this;
    }

    @JsonProperty("birthStatDesc")
    public String getBirthStatDesc() {
        return birthStatDesc;
    }

    @JsonProperty("birthStatDesc")
    public void setBirthStatDesc(String birthStatDesc) {
        this.birthStatDesc = birthStatDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withBirthStatDesc(String birthStatDesc) {
        this.birthStatDesc = birthStatDesc;
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

    public ApplicationSupplementalInformation100PutResponse withCycleAdded(Double cycleAdded) {
        this.cycleAdded = cycleAdded;
        return this;
    }

    @JsonProperty("admitEthnDesc")
    public String getAdmitEthnDesc() {
        return admitEthnDesc;
    }

    @JsonProperty("admitEthnDesc")
    public void setAdmitEthnDesc(String admitEthnDesc) {
        this.admitEthnDesc = admitEthnDesc;
    }

    public ApplicationSupplementalInformation100PutResponse withAdmitEthnDesc(String admitEthnDesc) {
        this.admitEthnDesc = admitEthnDesc;
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

    public ApplicationSupplementalInformation100PutResponse withInstData19(String instData19) {
        this.instData19 = instData19;
        return this;
    }

    @JsonProperty("ethnic1Desc")
    public String getEthnic1Desc() {
        return ethnic1Desc;
    }

    @JsonProperty("ethnic1Desc")
    public void setEthnic1Desc(String ethnic1Desc) {
        this.ethnic1Desc = ethnic1Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic1Desc(String ethnic1Desc) {
        this.ethnic1Desc = ethnic1Desc;
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

    public ApplicationSupplementalInformation100PutResponse withNumberDeps(Double numberDeps) {
        this.numberDeps = numberDeps;
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

    public ApplicationSupplementalInformation100PutResponse withInstData10(String instData10) {
        this.instData10 = instData10;
        return this;
    }

    @JsonProperty("race2Desc")
    public String getRace2Desc() {
        return race2Desc;
    }

    @JsonProperty("race2Desc")
    public void setRace2Desc(String race2Desc) {
        this.race2Desc = race2Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace2Desc(String race2Desc) {
        this.race2Desc = race2Desc;
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

    public ApplicationSupplementalInformation100PutResponse withRace10(String race10) {
        this.race10 = race10;
        return this;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("instData4Desc")
    public String getInstData4Desc() {
        return instData4Desc;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("instData4Desc")
    public void setInstData4Desc(String instData4Desc) {
        this.instData4Desc = instData4Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData4Desc(String instData4Desc) {
        this.instData4Desc = instData4Desc;
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

    public ApplicationSupplementalInformation100PutResponse withCntyBirthRural(String cntyBirthRural) {
        this.cntyBirthRural = cntyBirthRural;
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

    public ApplicationSupplementalInformation100PutResponse withCycleChanged(Double cycleChanged) {
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

    public ApplicationSupplementalInformation100PutResponse withAgencyFileNo(String agencyFileNo) {
        this.agencyFileNo = agencyFileNo;
        return this;
    }

    /**
     *  17
     * <p>
     * 
     * 
     */
    @JsonProperty("instData17Desc")
    public String getInstData17Desc() {
        return instData17Desc;
    }

    /**
     *  17
     * <p>
     * 
     * 
     */
    @JsonProperty("instData17Desc")
    public void setInstData17Desc(String instData17Desc) {
        this.instData17Desc = instData17Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData17Desc(String instData17Desc) {
        this.instData17Desc = instData17Desc;
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

    public ApplicationSupplementalInformation100PutResponse withEselCode(String eselCode) {
        this.eselCode = eselCode;
        return this;
    }

    /**
     *  7
     * <p>
     * 
     * 
     */
    @JsonProperty("instData7Desc")
    public String getInstData7Desc() {
        return instData7Desc;
    }

    /**
     *  7
     * <p>
     * 
     * 
     */
    @JsonProperty("instData7Desc")
    public void setInstData7Desc(String instData7Desc) {
        this.instData7Desc = instData7Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData7Desc(String instData7Desc) {
        this.instData7Desc = instData7Desc;
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

    public ApplicationSupplementalInformation100PutResponse withEthnic10(String ethnic10) {
        this.ethnic10 = ethnic10;
        return this;
    }

    @JsonProperty("ethnic8Desc")
    public String getEthnic8Desc() {
        return ethnic8Desc;
    }

    @JsonProperty("ethnic8Desc")
    public void setEthnic8Desc(String ethnic8Desc) {
        this.ethnic8Desc = ethnic8Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic8Desc(String ethnic8Desc) {
        this.ethnic8Desc = ethnic8Desc;
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

    public ApplicationSupplementalInformation100PutResponse withInstData20(String instData20) {
        this.instData20 = instData20;
        return this;
    }

    @JsonProperty("race8Desc")
    public String getRace8Desc() {
        return race8Desc;
    }

    @JsonProperty("race8Desc")
    public void setRace8Desc(String race8Desc) {
        this.race8Desc = race8Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace8Desc(String race8Desc) {
        this.race8Desc = race8Desc;
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

    public ApplicationSupplementalInformation100PutResponse withHispInd(String hispInd) {
        this.hispInd = hispInd;
        return this;
    }

    /**
     *  9
     * <p>
     * 
     * 
     */
    @JsonProperty("instData9Desc")
    public String getInstData9Desc() {
        return instData9Desc;
    }

    /**
     *  9
     * <p>
     * 
     * 
     */
    @JsonProperty("instData9Desc")
    public void setInstData9Desc(String instData9Desc) {
        this.instData9Desc = instData9Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData9Desc(String instData9Desc) {
        this.instData9Desc = instData9Desc;
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

    public ApplicationSupplementalInformation100PutResponse withAgencyReportDate(Date agencyReportDate) {
        this.agencyReportDate = agencyReportDate;
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

    public ApplicationSupplementalInformation100PutResponse withCntyAdmitRural(String cntyAdmitRural) {
        this.cntyAdmitRural = cntyAdmitRural;
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

    public ApplicationSupplementalInformation100PutResponse withEthnic3(String ethnic3) {
        this.ethnic3 = ethnic3;
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

    public ApplicationSupplementalInformation100PutResponse withRace5(String race5) {
        this.race5 = race5;
        return this;
    }

    @JsonProperty("race6Desc")
    public String getRace6Desc() {
        return race6Desc;
    }

    @JsonProperty("race6Desc")
    public void setRace6Desc(String race6Desc) {
        this.race6Desc = race6Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withRace6Desc(String race6Desc) {
        this.race6Desc = race6Desc;
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

    public ApplicationSupplementalInformation100PutResponse withEffecDate(Date effecDate) {
        this.effecDate = effecDate;
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

    public ApplicationSupplementalInformation100PutResponse withEthnic4(String ethnic4) {
        this.ethnic4 = ethnic4;
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

    public ApplicationSupplementalInformation100PutResponse withRace6(String race6) {
        this.race6 = race6;
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

    public ApplicationSupplementalInformation100PutResponse withEthnic5(String ethnic5) {
        this.ethnic5 = ethnic5;
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

    public ApplicationSupplementalInformation100PutResponse withRace7(String race7) {
        this.race7 = race7;
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

    public ApplicationSupplementalInformation100PutResponse withEthnic6(String ethnic6) {
        this.ethnic6 = ethnic6;
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

    public ApplicationSupplementalInformation100PutResponse withRace8(String race8) {
        this.race8 = race8;
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

    public ApplicationSupplementalInformation100PutResponse withRace1(String race1) {
        this.race1 = race1;
        return this;
    }

    /**
     *  15
     * <p>
     * 
     * 
     */
    @JsonProperty("instData15Desc")
    public String getInstData15Desc() {
        return instData15Desc;
    }

    /**
     *  15
     * <p>
     * 
     * 
     */
    @JsonProperty("instData15Desc")
    public void setInstData15Desc(String instData15Desc) {
        this.instData15Desc = instData15Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withInstData15Desc(String instData15Desc) {
        this.instData15Desc = instData15Desc;
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

    public ApplicationSupplementalInformation100PutResponse withRace2(String race2) {
        this.race2 = race2;
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

    public ApplicationSupplementalInformation100PutResponse withEthnic1(String ethnic1) {
        this.ethnic1 = ethnic1;
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

    public ApplicationSupplementalInformation100PutResponse withRace3(String race3) {
        this.race3 = race3;
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

    public ApplicationSupplementalInformation100PutResponse withCntyCodeAdmit(String cntyCodeAdmit) {
        this.cntyCodeAdmit = cntyCodeAdmit;
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

    public ApplicationSupplementalInformation100PutResponse withEthnic2(String ethnic2) {
        this.ethnic2 = ethnic2;
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

    public ApplicationSupplementalInformation100PutResponse withRace4(String race4) {
        this.race4 = race4;
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

    public ApplicationSupplementalInformation100PutResponse withAmcasId(String amcasId) {
        this.amcasId = amcasId;
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

    public ApplicationSupplementalInformation100PutResponse withEthnic7(String ethnic7) {
        this.ethnic7 = ethnic7;
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

    public ApplicationSupplementalInformation100PutResponse withEthnCodeSelf(String ethnCodeSelf) {
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

    public ApplicationSupplementalInformation100PutResponse withRace9(String race9) {
        this.race9 = race9;
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

    public ApplicationSupplementalInformation100PutResponse withEthnic8(String ethnic8) {
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

    public ApplicationSupplementalInformation100PutResponse withEthnic9(String ethnic9) {
        this.ethnic9 = ethnic9;
        return this;
    }

    @JsonProperty("ethnic6Desc")
    public String getEthnic6Desc() {
        return ethnic6Desc;
    }

    @JsonProperty("ethnic6Desc")
    public void setEthnic6Desc(String ethnic6Desc) {
        this.ethnic6Desc = ethnic6Desc;
    }

    public ApplicationSupplementalInformation100PutResponse withEthnic6Desc(String ethnic6Desc) {
        this.ethnic6Desc = ethnic6Desc;
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

    public ApplicationSupplementalInformation100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationSupplementalInformation100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("applType");
        sb.append('=');
        sb.append(((this.applType == null)?"<null>":this.applType));
        sb.append(',');
        sb.append("prevApp1");
        sb.append('=');
        sb.append(((this.prevApp1 == null)?"<null>":this.prevApp1));
        sb.append(',');
        sb.append("prevApp3");
        sb.append('=');
        sb.append(((this.prevApp3 == null)?"<null>":this.prevApp3));
        sb.append(',');
        sb.append("prevApp2");
        sb.append('=');
        sb.append(((this.prevApp2 == null)?"<null>":this.prevApp2));
        sb.append(',');
        sb.append("prevApp4");
        sb.append('=');
        sb.append(((this.prevApp4 == null)?"<null>":this.prevApp4));
        sb.append(',');
        sb.append("instData3Desc");
        sb.append('=');
        sb.append(((this.instData3Desc == null)?"<null>":this.instData3Desc));
        sb.append(',');
        sb.append("race5Desc");
        sb.append('=');
        sb.append(((this.race5Desc == null)?"<null>":this.race5Desc));
        sb.append(',');
        sb.append("instData1Desc");
        sb.append('=');
        sb.append(((this.instData1Desc == null)?"<null>":this.instData1Desc));
        sb.append(',');
        sb.append("instData13Desc");
        sb.append('=');
        sb.append(((this.instData13Desc == null)?"<null>":this.instData13Desc));
        sb.append(',');
        sb.append("natnCodeAdmit");
        sb.append('=');
        sb.append(((this.natnCodeAdmit == null)?"<null>":this.natnCodeAdmit));
        sb.append(',');
        sb.append("agencyFeeWaived");
        sb.append('=');
        sb.append(((this.agencyFeeWaived == null)?"<null>":this.agencyFeeWaived));
        sb.append(',');
        sb.append("ethnic4Desc");
        sb.append('=');
        sb.append(((this.ethnic4Desc == null)?"<null>":this.ethnic4Desc));
        sb.append(',');
        sb.append("instData5Desc");
        sb.append('=');
        sb.append(((this.instData5Desc == null)?"<null>":this.instData5Desc));
        sb.append(',');
        sb.append("admtNatnDesc");
        sb.append('=');
        sb.append(((this.admtNatnDesc == null)?"<null>":this.admtNatnDesc));
        sb.append(',');
        sb.append("race3Desc");
        sb.append('=');
        sb.append(((this.race3Desc == null)?"<null>":this.race3Desc));
        sb.append(',');
        sb.append("statCodeBirth");
        sb.append('=');
        sb.append(((this.statCodeBirth == null)?"<null>":this.statCodeBirth));
        sb.append(',');
        sb.append("race1Desc");
        sb.append('=');
        sb.append(((this.race1Desc == null)?"<null>":this.race1Desc));
        sb.append(',');
        sb.append("appYearAgency");
        sb.append('=');
        sb.append(((this.appYearAgency == null)?"<null>":this.appYearAgency));
        sb.append(',');
        sb.append("instData9");
        sb.append('=');
        sb.append(((this.instData9 == null)?"<null>":this.instData9));
        sb.append(',');
        sb.append("instData8");
        sb.append('=');
        sb.append(((this.instData8 == null)?"<null>":this.instData8));
        sb.append(',');
        sb.append("flagDesc");
        sb.append('=');
        sb.append(((this.flagDesc == null)?"<null>":this.flagDesc));
        sb.append(',');
        sb.append("instData5");
        sb.append('=');
        sb.append(((this.instData5 == null)?"<null>":this.instData5));
        sb.append(',');
        sb.append("instData11Desc");
        sb.append('=');
        sb.append(((this.instData11Desc == null)?"<null>":this.instData11Desc));
        sb.append(',');
        sb.append("instData4");
        sb.append('=');
        sb.append(((this.instData4 == null)?"<null>":this.instData4));
        sb.append(',');
        sb.append("instData7");
        sb.append('=');
        sb.append(((this.instData7 == null)?"<null>":this.instData7));
        sb.append(',');
        sb.append("ethnic2Desc");
        sb.append('=');
        sb.append(((this.ethnic2Desc == null)?"<null>":this.ethnic2Desc));
        sb.append(',');
        sb.append("instData6");
        sb.append('=');
        sb.append(((this.instData6 == null)?"<null>":this.instData6));
        sb.append(',');
        sb.append("instData1");
        sb.append('=');
        sb.append(((this.instData1 == null)?"<null>":this.instData1));
        sb.append(',');
        sb.append("instData3");
        sb.append('=');
        sb.append(((this.instData3 == null)?"<null>":this.instData3));
        sb.append(',');
        sb.append("instData2");
        sb.append('=');
        sb.append(((this.instData2 == null)?"<null>":this.instData2));
        sb.append(',');
        sb.append("race9Desc");
        sb.append('=');
        sb.append(((this.race9Desc == null)?"<null>":this.race9Desc));
        sb.append(',');
        sb.append("birthCntyDesc");
        sb.append('=');
        sb.append(((this.birthCntyDesc == null)?"<null>":this.birthCntyDesc));
        sb.append(',');
        sb.append("ethnic9Desc");
        sb.append('=');
        sb.append(((this.ethnic9Desc == null)?"<null>":this.ethnic9Desc));
        sb.append(',');
        sb.append("admitSbgiDesc");
        sb.append('=');
        sb.append(((this.admitSbgiDesc == null)?"<null>":this.admitSbgiDesc));
        sb.append(',');
        sb.append("instData18Desc");
        sb.append('=');
        sb.append(((this.instData18Desc == null)?"<null>":this.instData18Desc));
        sb.append(',');
        sb.append("instData6Desc");
        sb.append('=');
        sb.append(((this.instData6Desc == null)?"<null>":this.instData6Desc));
        sb.append(',');
        sb.append("sbgiCodeAdmit");
        sb.append('=');
        sb.append(((this.sbgiCodeAdmit == null)?"<null>":this.sbgiCodeAdmit));
        sb.append(',');
        sb.append("nextMcatDate");
        sb.append('=');
        sb.append(((this.nextMcatDate == null)?"<null>":this.nextMcatDate));
        sb.append(',');
        sb.append("race7Desc");
        sb.append('=');
        sb.append(((this.race7Desc == null)?"<null>":this.race7Desc));
        sb.append(',');
        sb.append("ethnic10Desc");
        sb.append('=');
        sb.append(((this.ethnic10Desc == null)?"<null>":this.ethnic10Desc));
        sb.append(',');
        sb.append("admtStatDesc");
        sb.append('=');
        sb.append(((this.admtStatDesc == null)?"<null>":this.admtStatDesc));
        sb.append(',');
        sb.append("instData14Desc");
        sb.append('=');
        sb.append(((this.instData14Desc == null)?"<null>":this.instData14Desc));
        sb.append(',');
        sb.append("cityBirth");
        sb.append('=');
        sb.append(((this.cityBirth == null)?"<null>":this.cityBirth));
        sb.append(',');
        sb.append("ethnic7Desc");
        sb.append('=');
        sb.append(((this.ethnic7Desc == null)?"<null>":this.ethnic7Desc));
        sb.append(',');
        sb.append("admitEselDesc");
        sb.append('=');
        sb.append(((this.admitEselDesc == null)?"<null>":this.admitEselDesc));
        sb.append(',');
        sb.append("bioNumber");
        sb.append('=');
        sb.append(((this.bioNumber == null)?"<null>":this.bioNumber));
        sb.append(',');
        sb.append("urmInd");
        sb.append('=');
        sb.append(((this.urmInd == null)?"<null>":this.urmInd));
        sb.append(',');
        sb.append("instData16Desc");
        sb.append('=');
        sb.append(((this.instData16Desc == null)?"<null>":this.instData16Desc));
        sb.append(',');
        sb.append("instData8Desc");
        sb.append('=');
        sb.append(((this.instData8Desc == null)?"<null>":this.instData8Desc));
        sb.append(',');
        sb.append("cntyCodeBirth");
        sb.append('=');
        sb.append(((this.cntyCodeBirth == null)?"<null>":this.cntyCodeBirth));
        sb.append(',');
        sb.append("instData20Desc");
        sb.append('=');
        sb.append(((this.instData20Desc == null)?"<null>":this.instData20Desc));
        sb.append(',');
        sb.append("flag9");
        sb.append('=');
        sb.append(((this.flag9 == null)?"<null>":this.flag9));
        sb.append(',');
        sb.append("flag8");
        sb.append('=');
        sb.append(((this.flag8 == null)?"<null>":this.flag8));
        sb.append(',');
        sb.append("instData12Desc");
        sb.append('=');
        sb.append(((this.instData12Desc == null)?"<null>":this.instData12Desc));
        sb.append(',');
        sb.append("flag7");
        sb.append('=');
        sb.append(((this.flag7 == null)?"<null>":this.flag7));
        sb.append(',');
        sb.append("flag6");
        sb.append('=');
        sb.append(((this.flag6 == null)?"<null>":this.flag6));
        sb.append(',');
        sb.append("flag5");
        sb.append('=');
        sb.append(((this.flag5 == null)?"<null>":this.flag5));
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
        sb.append("ethnic5Desc");
        sb.append('=');
        sb.append(((this.ethnic5Desc == null)?"<null>":this.ethnic5Desc));
        sb.append(',');
        sb.append("admtCntyDesc");
        sb.append('=');
        sb.append(((this.admtCntyDesc == null)?"<null>":this.admtCntyDesc));
        sb.append(',');
        sb.append("race10Desc");
        sb.append('=');
        sb.append(((this.race10Desc == null)?"<null>":this.race10Desc));
        sb.append(',');
        sb.append("statCodeAdmit");
        sb.append('=');
        sb.append(((this.statCodeAdmit == null)?"<null>":this.statCodeAdmit));
        sb.append(',');
        sb.append("natnCodeBirth");
        sb.append('=');
        sb.append(((this.natnCodeBirth == null)?"<null>":this.natnCodeBirth));
        sb.append(',');
        sb.append("birthNatnDesc");
        sb.append('=');
        sb.append(((this.birthNatnDesc == null)?"<null>":this.birthNatnDesc));
        sb.append(',');
        sb.append("instData2Desc");
        sb.append('=');
        sb.append(((this.instData2Desc == null)?"<null>":this.instData2Desc));
        sb.append(',');
        sb.append("race4Desc");
        sb.append('=');
        sb.append(((this.race4Desc == null)?"<null>":this.race4Desc));
        sb.append(',');
        sb.append("instData18");
        sb.append('=');
        sb.append(((this.instData18 == null)?"<null>":this.instData18));
        sb.append(',');
        sb.append("instData19Desc");
        sb.append('=');
        sb.append(((this.instData19Desc == null)?"<null>":this.instData19Desc));
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
        sb.append("ethnic3Desc");
        sb.append('=');
        sb.append(((this.ethnic3Desc == null)?"<null>":this.ethnic3Desc));
        sb.append(',');
        sb.append("instData10Desc");
        sb.append('=');
        sb.append(((this.instData10Desc == null)?"<null>":this.instData10Desc));
        sb.append(',');
        sb.append("birthStatDesc");
        sb.append('=');
        sb.append(((this.birthStatDesc == null)?"<null>":this.birthStatDesc));
        sb.append(',');
        sb.append("cycleAdded");
        sb.append('=');
        sb.append(((this.cycleAdded == null)?"<null>":this.cycleAdded));
        sb.append(',');
        sb.append("admitEthnDesc");
        sb.append('=');
        sb.append(((this.admitEthnDesc == null)?"<null>":this.admitEthnDesc));
        sb.append(',');
        sb.append("instData19");
        sb.append('=');
        sb.append(((this.instData19 == null)?"<null>":this.instData19));
        sb.append(',');
        sb.append("ethnic1Desc");
        sb.append('=');
        sb.append(((this.ethnic1Desc == null)?"<null>":this.ethnic1Desc));
        sb.append(',');
        sb.append("numberDeps");
        sb.append('=');
        sb.append(((this.numberDeps == null)?"<null>":this.numberDeps));
        sb.append(',');
        sb.append("instData10");
        sb.append('=');
        sb.append(((this.instData10 == null)?"<null>":this.instData10));
        sb.append(',');
        sb.append("race2Desc");
        sb.append('=');
        sb.append(((this.race2Desc == null)?"<null>":this.race2Desc));
        sb.append(',');
        sb.append("race10");
        sb.append('=');
        sb.append(((this.race10 == null)?"<null>":this.race10));
        sb.append(',');
        sb.append("instData4Desc");
        sb.append('=');
        sb.append(((this.instData4Desc == null)?"<null>":this.instData4Desc));
        sb.append(',');
        sb.append("cntyBirthRural");
        sb.append('=');
        sb.append(((this.cntyBirthRural == null)?"<null>":this.cntyBirthRural));
        sb.append(',');
        sb.append("cycleChanged");
        sb.append('=');
        sb.append(((this.cycleChanged == null)?"<null>":this.cycleChanged));
        sb.append(',');
        sb.append("agencyFileNo");
        sb.append('=');
        sb.append(((this.agencyFileNo == null)?"<null>":this.agencyFileNo));
        sb.append(',');
        sb.append("instData17Desc");
        sb.append('=');
        sb.append(((this.instData17Desc == null)?"<null>":this.instData17Desc));
        sb.append(',');
        sb.append("eselCode");
        sb.append('=');
        sb.append(((this.eselCode == null)?"<null>":this.eselCode));
        sb.append(',');
        sb.append("instData7Desc");
        sb.append('=');
        sb.append(((this.instData7Desc == null)?"<null>":this.instData7Desc));
        sb.append(',');
        sb.append("ethnic10");
        sb.append('=');
        sb.append(((this.ethnic10 == null)?"<null>":this.ethnic10));
        sb.append(',');
        sb.append("ethnic8Desc");
        sb.append('=');
        sb.append(((this.ethnic8Desc == null)?"<null>":this.ethnic8Desc));
        sb.append(',');
        sb.append("instData20");
        sb.append('=');
        sb.append(((this.instData20 == null)?"<null>":this.instData20));
        sb.append(',');
        sb.append("race8Desc");
        sb.append('=');
        sb.append(((this.race8Desc == null)?"<null>":this.race8Desc));
        sb.append(',');
        sb.append("hispInd");
        sb.append('=');
        sb.append(((this.hispInd == null)?"<null>":this.hispInd));
        sb.append(',');
        sb.append("instData9Desc");
        sb.append('=');
        sb.append(((this.instData9Desc == null)?"<null>":this.instData9Desc));
        sb.append(',');
        sb.append("agencyReportDate");
        sb.append('=');
        sb.append(((this.agencyReportDate == null)?"<null>":this.agencyReportDate));
        sb.append(',');
        sb.append("cntyAdmitRural");
        sb.append('=');
        sb.append(((this.cntyAdmitRural == null)?"<null>":this.cntyAdmitRural));
        sb.append(',');
        sb.append("ethnic3");
        sb.append('=');
        sb.append(((this.ethnic3 == null)?"<null>":this.ethnic3));
        sb.append(',');
        sb.append("race5");
        sb.append('=');
        sb.append(((this.race5 == null)?"<null>":this.race5));
        sb.append(',');
        sb.append("race6Desc");
        sb.append('=');
        sb.append(((this.race6Desc == null)?"<null>":this.race6Desc));
        sb.append(',');
        sb.append("effecDate");
        sb.append('=');
        sb.append(((this.effecDate == null)?"<null>":this.effecDate));
        sb.append(',');
        sb.append("ethnic4");
        sb.append('=');
        sb.append(((this.ethnic4 == null)?"<null>":this.ethnic4));
        sb.append(',');
        sb.append("race6");
        sb.append('=');
        sb.append(((this.race6 == null)?"<null>":this.race6));
        sb.append(',');
        sb.append("ethnic5");
        sb.append('=');
        sb.append(((this.ethnic5 == null)?"<null>":this.ethnic5));
        sb.append(',');
        sb.append("race7");
        sb.append('=');
        sb.append(((this.race7 == null)?"<null>":this.race7));
        sb.append(',');
        sb.append("ethnic6");
        sb.append('=');
        sb.append(((this.ethnic6 == null)?"<null>":this.ethnic6));
        sb.append(',');
        sb.append("race8");
        sb.append('=');
        sb.append(((this.race8 == null)?"<null>":this.race8));
        sb.append(',');
        sb.append("race1");
        sb.append('=');
        sb.append(((this.race1 == null)?"<null>":this.race1));
        sb.append(',');
        sb.append("instData15Desc");
        sb.append('=');
        sb.append(((this.instData15Desc == null)?"<null>":this.instData15Desc));
        sb.append(',');
        sb.append("race2");
        sb.append('=');
        sb.append(((this.race2 == null)?"<null>":this.race2));
        sb.append(',');
        sb.append("ethnic1");
        sb.append('=');
        sb.append(((this.ethnic1 == null)?"<null>":this.ethnic1));
        sb.append(',');
        sb.append("race3");
        sb.append('=');
        sb.append(((this.race3 == null)?"<null>":this.race3));
        sb.append(',');
        sb.append("cntyCodeAdmit");
        sb.append('=');
        sb.append(((this.cntyCodeAdmit == null)?"<null>":this.cntyCodeAdmit));
        sb.append(',');
        sb.append("ethnic2");
        sb.append('=');
        sb.append(((this.ethnic2 == null)?"<null>":this.ethnic2));
        sb.append(',');
        sb.append("race4");
        sb.append('=');
        sb.append(((this.race4 == null)?"<null>":this.race4));
        sb.append(',');
        sb.append("amcasId");
        sb.append('=');
        sb.append(((this.amcasId == null)?"<null>":this.amcasId));
        sb.append(',');
        sb.append("ethnic7");
        sb.append('=');
        sb.append(((this.ethnic7 == null)?"<null>":this.ethnic7));
        sb.append(',');
        sb.append("ethnCodeSelf");
        sb.append('=');
        sb.append(((this.ethnCodeSelf == null)?"<null>":this.ethnCodeSelf));
        sb.append(',');
        sb.append("race9");
        sb.append('=');
        sb.append(((this.race9 == null)?"<null>":this.race9));
        sb.append(',');
        sb.append("ethnic8");
        sb.append('=');
        sb.append(((this.ethnic8 == null)?"<null>":this.ethnic8));
        sb.append(',');
        sb.append("ethnic9");
        sb.append('=');
        sb.append(((this.ethnic9 == null)?"<null>":this.ethnic9));
        sb.append(',');
        sb.append("ethnic6Desc");
        sb.append('=');
        sb.append(((this.ethnic6Desc == null)?"<null>":this.ethnic6Desc));
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
        result = ((result* 31)+((this.prevApp3 == null)? 0 :this.prevApp3 .hashCode()));
        result = ((result* 31)+((this.prevApp2 == null)? 0 :this.prevApp2 .hashCode()));
        result = ((result* 31)+((this.prevApp4 == null)? 0 :this.prevApp4 .hashCode()));
        result = ((result* 31)+((this.instData3Desc == null)? 0 :this.instData3Desc.hashCode()));
        result = ((result* 31)+((this.race5Desc == null)? 0 :this.race5Desc.hashCode()));
        result = ((result* 31)+((this.instData1Desc == null)? 0 :this.instData1Desc.hashCode()));
        result = ((result* 31)+((this.instData13Desc == null)? 0 :this.instData13Desc.hashCode()));
        result = ((result* 31)+((this.natnCodeAdmit == null)? 0 :this.natnCodeAdmit.hashCode()));
        result = ((result* 31)+((this.agencyFeeWaived == null)? 0 :this.agencyFeeWaived.hashCode()));
        result = ((result* 31)+((this.ethnic4Desc == null)? 0 :this.ethnic4Desc.hashCode()));
        result = ((result* 31)+((this.instData5Desc == null)? 0 :this.instData5Desc.hashCode()));
        result = ((result* 31)+((this.admtNatnDesc == null)? 0 :this.admtNatnDesc.hashCode()));
        result = ((result* 31)+((this.race3Desc == null)? 0 :this.race3Desc.hashCode()));
        result = ((result* 31)+((this.statCodeBirth == null)? 0 :this.statCodeBirth.hashCode()));
        result = ((result* 31)+((this.race1Desc == null)? 0 :this.race1Desc.hashCode()));
        result = ((result* 31)+((this.appYearAgency == null)? 0 :this.appYearAgency.hashCode()));
        result = ((result* 31)+((this.instData9 == null)? 0 :this.instData9 .hashCode()));
        result = ((result* 31)+((this.instData8 == null)? 0 :this.instData8 .hashCode()));
        result = ((result* 31)+((this.flagDesc == null)? 0 :this.flagDesc.hashCode()));
        result = ((result* 31)+((this.instData5 == null)? 0 :this.instData5 .hashCode()));
        result = ((result* 31)+((this.instData11Desc == null)? 0 :this.instData11Desc.hashCode()));
        result = ((result* 31)+((this.instData4 == null)? 0 :this.instData4 .hashCode()));
        result = ((result* 31)+((this.instData7 == null)? 0 :this.instData7 .hashCode()));
        result = ((result* 31)+((this.ethnic2Desc == null)? 0 :this.ethnic2Desc.hashCode()));
        result = ((result* 31)+((this.instData6 == null)? 0 :this.instData6 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.instData1 == null)? 0 :this.instData1 .hashCode()));
        result = ((result* 31)+((this.instData3 == null)? 0 :this.instData3 .hashCode()));
        result = ((result* 31)+((this.instData2 == null)? 0 :this.instData2 .hashCode()));
        result = ((result* 31)+((this.race9Desc == null)? 0 :this.race9Desc.hashCode()));
        result = ((result* 31)+((this.birthCntyDesc == null)? 0 :this.birthCntyDesc.hashCode()));
        result = ((result* 31)+((this.ethnic9Desc == null)? 0 :this.ethnic9Desc.hashCode()));
        result = ((result* 31)+((this.admitSbgiDesc == null)? 0 :this.admitSbgiDesc.hashCode()));
        result = ((result* 31)+((this.instData18Desc == null)? 0 :this.instData18Desc.hashCode()));
        result = ((result* 31)+((this.instData6Desc == null)? 0 :this.instData6Desc.hashCode()));
        result = ((result* 31)+((this.sbgiCodeAdmit == null)? 0 :this.sbgiCodeAdmit.hashCode()));
        result = ((result* 31)+((this.nextMcatDate == null)? 0 :this.nextMcatDate.hashCode()));
        result = ((result* 31)+((this.race7Desc == null)? 0 :this.race7Desc.hashCode()));
        result = ((result* 31)+((this.ethnic10Desc == null)? 0 :this.ethnic10Desc.hashCode()));
        result = ((result* 31)+((this.admtStatDesc == null)? 0 :this.admtStatDesc.hashCode()));
        result = ((result* 31)+((this.instData14Desc == null)? 0 :this.instData14Desc.hashCode()));
        result = ((result* 31)+((this.cityBirth == null)? 0 :this.cityBirth.hashCode()));
        result = ((result* 31)+((this.ethnic7Desc == null)? 0 :this.ethnic7Desc.hashCode()));
        result = ((result* 31)+((this.admitEselDesc == null)? 0 :this.admitEselDesc.hashCode()));
        result = ((result* 31)+((this.bioNumber == null)? 0 :this.bioNumber.hashCode()));
        result = ((result* 31)+((this.urmInd == null)? 0 :this.urmInd.hashCode()));
        result = ((result* 31)+((this.instData16Desc == null)? 0 :this.instData16Desc.hashCode()));
        result = ((result* 31)+((this.instData8Desc == null)? 0 :this.instData8Desc.hashCode()));
        result = ((result* 31)+((this.cntyCodeBirth == null)? 0 :this.cntyCodeBirth.hashCode()));
        result = ((result* 31)+((this.instData20Desc == null)? 0 :this.instData20Desc.hashCode()));
        result = ((result* 31)+((this.flag9 == null)? 0 :this.flag9 .hashCode()));
        result = ((result* 31)+((this.flag8 == null)? 0 :this.flag8 .hashCode()));
        result = ((result* 31)+((this.instData12Desc == null)? 0 :this.instData12Desc.hashCode()));
        result = ((result* 31)+((this.flag7 == null)? 0 :this.flag7 .hashCode()));
        result = ((result* 31)+((this.flag6 == null)? 0 :this.flag6 .hashCode()));
        result = ((result* 31)+((this.flag5 == null)? 0 :this.flag5 .hashCode()));
        result = ((result* 31)+((this.flag4 == null)? 0 :this.flag4 .hashCode()));
        result = ((result* 31)+((this.flag3 == null)? 0 :this.flag3 .hashCode()));
        result = ((result* 31)+((this.flag2 == null)? 0 :this.flag2 .hashCode()));
        result = ((result* 31)+((this.flag1 == null)? 0 :this.flag1 .hashCode()));
        result = ((result* 31)+((this.ethnic5Desc == null)? 0 :this.ethnic5Desc.hashCode()));
        result = ((result* 31)+((this.admtCntyDesc == null)? 0 :this.admtCntyDesc.hashCode()));
        result = ((result* 31)+((this.race10Desc == null)? 0 :this.race10Desc.hashCode()));
        result = ((result* 31)+((this.statCodeAdmit == null)? 0 :this.statCodeAdmit.hashCode()));
        result = ((result* 31)+((this.natnCodeBirth == null)? 0 :this.natnCodeBirth.hashCode()));
        result = ((result* 31)+((this.birthNatnDesc == null)? 0 :this.birthNatnDesc.hashCode()));
        result = ((result* 31)+((this.instData2Desc == null)? 0 :this.instData2Desc.hashCode()));
        result = ((result* 31)+((this.race4Desc == null)? 0 :this.race4Desc.hashCode()));
        result = ((result* 31)+((this.instData18 == null)? 0 :this.instData18 .hashCode()));
        result = ((result* 31)+((this.instData19Desc == null)? 0 :this.instData19Desc.hashCode()));
        result = ((result* 31)+((this.instData17 == null)? 0 :this.instData17 .hashCode()));
        result = ((result* 31)+((this.instData16 == null)? 0 :this.instData16 .hashCode()));
        result = ((result* 31)+((this.instData15 == null)? 0 :this.instData15 .hashCode()));
        result = ((result* 31)+((this.instData14 == null)? 0 :this.instData14 .hashCode()));
        result = ((result* 31)+((this.instData13 == null)? 0 :this.instData13 .hashCode()));
        result = ((result* 31)+((this.flag10 == null)? 0 :this.flag10 .hashCode()));
        result = ((result* 31)+((this.instData12 == null)? 0 :this.instData12 .hashCode()));
        result = ((result* 31)+((this.instData11 == null)? 0 :this.instData11 .hashCode()));
        result = ((result* 31)+((this.ethnic3Desc == null)? 0 :this.ethnic3Desc.hashCode()));
        result = ((result* 31)+((this.instData10Desc == null)? 0 :this.instData10Desc.hashCode()));
        result = ((result* 31)+((this.birthStatDesc == null)? 0 :this.birthStatDesc.hashCode()));
        result = ((result* 31)+((this.cycleAdded == null)? 0 :this.cycleAdded.hashCode()));
        result = ((result* 31)+((this.admitEthnDesc == null)? 0 :this.admitEthnDesc.hashCode()));
        result = ((result* 31)+((this.instData19 == null)? 0 :this.instData19 .hashCode()));
        result = ((result* 31)+((this.ethnic1Desc == null)? 0 :this.ethnic1Desc.hashCode()));
        result = ((result* 31)+((this.numberDeps == null)? 0 :this.numberDeps.hashCode()));
        result = ((result* 31)+((this.instData10 == null)? 0 :this.instData10 .hashCode()));
        result = ((result* 31)+((this.race2Desc == null)? 0 :this.race2Desc.hashCode()));
        result = ((result* 31)+((this.race10 == null)? 0 :this.race10 .hashCode()));
        result = ((result* 31)+((this.instData4Desc == null)? 0 :this.instData4Desc.hashCode()));
        result = ((result* 31)+((this.cntyBirthRural == null)? 0 :this.cntyBirthRural.hashCode()));
        result = ((result* 31)+((this.cycleChanged == null)? 0 :this.cycleChanged.hashCode()));
        result = ((result* 31)+((this.agencyFileNo == null)? 0 :this.agencyFileNo.hashCode()));
        result = ((result* 31)+((this.instData17Desc == null)? 0 :this.instData17Desc.hashCode()));
        result = ((result* 31)+((this.eselCode == null)? 0 :this.eselCode.hashCode()));
        result = ((result* 31)+((this.instData7Desc == null)? 0 :this.instData7Desc.hashCode()));
        result = ((result* 31)+((this.ethnic10 == null)? 0 :this.ethnic10 .hashCode()));
        result = ((result* 31)+((this.ethnic8Desc == null)? 0 :this.ethnic8Desc.hashCode()));
        result = ((result* 31)+((this.instData20 == null)? 0 :this.instData20 .hashCode()));
        result = ((result* 31)+((this.race8Desc == null)? 0 :this.race8Desc.hashCode()));
        result = ((result* 31)+((this.hispInd == null)? 0 :this.hispInd.hashCode()));
        result = ((result* 31)+((this.instData9Desc == null)? 0 :this.instData9Desc.hashCode()));
        result = ((result* 31)+((this.agencyReportDate == null)? 0 :this.agencyReportDate.hashCode()));
        result = ((result* 31)+((this.cntyAdmitRural == null)? 0 :this.cntyAdmitRural.hashCode()));
        result = ((result* 31)+((this.ethnic3 == null)? 0 :this.ethnic3 .hashCode()));
        result = ((result* 31)+((this.race5 == null)? 0 :this.race5 .hashCode()));
        result = ((result* 31)+((this.race6Desc == null)? 0 :this.race6Desc.hashCode()));
        result = ((result* 31)+((this.effecDate == null)? 0 :this.effecDate.hashCode()));
        result = ((result* 31)+((this.ethnic4 == null)? 0 :this.ethnic4 .hashCode()));
        result = ((result* 31)+((this.race6 == null)? 0 :this.race6 .hashCode()));
        result = ((result* 31)+((this.ethnic5 == null)? 0 :this.ethnic5 .hashCode()));
        result = ((result* 31)+((this.race7 == null)? 0 :this.race7 .hashCode()));
        result = ((result* 31)+((this.ethnic6 == null)? 0 :this.ethnic6 .hashCode()));
        result = ((result* 31)+((this.race8 == null)? 0 :this.race8 .hashCode()));
        result = ((result* 31)+((this.race1 == null)? 0 :this.race1 .hashCode()));
        result = ((result* 31)+((this.instData15Desc == null)? 0 :this.instData15Desc.hashCode()));
        result = ((result* 31)+((this.race2 == null)? 0 :this.race2 .hashCode()));
        result = ((result* 31)+((this.ethnic1 == null)? 0 :this.ethnic1 .hashCode()));
        result = ((result* 31)+((this.race3 == null)? 0 :this.race3 .hashCode()));
        result = ((result* 31)+((this.cntyCodeAdmit == null)? 0 :this.cntyCodeAdmit.hashCode()));
        result = ((result* 31)+((this.ethnic2 == null)? 0 :this.ethnic2 .hashCode()));
        result = ((result* 31)+((this.race4 == null)? 0 :this.race4 .hashCode()));
        result = ((result* 31)+((this.amcasId == null)? 0 :this.amcasId.hashCode()));
        result = ((result* 31)+((this.ethnic7 == null)? 0 :this.ethnic7 .hashCode()));
        result = ((result* 31)+((this.ethnCodeSelf == null)? 0 :this.ethnCodeSelf.hashCode()));
        result = ((result* 31)+((this.race9 == null)? 0 :this.race9 .hashCode()));
        result = ((result* 31)+((this.ethnic8 == null)? 0 :this.ethnic8 .hashCode()));
        result = ((result* 31)+((this.ethnic9 == null)? 0 :this.ethnic9 .hashCode()));
        result = ((result* 31)+((this.ethnic6Desc == null)? 0 :this.ethnic6Desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationSupplementalInformation100PutResponse) == false) {
            return false;
        }
        ApplicationSupplementalInformation100PutResponse rhs = ((ApplicationSupplementalInformation100PutResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.applType == rhs.applType)||((this.applType!= null)&&this.applType.equals(rhs.applType)))&&((this.prevApp1 == rhs.prevApp1)||((this.prevApp1 != null)&&this.prevApp1 .equals(rhs.prevApp1))))&&((this.prevApp3 == rhs.prevApp3)||((this.prevApp3 != null)&&this.prevApp3 .equals(rhs.prevApp3))))&&((this.prevApp2 == rhs.prevApp2)||((this.prevApp2 != null)&&this.prevApp2 .equals(rhs.prevApp2))))&&((this.prevApp4 == rhs.prevApp4)||((this.prevApp4 != null)&&this.prevApp4 .equals(rhs.prevApp4))))&&((this.instData3Desc == rhs.instData3Desc)||((this.instData3Desc!= null)&&this.instData3Desc.equals(rhs.instData3Desc))))&&((this.race5Desc == rhs.race5Desc)||((this.race5Desc!= null)&&this.race5Desc.equals(rhs.race5Desc))))&&((this.instData1Desc == rhs.instData1Desc)||((this.instData1Desc!= null)&&this.instData1Desc.equals(rhs.instData1Desc))))&&((this.instData13Desc == rhs.instData13Desc)||((this.instData13Desc!= null)&&this.instData13Desc.equals(rhs.instData13Desc))))&&((this.natnCodeAdmit == rhs.natnCodeAdmit)||((this.natnCodeAdmit!= null)&&this.natnCodeAdmit.equals(rhs.natnCodeAdmit))))&&((this.agencyFeeWaived == rhs.agencyFeeWaived)||((this.agencyFeeWaived!= null)&&this.agencyFeeWaived.equals(rhs.agencyFeeWaived))))&&((this.ethnic4Desc == rhs.ethnic4Desc)||((this.ethnic4Desc!= null)&&this.ethnic4Desc.equals(rhs.ethnic4Desc))))&&((this.instData5Desc == rhs.instData5Desc)||((this.instData5Desc!= null)&&this.instData5Desc.equals(rhs.instData5Desc))))&&((this.admtNatnDesc == rhs.admtNatnDesc)||((this.admtNatnDesc!= null)&&this.admtNatnDesc.equals(rhs.admtNatnDesc))))&&((this.race3Desc == rhs.race3Desc)||((this.race3Desc!= null)&&this.race3Desc.equals(rhs.race3Desc))))&&((this.statCodeBirth == rhs.statCodeBirth)||((this.statCodeBirth!= null)&&this.statCodeBirth.equals(rhs.statCodeBirth))))&&((this.race1Desc == rhs.race1Desc)||((this.race1Desc!= null)&&this.race1Desc.equals(rhs.race1Desc))))&&((this.appYearAgency == rhs.appYearAgency)||((this.appYearAgency!= null)&&this.appYearAgency.equals(rhs.appYearAgency))))&&((this.instData9 == rhs.instData9)||((this.instData9 != null)&&this.instData9 .equals(rhs.instData9))))&&((this.instData8 == rhs.instData8)||((this.instData8 != null)&&this.instData8 .equals(rhs.instData8))))&&((this.flagDesc == rhs.flagDesc)||((this.flagDesc!= null)&&this.flagDesc.equals(rhs.flagDesc))))&&((this.instData5 == rhs.instData5)||((this.instData5 != null)&&this.instData5 .equals(rhs.instData5))))&&((this.instData11Desc == rhs.instData11Desc)||((this.instData11Desc!= null)&&this.instData11Desc.equals(rhs.instData11Desc))))&&((this.instData4 == rhs.instData4)||((this.instData4 != null)&&this.instData4 .equals(rhs.instData4))))&&((this.instData7 == rhs.instData7)||((this.instData7 != null)&&this.instData7 .equals(rhs.instData7))))&&((this.ethnic2Desc == rhs.ethnic2Desc)||((this.ethnic2Desc!= null)&&this.ethnic2Desc.equals(rhs.ethnic2Desc))))&&((this.instData6 == rhs.instData6)||((this.instData6 != null)&&this.instData6 .equals(rhs.instData6))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.instData1 == rhs.instData1)||((this.instData1 != null)&&this.instData1 .equals(rhs.instData1))))&&((this.instData3 == rhs.instData3)||((this.instData3 != null)&&this.instData3 .equals(rhs.instData3))))&&((this.instData2 == rhs.instData2)||((this.instData2 != null)&&this.instData2 .equals(rhs.instData2))))&&((this.race9Desc == rhs.race9Desc)||((this.race9Desc!= null)&&this.race9Desc.equals(rhs.race9Desc))))&&((this.birthCntyDesc == rhs.birthCntyDesc)||((this.birthCntyDesc!= null)&&this.birthCntyDesc.equals(rhs.birthCntyDesc))))&&((this.ethnic9Desc == rhs.ethnic9Desc)||((this.ethnic9Desc!= null)&&this.ethnic9Desc.equals(rhs.ethnic9Desc))))&&((this.admitSbgiDesc == rhs.admitSbgiDesc)||((this.admitSbgiDesc!= null)&&this.admitSbgiDesc.equals(rhs.admitSbgiDesc))))&&((this.instData18Desc == rhs.instData18Desc)||((this.instData18Desc!= null)&&this.instData18Desc.equals(rhs.instData18Desc))))&&((this.instData6Desc == rhs.instData6Desc)||((this.instData6Desc!= null)&&this.instData6Desc.equals(rhs.instData6Desc))))&&((this.sbgiCodeAdmit == rhs.sbgiCodeAdmit)||((this.sbgiCodeAdmit!= null)&&this.sbgiCodeAdmit.equals(rhs.sbgiCodeAdmit))))&&((this.nextMcatDate == rhs.nextMcatDate)||((this.nextMcatDate!= null)&&this.nextMcatDate.equals(rhs.nextMcatDate))))&&((this.race7Desc == rhs.race7Desc)||((this.race7Desc!= null)&&this.race7Desc.equals(rhs.race7Desc))))&&((this.ethnic10Desc == rhs.ethnic10Desc)||((this.ethnic10Desc!= null)&&this.ethnic10Desc.equals(rhs.ethnic10Desc))))&&((this.admtStatDesc == rhs.admtStatDesc)||((this.admtStatDesc!= null)&&this.admtStatDesc.equals(rhs.admtStatDesc))))&&((this.instData14Desc == rhs.instData14Desc)||((this.instData14Desc!= null)&&this.instData14Desc.equals(rhs.instData14Desc))))&&((this.cityBirth == rhs.cityBirth)||((this.cityBirth!= null)&&this.cityBirth.equals(rhs.cityBirth))))&&((this.ethnic7Desc == rhs.ethnic7Desc)||((this.ethnic7Desc!= null)&&this.ethnic7Desc.equals(rhs.ethnic7Desc))))&&((this.admitEselDesc == rhs.admitEselDesc)||((this.admitEselDesc!= null)&&this.admitEselDesc.equals(rhs.admitEselDesc))))&&((this.bioNumber == rhs.bioNumber)||((this.bioNumber!= null)&&this.bioNumber.equals(rhs.bioNumber))))&&((this.urmInd == rhs.urmInd)||((this.urmInd!= null)&&this.urmInd.equals(rhs.urmInd))))&&((this.instData16Desc == rhs.instData16Desc)||((this.instData16Desc!= null)&&this.instData16Desc.equals(rhs.instData16Desc))))&&((this.instData8Desc == rhs.instData8Desc)||((this.instData8Desc!= null)&&this.instData8Desc.equals(rhs.instData8Desc))))&&((this.cntyCodeBirth == rhs.cntyCodeBirth)||((this.cntyCodeBirth!= null)&&this.cntyCodeBirth.equals(rhs.cntyCodeBirth))))&&((this.instData20Desc == rhs.instData20Desc)||((this.instData20Desc!= null)&&this.instData20Desc.equals(rhs.instData20Desc))))&&((this.flag9 == rhs.flag9)||((this.flag9 != null)&&this.flag9 .equals(rhs.flag9))))&&((this.flag8 == rhs.flag8)||((this.flag8 != null)&&this.flag8 .equals(rhs.flag8))))&&((this.instData12Desc == rhs.instData12Desc)||((this.instData12Desc!= null)&&this.instData12Desc.equals(rhs.instData12Desc))))&&((this.flag7 == rhs.flag7)||((this.flag7 != null)&&this.flag7 .equals(rhs.flag7))))&&((this.flag6 == rhs.flag6)||((this.flag6 != null)&&this.flag6 .equals(rhs.flag6))))&&((this.flag5 == rhs.flag5)||((this.flag5 != null)&&this.flag5 .equals(rhs.flag5))))&&((this.flag4 == rhs.flag4)||((this.flag4 != null)&&this.flag4 .equals(rhs.flag4))))&&((this.flag3 == rhs.flag3)||((this.flag3 != null)&&this.flag3 .equals(rhs.flag3))))&&((this.flag2 == rhs.flag2)||((this.flag2 != null)&&this.flag2 .equals(rhs.flag2))))&&((this.flag1 == rhs.flag1)||((this.flag1 != null)&&this.flag1 .equals(rhs.flag1))))&&((this.ethnic5Desc == rhs.ethnic5Desc)||((this.ethnic5Desc!= null)&&this.ethnic5Desc.equals(rhs.ethnic5Desc))))&&((this.admtCntyDesc == rhs.admtCntyDesc)||((this.admtCntyDesc!= null)&&this.admtCntyDesc.equals(rhs.admtCntyDesc))))&&((this.race10Desc == rhs.race10Desc)||((this.race10Desc!= null)&&this.race10Desc.equals(rhs.race10Desc))))&&((this.statCodeAdmit == rhs.statCodeAdmit)||((this.statCodeAdmit!= null)&&this.statCodeAdmit.equals(rhs.statCodeAdmit))))&&((this.natnCodeBirth == rhs.natnCodeBirth)||((this.natnCodeBirth!= null)&&this.natnCodeBirth.equals(rhs.natnCodeBirth))))&&((this.birthNatnDesc == rhs.birthNatnDesc)||((this.birthNatnDesc!= null)&&this.birthNatnDesc.equals(rhs.birthNatnDesc))))&&((this.instData2Desc == rhs.instData2Desc)||((this.instData2Desc!= null)&&this.instData2Desc.equals(rhs.instData2Desc))))&&((this.race4Desc == rhs.race4Desc)||((this.race4Desc!= null)&&this.race4Desc.equals(rhs.race4Desc))))&&((this.instData18 == rhs.instData18)||((this.instData18 != null)&&this.instData18 .equals(rhs.instData18))))&&((this.instData19Desc == rhs.instData19Desc)||((this.instData19Desc!= null)&&this.instData19Desc.equals(rhs.instData19Desc))))&&((this.instData17 == rhs.instData17)||((this.instData17 != null)&&this.instData17 .equals(rhs.instData17))))&&((this.instData16 == rhs.instData16)||((this.instData16 != null)&&this.instData16 .equals(rhs.instData16))))&&((this.instData15 == rhs.instData15)||((this.instData15 != null)&&this.instData15 .equals(rhs.instData15))))&&((this.instData14 == rhs.instData14)||((this.instData14 != null)&&this.instData14 .equals(rhs.instData14))))&&((this.instData13 == rhs.instData13)||((this.instData13 != null)&&this.instData13 .equals(rhs.instData13))))&&((this.flag10 == rhs.flag10)||((this.flag10 != null)&&this.flag10 .equals(rhs.flag10))))&&((this.instData12 == rhs.instData12)||((this.instData12 != null)&&this.instData12 .equals(rhs.instData12))))&&((this.instData11 == rhs.instData11)||((this.instData11 != null)&&this.instData11 .equals(rhs.instData11))))&&((this.ethnic3Desc == rhs.ethnic3Desc)||((this.ethnic3Desc!= null)&&this.ethnic3Desc.equals(rhs.ethnic3Desc))))&&((this.instData10Desc == rhs.instData10Desc)||((this.instData10Desc!= null)&&this.instData10Desc.equals(rhs.instData10Desc))))&&((this.birthStatDesc == rhs.birthStatDesc)||((this.birthStatDesc!= null)&&this.birthStatDesc.equals(rhs.birthStatDesc))))&&((this.cycleAdded == rhs.cycleAdded)||((this.cycleAdded!= null)&&this.cycleAdded.equals(rhs.cycleAdded))))&&((this.admitEthnDesc == rhs.admitEthnDesc)||((this.admitEthnDesc!= null)&&this.admitEthnDesc.equals(rhs.admitEthnDesc))))&&((this.instData19 == rhs.instData19)||((this.instData19 != null)&&this.instData19 .equals(rhs.instData19))))&&((this.ethnic1Desc == rhs.ethnic1Desc)||((this.ethnic1Desc!= null)&&this.ethnic1Desc.equals(rhs.ethnic1Desc))))&&((this.numberDeps == rhs.numberDeps)||((this.numberDeps!= null)&&this.numberDeps.equals(rhs.numberDeps))))&&((this.instData10 == rhs.instData10)||((this.instData10 != null)&&this.instData10 .equals(rhs.instData10))))&&((this.race2Desc == rhs.race2Desc)||((this.race2Desc!= null)&&this.race2Desc.equals(rhs.race2Desc))))&&((this.race10 == rhs.race10)||((this.race10 != null)&&this.race10 .equals(rhs.race10))))&&((this.instData4Desc == rhs.instData4Desc)||((this.instData4Desc!= null)&&this.instData4Desc.equals(rhs.instData4Desc))))&&((this.cntyBirthRural == rhs.cntyBirthRural)||((this.cntyBirthRural!= null)&&this.cntyBirthRural.equals(rhs.cntyBirthRural))))&&((this.cycleChanged == rhs.cycleChanged)||((this.cycleChanged!= null)&&this.cycleChanged.equals(rhs.cycleChanged))))&&((this.agencyFileNo == rhs.agencyFileNo)||((this.agencyFileNo!= null)&&this.agencyFileNo.equals(rhs.agencyFileNo))))&&((this.instData17Desc == rhs.instData17Desc)||((this.instData17Desc!= null)&&this.instData17Desc.equals(rhs.instData17Desc))))&&((this.eselCode == rhs.eselCode)||((this.eselCode!= null)&&this.eselCode.equals(rhs.eselCode))))&&((this.instData7Desc == rhs.instData7Desc)||((this.instData7Desc!= null)&&this.instData7Desc.equals(rhs.instData7Desc))))&&((this.ethnic10 == rhs.ethnic10)||((this.ethnic10 != null)&&this.ethnic10 .equals(rhs.ethnic10))))&&((this.ethnic8Desc == rhs.ethnic8Desc)||((this.ethnic8Desc!= null)&&this.ethnic8Desc.equals(rhs.ethnic8Desc))))&&((this.instData20 == rhs.instData20)||((this.instData20 != null)&&this.instData20 .equals(rhs.instData20))))&&((this.race8Desc == rhs.race8Desc)||((this.race8Desc!= null)&&this.race8Desc.equals(rhs.race8Desc))))&&((this.hispInd == rhs.hispInd)||((this.hispInd!= null)&&this.hispInd.equals(rhs.hispInd))))&&((this.instData9Desc == rhs.instData9Desc)||((this.instData9Desc!= null)&&this.instData9Desc.equals(rhs.instData9Desc))))&&((this.agencyReportDate == rhs.agencyReportDate)||((this.agencyReportDate!= null)&&this.agencyReportDate.equals(rhs.agencyReportDate))))&&((this.cntyAdmitRural == rhs.cntyAdmitRural)||((this.cntyAdmitRural!= null)&&this.cntyAdmitRural.equals(rhs.cntyAdmitRural))))&&((this.ethnic3 == rhs.ethnic3)||((this.ethnic3 != null)&&this.ethnic3 .equals(rhs.ethnic3))))&&((this.race5 == rhs.race5)||((this.race5 != null)&&this.race5 .equals(rhs.race5))))&&((this.race6Desc == rhs.race6Desc)||((this.race6Desc!= null)&&this.race6Desc.equals(rhs.race6Desc))))&&((this.effecDate == rhs.effecDate)||((this.effecDate!= null)&&this.effecDate.equals(rhs.effecDate))))&&((this.ethnic4 == rhs.ethnic4)||((this.ethnic4 != null)&&this.ethnic4 .equals(rhs.ethnic4))))&&((this.race6 == rhs.race6)||((this.race6 != null)&&this.race6 .equals(rhs.race6))))&&((this.ethnic5 == rhs.ethnic5)||((this.ethnic5 != null)&&this.ethnic5 .equals(rhs.ethnic5))))&&((this.race7 == rhs.race7)||((this.race7 != null)&&this.race7 .equals(rhs.race7))))&&((this.ethnic6 == rhs.ethnic6)||((this.ethnic6 != null)&&this.ethnic6 .equals(rhs.ethnic6))))&&((this.race8 == rhs.race8)||((this.race8 != null)&&this.race8 .equals(rhs.race8))))&&((this.race1 == rhs.race1)||((this.race1 != null)&&this.race1 .equals(rhs.race1))))&&((this.instData15Desc == rhs.instData15Desc)||((this.instData15Desc!= null)&&this.instData15Desc.equals(rhs.instData15Desc))))&&((this.race2 == rhs.race2)||((this.race2 != null)&&this.race2 .equals(rhs.race2))))&&((this.ethnic1 == rhs.ethnic1)||((this.ethnic1 != null)&&this.ethnic1 .equals(rhs.ethnic1))))&&((this.race3 == rhs.race3)||((this.race3 != null)&&this.race3 .equals(rhs.race3))))&&((this.cntyCodeAdmit == rhs.cntyCodeAdmit)||((this.cntyCodeAdmit!= null)&&this.cntyCodeAdmit.equals(rhs.cntyCodeAdmit))))&&((this.ethnic2 == rhs.ethnic2)||((this.ethnic2 != null)&&this.ethnic2 .equals(rhs.ethnic2))))&&((this.race4 == rhs.race4)||((this.race4 != null)&&this.race4 .equals(rhs.race4))))&&((this.amcasId == rhs.amcasId)||((this.amcasId!= null)&&this.amcasId.equals(rhs.amcasId))))&&((this.ethnic7 == rhs.ethnic7)||((this.ethnic7 != null)&&this.ethnic7 .equals(rhs.ethnic7))))&&((this.ethnCodeSelf == rhs.ethnCodeSelf)||((this.ethnCodeSelf!= null)&&this.ethnCodeSelf.equals(rhs.ethnCodeSelf))))&&((this.race9 == rhs.race9)||((this.race9 != null)&&this.race9 .equals(rhs.race9))))&&((this.ethnic8 == rhs.ethnic8)||((this.ethnic8 != null)&&this.ethnic8 .equals(rhs.ethnic8))))&&((this.ethnic9 == rhs.ethnic9)||((this.ethnic9 != null)&&this.ethnic9 .equals(rhs.ethnic9))))&&((this.ethnic6Desc == rhs.ethnic6Desc)||((this.ethnic6Desc!= null)&&this.ethnic6Desc.equals(rhs.ethnic6Desc))));
    }

}
