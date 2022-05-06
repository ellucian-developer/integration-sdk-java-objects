
package com.ellucian.generated.bpapi.ban.person_experience.v1_0_0;

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
    "pprexpe",
    "pprrefe"
})
@Generated("jsonschema2pojo")
public class PersonExperience100PutResponse {

    @JsonProperty("pprexpe")
    private List<Pprexpe__2> pprexpe = new ArrayList<Pprexpe__2>();
    @JsonProperty("pprrefe")
    private List<Pprrefe__2> pprrefe = new ArrayList<Pprrefe__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pprexpe")
    public List<Pprexpe__2> getPprexpe() {
        return pprexpe;
    }

    @JsonProperty("pprexpe")
    public void setPprexpe(List<Pprexpe__2> pprexpe) {
        this.pprexpe = pprexpe;
    }

    public PersonExperience100PutResponse withPprexpe(List<Pprexpe__2> pprexpe) {
        this.pprexpe = pprexpe;
        return this;
    }

    @JsonProperty("pprrefe")
    public List<Pprrefe__2> getPprrefe() {
        return pprrefe;
    }

    @JsonProperty("pprrefe")
    public void setPprrefe(List<Pprrefe__2> pprrefe) {
        this.pprrefe = pprrefe;
    }

    public PersonExperience100PutResponse withPprrefe(List<Pprrefe__2> pprrefe) {
        this.pprrefe = pprrefe;
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

    public PersonExperience100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonExperience100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pprexpe");
        sb.append('=');
        sb.append(((this.pprexpe == null)?"<null>":this.pprexpe));
        sb.append(',');
        sb.append("pprrefe");
        sb.append('=');
        sb.append(((this.pprrefe == null)?"<null>":this.pprrefe));
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
        result = ((result* 31)+((this.pprrefe == null)? 0 :this.pprrefe.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pprexpe == null)? 0 :this.pprexpe.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonExperience100PutResponse) == false) {
            return false;
        }
        PersonExperience100PutResponse rhs = ((PersonExperience100PutResponse) other);
        return ((((this.pprrefe == rhs.pprrefe)||((this.pprrefe!= null)&&this.pprrefe.equals(rhs.pprrefe)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pprexpe == rhs.pprexpe)||((this.pprexpe!= null)&&this.pprexpe.equals(rhs.pprexpe))));
    }

}
