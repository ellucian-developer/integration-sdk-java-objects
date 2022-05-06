
package com.ellucian.generated.bpapi.ban.section_restriction_department_and_field_of_study.v1_0_0;

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
    "rmaj_ctrl_block",
    "ssrrdep",
    "ssrrmaj"
})
@Generated("jsonschema2pojo")
public class SectionRestrictionDepartmentAndFieldOfStudy100PostResponse {

    @JsonProperty("rmaj_ctrl_block")
    private List<RmajCtrlBlock__1> rmajCtrlBlock = new ArrayList<RmajCtrlBlock__1>();
    @JsonProperty("ssrrdep")
    private List<Ssrrdep__1> ssrrdep = new ArrayList<Ssrrdep__1>();
    @JsonProperty("ssrrmaj")
    private List<Ssrrmaj__1> ssrrmaj = new ArrayList<Ssrrmaj__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rmaj_ctrl_block")
    public List<RmajCtrlBlock__1> getRmajCtrlBlock() {
        return rmajCtrlBlock;
    }

    @JsonProperty("rmaj_ctrl_block")
    public void setRmajCtrlBlock(List<RmajCtrlBlock__1> rmajCtrlBlock) {
        this.rmajCtrlBlock = rmajCtrlBlock;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostResponse withRmajCtrlBlock(List<RmajCtrlBlock__1> rmajCtrlBlock) {
        this.rmajCtrlBlock = rmajCtrlBlock;
        return this;
    }

    @JsonProperty("ssrrdep")
    public List<Ssrrdep__1> getSsrrdep() {
        return ssrrdep;
    }

    @JsonProperty("ssrrdep")
    public void setSsrrdep(List<Ssrrdep__1> ssrrdep) {
        this.ssrrdep = ssrrdep;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostResponse withSsrrdep(List<Ssrrdep__1> ssrrdep) {
        this.ssrrdep = ssrrdep;
        return this;
    }

    @JsonProperty("ssrrmaj")
    public List<Ssrrmaj__1> getSsrrmaj() {
        return ssrrmaj;
    }

    @JsonProperty("ssrrmaj")
    public void setSsrrmaj(List<Ssrrmaj__1> ssrrmaj) {
        this.ssrrmaj = ssrrmaj;
    }

    public SectionRestrictionDepartmentAndFieldOfStudy100PostResponse withSsrrmaj(List<Ssrrmaj__1> ssrrmaj) {
        this.ssrrmaj = ssrrmaj;
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

    public SectionRestrictionDepartmentAndFieldOfStudy100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRestrictionDepartmentAndFieldOfStudy100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rmajCtrlBlock");
        sb.append('=');
        sb.append(((this.rmajCtrlBlock == null)?"<null>":this.rmajCtrlBlock));
        sb.append(',');
        sb.append("ssrrdep");
        sb.append('=');
        sb.append(((this.ssrrdep == null)?"<null>":this.ssrrdep));
        sb.append(',');
        sb.append("ssrrmaj");
        sb.append('=');
        sb.append(((this.ssrrmaj == null)?"<null>":this.ssrrmaj));
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
        result = ((result* 31)+((this.rmajCtrlBlock == null)? 0 :this.rmajCtrlBlock.hashCode()));
        result = ((result* 31)+((this.ssrrdep == null)? 0 :this.ssrrdep.hashCode()));
        result = ((result* 31)+((this.ssrrmaj == null)? 0 :this.ssrrmaj.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRestrictionDepartmentAndFieldOfStudy100PostResponse) == false) {
            return false;
        }
        SectionRestrictionDepartmentAndFieldOfStudy100PostResponse rhs = ((SectionRestrictionDepartmentAndFieldOfStudy100PostResponse) other);
        return (((((this.rmajCtrlBlock == rhs.rmajCtrlBlock)||((this.rmajCtrlBlock!= null)&&this.rmajCtrlBlock.equals(rhs.rmajCtrlBlock)))&&((this.ssrrdep == rhs.ssrrdep)||((this.ssrrdep!= null)&&this.ssrrdep.equals(rhs.ssrrdep))))&&((this.ssrrmaj == rhs.ssrrmaj)||((this.ssrrmaj!= null)&&this.ssrrmaj.equals(rhs.ssrrmaj))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
