
package com.ellucian.generated.bpapi.ban.document_history.v1_0_0;

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
    "statusDesc",
    "fordchcStatus",
    "docTypeDesc",
    "fordchcDocCode"
})
@Generated("jsonschema2pojo")
public class DocumentHistory100GetResponse {

    @JsonProperty("statusDesc")
    private String statusDesc;
    /**
     * Status
     * <p>
     * Lineage reference object : FORDCHC_STATUS
     * 
     */
    @JsonProperty("fordchcStatus")
    @JsonPropertyDescription("Lineage reference object : FORDCHC_STATUS")
    private String fordchcStatus;
    @JsonProperty("docTypeDesc")
    private String docTypeDesc;
    /**
     * Document Number
     * <p>
     * Lineage reference object : FORDCHC_DOC_CODE
     * 
     */
    @JsonProperty("fordchcDocCode")
    @JsonPropertyDescription("Lineage reference object : FORDCHC_DOC_CODE")
    private String fordchcDocCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("statusDesc")
    public String getStatusDesc() {
        return statusDesc;
    }

    @JsonProperty("statusDesc")
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public DocumentHistory100GetResponse withStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FORDCHC_STATUS
     * 
     */
    @JsonProperty("fordchcStatus")
    public String getFordchcStatus() {
        return fordchcStatus;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : FORDCHC_STATUS
     * 
     */
    @JsonProperty("fordchcStatus")
    public void setFordchcStatus(String fordchcStatus) {
        this.fordchcStatus = fordchcStatus;
    }

    public DocumentHistory100GetResponse withFordchcStatus(String fordchcStatus) {
        this.fordchcStatus = fordchcStatus;
        return this;
    }

    @JsonProperty("docTypeDesc")
    public String getDocTypeDesc() {
        return docTypeDesc;
    }

    @JsonProperty("docTypeDesc")
    public void setDocTypeDesc(String docTypeDesc) {
        this.docTypeDesc = docTypeDesc;
    }

    public DocumentHistory100GetResponse withDocTypeDesc(String docTypeDesc) {
        this.docTypeDesc = docTypeDesc;
        return this;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : FORDCHC_DOC_CODE
     * 
     */
    @JsonProperty("fordchcDocCode")
    public String getFordchcDocCode() {
        return fordchcDocCode;
    }

    /**
     * Document Number
     * <p>
     * Lineage reference object : FORDCHC_DOC_CODE
     * 
     */
    @JsonProperty("fordchcDocCode")
    public void setFordchcDocCode(String fordchcDocCode) {
        this.fordchcDocCode = fordchcDocCode;
    }

    public DocumentHistory100GetResponse withFordchcDocCode(String fordchcDocCode) {
        this.fordchcDocCode = fordchcDocCode;
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

    public DocumentHistory100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentHistory100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statusDesc");
        sb.append('=');
        sb.append(((this.statusDesc == null)?"<null>":this.statusDesc));
        sb.append(',');
        sb.append("fordchcStatus");
        sb.append('=');
        sb.append(((this.fordchcStatus == null)?"<null>":this.fordchcStatus));
        sb.append(',');
        sb.append("docTypeDesc");
        sb.append('=');
        sb.append(((this.docTypeDesc == null)?"<null>":this.docTypeDesc));
        sb.append(',');
        sb.append("fordchcDocCode");
        sb.append('=');
        sb.append(((this.fordchcDocCode == null)?"<null>":this.fordchcDocCode));
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
        result = ((result* 31)+((this.fordchcStatus == null)? 0 :this.fordchcStatus.hashCode()));
        result = ((result* 31)+((this.statusDesc == null)? 0 :this.statusDesc.hashCode()));
        result = ((result* 31)+((this.docTypeDesc == null)? 0 :this.docTypeDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fordchcDocCode == null)? 0 :this.fordchcDocCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentHistory100GetResponse) == false) {
            return false;
        }
        DocumentHistory100GetResponse rhs = ((DocumentHistory100GetResponse) other);
        return ((((((this.fordchcStatus == rhs.fordchcStatus)||((this.fordchcStatus!= null)&&this.fordchcStatus.equals(rhs.fordchcStatus)))&&((this.statusDesc == rhs.statusDesc)||((this.statusDesc!= null)&&this.statusDesc.equals(rhs.statusDesc))))&&((this.docTypeDesc == rhs.docTypeDesc)||((this.docTypeDesc!= null)&&this.docTypeDesc.equals(rhs.docTypeDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fordchcDocCode == rhs.fordchcDocCode)||((this.fordchcDocCode!= null)&&this.fordchcDocCode.equals(rhs.fordchcDocCode))));
    }

}
