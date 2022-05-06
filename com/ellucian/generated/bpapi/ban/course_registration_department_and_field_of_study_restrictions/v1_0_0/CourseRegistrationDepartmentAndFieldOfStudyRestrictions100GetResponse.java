
package com.ellucian.generated.bpapi.ban.course_registration_department_and_field_of_study_restrictions.v1_0_0;

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
    "rdep_ctrl_block",
    "scrrdep",
    "rmaj_ctrl_block",
    "scrrmaj"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse {

    @JsonProperty("rdep_ctrl_block")
    private List<RdepCtrlBlock> rdepCtrlBlock = new ArrayList<RdepCtrlBlock>();
    @JsonProperty("scrrdep")
    private List<Scrrdep> scrrdep = new ArrayList<Scrrdep>();
    @JsonProperty("rmaj_ctrl_block")
    private List<RmajCtrlBlock> rmajCtrlBlock = new ArrayList<RmajCtrlBlock>();
    @JsonProperty("scrrmaj")
    private List<Scrrmaj> scrrmaj = new ArrayList<Scrrmaj>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rdep_ctrl_block")
    public List<RdepCtrlBlock> getRdepCtrlBlock() {
        return rdepCtrlBlock;
    }

    @JsonProperty("rdep_ctrl_block")
    public void setRdepCtrlBlock(List<RdepCtrlBlock> rdepCtrlBlock) {
        this.rdepCtrlBlock = rdepCtrlBlock;
    }

    public CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse withRdepCtrlBlock(List<RdepCtrlBlock> rdepCtrlBlock) {
        this.rdepCtrlBlock = rdepCtrlBlock;
        return this;
    }

    @JsonProperty("scrrdep")
    public List<Scrrdep> getScrrdep() {
        return scrrdep;
    }

    @JsonProperty("scrrdep")
    public void setScrrdep(List<Scrrdep> scrrdep) {
        this.scrrdep = scrrdep;
    }

    public CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse withScrrdep(List<Scrrdep> scrrdep) {
        this.scrrdep = scrrdep;
        return this;
    }

    @JsonProperty("rmaj_ctrl_block")
    public List<RmajCtrlBlock> getRmajCtrlBlock() {
        return rmajCtrlBlock;
    }

    @JsonProperty("rmaj_ctrl_block")
    public void setRmajCtrlBlock(List<RmajCtrlBlock> rmajCtrlBlock) {
        this.rmajCtrlBlock = rmajCtrlBlock;
    }

    public CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse withRmajCtrlBlock(List<RmajCtrlBlock> rmajCtrlBlock) {
        this.rmajCtrlBlock = rmajCtrlBlock;
        return this;
    }

    @JsonProperty("scrrmaj")
    public List<Scrrmaj> getScrrmaj() {
        return scrrmaj;
    }

    @JsonProperty("scrrmaj")
    public void setScrrmaj(List<Scrrmaj> scrrmaj) {
        this.scrrmaj = scrrmaj;
    }

    public CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse withScrrmaj(List<Scrrmaj> scrrmaj) {
        this.scrrmaj = scrrmaj;
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

    public CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rdepCtrlBlock");
        sb.append('=');
        sb.append(((this.rdepCtrlBlock == null)?"<null>":this.rdepCtrlBlock));
        sb.append(',');
        sb.append("scrrdep");
        sb.append('=');
        sb.append(((this.scrrdep == null)?"<null>":this.scrrdep));
        sb.append(',');
        sb.append("rmajCtrlBlock");
        sb.append('=');
        sb.append(((this.rmajCtrlBlock == null)?"<null>":this.rmajCtrlBlock));
        sb.append(',');
        sb.append("scrrmaj");
        sb.append('=');
        sb.append(((this.scrrmaj == null)?"<null>":this.scrrmaj));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rdepCtrlBlock == null)? 0 :this.rdepCtrlBlock.hashCode()));
        result = ((result* 31)+((this.scrrmaj == null)? 0 :this.scrrmaj.hashCode()));
        result = ((result* 31)+((this.scrrdep == null)? 0 :this.scrrdep.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse) == false) {
            return false;
        }
        CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse rhs = ((CourseRegistrationDepartmentAndFieldOfStudyRestrictions100GetResponse) other);
        return ((((((this.rmajCtrlBlock == rhs.rmajCtrlBlock)||((this.rmajCtrlBlock!= null)&&this.rmajCtrlBlock.equals(rhs.rmajCtrlBlock)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rdepCtrlBlock == rhs.rdepCtrlBlock)||((this.rdepCtrlBlock!= null)&&this.rdepCtrlBlock.equals(rhs.rdepCtrlBlock))))&&((this.scrrmaj == rhs.scrrmaj)||((this.scrrmaj!= null)&&this.scrrmaj.equals(rhs.scrrmaj))))&&((this.scrrdep == rhs.scrrdep)||((this.scrrdep!= null)&&this.scrrdep.equals(rhs.scrrdep))));
    }

}
