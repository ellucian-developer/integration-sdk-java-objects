
package com.ellucian.generated.eedm.section_registrations.v16_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Section Registrations
 * <p>
 * The records of a student's interaction with a course section for a specific registration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "registrant",
    "section",
    "academicLevel",
    "originallyRegisteredOn",
    "status",
    "statusDate",
    "approvals",
    "credit",
    "gradingOption",
    "involvement",
    "override"
})
@Generated("jsonschema2pojo")
public class SectionRegistrations {

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
     * The global identifier of the section registration.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the section registration.")
    private String id;
    /**
     * Registrant
     * <p>
     * A person registered for a section.
     * (Required)
     * 
     */
    @JsonProperty("registrant")
    @JsonPropertyDescription("A person registered for a section.")
    private Registrant registrant;
    /**
     * Section
     * <p>
     * An instance of a course for which a person is registering.
     * (Required)
     * 
     */
    @JsonProperty("section")
    @JsonPropertyDescription("An instance of a course for which a person is registering.")
    private Section section;
    /**
     * Academic Level
     * <p>
     * The academic level at which the student is registering for the course (The level specified should match one of the levels allowed for the section).
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The academic level at which the student is registering for the course (The level specified should match one of the levels allowed for the section).")
    private AcademicLevel academicLevel;
    /**
     * Originally Registered On
     * <p>
     * The date on which the student originally registered for the section.
     * 
     */
    @JsonProperty("originallyRegisteredOn")
    @JsonPropertyDescription("The date on which the student originally registered for the section.")
    private Object originallyRegisteredOn;
    /**
     * Status
     * <p>
     * The status of this person's registration in the section.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of this person's registration in the section.")
    private Object status;
    /**
     * Status Date
     * <p>
     * The date on which the status was set.
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("The date on which the status was set.")
    private Object statusDate;
    /**
     * Approval
     * <p>
     * The method of approval.
     * 
     */
    @JsonProperty("approvals")
    @JsonPropertyDescription("The method of approval.")
    private List<Approval> approvals = new ArrayList<Approval>();
    /**
     * Credit
     * <p>
     * Unit specification that can be awarded for completing a section.
     * 
     */
    @JsonProperty("credit")
    @JsonPropertyDescription("Unit specification that can be awarded for completing a section.")
    private Credit credit;
    /**
     * Grading Option
     * <p>
     * Details on how the student elected to have their grades recorded.
     * 
     */
    @JsonProperty("gradingOption")
    @JsonPropertyDescription("Details on how the student elected to have their grades recorded.")
    private GradingOption gradingOption;
    /**
     * Involvement
     * <p>
     * The range of dates between which a student was involved with a section.
     * 
     */
    @JsonProperty("involvement")
    @JsonPropertyDescription("The range of dates between which a student was involved with a section.")
    private Involvement involvement;
    /**
     * Override
     * <p>
     * Properties defined for the section that may be overridden for individual registrations.
     * 
     */
    @JsonProperty("override")
    @JsonPropertyDescription("Properties defined for the section that may be overridden for individual registrations.")
    private com.ellucian.generated.eedm.section_registrations.v16_0_0.Override override;

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

    public SectionRegistrations withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the section registration.
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
     * The global identifier of the section registration.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SectionRegistrations withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Registrant
     * <p>
     * A person registered for a section.
     * (Required)
     * 
     */
    @JsonProperty("registrant")
    public Registrant getRegistrant() {
        return registrant;
    }

    /**
     * Registrant
     * <p>
     * A person registered for a section.
     * (Required)
     * 
     */
    @JsonProperty("registrant")
    public void setRegistrant(Registrant registrant) {
        this.registrant = registrant;
    }

    public SectionRegistrations withRegistrant(Registrant registrant) {
        this.registrant = registrant;
        return this;
    }

    /**
     * Section
     * <p>
     * An instance of a course for which a person is registering.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public Section getSection() {
        return section;
    }

    /**
     * Section
     * <p>
     * An instance of a course for which a person is registering.
     * (Required)
     * 
     */
    @JsonProperty("section")
    public void setSection(Section section) {
        this.section = section;
    }

    public SectionRegistrations withSection(Section section) {
        this.section = section;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The academic level at which the student is registering for the course (The level specified should match one of the levels allowed for the section).
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    public AcademicLevel getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The academic level at which the student is registering for the course (The level specified should match one of the levels allowed for the section).
     * (Required)
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
    }

    public SectionRegistrations withAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Originally Registered On
     * <p>
     * The date on which the student originally registered for the section.
     * 
     */
    @JsonProperty("originallyRegisteredOn")
    public Object getOriginallyRegisteredOn() {
        return originallyRegisteredOn;
    }

    /**
     * Originally Registered On
     * <p>
     * The date on which the student originally registered for the section.
     * 
     */
    @JsonProperty("originallyRegisteredOn")
    public void setOriginallyRegisteredOn(Object originallyRegisteredOn) {
        this.originallyRegisteredOn = originallyRegisteredOn;
    }

    public SectionRegistrations withOriginallyRegisteredOn(Object originallyRegisteredOn) {
        this.originallyRegisteredOn = originallyRegisteredOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of this person's registration in the section.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of this person's registration in the section.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public SectionRegistrations withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Status Date
     * <p>
     * The date on which the status was set.
     * 
     */
    @JsonProperty("statusDate")
    public Object getStatusDate() {
        return statusDate;
    }

    /**
     * Status Date
     * <p>
     * The date on which the status was set.
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(Object statusDate) {
        this.statusDate = statusDate;
    }

    public SectionRegistrations withStatusDate(Object statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Approval
     * <p>
     * The method of approval.
     * 
     */
    @JsonProperty("approvals")
    public List<Approval> getApprovals() {
        return approvals;
    }

    /**
     * Approval
     * <p>
     * The method of approval.
     * 
     */
    @JsonProperty("approvals")
    public void setApprovals(List<Approval> approvals) {
        this.approvals = approvals;
    }

    public SectionRegistrations withApprovals(List<Approval> approvals) {
        this.approvals = approvals;
        return this;
    }

    /**
     * Credit
     * <p>
     * Unit specification that can be awarded for completing a section.
     * 
     */
    @JsonProperty("credit")
    public Credit getCredit() {
        return credit;
    }

    /**
     * Credit
     * <p>
     * Unit specification that can be awarded for completing a section.
     * 
     */
    @JsonProperty("credit")
    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public SectionRegistrations withCredit(Credit credit) {
        this.credit = credit;
        return this;
    }

    /**
     * Grading Option
     * <p>
     * Details on how the student elected to have their grades recorded.
     * 
     */
    @JsonProperty("gradingOption")
    public GradingOption getGradingOption() {
        return gradingOption;
    }

    /**
     * Grading Option
     * <p>
     * Details on how the student elected to have their grades recorded.
     * 
     */
    @JsonProperty("gradingOption")
    public void setGradingOption(GradingOption gradingOption) {
        this.gradingOption = gradingOption;
    }

    public SectionRegistrations withGradingOption(GradingOption gradingOption) {
        this.gradingOption = gradingOption;
        return this;
    }

    /**
     * Involvement
     * <p>
     * The range of dates between which a student was involved with a section.
     * 
     */
    @JsonProperty("involvement")
    public Involvement getInvolvement() {
        return involvement;
    }

    /**
     * Involvement
     * <p>
     * The range of dates between which a student was involved with a section.
     * 
     */
    @JsonProperty("involvement")
    public void setInvolvement(Involvement involvement) {
        this.involvement = involvement;
    }

    public SectionRegistrations withInvolvement(Involvement involvement) {
        this.involvement = involvement;
        return this;
    }

    /**
     * Override
     * <p>
     * Properties defined for the section that may be overridden for individual registrations.
     * 
     */
    @JsonProperty("override")
    public com.ellucian.generated.eedm.section_registrations.v16_0_0.Override getOverride() {
        return override;
    }

    /**
     * Override
     * <p>
     * Properties defined for the section that may be overridden for individual registrations.
     * 
     */
    @JsonProperty("override")
    public void setOverride(com.ellucian.generated.eedm.section_registrations.v16_0_0.Override override) {
        this.override = override;
    }

    public SectionRegistrations withOverride(com.ellucian.generated.eedm.section_registrations.v16_0_0.Override override) {
        this.override = override;
        return this;
    }

    @java.lang.Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SectionRegistrations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("registrant");
        sb.append('=');
        sb.append(((this.registrant == null)?"<null>":this.registrant));
        sb.append(',');
        sb.append("section");
        sb.append('=');
        sb.append(((this.section == null)?"<null>":this.section));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("originallyRegisteredOn");
        sb.append('=');
        sb.append(((this.originallyRegisteredOn == null)?"<null>":this.originallyRegisteredOn));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("approvals");
        sb.append('=');
        sb.append(((this.approvals == null)?"<null>":this.approvals));
        sb.append(',');
        sb.append("credit");
        sb.append('=');
        sb.append(((this.credit == null)?"<null>":this.credit));
        sb.append(',');
        sb.append("gradingOption");
        sb.append('=');
        sb.append(((this.gradingOption == null)?"<null>":this.gradingOption));
        sb.append(',');
        sb.append("involvement");
        sb.append('=');
        sb.append(((this.involvement == null)?"<null>":this.involvement));
        sb.append(',');
        sb.append("override");
        sb.append('=');
        sb.append(((this.override == null)?"<null>":this.override));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @java.lang.Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.gradingOption == null)? 0 :this.gradingOption.hashCode()));
        result = ((result* 31)+((this.originallyRegisteredOn == null)? 0 :this.originallyRegisteredOn.hashCode()));
        result = ((result* 31)+((this.section == null)? 0 :this.section.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.involvement == null)? 0 :this.involvement.hashCode()));
        result = ((result* 31)+((this.approvals == null)? 0 :this.approvals.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.registrant == null)? 0 :this.registrant.hashCode()));
        result = ((result* 31)+((this.override == null)? 0 :this.override.hashCode()));
        result = ((result* 31)+((this.credit == null)? 0 :this.credit.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SectionRegistrations) == false) {
            return false;
        }
        SectionRegistrations rhs = ((SectionRegistrations) other);
        return ((((((((((((((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.gradingOption == rhs.gradingOption)||((this.gradingOption!= null)&&this.gradingOption.equals(rhs.gradingOption))))&&((this.originallyRegisteredOn == rhs.originallyRegisteredOn)||((this.originallyRegisteredOn!= null)&&this.originallyRegisteredOn.equals(rhs.originallyRegisteredOn))))&&((this.section == rhs.section)||((this.section!= null)&&this.section.equals(rhs.section))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.involvement == rhs.involvement)||((this.involvement!= null)&&this.involvement.equals(rhs.involvement))))&&((this.approvals == rhs.approvals)||((this.approvals!= null)&&this.approvals.equals(rhs.approvals))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.registrant == rhs.registrant)||((this.registrant!= null)&&this.registrant.equals(rhs.registrant))))&&((this.override == rhs.override)||((this.override!= null)&&this.override.equals(rhs.override))))&&((this.credit == rhs.credit)||((this.credit!= null)&&this.credit.equals(rhs.credit))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
