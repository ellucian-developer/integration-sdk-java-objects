
package com.ellucian.generated.bpapi.ban.biling_mass_data_entry_deposits.v1_0_0;

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
    "key_block2",
    "tbrdepo"
})
@Generated("jsonschema2pojo")
public class BilingMassDataEntryDeposits100PostResponse {

    @JsonProperty("key_block2")
    private List<KeyBlock2> keyBlock2 = new ArrayList<KeyBlock2>();
    @JsonProperty("tbrdepo")
    private List<Tbrdepo> tbrdepo = new ArrayList<Tbrdepo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("key_block2")
    public List<KeyBlock2> getKeyBlock2() {
        return keyBlock2;
    }

    @JsonProperty("key_block2")
    public void setKeyBlock2(List<KeyBlock2> keyBlock2) {
        this.keyBlock2 = keyBlock2;
    }

    public BilingMassDataEntryDeposits100PostResponse withKeyBlock2(List<KeyBlock2> keyBlock2) {
        this.keyBlock2 = keyBlock2;
        return this;
    }

    @JsonProperty("tbrdepo")
    public List<Tbrdepo> getTbrdepo() {
        return tbrdepo;
    }

    @JsonProperty("tbrdepo")
    public void setTbrdepo(List<Tbrdepo> tbrdepo) {
        this.tbrdepo = tbrdepo;
    }

    public BilingMassDataEntryDeposits100PostResponse withTbrdepo(List<Tbrdepo> tbrdepo) {
        this.tbrdepo = tbrdepo;
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

    public BilingMassDataEntryDeposits100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BilingMassDataEntryDeposits100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyBlock2");
        sb.append('=');
        sb.append(((this.keyBlock2 == null)?"<null>":this.keyBlock2));
        sb.append(',');
        sb.append("tbrdepo");
        sb.append('=');
        sb.append(((this.tbrdepo == null)?"<null>":this.tbrdepo));
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
        result = ((result* 31)+((this.keyBlock2 == null)? 0 :this.keyBlock2 .hashCode()));
        result = ((result* 31)+((this.tbrdepo == null)? 0 :this.tbrdepo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BilingMassDataEntryDeposits100PostResponse) == false) {
            return false;
        }
        BilingMassDataEntryDeposits100PostResponse rhs = ((BilingMassDataEntryDeposits100PostResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.keyBlock2 == rhs.keyBlock2)||((this.keyBlock2 != null)&&this.keyBlock2 .equals(rhs.keyBlock2))))&&((this.tbrdepo == rhs.tbrdepo)||((this.tbrdepo!= null)&&this.tbrdepo.equals(rhs.tbrdepo))));
    }

}
