
package com.ellucian.generated.bpapi.ban.contract_person_authorization.v1_0_0;

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
    "tbbpidm",
    "tbbcstu2"
})
@Generated("jsonschema2pojo")
public class ContractPersonAuthorization100PutResponse {

    @JsonProperty("tbbpidm")
    private List<Tbbpidm__1> tbbpidm = new ArrayList<Tbbpidm__1>();
    @JsonProperty("tbbcstu2")
    private List<Tbbcstu2__1> tbbcstu2 = new ArrayList<Tbbcstu2__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbbpidm")
    public List<Tbbpidm__1> getTbbpidm() {
        return tbbpidm;
    }

    @JsonProperty("tbbpidm")
    public void setTbbpidm(List<Tbbpidm__1> tbbpidm) {
        this.tbbpidm = tbbpidm;
    }

    public ContractPersonAuthorization100PutResponse withTbbpidm(List<Tbbpidm__1> tbbpidm) {
        this.tbbpidm = tbbpidm;
        return this;
    }

    @JsonProperty("tbbcstu2")
    public List<Tbbcstu2__1> getTbbcstu2() {
        return tbbcstu2;
    }

    @JsonProperty("tbbcstu2")
    public void setTbbcstu2(List<Tbbcstu2__1> tbbcstu2) {
        this.tbbcstu2 = tbbcstu2;
    }

    public ContractPersonAuthorization100PutResponse withTbbcstu2(List<Tbbcstu2__1> tbbcstu2) {
        this.tbbcstu2 = tbbcstu2;
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

    public ContractPersonAuthorization100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContractPersonAuthorization100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbpidm");
        sb.append('=');
        sb.append(((this.tbbpidm == null)?"<null>":this.tbbpidm));
        sb.append(',');
        sb.append("tbbcstu2");
        sb.append('=');
        sb.append(((this.tbbcstu2 == null)?"<null>":this.tbbcstu2));
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
        result = ((result* 31)+((this.tbbpidm == null)? 0 :this.tbbpidm.hashCode()));
        result = ((result* 31)+((this.tbbcstu2 == null)? 0 :this.tbbcstu2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractPersonAuthorization100PutResponse) == false) {
            return false;
        }
        ContractPersonAuthorization100PutResponse rhs = ((ContractPersonAuthorization100PutResponse) other);
        return ((((this.tbbpidm == rhs.tbbpidm)||((this.tbbpidm!= null)&&this.tbbpidm.equals(rhs.tbbpidm)))&&((this.tbbcstu2 == rhs.tbbcstu2)||((this.tbbcstu2 != null)&&this.tbbcstu2 .equals(rhs.tbbcstu2))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
