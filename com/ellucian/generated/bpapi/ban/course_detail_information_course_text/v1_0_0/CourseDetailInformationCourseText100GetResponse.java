
package com.ellucian.generated.bpapi.ban.course_detail_information_course_text.v1_0_0;

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
    "text_ctrl_block",
    "scrtext"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationCourseText100GetResponse {

    @JsonProperty("scacrse_key_block")
    private List<ScacrseKeyBlock> scacrseKeyBlock = new ArrayList<ScacrseKeyBlock>();
    @JsonProperty("text_ctrl_block")
    private List<TextCtrlBlock> textCtrlBlock = new ArrayList<TextCtrlBlock>();
    @JsonProperty("scrtext")
    private List<Scrtext> scrtext = new ArrayList<Scrtext>();
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

    public CourseDetailInformationCourseText100GetResponse withScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
        return this;
    }

    @JsonProperty("text_ctrl_block")
    public List<TextCtrlBlock> getTextCtrlBlock() {
        return textCtrlBlock;
    }

    @JsonProperty("text_ctrl_block")
    public void setTextCtrlBlock(List<TextCtrlBlock> textCtrlBlock) {
        this.textCtrlBlock = textCtrlBlock;
    }

    public CourseDetailInformationCourseText100GetResponse withTextCtrlBlock(List<TextCtrlBlock> textCtrlBlock) {
        this.textCtrlBlock = textCtrlBlock;
        return this;
    }

    @JsonProperty("scrtext")
    public List<Scrtext> getScrtext() {
        return scrtext;
    }

    @JsonProperty("scrtext")
    public void setScrtext(List<Scrtext> scrtext) {
        this.scrtext = scrtext;
    }

    public CourseDetailInformationCourseText100GetResponse withScrtext(List<Scrtext> scrtext) {
        this.scrtext = scrtext;
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

    public CourseDetailInformationCourseText100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationCourseText100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseKeyBlock");
        sb.append('=');
        sb.append(((this.scacrseKeyBlock == null)?"<null>":this.scacrseKeyBlock));
        sb.append(',');
        sb.append("textCtrlBlock");
        sb.append('=');
        sb.append(((this.textCtrlBlock == null)?"<null>":this.textCtrlBlock));
        sb.append(',');
        sb.append("scrtext");
        sb.append('=');
        sb.append(((this.scrtext == null)?"<null>":this.scrtext));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.textCtrlBlock == null)? 0 :this.textCtrlBlock.hashCode()));
        result = ((result* 31)+((this.scrtext == null)? 0 :this.scrtext.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationCourseText100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationCourseText100GetResponse rhs = ((CourseDetailInformationCourseText100GetResponse) other);
        return (((((this.scacrseKeyBlock == rhs.scacrseKeyBlock)||((this.scacrseKeyBlock!= null)&&this.scacrseKeyBlock.equals(rhs.scacrseKeyBlock)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.textCtrlBlock == rhs.textCtrlBlock)||((this.textCtrlBlock!= null)&&this.textCtrlBlock.equals(rhs.textCtrlBlock))))&&((this.scrtext == rhs.scrtext)||((this.scrtext!= null)&&this.scrtext.equals(rhs.scrtext))));
    }

}
