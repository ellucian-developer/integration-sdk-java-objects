
package com.ellucian.generated.bpapi.ban.saved_output_review.v1_0_0;

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
    "keyblckJob",
    "keyblckOneUpNo",
    "keyblckFileName",
    "keyblckStartDate"
})
@Generated("jsonschema2pojo")
public class SavedOutputReview100QapiPost {

    @JsonProperty("keyblckJob")
    private String keyblckJob;
    @JsonProperty("keyblckOneUpNo")
    private String keyblckOneUpNo;
    @JsonProperty("keyblckFileName")
    private String keyblckFileName;
    @JsonProperty("keyblckStartDate")
    private String keyblckStartDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckJob")
    public String getKeyblckJob() {
        return keyblckJob;
    }

    @JsonProperty("keyblckJob")
    public void setKeyblckJob(String keyblckJob) {
        this.keyblckJob = keyblckJob;
    }

    public SavedOutputReview100QapiPost withKeyblckJob(String keyblckJob) {
        this.keyblckJob = keyblckJob;
        return this;
    }

    @JsonProperty("keyblckOneUpNo")
    public String getKeyblckOneUpNo() {
        return keyblckOneUpNo;
    }

    @JsonProperty("keyblckOneUpNo")
    public void setKeyblckOneUpNo(String keyblckOneUpNo) {
        this.keyblckOneUpNo = keyblckOneUpNo;
    }

    public SavedOutputReview100QapiPost withKeyblckOneUpNo(String keyblckOneUpNo) {
        this.keyblckOneUpNo = keyblckOneUpNo;
        return this;
    }

    @JsonProperty("keyblckFileName")
    public String getKeyblckFileName() {
        return keyblckFileName;
    }

    @JsonProperty("keyblckFileName")
    public void setKeyblckFileName(String keyblckFileName) {
        this.keyblckFileName = keyblckFileName;
    }

    public SavedOutputReview100QapiPost withKeyblckFileName(String keyblckFileName) {
        this.keyblckFileName = keyblckFileName;
        return this;
    }

    @JsonProperty("keyblckStartDate")
    public String getKeyblckStartDate() {
        return keyblckStartDate;
    }

    @JsonProperty("keyblckStartDate")
    public void setKeyblckStartDate(String keyblckStartDate) {
        this.keyblckStartDate = keyblckStartDate;
    }

    public SavedOutputReview100QapiPost withKeyblckStartDate(String keyblckStartDate) {
        this.keyblckStartDate = keyblckStartDate;
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

    public SavedOutputReview100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SavedOutputReview100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckJob");
        sb.append('=');
        sb.append(((this.keyblckJob == null)?"<null>":this.keyblckJob));
        sb.append(',');
        sb.append("keyblckOneUpNo");
        sb.append('=');
        sb.append(((this.keyblckOneUpNo == null)?"<null>":this.keyblckOneUpNo));
        sb.append(',');
        sb.append("keyblckFileName");
        sb.append('=');
        sb.append(((this.keyblckFileName == null)?"<null>":this.keyblckFileName));
        sb.append(',');
        sb.append("keyblckStartDate");
        sb.append('=');
        sb.append(((this.keyblckStartDate == null)?"<null>":this.keyblckStartDate));
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
        result = ((result* 31)+((this.keyblckOneUpNo == null)? 0 :this.keyblckOneUpNo.hashCode()));
        result = ((result* 31)+((this.keyblckFileName == null)? 0 :this.keyblckFileName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckStartDate == null)? 0 :this.keyblckStartDate.hashCode()));
        result = ((result* 31)+((this.keyblckJob == null)? 0 :this.keyblckJob.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SavedOutputReview100QapiPost) == false) {
            return false;
        }
        SavedOutputReview100QapiPost rhs = ((SavedOutputReview100QapiPost) other);
        return ((((((this.keyblckOneUpNo == rhs.keyblckOneUpNo)||((this.keyblckOneUpNo!= null)&&this.keyblckOneUpNo.equals(rhs.keyblckOneUpNo)))&&((this.keyblckFileName == rhs.keyblckFileName)||((this.keyblckFileName!= null)&&this.keyblckFileName.equals(rhs.keyblckFileName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckStartDate == rhs.keyblckStartDate)||((this.keyblckStartDate!= null)&&this.keyblckStartDate.equals(rhs.keyblckStartDate))))&&((this.keyblckJob == rhs.keyblckJob)||((this.keyblckJob!= null)&&this.keyblckJob.equals(rhs.keyblckJob))));
    }

}
