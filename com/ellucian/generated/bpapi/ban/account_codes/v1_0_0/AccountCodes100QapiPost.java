
package com.ellucian.generated.bpapi.ban.account_codes.v1_0_0;

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
    "acctClassCode",
    "acctCode",
    "atypCode",
    "coasCode",
    "dataEntryInd",
    "effDate",
    "statusInd",
    "termDate",
    "title",
    "internalAtyp"
})
@Generated("jsonschema2pojo")
public class AccountCodes100QapiPost {

    /**
     * Account Class
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CLASS_CODE
     * 
     */
    @JsonProperty("acctClassCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CLASS_CODE")
    private String acctClassCode;
    /**
     * Account Code
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ACCT_CODE")
    private String acctCode;
    /**
     * Type
     * <p>
     * Lineage reference object : FTVACCT_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_ATYP_CODE")
    private String atypCode;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVACCT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_COAS_CODE")
    private String coasCode;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVACCT_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_DATA_ENTRY_IND")
    private String dataEntryInd;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCT_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_EFF_DATE")
    private Date effDate;
    /**
     * Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_STATUS_IND")
    private String statusInd;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_TERM_DATE")
    private Date termDate;
    /**
     * Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVACCT_TITLE")
    private String title;
    /**
     * Internal Type
     * <p>
     * 
     * 
     */
    @JsonProperty("internalAtyp")
    private String internalAtyp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Account Class
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CLASS_CODE
     * 
     */
    @JsonProperty("acctClassCode")
    public String getAcctClassCode() {
        return acctClassCode;
    }

    /**
     * Account Class
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CLASS_CODE
     * 
     */
    @JsonProperty("acctClassCode")
    public void setAcctClassCode(String acctClassCode) {
        this.acctClassCode = acctClassCode;
    }

    public AccountCodes100QapiPost withAcctClassCode(String acctClassCode) {
        this.acctClassCode = acctClassCode;
        return this;
    }

    /**
     * Account Code
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account Code
     * <p>
     * Lineage reference object : FTVACCT_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public AccountCodes100QapiPost withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FTVACCT_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FTVACCT_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public AccountCodes100QapiPost withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVACCT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVACCT_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public AccountCodes100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVACCT_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public String getDataEntryInd() {
        return dataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVACCT_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public void setDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
    }

    public AccountCodes100QapiPost withDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCT_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVACCT_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public AccountCodes100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FTVACCT_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public AccountCodes100QapiPost withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVACCT_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public AccountCodes100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : FTVACCT_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AccountCodes100QapiPost withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Internal Type
     * <p>
     * 
     * 
     */
    @JsonProperty("internalAtyp")
    public String getInternalAtyp() {
        return internalAtyp;
    }

    /**
     * Internal Type
     * <p>
     * 
     * 
     */
    @JsonProperty("internalAtyp")
    public void setInternalAtyp(String internalAtyp) {
        this.internalAtyp = internalAtyp;
    }

    public AccountCodes100QapiPost withInternalAtyp(String internalAtyp) {
        this.internalAtyp = internalAtyp;
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

    public AccountCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acctClassCode");
        sb.append('=');
        sb.append(((this.acctClassCode == null)?"<null>":this.acctClassCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("internalAtyp");
        sb.append('=');
        sb.append(((this.internalAtyp == null)?"<null>":this.internalAtyp));
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
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.internalAtyp == null)? 0 :this.internalAtyp.hashCode()));
        result = ((result* 31)+((this.acctClassCode == null)? 0 :this.acctClassCode.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountCodes100QapiPost) == false) {
            return false;
        }
        AccountCodes100QapiPost rhs = ((AccountCodes100QapiPost) other);
        return ((((((((((((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate)))&&((this.internalAtyp == rhs.internalAtyp)||((this.internalAtyp!= null)&&this.internalAtyp.equals(rhs.internalAtyp))))&&((this.acctClassCode == rhs.acctClassCode)||((this.acctClassCode!= null)&&this.acctClassCode.equals(rhs.acctClassCode))))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))));
    }

}
