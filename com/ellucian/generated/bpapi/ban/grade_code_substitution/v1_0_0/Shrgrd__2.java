
package com.ellucian.generated.bpapi.ban.grade_code_substitution.v1_0_0;

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
    "grdeCodeSubstitute",
    "stvgrdeAbbrevSubstitute",
    "gmodCodeStudent",
    "stvgmodDesc"
})
@Generated("jsonschema2pojo")
public class Shrgrd__2 {

    /**
     * Substitute Grade
     * <p>
     * Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE
     * (Required)
     * 
     */
    @JsonProperty("grdeCodeSubstitute")
    @JsonPropertyDescription("Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE")
    private String grdeCodeSubstitute;
    /**
     * Abbreviation
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgrdeAbbrevSubstitute")
    private String stvgrdeAbbrevSubstitute;
    /**
     * Substitute Grade Mode
     * <p>
     * Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCodeStudent")
    @JsonPropertyDescription("Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod")
    private String gmodCodeStudent;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgmodDesc")
    private String stvgmodDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Substitute Grade
     * <p>
     * Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE
     * (Required)
     * 
     */
    @JsonProperty("grdeCodeSubstitute")
    public String getGrdeCodeSubstitute() {
        return grdeCodeSubstitute;
    }

    /**
     * Substitute Grade
     * <p>
     * Lineage reference object : SHRGRDS_GRDE_CODE_SUBSTITUTE
     * (Required)
     * 
     */
    @JsonProperty("grdeCodeSubstitute")
    public void setGrdeCodeSubstitute(String grdeCodeSubstitute) {
        this.grdeCodeSubstitute = grdeCodeSubstitute;
    }

    public Shrgrd__2 withGrdeCodeSubstitute(String grdeCodeSubstitute) {
        this.grdeCodeSubstitute = grdeCodeSubstitute;
        return this;
    }

    /**
     * Abbreviation
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgrdeAbbrevSubstitute")
    public String getStvgrdeAbbrevSubstitute() {
        return stvgrdeAbbrevSubstitute;
    }

    /**
     * Abbreviation
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgrdeAbbrevSubstitute")
    public void setStvgrdeAbbrevSubstitute(String stvgrdeAbbrevSubstitute) {
        this.stvgrdeAbbrevSubstitute = stvgrdeAbbrevSubstitute;
    }

    public Shrgrd__2 withStvgrdeAbbrevSubstitute(String stvgrdeAbbrevSubstitute) {
        this.stvgrdeAbbrevSubstitute = stvgrdeAbbrevSubstitute;
        return this;
    }

    /**
     * Substitute Grade Mode
     * <p>
     * Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCodeStudent")
    public String getGmodCodeStudent() {
        return gmodCodeStudent;
    }

    /**
     * Substitute Grade Mode
     * <p>
     * Lineage reference object : SHRGRDS_GMOD_CODE_STUDENT, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCodeStudent")
    public void setGmodCodeStudent(String gmodCodeStudent) {
        this.gmodCodeStudent = gmodCodeStudent;
    }

    public Shrgrd__2 withGmodCodeStudent(String gmodCodeStudent) {
        this.gmodCodeStudent = gmodCodeStudent;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgmodDesc")
    public String getStvgmodDesc() {
        return stvgmodDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgmodDesc")
    public void setStvgmodDesc(String stvgmodDesc) {
        this.stvgmodDesc = stvgmodDesc;
    }

    public Shrgrd__2 withStvgmodDesc(String stvgmodDesc) {
        this.stvgmodDesc = stvgmodDesc;
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

    public Shrgrd__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrgrd__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grdeCodeSubstitute");
        sb.append('=');
        sb.append(((this.grdeCodeSubstitute == null)?"<null>":this.grdeCodeSubstitute));
        sb.append(',');
        sb.append("stvgrdeAbbrevSubstitute");
        sb.append('=');
        sb.append(((this.stvgrdeAbbrevSubstitute == null)?"<null>":this.stvgrdeAbbrevSubstitute));
        sb.append(',');
        sb.append("gmodCodeStudent");
        sb.append('=');
        sb.append(((this.gmodCodeStudent == null)?"<null>":this.gmodCodeStudent));
        sb.append(',');
        sb.append("stvgmodDesc");
        sb.append('=');
        sb.append(((this.stvgmodDesc == null)?"<null>":this.stvgmodDesc));
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
        result = ((result* 31)+((this.grdeCodeSubstitute == null)? 0 :this.grdeCodeSubstitute.hashCode()));
        result = ((result* 31)+((this.stvgrdeAbbrevSubstitute == null)? 0 :this.stvgrdeAbbrevSubstitute.hashCode()));
        result = ((result* 31)+((this.stvgmodDesc == null)? 0 :this.stvgmodDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gmodCodeStudent == null)? 0 :this.gmodCodeStudent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrgrd__2) == false) {
            return false;
        }
        Shrgrd__2 rhs = ((Shrgrd__2) other);
        return ((((((this.grdeCodeSubstitute == rhs.grdeCodeSubstitute)||((this.grdeCodeSubstitute!= null)&&this.grdeCodeSubstitute.equals(rhs.grdeCodeSubstitute)))&&((this.stvgrdeAbbrevSubstitute == rhs.stvgrdeAbbrevSubstitute)||((this.stvgrdeAbbrevSubstitute!= null)&&this.stvgrdeAbbrevSubstitute.equals(rhs.stvgrdeAbbrevSubstitute))))&&((this.stvgmodDesc == rhs.stvgmodDesc)||((this.stvgmodDesc!= null)&&this.stvgmodDesc.equals(rhs.stvgmodDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gmodCodeStudent == rhs.gmodCodeStudent)||((this.gmodCodeStudent!= null)&&this.gmodCodeStudent.equals(rhs.gmodCodeStudent))));
    }

}
