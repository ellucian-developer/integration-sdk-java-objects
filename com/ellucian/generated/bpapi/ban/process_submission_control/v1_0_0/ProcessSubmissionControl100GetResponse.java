
package com.ellucian.generated.bpapi.ban.process_submission_control.v1_0_0;

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
    "number",
    "displayDesc",
    "value"
})
@Generated("jsonschema2pojo")
public class ProcessSubmissionControl100GetResponse {

    /**
     * Number
     * <p>
     * Lineage reference object : GJBPRUN_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Lineage reference object : GJBPRUN_NUMBER")
    private String number;
    /**
     * Parameters
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDesc")
    private String displayDesc;
    /**
     * Values
     * <p>
     * Lineage reference object : GJBPRUN_VALUE, Lookup lineage reference object : gjbpval
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Lineage reference object : GJBPRUN_VALUE, Lookup lineage reference object : gjbpval")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Number
     * <p>
     * Lineage reference object : GJBPRUN_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : GJBPRUN_NUMBER
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public ProcessSubmissionControl100GetResponse withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Parameters
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDesc")
    public String getDisplayDesc() {
        return displayDesc;
    }

    /**
     * Parameters
     * <p>
     * 
     * 
     */
    @JsonProperty("displayDesc")
    public void setDisplayDesc(String displayDesc) {
        this.displayDesc = displayDesc;
    }

    public ProcessSubmissionControl100GetResponse withDisplayDesc(String displayDesc) {
        this.displayDesc = displayDesc;
        return this;
    }

    /**
     * Values
     * <p>
     * Lineage reference object : GJBPRUN_VALUE, Lookup lineage reference object : gjbpval
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Values
     * <p>
     * Lineage reference object : GJBPRUN_VALUE, Lookup lineage reference object : gjbpval
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public ProcessSubmissionControl100GetResponse withValue(String value) {
        this.value = value;
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

    public ProcessSubmissionControl100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProcessSubmissionControl100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("displayDesc");
        sb.append('=');
        sb.append(((this.displayDesc == null)?"<null>":this.displayDesc));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayDesc == null)? 0 :this.displayDesc.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessSubmissionControl100GetResponse) == false) {
            return false;
        }
        ProcessSubmissionControl100GetResponse rhs = ((ProcessSubmissionControl100GetResponse) other);
        return (((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayDesc == rhs.displayDesc)||((this.displayDesc!= null)&&this.displayDesc.equals(rhs.displayDesc))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
