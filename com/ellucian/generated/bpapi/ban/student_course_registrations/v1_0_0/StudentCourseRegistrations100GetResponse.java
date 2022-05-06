
package com.ellucian.generated.bpapi.ban.student_course_registrations.v1_0_0;

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
    "sftdwer",
    "sfrcolr",
    "sftregs",
    "sfbetrm",
    "sfrensp",
    "sgbstdn",
    "sorlcur",
    "sorlfos",
    "s$_curricula_traditional",
    "s$_studypath",
    "sgrstsp",
    "sfrthst"
})
@Generated("jsonschema2pojo")
public class StudentCourseRegistrations100GetResponse {

    @JsonProperty("sftdwer")
    private List<Sftdwer> sftdwer = new ArrayList<Sftdwer>();
    @JsonProperty("sfrcolr")
    private List<Sfrcolr> sfrcolr = new ArrayList<Sfrcolr>();
    @JsonProperty("sftregs")
    private List<Sftreg> sftregs = new ArrayList<Sftreg>();
    @JsonProperty("sfbetrm")
    private List<Sfbetrm> sfbetrm = new ArrayList<Sfbetrm>();
    @JsonProperty("sfrensp")
    private List<Sfrensp> sfrensp = new ArrayList<Sfrensp>();
    @JsonProperty("sgbstdn")
    private List<Sgbstdn> sgbstdn = new ArrayList<Sgbstdn>();
    @JsonProperty("sorlcur")
    private List<Sorlcur> sorlcur = new ArrayList<Sorlcur>();
    @JsonProperty("sorlfos")
    private List<Sorlfo> sorlfos = new ArrayList<Sorlfo>();
    @JsonProperty("s$_curricula_traditional")
    private List<S$CurriculaTraditional> s$CurriculaTraditional = new ArrayList<S$CurriculaTraditional>();
    @JsonProperty("s$_studypath")
    private List<S$Studypath> s$Studypath = new ArrayList<S$Studypath>();
    @JsonProperty("sgrstsp")
    private List<Sgrstsp> sgrstsp = new ArrayList<Sgrstsp>();
    @JsonProperty("sfrthst")
    private List<Sfrthst> sfrthst = new ArrayList<Sfrthst>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sftdwer")
    public List<Sftdwer> getSftdwer() {
        return sftdwer;
    }

    @JsonProperty("sftdwer")
    public void setSftdwer(List<Sftdwer> sftdwer) {
        this.sftdwer = sftdwer;
    }

    public StudentCourseRegistrations100GetResponse withSftdwer(List<Sftdwer> sftdwer) {
        this.sftdwer = sftdwer;
        return this;
    }

    @JsonProperty("sfrcolr")
    public List<Sfrcolr> getSfrcolr() {
        return sfrcolr;
    }

    @JsonProperty("sfrcolr")
    public void setSfrcolr(List<Sfrcolr> sfrcolr) {
        this.sfrcolr = sfrcolr;
    }

    public StudentCourseRegistrations100GetResponse withSfrcolr(List<Sfrcolr> sfrcolr) {
        this.sfrcolr = sfrcolr;
        return this;
    }

    @JsonProperty("sftregs")
    public List<Sftreg> getSftregs() {
        return sftregs;
    }

    @JsonProperty("sftregs")
    public void setSftregs(List<Sftreg> sftregs) {
        this.sftregs = sftregs;
    }

    public StudentCourseRegistrations100GetResponse withSftregs(List<Sftreg> sftregs) {
        this.sftregs = sftregs;
        return this;
    }

    @JsonProperty("sfbetrm")
    public List<Sfbetrm> getSfbetrm() {
        return sfbetrm;
    }

    @JsonProperty("sfbetrm")
    public void setSfbetrm(List<Sfbetrm> sfbetrm) {
        this.sfbetrm = sfbetrm;
    }

    public StudentCourseRegistrations100GetResponse withSfbetrm(List<Sfbetrm> sfbetrm) {
        this.sfbetrm = sfbetrm;
        return this;
    }

    @JsonProperty("sfrensp")
    public List<Sfrensp> getSfrensp() {
        return sfrensp;
    }

    @JsonProperty("sfrensp")
    public void setSfrensp(List<Sfrensp> sfrensp) {
        this.sfrensp = sfrensp;
    }

    public StudentCourseRegistrations100GetResponse withSfrensp(List<Sfrensp> sfrensp) {
        this.sfrensp = sfrensp;
        return this;
    }

    @JsonProperty("sgbstdn")
    public List<Sgbstdn> getSgbstdn() {
        return sgbstdn;
    }

    @JsonProperty("sgbstdn")
    public void setSgbstdn(List<Sgbstdn> sgbstdn) {
        this.sgbstdn = sgbstdn;
    }

    public StudentCourseRegistrations100GetResponse withSgbstdn(List<Sgbstdn> sgbstdn) {
        this.sgbstdn = sgbstdn;
        return this;
    }

    @JsonProperty("sorlcur")
    public List<Sorlcur> getSorlcur() {
        return sorlcur;
    }

    @JsonProperty("sorlcur")
    public void setSorlcur(List<Sorlcur> sorlcur) {
        this.sorlcur = sorlcur;
    }

    public StudentCourseRegistrations100GetResponse withSorlcur(List<Sorlcur> sorlcur) {
        this.sorlcur = sorlcur;
        return this;
    }

    @JsonProperty("sorlfos")
    public List<Sorlfo> getSorlfos() {
        return sorlfos;
    }

    @JsonProperty("sorlfos")
    public void setSorlfos(List<Sorlfo> sorlfos) {
        this.sorlfos = sorlfos;
    }

    public StudentCourseRegistrations100GetResponse withSorlfos(List<Sorlfo> sorlfos) {
        this.sorlfos = sorlfos;
        return this;
    }

    @JsonProperty("s$_curricula_traditional")
    public List<S$CurriculaTraditional> getS$CurriculaTraditional() {
        return s$CurriculaTraditional;
    }

    @JsonProperty("s$_curricula_traditional")
    public void setS$CurriculaTraditional(List<S$CurriculaTraditional> s$CurriculaTraditional) {
        this.s$CurriculaTraditional = s$CurriculaTraditional;
    }

    public StudentCourseRegistrations100GetResponse withS$CurriculaTraditional(List<S$CurriculaTraditional> s$CurriculaTraditional) {
        this.s$CurriculaTraditional = s$CurriculaTraditional;
        return this;
    }

    @JsonProperty("s$_studypath")
    public List<S$Studypath> getS$Studypath() {
        return s$Studypath;
    }

    @JsonProperty("s$_studypath")
    public void setS$Studypath(List<S$Studypath> s$Studypath) {
        this.s$Studypath = s$Studypath;
    }

    public StudentCourseRegistrations100GetResponse withS$Studypath(List<S$Studypath> s$Studypath) {
        this.s$Studypath = s$Studypath;
        return this;
    }

    @JsonProperty("sgrstsp")
    public List<Sgrstsp> getSgrstsp() {
        return sgrstsp;
    }

    @JsonProperty("sgrstsp")
    public void setSgrstsp(List<Sgrstsp> sgrstsp) {
        this.sgrstsp = sgrstsp;
    }

    public StudentCourseRegistrations100GetResponse withSgrstsp(List<Sgrstsp> sgrstsp) {
        this.sgrstsp = sgrstsp;
        return this;
    }

    @JsonProperty("sfrthst")
    public List<Sfrthst> getSfrthst() {
        return sfrthst;
    }

    @JsonProperty("sfrthst")
    public void setSfrthst(List<Sfrthst> sfrthst) {
        this.sfrthst = sfrthst;
    }

    public StudentCourseRegistrations100GetResponse withSfrthst(List<Sfrthst> sfrthst) {
        this.sfrthst = sfrthst;
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

    public StudentCourseRegistrations100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseRegistrations100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sftdwer");
        sb.append('=');
        sb.append(((this.sftdwer == null)?"<null>":this.sftdwer));
        sb.append(',');
        sb.append("sfrcolr");
        sb.append('=');
        sb.append(((this.sfrcolr == null)?"<null>":this.sfrcolr));
        sb.append(',');
        sb.append("sftregs");
        sb.append('=');
        sb.append(((this.sftregs == null)?"<null>":this.sftregs));
        sb.append(',');
        sb.append("sfbetrm");
        sb.append('=');
        sb.append(((this.sfbetrm == null)?"<null>":this.sfbetrm));
        sb.append(',');
        sb.append("sfrensp");
        sb.append('=');
        sb.append(((this.sfrensp == null)?"<null>":this.sfrensp));
        sb.append(',');
        sb.append("sgbstdn");
        sb.append('=');
        sb.append(((this.sgbstdn == null)?"<null>":this.sgbstdn));
        sb.append(',');
        sb.append("sorlcur");
        sb.append('=');
        sb.append(((this.sorlcur == null)?"<null>":this.sorlcur));
        sb.append(',');
        sb.append("sorlfos");
        sb.append('=');
        sb.append(((this.sorlfos == null)?"<null>":this.sorlfos));
        sb.append(',');
        sb.append("s$CurriculaTraditional");
        sb.append('=');
        sb.append(((this.s$CurriculaTraditional == null)?"<null>":this.s$CurriculaTraditional));
        sb.append(',');
        sb.append("s$Studypath");
        sb.append('=');
        sb.append(((this.s$Studypath == null)?"<null>":this.s$Studypath));
        sb.append(',');
        sb.append("sgrstsp");
        sb.append('=');
        sb.append(((this.sgrstsp == null)?"<null>":this.sgrstsp));
        sb.append(',');
        sb.append("sfrthst");
        sb.append('=');
        sb.append(((this.sfrthst == null)?"<null>":this.sfrthst));
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
        result = ((result* 31)+((this.sfrcolr == null)? 0 :this.sfrcolr.hashCode()));
        result = ((result* 31)+((this.sfrthst == null)? 0 :this.sfrthst.hashCode()));
        result = ((result* 31)+((this.sorlcur == null)? 0 :this.sorlcur.hashCode()));
        result = ((result* 31)+((this.sftdwer == null)? 0 :this.sftdwer.hashCode()));
        result = ((result* 31)+((this.sgrstsp == null)? 0 :this.sgrstsp.hashCode()));
        result = ((result* 31)+((this.s$CurriculaTraditional == null)? 0 :this.s$CurriculaTraditional.hashCode()));
        result = ((result* 31)+((this.sftregs == null)? 0 :this.sftregs.hashCode()));
        result = ((result* 31)+((this.sgbstdn == null)? 0 :this.sgbstdn.hashCode()));
        result = ((result* 31)+((this.sfrensp == null)? 0 :this.sfrensp.hashCode()));
        result = ((result* 31)+((this.sfbetrm == null)? 0 :this.sfbetrm.hashCode()));
        result = ((result* 31)+((this.sorlfos == null)? 0 :this.sorlfos.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.s$Studypath == null)? 0 :this.s$Studypath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseRegistrations100GetResponse) == false) {
            return false;
        }
        StudentCourseRegistrations100GetResponse rhs = ((StudentCourseRegistrations100GetResponse) other);
        return ((((((((((((((this.sfrcolr == rhs.sfrcolr)||((this.sfrcolr!= null)&&this.sfrcolr.equals(rhs.sfrcolr)))&&((this.sfrthst == rhs.sfrthst)||((this.sfrthst!= null)&&this.sfrthst.equals(rhs.sfrthst))))&&((this.sorlcur == rhs.sorlcur)||((this.sorlcur!= null)&&this.sorlcur.equals(rhs.sorlcur))))&&((this.sftdwer == rhs.sftdwer)||((this.sftdwer!= null)&&this.sftdwer.equals(rhs.sftdwer))))&&((this.sgrstsp == rhs.sgrstsp)||((this.sgrstsp!= null)&&this.sgrstsp.equals(rhs.sgrstsp))))&&((this.s$CurriculaTraditional == rhs.s$CurriculaTraditional)||((this.s$CurriculaTraditional!= null)&&this.s$CurriculaTraditional.equals(rhs.s$CurriculaTraditional))))&&((this.sftregs == rhs.sftregs)||((this.sftregs!= null)&&this.sftregs.equals(rhs.sftregs))))&&((this.sgbstdn == rhs.sgbstdn)||((this.sgbstdn!= null)&&this.sgbstdn.equals(rhs.sgbstdn))))&&((this.sfrensp == rhs.sfrensp)||((this.sfrensp!= null)&&this.sfrensp.equals(rhs.sfrensp))))&&((this.sfbetrm == rhs.sfbetrm)||((this.sfbetrm!= null)&&this.sfbetrm.equals(rhs.sfbetrm))))&&((this.sorlfos == rhs.sorlfos)||((this.sorlfos!= null)&&this.sorlfos.equals(rhs.sorlfos))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.s$Studypath == rhs.s$Studypath)||((this.s$Studypath!= null)&&this.s$Studypath.equals(rhs.s$Studypath))));
    }

}
