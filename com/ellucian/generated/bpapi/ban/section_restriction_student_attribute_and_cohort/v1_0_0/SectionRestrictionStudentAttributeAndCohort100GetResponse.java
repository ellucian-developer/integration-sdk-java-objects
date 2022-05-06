
package com.ellucian.generated.bpapi.ban.section_restriction_student_attribute_and_cohort.v1_0_0;

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
    "ssrrchr",
    "ratt_ctrl_block",
    "ssrratt",
    "rchr_ctrl_block"
})
@Generated("jsonschema2pojo")
public class SectionRestrictionStudentAttributeAndCohort100GetResponse {

    @JsonProperty("ssrrchr")
    private List<Ssrrchr> ssrrchr = new ArrayList<Ssrrchr>();
    @JsonProperty("ratt_ctrl_block")
    private List<RattCtrlBlock> rattCtrlBlock = new ArrayList<RattCtrlBlock>();
    @JsonProperty("ssrratt")
    private List<Ssrratt> ssrratt = new ArrayList<Ssrratt>();
    @JsonProperty("rchr_ctrl_block")
    private List<RchrCtrlBlock> rchrCtrlBlock = new ArrayList<RchrCtrlBlock>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssrrchr")
    public List<Ssrrchr> getSsrrchr() {
        return ssrrchr;
    }

    @JsonProperty("ssrrchr")
    public void setSsrrchr(List<Ssrrchr> ssrrchr) {
        this.ssrrchr = ssrrchr;
    }

    public SectionRestrictionStudentAttributeAndCohort100GetResponse withSsrrchr(List<Ssrrchr> ssrrchr) {
        this.ssrrchr = ssrrchr;
        return this;
    }

    @JsonProperty("ratt_ctrl_block")
    public List<RattCtrlBlock> getRattCtrlBlock() {
        return rattCtrlBlock;
    }

    @JsonProperty("ratt_ctrl_block")
    public void setRattCtrlBlock(List<RattCtrlBlock> rattCtrlBlock) {
        this.rattCtrlBlock = rattCtrlBlock;
    }

    public SectionRestrictionStudentAttributeAndCohort100GetResponse withRattCtrlBlock(List<RattCtrlBlock> rattCtrlBlock) {
        this.rattCtrlBlock = rattCtrlBlock;
        return this;
    }

    @JsonProperty("ssrratt")
    public List<Ssrratt> getSsrratt() {
        return ssrratt;
    }

    @JsonProperty("ssrratt")
    public void setSsrratt(List<Ssrratt> ssrratt) {
        this.ssrratt = ssrratt;
    }

    public SectionRestrictionStudentAttributeAndCohort100GetResponse withSsrratt(List<Ssrratt> ssrratt) {
        this.ssrratt = ssrratt;
        return this;
    }

    @JsonProperty("rchr_ctrl_block")
    public List<RchrCtrlBlock> getRchrCtrlBlock() {
        return rchrCtrlBlock;
    }

    @JsonProperty("rchr_ctrl_block")
    public void setRchrCtrlBlock(List<RchrCtrlBlock> rchrCtrlBlock) {
        this.rchrCtrlBlock = rchrCtrlBlock;
    }

    public SectionRestrictionStudentAttributeAndCohort100GetResponse withRchrCtrlBlock(List<RchrCtrlBlock> rchrCtrlBlock) {
        this.rchrCtrlBlock = rchrCtrlBlock;
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

    public SectionRestrictionStudentAttributeAndCohort100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRestrictionStudentAttributeAndCohort100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssrrchr");
        sb.append('=');
        sb.append(((this.ssrrchr == null)?"<null>":this.ssrrchr));
        sb.append(',');
        sb.append("rattCtrlBlock");
        sb.append('=');
        sb.append(((this.rattCtrlBlock == null)?"<null>":this.rattCtrlBlock));
        sb.append(',');
        sb.append("ssrratt");
        sb.append('=');
        sb.append(((this.ssrratt == null)?"<null>":this.ssrratt));
        sb.append(',');
        sb.append("rchrCtrlBlock");
        sb.append('=');
        sb.append(((this.rchrCtrlBlock == null)?"<null>":this.rchrCtrlBlock));
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
        result = ((result* 31)+((this.ssrrchr == null)? 0 :this.ssrrchr.hashCode()));
        result = ((result* 31)+((this.rattCtrlBlock == null)? 0 :this.rattCtrlBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssrratt == null)? 0 :this.ssrratt.hashCode()));
        result = ((result* 31)+((this.rchrCtrlBlock == null)? 0 :this.rchrCtrlBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRestrictionStudentAttributeAndCohort100GetResponse) == false) {
            return false;
        }
        SectionRestrictionStudentAttributeAndCohort100GetResponse rhs = ((SectionRestrictionStudentAttributeAndCohort100GetResponse) other);
        return ((((((this.ssrrchr == rhs.ssrrchr)||((this.ssrrchr!= null)&&this.ssrrchr.equals(rhs.ssrrchr)))&&((this.rattCtrlBlock == rhs.rattCtrlBlock)||((this.rattCtrlBlock!= null)&&this.rattCtrlBlock.equals(rhs.rattCtrlBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssrratt == rhs.ssrratt)||((this.ssrratt!= null)&&this.ssrratt.equals(rhs.ssrratt))))&&((this.rchrCtrlBlock == rhs.rchrCtrlBlock)||((this.rchrCtrlBlock!= null)&&this.rchrCtrlBlock.equals(rhs.rchrCtrlBlock))));
    }

}
