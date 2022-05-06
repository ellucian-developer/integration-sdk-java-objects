
package com.ellucian.generated.bpapi.ban.electronic_personnel_action_transaction.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "transNo",
    "effectiveDate",
    "acatCode",
    "aptyCode",
    "proxyForUserId"
})
@Generated("jsonschema2pojo")
public class ElectronicPersonnelActionTransaction100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("transNo")
    private String transNo;
    @JsonProperty("effectiveDate")
    private String effectiveDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acatCode")
    private String acatCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    private String aptyCode;
    @JsonProperty("proxyForUserId")
    private String proxyForUserId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ElectronicPersonnelActionTransaction100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("transNo")
    public String getTransNo() {
        return transNo;
    }

    @JsonProperty("transNo")
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public ElectronicPersonnelActionTransaction100QapiPost withTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }

    @JsonProperty("effectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("effectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ElectronicPersonnelActionTransaction100QapiPost withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acatCode")
    public String getAcatCode() {
        return acatCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("acatCode")
    public void setAcatCode(String acatCode) {
        this.acatCode = acatCode;
    }

    public ElectronicPersonnelActionTransaction100QapiPost withAcatCode(String acatCode) {
        this.acatCode = acatCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    public String getAptyCode() {
        return aptyCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    public void setAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
    }

    public ElectronicPersonnelActionTransaction100QapiPost withAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
        return this;
    }

    @JsonProperty("proxyForUserId")
    public String getProxyForUserId() {
        return proxyForUserId;
    }

    @JsonProperty("proxyForUserId")
    public void setProxyForUserId(String proxyForUserId) {
        this.proxyForUserId = proxyForUserId;
    }

    public ElectronicPersonnelActionTransaction100QapiPost withProxyForUserId(String proxyForUserId) {
        this.proxyForUserId = proxyForUserId;
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

    public ElectronicPersonnelActionTransaction100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicPersonnelActionTransaction100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("acatCode");
        sb.append('=');
        sb.append(((this.acatCode == null)?"<null>":this.acatCode));
        sb.append(',');
        sb.append("aptyCode");
        sb.append('=');
        sb.append(((this.aptyCode == null)?"<null>":this.aptyCode));
        sb.append(',');
        sb.append("proxyForUserId");
        sb.append('=');
        sb.append(((this.proxyForUserId == null)?"<null>":this.proxyForUserId));
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
        if ((other instanceof ElectronicPersonnelActionTransaction100QapiPost) == false) {
            return false;
        }
        ElectronicPersonnelActionTransaction100QapiPost rhs = ((ElectronicPersonnelActionTransaction100QapiPost) other);
        return ((((((((this.proxyForUserId == rhs.proxyForUserId)||((this.proxyForUserId!= null)&&this.proxyForUserId.equals(rhs.proxyForUserId)))&&((this.acatCode == rhs.acatCode)||((this.acatCode!= null)&&this.acatCode.equals(rhs.acatCode))))&&((this.aptyCode == rhs.aptyCode)||((this.aptyCode!= null)&&this.aptyCode.equals(rhs.aptyCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.transNo == rhs.transNo)||((this.transNo!= null)&&this.transNo.equals(rhs.transNo))))&&((this.effectiveDate == rhs.effectiveDate)||((this.effectiveDate!= null)&&this.effectiveDate.equals(rhs.effectiveDate))));
    }

}
