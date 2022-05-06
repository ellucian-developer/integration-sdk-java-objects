
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
    "levl4",
    "seqNo",
    "endDate",
    "levl3",
    "levl5",
    "collInclExcl",
    "lastNamEnd",
    "studType2",
    "majrInclExcl",
    "studType3",
    "studType4",
    "studType5",
    "earnHrsEnd",
    "studType1",
    "pinEnd",
    "dept5",
    "pinStart",
    "hourBegin",
    "lastNamStart",
    "degr1",
    "degr2",
    "degr3",
    "degr4",
    "degr5",
    "earnHrsBegin",
    "dept1",
    "dept2",
    "dept3",
    "dept4",
    "cmps3",
    "hourEnd",
    "cmps4",
    "cmps1",
    "cmps2",
    "clsInclExcl",
    "deptInclExcl",
    "stvtermDesc",
    "cmps5",
    "cmpsInclExcl",
    "degrInclExcl",
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
    "beginDate",
    "majr5",
    "majr4",
    "majr1",
    "majr3",
    "majr2"
})
@Generated("jsonschema2pojo")
public class ThirdPartyRegistrationTimeControls100PutResponse {

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
     * Fourth Student Level
     * <p>
     * Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levl4")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LEVL_4, Lookup lineage reference object : stvlevl")
    private String levl4;
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
     * Ending Last Name
     * <p>
     * Lineage reference object : SFRCTRL_LAST_NAM_END
     * 
     */
    @JsonProperty("lastNamEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_LAST_NAM_END")
    private String lastNamEnd;
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
     * Major Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_MAJR_INCL_EXCL
     * 
     */
    @JsonProperty("majrInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_MAJR_INCL_EXCL")
    private String majrInclExcl;
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
     * Starting PIN
     * <p>
     * Lineage reference object : SFRCTRL_PIN_START
     * 
     */
    @JsonProperty("pinStart")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_PIN_START")
    private Double pinStart;
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
     * Earned Hours Begin
     * <p>
     * Lineage reference object : SFRCTRL_EARN_HRS_BEGIN
     * 
     */
    @JsonProperty("earnHrsBegin")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_EARN_HRS_BEGIN")
    private Double earnHrsBegin;
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
     * End Time
     * <p>
     * Lineage reference object : SFRCTRL_HOUR_END
     * 
     */
    @JsonProperty("hourEnd")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_HOUR_END")
    private String hourEnd;
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
     * Department Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_DEPT_INCL_EXCL
     * 
     */
    @JsonProperty("deptInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_DEPT_INCL_EXCL")
    private String deptInclExcl;
    @JsonProperty("stvtermDesc")
    private String stvtermDesc;
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
     * Campus Include/Exclude
     * <p>
     * Lineage reference object : SFRCTRL_CMPS_INCL_EXCL
     * 
     */
    @JsonProperty("cmpsInclExcl")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_CMPS_INCL_EXCL")
    private String cmpsInclExcl;
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
     * Begin Date
     * <p>
     * Lineage reference object : SFRCTRL_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : SFRCTRL_BEGIN_DATE")
    private Date beginDate;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withLevl2(String levl2) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withLevl1(String levl1) {
        this.levl1 = levl1;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withLevl4(String levl4) {
        this.levl4 = levl4;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withEndDate(Date endDate) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withLevl3(String levl3) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withLevl5(String levl5) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCollInclExcl(String collInclExcl) {
        this.collInclExcl = collInclExcl;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withLastNamEnd(String lastNamEnd) {
        this.lastNamEnd = lastNamEnd;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withStudType2(String studType2) {
        this.studType2 = studType2;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withMajrInclExcl(String majrInclExcl) {
        this.majrInclExcl = majrInclExcl;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withStudType3(String studType3) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withStudType4(String studType4) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withStudType5(String studType5) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withEarnHrsEnd(Double earnHrsEnd) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withStudType1(String studType1) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withPinEnd(Double pinEnd) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDept5(String dept5) {
        this.dept5 = dept5;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withPinStart(Double pinStart) {
        this.pinStart = pinStart;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withHourBegin(String hourBegin) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withLastNamStart(String lastNamStart) {
        this.lastNamStart = lastNamStart;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDegr1(String degr1) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDegr2(String degr2) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDegr3(String degr3) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDegr4(String degr4) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDegr5(String degr5) {
        this.degr5 = degr5;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withEarnHrsBegin(Double earnHrsBegin) {
        this.earnHrsBegin = earnHrsBegin;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDept1(String dept1) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDept2(String dept2) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDept3(String dept3) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDept4(String dept4) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCmps3(String cmps3) {
        this.cmps3 = cmps3;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCmps4(String cmps4) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCmps1(String cmps1) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCmps2(String cmps2) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withClsInclExcl(String clsInclExcl) {
        this.clsInclExcl = clsInclExcl;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDeptInclExcl(String deptInclExcl) {
        this.deptInclExcl = deptInclExcl;
        return this;
    }

    @JsonProperty("stvtermDesc")
    public String getStvtermDesc() {
        return stvtermDesc;
    }

    @JsonProperty("stvtermDesc")
    public void setStvtermDesc(String stvtermDesc) {
        this.stvtermDesc = stvtermDesc;
    }

    public ThirdPartyRegistrationTimeControls100PutResponse withStvtermDesc(String stvtermDesc) {
        this.stvtermDesc = stvtermDesc;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCmps5(String cmps5) {
        this.cmps5 = cmps5;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCmpsInclExcl(String cmpsInclExcl) {
        this.cmpsInclExcl = cmpsInclExcl;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withDegrInclExcl(String degrInclExcl) {
        this.degrInclExcl = degrInclExcl;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withColl3(String coll3) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withColl2(String coll2) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withColl1(String coll1) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCls4(String cls4) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCls5(String cls5) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCls2(String cls2) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCls3(String cls3) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withTermCodeHost(String termCodeHost) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withCls1(String cls1) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withColl5(String coll5) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withColl4(String coll4) {
        this.coll4 = coll4;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
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

    public ThirdPartyRegistrationTimeControls100PutResponse withMajr5(String majr5) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withMajr4(String majr4) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withMajr1(String majr1) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withMajr3(String majr3) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withMajr2(String majr2) {
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

    public ThirdPartyRegistrationTimeControls100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyRegistrationTimeControls100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("levl2");
        sb.append('=');
        sb.append(((this.levl2 == null)?"<null>":this.levl2));
        sb.append(',');
        sb.append("levl1");
        sb.append('=');
        sb.append(((this.levl1 == null)?"<null>":this.levl1));
        sb.append(',');
        sb.append("levl4");
        sb.append('=');
        sb.append(((this.levl4 == null)?"<null>":this.levl4));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
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
        sb.append("lastNamEnd");
        sb.append('=');
        sb.append(((this.lastNamEnd == null)?"<null>":this.lastNamEnd));
        sb.append(',');
        sb.append("studType2");
        sb.append('=');
        sb.append(((this.studType2 == null)?"<null>":this.studType2));
        sb.append(',');
        sb.append("majrInclExcl");
        sb.append('=');
        sb.append(((this.majrInclExcl == null)?"<null>":this.majrInclExcl));
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
        sb.append("pinStart");
        sb.append('=');
        sb.append(((this.pinStart == null)?"<null>":this.pinStart));
        sb.append(',');
        sb.append("hourBegin");
        sb.append('=');
        sb.append(((this.hourBegin == null)?"<null>":this.hourBegin));
        sb.append(',');
        sb.append("lastNamStart");
        sb.append('=');
        sb.append(((this.lastNamStart == null)?"<null>":this.lastNamStart));
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
        sb.append("earnHrsBegin");
        sb.append('=');
        sb.append(((this.earnHrsBegin == null)?"<null>":this.earnHrsBegin));
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
        sb.append("hourEnd");
        sb.append('=');
        sb.append(((this.hourEnd == null)?"<null>":this.hourEnd));
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
        sb.append("deptInclExcl");
        sb.append('=');
        sb.append(((this.deptInclExcl == null)?"<null>":this.deptInclExcl));
        sb.append(',');
        sb.append("stvtermDesc");
        sb.append('=');
        sb.append(((this.stvtermDesc == null)?"<null>":this.stvtermDesc));
        sb.append(',');
        sb.append("cmps5");
        sb.append('=');
        sb.append(((this.cmps5 == null)?"<null>":this.cmps5));
        sb.append(',');
        sb.append("cmpsInclExcl");
        sb.append('=');
        sb.append(((this.cmpsInclExcl == null)?"<null>":this.cmpsInclExcl));
        sb.append(',');
        sb.append("degrInclExcl");
        sb.append('=');
        sb.append(((this.degrInclExcl == null)?"<null>":this.degrInclExcl));
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
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
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
        result = ((result* 31)+((this.levl4 == null)? 0 :this.levl4 .hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.levl3 == null)? 0 :this.levl3 .hashCode()));
        result = ((result* 31)+((this.levl5 == null)? 0 :this.levl5 .hashCode()));
        result = ((result* 31)+((this.collInclExcl == null)? 0 :this.collInclExcl.hashCode()));
        result = ((result* 31)+((this.lastNamEnd == null)? 0 :this.lastNamEnd.hashCode()));
        result = ((result* 31)+((this.studType2 == null)? 0 :this.studType2 .hashCode()));
        result = ((result* 31)+((this.majrInclExcl == null)? 0 :this.majrInclExcl.hashCode()));
        result = ((result* 31)+((this.studType3 == null)? 0 :this.studType3 .hashCode()));
        result = ((result* 31)+((this.studType4 == null)? 0 :this.studType4 .hashCode()));
        result = ((result* 31)+((this.studType5 == null)? 0 :this.studType5 .hashCode()));
        result = ((result* 31)+((this.earnHrsEnd == null)? 0 :this.earnHrsEnd.hashCode()));
        result = ((result* 31)+((this.studType1 == null)? 0 :this.studType1 .hashCode()));
        result = ((result* 31)+((this.pinEnd == null)? 0 :this.pinEnd.hashCode()));
        result = ((result* 31)+((this.dept5 == null)? 0 :this.dept5 .hashCode()));
        result = ((result* 31)+((this.pinStart == null)? 0 :this.pinStart.hashCode()));
        result = ((result* 31)+((this.hourBegin == null)? 0 :this.hourBegin.hashCode()));
        result = ((result* 31)+((this.lastNamStart == null)? 0 :this.lastNamStart.hashCode()));
        result = ((result* 31)+((this.degr1 == null)? 0 :this.degr1 .hashCode()));
        result = ((result* 31)+((this.degr2 == null)? 0 :this.degr2 .hashCode()));
        result = ((result* 31)+((this.degr3 == null)? 0 :this.degr3 .hashCode()));
        result = ((result* 31)+((this.degr4 == null)? 0 :this.degr4 .hashCode()));
        result = ((result* 31)+((this.degr5 == null)? 0 :this.degr5 .hashCode()));
        result = ((result* 31)+((this.earnHrsBegin == null)? 0 :this.earnHrsBegin.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dept1 == null)? 0 :this.dept1 .hashCode()));
        result = ((result* 31)+((this.dept2 == null)? 0 :this.dept2 .hashCode()));
        result = ((result* 31)+((this.dept3 == null)? 0 :this.dept3 .hashCode()));
        result = ((result* 31)+((this.dept4 == null)? 0 :this.dept4 .hashCode()));
        result = ((result* 31)+((this.cmps3 == null)? 0 :this.cmps3 .hashCode()));
        result = ((result* 31)+((this.hourEnd == null)? 0 :this.hourEnd.hashCode()));
        result = ((result* 31)+((this.cmps4 == null)? 0 :this.cmps4 .hashCode()));
        result = ((result* 31)+((this.cmps1 == null)? 0 :this.cmps1 .hashCode()));
        result = ((result* 31)+((this.cmps2 == null)? 0 :this.cmps2 .hashCode()));
        result = ((result* 31)+((this.clsInclExcl == null)? 0 :this.clsInclExcl.hashCode()));
        result = ((result* 31)+((this.deptInclExcl == null)? 0 :this.deptInclExcl.hashCode()));
        result = ((result* 31)+((this.stvtermDesc == null)? 0 :this.stvtermDesc.hashCode()));
        result = ((result* 31)+((this.cmps5 == null)? 0 :this.cmps5 .hashCode()));
        result = ((result* 31)+((this.cmpsInclExcl == null)? 0 :this.cmpsInclExcl.hashCode()));
        result = ((result* 31)+((this.degrInclExcl == null)? 0 :this.degrInclExcl.hashCode()));
        result = ((result* 31)+((this.coll3 == null)? 0 :this.coll3 .hashCode()));
        result = ((result* 31)+((this.coll2 == null)? 0 :this.coll2 .hashCode()));
        result = ((result* 31)+((this.coll1 == null)? 0 :this.coll1 .hashCode()));
        result = ((result* 31)+((this.cls4 == null)? 0 :this.cls4 .hashCode()));
        result = ((result* 31)+((this.cls5 == null)? 0 :this.cls5 .hashCode()));
        result = ((result* 31)+((this.cls2 == null)? 0 :this.cls2 .hashCode()));
        result = ((result* 31)+((this.cls3 == null)? 0 :this.cls3 .hashCode()));
        result = ((result* 31)+((this.termCodeHost == null)? 0 :this.termCodeHost.hashCode()));
        result = ((result* 31)+((this.cls1 == null)? 0 :this.cls1 .hashCode()));
        result = ((result* 31)+((this.coll5 == null)? 0 :this.coll5 .hashCode()));
        result = ((result* 31)+((this.coll4 == null)? 0 :this.coll4 .hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.majr5 == null)? 0 :this.majr5 .hashCode()));
        result = ((result* 31)+((this.majr4 == null)? 0 :this.majr4 .hashCode()));
        result = ((result* 31)+((this.majr1 == null)? 0 :this.majr1 .hashCode()));
        result = ((result* 31)+((this.majr3 == null)? 0 :this.majr3 .hashCode()));
        result = ((result* 31)+((this.majr2 == null)? 0 :this.majr2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyRegistrationTimeControls100PutResponse) == false) {
            return false;
        }
        ThirdPartyRegistrationTimeControls100PutResponse rhs = ((ThirdPartyRegistrationTimeControls100PutResponse) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.levl2 == rhs.levl2)||((this.levl2 != null)&&this.levl2 .equals(rhs.levl2)))&&((this.levl1 == rhs.levl1)||((this.levl1 != null)&&this.levl1 .equals(rhs.levl1))))&&((this.levl4 == rhs.levl4)||((this.levl4 != null)&&this.levl4 .equals(rhs.levl4))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.levl3 == rhs.levl3)||((this.levl3 != null)&&this.levl3 .equals(rhs.levl3))))&&((this.levl5 == rhs.levl5)||((this.levl5 != null)&&this.levl5 .equals(rhs.levl5))))&&((this.collInclExcl == rhs.collInclExcl)||((this.collInclExcl!= null)&&this.collInclExcl.equals(rhs.collInclExcl))))&&((this.lastNamEnd == rhs.lastNamEnd)||((this.lastNamEnd!= null)&&this.lastNamEnd.equals(rhs.lastNamEnd))))&&((this.studType2 == rhs.studType2)||((this.studType2 != null)&&this.studType2 .equals(rhs.studType2))))&&((this.majrInclExcl == rhs.majrInclExcl)||((this.majrInclExcl!= null)&&this.majrInclExcl.equals(rhs.majrInclExcl))))&&((this.studType3 == rhs.studType3)||((this.studType3 != null)&&this.studType3 .equals(rhs.studType3))))&&((this.studType4 == rhs.studType4)||((this.studType4 != null)&&this.studType4 .equals(rhs.studType4))))&&((this.studType5 == rhs.studType5)||((this.studType5 != null)&&this.studType5 .equals(rhs.studType5))))&&((this.earnHrsEnd == rhs.earnHrsEnd)||((this.earnHrsEnd!= null)&&this.earnHrsEnd.equals(rhs.earnHrsEnd))))&&((this.studType1 == rhs.studType1)||((this.studType1 != null)&&this.studType1 .equals(rhs.studType1))))&&((this.pinEnd == rhs.pinEnd)||((this.pinEnd!= null)&&this.pinEnd.equals(rhs.pinEnd))))&&((this.dept5 == rhs.dept5)||((this.dept5 != null)&&this.dept5 .equals(rhs.dept5))))&&((this.pinStart == rhs.pinStart)||((this.pinStart!= null)&&this.pinStart.equals(rhs.pinStart))))&&((this.hourBegin == rhs.hourBegin)||((this.hourBegin!= null)&&this.hourBegin.equals(rhs.hourBegin))))&&((this.lastNamStart == rhs.lastNamStart)||((this.lastNamStart!= null)&&this.lastNamStart.equals(rhs.lastNamStart))))&&((this.degr1 == rhs.degr1)||((this.degr1 != null)&&this.degr1 .equals(rhs.degr1))))&&((this.degr2 == rhs.degr2)||((this.degr2 != null)&&this.degr2 .equals(rhs.degr2))))&&((this.degr3 == rhs.degr3)||((this.degr3 != null)&&this.degr3 .equals(rhs.degr3))))&&((this.degr4 == rhs.degr4)||((this.degr4 != null)&&this.degr4 .equals(rhs.degr4))))&&((this.degr5 == rhs.degr5)||((this.degr5 != null)&&this.degr5 .equals(rhs.degr5))))&&((this.earnHrsBegin == rhs.earnHrsBegin)||((this.earnHrsBegin!= null)&&this.earnHrsBegin.equals(rhs.earnHrsBegin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dept1 == rhs.dept1)||((this.dept1 != null)&&this.dept1 .equals(rhs.dept1))))&&((this.dept2 == rhs.dept2)||((this.dept2 != null)&&this.dept2 .equals(rhs.dept2))))&&((this.dept3 == rhs.dept3)||((this.dept3 != null)&&this.dept3 .equals(rhs.dept3))))&&((this.dept4 == rhs.dept4)||((this.dept4 != null)&&this.dept4 .equals(rhs.dept4))))&&((this.cmps3 == rhs.cmps3)||((this.cmps3 != null)&&this.cmps3 .equals(rhs.cmps3))))&&((this.hourEnd == rhs.hourEnd)||((this.hourEnd!= null)&&this.hourEnd.equals(rhs.hourEnd))))&&((this.cmps4 == rhs.cmps4)||((this.cmps4 != null)&&this.cmps4 .equals(rhs.cmps4))))&&((this.cmps1 == rhs.cmps1)||((this.cmps1 != null)&&this.cmps1 .equals(rhs.cmps1))))&&((this.cmps2 == rhs.cmps2)||((this.cmps2 != null)&&this.cmps2 .equals(rhs.cmps2))))&&((this.clsInclExcl == rhs.clsInclExcl)||((this.clsInclExcl!= null)&&this.clsInclExcl.equals(rhs.clsInclExcl))))&&((this.deptInclExcl == rhs.deptInclExcl)||((this.deptInclExcl!= null)&&this.deptInclExcl.equals(rhs.deptInclExcl))))&&((this.stvtermDesc == rhs.stvtermDesc)||((this.stvtermDesc!= null)&&this.stvtermDesc.equals(rhs.stvtermDesc))))&&((this.cmps5 == rhs.cmps5)||((this.cmps5 != null)&&this.cmps5 .equals(rhs.cmps5))))&&((this.cmpsInclExcl == rhs.cmpsInclExcl)||((this.cmpsInclExcl!= null)&&this.cmpsInclExcl.equals(rhs.cmpsInclExcl))))&&((this.degrInclExcl == rhs.degrInclExcl)||((this.degrInclExcl!= null)&&this.degrInclExcl.equals(rhs.degrInclExcl))))&&((this.coll3 == rhs.coll3)||((this.coll3 != null)&&this.coll3 .equals(rhs.coll3))))&&((this.coll2 == rhs.coll2)||((this.coll2 != null)&&this.coll2 .equals(rhs.coll2))))&&((this.coll1 == rhs.coll1)||((this.coll1 != null)&&this.coll1 .equals(rhs.coll1))))&&((this.cls4 == rhs.cls4)||((this.cls4 != null)&&this.cls4 .equals(rhs.cls4))))&&((this.cls5 == rhs.cls5)||((this.cls5 != null)&&this.cls5 .equals(rhs.cls5))))&&((this.cls2 == rhs.cls2)||((this.cls2 != null)&&this.cls2 .equals(rhs.cls2))))&&((this.cls3 == rhs.cls3)||((this.cls3 != null)&&this.cls3 .equals(rhs.cls3))))&&((this.termCodeHost == rhs.termCodeHost)||((this.termCodeHost!= null)&&this.termCodeHost.equals(rhs.termCodeHost))))&&((this.cls1 == rhs.cls1)||((this.cls1 != null)&&this.cls1 .equals(rhs.cls1))))&&((this.coll5 == rhs.coll5)||((this.coll5 != null)&&this.coll5 .equals(rhs.coll5))))&&((this.coll4 == rhs.coll4)||((this.coll4 != null)&&this.coll4 .equals(rhs.coll4))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.majr5 == rhs.majr5)||((this.majr5 != null)&&this.majr5 .equals(rhs.majr5))))&&((this.majr4 == rhs.majr4)||((this.majr4 != null)&&this.majr4 .equals(rhs.majr4))))&&((this.majr1 == rhs.majr1)||((this.majr1 != null)&&this.majr1 .equals(rhs.majr1))))&&((this.majr3 == rhs.majr3)||((this.majr3 != null)&&this.majr3 .equals(rhs.majr3))))&&((this.majr2 == rhs.majr2)||((this.majr2 != null)&&this.majr2 .equals(rhs.majr2))));
    }

}
