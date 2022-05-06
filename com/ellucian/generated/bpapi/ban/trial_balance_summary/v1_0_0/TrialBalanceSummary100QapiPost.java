
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
    "keyblocCoasCode",
    "keyblocFsyrCode",
    "keyblocFundCode",
    "keyblocFtypCode",
    "keyblocAcctCode",
    "keyblocAtypCode"
})
@Generated("jsonschema2pojo")
public class TrialBalanceSummary100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    private String keyblocCoasCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    private String keyblocFsyrCode;
    @JsonProperty("keyblocFundCode")
    private String keyblocFundCode;
    @JsonProperty("keyblocFtypCode")
    private String keyblocFtypCode;
    @JsonProperty("keyblocAcctCode")
    private String keyblocAcctCode;
    @JsonProperty("keyblocAtypCode")
    private String keyblocAtypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    public String getKeyblocCoasCode() {
        return keyblocCoasCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    public void setKeyblocCoasCode(String keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
    }

    public TrialBalanceSummary100QapiPost withKeyblocCoasCode(String keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    public String getKeyblocFsyrCode() {
        return keyblocFsyrCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    public void setKeyblocFsyrCode(String keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
    }

    public TrialBalanceSummary100QapiPost withKeyblocFsyrCode(String keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
        return this;
    }

    @JsonProperty("keyblocFundCode")
    public String getKeyblocFundCode() {
        return keyblocFundCode;
    }

    @JsonProperty("keyblocFundCode")
    public void setKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
    }

    public TrialBalanceSummary100QapiPost withKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
        return this;
    }

    @JsonProperty("keyblocFtypCode")
    public String getKeyblocFtypCode() {
        return keyblocFtypCode;
    }

    @JsonProperty("keyblocFtypCode")
    public void setKeyblocFtypCode(String keyblocFtypCode) {
        this.keyblocFtypCode = keyblocFtypCode;
    }

    public TrialBalanceSummary100QapiPost withKeyblocFtypCode(String keyblocFtypCode) {
        this.keyblocFtypCode = keyblocFtypCode;
        return this;
    }

    @JsonProperty("keyblocAcctCode")
    public String getKeyblocAcctCode() {
        return keyblocAcctCode;
    }

    @JsonProperty("keyblocAcctCode")
    public void setKeyblocAcctCode(String keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
    }

    public TrialBalanceSummary100QapiPost withKeyblocAcctCode(String keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
        return this;
    }

    @JsonProperty("keyblocAtypCode")
    public String getKeyblocAtypCode() {
        return keyblocAtypCode;
    }

    @JsonProperty("keyblocAtypCode")
    public void setKeyblocAtypCode(String keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
    }

    public TrialBalanceSummary100QapiPost withKeyblocAtypCode(String keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
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

    public TrialBalanceSummary100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TrialBalanceSummary100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocCoasCode");
        sb.append('=');
        sb.append(((this.keyblocCoasCode == null)?"<null>":this.keyblocCoasCode));
        sb.append(',');
        sb.append("keyblocFsyrCode");
        sb.append('=');
        sb.append(((this.keyblocFsyrCode == null)?"<null>":this.keyblocFsyrCode));
        sb.append(',');
        sb.append("keyblocFundCode");
        sb.append('=');
        sb.append(((this.keyblocFundCode == null)?"<null>":this.keyblocFundCode));
        sb.append(',');
        sb.append("keyblocFtypCode");
        sb.append('=');
        sb.append(((this.keyblocFtypCode == null)?"<null>":this.keyblocFtypCode));
        sb.append(',');
        sb.append("keyblocAcctCode");
        sb.append('=');
        sb.append(((this.keyblocAcctCode == null)?"<null>":this.keyblocAcctCode));
        sb.append(',');
        sb.append("keyblocAtypCode");
        sb.append('=');
        sb.append(((this.keyblocAtypCode == null)?"<null>":this.keyblocAtypCode));
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
        if ((other instanceof TrialBalanceSummary100QapiPost) == false) {
            return false;
        }
        TrialBalanceSummary100QapiPost rhs = ((TrialBalanceSummary100QapiPost) other);
        return ((((((((this.keyblocCoasCode == rhs.keyblocCoasCode)||((this.keyblocCoasCode!= null)&&this.keyblocCoasCode.equals(rhs.keyblocCoasCode)))&&((this.keyblocFtypCode == rhs.keyblocFtypCode)||((this.keyblocFtypCode!= null)&&this.keyblocFtypCode.equals(rhs.keyblocFtypCode))))&&((this.keyblocAtypCode == rhs.keyblocAtypCode)||((this.keyblocAtypCode!= null)&&this.keyblocAtypCode.equals(rhs.keyblocAtypCode))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))))&&((this.keyblocFsyrCode == rhs.keyblocFsyrCode)||((this.keyblocFsyrCode!= null)&&this.keyblocFsyrCode.equals(rhs.keyblocFsyrCode))));
    }

}
