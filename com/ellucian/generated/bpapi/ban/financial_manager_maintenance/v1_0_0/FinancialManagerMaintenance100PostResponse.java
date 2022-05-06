
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
public class FinancialManagerMaintenance100PostResponse {

    @JsonProperty("ftvfmgr")
    private List<Ftvfmgr__1> ftvfmgr = new ArrayList<Ftvfmgr__1>();
    @JsonProperty("spraddr")
    private List<Spraddr__1> spraddr = new ArrayList<Spraddr__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftvfmgr")
    public List<Ftvfmgr__1> getFtvfmgr() {
        return ftvfmgr;
    }

    @JsonProperty("ftvfmgr")
    public void setFtvfmgr(List<Ftvfmgr__1> ftvfmgr) {
        this.ftvfmgr = ftvfmgr;
    }

    public FinancialManagerMaintenance100PostResponse withFtvfmgr(List<Ftvfmgr__1> ftvfmgr) {
        this.ftvfmgr = ftvfmgr;
        return this;
    }

    @JsonProperty("spraddr")
    public List<Spraddr__1> getSpraddr() {
        return spraddr;
    }

    @JsonProperty("spraddr")
    public void setSpraddr(List<Spraddr__1> spraddr) {
        this.spraddr = spraddr;
    }

    public FinancialManagerMaintenance100PostResponse withSpraddr(List<Spraddr__1> spraddr) {
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

    public FinancialManagerMaintenance100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialManagerMaintenance100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof FinancialManagerMaintenance100PostResponse) == false) {
            return false;
        }
        FinancialManagerMaintenance100PostResponse rhs = ((FinancialManagerMaintenance100PostResponse) other);
        return ((((this.spraddr == rhs.spraddr)||((this.spraddr!= null)&&this.spraddr.equals(rhs.spraddr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvfmgr == rhs.ftvfmgr)||((this.ftvfmgr!= null)&&this.ftvfmgr.equals(rhs.ftvfmgr))));
    }

}
