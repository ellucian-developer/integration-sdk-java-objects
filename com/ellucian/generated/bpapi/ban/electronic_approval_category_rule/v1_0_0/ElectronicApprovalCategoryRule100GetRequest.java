
package com.ellucian.generated.bpapi.ban.electronic_approval_category_rule.v1_0_0;

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
    "acatCode",
    "aptyEntrySeqNo",
    "aptyCode"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalCategoryRule100GetRequest {

    /**
     * Approval Category
     * <p>
     * Lineage reference object : acatCode
     * (Required)
     * 
     */
    @JsonProperty("acatCode")
    @JsonPropertyDescription("Lineage reference object : acatCode")
    private String acatCode;
    /**
     * Approval Type Entry Sequence Number
     * <p>
     * Lineage reference object : NTRACAT_APTY_ENTRY_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("aptyEntrySeqNo")
    @JsonPropertyDescription("Lineage reference object : NTRACAT_APTY_ENTRY_SEQ_NO")
    private Double aptyEntrySeqNo;
    /**
     * Approval Type
     * <p>
     * Lineage reference object : NTRACAT_APTY_CODE, Lookup lineage reference object : ntvapty
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    @JsonPropertyDescription("Lineage reference object : NTRACAT_APTY_CODE, Lookup lineage reference object : ntvapty")
    private String aptyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Approval Category
     * <p>
     * Lineage reference object : acatCode
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("acatCode")
    public void setAcatCode(String acatCode) {
        this.acatCode = acatCode;
    }

    public ElectronicApprovalCategoryRule100GetRequest withAcatCode(String acatCode) {
        this.acatCode = acatCode;
        return this;
    }

    /**
     * Approval Type Entry Sequence Number
     * <p>
     * Lineage reference object : NTRACAT_APTY_ENTRY_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("aptyEntrySeqNo")
    public Double getAptyEntrySeqNo() {
        return aptyEntrySeqNo;
    }

    /**
     * Approval Type Entry Sequence Number
     * <p>
     * Lineage reference object : NTRACAT_APTY_ENTRY_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("aptyEntrySeqNo")
    public void setAptyEntrySeqNo(Double aptyEntrySeqNo) {
        this.aptyEntrySeqNo = aptyEntrySeqNo;
    }

    public ElectronicApprovalCategoryRule100GetRequest withAptyEntrySeqNo(Double aptyEntrySeqNo) {
        this.aptyEntrySeqNo = aptyEntrySeqNo;
        return this;
    }

    /**
     * Approval Type
     * <p>
     * Lineage reference object : NTRACAT_APTY_CODE, Lookup lineage reference object : ntvapty
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    public String getAptyCode() {
        return aptyCode;
    }

    /**
     * Approval Type
     * <p>
     * Lineage reference object : NTRACAT_APTY_CODE, Lookup lineage reference object : ntvapty
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    public void setAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
    }

    public ElectronicApprovalCategoryRule100GetRequest withAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
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

    public ElectronicApprovalCategoryRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalCategoryRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acatCode");
        sb.append('=');
        sb.append(((this.acatCode == null)?"<null>":this.acatCode));
        sb.append(',');
        sb.append("aptyEntrySeqNo");
        sb.append('=');
        sb.append(((this.aptyEntrySeqNo == null)?"<null>":this.aptyEntrySeqNo));
        sb.append(',');
        sb.append("aptyCode");
        sb.append('=');
        sb.append(((this.aptyCode == null)?"<null>":this.aptyCode));
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
        result = ((result* 31)+((this.acatCode == null)? 0 :this.acatCode.hashCode()));
        result = ((result* 31)+((this.aptyEntrySeqNo == null)? 0 :this.aptyEntrySeqNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.aptyCode == null)? 0 :this.aptyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalCategoryRule100GetRequest) == false) {
            return false;
        }
        ElectronicApprovalCategoryRule100GetRequest rhs = ((ElectronicApprovalCategoryRule100GetRequest) other);
        return (((((this.acatCode == rhs.acatCode)||((this.acatCode!= null)&&this.acatCode.equals(rhs.acatCode)))&&((this.aptyEntrySeqNo == rhs.aptyEntrySeqNo)||((this.aptyEntrySeqNo!= null)&&this.aptyEntrySeqNo.equals(rhs.aptyEntrySeqNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.aptyCode == rhs.aptyCode)||((this.aptyCode!= null)&&this.aptyCode.equals(rhs.aptyCode))));
    }

}
