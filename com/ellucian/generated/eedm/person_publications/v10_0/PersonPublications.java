
package com.ellucian.generated.eedm.person_publications.v10_0;

import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Publications
 * <p>
 * Publications (e.g. journal, research papers, etc) published by individuals.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "person",
    "type",
    "publishedOn",
    "publisher",
    "issue",
    "volume",
    "pageRange"
})
@Generated("jsonschema2pojo")
public class PersonPublications {

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
     * The global identifier of the person publication.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the person publication.")
    private String id;
    /**
     * Title
     * <p>
     * The title of the publication.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of the publication.")
    private String title;
    /**
     * Person
     * <p>
     * The person who authored or contributed to the publication.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person who authored or contributed to the publication.")
    private Person person;
    /**
     * Type
     * <p>
     * The type of publication (e.g. newspaper, journal, etc).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of publication (e.g. newspaper, journal, etc).")
    private Type type;
    /**
     * Published On
     * <p>
     * The date on which the publication was published.
     * 
     */
    @JsonProperty("publishedOn")
    @JsonPropertyDescription("The date on which the publication was published.")
    private Object publishedOn;
    /**
     * Publisher
     * <p>
     * The name of the publisher.
     * 
     */
    @JsonProperty("publisher")
    @JsonPropertyDescription("The name of the publisher.")
    private String publisher;
    /**
     * Issue
     * <p>
     * The issue of the publication, typically refers to how many times the publication has been published during that year.
     * 
     */
    @JsonProperty("issue")
    @JsonPropertyDescription("The issue of the publication, typically refers to how many times the publication has been published during that year.")
    private String issue;
    /**
     * Volume
     * <p>
     * The volume of the publication.
     * 
     */
    @JsonProperty("volume")
    @JsonPropertyDescription("The volume of the publication.")
    private String volume;
    /**
     * PageRange
     * <p>
     * The page reference range(s) of the publication.
     * 
     */
    @JsonProperty("pageRange")
    @JsonPropertyDescription("The page reference range(s) of the publication.")
    private String pageRange;

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

    public PersonPublications withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the person publication.
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
     * The global identifier of the person publication.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonPublications withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The title of the publication.
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
     * The title of the publication.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PersonPublications withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Person
     * <p>
     * The person who authored or contributed to the publication.
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
     * The person who authored or contributed to the publication.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonPublications withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of publication (e.g. newspaper, journal, etc).
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
     * The type of publication (e.g. newspaper, journal, etc).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public PersonPublications withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Published On
     * <p>
     * The date on which the publication was published.
     * 
     */
    @JsonProperty("publishedOn")
    public Object getPublishedOn() {
        return publishedOn;
    }

    /**
     * Published On
     * <p>
     * The date on which the publication was published.
     * 
     */
    @JsonProperty("publishedOn")
    public void setPublishedOn(Object publishedOn) {
        this.publishedOn = publishedOn;
    }

    public PersonPublications withPublishedOn(Object publishedOn) {
        this.publishedOn = publishedOn;
        return this;
    }

    /**
     * Publisher
     * <p>
     * The name of the publisher.
     * 
     */
    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    /**
     * Publisher
     * <p>
     * The name of the publisher.
     * 
     */
    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public PersonPublications withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Issue
     * <p>
     * The issue of the publication, typically refers to how many times the publication has been published during that year.
     * 
     */
    @JsonProperty("issue")
    public String getIssue() {
        return issue;
    }

    /**
     * Issue
     * <p>
     * The issue of the publication, typically refers to how many times the publication has been published during that year.
     * 
     */
    @JsonProperty("issue")
    public void setIssue(String issue) {
        this.issue = issue;
    }

    public PersonPublications withIssue(String issue) {
        this.issue = issue;
        return this;
    }

    /**
     * Volume
     * <p>
     * The volume of the publication.
     * 
     */
    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    /**
     * Volume
     * <p>
     * The volume of the publication.
     * 
     */
    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    public PersonPublications withVolume(String volume) {
        this.volume = volume;
        return this;
    }

    /**
     * PageRange
     * <p>
     * The page reference range(s) of the publication.
     * 
     */
    @JsonProperty("pageRange")
    public String getPageRange() {
        return pageRange;
    }

    /**
     * PageRange
     * <p>
     * The page reference range(s) of the publication.
     * 
     */
    @JsonProperty("pageRange")
    public void setPageRange(String pageRange) {
        this.pageRange = pageRange;
    }

    public PersonPublications withPageRange(String pageRange) {
        this.pageRange = pageRange;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonPublications.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("publishedOn");
        sb.append('=');
        sb.append(((this.publishedOn == null)?"<null>":this.publishedOn));
        sb.append(',');
        sb.append("publisher");
        sb.append('=');
        sb.append(((this.publisher == null)?"<null>":this.publisher));
        sb.append(',');
        sb.append("issue");
        sb.append('=');
        sb.append(((this.issue == null)?"<null>":this.issue));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("pageRange");
        sb.append('=');
        sb.append(((this.pageRange == null)?"<null>":this.pageRange));
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
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.pageRange == null)? 0 :this.pageRange.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.issue == null)? 0 :this.issue.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.publishedOn == null)? 0 :this.publishedOn.hashCode()));
        result = ((result* 31)+((this.publisher == null)? 0 :this.publisher.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonPublications) == false) {
            return false;
        }
        PersonPublications rhs = ((PersonPublications) other);
        return (((((((((((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume)))&&((this.pageRange == rhs.pageRange)||((this.pageRange!= null)&&this.pageRange.equals(rhs.pageRange))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.issue == rhs.issue)||((this.issue!= null)&&this.issue.equals(rhs.issue))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.publishedOn == rhs.publishedOn)||((this.publishedOn!= null)&&this.publishedOn.equals(rhs.publishedOn))))&&((this.publisher == rhs.publisher)||((this.publisher!= null)&&this.publisher.equals(rhs.publisher))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
