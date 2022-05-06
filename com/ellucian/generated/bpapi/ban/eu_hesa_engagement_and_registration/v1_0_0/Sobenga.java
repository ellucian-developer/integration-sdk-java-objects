
package com.ellucian.generated.bpapi.ban.eu_hesa_engagement_and_registration.v1_0_0;

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
    "rcStuId",
    "ssdtCodeFeeEligSt",
    "ssdtCodeLeadSchool",
    "ssdtCodeFeeStatusSt",
    "ssdtCodeIncExchangeSt",
    "ssdtCodeRcStu",
    "ssdtCodeFeeElig",
    "ssdtCodeEntryrte",
    "teacherRefNumber",
    "ownId",
    "activityDate",
    "instNumhus",
    "ssdtCodeFeeStatus",
    "ssdtCodeRcStuSt",
    "ssdtCodeEmpSchool",
    "intentionEndDate",
    "ssdtCodeQts",
    "userId",
    "ssdtCodeEmpSchoolSt",
    "ssdtCodeStdyintntn",
    "ssdtCodeQtsSt",
    "ssdtCodeStdyintntnSt",
    "ssdtCodeIncExchange",
    "ssdtCodeNhsEmployer",
    "ssdtCodeEntryrteSt",
    "ssdtCodeLeadSchoolSt",
    "ssdtCodeNhsEmployerSt",
    "startDate"
})
@Generated("jsonschema2pojo")
public class Sobenga {

    /**
     * Research Council Student Identifier
     * <p>
     * Lineage reference object : SOBENGA_RC_STU_ID
     * 
     */
    @JsonProperty("rcStuId")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_RC_STU_ID")
    private String rcStuId;
    @JsonProperty("ssdtCodeFeeEligSt")
    private String ssdtCodeFeeEligSt;
    /**
     * Lead School
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_LEAD_SCHOOL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeLeadSchool")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_LEAD_SCHOOL, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeLeadSchool;
    @JsonProperty("ssdtCodeFeeStatusSt")
    private String ssdtCodeFeeStatusSt;
    @JsonProperty("ssdtCodeIncExchangeSt")
    private String ssdtCodeIncExchangeSt;
    /**
     * Research Council Student
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_RC_STU, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRcStu")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_RC_STU, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeRcStu;
    /**
     * Fee Eligibility
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_FEE_ELIG, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFeeElig")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_FEE_ELIG, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeFeeElig;
    /**
     * ITT Entry Route
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_ENTRYRTE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEntryrte")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_ENTRYRTE, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeEntryrte;
    /**
     * Teacher Reference Number
     * <p>
     * Lineage reference object : SOBENGA_TEACHER_REF_NUMBER
     * 
     */
    @JsonProperty("teacherRefNumber")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_TEACHER_REF_NUMBER")
    private String teacherRefNumber;
    /**
     * Own Engagement Identifier
     * <p>
     * Lineage reference object : SOBENGA_OWN_ID
     * 
     */
    @JsonProperty("ownId")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_OWN_ID")
    private String ownId;
    /**
     * Lineage reference object : SOBENGA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Institution Numhus
     * <p>
     * Lineage reference object : SOBENGA_INST_NUMHUS
     * 
     */
    @JsonProperty("instNumhus")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_INST_NUMHUS")
    private String instNumhus;
    /**
     * Fee Status
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_FEE_STATUS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFeeStatus")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_FEE_STATUS, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeFeeStatus;
    @JsonProperty("ssdtCodeRcStuSt")
    private String ssdtCodeRcStuSt;
    /**
     * Employing School
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_EMP_SCHOOL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEmpSchool")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_EMP_SCHOOL, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeEmpSchool;
    /**
     * Expected End Date
     * <p>
     * Lineage reference object : SOBENGA_INTENTION_END_DATE
     * 
     */
    @JsonProperty("intentionEndDate")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_INTENTION_END_DATE")
    private Date intentionEndDate;
    /**
     * Qualified Teacher Status
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_QTS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQts")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_QTS, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeQts;
    /**
     * Lineage reference object : SOBENGA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_USER_ID")
    private String userId;
    @JsonProperty("ssdtCodeEmpSchoolSt")
    private String ssdtCodeEmpSchoolSt;
    /**
     * Study Intention
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_STDYINTNTN, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeStdyintntn")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_STDYINTNTN, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeStdyintntn;
    @JsonProperty("ssdtCodeQtsSt")
    private String ssdtCodeQtsSt;
    @JsonProperty("ssdtCodeStdyintntnSt")
    private String ssdtCodeStdyintntnSt;
    /**
     * Incoming Exchange
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_INC_EXCHANGE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeIncExchange")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_INC_EXCHANGE, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeIncExchange;
    /**
     * NHS Employer
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_NHS_EMPLOYER, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeNhsEmployer")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_SSDT_CODE_NHS_EMPLOYER, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeNhsEmployer;
    @JsonProperty("ssdtCodeEntryrteSt")
    private String ssdtCodeEntryrteSt;
    @JsonProperty("ssdtCodeLeadSchoolSt")
    private String ssdtCodeLeadSchoolSt;
    @JsonProperty("ssdtCodeNhsEmployerSt")
    private String ssdtCodeNhsEmployerSt;
    /**
     * Engagement Start Date
     * <p>
     * Lineage reference object : SOBENGA_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SOBENGA_START_DATE")
    private Date startDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Research Council Student Identifier
     * <p>
     * Lineage reference object : SOBENGA_RC_STU_ID
     * 
     */
    @JsonProperty("rcStuId")
    public String getRcStuId() {
        return rcStuId;
    }

    /**
     * Research Council Student Identifier
     * <p>
     * Lineage reference object : SOBENGA_RC_STU_ID
     * 
     */
    @JsonProperty("rcStuId")
    public void setRcStuId(String rcStuId) {
        this.rcStuId = rcStuId;
    }

    public Sobenga withRcStuId(String rcStuId) {
        this.rcStuId = rcStuId;
        return this;
    }

    @JsonProperty("ssdtCodeFeeEligSt")
    public String getSsdtCodeFeeEligSt() {
        return ssdtCodeFeeEligSt;
    }

    @JsonProperty("ssdtCodeFeeEligSt")
    public void setSsdtCodeFeeEligSt(String ssdtCodeFeeEligSt) {
        this.ssdtCodeFeeEligSt = ssdtCodeFeeEligSt;
    }

    public Sobenga withSsdtCodeFeeEligSt(String ssdtCodeFeeEligSt) {
        this.ssdtCodeFeeEligSt = ssdtCodeFeeEligSt;
        return this;
    }

    /**
     * Lead School
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_LEAD_SCHOOL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeLeadSchool")
    public String getSsdtCodeLeadSchool() {
        return ssdtCodeLeadSchool;
    }

    /**
     * Lead School
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_LEAD_SCHOOL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeLeadSchool")
    public void setSsdtCodeLeadSchool(String ssdtCodeLeadSchool) {
        this.ssdtCodeLeadSchool = ssdtCodeLeadSchool;
    }

    public Sobenga withSsdtCodeLeadSchool(String ssdtCodeLeadSchool) {
        this.ssdtCodeLeadSchool = ssdtCodeLeadSchool;
        return this;
    }

    @JsonProperty("ssdtCodeFeeStatusSt")
    public String getSsdtCodeFeeStatusSt() {
        return ssdtCodeFeeStatusSt;
    }

    @JsonProperty("ssdtCodeFeeStatusSt")
    public void setSsdtCodeFeeStatusSt(String ssdtCodeFeeStatusSt) {
        this.ssdtCodeFeeStatusSt = ssdtCodeFeeStatusSt;
    }

    public Sobenga withSsdtCodeFeeStatusSt(String ssdtCodeFeeStatusSt) {
        this.ssdtCodeFeeStatusSt = ssdtCodeFeeStatusSt;
        return this;
    }

    @JsonProperty("ssdtCodeIncExchangeSt")
    public String getSsdtCodeIncExchangeSt() {
        return ssdtCodeIncExchangeSt;
    }

    @JsonProperty("ssdtCodeIncExchangeSt")
    public void setSsdtCodeIncExchangeSt(String ssdtCodeIncExchangeSt) {
        this.ssdtCodeIncExchangeSt = ssdtCodeIncExchangeSt;
    }

    public Sobenga withSsdtCodeIncExchangeSt(String ssdtCodeIncExchangeSt) {
        this.ssdtCodeIncExchangeSt = ssdtCodeIncExchangeSt;
        return this;
    }

    /**
     * Research Council Student
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_RC_STU, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRcStu")
    public String getSsdtCodeRcStu() {
        return ssdtCodeRcStu;
    }

    /**
     * Research Council Student
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_RC_STU, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeRcStu")
    public void setSsdtCodeRcStu(String ssdtCodeRcStu) {
        this.ssdtCodeRcStu = ssdtCodeRcStu;
    }

    public Sobenga withSsdtCodeRcStu(String ssdtCodeRcStu) {
        this.ssdtCodeRcStu = ssdtCodeRcStu;
        return this;
    }

    /**
     * Fee Eligibility
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_FEE_ELIG, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFeeElig")
    public String getSsdtCodeFeeElig() {
        return ssdtCodeFeeElig;
    }

    /**
     * Fee Eligibility
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_FEE_ELIG, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFeeElig")
    public void setSsdtCodeFeeElig(String ssdtCodeFeeElig) {
        this.ssdtCodeFeeElig = ssdtCodeFeeElig;
    }

    public Sobenga withSsdtCodeFeeElig(String ssdtCodeFeeElig) {
        this.ssdtCodeFeeElig = ssdtCodeFeeElig;
        return this;
    }

    /**
     * ITT Entry Route
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_ENTRYRTE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEntryrte")
    public String getSsdtCodeEntryrte() {
        return ssdtCodeEntryrte;
    }

    /**
     * ITT Entry Route
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_ENTRYRTE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEntryrte")
    public void setSsdtCodeEntryrte(String ssdtCodeEntryrte) {
        this.ssdtCodeEntryrte = ssdtCodeEntryrte;
    }

    public Sobenga withSsdtCodeEntryrte(String ssdtCodeEntryrte) {
        this.ssdtCodeEntryrte = ssdtCodeEntryrte;
        return this;
    }

    /**
     * Teacher Reference Number
     * <p>
     * Lineage reference object : SOBENGA_TEACHER_REF_NUMBER
     * 
     */
    @JsonProperty("teacherRefNumber")
    public String getTeacherRefNumber() {
        return teacherRefNumber;
    }

    /**
     * Teacher Reference Number
     * <p>
     * Lineage reference object : SOBENGA_TEACHER_REF_NUMBER
     * 
     */
    @JsonProperty("teacherRefNumber")
    public void setTeacherRefNumber(String teacherRefNumber) {
        this.teacherRefNumber = teacherRefNumber;
    }

    public Sobenga withTeacherRefNumber(String teacherRefNumber) {
        this.teacherRefNumber = teacherRefNumber;
        return this;
    }

    /**
     * Own Engagement Identifier
     * <p>
     * Lineage reference object : SOBENGA_OWN_ID
     * 
     */
    @JsonProperty("ownId")
    public String getOwnId() {
        return ownId;
    }

    /**
     * Own Engagement Identifier
     * <p>
     * Lineage reference object : SOBENGA_OWN_ID
     * 
     */
    @JsonProperty("ownId")
    public void setOwnId(String ownId) {
        this.ownId = ownId;
    }

    public Sobenga withOwnId(String ownId) {
        this.ownId = ownId;
        return this;
    }

    /**
     * Lineage reference object : SOBENGA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBENGA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sobenga withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Institution Numhus
     * <p>
     * Lineage reference object : SOBENGA_INST_NUMHUS
     * 
     */
    @JsonProperty("instNumhus")
    public String getInstNumhus() {
        return instNumhus;
    }

    /**
     * Institution Numhus
     * <p>
     * Lineage reference object : SOBENGA_INST_NUMHUS
     * 
     */
    @JsonProperty("instNumhus")
    public void setInstNumhus(String instNumhus) {
        this.instNumhus = instNumhus;
    }

    public Sobenga withInstNumhus(String instNumhus) {
        this.instNumhus = instNumhus;
        return this;
    }

    /**
     * Fee Status
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_FEE_STATUS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFeeStatus")
    public String getSsdtCodeFeeStatus() {
        return ssdtCodeFeeStatus;
    }

    /**
     * Fee Status
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_FEE_STATUS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeFeeStatus")
    public void setSsdtCodeFeeStatus(String ssdtCodeFeeStatus) {
        this.ssdtCodeFeeStatus = ssdtCodeFeeStatus;
    }

    public Sobenga withSsdtCodeFeeStatus(String ssdtCodeFeeStatus) {
        this.ssdtCodeFeeStatus = ssdtCodeFeeStatus;
        return this;
    }

    @JsonProperty("ssdtCodeRcStuSt")
    public String getSsdtCodeRcStuSt() {
        return ssdtCodeRcStuSt;
    }

    @JsonProperty("ssdtCodeRcStuSt")
    public void setSsdtCodeRcStuSt(String ssdtCodeRcStuSt) {
        this.ssdtCodeRcStuSt = ssdtCodeRcStuSt;
    }

    public Sobenga withSsdtCodeRcStuSt(String ssdtCodeRcStuSt) {
        this.ssdtCodeRcStuSt = ssdtCodeRcStuSt;
        return this;
    }

    /**
     * Employing School
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_EMP_SCHOOL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEmpSchool")
    public String getSsdtCodeEmpSchool() {
        return ssdtCodeEmpSchool;
    }

    /**
     * Employing School
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_EMP_SCHOOL, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeEmpSchool")
    public void setSsdtCodeEmpSchool(String ssdtCodeEmpSchool) {
        this.ssdtCodeEmpSchool = ssdtCodeEmpSchool;
    }

    public Sobenga withSsdtCodeEmpSchool(String ssdtCodeEmpSchool) {
        this.ssdtCodeEmpSchool = ssdtCodeEmpSchool;
        return this;
    }

    /**
     * Expected End Date
     * <p>
     * Lineage reference object : SOBENGA_INTENTION_END_DATE
     * 
     */
    @JsonProperty("intentionEndDate")
    public Date getIntentionEndDate() {
        return intentionEndDate;
    }

    /**
     * Expected End Date
     * <p>
     * Lineage reference object : SOBENGA_INTENTION_END_DATE
     * 
     */
    @JsonProperty("intentionEndDate")
    public void setIntentionEndDate(Date intentionEndDate) {
        this.intentionEndDate = intentionEndDate;
    }

    public Sobenga withIntentionEndDate(Date intentionEndDate) {
        this.intentionEndDate = intentionEndDate;
        return this;
    }

    /**
     * Qualified Teacher Status
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_QTS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQts")
    public String getSsdtCodeQts() {
        return ssdtCodeQts;
    }

    /**
     * Qualified Teacher Status
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_QTS, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQts")
    public void setSsdtCodeQts(String ssdtCodeQts) {
        this.ssdtCodeQts = ssdtCodeQts;
    }

    public Sobenga withSsdtCodeQts(String ssdtCodeQts) {
        this.ssdtCodeQts = ssdtCodeQts;
        return this;
    }

    /**
     * Lineage reference object : SOBENGA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBENGA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sobenga withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("ssdtCodeEmpSchoolSt")
    public String getSsdtCodeEmpSchoolSt() {
        return ssdtCodeEmpSchoolSt;
    }

    @JsonProperty("ssdtCodeEmpSchoolSt")
    public void setSsdtCodeEmpSchoolSt(String ssdtCodeEmpSchoolSt) {
        this.ssdtCodeEmpSchoolSt = ssdtCodeEmpSchoolSt;
    }

    public Sobenga withSsdtCodeEmpSchoolSt(String ssdtCodeEmpSchoolSt) {
        this.ssdtCodeEmpSchoolSt = ssdtCodeEmpSchoolSt;
        return this;
    }

    /**
     * Study Intention
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_STDYINTNTN, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeStdyintntn")
    public String getSsdtCodeStdyintntn() {
        return ssdtCodeStdyintntn;
    }

    /**
     * Study Intention
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_STDYINTNTN, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeStdyintntn")
    public void setSsdtCodeStdyintntn(String ssdtCodeStdyintntn) {
        this.ssdtCodeStdyintntn = ssdtCodeStdyintntn;
    }

    public Sobenga withSsdtCodeStdyintntn(String ssdtCodeStdyintntn) {
        this.ssdtCodeStdyintntn = ssdtCodeStdyintntn;
        return this;
    }

    @JsonProperty("ssdtCodeQtsSt")
    public String getSsdtCodeQtsSt() {
        return ssdtCodeQtsSt;
    }

    @JsonProperty("ssdtCodeQtsSt")
    public void setSsdtCodeQtsSt(String ssdtCodeQtsSt) {
        this.ssdtCodeQtsSt = ssdtCodeQtsSt;
    }

    public Sobenga withSsdtCodeQtsSt(String ssdtCodeQtsSt) {
        this.ssdtCodeQtsSt = ssdtCodeQtsSt;
        return this;
    }

    @JsonProperty("ssdtCodeStdyintntnSt")
    public String getSsdtCodeStdyintntnSt() {
        return ssdtCodeStdyintntnSt;
    }

    @JsonProperty("ssdtCodeStdyintntnSt")
    public void setSsdtCodeStdyintntnSt(String ssdtCodeStdyintntnSt) {
        this.ssdtCodeStdyintntnSt = ssdtCodeStdyintntnSt;
    }

    public Sobenga withSsdtCodeStdyintntnSt(String ssdtCodeStdyintntnSt) {
        this.ssdtCodeStdyintntnSt = ssdtCodeStdyintntnSt;
        return this;
    }

    /**
     * Incoming Exchange
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_INC_EXCHANGE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeIncExchange")
    public String getSsdtCodeIncExchange() {
        return ssdtCodeIncExchange;
    }

    /**
     * Incoming Exchange
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_INC_EXCHANGE, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeIncExchange")
    public void setSsdtCodeIncExchange(String ssdtCodeIncExchange) {
        this.ssdtCodeIncExchange = ssdtCodeIncExchange;
    }

    public Sobenga withSsdtCodeIncExchange(String ssdtCodeIncExchange) {
        this.ssdtCodeIncExchange = ssdtCodeIncExchange;
        return this;
    }

    /**
     * NHS Employer
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_NHS_EMPLOYER, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeNhsEmployer")
    public String getSsdtCodeNhsEmployer() {
        return ssdtCodeNhsEmployer;
    }

    /**
     * NHS Employer
     * <p>
     * Lineage reference object : SOBENGA_SSDT_CODE_NHS_EMPLOYER, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeNhsEmployer")
    public void setSsdtCodeNhsEmployer(String ssdtCodeNhsEmployer) {
        this.ssdtCodeNhsEmployer = ssdtCodeNhsEmployer;
    }

    public Sobenga withSsdtCodeNhsEmployer(String ssdtCodeNhsEmployer) {
        this.ssdtCodeNhsEmployer = ssdtCodeNhsEmployer;
        return this;
    }

    @JsonProperty("ssdtCodeEntryrteSt")
    public String getSsdtCodeEntryrteSt() {
        return ssdtCodeEntryrteSt;
    }

    @JsonProperty("ssdtCodeEntryrteSt")
    public void setSsdtCodeEntryrteSt(String ssdtCodeEntryrteSt) {
        this.ssdtCodeEntryrteSt = ssdtCodeEntryrteSt;
    }

    public Sobenga withSsdtCodeEntryrteSt(String ssdtCodeEntryrteSt) {
        this.ssdtCodeEntryrteSt = ssdtCodeEntryrteSt;
        return this;
    }

    @JsonProperty("ssdtCodeLeadSchoolSt")
    public String getSsdtCodeLeadSchoolSt() {
        return ssdtCodeLeadSchoolSt;
    }

    @JsonProperty("ssdtCodeLeadSchoolSt")
    public void setSsdtCodeLeadSchoolSt(String ssdtCodeLeadSchoolSt) {
        this.ssdtCodeLeadSchoolSt = ssdtCodeLeadSchoolSt;
    }

    public Sobenga withSsdtCodeLeadSchoolSt(String ssdtCodeLeadSchoolSt) {
        this.ssdtCodeLeadSchoolSt = ssdtCodeLeadSchoolSt;
        return this;
    }

    @JsonProperty("ssdtCodeNhsEmployerSt")
    public String getSsdtCodeNhsEmployerSt() {
        return ssdtCodeNhsEmployerSt;
    }

    @JsonProperty("ssdtCodeNhsEmployerSt")
    public void setSsdtCodeNhsEmployerSt(String ssdtCodeNhsEmployerSt) {
        this.ssdtCodeNhsEmployerSt = ssdtCodeNhsEmployerSt;
    }

    public Sobenga withSsdtCodeNhsEmployerSt(String ssdtCodeNhsEmployerSt) {
        this.ssdtCodeNhsEmployerSt = ssdtCodeNhsEmployerSt;
        return this;
    }

    /**
     * Engagement Start Date
     * <p>
     * Lineage reference object : SOBENGA_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Engagement Start Date
     * <p>
     * Lineage reference object : SOBENGA_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Sobenga withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public Sobenga withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobenga.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rcStuId");
        sb.append('=');
        sb.append(((this.rcStuId == null)?"<null>":this.rcStuId));
        sb.append(',');
        sb.append("ssdtCodeFeeEligSt");
        sb.append('=');
        sb.append(((this.ssdtCodeFeeEligSt == null)?"<null>":this.ssdtCodeFeeEligSt));
        sb.append(',');
        sb.append("ssdtCodeLeadSchool");
        sb.append('=');
        sb.append(((this.ssdtCodeLeadSchool == null)?"<null>":this.ssdtCodeLeadSchool));
        sb.append(',');
        sb.append("ssdtCodeFeeStatusSt");
        sb.append('=');
        sb.append(((this.ssdtCodeFeeStatusSt == null)?"<null>":this.ssdtCodeFeeStatusSt));
        sb.append(',');
        sb.append("ssdtCodeIncExchangeSt");
        sb.append('=');
        sb.append(((this.ssdtCodeIncExchangeSt == null)?"<null>":this.ssdtCodeIncExchangeSt));
        sb.append(',');
        sb.append("ssdtCodeRcStu");
        sb.append('=');
        sb.append(((this.ssdtCodeRcStu == null)?"<null>":this.ssdtCodeRcStu));
        sb.append(',');
        sb.append("ssdtCodeFeeElig");
        sb.append('=');
        sb.append(((this.ssdtCodeFeeElig == null)?"<null>":this.ssdtCodeFeeElig));
        sb.append(',');
        sb.append("ssdtCodeEntryrte");
        sb.append('=');
        sb.append(((this.ssdtCodeEntryrte == null)?"<null>":this.ssdtCodeEntryrte));
        sb.append(',');
        sb.append("teacherRefNumber");
        sb.append('=');
        sb.append(((this.teacherRefNumber == null)?"<null>":this.teacherRefNumber));
        sb.append(',');
        sb.append("ownId");
        sb.append('=');
        sb.append(((this.ownId == null)?"<null>":this.ownId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("instNumhus");
        sb.append('=');
        sb.append(((this.instNumhus == null)?"<null>":this.instNumhus));
        sb.append(',');
        sb.append("ssdtCodeFeeStatus");
        sb.append('=');
        sb.append(((this.ssdtCodeFeeStatus == null)?"<null>":this.ssdtCodeFeeStatus));
        sb.append(',');
        sb.append("ssdtCodeRcStuSt");
        sb.append('=');
        sb.append(((this.ssdtCodeRcStuSt == null)?"<null>":this.ssdtCodeRcStuSt));
        sb.append(',');
        sb.append("ssdtCodeEmpSchool");
        sb.append('=');
        sb.append(((this.ssdtCodeEmpSchool == null)?"<null>":this.ssdtCodeEmpSchool));
        sb.append(',');
        sb.append("intentionEndDate");
        sb.append('=');
        sb.append(((this.intentionEndDate == null)?"<null>":this.intentionEndDate));
        sb.append(',');
        sb.append("ssdtCodeQts");
        sb.append('=');
        sb.append(((this.ssdtCodeQts == null)?"<null>":this.ssdtCodeQts));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ssdtCodeEmpSchoolSt");
        sb.append('=');
        sb.append(((this.ssdtCodeEmpSchoolSt == null)?"<null>":this.ssdtCodeEmpSchoolSt));
        sb.append(',');
        sb.append("ssdtCodeStdyintntn");
        sb.append('=');
        sb.append(((this.ssdtCodeStdyintntn == null)?"<null>":this.ssdtCodeStdyintntn));
        sb.append(',');
        sb.append("ssdtCodeQtsSt");
        sb.append('=');
        sb.append(((this.ssdtCodeQtsSt == null)?"<null>":this.ssdtCodeQtsSt));
        sb.append(',');
        sb.append("ssdtCodeStdyintntnSt");
        sb.append('=');
        sb.append(((this.ssdtCodeStdyintntnSt == null)?"<null>":this.ssdtCodeStdyintntnSt));
        sb.append(',');
        sb.append("ssdtCodeIncExchange");
        sb.append('=');
        sb.append(((this.ssdtCodeIncExchange == null)?"<null>":this.ssdtCodeIncExchange));
        sb.append(',');
        sb.append("ssdtCodeNhsEmployer");
        sb.append('=');
        sb.append(((this.ssdtCodeNhsEmployer == null)?"<null>":this.ssdtCodeNhsEmployer));
        sb.append(',');
        sb.append("ssdtCodeEntryrteSt");
        sb.append('=');
        sb.append(((this.ssdtCodeEntryrteSt == null)?"<null>":this.ssdtCodeEntryrteSt));
        sb.append(',');
        sb.append("ssdtCodeLeadSchoolSt");
        sb.append('=');
        sb.append(((this.ssdtCodeLeadSchoolSt == null)?"<null>":this.ssdtCodeLeadSchoolSt));
        sb.append(',');
        sb.append("ssdtCodeNhsEmployerSt");
        sb.append('=');
        sb.append(((this.ssdtCodeNhsEmployerSt == null)?"<null>":this.ssdtCodeNhsEmployerSt));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.rcStuId == null)? 0 :this.rcStuId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFeeEligSt == null)? 0 :this.ssdtCodeFeeEligSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeLeadSchool == null)? 0 :this.ssdtCodeLeadSchool.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFeeStatusSt == null)? 0 :this.ssdtCodeFeeStatusSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeIncExchangeSt == null)? 0 :this.ssdtCodeIncExchangeSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRcStu == null)? 0 :this.ssdtCodeRcStu.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFeeElig == null)? 0 :this.ssdtCodeFeeElig.hashCode()));
        result = ((result* 31)+((this.ssdtCodeEntryrte == null)? 0 :this.ssdtCodeEntryrte.hashCode()));
        result = ((result* 31)+((this.teacherRefNumber == null)? 0 :this.teacherRefNumber.hashCode()));
        result = ((result* 31)+((this.ownId == null)? 0 :this.ownId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.instNumhus == null)? 0 :this.instNumhus.hashCode()));
        result = ((result* 31)+((this.ssdtCodeFeeStatus == null)? 0 :this.ssdtCodeFeeStatus.hashCode()));
        result = ((result* 31)+((this.ssdtCodeRcStuSt == null)? 0 :this.ssdtCodeRcStuSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeEmpSchool == null)? 0 :this.ssdtCodeEmpSchool.hashCode()));
        result = ((result* 31)+((this.intentionEndDate == null)? 0 :this.intentionEndDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQts == null)? 0 :this.ssdtCodeQts.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeEmpSchoolSt == null)? 0 :this.ssdtCodeEmpSchoolSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeStdyintntn == null)? 0 :this.ssdtCodeStdyintntn.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQtsSt == null)? 0 :this.ssdtCodeQtsSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeStdyintntnSt == null)? 0 :this.ssdtCodeStdyintntnSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeIncExchange == null)? 0 :this.ssdtCodeIncExchange.hashCode()));
        result = ((result* 31)+((this.ssdtCodeNhsEmployer == null)? 0 :this.ssdtCodeNhsEmployer.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssdtCodeEntryrteSt == null)? 0 :this.ssdtCodeEntryrteSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeLeadSchoolSt == null)? 0 :this.ssdtCodeLeadSchoolSt.hashCode()));
        result = ((result* 31)+((this.ssdtCodeNhsEmployerSt == null)? 0 :this.ssdtCodeNhsEmployerSt.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sobenga) == false) {
            return false;
        }
        Sobenga rhs = ((Sobenga) other);
        return ((((((((((((((((((((((((((((((this.rcStuId == rhs.rcStuId)||((this.rcStuId!= null)&&this.rcStuId.equals(rhs.rcStuId)))&&((this.ssdtCodeFeeEligSt == rhs.ssdtCodeFeeEligSt)||((this.ssdtCodeFeeEligSt!= null)&&this.ssdtCodeFeeEligSt.equals(rhs.ssdtCodeFeeEligSt))))&&((this.ssdtCodeLeadSchool == rhs.ssdtCodeLeadSchool)||((this.ssdtCodeLeadSchool!= null)&&this.ssdtCodeLeadSchool.equals(rhs.ssdtCodeLeadSchool))))&&((this.ssdtCodeFeeStatusSt == rhs.ssdtCodeFeeStatusSt)||((this.ssdtCodeFeeStatusSt!= null)&&this.ssdtCodeFeeStatusSt.equals(rhs.ssdtCodeFeeStatusSt))))&&((this.ssdtCodeIncExchangeSt == rhs.ssdtCodeIncExchangeSt)||((this.ssdtCodeIncExchangeSt!= null)&&this.ssdtCodeIncExchangeSt.equals(rhs.ssdtCodeIncExchangeSt))))&&((this.ssdtCodeRcStu == rhs.ssdtCodeRcStu)||((this.ssdtCodeRcStu!= null)&&this.ssdtCodeRcStu.equals(rhs.ssdtCodeRcStu))))&&((this.ssdtCodeFeeElig == rhs.ssdtCodeFeeElig)||((this.ssdtCodeFeeElig!= null)&&this.ssdtCodeFeeElig.equals(rhs.ssdtCodeFeeElig))))&&((this.ssdtCodeEntryrte == rhs.ssdtCodeEntryrte)||((this.ssdtCodeEntryrte!= null)&&this.ssdtCodeEntryrte.equals(rhs.ssdtCodeEntryrte))))&&((this.teacherRefNumber == rhs.teacherRefNumber)||((this.teacherRefNumber!= null)&&this.teacherRefNumber.equals(rhs.teacherRefNumber))))&&((this.ownId == rhs.ownId)||((this.ownId!= null)&&this.ownId.equals(rhs.ownId))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.instNumhus == rhs.instNumhus)||((this.instNumhus!= null)&&this.instNumhus.equals(rhs.instNumhus))))&&((this.ssdtCodeFeeStatus == rhs.ssdtCodeFeeStatus)||((this.ssdtCodeFeeStatus!= null)&&this.ssdtCodeFeeStatus.equals(rhs.ssdtCodeFeeStatus))))&&((this.ssdtCodeRcStuSt == rhs.ssdtCodeRcStuSt)||((this.ssdtCodeRcStuSt!= null)&&this.ssdtCodeRcStuSt.equals(rhs.ssdtCodeRcStuSt))))&&((this.ssdtCodeEmpSchool == rhs.ssdtCodeEmpSchool)||((this.ssdtCodeEmpSchool!= null)&&this.ssdtCodeEmpSchool.equals(rhs.ssdtCodeEmpSchool))))&&((this.intentionEndDate == rhs.intentionEndDate)||((this.intentionEndDate!= null)&&this.intentionEndDate.equals(rhs.intentionEndDate))))&&((this.ssdtCodeQts == rhs.ssdtCodeQts)||((this.ssdtCodeQts!= null)&&this.ssdtCodeQts.equals(rhs.ssdtCodeQts))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ssdtCodeEmpSchoolSt == rhs.ssdtCodeEmpSchoolSt)||((this.ssdtCodeEmpSchoolSt!= null)&&this.ssdtCodeEmpSchoolSt.equals(rhs.ssdtCodeEmpSchoolSt))))&&((this.ssdtCodeStdyintntn == rhs.ssdtCodeStdyintntn)||((this.ssdtCodeStdyintntn!= null)&&this.ssdtCodeStdyintntn.equals(rhs.ssdtCodeStdyintntn))))&&((this.ssdtCodeQtsSt == rhs.ssdtCodeQtsSt)||((this.ssdtCodeQtsSt!= null)&&this.ssdtCodeQtsSt.equals(rhs.ssdtCodeQtsSt))))&&((this.ssdtCodeStdyintntnSt == rhs.ssdtCodeStdyintntnSt)||((this.ssdtCodeStdyintntnSt!= null)&&this.ssdtCodeStdyintntnSt.equals(rhs.ssdtCodeStdyintntnSt))))&&((this.ssdtCodeIncExchange == rhs.ssdtCodeIncExchange)||((this.ssdtCodeIncExchange!= null)&&this.ssdtCodeIncExchange.equals(rhs.ssdtCodeIncExchange))))&&((this.ssdtCodeNhsEmployer == rhs.ssdtCodeNhsEmployer)||((this.ssdtCodeNhsEmployer!= null)&&this.ssdtCodeNhsEmployer.equals(rhs.ssdtCodeNhsEmployer))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssdtCodeEntryrteSt == rhs.ssdtCodeEntryrteSt)||((this.ssdtCodeEntryrteSt!= null)&&this.ssdtCodeEntryrteSt.equals(rhs.ssdtCodeEntryrteSt))))&&((this.ssdtCodeLeadSchoolSt == rhs.ssdtCodeLeadSchoolSt)||((this.ssdtCodeLeadSchoolSt!= null)&&this.ssdtCodeLeadSchoolSt.equals(rhs.ssdtCodeLeadSchoolSt))))&&((this.ssdtCodeNhsEmployerSt == rhs.ssdtCodeNhsEmployerSt)||((this.ssdtCodeNhsEmployerSt!= null)&&this.ssdtCodeNhsEmployerSt.equals(rhs.ssdtCodeNhsEmployerSt))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
