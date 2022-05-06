
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
    "vtypCode",
    "vtypDesc"
})
@Generated("jsonschema2pojo")
public class VendorMaintenanceVendorTypes100PostResponse {

    /**
     * Code
     * <p>
     * Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp
     * 
     */
    @JsonProperty("vtypCode")
    @JsonPropertyDescription("Lineage reference object : FTVVENT_VTYP_CODE, Lookup lineage reference object : ftvvtyp")
    private String vtypCode;
    @JsonProperty("vtypDesc")
    private String vtypDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public VendorMaintenanceVendorTypes100PostResponse withVtypCode(String vtypCode) {
        this.vtypCode = vtypCode;
        return this;
    }

    @JsonProperty("vtypDesc")
    public String getVtypDesc() {
        return vtypDesc;
    }

    @JsonProperty("vtypDesc")
    public void setVtypDesc(String vtypDesc) {
        this.vtypDesc = vtypDesc;
    }

    public VendorMaintenanceVendorTypes100PostResponse withVtypDesc(String vtypDesc) {
        this.vtypDesc = vtypDesc;
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

    public VendorMaintenanceVendorTypes100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorMaintenanceVendorTypes100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vtypCode");
        sb.append('=');
        sb.append(((this.vtypCode == null)?"<null>":this.vtypCode));
        sb.append(',');
        sb.append("vtypDesc");
        sb.append('=');
        sb.append(((this.vtypDesc == null)?"<null>":this.vtypDesc));
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
        result = ((result* 31)+((this.vtypDesc == null)? 0 :this.vtypDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorMaintenanceVendorTypes100PostResponse) == false) {
            return false;
        }
        VendorMaintenanceVendorTypes100PostResponse rhs = ((VendorMaintenanceVendorTypes100PostResponse) other);
        return ((((this.vtypCode == rhs.vtypCode)||((this.vtypCode!= null)&&this.vtypCode.equals(rhs.vtypCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vtypDesc == rhs.vtypDesc)||((this.vtypDesc!= null)&&this.vtypDesc.equals(rhs.vtypDesc))));
    }

}
