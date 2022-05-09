
package com.ellucian.generated.eedm.constituent_involvements.v12_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Involvements
 * <p>
 * A constituent's involvement in an activity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "constituent",
    "activity",
    "participationType",
    "startOn",
    "endOn",
    "status",
    "source",
    "classYear",
    "responsiblePerson",
    "comment"
})
@Generated("jsonschema2pojo")
public class ConstituentInvolvements {

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
     * A global identifier of a constituent involvement.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a constituent involvement.")
    private String id;
    /**
     * Constituent
     * <p>
     * The constituent involved in an activity.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The constituent involved in an activity.")
    private Object constituent;
    /**
     * Activity
     * <p>
     * The activity in which a constituent is involved.
     * (Required)
     * 
     */
    @JsonProperty("activity")
    @JsonPropertyDescription("The activity in which a constituent is involved.")
    private Activity activity;
    /**
     * Participation Type
     * <p>
     * The type of participation the constituent had in the activity.
     * 
     */
    @JsonProperty("participationType")
    @JsonPropertyDescription("The type of participation the constituent had in the activity.")
    private Object participationType;
    /**
     * Start Date
     * <p>
     * The date when a constituent's involvement in an activity starts.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when a constituent's involvement in an activity starts.")
    private StartOn startOn;
    /**
     * End Date
     * <p>
     * The date when a constituent's involvement in an activity ends.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when a constituent's involvement in an activity ends.")
    private EndOn endOn;
    /**
     * Status
     * <p>
     * The status of the constituent's involvement in the activity.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the constituent's involvement in the activity.")
    private Object status;
    /**
     * Source
     * <p>
     * The source of the constituent activity information.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the constituent activity information.")
    private Object source;
    /**
     * Class Year
     * <p>
     * A class year associated with the constituent's involvement in the activity.
     * 
     */
    @JsonProperty("classYear")
    @JsonPropertyDescription("A class year associated with the constituent's involvement in the activity.")
    private Object classYear;
    /**
     * Responsible Person
     * <p>
     * The person who oversees the constituent's involvement with the activity.
     * 
     */
    @JsonProperty("responsiblePerson")
    @JsonPropertyDescription("The person who oversees the constituent's involvement with the activity.")
    private Object responsiblePerson;
    /**
     * Comment
     * <p>
     * A comment on the constituent's involvement in the activity.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A comment on the constituent's involvement in the activity.")
    private String comment;

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

    public ConstituentInvolvements withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a constituent involvement.
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
     * A global identifier of a constituent involvement.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentInvolvements withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Constituent
     * <p>
     * The constituent involved in an activity.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public Object getConstituent() {
        return constituent;
    }

    /**
     * Constituent
     * <p>
     * The constituent involved in an activity.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public ConstituentInvolvements withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    /**
     * Activity
     * <p>
     * The activity in which a constituent is involved.
     * (Required)
     * 
     */
    @JsonProperty("activity")
    public Activity getActivity() {
        return activity;
    }

    /**
     * Activity
     * <p>
     * The activity in which a constituent is involved.
     * (Required)
     * 
     */
    @JsonProperty("activity")
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public ConstituentInvolvements withActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    /**
     * Participation Type
     * <p>
     * The type of participation the constituent had in the activity.
     * 
     */
    @JsonProperty("participationType")
    public Object getParticipationType() {
        return participationType;
    }

    /**
     * Participation Type
     * <p>
     * The type of participation the constituent had in the activity.
     * 
     */
    @JsonProperty("participationType")
    public void setParticipationType(Object participationType) {
        this.participationType = participationType;
    }

    public ConstituentInvolvements withParticipationType(Object participationType) {
        this.participationType = participationType;
        return this;
    }

    /**
     * Start Date
     * <p>
     * The date when a constituent's involvement in an activity starts.
     * 
     */
    @JsonProperty("startOn")
    public StartOn getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * The date when a constituent's involvement in an activity starts.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(StartOn startOn) {
        this.startOn = startOn;
    }

    public ConstituentInvolvements withStartOn(StartOn startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * The date when a constituent's involvement in an activity ends.
     * 
     */
    @JsonProperty("endOn")
    public EndOn getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * The date when a constituent's involvement in an activity ends.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(EndOn endOn) {
        this.endOn = endOn;
    }

    public ConstituentInvolvements withEndOn(EndOn endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the constituent's involvement in the activity.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the constituent's involvement in the activity.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public ConstituentInvolvements withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the constituent activity information.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the constituent activity information.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentInvolvements withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Class Year
     * <p>
     * A class year associated with the constituent's involvement in the activity.
     * 
     */
    @JsonProperty("classYear")
    public Object getClassYear() {
        return classYear;
    }

    /**
     * Class Year
     * <p>
     * A class year associated with the constituent's involvement in the activity.
     * 
     */
    @JsonProperty("classYear")
    public void setClassYear(Object classYear) {
        this.classYear = classYear;
    }

    public ConstituentInvolvements withClassYear(Object classYear) {
        this.classYear = classYear;
        return this;
    }

    /**
     * Responsible Person
     * <p>
     * The person who oversees the constituent's involvement with the activity.
     * 
     */
    @JsonProperty("responsiblePerson")
    public Object getResponsiblePerson() {
        return responsiblePerson;
    }

    /**
     * Responsible Person
     * <p>
     * The person who oversees the constituent's involvement with the activity.
     * 
     */
    @JsonProperty("responsiblePerson")
    public void setResponsiblePerson(Object responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public ConstituentInvolvements withResponsiblePerson(Object responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
        return this;
    }

    /**
     * Comment
     * <p>
     * A comment on the constituent's involvement in the activity.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * A comment on the constituent's involvement in the activity.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ConstituentInvolvements withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentInvolvements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
        sb.append(',');
        sb.append("activity");
        sb.append('=');
        sb.append(((this.activity == null)?"<null>":this.activity));
        sb.append(',');
        sb.append("participationType");
        sb.append('=');
        sb.append(((this.participationType == null)?"<null>":this.participationType));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("classYear");
        sb.append('=');
        sb.append(((this.classYear == null)?"<null>":this.classYear));
        sb.append(',');
        sb.append("responsiblePerson");
        sb.append('=');
        sb.append(((this.responsiblePerson == null)?"<null>":this.responsiblePerson));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.activity == null)? 0 :this.activity.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.responsiblePerson == null)? 0 :this.responsiblePerson.hashCode()));
        result = ((result* 31)+((this.participationType == null)? 0 :this.participationType.hashCode()));
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.classYear == null)? 0 :this.classYear.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentInvolvements) == false) {
            return false;
        }
        ConstituentInvolvements rhs = ((ConstituentInvolvements) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.activity == rhs.activity)||((this.activity!= null)&&this.activity.equals(rhs.activity))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.responsiblePerson == rhs.responsiblePerson)||((this.responsiblePerson!= null)&&this.responsiblePerson.equals(rhs.responsiblePerson))))&&((this.participationType == rhs.participationType)||((this.participationType!= null)&&this.participationType.equals(rhs.participationType))))&&((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.classYear == rhs.classYear)||((this.classYear!= null)&&this.classYear.equals(rhs.classYear))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
