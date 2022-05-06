
package com.ellucian.generated.bpapi.ban.degree_summary.v1_0_0;

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
    "id",
    "levlCode",
    "campCode",
    "collCode",
    "degcCode",
    "stvtermTermCode",
    "program",
    "lfstCode",
    "majrCode"
})
@Generated("jsonschema2pojo")
public class DegreeSummary100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("levlCode")
    private String levlCode;
    @JsonProperty("campCode")
    private String campCode;
    @JsonProperty("collCode")
    private String collCode;
    @JsonProperty("degcCode")
    private String degcCode;
    @JsonProperty("stvtermTermCode")
    private String stvtermTermCode;
    @JsonProperty("program")
    private String program;
    @JsonProperty("lfstCode")
    private String lfstCode;
    @JsonProperty("majrCode")
    private String majrCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public DegreeSummary100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public DegreeSummary100QapiPost withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    @JsonProperty("campCode")
    public String getCampCode() {
        return campCode;
    }

    @JsonProperty("campCode")
    public void setCampCode(String campCode) {
        this.campCode = campCode;
    }

    public DegreeSummary100QapiPost withCampCode(String campCode) {
        this.campCode = campCode;
        return this;
    }

    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public DegreeSummary100QapiPost withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public DegreeSummary100QapiPost withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    @JsonProperty("stvtermTermCode")
    public String getStvtermTermCode() {
        return stvtermTermCode;
    }

    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(String stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public DegreeSummary100QapiPost withStvtermTermCode(String stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
        return this;
    }

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public DegreeSummary100QapiPost withProgram(String program) {
        this.program = program;
        return this;
    }

    @JsonProperty("lfstCode")
    public String getLfstCode() {
        return lfstCode;
    }

    @JsonProperty("lfstCode")
    public void setLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
    }

    public DegreeSummary100QapiPost withLfstCode(String lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public DegreeSummary100QapiPost withMajrCode(String majrCode) {
        this.majrCode = majrCode;
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

    public DegreeSummary100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DegreeSummary100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
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
        result = ((result* 31)+((this.lfstCode == null)? 0 :this.lfstCode.hashCode()));
        result = ((result* 31)+((this.campCode == null)? 0 :this.campCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DegreeSummary100QapiPost) == false) {
            return false;
        }
        DegreeSummary100QapiPost rhs = ((DegreeSummary100QapiPost) other);
        return (((((((((((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode)))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
