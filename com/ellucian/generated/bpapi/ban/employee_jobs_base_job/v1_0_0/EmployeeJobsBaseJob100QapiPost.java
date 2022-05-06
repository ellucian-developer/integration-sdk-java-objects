
package com.ellucian.generated.bpapi.ban.employee_jobs_base_job.v1_0_0;

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
    "id",
    "posn",
    "suff",
    "queryDate",
    "beginDate",
    "contractType",
    "ipedsReptInd",
    "coasCode",
    "accrueLeaveInd",
    "civilServiceInd",
    "stepIncrMon",
    "stepIncrDay",
    "eligibleDate",
    "totalEncumbranceHrs",
    "salaryEncumbrance",
    "futureSalaryEnc",
    "probationUnits",
    "probationBeginDate",
    "probationEndDate",
    "contractBeginDate",
    "contractEndDate",
    "totalContractHrs",
    "futureFringeEnc"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsBaseJob100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("posn")
    private String posn;
    @JsonProperty("suff")
    private String suff;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    private String queryDate;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_BEGIN_DATE")
    private Date beginDate;
    /**
     * Job Type
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_TYPE
     * 
     */
    @JsonProperty("contractType")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_CONTRACT_TYPE")
    private String contractType;
    /**
     * IPEDS Reporting  Indicator
     * <p>
     * Lineage reference object : NBRBJOB_IPEDS_REPT_IND
     * 
     */
    @JsonProperty("ipedsReptInd")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_IPEDS_REPT_IND")
    private String ipedsReptInd;
    /**
     * COA
     * <p>
     * Lineage reference object : NBRBJOB_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_COAS_CODE")
    private String coasCode;
    /**
     * Accrue Leave
     * <p>
     * Lineage reference object : NBRBJOB_ACCRUE_LEAVE_IND
     * 
     */
    @JsonProperty("accrueLeaveInd")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_ACCRUE_LEAVE_IND")
    private String accrueLeaveInd;
    /**
     * Civil Service
     * <p>
     * Lineage reference object : NBRBJOB_CIVIL_SERVICE_IND
     * 
     */
    @JsonProperty("civilServiceInd")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_CIVIL_SERVICE_IND")
    private String civilServiceInd;
    /**
     * Increase MM and DD
     * <p>
     * Lineage reference object : NBRBJOB_STEP_INCR_MON
     * 
     */
    @JsonProperty("stepIncrMon")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_STEP_INCR_MON")
    private String stepIncrMon;
    /**
     * Lineage reference object : NBRBJOB_STEP_INCR_DAY
     * 
     */
    @JsonProperty("stepIncrDay")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_STEP_INCR_DAY")
    private String stepIncrDay;
    /**
     * Eligible Date
     * <p>
     * Lineage reference object : NBRBJOB_ELIGIBLE_DATE
     * 
     */
    @JsonProperty("eligibleDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_ELIGIBLE_DATE")
    private Date eligibleDate;
    /**
     * Total Encumbrance Hours
     * <p>
     * Lineage reference object : NBRBJOB_TOTAL_ENCUMBRANCE_HRS
     * 
     */
    @JsonProperty("totalEncumbranceHrs")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_TOTAL_ENCUMBRANCE_HRS")
    private Double totalEncumbranceHrs;
    /**
     * Current Fiscal Year
     * <p>
     * Lineage reference object : NBRBJOB_SALARY_ENCUMBRANCE
     * 
     */
    @JsonProperty("salaryEncumbrance")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_SALARY_ENCUMBRANCE")
    private Double salaryEncumbrance;
    /**
     * Future Years
     * <p>
     * Lineage reference object : NBRBJOB_FUTURE_SALARY_ENC
     * 
     */
    @JsonProperty("futureSalaryEnc")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_FUTURE_SALARY_ENC")
    private Double futureSalaryEnc;
    /**
     * Probationary Period
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_PROBATION_UNITS")
    private Double probationUnits;
    /**
     * Probationary Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_BEGIN_DATE
     * 
     */
    @JsonProperty("probationBeginDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_PROBATION_BEGIN_DATE")
    private Date probationBeginDate;
    /**
     * Probationary End Date
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_END_DATE
     * 
     */
    @JsonProperty("probationEndDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_PROBATION_END_DATE")
    private Date probationEndDate;
    /**
     * Start Date
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_BEGIN_DATE
     * 
     */
    @JsonProperty("contractBeginDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_CONTRACT_BEGIN_DATE")
    private Date contractBeginDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_END_DATE
     * 
     */
    @JsonProperty("contractEndDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_CONTRACT_END_DATE")
    private Date contractEndDate;
    /**
     * Total Contract Hours
     * <p>
     * Lineage reference object : NBRBJOB_TOTAL_CONTRACT_HRS
     * 
     */
    @JsonProperty("totalContractHrs")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_TOTAL_CONTRACT_HRS")
    private Double totalContractHrs;
    /**
     * Future Years
     * <p>
     * Lineage reference object : NBRBJOB_FUTURE_FRINGE_ENC
     * 
     */
    @JsonProperty("futureFringeEnc")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_FUTURE_FRINGE_ENC")
    private Double futureFringeEnc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeJobsBaseJob100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public EmployeeJobsBaseJob100QapiPost withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public EmployeeJobsBaseJob100QapiPost withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public String getQueryDate() {
        return queryDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeJobsBaseJob100QapiPost withQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public EmployeeJobsBaseJob100QapiPost withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Job Type
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_TYPE
     * 
     */
    @JsonProperty("contractType")
    public String getContractType() {
        return contractType;
    }

    /**
     * Job Type
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_TYPE
     * 
     */
    @JsonProperty("contractType")
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public EmployeeJobsBaseJob100QapiPost withContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * IPEDS Reporting  Indicator
     * <p>
     * Lineage reference object : NBRBJOB_IPEDS_REPT_IND
     * 
     */
    @JsonProperty("ipedsReptInd")
    public String getIpedsReptInd() {
        return ipedsReptInd;
    }

    /**
     * IPEDS Reporting  Indicator
     * <p>
     * Lineage reference object : NBRBJOB_IPEDS_REPT_IND
     * 
     */
    @JsonProperty("ipedsReptInd")
    public void setIpedsReptInd(String ipedsReptInd) {
        this.ipedsReptInd = ipedsReptInd;
    }

    public EmployeeJobsBaseJob100QapiPost withIpedsReptInd(String ipedsReptInd) {
        this.ipedsReptInd = ipedsReptInd;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBRBJOB_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : NBRBJOB_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public EmployeeJobsBaseJob100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Accrue Leave
     * <p>
     * Lineage reference object : NBRBJOB_ACCRUE_LEAVE_IND
     * 
     */
    @JsonProperty("accrueLeaveInd")
    public String getAccrueLeaveInd() {
        return accrueLeaveInd;
    }

    /**
     * Accrue Leave
     * <p>
     * Lineage reference object : NBRBJOB_ACCRUE_LEAVE_IND
     * 
     */
    @JsonProperty("accrueLeaveInd")
    public void setAccrueLeaveInd(String accrueLeaveInd) {
        this.accrueLeaveInd = accrueLeaveInd;
    }

    public EmployeeJobsBaseJob100QapiPost withAccrueLeaveInd(String accrueLeaveInd) {
        this.accrueLeaveInd = accrueLeaveInd;
        return this;
    }

    /**
     * Civil Service
     * <p>
     * Lineage reference object : NBRBJOB_CIVIL_SERVICE_IND
     * 
     */
    @JsonProperty("civilServiceInd")
    public String getCivilServiceInd() {
        return civilServiceInd;
    }

    /**
     * Civil Service
     * <p>
     * Lineage reference object : NBRBJOB_CIVIL_SERVICE_IND
     * 
     */
    @JsonProperty("civilServiceInd")
    public void setCivilServiceInd(String civilServiceInd) {
        this.civilServiceInd = civilServiceInd;
    }

    public EmployeeJobsBaseJob100QapiPost withCivilServiceInd(String civilServiceInd) {
        this.civilServiceInd = civilServiceInd;
        return this;
    }

    /**
     * Increase MM and DD
     * <p>
     * Lineage reference object : NBRBJOB_STEP_INCR_MON
     * 
     */
    @JsonProperty("stepIncrMon")
    public String getStepIncrMon() {
        return stepIncrMon;
    }

    /**
     * Increase MM and DD
     * <p>
     * Lineage reference object : NBRBJOB_STEP_INCR_MON
     * 
     */
    @JsonProperty("stepIncrMon")
    public void setStepIncrMon(String stepIncrMon) {
        this.stepIncrMon = stepIncrMon;
    }

    public EmployeeJobsBaseJob100QapiPost withStepIncrMon(String stepIncrMon) {
        this.stepIncrMon = stepIncrMon;
        return this;
    }

    /**
     * Lineage reference object : NBRBJOB_STEP_INCR_DAY
     * 
     */
    @JsonProperty("stepIncrDay")
    public String getStepIncrDay() {
        return stepIncrDay;
    }

    /**
     * Lineage reference object : NBRBJOB_STEP_INCR_DAY
     * 
     */
    @JsonProperty("stepIncrDay")
    public void setStepIncrDay(String stepIncrDay) {
        this.stepIncrDay = stepIncrDay;
    }

    public EmployeeJobsBaseJob100QapiPost withStepIncrDay(String stepIncrDay) {
        this.stepIncrDay = stepIncrDay;
        return this;
    }

    /**
     * Eligible Date
     * <p>
     * Lineage reference object : NBRBJOB_ELIGIBLE_DATE
     * 
     */
    @JsonProperty("eligibleDate")
    public Date getEligibleDate() {
        return eligibleDate;
    }

    /**
     * Eligible Date
     * <p>
     * Lineage reference object : NBRBJOB_ELIGIBLE_DATE
     * 
     */
    @JsonProperty("eligibleDate")
    public void setEligibleDate(Date eligibleDate) {
        this.eligibleDate = eligibleDate;
    }

    public EmployeeJobsBaseJob100QapiPost withEligibleDate(Date eligibleDate) {
        this.eligibleDate = eligibleDate;
        return this;
    }

    /**
     * Total Encumbrance Hours
     * <p>
     * Lineage reference object : NBRBJOB_TOTAL_ENCUMBRANCE_HRS
     * 
     */
    @JsonProperty("totalEncumbranceHrs")
    public Double getTotalEncumbranceHrs() {
        return totalEncumbranceHrs;
    }

    /**
     * Total Encumbrance Hours
     * <p>
     * Lineage reference object : NBRBJOB_TOTAL_ENCUMBRANCE_HRS
     * 
     */
    @JsonProperty("totalEncumbranceHrs")
    public void setTotalEncumbranceHrs(Double totalEncumbranceHrs) {
        this.totalEncumbranceHrs = totalEncumbranceHrs;
    }

    public EmployeeJobsBaseJob100QapiPost withTotalEncumbranceHrs(Double totalEncumbranceHrs) {
        this.totalEncumbranceHrs = totalEncumbranceHrs;
        return this;
    }

    /**
     * Current Fiscal Year
     * <p>
     * Lineage reference object : NBRBJOB_SALARY_ENCUMBRANCE
     * 
     */
    @JsonProperty("salaryEncumbrance")
    public Double getSalaryEncumbrance() {
        return salaryEncumbrance;
    }

    /**
     * Current Fiscal Year
     * <p>
     * Lineage reference object : NBRBJOB_SALARY_ENCUMBRANCE
     * 
     */
    @JsonProperty("salaryEncumbrance")
    public void setSalaryEncumbrance(Double salaryEncumbrance) {
        this.salaryEncumbrance = salaryEncumbrance;
    }

    public EmployeeJobsBaseJob100QapiPost withSalaryEncumbrance(Double salaryEncumbrance) {
        this.salaryEncumbrance = salaryEncumbrance;
        return this;
    }

    /**
     * Future Years
     * <p>
     * Lineage reference object : NBRBJOB_FUTURE_SALARY_ENC
     * 
     */
    @JsonProperty("futureSalaryEnc")
    public Double getFutureSalaryEnc() {
        return futureSalaryEnc;
    }

    /**
     * Future Years
     * <p>
     * Lineage reference object : NBRBJOB_FUTURE_SALARY_ENC
     * 
     */
    @JsonProperty("futureSalaryEnc")
    public void setFutureSalaryEnc(Double futureSalaryEnc) {
        this.futureSalaryEnc = futureSalaryEnc;
    }

    public EmployeeJobsBaseJob100QapiPost withFutureSalaryEnc(Double futureSalaryEnc) {
        this.futureSalaryEnc = futureSalaryEnc;
        return this;
    }

    /**
     * Probationary Period
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    public Double getProbationUnits() {
        return probationUnits;
    }

    /**
     * Probationary Period
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    public void setProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
    }

    public EmployeeJobsBaseJob100QapiPost withProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
        return this;
    }

    /**
     * Probationary Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_BEGIN_DATE
     * 
     */
    @JsonProperty("probationBeginDate")
    public Date getProbationBeginDate() {
        return probationBeginDate;
    }

    /**
     * Probationary Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_BEGIN_DATE
     * 
     */
    @JsonProperty("probationBeginDate")
    public void setProbationBeginDate(Date probationBeginDate) {
        this.probationBeginDate = probationBeginDate;
    }

    public EmployeeJobsBaseJob100QapiPost withProbationBeginDate(Date probationBeginDate) {
        this.probationBeginDate = probationBeginDate;
        return this;
    }

    /**
     * Probationary End Date
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_END_DATE
     * 
     */
    @JsonProperty("probationEndDate")
    public Date getProbationEndDate() {
        return probationEndDate;
    }

    /**
     * Probationary End Date
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_END_DATE
     * 
     */
    @JsonProperty("probationEndDate")
    public void setProbationEndDate(Date probationEndDate) {
        this.probationEndDate = probationEndDate;
    }

    public EmployeeJobsBaseJob100QapiPost withProbationEndDate(Date probationEndDate) {
        this.probationEndDate = probationEndDate;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_BEGIN_DATE
     * 
     */
    @JsonProperty("contractBeginDate")
    public Date getContractBeginDate() {
        return contractBeginDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_BEGIN_DATE
     * 
     */
    @JsonProperty("contractBeginDate")
    public void setContractBeginDate(Date contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
    }

    public EmployeeJobsBaseJob100QapiPost withContractBeginDate(Date contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_END_DATE
     * 
     */
    @JsonProperty("contractEndDate")
    public Date getContractEndDate() {
        return contractEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_END_DATE
     * 
     */
    @JsonProperty("contractEndDate")
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public EmployeeJobsBaseJob100QapiPost withContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
        return this;
    }

    /**
     * Total Contract Hours
     * <p>
     * Lineage reference object : NBRBJOB_TOTAL_CONTRACT_HRS
     * 
     */
    @JsonProperty("totalContractHrs")
    public Double getTotalContractHrs() {
        return totalContractHrs;
    }

    /**
     * Total Contract Hours
     * <p>
     * Lineage reference object : NBRBJOB_TOTAL_CONTRACT_HRS
     * 
     */
    @JsonProperty("totalContractHrs")
    public void setTotalContractHrs(Double totalContractHrs) {
        this.totalContractHrs = totalContractHrs;
    }

    public EmployeeJobsBaseJob100QapiPost withTotalContractHrs(Double totalContractHrs) {
        this.totalContractHrs = totalContractHrs;
        return this;
    }

    /**
     * Future Years
     * <p>
     * Lineage reference object : NBRBJOB_FUTURE_FRINGE_ENC
     * 
     */
    @JsonProperty("futureFringeEnc")
    public Double getFutureFringeEnc() {
        return futureFringeEnc;
    }

    /**
     * Future Years
     * <p>
     * Lineage reference object : NBRBJOB_FUTURE_FRINGE_ENC
     * 
     */
    @JsonProperty("futureFringeEnc")
    public void setFutureFringeEnc(Double futureFringeEnc) {
        this.futureFringeEnc = futureFringeEnc;
    }

    public EmployeeJobsBaseJob100QapiPost withFutureFringeEnc(Double futureFringeEnc) {
        this.futureFringeEnc = futureFringeEnc;
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

    public EmployeeJobsBaseJob100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsBaseJob100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("contractType");
        sb.append('=');
        sb.append(((this.contractType == null)?"<null>":this.contractType));
        sb.append(',');
        sb.append("ipedsReptInd");
        sb.append('=');
        sb.append(((this.ipedsReptInd == null)?"<null>":this.ipedsReptInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("accrueLeaveInd");
        sb.append('=');
        sb.append(((this.accrueLeaveInd == null)?"<null>":this.accrueLeaveInd));
        sb.append(',');
        sb.append("civilServiceInd");
        sb.append('=');
        sb.append(((this.civilServiceInd == null)?"<null>":this.civilServiceInd));
        sb.append(',');
        sb.append("stepIncrMon");
        sb.append('=');
        sb.append(((this.stepIncrMon == null)?"<null>":this.stepIncrMon));
        sb.append(',');
        sb.append("stepIncrDay");
        sb.append('=');
        sb.append(((this.stepIncrDay == null)?"<null>":this.stepIncrDay));
        sb.append(',');
        sb.append("eligibleDate");
        sb.append('=');
        sb.append(((this.eligibleDate == null)?"<null>":this.eligibleDate));
        sb.append(',');
        sb.append("totalEncumbranceHrs");
        sb.append('=');
        sb.append(((this.totalEncumbranceHrs == null)?"<null>":this.totalEncumbranceHrs));
        sb.append(',');
        sb.append("salaryEncumbrance");
        sb.append('=');
        sb.append(((this.salaryEncumbrance == null)?"<null>":this.salaryEncumbrance));
        sb.append(',');
        sb.append("futureSalaryEnc");
        sb.append('=');
        sb.append(((this.futureSalaryEnc == null)?"<null>":this.futureSalaryEnc));
        sb.append(',');
        sb.append("probationUnits");
        sb.append('=');
        sb.append(((this.probationUnits == null)?"<null>":this.probationUnits));
        sb.append(',');
        sb.append("probationBeginDate");
        sb.append('=');
        sb.append(((this.probationBeginDate == null)?"<null>":this.probationBeginDate));
        sb.append(',');
        sb.append("probationEndDate");
        sb.append('=');
        sb.append(((this.probationEndDate == null)?"<null>":this.probationEndDate));
        sb.append(',');
        sb.append("contractBeginDate");
        sb.append('=');
        sb.append(((this.contractBeginDate == null)?"<null>":this.contractBeginDate));
        sb.append(',');
        sb.append("contractEndDate");
        sb.append('=');
        sb.append(((this.contractEndDate == null)?"<null>":this.contractEndDate));
        sb.append(',');
        sb.append("totalContractHrs");
        sb.append('=');
        sb.append(((this.totalContractHrs == null)?"<null>":this.totalContractHrs));
        sb.append(',');
        sb.append("futureFringeEnc");
        sb.append('=');
        sb.append(((this.futureFringeEnc == null)?"<null>":this.futureFringeEnc));
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
        result = ((result* 31)+((this.ipedsReptInd == null)? 0 :this.ipedsReptInd.hashCode()));
        result = ((result* 31)+((this.contractType == null)? 0 :this.contractType.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.contractBeginDate == null)? 0 :this.contractBeginDate.hashCode()));
        result = ((result* 31)+((this.eligibleDate == null)? 0 :this.eligibleDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.accrueLeaveInd == null)? 0 :this.accrueLeaveInd.hashCode()));
        result = ((result* 31)+((this.totalEncumbranceHrs == null)? 0 :this.totalEncumbranceHrs.hashCode()));
        result = ((result* 31)+((this.salaryEncumbrance == null)? 0 :this.salaryEncumbrance.hashCode()));
        result = ((result* 31)+((this.stepIncrMon == null)? 0 :this.stepIncrMon.hashCode()));
        result = ((result* 31)+((this.contractEndDate == null)? 0 :this.contractEndDate.hashCode()));
        result = ((result* 31)+((this.futureFringeEnc == null)? 0 :this.futureFringeEnc.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.civilServiceInd == null)? 0 :this.civilServiceInd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.probationEndDate == null)? 0 :this.probationEndDate.hashCode()));
        result = ((result* 31)+((this.stepIncrDay == null)? 0 :this.stepIncrDay.hashCode()));
        result = ((result* 31)+((this.totalContractHrs == null)? 0 :this.totalContractHrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.futureSalaryEnc == null)? 0 :this.futureSalaryEnc.hashCode()));
        result = ((result* 31)+((this.probationBeginDate == null)? 0 :this.probationBeginDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeJobsBaseJob100QapiPost) == false) {
            return false;
        }
        EmployeeJobsBaseJob100QapiPost rhs = ((EmployeeJobsBaseJob100QapiPost) other);
        return (((((((((((((((((((((((((this.probationUnits == rhs.probationUnits)||((this.probationUnits!= null)&&this.probationUnits.equals(rhs.probationUnits)))&&((this.ipedsReptInd == rhs.ipedsReptInd)||((this.ipedsReptInd!= null)&&this.ipedsReptInd.equals(rhs.ipedsReptInd))))&&((this.contractType == rhs.contractType)||((this.contractType!= null)&&this.contractType.equals(rhs.contractType))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.contractBeginDate == rhs.contractBeginDate)||((this.contractBeginDate!= null)&&this.contractBeginDate.equals(rhs.contractBeginDate))))&&((this.eligibleDate == rhs.eligibleDate)||((this.eligibleDate!= null)&&this.eligibleDate.equals(rhs.eligibleDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.accrueLeaveInd == rhs.accrueLeaveInd)||((this.accrueLeaveInd!= null)&&this.accrueLeaveInd.equals(rhs.accrueLeaveInd))))&&((this.totalEncumbranceHrs == rhs.totalEncumbranceHrs)||((this.totalEncumbranceHrs!= null)&&this.totalEncumbranceHrs.equals(rhs.totalEncumbranceHrs))))&&((this.salaryEncumbrance == rhs.salaryEncumbrance)||((this.salaryEncumbrance!= null)&&this.salaryEncumbrance.equals(rhs.salaryEncumbrance))))&&((this.stepIncrMon == rhs.stepIncrMon)||((this.stepIncrMon!= null)&&this.stepIncrMon.equals(rhs.stepIncrMon))))&&((this.contractEndDate == rhs.contractEndDate)||((this.contractEndDate!= null)&&this.contractEndDate.equals(rhs.contractEndDate))))&&((this.futureFringeEnc == rhs.futureFringeEnc)||((this.futureFringeEnc!= null)&&this.futureFringeEnc.equals(rhs.futureFringeEnc))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.civilServiceInd == rhs.civilServiceInd)||((this.civilServiceInd!= null)&&this.civilServiceInd.equals(rhs.civilServiceInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.probationEndDate == rhs.probationEndDate)||((this.probationEndDate!= null)&&this.probationEndDate.equals(rhs.probationEndDate))))&&((this.stepIncrDay == rhs.stepIncrDay)||((this.stepIncrDay!= null)&&this.stepIncrDay.equals(rhs.stepIncrDay))))&&((this.totalContractHrs == rhs.totalContractHrs)||((this.totalContractHrs!= null)&&this.totalContractHrs.equals(rhs.totalContractHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.futureSalaryEnc == rhs.futureSalaryEnc)||((this.futureSalaryEnc!= null)&&this.futureSalaryEnc.equals(rhs.futureSalaryEnc))))&&((this.probationBeginDate == rhs.probationBeginDate)||((this.probationBeginDate!= null)&&this.probationBeginDate.equals(rhs.probationBeginDate))));
    }

}
