
package com.ellucian.generated.bpapi.ban.eu_hesa_student_course_session.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stuCourseSessionId",
    "numhus",
    "id"
})
@Generated("jsonschema2pojo")
public class EuHesaStudentCourseSession100GetRequest {

    /**
     * Lineage reference object : stuCourseSessionId
     * 
     */
    @JsonProperty("stuCourseSessionId")
    @JsonPropertyDescription("Lineage reference object : stuCourseSessionId")
    private Object stuCourseSessionId;
    /**
     * Lineage reference object : numhus
     * 
     */
    @JsonProperty("numhus")
    @JsonPropertyDescription("Lineage reference object : numhus")
    private Object numhus;
    /**
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : stuCourseSessionId
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public Object getStuCourseSessionId() {
        return stuCourseSessionId;
    }

    /**
     * Lineage reference object : stuCourseSessionId
     * 
     */
    @JsonProperty("stuCourseSessionId")
    public void setStuCourseSessionId(Object stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
    }

    public EuHesaStudentCourseSession100GetRequest withStuCourseSessionId(Object stuCourseSessionId) {
        this.stuCourseSessionId = stuCourseSessionId;
        return this;
    }

    /**
     * Lineage reference object : numhus
     * 
     */
    @JsonProperty("numhus")
    public Object getNumhus() {
        return numhus;
    }

    /**
     * Lineage reference object : numhus
     * 
     */
    @JsonProperty("numhus")
    public void setNumhus(Object numhus) {
        this.numhus = numhus;
    }

    public EuHesaStudentCourseSession100GetRequest withNumhus(Object numhus) {
        this.numhus = numhus;
        return this;
    }

    /**
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public EuHesaStudentCourseSession100GetRequest withId(Object id) {
        this.id = id;
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

    public EuHesaStudentCourseSession100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaStudentCourseSession100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stuCourseSessionId");
        sb.append('=');
        sb.append(((this.stuCourseSessionId == null)?"<null>":this.stuCourseSessionId));
        sb.append(',');
        sb.append("numhus");
        sb.append('=');
        sb.append(((this.numhus == null)?"<null>":this.numhus));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.stuCourseSessionId == null)? 0 :this.stuCourseSessionId.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaStudentCourseSession100GetRequest) == false) {
            return false;
        }
        EuHesaStudentCourseSession100GetRequest rhs = ((EuHesaStudentCourseSession100GetRequest) other);
        return (((((this.stuCourseSessionId == rhs.stuCourseSessionId)||((this.stuCourseSessionId!= null)&&this.stuCourseSessionId.equals(rhs.stuCourseSessionId)))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
