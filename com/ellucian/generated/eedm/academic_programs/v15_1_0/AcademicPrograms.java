
package com.ellucian.generated.eedm.academic_programs.v15_1_0;

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
 * Academic Programs
 * <p>
 * An offering by an institution that represents a combination of courses and requirements leading to a degree, diploma, or certificate for a defined set of majors, minors, or concentrations.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "authorizing",
    "programOwners",
    "sites",
    "academicLevel",
    "credentials",
    "disciplines",
    "status",
    "startOn",
    "endOn",
    "administrativePeriodStart",
    "administrativePeriodEnd"
})
@Generated("jsonschema2pojo")
public class AcademicPrograms {

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
     * The global identifier of an academic program.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of an academic program.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of an academic program.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an academic program.")
    private String title;
    /**
     * Description
     * <p>
     * The description of an academic program.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of an academic program.")
    private String description;
    /**
     * Code
     * <p>
     * A code that identifies an academic program.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that identifies an academic program.")
    private String code;
    /**
     * Authorizing
     * <p>
     * The institutional unit that authorizes the academic program.
     * 
     */
    @JsonProperty("authorizing")
    @JsonPropertyDescription("The institutional unit that authorizes the academic program.")
    private Object authorizing;
    /**
     * Program Owners
     * <p>
     * The owners of the academic program.
     * 
     */
    @JsonProperty("programOwners")
    @JsonPropertyDescription("The owners of the academic program.")
    private List<ProgramOwner> programOwners = new ArrayList<ProgramOwner>();
    /**
     * Sites
     * <p>
     * The sites (campuses) the program is offered at
     * 
     */
    @JsonProperty("sites")
    @JsonPropertyDescription("The sites (campuses) the program is offered at")
    private List<Site> sites = new ArrayList<Site>();
    /**
     * Academic Level
     * <p>
     * The level of academic progress that is associated with an academic program.
     * 
     */
    @JsonProperty("academicLevel")
    @JsonPropertyDescription("The level of academic progress that is associated with an academic program.")
    private Object academicLevel;
    /**
     * Credentials
     * <p>
     * The academic credentials that can be awarded for completing an academic program.
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("The academic credentials that can be awarded for completing an academic program.")
    private List<Credential> credentials = new ArrayList<Credential>();
    /**
     * Discipline
     * <p>
     * The academic disciplines offered as part of an academic program.
     * 
     */
    @JsonProperty("disciplines")
    @JsonPropertyDescription("The academic disciplines offered as part of an academic program.")
    private List<Discipline> disciplines = new ArrayList<Discipline>();
    /**
     * Status
     * <p>
     * The status of an academic program.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of an academic program.")
    private AcademicPrograms.Status status;
    /**
     * Start Date
     * <p>
     * The date that an academic program starts.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date that an academic program starts.")
    private String startOn;
    /**
     * End Date
     * <p>
     * The date that an academic program ends.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date that an academic program ends.")
    private Object endOn;
    /**
     * Administrative Period Start
     * <p>
     * The earliest administrative period the program can be assigned to a student.
     * 
     */
    @JsonProperty("administrativePeriodStart")
    @JsonPropertyDescription("The earliest administrative period the program can be assigned to a student.")
    private Object administrativePeriodStart;
    /**
     * Administrative Period End
     * <p>
     * The latest administrative period the program can be assigned to a student.
     * 
     */
    @JsonProperty("administrativePeriodEnd")
    @JsonPropertyDescription("The latest administrative period the program can be assigned to a student.")
    private Object administrativePeriodEnd;

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

    public AcademicPrograms withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of an academic program.
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
     * The global identifier of an academic program.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AcademicPrograms withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an academic program.
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
     * The full name of an academic program.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AcademicPrograms withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of an academic program.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of an academic program.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AcademicPrograms withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that identifies an academic program.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that identifies an academic program.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AcademicPrograms withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Authorizing
     * <p>
     * The institutional unit that authorizes the academic program.
     * 
     */
    @JsonProperty("authorizing")
    public Object getAuthorizing() {
        return authorizing;
    }

    /**
     * Authorizing
     * <p>
     * The institutional unit that authorizes the academic program.
     * 
     */
    @JsonProperty("authorizing")
    public void setAuthorizing(Object authorizing) {
        this.authorizing = authorizing;
    }

    public AcademicPrograms withAuthorizing(Object authorizing) {
        this.authorizing = authorizing;
        return this;
    }

    /**
     * Program Owners
     * <p>
     * The owners of the academic program.
     * 
     */
    @JsonProperty("programOwners")
    public List<ProgramOwner> getProgramOwners() {
        return programOwners;
    }

    /**
     * Program Owners
     * <p>
     * The owners of the academic program.
     * 
     */
    @JsonProperty("programOwners")
    public void setProgramOwners(List<ProgramOwner> programOwners) {
        this.programOwners = programOwners;
    }

    public AcademicPrograms withProgramOwners(List<ProgramOwner> programOwners) {
        this.programOwners = programOwners;
        return this;
    }

    /**
     * Sites
     * <p>
     * The sites (campuses) the program is offered at
     * 
     */
    @JsonProperty("sites")
    public List<Site> getSites() {
        return sites;
    }

    /**
     * Sites
     * <p>
     * The sites (campuses) the program is offered at
     * 
     */
    @JsonProperty("sites")
    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public AcademicPrograms withSites(List<Site> sites) {
        this.sites = sites;
        return this;
    }

    /**
     * Academic Level
     * <p>
     * The level of academic progress that is associated with an academic program.
     * 
     */
    @JsonProperty("academicLevel")
    public Object getAcademicLevel() {
        return academicLevel;
    }

    /**
     * Academic Level
     * <p>
     * The level of academic progress that is associated with an academic program.
     * 
     */
    @JsonProperty("academicLevel")
    public void setAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
    }

    public AcademicPrograms withAcademicLevel(Object academicLevel) {
        this.academicLevel = academicLevel;
        return this;
    }

    /**
     * Credentials
     * <p>
     * The academic credentials that can be awarded for completing an academic program.
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * The academic credentials that can be awarded for completing an academic program.
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public AcademicPrograms withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Discipline
     * <p>
     * The academic disciplines offered as part of an academic program.
     * 
     */
    @JsonProperty("disciplines")
    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    /**
     * Discipline
     * <p>
     * The academic disciplines offered as part of an academic program.
     * 
     */
    @JsonProperty("disciplines")
    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public AcademicPrograms withDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of an academic program.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public AcademicPrograms.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of an academic program.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(AcademicPrograms.Status status) {
        this.status = status;
    }

    public AcademicPrograms withStatus(AcademicPrograms.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date that an academic program starts.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date that an academic program starts.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public AcademicPrograms withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date that an academic program ends.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The date that an academic program ends.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public AcademicPrograms withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Administrative Period Start
     * <p>
     * The earliest administrative period the program can be assigned to a student.
     * 
     */
    @JsonProperty("administrativePeriodStart")
    public Object getAdministrativePeriodStart() {
        return administrativePeriodStart;
    }

    /**
     * Administrative Period Start
     * <p>
     * The earliest administrative period the program can be assigned to a student.
     * 
     */
    @JsonProperty("administrativePeriodStart")
    public void setAdministrativePeriodStart(Object administrativePeriodStart) {
        this.administrativePeriodStart = administrativePeriodStart;
    }

    public AcademicPrograms withAdministrativePeriodStart(Object administrativePeriodStart) {
        this.administrativePeriodStart = administrativePeriodStart;
        return this;
    }

    /**
     * Administrative Period End
     * <p>
     * The latest administrative period the program can be assigned to a student.
     * 
     */
    @JsonProperty("administrativePeriodEnd")
    public Object getAdministrativePeriodEnd() {
        return administrativePeriodEnd;
    }

    /**
     * Administrative Period End
     * <p>
     * The latest administrative period the program can be assigned to a student.
     * 
     */
    @JsonProperty("administrativePeriodEnd")
    public void setAdministrativePeriodEnd(Object administrativePeriodEnd) {
        this.administrativePeriodEnd = administrativePeriodEnd;
    }

    public AcademicPrograms withAdministrativePeriodEnd(Object administrativePeriodEnd) {
        this.administrativePeriodEnd = administrativePeriodEnd;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcademicPrograms.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("authorizing");
        sb.append('=');
        sb.append(((this.authorizing == null)?"<null>":this.authorizing));
        sb.append(',');
        sb.append("programOwners");
        sb.append('=');
        sb.append(((this.programOwners == null)?"<null>":this.programOwners));
        sb.append(',');
        sb.append("sites");
        sb.append('=');
        sb.append(((this.sites == null)?"<null>":this.sites));
        sb.append(',');
        sb.append("academicLevel");
        sb.append('=');
        sb.append(((this.academicLevel == null)?"<null>":this.academicLevel));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
        sb.append(',');
        sb.append("disciplines");
        sb.append('=');
        sb.append(((this.disciplines == null)?"<null>":this.disciplines));
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
        sb.append("administrativePeriodStart");
        sb.append('=');
        sb.append(((this.administrativePeriodStart == null)?"<null>":this.administrativePeriodStart));
        sb.append(',');
        sb.append("administrativePeriodEnd");
        sb.append('=');
        sb.append(((this.administrativePeriodEnd == null)?"<null>":this.administrativePeriodEnd));
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
        result = ((result* 31)+((this.programOwners == null)? 0 :this.programOwners.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.sites == null)? 0 :this.sites.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.academicLevel == null)? 0 :this.academicLevel.hashCode()));
        result = ((result* 31)+((this.disciplines == null)? 0 :this.disciplines.hashCode()));
        result = ((result* 31)+((this.authorizing == null)? 0 :this.authorizing.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.administrativePeriodStart == null)? 0 :this.administrativePeriodStart.hashCode()));
        result = ((result* 31)+((this.administrativePeriodEnd == null)? 0 :this.administrativePeriodEnd.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AcademicPrograms) == false) {
            return false;
        }
        AcademicPrograms rhs = ((AcademicPrograms) other);
        return (((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.programOwners == rhs.programOwners)||((this.programOwners!= null)&&this.programOwners.equals(rhs.programOwners))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.sites == rhs.sites)||((this.sites!= null)&&this.sites.equals(rhs.sites))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.academicLevel == rhs.academicLevel)||((this.academicLevel!= null)&&this.academicLevel.equals(rhs.academicLevel))))&&((this.disciplines == rhs.disciplines)||((this.disciplines!= null)&&this.disciplines.equals(rhs.disciplines))))&&((this.authorizing == rhs.authorizing)||((this.authorizing!= null)&&this.authorizing.equals(rhs.authorizing))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.administrativePeriodStart == rhs.administrativePeriodStart)||((this.administrativePeriodStart!= null)&&this.administrativePeriodStart.equals(rhs.administrativePeriodStart))))&&((this.administrativePeriodEnd == rhs.administrativePeriodEnd)||((this.administrativePeriodEnd!= null)&&this.administrativePeriodEnd.equals(rhs.administrativePeriodEnd))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of an academic program.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive");
        private final String value;
        private final static Map<String, AcademicPrograms.Status> CONSTANTS = new HashMap<String, AcademicPrograms.Status>();

        static {
            for (AcademicPrograms.Status c: values()) {
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
        public static AcademicPrograms.Status fromValue(String value) {
            AcademicPrograms.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
