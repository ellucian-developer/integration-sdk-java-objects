
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
    "shrtckn",
    "shrattr",
    "shrattc",
    "shrinst"
})
@Generated("jsonschema2pojo")
public class CourseMaintenance100GetResponse {

    @JsonProperty("shrtckl")
    private List<Shrtckl> shrtckl = new ArrayList<Shrtckl>();
    @JsonProperty("shrtckg")
    private List<Shrtckg> shrtckg = new ArrayList<Shrtckg>();
    @JsonProperty("shrtckn")
    private List<Shrtckn> shrtckn = new ArrayList<Shrtckn>();
    @JsonProperty("shrattr")
    private List<Shrattr> shrattr = new ArrayList<Shrattr>();
    @JsonProperty("shrattc")
    private List<Shrattc> shrattc = new ArrayList<Shrattc>();
    @JsonProperty("shrinst")
    private List<Shrinst> shrinst = new ArrayList<Shrinst>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrtckl")
    public List<Shrtckl> getShrtckl() {
        return shrtckl;
    }

    @JsonProperty("shrtckl")
    public void setShrtckl(List<Shrtckl> shrtckl) {
        this.shrtckl = shrtckl;
    }

    public CourseMaintenance100GetResponse withShrtckl(List<Shrtckl> shrtckl) {
        this.shrtckl = shrtckl;
        return this;
    }

    @JsonProperty("shrtckg")
    public List<Shrtckg> getShrtckg() {
        return shrtckg;
    }

    @JsonProperty("shrtckg")
    public void setShrtckg(List<Shrtckg> shrtckg) {
        this.shrtckg = shrtckg;
    }

    public CourseMaintenance100GetResponse withShrtckg(List<Shrtckg> shrtckg) {
        this.shrtckg = shrtckg;
        return this;
    }

    @JsonProperty("shrtckn")
    public List<Shrtckn> getShrtckn() {
        return shrtckn;
    }

    @JsonProperty("shrtckn")
    public void setShrtckn(List<Shrtckn> shrtckn) {
        this.shrtckn = shrtckn;
    }

    public CourseMaintenance100GetResponse withShrtckn(List<Shrtckn> shrtckn) {
        this.shrtckn = shrtckn;
        return this;
    }

    @JsonProperty("shrattr")
    public List<Shrattr> getShrattr() {
        return shrattr;
    }

    @JsonProperty("shrattr")
    public void setShrattr(List<Shrattr> shrattr) {
        this.shrattr = shrattr;
    }

    public CourseMaintenance100GetResponse withShrattr(List<Shrattr> shrattr) {
        this.shrattr = shrattr;
        return this;
    }

    @JsonProperty("shrattc")
    public List<Shrattc> getShrattc() {
        return shrattc;
    }

    @JsonProperty("shrattc")
    public void setShrattc(List<Shrattc> shrattc) {
        this.shrattc = shrattc;
    }

    public CourseMaintenance100GetResponse withShrattc(List<Shrattc> shrattc) {
        this.shrattc = shrattc;
        return this;
    }

    @JsonProperty("shrinst")
    public List<Shrinst> getShrinst() {
        return shrinst;
    }

    @JsonProperty("shrinst")
    public void setShrinst(List<Shrinst> shrinst) {
        this.shrinst = shrinst;
    }

    public CourseMaintenance100GetResponse withShrinst(List<Shrinst> shrinst) {
        this.shrinst = shrinst;
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

    public CourseMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("shrattr");
        sb.append('=');
        sb.append(((this.shrattr == null)?"<null>":this.shrattr));
        sb.append(',');
        sb.append("shrattc");
        sb.append('=');
        sb.append(((this.shrattc == null)?"<null>":this.shrattc));
        sb.append(',');
        sb.append("shrinst");
        sb.append('=');
        sb.append(((this.shrinst == null)?"<null>":this.shrinst));
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
        result = ((result* 31)+((this.shrattr == null)? 0 :this.shrattr.hashCode()));
        result = ((result* 31)+((this.shrattc == null)? 0 :this.shrattc.hashCode()));
        result = ((result* 31)+((this.shrtckg == null)? 0 :this.shrtckg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrtckl == null)? 0 :this.shrtckl.hashCode()));
        result = ((result* 31)+((this.shrtckn == null)? 0 :this.shrtckn.hashCode()));
        result = ((result* 31)+((this.shrinst == null)? 0 :this.shrinst.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseMaintenance100GetResponse) == false) {
            return false;
        }
        CourseMaintenance100GetResponse rhs = ((CourseMaintenance100GetResponse) other);
        return ((((((((this.shrattr == rhs.shrattr)||((this.shrattr!= null)&&this.shrattr.equals(rhs.shrattr)))&&((this.shrattc == rhs.shrattc)||((this.shrattc!= null)&&this.shrattc.equals(rhs.shrattc))))&&((this.shrtckg == rhs.shrtckg)||((this.shrtckg!= null)&&this.shrtckg.equals(rhs.shrtckg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrtckl == rhs.shrtckl)||((this.shrtckl!= null)&&this.shrtckl.equals(rhs.shrtckl))))&&((this.shrtckn == rhs.shrtckn)||((this.shrtckn!= null)&&this.shrtckn.equals(rhs.shrtckn))))&&((this.shrinst == rhs.shrinst)||((this.shrinst!= null)&&this.shrinst.equals(rhs.shrinst))));
    }

}
