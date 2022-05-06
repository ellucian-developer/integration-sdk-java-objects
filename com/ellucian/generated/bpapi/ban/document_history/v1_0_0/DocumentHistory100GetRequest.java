
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
    "displayDtypCode",
    "fordchcStatus",
    "displayDocCode",
    "fordchcDocCode"
})
@Generated("jsonschema2pojo")
public class DocumentHistory100GetRequest {

    /**
     * Document Type
     * <p>
     * Lineage reference object : displayDtypCode, Lookup lineage reference object : ftvdtyp
     * 
     */
    @JsonProperty("displayDtypCode")
    @JsonPropertyDescription("Lineage reference object : displayDtypCode, Lookup lineage reference object : ftvdtyp")
    private Object displayDtypCode;
    /**
     * Status
     * <p>
     * Lineage reference object : FORDCHC_STATUS
     * 
     */
    @JsonProperty("fordchcStatus")
    @JsonPropertyDescription("Lineage reference object : FORDCHC_STATUS")
    private String fordchcStatus;
    /**
     * Document Code
     * <p>
     * Lineage reference object : displayDocCode
     * 
     */
    @JsonProperty("displayDocCode")
    @JsonPropertyDescription("Lineage reference object : displayDocCode")
    private Object displayDocCode;
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

    /**
     * Document Type
     * <p>
     * Lineage reference object : displayDtypCode, Lookup lineage reference object : ftvdtyp
     * 
     */
    @JsonProperty("displayDtypCode")
    public Object getDisplayDtypCode() {
        return displayDtypCode;
    }

    /**
     * Document Type
     * <p>
     * Lineage reference object : displayDtypCode, Lookup lineage reference object : ftvdtyp
     * 
     */
    @JsonProperty("displayDtypCode")
    public void setDisplayDtypCode(Object displayDtypCode) {
        this.displayDtypCode = displayDtypCode;
    }

    public DocumentHistory100GetRequest withDisplayDtypCode(Object displayDtypCode) {
        this.displayDtypCode = displayDtypCode;
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

    public DocumentHistory100GetRequest withFordchcStatus(String fordchcStatus) {
        this.fordchcStatus = fordchcStatus;
        return this;
    }

    /**
     * Document Code
     * <p>
     * Lineage reference object : displayDocCode
     * 
     */
    @JsonProperty("displayDocCode")
    public Object getDisplayDocCode() {
        return displayDocCode;
    }

    /**
     * Document Code
     * <p>
     * Lineage reference object : displayDocCode
     * 
     */
    @JsonProperty("displayDocCode")
    public void setDisplayDocCode(Object displayDocCode) {
        this.displayDocCode = displayDocCode;
    }

    public DocumentHistory100GetRequest withDisplayDocCode(Object displayDocCode) {
        this.displayDocCode = displayDocCode;
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

    public DocumentHistory100GetRequest withFordchcDocCode(String fordchcDocCode) {
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

    public DocumentHistory100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentHistory100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayDtypCode");
        sb.append('=');
        sb.append(((this.displayDtypCode == null)?"<null>":this.displayDtypCode));
        sb.append(',');
        sb.append("fordchcStatus");
        sb.append('=');
        sb.append(((this.fordchcStatus == null)?"<null>":this.fordchcStatus));
        sb.append(',');
        sb.append("displayDocCode");
        sb.append('=');
        sb.append(((this.displayDocCode == null)?"<null>":this.displayDocCode));
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
        result = ((result* 31)+((this.displayDocCode == null)? 0 :this.displayDocCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayDtypCode == null)? 0 :this.displayDtypCode.hashCode()));
        result = ((result* 31)+((this.fordchcDocCode == null)? 0 :this.fordchcDocCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentHistory100GetRequest) == false) {
            return false;
        }
        DocumentHistory100GetRequest rhs = ((DocumentHistory100GetRequest) other);
        return ((((((this.fordchcStatus == rhs.fordchcStatus)||((this.fordchcStatus!= null)&&this.fordchcStatus.equals(rhs.fordchcStatus)))&&((this.displayDocCode == rhs.displayDocCode)||((this.displayDocCode!= null)&&this.displayDocCode.equals(rhs.displayDocCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayDtypCode == rhs.displayDtypCode)||((this.displayDtypCode!= null)&&this.displayDtypCode.equals(rhs.displayDtypCode))))&&((this.fordchcDocCode == rhs.fordchcDocCode)||((this.fordchcDocCode!= null)&&this.fordchcDocCode.equals(rhs.fordchcDocCode))));
    }

}
