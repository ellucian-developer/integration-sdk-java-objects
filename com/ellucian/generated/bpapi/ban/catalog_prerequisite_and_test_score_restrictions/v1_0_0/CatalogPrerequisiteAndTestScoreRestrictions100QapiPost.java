
package com.ellucian.generated.bpapi.ban.catalog_prerequisite_and_test_score_restrictions.v1_0_0;

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
    "program",
    "keyblckTermCode"
})
@Generated("jsonschema2pojo")
public class CatalogPrerequisiteAndTestScoreRestrictions100QapiPost {

    @JsonProperty("program")
    private String program;
    @JsonProperty("keyblckTermCode")
    private String keyblckTermCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100QapiPost withProgram(String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("keyblckTermCode")
    public String getKeyblckTermCode() {
        return keyblckTermCode;
    }

    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100QapiPost withKeyblckTermCode(String keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CatalogPrerequisiteAndTestScoreRestrictions100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
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
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CatalogPrerequisiteAndTestScoreRestrictions100QapiPost) == false) {
            return false;
        }
        CatalogPrerequisiteAndTestScoreRestrictions100QapiPost rhs = ((CatalogPrerequisiteAndTestScoreRestrictions100QapiPost) other);
        return ((((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode)))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
