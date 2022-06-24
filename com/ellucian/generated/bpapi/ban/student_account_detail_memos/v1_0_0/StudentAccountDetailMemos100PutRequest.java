
package com.ellucian.generated.bpapi.ban.student_account_detail_memos.v1_0_0;

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
    "criteria.createUser",
    "criteria.detailCode",
    "criteria.billingInd",
    "criteria.amount",
    "criteria.termCode",
    "criteria.desc",
    "criteria.expirationDate",
    "holdPassword",
    "criteria.aidyCode",
    "criteria.srceCode",
    "id",
    "billingInd",
    "criteria.period",
    "desc",
    "termCode",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class StudentAccountDetailMemos100PutRequest {

    /**
     * Create User
     * <p>
     * Lineage reference object : TBRMEMO_CREATE_USER
     * 
     */
    @JsonProperty("criteria.createUser")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_CREATE_USER")
    private String criteriaCreateUser;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaDetailCode;
    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : TBRMEMO_BILLING_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.billingInd")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_BILLING_IND")
    private String criteriaBillingInd;
    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMEMO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_AMOUNT")
    private Double criteriaAmount;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTermCode;
    /**
     * Memo Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_DESC")
    private String criteriaDesc;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_EXPIRATION_DATE")
    private Date criteriaExpirationDate;
    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    @JsonPropertyDescription("Lineage reference object : holdPassword")
    private String holdPassword;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRMEMO_AIDY_CODE
     * 
     */
    @JsonProperty("criteria.aidyCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_AIDY_CODE")
    private String criteriaAidyCode;
    /**
     * Source
     * <p>
     * Lineage reference object : TBRMEMO_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("criteria.srceCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_SRCE_CODE, Lookup lineage reference object : ttvsrce")
    private String criteriaSrceCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : TBRMEMO_BILLING_IND
     * (Required)
     * 
     */
    @JsonProperty("billingInd")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_BILLING_IND")
    private String billingInd;
    /**
     * Period
     * <p>
     * Lineage reference object : TBRMEMO_PERIOD
     * 
     */
    @JsonProperty("criteria.period")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_PERIOD")
    private String criteriaPeriod;
    /**
     * Memo Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_DESC")
    private String desc;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_EXPIRATION_DATE")
    private Date expirationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Create User
     * <p>
     * Lineage reference object : TBRMEMO_CREATE_USER
     * 
     */
    @JsonProperty("criteria.createUser")
    public String getCriteriaCreateUser() {
        return criteriaCreateUser;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : TBRMEMO_CREATE_USER
     * 
     */
    @JsonProperty("criteria.createUser")
    public void setCriteriaCreateUser(String criteriaCreateUser) {
        this.criteriaCreateUser = criteriaCreateUser;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaCreateUser(String criteriaCreateUser) {
        this.criteriaCreateUser = criteriaCreateUser;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public String getCriteriaDetailCode() {
        return criteriaDetailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public void setCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
        return this;
    }

    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : TBRMEMO_BILLING_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.billingInd")
    public String getCriteriaBillingInd() {
        return criteriaBillingInd;
    }

    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : TBRMEMO_BILLING_IND
     * (Required)
     * 
     */
    @JsonProperty("criteria.billingInd")
    public void setCriteriaBillingInd(String criteriaBillingInd) {
        this.criteriaBillingInd = criteriaBillingInd;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaBillingInd(String criteriaBillingInd) {
        this.criteriaBillingInd = criteriaBillingInd;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMEMO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    public Double getCriteriaAmount() {
        return criteriaAmount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMEMO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("criteria.amount")
    public void setCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm
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
     * Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

    /**
     * Memo Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Memo Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    public Date getCriteriaExpirationDate() {
        return criteriaExpirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("criteria.expirationDate")
    public void setCriteriaExpirationDate(Date criteriaExpirationDate) {
        this.criteriaExpirationDate = criteriaExpirationDate;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaExpirationDate(Date criteriaExpirationDate) {
        this.criteriaExpirationDate = criteriaExpirationDate;
        return this;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public String getHoldPassword() {
        return holdPassword;
    }

    /**
     * Holds
     * <p>
     * Lineage reference object : holdPassword
     * 
     */
    @JsonProperty("holdPassword")
    public void setHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
    }

    public StudentAccountDetailMemos100PutRequest withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRMEMO_AIDY_CODE
     * 
     */
    @JsonProperty("criteria.aidyCode")
    public String getCriteriaAidyCode() {
        return criteriaAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRMEMO_AIDY_CODE
     * 
     */
    @JsonProperty("criteria.aidyCode")
    public void setCriteriaAidyCode(String criteriaAidyCode) {
        this.criteriaAidyCode = criteriaAidyCode;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaAidyCode(String criteriaAidyCode) {
        this.criteriaAidyCode = criteriaAidyCode;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRMEMO_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("criteria.srceCode")
    public String getCriteriaSrceCode() {
        return criteriaSrceCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRMEMO_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("criteria.srceCode")
    public void setCriteriaSrceCode(String criteriaSrceCode) {
        this.criteriaSrceCode = criteriaSrceCode;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaSrceCode(String criteriaSrceCode) {
        this.criteriaSrceCode = criteriaSrceCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public StudentAccountDetailMemos100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : TBRMEMO_BILLING_IND
     * (Required)
     * 
     */
    @JsonProperty("billingInd")
    public String getBillingInd() {
        return billingInd;
    }

    /**
     * Bill Indicator
     * <p>
     * Lineage reference object : TBRMEMO_BILLING_IND
     * (Required)
     * 
     */
    @JsonProperty("billingInd")
    public void setBillingInd(String billingInd) {
        this.billingInd = billingInd;
    }

    public StudentAccountDetailMemos100PutRequest withBillingInd(String billingInd) {
        this.billingInd = billingInd;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRMEMO_PERIOD
     * 
     */
    @JsonProperty("criteria.period")
    public String getCriteriaPeriod() {
        return criteriaPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRMEMO_PERIOD
     * 
     */
    @JsonProperty("criteria.period")
    public void setCriteriaPeriod(String criteriaPeriod) {
        this.criteriaPeriod = criteriaPeriod;
    }

    public StudentAccountDetailMemos100PutRequest withCriteriaPeriod(String criteriaPeriod) {
        this.criteriaPeriod = criteriaPeriod;
        return this;
    }

    /**
     * Memo Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Memo Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public StudentAccountDetailMemos100PutRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public StudentAccountDetailMemos100PutRequest withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public StudentAccountDetailMemos100PutRequest withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public StudentAccountDetailMemos100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentAccountDetailMemos100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaCreateUser");
        sb.append('=');
        sb.append(((this.criteriaCreateUser == null)?"<null>":this.criteriaCreateUser));
        sb.append(',');
        sb.append("criteriaDetailCode");
        sb.append('=');
        sb.append(((this.criteriaDetailCode == null)?"<null>":this.criteriaDetailCode));
        sb.append(',');
        sb.append("criteriaBillingInd");
        sb.append('=');
        sb.append(((this.criteriaBillingInd == null)?"<null>":this.criteriaBillingInd));
        sb.append(',');
        sb.append("criteriaAmount");
        sb.append('=');
        sb.append(((this.criteriaAmount == null)?"<null>":this.criteriaAmount));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaExpirationDate");
        sb.append('=');
        sb.append(((this.criteriaExpirationDate == null)?"<null>":this.criteriaExpirationDate));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("criteriaAidyCode");
        sb.append('=');
        sb.append(((this.criteriaAidyCode == null)?"<null>":this.criteriaAidyCode));
        sb.append(',');
        sb.append("criteriaSrceCode");
        sb.append('=');
        sb.append(((this.criteriaSrceCode == null)?"<null>":this.criteriaSrceCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("billingInd");
        sb.append('=');
        sb.append(((this.billingInd == null)?"<null>":this.billingInd));
        sb.append(',');
        sb.append("criteriaPeriod");
        sb.append('=');
        sb.append(((this.criteriaPeriod == null)?"<null>":this.criteriaPeriod));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
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
        result = ((result* 31)+((this.criteriaExpirationDate == null)? 0 :this.criteriaExpirationDate.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaPeriod == null)? 0 :this.criteriaPeriod.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaAidyCode == null)? 0 :this.criteriaAidyCode.hashCode()));
        result = ((result* 31)+((this.criteriaAmount == null)? 0 :this.criteriaAmount.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.criteriaCreateUser == null)? 0 :this.criteriaCreateUser.hashCode()));
        result = ((result* 31)+((this.criteriaSrceCode == null)? 0 :this.criteriaSrceCode.hashCode()));
        result = ((result* 31)+((this.criteriaBillingInd == null)? 0 :this.criteriaBillingInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.billingInd == null)? 0 :this.billingInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentAccountDetailMemos100PutRequest) == false) {
            return false;
        }
        StudentAccountDetailMemos100PutRequest rhs = ((StudentAccountDetailMemos100PutRequest) other);
        return ((((((((((((((((((this.criteriaExpirationDate == rhs.criteriaExpirationDate)||((this.criteriaExpirationDate!= null)&&this.criteriaExpirationDate.equals(rhs.criteriaExpirationDate)))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.criteriaPeriod == rhs.criteriaPeriod)||((this.criteriaPeriod!= null)&&this.criteriaPeriod.equals(rhs.criteriaPeriod))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.criteriaAidyCode == rhs.criteriaAidyCode)||((this.criteriaAidyCode!= null)&&this.criteriaAidyCode.equals(rhs.criteriaAidyCode))))&&((this.criteriaAmount == rhs.criteriaAmount)||((this.criteriaAmount!= null)&&this.criteriaAmount.equals(rhs.criteriaAmount))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.criteriaCreateUser == rhs.criteriaCreateUser)||((this.criteriaCreateUser!= null)&&this.criteriaCreateUser.equals(rhs.criteriaCreateUser))))&&((this.criteriaSrceCode == rhs.criteriaSrceCode)||((this.criteriaSrceCode!= null)&&this.criteriaSrceCode.equals(rhs.criteriaSrceCode))))&&((this.criteriaBillingInd == rhs.criteriaBillingInd)||((this.criteriaBillingInd!= null)&&this.criteriaBillingInd.equals(rhs.criteriaBillingInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.billingInd == rhs.billingInd)||((this.billingInd!= null)&&this.billingInd.equals(rhs.billingInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
