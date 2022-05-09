
package com.ellucian.generated.eedm.advancement_membership_programs.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Advancement Membership Programs
 * <p>
 * This entity contains information about advancement membership programs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "type",
    "status",
    "renewalGracePeriod",
    "startOn",
    "endOn",
    "college",
    "department",
    "locations",
    "coordinators",
    "comments"
})
@Generated("jsonschema2pojo")
public class AdvancementMembershipPrograms {

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
     * The global identifier of the advancement membership program.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the advancement membership program.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the advancement membership program.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the advancement membership program.")
    private String title;
    /**
     * Type
     * <p>
     * The type of membership program.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of membership program.")
    private Object type;
    /**
     * Status
     * <p>
     * The status of the membership program.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the membership program.")
    private Status status;
    /**
     * Renewal Grace Period
     * <p>
     * The time, in months, a member has to renew the membership before it is made inactive.
     * 
     */
    @JsonProperty("renewalGracePeriod")
    @JsonPropertyDescription("The time, in months, a member has to renew the membership before it is made inactive.")
    private Object renewalGracePeriod;
    /**
     * Start On
     * <p>
     * The date when a membership program begins.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when a membership program begins.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The date when a membership program ends.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when a membership program ends.")
    private Object endOn;
    /**
     * College
     * <p>
     * The college associated with the membership program.
     * 
     */
    @JsonProperty("college")
    @JsonPropertyDescription("The college associated with the membership program.")
    private Object college;
    /**
     * Department
     * <p>
     * The department associated with the membership program.
     * 
     */
    @JsonProperty("department")
    @JsonPropertyDescription("The department associated with the membership program.")
    private Object department;
    /**
     * Locations
     * <p>
     * The location(s) associated with the membership program.
     * 
     */
    @JsonProperty("locations")
    @JsonPropertyDescription("The location(s) associated with the membership program.")
    private List<Location> locations = new ArrayList<Location>();
    /**
     * Coordinators
     * <p>
     * The coordinator(s) of the membership program.
     * 
     */
    @JsonProperty("coordinators")
    @JsonPropertyDescription("The coordinator(s) of the membership program.")
    private List<Object> coordinators = new ArrayList<Object>();
    /**
     * Comments
     * <p>
     * Comments about the membership program.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("Comments about the membership program.")
    private String comments;

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

    public AdvancementMembershipPrograms withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the advancement membership program.
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
     * The global identifier of the advancement membership program.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdvancementMembershipPrograms withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the advancement membership program.
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
     * The full name of the advancement membership program.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdvancementMembershipPrograms withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of membership program.
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of membership program.
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public AdvancementMembershipPrograms withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the membership program.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the membership program.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public AdvancementMembershipPrograms withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Renewal Grace Period
     * <p>
     * The time, in months, a member has to renew the membership before it is made inactive.
     * 
     */
    @JsonProperty("renewalGracePeriod")
    public Object getRenewalGracePeriod() {
        return renewalGracePeriod;
    }

    /**
     * Renewal Grace Period
     * <p>
     * The time, in months, a member has to renew the membership before it is made inactive.
     * 
     */
    @JsonProperty("renewalGracePeriod")
    public void setRenewalGracePeriod(Object renewalGracePeriod) {
        this.renewalGracePeriod = renewalGracePeriod;
    }

    public AdvancementMembershipPrograms withRenewalGracePeriod(Object renewalGracePeriod) {
        this.renewalGracePeriod = renewalGracePeriod;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date when a membership program begins.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date when a membership program begins.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public AdvancementMembershipPrograms withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date when a membership program ends.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date when a membership program ends.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public AdvancementMembershipPrograms withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * College
     * <p>
     * The college associated with the membership program.
     * 
     */
    @JsonProperty("college")
    public Object getCollege() {
        return college;
    }

    /**
     * College
     * <p>
     * The college associated with the membership program.
     * 
     */
    @JsonProperty("college")
    public void setCollege(Object college) {
        this.college = college;
    }

    public AdvancementMembershipPrograms withCollege(Object college) {
        this.college = college;
        return this;
    }

    /**
     * Department
     * <p>
     * The department associated with the membership program.
     * 
     */
    @JsonProperty("department")
    public Object getDepartment() {
        return department;
    }

    /**
     * Department
     * <p>
     * The department associated with the membership program.
     * 
     */
    @JsonProperty("department")
    public void setDepartment(Object department) {
        this.department = department;
    }

    public AdvancementMembershipPrograms withDepartment(Object department) {
        this.department = department;
        return this;
    }

    /**
     * Locations
     * <p>
     * The location(s) associated with the membership program.
     * 
     */
    @JsonProperty("locations")
    public List<Location> getLocations() {
        return locations;
    }

    /**
     * Locations
     * <p>
     * The location(s) associated with the membership program.
     * 
     */
    @JsonProperty("locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public AdvancementMembershipPrograms withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Coordinators
     * <p>
     * The coordinator(s) of the membership program.
     * 
     */
    @JsonProperty("coordinators")
    public List<Object> getCoordinators() {
        return coordinators;
    }

    /**
     * Coordinators
     * <p>
     * The coordinator(s) of the membership program.
     * 
     */
    @JsonProperty("coordinators")
    public void setCoordinators(List<Object> coordinators) {
        this.coordinators = coordinators;
    }

    public AdvancementMembershipPrograms withCoordinators(List<Object> coordinators) {
        this.coordinators = coordinators;
        return this;
    }

    /**
     * Comments
     * <p>
     * Comments about the membership program.
     * 
     */
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * Comments about the membership program.
     * 
     */
    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    public AdvancementMembershipPrograms withComments(String comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdvancementMembershipPrograms.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("renewalGracePeriod");
        sb.append('=');
        sb.append(((this.renewalGracePeriod == null)?"<null>":this.renewalGracePeriod));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("college");
        sb.append('=');
        sb.append(((this.college == null)?"<null>":this.college));
        sb.append(',');
        sb.append("department");
        sb.append('=');
        sb.append(((this.department == null)?"<null>":this.department));
        sb.append(',');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
        sb.append(',');
        sb.append("coordinators");
        sb.append('=');
        sb.append(((this.coordinators == null)?"<null>":this.coordinators));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
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
        result = ((result* 31)+((this.college == null)? 0 :this.college.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.renewalGracePeriod == null)? 0 :this.renewalGracePeriod.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.coordinators == null)? 0 :this.coordinators.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.locations == null)? 0 :this.locations.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.department == null)? 0 :this.department.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdvancementMembershipPrograms) == false) {
            return false;
        }
        AdvancementMembershipPrograms rhs = ((AdvancementMembershipPrograms) other);
        return ((((((((((((((this.college == rhs.college)||((this.college!= null)&&this.college.equals(rhs.college)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.renewalGracePeriod == rhs.renewalGracePeriod)||((this.renewalGracePeriod!= null)&&this.renewalGracePeriod.equals(rhs.renewalGracePeriod))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.coordinators == rhs.coordinators)||((this.coordinators!= null)&&this.coordinators.equals(rhs.coordinators))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.locations == rhs.locations)||((this.locations!= null)&&this.locations.equals(rhs.locations))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.department == rhs.department)||((this.department!= null)&&this.department.equals(rhs.department))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
