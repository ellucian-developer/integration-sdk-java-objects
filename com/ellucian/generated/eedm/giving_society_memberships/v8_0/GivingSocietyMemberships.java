
package com.ellucian.generated.eedm.giving_society_memberships.v8_0;

import java.util.HashMap;
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
 * Giving Society Memberships
 * <p>
 * Association of constituent to a giving society.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "constituent",
    "recognitionLevel",
    "assignmentType",
    "authorizedBy",
    "authorizationReason",
    "qualifiedOn",
    "expiredOn",
    "renewalStatus"
})
@Generated("jsonschema2pojo")
public class GivingSocietyMemberships {

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
     * The global identifier of the giving society membership.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the giving society membership.")
    private String id;
    /**
     * Constituent
     * <p>
     * The constituent associated with the giving society.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The constituent associated with the giving society.")
    private Object constituent;
    /**
     * Recognition Level
     * <p>
     * The recognition level of the constituent within the giving society.
     * (Required)
     * 
     */
    @JsonProperty("recognitionLevel")
    @JsonPropertyDescription("The recognition level of the constituent within the giving society.")
    private RecognitionLevel recognitionLevel;
    /**
     * Assignment Type
     * <p>
     * The way the constituent was assigned to the recognition level within the giving society. (eg: manual, system)
     * (Required)
     * 
     */
    @JsonProperty("assignmentType")
    @JsonPropertyDescription("The way the constituent was assigned to the recognition level within the giving society. (eg: manual, system)")
    private GivingSocietyMemberships.AssignmentType assignmentType;
    /**
     * Authorized By
     * <p>
     * The person who authorized the manual assignment of the constituent to the recognition level.
     * 
     */
    @JsonProperty("authorizedBy")
    @JsonPropertyDescription("The person who authorized the manual assignment of the constituent to the recognition level.")
    private Object authorizedBy;
    /**
     * Authorization Reason
     * <p>
     * The reason for authorizing the manual assignment of the constituent to the recognition level.
     * 
     */
    @JsonProperty("authorizationReason")
    @JsonPropertyDescription("The reason for authorizing the manual assignment of the constituent to the recognition level.")
    private String authorizationReason;
    /**
     * Qualified On
     * <p>
     * The date when the constituent was first qualified for the membership within the recognition level.
     * 
     */
    @JsonProperty("qualifiedOn")
    @JsonPropertyDescription("The date when the constituent was first qualified for the membership within the recognition level.")
    private Object qualifiedOn;
    /**
     * Expired On
     * <p>
     * The date when the constituent's membership within the recognition level expired.
     * 
     */
    @JsonProperty("expiredOn")
    @JsonPropertyDescription("The date when the constituent's membership within the recognition level expired.")
    private Object expiredOn;
    /**
     * Renewal Status
     * <p>
     * The renewal status of the membership.
     * 
     */
    @JsonProperty("renewalStatus")
    @JsonPropertyDescription("The renewal status of the membership.")
    private Object renewalStatus;

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

    public GivingSocietyMemberships withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the giving society membership.
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
     * The global identifier of the giving society membership.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public GivingSocietyMemberships withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Constituent
     * <p>
     * The constituent associated with the giving society.
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
     * The constituent associated with the giving society.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public GivingSocietyMemberships withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    /**
     * Recognition Level
     * <p>
     * The recognition level of the constituent within the giving society.
     * (Required)
     * 
     */
    @JsonProperty("recognitionLevel")
    public RecognitionLevel getRecognitionLevel() {
        return recognitionLevel;
    }

    /**
     * Recognition Level
     * <p>
     * The recognition level of the constituent within the giving society.
     * (Required)
     * 
     */
    @JsonProperty("recognitionLevel")
    public void setRecognitionLevel(RecognitionLevel recognitionLevel) {
        this.recognitionLevel = recognitionLevel;
    }

    public GivingSocietyMemberships withRecognitionLevel(RecognitionLevel recognitionLevel) {
        this.recognitionLevel = recognitionLevel;
        return this;
    }

    /**
     * Assignment Type
     * <p>
     * The way the constituent was assigned to the recognition level within the giving society. (eg: manual, system)
     * (Required)
     * 
     */
    @JsonProperty("assignmentType")
    public GivingSocietyMemberships.AssignmentType getAssignmentType() {
        return assignmentType;
    }

    /**
     * Assignment Type
     * <p>
     * The way the constituent was assigned to the recognition level within the giving society. (eg: manual, system)
     * (Required)
     * 
     */
    @JsonProperty("assignmentType")
    public void setAssignmentType(GivingSocietyMemberships.AssignmentType assignmentType) {
        this.assignmentType = assignmentType;
    }

    public GivingSocietyMemberships withAssignmentType(GivingSocietyMemberships.AssignmentType assignmentType) {
        this.assignmentType = assignmentType;
        return this;
    }

    /**
     * Authorized By
     * <p>
     * The person who authorized the manual assignment of the constituent to the recognition level.
     * 
     */
    @JsonProperty("authorizedBy")
    public Object getAuthorizedBy() {
        return authorizedBy;
    }

    /**
     * Authorized By
     * <p>
     * The person who authorized the manual assignment of the constituent to the recognition level.
     * 
     */
    @JsonProperty("authorizedBy")
    public void setAuthorizedBy(Object authorizedBy) {
        this.authorizedBy = authorizedBy;
    }

    public GivingSocietyMemberships withAuthorizedBy(Object authorizedBy) {
        this.authorizedBy = authorizedBy;
        return this;
    }

    /**
     * Authorization Reason
     * <p>
     * The reason for authorizing the manual assignment of the constituent to the recognition level.
     * 
     */
    @JsonProperty("authorizationReason")
    public String getAuthorizationReason() {
        return authorizationReason;
    }

    /**
     * Authorization Reason
     * <p>
     * The reason for authorizing the manual assignment of the constituent to the recognition level.
     * 
     */
    @JsonProperty("authorizationReason")
    public void setAuthorizationReason(String authorizationReason) {
        this.authorizationReason = authorizationReason;
    }

    public GivingSocietyMemberships withAuthorizationReason(String authorizationReason) {
        this.authorizationReason = authorizationReason;
        return this;
    }

    /**
     * Qualified On
     * <p>
     * The date when the constituent was first qualified for the membership within the recognition level.
     * 
     */
    @JsonProperty("qualifiedOn")
    public Object getQualifiedOn() {
        return qualifiedOn;
    }

    /**
     * Qualified On
     * <p>
     * The date when the constituent was first qualified for the membership within the recognition level.
     * 
     */
    @JsonProperty("qualifiedOn")
    public void setQualifiedOn(Object qualifiedOn) {
        this.qualifiedOn = qualifiedOn;
    }

    public GivingSocietyMemberships withQualifiedOn(Object qualifiedOn) {
        this.qualifiedOn = qualifiedOn;
        return this;
    }

    /**
     * Expired On
     * <p>
     * The date when the constituent's membership within the recognition level expired.
     * 
     */
    @JsonProperty("expiredOn")
    public Object getExpiredOn() {
        return expiredOn;
    }

    /**
     * Expired On
     * <p>
     * The date when the constituent's membership within the recognition level expired.
     * 
     */
    @JsonProperty("expiredOn")
    public void setExpiredOn(Object expiredOn) {
        this.expiredOn = expiredOn;
    }

    public GivingSocietyMemberships withExpiredOn(Object expiredOn) {
        this.expiredOn = expiredOn;
        return this;
    }

    /**
     * Renewal Status
     * <p>
     * The renewal status of the membership.
     * 
     */
    @JsonProperty("renewalStatus")
    public Object getRenewalStatus() {
        return renewalStatus;
    }

    /**
     * Renewal Status
     * <p>
     * The renewal status of the membership.
     * 
     */
    @JsonProperty("renewalStatus")
    public void setRenewalStatus(Object renewalStatus) {
        this.renewalStatus = renewalStatus;
    }

    public GivingSocietyMemberships withRenewalStatus(Object renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GivingSocietyMemberships.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("recognitionLevel");
        sb.append('=');
        sb.append(((this.recognitionLevel == null)?"<null>":this.recognitionLevel));
        sb.append(',');
        sb.append("assignmentType");
        sb.append('=');
        sb.append(((this.assignmentType == null)?"<null>":this.assignmentType));
        sb.append(',');
        sb.append("authorizedBy");
        sb.append('=');
        sb.append(((this.authorizedBy == null)?"<null>":this.authorizedBy));
        sb.append(',');
        sb.append("authorizationReason");
        sb.append('=');
        sb.append(((this.authorizationReason == null)?"<null>":this.authorizationReason));
        sb.append(',');
        sb.append("qualifiedOn");
        sb.append('=');
        sb.append(((this.qualifiedOn == null)?"<null>":this.qualifiedOn));
        sb.append(',');
        sb.append("expiredOn");
        sb.append('=');
        sb.append(((this.expiredOn == null)?"<null>":this.expiredOn));
        sb.append(',');
        sb.append("renewalStatus");
        sb.append('=');
        sb.append(((this.renewalStatus == null)?"<null>":this.renewalStatus));
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
        result = ((result* 31)+((this.recognitionLevel == null)? 0 :this.recognitionLevel.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.authorizationReason == null)? 0 :this.authorizationReason.hashCode()));
        result = ((result* 31)+((this.authorizedBy == null)? 0 :this.authorizedBy.hashCode()));
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        result = ((result* 31)+((this.renewalStatus == null)? 0 :this.renewalStatus.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.expiredOn == null)? 0 :this.expiredOn.hashCode()));
        result = ((result* 31)+((this.assignmentType == null)? 0 :this.assignmentType.hashCode()));
        result = ((result* 31)+((this.qualifiedOn == null)? 0 :this.qualifiedOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GivingSocietyMemberships) == false) {
            return false;
        }
        GivingSocietyMemberships rhs = ((GivingSocietyMemberships) other);
        return (((((((((((this.recognitionLevel == rhs.recognitionLevel)||((this.recognitionLevel!= null)&&this.recognitionLevel.equals(rhs.recognitionLevel)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.authorizationReason == rhs.authorizationReason)||((this.authorizationReason!= null)&&this.authorizationReason.equals(rhs.authorizationReason))))&&((this.authorizedBy == rhs.authorizedBy)||((this.authorizedBy!= null)&&this.authorizedBy.equals(rhs.authorizedBy))))&&((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent))))&&((this.renewalStatus == rhs.renewalStatus)||((this.renewalStatus!= null)&&this.renewalStatus.equals(rhs.renewalStatus))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.expiredOn == rhs.expiredOn)||((this.expiredOn!= null)&&this.expiredOn.equals(rhs.expiredOn))))&&((this.assignmentType == rhs.assignmentType)||((this.assignmentType!= null)&&this.assignmentType.equals(rhs.assignmentType))))&&((this.qualifiedOn == rhs.qualifiedOn)||((this.qualifiedOn!= null)&&this.qualifiedOn.equals(rhs.qualifiedOn))));
    }


    /**
     * Assignment Type
     * <p>
     * The way the constituent was assigned to the recognition level within the giving society. (eg: manual, system)
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AssignmentType {

        MANUAL("manual"),
        SYSTEM("system");
        private final String value;
        private final static Map<String, GivingSocietyMemberships.AssignmentType> CONSTANTS = new HashMap<String, GivingSocietyMemberships.AssignmentType>();

        static {
            for (GivingSocietyMemberships.AssignmentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AssignmentType(String value) {
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
        public static GivingSocietyMemberships.AssignmentType fromValue(String value) {
            GivingSocietyMemberships.AssignmentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
