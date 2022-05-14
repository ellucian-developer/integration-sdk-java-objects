
package com.ellucian.generated.eedm.admission_application_reviews.v12_0;

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
 * Admission Application Reviews
 * <p>
 * Review of student applications.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "application",
    "reviewer",
    "status",
    "reviewedOn",
    "recommendedAction",
    "ratings",
    "comments"
})
@Generated("jsonschema2pojo")
public class AdmissionApplicationReviews {

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
     * The global identifier of the admission application review.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the admission application review.")
    private String id;
    /**
     * Application
     * <p>
     * The application reviewed.
     * (Required)
     * 
     */
    @JsonProperty("application")
    @JsonPropertyDescription("The application reviewed.")
    private Application application;
    /**
     * Reviewer
     * <p>
     * The individual or team that reviewed the application.
     * (Required)
     * 
     */
    @JsonProperty("reviewer")
    @JsonPropertyDescription("The individual or team that reviewed the application.")
    private Object reviewer;
    /**
     * Status
     * <p>
     * The review status of the application.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The review status of the application.")
    private AdmissionApplicationReviews.Status status;
    /**
     * Reviewed On
     * <p>
     * The date when the application was last reviewed.
     * 
     */
    @JsonProperty("reviewedOn")
    @JsonPropertyDescription("The date when the application was last reviewed.")
    private Object reviewedOn;
    /**
     * Recommended Action
     * <p>
     * The recommendations made by the reviewers for the application.
     * 
     */
    @JsonProperty("recommendedAction")
    @JsonPropertyDescription("The recommendations made by the reviewers for the application.")
    private Object recommendedAction;
    /**
     * Ratings
     * <p>
     * The ratings of the application.
     * 
     */
    @JsonProperty("ratings")
    @JsonPropertyDescription("The ratings of the application.")
    private List<Rating> ratings = new ArrayList<Rating>();
    /**
     * Comments
     * <p>
     * The comments associated with the application during review process.
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("The comments associated with the application during review process.")
    private List<Comment> comments = new ArrayList<Comment>();

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

    public AdmissionApplicationReviews withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the admission application review.
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
     * The global identifier of the admission application review.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionApplicationReviews withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Application
     * <p>
     * The application reviewed.
     * (Required)
     * 
     */
    @JsonProperty("application")
    public Application getApplication() {
        return application;
    }

    /**
     * Application
     * <p>
     * The application reviewed.
     * (Required)
     * 
     */
    @JsonProperty("application")
    public void setApplication(Application application) {
        this.application = application;
    }

    public AdmissionApplicationReviews withApplication(Application application) {
        this.application = application;
        return this;
    }

    /**
     * Reviewer
     * <p>
     * The individual or team that reviewed the application.
     * (Required)
     * 
     */
    @JsonProperty("reviewer")
    public Object getReviewer() {
        return reviewer;
    }

    /**
     * Reviewer
     * <p>
     * The individual or team that reviewed the application.
     * (Required)
     * 
     */
    @JsonProperty("reviewer")
    public void setReviewer(Object reviewer) {
        this.reviewer = reviewer;
    }

    public AdmissionApplicationReviews withReviewer(Object reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * Status
     * <p>
     * The review status of the application.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public AdmissionApplicationReviews.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The review status of the application.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(AdmissionApplicationReviews.Status status) {
        this.status = status;
    }

    public AdmissionApplicationReviews withStatus(AdmissionApplicationReviews.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Reviewed On
     * <p>
     * The date when the application was last reviewed.
     * 
     */
    @JsonProperty("reviewedOn")
    public Object getReviewedOn() {
        return reviewedOn;
    }

    /**
     * Reviewed On
     * <p>
     * The date when the application was last reviewed.
     * 
     */
    @JsonProperty("reviewedOn")
    public void setReviewedOn(Object reviewedOn) {
        this.reviewedOn = reviewedOn;
    }

    public AdmissionApplicationReviews withReviewedOn(Object reviewedOn) {
        this.reviewedOn = reviewedOn;
        return this;
    }

    /**
     * Recommended Action
     * <p>
     * The recommendations made by the reviewers for the application.
     * 
     */
    @JsonProperty("recommendedAction")
    public Object getRecommendedAction() {
        return recommendedAction;
    }

    /**
     * Recommended Action
     * <p>
     * The recommendations made by the reviewers for the application.
     * 
     */
    @JsonProperty("recommendedAction")
    public void setRecommendedAction(Object recommendedAction) {
        this.recommendedAction = recommendedAction;
    }

    public AdmissionApplicationReviews withRecommendedAction(Object recommendedAction) {
        this.recommendedAction = recommendedAction;
        return this;
    }

    /**
     * Ratings
     * <p>
     * The ratings of the application.
     * 
     */
    @JsonProperty("ratings")
    public List<Rating> getRatings() {
        return ratings;
    }

    /**
     * Ratings
     * <p>
     * The ratings of the application.
     * 
     */
    @JsonProperty("ratings")
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public AdmissionApplicationReviews withRatings(List<Rating> ratings) {
        this.ratings = ratings;
        return this;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the application during review process.
     * 
     */
    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * The comments associated with the application during review process.
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public AdmissionApplicationReviews withComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionApplicationReviews.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("application");
        sb.append('=');
        sb.append(((this.application == null)?"<null>":this.application));
        sb.append(',');
        sb.append("reviewer");
        sb.append('=');
        sb.append(((this.reviewer == null)?"<null>":this.reviewer));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("reviewedOn");
        sb.append('=');
        sb.append(((this.reviewedOn == null)?"<null>":this.reviewedOn));
        sb.append(',');
        sb.append("recommendedAction");
        sb.append('=');
        sb.append(((this.recommendedAction == null)?"<null>":this.recommendedAction));
        sb.append(',');
        sb.append("ratings");
        sb.append('=');
        sb.append(((this.ratings == null)?"<null>":this.ratings));
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
        result = ((result* 31)+((this.recommendedAction == null)? 0 :this.recommendedAction.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.application == null)? 0 :this.application.hashCode()));
        result = ((result* 31)+((this.reviewedOn == null)? 0 :this.reviewedOn.hashCode()));
        result = ((result* 31)+((this.ratings == null)? 0 :this.ratings.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.reviewer == null)? 0 :this.reviewer.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionApplicationReviews) == false) {
            return false;
        }
        AdmissionApplicationReviews rhs = ((AdmissionApplicationReviews) other);
        return ((((((((((this.recommendedAction == rhs.recommendedAction)||((this.recommendedAction!= null)&&this.recommendedAction.equals(rhs.recommendedAction)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.application == rhs.application)||((this.application!= null)&&this.application.equals(rhs.application))))&&((this.reviewedOn == rhs.reviewedOn)||((this.reviewedOn!= null)&&this.reviewedOn.equals(rhs.reviewedOn))))&&((this.ratings == rhs.ratings)||((this.ratings!= null)&&this.ratings.equals(rhs.ratings))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.reviewer == rhs.reviewer)||((this.reviewer!= null)&&this.reviewer.equals(rhs.reviewer))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The review status of the application.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        NOT_STARTED("notStarted"),
        EARLY_READ("earlyRead"),
        IN_PROGRESS("inProgress"),
        COMPLETED("completed");
        private final String value;
        private final static Map<String, AdmissionApplicationReviews.Status> CONSTANTS = new HashMap<String, AdmissionApplicationReviews.Status>();

        static {
            for (AdmissionApplicationReviews.Status c: values()) {
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
        public static AdmissionApplicationReviews.Status fromValue(String value) {
            AdmissionApplicationReviews.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
