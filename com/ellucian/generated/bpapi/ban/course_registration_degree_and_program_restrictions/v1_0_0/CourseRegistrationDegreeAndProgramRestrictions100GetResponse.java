
package com.ellucian.generated.bpapi.ban.course_registration_degree_and_program_restrictions.v1_0_0;

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
    "rdeg_ctrl_block",
    "scrrdeg",
    "rprg_ctrl_block",
    "scrrprg"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationDegreeAndProgramRestrictions100GetResponse {

    @JsonProperty("rdeg_ctrl_block")
    private List<RdegCtrlBlock> rdegCtrlBlock = new ArrayList<RdegCtrlBlock>();
    @JsonProperty("scrrdeg")
    private List<Scrrdeg> scrrdeg = new ArrayList<Scrrdeg>();
    @JsonProperty("rprg_ctrl_block")
    private List<RprgCtrlBlock> rprgCtrlBlock = new ArrayList<RprgCtrlBlock>();
    @JsonProperty("scrrprg")
    private List<Scrrprg> scrrprg = new ArrayList<Scrrprg>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rdeg_ctrl_block")
    public List<RdegCtrlBlock> getRdegCtrlBlock() {
        return rdegCtrlBlock;
    }

    @JsonProperty("rdeg_ctrl_block")
    public void setRdegCtrlBlock(List<RdegCtrlBlock> rdegCtrlBlock) {
        this.rdegCtrlBlock = rdegCtrlBlock;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100GetResponse withRdegCtrlBlock(List<RdegCtrlBlock> rdegCtrlBlock) {
        this.rdegCtrlBlock = rdegCtrlBlock;
        return this;
    }

    @JsonProperty("scrrdeg")
    public List<Scrrdeg> getScrrdeg() {
        return scrrdeg;
    }

    @JsonProperty("scrrdeg")
    public void setScrrdeg(List<Scrrdeg> scrrdeg) {
        this.scrrdeg = scrrdeg;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100GetResponse withScrrdeg(List<Scrrdeg> scrrdeg) {
        this.scrrdeg = scrrdeg;
        return this;
    }

    @JsonProperty("rprg_ctrl_block")
    public List<RprgCtrlBlock> getRprgCtrlBlock() {
        return rprgCtrlBlock;
    }

    @JsonProperty("rprg_ctrl_block")
    public void setRprgCtrlBlock(List<RprgCtrlBlock> rprgCtrlBlock) {
        this.rprgCtrlBlock = rprgCtrlBlock;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100GetResponse withRprgCtrlBlock(List<RprgCtrlBlock> rprgCtrlBlock) {
        this.rprgCtrlBlock = rprgCtrlBlock;
        return this;
    }

    @JsonProperty("scrrprg")
    public List<Scrrprg> getScrrprg() {
        return scrrprg;
    }

    @JsonProperty("scrrprg")
    public void setScrrprg(List<Scrrprg> scrrprg) {
        this.scrrprg = scrrprg;
    }

    public CourseRegistrationDegreeAndProgramRestrictions100GetResponse withScrrprg(List<Scrrprg> scrrprg) {
        this.scrrprg = scrrprg;
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

    public CourseRegistrationDegreeAndProgramRestrictions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationDegreeAndProgramRestrictions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rdegCtrlBlock");
        sb.append('=');
        sb.append(((this.rdegCtrlBlock == null)?"<null>":this.rdegCtrlBlock));
        sb.append(',');
        sb.append("scrrdeg");
        sb.append('=');
        sb.append(((this.scrrdeg == null)?"<null>":this.scrrdeg));
        sb.append(',');
        sb.append("rprgCtrlBlock");
        sb.append('=');
        sb.append(((this.rprgCtrlBlock == null)?"<null>":this.rprgCtrlBlock));
        sb.append(',');
        sb.append("scrrprg");
        sb.append('=');
        sb.append(((this.scrrprg == null)?"<null>":this.scrrprg));
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
        result = ((result* 31)+((this.rdegCtrlBlock == null)? 0 :this.rdegCtrlBlock.hashCode()));
        result = ((result* 31)+((this.rprgCtrlBlock == null)? 0 :this.rprgCtrlBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrprg == null)? 0 :this.scrrprg.hashCode()));
        result = ((result* 31)+((this.scrrdeg == null)? 0 :this.scrrdeg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationDegreeAndProgramRestrictions100GetResponse) == false) {
            return false;
        }
        CourseRegistrationDegreeAndProgramRestrictions100GetResponse rhs = ((CourseRegistrationDegreeAndProgramRestrictions100GetResponse) other);
        return ((((((this.rdegCtrlBlock == rhs.rdegCtrlBlock)||((this.rdegCtrlBlock!= null)&&this.rdegCtrlBlock.equals(rhs.rdegCtrlBlock)))&&((this.rprgCtrlBlock == rhs.rprgCtrlBlock)||((this.rprgCtrlBlock!= null)&&this.rprgCtrlBlock.equals(rhs.rprgCtrlBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrprg == rhs.scrrprg)||((this.scrrprg!= null)&&this.scrrprg.equals(rhs.scrrprg))))&&((this.scrrdeg == rhs.scrrdeg)||((this.scrrdeg!= null)&&this.scrrdeg.equals(rhs.scrrdeg))));
    }

}
