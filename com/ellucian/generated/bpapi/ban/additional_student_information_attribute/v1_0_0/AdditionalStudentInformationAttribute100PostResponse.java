
package com.ellucian.generated.bpapi.ban.additional_student_information_attribute.v1_0_0;

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
    "sgastdn_key_block",
    "attr_ctrl_block",
    "sgrsatt"
})
@Generated("jsonschema2pojo")
public class AdditionalStudentInformationAttribute100PostResponse {

    @JsonProperty("sgastdn_key_block")
    private List<SgastdnKeyBlock__1> sgastdnKeyBlock = new ArrayList<SgastdnKeyBlock__1>();
    @JsonProperty("attr_ctrl_block")
    private List<AttrCtrlBlock__1> attrCtrlBlock = new ArrayList<AttrCtrlBlock__1>();
    @JsonProperty("sgrsatt")
    private List<Sgrsatt__1> sgrsatt = new ArrayList<Sgrsatt__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgastdn_key_block")
    public List<SgastdnKeyBlock__1> getSgastdnKeyBlock() {
        return sgastdnKeyBlock;
    }

    @JsonProperty("sgastdn_key_block")
    public void setSgastdnKeyBlock(List<SgastdnKeyBlock__1> sgastdnKeyBlock) {
        this.sgastdnKeyBlock = sgastdnKeyBlock;
    }

    public AdditionalStudentInformationAttribute100PostResponse withSgastdnKeyBlock(List<SgastdnKeyBlock__1> sgastdnKeyBlock) {
        this.sgastdnKeyBlock = sgastdnKeyBlock;
        return this;
    }

    @JsonProperty("attr_ctrl_block")
    public List<AttrCtrlBlock__1> getAttrCtrlBlock() {
        return attrCtrlBlock;
    }

    @JsonProperty("attr_ctrl_block")
    public void setAttrCtrlBlock(List<AttrCtrlBlock__1> attrCtrlBlock) {
        this.attrCtrlBlock = attrCtrlBlock;
    }

    public AdditionalStudentInformationAttribute100PostResponse withAttrCtrlBlock(List<AttrCtrlBlock__1> attrCtrlBlock) {
        this.attrCtrlBlock = attrCtrlBlock;
        return this;
    }

    @JsonProperty("sgrsatt")
    public List<Sgrsatt__1> getSgrsatt() {
        return sgrsatt;
    }

    @JsonProperty("sgrsatt")
    public void setSgrsatt(List<Sgrsatt__1> sgrsatt) {
        this.sgrsatt = sgrsatt;
    }

    public AdditionalStudentInformationAttribute100PostResponse withSgrsatt(List<Sgrsatt__1> sgrsatt) {
        this.sgrsatt = sgrsatt;
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

    public AdditionalStudentInformationAttribute100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalStudentInformationAttribute100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgastdnKeyBlock");
        sb.append('=');
        sb.append(((this.sgastdnKeyBlock == null)?"<null>":this.sgastdnKeyBlock));
        sb.append(',');
        sb.append("attrCtrlBlock");
        sb.append('=');
        sb.append(((this.attrCtrlBlock == null)?"<null>":this.attrCtrlBlock));
        sb.append(',');
        sb.append("sgrsatt");
        sb.append('=');
        sb.append(((this.sgrsatt == null)?"<null>":this.sgrsatt));
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
        result = ((result* 31)+((this.attrCtrlBlock == null)? 0 :this.attrCtrlBlock.hashCode()));
        result = ((result* 31)+((this.sgastdnKeyBlock == null)? 0 :this.sgastdnKeyBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sgrsatt == null)? 0 :this.sgrsatt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalStudentInformationAttribute100PostResponse) == false) {
            return false;
        }
        AdditionalStudentInformationAttribute100PostResponse rhs = ((AdditionalStudentInformationAttribute100PostResponse) other);
        return (((((this.attrCtrlBlock == rhs.attrCtrlBlock)||((this.attrCtrlBlock!= null)&&this.attrCtrlBlock.equals(rhs.attrCtrlBlock)))&&((this.sgastdnKeyBlock == rhs.sgastdnKeyBlock)||((this.sgastdnKeyBlock!= null)&&this.sgastdnKeyBlock.equals(rhs.sgastdnKeyBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sgrsatt == rhs.sgrsatt)||((this.sgrsatt!= null)&&this.sgrsatt.equals(rhs.sgrsatt))));
    }

}
