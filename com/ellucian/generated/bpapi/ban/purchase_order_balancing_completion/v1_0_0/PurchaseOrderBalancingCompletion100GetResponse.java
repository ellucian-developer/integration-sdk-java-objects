
package com.ellucian.generated.bpapi.ban.purchase_order_balancing_completion.v1_0_0;

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
    "displayCurrCode",
    "apprStatus",
    "headDisc",
    "discStatus",
    "acctDisc",
    "addlStatus",
    "displayCurrDesc",
    "headAppr",
    "acctAppr",
    "commDisc",
    "headTax",
    "acctTax",
    "taxStatus",
    "commAddl",
    "displayConvRate",
    "acctAddl",
    "commAppr",
    "commTax",
    "fpbpohdMatchBlkRequired",
    "headAddl"
})
@Generated("jsonschema2pojo")
public class PurchaseOrderBalancingCompletion100GetResponse {

    /**
     * Currency Code
     * <p>
     * Lineage reference object : displayCurrCode, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("displayCurrCode")
    @JsonPropertyDescription("Lineage reference object : displayCurrCode, Lookup lineage reference object : gtvcurr")
    private String displayCurrCode;
    /**
     * Status
     * <p>
     * Lineage reference object : apprStatus
     * 
     */
    @JsonProperty("apprStatus")
    @JsonPropertyDescription("Lineage reference object : apprStatus")
    private String apprStatus;
    /**
     * Discount Amounts
     * <p>
     * Lineage reference object : headDisc
     * 
     */
    @JsonProperty("headDisc")
    @JsonPropertyDescription("Lineage reference object : headDisc")
    private Double headDisc;
    /**
     * Lineage reference object : discStatus
     * 
     */
    @JsonProperty("discStatus")
    @JsonPropertyDescription("Lineage reference object : discStatus")
    private String discStatus;
    /**
     * Lineage reference object : acctDisc
     * 
     */
    @JsonProperty("acctDisc")
    @JsonPropertyDescription("Lineage reference object : acctDisc")
    private Double acctDisc;
    /**
     * Lineage reference object : addlStatus
     * 
     */
    @JsonProperty("addlStatus")
    @JsonPropertyDescription("Lineage reference object : addlStatus")
    private String addlStatus;
    /**
     * Lineage reference object : displayCurrDesc
     * 
     */
    @JsonProperty("displayCurrDesc")
    @JsonPropertyDescription("Lineage reference object : displayCurrDesc")
    private String displayCurrDesc;
    /**
     * Approved Amounts
     * <p>
     * Lineage reference object : headAppr
     * 
     */
    @JsonProperty("headAppr")
    @JsonPropertyDescription("Lineage reference object : headAppr")
    private Double headAppr;
    /**
     * Accounting
     * <p>
     * Lineage reference object : acctAppr
     * 
     */
    @JsonProperty("acctAppr")
    @JsonPropertyDescription("Lineage reference object : acctAppr")
    private Double acctAppr;
    /**
     * Lineage reference object : commDisc
     * 
     */
    @JsonProperty("commDisc")
    @JsonPropertyDescription("Lineage reference object : commDisc")
    private Double commDisc;
    /**
     * Tax Amounts
     * <p>
     * Lineage reference object : headTax
     * 
     */
    @JsonProperty("headTax")
    @JsonPropertyDescription("Lineage reference object : headTax")
    private Double headTax;
    /**
     * Lineage reference object : acctTax
     * 
     */
    @JsonProperty("acctTax")
    @JsonPropertyDescription("Lineage reference object : acctTax")
    private Double acctTax;
    /**
     * Lineage reference object : taxStatus
     * 
     */
    @JsonProperty("taxStatus")
    @JsonPropertyDescription("Lineage reference object : taxStatus")
    private String taxStatus;
    /**
     * Lineage reference object : commAddl
     * 
     */
    @JsonProperty("commAddl")
    @JsonPropertyDescription("Lineage reference object : commAddl")
    private Double commAddl;
    /**
     * Exchange Rate
     * <p>
     * Lineage reference object : displayConvRate
     * 
     */
    @JsonProperty("displayConvRate")
    @JsonPropertyDescription("Lineage reference object : displayConvRate")
    private Double displayConvRate;
    /**
     * Lineage reference object : acctAddl
     * 
     */
    @JsonProperty("acctAddl")
    @JsonPropertyDescription("Lineage reference object : acctAddl")
    private Double acctAddl;
    /**
     * Commodity
     * <p>
     * Lineage reference object : commAppr
     * 
     */
    @JsonProperty("commAppr")
    @JsonPropertyDescription("Lineage reference object : commAppr")
    private Double commAppr;
    /**
     * Lineage reference object : commTax
     * 
     */
    @JsonProperty("commTax")
    @JsonPropertyDescription("Lineage reference object : commTax")
    private Double commTax;
    /**
     * Lineage reference object : fpbpohdMatchBlkRequired
     * (Required)
     * 
     */
    @JsonProperty("fpbpohdMatchBlkRequired")
    @JsonPropertyDescription("Lineage reference object : fpbpohdMatchBlkRequired")
    private String fpbpohdMatchBlkRequired;
    /**
     * Additional Amounts
     * <p>
     * Lineage reference object : headAddl
     * 
     */
    @JsonProperty("headAddl")
    @JsonPropertyDescription("Lineage reference object : headAddl")
    private Double headAddl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Currency Code
     * <p>
     * Lineage reference object : displayCurrCode, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("displayCurrCode")
    public String getDisplayCurrCode() {
        return displayCurrCode;
    }

    /**
     * Currency Code
     * <p>
     * Lineage reference object : displayCurrCode, Lookup lineage reference object : gtvcurr
     * 
     */
    @JsonProperty("displayCurrCode")
    public void setDisplayCurrCode(String displayCurrCode) {
        this.displayCurrCode = displayCurrCode;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withDisplayCurrCode(String displayCurrCode) {
        this.displayCurrCode = displayCurrCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : apprStatus
     * 
     */
    @JsonProperty("apprStatus")
    public String getApprStatus() {
        return apprStatus;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : apprStatus
     * 
     */
    @JsonProperty("apprStatus")
    public void setApprStatus(String apprStatus) {
        this.apprStatus = apprStatus;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withApprStatus(String apprStatus) {
        this.apprStatus = apprStatus;
        return this;
    }

    /**
     * Discount Amounts
     * <p>
     * Lineage reference object : headDisc
     * 
     */
    @JsonProperty("headDisc")
    public Double getHeadDisc() {
        return headDisc;
    }

    /**
     * Discount Amounts
     * <p>
     * Lineage reference object : headDisc
     * 
     */
    @JsonProperty("headDisc")
    public void setHeadDisc(Double headDisc) {
        this.headDisc = headDisc;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withHeadDisc(Double headDisc) {
        this.headDisc = headDisc;
        return this;
    }

    /**
     * Lineage reference object : discStatus
     * 
     */
    @JsonProperty("discStatus")
    public String getDiscStatus() {
        return discStatus;
    }

    /**
     * Lineage reference object : discStatus
     * 
     */
    @JsonProperty("discStatus")
    public void setDiscStatus(String discStatus) {
        this.discStatus = discStatus;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withDiscStatus(String discStatus) {
        this.discStatus = discStatus;
        return this;
    }

    /**
     * Lineage reference object : acctDisc
     * 
     */
    @JsonProperty("acctDisc")
    public Double getAcctDisc() {
        return acctDisc;
    }

    /**
     * Lineage reference object : acctDisc
     * 
     */
    @JsonProperty("acctDisc")
    public void setAcctDisc(Double acctDisc) {
        this.acctDisc = acctDisc;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withAcctDisc(Double acctDisc) {
        this.acctDisc = acctDisc;
        return this;
    }

    /**
     * Lineage reference object : addlStatus
     * 
     */
    @JsonProperty("addlStatus")
    public String getAddlStatus() {
        return addlStatus;
    }

    /**
     * Lineage reference object : addlStatus
     * 
     */
    @JsonProperty("addlStatus")
    public void setAddlStatus(String addlStatus) {
        this.addlStatus = addlStatus;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withAddlStatus(String addlStatus) {
        this.addlStatus = addlStatus;
        return this;
    }

    /**
     * Lineage reference object : displayCurrDesc
     * 
     */
    @JsonProperty("displayCurrDesc")
    public String getDisplayCurrDesc() {
        return displayCurrDesc;
    }

    /**
     * Lineage reference object : displayCurrDesc
     * 
     */
    @JsonProperty("displayCurrDesc")
    public void setDisplayCurrDesc(String displayCurrDesc) {
        this.displayCurrDesc = displayCurrDesc;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withDisplayCurrDesc(String displayCurrDesc) {
        this.displayCurrDesc = displayCurrDesc;
        return this;
    }

    /**
     * Approved Amounts
     * <p>
     * Lineage reference object : headAppr
     * 
     */
    @JsonProperty("headAppr")
    public Double getHeadAppr() {
        return headAppr;
    }

    /**
     * Approved Amounts
     * <p>
     * Lineage reference object : headAppr
     * 
     */
    @JsonProperty("headAppr")
    public void setHeadAppr(Double headAppr) {
        this.headAppr = headAppr;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withHeadAppr(Double headAppr) {
        this.headAppr = headAppr;
        return this;
    }

    /**
     * Accounting
     * <p>
     * Lineage reference object : acctAppr
     * 
     */
    @JsonProperty("acctAppr")
    public Double getAcctAppr() {
        return acctAppr;
    }

    /**
     * Accounting
     * <p>
     * Lineage reference object : acctAppr
     * 
     */
    @JsonProperty("acctAppr")
    public void setAcctAppr(Double acctAppr) {
        this.acctAppr = acctAppr;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withAcctAppr(Double acctAppr) {
        this.acctAppr = acctAppr;
        return this;
    }

    /**
     * Lineage reference object : commDisc
     * 
     */
    @JsonProperty("commDisc")
    public Double getCommDisc() {
        return commDisc;
    }

    /**
     * Lineage reference object : commDisc
     * 
     */
    @JsonProperty("commDisc")
    public void setCommDisc(Double commDisc) {
        this.commDisc = commDisc;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withCommDisc(Double commDisc) {
        this.commDisc = commDisc;
        return this;
    }

    /**
     * Tax Amounts
     * <p>
     * Lineage reference object : headTax
     * 
     */
    @JsonProperty("headTax")
    public Double getHeadTax() {
        return headTax;
    }

    /**
     * Tax Amounts
     * <p>
     * Lineage reference object : headTax
     * 
     */
    @JsonProperty("headTax")
    public void setHeadTax(Double headTax) {
        this.headTax = headTax;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withHeadTax(Double headTax) {
        this.headTax = headTax;
        return this;
    }

    /**
     * Lineage reference object : acctTax
     * 
     */
    @JsonProperty("acctTax")
    public Double getAcctTax() {
        return acctTax;
    }

    /**
     * Lineage reference object : acctTax
     * 
     */
    @JsonProperty("acctTax")
    public void setAcctTax(Double acctTax) {
        this.acctTax = acctTax;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withAcctTax(Double acctTax) {
        this.acctTax = acctTax;
        return this;
    }

    /**
     * Lineage reference object : taxStatus
     * 
     */
    @JsonProperty("taxStatus")
    public String getTaxStatus() {
        return taxStatus;
    }

    /**
     * Lineage reference object : taxStatus
     * 
     */
    @JsonProperty("taxStatus")
    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
        return this;
    }

    /**
     * Lineage reference object : commAddl
     * 
     */
    @JsonProperty("commAddl")
    public Double getCommAddl() {
        return commAddl;
    }

    /**
     * Lineage reference object : commAddl
     * 
     */
    @JsonProperty("commAddl")
    public void setCommAddl(Double commAddl) {
        this.commAddl = commAddl;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withCommAddl(Double commAddl) {
        this.commAddl = commAddl;
        return this;
    }

    /**
     * Exchange Rate
     * <p>
     * Lineage reference object : displayConvRate
     * 
     */
    @JsonProperty("displayConvRate")
    public Double getDisplayConvRate() {
        return displayConvRate;
    }

    /**
     * Exchange Rate
     * <p>
     * Lineage reference object : displayConvRate
     * 
     */
    @JsonProperty("displayConvRate")
    public void setDisplayConvRate(Double displayConvRate) {
        this.displayConvRate = displayConvRate;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withDisplayConvRate(Double displayConvRate) {
        this.displayConvRate = displayConvRate;
        return this;
    }

    /**
     * Lineage reference object : acctAddl
     * 
     */
    @JsonProperty("acctAddl")
    public Double getAcctAddl() {
        return acctAddl;
    }

    /**
     * Lineage reference object : acctAddl
     * 
     */
    @JsonProperty("acctAddl")
    public void setAcctAddl(Double acctAddl) {
        this.acctAddl = acctAddl;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withAcctAddl(Double acctAddl) {
        this.acctAddl = acctAddl;
        return this;
    }

    /**
     * Commodity
     * <p>
     * Lineage reference object : commAppr
     * 
     */
    @JsonProperty("commAppr")
    public Double getCommAppr() {
        return commAppr;
    }

    /**
     * Commodity
     * <p>
     * Lineage reference object : commAppr
     * 
     */
    @JsonProperty("commAppr")
    public void setCommAppr(Double commAppr) {
        this.commAppr = commAppr;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withCommAppr(Double commAppr) {
        this.commAppr = commAppr;
        return this;
    }

    /**
     * Lineage reference object : commTax
     * 
     */
    @JsonProperty("commTax")
    public Double getCommTax() {
        return commTax;
    }

    /**
     * Lineage reference object : commTax
     * 
     */
    @JsonProperty("commTax")
    public void setCommTax(Double commTax) {
        this.commTax = commTax;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withCommTax(Double commTax) {
        this.commTax = commTax;
        return this;
    }

    /**
     * Lineage reference object : fpbpohdMatchBlkRequired
     * (Required)
     * 
     */
    @JsonProperty("fpbpohdMatchBlkRequired")
    public String getFpbpohdMatchBlkRequired() {
        return fpbpohdMatchBlkRequired;
    }

    /**
     * Lineage reference object : fpbpohdMatchBlkRequired
     * (Required)
     * 
     */
    @JsonProperty("fpbpohdMatchBlkRequired")
    public void setFpbpohdMatchBlkRequired(String fpbpohdMatchBlkRequired) {
        this.fpbpohdMatchBlkRequired = fpbpohdMatchBlkRequired;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withFpbpohdMatchBlkRequired(String fpbpohdMatchBlkRequired) {
        this.fpbpohdMatchBlkRequired = fpbpohdMatchBlkRequired;
        return this;
    }

    /**
     * Additional Amounts
     * <p>
     * Lineage reference object : headAddl
     * 
     */
    @JsonProperty("headAddl")
    public Double getHeadAddl() {
        return headAddl;
    }

    /**
     * Additional Amounts
     * <p>
     * Lineage reference object : headAddl
     * 
     */
    @JsonProperty("headAddl")
    public void setHeadAddl(Double headAddl) {
        this.headAddl = headAddl;
    }

    public PurchaseOrderBalancingCompletion100GetResponse withHeadAddl(Double headAddl) {
        this.headAddl = headAddl;
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

    public PurchaseOrderBalancingCompletion100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrderBalancingCompletion100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayCurrCode");
        sb.append('=');
        sb.append(((this.displayCurrCode == null)?"<null>":this.displayCurrCode));
        sb.append(',');
        sb.append("apprStatus");
        sb.append('=');
        sb.append(((this.apprStatus == null)?"<null>":this.apprStatus));
        sb.append(',');
        sb.append("headDisc");
        sb.append('=');
        sb.append(((this.headDisc == null)?"<null>":this.headDisc));
        sb.append(',');
        sb.append("discStatus");
        sb.append('=');
        sb.append(((this.discStatus == null)?"<null>":this.discStatus));
        sb.append(',');
        sb.append("acctDisc");
        sb.append('=');
        sb.append(((this.acctDisc == null)?"<null>":this.acctDisc));
        sb.append(',');
        sb.append("addlStatus");
        sb.append('=');
        sb.append(((this.addlStatus == null)?"<null>":this.addlStatus));
        sb.append(',');
        sb.append("displayCurrDesc");
        sb.append('=');
        sb.append(((this.displayCurrDesc == null)?"<null>":this.displayCurrDesc));
        sb.append(',');
        sb.append("headAppr");
        sb.append('=');
        sb.append(((this.headAppr == null)?"<null>":this.headAppr));
        sb.append(',');
        sb.append("acctAppr");
        sb.append('=');
        sb.append(((this.acctAppr == null)?"<null>":this.acctAppr));
        sb.append(',');
        sb.append("commDisc");
        sb.append('=');
        sb.append(((this.commDisc == null)?"<null>":this.commDisc));
        sb.append(',');
        sb.append("headTax");
        sb.append('=');
        sb.append(((this.headTax == null)?"<null>":this.headTax));
        sb.append(',');
        sb.append("acctTax");
        sb.append('=');
        sb.append(((this.acctTax == null)?"<null>":this.acctTax));
        sb.append(',');
        sb.append("taxStatus");
        sb.append('=');
        sb.append(((this.taxStatus == null)?"<null>":this.taxStatus));
        sb.append(',');
        sb.append("commAddl");
        sb.append('=');
        sb.append(((this.commAddl == null)?"<null>":this.commAddl));
        sb.append(',');
        sb.append("displayConvRate");
        sb.append('=');
        sb.append(((this.displayConvRate == null)?"<null>":this.displayConvRate));
        sb.append(',');
        sb.append("acctAddl");
        sb.append('=');
        sb.append(((this.acctAddl == null)?"<null>":this.acctAddl));
        sb.append(',');
        sb.append("commAppr");
        sb.append('=');
        sb.append(((this.commAppr == null)?"<null>":this.commAppr));
        sb.append(',');
        sb.append("commTax");
        sb.append('=');
        sb.append(((this.commTax == null)?"<null>":this.commTax));
        sb.append(',');
        sb.append("fpbpohdMatchBlkRequired");
        sb.append('=');
        sb.append(((this.fpbpohdMatchBlkRequired == null)?"<null>":this.fpbpohdMatchBlkRequired));
        sb.append(',');
        sb.append("headAddl");
        sb.append('=');
        sb.append(((this.headAddl == null)?"<null>":this.headAddl));
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
        result = ((result* 31)+((this.displayCurrCode == null)? 0 :this.displayCurrCode.hashCode()));
        result = ((result* 31)+((this.apprStatus == null)? 0 :this.apprStatus.hashCode()));
        result = ((result* 31)+((this.headDisc == null)? 0 :this.headDisc.hashCode()));
        result = ((result* 31)+((this.discStatus == null)? 0 :this.discStatus.hashCode()));
        result = ((result* 31)+((this.acctDisc == null)? 0 :this.acctDisc.hashCode()));
        result = ((result* 31)+((this.addlStatus == null)? 0 :this.addlStatus.hashCode()));
        result = ((result* 31)+((this.displayCurrDesc == null)? 0 :this.displayCurrDesc.hashCode()));
        result = ((result* 31)+((this.headAppr == null)? 0 :this.headAppr.hashCode()));
        result = ((result* 31)+((this.acctAppr == null)? 0 :this.acctAppr.hashCode()));
        result = ((result* 31)+((this.commDisc == null)? 0 :this.commDisc.hashCode()));
        result = ((result* 31)+((this.headTax == null)? 0 :this.headTax.hashCode()));
        result = ((result* 31)+((this.acctTax == null)? 0 :this.acctTax.hashCode()));
        result = ((result* 31)+((this.taxStatus == null)? 0 :this.taxStatus.hashCode()));
        result = ((result* 31)+((this.commAddl == null)? 0 :this.commAddl.hashCode()));
        result = ((result* 31)+((this.displayConvRate == null)? 0 :this.displayConvRate.hashCode()));
        result = ((result* 31)+((this.acctAddl == null)? 0 :this.acctAddl.hashCode()));
        result = ((result* 31)+((this.commAppr == null)? 0 :this.commAppr.hashCode()));
        result = ((result* 31)+((this.commTax == null)? 0 :this.commTax.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fpbpohdMatchBlkRequired == null)? 0 :this.fpbpohdMatchBlkRequired.hashCode()));
        result = ((result* 31)+((this.headAddl == null)? 0 :this.headAddl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrderBalancingCompletion100GetResponse) == false) {
            return false;
        }
        PurchaseOrderBalancingCompletion100GetResponse rhs = ((PurchaseOrderBalancingCompletion100GetResponse) other);
        return ((((((((((((((((((((((this.displayCurrCode == rhs.displayCurrCode)||((this.displayCurrCode!= null)&&this.displayCurrCode.equals(rhs.displayCurrCode)))&&((this.apprStatus == rhs.apprStatus)||((this.apprStatus!= null)&&this.apprStatus.equals(rhs.apprStatus))))&&((this.headDisc == rhs.headDisc)||((this.headDisc!= null)&&this.headDisc.equals(rhs.headDisc))))&&((this.discStatus == rhs.discStatus)||((this.discStatus!= null)&&this.discStatus.equals(rhs.discStatus))))&&((this.acctDisc == rhs.acctDisc)||((this.acctDisc!= null)&&this.acctDisc.equals(rhs.acctDisc))))&&((this.addlStatus == rhs.addlStatus)||((this.addlStatus!= null)&&this.addlStatus.equals(rhs.addlStatus))))&&((this.displayCurrDesc == rhs.displayCurrDesc)||((this.displayCurrDesc!= null)&&this.displayCurrDesc.equals(rhs.displayCurrDesc))))&&((this.headAppr == rhs.headAppr)||((this.headAppr!= null)&&this.headAppr.equals(rhs.headAppr))))&&((this.acctAppr == rhs.acctAppr)||((this.acctAppr!= null)&&this.acctAppr.equals(rhs.acctAppr))))&&((this.commDisc == rhs.commDisc)||((this.commDisc!= null)&&this.commDisc.equals(rhs.commDisc))))&&((this.headTax == rhs.headTax)||((this.headTax!= null)&&this.headTax.equals(rhs.headTax))))&&((this.acctTax == rhs.acctTax)||((this.acctTax!= null)&&this.acctTax.equals(rhs.acctTax))))&&((this.taxStatus == rhs.taxStatus)||((this.taxStatus!= null)&&this.taxStatus.equals(rhs.taxStatus))))&&((this.commAddl == rhs.commAddl)||((this.commAddl!= null)&&this.commAddl.equals(rhs.commAddl))))&&((this.displayConvRate == rhs.displayConvRate)||((this.displayConvRate!= null)&&this.displayConvRate.equals(rhs.displayConvRate))))&&((this.acctAddl == rhs.acctAddl)||((this.acctAddl!= null)&&this.acctAddl.equals(rhs.acctAddl))))&&((this.commAppr == rhs.commAppr)||((this.commAppr!= null)&&this.commAppr.equals(rhs.commAppr))))&&((this.commTax == rhs.commTax)||((this.commTax!= null)&&this.commTax.equals(rhs.commTax))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fpbpohdMatchBlkRequired == rhs.fpbpohdMatchBlkRequired)||((this.fpbpohdMatchBlkRequired!= null)&&this.fpbpohdMatchBlkRequired.equals(rhs.fpbpohdMatchBlkRequired))))&&((this.headAddl == rhs.headAddl)||((this.headAddl!= null)&&this.headAddl.equals(rhs.headAddl))));
    }

}
