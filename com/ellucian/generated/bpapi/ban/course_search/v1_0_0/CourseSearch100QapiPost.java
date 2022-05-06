
package com.ellucian.generated.bpapi.ban.course_search.v1_0_0;

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
    "scacrseSubjCode",
    "scacrseCrseNumb",
    "scacrseStartDate",
    "scacrseEndDate"
})
@Generated("jsonschema2pojo")
public class CourseSearch100QapiPost {

    @JsonProperty("scacrseSubjCode")
    private String scacrseSubjCode;
    @JsonProperty("scacrseCrseNumb")
    private String scacrseCrseNumb;
    @JsonProperty("scacrseStartDate")
    private String scacrseStartDate;
    @JsonProperty("scacrseEndDate")
    private String scacrseEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scacrseSubjCode")
    public String getScacrseSubjCode() {
        return scacrseSubjCode;
    }

    @JsonProperty("scacrseSubjCode")
    public void setScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
    }

    public CourseSearch100QapiPost withScacrseSubjCode(String scacrseSubjCode) {
        this.scacrseSubjCode = scacrseSubjCode;
        return this;
    }

    @JsonProperty("scacrseCrseNumb")
    public String getScacrseCrseNumb() {
        return scacrseCrseNumb;
    }

    @JsonProperty("scacrseCrseNumb")
    public void setScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
    }

    public CourseSearch100QapiPost withScacrseCrseNumb(String scacrseCrseNumb) {
        this.scacrseCrseNumb = scacrseCrseNumb;
        return this;
    }

    @JsonProperty("scacrseStartDate")
    public String getScacrseStartDate() {
        return scacrseStartDate;
    }

    @JsonProperty("scacrseStartDate")
    public void setScacrseStartDate(String scacrseStartDate) {
        this.scacrseStartDate = scacrseStartDate;
    }

    public CourseSearch100QapiPost withScacrseStartDate(String scacrseStartDate) {
        this.scacrseStartDate = scacrseStartDate;
        return this;
    }

    @JsonProperty("scacrseEndDate")
    public String getScacrseEndDate() {
        return scacrseEndDate;
    }

    @JsonProperty("scacrseEndDate")
    public void setScacrseEndDate(String scacrseEndDate) {
        this.scacrseEndDate = scacrseEndDate;
    }

    public CourseSearch100QapiPost withScacrseEndDate(String scacrseEndDate) {
        this.scacrseEndDate = scacrseEndDate;
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

    public CourseSearch100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseSearch100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scacrseSubjCode");
        sb.append('=');
        sb.append(((this.scacrseSubjCode == null)?"<null>":this.scacrseSubjCode));
        sb.append(',');
        sb.append("scacrseCrseNumb");
        sb.append('=');
        sb.append(((this.scacrseCrseNumb == null)?"<null>":this.scacrseCrseNumb));
        sb.append(',');
        sb.append("scacrseStartDate");
        sb.append('=');
        sb.append(((this.scacrseStartDate == null)?"<null>":this.scacrseStartDate));
        sb.append(',');
        sb.append("scacrseEndDate");
        sb.append('=');
        sb.append(((this.scacrseEndDate == null)?"<null>":this.scacrseEndDate));
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
        result = ((result* 31)+((this.scacrseStartDate == null)? 0 :this.scacrseStartDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scacrseEndDate == null)? 0 :this.scacrseEndDate.hashCode()));
        result = ((result* 31)+((this.scacrseCrseNumb == null)? 0 :this.scacrseCrseNumb.hashCode()));
        result = ((result* 31)+((this.scacrseSubjCode == null)? 0 :this.scacrseSubjCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseSearch100QapiPost) == false) {
            return false;
        }
        CourseSearch100QapiPost rhs = ((CourseSearch100QapiPost) other);
        return ((((((this.scacrseStartDate == rhs.scacrseStartDate)||((this.scacrseStartDate!= null)&&this.scacrseStartDate.equals(rhs.scacrseStartDate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scacrseEndDate == rhs.scacrseEndDate)||((this.scacrseEndDate!= null)&&this.scacrseEndDate.equals(rhs.scacrseEndDate))))&&((this.scacrseCrseNumb == rhs.scacrseCrseNumb)||((this.scacrseCrseNumb!= null)&&this.scacrseCrseNumb.equals(rhs.scacrseCrseNumb))))&&((this.scacrseSubjCode == rhs.scacrseSubjCode)||((this.scacrseSubjCode!= null)&&this.scacrseSubjCode.equals(rhs.scacrseSubjCode))));
    }

}
