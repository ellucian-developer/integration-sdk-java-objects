
package com.ellucian.generated.bpapi.ban.payroll_advance_recovery.v1_0_0;

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
    "suff",
    "advanceBalance",
    "id",
    "advanceActiveInd",
    "advanceAmt",
    "posn"
})
@Generated("jsonschema2pojo")
public class PayrollAdvanceRecovery100GetRequest {

    /**
     * Suffix
     * <p>
     * Lineage reference object : PERPADV_SUFF
     * (Required)
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : PERPADV_SUFF")
    private String suff;
    /**
     * Advance Balance
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_BALANCE
     * 
     */
    @JsonProperty("advanceBalance")
    @JsonPropertyDescription("Lineage reference object : PERPADV_ADVANCE_BALANCE")
    private Double advanceBalance;
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
     * Lineage reference object : PERPADV_ADVANCE_ACTIVE_IND
     * 
     */
    @JsonProperty("advanceActiveInd")
    @JsonPropertyDescription("Lineage reference object : PERPADV_ADVANCE_ACTIVE_IND")
    private String advanceActiveInd;
    /**
     * Per Pay Recovery Amount
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_AMT
     * 
     */
    @JsonProperty("advanceAmt")
    @JsonPropertyDescription("Lineage reference object : PERPADV_ADVANCE_AMT")
    private Double advanceAmt;
    /**
     * Position
     * <p>
     * Lineage reference object : PERPADV_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : PERPADV_POSN")
    private String posn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Suffix
     * <p>
     * Lineage reference object : PERPADV_SUFF
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : PERPADV_SUFF
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public PayrollAdvanceRecovery100GetRequest withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Advance Balance
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_BALANCE
     * 
     */
    @JsonProperty("advanceBalance")
    public Double getAdvanceBalance() {
        return advanceBalance;
    }

    /**
     * Advance Balance
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_BALANCE
     * 
     */
    @JsonProperty("advanceBalance")
    public void setAdvanceBalance(Double advanceBalance) {
        this.advanceBalance = advanceBalance;
    }

    public PayrollAdvanceRecovery100GetRequest withAdvanceBalance(Double advanceBalance) {
        this.advanceBalance = advanceBalance;
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

    public PayrollAdvanceRecovery100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Lineage reference object : PERPADV_ADVANCE_ACTIVE_IND
     * 
     */
    @JsonProperty("advanceActiveInd")
    public String getAdvanceActiveInd() {
        return advanceActiveInd;
    }

    /**
     * Lineage reference object : PERPADV_ADVANCE_ACTIVE_IND
     * 
     */
    @JsonProperty("advanceActiveInd")
    public void setAdvanceActiveInd(String advanceActiveInd) {
        this.advanceActiveInd = advanceActiveInd;
    }

    public PayrollAdvanceRecovery100GetRequest withAdvanceActiveInd(String advanceActiveInd) {
        this.advanceActiveInd = advanceActiveInd;
        return this;
    }

    /**
     * Per Pay Recovery Amount
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_AMT
     * 
     */
    @JsonProperty("advanceAmt")
    public Double getAdvanceAmt() {
        return advanceAmt;
    }

    /**
     * Per Pay Recovery Amount
     * <p>
     * Lineage reference object : PERPADV_ADVANCE_AMT
     * 
     */
    @JsonProperty("advanceAmt")
    public void setAdvanceAmt(Double advanceAmt) {
        this.advanceAmt = advanceAmt;
    }

    public PayrollAdvanceRecovery100GetRequest withAdvanceAmt(Double advanceAmt) {
        this.advanceAmt = advanceAmt;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PERPADV_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : PERPADV_POSN
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public PayrollAdvanceRecovery100GetRequest withPosn(String posn) {
        this.posn = posn;
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

    public PayrollAdvanceRecovery100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PayrollAdvanceRecovery100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("advanceBalance");
        sb.append('=');
        sb.append(((this.advanceBalance == null)?"<null>":this.advanceBalance));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("advanceActiveInd");
        sb.append('=');
        sb.append(((this.advanceActiveInd == null)?"<null>":this.advanceActiveInd));
        sb.append(',');
        sb.append("advanceAmt");
        sb.append('=');
        sb.append(((this.advanceAmt == null)?"<null>":this.advanceAmt));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
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
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.advanceBalance == null)? 0 :this.advanceBalance.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.advanceActiveInd == null)? 0 :this.advanceActiveInd.hashCode()));
        result = ((result* 31)+((this.advanceAmt == null)? 0 :this.advanceAmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PayrollAdvanceRecovery100GetRequest) == false) {
            return false;
        }
        PayrollAdvanceRecovery100GetRequest rhs = ((PayrollAdvanceRecovery100GetRequest) other);
        return ((((((((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff)))&&((this.advanceBalance == rhs.advanceBalance)||((this.advanceBalance!= null)&&this.advanceBalance.equals(rhs.advanceBalance))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.advanceActiveInd == rhs.advanceActiveInd)||((this.advanceActiveInd!= null)&&this.advanceActiveInd.equals(rhs.advanceActiveInd))))&&((this.advanceAmt == rhs.advanceAmt)||((this.advanceAmt!= null)&&this.advanceAmt.equals(rhs.advanceAmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))));
    }

}
