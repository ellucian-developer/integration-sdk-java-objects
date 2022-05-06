
package com.ellucian.generated.bpapi.ban.executive_summary.v1_0_0;

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
public class ExecutiveSummary100GetRequest {

    /**
     * Location
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocLocnCode")
    private String keyblocLocnCode;
    /**
     * Chart
     * <p>
     * Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvcoas")
    private String keyblocCoasCode;
    /**
     * Account Type
     * <p>
     * Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvatyp")
    private String keyblocAtypCode;
    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocAcctCode")
    private String keyblocAcctCode;
    /**
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocProgCode")
    private String keyblocProgCode;
    /**
     * Index
     * <p>
     * Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvacci")
    private String keyblocAcciCode;
    /**
     * Organization
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    private String keyblocOrgnCode;
    /**
     * Commit Type
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocCmtType")
    private String keyblocCmtType;
    /**
     * Activity
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocActvCode")
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
     * 
     * 
     */
    @JsonProperty("inclRev")
    private String inclRev;
    /**
     * Fund
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocFundCode")
    private String keyblocFundCode;
    /**
     * Fiscal Year
     * <p>
     * Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private String keyblocFsyrCode;
    /**
     * Query Specific Account
     * <p>
     * 
     * 
     */
    @JsonProperty("queryAcct")
    private String queryAcct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Location
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocLocnCode")
    public String getKeyblocLocnCode() {
        return keyblocLocnCode;
    }

    /**
     * Location
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocLocnCode")
    public void setKeyblocLocnCode(String keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocLocnCode(String keyblocLocnCode) {
        this.keyblocLocnCode = keyblocLocnCode;
        return this;
    }

    /**
     * Chart
     * <p>
     * Lookup lineage reference object : ftvcoas
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
     * Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("keyblocCoasCode")
    public void setKeyblocCoasCode(String keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocCoasCode(String keyblocCoasCode) {
        this.keyblocCoasCode = keyblocCoasCode;
        return this;
    }

    /**
     * Account Type
     * <p>
     * Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    public String getKeyblocAtypCode() {
        return keyblocAtypCode;
    }

    /**
     * Account Type
     * <p>
     * Lookup lineage reference object : ftvatyp
     * 
     */
    @JsonProperty("keyblocAtypCode")
    public void setKeyblocAtypCode(String keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocAtypCode(String keyblocAtypCode) {
        this.keyblocAtypCode = keyblocAtypCode;
        return this;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocAcctCode")
    public String getKeyblocAcctCode() {
        return keyblocAcctCode;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocAcctCode")
    public void setKeyblocAcctCode(String keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocAcctCode(String keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
        return this;
    }

    /**
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocProgCode")
    public String getKeyblocProgCode() {
        return keyblocProgCode;
    }

    /**
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocProgCode")
    public void setKeyblocProgCode(String keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocProgCode(String keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    public String getKeyblocAcciCode() {
        return keyblocAcciCode;
    }

    /**
     * Index
     * <p>
     * Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    public void setKeyblocAcciCode(String keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocAcciCode(String keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    public String getKeyblocOrgnCode() {
        return keyblocOrgnCode;
    }

    /**
     * Organization
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    public void setKeyblocOrgnCode(String keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocOrgnCode(String keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
        return this;
    }

    /**
     * Commit Type
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocCmtType")
    public String getKeyblocCmtType() {
        return keyblocCmtType;
    }

    /**
     * Commit Type
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocCmtType")
    public void setKeyblocCmtType(String keyblocCmtType) {
        this.keyblocCmtType = keyblocCmtType;
    }

    public ExecutiveSummary100GetRequest withKeyblocCmtType(String keyblocCmtType) {
        this.keyblocCmtType = keyblocCmtType;
        return this;
    }

    /**
     * Activity
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocActvCode")
    public String getKeyblocActvCode() {
        return keyblocActvCode;
    }

    /**
     * Activity
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocActvCode")
    public void setKeyblocActvCode(String keyblocActvCode) {
        this.keyblocActvCode = keyblocActvCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocActvCode(String keyblocActvCode) {
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

    public ExecutiveSummary100GetRequest withFtvacctAcctCode(String ftvacctAcctCode) {
        this.ftvacctAcctCode = ftvacctAcctCode;
        return this;
    }

    /**
     * Include Revenue Accounts
     * <p>
     * 
     * 
     */
    @JsonProperty("inclRev")
    public String getInclRev() {
        return inclRev;
    }

    /**
     * Include Revenue Accounts
     * <p>
     * 
     * 
     */
    @JsonProperty("inclRev")
    public void setInclRev(String inclRev) {
        this.inclRev = inclRev;
    }

    public ExecutiveSummary100GetRequest withInclRev(String inclRev) {
        this.inclRev = inclRev;
        return this;
    }

    /**
     * Fund
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocFundCode")
    public String getKeyblocFundCode() {
        return keyblocFundCode;
    }

    /**
     * Fund
     * <p>
     * 
     * 
     */
    @JsonProperty("keyblocFundCode")
    public void setKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
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
     * Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    public void setKeyblocFsyrCode(String keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
    }

    public ExecutiveSummary100GetRequest withKeyblocFsyrCode(String keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
        return this;
    }

    /**
     * Query Specific Account
     * <p>
     * 
     * 
     */
    @JsonProperty("queryAcct")
    public String getQueryAcct() {
        return queryAcct;
    }

    /**
     * Query Specific Account
     * <p>
     * 
     * 
     */
    @JsonProperty("queryAcct")
    public void setQueryAcct(String queryAcct) {
        this.queryAcct = queryAcct;
    }

    public ExecutiveSummary100GetRequest withQueryAcct(String queryAcct) {
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

    public ExecutiveSummary100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExecutiveSummary100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof ExecutiveSummary100GetRequest) == false) {
            return false;
        }
        ExecutiveSummary100GetRequest rhs = ((ExecutiveSummary100GetRequest) other);
        return ((((((((((((((((this.keyblocLocnCode == rhs.keyblocLocnCode)||((this.keyblocLocnCode!= null)&&this.keyblocLocnCode.equals(rhs.keyblocLocnCode)))&&((this.keyblocCoasCode == rhs.keyblocCoasCode)||((this.keyblocCoasCode!= null)&&this.keyblocCoasCode.equals(rhs.keyblocCoasCode))))&&((this.keyblocAtypCode == rhs.keyblocAtypCode)||((this.keyblocAtypCode!= null)&&this.keyblocAtypCode.equals(rhs.keyblocAtypCode))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.keyblocProgCode == rhs.keyblocProgCode)||((this.keyblocProgCode!= null)&&this.keyblocProgCode.equals(rhs.keyblocProgCode))))&&((this.keyblocAcciCode == rhs.keyblocAcciCode)||((this.keyblocAcciCode!= null)&&this.keyblocAcciCode.equals(rhs.keyblocAcciCode))))&&((this.keyblocOrgnCode == rhs.keyblocOrgnCode)||((this.keyblocOrgnCode!= null)&&this.keyblocOrgnCode.equals(rhs.keyblocOrgnCode))))&&((this.keyblocCmtType == rhs.keyblocCmtType)||((this.keyblocCmtType!= null)&&this.keyblocCmtType.equals(rhs.keyblocCmtType))))&&((this.keyblocActvCode == rhs.keyblocActvCode)||((this.keyblocActvCode!= null)&&this.keyblocActvCode.equals(rhs.keyblocActvCode))))&&((this.ftvacctAcctCode == rhs.ftvacctAcctCode)||((this.ftvacctAcctCode!= null)&&this.ftvacctAcctCode.equals(rhs.ftvacctAcctCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.inclRev == rhs.inclRev)||((this.inclRev!= null)&&this.inclRev.equals(rhs.inclRev))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))))&&((this.keyblocFsyrCode == rhs.keyblocFsyrCode)||((this.keyblocFsyrCode!= null)&&this.keyblocFsyrCode.equals(rhs.keyblocFsyrCode))))&&((this.queryAcct == rhs.queryAcct)||((this.queryAcct!= null)&&this.queryAcct.equals(rhs.queryAcct))));
    }

}
