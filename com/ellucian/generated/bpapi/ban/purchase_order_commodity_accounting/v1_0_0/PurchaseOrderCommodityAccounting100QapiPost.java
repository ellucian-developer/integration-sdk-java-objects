
package com.ellucian.generated.bpapi.ban.purchase_order_commodity_accounting.v1_0_0;

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
    "displayPohdCode",
    "seqNum",
    "coasCode",
    "fsyrCode",
    "acciCode",
    "fundCode",
    "orgnCode",
    "acctCode",
    "progCode",
    "actvCode",
    "locnCode",
    "projCode",
    "nsfOverrideInd",
    "nsfSuspInd",
    "approvedPct",
    "amt",
    "discountPct",
    "discAmt",
    "addlPct",
    "addlChrgAmt",
    "taxPct",
    "taxAmt"
})
@Generated("jsonschema2pojo")
public class PurchaseOrderCommodityAccounting100QapiPost {

    @JsonProperty("displayPohdCode")
    private String displayPohdCode;
    /**
     * FOAPAL
     * <p>
     * Lineage reference object : FPRPODA_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_SEQ_NUM")
    private Double seqNum;
    /**
     * COA
     * <p>
     * Lineage reference object : FPRPODA_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Yr
     * <p>
     * Lineage reference object : FPRPODA_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("fsyrCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd")
    private String fsyrCode;
    /**
     * Index
     * <p>
     * Lineage reference object : FPRPODA_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_ACCI_CODE, Lookup lineage reference object : ftvacci")
    private String acciCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : FPRPODA_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_FUND_CODE")
    private String fundCode;
    /**
     * Orgn
     * <p>
     * Lineage reference object : FPRPODA_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_ORGN_CODE")
    private String orgnCode;
    /**
     * Acct
     * <p>
     * Lineage reference object : FPRPODA_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_ACCT_CODE")
    private String acctCode;
    /**
     * Prog
     * <p>
     * Lineage reference object : FPRPODA_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_PROG_CODE")
    private String progCode;
    /**
     * Actv
     * <p>
     * Lineage reference object : FPRPODA_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_ACTV_CODE")
    private String actvCode;
    /**
     * Locn
     * <p>
     * Lineage reference object : FPRPODA_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_LOCN_CODE")
    private String locnCode;
    /**
     * Proj
     * <p>
     * Lineage reference object : FPRPODA_PROJ_CODE, Lookup lineage reference object : ftvproj
     * 
     */
    @JsonProperty("projCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_PROJ_CODE, Lookup lineage reference object : ftvproj")
    private String projCode;
    /**
     * NSF Override
     * <p>
     * Lineage reference object : FPRPODA_NSF_OVERRIDE_IND
     * 
     */
    @JsonProperty("nsfOverrideInd")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_NSF_OVERRIDE_IND")
    private String nsfOverrideInd;
    /**
     * NSF Suspense
     * <p>
     * Lineage reference object : FPRPODA_NSF_SUSP_IND
     * 
     */
    @JsonProperty("nsfSuspInd")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_NSF_SUSP_IND")
    private String nsfSuspInd;
    @JsonProperty("approvedPct")
    private String approvedPct;
    /**
     * Extended
     * <p>
     * Lineage reference object : FPRPODA_AMT
     * 
     */
    @JsonProperty("amt")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_AMT")
    private Double amt;
    @JsonProperty("discountPct")
    private String discountPct;
    /**
     * Discount
     * <p>
     * Lineage reference object : FPRPODA_DISC_AMT
     * 
     */
    @JsonProperty("discAmt")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_DISC_AMT")
    private Double discAmt;
    @JsonProperty("addlPct")
    private String addlPct;
    /**
     * Additional
     * <p>
     * Lineage reference object : FPRPODA_ADDL_CHRG_AMT
     * 
     */
    @JsonProperty("addlChrgAmt")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_ADDL_CHRG_AMT")
    private Double addlChrgAmt;
    @JsonProperty("taxPct")
    private String taxPct;
    /**
     * Tax
     * <p>
     * Lineage reference object : FPRPODA_TAX_AMT
     * 
     */
    @JsonProperty("taxAmt")
    @JsonPropertyDescription("Lineage reference object : FPRPODA_TAX_AMT")
    private Double taxAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayPohdCode")
    public String getDisplayPohdCode() {
        return displayPohdCode;
    }

    @JsonProperty("displayPohdCode")
    public void setDisplayPohdCode(String displayPohdCode) {
        this.displayPohdCode = displayPohdCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withDisplayPohdCode(String displayPohdCode) {
        this.displayPohdCode = displayPohdCode;
        return this;
    }

    /**
     * FOAPAL
     * <p>
     * Lineage reference object : FPRPODA_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public Double getSeqNum() {
        return seqNum;
    }

    /**
     * FOAPAL
     * <p>
     * Lineage reference object : FPRPODA_SEQ_NUM
     * 
     */
    @JsonProperty("seqNum")
    public void setSeqNum(Double seqNum) {
        this.seqNum = seqNum;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withSeqNum(Double seqNum) {
        this.seqNum = seqNum;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FPRPODA_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FPRPODA_COAS_CODE, Lookup lineage reference object : ftvcoas
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Yr
     * <p>
     * Lineage reference object : FPRPODA_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("fsyrCode")
    public String getFsyrCode() {
        return fsyrCode;
    }

    /**
     * Yr
     * <p>
     * Lineage reference object : FPRPODA_FSYR_CODE, Lookup lineage reference object : ftvfspd,ftvfsyr,ftvfspd
     * 
     */
    @JsonProperty("fsyrCode")
    public void setFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withFsyrCode(String fsyrCode) {
        this.fsyrCode = fsyrCode;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FPRPODA_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public String getAcciCode() {
        return acciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : FPRPODA_ACCI_CODE, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("acciCode")
    public void setAcciCode(String acciCode) {
        this.acciCode = acciCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withAcciCode(String acciCode) {
        this.acciCode = acciCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FPRPODA_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : FPRPODA_FUND_CODE
     * 
     */
    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FPRPODA_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public String getOrgnCode() {
        return orgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : FPRPODA_ORGN_CODE
     * 
     */
    @JsonProperty("orgnCode")
    public void setOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withOrgnCode(String orgnCode) {
        this.orgnCode = orgnCode;
        return this;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FPRPODA_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : FPRPODA_ACCT_CODE
     * 
     */
    @JsonProperty("acctCode")
    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withAcctCode(String acctCode) {
        this.acctCode = acctCode;
        return this;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FPRPODA_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : FPRPODA_PROG_CODE
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FPRPODA_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public String getActvCode() {
        return actvCode;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : FPRPODA_ACTV_CODE
     * 
     */
    @JsonProperty("actvCode")
    public void setActvCode(String actvCode) {
        this.actvCode = actvCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withActvCode(String actvCode) {
        this.actvCode = actvCode;
        return this;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FPRPODA_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : FPRPODA_LOCN_CODE
     * 
     */
    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FPRPODA_PROJ_CODE, Lookup lineage reference object : ftvproj
     * 
     */
    @JsonProperty("projCode")
    public String getProjCode() {
        return projCode;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : FPRPODA_PROJ_CODE, Lookup lineage reference object : ftvproj
     * 
     */
    @JsonProperty("projCode")
    public void setProjCode(String projCode) {
        this.projCode = projCode;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withProjCode(String projCode) {
        this.projCode = projCode;
        return this;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FPRPODA_NSF_OVERRIDE_IND
     * 
     */
    @JsonProperty("nsfOverrideInd")
    public String getNsfOverrideInd() {
        return nsfOverrideInd;
    }

    /**
     * NSF Override
     * <p>
     * Lineage reference object : FPRPODA_NSF_OVERRIDE_IND
     * 
     */
    @JsonProperty("nsfOverrideInd")
    public void setNsfOverrideInd(String nsfOverrideInd) {
        this.nsfOverrideInd = nsfOverrideInd;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withNsfOverrideInd(String nsfOverrideInd) {
        this.nsfOverrideInd = nsfOverrideInd;
        return this;
    }

    /**
     * NSF Suspense
     * <p>
     * Lineage reference object : FPRPODA_NSF_SUSP_IND
     * 
     */
    @JsonProperty("nsfSuspInd")
    public String getNsfSuspInd() {
        return nsfSuspInd;
    }

    /**
     * NSF Suspense
     * <p>
     * Lineage reference object : FPRPODA_NSF_SUSP_IND
     * 
     */
    @JsonProperty("nsfSuspInd")
    public void setNsfSuspInd(String nsfSuspInd) {
        this.nsfSuspInd = nsfSuspInd;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withNsfSuspInd(String nsfSuspInd) {
        this.nsfSuspInd = nsfSuspInd;
        return this;
    }

    @JsonProperty("approvedPct")
    public String getApprovedPct() {
        return approvedPct;
    }

    @JsonProperty("approvedPct")
    public void setApprovedPct(String approvedPct) {
        this.approvedPct = approvedPct;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withApprovedPct(String approvedPct) {
        this.approvedPct = approvedPct;
        return this;
    }

    /**
     * Extended
     * <p>
     * Lineage reference object : FPRPODA_AMT
     * 
     */
    @JsonProperty("amt")
    public Double getAmt() {
        return amt;
    }

    /**
     * Extended
     * <p>
     * Lineage reference object : FPRPODA_AMT
     * 
     */
    @JsonProperty("amt")
    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withAmt(Double amt) {
        this.amt = amt;
        return this;
    }

    @JsonProperty("discountPct")
    public String getDiscountPct() {
        return discountPct;
    }

    @JsonProperty("discountPct")
    public void setDiscountPct(String discountPct) {
        this.discountPct = discountPct;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withDiscountPct(String discountPct) {
        this.discountPct = discountPct;
        return this;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPRPODA_DISC_AMT
     * 
     */
    @JsonProperty("discAmt")
    public Double getDiscAmt() {
        return discAmt;
    }

    /**
     * Discount
     * <p>
     * Lineage reference object : FPRPODA_DISC_AMT
     * 
     */
    @JsonProperty("discAmt")
    public void setDiscAmt(Double discAmt) {
        this.discAmt = discAmt;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withDiscAmt(Double discAmt) {
        this.discAmt = discAmt;
        return this;
    }

    @JsonProperty("addlPct")
    public String getAddlPct() {
        return addlPct;
    }

    @JsonProperty("addlPct")
    public void setAddlPct(String addlPct) {
        this.addlPct = addlPct;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withAddlPct(String addlPct) {
        this.addlPct = addlPct;
        return this;
    }

    /**
     * Additional
     * <p>
     * Lineage reference object : FPRPODA_ADDL_CHRG_AMT
     * 
     */
    @JsonProperty("addlChrgAmt")
    public Double getAddlChrgAmt() {
        return addlChrgAmt;
    }

    /**
     * Additional
     * <p>
     * Lineage reference object : FPRPODA_ADDL_CHRG_AMT
     * 
     */
    @JsonProperty("addlChrgAmt")
    public void setAddlChrgAmt(Double addlChrgAmt) {
        this.addlChrgAmt = addlChrgAmt;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withAddlChrgAmt(Double addlChrgAmt) {
        this.addlChrgAmt = addlChrgAmt;
        return this;
    }

    @JsonProperty("taxPct")
    public String getTaxPct() {
        return taxPct;
    }

    @JsonProperty("taxPct")
    public void setTaxPct(String taxPct) {
        this.taxPct = taxPct;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withTaxPct(String taxPct) {
        this.taxPct = taxPct;
        return this;
    }

    /**
     * Tax
     * <p>
     * Lineage reference object : FPRPODA_TAX_AMT
     * 
     */
    @JsonProperty("taxAmt")
    public Double getTaxAmt() {
        return taxAmt;
    }

    /**
     * Tax
     * <p>
     * Lineage reference object : FPRPODA_TAX_AMT
     * 
     */
    @JsonProperty("taxAmt")
    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public PurchaseOrderCommodityAccounting100QapiPost withTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
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

    public PurchaseOrderCommodityAccounting100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrderCommodityAccounting100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayPohdCode");
        sb.append('=');
        sb.append(((this.displayPohdCode == null)?"<null>":this.displayPohdCode));
        sb.append(',');
        sb.append("seqNum");
        sb.append('=');
        sb.append(((this.seqNum == null)?"<null>":this.seqNum));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("fsyrCode");
        sb.append('=');
        sb.append(((this.fsyrCode == null)?"<null>":this.fsyrCode));
        sb.append(',');
        sb.append("acciCode");
        sb.append('=');
        sb.append(((this.acciCode == null)?"<null>":this.acciCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("orgnCode");
        sb.append('=');
        sb.append(((this.orgnCode == null)?"<null>":this.orgnCode));
        sb.append(',');
        sb.append("acctCode");
        sb.append('=');
        sb.append(((this.acctCode == null)?"<null>":this.acctCode));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("actvCode");
        sb.append('=');
        sb.append(((this.actvCode == null)?"<null>":this.actvCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("projCode");
        sb.append('=');
        sb.append(((this.projCode == null)?"<null>":this.projCode));
        sb.append(',');
        sb.append("nsfOverrideInd");
        sb.append('=');
        sb.append(((this.nsfOverrideInd == null)?"<null>":this.nsfOverrideInd));
        sb.append(',');
        sb.append("nsfSuspInd");
        sb.append('=');
        sb.append(((this.nsfSuspInd == null)?"<null>":this.nsfSuspInd));
        sb.append(',');
        sb.append("approvedPct");
        sb.append('=');
        sb.append(((this.approvedPct == null)?"<null>":this.approvedPct));
        sb.append(',');
        sb.append("amt");
        sb.append('=');
        sb.append(((this.amt == null)?"<null>":this.amt));
        sb.append(',');
        sb.append("discountPct");
        sb.append('=');
        sb.append(((this.discountPct == null)?"<null>":this.discountPct));
        sb.append(',');
        sb.append("discAmt");
        sb.append('=');
        sb.append(((this.discAmt == null)?"<null>":this.discAmt));
        sb.append(',');
        sb.append("addlPct");
        sb.append('=');
        sb.append(((this.addlPct == null)?"<null>":this.addlPct));
        sb.append(',');
        sb.append("addlChrgAmt");
        sb.append('=');
        sb.append(((this.addlChrgAmt == null)?"<null>":this.addlChrgAmt));
        sb.append(',');
        sb.append("taxPct");
        sb.append('=');
        sb.append(((this.taxPct == null)?"<null>":this.taxPct));
        sb.append(',');
        sb.append("taxAmt");
        sb.append('=');
        sb.append(((this.taxAmt == null)?"<null>":this.taxAmt));
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
        result = ((result* 31)+((this.addlChrgAmt == null)? 0 :this.addlChrgAmt.hashCode()));
        result = ((result* 31)+((this.addlPct == null)? 0 :this.addlPct.hashCode()));
        result = ((result* 31)+((this.projCode == null)? 0 :this.projCode.hashCode()));
        result = ((result* 31)+((this.seqNum == null)? 0 :this.seqNum.hashCode()));
        result = ((result* 31)+((this.nsfSuspInd == null)? 0 :this.nsfSuspInd.hashCode()));
        result = ((result* 31)+((this.discountPct == null)? 0 :this.discountPct.hashCode()));
        result = ((result* 31)+((this.acciCode == null)? 0 :this.acciCode.hashCode()));
        result = ((result* 31)+((this.approvedPct == null)? 0 :this.approvedPct.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.amt == null)? 0 :this.amt.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.orgnCode == null)? 0 :this.orgnCode.hashCode()));
        result = ((result* 31)+((this.acctCode == null)? 0 :this.acctCode.hashCode()));
        result = ((result* 31)+((this.discAmt == null)? 0 :this.discAmt.hashCode()));
        result = ((result* 31)+((this.nsfOverrideInd == null)? 0 :this.nsfOverrideInd.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.fsyrCode == null)? 0 :this.fsyrCode.hashCode()));
        result = ((result* 31)+((this.taxPct == null)? 0 :this.taxPct.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actvCode == null)? 0 :this.actvCode.hashCode()));
        result = ((result* 31)+((this.taxAmt == null)? 0 :this.taxAmt.hashCode()));
        result = ((result* 31)+((this.displayPohdCode == null)? 0 :this.displayPohdCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrderCommodityAccounting100QapiPost) == false) {
            return false;
        }
        PurchaseOrderCommodityAccounting100QapiPost rhs = ((PurchaseOrderCommodityAccounting100QapiPost) other);
        return ((((((((((((((((((((((((this.addlChrgAmt == rhs.addlChrgAmt)||((this.addlChrgAmt!= null)&&this.addlChrgAmt.equals(rhs.addlChrgAmt)))&&((this.addlPct == rhs.addlPct)||((this.addlPct!= null)&&this.addlPct.equals(rhs.addlPct))))&&((this.projCode == rhs.projCode)||((this.projCode!= null)&&this.projCode.equals(rhs.projCode))))&&((this.seqNum == rhs.seqNum)||((this.seqNum!= null)&&this.seqNum.equals(rhs.seqNum))))&&((this.nsfSuspInd == rhs.nsfSuspInd)||((this.nsfSuspInd!= null)&&this.nsfSuspInd.equals(rhs.nsfSuspInd))))&&((this.discountPct == rhs.discountPct)||((this.discountPct!= null)&&this.discountPct.equals(rhs.discountPct))))&&((this.acciCode == rhs.acciCode)||((this.acciCode!= null)&&this.acciCode.equals(rhs.acciCode))))&&((this.approvedPct == rhs.approvedPct)||((this.approvedPct!= null)&&this.approvedPct.equals(rhs.approvedPct))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.amt == rhs.amt)||((this.amt!= null)&&this.amt.equals(rhs.amt))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.orgnCode == rhs.orgnCode)||((this.orgnCode!= null)&&this.orgnCode.equals(rhs.orgnCode))))&&((this.acctCode == rhs.acctCode)||((this.acctCode!= null)&&this.acctCode.equals(rhs.acctCode))))&&((this.discAmt == rhs.discAmt)||((this.discAmt!= null)&&this.discAmt.equals(rhs.discAmt))))&&((this.nsfOverrideInd == rhs.nsfOverrideInd)||((this.nsfOverrideInd!= null)&&this.nsfOverrideInd.equals(rhs.nsfOverrideInd))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.fsyrCode == rhs.fsyrCode)||((this.fsyrCode!= null)&&this.fsyrCode.equals(rhs.fsyrCode))))&&((this.taxPct == rhs.taxPct)||((this.taxPct!= null)&&this.taxPct.equals(rhs.taxPct))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actvCode == rhs.actvCode)||((this.actvCode!= null)&&this.actvCode.equals(rhs.actvCode))))&&((this.taxAmt == rhs.taxAmt)||((this.taxAmt!= null)&&this.taxAmt.equals(rhs.taxAmt))))&&((this.displayPohdCode == rhs.displayPohdCode)||((this.displayPohdCode!= null)&&this.displayPohdCode.equals(rhs.displayPohdCode))));
    }

}
