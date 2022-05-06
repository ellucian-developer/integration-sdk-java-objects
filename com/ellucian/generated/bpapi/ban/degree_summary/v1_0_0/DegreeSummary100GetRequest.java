
package com.ellucian.generated.bpapi.ban.degree_summary.v1_0_0;

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
    "lfstCode",
    "campCode",
    "id",
    "degcCode",
    "program",
    "collCode",
    "stvtermTermCode",
    "majrCode",
    "levlCode"
})
@Generated("jsonschema2pojo")
public class DegreeSummary100GetRequest {

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : lfstCode, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    @JsonPropertyDescription("Lineage reference object : lfstCode, Lookup lineage reference object : gtvlfst")
    private Object lfstCode;
    /**
     * Campus
     * <p>
     * Lineage reference object : campCode, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    @JsonPropertyDescription("Lineage reference object : campCode, Lookup lineage reference object : stvcamp")
    private Object campCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Degree
     * <p>
     * Lineage reference object : degcCode, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    @JsonPropertyDescription("Lineage reference object : degcCode, Lookup lineage reference object : stvdegc")
    private Object degcCode;
    /**
     * Program
     * <p>
     * Lineage reference object : program, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : program, Lookup lineage reference object : smrprle")
    private Object program;
    /**
     * College
     * <p>
     * Lineage reference object : collCode, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : collCode, Lookup lineage reference object : stvcoll")
    private Object collCode;
    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    @JsonPropertyDescription("Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm")
    private Object stvtermTermCode;
    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : majrCode, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : majrCode, Lookup lineage reference object : stvmajr")
    private Object majrCode;
    /**
     * Level
     * <p>
     * Lineage reference object : levlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : levlCode, Lookup lineage reference object : stvlevl")
    private Object levlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : lfstCode, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public Object getLfstCode() {
        return lfstCode;
    }

    /**
     * Field of Study Type
     * <p>
     * Lineage reference object : lfstCode, Lookup lineage reference object : gtvlfst
     * 
     */
    @JsonProperty("lfstCode")
    public void setLfstCode(Object lfstCode) {
        this.lfstCode = lfstCode;
    }

    public DegreeSummary100GetRequest withLfstCode(Object lfstCode) {
        this.lfstCode = lfstCode;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : campCode, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public Object getCampCode() {
        return campCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : campCode, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("campCode")
    public void setCampCode(Object campCode) {
        this.campCode = campCode;
    }

    public DegreeSummary100GetRequest withCampCode(Object campCode) {
        this.campCode = campCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public DegreeSummary100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : degcCode, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public Object getDegcCode() {
        return degcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : degcCode, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(Object degcCode) {
        this.degcCode = degcCode;
    }

    public DegreeSummary100GetRequest withDegcCode(Object degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : program, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public Object getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : program, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(Object program) {
        this.program = program;
    }

    public DegreeSummary100GetRequest withProgram(Object program) {
        this.program = program;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : collCode, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public Object getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : collCode, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(Object collCode) {
        this.collCode = collCode;
    }

    public DegreeSummary100GetRequest withCollCode(Object collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public Object getStvtermTermCode() {
        return stvtermTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public DegreeSummary100GetRequest withStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
        return this;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : majrCode, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public Object getMajrCode() {
        return majrCode;
    }

    /**
     * Field of Study Code
     * <p>
     * Lineage reference object : majrCode, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(Object majrCode) {
        this.majrCode = majrCode;
    }

    public DegreeSummary100GetRequest withMajrCode(Object majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : levlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public Object getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : levlCode, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(Object levlCode) {
        this.levlCode = levlCode;
    }

    public DegreeSummary100GetRequest withLevlCode(Object levlCode) {
        this.levlCode = levlCode;
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

    public DegreeSummary100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DegreeSummary100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lfstCode");
        sb.append('=');
        sb.append(((this.lfstCode == null)?"<null>":this.lfstCode));
        sb.append(',');
        sb.append("campCode");
        sb.append('=');
        sb.append(((this.campCode == null)?"<null>":this.campCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        if ((other instanceof DegreeSummary100GetRequest) == false) {
            return false;
        }
        DegreeSummary100GetRequest rhs = ((DegreeSummary100GetRequest) other);
        return (((((((((((this.lfstCode == rhs.lfstCode)||((this.lfstCode!= null)&&this.lfstCode.equals(rhs.lfstCode)))&&((this.campCode == rhs.campCode)||((this.campCode!= null)&&this.campCode.equals(rhs.campCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))));
    }

}
