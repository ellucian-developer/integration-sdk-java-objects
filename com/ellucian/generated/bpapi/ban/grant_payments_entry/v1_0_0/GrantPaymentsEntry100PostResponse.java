
package com.ellucian.generated.bpapi.ban.grant_payments_entry.v1_0_0;

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
    "trraccd",
    "tbrcrcp"
})
@Generated("jsonschema2pojo")
public class GrantPaymentsEntry100PostResponse {

    @JsonProperty("trraccd")
    private List<Trraccd__1> trraccd = new ArrayList<Trraccd__1>();
    @JsonProperty("tbrcrcp")
    private List<Tbrcrcp__1> tbrcrcp = new ArrayList<Tbrcrcp__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("trraccd")
    public List<Trraccd__1> getTrraccd() {
        return trraccd;
    }

    @JsonProperty("trraccd")
    public void setTrraccd(List<Trraccd__1> trraccd) {
        this.trraccd = trraccd;
    }

    public GrantPaymentsEntry100PostResponse withTrraccd(List<Trraccd__1> trraccd) {
        this.trraccd = trraccd;
        return this;
    }

    @JsonProperty("tbrcrcp")
    public List<Tbrcrcp__1> getTbrcrcp() {
        return tbrcrcp;
    }

    @JsonProperty("tbrcrcp")
    public void setTbrcrcp(List<Tbrcrcp__1> tbrcrcp) {
        this.tbrcrcp = tbrcrcp;
    }

    public GrantPaymentsEntry100PostResponse withTbrcrcp(List<Tbrcrcp__1> tbrcrcp) {
        this.tbrcrcp = tbrcrcp;
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

    public GrantPaymentsEntry100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantPaymentsEntry100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("trraccd");
        sb.append('=');
        sb.append(((this.trraccd == null)?"<null>":this.trraccd));
        sb.append(',');
        sb.append("tbrcrcp");
        sb.append('=');
        sb.append(((this.tbrcrcp == null)?"<null>":this.tbrcrcp));
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
        result = ((result* 31)+((this.trraccd == null)? 0 :this.trraccd.hashCode()));
        result = ((result* 31)+((this.tbrcrcp == null)? 0 :this.tbrcrcp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantPaymentsEntry100PostResponse) == false) {
            return false;
        }
        GrantPaymentsEntry100PostResponse rhs = ((GrantPaymentsEntry100PostResponse) other);
        return ((((this.trraccd == rhs.trraccd)||((this.trraccd!= null)&&this.trraccd.equals(rhs.trraccd)))&&((this.tbrcrcp == rhs.tbrcrcp)||((this.tbrcrcp!= null)&&this.tbrcrcp.equals(rhs.tbrcrcp))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
