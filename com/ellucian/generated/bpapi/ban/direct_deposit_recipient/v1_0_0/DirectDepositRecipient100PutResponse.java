
package com.ellucian.generated.bpapi.ban.direct_deposit_recipient.v1_0_0;

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
    "achIatInd",
    "atypCodeIat",
    "bankAcctNum",
    "bankDesc",
    "scodCodeDesc",
    "userId",
    "achtCode",
    "activityDate",
    "addrSeqno",
    "scodCodeIso",
    "addrSeqnoIat",
    "acctType",
    "apInd",
    "bankRoutNum",
    "hrInd",
    "atypCode",
    "status"
})
@Generated("jsonschema2pojo")
public class DirectDepositRecipient100PutResponse {

    /**
     * IAT
     * <p>
     * Lineage reference object : GXRDIRD_ACH_IAT_IND
     * 
     */
    @JsonProperty("achIatInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACH_IAT_IND")
    private String achIatInd;
    /**
     * IAT Address Type Override
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE_IAT
     * 
     */
    @JsonProperty("atypCodeIat")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ATYP_CODE_IAT")
    private String atypCodeIat;
    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("bankAcctNum")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_BANK_ACCT_NUM")
    private String bankAcctNum;
    @JsonProperty("bankDesc")
    private String bankDesc;
    @JsonProperty("scodCodeDesc")
    private String scodCodeDesc;
    /**
     * Lineage reference object : GXRDIRD_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_USER_ID")
    private String userId;
    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : GXRDIRD_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACHT_CODE")
    private String achtCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : GXRDIRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ADDR_SEQNO")
    private Double addrSeqno;
    /**
     * ISO Country Code
     * <p>
     * Lineage reference object : GXRDIRD_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_SCOD_CODE_ISO")
    private String scodCodeIso;
    /**
     * IAT Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT
     * 
     */
    @JsonProperty("addrSeqnoIat")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT")
    private Double addrSeqnoIat;
    /**
     * Lineage reference object : GXRDIRD_ACCT_TYPE
     * 
     */
    @JsonProperty("acctType")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ACCT_TYPE")
    private String acctType;
    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("apInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_AP_IND")
    private String apInd;
    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("bankRoutNum")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_BANK_ROUT_NUM")
    private String bankRoutNum;
    /**
     * Payroll
     * <p>
     * Lineage reference object : GXRDIRD_HR_IND
     * 
     */
    @JsonProperty("hrInd")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_HR_IND")
    private String hrInd;
    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_ATYP_CODE")
    private String atypCode;
    /**
     * Direct Deposit Status
     * <p>
     * Lineage reference object : GXRDIRD_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : GXRDIRD_STATUS")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * IAT
     * <p>
     * Lineage reference object : GXRDIRD_ACH_IAT_IND
     * 
     */
    @JsonProperty("achIatInd")
    public String getAchIatInd() {
        return achIatInd;
    }

    /**
     * IAT
     * <p>
     * Lineage reference object : GXRDIRD_ACH_IAT_IND
     * 
     */
    @JsonProperty("achIatInd")
    public void setAchIatInd(String achIatInd) {
        this.achIatInd = achIatInd;
    }

    public DirectDepositRecipient100PutResponse withAchIatInd(String achIatInd) {
        this.achIatInd = achIatInd;
        return this;
    }

    /**
     * IAT Address Type Override
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE_IAT
     * 
     */
    @JsonProperty("atypCodeIat")
    public String getAtypCodeIat() {
        return atypCodeIat;
    }

    /**
     * IAT Address Type Override
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE_IAT
     * 
     */
    @JsonProperty("atypCodeIat")
    public void setAtypCodeIat(String atypCodeIat) {
        this.atypCodeIat = atypCodeIat;
    }

    public DirectDepositRecipient100PutResponse withAtypCodeIat(String atypCodeIat) {
        this.atypCodeIat = atypCodeIat;
        return this;
    }

    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("bankAcctNum")
    public String getBankAcctNum() {
        return bankAcctNum;
    }

    /**
     * Account Number
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ACCT_NUM
     * 
     */
    @JsonProperty("bankAcctNum")
    public void setBankAcctNum(String bankAcctNum) {
        this.bankAcctNum = bankAcctNum;
    }

    public DirectDepositRecipient100PutResponse withBankAcctNum(String bankAcctNum) {
        this.bankAcctNum = bankAcctNum;
        return this;
    }

    @JsonProperty("bankDesc")
    public String getBankDesc() {
        return bankDesc;
    }

    @JsonProperty("bankDesc")
    public void setBankDesc(String bankDesc) {
        this.bankDesc = bankDesc;
    }

    public DirectDepositRecipient100PutResponse withBankDesc(String bankDesc) {
        this.bankDesc = bankDesc;
        return this;
    }

    @JsonProperty("scodCodeDesc")
    public String getScodCodeDesc() {
        return scodCodeDesc;
    }

    @JsonProperty("scodCodeDesc")
    public void setScodCodeDesc(String scodCodeDesc) {
        this.scodCodeDesc = scodCodeDesc;
    }

    public DirectDepositRecipient100PutResponse withScodCodeDesc(String scodCodeDesc) {
        this.scodCodeDesc = scodCodeDesc;
        return this;
    }

    /**
     * Lineage reference object : GXRDIRD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : GXRDIRD_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DirectDepositRecipient100PutResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : GXRDIRD_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    public String getAchtCode() {
        return achtCode;
    }

    /**
     * ACH Transaction Type
     * <p>
     * Lineage reference object : GXRDIRD_ACHT_CODE
     * 
     */
    @JsonProperty("achtCode")
    public void setAchtCode(String achtCode) {
        this.achtCode = achtCode;
    }

    public DirectDepositRecipient100PutResponse withAchtCode(String achtCode) {
        this.achtCode = achtCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GXRDIRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GXRDIRD_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public DirectDepositRecipient100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public Double getAddrSeqno() {
        return addrSeqno;
    }

    /**
     * Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO
     * 
     */
    @JsonProperty("addrSeqno")
    public void setAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
    }

    public DirectDepositRecipient100PutResponse withAddrSeqno(Double addrSeqno) {
        this.addrSeqno = addrSeqno;
        return this;
    }

    /**
     * ISO Country Code
     * <p>
     * Lineage reference object : GXRDIRD_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public String getScodCodeIso() {
        return scodCodeIso;
    }

    /**
     * ISO Country Code
     * <p>
     * Lineage reference object : GXRDIRD_SCOD_CODE_ISO
     * 
     */
    @JsonProperty("scodCodeIso")
    public void setScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
    }

    public DirectDepositRecipient100PutResponse withScodCodeIso(String scodCodeIso) {
        this.scodCodeIso = scodCodeIso;
        return this;
    }

    /**
     * IAT Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT
     * 
     */
    @JsonProperty("addrSeqnoIat")
    public Double getAddrSeqnoIat() {
        return addrSeqnoIat;
    }

    /**
     * IAT Address Sequence
     * <p>
     * Lineage reference object : GXRDIRD_ADDR_SEQNO_IAT
     * 
     */
    @JsonProperty("addrSeqnoIat")
    public void setAddrSeqnoIat(Double addrSeqnoIat) {
        this.addrSeqnoIat = addrSeqnoIat;
    }

    public DirectDepositRecipient100PutResponse withAddrSeqnoIat(Double addrSeqnoIat) {
        this.addrSeqnoIat = addrSeqnoIat;
        return this;
    }

    /**
     * Lineage reference object : GXRDIRD_ACCT_TYPE
     * 
     */
    @JsonProperty("acctType")
    public String getAcctType() {
        return acctType;
    }

    /**
     * Lineage reference object : GXRDIRD_ACCT_TYPE
     * 
     */
    @JsonProperty("acctType")
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public DirectDepositRecipient100PutResponse withAcctType(String acctType) {
        this.acctType = acctType;
        return this;
    }

    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("apInd")
    public String getApInd() {
        return apInd;
    }

    /**
     * Accounts Payable
     * <p>
     * Lineage reference object : GXRDIRD_AP_IND
     * 
     */
    @JsonProperty("apInd")
    public void setApInd(String apInd) {
        this.apInd = apInd;
    }

    public DirectDepositRecipient100PutResponse withApInd(String apInd) {
        this.apInd = apInd;
        return this;
    }

    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("bankRoutNum")
    public String getBankRoutNum() {
        return bankRoutNum;
    }

    /**
     * Bank Routing
     * <p>
     * Lineage reference object : GXRDIRD_BANK_ROUT_NUM
     * (Required)
     * 
     */
    @JsonProperty("bankRoutNum")
    public void setBankRoutNum(String bankRoutNum) {
        this.bankRoutNum = bankRoutNum;
    }

    public DirectDepositRecipient100PutResponse withBankRoutNum(String bankRoutNum) {
        this.bankRoutNum = bankRoutNum;
        return this;
    }

    /**
     * Payroll
     * <p>
     * Lineage reference object : GXRDIRD_HR_IND
     * 
     */
    @JsonProperty("hrInd")
    public String getHrInd() {
        return hrInd;
    }

    /**
     * Payroll
     * <p>
     * Lineage reference object : GXRDIRD_HR_IND
     * 
     */
    @JsonProperty("hrInd")
    public void setHrInd(String hrInd) {
        this.hrInd = hrInd;
    }

    public DirectDepositRecipient100PutResponse withHrInd(String hrInd) {
        this.hrInd = hrInd;
        return this;
    }

    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public String getAtypCode() {
        return atypCode;
    }

    /**
     * Vendor Address Type
     * <p>
     * Lineage reference object : GXRDIRD_ATYP_CODE
     * 
     */
    @JsonProperty("atypCode")
    public void setAtypCode(String atypCode) {
        this.atypCode = atypCode;
    }

    public DirectDepositRecipient100PutResponse withAtypCode(String atypCode) {
        this.atypCode = atypCode;
        return this;
    }

    /**
     * Direct Deposit Status
     * <p>
     * Lineage reference object : GXRDIRD_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Direct Deposit Status
     * <p>
     * Lineage reference object : GXRDIRD_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public DirectDepositRecipient100PutResponse withStatus(String status) {
        this.status = status;
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

    public DirectDepositRecipient100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DirectDepositRecipient100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("achIatInd");
        sb.append('=');
        sb.append(((this.achIatInd == null)?"<null>":this.achIatInd));
        sb.append(',');
        sb.append("atypCodeIat");
        sb.append('=');
        sb.append(((this.atypCodeIat == null)?"<null>":this.atypCodeIat));
        sb.append(',');
        sb.append("bankAcctNum");
        sb.append('=');
        sb.append(((this.bankAcctNum == null)?"<null>":this.bankAcctNum));
        sb.append(',');
        sb.append("bankDesc");
        sb.append('=');
        sb.append(((this.bankDesc == null)?"<null>":this.bankDesc));
        sb.append(',');
        sb.append("scodCodeDesc");
        sb.append('=');
        sb.append(((this.scodCodeDesc == null)?"<null>":this.scodCodeDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("achtCode");
        sb.append('=');
        sb.append(((this.achtCode == null)?"<null>":this.achtCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("addrSeqno");
        sb.append('=');
        sb.append(((this.addrSeqno == null)?"<null>":this.addrSeqno));
        sb.append(',');
        sb.append("scodCodeIso");
        sb.append('=');
        sb.append(((this.scodCodeIso == null)?"<null>":this.scodCodeIso));
        sb.append(',');
        sb.append("addrSeqnoIat");
        sb.append('=');
        sb.append(((this.addrSeqnoIat == null)?"<null>":this.addrSeqnoIat));
        sb.append(',');
        sb.append("acctType");
        sb.append('=');
        sb.append(((this.acctType == null)?"<null>":this.acctType));
        sb.append(',');
        sb.append("apInd");
        sb.append('=');
        sb.append(((this.apInd == null)?"<null>":this.apInd));
        sb.append(',');
        sb.append("bankRoutNum");
        sb.append('=');
        sb.append(((this.bankRoutNum == null)?"<null>":this.bankRoutNum));
        sb.append(',');
        sb.append("hrInd");
        sb.append('=');
        sb.append(((this.hrInd == null)?"<null>":this.hrInd));
        sb.append(',');
        sb.append("atypCode");
        sb.append('=');
        sb.append(((this.atypCode == null)?"<null>":this.atypCode));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.achIatInd == null)? 0 :this.achIatInd.hashCode()));
        result = ((result* 31)+((this.atypCodeIat == null)? 0 :this.atypCodeIat.hashCode()));
        result = ((result* 31)+((this.bankAcctNum == null)? 0 :this.bankAcctNum.hashCode()));
        result = ((result* 31)+((this.bankDesc == null)? 0 :this.bankDesc.hashCode()));
        result = ((result* 31)+((this.scodCodeDesc == null)? 0 :this.scodCodeDesc.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.achtCode == null)? 0 :this.achtCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.addrSeqno == null)? 0 :this.addrSeqno.hashCode()));
        result = ((result* 31)+((this.scodCodeIso == null)? 0 :this.scodCodeIso.hashCode()));
        result = ((result* 31)+((this.addrSeqnoIat == null)? 0 :this.addrSeqnoIat.hashCode()));
        result = ((result* 31)+((this.acctType == null)? 0 :this.acctType.hashCode()));
        result = ((result* 31)+((this.apInd == null)? 0 :this.apInd.hashCode()));
        result = ((result* 31)+((this.bankRoutNum == null)? 0 :this.bankRoutNum.hashCode()));
        result = ((result* 31)+((this.hrInd == null)? 0 :this.hrInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atypCode == null)? 0 :this.atypCode.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DirectDepositRecipient100PutResponse) == false) {
            return false;
        }
        DirectDepositRecipient100PutResponse rhs = ((DirectDepositRecipient100PutResponse) other);
        return (((((((((((((((((((this.achIatInd == rhs.achIatInd)||((this.achIatInd!= null)&&this.achIatInd.equals(rhs.achIatInd)))&&((this.atypCodeIat == rhs.atypCodeIat)||((this.atypCodeIat!= null)&&this.atypCodeIat.equals(rhs.atypCodeIat))))&&((this.bankAcctNum == rhs.bankAcctNum)||((this.bankAcctNum!= null)&&this.bankAcctNum.equals(rhs.bankAcctNum))))&&((this.bankDesc == rhs.bankDesc)||((this.bankDesc!= null)&&this.bankDesc.equals(rhs.bankDesc))))&&((this.scodCodeDesc == rhs.scodCodeDesc)||((this.scodCodeDesc!= null)&&this.scodCodeDesc.equals(rhs.scodCodeDesc))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.achtCode == rhs.achtCode)||((this.achtCode!= null)&&this.achtCode.equals(rhs.achtCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.addrSeqno == rhs.addrSeqno)||((this.addrSeqno!= null)&&this.addrSeqno.equals(rhs.addrSeqno))))&&((this.scodCodeIso == rhs.scodCodeIso)||((this.scodCodeIso!= null)&&this.scodCodeIso.equals(rhs.scodCodeIso))))&&((this.addrSeqnoIat == rhs.addrSeqnoIat)||((this.addrSeqnoIat!= null)&&this.addrSeqnoIat.equals(rhs.addrSeqnoIat))))&&((this.acctType == rhs.acctType)||((this.acctType!= null)&&this.acctType.equals(rhs.acctType))))&&((this.apInd == rhs.apInd)||((this.apInd!= null)&&this.apInd.equals(rhs.apInd))))&&((this.bankRoutNum == rhs.bankRoutNum)||((this.bankRoutNum!= null)&&this.bankRoutNum.equals(rhs.bankRoutNum))))&&((this.hrInd == rhs.hrInd)||((this.hrInd!= null)&&this.hrInd.equals(rhs.hrInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atypCode == rhs.atypCode)||((this.atypCode!= null)&&this.atypCode.equals(rhs.atypCode))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
