
package com.ellucian.generated.bpapi.ban.vendor_maintenance_email.v1_0_0;

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
    "activityDate",
    "emalCode",
    "ftvvendVendCode",
    "userId"
})
@Generated("jsonschema2pojo")
public class VendorMaintenanceEmail100GetRequest {

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("activityDate")
    private Date activityDate;
    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("emalCode")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal")
    private String emalCode;
    /**
     * Vendor
     * <p>
     * Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend
     * (Required)
     * 
     */
    @JsonProperty("ftvvendVendCode")
    @JsonPropertyDescription("Lineage reference object : ftvvendVendCode, Lookup lineage reference object : ftvvend")
    private Object ftvvendVendCode;
    /**
     * User
     * <p>
     * Lineage reference object : GOREMAL_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GOREMAL_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * 
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public VendorMaintenanceEmail100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("emalCode")
    public String getEmalCode() {
        return emalCode;
    }

    /**
     * E-mail Type
     * <p>
     * Lineage reference object : GOREMAL_EMAL_CODE, Lookup lineage reference object : gtvemal
     * 
     */
    @JsonProperty("emalCode")
    public void setEmalCode(String emalCode) {
        this.emalCode = emalCode;
    }

    public VendorMaintenanceEmail100GetRequest withEmalCode(String emalCode) {
        this.emalCode = emalCode;
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
    public Object getFtvvendVendCode() {
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
    public void setFtvvendVendCode(Object ftvvendVendCode) {
        this.ftvvendVendCode = ftvvendVendCode;
    }

    public VendorMaintenanceEmail100GetRequest withFtvvendVendCode(Object ftvvendVendCode) {
        this.ftvvendVendCode = ftvvendVendCode;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GOREMAL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GOREMAL_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public VendorMaintenanceEmail100GetRequest withUserId(String userId) {
        this.userId = userId;
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

    public VendorMaintenanceEmail100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorMaintenanceEmail100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("emalCode");
        sb.append('=');
        sb.append(((this.emalCode == null)?"<null>":this.emalCode));
        sb.append(',');
        sb.append("ftvvendVendCode");
        sb.append('=');
        sb.append(((this.ftvvendVendCode == null)?"<null>":this.ftvvendVendCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.emalCode == null)? 0 :this.emalCode.hashCode()));
        result = ((result* 31)+((this.ftvvendVendCode == null)? 0 :this.ftvvendVendCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorMaintenanceEmail100GetRequest) == false) {
            return false;
        }
        VendorMaintenanceEmail100GetRequest rhs = ((VendorMaintenanceEmail100GetRequest) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.emalCode == rhs.emalCode)||((this.emalCode!= null)&&this.emalCode.equals(rhs.emalCode))))&&((this.ftvvendVendCode == rhs.ftvvendVendCode)||((this.ftvvendVendCode!= null)&&this.ftvvendVendCode.equals(rhs.ftvvendVendCode))));
    }

}
