
package com.ellucian.generated.bpapi.ban.applicant_mail.v1_0_0;

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
    "gurmail"
})
@Generated("jsonschema2pojo")
public class ApplicantMail100GetResponse {

    @JsonProperty("key_block")
    private List<KeyBlock> keyBlock = new ArrayList<KeyBlock>();
    @JsonProperty("gurmail")
    private List<Gurmail> gurmail = new ArrayList<Gurmail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("key_block")
    public List<KeyBlock> getKeyBlock() {
        return keyBlock;
    }

    @JsonProperty("key_block")
    public void setKeyBlock(List<KeyBlock> keyBlock) {
        this.keyBlock = keyBlock;
    }

    public ApplicantMail100GetResponse withKeyBlock(List<KeyBlock> keyBlock) {
        this.keyBlock = keyBlock;
        return this;
    }

    @JsonProperty("gurmail")
    public List<Gurmail> getGurmail() {
        return gurmail;
    }

    @JsonProperty("gurmail")
    public void setGurmail(List<Gurmail> gurmail) {
        this.gurmail = gurmail;
    }

    public ApplicantMail100GetResponse withGurmail(List<Gurmail> gurmail) {
        this.gurmail = gurmail;
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

    public ApplicantMail100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantMail100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyBlock");
        sb.append('=');
        sb.append(((this.keyBlock == null)?"<null>":this.keyBlock));
        sb.append(',');
        sb.append("gurmail");
        sb.append('=');
        sb.append(((this.gurmail == null)?"<null>":this.gurmail));
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
        result = ((result* 31)+((this.gurmail == null)? 0 :this.gurmail.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyBlock == null)? 0 :this.keyBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantMail100GetResponse) == false) {
            return false;
        }
        ApplicantMail100GetResponse rhs = ((ApplicantMail100GetResponse) other);
        return ((((this.gurmail == rhs.gurmail)||((this.gurmail!= null)&&this.gurmail.equals(rhs.gurmail)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyBlock == rhs.keyBlock)||((this.keyBlock!= null)&&this.keyBlock.equals(rhs.keyBlock))));
    }

}
