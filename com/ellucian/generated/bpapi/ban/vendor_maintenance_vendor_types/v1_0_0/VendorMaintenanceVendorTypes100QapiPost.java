
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
    "ftvvendVendCode",
    "vtypCode"
})
@Generated("jsonschema2pojo")
public class VendorMaintenanceVendorTypes100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    private String ftvvendVendCode;
    /**
     * Code
     * <p>
     * Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp")
    private String vtypCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    public String getFtvvendVendCode() {
        return ftvvendVendCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    public void setFtvvendVendCode(String ftvvendVendCode) {
        this.ftvvendVendCode = ftvvendVendCode;
    }

    public VendorMaintenanceVendorTypes100QapiPost withFtvvendVendCode(String ftvvendVendCode) {
        this.ftvvendVendCode = ftvvendVendCode;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public String getVtypCode() {
        return vtypCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    public void setVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
    }

    public VendorMaintenanceVendorTypes100QapiPost withVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
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

    public VendorMaintenanceVendorTypes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorMaintenanceVendorTypes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvvendVendCode");
        sb.append('=');
        sb.append(((this.ftvvendVendCode == null)?"<null>":this.ftvvendVendCode));
        sb.append(',');
        sb.append("vtypCode");
        sb.append('=');
        sb.append(((this.vtypCode == null)?"<null>":this.vtypCode));
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
        result = ((result* 31)+((this.vtypCode == null)? 0 :this.vtypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftvvendVendCode == null)? 0 :this.ftvvendVendCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorMaintenanceVendorTypes100QapiPost) == false) {
            return false;
        }
        VendorMaintenanceVendorTypes100QapiPost rhs = ((VendorMaintenanceVendorTypes100QapiPost) other);
        return ((((this.vtypCode == rhs.vtypCode)||((this.vtypCode!= null)&&this.vtypCode.equals(rhs.vtypCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvvendVendCode == rhs.ftvvendVendCode)||((this.ftvvendVendCode!= null)&&this.ftvvendVendCode.equals(rhs.ftvvendVendCode))));
    }

}
