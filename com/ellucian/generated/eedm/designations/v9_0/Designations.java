
package com.ellucian.generated.eedm.designations.v9_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Designations
 * <p>
 * A designated use of a donation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "sortTitle",
    "code",
    "description",
    "type",
    "status",
    "startOn",
    "endOn",
    "campus",
    "areaOfGiving",
    "purpose",
    "annual",
    "athletics",
    "funding",
    "rule",
    "restrictionClassification",
    "restrictions",
    "institutionUnits",
    "reporting"
})
@Generated("jsonschema2pojo")
public class Designations {

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
     * A global identifier of the designation.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of the designation.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the designation.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the designation.")
    private String title;
    /**
     * Sort Title
     * <p>
     * An alternate title of the designation used for sorting.
     * 
     */
    @JsonProperty("sortTitle")
    @JsonPropertyDescription("An alternate title of the designation used for sorting.")
    private String sortTitle;
    /**
     * Code
     * <p>
     * A code that represents the designation.
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that represents the designation.")
    private String code;
    /**
     * Description
     * <p>
     * A full description of the designation.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A full description of the designation.")
    private String description;
    /**
     * Type
     * <p>
     * The higher level categorization of the designation (e.g. Endowment, Scholarship, ...).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The higher level categorization of the designation (e.g. Endowment, Scholarship, ...).")
    private Type type;
    /**
     * Status
     * <p>
     * The status of the designation.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the designation.")
    private Designations.Status status;
    /**
     * Start Date
     * <p>
     * The date when the designation was first available for use.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the designation was first available for use.")
    private Object startOn;
    /**
     * End Date
     * <p>
     * The date when the designation was last available for use.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the designation was last available for use.")
    private Object endOn;
    /**
     * Campus
     * <p>
     * The campus specified for the designation.
     * 
     */
    @JsonProperty("campus")
    @JsonPropertyDescription("The campus specified for the designation.")
    private Object campus;
    /**
     * Area of Giving
     * <p>
     * The general area within the institution with which the designation is associated (e.g. "Student Financial Aid", "Library", "Research")
     * 
     */
    @JsonProperty("areaOfGiving")
    @JsonPropertyDescription("The general area within the institution with which the designation is associated (e.g. \"Student Financial Aid\", \"Library\", \"Research\")")
    private Object areaOfGiving;
    /**
     * Purpose
     * <p>
     * The general funding purpose that is associated with the designation (e.g. "Annual Scholarships", "Capital Improvements", "Faculty Support").
     * 
     */
    @JsonProperty("purpose")
    @JsonPropertyDescription("The general funding purpose that is associated with the designation (e.g. \"Annual Scholarships\", \"Capital Improvements\", \"Faculty Support\").")
    private Object purpose;
    /**
     * Annual
     * <p>
     * An indication of whether the designation is annual or not.
     * 
     */
    @JsonProperty("annual")
    @JsonPropertyDescription("An indication of whether the designation is annual or not.")
    private Object annual;
    /**
     * Athletics
     * <p>
     * An indication of whether the designation is related to athletics or not.
     * 
     */
    @JsonProperty("athletics")
    @JsonPropertyDescription("An indication of whether the designation is related to athletics or not.")
    private Object athletics;
    /**
     * Funding
     * <p>
     * The funding goal and current status for the designation.
     * 
     */
    @JsonProperty("funding")
    @JsonPropertyDescription("The funding goal and current status for the designation.")
    private Object funding;
    /**
     * Rule
     * <p>
     * The rule that is used to calculate totals for the designation.
     * 
     */
    @JsonProperty("rule")
    @JsonPropertyDescription("The rule that is used to calculate totals for the designation.")
    private Object rule;
    /**
     * Restriction Classification
     * <p>
     * A classification of the restrictions on the usage of funds associated with the designation.
     * 
     */
    @JsonProperty("restrictionClassification")
    @JsonPropertyDescription("A classification of the restrictions on the usage of funds associated with the designation.")
    private Object restrictionClassification;
    /**
     * Restrictions
     * <p>
     * Restrictions to the usage of funds associated with the designation.
     * 
     */
    @JsonProperty("restrictions")
    @JsonPropertyDescription("Restrictions to the usage of funds associated with the designation.")
    private List<Restriction> restrictions = new ArrayList<Restriction>();
    /**
     * Institution Units
     * <p>
     * The units of the educational institution (e.g., schools, divisions, departments)  associated with the designation
     * 
     */
    @JsonProperty("institutionUnits")
    @JsonPropertyDescription("The units of the educational institution (e.g., schools, divisions, departments)  associated with the designation")
    private List<InstitutionUnit> institutionUnits = new ArrayList<InstitutionUnit>();
    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    @JsonPropertyDescription("Properties required for governmental or other reporting.")
    private Reporting reporting;

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

    public Designations withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of the designation.
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
     * A global identifier of the designation.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Designations withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the designation.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the designation.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Designations withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Sort Title
     * <p>
     * An alternate title of the designation used for sorting.
     * 
     */
    @JsonProperty("sortTitle")
    public String getSortTitle() {
        return sortTitle;
    }

    /**
     * Sort Title
     * <p>
     * An alternate title of the designation used for sorting.
     * 
     */
    @JsonProperty("sortTitle")
    public void setSortTitle(String sortTitle) {
        this.sortTitle = sortTitle;
    }

    public Designations withSortTitle(String sortTitle) {
        this.sortTitle = sortTitle;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that represents the designation.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that represents the designation.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Designations withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * A full description of the designation.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A full description of the designation.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Designations withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * The higher level categorization of the designation (e.g. Endowment, Scholarship, ...).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The higher level categorization of the designation (e.g. Endowment, Scholarship, ...).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public Designations withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the designation.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Designations.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the designation.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Designations.Status status) {
        this.status = status;
    }

    public Designations withStatus(Designations.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date when the designation was first available for use.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date when the designation was first available for use.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Designations withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date when the designation was last available for use.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The date when the designation was last available for use.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Designations withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Campus
     * <p>
     * The campus specified for the designation.
     * 
     */
    @JsonProperty("campus")
    public Object getCampus() {
        return campus;
    }

    /**
     * Campus
     * <p>
     * The campus specified for the designation.
     * 
     */
    @JsonProperty("campus")
    public void setCampus(Object campus) {
        this.campus = campus;
    }

    public Designations withCampus(Object campus) {
        this.campus = campus;
        return this;
    }

    /**
     * Area of Giving
     * <p>
     * The general area within the institution with which the designation is associated (e.g. "Student Financial Aid", "Library", "Research")
     * 
     */
    @JsonProperty("areaOfGiving")
    public Object getAreaOfGiving() {
        return areaOfGiving;
    }

    /**
     * Area of Giving
     * <p>
     * The general area within the institution with which the designation is associated (e.g. "Student Financial Aid", "Library", "Research")
     * 
     */
    @JsonProperty("areaOfGiving")
    public void setAreaOfGiving(Object areaOfGiving) {
        this.areaOfGiving = areaOfGiving;
    }

    public Designations withAreaOfGiving(Object areaOfGiving) {
        this.areaOfGiving = areaOfGiving;
        return this;
    }

    /**
     * Purpose
     * <p>
     * The general funding purpose that is associated with the designation (e.g. "Annual Scholarships", "Capital Improvements", "Faculty Support").
     * 
     */
    @JsonProperty("purpose")
    public Object getPurpose() {
        return purpose;
    }

    /**
     * Purpose
     * <p>
     * The general funding purpose that is associated with the designation (e.g. "Annual Scholarships", "Capital Improvements", "Faculty Support").
     * 
     */
    @JsonProperty("purpose")
    public void setPurpose(Object purpose) {
        this.purpose = purpose;
    }

    public Designations withPurpose(Object purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Annual
     * <p>
     * An indication of whether the designation is annual or not.
     * 
     */
    @JsonProperty("annual")
    public Object getAnnual() {
        return annual;
    }

    /**
     * Annual
     * <p>
     * An indication of whether the designation is annual or not.
     * 
     */
    @JsonProperty("annual")
    public void setAnnual(Object annual) {
        this.annual = annual;
    }

    public Designations withAnnual(Object annual) {
        this.annual = annual;
        return this;
    }

    /**
     * Athletics
     * <p>
     * An indication of whether the designation is related to athletics or not.
     * 
     */
    @JsonProperty("athletics")
    public Object getAthletics() {
        return athletics;
    }

    /**
     * Athletics
     * <p>
     * An indication of whether the designation is related to athletics or not.
     * 
     */
    @JsonProperty("athletics")
    public void setAthletics(Object athletics) {
        this.athletics = athletics;
    }

    public Designations withAthletics(Object athletics) {
        this.athletics = athletics;
        return this;
    }

    /**
     * Funding
     * <p>
     * The funding goal and current status for the designation.
     * 
     */
    @JsonProperty("funding")
    public Object getFunding() {
        return funding;
    }

    /**
     * Funding
     * <p>
     * The funding goal and current status for the designation.
     * 
     */
    @JsonProperty("funding")
    public void setFunding(Object funding) {
        this.funding = funding;
    }

    public Designations withFunding(Object funding) {
        this.funding = funding;
        return this;
    }

    /**
     * Rule
     * <p>
     * The rule that is used to calculate totals for the designation.
     * 
     */
    @JsonProperty("rule")
    public Object getRule() {
        return rule;
    }

    /**
     * Rule
     * <p>
     * The rule that is used to calculate totals for the designation.
     * 
     */
    @JsonProperty("rule")
    public void setRule(Object rule) {
        this.rule = rule;
    }

    public Designations withRule(Object rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Restriction Classification
     * <p>
     * A classification of the restrictions on the usage of funds associated with the designation.
     * 
     */
    @JsonProperty("restrictionClassification")
    public Object getRestrictionClassification() {
        return restrictionClassification;
    }

    /**
     * Restriction Classification
     * <p>
     * A classification of the restrictions on the usage of funds associated with the designation.
     * 
     */
    @JsonProperty("restrictionClassification")
    public void setRestrictionClassification(Object restrictionClassification) {
        this.restrictionClassification = restrictionClassification;
    }

    public Designations withRestrictionClassification(Object restrictionClassification) {
        this.restrictionClassification = restrictionClassification;
        return this;
    }

    /**
     * Restrictions
     * <p>
     * Restrictions to the usage of funds associated with the designation.
     * 
     */
    @JsonProperty("restrictions")
    public List<Restriction> getRestrictions() {
        return restrictions;
    }

    /**
     * Restrictions
     * <p>
     * Restrictions to the usage of funds associated with the designation.
     * 
     */
    @JsonProperty("restrictions")
    public void setRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
    }

    public Designations withRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    /**
     * Institution Units
     * <p>
     * The units of the educational institution (e.g., schools, divisions, departments)  associated with the designation
     * 
     */
    @JsonProperty("institutionUnits")
    public List<InstitutionUnit> getInstitutionUnits() {
        return institutionUnits;
    }

    /**
     * Institution Units
     * <p>
     * The units of the educational institution (e.g., schools, divisions, departments)  associated with the designation
     * 
     */
    @JsonProperty("institutionUnits")
    public void setInstitutionUnits(List<InstitutionUnit> institutionUnits) {
        this.institutionUnits = institutionUnits;
    }

    public Designations withInstitutionUnits(List<InstitutionUnit> institutionUnits) {
        this.institutionUnits = institutionUnits;
        return this;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public Reporting getReporting() {
        return reporting;
    }

    /**
     * Reporting
     * <p>
     * Properties required for governmental or other reporting.
     * 
     */
    @JsonProperty("reporting")
    public void setReporting(Reporting reporting) {
        this.reporting = reporting;
    }

    public Designations withReporting(Reporting reporting) {
        this.reporting = reporting;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Designations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("sortTitle");
        sb.append('=');
        sb.append(((this.sortTitle == null)?"<null>":this.sortTitle));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("campus");
        sb.append('=');
        sb.append(((this.campus == null)?"<null>":this.campus));
        sb.append(',');
        sb.append("areaOfGiving");
        sb.append('=');
        sb.append(((this.areaOfGiving == null)?"<null>":this.areaOfGiving));
        sb.append(',');
        sb.append("purpose");
        sb.append('=');
        sb.append(((this.purpose == null)?"<null>":this.purpose));
        sb.append(',');
        sb.append("annual");
        sb.append('=');
        sb.append(((this.annual == null)?"<null>":this.annual));
        sb.append(',');
        sb.append("athletics");
        sb.append('=');
        sb.append(((this.athletics == null)?"<null>":this.athletics));
        sb.append(',');
        sb.append("funding");
        sb.append('=');
        sb.append(((this.funding == null)?"<null>":this.funding));
        sb.append(',');
        sb.append("rule");
        sb.append('=');
        sb.append(((this.rule == null)?"<null>":this.rule));
        sb.append(',');
        sb.append("restrictionClassification");
        sb.append('=');
        sb.append(((this.restrictionClassification == null)?"<null>":this.restrictionClassification));
        sb.append(',');
        sb.append("restrictions");
        sb.append('=');
        sb.append(((this.restrictions == null)?"<null>":this.restrictions));
        sb.append(',');
        sb.append("institutionUnits");
        sb.append('=');
        sb.append(((this.institutionUnits == null)?"<null>":this.institutionUnits));
        sb.append(',');
        sb.append("reporting");
        sb.append('=');
        sb.append(((this.reporting == null)?"<null>":this.reporting));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.funding == null)? 0 :this.funding.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.institutionUnits == null)? 0 :this.institutionUnits.hashCode()));
        result = ((result* 31)+((this.campus == null)? 0 :this.campus.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.rule == null)? 0 :this.rule.hashCode()));
        result = ((result* 31)+((this.restrictions == null)? 0 :this.restrictions.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.sortTitle == null)? 0 :this.sortTitle.hashCode()));
        result = ((result* 31)+((this.restrictionClassification == null)? 0 :this.restrictionClassification.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.annual == null)? 0 :this.annual.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.areaOfGiving == null)? 0 :this.areaOfGiving.hashCode()));
        result = ((result* 31)+((this.athletics == null)? 0 :this.athletics.hashCode()));
        result = ((result* 31)+((this.reporting == null)? 0 :this.reporting.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Designations) == false) {
            return false;
        }
        Designations rhs = ((Designations) other);
        return ((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.funding == rhs.funding)||((this.funding!= null)&&this.funding.equals(rhs.funding))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.institutionUnits == rhs.institutionUnits)||((this.institutionUnits!= null)&&this.institutionUnits.equals(rhs.institutionUnits))))&&((this.campus == rhs.campus)||((this.campus!= null)&&this.campus.equals(rhs.campus))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.rule == rhs.rule)||((this.rule!= null)&&this.rule.equals(rhs.rule))))&&((this.restrictions == rhs.restrictions)||((this.restrictions!= null)&&this.restrictions.equals(rhs.restrictions))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.sortTitle == rhs.sortTitle)||((this.sortTitle!= null)&&this.sortTitle.equals(rhs.sortTitle))))&&((this.restrictionClassification == rhs.restrictionClassification)||((this.restrictionClassification!= null)&&this.restrictionClassification.equals(rhs.restrictionClassification))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.annual == rhs.annual)||((this.annual!= null)&&this.annual.equals(rhs.annual))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.areaOfGiving == rhs.areaOfGiving)||((this.areaOfGiving!= null)&&this.areaOfGiving.equals(rhs.areaOfGiving))))&&((this.athletics == rhs.athletics)||((this.athletics!= null)&&this.athletics.equals(rhs.athletics))))&&((this.reporting == rhs.reporting)||((this.reporting!= null)&&this.reporting.equals(rhs.reporting))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the designation.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive");
        private final String value;
        private final static Map<String, Designations.Status> CONSTANTS = new HashMap<String, Designations.Status>();

        static {
            for (Designations.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Designations.Status fromValue(String value) {
            Designations.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
