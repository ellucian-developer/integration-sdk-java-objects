
package com.ellucian.generated.bpapi.ban.registration_sections.v1_0_0;

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
    "timeconflict",
    "queryCrn",
    "querySubjCode",
    "seatsAvail",
    "queryXlstGroup",
    "daysCode1",
    "daysCode2",
    "daysCode3",
    "blockInd",
    "querySchdCode",
    "daysCode4",
    "queryCrseNumb",
    "daysCode5",
    "daysCode6",
    "queryPtrmCode",
    "daysCode7",
    "queryCampCode",
    "querySstsCode",
    "beginTime",
    "endTime",
    "waitCount",
    "queryLinkIdent",
    "querySeqNumb"
})
@Generated("jsonschema2pojo")
public class Sfvsecm {

    /**
     * Time Conflict
     * <p>
     * 
     * 
     */
    @JsonProperty("timeconflict")
    private String timeconflict;
    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("queryCrn")
    private String queryCrn;
    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("querySubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvsubj")
    private String querySubjCode;
    /**
     * Available Seats
     * <p>
     * Lineage reference object : SFVSECM_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    @JsonPropertyDescription("Lineage reference object : SFVSECM_SEATS_AVAIL")
    private Double seatsAvail;
    /**
     * Crosslist Group
     * <p>
     * 
     * 
     */
    @JsonProperty("queryXlstGroup")
    private String queryXlstGroup;
    @JsonProperty("daysCode1")
    private String daysCode1;
    @JsonProperty("daysCode2")
    private String daysCode2;
    @JsonProperty("daysCode3")
    private String daysCode3;
    /**
     * Block Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    private String blockInd;
    /**
     * Schedule
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("querySchdCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvschd")
    private String querySchdCode;
    @JsonProperty("daysCode4")
    private String daysCode4;
    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("queryCrseNumb")
    private String queryCrseNumb;
    @JsonProperty("daysCode5")
    private String daysCode5;
    @JsonProperty("daysCode6")
    private String daysCode6;
    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("queryPtrmCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvptrm")
    private String queryPtrmCode;
    @JsonProperty("daysCode7")
    private String daysCode7;
    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("queryCampCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcamp")
    private String queryCampCode;
    /**
     * Section Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("querySstsCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvssts")
    private String querySstsCode;
    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFVSECM_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    @JsonPropertyDescription("Lineage reference object : SFVSECM_BEGIN_TIME")
    private String beginTime;
    /**
     * End Time
     * <p>
     * Lineage reference object : SFVSECM_END_TIME
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("Lineage reference object : SFVSECM_END_TIME")
    private String endTime;
    /**
     * Waitlist
     * <p>
     * Lineage reference object : SFVSECM_WAIT_COUNT
     * 
     */
    @JsonProperty("waitCount")
    @JsonPropertyDescription("Lineage reference object : SFVSECM_WAIT_COUNT")
    private Double waitCount;
    /**
     * Link
     * <p>
     * 
     * 
     */
    @JsonProperty("queryLinkIdent")
    private String queryLinkIdent;
    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("querySeqNumb")
    private String querySeqNumb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Time Conflict
     * <p>
     * 
     * 
     */
    @JsonProperty("timeconflict")
    public String getTimeconflict() {
        return timeconflict;
    }

    /**
     * Time Conflict
     * <p>
     * 
     * 
     */
    @JsonProperty("timeconflict")
    public void setTimeconflict(String timeconflict) {
        this.timeconflict = timeconflict;
    }

    public Sfvsecm withTimeconflict(String timeconflict) {
        this.timeconflict = timeconflict;
        return this;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("queryCrn")
    public String getQueryCrn() {
        return queryCrn;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("queryCrn")
    public void setQueryCrn(String queryCrn) {
        this.queryCrn = queryCrn;
    }

    public Sfvsecm withQueryCrn(String queryCrn) {
        this.queryCrn = queryCrn;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("querySubjCode")
    public String getQuerySubjCode() {
        return querySubjCode;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("querySubjCode")
    public void setQuerySubjCode(String querySubjCode) {
        this.querySubjCode = querySubjCode;
    }

    public Sfvsecm withQuerySubjCode(String querySubjCode) {
        this.querySubjCode = querySubjCode;
        return this;
    }

    /**
     * Available Seats
     * <p>
     * Lineage reference object : SFVSECM_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    public Double getSeatsAvail() {
        return seatsAvail;
    }

    /**
     * Available Seats
     * <p>
     * Lineage reference object : SFVSECM_SEATS_AVAIL
     * 
     */
    @JsonProperty("seatsAvail")
    public void setSeatsAvail(Double seatsAvail) {
        this.seatsAvail = seatsAvail;
    }

    public Sfvsecm withSeatsAvail(Double seatsAvail) {
        this.seatsAvail = seatsAvail;
        return this;
    }

    /**
     * Crosslist Group
     * <p>
     * 
     * 
     */
    @JsonProperty("queryXlstGroup")
    public String getQueryXlstGroup() {
        return queryXlstGroup;
    }

    /**
     * Crosslist Group
     * <p>
     * 
     * 
     */
    @JsonProperty("queryXlstGroup")
    public void setQueryXlstGroup(String queryXlstGroup) {
        this.queryXlstGroup = queryXlstGroup;
    }

    public Sfvsecm withQueryXlstGroup(String queryXlstGroup) {
        this.queryXlstGroup = queryXlstGroup;
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

    public Sfvsecm withDaysCode1(String daysCode1) {
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

    public Sfvsecm withDaysCode2(String daysCode2) {
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

    public Sfvsecm withDaysCode3(String daysCode3) {
        this.daysCode3 = daysCode3;
        return this;
    }

    /**
     * Block Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    public String getBlockInd() {
        return blockInd;
    }

    /**
     * Block Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    public void setBlockInd(String blockInd) {
        this.blockInd = blockInd;
    }

    public Sfvsecm withBlockInd(String blockInd) {
        this.blockInd = blockInd;
        return this;
    }

    /**
     * Schedule
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("querySchdCode")
    public String getQuerySchdCode() {
        return querySchdCode;
    }

    /**
     * Schedule
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("querySchdCode")
    public void setQuerySchdCode(String querySchdCode) {
        this.querySchdCode = querySchdCode;
    }

    public Sfvsecm withQuerySchdCode(String querySchdCode) {
        this.querySchdCode = querySchdCode;
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

    public Sfvsecm withDaysCode4(String daysCode4) {
        this.daysCode4 = daysCode4;
        return this;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("queryCrseNumb")
    public String getQueryCrseNumb() {
        return queryCrseNumb;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("queryCrseNumb")
    public void setQueryCrseNumb(String queryCrseNumb) {
        this.queryCrseNumb = queryCrseNumb;
    }

    public Sfvsecm withQueryCrseNumb(String queryCrseNumb) {
        this.queryCrseNumb = queryCrseNumb;
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

    public Sfvsecm withDaysCode5(String daysCode5) {
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

    public Sfvsecm withDaysCode6(String daysCode6) {
        this.daysCode6 = daysCode6;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("queryPtrmCode")
    public String getQueryPtrmCode() {
        return queryPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("queryPtrmCode")
    public void setQueryPtrmCode(String queryPtrmCode) {
        this.queryPtrmCode = queryPtrmCode;
    }

    public Sfvsecm withQueryPtrmCode(String queryPtrmCode) {
        this.queryPtrmCode = queryPtrmCode;
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

    public Sfvsecm withDaysCode7(String daysCode7) {
        this.daysCode7 = daysCode7;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("queryCampCode")
    public String getQueryCampCode() {
        return queryCampCode;
    }

    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("queryCampCode")
    public void setQueryCampCode(String queryCampCode) {
        this.queryCampCode = queryCampCode;
    }

    public Sfvsecm withQueryCampCode(String queryCampCode) {
        this.queryCampCode = queryCampCode;
        return this;
    }

    /**
     * Section Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("querySstsCode")
    public String getQuerySstsCode() {
        return querySstsCode;
    }

    /**
     * Section Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("querySstsCode")
    public void setQuerySstsCode(String querySstsCode) {
        this.querySstsCode = querySstsCode;
    }

    public Sfvsecm withQuerySstsCode(String querySstsCode) {
        this.querySstsCode = querySstsCode;
        return this;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFVSECM_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFVSECM_BEGIN_TIME
     * 
     */
    @JsonProperty("beginTime")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public Sfvsecm withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFVSECM_END_TIME
     * 
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFVSECM_END_TIME
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Sfvsecm withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Waitlist
     * <p>
     * Lineage reference object : SFVSECM_WAIT_COUNT
     * 
     */
    @JsonProperty("waitCount")
    public Double getWaitCount() {
        return waitCount;
    }

    /**
     * Waitlist
     * <p>
     * Lineage reference object : SFVSECM_WAIT_COUNT
     * 
     */
    @JsonProperty("waitCount")
    public void setWaitCount(Double waitCount) {
        this.waitCount = waitCount;
    }

    public Sfvsecm withWaitCount(Double waitCount) {
        this.waitCount = waitCount;
        return this;
    }

    /**
     * Link
     * <p>
     * 
     * 
     */
    @JsonProperty("queryLinkIdent")
    public String getQueryLinkIdent() {
        return queryLinkIdent;
    }

    /**
     * Link
     * <p>
     * 
     * 
     */
    @JsonProperty("queryLinkIdent")
    public void setQueryLinkIdent(String queryLinkIdent) {
        this.queryLinkIdent = queryLinkIdent;
    }

    public Sfvsecm withQueryLinkIdent(String queryLinkIdent) {
        this.queryLinkIdent = queryLinkIdent;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("querySeqNumb")
    public String getQuerySeqNumb() {
        return querySeqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("querySeqNumb")
    public void setQuerySeqNumb(String querySeqNumb) {
        this.querySeqNumb = querySeqNumb;
    }

    public Sfvsecm withQuerySeqNumb(String querySeqNumb) {
        this.querySeqNumb = querySeqNumb;
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

    public Sfvsecm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfvsecm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeconflict");
        sb.append('=');
        sb.append(((this.timeconflict == null)?"<null>":this.timeconflict));
        sb.append(',');
        sb.append("queryCrn");
        sb.append('=');
        sb.append(((this.queryCrn == null)?"<null>":this.queryCrn));
        sb.append(',');
        sb.append("querySubjCode");
        sb.append('=');
        sb.append(((this.querySubjCode == null)?"<null>":this.querySubjCode));
        sb.append(',');
        sb.append("seatsAvail");
        sb.append('=');
        sb.append(((this.seatsAvail == null)?"<null>":this.seatsAvail));
        sb.append(',');
        sb.append("queryXlstGroup");
        sb.append('=');
        sb.append(((this.queryXlstGroup == null)?"<null>":this.queryXlstGroup));
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
        sb.append("blockInd");
        sb.append('=');
        sb.append(((this.blockInd == null)?"<null>":this.blockInd));
        sb.append(',');
        sb.append("querySchdCode");
        sb.append('=');
        sb.append(((this.querySchdCode == null)?"<null>":this.querySchdCode));
        sb.append(',');
        sb.append("daysCode4");
        sb.append('=');
        sb.append(((this.daysCode4 == null)?"<null>":this.daysCode4));
        sb.append(',');
        sb.append("queryCrseNumb");
        sb.append('=');
        sb.append(((this.queryCrseNumb == null)?"<null>":this.queryCrseNumb));
        sb.append(',');
        sb.append("daysCode5");
        sb.append('=');
        sb.append(((this.daysCode5 == null)?"<null>":this.daysCode5));
        sb.append(',');
        sb.append("daysCode6");
        sb.append('=');
        sb.append(((this.daysCode6 == null)?"<null>":this.daysCode6));
        sb.append(',');
        sb.append("queryPtrmCode");
        sb.append('=');
        sb.append(((this.queryPtrmCode == null)?"<null>":this.queryPtrmCode));
        sb.append(',');
        sb.append("daysCode7");
        sb.append('=');
        sb.append(((this.daysCode7 == null)?"<null>":this.daysCode7));
        sb.append(',');
        sb.append("queryCampCode");
        sb.append('=');
        sb.append(((this.queryCampCode == null)?"<null>":this.queryCampCode));
        sb.append(',');
        sb.append("querySstsCode");
        sb.append('=');
        sb.append(((this.querySstsCode == null)?"<null>":this.querySstsCode));
        sb.append(',');
        sb.append("beginTime");
        sb.append('=');
        sb.append(((this.beginTime == null)?"<null>":this.beginTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("waitCount");
        sb.append('=');
        sb.append(((this.waitCount == null)?"<null>":this.waitCount));
        sb.append(',');
        sb.append("queryLinkIdent");
        sb.append('=');
        sb.append(((this.queryLinkIdent == null)?"<null>":this.queryLinkIdent));
        sb.append(',');
        sb.append("querySeqNumb");
        sb.append('=');
        sb.append(((this.querySeqNumb == null)?"<null>":this.querySeqNumb));
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
        result = ((result* 31)+((this.queryCrn == null)? 0 :this.queryCrn.hashCode()));
        result = ((result* 31)+((this.daysCode1 == null)? 0 :this.daysCode1 .hashCode()));
        result = ((result* 31)+((this.daysCode2 == null)? 0 :this.daysCode2 .hashCode()));
        result = ((result* 31)+((this.daysCode3 == null)? 0 :this.daysCode3 .hashCode()));
        result = ((result* 31)+((this.daysCode4 == null)? 0 :this.daysCode4 .hashCode()));
        result = ((result* 31)+((this.queryCrseNumb == null)? 0 :this.queryCrseNumb.hashCode()));
        result = ((result* 31)+((this.daysCode5 == null)? 0 :this.daysCode5 .hashCode()));
        result = ((result* 31)+((this.daysCode6 == null)? 0 :this.daysCode6 .hashCode()));
        result = ((result* 31)+((this.queryPtrmCode == null)? 0 :this.queryPtrmCode.hashCode()));
        result = ((result* 31)+((this.daysCode7 == null)? 0 :this.daysCode7 .hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.querySeqNumb == null)? 0 :this.querySeqNumb.hashCode()));
        result = ((result* 31)+((this.timeconflict == null)? 0 :this.timeconflict.hashCode()));
        result = ((result* 31)+((this.querySubjCode == null)? 0 :this.querySubjCode.hashCode()));
        result = ((result* 31)+((this.seatsAvail == null)? 0 :this.seatsAvail.hashCode()));
        result = ((result* 31)+((this.queryXlstGroup == null)? 0 :this.queryXlstGroup.hashCode()));
        result = ((result* 31)+((this.blockInd == null)? 0 :this.blockInd.hashCode()));
        result = ((result* 31)+((this.querySchdCode == null)? 0 :this.querySchdCode.hashCode()));
        result = ((result* 31)+((this.queryCampCode == null)? 0 :this.queryCampCode.hashCode()));
        result = ((result* 31)+((this.querySstsCode == null)? 0 :this.querySstsCode.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.waitCount == null)? 0 :this.waitCount.hashCode()));
        result = ((result* 31)+((this.queryLinkIdent == null)? 0 :this.queryLinkIdent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfvsecm) == false) {
            return false;
        }
        Sfvsecm rhs = ((Sfvsecm) other);
        return (((((((((((((((((((((((((this.queryCrn == rhs.queryCrn)||((this.queryCrn!= null)&&this.queryCrn.equals(rhs.queryCrn)))&&((this.daysCode1 == rhs.daysCode1)||((this.daysCode1 != null)&&this.daysCode1 .equals(rhs.daysCode1))))&&((this.daysCode2 == rhs.daysCode2)||((this.daysCode2 != null)&&this.daysCode2 .equals(rhs.daysCode2))))&&((this.daysCode3 == rhs.daysCode3)||((this.daysCode3 != null)&&this.daysCode3 .equals(rhs.daysCode3))))&&((this.daysCode4 == rhs.daysCode4)||((this.daysCode4 != null)&&this.daysCode4 .equals(rhs.daysCode4))))&&((this.queryCrseNumb == rhs.queryCrseNumb)||((this.queryCrseNumb!= null)&&this.queryCrseNumb.equals(rhs.queryCrseNumb))))&&((this.daysCode5 == rhs.daysCode5)||((this.daysCode5 != null)&&this.daysCode5 .equals(rhs.daysCode5))))&&((this.daysCode6 == rhs.daysCode6)||((this.daysCode6 != null)&&this.daysCode6 .equals(rhs.daysCode6))))&&((this.queryPtrmCode == rhs.queryPtrmCode)||((this.queryPtrmCode!= null)&&this.queryPtrmCode.equals(rhs.queryPtrmCode))))&&((this.daysCode7 == rhs.daysCode7)||((this.daysCode7 != null)&&this.daysCode7 .equals(rhs.daysCode7))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.querySeqNumb == rhs.querySeqNumb)||((this.querySeqNumb!= null)&&this.querySeqNumb.equals(rhs.querySeqNumb))))&&((this.timeconflict == rhs.timeconflict)||((this.timeconflict!= null)&&this.timeconflict.equals(rhs.timeconflict))))&&((this.querySubjCode == rhs.querySubjCode)||((this.querySubjCode!= null)&&this.querySubjCode.equals(rhs.querySubjCode))))&&((this.seatsAvail == rhs.seatsAvail)||((this.seatsAvail!= null)&&this.seatsAvail.equals(rhs.seatsAvail))))&&((this.queryXlstGroup == rhs.queryXlstGroup)||((this.queryXlstGroup!= null)&&this.queryXlstGroup.equals(rhs.queryXlstGroup))))&&((this.blockInd == rhs.blockInd)||((this.blockInd!= null)&&this.blockInd.equals(rhs.blockInd))))&&((this.querySchdCode == rhs.querySchdCode)||((this.querySchdCode!= null)&&this.querySchdCode.equals(rhs.querySchdCode))))&&((this.queryCampCode == rhs.queryCampCode)||((this.queryCampCode!= null)&&this.queryCampCode.equals(rhs.queryCampCode))))&&((this.querySstsCode == rhs.querySstsCode)||((this.querySstsCode!= null)&&this.querySstsCode.equals(rhs.querySstsCode))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.waitCount == rhs.waitCount)||((this.waitCount!= null)&&this.waitCount.equals(rhs.waitCount))))&&((this.queryLinkIdent == rhs.queryLinkIdent)||((this.queryLinkIdent!= null)&&this.queryLinkIdent.equals(rhs.queryLinkIdent))));
    }

}
