
package com.ellucian.generated.bpapi.ban.exemption_authorization_detail_code_level_authorization.v1_0_0;

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
    "tbredet",
    "tbredsi"
})
@Generated("jsonschema2pojo")
public class ExemptionAuthorizationDetailCodeLevelAuthorization100GetResponse {

    @JsonProperty("tbbexpt")
    private List<Tbbexpt> tbbexpt = new ArrayList<Tbbexpt>();
    @JsonProperty("tbredet")
    private List<Tbredet> tbredet = new ArrayList<Tbredet>();
    @JsonProperty("tbredsi")
    private List<Tbredsi> tbredsi = new ArrayList<Tbredsi>();
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

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetResponse withTbbexpt(List<Tbbexpt> tbbexpt) {
        this.tbbexpt = tbbexpt;
        return this;
    }

    @JsonProperty("tbredet")
    public List<Tbredet> getTbredet() {
        return tbredet;
    }

    @JsonProperty("tbredet")
    public void setTbredet(List<Tbredet> tbredet) {
        this.tbredet = tbredet;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetResponse withTbredet(List<Tbredet> tbredet) {
        this.tbredet = tbredet;
        return this;
    }

    @JsonProperty("tbredsi")
    public List<Tbredsi> getTbredsi() {
        return tbredsi;
    }

    @JsonProperty("tbredsi")
    public void setTbredsi(List<Tbredsi> tbredsi) {
        this.tbredsi = tbredsi;
    }

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetResponse withTbredsi(List<Tbredsi> tbredsi) {
        this.tbredsi = tbredsi;
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

    public ExemptionAuthorizationDetailCodeLevelAuthorization100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExemptionAuthorizationDetailCodeLevelAuthorization100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbexpt");
        sb.append('=');
        sb.append(((this.tbbexpt == null)?"<null>":this.tbbexpt));
        sb.append(',');
        sb.append("tbredet");
        sb.append('=');
        sb.append(((this.tbredet == null)?"<null>":this.tbredet));
        sb.append(',');
        sb.append("tbredsi");
        sb.append('=');
        sb.append(((this.tbredsi == null)?"<null>":this.tbredsi));
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
        result = ((result* 31)+((this.tbredet == null)? 0 :this.tbredet.hashCode()));
        result = ((result* 31)+((this.tbredsi == null)? 0 :this.tbredsi.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExemptionAuthorizationDetailCodeLevelAuthorization100GetResponse) == false) {
            return false;
        }
        ExemptionAuthorizationDetailCodeLevelAuthorization100GetResponse rhs = ((ExemptionAuthorizationDetailCodeLevelAuthorization100GetResponse) other);
        return (((((this.tbbexpt == rhs.tbbexpt)||((this.tbbexpt!= null)&&this.tbbexpt.equals(rhs.tbbexpt)))&&((this.tbredet == rhs.tbredet)||((this.tbredet!= null)&&this.tbredet.equals(rhs.tbredet))))&&((this.tbredsi == rhs.tbredsi)||((this.tbredsi!= null)&&this.tbredsi.equals(rhs.tbredsi))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
