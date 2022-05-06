
package com.ellucian.generated.bpapi.ban.financial_manager_maintenance.v1_0_0;

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
    "ftvfmgr",
    "spraddr"
})
@Generated("jsonschema2pojo")
public class FinancialManagerMaintenance100GetResponse {

    @JsonProperty("ftvfmgr")
    private List<Ftvfmgr> ftvfmgr = new ArrayList<Ftvfmgr>();
    @JsonProperty("spraddr")
    private List<Spraddr> spraddr = new ArrayList<Spraddr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftvfmgr")
    public List<Ftvfmgr> getFtvfmgr() {
        return ftvfmgr;
    }

    @JsonProperty("ftvfmgr")
    public void setFtvfmgr(List<Ftvfmgr> ftvfmgr) {
        this.ftvfmgr = ftvfmgr;
    }

    public FinancialManagerMaintenance100GetResponse withFtvfmgr(List<Ftvfmgr> ftvfmgr) {
        this.ftvfmgr = ftvfmgr;
        return this;
    }

    @JsonProperty("spraddr")
    public List<Spraddr> getSpraddr() {
        return spraddr;
    }

    @JsonProperty("spraddr")
    public void setSpraddr(List<Spraddr> spraddr) {
        this.spraddr = spraddr;
    }

    public FinancialManagerMaintenance100GetResponse withSpraddr(List<Spraddr> spraddr) {
        this.spraddr = spraddr;
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

    public FinancialManagerMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialManagerMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvfmgr");
        sb.append('=');
        sb.append(((this.ftvfmgr == null)?"<null>":this.ftvfmgr));
        sb.append(',');
        sb.append("spraddr");
        sb.append('=');
        sb.append(((this.spraddr == null)?"<null>":this.spraddr));
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
        result = ((result* 31)+((this.spraddr == null)? 0 :this.spraddr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftvfmgr == null)? 0 :this.ftvfmgr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialManagerMaintenance100GetResponse) == false) {
            return false;
        }
        FinancialManagerMaintenance100GetResponse rhs = ((FinancialManagerMaintenance100GetResponse) other);
        return ((((this.spraddr == rhs.spraddr)||((this.spraddr!= null)&&this.spraddr.equals(rhs.spraddr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvfmgr == rhs.ftvfmgr)||((this.ftvfmgr!= null)&&this.ftvfmgr.equals(rhs.ftvfmgr))));
    }

}
