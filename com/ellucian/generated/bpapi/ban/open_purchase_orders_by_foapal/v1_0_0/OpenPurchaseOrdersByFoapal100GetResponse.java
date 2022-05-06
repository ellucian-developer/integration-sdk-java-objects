
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
    "unitPrice",
    "commCode",
    "item",
    "displayCommDesc",
    "qty",
    "pohdCode",
    "displayVendName",
    "uomsCode"
})
@Generated("jsonschema2pojo")
public class OpenPurchaseOrdersByFoapal100GetResponse {

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
    @JsonProperty("displayCommDesc")
    private String displayCommDesc;
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
     * Purchase Order
     * <p>
     * Lineage reference object : FPRPODT_POHD_CODE
     * 
     */
    @JsonProperty("pohdCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_POHD_CODE")
    private String pohdCode;
    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendName")
    private String displayVendName;
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

    public OpenPurchaseOrdersByFoapal100GetResponse withUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
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

    public OpenPurchaseOrdersByFoapal100GetResponse withCommCode(String commCode) {
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

    public OpenPurchaseOrdersByFoapal100GetResponse withItem(Double item) {
        this.item = item;
        return this;
    }

    @JsonProperty("displayCommDesc")
    public String getDisplayCommDesc() {
        return displayCommDesc;
    }

    @JsonProperty("displayCommDesc")
    public void setDisplayCommDesc(String displayCommDesc) {
        this.displayCommDesc = displayCommDesc;
    }

    public OpenPurchaseOrdersByFoapal100GetResponse withDisplayCommDesc(String displayCommDesc) {
        this.displayCommDesc = displayCommDesc;
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

    public OpenPurchaseOrdersByFoapal100GetResponse withQty(Double qty) {
        this.qty = qty;
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

    public OpenPurchaseOrdersByFoapal100GetResponse withPohdCode(String pohdCode) {
        this.pohdCode = pohdCode;
        return this;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendName")
    public String getDisplayVendName() {
        return displayVendName;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendName")
    public void setDisplayVendName(String displayVendName) {
        this.displayVendName = displayVendName;
    }

    public OpenPurchaseOrdersByFoapal100GetResponse withDisplayVendName(String displayVendName) {
        this.displayVendName = displayVendName;
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

    public OpenPurchaseOrdersByFoapal100GetResponse withUomsCode(String uomsCode) {
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

    public OpenPurchaseOrdersByFoapal100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenPurchaseOrdersByFoapal100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("commCode");
        sb.append('=');
        sb.append(((this.commCode == null)?"<null>":this.commCode));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("displayCommDesc");
        sb.append('=');
        sb.append(((this.displayCommDesc == null)?"<null>":this.displayCommDesc));
        sb.append(',');
        sb.append("qty");
        sb.append('=');
        sb.append(((this.qty == null)?"<null>":this.qty));
        sb.append(',');
        sb.append("pohdCode");
        sb.append('=');
        sb.append(((this.pohdCode == null)?"<null>":this.pohdCode));
        sb.append(',');
        sb.append("displayVendName");
        sb.append('=');
        sb.append(((this.displayVendName == null)?"<null>":this.displayVendName));
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
        result = ((result* 31)+((this.commCode == null)? 0 :this.commCode.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.displayCommDesc == null)? 0 :this.displayCommDesc.hashCode()));
        result = ((result* 31)+((this.qty == null)? 0 :this.qty.hashCode()));
        result = ((result* 31)+((this.pohdCode == null)? 0 :this.pohdCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayVendName == null)? 0 :this.displayVendName.hashCode()));
        result = ((result* 31)+((this.uomsCode == null)? 0 :this.uomsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenPurchaseOrdersByFoapal100GetResponse) == false) {
            return false;
        }
        OpenPurchaseOrdersByFoapal100GetResponse rhs = ((OpenPurchaseOrdersByFoapal100GetResponse) other);
        return ((((((((((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice)))&&((this.commCode == rhs.commCode)||((this.commCode!= null)&&this.commCode.equals(rhs.commCode))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.displayCommDesc == rhs.displayCommDesc)||((this.displayCommDesc!= null)&&this.displayCommDesc.equals(rhs.displayCommDesc))))&&((this.qty == rhs.qty)||((this.qty!= null)&&this.qty.equals(rhs.qty))))&&((this.pohdCode == rhs.pohdCode)||((this.pohdCode!= null)&&this.pohdCode.equals(rhs.pohdCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayVendName == rhs.displayVendName)||((this.displayVendName!= null)&&this.displayVendName.equals(rhs.displayVendName))))&&((this.uomsCode == rhs.uomsCode)||((this.uomsCode!= null)&&this.uomsCode.equals(rhs.uomsCode))));
    }

}
