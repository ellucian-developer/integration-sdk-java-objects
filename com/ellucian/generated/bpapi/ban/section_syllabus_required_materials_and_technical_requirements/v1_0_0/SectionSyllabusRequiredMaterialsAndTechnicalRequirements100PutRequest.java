
package com.ellucian.generated.bpapi.ban.section_syllabus_required_materials_and_technical_requirements.v1_0_0;

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
    "technicalRequirement",
    "requiredMaterials",
    "crn",
    "termCode"
})
@Generated("jsonschema2pojo")
public class SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest {

    /**
     * Lineage reference object : SSRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    @JsonPropertyDescription("Lineage reference object : SSRSYTR_TECHNICAL_REQUIREMENT")
    private Object technicalRequirement;
    /**
     * Lineage reference object : SSRSYRM_REQUIRED_MATERIALS
     * 
     */
    @JsonProperty("requiredMaterials")
    @JsonPropertyDescription("Lineage reference object : SSRSYRM_REQUIRED_MATERIALS")
    private Object requiredMaterials;
    /**
     * CRN
     * <p>
     * Lineage reference object : crn
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : crn")
    private Object crn;
    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : termCode, Lookup lineage reference object : stvterm")
    private Object termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SSRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    public Object getTechnicalRequirement() {
        return technicalRequirement;
    }

    /**
     * Lineage reference object : SSRSYTR_TECHNICAL_REQUIREMENT
     * 
     */
    @JsonProperty("technicalRequirement")
    public void setTechnicalRequirement(Object technicalRequirement) {
        this.technicalRequirement = technicalRequirement;
    }

    public SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest withTechnicalRequirement(Object technicalRequirement) {
        this.technicalRequirement = technicalRequirement;
        return this;
    }

    /**
     * Lineage reference object : SSRSYRM_REQUIRED_MATERIALS
     * 
     */
    @JsonProperty("requiredMaterials")
    public Object getRequiredMaterials() {
        return requiredMaterials;
    }

    /**
     * Lineage reference object : SSRSYRM_REQUIRED_MATERIALS
     * 
     */
    @JsonProperty("requiredMaterials")
    public void setRequiredMaterials(Object requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
    }

    public SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest withRequiredMaterials(Object requiredMaterials) {
        this.requiredMaterials = requiredMaterials;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : crn
     * 
     */
    @JsonProperty("crn")
    public Object getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : crn
     * 
     */
    @JsonProperty("crn")
    public void setCrn(Object crn) {
        this.crn = crn;
    }

    public SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest withCrn(Object crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public Object getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(Object termCode) {
        this.termCode = termCode;
    }

    public SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest withTermCode(Object termCode) {
        this.termCode = termCode;
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

    public SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("technicalRequirement");
        sb.append('=');
        sb.append(((this.technicalRequirement == null)?"<null>":this.technicalRequirement));
        sb.append(',');
        sb.append("requiredMaterials");
        sb.append('=');
        sb.append(((this.requiredMaterials == null)?"<null>":this.requiredMaterials));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.technicalRequirement == null)? 0 :this.technicalRequirement.hashCode()));
        result = ((result* 31)+((this.requiredMaterials == null)? 0 :this.requiredMaterials.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest) == false) {
            return false;
        }
        SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest rhs = ((SectionSyllabusRequiredMaterialsAndTechnicalRequirements100PutRequest) other);
        return ((((((this.technicalRequirement == rhs.technicalRequirement)||((this.technicalRequirement!= null)&&this.technicalRequirement.equals(rhs.technicalRequirement)))&&((this.requiredMaterials == rhs.requiredMaterials)||((this.requiredMaterials!= null)&&this.requiredMaterials.equals(rhs.requiredMaterials))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
