
package com.ellucian.generated.bpapi.ban.student_installment_plan.v1_0_0;

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
    "criteria.servCharge",
    "numberOfPayments",
    "criteria.firstInstallDate",
    "criteria.activityDate",
    "criteria.refNumber",
    "criteria.installmentPlan",
    "criteria.payPeriod",
    "criteria.planAmount",
    "criteria.autoCalcPlanInd",
    "criteria.numberOfPayments",
    "autoCalcActiveInd",
    "criteria.autoCalcActiveInd",
    "criteria.termCode",
    "criteria.desc",
    "criteria.intRate",
    "criteria.planDetailCode",
    "payPeriod",
    "criteria.prinDetailCode",
    "firstInstallDate",
    "criteria.intDetailCode",
    "criteria.servDetailCode",
    "id",
    "criteria.svcChgPct"
})
@Generated("jsonschema2pojo")
public class StudentInstallmentPlan100PutRequest {

    /**
     * Service Charge Amount
     * <p>
     * Lineage reference object : TBRISTL_SERV_CHARGE
     * 
     */
    @JsonProperty("criteria.servCharge")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_SERV_CHARGE")
    private Double criteriaServCharge;
    /**
     * Number of Payments
     * <p>
     * Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS
     * (Required)
     * 
     */
    @JsonProperty("numberOfPayments")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS")
    private Double numberOfPayments;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRISTL_FIRST_INSTALL_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.firstInstallDate")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_FIRST_INSTALL_DATE")
    private Date criteriaFirstInstallDate;
    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRISTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Reference Number
     * <p>
     * Lineage reference object : TBRISTL_REF_NUMBER
     * 
     */
    @JsonProperty("criteria.refNumber")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_REF_NUMBER")
    private Double criteriaRefNumber;
    /**
     * Installment Plan
     * <p>
     * Lineage reference object : TBRISTL_INSTALLMENT_PLAN
     * (Required)
     * 
     */
    @JsonProperty("criteria.installmentPlan")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_INSTALLMENT_PLAN")
    private String criteriaInstallmentPlan;
    /**
     * Pay Period
     * <p>
     * Lineage reference object : TBRISTL_PAY_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("criteria.payPeriod")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PAY_PERIOD")
    private Double criteriaPayPeriod;
    /**
     * Plan Amount
     * <p>
     * Lineage reference object : TBRISTL_PLAN_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.planAmount")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PLAN_AMOUNT")
    private Double criteriaPlanAmount;
    /**
     * Auto Plan
     * <p>
     * Lineage reference object : TBRISTL_AUTO_CALC_PLAN_IND
     * 
     */
    @JsonProperty("criteria.autoCalcPlanInd")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_AUTO_CALC_PLAN_IND")
    private String criteriaAutoCalcPlanInd;
    /**
     * Number of Payments
     * <p>
     * Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.numberOfPayments")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS")
    private Double criteriaNumberOfPayments;
    /**
     * Active
     * <p>
     * Lineage reference object : TBRISTL_AUTO_CALC_ACTIVE_IND
     * 
     */
    @JsonProperty("autoCalcActiveInd")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_AUTO_CALC_ACTIVE_IND")
    private String autoCalcActiveInd;
    /**
     * Active
     * <p>
     * Lineage reference object : TBRISTL_AUTO_CALC_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.autoCalcActiveInd")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_AUTO_CALC_ACTIVE_IND")
    private String criteriaAutoCalcActiveInd;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRISTL_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTermCode;
    /**
     * Installment Plan Description
     * <p>
     * Lineage reference object : TBRISTL_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_DESC")
    private String criteriaDesc;
    /**
     * Interest Rate
     * <p>
     * Lineage reference object : TBRISTL_INT_RATE
     * 
     */
    @JsonProperty("criteria.intRate")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_INT_RATE")
    private Double criteriaIntRate;
    /**
     * Plan Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PLAN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.planDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PLAN_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaPlanDetailCode;
    /**
     * Pay Period
     * <p>
     * Lineage reference object : TBRISTL_PAY_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("payPeriod")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PAY_PERIOD")
    private Double payPeriod;
    /**
     * Principal Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PRIN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.prinDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PRIN_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaPrinDetailCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRISTL_FIRST_INSTALL_DATE
     * (Required)
     * 
     */
    @JsonProperty("firstInstallDate")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_FIRST_INSTALL_DATE")
    private Date firstInstallDate;
    /**
     * Interest Detail Code
     * <p>
     * Lineage reference object : TBRISTL_INT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("criteria.intDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_INT_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaIntDetailCode;
    /**
     * Service Charge Detail Code
     * <p>
     * Lineage reference object : TBRISTL_SERV_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("criteria.servDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_SERV_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaServDetailCode;
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
     * Percent
     * <p>
     * Lineage reference object : TBRISTL_SVC_CHG_PCT
     * 
     */
    @JsonProperty("criteria.svcChgPct")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_SVC_CHG_PCT")
    private Double criteriaSvcChgPct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Service Charge Amount
     * <p>
     * Lineage reference object : TBRISTL_SERV_CHARGE
     * 
     */
    @JsonProperty("criteria.servCharge")
    public Double getCriteriaServCharge() {
        return criteriaServCharge;
    }

    /**
     * Service Charge Amount
     * <p>
     * Lineage reference object : TBRISTL_SERV_CHARGE
     * 
     */
    @JsonProperty("criteria.servCharge")
    public void setCriteriaServCharge(Double criteriaServCharge) {
        this.criteriaServCharge = criteriaServCharge;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaServCharge(Double criteriaServCharge) {
        this.criteriaServCharge = criteriaServCharge;
        return this;
    }

    /**
     * Number of Payments
     * <p>
     * Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS
     * (Required)
     * 
     */
    @JsonProperty("numberOfPayments")
    public Double getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     * Number of Payments
     * <p>
     * Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS
     * (Required)
     * 
     */
    @JsonProperty("numberOfPayments")
    public void setNumberOfPayments(Double numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public StudentInstallmentPlan100PutRequest withNumberOfPayments(Double numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRISTL_FIRST_INSTALL_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.firstInstallDate")
    public Date getCriteriaFirstInstallDate() {
        return criteriaFirstInstallDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRISTL_FIRST_INSTALL_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.firstInstallDate")
    public void setCriteriaFirstInstallDate(Date criteriaFirstInstallDate) {
        this.criteriaFirstInstallDate = criteriaFirstInstallDate;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaFirstInstallDate(Date criteriaFirstInstallDate) {
        this.criteriaFirstInstallDate = criteriaFirstInstallDate;
        return this;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRISTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRISTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : TBRISTL_REF_NUMBER
     * 
     */
    @JsonProperty("criteria.refNumber")
    public Double getCriteriaRefNumber() {
        return criteriaRefNumber;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : TBRISTL_REF_NUMBER
     * 
     */
    @JsonProperty("criteria.refNumber")
    public void setCriteriaRefNumber(Double criteriaRefNumber) {
        this.criteriaRefNumber = criteriaRefNumber;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaRefNumber(Double criteriaRefNumber) {
        this.criteriaRefNumber = criteriaRefNumber;
        return this;
    }

    /**
     * Installment Plan
     * <p>
     * Lineage reference object : TBRISTL_INSTALLMENT_PLAN
     * (Required)
     * 
     */
    @JsonProperty("criteria.installmentPlan")
    public String getCriteriaInstallmentPlan() {
        return criteriaInstallmentPlan;
    }

    /**
     * Installment Plan
     * <p>
     * Lineage reference object : TBRISTL_INSTALLMENT_PLAN
     * (Required)
     * 
     */
    @JsonProperty("criteria.installmentPlan")
    public void setCriteriaInstallmentPlan(String criteriaInstallmentPlan) {
        this.criteriaInstallmentPlan = criteriaInstallmentPlan;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaInstallmentPlan(String criteriaInstallmentPlan) {
        this.criteriaInstallmentPlan = criteriaInstallmentPlan;
        return this;
    }

    /**
     * Pay Period
     * <p>
     * Lineage reference object : TBRISTL_PAY_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("criteria.payPeriod")
    public Double getCriteriaPayPeriod() {
        return criteriaPayPeriod;
    }

    /**
     * Pay Period
     * <p>
     * Lineage reference object : TBRISTL_PAY_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("criteria.payPeriod")
    public void setCriteriaPayPeriod(Double criteriaPayPeriod) {
        this.criteriaPayPeriod = criteriaPayPeriod;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaPayPeriod(Double criteriaPayPeriod) {
        this.criteriaPayPeriod = criteriaPayPeriod;
        return this;
    }

    /**
     * Plan Amount
     * <p>
     * Lineage reference object : TBRISTL_PLAN_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.planAmount")
    public Double getCriteriaPlanAmount() {
        return criteriaPlanAmount;
    }

    /**
     * Plan Amount
     * <p>
     * Lineage reference object : TBRISTL_PLAN_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.planAmount")
    public void setCriteriaPlanAmount(Double criteriaPlanAmount) {
        this.criteriaPlanAmount = criteriaPlanAmount;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaPlanAmount(Double criteriaPlanAmount) {
        this.criteriaPlanAmount = criteriaPlanAmount;
        return this;
    }

    /**
     * Auto Plan
     * <p>
     * Lineage reference object : TBRISTL_AUTO_CALC_PLAN_IND
     * 
     */
    @JsonProperty("criteria.autoCalcPlanInd")
    public String getCriteriaAutoCalcPlanInd() {
        return criteriaAutoCalcPlanInd;
    }

    /**
     * Auto Plan
     * <p>
     * Lineage reference object : TBRISTL_AUTO_CALC_PLAN_IND
     * 
     */
    @JsonProperty("criteria.autoCalcPlanInd")
    public void setCriteriaAutoCalcPlanInd(String criteriaAutoCalcPlanInd) {
        this.criteriaAutoCalcPlanInd = criteriaAutoCalcPlanInd;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaAutoCalcPlanInd(String criteriaAutoCalcPlanInd) {
        this.criteriaAutoCalcPlanInd = criteriaAutoCalcPlanInd;
        return this;
    }

    /**
     * Number of Payments
     * <p>
     * Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.numberOfPayments")
    public Double getCriteriaNumberOfPayments() {
        return criteriaNumberOfPayments;
    }

    /**
     * Number of Payments
     * <p>
     * Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS
     * (Required)
     * 
     */
    @JsonProperty("criteria.numberOfPayments")
    public void setCriteriaNumberOfPayments(Double criteriaNumberOfPayments) {
        this.criteriaNumberOfPayments = criteriaNumberOfPayments;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaNumberOfPayments(Double criteriaNumberOfPayments) {
        this.criteriaNumberOfPayments = criteriaNumberOfPayments;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBRISTL_AUTO_CALC_ACTIVE_IND
     * 
     */
    @JsonProperty("autoCalcActiveInd")
    public String getAutoCalcActiveInd() {
        return autoCalcActiveInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBRISTL_AUTO_CALC_ACTIVE_IND
     * 
     */
    @JsonProperty("autoCalcActiveInd")
    public void setAutoCalcActiveInd(String autoCalcActiveInd) {
        this.autoCalcActiveInd = autoCalcActiveInd;
    }

    public StudentInstallmentPlan100PutRequest withAutoCalcActiveInd(String autoCalcActiveInd) {
        this.autoCalcActiveInd = autoCalcActiveInd;
        return this;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBRISTL_AUTO_CALC_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.autoCalcActiveInd")
    public String getCriteriaAutoCalcActiveInd() {
        return criteriaAutoCalcActiveInd;
    }

    /**
     * Active
     * <p>
     * Lineage reference object : TBRISTL_AUTO_CALC_ACTIVE_IND
     * 
     */
    @JsonProperty("criteria.autoCalcActiveInd")
    public void setCriteriaAutoCalcActiveInd(String criteriaAutoCalcActiveInd) {
        this.criteriaAutoCalcActiveInd = criteriaAutoCalcActiveInd;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaAutoCalcActiveInd(String criteriaAutoCalcActiveInd) {
        this.criteriaAutoCalcActiveInd = criteriaAutoCalcActiveInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRISTL_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRISTL_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

    /**
     * Installment Plan Description
     * <p>
     * Lineage reference object : TBRISTL_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Installment Plan Description
     * <p>
     * Lineage reference object : TBRISTL_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Interest Rate
     * <p>
     * Lineage reference object : TBRISTL_INT_RATE
     * 
     */
    @JsonProperty("criteria.intRate")
    public Double getCriteriaIntRate() {
        return criteriaIntRate;
    }

    /**
     * Interest Rate
     * <p>
     * Lineage reference object : TBRISTL_INT_RATE
     * 
     */
    @JsonProperty("criteria.intRate")
    public void setCriteriaIntRate(Double criteriaIntRate) {
        this.criteriaIntRate = criteriaIntRate;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaIntRate(Double criteriaIntRate) {
        this.criteriaIntRate = criteriaIntRate;
        return this;
    }

    /**
     * Plan Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PLAN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.planDetailCode")
    public String getCriteriaPlanDetailCode() {
        return criteriaPlanDetailCode;
    }

    /**
     * Plan Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PLAN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.planDetailCode")
    public void setCriteriaPlanDetailCode(String criteriaPlanDetailCode) {
        this.criteriaPlanDetailCode = criteriaPlanDetailCode;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaPlanDetailCode(String criteriaPlanDetailCode) {
        this.criteriaPlanDetailCode = criteriaPlanDetailCode;
        return this;
    }

    /**
     * Pay Period
     * <p>
     * Lineage reference object : TBRISTL_PAY_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("payPeriod")
    public Double getPayPeriod() {
        return payPeriod;
    }

    /**
     * Pay Period
     * <p>
     * Lineage reference object : TBRISTL_PAY_PERIOD
     * (Required)
     * 
     */
    @JsonProperty("payPeriod")
    public void setPayPeriod(Double payPeriod) {
        this.payPeriod = payPeriod;
    }

    public StudentInstallmentPlan100PutRequest withPayPeriod(Double payPeriod) {
        this.payPeriod = payPeriod;
        return this;
    }

    /**
     * Principal Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PRIN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.prinDetailCode")
    public String getCriteriaPrinDetailCode() {
        return criteriaPrinDetailCode;
    }

    /**
     * Principal Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PRIN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.prinDetailCode")
    public void setCriteriaPrinDetailCode(String criteriaPrinDetailCode) {
        this.criteriaPrinDetailCode = criteriaPrinDetailCode;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaPrinDetailCode(String criteriaPrinDetailCode) {
        this.criteriaPrinDetailCode = criteriaPrinDetailCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRISTL_FIRST_INSTALL_DATE
     * (Required)
     * 
     */
    @JsonProperty("firstInstallDate")
    public Date getFirstInstallDate() {
        return firstInstallDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRISTL_FIRST_INSTALL_DATE
     * (Required)
     * 
     */
    @JsonProperty("firstInstallDate")
    public void setFirstInstallDate(Date firstInstallDate) {
        this.firstInstallDate = firstInstallDate;
    }

    public StudentInstallmentPlan100PutRequest withFirstInstallDate(Date firstInstallDate) {
        this.firstInstallDate = firstInstallDate;
        return this;
    }

    /**
     * Interest Detail Code
     * <p>
     * Lineage reference object : TBRISTL_INT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("criteria.intDetailCode")
    public String getCriteriaIntDetailCode() {
        return criteriaIntDetailCode;
    }

    /**
     * Interest Detail Code
     * <p>
     * Lineage reference object : TBRISTL_INT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("criteria.intDetailCode")
    public void setCriteriaIntDetailCode(String criteriaIntDetailCode) {
        this.criteriaIntDetailCode = criteriaIntDetailCode;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaIntDetailCode(String criteriaIntDetailCode) {
        this.criteriaIntDetailCode = criteriaIntDetailCode;
        return this;
    }

    /**
     * Service Charge Detail Code
     * <p>
     * Lineage reference object : TBRISTL_SERV_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("criteria.servDetailCode")
    public String getCriteriaServDetailCode() {
        return criteriaServDetailCode;
    }

    /**
     * Service Charge Detail Code
     * <p>
     * Lineage reference object : TBRISTL_SERV_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("criteria.servDetailCode")
    public void setCriteriaServDetailCode(String criteriaServDetailCode) {
        this.criteriaServDetailCode = criteriaServDetailCode;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaServDetailCode(String criteriaServDetailCode) {
        this.criteriaServDetailCode = criteriaServDetailCode;
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

    public StudentInstallmentPlan100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBRISTL_SVC_CHG_PCT
     * 
     */
    @JsonProperty("criteria.svcChgPct")
    public Double getCriteriaSvcChgPct() {
        return criteriaSvcChgPct;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : TBRISTL_SVC_CHG_PCT
     * 
     */
    @JsonProperty("criteria.svcChgPct")
    public void setCriteriaSvcChgPct(Double criteriaSvcChgPct) {
        this.criteriaSvcChgPct = criteriaSvcChgPct;
    }

    public StudentInstallmentPlan100PutRequest withCriteriaSvcChgPct(Double criteriaSvcChgPct) {
        this.criteriaSvcChgPct = criteriaSvcChgPct;
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

    public StudentInstallmentPlan100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentInstallmentPlan100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaServCharge");
        sb.append('=');
        sb.append(((this.criteriaServCharge == null)?"<null>":this.criteriaServCharge));
        sb.append(',');
        sb.append("numberOfPayments");
        sb.append('=');
        sb.append(((this.numberOfPayments == null)?"<null>":this.numberOfPayments));
        sb.append(',');
        sb.append("criteriaFirstInstallDate");
        sb.append('=');
        sb.append(((this.criteriaFirstInstallDate == null)?"<null>":this.criteriaFirstInstallDate));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaRefNumber");
        sb.append('=');
        sb.append(((this.criteriaRefNumber == null)?"<null>":this.criteriaRefNumber));
        sb.append(',');
        sb.append("criteriaInstallmentPlan");
        sb.append('=');
        sb.append(((this.criteriaInstallmentPlan == null)?"<null>":this.criteriaInstallmentPlan));
        sb.append(',');
        sb.append("criteriaPayPeriod");
        sb.append('=');
        sb.append(((this.criteriaPayPeriod == null)?"<null>":this.criteriaPayPeriod));
        sb.append(',');
        sb.append("criteriaPlanAmount");
        sb.append('=');
        sb.append(((this.criteriaPlanAmount == null)?"<null>":this.criteriaPlanAmount));
        sb.append(',');
        sb.append("criteriaAutoCalcPlanInd");
        sb.append('=');
        sb.append(((this.criteriaAutoCalcPlanInd == null)?"<null>":this.criteriaAutoCalcPlanInd));
        sb.append(',');
        sb.append("criteriaNumberOfPayments");
        sb.append('=');
        sb.append(((this.criteriaNumberOfPayments == null)?"<null>":this.criteriaNumberOfPayments));
        sb.append(',');
        sb.append("autoCalcActiveInd");
        sb.append('=');
        sb.append(((this.autoCalcActiveInd == null)?"<null>":this.autoCalcActiveInd));
        sb.append(',');
        sb.append("criteriaAutoCalcActiveInd");
        sb.append('=');
        sb.append(((this.criteriaAutoCalcActiveInd == null)?"<null>":this.criteriaAutoCalcActiveInd));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaIntRate");
        sb.append('=');
        sb.append(((this.criteriaIntRate == null)?"<null>":this.criteriaIntRate));
        sb.append(',');
        sb.append("criteriaPlanDetailCode");
        sb.append('=');
        sb.append(((this.criteriaPlanDetailCode == null)?"<null>":this.criteriaPlanDetailCode));
        sb.append(',');
        sb.append("payPeriod");
        sb.append('=');
        sb.append(((this.payPeriod == null)?"<null>":this.payPeriod));
        sb.append(',');
        sb.append("criteriaPrinDetailCode");
        sb.append('=');
        sb.append(((this.criteriaPrinDetailCode == null)?"<null>":this.criteriaPrinDetailCode));
        sb.append(',');
        sb.append("firstInstallDate");
        sb.append('=');
        sb.append(((this.firstInstallDate == null)?"<null>":this.firstInstallDate));
        sb.append(',');
        sb.append("criteriaIntDetailCode");
        sb.append('=');
        sb.append(((this.criteriaIntDetailCode == null)?"<null>":this.criteriaIntDetailCode));
        sb.append(',');
        sb.append("criteriaServDetailCode");
        sb.append('=');
        sb.append(((this.criteriaServDetailCode == null)?"<null>":this.criteriaServDetailCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaSvcChgPct");
        sb.append('=');
        sb.append(((this.criteriaSvcChgPct == null)?"<null>":this.criteriaSvcChgPct));
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
        result = ((result* 31)+((this.criteriaIntDetailCode == null)? 0 :this.criteriaIntDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaIntRate == null)? 0 :this.criteriaIntRate.hashCode()));
        result = ((result* 31)+((this.criteriaAutoCalcPlanInd == null)? 0 :this.criteriaAutoCalcPlanInd.hashCode()));
        result = ((result* 31)+((this.criteriaPrinDetailCode == null)? 0 :this.criteriaPrinDetailCode.hashCode()));
        result = ((result* 31)+((this.autoCalcActiveInd == null)? 0 :this.autoCalcActiveInd.hashCode()));
        result = ((result* 31)+((this.criteriaPayPeriod == null)? 0 :this.criteriaPayPeriod.hashCode()));
        result = ((result* 31)+((this.criteriaRefNumber == null)? 0 :this.criteriaRefNumber.hashCode()));
        result = ((result* 31)+((this.criteriaSvcChgPct == null)? 0 :this.criteriaSvcChgPct.hashCode()));
        result = ((result* 31)+((this.payPeriod == null)? 0 :this.payPeriod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.numberOfPayments == null)? 0 :this.numberOfPayments.hashCode()));
        result = ((result* 31)+((this.criteriaPlanDetailCode == null)? 0 :this.criteriaPlanDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaServDetailCode == null)? 0 :this.criteriaServDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaFirstInstallDate == null)? 0 :this.criteriaFirstInstallDate.hashCode()));
        result = ((result* 31)+((this.criteriaAutoCalcActiveInd == null)? 0 :this.criteriaAutoCalcActiveInd.hashCode()));
        result = ((result* 31)+((this.criteriaServCharge == null)? 0 :this.criteriaServCharge.hashCode()));
        result = ((result* 31)+((this.criteriaInstallmentPlan == null)? 0 :this.criteriaInstallmentPlan.hashCode()));
        result = ((result* 31)+((this.firstInstallDate == null)? 0 :this.firstInstallDate.hashCode()));
        result = ((result* 31)+((this.criteriaNumberOfPayments == null)? 0 :this.criteriaNumberOfPayments.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.criteriaPlanAmount == null)? 0 :this.criteriaPlanAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentInstallmentPlan100PutRequest) == false) {
            return false;
        }
        StudentInstallmentPlan100PutRequest rhs = ((StudentInstallmentPlan100PutRequest) other);
        return (((((((((((((((((((((((((this.criteriaIntDetailCode == rhs.criteriaIntDetailCode)||((this.criteriaIntDetailCode!= null)&&this.criteriaIntDetailCode.equals(rhs.criteriaIntDetailCode)))&&((this.criteriaIntRate == rhs.criteriaIntRate)||((this.criteriaIntRate!= null)&&this.criteriaIntRate.equals(rhs.criteriaIntRate))))&&((this.criteriaAutoCalcPlanInd == rhs.criteriaAutoCalcPlanInd)||((this.criteriaAutoCalcPlanInd!= null)&&this.criteriaAutoCalcPlanInd.equals(rhs.criteriaAutoCalcPlanInd))))&&((this.criteriaPrinDetailCode == rhs.criteriaPrinDetailCode)||((this.criteriaPrinDetailCode!= null)&&this.criteriaPrinDetailCode.equals(rhs.criteriaPrinDetailCode))))&&((this.autoCalcActiveInd == rhs.autoCalcActiveInd)||((this.autoCalcActiveInd!= null)&&this.autoCalcActiveInd.equals(rhs.autoCalcActiveInd))))&&((this.criteriaPayPeriod == rhs.criteriaPayPeriod)||((this.criteriaPayPeriod!= null)&&this.criteriaPayPeriod.equals(rhs.criteriaPayPeriod))))&&((this.criteriaRefNumber == rhs.criteriaRefNumber)||((this.criteriaRefNumber!= null)&&this.criteriaRefNumber.equals(rhs.criteriaRefNumber))))&&((this.criteriaSvcChgPct == rhs.criteriaSvcChgPct)||((this.criteriaSvcChgPct!= null)&&this.criteriaSvcChgPct.equals(rhs.criteriaSvcChgPct))))&&((this.payPeriod == rhs.payPeriod)||((this.payPeriod!= null)&&this.payPeriod.equals(rhs.payPeriod))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.numberOfPayments == rhs.numberOfPayments)||((this.numberOfPayments!= null)&&this.numberOfPayments.equals(rhs.numberOfPayments))))&&((this.criteriaPlanDetailCode == rhs.criteriaPlanDetailCode)||((this.criteriaPlanDetailCode!= null)&&this.criteriaPlanDetailCode.equals(rhs.criteriaPlanDetailCode))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.criteriaServDetailCode == rhs.criteriaServDetailCode)||((this.criteriaServDetailCode!= null)&&this.criteriaServDetailCode.equals(rhs.criteriaServDetailCode))))&&((this.criteriaFirstInstallDate == rhs.criteriaFirstInstallDate)||((this.criteriaFirstInstallDate!= null)&&this.criteriaFirstInstallDate.equals(rhs.criteriaFirstInstallDate))))&&((this.criteriaAutoCalcActiveInd == rhs.criteriaAutoCalcActiveInd)||((this.criteriaAutoCalcActiveInd!= null)&&this.criteriaAutoCalcActiveInd.equals(rhs.criteriaAutoCalcActiveInd))))&&((this.criteriaServCharge == rhs.criteriaServCharge)||((this.criteriaServCharge!= null)&&this.criteriaServCharge.equals(rhs.criteriaServCharge))))&&((this.criteriaInstallmentPlan == rhs.criteriaInstallmentPlan)||((this.criteriaInstallmentPlan!= null)&&this.criteriaInstallmentPlan.equals(rhs.criteriaInstallmentPlan))))&&((this.firstInstallDate == rhs.firstInstallDate)||((this.firstInstallDate!= null)&&this.firstInstallDate.equals(rhs.firstInstallDate))))&&((this.criteriaNumberOfPayments == rhs.criteriaNumberOfPayments)||((this.criteriaNumberOfPayments!= null)&&this.criteriaNumberOfPayments.equals(rhs.criteriaNumberOfPayments))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.criteriaPlanAmount == rhs.criteriaPlanAmount)||((this.criteriaPlanAmount!= null)&&this.criteriaPlanAmount.equals(rhs.criteriaPlanAmount))));
    }

}
