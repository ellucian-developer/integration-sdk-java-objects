
package com.ellucian.generated.bpapi.ban.student_registration_permit_override.v1_0_0;

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
    "squeryLinkIdent",
    "squeryCrseNumb",
    "squerySstsCode",
    "squeryCampCode",
    "errorFlag",
    "squeryXlstGroup",
    "daysCode1",
    "daysCode2",
    "daysCode3",
    "daysCode4",
    "daysCode5",
    "daysCode6",
    "daysCode7",
    "rstsCode",
    "squerySubjCode",
    "squeryCrn",
    "beginTime",
    "squeryPtrmCode",
    "squerySeqNumb",
    "squeryWaitCount",
    "stumBlockInd",
    "squerySeatsAvail",
    "squeryStudyPath",
    "endTime",
    "squerySchdCode"
})
@Generated("jsonschema2pojo")
public class Sfvstum__1 {

    /**
     * Link
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryLinkIdent")
    private String squeryLinkIdent;
    /**
     * Course Number
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryCrseNumb")
    private String squeryCrseNumb;
    /**
     * Section Status
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySstsCode")
    private String squerySstsCode;
    /**
     * Campus
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryCampCode")
    private String squeryCampCode;
    /**
     * Error
     * <p>
     * Lineage reference object : SFVSTUM_ERROR_FLAG
     * 
     */
    @JsonProperty("errorFlag")
    @JsonPropertyDescription("Lineage reference object : SFVSTUM_ERROR_FLAG")
    private String errorFlag;
    /**
     * Crosslist Group
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryXlstGroup")
    private String squeryXlstGroup;
    @JsonProperty("daysCode1")
    private String daysCode1;
    @JsonProperty("daysCode2")
    private String daysCode2;
    @JsonProperty("daysCode3")
    private String daysCode3;
    @JsonProperty("daysCode4")
    private String daysCode4;
    @JsonProperty("daysCode5")
    private String daysCode5;
    @JsonProperty("daysCode6")
    private String daysCode6;
    @JsonProperty("daysCode7")
    private String daysCode7;
    /**
     * Registration Status
     * <p>
     * Lineage reference object : SFVSTUM_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    @JsonPropertyDescription("Lineage reference object : SFVSTUM_RSTS_CODE, Lookup lineage reference object : stvrsts")
    private String rstsCode;
    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySubjCode")
    private String squerySubjCode;
    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryCrn")
    private String squeryCrn;
    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFVSTUM_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    @JsonPropertyDescription("Lineage reference object : SFVSTUM_BEGIN_TIME")
    private String beginTime;
    /**
     * Part of Term
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryPtrmCode")
    private String squeryPtrmCode;
    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySeqNumb")
    private String squerySeqNumb;
    /**
     * Waitlisted
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryWaitCount")
    private Double squeryWaitCount;
    /**
     * Block Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("stumBlockInd")
    private String stumBlockInd;
    /**
     * Available
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySeatsAvail")
    private Double squerySeatsAvail;
    /**
     * Study Path
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryStudyPath")
    private Double squeryStudyPath;
    /**
     * End Time
     * <p>
     * Lineage reference object : SFVSTUM_END_TIME
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("Lineage reference object : SFVSTUM_END_TIME")
    private String endTime;
    /**
     * Schedule Type
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySchdCode")
    private String squerySchdCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Link
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryLinkIdent")
    public String getSqueryLinkIdent() {
        return squeryLinkIdent;
    }

    /**
     * Link
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryLinkIdent")
    public void setSqueryLinkIdent(String squeryLinkIdent) {
        this.squeryLinkIdent = squeryLinkIdent;
    }

    public Sfvstum__1 withSqueryLinkIdent(String squeryLinkIdent) {
        this.squeryLinkIdent = squeryLinkIdent;
        return this;
    }

    /**
     * Course Number
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryCrseNumb")
    public String getSqueryCrseNumb() {
        return squeryCrseNumb;
    }

    /**
     * Course Number
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryCrseNumb")
    public void setSqueryCrseNumb(String squeryCrseNumb) {
        this.squeryCrseNumb = squeryCrseNumb;
    }

    public Sfvstum__1 withSqueryCrseNumb(String squeryCrseNumb) {
        this.squeryCrseNumb = squeryCrseNumb;
        return this;
    }

    /**
     * Section Status
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySstsCode")
    public String getSquerySstsCode() {
        return squerySstsCode;
    }

    /**
     * Section Status
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySstsCode")
    public void setSquerySstsCode(String squerySstsCode) {
        this.squerySstsCode = squerySstsCode;
    }

    public Sfvstum__1 withSquerySstsCode(String squerySstsCode) {
        this.squerySstsCode = squerySstsCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryCampCode")
    public String getSqueryCampCode() {
        return squeryCampCode;
    }

    /**
     * Campus
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryCampCode")
    public void setSqueryCampCode(String squeryCampCode) {
        this.squeryCampCode = squeryCampCode;
    }

    public Sfvstum__1 withSqueryCampCode(String squeryCampCode) {
        this.squeryCampCode = squeryCampCode;
        return this;
    }

    /**
     * Error
     * <p>
     * Lineage reference object : SFVSTUM_ERROR_FLAG
     * 
     */
    @JsonProperty("errorFlag")
    public String getErrorFlag() {
        return errorFlag;
    }

    /**
     * Error
     * <p>
     * Lineage reference object : SFVSTUM_ERROR_FLAG
     * 
     */
    @JsonProperty("errorFlag")
    public void setErrorFlag(String errorFlag) {
        this.errorFlag = errorFlag;
    }

    public Sfvstum__1 withErrorFlag(String errorFlag) {
        this.errorFlag = errorFlag;
        return this;
    }

    /**
     * Crosslist Group
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryXlstGroup")
    public String getSqueryXlstGroup() {
        return squeryXlstGroup;
    }

    /**
     * Crosslist Group
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryXlstGroup")
    public void setSqueryXlstGroup(String squeryXlstGroup) {
        this.squeryXlstGroup = squeryXlstGroup;
    }

    public Sfvstum__1 withSqueryXlstGroup(String squeryXlstGroup) {
        this.squeryXlstGroup = squeryXlstGroup;
        return this;
    }

    @JsonProperty("daysCode1")
    public String getDaysCode1() {
        return daysCode1;
    }

    @JsonProperty("daysCode1")
    public void setDaysCode1(String daysCode1) {
        this.daysCode1 = daysCode1;
    }

    public Sfvstum__1 withDaysCode1(String daysCode1) {
        this.daysCode1 = daysCode1;
        return this;
    }

    @JsonProperty("daysCode2")
    public String getDaysCode2() {
        return daysCode2;
    }

    @JsonProperty("daysCode2")
    public void setDaysCode2(String daysCode2) {
        this.daysCode2 = daysCode2;
    }

    public Sfvstum__1 withDaysCode2(String daysCode2) {
        this.daysCode2 = daysCode2;
        return this;
    }

    @JsonProperty("daysCode3")
    public String getDaysCode3() {
        return daysCode3;
    }

    @JsonProperty("daysCode3")
    public void setDaysCode3(String daysCode3) {
        this.daysCode3 = daysCode3;
    }

    public Sfvstum__1 withDaysCode3(String daysCode3) {
        this.daysCode3 = daysCode3;
        return this;
    }

    @JsonProperty("daysCode4")
    public String getDaysCode4() {
        return daysCode4;
    }

    @JsonProperty("daysCode4")
    public void setDaysCode4(String daysCode4) {
        this.daysCode4 = daysCode4;
    }

    public Sfvstum__1 withDaysCode4(String daysCode4) {
        this.daysCode4 = daysCode4;
        return this;
    }

    @JsonProperty("daysCode5")
    public String getDaysCode5() {
        return daysCode5;
    }

    @JsonProperty("daysCode5")
    public void setDaysCode5(String daysCode5) {
        this.daysCode5 = daysCode5;
    }

    public Sfvstum__1 withDaysCode5(String daysCode5) {
        this.daysCode5 = daysCode5;
        return this;
    }

    @JsonProperty("daysCode6")
    public String getDaysCode6() {
        return daysCode6;
    }

    @JsonProperty("daysCode6")
    public void setDaysCode6(String daysCode6) {
        this.daysCode6 = daysCode6;
    }

    public Sfvstum__1 withDaysCode6(String daysCode6) {
        this.daysCode6 = daysCode6;
        return this;
    }

    @JsonProperty("daysCode7")
    public String getDaysCode7() {
        return daysCode7;
    }

    @JsonProperty("daysCode7")
    public void setDaysCode7(String daysCode7) {
        this.daysCode7 = daysCode7;
    }

    public Sfvstum__1 withDaysCode7(String daysCode7) {
        this.daysCode7 = daysCode7;
        return this;
    }

    /**
     * Registration Status
     * <p>
     * Lineage reference object : SFVSTUM_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public String getRstsCode() {
        return rstsCode;
    }

    /**
     * Registration Status
     * <p>
     * Lineage reference object : SFVSTUM_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public void setRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
    }

    public Sfvstum__1 withRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySubjCode")
    public String getSquerySubjCode() {
        return squerySubjCode;
    }

    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySubjCode")
    public void setSquerySubjCode(String squerySubjCode) {
        this.squerySubjCode = squerySubjCode;
    }

    public Sfvstum__1 withSquerySubjCode(String squerySubjCode) {
        this.squerySubjCode = squerySubjCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryCrn")
    public String getSqueryCrn() {
        return squeryCrn;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryCrn")
    public void setSqueryCrn(String squeryCrn) {
        this.squeryCrn = squeryCrn;
    }

    public Sfvstum__1 withSqueryCrn(String squeryCrn) {
        this.squeryCrn = squeryCrn;
        return this;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFVSTUM_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFVSTUM_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public Sfvstum__1 withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryPtrmCode")
    public String getSqueryPtrmCode() {
        return squeryPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryPtrmCode")
    public void setSqueryPtrmCode(String squeryPtrmCode) {
        this.squeryPtrmCode = squeryPtrmCode;
    }

    public Sfvstum__1 withSqueryPtrmCode(String squeryPtrmCode) {
        this.squeryPtrmCode = squeryPtrmCode;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySeqNumb")
    public String getSquerySeqNumb() {
        return squerySeqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySeqNumb")
    public void setSquerySeqNumb(String squerySeqNumb) {
        this.squerySeqNumb = squerySeqNumb;
    }

    public Sfvstum__1 withSquerySeqNumb(String squerySeqNumb) {
        this.squerySeqNumb = squerySeqNumb;
        return this;
    }

    /**
     * Waitlisted
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryWaitCount")
    public Double getSqueryWaitCount() {
        return squeryWaitCount;
    }

    /**
     * Waitlisted
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryWaitCount")
    public void setSqueryWaitCount(Double squeryWaitCount) {
        this.squeryWaitCount = squeryWaitCount;
    }

    public Sfvstum__1 withSqueryWaitCount(Double squeryWaitCount) {
        this.squeryWaitCount = squeryWaitCount;
        return this;
    }

    /**
     * Block Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("stumBlockInd")
    public String getStumBlockInd() {
        return stumBlockInd;
    }

    /**
     * Block Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("stumBlockInd")
    public void setStumBlockInd(String stumBlockInd) {
        this.stumBlockInd = stumBlockInd;
    }

    public Sfvstum__1 withStumBlockInd(String stumBlockInd) {
        this.stumBlockInd = stumBlockInd;
        return this;
    }

    /**
     * Available
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySeatsAvail")
    public Double getSquerySeatsAvail() {
        return squerySeatsAvail;
    }

    /**
     * Available
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySeatsAvail")
    public void setSquerySeatsAvail(Double squerySeatsAvail) {
        this.squerySeatsAvail = squerySeatsAvail;
    }

    public Sfvstum__1 withSquerySeatsAvail(Double squerySeatsAvail) {
        this.squerySeatsAvail = squerySeatsAvail;
        return this;
    }

    /**
     * Study Path
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryStudyPath")
    public Double getSqueryStudyPath() {
        return squeryStudyPath;
    }

    /**
     * Study Path
     * <p>
     * 
     * 
     */
    @JsonProperty("squeryStudyPath")
    public void setSqueryStudyPath(Double squeryStudyPath) {
        this.squeryStudyPath = squeryStudyPath;
    }

    public Sfvstum__1 withSqueryStudyPath(Double squeryStudyPath) {
        this.squeryStudyPath = squeryStudyPath;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFVSTUM_END_TIME
     * 
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFVSTUM_END_TIME
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Sfvstum__1 withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Schedule Type
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySchdCode")
    public String getSquerySchdCode() {
        return squerySchdCode;
    }

    /**
     * Schedule Type
     * <p>
     * 
     * 
     */
    @JsonProperty("squerySchdCode")
    public void setSquerySchdCode(String squerySchdCode) {
        this.squerySchdCode = squerySchdCode;
    }

    public Sfvstum__1 withSquerySchdCode(String squerySchdCode) {
        this.squerySchdCode = squerySchdCode;
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

    public Sfvstum__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfvstum__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("squeryLinkIdent");
        sb.append('=');
        sb.append(((this.squeryLinkIdent == null)?"<null>":this.squeryLinkIdent));
        sb.append(',');
        sb.append("squeryCrseNumb");
        sb.append('=');
        sb.append(((this.squeryCrseNumb == null)?"<null>":this.squeryCrseNumb));
        sb.append(',');
        sb.append("squerySstsCode");
        sb.append('=');
        sb.append(((this.squerySstsCode == null)?"<null>":this.squerySstsCode));
        sb.append(',');
        sb.append("squeryCampCode");
        sb.append('=');
        sb.append(((this.squeryCampCode == null)?"<null>":this.squeryCampCode));
        sb.append(',');
        sb.append("errorFlag");
        sb.append('=');
        sb.append(((this.errorFlag == null)?"<null>":this.errorFlag));
        sb.append(',');
        sb.append("squeryXlstGroup");
        sb.append('=');
        sb.append(((this.squeryXlstGroup == null)?"<null>":this.squeryXlstGroup));
        sb.append(',');
        sb.append("daysCode1");
        sb.append('=');
        sb.append(((this.daysCode1 == null)?"<null>":this.daysCode1));
        sb.append(',');
        sb.append("daysCode2");
        sb.append('=');
        sb.append(((this.daysCode2 == null)?"<null>":this.daysCode2));
        sb.append(',');
        sb.append("daysCode3");
        sb.append('=');
        sb.append(((this.daysCode3 == null)?"<null>":this.daysCode3));
        sb.append(',');
        sb.append("daysCode4");
        sb.append('=');
        sb.append(((this.daysCode4 == null)?"<null>":this.daysCode4));
        sb.append(',');
        sb.append("daysCode5");
        sb.append('=');
        sb.append(((this.daysCode5 == null)?"<null>":this.daysCode5));
        sb.append(',');
        sb.append("daysCode6");
        sb.append('=');
        sb.append(((this.daysCode6 == null)?"<null>":this.daysCode6));
        sb.append(',');
        sb.append("daysCode7");
        sb.append('=');
        sb.append(((this.daysCode7 == null)?"<null>":this.daysCode7));
        sb.append(',');
        sb.append("rstsCode");
        sb.append('=');
        sb.append(((this.rstsCode == null)?"<null>":this.rstsCode));
        sb.append(',');
        sb.append("squerySubjCode");
        sb.append('=');
        sb.append(((this.squerySubjCode == null)?"<null>":this.squerySubjCode));
        sb.append(',');
        sb.append("squeryCrn");
        sb.append('=');
        sb.append(((this.squeryCrn == null)?"<null>":this.squeryCrn));
        sb.append(',');
        sb.append("beginTime");
        sb.append('=');
        sb.append(((this.beginTime == null)?"<null>":this.beginTime));
        sb.append(',');
        sb.append("squeryPtrmCode");
        sb.append('=');
        sb.append(((this.squeryPtrmCode == null)?"<null>":this.squeryPtrmCode));
        sb.append(',');
        sb.append("squerySeqNumb");
        sb.append('=');
        sb.append(((this.squerySeqNumb == null)?"<null>":this.squerySeqNumb));
        sb.append(',');
        sb.append("squeryWaitCount");
        sb.append('=');
        sb.append(((this.squeryWaitCount == null)?"<null>":this.squeryWaitCount));
        sb.append(',');
        sb.append("stumBlockInd");
        sb.append('=');
        sb.append(((this.stumBlockInd == null)?"<null>":this.stumBlockInd));
        sb.append(',');
        sb.append("squerySeatsAvail");
        sb.append('=');
        sb.append(((this.squerySeatsAvail == null)?"<null>":this.squerySeatsAvail));
        sb.append(',');
        sb.append("squeryStudyPath");
        sb.append('=');
        sb.append(((this.squeryStudyPath == null)?"<null>":this.squeryStudyPath));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("squerySchdCode");
        sb.append('=');
        sb.append(((this.squerySchdCode == null)?"<null>":this.squerySchdCode));
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
        result = ((result* 31)+((this.squeryLinkIdent == null)? 0 :this.squeryLinkIdent.hashCode()));
        result = ((result* 31)+((this.squeryCrseNumb == null)? 0 :this.squeryCrseNumb.hashCode()));
        result = ((result* 31)+((this.squerySstsCode == null)? 0 :this.squerySstsCode.hashCode()));
        result = ((result* 31)+((this.squeryCampCode == null)? 0 :this.squeryCampCode.hashCode()));
        result = ((result* 31)+((this.errorFlag == null)? 0 :this.errorFlag.hashCode()));
        result = ((result* 31)+((this.squeryXlstGroup == null)? 0 :this.squeryXlstGroup.hashCode()));
        result = ((result* 31)+((this.daysCode1 == null)? 0 :this.daysCode1 .hashCode()));
        result = ((result* 31)+((this.daysCode2 == null)? 0 :this.daysCode2 .hashCode()));
        result = ((result* 31)+((this.daysCode3 == null)? 0 :this.daysCode3 .hashCode()));
        result = ((result* 31)+((this.daysCode4 == null)? 0 :this.daysCode4 .hashCode()));
        result = ((result* 31)+((this.daysCode5 == null)? 0 :this.daysCode5 .hashCode()));
        result = ((result* 31)+((this.daysCode6 == null)? 0 :this.daysCode6 .hashCode()));
        result = ((result* 31)+((this.daysCode7 == null)? 0 :this.daysCode7 .hashCode()));
        result = ((result* 31)+((this.rstsCode == null)? 0 :this.rstsCode.hashCode()));
        result = ((result* 31)+((this.squerySubjCode == null)? 0 :this.squerySubjCode.hashCode()));
        result = ((result* 31)+((this.squeryCrn == null)? 0 :this.squeryCrn.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.squeryPtrmCode == null)? 0 :this.squeryPtrmCode.hashCode()));
        result = ((result* 31)+((this.squerySeqNumb == null)? 0 :this.squerySeqNumb.hashCode()));
        result = ((result* 31)+((this.squeryWaitCount == null)? 0 :this.squeryWaitCount.hashCode()));
        result = ((result* 31)+((this.stumBlockInd == null)? 0 :this.stumBlockInd.hashCode()));
        result = ((result* 31)+((this.squerySeatsAvail == null)? 0 :this.squerySeatsAvail.hashCode()));
        result = ((result* 31)+((this.squeryStudyPath == null)? 0 :this.squeryStudyPath.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.squerySchdCode == null)? 0 :this.squerySchdCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfvstum__1) == false) {
            return false;
        }
        Sfvstum__1 rhs = ((Sfvstum__1) other);
        return (((((((((((((((((((((((((((this.squeryLinkIdent == rhs.squeryLinkIdent)||((this.squeryLinkIdent!= null)&&this.squeryLinkIdent.equals(rhs.squeryLinkIdent)))&&((this.squeryCrseNumb == rhs.squeryCrseNumb)||((this.squeryCrseNumb!= null)&&this.squeryCrseNumb.equals(rhs.squeryCrseNumb))))&&((this.squerySstsCode == rhs.squerySstsCode)||((this.squerySstsCode!= null)&&this.squerySstsCode.equals(rhs.squerySstsCode))))&&((this.squeryCampCode == rhs.squeryCampCode)||((this.squeryCampCode!= null)&&this.squeryCampCode.equals(rhs.squeryCampCode))))&&((this.errorFlag == rhs.errorFlag)||((this.errorFlag!= null)&&this.errorFlag.equals(rhs.errorFlag))))&&((this.squeryXlstGroup == rhs.squeryXlstGroup)||((this.squeryXlstGroup!= null)&&this.squeryXlstGroup.equals(rhs.squeryXlstGroup))))&&((this.daysCode1 == rhs.daysCode1)||((this.daysCode1 != null)&&this.daysCode1 .equals(rhs.daysCode1))))&&((this.daysCode2 == rhs.daysCode2)||((this.daysCode2 != null)&&this.daysCode2 .equals(rhs.daysCode2))))&&((this.daysCode3 == rhs.daysCode3)||((this.daysCode3 != null)&&this.daysCode3 .equals(rhs.daysCode3))))&&((this.daysCode4 == rhs.daysCode4)||((this.daysCode4 != null)&&this.daysCode4 .equals(rhs.daysCode4))))&&((this.daysCode5 == rhs.daysCode5)||((this.daysCode5 != null)&&this.daysCode5 .equals(rhs.daysCode5))))&&((this.daysCode6 == rhs.daysCode6)||((this.daysCode6 != null)&&this.daysCode6 .equals(rhs.daysCode6))))&&((this.daysCode7 == rhs.daysCode7)||((this.daysCode7 != null)&&this.daysCode7 .equals(rhs.daysCode7))))&&((this.rstsCode == rhs.rstsCode)||((this.rstsCode!= null)&&this.rstsCode.equals(rhs.rstsCode))))&&((this.squerySubjCode == rhs.squerySubjCode)||((this.squerySubjCode!= null)&&this.squerySubjCode.equals(rhs.squerySubjCode))))&&((this.squeryCrn == rhs.squeryCrn)||((this.squeryCrn!= null)&&this.squeryCrn.equals(rhs.squeryCrn))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.squeryPtrmCode == rhs.squeryPtrmCode)||((this.squeryPtrmCode!= null)&&this.squeryPtrmCode.equals(rhs.squeryPtrmCode))))&&((this.squerySeqNumb == rhs.squerySeqNumb)||((this.squerySeqNumb!= null)&&this.squerySeqNumb.equals(rhs.squerySeqNumb))))&&((this.squeryWaitCount == rhs.squeryWaitCount)||((this.squeryWaitCount!= null)&&this.squeryWaitCount.equals(rhs.squeryWaitCount))))&&((this.stumBlockInd == rhs.stumBlockInd)||((this.stumBlockInd!= null)&&this.stumBlockInd.equals(rhs.stumBlockInd))))&&((this.squerySeatsAvail == rhs.squerySeatsAvail)||((this.squerySeatsAvail!= null)&&this.squerySeatsAvail.equals(rhs.squerySeatsAvail))))&&((this.squeryStudyPath == rhs.squeryStudyPath)||((this.squeryStudyPath!= null)&&this.squeryStudyPath.equals(rhs.squeryStudyPath))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.squerySchdCode == rhs.squerySchdCode)||((this.squerySchdCode!= null)&&this.squerySchdCode.equals(rhs.squerySchdCode))));
    }

}
