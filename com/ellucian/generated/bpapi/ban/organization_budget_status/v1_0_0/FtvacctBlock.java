
package com.ellucian.generated.bpapi.ban.organization_budget_status.v1_0_0;

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
    "displaySumRsvr",
    "displayAvailBal",
    "displaySumAdjt",
    "ftvacctAcctCode",
    "ftvacctTitle",
    "displaySumYtdActv",
    "itypeDesc"
})
@Generated("jsonschema2pojo")
public class FtvacctBlock {

    /**
     * Commitments
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumRsvr")
    private Double displaySumRsvr;
    /**
     * Available Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAvailBal")
    private Double displayAvailBal;
    /**
     * Adjusted Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumAdjt")
    private Double displaySumAdjt;
    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * 
     */
    @JsonProperty("ftvacctAcctCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE")
    private String ftvacctAcctCode;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * 
     */
    @JsonProperty("ftvacctTitle")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_TITLE")
    private String ftvacctTitle;
    /**
     * YTD Activity
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumYtdActv")
    private Double displaySumYtdActv;
    /**
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("itypeDesc")
    private String itypeDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Commitments
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumRsvr")
    public Double getDisplaySumRsvr() {
        return displaySumRsvr;
    }

    /**
     * Commitments
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumRsvr")
    public void setDisplaySumRsvr(Double displaySumRsvr) {
        this.displaySumRsvr = displaySumRsvr;
    }

    public FtvacctBlock withDisplaySumRsvr(Double displaySumRsvr) {
        this.displaySumRsvr = displaySumRsvr;
        return this;
    }

    /**
     * Available Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAvailBal")
    public Double getDisplayAvailBal() {
        return displayAvailBal;
    }

    /**
     * Available Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAvailBal")
    public void setDisplayAvailBal(Double displayAvailBal) {
        this.displayAvailBal = displayAvailBal;
    }

    public FtvacctBlock withDisplayAvailBal(Double displayAvailBal) {
        this.displayAvailBal = displayAvailBal;
        return this;
    }

    /**
     * Adjusted Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumAdjt")
    public Double getDisplaySumAdjt() {
        return displaySumAdjt;
    }

    /**
     * Adjusted Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumAdjt")
    public void setDisplaySumAdjt(Double displaySumAdjt) {
        this.displaySumAdjt = displaySumAdjt;
    }

    public FtvacctBlock withDisplaySumAdjt(Double displaySumAdjt) {
        this.displaySumAdjt = displaySumAdjt;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * 
     */
    @JsonProperty("ftvacctAcctCode")
    public String getFtvacctAcctCode() {
        return ftvacctAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * 
     */
    @JsonProperty("ftvacctAcctCode")
    public void setFtvacctAcctCode(String ftvacctAcctCode) {
        this.ftvacctAcctCode = ftvacctAcctCode;
    }

    public FtvacctBlock withFtvacctAcctCode(String ftvacctAcctCode) {
        this.ftvacctAcctCode = ftvacctAcctCode;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * 
     */
    @JsonProperty("ftvacctTitle")
    public String getFtvacctTitle() {
        return ftvacctTitle;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * 
     */
    @JsonProperty("ftvacctTitle")
    public void setFtvacctTitle(String ftvacctTitle) {
        this.ftvacctTitle = ftvacctTitle;
    }

    public FtvacctBlock withFtvacctTitle(String ftvacctTitle) {
        this.ftvacctTitle = ftvacctTitle;
        return this;
    }

    /**
     * YTD Activity
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumYtdActv")
    public Double getDisplaySumYtdActv() {
        return displaySumYtdActv;
    }

    /**
     * YTD Activity
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumYtdActv")
    public void setDisplaySumYtdActv(Double displaySumYtdActv) {
        this.displaySumYtdActv = displaySumYtdActv;
    }

    public FtvacctBlock withDisplaySumYtdActv(Double displaySumYtdActv) {
        this.displaySumYtdActv = displaySumYtdActv;
        return this;
    }

    /**
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("itypeDesc")
    public String getItypeDesc() {
        return itypeDesc;
    }

    /**
     * Type
     * <p>
     * 
     * 
     */
    @JsonProperty("itypeDesc")
    public void setItypeDesc(String itypeDesc) {
        this.itypeDesc = itypeDesc;
    }

    public FtvacctBlock withItypeDesc(String itypeDesc) {
        this.itypeDesc = itypeDesc;
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

    public FtvacctBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FtvacctBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displaySumRsvr");
        sb.append('=');
        sb.append(((this.displaySumRsvr == null)?"<null>":this.displaySumRsvr));
        sb.append(',');
        sb.append("displayAvailBal");
        sb.append('=');
        sb.append(((this.displayAvailBal == null)?"<null>":this.displayAvailBal));
        sb.append(',');
        sb.append("displaySumAdjt");
        sb.append('=');
        sb.append(((this.displaySumAdjt == null)?"<null>":this.displaySumAdjt));
        sb.append(',');
        sb.append("ftvacctAcctCode");
        sb.append('=');
        sb.append(((this.ftvacctAcctCode == null)?"<null>":this.ftvacctAcctCode));
        sb.append(',');
        sb.append("ftvacctTitle");
        sb.append('=');
        sb.append(((this.ftvacctTitle == null)?"<null>":this.ftvacctTitle));
        sb.append(',');
        sb.append("displaySumYtdActv");
        sb.append('=');
        sb.append(((this.displaySumYtdActv == null)?"<null>":this.displaySumYtdActv));
        sb.append(',');
        sb.append("itypeDesc");
        sb.append('=');
        sb.append(((this.itypeDesc == null)?"<null>":this.itypeDesc));
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
        result = ((result* 31)+((this.displaySumRsvr == null)? 0 :this.displaySumRsvr.hashCode()));
        result = ((result* 31)+((this.displayAvailBal == null)? 0 :this.displayAvailBal.hashCode()));
        result = ((result* 31)+((this.displaySumAdjt == null)? 0 :this.displaySumAdjt.hashCode()));
        result = ((result* 31)+((this.ftvacctAcctCode == null)? 0 :this.ftvacctAcctCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftvacctTitle == null)? 0 :this.ftvacctTitle.hashCode()));
        result = ((result* 31)+((this.displaySumYtdActv == null)? 0 :this.displaySumYtdActv.hashCode()));
        result = ((result* 31)+((this.itypeDesc == null)? 0 :this.itypeDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FtvacctBlock) == false) {
            return false;
        }
        FtvacctBlock rhs = ((FtvacctBlock) other);
        return (((((((((this.displaySumRsvr == rhs.displaySumRsvr)||((this.displaySumRsvr!= null)&&this.displaySumRsvr.equals(rhs.displaySumRsvr)))&&((this.displayAvailBal == rhs.displayAvailBal)||((this.displayAvailBal!= null)&&this.displayAvailBal.equals(rhs.displayAvailBal))))&&((this.displaySumAdjt == rhs.displaySumAdjt)||((this.displaySumAdjt!= null)&&this.displaySumAdjt.equals(rhs.displaySumAdjt))))&&((this.ftvacctAcctCode == rhs.ftvacctAcctCode)||((this.ftvacctAcctCode!= null)&&this.ftvacctAcctCode.equals(rhs.ftvacctAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvacctTitle == rhs.ftvacctTitle)||((this.ftvacctTitle!= null)&&this.ftvacctTitle.equals(rhs.ftvacctTitle))))&&((this.displaySumYtdActv == rhs.displaySumYtdActv)||((this.displaySumYtdActv!= null)&&this.displaySumYtdActv.equals(rhs.displaySumYtdActv))))&&((this.itypeDesc == rhs.itypeDesc)||((this.itypeDesc!= null)&&this.itypeDesc.equals(rhs.itypeDesc))));
    }

}
