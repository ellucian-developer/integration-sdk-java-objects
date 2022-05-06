
package com.ellucian.generated.bpapi.ban.course_registration_class_and_level_restrictions.v1_0_0;

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
    "scrrcls",
    "rlvl_ctrl_block",
    "scrrlvl"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationClassAndLevelRestrictions100PutResponse {

    @JsonProperty("rcls_ctrl_block")
    private List<RclsCtrlBlock__1> rclsCtrlBlock = new ArrayList<RclsCtrlBlock__1>();
    @JsonProperty("scrrcls")
    private List<Scrrcl__2> scrrcls = new ArrayList<Scrrcl__2>();
    @JsonProperty("rlvl_ctrl_block")
    private List<RlvlCtrlBlock__1> rlvlCtrlBlock = new ArrayList<RlvlCtrlBlock__1>();
    @JsonProperty("scrrlvl")
    private List<Scrrlvl__2> scrrlvl = new ArrayList<Scrrlvl__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rcls_ctrl_block")
    public List<RclsCtrlBlock__1> getRclsCtrlBlock() {
        return rclsCtrlBlock;
    }

    @JsonProperty("rcls_ctrl_block")
    public void setRclsCtrlBlock(List<RclsCtrlBlock__1> rclsCtrlBlock) {
        this.rclsCtrlBlock = rclsCtrlBlock;
    }

    public CourseRegistrationClassAndLevelRestrictions100PutResponse withRclsCtrlBlock(List<RclsCtrlBlock__1> rclsCtrlBlock) {
        this.rclsCtrlBlock = rclsCtrlBlock;
        return this;
    }

    @JsonProperty("scrrcls")
    public List<Scrrcl__2> getScrrcls() {
        return scrrcls;
    }

    @JsonProperty("scrrcls")
    public void setScrrcls(List<Scrrcl__2> scrrcls) {
        this.scrrcls = scrrcls;
    }

    public CourseRegistrationClassAndLevelRestrictions100PutResponse withScrrcls(List<Scrrcl__2> scrrcls) {
        this.scrrcls = scrrcls;
        return this;
    }

    @JsonProperty("rlvl_ctrl_block")
    public List<RlvlCtrlBlock__1> getRlvlCtrlBlock() {
        return rlvlCtrlBlock;
    }

    @JsonProperty("rlvl_ctrl_block")
    public void setRlvlCtrlBlock(List<RlvlCtrlBlock__1> rlvlCtrlBlock) {
        this.rlvlCtrlBlock = rlvlCtrlBlock;
    }

    public CourseRegistrationClassAndLevelRestrictions100PutResponse withRlvlCtrlBlock(List<RlvlCtrlBlock__1> rlvlCtrlBlock) {
        this.rlvlCtrlBlock = rlvlCtrlBlock;
        return this;
    }

    @JsonProperty("scrrlvl")
    public List<Scrrlvl__2> getScrrlvl() {
        return scrrlvl;
    }

    @JsonProperty("scrrlvl")
    public void setScrrlvl(List<Scrrlvl__2> scrrlvl) {
        this.scrrlvl = scrrlvl;
    }

    public CourseRegistrationClassAndLevelRestrictions100PutResponse withScrrlvl(List<Scrrlvl__2> scrrlvl) {
        this.scrrlvl = scrrlvl;
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

    public CourseRegistrationClassAndLevelRestrictions100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationClassAndLevelRestrictions100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rclsCtrlBlock");
        sb.append('=');
        sb.append(((this.rclsCtrlBlock == null)?"<null>":this.rclsCtrlBlock));
        sb.append(',');
        sb.append("scrrcls");
        sb.append('=');
        sb.append(((this.scrrcls == null)?"<null>":this.scrrcls));
        sb.append(',');
        sb.append("rlvlCtrlBlock");
        sb.append('=');
        sb.append(((this.rlvlCtrlBlock == null)?"<null>":this.rlvlCtrlBlock));
        sb.append(',');
        sb.append("scrrlvl");
        sb.append('=');
        sb.append(((this.scrrlvl == null)?"<null>":this.scrrlvl));
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
        result = ((result* 31)+((this.scrrcls == null)? 0 :this.scrrcls.hashCode()));
        result = ((result* 31)+((this.rlvlCtrlBlock == null)? 0 :this.rlvlCtrlBlock.hashCode()));
        result = ((result* 31)+((this.scrrlvl == null)? 0 :this.scrrlvl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rclsCtrlBlock == null)? 0 :this.rclsCtrlBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationClassAndLevelRestrictions100PutResponse) == false) {
            return false;
        }
        CourseRegistrationClassAndLevelRestrictions100PutResponse rhs = ((CourseRegistrationClassAndLevelRestrictions100PutResponse) other);
        return ((((((this.scrrcls == rhs.scrrcls)||((this.scrrcls!= null)&&this.scrrcls.equals(rhs.scrrcls)))&&((this.rlvlCtrlBlock == rhs.rlvlCtrlBlock)||((this.rlvlCtrlBlock!= null)&&this.rlvlCtrlBlock.equals(rhs.rlvlCtrlBlock))))&&((this.scrrlvl == rhs.scrrlvl)||((this.scrrlvl!= null)&&this.scrrlvl.equals(rhs.scrrlvl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rclsCtrlBlock == rhs.rclsCtrlBlock)||((this.rclsCtrlBlock!= null)&&this.rclsCtrlBlock.equals(rhs.rclsCtrlBlock))));
    }

}
