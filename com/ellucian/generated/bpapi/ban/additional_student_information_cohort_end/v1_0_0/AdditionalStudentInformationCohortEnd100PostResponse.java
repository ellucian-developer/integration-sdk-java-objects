
package com.ellucian.generated.bpapi.ban.additional_student_information_cohort_end.v1_0_0;

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
    "sgrchrt",
    "chrt_ctrl_block",
    "sgastdn_key_block"
})
@Generated("jsonschema2pojo")
public class AdditionalStudentInformationCohortEnd100PostResponse {

    @JsonProperty("sgrchrt")
    private List<Sgrchrt> sgrchrt = new ArrayList<Sgrchrt>();
    @JsonProperty("chrt_ctrl_block")
    private List<ChrtCtrlBlock> chrtCtrlBlock = new ArrayList<ChrtCtrlBlock>();
    @JsonProperty("sgastdn_key_block")
    private List<SgastdnKeyBlock> sgastdnKeyBlock = new ArrayList<SgastdnKeyBlock>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgrchrt")
    public List<Sgrchrt> getSgrchrt() {
        return sgrchrt;
    }

    @JsonProperty("sgrchrt")
    public void setSgrchrt(List<Sgrchrt> sgrchrt) {
        this.sgrchrt = sgrchrt;
    }

    public AdditionalStudentInformationCohortEnd100PostResponse withSgrchrt(List<Sgrchrt> sgrchrt) {
        this.sgrchrt = sgrchrt;
        return this;
    }

    @JsonProperty("chrt_ctrl_block")
    public List<ChrtCtrlBlock> getChrtCtrlBlock() {
        return chrtCtrlBlock;
    }

    @JsonProperty("chrt_ctrl_block")
    public void setChrtCtrlBlock(List<ChrtCtrlBlock> chrtCtrlBlock) {
        this.chrtCtrlBlock = chrtCtrlBlock;
    }

    public AdditionalStudentInformationCohortEnd100PostResponse withChrtCtrlBlock(List<ChrtCtrlBlock> chrtCtrlBlock) {
        this.chrtCtrlBlock = chrtCtrlBlock;
        return this;
    }

    @JsonProperty("sgastdn_key_block")
    public List<SgastdnKeyBlock> getSgastdnKeyBlock() {
        return sgastdnKeyBlock;
    }

    @JsonProperty("sgastdn_key_block")
    public void setSgastdnKeyBlock(List<SgastdnKeyBlock> sgastdnKeyBlock) {
        this.sgastdnKeyBlock = sgastdnKeyBlock;
    }

    public AdditionalStudentInformationCohortEnd100PostResponse withSgastdnKeyBlock(List<SgastdnKeyBlock> sgastdnKeyBlock) {
        this.sgastdnKeyBlock = sgastdnKeyBlock;
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

    public AdditionalStudentInformationCohortEnd100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalStudentInformationCohortEnd100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgrchrt");
        sb.append('=');
        sb.append(((this.sgrchrt == null)?"<null>":this.sgrchrt));
        sb.append(',');
        sb.append("chrtCtrlBlock");
        sb.append('=');
        sb.append(((this.chrtCtrlBlock == null)?"<null>":this.chrtCtrlBlock));
        sb.append(',');
        sb.append("sgastdnKeyBlock");
        sb.append('=');
        sb.append(((this.sgastdnKeyBlock == null)?"<null>":this.sgastdnKeyBlock));
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
        result = ((result* 31)+((this.sgrchrt == null)? 0 :this.sgrchrt.hashCode()));
        result = ((result* 31)+((this.sgastdnKeyBlock == null)? 0 :this.sgastdnKeyBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.chrtCtrlBlock == null)? 0 :this.chrtCtrlBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalStudentInformationCohortEnd100PostResponse) == false) {
            return false;
        }
        AdditionalStudentInformationCohortEnd100PostResponse rhs = ((AdditionalStudentInformationCohortEnd100PostResponse) other);
        return (((((this.sgrchrt == rhs.sgrchrt)||((this.sgrchrt!= null)&&this.sgrchrt.equals(rhs.sgrchrt)))&&((this.sgastdnKeyBlock == rhs.sgastdnKeyBlock)||((this.sgastdnKeyBlock!= null)&&this.sgastdnKeyBlock.equals(rhs.sgastdnKeyBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.chrtCtrlBlock == rhs.chrtCtrlBlock)||((this.chrtCtrlBlock!= null)&&this.chrtCtrlBlock.equals(rhs.chrtCtrlBlock))));
    }

}
