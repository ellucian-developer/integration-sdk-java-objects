
package com.ellucian.generated.bpapi.ban.receiving_goods_query.v1_0_0;

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
    "fpbrchd_block",
    "fpbrcdt_block"
})
@Generated("jsonschema2pojo")
public class ReceivingGoodsQuery100GetResponse {

    @JsonProperty("fpbrchd_block")
    private List<FpbrchdBlock> fpbrchdBlock = new ArrayList<FpbrchdBlock>();
    @JsonProperty("fpbrcdt_block")
    private List<FpbrcdtBlock> fpbrcdtBlock = new ArrayList<FpbrcdtBlock>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fpbrchd_block")
    public List<FpbrchdBlock> getFpbrchdBlock() {
        return fpbrchdBlock;
    }

    @JsonProperty("fpbrchd_block")
    public void setFpbrchdBlock(List<FpbrchdBlock> fpbrchdBlock) {
        this.fpbrchdBlock = fpbrchdBlock;
    }

    public ReceivingGoodsQuery100GetResponse withFpbrchdBlock(List<FpbrchdBlock> fpbrchdBlock) {
        this.fpbrchdBlock = fpbrchdBlock;
        return this;
    }

    @JsonProperty("fpbrcdt_block")
    public List<FpbrcdtBlock> getFpbrcdtBlock() {
        return fpbrcdtBlock;
    }

    @JsonProperty("fpbrcdt_block")
    public void setFpbrcdtBlock(List<FpbrcdtBlock> fpbrcdtBlock) {
        this.fpbrcdtBlock = fpbrcdtBlock;
    }

    public ReceivingGoodsQuery100GetResponse withFpbrcdtBlock(List<FpbrcdtBlock> fpbrcdtBlock) {
        this.fpbrcdtBlock = fpbrcdtBlock;
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

    public ReceivingGoodsQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReceivingGoodsQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fpbrchdBlock");
        sb.append('=');
        sb.append(((this.fpbrchdBlock == null)?"<null>":this.fpbrchdBlock));
        sb.append(',');
        sb.append("fpbrcdtBlock");
        sb.append('=');
        sb.append(((this.fpbrcdtBlock == null)?"<null>":this.fpbrcdtBlock));
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
        result = ((result* 31)+((this.fpbrchdBlock == null)? 0 :this.fpbrchdBlock.hashCode()));
        result = ((result* 31)+((this.fpbrcdtBlock == null)? 0 :this.fpbrcdtBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceivingGoodsQuery100GetResponse) == false) {
            return false;
        }
        ReceivingGoodsQuery100GetResponse rhs = ((ReceivingGoodsQuery100GetResponse) other);
        return ((((this.fpbrchdBlock == rhs.fpbrchdBlock)||((this.fpbrchdBlock!= null)&&this.fpbrchdBlock.equals(rhs.fpbrchdBlock)))&&((this.fpbrcdtBlock == rhs.fpbrcdtBlock)||((this.fpbrcdtBlock!= null)&&this.fpbrcdtBlock.equals(rhs.fpbrcdtBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
