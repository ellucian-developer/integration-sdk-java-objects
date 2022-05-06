
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
    "sarrsrc",
    "sorints",
    "saracmt"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationSourcesInterestsComments100GetResponse {

    @JsonProperty("saradap")
    private List<Saradap> saradap = new ArrayList<Saradap>();
    @JsonProperty("sarrsrc")
    private List<Sarrsrc> sarrsrc = new ArrayList<Sarrsrc>();
    @JsonProperty("sorints")
    private List<Sorint> sorints = new ArrayList<Sorint>();
    @JsonProperty("saracmt")
    private List<Saracmt> saracmt = new ArrayList<Saracmt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("saradap")
    public List<Saradap> getSaradap() {
        return saradap;
    }

    @JsonProperty("saradap")
    public void setSaradap(List<Saradap> saradap) {
        this.saradap = saradap;
    }

    public AdmissionsApplicationSourcesInterestsComments100GetResponse withSaradap(List<Saradap> saradap) {
        this.saradap = saradap;
        return this;
    }

    @JsonProperty("sarrsrc")
    public List<Sarrsrc> getSarrsrc() {
        return sarrsrc;
    }

    @JsonProperty("sarrsrc")
    public void setSarrsrc(List<Sarrsrc> sarrsrc) {
        this.sarrsrc = sarrsrc;
    }

    public AdmissionsApplicationSourcesInterestsComments100GetResponse withSarrsrc(List<Sarrsrc> sarrsrc) {
        this.sarrsrc = sarrsrc;
        return this;
    }

    @JsonProperty("sorints")
    public List<Sorint> getSorints() {
        return sorints;
    }

    @JsonProperty("sorints")
    public void setSorints(List<Sorint> sorints) {
        this.sorints = sorints;
    }

    public AdmissionsApplicationSourcesInterestsComments100GetResponse withSorints(List<Sorint> sorints) {
        this.sorints = sorints;
        return this;
    }

    @JsonProperty("saracmt")
    public List<Saracmt> getSaracmt() {
        return saracmt;
    }

    @JsonProperty("saracmt")
    public void setSaracmt(List<Saracmt> saracmt) {
        this.saracmt = saracmt;
    }

    public AdmissionsApplicationSourcesInterestsComments100GetResponse withSaracmt(List<Saracmt> saracmt) {
        this.saracmt = saracmt;
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

    public AdmissionsApplicationSourcesInterestsComments100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationSourcesInterestsComments100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saradap");
        sb.append('=');
        sb.append(((this.saradap == null)?"<null>":this.saradap));
        sb.append(',');
        sb.append("sarrsrc");
        sb.append('=');
        sb.append(((this.sarrsrc == null)?"<null>":this.sarrsrc));
        sb.append(',');
        sb.append("sorints");
        sb.append('=');
        sb.append(((this.sorints == null)?"<null>":this.sorints));
        sb.append(',');
        sb.append("saracmt");
        sb.append('=');
        sb.append(((this.saracmt == null)?"<null>":this.saracmt));
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
        if ((other instanceof AdmissionsApplicationSourcesInterestsComments100GetResponse) == false) {
            return false;
        }
        AdmissionsApplicationSourcesInterestsComments100GetResponse rhs = ((AdmissionsApplicationSourcesInterestsComments100GetResponse) other);
        return ((((((this.saradap == rhs.saradap)||((this.saradap!= null)&&this.saradap.equals(rhs.saradap)))&&((this.sarrsrc == rhs.sarrsrc)||((this.sarrsrc!= null)&&this.sarrsrc.equals(rhs.sarrsrc))))&&((this.saracmt == rhs.saracmt)||((this.saracmt!= null)&&this.saracmt.equals(rhs.saracmt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorints == rhs.sorints)||((this.sorints!= null)&&this.sorints.equals(rhs.sorints))));
    }

}
