
package com.ellucian.generated.bpapi.ban.general_ledger_activity.v1_0_0;

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
    "fgvtrndTransDesc",
    "fgvtrndDocCode",
    "fgvtrndDrCrInd",
    "fgvtrndTransAmt",
    "fgvtrndRuclCode",
    "fgvtrndAcctCode",
    "fgvtrndTransDate"
})
@Generated("jsonschema2pojo")
public class GeneralLedgerActivity100GetResponse {

    /**
     * Lineage reference object : FGVTRND_TRANS_DESC
     * 
     */
    @JsonProperty("fgvtrndTransDesc")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_TRANS_DESC")
    private String fgvtrndTransDesc;
    /**
     * Lineage reference object : FGVTRND_DOC_CODE
     * 
     */
    @JsonProperty("fgvtrndDocCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_DOC_CODE")
    private String fgvtrndDocCode;
    /**
     * Lineage reference object : FGVTRND_DR_CR_IND
     * 
     */
    @JsonProperty("fgvtrndDrCrInd")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_DR_CR_IND")
    private String fgvtrndDrCrInd;
    /**
     * Lineage reference object : FGVTRND_TRANS_AMT
     * 
     */
    @JsonProperty("fgvtrndTransAmt")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_TRANS_AMT")
    private Double fgvtrndTransAmt;
    /**
     * Lineage reference object : FGVTRND_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("fgvtrndRuclCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_RUCL_CODE, Lookup lineage reference object : ftvrucl")
    private String fgvtrndRuclCode;
    /**
     * Lineage reference object : FGVTRND_ACCT_CODE
     * 
     */
    @JsonProperty("fgvtrndAcctCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_ACCT_CODE")
    private String fgvtrndAcctCode;
    /**
     * Lineage reference object : FGVTRND_TRANS_DATE
     * 
     */
    @JsonProperty("fgvtrndTransDate")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_TRANS_DATE")
    private Date fgvtrndTransDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : FGVTRND_TRANS_DESC
     * 
     */
    @JsonProperty("fgvtrndTransDesc")
    public String getFgvtrndTransDesc() {
        return fgvtrndTransDesc;
    }

    /**
     * Lineage reference object : FGVTRND_TRANS_DESC
     * 
     */
    @JsonProperty("fgvtrndTransDesc")
    public void setFgvtrndTransDesc(String fgvtrndTransDesc) {
        this.fgvtrndTransDesc = fgvtrndTransDesc;
    }

    public GeneralLedgerActivity100GetResponse withFgvtrndTransDesc(String fgvtrndTransDesc) {
        this.fgvtrndTransDesc = fgvtrndTransDesc;
        return this;
    }

    /**
     * Lineage reference object : FGVTRND_DOC_CODE
     * 
     */
    @JsonProperty("fgvtrndDocCode")
    public String getFgvtrndDocCode() {
        return fgvtrndDocCode;
    }

    /**
     * Lineage reference object : FGVTRND_DOC_CODE
     * 
     */
    @JsonProperty("fgvtrndDocCode")
    public void setFgvtrndDocCode(String fgvtrndDocCode) {
        this.fgvtrndDocCode = fgvtrndDocCode;
    }

    public GeneralLedgerActivity100GetResponse withFgvtrndDocCode(String fgvtrndDocCode) {
        this.fgvtrndDocCode = fgvtrndDocCode;
        return this;
    }

    /**
     * Lineage reference object : FGVTRND_DR_CR_IND
     * 
     */
    @JsonProperty("fgvtrndDrCrInd")
    public String getFgvtrndDrCrInd() {
        return fgvtrndDrCrInd;
    }

    /**
     * Lineage reference object : FGVTRND_DR_CR_IND
     * 
     */
    @JsonProperty("fgvtrndDrCrInd")
    public void setFgvtrndDrCrInd(String fgvtrndDrCrInd) {
        this.fgvtrndDrCrInd = fgvtrndDrCrInd;
    }

    public GeneralLedgerActivity100GetResponse withFgvtrndDrCrInd(String fgvtrndDrCrInd) {
        this.fgvtrndDrCrInd = fgvtrndDrCrInd;
        return this;
    }

    /**
     * Lineage reference object : FGVTRND_TRANS_AMT
     * 
     */
    @JsonProperty("fgvtrndTransAmt")
    public Double getFgvtrndTransAmt() {
        return fgvtrndTransAmt;
    }

    /**
     * Lineage reference object : FGVTRND_TRANS_AMT
     * 
     */
    @JsonProperty("fgvtrndTransAmt")
    public void setFgvtrndTransAmt(Double fgvtrndTransAmt) {
        this.fgvtrndTransAmt = fgvtrndTransAmt;
    }

    public GeneralLedgerActivity100GetResponse withFgvtrndTransAmt(Double fgvtrndTransAmt) {
        this.fgvtrndTransAmt = fgvtrndTransAmt;
        return this;
    }

    /**
     * Lineage reference object : FGVTRND_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("fgvtrndRuclCode")
    public String getFgvtrndRuclCode() {
        return fgvtrndRuclCode;
    }

    /**
     * Lineage reference object : FGVTRND_RUCL_CODE, Lookup lineage reference object : ftvrucl
     * 
     */
    @JsonProperty("fgvtrndRuclCode")
    public void setFgvtrndRuclCode(String fgvtrndRuclCode) {
        this.fgvtrndRuclCode = fgvtrndRuclCode;
    }

    public GeneralLedgerActivity100GetResponse withFgvtrndRuclCode(String fgvtrndRuclCode) {
        this.fgvtrndRuclCode = fgvtrndRuclCode;
        return this;
    }

    /**
     * Lineage reference object : FGVTRND_ACCT_CODE
     * 
     */
    @JsonProperty("fgvtrndAcctCode")
    public String getFgvtrndAcctCode() {
        return fgvtrndAcctCode;
    }

    /**
     * Lineage reference object : FGVTRND_ACCT_CODE
     * 
     */
    @JsonProperty("fgvtrndAcctCode")
    public void setFgvtrndAcctCode(String fgvtrndAcctCode) {
        this.fgvtrndAcctCode = fgvtrndAcctCode;
    }

    public GeneralLedgerActivity100GetResponse withFgvtrndAcctCode(String fgvtrndAcctCode) {
        this.fgvtrndAcctCode = fgvtrndAcctCode;
        return this;
    }

    /**
     * Lineage reference object : FGVTRND_TRANS_DATE
     * 
     */
    @JsonProperty("fgvtrndTransDate")
    public Date getFgvtrndTransDate() {
        return fgvtrndTransDate;
    }

    /**
     * Lineage reference object : FGVTRND_TRANS_DATE
     * 
     */
    @JsonProperty("fgvtrndTransDate")
    public void setFgvtrndTransDate(Date fgvtrndTransDate) {
        this.fgvtrndTransDate = fgvtrndTransDate;
    }

    public GeneralLedgerActivity100GetResponse withFgvtrndTransDate(Date fgvtrndTransDate) {
        this.fgvtrndTransDate = fgvtrndTransDate;
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

    public GeneralLedgerActivity100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralLedgerActivity100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fgvtrndTransDesc");
        sb.append('=');
        sb.append(((this.fgvtrndTransDesc == null)?"<null>":this.fgvtrndTransDesc));
        sb.append(',');
        sb.append("fgvtrndDocCode");
        sb.append('=');
        sb.append(((this.fgvtrndDocCode == null)?"<null>":this.fgvtrndDocCode));
        sb.append(',');
        sb.append("fgvtrndDrCrInd");
        sb.append('=');
        sb.append(((this.fgvtrndDrCrInd == null)?"<null>":this.fgvtrndDrCrInd));
        sb.append(',');
        sb.append("fgvtrndTransAmt");
        sb.append('=');
        sb.append(((this.fgvtrndTransAmt == null)?"<null>":this.fgvtrndTransAmt));
        sb.append(',');
        sb.append("fgvtrndRuclCode");
        sb.append('=');
        sb.append(((this.fgvtrndRuclCode == null)?"<null>":this.fgvtrndRuclCode));
        sb.append(',');
        sb.append("fgvtrndAcctCode");
        sb.append('=');
        sb.append(((this.fgvtrndAcctCode == null)?"<null>":this.fgvtrndAcctCode));
        sb.append(',');
        sb.append("fgvtrndTransDate");
        sb.append('=');
        sb.append(((this.fgvtrndTransDate == null)?"<null>":this.fgvtrndTransDate));
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
        result = ((result* 31)+((this.fgvtrndTransDesc == null)? 0 :this.fgvtrndTransDesc.hashCode()));
        result = ((result* 31)+((this.fgvtrndDocCode == null)? 0 :this.fgvtrndDocCode.hashCode()));
        result = ((result* 31)+((this.fgvtrndDrCrInd == null)? 0 :this.fgvtrndDrCrInd.hashCode()));
        result = ((result* 31)+((this.fgvtrndTransAmt == null)? 0 :this.fgvtrndTransAmt.hashCode()));
        result = ((result* 31)+((this.fgvtrndRuclCode == null)? 0 :this.fgvtrndRuclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fgvtrndAcctCode == null)? 0 :this.fgvtrndAcctCode.hashCode()));
        result = ((result* 31)+((this.fgvtrndTransDate == null)? 0 :this.fgvtrndTransDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralLedgerActivity100GetResponse) == false) {
            return false;
        }
        GeneralLedgerActivity100GetResponse rhs = ((GeneralLedgerActivity100GetResponse) other);
        return (((((((((this.fgvtrndTransDesc == rhs.fgvtrndTransDesc)||((this.fgvtrndTransDesc!= null)&&this.fgvtrndTransDesc.equals(rhs.fgvtrndTransDesc)))&&((this.fgvtrndDocCode == rhs.fgvtrndDocCode)||((this.fgvtrndDocCode!= null)&&this.fgvtrndDocCode.equals(rhs.fgvtrndDocCode))))&&((this.fgvtrndDrCrInd == rhs.fgvtrndDrCrInd)||((this.fgvtrndDrCrInd!= null)&&this.fgvtrndDrCrInd.equals(rhs.fgvtrndDrCrInd))))&&((this.fgvtrndTransAmt == rhs.fgvtrndTransAmt)||((this.fgvtrndTransAmt!= null)&&this.fgvtrndTransAmt.equals(rhs.fgvtrndTransAmt))))&&((this.fgvtrndRuclCode == rhs.fgvtrndRuclCode)||((this.fgvtrndRuclCode!= null)&&this.fgvtrndRuclCode.equals(rhs.fgvtrndRuclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fgvtrndAcctCode == rhs.fgvtrndAcctCode)||((this.fgvtrndAcctCode!= null)&&this.fgvtrndAcctCode.equals(rhs.fgvtrndAcctCode))))&&((this.fgvtrndTransDate == rhs.fgvtrndTransDate)||((this.fgvtrndTransDate!= null)&&this.fgvtrndTransDate.equals(rhs.fgvtrndTransDate))));
    }

}
