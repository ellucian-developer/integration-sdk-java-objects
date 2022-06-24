
package com.ellucian.generated.bpapi.ban.benefit_or_deduction_mass_change_rule.v1_0_0;

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
    "optCode2",
    "refNo",
    "optCode3",
    "optCode1",
    "bdcaCode",
    "bcat_code",
    "optCode4",
    "optCode5",
    "userId",
    "selectStatus",
    "amount4",
    "activityDate",
    "amount3",
    "amount2",
    "amount1",
    "action",
    "changeStatus",
    "bdclCode",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class BenefitOrDeductionMassChangeRule100GetRequest {

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE2
     * 
     */
    @JsonProperty("optCode2")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE2")
    private String optCode2;
    /**
     * Reference
     * <p>
     * Lineage reference object : PTRBDMC_REF_NO
     * 
     */
    @JsonProperty("refNo")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_REF_NO")
    private String refNo;
    /**
     * Lineage reference object : PTRBDMC_OPT_CODE3
     * 
     */
    @JsonProperty("optCode3")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE3")
    private String optCode3;
    /**
     * Value
     * <p>
     * Lineage reference object : PTRBDMC_OPT_CODE1
     * 
     */
    @JsonProperty("optCode1")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE1")
    private String optCode1;
    /**
     * Benefit or Deduction Code
     * <p>
     * Lineage reference object : PTRBDMC_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_BDCA_CODE")
    private String bdcaCode;
    /**
     * Benefit Category
     * <p>
     * Lineage reference object : bcatCode, Lookup lineage reference object : ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("bcat_code")
    @JsonPropertyDescription("Lineage reference object : bcatCode, Lookup lineage reference object : ptrbcat")
    private String bcatCode;
    /**
     * Lineage reference object : PTRBDMC_OPT_CODE4
     * 
     */
    @JsonProperty("optCode4")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE4")
    private String optCode4;
    /**
     * Lineage reference object : PTRBDMC_OPT_CODE5
     * 
     */
    @JsonProperty("optCode5")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE5")
    private String optCode5;
    /**
     * User ID
     * <p>
     * Lineage reference object : PTRBDMC_USER_ID
     * (Required)
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_USER_ID")
    private String userId;
    /**
     * Select Status
     * <p>
     * Lineage reference object : PTRBDMC_SELECT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("selectStatus")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_SELECT_STATUS")
    private String selectStatus;
    @JsonProperty("amount4")
    private Double amount4;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDMC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_ACTIVITY_DATE")
    private Date activityDate;
    @JsonProperty("amount3")
    private Double amount3;
    @JsonProperty("amount2")
    private Double amount2;
    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("amount1")
    private Double amount1;
    /**
     * Action
     * <p>
     * Lineage reference object : PTRBDMC_ACTION
     * (Required)
     * 
     */
    @JsonProperty("action")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_ACTION")
    private String action;
    /**
     * Change Status
     * <p>
     * Lineage reference object : PTRBDMC_CHANGE_STATUS
     * (Required)
     * 
     */
    @JsonProperty("changeStatus")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_CHANGE_STATUS")
    private String changeStatus;
    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDMC_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_BDCL_CODE")
    private String bdclCode;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : PTRBDMC_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_EFFECTIVE_DATE")
    private Date effectiveDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE2
     * 
     */
    @JsonProperty("optCode2")
    public String getOptCode2() {
        return optCode2;
    }

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE2
     * 
     */
    @JsonProperty("optCode2")
    public void setOptCode2(String optCode2) {
        this.optCode2 = optCode2;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withOptCode2(String optCode2) {
        this.optCode2 = optCode2;
        return this;
    }

    /**
     * Reference
     * <p>
     * Lineage reference object : PTRBDMC_REF_NO
     * 
     */
    @JsonProperty("refNo")
    public String getRefNo() {
        return refNo;
    }

    /**
     * Reference
     * <p>
     * Lineage reference object : PTRBDMC_REF_NO
     * 
     */
    @JsonProperty("refNo")
    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withRefNo(String refNo) {
        this.refNo = refNo;
        return this;
    }

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE3
     * 
     */
    @JsonProperty("optCode3")
    public String getOptCode3() {
        return optCode3;
    }

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE3
     * 
     */
    @JsonProperty("optCode3")
    public void setOptCode3(String optCode3) {
        this.optCode3 = optCode3;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withOptCode3(String optCode3) {
        this.optCode3 = optCode3;
        return this;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : PTRBDMC_OPT_CODE1
     * 
     */
    @JsonProperty("optCode1")
    public String getOptCode1() {
        return optCode1;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : PTRBDMC_OPT_CODE1
     * 
     */
    @JsonProperty("optCode1")
    public void setOptCode1(String optCode1) {
        this.optCode1 = optCode1;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withOptCode1(String optCode1) {
        this.optCode1 = optCode1;
        return this;
    }

    /**
     * Benefit or Deduction Code
     * <p>
     * Lineage reference object : PTRBDMC_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefit or Deduction Code
     * <p>
     * Lineage reference object : PTRBDMC_BDCA_CODE
     * (Required)
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : bcatCode, Lookup lineage reference object : ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("bcat_code")
    public String getBcatCode() {
        return bcatCode;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : bcatCode, Lookup lineage reference object : ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("bcat_code")
    public void setBcatCode(String bcatCode) {
        this.bcatCode = bcatCode;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withBcatCode(String bcatCode) {
        this.bcatCode = bcatCode;
        return this;
    }

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE4
     * 
     */
    @JsonProperty("optCode4")
    public String getOptCode4() {
        return optCode4;
    }

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE4
     * 
     */
    @JsonProperty("optCode4")
    public void setOptCode4(String optCode4) {
        this.optCode4 = optCode4;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withOptCode4(String optCode4) {
        this.optCode4 = optCode4;
        return this;
    }

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE5
     * 
     */
    @JsonProperty("optCode5")
    public String getOptCode5() {
        return optCode5;
    }

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE5
     * 
     */
    @JsonProperty("optCode5")
    public void setOptCode5(String optCode5) {
        this.optCode5 = optCode5;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withOptCode5(String optCode5) {
        this.optCode5 = optCode5;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : PTRBDMC_USER_ID
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : PTRBDMC_USER_ID
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Select Status
     * <p>
     * Lineage reference object : PTRBDMC_SELECT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("selectStatus")
    public String getSelectStatus() {
        return selectStatus;
    }

    /**
     * Select Status
     * <p>
     * Lineage reference object : PTRBDMC_SELECT_STATUS
     * (Required)
     * 
     */
    @JsonProperty("selectStatus")
    public void setSelectStatus(String selectStatus) {
        this.selectStatus = selectStatus;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withSelectStatus(String selectStatus) {
        this.selectStatus = selectStatus;
        return this;
    }

    @JsonProperty("amount4")
    public Double getAmount4() {
        return amount4;
    }

    @JsonProperty("amount4")
    public void setAmount4(Double amount4) {
        this.amount4 = amount4;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withAmount4(Double amount4) {
        this.amount4 = amount4;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDMC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDMC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    @JsonProperty("amount3")
    public Double getAmount3() {
        return amount3;
    }

    @JsonProperty("amount3")
    public void setAmount3(Double amount3) {
        this.amount3 = amount3;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withAmount3(Double amount3) {
        this.amount3 = amount3;
        return this;
    }

    @JsonProperty("amount2")
    public Double getAmount2() {
        return amount2;
    }

    @JsonProperty("amount2")
    public void setAmount2(Double amount2) {
        this.amount2 = amount2;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withAmount2(Double amount2) {
        this.amount2 = amount2;
        return this;
    }

    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("amount1")
    public Double getAmount1() {
        return amount1;
    }

    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("amount1")
    public void setAmount1(Double amount1) {
        this.amount1 = amount1;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withAmount1(Double amount1) {
        this.amount1 = amount1;
        return this;
    }

    /**
     * Action
     * <p>
     * Lineage reference object : PTRBDMC_ACTION
     * (Required)
     * 
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * Action
     * <p>
     * Lineage reference object : PTRBDMC_ACTION
     * (Required)
     * 
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Change Status
     * <p>
     * Lineage reference object : PTRBDMC_CHANGE_STATUS
     * (Required)
     * 
     */
    @JsonProperty("changeStatus")
    public String getChangeStatus() {
        return changeStatus;
    }

    /**
     * Change Status
     * <p>
     * Lineage reference object : PTRBDMC_CHANGE_STATUS
     * (Required)
     * 
     */
    @JsonProperty("changeStatus")
    public void setChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }

    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDMC_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    public String getBdclCode() {
        return bdclCode;
    }

    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDMC_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    public void setBdclCode(String bdclCode) {
        this.bdclCode = bdclCode;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withBdclCode(String bdclCode) {
        this.bdclCode = bdclCode;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : PTRBDMC_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : PTRBDMC_EFFECTIVE_DATE
     * (Required)
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public BenefitOrDeductionMassChangeRule100GetRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public BenefitOrDeductionMassChangeRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitOrDeductionMassChangeRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("optCode2");
        sb.append('=');
        sb.append(((this.optCode2 == null)?"<null>":this.optCode2));
        sb.append(',');
        sb.append("refNo");
        sb.append('=');
        sb.append(((this.refNo == null)?"<null>":this.refNo));
        sb.append(',');
        sb.append("optCode3");
        sb.append('=');
        sb.append(((this.optCode3 == null)?"<null>":this.optCode3));
        sb.append(',');
        sb.append("optCode1");
        sb.append('=');
        sb.append(((this.optCode1 == null)?"<null>":this.optCode1));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("bcatCode");
        sb.append('=');
        sb.append(((this.bcatCode == null)?"<null>":this.bcatCode));
        sb.append(',');
        sb.append("optCode4");
        sb.append('=');
        sb.append(((this.optCode4 == null)?"<null>":this.optCode4));
        sb.append(',');
        sb.append("optCode5");
        sb.append('=');
        sb.append(((this.optCode5 == null)?"<null>":this.optCode5));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("selectStatus");
        sb.append('=');
        sb.append(((this.selectStatus == null)?"<null>":this.selectStatus));
        sb.append(',');
        sb.append("amount4");
        sb.append('=');
        sb.append(((this.amount4 == null)?"<null>":this.amount4));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("amount3");
        sb.append('=');
        sb.append(((this.amount3 == null)?"<null>":this.amount3));
        sb.append(',');
        sb.append("amount2");
        sb.append('=');
        sb.append(((this.amount2 == null)?"<null>":this.amount2));
        sb.append(',');
        sb.append("amount1");
        sb.append('=');
        sb.append(((this.amount1 == null)?"<null>":this.amount1));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("changeStatus");
        sb.append('=');
        sb.append(((this.changeStatus == null)?"<null>":this.changeStatus));
        sb.append(',');
        sb.append("bdclCode");
        sb.append('=');
        sb.append(((this.bdclCode == null)?"<null>":this.bdclCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.optCode2 == null)? 0 :this.optCode2 .hashCode()));
        result = ((result* 31)+((this.refNo == null)? 0 :this.refNo.hashCode()));
        result = ((result* 31)+((this.optCode3 == null)? 0 :this.optCode3 .hashCode()));
        result = ((result* 31)+((this.optCode1 == null)? 0 :this.optCode1 .hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.bcatCode == null)? 0 :this.bcatCode.hashCode()));
        result = ((result* 31)+((this.optCode4 == null)? 0 :this.optCode4 .hashCode()));
        result = ((result* 31)+((this.optCode5 == null)? 0 :this.optCode5 .hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.selectStatus == null)? 0 :this.selectStatus.hashCode()));
        result = ((result* 31)+((this.amount4 == null)? 0 :this.amount4 .hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.amount3 == null)? 0 :this.amount3 .hashCode()));
        result = ((result* 31)+((this.amount2 == null)? 0 :this.amount2 .hashCode()));
        result = ((result* 31)+((this.amount1 == null)? 0 :this.amount1 .hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.changeStatus == null)? 0 :this.changeStatus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.bdclCode == null)? 0 :this.bdclCode.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitOrDeductionMassChangeRule100GetRequest) == false) {
            return false;
        }
        BenefitOrDeductionMassChangeRule100GetRequest rhs = ((BenefitOrDeductionMassChangeRule100GetRequest) other);
        return (((((((((((((((((((((this.optCode2 == rhs.optCode2)||((this.optCode2 != null)&&this.optCode2 .equals(rhs.optCode2)))&&((this.refNo == rhs.refNo)||((this.refNo!= null)&&this.refNo.equals(rhs.refNo))))&&((this.optCode3 == rhs.optCode3)||((this.optCode3 != null)&&this.optCode3 .equals(rhs.optCode3))))&&((this.optCode1 == rhs.optCode1)||((this.optCode1 != null)&&this.optCode1 .equals(rhs.optCode1))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.bcatCode == rhs.bcatCode)||((this.bcatCode!= null)&&this.bcatCode.equals(rhs.bcatCode))))&&((this.optCode4 == rhs.optCode4)||((this.optCode4 != null)&&this.optCode4 .equals(rhs.optCode4))))&&((this.optCode5 == rhs.optCode5)||((this.optCode5 != null)&&this.optCode5 .equals(rhs.optCode5))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.selectStatus == rhs.selectStatus)||((this.selectStatus!= null)&&this.selectStatus.equals(rhs.selectStatus))))&&((this.amount4 == rhs.amount4)||((this.amount4 != null)&&this.amount4 .equals(rhs.amount4))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.amount3 == rhs.amount3)||((this.amount3 != null)&&this.amount3 .equals(rhs.amount3))))&&((this.amount2 == rhs.amount2)||((this.amount2 != null)&&this.amount2 .equals(rhs.amount2))))&&((this.amount1 == rhs.amount1)||((this.amount1 != null)&&this.amount1 .equals(rhs.amount1))))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this.changeStatus == rhs.changeStatus)||((this.changeStatus!= null)&&this.changeStatus.equals(rhs.changeStatus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.bdclCode == rhs.bdclCode)||((this.bdclCode!= null)&&this.bdclCode.equals(rhs.bdclCode))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
