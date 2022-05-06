
package com.ellucian.generated.bpapi.ban.purchase_orders_by_vendor.v1_0_0;

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
    "displayCoasCode",
    "displayFsyrCode",
    "displayOrgnCode",
    "displayVendCode",
    "statusGrp",
    "commCode",
    "pohdCode",
    "uomsCode"
})
@Generated("jsonschema2pojo")
public class PurchaseOrdersByVendor100QapiPost {

    @JsonProperty("displayCoasCode")
    private String displayCoasCode;
    @JsonProperty("displayFsyrCode")
    private String displayFsyrCode;
    @JsonProperty("displayOrgnCode")
    private String displayOrgnCode;
    @JsonProperty("displayVendCode")
    private String displayVendCode;
    @JsonProperty("statusGrp")
    private String statusGrp;
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
     * Purchase Order
     * <p>
     * Lineage reference object : FPRPODT_POHD_CODE
     * 
     */
    @JsonProperty("pohdCode")
    @JsonPropertyDescription("Lineage reference object : FPRPODT_POHD_CODE")
    private String pohdCode;
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

    @JsonProperty("displayCoasCode")
    public String getDisplayCoasCode() {
        return displayCoasCode;
    }

    @JsonProperty("displayCoasCode")
    public void setDisplayCoasCode(String displayCoasCode) {
        this.displayCoasCode = displayCoasCode;
    }

    public PurchaseOrdersByVendor100QapiPost withDisplayCoasCode(String displayCoasCode) {
        this.displayCoasCode = displayCoasCode;
        return this;
    }

    @JsonProperty("displayFsyrCode")
    public String getDisplayFsyrCode() {
        return displayFsyrCode;
    }

    @JsonProperty("displayFsyrCode")
    public void setDisplayFsyrCode(String displayFsyrCode) {
        this.displayFsyrCode = displayFsyrCode;
    }

    public PurchaseOrdersByVendor100QapiPost withDisplayFsyrCode(String displayFsyrCode) {
        this.displayFsyrCode = displayFsyrCode;
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

    public PurchaseOrdersByVendor100QapiPost withDisplayOrgnCode(String displayOrgnCode) {
        this.displayOrgnCode = displayOrgnCode;
        return this;
    }

    @JsonProperty("displayVendCode")
    public String getDisplayVendCode() {
        return displayVendCode;
    }

    @JsonProperty("displayVendCode")
    public void setDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
    }

    public PurchaseOrdersByVendor100QapiPost withDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
        return this;
    }

    @JsonProperty("statusGrp")
    public String getStatusGrp() {
        return statusGrp;
    }

    @JsonProperty("statusGrp")
    public void setStatusGrp(String statusGrp) {
        this.statusGrp = statusGrp;
    }

    public PurchaseOrdersByVendor100QapiPost withStatusGrp(String statusGrp) {
        this.statusGrp = statusGrp;
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

    public PurchaseOrdersByVendor100QapiPost withCommCode(String commCode) {
        this.commCode = commCode;
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

    public PurchaseOrdersByVendor100QapiPost withPohdCode(String pohdCode) {
        this.pohdCode = pohdCode;
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

    public PurchaseOrdersByVendor100QapiPost withUomsCode(String uomsCode) {
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

    public PurchaseOrdersByVendor100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrdersByVendor100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayCoasCode");
        sb.append('=');
        sb.append(((this.displayCoasCode == null)?"<null>":this.displayCoasCode));
        sb.append(',');
        sb.append("displayFsyrCode");
        sb.append('=');
        sb.append(((this.displayFsyrCode == null)?"<null>":this.displayFsyrCode));
        sb.append(',');
        sb.append("displayOrgnCode");
        sb.append('=');
        sb.append(((this.displayOrgnCode == null)?"<null>":this.displayOrgnCode));
        sb.append(',');
        sb.append("displayVendCode");
        sb.append('=');
        sb.append(((this.displayVendCode == null)?"<null>":this.displayVendCode));
        sb.append(',');
        sb.append("statusGrp");
        sb.append('=');
        sb.append(((this.statusGrp == null)?"<null>":this.statusGrp));
        sb.append(',');
        sb.append("commCode");
        sb.append('=');
        sb.append(((this.commCode == null)?"<null>":this.commCode));
        sb.append(',');
        sb.append("pohdCode");
        sb.append('=');
        sb.append(((this.pohdCode == null)?"<null>":this.pohdCode));
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
        result = ((result* 31)+((this.displayOrgnCode == null)? 0 :this.displayOrgnCode.hashCode()));
        result = ((result* 31)+((this.pohdCode == null)? 0 :this.pohdCode.hashCode()));
        result = ((result* 31)+((this.statusGrp == null)? 0 :this.statusGrp.hashCode()));
        result = ((result* 31)+((this.displayCoasCode == null)? 0 :this.displayCoasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayFsyrCode == null)? 0 :this.displayFsyrCode.hashCode()));
        result = ((result* 31)+((this.displayVendCode == null)? 0 :this.displayVendCode.hashCode()));
        result = ((result* 31)+((this.uomsCode == null)? 0 :this.uomsCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrdersByVendor100QapiPost) == false) {
            return false;
        }
        PurchaseOrdersByVendor100QapiPost rhs = ((PurchaseOrdersByVendor100QapiPost) other);
        return ((((((((((this.commCode == rhs.commCode)||((this.commCode!= null)&&this.commCode.equals(rhs.commCode)))&&((this.displayOrgnCode == rhs.displayOrgnCode)||((this.displayOrgnCode!= null)&&this.displayOrgnCode.equals(rhs.displayOrgnCode))))&&((this.pohdCode == rhs.pohdCode)||((this.pohdCode!= null)&&this.pohdCode.equals(rhs.pohdCode))))&&((this.statusGrp == rhs.statusGrp)||((this.statusGrp!= null)&&this.statusGrp.equals(rhs.statusGrp))))&&((this.displayCoasCode == rhs.displayCoasCode)||((this.displayCoasCode!= null)&&this.displayCoasCode.equals(rhs.displayCoasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayFsyrCode == rhs.displayFsyrCode)||((this.displayFsyrCode!= null)&&this.displayFsyrCode.equals(rhs.displayFsyrCode))))&&((this.displayVendCode == rhs.displayVendCode)||((this.displayVendCode!= null)&&this.displayVendCode.equals(rhs.displayVendCode))))&&((this.uomsCode == rhs.uomsCode)||((this.uomsCode!= null)&&this.uomsCode.equals(rhs.uomsCode))));
    }

}
