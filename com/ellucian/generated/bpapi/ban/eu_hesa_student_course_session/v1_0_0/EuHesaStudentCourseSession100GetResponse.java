
package com.ellucian.generated.bpapi.ban.eu_hesa_student_course_session.v1_0_0;

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
    "sobstcs",
    "sobscfm",
    "sobscfb",
    "sobmova",
    "sobscft",
    "sobscss",
    "sobscfs",
    "sobscsl",
    "sobscsa"
})
@Generated("jsonschema2pojo")
public class EuHesaStudentCourseSession100GetResponse {

    @JsonProperty("sobstcs")
    private List<Sobstc> sobstcs = new ArrayList<Sobstc>();
    @JsonProperty("sobscfm")
    private List<Sobscfm> sobscfm = new ArrayList<Sobscfm>();
    @JsonProperty("sobscfb")
    private List<Sobscfb> sobscfb = new ArrayList<Sobscfb>();
    @JsonProperty("sobmova")
    private List<Sobmova> sobmova = new ArrayList<Sobmova>();
    @JsonProperty("sobscft")
    private List<Sobscft> sobscft = new ArrayList<Sobscft>();
    @JsonProperty("sobscss")
    private List<Sobscs> sobscss = new ArrayList<Sobscs>();
    @JsonProperty("sobscfs")
    private List<Sobscf> sobscfs = new ArrayList<Sobscf>();
    @JsonProperty("sobscsl")
    private List<Sobscsl> sobscsl = new ArrayList<Sobscsl>();
    @JsonProperty("sobscsa")
    private List<Sobscsa> sobscsa = new ArrayList<Sobscsa>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobstcs")
    public List<Sobstc> getSobstcs() {
        return sobstcs;
    }

    @JsonProperty("sobstcs")
    public void setSobstcs(List<Sobstc> sobstcs) {
        this.sobstcs = sobstcs;
    }

    public EuHesaStudentCourseSession100GetResponse withSobstcs(List<Sobstc> sobstcs) {
        this.sobstcs = sobstcs;
        return this;
    }

    @JsonProperty("sobscfm")
    public List<Sobscfm> getSobscfm() {
        return sobscfm;
    }

    @JsonProperty("sobscfm")
    public void setSobscfm(List<Sobscfm> sobscfm) {
        this.sobscfm = sobscfm;
    }

    public EuHesaStudentCourseSession100GetResponse withSobscfm(List<Sobscfm> sobscfm) {
        this.sobscfm = sobscfm;
        return this;
    }

    @JsonProperty("sobscfb")
    public List<Sobscfb> getSobscfb() {
        return sobscfb;
    }

    @JsonProperty("sobscfb")
    public void setSobscfb(List<Sobscfb> sobscfb) {
        this.sobscfb = sobscfb;
    }

    public EuHesaStudentCourseSession100GetResponse withSobscfb(List<Sobscfb> sobscfb) {
        this.sobscfb = sobscfb;
        return this;
    }

    @JsonProperty("sobmova")
    public List<Sobmova> getSobmova() {
        return sobmova;
    }

    @JsonProperty("sobmova")
    public void setSobmova(List<Sobmova> sobmova) {
        this.sobmova = sobmova;
    }

    public EuHesaStudentCourseSession100GetResponse withSobmova(List<Sobmova> sobmova) {
        this.sobmova = sobmova;
        return this;
    }

    @JsonProperty("sobscft")
    public List<Sobscft> getSobscft() {
        return sobscft;
    }

    @JsonProperty("sobscft")
    public void setSobscft(List<Sobscft> sobscft) {
        this.sobscft = sobscft;
    }

    public EuHesaStudentCourseSession100GetResponse withSobscft(List<Sobscft> sobscft) {
        this.sobscft = sobscft;
        return this;
    }

    @JsonProperty("sobscss")
    public List<Sobscs> getSobscss() {
        return sobscss;
    }

    @JsonProperty("sobscss")
    public void setSobscss(List<Sobscs> sobscss) {
        this.sobscss = sobscss;
    }

    public EuHesaStudentCourseSession100GetResponse withSobscss(List<Sobscs> sobscss) {
        this.sobscss = sobscss;
        return this;
    }

    @JsonProperty("sobscfs")
    public List<Sobscf> getSobscfs() {
        return sobscfs;
    }

    @JsonProperty("sobscfs")
    public void setSobscfs(List<Sobscf> sobscfs) {
        this.sobscfs = sobscfs;
    }

    public EuHesaStudentCourseSession100GetResponse withSobscfs(List<Sobscf> sobscfs) {
        this.sobscfs = sobscfs;
        return this;
    }

    @JsonProperty("sobscsl")
    public List<Sobscsl> getSobscsl() {
        return sobscsl;
    }

    @JsonProperty("sobscsl")
    public void setSobscsl(List<Sobscsl> sobscsl) {
        this.sobscsl = sobscsl;
    }

    public EuHesaStudentCourseSession100GetResponse withSobscsl(List<Sobscsl> sobscsl) {
        this.sobscsl = sobscsl;
        return this;
    }

    @JsonProperty("sobscsa")
    public List<Sobscsa> getSobscsa() {
        return sobscsa;
    }

    @JsonProperty("sobscsa")
    public void setSobscsa(List<Sobscsa> sobscsa) {
        this.sobscsa = sobscsa;
    }

    public EuHesaStudentCourseSession100GetResponse withSobscsa(List<Sobscsa> sobscsa) {
        this.sobscsa = sobscsa;
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

    public EuHesaStudentCourseSession100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaStudentCourseSession100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobstcs");
        sb.append('=');
        sb.append(((this.sobstcs == null)?"<null>":this.sobstcs));
        sb.append(',');
        sb.append("sobscfm");
        sb.append('=');
        sb.append(((this.sobscfm == null)?"<null>":this.sobscfm));
        sb.append(',');
        sb.append("sobscfb");
        sb.append('=');
        sb.append(((this.sobscfb == null)?"<null>":this.sobscfb));
        sb.append(',');
        sb.append("sobmova");
        sb.append('=');
        sb.append(((this.sobmova == null)?"<null>":this.sobmova));
        sb.append(',');
        sb.append("sobscft");
        sb.append('=');
        sb.append(((this.sobscft == null)?"<null>":this.sobscft));
        sb.append(',');
        sb.append("sobscss");
        sb.append('=');
        sb.append(((this.sobscss == null)?"<null>":this.sobscss));
        sb.append(',');
        sb.append("sobscfs");
        sb.append('=');
        sb.append(((this.sobscfs == null)?"<null>":this.sobscfs));
        sb.append(',');
        sb.append("sobscsl");
        sb.append('=');
        sb.append(((this.sobscsl == null)?"<null>":this.sobscsl));
        sb.append(',');
        sb.append("sobscsa");
        sb.append('=');
        sb.append(((this.sobscsa == null)?"<null>":this.sobscsa));
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
        result = ((result* 31)+((this.sobscfs == null)? 0 :this.sobscfs.hashCode()));
        result = ((result* 31)+((this.sobscfb == null)? 0 :this.sobscfb.hashCode()));
        result = ((result* 31)+((this.sobscft == null)? 0 :this.sobscft.hashCode()));
        result = ((result* 31)+((this.sobscsa == null)? 0 :this.sobscsa.hashCode()));
        result = ((result* 31)+((this.sobstcs == null)? 0 :this.sobstcs.hashCode()));
        result = ((result* 31)+((this.sobscss == null)? 0 :this.sobscss.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sobscfm == null)? 0 :this.sobscfm.hashCode()));
        result = ((result* 31)+((this.sobmova == null)? 0 :this.sobmova.hashCode()));
        result = ((result* 31)+((this.sobscsl == null)? 0 :this.sobscsl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaStudentCourseSession100GetResponse) == false) {
            return false;
        }
        EuHesaStudentCourseSession100GetResponse rhs = ((EuHesaStudentCourseSession100GetResponse) other);
        return (((((((((((this.sobscfs == rhs.sobscfs)||((this.sobscfs!= null)&&this.sobscfs.equals(rhs.sobscfs)))&&((this.sobscfb == rhs.sobscfb)||((this.sobscfb!= null)&&this.sobscfb.equals(rhs.sobscfb))))&&((this.sobscft == rhs.sobscft)||((this.sobscft!= null)&&this.sobscft.equals(rhs.sobscft))))&&((this.sobscsa == rhs.sobscsa)||((this.sobscsa!= null)&&this.sobscsa.equals(rhs.sobscsa))))&&((this.sobstcs == rhs.sobstcs)||((this.sobstcs!= null)&&this.sobstcs.equals(rhs.sobstcs))))&&((this.sobscss == rhs.sobscss)||((this.sobscss!= null)&&this.sobscss.equals(rhs.sobscss))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sobscfm == rhs.sobscfm)||((this.sobscfm!= null)&&this.sobscfm.equals(rhs.sobscfm))))&&((this.sobmova == rhs.sobmova)||((this.sobmova!= null)&&this.sobmova.equals(rhs.sobmova))))&&((this.sobscsl == rhs.sobscsl)||((this.sobscsl!= null)&&this.sobscsl.equals(rhs.sobscsl))));
    }

}
