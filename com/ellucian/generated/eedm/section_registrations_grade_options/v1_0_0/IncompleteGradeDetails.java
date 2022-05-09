
package com.ellucian.generated.eedm.section_registrations_grade_options.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Incomplete Grade Details
 * <p>
 * The incomplete grade details associated with the grade.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "finalGradeDefault",
    "finalGradeDefaultOverridability",
    "extensionDateDefault"
})
@Generated("jsonschema2pojo")
public class IncompleteGradeDetails {

    /**
     * Final Grade Default
     * <p>
     * The default final grade to be assigned to this section registration when extension date is passed.
     * 
     */
    @JsonProperty("finalGradeDefault")
    @JsonPropertyDescription("The default final grade to be assigned to this section registration when extension date is passed.")
    private Object finalGradeDefault;
    /**
     * Final Grade Default Overridability
     * <p>
     * An indicator whether the instructor may override the default final grade.
     * 
     */
    @JsonProperty("finalGradeDefaultOverridability")
    @JsonPropertyDescription("An indicator whether the instructor may override the default final grade.")
    private Object finalGradeDefaultOverridability;
    /**
     * Extension Date Default
     * <p>
     * The default extension date associated with the incomplete grade.
     * 
     */
    @JsonProperty("extensionDateDefault")
    @JsonPropertyDescription("The default extension date associated with the incomplete grade.")
    private Object extensionDateDefault;

    /**
     * Final Grade Default
     * <p>
     * The default final grade to be assigned to this section registration when extension date is passed.
     * 
     */
    @JsonProperty("finalGradeDefault")
    public Object getFinalGradeDefault() {
        return finalGradeDefault;
    }

    /**
     * Final Grade Default
     * <p>
     * The default final grade to be assigned to this section registration when extension date is passed.
     * 
     */
    @JsonProperty("finalGradeDefault")
    public void setFinalGradeDefault(Object finalGradeDefault) {
        this.finalGradeDefault = finalGradeDefault;
    }

    public IncompleteGradeDetails withFinalGradeDefault(Object finalGradeDefault) {
        this.finalGradeDefault = finalGradeDefault;
        return this;
    }

    /**
     * Final Grade Default Overridability
     * <p>
     * An indicator whether the instructor may override the default final grade.
     * 
     */
    @JsonProperty("finalGradeDefaultOverridability")
    public Object getFinalGradeDefaultOverridability() {
        return finalGradeDefaultOverridability;
    }

    /**
     * Final Grade Default Overridability
     * <p>
     * An indicator whether the instructor may override the default final grade.
     * 
     */
    @JsonProperty("finalGradeDefaultOverridability")
    public void setFinalGradeDefaultOverridability(Object finalGradeDefaultOverridability) {
        this.finalGradeDefaultOverridability = finalGradeDefaultOverridability;
    }

    public IncompleteGradeDetails withFinalGradeDefaultOverridability(Object finalGradeDefaultOverridability) {
        this.finalGradeDefaultOverridability = finalGradeDefaultOverridability;
        return this;
    }

    /**
     * Extension Date Default
     * <p>
     * The default extension date associated with the incomplete grade.
     * 
     */
    @JsonProperty("extensionDateDefault")
    public Object getExtensionDateDefault() {
        return extensionDateDefault;
    }

    /**
     * Extension Date Default
     * <p>
     * The default extension date associated with the incomplete grade.
     * 
     */
    @JsonProperty("extensionDateDefault")
    public void setExtensionDateDefault(Object extensionDateDefault) {
        this.extensionDateDefault = extensionDateDefault;
    }

    public IncompleteGradeDetails withExtensionDateDefault(Object extensionDateDefault) {
        this.extensionDateDefault = extensionDateDefault;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IncompleteGradeDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finalGradeDefault");
        sb.append('=');
        sb.append(((this.finalGradeDefault == null)?"<null>":this.finalGradeDefault));
        sb.append(',');
        sb.append("finalGradeDefaultOverridability");
        sb.append('=');
        sb.append(((this.finalGradeDefaultOverridability == null)?"<null>":this.finalGradeDefaultOverridability));
        sb.append(',');
        sb.append("extensionDateDefault");
        sb.append('=');
        sb.append(((this.extensionDateDefault == null)?"<null>":this.extensionDateDefault));
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
        result = ((result* 31)+((this.finalGradeDefault == null)? 0 :this.finalGradeDefault.hashCode()));
        result = ((result* 31)+((this.finalGradeDefaultOverridability == null)? 0 :this.finalGradeDefaultOverridability.hashCode()));
        result = ((result* 31)+((this.extensionDateDefault == null)? 0 :this.extensionDateDefault.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IncompleteGradeDetails) == false) {
            return false;
        }
        IncompleteGradeDetails rhs = ((IncompleteGradeDetails) other);
        return ((((this.finalGradeDefault == rhs.finalGradeDefault)||((this.finalGradeDefault!= null)&&this.finalGradeDefault.equals(rhs.finalGradeDefault)))&&((this.finalGradeDefaultOverridability == rhs.finalGradeDefaultOverridability)||((this.finalGradeDefaultOverridability!= null)&&this.finalGradeDefaultOverridability.equals(rhs.finalGradeDefaultOverridability))))&&((this.extensionDateDefault == rhs.extensionDateDefault)||((this.extensionDateDefault!= null)&&this.extensionDateDefault.equals(rhs.extensionDateDefault))));
    }

}
