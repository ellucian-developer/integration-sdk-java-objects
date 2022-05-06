
package com.ellucian.generated.bpapi.ban.ca_mis_success_and_support_services_term_data_career_interest.v1_0_0;

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
    "cintCode",
    "serviceDate",
    "svamstdDicdCode",
    "svrcrinCintCode",
    "ssgpCode",
    "svrcrinId",
    "name",
    "svamstdTermCode",
    "id",
    "ssstCode",
    "origCode"
})
@Generated("jsonschema2pojo")
public class CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest {

    /**
     * Career/Interest
     * <p>
     * Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint
     * (Required)
     * 
     */
    @JsonProperty("cintCode")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint")
    private String cintCode;
    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRCRIN_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_SERVICE_DATE")
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
     * Career/Interest
     * <p>
     * Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint
     * (Required)
     * 
     */
    @JsonProperty("svrcrinCintCode")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint")
    private String svrcrinCintCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SVRCRIN_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svrcrinId")
    private String svrcrinId;
    @JsonProperty("name")
    private String name;
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
     * Status
     * <p>
     * Lineage reference object : SVRCRIN_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_SSST_CODE, Lookup lineage reference object : stvssst")
    private String ssstCode;
    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRCRIN_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SVRCRIN_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Career/Interest
     * <p>
     * Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint
     * (Required)
     * 
     */
    @JsonProperty("cintCode")
    public String getCintCode() {
        return cintCode;
    }

    /**
     * Career/Interest
     * <p>
     * Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint
     * (Required)
     * 
     */
    @JsonProperty("cintCode")
    public void setCintCode(String cintCode) {
        this.cintCode = cintCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withCintCode(String cintCode) {
        this.cintCode = cintCode;
        return this;
    }

    /**
     * Service Date
     * <p>
     * Lineage reference object : SVRCRIN_SERVICE_DATE
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
     * Lineage reference object : SVRCRIN_SERVICE_DATE
     * (Required)
     * 
     */
    @JsonProperty("serviceDate")
    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withServiceDate(Date serviceDate) {
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withSvamstdDicdCode(Object svamstdDicdCode) {
        this.svamstdDicdCode = svamstdDicdCode;
        return this;
    }

    /**
     * Career/Interest
     * <p>
     * Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint
     * (Required)
     * 
     */
    @JsonProperty("svrcrinCintCode")
    public String getSvrcrinCintCode() {
        return svrcrinCintCode;
    }

    /**
     * Career/Interest
     * <p>
     * Lineage reference object : SVRCRIN_CINT_CODE, Lookup lineage reference object : svvcint
     * (Required)
     * 
     */
    @JsonProperty("svrcrinCintCode")
    public void setSvrcrinCintCode(String svrcrinCintCode) {
        this.svrcrinCintCode = svrcrinCintCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withSvrcrinCintCode(String svrcrinCintCode) {
        this.svrcrinCintCode = svrcrinCintCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRCRIN_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SVRCRIN_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svrcrinId")
    public String getSvrcrinId() {
        return svrcrinId;
    }

    /**
     * Provider User ID
     * <p>
     * 
     * 
     */
    @JsonProperty("svrcrinId")
    public void setSvrcrinId(String svrcrinId) {
        this.svrcrinId = svrcrinId;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withSvrcrinId(String svrcrinId) {
        this.svrcrinId = svrcrinId;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withName(String name) {
        this.name = name;
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withSvamstdTermCode(Object svamstdTermCode) {
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRCRIN_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public String getSsstCode() {
        return ssstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SVRCRIN_SSST_CODE, Lookup lineage reference object : stvssst
     * 
     */
    @JsonProperty("ssstCode")
    public void setSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withSsstCode(String ssstCode) {
        this.ssstCode = ssstCode;
        return this;
    }

    /**
     * Provider Origin
     * <p>
     * Lineage reference object : SVRCRIN_ORIG_CODE, Lookup lineage reference object : stvorig
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
     * Lineage reference object : SVRCRIN_ORIG_CODE, Lookup lineage reference object : stvorig
     * (Required)
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withOrigCode(String origCode) {
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

    public CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cintCode");
        sb.append('=');
        sb.append(((this.cintCode == null)?"<null>":this.cintCode));
        sb.append(',');
        sb.append("serviceDate");
        sb.append('=');
        sb.append(((this.serviceDate == null)?"<null>":this.serviceDate));
        sb.append(',');
        sb.append("svamstdDicdCode");
        sb.append('=');
        sb.append(((this.svamstdDicdCode == null)?"<null>":this.svamstdDicdCode));
        sb.append(',');
        sb.append("svrcrinCintCode");
        sb.append('=');
        sb.append(((this.svrcrinCintCode == null)?"<null>":this.svrcrinCintCode));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("svrcrinId");
        sb.append('=');
        sb.append(((this.svrcrinId == null)?"<null>":this.svrcrinId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("svamstdTermCode");
        sb.append('=');
        sb.append(((this.svamstdTermCode == null)?"<null>":this.svamstdTermCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.cintCode == null)? 0 :this.cintCode.hashCode()));
        result = ((result* 31)+((this.serviceDate == null)? 0 :this.serviceDate.hashCode()));
        result = ((result* 31)+((this.svamstdDicdCode == null)? 0 :this.svamstdDicdCode.hashCode()));
        result = ((result* 31)+((this.svrcrinId == null)? 0 :this.svrcrinId.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.svrcrinCintCode == null)? 0 :this.svrcrinCintCode.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.svamstdTermCode == null)? 0 :this.svamstdTermCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssstCode == null)? 0 :this.ssstCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest) == false) {
            return false;
        }
        CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest rhs = ((CaMisSuccessAndSupportServicesTermDataCareerInterest100PostRequest) other);
        return (((((((((((((this.cintCode == rhs.cintCode)||((this.cintCode!= null)&&this.cintCode.equals(rhs.cintCode)))&&((this.serviceDate == rhs.serviceDate)||((this.serviceDate!= null)&&this.serviceDate.equals(rhs.serviceDate))))&&((this.svamstdDicdCode == rhs.svamstdDicdCode)||((this.svamstdDicdCode!= null)&&this.svamstdDicdCode.equals(rhs.svamstdDicdCode))))&&((this.svrcrinId == rhs.svrcrinId)||((this.svrcrinId!= null)&&this.svrcrinId.equals(rhs.svrcrinId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.svrcrinCintCode == rhs.svrcrinCintCode)||((this.svrcrinCintCode!= null)&&this.svrcrinCintCode.equals(rhs.svrcrinCintCode))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.svamstdTermCode == rhs.svamstdTermCode)||((this.svamstdTermCode!= null)&&this.svamstdTermCode.equals(rhs.svamstdTermCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssstCode == rhs.ssstCode)||((this.ssstCode!= null)&&this.ssstCode.equals(rhs.ssstCode))));
    }

}
