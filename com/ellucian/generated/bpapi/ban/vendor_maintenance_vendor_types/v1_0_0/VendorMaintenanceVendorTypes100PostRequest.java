
package com.ellucian.generated.bpapi.ban.vendor_maintenance_vendor_types.v1_0_0;

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
    "ftvventVtypCode",
    "ftvvendVendCode"
})
@Generated("jsonschema2pojo")
public class VendorMaintenanceVendorTypes100PostRequest {

    /**
     * Code
     * <p>
     * Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp
     * 
     */
    @JsonProperty("ftvventVtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp")
    private String ftvventVtypCode;
    /**
     * Vendor
     * <p>
     * Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    @JsonPropertyDescription("Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend")
    private String ftvvendVendCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp
     * 
     */
    @JsonProperty("ftvventVtypCode")
    public String getFtvventVtypCode() {
        return ftvventVtypCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp
     * 
     */
    @JsonProperty("ftvventVtypCode")
    public void setFtvventVtypCode(String ftvventVtypCode) {
        this.ftvventVtypCode = ftvventVtypCode;
    }

    public VendorMaintenanceVendorTypes100PostRequest withFtvventVtypCode(String ftvventVtypCode) {
        this.ftvventVtypCode = ftvventVtypCode;
        return this;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    public String getFtvvendVendCode() {
        return ftvvendVendCode;
    }

    /**
     * Vendor
     * <p>
     * Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    public void setFtvvendVendCode(String ftvvendVendCode) {
        this.ftvvendVendCode = ftvvendVendCode;
    }

    public VendorMaintenanceVendorTypes100PostRequest withFtvvendVendCode(String ftvvendVendCode) {
        this.ftvvendVendCode = ftvvendVendCode;
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

    public VendorMaintenanceVendorTypes100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorMaintenanceVendorTypes100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvventVtypCode");
        sb.append('=');
        sb.append(((this.ftvventVtypCode == null)?"<null>":this.ftvventVtypCode));
        sb.append(',');
        sb.append("ftvvendVendCode");
        sb.append('=');
        sb.append(((this.ftvvendVendCode == null)?"<null>":this.ftvvendVendCode));
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
        result = ((result* 31)+((this.ftvventVtypCode == null)? 0 :this.ftvventVtypCode.hashCode()));
        result = ((result* 31)+((this.ftvvendVendCode == null)? 0 :this.ftvvendVendCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorMaintenanceVendorTypes100PostRequest) == false) {
            return false;
        }
        VendorMaintenanceVendorTypes100PostRequest rhs = ((VendorMaintenanceVendorTypes100PostRequest) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ftvventVtypCode == rhs.ftvventVtypCode)||((this.ftvventVtypCode!= null)&&this.ftvventVtypCode.equals(rhs.ftvventVtypCode))))&&((this.ftvvendVendCode == rhs.ftvvendVendCode)||((this.ftvvendVendCode!= null)&&this.ftvvendVendCode.equals(rhs.ftvvendVendCode))));
    }

}
