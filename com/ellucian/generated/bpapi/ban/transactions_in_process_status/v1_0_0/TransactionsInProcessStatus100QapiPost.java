
package com.ellucian.generated.bpapi.ban.transactions_in_process_status.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keyblocCoasCode",
    "keyblocFsyrCode",
    "keyblocAcciCode",
    "keyblocCmtType",
    "keyblocFundCode",
    "keyblocOrgnCode",
    "keyblocAcctCode",
    "keyblocProgCode",
    "docNum",
    "displaySumAdjt",
    "ytdAmt",
    "displaySumRsvr",
    "displayStatus",
    "fundTran",
    "orgnTran",
    "acctTran",
    "progTran",
    "displayDescription"
})
@Generated("jsonschema2pojo")
public class TransactionsInProcessStatus100QapiPost {

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
    @JsonProperty("keyblocCmtType")
    private String keyblocCmtType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocFundCode")
    private String keyblocFundCode;
    @JsonProperty("keyblocOrgnCode")
    private String keyblocOrgnCode;
    @JsonProperty("keyblocAcctCode")
    private String keyblocAcctCode;
    @JsonProperty("keyblocProgCode")
    private String keyblocProgCode;
    @JsonProperty("docNum")
    private String docNum;
    @JsonProperty("displaySumAdjt")
    private String displaySumAdjt;
    @JsonProperty("ytdAmt")
    private String ytdAmt;
    @JsonProperty("displaySumRsvr")
    private String displaySumRsvr;
    @JsonProperty("displayStatus")
    private String displayStatus;
    @JsonProperty("fundTran")
    private String fundTran;
    @JsonProperty("orgnTran")
    private String orgnTran;
    @JsonProperty("acctTran")
    private String acctTran;
    @JsonProperty("progTran")
    private String progTran;
    @JsonProperty("displayDescription")
    private String displayDescription;
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

    public TransactionsInProcessStatus100QapiPost withKeyblocCoasCode(String keyblocCoasCode) {
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

    public TransactionsInProcessStatus100QapiPost withKeyblocFsyrCode(String keyblocFsyrCode) {
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

    public TransactionsInProcessStatus100QapiPost withKeyblocAcciCode(String keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
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

    public TransactionsInProcessStatus100QapiPost withKeyblocCmtType(String keyblocCmtType) {
        this.keyblocCmtType = keyblocCmtType;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocFundCode")
    public String getKeyblocFundCode() {
        return keyblocFundCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocFundCode")
    public void setKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
    }

    public TransactionsInProcessStatus100QapiPost withKeyblocFundCode(String keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
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

    public TransactionsInProcessStatus100QapiPost withKeyblocOrgnCode(String keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
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

    public TransactionsInProcessStatus100QapiPost withKeyblocAcctCode(String keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
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

    public TransactionsInProcessStatus100QapiPost withKeyblocProgCode(String keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
        return this;
    }

    @JsonProperty("docNum")
    public String getDocNum() {
        return docNum;
    }

    @JsonProperty("docNum")
    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public TransactionsInProcessStatus100QapiPost withDocNum(String docNum) {
        this.docNum = docNum;
        return this;
    }

    @JsonProperty("displaySumAdjt")
    public String getDisplaySumAdjt() {
        return displaySumAdjt;
    }

    @JsonProperty("displaySumAdjt")
    public void setDisplaySumAdjt(String displaySumAdjt) {
        this.displaySumAdjt = displaySumAdjt;
    }

    public TransactionsInProcessStatus100QapiPost withDisplaySumAdjt(String displaySumAdjt) {
        this.displaySumAdjt = displaySumAdjt;
        return this;
    }

    @JsonProperty("ytdAmt")
    public String getYtdAmt() {
        return ytdAmt;
    }

    @JsonProperty("ytdAmt")
    public void setYtdAmt(String ytdAmt) {
        this.ytdAmt = ytdAmt;
    }

    public TransactionsInProcessStatus100QapiPost withYtdAmt(String ytdAmt) {
        this.ytdAmt = ytdAmt;
        return this;
    }

    @JsonProperty("displaySumRsvr")
    public String getDisplaySumRsvr() {
        return displaySumRsvr;
    }

    @JsonProperty("displaySumRsvr")
    public void setDisplaySumRsvr(String displaySumRsvr) {
        this.displaySumRsvr = displaySumRsvr;
    }

    public TransactionsInProcessStatus100QapiPost withDisplaySumRsvr(String displaySumRsvr) {
        this.displaySumRsvr = displaySumRsvr;
        return this;
    }

    @JsonProperty("displayStatus")
    public String getDisplayStatus() {
        return displayStatus;
    }

    @JsonProperty("displayStatus")
    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public TransactionsInProcessStatus100QapiPost withDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    @JsonProperty("fundTran")
    public String getFundTran() {
        return fundTran;
    }

    @JsonProperty("fundTran")
    public void setFundTran(String fundTran) {
        this.fundTran = fundTran;
    }

    public TransactionsInProcessStatus100QapiPost withFundTran(String fundTran) {
        this.fundTran = fundTran;
        return this;
    }

    @JsonProperty("orgnTran")
    public String getOrgnTran() {
        return orgnTran;
    }

    @JsonProperty("orgnTran")
    public void setOrgnTran(String orgnTran) {
        this.orgnTran = orgnTran;
    }

    public TransactionsInProcessStatus100QapiPost withOrgnTran(String orgnTran) {
        this.orgnTran = orgnTran;
        return this;
    }

    @JsonProperty("acctTran")
    public String getAcctTran() {
        return acctTran;
    }

    @JsonProperty("acctTran")
    public void setAcctTran(String acctTran) {
        this.acctTran = acctTran;
    }

    public TransactionsInProcessStatus100QapiPost withAcctTran(String acctTran) {
        this.acctTran = acctTran;
        return this;
    }

    @JsonProperty("progTran")
    public String getProgTran() {
        return progTran;
    }

    @JsonProperty("progTran")
    public void setProgTran(String progTran) {
        this.progTran = progTran;
    }

    public TransactionsInProcessStatus100QapiPost withProgTran(String progTran) {
        this.progTran = progTran;
        return this;
    }

    @JsonProperty("displayDescription")
    public String getDisplayDescription() {
        return displayDescription;
    }

    @JsonProperty("displayDescription")
    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    public TransactionsInProcessStatus100QapiPost withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
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

    public TransactionsInProcessStatus100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionsInProcessStatus100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("keyblocCmtType");
        sb.append('=');
        sb.append(((this.keyblocCmtType == null)?"<null>":this.keyblocCmtType));
        sb.append(',');
        sb.append("keyblocFundCode");
        sb.append('=');
        sb.append(((this.keyblocFundCode == null)?"<null>":this.keyblocFundCode));
        sb.append(',');
        sb.append("keyblocOrgnCode");
        sb.append('=');
        sb.append(((this.keyblocOrgnCode == null)?"<null>":this.keyblocOrgnCode));
        sb.append(',');
        sb.append("keyblocAcctCode");
        sb.append('=');
        sb.append(((this.keyblocAcctCode == null)?"<null>":this.keyblocAcctCode));
        sb.append(',');
        sb.append("keyblocProgCode");
        sb.append('=');
        sb.append(((this.keyblocProgCode == null)?"<null>":this.keyblocProgCode));
        sb.append(',');
        sb.append("docNum");
        sb.append('=');
        sb.append(((this.docNum == null)?"<null>":this.docNum));
        sb.append(',');
        sb.append("displaySumAdjt");
        sb.append('=');
        sb.append(((this.displaySumAdjt == null)?"<null>":this.displaySumAdjt));
        sb.append(',');
        sb.append("ytdAmt");
        sb.append('=');
        sb.append(((this.ytdAmt == null)?"<null>":this.ytdAmt));
        sb.append(',');
        sb.append("displaySumRsvr");
        sb.append('=');
        sb.append(((this.displaySumRsvr == null)?"<null>":this.displaySumRsvr));
        sb.append(',');
        sb.append("displayStatus");
        sb.append('=');
        sb.append(((this.displayStatus == null)?"<null>":this.displayStatus));
        sb.append(',');
        sb.append("fundTran");
        sb.append('=');
        sb.append(((this.fundTran == null)?"<null>":this.fundTran));
        sb.append(',');
        sb.append("orgnTran");
        sb.append('=');
        sb.append(((this.orgnTran == null)?"<null>":this.orgnTran));
        sb.append(',');
        sb.append("acctTran");
        sb.append('=');
        sb.append(((this.acctTran == null)?"<null>":this.acctTran));
        sb.append(',');
        sb.append("progTran");
        sb.append('=');
        sb.append(((this.progTran == null)?"<null>":this.progTran));
        sb.append(',');
        sb.append("displayDescription");
        sb.append('=');
        sb.append(((this.displayDescription == null)?"<null>":this.displayDescription));
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
        result = ((result* 31)+((this.displayDescription == null)? 0 :this.displayDescription.hashCode()));
        result = ((result* 31)+((this.docNum == null)? 0 :this.docNum.hashCode()));
        result = ((result* 31)+((this.displaySumRsvr == null)? 0 :this.displaySumRsvr.hashCode()));
        result = ((result* 31)+((this.progTran == null)? 0 :this.progTran.hashCode()));
        result = ((result* 31)+((this.keyblocCoasCode == null)? 0 :this.keyblocCoasCode.hashCode()));
        result = ((result* 31)+((this.displaySumAdjt == null)? 0 :this.displaySumAdjt.hashCode()));
        result = ((result* 31)+((this.keyblocAcctCode == null)? 0 :this.keyblocAcctCode.hashCode()));
        result = ((result* 31)+((this.displayStatus == null)? 0 :this.displayStatus.hashCode()));
        result = ((result* 31)+((this.acctTran == null)? 0 :this.acctTran.hashCode()));
        result = ((result* 31)+((this.keyblocProgCode == null)? 0 :this.keyblocProgCode.hashCode()));
        result = ((result* 31)+((this.keyblocAcciCode == null)? 0 :this.keyblocAcciCode.hashCode()));
        result = ((result* 31)+((this.keyblocOrgnCode == null)? 0 :this.keyblocOrgnCode.hashCode()));
        result = ((result* 31)+((this.ytdAmt == null)? 0 :this.ytdAmt.hashCode()));
        result = ((result* 31)+((this.keyblocCmtType == null)? 0 :this.keyblocCmtType.hashCode()));
        result = ((result* 31)+((this.orgnTran == null)? 0 :this.orgnTran.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblocFundCode == null)? 0 :this.keyblocFundCode.hashCode()));
        result = ((result* 31)+((this.keyblocFsyrCode == null)? 0 :this.keyblocFsyrCode.hashCode()));
        result = ((result* 31)+((this.fundTran == null)? 0 :this.fundTran.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionsInProcessStatus100QapiPost) == false) {
            return false;
        }
        TransactionsInProcessStatus100QapiPost rhs = ((TransactionsInProcessStatus100QapiPost) other);
        return ((((((((((((((((((((this.displayDescription == rhs.displayDescription)||((this.displayDescription!= null)&&this.displayDescription.equals(rhs.displayDescription)))&&((this.docNum == rhs.docNum)||((this.docNum!= null)&&this.docNum.equals(rhs.docNum))))&&((this.displaySumRsvr == rhs.displaySumRsvr)||((this.displaySumRsvr!= null)&&this.displaySumRsvr.equals(rhs.displaySumRsvr))))&&((this.progTran == rhs.progTran)||((this.progTran!= null)&&this.progTran.equals(rhs.progTran))))&&((this.keyblocCoasCode == rhs.keyblocCoasCode)||((this.keyblocCoasCode!= null)&&this.keyblocCoasCode.equals(rhs.keyblocCoasCode))))&&((this.displaySumAdjt == rhs.displaySumAdjt)||((this.displaySumAdjt!= null)&&this.displaySumAdjt.equals(rhs.displaySumAdjt))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.displayStatus == rhs.displayStatus)||((this.displayStatus!= null)&&this.displayStatus.equals(rhs.displayStatus))))&&((this.acctTran == rhs.acctTran)||((this.acctTran!= null)&&this.acctTran.equals(rhs.acctTran))))&&((this.keyblocProgCode == rhs.keyblocProgCode)||((this.keyblocProgCode!= null)&&this.keyblocProgCode.equals(rhs.keyblocProgCode))))&&((this.keyblocAcciCode == rhs.keyblocAcciCode)||((this.keyblocAcciCode!= null)&&this.keyblocAcciCode.equals(rhs.keyblocAcciCode))))&&((this.keyblocOrgnCode == rhs.keyblocOrgnCode)||((this.keyblocOrgnCode!= null)&&this.keyblocOrgnCode.equals(rhs.keyblocOrgnCode))))&&((this.ytdAmt == rhs.ytdAmt)||((this.ytdAmt!= null)&&this.ytdAmt.equals(rhs.ytdAmt))))&&((this.keyblocCmtType == rhs.keyblocCmtType)||((this.keyblocCmtType!= null)&&this.keyblocCmtType.equals(rhs.keyblocCmtType))))&&((this.orgnTran == rhs.orgnTran)||((this.orgnTran!= null)&&this.orgnTran.equals(rhs.orgnTran))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))))&&((this.keyblocFsyrCode == rhs.keyblocFsyrCode)||((this.keyblocFsyrCode!= null)&&this.keyblocFsyrCode.equals(rhs.keyblocFsyrCode))))&&((this.fundTran == rhs.fundTran)||((this.fundTran!= null)&&this.fundTran.equals(rhs.fundTran))));
    }

}
