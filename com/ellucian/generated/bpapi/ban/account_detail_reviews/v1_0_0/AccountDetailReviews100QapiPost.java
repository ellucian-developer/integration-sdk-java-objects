
package com.ellucian.generated.bpapi.ban.account_detail_reviews.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "holdPassword",
    "currCodeV",
    "detailCode",
    "desc",
    "termCode",
    "charge",
    "payment",
    "balance",
    "taxMethod",
    "stspKeySequence",
    "srceCode",
    "effectiveDate",
    "transDate",
    "aidyCode",
    "period",
    "receiptNumber",
    "origChgInd",
    "cpdtInd",
    "tranNumber",
    "tranNumberPaid",
    "documentNumber",
    "invoiceNumber",
    "invNumberPaid",
    "acctFeedInd",
    "feedDocCode",
    "feedDate",
    "user",
    "sessionNumber",
    "cshrEndDate",
    "entryDate",
    "tbraccdUser"
})
@Generated("jsonschema2pojo")
public class AccountDetailReviews100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("holdPassword")
    private String holdPassword;
    @JsonProperty("currCodeV")
    private String currCodeV;
    @JsonProperty("detailCode")
    private String detailCode;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("charge")
    private String charge;
    @JsonProperty("payment")
    private String payment;
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("taxMethod")
    private String taxMethod;
    @JsonProperty("stspKeySequence")
    private String stspKeySequence;
    @JsonProperty("srceCode")
    private String srceCode;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    @JsonProperty("transDate")
    private String transDate;
    @JsonProperty("aidyCode")
    private String aidyCode;
    @JsonProperty("period")
    private String period;
    @JsonProperty("receiptNumber")
    private String receiptNumber;
    @JsonProperty("origChgInd")
    private String origChgInd;
    @JsonProperty("cpdtInd")
    private String cpdtInd;
    @JsonProperty("tranNumber")
    private String tranNumber;
    @JsonProperty("tranNumberPaid")
    private String tranNumberPaid;
    @JsonProperty("documentNumber")
    private String documentNumber;
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;
    @JsonProperty("invNumberPaid")
    private String invNumberPaid;
    @JsonProperty("acctFeedInd")
    private String acctFeedInd;
    @JsonProperty("feedDocCode")
    private String feedDocCode;
    @JsonProperty("feedDate")
    private String feedDate;
    @JsonProperty("user")
    private String user;
    @JsonProperty("sessionNumber")
    private String sessionNumber;
    @JsonProperty("cshrEndDate")
    private String cshrEndDate;
    @JsonProperty("entryDate")
    private String entryDate;
    @JsonProperty("tbraccdUser")
    private String tbraccdUser;
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

    public AccountDetailReviews100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("holdPassword")
    public String getHoldPassword() {
        return holdPassword;
    }

    @JsonProperty("holdPassword")
    public void setHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
    }

    public AccountDetailReviews100QapiPost withHoldPassword(String holdPassword) {
        this.holdPassword = holdPassword;
        return this;
    }

    @JsonProperty("currCodeV")
    public String getCurrCodeV() {
        return currCodeV;
    }

    @JsonProperty("currCodeV")
    public void setCurrCodeV(String currCodeV) {
        this.currCodeV = currCodeV;
    }

    public AccountDetailReviews100QapiPost withCurrCodeV(String currCodeV) {
        this.currCodeV = currCodeV;
        return this;
    }

    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public AccountDetailReviews100QapiPost withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public AccountDetailReviews100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public AccountDetailReviews100QapiPost withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    @JsonProperty("charge")
    public String getCharge() {
        return charge;
    }

    @JsonProperty("charge")
    public void setCharge(String charge) {
        this.charge = charge;
    }

    public AccountDetailReviews100QapiPost withCharge(String charge) {
        this.charge = charge;
        return this;
    }

    @JsonProperty("payment")
    public String getPayment() {
        return payment;
    }

    @JsonProperty("payment")
    public void setPayment(String payment) {
        this.payment = payment;
    }

    public AccountDetailReviews100QapiPost withPayment(String payment) {
        this.payment = payment;
        return this;
    }

    @JsonProperty("balance")
    public String getBalance() {
        return balance;
    }

    @JsonProperty("balance")
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public AccountDetailReviews100QapiPost withBalance(String balance) {
        this.balance = balance;
        return this;
    }

    @JsonProperty("taxMethod")
    public String getTaxMethod() {
        return taxMethod;
    }

    @JsonProperty("taxMethod")
    public void setTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
    }

    public AccountDetailReviews100QapiPost withTaxMethod(String taxMethod) {
        this.taxMethod = taxMethod;
        return this;
    }

    @JsonProperty("stspKeySequence")
    public String getStspKeySequence() {
        return stspKeySequence;
    }

    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(String stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public AccountDetailReviews100QapiPost withStspKeySequence(String stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    @JsonProperty("srceCode")
    public String getSrceCode() {
        return srceCode;
    }

    @JsonProperty("srceCode")
    public void setSrceCode(String srceCode) {
        this.srceCode = srceCode;
    }

    public AccountDetailReviews100QapiPost withSrceCode(String srceCode) {
        this.srceCode = srceCode;
        return this;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public AccountDetailReviews100QapiPost withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    @JsonProperty("transDate")
    public String getTransDate() {
        return transDate;
    }

    @JsonProperty("transDate")
    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public AccountDetailReviews100QapiPost withTransDate(String transDate) {
        this.transDate = transDate;
        return this;
    }

    @JsonProperty("aidyCode")
    public String getAidyCode() {
        return aidyCode;
    }

    @JsonProperty("aidyCode")
    public void setAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
    }

    public AccountDetailReviews100QapiPost withAidyCode(String aidyCode) {
        this.aidyCode = aidyCode;
        return this;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public AccountDetailReviews100QapiPost withPeriod(String period) {
        this.period = period;
        return this;
    }

    @JsonProperty("receiptNumber")
    public String getReceiptNumber() {
        return receiptNumber;
    }

    @JsonProperty("receiptNumber")
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public AccountDetailReviews100QapiPost withReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
        return this;
    }

    @JsonProperty("origChgInd")
    public String getOrigChgInd() {
        return origChgInd;
    }

    @JsonProperty("origChgInd")
    public void setOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
    }

    public AccountDetailReviews100QapiPost withOrigChgInd(String origChgInd) {
        this.origChgInd = origChgInd;
        return this;
    }

    @JsonProperty("cpdtInd")
    public String getCpdtInd() {
        return cpdtInd;
    }

    @JsonProperty("cpdtInd")
    public void setCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
    }

    public AccountDetailReviews100QapiPost withCpdtInd(String cpdtInd) {
        this.cpdtInd = cpdtInd;
        return this;
    }

    @JsonProperty("tranNumber")
    public String getTranNumber() {
        return tranNumber;
    }

    @JsonProperty("tranNumber")
    public void setTranNumber(String tranNumber) {
        this.tranNumber = tranNumber;
    }

    public AccountDetailReviews100QapiPost withTranNumber(String tranNumber) {
        this.tranNumber = tranNumber;
        return this;
    }

    @JsonProperty("tranNumberPaid")
    public String getTranNumberPaid() {
        return tranNumberPaid;
    }

    @JsonProperty("tranNumberPaid")
    public void setTranNumberPaid(String tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
    }

    public AccountDetailReviews100QapiPost withTranNumberPaid(String tranNumberPaid) {
        this.tranNumberPaid = tranNumberPaid;
        return this;
    }

    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public AccountDetailReviews100QapiPost withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    @JsonProperty("invoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    @JsonProperty("invoiceNumber")
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public AccountDetailReviews100QapiPost withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    @JsonProperty("invNumberPaid")
    public String getInvNumberPaid() {
        return invNumberPaid;
    }

    @JsonProperty("invNumberPaid")
    public void setInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
    }

    public AccountDetailReviews100QapiPost withInvNumberPaid(String invNumberPaid) {
        this.invNumberPaid = invNumberPaid;
        return this;
    }

    @JsonProperty("acctFeedInd")
    public String getAcctFeedInd() {
        return acctFeedInd;
    }

    @JsonProperty("acctFeedInd")
    public void setAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
    }

    public AccountDetailReviews100QapiPost withAcctFeedInd(String acctFeedInd) {
        this.acctFeedInd = acctFeedInd;
        return this;
    }

    @JsonProperty("feedDocCode")
    public String getFeedDocCode() {
        return feedDocCode;
    }

    @JsonProperty("feedDocCode")
    public void setFeedDocCode(String feedDocCode) {
        this.feedDocCode = feedDocCode;
    }

    public AccountDetailReviews100QapiPost withFeedDocCode(String feedDocCode) {
        this.feedDocCode = feedDocCode;
        return this;
    }

    @JsonProperty("feedDate")
    public String getFeedDate() {
        return feedDate;
    }

    @JsonProperty("feedDate")
    public void setFeedDate(String feedDate) {
        this.feedDate = feedDate;
    }

    public AccountDetailReviews100QapiPost withFeedDate(String feedDate) {
        this.feedDate = feedDate;
        return this;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public AccountDetailReviews100QapiPost withUser(String user) {
        this.user = user;
        return this;
    }

    @JsonProperty("sessionNumber")
    public String getSessionNumber() {
        return sessionNumber;
    }

    @JsonProperty("sessionNumber")
    public void setSessionNumber(String sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public AccountDetailReviews100QapiPost withSessionNumber(String sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }

    @JsonProperty("cshrEndDate")
    public String getCshrEndDate() {
        return cshrEndDate;
    }

    @JsonProperty("cshrEndDate")
    public void setCshrEndDate(String cshrEndDate) {
        this.cshrEndDate = cshrEndDate;
    }

    public AccountDetailReviews100QapiPost withCshrEndDate(String cshrEndDate) {
        this.cshrEndDate = cshrEndDate;
        return this;
    }

    @JsonProperty("entryDate")
    public String getEntryDate() {
        return entryDate;
    }

    @JsonProperty("entryDate")
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public AccountDetailReviews100QapiPost withEntryDate(String entryDate) {
        this.entryDate = entryDate;
        return this;
    }

    @JsonProperty("tbraccdUser")
    public String getTbraccdUser() {
        return tbraccdUser;
    }

    @JsonProperty("tbraccdUser")
    public void setTbraccdUser(String tbraccdUser) {
        this.tbraccdUser = tbraccdUser;
    }

    public AccountDetailReviews100QapiPost withTbraccdUser(String tbraccdUser) {
        this.tbraccdUser = tbraccdUser;
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

    public AccountDetailReviews100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountDetailReviews100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("holdPassword");
        sb.append('=');
        sb.append(((this.holdPassword == null)?"<null>":this.holdPassword));
        sb.append(',');
        sb.append("currCodeV");
        sb.append('=');
        sb.append(((this.currCodeV == null)?"<null>":this.currCodeV));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("charge");
        sb.append('=');
        sb.append(((this.charge == null)?"<null>":this.charge));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("balance");
        sb.append('=');
        sb.append(((this.balance == null)?"<null>":this.balance));
        sb.append(',');
        sb.append("taxMethod");
        sb.append('=');
        sb.append(((this.taxMethod == null)?"<null>":this.taxMethod));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("srceCode");
        sb.append('=');
        sb.append(((this.srceCode == null)?"<null>":this.srceCode));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("aidyCode");
        sb.append('=');
        sb.append(((this.aidyCode == null)?"<null>":this.aidyCode));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("receiptNumber");
        sb.append('=');
        sb.append(((this.receiptNumber == null)?"<null>":this.receiptNumber));
        sb.append(',');
        sb.append("origChgInd");
        sb.append('=');
        sb.append(((this.origChgInd == null)?"<null>":this.origChgInd));
        sb.append(',');
        sb.append("cpdtInd");
        sb.append('=');
        sb.append(((this.cpdtInd == null)?"<null>":this.cpdtInd));
        sb.append(',');
        sb.append("tranNumber");
        sb.append('=');
        sb.append(((this.tranNumber == null)?"<null>":this.tranNumber));
        sb.append(',');
        sb.append("tranNumberPaid");
        sb.append('=');
        sb.append(((this.tranNumberPaid == null)?"<null>":this.tranNumberPaid));
        sb.append(',');
        sb.append("documentNumber");
        sb.append('=');
        sb.append(((this.documentNumber == null)?"<null>":this.documentNumber));
        sb.append(',');
        sb.append("invoiceNumber");
        sb.append('=');
        sb.append(((this.invoiceNumber == null)?"<null>":this.invoiceNumber));
        sb.append(',');
        sb.append("invNumberPaid");
        sb.append('=');
        sb.append(((this.invNumberPaid == null)?"<null>":this.invNumberPaid));
        sb.append(',');
        sb.append("acctFeedInd");
        sb.append('=');
        sb.append(((this.acctFeedInd == null)?"<null>":this.acctFeedInd));
        sb.append(',');
        sb.append("feedDocCode");
        sb.append('=');
        sb.append(((this.feedDocCode == null)?"<null>":this.feedDocCode));
        sb.append(',');
        sb.append("feedDate");
        sb.append('=');
        sb.append(((this.feedDate == null)?"<null>":this.feedDate));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("sessionNumber");
        sb.append('=');
        sb.append(((this.sessionNumber == null)?"<null>":this.sessionNumber));
        sb.append(',');
        sb.append("cshrEndDate");
        sb.append('=');
        sb.append(((this.cshrEndDate == null)?"<null>":this.cshrEndDate));
        sb.append(',');
        sb.append("entryDate");
        sb.append('=');
        sb.append(((this.entryDate == null)?"<null>":this.entryDate));
        sb.append(',');
        sb.append("tbraccdUser");
        sb.append('=');
        sb.append(((this.tbraccdUser == null)?"<null>":this.tbraccdUser));
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
        result = ((result* 31)+((this.srceCode == null)? 0 :this.srceCode.hashCode()));
        result = ((result* 31)+((this.taxMethod == null)? 0 :this.taxMethod.hashCode()));
        result = ((result* 31)+((this.documentNumber == null)? 0 :this.documentNumber.hashCode()));
        result = ((result* 31)+((this.balance == null)? 0 :this.balance.hashCode()));
        result = ((result* 31)+((this.holdPassword == null)? 0 :this.holdPassword.hashCode()));
        result = ((result* 31)+((this.acctFeedInd == null)? 0 :this.acctFeedInd.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.invoiceNumber == null)? 0 :this.invoiceNumber.hashCode()));
        result = ((result* 31)+((this.tbraccdUser == null)? 0 :this.tbraccdUser.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tranNumberPaid == null)? 0 :this.tranNumberPaid.hashCode()));
        result = ((result* 31)+((this.receiptNumber == null)? 0 :this.receiptNumber.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.charge == null)? 0 :this.charge.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.currCodeV == null)? 0 :this.currCodeV.hashCode()));
        result = ((result* 31)+((this.aidyCode == null)? 0 :this.aidyCode.hashCode()));
        result = ((result* 31)+((this.feedDate == null)? 0 :this.feedDate.hashCode()));
        result = ((result* 31)+((this.entryDate == null)? 0 :this.entryDate.hashCode()));
        result = ((result* 31)+((this.tranNumber == null)? 0 :this.tranNumber.hashCode()));
        result = ((result* 31)+((this.cshrEndDate == null)? 0 :this.cshrEndDate.hashCode()));
        result = ((result* 31)+((this.invNumberPaid == null)? 0 :this.invNumberPaid.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.origChgInd == null)? 0 :this.origChgInd.hashCode()));
        result = ((result* 31)+((this.feedDocCode == null)? 0 :this.feedDocCode.hashCode()));
        result = ((result* 31)+((this.sessionNumber == null)? 0 :this.sessionNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cpdtInd == null)? 0 :this.cpdtInd.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountDetailReviews100QapiPost) == false) {
            return false;
        }
        AccountDetailReviews100QapiPost rhs = ((AccountDetailReviews100QapiPost) other);
        return ((((((((((((((((((((((((((((((((((this.srceCode == rhs.srceCode)||((this.srceCode!= null)&&this.srceCode.equals(rhs.srceCode)))&&((this.taxMethod == rhs.taxMethod)||((this.taxMethod!= null)&&this.taxMethod.equals(rhs.taxMethod))))&&((this.documentNumber == rhs.documentNumber)||((this.documentNumber!= null)&&this.documentNumber.equals(rhs.documentNumber))))&&((this.balance == rhs.balance)||((this.balance!= null)&&this.balance.equals(rhs.balance))))&&((this.holdPassword == rhs.holdPassword)||((this.holdPassword!= null)&&this.holdPassword.equals(rhs.holdPassword))))&&((this.acctFeedInd == rhs.acctFeedInd)||((this.acctFeedInd!= null)&&this.acctFeedInd.equals(rhs.acctFeedInd))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.invoiceNumber == rhs.invoiceNumber)||((this.invoiceNumber!= null)&&this.invoiceNumber.equals(rhs.invoiceNumber))))&&((this.tbraccdUser == rhs.tbraccdUser)||((this.tbraccdUser!= null)&&this.tbraccdUser.equals(rhs.tbraccdUser))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tranNumberPaid == rhs.tranNumberPaid)||((this.tranNumberPaid!= null)&&this.tranNumberPaid.equals(rhs.tranNumberPaid))))&&((this.receiptNumber == rhs.receiptNumber)||((this.receiptNumber!= null)&&this.receiptNumber.equals(rhs.receiptNumber))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.charge == rhs.charge)||((this.charge!= null)&&this.charge.equals(rhs.charge))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.currCodeV == rhs.currCodeV)||((this.currCodeV!= null)&&this.currCodeV.equals(rhs.currCodeV))))&&((this.aidyCode == rhs.aidyCode)||((this.aidyCode!= null)&&this.aidyCode.equals(rhs.aidyCode))))&&((this.feedDate == rhs.feedDate)||((this.feedDate!= null)&&this.feedDate.equals(rhs.feedDate))))&&((this.entryDate == rhs.entryDate)||((this.entryDate!= null)&&this.entryDate.equals(rhs.entryDate))))&&((this.tranNumber == rhs.tranNumber)||((this.tranNumber!= null)&&this.tranNumber.equals(rhs.tranNumber))))&&((this.cshrEndDate == rhs.cshrEndDate)||((this.cshrEndDate!= null)&&this.cshrEndDate.equals(rhs.cshrEndDate))))&&((this.invNumberPaid == rhs.invNumberPaid)||((this.invNumberPaid!= null)&&this.invNumberPaid.equals(rhs.invNumberPaid))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.origChgInd == rhs.origChgInd)||((this.origChgInd!= null)&&this.origChgInd.equals(rhs.origChgInd))))&&((this.feedDocCode == rhs.feedDocCode)||((this.feedDocCode!= null)&&this.feedDocCode.equals(rhs.feedDocCode))))&&((this.sessionNumber == rhs.sessionNumber)||((this.sessionNumber!= null)&&this.sessionNumber.equals(rhs.sessionNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cpdtInd == rhs.cpdtInd)||((this.cpdtInd!= null)&&this.cpdtInd.equals(rhs.cpdtInd))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
