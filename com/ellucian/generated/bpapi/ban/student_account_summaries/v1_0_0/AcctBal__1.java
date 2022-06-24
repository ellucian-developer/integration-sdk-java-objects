
package com.ellucian.generated.bpapi.ban.student_account_summaries.v1_0_0;

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
    "effDate91",
    "balanceDue",
    "billDateUnbilled",
    "effDate61",
    "effDateFut",
    "memoBal",
    "billDate91",
    "pastDue",
    "netBal",
    "depoBal",
    "currentDue",
    "futureDue",
    "acctBal",
    "nsfCounter",
    "amountDue",
    "effDate0",
    "unappliedCr",
    "billDate61",
    "billDate31",
    "effDate31",
    "billDate0"
})
@Generated("jsonschema2pojo")
public class AcctBal__1 {

    /**
     *  91+
     * <p>
     * Lineage reference object : effDate91
     * 
     */
    @JsonProperty("effDate91")
    @JsonPropertyDescription("Lineage reference object : effDate91")
    private Double effDate91;
    /**
     * Balance Due
     * <p>
     * Lineage reference object : balanceDue
     * 
     */
    @JsonProperty("balanceDue")
    @JsonPropertyDescription("Lineage reference object : balanceDue")
    private Double balanceDue;
    /**
     * Unbilled
     * <p>
     * Lineage reference object : billDateUnbilled
     * 
     */
    @JsonProperty("billDateUnbilled")
    @JsonPropertyDescription("Lineage reference object : billDateUnbilled")
    private Double billDateUnbilled;
    /**
     *  61-90
     * <p>
     * Lineage reference object : effDate61
     * 
     */
    @JsonProperty("effDate61")
    @JsonPropertyDescription("Lineage reference object : effDate61")
    private Double effDate61;
    /**
     * Future
     * <p>
     * Lineage reference object : effDateFut
     * 
     */
    @JsonProperty("effDateFut")
    @JsonPropertyDescription("Lineage reference object : effDateFut")
    private Double effDateFut;
    /**
     * Memo Balance
     * <p>
     * Lineage reference object : memoBal
     * 
     */
    @JsonProperty("memoBal")
    @JsonPropertyDescription("Lineage reference object : memoBal")
    private Double memoBal;
    /**
     *  91+
     * <p>
     * Lineage reference object : billDate91
     * 
     */
    @JsonProperty("billDate91")
    @JsonPropertyDescription("Lineage reference object : billDate91")
    private Double billDate91;
    /**
     * Past Due
     * <p>
     * Lineage reference object : pastDue
     * 
     */
    @JsonProperty("pastDue")
    @JsonPropertyDescription("Lineage reference object : pastDue")
    private Double pastDue;
    /**
     * Net Balance
     * <p>
     * Lineage reference object : netBal
     * 
     */
    @JsonProperty("netBal")
    @JsonPropertyDescription("Lineage reference object : netBal")
    private Double netBal;
    /**
     * Deposit Balance
     * <p>
     * Lineage reference object : depoBal
     * 
     */
    @JsonProperty("depoBal")
    @JsonPropertyDescription("Lineage reference object : depoBal")
    private Double depoBal;
    /**
     * Current Due
     * <p>
     * Lineage reference object : currentDue
     * 
     */
    @JsonProperty("currentDue")
    @JsonPropertyDescription("Lineage reference object : currentDue")
    private Double currentDue;
    /**
     * Future Due
     * <p>
     * Lineage reference object : futureDue
     * 
     */
    @JsonProperty("futureDue")
    @JsonPropertyDescription("Lineage reference object : futureDue")
    private Double futureDue;
    /**
     * Account Balance
     * <p>
     * Lineage reference object : acctBal
     * 
     */
    @JsonProperty("acctBal")
    @JsonPropertyDescription("Lineage reference object : acctBal")
    private Double acctBal;
    /**
     * NSF Counter
     * <p>
     * Lineage reference object : nsfCounter
     * 
     */
    @JsonProperty("nsfCounter")
    @JsonPropertyDescription("Lineage reference object : nsfCounter")
    private Double nsfCounter;
    /**
     * Amount Due
     * <p>
     * Lineage reference object : amountDue
     * 
     */
    @JsonProperty("amountDue")
    @JsonPropertyDescription("Lineage reference object : amountDue")
    private Double amountDue;
    /**
     *  0-30
     * <p>
     * Lineage reference object : effDate0
     * 
     */
    @JsonProperty("effDate0")
    @JsonPropertyDescription("Lineage reference object : effDate0")
    private Double effDate0;
    /**
     * Unapplied Credit
     * <p>
     * Lineage reference object : unappliedCr
     * 
     */
    @JsonProperty("unappliedCr")
    @JsonPropertyDescription("Lineage reference object : unappliedCr")
    private Double unappliedCr;
    /**
     *  61-90
     * <p>
     * Lineage reference object : billDate61
     * 
     */
    @JsonProperty("billDate61")
    @JsonPropertyDescription("Lineage reference object : billDate61")
    private Double billDate61;
    /**
     *  31-60
     * <p>
     * Lineage reference object : billDate31
     * 
     */
    @JsonProperty("billDate31")
    @JsonPropertyDescription("Lineage reference object : billDate31")
    private Double billDate31;
    /**
     *  31-60
     * <p>
     * Lineage reference object : effDate31
     * 
     */
    @JsonProperty("effDate31")
    @JsonPropertyDescription("Lineage reference object : effDate31")
    private Double effDate31;
    /**
     *  0-30
     * <p>
     * Lineage reference object : billDate0
     * 
     */
    @JsonProperty("billDate0")
    @JsonPropertyDescription("Lineage reference object : billDate0")
    private Double billDate0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *  91+
     * <p>
     * Lineage reference object : effDate91
     * 
     */
    @JsonProperty("effDate91")
    public Double getEffDate91() {
        return effDate91;
    }

    /**
     *  91+
     * <p>
     * Lineage reference object : effDate91
     * 
     */
    @JsonProperty("effDate91")
    public void setEffDate91(Double effDate91) {
        this.effDate91 = effDate91;
    }

    public AcctBal__1 withEffDate91(Double effDate91) {
        this.effDate91 = effDate91;
        return this;
    }

    /**
     * Balance Due
     * <p>
     * Lineage reference object : balanceDue
     * 
     */
    @JsonProperty("balanceDue")
    public Double getBalanceDue() {
        return balanceDue;
    }

    /**
     * Balance Due
     * <p>
     * Lineage reference object : balanceDue
     * 
     */
    @JsonProperty("balanceDue")
    public void setBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
    }

    public AcctBal__1 withBalanceDue(Double balanceDue) {
        this.balanceDue = balanceDue;
        return this;
    }

    /**
     * Unbilled
     * <p>
     * Lineage reference object : billDateUnbilled
     * 
     */
    @JsonProperty("billDateUnbilled")
    public Double getBillDateUnbilled() {
        return billDateUnbilled;
    }

    /**
     * Unbilled
     * <p>
     * Lineage reference object : billDateUnbilled
     * 
     */
    @JsonProperty("billDateUnbilled")
    public void setBillDateUnbilled(Double billDateUnbilled) {
        this.billDateUnbilled = billDateUnbilled;
    }

    public AcctBal__1 withBillDateUnbilled(Double billDateUnbilled) {
        this.billDateUnbilled = billDateUnbilled;
        return this;
    }

    /**
     *  61-90
     * <p>
     * Lineage reference object : effDate61
     * 
     */
    @JsonProperty("effDate61")
    public Double getEffDate61() {
        return effDate61;
    }

    /**
     *  61-90
     * <p>
     * Lineage reference object : effDate61
     * 
     */
    @JsonProperty("effDate61")
    public void setEffDate61(Double effDate61) {
        this.effDate61 = effDate61;
    }

    public AcctBal__1 withEffDate61(Double effDate61) {
        this.effDate61 = effDate61;
        return this;
    }

    /**
     * Future
     * <p>
     * Lineage reference object : effDateFut
     * 
     */
    @JsonProperty("effDateFut")
    public Double getEffDateFut() {
        return effDateFut;
    }

    /**
     * Future
     * <p>
     * Lineage reference object : effDateFut
     * 
     */
    @JsonProperty("effDateFut")
    public void setEffDateFut(Double effDateFut) {
        this.effDateFut = effDateFut;
    }

    public AcctBal__1 withEffDateFut(Double effDateFut) {
        this.effDateFut = effDateFut;
        return this;
    }

    /**
     * Memo Balance
     * <p>
     * Lineage reference object : memoBal
     * 
     */
    @JsonProperty("memoBal")
    public Double getMemoBal() {
        return memoBal;
    }

    /**
     * Memo Balance
     * <p>
     * Lineage reference object : memoBal
     * 
     */
    @JsonProperty("memoBal")
    public void setMemoBal(Double memoBal) {
        this.memoBal = memoBal;
    }

    public AcctBal__1 withMemoBal(Double memoBal) {
        this.memoBal = memoBal;
        return this;
    }

    /**
     *  91+
     * <p>
     * Lineage reference object : billDate91
     * 
     */
    @JsonProperty("billDate91")
    public Double getBillDate91() {
        return billDate91;
    }

    /**
     *  91+
     * <p>
     * Lineage reference object : billDate91
     * 
     */
    @JsonProperty("billDate91")
    public void setBillDate91(Double billDate91) {
        this.billDate91 = billDate91;
    }

    public AcctBal__1 withBillDate91(Double billDate91) {
        this.billDate91 = billDate91;
        return this;
    }

    /**
     * Past Due
     * <p>
     * Lineage reference object : pastDue
     * 
     */
    @JsonProperty("pastDue")
    public Double getPastDue() {
        return pastDue;
    }

    /**
     * Past Due
     * <p>
     * Lineage reference object : pastDue
     * 
     */
    @JsonProperty("pastDue")
    public void setPastDue(Double pastDue) {
        this.pastDue = pastDue;
    }

    public AcctBal__1 withPastDue(Double pastDue) {
        this.pastDue = pastDue;
        return this;
    }

    /**
     * Net Balance
     * <p>
     * Lineage reference object : netBal
     * 
     */
    @JsonProperty("netBal")
    public Double getNetBal() {
        return netBal;
    }

    /**
     * Net Balance
     * <p>
     * Lineage reference object : netBal
     * 
     */
    @JsonProperty("netBal")
    public void setNetBal(Double netBal) {
        this.netBal = netBal;
    }

    public AcctBal__1 withNetBal(Double netBal) {
        this.netBal = netBal;
        return this;
    }

    /**
     * Deposit Balance
     * <p>
     * Lineage reference object : depoBal
     * 
     */
    @JsonProperty("depoBal")
    public Double getDepoBal() {
        return depoBal;
    }

    /**
     * Deposit Balance
     * <p>
     * Lineage reference object : depoBal
     * 
     */
    @JsonProperty("depoBal")
    public void setDepoBal(Double depoBal) {
        this.depoBal = depoBal;
    }

    public AcctBal__1 withDepoBal(Double depoBal) {
        this.depoBal = depoBal;
        return this;
    }

    /**
     * Current Due
     * <p>
     * Lineage reference object : currentDue
     * 
     */
    @JsonProperty("currentDue")
    public Double getCurrentDue() {
        return currentDue;
    }

    /**
     * Current Due
     * <p>
     * Lineage reference object : currentDue
     * 
     */
    @JsonProperty("currentDue")
    public void setCurrentDue(Double currentDue) {
        this.currentDue = currentDue;
    }

    public AcctBal__1 withCurrentDue(Double currentDue) {
        this.currentDue = currentDue;
        return this;
    }

    /**
     * Future Due
     * <p>
     * Lineage reference object : futureDue
     * 
     */
    @JsonProperty("futureDue")
    public Double getFutureDue() {
        return futureDue;
    }

    /**
     * Future Due
     * <p>
     * Lineage reference object : futureDue
     * 
     */
    @JsonProperty("futureDue")
    public void setFutureDue(Double futureDue) {
        this.futureDue = futureDue;
    }

    public AcctBal__1 withFutureDue(Double futureDue) {
        this.futureDue = futureDue;
        return this;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : acctBal
     * 
     */
    @JsonProperty("acctBal")
    public Double getAcctBal() {
        return acctBal;
    }

    /**
     * Account Balance
     * <p>
     * Lineage reference object : acctBal
     * 
     */
    @JsonProperty("acctBal")
    public void setAcctBal(Double acctBal) {
        this.acctBal = acctBal;
    }

    public AcctBal__1 withAcctBal(Double acctBal) {
        this.acctBal = acctBal;
        return this;
    }

    /**
     * NSF Counter
     * <p>
     * Lineage reference object : nsfCounter
     * 
     */
    @JsonProperty("nsfCounter")
    public Double getNsfCounter() {
        return nsfCounter;
    }

    /**
     * NSF Counter
     * <p>
     * Lineage reference object : nsfCounter
     * 
     */
    @JsonProperty("nsfCounter")
    public void setNsfCounter(Double nsfCounter) {
        this.nsfCounter = nsfCounter;
    }

    public AcctBal__1 withNsfCounter(Double nsfCounter) {
        this.nsfCounter = nsfCounter;
        return this;
    }

    /**
     * Amount Due
     * <p>
     * Lineage reference object : amountDue
     * 
     */
    @JsonProperty("amountDue")
    public Double getAmountDue() {
        return amountDue;
    }

    /**
     * Amount Due
     * <p>
     * Lineage reference object : amountDue
     * 
     */
    @JsonProperty("amountDue")
    public void setAmountDue(Double amountDue) {
        this.amountDue = amountDue;
    }

    public AcctBal__1 withAmountDue(Double amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    /**
     *  0-30
     * <p>
     * Lineage reference object : effDate0
     * 
     */
    @JsonProperty("effDate0")
    public Double getEffDate0() {
        return effDate0;
    }

    /**
     *  0-30
     * <p>
     * Lineage reference object : effDate0
     * 
     */
    @JsonProperty("effDate0")
    public void setEffDate0(Double effDate0) {
        this.effDate0 = effDate0;
    }

    public AcctBal__1 withEffDate0(Double effDate0) {
        this.effDate0 = effDate0;
        return this;
    }

    /**
     * Unapplied Credit
     * <p>
     * Lineage reference object : unappliedCr
     * 
     */
    @JsonProperty("unappliedCr")
    public Double getUnappliedCr() {
        return unappliedCr;
    }

    /**
     * Unapplied Credit
     * <p>
     * Lineage reference object : unappliedCr
     * 
     */
    @JsonProperty("unappliedCr")
    public void setUnappliedCr(Double unappliedCr) {
        this.unappliedCr = unappliedCr;
    }

    public AcctBal__1 withUnappliedCr(Double unappliedCr) {
        this.unappliedCr = unappliedCr;
        return this;
    }

    /**
     *  61-90
     * <p>
     * Lineage reference object : billDate61
     * 
     */
    @JsonProperty("billDate61")
    public Double getBillDate61() {
        return billDate61;
    }

    /**
     *  61-90
     * <p>
     * Lineage reference object : billDate61
     * 
     */
    @JsonProperty("billDate61")
    public void setBillDate61(Double billDate61) {
        this.billDate61 = billDate61;
    }

    public AcctBal__1 withBillDate61(Double billDate61) {
        this.billDate61 = billDate61;
        return this;
    }

    /**
     *  31-60
     * <p>
     * Lineage reference object : billDate31
     * 
     */
    @JsonProperty("billDate31")
    public Double getBillDate31() {
        return billDate31;
    }

    /**
     *  31-60
     * <p>
     * Lineage reference object : billDate31
     * 
     */
    @JsonProperty("billDate31")
    public void setBillDate31(Double billDate31) {
        this.billDate31 = billDate31;
    }

    public AcctBal__1 withBillDate31(Double billDate31) {
        this.billDate31 = billDate31;
        return this;
    }

    /**
     *  31-60
     * <p>
     * Lineage reference object : effDate31
     * 
     */
    @JsonProperty("effDate31")
    public Double getEffDate31() {
        return effDate31;
    }

    /**
     *  31-60
     * <p>
     * Lineage reference object : effDate31
     * 
     */
    @JsonProperty("effDate31")
    public void setEffDate31(Double effDate31) {
        this.effDate31 = effDate31;
    }

    public AcctBal__1 withEffDate31(Double effDate31) {
        this.effDate31 = effDate31;
        return this;
    }

    /**
     *  0-30
     * <p>
     * Lineage reference object : billDate0
     * 
     */
    @JsonProperty("billDate0")
    public Double getBillDate0() {
        return billDate0;
    }

    /**
     *  0-30
     * <p>
     * Lineage reference object : billDate0
     * 
     */
    @JsonProperty("billDate0")
    public void setBillDate0(Double billDate0) {
        this.billDate0 = billDate0;
    }

    public AcctBal__1 withBillDate0(Double billDate0) {
        this.billDate0 = billDate0;
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

    public AcctBal__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcctBal__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effDate91");
        sb.append('=');
        sb.append(((this.effDate91 == null)?"<null>":this.effDate91));
        sb.append(',');
        sb.append("balanceDue");
        sb.append('=');
        sb.append(((this.balanceDue == null)?"<null>":this.balanceDue));
        sb.append(',');
        sb.append("billDateUnbilled");
        sb.append('=');
        sb.append(((this.billDateUnbilled == null)?"<null>":this.billDateUnbilled));
        sb.append(',');
        sb.append("effDate61");
        sb.append('=');
        sb.append(((this.effDate61 == null)?"<null>":this.effDate61));
        sb.append(',');
        sb.append("effDateFut");
        sb.append('=');
        sb.append(((this.effDateFut == null)?"<null>":this.effDateFut));
        sb.append(',');
        sb.append("memoBal");
        sb.append('=');
        sb.append(((this.memoBal == null)?"<null>":this.memoBal));
        sb.append(',');
        sb.append("billDate91");
        sb.append('=');
        sb.append(((this.billDate91 == null)?"<null>":this.billDate91));
        sb.append(',');
        sb.append("pastDue");
        sb.append('=');
        sb.append(((this.pastDue == null)?"<null>":this.pastDue));
        sb.append(',');
        sb.append("netBal");
        sb.append('=');
        sb.append(((this.netBal == null)?"<null>":this.netBal));
        sb.append(',');
        sb.append("depoBal");
        sb.append('=');
        sb.append(((this.depoBal == null)?"<null>":this.depoBal));
        sb.append(',');
        sb.append("currentDue");
        sb.append('=');
        sb.append(((this.currentDue == null)?"<null>":this.currentDue));
        sb.append(',');
        sb.append("futureDue");
        sb.append('=');
        sb.append(((this.futureDue == null)?"<null>":this.futureDue));
        sb.append(',');
        sb.append("acctBal");
        sb.append('=');
        sb.append(((this.acctBal == null)?"<null>":this.acctBal));
        sb.append(',');
        sb.append("nsfCounter");
        sb.append('=');
        sb.append(((this.nsfCounter == null)?"<null>":this.nsfCounter));
        sb.append(',');
        sb.append("amountDue");
        sb.append('=');
        sb.append(((this.amountDue == null)?"<null>":this.amountDue));
        sb.append(',');
        sb.append("effDate0");
        sb.append('=');
        sb.append(((this.effDate0 == null)?"<null>":this.effDate0));
        sb.append(',');
        sb.append("unappliedCr");
        sb.append('=');
        sb.append(((this.unappliedCr == null)?"<null>":this.unappliedCr));
        sb.append(',');
        sb.append("billDate61");
        sb.append('=');
        sb.append(((this.billDate61 == null)?"<null>":this.billDate61));
        sb.append(',');
        sb.append("billDate31");
        sb.append('=');
        sb.append(((this.billDate31 == null)?"<null>":this.billDate31));
        sb.append(',');
        sb.append("effDate31");
        sb.append('=');
        sb.append(((this.effDate31 == null)?"<null>":this.effDate31));
        sb.append(',');
        sb.append("billDate0");
        sb.append('=');
        sb.append(((this.billDate0 == null)?"<null>":this.billDate0));
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
        result = ((result* 31)+((this.effDate91 == null)? 0 :this.effDate91 .hashCode()));
        result = ((result* 31)+((this.balanceDue == null)? 0 :this.balanceDue.hashCode()));
        result = ((result* 31)+((this.billDateUnbilled == null)? 0 :this.billDateUnbilled.hashCode()));
        result = ((result* 31)+((this.effDate61 == null)? 0 :this.effDate61 .hashCode()));
        result = ((result* 31)+((this.effDateFut == null)? 0 :this.effDateFut.hashCode()));
        result = ((result* 31)+((this.memoBal == null)? 0 :this.memoBal.hashCode()));
        result = ((result* 31)+((this.billDate91 == null)? 0 :this.billDate91 .hashCode()));
        result = ((result* 31)+((this.pastDue == null)? 0 :this.pastDue.hashCode()));
        result = ((result* 31)+((this.netBal == null)? 0 :this.netBal.hashCode()));
        result = ((result* 31)+((this.depoBal == null)? 0 :this.depoBal.hashCode()));
        result = ((result* 31)+((this.currentDue == null)? 0 :this.currentDue.hashCode()));
        result = ((result* 31)+((this.futureDue == null)? 0 :this.futureDue.hashCode()));
        result = ((result* 31)+((this.acctBal == null)? 0 :this.acctBal.hashCode()));
        result = ((result* 31)+((this.nsfCounter == null)? 0 :this.nsfCounter.hashCode()));
        result = ((result* 31)+((this.amountDue == null)? 0 :this.amountDue.hashCode()));
        result = ((result* 31)+((this.effDate0 == null)? 0 :this.effDate0 .hashCode()));
        result = ((result* 31)+((this.unappliedCr == null)? 0 :this.unappliedCr.hashCode()));
        result = ((result* 31)+((this.billDate61 == null)? 0 :this.billDate61 .hashCode()));
        result = ((result* 31)+((this.billDate31 == null)? 0 :this.billDate31 .hashCode()));
        result = ((result* 31)+((this.effDate31 == null)? 0 :this.effDate31 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.billDate0 == null)? 0 :this.billDate0 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcctBal__1) == false) {
            return false;
        }
        AcctBal__1 rhs = ((AcctBal__1) other);
        return (((((((((((((((((((((((this.effDate91 == rhs.effDate91)||((this.effDate91 != null)&&this.effDate91 .equals(rhs.effDate91)))&&((this.balanceDue == rhs.balanceDue)||((this.balanceDue!= null)&&this.balanceDue.equals(rhs.balanceDue))))&&((this.billDateUnbilled == rhs.billDateUnbilled)||((this.billDateUnbilled!= null)&&this.billDateUnbilled.equals(rhs.billDateUnbilled))))&&((this.effDate61 == rhs.effDate61)||((this.effDate61 != null)&&this.effDate61 .equals(rhs.effDate61))))&&((this.effDateFut == rhs.effDateFut)||((this.effDateFut!= null)&&this.effDateFut.equals(rhs.effDateFut))))&&((this.memoBal == rhs.memoBal)||((this.memoBal!= null)&&this.memoBal.equals(rhs.memoBal))))&&((this.billDate91 == rhs.billDate91)||((this.billDate91 != null)&&this.billDate91 .equals(rhs.billDate91))))&&((this.pastDue == rhs.pastDue)||((this.pastDue!= null)&&this.pastDue.equals(rhs.pastDue))))&&((this.netBal == rhs.netBal)||((this.netBal!= null)&&this.netBal.equals(rhs.netBal))))&&((this.depoBal == rhs.depoBal)||((this.depoBal!= null)&&this.depoBal.equals(rhs.depoBal))))&&((this.currentDue == rhs.currentDue)||((this.currentDue!= null)&&this.currentDue.equals(rhs.currentDue))))&&((this.futureDue == rhs.futureDue)||((this.futureDue!= null)&&this.futureDue.equals(rhs.futureDue))))&&((this.acctBal == rhs.acctBal)||((this.acctBal!= null)&&this.acctBal.equals(rhs.acctBal))))&&((this.nsfCounter == rhs.nsfCounter)||((this.nsfCounter!= null)&&this.nsfCounter.equals(rhs.nsfCounter))))&&((this.amountDue == rhs.amountDue)||((this.amountDue!= null)&&this.amountDue.equals(rhs.amountDue))))&&((this.effDate0 == rhs.effDate0)||((this.effDate0 != null)&&this.effDate0 .equals(rhs.effDate0))))&&((this.unappliedCr == rhs.unappliedCr)||((this.unappliedCr!= null)&&this.unappliedCr.equals(rhs.unappliedCr))))&&((this.billDate61 == rhs.billDate61)||((this.billDate61 != null)&&this.billDate61 .equals(rhs.billDate61))))&&((this.billDate31 == rhs.billDate31)||((this.billDate31 != null)&&this.billDate31 .equals(rhs.billDate31))))&&((this.effDate31 == rhs.effDate31)||((this.effDate31 != null)&&this.effDate31 .equals(rhs.effDate31))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.billDate0 == rhs.billDate0)||((this.billDate0 != null)&&this.billDate0 .equals(rhs.billDate0))));
    }

}
