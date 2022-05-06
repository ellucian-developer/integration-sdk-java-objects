
package com.ellucian.generated.bpapi.ban.detail_transaction_activity.v1_0_0;

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
    "keyblckFundCode",
    "keyblckLocnCode",
    "keyblckCoasCode",
    "keyblckProgCode",
    "keyblckFsyrCode",
    "keyblckAcciCode",
    "fieldDesc",
    "docCode",
    "keyblckActvCode",
    "displayProgCode",
    "orgnCode",
    "displayAcctCode",
    "activityDate",
    "keyblckPeriod",
    "fundCode",
    "keyblckCmtType",
    "transDesc",
    "keyblckAcctCode",
    "transAmt",
    "transDate",
    "ruclCode",
    "keyblckOrgnCode",
    "drCrInd"
})
@Generated("jsonschema2pojo")
public class DetailTransactionActivity100GetRequest {

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblckFundCode
     * 
     */
    @JsonProperty("keyblckFundCode")
    @JsonPropertyDescription("Lineage reference object : keyblckFundCode")
    private Object keyblckFundCode;
    /**
     * Location
     * <p>
     * Lineage reference object : keyblckLocnCode
     * 
     */
    @JsonProperty("keyblckLocnCode")
    @JsonPropertyDescription("Lineage reference object : keyblckLocnCode")
    private Object keyblckLocnCode;
    /**
     * COA
     * <p>
     * Lineage reference object : keyblckCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("keyblckCoasCode")
    @JsonPropertyDescription("Lineage reference object : keyblckCoasCode, Lookup lineage reference object : ftvcoas")
    private Object keyblckCoasCode;
    /**
     * Program
     * <p>
     * Lineage reference object : keyblckProgCode
     * 
     */
    @JsonProperty("keyblckProgCode")
    @JsonPropertyDescription("Lineage reference object : keyblckProgCode")
    private Object keyblckProgCode;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblckFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("keyblckFsyrCode")
    @JsonPropertyDescription("Lineage reference object : keyblckFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private Object keyblckFsyrCode;
    /**
     * Index
     * <p>
     * Lineage reference object : keyblckAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblckAcciCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAcciCode, Lookup lineage reference object : ftvacci")
    private Object keyblckAcciCode;
    /**
     * Field
     * <p>
     * Lineage reference object : FGVTRND_FIELD_DESC
     * 
     */
    @JsonProperty("fieldDesc")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_FIELD_DESC")
    private String fieldDesc;
    /**
     * Document
     * <p>
     * Lineage reference object : FGVTRND_DOC_CODE
     * (Required)
     * 
     */
    @JsonProperty("docCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_DOC_CODE")
    private String docCode;
    /**
     * Activity
     * <p>
     * Lineage reference object : keyblckActvCode
     * 
     */
    @JsonProperty("keyblckActvCode")
    @JsonPropertyDescription("Lineage reference object : keyblckActvCode")
    private Object keyblckActvCode;
    /**
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("displayProgCode")
    private String displayProgCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : FGVTRND_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_ORGN_CODE")
    private String orgnCode;
    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAcctCode")
    private String displayAcctCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FGVTRND_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Period
     * <p>
     * Lineage reference object : keyblckPeriod
     * 
     */
    @JsonProperty("keyblckPeriod")
    @JsonPropertyDescription("Lineage reference object : keyblckPeriod")
    private Object keyblckPeriod;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGVTRND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_FUND_CODE")
    private String fundCode;
    /**
     * Commit Type
     * <p>
     * Lineage reference object : keyblckCmtType
     * 
     */
    @JsonProperty("keyblckCmtType")
    @JsonPropertyDescription("Lineage reference object : keyblckCmtType")
    private Object keyblckCmtType;
    /**
     * Description
     * <p>
     * Lineage reference object : FGVTRND_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_TRANS_DESC")
    private String transDesc;
    /**
     * Account
     * <p>
     * Lineage reference object : keyblckAcctCode
     * 
     */
    @JsonProperty("keyblckAcctCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAcctCode")
    private Object keyblckAcctCode;
    /**
     * Amount
     * <p>
     * Lineage reference object : FGVTRND_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_TRANS_AMT")
    private Double transAmt;
    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGVTRND_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_TRANS_DATE")
    private Date transDate;
    /**
     * Type
     * <p>
     * Lineage reference object : FGVTRND_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_RUCL_CODE")
    private String ruclCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : keyblckOrgnCode
     * 
     */
    @JsonProperty("keyblckOrgnCode")
    @JsonPropertyDescription("Lineage reference object : keyblckOrgnCode")
    private Object keyblckOrgnCode;
    /**
     * Increase (+) or Decrease (-)
     * <p>
     * Lineage reference object : FGVTRND_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_DR_CR_IND")
    private String drCrInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblckFundCode
     * 
     */
    @JsonProperty("keyblckFundCode")
    public Object getKeyblckFundCode() {
        return keyblckFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblckFundCode
     * 
     */
    @JsonProperty("keyblckFundCode")
    public void setKeyblckFundCode(Object keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
    }

    public DetailTransactionActivity100GetRequest withKeyblckFundCode(Object keyblckFundCode) {
        this.keyblckFundCode = keyblckFundCode;
        return this;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : keyblckLocnCode
     * 
     */
    @JsonProperty("keyblckLocnCode")
    public Object getKeyblckLocnCode() {
        return keyblckLocnCode;
    }

    /**
     * Location
     * <p>
     * Lineage reference object : keyblckLocnCode
     * 
     */
    @JsonProperty("keyblckLocnCode")
    public void setKeyblckLocnCode(Object keyblckLocnCode) {
        this.keyblckLocnCode = keyblckLocnCode;
    }

    public DetailTransactionActivity100GetRequest withKeyblckLocnCode(Object keyblckLocnCode) {
        this.keyblckLocnCode = keyblckLocnCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : keyblckCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("keyblckCoasCode")
    public Object getKeyblckCoasCode() {
        return keyblckCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : keyblckCoasCode, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("keyblckCoasCode")
    public void setKeyblckCoasCode(Object keyblckCoasCode) {
        this.keyblckCoasCode = keyblckCoasCode;
    }

    public DetailTransactionActivity100GetRequest withKeyblckCoasCode(Object keyblckCoasCode) {
        this.keyblckCoasCode = keyblckCoasCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblckProgCode
     * 
     */
    @JsonProperty("keyblckProgCode")
    public Object getKeyblckProgCode() {
        return keyblckProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblckProgCode
     * 
     */
    @JsonProperty("keyblckProgCode")
    public void setKeyblckProgCode(Object keyblckProgCode) {
        this.keyblckProgCode = keyblckProgCode;
    }

    public DetailTransactionActivity100GetRequest withKeyblckProgCode(Object keyblckProgCode) {
        this.keyblckProgCode = keyblckProgCode;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblckFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("keyblckFsyrCode")
    public Object getKeyblckFsyrCode() {
        return keyblckFsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblckFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("keyblckFsyrCode")
    public void setKeyblckFsyrCode(Object keyblckFsyrCode) {
        this.keyblckFsyrCode = keyblckFsyrCode;
    }

    public DetailTransactionActivity100GetRequest withKeyblckFsyrCode(Object keyblckFsyrCode) {
        this.keyblckFsyrCode = keyblckFsyrCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : keyblckAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblckAcciCode")
    public Object getKeyblckAcciCode() {
        return keyblckAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : keyblckAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblckAcciCode")
    public void setKeyblckAcciCode(Object keyblckAcciCode) {
        this.keyblckAcciCode = keyblckAcciCode;
    }

    public DetailTransactionActivity100GetRequest withKeyblckAcciCode(Object keyblckAcciCode) {
        this.keyblckAcciCode = keyblckAcciCode;
        return this;
    }

    /**
     * Field
     * <p>
     * Lineage reference object : FGVTRND_FIELD_DESC
     * 
     */
    @JsonProperty("fieldDesc")
    public String getFieldDesc() {
        return fieldDesc;
    }

    /**
     * Field
     * <p>
     * Lineage reference object : FGVTRND_FIELD_DESC
     * 
     */
    @JsonProperty("fieldDesc")
    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    public DetailTransactionActivity100GetRequest withFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FGVTRND_DOC_CODE
     * (Required)
     * 
     */
    @JsonProperty("docCode")
    public String getDocCode() {
        return docCode;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FGVTRND_DOC_CODE
     * (Required)
     * 
     */
    @JsonProperty("docCode")
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public DetailTransactionActivity100GetRequest withDocCode(String docCode) {
        this.docCode = docCode;
        return this;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : keyblckActvCode
     * 
     */
    @JsonProperty("keyblckActvCode")
    public Object getKeyblckActvCode() {
        return keyblckActvCode;
    }

    /**
     * Activity
     * <p>
     * Lineage reference object : keyblckActvCode
     * 
     */
    @JsonProperty("keyblckActvCode")
    public void setKeyblckActvCode(Object keyblckActvCode) {
        this.keyblckActvCode = keyblckActvCode;
    }

    public DetailTransactionActivity100GetRequest withKeyblckActvCode(Object keyblckActvCode) {
        this.keyblckActvCode = keyblckActvCode;
        return this;
    }

    /**
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("displayProgCode")
    public String getDisplayProgCode() {
        return displayProgCode;
    }

    /**
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("displayProgCode")
    public void setDisplayProgCode(String displayProgCode) {
        this.displayProgCode = displayProgCode;
    }

    public DetailTransactionActivity100GetRequest withDisplayProgCode(String displayProgCode) {
        this.displayProgCode = displayProgCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FGVTRND_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FGVTRND_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public DetailTransactionActivity100GetRequest withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAcctCode")
    public String getDisplayAcctCode() {
        return displayAcctCode;
    }

    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAcctCode")
    public void setDisplayAcctCode(String displayAcctCode) {
        this.displayAcctCode = displayAcctCode;
    }

    public DetailTransactionActivity100GetRequest withDisplayAcctCode(String displayAcctCode) {
        this.displayAcctCode = displayAcctCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FGVTRND_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FGVTRND_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public DetailTransactionActivity100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : keyblckPeriod
     * 
     */
    @JsonProperty("keyblckPeriod")
    public Object getKeyblckPeriod() {
        return keyblckPeriod;
    }

    /**
     * Period
     * <p>
     * Lineage reference object : keyblckPeriod
     * 
     */
    @JsonProperty("keyblckPeriod")
    public void setKeyblckPeriod(Object keyblckPeriod) {
        this.keyblckPeriod = keyblckPeriod;
    }

    public DetailTransactionActivity100GetRequest withKeyblckPeriod(Object keyblckPeriod) {
        this.keyblckPeriod = keyblckPeriod;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGVTRND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGVTRND_FUND_CODE
     * (Required)
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public DetailTransactionActivity100GetRequest withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : keyblckCmtType
     * 
     */
    @JsonProperty("keyblckCmtType")
    public Object getKeyblckCmtType() {
        return keyblckCmtType;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : keyblckCmtType
     * 
     */
    @JsonProperty("keyblckCmtType")
    public void setKeyblckCmtType(Object keyblckCmtType) {
        this.keyblckCmtType = keyblckCmtType;
    }

    public DetailTransactionActivity100GetRequest withKeyblckCmtType(Object keyblckCmtType) {
        this.keyblckCmtType = keyblckCmtType;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGVTRND_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    public String getTransDesc() {
        return transDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FGVTRND_TRANS_DESC
     * 
     */
    @JsonProperty("transDesc")
    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc;
    }

    public DetailTransactionActivity100GetRequest withTransDesc(String transDesc) {
        this.transDesc = transDesc;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblckAcctCode
     * 
     */
    @JsonProperty("keyblckAcctCode")
    public Object getKeyblckAcctCode() {
        return keyblckAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblckAcctCode
     * 
     */
    @JsonProperty("keyblckAcctCode")
    public void setKeyblckAcctCode(Object keyblckAcctCode) {
        this.keyblckAcctCode = keyblckAcctCode;
    }

    public DetailTransactionActivity100GetRequest withKeyblckAcctCode(Object keyblckAcctCode) {
        this.keyblckAcctCode = keyblckAcctCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGVTRND_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    public Double getTransAmt() {
        return transAmt;
    }

    /**
     * Amount
     * <p>
     * Lineage reference object : FGVTRND_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    public void setTransAmt(Double transAmt) {
        this.transAmt = transAmt;
    }

    public DetailTransactionActivity100GetRequest withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGVTRND_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public Date getTransDate() {
        return transDate;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGVTRND_TRANS_DATE
     * (Required)
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public DetailTransactionActivity100GetRequest withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FGVTRND_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    public String getRuclCode() {
        return ruclCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : FGVTRND_RUCL_CODE
     * 
     */
    @JsonProperty("ruclCode")
    public void setRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
    }

    public DetailTransactionActivity100GetRequest withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : keyblckOrgnCode
     * 
     */
    @JsonProperty("keyblckOrgnCode")
    public Object getKeyblckOrgnCode() {
        return keyblckOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : keyblckOrgnCode
     * 
     */
    @JsonProperty("keyblckOrgnCode")
    public void setKeyblckOrgnCode(Object keyblckOrgnCode) {
        this.keyblckOrgnCode = keyblckOrgnCode;
    }

    public DetailTransactionActivity100GetRequest withKeyblckOrgnCode(Object keyblckOrgnCode) {
        this.keyblckOrgnCode = keyblckOrgnCode;
        return this;
    }

    /**
     * Increase (+) or Decrease (-)
     * <p>
     * Lineage reference object : FGVTRND_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public String getDrCrInd() {
        return drCrInd;
    }

    /**
     * Increase (+) or Decrease (-)
     * <p>
     * Lineage reference object : FGVTRND_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    public void setDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
    }

    public DetailTransactionActivity100GetRequest withDrCrInd(String drCrInd) {
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

    public DetailTransactionActivity100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetailTransactionActivity100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckFundCode");
        sb.append('=');
        sb.append(((this.keyblckFundCode == null)?"<null>":this.keyblckFundCode));
        sb.append(',');
        sb.append("keyblckLocnCode");
        sb.append('=');
        sb.append(((this.keyblckLocnCode == null)?"<null>":this.keyblckLocnCode));
        sb.append(',');
        sb.append("keyblckCoasCode");
        sb.append('=');
        sb.append(((this.keyblckCoasCode == null)?"<null>":this.keyblckCoasCode));
        sb.append(',');
        sb.append("keyblckProgCode");
        sb.append('=');
        sb.append(((this.keyblckProgCode == null)?"<null>":this.keyblckProgCode));
        sb.append(',');
        sb.append("keyblckFsyrCode");
        sb.append('=');
        sb.append(((this.keyblckFsyrCode == null)?"<null>":this.keyblckFsyrCode));
        sb.append(',');
        sb.append("keyblckAcciCode");
        sb.append('=');
        sb.append(((this.keyblckAcciCode == null)?"<null>":this.keyblckAcciCode));
        sb.append(',');
        sb.append("fieldDesc");
        sb.append('=');
        sb.append(((this.fieldDesc == null)?"<null>":this.fieldDesc));
        sb.append(',');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
        sb.append(',');
        sb.append("keyblckActvCode");
        sb.append('=');
        sb.append(((this.keyblckActvCode == null)?"<null>":this.keyblckActvCode));
        sb.append(',');
        sb.append("displayProgCode");
        sb.append('=');
        sb.append(((this.displayProgCode == null)?"<null>":this.displayProgCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("displayAcctCode");
        sb.append('=');
        sb.append(((this.displayAcctCode == null)?"<null>":this.displayAcctCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("keyblckPeriod");
        sb.append('=');
        sb.append(((this.keyblckPeriod == null)?"<null>":this.keyblckPeriod));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("keyblckCmtType");
        sb.append('=');
        sb.append(((this.keyblckCmtType == null)?"<null>":this.keyblckCmtType));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("keyblckAcctCode");
        sb.append('=');
        sb.append(((this.keyblckAcctCode == null)?"<null>":this.keyblckAcctCode));
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
        sb.append("keyblckOrgnCode");
        sb.append('=');
        sb.append(((this.keyblckOrgnCode == null)?"<null>":this.keyblckOrgnCode));
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
        result = ((result* 31)+((this.fieldDesc == null)? 0 :this.fieldDesc.hashCode()));
        result = ((result* 31)+((this.keyblckActvCode == null)? 0 :this.keyblckActvCode.hashCode()));
        result = ((result* 31)+((this.displayProgCode == null)? 0 :this.displayProgCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.displayAcctCode == null)? 0 :this.displayAcctCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.keyblckCmtType == null)? 0 :this.keyblckCmtType.hashCode()));
        result = ((result* 31)+((this.keyblckAcctCode == null)? 0 :this.keyblckAcctCode.hashCode()));
        result = ((result* 31)+((this.transAmt == null)? 0 :this.transAmt.hashCode()));
        result = ((result* 31)+((this.transDate == null)? 0 :this.transDate.hashCode()));
        result = ((result* 31)+((this.keyblckOrgnCode == null)? 0 :this.keyblckOrgnCode.hashCode()));
        result = ((result* 31)+((this.drCrInd == null)? 0 :this.drCrInd.hashCode()));
        result = ((result* 31)+((this.keyblckProgCode == null)? 0 :this.keyblckProgCode.hashCode()));
        result = ((result* 31)+((this.keyblckFsyrCode == null)? 0 :this.keyblckFsyrCode.hashCode()));
        result = ((result* 31)+((this.keyblckAcciCode == null)? 0 :this.keyblckAcciCode.hashCode()));
        result = ((result* 31)+((this.docCode == null)? 0 :this.docCode.hashCode()));
        result = ((result* 31)+((this.keyblckPeriod == null)? 0 :this.keyblckPeriod.hashCode()));
        result = ((result* 31)+((this.transDesc == null)? 0 :this.transDesc.hashCode()));
        result = ((result* 31)+((this.ruclCode == null)? 0 :this.ruclCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetailTransactionActivity100GetRequest) == false) {
            return false;
        }
        DetailTransactionActivity100GetRequest rhs = ((DetailTransactionActivity100GetRequest) other);
        return (((((((((((((((((((((((((this.keyblckFundCode == rhs.keyblckFundCode)||((this.keyblckFundCode!= null)&&this.keyblckFundCode.equals(rhs.keyblckFundCode)))&&((this.keyblckLocnCode == rhs.keyblckLocnCode)||((this.keyblckLocnCode!= null)&&this.keyblckLocnCode.equals(rhs.keyblckLocnCode))))&&((this.keyblckCoasCode == rhs.keyblckCoasCode)||((this.keyblckCoasCode!= null)&&this.keyblckCoasCode.equals(rhs.keyblckCoasCode))))&&((this.fieldDesc == rhs.fieldDesc)||((this.fieldDesc!= null)&&this.fieldDesc.equals(rhs.fieldDesc))))&&((this.keyblckActvCode == rhs.keyblckActvCode)||((this.keyblckActvCode!= null)&&this.keyblckActvCode.equals(rhs.keyblckActvCode))))&&((this.displayProgCode == rhs.displayProgCode)||((this.displayProgCode!= null)&&this.displayProgCode.equals(rhs.displayProgCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.displayAcctCode == rhs.displayAcctCode)||((this.displayAcctCode!= null)&&this.displayAcctCode.equals(rhs.displayAcctCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.keyblckCmtType == rhs.keyblckCmtType)||((this.keyblckCmtType!= null)&&this.keyblckCmtType.equals(rhs.keyblckCmtType))))&&((this.keyblckAcctCode == rhs.keyblckAcctCode)||((this.keyblckAcctCode!= null)&&this.keyblckAcctCode.equals(rhs.keyblckAcctCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.keyblckOrgnCode == rhs.keyblckOrgnCode)||((this.keyblckOrgnCode!= null)&&this.keyblckOrgnCode.equals(rhs.keyblckOrgnCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.keyblckProgCode == rhs.keyblckProgCode)||((this.keyblckProgCode!= null)&&this.keyblckProgCode.equals(rhs.keyblckProgCode))))&&((this.keyblckFsyrCode == rhs.keyblckFsyrCode)||((this.keyblckFsyrCode!= null)&&this.keyblckFsyrCode.equals(rhs.keyblckFsyrCode))))&&((this.keyblckAcciCode == rhs.keyblckAcciCode)||((this.keyblckAcciCode!= null)&&this.keyblckAcciCode.equals(rhs.keyblckAcciCode))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.keyblckPeriod == rhs.keyblckPeriod)||((this.keyblckPeriod!= null)&&this.keyblckPeriod.equals(rhs.keyblckPeriod))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
