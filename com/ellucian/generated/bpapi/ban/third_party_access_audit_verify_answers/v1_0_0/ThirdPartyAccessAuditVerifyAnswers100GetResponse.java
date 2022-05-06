
package com.ellucian.generated.bpapi.ban.third_party_access_audit_verify_answers.v1_0_0;

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
    "dummy"
})
@Generated("jsonschema2pojo")
public class ThirdPartyAccessAuditVerifyAnswers100GetResponse {

    @JsonProperty("gobtpac")
    private List<Gobtpac> gobtpac = new ArrayList<Gobtpac>();
    @JsonProperty("dummy")
    private List<Dummy> dummy = new ArrayList<Dummy>();
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

    public ThirdPartyAccessAuditVerifyAnswers100GetResponse withGobtpac(List<Gobtpac> gobtpac) {
        this.gobtpac = gobtpac;
        return this;
    }

    @JsonProperty("dummy")
    public List<Dummy> getDummy() {
        return dummy;
    }

    @JsonProperty("dummy")
    public void setDummy(List<Dummy> dummy) {
        this.dummy = dummy;
    }

    public ThirdPartyAccessAuditVerifyAnswers100GetResponse withDummy(List<Dummy> dummy) {
        this.dummy = dummy;
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

    public ThirdPartyAccessAuditVerifyAnswers100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThirdPartyAccessAuditVerifyAnswers100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gobtpac");
        sb.append('=');
        sb.append(((this.gobtpac == null)?"<null>":this.gobtpac));
        sb.append(',');
        sb.append("dummy");
        sb.append('=');
        sb.append(((this.dummy == null)?"<null>":this.dummy));
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
        result = ((result* 31)+((this.dummy == null)? 0 :this.dummy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gobtpac == null)? 0 :this.gobtpac.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThirdPartyAccessAuditVerifyAnswers100GetResponse) == false) {
            return false;
        }
        ThirdPartyAccessAuditVerifyAnswers100GetResponse rhs = ((ThirdPartyAccessAuditVerifyAnswers100GetResponse) other);
        return ((((this.dummy == rhs.dummy)||((this.dummy!= null)&&this.dummy.equals(rhs.dummy)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gobtpac == rhs.gobtpac)||((this.gobtpac!= null)&&this.gobtpac.equals(rhs.gobtpac))));
    }

}
