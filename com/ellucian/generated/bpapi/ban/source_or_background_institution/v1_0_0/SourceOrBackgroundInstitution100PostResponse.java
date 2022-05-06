
package com.ellucian.generated.bpapi.ban.source_or_background_institution.v1_0_0;

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
    "sorbcmt",
    "sorbcnt",
    "sobsbgi"
})
@Generated("jsonschema2pojo")
public class SourceOrBackgroundInstitution100PostResponse {

    @JsonProperty("sorbcmt")
    private List<Sorbcmt__1> sorbcmt = new ArrayList<Sorbcmt__1>();
    @JsonProperty("sorbcnt")
    private List<Sorbcnt__1> sorbcnt = new ArrayList<Sorbcnt__1>();
    @JsonProperty("sobsbgi")
    private List<Sobsbgi__1> sobsbgi = new ArrayList<Sobsbgi__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorbcmt")
    public List<Sorbcmt__1> getSorbcmt() {
        return sorbcmt;
    }

    @JsonProperty("sorbcmt")
    public void setSorbcmt(List<Sorbcmt__1> sorbcmt) {
        this.sorbcmt = sorbcmt;
    }

    public SourceOrBackgroundInstitution100PostResponse withSorbcmt(List<Sorbcmt__1> sorbcmt) {
        this.sorbcmt = sorbcmt;
        return this;
    }

    @JsonProperty("sorbcnt")
    public List<Sorbcnt__1> getSorbcnt() {
        return sorbcnt;
    }

    @JsonProperty("sorbcnt")
    public void setSorbcnt(List<Sorbcnt__1> sorbcnt) {
        this.sorbcnt = sorbcnt;
    }

    public SourceOrBackgroundInstitution100PostResponse withSorbcnt(List<Sorbcnt__1> sorbcnt) {
        this.sorbcnt = sorbcnt;
        return this;
    }

    @JsonProperty("sobsbgi")
    public List<Sobsbgi__1> getSobsbgi() {
        return sobsbgi;
    }

    @JsonProperty("sobsbgi")
    public void setSobsbgi(List<Sobsbgi__1> sobsbgi) {
        this.sobsbgi = sobsbgi;
    }

    public SourceOrBackgroundInstitution100PostResponse withSobsbgi(List<Sobsbgi__1> sobsbgi) {
        this.sobsbgi = sobsbgi;
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

    public SourceOrBackgroundInstitution100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SourceOrBackgroundInstitution100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorbcmt");
        sb.append('=');
        sb.append(((this.sorbcmt == null)?"<null>":this.sorbcmt));
        sb.append(',');
        sb.append("sorbcnt");
        sb.append('=');
        sb.append(((this.sorbcnt == null)?"<null>":this.sorbcnt));
        sb.append(',');
        sb.append("sobsbgi");
        sb.append('=');
        sb.append(((this.sobsbgi == null)?"<null>":this.sobsbgi));
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
        result = ((result* 31)+((this.sorbcmt == null)? 0 :this.sorbcmt.hashCode()));
        result = ((result* 31)+((this.sorbcnt == null)? 0 :this.sorbcnt.hashCode()));
        result = ((result* 31)+((this.sobsbgi == null)? 0 :this.sobsbgi.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceOrBackgroundInstitution100PostResponse) == false) {
            return false;
        }
        SourceOrBackgroundInstitution100PostResponse rhs = ((SourceOrBackgroundInstitution100PostResponse) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.sorbcmt == rhs.sorbcmt)||((this.sorbcmt!= null)&&this.sorbcmt.equals(rhs.sorbcmt))))&&((this.sorbcnt == rhs.sorbcnt)||((this.sorbcnt!= null)&&this.sorbcnt.equals(rhs.sorbcnt))))&&((this.sobsbgi == rhs.sobsbgi)||((this.sobsbgi!= null)&&this.sobsbgi.equals(rhs.sobsbgi))));
    }

}
