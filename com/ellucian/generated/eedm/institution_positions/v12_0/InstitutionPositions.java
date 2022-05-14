
package com.ellucian.generated.eedm.institution_positions.v12_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Institution Positions
 * <p>
 * A detailed description of the positions at an institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "campus",
    "departments",
    "accountingStringAllocations",
    "status",
    "hoursPerPeriod",
    "fullTimeEquivalent",
    "bargainingUnit",
    "reportsTo",
    "exemptionType",
    "compensation",
    "startOn",
    "endOn",
    "authorizedOn",
    "classification"
})
@Generated("jsonschema2pojo")
public class InstitutionPositions {

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
     * The global identifier of the institution position.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the institution position.")
    private String id;
    /**
     * Title
     * <p>
     * The title of the institution position.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of the institution position.")
    private String title;
    /**
     * Description
     * <p>
     * The description of the institution position.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the institution position.")
    private String description;
    /**
     * Code
     * <p>
     * A code that may be used to identify the institution position.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that may be used to identify the institution position.")
    private String code;
    /**
     * Campus
     * <p>
     * The physical location of the institution position.
     * 
     */
    @JsonProperty("campus")
    @JsonPropertyDescription("The physical location of the institution position.")
    private Object campus;
    /**
     * Departments
     * <p>
     * The departments or organizations of the institution to which the position belongs.
     * 
     */
    @JsonProperty("departments")
    @JsonPropertyDescription("The departments or organizations of the institution to which the position belongs.")
    private List<Department> departments = new ArrayList<Department>();
    /**
     * Accounting String Allocations
     * <p>
     * The accounting strings with allocated percentages associated with the position.
     * 
     */
    @JsonProperty("accountingStringAllocations")
    @JsonPropertyDescription("The accounting strings with allocated percentages associated with the position.")
    private List<AccountingStringAllocation> accountingStringAllocations = new ArrayList<AccountingStringAllocation>();
    /**
     * Status
     * <p>
     * The status of the position (e.g. active, frozen, cancelled, inactive).
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the position (e.g. active, frozen, cancelled, inactive).")
    private InstitutionPositions.Status status;
    /**
     * Hours Per Period
     * <p>
     * The number of hours of work in specified time periods.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    @JsonPropertyDescription("The number of hours of work in specified time periods.")
    private List<HoursPerPeriod> hoursPerPeriod = new ArrayList<HoursPerPeriod>();
    /**
     * Full Time Equivalent
     * <p>
     * The ratio of hours of work for the position to the hours of work expected of a full-time employee.
     * 
     */
    @JsonProperty("fullTimeEquivalent")
    @JsonPropertyDescription("The ratio of hours of work for the position to the hours of work expected of a full-time employee.")
    private Object fullTimeEquivalent;
    /**
     * Bargaining Unit
     * <p>
     * The group or union associated with the position.
     * 
     */
    @JsonProperty("bargainingUnit")
    @JsonPropertyDescription("The group or union associated with the position.")
    private Object bargainingUnit;
    /**
     * Reports To
     * <p>
     * The positions to which this position reports.
     * 
     */
    @JsonProperty("reportsTo")
    @JsonPropertyDescription("The positions to which this position reports.")
    private List<ReportsTo> reportsTo = new ArrayList<ReportsTo>();
    /**
     * Exemption Type
     * <p>
     * An indicator if the position is exempt or non-exempt.
     * 
     */
    @JsonProperty("exemptionType")
    @JsonPropertyDescription("An indicator if the position is exempt or non-exempt.")
    private Object exemptionType;
    /**
     * Compensation
     * <p>
     * The salary or wages awarded for the position.
     * 
     */
    @JsonProperty("compensation")
    @JsonPropertyDescription("The salary or wages awarded for the position.")
    private Object compensation;
    /**
     * Start On
     * <p>
     * The date when the position is first available.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when the position is first available.")
    private String startOn;
    /**
     * End On
     * <p>
     * The date when the position is last available.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when the position is last available.")
    private Object endOn;
    /**
     * Authorized On
     * <p>
     * The date when the position is authorized.
     * 
     */
    @JsonProperty("authorizedOn")
    @JsonPropertyDescription("The date when the position is authorized.")
    private Object authorizedOn;
    /**
     * Classification
     * <p>
     * The classification associated with the position.
     * 
     */
    @JsonProperty("classification")
    @JsonPropertyDescription("The classification associated with the position.")
    private Object classification;

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

    public InstitutionPositions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the institution position.
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
     * The global identifier of the institution position.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public InstitutionPositions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The title of the institution position.
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
     * The title of the institution position.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public InstitutionPositions withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the institution position.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the institution position.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public InstitutionPositions withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the institution position.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that may be used to identify the institution position.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public InstitutionPositions withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Campus
     * <p>
     * The physical location of the institution position.
     * 
     */
    @JsonProperty("campus")
    public Object getCampus() {
        return campus;
    }

    /**
     * Campus
     * <p>
     * The physical location of the institution position.
     * 
     */
    @JsonProperty("campus")
    public void setCampus(Object campus) {
        this.campus = campus;
    }

    public InstitutionPositions withCampus(Object campus) {
        this.campus = campus;
        return this;
    }

    /**
     * Departments
     * <p>
     * The departments or organizations of the institution to which the position belongs.
     * 
     */
    @JsonProperty("departments")
    public List<Department> getDepartments() {
        return departments;
    }

    /**
     * Departments
     * <p>
     * The departments or organizations of the institution to which the position belongs.
     * 
     */
    @JsonProperty("departments")
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public InstitutionPositions withDepartments(List<Department> departments) {
        this.departments = departments;
        return this;
    }

    /**
     * Accounting String Allocations
     * <p>
     * The accounting strings with allocated percentages associated with the position.
     * 
     */
    @JsonProperty("accountingStringAllocations")
    public List<AccountingStringAllocation> getAccountingStringAllocations() {
        return accountingStringAllocations;
    }

    /**
     * Accounting String Allocations
     * <p>
     * The accounting strings with allocated percentages associated with the position.
     * 
     */
    @JsonProperty("accountingStringAllocations")
    public void setAccountingStringAllocations(List<AccountingStringAllocation> accountingStringAllocations) {
        this.accountingStringAllocations = accountingStringAllocations;
    }

    public InstitutionPositions withAccountingStringAllocations(List<AccountingStringAllocation> accountingStringAllocations) {
        this.accountingStringAllocations = accountingStringAllocations;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the position (e.g. active, frozen, cancelled, inactive).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public InstitutionPositions.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the position (e.g. active, frozen, cancelled, inactive).
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(InstitutionPositions.Status status) {
        this.status = status;
    }

    public InstitutionPositions withStatus(InstitutionPositions.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Hours Per Period
     * <p>
     * The number of hours of work in specified time periods.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    public List<HoursPerPeriod> getHoursPerPeriod() {
        return hoursPerPeriod;
    }

    /**
     * Hours Per Period
     * <p>
     * The number of hours of work in specified time periods.
     * 
     */
    @JsonProperty("hoursPerPeriod")
    public void setHoursPerPeriod(List<HoursPerPeriod> hoursPerPeriod) {
        this.hoursPerPeriod = hoursPerPeriod;
    }

    public InstitutionPositions withHoursPerPeriod(List<HoursPerPeriod> hoursPerPeriod) {
        this.hoursPerPeriod = hoursPerPeriod;
        return this;
    }

    /**
     * Full Time Equivalent
     * <p>
     * The ratio of hours of work for the position to the hours of work expected of a full-time employee.
     * 
     */
    @JsonProperty("fullTimeEquivalent")
    public Object getFullTimeEquivalent() {
        return fullTimeEquivalent;
    }

    /**
     * Full Time Equivalent
     * <p>
     * The ratio of hours of work for the position to the hours of work expected of a full-time employee.
     * 
     */
    @JsonProperty("fullTimeEquivalent")
    public void setFullTimeEquivalent(Object fullTimeEquivalent) {
        this.fullTimeEquivalent = fullTimeEquivalent;
    }

    public InstitutionPositions withFullTimeEquivalent(Object fullTimeEquivalent) {
        this.fullTimeEquivalent = fullTimeEquivalent;
        return this;
    }

    /**
     * Bargaining Unit
     * <p>
     * The group or union associated with the position.
     * 
     */
    @JsonProperty("bargainingUnit")
    public Object getBargainingUnit() {
        return bargainingUnit;
    }

    /**
     * Bargaining Unit
     * <p>
     * The group or union associated with the position.
     * 
     */
    @JsonProperty("bargainingUnit")
    public void setBargainingUnit(Object bargainingUnit) {
        this.bargainingUnit = bargainingUnit;
    }

    public InstitutionPositions withBargainingUnit(Object bargainingUnit) {
        this.bargainingUnit = bargainingUnit;
        return this;
    }

    /**
     * Reports To
     * <p>
     * The positions to which this position reports.
     * 
     */
    @JsonProperty("reportsTo")
    public List<ReportsTo> getReportsTo() {
        return reportsTo;
    }

    /**
     * Reports To
     * <p>
     * The positions to which this position reports.
     * 
     */
    @JsonProperty("reportsTo")
    public void setReportsTo(List<ReportsTo> reportsTo) {
        this.reportsTo = reportsTo;
    }

    public InstitutionPositions withReportsTo(List<ReportsTo> reportsTo) {
        this.reportsTo = reportsTo;
        return this;
    }

    /**
     * Exemption Type
     * <p>
     * An indicator if the position is exempt or non-exempt.
     * 
     */
    @JsonProperty("exemptionType")
    public Object getExemptionType() {
        return exemptionType;
    }

    /**
     * Exemption Type
     * <p>
     * An indicator if the position is exempt or non-exempt.
     * 
     */
    @JsonProperty("exemptionType")
    public void setExemptionType(Object exemptionType) {
        this.exemptionType = exemptionType;
    }

    public InstitutionPositions withExemptionType(Object exemptionType) {
        this.exemptionType = exemptionType;
        return this;
    }

    /**
     * Compensation
     * <p>
     * The salary or wages awarded for the position.
     * 
     */
    @JsonProperty("compensation")
    public Object getCompensation() {
        return compensation;
    }

    /**
     * Compensation
     * <p>
     * The salary or wages awarded for the position.
     * 
     */
    @JsonProperty("compensation")
    public void setCompensation(Object compensation) {
        this.compensation = compensation;
    }

    public InstitutionPositions withCompensation(Object compensation) {
        this.compensation = compensation;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when the position is first available.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when the position is first available.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public InstitutionPositions withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date when the position is last available.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when the position is last available.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public InstitutionPositions withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Authorized On
     * <p>
     * The date when the position is authorized.
     * 
     */
    @JsonProperty("authorizedOn")
    public Object getAuthorizedOn() {
        return authorizedOn;
    }

    /**
     * Authorized On
     * <p>
     * The date when the position is authorized.
     * 
     */
    @JsonProperty("authorizedOn")
    public void setAuthorizedOn(Object authorizedOn) {
        this.authorizedOn = authorizedOn;
    }

    public InstitutionPositions withAuthorizedOn(Object authorizedOn) {
        this.authorizedOn = authorizedOn;
        return this;
    }

    /**
     * Classification
     * <p>
     * The classification associated with the position.
     * 
     */
    @JsonProperty("classification")
    public Object getClassification() {
        return classification;
    }

    /**
     * Classification
     * <p>
     * The classification associated with the position.
     * 
     */
    @JsonProperty("classification")
    public void setClassification(Object classification) {
        this.classification = classification;
    }

    public InstitutionPositions withClassification(Object classification) {
        this.classification = classification;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstitutionPositions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("campus");
        sb.append('=');
        sb.append(((this.campus == null)?"<null>":this.campus));
        sb.append(',');
        sb.append("departments");
        sb.append('=');
        sb.append(((this.departments == null)?"<null>":this.departments));
        sb.append(',');
        sb.append("accountingStringAllocations");
        sb.append('=');
        sb.append(((this.accountingStringAllocations == null)?"<null>":this.accountingStringAllocations));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("hoursPerPeriod");
        sb.append('=');
        sb.append(((this.hoursPerPeriod == null)?"<null>":this.hoursPerPeriod));
        sb.append(',');
        sb.append("fullTimeEquivalent");
        sb.append('=');
        sb.append(((this.fullTimeEquivalent == null)?"<null>":this.fullTimeEquivalent));
        sb.append(',');
        sb.append("bargainingUnit");
        sb.append('=');
        sb.append(((this.bargainingUnit == null)?"<null>":this.bargainingUnit));
        sb.append(',');
        sb.append("reportsTo");
        sb.append('=');
        sb.append(((this.reportsTo == null)?"<null>":this.reportsTo));
        sb.append(',');
        sb.append("exemptionType");
        sb.append('=');
        sb.append(((this.exemptionType == null)?"<null>":this.exemptionType));
        sb.append(',');
        sb.append("compensation");
        sb.append('=');
        sb.append(((this.compensation == null)?"<null>":this.compensation));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("authorizedOn");
        sb.append('=');
        sb.append(((this.authorizedOn == null)?"<null>":this.authorizedOn));
        sb.append(',');
        sb.append("classification");
        sb.append('=');
        sb.append(((this.classification == null)?"<null>":this.classification));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.campus == null)? 0 :this.campus.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.reportsTo == null)? 0 :this.reportsTo.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.accountingStringAllocations == null)? 0 :this.accountingStringAllocations.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.classification == null)? 0 :this.classification.hashCode()));
        result = ((result* 31)+((this.hoursPerPeriod == null)? 0 :this.hoursPerPeriod.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.fullTimeEquivalent == null)? 0 :this.fullTimeEquivalent.hashCode()));
        result = ((result* 31)+((this.compensation == null)? 0 :this.compensation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.departments == null)? 0 :this.departments.hashCode()));
        result = ((result* 31)+((this.authorizedOn == null)? 0 :this.authorizedOn.hashCode()));
        result = ((result* 31)+((this.exemptionType == null)? 0 :this.exemptionType.hashCode()));
        result = ((result* 31)+((this.bargainingUnit == null)? 0 :this.bargainingUnit.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstitutionPositions) == false) {
            return false;
        }
        InstitutionPositions rhs = ((InstitutionPositions) other);
        return ((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.campus == rhs.campus)||((this.campus!= null)&&this.campus.equals(rhs.campus))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.reportsTo == rhs.reportsTo)||((this.reportsTo!= null)&&this.reportsTo.equals(rhs.reportsTo))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.accountingStringAllocations == rhs.accountingStringAllocations)||((this.accountingStringAllocations!= null)&&this.accountingStringAllocations.equals(rhs.accountingStringAllocations))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.classification == rhs.classification)||((this.classification!= null)&&this.classification.equals(rhs.classification))))&&((this.hoursPerPeriod == rhs.hoursPerPeriod)||((this.hoursPerPeriod!= null)&&this.hoursPerPeriod.equals(rhs.hoursPerPeriod))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.fullTimeEquivalent == rhs.fullTimeEquivalent)||((this.fullTimeEquivalent!= null)&&this.fullTimeEquivalent.equals(rhs.fullTimeEquivalent))))&&((this.compensation == rhs.compensation)||((this.compensation!= null)&&this.compensation.equals(rhs.compensation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.departments == rhs.departments)||((this.departments!= null)&&this.departments.equals(rhs.departments))))&&((this.authorizedOn == rhs.authorizedOn)||((this.authorizedOn!= null)&&this.authorizedOn.equals(rhs.authorizedOn))))&&((this.exemptionType == rhs.exemptionType)||((this.exemptionType!= null)&&this.exemptionType.equals(rhs.exemptionType))))&&((this.bargainingUnit == rhs.bargainingUnit)||((this.bargainingUnit!= null)&&this.bargainingUnit.equals(rhs.bargainingUnit))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the position (e.g. active, frozen, cancelled, inactive).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        FROZEN("frozen"),
        CANCELLED("cancelled"),
        INACTIVE("inactive");
        private final String value;
        private final static Map<String, InstitutionPositions.Status> CONSTANTS = new HashMap<String, InstitutionPositions.Status>();

        static {
            for (InstitutionPositions.Status c: values()) {
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
        public static InstitutionPositions.Status fromValue(String value) {
            InstitutionPositions.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
