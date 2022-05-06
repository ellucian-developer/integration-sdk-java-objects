
package com.ellucian.generated.bpapi.ban.section_restriction_degree_and_program.v1_0_0;

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
    "ssrrprg",
    "ssrrdeg",
    "rdeg_ctrl_block",
    "rprg_ctrl_block"
})
@Generated("jsonschema2pojo")
public class SectionRestrictionDegreeAndProgram100GetResponse {

    @JsonProperty("ssrrprg")
    private List<Ssrrprg> ssrrprg = new ArrayList<Ssrrprg>();
    @JsonProperty("ssrrdeg")
    private List<Ssrrdeg> ssrrdeg = new ArrayList<Ssrrdeg>();
    @JsonProperty("rdeg_ctrl_block")
    private List<RdegCtrlBlock> rdegCtrlBlock = new ArrayList<RdegCtrlBlock>();
    @JsonProperty("rprg_ctrl_block")
    private List<RprgCtrlBlock> rprgCtrlBlock = new ArrayList<RprgCtrlBlock>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrrprg")
    public List<Ssrrprg> getSsrrprg() {
        return ssrrprg;
    }

    @JsonProperty("ssrrprg")
    public void setSsrrprg(List<Ssrrprg> ssrrprg) {
        this.ssrrprg = ssrrprg;
    }

    public SectionRestrictionDegreeAndProgram100GetResponse withSsrrprg(List<Ssrrprg> ssrrprg) {
        this.ssrrprg = ssrrprg;
        return this;
    }

    @JsonProperty("ssrrdeg")
    public List<Ssrrdeg> getSsrrdeg() {
        return ssrrdeg;
    }

    @JsonProperty("ssrrdeg")
    public void setSsrrdeg(List<Ssrrdeg> ssrrdeg) {
        this.ssrrdeg = ssrrdeg;
    }

    public SectionRestrictionDegreeAndProgram100GetResponse withSsrrdeg(List<Ssrrdeg> ssrrdeg) {
        this.ssrrdeg = ssrrdeg;
        return this;
    }

    @JsonProperty("rdeg_ctrl_block")
    public List<RdegCtrlBlock> getRdegCtrlBlock() {
        return rdegCtrlBlock;
    }

    @JsonProperty("rdeg_ctrl_block")
    public void setRdegCtrlBlock(List<RdegCtrlBlock> rdegCtrlBlock) {
        this.rdegCtrlBlock = rdegCtrlBlock;
    }

    public SectionRestrictionDegreeAndProgram100GetResponse withRdegCtrlBlock(List<RdegCtrlBlock> rdegCtrlBlock) {
        this.rdegCtrlBlock = rdegCtrlBlock;
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

    public SectionRestrictionDegreeAndProgram100GetResponse withRprgCtrlBlock(List<RprgCtrlBlock> rprgCtrlBlock) {
        this.rprgCtrlBlock = rprgCtrlBlock;
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

    public SectionRestrictionDegreeAndProgram100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRestrictionDegreeAndProgram100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrprg");
        sb.append('=');
        sb.append(((this.ssrrprg == null)?"<null>":this.ssrrprg));
        sb.append(',');
        sb.append("ssrrdeg");
        sb.append('=');
        sb.append(((this.ssrrdeg == null)?"<null>":this.ssrrdeg));
        sb.append(',');
        sb.append("rdegCtrlBlock");
        sb.append('=');
        sb.append(((this.rdegCtrlBlock == null)?"<null>":this.rdegCtrlBlock));
        sb.append(',');
        sb.append("rprgCtrlBlock");
        sb.append('=');
        sb.append(((this.rprgCtrlBlock == null)?"<null>":this.rprgCtrlBlock));
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
        result = ((result* 31)+((this.ssrrprg == null)? 0 :this.ssrrprg.hashCode()));
        result = ((result* 31)+((this.rdegCtrlBlock == null)? 0 :this.rdegCtrlBlock.hashCode()));
        result = ((result* 31)+((this.rprgCtrlBlock == null)? 0 :this.rprgCtrlBlock.hashCode()));
        result = ((result* 31)+((this.ssrrdeg == null)? 0 :this.ssrrdeg.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRestrictionDegreeAndProgram100GetResponse) == false) {
            return false;
        }
        SectionRestrictionDegreeAndProgram100GetResponse rhs = ((SectionRestrictionDegreeAndProgram100GetResponse) other);
        return ((((((this.ssrrprg == rhs.ssrrprg)||((this.ssrrprg!= null)&&this.ssrrprg.equals(rhs.ssrrprg)))&&((this.rdegCtrlBlock == rhs.rdegCtrlBlock)||((this.rdegCtrlBlock!= null)&&this.rdegCtrlBlock.equals(rhs.rdegCtrlBlock))))&&((this.rprgCtrlBlock == rhs.rprgCtrlBlock)||((this.rprgCtrlBlock!= null)&&this.rprgCtrlBlock.equals(rhs.rprgCtrlBlock))))&&((this.ssrrdeg == rhs.ssrrdeg)||((this.ssrrdeg!= null)&&this.ssrrdeg.equals(rhs.ssrrdeg))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
