
package com.ellucian.generated.bpapi.ban.electronic_personnel_action_routing.v1_0_0;

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
    "recipientUserId",
    "acatCode",
    "aptyCode",
    "norroutActionInd",
    "id",
    "transNo",
    "effectiveDate",
    "alvlCode"
})
@Generated("jsonschema2pojo")
public class ElectronicPersonnelActionRouting100PostRequest {

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
     * User ID
     * <p>
     * Lineage reference object : NORROUT_RECIPIENT_USER_ID
     * 
     */
    @JsonProperty("recipientUserId")
    @JsonPropertyDescription("Lineage reference object : NORROUT_RECIPIENT_USER_ID")
    private String recipientUserId;
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
     * Required Action
     * <p>
     * Lineage reference object : NORROUT_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("norroutActionInd")
    @JsonPropertyDescription("Lineage reference object : NORROUT_ACTION_IND")
    private String norroutActionInd;
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
    /**
     * Level Code
     * <p>
     * Lineage reference object : NORROUT_ALVL_CODE, Lookup lineage reference object : ntralvl
     * (Required)
     * 
     */
    @JsonProperty("alvlCode")
    @JsonPropertyDescription("Lineage reference object : NORROUT_ALVL_CODE, Lookup lineage reference object : ntralvl")
    private String alvlCode;
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

    public ElectronicPersonnelActionRouting100PostRequest withProxyForUserId(String proxyForUserId) {
        this.proxyForUserId = proxyForUserId;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : NORROUT_RECIPIENT_USER_ID
     * 
     */
    @JsonProperty("recipientUserId")
    public String getRecipientUserId() {
        return recipientUserId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : NORROUT_RECIPIENT_USER_ID
     * 
     */
    @JsonProperty("recipientUserId")
    public void setRecipientUserId(String recipientUserId) {
        this.recipientUserId = recipientUserId;
    }

    public ElectronicPersonnelActionRouting100PostRequest withRecipientUserId(String recipientUserId) {
        this.recipientUserId = recipientUserId;
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

    public ElectronicPersonnelActionRouting100PostRequest withAcatCode(String acatCode) {
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

    public ElectronicPersonnelActionRouting100PostRequest withAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
        return this;
    }

    /**
     * Required Action
     * <p>
     * Lineage reference object : NORROUT_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("norroutActionInd")
    public String getNorroutActionInd() {
        return norroutActionInd;
    }

    /**
     * Required Action
     * <p>
     * Lineage reference object : NORROUT_ACTION_IND
     * (Required)
     * 
     */
    @JsonProperty("norroutActionInd")
    public void setNorroutActionInd(String norroutActionInd) {
        this.norroutActionInd = norroutActionInd;
    }

    public ElectronicPersonnelActionRouting100PostRequest withNorroutActionInd(String norroutActionInd) {
        this.norroutActionInd = norroutActionInd;
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

    public ElectronicPersonnelActionRouting100PostRequest withId(String id) {
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

    public ElectronicPersonnelActionRouting100PostRequest withTransNo(Double transNo) {
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

    public ElectronicPersonnelActionRouting100PostRequest withEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : NORROUT_ALVL_CODE, Lookup lineage reference object : ntralvl
     * (Required)
     * 
     */
    @JsonProperty("alvlCode")
    public String getAlvlCode() {
        return alvlCode;
    }

    /**
     * Level Code
     * <p>
     * Lineage reference object : NORROUT_ALVL_CODE, Lookup lineage reference object : ntralvl
     * (Required)
     * 
     */
    @JsonProperty("alvlCode")
    public void setAlvlCode(String alvlCode) {
        this.alvlCode = alvlCode;
    }

    public ElectronicPersonnelActionRouting100PostRequest withAlvlCode(String alvlCode) {
        this.alvlCode = alvlCode;
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

    public ElectronicPersonnelActionRouting100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicPersonnelActionRouting100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("proxyForUserId");
        sb.append('=');
        sb.append(((this.proxyForUserId == null)?"<null>":this.proxyForUserId));
        sb.append(',');
        sb.append("recipientUserId");
        sb.append('=');
        sb.append(((this.recipientUserId == null)?"<null>":this.recipientUserId));
        sb.append(',');
        sb.append("acatCode");
        sb.append('=');
        sb.append(((this.acatCode == null)?"<null>":this.acatCode));
        sb.append(',');
        sb.append("aptyCode");
        sb.append('=');
        sb.append(((this.aptyCode == null)?"<null>":this.aptyCode));
        sb.append(',');
        sb.append("norroutActionInd");
        sb.append('=');
        sb.append(((this.norroutActionInd == null)?"<null>":this.norroutActionInd));
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
        sb.append("alvlCode");
        sb.append('=');
        sb.append(((this.alvlCode == null)?"<null>":this.alvlCode));
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
        result = ((result* 31)+((this.recipientUserId == null)? 0 :this.recipientUserId.hashCode()));
        result = ((result* 31)+((this.acatCode == null)? 0 :this.acatCode.hashCode()));
        result = ((result* 31)+((this.aptyCode == null)? 0 :this.aptyCode.hashCode()));
        result = ((result* 31)+((this.norroutActionInd == null)? 0 :this.norroutActionInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.transNo == null)? 0 :this.transNo.hashCode()));
        result = ((result* 31)+((this.effectiveDate == null)? 0 :this.effectiveDate.hashCode()));
        result = ((result* 31)+((this.alvlCode == null)? 0 :this.alvlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicPersonnelActionRouting100PostRequest) == false) {
            return false;
        }
        ElectronicPersonnelActionRouting100PostRequest rhs = ((ElectronicPersonnelActionRouting100PostRequest) other);
        return (((((((((((this.proxyForUserId == rhs.proxyForUserId)||((this.proxyForUserId!= null)&&this.proxyForUserId.equals(rhs.proxyForUserId)))&&((this.recipientUserId == rhs.recipientUserId)||((this.recipientUserId!= null)&&this.recipientUserId.equals(rhs.recipientUserId))))&&((this.acatCode == rhs.acatCode)||((this.acatCode!= null)&&this.acatCode.equals(rhs.acatCode))))&&((this.aptyCode == rhs.aptyCode)||((this.aptyCode!= null)&&this.aptyCode.equals(rhs.aptyCode))))&&((this.norroutActionInd == rhs.norroutActionInd)||((this.norroutActionInd!= null)&&this.norroutActionInd.equals(rhs.norroutActionInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.transNo == rhs.transNo)||((this.transNo!= null)&&this.transNo.equals(rhs.transNo))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))))&&((this.alvlCode == rhs.alvlCode)||((this.alvlCode!= null)&&this.alvlCode.equals(rhs.alvlCode))));
    }

}
