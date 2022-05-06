
package com.ellucian.generated.bpapi.ban.detail_encumbrance_activity.v1_0_0;

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
    "item",
    "prjdCode",
    "totLiquidations",
    "seqNum",
    "acciCode",
    "coasCode",
    "fgbencpFsyrCode",
    "locnCode",
    "acctCode",
    "orgnCode",
    "origEncbAmt",
    "sequenceBalance",
    "fundCode",
    "cmtType",
    "progCode",
    "itemDescription",
    "actvCode",
    "status"
})
@Generated("jsonschema2pojo")
public class Fgbencd {

    /**
     * Item
     * <p>
     * Lineage reference object : FGBENCD_ITEM
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_ITEM")
    private Double item;
    /**
     * Proj
     * <p>
     * Lineage reference object : FGBENCD_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_PRJD_CODE")
    private String prjdCode;
    /**
     * Liquidation
     * <p>
     * 
     * 
     */
    @JsonProperty("totLiquidations")
    private Double totLiquidations;
    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBENCD_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_SEQ_NUM")
    private Double seqNum;
    /**
     * Index
     * <p>
     * Lineage reference object : FGBENCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String acciCode;
    /**
     * COA
     * <p>
     * Lineage reference object : FGBENCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Fiscal Year
     * <p>
     * Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("fgbencpFsyrCode")
    @JsonPropertyDescription("Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private String fgbencpFsyrCode;
    /**
     * Locn
     * <p>
     * Lineage reference object : FGBENCD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_LOCN_CODE")
    private String locnCode;
    /**
     * Acct
     * <p>
     * Lineage reference object : FGBENCD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_ACCT_CODE")
    private String acctCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBENCD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_ORGN_CODE")
    private String orgnCode;
    /**
     * Encumbrance
     * <p>
     * 
     * 
     */
    @JsonProperty("origEncbAmt")
    private Double origEncbAmt;
    /**
     * Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("sequenceBalance")
    private Double sequenceBalance;
    /**
     * Fund
     * <p>
     * Lineage reference object : FGBENCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_FUND_CODE")
    private String fundCode;
    /**
     * Commit Indicator
     * <p>
     * Lineage reference object : FGBENCD_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_CMT_TYPE")
    private String cmtType;
    /**
     * Prog
     * <p>
     * Lineage reference object : FGBENCD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_PROG_CODE")
    private String progCode;
    @JsonProperty("itemDescription")
    private String itemDescription;
    /**
     * Actv
     * <p>
     * Lineage reference object : FGBENCD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_ACTV_CODE")
    private String actvCode;
    /**
     * Status
     * <p>
     * Lineage reference object : FGBENCD_STATUS
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : FGBENCD_STATUS")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Item
     * <p>
     * Lineage reference object : FGBENCD_ITEM
     * 
     */
    @JsonProperty("item")
    public Double getItem() {
        return item;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : FGBENCD_ITEM
     * 
     */
    @JsonProperty("item")
    public void setItem(Double item) {
        this.item = item;
    }

    public Fgbencd withItem(Double item) {
        this.item = item;
        return this;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FGBENCD_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    public String getPrjdCode() {
        return prjdCode;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FGBENCD_PRJD_CODE
     * 
     */
    @JsonProperty("prjdCode")
    public void setPrjdCode(String prjdCode) {
        this.prjdCode = prjdCode;
    }

    public Fgbencd withPrjdCode(String prjdCode) {
        this.prjdCode = prjdCode;
        return this;
    }

    /**
     * Liquidation
     * <p>
     * 
     * 
     */
    @JsonProperty("totLiquidations")
    public Double getTotLiquidations() {
        return totLiquidations;
    }

    /**
     * Liquidation
     * <p>
     * 
     * 
     */
    @JsonProperty("totLiquidations")
    public void setTotLiquidations(Double totLiquidations) {
        this.totLiquidations = totLiquidations;
    }

    public Fgbencd withTotLiquidations(Double totLiquidations) {
        this.totLiquidations = totLiquidations;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBENCD_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public Double getSeqNum() {
        return seqNum;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : FGBENCD_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public Fgbencd withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBENCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FGBENCD_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public Fgbencd withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBENCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FGBENCD_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public Fgbencd withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Fiscal Year
     * <p>
     * Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("fgbencpFsyrCode")
    public String getFgbencpFsyrCode() {
        return fgbencpFsyrCode;
    }

    /**
     * Fiscal Year
     * <p>
     * Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("fgbencpFsyrCode")
    public void setFgbencpFsyrCode(String fgbencpFsyrCode) {
        this.fgbencpFsyrCode = fgbencpFsyrCode;
    }

    public Fgbencd withFgbencpFsyrCode(String fgbencpFsyrCode) {
        this.fgbencpFsyrCode = fgbencpFsyrCode;
        return this;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBENCD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FGBENCD_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public Fgbencd withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBENCD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FGBENCD_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public Fgbencd withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBENCD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FGBENCD_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public Fgbencd withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Encumbrance
     * <p>
     * 
     * 
     */
    @JsonProperty("origEncbAmt")
    public Double getOrigEncbAmt() {
        return origEncbAmt;
    }

    /**
     * Encumbrance
     * <p>
     * 
     * 
     */
    @JsonProperty("origEncbAmt")
    public void setOrigEncbAmt(Double origEncbAmt) {
        this.origEncbAmt = origEncbAmt;
    }

    public Fgbencd withOrigEncbAmt(Double origEncbAmt) {
        this.origEncbAmt = origEncbAmt;
        return this;
    }

    /**
     * Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("sequenceBalance")
    public Double getSequenceBalance() {
        return sequenceBalance;
    }

    /**
     * Balance
     * <p>
     * 
     * 
     */
    @JsonProperty("sequenceBalance")
    public void setSequenceBalance(Double sequenceBalance) {
        this.sequenceBalance = sequenceBalance;
    }

    public Fgbencd withSequenceBalance(Double sequenceBalance) {
        this.sequenceBalance = sequenceBalance;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBENCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FGBENCD_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public Fgbencd withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Commit Indicator
     * <p>
     * Lineage reference object : FGBENCD_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    public String getCmtType() {
        return cmtType;
    }

    /**
     * Commit Indicator
     * <p>
     * Lineage reference object : FGBENCD_CMT_TYPE
     * 
     */
    @JsonProperty("cmtType")
    public void setCmtType(String cmtType) {
        this.cmtType = cmtType;
    }

    public Fgbencd withCmtType(String cmtType) {
        this.cmtType = cmtType;
        return this;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBENCD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FGBENCD_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public Fgbencd withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    @JsonProperty("itemDescription")
    public String getItemDescription() {
        return itemDescription;
    }

    @JsonProperty("itemDescription")
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Fgbencd withItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBENCD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FGBENCD_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public Fgbencd withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBENCD_STATUS
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FGBENCD_STATUS
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Fgbencd withStatus(String status) {
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

    public Fgbencd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fgbencd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("prjdCode");
        sb.append('=');
        sb.append(((this.prjdCode == null)?"<null>":this.prjdCode));
        sb.append(',');
        sb.append("totLiquidations");
        sb.append('=');
        sb.append(((this.totLiquidations == null)?"<null>":this.totLiquidations));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("fgbencpFsyrCode");
        sb.append('=');
        sb.append(((this.fgbencpFsyrCode == null)?"<null>":this.fgbencpFsyrCode));
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
        sb.append("origEncbAmt");
        sb.append('=');
        sb.append(((this.origEncbAmt == null)?"<null>":this.origEncbAmt));
        sb.append(',');
        sb.append("sequenceBalance");
        sb.append('=');
        sb.append(((this.sequenceBalance == null)?"<null>":this.sequenceBalance));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("cmtType");
        sb.append('=');
        sb.append(((this.cmtType == null)?"<null>":this.cmtType));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("itemDescription");
        sb.append('=');
        sb.append(((this.itemDescription == null)?"<null>":this.itemDescription));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
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
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.prjdCode == null)? 0 :this.prjdCode.hashCode()));
        result = ((result* 31)+((this.totLiquidations == null)? 0 :this.totLiquidations.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.fgbencpFsyrCode == null)? 0 :this.fgbencpFsyrCode.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.origEncbAmt == null)? 0 :this.origEncbAmt.hashCode()));
        result = ((result* 31)+((this.sequenceBalance == null)? 0 :this.sequenceBalance.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.cmtType == null)? 0 :this.cmtType.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.itemDescription == null)? 0 :this.itemDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fgbencd) == false) {
            return false;
        }
        Fgbencd rhs = ((Fgbencd) other);
        return ((((((((((((((((((((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item)))&&((this.prjdCode == rhs.prjdCode)||((this.prjdCode!= null)&&this.prjdCode.equals(rhs.prjdCode))))&&((this.totLiquidations == rhs.totLiquidations)||((this.totLiquidations!= null)&&this.totLiquidations.equals(rhs.totLiquidations))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.fgbencpFsyrCode == rhs.fgbencpFsyrCode)||((this.fgbencpFsyrCode!= null)&&this.fgbencpFsyrCode.equals(rhs.fgbencpFsyrCode))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.origEncbAmt == rhs.origEncbAmt)||((this.origEncbAmt!= null)&&this.origEncbAmt.equals(rhs.origEncbAmt))))&&((this.sequenceBalance == rhs.sequenceBalance)||((this.sequenceBalance!= null)&&this.sequenceBalance.equals(rhs.sequenceBalance))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.cmtType == rhs.cmtType)||((this.cmtType!= null)&&this.cmtType.equals(rhs.cmtType))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.itemDescription == rhs.itemDescription)||((this.itemDescription!= null)&&this.itemDescription.equals(rhs.itemDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
