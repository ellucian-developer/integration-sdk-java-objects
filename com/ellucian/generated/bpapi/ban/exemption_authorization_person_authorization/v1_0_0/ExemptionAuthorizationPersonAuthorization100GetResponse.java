
package com.ellucian.generated.bpapi.ban.exemption_authorization_person_authorization.v1_0_0;

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
    "tbbexpt",
    "tbbestu"
})
@Generated("jsonschema2pojo")
public class ExemptionAuthorizationPersonAuthorization100GetResponse {

    @JsonProperty("tbbexpt")
    private List<Tbbexpt> tbbexpt = new ArrayList<Tbbexpt>();
    @JsonProperty("tbbestu")
    private List<Tbbestu> tbbestu = new ArrayList<Tbbestu>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbbexpt")
    public List<Tbbexpt> getTbbexpt() {
        return tbbexpt;
    }

    @JsonProperty("tbbexpt")
    public void setTbbexpt(List<Tbbexpt> tbbexpt) {
        this.tbbexpt = tbbexpt;
    }

    public ExemptionAuthorizationPersonAuthorization100GetResponse withTbbexpt(List<Tbbexpt> tbbexpt) {
        this.tbbexpt = tbbexpt;
        return this;
    }

    @JsonProperty("tbbestu")
    public List<Tbbestu> getTbbestu() {
        return tbbestu;
    }

    @JsonProperty("tbbestu")
    public void setTbbestu(List<Tbbestu> tbbestu) {
        this.tbbestu = tbbestu;
    }

    public ExemptionAuthorizationPersonAuthorization100GetResponse withTbbestu(List<Tbbestu> tbbestu) {
        this.tbbestu = tbbestu;
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

    public ExemptionAuthorizationPersonAuthorization100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExemptionAuthorizationPersonAuthorization100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbexpt");
        sb.append('=');
        sb.append(((this.tbbexpt == null)?"<null>":this.tbbexpt));
        sb.append(',');
        sb.append("tbbestu");
        sb.append('=');
        sb.append(((this.tbbestu == null)?"<null>":this.tbbestu));
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
        result = ((result* 31)+((this.tbbexpt == null)? 0 :this.tbbexpt.hashCode()));
        result = ((result* 31)+((this.tbbestu == null)? 0 :this.tbbestu.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExemptionAuthorizationPersonAuthorization100GetResponse) == false) {
            return false;
        }
        ExemptionAuthorizationPersonAuthorization100GetResponse rhs = ((ExemptionAuthorizationPersonAuthorization100GetResponse) other);
        return ((((this.tbbexpt == rhs.tbbexpt)||((this.tbbexpt!= null)&&this.tbbexpt.equals(rhs.tbbexpt)))&&((this.tbbestu == rhs.tbbestu)||((this.tbbestu!= null)&&this.tbbestu.equals(rhs.tbbestu))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
