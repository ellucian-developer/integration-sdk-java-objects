
package com.ellucian.generated.bpapi.ban._2021_2022_need_analysis_document_verification_parent.v1_0_0;

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
    "keyblckStudentId",
    "pellInd"
})
@Generated("jsonschema2pojo")
public class _20212022NeedAnalysisDocumentVerificationParent100QapiPost {

    @JsonProperty("keyblckStudentId")
    private String keyblckStudentId;
    @JsonProperty("pellInd")
    private String pellInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckStudentId")
    public String getKeyblckStudentId() {
        return keyblckStudentId;
    }

    @JsonProperty("keyblckStudentId")
    public void setKeyblckStudentId(String keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
    }

    public _20212022NeedAnalysisDocumentVerificationParent100QapiPost withKeyblckStudentId(String keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    @JsonProperty("pellInd")
    public String getPellInd() {
        return pellInd;
    }

    @JsonProperty("pellInd")
    public void setPellInd(String pellInd) {
        this.pellInd = pellInd;
    }

    public _20212022NeedAnalysisDocumentVerificationParent100QapiPost withPellInd(String pellInd) {
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

    public _20212022NeedAnalysisDocumentVerificationParent100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20212022NeedAnalysisDocumentVerificationParent100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof _20212022NeedAnalysisDocumentVerificationParent100QapiPost) == false) {
            return false;
        }
        _20212022NeedAnalysisDocumentVerificationParent100QapiPost rhs = ((_20212022NeedAnalysisDocumentVerificationParent100QapiPost) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.pellInd == rhs.pellInd)||((this.pellInd!= null)&&this.pellInd.equals(rhs.pellInd))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))));
    }

}
