
package com.ellucian.generated.eedm.student_academic_programs_submissions.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Admission Classification
 * <p>
 * The admission classification and/or the type typically captured upon admission to the program.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "admissionCategory"
})
@Generated("jsonschema2pojo")
public class AdmissionClassification {

    /**
     * Admission Category
     * <p>
     * The student's admission category (e.g. first-time, transfer, returning, freshman).
     * 
     */
    @JsonProperty("admissionCategory")
    @JsonPropertyDescription("The student's admission category (e.g. first-time, transfer, returning, freshman).")
    private Object admissionCategory;

    /**
     * Admission Category
     * <p>
     * The student's admission category (e.g. first-time, transfer, returning, freshman).
     * 
     */
    @JsonProperty("admissionCategory")
    public Object getAdmissionCategory() {
        return admissionCategory;
    }

    /**
     * Admission Category
     * <p>
     * The student's admission category (e.g. first-time, transfer, returning, freshman).
     * 
     */
    @JsonProperty("admissionCategory")
    public void setAdmissionCategory(Object admissionCategory) {
        this.admissionCategory = admissionCategory;
    }

    public AdmissionClassification withAdmissionCategory(Object admissionCategory) {
        this.admissionCategory = admissionCategory;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionClassification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("admissionCategory");
        sb.append('=');
        sb.append(((this.admissionCategory == null)?"<null>":this.admissionCategory));
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
        result = ((result* 31)+((this.admissionCategory == null)? 0 :this.admissionCategory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionClassification) == false) {
            return false;
        }
        AdmissionClassification rhs = ((AdmissionClassification) other);
        return ((this.admissionCategory == rhs.admissionCategory)||((this.admissionCategory!= null)&&this.admissionCategory.equals(rhs.admissionCategory)));
    }

}
