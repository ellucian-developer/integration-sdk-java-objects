
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
    "displayAcciCode",
    "displayProjCode",
    "item",
    "displayOrgnCode",
    "displayLocnCode",
    "displayProgCode",
    "displayCoasCode",
    "commCode",
    "displayAcctCode",
    "qty",
    "pohdCode",
    "displayActvCode",
    "displayFundCode",
    "uomsCode"
})
@Generated("jsonschema2pojo")
public class OpenPurchaseOrdersByFoapal100GetRequest {

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
     * Index
     * <p>
     * Lineage reference object : displayAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("displayAcciCode")
    @JsonPropertyDescription("Lineage reference object : displayAcciCode, Lookup lineage reference object : ftvacci")
    private String displayAcciCode;
    /**
     * Proj
     * <p>
     * Lineage reference object : displayProjCode, Lookup lineage reference object : ftvproj
     * 
     */
    @JsonProperty("displayProjCode")
    @JsonPropertyDescription("Lineage reference object : displayProjCode, Lookup lineage reference object : ftvproj")
    private String displayProjCode;
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
     * Orgn
     * <p>
     * Lineage reference object : displayOrgnCode
     * 
     */
    @JsonProperty("displayOrgnCode")
    @JsonPropertyDescription("Lineage reference object : displayOrgnCode")
    private String displayOrgnCode;
    /**
     * Locn
     * <p>
     * Lineage reference object : displayLocnCode
     * 
     */
    @JsonProperty("displayLocnCode")
    @JsonPropertyDescription("Lineage reference object : displayLocnCode")
    private String displayLocnCode;
    /**
     * Prog
     * <p>
     * Lineage reference object : displayProgCode
     * 
     */
    @JsonProperty("displayProgCode")
    @JsonPropertyDescription("Lineage reference object : displayProgCode")
    private String displayProgCode;
    /**
     * COA
     * <p>
     * Lineage reference object : displayCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("displayCoasCode")
    @JsonPropertyDescription("Lineage reference object : displayCoasCode, Lookup lineage reference object : ftvcoas")
    private String displayCoasCode;
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
     * Acct
     * <p>
     * Lineage reference object : displayAcctCode
     * 
     */
    @JsonProperty("displayAcctCode")
    @JsonPropertyDescription("Lineage reference object : displayAcctCode")
    private String displayAcctCode;
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
     * Actv
     * <p>
     * Lineage reference object : displayActvCode
     * 
     */
    @JsonProperty("displayActvCode")
    @JsonPropertyDescription("Lineage reference object : displayActvCode")
    private String displayActvCode;
    /**
     * Fund
     * <p>
     * Lineage reference object : displayFundCode
     * 
     */
    @JsonProperty("displayFundCode")
    @JsonPropertyDescription("Lineage reference object : displayFundCode")
    private String displayFundCode;
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

    public OpenPurchaseOrdersByFoapal100GetRequest withUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : displayAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("displayAcciCode")
    public String getDisplayAcciCode() {
        return displayAcciCode;
    }

    /**
     * Index
     * <p>
     * Lineage reference object : displayAcciCode, Lookup lineage reference object : ftvacci
     * 
     */
    @JsonProperty("displayAcciCode")
    public void setDisplayAcciCode(String displayAcciCode) {
        this.displayAcciCode = displayAcciCode;
    }

    public OpenPurchaseOrdersByFoapal100GetRequest withDisplayAcciCode(String displayAcciCode) {
        this.displayAcciCode = displayAcciCode;
        return this;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : displayProjCode, Lookup lineage reference object : ftvproj
     * 
     */
    @JsonProperty("displayProjCode")
    public String getDisplayProjCode() {
        return displayProjCode;
    }

    /**
     * Proj
     * <p>
     * Lineage reference object : displayProjCode, Lookup lineage reference object : ftvproj
     * 
     */
    @JsonProperty("displayProjCode")
    public void setDisplayProjCode(String displayProjCode) {
        this.displayProjCode = displayProjCode;
    }

    public OpenPurchaseOrdersByFoapal100GetRequest withDisplayProjCode(String displayProjCode) {
        this.displayProjCode = displayProjCode;
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

    public OpenPurchaseOrdersByFoapal100GetRequest withItem(Double item) {
        this.item = item;
        return this;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : displayOrgnCode
     * 
     */
    @JsonProperty("displayOrgnCode")
    public String getDisplayOrgnCode() {
        return displayOrgnCode;
    }

    /**
     * Orgn
     * <p>
     * Lineage reference object : displayOrgnCode
     * 
     */
    @JsonProperty("displayOrgnCode")
    public void setDisplayOrgnCode(String displayOrgnCode) {
        this.displayOrgnCode = displayOrgnCode;
    }

    public OpenPurchaseOrdersByFoapal100GetRequest withDisplayOrgnCode(String displayOrgnCode) {
        this.displayOrgnCode = displayOrgnCode;
        return this;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : displayLocnCode
     * 
     */
    @JsonProperty("displayLocnCode")
    public String getDisplayLocnCode() {
        return displayLocnCode;
    }

    /**
     * Locn
     * <p>
     * Lineage reference object : displayLocnCode
     * 
     */
    @JsonProperty("displayLocnCode")
    public void setDisplayLocnCode(String displayLocnCode) {
        this.displayLocnCode = displayLocnCode;
    }

    public OpenPurchaseOrdersByFoapal100GetRequest withDisplayLocnCode(String displayLocnCode) {
        this.displayLocnCode = displayLocnCode;
        return this;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : displayProgCode
     * 
     */
    @JsonProperty("displayProgCode")
    public String getDisplayProgCode() {
        return displayProgCode;
    }

    /**
     * Prog
     * <p>
     * Lineage reference object : displayProgCode
     * 
     */
    @JsonProperty("displayProgCode")
    public void setDisplayProgCode(String displayProgCode) {
        this.displayProgCode = displayProgCode;
    }

    public OpenPurchaseOrdersByFoapal100GetRequest withDisplayProgCode(String displayProgCode) {
        this.displayProgCode = displayProgCode;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : displayCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("displayCoasCode")
    public String getDisplayCoasCode() {
        return displayCoasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : displayCoasCode, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("displayCoasCode")
    public void setDisplayCoasCode(String displayCoasCode) {
        this.displayCoasCode = displayCoasCode;
    }

    public OpenPurchaseOrdersByFoapal100GetRequest withDisplayCoasCode(String displayCoasCode) {
        this.displayCoasCode = displayCoasCode;
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

    public OpenPurchaseOrdersByFoapal100GetRequest withCommCode(String commCode) {
        this.commCode = commCode;
        return this;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : displayAcctCode
     * 
     */
    @JsonProperty("displayAcctCode")
    public String getDisplayAcctCode() {
        return displayAcctCode;
    }

    /**
     * Acct
     * <p>
     * Lineage reference object : displayAcctCode
     * 
     */
    @JsonProperty("displayAcctCode")
    public void setDisplayAcctCode(String displayAcctCode) {
        this.displayAcctCode = displayAcctCode;
    }

    public OpenPurchaseOrdersByFoapal100GetRequest withDisplayAcctCode(String displayAcctCode) {
        this.displayAcctCode = displayAcctCode;
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

    public OpenPurchaseOrdersByFoapal100GetRequest withQty(Double qty) {
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

    public OpenPurchaseOrdersByFoapal100GetRequest withPohdCode(String pohdCode) {
        this.pohdCode = pohdCode;
        return this;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : displayActvCode
     * 
     */
    @JsonProperty("displayActvCode")
    public String getDisplayActvCode() {
        return displayActvCode;
    }

    /**
     * Actv
     * <p>
     * Lineage reference object : displayActvCode
     * 
     */
    @JsonProperty("displayActvCode")
    public void setDisplayActvCode(String displayActvCode) {
        this.displayActvCode = displayActvCode;
    }

    public OpenPurchaseOrdersByFoapal100GetRequest withDisplayActvCode(String displayActvCode) {
        this.displayActvCode = displayActvCode;
        return this;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : displayFundCode
     * 
     */
    @JsonProperty("displayFundCode")
    public String getDisplayFundCode() {
        return displayFundCode;
    }

    /**
     * Fund
     * <p>
     * Lineage reference object : displayFundCode
     * 
     */
    @JsonProperty("displayFundCode")
    public void setDisplayFundCode(String displayFundCode) {
        this.displayFundCode = displayFundCode;
    }

    public OpenPurchaseOrdersByFoapal100GetRequest withDisplayFundCode(String displayFundCode) {
        this.displayFundCode = displayFundCode;
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

    public OpenPurchaseOrdersByFoapal100GetRequest withUomsCode(String uomsCode) {
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

    public OpenPurchaseOrdersByFoapal100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenPurchaseOrdersByFoapal100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("unitPrice");
        sb.append('=');
        sb.append(((this.unitPrice == null)?"<null>":this.unitPrice));
        sb.append(',');
        sb.append("displayAcciCode");
        sb.append('=');
        sb.append(((this.displayAcciCode == null)?"<null>":this.displayAcciCode));
        sb.append(',');
        sb.append("displayProjCode");
        sb.append('=');
        sb.append(((this.displayProjCode == null)?"<null>":this.displayProjCode));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("displayOrgnCode");
        sb.append('=');
        sb.append(((this.displayOrgnCode == null)?"<null>":this.displayOrgnCode));
        sb.append(',');
        sb.append("displayLocnCode");
        sb.append('=');
        sb.append(((this.displayLocnCode == null)?"<null>":this.displayLocnCode));
        sb.append(',');
        sb.append("displayProgCode");
        sb.append('=');
        sb.append(((this.displayProgCode == null)?"<null>":this.displayProgCode));
        sb.append(',');
        sb.append("displayCoasCode");
        sb.append('=');
        sb.append(((this.displayCoasCode == null)?"<null>":this.displayCoasCode));
        sb.append(',');
        sb.append("commCode");
        sb.append('=');
        sb.append(((this.commCode == null)?"<null>":this.commCode));
        sb.append(',');
        sb.append("displayAcctCode");
        sb.append('=');
        sb.append(((this.displayAcctCode == null)?"<null>":this.displayAcctCode));
        sb.append(',');
        sb.append("qty");
        sb.append('=');
        sb.append(((this.qty == null)?"<null>":this.qty));
        sb.append(',');
        sb.append("pohdCode");
        sb.append('=');
        sb.append(((this.pohdCode == null)?"<null>":this.pohdCode));
        sb.append(',');
        sb.append("displayActvCode");
        sb.append('=');
        sb.append(((this.displayActvCode == null)?"<null>":this.displayActvCode));
        sb.append(',');
        sb.append("displayFundCode");
        sb.append('=');
        sb.append(((this.displayFundCode == null)?"<null>":this.displayFundCode));
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
        if ((other instanceof OpenPurchaseOrdersByFoapal100GetRequest) == false) {
            return false;
        }
        OpenPurchaseOrdersByFoapal100GetRequest rhs = ((OpenPurchaseOrdersByFoapal100GetRequest) other);
        return (((((((((((((((((this.unitPrice == rhs.unitPrice)||((this.unitPrice!= null)&&this.unitPrice.equals(rhs.unitPrice)))&&((this.displayAcciCode == rhs.displayAcciCode)||((this.displayAcciCode!= null)&&this.displayAcciCode.equals(rhs.displayAcciCode))))&&((this.displayProjCode == rhs.displayProjCode)||((this.displayProjCode!= null)&&this.displayProjCode.equals(rhs.displayProjCode))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.displayOrgnCode == rhs.displayOrgnCode)||((this.displayOrgnCode!= null)&&this.displayOrgnCode.equals(rhs.displayOrgnCode))))&&((this.displayLocnCode == rhs.displayLocnCode)||((this.displayLocnCode!= null)&&this.displayLocnCode.equals(rhs.displayLocnCode))))&&((this.displayProgCode == rhs.displayProgCode)||((this.displayProgCode!= null)&&this.displayProgCode.equals(rhs.displayProgCode))))&&((this.displayCoasCode == rhs.displayCoasCode)||((this.displayCoasCode!= null)&&this.displayCoasCode.equals(rhs.displayCoasCode))))&&((this.commCode == rhs.commCode)||((this.commCode!= null)&&this.commCode.equals(rhs.commCode))))&&((this.displayAcctCode == rhs.displayAcctCode)||((this.displayAcctCode!= null)&&this.displayAcctCode.equals(rhs.displayAcctCode))))&&((this.qty == rhs.qty)||((this.qty!= null)&&this.qty.equals(rhs.qty))))&&((this.pohdCode == rhs.pohdCode)||((this.pohdCode!= null)&&this.pohdCode.equals(rhs.pohdCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayActvCode == rhs.displayActvCode)||((this.displayActvCode!= null)&&this.displayActvCode.equals(rhs.displayActvCode))))&&((this.displayFundCode == rhs.displayFundCode)||((this.displayFundCode!= null)&&this.displayFundCode.equals(rhs.displayFundCode))))&&((this.uomsCode == rhs.uomsCode)||((this.uomsCode!= null)&&this.uomsCode.equals(rhs.uomsCode))));
    }

}
