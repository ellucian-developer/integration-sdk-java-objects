
package com.ellucian.generated.bpapi.ban.prior_college_prior_college_and_degree.v1_0_0;

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
    "criteria.honrCode",
    "criteria.admrCode",
    "gpaTransferred",
    "degcDate",
    "criteria.collCode",
    "degcCode",
    "criteria.transRecvDate",
    "transRecvDate",
    "degcYear",
    "criteria.attendTo",
    "transRevDate",
    "criteria.hoursTransferred",
    "criteria.gpaTransferred",
    "id",
    "criteria.officialTrans",
    "criteria.degcYear",
    "hoursTransferred",
    "criteria.degcDate",
    "criteria.degcCode",
    "criteria.egolCode",
    "criteria.transRevDate",
    "attendTo",
    "attendFrom",
    "honrCode",
    "admrCode",
    "criteria.primaryInd",
    "criteria.attendFrom",
    "officialTrans",
    "egolCode",
    "collCode",
    "criteria.sbgiCode",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class PriorCollegePriorCollegeAndDegree100PutRequest {

    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("criteria.honrCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr")
    private String criteriaHonrCode;
    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String criteriaAdmrCode;
    /**
     * GPA
     * <p>
     * Lineage reference object : SORDEGR_GPA_TRANSFERRED
     * 
     */
    @JsonProperty("gpaTransferred")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_GPA_TRANSFERRED")
    private Double gpaTransferred;
    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_DATE")
    private Date degcDate;
    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String degcCode;
    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_RECV_DATE")
    private Date criteriaTransRecvDate;
    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_RECV_DATE")
    private Date transRecvDate;
    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("degcYear")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_YEAR")
    private String degcYear;
    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("criteria.attendTo")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_TO")
    private Date criteriaAttendTo;
    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_REV_DATE")
    private Date transRevDate;
    /**
     * Transfer Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("criteria.hoursTransferred")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HOURS_TRANSFERRED")
    private Double criteriaHoursTransferred;
    /**
     * GPA
     * <p>
     * Lineage reference object : SORDEGR_GPA_TRANSFERRED
     * 
     */
    @JsonProperty("criteria.gpaTransferred")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_GPA_TRANSFERRED")
    private Double criteriaGpaTransferred;
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
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("criteria.officialTrans")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_OFFICIAL_TRANS")
    private String criteriaOfficialTrans;
    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("criteria.degcYear")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_YEAR")
    private String criteriaDegcYear;
    /**
     * Transfer Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HOURS_TRANSFERRED")
    private Double hoursTransferred;
    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("criteria.degcDate")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_DATE")
    private Date criteriaDegcDate;
    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String criteriaDegcCode;
    /**
     * Goal
     * <p>
     * Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("criteria.egolCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String criteriaEgolCode;
    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("criteria.transRevDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_REV_DATE")
    private Date criteriaTransRevDate;
    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_TO")
    private Date attendTo;
    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_FROM")
    private Date attendFrom;
    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("honrCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr")
    private String honrCode;
    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Primary Degree Indicator
     * <p>
     * Lineage reference object : SORDEGR_PRIMARY_IND
     * 
     */
    @JsonProperty("criteria.primaryInd")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_PRIMARY_IND")
    private String criteriaPrimaryInd;
    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("criteria.attendFrom")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_FROM")
    private Date criteriaAttendFrom;
    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("officialTrans")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_OFFICIAL_TRANS")
    private String officialTrans;
    /**
     * Goal
     * <p>
     * Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol")
    private String egolCode;
    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_SBGI_CODE")
    private String criteriaSbgiCode;
    /**
     * Primary Degree Indicator
     * <p>
     * Lineage reference object : SORDEGR_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_PRIMARY_IND")
    private String primaryInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("criteria.honrCode")
    public String getCriteriaHonrCode() {
        return criteriaHonrCode;
    }

    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("criteria.honrCode")
    public void setCriteriaHonrCode(String criteriaHonrCode) {
        this.criteriaHonrCode = criteriaHonrCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaHonrCode(String criteriaHonrCode) {
        this.criteriaHonrCode = criteriaHonrCode;
        return this;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public String getCriteriaAdmrCode() {
        return criteriaAdmrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("criteria.admrCode")
    public void setCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaAdmrCode(String criteriaAdmrCode) {
        this.criteriaAdmrCode = criteriaAdmrCode;
        return this;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORDEGR_GPA_TRANSFERRED
     * 
     */
    @JsonProperty("gpaTransferred")
    public Double getGpaTransferred() {
        return gpaTransferred;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORDEGR_GPA_TRANSFERRED
     * 
     */
    @JsonProperty("gpaTransferred")
    public void setGpaTransferred(Double gpaTransferred) {
        this.gpaTransferred = gpaTransferred;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withGpaTransferred(Double gpaTransferred) {
        this.gpaTransferred = gpaTransferred;
        return this;
    }

    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    public Date getDegcDate() {
        return degcDate;
    }

    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    public void setDegcDate(Date degcDate) {
        this.degcDate = degcDate;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withDegcDate(Date degcDate) {
        this.degcDate = degcDate;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    public Date getCriteriaTransRecvDate() {
        return criteriaTransRecvDate;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    public void setCriteriaTransRecvDate(Date criteriaTransRecvDate) {
        this.criteriaTransRecvDate = criteriaTransRecvDate;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaTransRecvDate(Date criteriaTransRecvDate) {
        this.criteriaTransRecvDate = criteriaTransRecvDate;
        return this;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public Date getTransRecvDate() {
        return transRecvDate;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public void setTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("degcYear")
    public String getDegcYear() {
        return degcYear;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("degcYear")
    public void setDegcYear(String degcYear) {
        this.degcYear = degcYear;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withDegcYear(String degcYear) {
        this.degcYear = degcYear;
        return this;
    }

    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("criteria.attendTo")
    public Date getCriteriaAttendTo() {
        return criteriaAttendTo;
    }

    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("criteria.attendTo")
    public void setCriteriaAttendTo(Date criteriaAttendTo) {
        this.criteriaAttendTo = criteriaAttendTo;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaAttendTo(Date criteriaAttendTo) {
        this.criteriaAttendTo = criteriaAttendTo;
        return this;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    public Date getTransRevDate() {
        return transRevDate;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    public void setTransRevDate(Date transRevDate) {
        this.transRevDate = transRevDate;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withTransRevDate(Date transRevDate) {
        this.transRevDate = transRevDate;
        return this;
    }

    /**
     * Transfer Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("criteria.hoursTransferred")
    public Double getCriteriaHoursTransferred() {
        return criteriaHoursTransferred;
    }

    /**
     * Transfer Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("criteria.hoursTransferred")
    public void setCriteriaHoursTransferred(Double criteriaHoursTransferred) {
        this.criteriaHoursTransferred = criteriaHoursTransferred;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaHoursTransferred(Double criteriaHoursTransferred) {
        this.criteriaHoursTransferred = criteriaHoursTransferred;
        return this;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORDEGR_GPA_TRANSFERRED
     * 
     */
    @JsonProperty("criteria.gpaTransferred")
    public Double getCriteriaGpaTransferred() {
        return criteriaGpaTransferred;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORDEGR_GPA_TRANSFERRED
     * 
     */
    @JsonProperty("criteria.gpaTransferred")
    public void setCriteriaGpaTransferred(Double criteriaGpaTransferred) {
        this.criteriaGpaTransferred = criteriaGpaTransferred;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaGpaTransferred(Double criteriaGpaTransferred) {
        this.criteriaGpaTransferred = criteriaGpaTransferred;
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

    public PriorCollegePriorCollegeAndDegree100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("criteria.officialTrans")
    public String getCriteriaOfficialTrans() {
        return criteriaOfficialTrans;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("criteria.officialTrans")
    public void setCriteriaOfficialTrans(String criteriaOfficialTrans) {
        this.criteriaOfficialTrans = criteriaOfficialTrans;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaOfficialTrans(String criteriaOfficialTrans) {
        this.criteriaOfficialTrans = criteriaOfficialTrans;
        return this;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("criteria.degcYear")
    public String getCriteriaDegcYear() {
        return criteriaDegcYear;
    }

    /**
     * Year
     * <p>
     * Lineage reference object : SORDEGR_DEGC_YEAR
     * 
     */
    @JsonProperty("criteria.degcYear")
    public void setCriteriaDegcYear(String criteriaDegcYear) {
        this.criteriaDegcYear = criteriaDegcYear;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaDegcYear(String criteriaDegcYear) {
        this.criteriaDegcYear = criteriaDegcYear;
        return this;
    }

    /**
     * Transfer Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    public Double getHoursTransferred() {
        return hoursTransferred;
    }

    /**
     * Transfer Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    public void setHoursTransferred(Double hoursTransferred) {
        this.hoursTransferred = hoursTransferred;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withHoursTransferred(Double hoursTransferred) {
        this.hoursTransferred = hoursTransferred;
        return this;
    }

    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("criteria.degcDate")
    public Date getCriteriaDegcDate() {
        return criteriaDegcDate;
    }

    /**
     * Degree Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("criteria.degcDate")
    public void setCriteriaDegcDate(Date criteriaDegcDate) {
        this.criteriaDegcDate = criteriaDegcDate;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaDegcDate(Date criteriaDegcDate) {
        this.criteriaDegcDate = criteriaDegcDate;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    public String getCriteriaDegcCode() {
        return criteriaDegcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("criteria.degcCode")
    public void setCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
        return this;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("criteria.egolCode")
    public String getCriteriaEgolCode() {
        return criteriaEgolCode;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("criteria.egolCode")
    public void setCriteriaEgolCode(String criteriaEgolCode) {
        this.criteriaEgolCode = criteriaEgolCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaEgolCode(String criteriaEgolCode) {
        this.criteriaEgolCode = criteriaEgolCode;
        return this;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("criteria.transRevDate")
    public Date getCriteriaTransRevDate() {
        return criteriaTransRevDate;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("criteria.transRevDate")
    public void setCriteriaTransRevDate(Date criteriaTransRevDate) {
        this.criteriaTransRevDate = criteriaTransRevDate;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaTransRevDate(Date criteriaTransRevDate) {
        this.criteriaTransRevDate = criteriaTransRevDate;
        return this;
    }

    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    public Date getAttendTo() {
        return attendTo;
    }

    /**
     * Attended To
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    public void setAttendTo(Date attendTo) {
        this.attendTo = attendTo;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withAttendTo(Date attendTo) {
        this.attendTo = attendTo;
        return this;
    }

    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    public Date getAttendFrom() {
        return attendFrom;
    }

    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    public void setAttendFrom(Date attendFrom) {
        this.attendFrom = attendFrom;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withAttendFrom(Date attendFrom) {
        this.attendFrom = attendFrom;
        return this;
    }

    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("honrCode")
    public String getHonrCode() {
        return honrCode;
    }

    /**
     * Honors
     * <p>
     * Lineage reference object : SORDEGR_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("honrCode")
    public void setHonrCode(String honrCode) {
        this.honrCode = honrCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withHonrCode(String honrCode) {
        this.honrCode = honrCode;
        return this;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Primary Degree Indicator
     * <p>
     * Lineage reference object : SORDEGR_PRIMARY_IND
     * 
     */
    @JsonProperty("criteria.primaryInd")
    public String getCriteriaPrimaryInd() {
        return criteriaPrimaryInd;
    }

    /**
     * Primary Degree Indicator
     * <p>
     * Lineage reference object : SORDEGR_PRIMARY_IND
     * 
     */
    @JsonProperty("criteria.primaryInd")
    public void setCriteriaPrimaryInd(String criteriaPrimaryInd) {
        this.criteriaPrimaryInd = criteriaPrimaryInd;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaPrimaryInd(String criteriaPrimaryInd) {
        this.criteriaPrimaryInd = criteriaPrimaryInd;
        return this;
    }

    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("criteria.attendFrom")
    public Date getCriteriaAttendFrom() {
        return criteriaAttendFrom;
    }

    /**
     * Attended From
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("criteria.attendFrom")
    public void setCriteriaAttendFrom(Date criteriaAttendFrom) {
        this.criteriaAttendFrom = criteriaAttendFrom;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaAttendFrom(Date criteriaAttendFrom) {
        this.criteriaAttendFrom = criteriaAttendFrom;
        return this;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("officialTrans")
    public String getOfficialTrans() {
        return officialTrans;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("officialTrans")
    public void setOfficialTrans(String officialTrans) {
        this.officialTrans = officialTrans;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withOfficialTrans(String officialTrans) {
        this.officialTrans = officialTrans;
        return this;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public String getEgolCode() {
        return egolCode;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SORDEGR_EGOL_CODE, Lookup lineage reference object : stvegol
     * 
     */
    @JsonProperty("egolCode")
    public void setEgolCode(String egolCode) {
        this.egolCode = egolCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withEgolCode(String egolCode) {
        this.egolCode = egolCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORDEGR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public String getCriteriaSbgiCode() {
        return criteriaSbgiCode;
    }

    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public void setCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
        return this;
    }

    /**
     * Primary Degree Indicator
     * <p>
     * Lineage reference object : SORDEGR_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Primary Degree Indicator
     * <p>
     * Lineage reference object : SORDEGR_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public PriorCollegePriorCollegeAndDegree100PutRequest withPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
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

    public PriorCollegePriorCollegeAndDegree100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriorCollegePriorCollegeAndDegree100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaHonrCode");
        sb.append('=');
        sb.append(((this.criteriaHonrCode == null)?"<null>":this.criteriaHonrCode));
        sb.append(',');
        sb.append("criteriaAdmrCode");
        sb.append('=');
        sb.append(((this.criteriaAdmrCode == null)?"<null>":this.criteriaAdmrCode));
        sb.append(',');
        sb.append("gpaTransferred");
        sb.append('=');
        sb.append(((this.gpaTransferred == null)?"<null>":this.gpaTransferred));
        sb.append(',');
        sb.append("degcDate");
        sb.append('=');
        sb.append(((this.degcDate == null)?"<null>":this.degcDate));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("criteriaTransRecvDate");
        sb.append('=');
        sb.append(((this.criteriaTransRecvDate == null)?"<null>":this.criteriaTransRecvDate));
        sb.append(',');
        sb.append("transRecvDate");
        sb.append('=');
        sb.append(((this.transRecvDate == null)?"<null>":this.transRecvDate));
        sb.append(',');
        sb.append("degcYear");
        sb.append('=');
        sb.append(((this.degcYear == null)?"<null>":this.degcYear));
        sb.append(',');
        sb.append("criteriaAttendTo");
        sb.append('=');
        sb.append(((this.criteriaAttendTo == null)?"<null>":this.criteriaAttendTo));
        sb.append(',');
        sb.append("transRevDate");
        sb.append('=');
        sb.append(((this.transRevDate == null)?"<null>":this.transRevDate));
        sb.append(',');
        sb.append("criteriaHoursTransferred");
        sb.append('=');
        sb.append(((this.criteriaHoursTransferred == null)?"<null>":this.criteriaHoursTransferred));
        sb.append(',');
        sb.append("criteriaGpaTransferred");
        sb.append('=');
        sb.append(((this.criteriaGpaTransferred == null)?"<null>":this.criteriaGpaTransferred));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaOfficialTrans");
        sb.append('=');
        sb.append(((this.criteriaOfficialTrans == null)?"<null>":this.criteriaOfficialTrans));
        sb.append(',');
        sb.append("criteriaDegcYear");
        sb.append('=');
        sb.append(((this.criteriaDegcYear == null)?"<null>":this.criteriaDegcYear));
        sb.append(',');
        sb.append("hoursTransferred");
        sb.append('=');
        sb.append(((this.hoursTransferred == null)?"<null>":this.hoursTransferred));
        sb.append(',');
        sb.append("criteriaDegcDate");
        sb.append('=');
        sb.append(((this.criteriaDegcDate == null)?"<null>":this.criteriaDegcDate));
        sb.append(',');
        sb.append("criteriaDegcCode");
        sb.append('=');
        sb.append(((this.criteriaDegcCode == null)?"<null>":this.criteriaDegcCode));
        sb.append(',');
        sb.append("criteriaEgolCode");
        sb.append('=');
        sb.append(((this.criteriaEgolCode == null)?"<null>":this.criteriaEgolCode));
        sb.append(',');
        sb.append("criteriaTransRevDate");
        sb.append('=');
        sb.append(((this.criteriaTransRevDate == null)?"<null>":this.criteriaTransRevDate));
        sb.append(',');
        sb.append("attendTo");
        sb.append('=');
        sb.append(((this.attendTo == null)?"<null>":this.attendTo));
        sb.append(',');
        sb.append("attendFrom");
        sb.append('=');
        sb.append(((this.attendFrom == null)?"<null>":this.attendFrom));
        sb.append(',');
        sb.append("honrCode");
        sb.append('=');
        sb.append(((this.honrCode == null)?"<null>":this.honrCode));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("criteriaPrimaryInd");
        sb.append('=');
        sb.append(((this.criteriaPrimaryInd == null)?"<null>":this.criteriaPrimaryInd));
        sb.append(',');
        sb.append("criteriaAttendFrom");
        sb.append('=');
        sb.append(((this.criteriaAttendFrom == null)?"<null>":this.criteriaAttendFrom));
        sb.append(',');
        sb.append("officialTrans");
        sb.append('=');
        sb.append(((this.officialTrans == null)?"<null>":this.officialTrans));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("criteriaSbgiCode");
        sb.append('=');
        sb.append(((this.criteriaSbgiCode == null)?"<null>":this.criteriaSbgiCode));
        sb.append(',');
        sb.append("primaryInd");
        sb.append('=');
        sb.append(((this.primaryInd == null)?"<null>":this.primaryInd));
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
        result = ((result* 31)+((this.criteriaDegcDate == null)? 0 :this.criteriaDegcDate.hashCode()));
        result = ((result* 31)+((this.gpaTransferred == null)? 0 :this.gpaTransferred.hashCode()));
        result = ((result* 31)+((this.criteriaDegcCode == null)? 0 :this.criteriaDegcCode.hashCode()));
        result = ((result* 31)+((this.criteriaSbgiCode == null)? 0 :this.criteriaSbgiCode.hashCode()));
        result = ((result* 31)+((this.criteriaOfficialTrans == null)? 0 :this.criteriaOfficialTrans.hashCode()));
        result = ((result* 31)+((this.degcDate == null)? 0 :this.degcDate.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.criteriaDegcYear == null)? 0 :this.criteriaDegcYear.hashCode()));
        result = ((result* 31)+((this.transRecvDate == null)? 0 :this.transRecvDate.hashCode()));
        result = ((result* 31)+((this.criteriaAttendTo == null)? 0 :this.criteriaAttendTo.hashCode()));
        result = ((result* 31)+((this.degcYear == null)? 0 :this.degcYear.hashCode()));
        result = ((result* 31)+((this.criteriaTransRecvDate == null)? 0 :this.criteriaTransRecvDate.hashCode()));
        result = ((result* 31)+((this.criteriaHoursTransferred == null)? 0 :this.criteriaHoursTransferred.hashCode()));
        result = ((result* 31)+((this.transRevDate == null)? 0 :this.transRevDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.hoursTransferred == null)? 0 :this.hoursTransferred.hashCode()));
        result = ((result* 31)+((this.criteriaHonrCode == null)? 0 :this.criteriaHonrCode.hashCode()));
        result = ((result* 31)+((this.criteriaAdmrCode == null)? 0 :this.criteriaAdmrCode.hashCode()));
        result = ((result* 31)+((this.criteriaAttendFrom == null)? 0 :this.criteriaAttendFrom.hashCode()));
        result = ((result* 31)+((this.criteriaGpaTransferred == null)? 0 :this.criteriaGpaTransferred.hashCode()));
        result = ((result* 31)+((this.attendTo == null)? 0 :this.attendTo.hashCode()));
        result = ((result* 31)+((this.attendFrom == null)? 0 :this.attendFrom.hashCode()));
        result = ((result* 31)+((this.honrCode == null)? 0 :this.honrCode.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.criteriaEgolCode == null)? 0 :this.criteriaEgolCode.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.criteriaTransRevDate == null)? 0 :this.criteriaTransRevDate.hashCode()));
        result = ((result* 31)+((this.officialTrans == null)? 0 :this.officialTrans.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.criteriaPrimaryInd == null)? 0 :this.criteriaPrimaryInd.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriorCollegePriorCollegeAndDegree100PutRequest) == false) {
            return false;
        }
        PriorCollegePriorCollegeAndDegree100PutRequest rhs = ((PriorCollegePriorCollegeAndDegree100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((this.criteriaDegcDate == rhs.criteriaDegcDate)||((this.criteriaDegcDate!= null)&&this.criteriaDegcDate.equals(rhs.criteriaDegcDate)))&&((this.gpaTransferred == rhs.gpaTransferred)||((this.gpaTransferred!= null)&&this.gpaTransferred.equals(rhs.gpaTransferred))))&&((this.criteriaDegcCode == rhs.criteriaDegcCode)||((this.criteriaDegcCode!= null)&&this.criteriaDegcCode.equals(rhs.criteriaDegcCode))))&&((this.criteriaSbgiCode == rhs.criteriaSbgiCode)||((this.criteriaSbgiCode!= null)&&this.criteriaSbgiCode.equals(rhs.criteriaSbgiCode))))&&((this.criteriaOfficialTrans == rhs.criteriaOfficialTrans)||((this.criteriaOfficialTrans!= null)&&this.criteriaOfficialTrans.equals(rhs.criteriaOfficialTrans))))&&((this.degcDate == rhs.degcDate)||((this.degcDate!= null)&&this.degcDate.equals(rhs.degcDate))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.criteriaDegcYear == rhs.criteriaDegcYear)||((this.criteriaDegcYear!= null)&&this.criteriaDegcYear.equals(rhs.criteriaDegcYear))))&&((this.transRecvDate == rhs.transRecvDate)||((this.transRecvDate!= null)&&this.transRecvDate.equals(rhs.transRecvDate))))&&((this.criteriaAttendTo == rhs.criteriaAttendTo)||((this.criteriaAttendTo!= null)&&this.criteriaAttendTo.equals(rhs.criteriaAttendTo))))&&((this.degcYear == rhs.degcYear)||((this.degcYear!= null)&&this.degcYear.equals(rhs.degcYear))))&&((this.criteriaTransRecvDate == rhs.criteriaTransRecvDate)||((this.criteriaTransRecvDate!= null)&&this.criteriaTransRecvDate.equals(rhs.criteriaTransRecvDate))))&&((this.criteriaHoursTransferred == rhs.criteriaHoursTransferred)||((this.criteriaHoursTransferred!= null)&&this.criteriaHoursTransferred.equals(rhs.criteriaHoursTransferred))))&&((this.transRevDate == rhs.transRevDate)||((this.transRevDate!= null)&&this.transRevDate.equals(rhs.transRevDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.hoursTransferred == rhs.hoursTransferred)||((this.hoursTransferred!= null)&&this.hoursTransferred.equals(rhs.hoursTransferred))))&&((this.criteriaHonrCode == rhs.criteriaHonrCode)||((this.criteriaHonrCode!= null)&&this.criteriaHonrCode.equals(rhs.criteriaHonrCode))))&&((this.criteriaAdmrCode == rhs.criteriaAdmrCode)||((this.criteriaAdmrCode!= null)&&this.criteriaAdmrCode.equals(rhs.criteriaAdmrCode))))&&((this.criteriaAttendFrom == rhs.criteriaAttendFrom)||((this.criteriaAttendFrom!= null)&&this.criteriaAttendFrom.equals(rhs.criteriaAttendFrom))))&&((this.criteriaGpaTransferred == rhs.criteriaGpaTransferred)||((this.criteriaGpaTransferred!= null)&&this.criteriaGpaTransferred.equals(rhs.criteriaGpaTransferred))))&&((this.attendTo == rhs.attendTo)||((this.attendTo!= null)&&this.attendTo.equals(rhs.attendTo))))&&((this.attendFrom == rhs.attendFrom)||((this.attendFrom!= null)&&this.attendFrom.equals(rhs.attendFrom))))&&((this.honrCode == rhs.honrCode)||((this.honrCode!= null)&&this.honrCode.equals(rhs.honrCode))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.criteriaEgolCode == rhs.criteriaEgolCode)||((this.criteriaEgolCode!= null)&&this.criteriaEgolCode.equals(rhs.criteriaEgolCode))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.criteriaTransRevDate == rhs.criteriaTransRevDate)||((this.criteriaTransRevDate!= null)&&this.criteriaTransRevDate.equals(rhs.criteriaTransRevDate))))&&((this.officialTrans == rhs.officialTrans)||((this.officialTrans!= null)&&this.officialTrans.equals(rhs.officialTrans))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.criteriaPrimaryInd == rhs.criteriaPrimaryInd)||((this.criteriaPrimaryInd!= null)&&this.criteriaPrimaryInd.equals(rhs.criteriaPrimaryInd))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
