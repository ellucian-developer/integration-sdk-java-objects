
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
    "keyblckCoasCode",
    "keyblckFsyrCode",
    "keyblckAcciCode",
    "keyblckFundCode",
    "keyblckOrgnCode",
    "keyblckAcctCode",
    "keyblckProgCode",
    "keyblckActvCode",
    "keyblckLocnCode",
    "keyblckPeriod",
    "keyblckCmtType",
    "displayAcctCode",
    "orgnCode",
    "displayProgCode",
    "fieldDesc",
    "transAmt",
    "drCrInd",
    "ruclCode",
    "transDate",
    "activityDate",
    "docCode",
    "transDesc",
    "fundCode"
})
@Generated("jsonschema2pojo")
public class DetailTransactionActivity100QapiPost {

    @JsonProperty("keyblckCoasCode")
    private String keyblckCoasCode;
    @JsonProperty("keyblckFsyrCode")
    private String keyblckFsyrCode;
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
    @JsonProperty("keyblckPeriod")
    private String keyblckPeriod;
    @JsonProperty("keyblckCmtType")
    private String keyblckCmtType;
    /**
     * Account
     * <p>
     * 
     * 
     */
    @JsonProperty("displayAcctCode")
    private String displayAcctCode;
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
     * Program
     * <p>
     * 
     * 
     */
    @JsonProperty("displayProgCode")
    private String displayProgCode;
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
     * Amount
     * <p>
     * Lineage reference object : FGVTRND_TRANS_AMT
     * 
     */
    @JsonProperty("transAmt")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_TRANS_AMT")
    private Double transAmt;
    /**
     * Increase (+) or Decrease (-)
     * <p>
     * Lineage reference object : FGVTRND_DR_CR_IND
     * 
     */
    @JsonProperty("drCrInd")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_DR_CR_IND")
    private String drCrInd;
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
     * Transaction Date
     * <p>
     * Lineage reference object : FGVTRND_TRANS_DATE
     * 
     */
    @JsonProperty("transDate")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_TRANS_DATE")
    private Date transDate;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FGVTRND_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Document
     * <p>
     * Lineage reference object : FGVTRND_DOC_CODE
     * 
     */
    @JsonProperty("docCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_DOC_CODE")
    private String docCode;
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
     * Fund
     * <p>
     * Lineage reference object : FGVTRND_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGVTRND_FUND_CODE")
    private String fundCode;
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

    public DetailTransactionActivity100QapiPost withKeyblckCoasCode(String keyblckCoasCode) {
        this.keyblckCoasCode = keyblckCoasCode;
        return this;
    }

    @JsonProperty("keyblckFsyrCode")
    public String getKeyblckFsyrCode() {
        return keyblckFsyrCode;
    }

    @JsonProperty("keyblckFsyrCode")
    public void setKeyblckFsyrCode(String keyblckFsyrCode) {
        this.keyblckFsyrCode = keyblckFsyrCode;
    }

    public DetailTransactionActivity100QapiPost withKeyblckFsyrCode(String keyblckFsyrCode) {
        this.keyblckFsyrCode = keyblckFsyrCode;
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

    public DetailTransactionActivity100QapiPost withKeyblckAcciCode(String keyblckAcciCode) {
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

    public DetailTransactionActivity100QapiPost withKeyblckFundCode(String keyblckFundCode) {
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

    public DetailTransactionActivity100QapiPost withKeyblckOrgnCode(String keyblckOrgnCode) {
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

    public DetailTransactionActivity100QapiPost withKeyblckAcctCode(String keyblckAcctCode) {
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

    public DetailTransactionActivity100QapiPost withKeyblckProgCode(String keyblckProgCode) {
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

    public DetailTransactionActivity100QapiPost withKeyblckActvCode(String keyblckActvCode) {
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

    public DetailTransactionActivity100QapiPost withKeyblckLocnCode(String keyblckLocnCode) {
        this.keyblckLocnCode = keyblckLocnCode;
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

    public DetailTransactionActivity100QapiPost withKeyblckPeriod(String keyblckPeriod) {
        this.keyblckPeriod = keyblckPeriod;
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

    public DetailTransactionActivity100QapiPost withKeyblckCmtType(String keyblckCmtType) {
        this.keyblckCmtType = keyblckCmtType;
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

    public DetailTransactionActivity100QapiPost withDisplayAcctCode(String displayAcctCode) {
        this.displayAcctCode = displayAcctCode;
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

    public DetailTransactionActivity100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
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

    public DetailTransactionActivity100QapiPost withDisplayProgCode(String displayProgCode) {
        this.displayProgCode = displayProgCode;
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

    public DetailTransactionActivity100QapiPost withFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
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

    public DetailTransactionActivity100QapiPost withTransAmt(Double transAmt) {
        this.transAmt = transAmt;
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

    public DetailTransactionActivity100QapiPost withDrCrInd(String drCrInd) {
        this.drCrInd = drCrInd;
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

    public DetailTransactionActivity100QapiPost withRuclCode(String ruclCode) {
        this.ruclCode = ruclCode;
        return this;
    }

    /**
     * Transaction Date
     * <p>
     * Lineage reference object : FGVTRND_TRANS_DATE
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
     * 
     */
    @JsonProperty("transDate")
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public DetailTransactionActivity100QapiPost withTransDate(Date transDate) {
        this.transDate = transDate;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FGVTRND_ACTIVITY_DATE
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
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public DetailTransactionActivity100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FGVTRND_DOC_CODE
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
     * 
     */
    @JsonProperty("docCode")
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public DetailTransactionActivity100QapiPost withDocCode(String docCode) {
        this.docCode = docCode;
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

    public DetailTransactionActivity100QapiPost withTransDesc(String transDesc) {
        this.transDesc = transDesc;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGVTRND_FUND_CODE
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
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public DetailTransactionActivity100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
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

    public DetailTransactionActivity100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DetailTransactionActivity100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckCoasCode");
        sb.append('=');
        sb.append(((this.keyblckCoasCode == null)?"<null>":this.keyblckCoasCode));
        sb.append(',');
        sb.append("keyblckFsyrCode");
        sb.append('=');
        sb.append(((this.keyblckFsyrCode == null)?"<null>":this.keyblckFsyrCode));
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
        sb.append("keyblckPeriod");
        sb.append('=');
        sb.append(((this.keyblckPeriod == null)?"<null>":this.keyblckPeriod));
        sb.append(',');
        sb.append("keyblckCmtType");
        sb.append('=');
        sb.append(((this.keyblckCmtType == null)?"<null>":this.keyblckCmtType));
        sb.append(',');
        sb.append("displayAcctCode");
        sb.append('=');
        sb.append(((this.displayAcctCode == null)?"<null>":this.displayAcctCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("displayProgCode");
        sb.append('=');
        sb.append(((this.displayProgCode == null)?"<null>":this.displayProgCode));
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
        sb.append("ruclCode");
        sb.append('=');
        sb.append(((this.ruclCode == null)?"<null>":this.ruclCode));
        sb.append(',');
        sb.append("transDate");
        sb.append('=');
        sb.append(((this.transDate == null)?"<null>":this.transDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("docCode");
        sb.append('=');
        sb.append(((this.docCode == null)?"<null>":this.docCode));
        sb.append(',');
        sb.append("transDesc");
        sb.append('=');
        sb.append(((this.transDesc == null)?"<null>":this.transDesc));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
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
        if ((other instanceof DetailTransactionActivity100QapiPost) == false) {
            return false;
        }
        DetailTransactionActivity100QapiPost rhs = ((DetailTransactionActivity100QapiPost) other);
        return (((((((((((((((((((((((((this.keyblckFundCode == rhs.keyblckFundCode)||((this.keyblckFundCode!= null)&&this.keyblckFundCode.equals(rhs.keyblckFundCode)))&&((this.keyblckLocnCode == rhs.keyblckLocnCode)||((this.keyblckLocnCode!= null)&&this.keyblckLocnCode.equals(rhs.keyblckLocnCode))))&&((this.keyblckCoasCode == rhs.keyblckCoasCode)||((this.keyblckCoasCode!= null)&&this.keyblckCoasCode.equals(rhs.keyblckCoasCode))))&&((this.fieldDesc == rhs.fieldDesc)||((this.fieldDesc!= null)&&this.fieldDesc.equals(rhs.fieldDesc))))&&((this.keyblckActvCode == rhs.keyblckActvCode)||((this.keyblckActvCode!= null)&&this.keyblckActvCode.equals(rhs.keyblckActvCode))))&&((this.displayProgCode == rhs.displayProgCode)||((this.displayProgCode!= null)&&this.displayProgCode.equals(rhs.displayProgCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.displayAcctCode == rhs.displayAcctCode)||((this.displayAcctCode!= null)&&this.displayAcctCode.equals(rhs.displayAcctCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.keyblckCmtType == rhs.keyblckCmtType)||((this.keyblckCmtType!= null)&&this.keyblckCmtType.equals(rhs.keyblckCmtType))))&&((this.keyblckAcctCode == rhs.keyblckAcctCode)||((this.keyblckAcctCode!= null)&&this.keyblckAcctCode.equals(rhs.keyblckAcctCode))))&&((this.transAmt == rhs.transAmt)||((this.transAmt!= null)&&this.transAmt.equals(rhs.transAmt))))&&((this.transDate == rhs.transDate)||((this.transDate!= null)&&this.transDate.equals(rhs.transDate))))&&((this.keyblckOrgnCode == rhs.keyblckOrgnCode)||((this.keyblckOrgnCode!= null)&&this.keyblckOrgnCode.equals(rhs.keyblckOrgnCode))))&&((this.drCrInd == rhs.drCrInd)||((this.drCrInd!= null)&&this.drCrInd.equals(rhs.drCrInd))))&&((this.keyblckProgCode == rhs.keyblckProgCode)||((this.keyblckProgCode!= null)&&this.keyblckProgCode.equals(rhs.keyblckProgCode))))&&((this.keyblckFsyrCode == rhs.keyblckFsyrCode)||((this.keyblckFsyrCode!= null)&&this.keyblckFsyrCode.equals(rhs.keyblckFsyrCode))))&&((this.keyblckAcciCode == rhs.keyblckAcciCode)||((this.keyblckAcciCode!= null)&&this.keyblckAcciCode.equals(rhs.keyblckAcciCode))))&&((this.docCode == rhs.docCode)||((this.docCode!= null)&&this.docCode.equals(rhs.docCode))))&&((this.keyblckPeriod == rhs.keyblckPeriod)||((this.keyblckPeriod!= null)&&this.keyblckPeriod.equals(rhs.keyblckPeriod))))&&((this.transDesc == rhs.transDesc)||((this.transDesc!= null)&&this.transDesc.equals(rhs.transDesc))))&&((this.ruclCode == rhs.ruclCode)||((this.ruclCode!= null)&&this.ruclCode.equals(rhs.ruclCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
