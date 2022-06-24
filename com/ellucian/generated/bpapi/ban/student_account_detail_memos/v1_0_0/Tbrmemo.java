
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
    "amount",
    "period",
    "srceCode",
    "aidyCode",
    "detailCode",
    "activityDate",
    "crossrefNumber",
    "crossrefMemoId",
    "createUser",
    "billingInd",
    "user",
    "desc",
    "expirationDate",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbrmemo {

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
     * Period
     * <p>
     * Lineage reference object : TBRMEMO_PERIOD
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_PERIOD")
    private String period;
    /**
     * Source
     * <p>
     * Lineage reference object : TBRMEMO_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("srceCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_SRCE_CODE, Lookup lineage reference object : ttvsrce")
    private String srceCode;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRMEMO_AIDY_CODE
     * 
     */
    @JsonProperty("aidyCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_AIDY_CODE")
    private String aidyCode;
    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String detailCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBRMEMO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Cross Reference Num
     * <p>
     * Lineage reference object : TBRMEMO_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("crossrefNumber")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_CROSSREF_NUMBER")
    private Double crossrefNumber;
    /**
     * Cross Reference ID
     * <p>
     * 
     * 
     */
    @JsonProperty("crossrefMemoId")
    private String crossrefMemoId;
    /**
     * Create User
     * <p>
     * Lineage reference object : TBRMEMO_CREATE_USER
     * 
     */
    @JsonProperty("createUser")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_CREATE_USER")
    private String createUser;
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
     * Last User
     * <p>
     * Lineage reference object : TBRMEMO_USER
     * 
     */
    @JsonProperty("user")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_USER")
    private String user;
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
     * Expiration Date
     * <p>
     * Lineage reference object : TBRMEMO_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_EXPIRATION_DATE")
    private Date expirationDate;
    /**
     * Term
     * <p>
     * Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBRMEMO_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Tbrmemo withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRMEMO_PERIOD
     * 
     */
    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : TBRMEMO_PERIOD
     * 
     */
    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public Tbrmemo withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRMEMO_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("srceCode")
    public String getSrceCode() {
        return srceCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : TBRMEMO_SRCE_CODE, Lookup lineage reference object : ttvsrce
     * 
     */
    @JsonProperty("srceCode")
    public void setSrceCode(String srceCode) {
        this.srceCode = srceCode;
    }

    public Tbrmemo withSrceCode(String srceCode) {
        this.srceCode = srceCode;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRMEMO_AIDY_CODE
     * 
     */
    @JsonProperty("aidyCode")
    public String getAidyCode() {
        return aidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : TBRMEMO_AIDY_CODE
     * 
     */
    @JsonProperty("aidyCode")
    public void setAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
    }

    public Tbrmemo withAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
        return this;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Code
     * <p>
     * Lineage reference object : TBRMEMO_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbrmemo withDetailCode(String detailCode) {
        this.detailCode = detailCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBRMEMO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBRMEMO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Tbrmemo withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Cross Reference Num
     * <p>
     * Lineage reference object : TBRMEMO_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("crossrefNumber")
    public Double getCrossrefNumber() {
        return crossrefNumber;
    }

    /**
     * Cross Reference Num
     * <p>
     * Lineage reference object : TBRMEMO_CROSSREF_NUMBER
     * 
     */
    @JsonProperty("crossrefNumber")
    public void setCrossrefNumber(Double crossrefNumber) {
        this.crossrefNumber = crossrefNumber;
    }

    public Tbrmemo withCrossrefNumber(Double crossrefNumber) {
        this.crossrefNumber = crossrefNumber;
        return this;
    }

    /**
     * Cross Reference ID
     * <p>
     * 
     * 
     */
    @JsonProperty("crossrefMemoId")
    public String getCrossrefMemoId() {
        return crossrefMemoId;
    }

    /**
     * Cross Reference ID
     * <p>
     * 
     * 
     */
    @JsonProperty("crossrefMemoId")
    public void setCrossrefMemoId(String crossrefMemoId) {
        this.crossrefMemoId = crossrefMemoId;
    }

    public Tbrmemo withCrossrefMemoId(String crossrefMemoId) {
        this.crossrefMemoId = crossrefMemoId;
        return this;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : TBRMEMO_CREATE_USER
     * 
     */
    @JsonProperty("createUser")
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Create User
     * <p>
     * Lineage reference object : TBRMEMO_CREATE_USER
     * 
     */
    @JsonProperty("createUser")
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Tbrmemo withCreateUser(String createUser) {
        this.createUser = createUser;
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

    public Tbrmemo withBillingInd(String billingInd) {
        this.billingInd = billingInd;
        return this;
    }

    /**
     * Last User
     * <p>
     * Lineage reference object : TBRMEMO_USER
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * Last User
     * <p>
     * Lineage reference object : TBRMEMO_USER
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public Tbrmemo withUser(String user) {
        this.user = user;
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

    public Tbrmemo withDesc(String desc) {
        this.desc = desc;
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

    public Tbrmemo withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public Tbrmemo withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Tbrmemo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbrmemo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("aidyCode");
        sb.append('=');
        sb.append(((this.aidyCode == null)?"<null>":this.aidyCode));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("crossrefNumber");
        sb.append('=');
        sb.append(((this.crossrefNumber == null)?"<null>":this.crossrefNumber));
        sb.append(',');
        sb.append("crossrefMemoId");
        sb.append('=');
        sb.append(((this.crossrefMemoId == null)?"<null>":this.crossrefMemoId));
        sb.append(',');
        sb.append("createUser");
        sb.append('=');
        sb.append(((this.createUser == null)?"<null>":this.createUser));
        sb.append(',');
        sb.append("billingInd");
        sb.append('=');
        sb.append(((this.billingInd == null)?"<null>":this.billingInd));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.srceCode == null)? 0 :this.srceCode.hashCode()));
        result = ((result* 31)+((this.aidyCode == null)? 0 :this.aidyCode.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.crossrefNumber == null)? 0 :this.crossrefNumber.hashCode()));
        result = ((result* 31)+((this.crossrefMemoId == null)? 0 :this.crossrefMemoId.hashCode()));
        result = ((result* 31)+((this.createUser == null)? 0 :this.createUser.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.billingInd == null)? 0 :this.billingInd.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbrmemo) == false) {
            return false;
        }
        Tbrmemo rhs = ((Tbrmemo) other);
        return ((((((((((((((((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode))))&&((this.aidyCode == rhs.aidyCode)||((this.aidyCode!= null)&&this.aidyCode.equals(rhs.aidyCode))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.crossrefNumber == rhs.crossrefNumber)||((this.crossrefNumber!= null)&&this.crossrefNumber.equals(rhs.crossrefNumber))))&&((this.crossrefMemoId == rhs.crossrefMemoId)||((this.crossrefMemoId!= null)&&this.crossrefMemoId.equals(rhs.crossrefMemoId))))&&((this.createUser == rhs.createUser)||((this.createUser!= null)&&this.createUser.equals(rhs.createUser))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.billingInd == rhs.billingInd)||((this.billingInd!= null)&&this.billingInd.equals(rhs.billingInd))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
