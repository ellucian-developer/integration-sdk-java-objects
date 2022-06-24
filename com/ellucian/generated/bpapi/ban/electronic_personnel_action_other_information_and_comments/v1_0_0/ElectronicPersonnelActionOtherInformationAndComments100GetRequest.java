
package com.ellucian.generated.bpapi.ban.electronic_personnel_action_other_information_and_comments.v1_0_0;

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
    "proxyForUserId",
    "acatCode",
    "aptyCode",
    "id",
    "transNo",
    "effectiveDate"
})
@Generated("jsonschema2pojo")
public class ElectronicPersonnelActionOtherInformationAndComments100GetRequest {

    /**
     * Proxy For
     * <p>
     * Lineage reference object : proxyForUserId
     * 
     */
    @JsonProperty("proxyForUserId")
    @JsonPropertyDescription("Lineage reference object : proxyForUserId")
    private String proxyForUserId;
    /**
     * Approval Category
     * <p>
     * Lineage reference object : acatCode
     * 
     */
    @JsonProperty("acatCode")
    @JsonPropertyDescription("Lineage reference object : acatCode")
    private String acatCode;
    /**
     * Approval Type
     * <p>
     * Lineage reference object : aptyCode, Lookup lineage reference object : ntracat,ntvapty
     * 
     */
    @JsonProperty("aptyCode")
    @JsonPropertyDescription("Lineage reference object : aptyCode, Lookup lineage reference object : ntracat,ntvapty")
    private String aptyCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Transaction
     * <p>
     * Lineage reference object : transNo
     * 
     */
    @JsonProperty("transNo")
    @JsonPropertyDescription("Lineage reference object : transNo")
    private Double transNo;
    /**
     * Query Date
     * <p>
     * Lineage reference object : effectiveDate
     * 
     */
    @JsonProperty("effectiveDate")
    @JsonPropertyDescription("Lineage reference object : effectiveDate")
    private Date effectiveDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Proxy For
     * <p>
     * Lineage reference object : proxyForUserId
     * 
     */
    @JsonProperty("proxyForUserId")
    public String getProxyForUserId() {
        return proxyForUserId;
    }

    /**
     * Proxy For
     * <p>
     * Lineage reference object : proxyForUserId
     * 
     */
    @JsonProperty("proxyForUserId")
    public void setProxyForUserId(String proxyForUserId) {
        this.proxyForUserId = proxyForUserId;
    }

    public ElectronicPersonnelActionOtherInformationAndComments100GetRequest withProxyForUserId(String proxyForUserId) {
        this.proxyForUserId = proxyForUserId;
        return this;
    }

    /**
     * Approval Category
     * <p>
     * Lineage reference object : acatCode
     * 
     */
    @JsonProperty("acatCode")
    public String getAcatCode() {
        return acatCode;
    }

    /**
     * Approval Category
     * <p>
     * Lineage reference object : acatCode
     * 
     */
    @JsonProperty("acatCode")
    public void setAcatCode(String acatCode) {
        this.acatCode = acatCode;
    }

    public ElectronicPersonnelActionOtherInformationAndComments100GetRequest withAcatCode(String acatCode) {
        this.acatCode = acatCode;
        return this;
    }

    /**
     * Approval Type
     * <p>
     * Lineage reference object : aptyCode, Lookup lineage reference object : ntracat,ntvapty
     * 
     */
    @JsonProperty("aptyCode")
    public String getAptyCode() {
        return aptyCode;
    }

    /**
     * Approval Type
     * <p>
     * Lineage reference object : aptyCode, Lookup lineage reference object : ntracat,ntvapty
     * 
     */
    @JsonProperty("aptyCode")
    public void setAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
    }

    public ElectronicPersonnelActionOtherInformationAndComments100GetRequest withAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ElectronicPersonnelActionOtherInformationAndComments100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : transNo
     * 
     */
    @JsonProperty("transNo")
    public Double getTransNo() {
        return transNo;
    }

    /**
     * Transaction
     * <p>
     * Lineage reference object : transNo
     * 
     */
    @JsonProperty("transNo")
    public void setTransNo(Double transNo) {
        this.transNo = transNo;
    }

    public ElectronicPersonnelActionOtherInformationAndComments100GetRequest withTransNo(Double transNo) {
        this.transNo = transNo;
        return this;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : effectiveDate
     * 
     */
    @JsonProperty("effectiveDate")
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : effectiveDate
     * 
     */
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ElectronicPersonnelActionOtherInformationAndComments100GetRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public ElectronicPersonnelActionOtherInformationAndComments100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicPersonnelActionOtherInformationAndComments100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("proxyForUserId");
        sb.append('=');
        sb.append(((this.proxyForUserId == null)?"<null>":this.proxyForUserId));
        sb.append(',');
        sb.append("acatCode");
        sb.append('=');
        sb.append(((this.acatCode == null)?"<null>":this.acatCode));
        sb.append(',');
        sb.append("aptyCode");
        sb.append('=');
        sb.append(((this.aptyCode == null)?"<null>":this.aptyCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("transNo");
        sb.append('=');
        sb.append(((this.transNo == null)?"<null>":this.transNo));
        sb.append(',');
        sb.append("effectiveDate");
        sb.append('=');
        sb.append(((this.effectiveDate == null)?"<null>":this.effectiveDate));
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
        result = ((result* 31)+((this.proxyForUserId == null)? 0 :this.proxyForUserId.hashCode()));
        result = ((result* 31)+((this.acatCode == null)? 0 :this.acatCode.hashCode()));
        result = ((result* 31)+((this.aptyCode == null)? 0 :this.aptyCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.transNo == null)? 0 :this.transNo.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicPersonnelActionOtherInformationAndComments100GetRequest) == false) {
            return false;
        }
        ElectronicPersonnelActionOtherInformationAndComments100GetRequest rhs = ((ElectronicPersonnelActionOtherInformationAndComments100GetRequest) other);
        return ((((((((this.proxyForUserId == rhs.proxyForUserId)||((this.proxyForUserId!= null)&&this.proxyForUserId.equals(rhs.proxyForUserId)))&&((this.acatCode == rhs.acatCode)||((this.acatCode!= null)&&this.acatCode.equals(rhs.acatCode))))&&((this.aptyCode == rhs.aptyCode)||((this.aptyCode!= null)&&this.aptyCode.equals(rhs.aptyCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.transNo == rhs.transNo)||((this.transNo!= null)&&this.transNo.equals(rhs.transNo))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
