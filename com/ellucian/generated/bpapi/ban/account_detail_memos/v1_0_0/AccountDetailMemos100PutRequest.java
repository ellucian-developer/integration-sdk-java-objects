
package com.ellucian.generated.bpapi.ban.account_detail_memos.v1_0_0;

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
    "criteria.atypCode",
    "criteria.amount",
    "amount",
    "tbrmemoDesc",
    "criteria.desc",
    "criteria.atypSeqno",
    "criteria.expirationDate",
    "holdPassword",
    "criteria.srceCode",
    "id",
    "billingInd",
    "atypCode",
    "atypSeqno",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class AccountDetailMemos100PutRequest {

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
     * Address Type
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_ATYP_CODE")
    private String criteriaAtypCode;
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
     * Amount
     * <p>
     * Lineage reference object : TBRMEMO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_AMOUNT")
    private Double amount;
    /**
     * Memo Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("tbrmemoDesc")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_DESC")
    private String tbrmemoDesc;
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
     * Sequence
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypSeqno")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_ATYP_SEQNO")
    private Double criteriaAtypSeqno;
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
     * Address Type
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_ATYP_CODE")
    private String atypCode;
    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_ATYP_SEQNO")
    private Double atypSeqno;
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

    public AccountDetailMemos100PutRequest withCriteriaCreateUser(String criteriaCreateUser) {
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

    public AccountDetailMemos100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
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

    public AccountDetailMemos100PutRequest withCriteriaBillingInd(String criteriaBillingInd) {
        this.criteriaBillingInd = criteriaBillingInd;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public String getCriteriaAtypCode() {
        return criteriaAtypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypCode")
    public void setCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
    }

    public AccountDetailMemos100PutRequest withCriteriaAtypCode(String criteriaAtypCode) {
        this.criteriaAtypCode = criteriaAtypCode;
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

    public AccountDetailMemos100PutRequest withCriteriaAmount(Double criteriaAmount) {
        this.criteriaAmount = criteriaAmount;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMEMO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : TBRMEMO_AMOUNT
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public AccountDetailMemos100PutRequest withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Memo Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("tbrmemoDesc")
    public String getTbrmemoDesc() {
        return tbrmemoDesc;
    }

    /**
     * Memo Description
     * <p>
     * Lineage reference object : TBRMEMO_DESC
     * (Required)
     * 
     */
    @JsonProperty("tbrmemoDesc")
    public void setTbrmemoDesc(String tbrmemoDesc) {
        this.tbrmemoDesc = tbrmemoDesc;
    }

    public AccountDetailMemos100PutRequest withTbrmemoDesc(String tbrmemoDesc) {
        this.tbrmemoDesc = tbrmemoDesc;
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

    public AccountDetailMemos100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypSeqno")
    public Double getCriteriaAtypSeqno() {
        return criteriaAtypSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("criteria.atypSeqno")
    public void setCriteriaAtypSeqno(Double criteriaAtypSeqno) {
        this.criteriaAtypSeqno = criteriaAtypSeqno;
    }

    public AccountDetailMemos100PutRequest withCriteriaAtypSeqno(Double criteriaAtypSeqno) {
        this.criteriaAtypSeqno = criteriaAtypSeqno;
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

    public AccountDetailMemos100PutRequest withCriteriaExpirationDate(Date criteriaExpirationDate) {
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

    public AccountDetailMemos100PutRequest withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
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

    public AccountDetailMemos100PutRequest withCriteriaSrceCode(String criteriaSrceCode) {
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

    public AccountDetailMemos100PutRequest withId(String id) {
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

    public AccountDetailMemos100PutRequest withBillingInd(String billingInd) {
        this.billingInd = billingInd;
        return this;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Address Type
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public AccountDetailMemos100PutRequest withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    public Double getAtypSeqno() {
        return atypSeqno;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : TBRMEMO_ATYP_SEQNO
     * (Required)
     * 
     */
    @JsonProperty("atypSeqno")
    public void setAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
    }

    public AccountDetailMemos100PutRequest withAtypSeqno(Double atypSeqno) {
        this.atypSeqno = atypSeqno;
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

    public AccountDetailMemos100PutRequest withExpirationDate(Date expirationDate) {
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

    public AccountDetailMemos100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetailMemos100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("criteriaAtypCode");
        sb.append('=');
        sb.append(((this.criteriaAtypCode == null)?"<null>":this.criteriaAtypCode));
        sb.append(',');
        sb.append("criteriaAmount");
        sb.append('=');
        sb.append(((this.criteriaAmount == null)?"<null>":this.criteriaAmount));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("tbrmemoDesc");
        sb.append('=');
        sb.append(((this.tbrmemoDesc == null)?"<null>":this.tbrmemoDesc));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaAtypSeqno");
        sb.append('=');
        sb.append(((this.criteriaAtypSeqno == null)?"<null>":this.criteriaAtypSeqno));
        sb.append(',');
        sb.append("criteriaExpirationDate");
        sb.append('=');
        sb.append(((this.criteriaExpirationDate == null)?"<null>":this.criteriaExpirationDate));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
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
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("atypSeqno");
        sb.append('=');
        sb.append(((this.atypSeqno == null)?"<null>":this.atypSeqno));
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
        result = ((result* 31)+((this.criteriaAtypCode == null)? 0 :this.criteriaAtypCode.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.tbrmemoDesc == null)? 0 :this.tbrmemoDesc.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaAmount == null)? 0 :this.criteriaAmount.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.criteriaCreateUser == null)? 0 :this.criteriaCreateUser.hashCode()));
        result = ((result* 31)+((this.criteriaSrceCode == null)? 0 :this.criteriaSrceCode.hashCode()));
        result = ((result* 31)+((this.criteriaBillingInd == null)? 0 :this.criteriaBillingInd.hashCode()));
        result = ((result* 31)+((this.criteriaAtypSeqno == null)? 0 :this.criteriaAtypSeqno.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.billingInd == null)? 0 :this.billingInd.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.atypSeqno == null)? 0 :this.atypSeqno.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetailMemos100PutRequest) == false) {
            return false;
        }
        AccountDetailMemos100PutRequest rhs = ((AccountDetailMemos100PutRequest) other);
        return (((((((((((((((((((this.criteriaExpirationDate == rhs.criteriaExpirationDate)||((this.criteriaExpirationDate!= null)&&this.criteriaExpirationDate.equals(rhs.criteriaExpirationDate)))&&((this.criteriaAtypCode == rhs.criteriaAtypCode)||((this.criteriaAtypCode!= null)&&this.criteriaAtypCode.equals(rhs.criteriaAtypCode))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.tbrmemoDesc == rhs.tbrmemoDesc)||((this.tbrmemoDesc!= null)&&this.tbrmemoDesc.equals(rhs.tbrmemoDesc))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.criteriaAmount == rhs.criteriaAmount)||((this.criteriaAmount!= null)&&this.criteriaAmount.equals(rhs.criteriaAmount))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.criteriaCreateUser == rhs.criteriaCreateUser)||((this.criteriaCreateUser!= null)&&this.criteriaCreateUser.equals(rhs.criteriaCreateUser))))&&((this.criteriaSrceCode == rhs.criteriaSrceCode)||((this.criteriaSrceCode!= null)&&this.criteriaSrceCode.equals(rhs.criteriaSrceCode))))&&((this.criteriaBillingInd == rhs.criteriaBillingInd)||((this.criteriaBillingInd!= null)&&this.criteriaBillingInd.equals(rhs.criteriaBillingInd))))&&((this.criteriaAtypSeqno == rhs.criteriaAtypSeqno)||((this.criteriaAtypSeqno!= null)&&this.criteriaAtypSeqno.equals(rhs.criteriaAtypSeqno))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.billingInd == rhs.billingInd)||((this.billingInd!= null)&&this.billingInd.equals(rhs.billingInd))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.atypSeqno == rhs.atypSeqno)||((this.atypSeqno!= null)&&this.atypSeqno.equals(rhs.atypSeqno))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
