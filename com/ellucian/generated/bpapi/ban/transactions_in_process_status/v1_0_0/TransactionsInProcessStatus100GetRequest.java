
package com.ellucian.generated.bpapi.ban.transactions_in_process_status.v1_0_0;

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
    "displayDescription",
    "docNum",
    "displaySumRsvr",
    "progTran",
    "displaySumAdjt",
    "keyblocAcctCode",
    "displayStatus",
    "acctTran",
    "keyblocProgCode",
    "keyblocAcciCode",
    "keyblocOrgnCode",
    "ytdAmt",
    "keyblocCmtType",
    "orgnTran",
    "keyblocFundCode",
    "keyblocFsyrCode",
    "fundTran"
})
@Generated("jsonschema2pojo")
public class TransactionsInProcessStatus100GetRequest {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDescription")
    private String displayDescription;
    /**
     * Document
     * <p>
     * Lineage reference object : FGRBAKO_DOC_NUM
     * 
     */
    @JsonProperty("docNum")
    @JsonPropertyDescription("Lineage reference object : FGRBAKO_DOC_NUM")
    private String docNum;
    /**
     * Commitments
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumRsvr")
    private Double displaySumRsvr;
    /**
     * Program
     * <p>
     * Lineage reference object : FGRBAKO_PROG_TRAN
     * 
     */
    @JsonProperty("progTran")
    @JsonPropertyDescription("Lineage reference object : FGRBAKO_PROG_TRAN")
    private String progTran;
    /**
     * Adjusted Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumAdjt")
    private Double displaySumAdjt;
    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAcctCode")
    private Object keyblocAcctCode;
    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayStatus")
    private String displayStatus;
    /**
     * Account
     * <p>
     * Lineage reference object : FGRBAKO_ACCT_TRAN
     * 
     */
    @JsonProperty("acctTran")
    @JsonPropertyDescription("Lineage reference object : FGRBAKO_ACCT_TRAN")
    private String acctTran;
    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgCode
     * 
     */
    @JsonProperty("keyblocProgCode")
    @JsonPropertyDescription("Lineage reference object : keyblocProgCode")
    private Object keyblocProgCode;
    /**
     * Index
     * <p>
     * Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    @JsonPropertyDescription("Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci")
    private Object keyblocAcciCode;
    /**
     * Organization
     * <p>
     * Lineage reference object : keyblocOrgnCode
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    @JsonPropertyDescription("Lineage reference object : keyblocOrgnCode")
    private Object keyblocOrgnCode;
    /**
     * YTD Activity
     * <p>
     * Lineage reference object : FGRBAKO_YTD_AMT
     * 
     */
    @JsonProperty("ytdAmt")
    @JsonPropertyDescription("Lineage reference object : FGRBAKO_YTD_AMT")
    private Double ytdAmt;
    /**
     * Commit Type
     * <p>
     * Lineage reference object : keyblocCmtType
     * 
     */
    @JsonProperty("keyblocCmtType")
    @JsonPropertyDescription("Lineage reference object : keyblocCmtType")
    private Object keyblocCmtType;
    /**
     * Organization
     * <p>
     * Lineage reference object : FGRBAKO_ORGN_TRAN
     * 
     */
    @JsonProperty("orgnTran")
    @JsonPropertyDescription("Lineage reference object : FGRBAKO_ORGN_TRAN")
    private String orgnTran;
    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    @JsonPropertyDescription("Lineage reference object : keyblocFundCode")
    private Object keyblocFundCode;
    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    @JsonPropertyDescription("Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private Object keyblocFsyrCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGRBAKO_FUND_TRAN
     * 
     */
    @JsonProperty("fundTran")
    @JsonPropertyDescription("Lineage reference object : FGRBAKO_FUND_TRAN")
    private String fundTran;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDescription")
    public String getDisplayDescription() {
        return displayDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDescription")
    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }

    public TransactionsInProcessStatus100GetRequest withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FGRBAKO_DOC_NUM
     * 
     */
    @JsonProperty("docNum")
    public String getDocNum() {
        return docNum;
    }

    /**
     * Document
     * <p>
     * Lineage reference object : FGRBAKO_DOC_NUM
     * 
     */
    @JsonProperty("docNum")
    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public TransactionsInProcessStatus100GetRequest withDocNum(String docNum) {
        this.docNum = docNum;
        return this;
    }

    /**
     * Commitments
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumRsvr")
    public Double getDisplaySumRsvr() {
        return displaySumRsvr;
    }

    /**
     * Commitments
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumRsvr")
    public void setDisplaySumRsvr(Double displaySumRsvr) {
        this.displaySumRsvr = displaySumRsvr;
    }

    public TransactionsInProcessStatus100GetRequest withDisplaySumRsvr(Double displaySumRsvr) {
        this.displaySumRsvr = displaySumRsvr;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FGRBAKO_PROG_TRAN
     * 
     */
    @JsonProperty("progTran")
    public String getProgTran() {
        return progTran;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FGRBAKO_PROG_TRAN
     * 
     */
    @JsonProperty("progTran")
    public void setProgTran(String progTran) {
        this.progTran = progTran;
    }

    public TransactionsInProcessStatus100GetRequest withProgTran(String progTran) {
        this.progTran = progTran;
        return this;
    }

    /**
     * Adjusted Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumAdjt")
    public Double getDisplaySumAdjt() {
        return displaySumAdjt;
    }

    /**
     * Adjusted Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumAdjt")
    public void setDisplaySumAdjt(Double displaySumAdjt) {
        this.displaySumAdjt = displaySumAdjt;
    }

    public TransactionsInProcessStatus100GetRequest withDisplaySumAdjt(Double displaySumAdjt) {
        this.displaySumAdjt = displaySumAdjt;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    public Object getKeyblocAcctCode() {
        return keyblocAcctCode;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : keyblocAcctCode
     * 
     */
    @JsonProperty("keyblocAcctCode")
    public void setKeyblocAcctCode(Object keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
    }

    public TransactionsInProcessStatus100GetRequest withKeyblocAcctCode(Object keyblocAcctCode) {
        this.keyblocAcctCode = keyblocAcctCode;
        return this;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayStatus")
    public String getDisplayStatus() {
        return displayStatus;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("displayStatus")
    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public TransactionsInProcessStatus100GetRequest withDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FGRBAKO_ACCT_TRAN
     * 
     */
    @JsonProperty("acctTran")
    public String getAcctTran() {
        return acctTran;
    }

    /**
     * Account
     * <p>
     * Lineage reference object : FGRBAKO_ACCT_TRAN
     * 
     */
    @JsonProperty("acctTran")
    public void setAcctTran(String acctTran) {
        this.acctTran = acctTran;
    }

    public TransactionsInProcessStatus100GetRequest withAcctTran(String acctTran) {
        this.acctTran = acctTran;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgCode
     * 
     */
    @JsonProperty("keyblocProgCode")
    public Object getKeyblocProgCode() {
        return keyblocProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgCode
     * 
     */
    @JsonProperty("keyblocProgCode")
    public void setKeyblocProgCode(Object keyblocProgCode) {
        this.keyblocProgCode = keyblocProgCode;
    }

    public TransactionsInProcessStatus100GetRequest withKeyblocProgCode(Object keyblocProgCode) {
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
    public Object getKeyblocAcciCode() {
        return keyblocAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : keyblocAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("keyblocAcciCode")
    public void setKeyblocAcciCode(Object keyblocAcciCode) {
        this.keyblocAcciCode = keyblocAcciCode;
    }

    public TransactionsInProcessStatus100GetRequest withKeyblocAcciCode(Object keyblocAcciCode) {
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
    public Object getKeyblocOrgnCode() {
        return keyblocOrgnCode;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : keyblocOrgnCode
     * 
     */
    @JsonProperty("keyblocOrgnCode")
    public void setKeyblocOrgnCode(Object keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
    }

    public TransactionsInProcessStatus100GetRequest withKeyblocOrgnCode(Object keyblocOrgnCode) {
        this.keyblocOrgnCode = keyblocOrgnCode;
        return this;
    }

    /**
     * YTD Activity
     * <p>
     * Lineage reference object : FGRBAKO_YTD_AMT
     * 
     */
    @JsonProperty("ytdAmt")
    public Double getYtdAmt() {
        return ytdAmt;
    }

    /**
     * YTD Activity
     * <p>
     * Lineage reference object : FGRBAKO_YTD_AMT
     * 
     */
    @JsonProperty("ytdAmt")
    public void setYtdAmt(Double ytdAmt) {
        this.ytdAmt = ytdAmt;
    }

    public TransactionsInProcessStatus100GetRequest withYtdAmt(Double ytdAmt) {
        this.ytdAmt = ytdAmt;
        return this;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : keyblocCmtType
     * 
     */
    @JsonProperty("keyblocCmtType")
    public Object getKeyblocCmtType() {
        return keyblocCmtType;
    }

    /**
     * Commit Type
     * <p>
     * Lineage reference object : keyblocCmtType
     * 
     */
    @JsonProperty("keyblocCmtType")
    public void setKeyblocCmtType(Object keyblocCmtType) {
        this.keyblocCmtType = keyblocCmtType;
    }

    public TransactionsInProcessStatus100GetRequest withKeyblocCmtType(Object keyblocCmtType) {
        this.keyblocCmtType = keyblocCmtType;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FGRBAKO_ORGN_TRAN
     * 
     */
    @JsonProperty("orgnTran")
    public String getOrgnTran() {
        return orgnTran;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : FGRBAKO_ORGN_TRAN
     * 
     */
    @JsonProperty("orgnTran")
    public void setOrgnTran(String orgnTran) {
        this.orgnTran = orgnTran;
    }

    public TransactionsInProcessStatus100GetRequest withOrgnTran(String orgnTran) {
        this.orgnTran = orgnTran;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    public Object getKeyblocFundCode() {
        return keyblocFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : keyblocFundCode
     * 
     */
    @JsonProperty("keyblocFundCode")
    public void setKeyblocFundCode(Object keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
    }

    public TransactionsInProcessStatus100GetRequest withKeyblocFundCode(Object keyblocFundCode) {
        this.keyblocFundCode = keyblocFundCode;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    public Object getKeyblocFsyrCode() {
        return keyblocFsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lineage reference object : keyblocFsyrCode, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * (Required)
     * 
     */
    @JsonProperty("keyblocFsyrCode")
    public void setKeyblocFsyrCode(Object keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
    }

    public TransactionsInProcessStatus100GetRequest withKeyblocFsyrCode(Object keyblocFsyrCode) {
        this.keyblocFsyrCode = keyblocFsyrCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGRBAKO_FUND_TRAN
     * 
     */
    @JsonProperty("fundTran")
    public String getFundTran() {
        return fundTran;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGRBAKO_FUND_TRAN
     * 
     */
    @JsonProperty("fundTran")
    public void setFundTran(String fundTran) {
        this.fundTran = fundTran;
    }

    public TransactionsInProcessStatus100GetRequest withFundTran(String fundTran) {
        this.fundTran = fundTran;
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

    public TransactionsInProcessStatus100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionsInProcessStatus100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayDescription");
        sb.append('=');
        sb.append(((this.displayDescription == null)?"<null>":this.displayDescription));
        sb.append(',');
        sb.append("docNum");
        sb.append('=');
        sb.append(((this.docNum == null)?"<null>":this.docNum));
        sb.append(',');
        sb.append("displaySumRsvr");
        sb.append('=');
        sb.append(((this.displaySumRsvr == null)?"<null>":this.displaySumRsvr));
        sb.append(',');
        sb.append("progTran");
        sb.append('=');
        sb.append(((this.progTran == null)?"<null>":this.progTran));
        sb.append(',');
        sb.append("displaySumAdjt");
        sb.append('=');
        sb.append(((this.displaySumAdjt == null)?"<null>":this.displaySumAdjt));
        sb.append(',');
        sb.append("keyblocAcctCode");
        sb.append('=');
        sb.append(((this.keyblocAcctCode == null)?"<null>":this.keyblocAcctCode));
        sb.append(',');
        sb.append("displayStatus");
        sb.append('=');
        sb.append(((this.displayStatus == null)?"<null>":this.displayStatus));
        sb.append(',');
        sb.append("acctTran");
        sb.append('=');
        sb.append(((this.acctTran == null)?"<null>":this.acctTran));
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
        sb.append("ytdAmt");
        sb.append('=');
        sb.append(((this.ytdAmt == null)?"<null>":this.ytdAmt));
        sb.append(',');
        sb.append("keyblocCmtType");
        sb.append('=');
        sb.append(((this.keyblocCmtType == null)?"<null>":this.keyblocCmtType));
        sb.append(',');
        sb.append("orgnTran");
        sb.append('=');
        sb.append(((this.orgnTran == null)?"<null>":this.orgnTran));
        sb.append(',');
        sb.append("keyblocFundCode");
        sb.append('=');
        sb.append(((this.keyblocFundCode == null)?"<null>":this.keyblocFundCode));
        sb.append(',');
        sb.append("keyblocFsyrCode");
        sb.append('=');
        sb.append(((this.keyblocFsyrCode == null)?"<null>":this.keyblocFsyrCode));
        sb.append(',');
        sb.append("fundTran");
        sb.append('=');
        sb.append(((this.fundTran == null)?"<null>":this.fundTran));
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
        if ((other instanceof TransactionsInProcessStatus100GetRequest) == false) {
            return false;
        }
        TransactionsInProcessStatus100GetRequest rhs = ((TransactionsInProcessStatus100GetRequest) other);
        return (((((((((((((((((((this.displayDescription == rhs.displayDescription)||((this.displayDescription!= null)&&this.displayDescription.equals(rhs.displayDescription)))&&((this.docNum == rhs.docNum)||((this.docNum!= null)&&this.docNum.equals(rhs.docNum))))&&((this.displaySumRsvr == rhs.displaySumRsvr)||((this.displaySumRsvr!= null)&&this.displaySumRsvr.equals(rhs.displaySumRsvr))))&&((this.progTran == rhs.progTran)||((this.progTran!= null)&&this.progTran.equals(rhs.progTran))))&&((this.displaySumAdjt == rhs.displaySumAdjt)||((this.displaySumAdjt!= null)&&this.displaySumAdjt.equals(rhs.displaySumAdjt))))&&((this.keyblocAcctCode == rhs.keyblocAcctCode)||((this.keyblocAcctCode!= null)&&this.keyblocAcctCode.equals(rhs.keyblocAcctCode))))&&((this.displayStatus == rhs.displayStatus)||((this.displayStatus!= null)&&this.displayStatus.equals(rhs.displayStatus))))&&((this.acctTran == rhs.acctTran)||((this.acctTran!= null)&&this.acctTran.equals(rhs.acctTran))))&&((this.keyblocProgCode == rhs.keyblocProgCode)||((this.keyblocProgCode!= null)&&this.keyblocProgCode.equals(rhs.keyblocProgCode))))&&((this.keyblocAcciCode == rhs.keyblocAcciCode)||((this.keyblocAcciCode!= null)&&this.keyblocAcciCode.equals(rhs.keyblocAcciCode))))&&((this.keyblocOrgnCode == rhs.keyblocOrgnCode)||((this.keyblocOrgnCode!= null)&&this.keyblocOrgnCode.equals(rhs.keyblocOrgnCode))))&&((this.ytdAmt == rhs.ytdAmt)||((this.ytdAmt!= null)&&this.ytdAmt.equals(rhs.ytdAmt))))&&((this.keyblocCmtType == rhs.keyblocCmtType)||((this.keyblocCmtType!= null)&&this.keyblocCmtType.equals(rhs.keyblocCmtType))))&&((this.orgnTran == rhs.orgnTran)||((this.orgnTran!= null)&&this.orgnTran.equals(rhs.orgnTran))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblocFundCode == rhs.keyblocFundCode)||((this.keyblocFundCode!= null)&&this.keyblocFundCode.equals(rhs.keyblocFundCode))))&&((this.keyblocFsyrCode == rhs.keyblocFsyrCode)||((this.keyblocFsyrCode!= null)&&this.keyblocFsyrCode.equals(rhs.keyblocFsyrCode))))&&((this.fundTran == rhs.fundTran)||((this.fundTran!= null)&&this.fundTran.equals(rhs.fundTran))));
    }

}
