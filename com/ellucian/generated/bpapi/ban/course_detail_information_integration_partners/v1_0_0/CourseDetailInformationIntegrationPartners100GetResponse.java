
package com.ellucian.generated.bpapi.ban.course_detail_information_integration_partners.v1_0_0;

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
    "intg_ctlr_block",
    "scrintg"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationIntegrationPartners100GetResponse {

    @JsonProperty("scacrse_key_block")
    private List<ScacrseKeyBlock> scacrseKeyBlock = new ArrayList<ScacrseKeyBlock>();
    @JsonProperty("intg_ctlr_block")
    private List<IntgCtlrBlock> intgCtlrBlock = new ArrayList<IntgCtlrBlock>();
    @JsonProperty("scrintg")
    private List<Scrintg> scrintg = new ArrayList<Scrintg>();
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

    public CourseDetailInformationIntegrationPartners100GetResponse withScacrseKeyBlock(List<ScacrseKeyBlock> scacrseKeyBlock) {
        this.scacrseKeyBlock = scacrseKeyBlock;
        return this;
    }

    @JsonProperty("intg_ctlr_block")
    public List<IntgCtlrBlock> getIntgCtlrBlock() {
        return intgCtlrBlock;
    }

    @JsonProperty("intg_ctlr_block")
    public void setIntgCtlrBlock(List<IntgCtlrBlock> intgCtlrBlock) {
        this.intgCtlrBlock = intgCtlrBlock;
    }

    public CourseDetailInformationIntegrationPartners100GetResponse withIntgCtlrBlock(List<IntgCtlrBlock> intgCtlrBlock) {
        this.intgCtlrBlock = intgCtlrBlock;
        return this;
    }

    @JsonProperty("scrintg")
    public List<Scrintg> getScrintg() {
        return scrintg;
    }

    @JsonProperty("scrintg")
    public void setScrintg(List<Scrintg> scrintg) {
        this.scrintg = scrintg;
    }

    public CourseDetailInformationIntegrationPartners100GetResponse withScrintg(List<Scrintg> scrintg) {
        this.scrintg = scrintg;
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

    public CourseDetailInformationIntegrationPartners100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationIntegrationPartners100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseKeyBlock");
        sb.append('=');
        sb.append(((this.scacrseKeyBlock == null)?"<null>":this.scacrseKeyBlock));
        sb.append(',');
        sb.append("intgCtlrBlock");
        sb.append('=');
        sb.append(((this.intgCtlrBlock == null)?"<null>":this.intgCtlrBlock));
        sb.append(',');
        sb.append("scrintg");
        sb.append('=');
        sb.append(((this.scrintg == null)?"<null>":this.scrintg));
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
        result = ((result* 31)+((this.intgCtlrBlock == null)? 0 :this.intgCtlrBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrintg == null)? 0 :this.scrintg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationIntegrationPartners100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationIntegrationPartners100GetResponse rhs = ((CourseDetailInformationIntegrationPartners100GetResponse) other);
        return (((((this.scacrseKeyBlock == rhs.scacrseKeyBlock)||((this.scacrseKeyBlock!= null)&&this.scacrseKeyBlock.equals(rhs.scacrseKeyBlock)))&&((this.intgCtlrBlock == rhs.intgCtlrBlock)||((this.intgCtlrBlock!= null)&&this.intgCtlrBlock.equals(rhs.intgCtlrBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrintg == rhs.scrintg)||((this.scrintg!= null)&&this.scrintg.equals(rhs.scrintg))));
    }

}
