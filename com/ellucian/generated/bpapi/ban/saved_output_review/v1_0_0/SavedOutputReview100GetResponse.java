
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
    "outputEnd",
    "outputLine"
})
@Generated("jsonschema2pojo")
public class SavedOutputReview100GetResponse {

    @JsonProperty("outputEnd")
    private String outputEnd;
    @JsonProperty("outputLine")
    private String outputLine;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("outputEnd")
    public String getOutputEnd() {
        return outputEnd;
    }

    @JsonProperty("outputEnd")
    public void setOutputEnd(String outputEnd) {
        this.outputEnd = outputEnd;
    }

    public SavedOutputReview100GetResponse withOutputEnd(String outputEnd) {
        this.outputEnd = outputEnd;
        return this;
    }

    @JsonProperty("outputLine")
    public String getOutputLine() {
        return outputLine;
    }

    @JsonProperty("outputLine")
    public void setOutputLine(String outputLine) {
        this.outputLine = outputLine;
    }

    public SavedOutputReview100GetResponse withOutputLine(String outputLine) {
        this.outputLine = outputLine;
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

    public SavedOutputReview100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SavedOutputReview100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("outputEnd");
        sb.append('=');
        sb.append(((this.outputEnd == null)?"<null>":this.outputEnd));
        sb.append(',');
        sb.append("outputLine");
        sb.append('=');
        sb.append(((this.outputLine == null)?"<null>":this.outputLine));
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
        result = ((result* 31)+((this.outputLine == null)? 0 :this.outputLine.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.outputEnd == null)? 0 :this.outputEnd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SavedOutputReview100GetResponse) == false) {
            return false;
        }
        SavedOutputReview100GetResponse rhs = ((SavedOutputReview100GetResponse) other);
        return ((((this.outputLine == rhs.outputLine)||((this.outputLine!= null)&&this.outputLine.equals(rhs.outputLine)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.outputEnd == rhs.outputEnd)||((this.outputEnd!= null)&&this.outputEnd.equals(rhs.outputEnd))));
    }

}
