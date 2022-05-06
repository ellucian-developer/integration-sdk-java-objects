
package com.ellucian.generated.bpapi.ban.finance_account_reviews.v1_0_0;

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
    "colcId",
    "criteria.deliCode",
    "deliCode",
    "criteria.refundInd",
    "criteria.colcId",
    "refundInd",
    "billCode",
    "id",
    "criteria.billCode"
})
@Generated("jsonschema2pojo")
public class FinanceAccountReviews100PutRequest {

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("colcId")
    private String colcId;
    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("criteria.deliCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli")
    private String criteriaDeliCode;
    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("deliCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli")
    private String deliCode;
    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("criteria.refundInd")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_REFUND_IND")
    private String criteriaRefundInd;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.colcId")
    private String criteriaColcId;
    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_REFUND_IND")
    private String refundInd;
    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill")
    private String billCode;
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
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("criteria.billCode")
    @JsonPropertyDescription("Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill")
    private String criteriaBillCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("colcId")
    public String getColcId() {
        return colcId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("colcId")
    public void setColcId(String colcId) {
        this.colcId = colcId;
    }

    public FinanceAccountReviews100PutRequest withColcId(String colcId) {
        this.colcId = colcId;
        return this;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("criteria.deliCode")
    public String getCriteriaDeliCode() {
        return criteriaDeliCode;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("criteria.deliCode")
    public void setCriteriaDeliCode(String criteriaDeliCode) {
        this.criteriaDeliCode = criteriaDeliCode;
    }

    public FinanceAccountReviews100PutRequest withCriteriaDeliCode(String criteriaDeliCode) {
        this.criteriaDeliCode = criteriaDeliCode;
        return this;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("deliCode")
    public String getDeliCode() {
        return deliCode;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : TBBACCT_DELI_CODE, Lookup lineage reference object : ttvdeli
     * 
     */
    @JsonProperty("deliCode")
    public void setDeliCode(String deliCode) {
        this.deliCode = deliCode;
    }

    public FinanceAccountReviews100PutRequest withDeliCode(String deliCode) {
        this.deliCode = deliCode;
        return this;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("criteria.refundInd")
    public String getCriteriaRefundInd() {
        return criteriaRefundInd;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("criteria.refundInd")
    public void setCriteriaRefundInd(String criteriaRefundInd) {
        this.criteriaRefundInd = criteriaRefundInd;
    }

    public FinanceAccountReviews100PutRequest withCriteriaRefundInd(String criteriaRefundInd) {
        this.criteriaRefundInd = criteriaRefundInd;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.colcId")
    public String getCriteriaColcId() {
        return criteriaColcId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.colcId")
    public void setCriteriaColcId(String criteriaColcId) {
        this.criteriaColcId = criteriaColcId;
    }

    public FinanceAccountReviews100PutRequest withCriteriaColcId(String criteriaColcId) {
        this.criteriaColcId = criteriaColcId;
        return this;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public String getRefundInd() {
        return refundInd;
    }

    /**
     * Refund Account
     * <p>
     * Lineage reference object : TBBACCT_REFUND_IND
     * 
     */
    @JsonProperty("refundInd")
    public void setRefundInd(String refundInd) {
        this.refundInd = refundInd;
    }

    public FinanceAccountReviews100PutRequest withRefundInd(String refundInd) {
        this.refundInd = refundInd;
        return this;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    public String getBillCode() {
        return billCode;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("billCode")
    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public FinanceAccountReviews100PutRequest withBillCode(String billCode) {
        this.billCode = billCode;
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

    public FinanceAccountReviews100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("criteria.billCode")
    public String getCriteriaBillCode() {
        return criteriaBillCode;
    }

    /**
     * Bill Code
     * <p>
     * Lineage reference object : TBBACCT_BILL_CODE, Lookup lineage reference object : ttvbill
     * 
     */
    @JsonProperty("criteria.billCode")
    public void setCriteriaBillCode(String criteriaBillCode) {
        this.criteriaBillCode = criteriaBillCode;
    }

    public FinanceAccountReviews100PutRequest withCriteriaBillCode(String criteriaBillCode) {
        this.criteriaBillCode = criteriaBillCode;
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

    public FinanceAccountReviews100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceAccountReviews100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("colcId");
        sb.append('=');
        sb.append(((this.colcId == null)?"<null>":this.colcId));
        sb.append(',');
        sb.append("criteriaDeliCode");
        sb.append('=');
        sb.append(((this.criteriaDeliCode == null)?"<null>":this.criteriaDeliCode));
        sb.append(',');
        sb.append("deliCode");
        sb.append('=');
        sb.append(((this.deliCode == null)?"<null>":this.deliCode));
        sb.append(',');
        sb.append("criteriaRefundInd");
        sb.append('=');
        sb.append(((this.criteriaRefundInd == null)?"<null>":this.criteriaRefundInd));
        sb.append(',');
        sb.append("criteriaColcId");
        sb.append('=');
        sb.append(((this.criteriaColcId == null)?"<null>":this.criteriaColcId));
        sb.append(',');
        sb.append("refundInd");
        sb.append('=');
        sb.append(((this.refundInd == null)?"<null>":this.refundInd));
        sb.append(',');
        sb.append("billCode");
        sb.append('=');
        sb.append(((this.billCode == null)?"<null>":this.billCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaBillCode");
        sb.append('=');
        sb.append(((this.criteriaBillCode == null)?"<null>":this.criteriaBillCode));
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
        result = ((result* 31)+((this.colcId == null)? 0 :this.colcId.hashCode()));
        result = ((result* 31)+((this.criteriaDeliCode == null)? 0 :this.criteriaDeliCode.hashCode()));
        result = ((result* 31)+((this.deliCode == null)? 0 :this.deliCode.hashCode()));
        result = ((result* 31)+((this.criteriaColcId == null)? 0 :this.criteriaColcId.hashCode()));
        result = ((result* 31)+((this.refundInd == null)? 0 :this.refundInd.hashCode()));
        result = ((result* 31)+((this.billCode == null)? 0 :this.billCode.hashCode()));
        result = ((result* 31)+((this.criteriaBillCode == null)? 0 :this.criteriaBillCode.hashCode()));
        result = ((result* 31)+((this.criteriaRefundInd == null)? 0 :this.criteriaRefundInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceAccountReviews100PutRequest) == false) {
            return false;
        }
        FinanceAccountReviews100PutRequest rhs = ((FinanceAccountReviews100PutRequest) other);
        return (((((((((((this.colcId == rhs.colcId)||((this.colcId!= null)&&this.colcId.equals(rhs.colcId)))&&((this.criteriaDeliCode == rhs.criteriaDeliCode)||((this.criteriaDeliCode!= null)&&this.criteriaDeliCode.equals(rhs.criteriaDeliCode))))&&((this.deliCode == rhs.deliCode)||((this.deliCode!= null)&&this.deliCode.equals(rhs.deliCode))))&&((this.criteriaColcId == rhs.criteriaColcId)||((this.criteriaColcId!= null)&&this.criteriaColcId.equals(rhs.criteriaColcId))))&&((this.refundInd == rhs.refundInd)||((this.refundInd!= null)&&this.refundInd.equals(rhs.refundInd))))&&((this.billCode == rhs.billCode)||((this.billCode!= null)&&this.billCode.equals(rhs.billCode))))&&((this.criteriaBillCode == rhs.criteriaBillCode)||((this.criteriaBillCode!= null)&&this.criteriaBillCode.equals(rhs.criteriaBillCode))))&&((this.criteriaRefundInd == rhs.criteriaRefundInd)||((this.criteriaRefundInd!= null)&&this.criteriaRefundInd.equals(rhs.criteriaRefundInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
