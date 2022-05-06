
package com.ellucian.generated.bpapi.ban.comment_billing_mass_data_entry.v1_0_0;

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
    "tbrcmnt"
})
@Generated("jsonschema2pojo")
public class CommentBillingMassDataEntry100PostResponse {

    @JsonProperty("key_block")
    private List<KeyBlock> keyBlock = new ArrayList<KeyBlock>();
    @JsonProperty("tbrcmnt")
    private List<Tbrcmnt> tbrcmnt = new ArrayList<Tbrcmnt>();
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

    public CommentBillingMassDataEntry100PostResponse withKeyBlock(List<KeyBlock> keyBlock) {
        this.keyBlock = keyBlock;
        return this;
    }

    @JsonProperty("tbrcmnt")
    public List<Tbrcmnt> getTbrcmnt() {
        return tbrcmnt;
    }

    @JsonProperty("tbrcmnt")
    public void setTbrcmnt(List<Tbrcmnt> tbrcmnt) {
        this.tbrcmnt = tbrcmnt;
    }

    public CommentBillingMassDataEntry100PostResponse withTbrcmnt(List<Tbrcmnt> tbrcmnt) {
        this.tbrcmnt = tbrcmnt;
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

    public CommentBillingMassDataEntry100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommentBillingMassDataEntry100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyBlock");
        sb.append('=');
        sb.append(((this.keyBlock == null)?"<null>":this.keyBlock));
        sb.append(',');
        sb.append("tbrcmnt");
        sb.append('=');
        sb.append(((this.tbrcmnt == null)?"<null>":this.tbrcmnt));
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
        result = ((result* 31)+((this.keyBlock == null)? 0 :this.keyBlock.hashCode()));
        result = ((result* 31)+((this.tbrcmnt == null)? 0 :this.tbrcmnt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommentBillingMassDataEntry100PostResponse) == false) {
            return false;
        }
        CommentBillingMassDataEntry100PostResponse rhs = ((CommentBillingMassDataEntry100PostResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.keyBlock == rhs.keyBlock)||((this.keyBlock!= null)&&this.keyBlock.equals(rhs.keyBlock))))&&((this.tbrcmnt == rhs.tbrcmnt)||((this.tbrcmnt!= null)&&this.tbrcmnt.equals(rhs.tbrcmnt))));
    }

}
