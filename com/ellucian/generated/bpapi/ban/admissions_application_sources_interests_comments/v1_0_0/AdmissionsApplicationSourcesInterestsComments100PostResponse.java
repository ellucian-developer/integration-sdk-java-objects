
package com.ellucian.generated.bpapi.ban.admissions_application_sources_interests_comments.v1_0_0;

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
    "saracmt",
    "sarrsrc",
    "sorints"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationSourcesInterestsComments100PostResponse {

    @JsonProperty("saradap")
    private List<Saradap__1> saradap = new ArrayList<Saradap__1>();
    @JsonProperty("saracmt")
    private List<Saracmt__1> saracmt = new ArrayList<Saracmt__1>();
    @JsonProperty("sarrsrc")
    private List<Sarrsrc__1> sarrsrc = new ArrayList<Sarrsrc__1>();
    @JsonProperty("sorints")
    private List<Sorint__1> sorints = new ArrayList<Sorint__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("saradap")
    public List<Saradap__1> getSaradap() {
        return saradap;
    }

    @JsonProperty("saradap")
    public void setSaradap(List<Saradap__1> saradap) {
        this.saradap = saradap;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostResponse withSaradap(List<Saradap__1> saradap) {
        this.saradap = saradap;
        return this;
    }

    @JsonProperty("saracmt")
    public List<Saracmt__1> getSaracmt() {
        return saracmt;
    }

    @JsonProperty("saracmt")
    public void setSaracmt(List<Saracmt__1> saracmt) {
        this.saracmt = saracmt;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostResponse withSaracmt(List<Saracmt__1> saracmt) {
        this.saracmt = saracmt;
        return this;
    }

    @JsonProperty("sarrsrc")
    public List<Sarrsrc__1> getSarrsrc() {
        return sarrsrc;
    }

    @JsonProperty("sarrsrc")
    public void setSarrsrc(List<Sarrsrc__1> sarrsrc) {
        this.sarrsrc = sarrsrc;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostResponse withSarrsrc(List<Sarrsrc__1> sarrsrc) {
        this.sarrsrc = sarrsrc;
        return this;
    }

    @JsonProperty("sorints")
    public List<Sorint__1> getSorints() {
        return sorints;
    }

    @JsonProperty("sorints")
    public void setSorints(List<Sorint__1> sorints) {
        this.sorints = sorints;
    }

    public AdmissionsApplicationSourcesInterestsComments100PostResponse withSorints(List<Sorint__1> sorints) {
        this.sorints = sorints;
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

    public AdmissionsApplicationSourcesInterestsComments100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationSourcesInterestsComments100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saradap");
        sb.append('=');
        sb.append(((this.saradap == null)?"<null>":this.saradap));
        sb.append(',');
        sb.append("saracmt");
        sb.append('=');
        sb.append(((this.saracmt == null)?"<null>":this.saracmt));
        sb.append(',');
        sb.append("sarrsrc");
        sb.append('=');
        sb.append(((this.sarrsrc == null)?"<null>":this.sarrsrc));
        sb.append(',');
        sb.append("sorints");
        sb.append('=');
        sb.append(((this.sorints == null)?"<null>":this.sorints));
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
        result = ((result* 31)+((this.sarrsrc == null)? 0 :this.sarrsrc.hashCode()));
        result = ((result* 31)+((this.saracmt == null)? 0 :this.saracmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorints == null)? 0 :this.sorints.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationSourcesInterestsComments100PostResponse) == false) {
            return false;
        }
        AdmissionsApplicationSourcesInterestsComments100PostResponse rhs = ((AdmissionsApplicationSourcesInterestsComments100PostResponse) other);
        return ((((((this.saradap == rhs.saradap)||((this.saradap!= null)&&this.saradap.equals(rhs.saradap)))&&((this.sarrsrc == rhs.sarrsrc)||((this.sarrsrc!= null)&&this.sarrsrc.equals(rhs.sarrsrc))))&&((this.saracmt == rhs.saracmt)||((this.saracmt!= null)&&this.saracmt.equals(rhs.saracmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorints == rhs.sorints)||((this.sorints!= null)&&this.sorints.equals(rhs.sorints))));
    }

}
