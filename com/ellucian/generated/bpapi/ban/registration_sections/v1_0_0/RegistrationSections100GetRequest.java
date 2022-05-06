
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
    "criteria.endTime",
    "criteria.blockInd",
    "criteria.beginTime",
    "criteria.querySeqNumb",
    "criteria.waitCount",
    "criteria.querySchdCode",
    "criteria.queryPtrmCode",
    "criteria.seatsAvail",
    "criteria.querySstsCode",
    "criteria.queryCrn",
    "criteria.queryCrseNumb",
    "criteria.queryLinkIdent",
    "criteria.queryCampCode",
    "criteria.querySubjCode",
    "criteria.queryXlstGroup"
})
@Generated("jsonschema2pojo")
public class RegistrationSections100GetRequest {

    /**
     * End Time
     * <p>
     * Lineage reference object : SFVSECM_END_TIME
     * 
     */
    @JsonProperty("criteria.endTime")
    @JsonPropertyDescription("Lineage reference object : SFVSECM_END_TIME")
    private String criteriaEndTime;
    /**
     * Block Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.blockInd")
    private String criteriaBlockInd;
    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFVSECM_BEGIN_TIME
     * 
     */
    @JsonProperty("criteria.beginTime")
    @JsonPropertyDescription("Lineage reference object : SFVSECM_BEGIN_TIME")
    private String criteriaBeginTime;
    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.querySeqNumb")
    private String criteriaQuerySeqNumb;
    /**
     * Waitlist
     * <p>
     * Lineage reference object : SFVSECM_WAIT_COUNT
     * 
     */
    @JsonProperty("criteria.waitCount")
    @JsonPropertyDescription("Lineage reference object : SFVSECM_WAIT_COUNT")
    private Double criteriaWaitCount;
    /**
     * Schedule
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.querySchdCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvschd")
    private String criteriaQuerySchdCode;
    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.queryPtrmCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvptrm")
    private String criteriaQueryPtrmCode;
    /**
     * Available Seats
     * <p>
     * Lineage reference object : SFVSECM_SEATS_AVAIL
     * 
     */
    @JsonProperty("criteria.seatsAvail")
    @JsonPropertyDescription("Lineage reference object : SFVSECM_SEATS_AVAIL")
    private Double criteriaSeatsAvail;
    /**
     * Section Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("criteria.querySstsCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvssts")
    private String criteriaQuerySstsCode;
    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryCrn")
    private String criteriaQueryCrn;
    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryCrseNumb")
    private String criteriaQueryCrseNumb;
    /**
     * Link
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryLinkIdent")
    private String criteriaQueryLinkIdent;
    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.queryCampCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcamp")
    private String criteriaQueryCampCode;
    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.querySubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvsubj")
    private String criteriaQuerySubjCode;
    /**
     * Crosslist Group
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryXlstGroup")
    private String criteriaQueryXlstGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * End Time
     * <p>
     * Lineage reference object : SFVSECM_END_TIME
     * 
     */
    @JsonProperty("criteria.endTime")
    public String getCriteriaEndTime() {
        return criteriaEndTime;
    }

    /**
     * End Time
     * <p>
     * Lineage reference object : SFVSECM_END_TIME
     * 
     */
    @JsonProperty("criteria.endTime")
    public void setCriteriaEndTime(String criteriaEndTime) {
        this.criteriaEndTime = criteriaEndTime;
    }

    public RegistrationSections100GetRequest withCriteriaEndTime(String criteriaEndTime) {
        this.criteriaEndTime = criteriaEndTime;
        return this;
    }

    /**
     * Block Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.blockInd")
    public String getCriteriaBlockInd() {
        return criteriaBlockInd;
    }

    /**
     * Block Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.blockInd")
    public void setCriteriaBlockInd(String criteriaBlockInd) {
        this.criteriaBlockInd = criteriaBlockInd;
    }

    public RegistrationSections100GetRequest withCriteriaBlockInd(String criteriaBlockInd) {
        this.criteriaBlockInd = criteriaBlockInd;
        return this;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFVSECM_BEGIN_TIME
     * 
     */
    @JsonProperty("criteria.beginTime")
    public String getCriteriaBeginTime() {
        return criteriaBeginTime;
    }

    /**
     * Begin Time
     * <p>
     * Lineage reference object : SFVSECM_BEGIN_TIME
     * 
     */
    @JsonProperty("criteria.beginTime")
    public void setCriteriaBeginTime(String criteriaBeginTime) {
        this.criteriaBeginTime = criteriaBeginTime;
    }

    public RegistrationSections100GetRequest withCriteriaBeginTime(String criteriaBeginTime) {
        this.criteriaBeginTime = criteriaBeginTime;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.querySeqNumb")
    public String getCriteriaQuerySeqNumb() {
        return criteriaQuerySeqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.querySeqNumb")
    public void setCriteriaQuerySeqNumb(String criteriaQuerySeqNumb) {
        this.criteriaQuerySeqNumb = criteriaQuerySeqNumb;
    }

    public RegistrationSections100GetRequest withCriteriaQuerySeqNumb(String criteriaQuerySeqNumb) {
        this.criteriaQuerySeqNumb = criteriaQuerySeqNumb;
        return this;
    }

    /**
     * Waitlist
     * <p>
     * Lineage reference object : SFVSECM_WAIT_COUNT
     * 
     */
    @JsonProperty("criteria.waitCount")
    public Double getCriteriaWaitCount() {
        return criteriaWaitCount;
    }

    /**
     * Waitlist
     * <p>
     * Lineage reference object : SFVSECM_WAIT_COUNT
     * 
     */
    @JsonProperty("criteria.waitCount")
    public void setCriteriaWaitCount(Double criteriaWaitCount) {
        this.criteriaWaitCount = criteriaWaitCount;
    }

    public RegistrationSections100GetRequest withCriteriaWaitCount(Double criteriaWaitCount) {
        this.criteriaWaitCount = criteriaWaitCount;
        return this;
    }

    /**
     * Schedule
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.querySchdCode")
    public String getCriteriaQuerySchdCode() {
        return criteriaQuerySchdCode;
    }

    /**
     * Schedule
     * <p>
     * Lookup lineage reference object : stvschd
     * 
     */
    @JsonProperty("criteria.querySchdCode")
    public void setCriteriaQuerySchdCode(String criteriaQuerySchdCode) {
        this.criteriaQuerySchdCode = criteriaQuerySchdCode;
    }

    public RegistrationSections100GetRequest withCriteriaQuerySchdCode(String criteriaQuerySchdCode) {
        this.criteriaQuerySchdCode = criteriaQuerySchdCode;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.queryPtrmCode")
    public String getCriteriaQueryPtrmCode() {
        return criteriaQueryPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.queryPtrmCode")
    public void setCriteriaQueryPtrmCode(String criteriaQueryPtrmCode) {
        this.criteriaQueryPtrmCode = criteriaQueryPtrmCode;
    }

    public RegistrationSections100GetRequest withCriteriaQueryPtrmCode(String criteriaQueryPtrmCode) {
        this.criteriaQueryPtrmCode = criteriaQueryPtrmCode;
        return this;
    }

    /**
     * Available Seats
     * <p>
     * Lineage reference object : SFVSECM_SEATS_AVAIL
     * 
     */
    @JsonProperty("criteria.seatsAvail")
    public Double getCriteriaSeatsAvail() {
        return criteriaSeatsAvail;
    }

    /**
     * Available Seats
     * <p>
     * Lineage reference object : SFVSECM_SEATS_AVAIL
     * 
     */
    @JsonProperty("criteria.seatsAvail")
    public void setCriteriaSeatsAvail(Double criteriaSeatsAvail) {
        this.criteriaSeatsAvail = criteriaSeatsAvail;
    }

    public RegistrationSections100GetRequest withCriteriaSeatsAvail(Double criteriaSeatsAvail) {
        this.criteriaSeatsAvail = criteriaSeatsAvail;
        return this;
    }

    /**
     * Section Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("criteria.querySstsCode")
    public String getCriteriaQuerySstsCode() {
        return criteriaQuerySstsCode;
    }

    /**
     * Section Status
     * <p>
     * Lookup lineage reference object : stvssts
     * 
     */
    @JsonProperty("criteria.querySstsCode")
    public void setCriteriaQuerySstsCode(String criteriaQuerySstsCode) {
        this.criteriaQuerySstsCode = criteriaQuerySstsCode;
    }

    public RegistrationSections100GetRequest withCriteriaQuerySstsCode(String criteriaQuerySstsCode) {
        this.criteriaQuerySstsCode = criteriaQuerySstsCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryCrn")
    public String getCriteriaQueryCrn() {
        return criteriaQueryCrn;
    }

    /**
     * CRN
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryCrn")
    public void setCriteriaQueryCrn(String criteriaQueryCrn) {
        this.criteriaQueryCrn = criteriaQueryCrn;
    }

    public RegistrationSections100GetRequest withCriteriaQueryCrn(String criteriaQueryCrn) {
        this.criteriaQueryCrn = criteriaQueryCrn;
        return this;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryCrseNumb")
    public String getCriteriaQueryCrseNumb() {
        return criteriaQueryCrseNumb;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryCrseNumb")
    public void setCriteriaQueryCrseNumb(String criteriaQueryCrseNumb) {
        this.criteriaQueryCrseNumb = criteriaQueryCrseNumb;
    }

    public RegistrationSections100GetRequest withCriteriaQueryCrseNumb(String criteriaQueryCrseNumb) {
        this.criteriaQueryCrseNumb = criteriaQueryCrseNumb;
        return this;
    }

    /**
     * Link
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryLinkIdent")
    public String getCriteriaQueryLinkIdent() {
        return criteriaQueryLinkIdent;
    }

    /**
     * Link
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryLinkIdent")
    public void setCriteriaQueryLinkIdent(String criteriaQueryLinkIdent) {
        this.criteriaQueryLinkIdent = criteriaQueryLinkIdent;
    }

    public RegistrationSections100GetRequest withCriteriaQueryLinkIdent(String criteriaQueryLinkIdent) {
        this.criteriaQueryLinkIdent = criteriaQueryLinkIdent;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.queryCampCode")
    public String getCriteriaQueryCampCode() {
        return criteriaQueryCampCode;
    }

    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("criteria.queryCampCode")
    public void setCriteriaQueryCampCode(String criteriaQueryCampCode) {
        this.criteriaQueryCampCode = criteriaQueryCampCode;
    }

    public RegistrationSections100GetRequest withCriteriaQueryCampCode(String criteriaQueryCampCode) {
        this.criteriaQueryCampCode = criteriaQueryCampCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.querySubjCode")
    public String getCriteriaQuerySubjCode() {
        return criteriaQuerySubjCode;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * 
     */
    @JsonProperty("criteria.querySubjCode")
    public void setCriteriaQuerySubjCode(String criteriaQuerySubjCode) {
        this.criteriaQuerySubjCode = criteriaQuerySubjCode;
    }

    public RegistrationSections100GetRequest withCriteriaQuerySubjCode(String criteriaQuerySubjCode) {
        this.criteriaQuerySubjCode = criteriaQuerySubjCode;
        return this;
    }

    /**
     * Crosslist Group
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryXlstGroup")
    public String getCriteriaQueryXlstGroup() {
        return criteriaQueryXlstGroup;
    }

    /**
     * Crosslist Group
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.queryXlstGroup")
    public void setCriteriaQueryXlstGroup(String criteriaQueryXlstGroup) {
        this.criteriaQueryXlstGroup = criteriaQueryXlstGroup;
    }

    public RegistrationSections100GetRequest withCriteriaQueryXlstGroup(String criteriaQueryXlstGroup) {
        this.criteriaQueryXlstGroup = criteriaQueryXlstGroup;
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

    public RegistrationSections100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationSections100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaEndTime");
        sb.append('=');
        sb.append(((this.criteriaEndTime == null)?"<null>":this.criteriaEndTime));
        sb.append(',');
        sb.append("criteriaBlockInd");
        sb.append('=');
        sb.append(((this.criteriaBlockInd == null)?"<null>":this.criteriaBlockInd));
        sb.append(',');
        sb.append("criteriaBeginTime");
        sb.append('=');
        sb.append(((this.criteriaBeginTime == null)?"<null>":this.criteriaBeginTime));
        sb.append(',');
        sb.append("criteriaQuerySeqNumb");
        sb.append('=');
        sb.append(((this.criteriaQuerySeqNumb == null)?"<null>":this.criteriaQuerySeqNumb));
        sb.append(',');
        sb.append("criteriaWaitCount");
        sb.append('=');
        sb.append(((this.criteriaWaitCount == null)?"<null>":this.criteriaWaitCount));
        sb.append(',');
        sb.append("criteriaQuerySchdCode");
        sb.append('=');
        sb.append(((this.criteriaQuerySchdCode == null)?"<null>":this.criteriaQuerySchdCode));
        sb.append(',');
        sb.append("criteriaQueryPtrmCode");
        sb.append('=');
        sb.append(((this.criteriaQueryPtrmCode == null)?"<null>":this.criteriaQueryPtrmCode));
        sb.append(',');
        sb.append("criteriaSeatsAvail");
        sb.append('=');
        sb.append(((this.criteriaSeatsAvail == null)?"<null>":this.criteriaSeatsAvail));
        sb.append(',');
        sb.append("criteriaQuerySstsCode");
        sb.append('=');
        sb.append(((this.criteriaQuerySstsCode == null)?"<null>":this.criteriaQuerySstsCode));
        sb.append(',');
        sb.append("criteriaQueryCrn");
        sb.append('=');
        sb.append(((this.criteriaQueryCrn == null)?"<null>":this.criteriaQueryCrn));
        sb.append(',');
        sb.append("criteriaQueryCrseNumb");
        sb.append('=');
        sb.append(((this.criteriaQueryCrseNumb == null)?"<null>":this.criteriaQueryCrseNumb));
        sb.append(',');
        sb.append("criteriaQueryLinkIdent");
        sb.append('=');
        sb.append(((this.criteriaQueryLinkIdent == null)?"<null>":this.criteriaQueryLinkIdent));
        sb.append(',');
        sb.append("criteriaQueryCampCode");
        sb.append('=');
        sb.append(((this.criteriaQueryCampCode == null)?"<null>":this.criteriaQueryCampCode));
        sb.append(',');
        sb.append("criteriaQuerySubjCode");
        sb.append('=');
        sb.append(((this.criteriaQuerySubjCode == null)?"<null>":this.criteriaQuerySubjCode));
        sb.append(',');
        sb.append("criteriaQueryXlstGroup");
        sb.append('=');
        sb.append(((this.criteriaQueryXlstGroup == null)?"<null>":this.criteriaQueryXlstGroup));
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
        result = ((result* 31)+((this.criteriaQuerySchdCode == null)? 0 :this.criteriaQuerySchdCode.hashCode()));
        result = ((result* 31)+((this.criteriaBeginTime == null)? 0 :this.criteriaBeginTime.hashCode()));
        result = ((result* 31)+((this.criteriaQueryLinkIdent == null)? 0 :this.criteriaQueryLinkIdent.hashCode()));
        result = ((result* 31)+((this.criteriaQueryXlstGroup == null)? 0 :this.criteriaQueryXlstGroup.hashCode()));
        result = ((result* 31)+((this.criteriaQuerySeqNumb == null)? 0 :this.criteriaQuerySeqNumb.hashCode()));
        result = ((result* 31)+((this.criteriaQueryPtrmCode == null)? 0 :this.criteriaQueryPtrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaSeatsAvail == null)? 0 :this.criteriaSeatsAvail.hashCode()));
        result = ((result* 31)+((this.criteriaQueryCrseNumb == null)? 0 :this.criteriaQueryCrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaQuerySstsCode == null)? 0 :this.criteriaQuerySstsCode.hashCode()));
        result = ((result* 31)+((this.criteriaQueryCampCode == null)? 0 :this.criteriaQueryCampCode.hashCode()));
        result = ((result* 31)+((this.criteriaQuerySubjCode == null)? 0 :this.criteriaQuerySubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaEndTime == null)? 0 :this.criteriaEndTime.hashCode()));
        result = ((result* 31)+((this.criteriaWaitCount == null)? 0 :this.criteriaWaitCount.hashCode()));
        result = ((result* 31)+((this.criteriaQueryCrn == null)? 0 :this.criteriaQueryCrn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaBlockInd == null)? 0 :this.criteriaBlockInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationSections100GetRequest) == false) {
            return false;
        }
        RegistrationSections100GetRequest rhs = ((RegistrationSections100GetRequest) other);
        return (((((((((((((((((this.criteriaQuerySchdCode == rhs.criteriaQuerySchdCode)||((this.criteriaQuerySchdCode!= null)&&this.criteriaQuerySchdCode.equals(rhs.criteriaQuerySchdCode)))&&((this.criteriaBeginTime == rhs.criteriaBeginTime)||((this.criteriaBeginTime!= null)&&this.criteriaBeginTime.equals(rhs.criteriaBeginTime))))&&((this.criteriaQueryLinkIdent == rhs.criteriaQueryLinkIdent)||((this.criteriaQueryLinkIdent!= null)&&this.criteriaQueryLinkIdent.equals(rhs.criteriaQueryLinkIdent))))&&((this.criteriaQueryXlstGroup == rhs.criteriaQueryXlstGroup)||((this.criteriaQueryXlstGroup!= null)&&this.criteriaQueryXlstGroup.equals(rhs.criteriaQueryXlstGroup))))&&((this.criteriaQuerySeqNumb == rhs.criteriaQuerySeqNumb)||((this.criteriaQuerySeqNumb!= null)&&this.criteriaQuerySeqNumb.equals(rhs.criteriaQuerySeqNumb))))&&((this.criteriaQueryPtrmCode == rhs.criteriaQueryPtrmCode)||((this.criteriaQueryPtrmCode!= null)&&this.criteriaQueryPtrmCode.equals(rhs.criteriaQueryPtrmCode))))&&((this.criteriaSeatsAvail == rhs.criteriaSeatsAvail)||((this.criteriaSeatsAvail!= null)&&this.criteriaSeatsAvail.equals(rhs.criteriaSeatsAvail))))&&((this.criteriaQueryCrseNumb == rhs.criteriaQueryCrseNumb)||((this.criteriaQueryCrseNumb!= null)&&this.criteriaQueryCrseNumb.equals(rhs.criteriaQueryCrseNumb))))&&((this.criteriaQuerySstsCode == rhs.criteriaQuerySstsCode)||((this.criteriaQuerySstsCode!= null)&&this.criteriaQuerySstsCode.equals(rhs.criteriaQuerySstsCode))))&&((this.criteriaQueryCampCode == rhs.criteriaQueryCampCode)||((this.criteriaQueryCampCode!= null)&&this.criteriaQueryCampCode.equals(rhs.criteriaQueryCampCode))))&&((this.criteriaQuerySubjCode == rhs.criteriaQuerySubjCode)||((this.criteriaQuerySubjCode!= null)&&this.criteriaQuerySubjCode.equals(rhs.criteriaQuerySubjCode))))&&((this.criteriaEndTime == rhs.criteriaEndTime)||((this.criteriaEndTime!= null)&&this.criteriaEndTime.equals(rhs.criteriaEndTime))))&&((this.criteriaWaitCount == rhs.criteriaWaitCount)||((this.criteriaWaitCount!= null)&&this.criteriaWaitCount.equals(rhs.criteriaWaitCount))))&&((this.criteriaQueryCrn == rhs.criteriaQueryCrn)||((this.criteriaQueryCrn!= null)&&this.criteriaQueryCrn.equals(rhs.criteriaQueryCrn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaBlockInd == rhs.criteriaBlockInd)||((this.criteriaBlockInd!= null)&&this.criteriaBlockInd.equals(rhs.criteriaBlockInd))));
    }

}
