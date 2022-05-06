
package com.ellucian.generated.bpapi.ban.student_payment.v1_0_0;

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
    "finaidTotalComm",
    "colcActivityDate",
    "controlReceiptNumber",
    "futureTermDue",
    "memoBalance",
    "finaidTotalMemos",
    "totalDue",
    "totalTermChg",
    "totalBillHours",
    "billHours",
    "nsfCount",
    "termCredits",
    "deliCode",
    "futureFutureDue",
    "finAid",
    "acceptCreditInd",
    "currentTermCharges",
    "arBalance"
})
@Generated("jsonschema2pojo")
public class AccountCtrl__1 {

    /**
     * Authorized
     * <p>
     * Lineage reference object : finaidTotalComm
     * 
     */
    @JsonProperty("finaidTotalComm")
    @JsonPropertyDescription("Lineage reference object : finaidTotalComm")
    private Object finaidTotalComm;
    /**
     * Collection Date
     * <p>
     * Lineage reference object : colcActivityDate
     * 
     */
    @JsonProperty("colcActivityDate")
    @JsonPropertyDescription("Lineage reference object : colcActivityDate")
    private Object colcActivityDate;
    /**
     * Receipt Number
     * <p>
     * Lineage reference object : controlReceiptNumber
     * 
     */
    @JsonProperty("controlReceiptNumber")
    @JsonPropertyDescription("Lineage reference object : controlReceiptNumber")
    private Object controlReceiptNumber;
    /**
     * Future Dated Current Term
     * <p>
     * Lineage reference object : futureTermDue
     * 
     */
    @JsonProperty("futureTermDue")
    @JsonPropertyDescription("Lineage reference object : futureTermDue")
    private Object futureTermDue;
    /**
     * Memo Balance
     * <p>
     * Lineage reference object : memoBalance
     * 
     */
    @JsonProperty("memoBalance")
    @JsonPropertyDescription("Lineage reference object : memoBalance")
    private Object memoBalance;
    /**
     * Memos
     * <p>
     * Lineage reference object : finaidTotalMemos
     * 
     */
    @JsonProperty("finaidTotalMemos")
    @JsonPropertyDescription("Lineage reference object : finaidTotalMemos")
    private Object finaidTotalMemos;
    /**
     * Amount Due
     * <p>
     * Lineage reference object : totalDue
     * 
     */
    @JsonProperty("totalDue")
    @JsonPropertyDescription("Lineage reference object : totalDue")
    private Object totalDue;
    /**
     * Term Charges
     * <p>
     * Lineage reference object : totalTermChg
     * 
     */
    @JsonProperty("totalTermChg")
    @JsonPropertyDescription("Lineage reference object : totalTermChg")
    private Object totalTermChg;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : totalBillHours
     * 
     */
    @JsonProperty("totalBillHours")
    @JsonPropertyDescription("Lineage reference object : totalBillHours")
    private Object totalBillHours;
    /**
     * Bill Hours
     * <p>
     * Lineage reference object : billHours
     * 
     */
    @JsonProperty("billHours")
    @JsonPropertyDescription("Lineage reference object : billHours")
    private Object billHours;
    /**
     * NSF
     * <p>
     * Lineage reference object : nsfCount
     * 
     */
    @JsonProperty("nsfCount")
    @JsonPropertyDescription("Lineage reference object : nsfCount")
    private Object nsfCount;
    /**
     * Current Term Credit
     * <p>
     * Lineage reference object : termCredits
     * 
     */
    @JsonProperty("termCredits")
    @JsonPropertyDescription("Lineage reference object : termCredits")
    private Object termCredits;
    /**
     * Delinquency
     * <p>
     * Lineage reference object : deliCode
     * 
     */
    @JsonProperty("deliCode")
    @JsonPropertyDescription("Lineage reference object : deliCode")
    private Object deliCode;
    /**
     * Future Dated Other Terms
     * <p>
     * Lineage reference object : futureFutureDue
     * 
     */
    @JsonProperty("futureFutureDue")
    @JsonPropertyDescription("Lineage reference object : futureFutureDue")
    private Object futureFutureDue;
    /**
     * Lineage reference object : finAid
     * 
     */
    @JsonProperty("finAid")
    @JsonPropertyDescription("Lineage reference object : finAid")
    private Object finAid;
    /**
     * Accept Charges
     * <p>
     * Lineage reference object : acceptCreditInd
     * 
     */
    @JsonProperty("acceptCreditInd")
    @JsonPropertyDescription("Lineage reference object : acceptCreditInd")
    private Object acceptCreditInd;
    /**
     * Current Term Charge
     * <p>
     * Lineage reference object : currentTermCharges
     * 
     */
    @JsonProperty("currentTermCharges")
    @JsonPropertyDescription("Lineage reference object : currentTermCharges")
    private Object currentTermCharges;
    /**
     * Balance Other Terms
     * <p>
     * Lineage reference object : arBalance
     * 
     */
    @JsonProperty("arBalance")
    @JsonPropertyDescription("Lineage reference object : arBalance")
    private Object arBalance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Authorized
     * <p>
     * Lineage reference object : finaidTotalComm
     * 
     */
    @JsonProperty("finaidTotalComm")
    public Object getFinaidTotalComm() {
        return finaidTotalComm;
    }

    /**
     * Authorized
     * <p>
     * Lineage reference object : finaidTotalComm
     * 
     */
    @JsonProperty("finaidTotalComm")
    public void setFinaidTotalComm(Object finaidTotalComm) {
        this.finaidTotalComm = finaidTotalComm;
    }

    public AccountCtrl__1 withFinaidTotalComm(Object finaidTotalComm) {
        this.finaidTotalComm = finaidTotalComm;
        return this;
    }

    /**
     * Collection Date
     * <p>
     * Lineage reference object : colcActivityDate
     * 
     */
    @JsonProperty("colcActivityDate")
    public Object getColcActivityDate() {
        return colcActivityDate;
    }

    /**
     * Collection Date
     * <p>
     * Lineage reference object : colcActivityDate
     * 
     */
    @JsonProperty("colcActivityDate")
    public void setColcActivityDate(Object colcActivityDate) {
        this.colcActivityDate = colcActivityDate;
    }

    public AccountCtrl__1 withColcActivityDate(Object colcActivityDate) {
        this.colcActivityDate = colcActivityDate;
        return this;
    }

    /**
     * Receipt Number
     * <p>
     * Lineage reference object : controlReceiptNumber
     * 
     */
    @JsonProperty("controlReceiptNumber")
    public Object getControlReceiptNumber() {
        return controlReceiptNumber;
    }

    /**
     * Receipt Number
     * <p>
     * Lineage reference object : controlReceiptNumber
     * 
     */
    @JsonProperty("controlReceiptNumber")
    public void setControlReceiptNumber(Object controlReceiptNumber) {
        this.controlReceiptNumber = controlReceiptNumber;
    }

    public AccountCtrl__1 withControlReceiptNumber(Object controlReceiptNumber) {
        this.controlReceiptNumber = controlReceiptNumber;
        return this;
    }

    /**
     * Future Dated Current Term
     * <p>
     * Lineage reference object : futureTermDue
     * 
     */
    @JsonProperty("futureTermDue")
    public Object getFutureTermDue() {
        return futureTermDue;
    }

    /**
     * Future Dated Current Term
     * <p>
     * Lineage reference object : futureTermDue
     * 
     */
    @JsonProperty("futureTermDue")
    public void setFutureTermDue(Object futureTermDue) {
        this.futureTermDue = futureTermDue;
    }

    public AccountCtrl__1 withFutureTermDue(Object futureTermDue) {
        this.futureTermDue = futureTermDue;
        return this;
    }

    /**
     * Memo Balance
     * <p>
     * Lineage reference object : memoBalance
     * 
     */
    @JsonProperty("memoBalance")
    public Object getMemoBalance() {
        return memoBalance;
    }

    /**
     * Memo Balance
     * <p>
     * Lineage reference object : memoBalance
     * 
     */
    @JsonProperty("memoBalance")
    public void setMemoBalance(Object memoBalance) {
        this.memoBalance = memoBalance;
    }

    public AccountCtrl__1 withMemoBalance(Object memoBalance) {
        this.memoBalance = memoBalance;
        return this;
    }

    /**
     * Memos
     * <p>
     * Lineage reference object : finaidTotalMemos
     * 
     */
    @JsonProperty("finaidTotalMemos")
    public Object getFinaidTotalMemos() {
        return finaidTotalMemos;
    }

    /**
     * Memos
     * <p>
     * Lineage reference object : finaidTotalMemos
     * 
     */
    @JsonProperty("finaidTotalMemos")
    public void setFinaidTotalMemos(Object finaidTotalMemos) {
        this.finaidTotalMemos = finaidTotalMemos;
    }

    public AccountCtrl__1 withFinaidTotalMemos(Object finaidTotalMemos) {
        this.finaidTotalMemos = finaidTotalMemos;
        return this;
    }

    /**
     * Amount Due
     * <p>
     * Lineage reference object : totalDue
     * 
     */
    @JsonProperty("totalDue")
    public Object getTotalDue() {
        return totalDue;
    }

    /**
     * Amount Due
     * <p>
     * Lineage reference object : totalDue
     * 
     */
    @JsonProperty("totalDue")
    public void setTotalDue(Object totalDue) {
        this.totalDue = totalDue;
    }

    public AccountCtrl__1 withTotalDue(Object totalDue) {
        this.totalDue = totalDue;
        return this;
    }

    /**
     * Term Charges
     * <p>
     * Lineage reference object : totalTermChg
     * 
     */
    @JsonProperty("totalTermChg")
    public Object getTotalTermChg() {
        return totalTermChg;
    }

    /**
     * Term Charges
     * <p>
     * Lineage reference object : totalTermChg
     * 
     */
    @JsonProperty("totalTermChg")
    public void setTotalTermChg(Object totalTermChg) {
        this.totalTermChg = totalTermChg;
    }

    public AccountCtrl__1 withTotalTermChg(Object totalTermChg) {
        this.totalTermChg = totalTermChg;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : totalBillHours
     * 
     */
    @JsonProperty("totalBillHours")
    public Object getTotalBillHours() {
        return totalBillHours;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : totalBillHours
     * 
     */
    @JsonProperty("totalBillHours")
    public void setTotalBillHours(Object totalBillHours) {
        this.totalBillHours = totalBillHours;
    }

    public AccountCtrl__1 withTotalBillHours(Object totalBillHours) {
        this.totalBillHours = totalBillHours;
        return this;
    }

    /**
     * Bill Hours
     * <p>
     * Lineage reference object : billHours
     * 
     */
    @JsonProperty("billHours")
    public Object getBillHours() {
        return billHours;
    }

    /**
     * Bill Hours
     * <p>
     * Lineage reference object : billHours
     * 
     */
    @JsonProperty("billHours")
    public void setBillHours(Object billHours) {
        this.billHours = billHours;
    }

    public AccountCtrl__1 withBillHours(Object billHours) {
        this.billHours = billHours;
        return this;
    }

    /**
     * NSF
     * <p>
     * Lineage reference object : nsfCount
     * 
     */
    @JsonProperty("nsfCount")
    public Object getNsfCount() {
        return nsfCount;
    }

    /**
     * NSF
     * <p>
     * Lineage reference object : nsfCount
     * 
     */
    @JsonProperty("nsfCount")
    public void setNsfCount(Object nsfCount) {
        this.nsfCount = nsfCount;
    }

    public AccountCtrl__1 withNsfCount(Object nsfCount) {
        this.nsfCount = nsfCount;
        return this;
    }

    /**
     * Current Term Credit
     * <p>
     * Lineage reference object : termCredits
     * 
     */
    @JsonProperty("termCredits")
    public Object getTermCredits() {
        return termCredits;
    }

    /**
     * Current Term Credit
     * <p>
     * Lineage reference object : termCredits
     * 
     */
    @JsonProperty("termCredits")
    public void setTermCredits(Object termCredits) {
        this.termCredits = termCredits;
    }

    public AccountCtrl__1 withTermCredits(Object termCredits) {
        this.termCredits = termCredits;
        return this;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : deliCode
     * 
     */
    @JsonProperty("deliCode")
    public Object getDeliCode() {
        return deliCode;
    }

    /**
     * Delinquency
     * <p>
     * Lineage reference object : deliCode
     * 
     */
    @JsonProperty("deliCode")
    public void setDeliCode(Object deliCode) {
        this.deliCode = deliCode;
    }

    public AccountCtrl__1 withDeliCode(Object deliCode) {
        this.deliCode = deliCode;
        return this;
    }

    /**
     * Future Dated Other Terms
     * <p>
     * Lineage reference object : futureFutureDue
     * 
     */
    @JsonProperty("futureFutureDue")
    public Object getFutureFutureDue() {
        return futureFutureDue;
    }

    /**
     * Future Dated Other Terms
     * <p>
     * Lineage reference object : futureFutureDue
     * 
     */
    @JsonProperty("futureFutureDue")
    public void setFutureFutureDue(Object futureFutureDue) {
        this.futureFutureDue = futureFutureDue;
    }

    public AccountCtrl__1 withFutureFutureDue(Object futureFutureDue) {
        this.futureFutureDue = futureFutureDue;
        return this;
    }

    /**
     * Lineage reference object : finAid
     * 
     */
    @JsonProperty("finAid")
    public Object getFinAid() {
        return finAid;
    }

    /**
     * Lineage reference object : finAid
     * 
     */
    @JsonProperty("finAid")
    public void setFinAid(Object finAid) {
        this.finAid = finAid;
    }

    public AccountCtrl__1 withFinAid(Object finAid) {
        this.finAid = finAid;
        return this;
    }

    /**
     * Accept Charges
     * <p>
     * Lineage reference object : acceptCreditInd
     * 
     */
    @JsonProperty("acceptCreditInd")
    public Object getAcceptCreditInd() {
        return acceptCreditInd;
    }

    /**
     * Accept Charges
     * <p>
     * Lineage reference object : acceptCreditInd
     * 
     */
    @JsonProperty("acceptCreditInd")
    public void setAcceptCreditInd(Object acceptCreditInd) {
        this.acceptCreditInd = acceptCreditInd;
    }

    public AccountCtrl__1 withAcceptCreditInd(Object acceptCreditInd) {
        this.acceptCreditInd = acceptCreditInd;
        return this;
    }

    /**
     * Current Term Charge
     * <p>
     * Lineage reference object : currentTermCharges
     * 
     */
    @JsonProperty("currentTermCharges")
    public Object getCurrentTermCharges() {
        return currentTermCharges;
    }

    /**
     * Current Term Charge
     * <p>
     * Lineage reference object : currentTermCharges
     * 
     */
    @JsonProperty("currentTermCharges")
    public void setCurrentTermCharges(Object currentTermCharges) {
        this.currentTermCharges = currentTermCharges;
    }

    public AccountCtrl__1 withCurrentTermCharges(Object currentTermCharges) {
        this.currentTermCharges = currentTermCharges;
        return this;
    }

    /**
     * Balance Other Terms
     * <p>
     * Lineage reference object : arBalance
     * 
     */
    @JsonProperty("arBalance")
    public Object getArBalance() {
        return arBalance;
    }

    /**
     * Balance Other Terms
     * <p>
     * Lineage reference object : arBalance
     * 
     */
    @JsonProperty("arBalance")
    public void setArBalance(Object arBalance) {
        this.arBalance = arBalance;
    }

    public AccountCtrl__1 withArBalance(Object arBalance) {
        this.arBalance = arBalance;
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

    public AccountCtrl__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountCtrl__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finaidTotalComm");
        sb.append('=');
        sb.append(((this.finaidTotalComm == null)?"<null>":this.finaidTotalComm));
        sb.append(',');
        sb.append("colcActivityDate");
        sb.append('=');
        sb.append(((this.colcActivityDate == null)?"<null>":this.colcActivityDate));
        sb.append(',');
        sb.append("controlReceiptNumber");
        sb.append('=');
        sb.append(((this.controlReceiptNumber == null)?"<null>":this.controlReceiptNumber));
        sb.append(',');
        sb.append("futureTermDue");
        sb.append('=');
        sb.append(((this.futureTermDue == null)?"<null>":this.futureTermDue));
        sb.append(',');
        sb.append("memoBalance");
        sb.append('=');
        sb.append(((this.memoBalance == null)?"<null>":this.memoBalance));
        sb.append(',');
        sb.append("finaidTotalMemos");
        sb.append('=');
        sb.append(((this.finaidTotalMemos == null)?"<null>":this.finaidTotalMemos));
        sb.append(',');
        sb.append("totalDue");
        sb.append('=');
        sb.append(((this.totalDue == null)?"<null>":this.totalDue));
        sb.append(',');
        sb.append("totalTermChg");
        sb.append('=');
        sb.append(((this.totalTermChg == null)?"<null>":this.totalTermChg));
        sb.append(',');
        sb.append("totalBillHours");
        sb.append('=');
        sb.append(((this.totalBillHours == null)?"<null>":this.totalBillHours));
        sb.append(',');
        sb.append("billHours");
        sb.append('=');
        sb.append(((this.billHours == null)?"<null>":this.billHours));
        sb.append(',');
        sb.append("nsfCount");
        sb.append('=');
        sb.append(((this.nsfCount == null)?"<null>":this.nsfCount));
        sb.append(',');
        sb.append("termCredits");
        sb.append('=');
        sb.append(((this.termCredits == null)?"<null>":this.termCredits));
        sb.append(',');
        sb.append("deliCode");
        sb.append('=');
        sb.append(((this.deliCode == null)?"<null>":this.deliCode));
        sb.append(',');
        sb.append("futureFutureDue");
        sb.append('=');
        sb.append(((this.futureFutureDue == null)?"<null>":this.futureFutureDue));
        sb.append(',');
        sb.append("finAid");
        sb.append('=');
        sb.append(((this.finAid == null)?"<null>":this.finAid));
        sb.append(',');
        sb.append("acceptCreditInd");
        sb.append('=');
        sb.append(((this.acceptCreditInd == null)?"<null>":this.acceptCreditInd));
        sb.append(',');
        sb.append("currentTermCharges");
        sb.append('=');
        sb.append(((this.currentTermCharges == null)?"<null>":this.currentTermCharges));
        sb.append(',');
        sb.append("arBalance");
        sb.append('=');
        sb.append(((this.arBalance == null)?"<null>":this.arBalance));
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
        result = ((result* 31)+((this.finaidTotalComm == null)? 0 :this.finaidTotalComm.hashCode()));
        result = ((result* 31)+((this.colcActivityDate == null)? 0 :this.colcActivityDate.hashCode()));
        result = ((result* 31)+((this.controlReceiptNumber == null)? 0 :this.controlReceiptNumber.hashCode()));
        result = ((result* 31)+((this.futureTermDue == null)? 0 :this.futureTermDue.hashCode()));
        result = ((result* 31)+((this.memoBalance == null)? 0 :this.memoBalance.hashCode()));
        result = ((result* 31)+((this.finaidTotalMemos == null)? 0 :this.finaidTotalMemos.hashCode()));
        result = ((result* 31)+((this.totalDue == null)? 0 :this.totalDue.hashCode()));
        result = ((result* 31)+((this.totalTermChg == null)? 0 :this.totalTermChg.hashCode()));
        result = ((result* 31)+((this.totalBillHours == null)? 0 :this.totalBillHours.hashCode()));
        result = ((result* 31)+((this.billHours == null)? 0 :this.billHours.hashCode()));
        result = ((result* 31)+((this.nsfCount == null)? 0 :this.nsfCount.hashCode()));
        result = ((result* 31)+((this.termCredits == null)? 0 :this.termCredits.hashCode()));
        result = ((result* 31)+((this.deliCode == null)? 0 :this.deliCode.hashCode()));
        result = ((result* 31)+((this.futureFutureDue == null)? 0 :this.futureFutureDue.hashCode()));
        result = ((result* 31)+((this.finAid == null)? 0 :this.finAid.hashCode()));
        result = ((result* 31)+((this.acceptCreditInd == null)? 0 :this.acceptCreditInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.currentTermCharges == null)? 0 :this.currentTermCharges.hashCode()));
        result = ((result* 31)+((this.arBalance == null)? 0 :this.arBalance.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountCtrl__1) == false) {
            return false;
        }
        AccountCtrl__1 rhs = ((AccountCtrl__1) other);
        return ((((((((((((((((((((this.finaidTotalComm == rhs.finaidTotalComm)||((this.finaidTotalComm!= null)&&this.finaidTotalComm.equals(rhs.finaidTotalComm)))&&((this.colcActivityDate == rhs.colcActivityDate)||((this.colcActivityDate!= null)&&this.colcActivityDate.equals(rhs.colcActivityDate))))&&((this.controlReceiptNumber == rhs.controlReceiptNumber)||((this.controlReceiptNumber!= null)&&this.controlReceiptNumber.equals(rhs.controlReceiptNumber))))&&((this.futureTermDue == rhs.futureTermDue)||((this.futureTermDue!= null)&&this.futureTermDue.equals(rhs.futureTermDue))))&&((this.memoBalance == rhs.memoBalance)||((this.memoBalance!= null)&&this.memoBalance.equals(rhs.memoBalance))))&&((this.finaidTotalMemos == rhs.finaidTotalMemos)||((this.finaidTotalMemos!= null)&&this.finaidTotalMemos.equals(rhs.finaidTotalMemos))))&&((this.totalDue == rhs.totalDue)||((this.totalDue!= null)&&this.totalDue.equals(rhs.totalDue))))&&((this.totalTermChg == rhs.totalTermChg)||((this.totalTermChg!= null)&&this.totalTermChg.equals(rhs.totalTermChg))))&&((this.totalBillHours == rhs.totalBillHours)||((this.totalBillHours!= null)&&this.totalBillHours.equals(rhs.totalBillHours))))&&((this.billHours == rhs.billHours)||((this.billHours!= null)&&this.billHours.equals(rhs.billHours))))&&((this.nsfCount == rhs.nsfCount)||((this.nsfCount!= null)&&this.nsfCount.equals(rhs.nsfCount))))&&((this.termCredits == rhs.termCredits)||((this.termCredits!= null)&&this.termCredits.equals(rhs.termCredits))))&&((this.deliCode == rhs.deliCode)||((this.deliCode!= null)&&this.deliCode.equals(rhs.deliCode))))&&((this.futureFutureDue == rhs.futureFutureDue)||((this.futureFutureDue!= null)&&this.futureFutureDue.equals(rhs.futureFutureDue))))&&((this.finAid == rhs.finAid)||((this.finAid!= null)&&this.finAid.equals(rhs.finAid))))&&((this.acceptCreditInd == rhs.acceptCreditInd)||((this.acceptCreditInd!= null)&&this.acceptCreditInd.equals(rhs.acceptCreditInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.currentTermCharges == rhs.currentTermCharges)||((this.currentTermCharges!= null)&&this.currentTermCharges.equals(rhs.currentTermCharges))))&&((this.arBalance == rhs.arBalance)||((this.arBalance!= null)&&this.arBalance.equals(rhs.arBalance))));
    }

}
