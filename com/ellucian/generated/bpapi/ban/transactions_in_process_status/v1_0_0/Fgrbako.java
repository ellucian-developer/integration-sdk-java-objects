
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
    "displaySumRsvr",
    "docNum",
    "itemNum",
    "progTran",
    "ytdAmt",
    "seqNum",
    "orgnTran",
    "displaySumAdjt",
    "displayStatus",
    "acctTran",
    "fundTran"
})
@Generated("jsonschema2pojo")
public class Fgrbako {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDescription")
    private String displayDescription;
    /**
     * Commitments
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumRsvr")
    private Double displaySumRsvr;
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
     * Item
     * <p>
     * Lineage reference object : FGRBAKO_ITEM_NUM
     * 
     */
    @JsonProperty("itemNum")
    @JsonPropertyDescription("Lineage reference object : FGRBAKO_ITEM_NUM")
    private Double itemNum;
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
     * YTD Activity
     * <p>
     * Lineage reference object : FGRBAKO_YTD_AMT
     * 
     */
    @JsonProperty("ytdAmt")
    @JsonPropertyDescription("Lineage reference object : FGRBAKO_YTD_AMT")
    private Double ytdAmt;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FGRBAKO_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FGRBAKO_SEQ_NUM")
    private Double seqNum;
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
     * Adjusted Budget
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySumAdjt")
    private Double displaySumAdjt;
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

    public Fgrbako withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
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

    public Fgrbako withDisplaySumRsvr(Double displaySumRsvr) {
        this.displaySumRsvr = displaySumRsvr;
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

    public Fgrbako withDocNum(String docNum) {
        this.docNum = docNum;
        return this;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : FGRBAKO_ITEM_NUM
     * 
     */
    @JsonProperty("itemNum")
    public Double getItemNum() {
        return itemNum;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : FGRBAKO_ITEM_NUM
     * 
     */
    @JsonProperty("itemNum")
    public void setItemNum(Double itemNum) {
        this.itemNum = itemNum;
    }

    public Fgrbako withItemNum(Double itemNum) {
        this.itemNum = itemNum;
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

    public Fgrbako withProgTran(String progTran) {
        this.progTran = progTran;
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

    public Fgrbako withYtdAmt(Double ytdAmt) {
        this.ytdAmt = ytdAmt;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGRBAKO_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public Double getSeqNum() {
        return seqNum;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGRBAKO_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public Fgrbako withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
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

    public Fgrbako withOrgnTran(String orgnTran) {
        this.orgnTran = orgnTran;
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

    public Fgrbako withDisplaySumAdjt(Double displaySumAdjt) {
        this.displaySumAdjt = displaySumAdjt;
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

    public Fgrbako withDisplayStatus(String displayStatus) {
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

    public Fgrbako withAcctTran(String acctTran) {
        this.acctTran = acctTran;
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

    public Fgrbako withFundTran(String fundTran) {
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

    public Fgrbako withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgrbako.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayDescription");
        sb.append('=');
        sb.append(((this.displayDescription == null)?"<null>":this.displayDescription));
        sb.append(',');
        sb.append("displaySumRsvr");
        sb.append('=');
        sb.append(((this.displaySumRsvr == null)?"<null>":this.displaySumRsvr));
        sb.append(',');
        sb.append("docNum");
        sb.append('=');
        sb.append(((this.docNum == null)?"<null>":this.docNum));
        sb.append(',');
        sb.append("itemNum");
        sb.append('=');
        sb.append(((this.itemNum == null)?"<null>":this.itemNum));
        sb.append(',');
        sb.append("progTran");
        sb.append('=');
        sb.append(((this.progTran == null)?"<null>":this.progTran));
        sb.append(',');
        sb.append("ytdAmt");
        sb.append('=');
        sb.append(((this.ytdAmt == null)?"<null>":this.ytdAmt));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("orgnTran");
        sb.append('=');
        sb.append(((this.orgnTran == null)?"<null>":this.orgnTran));
        sb.append(',');
        sb.append("displaySumAdjt");
        sb.append('=');
        sb.append(((this.displaySumAdjt == null)?"<null>":this.displaySumAdjt));
        sb.append(',');
        sb.append("displayStatus");
        sb.append('=');
        sb.append(((this.displayStatus == null)?"<null>":this.displayStatus));
        sb.append(',');
        sb.append("acctTran");
        sb.append('=');
        sb.append(((this.acctTran == null)?"<null>":this.acctTran));
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
        result = ((result* 31)+((this.displaySumRsvr == null)? 0 :this.displaySumRsvr.hashCode()));
        result = ((result* 31)+((this.docNum == null)? 0 :this.docNum.hashCode()));
        result = ((result* 31)+((this.progTran == null)? 0 :this.progTran.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.displaySumAdjt == null)? 0 :this.displaySumAdjt.hashCode()));
        result = ((result* 31)+((this.displayStatus == null)? 0 :this.displayStatus.hashCode()));
        result = ((result* 31)+((this.acctTran == null)? 0 :this.acctTran.hashCode()));
        result = ((result* 31)+((this.itemNum == null)? 0 :this.itemNum.hashCode()));
        result = ((result* 31)+((this.ytdAmt == null)? 0 :this.ytdAmt.hashCode()));
        result = ((result* 31)+((this.orgnTran == null)? 0 :this.orgnTran.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fundTran == null)? 0 :this.fundTran.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgrbako) == false) {
            return false;
        }
        Fgrbako rhs = ((Fgrbako) other);
        return ((((((((((((((this.displayDescription == rhs.displayDescription)||((this.displayDescription!= null)&&this.displayDescription.equals(rhs.displayDescription)))&&((this.displaySumRsvr == rhs.displaySumRsvr)||((this.displaySumRsvr!= null)&&this.displaySumRsvr.equals(rhs.displaySumRsvr))))&&((this.docNum == rhs.docNum)||((this.docNum!= null)&&this.docNum.equals(rhs.docNum))))&&((this.progTran == rhs.progTran)||((this.progTran!= null)&&this.progTran.equals(rhs.progTran))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.displaySumAdjt == rhs.displaySumAdjt)||((this.displaySumAdjt!= null)&&this.displaySumAdjt.equals(rhs.displaySumAdjt))))&&((this.displayStatus == rhs.displayStatus)||((this.displayStatus!= null)&&this.displayStatus.equals(rhs.displayStatus))))&&((this.acctTran == rhs.acctTran)||((this.acctTran!= null)&&this.acctTran.equals(rhs.acctTran))))&&((this.itemNum == rhs.itemNum)||((this.itemNum!= null)&&this.itemNum.equals(rhs.itemNum))))&&((this.ytdAmt == rhs.ytdAmt)||((this.ytdAmt!= null)&&this.ytdAmt.equals(rhs.ytdAmt))))&&((this.orgnTran == rhs.orgnTran)||((this.orgnTran!= null)&&this.orgnTran.equals(rhs.orgnTran))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fundTran == rhs.fundTran)||((this.fundTran!= null)&&this.fundTran.equals(rhs.fundTran))));
    }

}
