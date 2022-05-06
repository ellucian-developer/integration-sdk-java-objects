
package com.ellucian.generated.bpapi.ban.installment_plans.v1_0_0;

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
    "installmentPlan",
    "desc",
    "planAmount",
    "paymentDueInd",
    "prinDetailCode",
    "prinDetailDesc",
    "numberOfPayments",
    "intDetailCode",
    "intDetailDesc",
    "payPeriod",
    "intRate",
    "firstInstallDate",
    "servDetailCode",
    "servDetailDesc",
    "planDetailCode",
    "planDetailDesc",
    "servCharge",
    "atypCode",
    "refNumber",
    "atypSeqno",
    "atypDesc",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class InstallmentPlans100QapiPost {

    @JsonProperty("id")
    private String id;
    /**
     * Installment Plan
     * <p>
     * Lineage reference object : TBRISTL_INSTALLMENT_PLAN
     * 
     */
    @JsonProperty("installmentPlan")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_INSTALLMENT_PLAN")
    private String installmentPlan;
    /**
     * Installment Plan Description
     * <p>
     * Lineage reference object : TBRISTL_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_DESC")
    private String desc;
    /**
     * Plan Amount
     * <p>
     * Lineage reference object : TBRISTL_PLAN_AMOUNT
     * 
     */
    @JsonProperty("planAmount")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PLAN_AMOUNT")
    private Double planAmount;
    /**
     * Installment Due
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentDueInd")
    private String paymentDueInd;
    /**
     * Principal Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PRIN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("prinDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PRIN_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String prinDetailCode;
    @JsonProperty("prinDetailDesc")
    private String prinDetailDesc;
    /**
     * Number of Payments
     * <p>
     * Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS
     * 
     */
    @JsonProperty("numberOfPayments")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS")
    private Double numberOfPayments;
    /**
     * Interest Detail Code
     * <p>
     * Lineage reference object : TBRISTL_INT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("intDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_INT_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String intDetailCode;
    @JsonProperty("intDetailDesc")
    private String intDetailDesc;
    /**
     * Pay Period
     * <p>
     * Lineage reference object : TBRISTL_PAY_PERIOD
     * 
     */
    @JsonProperty("payPeriod")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PAY_PERIOD")
    private Double payPeriod;
    /**
     * Interest Rate
     * <p>
     * Lineage reference object : TBRISTL_INT_RATE
     * 
     */
    @JsonProperty("intRate")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_INT_RATE")
    private Double intRate;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRISTL_FIRST_INSTALL_DATE
     * 
     */
    @JsonProperty("firstInstallDate")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_FIRST_INSTALL_DATE")
    private Date firstInstallDate;
    /**
     * Service Charge Detail Code
     * <p>
     * Lineage reference object : TBRISTL_SERV_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("servDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_SERV_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String servDetailCode;
    @JsonProperty("servDetailDesc")
    private String servDetailDesc;
    /**
     * Plan Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PLAN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("planDetailCode")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_PLAN_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String planDetailCode;
    @JsonProperty("planDetailDesc")
    private String planDetailDesc;
    /**
     * Service Charge
     * <p>
     * Lineage reference object : TBRISTL_SERV_CHARGE
     * 
     */
    @JsonProperty("servCharge")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_SERV_CHARGE")
    private Double servCharge;
    /**
     * Address Type
     * <p>
     * 
     * 
     */
    @JsonProperty("atypCode")
    private String atypCode;
    /**
     * Reference Number
     * <p>
     * Lineage reference object : TBRISTL_REF_NUMBER
     * 
     */
    @JsonProperty("refNumber")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_REF_NUMBER")
    private Double refNumber;
    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("atypSeqno")
    private Double atypSeqno;
    @JsonProperty("atypDesc")
    private String atypDesc;
    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRISTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TBRISTL_ACTIVITY_DATE")
    private Date activityDate;
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

    public InstallmentPlans100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Installment Plan
     * <p>
     * Lineage reference object : TBRISTL_INSTALLMENT_PLAN
     * 
     */
    @JsonProperty("installmentPlan")
    public String getInstallmentPlan() {
        return installmentPlan;
    }

    /**
     * Installment Plan
     * <p>
     * Lineage reference object : TBRISTL_INSTALLMENT_PLAN
     * 
     */
    @JsonProperty("installmentPlan")
    public void setInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    public InstallmentPlans100QapiPost withInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
        return this;
    }

    /**
     * Installment Plan Description
     * <p>
     * Lineage reference object : TBRISTL_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Installment Plan Description
     * <p>
     * Lineage reference object : TBRISTL_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public InstallmentPlans100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Plan Amount
     * <p>
     * Lineage reference object : TBRISTL_PLAN_AMOUNT
     * 
     */
    @JsonProperty("planAmount")
    public Double getPlanAmount() {
        return planAmount;
    }

    /**
     * Plan Amount
     * <p>
     * Lineage reference object : TBRISTL_PLAN_AMOUNT
     * 
     */
    @JsonProperty("planAmount")
    public void setPlanAmount(Double planAmount) {
        this.planAmount = planAmount;
    }

    public InstallmentPlans100QapiPost withPlanAmount(Double planAmount) {
        this.planAmount = planAmount;
        return this;
    }

    /**
     * Installment Due
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentDueInd")
    public String getPaymentDueInd() {
        return paymentDueInd;
    }

    /**
     * Installment Due
     * <p>
     * 
     * 
     */
    @JsonProperty("paymentDueInd")
    public void setPaymentDueInd(String paymentDueInd) {
        this.paymentDueInd = paymentDueInd;
    }

    public InstallmentPlans100QapiPost withPaymentDueInd(String paymentDueInd) {
        this.paymentDueInd = paymentDueInd;
        return this;
    }

    /**
     * Principal Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PRIN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("prinDetailCode")
    public String getPrinDetailCode() {
        return prinDetailCode;
    }

    /**
     * Principal Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PRIN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("prinDetailCode")
    public void setPrinDetailCode(String prinDetailCode) {
        this.prinDetailCode = prinDetailCode;
    }

    public InstallmentPlans100QapiPost withPrinDetailCode(String prinDetailCode) {
        this.prinDetailCode = prinDetailCode;
        return this;
    }

    @JsonProperty("prinDetailDesc")
    public String getPrinDetailDesc() {
        return prinDetailDesc;
    }

    @JsonProperty("prinDetailDesc")
    public void setPrinDetailDesc(String prinDetailDesc) {
        this.prinDetailDesc = prinDetailDesc;
    }

    public InstallmentPlans100QapiPost withPrinDetailDesc(String prinDetailDesc) {
        this.prinDetailDesc = prinDetailDesc;
        return this;
    }

    /**
     * Number of Payments
     * <p>
     * Lineage reference object : TBRISTL_NUMBER_OF_PAYMENTS
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
     * 
     */
    @JsonProperty("numberOfPayments")
    public void setNumberOfPayments(Double numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public InstallmentPlans100QapiPost withNumberOfPayments(Double numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
        return this;
    }

    /**
     * Interest Detail Code
     * <p>
     * Lineage reference object : TBRISTL_INT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("intDetailCode")
    public String getIntDetailCode() {
        return intDetailCode;
    }

    /**
     * Interest Detail Code
     * <p>
     * Lineage reference object : TBRISTL_INT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("intDetailCode")
    public void setIntDetailCode(String intDetailCode) {
        this.intDetailCode = intDetailCode;
    }

    public InstallmentPlans100QapiPost withIntDetailCode(String intDetailCode) {
        this.intDetailCode = intDetailCode;
        return this;
    }

    @JsonProperty("intDetailDesc")
    public String getIntDetailDesc() {
        return intDetailDesc;
    }

    @JsonProperty("intDetailDesc")
    public void setIntDetailDesc(String intDetailDesc) {
        this.intDetailDesc = intDetailDesc;
    }

    public InstallmentPlans100QapiPost withIntDetailDesc(String intDetailDesc) {
        this.intDetailDesc = intDetailDesc;
        return this;
    }

    /**
     * Pay Period
     * <p>
     * Lineage reference object : TBRISTL_PAY_PERIOD
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
     * 
     */
    @JsonProperty("payPeriod")
    public void setPayPeriod(Double payPeriod) {
        this.payPeriod = payPeriod;
    }

    public InstallmentPlans100QapiPost withPayPeriod(Double payPeriod) {
        this.payPeriod = payPeriod;
        return this;
    }

    /**
     * Interest Rate
     * <p>
     * Lineage reference object : TBRISTL_INT_RATE
     * 
     */
    @JsonProperty("intRate")
    public Double getIntRate() {
        return intRate;
    }

    /**
     * Interest Rate
     * <p>
     * Lineage reference object : TBRISTL_INT_RATE
     * 
     */
    @JsonProperty("intRate")
    public void setIntRate(Double intRate) {
        this.intRate = intRate;
    }

    public InstallmentPlans100QapiPost withIntRate(Double intRate) {
        this.intRate = intRate;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : TBRISTL_FIRST_INSTALL_DATE
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
     * 
     */
    @JsonProperty("firstInstallDate")
    public void setFirstInstallDate(Date firstInstallDate) {
        this.firstInstallDate = firstInstallDate;
    }

    public InstallmentPlans100QapiPost withFirstInstallDate(Date firstInstallDate) {
        this.firstInstallDate = firstInstallDate;
        return this;
    }

    /**
     * Service Charge Detail Code
     * <p>
     * Lineage reference object : TBRISTL_SERV_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("servDetailCode")
    public String getServDetailCode() {
        return servDetailCode;
    }

    /**
     * Service Charge Detail Code
     * <p>
     * Lineage reference object : TBRISTL_SERV_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("servDetailCode")
    public void setServDetailCode(String servDetailCode) {
        this.servDetailCode = servDetailCode;
    }

    public InstallmentPlans100QapiPost withServDetailCode(String servDetailCode) {
        this.servDetailCode = servDetailCode;
        return this;
    }

    @JsonProperty("servDetailDesc")
    public String getServDetailDesc() {
        return servDetailDesc;
    }

    @JsonProperty("servDetailDesc")
    public void setServDetailDesc(String servDetailDesc) {
        this.servDetailDesc = servDetailDesc;
    }

    public InstallmentPlans100QapiPost withServDetailDesc(String servDetailDesc) {
        this.servDetailDesc = servDetailDesc;
        return this;
    }

    /**
     * Plan Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PLAN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("planDetailCode")
    public String getPlanDetailCode() {
        return planDetailCode;
    }

    /**
     * Plan Detail Code
     * <p>
     * Lineage reference object : TBRISTL_PLAN_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * 
     */
    @JsonProperty("planDetailCode")
    public void setPlanDetailCode(String planDetailCode) {
        this.planDetailCode = planDetailCode;
    }

    public InstallmentPlans100QapiPost withPlanDetailCode(String planDetailCode) {
        this.planDetailCode = planDetailCode;
        return this;
    }

    @JsonProperty("planDetailDesc")
    public String getPlanDetailDesc() {
        return planDetailDesc;
    }

    @JsonProperty("planDetailDesc")
    public void setPlanDetailDesc(String planDetailDesc) {
        this.planDetailDesc = planDetailDesc;
    }

    public InstallmentPlans100QapiPost withPlanDetailDesc(String planDetailDesc) {
        this.planDetailDesc = planDetailDesc;
        return this;
    }

    /**
     * Service Charge
     * <p>
     * Lineage reference object : TBRISTL_SERV_CHARGE
     * 
     */
    @JsonProperty("servCharge")
    public Double getServCharge() {
        return servCharge;
    }

    /**
     * Service Charge
     * <p>
     * Lineage reference object : TBRISTL_SERV_CHARGE
     * 
     */
    @JsonProperty("servCharge")
    public void setServCharge(Double servCharge) {
        this.servCharge = servCharge;
    }

    public InstallmentPlans100QapiPost withServCharge(Double servCharge) {
        this.servCharge = servCharge;
        return this;
    }

    /**
     * Address Type
     * <p>
     * 
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * 
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public InstallmentPlans100QapiPost withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : TBRISTL_REF_NUMBER
     * 
     */
    @JsonProperty("refNumber")
    public Double getRefNumber() {
        return refNumber;
    }

    /**
     * Reference Number
     * <p>
     * Lineage reference object : TBRISTL_REF_NUMBER
     * 
     */
    @JsonProperty("refNumber")
    public void setRefNumber(Double refNumber) {
        this.refNumber = refNumber;
    }

    public InstallmentPlans100QapiPost withRefNumber(Double refNumber) {
        this.refNumber = refNumber;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("atypSeqno")
    public Double getAtypSeqno() {
        return atypSeqno;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("atypSeqno")
    public void setAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
    }

    public InstallmentPlans100QapiPost withAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
        return this;
    }

    @JsonProperty("atypDesc")
    public String getAtypDesc() {
        return atypDesc;
    }

    @JsonProperty("atypDesc")
    public void setAtypDesc(String atypDesc) {
        this.atypDesc = atypDesc;
    }

    public InstallmentPlans100QapiPost withAtypDesc(String atypDesc) {
        this.atypDesc = atypDesc;
        return this;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRISTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Entry Date
     * <p>
     * Lineage reference object : TBRISTL_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public InstallmentPlans100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public InstallmentPlans100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstallmentPlans100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("installmentPlan");
        sb.append('=');
        sb.append(((this.installmentPlan == null)?"<null>":this.installmentPlan));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("planAmount");
        sb.append('=');
        sb.append(((this.planAmount == null)?"<null>":this.planAmount));
        sb.append(',');
        sb.append("paymentDueInd");
        sb.append('=');
        sb.append(((this.paymentDueInd == null)?"<null>":this.paymentDueInd));
        sb.append(',');
        sb.append("prinDetailCode");
        sb.append('=');
        sb.append(((this.prinDetailCode == null)?"<null>":this.prinDetailCode));
        sb.append(',');
        sb.append("prinDetailDesc");
        sb.append('=');
        sb.append(((this.prinDetailDesc == null)?"<null>":this.prinDetailDesc));
        sb.append(',');
        sb.append("numberOfPayments");
        sb.append('=');
        sb.append(((this.numberOfPayments == null)?"<null>":this.numberOfPayments));
        sb.append(',');
        sb.append("intDetailCode");
        sb.append('=');
        sb.append(((this.intDetailCode == null)?"<null>":this.intDetailCode));
        sb.append(',');
        sb.append("intDetailDesc");
        sb.append('=');
        sb.append(((this.intDetailDesc == null)?"<null>":this.intDetailDesc));
        sb.append(',');
        sb.append("payPeriod");
        sb.append('=');
        sb.append(((this.payPeriod == null)?"<null>":this.payPeriod));
        sb.append(',');
        sb.append("intRate");
        sb.append('=');
        sb.append(((this.intRate == null)?"<null>":this.intRate));
        sb.append(',');
        sb.append("firstInstallDate");
        sb.append('=');
        sb.append(((this.firstInstallDate == null)?"<null>":this.firstInstallDate));
        sb.append(',');
        sb.append("servDetailCode");
        sb.append('=');
        sb.append(((this.servDetailCode == null)?"<null>":this.servDetailCode));
        sb.append(',');
        sb.append("servDetailDesc");
        sb.append('=');
        sb.append(((this.servDetailDesc == null)?"<null>":this.servDetailDesc));
        sb.append(',');
        sb.append("planDetailCode");
        sb.append('=');
        sb.append(((this.planDetailCode == null)?"<null>":this.planDetailCode));
        sb.append(',');
        sb.append("planDetailDesc");
        sb.append('=');
        sb.append(((this.planDetailDesc == null)?"<null>":this.planDetailDesc));
        sb.append(',');
        sb.append("servCharge");
        sb.append('=');
        sb.append(((this.servCharge == null)?"<null>":this.servCharge));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("refNumber");
        sb.append('=');
        sb.append(((this.refNumber == null)?"<null>":this.refNumber));
        sb.append(',');
        sb.append("atypSeqno");
        sb.append('=');
        sb.append(((this.atypSeqno == null)?"<null>":this.atypSeqno));
        sb.append(',');
        sb.append("atypDesc");
        sb.append('=');
        sb.append(((this.atypDesc == null)?"<null>":this.atypDesc));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.prinDetailDesc == null)? 0 :this.prinDetailDesc.hashCode()));
        result = ((result* 31)+((this.intRate == null)? 0 :this.intRate.hashCode()));
        result = ((result* 31)+((this.servDetailCode == null)? 0 :this.servDetailCode.hashCode()));
        result = ((result* 31)+((this.paymentDueInd == null)? 0 :this.paymentDueInd.hashCode()));
        result = ((result* 31)+((this.planDetailCode == null)? 0 :this.planDetailCode.hashCode()));
        result = ((result* 31)+((this.atypDesc == null)? 0 :this.atypDesc.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.intDetailCode == null)? 0 :this.intDetailCode.hashCode()));
        result = ((result* 31)+((this.payPeriod == null)? 0 :this.payPeriod.hashCode()));
        result = ((result* 31)+((this.installmentPlan == null)? 0 :this.installmentPlan.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        result = ((result* 31)+((this.numberOfPayments == null)? 0 :this.numberOfPayments.hashCode()));
        result = ((result* 31)+((this.planDetailDesc == null)? 0 :this.planDetailDesc.hashCode()));
        result = ((result* 31)+((this.servDetailDesc == null)? 0 :this.servDetailDesc.hashCode()));
        result = ((result* 31)+((this.intDetailDesc == null)? 0 :this.intDetailDesc.hashCode()));
        result = ((result* 31)+((this.prinDetailCode == null)? 0 :this.prinDetailCode.hashCode()));
        result = ((result* 31)+((this.servCharge == null)? 0 :this.servCharge.hashCode()));
        result = ((result* 31)+((this.refNumber == null)? 0 :this.refNumber.hashCode()));
        result = ((result* 31)+((this.firstInstallDate == null)? 0 :this.firstInstallDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.planAmount == null)? 0 :this.planAmount.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstallmentPlans100QapiPost) == false) {
            return false;
        }
        InstallmentPlans100QapiPost rhs = ((InstallmentPlans100QapiPost) other);
        return (((((((((((((((((((((((((this.prinDetailDesc == rhs.prinDetailDesc)||((this.prinDetailDesc!= null)&&this.prinDetailDesc.equals(rhs.prinDetailDesc)))&&((this.intRate == rhs.intRate)||((this.intRate!= null)&&this.intRate.equals(rhs.intRate))))&&((this.servDetailCode == rhs.servDetailCode)||((this.servDetailCode!= null)&&this.servDetailCode.equals(rhs.servDetailCode))))&&((this.paymentDueInd == rhs.paymentDueInd)||((this.paymentDueInd!= null)&&this.paymentDueInd.equals(rhs.paymentDueInd))))&&((this.planDetailCode == rhs.planDetailCode)||((this.planDetailCode!= null)&&this.planDetailCode.equals(rhs.planDetailCode))))&&((this.atypDesc == rhs.atypDesc)||((this.atypDesc!= null)&&this.atypDesc.equals(rhs.atypDesc))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.intDetailCode == rhs.intDetailCode)||((this.intDetailCode!= null)&&this.intDetailCode.equals(rhs.intDetailCode))))&&((this.payPeriod == rhs.payPeriod)||((this.payPeriod!= null)&&this.payPeriod.equals(rhs.payPeriod))))&&((this.installmentPlan == rhs.installmentPlan)||((this.installmentPlan!= null)&&this.installmentPlan.equals(rhs.installmentPlan))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.numberOfPayments == rhs.numberOfPayments)||((this.numberOfPayments!= null)&&this.numberOfPayments.equals(rhs.numberOfPayments))))&&((this.planDetailDesc == rhs.planDetailDesc)||((this.planDetailDesc!= null)&&this.planDetailDesc.equals(rhs.planDetailDesc))))&&((this.servDetailDesc == rhs.servDetailDesc)||((this.servDetailDesc!= null)&&this.servDetailDesc.equals(rhs.servDetailDesc))))&&((this.intDetailDesc == rhs.intDetailDesc)||((this.intDetailDesc!= null)&&this.intDetailDesc.equals(rhs.intDetailDesc))))&&((this.prinDetailCode == rhs.prinDetailCode)||((this.prinDetailCode!= null)&&this.prinDetailCode.equals(rhs.prinDetailCode))))&&((this.servCharge == rhs.servCharge)||((this.servCharge!= null)&&this.servCharge.equals(rhs.servCharge))))&&((this.refNumber == rhs.refNumber)||((this.refNumber!= null)&&this.refNumber.equals(rhs.refNumber))))&&((this.firstInstallDate == rhs.firstInstallDate)||((this.firstInstallDate!= null)&&this.firstInstallDate.equals(rhs.firstInstallDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.planAmount == rhs.planAmount)||((this.planAmount!= null)&&this.planAmount.equals(rhs.planAmount))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
