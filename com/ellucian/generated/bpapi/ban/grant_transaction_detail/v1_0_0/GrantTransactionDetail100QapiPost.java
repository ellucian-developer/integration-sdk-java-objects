
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
    "keyblckCoasCode",
    "keyblckGrntCode",
    "keyblckAcciCode",
    "keyblckFundCode",
    "keyblckOrgnCode",
    "keyblckAcctCode",
    "keyblckProgCode",
    "keyblckActvCode",
    "keyblckLocnCode",
    "keyblckCmtType",
    "keyblckGrntYr",
    "keyblckPeriod",
    "keyblckDateFrom",
    "keyblckDateTo",
    "poolCheckbox",
    "acctCode",
    "orgnCode",
    "progCode",
    "trndActivityDate",
    "ruclCode",
    "docCode",
    "transDesc",
    "cmtType",
    "fundCode",
    "actvCode",
    "locnCode",
    "transDate",
    "fieldDesc",
    "transAmt",
    "drCrInd"
})
@Generated("jsonschema2pojo")
public class GrantTransactionDetail100QapiPost {

    @JsonProperty("keyblckCoasCode")
    private String keyblckCoasCode;
    @JsonProperty("keyblckGrntCode")
    private String keyblckGrntCode;
    @JsonProperty("keyblckAcciCode")
    private String keyblckAcciCode;
    @JsonProperty("keyblckFundCode")
    private String keyblckFundCode;
    @JsonProperty("keyblckOrgnCode")
    private String keyblckOrgnCode;
    @JsonProperty("keyblckAcctCode")
    private String keyblckAcctCode;
    @JsonProperty("keyblckProgCode")
    private String keyblckProgCode;
    @JsonProperty("keyblckActvCode")
    private String keyblckActvCode;
    @JsonProperty("keyblckLocnCode")
    private String keyblckLocnCode;
    @JsonProperty("keyblckCmtType")
    private String keyblckCmtType;
    @JsonProperty("keyblckGrntYr")
    private String keyblckGrntYr;
    @JsonProperty("keyblckPeriod")
    private String keyblckPeriod;
    @JsonProperty("keyblckDateFrom")
    private String keyblckDateFrom;
    @JsonProperty("keyblckDateTo")
    private String keyblckDateTo;
    @JsonProperty("poolCheckbox")
    private String poolCheckbox;
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
     * Program
     * <p>
     * Lineage reference object : FRVGTRD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_PROG_CODE")
    private String progCode;
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
     * Type
     * <p>
     * Lineage reference object : FRVGTRD_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_RUCL_CODE")
    private String ruclCode;
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
     * Description
     * <p>
     * Lineage reference object : FRVGTRD_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_TRANS_DESC")
    private String transDesc;
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
     * Fund
     * <p>
     * Lineage reference object : FRVGTRD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_FUND_CODE")
    private String fundCode;
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
     * Location
     * <p>
     * Lineage reference object : FRVGTRD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_LOCN_CODE")
    private String locnCode;
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
     * Field
     * <p>
     * Lineage reference object : FRVGTRD_FIELD_DESC
     * 
     */
    @JsonProperty("fieldDesc")
    @JsonPropertyDescription("Lineage reference object : FRVGTRD_FIELD_DESC")
    private String fieldDesc;
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

    @JsonProperty("keyblckCoasCode")
    public String getKeyblckCoasCode() {
        return keyblckCoasCode;
    }

    @JsonProperty("keyblckCoasCode")
    public void setKeyblckCoasCode(String keyblckCoasCode) {
        this.keyblckCoasCode = keyblckCoasCode;
    }

    public GrantTransactionDetail100QapiPost withKeyblckCoasCode(String keyblckCoasCode) {
        this.keyblckCoasCode = keyblckCoasCode;
        return this;
    }

    @JsonProperty("keyblckGrntCode")
    public String getKeyblckGrntCode() {
        return keyblckGrntCode;
    }

    @JsonProperty("keyblckGrntCode")
    public void setKeyblckGrntCode(String keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
    }

    public GrantTransactionDetail100QapiPost withKeyblckGrntCode(String keyblckGrntCode) {
        this.keyblckGrntCode = keyblckGrntCode;
        return this;
    }

    @JsonProperty("keyblckAcciCode")
    public String getKeyblckAcciCode() {
        return keyblckAcciCode;
    }

    @JsonProperty("keyblckAcciCode")
    public void setKeyblckAcciCode(String keyblckAcciCode) {
        this.keyblckAcciCode = keyblckAcciCode;
    }

    public GrantTransactionDetail100QapiPost withKeyblckAcciCode(String keyblckAcciCode) {
        this.keyblckAcciCode = keyblckAcciCode;
        return this;
    }

    @JsonProperty("keyblckFundCode")
    public String getKeyblckFundCode() {
        return keyblckFundCode;
    }

    @JsonProperty("keyblckFundCode")
    public void setKeyblckFundCode(String keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
    }

    public GrantTransactionDetail100QapiPost withKeyblckFundCode(String keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
        return this;
    }

    @JsonProperty("keyblckOrgnCode")
    public String getKeyblckOrgnCode() {
        return keyblckOrgnCode;
    }

    @JsonProperty("keyblckOrgnCode")
    public void setKeyblckOrgnCode(String keyblckOrgnCode) {
        this.keyblckOrgnCode = keyblckOrgnCode;
    }

    public GrantTransactionDetail100QapiPost withKeyblckOrgnCode(String keyblckOrgnCode) {
        this.keyblckOrgnCode = keyblckOrgnCode;
        return this;
    }

    @JsonProperty("keyblckAcctCode")
    public String getKeyblckAcctCode() {
        return keyblckAcctCode;
    }

    @JsonProperty("keyblckAcctCode")
    public void setKeyblckAcctCode(String keyblckAcctCode) {
        this.keyblckAcctCode = keyblckAcctCode;
    }

    public GrantTransactionDetail100QapiPost withKeyblckAcctCode(String keyblckAcctCode) {
        this.keyblckAcctCode = keyblckAcctCode;
        return this;
    }

    @JsonProperty("keyblckProgCode")
    public String getKeyblckProgCode() {
        return keyblckProgCode;
    }

    @JsonProperty("keyblckProgCode")
    public void setKeyblckProgCode(String keyblckProgCode) {
        this.keyblckProgCode = keyblckProgCode;
    }

    public GrantTransactionDetail100QapiPost withKeyblckProgCode(String keyblckProgCode) {
        this.keyblckProgCode = keyblckProgCode;
        return this;
    }

    @JsonProperty("keyblckActvCode")
    public String getKeyblckActvCode() {
        return keyblckActvCode;
    }

    @JsonProperty("keyblckActvCode")
    public void setKeyblckActvCode(String keyblckActvCode) {
        this.keyblckActvCode = keyblckActvCode;
    }

    public GrantTransactionDetail100QapiPost withKeyblckActvCode(String keyblckActvCode) {
        this.keyblckActvCode = keyblckActvCode;
        return this;
    }

    @JsonProperty("keyblckLocnCode")
    public String getKeyblckLocnCode() {
        return keyblckLocnCode;
    }

    @JsonProperty("keyblckLocnCode")
    public void setKeyblckLocnCode(String keyblckLocnCode) {
        this.keyblckLocnCode = keyblckLocnCode;
    }

    public GrantTransactionDetail100QapiPost withKeyblckLocnCode(String keyblckLocnCode) {
        this.keyblckLocnCode = keyblckLocnCode;
        return this;
    }

    @JsonProperty("keyblckCmtType")
    public String getKeyblckCmtType() {
        return keyblckCmtType;
    }

    @JsonProperty("keyblckCmtType")
    public void setKeyblckCmtType(String keyblckCmtType) {
        this.keyblckCmtType = keyblckCmtType;
    }

    public GrantTransactionDetail100QapiPost withKeyblckCmtType(String keyblckCmtType) {
        this.keyblckCmtType = keyblckCmtType;
        return this;
    }

    @JsonProperty("keyblckGrntYr")
    public String getKeyblckGrntYr() {
        return keyblckGrntYr;
    }

    @JsonProperty("keyblckGrntYr")
    public void setKeyblckGrntYr(String keyblckGrntYr) {
        this.keyblckGrntYr = keyblckGrntYr;
    }

    public GrantTransactionDetail100QapiPost withKeyblckGrntYr(String keyblckGrntYr) {
        this.keyblckGrntYr = keyblckGrntYr;
        return this;
    }

    @JsonProperty("keyblckPeriod")
    public String getKeyblckPeriod() {
        return keyblckPeriod;
    }

    @JsonProperty("keyblckPeriod")
    public void setKeyblckPeriod(String keyblckPeriod) {
        this.keyblckPeriod = keyblckPeriod;
    }

    public GrantTransactionDetail100QapiPost withKeyblckPeriod(String keyblckPeriod) {
        this.keyblckPeriod = keyblckPeriod;
        return this;
    }

    @JsonProperty("keyblckDateFrom")
    public String getKeyblckDateFrom() {
        return keyblckDateFrom;
    }

    @JsonProperty("keyblckDateFrom")
    public void setKeyblckDateFrom(String keyblckDateFrom) {
        this.keyblckDateFrom = keyblckDateFrom;
    }

    public GrantTransactionDetail100QapiPost withKeyblckDateFrom(String keyblckDateFrom) {
        this.keyblckDateFrom = keyblckDateFrom;
        return this;
    }

    @JsonProperty("keyblckDateTo")
    public String getKeyblckDateTo() {
        return keyblckDateTo;
    }

    @JsonProperty("keyblckDateTo")
    public void setKeyblckDateTo(String keyblckDateTo) {
        this.keyblckDateTo = keyblckDateTo;
    }

    public GrantTransactionDetail100QapiPost withKeyblckDateTo(String keyblckDateTo) {
        this.keyblckDateTo = keyblckDateTo;
        return this;
    }

    @JsonProperty("poolCheckbox")
    public String getPoolCheckbox() {
        return poolCheckbox;
    }

    @JsonProperty("poolCheckbox")
    public void setPoolCheckbox(String poolCheckbox) {
        this.poolCheckbox = poolCheckbox;
    }

    public GrantTransactionDetail100QapiPost withPoolCheckbox(String poolCheckbox) {
        this.poolCheckbox = poolCheckbox;
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

    public GrantTransactionDetail100QapiPost withAcctCode(String acctCode) {
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

    public GrantTransactionDetail100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
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

    public GrantTransactionDetail100QapiPost withProgCode(String progCode) {
        this.progCode = progCode;
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

    public GrantTransactionDetail100QapiPost withTrndActivityDate(Date trndActivityDate) {
        this.trndActivityDate = trndActivityDate;
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

    public GrantTransactionDetail100QapiPost withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

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

    public GrantTransactionDetail100QapiPost withDocCode(String docCode) {
        this.docCode = docCode;
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

    public GrantTransactionDetail100QapiPost withTransDesc(String transDesc) {
        this.transDesc = transDesc;
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

    public GrantTransactionDetail100QapiPost withCmtType(String cmtType) {
        this.cmtType = cmtType;
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

    public GrantTransactionDetail100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
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

    public GrantTransactionDetail100QapiPost withActvCode(String actvCode) {
        this.actvCode = actvCode;
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

    public GrantTransactionDetail100QapiPost withLocnCode(String locnCode) {
        this.locnCode = locnCode;
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

    public GrantTransactionDetail100QapiPost withTransDate(Date transDate) {
        this.transDate = transDate;
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

    public GrantTransactionDetail100QapiPost withFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
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

    public GrantTransactionDetail100QapiPost withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
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

    public GrantTransactionDetail100QapiPost withDrCrInd(String drCrInd) {
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

    public GrantTransactionDetail100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantTransactionDetail100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckCoasCode");
        sb.append('=');
        sb.append(((this.keyblckCoasCode == null)?"<null>":this.keyblckCoasCode));
        sb.append(',');
        sb.append("keyblckGrntCode");
        sb.append('=');
        sb.append(((this.keyblckGrntCode == null)?"<null>":this.keyblckGrntCode));
        sb.append(',');
        sb.append("keyblckAcciCode");
        sb.append('=');
        sb.append(((this.keyblckAcciCode == null)?"<null>":this.keyblckAcciCode));
        sb.append(',');
        sb.append("keyblckFundCode");
        sb.append('=');
        sb.append(((this.keyblckFundCode == null)?"<null>":this.keyblckFundCode));
        sb.append(',');
        sb.append("keyblckOrgnCode");
        sb.append('=');
        sb.append(((this.keyblckOrgnCode == null)?"<null>":this.keyblckOrgnCode));
        sb.append(',');
        sb.append("keyblckAcctCode");
        sb.append('=');
        sb.append(((this.keyblckAcctCode == null)?"<null>":this.keyblckAcctCode));
        sb.append(',');
        sb.append("keyblckProgCode");
        sb.append('=');
        sb.append(((this.keyblckProgCode == null)?"<null>":this.keyblckProgCode));
        sb.append(',');
        sb.append("keyblckActvCode");
        sb.append('=');
        sb.append(((this.keyblckActvCode == null)?"<null>":this.keyblckActvCode));
        sb.append(',');
        sb.append("keyblckLocnCode");
        sb.append('=');
        sb.append(((this.keyblckLocnCode == null)?"<null>":this.keyblckLocnCode));
        sb.append(',');
        sb.append("keyblckCmtType");
        sb.append('=');
        sb.append(((this.keyblckCmtType == null)?"<null>":this.keyblckCmtType));
        sb.append(',');
        sb.append("keyblckGrntYr");
        sb.append('=');
        sb.append(((this.keyblckGrntYr == null)?"<null>":this.keyblckGrntYr));
        sb.append(',');
        sb.append("keyblckPeriod");
        sb.append('=');
        sb.append(((this.keyblckPeriod == null)?"<null>":this.keyblckPeriod));
        sb.append(',');
        sb.append("keyblckDateFrom");
        sb.append('=');
        sb.append(((this.keyblckDateFrom == null)?"<null>":this.keyblckDateFrom));
        sb.append(',');
        sb.append("keyblckDateTo");
        sb.append('=');
        sb.append(((this.keyblckDateTo == null)?"<null>":this.keyblckDateTo));
        sb.append(',');
        sb.append("poolCheckbox");
        sb.append('=');
        sb.append(((this.poolCheckbox == null)?"<null>":this.poolCheckbox));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("trndActivityDate");
        sb.append('=');
        sb.append(((this.trndActivityDate == null)?"<null>":this.trndActivityDate));
        sb.append(',');
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("cmtType");
        sb.append('=');
        sb.append(((this.cmtType == null)?"<null>":this.cmtType));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("fieldDesc");
        sb.append('=');
        sb.append(((this.fieldDesc == null)?"<null>":this.fieldDesc));
        sb.append(',');
        sb.append("transAmt");
        sb.append('=');
        sb.append(((this.transAmt == null)?"<null>":this.transAmt));
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
        result = ((result* 31)+((this.keyblckFundCode == null)? 0 :this.keyblckFundCode.hashCode()));
        result = ((result* 31)+((this.keyblckLocnCode == null)? 0 :this.keyblckLocnCode.hashCode()));
        result = ((result* 31)+((this.keyblckCoasCode == null)? 0 :this.keyblckCoasCode.hashCode()));
        result = ((result* 31)+((this.keyblckGrntYr == null)? 0 :this.keyblckGrntYr.hashCode()));
        result = ((result* 31)+((this.fieldDesc == null)? 0 :this.fieldDesc.hashCode()));
        result = ((result* 31)+((this.keyblckActvCode == null)? 0 :this.keyblckActvCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.trndActivityDate == null)? 0 :this.trndActivityDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.keyblckCmtType == null)? 0 :this.keyblckCmtType.hashCode()));
        result = ((result* 31)+((this.keyblckAcctCode == null)? 0 :this.keyblckAcctCode.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.keyblckOrgnCode == null)? 0 :this.keyblckOrgnCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.keyblckProgCode == null)? 0 :this.keyblckProgCode.hashCode()));
        result = ((result* 31)+((this.keyblckAcciCode == null)? 0 :this.keyblckAcciCode.hashCode()));
        result = ((result* 31)+((this.docCode == null)? 0 :this.docCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.keyblckDateTo == null)? 0 :this.keyblckDateTo.hashCode()));
        result = ((result* 31)+((this.poolCheckbox == null)? 0 :this.poolCheckbox.hashCode()));
        result = ((result* 31)+((this.keyblckPeriod == null)? 0 :this.keyblckPeriod.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.cmtType == null)? 0 :this.cmtType.hashCode()));
        result = ((result* 31)+((this.keyblckDateFrom == null)? 0 :this.keyblckDateFrom.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckGrntCode == null)? 0 :this.keyblckGrntCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantTransactionDetail100QapiPost) == false) {
            return false;
        }
        GrantTransactionDetail100QapiPost rhs = ((GrantTransactionDetail100QapiPost) other);
        return ((((((((((((((((((((((((((((((((this.keyblckFundCode == rhs.keyblckFundCode)||((this.keyblckFundCode!= null)&&this.keyblckFundCode.equals(rhs.keyblckFundCode)))&&((this.keyblckLocnCode == rhs.keyblckLocnCode)||((this.keyblckLocnCode!= null)&&this.keyblckLocnCode.equals(rhs.keyblckLocnCode))))&&((this.keyblckCoasCode == rhs.keyblckCoasCode)||((this.keyblckCoasCode!= null)&&this.keyblckCoasCode.equals(rhs.keyblckCoasCode))))&&((this.keyblckGrntYr == rhs.keyblckGrntYr)||((this.keyblckGrntYr!= null)&&this.keyblckGrntYr.equals(rhs.keyblckGrntYr))))&&((this.fieldDesc == rhs.fieldDesc)||((this.fieldDesc!= null)&&this.fieldDesc.equals(rhs.fieldDesc))))&&((this.keyblckActvCode == rhs.keyblckActvCode)||((this.keyblckActvCode!= null)&&this.keyblckActvCode.equals(rhs.keyblckActvCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.trndActivityDate == rhs.trndActivityDate)||((this.trndActivityDate!= null)&&this.trndActivityDate.equals(rhs.trndActivityDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.keyblckCmtType == rhs.keyblckCmtType)||((this.keyblckCmtType!= null)&&this.keyblckCmtType.equals(rhs.keyblckCmtType))))&&((this.keyblckAcctCode == rhs.keyblckAcctCode)||((this.keyblckAcctCode!= null)&&this.keyblckAcctCode.equals(rhs.keyblckAcctCode))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.keyblckOrgnCode == rhs.keyblckOrgnCode)||((this.keyblckOrgnCode!= null)&&this.keyblckOrgnCode.equals(rhs.keyblckOrgnCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.keyblckProgCode == rhs.keyblckProgCode)||((this.keyblckProgCode!= null)&&this.keyblckProgCode.equals(rhs.keyblckProgCode))))&&((this.keyblckAcciCode == rhs.keyblckAcciCode)||((this.keyblckAcciCode!= null)&&this.keyblckAcciCode.equals(rhs.keyblckAcciCode))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.keyblckDateTo == rhs.keyblckDateTo)||((this.keyblckDateTo!= null)&&this.keyblckDateTo.equals(rhs.keyblckDateTo))))&&((this.poolCheckbox == rhs.poolCheckbox)||((this.poolCheckbox!= null)&&this.poolCheckbox.equals(rhs.poolCheckbox))))&&((this.keyblckPeriod == rhs.keyblckPeriod)||((this.keyblckPeriod!= null)&&this.keyblckPeriod.equals(rhs.keyblckPeriod))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.cmtType == rhs.cmtType)||((this.cmtType!= null)&&this.cmtType.equals(rhs.cmtType))))&&((this.keyblckDateFrom == rhs.keyblckDateFrom)||((this.keyblckDateFrom!= null)&&this.keyblckDateFrom.equals(rhs.keyblckDateFrom))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckGrntCode == rhs.keyblckGrntCode)||((this.keyblckGrntCode!= null)&&this.keyblckGrntCode.equals(rhs.keyblckGrntCode))));
    }

}
