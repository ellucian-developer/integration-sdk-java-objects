
package com.ellucian.generated.bpapi.ban.employee_benefit_or_deduction.v1_0_0;

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
    "addReplEmpr",
    "endDate",
    "arrRecoverMax",
    "userId",
    "addReplEmpl",
    "arrBalance",
    "beginDate",
    "addReplPictCode",
    "activityDate",
    "addReplInd",
    "bondBalance",
    "addReplTaxBase",
    "arrStatus",
    "desc"
})
@Generated("jsonschema2pojo")
public class Pdrbded {

    /**
     * Employer Amount
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_EMPR
     * 
     */
    @JsonProperty("addReplEmpr")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_ADD_REPL_EMPR")
    private Double addReplEmpr;
    /**
     * End Date
     * <p>
     * Lineage reference object : PDRBDED_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_END_DATE")
    private Date endDate;
    /**
     * Maximum Recover Amount
     * <p>
     * Lineage reference object : PDRBDED_ARR_RECOVER_MAX
     * 
     */
    @JsonProperty("arrRecoverMax")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_ARR_RECOVER_MAX")
    private Double arrRecoverMax;
    /**
     * Lineage reference object : PDRBDED_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_USER_ID")
    private String userId;
    /**
     * Employee Amount
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_EMPL
     * 
     */
    @JsonProperty("addReplEmpl")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_ADD_REPL_EMPL")
    private Double addReplEmpl;
    /**
     * Arrear Balance
     * <p>
     * Lineage reference object : PDRBDED_ARR_BALANCE
     * 
     */
    @JsonProperty("arrBalance")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_ARR_BALANCE")
    private Double arrBalance;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : PDRBDED_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_BEGIN_DATE")
    private Date beginDate;
    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_PICT_CODE
     * 
     */
    @JsonProperty("addReplPictCode")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_ADD_REPL_PICT_CODE")
    private String addReplPictCode;
    /**
     * Lineage reference object : PDRBDED_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : PDRBDED_ADD_REPL_IND
     * 
     */
    @JsonProperty("addReplInd")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_ADD_REPL_IND")
    private String addReplInd;
    /**
     * Bond Balance
     * <p>
     * Lineage reference object : PDRBDED_BOND_BALANCE
     * 
     */
    @JsonProperty("bondBalance")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_BOND_BALANCE")
    private Double bondBalance;
    /**
     * Applicable Gross
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_TAX_BASE
     * 
     */
    @JsonProperty("addReplTaxBase")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_ADD_REPL_TAX_BASE")
    private Double addReplTaxBase;
    /**
     * Active Arrear Status
     * <p>
     * Lineage reference object : PDRBDED_ARR_STATUS
     * 
     */
    @JsonProperty("arrStatus")
    @JsonPropertyDescription("Lineage reference object : PDRBDED_ARR_STATUS")
    private String arrStatus;
    @JsonProperty("desc")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Employer Amount
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_EMPR
     * 
     */
    @JsonProperty("addReplEmpr")
    public Double getAddReplEmpr() {
        return addReplEmpr;
    }

    /**
     * Employer Amount
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_EMPR
     * 
     */
    @JsonProperty("addReplEmpr")
    public void setAddReplEmpr(Double addReplEmpr) {
        this.addReplEmpr = addReplEmpr;
    }

    public Pdrbded withAddReplEmpr(Double addReplEmpr) {
        this.addReplEmpr = addReplEmpr;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PDRBDED_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PDRBDED_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Pdrbded withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Maximum Recover Amount
     * <p>
     * Lineage reference object : PDRBDED_ARR_RECOVER_MAX
     * 
     */
    @JsonProperty("arrRecoverMax")
    public Double getArrRecoverMax() {
        return arrRecoverMax;
    }

    /**
     * Maximum Recover Amount
     * <p>
     * Lineage reference object : PDRBDED_ARR_RECOVER_MAX
     * 
     */
    @JsonProperty("arrRecoverMax")
    public void setArrRecoverMax(Double arrRecoverMax) {
        this.arrRecoverMax = arrRecoverMax;
    }

    public Pdrbded withArrRecoverMax(Double arrRecoverMax) {
        this.arrRecoverMax = arrRecoverMax;
        return this;
    }

    /**
     * Lineage reference object : PDRBDED_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PDRBDED_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Pdrbded withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Employee Amount
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_EMPL
     * 
     */
    @JsonProperty("addReplEmpl")
    public Double getAddReplEmpl() {
        return addReplEmpl;
    }

    /**
     * Employee Amount
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_EMPL
     * 
     */
    @JsonProperty("addReplEmpl")
    public void setAddReplEmpl(Double addReplEmpl) {
        this.addReplEmpl = addReplEmpl;
    }

    public Pdrbded withAddReplEmpl(Double addReplEmpl) {
        this.addReplEmpl = addReplEmpl;
        return this;
    }

    /**
     * Arrear Balance
     * <p>
     * Lineage reference object : PDRBDED_ARR_BALANCE
     * 
     */
    @JsonProperty("arrBalance")
    public Double getArrBalance() {
        return arrBalance;
    }

    /**
     * Arrear Balance
     * <p>
     * Lineage reference object : PDRBDED_ARR_BALANCE
     * 
     */
    @JsonProperty("arrBalance")
    public void setArrBalance(Double arrBalance) {
        this.arrBalance = arrBalance;
    }

    public Pdrbded withArrBalance(Double arrBalance) {
        this.arrBalance = arrBalance;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : PDRBDED_BEGIN_DATE
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
     * Lineage reference object : PDRBDED_BEGIN_DATE
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Pdrbded withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_PICT_CODE
     * 
     */
    @JsonProperty("addReplPictCode")
    public String getAddReplPictCode() {
        return addReplPictCode;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_PICT_CODE
     * 
     */
    @JsonProperty("addReplPictCode")
    public void setAddReplPictCode(String addReplPictCode) {
        this.addReplPictCode = addReplPictCode;
    }

    public Pdrbded withAddReplPictCode(String addReplPictCode) {
        this.addReplPictCode = addReplPictCode;
        return this;
    }

    /**
     * Lineage reference object : PDRBDED_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PDRBDED_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Pdrbded withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : PDRBDED_ADD_REPL_IND
     * 
     */
    @JsonProperty("addReplInd")
    public String getAddReplInd() {
        return addReplInd;
    }

    /**
     * Lineage reference object : PDRBDED_ADD_REPL_IND
     * 
     */
    @JsonProperty("addReplInd")
    public void setAddReplInd(String addReplInd) {
        this.addReplInd = addReplInd;
    }

    public Pdrbded withAddReplInd(String addReplInd) {
        this.addReplInd = addReplInd;
        return this;
    }

    /**
     * Bond Balance
     * <p>
     * Lineage reference object : PDRBDED_BOND_BALANCE
     * 
     */
    @JsonProperty("bondBalance")
    public Double getBondBalance() {
        return bondBalance;
    }

    /**
     * Bond Balance
     * <p>
     * Lineage reference object : PDRBDED_BOND_BALANCE
     * 
     */
    @JsonProperty("bondBalance")
    public void setBondBalance(Double bondBalance) {
        this.bondBalance = bondBalance;
    }

    public Pdrbded withBondBalance(Double bondBalance) {
        this.bondBalance = bondBalance;
        return this;
    }

    /**
     * Applicable Gross
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_TAX_BASE
     * 
     */
    @JsonProperty("addReplTaxBase")
    public Double getAddReplTaxBase() {
        return addReplTaxBase;
    }

    /**
     * Applicable Gross
     * <p>
     * Lineage reference object : PDRBDED_ADD_REPL_TAX_BASE
     * 
     */
    @JsonProperty("addReplTaxBase")
    public void setAddReplTaxBase(Double addReplTaxBase) {
        this.addReplTaxBase = addReplTaxBase;
    }

    public Pdrbded withAddReplTaxBase(Double addReplTaxBase) {
        this.addReplTaxBase = addReplTaxBase;
        return this;
    }

    /**
     * Active Arrear Status
     * <p>
     * Lineage reference object : PDRBDED_ARR_STATUS
     * 
     */
    @JsonProperty("arrStatus")
    public String getArrStatus() {
        return arrStatus;
    }

    /**
     * Active Arrear Status
     * <p>
     * Lineage reference object : PDRBDED_ARR_STATUS
     * 
     */
    @JsonProperty("arrStatus")
    public void setArrStatus(String arrStatus) {
        this.arrStatus = arrStatus;
    }

    public Pdrbded withArrStatus(String arrStatus) {
        this.arrStatus = arrStatus;
        return this;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Pdrbded withDesc(String desc) {
        this.desc = desc;
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

    public Pdrbded withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pdrbded.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addReplEmpr");
        sb.append('=');
        sb.append(((this.addReplEmpr == null)?"<null>":this.addReplEmpr));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("arrRecoverMax");
        sb.append('=');
        sb.append(((this.arrRecoverMax == null)?"<null>":this.arrRecoverMax));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("addReplEmpl");
        sb.append('=');
        sb.append(((this.addReplEmpl == null)?"<null>":this.addReplEmpl));
        sb.append(',');
        sb.append("arrBalance");
        sb.append('=');
        sb.append(((this.arrBalance == null)?"<null>":this.arrBalance));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("addReplPictCode");
        sb.append('=');
        sb.append(((this.addReplPictCode == null)?"<null>":this.addReplPictCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("addReplInd");
        sb.append('=');
        sb.append(((this.addReplInd == null)?"<null>":this.addReplInd));
        sb.append(',');
        sb.append("bondBalance");
        sb.append('=');
        sb.append(((this.bondBalance == null)?"<null>":this.bondBalance));
        sb.append(',');
        sb.append("addReplTaxBase");
        sb.append('=');
        sb.append(((this.addReplTaxBase == null)?"<null>":this.addReplTaxBase));
        sb.append(',');
        sb.append("arrStatus");
        sb.append('=');
        sb.append(((this.arrStatus == null)?"<null>":this.arrStatus));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.addReplEmpr == null)? 0 :this.addReplEmpr.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.arrRecoverMax == null)? 0 :this.arrRecoverMax.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.addReplEmpl == null)? 0 :this.addReplEmpl.hashCode()));
        result = ((result* 31)+((this.arrBalance == null)? 0 :this.arrBalance.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.addReplPictCode == null)? 0 :this.addReplPictCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.addReplInd == null)? 0 :this.addReplInd.hashCode()));
        result = ((result* 31)+((this.bondBalance == null)? 0 :this.bondBalance.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.addReplTaxBase == null)? 0 :this.addReplTaxBase.hashCode()));
        result = ((result* 31)+((this.arrStatus == null)? 0 :this.arrStatus.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pdrbded) == false) {
            return false;
        }
        Pdrbded rhs = ((Pdrbded) other);
        return ((((((((((((((((this.addReplEmpr == rhs.addReplEmpr)||((this.addReplEmpr!= null)&&this.addReplEmpr.equals(rhs.addReplEmpr)))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.arrRecoverMax == rhs.arrRecoverMax)||((this.arrRecoverMax!= null)&&this.arrRecoverMax.equals(rhs.arrRecoverMax))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.addReplEmpl == rhs.addReplEmpl)||((this.addReplEmpl!= null)&&this.addReplEmpl.equals(rhs.addReplEmpl))))&&((this.arrBalance == rhs.arrBalance)||((this.arrBalance!= null)&&this.arrBalance.equals(rhs.arrBalance))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.addReplPictCode == rhs.addReplPictCode)||((this.addReplPictCode!= null)&&this.addReplPictCode.equals(rhs.addReplPictCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.addReplInd == rhs.addReplInd)||((this.addReplInd!= null)&&this.addReplInd.equals(rhs.addReplInd))))&&((this.bondBalance == rhs.bondBalance)||((this.bondBalance!= null)&&this.bondBalance.equals(rhs.bondBalance))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.addReplTaxBase == rhs.addReplTaxBase)||((this.addReplTaxBase!= null)&&this.addReplTaxBase.equals(rhs.addReplTaxBase))))&&((this.arrStatus == rhs.arrStatus)||((this.arrStatus!= null)&&this.arrStatus.equals(rhs.arrStatus))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
