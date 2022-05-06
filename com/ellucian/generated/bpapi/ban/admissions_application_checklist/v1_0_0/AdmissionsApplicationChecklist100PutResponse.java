
package com.ellucian.generated.bpapi.ban.admissions_application_checklist.v1_0_0;

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
    "sarchkl"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationChecklist100PutResponse {

    @JsonProperty("saradap")
    private List<Saradap__2> saradap = new ArrayList<Saradap__2>();
    @JsonProperty("sarchkl")
    private List<Sarchkl__2> sarchkl = new ArrayList<Sarchkl__2>();
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

    public AdmissionsApplicationChecklist100PutResponse withSaradap(List<Saradap__2> saradap) {
        this.saradap = saradap;
        return this;
    }

    @JsonProperty("sarchkl")
    public List<Sarchkl__2> getSarchkl() {
        return sarchkl;
    }

    @JsonProperty("sarchkl")
    public void setSarchkl(List<Sarchkl__2> sarchkl) {
        this.sarchkl = sarchkl;
    }

    public AdmissionsApplicationChecklist100PutResponse withSarchkl(List<Sarchkl__2> sarchkl) {
        this.sarchkl = sarchkl;
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

    public AdmissionsApplicationChecklist100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationChecklist100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saradap");
        sb.append('=');
        sb.append(((this.saradap == null)?"<null>":this.saradap));
        sb.append(',');
        sb.append("sarchkl");
        sb.append('=');
        sb.append(((this.sarchkl == null)?"<null>":this.sarchkl));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sarchkl == null)? 0 :this.sarchkl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationChecklist100PutResponse) == false) {
            return false;
        }
        AdmissionsApplicationChecklist100PutResponse rhs = ((AdmissionsApplicationChecklist100PutResponse) other);
        return ((((this.saradap == rhs.saradap)||((this.saradap!= null)&&this.saradap.equals(rhs.saradap)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sarchkl == rhs.sarchkl)||((this.sarchkl!= null)&&this.sarchkl.equals(rhs.sarchkl))));
    }

}
