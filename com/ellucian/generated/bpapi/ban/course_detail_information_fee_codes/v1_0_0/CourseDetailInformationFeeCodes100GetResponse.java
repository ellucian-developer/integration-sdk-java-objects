
package com.ellucian.generated.bpapi.ban.course_detail_information_fee_codes.v1_0_0;

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
    "fee_ctrl_block",
    "scrfees"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationFeeCodes100GetResponse {

    @JsonProperty("scacrse_key_block")
    private List<ScacrseKeyBlock> scacrseKeyBlock = new ArrayList<ScacrseKeyBlock>();
    @JsonProperty("fee_ctrl_block")
    private List<FeeCtrlBlock> feeCtrlBlock = new ArrayList<FeeCtrlBlock>();
    @JsonProperty("scrfees")
    private List<Scrfee> scrfees = new ArrayList<Scrfee>();
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

    public CourseDetailInformationFeeCodes100GetResponse withScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
        return this;
    }

    @JsonProperty("fee_ctrl_block")
    public List<FeeCtrlBlock> getFeeCtrlBlock() {
        return feeCtrlBlock;
    }

    @JsonProperty("fee_ctrl_block")
    public void setFeeCtrlBlock(List<FeeCtrlBlock> feeCtrlBlock) {
        this.feeCtrlBlock = feeCtrlBlock;
    }

    public CourseDetailInformationFeeCodes100GetResponse withFeeCtrlBlock(List<FeeCtrlBlock> feeCtrlBlock) {
        this.feeCtrlBlock = feeCtrlBlock;
        return this;
    }

    @JsonProperty("scrfees")
    public List<Scrfee> getScrfees() {
        return scrfees;
    }

    @JsonProperty("scrfees")
    public void setScrfees(List<Scrfee> scrfees) {
        this.scrfees = scrfees;
    }

    public CourseDetailInformationFeeCodes100GetResponse withScrfees(List<Scrfee> scrfees) {
        this.scrfees = scrfees;
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

    public CourseDetailInformationFeeCodes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationFeeCodes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseKeyBlock");
        sb.append('=');
        sb.append(((this.scacrseKeyBlock == null)?"<null>":this.scacrseKeyBlock));
        sb.append(',');
        sb.append("feeCtrlBlock");
        sb.append('=');
        sb.append(((this.feeCtrlBlock == null)?"<null>":this.feeCtrlBlock));
        sb.append(',');
        sb.append("scrfees");
        sb.append('=');
        sb.append(((this.scrfees == null)?"<null>":this.scrfees));
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
        result = ((result* 31)+((this.feeCtrlBlock == null)? 0 :this.feeCtrlBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrfees == null)? 0 :this.scrfees.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationFeeCodes100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationFeeCodes100GetResponse rhs = ((CourseDetailInformationFeeCodes100GetResponse) other);
        return (((((this.scacrseKeyBlock == rhs.scacrseKeyBlock)||((this.scacrseKeyBlock!= null)&&this.scacrseKeyBlock.equals(rhs.scacrseKeyBlock)))&&((this.feeCtrlBlock == rhs.feeCtrlBlock)||((this.feeCtrlBlock!= null)&&this.feeCtrlBlock.equals(rhs.feeCtrlBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrfees == rhs.scrfees)||((this.scrfees!= null)&&this.scrfees.equals(rhs.scrfees))));
    }

}
