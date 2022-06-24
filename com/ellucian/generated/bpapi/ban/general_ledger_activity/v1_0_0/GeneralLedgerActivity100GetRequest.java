
package com.ellucian.generated.bpapi.ban.general_ledger_activity.v1_0_0;

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
    "keyblckFundCode",
    "keyblckCoasCode",
    "fgvtrndDocCode",
    "keyblckPeriod",
    "keyblckFsyrCode",
    "keyblckAcciCode",
    "keyblckAcctCode",
    "fgvtrndTransAmt",
    "fgvtrndDrCrInd",
    "fgvtrndRuclCode",
    "fgvtrndAcctCode"
})
@Generated("jsonschema2pojo")
public class GeneralLedgerActivity100GetRequest {

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblckFundCode
     * (Required)
     * 
     */
    @JsonProperty("keyblckFundCode")
    @JsonPropertyDescription("Lineage reference object : keyblckFundCode")
    private String keyblckFundCode;
    /**
     * Chart
     * <p>
     * Lineage reference object : keyblckCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblckCoasCode")
    @JsonPropertyDescription("Lineage reference object : keyblckCoasCode, Lookup lineage reference object : ftvcoas")
    private String keyblckCoasCode;
    /**
     * Lineage reference object : FGVTRND_DOC_CODE
     * 
     */
    @JsonProperty("fgvtrndDocCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_DOC_CODE")
    private String fgvtrndDocCode;
    /**
     * Period
     * <p>
     * Lineage reference object : keyblckPeriod
     * 
     */
    @JsonProperty("keyblckPeriod")
    @JsonPropertyDescription("Lineage reference object : keyblckPeriod")
    private String keyblckPeriod;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblckFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblckFsyrCode")
    @JsonPropertyDescription("Lineage reference object : keyblckFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private String keyblckFsyrCode;
    /**
     * Index
     * <p>
     * Lineage reference object : keyblckAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblckAcciCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAcciCode, Lookup lineage reference object : ftvacci")
    private String keyblckAcciCode;
    /**
     * Account
     * <p>
     * Lineage reference object : keyblckAcctCode
     * 
     */
    @JsonProperty("keyblckAcctCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAcctCode")
    private String keyblckAcctCode;
    /**
     * Lineage reference object : FGVTRND_TRANS_AMT
     * 
     */
    @JsonProperty("fgvtrndTransAmt")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_TRANS_AMT")
    private Double fgvtrndTransAmt;
    /**
     * Lineage reference object : FGVTRND_DR_CR_IND
     * 
     */
    @JsonProperty("fgvtrndDrCrInd")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_DR_CR_IND")
    private String fgvtrndDrCrInd;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblckFundCode
     * (Required)
     * 
     */
    @JsonProperty("keyblckFundCode")
    public String getKeyblckFundCode() {
        return keyblckFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblckFundCode
     * (Required)
     * 
     */
    @JsonProperty("keyblckFundCode")
    public void setKeyblckFundCode(String keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
    }

    public GeneralLedgerActivity100GetRequest withKeyblckFundCode(String keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
        return this;
    }

    /**
     * Chart
     * <p>
     * Lineage reference object : keyblckCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblckCoasCode")
    public String getKeyblckCoasCode() {
        return keyblckCoasCode;
    }

    /**
     * Chart
     * <p>
     * Lineage reference object : keyblckCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblckCoasCode")
    public void setKeyblckCoasCode(String keyblckCoasCode) {
        this.keyblckCoasCode = keyblckCoasCode;
    }

    public GeneralLedgerActivity100GetRequest withKeyblckCoasCode(String keyblckCoasCode) {
        this.keyblckCoasCode = keyblckCoasCode;
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

    public GeneralLedgerActivity100GetRequest withFgvtrndDocCode(String fgvtrndDocCode) {
        this.fgvtrndDocCode = fgvtrndDocCode;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : keyblckPeriod
     * 
     */
    @JsonProperty("keyblckPeriod")
    public String getKeyblckPeriod() {
        return keyblckPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : keyblckPeriod
     * 
     */
    @JsonProperty("keyblckPeriod")
    public void setKeyblckPeriod(String keyblckPeriod) {
        this.keyblckPeriod = keyblckPeriod;
    }

    public GeneralLedgerActivity100GetRequest withKeyblckPeriod(String keyblckPeriod) {
        this.keyblckPeriod = keyblckPeriod;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblckFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblckFsyrCode")
    public String getKeyblckFsyrCode() {
        return keyblckFsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblckFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblckFsyrCode")
    public void setKeyblckFsyrCode(String keyblckFsyrCode) {
        this.keyblckFsyrCode = keyblckFsyrCode;
    }

    public GeneralLedgerActivity100GetRequest withKeyblckFsyrCode(String keyblckFsyrCode) {
        this.keyblckFsyrCode = keyblckFsyrCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : keyblckAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblckAcciCode")
    public String getKeyblckAcciCode() {
        return keyblckAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : keyblckAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblckAcciCode")
    public void setKeyblckAcciCode(String keyblckAcciCode) {
        this.keyblckAcciCode = keyblckAcciCode;
    }

    public GeneralLedgerActivity100GetRequest withKeyblckAcciCode(String keyblckAcciCode) {
        this.keyblckAcciCode = keyblckAcciCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblckAcctCode
     * 
     */
    @JsonProperty("keyblckAcctCode")
    public String getKeyblckAcctCode() {
        return keyblckAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblckAcctCode
     * 
     */
    @JsonProperty("keyblckAcctCode")
    public void setKeyblckAcctCode(String keyblckAcctCode) {
        this.keyblckAcctCode = keyblckAcctCode;
    }

    public GeneralLedgerActivity100GetRequest withKeyblckAcctCode(String keyblckAcctCode) {
        this.keyblckAcctCode = keyblckAcctCode;
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

    public GeneralLedgerActivity100GetRequest withFgvtrndTransAmt(Double fgvtrndTransAmt) {
        this.fgvtrndTransAmt = fgvtrndTransAmt;
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

    public GeneralLedgerActivity100GetRequest withFgvtrndDrCrInd(String fgvtrndDrCrInd) {
        this.fgvtrndDrCrInd = fgvtrndDrCrInd;
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

    public GeneralLedgerActivity100GetRequest withFgvtrndRuclCode(String fgvtrndRuclCode) {
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

    public GeneralLedgerActivity100GetRequest withFgvtrndAcctCode(String fgvtrndAcctCode) {
        this.fgvtrndAcctCode = fgvtrndAcctCode;
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

    public GeneralLedgerActivity100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralLedgerActivity100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckFundCode");
        sb.append('=');
        sb.append(((this.keyblckFundCode == null)?"<null>":this.keyblckFundCode));
        sb.append(',');
        sb.append("keyblckCoasCode");
        sb.append('=');
        sb.append(((this.keyblckCoasCode == null)?"<null>":this.keyblckCoasCode));
        sb.append(',');
        sb.append("fgvtrndDocCode");
        sb.append('=');
        sb.append(((this.fgvtrndDocCode == null)?"<null>":this.fgvtrndDocCode));
        sb.append(',');
        sb.append("keyblckPeriod");
        sb.append('=');
        sb.append(((this.keyblckPeriod == null)?"<null>":this.keyblckPeriod));
        sb.append(',');
        sb.append("keyblckFsyrCode");
        sb.append('=');
        sb.append(((this.keyblckFsyrCode == null)?"<null>":this.keyblckFsyrCode));
        sb.append(',');
        sb.append("keyblckAcciCode");
        sb.append('=');
        sb.append(((this.keyblckAcciCode == null)?"<null>":this.keyblckAcciCode));
        sb.append(',');
        sb.append("keyblckAcctCode");
        sb.append('=');
        sb.append(((this.keyblckAcctCode == null)?"<null>":this.keyblckAcctCode));
        sb.append(',');
        sb.append("fgvtrndTransAmt");
        sb.append('=');
        sb.append(((this.fgvtrndTransAmt == null)?"<null>":this.fgvtrndTransAmt));
        sb.append(',');
        sb.append("fgvtrndDrCrInd");
        sb.append('=');
        sb.append(((this.fgvtrndDrCrInd == null)?"<null>":this.fgvtrndDrCrInd));
        sb.append(',');
        sb.append("fgvtrndRuclCode");
        sb.append('=');
        sb.append(((this.fgvtrndRuclCode == null)?"<null>":this.fgvtrndRuclCode));
        sb.append(',');
        sb.append("fgvtrndAcctCode");
        sb.append('=');
        sb.append(((this.fgvtrndAcctCode == null)?"<null>":this.fgvtrndAcctCode));
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
        result = ((result* 31)+((this.keyblckFundCode == null)? 0 :this.keyblckFundCode.hashCode()));
        result = ((result* 31)+((this.keyblckCoasCode == null)? 0 :this.keyblckCoasCode.hashCode()));
        result = ((result* 31)+((this.keyblckFsyrCode == null)? 0 :this.keyblckFsyrCode.hashCode()));
        result = ((result* 31)+((this.keyblckAcciCode == null)? 0 :this.keyblckAcciCode.hashCode()));
        result = ((result* 31)+((this.fgvtrndTransAmt == null)? 0 :this.fgvtrndTransAmt.hashCode()));
        result = ((result* 31)+((this.fgvtrndRuclCode == null)? 0 :this.fgvtrndRuclCode.hashCode()));
        result = ((result* 31)+((this.fgvtrndDocCode == null)? 0 :this.fgvtrndDocCode.hashCode()));
        result = ((result* 31)+((this.keyblckPeriod == null)? 0 :this.keyblckPeriod.hashCode()));
        result = ((result* 31)+((this.keyblckAcctCode == null)? 0 :this.keyblckAcctCode.hashCode()));
        result = ((result* 31)+((this.fgvtrndDrCrInd == null)? 0 :this.fgvtrndDrCrInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fgvtrndAcctCode == null)? 0 :this.fgvtrndAcctCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralLedgerActivity100GetRequest) == false) {
            return false;
        }
        GeneralLedgerActivity100GetRequest rhs = ((GeneralLedgerActivity100GetRequest) other);
        return (((((((((((((this.keyblckFundCode == rhs.keyblckFundCode)||((this.keyblckFundCode!= null)&&this.keyblckFundCode.equals(rhs.keyblckFundCode)))&&((this.keyblckCoasCode == rhs.keyblckCoasCode)||((this.keyblckCoasCode!= null)&&this.keyblckCoasCode.equals(rhs.keyblckCoasCode))))&&((this.keyblckFsyrCode == rhs.keyblckFsyrCode)||((this.keyblckFsyrCode!= null)&&this.keyblckFsyrCode.equals(rhs.keyblckFsyrCode))))&&((this.keyblckAcciCode == rhs.keyblckAcciCode)||((this.keyblckAcciCode!= null)&&this.keyblckAcciCode.equals(rhs.keyblckAcciCode))))&&((this.fgvtrndTransAmt == rhs.fgvtrndTransAmt)||((this.fgvtrndTransAmt!= null)&&this.fgvtrndTransAmt.equals(rhs.fgvtrndTransAmt))))&&((this.fgvtrndRuclCode == rhs.fgvtrndRuclCode)||((this.fgvtrndRuclCode!= null)&&this.fgvtrndRuclCode.equals(rhs.fgvtrndRuclCode))))&&((this.fgvtrndDocCode == rhs.fgvtrndDocCode)||((this.fgvtrndDocCode!= null)&&this.fgvtrndDocCode.equals(rhs.fgvtrndDocCode))))&&((this.keyblckPeriod == rhs.keyblckPeriod)||((this.keyblckPeriod!= null)&&this.keyblckPeriod.equals(rhs.keyblckPeriod))))&&((this.keyblckAcctCode == rhs.keyblckAcctCode)||((this.keyblckAcctCode!= null)&&this.keyblckAcctCode.equals(rhs.keyblckAcctCode))))&&((this.fgvtrndDrCrInd == rhs.fgvtrndDrCrInd)||((this.fgvtrndDrCrInd!= null)&&this.fgvtrndDrCrInd.equals(rhs.fgvtrndDrCrInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fgvtrndAcctCode == rhs.fgvtrndAcctCode)||((this.fgvtrndAcctCode!= null)&&this.fgvtrndAcctCode.equals(rhs.fgvtrndAcctCode))));
    }

}
