
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
    "keyblocCoasCode",
    "keyblocFsyrCode",
    "keyblocAcciCode",
    "queryAcct",
    "inclRev",
    "keyblocCmtType",
    "keyblocOrgnCode",
    "keyblocFundCode",
    "keyblocProgCode",
    "keyblocAcctCode",
    "keyblocAtypCode",
    "keyblocActvCode",
    "keyblocLocnCode",
    "ftvacctAcctCode"
})
@Generated("jsonschema2pojo")
public class OrganizationBudgetStatus100QapiPost {

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
    @JsonProperty("keyblocAcciCode")
    private String keyblocAcciCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryAcct")
    private String queryAcct;
    @JsonProperty("inclRev")
    private String inclRev;
    @JsonProperty("keyblocCmtType")
    private String keyblocCmtType;
    @JsonProperty("keyblocOrgnCode")
    private String keyblocOrgnCode;
    @JsonProperty("keyblocFundCode")
    private String keyblocFundCode;
    @JsonProperty("keyblocProgCode")
    private String keyblocProgCode;
    @JsonProperty("keyblocAcctCode")
    private String keyblocAcctCode;
    @JsonProperty("keyblocAtypCode")
    private String keyblocAtypCode;
    @JsonProperty("keyblocActvCode")
    private String keyblocActvCode;
    @JsonProperty("keyblocLocnCode")
    private String keyblocLocnCode;
    /**
     * Account
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * 
     */
    @JsonProperty("ftvacctAcctCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE")
    private String ftvacctAcctCode;
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

    public OrganizationBudgetStatus100QapiPost withKeyblocCoasCode(String keyblocCoasCode) {
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

    public OrganizationBudgetStatus100QapiPost withKeyblocFsyrCode(String keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
        return this;
    }

    @JsonProperty("keyblocAcciCode")
    public String getKeyblocAcciCode() {
        return keyblocAcciCode;
    }

    @JsonProperty("keyblocAcciCode")
    public void setKeyblocAcciCode(String keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
    }

    public OrganizationBudgetStatus100QapiPost withKeyblocAcciCode(String keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryAcct")
    public String getQueryAcct() {
        return queryAcct;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queryAcct")
    public void setQueryAcct(String queryAcct) {
        this.queryAcct = queryAcct;
    }

    public OrganizationBudgetStatus100QapiPost withQueryAcct(String queryAcct) {
        this.queryAcct = queryAcct;
        return this;
    }

    @JsonProperty("inclRev")
    public String getInclRev() {
        return inclRev;
    }

    @JsonProperty("inclRev")
    public void setInclRev(String inclRev) {
        this.inclRev = inclRev;
    }

    public OrganizationBudgetStatus100QapiPost withInclRev(String inclRev) {
        this.inclRev = inclRev;
        return this;
    }

    @JsonProperty("keyblocCmtType")
    public String getKeyblocCmtType() {
        return keyblocCmtType;
    }

    @JsonProperty("keyblocCmtType")
    public void setKeyblocCmtType(String keyblocCmtType) {
        this.keyblocCmtType = keyblocCmtType;
    }

    public OrganizationBudgetStatus100QapiPost withKeyblocCmtType(String keyblocCmtType) {
        this.keyblocCmtType = keyblocCmtType;
        return this;
    }

    @JsonProperty("keyblocOrgnCode")
    public String getKeyblocOrgnCode() {
        return keyblocOrgnCode;
    }

    @JsonProperty("keyblocOrgnCode")
    public void setKeyblocOrgnCode(String keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
    }

    public OrganizationBudgetStatus100QapiPost withKeyblocOrgnCode(String keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
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

    public OrganizationBudgetStatus100QapiPost withKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
        return this;
    }

    @JsonProperty("keyblocProgCode")
    public String getKeyblocProgCode() {
        return keyblocProgCode;
    }

    @JsonProperty("keyblocProgCode")
    public void setKeyblocProgCode(String keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
    }

    public OrganizationBudgetStatus100QapiPost withKeyblocProgCode(String keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
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

    public OrganizationBudgetStatus100QapiPost withKeyblocAcctCode(String keyblocAcctCode) {
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

    public OrganizationBudgetStatus100QapiPost withKeyblocAtypCode(String keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
        return this;
    }

    @JsonProperty("keyblocActvCode")
    public String getKeyblocActvCode() {
        return keyblocActvCode;
    }

    @JsonProperty("keyblocActvCode")
    public void setKeyblocActvCode(String keyblocActvCode) {
        this.keyblocActvCode = keyblocActvCode;
    }

    public OrganizationBudgetStatus100QapiPost withKeyblocActvCode(String keyblocActvCode) {
        this.keyblocActvCode = keyblocActvCode;
        return this;
    }

    @JsonProperty("keyblocLocnCode")
    public String getKeyblocLocnCode() {
        return keyblocLocnCode;
    }

    @JsonProperty("keyblocLocnCode")
    public void setKeyblocLocnCode(String keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
    }

    public OrganizationBudgetStatus100QapiPost withKeyblocLocnCode(String keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
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

    public OrganizationBudgetStatus100QapiPost withFtvacctAcctCode(String ftvacctAcctCode) {
        this.ftvacctAcctCode = ftvacctAcctCode;
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

    public OrganizationBudgetStatus100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationBudgetStatus100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocCoasCode");
        sb.append('=');
        sb.append(((this.keyblocCoasCode == null)?"<null>":this.keyblocCoasCode));
        sb.append(',');
        sb.append("keyblocFsyrCode");
        sb.append('=');
        sb.append(((this.keyblocFsyrCode == null)?"<null>":this.keyblocFsyrCode));
        sb.append(',');
        sb.append("keyblocAcciCode");
        sb.append('=');
        sb.append(((this.keyblocAcciCode == null)?"<null>":this.keyblocAcciCode));
        sb.append(',');
        sb.append("queryAcct");
        sb.append('=');
        sb.append(((this.queryAcct == null)?"<null>":this.queryAcct));
        sb.append(',');
        sb.append("inclRev");
        sb.append('=');
        sb.append(((this.inclRev == null)?"<null>":this.inclRev));
        sb.append(',');
        sb.append("keyblocCmtType");
        sb.append('=');
        sb.append(((this.keyblocCmtType == null)?"<null>":this.keyblocCmtType));
        sb.append(',');
        sb.append("keyblocOrgnCode");
        sb.append('=');
        sb.append(((this.keyblocOrgnCode == null)?"<null>":this.keyblocOrgnCode));
        sb.append(',');
        sb.append("keyblocFundCode");
        sb.append('=');
        sb.append(((this.keyblocFundCode == null)?"<null>":this.keyblocFundCode));
        sb.append(',');
        sb.append("keyblocProgCode");
        sb.append('=');
        sb.append(((this.keyblocProgCode == null)?"<null>":this.keyblocProgCode));
        sb.append(',');
        sb.append("keyblocAcctCode");
        sb.append('=');
        sb.append(((this.keyblocAcctCode == null)?"<null>":this.keyblocAcctCode));
        sb.append(',');
        sb.append("keyblocAtypCode");
        sb.append('=');
        sb.append(((this.keyblocAtypCode == null)?"<null>":this.keyblocAtypCode));
        sb.append(',');
        sb.append("keyblocActvCode");
        sb.append('=');
        sb.append(((this.keyblocActvCode == null)?"<null>":this.keyblocActvCode));
        sb.append(',');
        sb.append("keyblocLocnCode");
        sb.append('=');
        sb.append(((this.keyblocLocnCode == null)?"<null>":this.keyblocLocnCode));
        sb.append(',');
        sb.append("ftvacctAcctCode");
        sb.append('=');
        sb.append(((this.ftvacctAcctCode == null)?"<null>":this.ftvacctAcctCode));
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
        result = ((result* 31)+((this.keyblocLocnCode == null)? 0 :this.keyblocLocnCode.hashCode()));
        result = ((result* 31)+((this.keyblocCoasCode == null)? 0 :this.keyblocCoasCode.hashCode()));
        result = ((result* 31)+((this.keyblocAtypCode == null)? 0 :this.keyblocAtypCode.hashCode()));
        result = ((result* 31)+((this.keyblocAcctCode == null)? 0 :this.keyblocAcctCode.hashCode()));
        result = ((result* 31)+((this.keyblocProgCode == null)? 0 :this.keyblocProgCode.hashCode()));
        result = ((result* 31)+((this.keyblocAcciCode == null)? 0 :this.keyblocAcciCode.hashCode()));
        result = ((result* 31)+((this.keyblocOrgnCode == null)? 0 :this.keyblocOrgnCode.hashCode()));
        result = ((result* 31)+((this.keyblocCmtType == null)? 0 :this.keyblocCmtType.hashCode()));
        result = ((result* 31)+((this.keyblocActvCode == null)? 0 :this.keyblocActvCode.hashCode()));
        result = ((result* 31)+((this.ftvacctAcctCode == null)? 0 :this.ftvacctAcctCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.inclRev == null)? 0 :this.inclRev.hashCode()));
        result = ((result* 31)+((this.keyblocFundCode == null)? 0 :this.keyblocFundCode.hashCode()));
        result = ((result* 31)+((this.keyblocFsyrCode == null)? 0 :this.keyblocFsyrCode.hashCode()));
        result = ((result* 31)+((this.queryAcct == null)? 0 :this.queryAcct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationBudgetStatus100QapiPost) == false) {
            return false;
        }
        OrganizationBudgetStatus100QapiPost rhs = ((OrganizationBudgetStatus100QapiPost) other);
        return ((((((((((((((((this.keyblocLocnCode == rhs.keyblocLocnCode)||((this.keyblocLocnCode!= null)&&this.keyblocLocnCode.equals(rhs.keyblocLocnCode)))&&((this.keyblocCoasCode == rhs.keyblocCoasCode)||((this.keyblocCoasCode!= null)&&this.keyblocCoasCode.equals(rhs.keyblocCoasCode))))&&((this.keyblocAtypCode == rhs.keyblocAtypCode)||((this.keyblocAtypCode!= null)&&this.keyblocAtypCode.equals(rhs.keyblocAtypCode))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.keyblocProgCode == rhs.keyblocProgCode)||((this.keyblocProgCode!= null)&&this.keyblocProgCode.equals(rhs.keyblocProgCode))))&&((this.keyblocAcciCode == rhs.keyblocAcciCode)||((this.keyblocAcciCode!= null)&&this.keyblocAcciCode.equals(rhs.keyblocAcciCode))))&&((this.keyblocOrgnCode == rhs.keyblocOrgnCode)||((this.keyblocOrgnCode!= null)&&this.keyblocOrgnCode.equals(rhs.keyblocOrgnCode))))&&((this.keyblocCmtType == rhs.keyblocCmtType)||((this.keyblocCmtType!= null)&&this.keyblocCmtType.equals(rhs.keyblocCmtType))))&&((this.keyblocActvCode == rhs.keyblocActvCode)||((this.keyblocActvCode!= null)&&this.keyblocActvCode.equals(rhs.keyblocActvCode))))&&((this.ftvacctAcctCode == rhs.ftvacctAcctCode)||((this.ftvacctAcctCode!= null)&&this.ftvacctAcctCode.equals(rhs.ftvacctAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.inclRev == rhs.inclRev)||((this.inclRev!= null)&&this.inclRev.equals(rhs.inclRev))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))))&&((this.keyblocFsyrCode == rhs.keyblocFsyrCode)||((this.keyblocFsyrCode!= null)&&this.keyblocFsyrCode.equals(rhs.keyblocFsyrCode))))&&((this.queryAcct == rhs.queryAcct)||((this.queryAcct!= null)&&this.queryAcct.equals(rhs.queryAcct))));
    }

}
