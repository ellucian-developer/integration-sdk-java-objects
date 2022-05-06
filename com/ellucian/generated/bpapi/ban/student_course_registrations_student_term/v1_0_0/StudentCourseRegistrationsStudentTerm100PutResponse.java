
package com.ellucian.generated.bpapi.ban.student_course_registrations_student_term.v1_0_0;

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
    "key_block",
    "sgbstdn"
})
@Generated("jsonschema2pojo")
public class StudentCourseRegistrationsStudentTerm100PutResponse {

    @JsonProperty("key_block")
    private List<KeyBlock> keyBlock = new ArrayList<KeyBlock>();
    @JsonProperty("sgbstdn")
    private List<Sgbstdn> sgbstdn = new ArrayList<Sgbstdn>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("key_block")
    public List<KeyBlock> getKeyBlock() {
        return keyBlock;
    }

    @JsonProperty("key_block")
    public void setKeyBlock(List<KeyBlock> keyBlock) {
        this.keyBlock = keyBlock;
    }

    public StudentCourseRegistrationsStudentTerm100PutResponse withKeyBlock(List<KeyBlock> keyBlock) {
        this.keyBlock = keyBlock;
        return this;
    }

    @JsonProperty("sgbstdn")
    public List<Sgbstdn> getSgbstdn() {
        return sgbstdn;
    }

    @JsonProperty("sgbstdn")
    public void setSgbstdn(List<Sgbstdn> sgbstdn) {
        this.sgbstdn = sgbstdn;
    }

    public StudentCourseRegistrationsStudentTerm100PutResponse withSgbstdn(List<Sgbstdn> sgbstdn) {
        this.sgbstdn = sgbstdn;
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

    public StudentCourseRegistrationsStudentTerm100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCourseRegistrationsStudentTerm100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyBlock");
        sb.append('=');
        sb.append(((this.keyBlock == null)?"<null>":this.keyBlock));
        sb.append(',');
        sb.append("sgbstdn");
        sb.append('=');
        sb.append(((this.sgbstdn == null)?"<null>":this.sgbstdn));
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
        result = ((result* 31)+((this.sgbstdn == null)? 0 :this.sgbstdn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyBlock == null)? 0 :this.keyBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCourseRegistrationsStudentTerm100PutResponse) == false) {
            return false;
        }
        StudentCourseRegistrationsStudentTerm100PutResponse rhs = ((StudentCourseRegistrationsStudentTerm100PutResponse) other);
        return ((((this.sgbstdn == rhs.sgbstdn)||((this.sgbstdn!= null)&&this.sgbstdn.equals(rhs.sgbstdn)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyBlock == rhs.keyBlock)||((this.keyBlock!= null)&&this.keyBlock.equals(rhs.keyBlock))));
    }

}
