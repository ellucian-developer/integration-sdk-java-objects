
package com.ellucian.generated.bpapi.ban.compliance_results_inquiry.v0_1_0;

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
    "id",
    "requestNo"
})
@Generated("jsonschema2pojo")
public class ComplianceResultsInquiry010GetRequest {

    /**
     * ID
     * <p>
     * Lineage reference object : id, Lookup lineage reference object : spriden,smbpogn
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id, Lookup lineage reference object : spriden,smbpogn")
    private String id;
    /**
     * Request Number
     * <p>
     * Lineage reference object : requestNo, Lookup lineage reference object : smbpogn
     * 
     */
    @JsonProperty("requestNo")
    @JsonPropertyDescription("Lineage reference object : requestNo, Lookup lineage reference object : smbpogn")
    private Double requestNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * Lineage reference object : id, Lookup lineage reference object : spriden,smbpogn
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id, Lookup lineage reference object : spriden,smbpogn
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ComplianceResultsInquiry010GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Request Number
     * <p>
     * Lineage reference object : requestNo, Lookup lineage reference object : smbpogn
     * 
     */
    @JsonProperty("requestNo")
    public Double getRequestNo() {
        return requestNo;
    }

    /**
     * Request Number
     * <p>
     * Lineage reference object : requestNo, Lookup lineage reference object : smbpogn
     * 
     */
    @JsonProperty("requestNo")
    public void setRequestNo(Double requestNo) {
        this.requestNo = requestNo;
    }

    public ComplianceResultsInquiry010GetRequest withRequestNo(Double requestNo) {
        this.requestNo = requestNo;
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

    public ComplianceResultsInquiry010GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplianceResultsInquiry010GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requestNo");
        sb.append('=');
        sb.append(((this.requestNo == null)?"<null>":this.requestNo));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.requestNo == null)? 0 :this.requestNo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplianceResultsInquiry010GetRequest) == false) {
            return false;
        }
        ComplianceResultsInquiry010GetRequest rhs = ((ComplianceResultsInquiry010GetRequest) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.requestNo == rhs.requestNo)||((this.requestNo!= null)&&this.requestNo.equals(rhs.requestNo))));
    }

}
