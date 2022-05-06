
package com.ellucian.generated.bpapi.ban._2019_2020_applicant_override.v1_0_0;

import java.util.HashMap;
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
    "studentId"
})
@Generated("jsonschema2pojo")
public class _20192020ApplicantOverride100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("studentId")
    private String studentId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("studentId")
    public String getStudentId() {
        return studentId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("studentId")
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public _20192020ApplicantOverride100QapiPost withStudentId(String studentId) {
        this.studentId = studentId;
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

    public _20192020ApplicantOverride100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20192020ApplicantOverride100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("studentId");
        sb.append('=');
        sb.append(((this.studentId == null)?"<null>":this.studentId));
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
        result = ((result* 31)+((this.studentId == null)? 0 :this.studentId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20192020ApplicantOverride100QapiPost) == false) {
            return false;
        }
        _20192020ApplicantOverride100QapiPost rhs = ((_20192020ApplicantOverride100QapiPost) other);
        return (((this.studentId == rhs.studentId)||((this.studentId!= null)&&this.studentId.equals(rhs.studentId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
