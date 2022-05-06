
package com.ellucian.generated.bpapi.ban.grant_transaction_detail.v1_0_0;

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
    "docCode",
    "fieldDesc",
    "locnCode",
    "acctCode",
    "orgnCode",
    "trndActivityDate",
    "fundCode",
    "cmtType",
    "transDesc",
    "progCode",
    "transAmt",
    "transDate",
    "ruclCode",
    "actvCode",
    "drCrInd"
})
@Generated("jsonschema2pojo")
public class GrantTransactionDetail100GetResponse {

    /**
     * Document
     * <p>
     * Lineage reference object : FRVGTRD_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_DOC_CODE")
    private String docCode;
    /**
     * Field
     * <p>
     * Lineage reference object : FRVGTRD_FIELD_DESC
     * 
     */
    @JsonProperty("fieldDesc")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_FIELD_DESC")
    private String fieldDesc;
    /**
     * Location
     * <p>
     * Lineage reference object : FRVGTRD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_LOCN_CODE")
    private String locnCode;
    /**
     * Account
     * <p>
     * Lineage reference object : FRVGTRD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_ACCT_CODE")
    private String acctCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : FRVGTRD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_ORGN_CODE")
    private String orgnCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FRVGTRD_TRND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("trndActivityDate")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_TRND_ACTIVITY_DATE")
    private Date trndActivityDate;
    /**
     * Fund
     * <p>
     * Lineage reference object : FRVGTRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_FUND_CODE")
    private String fundCode;
    /**
     * Commit
     * <p>
     * Lineage reference object : FRVGTRD_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_CMT_TYPE")
    private String cmtType;
    /**
     * Description
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_TRANS_DESC")
    private String transDesc;
    /**
     * Program
     * <p>
     * Lineage reference object : FRVGTRD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_PROG_CODE")
    private String progCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_TRANS_AMT")
    private Double transAmt;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_TRANS_DATE")
    private Date transDate;
    /**
     * Type
     * <p>
     * Lineage reference object : FRVGTRD_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_RUCL_CODE")
    private String ruclCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : FRVGTRD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_ACTV_CODE")
    private String actvCode;
    /**
     * Increase(+) or Decrease(-)
     * <p>
     * Lineage reference object : FRVGTRD_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_DR_CR_IND")
    private String drCrInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Document
     * <p>
     * Lineage reference object : FRVGTRD_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public String getDocCode() {
        return docCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FRVGTRD_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public GrantTransactionDetail100GetResponse withDocCode(String docCode) {
        this.docCode = docCode;
        return this;
    }

    /**
     * Field
     * <p>
     * Lineage reference object : FRVGTRD_FIELD_DESC
     * 
     */
    @JsonProperty("fieldDesc")
    public String getFieldDesc() {
        return fieldDesc;
    }

    /**
     * Field
     * <p>
     * Lineage reference object : FRVGTRD_FIELD_DESC
     * 
     */
    @JsonProperty("fieldDesc")
    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    public GrantTransactionDetail100GetResponse withFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FRVGTRD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : FRVGTRD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public GrantTransactionDetail100GetResponse withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FRVGTRD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FRVGTRD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public GrantTransactionDetail100GetResponse withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FRVGTRD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FRVGTRD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public GrantTransactionDetail100GetResponse withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FRVGTRD_TRND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("trndActivityDate")
    public Date getTrndActivityDate() {
        return trndActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FRVGTRD_TRND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("trndActivityDate")
    public void setTrndActivityDate(Date trndActivityDate) {
        this.trndActivityDate = trndActivityDate;
    }

    public GrantTransactionDetail100GetResponse withTrndActivityDate(Date trndActivityDate) {
        this.trndActivityDate = trndActivityDate;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FRVGTRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FRVGTRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public GrantTransactionDetail100GetResponse withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Commit
     * <p>
     * Lineage reference object : FRVGTRD_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    public String getCmtType() {
        return cmtType;
    }

    /**
     * Commit
     * <p>
     * Lineage reference object : FRVGTRD_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    public void setCmtType(String cmtType) {
        this.cmtType = cmtType;
    }

    public GrantTransactionDetail100GetResponse withCmtType(String cmtType) {
        this.cmtType = cmtType;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    public String getTransDesc() {
        return transDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc;
    }

    public GrantTransactionDetail100GetResponse withTransDesc(String transDesc) {
        this.transDesc = transDesc;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FRVGTRD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FRVGTRD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public GrantTransactionDetail100GetResponse withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    public Double getTransAmt() {
        return transAmt;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    public void setTransAmt(Double transAmt) {
        this.transAmt = transAmt;
    }

    public GrantTransactionDetail100GetResponse withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public GrantTransactionDetail100GetResponse withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FRVGTRD_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    public String getRuclCode() {
        return ruclCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FRVGTRD_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public GrantTransactionDetail100GetResponse withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FRVGTRD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : FRVGTRD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public GrantTransactionDetail100GetResponse withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Increase(+) or Decrease(-)
     * <p>
     * Lineage reference object : FRVGTRD_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public String getDrCrInd() {
        return drCrInd;
    }

    /**
     * Increase(+) or Decrease(-)
     * <p>
     * Lineage reference object : FRVGTRD_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public void setDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
    }

    public GrantTransactionDetail100GetResponse withDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
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

    public GrantTransactionDetail100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantTransactionDetail100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
        sb.append(',');
        sb.append("fieldDesc");
        sb.append('=');
        sb.append(((this.fieldDesc == null)?"<null>":this.fieldDesc));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("trndActivityDate");
        sb.append('=');
        sb.append(((this.trndActivityDate == null)?"<null>":this.trndActivityDate));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("cmtType");
        sb.append('=');
        sb.append(((this.cmtType == null)?"<null>":this.cmtType));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("transAmt");
        sb.append('=');
        sb.append(((this.transAmt == null)?"<null>":this.transAmt));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("drCrInd");
        sb.append('=');
        sb.append(((this.drCrInd == null)?"<null>":this.drCrInd));
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
        result = ((result* 31)+((this.docCode == null)? 0 :this.docCode.hashCode()));
        result = ((result* 31)+((this.fieldDesc == null)? 0 :this.fieldDesc.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.trndActivityDate == null)? 0 :this.trndActivityDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.cmtType == null)? 0 :this.cmtType.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantTransactionDetail100GetResponse) == false) {
            return false;
        }
        GrantTransactionDetail100GetResponse rhs = ((GrantTransactionDetail100GetResponse) other);
        return (((((((((((((((((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode)))&&((this.fieldDesc == rhs.fieldDesc)||((this.fieldDesc!= null)&&this.fieldDesc.equals(rhs.fieldDesc))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.trndActivityDate == rhs.trndActivityDate)||((this.trndActivityDate!= null)&&this.trndActivityDate.equals(rhs.trndActivityDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.cmtType == rhs.cmtType)||((this.cmtType!= null)&&this.cmtType.equals(rhs.cmtType))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))));
    }

}
