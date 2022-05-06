
package com.ellucian.generated.bpapi.ban._2017_2018_need_analysis.v1_0_0;

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
    "keyblckInfcCode",
    "keyblckPellInd",
    "keyblckSeqNo"
})
@Generated("jsonschema2pojo")
public class _20172018NeedAnalysis100QapiPost {

    @JsonProperty("keyblckStudentId")
    private String keyblckStudentId;
    @JsonProperty("keyblckInfcCode")
    private String keyblckInfcCode;
    @JsonProperty("keyblckPellInd")
    private String keyblckPellInd;
    @JsonProperty("keyblckSeqNo")
    private String keyblckSeqNo;
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

    public _20172018NeedAnalysis100QapiPost withKeyblckStudentId(String keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    @JsonProperty("keyblckInfcCode")
    public String getKeyblckInfcCode() {
        return keyblckInfcCode;
    }

    @JsonProperty("keyblckInfcCode")
    public void setKeyblckInfcCode(String keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
    }

    public _20172018NeedAnalysis100QapiPost withKeyblckInfcCode(String keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
        return this;
    }

    @JsonProperty("keyblckPellInd")
    public String getKeyblckPellInd() {
        return keyblckPellInd;
    }

    @JsonProperty("keyblckPellInd")
    public void setKeyblckPellInd(String keyblckPellInd) {
        this.keyblckPellInd = keyblckPellInd;
    }

    public _20172018NeedAnalysis100QapiPost withKeyblckPellInd(String keyblckPellInd) {
        this.keyblckPellInd = keyblckPellInd;
        return this;
    }

    @JsonProperty("keyblckSeqNo")
    public String getKeyblckSeqNo() {
        return keyblckSeqNo;
    }

    @JsonProperty("keyblckSeqNo")
    public void setKeyblckSeqNo(String keyblckSeqNo) {
        this.keyblckSeqNo = keyblckSeqNo;
    }

    public _20172018NeedAnalysis100QapiPost withKeyblckSeqNo(String keyblckSeqNo) {
        this.keyblckSeqNo = keyblckSeqNo;
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

    public _20172018NeedAnalysis100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20172018NeedAnalysis100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
        sb.append(',');
        sb.append("keyblckInfcCode");
        sb.append('=');
        sb.append(((this.keyblckInfcCode == null)?"<null>":this.keyblckInfcCode));
        sb.append(',');
        sb.append("keyblckPellInd");
        sb.append('=');
        sb.append(((this.keyblckPellInd == null)?"<null>":this.keyblckPellInd));
        sb.append(',');
        sb.append("keyblckSeqNo");
        sb.append('=');
        sb.append(((this.keyblckSeqNo == null)?"<null>":this.keyblckSeqNo));
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
        result = ((result* 31)+((this.keyblckPellInd == null)? 0 :this.keyblckPellInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckSeqNo == null)? 0 :this.keyblckSeqNo.hashCode()));
        result = ((result* 31)+((this.keyblckStudentId == null)? 0 :this.keyblckStudentId.hashCode()));
        result = ((result* 31)+((this.keyblckInfcCode == null)? 0 :this.keyblckInfcCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20172018NeedAnalysis100QapiPost) == false) {
            return false;
        }
        _20172018NeedAnalysis100QapiPost rhs = ((_20172018NeedAnalysis100QapiPost) other);
        return ((((((this.keyblckPellInd == rhs.keyblckPellInd)||((this.keyblckPellInd!= null)&&this.keyblckPellInd.equals(rhs.keyblckPellInd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckSeqNo == rhs.keyblckSeqNo)||((this.keyblckSeqNo!= null)&&this.keyblckSeqNo.equals(rhs.keyblckSeqNo))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))))&&((this.keyblckInfcCode == rhs.keyblckInfcCode)||((this.keyblckInfcCode!= null)&&this.keyblckInfcCode.equals(rhs.keyblckInfcCode))));
    }

}
