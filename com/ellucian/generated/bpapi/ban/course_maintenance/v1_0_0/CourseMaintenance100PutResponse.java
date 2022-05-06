
package com.ellucian.generated.bpapi.ban.course_maintenance.v1_0_0;

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
    "shrtckl",
    "shrtckg",
    "shrtckn"
})
@Generated("jsonschema2pojo")
public class CourseMaintenance100PutResponse {

    @JsonProperty("shrtckl")
    private List<Shrtckl__2> shrtckl = new ArrayList<Shrtckl__2>();
    @JsonProperty("shrtckg")
    private List<Shrtckg__2> shrtckg = new ArrayList<Shrtckg__2>();
    @JsonProperty("shrtckn")
    private List<Shrtckn__2> shrtckn = new ArrayList<Shrtckn__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrtckl")
    public List<Shrtckl__2> getShrtckl() {
        return shrtckl;
    }

    @JsonProperty("shrtckl")
    public void setShrtckl(List<Shrtckl__2> shrtckl) {
        this.shrtckl = shrtckl;
    }

    public CourseMaintenance100PutResponse withShrtckl(List<Shrtckl__2> shrtckl) {
        this.shrtckl = shrtckl;
        return this;
    }

    @JsonProperty("shrtckg")
    public List<Shrtckg__2> getShrtckg() {
        return shrtckg;
    }

    @JsonProperty("shrtckg")
    public void setShrtckg(List<Shrtckg__2> shrtckg) {
        this.shrtckg = shrtckg;
    }

    public CourseMaintenance100PutResponse withShrtckg(List<Shrtckg__2> shrtckg) {
        this.shrtckg = shrtckg;
        return this;
    }

    @JsonProperty("shrtckn")
    public List<Shrtckn__2> getShrtckn() {
        return shrtckn;
    }

    @JsonProperty("shrtckn")
    public void setShrtckn(List<Shrtckn__2> shrtckn) {
        this.shrtckn = shrtckn;
    }

    public CourseMaintenance100PutResponse withShrtckn(List<Shrtckn__2> shrtckn) {
        this.shrtckn = shrtckn;
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

    public CourseMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrtckl");
        sb.append('=');
        sb.append(((this.shrtckl == null)?"<null>":this.shrtckl));
        sb.append(',');
        sb.append("shrtckg");
        sb.append('=');
        sb.append(((this.shrtckg == null)?"<null>":this.shrtckg));
        sb.append(',');
        sb.append("shrtckn");
        sb.append('=');
        sb.append(((this.shrtckn == null)?"<null>":this.shrtckn));
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
        result = ((result* 31)+((this.shrtckg == null)? 0 :this.shrtckg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrtckl == null)? 0 :this.shrtckl.hashCode()));
        result = ((result* 31)+((this.shrtckn == null)? 0 :this.shrtckn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseMaintenance100PutResponse) == false) {
            return false;
        }
        CourseMaintenance100PutResponse rhs = ((CourseMaintenance100PutResponse) other);
        return (((((this.shrtckg == rhs.shrtckg)||((this.shrtckg!= null)&&this.shrtckg.equals(rhs.shrtckg)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrtckl == rhs.shrtckl)||((this.shrtckl!= null)&&this.shrtckl.equals(rhs.shrtckl))))&&((this.shrtckn == rhs.shrtckn)||((this.shrtckn!= null)&&this.shrtckn.equals(rhs.shrtckn))));
    }

}
