
package com.ellucian.generated.bpapi.ban.grade_comment_codes.v1_0_0;

import java.util.Date;
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
    "activityDate",
    "code",
    "description",
    "studentDisplayInd"
})
@Generated("jsonschema2pojo")
public class GradeCommentCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVGCMT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVGCMT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Code
     * <p>
     * Lineage reference object : STVGCMT_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVGCMT_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVGCMT_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : STVGCMT_DESCRIPTION")
    private String description;
    /**
     * Lineage reference object : STVGCMT_STUDENT_DISPLAY_IND
     * 
     */
    @JsonProperty("studentDisplayInd")
    @JsonPropertyDescription("Lineage reference object : STVGCMT_STUDENT_DISPLAY_IND")
    private String studentDisplayInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVGCMT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVGCMT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public GradeCommentCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVGCMT_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVGCMT_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public GradeCommentCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVGCMT_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVGCMT_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public GradeCommentCodes100QapiPost withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lineage reference object : STVGCMT_STUDENT_DISPLAY_IND
     * 
     */
    @JsonProperty("studentDisplayInd")
    public String getStudentDisplayInd() {
        return studentDisplayInd;
    }

    /**
     * Lineage reference object : STVGCMT_STUDENT_DISPLAY_IND
     * 
     */
    @JsonProperty("studentDisplayInd")
    public void setStudentDisplayInd(String studentDisplayInd) {
        this.studentDisplayInd = studentDisplayInd;
    }

    public GradeCommentCodes100QapiPost withStudentDisplayInd(String studentDisplayInd) {
        this.studentDisplayInd = studentDisplayInd;
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

    public GradeCommentCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeCommentCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("studentDisplayInd");
        sb.append('=');
        sb.append(((this.studentDisplayInd == null)?"<null>":this.studentDisplayInd));
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
        result = ((result* 31)+((this.studentDisplayInd == null)? 0 :this.studentDisplayInd.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeCommentCodes100QapiPost) == false) {
            return false;
        }
        GradeCommentCodes100QapiPost rhs = ((GradeCommentCodes100QapiPost) other);
        return ((((((this.studentDisplayInd == rhs.studentDisplayInd)||((this.studentDisplayInd!= null)&&this.studentDisplayInd.equals(rhs.studentDisplayInd)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
