
package com.ellucian.generated.bpapi.ban.purchase_order_information.v1_0_0;

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
    "reqdDate",
    "buyrCode",
    "displayVendCode"
})
@Generated("jsonschema2pojo")
public class PurchaseOrderInformation100PostRequest {

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBPOHD_REQD_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqdDate")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_REQD_DATE")
    private Date reqdDate;
    /**
     * Buyer Code
     * <p>
     * Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr
     * 
     */
    @JsonProperty("buyrCode")
    @JsonPropertyDescription("Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr")
    private String buyrCode;
    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendCode")
    private String displayVendCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBPOHD_REQD_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqdDate")
    public Date getReqdDate() {
        return reqdDate;
    }

    /**
     * Delivery Date
     * <p>
     * Lineage reference object : FPBPOHD_REQD_DATE
     * (Required)
     * 
     */
    @JsonProperty("reqdDate")
    public void setReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
    }

    public PurchaseOrderInformation100PostRequest withReqdDate(Date reqdDate) {
        this.reqdDate = reqdDate;
        return this;
    }

    /**
     * Buyer Code
     * <p>
     * Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr
     * 
     */
    @JsonProperty("buyrCode")
    public String getBuyrCode() {
        return buyrCode;
    }

    /**
     * Buyer Code
     * <p>
     * Lineage reference object : FPBPOHD_BUYR_CODE, Lookup lineage reference object : ftvbuyr
     * 
     */
    @JsonProperty("buyrCode")
    public void setBuyrCode(String buyrCode) {
        this.buyrCode = buyrCode;
    }

    public PurchaseOrderInformation100PostRequest withBuyrCode(String buyrCode) {
        this.buyrCode = buyrCode;
        return this;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendCode")
    public String getDisplayVendCode() {
        return displayVendCode;
    }

    /**
     * Vendor
     * <p>
     * 
     * 
     */
    @JsonProperty("displayVendCode")
    public void setDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
    }

    public PurchaseOrderInformation100PostRequest withDisplayVendCode(String displayVendCode) {
        this.displayVendCode = displayVendCode;
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

    public PurchaseOrderInformation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrderInformation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqdDate");
        sb.append('=');
        sb.append(((this.reqdDate == null)?"<null>":this.reqdDate));
        sb.append(',');
        sb.append("buyrCode");
        sb.append('=');
        sb.append(((this.buyrCode == null)?"<null>":this.buyrCode));
        sb.append(',');
        sb.append("displayVendCode");
        sb.append('=');
        sb.append(((this.displayVendCode == null)?"<null>":this.displayVendCode));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.reqdDate == null)? 0 :this.reqdDate.hashCode()));
        result = ((result* 31)+((this.buyrCode == null)? 0 :this.buyrCode.hashCode()));
        result = ((result* 31)+((this.displayVendCode == null)? 0 :this.displayVendCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrderInformation100PostRequest) == false) {
            return false;
        }
        PurchaseOrderInformation100PostRequest rhs = ((PurchaseOrderInformation100PostRequest) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.reqdDate == rhs.reqdDate)||((this.reqdDate!= null)&&this.reqdDate.equals(rhs.reqdDate))))&&((this.buyrCode == rhs.buyrCode)||((this.buyrCode!= null)&&this.buyrCode.equals(rhs.buyrCode))))&&((this.displayVendCode == rhs.displayVendCode)||((this.displayVendCode!= null)&&this.displayVendCode.equals(rhs.displayVendCode))));
    }

}
