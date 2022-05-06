
package com.ellucian.generated.bpapi.ban.grant_maintenance_billing.v1_0_0;

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
    "frbgrnt",
    "frbgbil"
})
@Generated("jsonschema2pojo")
public class GrantMaintenanceBilling100GetResponse {

    @JsonProperty("frbgrnt")
    private List<Frbgrnt> frbgrnt = new ArrayList<Frbgrnt>();
    @JsonProperty("frbgbil")
    private List<Frbgbil> frbgbil = new ArrayList<Frbgbil>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("frbgrnt")
    public List<Frbgrnt> getFrbgrnt() {
        return frbgrnt;
    }

    @JsonProperty("frbgrnt")
    public void setFrbgrnt(List<Frbgrnt> frbgrnt) {
        this.frbgrnt = frbgrnt;
    }

    public GrantMaintenanceBilling100GetResponse withFrbgrnt(List<Frbgrnt> frbgrnt) {
        this.frbgrnt = frbgrnt;
        return this;
    }

    @JsonProperty("frbgbil")
    public List<Frbgbil> getFrbgbil() {
        return frbgbil;
    }

    @JsonProperty("frbgbil")
    public void setFrbgbil(List<Frbgbil> frbgbil) {
        this.frbgbil = frbgbil;
    }

    public GrantMaintenanceBilling100GetResponse withFrbgbil(List<Frbgbil> frbgbil) {
        this.frbgbil = frbgbil;
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

    public GrantMaintenanceBilling100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GrantMaintenanceBilling100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("frbgrnt");
        sb.append('=');
        sb.append(((this.frbgrnt == null)?"<null>":this.frbgrnt));
        sb.append(',');
        sb.append("frbgbil");
        sb.append('=');
        sb.append(((this.frbgbil == null)?"<null>":this.frbgbil));
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
        result = ((result* 31)+((this.frbgbil == null)? 0 :this.frbgbil.hashCode()));
        result = ((result* 31)+((this.frbgrnt == null)? 0 :this.frbgrnt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GrantMaintenanceBilling100GetResponse) == false) {
            return false;
        }
        GrantMaintenanceBilling100GetResponse rhs = ((GrantMaintenanceBilling100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.frbgbil == rhs.frbgbil)||((this.frbgbil!= null)&&this.frbgbil.equals(rhs.frbgbil))))&&((this.frbgrnt == rhs.frbgrnt)||((this.frbgrnt!= null)&&this.frbgrnt.equals(rhs.frbgrnt))));
    }

}
