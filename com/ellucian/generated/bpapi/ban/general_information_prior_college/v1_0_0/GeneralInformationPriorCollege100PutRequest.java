
package com.ellucian.generated.bpapi.ban.general_information_prior_college.v1_0_0;

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
    "gpaTransferred",
    "termDegree",
    "degcDate",
    "criteria.transRecvDate",
    "criteria.majrCodeMinor",
    "majrCodeMinor",
    "transRecvDate",
    "criteria.attendTo",
    "transRevDate",
    "criteria.hoursTransferred",
    "criteria.gpaTransferred",
    "id",
    "criteria.majrCodeConc",
    "criteria.officialTrans",
    "hoursTransferred",
    "criteria.degcDate",
    "criteria.degcCode",
    "majrCodeConc",
    "criteria.transRevDate",
    "attendTo",
    "criteria.majrCodeMajor",
    "majrCodeMajor",
    "attendFrom",
    "criteria.termDegree",
    "criteria.attendFrom",
    "officialTrans",
    "criteria.sbgiCode"
})
@Generated("jsonschema2pojo")
public class GeneralInformationPriorCollege100PutRequest {

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
     * Terminal Degree
     * <p>
     * Lineage reference object : SORDEGR_TERM_DEGREE
     * 
     */
    @JsonProperty("termDegree")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_TERM_DEGREE")
    private String termDegree;
    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_DATE")
    private Date degcDate;
    /**
     * Receipt Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_RECV_DATE")
    private Date criteriaTransRecvDate;
    /**
     * Minor
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCodeMinor")
    @JsonPropertyDescription("Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr")
    private String criteriaMajrCodeMinor;
    /**
     * Minor
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMinor")
    @JsonPropertyDescription("Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr")
    private String majrCodeMinor;
    /**
     * Receipt Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_RECV_DATE")
    private Date transRecvDate;
    /**
     * Last Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("criteria.attendTo")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_TO")
    private Date criteriaAttendTo;
    /**
     * Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_REV_DATE")
    private Date transRevDate;
    /**
     * Hours
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
    private Object id;
    /**
     * Area of Concentration
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCodeConc")
    @JsonPropertyDescription("Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr")
    private String criteriaMajrCodeConc;
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
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_HOURS_TRANSFERRED")
    private Double hoursTransferred;
    /**
     * Graduation Date
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
     * (Required)
     * 
     */
    @JsonProperty("criteria.degcCode")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String criteriaDegcCode;
    /**
     * Area of Concentration
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeConc")
    @JsonPropertyDescription("Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr")
    private String majrCodeConc;
    /**
     * Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("criteria.transRevDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_REV_DATE")
    private Date criteriaTransRevDate;
    /**
     * Last Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_TO")
    private Date attendTo;
    /**
     * Major
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCodeMajor")
    @JsonPropertyDescription("Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr")
    private String criteriaMajrCodeMajor;
    /**
     * Major
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMajor")
    @JsonPropertyDescription("Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr")
    private String majrCodeMajor;
    /**
     * First Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_ATTEND_FROM")
    private Date attendFrom;
    /**
     * Terminal Degree
     * <p>
     * Lineage reference object : SORDEGR_TERM_DEGREE
     * 
     */
    @JsonProperty("criteria.termDegree")
    @JsonPropertyDescription("Lineage reference object : SORDEGR_TERM_DEGREE")
    private String criteriaTermDegree;
    /**
     * First Attended Date
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
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String criteriaSbgiCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public GeneralInformationPriorCollege100PutRequest withGpaTransferred(Double gpaTransferred) {
        this.gpaTransferred = gpaTransferred;
        return this;
    }

    /**
     * Terminal Degree
     * <p>
     * Lineage reference object : SORDEGR_TERM_DEGREE
     * 
     */
    @JsonProperty("termDegree")
    public String getTermDegree() {
        return termDegree;
    }

    /**
     * Terminal Degree
     * <p>
     * Lineage reference object : SORDEGR_TERM_DEGREE
     * 
     */
    @JsonProperty("termDegree")
    public void setTermDegree(String termDegree) {
        this.termDegree = termDegree;
    }

    public GeneralInformationPriorCollege100PutRequest withTermDegree(String termDegree) {
        this.termDegree = termDegree;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    public Date getDegcDate() {
        return degcDate;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("degcDate")
    public void setDegcDate(Date degcDate) {
        this.degcDate = degcDate;
    }

    public GeneralInformationPriorCollege100PutRequest withDegcDate(Date degcDate) {
        this.degcDate = degcDate;
        return this;
    }

    /**
     * Receipt Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    public Date getCriteriaTransRecvDate() {
        return criteriaTransRecvDate;
    }

    /**
     * Receipt Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("criteria.transRecvDate")
    public void setCriteriaTransRecvDate(Date criteriaTransRecvDate) {
        this.criteriaTransRecvDate = criteriaTransRecvDate;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaTransRecvDate(Date criteriaTransRecvDate) {
        this.criteriaTransRecvDate = criteriaTransRecvDate;
        return this;
    }

    /**
     * Minor
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCodeMinor")
    public String getCriteriaMajrCodeMinor() {
        return criteriaMajrCodeMinor;
    }

    /**
     * Minor
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCodeMinor")
    public void setCriteriaMajrCodeMinor(String criteriaMajrCodeMinor) {
        this.criteriaMajrCodeMinor = criteriaMajrCodeMinor;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaMajrCodeMinor(String criteriaMajrCodeMinor) {
        this.criteriaMajrCodeMinor = criteriaMajrCodeMinor;
        return this;
    }

    /**
     * Minor
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMinor")
    public String getMajrCodeMinor() {
        return majrCodeMinor;
    }

    /**
     * Minor
     * <p>
     * Lineage reference object : SORMINR_MAJR_CODE_MINOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMinor")
    public void setMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
    }

    public GeneralInformationPriorCollege100PutRequest withMajrCodeMinor(String majrCodeMinor) {
        this.majrCodeMinor = majrCodeMinor;
        return this;
    }

    /**
     * Receipt Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public Date getTransRecvDate() {
        return transRecvDate;
    }

    /**
     * Receipt Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public void setTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
    }

    public GeneralInformationPriorCollege100PutRequest withTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
        return this;
    }

    /**
     * Last Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("criteria.attendTo")
    public Date getCriteriaAttendTo() {
        return criteriaAttendTo;
    }

    /**
     * Last Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("criteria.attendTo")
    public void setCriteriaAttendTo(Date criteriaAttendTo) {
        this.criteriaAttendTo = criteriaAttendTo;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaAttendTo(Date criteriaAttendTo) {
        this.criteriaAttendTo = criteriaAttendTo;
        return this;
    }

    /**
     * Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    public Date getTransRevDate() {
        return transRevDate;
    }

    /**
     * Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    public void setTransRevDate(Date transRevDate) {
        this.transRevDate = transRevDate;
    }

    public GeneralInformationPriorCollege100PutRequest withTransRevDate(Date transRevDate) {
        this.transRevDate = transRevDate;
        return this;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("criteria.hoursTransferred")
    public Double getCriteriaHoursTransferred() {
        return criteriaHoursTransferred;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("criteria.hoursTransferred")
    public void setCriteriaHoursTransferred(Double criteriaHoursTransferred) {
        this.criteriaHoursTransferred = criteriaHoursTransferred;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaHoursTransferred(Double criteriaHoursTransferred) {
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

    public GeneralInformationPriorCollege100PutRequest withCriteriaGpaTransferred(Double criteriaGpaTransferred) {
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

    public GeneralInformationPriorCollege100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Area of Concentration
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCodeConc")
    public String getCriteriaMajrCodeConc() {
        return criteriaMajrCodeConc;
    }

    /**
     * Area of Concentration
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCodeConc")
    public void setCriteriaMajrCodeConc(String criteriaMajrCodeConc) {
        this.criteriaMajrCodeConc = criteriaMajrCodeConc;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaMajrCodeConc(String criteriaMajrCodeConc) {
        this.criteriaMajrCodeConc = criteriaMajrCodeConc;
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

    public GeneralInformationPriorCollege100PutRequest withCriteriaOfficialTrans(String criteriaOfficialTrans) {
        this.criteriaOfficialTrans = criteriaOfficialTrans;
        return this;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    public Double getHoursTransferred() {
        return hoursTransferred;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SORDEGR_HOURS_TRANSFERRED
     * 
     */
    @JsonProperty("hoursTransferred")
    public void setHoursTransferred(Double hoursTransferred) {
        this.hoursTransferred = hoursTransferred;
    }

    public GeneralInformationPriorCollege100PutRequest withHoursTransferred(Double hoursTransferred) {
        this.hoursTransferred = hoursTransferred;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("criteria.degcDate")
    public Date getCriteriaDegcDate() {
        return criteriaDegcDate;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORDEGR_DEGC_DATE
     * 
     */
    @JsonProperty("criteria.degcDate")
    public void setCriteriaDegcDate(Date criteriaDegcDate) {
        this.criteriaDegcDate = criteriaDegcDate;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaDegcDate(Date criteriaDegcDate) {
        this.criteriaDegcDate = criteriaDegcDate;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SORDEGR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("criteria.degcCode")
    public void setCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaDegcCode(String criteriaDegcCode) {
        this.criteriaDegcCode = criteriaDegcCode;
        return this;
    }

    /**
     * Area of Concentration
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeConc")
    public String getMajrCodeConc() {
        return majrCodeConc;
    }

    /**
     * Area of Concentration
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeConc")
    public void setMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
    }

    public GeneralInformationPriorCollege100PutRequest withMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
        return this;
    }

    /**
     * Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("criteria.transRevDate")
    public Date getCriteriaTransRevDate() {
        return criteriaTransRevDate;
    }

    /**
     * Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("criteria.transRevDate")
    public void setCriteriaTransRevDate(Date criteriaTransRevDate) {
        this.criteriaTransRevDate = criteriaTransRevDate;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaTransRevDate(Date criteriaTransRevDate) {
        this.criteriaTransRevDate = criteriaTransRevDate;
        return this;
    }

    /**
     * Last Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    public Date getAttendTo() {
        return attendTo;
    }

    /**
     * Last Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_TO
     * 
     */
    @JsonProperty("attendTo")
    public void setAttendTo(Date attendTo) {
        this.attendTo = attendTo;
    }

    public GeneralInformationPriorCollege100PutRequest withAttendTo(Date attendTo) {
        this.attendTo = attendTo;
        return this;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCodeMajor")
    public String getCriteriaMajrCodeMajor() {
        return criteriaMajrCodeMajor;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("criteria.majrCodeMajor")
    public void setCriteriaMajrCodeMajor(String criteriaMajrCodeMajor) {
        this.criteriaMajrCodeMajor = criteriaMajrCodeMajor;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaMajrCodeMajor(String criteriaMajrCodeMajor) {
        this.criteriaMajrCodeMajor = criteriaMajrCodeMajor;
        return this;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMajor")
    public String getMajrCodeMajor() {
        return majrCodeMajor;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMajor")
    public void setMajrCodeMajor(String majrCodeMajor) {
        this.majrCodeMajor = majrCodeMajor;
    }

    public GeneralInformationPriorCollege100PutRequest withMajrCodeMajor(String majrCodeMajor) {
        this.majrCodeMajor = majrCodeMajor;
        return this;
    }

    /**
     * First Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    public Date getAttendFrom() {
        return attendFrom;
    }

    /**
     * First Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("attendFrom")
    public void setAttendFrom(Date attendFrom) {
        this.attendFrom = attendFrom;
    }

    public GeneralInformationPriorCollege100PutRequest withAttendFrom(Date attendFrom) {
        this.attendFrom = attendFrom;
        return this;
    }

    /**
     * Terminal Degree
     * <p>
     * Lineage reference object : SORDEGR_TERM_DEGREE
     * 
     */
    @JsonProperty("criteria.termDegree")
    public String getCriteriaTermDegree() {
        return criteriaTermDegree;
    }

    /**
     * Terminal Degree
     * <p>
     * Lineage reference object : SORDEGR_TERM_DEGREE
     * 
     */
    @JsonProperty("criteria.termDegree")
    public void setCriteriaTermDegree(String criteriaTermDegree) {
        this.criteriaTermDegree = criteriaTermDegree;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaTermDegree(String criteriaTermDegree) {
        this.criteriaTermDegree = criteriaTermDegree;
        return this;
    }

    /**
     * First Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("criteria.attendFrom")
    public Date getCriteriaAttendFrom() {
        return criteriaAttendFrom;
    }

    /**
     * First Attended Date
     * <p>
     * Lineage reference object : SORDEGR_ATTEND_FROM
     * 
     */
    @JsonProperty("criteria.attendFrom")
    public void setCriteriaAttendFrom(Date criteriaAttendFrom) {
        this.criteriaAttendFrom = criteriaAttendFrom;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaAttendFrom(Date criteriaAttendFrom) {
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

    public GeneralInformationPriorCollege100PutRequest withOfficialTrans(String officialTrans) {
        this.officialTrans = officialTrans;
        return this;
    }

    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public String getCriteriaSbgiCode() {
        return criteriaSbgiCode;
    }

    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * (Required)
     * 
     */
    @JsonProperty("criteria.sbgiCode")
    public void setCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
    }

    public GeneralInformationPriorCollege100PutRequest withCriteriaSbgiCode(String criteriaSbgiCode) {
        this.criteriaSbgiCode = criteriaSbgiCode;
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

    public GeneralInformationPriorCollege100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralInformationPriorCollege100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gpaTransferred");
        sb.append('=');
        sb.append(((this.gpaTransferred == null)?"<null>":this.gpaTransferred));
        sb.append(',');
        sb.append("termDegree");
        sb.append('=');
        sb.append(((this.termDegree == null)?"<null>":this.termDegree));
        sb.append(',');
        sb.append("degcDate");
        sb.append('=');
        sb.append(((this.degcDate == null)?"<null>":this.degcDate));
        sb.append(',');
        sb.append("criteriaTransRecvDate");
        sb.append('=');
        sb.append(((this.criteriaTransRecvDate == null)?"<null>":this.criteriaTransRecvDate));
        sb.append(',');
        sb.append("criteriaMajrCodeMinor");
        sb.append('=');
        sb.append(((this.criteriaMajrCodeMinor == null)?"<null>":this.criteriaMajrCodeMinor));
        sb.append(',');
        sb.append("majrCodeMinor");
        sb.append('=');
        sb.append(((this.majrCodeMinor == null)?"<null>":this.majrCodeMinor));
        sb.append(',');
        sb.append("transRecvDate");
        sb.append('=');
        sb.append(((this.transRecvDate == null)?"<null>":this.transRecvDate));
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
        sb.append("criteriaMajrCodeConc");
        sb.append('=');
        sb.append(((this.criteriaMajrCodeConc == null)?"<null>":this.criteriaMajrCodeConc));
        sb.append(',');
        sb.append("criteriaOfficialTrans");
        sb.append('=');
        sb.append(((this.criteriaOfficialTrans == null)?"<null>":this.criteriaOfficialTrans));
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
        sb.append("majrCodeConc");
        sb.append('=');
        sb.append(((this.majrCodeConc == null)?"<null>":this.majrCodeConc));
        sb.append(',');
        sb.append("criteriaTransRevDate");
        sb.append('=');
        sb.append(((this.criteriaTransRevDate == null)?"<null>":this.criteriaTransRevDate));
        sb.append(',');
        sb.append("attendTo");
        sb.append('=');
        sb.append(((this.attendTo == null)?"<null>":this.attendTo));
        sb.append(',');
        sb.append("criteriaMajrCodeMajor");
        sb.append('=');
        sb.append(((this.criteriaMajrCodeMajor == null)?"<null>":this.criteriaMajrCodeMajor));
        sb.append(',');
        sb.append("majrCodeMajor");
        sb.append('=');
        sb.append(((this.majrCodeMajor == null)?"<null>":this.majrCodeMajor));
        sb.append(',');
        sb.append("attendFrom");
        sb.append('=');
        sb.append(((this.attendFrom == null)?"<null>":this.attendFrom));
        sb.append(',');
        sb.append("criteriaTermDegree");
        sb.append('=');
        sb.append(((this.criteriaTermDegree == null)?"<null>":this.criteriaTermDegree));
        sb.append(',');
        sb.append("criteriaAttendFrom");
        sb.append('=');
        sb.append(((this.criteriaAttendFrom == null)?"<null>":this.criteriaAttendFrom));
        sb.append(',');
        sb.append("officialTrans");
        sb.append('=');
        sb.append(((this.officialTrans == null)?"<null>":this.officialTrans));
        sb.append(',');
        sb.append("criteriaSbgiCode");
        sb.append('=');
        sb.append(((this.criteriaSbgiCode == null)?"<null>":this.criteriaSbgiCode));
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
        result = ((result* 31)+((this.termDegree == null)? 0 :this.termDegree.hashCode()));
        result = ((result* 31)+((this.criteriaOfficialTrans == null)? 0 :this.criteriaOfficialTrans.hashCode()));
        result = ((result* 31)+((this.degcDate == null)? 0 :this.degcDate.hashCode()));
        result = ((result* 31)+((this.criteriaTermDegree == null)? 0 :this.criteriaTermDegree.hashCode()));
        result = ((result* 31)+((this.majrCodeMinor == null)? 0 :this.majrCodeMinor.hashCode()));
        result = ((result* 31)+((this.transRecvDate == null)? 0 :this.transRecvDate.hashCode()));
        result = ((result* 31)+((this.criteriaAttendTo == null)? 0 :this.criteriaAttendTo.hashCode()));
        result = ((result* 31)+((this.criteriaTransRecvDate == null)? 0 :this.criteriaTransRecvDate.hashCode()));
        result = ((result* 31)+((this.criteriaHoursTransferred == null)? 0 :this.criteriaHoursTransferred.hashCode()));
        result = ((result* 31)+((this.criteriaMajrCodeConc == null)? 0 :this.criteriaMajrCodeConc.hashCode()));
        result = ((result* 31)+((this.transRevDate == null)? 0 :this.transRevDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.hoursTransferred == null)? 0 :this.hoursTransferred.hashCode()));
        result = ((result* 31)+((this.criteriaMajrCodeMajor == null)? 0 :this.criteriaMajrCodeMajor.hashCode()));
        result = ((result* 31)+((this.majrCodeConc == null)? 0 :this.majrCodeConc.hashCode()));
        result = ((result* 31)+((this.criteriaAttendFrom == null)? 0 :this.criteriaAttendFrom.hashCode()));
        result = ((result* 31)+((this.criteriaGpaTransferred == null)? 0 :this.criteriaGpaTransferred.hashCode()));
        result = ((result* 31)+((this.attendTo == null)? 0 :this.attendTo.hashCode()));
        result = ((result* 31)+((this.majrCodeMajor == null)? 0 :this.majrCodeMajor.hashCode()));
        result = ((result* 31)+((this.attendFrom == null)? 0 :this.attendFrom.hashCode()));
        result = ((result* 31)+((this.criteriaTransRevDate == null)? 0 :this.criteriaTransRevDate.hashCode()));
        result = ((result* 31)+((this.officialTrans == null)? 0 :this.officialTrans.hashCode()));
        result = ((result* 31)+((this.criteriaMajrCodeMinor == null)? 0 :this.criteriaMajrCodeMinor.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralInformationPriorCollege100PutRequest) == false) {
            return false;
        }
        GeneralInformationPriorCollege100PutRequest rhs = ((GeneralInformationPriorCollege100PutRequest) other);
        return (((((((((((((((((((((((((((((this.criteriaDegcDate == rhs.criteriaDegcDate)||((this.criteriaDegcDate!= null)&&this.criteriaDegcDate.equals(rhs.criteriaDegcDate)))&&((this.gpaTransferred == rhs.gpaTransferred)||((this.gpaTransferred!= null)&&this.gpaTransferred.equals(rhs.gpaTransferred))))&&((this.criteriaDegcCode == rhs.criteriaDegcCode)||((this.criteriaDegcCode!= null)&&this.criteriaDegcCode.equals(rhs.criteriaDegcCode))))&&((this.criteriaSbgiCode == rhs.criteriaSbgiCode)||((this.criteriaSbgiCode!= null)&&this.criteriaSbgiCode.equals(rhs.criteriaSbgiCode))))&&((this.termDegree == rhs.termDegree)||((this.termDegree!= null)&&this.termDegree.equals(rhs.termDegree))))&&((this.criteriaOfficialTrans == rhs.criteriaOfficialTrans)||((this.criteriaOfficialTrans!= null)&&this.criteriaOfficialTrans.equals(rhs.criteriaOfficialTrans))))&&((this.degcDate == rhs.degcDate)||((this.degcDate!= null)&&this.degcDate.equals(rhs.degcDate))))&&((this.criteriaTermDegree == rhs.criteriaTermDegree)||((this.criteriaTermDegree!= null)&&this.criteriaTermDegree.equals(rhs.criteriaTermDegree))))&&((this.majrCodeMinor == rhs.majrCodeMinor)||((this.majrCodeMinor!= null)&&this.majrCodeMinor.equals(rhs.majrCodeMinor))))&&((this.transRecvDate == rhs.transRecvDate)||((this.transRecvDate!= null)&&this.transRecvDate.equals(rhs.transRecvDate))))&&((this.criteriaAttendTo == rhs.criteriaAttendTo)||((this.criteriaAttendTo!= null)&&this.criteriaAttendTo.equals(rhs.criteriaAttendTo))))&&((this.criteriaTransRecvDate == rhs.criteriaTransRecvDate)||((this.criteriaTransRecvDate!= null)&&this.criteriaTransRecvDate.equals(rhs.criteriaTransRecvDate))))&&((this.criteriaHoursTransferred == rhs.criteriaHoursTransferred)||((this.criteriaHoursTransferred!= null)&&this.criteriaHoursTransferred.equals(rhs.criteriaHoursTransferred))))&&((this.criteriaMajrCodeConc == rhs.criteriaMajrCodeConc)||((this.criteriaMajrCodeConc!= null)&&this.criteriaMajrCodeConc.equals(rhs.criteriaMajrCodeConc))))&&((this.transRevDate == rhs.transRevDate)||((this.transRevDate!= null)&&this.transRevDate.equals(rhs.transRevDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.hoursTransferred == rhs.hoursTransferred)||((this.hoursTransferred!= null)&&this.hoursTransferred.equals(rhs.hoursTransferred))))&&((this.criteriaMajrCodeMajor == rhs.criteriaMajrCodeMajor)||((this.criteriaMajrCodeMajor!= null)&&this.criteriaMajrCodeMajor.equals(rhs.criteriaMajrCodeMajor))))&&((this.majrCodeConc == rhs.majrCodeConc)||((this.majrCodeConc!= null)&&this.majrCodeConc.equals(rhs.majrCodeConc))))&&((this.criteriaAttendFrom == rhs.criteriaAttendFrom)||((this.criteriaAttendFrom!= null)&&this.criteriaAttendFrom.equals(rhs.criteriaAttendFrom))))&&((this.criteriaGpaTransferred == rhs.criteriaGpaTransferred)||((this.criteriaGpaTransferred!= null)&&this.criteriaGpaTransferred.equals(rhs.criteriaGpaTransferred))))&&((this.attendTo == rhs.attendTo)||((this.attendTo!= null)&&this.attendTo.equals(rhs.attendTo))))&&((this.majrCodeMajor == rhs.majrCodeMajor)||((this.majrCodeMajor!= null)&&this.majrCodeMajor.equals(rhs.majrCodeMajor))))&&((this.attendFrom == rhs.attendFrom)||((this.attendFrom!= null)&&this.attendFrom.equals(rhs.attendFrom))))&&((this.criteriaTransRevDate == rhs.criteriaTransRevDate)||((this.criteriaTransRevDate!= null)&&this.criteriaTransRevDate.equals(rhs.criteriaTransRevDate))))&&((this.officialTrans == rhs.officialTrans)||((this.officialTrans!= null)&&this.officialTrans.equals(rhs.officialTrans))))&&((this.criteriaMajrCodeMinor == rhs.criteriaMajrCodeMinor)||((this.criteriaMajrCodeMinor!= null)&&this.criteriaMajrCodeMinor.equals(rhs.criteriaMajrCodeMinor))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
