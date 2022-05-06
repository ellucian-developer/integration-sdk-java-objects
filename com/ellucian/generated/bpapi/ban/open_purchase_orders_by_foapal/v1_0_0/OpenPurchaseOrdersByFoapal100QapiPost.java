
package com.ellucian.generated.bpapi.ban.open_purchase_orders_by_foapal.v1_0_0;

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
    "displayAcciCode",
    "displayAcctCode",
    "displayActvCode",
    "displayCoasCode",
    "displayFundCode",
    "displayLocnCode",
    "displayOrgnCode",
    "displayProgCode",
    "displayProjCode",
    "commCode",
    "item",
    "pohdCode",
    "qty",
    "unitPrice",
    "uomsCode"
})
@Generated("jsonschema2pojo")
public class OpenPurchaseOrdersByFoapal100QapiPost {

    @JsonProperty("displayAcciCode")
    private String displayAcciCode;
    @JsonProperty("displayAcctCode")
    private String displayAcctCode;
    @JsonProperty("displayActvCode")
    private String displayActvCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayCoasCode")
    private String displayCoasCode;
    @JsonProperty("displayFundCode")
    private String displayFundCode;
    @JsonProperty("displayLocnCode")
    private String displayLocnCode;
    @JsonProperty("displayOrgnCode")
    private String displayOrgnCode;
    @JsonProperty("displayProgCode")
    private String displayProgCode;
    @JsonProperty("displayProjCode")
    private String displayProjCode;
    /**
     * Commodity
     * <p>
     * Lineage reference object : FPRPODT_COMM_CODE
     * 
     */
    @JsonProperty("commCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_COMM_CODE")
    private String commCode;
    /**
     * Item
     * <p>
     * Lineage reference object : FPRPODT_ITEM
     * 
     */
    @JsonProperty("item")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_ITEM")
    private Double item;
    /**
     * Purchase Order
     * <p>
     * Lineage reference object : FPRPODT_POHD_CODE
     * 
     */
    @JsonProperty("pohdCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_POHD_CODE")
    private String pohdCode;
    /**
     * Quantity
     * <p>
     * Lineage reference object : FPRPODT_QTY
     * 
     */
    @JsonProperty("qty")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_QTY")
    private Double qty;
    /**
     * Unit Price
     * <p>
     * Lineage reference object : FPRPODT_UNIT_PRICE
     * 
     */
    @JsonProperty("unitPrice")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_UNIT_PRICE")
    private Double unitPrice;
    /**
     * U/M
     * <p>
     * Lineage reference object : FPRPODT_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * 
     */
    @JsonProperty("uomsCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_UOMS_CODE, Lookup lineage reference object : ftvuoms")
    private String uomsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayAcciCode")
    public String getDisplayAcciCode() {
        return displayAcciCode;
    }

    @JsonProperty("displayAcciCode")
    public void setDisplayAcciCode(String displayAcciCode) {
        this.displayAcciCode = displayAcciCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withDisplayAcciCode(String displayAcciCode) {
        this.displayAcciCode = displayAcciCode;
        return this;
    }

    @JsonProperty("displayAcctCode")
    public String getDisplayAcctCode() {
        return displayAcctCode;
    }

    @JsonProperty("displayAcctCode")
    public void setDisplayAcctCode(String displayAcctCode) {
        this.displayAcctCode = displayAcctCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withDisplayAcctCode(String displayAcctCode) {
        this.displayAcctCode = displayAcctCode;
        return this;
    }

    @JsonProperty("displayActvCode")
    public String getDisplayActvCode() {
        return displayActvCode;
    }

    @JsonProperty("displayActvCode")
    public void setDisplayActvCode(String displayActvCode) {
        this.displayActvCode = displayActvCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withDisplayActvCode(String displayActvCode) {
        this.displayActvCode = displayActvCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayCoasCode")
    public String getDisplayCoasCode() {
        return displayCoasCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("displayCoasCode")
    public void setDisplayCoasCode(String displayCoasCode) {
        this.displayCoasCode = displayCoasCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withDisplayCoasCode(String displayCoasCode) {
        this.displayCoasCode = displayCoasCode;
        return this;
    }

    @JsonProperty("displayFundCode")
    public String getDisplayFundCode() {
        return displayFundCode;
    }

    @JsonProperty("displayFundCode")
    public void setDisplayFundCode(String displayFundCode) {
        this.displayFundCode = displayFundCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withDisplayFundCode(String displayFundCode) {
        this.displayFundCode = displayFundCode;
        return this;
    }

    @JsonProperty("displayLocnCode")
    public String getDisplayLocnCode() {
        return displayLocnCode;
    }

    @JsonProperty("displayLocnCode")
    public void setDisplayLocnCode(String displayLocnCode) {
        this.displayLocnCode = displayLocnCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withDisplayLocnCode(String displayLocnCode) {
        this.displayLocnCode = displayLocnCode;
        return this;
    }

    @JsonProperty("displayOrgnCode")
    public String getDisplayOrgnCode() {
        return displayOrgnCode;
    }

    @JsonProperty("displayOrgnCode")
    public void setDisplayOrgnCode(String displayOrgnCode) {
        this.displayOrgnCode = displayOrgnCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withDisplayOrgnCode(String displayOrgnCode) {
        this.displayOrgnCode = displayOrgnCode;
        return this;
    }

    @JsonProperty("displayProgCode")
    public String getDisplayProgCode() {
        return displayProgCode;
    }

    @JsonProperty("displayProgCode")
    public void setDisplayProgCode(String displayProgCode) {
        this.displayProgCode = displayProgCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withDisplayProgCode(String displayProgCode) {
        this.displayProgCode = displayProgCode;
        return this;
    }

    @JsonProperty("displayProjCode")
    public String getDisplayProjCode() {
        return displayProjCode;
    }

    @JsonProperty("displayProjCode")
    public void setDisplayProjCode(String displayProjCode) {
        this.displayProjCode = displayProjCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withDisplayProjCode(String displayProjCode) {
        this.displayProjCode = displayProjCode;
        return this;
    }

    /**
     * Commodity
     * <p>
     * Lineage reference object : FPRPODT_COMM_CODE
     * 
     */
    @JsonProperty("commCode")
    public String getCommCode() {
        return commCode;
    }

    /**
     * Commodity
     * <p>
     * Lineage reference object : FPRPODT_COMM_CODE
     * 
     */
    @JsonProperty("commCode")
    public void setCommCode(String commCode) {
        this.commCode = commCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withCommCode(String commCode) {
        this.commCode = commCode;
        return this;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : FPRPODT_ITEM
     * 
     */
    @JsonProperty("item")
    public Double getItem() {
        return item;
    }

    /**
     * Item
     * <p>
     * Lineage reference object : FPRPODT_ITEM
     * 
     */
    @JsonProperty("item")
    public void setItem(Double item) {
        this.item = item;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withItem(Double item) {
        this.item = item;
        return this;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : FPRPODT_POHD_CODE
     * 
     */
    @JsonProperty("pohdCode")
    public String getPohdCode() {
        return pohdCode;
    }

    /**
     * Purchase Order
     * <p>
     * Lineage reference object : FPRPODT_POHD_CODE
     * 
     */
    @JsonProperty("pohdCode")
    public void setPohdCode(String pohdCode) {
        this.pohdCode = pohdCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withPohdCode(String pohdCode) {
        this.pohdCode = pohdCode;
        return this;
    }

    /**
     * Quantity
     * <p>
     * Lineage reference object : FPRPODT_QTY
     * 
     */
    @JsonProperty("qty")
    public Double getQty() {
        return qty;
    }

    /**
     * Quantity
     * <p>
     * Lineage reference object : FPRPODT_QTY
     * 
     */
    @JsonProperty("qty")
    public void setQty(Double qty) {
        this.qty = qty;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withQty(Double qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Unit Price
     * <p>
     * Lineage reference object : FPRPODT_UNIT_PRICE
     * 
     */
    @JsonProperty("unitPrice")
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Unit Price
     * <p>
     * Lineage reference object : FPRPODT_UNIT_PRICE
     * 
     */
    @JsonProperty("unitPrice")
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * U/M
     * <p>
     * Lineage reference object : FPRPODT_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * 
     */
    @JsonProperty("uomsCode")
    public String getUomsCode() {
        return uomsCode;
    }

    /**
     * U/M
     * <p>
     * Lineage reference object : FPRPODT_UOMS_CODE, Lookup lineage reference object : ftvuoms
     * 
     */
    @JsonProperty("uomsCode")
    public void setUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
    }

    public OpenPurchaseOrdersByFoapal100QapiPost withUomsCode(String uomsCode) {
        this.uomsCode = uomsCode;
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

    public OpenPurchaseOrdersByFoapal100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenPurchaseOrdersByFoapal100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayAcciCode");
        sb.append('=');
        sb.append(((this.displayAcciCode == null)?"<null>":this.displayAcciCode));
        sb.append(',');
        sb.append("displayAcctCode");
        sb.append('=');
        sb.append(((this.displayAcctCode == null)?"<null>":this.displayAcctCode));
        sb.append(',');
        sb.append("displayActvCode");
        sb.append('=');
        sb.append(((this.displayActvCode == null)?"<null>":this.displayActvCode));
        sb.append(',');
        sb.append("displayCoasCode");
        sb.append('=');
        sb.append(((this.displayCoasCode == null)?"<null>":this.displayCoasCode));
        sb.append(',');
        sb.append("displayFundCode");
        sb.append('=');
        sb.append(((this.displayFundCode == null)?"<null>":this.displayFundCode));
        sb.append(',');
        sb.append("displayLocnCode");
        sb.append('=');
        sb.append(((this.displayLocnCode == null)?"<null>":this.displayLocnCode));
        sb.append(',');
        sb.append("displayOrgnCode");
        sb.append('=');
        sb.append(((this.displayOrgnCode == null)?"<null>":this.displayOrgnCode));
        sb.append(',');
        sb.append("displayProgCode");
        sb.append('=');
        sb.append(((this.displayProgCode == null)?"<null>":this.displayProgCode));
        sb.append(',');
        sb.append("displayProjCode");
        sb.append('=');
        sb.append(((this.displayProjCode == null)?"<null>":this.displayProjCode));
        sb.append(',');
        sb.append("commCode");
        sb.append('=');
        sb.append(((this.commCode == null)?"<null>":this.commCode));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("pohdCode");
        sb.append('=');
        sb.append(((this.pohdCode == null)?"<null>":this.pohdCode));
        sb.append(',');
        sb.append("qty");
        sb.append('=');
        sb.append(((this.qty == null)?"<null>":this.qty));
        sb.append(',');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("uomsCode");
        sb.append('=');
        sb.append(((this.uomsCode == null)?"<null>":this.uomsCode));
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
        result = ((result* 31)+((this.unitPrice == null)? 0 :this.unitPrice.hashCode()));
        result = ((result* 31)+((this.displayAcciCode == null)? 0 :this.displayAcciCode.hashCode()));
        result = ((result* 31)+((this.displayProjCode == null)? 0 :this.displayProjCode.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.displayOrgnCode == null)? 0 :this.displayOrgnCode.hashCode()));
        result = ((result* 31)+((this.displayLocnCode == null)? 0 :this.displayLocnCode.hashCode()));
        result = ((result* 31)+((this.displayProgCode == null)? 0 :this.displayProgCode.hashCode()));
        result = ((result* 31)+((this.displayCoasCode == null)? 0 :this.displayCoasCode.hashCode()));
        result = ((result* 31)+((this.commCode == null)? 0 :this.commCode.hashCode()));
        result = ((result* 31)+((this.displayAcctCode == null)? 0 :this.displayAcctCode.hashCode()));
        result = ((result* 31)+((this.qty == null)? 0 :this.qty.hashCode()));
        result = ((result* 31)+((this.pohdCode == null)? 0 :this.pohdCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayActvCode == null)? 0 :this.displayActvCode.hashCode()));
        result = ((result* 31)+((this.displayFundCode == null)? 0 :this.displayFundCode.hashCode()));
        result = ((result* 31)+((this.uomsCode == null)? 0 :this.uomsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenPurchaseOrdersByFoapal100QapiPost) == false) {
            return false;
        }
        OpenPurchaseOrdersByFoapal100QapiPost rhs = ((OpenPurchaseOrdersByFoapal100QapiPost) other);
        return (((((((((((((((((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice)))&&((this.displayAcciCode == rhs.displayAcciCode)||((this.displayAcciCode!= null)&&this.displayAcciCode.equals(rhs.displayAcciCode))))&&((this.displayProjCode == rhs.displayProjCode)||((this.displayProjCode!= null)&&this.displayProjCode.equals(rhs.displayProjCode))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.displayOrgnCode == rhs.displayOrgnCode)||((this.displayOrgnCode!= null)&&this.displayOrgnCode.equals(rhs.displayOrgnCode))))&&((this.displayLocnCode == rhs.displayLocnCode)||((this.displayLocnCode!= null)&&this.displayLocnCode.equals(rhs.displayLocnCode))))&&((this.displayProgCode == rhs.displayProgCode)||((this.displayProgCode!= null)&&this.displayProgCode.equals(rhs.displayProgCode))))&&((this.displayCoasCode == rhs.displayCoasCode)||((this.displayCoasCode!= null)&&this.displayCoasCode.equals(rhs.displayCoasCode))))&&((this.commCode == rhs.commCode)||((this.commCode!= null)&&this.commCode.equals(rhs.commCode))))&&((this.displayAcctCode == rhs.displayAcctCode)||((this.displayAcctCode!= null)&&this.displayAcctCode.equals(rhs.displayAcctCode))))&&((this.qty == rhs.qty)||((this.qty!= null)&&this.qty.equals(rhs.qty))))&&((this.pohdCode == rhs.pohdCode)||((this.pohdCode!= null)&&this.pohdCode.equals(rhs.pohdCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayActvCode == rhs.displayActvCode)||((this.displayActvCode!= null)&&this.displayActvCode.equals(rhs.displayActvCode))))&&((this.displayFundCode == rhs.displayFundCode)||((this.displayFundCode!= null)&&this.displayFundCode.equals(rhs.displayFundCode))))&&((this.uomsCode == rhs.uomsCode)||((this.uomsCode!= null)&&this.uomsCode.equals(rhs.uomsCode))));
    }

}
