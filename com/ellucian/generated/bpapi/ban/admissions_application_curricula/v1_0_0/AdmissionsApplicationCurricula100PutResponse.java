
package com.ellucian.generated.bpapi.ban.admissions_application_curricula.v1_0_0;

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
    "saradap",
    "sorlcur",
    "sorlfos"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationCurricula100PutResponse {

    @JsonProperty("saradap")
    private List<Saradap__2> saradap = new ArrayList<Saradap__2>();
    @JsonProperty("sorlcur")
    private List<Sorlcur__2> sorlcur = new ArrayList<Sorlcur__2>();
    @JsonProperty("sorlfos")
    private List<Sorlfo__2> sorlfos = new ArrayList<Sorlfo__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("saradap")
    public List<Saradap__2> getSaradap() {
        return saradap;
    }

    @JsonProperty("saradap")
    public void setSaradap(List<Saradap__2> saradap) {
        this.saradap = saradap;
    }

    public AdmissionsApplicationCurricula100PutResponse withSaradap(List<Saradap__2> saradap) {
        this.saradap = saradap;
        return this;
    }

    @JsonProperty("sorlcur")
    public List<Sorlcur__2> getSorlcur() {
        return sorlcur;
    }

    @JsonProperty("sorlcur")
    public void setSorlcur(List<Sorlcur__2> sorlcur) {
        this.sorlcur = sorlcur;
    }

    public AdmissionsApplicationCurricula100PutResponse withSorlcur(List<Sorlcur__2> sorlcur) {
        this.sorlcur = sorlcur;
        return this;
    }

    @JsonProperty("sorlfos")
    public List<Sorlfo__2> getSorlfos() {
        return sorlfos;
    }

    @JsonProperty("sorlfos")
    public void setSorlfos(List<Sorlfo__2> sorlfos) {
        this.sorlfos = sorlfos;
    }

    public AdmissionsApplicationCurricula100PutResponse withSorlfos(List<Sorlfo__2> sorlfos) {
        this.sorlfos = sorlfos;
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

    public AdmissionsApplicationCurricula100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationCurricula100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saradap");
        sb.append('=');
        sb.append(((this.saradap == null)?"<null>":this.saradap));
        sb.append(',');
        sb.append("sorlcur");
        sb.append('=');
        sb.append(((this.sorlcur == null)?"<null>":this.sorlcur));
        sb.append(',');
        sb.append("sorlfos");
        sb.append('=');
        sb.append(((this.sorlfos == null)?"<null>":this.sorlfos));
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
        result = ((result* 31)+((this.saradap == null)? 0 :this.saradap.hashCode()));
        result = ((result* 31)+((this.sorlfos == null)? 0 :this.sorlfos.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorlcur == null)? 0 :this.sorlcur.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationCurricula100PutResponse) == false) {
            return false;
        }
        AdmissionsApplicationCurricula100PutResponse rhs = ((AdmissionsApplicationCurricula100PutResponse) other);
        return (((((this.saradap == rhs.saradap)||((this.saradap!= null)&&this.saradap.equals(rhs.saradap)))&&((this.sorlfos == rhs.sorlfos)||((this.sorlfos!= null)&&this.sorlfos.equals(rhs.sorlfos))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorlcur == rhs.sorlcur)||((this.sorlcur!= null)&&this.sorlcur.equals(rhs.sorlcur))));
    }

}
