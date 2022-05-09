
package com.ellucian.generated.eedm.recruitment_representatives.v12_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Recruitment Representatives
 * <p>
 * The individuals who represent the institution in the recruitment process.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "fullName",
    "position",
    "phone",
    "emailAddress",
    "teams"
})
@Generated("jsonschema2pojo")
public class RecruitmentRepresentatives {

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
     * The global identifier of the recruitment representative.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the recruitment representative.")
    private String id;
    /**
     * Full Name
     * <p>
     * The full name of the representative.
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    @JsonPropertyDescription("The full name of the representative.")
    private String fullName;
    /**
     * Position
     * <p>
     * The position of the representative.
     * 
     */
    @JsonProperty("position")
    @JsonPropertyDescription("The position of the representative.")
    private String position;
    /**
     * Phone
     * <p>
     * The phone number of the representative.
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The phone number of the representative.")
    private String phone;
    /**
     * Email Address
     * <p>
     * The email address of the representative.
     * 
     */
    @JsonProperty("emailAddress")
    @JsonPropertyDescription("The email address of the representative.")
    private Object emailAddress;
    /**
     * Teams
     * <p>
     * The teams to which the representative has been assigned.
     * 
     */
    @JsonProperty("teams")
    @JsonPropertyDescription("The teams to which the representative has been assigned.")
    private List<Team> teams = new ArrayList<Team>();

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

    public RecruitmentRepresentatives withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the recruitment representative.
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
     * The global identifier of the recruitment representative.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RecruitmentRepresentatives withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Full Name
     * <p>
     * The full name of the representative.
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Full Name
     * <p>
     * The full name of the representative.
     * (Required)
     * 
     */
    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public RecruitmentRepresentatives withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Position
     * <p>
     * The position of the representative.
     * 
     */
    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    /**
     * Position
     * <p>
     * The position of the representative.
     * 
     */
    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    public RecruitmentRepresentatives withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phone number of the representative.
     * 
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Phone
     * <p>
     * The phone number of the representative.
     * 
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RecruitmentRepresentatives withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Email Address
     * <p>
     * The email address of the representative.
     * 
     */
    @JsonProperty("emailAddress")
    public Object getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * The email address of the representative.
     * 
     */
    @JsonProperty("emailAddress")
    public void setEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
    }

    public RecruitmentRepresentatives withEmailAddress(Object emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Teams
     * <p>
     * The teams to which the representative has been assigned.
     * 
     */
    @JsonProperty("teams")
    public List<Team> getTeams() {
        return teams;
    }

    /**
     * Teams
     * <p>
     * The teams to which the representative has been assigned.
     * 
     */
    @JsonProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public RecruitmentRepresentatives withTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RecruitmentRepresentatives.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("emailAddress");
        sb.append('=');
        sb.append(((this.emailAddress == null)?"<null>":this.emailAddress));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
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
        result = ((result* 31)+((this.emailAddress == null)? 0 :this.emailAddress.hashCode()));
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecruitmentRepresentatives) == false) {
            return false;
        }
        RecruitmentRepresentatives rhs = ((RecruitmentRepresentatives) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.emailAddress == rhs.emailAddress)||((this.emailAddress!= null)&&this.emailAddress.equals(rhs.emailAddress))))&&((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))));
    }

}
