
package com.ellucian.generated.eedm.giving_societies.v8_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Qualifications
 * <p>
 * The qualifying attributes of the giving society.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rule",
    "constituentTypes",
    "reunionYears",
    "designationTypes",
    "designations"
})
@Generated("jsonschema2pojo")
public class Qualifications {

    /**
     * Rule
     * <p>
     * The rules used to determine eligibility for the society.
     * 
     */
    @JsonProperty("rule")
    @JsonPropertyDescription("The rules used to determine eligibility for the society.")
    private Object rule;
    /**
     * Constituent Types
     * <p>
     * The types of constituents eligible for membership in the society.
     * 
     */
    @JsonProperty("constituentTypes")
    @JsonPropertyDescription("The types of constituents eligible for membership in the society.")
    private List<ConstituentType> constituentTypes = new ArrayList<ConstituentType>();
    /**
     * Reunion Years
     * <p>
     * The list of reunion years that determine the constituent's eligibly for membership in the society.
     * 
     */
    @JsonProperty("reunionYears")
    @JsonPropertyDescription("The list of reunion years that determine the constituent's eligibly for membership in the society.")
    private List<String> reunionYears = new ArrayList<String>();
    /**
     * Designation Types
     * <p>
     * The designation types of contributions that are considered for the eligibility in the society.
     * 
     */
    @JsonProperty("designationTypes")
    @JsonPropertyDescription("The designation types of contributions that are considered for the eligibility in the society.")
    private List<DesignationType> designationTypes = new ArrayList<DesignationType>();
    /**
     * Designations
     * <p>
     * The designations of contributions that are considered for the eligibility in the society.
     * 
     */
    @JsonProperty("designations")
    @JsonPropertyDescription("The designations of contributions that are considered for the eligibility in the society.")
    private List<Designation> designations = new ArrayList<Designation>();

    /**
     * Rule
     * <p>
     * The rules used to determine eligibility for the society.
     * 
     */
    @JsonProperty("rule")
    public Object getRule() {
        return rule;
    }

    /**
     * Rule
     * <p>
     * The rules used to determine eligibility for the society.
     * 
     */
    @JsonProperty("rule")
    public void setRule(Object rule) {
        this.rule = rule;
    }

    public Qualifications withRule(Object rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Constituent Types
     * <p>
     * The types of constituents eligible for membership in the society.
     * 
     */
    @JsonProperty("constituentTypes")
    public List<ConstituentType> getConstituentTypes() {
        return constituentTypes;
    }

    /**
     * Constituent Types
     * <p>
     * The types of constituents eligible for membership in the society.
     * 
     */
    @JsonProperty("constituentTypes")
    public void setConstituentTypes(List<ConstituentType> constituentTypes) {
        this.constituentTypes = constituentTypes;
    }

    public Qualifications withConstituentTypes(List<ConstituentType> constituentTypes) {
        this.constituentTypes = constituentTypes;
        return this;
    }

    /**
     * Reunion Years
     * <p>
     * The list of reunion years that determine the constituent's eligibly for membership in the society.
     * 
     */
    @JsonProperty("reunionYears")
    public List<String> getReunionYears() {
        return reunionYears;
    }

    /**
     * Reunion Years
     * <p>
     * The list of reunion years that determine the constituent's eligibly for membership in the society.
     * 
     */
    @JsonProperty("reunionYears")
    public void setReunionYears(List<String> reunionYears) {
        this.reunionYears = reunionYears;
    }

    public Qualifications withReunionYears(List<String> reunionYears) {
        this.reunionYears = reunionYears;
        return this;
    }

    /**
     * Designation Types
     * <p>
     * The designation types of contributions that are considered for the eligibility in the society.
     * 
     */
    @JsonProperty("designationTypes")
    public List<DesignationType> getDesignationTypes() {
        return designationTypes;
    }

    /**
     * Designation Types
     * <p>
     * The designation types of contributions that are considered for the eligibility in the society.
     * 
     */
    @JsonProperty("designationTypes")
    public void setDesignationTypes(List<DesignationType> designationTypes) {
        this.designationTypes = designationTypes;
    }

    public Qualifications withDesignationTypes(List<DesignationType> designationTypes) {
        this.designationTypes = designationTypes;
        return this;
    }

    /**
     * Designations
     * <p>
     * The designations of contributions that are considered for the eligibility in the society.
     * 
     */
    @JsonProperty("designations")
    public List<Designation> getDesignations() {
        return designations;
    }

    /**
     * Designations
     * <p>
     * The designations of contributions that are considered for the eligibility in the society.
     * 
     */
    @JsonProperty("designations")
    public void setDesignations(List<Designation> designations) {
        this.designations = designations;
    }

    public Qualifications withDesignations(List<Designation> designations) {
        this.designations = designations;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Qualifications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rule");
        sb.append('=');
        sb.append(((this.rule == null)?"<null>":this.rule));
        sb.append(',');
        sb.append("constituentTypes");
        sb.append('=');
        sb.append(((this.constituentTypes == null)?"<null>":this.constituentTypes));
        sb.append(',');
        sb.append("reunionYears");
        sb.append('=');
        sb.append(((this.reunionYears == null)?"<null>":this.reunionYears));
        sb.append(',');
        sb.append("designationTypes");
        sb.append('=');
        sb.append(((this.designationTypes == null)?"<null>":this.designationTypes));
        sb.append(',');
        sb.append("designations");
        sb.append('=');
        sb.append(((this.designations == null)?"<null>":this.designations));
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
        result = ((result* 31)+((this.constituentTypes == null)? 0 :this.constituentTypes.hashCode()));
        result = ((result* 31)+((this.rule == null)? 0 :this.rule.hashCode()));
        result = ((result* 31)+((this.designationTypes == null)? 0 :this.designationTypes.hashCode()));
        result = ((result* 31)+((this.reunionYears == null)? 0 :this.reunionYears.hashCode()));
        result = ((result* 31)+((this.designations == null)? 0 :this.designations.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Qualifications) == false) {
            return false;
        }
        Qualifications rhs = ((Qualifications) other);
        return ((((((this.constituentTypes == rhs.constituentTypes)||((this.constituentTypes!= null)&&this.constituentTypes.equals(rhs.constituentTypes)))&&((this.rule == rhs.rule)||((this.rule!= null)&&this.rule.equals(rhs.rule))))&&((this.designationTypes == rhs.designationTypes)||((this.designationTypes!= null)&&this.designationTypes.equals(rhs.designationTypes))))&&((this.reunionYears == rhs.reunionYears)||((this.reunionYears!= null)&&this.reunionYears.equals(rhs.reunionYears))))&&((this.designations == rhs.designations)||((this.designations!= null)&&this.designations.equals(rhs.designations))));
    }

}
