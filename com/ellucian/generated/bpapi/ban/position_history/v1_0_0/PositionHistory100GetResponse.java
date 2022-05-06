
package com.ellucian.generated.bpapi.ban.position_history.v1_0_0;

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
    "probationUnits",
    "bargCode",
    "exemptInd",
    "ecipCode",
    "accrueSeniorityInd",
    "pclsCode",
    "title",
    "userid",
    "esocCode",
    "jobpDesc",
    "activityDate",
    "apptPct",
    "posnReports",
    "reportsToDesc",
    "table",
    "pgrpDesc",
    "jblnCode",
    "budgetTypeDesc",
    "ecipDesc",
    "bargDesc",
    "pclsDesc",
    "eclsCode",
    "jblnDesc",
    "esocDesc",
    "jobpCode",
    "eclsDesc",
    "grade",
    "pgrpCode",
    "step",
    "changeDateTime"
})
@Generated("jsonschema2pojo")
public class PositionHistory100GetResponse {

    /**
     * Probation Period
     * <p>
     * Lineage reference object : NBRPOSH_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_PROBATION_UNITS")
    private Double probationUnits;
    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBRPOSH_BARG_CODE
     * 
     */
    @JsonProperty("bargCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_BARG_CODE")
    private String bargCode;
    /**
     * Lineage reference object : NBRPOSH_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_EXEMPT_IND")
    private String exemptInd;
    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBRPOSH_ECIP_CODE
     * 
     */
    @JsonProperty("ecipCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_ECIP_CODE")
    private String ecipCode;
    /**
     * Lineage reference object : NBRPOSH_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("accrueSeniorityInd")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_ACCRUE_SENIORITY_IND")
    private String accrueSeniorityInd;
    /**
     * Position Class
     * <p>
     * Lineage reference object : NBRPOSH_PCLS_CODE
     * 
     */
    @JsonProperty("pclsCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_PCLS_CODE")
    private String pclsCode;
    /**
     * Position Title
     * <p>
     * Lineage reference object : NBRPOSH_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_TITLE")
    private String title;
    /**
     * User
     * <p>
     * Lineage reference object : NBRPOSH_USERID
     * 
     */
    @JsonProperty("userid")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_USERID")
    private String userid;
    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBRPOSH_ESOC_CODE
     * 
     */
    @JsonProperty("esocCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_ESOC_CODE")
    private String esocCode;
    @JsonProperty("jobpDesc")
    private String jobpDesc;
    /**
     * Lineage reference object : NBRPOSH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Appointment Percentage
     * <p>
     * Lineage reference object : NBRPOSH_APPT_PCT
     * 
     */
    @JsonProperty("apptPct")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_APPT_PCT")
    private Double apptPct;
    /**
     * Reports to
     * <p>
     * Lineage reference object : NBRPOSH_POSN_REPORTS
     * 
     */
    @JsonProperty("posnReports")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_POSN_REPORTS")
    private String posnReports;
    @JsonProperty("reportsToDesc")
    private String reportsToDesc;
    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBRPOSH_TABLE
     * 
     */
    @JsonProperty("table")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_TABLE")
    private String table;
    @JsonProperty("pgrpDesc")
    private String pgrpDesc;
    /**
     * Job Location
     * <p>
     * Lineage reference object : NBRPOSH_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_JBLN_CODE")
    private String jblnCode;
    /**
     * Budget Type
     * <p>
     * 
     * 
     */
    @JsonProperty("budgetTypeDesc")
    private String budgetTypeDesc;
    @JsonProperty("ecipDesc")
    private String ecipDesc;
    @JsonProperty("bargDesc")
    private String bargDesc;
    @JsonProperty("pclsDesc")
    private String pclsDesc;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBRPOSH_ECLS_CODE
     * 
     */
    @JsonProperty("eclsCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_ECLS_CODE")
    private String eclsCode;
    @JsonProperty("jblnDesc")
    private String jblnDesc;
    @JsonProperty("esocDesc")
    private String esocDesc;
    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBRPOSH_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_JOBP_CODE")
    private String jobpCode;
    @JsonProperty("eclsDesc")
    private String eclsDesc;
    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBRPOSH_GRADE
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_GRADE")
    private String grade;
    /**
     * Position Group
     * <p>
     * Lineage reference object : NBRPOSH_PGRP_CODE
     * 
     */
    @JsonProperty("pgrpCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_PGRP_CODE")
    private String pgrpCode;
    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBRPOSH_STEP
     * 
     */
    @JsonProperty("step")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_STEP")
    private Double step;
    /**
     * Change Date
     * <p>
     * Lineage reference object : NBRPOSH_CHANGE_DATE_TIME
     * 
     */
    @JsonProperty("changeDateTime")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_CHANGE_DATE_TIME")
    private Date changeDateTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Probation Period
     * <p>
     * Lineage reference object : NBRPOSH_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    public Double getProbationUnits() {
        return probationUnits;
    }

    /**
     * Probation Period
     * <p>
     * Lineage reference object : NBRPOSH_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    public void setProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
    }

    public PositionHistory100GetResponse withProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
        return this;
    }

    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBRPOSH_BARG_CODE
     * 
     */
    @JsonProperty("bargCode")
    public String getBargCode() {
        return bargCode;
    }

    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBRPOSH_BARG_CODE
     * 
     */
    @JsonProperty("bargCode")
    public void setBargCode(String bargCode) {
        this.bargCode = bargCode;
    }

    public PositionHistory100GetResponse withBargCode(String bargCode) {
        this.bargCode = bargCode;
        return this;
    }

    /**
     * Lineage reference object : NBRPOSH_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    public String getExemptInd() {
        return exemptInd;
    }

    /**
     * Lineage reference object : NBRPOSH_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    public void setExemptInd(String exemptInd) {
        this.exemptInd = exemptInd;
    }

    public PositionHistory100GetResponse withExemptInd(String exemptInd) {
        this.exemptInd = exemptInd;
        return this;
    }

    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBRPOSH_ECIP_CODE
     * 
     */
    @JsonProperty("ecipCode")
    public String getEcipCode() {
        return ecipCode;
    }

    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBRPOSH_ECIP_CODE
     * 
     */
    @JsonProperty("ecipCode")
    public void setEcipCode(String ecipCode) {
        this.ecipCode = ecipCode;
    }

    public PositionHistory100GetResponse withEcipCode(String ecipCode) {
        this.ecipCode = ecipCode;
        return this;
    }

    /**
     * Lineage reference object : NBRPOSH_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("accrueSeniorityInd")
    public String getAccrueSeniorityInd() {
        return accrueSeniorityInd;
    }

    /**
     * Lineage reference object : NBRPOSH_ACCRUE_SENIORITY_IND
     * 
     */
    @JsonProperty("accrueSeniorityInd")
    public void setAccrueSeniorityInd(String accrueSeniorityInd) {
        this.accrueSeniorityInd = accrueSeniorityInd;
    }

    public PositionHistory100GetResponse withAccrueSeniorityInd(String accrueSeniorityInd) {
        this.accrueSeniorityInd = accrueSeniorityInd;
        return this;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : NBRPOSH_PCLS_CODE
     * 
     */
    @JsonProperty("pclsCode")
    public String getPclsCode() {
        return pclsCode;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : NBRPOSH_PCLS_CODE
     * 
     */
    @JsonProperty("pclsCode")
    public void setPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
    }

    public PositionHistory100GetResponse withPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
        return this;
    }

    /**
     * Position Title
     * <p>
     * Lineage reference object : NBRPOSH_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Position Title
     * <p>
     * Lineage reference object : NBRPOSH_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PositionHistory100GetResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : NBRPOSH_USERID
     * 
     */
    @JsonProperty("userid")
    public String getUserid() {
        return userid;
    }

    /**
     * User
     * <p>
     * Lineage reference object : NBRPOSH_USERID
     * 
     */
    @JsonProperty("userid")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public PositionHistory100GetResponse withUserid(String userid) {
        this.userid = userid;
        return this;
    }

    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBRPOSH_ESOC_CODE
     * 
     */
    @JsonProperty("esocCode")
    public String getEsocCode() {
        return esocCode;
    }

    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBRPOSH_ESOC_CODE
     * 
     */
    @JsonProperty("esocCode")
    public void setEsocCode(String esocCode) {
        this.esocCode = esocCode;
    }

    public PositionHistory100GetResponse withEsocCode(String esocCode) {
        this.esocCode = esocCode;
        return this;
    }

    @JsonProperty("jobpDesc")
    public String getJobpDesc() {
        return jobpDesc;
    }

    @JsonProperty("jobpDesc")
    public void setJobpDesc(String jobpDesc) {
        this.jobpDesc = jobpDesc;
    }

    public PositionHistory100GetResponse withJobpDesc(String jobpDesc) {
        this.jobpDesc = jobpDesc;
        return this;
    }

    /**
     * Lineage reference object : NBRPOSH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NBRPOSH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public PositionHistory100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Appointment Percentage
     * <p>
     * Lineage reference object : NBRPOSH_APPT_PCT
     * 
     */
    @JsonProperty("apptPct")
    public Double getApptPct() {
        return apptPct;
    }

    /**
     * Appointment Percentage
     * <p>
     * Lineage reference object : NBRPOSH_APPT_PCT
     * 
     */
    @JsonProperty("apptPct")
    public void setApptPct(Double apptPct) {
        this.apptPct = apptPct;
    }

    public PositionHistory100GetResponse withApptPct(Double apptPct) {
        this.apptPct = apptPct;
        return this;
    }

    /**
     * Reports to
     * <p>
     * Lineage reference object : NBRPOSH_POSN_REPORTS
     * 
     */
    @JsonProperty("posnReports")
    public String getPosnReports() {
        return posnReports;
    }

    /**
     * Reports to
     * <p>
     * Lineage reference object : NBRPOSH_POSN_REPORTS
     * 
     */
    @JsonProperty("posnReports")
    public void setPosnReports(String posnReports) {
        this.posnReports = posnReports;
    }

    public PositionHistory100GetResponse withPosnReports(String posnReports) {
        this.posnReports = posnReports;
        return this;
    }

    @JsonProperty("reportsToDesc")
    public String getReportsToDesc() {
        return reportsToDesc;
    }

    @JsonProperty("reportsToDesc")
    public void setReportsToDesc(String reportsToDesc) {
        this.reportsToDesc = reportsToDesc;
    }

    public PositionHistory100GetResponse withReportsToDesc(String reportsToDesc) {
        this.reportsToDesc = reportsToDesc;
        return this;
    }

    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBRPOSH_TABLE
     * 
     */
    @JsonProperty("table")
    public String getTable() {
        return table;
    }

    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBRPOSH_TABLE
     * 
     */
    @JsonProperty("table")
    public void setTable(String table) {
        this.table = table;
    }

    public PositionHistory100GetResponse withTable(String table) {
        this.table = table;
        return this;
    }

    @JsonProperty("pgrpDesc")
    public String getPgrpDesc() {
        return pgrpDesc;
    }

    @JsonProperty("pgrpDesc")
    public void setPgrpDesc(String pgrpDesc) {
        this.pgrpDesc = pgrpDesc;
    }

    public PositionHistory100GetResponse withPgrpDesc(String pgrpDesc) {
        this.pgrpDesc = pgrpDesc;
        return this;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBRPOSH_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public String getJblnCode() {
        return jblnCode;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBRPOSH_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public void setJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
    }

    public PositionHistory100GetResponse withJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
        return this;
    }

    /**
     * Budget Type
     * <p>
     * 
     * 
     */
    @JsonProperty("budgetTypeDesc")
    public String getBudgetTypeDesc() {
        return budgetTypeDesc;
    }

    /**
     * Budget Type
     * <p>
     * 
     * 
     */
    @JsonProperty("budgetTypeDesc")
    public void setBudgetTypeDesc(String budgetTypeDesc) {
        this.budgetTypeDesc = budgetTypeDesc;
    }

    public PositionHistory100GetResponse withBudgetTypeDesc(String budgetTypeDesc) {
        this.budgetTypeDesc = budgetTypeDesc;
        return this;
    }

    @JsonProperty("ecipDesc")
    public String getEcipDesc() {
        return ecipDesc;
    }

    @JsonProperty("ecipDesc")
    public void setEcipDesc(String ecipDesc) {
        this.ecipDesc = ecipDesc;
    }

    public PositionHistory100GetResponse withEcipDesc(String ecipDesc) {
        this.ecipDesc = ecipDesc;
        return this;
    }

    @JsonProperty("bargDesc")
    public String getBargDesc() {
        return bargDesc;
    }

    @JsonProperty("bargDesc")
    public void setBargDesc(String bargDesc) {
        this.bargDesc = bargDesc;
    }

    public PositionHistory100GetResponse withBargDesc(String bargDesc) {
        this.bargDesc = bargDesc;
        return this;
    }

    @JsonProperty("pclsDesc")
    public String getPclsDesc() {
        return pclsDesc;
    }

    @JsonProperty("pclsDesc")
    public void setPclsDesc(String pclsDesc) {
        this.pclsDesc = pclsDesc;
    }

    public PositionHistory100GetResponse withPclsDesc(String pclsDesc) {
        this.pclsDesc = pclsDesc;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBRPOSH_ECLS_CODE
     * 
     */
    @JsonProperty("eclsCode")
    public String getEclsCode() {
        return eclsCode;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBRPOSH_ECLS_CODE
     * 
     */
    @JsonProperty("eclsCode")
    public void setEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
    }

    public PositionHistory100GetResponse withEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
        return this;
    }

    @JsonProperty("jblnDesc")
    public String getJblnDesc() {
        return jblnDesc;
    }

    @JsonProperty("jblnDesc")
    public void setJblnDesc(String jblnDesc) {
        this.jblnDesc = jblnDesc;
    }

    public PositionHistory100GetResponse withJblnDesc(String jblnDesc) {
        this.jblnDesc = jblnDesc;
        return this;
    }

    @JsonProperty("esocDesc")
    public String getEsocDesc() {
        return esocDesc;
    }

    @JsonProperty("esocDesc")
    public void setEsocDesc(String esocDesc) {
        this.esocDesc = esocDesc;
    }

    public PositionHistory100GetResponse withEsocDesc(String esocDesc) {
        this.esocDesc = esocDesc;
        return this;
    }

    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBRPOSH_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    public String getJobpCode() {
        return jobpCode;
    }

    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBRPOSH_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    public void setJobpCode(String jobpCode) {
        this.jobpCode = jobpCode;
    }

    public PositionHistory100GetResponse withJobpCode(String jobpCode) {
        this.jobpCode = jobpCode;
        return this;
    }

    @JsonProperty("eclsDesc")
    public String getEclsDesc() {
        return eclsDesc;
    }

    @JsonProperty("eclsDesc")
    public void setEclsDesc(String eclsDesc) {
        this.eclsDesc = eclsDesc;
    }

    public PositionHistory100GetResponse withEclsDesc(String eclsDesc) {
        this.eclsDesc = eclsDesc;
        return this;
    }

    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBRPOSH_GRADE
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBRPOSH_GRADE
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public PositionHistory100GetResponse withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Position Group
     * <p>
     * Lineage reference object : NBRPOSH_PGRP_CODE
     * 
     */
    @JsonProperty("pgrpCode")
    public String getPgrpCode() {
        return pgrpCode;
    }

    /**
     * Position Group
     * <p>
     * Lineage reference object : NBRPOSH_PGRP_CODE
     * 
     */
    @JsonProperty("pgrpCode")
    public void setPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
    }

    public PositionHistory100GetResponse withPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
        return this;
    }

    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBRPOSH_STEP
     * 
     */
    @JsonProperty("step")
    public Double getStep() {
        return step;
    }

    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBRPOSH_STEP
     * 
     */
    @JsonProperty("step")
    public void setStep(Double step) {
        this.step = step;
    }

    public PositionHistory100GetResponse withStep(Double step) {
        this.step = step;
        return this;
    }

    /**
     * Change Date
     * <p>
     * Lineage reference object : NBRPOSH_CHANGE_DATE_TIME
     * 
     */
    @JsonProperty("changeDateTime")
    public Date getChangeDateTime() {
        return changeDateTime;
    }

    /**
     * Change Date
     * <p>
     * Lineage reference object : NBRPOSH_CHANGE_DATE_TIME
     * 
     */
    @JsonProperty("changeDateTime")
    public void setChangeDateTime(Date changeDateTime) {
        this.changeDateTime = changeDateTime;
    }

    public PositionHistory100GetResponse withChangeDateTime(Date changeDateTime) {
        this.changeDateTime = changeDateTime;
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

    public PositionHistory100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionHistory100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("probationUnits");
        sb.append('=');
        sb.append(((this.probationUnits == null)?"<null>":this.probationUnits));
        sb.append(',');
        sb.append("bargCode");
        sb.append('=');
        sb.append(((this.bargCode == null)?"<null>":this.bargCode));
        sb.append(',');
        sb.append("exemptInd");
        sb.append('=');
        sb.append(((this.exemptInd == null)?"<null>":this.exemptInd));
        sb.append(',');
        sb.append("ecipCode");
        sb.append('=');
        sb.append(((this.ecipCode == null)?"<null>":this.ecipCode));
        sb.append(',');
        sb.append("accrueSeniorityInd");
        sb.append('=');
        sb.append(((this.accrueSeniorityInd == null)?"<null>":this.accrueSeniorityInd));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("userid");
        sb.append('=');
        sb.append(((this.userid == null)?"<null>":this.userid));
        sb.append(',');
        sb.append("esocCode");
        sb.append('=');
        sb.append(((this.esocCode == null)?"<null>":this.esocCode));
        sb.append(',');
        sb.append("jobpDesc");
        sb.append('=');
        sb.append(((this.jobpDesc == null)?"<null>":this.jobpDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("apptPct");
        sb.append('=');
        sb.append(((this.apptPct == null)?"<null>":this.apptPct));
        sb.append(',');
        sb.append("posnReports");
        sb.append('=');
        sb.append(((this.posnReports == null)?"<null>":this.posnReports));
        sb.append(',');
        sb.append("reportsToDesc");
        sb.append('=');
        sb.append(((this.reportsToDesc == null)?"<null>":this.reportsToDesc));
        sb.append(',');
        sb.append("table");
        sb.append('=');
        sb.append(((this.table == null)?"<null>":this.table));
        sb.append(',');
        sb.append("pgrpDesc");
        sb.append('=');
        sb.append(((this.pgrpDesc == null)?"<null>":this.pgrpDesc));
        sb.append(',');
        sb.append("jblnCode");
        sb.append('=');
        sb.append(((this.jblnCode == null)?"<null>":this.jblnCode));
        sb.append(',');
        sb.append("budgetTypeDesc");
        sb.append('=');
        sb.append(((this.budgetTypeDesc == null)?"<null>":this.budgetTypeDesc));
        sb.append(',');
        sb.append("ecipDesc");
        sb.append('=');
        sb.append(((this.ecipDesc == null)?"<null>":this.ecipDesc));
        sb.append(',');
        sb.append("bargDesc");
        sb.append('=');
        sb.append(((this.bargDesc == null)?"<null>":this.bargDesc));
        sb.append(',');
        sb.append("pclsDesc");
        sb.append('=');
        sb.append(((this.pclsDesc == null)?"<null>":this.pclsDesc));
        sb.append(',');
        sb.append("eclsCode");
        sb.append('=');
        sb.append(((this.eclsCode == null)?"<null>":this.eclsCode));
        sb.append(',');
        sb.append("jblnDesc");
        sb.append('=');
        sb.append(((this.jblnDesc == null)?"<null>":this.jblnDesc));
        sb.append(',');
        sb.append("esocDesc");
        sb.append('=');
        sb.append(((this.esocDesc == null)?"<null>":this.esocDesc));
        sb.append(',');
        sb.append("jobpCode");
        sb.append('=');
        sb.append(((this.jobpCode == null)?"<null>":this.jobpCode));
        sb.append(',');
        sb.append("eclsDesc");
        sb.append('=');
        sb.append(((this.eclsDesc == null)?"<null>":this.eclsDesc));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("pgrpCode");
        sb.append('=');
        sb.append(((this.pgrpCode == null)?"<null>":this.pgrpCode));
        sb.append(',');
        sb.append("step");
        sb.append('=');
        sb.append(((this.step == null)?"<null>":this.step));
        sb.append(',');
        sb.append("changeDateTime");
        sb.append('=');
        sb.append(((this.changeDateTime == null)?"<null>":this.changeDateTime));
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
        result = ((result* 31)+((this.probationUnits == null)? 0 :this.probationUnits.hashCode()));
        result = ((result* 31)+((this.bargCode == null)? 0 :this.bargCode.hashCode()));
        result = ((result* 31)+((this.exemptInd == null)? 0 :this.exemptInd.hashCode()));
        result = ((result* 31)+((this.ecipCode == null)? 0 :this.ecipCode.hashCode()));
        result = ((result* 31)+((this.accrueSeniorityInd == null)? 0 :this.accrueSeniorityInd.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.userid == null)? 0 :this.userid.hashCode()));
        result = ((result* 31)+((this.esocCode == null)? 0 :this.esocCode.hashCode()));
        result = ((result* 31)+((this.jobpDesc == null)? 0 :this.jobpDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.apptPct == null)? 0 :this.apptPct.hashCode()));
        result = ((result* 31)+((this.posnReports == null)? 0 :this.posnReports.hashCode()));
        result = ((result* 31)+((this.reportsToDesc == null)? 0 :this.reportsToDesc.hashCode()));
        result = ((result* 31)+((this.table == null)? 0 :this.table.hashCode()));
        result = ((result* 31)+((this.pgrpDesc == null)? 0 :this.pgrpDesc.hashCode()));
        result = ((result* 31)+((this.jblnCode == null)? 0 :this.jblnCode.hashCode()));
        result = ((result* 31)+((this.budgetTypeDesc == null)? 0 :this.budgetTypeDesc.hashCode()));
        result = ((result* 31)+((this.ecipDesc == null)? 0 :this.ecipDesc.hashCode()));
        result = ((result* 31)+((this.bargDesc == null)? 0 :this.bargDesc.hashCode()));
        result = ((result* 31)+((this.pclsDesc == null)? 0 :this.pclsDesc.hashCode()));
        result = ((result* 31)+((this.eclsCode == null)? 0 :this.eclsCode.hashCode()));
        result = ((result* 31)+((this.jblnDesc == null)? 0 :this.jblnDesc.hashCode()));
        result = ((result* 31)+((this.esocDesc == null)? 0 :this.esocDesc.hashCode()));
        result = ((result* 31)+((this.jobpCode == null)? 0 :this.jobpCode.hashCode()));
        result = ((result* 31)+((this.eclsDesc == null)? 0 :this.eclsDesc.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.pgrpCode == null)? 0 :this.pgrpCode.hashCode()));
        result = ((result* 31)+((this.step == null)? 0 :this.step.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.changeDateTime == null)? 0 :this.changeDateTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionHistory100GetResponse) == false) {
            return false;
        }
        PositionHistory100GetResponse rhs = ((PositionHistory100GetResponse) other);
        return ((((((((((((((((((((((((((((((((this.probationUnits == rhs.probationUnits)||((this.probationUnits!= null)&&this.probationUnits.equals(rhs.probationUnits)))&&((this.bargCode == rhs.bargCode)||((this.bargCode!= null)&&this.bargCode.equals(rhs.bargCode))))&&((this.exemptInd == rhs.exemptInd)||((this.exemptInd!= null)&&this.exemptInd.equals(rhs.exemptInd))))&&((this.ecipCode == rhs.ecipCode)||((this.ecipCode!= null)&&this.ecipCode.equals(rhs.ecipCode))))&&((this.accrueSeniorityInd == rhs.accrueSeniorityInd)||((this.accrueSeniorityInd!= null)&&this.accrueSeniorityInd.equals(rhs.accrueSeniorityInd))))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.userid == rhs.userid)||((this.userid!= null)&&this.userid.equals(rhs.userid))))&&((this.esocCode == rhs.esocCode)||((this.esocCode!= null)&&this.esocCode.equals(rhs.esocCode))))&&((this.jobpDesc == rhs.jobpDesc)||((this.jobpDesc!= null)&&this.jobpDesc.equals(rhs.jobpDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.apptPct == rhs.apptPct)||((this.apptPct!= null)&&this.apptPct.equals(rhs.apptPct))))&&((this.posnReports == rhs.posnReports)||((this.posnReports!= null)&&this.posnReports.equals(rhs.posnReports))))&&((this.reportsToDesc == rhs.reportsToDesc)||((this.reportsToDesc!= null)&&this.reportsToDesc.equals(rhs.reportsToDesc))))&&((this.table == rhs.table)||((this.table!= null)&&this.table.equals(rhs.table))))&&((this.pgrpDesc == rhs.pgrpDesc)||((this.pgrpDesc!= null)&&this.pgrpDesc.equals(rhs.pgrpDesc))))&&((this.jblnCode == rhs.jblnCode)||((this.jblnCode!= null)&&this.jblnCode.equals(rhs.jblnCode))))&&((this.budgetTypeDesc == rhs.budgetTypeDesc)||((this.budgetTypeDesc!= null)&&this.budgetTypeDesc.equals(rhs.budgetTypeDesc))))&&((this.ecipDesc == rhs.ecipDesc)||((this.ecipDesc!= null)&&this.ecipDesc.equals(rhs.ecipDesc))))&&((this.bargDesc == rhs.bargDesc)||((this.bargDesc!= null)&&this.bargDesc.equals(rhs.bargDesc))))&&((this.pclsDesc == rhs.pclsDesc)||((this.pclsDesc!= null)&&this.pclsDesc.equals(rhs.pclsDesc))))&&((this.eclsCode == rhs.eclsCode)||((this.eclsCode!= null)&&this.eclsCode.equals(rhs.eclsCode))))&&((this.jblnDesc == rhs.jblnDesc)||((this.jblnDesc!= null)&&this.jblnDesc.equals(rhs.jblnDesc))))&&((this.esocDesc == rhs.esocDesc)||((this.esocDesc!= null)&&this.esocDesc.equals(rhs.esocDesc))))&&((this.jobpCode == rhs.jobpCode)||((this.jobpCode!= null)&&this.jobpCode.equals(rhs.jobpCode))))&&((this.eclsDesc == rhs.eclsDesc)||((this.eclsDesc!= null)&&this.eclsDesc.equals(rhs.eclsDesc))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.pgrpCode == rhs.pgrpCode)||((this.pgrpCode!= null)&&this.pgrpCode.equals(rhs.pgrpCode))))&&((this.step == rhs.step)||((this.step!= null)&&this.step.equals(rhs.step))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.changeDateTime == rhs.changeDateTime)||((this.changeDateTime!= null)&&this.changeDateTime.equals(rhs.changeDateTime))));
    }

}
