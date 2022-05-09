
package com.ellucian.generated.eedm.apply_prospect_inquiries.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Apply Prospect Inquiries
 * <p>
 * Inquiries made by prospects to an institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "academicLevel",
    "academicPrograms",
    "entryAcademicPeriod",
    "admissionPopulation",
    "site",
    "prospect"
})
@Generated("jsonschema2pojo")
public class ApplyProspectInquiries {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the apply prospect inquiry.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the apply prospect inquiry.")
    private String id;
    /**
     * Academic Level
     * <p>
     * The academic level in which the prospect has shown interest in the inquiry.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level in which the prospect has shown interest in the inquiry.")
    private Object academicLevel;
    /**
     * Academic Program
     * <p>
     * The academic program in which the prospect has shown interest in the inquiry.
     * 
     */
    @JsonProperty("academicPrograms")
    @JsonPropertyDescription("The academic program in which the prospect has shown interest in the inquiry.")
    private List<AcademicProgram> academicPrograms = new ArrayList<AcademicProgram>();
    /**
     * Entry Academic Period
     * <p>
     * The academic period the prospect is interested in beginning attendance at the institution.
     * 
     */
    @JsonProperty("entryAcademicPeriod")
    @JsonPropertyDescription("The academic period the prospect is interested in beginning attendance at the institution.")
    private Object entryAcademicPeriod;
    /**
     * Admission Population
     * <p>
     * The admission population the prospect would be included within at the institution if they attend the institution.
     * 
     */
    @JsonProperty("admissionPopulation")
    @JsonPropertyDescription("The admission population the prospect would be included within at the institution if they attend the institution.")
    private Object admissionPopulation;
    /**
     * Site
     * <p>
     * The institution site (campus) the prospect is considering in the inquiry.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The institution site (campus) the prospect is considering in the inquiry.")
    private Object site;
    /**
     * Prospect
     * <p>
     * The prospect who made the inquiry.
     * (Required)
     * 
     */
    @JsonProperty("prospect")
    @JsonPropertyDescription("The prospect who made the inquiry.")
    private Prospect prospect;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public ApplyProspectInquiries withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the apply prospect inquiry.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the apply prospect inquiry.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApplyProspectInquiries withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level in which the prospect has shown interest in the inquiry.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level in which the prospect has shown interest in the inquiry.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public ApplyProspectInquiries withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Academic Program
     * <p>
     * The academic program in which the prospect has shown interest in the inquiry.
     * 
     */
    @JsonProperty("academicPrograms")
    public List<AcademicProgram> getAcademicPrograms() {
        return academicPrograms;
    }

    /**
     * Academic Program
     * <p>
     * The academic program in which the prospect has shown interest in the inquiry.
     * 
     */
    @JsonProperty("academicPrograms")
    public void setAcademicPrograms(List<AcademicProgram> academicPrograms) {
        this.academicPrograms = academicPrograms;
    }

    public ApplyProspectInquiries withAcademicPrograms(List<AcademicProgram> academicPrograms) {
        this.academicPrograms = academicPrograms;
        return this;
    }

    /**
     * Entry Academic Period
     * <p>
     * The academic period the prospect is interested in beginning attendance at the institution.
     * 
     */
    @JsonProperty("entryAcademicPeriod")
    public Object getEntryAcademicPeriod() {
        return entryAcademicPeriod;
    }

    /**
     * Entry Academic Period
     * <p>
     * The academic period the prospect is interested in beginning attendance at the institution.
     * 
     */
    @JsonProperty("entryAcademicPeriod")
    public void setEntryAcademicPeriod(Object entryAcademicPeriod) {
        this.entryAcademicPeriod = entryAcademicPeriod;
    }

    public ApplyProspectInquiries withEntryAcademicPeriod(Object entryAcademicPeriod) {
        this.entryAcademicPeriod = entryAcademicPeriod;
        return this;
    }

    /**
     * Admission Population
     * <p>
     * The admission population the prospect would be included within at the institution if they attend the institution.
     * 
     */
    @JsonProperty("admissionPopulation")
    public Object getAdmissionPopulation() {
        return admissionPopulation;
    }

    /**
     * Admission Population
     * <p>
     * The admission population the prospect would be included within at the institution if they attend the institution.
     * 
     */
    @JsonProperty("admissionPopulation")
    public void setAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
    }

    public ApplyProspectInquiries withAdmissionPopulation(Object admissionPopulation) {
        this.admissionPopulation = admissionPopulation;
        return this;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) the prospect is considering in the inquiry.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The institution site (campus) the prospect is considering in the inquiry.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public ApplyProspectInquiries withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Prospect
     * <p>
     * The prospect who made the inquiry.
     * (Required)
     * 
     */
    @JsonProperty("prospect")
    public Prospect getProspect() {
        return prospect;
    }

    /**
     * Prospect
     * <p>
     * The prospect who made the inquiry.
     * (Required)
     * 
     */
    @JsonProperty("prospect")
    public void setProspect(Prospect prospect) {
        this.prospect = prospect;
    }

    public ApplyProspectInquiries withProspect(Prospect prospect) {
        this.prospect = prospect;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplyProspectInquiries.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("academicPrograms");
        sb.append('=');
        sb.append(((this.academicPrograms == null)?"<null>":this.academicPrograms));
        sb.append(',');
        sb.append("entryAcademicPeriod");
        sb.append('=');
        sb.append(((this.entryAcademicPeriod == null)?"<null>":this.entryAcademicPeriod));
        sb.append(',');
        sb.append("admissionPopulation");
        sb.append('=');
        sb.append(((this.admissionPopulation == null)?"<null>":this.admissionPopulation));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("prospect");
        sb.append('=');
        sb.append(((this.prospect == null)?"<null>":this.prospect));
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
        result = ((result* 31)+((this.prospect == null)? 0 :this.prospect.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.academicPrograms == null)? 0 :this.academicPrograms.hashCode()));
        result = ((result* 31)+((this.admissionPopulation == null)? 0 :this.admissionPopulation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.entryAcademicPeriod == null)? 0 :this.entryAcademicPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplyProspectInquiries) == false) {
            return false;
        }
        ApplyProspectInquiries rhs = ((ApplyProspectInquiries) other);
        return (((((((((this.prospect == rhs.prospect)||((this.prospect!= null)&&this.prospect.equals(rhs.prospect)))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.academicPrograms == rhs.academicPrograms)||((this.academicPrograms!= null)&&this.academicPrograms.equals(rhs.academicPrograms))))&&((this.admissionPopulation == rhs.admissionPopulation)||((this.admissionPopulation!= null)&&this.admissionPopulation.equals(rhs.admissionPopulation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.entryAcademicPeriod == rhs.entryAcademicPeriod)||((this.entryAcademicPeriod!= null)&&this.entryAcademicPeriod.equals(rhs.entryAcademicPeriod))));
    }

}
