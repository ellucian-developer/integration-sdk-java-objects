
package com.ellucian.generated.bpapi.ban.trial_balance_summary.v1_0_0;

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
    "fgvtbl3_block",
    "fgvtbl3_block_tot"
})
@Generated("jsonschema2pojo")
public class TrialBalanceSummary100GetResponse {

    @JsonProperty("fgvtbl3_block")
    private List<Fgvtbl3Block> fgvtbl3Block = new ArrayList<Fgvtbl3Block>();
    @JsonProperty("fgvtbl3_block_tot")
    private List<Fgvtbl3BlockTot> fgvtbl3BlockTot = new ArrayList<Fgvtbl3BlockTot>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fgvtbl3_block")
    public List<Fgvtbl3Block> getFgvtbl3Block() {
        return fgvtbl3Block;
    }

    @JsonProperty("fgvtbl3_block")
    public void setFgvtbl3Block(List<Fgvtbl3Block> fgvtbl3Block) {
        this.fgvtbl3Block = fgvtbl3Block;
    }

    public TrialBalanceSummary100GetResponse withFgvtbl3Block(List<Fgvtbl3Block> fgvtbl3Block) {
        this.fgvtbl3Block = fgvtbl3Block;
        return this;
    }

    @JsonProperty("fgvtbl3_block_tot")
    public List<Fgvtbl3BlockTot> getFgvtbl3BlockTot() {
        return fgvtbl3BlockTot;
    }

    @JsonProperty("fgvtbl3_block_tot")
    public void setFgvtbl3BlockTot(List<Fgvtbl3BlockTot> fgvtbl3BlockTot) {
        this.fgvtbl3BlockTot = fgvtbl3BlockTot;
    }

    public TrialBalanceSummary100GetResponse withFgvtbl3BlockTot(List<Fgvtbl3BlockTot> fgvtbl3BlockTot) {
        this.fgvtbl3BlockTot = fgvtbl3BlockTot;
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

    public TrialBalanceSummary100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TrialBalanceSummary100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fgvtbl3Block");
        sb.append('=');
        sb.append(((this.fgvtbl3Block == null)?"<null>":this.fgvtbl3Block));
        sb.append(',');
        sb.append("fgvtbl3BlockTot");
        sb.append('=');
        sb.append(((this.fgvtbl3BlockTot == null)?"<null>":this.fgvtbl3BlockTot));
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
        result = ((result* 31)+((this.fgvtbl3BlockTot == null)? 0 :this.fgvtbl3BlockTot.hashCode()));
        result = ((result* 31)+((this.fgvtbl3Block == null)? 0 :this.fgvtbl3Block.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrialBalanceSummary100GetResponse) == false) {
            return false;
        }
        TrialBalanceSummary100GetResponse rhs = ((TrialBalanceSummary100GetResponse) other);
        return ((((this.fgvtbl3BlockTot == rhs.fgvtbl3BlockTot)||((this.fgvtbl3BlockTot!= null)&&this.fgvtbl3BlockTot.equals(rhs.fgvtbl3BlockTot)))&&((this.fgvtbl3Block == rhs.fgvtbl3Block)||((this.fgvtbl3Block!= null)&&this.fgvtbl3Block.equals(rhs.fgvtbl3Block))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
