
package com.ellucian.generated.bpapi.ban.third_party_access_audit_third_party_history.v1_0_0;

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
    "gorpaud2"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccessAuditThirdPartyHistory100GetResponse {

    @JsonProperty("gobtpac")
    private List<Gobtpac> gobtpac = new ArrayList<Gobtpac>();
    @JsonProperty("gorpaud2")
    private List<Gorpaud2> gorpaud2 = new ArrayList<Gorpaud2>();
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

    public ThirdPartyAccessAuditThirdPartyHistory100GetResponse withGobtpac(List<Gobtpac> gobtpac) {
        this.gobtpac = gobtpac;
        return this;
    }

    @JsonProperty("gorpaud2")
    public List<Gorpaud2> getGorpaud2() {
        return gorpaud2;
    }

    @JsonProperty("gorpaud2")
    public void setGorpaud2(List<Gorpaud2> gorpaud2) {
        this.gorpaud2 = gorpaud2;
    }

    public ThirdPartyAccessAuditThirdPartyHistory100GetResponse withGorpaud2(List<Gorpaud2> gorpaud2) {
        this.gorpaud2 = gorpaud2;
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

    public ThirdPartyAccessAuditThirdPartyHistory100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccessAuditThirdPartyHistory100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gobtpac");
        sb.append('=');
        sb.append(((this.gobtpac == null)?"<null>":this.gobtpac));
        sb.append(',');
        sb.append("gorpaud2");
        sb.append('=');
        sb.append(((this.gorpaud2 == null)?"<null>":this.gorpaud2));
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
        result = ((result* 31)+((this.gorpaud2 == null)? 0 :this.gorpaud2 .hashCode()));
        result = ((result* 31)+((this.gobtpac == null)? 0 :this.gobtpac.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccessAuditThirdPartyHistory100GetResponse) == false) {
            return false;
        }
        ThirdPartyAccessAuditThirdPartyHistory100GetResponse rhs = ((ThirdPartyAccessAuditThirdPartyHistory100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.gorpaud2 == rhs.gorpaud2)||((this.gorpaud2 != null)&&this.gorpaud2 .equals(rhs.gorpaud2))))&&((this.gobtpac == rhs.gobtpac)||((this.gobtpac!= null)&&this.gobtpac.equals(rhs.gobtpac))));
    }

}
