
package com.ellucian.generated.bpapi.ban.schedule_calendar.v1_0_0;

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
    "criteria.ptrmDesc",
    "criteria.refundCutoffDate",
    "acclCode",
    "criteria.sectStartDate",
    "refundCutoffDate",
    "criteria.acclDesc",
    "criteria.enrlCutOffDate",
    "criteria.dropCutOffDate",
    "criteria.census2Date",
    "enrlCutOffDate",
    "dropCutOffDate",
    "criteria.enrl",
    "criteria.census2Enrl",
    "criteria.ptrmCode",
    "keyblckTermCode",
    "criteria.ptrmWeeks",
    "criteria.censusEnrlDate",
    "criteria.sectNumWeek",
    "criteria.sectNumDay",
    "criteria.sectBeginDate",
    "criteria.ptrmEndDate",
    "criteria.acadCutOffDate",
    "acadCutOffDate",
    "keyblckCrn",
    "criteria.acclCode",
    "criteria.censusEnrl",
    "criteria.ptrmStartDate",
    "criteria.sectEndDate"
})
@Generated("jsonschema2pojo")
public class ScheduleCalendar100PutRequest {

    @JsonProperty("criteria.ptrmDesc")
    private String criteriaPtrmDesc;
    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("criteria.refundCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE")
    private Date criteriaRefundCutoffDate;
    /**
     * Academic Calendar Type
     * <p>
     * Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl
     * 
     */
    @JsonProperty("acclCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl")
    private String acclCode;
    /**
     * Calculated Section Start Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectStartDate")
    private Date criteriaSectStartDate;
    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("refundCutoffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE")
    private Date refundCutoffDate;
    @JsonProperty("criteria.acclDesc")
    private String criteriaAcclDesc;
    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE
     * 
     */
    @JsonProperty("criteria.enrlCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE")
    private Date criteriaEnrlCutOffDate;
    /**
     * Last Date to Drop without a Penalty
     * <p>
     * Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE
     * 
     */
    @JsonProperty("criteria.dropCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE")
    private Date criteriaDropCutOffDate;
    /**
     * Census Two Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("criteria.census2Date")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_2_DATE")
    private Date criteriaCensus2Date;
    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE
     * 
     */
    @JsonProperty("enrlCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE")
    private Date enrlCutOffDate;
    /**
     * Last Date to Drop without a Penalty
     * <p>
     * Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE
     * 
     */
    @JsonProperty("dropCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE")
    private Date dropCutOffDate;
    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("criteria.enrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ENRL")
    private Double criteriaEnrl;
    /**
     * Census Two Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_ENRL
     * 
     */
    @JsonProperty("criteria.census2Enrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_2_ENRL")
    private Double criteriaCensus2Enrl;
    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm")
    private String criteriaPtrmCode;
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
     * Part of Term Number of Weeks
     * <p>
     * Lineage reference object : SSBSECT_PTRM_WEEKS
     * 
     */
    @JsonProperty("criteria.ptrmWeeks")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_WEEKS")
    private Double criteriaPtrmWeeks;
    /**
     * Census One Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.censusEnrlDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_ENRL_DATE")
    private Date criteriaCensusEnrlDate;
    /**
     * Session Number of Weeks
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectNumWeek")
    private Double criteriaSectNumWeek;
    /**
     * Number of Days
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectNumDay")
    private Double criteriaSectNumDay;
    /**
     * Session Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectBeginDate")
    private Date criteriaSectBeginDate;
    /**
     * Section End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("criteria.ptrmEndDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_END_DATE")
    private Date criteriaPtrmEndDate;
    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE
     * 
     */
    @JsonProperty("criteria.acadCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE")
    private Date criteriaAcadCutOffDate;
    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE
     * 
     */
    @JsonProperty("acadCutOffDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE")
    private Date acadCutOffDate;
    /**
     * CRN
     * <p>
     * Lineage reference object : keyblckCrn
     * 
     */
    @JsonProperty("keyblckCrn")
    @JsonPropertyDescription("Lineage reference object : keyblckCrn")
    private Object keyblckCrn;
    /**
     * Academic Calendar Type
     * <p>
     * Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl
     * 
     */
    @JsonProperty("criteria.acclCode")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl")
    private String criteriaAcclCode;
    /**
     * Census One Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL
     * 
     */
    @JsonProperty("criteria.censusEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_CENSUS_ENRL")
    private Double criteriaCensusEnrl;
    /**
     * Section Begin Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("criteria.ptrmStartDate")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_PTRM_START_DATE")
    private Date criteriaPtrmStartDate;
    /**
     * Session End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectEndDate")
    private Date criteriaSectEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("criteria.ptrmDesc")
    public String getCriteriaPtrmDesc() {
        return criteriaPtrmDesc;
    }

    @JsonProperty("criteria.ptrmDesc")
    public void setCriteriaPtrmDesc(String criteriaPtrmDesc) {
        this.criteriaPtrmDesc = criteriaPtrmDesc;
    }

    public ScheduleCalendar100PutRequest withCriteriaPtrmDesc(String criteriaPtrmDesc) {
        this.criteriaPtrmDesc = criteriaPtrmDesc;
        return this;
    }

    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("criteria.refundCutoffDate")
    public Date getCriteriaRefundCutoffDate() {
        return criteriaRefundCutoffDate;
    }

    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("criteria.refundCutoffDate")
    public void setCriteriaRefundCutoffDate(Date criteriaRefundCutoffDate) {
        this.criteriaRefundCutoffDate = criteriaRefundCutoffDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaRefundCutoffDate(Date criteriaRefundCutoffDate) {
        this.criteriaRefundCutoffDate = criteriaRefundCutoffDate;
        return this;
    }

    /**
     * Academic Calendar Type
     * <p>
     * Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl
     * 
     */
    @JsonProperty("acclCode")
    public String getAcclCode() {
        return acclCode;
    }

    /**
     * Academic Calendar Type
     * <p>
     * Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl
     * 
     */
    @JsonProperty("acclCode")
    public void setAcclCode(String acclCode) {
        this.acclCode = acclCode;
    }

    public ScheduleCalendar100PutRequest withAcclCode(String acclCode) {
        this.acclCode = acclCode;
        return this;
    }

    /**
     * Calculated Section Start Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectStartDate")
    public Date getCriteriaSectStartDate() {
        return criteriaSectStartDate;
    }

    /**
     * Calculated Section Start Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectStartDate")
    public void setCriteriaSectStartDate(Date criteriaSectStartDate) {
        this.criteriaSectStartDate = criteriaSectStartDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaSectStartDate(Date criteriaSectStartDate) {
        this.criteriaSectStartDate = criteriaSectStartDate;
        return this;
    }

    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("refundCutoffDate")
    public Date getRefundCutoffDate() {
        return refundCutoffDate;
    }

    /**
     * Last Date for Refund
     * <p>
     * Lineage reference object : SSBSECT_REFUND_CUTOFF_DATE
     * 
     */
    @JsonProperty("refundCutoffDate")
    public void setRefundCutoffDate(Date refundCutoffDate) {
        this.refundCutoffDate = refundCutoffDate;
    }

    public ScheduleCalendar100PutRequest withRefundCutoffDate(Date refundCutoffDate) {
        this.refundCutoffDate = refundCutoffDate;
        return this;
    }

    @JsonProperty("criteria.acclDesc")
    public String getCriteriaAcclDesc() {
        return criteriaAcclDesc;
    }

    @JsonProperty("criteria.acclDesc")
    public void setCriteriaAcclDesc(String criteriaAcclDesc) {
        this.criteriaAcclDesc = criteriaAcclDesc;
    }

    public ScheduleCalendar100PutRequest withCriteriaAcclDesc(String criteriaAcclDesc) {
        this.criteriaAcclDesc = criteriaAcclDesc;
        return this;
    }

    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE
     * 
     */
    @JsonProperty("criteria.enrlCutOffDate")
    public Date getCriteriaEnrlCutOffDate() {
        return criteriaEnrlCutOffDate;
    }

    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE
     * 
     */
    @JsonProperty("criteria.enrlCutOffDate")
    public void setCriteriaEnrlCutOffDate(Date criteriaEnrlCutOffDate) {
        this.criteriaEnrlCutOffDate = criteriaEnrlCutOffDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaEnrlCutOffDate(Date criteriaEnrlCutOffDate) {
        this.criteriaEnrlCutOffDate = criteriaEnrlCutOffDate;
        return this;
    }

    /**
     * Last Date to Drop without a Penalty
     * <p>
     * Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE
     * 
     */
    @JsonProperty("criteria.dropCutOffDate")
    public Date getCriteriaDropCutOffDate() {
        return criteriaDropCutOffDate;
    }

    /**
     * Last Date to Drop without a Penalty
     * <p>
     * Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE
     * 
     */
    @JsonProperty("criteria.dropCutOffDate")
    public void setCriteriaDropCutOffDate(Date criteriaDropCutOffDate) {
        this.criteriaDropCutOffDate = criteriaDropCutOffDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaDropCutOffDate(Date criteriaDropCutOffDate) {
        this.criteriaDropCutOffDate = criteriaDropCutOffDate;
        return this;
    }

    /**
     * Census Two Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("criteria.census2Date")
    public Date getCriteriaCensus2Date() {
        return criteriaCensus2Date;
    }

    /**
     * Census Two Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_DATE
     * 
     */
    @JsonProperty("criteria.census2Date")
    public void setCriteriaCensus2Date(Date criteriaCensus2Date) {
        this.criteriaCensus2Date = criteriaCensus2Date;
    }

    public ScheduleCalendar100PutRequest withCriteriaCensus2Date(Date criteriaCensus2Date) {
        this.criteriaCensus2Date = criteriaCensus2Date;
        return this;
    }

    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE
     * 
     */
    @JsonProperty("enrlCutOffDate")
    public Date getEnrlCutOffDate() {
        return enrlCutOffDate;
    }

    /**
     * Last Date to Enroll
     * <p>
     * Lineage reference object : SSBSECT_ENRL_CUT_OFF_DATE
     * 
     */
    @JsonProperty("enrlCutOffDate")
    public void setEnrlCutOffDate(Date enrlCutOffDate) {
        this.enrlCutOffDate = enrlCutOffDate;
    }

    public ScheduleCalendar100PutRequest withEnrlCutOffDate(Date enrlCutOffDate) {
        this.enrlCutOffDate = enrlCutOffDate;
        return this;
    }

    /**
     * Last Date to Drop without a Penalty
     * <p>
     * Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE
     * 
     */
    @JsonProperty("dropCutOffDate")
    public Date getDropCutOffDate() {
        return dropCutOffDate;
    }

    /**
     * Last Date to Drop without a Penalty
     * <p>
     * Lineage reference object : SSBSECT_DROP_CUT_OFF_DATE
     * 
     */
    @JsonProperty("dropCutOffDate")
    public void setDropCutOffDate(Date dropCutOffDate) {
        this.dropCutOffDate = dropCutOffDate;
    }

    public ScheduleCalendar100PutRequest withDropCutOffDate(Date dropCutOffDate) {
        this.dropCutOffDate = dropCutOffDate;
        return this;
    }

    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("criteria.enrl")
    public Double getCriteriaEnrl() {
        return criteriaEnrl;
    }

    /**
     * Enrollment
     * <p>
     * Lineage reference object : SSBSECT_ENRL
     * 
     */
    @JsonProperty("criteria.enrl")
    public void setCriteriaEnrl(Double criteriaEnrl) {
        this.criteriaEnrl = criteriaEnrl;
    }

    public ScheduleCalendar100PutRequest withCriteriaEnrl(Double criteriaEnrl) {
        this.criteriaEnrl = criteriaEnrl;
        return this;
    }

    /**
     * Census Two Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_ENRL
     * 
     */
    @JsonProperty("criteria.census2Enrl")
    public Double getCriteriaCensus2Enrl() {
        return criteriaCensus2Enrl;
    }

    /**
     * Census Two Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_2_ENRL
     * 
     */
    @JsonProperty("criteria.census2Enrl")
    public void setCriteriaCensus2Enrl(Double criteriaCensus2Enrl) {
        this.criteriaCensus2Enrl = criteriaCensus2Enrl;
    }

    public ScheduleCalendar100PutRequest withCriteriaCensus2Enrl(Double criteriaCensus2Enrl) {
        this.criteriaCensus2Enrl = criteriaCensus2Enrl;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public String getCriteriaPtrmCode() {
        return criteriaPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lineage reference object : SSBSECT_PTRM_CODE, Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("criteria.ptrmCode")
    public void setCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
    }

    public ScheduleCalendar100PutRequest withCriteriaPtrmCode(String criteriaPtrmCode) {
        this.criteriaPtrmCode = criteriaPtrmCode;
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

    public ScheduleCalendar100PutRequest withKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * Part of Term Number of Weeks
     * <p>
     * Lineage reference object : SSBSECT_PTRM_WEEKS
     * 
     */
    @JsonProperty("criteria.ptrmWeeks")
    public Double getCriteriaPtrmWeeks() {
        return criteriaPtrmWeeks;
    }

    /**
     * Part of Term Number of Weeks
     * <p>
     * Lineage reference object : SSBSECT_PTRM_WEEKS
     * 
     */
    @JsonProperty("criteria.ptrmWeeks")
    public void setCriteriaPtrmWeeks(Double criteriaPtrmWeeks) {
        this.criteriaPtrmWeeks = criteriaPtrmWeeks;
    }

    public ScheduleCalendar100PutRequest withCriteriaPtrmWeeks(Double criteriaPtrmWeeks) {
        this.criteriaPtrmWeeks = criteriaPtrmWeeks;
        return this;
    }

    /**
     * Census One Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.censusEnrlDate")
    public Date getCriteriaCensusEnrlDate() {
        return criteriaCensusEnrlDate;
    }

    /**
     * Census One Date
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.censusEnrlDate")
    public void setCriteriaCensusEnrlDate(Date criteriaCensusEnrlDate) {
        this.criteriaCensusEnrlDate = criteriaCensusEnrlDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaCensusEnrlDate(Date criteriaCensusEnrlDate) {
        this.criteriaCensusEnrlDate = criteriaCensusEnrlDate;
        return this;
    }

    /**
     * Session Number of Weeks
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectNumWeek")
    public Double getCriteriaSectNumWeek() {
        return criteriaSectNumWeek;
    }

    /**
     * Session Number of Weeks
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectNumWeek")
    public void setCriteriaSectNumWeek(Double criteriaSectNumWeek) {
        this.criteriaSectNumWeek = criteriaSectNumWeek;
    }

    public ScheduleCalendar100PutRequest withCriteriaSectNumWeek(Double criteriaSectNumWeek) {
        this.criteriaSectNumWeek = criteriaSectNumWeek;
        return this;
    }

    /**
     * Number of Days
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectNumDay")
    public Double getCriteriaSectNumDay() {
        return criteriaSectNumDay;
    }

    /**
     * Number of Days
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectNumDay")
    public void setCriteriaSectNumDay(Double criteriaSectNumDay) {
        this.criteriaSectNumDay = criteriaSectNumDay;
    }

    public ScheduleCalendar100PutRequest withCriteriaSectNumDay(Double criteriaSectNumDay) {
        this.criteriaSectNumDay = criteriaSectNumDay;
        return this;
    }

    /**
     * Session Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectBeginDate")
    public Date getCriteriaSectBeginDate() {
        return criteriaSectBeginDate;
    }

    /**
     * Session Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectBeginDate")
    public void setCriteriaSectBeginDate(Date criteriaSectBeginDate) {
        this.criteriaSectBeginDate = criteriaSectBeginDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaSectBeginDate(Date criteriaSectBeginDate) {
        this.criteriaSectBeginDate = criteriaSectBeginDate;
        return this;
    }

    /**
     * Section End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("criteria.ptrmEndDate")
    public Date getCriteriaPtrmEndDate() {
        return criteriaPtrmEndDate;
    }

    /**
     * Section End Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_END_DATE
     * 
     */
    @JsonProperty("criteria.ptrmEndDate")
    public void setCriteriaPtrmEndDate(Date criteriaPtrmEndDate) {
        this.criteriaPtrmEndDate = criteriaPtrmEndDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaPtrmEndDate(Date criteriaPtrmEndDate) {
        this.criteriaPtrmEndDate = criteriaPtrmEndDate;
        return this;
    }

    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE
     * 
     */
    @JsonProperty("criteria.acadCutOffDate")
    public Date getCriteriaAcadCutOffDate() {
        return criteriaAcadCutOffDate;
    }

    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE
     * 
     */
    @JsonProperty("criteria.acadCutOffDate")
    public void setCriteriaAcadCutOffDate(Date criteriaAcadCutOffDate) {
        this.criteriaAcadCutOffDate = criteriaAcadCutOffDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaAcadCutOffDate(Date criteriaAcadCutOffDate) {
        this.criteriaAcadCutOffDate = criteriaAcadCutOffDate;
        return this;
    }

    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE
     * 
     */
    @JsonProperty("acadCutOffDate")
    public Date getAcadCutOffDate() {
        return acadCutOffDate;
    }

    /**
     * Last Date to Record Academic History
     * <p>
     * Lineage reference object : SSBSECT_ACAD_CUT_OFF_DATE
     * 
     */
    @JsonProperty("acadCutOffDate")
    public void setAcadCutOffDate(Date acadCutOffDate) {
        this.acadCutOffDate = acadCutOffDate;
    }

    public ScheduleCalendar100PutRequest withAcadCutOffDate(Date acadCutOffDate) {
        this.acadCutOffDate = acadCutOffDate;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : keyblckCrn
     * 
     */
    @JsonProperty("keyblckCrn")
    public Object getKeyblckCrn() {
        return keyblckCrn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : keyblckCrn
     * 
     */
    @JsonProperty("keyblckCrn")
    public void setKeyblckCrn(Object keyblckCrn) {
        this.keyblckCrn = keyblckCrn;
    }

    public ScheduleCalendar100PutRequest withKeyblckCrn(Object keyblckCrn) {
        this.keyblckCrn = keyblckCrn;
        return this;
    }

    /**
     * Academic Calendar Type
     * <p>
     * Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl
     * 
     */
    @JsonProperty("criteria.acclCode")
    public String getCriteriaAcclCode() {
        return criteriaAcclCode;
    }

    /**
     * Academic Calendar Type
     * <p>
     * Lineage reference object : SSBSECT_ACCL_CODE, Lookup lineage reference object : stvaccl
     * 
     */
    @JsonProperty("criteria.acclCode")
    public void setCriteriaAcclCode(String criteriaAcclCode) {
        this.criteriaAcclCode = criteriaAcclCode;
    }

    public ScheduleCalendar100PutRequest withCriteriaAcclCode(String criteriaAcclCode) {
        this.criteriaAcclCode = criteriaAcclCode;
        return this;
    }

    /**
     * Census One Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL
     * 
     */
    @JsonProperty("criteria.censusEnrl")
    public Double getCriteriaCensusEnrl() {
        return criteriaCensusEnrl;
    }

    /**
     * Census One Enrollment
     * <p>
     * Lineage reference object : SSBSECT_CENSUS_ENRL
     * 
     */
    @JsonProperty("criteria.censusEnrl")
    public void setCriteriaCensusEnrl(Double criteriaCensusEnrl) {
        this.criteriaCensusEnrl = criteriaCensusEnrl;
    }

    public ScheduleCalendar100PutRequest withCriteriaCensusEnrl(Double criteriaCensusEnrl) {
        this.criteriaCensusEnrl = criteriaCensusEnrl;
        return this;
    }

    /**
     * Section Begin Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("criteria.ptrmStartDate")
    public Date getCriteriaPtrmStartDate() {
        return criteriaPtrmStartDate;
    }

    /**
     * Section Begin Date
     * <p>
     * Lineage reference object : SSBSECT_PTRM_START_DATE
     * 
     */
    @JsonProperty("criteria.ptrmStartDate")
    public void setCriteriaPtrmStartDate(Date criteriaPtrmStartDate) {
        this.criteriaPtrmStartDate = criteriaPtrmStartDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaPtrmStartDate(Date criteriaPtrmStartDate) {
        this.criteriaPtrmStartDate = criteriaPtrmStartDate;
        return this;
    }

    /**
     * Session End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectEndDate")
    public Date getCriteriaSectEndDate() {
        return criteriaSectEndDate;
    }

    /**
     * Session End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.sectEndDate")
    public void setCriteriaSectEndDate(Date criteriaSectEndDate) {
        this.criteriaSectEndDate = criteriaSectEndDate;
    }

    public ScheduleCalendar100PutRequest withCriteriaSectEndDate(Date criteriaSectEndDate) {
        this.criteriaSectEndDate = criteriaSectEndDate;
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

    public ScheduleCalendar100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleCalendar100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaPtrmDesc");
        sb.append('=');
        sb.append(((this.criteriaPtrmDesc == null)?"<null>":this.criteriaPtrmDesc));
        sb.append(',');
        sb.append("criteriaRefundCutoffDate");
        sb.append('=');
        sb.append(((this.criteriaRefundCutoffDate == null)?"<null>":this.criteriaRefundCutoffDate));
        sb.append(',');
        sb.append("acclCode");
        sb.append('=');
        sb.append(((this.acclCode == null)?"<null>":this.acclCode));
        sb.append(',');
        sb.append("criteriaSectStartDate");
        sb.append('=');
        sb.append(((this.criteriaSectStartDate == null)?"<null>":this.criteriaSectStartDate));
        sb.append(',');
        sb.append("refundCutoffDate");
        sb.append('=');
        sb.append(((this.refundCutoffDate == null)?"<null>":this.refundCutoffDate));
        sb.append(',');
        sb.append("criteriaAcclDesc");
        sb.append('=');
        sb.append(((this.criteriaAcclDesc == null)?"<null>":this.criteriaAcclDesc));
        sb.append(',');
        sb.append("criteriaEnrlCutOffDate");
        sb.append('=');
        sb.append(((this.criteriaEnrlCutOffDate == null)?"<null>":this.criteriaEnrlCutOffDate));
        sb.append(',');
        sb.append("criteriaDropCutOffDate");
        sb.append('=');
        sb.append(((this.criteriaDropCutOffDate == null)?"<null>":this.criteriaDropCutOffDate));
        sb.append(',');
        sb.append("criteriaCensus2Date");
        sb.append('=');
        sb.append(((this.criteriaCensus2Date == null)?"<null>":this.criteriaCensus2Date));
        sb.append(',');
        sb.append("enrlCutOffDate");
        sb.append('=');
        sb.append(((this.enrlCutOffDate == null)?"<null>":this.enrlCutOffDate));
        sb.append(',');
        sb.append("dropCutOffDate");
        sb.append('=');
        sb.append(((this.dropCutOffDate == null)?"<null>":this.dropCutOffDate));
        sb.append(',');
        sb.append("criteriaEnrl");
        sb.append('=');
        sb.append(((this.criteriaEnrl == null)?"<null>":this.criteriaEnrl));
        sb.append(',');
        sb.append("criteriaCensus2Enrl");
        sb.append('=');
        sb.append(((this.criteriaCensus2Enrl == null)?"<null>":this.criteriaCensus2Enrl));
        sb.append(',');
        sb.append("criteriaPtrmCode");
        sb.append('=');
        sb.append(((this.criteriaPtrmCode == null)?"<null>":this.criteriaPtrmCode));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("criteriaPtrmWeeks");
        sb.append('=');
        sb.append(((this.criteriaPtrmWeeks == null)?"<null>":this.criteriaPtrmWeeks));
        sb.append(',');
        sb.append("criteriaCensusEnrlDate");
        sb.append('=');
        sb.append(((this.criteriaCensusEnrlDate == null)?"<null>":this.criteriaCensusEnrlDate));
        sb.append(',');
        sb.append("criteriaSectNumWeek");
        sb.append('=');
        sb.append(((this.criteriaSectNumWeek == null)?"<null>":this.criteriaSectNumWeek));
        sb.append(',');
        sb.append("criteriaSectNumDay");
        sb.append('=');
        sb.append(((this.criteriaSectNumDay == null)?"<null>":this.criteriaSectNumDay));
        sb.append(',');
        sb.append("criteriaSectBeginDate");
        sb.append('=');
        sb.append(((this.criteriaSectBeginDate == null)?"<null>":this.criteriaSectBeginDate));
        sb.append(',');
        sb.append("criteriaPtrmEndDate");
        sb.append('=');
        sb.append(((this.criteriaPtrmEndDate == null)?"<null>":this.criteriaPtrmEndDate));
        sb.append(',');
        sb.append("criteriaAcadCutOffDate");
        sb.append('=');
        sb.append(((this.criteriaAcadCutOffDate == null)?"<null>":this.criteriaAcadCutOffDate));
        sb.append(',');
        sb.append("acadCutOffDate");
        sb.append('=');
        sb.append(((this.acadCutOffDate == null)?"<null>":this.acadCutOffDate));
        sb.append(',');
        sb.append("keyblckCrn");
        sb.append('=');
        sb.append(((this.keyblckCrn == null)?"<null>":this.keyblckCrn));
        sb.append(',');
        sb.append("criteriaAcclCode");
        sb.append('=');
        sb.append(((this.criteriaAcclCode == null)?"<null>":this.criteriaAcclCode));
        sb.append(',');
        sb.append("criteriaCensusEnrl");
        sb.append('=');
        sb.append(((this.criteriaCensusEnrl == null)?"<null>":this.criteriaCensusEnrl));
        sb.append(',');
        sb.append("criteriaPtrmStartDate");
        sb.append('=');
        sb.append(((this.criteriaPtrmStartDate == null)?"<null>":this.criteriaPtrmStartDate));
        sb.append(',');
        sb.append("criteriaSectEndDate");
        sb.append('=');
        sb.append(((this.criteriaSectEndDate == null)?"<null>":this.criteriaSectEndDate));
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
        result = ((result* 31)+((this.criteriaEnrlCutOffDate == null)? 0 :this.criteriaEnrlCutOffDate.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmCode == null)? 0 :this.criteriaPtrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaSectEndDate == null)? 0 :this.criteriaSectEndDate.hashCode()));
        result = ((result* 31)+((this.acclCode == null)? 0 :this.acclCode.hashCode()));
        result = ((result* 31)+((this.criteriaCensus2Date == null)? 0 :this.criteriaCensus2Date.hashCode()));
        result = ((result* 31)+((this.refundCutoffDate == null)? 0 :this.refundCutoffDate.hashCode()));
        result = ((result* 31)+((this.criteriaEnrl == null)? 0 :this.criteriaEnrl.hashCode()));
        result = ((result* 31)+((this.criteriaCensus2Enrl == null)? 0 :this.criteriaCensus2Enrl.hashCode()));
        result = ((result* 31)+((this.criteriaSectStartDate == null)? 0 :this.criteriaSectStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmStartDate == null)? 0 :this.criteriaPtrmStartDate.hashCode()));
        result = ((result* 31)+((this.enrlCutOffDate == null)? 0 :this.enrlCutOffDate.hashCode()));
        result = ((result* 31)+((this.dropCutOffDate == null)? 0 :this.dropCutOffDate.hashCode()));
        result = ((result* 31)+((this.criteriaAcclDesc == null)? 0 :this.criteriaAcclDesc.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmWeeks == null)? 0 :this.criteriaPtrmWeeks.hashCode()));
        result = ((result* 31)+((this.criteriaDropCutOffDate == null)? 0 :this.criteriaDropCutOffDate.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmDesc == null)? 0 :this.criteriaPtrmDesc.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaAcadCutOffDate == null)? 0 :this.criteriaAcadCutOffDate.hashCode()));
        result = ((result* 31)+((this.criteriaSectBeginDate == null)? 0 :this.criteriaSectBeginDate.hashCode()));
        result = ((result* 31)+((this.criteriaSectNumWeek == null)? 0 :this.criteriaSectNumWeek.hashCode()));
        result = ((result* 31)+((this.criteriaAcclCode == null)? 0 :this.criteriaAcclCode.hashCode()));
        result = ((result* 31)+((this.criteriaRefundCutoffDate == null)? 0 :this.criteriaRefundCutoffDate.hashCode()));
        result = ((result* 31)+((this.criteriaPtrmEndDate == null)? 0 :this.criteriaPtrmEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaCensusEnrl == null)? 0 :this.criteriaCensusEnrl.hashCode()));
        result = ((result* 31)+((this.criteriaSectNumDay == null)? 0 :this.criteriaSectNumDay.hashCode()));
        result = ((result* 31)+((this.acadCutOffDate == null)? 0 :this.acadCutOffDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckCrn == null)? 0 :this.keyblckCrn.hashCode()));
        result = ((result* 31)+((this.criteriaCensusEnrlDate == null)? 0 :this.criteriaCensusEnrlDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleCalendar100PutRequest) == false) {
            return false;
        }
        ScheduleCalendar100PutRequest rhs = ((ScheduleCalendar100PutRequest) other);
        return ((((((((((((((((((((((((((((((this.criteriaEnrlCutOffDate == rhs.criteriaEnrlCutOffDate)||((this.criteriaEnrlCutOffDate!= null)&&this.criteriaEnrlCutOffDate.equals(rhs.criteriaEnrlCutOffDate)))&&((this.criteriaPtrmCode == rhs.criteriaPtrmCode)||((this.criteriaPtrmCode!= null)&&this.criteriaPtrmCode.equals(rhs.criteriaPtrmCode))))&&((this.criteriaSectEndDate == rhs.criteriaSectEndDate)||((this.criteriaSectEndDate!= null)&&this.criteriaSectEndDate.equals(rhs.criteriaSectEndDate))))&&((this.acclCode == rhs.acclCode)||((this.acclCode!= null)&&this.acclCode.equals(rhs.acclCode))))&&((this.criteriaCensus2Date == rhs.criteriaCensus2Date)||((this.criteriaCensus2Date!= null)&&this.criteriaCensus2Date.equals(rhs.criteriaCensus2Date))))&&((this.refundCutoffDate == rhs.refundCutoffDate)||((this.refundCutoffDate!= null)&&this.refundCutoffDate.equals(rhs.refundCutoffDate))))&&((this.criteriaEnrl == rhs.criteriaEnrl)||((this.criteriaEnrl!= null)&&this.criteriaEnrl.equals(rhs.criteriaEnrl))))&&((this.criteriaCensus2Enrl == rhs.criteriaCensus2Enrl)||((this.criteriaCensus2Enrl!= null)&&this.criteriaCensus2Enrl.equals(rhs.criteriaCensus2Enrl))))&&((this.criteriaSectStartDate == rhs.criteriaSectStartDate)||((this.criteriaSectStartDate!= null)&&this.criteriaSectStartDate.equals(rhs.criteriaSectStartDate))))&&((this.criteriaPtrmStartDate == rhs.criteriaPtrmStartDate)||((this.criteriaPtrmStartDate!= null)&&this.criteriaPtrmStartDate.equals(rhs.criteriaPtrmStartDate))))&&((this.enrlCutOffDate == rhs.enrlCutOffDate)||((this.enrlCutOffDate!= null)&&this.enrlCutOffDate.equals(rhs.enrlCutOffDate))))&&((this.dropCutOffDate == rhs.dropCutOffDate)||((this.dropCutOffDate!= null)&&this.dropCutOffDate.equals(rhs.dropCutOffDate))))&&((this.criteriaAcclDesc == rhs.criteriaAcclDesc)||((this.criteriaAcclDesc!= null)&&this.criteriaAcclDesc.equals(rhs.criteriaAcclDesc))))&&((this.criteriaPtrmWeeks == rhs.criteriaPtrmWeeks)||((this.criteriaPtrmWeeks!= null)&&this.criteriaPtrmWeeks.equals(rhs.criteriaPtrmWeeks))))&&((this.criteriaDropCutOffDate == rhs.criteriaDropCutOffDate)||((this.criteriaDropCutOffDate!= null)&&this.criteriaDropCutOffDate.equals(rhs.criteriaDropCutOffDate))))&&((this.criteriaPtrmDesc == rhs.criteriaPtrmDesc)||((this.criteriaPtrmDesc!= null)&&this.criteriaPtrmDesc.equals(rhs.criteriaPtrmDesc))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.criteriaAcadCutOffDate == rhs.criteriaAcadCutOffDate)||((this.criteriaAcadCutOffDate!= null)&&this.criteriaAcadCutOffDate.equals(rhs.criteriaAcadCutOffDate))))&&((this.criteriaSectBeginDate == rhs.criteriaSectBeginDate)||((this.criteriaSectBeginDate!= null)&&this.criteriaSectBeginDate.equals(rhs.criteriaSectBeginDate))))&&((this.criteriaSectNumWeek == rhs.criteriaSectNumWeek)||((this.criteriaSectNumWeek!= null)&&this.criteriaSectNumWeek.equals(rhs.criteriaSectNumWeek))))&&((this.criteriaAcclCode == rhs.criteriaAcclCode)||((this.criteriaAcclCode!= null)&&this.criteriaAcclCode.equals(rhs.criteriaAcclCode))))&&((this.criteriaRefundCutoffDate == rhs.criteriaRefundCutoffDate)||((this.criteriaRefundCutoffDate!= null)&&this.criteriaRefundCutoffDate.equals(rhs.criteriaRefundCutoffDate))))&&((this.criteriaPtrmEndDate == rhs.criteriaPtrmEndDate)||((this.criteriaPtrmEndDate!= null)&&this.criteriaPtrmEndDate.equals(rhs.criteriaPtrmEndDate))))&&((this.criteriaCensusEnrl == rhs.criteriaCensusEnrl)||((this.criteriaCensusEnrl!= null)&&this.criteriaCensusEnrl.equals(rhs.criteriaCensusEnrl))))&&((this.criteriaSectNumDay == rhs.criteriaSectNumDay)||((this.criteriaSectNumDay!= null)&&this.criteriaSectNumDay.equals(rhs.criteriaSectNumDay))))&&((this.acadCutOffDate == rhs.acadCutOffDate)||((this.acadCutOffDate!= null)&&this.acadCutOffDate.equals(rhs.acadCutOffDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckCrn == rhs.keyblckCrn)||((this.keyblckCrn!= null)&&this.keyblckCrn.equals(rhs.keyblckCrn))))&&((this.criteriaCensusEnrlDate == rhs.criteriaCensusEnrlDate)||((this.criteriaCensusEnrlDate!= null)&&this.criteriaCensusEnrlDate.equals(rhs.criteriaCensusEnrlDate))));
    }

}
