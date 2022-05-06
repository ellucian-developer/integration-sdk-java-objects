
package com.ellucian.generated.bpapi.ban.student_adjustment_targets_waivers_substitutions_target_courses.v1_0_0;

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
    "programDesc",
    "maint",
    "program"
})
@Generated("jsonschema2pojo")
public class Smrstpv__1 {

    /**
     * Program Description
     * <p>
     * 
     * 
     */
    @JsonProperty("programDesc")
    private String programDesc;
    @JsonProperty("maint")
    private String maint;
    /**
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMRSTPV_PROGRAM")
    private String program;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Program Description
     * <p>
     * 
     * 
     */
    @JsonProperty("programDesc")
    public String getProgramDesc() {
        return programDesc;
    }

    /**
     * Program Description
     * <p>
     * 
     * 
     */
    @JsonProperty("programDesc")
    public void setProgramDesc(String programDesc) {
        this.programDesc = programDesc;
    }

    public Smrstpv__1 withProgramDesc(String programDesc) {
        this.programDesc = programDesc;
        return this;
    }

    @JsonProperty("maint")
    public String getMaint() {
        return maint;
    }

    @JsonProperty("maint")
    public void setMaint(String maint) {
        this.maint = maint;
    }

    public Smrstpv__1 withMaint(String maint) {
        this.maint = maint;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMRSTPV_PROGRAM
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public Smrstpv__1 withProgram(String program) {
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

    public Smrstpv__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Smrstpv__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("programDesc");
        sb.append('=');
        sb.append(((this.programDesc == null)?"<null>":this.programDesc));
        sb.append(',');
        sb.append("maint");
        sb.append('=');
        sb.append(((this.maint == null)?"<null>":this.maint));
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
        result = ((result* 31)+((this.programDesc == null)? 0 :this.programDesc.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maint == null)? 0 :this.maint.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Smrstpv__1) == false) {
            return false;
        }
        Smrstpv__1 rhs = ((Smrstpv__1) other);
        return (((((this.programDesc == rhs.programDesc)||((this.programDesc!= null)&&this.programDesc.equals(rhs.programDesc)))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maint == rhs.maint)||((this.maint!= null)&&this.maint.equals(rhs.maint))));
    }

}
