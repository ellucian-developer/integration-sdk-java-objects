
package com.ellucian.generated.bpapi.ban.transactions_in_process_status.v1_0_0;

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
    "fgrbako",
    "total_block"
})
@Generated("jsonschema2pojo")
public class TransactionsInProcessStatus100GetResponse {

    @JsonProperty("fgrbako")
    private List<Fgrbako> fgrbako = new ArrayList<Fgrbako>();
    @JsonProperty("total_block")
    private List<TotalBlock> totalBlock = new ArrayList<TotalBlock>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fgrbako")
    public List<Fgrbako> getFgrbako() {
        return fgrbako;
    }

    @JsonProperty("fgrbako")
    public void setFgrbako(List<Fgrbako> fgrbako) {
        this.fgrbako = fgrbako;
    }

    public TransactionsInProcessStatus100GetResponse withFgrbako(List<Fgrbako> fgrbako) {
        this.fgrbako = fgrbako;
        return this;
    }

    @JsonProperty("total_block")
    public List<TotalBlock> getTotalBlock() {
        return totalBlock;
    }

    @JsonProperty("total_block")
    public void setTotalBlock(List<TotalBlock> totalBlock) {
        this.totalBlock = totalBlock;
    }

    public TransactionsInProcessStatus100GetResponse withTotalBlock(List<TotalBlock> totalBlock) {
        this.totalBlock = totalBlock;
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

    public TransactionsInProcessStatus100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionsInProcessStatus100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fgrbako");
        sb.append('=');
        sb.append(((this.fgrbako == null)?"<null>":this.fgrbako));
        sb.append(',');
        sb.append("totalBlock");
        sb.append('=');
        sb.append(((this.totalBlock == null)?"<null>":this.totalBlock));
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
        result = ((result* 31)+((this.fgrbako == null)? 0 :this.fgrbako.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionsInProcessStatus100GetResponse) == false) {
            return false;
        }
        TransactionsInProcessStatus100GetResponse rhs = ((TransactionsInProcessStatus100GetResponse) other);
        return ((((this.totalBlock == rhs.totalBlock)||((this.totalBlock!= null)&&this.totalBlock.equals(rhs.totalBlock)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fgrbako == rhs.fgrbako)||((this.fgrbako!= null)&&this.fgrbako.equals(rhs.fgrbako))));
    }

}
