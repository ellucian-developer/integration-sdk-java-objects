
package com.ellucian.generated.bpapi.ban.executive_summary.v1_0_0;

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
    "ftvacct_block",
    "net_total"
})
@Generated("jsonschema2pojo")
public class ExecutiveSummary100GetResponse {

    @JsonProperty("ftvacct_block")
    private List<FtvacctBlock> ftvacctBlock = new ArrayList<FtvacctBlock>();
    @JsonProperty("net_total")
    private List<NetTotal> netTotal = new ArrayList<NetTotal>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftvacct_block")
    public List<FtvacctBlock> getFtvacctBlock() {
        return ftvacctBlock;
    }

    @JsonProperty("ftvacct_block")
    public void setFtvacctBlock(List<FtvacctBlock> ftvacctBlock) {
        this.ftvacctBlock = ftvacctBlock;
    }

    public ExecutiveSummary100GetResponse withFtvacctBlock(List<FtvacctBlock> ftvacctBlock) {
        this.ftvacctBlock = ftvacctBlock;
        return this;
    }

    @JsonProperty("net_total")
    public List<NetTotal> getNetTotal() {
        return netTotal;
    }

    @JsonProperty("net_total")
    public void setNetTotal(List<NetTotal> netTotal) {
        this.netTotal = netTotal;
    }

    public ExecutiveSummary100GetResponse withNetTotal(List<NetTotal> netTotal) {
        this.netTotal = netTotal;
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

    public ExecutiveSummary100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExecutiveSummary100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvacctBlock");
        sb.append('=');
        sb.append(((this.ftvacctBlock == null)?"<null>":this.ftvacctBlock));
        sb.append(',');
        sb.append("netTotal");
        sb.append('=');
        sb.append(((this.netTotal == null)?"<null>":this.netTotal));
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
        result = ((result* 31)+((this.netTotal == null)? 0 :this.netTotal.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftvacctBlock == null)? 0 :this.ftvacctBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExecutiveSummary100GetResponse) == false) {
            return false;
        }
        ExecutiveSummary100GetResponse rhs = ((ExecutiveSummary100GetResponse) other);
        return ((((this.netTotal == rhs.netTotal)||((this.netTotal!= null)&&this.netTotal.equals(rhs.netTotal)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvacctBlock == rhs.ftvacctBlock)||((this.ftvacctBlock!= null)&&this.ftvacctBlock.equals(rhs.ftvacctBlock))));
    }

}
