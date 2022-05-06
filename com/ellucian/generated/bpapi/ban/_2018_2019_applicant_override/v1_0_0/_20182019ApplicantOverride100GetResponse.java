
package com.ellucian.generated.bpapi.ban._2018_2019_applicant_override.v1_0_0;

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
    "rorstat",
    "rnrovrd"
})
@Generated("jsonschema2pojo")
public class _20182019ApplicantOverride100GetResponse {

    @JsonProperty("rorstat")
    private List<Rorstat> rorstat = new ArrayList<Rorstat>();
    @JsonProperty("rnrovrd")
    private List<Rnrovrd> rnrovrd = new ArrayList<Rnrovrd>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rorstat")
    public List<Rorstat> getRorstat() {
        return rorstat;
    }

    @JsonProperty("rorstat")
    public void setRorstat(List<Rorstat> rorstat) {
        this.rorstat = rorstat;
    }

    public _20182019ApplicantOverride100GetResponse withRorstat(List<Rorstat> rorstat) {
        this.rorstat = rorstat;
        return this;
    }

    @JsonProperty("rnrovrd")
    public List<Rnrovrd> getRnrovrd() {
        return rnrovrd;
    }

    @JsonProperty("rnrovrd")
    public void setRnrovrd(List<Rnrovrd> rnrovrd) {
        this.rnrovrd = rnrovrd;
    }

    public _20182019ApplicantOverride100GetResponse withRnrovrd(List<Rnrovrd> rnrovrd) {
        this.rnrovrd = rnrovrd;
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

    public _20182019ApplicantOverride100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20182019ApplicantOverride100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rorstat");
        sb.append('=');
        sb.append(((this.rorstat == null)?"<null>":this.rorstat));
        sb.append(',');
        sb.append("rnrovrd");
        sb.append('=');
        sb.append(((this.rnrovrd == null)?"<null>":this.rnrovrd));
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
        result = ((result* 31)+((this.rnrovrd == null)? 0 :this.rnrovrd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rorstat == null)? 0 :this.rorstat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20182019ApplicantOverride100GetResponse) == false) {
            return false;
        }
        _20182019ApplicantOverride100GetResponse rhs = ((_20182019ApplicantOverride100GetResponse) other);
        return ((((this.rnrovrd == rhs.rnrovrd)||((this.rnrovrd!= null)&&this.rnrovrd.equals(rhs.rnrovrd)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rorstat == rhs.rorstat)||((this.rorstat!= null)&&this.rorstat.equals(rhs.rorstat))));
    }

}
