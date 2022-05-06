
package com.ellucian.generated.bpapi.ban.comment.v1_0_0;

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
    "pprcmnt",
    "pprccmt"
})
@Generated("jsonschema2pojo")
public class Comment100PutResponse {

    @JsonProperty("pprcmnt")
    private List<Pprcmnt__1> pprcmnt = new ArrayList<Pprcmnt__1>();
    @JsonProperty("pprccmt")
    private List<Pprccmt__1> pprccmt = new ArrayList<Pprccmt__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pprcmnt")
    public List<Pprcmnt__1> getPprcmnt() {
        return pprcmnt;
    }

    @JsonProperty("pprcmnt")
    public void setPprcmnt(List<Pprcmnt__1> pprcmnt) {
        this.pprcmnt = pprcmnt;
    }

    public Comment100PutResponse withPprcmnt(List<Pprcmnt__1> pprcmnt) {
        this.pprcmnt = pprcmnt;
        return this;
    }

    @JsonProperty("pprccmt")
    public List<Pprccmt__1> getPprccmt() {
        return pprccmt;
    }

    @JsonProperty("pprccmt")
    public void setPprccmt(List<Pprccmt__1> pprccmt) {
        this.pprccmt = pprccmt;
    }

    public Comment100PutResponse withPprccmt(List<Pprccmt__1> pprccmt) {
        this.pprccmt = pprccmt;
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

    public Comment100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Comment100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pprcmnt");
        sb.append('=');
        sb.append(((this.pprcmnt == null)?"<null>":this.pprcmnt));
        sb.append(',');
        sb.append("pprccmt");
        sb.append('=');
        sb.append(((this.pprccmt == null)?"<null>":this.pprccmt));
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
        result = ((result* 31)+((this.pprccmt == null)? 0 :this.pprccmt.hashCode()));
        result = ((result* 31)+((this.pprcmnt == null)? 0 :this.pprcmnt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Comment100PutResponse) == false) {
            return false;
        }
        Comment100PutResponse rhs = ((Comment100PutResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.pprccmt == rhs.pprccmt)||((this.pprccmt!= null)&&this.pprccmt.equals(rhs.pprccmt))))&&((this.pprcmnt == rhs.pprcmnt)||((this.pprcmnt!= null)&&this.pprcmnt.equals(rhs.pprcmnt))));
    }

}
