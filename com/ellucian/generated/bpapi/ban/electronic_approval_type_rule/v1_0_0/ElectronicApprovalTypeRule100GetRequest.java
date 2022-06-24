
package com.ellucian.generated.bpapi.ban.electronic_approval_type_rule.v1_0_0;

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
    "aufmCode",
    "aubkCode",
    "aptyCode",
    "applySeqNo"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalTypeRule100GetRequest {

    /**
     * Form
     * <p>
     * Lineage reference object : NTRAPFB_AUFM_CODE, Lookup lineage reference object : ntraufm
     * (Required)
     * 
     */
    @JsonProperty("aufmCode")
    @JsonPropertyDescription("Lineage reference object : NTRAPFB_AUFM_CODE, Lookup lineage reference object : ntraufm")
    private String aufmCode;
    /**
     * Block
     * <p>
     * Lineage reference object : NTRAPFB_AUBK_CODE, Lookup lineage reference object : ntraubk
     * (Required)
     * 
     */
    @JsonProperty("aubkCode")
    @JsonPropertyDescription("Lineage reference object : NTRAPFB_AUBK_CODE, Lookup lineage reference object : ntraubk")
    private String aubkCode;
    /**
     * Approval Type
     * <p>
     * Lineage reference object : aptyCode, Lookup lineage reference object : ntvapty
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    @JsonPropertyDescription("Lineage reference object : aptyCode, Lookup lineage reference object : ntvapty")
    private String aptyCode;
    /**
     * Update Databaseb Sequence Number
     * <p>
     * Lineage reference object : NTRAPFB_APPLY_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("applySeqNo")
    @JsonPropertyDescription("Lineage reference object : NTRAPFB_APPLY_SEQ_NO")
    private Double applySeqNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Form
     * <p>
     * Lineage reference object : NTRAPFB_AUFM_CODE, Lookup lineage reference object : ntraufm
     * (Required)
     * 
     */
    @JsonProperty("aufmCode")
    public String getAufmCode() {
        return aufmCode;
    }

    /**
     * Form
     * <p>
     * Lineage reference object : NTRAPFB_AUFM_CODE, Lookup lineage reference object : ntraufm
     * (Required)
     * 
     */
    @JsonProperty("aufmCode")
    public void setAufmCode(String aufmCode) {
        this.aufmCode = aufmCode;
    }

    public ElectronicApprovalTypeRule100GetRequest withAufmCode(String aufmCode) {
        this.aufmCode = aufmCode;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : NTRAPFB_AUBK_CODE, Lookup lineage reference object : ntraubk
     * (Required)
     * 
     */
    @JsonProperty("aubkCode")
    public String getAubkCode() {
        return aubkCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : NTRAPFB_AUBK_CODE, Lookup lineage reference object : ntraubk
     * (Required)
     * 
     */
    @JsonProperty("aubkCode")
    public void setAubkCode(String aubkCode) {
        this.aubkCode = aubkCode;
    }

    public ElectronicApprovalTypeRule100GetRequest withAubkCode(String aubkCode) {
        this.aubkCode = aubkCode;
        return this;
    }

    /**
     * Approval Type
     * <p>
     * Lineage reference object : aptyCode, Lookup lineage reference object : ntvapty
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
     * Lineage reference object : aptyCode, Lookup lineage reference object : ntvapty
     * (Required)
     * 
     */
    @JsonProperty("aptyCode")
    public void setAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
    }

    public ElectronicApprovalTypeRule100GetRequest withAptyCode(String aptyCode) {
        this.aptyCode = aptyCode;
        return this;
    }

    /**
     * Update Databaseb Sequence Number
     * <p>
     * Lineage reference object : NTRAPFB_APPLY_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("applySeqNo")
    public Double getApplySeqNo() {
        return applySeqNo;
    }

    /**
     * Update Databaseb Sequence Number
     * <p>
     * Lineage reference object : NTRAPFB_APPLY_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("applySeqNo")
    public void setApplySeqNo(Double applySeqNo) {
        this.applySeqNo = applySeqNo;
    }

    public ElectronicApprovalTypeRule100GetRequest withApplySeqNo(Double applySeqNo) {
        this.applySeqNo = applySeqNo;
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

    public ElectronicApprovalTypeRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalTypeRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aufmCode");
        sb.append('=');
        sb.append(((this.aufmCode == null)?"<null>":this.aufmCode));
        sb.append(',');
        sb.append("aubkCode");
        sb.append('=');
        sb.append(((this.aubkCode == null)?"<null>":this.aubkCode));
        sb.append(',');
        sb.append("aptyCode");
        sb.append('=');
        sb.append(((this.aptyCode == null)?"<null>":this.aptyCode));
        sb.append(',');
        sb.append("applySeqNo");
        sb.append('=');
        sb.append(((this.applySeqNo == null)?"<null>":this.applySeqNo));
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
        result = ((result* 31)+((this.aufmCode == null)? 0 :this.aufmCode.hashCode()));
        result = ((result* 31)+((this.aubkCode == null)? 0 :this.aubkCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.aptyCode == null)? 0 :this.aptyCode.hashCode()));
        result = ((result* 31)+((this.applySeqNo == null)? 0 :this.applySeqNo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalTypeRule100GetRequest) == false) {
            return false;
        }
        ElectronicApprovalTypeRule100GetRequest rhs = ((ElectronicApprovalTypeRule100GetRequest) other);
        return ((((((this.aufmCode == rhs.aufmCode)||((this.aufmCode!= null)&&this.aufmCode.equals(rhs.aufmCode)))&&((this.aubkCode == rhs.aubkCode)||((this.aubkCode!= null)&&this.aubkCode.equals(rhs.aubkCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.aptyCode == rhs.aptyCode)||((this.aptyCode!= null)&&this.aptyCode.equals(rhs.aptyCode))))&&((this.applySeqNo == rhs.applySeqNo)||((this.applySeqNo!= null)&&this.applySeqNo.equals(rhs.applySeqNo))));
    }

}
