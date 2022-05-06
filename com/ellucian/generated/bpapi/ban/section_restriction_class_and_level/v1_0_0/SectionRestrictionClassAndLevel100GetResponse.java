
package com.ellucian.generated.bpapi.ban.section_restriction_class_and_level.v1_0_0;

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
    "rcls_ctrl_block",
    "ssrrcls",
    "rlvl_ctrl_block",
    "ssrrlvl"
})
@Generated("jsonschema2pojo")
public class SectionRestrictionClassAndLevel100GetResponse {

    @JsonProperty("rcls_ctrl_block")
    private List<RclsCtrlBlock> rclsCtrlBlock = new ArrayList<RclsCtrlBlock>();
    @JsonProperty("ssrrcls")
    private List<Ssrrcl> ssrrcls = new ArrayList<Ssrrcl>();
    @JsonProperty("rlvl_ctrl_block")
    private List<RlvlCtrlBlock> rlvlCtrlBlock = new ArrayList<RlvlCtrlBlock>();
    @JsonProperty("ssrrlvl")
    private List<Ssrrlvl> ssrrlvl = new ArrayList<Ssrrlvl>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rcls_ctrl_block")
    public List<RclsCtrlBlock> getRclsCtrlBlock() {
        return rclsCtrlBlock;
    }

    @JsonProperty("rcls_ctrl_block")
    public void setRclsCtrlBlock(List<RclsCtrlBlock> rclsCtrlBlock) {
        this.rclsCtrlBlock = rclsCtrlBlock;
    }

    public SectionRestrictionClassAndLevel100GetResponse withRclsCtrlBlock(List<RclsCtrlBlock> rclsCtrlBlock) {
        this.rclsCtrlBlock = rclsCtrlBlock;
        return this;
    }

    @JsonProperty("ssrrcls")
    public List<Ssrrcl> getSsrrcls() {
        return ssrrcls;
    }

    @JsonProperty("ssrrcls")
    public void setSsrrcls(List<Ssrrcl> ssrrcls) {
        this.ssrrcls = ssrrcls;
    }

    public SectionRestrictionClassAndLevel100GetResponse withSsrrcls(List<Ssrrcl> ssrrcls) {
        this.ssrrcls = ssrrcls;
        return this;
    }

    @JsonProperty("rlvl_ctrl_block")
    public List<RlvlCtrlBlock> getRlvlCtrlBlock() {
        return rlvlCtrlBlock;
    }

    @JsonProperty("rlvl_ctrl_block")
    public void setRlvlCtrlBlock(List<RlvlCtrlBlock> rlvlCtrlBlock) {
        this.rlvlCtrlBlock = rlvlCtrlBlock;
    }

    public SectionRestrictionClassAndLevel100GetResponse withRlvlCtrlBlock(List<RlvlCtrlBlock> rlvlCtrlBlock) {
        this.rlvlCtrlBlock = rlvlCtrlBlock;
        return this;
    }

    @JsonProperty("ssrrlvl")
    public List<Ssrrlvl> getSsrrlvl() {
        return ssrrlvl;
    }

    @JsonProperty("ssrrlvl")
    public void setSsrrlvl(List<Ssrrlvl> ssrrlvl) {
        this.ssrrlvl = ssrrlvl;
    }

    public SectionRestrictionClassAndLevel100GetResponse withSsrrlvl(List<Ssrrlvl> ssrrlvl) {
        this.ssrrlvl = ssrrlvl;
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

    public SectionRestrictionClassAndLevel100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRestrictionClassAndLevel100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rclsCtrlBlock");
        sb.append('=');
        sb.append(((this.rclsCtrlBlock == null)?"<null>":this.rclsCtrlBlock));
        sb.append(',');
        sb.append("ssrrcls");
        sb.append('=');
        sb.append(((this.ssrrcls == null)?"<null>":this.ssrrcls));
        sb.append(',');
        sb.append("rlvlCtrlBlock");
        sb.append('=');
        sb.append(((this.rlvlCtrlBlock == null)?"<null>":this.rlvlCtrlBlock));
        sb.append(',');
        sb.append("ssrrlvl");
        sb.append('=');
        sb.append(((this.ssrrlvl == null)?"<null>":this.ssrrlvl));
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
        result = ((result* 31)+((this.rlvlCtrlBlock == null)? 0 :this.rlvlCtrlBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rclsCtrlBlock == null)? 0 :this.rclsCtrlBlock.hashCode()));
        result = ((result* 31)+((this.ssrrcls == null)? 0 :this.ssrrcls.hashCode()));
        result = ((result* 31)+((this.ssrrlvl == null)? 0 :this.ssrrlvl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRestrictionClassAndLevel100GetResponse) == false) {
            return false;
        }
        SectionRestrictionClassAndLevel100GetResponse rhs = ((SectionRestrictionClassAndLevel100GetResponse) other);
        return ((((((this.rlvlCtrlBlock == rhs.rlvlCtrlBlock)||((this.rlvlCtrlBlock!= null)&&this.rlvlCtrlBlock.equals(rhs.rlvlCtrlBlock)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rclsCtrlBlock == rhs.rclsCtrlBlock)||((this.rclsCtrlBlock!= null)&&this.rclsCtrlBlock.equals(rhs.rclsCtrlBlock))))&&((this.ssrrcls == rhs.ssrrcls)||((this.ssrrcls!= null)&&this.ssrrcls.equals(rhs.ssrrcls))))&&((this.ssrrlvl == rhs.ssrrlvl)||((this.ssrrlvl!= null)&&this.ssrrlvl.equals(rhs.ssrrlvl))));
    }

}
