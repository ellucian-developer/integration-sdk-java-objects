
package com.ellucian.generated.bpapi.ban.course_registration_student_attribute_and_cohort_restrictions.v1_0_0;

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
    "ratt_ctrl_block",
    "scrratt",
    "rchr_ctrl_block",
    "scrrchr"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse {

    @JsonProperty("ratt_ctrl_block")
    private List<RattCtrlBlock> rattCtrlBlock = new ArrayList<RattCtrlBlock>();
    @JsonProperty("scrratt")
    private List<Scrratt> scrratt = new ArrayList<Scrratt>();
    @JsonProperty("rchr_ctrl_block")
    private List<RchrCtrlBlock> rchrCtrlBlock = new ArrayList<RchrCtrlBlock>();
    @JsonProperty("scrrchr")
    private List<Scrrchr> scrrchr = new ArrayList<Scrrchr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ratt_ctrl_block")
    public List<RattCtrlBlock> getRattCtrlBlock() {
        return rattCtrlBlock;
    }

    @JsonProperty("ratt_ctrl_block")
    public void setRattCtrlBlock(List<RattCtrlBlock> rattCtrlBlock) {
        this.rattCtrlBlock = rattCtrlBlock;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse withRattCtrlBlock(List<RattCtrlBlock> rattCtrlBlock) {
        this.rattCtrlBlock = rattCtrlBlock;
        return this;
    }

    @JsonProperty("scrratt")
    public List<Scrratt> getScrratt() {
        return scrratt;
    }

    @JsonProperty("scrratt")
    public void setScrratt(List<Scrratt> scrratt) {
        this.scrratt = scrratt;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse withScrratt(List<Scrratt> scrratt) {
        this.scrratt = scrratt;
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

    public CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse withRchrCtrlBlock(List<RchrCtrlBlock> rchrCtrlBlock) {
        this.rchrCtrlBlock = rchrCtrlBlock;
        return this;
    }

    @JsonProperty("scrrchr")
    public List<Scrrchr> getScrrchr() {
        return scrrchr;
    }

    @JsonProperty("scrrchr")
    public void setScrrchr(List<Scrrchr> scrrchr) {
        this.scrrchr = scrrchr;
    }

    public CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse withScrrchr(List<Scrrchr> scrrchr) {
        this.scrrchr = scrrchr;
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

    public CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rattCtrlBlock");
        sb.append('=');
        sb.append(((this.rattCtrlBlock == null)?"<null>":this.rattCtrlBlock));
        sb.append(',');
        sb.append("scrratt");
        sb.append('=');
        sb.append(((this.scrratt == null)?"<null>":this.scrratt));
        sb.append(',');
        sb.append("rchrCtrlBlock");
        sb.append('=');
        sb.append(((this.rchrCtrlBlock == null)?"<null>":this.rchrCtrlBlock));
        sb.append(',');
        sb.append("scrrchr");
        sb.append('=');
        sb.append(((this.scrrchr == null)?"<null>":this.scrrchr));
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
        result = ((result* 31)+((this.scrratt == null)? 0 :this.scrratt.hashCode()));
        result = ((result* 31)+((this.rattCtrlBlock == null)? 0 :this.rattCtrlBlock.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrrchr == null)? 0 :this.scrrchr.hashCode()));
        result = ((result* 31)+((this.rchrCtrlBlock == null)? 0 :this.rchrCtrlBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse) == false) {
            return false;
        }
        CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse rhs = ((CourseRegistrationStudentAttributeAndCohortRestrictions100GetResponse) other);
        return ((((((this.scrratt == rhs.scrratt)||((this.scrratt!= null)&&this.scrratt.equals(rhs.scrratt)))&&((this.rattCtrlBlock == rhs.rattCtrlBlock)||((this.rattCtrlBlock!= null)&&this.rattCtrlBlock.equals(rhs.rattCtrlBlock))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrrchr == rhs.scrrchr)||((this.scrrchr!= null)&&this.scrrchr.equals(rhs.scrrchr))))&&((this.rchrCtrlBlock == rhs.rchrCtrlBlock)||((this.rchrCtrlBlock!= null)&&this.rchrCtrlBlock.equals(rhs.rchrCtrlBlock))));
    }

}
