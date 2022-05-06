
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
    "replCodeDesc",
    "ptrbdcaAmt3Title",
    "optCode3",
    "refNo",
    "optCode1",
    "ptrbdcaOption2Title",
    "optCode4",
    "replBdcaCode",
    "optCode5",
    "ptrbdcaOption5Title",
    "amount4",
    "calcRuleDisplay",
    "activityDate",
    "selectStatus",
    "amount3",
    "entryValue8",
    "amount2",
    "entryValue7",
    "ptrbdcaAmt1Title",
    "amount1",
    "entryValue9",
    "bdcaDesc",
    "entryValue4",
    "entryValue3",
    "action",
    "bdclCodeDesc",
    "entryValue6",
    "entryValue5",
    "bdclCode",
    "entryValue2",
    "entryValue1",
    "bdcaCode",
    "ptrbdcaAmt2Title",
    "ptrbdcaOption3Title",
    "ptrbdcaAmt4Title",
    "userId",
    "ptrbdcaOption4Title",
    "changeStatus",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class BenefitOrDeductionMassChangeRule100GetResponse {

    /**
     * Lineage reference object : PTRBDMC_OPT_CODE2
     * 
     */
    @JsonProperty("optCode2")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE2")
    private String optCode2;
    @JsonProperty("replCodeDesc")
    private String replCodeDesc;
    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt3Title")
    private String ptrbdcaAmt3Title;
    /**
     * Lineage reference object : PTRBDMC_OPT_CODE3
     * 
     */
    @JsonProperty("optCode3")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE3")
    private String optCode3;
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
     * Value
     * <p>
     * Lineage reference object : PTRBDMC_OPT_CODE1
     * 
     */
    @JsonProperty("optCode1")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE1")
    private String optCode1;
    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption2Title")
    private String ptrbdcaOption2Title;
    /**
     * Lineage reference object : PTRBDMC_OPT_CODE4
     * 
     */
    @JsonProperty("optCode4")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE4")
    private String optCode4;
    /**
     * Replacement Core
     * <p>
     * Lineage reference object : PTRBDMC_REPL_BDCA_CODE
     * 
     */
    @JsonProperty("replBdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_REPL_BDCA_CODE")
    private String replBdcaCode;
    /**
     * Lineage reference object : PTRBDMC_OPT_CODE5
     * 
     */
    @JsonProperty("optCode5")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_OPT_CODE5")
    private String optCode5;
    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption5Title")
    private String ptrbdcaOption5Title;
    @JsonProperty("amount4")
    private Double amount4;
    @JsonProperty("calcRuleDisplay")
    private String calcRuleDisplay;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRBDMC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_ACTIVITY_DATE")
    private Date activityDate;
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
    @JsonProperty("amount3")
    private Double amount3;
    @JsonProperty("entryValue8")
    private String entryValue8;
    @JsonProperty("amount2")
    private Double amount2;
    @JsonProperty("entryValue7")
    private String entryValue7;
    /**
     *  1
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt1Title")
    private String ptrbdcaAmt1Title;
    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("amount1")
    private Double amount1;
    @JsonProperty("entryValue9")
    private String entryValue9;
    @JsonProperty("bdcaDesc")
    private String bdcaDesc;
    @JsonProperty("entryValue4")
    private String entryValue4;
    @JsonProperty("entryValue3")
    private String entryValue3;
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
    @JsonProperty("bdclCodeDesc")
    private String bdclCodeDesc;
    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue6")
    private String entryValue6;
    @JsonProperty("entryValue5")
    private String entryValue5;
    /**
     * Combined Limit Rule Code
     * <p>
     * Lineage reference object : PTRBDMC_BDCL_CODE
     * 
     */
    @JsonProperty("bdclCode")
    @JsonPropertyDescription("Lineage reference object : PTRBDMC_BDCL_CODE")
    private String bdclCode;
    @JsonProperty("entryValue2")
    private String entryValue2;
    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue1")
    private String entryValue1;
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
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt2Title")
    private String ptrbdcaAmt2Title;
    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption3Title")
    private String ptrbdcaOption3Title;
    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt4Title")
    private String ptrbdcaAmt4Title;
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
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption4Title")
    private String ptrbdcaOption4Title;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withOptCode2(String optCode2) {
        this.optCode2 = optCode2;
        return this;
    }

    @JsonProperty("replCodeDesc")
    public String getReplCodeDesc() {
        return replCodeDesc;
    }

    @JsonProperty("replCodeDesc")
    public void setReplCodeDesc(String replCodeDesc) {
        this.replCodeDesc = replCodeDesc;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withReplCodeDesc(String replCodeDesc) {
        this.replCodeDesc = replCodeDesc;
        return this;
    }

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt3Title")
    public String getPtrbdcaAmt3Title() {
        return ptrbdcaAmt3Title;
    }

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt3Title")
    public void setPtrbdcaAmt3Title(String ptrbdcaAmt3Title) {
        this.ptrbdcaAmt3Title = ptrbdcaAmt3Title;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withPtrbdcaAmt3Title(String ptrbdcaAmt3Title) {
        this.ptrbdcaAmt3Title = ptrbdcaAmt3Title;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withOptCode3(String optCode3) {
        this.optCode3 = optCode3;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withRefNo(String refNo) {
        this.refNo = refNo;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withOptCode1(String optCode1) {
        this.optCode1 = optCode1;
        return this;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption2Title")
    public String getPtrbdcaOption2Title() {
        return ptrbdcaOption2Title;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption2Title")
    public void setPtrbdcaOption2Title(String ptrbdcaOption2Title) {
        this.ptrbdcaOption2Title = ptrbdcaOption2Title;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withPtrbdcaOption2Title(String ptrbdcaOption2Title) {
        this.ptrbdcaOption2Title = ptrbdcaOption2Title;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withOptCode4(String optCode4) {
        this.optCode4 = optCode4;
        return this;
    }

    /**
     * Replacement Core
     * <p>
     * Lineage reference object : PTRBDMC_REPL_BDCA_CODE
     * 
     */
    @JsonProperty("replBdcaCode")
    public String getReplBdcaCode() {
        return replBdcaCode;
    }

    /**
     * Replacement Core
     * <p>
     * Lineage reference object : PTRBDMC_REPL_BDCA_CODE
     * 
     */
    @JsonProperty("replBdcaCode")
    public void setReplBdcaCode(String replBdcaCode) {
        this.replBdcaCode = replBdcaCode;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withReplBdcaCode(String replBdcaCode) {
        this.replBdcaCode = replBdcaCode;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withOptCode5(String optCode5) {
        this.optCode5 = optCode5;
        return this;
    }

    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption5Title")
    public String getPtrbdcaOption5Title() {
        return ptrbdcaOption5Title;
    }

    /**
     *  5
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption5Title")
    public void setPtrbdcaOption5Title(String ptrbdcaOption5Title) {
        this.ptrbdcaOption5Title = ptrbdcaOption5Title;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withPtrbdcaOption5Title(String ptrbdcaOption5Title) {
        this.ptrbdcaOption5Title = ptrbdcaOption5Title;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withAmount4(Double amount4) {
        this.amount4 = amount4;
        return this;
    }

    @JsonProperty("calcRuleDisplay")
    public String getCalcRuleDisplay() {
        return calcRuleDisplay;
    }

    @JsonProperty("calcRuleDisplay")
    public void setCalcRuleDisplay(String calcRuleDisplay) {
        this.calcRuleDisplay = calcRuleDisplay;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withCalcRuleDisplay(String calcRuleDisplay) {
        this.calcRuleDisplay = calcRuleDisplay;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withSelectStatus(String selectStatus) {
        this.selectStatus = selectStatus;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withAmount3(Double amount3) {
        this.amount3 = amount3;
        return this;
    }

    @JsonProperty("entryValue8")
    public String getEntryValue8() {
        return entryValue8;
    }

    @JsonProperty("entryValue8")
    public void setEntryValue8(String entryValue8) {
        this.entryValue8 = entryValue8;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withEntryValue8(String entryValue8) {
        this.entryValue8 = entryValue8;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withAmount2(Double amount2) {
        this.amount2 = amount2;
        return this;
    }

    @JsonProperty("entryValue7")
    public String getEntryValue7() {
        return entryValue7;
    }

    @JsonProperty("entryValue7")
    public void setEntryValue7(String entryValue7) {
        this.entryValue7 = entryValue7;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withEntryValue7(String entryValue7) {
        this.entryValue7 = entryValue7;
        return this;
    }

    /**
     *  1
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt1Title")
    public String getPtrbdcaAmt1Title() {
        return ptrbdcaAmt1Title;
    }

    /**
     *  1
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt1Title")
    public void setPtrbdcaAmt1Title(String ptrbdcaAmt1Title) {
        this.ptrbdcaAmt1Title = ptrbdcaAmt1Title;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withPtrbdcaAmt1Title(String ptrbdcaAmt1Title) {
        this.ptrbdcaAmt1Title = ptrbdcaAmt1Title;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withAmount1(Double amount1) {
        this.amount1 = amount1;
        return this;
    }

    @JsonProperty("entryValue9")
    public String getEntryValue9() {
        return entryValue9;
    }

    @JsonProperty("entryValue9")
    public void setEntryValue9(String entryValue9) {
        this.entryValue9 = entryValue9;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withEntryValue9(String entryValue9) {
        this.entryValue9 = entryValue9;
        return this;
    }

    @JsonProperty("bdcaDesc")
    public String getBdcaDesc() {
        return bdcaDesc;
    }

    @JsonProperty("bdcaDesc")
    public void setBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
        return this;
    }

    @JsonProperty("entryValue4")
    public String getEntryValue4() {
        return entryValue4;
    }

    @JsonProperty("entryValue4")
    public void setEntryValue4(String entryValue4) {
        this.entryValue4 = entryValue4;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withEntryValue4(String entryValue4) {
        this.entryValue4 = entryValue4;
        return this;
    }

    @JsonProperty("entryValue3")
    public String getEntryValue3() {
        return entryValue3;
    }

    @JsonProperty("entryValue3")
    public void setEntryValue3(String entryValue3) {
        this.entryValue3 = entryValue3;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withEntryValue3(String entryValue3) {
        this.entryValue3 = entryValue3;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withAction(String action) {
        this.action = action;
        return this;
    }

    @JsonProperty("bdclCodeDesc")
    public String getBdclCodeDesc() {
        return bdclCodeDesc;
    }

    @JsonProperty("bdclCodeDesc")
    public void setBdclCodeDesc(String bdclCodeDesc) {
        this.bdclCodeDesc = bdclCodeDesc;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withBdclCodeDesc(String bdclCodeDesc) {
        this.bdclCodeDesc = bdclCodeDesc;
        return this;
    }

    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue6")
    public String getEntryValue6() {
        return entryValue6;
    }

    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue6")
    public void setEntryValue6(String entryValue6) {
        this.entryValue6 = entryValue6;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withEntryValue6(String entryValue6) {
        this.entryValue6 = entryValue6;
        return this;
    }

    @JsonProperty("entryValue5")
    public String getEntryValue5() {
        return entryValue5;
    }

    @JsonProperty("entryValue5")
    public void setEntryValue5(String entryValue5) {
        this.entryValue5 = entryValue5;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withEntryValue5(String entryValue5) {
        this.entryValue5 = entryValue5;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withBdclCode(String bdclCode) {
        this.bdclCode = bdclCode;
        return this;
    }

    @JsonProperty("entryValue2")
    public String getEntryValue2() {
        return entryValue2;
    }

    @JsonProperty("entryValue2")
    public void setEntryValue2(String entryValue2) {
        this.entryValue2 = entryValue2;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withEntryValue2(String entryValue2) {
        this.entryValue2 = entryValue2;
        return this;
    }

    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue1")
    public String getEntryValue1() {
        return entryValue1;
    }

    /**
     * Entry
     * <p>
     * 
     * 
     */
    @JsonProperty("entryValue1")
    public void setEntryValue1(String entryValue1) {
        this.entryValue1 = entryValue1;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withEntryValue1(String entryValue1) {
        this.entryValue1 = entryValue1;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt2Title")
    public String getPtrbdcaAmt2Title() {
        return ptrbdcaAmt2Title;
    }

    /**
     *  2
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt2Title")
    public void setPtrbdcaAmt2Title(String ptrbdcaAmt2Title) {
        this.ptrbdcaAmt2Title = ptrbdcaAmt2Title;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withPtrbdcaAmt2Title(String ptrbdcaAmt2Title) {
        this.ptrbdcaAmt2Title = ptrbdcaAmt2Title;
        return this;
    }

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption3Title")
    public String getPtrbdcaOption3Title() {
        return ptrbdcaOption3Title;
    }

    /**
     *  3
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption3Title")
    public void setPtrbdcaOption3Title(String ptrbdcaOption3Title) {
        this.ptrbdcaOption3Title = ptrbdcaOption3Title;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withPtrbdcaOption3Title(String ptrbdcaOption3Title) {
        this.ptrbdcaOption3Title = ptrbdcaOption3Title;
        return this;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt4Title")
    public String getPtrbdcaAmt4Title() {
        return ptrbdcaAmt4Title;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaAmt4Title")
    public void setPtrbdcaAmt4Title(String ptrbdcaAmt4Title) {
        this.ptrbdcaAmt4Title = ptrbdcaAmt4Title;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withPtrbdcaAmt4Title(String ptrbdcaAmt4Title) {
        this.ptrbdcaAmt4Title = ptrbdcaAmt4Title;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption4Title")
    public String getPtrbdcaOption4Title() {
        return ptrbdcaOption4Title;
    }

    /**
     *  4
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrbdcaOption4Title")
    public void setPtrbdcaOption4Title(String ptrbdcaOption4Title) {
        this.ptrbdcaOption4Title = ptrbdcaOption4Title;
    }

    public BenefitOrDeductionMassChangeRule100GetResponse withPtrbdcaOption4Title(String ptrbdcaOption4Title) {
        this.ptrbdcaOption4Title = ptrbdcaOption4Title;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
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

    public BenefitOrDeductionMassChangeRule100GetResponse withEffectiveDate(Date effectiveDate) {
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

    public BenefitOrDeductionMassChangeRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BenefitOrDeductionMassChangeRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("optCode2");
        sb.append('=');
        sb.append(((this.optCode2 == null)?"<null>":this.optCode2));
        sb.append(',');
        sb.append("replCodeDesc");
        sb.append('=');
        sb.append(((this.replCodeDesc == null)?"<null>":this.replCodeDesc));
        sb.append(',');
        sb.append("ptrbdcaAmt3Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt3Title == null)?"<null>":this.ptrbdcaAmt3Title));
        sb.append(',');
        sb.append("optCode3");
        sb.append('=');
        sb.append(((this.optCode3 == null)?"<null>":this.optCode3));
        sb.append(',');
        sb.append("refNo");
        sb.append('=');
        sb.append(((this.refNo == null)?"<null>":this.refNo));
        sb.append(',');
        sb.append("optCode1");
        sb.append('=');
        sb.append(((this.optCode1 == null)?"<null>":this.optCode1));
        sb.append(',');
        sb.append("ptrbdcaOption2Title");
        sb.append('=');
        sb.append(((this.ptrbdcaOption2Title == null)?"<null>":this.ptrbdcaOption2Title));
        sb.append(',');
        sb.append("optCode4");
        sb.append('=');
        sb.append(((this.optCode4 == null)?"<null>":this.optCode4));
        sb.append(',');
        sb.append("replBdcaCode");
        sb.append('=');
        sb.append(((this.replBdcaCode == null)?"<null>":this.replBdcaCode));
        sb.append(',');
        sb.append("optCode5");
        sb.append('=');
        sb.append(((this.optCode5 == null)?"<null>":this.optCode5));
        sb.append(',');
        sb.append("ptrbdcaOption5Title");
        sb.append('=');
        sb.append(((this.ptrbdcaOption5Title == null)?"<null>":this.ptrbdcaOption5Title));
        sb.append(',');
        sb.append("amount4");
        sb.append('=');
        sb.append(((this.amount4 == null)?"<null>":this.amount4));
        sb.append(',');
        sb.append("calcRuleDisplay");
        sb.append('=');
        sb.append(((this.calcRuleDisplay == null)?"<null>":this.calcRuleDisplay));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("selectStatus");
        sb.append('=');
        sb.append(((this.selectStatus == null)?"<null>":this.selectStatus));
        sb.append(',');
        sb.append("amount3");
        sb.append('=');
        sb.append(((this.amount3 == null)?"<null>":this.amount3));
        sb.append(',');
        sb.append("entryValue8");
        sb.append('=');
        sb.append(((this.entryValue8 == null)?"<null>":this.entryValue8));
        sb.append(',');
        sb.append("amount2");
        sb.append('=');
        sb.append(((this.amount2 == null)?"<null>":this.amount2));
        sb.append(',');
        sb.append("entryValue7");
        sb.append('=');
        sb.append(((this.entryValue7 == null)?"<null>":this.entryValue7));
        sb.append(',');
        sb.append("ptrbdcaAmt1Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt1Title == null)?"<null>":this.ptrbdcaAmt1Title));
        sb.append(',');
        sb.append("amount1");
        sb.append('=');
        sb.append(((this.amount1 == null)?"<null>":this.amount1));
        sb.append(',');
        sb.append("entryValue9");
        sb.append('=');
        sb.append(((this.entryValue9 == null)?"<null>":this.entryValue9));
        sb.append(',');
        sb.append("bdcaDesc");
        sb.append('=');
        sb.append(((this.bdcaDesc == null)?"<null>":this.bdcaDesc));
        sb.append(',');
        sb.append("entryValue4");
        sb.append('=');
        sb.append(((this.entryValue4 == null)?"<null>":this.entryValue4));
        sb.append(',');
        sb.append("entryValue3");
        sb.append('=');
        sb.append(((this.entryValue3 == null)?"<null>":this.entryValue3));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("bdclCodeDesc");
        sb.append('=');
        sb.append(((this.bdclCodeDesc == null)?"<null>":this.bdclCodeDesc));
        sb.append(',');
        sb.append("entryValue6");
        sb.append('=');
        sb.append(((this.entryValue6 == null)?"<null>":this.entryValue6));
        sb.append(',');
        sb.append("entryValue5");
        sb.append('=');
        sb.append(((this.entryValue5 == null)?"<null>":this.entryValue5));
        sb.append(',');
        sb.append("bdclCode");
        sb.append('=');
        sb.append(((this.bdclCode == null)?"<null>":this.bdclCode));
        sb.append(',');
        sb.append("entryValue2");
        sb.append('=');
        sb.append(((this.entryValue2 == null)?"<null>":this.entryValue2));
        sb.append(',');
        sb.append("entryValue1");
        sb.append('=');
        sb.append(((this.entryValue1 == null)?"<null>":this.entryValue1));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("ptrbdcaAmt2Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt2Title == null)?"<null>":this.ptrbdcaAmt2Title));
        sb.append(',');
        sb.append("ptrbdcaOption3Title");
        sb.append('=');
        sb.append(((this.ptrbdcaOption3Title == null)?"<null>":this.ptrbdcaOption3Title));
        sb.append(',');
        sb.append("ptrbdcaAmt4Title");
        sb.append('=');
        sb.append(((this.ptrbdcaAmt4Title == null)?"<null>":this.ptrbdcaAmt4Title));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("ptrbdcaOption4Title");
        sb.append('=');
        sb.append(((this.ptrbdcaOption4Title == null)?"<null>":this.ptrbdcaOption4Title));
        sb.append(',');
        sb.append("changeStatus");
        sb.append('=');
        sb.append(((this.changeStatus == null)?"<null>":this.changeStatus));
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
        result = ((result* 31)+((this.replCodeDesc == null)? 0 :this.replCodeDesc.hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt3Title == null)? 0 :this.ptrbdcaAmt3Title.hashCode()));
        result = ((result* 31)+((this.optCode3 == null)? 0 :this.optCode3 .hashCode()));
        result = ((result* 31)+((this.refNo == null)? 0 :this.refNo.hashCode()));
        result = ((result* 31)+((this.optCode1 == null)? 0 :this.optCode1 .hashCode()));
        result = ((result* 31)+((this.ptrbdcaOption2Title == null)? 0 :this.ptrbdcaOption2Title.hashCode()));
        result = ((result* 31)+((this.optCode4 == null)? 0 :this.optCode4 .hashCode()));
        result = ((result* 31)+((this.replBdcaCode == null)? 0 :this.replBdcaCode.hashCode()));
        result = ((result* 31)+((this.optCode5 == null)? 0 :this.optCode5 .hashCode()));
        result = ((result* 31)+((this.ptrbdcaOption5Title == null)? 0 :this.ptrbdcaOption5Title.hashCode()));
        result = ((result* 31)+((this.amount4 == null)? 0 :this.amount4 .hashCode()));
        result = ((result* 31)+((this.calcRuleDisplay == null)? 0 :this.calcRuleDisplay.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.selectStatus == null)? 0 :this.selectStatus.hashCode()));
        result = ((result* 31)+((this.amount3 == null)? 0 :this.amount3 .hashCode()));
        result = ((result* 31)+((this.entryValue8 == null)? 0 :this.entryValue8 .hashCode()));
        result = ((result* 31)+((this.amount2 == null)? 0 :this.amount2 .hashCode()));
        result = ((result* 31)+((this.entryValue7 == null)? 0 :this.entryValue7 .hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt1Title == null)? 0 :this.ptrbdcaAmt1Title.hashCode()));
        result = ((result* 31)+((this.amount1 == null)? 0 :this.amount1 .hashCode()));
        result = ((result* 31)+((this.entryValue9 == null)? 0 :this.entryValue9 .hashCode()));
        result = ((result* 31)+((this.bdcaDesc == null)? 0 :this.bdcaDesc.hashCode()));
        result = ((result* 31)+((this.entryValue4 == null)? 0 :this.entryValue4 .hashCode()));
        result = ((result* 31)+((this.entryValue3 == null)? 0 :this.entryValue3 .hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.bdclCodeDesc == null)? 0 :this.bdclCodeDesc.hashCode()));
        result = ((result* 31)+((this.entryValue6 == null)? 0 :this.entryValue6 .hashCode()));
        result = ((result* 31)+((this.entryValue5 == null)? 0 :this.entryValue5 .hashCode()));
        result = ((result* 31)+((this.bdclCode == null)? 0 :this.bdclCode.hashCode()));
        result = ((result* 31)+((this.entryValue2 == null)? 0 :this.entryValue2 .hashCode()));
        result = ((result* 31)+((this.entryValue1 == null)? 0 :this.entryValue1 .hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt2Title == null)? 0 :this.ptrbdcaAmt2Title.hashCode()));
        result = ((result* 31)+((this.ptrbdcaOption3Title == null)? 0 :this.ptrbdcaOption3Title.hashCode()));
        result = ((result* 31)+((this.ptrbdcaAmt4Title == null)? 0 :this.ptrbdcaAmt4Title.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.ptrbdcaOption4Title == null)? 0 :this.ptrbdcaOption4Title.hashCode()));
        result = ((result* 31)+((this.changeStatus == null)? 0 :this.changeStatus.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenefitOrDeductionMassChangeRule100GetResponse) == false) {
            return false;
        }
        BenefitOrDeductionMassChangeRule100GetResponse rhs = ((BenefitOrDeductionMassChangeRule100GetResponse) other);
        return ((((((((((((((((((((((((((((((((((((((((((this.optCode2 == rhs.optCode2)||((this.optCode2 != null)&&this.optCode2 .equals(rhs.optCode2)))&&((this.replCodeDesc == rhs.replCodeDesc)||((this.replCodeDesc!= null)&&this.replCodeDesc.equals(rhs.replCodeDesc))))&&((this.ptrbdcaAmt3Title == rhs.ptrbdcaAmt3Title)||((this.ptrbdcaAmt3Title!= null)&&this.ptrbdcaAmt3Title.equals(rhs.ptrbdcaAmt3Title))))&&((this.optCode3 == rhs.optCode3)||((this.optCode3 != null)&&this.optCode3 .equals(rhs.optCode3))))&&((this.refNo == rhs.refNo)||((this.refNo!= null)&&this.refNo.equals(rhs.refNo))))&&((this.optCode1 == rhs.optCode1)||((this.optCode1 != null)&&this.optCode1 .equals(rhs.optCode1))))&&((this.ptrbdcaOption2Title == rhs.ptrbdcaOption2Title)||((this.ptrbdcaOption2Title!= null)&&this.ptrbdcaOption2Title.equals(rhs.ptrbdcaOption2Title))))&&((this.optCode4 == rhs.optCode4)||((this.optCode4 != null)&&this.optCode4 .equals(rhs.optCode4))))&&((this.replBdcaCode == rhs.replBdcaCode)||((this.replBdcaCode!= null)&&this.replBdcaCode.equals(rhs.replBdcaCode))))&&((this.optCode5 == rhs.optCode5)||((this.optCode5 != null)&&this.optCode5 .equals(rhs.optCode5))))&&((this.ptrbdcaOption5Title == rhs.ptrbdcaOption5Title)||((this.ptrbdcaOption5Title!= null)&&this.ptrbdcaOption5Title.equals(rhs.ptrbdcaOption5Title))))&&((this.amount4 == rhs.amount4)||((this.amount4 != null)&&this.amount4 .equals(rhs.amount4))))&&((this.calcRuleDisplay == rhs.calcRuleDisplay)||((this.calcRuleDisplay!= null)&&this.calcRuleDisplay.equals(rhs.calcRuleDisplay))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.selectStatus == rhs.selectStatus)||((this.selectStatus!= null)&&this.selectStatus.equals(rhs.selectStatus))))&&((this.amount3 == rhs.amount3)||((this.amount3 != null)&&this.amount3 .equals(rhs.amount3))))&&((this.entryValue8 == rhs.entryValue8)||((this.entryValue8 != null)&&this.entryValue8 .equals(rhs.entryValue8))))&&((this.amount2 == rhs.amount2)||((this.amount2 != null)&&this.amount2 .equals(rhs.amount2))))&&((this.entryValue7 == rhs.entryValue7)||((this.entryValue7 != null)&&this.entryValue7 .equals(rhs.entryValue7))))&&((this.ptrbdcaAmt1Title == rhs.ptrbdcaAmt1Title)||((this.ptrbdcaAmt1Title!= null)&&this.ptrbdcaAmt1Title.equals(rhs.ptrbdcaAmt1Title))))&&((this.amount1 == rhs.amount1)||((this.amount1 != null)&&this.amount1 .equals(rhs.amount1))))&&((this.entryValue9 == rhs.entryValue9)||((this.entryValue9 != null)&&this.entryValue9 .equals(rhs.entryValue9))))&&((this.bdcaDesc == rhs.bdcaDesc)||((this.bdcaDesc!= null)&&this.bdcaDesc.equals(rhs.bdcaDesc))))&&((this.entryValue4 == rhs.entryValue4)||((this.entryValue4 != null)&&this.entryValue4 .equals(rhs.entryValue4))))&&((this.entryValue3 == rhs.entryValue3)||((this.entryValue3 != null)&&this.entryValue3 .equals(rhs.entryValue3))))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this.bdclCodeDesc == rhs.bdclCodeDesc)||((this.bdclCodeDesc!= null)&&this.bdclCodeDesc.equals(rhs.bdclCodeDesc))))&&((this.entryValue6 == rhs.entryValue6)||((this.entryValue6 != null)&&this.entryValue6 .equals(rhs.entryValue6))))&&((this.entryValue5 == rhs.entryValue5)||((this.entryValue5 != null)&&this.entryValue5 .equals(rhs.entryValue5))))&&((this.bdclCode == rhs.bdclCode)||((this.bdclCode!= null)&&this.bdclCode.equals(rhs.bdclCode))))&&((this.entryValue2 == rhs.entryValue2)||((this.entryValue2 != null)&&this.entryValue2 .equals(rhs.entryValue2))))&&((this.entryValue1 == rhs.entryValue1)||((this.entryValue1 != null)&&this.entryValue1 .equals(rhs.entryValue1))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.ptrbdcaAmt2Title == rhs.ptrbdcaAmt2Title)||((this.ptrbdcaAmt2Title!= null)&&this.ptrbdcaAmt2Title.equals(rhs.ptrbdcaAmt2Title))))&&((this.ptrbdcaOption3Title == rhs.ptrbdcaOption3Title)||((this.ptrbdcaOption3Title!= null)&&this.ptrbdcaOption3Title.equals(rhs.ptrbdcaOption3Title))))&&((this.ptrbdcaAmt4Title == rhs.ptrbdcaAmt4Title)||((this.ptrbdcaAmt4Title!= null)&&this.ptrbdcaAmt4Title.equals(rhs.ptrbdcaAmt4Title))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.ptrbdcaOption4Title == rhs.ptrbdcaOption4Title)||((this.ptrbdcaOption4Title!= null)&&this.ptrbdcaOption4Title.equals(rhs.ptrbdcaOption4Title))))&&((this.changeStatus == rhs.changeStatus)||((this.changeStatus!= null)&&this.changeStatus.equals(rhs.changeStatus))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
