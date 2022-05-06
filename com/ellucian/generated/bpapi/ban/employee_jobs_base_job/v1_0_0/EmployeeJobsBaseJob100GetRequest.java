
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
    "salaryEncumbrance",
    "probationUnits",
    "ipedsReptInd",
    "contractType",
    "stepIncrMon",
    "contractEndDate",
    "coasCode",
    "futureFringeEnc",
    "posn",
    "civilServiceInd",
    "beginDate",
    "probationEndDate",
    "queryDate",
    "suff",
    "contractBeginDate",
    "stepIncrDay",
    "eligibleDate",
    "totalContractHrs",
    "id",
    "accrueLeaveInd",
    "futureSalaryEnc",
    "probationBeginDate",
    "totalEncumbranceHrs"
})
@Generated("jsonschema2pojo")
public class EmployeeJobsBaseJob100GetRequest {

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
     * Probationary Period
     * <p>
     * Lineage reference object : NBRBJOB_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_PROBATION_UNITS")
    private Double probationUnits;
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
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private Object posn;
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
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Lineage reference object : queryDate")
    private Object queryDate;
    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : suff")
    private Object suff;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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

    public EmployeeJobsBaseJob100GetRequest withSalaryEncumbrance(Double salaryEncumbrance) {
        this.salaryEncumbrance = salaryEncumbrance;
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

    public EmployeeJobsBaseJob100GetRequest withProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
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

    public EmployeeJobsBaseJob100GetRequest withIpedsReptInd(String ipedsReptInd) {
        this.ipedsReptInd = ipedsReptInd;
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

    public EmployeeJobsBaseJob100GetRequest withContractType(String contractType) {
        this.contractType = contractType;
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

    public EmployeeJobsBaseJob100GetRequest withStepIncrMon(String stepIncrMon) {
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

    public EmployeeJobsBaseJob100GetRequest withContractEndDate(Date contractEndDate) {
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

    public EmployeeJobsBaseJob100GetRequest withCoasCode(String coasCode) {
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

    public EmployeeJobsBaseJob100GetRequest withFutureFringeEnc(Double futureFringeEnc) {
        this.futureFringeEnc = futureFringeEnc;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public Object getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public void setPosn(Object posn) {
        this.posn = posn;
    }

    public EmployeeJobsBaseJob100GetRequest withPosn(Object posn) {
        this.posn = posn;
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

    public EmployeeJobsBaseJob100GetRequest withCivilServiceInd(String civilServiceInd) {
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

    public EmployeeJobsBaseJob100GetRequest withBeginDate(Date beginDate) {
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

    public EmployeeJobsBaseJob100GetRequest withProbationEndDate(Date probationEndDate) {
        this.probationEndDate = probationEndDate;
        return this;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public Object getQueryDate() {
        return queryDate;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(Object queryDate) {
        this.queryDate = queryDate;
    }

    public EmployeeJobsBaseJob100GetRequest withQueryDate(Object queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public Object getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * 
     */
    @JsonProperty("suff")
    public void setSuff(Object suff) {
        this.suff = suff;
    }

    public EmployeeJobsBaseJob100GetRequest withSuff(Object suff) {
        this.suff = suff;
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

    public EmployeeJobsBaseJob100GetRequest withContractBeginDate(Date contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
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

    public EmployeeJobsBaseJob100GetRequest withStepIncrDay(String stepIncrDay) {
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

    public EmployeeJobsBaseJob100GetRequest withEligibleDate(Date eligibleDate) {
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

    public EmployeeJobsBaseJob100GetRequest withTotalContractHrs(Double totalContractHrs) {
        this.totalContractHrs = totalContractHrs;
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

    public EmployeeJobsBaseJob100GetRequest withId(Object id) {
        this.id = id;
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

    public EmployeeJobsBaseJob100GetRequest withAccrueLeaveInd(String accrueLeaveInd) {
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

    public EmployeeJobsBaseJob100GetRequest withFutureSalaryEnc(Double futureSalaryEnc) {
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

    public EmployeeJobsBaseJob100GetRequest withProbationBeginDate(Date probationBeginDate) {
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

    public EmployeeJobsBaseJob100GetRequest withTotalEncumbranceHrs(Double totalEncumbranceHrs) {
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

    public EmployeeJobsBaseJob100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeJobsBaseJob100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("salaryEncumbrance");
        sb.append('=');
        sb.append(((this.salaryEncumbrance == null)?"<null>":this.salaryEncumbrance));
        sb.append(',');
        sb.append("probationUnits");
        sb.append('=');
        sb.append(((this.probationUnits == null)?"<null>":this.probationUnits));
        sb.append(',');
        sb.append("ipedsReptInd");
        sb.append('=');
        sb.append(((this.ipedsReptInd == null)?"<null>":this.ipedsReptInd));
        sb.append(',');
        sb.append("contractType");
        sb.append('=');
        sb.append(((this.contractType == null)?"<null>":this.contractType));
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
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
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
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("contractBeginDate");
        sb.append('=');
        sb.append(((this.contractBeginDate == null)?"<null>":this.contractBeginDate));
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
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        if ((other instanceof EmployeeJobsBaseJob100GetRequest) == false) {
            return false;
        }
        EmployeeJobsBaseJob100GetRequest rhs = ((EmployeeJobsBaseJob100GetRequest) other);
        return (((((((((((((((((((((((((this.probationUnits == rhs.probationUnits)||((this.probationUnits!= null)&&this.probationUnits.equals(rhs.probationUnits)))&&((this.ipedsReptInd == rhs.ipedsReptInd)||((this.ipedsReptInd!= null)&&this.ipedsReptInd.equals(rhs.ipedsReptInd))))&&((this.contractType == rhs.contractType)||((this.contractType!= null)&&this.contractType.equals(rhs.contractType))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.contractBeginDate == rhs.contractBeginDate)||((this.contractBeginDate!= null)&&this.contractBeginDate.equals(rhs.contractBeginDate))))&&((this.eligibleDate == rhs.eligibleDate)||((this.eligibleDate!= null)&&this.eligibleDate.equals(rhs.eligibleDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.accrueLeaveInd == rhs.accrueLeaveInd)||((this.accrueLeaveInd!= null)&&this.accrueLeaveInd.equals(rhs.accrueLeaveInd))))&&((this.totalEncumbranceHrs == rhs.totalEncumbranceHrs)||((this.totalEncumbranceHrs!= null)&&this.totalEncumbranceHrs.equals(rhs.totalEncumbranceHrs))))&&((this.salaryEncumbrance == rhs.salaryEncumbrance)||((this.salaryEncumbrance!= null)&&this.salaryEncumbrance.equals(rhs.salaryEncumbrance))))&&((this.stepIncrMon == rhs.stepIncrMon)||((this.stepIncrMon!= null)&&this.stepIncrMon.equals(rhs.stepIncrMon))))&&((this.contractEndDate == rhs.contractEndDate)||((this.contractEndDate!= null)&&this.contractEndDate.equals(rhs.contractEndDate))))&&((this.futureFringeEnc == rhs.futureFringeEnc)||((this.futureFringeEnc!= null)&&this.futureFringeEnc.equals(rhs.futureFringeEnc))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.civilServiceInd == rhs.civilServiceInd)||((this.civilServiceInd!= null)&&this.civilServiceInd.equals(rhs.civilServiceInd))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.probationEndDate == rhs.probationEndDate)||((this.probationEndDate!= null)&&this.probationEndDate.equals(rhs.probationEndDate))))&&((this.stepIncrDay == rhs.stepIncrDay)||((this.stepIncrDay!= null)&&this.stepIncrDay.equals(rhs.stepIncrDay))))&&((this.totalContractHrs == rhs.totalContractHrs)||((this.totalContractHrs!= null)&&this.totalContractHrs.equals(rhs.totalContractHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.futureSalaryEnc == rhs.futureSalaryEnc)||((this.futureSalaryEnc!= null)&&this.futureSalaryEnc.equals(rhs.futureSalaryEnc))))&&((this.probationBeginDate == rhs.probationBeginDate)||((this.probationBeginDate!= null)&&this.probationBeginDate.equals(rhs.probationBeginDate))));
    }

}
