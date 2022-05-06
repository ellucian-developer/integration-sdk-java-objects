
package com.ellucian.generated.bpapi.ban.electronic_personnel_action_routing.v1_0_0;

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
    "nobtran",
    "norrout"
})
@Generated("jsonschema2pojo")
public class ElectronicPersonnelActionRouting100PutResponse {

    @JsonProperty("nobtran")
    private List<Nobtran__1> nobtran = new ArrayList<Nobtran__1>();
    @JsonProperty("norrout")
    private List<Norrout__1> norrout = new ArrayList<Norrout__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nobtran")
    public List<Nobtran__1> getNobtran() {
        return nobtran;
    }

    @JsonProperty("nobtran")
    public void setNobtran(List<Nobtran__1> nobtran) {
        this.nobtran = nobtran;
    }

    public ElectronicPersonnelActionRouting100PutResponse withNobtran(List<Nobtran__1> nobtran) {
        this.nobtran = nobtran;
        return this;
    }

    @JsonProperty("norrout")
    public List<Norrout__1> getNorrout() {
        return norrout;
    }

    @JsonProperty("norrout")
    public void setNorrout(List<Norrout__1> norrout) {
        this.norrout = norrout;
    }

    public ElectronicPersonnelActionRouting100PutResponse withNorrout(List<Norrout__1> norrout) {
        this.norrout = norrout;
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

    public ElectronicPersonnelActionRouting100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicPersonnelActionRouting100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nobtran");
        sb.append('=');
        sb.append(((this.nobtran == null)?"<null>":this.nobtran));
        sb.append(',');
        sb.append("norrout");
        sb.append('=');
        sb.append(((this.norrout == null)?"<null>":this.norrout));
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
        result = ((result* 31)+((this.nobtran == null)? 0 :this.nobtran.hashCode()));
        result = ((result* 31)+((this.norrout == null)? 0 :this.norrout.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicPersonnelActionRouting100PutResponse) == false) {
            return false;
        }
        ElectronicPersonnelActionRouting100PutResponse rhs = ((ElectronicPersonnelActionRouting100PutResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.nobtran == rhs.nobtran)||((this.nobtran!= null)&&this.nobtran.equals(rhs.nobtran))))&&((this.norrout == rhs.norrout)||((this.norrout!= null)&&this.norrout.equals(rhs.norrout))));
    }

}
