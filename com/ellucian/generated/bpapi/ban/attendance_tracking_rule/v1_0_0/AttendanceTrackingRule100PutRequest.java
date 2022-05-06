
package com.ellucian.generated.bpapi.ban.attendance_tracking_rule.v1_0_0;

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
    "attendEnterInd",
    "criteria.userId",
    "criteria.activityDate",
    "criteria.trackingUnitCde",
    "seqNo",
    "entryStartDate",
    "criteria.ptrmCode",
    "criteria.crseNumb",
    "subjCode",
    "trackAttendInd",
    "keyblckTermCode",
    "criteria.subjCode",
    "trackingUnitCde",
    "criteria.attendEnterInd",
    "crseNumb",
    "criteria.crn",
    "ptrmCode",
    "criteria.entryEndDate",
    "criteria.seqNo",
    "criteria.entryStartDate",
    "entryEndDate",
    "criteria.trackAttendInd",
    "crn"
})
@Generated("jsonschema2pojo")
public class AttendanceTrackingRule100PutRequest {

    /**
     * Lineage reference object : SORATRK_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("attendEnterInd")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ATTEND_ENTER_IND")
    private String attendEnterInd;
    /**
     * Lineage reference object : SORATRK_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SORATRK_USER_ID")
    private String criteriaUserId;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORATRK_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATRK_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("criteria.trackingUnitCde")
    @JsonPropertyDescription("Lineage reference object : SORATRK_TRACKING_UNIT_CDE")
    private String criteriaTrackingUnitCde;
    /**
     * Rule Code Number
     * <p>
     * Lineage reference object : SORATRK_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SORATRK_SEQ_NO")
    private Double seqNo;
    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_START_DATE
     * 
     */
    @JsonProperty("entryStartDate")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ENTRY_START_DATE")
    private Date entryStartDate;
    /**
     * Part Of Term
     * <p>
     * Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String criteriaPtrmCode;
    /**
     * Course Number
     * <p>
     * Lineage reference object : SORATRK_CRSE_NUMB
     * 
     */
    @JsonProperty("criteria.crseNumb")
    @JsonPropertyDescription("Lineage reference object : SORATRK_CRSE_NUMB")
    private String criteriaCrseNumb;
    /**
     * Subject
     * <p>
     * Lineage reference object : SORATRK_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    @JsonPropertyDescription("Lineage reference object : SORATRK_SUBJ_CODE")
    private String subjCode;
    /**
     * Lineage reference object : SORATRK_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("trackAttendInd")
    @JsonPropertyDescription("Lineage reference object : SORATRK_TRACK_ATTEND_IND")
    private String trackAttendInd;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private Object keyblckTermCode;
    /**
     * Subject
     * <p>
     * Lineage reference object : SORATRK_SUBJ_CODE
     * 
     */
    @JsonProperty("criteria.subjCode")
    @JsonPropertyDescription("Lineage reference object : SORATRK_SUBJ_CODE")
    private String criteriaSubjCode;
    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATRK_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("trackingUnitCde")
    @JsonPropertyDescription("Lineage reference object : SORATRK_TRACKING_UNIT_CDE")
    private String trackingUnitCde;
    /**
     * Lineage reference object : SORATRK_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("criteria.attendEnterInd")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ATTEND_ENTER_IND")
    private String criteriaAttendEnterInd;
    /**
     * Course Number
     * <p>
     * Lineage reference object : SORATRK_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    @JsonPropertyDescription("Lineage reference object : SORATRK_CRSE_NUMB")
    private String crseNumb;
    /**
     * CRN
     * <p>
     * Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ
     * 
     */
    @JsonProperty("criteria.crn")
    @JsonPropertyDescription("Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ")
    private String criteriaCrn;
    /**
     * Part Of Term
     * <p>
     * Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String ptrmCode;
    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_END_DATE
     * 
     */
    @JsonProperty("criteria.entryEndDate")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ENTRY_END_DATE")
    private Date criteriaEntryEndDate;
    /**
     * Rule Code Number
     * <p>
     * Lineage reference object : SORATRK_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    @JsonPropertyDescription("Lineage reference object : SORATRK_SEQ_NO")
    private Double criteriaSeqNo;
    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_START_DATE
     * 
     */
    @JsonProperty("criteria.entryStartDate")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ENTRY_START_DATE")
    private Date criteriaEntryStartDate;
    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_END_DATE
     * 
     */
    @JsonProperty("entryEndDate")
    @JsonPropertyDescription("Lineage reference object : SORATRK_ENTRY_END_DATE")
    private Date entryEndDate;
    /**
     * Lineage reference object : SORATRK_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("criteria.trackAttendInd")
    @JsonPropertyDescription("Lineage reference object : SORATRK_TRACK_ATTEND_IND")
    private String criteriaTrackAttendInd;
    /**
     * CRN
     * <p>
     * Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ")
    private String crn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SORATRK_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("attendEnterInd")
    public String getAttendEnterInd() {
        return attendEnterInd;
    }

    /**
     * Lineage reference object : SORATRK_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("attendEnterInd")
    public void setAttendEnterInd(String attendEnterInd) {
        this.attendEnterInd = attendEnterInd;
    }

    public AttendanceTrackingRule100PutRequest withAttendEnterInd(String attendEnterInd) {
        this.attendEnterInd = attendEnterInd;
        return this;
    }

    /**
     * Lineage reference object : SORATRK_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : SORATRK_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORATRK_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SORATRK_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATRK_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("criteria.trackingUnitCde")
    public String getCriteriaTrackingUnitCde() {
        return criteriaTrackingUnitCde;
    }

    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATRK_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("criteria.trackingUnitCde")
    public void setCriteriaTrackingUnitCde(String criteriaTrackingUnitCde) {
        this.criteriaTrackingUnitCde = criteriaTrackingUnitCde;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaTrackingUnitCde(String criteriaTrackingUnitCde) {
        this.criteriaTrackingUnitCde = criteriaTrackingUnitCde;
        return this;
    }

    /**
     * Rule Code Number
     * <p>
     * Lineage reference object : SORATRK_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Rule Code Number
     * <p>
     * Lineage reference object : SORATRK_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public AttendanceTrackingRule100PutRequest withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_START_DATE
     * 
     */
    @JsonProperty("entryStartDate")
    public Date getEntryStartDate() {
        return entryStartDate;
    }

    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_START_DATE
     * 
     */
    @JsonProperty("entryStartDate")
    public void setEntryStartDate(Date entryStartDate) {
        this.entryStartDate = entryStartDate;
    }

    public AttendanceTrackingRule100PutRequest withEntryStartDate(Date entryStartDate) {
        this.entryStartDate = entryStartDate;
        return this;
    }

    /**
     * Part Of Term
     * <p>
     * Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public String getCriteriaPtrmCode() {
        return criteriaPtrmCode;
    }

    /**
     * Part Of Term
     * <p>
     * Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public void setCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
        return this;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SORATRK_CRSE_NUMB
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public String getCriteriaCrseNumb() {
        return criteriaCrseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SORATRK_CRSE_NUMB
     * 
     */
    @JsonProperty("criteria.crseNumb")
    public void setCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaCrseNumb(String criteriaCrseNumb) {
        this.criteriaCrseNumb = criteriaCrseNumb;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORATRK_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORATRK_SUBJ_CODE
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public AttendanceTrackingRule100PutRequest withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Lineage reference object : SORATRK_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("trackAttendInd")
    public String getTrackAttendInd() {
        return trackAttendInd;
    }

    /**
     * Lineage reference object : SORATRK_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("trackAttendInd")
    public void setTrackAttendInd(String trackAttendInd) {
        this.trackAttendInd = trackAttendInd;
    }

    public AttendanceTrackingRule100PutRequest withTrackAttendInd(String trackAttendInd) {
        this.trackAttendInd = trackAttendInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public Object getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public AttendanceTrackingRule100PutRequest withKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORATRK_SUBJ_CODE
     * 
     */
    @JsonProperty("criteria.subjCode")
    public String getCriteriaSubjCode() {
        return criteriaSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SORATRK_SUBJ_CODE
     * 
     */
    @JsonProperty("criteria.subjCode")
    public void setCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaSubjCode(String criteriaSubjCode) {
        this.criteriaSubjCode = criteriaSubjCode;
        return this;
    }

    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATRK_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("trackingUnitCde")
    public String getTrackingUnitCde() {
        return trackingUnitCde;
    }

    /**
     * Tracking Unit
     * <p>
     * Lineage reference object : SORATRK_TRACKING_UNIT_CDE
     * 
     */
    @JsonProperty("trackingUnitCde")
    public void setTrackingUnitCde(String trackingUnitCde) {
        this.trackingUnitCde = trackingUnitCde;
    }

    public AttendanceTrackingRule100PutRequest withTrackingUnitCde(String trackingUnitCde) {
        this.trackingUnitCde = trackingUnitCde;
        return this;
    }

    /**
     * Lineage reference object : SORATRK_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("criteria.attendEnterInd")
    public String getCriteriaAttendEnterInd() {
        return criteriaAttendEnterInd;
    }

    /**
     * Lineage reference object : SORATRK_ATTEND_ENTER_IND
     * 
     */
    @JsonProperty("criteria.attendEnterInd")
    public void setCriteriaAttendEnterInd(String criteriaAttendEnterInd) {
        this.criteriaAttendEnterInd = criteriaAttendEnterInd;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaAttendEnterInd(String criteriaAttendEnterInd) {
        this.criteriaAttendEnterInd = criteriaAttendEnterInd;
        return this;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SORATRK_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course Number
     * <p>
     * Lineage reference object : SORATRK_CRSE_NUMB
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public AttendanceTrackingRule100PutRequest withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ
     * 
     */
    @JsonProperty("criteria.crn")
    public String getCriteriaCrn() {
        return criteriaCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ
     * 
     */
    @JsonProperty("criteria.crn")
    public void setCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaCrn(String criteriaCrn) {
        this.criteriaCrn = criteriaCrn;
        return this;
    }

    /**
     * Part Of Term
     * <p>
     * Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part Of Term
     * <p>
     * Lineage reference object : SORATRK_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public AttendanceTrackingRule100PutRequest withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_END_DATE
     * 
     */
    @JsonProperty("criteria.entryEndDate")
    public Date getCriteriaEntryEndDate() {
        return criteriaEntryEndDate;
    }

    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_END_DATE
     * 
     */
    @JsonProperty("criteria.entryEndDate")
    public void setCriteriaEntryEndDate(Date criteriaEntryEndDate) {
        this.criteriaEntryEndDate = criteriaEntryEndDate;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaEntryEndDate(Date criteriaEntryEndDate) {
        this.criteriaEntryEndDate = criteriaEntryEndDate;
        return this;
    }

    /**
     * Rule Code Number
     * <p>
     * Lineage reference object : SORATRK_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    public Double getCriteriaSeqNo() {
        return criteriaSeqNo;
    }

    /**
     * Rule Code Number
     * <p>
     * Lineage reference object : SORATRK_SEQ_NO
     * 
     */
    @JsonProperty("criteria.seqNo")
    public void setCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaSeqNo(Double criteriaSeqNo) {
        this.criteriaSeqNo = criteriaSeqNo;
        return this;
    }

    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_START_DATE
     * 
     */
    @JsonProperty("criteria.entryStartDate")
    public Date getCriteriaEntryStartDate() {
        return criteriaEntryStartDate;
    }

    /**
     * Tracking Start Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_START_DATE
     * 
     */
    @JsonProperty("criteria.entryStartDate")
    public void setCriteriaEntryStartDate(Date criteriaEntryStartDate) {
        this.criteriaEntryStartDate = criteriaEntryStartDate;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaEntryStartDate(Date criteriaEntryStartDate) {
        this.criteriaEntryStartDate = criteriaEntryStartDate;
        return this;
    }

    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_END_DATE
     * 
     */
    @JsonProperty("entryEndDate")
    public Date getEntryEndDate() {
        return entryEndDate;
    }

    /**
     * Tracking End Date
     * <p>
     * Lineage reference object : SORATRK_ENTRY_END_DATE
     * 
     */
    @JsonProperty("entryEndDate")
    public void setEntryEndDate(Date entryEndDate) {
        this.entryEndDate = entryEndDate;
    }

    public AttendanceTrackingRule100PutRequest withEntryEndDate(Date entryEndDate) {
        this.entryEndDate = entryEndDate;
        return this;
    }

    /**
     * Lineage reference object : SORATRK_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("criteria.trackAttendInd")
    public String getCriteriaTrackAttendInd() {
        return criteriaTrackAttendInd;
    }

    /**
     * Lineage reference object : SORATRK_TRACK_ATTEND_IND
     * 
     */
    @JsonProperty("criteria.trackAttendInd")
    public void setCriteriaTrackAttendInd(String criteriaTrackAttendInd) {
        this.criteriaTrackAttendInd = criteriaTrackAttendInd;
    }

    public AttendanceTrackingRule100PutRequest withCriteriaTrackAttendInd(String criteriaTrackAttendInd) {
        this.criteriaTrackAttendInd = criteriaTrackAttendInd;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SORATRK_CRN, Lookup lineage reference object : SVQ_SSASECQ
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public AttendanceTrackingRule100PutRequest withCrn(String crn) {
        this.crn = crn;
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

    public AttendanceTrackingRule100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttendanceTrackingRule100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attendEnterInd");
        sb.append('=');
        sb.append(((this.attendEnterInd == null)?"<null>":this.attendEnterInd));
        sb.append(',');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaTrackingUnitCde");
        sb.append('=');
        sb.append(((this.criteriaTrackingUnitCde == null)?"<null>":this.criteriaTrackingUnitCde));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("entryStartDate");
        sb.append('=');
        sb.append(((this.entryStartDate == null)?"<null>":this.entryStartDate));
        sb.append(',');
        sb.append("criteriaPtrmCode");
        sb.append('=');
        sb.append(((this.criteriaPtrmCode == null)?"<null>":this.criteriaPtrmCode));
        sb.append(',');
        sb.append("criteriaCrseNumb");
        sb.append('=');
        sb.append(((this.criteriaCrseNumb == null)?"<null>":this.criteriaCrseNumb));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("trackAttendInd");
        sb.append('=');
        sb.append(((this.trackAttendInd == null)?"<null>":this.trackAttendInd));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("criteriaSubjCode");
        sb.append('=');
        sb.append(((this.criteriaSubjCode == null)?"<null>":this.criteriaSubjCode));
        sb.append(',');
        sb.append("trackingUnitCde");
        sb.append('=');
        sb.append(((this.trackingUnitCde == null)?"<null>":this.trackingUnitCde));
        sb.append(',');
        sb.append("criteriaAttendEnterInd");
        sb.append('=');
        sb.append(((this.criteriaAttendEnterInd == null)?"<null>":this.criteriaAttendEnterInd));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("criteriaCrn");
        sb.append('=');
        sb.append(((this.criteriaCrn == null)?"<null>":this.criteriaCrn));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("criteriaEntryEndDate");
        sb.append('=');
        sb.append(((this.criteriaEntryEndDate == null)?"<null>":this.criteriaEntryEndDate));
        sb.append(',');
        sb.append("criteriaSeqNo");
        sb.append('=');
        sb.append(((this.criteriaSeqNo == null)?"<null>":this.criteriaSeqNo));
        sb.append(',');
        sb.append("criteriaEntryStartDate");
        sb.append('=');
        sb.append(((this.criteriaEntryStartDate == null)?"<null>":this.criteriaEntryStartDate));
        sb.append(',');
        sb.append("entryEndDate");
        sb.append('=');
        sb.append(((this.entryEndDate == null)?"<null>":this.entryEndDate));
        sb.append(',');
        sb.append("criteriaTrackAttendInd");
        sb.append('=');
        sb.append(((this.criteriaTrackAttendInd == null)?"<null>":this.criteriaTrackAttendInd));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
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
        result = ((result* 31)+((this.criteriaPtrmCode == null)? 0 :this.criteriaPtrmCode.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.entryStartDate == null)? 0 :this.entryStartDate.hashCode()));
        result = ((result* 31)+((this.trackAttendInd == null)? 0 :this.trackAttendInd.hashCode()));
        result = ((result* 31)+((this.criteriaTrackingUnitCde == null)? 0 :this.criteriaTrackingUnitCde.hashCode()));
        result = ((result* 31)+((this.criteriaEntryEndDate == null)? 0 :this.criteriaEntryEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaCrn == null)? 0 :this.criteriaCrn.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.attendEnterInd == null)? 0 :this.attendEnterInd.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaEntryStartDate == null)? 0 :this.criteriaEntryStartDate.hashCode()));
        result = ((result* 31)+((this.trackingUnitCde == null)? 0 :this.trackingUnitCde.hashCode()));
        result = ((result* 31)+((this.criteriaCrseNumb == null)? 0 :this.criteriaCrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaSubjCode == null)? 0 :this.criteriaSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaTrackAttendInd == null)? 0 :this.criteriaTrackAttendInd.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaSeqNo == null)? 0 :this.criteriaSeqNo.hashCode()));
        result = ((result* 31)+((this.entryEndDate == null)? 0 :this.entryEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaAttendEnterInd == null)? 0 :this.criteriaAttendEnterInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttendanceTrackingRule100PutRequest) == false) {
            return false;
        }
        AttendanceTrackingRule100PutRequest rhs = ((AttendanceTrackingRule100PutRequest) other);
        return (((((((((((((((((((((((((this.criteriaPtrmCode == rhs.criteriaPtrmCode)||((this.criteriaPtrmCode!= null)&&this.criteriaPtrmCode.equals(rhs.criteriaPtrmCode)))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.entryStartDate == rhs.entryStartDate)||((this.entryStartDate!= null)&&this.entryStartDate.equals(rhs.entryStartDate))))&&((this.trackAttendInd == rhs.trackAttendInd)||((this.trackAttendInd!= null)&&this.trackAttendInd.equals(rhs.trackAttendInd))))&&((this.criteriaTrackingUnitCde == rhs.criteriaTrackingUnitCde)||((this.criteriaTrackingUnitCde!= null)&&this.criteriaTrackingUnitCde.equals(rhs.criteriaTrackingUnitCde))))&&((this.criteriaEntryEndDate == rhs.criteriaEntryEndDate)||((this.criteriaEntryEndDate!= null)&&this.criteriaEntryEndDate.equals(rhs.criteriaEntryEndDate))))&&((this.criteriaCrn == rhs.criteriaCrn)||((this.criteriaCrn!= null)&&this.criteriaCrn.equals(rhs.criteriaCrn))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.attendEnterInd == rhs.attendEnterInd)||((this.attendEnterInd!= null)&&this.attendEnterInd.equals(rhs.attendEnterInd))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaEntryStartDate == rhs.criteriaEntryStartDate)||((this.criteriaEntryStartDate!= null)&&this.criteriaEntryStartDate.equals(rhs.criteriaEntryStartDate))))&&((this.trackingUnitCde == rhs.trackingUnitCde)||((this.trackingUnitCde!= null)&&this.trackingUnitCde.equals(rhs.trackingUnitCde))))&&((this.criteriaCrseNumb == rhs.criteriaCrseNumb)||((this.criteriaCrseNumb!= null)&&this.criteriaCrseNumb.equals(rhs.criteriaCrseNumb))))&&((this.criteriaSubjCode == rhs.criteriaSubjCode)||((this.criteriaSubjCode!= null)&&this.criteriaSubjCode.equals(rhs.criteriaSubjCode))))&&((this.criteriaTrackAttendInd == rhs.criteriaTrackAttendInd)||((this.criteriaTrackAttendInd!= null)&&this.criteriaTrackAttendInd.equals(rhs.criteriaTrackAttendInd))))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.criteriaSeqNo == rhs.criteriaSeqNo)||((this.criteriaSeqNo!= null)&&this.criteriaSeqNo.equals(rhs.criteriaSeqNo))))&&((this.entryEndDate == rhs.entryEndDate)||((this.entryEndDate!= null)&&this.entryEndDate.equals(rhs.entryEndDate))))&&((this.criteriaAttendEnterInd == rhs.criteriaAttendEnterInd)||((this.criteriaAttendEnterInd!= null)&&this.criteriaAttendEnterInd.equals(rhs.criteriaAttendEnterInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
