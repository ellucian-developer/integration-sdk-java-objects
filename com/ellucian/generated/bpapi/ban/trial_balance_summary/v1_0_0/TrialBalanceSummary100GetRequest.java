
package com.ellucian.generated.bpapi.ban.trial_balance_summary.v1_0_0;

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
    "keyblocCoasCode",
    "keyblocFtypCode",
    "keyblocAtypCode",
    "keyblocAcctCode",
    "keyblocFundCode",
    "keyblocFsyrCode"
})
@Generated("jsonschema2pojo")
public class TrialBalanceSummary100GetRequest {

    /**
     * COA
     * <p>
     * Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    @JsonPropertyDescription("Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas")
    private Object keyblocCoasCode;
    /**
     * OR Fund Type
     * <p>
     * Lineage reference object : keyblocFtypCode, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("keyblocFtypCode")
    @JsonPropertyDescription("Lineage reference object : keyblocFtypCode, Lookup lineage reference object : ftvftyp")
    private Object keyblocFtypCode;
    /**
     * OR Acct Type
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
     * COA
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
     * COA
     * <p>
     * Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    public void setKeyblocCoasCode(Object keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
    }

    public TrialBalanceSummary100GetRequest withKeyblocCoasCode(Object keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
        return this;
    }

    /**
     * OR Fund Type
     * <p>
     * Lineage reference object : keyblocFtypCode, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("keyblocFtypCode")
    public Object getKeyblocFtypCode() {
        return keyblocFtypCode;
    }

    /**
     * OR Fund Type
     * <p>
     * Lineage reference object : keyblocFtypCode, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("keyblocFtypCode")
    public void setKeyblocFtypCode(Object keyblocFtypCode) {
        this.keyblocFtypCode = keyblocFtypCode;
    }

    public TrialBalanceSummary100GetRequest withKeyblocFtypCode(Object keyblocFtypCode) {
        this.keyblocFtypCode = keyblocFtypCode;
        return this;
    }

    /**
     * OR Acct Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    public Object getKeyblocAtypCode() {
        return keyblocAtypCode;
    }

    /**
     * OR Acct Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    public void setKeyblocAtypCode(Object keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
    }

    public TrialBalanceSummary100GetRequest withKeyblocAtypCode(Object keyblocAtypCode) {
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

    public TrialBalanceSummary100GetRequest withKeyblocAcctCode(Object keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
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

    public TrialBalanceSummary100GetRequest withKeyblocFundCode(Object keyblocFundCode) {
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

    public TrialBalanceSummary100GetRequest withKeyblocFsyrCode(Object keyblocFsyrCode) {
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

    public TrialBalanceSummary100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TrialBalanceSummary100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocCoasCode");
        sb.append('=');
        sb.append(((this.keyblocCoasCode == null)?"<null>":this.keyblocCoasCode));
        sb.append(',');
        sb.append("keyblocFtypCode");
        sb.append('=');
        sb.append(((this.keyblocFtypCode == null)?"<null>":this.keyblocFtypCode));
        sb.append(',');
        sb.append("keyblocAtypCode");
        sb.append('=');
        sb.append(((this.keyblocAtypCode == null)?"<null>":this.keyblocAtypCode));
        sb.append(',');
        sb.append("keyblocAcctCode");
        sb.append('=');
        sb.append(((this.keyblocAcctCode == null)?"<null>":this.keyblocAcctCode));
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
        result = ((result* 31)+((this.keyblocCoasCode == null)? 0 :this.keyblocCoasCode.hashCode()));
        result = ((result* 31)+((this.keyblocFtypCode == null)? 0 :this.keyblocFtypCode.hashCode()));
        result = ((result* 31)+((this.keyblocAtypCode == null)? 0 :this.keyblocAtypCode.hashCode()));
        result = ((result* 31)+((this.keyblocAcctCode == null)? 0 :this.keyblocAcctCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblocFundCode == null)? 0 :this.keyblocFundCode.hashCode()));
        result = ((result* 31)+((this.keyblocFsyrCode == null)? 0 :this.keyblocFsyrCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrialBalanceSummary100GetRequest) == false) {
            return false;
        }
        TrialBalanceSummary100GetRequest rhs = ((TrialBalanceSummary100GetRequest) other);
        return ((((((((this.keyblocCoasCode == rhs.keyblocCoasCode)||((this.keyblocCoasCode!= null)&&this.keyblocCoasCode.equals(rhs.keyblocCoasCode)))&&((this.keyblocFtypCode == rhs.keyblocFtypCode)||((this.keyblocFtypCode!= null)&&this.keyblocFtypCode.equals(rhs.keyblocFtypCode))))&&((this.keyblocAtypCode == rhs.keyblocAtypCode)||((this.keyblocAtypCode!= null)&&this.keyblocAtypCode.equals(rhs.keyblocAtypCode))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))))&&((this.keyblocFsyrCode == rhs.keyblocFsyrCode)||((this.keyblocFsyrCode!= null)&&this.keyblocFsyrCode.equals(rhs.keyblocFsyrCode))));
    }

}
