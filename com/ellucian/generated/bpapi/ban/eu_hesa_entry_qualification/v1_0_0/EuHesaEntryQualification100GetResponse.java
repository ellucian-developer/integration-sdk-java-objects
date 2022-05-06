
package com.ellucian.generated.bpapi.ban.eu_hesa_entry_qualification.v1_0_0;

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
    "sorentq",
    "sorents"
})
@Generated("jsonschema2pojo")
public class EuHesaEntryQualification100GetResponse {

    @JsonProperty("sorentq")
    private List<Sorentq> sorentq = new ArrayList<Sorentq>();
    @JsonProperty("sorents")
    private List<Sorent> sorents = new ArrayList<Sorent>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorentq")
    public List<Sorentq> getSorentq() {
        return sorentq;
    }

    @JsonProperty("sorentq")
    public void setSorentq(List<Sorentq> sorentq) {
        this.sorentq = sorentq;
    }

    public EuHesaEntryQualification100GetResponse withSorentq(List<Sorentq> sorentq) {
        this.sorentq = sorentq;
        return this;
    }

    @JsonProperty("sorents")
    public List<Sorent> getSorents() {
        return sorents;
    }

    @JsonProperty("sorents")
    public void setSorents(List<Sorent> sorents) {
        this.sorents = sorents;
    }

    public EuHesaEntryQualification100GetResponse withSorents(List<Sorent> sorents) {
        this.sorents = sorents;
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

    public EuHesaEntryQualification100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaEntryQualification100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorentq");
        sb.append('=');
        sb.append(((this.sorentq == null)?"<null>":this.sorentq));
        sb.append(',');
        sb.append("sorents");
        sb.append('=');
        sb.append(((this.sorents == null)?"<null>":this.sorents));
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
        result = ((result* 31)+((this.sorentq == null)? 0 :this.sorentq.hashCode()));
        result = ((result* 31)+((this.sorents == null)? 0 :this.sorents.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaEntryQualification100GetResponse) == false) {
            return false;
        }
        EuHesaEntryQualification100GetResponse rhs = ((EuHesaEntryQualification100GetResponse) other);
        return ((((this.sorentq == rhs.sorentq)||((this.sorentq!= null)&&this.sorentq.equals(rhs.sorentq)))&&((this.sorents == rhs.sorents)||((this.sorents!= null)&&this.sorents.equals(rhs.sorents))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
