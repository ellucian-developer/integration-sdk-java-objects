
package com.ellucian.generated.bpapi.ban.receiving_goods_query.v1_0_0;

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
    "fpbrcdtPackingSlip",
    "fpbrcdtPohdCode",
    "textDesc",
    "vendorId",
    "fpbrcdtBillOfLading",
    "buyerName",
    "vendorName",
    "fpbrcdtAdjustReceiveInd"
})
@Generated("jsonschema2pojo")
public class FpbrcdtBlock {

    /**
     * Packing Slip
     * <p>
     * Lineage reference object : FPBRCDT_PACKING_SLIP
     * 
     */
    @JsonProperty("fpbrcdtPackingSlip")
    @JsonPropertyDescription("Lineage reference object : FPBRCDT_PACKING_SLIP")
    private String fpbrcdtPackingSlip;
    /**
     * Purchase Order
     * <p>
     * Lineage reference object : FPBRCDT_POHD_CODE
     * 
     */
    @JsonProperty("fpbrcdtPohdCode")
    @JsonPropertyDescription("Lineage reference object : FPBRCDT_POHD_CODE")
    private String fpbrcdtPohdCode;
    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textDesc")
    private String textDesc;
    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorId")
    private String vendorId;
    /**
     * Bill of Lading
     * <p>
     * Lineage reference object : FPBRCDT_BILL_OF_LADING
     * 
     */
    @JsonProperty("fpbrcdtBillOfLading")
    @JsonPropertyDescription("Lineage reference object : FPBRCDT_BILL_OF_LADING")
    private String fpbrcdtBillOfLading;
    /**
     * Buyer
     * <p>
     * 
     * 
     */
    @JsonProperty("buyerName")
    private String buyerName;
    @JsonProperty("vendorName")
    private String vendorName;
    /**
     * Lineage reference object : FPBRCDT_ADJUST_RECEIVE_IND
     * 
     */
    @JsonProperty("fpbrcdtAdjustReceiveInd")
    @JsonPropertyDescription("Lineage reference object : FPBRCDT_ADJUST_RECEIVE_IND")
    private String fpbrcdtAdjustReceiveInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Packing Slip
     * <p>
     * Lineage reference object : FPBRCDT_PACKING_SLIP
     * 
     */
    @JsonProperty("fpbrcdtPackingSlip")
    public String getFpbrcdtPackingSlip() {
        return fpbrcdtPackingSlip;
    }

    /**
     * Packing Slip
     * <p>
     * Lineage reference object : FPBRCDT_PACKING_SLIP
     * 
     */
    @JsonProperty("fpbrcdtPackingSlip")
    public void setFpbrcdtPackingSlip(String fpbrcdtPackingSlip) {
        this.fpbrcdtPackingSlip = fpbrcdtPackingSlip;
    }

    public FpbrcdtBlock withFpbrcdtPackingSlip(String fpbrcdtPackingSlip) {
        this.fpbrcdtPackingSlip = fpbrcdtPackingSlip;
        return this;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : FPBRCDT_POHD_CODE
     * 
     */
    @JsonProperty("fpbrcdtPohdCode")
    public String getFpbrcdtPohdCode() {
        return fpbrcdtPohdCode;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : FPBRCDT_POHD_CODE
     * 
     */
    @JsonProperty("fpbrcdtPohdCode")
    public void setFpbrcdtPohdCode(String fpbrcdtPohdCode) {
        this.fpbrcdtPohdCode = fpbrcdtPohdCode;
    }

    public FpbrcdtBlock withFpbrcdtPohdCode(String fpbrcdtPohdCode) {
        this.fpbrcdtPohdCode = fpbrcdtPohdCode;
        return this;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textDesc")
    public String getTextDesc() {
        return textDesc;
    }

    /**
     * Text Exists
     * <p>
     * 
     * 
     */
    @JsonProperty("textDesc")
    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }

    public FpbrcdtBlock withTextDesc(String textDesc) {
        this.textDesc = textDesc;
        return this;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("vendorId")
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public FpbrcdtBlock withVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    /**
     * Bill of Lading
     * <p>
     * Lineage reference object : FPBRCDT_BILL_OF_LADING
     * 
     */
    @JsonProperty("fpbrcdtBillOfLading")
    public String getFpbrcdtBillOfLading() {
        return fpbrcdtBillOfLading;
    }

    /**
     * Bill of Lading
     * <p>
     * Lineage reference object : FPBRCDT_BILL_OF_LADING
     * 
     */
    @JsonProperty("fpbrcdtBillOfLading")
    public void setFpbrcdtBillOfLading(String fpbrcdtBillOfLading) {
        this.fpbrcdtBillOfLading = fpbrcdtBillOfLading;
    }

    public FpbrcdtBlock withFpbrcdtBillOfLading(String fpbrcdtBillOfLading) {
        this.fpbrcdtBillOfLading = fpbrcdtBillOfLading;
        return this;
    }

    /**
     * Buyer
     * <p>
     * 
     * 
     */
    @JsonProperty("buyerName")
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * Buyer
     * <p>
     * 
     * 
     */
    @JsonProperty("buyerName")
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public FpbrcdtBlock withBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }

    @JsonProperty("vendorName")
    public String getVendorName() {
        return vendorName;
    }

    @JsonProperty("vendorName")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public FpbrcdtBlock withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * Lineage reference object : FPBRCDT_ADJUST_RECEIVE_IND
     * 
     */
    @JsonProperty("fpbrcdtAdjustReceiveInd")
    public String getFpbrcdtAdjustReceiveInd() {
        return fpbrcdtAdjustReceiveInd;
    }

    /**
     * Lineage reference object : FPBRCDT_ADJUST_RECEIVE_IND
     * 
     */
    @JsonProperty("fpbrcdtAdjustReceiveInd")
    public void setFpbrcdtAdjustReceiveInd(String fpbrcdtAdjustReceiveInd) {
        this.fpbrcdtAdjustReceiveInd = fpbrcdtAdjustReceiveInd;
    }

    public FpbrcdtBlock withFpbrcdtAdjustReceiveInd(String fpbrcdtAdjustReceiveInd) {
        this.fpbrcdtAdjustReceiveInd = fpbrcdtAdjustReceiveInd;
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

    public FpbrcdtBlock withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FpbrcdtBlock.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fpbrcdtPackingSlip");
        sb.append('=');
        sb.append(((this.fpbrcdtPackingSlip == null)?"<null>":this.fpbrcdtPackingSlip));
        sb.append(',');
        sb.append("fpbrcdtPohdCode");
        sb.append('=');
        sb.append(((this.fpbrcdtPohdCode == null)?"<null>":this.fpbrcdtPohdCode));
        sb.append(',');
        sb.append("textDesc");
        sb.append('=');
        sb.append(((this.textDesc == null)?"<null>":this.textDesc));
        sb.append(',');
        sb.append("vendorId");
        sb.append('=');
        sb.append(((this.vendorId == null)?"<null>":this.vendorId));
        sb.append(',');
        sb.append("fpbrcdtBillOfLading");
        sb.append('=');
        sb.append(((this.fpbrcdtBillOfLading == null)?"<null>":this.fpbrcdtBillOfLading));
        sb.append(',');
        sb.append("buyerName");
        sb.append('=');
        sb.append(((this.buyerName == null)?"<null>":this.buyerName));
        sb.append(',');
        sb.append("vendorName");
        sb.append('=');
        sb.append(((this.vendorName == null)?"<null>":this.vendorName));
        sb.append(',');
        sb.append("fpbrcdtAdjustReceiveInd");
        sb.append('=');
        sb.append(((this.fpbrcdtAdjustReceiveInd == null)?"<null>":this.fpbrcdtAdjustReceiveInd));
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
        result = ((result* 31)+((this.fpbrcdtPackingSlip == null)? 0 :this.fpbrcdtPackingSlip.hashCode()));
        result = ((result* 31)+((this.fpbrcdtPohdCode == null)? 0 :this.fpbrcdtPohdCode.hashCode()));
        result = ((result* 31)+((this.textDesc == null)? 0 :this.textDesc.hashCode()));
        result = ((result* 31)+((this.vendorId == null)? 0 :this.vendorId.hashCode()));
        result = ((result* 31)+((this.fpbrcdtBillOfLading == null)? 0 :this.fpbrcdtBillOfLading.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.buyerName == null)? 0 :this.buyerName.hashCode()));
        result = ((result* 31)+((this.vendorName == null)? 0 :this.vendorName.hashCode()));
        result = ((result* 31)+((this.fpbrcdtAdjustReceiveInd == null)? 0 :this.fpbrcdtAdjustReceiveInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FpbrcdtBlock) == false) {
            return false;
        }
        FpbrcdtBlock rhs = ((FpbrcdtBlock) other);
        return ((((((((((this.fpbrcdtPackingSlip == rhs.fpbrcdtPackingSlip)||((this.fpbrcdtPackingSlip!= null)&&this.fpbrcdtPackingSlip.equals(rhs.fpbrcdtPackingSlip)))&&((this.fpbrcdtPohdCode == rhs.fpbrcdtPohdCode)||((this.fpbrcdtPohdCode!= null)&&this.fpbrcdtPohdCode.equals(rhs.fpbrcdtPohdCode))))&&((this.textDesc == rhs.textDesc)||((this.textDesc!= null)&&this.textDesc.equals(rhs.textDesc))))&&((this.vendorId == rhs.vendorId)||((this.vendorId!= null)&&this.vendorId.equals(rhs.vendorId))))&&((this.fpbrcdtBillOfLading == rhs.fpbrcdtBillOfLading)||((this.fpbrcdtBillOfLading!= null)&&this.fpbrcdtBillOfLading.equals(rhs.fpbrcdtBillOfLading))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.buyerName == rhs.buyerName)||((this.buyerName!= null)&&this.buyerName.equals(rhs.buyerName))))&&((this.vendorName == rhs.vendorName)||((this.vendorName!= null)&&this.vendorName.equals(rhs.vendorName))))&&((this.fpbrcdtAdjustReceiveInd == rhs.fpbrcdtAdjustReceiveInd)||((this.fpbrcdtAdjustReceiveInd!= null)&&this.fpbrcdtAdjustReceiveInd.equals(rhs.fpbrcdtAdjustReceiveInd))));
    }

}
