
package com.ellucian.generated.bpapi.ban.course_detail_information_course_description.v1_0_0;

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
    "desc_ctrl_block",
    "scbdesc"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationCourseDescription100GetResponse {

    @JsonProperty("scacrse_key_block")
    private List<ScacrseKeyBlock> scacrseKeyBlock = new ArrayList<ScacrseKeyBlock>();
    @JsonProperty("desc_ctrl_block")
    private List<DescCtrlBlock> descCtrlBlock = new ArrayList<DescCtrlBlock>();
    @JsonProperty("scbdesc")
    private List<Scbdesc> scbdesc = new ArrayList<Scbdesc>();
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

    public CourseDetailInformationCourseDescription100GetResponse withScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
        return this;
    }

    @JsonProperty("desc_ctrl_block")
    public List<DescCtrlBlock> getDescCtrlBlock() {
        return descCtrlBlock;
    }

    @JsonProperty("desc_ctrl_block")
    public void setDescCtrlBlock(List<DescCtrlBlock> descCtrlBlock) {
        this.descCtrlBlock = descCtrlBlock;
    }

    public CourseDetailInformationCourseDescription100GetResponse withDescCtrlBlock(List<DescCtrlBlock> descCtrlBlock) {
        this.descCtrlBlock = descCtrlBlock;
        return this;
    }

    @JsonProperty("scbdesc")
    public List<Scbdesc> getScbdesc() {
        return scbdesc;
    }

    @JsonProperty("scbdesc")
    public void setScbdesc(List<Scbdesc> scbdesc) {
        this.scbdesc = scbdesc;
    }

    public CourseDetailInformationCourseDescription100GetResponse withScbdesc(List<Scbdesc> scbdesc) {
        this.scbdesc = scbdesc;
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

    public CourseDetailInformationCourseDescription100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationCourseDescription100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseKeyBlock");
        sb.append('=');
        sb.append(((this.scacrseKeyBlock == null)?"<null>":this.scacrseKeyBlock));
        sb.append(',');
        sb.append("descCtrlBlock");
        sb.append('=');
        sb.append(((this.descCtrlBlock == null)?"<null>":this.descCtrlBlock));
        sb.append(',');
        sb.append("scbdesc");
        sb.append('=');
        sb.append(((this.scbdesc == null)?"<null>":this.scbdesc));
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
        result = ((result* 31)+((this.scbdesc == null)? 0 :this.scbdesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.descCtrlBlock == null)? 0 :this.descCtrlBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationCourseDescription100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationCourseDescription100GetResponse rhs = ((CourseDetailInformationCourseDescription100GetResponse) other);
        return (((((this.scacrseKeyBlock == rhs.scacrseKeyBlock)||((this.scacrseKeyBlock!= null)&&this.scacrseKeyBlock.equals(rhs.scacrseKeyBlock)))&&((this.scbdesc == rhs.scbdesc)||((this.scbdesc!= null)&&this.scbdesc.equals(rhs.scbdesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.descCtrlBlock == rhs.descCtrlBlock)||((this.descCtrlBlock!= null)&&this.descCtrlBlock.equals(rhs.descCtrlBlock))));
    }

}
