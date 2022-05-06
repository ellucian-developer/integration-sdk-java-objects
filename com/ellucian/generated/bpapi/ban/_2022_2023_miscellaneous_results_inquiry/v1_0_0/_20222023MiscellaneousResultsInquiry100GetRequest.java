
package com.ellucian.generated.bpapi.ban._2022_2023_miscellaneous_results_inquiry.v1_0_0;

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
    "keyblckInfcCode",
    "keyblckSeqNo"
})
@Generated("jsonschema2pojo")
public class _20222023MiscellaneousResultsInquiry100GetRequest {

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
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    @JsonPropertyDescription("Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc")
    private Object keyblckInfcCode;
    /**
     * Sequence No
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    @JsonPropertyDescription("Lineage reference object : keyblckSeqNo")
    private Object keyblckSeqNo;
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

    public _20222023MiscellaneousResultsInquiry100GetRequest withKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    public Object getKeyblckInfcCode() {
        return keyblckInfcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    public void setKeyblckInfcCode(Object keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
    }

    public _20222023MiscellaneousResultsInquiry100GetRequest withKeyblckInfcCode(Object keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
        return this;
    }

    /**
     * Sequence No
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    public Object getKeyblckSeqNo() {
        return keyblckSeqNo;
    }

    /**
     * Sequence No
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    public void setKeyblckSeqNo(Object keyblckSeqNo) {
        this.keyblckSeqNo = keyblckSeqNo;
    }

    public _20222023MiscellaneousResultsInquiry100GetRequest withKeyblckSeqNo(Object keyblckSeqNo) {
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

    public _20222023MiscellaneousResultsInquiry100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20222023MiscellaneousResultsInquiry100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
        sb.append(',');
        sb.append("keyblckInfcCode");
        sb.append('=');
        sb.append(((this.keyblckInfcCode == null)?"<null>":this.keyblckInfcCode));
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
        if ((other instanceof _20222023MiscellaneousResultsInquiry100GetRequest) == false) {
            return false;
        }
        _20222023MiscellaneousResultsInquiry100GetRequest rhs = ((_20222023MiscellaneousResultsInquiry100GetRequest) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.keyblckSeqNo == rhs.keyblckSeqNo)||((this.keyblckSeqNo!= null)&&this.keyblckSeqNo.equals(rhs.keyblckSeqNo))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))))&&((this.keyblckInfcCode == rhs.keyblckInfcCode)||((this.keyblckInfcCode!= null)&&this.keyblckInfcCode.equals(rhs.keyblckInfcCode))));
    }

}
