
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
    "probationUnits",
    "salaryEncumbrance",
    "ipedsReptInd",
    "endDate",
    "contractType",
    "deferBal",
    "fringeEncumbrance",
    "stepIncrMon",
    "contractEndDate",
    "coasCode",
    "futureFringeEnc",
    "totalFringeEnc",
    "civilServiceInd",
    "beginDate",
    "probationEndDate",
    "contractBeginDate",
    "totalSalaryEnc",
    "stepIncrDay",
    "eligibleDate",
    "totalContractHrs",
    "accrueLeaveInd",
    "futureSalaryEnc",
    "probationBeginDate",
    "totalEncumbranceHrs"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsBaseJob100PutResponse {

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
     * Current Fiscal Year
     * <p>
     * Lineage reference object : NBRBJOB_SALARY_ENCUMBRANCE
     * 
     */
    @JsonProperty("salaryEncumbrance")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_SALARY_ENCUMBRANCE")
    private Double salaryEncumbrance;
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
     * End Date
     * <p>
     * Lineage reference object : NBRBJOB_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_END_DATE")
    private Date endDate;
    /**
     * Job Type
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_TYPE
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_CONTRACT_TYPE")
    private String contractType;
    /**
     * Deferred Balance
     * <p>
     * Lineage reference object : NBRBJOB_DEFER_BAL
     * 
     */
    @JsonProperty("deferBal")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_DEFER_BAL")
    private Double deferBal;
    /**
     * Current Fiscal Year
     * <p>
     * Lineage reference object : NBRBJOB_FRINGE_ENCUMBRANCE
     * 
     */
    @JsonProperty("fringeEncumbrance")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_FRINGE_ENCUMBRANCE")
    private Double fringeEncumbrance;
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
     * End Date
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_END_DATE
     * 
     */
    @JsonProperty("contractEndDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_CONTRACT_END_DATE")
    private Date contractEndDate;
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
     * Future Years
     * <p>
     * Lineage reference object : NBRBJOB_FUTURE_FRINGE_ENC
     * 
     */
    @JsonProperty("futureFringeEnc")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_FUTURE_FRINGE_ENC")
    private Double futureFringeEnc;
    /**
     * Total Encumbrance
     * <p>
     * 
     * 
     */
    @JsonProperty("totalFringeEnc")
    private Double totalFringeEnc;
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
     * Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_BEGIN_DATE")
    private Date beginDate;
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
     * Total Encumbrance
     * <p>
     * 
     * 
     */
    @JsonProperty("totalSalaryEnc")
    private Double totalSalaryEnc;
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
     * Total Contract Hours
     * <p>
     * Lineage reference object : NBRBJOB_TOTAL_CONTRACT_HRS
     * 
     */
    @JsonProperty("totalContractHrs")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_TOTAL_CONTRACT_HRS")
    private Double totalContractHrs;
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
     * Future Years
     * <p>
     * Lineage reference object : NBRBJOB_FUTURE_SALARY_ENC
     * 
     */
    @JsonProperty("futureSalaryEnc")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_FUTURE_SALARY_ENC")
    private Double futureSalaryEnc;
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
     * Total Encumbrance Hours
     * <p>
     * Lineage reference object : NBRBJOB_TOTAL_ENCUMBRANCE_HRS
     * 
     */
    @JsonProperty("totalEncumbranceHrs")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_TOTAL_ENCUMBRANCE_HRS")
    private Double totalEncumbranceHrs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public EmployeeJobsBaseJob100PutResponse withProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
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

    public EmployeeJobsBaseJob100PutResponse withSalaryEncumbrance(Double salaryEncumbrance) {
        this.salaryEncumbrance = salaryEncumbrance;
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

    public EmployeeJobsBaseJob100PutResponse withIpedsReptInd(String ipedsReptInd) {
        this.ipedsReptInd = ipedsReptInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : NBRBJOB_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : NBRBJOB_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public EmployeeJobsBaseJob100PutResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Job Type
     * <p>
     * Lineage reference object : NBRBJOB_CONTRACT_TYPE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public EmployeeJobsBaseJob100PutResponse withContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * Deferred Balance
     * <p>
     * Lineage reference object : NBRBJOB_DEFER_BAL
     * 
     */
    @JsonProperty("deferBal")
    public Double getDeferBal() {
        return deferBal;
    }

    /**
     * Deferred Balance
     * <p>
     * Lineage reference object : NBRBJOB_DEFER_BAL
     * 
     */
    @JsonProperty("deferBal")
    public void setDeferBal(Double deferBal) {
        this.deferBal = deferBal;
    }

    public EmployeeJobsBaseJob100PutResponse withDeferBal(Double deferBal) {
        this.deferBal = deferBal;
        return this;
    }

    /**
     * Current Fiscal Year
     * <p>
     * Lineage reference object : NBRBJOB_FRINGE_ENCUMBRANCE
     * 
     */
    @JsonProperty("fringeEncumbrance")
    public Double getFringeEncumbrance() {
        return fringeEncumbrance;
    }

    /**
     * Current Fiscal Year
     * <p>
     * Lineage reference object : NBRBJOB_FRINGE_ENCUMBRANCE
     * 
     */
    @JsonProperty("fringeEncumbrance")
    public void setFringeEncumbrance(Double fringeEncumbrance) {
        this.fringeEncumbrance = fringeEncumbrance;
    }

    public EmployeeJobsBaseJob100PutResponse withFringeEncumbrance(Double fringeEncumbrance) {
        this.fringeEncumbrance = fringeEncumbrance;
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

    public EmployeeJobsBaseJob100PutResponse withStepIncrMon(String stepIncrMon) {
        this.stepIncrMon = stepIncrMon;
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

    public EmployeeJobsBaseJob100PutResponse withContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
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

    public EmployeeJobsBaseJob100PutResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public EmployeeJobsBaseJob100PutResponse withFutureFringeEnc(Double futureFringeEnc) {
        this.futureFringeEnc = futureFringeEnc;
        return this;
    }

    /**
     * Total Encumbrance
     * <p>
     * 
     * 
     */
    @JsonProperty("totalFringeEnc")
    public Double getTotalFringeEnc() {
        return totalFringeEnc;
    }

    /**
     * Total Encumbrance
     * <p>
     * 
     * 
     */
    @JsonProperty("totalFringeEnc")
    public void setTotalFringeEnc(Double totalFringeEnc) {
        this.totalFringeEnc = totalFringeEnc;
    }

    public EmployeeJobsBaseJob100PutResponse withTotalFringeEnc(Double totalFringeEnc) {
        this.totalFringeEnc = totalFringeEnc;
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

    public EmployeeJobsBaseJob100PutResponse withCivilServiceInd(String civilServiceInd) {
        this.civilServiceInd = civilServiceInd;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_BEGIN_DATE
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public EmployeeJobsBaseJob100PutResponse withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
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

    public EmployeeJobsBaseJob100PutResponse withProbationEndDate(Date probationEndDate) {
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

    public EmployeeJobsBaseJob100PutResponse withContractBeginDate(Date contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
        return this;
    }

    /**
     * Total Encumbrance
     * <p>
     * 
     * 
     */
    @JsonProperty("totalSalaryEnc")
    public Double getTotalSalaryEnc() {
        return totalSalaryEnc;
    }

    /**
     * Total Encumbrance
     * <p>
     * 
     * 
     */
    @JsonProperty("totalSalaryEnc")
    public void setTotalSalaryEnc(Double totalSalaryEnc) {
        this.totalSalaryEnc = totalSalaryEnc;
    }

    public EmployeeJobsBaseJob100PutResponse withTotalSalaryEnc(Double totalSalaryEnc) {
        this.totalSalaryEnc = totalSalaryEnc;
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

    public EmployeeJobsBaseJob100PutResponse withStepIncrDay(String stepIncrDay) {
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

    public EmployeeJobsBaseJob100PutResponse withEligibleDate(Date eligibleDate) {
        this.eligibleDate = eligibleDate;
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

    public EmployeeJobsBaseJob100PutResponse withTotalContractHrs(Double totalContractHrs) {
        this.totalContractHrs = totalContractHrs;
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

    public EmployeeJobsBaseJob100PutResponse withAccrueLeaveInd(String accrueLeaveInd) {
        this.accrueLeaveInd = accrueLeaveInd;
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

    public EmployeeJobsBaseJob100PutResponse withFutureSalaryEnc(Double futureSalaryEnc) {
        this.futureSalaryEnc = futureSalaryEnc;
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

    public EmployeeJobsBaseJob100PutResponse withProbationBeginDate(Date probationBeginDate) {
        this.probationBeginDate = probationBeginDate;
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

    public EmployeeJobsBaseJob100PutResponse withTotalEncumbranceHrs(Double totalEncumbranceHrs) {
        this.totalEncumbranceHrs = totalEncumbranceHrs;
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

    public EmployeeJobsBaseJob100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsBaseJob100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("probationUnits");
        sb.append('=');
        sb.append(((this.probationUnits == null)?"<null>":this.probationUnits));
        sb.append(',');
        sb.append("salaryEncumbrance");
        sb.append('=');
        sb.append(((this.salaryEncumbrance == null)?"<null>":this.salaryEncumbrance));
        sb.append(',');
        sb.append("ipedsReptInd");
        sb.append('=');
        sb.append(((this.ipedsReptInd == null)?"<null>":this.ipedsReptInd));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("contractType");
        sb.append('=');
        sb.append(((this.contractType == null)?"<null>":this.contractType));
        sb.append(',');
        sb.append("deferBal");
        sb.append('=');
        sb.append(((this.deferBal == null)?"<null>":this.deferBal));
        sb.append(',');
        sb.append("fringeEncumbrance");
        sb.append('=');
        sb.append(((this.fringeEncumbrance == null)?"<null>":this.fringeEncumbrance));
        sb.append(',');
        sb.append("stepIncrMon");
        sb.append('=');
        sb.append(((this.stepIncrMon == null)?"<null>":this.stepIncrMon));
        sb.append(',');
        sb.append("contractEndDate");
        sb.append('=');
        sb.append(((this.contractEndDate == null)?"<null>":this.contractEndDate));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("futureFringeEnc");
        sb.append('=');
        sb.append(((this.futureFringeEnc == null)?"<null>":this.futureFringeEnc));
        sb.append(',');
        sb.append("totalFringeEnc");
        sb.append('=');
        sb.append(((this.totalFringeEnc == null)?"<null>":this.totalFringeEnc));
        sb.append(',');
        sb.append("civilServiceInd");
        sb.append('=');
        sb.append(((this.civilServiceInd == null)?"<null>":this.civilServiceInd));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("probationEndDate");
        sb.append('=');
        sb.append(((this.probationEndDate == null)?"<null>":this.probationEndDate));
        sb.append(',');
        sb.append("contractBeginDate");
        sb.append('=');
        sb.append(((this.contractBeginDate == null)?"<null>":this.contractBeginDate));
        sb.append(',');
        sb.append("totalSalaryEnc");
        sb.append('=');
        sb.append(((this.totalSalaryEnc == null)?"<null>":this.totalSalaryEnc));
        sb.append(',');
        sb.append("stepIncrDay");
        sb.append('=');
        sb.append(((this.stepIncrDay == null)?"<null>":this.stepIncrDay));
        sb.append(',');
        sb.append("eligibleDate");
        sb.append('=');
        sb.append(((this.eligibleDate == null)?"<null>":this.eligibleDate));
        sb.append(',');
        sb.append("totalContractHrs");
        sb.append('=');
        sb.append(((this.totalContractHrs == null)?"<null>":this.totalContractHrs));
        sb.append(',');
        sb.append("accrueLeaveInd");
        sb.append('=');
        sb.append(((this.accrueLeaveInd == null)?"<null>":this.accrueLeaveInd));
        sb.append(',');
        sb.append("futureSalaryEnc");
        sb.append('=');
        sb.append(((this.futureSalaryEnc == null)?"<null>":this.futureSalaryEnc));
        sb.append(',');
        sb.append("probationBeginDate");
        sb.append('=');
        sb.append(((this.probationBeginDate == null)?"<null>":this.probationBeginDate));
        sb.append(',');
        sb.append("totalEncumbranceHrs");
        sb.append('=');
        sb.append(((this.totalEncumbranceHrs == null)?"<null>":this.totalEncumbranceHrs));
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
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.contractType == null)? 0 :this.contractType.hashCode()));
        result = ((result* 31)+((this.fringeEncumbrance == null)? 0 :this.fringeEncumbrance.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.totalFringeEnc == null)? 0 :this.totalFringeEnc.hashCode()));
        result = ((result* 31)+((this.contractBeginDate == null)? 0 :this.contractBeginDate.hashCode()));
        result = ((result* 31)+((this.totalSalaryEnc == null)? 0 :this.totalSalaryEnc.hashCode()));
        result = ((result* 31)+((this.eligibleDate == null)? 0 :this.eligibleDate.hashCode()));
        result = ((result* 31)+((this.accrueLeaveInd == null)? 0 :this.accrueLeaveInd.hashCode()));
        result = ((result* 31)+((this.totalEncumbranceHrs == null)? 0 :this.totalEncumbranceHrs.hashCode()));
        result = ((result* 31)+((this.salaryEncumbrance == null)? 0 :this.salaryEncumbrance.hashCode()));
        result = ((result* 31)+((this.deferBal == null)? 0 :this.deferBal.hashCode()));
        result = ((result* 31)+((this.stepIncrMon == null)? 0 :this.stepIncrMon.hashCode()));
        result = ((result* 31)+((this.contractEndDate == null)? 0 :this.contractEndDate.hashCode()));
        result = ((result* 31)+((this.futureFringeEnc == null)? 0 :this.futureFringeEnc.hashCode()));
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
        if ((other instanceof EmployeeJobsBaseJob100PutResponse) == false) {
            return false;
        }
        EmployeeJobsBaseJob100PutResponse rhs = ((EmployeeJobsBaseJob100PutResponse) other);
        return ((((((((((((((((((((((((((this.probationUnits == rhs.probationUnits)||((this.probationUnits!= null)&&this.probationUnits.equals(rhs.probationUnits)))&&((this.ipedsReptInd == rhs.ipedsReptInd)||((this.ipedsReptInd!= null)&&this.ipedsReptInd.equals(rhs.ipedsReptInd))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.contractType == rhs.contractType)||((this.contractType!= null)&&this.contractType.equals(rhs.contractType))))&&((this.fringeEncumbrance == rhs.fringeEncumbrance)||((this.fringeEncumbrance!= null)&&this.fringeEncumbrance.equals(rhs.fringeEncumbrance))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.totalFringeEnc == rhs.totalFringeEnc)||((this.totalFringeEnc!= null)&&this.totalFringeEnc.equals(rhs.totalFringeEnc))))&&((this.contractBeginDate == rhs.contractBeginDate)||((this.contractBeginDate!= null)&&this.contractBeginDate.equals(rhs.contractBeginDate))))&&((this.totalSalaryEnc == rhs.totalSalaryEnc)||((this.totalSalaryEnc!= null)&&this.totalSalaryEnc.equals(rhs.totalSalaryEnc))))&&((this.eligibleDate == rhs.eligibleDate)||((this.eligibleDate!= null)&&this.eligibleDate.equals(rhs.eligibleDate))))&&((this.accrueLeaveInd == rhs.accrueLeaveInd)||((this.accrueLeaveInd!= null)&&this.accrueLeaveInd.equals(rhs.accrueLeaveInd))))&&((this.totalEncumbranceHrs == rhs.totalEncumbranceHrs)||((this.totalEncumbranceHrs!= null)&&this.totalEncumbranceHrs.equals(rhs.totalEncumbranceHrs))))&&((this.salaryEncumbrance == rhs.salaryEncumbrance)||((this.salaryEncumbrance!= null)&&this.salaryEncumbrance.equals(rhs.salaryEncumbrance))))&&((this.deferBal == rhs.deferBal)||((this.deferBal!= null)&&this.deferBal.equals(rhs.deferBal))))&&((this.stepIncrMon == rhs.stepIncrMon)||((this.stepIncrMon!= null)&&this.stepIncrMon.equals(rhs.stepIncrMon))))&&((this.contractEndDate == rhs.contractEndDate)||((this.contractEndDate!= null)&&this.contractEndDate.equals(rhs.contractEndDate))))&&((this.futureFringeEnc == rhs.futureFringeEnc)||((this.futureFringeEnc!= null)&&this.futureFringeEnc.equals(rhs.futureFringeEnc))))&&((this.civilServiceInd == rhs.civilServiceInd)||((this.civilServiceInd!= null)&&this.civilServiceInd.equals(rhs.civilServiceInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.probationEndDate == rhs.probationEndDate)||((this.probationEndDate!= null)&&this.probationEndDate.equals(rhs.probationEndDate))))&&((this.stepIncrDay == rhs.stepIncrDay)||((this.stepIncrDay!= null)&&this.stepIncrDay.equals(rhs.stepIncrDay))))&&((this.totalContractHrs == rhs.totalContractHrs)||((this.totalContractHrs!= null)&&this.totalContractHrs.equals(rhs.totalContractHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.futureSalaryEnc == rhs.futureSalaryEnc)||((this.futureSalaryEnc!= null)&&this.futureSalaryEnc.equals(rhs.futureSalaryEnc))))&&((this.probationBeginDate == rhs.probationBeginDate)||((this.probationBeginDate!= null)&&this.probationBeginDate.equals(rhs.probationBeginDate))));
    }

}
