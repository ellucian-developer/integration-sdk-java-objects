
package com.ellucian.generated.bpapi.ban.student_course_maintenance_components.v0_1_0;

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
    "shrgcom",
    "shrcmrk"
})
@Generated("jsonschema2pojo")
public class StudentCourseMaintenanceComponents010PutResponse {

    @JsonProperty("shrtckl")
    private List<Shrtckl__1> shrtckl = new ArrayList<Shrtckl__1>();
    @JsonProperty("shrtckg")
    private List<Shrtckg__1> shrtckg = new ArrayList<Shrtckg__1>();
    @JsonProperty("shrtckn")
    private List<Shrtckn__1> shrtckn = new ArrayList<Shrtckn__1>();
    @JsonProperty("shrgcom")
    private List<Shrgcom__1> shrgcom = new ArrayList<Shrgcom__1>();
    @JsonProperty("shrcmrk")
    private List<Shrcmrk__1> shrcmrk = new ArrayList<Shrcmrk__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrtckl")
    public List<Shrtckl__1> getShrtckl() {
        return shrtckl;
    }

    @JsonProperty("shrtckl")
    public void setShrtckl(List<Shrtckl__1> shrtckl) {
        this.shrtckl = shrtckl;
    }

    public StudentCourseMaintenanceComponents010PutResponse withShrtckl(List<Shrtckl__1> shrtckl) {
        this.shrtckl = shrtckl;
        return this;
    }

    @JsonProperty("shrtckg")
    public List<Shrtckg__1> getShrtckg() {
        return shrtckg;
    }

    @JsonProperty("shrtckg")
    public void setShrtckg(List<Shrtckg__1> shrtckg) {
        this.shrtckg = shrtckg;
    }

    public StudentCourseMaintenanceComponents010PutResponse withShrtckg(List<Shrtckg__1> shrtckg) {
        this.shrtckg = shrtckg;
        return this;
    }

    @JsonProperty("shrtckn")
    public List<Shrtckn__1> getShrtckn() {
        return shrtckn;
    }

    @JsonProperty("shrtckn")
    public void setShrtckn(List<Shrtckn__1> shrtckn) {
        this.shrtckn = shrtckn;
    }

    public StudentCourseMaintenanceComponents010PutResponse withShrtckn(List<Shrtckn__1> shrtckn) {
        this.shrtckn = shrtckn;
        return this;
    }

    @JsonProperty("shrgcom")
    public List<Shrgcom__1> getShrgcom() {
        return shrgcom;
    }

    @JsonProperty("shrgcom")
    public void setShrgcom(List<Shrgcom__1> shrgcom) {
        this.shrgcom = shrgcom;
    }

    public StudentCourseMaintenanceComponents010PutResponse withShrgcom(List<Shrgcom__1> shrgcom) {
        this.shrgcom = shrgcom;
        return this;
    }

    @JsonProperty("shrcmrk")
    public List<Shrcmrk__1> getShrcmrk() {
        return shrcmrk;
    }

    @JsonProperty("shrcmrk")
    public void setShrcmrk(List<Shrcmrk__1> shrcmrk) {
        this.shrcmrk = shrcmrk;
    }

    public StudentCourseMaintenanceComponents010PutResponse withShrcmrk(List<Shrcmrk__1> shrcmrk) {
        this.shrcmrk = shrcmrk;
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

    public StudentCourseMaintenanceComponents010PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseMaintenanceComponents010PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("shrgcom");
        sb.append('=');
        sb.append(((this.shrgcom == null)?"<null>":this.shrgcom));
        sb.append(',');
        sb.append("shrcmrk");
        sb.append('=');
        sb.append(((this.shrcmrk == null)?"<null>":this.shrcmrk));
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
        result = ((result* 31)+((this.shrcmrk == null)? 0 :this.shrcmrk.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrtckl == null)? 0 :this.shrtckl.hashCode()));
        result = ((result* 31)+((this.shrgcom == null)? 0 :this.shrgcom.hashCode()));
        result = ((result* 31)+((this.shrtckn == null)? 0 :this.shrtckn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseMaintenanceComponents010PutResponse) == false) {
            return false;
        }
        StudentCourseMaintenanceComponents010PutResponse rhs = ((StudentCourseMaintenanceComponents010PutResponse) other);
        return (((((((this.shrtckg == rhs.shrtckg)||((this.shrtckg!= null)&&this.shrtckg.equals(rhs.shrtckg)))&&((this.shrcmrk == rhs.shrcmrk)||((this.shrcmrk!= null)&&this.shrcmrk.equals(rhs.shrcmrk))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrtckl == rhs.shrtckl)||((this.shrtckl!= null)&&this.shrtckl.equals(rhs.shrtckl))))&&((this.shrgcom == rhs.shrgcom)||((this.shrgcom!= null)&&this.shrgcom.equals(rhs.shrgcom))))&&((this.shrtckn == rhs.shrtckn)||((this.shrtckn!= null)&&this.shrtckn.equals(rhs.shrtckn))));
    }

}
