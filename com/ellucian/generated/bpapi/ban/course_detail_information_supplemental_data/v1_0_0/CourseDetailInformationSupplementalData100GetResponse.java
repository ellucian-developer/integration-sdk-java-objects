
package com.ellucian.generated.bpapi.ban.course_detail_information_supplemental_data.v1_0_0;

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
    "supp_ctrl_block",
    "scbsupp"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationSupplementalData100GetResponse {

    @JsonProperty("scacrse_key_block")
    private List<ScacrseKeyBlock> scacrseKeyBlock = new ArrayList<ScacrseKeyBlock>();
    @JsonProperty("supp_ctrl_block")
    private List<SuppCtrlBlock> suppCtrlBlock = new ArrayList<SuppCtrlBlock>();
    @JsonProperty("scbsupp")
    private List<Scbsupp> scbsupp = new ArrayList<Scbsupp>();
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

    public CourseDetailInformationSupplementalData100GetResponse withScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
        return this;
    }

    @JsonProperty("supp_ctrl_block")
    public List<SuppCtrlBlock> getSuppCtrlBlock() {
        return suppCtrlBlock;
    }

    @JsonProperty("supp_ctrl_block")
    public void setSuppCtrlBlock(List<SuppCtrlBlock> suppCtrlBlock) {
        this.suppCtrlBlock = suppCtrlBlock;
    }

    public CourseDetailInformationSupplementalData100GetResponse withSuppCtrlBlock(List<SuppCtrlBlock> suppCtrlBlock) {
        this.suppCtrlBlock = suppCtrlBlock;
        return this;
    }

    @JsonProperty("scbsupp")
    public List<Scbsupp> getScbsupp() {
        return scbsupp;
    }

    @JsonProperty("scbsupp")
    public void setScbsupp(List<Scbsupp> scbsupp) {
        this.scbsupp = scbsupp;
    }

    public CourseDetailInformationSupplementalData100GetResponse withScbsupp(List<Scbsupp> scbsupp) {
        this.scbsupp = scbsupp;
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

    public CourseDetailInformationSupplementalData100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationSupplementalData100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseKeyBlock");
        sb.append('=');
        sb.append(((this.scacrseKeyBlock == null)?"<null>":this.scacrseKeyBlock));
        sb.append(',');
        sb.append("suppCtrlBlock");
        sb.append('=');
        sb.append(((this.suppCtrlBlock == null)?"<null>":this.suppCtrlBlock));
        sb.append(',');
        sb.append("scbsupp");
        sb.append('=');
        sb.append(((this.scbsupp == null)?"<null>":this.scbsupp));
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
        result = ((result* 31)+((this.scbsupp == null)? 0 :this.scbsupp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.suppCtrlBlock == null)? 0 :this.suppCtrlBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationSupplementalData100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationSupplementalData100GetResponse rhs = ((CourseDetailInformationSupplementalData100GetResponse) other);
        return (((((this.scacrseKeyBlock == rhs.scacrseKeyBlock)||((this.scacrseKeyBlock!= null)&&this.scacrseKeyBlock.equals(rhs.scacrseKeyBlock)))&&((this.scbsupp == rhs.scbsupp)||((this.scbsupp!= null)&&this.scbsupp.equals(rhs.scbsupp))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.suppCtrlBlock == rhs.suppCtrlBlock)||((this.suppCtrlBlock!= null)&&this.suppCtrlBlock.equals(rhs.suppCtrlBlock))));
    }

}
