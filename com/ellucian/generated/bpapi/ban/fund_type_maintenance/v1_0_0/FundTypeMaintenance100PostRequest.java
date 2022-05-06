
package com.ellucian.generated.bpapi.ban.fund_type_maintenance.v1_0_0;

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
    "coas",
    "effDate",
    "fund",
    "internalFtyp",
    "fundCodeCap",
    "acctCodeCap",
    "override",
    "title",
    "termDate",
    "ftypCode"
})
@Generated("jsonschema2pojo")
public class FundTypeMaintenance100PostRequest {

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coas;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_EFF_DATE")
    private Date effDate;
    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("fund")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp")
    private String fund;
    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalFtyp")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE")
    private String internalFtyp;
    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("fundCodeCap")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FUND_CODE_CAP")
    private String fundCodeCap;
    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("acctCodeCap")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_ACCT_CODE_CAP")
    private String acctCodeCap;
    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("override")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND")
    private String override;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TITLE")
    private String title;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_TERM_DATE")
    private Date termDate;
    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    @JsonPropertyDescription("Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp")
    private String ftypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public String getCoas() {
        return coas;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVFTYP_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coas")
    public void setCoas(String coas) {
        this.coas = coas;
    }

    public FundTypeMaintenance100PostRequest withCoas(String coas) {
        this.coas = coas;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVFTYP_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public FundTypeMaintenance100PostRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("fund")
    public String getFund() {
        return fund;
    }

    /**
     * Predecessor Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE_PRED, Lookup lineage reference object : ftvftyp
     * 
     */
    @JsonProperty("fund")
    public void setFund(String fund) {
        this.fund = fund;
    }

    public FundTypeMaintenance100PostRequest withFund(String fund) {
        this.fund = fund;
        return this;
    }

    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalFtyp")
    public String getInternalFtyp() {
        return internalFtyp;
    }

    /**
     * Internal Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_INTERNAL_FTYP_CODE
     * (Required)
     * 
     */
    @JsonProperty("internalFtyp")
    public void setInternalFtyp(String internalFtyp) {
        this.internalFtyp = internalFtyp;
    }

    public FundTypeMaintenance100PostRequest withInternalFtyp(String internalFtyp) {
        this.internalFtyp = internalFtyp;
        return this;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("fundCodeCap")
    public String getFundCodeCap() {
        return fundCodeCap;
    }

    /**
     * Capitalization Fund
     * <p>
     * Lineage reference object : FTVFTYP_FUND_CODE_CAP
     * 
     */
    @JsonProperty("fundCodeCap")
    public void setFundCodeCap(String fundCodeCap) {
        this.fundCodeCap = fundCodeCap;
    }

    public FundTypeMaintenance100PostRequest withFundCodeCap(String fundCodeCap) {
        this.fundCodeCap = fundCodeCap;
        return this;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("acctCodeCap")
    public String getAcctCodeCap() {
        return acctCodeCap;
    }

    /**
     * Capitalization Equity Account
     * <p>
     * Lineage reference object : FTVFTYP_ACCT_CODE_CAP
     * 
     */
    @JsonProperty("acctCodeCap")
    public void setAcctCodeCap(String acctCodeCap) {
        this.acctCodeCap = acctCodeCap;
    }

    public FundTypeMaintenance100PostRequest withAcctCodeCap(String acctCodeCap) {
        this.acctCodeCap = acctCodeCap;
        return this;
    }

    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("override")
    public String getOverride() {
        return override;
    }

    /**
     * Default Override
     * <p>
     * Lineage reference object : FTVFTYP_DEF_OVERRIDE_IND
     * (Required)
     * 
     */
    @JsonProperty("override")
    public void setOverride(String override) {
        this.override = override;
    }

    public FundTypeMaintenance100PostRequest withOverride(String override) {
        this.override = override;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVFTYP_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public FundTypeMaintenance100PostRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVFTYP_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public FundTypeMaintenance100PostRequest withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public String getFtypCode() {
        return ftypCode;
    }

    /**
     * Fund Type
     * <p>
     * Lineage reference object : FTVFTYP_FTYP_CODE, Lookup lineage reference object : ftvftyp
     * (Required)
     * 
     */
    @JsonProperty("ftypCode")
    public void setFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
    }

    public FundTypeMaintenance100PostRequest withFtypCode(String ftypCode) {
        this.ftypCode = ftypCode;
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

    public FundTypeMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundTypeMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coas");
        sb.append('=');
        sb.append(((this.coas == null)?"<null>":this.coas));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("fund");
        sb.append('=');
        sb.append(((this.fund == null)?"<null>":this.fund));
        sb.append(',');
        sb.append("internalFtyp");
        sb.append('=');
        sb.append(((this.internalFtyp == null)?"<null>":this.internalFtyp));
        sb.append(',');
        sb.append("fundCodeCap");
        sb.append('=');
        sb.append(((this.fundCodeCap == null)?"<null>":this.fundCodeCap));
        sb.append(',');
        sb.append("acctCodeCap");
        sb.append('=');
        sb.append(((this.acctCodeCap == null)?"<null>":this.acctCodeCap));
        sb.append(',');
        sb.append("override");
        sb.append('=');
        sb.append(((this.override == null)?"<null>":this.override));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("ftypCode");
        sb.append('=');
        sb.append(((this.ftypCode == null)?"<null>":this.ftypCode));
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
        result = ((result* 31)+((this.coas == null)? 0 :this.coas.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.fund == null)? 0 :this.fund.hashCode()));
        result = ((result* 31)+((this.internalFtyp == null)? 0 :this.internalFtyp.hashCode()));
        result = ((result* 31)+((this.fundCodeCap == null)? 0 :this.fundCodeCap.hashCode()));
        result = ((result* 31)+((this.acctCodeCap == null)? 0 :this.acctCodeCap.hashCode()));
        result = ((result* 31)+((this.override == null)? 0 :this.override.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.ftypCode == null)? 0 :this.ftypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundTypeMaintenance100PostRequest) == false) {
            return false;
        }
        FundTypeMaintenance100PostRequest rhs = ((FundTypeMaintenance100PostRequest) other);
        return ((((((((((((this.coas == rhs.coas)||((this.coas!= null)&&this.coas.equals(rhs.coas)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.fund == rhs.fund)||((this.fund!= null)&&this.fund.equals(rhs.fund))))&&((this.internalFtyp == rhs.internalFtyp)||((this.internalFtyp!= null)&&this.internalFtyp.equals(rhs.internalFtyp))))&&((this.fundCodeCap == rhs.fundCodeCap)||((this.fundCodeCap!= null)&&this.fundCodeCap.equals(rhs.fundCodeCap))))&&((this.acctCodeCap == rhs.acctCodeCap)||((this.acctCodeCap!= null)&&this.acctCodeCap.equals(rhs.acctCodeCap))))&&((this.override == rhs.override)||((this.override!= null)&&this.override.equals(rhs.override))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.ftypCode == rhs.ftypCode)||((this.ftypCode!= null)&&this.ftypCode.equals(rhs.ftypCode))));
    }

}
