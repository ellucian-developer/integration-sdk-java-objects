
package com.ellucian.generated.bpapi.ban.course_registration_degree_and_program_restrictions.v1_0_0;

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
    "programDescription",
    "program"
})
@Generated("jsonschema2pojo")
public class Scrrprg__2 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("programDescription")
    private String programDescription;
    /**
     * Program
     * <p>
     * Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle")
    private String program;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("programDescription")
    public String getProgramDescription() {
        return programDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("programDescription")
    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    public Scrrprg__2 withProgramDescription(String programDescription) {
        this.programDescription = programDescription;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SCRRPRG_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public Scrrprg__2 withProgram(String program) {
        this.program = program;
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

    public Scrrprg__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrrprg__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("programDescription");
        sb.append('=');
        sb.append(((this.programDescription == null)?"<null>":this.programDescription));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
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
        result = ((result* 31)+((this.programDescription == null)? 0 :this.programDescription.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrrprg__2) == false) {
            return false;
        }
        Scrrprg__2 rhs = ((Scrrprg__2) other);
        return ((((this.programDescription == rhs.programDescription)||((this.programDescription!= null)&&this.programDescription.equals(rhs.programDescription)))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
