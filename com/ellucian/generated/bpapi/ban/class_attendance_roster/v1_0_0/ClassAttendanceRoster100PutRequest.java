
package com.ellucian.generated.bpapi.ban.class_attendance_roster.v1_0_0;

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
    "criteria.spridenId",
    "ssbsectCrnt",
    "criteria.attendHr",
    "ssbsectDegsAwrdInd",
    "ssbsectTermCodet",
    "criteria.regSeq",
    "criteria.rolled",
    "criteria.rstsDate",
    "criteria.rstsCode",
    "criteria.creditHr",
    "criteria.incompleteExtDate",
    "sfrstcrLastAttend",
    "criteria.grdeCode",
    "sfrstcrAttendHr",
    "criteria.gcmtCodeDesc",
    "criteria.spridenCurrName",
    "criteria.grdeIncmpFinal",
    "criteria.gcmtCode",
    "criteria.gmodCode",
    "criteria.lastAttend"
})
@Generated("jsonschema2pojo")
public class ClassAttendanceRoster100PutRequest {

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spridenId")
    private String criteriaSpridenId;
    /**
     * CRN
     * <p>
     * Lineage reference object : ssbsectCrnt
     * 
     */
    @JsonProperty("ssbsectCrnt")
    @JsonPropertyDescription("Lineage reference object : ssbsectCrnt")
    private Object ssbsectCrnt;
    /**
     * Hours Attended
     * <p>
     * Lineage reference object : SFRSTCR_ATTEND_HR
     * 
     */
    @JsonProperty("criteria.attendHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_ATTEND_HR")
    private Double criteriaAttendHr;
    /**
     * Degree Award Status
     * <p>
     * Lineage reference object : ssbsectDegsAwrdInd
     * 
     */
    @JsonProperty("ssbsectDegsAwrdInd")
    @JsonPropertyDescription("Lineage reference object : ssbsectDegsAwrdInd")
    private Object ssbsectDegsAwrdInd;
    /**
     * Term
     * <p>
     * Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssbsectTermCodet")
    @JsonPropertyDescription("Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm")
    private Object ssbsectTermCodet;
    /**
     * Sequence
     * <p>
     * Lineage reference object : SFRSTCR_REG_SEQ
     * 
     */
    @JsonProperty("criteria.regSeq")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_REG_SEQ")
    private Double criteriaRegSeq;
    @JsonProperty("criteria.rolled")
    private String criteriaRolled;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("criteria.rstsDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_RSTS_DATE")
    private Date criteriaRstsDate;
    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("criteria.rstsCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts")
    private String criteriaRstsCode;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("criteria.creditHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CREDIT_HR")
    private Double criteriaCreditHr;
    /**
     * Extension Date
     * <p>
     * Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("criteria.incompleteExtDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE")
    private Date criteriaIncompleteExtDate;
    /**
     * Last Attendance Date
     * <p>
     * Lineage reference object : SFRSTCR_LAST_ATTEND
     * 
     */
    @JsonProperty("sfrstcrLastAttend")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_LAST_ATTEND")
    private Date sfrstcrLastAttend;
    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("criteria.grdeCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE")
    private String criteriaGrdeCode;
    /**
     * Hours Attended
     * <p>
     * Lineage reference object : SFRSTCR_ATTEND_HR
     * 
     */
    @JsonProperty("sfrstcrAttendHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_ATTEND_HR")
    private Double sfrstcrAttendHr;
    /**
     * Grade Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.gcmtCodeDesc")
    private String criteriaGcmtCodeDesc;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spridenCurrName")
    private String criteriaSpridenCurrName;
    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeIncmpFinal")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde")
    private String criteriaGrdeIncmpFinal;
    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("criteria.gcmtCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt")
    private String criteriaGcmtCode;
    /**
     * Grading Mode
     * <p>
     * Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("criteria.gmodCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod")
    private String criteriaGmodCode;
    /**
     * Last Attendance Date
     * <p>
     * Lineage reference object : SFRSTCR_LAST_ATTEND
     * 
     */
    @JsonProperty("criteria.lastAttend")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_LAST_ATTEND")
    private Date criteriaLastAttend;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spridenId")
    public String getCriteriaSpridenId() {
        return criteriaSpridenId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spridenId")
    public void setCriteriaSpridenId(String criteriaSpridenId) {
        this.criteriaSpridenId = criteriaSpridenId;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaSpridenId(String criteriaSpridenId) {
        this.criteriaSpridenId = criteriaSpridenId;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssbsectCrnt
     * 
     */
    @JsonProperty("ssbsectCrnt")
    public Object getSsbsectCrnt() {
        return ssbsectCrnt;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssbsectCrnt
     * 
     */
    @JsonProperty("ssbsectCrnt")
    public void setSsbsectCrnt(Object ssbsectCrnt) {
        this.ssbsectCrnt = ssbsectCrnt;
    }

    public ClassAttendanceRoster100PutRequest withSsbsectCrnt(Object ssbsectCrnt) {
        this.ssbsectCrnt = ssbsectCrnt;
        return this;
    }

    /**
     * Hours Attended
     * <p>
     * Lineage reference object : SFRSTCR_ATTEND_HR
     * 
     */
    @JsonProperty("criteria.attendHr")
    public Double getCriteriaAttendHr() {
        return criteriaAttendHr;
    }

    /**
     * Hours Attended
     * <p>
     * Lineage reference object : SFRSTCR_ATTEND_HR
     * 
     */
    @JsonProperty("criteria.attendHr")
    public void setCriteriaAttendHr(Double criteriaAttendHr) {
        this.criteriaAttendHr = criteriaAttendHr;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaAttendHr(Double criteriaAttendHr) {
        this.criteriaAttendHr = criteriaAttendHr;
        return this;
    }

    /**
     * Degree Award Status
     * <p>
     * Lineage reference object : ssbsectDegsAwrdInd
     * 
     */
    @JsonProperty("ssbsectDegsAwrdInd")
    public Object getSsbsectDegsAwrdInd() {
        return ssbsectDegsAwrdInd;
    }

    /**
     * Degree Award Status
     * <p>
     * Lineage reference object : ssbsectDegsAwrdInd
     * 
     */
    @JsonProperty("ssbsectDegsAwrdInd")
    public void setSsbsectDegsAwrdInd(Object ssbsectDegsAwrdInd) {
        this.ssbsectDegsAwrdInd = ssbsectDegsAwrdInd;
    }

    public ClassAttendanceRoster100PutRequest withSsbsectDegsAwrdInd(Object ssbsectDegsAwrdInd) {
        this.ssbsectDegsAwrdInd = ssbsectDegsAwrdInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssbsectTermCodet")
    public Object getSsbsectTermCodet() {
        return ssbsectTermCodet;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssbsectTermCodet")
    public void setSsbsectTermCodet(Object ssbsectTermCodet) {
        this.ssbsectTermCodet = ssbsectTermCodet;
    }

    public ClassAttendanceRoster100PutRequest withSsbsectTermCodet(Object ssbsectTermCodet) {
        this.ssbsectTermCodet = ssbsectTermCodet;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SFRSTCR_REG_SEQ
     * 
     */
    @JsonProperty("criteria.regSeq")
    public Double getCriteriaRegSeq() {
        return criteriaRegSeq;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SFRSTCR_REG_SEQ
     * 
     */
    @JsonProperty("criteria.regSeq")
    public void setCriteriaRegSeq(Double criteriaRegSeq) {
        this.criteriaRegSeq = criteriaRegSeq;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaRegSeq(Double criteriaRegSeq) {
        this.criteriaRegSeq = criteriaRegSeq;
        return this;
    }

    @JsonProperty("criteria.rolled")
    public String getCriteriaRolled() {
        return criteriaRolled;
    }

    @JsonProperty("criteria.rolled")
    public void setCriteriaRolled(String criteriaRolled) {
        this.criteriaRolled = criteriaRolled;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaRolled(String criteriaRolled) {
        this.criteriaRolled = criteriaRolled;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("criteria.rstsDate")
    public Date getCriteriaRstsDate() {
        return criteriaRstsDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("criteria.rstsDate")
    public void setCriteriaRstsDate(Date criteriaRstsDate) {
        this.criteriaRstsDate = criteriaRstsDate;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaRstsDate(Date criteriaRstsDate) {
        this.criteriaRstsDate = criteriaRstsDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("criteria.rstsCode")
    public String getCriteriaRstsCode() {
        return criteriaRstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("criteria.rstsCode")
    public void setCriteriaRstsCode(String criteriaRstsCode) {
        this.criteriaRstsCode = criteriaRstsCode;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaRstsCode(String criteriaRstsCode) {
        this.criteriaRstsCode = criteriaRstsCode;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("criteria.creditHr")
    public Double getCriteriaCreditHr() {
        return criteriaCreditHr;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("criteria.creditHr")
    public void setCriteriaCreditHr(Double criteriaCreditHr) {
        this.criteriaCreditHr = criteriaCreditHr;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaCreditHr(Double criteriaCreditHr) {
        this.criteriaCreditHr = criteriaCreditHr;
        return this;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("criteria.incompleteExtDate")
    public Date getCriteriaIncompleteExtDate() {
        return criteriaIncompleteExtDate;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("criteria.incompleteExtDate")
    public void setCriteriaIncompleteExtDate(Date criteriaIncompleteExtDate) {
        this.criteriaIncompleteExtDate = criteriaIncompleteExtDate;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaIncompleteExtDate(Date criteriaIncompleteExtDate) {
        this.criteriaIncompleteExtDate = criteriaIncompleteExtDate;
        return this;
    }

    /**
     * Last Attendance Date
     * <p>
     * Lineage reference object : SFRSTCR_LAST_ATTEND
     * 
     */
    @JsonProperty("sfrstcrLastAttend")
    public Date getSfrstcrLastAttend() {
        return sfrstcrLastAttend;
    }

    /**
     * Last Attendance Date
     * <p>
     * Lineage reference object : SFRSTCR_LAST_ATTEND
     * 
     */
    @JsonProperty("sfrstcrLastAttend")
    public void setSfrstcrLastAttend(Date sfrstcrLastAttend) {
        this.sfrstcrLastAttend = sfrstcrLastAttend;
    }

    public ClassAttendanceRoster100PutRequest withSfrstcrLastAttend(Date sfrstcrLastAttend) {
        this.sfrstcrLastAttend = sfrstcrLastAttend;
        return this;
    }

    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("criteria.grdeCode")
    public String getCriteriaGrdeCode() {
        return criteriaGrdeCode;
    }

    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("criteria.grdeCode")
    public void setCriteriaGrdeCode(String criteriaGrdeCode) {
        this.criteriaGrdeCode = criteriaGrdeCode;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaGrdeCode(String criteriaGrdeCode) {
        this.criteriaGrdeCode = criteriaGrdeCode;
        return this;
    }

    /**
     * Hours Attended
     * <p>
     * Lineage reference object : SFRSTCR_ATTEND_HR
     * 
     */
    @JsonProperty("sfrstcrAttendHr")
    public Double getSfrstcrAttendHr() {
        return sfrstcrAttendHr;
    }

    /**
     * Hours Attended
     * <p>
     * Lineage reference object : SFRSTCR_ATTEND_HR
     * 
     */
    @JsonProperty("sfrstcrAttendHr")
    public void setSfrstcrAttendHr(Double sfrstcrAttendHr) {
        this.sfrstcrAttendHr = sfrstcrAttendHr;
    }

    public ClassAttendanceRoster100PutRequest withSfrstcrAttendHr(Double sfrstcrAttendHr) {
        this.sfrstcrAttendHr = sfrstcrAttendHr;
        return this;
    }

    /**
     * Grade Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.gcmtCodeDesc")
    public String getCriteriaGcmtCodeDesc() {
        return criteriaGcmtCodeDesc;
    }

    /**
     * Grade Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.gcmtCodeDesc")
    public void setCriteriaGcmtCodeDesc(String criteriaGcmtCodeDesc) {
        this.criteriaGcmtCodeDesc = criteriaGcmtCodeDesc;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaGcmtCodeDesc(String criteriaGcmtCodeDesc) {
        this.criteriaGcmtCodeDesc = criteriaGcmtCodeDesc;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spridenCurrName")
    public String getCriteriaSpridenCurrName() {
        return criteriaSpridenCurrName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.spridenCurrName")
    public void setCriteriaSpridenCurrName(String criteriaSpridenCurrName) {
        this.criteriaSpridenCurrName = criteriaSpridenCurrName;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaSpridenCurrName(String criteriaSpridenCurrName) {
        this.criteriaSpridenCurrName = criteriaSpridenCurrName;
        return this;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeIncmpFinal")
    public String getCriteriaGrdeIncmpFinal() {
        return criteriaGrdeIncmpFinal;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("criteria.grdeIncmpFinal")
    public void setCriteriaGrdeIncmpFinal(String criteriaGrdeIncmpFinal) {
        this.criteriaGrdeIncmpFinal = criteriaGrdeIncmpFinal;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaGrdeIncmpFinal(String criteriaGrdeIncmpFinal) {
        this.criteriaGrdeIncmpFinal = criteriaGrdeIncmpFinal;
        return this;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("criteria.gcmtCode")
    public String getCriteriaGcmtCode() {
        return criteriaGcmtCode;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("criteria.gcmtCode")
    public void setCriteriaGcmtCode(String criteriaGcmtCode) {
        this.criteriaGcmtCode = criteriaGcmtCode;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaGcmtCode(String criteriaGcmtCode) {
        this.criteriaGcmtCode = criteriaGcmtCode;
        return this;
    }

    /**
     * Grading Mode
     * <p>
     * Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("criteria.gmodCode")
    public String getCriteriaGmodCode() {
        return criteriaGmodCode;
    }

    /**
     * Grading Mode
     * <p>
     * Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("criteria.gmodCode")
    public void setCriteriaGmodCode(String criteriaGmodCode) {
        this.criteriaGmodCode = criteriaGmodCode;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaGmodCode(String criteriaGmodCode) {
        this.criteriaGmodCode = criteriaGmodCode;
        return this;
    }

    /**
     * Last Attendance Date
     * <p>
     * Lineage reference object : SFRSTCR_LAST_ATTEND
     * 
     */
    @JsonProperty("criteria.lastAttend")
    public Date getCriteriaLastAttend() {
        return criteriaLastAttend;
    }

    /**
     * Last Attendance Date
     * <p>
     * Lineage reference object : SFRSTCR_LAST_ATTEND
     * 
     */
    @JsonProperty("criteria.lastAttend")
    public void setCriteriaLastAttend(Date criteriaLastAttend) {
        this.criteriaLastAttend = criteriaLastAttend;
    }

    public ClassAttendanceRoster100PutRequest withCriteriaLastAttend(Date criteriaLastAttend) {
        this.criteriaLastAttend = criteriaLastAttend;
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

    public ClassAttendanceRoster100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassAttendanceRoster100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaSpridenId");
        sb.append('=');
        sb.append(((this.criteriaSpridenId == null)?"<null>":this.criteriaSpridenId));
        sb.append(',');
        sb.append("ssbsectCrnt");
        sb.append('=');
        sb.append(((this.ssbsectCrnt == null)?"<null>":this.ssbsectCrnt));
        sb.append(',');
        sb.append("criteriaAttendHr");
        sb.append('=');
        sb.append(((this.criteriaAttendHr == null)?"<null>":this.criteriaAttendHr));
        sb.append(',');
        sb.append("ssbsectDegsAwrdInd");
        sb.append('=');
        sb.append(((this.ssbsectDegsAwrdInd == null)?"<null>":this.ssbsectDegsAwrdInd));
        sb.append(',');
        sb.append("ssbsectTermCodet");
        sb.append('=');
        sb.append(((this.ssbsectTermCodet == null)?"<null>":this.ssbsectTermCodet));
        sb.append(',');
        sb.append("criteriaRegSeq");
        sb.append('=');
        sb.append(((this.criteriaRegSeq == null)?"<null>":this.criteriaRegSeq));
        sb.append(',');
        sb.append("criteriaRolled");
        sb.append('=');
        sb.append(((this.criteriaRolled == null)?"<null>":this.criteriaRolled));
        sb.append(',');
        sb.append("criteriaRstsDate");
        sb.append('=');
        sb.append(((this.criteriaRstsDate == null)?"<null>":this.criteriaRstsDate));
        sb.append(',');
        sb.append("criteriaRstsCode");
        sb.append('=');
        sb.append(((this.criteriaRstsCode == null)?"<null>":this.criteriaRstsCode));
        sb.append(',');
        sb.append("criteriaCreditHr");
        sb.append('=');
        sb.append(((this.criteriaCreditHr == null)?"<null>":this.criteriaCreditHr));
        sb.append(',');
        sb.append("criteriaIncompleteExtDate");
        sb.append('=');
        sb.append(((this.criteriaIncompleteExtDate == null)?"<null>":this.criteriaIncompleteExtDate));
        sb.append(',');
        sb.append("sfrstcrLastAttend");
        sb.append('=');
        sb.append(((this.sfrstcrLastAttend == null)?"<null>":this.sfrstcrLastAttend));
        sb.append(',');
        sb.append("criteriaGrdeCode");
        sb.append('=');
        sb.append(((this.criteriaGrdeCode == null)?"<null>":this.criteriaGrdeCode));
        sb.append(',');
        sb.append("sfrstcrAttendHr");
        sb.append('=');
        sb.append(((this.sfrstcrAttendHr == null)?"<null>":this.sfrstcrAttendHr));
        sb.append(',');
        sb.append("criteriaGcmtCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaGcmtCodeDesc == null)?"<null>":this.criteriaGcmtCodeDesc));
        sb.append(',');
        sb.append("criteriaSpridenCurrName");
        sb.append('=');
        sb.append(((this.criteriaSpridenCurrName == null)?"<null>":this.criteriaSpridenCurrName));
        sb.append(',');
        sb.append("criteriaGrdeIncmpFinal");
        sb.append('=');
        sb.append(((this.criteriaGrdeIncmpFinal == null)?"<null>":this.criteriaGrdeIncmpFinal));
        sb.append(',');
        sb.append("criteriaGcmtCode");
        sb.append('=');
        sb.append(((this.criteriaGcmtCode == null)?"<null>":this.criteriaGcmtCode));
        sb.append(',');
        sb.append("criteriaGmodCode");
        sb.append('=');
        sb.append(((this.criteriaGmodCode == null)?"<null>":this.criteriaGmodCode));
        sb.append(',');
        sb.append("criteriaLastAttend");
        sb.append('=');
        sb.append(((this.criteriaLastAttend == null)?"<null>":this.criteriaLastAttend));
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
        result = ((result* 31)+((this.criteriaGcmtCode == null)? 0 :this.criteriaGcmtCode.hashCode()));
        result = ((result* 31)+((this.ssbsectCrnt == null)? 0 :this.ssbsectCrnt.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeCode == null)? 0 :this.criteriaGrdeCode.hashCode()));
        result = ((result* 31)+((this.criteriaAttendHr == null)? 0 :this.criteriaAttendHr.hashCode()));
        result = ((result* 31)+((this.ssbsectDegsAwrdInd == null)? 0 :this.ssbsectDegsAwrdInd.hashCode()));
        result = ((result* 31)+((this.criteriaLastAttend == null)? 0 :this.criteriaLastAttend.hashCode()));
        result = ((result* 31)+((this.ssbsectTermCodet == null)? 0 :this.ssbsectTermCodet.hashCode()));
        result = ((result* 31)+((this.criteriaRstsDate == null)? 0 :this.criteriaRstsDate.hashCode()));
        result = ((result* 31)+((this.criteriaGrdeIncmpFinal == null)? 0 :this.criteriaGrdeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.criteriaRstsCode == null)? 0 :this.criteriaRstsCode.hashCode()));
        result = ((result* 31)+((this.criteriaGmodCode == null)? 0 :this.criteriaGmodCode.hashCode()));
        result = ((result* 31)+((this.criteriaCreditHr == null)? 0 :this.criteriaCreditHr.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenCurrName == null)? 0 :this.criteriaSpridenCurrName.hashCode()));
        result = ((result* 31)+((this.criteriaGcmtCodeDesc == null)? 0 :this.criteriaGcmtCodeDesc.hashCode()));
        result = ((result* 31)+((this.sfrstcrLastAttend == null)? 0 :this.sfrstcrLastAttend.hashCode()));
        result = ((result* 31)+((this.criteriaRegSeq == null)? 0 :this.criteriaRegSeq.hashCode()));
        result = ((result* 31)+((this.criteriaRolled == null)? 0 :this.criteriaRolled.hashCode()));
        result = ((result* 31)+((this.criteriaIncompleteExtDate == null)? 0 :this.criteriaIncompleteExtDate.hashCode()));
        result = ((result* 31)+((this.sfrstcrAttendHr == null)? 0 :this.sfrstcrAttendHr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaSpridenId == null)? 0 :this.criteriaSpridenId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassAttendanceRoster100PutRequest) == false) {
            return false;
        }
        ClassAttendanceRoster100PutRequest rhs = ((ClassAttendanceRoster100PutRequest) other);
        return ((((((((((((((((((((((this.criteriaGcmtCode == rhs.criteriaGcmtCode)||((this.criteriaGcmtCode!= null)&&this.criteriaGcmtCode.equals(rhs.criteriaGcmtCode)))&&((this.ssbsectCrnt == rhs.ssbsectCrnt)||((this.ssbsectCrnt!= null)&&this.ssbsectCrnt.equals(rhs.ssbsectCrnt))))&&((this.criteriaGrdeCode == rhs.criteriaGrdeCode)||((this.criteriaGrdeCode!= null)&&this.criteriaGrdeCode.equals(rhs.criteriaGrdeCode))))&&((this.criteriaAttendHr == rhs.criteriaAttendHr)||((this.criteriaAttendHr!= null)&&this.criteriaAttendHr.equals(rhs.criteriaAttendHr))))&&((this.ssbsectDegsAwrdInd == rhs.ssbsectDegsAwrdInd)||((this.ssbsectDegsAwrdInd!= null)&&this.ssbsectDegsAwrdInd.equals(rhs.ssbsectDegsAwrdInd))))&&((this.criteriaLastAttend == rhs.criteriaLastAttend)||((this.criteriaLastAttend!= null)&&this.criteriaLastAttend.equals(rhs.criteriaLastAttend))))&&((this.ssbsectTermCodet == rhs.ssbsectTermCodet)||((this.ssbsectTermCodet!= null)&&this.ssbsectTermCodet.equals(rhs.ssbsectTermCodet))))&&((this.criteriaRstsDate == rhs.criteriaRstsDate)||((this.criteriaRstsDate!= null)&&this.criteriaRstsDate.equals(rhs.criteriaRstsDate))))&&((this.criteriaGrdeIncmpFinal == rhs.criteriaGrdeIncmpFinal)||((this.criteriaGrdeIncmpFinal!= null)&&this.criteriaGrdeIncmpFinal.equals(rhs.criteriaGrdeIncmpFinal))))&&((this.criteriaRstsCode == rhs.criteriaRstsCode)||((this.criteriaRstsCode!= null)&&this.criteriaRstsCode.equals(rhs.criteriaRstsCode))))&&((this.criteriaGmodCode == rhs.criteriaGmodCode)||((this.criteriaGmodCode!= null)&&this.criteriaGmodCode.equals(rhs.criteriaGmodCode))))&&((this.criteriaCreditHr == rhs.criteriaCreditHr)||((this.criteriaCreditHr!= null)&&this.criteriaCreditHr.equals(rhs.criteriaCreditHr))))&&((this.criteriaSpridenCurrName == rhs.criteriaSpridenCurrName)||((this.criteriaSpridenCurrName!= null)&&this.criteriaSpridenCurrName.equals(rhs.criteriaSpridenCurrName))))&&((this.criteriaGcmtCodeDesc == rhs.criteriaGcmtCodeDesc)||((this.criteriaGcmtCodeDesc!= null)&&this.criteriaGcmtCodeDesc.equals(rhs.criteriaGcmtCodeDesc))))&&((this.sfrstcrLastAttend == rhs.sfrstcrLastAttend)||((this.sfrstcrLastAttend!= null)&&this.sfrstcrLastAttend.equals(rhs.sfrstcrLastAttend))))&&((this.criteriaRegSeq == rhs.criteriaRegSeq)||((this.criteriaRegSeq!= null)&&this.criteriaRegSeq.equals(rhs.criteriaRegSeq))))&&((this.criteriaRolled == rhs.criteriaRolled)||((this.criteriaRolled!= null)&&this.criteriaRolled.equals(rhs.criteriaRolled))))&&((this.criteriaIncompleteExtDate == rhs.criteriaIncompleteExtDate)||((this.criteriaIncompleteExtDate!= null)&&this.criteriaIncompleteExtDate.equals(rhs.criteriaIncompleteExtDate))))&&((this.sfrstcrAttendHr == rhs.sfrstcrAttendHr)||((this.sfrstcrAttendHr!= null)&&this.sfrstcrAttendHr.equals(rhs.sfrstcrAttendHr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaSpridenId == rhs.criteriaSpridenId)||((this.criteriaSpridenId!= null)&&this.criteriaSpridenId.equals(rhs.criteriaSpridenId))));
    }

}
