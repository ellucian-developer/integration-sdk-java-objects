
package com.ellucian.generated.bpapi.ban.course_registration_campus_and_college_restrictions.v1_0_0;

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
    "rcam_ctrl_block",
    "scrrcam",
    "rcol_ctrl_block",
    "scrrcol"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationCampusAndCollegeRestrictions100PutResponse {

    @JsonProperty("rcam_ctrl_block")
    private List<RcamCtrlBlock__1> rcamCtrlBlock = new ArrayList<RcamCtrlBlock__1>();
    @JsonProperty("scrrcam")
    private List<Scrrcam__2> scrrcam = new ArrayList<Scrrcam__2>();
    @JsonProperty("rcol_ctrl_block")
    private List<RcolCtrlBlock__1> rcolCtrlBlock = new ArrayList<RcolCtrlBlock__1>();
    @JsonProperty("scrrcol")
    private List<Scrrcol__2> scrrcol = new ArrayList<Scrrcol__2>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rcam_ctrl_block")
    public List<RcamCtrlBlock__1> getRcamCtrlBlock() {
        return rcamCtrlBlock;
    }

    @JsonProperty("rcam_ctrl_block")
    public void setRcamCtrlBlock(List<RcamCtrlBlock__1> rcamCtrlBlock) {
        this.rcamCtrlBlock = rcamCtrlBlock;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutResponse withRcamCtrlBlock(List<RcamCtrlBlock__1> rcamCtrlBlock) {
        this.rcamCtrlBlock = rcamCtrlBlock;
        return this;
    }

    @JsonProperty("scrrcam")
    public List<Scrrcam__2> getScrrcam() {
        return scrrcam;
    }

    @JsonProperty("scrrcam")
    public void setScrrcam(List<Scrrcam__2> scrrcam) {
        this.scrrcam = scrrcam;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutResponse withScrrcam(List<Scrrcam__2> scrrcam) {
        this.scrrcam = scrrcam;
        return this;
    }

    @JsonProperty("rcol_ctrl_block")
    public List<RcolCtrlBlock__1> getRcolCtrlBlock() {
        return rcolCtrlBlock;
    }

    @JsonProperty("rcol_ctrl_block")
    public void setRcolCtrlBlock(List<RcolCtrlBlock__1> rcolCtrlBlock) {
        this.rcolCtrlBlock = rcolCtrlBlock;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutResponse withRcolCtrlBlock(List<RcolCtrlBlock__1> rcolCtrlBlock) {
        this.rcolCtrlBlock = rcolCtrlBlock;
        return this;
    }

    @JsonProperty("scrrcol")
    public List<Scrrcol__2> getScrrcol() {
        return scrrcol;
    }

    @JsonProperty("scrrcol")
    public void setScrrcol(List<Scrrcol__2> scrrcol) {
        this.scrrcol = scrrcol;
    }

    public CourseRegistrationCampusAndCollegeRestrictions100PutResponse withScrrcol(List<Scrrcol__2> scrrcol) {
        this.scrrcol = scrrcol;
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

    public CourseRegistrationCampusAndCollegeRestrictions100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationCampusAndCollegeRestrictions100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rcamCtrlBlock");
        sb.append('=');
        sb.append(((this.rcamCtrlBlock == null)?"<null>":this.rcamCtrlBlock));
        sb.append(',');
        sb.append("scrrcam");
        sb.append('=');
        sb.append(((this.scrrcam == null)?"<null>":this.scrrcam));
        sb.append(',');
        sb.append("rcolCtrlBlock");
        sb.append('=');
        sb.append(((this.rcolCtrlBlock == null)?"<null>":this.rcolCtrlBlock));
        sb.append(',');
        sb.append("scrrcol");
        sb.append('=');
        sb.append(((this.scrrcol == null)?"<null>":this.scrrcol));
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
        result = ((result* 31)+((this.scrrcol == null)? 0 :this.scrrcol.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rcamCtrlBlock == null)? 0 :this.rcamCtrlBlock.hashCode()));
        result = ((result* 31)+((this.rcolCtrlBlock == null)? 0 :this.rcolCtrlBlock.hashCode()));
        result = ((result* 31)+((this.scrrcam == null)? 0 :this.scrrcam.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationCampusAndCollegeRestrictions100PutResponse) == false) {
            return false;
        }
        CourseRegistrationCampusAndCollegeRestrictions100PutResponse rhs = ((CourseRegistrationCampusAndCollegeRestrictions100PutResponse) other);
        return ((((((this.scrrcol == rhs.scrrcol)||((this.scrrcol!= null)&&this.scrrcol.equals(rhs.scrrcol)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rcamCtrlBlock == rhs.rcamCtrlBlock)||((this.rcamCtrlBlock!= null)&&this.rcamCtrlBlock.equals(rhs.rcamCtrlBlock))))&&((this.rcolCtrlBlock == rhs.rcolCtrlBlock)||((this.rcolCtrlBlock!= null)&&this.rcolCtrlBlock.equals(rhs.rcolCtrlBlock))))&&((this.scrrcam == rhs.scrrcam)||((this.scrrcam!= null)&&this.scrrcam.equals(rhs.scrrcam))));
    }

}
