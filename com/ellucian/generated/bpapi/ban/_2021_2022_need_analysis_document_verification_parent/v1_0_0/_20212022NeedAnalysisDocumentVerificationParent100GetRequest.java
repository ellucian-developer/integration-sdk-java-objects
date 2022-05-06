
package com.ellucian.generated.bpapi.ban._2021_2022_need_analysis_document_verification_parent.v1_0_0;

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
    "keyblckStudentId",
    "pellInd"
})
@Generated("jsonschema2pojo")
public class _20212022NeedAnalysisDocumentVerificationParent100GetRequest {

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    @JsonPropertyDescription("Lineage reference object : keyblckStudentId")
    private Object keyblckStudentId;
    /**
     * Pell Correction
     * <p>
     * Lineage reference object : pellInd
     * 
     */
    @JsonProperty("pellInd")
    @JsonPropertyDescription("Lineage reference object : pellInd")
    private Object pellInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public Object getKeyblckStudentId() {
        return keyblckStudentId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public void setKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
    }

    public _20212022NeedAnalysisDocumentVerificationParent100GetRequest withKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    /**
     * Pell Correction
     * <p>
     * Lineage reference object : pellInd
     * 
     */
    @JsonProperty("pellInd")
    public Object getPellInd() {
        return pellInd;
    }

    /**
     * Pell Correction
     * <p>
     * Lineage reference object : pellInd
     * 
     */
    @JsonProperty("pellInd")
    public void setPellInd(Object pellInd) {
        this.pellInd = pellInd;
    }

    public _20212022NeedAnalysisDocumentVerificationParent100GetRequest withPellInd(Object pellInd) {
        this.pellInd = pellInd;
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

    public _20212022NeedAnalysisDocumentVerificationParent100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20212022NeedAnalysisDocumentVerificationParent100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
        sb.append(',');
        sb.append("pellInd");
        sb.append('=');
        sb.append(((this.pellInd == null)?"<null>":this.pellInd));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pellInd == null)? 0 :this.pellInd.hashCode()));
        result = ((result* 31)+((this.keyblckStudentId == null)? 0 :this.keyblckStudentId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20212022NeedAnalysisDocumentVerificationParent100GetRequest) == false) {
            return false;
        }
        _20212022NeedAnalysisDocumentVerificationParent100GetRequest rhs = ((_20212022NeedAnalysisDocumentVerificationParent100GetRequest) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.pellInd == rhs.pellInd)||((this.pellInd!= null)&&this.pellInd.equals(rhs.pellInd))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))));
    }

}
