
package com.ellucian.generated.bpapi.ban.process_submission_control.v1_0_0;

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
    "jprmCode"
})
@Generated("jsonschema2pojo")
public class ProcessSubmissionControl100QapiPost {

    @JsonProperty("keyblckJob")
    private String keyblckJob;
    @JsonProperty("jprmCode")
    private String jprmCode;
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

    public ProcessSubmissionControl100QapiPost withKeyblckJob(String keyblckJob) {
        this.keyblckJob = keyblckJob;
        return this;
    }

    @JsonProperty("jprmCode")
    public String getJprmCode() {
        return jprmCode;
    }

    @JsonProperty("jprmCode")
    public void setJprmCode(String jprmCode) {
        this.jprmCode = jprmCode;
    }

    public ProcessSubmissionControl100QapiPost withJprmCode(String jprmCode) {
        this.jprmCode = jprmCode;
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

    public ProcessSubmissionControl100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProcessSubmissionControl100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckJob");
        sb.append('=');
        sb.append(((this.keyblckJob == null)?"<null>":this.keyblckJob));
        sb.append(',');
        sb.append("jprmCode");
        sb.append('=');
        sb.append(((this.jprmCode == null)?"<null>":this.jprmCode));
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
        result = ((result* 31)+((this.jprmCode == null)? 0 :this.jprmCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblckJob == null)? 0 :this.keyblckJob.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessSubmissionControl100QapiPost) == false) {
            return false;
        }
        ProcessSubmissionControl100QapiPost rhs = ((ProcessSubmissionControl100QapiPost) other);
        return ((((this.jprmCode == rhs.jprmCode)||((this.jprmCode!= null)&&this.jprmCode.equals(rhs.jprmCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckJob == rhs.keyblckJob)||((this.keyblckJob!= null)&&this.keyblckJob.equals(rhs.keyblckJob))));
    }

}
