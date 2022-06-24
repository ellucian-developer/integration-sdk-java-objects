
package com.ellucian.generated.bpapi.ban.international_information.v1_0_0;

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
    "gorvisa",
    "gordocm",
    "gobintl"
})
@Generated("jsonschema2pojo")
public class InternationalInformation100GetResponse {

    @JsonProperty("gorvisa")
    private List<Gorvisa> gorvisa = new ArrayList<Gorvisa>();
    @JsonProperty("gordocm")
    private List<Gordocm> gordocm = new ArrayList<Gordocm>();
    @JsonProperty("gobintl")
    private List<Gobintl> gobintl = new ArrayList<Gobintl>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gorvisa")
    public List<Gorvisa> getGorvisa() {
        return gorvisa;
    }

    @JsonProperty("gorvisa")
    public void setGorvisa(List<Gorvisa> gorvisa) {
        this.gorvisa = gorvisa;
    }

    public InternationalInformation100GetResponse withGorvisa(List<Gorvisa> gorvisa) {
        this.gorvisa = gorvisa;
        return this;
    }

    @JsonProperty("gordocm")
    public List<Gordocm> getGordocm() {
        return gordocm;
    }

    @JsonProperty("gordocm")
    public void setGordocm(List<Gordocm> gordocm) {
        this.gordocm = gordocm;
    }

    public InternationalInformation100GetResponse withGordocm(List<Gordocm> gordocm) {
        this.gordocm = gordocm;
        return this;
    }

    @JsonProperty("gobintl")
    public List<Gobintl> getGobintl() {
        return gobintl;
    }

    @JsonProperty("gobintl")
    public void setGobintl(List<Gobintl> gobintl) {
        this.gobintl = gobintl;
    }

    public InternationalInformation100GetResponse withGobintl(List<Gobintl> gobintl) {
        this.gobintl = gobintl;
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

    public InternationalInformation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InternationalInformation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gorvisa");
        sb.append('=');
        sb.append(((this.gorvisa == null)?"<null>":this.gorvisa));
        sb.append(',');
        sb.append("gordocm");
        sb.append('=');
        sb.append(((this.gordocm == null)?"<null>":this.gordocm));
        sb.append(',');
        sb.append("gobintl");
        sb.append('=');
        sb.append(((this.gobintl == null)?"<null>":this.gobintl));
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
        result = ((result* 31)+((this.gorvisa == null)? 0 :this.gorvisa.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gobintl == null)? 0 :this.gobintl.hashCode()));
        result = ((result* 31)+((this.gordocm == null)? 0 :this.gordocm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InternationalInformation100GetResponse) == false) {
            return false;
        }
        InternationalInformation100GetResponse rhs = ((InternationalInformation100GetResponse) other);
        return (((((this.gorvisa == rhs.gorvisa)||((this.gorvisa!= null)&&this.gorvisa.equals(rhs.gorvisa)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gobintl == rhs.gobintl)||((this.gobintl!= null)&&this.gobintl.equals(rhs.gobintl))))&&((this.gordocm == rhs.gordocm)||((this.gordocm!= null)&&this.gordocm.equals(rhs.gordocm))));
    }

}
