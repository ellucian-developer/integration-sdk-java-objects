
package com.ellucian.generated.bpapi.ban.gradable_component_definition_subcomponent.v1_0_0;

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
    "bestOfComp",
    "rolled",
    "subsetOfComp",
    "gradeScaleDescription",
    "gschName"
})
@Generated("jsonschema2pojo")
public class Ssbsect__1 {

    /**
     * Best Of
     * <p>
     * Lineage reference object : SSBSECT_BEST_OF_COMP
     * 
     */
    @JsonProperty("bestOfComp")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_BEST_OF_COMP")
    private Double bestOfComp;
    @JsonProperty("rolled")
    private String rolled;
    /**
     * Subset Of
     * <p>
     * Lineage reference object : SSBSECT_SUBSET_OF_COMP
     * 
     */
    @JsonProperty("subsetOfComp")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_SUBSET_OF_COMP")
    private Double subsetOfComp;
    @JsonProperty("gradeScaleDescription")
    private String gradeScaleDescription;
    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SSBSECT_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * 
     */
    @JsonProperty("gschName")
    @JsonPropertyDescription("Lineage reference object : SSBSECT_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse")
    private String gschName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Best Of
     * <p>
     * Lineage reference object : SSBSECT_BEST_OF_COMP
     * 
     */
    @JsonProperty("bestOfComp")
    public Double getBestOfComp() {
        return bestOfComp;
    }

    /**
     * Best Of
     * <p>
     * Lineage reference object : SSBSECT_BEST_OF_COMP
     * 
     */
    @JsonProperty("bestOfComp")
    public void setBestOfComp(Double bestOfComp) {
        this.bestOfComp = bestOfComp;
    }

    public Ssbsect__1 withBestOfComp(Double bestOfComp) {
        this.bestOfComp = bestOfComp;
        return this;
    }

    @JsonProperty("rolled")
    public String getRolled() {
        return rolled;
    }

    @JsonProperty("rolled")
    public void setRolled(String rolled) {
        this.rolled = rolled;
    }

    public Ssbsect__1 withRolled(String rolled) {
        this.rolled = rolled;
        return this;
    }

    /**
     * Subset Of
     * <p>
     * Lineage reference object : SSBSECT_SUBSET_OF_COMP
     * 
     */
    @JsonProperty("subsetOfComp")
    public Double getSubsetOfComp() {
        return subsetOfComp;
    }

    /**
     * Subset Of
     * <p>
     * Lineage reference object : SSBSECT_SUBSET_OF_COMP
     * 
     */
    @JsonProperty("subsetOfComp")
    public void setSubsetOfComp(Double subsetOfComp) {
        this.subsetOfComp = subsetOfComp;
    }

    public Ssbsect__1 withSubsetOfComp(Double subsetOfComp) {
        this.subsetOfComp = subsetOfComp;
        return this;
    }

    @JsonProperty("gradeScaleDescription")
    public String getGradeScaleDescription() {
        return gradeScaleDescription;
    }

    @JsonProperty("gradeScaleDescription")
    public void setGradeScaleDescription(String gradeScaleDescription) {
        this.gradeScaleDescription = gradeScaleDescription;
    }

    public Ssbsect__1 withGradeScaleDescription(String gradeScaleDescription) {
        this.gradeScaleDescription = gradeScaleDescription;
        return this;
    }

    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SSBSECT_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * 
     */
    @JsonProperty("gschName")
    public String getGschName() {
        return gschName;
    }

    /**
     * Grade Scale
     * <p>
     * Lineage reference object : SSBSECT_GSCH_NAME, Lookup lineage reference object : shbgsch,ssbsect,scbcrse,scbcrse
     * 
     */
    @JsonProperty("gschName")
    public void setGschName(String gschName) {
        this.gschName = gschName;
    }

    public Ssbsect__1 withGschName(String gschName) {
        this.gschName = gschName;
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

    public Ssbsect__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssbsect__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bestOfComp");
        sb.append('=');
        sb.append(((this.bestOfComp == null)?"<null>":this.bestOfComp));
        sb.append(',');
        sb.append("rolled");
        sb.append('=');
        sb.append(((this.rolled == null)?"<null>":this.rolled));
        sb.append(',');
        sb.append("subsetOfComp");
        sb.append('=');
        sb.append(((this.subsetOfComp == null)?"<null>":this.subsetOfComp));
        sb.append(',');
        sb.append("gradeScaleDescription");
        sb.append('=');
        sb.append(((this.gradeScaleDescription == null)?"<null>":this.gradeScaleDescription));
        sb.append(',');
        sb.append("gschName");
        sb.append('=');
        sb.append(((this.gschName == null)?"<null>":this.gschName));
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
        result = ((result* 31)+((this.bestOfComp == null)? 0 :this.bestOfComp.hashCode()));
        result = ((result* 31)+((this.rolled == null)? 0 :this.rolled.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subsetOfComp == null)? 0 :this.subsetOfComp.hashCode()));
        result = ((result* 31)+((this.gradeScaleDescription == null)? 0 :this.gradeScaleDescription.hashCode()));
        result = ((result* 31)+((this.gschName == null)? 0 :this.gschName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssbsect__1) == false) {
            return false;
        }
        Ssbsect__1 rhs = ((Ssbsect__1) other);
        return (((((((this.bestOfComp == rhs.bestOfComp)||((this.bestOfComp!= null)&&this.bestOfComp.equals(rhs.bestOfComp)))&&((this.rolled == rhs.rolled)||((this.rolled!= null)&&this.rolled.equals(rhs.rolled))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subsetOfComp == rhs.subsetOfComp)||((this.subsetOfComp!= null)&&this.subsetOfComp.equals(rhs.subsetOfComp))))&&((this.gradeScaleDescription == rhs.gradeScaleDescription)||((this.gradeScaleDescription!= null)&&this.gradeScaleDescription.equals(rhs.gradeScaleDescription))))&&((this.gschName == rhs.gschName)||((this.gschName!= null)&&this.gschName.equals(rhs.gschName))));
    }

}
