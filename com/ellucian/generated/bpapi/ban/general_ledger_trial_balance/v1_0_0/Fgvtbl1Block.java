
package com.ellucian.generated.bpapi.ban.general_ledger_trial_balance.v1_0_0;

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
    "displayBegBal",
    "fgvtbl1AcctTitle",
    "begDrCrDesc",
    "curDrCrDesc",
    "displayBegBalDrCr",
    "displayCurrBalDrCr",
    "fgvtbl1AcctCode",
    "displayCurrBal"
})
@Generated("jsonschema2pojo")
public class Fgvtbl1Block {

    /**
     * Beginning Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBegBal")
    private Double displayBegBal;
    /**
     * Description
     * <p>
     * Lineage reference object : FGVTBL1_ACCT_TITLE
     * 
     */
    @JsonProperty("fgvtbl1AcctTitle")
    @JsonPropertyDescription("Lineage reference object : FGVTBL1_ACCT_TITLE")
    private String fgvtbl1AcctTitle;
    /**
     * Debit/Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("begDrCrDesc")
    private String begDrCrDesc;
    /**
     * Debit/Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("curDrCrDesc")
    private String curDrCrDesc;
    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBegBalDrCr")
    private String displayBegBalDrCr;
    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCurrBalDrCr")
    private String displayCurrBalDrCr;
    /**
     * Account
     * <p>
     * Lineage reference object : FGVTBL1_ACCT_CODE
     * 
     */
    @JsonProperty("fgvtbl1AcctCode")
    @JsonPropertyDescription("Lineage reference object : FGVTBL1_ACCT_CODE")
    private String fgvtbl1AcctCode;
    /**
     * Current Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCurrBal")
    private Double displayCurrBal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Beginning Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBegBal")
    public Double getDisplayBegBal() {
        return displayBegBal;
    }

    /**
     * Beginning Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBegBal")
    public void setDisplayBegBal(Double displayBegBal) {
        this.displayBegBal = displayBegBal;
    }

    public Fgvtbl1Block withDisplayBegBal(Double displayBegBal) {
        this.displayBegBal = displayBegBal;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGVTBL1_ACCT_TITLE
     * 
     */
    @JsonProperty("fgvtbl1AcctTitle")
    public String getFgvtbl1AcctTitle() {
        return fgvtbl1AcctTitle;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGVTBL1_ACCT_TITLE
     * 
     */
    @JsonProperty("fgvtbl1AcctTitle")
    public void setFgvtbl1AcctTitle(String fgvtbl1AcctTitle) {
        this.fgvtbl1AcctTitle = fgvtbl1AcctTitle;
    }

    public Fgvtbl1Block withFgvtbl1AcctTitle(String fgvtbl1AcctTitle) {
        this.fgvtbl1AcctTitle = fgvtbl1AcctTitle;
        return this;
    }

    /**
     * Debit/Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("begDrCrDesc")
    public String getBegDrCrDesc() {
        return begDrCrDesc;
    }

    /**
     * Debit/Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("begDrCrDesc")
    public void setBegDrCrDesc(String begDrCrDesc) {
        this.begDrCrDesc = begDrCrDesc;
    }

    public Fgvtbl1Block withBegDrCrDesc(String begDrCrDesc) {
        this.begDrCrDesc = begDrCrDesc;
        return this;
    }

    /**
     * Debit/Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("curDrCrDesc")
    public String getCurDrCrDesc() {
        return curDrCrDesc;
    }

    /**
     * Debit/Credit
     * <p>
     * 
     * 
     */
    @JsonProperty("curDrCrDesc")
    public void setCurDrCrDesc(String curDrCrDesc) {
        this.curDrCrDesc = curDrCrDesc;
    }

    public Fgvtbl1Block withCurDrCrDesc(String curDrCrDesc) {
        this.curDrCrDesc = curDrCrDesc;
        return this;
    }

    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBegBalDrCr")
    public String getDisplayBegBalDrCr() {
        return displayBegBalDrCr;
    }

    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBegBalDrCr")
    public void setDisplayBegBalDrCr(String displayBegBalDrCr) {
        this.displayBegBalDrCr = displayBegBalDrCr;
    }

    public Fgvtbl1Block withDisplayBegBalDrCr(String displayBegBalDrCr) {
        this.displayBegBalDrCr = displayBegBalDrCr;
        return this;
    }

    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCurrBalDrCr")
    public String getDisplayCurrBalDrCr() {
        return displayCurrBalDrCr;
    }

    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCurrBalDrCr")
    public void setDisplayCurrBalDrCr(String displayCurrBalDrCr) {
        this.displayCurrBalDrCr = displayCurrBalDrCr;
    }

    public Fgvtbl1Block withDisplayCurrBalDrCr(String displayCurrBalDrCr) {
        this.displayCurrBalDrCr = displayCurrBalDrCr;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FGVTBL1_ACCT_CODE
     * 
     */
    @JsonProperty("fgvtbl1AcctCode")
    public String getFgvtbl1AcctCode() {
        return fgvtbl1AcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FGVTBL1_ACCT_CODE
     * 
     */
    @JsonProperty("fgvtbl1AcctCode")
    public void setFgvtbl1AcctCode(String fgvtbl1AcctCode) {
        this.fgvtbl1AcctCode = fgvtbl1AcctCode;
    }

    public Fgvtbl1Block withFgvtbl1AcctCode(String fgvtbl1AcctCode) {
        this.fgvtbl1AcctCode = fgvtbl1AcctCode;
        return this;
    }

    /**
     * Current Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCurrBal")
    public Double getDisplayCurrBal() {
        return displayCurrBal;
    }

    /**
     * Current Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCurrBal")
    public void setDisplayCurrBal(Double displayCurrBal) {
        this.displayCurrBal = displayCurrBal;
    }

    public Fgvtbl1Block withDisplayCurrBal(Double displayCurrBal) {
        this.displayCurrBal = displayCurrBal;
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

    public Fgvtbl1Block withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgvtbl1Block.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayBegBal");
        sb.append('=');
        sb.append(((this.displayBegBal == null)?"<null>":this.displayBegBal));
        sb.append(',');
        sb.append("fgvtbl1AcctTitle");
        sb.append('=');
        sb.append(((this.fgvtbl1AcctTitle == null)?"<null>":this.fgvtbl1AcctTitle));
        sb.append(',');
        sb.append("begDrCrDesc");
        sb.append('=');
        sb.append(((this.begDrCrDesc == null)?"<null>":this.begDrCrDesc));
        sb.append(',');
        sb.append("curDrCrDesc");
        sb.append('=');
        sb.append(((this.curDrCrDesc == null)?"<null>":this.curDrCrDesc));
        sb.append(',');
        sb.append("displayBegBalDrCr");
        sb.append('=');
        sb.append(((this.displayBegBalDrCr == null)?"<null>":this.displayBegBalDrCr));
        sb.append(',');
        sb.append("displayCurrBalDrCr");
        sb.append('=');
        sb.append(((this.displayCurrBalDrCr == null)?"<null>":this.displayCurrBalDrCr));
        sb.append(',');
        sb.append("fgvtbl1AcctCode");
        sb.append('=');
        sb.append(((this.fgvtbl1AcctCode == null)?"<null>":this.fgvtbl1AcctCode));
        sb.append(',');
        sb.append("displayCurrBal");
        sb.append('=');
        sb.append(((this.displayCurrBal == null)?"<null>":this.displayCurrBal));
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
        result = ((result* 31)+((this.displayBegBal == null)? 0 :this.displayBegBal.hashCode()));
        result = ((result* 31)+((this.fgvtbl1AcctTitle == null)? 0 :this.fgvtbl1AcctTitle.hashCode()));
        result = ((result* 31)+((this.begDrCrDesc == null)? 0 :this.begDrCrDesc.hashCode()));
        result = ((result* 31)+((this.curDrCrDesc == null)? 0 :this.curDrCrDesc.hashCode()));
        result = ((result* 31)+((this.displayBegBalDrCr == null)? 0 :this.displayBegBalDrCr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayCurrBalDrCr == null)? 0 :this.displayCurrBalDrCr.hashCode()));
        result = ((result* 31)+((this.fgvtbl1AcctCode == null)? 0 :this.fgvtbl1AcctCode.hashCode()));
        result = ((result* 31)+((this.displayCurrBal == null)? 0 :this.displayCurrBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgvtbl1Block) == false) {
            return false;
        }
        Fgvtbl1Block rhs = ((Fgvtbl1Block) other);
        return ((((((((((this.displayBegBal == rhs.displayBegBal)||((this.displayBegBal!= null)&&this.displayBegBal.equals(rhs.displayBegBal)))&&((this.fgvtbl1AcctTitle == rhs.fgvtbl1AcctTitle)||((this.fgvtbl1AcctTitle!= null)&&this.fgvtbl1AcctTitle.equals(rhs.fgvtbl1AcctTitle))))&&((this.begDrCrDesc == rhs.begDrCrDesc)||((this.begDrCrDesc!= null)&&this.begDrCrDesc.equals(rhs.begDrCrDesc))))&&((this.curDrCrDesc == rhs.curDrCrDesc)||((this.curDrCrDesc!= null)&&this.curDrCrDesc.equals(rhs.curDrCrDesc))))&&((this.displayBegBalDrCr == rhs.displayBegBalDrCr)||((this.displayBegBalDrCr!= null)&&this.displayBegBalDrCr.equals(rhs.displayBegBalDrCr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayCurrBalDrCr == rhs.displayCurrBalDrCr)||((this.displayCurrBalDrCr!= null)&&this.displayCurrBalDrCr.equals(rhs.displayCurrBalDrCr))))&&((this.fgvtbl1AcctCode == rhs.fgvtbl1AcctCode)||((this.fgvtbl1AcctCode!= null)&&this.fgvtbl1AcctCode.equals(rhs.fgvtbl1AcctCode))))&&((this.displayCurrBal == rhs.displayCurrBal)||((this.displayCurrBal!= null)&&this.displayCurrBal.equals(rhs.displayCurrBal))));
    }

}
