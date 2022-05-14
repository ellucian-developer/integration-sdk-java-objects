
package com.ellucian.generated.eedm.personal_relationship_types.v7_0;

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
 * Personal Relationship Types
 * <p>
 * A type of relationship between people.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "relationshipType",
    "validReciprocalRelationships",
    "code"
})
@Generated("jsonschema2pojo")
public class PersonalRelationshipTypes {

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
     * The global identifier of the personal relationship type
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the personal relationship type")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the personal relationship type
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the personal relationship type")
    private String title;
    /**
     * Description
     * <p>
     * The full description of the personal  relationship type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The full description of the personal  relationship type")
    private String description;
    /**
     * Personal Relationship Type
     * <p>
     * Type of relationships between two people
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    @JsonPropertyDescription("Type of relationships between two people")
    private PersonalRelationshipTypes.RelationshipType relationshipType;
    /**
     * Valid Reciprocal Relationships
     * <p>
     * Valid reciprocal relationships that a direct relationship of a person can have.
     * 
     */
    @JsonProperty("validReciprocalRelationships")
    @JsonPropertyDescription("Valid reciprocal relationships that a direct relationship of a person can have.")
    private List<ValidReciprocalRelationship> validReciprocalRelationships = new ArrayList<ValidReciprocalRelationship>();
    /**
     * Code
     * <p>
     * The code of the personal  relationship type.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code of the personal  relationship type.")
    private String code;

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

    public PersonalRelationshipTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the personal relationship type
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
     * The global identifier of the personal relationship type
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonalRelationshipTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the personal relationship type
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
     * The full name of the personal relationship type
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PersonalRelationshipTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The full description of the personal  relationship type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The full description of the personal  relationship type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PersonalRelationshipTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Personal Relationship Type
     * <p>
     * Type of relationships between two people
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    public PersonalRelationshipTypes.RelationshipType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Personal Relationship Type
     * <p>
     * Type of relationships between two people
     * (Required)
     * 
     */
    @JsonProperty("relationshipType")
    public void setRelationshipType(PersonalRelationshipTypes.RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    public PersonalRelationshipTypes withRelationshipType(PersonalRelationshipTypes.RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    /**
     * Valid Reciprocal Relationships
     * <p>
     * Valid reciprocal relationships that a direct relationship of a person can have.
     * 
     */
    @JsonProperty("validReciprocalRelationships")
    public List<ValidReciprocalRelationship> getValidReciprocalRelationships() {
        return validReciprocalRelationships;
    }

    /**
     * Valid Reciprocal Relationships
     * <p>
     * Valid reciprocal relationships that a direct relationship of a person can have.
     * 
     */
    @JsonProperty("validReciprocalRelationships")
    public void setValidReciprocalRelationships(List<ValidReciprocalRelationship> validReciprocalRelationships) {
        this.validReciprocalRelationships = validReciprocalRelationships;
    }

    public PersonalRelationshipTypes withValidReciprocalRelationships(List<ValidReciprocalRelationship> validReciprocalRelationships) {
        this.validReciprocalRelationships = validReciprocalRelationships;
        return this;
    }

    /**
     * Code
     * <p>
     * The code of the personal  relationship type.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code of the personal  relationship type.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public PersonalRelationshipTypes withCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonalRelationshipTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("relationshipType");
        sb.append('=');
        sb.append(((this.relationshipType == null)?"<null>":this.relationshipType));
        sb.append(',');
        sb.append("validReciprocalRelationships");
        sb.append('=');
        sb.append(((this.validReciprocalRelationships == null)?"<null>":this.validReciprocalRelationships));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
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
        result = ((result* 31)+((this.relationshipType == null)? 0 :this.relationshipType.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.validReciprocalRelationships == null)? 0 :this.validReciprocalRelationships.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonalRelationshipTypes) == false) {
            return false;
        }
        PersonalRelationshipTypes rhs = ((PersonalRelationshipTypes) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.relationshipType == rhs.relationshipType)||((this.relationshipType!= null)&&this.relationshipType.equals(rhs.relationshipType))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.validReciprocalRelationships == rhs.validReciprocalRelationships)||((this.validReciprocalRelationships!= null)&&this.validReciprocalRelationships.equals(rhs.validReciprocalRelationships))));
    }


    /**
     * Personal Relationship Type
     * <p>
     * Type of relationships between two people
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RelationshipType {

        PARENT("parent"),
        STEP_PARENT("stepParent"),
        MOTHER("mother"),
        STEP_MOTHER("stepMother"),
        FATHER("father"),
        STEP_FATHER("stepFather"),
        CHILD("child"),
        STEP_CHILD("stepChild"),
        DAUGHTER("daughter"),
        STEP_DAUGHTER("stepDaughter"),
        SON("son"),
        STEP_SON("stepSon"),
        SIBLING("sibling"),
        STEP_SIBLING("stepSibling"),
        BROTHER("brother"),
        STEP_BROTHER("stepBrother"),
        SISTER("sister"),
        STEP_SISTER("stepSister"),
        SPOUSE("spouse"),
        WIFE("wife"),
        PARTNER("partner"),
        GRAND_PARENT("grandParent"),
        GRAND_MOTHER("grandMother"),
        GRAND_FATHER("grandFather"),
        GRAND_CHILD("grandChild"),
        GRAND_DAUGHTER("grandDaughter"),
        GRAND_SON("grandSon"),
        PARENT_IN_LAW("parentInLaw"),
        MOTHER_IN_LAW("motherInLaw"),
        FATHER_IN_LAW("fatherInLaw"),
        CHILD_IN_LAW("childInLaw"),
        DAUGHTER_IN_LAW("daughterInLaw"),
        SON_IN_LAW("sonInLaw"),
        SIBLING_IN_LAW("siblingInLaw"),
        SISTER_IN_LAW("sisterInLaw"),
        BROTHER_IN_LAW("brotherInLaw"),
        SIBLING_OF_PARENT("siblingOfParent"),
        AUNT("aunt"),
        UNCLE("uncle"),
        CHILD_OF_SIBLING("childOfSibling"),
        NIECE("niece"),
        NEPHEW("nephew"),
        COUSIN("cousin"),
        FRIEND("friend"),
        RELATIVE("relative"),
        COWORKER("coworker"),
        NEIGHBOR("neighbor"),
        CLASSMATE("classmate"),
        CAREGIVER("caregiver"),
        OTHER("other"),
        HUSBAND("husband");
        private final String value;
        private final static Map<String, PersonalRelationshipTypes.RelationshipType> CONSTANTS = new HashMap<String, PersonalRelationshipTypes.RelationshipType>();

        static {
            for (PersonalRelationshipTypes.RelationshipType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RelationshipType(String value) {
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
        public static PersonalRelationshipTypes.RelationshipType fromValue(String value) {
            PersonalRelationshipTypes.RelationshipType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
