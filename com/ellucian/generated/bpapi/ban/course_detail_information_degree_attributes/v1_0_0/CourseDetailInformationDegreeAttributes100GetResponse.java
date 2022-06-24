
package com.ellucian.generated.bpapi.ban.course_detail_information_degree_attributes.v1_0_0;

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
    "attr_ctrl_block",
    "scrattr"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationDegreeAttributes100GetResponse {

    @JsonProperty("scacrse_key_block")
    private List<ScacrseKeyBlock> scacrseKeyBlock = new ArrayList<ScacrseKeyBlock>();
    @JsonProperty("attr_ctrl_block")
    private List<AttrCtrlBlock> attrCtrlBlock = new ArrayList<AttrCtrlBlock>();
    @JsonProperty("scrattr")
    private List<Scrattr> scrattr = new ArrayList<Scrattr>();
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

    public CourseDetailInformationDegreeAttributes100GetResponse withScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
        return this;
    }

    @JsonProperty("attr_ctrl_block")
    public List<AttrCtrlBlock> getAttrCtrlBlock() {
        return attrCtrlBlock;
    }

    @JsonProperty("attr_ctrl_block")
    public void setAttrCtrlBlock(List<AttrCtrlBlock> attrCtrlBlock) {
        this.attrCtrlBlock = attrCtrlBlock;
    }

    public CourseDetailInformationDegreeAttributes100GetResponse withAttrCtrlBlock(List<AttrCtrlBlock> attrCtrlBlock) {
        this.attrCtrlBlock = attrCtrlBlock;
        return this;
    }

    @JsonProperty("scrattr")
    public List<Scrattr> getScrattr() {
        return scrattr;
    }

    @JsonProperty("scrattr")
    public void setScrattr(List<Scrattr> scrattr) {
        this.scrattr = scrattr;
    }

    public CourseDetailInformationDegreeAttributes100GetResponse withScrattr(List<Scrattr> scrattr) {
        this.scrattr = scrattr;
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

    public CourseDetailInformationDegreeAttributes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationDegreeAttributes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseKeyBlock");
        sb.append('=');
        sb.append(((this.scacrseKeyBlock == null)?"<null>":this.scacrseKeyBlock));
        sb.append(',');
        sb.append("attrCtrlBlock");
        sb.append('=');
        sb.append(((this.attrCtrlBlock == null)?"<null>":this.attrCtrlBlock));
        sb.append(',');
        sb.append("scrattr");
        sb.append('=');
        sb.append(((this.scrattr == null)?"<null>":this.scrattr));
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
        result = ((result* 31)+((this.attrCtrlBlock == null)? 0 :this.attrCtrlBlock.hashCode()));
        result = ((result* 31)+((this.scrattr == null)? 0 :this.scrattr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationDegreeAttributes100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationDegreeAttributes100GetResponse rhs = ((CourseDetailInformationDegreeAttributes100GetResponse) other);
        return (((((this.scacrseKeyBlock == rhs.scacrseKeyBlock)||((this.scacrseKeyBlock!= null)&&this.scacrseKeyBlock.equals(rhs.scacrseKeyBlock)))&&((this.attrCtrlBlock == rhs.attrCtrlBlock)||((this.attrCtrlBlock!= null)&&this.attrCtrlBlock.equals(rhs.attrCtrlBlock))))&&((this.scrattr == rhs.scrattr)||((this.scrattr!= null)&&this.scrattr.equals(rhs.scrattr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
