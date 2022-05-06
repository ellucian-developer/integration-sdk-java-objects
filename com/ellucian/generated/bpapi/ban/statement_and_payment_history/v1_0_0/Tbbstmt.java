
package com.ellucian.generated.bpapi.ban.statement_and_payment_history.v1_0_0;

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
    "amountDue",
    "balance",
    "dueDate",
    "emailAddr",
    "billDate",
    "viewableInd",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Tbbstmt {

    /**
     * Amount Due
     * <p>
     * Lineage reference object : TBBSTMT_AMOUNT_DUE
     * 
     */
    @JsonProperty("amountDue")
    @JsonPropertyDescription("Lineage reference object : TBBSTMT_AMOUNT_DUE")
    private Double amountDue;
    /**
     * Balance when Billed
     * <p>
     * Lineage reference object : TBBSTMT_BALANCE
     * 
     */
    @JsonProperty("balance")
    @JsonPropertyDescription("Lineage reference object : TBBSTMT_BALANCE")
    private Double balance;
    /**
     * Due Date
     * <p>
     * Lineage reference object : TBBSTMT_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    @JsonPropertyDescription("Lineage reference object : TBBSTMT_DUE_DATE")
    private Date dueDate;
    /**
     * Email Address
     * <p>
     * Lineage reference object : TBBSTMT_EMAIL_ADDR
     * 
     */
    @JsonProperty("emailAddr")
    @JsonPropertyDescription("Lineage reference object : TBBSTMT_EMAIL_ADDR")
    private String emailAddr;
    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBBSTMT_BILL_DATE
     * (Required)
     * 
     */
    @JsonProperty("billDate")
    @JsonPropertyDescription("Lineage reference object : TBBSTMT_BILL_DATE")
    private Date billDate;
    @JsonProperty("viewableInd")
    private String viewableInd;
    /**
     * Term
     * <p>
     * Lineage reference object : TBBSTMT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : TBBSTMT_TERM_CODE")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Amount Due
     * <p>
     * Lineage reference object : TBBSTMT_AMOUNT_DUE
     * 
     */
    @JsonProperty("amountDue")
    public Double getAmountDue() {
        return amountDue;
    }

    /**
     * Amount Due
     * <p>
     * Lineage reference object : TBBSTMT_AMOUNT_DUE
     * 
     */
    @JsonProperty("amountDue")
    public void setAmountDue(Double amountDue) {
        this.amountDue = amountDue;
    }

    public Tbbstmt withAmountDue(Double amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    /**
     * Balance when Billed
     * <p>
     * Lineage reference object : TBBSTMT_BALANCE
     * 
     */
    @JsonProperty("balance")
    public Double getBalance() {
        return balance;
    }

    /**
     * Balance when Billed
     * <p>
     * Lineage reference object : TBBSTMT_BALANCE
     * 
     */
    @JsonProperty("balance")
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Tbbstmt withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : TBBSTMT_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * Due Date
     * <p>
     * Lineage reference object : TBBSTMT_DUE_DATE
     * 
     */
    @JsonProperty("dueDate")
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Tbbstmt withDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Email Address
     * <p>
     * Lineage reference object : TBBSTMT_EMAIL_ADDR
     * 
     */
    @JsonProperty("emailAddr")
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Email Address
     * <p>
     * Lineage reference object : TBBSTMT_EMAIL_ADDR
     * 
     */
    @JsonProperty("emailAddr")
    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public Tbbstmt withEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
        return this;
    }

    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBBSTMT_BILL_DATE
     * (Required)
     * 
     */
    @JsonProperty("billDate")
    public Date getBillDate() {
        return billDate;
    }

    /**
     * Bill Date
     * <p>
     * Lineage reference object : TBBSTMT_BILL_DATE
     * (Required)
     * 
     */
    @JsonProperty("billDate")
    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Tbbstmt withBillDate(Date billDate) {
        this.billDate = billDate;
        return this;
    }

    @JsonProperty("viewableInd")
    public String getViewableInd() {
        return viewableInd;
    }

    @JsonProperty("viewableInd")
    public void setViewableInd(String viewableInd) {
        this.viewableInd = viewableInd;
    }

    public Tbbstmt withViewableInd(String viewableInd) {
        this.viewableInd = viewableInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBSTMT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : TBBSTMT_TERM_CODE
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Tbbstmt withTermCode(String termCode) {
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

    public Tbbstmt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbstmt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amountDue");
        sb.append('=');
        sb.append(((this.amountDue == null)?"<null>":this.amountDue));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("emailAddr");
        sb.append('=');
        sb.append(((this.emailAddr == null)?"<null>":this.emailAddr));
        sb.append(',');
        sb.append("billDate");
        sb.append('=');
        sb.append(((this.billDate == null)?"<null>":this.billDate));
        sb.append(',');
        sb.append("viewableInd");
        sb.append('=');
        sb.append(((this.viewableInd == null)?"<null>":this.viewableInd));
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
        result = ((result* 31)+((this.amountDue == null)? 0 :this.amountDue.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.emailAddr == null)? 0 :this.emailAddr.hashCode()));
        result = ((result* 31)+((this.billDate == null)? 0 :this.billDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.viewableInd == null)? 0 :this.viewableInd.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbbstmt) == false) {
            return false;
        }
        Tbbstmt rhs = ((Tbbstmt) other);
        return (((((((((this.amountDue == rhs.amountDue)||((this.amountDue!= null)&&this.amountDue.equals(rhs.amountDue)))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.emailAddr == rhs.emailAddr)||((this.emailAddr!= null)&&this.emailAddr.equals(rhs.emailAddr))))&&((this.billDate == rhs.billDate)||((this.billDate!= null)&&this.billDate.equals(rhs.billDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.viewableInd == rhs.viewableInd)||((this.viewableInd!= null)&&this.viewableInd.equals(rhs.viewableInd))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
