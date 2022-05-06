
package com.ellucian.generated.bpapi.ban.trial_balance_summary.v1_0_0;

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
    "displayBegBal",
    "begDrCrDesc",
    "curDrCrDesc",
    "fgvtbl3AcctCode",
    "fgvtbl3AcctTitle",
    "displayBegBalDrCr",
    "fgvtbl3AtypCode",
    "displayCurrBalDrCr",
    "displayCurrBal"
})
@Generated("jsonschema2pojo")
public class Fgvtbl3Block {

    /**
     * Beginning Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBegBal")
    private Double displayBegBal;
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
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("fgvtbl3AcctCode")
    private String fgvtbl3AcctCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fgvtbl3AcctTitle")
    private String fgvtbl3AcctTitle;
    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("displayBegBalDrCr")
    private String displayBegBalDrCr;
    /**
     * Acct Type
     * <p>
     * 
     * 
     */
    @JsonProperty("fgvtbl3AtypCode")
    private String fgvtbl3AtypCode;
    /**
     * *
     * <p>
     * 
     * 
     */
    @JsonProperty("displayCurrBalDrCr")
    private String displayCurrBalDrCr;
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

    public Fgvtbl3Block withDisplayBegBal(Double displayBegBal) {
        this.displayBegBal = displayBegBal;
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

    public Fgvtbl3Block withBegDrCrDesc(String begDrCrDesc) {
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

    public Fgvtbl3Block withCurDrCrDesc(String curDrCrDesc) {
        this.curDrCrDesc = curDrCrDesc;
        return this;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("fgvtbl3AcctCode")
    public String getFgvtbl3AcctCode() {
        return fgvtbl3AcctCode;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("fgvtbl3AcctCode")
    public void setFgvtbl3AcctCode(String fgvtbl3AcctCode) {
        this.fgvtbl3AcctCode = fgvtbl3AcctCode;
    }

    public Fgvtbl3Block withFgvtbl3AcctCode(String fgvtbl3AcctCode) {
        this.fgvtbl3AcctCode = fgvtbl3AcctCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fgvtbl3AcctTitle")
    public String getFgvtbl3AcctTitle() {
        return fgvtbl3AcctTitle;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("fgvtbl3AcctTitle")
    public void setFgvtbl3AcctTitle(String fgvtbl3AcctTitle) {
        this.fgvtbl3AcctTitle = fgvtbl3AcctTitle;
    }

    public Fgvtbl3Block withFgvtbl3AcctTitle(String fgvtbl3AcctTitle) {
        this.fgvtbl3AcctTitle = fgvtbl3AcctTitle;
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

    public Fgvtbl3Block withDisplayBegBalDrCr(String displayBegBalDrCr) {
        this.displayBegBalDrCr = displayBegBalDrCr;
        return this;
    }

    /**
     * Acct Type
     * <p>
     * 
     * 
     */
    @JsonProperty("fgvtbl3AtypCode")
    public String getFgvtbl3AtypCode() {
        return fgvtbl3AtypCode;
    }

    /**
     * Acct Type
     * <p>
     * 
     * 
     */
    @JsonProperty("fgvtbl3AtypCode")
    public void setFgvtbl3AtypCode(String fgvtbl3AtypCode) {
        this.fgvtbl3AtypCode = fgvtbl3AtypCode;
    }

    public Fgvtbl3Block withFgvtbl3AtypCode(String fgvtbl3AtypCode) {
        this.fgvtbl3AtypCode = fgvtbl3AtypCode;
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

    public Fgvtbl3Block withDisplayCurrBalDrCr(String displayCurrBalDrCr) {
        this.displayCurrBalDrCr = displayCurrBalDrCr;
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

    public Fgvtbl3Block withDisplayCurrBal(Double displayCurrBal) {
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

    public Fgvtbl3Block withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgvtbl3Block.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayBegBal");
        sb.append('=');
        sb.append(((this.displayBegBal == null)?"<null>":this.displayBegBal));
        sb.append(',');
        sb.append("begDrCrDesc");
        sb.append('=');
        sb.append(((this.begDrCrDesc == null)?"<null>":this.begDrCrDesc));
        sb.append(',');
        sb.append("curDrCrDesc");
        sb.append('=');
        sb.append(((this.curDrCrDesc == null)?"<null>":this.curDrCrDesc));
        sb.append(',');
        sb.append("fgvtbl3AcctCode");
        sb.append('=');
        sb.append(((this.fgvtbl3AcctCode == null)?"<null>":this.fgvtbl3AcctCode));
        sb.append(',');
        sb.append("fgvtbl3AcctTitle");
        sb.append('=');
        sb.append(((this.fgvtbl3AcctTitle == null)?"<null>":this.fgvtbl3AcctTitle));
        sb.append(',');
        sb.append("displayBegBalDrCr");
        sb.append('=');
        sb.append(((this.displayBegBalDrCr == null)?"<null>":this.displayBegBalDrCr));
        sb.append(',');
        sb.append("fgvtbl3AtypCode");
        sb.append('=');
        sb.append(((this.fgvtbl3AtypCode == null)?"<null>":this.fgvtbl3AtypCode));
        sb.append(',');
        sb.append("displayCurrBalDrCr");
        sb.append('=');
        sb.append(((this.displayCurrBalDrCr == null)?"<null>":this.displayCurrBalDrCr));
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
        result = ((result* 31)+((this.begDrCrDesc == null)? 0 :this.begDrCrDesc.hashCode()));
        result = ((result* 31)+((this.curDrCrDesc == null)? 0 :this.curDrCrDesc.hashCode()));
        result = ((result* 31)+((this.fgvtbl3AcctCode == null)? 0 :this.fgvtbl3AcctCode.hashCode()));
        result = ((result* 31)+((this.fgvtbl3AcctTitle == null)? 0 :this.fgvtbl3AcctTitle.hashCode()));
        result = ((result* 31)+((this.displayBegBalDrCr == null)? 0 :this.displayBegBalDrCr.hashCode()));
        result = ((result* 31)+((this.fgvtbl3AtypCode == null)? 0 :this.fgvtbl3AtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayCurrBalDrCr == null)? 0 :this.displayCurrBalDrCr.hashCode()));
        result = ((result* 31)+((this.displayCurrBal == null)? 0 :this.displayCurrBal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgvtbl3Block) == false) {
            return false;
        }
        Fgvtbl3Block rhs = ((Fgvtbl3Block) other);
        return (((((((((((this.displayBegBal == rhs.displayBegBal)||((this.displayBegBal!= null)&&this.displayBegBal.equals(rhs.displayBegBal)))&&((this.begDrCrDesc == rhs.begDrCrDesc)||((this.begDrCrDesc!= null)&&this.begDrCrDesc.equals(rhs.begDrCrDesc))))&&((this.curDrCrDesc == rhs.curDrCrDesc)||((this.curDrCrDesc!= null)&&this.curDrCrDesc.equals(rhs.curDrCrDesc))))&&((this.fgvtbl3AcctCode == rhs.fgvtbl3AcctCode)||((this.fgvtbl3AcctCode!= null)&&this.fgvtbl3AcctCode.equals(rhs.fgvtbl3AcctCode))))&&((this.fgvtbl3AcctTitle == rhs.fgvtbl3AcctTitle)||((this.fgvtbl3AcctTitle!= null)&&this.fgvtbl3AcctTitle.equals(rhs.fgvtbl3AcctTitle))))&&((this.displayBegBalDrCr == rhs.displayBegBalDrCr)||((this.displayBegBalDrCr!= null)&&this.displayBegBalDrCr.equals(rhs.displayBegBalDrCr))))&&((this.fgvtbl3AtypCode == rhs.fgvtbl3AtypCode)||((this.fgvtbl3AtypCode!= null)&&this.fgvtbl3AtypCode.equals(rhs.fgvtbl3AtypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayCurrBalDrCr == rhs.displayCurrBalDrCr)||((this.displayCurrBalDrCr!= null)&&this.displayCurrBalDrCr.equals(rhs.displayCurrBalDrCr))))&&((this.displayCurrBal == rhs.displayCurrBal)||((this.displayCurrBal!= null)&&this.displayCurrBal.equals(rhs.displayCurrBal))));
    }

}
