
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
    "fgvtbl1AcctTitle",
    "keyblocCoasCode",
    "keyblocAtypCode",
    "keyblocAcctCode",
    "fgvtbl1AcctCode",
    "keyblocFundCode",
    "keyblocFsyrCode"
})
@Generated("jsonschema2pojo")
public class GeneralLedgerTrialBalance100GetRequest {

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
     * Chart
     * <p>
     * Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    @JsonPropertyDescription("Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas")
    private Object keyblocCoasCode;
    /**
     * Account Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp")
    private Object keyblocAtypCode;
    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAcctCode")
    private Object keyblocAcctCode;
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
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    @JsonPropertyDescription("Lineage reference object : keyblocFundCode")
    private Object keyblocFundCode;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    @JsonPropertyDescription("Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private Object keyblocFsyrCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public GeneralLedgerTrialBalance100GetRequest withFgvtbl1AcctTitle(String fgvtbl1AcctTitle) {
        this.fgvtbl1AcctTitle = fgvtbl1AcctTitle;
        return this;
    }

    /**
     * Chart
     * <p>
     * Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    public Object getKeyblocCoasCode() {
        return keyblocCoasCode;
    }

    /**
     * Chart
     * <p>
     * Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    public void setKeyblocCoasCode(Object keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
    }

    public GeneralLedgerTrialBalance100GetRequest withKeyblocCoasCode(Object keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
        return this;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    public Object getKeyblocAtypCode() {
        return keyblocAtypCode;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    public void setKeyblocAtypCode(Object keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
    }

    public GeneralLedgerTrialBalance100GetRequest withKeyblocAtypCode(Object keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    public Object getKeyblocAcctCode() {
        return keyblocAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    public void setKeyblocAcctCode(Object keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
    }

    public GeneralLedgerTrialBalance100GetRequest withKeyblocAcctCode(Object keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
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

    public GeneralLedgerTrialBalance100GetRequest withFgvtbl1AcctCode(String fgvtbl1AcctCode) {
        this.fgvtbl1AcctCode = fgvtbl1AcctCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    public Object getKeyblocFundCode() {
        return keyblocFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    public void setKeyblocFundCode(Object keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
    }

    public GeneralLedgerTrialBalance100GetRequest withKeyblocFundCode(Object keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    public Object getKeyblocFsyrCode() {
        return keyblocFsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    public void setKeyblocFsyrCode(Object keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
    }

    public GeneralLedgerTrialBalance100GetRequest withKeyblocFsyrCode(Object keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
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

    public GeneralLedgerTrialBalance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralLedgerTrialBalance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fgvtbl1AcctTitle");
        sb.append('=');
        sb.append(((this.fgvtbl1AcctTitle == null)?"<null>":this.fgvtbl1AcctTitle));
        sb.append(',');
        sb.append("keyblocCoasCode");
        sb.append('=');
        sb.append(((this.keyblocCoasCode == null)?"<null>":this.keyblocCoasCode));
        sb.append(',');
        sb.append("keyblocAtypCode");
        sb.append('=');
        sb.append(((this.keyblocAtypCode == null)?"<null>":this.keyblocAtypCode));
        sb.append(',');
        sb.append("keyblocAcctCode");
        sb.append('=');
        sb.append(((this.keyblocAcctCode == null)?"<null>":this.keyblocAcctCode));
        sb.append(',');
        sb.append("fgvtbl1AcctCode");
        sb.append('=');
        sb.append(((this.fgvtbl1AcctCode == null)?"<null>":this.fgvtbl1AcctCode));
        sb.append(',');
        sb.append("keyblocFundCode");
        sb.append('=');
        sb.append(((this.keyblocFundCode == null)?"<null>":this.keyblocFundCode));
        sb.append(',');
        sb.append("keyblocFsyrCode");
        sb.append('=');
        sb.append(((this.keyblocFsyrCode == null)?"<null>":this.keyblocFsyrCode));
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
        result = ((result* 31)+((this.fgvtbl1AcctTitle == null)? 0 :this.fgvtbl1AcctTitle.hashCode()));
        result = ((result* 31)+((this.keyblocCoasCode == null)? 0 :this.keyblocCoasCode.hashCode()));
        result = ((result* 31)+((this.keyblocAtypCode == null)? 0 :this.keyblocAtypCode.hashCode()));
        result = ((result* 31)+((this.keyblocAcctCode == null)? 0 :this.keyblocAcctCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fgvtbl1AcctCode == null)? 0 :this.fgvtbl1AcctCode.hashCode()));
        result = ((result* 31)+((this.keyblocFundCode == null)? 0 :this.keyblocFundCode.hashCode()));
        result = ((result* 31)+((this.keyblocFsyrCode == null)? 0 :this.keyblocFsyrCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralLedgerTrialBalance100GetRequest) == false) {
            return false;
        }
        GeneralLedgerTrialBalance100GetRequest rhs = ((GeneralLedgerTrialBalance100GetRequest) other);
        return (((((((((this.fgvtbl1AcctTitle == rhs.fgvtbl1AcctTitle)||((this.fgvtbl1AcctTitle!= null)&&this.fgvtbl1AcctTitle.equals(rhs.fgvtbl1AcctTitle)))&&((this.keyblocCoasCode == rhs.keyblocCoasCode)||((this.keyblocCoasCode!= null)&&this.keyblocCoasCode.equals(rhs.keyblocCoasCode))))&&((this.keyblocAtypCode == rhs.keyblocAtypCode)||((this.keyblocAtypCode!= null)&&this.keyblocAtypCode.equals(rhs.keyblocAtypCode))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fgvtbl1AcctCode == rhs.fgvtbl1AcctCode)||((this.fgvtbl1AcctCode!= null)&&this.fgvtbl1AcctCode.equals(rhs.fgvtbl1AcctCode))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))))&&((this.keyblocFsyrCode == rhs.keyblocFsyrCode)||((this.keyblocFsyrCode!= null)&&this.keyblocFsyrCode.equals(rhs.keyblocFsyrCode))));
    }

}
