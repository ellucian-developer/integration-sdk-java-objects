
package com.ellucian.generated.bpapi.ban.section_restriction_campus_and_college.v1_0_0;

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
    "ssrrcol",
    "rcol_ctrl_block",
    "ssrrcmp",
    "rcmp_ctrl_block"
})
@Generated("jsonschema2pojo")
public class SectionRestrictionCampusAndCollege100GetResponse {

    @JsonProperty("ssrrcol")
    private List<Ssrrcol> ssrrcol = new ArrayList<Ssrrcol>();
    @JsonProperty("rcol_ctrl_block")
    private List<RcolCtrlBlock> rcolCtrlBlock = new ArrayList<RcolCtrlBlock>();
    @JsonProperty("ssrrcmp")
    private List<Ssrrcmp> ssrrcmp = new ArrayList<Ssrrcmp>();
    @JsonProperty("rcmp_ctrl_block")
    private List<RcmpCtrlBlock> rcmpCtrlBlock = new ArrayList<RcmpCtrlBlock>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrrcol")
    public List<Ssrrcol> getSsrrcol() {
        return ssrrcol;
    }

    @JsonProperty("ssrrcol")
    public void setSsrrcol(List<Ssrrcol> ssrrcol) {
        this.ssrrcol = ssrrcol;
    }

    public SectionRestrictionCampusAndCollege100GetResponse withSsrrcol(List<Ssrrcol> ssrrcol) {
        this.ssrrcol = ssrrcol;
        return this;
    }

    @JsonProperty("rcol_ctrl_block")
    public List<RcolCtrlBlock> getRcolCtrlBlock() {
        return rcolCtrlBlock;
    }

    @JsonProperty("rcol_ctrl_block")
    public void setRcolCtrlBlock(List<RcolCtrlBlock> rcolCtrlBlock) {
        this.rcolCtrlBlock = rcolCtrlBlock;
    }

    public SectionRestrictionCampusAndCollege100GetResponse withRcolCtrlBlock(List<RcolCtrlBlock> rcolCtrlBlock) {
        this.rcolCtrlBlock = rcolCtrlBlock;
        return this;
    }

    @JsonProperty("ssrrcmp")
    public List<Ssrrcmp> getSsrrcmp() {
        return ssrrcmp;
    }

    @JsonProperty("ssrrcmp")
    public void setSsrrcmp(List<Ssrrcmp> ssrrcmp) {
        this.ssrrcmp = ssrrcmp;
    }

    public SectionRestrictionCampusAndCollege100GetResponse withSsrrcmp(List<Ssrrcmp> ssrrcmp) {
        this.ssrrcmp = ssrrcmp;
        return this;
    }

    @JsonProperty("rcmp_ctrl_block")
    public List<RcmpCtrlBlock> getRcmpCtrlBlock() {
        return rcmpCtrlBlock;
    }

    @JsonProperty("rcmp_ctrl_block")
    public void setRcmpCtrlBlock(List<RcmpCtrlBlock> rcmpCtrlBlock) {
        this.rcmpCtrlBlock = rcmpCtrlBlock;
    }

    public SectionRestrictionCampusAndCollege100GetResponse withRcmpCtrlBlock(List<RcmpCtrlBlock> rcmpCtrlBlock) {
        this.rcmpCtrlBlock = rcmpCtrlBlock;
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

    public SectionRestrictionCampusAndCollege100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRestrictionCampusAndCollege100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrcol");
        sb.append('=');
        sb.append(((this.ssrrcol == null)?"<null>":this.ssrrcol));
        sb.append(',');
        sb.append("rcolCtrlBlock");
        sb.append('=');
        sb.append(((this.rcolCtrlBlock == null)?"<null>":this.rcolCtrlBlock));
        sb.append(',');
        sb.append("ssrrcmp");
        sb.append('=');
        sb.append(((this.ssrrcmp == null)?"<null>":this.ssrrcmp));
        sb.append(',');
        sb.append("rcmpCtrlBlock");
        sb.append('=');
        sb.append(((this.rcmpCtrlBlock == null)?"<null>":this.rcmpCtrlBlock));
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
        result = ((result* 31)+((this.ssrrcmp == null)? 0 :this.ssrrcmp.hashCode()));
        result = ((result* 31)+((this.rcmpCtrlBlock == null)? 0 :this.rcmpCtrlBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrrcol == null)? 0 :this.ssrrcol.hashCode()));
        result = ((result* 31)+((this.rcolCtrlBlock == null)? 0 :this.rcolCtrlBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRestrictionCampusAndCollege100GetResponse) == false) {
            return false;
        }
        SectionRestrictionCampusAndCollege100GetResponse rhs = ((SectionRestrictionCampusAndCollege100GetResponse) other);
        return ((((((this.ssrrcmp == rhs.ssrrcmp)||((this.ssrrcmp!= null)&&this.ssrrcmp.equals(rhs.ssrrcmp)))&&((this.rcmpCtrlBlock == rhs.rcmpCtrlBlock)||((this.rcmpCtrlBlock!= null)&&this.rcmpCtrlBlock.equals(rhs.rcmpCtrlBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrrcol == rhs.ssrrcol)||((this.ssrrcol!= null)&&this.ssrrcol.equals(rhs.ssrrcol))))&&((this.rcolCtrlBlock == rhs.rcolCtrlBlock)||((this.rcolCtrlBlock!= null)&&this.rcolCtrlBlock.equals(rhs.rcolCtrlBlock))));
    }

}
