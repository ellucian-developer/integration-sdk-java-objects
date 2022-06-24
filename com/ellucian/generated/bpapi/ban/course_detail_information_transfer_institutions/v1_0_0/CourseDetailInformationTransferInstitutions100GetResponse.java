
package com.ellucian.generated.bpapi.ban.course_detail_information_transfer_institutions.v1_0_0;

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
    "sbgi_ctrl_block",
    "scrsbgi"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationTransferInstitutions100GetResponse {

    @JsonProperty("scacrse_key_block")
    private List<ScacrseKeyBlock> scacrseKeyBlock = new ArrayList<ScacrseKeyBlock>();
    @JsonProperty("sbgi_ctrl_block")
    private List<SbgiCtrlBlock> sbgiCtrlBlock = new ArrayList<SbgiCtrlBlock>();
    @JsonProperty("scrsbgi")
    private List<Scrsbgi> scrsbgi = new ArrayList<Scrsbgi>();
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

    public CourseDetailInformationTransferInstitutions100GetResponse withScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
        return this;
    }

    @JsonProperty("sbgi_ctrl_block")
    public List<SbgiCtrlBlock> getSbgiCtrlBlock() {
        return sbgiCtrlBlock;
    }

    @JsonProperty("sbgi_ctrl_block")
    public void setSbgiCtrlBlock(List<SbgiCtrlBlock> sbgiCtrlBlock) {
        this.sbgiCtrlBlock = sbgiCtrlBlock;
    }

    public CourseDetailInformationTransferInstitutions100GetResponse withSbgiCtrlBlock(List<SbgiCtrlBlock> sbgiCtrlBlock) {
        this.sbgiCtrlBlock = sbgiCtrlBlock;
        return this;
    }

    @JsonProperty("scrsbgi")
    public List<Scrsbgi> getScrsbgi() {
        return scrsbgi;
    }

    @JsonProperty("scrsbgi")
    public void setScrsbgi(List<Scrsbgi> scrsbgi) {
        this.scrsbgi = scrsbgi;
    }

    public CourseDetailInformationTransferInstitutions100GetResponse withScrsbgi(List<Scrsbgi> scrsbgi) {
        this.scrsbgi = scrsbgi;
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

    public CourseDetailInformationTransferInstitutions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationTransferInstitutions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseKeyBlock");
        sb.append('=');
        sb.append(((this.scacrseKeyBlock == null)?"<null>":this.scacrseKeyBlock));
        sb.append(',');
        sb.append("sbgiCtrlBlock");
        sb.append('=');
        sb.append(((this.sbgiCtrlBlock == null)?"<null>":this.sbgiCtrlBlock));
        sb.append(',');
        sb.append("scrsbgi");
        sb.append('=');
        sb.append(((this.scrsbgi == null)?"<null>":this.scrsbgi));
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
        result = ((result* 31)+((this.sbgiCtrlBlock == null)? 0 :this.sbgiCtrlBlock.hashCode()));
        result = ((result* 31)+((this.scrsbgi == null)? 0 :this.scrsbgi.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationTransferInstitutions100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationTransferInstitutions100GetResponse rhs = ((CourseDetailInformationTransferInstitutions100GetResponse) other);
        return (((((this.scacrseKeyBlock == rhs.scacrseKeyBlock)||((this.scacrseKeyBlock!= null)&&this.scacrseKeyBlock.equals(rhs.scacrseKeyBlock)))&&((this.sbgiCtrlBlock == rhs.sbgiCtrlBlock)||((this.sbgiCtrlBlock!= null)&&this.sbgiCtrlBlock.equals(rhs.sbgiCtrlBlock))))&&((this.scrsbgi == rhs.scrsbgi)||((this.scrsbgi!= null)&&this.scrsbgi.equals(rhs.scrsbgi))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
