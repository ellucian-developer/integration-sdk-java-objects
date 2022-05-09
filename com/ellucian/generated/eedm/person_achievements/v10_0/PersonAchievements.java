
package com.ellucian.generated.eedm.person_achievements.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Achievements
 * <p>
 * Awards or certificates that exemplify a person's achievements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "person",
    "issuedBy",
    "issuedOn",
    "expiresOn"
})
@Generated("jsonschema2pojo")
public class PersonAchievements {

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
     * The global identifier of the person achievement.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the person achievement.")
    private String id;
    /**
     * Title
     * <p>
     * The title of the achievement.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of the achievement.")
    private String title;
    /**
     * Person
     * <p>
     * The person who earned the achievement.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person who earned the achievement.")
    private Person person;
    /**
     * Issued By
     * <p>
     * The person who issued the achievement.
     * 
     */
    @JsonProperty("issuedBy")
    @JsonPropertyDescription("The person who issued the achievement.")
    private String issuedBy;
    /**
     * Issued On
     * <p>
     * The date when the achievement was issued.
     * 
     */
    @JsonProperty("issuedOn")
    @JsonPropertyDescription("The date when the achievement was issued.")
    private Object issuedOn;
    /**
     * Expires On
     * <p>
     * The date when the achievement expires.
     * 
     */
    @JsonProperty("expiresOn")
    @JsonPropertyDescription("The date when the achievement expires.")
    private Object expiresOn;

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

    public PersonAchievements withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person achievement.
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
     * The global identifier of the person achievement.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonAchievements withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The title of the achievement.
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
     * The title of the achievement.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PersonAchievements withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Person
     * <p>
     * The person who earned the achievement.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The person who earned the achievement.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonAchievements withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Issued By
     * <p>
     * The person who issued the achievement.
     * 
     */
    @JsonProperty("issuedBy")
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * Issued By
     * <p>
     * The person who issued the achievement.
     * 
     */
    @JsonProperty("issuedBy")
    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public PersonAchievements withIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
        return this;
    }

    /**
     * Issued On
     * <p>
     * The date when the achievement was issued.
     * 
     */
    @JsonProperty("issuedOn")
    public Object getIssuedOn() {
        return issuedOn;
    }

    /**
     * Issued On
     * <p>
     * The date when the achievement was issued.
     * 
     */
    @JsonProperty("issuedOn")
    public void setIssuedOn(Object issuedOn) {
        this.issuedOn = issuedOn;
    }

    public PersonAchievements withIssuedOn(Object issuedOn) {
        this.issuedOn = issuedOn;
        return this;
    }

    /**
     * Expires On
     * <p>
     * The date when the achievement expires.
     * 
     */
    @JsonProperty("expiresOn")
    public Object getExpiresOn() {
        return expiresOn;
    }

    /**
     * Expires On
     * <p>
     * The date when the achievement expires.
     * 
     */
    @JsonProperty("expiresOn")
    public void setExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
    }

    public PersonAchievements withExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonAchievements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("issuedBy");
        sb.append('=');
        sb.append(((this.issuedBy == null)?"<null>":this.issuedBy));
        sb.append(',');
        sb.append("issuedOn");
        sb.append('=');
        sb.append(((this.issuedOn == null)?"<null>":this.issuedOn));
        sb.append(',');
        sb.append("expiresOn");
        sb.append('=');
        sb.append(((this.expiresOn == null)?"<null>":this.expiresOn));
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
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.issuedBy == null)? 0 :this.issuedBy.hashCode()));
        result = ((result* 31)+((this.expiresOn == null)? 0 :this.expiresOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.issuedOn == null)? 0 :this.issuedOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonAchievements) == false) {
            return false;
        }
        PersonAchievements rhs = ((PersonAchievements) other);
        return ((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.issuedBy == rhs.issuedBy)||((this.issuedBy!= null)&&this.issuedBy.equals(rhs.issuedBy))))&&((this.expiresOn == rhs.expiresOn)||((this.expiresOn!= null)&&this.expiresOn.equals(rhs.expiresOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.issuedOn == rhs.issuedOn)||((this.issuedOn!= null)&&this.issuedOn.equals(rhs.issuedOn))));
    }

}
