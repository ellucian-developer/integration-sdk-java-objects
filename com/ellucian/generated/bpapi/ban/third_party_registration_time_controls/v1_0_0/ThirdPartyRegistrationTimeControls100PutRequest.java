
package com.ellucian.generated.bpapi.ban.third_party_registration_time_controls.v1_0_0;

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
    "levl2",
    "levl1",
    "seqNo",
    "levl4",
    "endDate",
    "levl3",
    "levl5",
    "collInclExcl",
    "studType2",
    "studType3",
    "studType4",
    "studType5",
    "earnHrsEnd",
    "studType1",
    "pinEnd",
    "dept5",
    "criteria.earnHrsBegin",
    "hourBegin",
    "lastNamStart",
    "criteria.pinStart",
    "degr1",
    "degr2",
    "degr3",
    "degr4",
    "degr5",
    "dept1",
    "dept2",
    "dept3",
    "dept4",
    "cmps3",
    "cmps4",
    "cmps1",
    "cmps2",
    "clsInclExcl",
    "cmps5",
    "criteria.cmps5",
    "criteria.cmps4",
    "criteria.clsInclExcl",
    "criteria.cmps3",
    "criteria.cmps2",
    "criteria.cmps1",
    "coll3",
    "coll2",
    "coll1",
    "cls4",
    "cls5",
    "cls2",
    "cls3",
    "termCodeHost",
    "cls1",
    "coll5",
    "coll4",
    "criteria.endDate",
    "criteria.levl5",
    "lastNamEnd",
    "criteria.levl4",
    "criteria.levl3",
    "criteria.levl2",
    "criteria.levl1",
    "majrInclExcl",
    "criteria.dept4",
    "criteria.dept5",
    "criteria.seqNo",
    "criteria.termCodeHost",
    "criteria.collInclExcl",
    "pinStart",
    "criteria.lastNamEnd",
    "criteria.hourBegin",
    "criteria.coll3",
    "criteria.cls3",
    "criteria.hourEnd",
    "criteria.coll4",
    "criteria.cls4",
    "criteria.lastNamStart",
    "criteria.coll5",
    "criteria.cls5",
    "criteria.coll1",
    "criteria.cls1",
    "criteria.coll2",
    "criteria.cls2",
    "earnHrsBegin",
    "criteria.studType5",
    "hourEnd",
    "criteria.studType1",
    "criteria.studType2",
    "criteria.studType3",
    "deptInclExcl",
    "criteria.studType4",
    "criteria.degrInclExcl",
    "criteria.beginDate",
    "cmpsInclExcl",
    "criteria.pinEnd",
    "criteria.earnHrsEnd",
    "criteria.majr2",
    "criteria.majr1",
    "criteria.majr5",
    "criteria.majr4",
    "criteria.majr3",
    "criteria.cmpsInclExcl",
    "degrInclExcl",
    "criteria.degr1",
    "criteria.majrInclExcl",
    "criteria.degr2",
    "criteria.dept2",
    "criteria.dept3",
    "criteria.dept1",
    "criteria.degr5",
    "criteria.degr3",
    "criteria.degr4",
    "beginDate",
    "criteria.deptInclExcl",
    "majr5",
    "majr4",
    "majr1",
    "majr3",
    "majr2"
})
@Generated("jsonschema2pojo")
public class ThirdPartyRegistrationTimeControls100PutRequest {

    /**
     * Second Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_2, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_2, Lookup lineage reference object : stvlevl")
    private String levl2;
    /**
     * First Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_1, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_1, Lookup lineage reference object : stvlevl")
    private String levl1;
    /**
     * Priority Number
     * <p>
     * Lineage reference object : SFRCTRL_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_SEQ_NO")
    private Double seqNo;
    /**
     * Fourth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl")
    private String levl4;
    /**
     * End Date
     * <p>
     * Lineage reference object : SFRCTRL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_END_DATE")
    private Date endDate;
    /**
     * Third Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_3, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_3, Lookup lineage reference object : stvlevl")
    private String levl3;
    /**
     * Fifth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_5, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_5, Lookup lineage reference object : stvlevl")
    private String levl5;
    /**
     * College Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_COLL_INCL_EXCL
     * 
     */
    @JsonProperty("collInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_INCL_EXCL")
    private String collInclExcl;
    /**
     * Second Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_2, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_2, Lookup lineage reference object : stvstyp")
    private String studType2;
    /**
     * Third Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_3, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_3, Lookup lineage reference object : stvstyp")
    private String studType3;
    /**
     * Fourth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_4, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_4, Lookup lineage reference object : stvstyp")
    private String studType4;
    /**
     * Fifth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_5, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_5, Lookup lineage reference object : stvstyp")
    private String studType5;
    /**
     * Earned Hours End
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_END
     * 
     */
    @JsonProperty("earnHrsEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_EARN_HRS_END")
    private Double earnHrsEnd;
    /**
     * First Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_1, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_1, Lookup lineage reference object : stvstyp")
    private String studType1;
    /**
     * Ending PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_END
     * 
     */
    @JsonProperty("pinEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_PIN_END")
    private Double pinEnd;
    /**
     * Fifth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_5, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_5, Lookup lineage reference object : stvdept")
    private String dept5;
    /**
     * Earned Hours Begin
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_BEGIN
     * 
     */
    @JsonProperty("criteria.earnHrsBegin")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_EARN_HRS_BEGIN")
    private Double criteriaEarnHrsBegin;
    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_BEGIN
     * 
     */
    @JsonProperty("hourBegin")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_HOUR_BEGIN")
    private String hourBegin;
    /**
     * Starting Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_START
     * 
     */
    @JsonProperty("lastNamStart")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LAST_NAM_START")
    private String lastNamStart;
    /**
     * Starting PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_START
     * 
     */
    @JsonProperty("criteria.pinStart")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_PIN_START")
    private Double criteriaPinStart;
    /**
     * First Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_1, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_1, Lookup lineage reference object : stvdegc")
    private String degr1;
    /**
     * Second Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_2, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_2, Lookup lineage reference object : stvdegc")
    private String degr2;
    /**
     * Third Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_3, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_3, Lookup lineage reference object : stvdegc")
    private String degr3;
    /**
     * Fourth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_4, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_4, Lookup lineage reference object : stvdegc")
    private String degr4;
    /**
     * Fifth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_5, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_5, Lookup lineage reference object : stvdegc")
    private String degr5;
    /**
     * First Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_1, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_1, Lookup lineage reference object : stvdept")
    private String dept1;
    /**
     * Second Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_2, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_2, Lookup lineage reference object : stvdept")
    private String dept2;
    /**
     * Third Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_3, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_3, Lookup lineage reference object : stvdept")
    private String dept3;
    /**
     * Fourth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_4, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_4, Lookup lineage reference object : stvdept")
    private String dept4;
    /**
     * Third Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_3, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_3, Lookup lineage reference object : stvcamp")
    private String cmps3;
    /**
     * Fourth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_4, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_4, Lookup lineage reference object : stvcamp")
    private String cmps4;
    /**
     * First Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_1, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_1, Lookup lineage reference object : stvcamp")
    private String cmps1;
    /**
     * Second Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_2, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_2, Lookup lineage reference object : stvcamp")
    private String cmps2;
    /**
     * Class Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CLS_INCL_EXCL
     * 
     */
    @JsonProperty("clsInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_INCL_EXCL")
    private String clsInclExcl;
    /**
     * Fifth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_5, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_5, Lookup lineage reference object : stvcamp")
    private String cmps5;
    /**
     * Fifth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_5, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_5, Lookup lineage reference object : stvcamp")
    private String criteriaCmps5;
    /**
     * Fourth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_4, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_4, Lookup lineage reference object : stvcamp")
    private String criteriaCmps4;
    /**
     * Class Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CLS_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.clsInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_INCL_EXCL")
    private String criteriaClsInclExcl;
    /**
     * Third Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_3, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_3, Lookup lineage reference object : stvcamp")
    private String criteriaCmps3;
    /**
     * Second Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_2, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_2, Lookup lineage reference object : stvcamp")
    private String criteriaCmps2;
    /**
     * First Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_1, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_1, Lookup lineage reference object : stvcamp")
    private String criteriaCmps1;
    /**
     * Third College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_3, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_3, Lookup lineage reference object : stvcoll")
    private String coll3;
    /**
     * Second College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_2, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_2, Lookup lineage reference object : stvcoll")
    private String coll2;
    /**
     * First College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_1, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_1, Lookup lineage reference object : stvcoll")
    private String coll1;
    /**
     * Fourth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_4, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_4, Lookup lineage reference object : stvclas")
    private String cls4;
    /**
     * Fifth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_5, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_5, Lookup lineage reference object : stvclas")
    private String cls5;
    /**
     * Second Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_2, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_2, Lookup lineage reference object : stvclas")
    private String cls2;
    /**
     * Third Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_3, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_3, Lookup lineage reference object : stvclas")
    private String cls3;
    /**
     * Term
     * <p>
     * Lineage reference object : SFRCTRL_TERM_CODE_HOST, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeHost")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_TERM_CODE_HOST, Lookup lineage reference object : stvterm")
    private String termCodeHost;
    /**
     * First Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_1, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_1, Lookup lineage reference object : stvclas")
    private String cls1;
    /**
     * Fifth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_5, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_5, Lookup lineage reference object : stvcoll")
    private String coll5;
    /**
     * Fourth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_4, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_4, Lookup lineage reference object : stvcoll")
    private String coll4;
    /**
     * End Date
     * <p>
     * Lineage reference object : SFRCTRL_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_END_DATE")
    private Date criteriaEndDate;
    /**
     * Fifth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_5, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_5, Lookup lineage reference object : stvlevl")
    private String criteriaLevl5;
    /**
     * Ending Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_END
     * 
     */
    @JsonProperty("lastNamEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LAST_NAM_END")
    private String lastNamEnd;
    /**
     * Fourth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl")
    private String criteriaLevl4;
    /**
     * Third Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_3, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_3, Lookup lineage reference object : stvlevl")
    private String criteriaLevl3;
    /**
     * Second Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_2, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_2, Lookup lineage reference object : stvlevl")
    private String criteriaLevl2;
    /**
     * First Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_1, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_1, Lookup lineage reference object : stvlevl")
    private String criteriaLevl1;
    /**
     * Major Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_INCL_EXCL
     * 
     */
    @JsonProperty("majrInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_INCL_EXCL")
    private String majrInclExcl;
    /**
     * Fourth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_4, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_4, Lookup lineage reference object : stvdept")
    private String criteriaDept4;
    /**
     * Fifth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_5, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_5, Lookup lineage reference object : stvdept")
    private String criteriaDept5;
    /**
     * Priority Number
     * <p>
     * Lineage reference object : SFRCTRL_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNo")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_SEQ_NO")
    private Double criteriaSeqNo;
    /**
     * Term
     * <p>
     * Lineage reference object : SFRCTRL_TERM_CODE_HOST, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeHost")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_TERM_CODE_HOST, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeHost;
    /**
     * College Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_COLL_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.collInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_INCL_EXCL")
    private String criteriaCollInclExcl;
    /**
     * Starting PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_START
     * 
     */
    @JsonProperty("pinStart")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_PIN_START")
    private Double pinStart;
    /**
     * Ending Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_END
     * 
     */
    @JsonProperty("criteria.lastNamEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LAST_NAM_END")
    private String criteriaLastNamEnd;
    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_BEGIN
     * 
     */
    @JsonProperty("criteria.hourBegin")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_HOUR_BEGIN")
    private String criteriaHourBegin;
    /**
     * Third College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_3, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_3, Lookup lineage reference object : stvcoll")
    private String criteriaColl3;
    /**
     * Third Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_3, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_3, Lookup lineage reference object : stvclas")
    private String criteriaCls3;
    /**
     * End Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_END
     * 
     */
    @JsonProperty("criteria.hourEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_HOUR_END")
    private String criteriaHourEnd;
    /**
     * Fourth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_4, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_4, Lookup lineage reference object : stvcoll")
    private String criteriaColl4;
    /**
     * Fourth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_4, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_4, Lookup lineage reference object : stvclas")
    private String criteriaCls4;
    /**
     * Starting Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_START
     * 
     */
    @JsonProperty("criteria.lastNamStart")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LAST_NAM_START")
    private String criteriaLastNamStart;
    /**
     * Fifth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_5, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_5, Lookup lineage reference object : stvcoll")
    private String criteriaColl5;
    /**
     * Fifth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_5, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_5, Lookup lineage reference object : stvclas")
    private String criteriaCls5;
    /**
     * First College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_1, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_1, Lookup lineage reference object : stvcoll")
    private String criteriaColl1;
    /**
     * First Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_1, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_1, Lookup lineage reference object : stvclas")
    private String criteriaCls1;
    /**
     * Second College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_2, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_COLL_2, Lookup lineage reference object : stvcoll")
    private String criteriaColl2;
    /**
     * Second Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_2, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CLS_2, Lookup lineage reference object : stvclas")
    private String criteriaCls2;
    /**
     * Earned Hours Begin
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_BEGIN
     * 
     */
    @JsonProperty("earnHrsBegin")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_EARN_HRS_BEGIN")
    private Double earnHrsBegin;
    /**
     * Fifth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_5, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_5, Lookup lineage reference object : stvstyp")
    private String criteriaStudType5;
    /**
     * End Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_END
     * 
     */
    @JsonProperty("hourEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_HOUR_END")
    private String hourEnd;
    /**
     * First Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_1, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_1, Lookup lineage reference object : stvstyp")
    private String criteriaStudType1;
    /**
     * Second Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_2, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_2, Lookup lineage reference object : stvstyp")
    private String criteriaStudType2;
    /**
     * Third Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_3, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_3, Lookup lineage reference object : stvstyp")
    private String criteriaStudType3;
    /**
     * Department Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_INCL_EXCL
     * 
     */
    @JsonProperty("deptInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_INCL_EXCL")
    private String deptInclExcl;
    /**
     * Fourth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_4, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_STUD_TYPE_4, Lookup lineage reference object : stvstyp")
    private String criteriaStudType4;
    /**
     * Degree Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.degrInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_INCL_EXCL")
    private String criteriaDegrInclExcl;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : SFRCTRL_BEGIN_DATE
     * 
     */
    @JsonProperty("criteria.beginDate")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_BEGIN_DATE")
    private Date criteriaBeginDate;
    /**
     * Campus Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_INCL_EXCL
     * 
     */
    @JsonProperty("cmpsInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_INCL_EXCL")
    private String cmpsInclExcl;
    /**
     * Ending PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_END
     * 
     */
    @JsonProperty("criteria.pinEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_PIN_END")
    private Double criteriaPinEnd;
    /**
     * Earned Hours End
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_END
     * 
     */
    @JsonProperty("criteria.earnHrsEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_EARN_HRS_END")
    private Double criteriaEarnHrsEnd;
    /**
     * Second Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_2, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_2, Lookup lineage reference object : stvmajr")
    private String criteriaMajr2;
    /**
     * First Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_1, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_1, Lookup lineage reference object : stvmajr")
    private String criteriaMajr1;
    /**
     * Fifth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_5, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_5, Lookup lineage reference object : stvmajr")
    private String criteriaMajr5;
    /**
     * Fourth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_4, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_4, Lookup lineage reference object : stvmajr")
    private String criteriaMajr4;
    /**
     * Third Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_3, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_3, Lookup lineage reference object : stvmajr")
    private String criteriaMajr3;
    /**
     * Campus Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.cmpsInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_INCL_EXCL")
    private String criteriaCmpsInclExcl;
    /**
     * Degree Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_INCL_EXCL
     * 
     */
    @JsonProperty("degrInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_INCL_EXCL")
    private String degrInclExcl;
    /**
     * First Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_1, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_1, Lookup lineage reference object : stvdegc")
    private String criteriaDegr1;
    /**
     * Major Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.majrInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_INCL_EXCL")
    private String criteriaMajrInclExcl;
    /**
     * Second Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_2, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_2, Lookup lineage reference object : stvdegc")
    private String criteriaDegr2;
    /**
     * Second Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_2, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_2, Lookup lineage reference object : stvdept")
    private String criteriaDept2;
    /**
     * Third Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_3, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_3, Lookup lineage reference object : stvdept")
    private String criteriaDept3;
    /**
     * First Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_1, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_1, Lookup lineage reference object : stvdept")
    private String criteriaDept1;
    /**
     * Fifth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_5, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_5, Lookup lineage reference object : stvdegc")
    private String criteriaDegr5;
    /**
     * Third Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_3, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_3, Lookup lineage reference object : stvdegc")
    private String criteriaDegr3;
    /**
     * Fourth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_4, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEGR_4, Lookup lineage reference object : stvdegc")
    private String criteriaDegr4;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : SFRCTRL_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_BEGIN_DATE")
    private Date beginDate;
    /**
     * Department Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.deptInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_INCL_EXCL")
    private String criteriaDeptInclExcl;
    /**
     * Fifth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_5, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr5")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_5, Lookup lineage reference object : stvmajr")
    private String majr5;
    /**
     * Fourth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_4, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_4, Lookup lineage reference object : stvmajr")
    private String majr4;
    /**
     * First Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_1, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr1")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_1, Lookup lineage reference object : stvmajr")
    private String majr1;
    /**
     * Third Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_3, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr3")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_3, Lookup lineage reference object : stvmajr")
    private String majr3;
    /**
     * Second Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_2, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr2")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_2, Lookup lineage reference object : stvmajr")
    private String majr2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Second Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_2, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl2")
    public String getLevl2() {
        return levl2;
    }

    /**
     * Second Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_2, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl2")
    public void setLevl2(String levl2) {
        this.levl2 = levl2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withLevl2(String levl2) {
        this.levl2 = levl2;
        return this;
    }

    /**
     * First Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_1, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl1")
    public String getLevl1() {
        return levl1;
    }

    /**
     * First Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_1, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl1")
    public void setLevl1(String levl1) {
        this.levl1 = levl1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withLevl1(String levl1) {
        this.levl1 = levl1;
        return this;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SFRCTRL_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SFRCTRL_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Fourth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl4")
    public String getLevl4() {
        return levl4;
    }

    /**
     * Fourth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl4")
    public void setLevl4(String levl4) {
        this.levl4 = levl4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withLevl4(String levl4) {
        this.levl4 = levl4;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFRCTRL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFRCTRL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Third Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_3, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl3")
    public String getLevl3() {
        return levl3;
    }

    /**
     * Third Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_3, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl3")
    public void setLevl3(String levl3) {
        this.levl3 = levl3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withLevl3(String levl3) {
        this.levl3 = levl3;
        return this;
    }

    /**
     * Fifth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_5, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl5")
    public String getLevl5() {
        return levl5;
    }

    /**
     * Fifth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_5, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl5")
    public void setLevl5(String levl5) {
        this.levl5 = levl5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withLevl5(String levl5) {
        this.levl5 = levl5;
        return this;
    }

    /**
     * College Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_COLL_INCL_EXCL
     * 
     */
    @JsonProperty("collInclExcl")
    public String getCollInclExcl() {
        return collInclExcl;
    }

    /**
     * College Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_COLL_INCL_EXCL
     * 
     */
    @JsonProperty("collInclExcl")
    public void setCollInclExcl(String collInclExcl) {
        this.collInclExcl = collInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCollInclExcl(String collInclExcl) {
        this.collInclExcl = collInclExcl;
        return this;
    }

    /**
     * Second Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_2, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType2")
    public String getStudType2() {
        return studType2;
    }

    /**
     * Second Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_2, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType2")
    public void setStudType2(String studType2) {
        this.studType2 = studType2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withStudType2(String studType2) {
        this.studType2 = studType2;
        return this;
    }

    /**
     * Third Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_3, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType3")
    public String getStudType3() {
        return studType3;
    }

    /**
     * Third Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_3, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType3")
    public void setStudType3(String studType3) {
        this.studType3 = studType3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withStudType3(String studType3) {
        this.studType3 = studType3;
        return this;
    }

    /**
     * Fourth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_4, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType4")
    public String getStudType4() {
        return studType4;
    }

    /**
     * Fourth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_4, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType4")
    public void setStudType4(String studType4) {
        this.studType4 = studType4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withStudType4(String studType4) {
        this.studType4 = studType4;
        return this;
    }

    /**
     * Fifth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_5, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType5")
    public String getStudType5() {
        return studType5;
    }

    /**
     * Fifth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_5, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType5")
    public void setStudType5(String studType5) {
        this.studType5 = studType5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withStudType5(String studType5) {
        this.studType5 = studType5;
        return this;
    }

    /**
     * Earned Hours End
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_END
     * 
     */
    @JsonProperty("earnHrsEnd")
    public Double getEarnHrsEnd() {
        return earnHrsEnd;
    }

    /**
     * Earned Hours End
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_END
     * 
     */
    @JsonProperty("earnHrsEnd")
    public void setEarnHrsEnd(Double earnHrsEnd) {
        this.earnHrsEnd = earnHrsEnd;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withEarnHrsEnd(Double earnHrsEnd) {
        this.earnHrsEnd = earnHrsEnd;
        return this;
    }

    /**
     * First Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_1, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType1")
    public String getStudType1() {
        return studType1;
    }

    /**
     * First Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_1, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("studType1")
    public void setStudType1(String studType1) {
        this.studType1 = studType1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withStudType1(String studType1) {
        this.studType1 = studType1;
        return this;
    }

    /**
     * Ending PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_END
     * 
     */
    @JsonProperty("pinEnd")
    public Double getPinEnd() {
        return pinEnd;
    }

    /**
     * Ending PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_END
     * 
     */
    @JsonProperty("pinEnd")
    public void setPinEnd(Double pinEnd) {
        this.pinEnd = pinEnd;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withPinEnd(Double pinEnd) {
        this.pinEnd = pinEnd;
        return this;
    }

    /**
     * Fifth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_5, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept5")
    public String getDept5() {
        return dept5;
    }

    /**
     * Fifth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_5, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept5")
    public void setDept5(String dept5) {
        this.dept5 = dept5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDept5(String dept5) {
        this.dept5 = dept5;
        return this;
    }

    /**
     * Earned Hours Begin
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_BEGIN
     * 
     */
    @JsonProperty("criteria.earnHrsBegin")
    public Double getCriteriaEarnHrsBegin() {
        return criteriaEarnHrsBegin;
    }

    /**
     * Earned Hours Begin
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_BEGIN
     * 
     */
    @JsonProperty("criteria.earnHrsBegin")
    public void setCriteriaEarnHrsBegin(Double criteriaEarnHrsBegin) {
        this.criteriaEarnHrsBegin = criteriaEarnHrsBegin;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaEarnHrsBegin(Double criteriaEarnHrsBegin) {
        this.criteriaEarnHrsBegin = criteriaEarnHrsBegin;
        return this;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_BEGIN
     * 
     */
    @JsonProperty("hourBegin")
    public String getHourBegin() {
        return hourBegin;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_BEGIN
     * 
     */
    @JsonProperty("hourBegin")
    public void setHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
        return this;
    }

    /**
     * Starting Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_START
     * 
     */
    @JsonProperty("lastNamStart")
    public String getLastNamStart() {
        return lastNamStart;
    }

    /**
     * Starting Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_START
     * 
     */
    @JsonProperty("lastNamStart")
    public void setLastNamStart(String lastNamStart) {
        this.lastNamStart = lastNamStart;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withLastNamStart(String lastNamStart) {
        this.lastNamStart = lastNamStart;
        return this;
    }

    /**
     * Starting PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_START
     * 
     */
    @JsonProperty("criteria.pinStart")
    public Double getCriteriaPinStart() {
        return criteriaPinStart;
    }

    /**
     * Starting PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_START
     * 
     */
    @JsonProperty("criteria.pinStart")
    public void setCriteriaPinStart(Double criteriaPinStart) {
        this.criteriaPinStart = criteriaPinStart;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaPinStart(Double criteriaPinStart) {
        this.criteriaPinStart = criteriaPinStart;
        return this;
    }

    /**
     * First Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_1, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr1")
    public String getDegr1() {
        return degr1;
    }

    /**
     * First Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_1, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr1")
    public void setDegr1(String degr1) {
        this.degr1 = degr1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDegr1(String degr1) {
        this.degr1 = degr1;
        return this;
    }

    /**
     * Second Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_2, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr2")
    public String getDegr2() {
        return degr2;
    }

    /**
     * Second Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_2, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr2")
    public void setDegr2(String degr2) {
        this.degr2 = degr2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDegr2(String degr2) {
        this.degr2 = degr2;
        return this;
    }

    /**
     * Third Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_3, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr3")
    public String getDegr3() {
        return degr3;
    }

    /**
     * Third Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_3, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr3")
    public void setDegr3(String degr3) {
        this.degr3 = degr3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDegr3(String degr3) {
        this.degr3 = degr3;
        return this;
    }

    /**
     * Fourth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_4, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr4")
    public String getDegr4() {
        return degr4;
    }

    /**
     * Fourth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_4, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr4")
    public void setDegr4(String degr4) {
        this.degr4 = degr4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDegr4(String degr4) {
        this.degr4 = degr4;
        return this;
    }

    /**
     * Fifth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_5, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr5")
    public String getDegr5() {
        return degr5;
    }

    /**
     * Fifth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_5, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degr5")
    public void setDegr5(String degr5) {
        this.degr5 = degr5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDegr5(String degr5) {
        this.degr5 = degr5;
        return this;
    }

    /**
     * First Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_1, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept1")
    public String getDept1() {
        return dept1;
    }

    /**
     * First Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_1, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept1")
    public void setDept1(String dept1) {
        this.dept1 = dept1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDept1(String dept1) {
        this.dept1 = dept1;
        return this;
    }

    /**
     * Second Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_2, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept2")
    public String getDept2() {
        return dept2;
    }

    /**
     * Second Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_2, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept2")
    public void setDept2(String dept2) {
        this.dept2 = dept2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDept2(String dept2) {
        this.dept2 = dept2;
        return this;
    }

    /**
     * Third Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_3, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept3")
    public String getDept3() {
        return dept3;
    }

    /**
     * Third Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_3, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept3")
    public void setDept3(String dept3) {
        this.dept3 = dept3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDept3(String dept3) {
        this.dept3 = dept3;
        return this;
    }

    /**
     * Fourth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_4, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept4")
    public String getDept4() {
        return dept4;
    }

    /**
     * Fourth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_4, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("dept4")
    public void setDept4(String dept4) {
        this.dept4 = dept4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDept4(String dept4) {
        this.dept4 = dept4;
        return this;
    }

    /**
     * Third Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_3, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps3")
    public String getCmps3() {
        return cmps3;
    }

    /**
     * Third Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_3, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps3")
    public void setCmps3(String cmps3) {
        this.cmps3 = cmps3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCmps3(String cmps3) {
        this.cmps3 = cmps3;
        return this;
    }

    /**
     * Fourth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_4, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps4")
    public String getCmps4() {
        return cmps4;
    }

    /**
     * Fourth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_4, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps4")
    public void setCmps4(String cmps4) {
        this.cmps4 = cmps4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCmps4(String cmps4) {
        this.cmps4 = cmps4;
        return this;
    }

    /**
     * First Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_1, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps1")
    public String getCmps1() {
        return cmps1;
    }

    /**
     * First Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_1, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps1")
    public void setCmps1(String cmps1) {
        this.cmps1 = cmps1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCmps1(String cmps1) {
        this.cmps1 = cmps1;
        return this;
    }

    /**
     * Second Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_2, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps2")
    public String getCmps2() {
        return cmps2;
    }

    /**
     * Second Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_2, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps2")
    public void setCmps2(String cmps2) {
        this.cmps2 = cmps2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCmps2(String cmps2) {
        this.cmps2 = cmps2;
        return this;
    }

    /**
     * Class Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CLS_INCL_EXCL
     * 
     */
    @JsonProperty("clsInclExcl")
    public String getClsInclExcl() {
        return clsInclExcl;
    }

    /**
     * Class Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CLS_INCL_EXCL
     * 
     */
    @JsonProperty("clsInclExcl")
    public void setClsInclExcl(String clsInclExcl) {
        this.clsInclExcl = clsInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withClsInclExcl(String clsInclExcl) {
        this.clsInclExcl = clsInclExcl;
        return this;
    }

    /**
     * Fifth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_5, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps5")
    public String getCmps5() {
        return cmps5;
    }

    /**
     * Fifth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_5, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("cmps5")
    public void setCmps5(String cmps5) {
        this.cmps5 = cmps5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCmps5(String cmps5) {
        this.cmps5 = cmps5;
        return this;
    }

    /**
     * Fifth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_5, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps5")
    public String getCriteriaCmps5() {
        return criteriaCmps5;
    }

    /**
     * Fifth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_5, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps5")
    public void setCriteriaCmps5(String criteriaCmps5) {
        this.criteriaCmps5 = criteriaCmps5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCmps5(String criteriaCmps5) {
        this.criteriaCmps5 = criteriaCmps5;
        return this;
    }

    /**
     * Fourth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_4, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps4")
    public String getCriteriaCmps4() {
        return criteriaCmps4;
    }

    /**
     * Fourth Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_4, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps4")
    public void setCriteriaCmps4(String criteriaCmps4) {
        this.criteriaCmps4 = criteriaCmps4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCmps4(String criteriaCmps4) {
        this.criteriaCmps4 = criteriaCmps4;
        return this;
    }

    /**
     * Class Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CLS_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.clsInclExcl")
    public String getCriteriaClsInclExcl() {
        return criteriaClsInclExcl;
    }

    /**
     * Class Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CLS_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.clsInclExcl")
    public void setCriteriaClsInclExcl(String criteriaClsInclExcl) {
        this.criteriaClsInclExcl = criteriaClsInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaClsInclExcl(String criteriaClsInclExcl) {
        this.criteriaClsInclExcl = criteriaClsInclExcl;
        return this;
    }

    /**
     * Third Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_3, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps3")
    public String getCriteriaCmps3() {
        return criteriaCmps3;
    }

    /**
     * Third Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_3, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps3")
    public void setCriteriaCmps3(String criteriaCmps3) {
        this.criteriaCmps3 = criteriaCmps3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCmps3(String criteriaCmps3) {
        this.criteriaCmps3 = criteriaCmps3;
        return this;
    }

    /**
     * Second Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_2, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps2")
    public String getCriteriaCmps2() {
        return criteriaCmps2;
    }

    /**
     * Second Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_2, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps2")
    public void setCriteriaCmps2(String criteriaCmps2) {
        this.criteriaCmps2 = criteriaCmps2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCmps2(String criteriaCmps2) {
        this.criteriaCmps2 = criteriaCmps2;
        return this;
    }

    /**
     * First Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_1, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps1")
    public String getCriteriaCmps1() {
        return criteriaCmps1;
    }

    /**
     * First Campus
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_1, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.cmps1")
    public void setCriteriaCmps1(String criteriaCmps1) {
        this.criteriaCmps1 = criteriaCmps1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCmps1(String criteriaCmps1) {
        this.criteriaCmps1 = criteriaCmps1;
        return this;
    }

    /**
     * Third College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_3, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll3")
    public String getColl3() {
        return coll3;
    }

    /**
     * Third College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_3, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll3")
    public void setColl3(String coll3) {
        this.coll3 = coll3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withColl3(String coll3) {
        this.coll3 = coll3;
        return this;
    }

    /**
     * Second College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_2, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll2")
    public String getColl2() {
        return coll2;
    }

    /**
     * Second College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_2, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll2")
    public void setColl2(String coll2) {
        this.coll2 = coll2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withColl2(String coll2) {
        this.coll2 = coll2;
        return this;
    }

    /**
     * First College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_1, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll1")
    public String getColl1() {
        return coll1;
    }

    /**
     * First College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_1, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll1")
    public void setColl1(String coll1) {
        this.coll1 = coll1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withColl1(String coll1) {
        this.coll1 = coll1;
        return this;
    }

    /**
     * Fourth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_4, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls4")
    public String getCls4() {
        return cls4;
    }

    /**
     * Fourth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_4, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls4")
    public void setCls4(String cls4) {
        this.cls4 = cls4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCls4(String cls4) {
        this.cls4 = cls4;
        return this;
    }

    /**
     * Fifth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_5, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls5")
    public String getCls5() {
        return cls5;
    }

    /**
     * Fifth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_5, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls5")
    public void setCls5(String cls5) {
        this.cls5 = cls5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCls5(String cls5) {
        this.cls5 = cls5;
        return this;
    }

    /**
     * Second Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_2, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls2")
    public String getCls2() {
        return cls2;
    }

    /**
     * Second Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_2, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls2")
    public void setCls2(String cls2) {
        this.cls2 = cls2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCls2(String cls2) {
        this.cls2 = cls2;
        return this;
    }

    /**
     * Third Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_3, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls3")
    public String getCls3() {
        return cls3;
    }

    /**
     * Third Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_3, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls3")
    public void setCls3(String cls3) {
        this.cls3 = cls3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCls3(String cls3) {
        this.cls3 = cls3;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SFRCTRL_TERM_CODE_HOST, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeHost")
    public String getTermCodeHost() {
        return termCodeHost;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SFRCTRL_TERM_CODE_HOST, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeHost")
    public void setTermCodeHost(String termCodeHost) {
        this.termCodeHost = termCodeHost;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withTermCodeHost(String termCodeHost) {
        this.termCodeHost = termCodeHost;
        return this;
    }

    /**
     * First Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_1, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls1")
    public String getCls1() {
        return cls1;
    }

    /**
     * First Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_1, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("cls1")
    public void setCls1(String cls1) {
        this.cls1 = cls1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCls1(String cls1) {
        this.cls1 = cls1;
        return this;
    }

    /**
     * Fifth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_5, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll5")
    public String getColl5() {
        return coll5;
    }

    /**
     * Fifth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_5, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll5")
    public void setColl5(String coll5) {
        this.coll5 = coll5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withColl5(String coll5) {
        this.coll5 = coll5;
        return this;
    }

    /**
     * Fourth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_4, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll4")
    public String getColl4() {
        return coll4;
    }

    /**
     * Fourth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_4, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("coll4")
    public void setColl4(String coll4) {
        this.coll4 = coll4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withColl4(String coll4) {
        this.coll4 = coll4;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFRCTRL_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFRCTRL_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Fifth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_5, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl5")
    public String getCriteriaLevl5() {
        return criteriaLevl5;
    }

    /**
     * Fifth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_5, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl5")
    public void setCriteriaLevl5(String criteriaLevl5) {
        this.criteriaLevl5 = criteriaLevl5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaLevl5(String criteriaLevl5) {
        this.criteriaLevl5 = criteriaLevl5;
        return this;
    }

    /**
     * Ending Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_END
     * 
     */
    @JsonProperty("lastNamEnd")
    public String getLastNamEnd() {
        return lastNamEnd;
    }

    /**
     * Ending Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_END
     * 
     */
    @JsonProperty("lastNamEnd")
    public void setLastNamEnd(String lastNamEnd) {
        this.lastNamEnd = lastNamEnd;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withLastNamEnd(String lastNamEnd) {
        this.lastNamEnd = lastNamEnd;
        return this;
    }

    /**
     * Fourth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl4")
    public String getCriteriaLevl4() {
        return criteriaLevl4;
    }

    /**
     * Fourth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl4")
    public void setCriteriaLevl4(String criteriaLevl4) {
        this.criteriaLevl4 = criteriaLevl4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaLevl4(String criteriaLevl4) {
        this.criteriaLevl4 = criteriaLevl4;
        return this;
    }

    /**
     * Third Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_3, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl3")
    public String getCriteriaLevl3() {
        return criteriaLevl3;
    }

    /**
     * Third Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_3, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl3")
    public void setCriteriaLevl3(String criteriaLevl3) {
        this.criteriaLevl3 = criteriaLevl3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaLevl3(String criteriaLevl3) {
        this.criteriaLevl3 = criteriaLevl3;
        return this;
    }

    /**
     * Second Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_2, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl2")
    public String getCriteriaLevl2() {
        return criteriaLevl2;
    }

    /**
     * Second Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_2, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl2")
    public void setCriteriaLevl2(String criteriaLevl2) {
        this.criteriaLevl2 = criteriaLevl2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaLevl2(String criteriaLevl2) {
        this.criteriaLevl2 = criteriaLevl2;
        return this;
    }

    /**
     * First Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_1, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl1")
    public String getCriteriaLevl1() {
        return criteriaLevl1;
    }

    /**
     * First Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_1, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("criteria.levl1")
    public void setCriteriaLevl1(String criteriaLevl1) {
        this.criteriaLevl1 = criteriaLevl1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaLevl1(String criteriaLevl1) {
        this.criteriaLevl1 = criteriaLevl1;
        return this;
    }

    /**
     * Major Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_INCL_EXCL
     * 
     */
    @JsonProperty("majrInclExcl")
    public String getMajrInclExcl() {
        return majrInclExcl;
    }

    /**
     * Major Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_INCL_EXCL
     * 
     */
    @JsonProperty("majrInclExcl")
    public void setMajrInclExcl(String majrInclExcl) {
        this.majrInclExcl = majrInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withMajrInclExcl(String majrInclExcl) {
        this.majrInclExcl = majrInclExcl;
        return this;
    }

    /**
     * Fourth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_4, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept4")
    public String getCriteriaDept4() {
        return criteriaDept4;
    }

    /**
     * Fourth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_4, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept4")
    public void setCriteriaDept4(String criteriaDept4) {
        this.criteriaDept4 = criteriaDept4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDept4(String criteriaDept4) {
        this.criteriaDept4 = criteriaDept4;
        return this;
    }

    /**
     * Fifth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_5, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept5")
    public String getCriteriaDept5() {
        return criteriaDept5;
    }

    /**
     * Fifth Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_5, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept5")
    public void setCriteriaDept5(String criteriaDept5) {
        this.criteriaDept5 = criteriaDept5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDept5(String criteriaDept5) {
        this.criteriaDept5 = criteriaDept5;
        return this;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SFRCTRL_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNo")
    public Double getCriteriaSeqNo() {
        return criteriaSeqNo;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SFRCTRL_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("criteria.seqNo")
    public void setCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SFRCTRL_TERM_CODE_HOST, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeHost")
    public String getCriteriaTermCodeHost() {
        return criteriaTermCodeHost;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SFRCTRL_TERM_CODE_HOST, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeHost")
    public void setCriteriaTermCodeHost(String criteriaTermCodeHost) {
        this.criteriaTermCodeHost = criteriaTermCodeHost;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaTermCodeHost(String criteriaTermCodeHost) {
        this.criteriaTermCodeHost = criteriaTermCodeHost;
        return this;
    }

    /**
     * College Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_COLL_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.collInclExcl")
    public String getCriteriaCollInclExcl() {
        return criteriaCollInclExcl;
    }

    /**
     * College Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_COLL_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.collInclExcl")
    public void setCriteriaCollInclExcl(String criteriaCollInclExcl) {
        this.criteriaCollInclExcl = criteriaCollInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCollInclExcl(String criteriaCollInclExcl) {
        this.criteriaCollInclExcl = criteriaCollInclExcl;
        return this;
    }

    /**
     * Starting PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_START
     * 
     */
    @JsonProperty("pinStart")
    public Double getPinStart() {
        return pinStart;
    }

    /**
     * Starting PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_START
     * 
     */
    @JsonProperty("pinStart")
    public void setPinStart(Double pinStart) {
        this.pinStart = pinStart;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withPinStart(Double pinStart) {
        this.pinStart = pinStart;
        return this;
    }

    /**
     * Ending Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_END
     * 
     */
    @JsonProperty("criteria.lastNamEnd")
    public String getCriteriaLastNamEnd() {
        return criteriaLastNamEnd;
    }

    /**
     * Ending Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_END
     * 
     */
    @JsonProperty("criteria.lastNamEnd")
    public void setCriteriaLastNamEnd(String criteriaLastNamEnd) {
        this.criteriaLastNamEnd = criteriaLastNamEnd;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaLastNamEnd(String criteriaLastNamEnd) {
        this.criteriaLastNamEnd = criteriaLastNamEnd;
        return this;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_BEGIN
     * 
     */
    @JsonProperty("criteria.hourBegin")
    public String getCriteriaHourBegin() {
        return criteriaHourBegin;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_BEGIN
     * 
     */
    @JsonProperty("criteria.hourBegin")
    public void setCriteriaHourBegin(String criteriaHourBegin) {
        this.criteriaHourBegin = criteriaHourBegin;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaHourBegin(String criteriaHourBegin) {
        this.criteriaHourBegin = criteriaHourBegin;
        return this;
    }

    /**
     * Third College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_3, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll3")
    public String getCriteriaColl3() {
        return criteriaColl3;
    }

    /**
     * Third College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_3, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll3")
    public void setCriteriaColl3(String criteriaColl3) {
        this.criteriaColl3 = criteriaColl3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaColl3(String criteriaColl3) {
        this.criteriaColl3 = criteriaColl3;
        return this;
    }

    /**
     * Third Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_3, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls3")
    public String getCriteriaCls3() {
        return criteriaCls3;
    }

    /**
     * Third Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_3, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls3")
    public void setCriteriaCls3(String criteriaCls3) {
        this.criteriaCls3 = criteriaCls3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCls3(String criteriaCls3) {
        this.criteriaCls3 = criteriaCls3;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_END
     * 
     */
    @JsonProperty("criteria.hourEnd")
    public String getCriteriaHourEnd() {
        return criteriaHourEnd;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_END
     * 
     */
    @JsonProperty("criteria.hourEnd")
    public void setCriteriaHourEnd(String criteriaHourEnd) {
        this.criteriaHourEnd = criteriaHourEnd;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaHourEnd(String criteriaHourEnd) {
        this.criteriaHourEnd = criteriaHourEnd;
        return this;
    }

    /**
     * Fourth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_4, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll4")
    public String getCriteriaColl4() {
        return criteriaColl4;
    }

    /**
     * Fourth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_4, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll4")
    public void setCriteriaColl4(String criteriaColl4) {
        this.criteriaColl4 = criteriaColl4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaColl4(String criteriaColl4) {
        this.criteriaColl4 = criteriaColl4;
        return this;
    }

    /**
     * Fourth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_4, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls4")
    public String getCriteriaCls4() {
        return criteriaCls4;
    }

    /**
     * Fourth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_4, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls4")
    public void setCriteriaCls4(String criteriaCls4) {
        this.criteriaCls4 = criteriaCls4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCls4(String criteriaCls4) {
        this.criteriaCls4 = criteriaCls4;
        return this;
    }

    /**
     * Starting Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_START
     * 
     */
    @JsonProperty("criteria.lastNamStart")
    public String getCriteriaLastNamStart() {
        return criteriaLastNamStart;
    }

    /**
     * Starting Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_START
     * 
     */
    @JsonProperty("criteria.lastNamStart")
    public void setCriteriaLastNamStart(String criteriaLastNamStart) {
        this.criteriaLastNamStart = criteriaLastNamStart;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaLastNamStart(String criteriaLastNamStart) {
        this.criteriaLastNamStart = criteriaLastNamStart;
        return this;
    }

    /**
     * Fifth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_5, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll5")
    public String getCriteriaColl5() {
        return criteriaColl5;
    }

    /**
     * Fifth College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_5, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll5")
    public void setCriteriaColl5(String criteriaColl5) {
        this.criteriaColl5 = criteriaColl5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaColl5(String criteriaColl5) {
        this.criteriaColl5 = criteriaColl5;
        return this;
    }

    /**
     * Fifth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_5, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls5")
    public String getCriteriaCls5() {
        return criteriaCls5;
    }

    /**
     * Fifth Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_5, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls5")
    public void setCriteriaCls5(String criteriaCls5) {
        this.criteriaCls5 = criteriaCls5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCls5(String criteriaCls5) {
        this.criteriaCls5 = criteriaCls5;
        return this;
    }

    /**
     * First College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_1, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll1")
    public String getCriteriaColl1() {
        return criteriaColl1;
    }

    /**
     * First College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_1, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll1")
    public void setCriteriaColl1(String criteriaColl1) {
        this.criteriaColl1 = criteriaColl1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaColl1(String criteriaColl1) {
        this.criteriaColl1 = criteriaColl1;
        return this;
    }

    /**
     * First Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_1, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls1")
    public String getCriteriaCls1() {
        return criteriaCls1;
    }

    /**
     * First Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_1, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls1")
    public void setCriteriaCls1(String criteriaCls1) {
        this.criteriaCls1 = criteriaCls1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCls1(String criteriaCls1) {
        this.criteriaCls1 = criteriaCls1;
        return this;
    }

    /**
     * Second College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_2, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll2")
    public String getCriteriaColl2() {
        return criteriaColl2;
    }

    /**
     * Second College
     * <p>
     * Lineage reference object : SFRCTRL_COLL_2, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.coll2")
    public void setCriteriaColl2(String criteriaColl2) {
        this.criteriaColl2 = criteriaColl2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaColl2(String criteriaColl2) {
        this.criteriaColl2 = criteriaColl2;
        return this;
    }

    /**
     * Second Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_2, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls2")
    public String getCriteriaCls2() {
        return criteriaCls2;
    }

    /**
     * Second Class
     * <p>
     * Lineage reference object : SFRCTRL_CLS_2, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("criteria.cls2")
    public void setCriteriaCls2(String criteriaCls2) {
        this.criteriaCls2 = criteriaCls2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCls2(String criteriaCls2) {
        this.criteriaCls2 = criteriaCls2;
        return this;
    }

    /**
     * Earned Hours Begin
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_BEGIN
     * 
     */
    @JsonProperty("earnHrsBegin")
    public Double getEarnHrsBegin() {
        return earnHrsBegin;
    }

    /**
     * Earned Hours Begin
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_BEGIN
     * 
     */
    @JsonProperty("earnHrsBegin")
    public void setEarnHrsBegin(Double earnHrsBegin) {
        this.earnHrsBegin = earnHrsBegin;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withEarnHrsBegin(Double earnHrsBegin) {
        this.earnHrsBegin = earnHrsBegin;
        return this;
    }

    /**
     * Fifth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_5, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType5")
    public String getCriteriaStudType5() {
        return criteriaStudType5;
    }

    /**
     * Fifth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_5, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType5")
    public void setCriteriaStudType5(String criteriaStudType5) {
        this.criteriaStudType5 = criteriaStudType5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaStudType5(String criteriaStudType5) {
        this.criteriaStudType5 = criteriaStudType5;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_END
     * 
     */
    @JsonProperty("hourEnd")
    public String getHourEnd() {
        return hourEnd;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_END
     * 
     */
    @JsonProperty("hourEnd")
    public void setHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
        return this;
    }

    /**
     * First Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_1, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType1")
    public String getCriteriaStudType1() {
        return criteriaStudType1;
    }

    /**
     * First Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_1, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType1")
    public void setCriteriaStudType1(String criteriaStudType1) {
        this.criteriaStudType1 = criteriaStudType1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaStudType1(String criteriaStudType1) {
        this.criteriaStudType1 = criteriaStudType1;
        return this;
    }

    /**
     * Second Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_2, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType2")
    public String getCriteriaStudType2() {
        return criteriaStudType2;
    }

    /**
     * Second Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_2, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType2")
    public void setCriteriaStudType2(String criteriaStudType2) {
        this.criteriaStudType2 = criteriaStudType2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaStudType2(String criteriaStudType2) {
        this.criteriaStudType2 = criteriaStudType2;
        return this;
    }

    /**
     * Third Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_3, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType3")
    public String getCriteriaStudType3() {
        return criteriaStudType3;
    }

    /**
     * Third Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_3, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType3")
    public void setCriteriaStudType3(String criteriaStudType3) {
        this.criteriaStudType3 = criteriaStudType3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaStudType3(String criteriaStudType3) {
        this.criteriaStudType3 = criteriaStudType3;
        return this;
    }

    /**
     * Department Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_INCL_EXCL
     * 
     */
    @JsonProperty("deptInclExcl")
    public String getDeptInclExcl() {
        return deptInclExcl;
    }

    /**
     * Department Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_INCL_EXCL
     * 
     */
    @JsonProperty("deptInclExcl")
    public void setDeptInclExcl(String deptInclExcl) {
        this.deptInclExcl = deptInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDeptInclExcl(String deptInclExcl) {
        this.deptInclExcl = deptInclExcl;
        return this;
    }

    /**
     * Fourth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_4, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType4")
    public String getCriteriaStudType4() {
        return criteriaStudType4;
    }

    /**
     * Fourth Student Type
     * <p>
     * Lineage reference object : SFRCTRL_STUD_TYPE_4, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("criteria.studType4")
    public void setCriteriaStudType4(String criteriaStudType4) {
        this.criteriaStudType4 = criteriaStudType4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaStudType4(String criteriaStudType4) {
        this.criteriaStudType4 = criteriaStudType4;
        return this;
    }

    /**
     * Degree Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.degrInclExcl")
    public String getCriteriaDegrInclExcl() {
        return criteriaDegrInclExcl;
    }

    /**
     * Degree Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.degrInclExcl")
    public void setCriteriaDegrInclExcl(String criteriaDegrInclExcl) {
        this.criteriaDegrInclExcl = criteriaDegrInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDegrInclExcl(String criteriaDegrInclExcl) {
        this.criteriaDegrInclExcl = criteriaDegrInclExcl;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SFRCTRL_BEGIN_DATE
     * 
     */
    @JsonProperty("criteria.beginDate")
    public Date getCriteriaBeginDate() {
        return criteriaBeginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SFRCTRL_BEGIN_DATE
     * 
     */
    @JsonProperty("criteria.beginDate")
    public void setCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaBeginDate(Date criteriaBeginDate) {
        this.criteriaBeginDate = criteriaBeginDate;
        return this;
    }

    /**
     * Campus Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_INCL_EXCL
     * 
     */
    @JsonProperty("cmpsInclExcl")
    public String getCmpsInclExcl() {
        return cmpsInclExcl;
    }

    /**
     * Campus Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_INCL_EXCL
     * 
     */
    @JsonProperty("cmpsInclExcl")
    public void setCmpsInclExcl(String cmpsInclExcl) {
        this.cmpsInclExcl = cmpsInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCmpsInclExcl(String cmpsInclExcl) {
        this.cmpsInclExcl = cmpsInclExcl;
        return this;
    }

    /**
     * Ending PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_END
     * 
     */
    @JsonProperty("criteria.pinEnd")
    public Double getCriteriaPinEnd() {
        return criteriaPinEnd;
    }

    /**
     * Ending PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_END
     * 
     */
    @JsonProperty("criteria.pinEnd")
    public void setCriteriaPinEnd(Double criteriaPinEnd) {
        this.criteriaPinEnd = criteriaPinEnd;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaPinEnd(Double criteriaPinEnd) {
        this.criteriaPinEnd = criteriaPinEnd;
        return this;
    }

    /**
     * Earned Hours End
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_END
     * 
     */
    @JsonProperty("criteria.earnHrsEnd")
    public Double getCriteriaEarnHrsEnd() {
        return criteriaEarnHrsEnd;
    }

    /**
     * Earned Hours End
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_END
     * 
     */
    @JsonProperty("criteria.earnHrsEnd")
    public void setCriteriaEarnHrsEnd(Double criteriaEarnHrsEnd) {
        this.criteriaEarnHrsEnd = criteriaEarnHrsEnd;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaEarnHrsEnd(Double criteriaEarnHrsEnd) {
        this.criteriaEarnHrsEnd = criteriaEarnHrsEnd;
        return this;
    }

    /**
     * Second Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_2, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr2")
    public String getCriteriaMajr2() {
        return criteriaMajr2;
    }

    /**
     * Second Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_2, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr2")
    public void setCriteriaMajr2(String criteriaMajr2) {
        this.criteriaMajr2 = criteriaMajr2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaMajr2(String criteriaMajr2) {
        this.criteriaMajr2 = criteriaMajr2;
        return this;
    }

    /**
     * First Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_1, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr1")
    public String getCriteriaMajr1() {
        return criteriaMajr1;
    }

    /**
     * First Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_1, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr1")
    public void setCriteriaMajr1(String criteriaMajr1) {
        this.criteriaMajr1 = criteriaMajr1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaMajr1(String criteriaMajr1) {
        this.criteriaMajr1 = criteriaMajr1;
        return this;
    }

    /**
     * Fifth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_5, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr5")
    public String getCriteriaMajr5() {
        return criteriaMajr5;
    }

    /**
     * Fifth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_5, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr5")
    public void setCriteriaMajr5(String criteriaMajr5) {
        this.criteriaMajr5 = criteriaMajr5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaMajr5(String criteriaMajr5) {
        this.criteriaMajr5 = criteriaMajr5;
        return this;
    }

    /**
     * Fourth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_4, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr4")
    public String getCriteriaMajr4() {
        return criteriaMajr4;
    }

    /**
     * Fourth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_4, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr4")
    public void setCriteriaMajr4(String criteriaMajr4) {
        this.criteriaMajr4 = criteriaMajr4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaMajr4(String criteriaMajr4) {
        this.criteriaMajr4 = criteriaMajr4;
        return this;
    }

    /**
     * Third Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_3, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr3")
    public String getCriteriaMajr3() {
        return criteriaMajr3;
    }

    /**
     * Third Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_3, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("criteria.majr3")
    public void setCriteriaMajr3(String criteriaMajr3) {
        this.criteriaMajr3 = criteriaMajr3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaMajr3(String criteriaMajr3) {
        this.criteriaMajr3 = criteriaMajr3;
        return this;
    }

    /**
     * Campus Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.cmpsInclExcl")
    public String getCriteriaCmpsInclExcl() {
        return criteriaCmpsInclExcl;
    }

    /**
     * Campus Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.cmpsInclExcl")
    public void setCriteriaCmpsInclExcl(String criteriaCmpsInclExcl) {
        this.criteriaCmpsInclExcl = criteriaCmpsInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaCmpsInclExcl(String criteriaCmpsInclExcl) {
        this.criteriaCmpsInclExcl = criteriaCmpsInclExcl;
        return this;
    }

    /**
     * Degree Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_INCL_EXCL
     * 
     */
    @JsonProperty("degrInclExcl")
    public String getDegrInclExcl() {
        return degrInclExcl;
    }

    /**
     * Degree Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_INCL_EXCL
     * 
     */
    @JsonProperty("degrInclExcl")
    public void setDegrInclExcl(String degrInclExcl) {
        this.degrInclExcl = degrInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withDegrInclExcl(String degrInclExcl) {
        this.degrInclExcl = degrInclExcl;
        return this;
    }

    /**
     * First Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_1, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr1")
    public String getCriteriaDegr1() {
        return criteriaDegr1;
    }

    /**
     * First Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_1, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr1")
    public void setCriteriaDegr1(String criteriaDegr1) {
        this.criteriaDegr1 = criteriaDegr1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDegr1(String criteriaDegr1) {
        this.criteriaDegr1 = criteriaDegr1;
        return this;
    }

    /**
     * Major Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.majrInclExcl")
    public String getCriteriaMajrInclExcl() {
        return criteriaMajrInclExcl;
    }

    /**
     * Major Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.majrInclExcl")
    public void setCriteriaMajrInclExcl(String criteriaMajrInclExcl) {
        this.criteriaMajrInclExcl = criteriaMajrInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaMajrInclExcl(String criteriaMajrInclExcl) {
        this.criteriaMajrInclExcl = criteriaMajrInclExcl;
        return this;
    }

    /**
     * Second Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_2, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr2")
    public String getCriteriaDegr2() {
        return criteriaDegr2;
    }

    /**
     * Second Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_2, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr2")
    public void setCriteriaDegr2(String criteriaDegr2) {
        this.criteriaDegr2 = criteriaDegr2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDegr2(String criteriaDegr2) {
        this.criteriaDegr2 = criteriaDegr2;
        return this;
    }

    /**
     * Second Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_2, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept2")
    public String getCriteriaDept2() {
        return criteriaDept2;
    }

    /**
     * Second Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_2, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept2")
    public void setCriteriaDept2(String criteriaDept2) {
        this.criteriaDept2 = criteriaDept2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDept2(String criteriaDept2) {
        this.criteriaDept2 = criteriaDept2;
        return this;
    }

    /**
     * Third Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_3, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept3")
    public String getCriteriaDept3() {
        return criteriaDept3;
    }

    /**
     * Third Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_3, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept3")
    public void setCriteriaDept3(String criteriaDept3) {
        this.criteriaDept3 = criteriaDept3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDept3(String criteriaDept3) {
        this.criteriaDept3 = criteriaDept3;
        return this;
    }

    /**
     * First Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_1, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept1")
    public String getCriteriaDept1() {
        return criteriaDept1;
    }

    /**
     * First Department
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_1, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.dept1")
    public void setCriteriaDept1(String criteriaDept1) {
        this.criteriaDept1 = criteriaDept1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDept1(String criteriaDept1) {
        this.criteriaDept1 = criteriaDept1;
        return this;
    }

    /**
     * Fifth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_5, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr5")
    public String getCriteriaDegr5() {
        return criteriaDegr5;
    }

    /**
     * Fifth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_5, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr5")
    public void setCriteriaDegr5(String criteriaDegr5) {
        this.criteriaDegr5 = criteriaDegr5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDegr5(String criteriaDegr5) {
        this.criteriaDegr5 = criteriaDegr5;
        return this;
    }

    /**
     * Third Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_3, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr3")
    public String getCriteriaDegr3() {
        return criteriaDegr3;
    }

    /**
     * Third Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_3, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr3")
    public void setCriteriaDegr3(String criteriaDegr3) {
        this.criteriaDegr3 = criteriaDegr3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDegr3(String criteriaDegr3) {
        this.criteriaDegr3 = criteriaDegr3;
        return this;
    }

    /**
     * Fourth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_4, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr4")
    public String getCriteriaDegr4() {
        return criteriaDegr4;
    }

    /**
     * Fourth Degree
     * <p>
     * Lineage reference object : SFRCTRL_DEGR_4, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degr4")
    public void setCriteriaDegr4(String criteriaDegr4) {
        this.criteriaDegr4 = criteriaDegr4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDegr4(String criteriaDegr4) {
        this.criteriaDegr4 = criteriaDegr4;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SFRCTRL_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : SFRCTRL_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Department Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.deptInclExcl")
    public String getCriteriaDeptInclExcl() {
        return criteriaDeptInclExcl;
    }

    /**
     * Department Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_INCL_EXCL
     * 
     */
    @JsonProperty("criteria.deptInclExcl")
    public void setCriteriaDeptInclExcl(String criteriaDeptInclExcl) {
        this.criteriaDeptInclExcl = criteriaDeptInclExcl;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withCriteriaDeptInclExcl(String criteriaDeptInclExcl) {
        this.criteriaDeptInclExcl = criteriaDeptInclExcl;
        return this;
    }

    /**
     * Fifth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_5, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr5")
    public String getMajr5() {
        return majr5;
    }

    /**
     * Fifth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_5, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr5")
    public void setMajr5(String majr5) {
        this.majr5 = majr5;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withMajr5(String majr5) {
        this.majr5 = majr5;
        return this;
    }

    /**
     * Fourth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_4, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr4")
    public String getMajr4() {
        return majr4;
    }

    /**
     * Fourth Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_4, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr4")
    public void setMajr4(String majr4) {
        this.majr4 = majr4;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withMajr4(String majr4) {
        this.majr4 = majr4;
        return this;
    }

    /**
     * First Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_1, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr1")
    public String getMajr1() {
        return majr1;
    }

    /**
     * First Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_1, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr1")
    public void setMajr1(String majr1) {
        this.majr1 = majr1;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withMajr1(String majr1) {
        this.majr1 = majr1;
        return this;
    }

    /**
     * Third Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_3, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr3")
    public String getMajr3() {
        return majr3;
    }

    /**
     * Third Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_3, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr3")
    public void setMajr3(String majr3) {
        this.majr3 = majr3;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withMajr3(String majr3) {
        this.majr3 = majr3;
        return this;
    }

    /**
     * Second Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_2, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr2")
    public String getMajr2() {
        return majr2;
    }

    /**
     * Second Major
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_2, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majr2")
    public void setMajr2(String majr2) {
        this.majr2 = majr2;
    }

    public ThirdPartyRegistrationTimeControls100PutRequest withMajr2(String majr2) {
        this.majr2 = majr2;
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

    public ThirdPartyRegistrationTimeControls100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyRegistrationTimeControls100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("levl2");
        sb.append('=');
        sb.append(((this.levl2 == null)?"<null>":this.levl2));
        sb.append(',');
        sb.append("levl1");
        sb.append('=');
        sb.append(((this.levl1 == null)?"<null>":this.levl1));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("levl4");
        sb.append('=');
        sb.append(((this.levl4 == null)?"<null>":this.levl4));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("levl3");
        sb.append('=');
        sb.append(((this.levl3 == null)?"<null>":this.levl3));
        sb.append(',');
        sb.append("levl5");
        sb.append('=');
        sb.append(((this.levl5 == null)?"<null>":this.levl5));
        sb.append(',');
        sb.append("collInclExcl");
        sb.append('=');
        sb.append(((this.collInclExcl == null)?"<null>":this.collInclExcl));
        sb.append(',');
        sb.append("studType2");
        sb.append('=');
        sb.append(((this.studType2 == null)?"<null>":this.studType2));
        sb.append(',');
        sb.append("studType3");
        sb.append('=');
        sb.append(((this.studType3 == null)?"<null>":this.studType3));
        sb.append(',');
        sb.append("studType4");
        sb.append('=');
        sb.append(((this.studType4 == null)?"<null>":this.studType4));
        sb.append(',');
        sb.append("studType5");
        sb.append('=');
        sb.append(((this.studType5 == null)?"<null>":this.studType5));
        sb.append(',');
        sb.append("earnHrsEnd");
        sb.append('=');
        sb.append(((this.earnHrsEnd == null)?"<null>":this.earnHrsEnd));
        sb.append(',');
        sb.append("studType1");
        sb.append('=');
        sb.append(((this.studType1 == null)?"<null>":this.studType1));
        sb.append(',');
        sb.append("pinEnd");
        sb.append('=');
        sb.append(((this.pinEnd == null)?"<null>":this.pinEnd));
        sb.append(',');
        sb.append("dept5");
        sb.append('=');
        sb.append(((this.dept5 == null)?"<null>":this.dept5));
        sb.append(',');
        sb.append("criteriaEarnHrsBegin");
        sb.append('=');
        sb.append(((this.criteriaEarnHrsBegin == null)?"<null>":this.criteriaEarnHrsBegin));
        sb.append(',');
        sb.append("hourBegin");
        sb.append('=');
        sb.append(((this.hourBegin == null)?"<null>":this.hourBegin));
        sb.append(',');
        sb.append("lastNamStart");
        sb.append('=');
        sb.append(((this.lastNamStart == null)?"<null>":this.lastNamStart));
        sb.append(',');
        sb.append("criteriaPinStart");
        sb.append('=');
        sb.append(((this.criteriaPinStart == null)?"<null>":this.criteriaPinStart));
        sb.append(',');
        sb.append("degr1");
        sb.append('=');
        sb.append(((this.degr1 == null)?"<null>":this.degr1));
        sb.append(',');
        sb.append("degr2");
        sb.append('=');
        sb.append(((this.degr2 == null)?"<null>":this.degr2));
        sb.append(',');
        sb.append("degr3");
        sb.append('=');
        sb.append(((this.degr3 == null)?"<null>":this.degr3));
        sb.append(',');
        sb.append("degr4");
        sb.append('=');
        sb.append(((this.degr4 == null)?"<null>":this.degr4));
        sb.append(',');
        sb.append("degr5");
        sb.append('=');
        sb.append(((this.degr5 == null)?"<null>":this.degr5));
        sb.append(',');
        sb.append("dept1");
        sb.append('=');
        sb.append(((this.dept1 == null)?"<null>":this.dept1));
        sb.append(',');
        sb.append("dept2");
        sb.append('=');
        sb.append(((this.dept2 == null)?"<null>":this.dept2));
        sb.append(',');
        sb.append("dept3");
        sb.append('=');
        sb.append(((this.dept3 == null)?"<null>":this.dept3));
        sb.append(',');
        sb.append("dept4");
        sb.append('=');
        sb.append(((this.dept4 == null)?"<null>":this.dept4));
        sb.append(',');
        sb.append("cmps3");
        sb.append('=');
        sb.append(((this.cmps3 == null)?"<null>":this.cmps3));
        sb.append(',');
        sb.append("cmps4");
        sb.append('=');
        sb.append(((this.cmps4 == null)?"<null>":this.cmps4));
        sb.append(',');
        sb.append("cmps1");
        sb.append('=');
        sb.append(((this.cmps1 == null)?"<null>":this.cmps1));
        sb.append(',');
        sb.append("cmps2");
        sb.append('=');
        sb.append(((this.cmps2 == null)?"<null>":this.cmps2));
        sb.append(',');
        sb.append("clsInclExcl");
        sb.append('=');
        sb.append(((this.clsInclExcl == null)?"<null>":this.clsInclExcl));
        sb.append(',');
        sb.append("cmps5");
        sb.append('=');
        sb.append(((this.cmps5 == null)?"<null>":this.cmps5));
        sb.append(',');
        sb.append("criteriaCmps5");
        sb.append('=');
        sb.append(((this.criteriaCmps5 == null)?"<null>":this.criteriaCmps5));
        sb.append(',');
        sb.append("criteriaCmps4");
        sb.append('=');
        sb.append(((this.criteriaCmps4 == null)?"<null>":this.criteriaCmps4));
        sb.append(',');
        sb.append("criteriaClsInclExcl");
        sb.append('=');
        sb.append(((this.criteriaClsInclExcl == null)?"<null>":this.criteriaClsInclExcl));
        sb.append(',');
        sb.append("criteriaCmps3");
        sb.append('=');
        sb.append(((this.criteriaCmps3 == null)?"<null>":this.criteriaCmps3));
        sb.append(',');
        sb.append("criteriaCmps2");
        sb.append('=');
        sb.append(((this.criteriaCmps2 == null)?"<null>":this.criteriaCmps2));
        sb.append(',');
        sb.append("criteriaCmps1");
        sb.append('=');
        sb.append(((this.criteriaCmps1 == null)?"<null>":this.criteriaCmps1));
        sb.append(',');
        sb.append("coll3");
        sb.append('=');
        sb.append(((this.coll3 == null)?"<null>":this.coll3));
        sb.append(',');
        sb.append("coll2");
        sb.append('=');
        sb.append(((this.coll2 == null)?"<null>":this.coll2));
        sb.append(',');
        sb.append("coll1");
        sb.append('=');
        sb.append(((this.coll1 == null)?"<null>":this.coll1));
        sb.append(',');
        sb.append("cls4");
        sb.append('=');
        sb.append(((this.cls4 == null)?"<null>":this.cls4));
        sb.append(',');
        sb.append("cls5");
        sb.append('=');
        sb.append(((this.cls5 == null)?"<null>":this.cls5));
        sb.append(',');
        sb.append("cls2");
        sb.append('=');
        sb.append(((this.cls2 == null)?"<null>":this.cls2));
        sb.append(',');
        sb.append("cls3");
        sb.append('=');
        sb.append(((this.cls3 == null)?"<null>":this.cls3));
        sb.append(',');
        sb.append("termCodeHost");
        sb.append('=');
        sb.append(((this.termCodeHost == null)?"<null>":this.termCodeHost));
        sb.append(',');
        sb.append("cls1");
        sb.append('=');
        sb.append(((this.cls1 == null)?"<null>":this.cls1));
        sb.append(',');
        sb.append("coll5");
        sb.append('=');
        sb.append(((this.coll5 == null)?"<null>":this.coll5));
        sb.append(',');
        sb.append("coll4");
        sb.append('=');
        sb.append(((this.coll4 == null)?"<null>":this.coll4));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaLevl5");
        sb.append('=');
        sb.append(((this.criteriaLevl5 == null)?"<null>":this.criteriaLevl5));
        sb.append(',');
        sb.append("lastNamEnd");
        sb.append('=');
        sb.append(((this.lastNamEnd == null)?"<null>":this.lastNamEnd));
        sb.append(',');
        sb.append("criteriaLevl4");
        sb.append('=');
        sb.append(((this.criteriaLevl4 == null)?"<null>":this.criteriaLevl4));
        sb.append(',');
        sb.append("criteriaLevl3");
        sb.append('=');
        sb.append(((this.criteriaLevl3 == null)?"<null>":this.criteriaLevl3));
        sb.append(',');
        sb.append("criteriaLevl2");
        sb.append('=');
        sb.append(((this.criteriaLevl2 == null)?"<null>":this.criteriaLevl2));
        sb.append(',');
        sb.append("criteriaLevl1");
        sb.append('=');
        sb.append(((this.criteriaLevl1 == null)?"<null>":this.criteriaLevl1));
        sb.append(',');
        sb.append("majrInclExcl");
        sb.append('=');
        sb.append(((this.majrInclExcl == null)?"<null>":this.majrInclExcl));
        sb.append(',');
        sb.append("criteriaDept4");
        sb.append('=');
        sb.append(((this.criteriaDept4 == null)?"<null>":this.criteriaDept4));
        sb.append(',');
        sb.append("criteriaDept5");
        sb.append('=');
        sb.append(((this.criteriaDept5 == null)?"<null>":this.criteriaDept5));
        sb.append(',');
        sb.append("criteriaSeqNo");
        sb.append('=');
        sb.append(((this.criteriaSeqNo == null)?"<null>":this.criteriaSeqNo));
        sb.append(',');
        sb.append("criteriaTermCodeHost");
        sb.append('=');
        sb.append(((this.criteriaTermCodeHost == null)?"<null>":this.criteriaTermCodeHost));
        sb.append(',');
        sb.append("criteriaCollInclExcl");
        sb.append('=');
        sb.append(((this.criteriaCollInclExcl == null)?"<null>":this.criteriaCollInclExcl));
        sb.append(',');
        sb.append("pinStart");
        sb.append('=');
        sb.append(((this.pinStart == null)?"<null>":this.pinStart));
        sb.append(',');
        sb.append("criteriaLastNamEnd");
        sb.append('=');
        sb.append(((this.criteriaLastNamEnd == null)?"<null>":this.criteriaLastNamEnd));
        sb.append(',');
        sb.append("criteriaHourBegin");
        sb.append('=');
        sb.append(((this.criteriaHourBegin == null)?"<null>":this.criteriaHourBegin));
        sb.append(',');
        sb.append("criteriaColl3");
        sb.append('=');
        sb.append(((this.criteriaColl3 == null)?"<null>":this.criteriaColl3));
        sb.append(',');
        sb.append("criteriaCls3");
        sb.append('=');
        sb.append(((this.criteriaCls3 == null)?"<null>":this.criteriaCls3));
        sb.append(',');
        sb.append("criteriaHourEnd");
        sb.append('=');
        sb.append(((this.criteriaHourEnd == null)?"<null>":this.criteriaHourEnd));
        sb.append(',');
        sb.append("criteriaColl4");
        sb.append('=');
        sb.append(((this.criteriaColl4 == null)?"<null>":this.criteriaColl4));
        sb.append(',');
        sb.append("criteriaCls4");
        sb.append('=');
        sb.append(((this.criteriaCls4 == null)?"<null>":this.criteriaCls4));
        sb.append(',');
        sb.append("criteriaLastNamStart");
        sb.append('=');
        sb.append(((this.criteriaLastNamStart == null)?"<null>":this.criteriaLastNamStart));
        sb.append(',');
        sb.append("criteriaColl5");
        sb.append('=');
        sb.append(((this.criteriaColl5 == null)?"<null>":this.criteriaColl5));
        sb.append(',');
        sb.append("criteriaCls5");
        sb.append('=');
        sb.append(((this.criteriaCls5 == null)?"<null>":this.criteriaCls5));
        sb.append(',');
        sb.append("criteriaColl1");
        sb.append('=');
        sb.append(((this.criteriaColl1 == null)?"<null>":this.criteriaColl1));
        sb.append(',');
        sb.append("criteriaCls1");
        sb.append('=');
        sb.append(((this.criteriaCls1 == null)?"<null>":this.criteriaCls1));
        sb.append(',');
        sb.append("criteriaColl2");
        sb.append('=');
        sb.append(((this.criteriaColl2 == null)?"<null>":this.criteriaColl2));
        sb.append(',');
        sb.append("criteriaCls2");
        sb.append('=');
        sb.append(((this.criteriaCls2 == null)?"<null>":this.criteriaCls2));
        sb.append(',');
        sb.append("earnHrsBegin");
        sb.append('=');
        sb.append(((this.earnHrsBegin == null)?"<null>":this.earnHrsBegin));
        sb.append(',');
        sb.append("criteriaStudType5");
        sb.append('=');
        sb.append(((this.criteriaStudType5 == null)?"<null>":this.criteriaStudType5));
        sb.append(',');
        sb.append("hourEnd");
        sb.append('=');
        sb.append(((this.hourEnd == null)?"<null>":this.hourEnd));
        sb.append(',');
        sb.append("criteriaStudType1");
        sb.append('=');
        sb.append(((this.criteriaStudType1 == null)?"<null>":this.criteriaStudType1));
        sb.append(',');
        sb.append("criteriaStudType2");
        sb.append('=');
        sb.append(((this.criteriaStudType2 == null)?"<null>":this.criteriaStudType2));
        sb.append(',');
        sb.append("criteriaStudType3");
        sb.append('=');
        sb.append(((this.criteriaStudType3 == null)?"<null>":this.criteriaStudType3));
        sb.append(',');
        sb.append("deptInclExcl");
        sb.append('=');
        sb.append(((this.deptInclExcl == null)?"<null>":this.deptInclExcl));
        sb.append(',');
        sb.append("criteriaStudType4");
        sb.append('=');
        sb.append(((this.criteriaStudType4 == null)?"<null>":this.criteriaStudType4));
        sb.append(',');
        sb.append("criteriaDegrInclExcl");
        sb.append('=');
        sb.append(((this.criteriaDegrInclExcl == null)?"<null>":this.criteriaDegrInclExcl));
        sb.append(',');
        sb.append("criteriaBeginDate");
        sb.append('=');
        sb.append(((this.criteriaBeginDate == null)?"<null>":this.criteriaBeginDate));
        sb.append(',');
        sb.append("cmpsInclExcl");
        sb.append('=');
        sb.append(((this.cmpsInclExcl == null)?"<null>":this.cmpsInclExcl));
        sb.append(',');
        sb.append("criteriaPinEnd");
        sb.append('=');
        sb.append(((this.criteriaPinEnd == null)?"<null>":this.criteriaPinEnd));
        sb.append(',');
        sb.append("criteriaEarnHrsEnd");
        sb.append('=');
        sb.append(((this.criteriaEarnHrsEnd == null)?"<null>":this.criteriaEarnHrsEnd));
        sb.append(',');
        sb.append("criteriaMajr2");
        sb.append('=');
        sb.append(((this.criteriaMajr2 == null)?"<null>":this.criteriaMajr2));
        sb.append(',');
        sb.append("criteriaMajr1");
        sb.append('=');
        sb.append(((this.criteriaMajr1 == null)?"<null>":this.criteriaMajr1));
        sb.append(',');
        sb.append("criteriaMajr5");
        sb.append('=');
        sb.append(((this.criteriaMajr5 == null)?"<null>":this.criteriaMajr5));
        sb.append(',');
        sb.append("criteriaMajr4");
        sb.append('=');
        sb.append(((this.criteriaMajr4 == null)?"<null>":this.criteriaMajr4));
        sb.append(',');
        sb.append("criteriaMajr3");
        sb.append('=');
        sb.append(((this.criteriaMajr3 == null)?"<null>":this.criteriaMajr3));
        sb.append(',');
        sb.append("criteriaCmpsInclExcl");
        sb.append('=');
        sb.append(((this.criteriaCmpsInclExcl == null)?"<null>":this.criteriaCmpsInclExcl));
        sb.append(',');
        sb.append("degrInclExcl");
        sb.append('=');
        sb.append(((this.degrInclExcl == null)?"<null>":this.degrInclExcl));
        sb.append(',');
        sb.append("criteriaDegr1");
        sb.append('=');
        sb.append(((this.criteriaDegr1 == null)?"<null>":this.criteriaDegr1));
        sb.append(',');
        sb.append("criteriaMajrInclExcl");
        sb.append('=');
        sb.append(((this.criteriaMajrInclExcl == null)?"<null>":this.criteriaMajrInclExcl));
        sb.append(',');
        sb.append("criteriaDegr2");
        sb.append('=');
        sb.append(((this.criteriaDegr2 == null)?"<null>":this.criteriaDegr2));
        sb.append(',');
        sb.append("criteriaDept2");
        sb.append('=');
        sb.append(((this.criteriaDept2 == null)?"<null>":this.criteriaDept2));
        sb.append(',');
        sb.append("criteriaDept3");
        sb.append('=');
        sb.append(((this.criteriaDept3 == null)?"<null>":this.criteriaDept3));
        sb.append(',');
        sb.append("criteriaDept1");
        sb.append('=');
        sb.append(((this.criteriaDept1 == null)?"<null>":this.criteriaDept1));
        sb.append(',');
        sb.append("criteriaDegr5");
        sb.append('=');
        sb.append(((this.criteriaDegr5 == null)?"<null>":this.criteriaDegr5));
        sb.append(',');
        sb.append("criteriaDegr3");
        sb.append('=');
        sb.append(((this.criteriaDegr3 == null)?"<null>":this.criteriaDegr3));
        sb.append(',');
        sb.append("criteriaDegr4");
        sb.append('=');
        sb.append(((this.criteriaDegr4 == null)?"<null>":this.criteriaDegr4));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("criteriaDeptInclExcl");
        sb.append('=');
        sb.append(((this.criteriaDeptInclExcl == null)?"<null>":this.criteriaDeptInclExcl));
        sb.append(',');
        sb.append("majr5");
        sb.append('=');
        sb.append(((this.majr5 == null)?"<null>":this.majr5));
        sb.append(',');
        sb.append("majr4");
        sb.append('=');
        sb.append(((this.majr4 == null)?"<null>":this.majr4));
        sb.append(',');
        sb.append("majr1");
        sb.append('=');
        sb.append(((this.majr1 == null)?"<null>":this.majr1));
        sb.append(',');
        sb.append("majr3");
        sb.append('=');
        sb.append(((this.majr3 == null)?"<null>":this.majr3));
        sb.append(',');
        sb.append("majr2");
        sb.append('=');
        sb.append(((this.majr2 == null)?"<null>":this.majr2));
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
        result = ((result* 31)+((this.levl2 == null)? 0 :this.levl2 .hashCode()));
        result = ((result* 31)+((this.levl1 == null)? 0 :this.levl1 .hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.levl4 == null)? 0 :this.levl4 .hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.levl3 == null)? 0 :this.levl3 .hashCode()));
        result = ((result* 31)+((this.criteriaHourEnd == null)? 0 :this.criteriaHourEnd.hashCode()));
        result = ((result* 31)+((this.levl5 == null)? 0 :this.levl5 .hashCode()));
        result = ((result* 31)+((this.collInclExcl == null)? 0 :this.collInclExcl.hashCode()));
        result = ((result* 31)+((this.studType2 == null)? 0 :this.studType2 .hashCode()));
        result = ((result* 31)+((this.studType3 == null)? 0 :this.studType3 .hashCode()));
        result = ((result* 31)+((this.studType4 == null)? 0 :this.studType4 .hashCode()));
        result = ((result* 31)+((this.studType5 == null)? 0 :this.studType5 .hashCode()));
        result = ((result* 31)+((this.earnHrsEnd == null)? 0 :this.earnHrsEnd.hashCode()));
        result = ((result* 31)+((this.studType1 == null)? 0 :this.studType1 .hashCode()));
        result = ((result* 31)+((this.criteriaCollInclExcl == null)? 0 :this.criteriaCollInclExcl.hashCode()));
        result = ((result* 31)+((this.pinEnd == null)? 0 :this.pinEnd.hashCode()));
        result = ((result* 31)+((this.dept5 == null)? 0 :this.dept5 .hashCode()));
        result = ((result* 31)+((this.hourBegin == null)? 0 :this.hourBegin.hashCode()));
        result = ((result* 31)+((this.lastNamStart == null)? 0 :this.lastNamStart.hashCode()));
        result = ((result* 31)+((this.criteriaCmps5 == null)? 0 :this.criteriaCmps5 .hashCode()));
        result = ((result* 31)+((this.criteriaCmps4 == null)? 0 :this.criteriaCmps4 .hashCode()));
        result = ((result* 31)+((this.degr1 == null)? 0 :this.degr1 .hashCode()));
        result = ((result* 31)+((this.degr2 == null)? 0 :this.degr2 .hashCode()));
        result = ((result* 31)+((this.criteriaMajr1 == null)? 0 :this.criteriaMajr1 .hashCode()));
        result = ((result* 31)+((this.degr3 == null)? 0 :this.degr3 .hashCode()));
        result = ((result* 31)+((this.criteriaMajr2 == null)? 0 :this.criteriaMajr2 .hashCode()));
        result = ((result* 31)+((this.degr4 == null)? 0 :this.degr4 .hashCode()));
        result = ((result* 31)+((this.criteriaMajr3 == null)? 0 :this.criteriaMajr3 .hashCode()));
        result = ((result* 31)+((this.degr5 == null)? 0 :this.degr5 .hashCode()));
        result = ((result* 31)+((this.criteriaMajr4 == null)? 0 :this.criteriaMajr4 .hashCode()));
        result = ((result* 31)+((this.criteriaLastNamStart == null)? 0 :this.criteriaLastNamStart.hashCode()));
        result = ((result* 31)+((this.criteriaMajr5 == null)? 0 :this.criteriaMajr5 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dept1 == null)? 0 :this.dept1 .hashCode()));
        result = ((result* 31)+((this.criteriaCmps1 == null)? 0 :this.criteriaCmps1 .hashCode()));
        result = ((result* 31)+((this.dept2 == null)? 0 :this.dept2 .hashCode()));
        result = ((result* 31)+((this.dept3 == null)? 0 :this.dept3 .hashCode()));
        result = ((result* 31)+((this.criteriaCmps3 == null)? 0 :this.criteriaCmps3 .hashCode()));
        result = ((result* 31)+((this.dept4 == null)? 0 :this.dept4 .hashCode()));
        result = ((result* 31)+((this.criteriaCmps2 == null)? 0 :this.criteriaCmps2 .hashCode()));
        result = ((result* 31)+((this.cmps3 == null)? 0 :this.cmps3 .hashCode()));
        result = ((result* 31)+((this.cmps4 == null)? 0 :this.cmps4 .hashCode()));
        result = ((result* 31)+((this.cmps1 == null)? 0 :this.cmps1 .hashCode()));
        result = ((result* 31)+((this.cmps2 == null)? 0 :this.cmps2 .hashCode()));
        result = ((result* 31)+((this.clsInclExcl == null)? 0 :this.clsInclExcl.hashCode()));
        result = ((result* 31)+((this.criteriaStudType1 == null)? 0 :this.criteriaStudType1 .hashCode()));
        result = ((result* 31)+((this.criteriaStudType2 == null)? 0 :this.criteriaStudType2 .hashCode()));
        result = ((result* 31)+((this.criteriaStudType3 == null)? 0 :this.criteriaStudType3 .hashCode()));
        result = ((result* 31)+((this.criteriaStudType4 == null)? 0 :this.criteriaStudType4 .hashCode()));
        result = ((result* 31)+((this.criteriaStudType5 == null)? 0 :this.criteriaStudType5 .hashCode()));
        result = ((result* 31)+((this.cmps5 == null)? 0 :this.cmps5 .hashCode()));
        result = ((result* 31)+((this.criteriaColl5 == null)? 0 :this.criteriaColl5 .hashCode()));
        result = ((result* 31)+((this.criteriaColl3 == null)? 0 :this.criteriaColl3 .hashCode()));
        result = ((result* 31)+((this.criteriaBeginDate == null)? 0 :this.criteriaBeginDate.hashCode()));
        result = ((result* 31)+((this.criteriaColl4 == null)? 0 :this.criteriaColl4 .hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeHost == null)? 0 :this.criteriaTermCodeHost.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaColl1 == null)? 0 :this.criteriaColl1 .hashCode()));
        result = ((result* 31)+((this.criteriaColl2 == null)? 0 :this.criteriaColl2 .hashCode()));
        result = ((result* 31)+((this.coll3 == null)? 0 :this.coll3 .hashCode()));
        result = ((result* 31)+((this.criteriaPinEnd == null)? 0 :this.criteriaPinEnd.hashCode()));
        result = ((result* 31)+((this.coll2 == null)? 0 :this.coll2 .hashCode()));
        result = ((result* 31)+((this.coll1 == null)? 0 :this.coll1 .hashCode()));
        result = ((result* 31)+((this.cls4 == null)? 0 :this.cls4 .hashCode()));
        result = ((result* 31)+((this.criteriaDegr2 == null)? 0 :this.criteriaDegr2 .hashCode()));
        result = ((result* 31)+((this.cls5 == null)? 0 :this.cls5 .hashCode()));
        result = ((result* 31)+((this.criteriaDegr1 == null)? 0 :this.criteriaDegr1 .hashCode()));
        result = ((result* 31)+((this.cls2 == null)? 0 :this.cls2 .hashCode()));
        result = ((result* 31)+((this.cls3 == null)? 0 :this.cls3 .hashCode()));
        result = ((result* 31)+((this.termCodeHost == null)? 0 :this.termCodeHost.hashCode()));
        result = ((result* 31)+((this.cls1 == null)? 0 :this.cls1 .hashCode()));
        result = ((result* 31)+((this.criteriaDegr5 == null)? 0 :this.criteriaDegr5 .hashCode()));
        result = ((result* 31)+((this.criteriaDegr4 == null)? 0 :this.criteriaDegr4 .hashCode()));
        result = ((result* 31)+((this.criteriaDegr3 == null)? 0 :this.criteriaDegr3 .hashCode()));
        result = ((result* 31)+((this.criteriaDept3 == null)? 0 :this.criteriaDept3 .hashCode()));
        result = ((result* 31)+((this.criteriaDept2 == null)? 0 :this.criteriaDept2 .hashCode()));
        result = ((result* 31)+((this.coll5 == null)? 0 :this.coll5 .hashCode()));
        result = ((result* 31)+((this.criteriaDept1 == null)? 0 :this.criteriaDept1 .hashCode()));
        result = ((result* 31)+((this.coll4 == null)? 0 :this.coll4 .hashCode()));
        result = ((result* 31)+((this.criteriaLevl2 == null)? 0 :this.criteriaLevl2 .hashCode()));
        result = ((result* 31)+((this.criteriaLevl3 == null)? 0 :this.criteriaLevl3 .hashCode()));
        result = ((result* 31)+((this.criteriaLevl4 == null)? 0 :this.criteriaLevl4 .hashCode()));
        result = ((result* 31)+((this.criteriaDept5 == null)? 0 :this.criteriaDept5 .hashCode()));
        result = ((result* 31)+((this.criteriaLevl5 == null)? 0 :this.criteriaLevl5 .hashCode()));
        result = ((result* 31)+((this.criteriaDept4 == null)? 0 :this.criteriaDept4 .hashCode()));
        result = ((result* 31)+((this.criteriaLevl1 == null)? 0 :this.criteriaLevl1 .hashCode()));
        result = ((result* 31)+((this.criteriaHourBegin == null)? 0 :this.criteriaHourBegin.hashCode()));
        result = ((result* 31)+((this.criteriaMajrInclExcl == null)? 0 :this.criteriaMajrInclExcl.hashCode()));
        result = ((result* 31)+((this.criteriaClsInclExcl == null)? 0 :this.criteriaClsInclExcl.hashCode()));
        result = ((result* 31)+((this.lastNamEnd == null)? 0 :this.lastNamEnd.hashCode()));
        result = ((result* 31)+((this.majrInclExcl == null)? 0 :this.majrInclExcl.hashCode()));
        result = ((result* 31)+((this.pinStart == null)? 0 :this.pinStart.hashCode()));
        result = ((result* 31)+((this.criteriaDegrInclExcl == null)? 0 :this.criteriaDegrInclExcl.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNo == null)? 0 :this.criteriaSeqNo.hashCode()));
        result = ((result* 31)+((this.earnHrsBegin == null)? 0 :this.earnHrsBegin.hashCode()));
        result = ((result* 31)+((this.hourEnd == null)? 0 :this.hourEnd.hashCode()));
        result = ((result* 31)+((this.criteriaEarnHrsBegin == null)? 0 :this.criteriaEarnHrsBegin.hashCode()));
        result = ((result* 31)+((this.deptInclExcl == null)? 0 :this.deptInclExcl.hashCode()));
        result = ((result* 31)+((this.cmpsInclExcl == null)? 0 :this.cmpsInclExcl.hashCode()));
        result = ((result* 31)+((this.criteriaLastNamEnd == null)? 0 :this.criteriaLastNamEnd.hashCode()));
        result = ((result* 31)+((this.criteriaCmpsInclExcl == null)? 0 :this.criteriaCmpsInclExcl.hashCode()));
        result = ((result* 31)+((this.criteriaEarnHrsEnd == null)? 0 :this.criteriaEarnHrsEnd.hashCode()));
        result = ((result* 31)+((this.degrInclExcl == null)? 0 :this.degrInclExcl.hashCode()));
        result = ((result* 31)+((this.criteriaCls4 == null)? 0 :this.criteriaCls4 .hashCode()));
        result = ((result* 31)+((this.criteriaCls3 == null)? 0 :this.criteriaCls3 .hashCode()));
        result = ((result* 31)+((this.criteriaCls5 == null)? 0 :this.criteriaCls5 .hashCode()));
        result = ((result* 31)+((this.criteriaCls2 == null)? 0 :this.criteriaCls2 .hashCode()));
        result = ((result* 31)+((this.criteriaCls1 == null)? 0 :this.criteriaCls1 .hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.majr5 == null)? 0 :this.majr5 .hashCode()));
        result = ((result* 31)+((this.criteriaPinStart == null)? 0 :this.criteriaPinStart.hashCode()));
        result = ((result* 31)+((this.majr4 == null)? 0 :this.majr4 .hashCode()));
        result = ((result* 31)+((this.majr1 == null)? 0 :this.majr1 .hashCode()));
        result = ((result* 31)+((this.criteriaDeptInclExcl == null)? 0 :this.criteriaDeptInclExcl.hashCode()));
        result = ((result* 31)+((this.majr3 == null)? 0 :this.majr3 .hashCode()));
        result = ((result* 31)+((this.majr2 == null)? 0 :this.majr2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyRegistrationTimeControls100PutRequest) == false) {
            return false;
        }
        ThirdPartyRegistrationTimeControls100PutRequest rhs = ((ThirdPartyRegistrationTimeControls100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.levl2 == rhs.levl2)||((this.levl2 != null)&&this.levl2 .equals(rhs.levl2)))&&((this.levl1 == rhs.levl1)||((this.levl1 != null)&&this.levl1 .equals(rhs.levl1))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.levl4 == rhs.levl4)||((this.levl4 != null)&&this.levl4 .equals(rhs.levl4))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.levl3 == rhs.levl3)||((this.levl3 != null)&&this.levl3 .equals(rhs.levl3))))&&((this.criteriaHourEnd == rhs.criteriaHourEnd)||((this.criteriaHourEnd!= null)&&this.criteriaHourEnd.equals(rhs.criteriaHourEnd))))&&((this.levl5 == rhs.levl5)||((this.levl5 != null)&&this.levl5 .equals(rhs.levl5))))&&((this.collInclExcl == rhs.collInclExcl)||((this.collInclExcl!= null)&&this.collInclExcl.equals(rhs.collInclExcl))))&&((this.studType2 == rhs.studType2)||((this.studType2 != null)&&this.studType2 .equals(rhs.studType2))))&&((this.studType3 == rhs.studType3)||((this.studType3 != null)&&this.studType3 .equals(rhs.studType3))))&&((this.studType4 == rhs.studType4)||((this.studType4 != null)&&this.studType4 .equals(rhs.studType4))))&&((this.studType5 == rhs.studType5)||((this.studType5 != null)&&this.studType5 .equals(rhs.studType5))))&&((this.earnHrsEnd == rhs.earnHrsEnd)||((this.earnHrsEnd!= null)&&this.earnHrsEnd.equals(rhs.earnHrsEnd))))&&((this.studType1 == rhs.studType1)||((this.studType1 != null)&&this.studType1 .equals(rhs.studType1))))&&((this.criteriaCollInclExcl == rhs.criteriaCollInclExcl)||((this.criteriaCollInclExcl!= null)&&this.criteriaCollInclExcl.equals(rhs.criteriaCollInclExcl))))&&((this.pinEnd == rhs.pinEnd)||((this.pinEnd!= null)&&this.pinEnd.equals(rhs.pinEnd))))&&((this.dept5 == rhs.dept5)||((this.dept5 != null)&&this.dept5 .equals(rhs.dept5))))&&((this.hourBegin == rhs.hourBegin)||((this.hourBegin!= null)&&this.hourBegin.equals(rhs.hourBegin))))&&((this.lastNamStart == rhs.lastNamStart)||((this.lastNamStart!= null)&&this.lastNamStart.equals(rhs.lastNamStart))))&&((this.criteriaCmps5 == rhs.criteriaCmps5)||((this.criteriaCmps5 != null)&&this.criteriaCmps5 .equals(rhs.criteriaCmps5))))&&((this.criteriaCmps4 == rhs.criteriaCmps4)||((this.criteriaCmps4 != null)&&this.criteriaCmps4 .equals(rhs.criteriaCmps4))))&&((this.degr1 == rhs.degr1)||((this.degr1 != null)&&this.degr1 .equals(rhs.degr1))))&&((this.degr2 == rhs.degr2)||((this.degr2 != null)&&this.degr2 .equals(rhs.degr2))))&&((this.criteriaMajr1 == rhs.criteriaMajr1)||((this.criteriaMajr1 != null)&&this.criteriaMajr1 .equals(rhs.criteriaMajr1))))&&((this.degr3 == rhs.degr3)||((this.degr3 != null)&&this.degr3 .equals(rhs.degr3))))&&((this.criteriaMajr2 == rhs.criteriaMajr2)||((this.criteriaMajr2 != null)&&this.criteriaMajr2 .equals(rhs.criteriaMajr2))))&&((this.degr4 == rhs.degr4)||((this.degr4 != null)&&this.degr4 .equals(rhs.degr4))))&&((this.criteriaMajr3 == rhs.criteriaMajr3)||((this.criteriaMajr3 != null)&&this.criteriaMajr3 .equals(rhs.criteriaMajr3))))&&((this.degr5 == rhs.degr5)||((this.degr5 != null)&&this.degr5 .equals(rhs.degr5))))&&((this.criteriaMajr4 == rhs.criteriaMajr4)||((this.criteriaMajr4 != null)&&this.criteriaMajr4 .equals(rhs.criteriaMajr4))))&&((this.criteriaLastNamStart == rhs.criteriaLastNamStart)||((this.criteriaLastNamStart!= null)&&this.criteriaLastNamStart.equals(rhs.criteriaLastNamStart))))&&((this.criteriaMajr5 == rhs.criteriaMajr5)||((this.criteriaMajr5 != null)&&this.criteriaMajr5 .equals(rhs.criteriaMajr5))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dept1 == rhs.dept1)||((this.dept1 != null)&&this.dept1 .equals(rhs.dept1))))&&((this.criteriaCmps1 == rhs.criteriaCmps1)||((this.criteriaCmps1 != null)&&this.criteriaCmps1 .equals(rhs.criteriaCmps1))))&&((this.dept2 == rhs.dept2)||((this.dept2 != null)&&this.dept2 .equals(rhs.dept2))))&&((this.dept3 == rhs.dept3)||((this.dept3 != null)&&this.dept3 .equals(rhs.dept3))))&&((this.criteriaCmps3 == rhs.criteriaCmps3)||((this.criteriaCmps3 != null)&&this.criteriaCmps3 .equals(rhs.criteriaCmps3))))&&((this.dept4 == rhs.dept4)||((this.dept4 != null)&&this.dept4 .equals(rhs.dept4))))&&((this.criteriaCmps2 == rhs.criteriaCmps2)||((this.criteriaCmps2 != null)&&this.criteriaCmps2 .equals(rhs.criteriaCmps2))))&&((this.cmps3 == rhs.cmps3)||((this.cmps3 != null)&&this.cmps3 .equals(rhs.cmps3))))&&((this.cmps4 == rhs.cmps4)||((this.cmps4 != null)&&this.cmps4 .equals(rhs.cmps4))))&&((this.cmps1 == rhs.cmps1)||((this.cmps1 != null)&&this.cmps1 .equals(rhs.cmps1))))&&((this.cmps2 == rhs.cmps2)||((this.cmps2 != null)&&this.cmps2 .equals(rhs.cmps2))))&&((this.clsInclExcl == rhs.clsInclExcl)||((this.clsInclExcl!= null)&&this.clsInclExcl.equals(rhs.clsInclExcl))))&&((this.criteriaStudType1 == rhs.criteriaStudType1)||((this.criteriaStudType1 != null)&&this.criteriaStudType1 .equals(rhs.criteriaStudType1))))&&((this.criteriaStudType2 == rhs.criteriaStudType2)||((this.criteriaStudType2 != null)&&this.criteriaStudType2 .equals(rhs.criteriaStudType2))))&&((this.criteriaStudType3 == rhs.criteriaStudType3)||((this.criteriaStudType3 != null)&&this.criteriaStudType3 .equals(rhs.criteriaStudType3))))&&((this.criteriaStudType4 == rhs.criteriaStudType4)||((this.criteriaStudType4 != null)&&this.criteriaStudType4 .equals(rhs.criteriaStudType4))))&&((this.criteriaStudType5 == rhs.criteriaStudType5)||((this.criteriaStudType5 != null)&&this.criteriaStudType5 .equals(rhs.criteriaStudType5))))&&((this.cmps5 == rhs.cmps5)||((this.cmps5 != null)&&this.cmps5 .equals(rhs.cmps5))))&&((this.criteriaColl5 == rhs.criteriaColl5)||((this.criteriaColl5 != null)&&this.criteriaColl5 .equals(rhs.criteriaColl5))))&&((this.criteriaColl3 == rhs.criteriaColl3)||((this.criteriaColl3 != null)&&this.criteriaColl3 .equals(rhs.criteriaColl3))))&&((this.criteriaBeginDate == rhs.criteriaBeginDate)||((this.criteriaBeginDate!= null)&&this.criteriaBeginDate.equals(rhs.criteriaBeginDate))))&&((this.criteriaColl4 == rhs.criteriaColl4)||((this.criteriaColl4 != null)&&this.criteriaColl4 .equals(rhs.criteriaColl4))))&&((this.criteriaTermCodeHost == rhs.criteriaTermCodeHost)||((this.criteriaTermCodeHost!= null)&&this.criteriaTermCodeHost.equals(rhs.criteriaTermCodeHost))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.criteriaColl1 == rhs.criteriaColl1)||((this.criteriaColl1 != null)&&this.criteriaColl1 .equals(rhs.criteriaColl1))))&&((this.criteriaColl2 == rhs.criteriaColl2)||((this.criteriaColl2 != null)&&this.criteriaColl2 .equals(rhs.criteriaColl2))))&&((this.coll3 == rhs.coll3)||((this.coll3 != null)&&this.coll3 .equals(rhs.coll3))))&&((this.criteriaPinEnd == rhs.criteriaPinEnd)||((this.criteriaPinEnd!= null)&&this.criteriaPinEnd.equals(rhs.criteriaPinEnd))))&&((this.coll2 == rhs.coll2)||((this.coll2 != null)&&this.coll2 .equals(rhs.coll2))))&&((this.coll1 == rhs.coll1)||((this.coll1 != null)&&this.coll1 .equals(rhs.coll1))))&&((this.cls4 == rhs.cls4)||((this.cls4 != null)&&this.cls4 .equals(rhs.cls4))))&&((this.criteriaDegr2 == rhs.criteriaDegr2)||((this.criteriaDegr2 != null)&&this.criteriaDegr2 .equals(rhs.criteriaDegr2))))&&((this.cls5 == rhs.cls5)||((this.cls5 != null)&&this.cls5 .equals(rhs.cls5))))&&((this.criteriaDegr1 == rhs.criteriaDegr1)||((this.criteriaDegr1 != null)&&this.criteriaDegr1 .equals(rhs.criteriaDegr1))))&&((this.cls2 == rhs.cls2)||((this.cls2 != null)&&this.cls2 .equals(rhs.cls2))))&&((this.cls3 == rhs.cls3)||((this.cls3 != null)&&this.cls3 .equals(rhs.cls3))))&&((this.termCodeHost == rhs.termCodeHost)||((this.termCodeHost!= null)&&this.termCodeHost.equals(rhs.termCodeHost))))&&((this.cls1 == rhs.cls1)||((this.cls1 != null)&&this.cls1 .equals(rhs.cls1))))&&((this.criteriaDegr5 == rhs.criteriaDegr5)||((this.criteriaDegr5 != null)&&this.criteriaDegr5 .equals(rhs.criteriaDegr5))))&&((this.criteriaDegr4 == rhs.criteriaDegr4)||((this.criteriaDegr4 != null)&&this.criteriaDegr4 .equals(rhs.criteriaDegr4))))&&((this.criteriaDegr3 == rhs.criteriaDegr3)||((this.criteriaDegr3 != null)&&this.criteriaDegr3 .equals(rhs.criteriaDegr3))))&&((this.criteriaDept3 == rhs.criteriaDept3)||((this.criteriaDept3 != null)&&this.criteriaDept3 .equals(rhs.criteriaDept3))))&&((this.criteriaDept2 == rhs.criteriaDept2)||((this.criteriaDept2 != null)&&this.criteriaDept2 .equals(rhs.criteriaDept2))))&&((this.coll5 == rhs.coll5)||((this.coll5 != null)&&this.coll5 .equals(rhs.coll5))))&&((this.criteriaDept1 == rhs.criteriaDept1)||((this.criteriaDept1 != null)&&this.criteriaDept1 .equals(rhs.criteriaDept1))))&&((this.coll4 == rhs.coll4)||((this.coll4 != null)&&this.coll4 .equals(rhs.coll4))))&&((this.criteriaLevl2 == rhs.criteriaLevl2)||((this.criteriaLevl2 != null)&&this.criteriaLevl2 .equals(rhs.criteriaLevl2))))&&((this.criteriaLevl3 == rhs.criteriaLevl3)||((this.criteriaLevl3 != null)&&this.criteriaLevl3 .equals(rhs.criteriaLevl3))))&&((this.criteriaLevl4 == rhs.criteriaLevl4)||((this.criteriaLevl4 != null)&&this.criteriaLevl4 .equals(rhs.criteriaLevl4))))&&((this.criteriaDept5 == rhs.criteriaDept5)||((this.criteriaDept5 != null)&&this.criteriaDept5 .equals(rhs.criteriaDept5))))&&((this.criteriaLevl5 == rhs.criteriaLevl5)||((this.criteriaLevl5 != null)&&this.criteriaLevl5 .equals(rhs.criteriaLevl5))))&&((this.criteriaDept4 == rhs.criteriaDept4)||((this.criteriaDept4 != null)&&this.criteriaDept4 .equals(rhs.criteriaDept4))))&&((this.criteriaLevl1 == rhs.criteriaLevl1)||((this.criteriaLevl1 != null)&&this.criteriaLevl1 .equals(rhs.criteriaLevl1))))&&((this.criteriaHourBegin == rhs.criteriaHourBegin)||((this.criteriaHourBegin!= null)&&this.criteriaHourBegin.equals(rhs.criteriaHourBegin))))&&((this.criteriaMajrInclExcl == rhs.criteriaMajrInclExcl)||((this.criteriaMajrInclExcl!= null)&&this.criteriaMajrInclExcl.equals(rhs.criteriaMajrInclExcl))))&&((this.criteriaClsInclExcl == rhs.criteriaClsInclExcl)||((this.criteriaClsInclExcl!= null)&&this.criteriaClsInclExcl.equals(rhs.criteriaClsInclExcl))))&&((this.lastNamEnd == rhs.lastNamEnd)||((this.lastNamEnd!= null)&&this.lastNamEnd.equals(rhs.lastNamEnd))))&&((this.majrInclExcl == rhs.majrInclExcl)||((this.majrInclExcl!= null)&&this.majrInclExcl.equals(rhs.majrInclExcl))))&&((this.pinStart == rhs.pinStart)||((this.pinStart!= null)&&this.pinStart.equals(rhs.pinStart))))&&((this.criteriaDegrInclExcl == rhs.criteriaDegrInclExcl)||((this.criteriaDegrInclExcl!= null)&&this.criteriaDegrInclExcl.equals(rhs.criteriaDegrInclExcl))))&&((this.criteriaSeqNo == rhs.criteriaSeqNo)||((this.criteriaSeqNo!= null)&&this.criteriaSeqNo.equals(rhs.criteriaSeqNo))))&&((this.earnHrsBegin == rhs.earnHrsBegin)||((this.earnHrsBegin!= null)&&this.earnHrsBegin.equals(rhs.earnHrsBegin))))&&((this.hourEnd == rhs.hourEnd)||((this.hourEnd!= null)&&this.hourEnd.equals(rhs.hourEnd))))&&((this.criteriaEarnHrsBegin == rhs.criteriaEarnHrsBegin)||((this.criteriaEarnHrsBegin!= null)&&this.criteriaEarnHrsBegin.equals(rhs.criteriaEarnHrsBegin))))&&((this.deptInclExcl == rhs.deptInclExcl)||((this.deptInclExcl!= null)&&this.deptInclExcl.equals(rhs.deptInclExcl))))&&((this.cmpsInclExcl == rhs.cmpsInclExcl)||((this.cmpsInclExcl!= null)&&this.cmpsInclExcl.equals(rhs.cmpsInclExcl))))&&((this.criteriaLastNamEnd == rhs.criteriaLastNamEnd)||((this.criteriaLastNamEnd!= null)&&this.criteriaLastNamEnd.equals(rhs.criteriaLastNamEnd))))&&((this.criteriaCmpsInclExcl == rhs.criteriaCmpsInclExcl)||((this.criteriaCmpsInclExcl!= null)&&this.criteriaCmpsInclExcl.equals(rhs.criteriaCmpsInclExcl))))&&((this.criteriaEarnHrsEnd == rhs.criteriaEarnHrsEnd)||((this.criteriaEarnHrsEnd!= null)&&this.criteriaEarnHrsEnd.equals(rhs.criteriaEarnHrsEnd))))&&((this.degrInclExcl == rhs.degrInclExcl)||((this.degrInclExcl!= null)&&this.degrInclExcl.equals(rhs.degrInclExcl))))&&((this.criteriaCls4 == rhs.criteriaCls4)||((this.criteriaCls4 != null)&&this.criteriaCls4 .equals(rhs.criteriaCls4))))&&((this.criteriaCls3 == rhs.criteriaCls3)||((this.criteriaCls3 != null)&&this.criteriaCls3 .equals(rhs.criteriaCls3))))&&((this.criteriaCls5 == rhs.criteriaCls5)||((this.criteriaCls5 != null)&&this.criteriaCls5 .equals(rhs.criteriaCls5))))&&((this.criteriaCls2 == rhs.criteriaCls2)||((this.criteriaCls2 != null)&&this.criteriaCls2 .equals(rhs.criteriaCls2))))&&((this.criteriaCls1 == rhs.criteriaCls1)||((this.criteriaCls1 != null)&&this.criteriaCls1 .equals(rhs.criteriaCls1))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.majr5 == rhs.majr5)||((this.majr5 != null)&&this.majr5 .equals(rhs.majr5))))&&((this.criteriaPinStart == rhs.criteriaPinStart)||((this.criteriaPinStart!= null)&&this.criteriaPinStart.equals(rhs.criteriaPinStart))))&&((this.majr4 == rhs.majr4)||((this.majr4 != null)&&this.majr4 .equals(rhs.majr4))))&&((this.majr1 == rhs.majr1)||((this.majr1 != null)&&this.majr1 .equals(rhs.majr1))))&&((this.criteriaDeptInclExcl == rhs.criteriaDeptInclExcl)||((this.criteriaDeptInclExcl!= null)&&this.criteriaDeptInclExcl.equals(rhs.criteriaDeptInclExcl))))&&((this.majr3 == rhs.majr3)||((this.majr3 != null)&&this.majr3 .equals(rhs.majr3))))&&((this.majr2 == rhs.majr2)||((this.majr2 != null)&&this.majr2 .equals(rhs.majr2))));
    }

}
