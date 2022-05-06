
package com.ellucian.generated.bpapi.ban.vendor_detail_history.v1_0_0;

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
    "total_block",
    "fabinvh_block"
})
@Generated("jsonschema2pojo")
public class VendorDetailHistory100GetResponse {

    @JsonProperty("total_block")
    private List<TotalBlock> totalBlock = new ArrayList<TotalBlock>();
    @JsonProperty("fabinvh_block")
    private List<FabinvhBlock> fabinvhBlock = new ArrayList<FabinvhBlock>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total_block")
    public List<TotalBlock> getTotalBlock() {
        return totalBlock;
    }

    @JsonProperty("total_block")
    public void setTotalBlock(List<TotalBlock> totalBlock) {
        this.totalBlock = totalBlock;
    }

    public VendorDetailHistory100GetResponse withTotalBlock(List<TotalBlock> totalBlock) {
        this.totalBlock = totalBlock;
        return this;
    }

    @JsonProperty("fabinvh_block")
    public List<FabinvhBlock> getFabinvhBlock() {
        return fabinvhBlock;
    }

    @JsonProperty("fabinvh_block")
    public void setFabinvhBlock(List<FabinvhBlock> fabinvhBlock) {
        this.fabinvhBlock = fabinvhBlock;
    }

    public VendorDetailHistory100GetResponse withFabinvhBlock(List<FabinvhBlock> fabinvhBlock) {
        this.fabinvhBlock = fabinvhBlock;
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

    public VendorDetailHistory100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VendorDetailHistory100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalBlock");
        sb.append('=');
        sb.append(((this.totalBlock == null)?"<null>":this.totalBlock));
        sb.append(',');
        sb.append("fabinvhBlock");
        sb.append('=');
        sb.append(((this.fabinvhBlock == null)?"<null>":this.fabinvhBlock));
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
        result = ((result* 31)+((this.totalBlock == null)? 0 :this.totalBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fabinvhBlock == null)? 0 :this.fabinvhBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VendorDetailHistory100GetResponse) == false) {
            return false;
        }
        VendorDetailHistory100GetResponse rhs = ((VendorDetailHistory100GetResponse) other);
        return ((((this.totalBlock == rhs.totalBlock)||((this.totalBlock!= null)&&this.totalBlock.equals(rhs.totalBlock)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fabinvhBlock == rhs.fabinvhBlock)||((this.fabinvhBlock!= null)&&this.fabinvhBlock.equals(rhs.fabinvhBlock))));
    }

}
