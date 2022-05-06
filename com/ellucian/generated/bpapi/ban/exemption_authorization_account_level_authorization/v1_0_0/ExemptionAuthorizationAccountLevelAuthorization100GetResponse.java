
package com.ellucian.generated.bpapi.ban.exemption_authorization_account_level_authorization.v1_0_0;

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
    "tbreacc"
})
@Generated("jsonschema2pojo")
public class ExemptionAuthorizationAccountLevelAuthorization100GetResponse {

    @JsonProperty("tbbexpt")
    private List<Tbbexpt> tbbexpt = new ArrayList<Tbbexpt>();
    @JsonProperty("tbreacc")
    private List<Tbreacc> tbreacc = new ArrayList<Tbreacc>();
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

    public ExemptionAuthorizationAccountLevelAuthorization100GetResponse withTbbexpt(List<Tbbexpt> tbbexpt) {
        this.tbbexpt = tbbexpt;
        return this;
    }

    @JsonProperty("tbreacc")
    public List<Tbreacc> getTbreacc() {
        return tbreacc;
    }

    @JsonProperty("tbreacc")
    public void setTbreacc(List<Tbreacc> tbreacc) {
        this.tbreacc = tbreacc;
    }

    public ExemptionAuthorizationAccountLevelAuthorization100GetResponse withTbreacc(List<Tbreacc> tbreacc) {
        this.tbreacc = tbreacc;
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

    public ExemptionAuthorizationAccountLevelAuthorization100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExemptionAuthorizationAccountLevelAuthorization100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbexpt");
        sb.append('=');
        sb.append(((this.tbbexpt == null)?"<null>":this.tbbexpt));
        sb.append(',');
        sb.append("tbreacc");
        sb.append('=');
        sb.append(((this.tbreacc == null)?"<null>":this.tbreacc));
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
        result = ((result* 31)+((this.tbreacc == null)? 0 :this.tbreacc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExemptionAuthorizationAccountLevelAuthorization100GetResponse) == false) {
            return false;
        }
        ExemptionAuthorizationAccountLevelAuthorization100GetResponse rhs = ((ExemptionAuthorizationAccountLevelAuthorization100GetResponse) other);
        return ((((this.tbbexpt == rhs.tbbexpt)||((this.tbbexpt!= null)&&this.tbbexpt.equals(rhs.tbbexpt)))&&((this.tbreacc == rhs.tbreacc)||((this.tbreacc!= null)&&this.tbreacc.equals(rhs.tbreacc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
