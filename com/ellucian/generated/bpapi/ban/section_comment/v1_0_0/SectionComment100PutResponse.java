
package com.ellucian.generated.bpapi.ban.section_comment.v1_0_0;

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
    "ssrtext",
    "ssbdesc"
})
@Generated("jsonschema2pojo")
public class SectionComment100PutResponse {

    @JsonProperty("ssrtext")
    private List<Ssrtext__2> ssrtext = new ArrayList<Ssrtext__2>();
    @JsonProperty("ssbdesc")
    private List<Ssbdesc__2> ssbdesc = new ArrayList<Ssbdesc__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrtext")
    public List<Ssrtext__2> getSsrtext() {
        return ssrtext;
    }

    @JsonProperty("ssrtext")
    public void setSsrtext(List<Ssrtext__2> ssrtext) {
        this.ssrtext = ssrtext;
    }

    public SectionComment100PutResponse withSsrtext(List<Ssrtext__2> ssrtext) {
        this.ssrtext = ssrtext;
        return this;
    }

    @JsonProperty("ssbdesc")
    public List<Ssbdesc__2> getSsbdesc() {
        return ssbdesc;
    }

    @JsonProperty("ssbdesc")
    public void setSsbdesc(List<Ssbdesc__2> ssbdesc) {
        this.ssbdesc = ssbdesc;
    }

    public SectionComment100PutResponse withSsbdesc(List<Ssbdesc__2> ssbdesc) {
        this.ssbdesc = ssbdesc;
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

    public SectionComment100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionComment100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrtext");
        sb.append('=');
        sb.append(((this.ssrtext == null)?"<null>":this.ssrtext));
        sb.append(',');
        sb.append("ssbdesc");
        sb.append('=');
        sb.append(((this.ssbdesc == null)?"<null>":this.ssbdesc));
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
        result = ((result* 31)+((this.ssrtext == null)? 0 :this.ssrtext.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssbdesc == null)? 0 :this.ssbdesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionComment100PutResponse) == false) {
            return false;
        }
        SectionComment100PutResponse rhs = ((SectionComment100PutResponse) other);
        return ((((this.ssrtext == rhs.ssrtext)||((this.ssrtext!= null)&&this.ssrtext.equals(rhs.ssrtext)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssbdesc == rhs.ssbdesc)||((this.ssbdesc!= null)&&this.ssbdesc.equals(rhs.ssbdesc))));
    }

}
