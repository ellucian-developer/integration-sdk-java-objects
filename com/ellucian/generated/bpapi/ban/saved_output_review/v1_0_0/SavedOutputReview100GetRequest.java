
package com.ellucian.generated.bpapi.ban.saved_output_review.v1_0_0;

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
    "keyblckOneUpNo",
    "keyblckStartDate",
    "keyblckFileName",
    "keyblckJob"
})
@Generated("jsonschema2pojo")
public class SavedOutputReview100GetRequest {

    /**
     * Number
     * <p>
     * Lineage reference object : keyblckOneUpNo
     * 
     */
    @JsonProperty("keyblckOneUpNo")
    @JsonPropertyDescription("Lineage reference object : keyblckOneUpNo")
    private Object keyblckOneUpNo;
    /**
     * Beginning Date Saved
     * <p>
     * Lineage reference object : keyblckStartDate
     * 
     */
    @JsonProperty("keyblckStartDate")
    @JsonPropertyDescription("Lineage reference object : keyblckStartDate")
    private Object keyblckStartDate;
    /**
     * File Name
     * <p>
     * Lineage reference object : keyblckFileName
     * 
     */
    @JsonProperty("keyblckFileName")
    @JsonPropertyDescription("Lineage reference object : keyblckFileName")
    private Object keyblckFileName;
    /**
     * Process
     * <p>
     * Lineage reference object : keyblckJob
     * 
     */
    @JsonProperty("keyblckJob")
    @JsonPropertyDescription("Lineage reference object : keyblckJob")
    private Object keyblckJob;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Number
     * <p>
     * Lineage reference object : keyblckOneUpNo
     * 
     */
    @JsonProperty("keyblckOneUpNo")
    public Object getKeyblckOneUpNo() {
        return keyblckOneUpNo;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : keyblckOneUpNo
     * 
     */
    @JsonProperty("keyblckOneUpNo")
    public void setKeyblckOneUpNo(Object keyblckOneUpNo) {
        this.keyblckOneUpNo = keyblckOneUpNo;
    }

    public SavedOutputReview100GetRequest withKeyblckOneUpNo(Object keyblckOneUpNo) {
        this.keyblckOneUpNo = keyblckOneUpNo;
        return this;
    }

    /**
     * Beginning Date Saved
     * <p>
     * Lineage reference object : keyblckStartDate
     * 
     */
    @JsonProperty("keyblckStartDate")
    public Object getKeyblckStartDate() {
        return keyblckStartDate;
    }

    /**
     * Beginning Date Saved
     * <p>
     * Lineage reference object : keyblckStartDate
     * 
     */
    @JsonProperty("keyblckStartDate")
    public void setKeyblckStartDate(Object keyblckStartDate) {
        this.keyblckStartDate = keyblckStartDate;
    }

    public SavedOutputReview100GetRequest withKeyblckStartDate(Object keyblckStartDate) {
        this.keyblckStartDate = keyblckStartDate;
        return this;
    }

    /**
     * File Name
     * <p>
     * Lineage reference object : keyblckFileName
     * 
     */
    @JsonProperty("keyblckFileName")
    public Object getKeyblckFileName() {
        return keyblckFileName;
    }

    /**
     * File Name
     * <p>
     * Lineage reference object : keyblckFileName
     * 
     */
    @JsonProperty("keyblckFileName")
    public void setKeyblckFileName(Object keyblckFileName) {
        this.keyblckFileName = keyblckFileName;
    }

    public SavedOutputReview100GetRequest withKeyblckFileName(Object keyblckFileName) {
        this.keyblckFileName = keyblckFileName;
        return this;
    }

    /**
     * Process
     * <p>
     * Lineage reference object : keyblckJob
     * 
     */
    @JsonProperty("keyblckJob")
    public Object getKeyblckJob() {
        return keyblckJob;
    }

    /**
     * Process
     * <p>
     * Lineage reference object : keyblckJob
     * 
     */
    @JsonProperty("keyblckJob")
    public void setKeyblckJob(Object keyblckJob) {
        this.keyblckJob = keyblckJob;
    }

    public SavedOutputReview100GetRequest withKeyblckJob(Object keyblckJob) {
        this.keyblckJob = keyblckJob;
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

    public SavedOutputReview100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SavedOutputReview100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckOneUpNo");
        sb.append('=');
        sb.append(((this.keyblckOneUpNo == null)?"<null>":this.keyblckOneUpNo));
        sb.append(',');
        sb.append("keyblckStartDate");
        sb.append('=');
        sb.append(((this.keyblckStartDate == null)?"<null>":this.keyblckStartDate));
        sb.append(',');
        sb.append("keyblckFileName");
        sb.append('=');
        sb.append(((this.keyblckFileName == null)?"<null>":this.keyblckFileName));
        sb.append(',');
        sb.append("keyblckJob");
        sb.append('=');
        sb.append(((this.keyblckJob == null)?"<null>":this.keyblckJob));
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
        if ((other instanceof SavedOutputReview100GetRequest) == false) {
            return false;
        }
        SavedOutputReview100GetRequest rhs = ((SavedOutputReview100GetRequest) other);
        return ((((((this.keyblckOneUpNo == rhs.keyblckOneUpNo)||((this.keyblckOneUpNo!= null)&&this.keyblckOneUpNo.equals(rhs.keyblckOneUpNo)))&&((this.keyblckFileName == rhs.keyblckFileName)||((this.keyblckFileName!= null)&&this.keyblckFileName.equals(rhs.keyblckFileName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblckStartDate == rhs.keyblckStartDate)||((this.keyblckStartDate!= null)&&this.keyblckStartDate.equals(rhs.keyblckStartDate))))&&((this.keyblckJob == rhs.keyblckJob)||((this.keyblckJob!= null)&&this.keyblckJob.equals(rhs.keyblckJob))));
    }

}
