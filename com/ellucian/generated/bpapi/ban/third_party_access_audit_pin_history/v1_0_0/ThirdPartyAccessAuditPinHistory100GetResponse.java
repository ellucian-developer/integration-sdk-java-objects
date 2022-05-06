
package com.ellucian.generated.bpapi.ban.third_party_access_audit_pin_history.v1_0_0;

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
    "gobtpac",
    "gorpaud"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccessAuditPinHistory100GetResponse {

    @JsonProperty("gobtpac")
    private List<Gobtpac> gobtpac = new ArrayList<Gobtpac>();
    @JsonProperty("gorpaud")
    private List<Gorpaud> gorpaud = new ArrayList<Gorpaud>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gobtpac")
    public List<Gobtpac> getGobtpac() {
        return gobtpac;
    }

    @JsonProperty("gobtpac")
    public void setGobtpac(List<Gobtpac> gobtpac) {
        this.gobtpac = gobtpac;
    }

    public ThirdPartyAccessAuditPinHistory100GetResponse withGobtpac(List<Gobtpac> gobtpac) {
        this.gobtpac = gobtpac;
        return this;
    }

    @JsonProperty("gorpaud")
    public List<Gorpaud> getGorpaud() {
        return gorpaud;
    }

    @JsonProperty("gorpaud")
    public void setGorpaud(List<Gorpaud> gorpaud) {
        this.gorpaud = gorpaud;
    }

    public ThirdPartyAccessAuditPinHistory100GetResponse withGorpaud(List<Gorpaud> gorpaud) {
        this.gorpaud = gorpaud;
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

    public ThirdPartyAccessAuditPinHistory100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccessAuditPinHistory100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gobtpac");
        sb.append('=');
        sb.append(((this.gobtpac == null)?"<null>":this.gobtpac));
        sb.append(',');
        sb.append("gorpaud");
        sb.append('=');
        sb.append(((this.gorpaud == null)?"<null>":this.gorpaud));
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
        result = ((result* 31)+((this.gorpaud == null)? 0 :this.gorpaud.hashCode()));
        result = ((result* 31)+((this.gobtpac == null)? 0 :this.gobtpac.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccessAuditPinHistory100GetResponse) == false) {
            return false;
        }
        ThirdPartyAccessAuditPinHistory100GetResponse rhs = ((ThirdPartyAccessAuditPinHistory100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.gorpaud == rhs.gorpaud)||((this.gorpaud!= null)&&this.gorpaud.equals(rhs.gorpaud))))&&((this.gobtpac == rhs.gobtpac)||((this.gobtpac!= null)&&this.gobtpac.equals(rhs.gobtpac))));
    }

}
