
package com.ellucian.generated.bpapi.ban.ca_mis_success_and_support_services_term_data_orientation.v1_0_0;

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
    "svrorntId",
    "serviceDate",
    "svamstdDicdCode",
    "ssgpCode",
    "svamstdTermCode",
    "id",
    "osstCode",
    "ssstCode",
    "origCode"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest {

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svrorntId")
    private String svrorntId;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRORNT_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_SERVICE_DATE")
    private Date serviceDate;
    /**
     * District/College ID
     * <p>
     * Lineage reference object : svamstdDicdCode, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("svamstdDicdCode")
    @JsonPropertyDescription("Lineage reference object : svamstdDicdCode, Lookup lineage reference object : gtvdicd")
    private Object svamstdDicdCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    /**
     * Term
     * <p>
     * Lineage reference object : svamstdTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("svamstdTermCode")
    @JsonPropertyDescription("Lineage reference object : svamstdTermCode, Lookup lineage reference object : stvterm")
    private Object svamstdTermCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Orientation Service
     * <p>
     * Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst
     * (Required)
     * 
     */
    @JsonProperty("osstCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst")
    private String osstCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst")
    private String ssstCode;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svrorntId")
    public String getSvrorntId() {
        return svrorntId;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svrorntId")
    public void setSvrorntId(String svrorntId) {
        this.svrorntId = svrorntId;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withSvrorntId(String svrorntId) {
        this.svrorntId = svrorntId;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRORNT_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    public Date getServiceDate() {
        return serviceDate;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRORNT_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
        return this;
    }

    /**
     * District/College ID
     * <p>
     * Lineage reference object : svamstdDicdCode, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("svamstdDicdCode")
    public Object getSvamstdDicdCode() {
        return svamstdDicdCode;
    }

    /**
     * District/College ID
     * <p>
     * Lineage reference object : svamstdDicdCode, Lookup lineage reference object : gtvdicd
     * 
     */
    @JsonProperty("svamstdDicdCode")
    public void setSvamstdDicdCode(Object svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withSvamstdDicdCode(Object svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRORNT_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : svamstdTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("svamstdTermCode")
    public Object getSvamstdTermCode() {
        return svamstdTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : svamstdTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("svamstdTermCode")
    public void setSvamstdTermCode(Object svamstdTermCode) {
        this.svamstdTermCode = svamstdTermCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withSvamstdTermCode(Object svamstdTermCode) {
        this.svamstdTermCode = svamstdTermCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Orientation Service
     * <p>
     * Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst
     * (Required)
     * 
     */
    @JsonProperty("osstCode")
    public String getOsstCode() {
        return osstCode;
    }

    /**
     * Orientation Service
     * <p>
     * Lineage reference object : SVRORNT_OSST_CODE, Lookup lineage reference object : svvosst
     * (Required)
     * 
     */
    @JsonProperty("osstCode")
    public void setOsstCode(String osstCode) {
        this.osstCode = osstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withOsstCode(String osstCode) {
        this.osstCode = osstCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public String getSsstCode() {
        return ssstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRORNT_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public void setSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRORNT_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("svrorntId");
        sb.append('=');
        sb.append(((this.svrorntId == null)?"<null>":this.svrorntId));
        sb.append(',');
        sb.append("serviceDate");
        sb.append('=');
        sb.append(((this.serviceDate == null)?"<null>":this.serviceDate));
        sb.append(',');
        sb.append("svamstdDicdCode");
        sb.append('=');
        sb.append(((this.svamstdDicdCode == null)?"<null>":this.svamstdDicdCode));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("svamstdTermCode");
        sb.append('=');
        sb.append(((this.svamstdTermCode == null)?"<null>":this.svamstdTermCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("osstCode");
        sb.append('=');
        sb.append(((this.osstCode == null)?"<null>":this.osstCode));
        sb.append(',');
        sb.append("ssstCode");
        sb.append('=');
        sb.append(((this.ssstCode == null)?"<null>":this.ssstCode));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
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
        result = ((result* 31)+((this.svrorntId == null)? 0 :this.svrorntId.hashCode()));
        result = ((result* 31)+((this.serviceDate == null)? 0 :this.serviceDate.hashCode()));
        result = ((result* 31)+((this.svamstdDicdCode == null)? 0 :this.svamstdDicdCode.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.svamstdTermCode == null)? 0 :this.svamstdTermCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.osstCode == null)? 0 :this.osstCode.hashCode()));
        result = ((result* 31)+((this.ssstCode == null)? 0 :this.ssstCode.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest rhs = ((CaMisSuccessAndSupportServicesTermDataOrientation100PostRequest) other);
        return (((((((((((this.svrorntId == rhs.svrorntId)||((this.svrorntId!= null)&&this.svrorntId.equals(rhs.svrorntId)))&&((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate))))&&((this.svamstdDicdCode == rhs.svamstdDicdCode)||((this.svamstdDicdCode!= null)&&this.svamstdDicdCode.equals(rhs.svamstdDicdCode))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.svamstdTermCode == rhs.svamstdTermCode)||((this.svamstdTermCode!= null)&&this.svamstdTermCode.equals(rhs.svamstdTermCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.osstCode == rhs.osstCode)||((this.osstCode!= null)&&this.osstCode.equals(rhs.osstCode))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
