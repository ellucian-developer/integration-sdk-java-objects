
package com.ellucian.generated.bpapi.ban.employee_benefit_or_deduction_setup.v1_0_0;

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
    "beginDate",
    "defaultValuesInd",
    "activityDate",
    "bdcaCode",
    "bdcaDesc",
    "addInd",
    "reqInd",
    "userId",
    "chosen"
})
@Generated("jsonschema2pojo")
public class EmployeeBenefitOrDeductionSetup100GetResponse {

    /**
     * Begin Date Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("beginDate")
    private String beginDate;
    @JsonProperty("defaultValuesInd")
    private String defaultValuesInd;
    /**
     * Lineage reference object : PTRBCDN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Benefits or Deductions
     * <p>
     * Lineage reference object : PTRBCDN_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_BDCA_CODE")
    private String bdcaCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bdcaDesc")
    private String bdcaDesc;
    @JsonProperty("addInd")
    private String addInd;
    /**
     * Lineage reference object : PTRBCDN_REQ_IND
     * 
     */
    @JsonProperty("reqInd")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_REQ_IND")
    private String reqInd;
    /**
     * Lineage reference object : PTRBCDN_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : PTRBCDN_USER_ID")
    private String userId;
    /**
     * Setup Status
     * <p>
     * 
     * 
     */
    @JsonProperty("chosen")
    private String chosen;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Begin Date Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("beginDate")
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public EmployeeBenefitOrDeductionSetup100GetResponse withBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    @JsonProperty("defaultValuesInd")
    public String getDefaultValuesInd() {
        return defaultValuesInd;
    }

    @JsonProperty("defaultValuesInd")
    public void setDefaultValuesInd(String defaultValuesInd) {
        this.defaultValuesInd = defaultValuesInd;
    }

    public EmployeeBenefitOrDeductionSetup100GetResponse withDefaultValuesInd(String defaultValuesInd) {
        this.defaultValuesInd = defaultValuesInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBCDN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : PTRBCDN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EmployeeBenefitOrDeductionSetup100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Benefits or Deductions
     * <p>
     * Lineage reference object : PTRBCDN_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public String getBdcaCode() {
        return bdcaCode;
    }

    /**
     * Benefits or Deductions
     * <p>
     * Lineage reference object : PTRBCDN_BDCA_CODE
     * 
     */
    @JsonProperty("bdcaCode")
    public void setBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
    }

    public EmployeeBenefitOrDeductionSetup100GetResponse withBdcaCode(String bdcaCode) {
        this.bdcaCode = bdcaCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bdcaDesc")
    public String getBdcaDesc() {
        return bdcaDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("bdcaDesc")
    public void setBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
    }

    public EmployeeBenefitOrDeductionSetup100GetResponse withBdcaDesc(String bdcaDesc) {
        this.bdcaDesc = bdcaDesc;
        return this;
    }

    @JsonProperty("addInd")
    public String getAddInd() {
        return addInd;
    }

    @JsonProperty("addInd")
    public void setAddInd(String addInd) {
        this.addInd = addInd;
    }

    public EmployeeBenefitOrDeductionSetup100GetResponse withAddInd(String addInd) {
        this.addInd = addInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBCDN_REQ_IND
     * 
     */
    @JsonProperty("reqInd")
    public String getReqInd() {
        return reqInd;
    }

    /**
     * Lineage reference object : PTRBCDN_REQ_IND
     * 
     */
    @JsonProperty("reqInd")
    public void setReqInd(String reqInd) {
        this.reqInd = reqInd;
    }

    public EmployeeBenefitOrDeductionSetup100GetResponse withReqInd(String reqInd) {
        this.reqInd = reqInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBCDN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : PTRBCDN_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EmployeeBenefitOrDeductionSetup100GetResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Setup Status
     * <p>
     * 
     * 
     */
    @JsonProperty("chosen")
    public String getChosen() {
        return chosen;
    }

    /**
     * Setup Status
     * <p>
     * 
     * 
     */
    @JsonProperty("chosen")
    public void setChosen(String chosen) {
        this.chosen = chosen;
    }

    public EmployeeBenefitOrDeductionSetup100GetResponse withChosen(String chosen) {
        this.chosen = chosen;
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

    public EmployeeBenefitOrDeductionSetup100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeBenefitOrDeductionSetup100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("defaultValuesInd");
        sb.append('=');
        sb.append(((this.defaultValuesInd == null)?"<null>":this.defaultValuesInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("bdcaCode");
        sb.append('=');
        sb.append(((this.bdcaCode == null)?"<null>":this.bdcaCode));
        sb.append(',');
        sb.append("bdcaDesc");
        sb.append('=');
        sb.append(((this.bdcaDesc == null)?"<null>":this.bdcaDesc));
        sb.append(',');
        sb.append("addInd");
        sb.append('=');
        sb.append(((this.addInd == null)?"<null>":this.addInd));
        sb.append(',');
        sb.append("reqInd");
        sb.append('=');
        sb.append(((this.reqInd == null)?"<null>":this.reqInd));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("chosen");
        sb.append('=');
        sb.append(((this.chosen == null)?"<null>":this.chosen));
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
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.defaultValuesInd == null)? 0 :this.defaultValuesInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.bdcaCode == null)? 0 :this.bdcaCode.hashCode()));
        result = ((result* 31)+((this.bdcaDesc == null)? 0 :this.bdcaDesc.hashCode()));
        result = ((result* 31)+((this.addInd == null)? 0 :this.addInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqInd == null)? 0 :this.reqInd.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.chosen == null)? 0 :this.chosen.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeBenefitOrDeductionSetup100GetResponse) == false) {
            return false;
        }
        EmployeeBenefitOrDeductionSetup100GetResponse rhs = ((EmployeeBenefitOrDeductionSetup100GetResponse) other);
        return (((((((((((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate)))&&((this.defaultValuesInd == rhs.defaultValuesInd)||((this.defaultValuesInd!= null)&&this.defaultValuesInd.equals(rhs.defaultValuesInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.bdcaCode == rhs.bdcaCode)||((this.bdcaCode!= null)&&this.bdcaCode.equals(rhs.bdcaCode))))&&((this.bdcaDesc == rhs.bdcaDesc)||((this.bdcaDesc!= null)&&this.bdcaDesc.equals(rhs.bdcaDesc))))&&((this.addInd == rhs.addInd)||((this.addInd!= null)&&this.addInd.equals(rhs.addInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.reqInd == rhs.reqInd)||((this.reqInd!= null)&&this.reqInd.equals(rhs.reqInd))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.chosen == rhs.chosen)||((this.chosen!= null)&&this.chosen.equals(rhs.chosen))));
    }

}
