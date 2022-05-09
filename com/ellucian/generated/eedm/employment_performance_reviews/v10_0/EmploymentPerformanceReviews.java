
package com.ellucian.generated.eedm.employment_performance_reviews.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Employment Performance Reviews
 * <p>
 * Information about employees' performance reviews.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "job",
    "dueOn",
    "completedOn",
    "type",
    "reviewedBy",
    "rating",
    "comment"
})
@Generated("jsonschema2pojo")
public class EmploymentPerformanceReviews {

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
     * The global identifier of the employment performance review.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the employment performance review.")
    private String id;
    /**
     * Person
     * <p>
     * The employee who is the subject of the performance review.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The employee who is the subject of the performance review.")
    private Person person;
    /**
     * Job
     * <p>
     * The job for which the person's performance was reviewed.
     * 
     */
    @JsonProperty("job")
    @JsonPropertyDescription("The job for which the person's performance was reviewed.")
    private Object job;
    /**
     * Due On
     * <p>
     * The date by which the review must be completed.
     * 
     */
    @JsonProperty("dueOn")
    @JsonPropertyDescription("The date by which the review must be completed.")
    private Object dueOn;
    /**
     * Completed On
     * <p>
     * The date when the review was completed.
     * 
     */
    @JsonProperty("completedOn")
    @JsonPropertyDescription("The date when the review was completed.")
    private Object completedOn;
    /**
     * Type
     * <p>
     * The type of the performance review.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the performance review.")
    private Type type;
    /**
     * Reviewed By
     * <p>
     * The person conducting the performance review.
     * 
     */
    @JsonProperty("reviewedBy")
    @JsonPropertyDescription("The person conducting the performance review.")
    private Object reviewedBy;
    /**
     * Rating
     * <p>
     * The rating given in the performance review.
     * 
     */
    @JsonProperty("rating")
    @JsonPropertyDescription("The rating given in the performance review.")
    private Rating rating;
    /**
     * Comment
     * <p>
     * Any comments associated with the performance review.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Any comments associated with the performance review.")
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

    public EmploymentPerformanceReviews withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the employment performance review.
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
     * The global identifier of the employment performance review.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmploymentPerformanceReviews withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The employee who is the subject of the performance review.
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
     * The employee who is the subject of the performance review.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public EmploymentPerformanceReviews withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Job
     * <p>
     * The job for which the person's performance was reviewed.
     * 
     */
    @JsonProperty("job")
    public Object getJob() {
        return job;
    }

    /**
     * Job
     * <p>
     * The job for which the person's performance was reviewed.
     * 
     */
    @JsonProperty("job")
    public void setJob(Object job) {
        this.job = job;
    }

    public EmploymentPerformanceReviews withJob(Object job) {
        this.job = job;
        return this;
    }

    /**
     * Due On
     * <p>
     * The date by which the review must be completed.
     * 
     */
    @JsonProperty("dueOn")
    public Object getDueOn() {
        return dueOn;
    }

    /**
     * Due On
     * <p>
     * The date by which the review must be completed.
     * 
     */
    @JsonProperty("dueOn")
    public void setDueOn(Object dueOn) {
        this.dueOn = dueOn;
    }

    public EmploymentPerformanceReviews withDueOn(Object dueOn) {
        this.dueOn = dueOn;
        return this;
    }

    /**
     * Completed On
     * <p>
     * The date when the review was completed.
     * 
     */
    @JsonProperty("completedOn")
    public Object getCompletedOn() {
        return completedOn;
    }

    /**
     * Completed On
     * <p>
     * The date when the review was completed.
     * 
     */
    @JsonProperty("completedOn")
    public void setCompletedOn(Object completedOn) {
        this.completedOn = completedOn;
    }

    public EmploymentPerformanceReviews withCompletedOn(Object completedOn) {
        this.completedOn = completedOn;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the performance review.
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
     * The type of the performance review.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public EmploymentPerformanceReviews withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Reviewed By
     * <p>
     * The person conducting the performance review.
     * 
     */
    @JsonProperty("reviewedBy")
    public Object getReviewedBy() {
        return reviewedBy;
    }

    /**
     * Reviewed By
     * <p>
     * The person conducting the performance review.
     * 
     */
    @JsonProperty("reviewedBy")
    public void setReviewedBy(Object reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public EmploymentPerformanceReviews withReviewedBy(Object reviewedBy) {
        this.reviewedBy = reviewedBy;
        return this;
    }

    /**
     * Rating
     * <p>
     * The rating given in the performance review.
     * 
     */
    @JsonProperty("rating")
    public Rating getRating() {
        return rating;
    }

    /**
     * Rating
     * <p>
     * The rating given in the performance review.
     * 
     */
    @JsonProperty("rating")
    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public EmploymentPerformanceReviews withRating(Rating rating) {
        this.rating = rating;
        return this;
    }

    /**
     * Comment
     * <p>
     * Any comments associated with the performance review.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Any comments associated with the performance review.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public EmploymentPerformanceReviews withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmploymentPerformanceReviews.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("job");
        sb.append('=');
        sb.append(((this.job == null)?"<null>":this.job));
        sb.append(',');
        sb.append("dueOn");
        sb.append('=');
        sb.append(((this.dueOn == null)?"<null>":this.dueOn));
        sb.append(',');
        sb.append("completedOn");
        sb.append('=');
        sb.append(((this.completedOn == null)?"<null>":this.completedOn));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("reviewedBy");
        sb.append('=');
        sb.append(((this.reviewedBy == null)?"<null>":this.reviewedBy));
        sb.append(',');
        sb.append("rating");
        sb.append('=');
        sb.append(((this.rating == null)?"<null>":this.rating));
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
        result = ((result* 31)+((this.dueOn == null)? 0 :this.dueOn.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.completedOn == null)? 0 :this.completedOn.hashCode()));
        result = ((result* 31)+((this.rating == null)? 0 :this.rating.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.job == null)? 0 :this.job.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.reviewedBy == null)? 0 :this.reviewedBy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmploymentPerformanceReviews) == false) {
            return false;
        }
        EmploymentPerformanceReviews rhs = ((EmploymentPerformanceReviews) other);
        return (((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.dueOn == rhs.dueOn)||((this.dueOn!= null)&&this.dueOn.equals(rhs.dueOn))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.completedOn == rhs.completedOn)||((this.completedOn!= null)&&this.completedOn.equals(rhs.completedOn))))&&((this.rating == rhs.rating)||((this.rating!= null)&&this.rating.equals(rhs.rating))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.job == rhs.job)||((this.job!= null)&&this.job.equals(rhs.job))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.reviewedBy == rhs.reviewedBy)||((this.reviewedBy!= null)&&this.reviewedBy.equals(rhs.reviewedBy))));
    }

}
