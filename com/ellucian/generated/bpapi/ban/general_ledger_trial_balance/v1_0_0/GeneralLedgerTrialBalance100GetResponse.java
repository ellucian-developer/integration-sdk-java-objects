
package com.ellucian.generated.bpapi.ban.general_ledger_trial_balance.v1_0_0;

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
    "fgvtbl1_block",
    "fgvtbl1_block_tot"
})
@Generated("jsonschema2pojo")
public class GeneralLedgerTrialBalance100GetResponse {

    @JsonProperty("fgvtbl1_block")
    private List<Fgvtbl1Block> fgvtbl1Block = new ArrayList<Fgvtbl1Block>();
    @JsonProperty("fgvtbl1_block_tot")
    private List<Fgvtbl1BlockTot> fgvtbl1BlockTot = new ArrayList<Fgvtbl1BlockTot>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fgvtbl1_block")
    public List<Fgvtbl1Block> getFgvtbl1Block() {
        return fgvtbl1Block;
    }

    @JsonProperty("fgvtbl1_block")
    public void setFgvtbl1Block(List<Fgvtbl1Block> fgvtbl1Block) {
        this.fgvtbl1Block = fgvtbl1Block;
    }

    public GeneralLedgerTrialBalance100GetResponse withFgvtbl1Block(List<Fgvtbl1Block> fgvtbl1Block) {
        this.fgvtbl1Block = fgvtbl1Block;
        return this;
    }

    @JsonProperty("fgvtbl1_block_tot")
    public List<Fgvtbl1BlockTot> getFgvtbl1BlockTot() {
        return fgvtbl1BlockTot;
    }

    @JsonProperty("fgvtbl1_block_tot")
    public void setFgvtbl1BlockTot(List<Fgvtbl1BlockTot> fgvtbl1BlockTot) {
        this.fgvtbl1BlockTot = fgvtbl1BlockTot;
    }

    public GeneralLedgerTrialBalance100GetResponse withFgvtbl1BlockTot(List<Fgvtbl1BlockTot> fgvtbl1BlockTot) {
        this.fgvtbl1BlockTot = fgvtbl1BlockTot;
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

    public GeneralLedgerTrialBalance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralLedgerTrialBalance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fgvtbl1Block");
        sb.append('=');
        sb.append(((this.fgvtbl1Block == null)?"<null>":this.fgvtbl1Block));
        sb.append(',');
        sb.append("fgvtbl1BlockTot");
        sb.append('=');
        sb.append(((this.fgvtbl1BlockTot == null)?"<null>":this.fgvtbl1BlockTot));
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
        result = ((result* 31)+((this.fgvtbl1Block == null)? 0 :this.fgvtbl1Block.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fgvtbl1BlockTot == null)? 0 :this.fgvtbl1BlockTot.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralLedgerTrialBalance100GetResponse) == false) {
            return false;
        }
        GeneralLedgerTrialBalance100GetResponse rhs = ((GeneralLedgerTrialBalance100GetResponse) other);
        return ((((this.fgvtbl1Block == rhs.fgvtbl1Block)||((this.fgvtbl1Block!= null)&&this.fgvtbl1Block.equals(rhs.fgvtbl1Block)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fgvtbl1BlockTot == rhs.fgvtbl1BlockTot)||((this.fgvtbl1BlockTot!= null)&&this.fgvtbl1BlockTot.equals(rhs.fgvtbl1BlockTot))));
    }

}
