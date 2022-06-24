
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
    "keyblocLocnCode",
    "keyblocCoasCode",
    "keyblocAtypCode",
    "keyblocAcctCode",
    "keyblocProgCode",
    "keyblocAcciCode",
    "keyblocOrgnCode",
    "keyblocCmtType",
    "keyblocActvCode",
    "ftvacctAcctCode",
    "inclRev",
    "keyblocFundCode",
    "keyblocFsyrCode",
    "queryAcct"
})
@Generated("jsonschema2pojo")
public class OrganizationBudgetStatus100GetRequest {

    /**
     * Location
     * <p>
     * Lineage reference object : keyblocLocnCode
     * 
     */
    @JsonProperty("keyblocLocnCode")
    @JsonPropertyDescription("Lineage reference object : keyblocLocnCode")
    private String keyblocLocnCode;
    /**
     * Chart
     * <p>
     * Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    @JsonPropertyDescription("Lineage reference object : keyblocCoasCode, Lookup lineage reference object : ftvcoas")
    private String keyblocCoasCode;
    /**
     * Account Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp")
    private String keyblocAtypCode;
    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAcctCode")
    private String keyblocAcctCode;
    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgCode
     * 
     */
    @JsonProperty("keyblocProgCode")
    @JsonPropertyDescription("Lineage reference object : keyblocProgCode")
    private String keyblocProgCode;
    /**
     * Index
     * <p>
     * Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci")
    private String keyblocAcciCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : keyblocOrgnCode
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    @JsonPropertyDescription("Lineage reference object : keyblocOrgnCode")
    private String keyblocOrgnCode;
    /**
     * Commit Type
     * <p>
     * Lineage reference object : keyblocCmtType
     * 
     */
    @JsonProperty("keyblocCmtType")
    @JsonPropertyDescription("Lineage reference object : keyblocCmtType")
    private String keyblocCmtType;
    /**
     * Activity
     * <p>
     * Lineage reference object : keyblocActvCode
     * 
     */
    @JsonProperty("keyblocActvCode")
    @JsonPropertyDescription("Lineage reference object : keyblocActvCode")
    private String keyblocActvCode;
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
     * Include Revenue Accounts
     * <p>
     * Lineage reference object : inclRev
     * 
     */
    @JsonProperty("inclRev")
    @JsonPropertyDescription("Lineage reference object : inclRev")
    private String inclRev;
    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    @JsonPropertyDescription("Lineage reference object : keyblocFundCode")
    private String keyblocFundCode;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfsyr,ftvfspd,ftvfspd,ftvfspd,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    @JsonPropertyDescription("Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfsyr,ftvfspd,ftvfspd,ftvfspd,ftvfspd")
    private String keyblocFsyrCode;
    /**
     * Query Specific Account
     * <p>
     * Lineage reference object : queryAcct
     * 
     */
    @JsonProperty("queryAcct")
    @JsonPropertyDescription("Lineage reference object : queryAcct")
    private String queryAcct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Location
     * <p>
     * Lineage reference object : keyblocLocnCode
     * 
     */
    @JsonProperty("keyblocLocnCode")
    public String getKeyblocLocnCode() {
        return keyblocLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : keyblocLocnCode
     * 
     */
    @JsonProperty("keyblocLocnCode")
    public void setKeyblocLocnCode(String keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocLocnCode(String keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
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
    public String getKeyblocCoasCode() {
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
    public void setKeyblocCoasCode(String keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocCoasCode(String keyblocCoasCode) {
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
    public String getKeyblocAtypCode() {
        return keyblocAtypCode;
    }

    /**
     * Account Type
     * <p>
     * Lineage reference object : keyblocAtypCode, Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    public void setKeyblocAtypCode(String keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocAtypCode(String keyblocAtypCode) {
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
    public String getKeyblocAcctCode() {
        return keyblocAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    public void setKeyblocAcctCode(String keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocAcctCode(String keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgCode
     * 
     */
    @JsonProperty("keyblocProgCode")
    public String getKeyblocProgCode() {
        return keyblocProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgCode
     * 
     */
    @JsonProperty("keyblocProgCode")
    public void setKeyblocProgCode(String keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocProgCode(String keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    public String getKeyblocAcciCode() {
        return keyblocAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    public void setKeyblocAcciCode(String keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocAcciCode(String keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : keyblocOrgnCode
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    public String getKeyblocOrgnCode() {
        return keyblocOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : keyblocOrgnCode
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    public void setKeyblocOrgnCode(String keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocOrgnCode(String keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
        return this;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : keyblocCmtType
     * 
     */
    @JsonProperty("keyblocCmtType")
    public String getKeyblocCmtType() {
        return keyblocCmtType;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : keyblocCmtType
     * 
     */
    @JsonProperty("keyblocCmtType")
    public void setKeyblocCmtType(String keyblocCmtType) {
        this.keyblocCmtType = keyblocCmtType;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocCmtType(String keyblocCmtType) {
        this.keyblocCmtType = keyblocCmtType;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : keyblocActvCode
     * 
     */
    @JsonProperty("keyblocActvCode")
    public String getKeyblocActvCode() {
        return keyblocActvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : keyblocActvCode
     * 
     */
    @JsonProperty("keyblocActvCode")
    public void setKeyblocActvCode(String keyblocActvCode) {
        this.keyblocActvCode = keyblocActvCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocActvCode(String keyblocActvCode) {
        this.keyblocActvCode = keyblocActvCode;
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

    public OrganizationBudgetStatus100GetRequest withFtvacctAcctCode(String ftvacctAcctCode) {
        this.ftvacctAcctCode = ftvacctAcctCode;
        return this;
    }

    /**
     * Include Revenue Accounts
     * <p>
     * Lineage reference object : inclRev
     * 
     */
    @JsonProperty("inclRev")
    public String getInclRev() {
        return inclRev;
    }

    /**
     * Include Revenue Accounts
     * <p>
     * Lineage reference object : inclRev
     * 
     */
    @JsonProperty("inclRev")
    public void setInclRev(String inclRev) {
        this.inclRev = inclRev;
    }

    public OrganizationBudgetStatus100GetRequest withInclRev(String inclRev) {
        this.inclRev = inclRev;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    public String getKeyblocFundCode() {
        return keyblocFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    public void setKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfsyr,ftvfspd,ftvfspd,ftvfspd,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    public String getKeyblocFsyrCode() {
        return keyblocFsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfsyr,ftvfspd,ftvfspd,ftvfspd,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    public void setKeyblocFsyrCode(String keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
    }

    public OrganizationBudgetStatus100GetRequest withKeyblocFsyrCode(String keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
        return this;
    }

    /**
     * Query Specific Account
     * <p>
     * Lineage reference object : queryAcct
     * 
     */
    @JsonProperty("queryAcct")
    public String getQueryAcct() {
        return queryAcct;
    }

    /**
     * Query Specific Account
     * <p>
     * Lineage reference object : queryAcct
     * 
     */
    @JsonProperty("queryAcct")
    public void setQueryAcct(String queryAcct) {
        this.queryAcct = queryAcct;
    }

    public OrganizationBudgetStatus100GetRequest withQueryAcct(String queryAcct) {
        this.queryAcct = queryAcct;
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

    public OrganizationBudgetStatus100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationBudgetStatus100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocLocnCode");
        sb.append('=');
        sb.append(((this.keyblocLocnCode == null)?"<null>":this.keyblocLocnCode));
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
        sb.append("keyblocProgCode");
        sb.append('=');
        sb.append(((this.keyblocProgCode == null)?"<null>":this.keyblocProgCode));
        sb.append(',');
        sb.append("keyblocAcciCode");
        sb.append('=');
        sb.append(((this.keyblocAcciCode == null)?"<null>":this.keyblocAcciCode));
        sb.append(',');
        sb.append("keyblocOrgnCode");
        sb.append('=');
        sb.append(((this.keyblocOrgnCode == null)?"<null>":this.keyblocOrgnCode));
        sb.append(',');
        sb.append("keyblocCmtType");
        sb.append('=');
        sb.append(((this.keyblocCmtType == null)?"<null>":this.keyblocCmtType));
        sb.append(',');
        sb.append("keyblocActvCode");
        sb.append('=');
        sb.append(((this.keyblocActvCode == null)?"<null>":this.keyblocActvCode));
        sb.append(',');
        sb.append("ftvacctAcctCode");
        sb.append('=');
        sb.append(((this.ftvacctAcctCode == null)?"<null>":this.ftvacctAcctCode));
        sb.append(',');
        sb.append("inclRev");
        sb.append('=');
        sb.append(((this.inclRev == null)?"<null>":this.inclRev));
        sb.append(',');
        sb.append("keyblocFundCode");
        sb.append('=');
        sb.append(((this.keyblocFundCode == null)?"<null>":this.keyblocFundCode));
        sb.append(',');
        sb.append("keyblocFsyrCode");
        sb.append('=');
        sb.append(((this.keyblocFsyrCode == null)?"<null>":this.keyblocFsyrCode));
        sb.append(',');
        sb.append("queryAcct");
        sb.append('=');
        sb.append(((this.queryAcct == null)?"<null>":this.queryAcct));
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
        if ((other instanceof OrganizationBudgetStatus100GetRequest) == false) {
            return false;
        }
        OrganizationBudgetStatus100GetRequest rhs = ((OrganizationBudgetStatus100GetRequest) other);
        return ((((((((((((((((this.keyblocLocnCode == rhs.keyblocLocnCode)||((this.keyblocLocnCode!= null)&&this.keyblocLocnCode.equals(rhs.keyblocLocnCode)))&&((this.keyblocCoasCode == rhs.keyblocCoasCode)||((this.keyblocCoasCode!= null)&&this.keyblocCoasCode.equals(rhs.keyblocCoasCode))))&&((this.keyblocAtypCode == rhs.keyblocAtypCode)||((this.keyblocAtypCode!= null)&&this.keyblocAtypCode.equals(rhs.keyblocAtypCode))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.keyblocProgCode == rhs.keyblocProgCode)||((this.keyblocProgCode!= null)&&this.keyblocProgCode.equals(rhs.keyblocProgCode))))&&((this.keyblocAcciCode == rhs.keyblocAcciCode)||((this.keyblocAcciCode!= null)&&this.keyblocAcciCode.equals(rhs.keyblocAcciCode))))&&((this.keyblocOrgnCode == rhs.keyblocOrgnCode)||((this.keyblocOrgnCode!= null)&&this.keyblocOrgnCode.equals(rhs.keyblocOrgnCode))))&&((this.keyblocCmtType == rhs.keyblocCmtType)||((this.keyblocCmtType!= null)&&this.keyblocCmtType.equals(rhs.keyblocCmtType))))&&((this.keyblocActvCode == rhs.keyblocActvCode)||((this.keyblocActvCode!= null)&&this.keyblocActvCode.equals(rhs.keyblocActvCode))))&&((this.ftvacctAcctCode == rhs.ftvacctAcctCode)||((this.ftvacctAcctCode!= null)&&this.ftvacctAcctCode.equals(rhs.ftvacctAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.inclRev == rhs.inclRev)||((this.inclRev!= null)&&this.inclRev.equals(rhs.inclRev))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))))&&((this.keyblocFsyrCode == rhs.keyblocFsyrCode)||((this.keyblocFsyrCode!= null)&&this.keyblocFsyrCode.equals(rhs.keyblocFsyrCode))))&&((this.queryAcct == rhs.queryAcct)||((this.queryAcct!= null)&&this.queryAcct.equals(rhs.queryAcct))));
    }

}
