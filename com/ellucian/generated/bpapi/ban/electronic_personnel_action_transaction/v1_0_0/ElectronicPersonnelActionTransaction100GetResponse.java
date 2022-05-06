
package com.ellucian.generated.bpapi.ban.electronic_personnel_action_transaction.v1_0_0;

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
    "nortran",
    "nobtran"
})
@Generated("jsonschema2pojo")
public class ElectronicPersonnelActionTransaction100GetResponse {

    @JsonProperty("nortran")
    private List<Nortran> nortran = new ArrayList<Nortran>();
    @JsonProperty("nobtran")
    private List<Nobtran> nobtran = new ArrayList<Nobtran>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nortran")
    public List<Nortran> getNortran() {
        return nortran;
    }

    @JsonProperty("nortran")
    public void setNortran(List<Nortran> nortran) {
        this.nortran = nortran;
    }

    public ElectronicPersonnelActionTransaction100GetResponse withNortran(List<Nortran> nortran) {
        this.nortran = nortran;
        return this;
    }

    @JsonProperty("nobtran")
    public List<Nobtran> getNobtran() {
        return nobtran;
    }

    @JsonProperty("nobtran")
    public void setNobtran(List<Nobtran> nobtran) {
        this.nobtran = nobtran;
    }

    public ElectronicPersonnelActionTransaction100GetResponse withNobtran(List<Nobtran> nobtran) {
        this.nobtran = nobtran;
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

    public ElectronicPersonnelActionTransaction100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicPersonnelActionTransaction100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nortran");
        sb.append('=');
        sb.append(((this.nortran == null)?"<null>":this.nortran));
        sb.append(',');
        sb.append("nobtran");
        sb.append('=');
        sb.append(((this.nobtran == null)?"<null>":this.nobtran));
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
        result = ((result* 31)+((this.nortran == null)? 0 :this.nortran.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nobtran == null)? 0 :this.nobtran.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicPersonnelActionTransaction100GetResponse) == false) {
            return false;
        }
        ElectronicPersonnelActionTransaction100GetResponse rhs = ((ElectronicPersonnelActionTransaction100GetResponse) other);
        return ((((this.nortran == rhs.nortran)||((this.nortran!= null)&&this.nortran.equals(rhs.nortran)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nobtran == rhs.nobtran)||((this.nobtran!= null)&&this.nobtran.equals(rhs.nobtran))));
    }

}
