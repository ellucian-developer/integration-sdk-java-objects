
package com.ellucian.generated.bpapi.ban.purchase_orders_by_vendor.v1_0_0;

import java.util.Date;
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
    "commCode",
    "stndPoAmt",
    "displayCommDesc",
    "displayPoDate",
    "pohdCode",
    "regPoQuantity",
    "uomsCode"
})
@Generated("jsonschema2pojo")
public class PurchaseOrdersByVendor100GetResponse {

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
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("stndPoAmt")
    private Double stndPoAmt;
    @JsonProperty("displayCommDesc")
    private String displayCommDesc;
    /**
     * Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoDate")
    private Date displayPoDate;
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
     * 
     * 
     */
    @JsonProperty("regPoQuantity")
    private Double regPoQuantity;
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

    public PurchaseOrdersByVendor100GetResponse withCommCode(String commCode) {
        this.commCode = commCode;
        return this;
    }

    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("stndPoAmt")
    public Double getStndPoAmt() {
        return stndPoAmt;
    }

    /**
     * Amount
     * <p>
     * 
     * 
     */
    @JsonProperty("stndPoAmt")
    public void setStndPoAmt(Double stndPoAmt) {
        this.stndPoAmt = stndPoAmt;
    }

    public PurchaseOrdersByVendor100GetResponse withStndPoAmt(Double stndPoAmt) {
        this.stndPoAmt = stndPoAmt;
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

    public PurchaseOrdersByVendor100GetResponse withDisplayCommDesc(String displayCommDesc) {
        this.displayCommDesc = displayCommDesc;
        return this;
    }

    /**
     * Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoDate")
    public Date getDisplayPoDate() {
        return displayPoDate;
    }

    /**
     * Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayPoDate")
    public void setDisplayPoDate(Date displayPoDate) {
        this.displayPoDate = displayPoDate;
    }

    public PurchaseOrdersByVendor100GetResponse withDisplayPoDate(Date displayPoDate) {
        this.displayPoDate = displayPoDate;
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

    public PurchaseOrdersByVendor100GetResponse withPohdCode(String pohdCode) {
        this.pohdCode = pohdCode;
        return this;
    }

    /**
     * Quantity
     * <p>
     * 
     * 
     */
    @JsonProperty("regPoQuantity")
    public Double getRegPoQuantity() {
        return regPoQuantity;
    }

    /**
     * Quantity
     * <p>
     * 
     * 
     */
    @JsonProperty("regPoQuantity")
    public void setRegPoQuantity(Double regPoQuantity) {
        this.regPoQuantity = regPoQuantity;
    }

    public PurchaseOrdersByVendor100GetResponse withRegPoQuantity(Double regPoQuantity) {
        this.regPoQuantity = regPoQuantity;
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

    public PurchaseOrdersByVendor100GetResponse withUomsCode(String uomsCode) {
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

    public PurchaseOrdersByVendor100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrdersByVendor100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("commCode");
        sb.append('=');
        sb.append(((this.commCode == null)?"<null>":this.commCode));
        sb.append(',');
        sb.append("stndPoAmt");
        sb.append('=');
        sb.append(((this.stndPoAmt == null)?"<null>":this.stndPoAmt));
        sb.append(',');
        sb.append("displayCommDesc");
        sb.append('=');
        sb.append(((this.displayCommDesc == null)?"<null>":this.displayCommDesc));
        sb.append(',');
        sb.append("displayPoDate");
        sb.append('=');
        sb.append(((this.displayPoDate == null)?"<null>":this.displayPoDate));
        sb.append(',');
        sb.append("pohdCode");
        sb.append('=');
        sb.append(((this.pohdCode == null)?"<null>":this.pohdCode));
        sb.append(',');
        sb.append("regPoQuantity");
        sb.append('=');
        sb.append(((this.regPoQuantity == null)?"<null>":this.regPoQuantity));
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
        result = ((result* 31)+((this.commCode == null)? 0 :this.commCode.hashCode()));
        result = ((result* 31)+((this.stndPoAmt == null)? 0 :this.stndPoAmt.hashCode()));
        result = ((result* 31)+((this.displayCommDesc == null)? 0 :this.displayCommDesc.hashCode()));
        result = ((result* 31)+((this.displayPoDate == null)? 0 :this.displayPoDate.hashCode()));
        result = ((result* 31)+((this.pohdCode == null)? 0 :this.pohdCode.hashCode()));
        result = ((result* 31)+((this.regPoQuantity == null)? 0 :this.regPoQuantity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.uomsCode == null)? 0 :this.uomsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrdersByVendor100GetResponse) == false) {
            return false;
        }
        PurchaseOrdersByVendor100GetResponse rhs = ((PurchaseOrdersByVendor100GetResponse) other);
        return (((((((((this.commCode == rhs.commCode)||((this.commCode!= null)&&this.commCode.equals(rhs.commCode)))&&((this.stndPoAmt == rhs.stndPoAmt)||((this.stndPoAmt!= null)&&this.stndPoAmt.equals(rhs.stndPoAmt))))&&((this.displayCommDesc == rhs.displayCommDesc)||((this.displayCommDesc!= null)&&this.displayCommDesc.equals(rhs.displayCommDesc))))&&((this.displayPoDate == rhs.displayPoDate)||((this.displayPoDate!= null)&&this.displayPoDate.equals(rhs.displayPoDate))))&&((this.pohdCode == rhs.pohdCode)||((this.pohdCode!= null)&&this.pohdCode.equals(rhs.pohdCode))))&&((this.regPoQuantity == rhs.regPoQuantity)||((this.regPoQuantity!= null)&&this.regPoQuantity.equals(rhs.regPoQuantity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.uomsCode == rhs.uomsCode)||((this.uomsCode!= null)&&this.uomsCode.equals(rhs.uomsCode))));
    }

}
