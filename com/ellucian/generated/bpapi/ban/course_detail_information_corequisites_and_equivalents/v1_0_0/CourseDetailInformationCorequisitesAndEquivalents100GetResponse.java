
package com.ellucian.generated.bpapi.ban.course_detail_information_corequisites_and_equivalents.v1_0_0;

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
    "scacrse_key_block",
    "corq_ctrl_block",
    "scrcorq",
    "eqiv_ctrl_block",
    "screqiv"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationCorequisitesAndEquivalents100GetResponse {

    @JsonProperty("scacrse_key_block")
    private List<ScacrseKeyBlock> scacrseKeyBlock = new ArrayList<ScacrseKeyBlock>();
    @JsonProperty("corq_ctrl_block")
    private List<CorqCtrlBlock> corqCtrlBlock = new ArrayList<CorqCtrlBlock>();
    @JsonProperty("scrcorq")
    private List<Scrcorq> scrcorq = new ArrayList<Scrcorq>();
    @JsonProperty("eqiv_ctrl_block")
    private List<EqivCtrlBlock> eqivCtrlBlock = new ArrayList<EqivCtrlBlock>();
    @JsonProperty("screqiv")
    private List<Screqiv> screqiv = new ArrayList<Screqiv>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scacrse_key_block")
    public List<ScacrseKeyBlock> getScacrseKeyBlock() {
        return scacrseKeyBlock;
    }

    @JsonProperty("scacrse_key_block")
    public void setScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100GetResponse withScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
        return this;
    }

    @JsonProperty("corq_ctrl_block")
    public List<CorqCtrlBlock> getCorqCtrlBlock() {
        return corqCtrlBlock;
    }

    @JsonProperty("corq_ctrl_block")
    public void setCorqCtrlBlock(List<CorqCtrlBlock> corqCtrlBlock) {
        this.corqCtrlBlock = corqCtrlBlock;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100GetResponse withCorqCtrlBlock(List<CorqCtrlBlock> corqCtrlBlock) {
        this.corqCtrlBlock = corqCtrlBlock;
        return this;
    }

    @JsonProperty("scrcorq")
    public List<Scrcorq> getScrcorq() {
        return scrcorq;
    }

    @JsonProperty("scrcorq")
    public void setScrcorq(List<Scrcorq> scrcorq) {
        this.scrcorq = scrcorq;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100GetResponse withScrcorq(List<Scrcorq> scrcorq) {
        this.scrcorq = scrcorq;
        return this;
    }

    @JsonProperty("eqiv_ctrl_block")
    public List<EqivCtrlBlock> getEqivCtrlBlock() {
        return eqivCtrlBlock;
    }

    @JsonProperty("eqiv_ctrl_block")
    public void setEqivCtrlBlock(List<EqivCtrlBlock> eqivCtrlBlock) {
        this.eqivCtrlBlock = eqivCtrlBlock;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100GetResponse withEqivCtrlBlock(List<EqivCtrlBlock> eqivCtrlBlock) {
        this.eqivCtrlBlock = eqivCtrlBlock;
        return this;
    }

    @JsonProperty("screqiv")
    public List<Screqiv> getScreqiv() {
        return screqiv;
    }

    @JsonProperty("screqiv")
    public void setScreqiv(List<Screqiv> screqiv) {
        this.screqiv = screqiv;
    }

    public CourseDetailInformationCorequisitesAndEquivalents100GetResponse withScreqiv(List<Screqiv> screqiv) {
        this.screqiv = screqiv;
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

    public CourseDetailInformationCorequisitesAndEquivalents100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationCorequisitesAndEquivalents100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseKeyBlock");
        sb.append('=');
        sb.append(((this.scacrseKeyBlock == null)?"<null>":this.scacrseKeyBlock));
        sb.append(',');
        sb.append("corqCtrlBlock");
        sb.append('=');
        sb.append(((this.corqCtrlBlock == null)?"<null>":this.corqCtrlBlock));
        sb.append(',');
        sb.append("scrcorq");
        sb.append('=');
        sb.append(((this.scrcorq == null)?"<null>":this.scrcorq));
        sb.append(',');
        sb.append("eqivCtrlBlock");
        sb.append('=');
        sb.append(((this.eqivCtrlBlock == null)?"<null>":this.eqivCtrlBlock));
        sb.append(',');
        sb.append("screqiv");
        sb.append('=');
        sb.append(((this.screqiv == null)?"<null>":this.screqiv));
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
        result = ((result* 31)+((this.scacrseKeyBlock == null)? 0 :this.scacrseKeyBlock.hashCode()));
        result = ((result* 31)+((this.eqivCtrlBlock == null)? 0 :this.eqivCtrlBlock.hashCode()));
        result = ((result* 31)+((this.screqiv == null)? 0 :this.screqiv.hashCode()));
        result = ((result* 31)+((this.corqCtrlBlock == null)? 0 :this.corqCtrlBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrcorq == null)? 0 :this.scrcorq.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationCorequisitesAndEquivalents100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationCorequisitesAndEquivalents100GetResponse rhs = ((CourseDetailInformationCorequisitesAndEquivalents100GetResponse) other);
        return (((((((this.scacrseKeyBlock == rhs.scacrseKeyBlock)||((this.scacrseKeyBlock!= null)&&this.scacrseKeyBlock.equals(rhs.scacrseKeyBlock)))&&((this.eqivCtrlBlock == rhs.eqivCtrlBlock)||((this.eqivCtrlBlock!= null)&&this.eqivCtrlBlock.equals(rhs.eqivCtrlBlock))))&&((this.screqiv == rhs.screqiv)||((this.screqiv!= null)&&this.screqiv.equals(rhs.screqiv))))&&((this.corqCtrlBlock == rhs.corqCtrlBlock)||((this.corqCtrlBlock!= null)&&this.corqCtrlBlock.equals(rhs.corqCtrlBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrcorq == rhs.scrcorq)||((this.scrcorq!= null)&&this.scrcorq.equals(rhs.scrcorq))));
    }

}
