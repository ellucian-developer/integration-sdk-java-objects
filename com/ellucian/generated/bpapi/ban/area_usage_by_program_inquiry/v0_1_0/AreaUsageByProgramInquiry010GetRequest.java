
package com.ellucian.generated.bpapi.ban.area_usage_by_program_inquiry.v0_1_0;

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
    "smrauseArea",
    "smrauseProgram"
})
@Generated("jsonschema2pojo")
public class AreaUsageByProgramInquiry010GetRequest {

    /**
     * Area
     * <p>
     * Lineage reference object : SMRAUSE_AREA
     * 
     */
    @JsonProperty("smrauseArea")
    @JsonPropertyDescription("Lineage reference object : SMRAUSE_AREA")
    private String smrauseArea;
    /**
     * Program
     * <p>
     * Lineage reference object : SMRAUSE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("smrauseProgram")
    @JsonPropertyDescription("Lineage reference object : SMRAUSE_PROGRAM")
    private String smrauseProgram;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Area
     * <p>
     * Lineage reference object : SMRAUSE_AREA
     * 
     */
    @JsonProperty("smrauseArea")
    public String getSmrauseArea() {
        return smrauseArea;
    }

    /**
     * Area
     * <p>
     * Lineage reference object : SMRAUSE_AREA
     * 
     */
    @JsonProperty("smrauseArea")
    public void setSmrauseArea(String smrauseArea) {
        this.smrauseArea = smrauseArea;
    }

    public AreaUsageByProgramInquiry010GetRequest withSmrauseArea(String smrauseArea) {
        this.smrauseArea = smrauseArea;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRAUSE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("smrauseProgram")
    public String getSmrauseProgram() {
        return smrauseProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRAUSE_PROGRAM
     * (Required)
     * 
     */
    @JsonProperty("smrauseProgram")
    public void setSmrauseProgram(String smrauseProgram) {
        this.smrauseProgram = smrauseProgram;
    }

    public AreaUsageByProgramInquiry010GetRequest withSmrauseProgram(String smrauseProgram) {
        this.smrauseProgram = smrauseProgram;
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

    public AreaUsageByProgramInquiry010GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AreaUsageByProgramInquiry010GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("smrauseArea");
        sb.append('=');
        sb.append(((this.smrauseArea == null)?"<null>":this.smrauseArea));
        sb.append(',');
        sb.append("smrauseProgram");
        sb.append('=');
        sb.append(((this.smrauseProgram == null)?"<null>":this.smrauseProgram));
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
        result = ((result* 31)+((this.smrauseArea == null)? 0 :this.smrauseArea.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.smrauseProgram == null)? 0 :this.smrauseProgram.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AreaUsageByProgramInquiry010GetRequest) == false) {
            return false;
        }
        AreaUsageByProgramInquiry010GetRequest rhs = ((AreaUsageByProgramInquiry010GetRequest) other);
        return ((((this.smrauseArea == rhs.smrauseArea)||((this.smrauseArea!= null)&&this.smrauseArea.equals(rhs.smrauseArea)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.smrauseProgram == rhs.smrauseProgram)||((this.smrauseProgram!= null)&&this.smrauseProgram.equals(rhs.smrauseProgram))));
    }

}
