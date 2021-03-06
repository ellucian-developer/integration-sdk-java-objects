
package com.ellucian.generated.bpapi.ban.certification_information.v1_0_0;

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
    "pprcert",
    "pprends"
})
@Generated("jsonschema2pojo")
public class CertificationInformation100GetResponse {

    @JsonProperty("pprcert")
    private List<Pprcert> pprcert = new ArrayList<Pprcert>();
    @JsonProperty("pprends")
    private List<Pprend> pprends = new ArrayList<Pprend>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pprcert")
    public List<Pprcert> getPprcert() {
        return pprcert;
    }

    @JsonProperty("pprcert")
    public void setPprcert(List<Pprcert> pprcert) {
        this.pprcert = pprcert;
    }

    public CertificationInformation100GetResponse withPprcert(List<Pprcert> pprcert) {
        this.pprcert = pprcert;
        return this;
    }

    @JsonProperty("pprends")
    public List<Pprend> getPprends() {
        return pprends;
    }

    @JsonProperty("pprends")
    public void setPprends(List<Pprend> pprends) {
        this.pprends = pprends;
    }

    public CertificationInformation100GetResponse withPprends(List<Pprend> pprends) {
        this.pprends = pprends;
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

    public CertificationInformation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CertificationInformation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pprcert");
        sb.append('=');
        sb.append(((this.pprcert == null)?"<null>":this.pprcert));
        sb.append(',');
        sb.append("pprends");
        sb.append('=');
        sb.append(((this.pprends == null)?"<null>":this.pprends));
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
        result = ((result* 31)+((this.pprcert == null)? 0 :this.pprcert.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pprends == null)? 0 :this.pprends.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CertificationInformation100GetResponse) == false) {
            return false;
        }
        CertificationInformation100GetResponse rhs = ((CertificationInformation100GetResponse) other);
        return ((((this.pprcert == rhs.pprcert)||((this.pprcert!= null)&&this.pprcert.equals(rhs.pprcert)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pprends == rhs.pprends)||((this.pprends!= null)&&this.pprends.equals(rhs.pprends))));
    }

}
