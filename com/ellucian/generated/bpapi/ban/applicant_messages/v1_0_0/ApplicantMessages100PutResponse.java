
package com.ellucian.generated.bpapi.ban.applicant_messages.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "key_block",
    "rormesg"
})
@Generated("jsonschema2pojo")
public class ApplicantMessages100PutResponse {

    @JsonProperty("key_block")
    private List<KeyBlock__2> keyBlock = new ArrayList<KeyBlock__2>();
    @JsonProperty("rormesg")
    private List<Rormesg__2> rormesg = new ArrayList<Rormesg__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("key_block")
    public List<KeyBlock__2> getKeyBlock() {
        return keyBlock;
    }

    @JsonProperty("key_block")
    public void setKeyBlock(List<KeyBlock__2> keyBlock) {
        this.keyBlock = keyBlock;
    }

    public ApplicantMessages100PutResponse withKeyBlock(List<KeyBlock__2> keyBlock) {
        this.keyBlock = keyBlock;
        return this;
    }

    @JsonProperty("rormesg")
    public List<Rormesg__2> getRormesg() {
        return rormesg;
    }

    @JsonProperty("rormesg")
    public void setRormesg(List<Rormesg__2> rormesg) {
        this.rormesg = rormesg;
    }

    public ApplicantMessages100PutResponse withRormesg(List<Rormesg__2> rormesg) {
        this.rormesg = rormesg;
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

    public ApplicantMessages100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantMessages100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyBlock");
        sb.append('=');
        sb.append(((this.keyBlock == null)?"<null>":this.keyBlock));
        sb.append(',');
        sb.append("rormesg");
        sb.append('=');
        sb.append(((this.rormesg == null)?"<null>":this.rormesg));
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
        result = ((result* 31)+((this.rormesg == null)? 0 :this.rormesg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyBlock == null)? 0 :this.keyBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantMessages100PutResponse) == false) {
            return false;
        }
        ApplicantMessages100PutResponse rhs = ((ApplicantMessages100PutResponse) other);
        return ((((this.rormesg == rhs.rormesg)||((this.rormesg!= null)&&this.rormesg.equals(rhs.rormesg)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyBlock == rhs.keyBlock)||((this.keyBlock!= null)&&this.keyBlock.equals(rhs.keyBlock))));
    }

}
